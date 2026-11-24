package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class zze extends xx4 {
    @Override
    public final IInterface b(IBinder iBinder) {
        iBinder.getClass();
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        if (queryLocalInterface instanceof pyd) {
            return (pyd) queryLocalInterface;
        }
        return new pyd(iBinder);
    }

    @Override
    public final f84[] f() {
        return ped.c;
    }

    @Override
    public final int i() {
        return 17895000;
    }

    @Override
    public final String l() {
        return "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService";
    }

    @Override
    public final String n() {
        return "com.google.android.gms.recaptchabase.service.START";
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final boolean x() {
        return false;
    }
}
