package a8;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.i;
public final class g extends n6.g {
    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final int m() {
        return 17895000;
    }

    @Override
    public final IInterface r(IBinder iBinder) {
        i.e(iBinder, "iBinder");
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        if (queryLocalInterface instanceof c) {
            return (c) queryLocalInterface;
        }
        return new c(iBinder);
    }

    @Override
    public final k6.c[] s() {
        return l8.f.f11695c;
    }

    @Override
    public final String w() {
        return "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService";
    }

    @Override
    public final String x() {
        return "com.google.android.gms.recaptchabase.service.START";
    }

    @Override
    public final boolean z() {
        return true;
    }
}
