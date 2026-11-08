package d8;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.j;
import q6.h;
public final class f extends h {
    @Override
    public final int d() {
        return 17895000;
    }

    @Override
    public final IInterface i(IBinder iBinder) {
        j.e(iBinder, "iBinder");
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        if (queryLocalInterface instanceof c) {
            return (c) queryLocalInterface;
        }
        return new c(iBinder);
    }

    @Override
    public final n6.c[] k() {
        return o8.f.f20862c;
    }

    @Override
    public final String o() {
        return "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService";
    }

    @Override
    public final String p() {
        return "com.google.android.gms.recaptchabase.service.START";
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final boolean x() {
        return false;
    }
}
