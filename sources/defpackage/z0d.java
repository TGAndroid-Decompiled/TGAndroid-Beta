package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
public abstract class z0d extends dzc implements IInterface {
    public final byte b;

    public z0d(byte b) {
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

    public void T(Status status, me7 me7Var) {
        throw new UnsupportedOperationException();
    }

    public abstract void U(c3d c3dVar);

    public void V(Status status, oe7 oe7Var) {
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
                                Status status = (Status) e2d.a(parcel, Status.CREATOR);
                                e2d.d(parcel);
                                fvc.b();
                            }
                        } else {
                            Status status2 = (Status) e2d.a(parcel, Status.CREATOR);
                            ne7 ne7Var = (ne7) e2d.a(parcel, ne7.CREATOR);
                            e2d.d(parcel);
                            fvc.b();
                        }
                        return false;
                    }
                    e2d.d(parcel);
                    V((Status) e2d.a(parcel, Status.CREATOR), (oe7) e2d.a(parcel, oe7.CREATOR));
                    return true;
                }
                e2d.d(parcel);
                T((Status) e2d.a(parcel, Status.CREATOR), (me7) e2d.a(parcel, me7.CREATOR));
                return true;
            default:
                switch (i) {
                    case 3:
                        ds2 ds2Var = (ds2) e2d.a(parcel, ds2.CREATOR);
                        a1d a1dVar = (a1d) e2d.a(parcel, a1d.CREATOR);
                        e2d.d(parcel);
                        break;
                    case 4:
                        Status status3 = (Status) e2d.a(parcel, Status.CREATOR);
                        e2d.d(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        Status status4 = (Status) e2d.a(parcel, Status.CREATOR);
                        e2d.d(parcel);
                        break;
                    case 7:
                        Status status5 = (Status) e2d.a(parcel, Status.CREATOR);
                        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) e2d.a(parcel, GoogleSignInAccount.CREATOR);
                        e2d.d(parcel);
                        break;
                    case 8:
                        e2d.d(parcel);
                        U((c3d) e2d.a(parcel, c3d.CREATOR));
                        break;
                    case 9:
                        u2d u2dVar = (u2d) e2d.a(parcel, u2d.CREATOR);
                        e2d.d(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
        }
    }
}
