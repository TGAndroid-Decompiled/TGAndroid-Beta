package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
public final class olf extends d05 {
    public static final he6 X = new he6("CastClientImpl", null);
    public static final Object Y = new Object();
    public static final Object Z = new Object();
    public xr F;
    public final CastDevice G;
    public final kmf H;
    public final HashMap I;
    public final Bundle J;
    public xkf K;
    public String L;
    public boolean M;
    public boolean N;
    public boolean O;
    public double P;
    public ued Q;
    public int R;
    public int S;
    public String T;
    public String U;
    public Bundle V;
    public final HashMap W;

    public olf(Context context, Looper looper, oxb oxbVar, CastDevice castDevice, kmf kmfVar, Bundle bundle, k05 k05Var, l05 l05Var) {
        super(10, k05Var, l05Var, oxbVar, context, looper);
        this.G = castDevice;
        this.H = kmfVar;
        this.J = bundle;
        this.I = new HashMap();
        new AtomicLong(0L);
        this.W = new HashMap();
        this.R = -1;
        this.S = -1;
        this.F = null;
        this.L = null;
        this.P = 0.0d;
        E();
        this.M = false;
        this.Q = null;
        E();
    }

    public final void B() {
        X.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.I) {
            this.I.clear();
        }
    }

    public final void C(int i, long j) {
        kg0 kg0Var;
        synchronized (this.W) {
            kg0Var = (kg0) this.W.remove(Long.valueOf(j));
        }
        if (kg0Var != null) {
            kg0Var.a(new Status(i, null, null, null));
        }
    }

    public final void D(int i) {
        synchronized (Z) {
        }
    }

    public final void E() {
        CastDevice castDevice = this.G;
        xve.i(castDevice, "device should not be null");
        if (!castDevice.c(2048) && castDevice.c(4) && !castDevice.c(1)) {
            "Chromecast Audio".equals(castDevice.e);
        }
    }

    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof qbd) {
            return (qbd) queryLocalInterface;
        }
        return new qbd(iBinder);
    }

    @Override
    public final void c() {
        Object[] objArr = {this.K, Boolean.valueOf(q())};
        he6 he6Var = X;
        he6Var.b("disconnect(); ServiceListener=%s, isConnected=%b", objArr);
        xkf xkfVar = this.K;
        olf olfVar = null;
        this.K = null;
        if (xkfVar != null) {
            olf olfVar2 = (olf) xkfVar.c.getAndSet(null);
            if (olfVar2 != null) {
                olfVar2.R = -1;
                olfVar2.S = -1;
                olfVar2.F = null;
                olfVar2.L = null;
                olfVar2.P = 0.0d;
                olfVar2.E();
                olfVar2.M = false;
                olfVar2.Q = null;
                olfVar = olfVar2;
            }
            if (olfVar != null) {
                B();
                try {
                    try {
                        ((qbd) k()).Z();
                    } finally {
                        super.c();
                    }
                } catch (RemoteException | IllegalStateException e) {
                    he6Var.a(e, "Error while disconnecting the controller interface", new Object[0]);
                }
                return;
            }
        }
        he6Var.b("already disposed, so short-circuiting", new Object[0]);
    }

    @Override
    public final Bundle g() {
        Bundle bundle = this.V;
        if (bundle == null) {
            return null;
        }
        this.V = null;
        return bundle;
    }

    @Override
    public final Bundle h() {
        Bundle bundle = new Bundle();
        X.b("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.T, this.U);
        CastDevice castDevice = this.G;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
        Bundle bundle2 = this.J;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        xkf xkfVar = new xkf(this);
        this.K = xkfVar;
        bundle.putParcelable("listener", new BinderWrapper(xkfVar));
        String str = this.T;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.U;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override
    public final int i() {
        return 12800000;
    }

    @Override
    public final String l() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override
    public final String n() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override
    public final void s(ws2 ws2Var) {
        super.s(ws2Var);
        B();
    }

    @Override
    public final void u(int i, IBinder iBinder, Bundle bundle, int i2) {
        X.b("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 2300) {
            this.N = true;
            this.O = true;
        }
        if (i == 2300) {
            Bundle bundle2 = new Bundle();
            this.V = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super.u(i, iBinder, bundle, i2);
    }
}
