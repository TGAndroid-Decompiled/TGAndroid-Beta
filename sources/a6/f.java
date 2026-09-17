package a6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
public final class f extends b8.b implements j {
    public final int f318b;
    public final g f319c;

    public f(g gVar, int i10) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 5);
        this.f318b = i10;
        this.f319c = gVar;
    }

    @Override
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) i7.f.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) i7.f.a(parcel, Status.CREATOR);
                i7.f.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                i7.f.b(parcel);
                h0((Status) i7.f.a(parcel, Status.CREATOR));
                break;
            case 103:
                i7.f.b(parcel);
                Z((Status) i7.f.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override
    public void Z(Status status) {
        switch (this.f318b) {
            case 1:
                this.f319c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void h0(Status status) {
        switch (this.f318b) {
            case 0:
                this.f319c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
