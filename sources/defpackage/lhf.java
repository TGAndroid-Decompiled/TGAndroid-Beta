package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
public final class lhf extends xx4 {
    public static final dc6 I = new dc6("CastClientImplCxless", null);
    public final CastDevice F;
    public final Bundle G;
    public final String H;

    public lhf(Context context, Looper looper, ntb ntbVar, CastDevice castDevice, Bundle bundle, String str, ey4 ey4Var, fy4 fy4Var) {
        super(10, ey4Var, fy4Var, ntbVar, context, looper);
        this.F = castDevice;
        this.G = bundle;
        this.H = str;
    }

    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof x6d) {
            return (x6d) queryLocalInterface;
        }
        return new x6d(iBinder);
    }

    @Override
    public final void c() {
        try {
            try {
                ((x6d) k()).Z();
            } finally {
                super.c();
            }
        } catch (RemoteException | IllegalStateException e) {
            I.a(e, "Error while disconnecting the controller interface", new Object[0]);
        }
    }

    @Override
    public final f84[] f() {
        return ied.e;
    }

    @Override
    public final Bundle h() {
        Bundle bundle = new Bundle();
        I.b("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.F;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
        bundle.putString("connectionless_client_record_id", this.H);
        Bundle bundle2 = this.G;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override
    public final int i() {
        return 19390000;
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
    public final boolean x() {
        return true;
    }
}
