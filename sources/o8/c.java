package o8;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
public abstract class c extends b8.b implements d {
    public c() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 6);
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 3:
                k6.a aVar = (k6.a) k7.a.a(parcel, k6.a.CREATOR);
                b bVar = (b) k7.a.a(parcel, b.CREATOR);
                k7.a.b(parcel);
                break;
            case 4:
                Status status = (Status) k7.a.a(parcel, Status.CREATOR);
                k7.a.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) k7.a.a(parcel, Status.CREATOR);
                k7.a.b(parcel);
                break;
            case 7:
                Status status3 = (Status) k7.a.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) k7.a.a(parcel, GoogleSignInAccount.CREATOR);
                k7.a.b(parcel);
                break;
            case 8:
                k7.a.b(parcel);
                B((h) k7.a.a(parcel, h.CREATOR));
                break;
            case 9:
                f fVar = (f) k7.a.a(parcel, f.CREATOR);
                k7.a.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
