package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
public final class c4d extends dzc implements IInterface {
    public final byte b;
    public final f4d c;

    public c4d(f4d f4dVar, byte b) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", (byte) 2);
        this.b = b;
        this.c = f4dVar;
    }

    @Override
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        f4d f4dVar = this.c;
        byte b = this.b;
        switch (i) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) w3d.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) w3d.a(parcel, Status.CREATOR);
                w3d.b(parcel);
                fvc.b();
                return false;
            case 102:
                Status status2 = (Status) w3d.a(parcel, Status.CREATOR);
                w3d.b(parcel);
                switch (b) {
                    case 0:
                        f4dVar.a(status2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            case 103:
                Status status3 = (Status) w3d.a(parcel, Status.CREATOR);
                w3d.b(parcel);
                switch (b) {
                    case 1:
                        f4dVar.a(status3);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
