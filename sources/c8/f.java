package c8;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.j;
import p6.h;
public final class f extends h {
    @Override
    public final int d() {
        return 17895000;
    }

    @Override
    public final IInterface g(IBinder iBinder) {
        j.e(iBinder, "iBinder");
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        if (queryLocalInterface instanceof c) {
            return (c) queryLocalInterface;
        }
        return new c(iBinder);
    }

    @Override
    public final m6.c[] i() {
        return n8.f.f20281c;
    }

    @Override
    public final String n() {
        return "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService";
    }

    @Override
    public final String o() {
        return "com.google.android.gms.recaptchabase.service.START";
    }

    @Override
    public final boolean q() {
        return true;
    }

    @Override
    public final boolean w() {
        return false;
    }
}
