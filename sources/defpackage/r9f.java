package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
public final class r9f extends zz4 {
    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        if (queryLocalInterface instanceof ref) {
            return (ref) queryLocalInterface;
        }
        return new ref(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override
    public final o94[] f() {
        return new o94[]{cgd.b, cgd.a};
    }

    @Override
    public final Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override
    public final int i() {
        return 13000000;
    }

    @Override
    public final String l() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override
    public final String n() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override
    public final boolean x() {
        return true;
    }
}
