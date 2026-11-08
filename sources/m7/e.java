package m7;

import android.os.IBinder;
import android.os.IInterface;
import q6.h;
public final class e extends h {
    @Override
    public final int d() {
        return 12451000;
    }

    @Override
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (queryLocalInterface instanceof d) {
            return (d) queryLocalInterface;
        }
        return new d(iBinder);
    }

    @Override
    public final n6.c[] k() {
        return b.f19925b;
    }

    @Override
    public final String o() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override
    public final String p() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override
    public final boolean x() {
        return true;
    }
}
