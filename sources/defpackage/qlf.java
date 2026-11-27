package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class qlf extends d05 {
    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (queryLocalInterface instanceof che) {
            return (che) queryLocalInterface;
        }
        return new che(iBinder);
    }

    @Override
    public final a94[] f() {
        return vid.b;
    }

    @Override
    public final int i() {
        return 12451000;
    }

    @Override
    public final String l() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override
    public final String n() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override
    public final boolean x() {
        return true;
    }
}
