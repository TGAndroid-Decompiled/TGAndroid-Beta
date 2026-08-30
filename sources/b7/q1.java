package b7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
public final class q1 extends b6.g {
    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final int k() {
        return 13000000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        if (queryLocalInterface instanceof r1) {
            return (r1) queryLocalInterface;
        }
        return new r1(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override
    public final y5.c[] r() {
        return new y5.c[]{n6.a.f14276b, n6.a.f14275a};
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
