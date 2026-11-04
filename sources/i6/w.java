package i6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import e6.y;
import m.o3;
public final class w extends p6.h {
    public static final b J = new b("CastClientImplCxless", null);
    public final CastDevice F;
    public final long G;
    public final Bundle H;
    public final String I;

    public w(Context context, Looper looper, o3 o3Var, CastDevice castDevice, long j10, Bundle bundle, String str, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 10, o3Var, kVar, lVar, 0);
        this.F = castDevice;
        this.G = j10;
        this.H = bundle;
        this.I = str;
    }

    @Override
    public final void a() {
        try {
            try {
                ((f) m()).X0();
            } finally {
                super.a();
            }
        } catch (RemoteException | IllegalStateException e10) {
            J.a(e10, "Error while disconnecting the controller interface", new Object[0]);
        }
    }

    @Override
    public final int d() {
        return 19390000;
    }

    @Override
    public final IInterface g(IBinder iBinder) {
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
    public final m6.c[] i() {
        return y.f9791e;
    }

    @Override
    public final Bundle k() {
        Bundle bundle = new Bundle();
        J.b("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.F;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.G);
        bundle.putString("connectionless_client_record_id", this.I);
        Bundle bundle2 = this.H;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override
    public final String n() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override
    public final String o() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override
    public final boolean w() {
        return true;
    }
}
