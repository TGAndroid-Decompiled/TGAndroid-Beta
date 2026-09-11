package g6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import c6.y;
import com.google.android.gms.cast.CastDevice;
import m.p3;
public final class w extends n6.g {
    public static final b Y = new b("CastClientImplCxless", null);
    public final CastDevice U;
    public final long V;
    public final Bundle W;
    public final String X;

    public w(Context context, Looper looper, p3 p3Var, CastDevice castDevice, long j3, Bundle bundle, String str, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 10, p3Var, kVar, lVar, 0);
        this.U = castDevice;
        this.V = j3;
        this.W = bundle;
        this.X = str;
    }

    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final void disconnect() {
        try {
            try {
                ((f) u()).W0();
            } finally {
                super.disconnect();
            }
        } catch (RemoteException | IllegalStateException e7) {
            Y.a(e7, "Error while disconnecting the controller interface", new Object[0]);
        }
    }

    @Override
    public final int l() {
        return 19390000;
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
    public final k6.c[] r() {
        return y.f4588e;
    }

    @Override
    public final Bundle t() {
        Bundle bundle = new Bundle();
        Y.b("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.U;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.V);
        bundle.putString("connectionless_client_record_id", this.X);
        Bundle bundle2 = this.W;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
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
}
