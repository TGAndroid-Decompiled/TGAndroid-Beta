package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
public final class t8d extends u3d implements IInterface {
    public final byte b;
    public final w8d c;

    public t8d(w8d w8dVar, byte b) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", (byte) 2);
        this.b = b;
        this.c = w8dVar;
    }

    @Override
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        w8d w8dVar = this.c;
        byte b = this.b;
        switch (i) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) n8d.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) n8d.a(parcel, Status.CREATOR);
                n8d.b(parcel);
                p3d.a();
                return false;
            case 102:
                Status status2 = (Status) n8d.a(parcel, Status.CREATOR);
                n8d.b(parcel);
                switch (b) {
                    case 0:
                        w8dVar.a(status2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            case 103:
                Status status3 = (Status) n8d.a(parcel, Status.CREATOR);
                n8d.b(parcel);
                switch (b) {
                    case 1:
                        w8dVar.a(status3);
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
