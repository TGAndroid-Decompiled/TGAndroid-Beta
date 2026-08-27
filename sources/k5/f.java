package k5;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class f extends b7.a implements j {

    public final int f14474b;

    public final g f14475c;

    public f(g gVar, int i10) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 9);
        this.f14474b = i10;
        this.f14475c = gVar;
    }

    @Override
    public final boolean G0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 101:
                t6.f.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) t6.f.a(parcel, Status.CREATOR);
                t6.f.b(parcel);
                i0(status);
                break;
            case 103:
                Status status2 = (Status) t6.f.a(parcel, Status.CREATOR);
                t6.f.b(parcel);
                W(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override
    public void W(Status status) {
        switch (this.f14474b) {
            case 1:
                this.f14475c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void i0(Status status) {
        switch (this.f14474b) {
            case 0:
                this.f14475c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
