package k7;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.j;
import q6.h;
public final class e extends h {
    @Override
    public final int d() {
        return 17895000;
    }

    @Override
    public final IInterface i(IBinder iBinder) {
        j.e(iBinder, "iBinder");
        int i7 = c.f17226b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        if (queryLocalInterface instanceof d) {
            return (d) queryLocalInterface;
        }
        return new b(iBinder);
    }

    @Override
    public final n6.c[] k() {
        return t7.b.f55452c;
    }

    @Override
    public final String o() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override
    public final String p() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final boolean x() {
        return true;
    }
}
