package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
public final class je1 extends b4 {
    public final String a;
    public final String b;
    public final edd c;
    public final tn7 d;
    public final boolean e;
    public final boolean f;
    public static final ce6 h = new ce6("CastMediaOptions", null);
    public static final Parcelable.Creator<je1> CREATOR = new d3d((byte) 28);

    public je1(String str, String str2, IBinder iBinder, tn7 tn7Var, boolean z, boolean z2) {
        edd f1dVar;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            f1dVar = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof edd) {
                f1dVar = (edd) queryLocalInterface;
            } else {
                f1dVar = new f1d(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", (byte) 3);
            }
        }
        this.c = f1dVar;
        this.d = tn7Var;
        this.e = z;
        this.f = z2;
    }

    public final void b() {
        edd eddVar = this.c;
        if (eddVar != null) {
            try {
                Parcel T = eddVar.T(eddVar.R(), 2);
                xk5 T2 = eq7.T(T.readStrongBinder());
                T.recycle();
                if (eq7.U(T2) != null) {
                    throw new ClassCastException();
                }
            } catch (RemoteException e) {
                h.a(e, "Unable to call %s on %s.", "getWrappedClientObject", edd.class.getSimpleName());
            }
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        edd eddVar = this.c;
        if (eddVar == null) {
            iBinder = null;
        } else {
            iBinder = eddVar.b;
        }
        mve.f(parcel, 4, iBinder);
        mve.k(parcel, 5, this.d, i);
        mve.q(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        mve.q(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        mve.s(parcel, r);
    }
}
