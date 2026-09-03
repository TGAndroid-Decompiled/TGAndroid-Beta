package o5;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
public final class f extends a7.c implements j {
    public final int f16611b;
    public final g f16612c;

    public f(g gVar, int i10) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 10);
        this.f16611b = i10;
        this.f16612c = gVar;
    }

    @Override
    public final boolean G0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) w6.f.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) w6.f.a(parcel, Status.CREATOR);
                w6.f.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                w6.f.b(parcel);
                f0((Status) w6.f.a(parcel, Status.CREATOR));
                break;
            case 103:
                w6.f.b(parcel);
                X((Status) w6.f.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override
    public void X(Status status) {
        switch (this.f16611b) {
            case 1:
                this.f16612c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void f0(Status status) {
        switch (this.f16611b) {
            case 0:
                this.f16612c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
