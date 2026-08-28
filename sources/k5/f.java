package k5;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
public final class f extends a7.a implements j {
    public final int f14653b;
    public final g f14654c;

    public f(g gVar, int i9) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 9);
        this.f14653b = i9;
        this.f14654c = gVar;
    }

    @Override
    public final boolean G0(int i9, Parcel parcel, Parcel parcel2) {
        switch (i9) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) s6.f.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) s6.f.a(parcel, Status.CREATOR);
                s6.f.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                s6.f.b(parcel);
                e0((Status) s6.f.a(parcel, Status.CREATOR));
                break;
            case 103:
                s6.f.b(parcel);
                W((Status) s6.f.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override
    public void W(Status status) {
        switch (this.f14653b) {
            case 1:
                this.f14654c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void e0(Status status) {
        switch (this.f14653b) {
            case 0:
                this.f14654c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
