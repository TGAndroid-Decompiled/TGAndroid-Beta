package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
public final class gcf extends d05 {
    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        if (queryLocalInterface instanceof ghf) {
            return (ghf) queryLocalInterface;
        }
        return new ghf(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override
    public final a94[] f() {
        return new a94[]{sid.b, sid.a};
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
