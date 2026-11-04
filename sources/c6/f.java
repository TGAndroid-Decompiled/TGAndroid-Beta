package c6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.o;
public final class f extends o implements j {
    public final int f4229b;
    public final g f4230c;

    public f(g gVar, int i3) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 5);
        this.f4229b = i3;
        this.f4230c = gVar;
    }

    @Override
    public final boolean J0(int i3, Parcel parcel, Parcel parcel2) {
        switch (i3) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) k7.f.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) k7.f.a(parcel, Status.CREATOR);
                k7.f.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                k7.f.b(parcel);
                j0((Status) k7.f.a(parcel, Status.CREATOR));
                break;
            case 103:
                k7.f.b(parcel);
                W((Status) k7.f.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override
    public void W(Status status) {
        switch (this.f4229b) {
            case 1:
                this.f4230c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void j0(Status status) {
        switch (this.f4229b) {
            case 0:
                this.f4230c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
