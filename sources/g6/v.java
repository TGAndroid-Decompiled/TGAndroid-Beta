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
import m.p3;
public final class v extends n6.g {
    public static final b f7409n0 = new b("CastClientImpl", null);
    public static final Object f7410o0 = new Object();
    public static final Object f7411p0 = new Object();
    public c6.d U;
    public final CastDevice V;
    public final d0 W;
    public final HashMap X;
    public final long Y;
    public final Bundle Z;
    public u f7412a0;
    public String f7413b0;
    public boolean f7414c0;
    public boolean f7415d0;
    public boolean f7416e0;
    public double f7417f0;
    public c6.x f7418g0;
    public int f7419h0;
    public int f7420i0;
    public String f7421j0;
    public String f7422k0;
    public Bundle f7423l0;
    public final HashMap m0;

    public v(Context context, Looper looper, p3 p3Var, CastDevice castDevice, long j10, d0 d0Var, Bundle bundle, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 10, p3Var, kVar, lVar, 0);
        this.V = castDevice;
        this.W = d0Var;
        this.Y = j10;
        this.Z = bundle;
        this.X = new HashMap();
        new AtomicLong(0L);
        this.m0 = new HashMap();
        this.f7419h0 = -1;
        this.f7420i0 = -1;
        this.U = null;
        this.f7413b0 = null;
        this.f7417f0 = 0.0d;
        J();
        this.f7414c0 = false;
        this.f7418g0 = null;
        J();
    }

    public static void H(v vVar, long j10, int i10) {
        com.google.android.gms.common.api.internal.f fVar;
        synchronized (vVar.m0) {
            fVar = (com.google.android.gms.common.api.internal.f) vVar.m0.remove(Long.valueOf(j10));
        }
        if (fVar != null) {
            fVar.a(new Status(i10, null, null, null));
        }
    }

    @Override
    public final void A(k6.a aVar) {
        super.A(aVar);
        I();
    }

    @Override
    public final void C(int i10, IBinder iBinder, Bundle bundle, int i11) {
        f7409n0.b("in onPostInitHandler; statusCode=%d", Integer.valueOf(i10));
        if (i10 == 0 || i10 == 2300) {
            this.f7415d0 = true;
            this.f7416e0 = true;
        }
        if (i10 == 2300) {
            Bundle bundle2 = new Bundle();
            this.f7423l0 = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i10 = 0;
        }
        super.C(i10, iBinder, bundle, i11);
    }

    public final void I() {
        f7409n0.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.X) {
            this.X.clear();
        }
    }

    public final void J() {
        CastDevice castDevice = this.V;
        n6.l.h(castDevice, "device should not be null");
        if (!castDevice.c(2048) && castDevice.c(4) && !castDevice.c(1)) {
            "Chromecast Audio".equals(castDevice.e);
        }
    }

    @Override
    public final void j() {
        Object[] objArr = {this.f7412a0, Boolean.valueOf(k())};
        b bVar = f7409n0;
        bVar.b("disconnect(); ServiceListener=%s, isConnected=%b", objArr);
        u uVar = this.f7412a0;
        v vVar = null;
        this.f7412a0 = null;
        if (uVar != null) {
            v vVar2 = (v) uVar.f7407b.getAndSet(null);
            if (vVar2 != null) {
                vVar2.f7419h0 = -1;
                vVar2.f7420i0 = -1;
                vVar2.U = null;
                vVar2.f7413b0 = null;
                vVar2.f7417f0 = 0.0d;
                vVar2.J();
                vVar2.f7414c0 = false;
                vVar2.f7418g0 = null;
                vVar = vVar2;
            }
            if (vVar != null) {
                I();
                try {
                    try {
                        ((f) v()).X0();
                    } finally {
                        super.j();
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
    public final int m() {
        return 12800000;
    }

    @Override
    public final IInterface r(IBinder iBinder) {
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
    public final Bundle t() {
        Bundle bundle = this.f7423l0;
        if (bundle == null) {
            return null;
        }
        this.f7423l0 = null;
        return bundle;
    }

    @Override
    public final Bundle u() {
        Bundle bundle = new Bundle();
        f7409n0.b("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.f7421j0, this.f7422k0);
        CastDevice castDevice = this.V;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.Y);
        Bundle bundle2 = this.Z;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        u uVar = new u(this);
        this.f7412a0 = uVar;
        bundle.putParcelable("listener", new BinderWrapper(uVar));
        String str = this.f7421j0;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.f7422k0;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override
    public final String w() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override
    public final String x() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }
}
