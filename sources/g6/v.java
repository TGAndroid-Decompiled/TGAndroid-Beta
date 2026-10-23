package g6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import d6.d0;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import m.s3;
public final class v extends n6.g {
    public static final b f10902n0 = new b("CastClientImpl", null);
    public static final Object f10903o0 = new Object();
    public static final Object f10904p0 = new Object();
    public c6.d U;
    public final CastDevice V;
    public final d0 W;
    public final HashMap X;
    public final long Y;
    public final Bundle Z;
    public u f10905a0;
    public String f10906b0;
    public boolean f10907c0;
    public boolean f10908d0;
    public boolean f10909e0;
    public double f10910f0;
    public c6.x f10911g0;
    public int f10912h0;
    public int f10913i0;
    public String f10914j0;
    public String f10915k0;
    public Bundle f10916l0;
    public final HashMap m0;

    public v(Context context, Looper looper, s3 s3Var, CastDevice castDevice, long j10, d0 d0Var, Bundle bundle, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 10, s3Var, kVar, lVar, 0);
        this.V = castDevice;
        this.W = d0Var;
        this.Y = j10;
        this.Z = bundle;
        this.X = new HashMap();
        new AtomicLong(0L);
        this.m0 = new HashMap();
        this.f10912h0 = -1;
        this.f10913i0 = -1;
        this.U = null;
        this.f10906b0 = null;
        this.f10910f0 = 0.0d;
        I();
        this.f10907c0 = false;
        this.f10911g0 = null;
        I();
    }

    public static void G(v vVar, long j10, int i10) {
        com.google.android.gms.common.api.internal.f fVar;
        synchronized (vVar.m0) {
            fVar = (com.google.android.gms.common.api.internal.f) vVar.m0.remove(Long.valueOf(j10));
        }
        if (fVar != null) {
            fVar.a(new Status(i10, null, null, null));
        }
    }

    @Override
    public final void B(int i10, IBinder iBinder, Bundle bundle, int i11) {
        f10902n0.b("in onPostInitHandler; statusCode=%d", Integer.valueOf(i10));
        if (i10 == 0 || i10 == 2300) {
            this.f10908d0 = true;
            this.f10909e0 = true;
        }
        if (i10 == 2300) {
            Bundle bundle2 = new Bundle();
            this.f10916l0 = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i10 = 0;
        }
        super.B(i10, iBinder, bundle, i11);
    }

    public final void H() {
        f10902n0.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.X) {
            this.X.clear();
        }
    }

    public final void I() {
        CastDevice castDevice = this.V;
        n6.l.i(castDevice, "device should not be null");
        if (!castDevice.c(2048) && castDevice.c(4) && !castDevice.c(1)) {
            "Chromecast Audio".equals(castDevice.e);
        }
    }

    @Override
    public final void disconnect() {
        Object[] objArr = {this.f10905a0, Boolean.valueOf(j())};
        b bVar = f10902n0;
        bVar.b("disconnect(); ServiceListener=%s, isConnected=%b", objArr);
        u uVar = this.f10905a0;
        v vVar = null;
        this.f10905a0 = null;
        if (uVar != null) {
            v vVar2 = (v) uVar.f10900b.getAndSet(null);
            if (vVar2 != null) {
                vVar2.f10912h0 = -1;
                vVar2.f10913i0 = -1;
                vVar2.U = null;
                vVar2.f10906b0 = null;
                vVar2.f10910f0 = 0.0d;
                vVar2.I();
                vVar2.f10907c0 = false;
                vVar2.f10911g0 = null;
                vVar = vVar2;
            }
            if (vVar != null) {
                H();
                try {
                    try {
                        ((f) u()).V0();
                    } finally {
                        super.disconnect();
                    }
                } catch (RemoteException | IllegalStateException e) {
                    bVar.a(e, "Error while disconnecting the controller interface", new Object[0]);
                }
                return;
            }
        }
        bVar.b("already disposed, so short-circuiting", new Object[0]);
    }

    @Override
    public final int l() {
        return 12800000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof f) {
            return (f) queryLocalInterface;
        }
        return new f(iBinder);
    }

    @Override
    public final Bundle s() {
        Bundle bundle = this.f10916l0;
        if (bundle == null) {
            return null;
        }
        this.f10916l0 = null;
        return bundle;
    }

    @Override
    public final Bundle t() {
        Bundle bundle = new Bundle();
        f10902n0.b("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.f10914j0, this.f10915k0);
        CastDevice castDevice = this.V;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.Y);
        Bundle bundle2 = this.Z;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        u uVar = new u(this);
        this.f10905a0 = uVar;
        bundle.putParcelable("listener", new BinderWrapper(uVar));
        String str = this.f10914j0;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.f10915k0;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override
    public final void z(k6.a aVar) {
        super.z(aVar);
        H();
    }
}
