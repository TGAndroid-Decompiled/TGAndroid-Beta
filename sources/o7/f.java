package o7;

import android.os.IBinder;
import android.os.IInterface;
import b6.g;
import kotlin.jvm.internal.j;
public final class f extends g {
    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final int k() {
        return 17895000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        j.e(iBinder, "iBinder");
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        if (queryLocalInterface instanceof c) {
            return (c) queryLocalInterface;
        }
        return new c(iBinder);
    }

    @Override
    public final y5.c[] r() {
        return z7.f.f51127c;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.recaptchabase.service.START";
    }

    @Override
    public final boolean y() {
        return true;
    }
}
