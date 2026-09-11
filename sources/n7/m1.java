package n7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
public final class m1 extends n6.g {
    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final int l() {
        return 13000000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        if (queryLocalInterface instanceof n1) {
            return (n1) queryLocalInterface;
        }
        return new n1(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override
    public final k6.c[] r() {
        return new k6.c[]{z6.a.f50771b, z6.a.f50770a};
    }

    @Override
    public final Bundle t() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }
}
