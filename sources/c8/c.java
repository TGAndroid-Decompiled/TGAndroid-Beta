package c8;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
public abstract class c extends a7.c implements d {
    public c() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 11);
    }

    @Override
    public final boolean F0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 3:
                y5.a aVar = (y5.a) y6.a.a(parcel, y5.a.CREATOR);
                b bVar = (b) y6.a.a(parcel, b.CREATOR);
                y6.a.b(parcel);
                break;
            case 4:
                Status status = (Status) y6.a.a(parcel, Status.CREATOR);
                y6.a.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) y6.a.a(parcel, Status.CREATOR);
                y6.a.b(parcel);
                break;
            case 7:
                Status status3 = (Status) y6.a.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) y6.a.a(parcel, GoogleSignInAccount.CREATOR);
                y6.a.b(parcel);
                break;
            case 8:
                y6.a.b(parcel);
                h((h) y6.a.a(parcel, h.CREATOR));
                break;
            case 9:
                f fVar = (f) y6.a.a(parcel, f.CREATOR);
                y6.a.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
