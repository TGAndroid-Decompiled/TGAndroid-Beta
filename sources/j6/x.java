package j6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import g6.d0;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
public final class x extends q6.h {
    public static final b Y = new b("CastClientImpl", null);
    public static final Object Z = new Object();
    public static final Object f17382a0 = new Object();
    public f6.d F;
    public final CastDevice G;
    public final d0 H;
    public final HashMap I;
    public final long J;
    public final Bundle K;
    public w L;
    public String M;
    public boolean N;
    public boolean O;
    public boolean P;
    public double Q;
    public f6.x R;
    public int S;
    public int T;
    public String U;
    public String V;
    public Bundle W;
    public final HashMap X;

    public x(Context context, Looper looper, ga.d dVar, CastDevice castDevice, long j3, d0 d0Var, Bundle bundle, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 10, dVar, kVar, lVar, 0);
        this.G = castDevice;
        this.H = d0Var;
        this.J = j3;
        this.K = bundle;
        this.I = new HashMap();
        new AtomicLong(0L);
        this.X = new HashMap();
        this.S = -1;
        this.T = -1;
        this.F = null;
        this.M = null;
        this.Q = 0.0d;
        D();
        this.N = false;
        this.R = null;
        D();
    }

    public static void B(x xVar, long j3, int i7) {
        com.google.android.gms.common.api.internal.e eVar;
        synchronized (xVar.X) {
            eVar = (com.google.android.gms.common.api.internal.e) xVar.X.remove(Long.valueOf(j3));
        }
        if (eVar != null) {
            eVar.a(new Status(i7, null, null, null));
        }
    }

    public final void C() {
        Y.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.I) {
            this.I.clear();
        }
    }

    public final void D() {
        CastDevice castDevice = this.G;
        q6.m.i(castDevice, "device should not be null");
        if (!castDevice.c(2048) && castDevice.c(4) && !castDevice.c(1)) {
            "Chromecast Audio".equals(castDevice.f6141e);
        }
    }

    @Override
    public final void a() {
        Object[] objArr = {this.L, Boolean.valueOf(s())};
        b bVar = Y;
        bVar.b("disconnect(); ServiceListener=%s, isConnected=%b", objArr);
        w wVar = this.L;
        x xVar = null;
        this.L = null;
        if (wVar != null) {
            x xVar2 = (x) wVar.f17380b.getAndSet(null);
            if (xVar2 != null) {
                xVar2.S = -1;
                xVar2.T = -1;
                xVar2.F = null;
                xVar2.M = null;
                xVar2.Q = 0.0d;
                xVar2.D();
                xVar2.N = false;
                xVar2.R = null;
                xVar = xVar2;
            }
            if (xVar != null) {
                C();
                try {
                    try {
                        ((f) n()).x1();
                    } finally {
                        super.a();
                    }
                } catch (RemoteException | IllegalStateException e10) {
                    bVar.a(e10, "Error while disconnecting the controller interface", new Object[0]);
                }
                return;
            }
        }
        bVar.b("already disposed, so short-circuiting", new Object[0]);
    }

    @Override
    public final int d() {
        return 12800000;
    }

    @Override
    public final IInterface i(IBinder iBinder) {
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
    public final Bundle l() {
        Bundle bundle = this.W;
        if (bundle == null) {
            return null;
        }
        this.W = null;
        return bundle;
    }

    @Override
    public final Bundle m() {
        Bundle bundle = new Bundle();
        Y.b("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.U, this.V);
        CastDevice castDevice = this.G;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.J);
        Bundle bundle2 = this.K;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        w wVar = new w(this);
        this.L = wVar;
        bundle.putParcelable("listener", new BinderWrapper(wVar));
        String str = this.U;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.V;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override
    public final String o() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override
    public final String p() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override
    public final void u(n6.a aVar) {
        super.u(aVar);
        C();
    }

    @Override
    public final void w(int i7, IBinder iBinder, Bundle bundle, int i10) {
        Y.b("in onPostInitHandler; statusCode=%d", Integer.valueOf(i7));
        if (i7 == 0 || i7 == 2300) {
            this.O = true;
            this.P = true;
        }
        if (i7 == 2300) {
            Bundle bundle2 = new Bundle();
            this.W = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i7 = 0;
        }
        super.w(i7, iBinder, bundle, i10);
    }
}
