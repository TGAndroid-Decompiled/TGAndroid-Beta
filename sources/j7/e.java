package j7;

import android.os.IBinder;
import android.os.IInterface;
import n6.g;
public final class e extends g {
    @Override
    public final boolean D() {
        return true;
    }

    @Override
    public final int m() {
        return 12451000;
    }

    @Override
    public final IInterface r(IBinder iBinder) {
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
    public final k6.c[] s() {
        return b.f9704b;
    }

    @Override
    public final String w() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override
    public final String x() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }
}
