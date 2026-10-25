package b6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
public final class f extends c8.b implements j {
    public final int f3664b;
    public final g f3665c;

    public f(g gVar, int i10) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 5);
        this.f3664b = i10;
        this.f3665c = gVar;
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) j7.f.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) j7.f.a(parcel, Status.CREATOR);
                j7.f.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                j7.f.b(parcel);
                g0((Status) j7.f.a(parcel, Status.CREATOR));
                break;
            case 103:
                j7.f.b(parcel);
                X((Status) j7.f.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override
    public void X(Status status) {
        switch (this.f3664b) {
            case 1:
                this.f3665c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void g0(Status status) {
        switch (this.f3664b) {
            case 0:
                this.f3665c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
