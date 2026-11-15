package d6;

import a8.q;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
public final class f extends q implements j {
    public final int f7592b;
    public final g f7593c;

    public f(g gVar, int i7) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 7);
        this.f7592b = i7;
        this.f7593c = gVar;
    }

    @Override
    public void h0(Status status) {
        switch (this.f7592b) {
            case 1:
                this.f7593c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final boolean j1(int i7, Parcel parcel, Parcel parcel2) {
        switch (i7) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) l7.f.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) l7.f.a(parcel, Status.CREATOR);
                l7.f.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                l7.f.b(parcel);
                s0((Status) l7.f.a(parcel, Status.CREATOR));
                break;
            case 103:
                l7.f.b(parcel);
                h0((Status) l7.f.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override
    public void s0(Status status) {
        switch (this.f7592b) {
            case 0:
                this.f7593c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
