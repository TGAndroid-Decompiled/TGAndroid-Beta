package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
public abstract class b3d extends e1d implements IInterface {
    public final byte b;

    public b3d(byte b) {
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

    public void T(Status status, og7 og7Var) {
        throw new UnsupportedOperationException();
    }

    public abstract void U(e5d e5dVar);

    public void V(Status status, qg7 qg7Var) {
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
                                Status status = (Status) g4d.a(parcel, Status.CREATOR);
                                g4d.d(parcel);
                                gxc.b();
                            }
                        } else {
                            Status status2 = (Status) g4d.a(parcel, Status.CREATOR);
                            pg7 pg7Var = (pg7) g4d.a(parcel, pg7.CREATOR);
                            g4d.d(parcel);
                            gxc.b();
                        }
                        return false;
                    }
                    g4d.d(parcel);
                    V((Status) g4d.a(parcel, Status.CREATOR), (qg7) g4d.a(parcel, qg7.CREATOR));
                    return true;
                }
                g4d.d(parcel);
                T((Status) g4d.a(parcel, Status.CREATOR), (og7) g4d.a(parcel, og7.CREATOR));
                return true;
            default:
                switch (i) {
                    case 3:
                        ot2 ot2Var = (ot2) g4d.a(parcel, ot2.CREATOR);
                        c3d c3dVar = (c3d) g4d.a(parcel, c3d.CREATOR);
                        g4d.d(parcel);
                        break;
                    case 4:
                        Status status3 = (Status) g4d.a(parcel, Status.CREATOR);
                        g4d.d(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        Status status4 = (Status) g4d.a(parcel, Status.CREATOR);
                        g4d.d(parcel);
                        break;
                    case 7:
                        Status status5 = (Status) g4d.a(parcel, Status.CREATOR);
                        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) g4d.a(parcel, GoogleSignInAccount.CREATOR);
                        g4d.d(parcel);
                        break;
                    case 8:
                        g4d.d(parcel);
                        U((e5d) g4d.a(parcel, e5d.CREATOR));
                        break;
                    case 9:
                        w4d w4dVar = (w4d) g4d.a(parcel, w4d.CREATOR);
                        g4d.d(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
        }
    }
}
