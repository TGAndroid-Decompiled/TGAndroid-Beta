package j7;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.j;
import p6.h;
public final class e extends h {
    @Override
    public final int d() {
        return 17895000;
    }

    @Override
    public final IInterface g(IBinder iBinder) {
        j.e(iBinder, "iBinder");
        int i3 = c.f16208b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        if (queryLocalInterface instanceof d) {
            return (d) queryLocalInterface;
        }
        return new b(iBinder);
    }

    @Override
    public final m6.c[] i() {
        return s7.b.f54674c;
    }

    @Override
    public final String n() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override
    public final String o() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override
    public final boolean q() {
        return true;
    }

    @Override
    public final boolean w() {
        return true;
    }
}
