package m5;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
public final class f extends c7.a implements j {
    public final int f16874b;
    public final g f16875c;

    public f(g gVar, int i10) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 9);
        this.f16874b = i10;
        this.f16875c = gVar;
    }

    @Override
    public final boolean G0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) u6.f.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) u6.f.a(parcel, Status.CREATOR);
                u6.f.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                u6.f.b(parcel);
                d0((Status) u6.f.a(parcel, Status.CREATOR));
                break;
            case 103:
                u6.f.b(parcel);
                V((Status) u6.f.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override
    public void V(Status status) {
        switch (this.f16874b) {
            case 1:
                this.f16875c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void d0(Status status) {
        switch (this.f16874b) {
            case 0:
                this.f16875c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
