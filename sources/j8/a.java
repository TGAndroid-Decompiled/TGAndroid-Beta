package j8;

import android.os.Parcel;

public abstract class a extends b7.a implements f0 {
    public a() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", 8);
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 2:
                throw i0.a.q(parcel);
            case 3:
                throw i0.a.q(parcel);
            case 4:
                throw i0.a.q(parcel);
            case 5:
                throw i0.a.q(parcel);
            case 6:
                throw i0.a.q(parcel);
            case 7:
                u0 u0Var = (u0) q7.a.a(parcel, u0.CREATOR);
                q7.a.b(parcel);
                u(u0Var);
                break;
            case 8:
                throw i0.a.q(parcel);
            case 9:
                throw i0.a.q(parcel);
            case 10:
                throw i0.a.q(parcel);
            case 11:
                q7.a.b(parcel);
                w();
                break;
            case 12:
                throw i0.a.q(parcel);
            case 13:
                throw i0.a.q(parcel);
            case 14:
                throw i0.a.q(parcel);
            case 15:
                throw i0.a.q(parcel);
            case 16:
                throw i0.a.q(parcel);
            case 17:
                throw i0.a.q(parcel);
            case 18:
                throw i0.a.q(parcel);
            case 19:
                throw i0.a.q(parcel);
            case 20:
                throw i0.a.q(parcel);
            case 21:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                throw i0.a.q(parcel);
            case 23:
                throw i0.a.q(parcel);
            case 26:
                throw i0.a.q(parcel);
            case 27:
                throw i0.a.q(parcel);
            case 28:
                throw i0.a.q(parcel);
            case 29:
                throw i0.a.q(parcel);
            case 30:
                throw i0.a.q(parcel);
            case 34:
                throw i0.a.q(parcel);
            case 35:
                throw i0.a.q(parcel);
            case 36:
                throw i0.a.q(parcel);
            case 37:
                throw i0.a.q(parcel);
            case 38:
                throw i0.a.q(parcel);
            case 39:
                throw i0.a.q(parcel);
            case 40:
                throw i0.a.q(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override
    public void u(u0 u0Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void w() {
        throw new UnsupportedOperationException();
    }
}
