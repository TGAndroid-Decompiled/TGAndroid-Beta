package h7;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.i;
public final class e extends n6.g {
    @Override
    public final boolean D() {
        return true;
    }

    @Override
    public final int m() {
        return 17895000;
    }

    @Override
    public final IInterface r(IBinder iBinder) {
        i.e(iBinder, "iBinder");
        int i10 = c.f7633b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        if (queryLocalInterface instanceof d) {
            return (d) queryLocalInterface;
        }
        return new b(iBinder);
    }

    @Override
    public final k6.c[] s() {
        return q7.b.f45503c;
    }

    @Override
    public final String w() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override
    public final String x() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override
    public final boolean z() {
        return true;
    }
}
