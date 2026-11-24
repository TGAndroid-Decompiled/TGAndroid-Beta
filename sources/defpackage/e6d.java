package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
public final class e6d extends e1d implements IInterface {
    public final byte b;
    public final h6d c;

    public e6d(h6d h6dVar, byte b) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", (byte) 2);
        this.b = b;
        this.c = h6dVar;
    }

    @Override
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        h6d h6dVar = this.c;
        byte b = this.b;
        switch (i) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) y5d.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) y5d.a(parcel, Status.CREATOR);
                y5d.b(parcel);
                gxc.b();
                return false;
            case 102:
                Status status2 = (Status) y5d.a(parcel, Status.CREATOR);
                y5d.b(parcel);
                switch (b) {
                    case 0:
                        h6dVar.a(status2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            case 103:
                Status status3 = (Status) y5d.a(parcel, Status.CREATOR);
                y5d.b(parcel);
                switch (b) {
                    case 1:
                        h6dVar.a(status3);
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
