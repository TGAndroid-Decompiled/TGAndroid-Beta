package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
public final class jd1 extends c4 {
    public final String a;
    public final String b;
    public final vfd c;
    public final po7 d;
    public final boolean e;
    public final boolean f;
    public static final he6 h = new he6("CastMediaOptions", null);
    public static final Parcelable.Creator<jd1> CREATOR = new s5d((byte) 28);

    public jd1(String str, String str2, IBinder iBinder, po7 po7Var, boolean z, boolean z2) {
        vfd v3dVar;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            v3dVar = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof vfd) {
                v3dVar = (vfd) queryLocalInterface;
            } else {
                v3dVar = new v3d(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", (byte) 3);
            }
        }
        this.c = v3dVar;
        this.d = po7Var;
        this.e = z;
        this.f = z2;
    }

    public final void b() {
        vfd vfdVar = this.c;
        if (vfdVar != null) {
            try {
                Parcel T = vfdVar.T(vfdVar.R(), 2);
                al5 T2 = br7.T(T.readStrongBinder());
                T.recycle();
                if (br7.U(T2) != null) {
                    throw new ClassCastException();
                }
            } catch (RemoteException e) {
                h.a(e, "Unable to call %s on %s.", "getWrappedClientObject", vfd.class.getSimpleName());
            }
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        vfd vfdVar = this.c;
        if (vfdVar == null) {
            iBinder = null;
        } else {
            iBinder = vfdVar.b;
        }
        bye.f(parcel, 4, iBinder);
        bye.k(parcel, 5, this.d, i);
        bye.q(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        bye.q(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        bye.s(parcel, r);
    }
}
