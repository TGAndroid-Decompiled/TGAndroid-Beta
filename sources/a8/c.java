package a8;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
public abstract class c extends c7.a implements d {
    public c() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 10);
    }

    @Override
    public final boolean F0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 3:
                w5.a aVar = (w5.a) w6.a.a(parcel, w5.a.CREATOR);
                b bVar = (b) w6.a.a(parcel, b.CREATOR);
                w6.a.b(parcel);
                break;
            case 4:
                Status status = (Status) w6.a.a(parcel, Status.CREATOR);
                w6.a.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) w6.a.a(parcel, Status.CREATOR);
                w6.a.b(parcel);
                break;
            case 7:
                Status status3 = (Status) w6.a.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) w6.a.a(parcel, GoogleSignInAccount.CREATOR);
                w6.a.b(parcel);
                break;
            case 8:
                w6.a.b(parcel);
                t0((h) w6.a.a(parcel, h.CREATOR));
                break;
            case 9:
                f fVar = (f) w6.a.a(parcel, f.CREATOR);
                w6.a.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
