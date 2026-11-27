package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
public abstract class q5d extends u3d implements IInterface {
    public final byte b;

    public q5d(byte b) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", (byte) 1);
        this.b = b;
        switch (b) {
            case 1:
                super("com.google.android.gms.signin.internal.ISignInCallbacks", (byte) 1);
                return;
            default:
                return;
        }
    }

    public void T(Status status, vg7 vg7Var) {
        throw new UnsupportedOperationException();
    }

    public abstract void U(t7d t7dVar);

    public void V(Status status, xg7 xg7Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        switch (this.b) {
            case 0:
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                Status status = (Status) v6d.a(parcel, Status.CREATOR);
                                v6d.d(parcel);
                                p3d.a();
                            }
                        } else {
                            Status status2 = (Status) v6d.a(parcel, Status.CREATOR);
                            wg7 wg7Var = (wg7) v6d.a(parcel, wg7.CREATOR);
                            v6d.d(parcel);
                            p3d.a();
                        }
                        return false;
                    }
                    v6d.d(parcel);
                    V((Status) v6d.a(parcel, Status.CREATOR), (xg7) v6d.a(parcel, xg7.CREATOR));
                    return true;
                }
                v6d.d(parcel);
                T((Status) v6d.a(parcel, Status.CREATOR), (vg7) v6d.a(parcel, vg7.CREATOR));
                return true;
            default:
                switch (i) {
                    case 3:
                        ws2 ws2Var = (ws2) v6d.a(parcel, ws2.CREATOR);
                        r5d r5dVar = (r5d) v6d.a(parcel, r5d.CREATOR);
                        v6d.d(parcel);
                        break;
                    case 4:
                        Status status3 = (Status) v6d.a(parcel, Status.CREATOR);
                        v6d.d(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        Status status4 = (Status) v6d.a(parcel, Status.CREATOR);
                        v6d.d(parcel);
                        break;
                    case 7:
                        Status status5 = (Status) v6d.a(parcel, Status.CREATOR);
                        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) v6d.a(parcel, GoogleSignInAccount.CREATOR);
                        v6d.d(parcel);
                        break;
                    case 8:
                        v6d.d(parcel);
                        U((t7d) v6d.a(parcel, t7d.CREATOR));
                        break;
                    case 9:
                        l7d l7dVar = (l7d) v6d.a(parcel, l7d.CREATOR);
                        v6d.d(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
        }
    }
}
