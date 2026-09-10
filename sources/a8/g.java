package a8;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.i;
public final class g extends n6.g {
    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final int l() {
        return 17895000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        i.e(iBinder, "iBinder");
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        if (queryLocalInterface instanceof c) {
            return (c) queryLocalInterface;
        }
        return new c(iBinder);
    }

    @Override
    public final k6.c[] r() {
        return l8.f.f12826c;
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
