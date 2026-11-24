package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
public final class l3d extends b4 {
    public static final Parcelable.Creator<l3d> CREATOR = new b1d((byte) 15);
    public final int a;
    public final IBinder b;
    public final ds2 c;
    public final boolean d;
    public final boolean e;

    public l3d(int i, IBinder iBinder, ds2 ds2Var, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = ds2Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        Object ezcVar;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof l3d) {
                    l3d l3dVar = (l3d) obj;
                    if (this.c.equals(l3dVar.c)) {
                        Object obj2 = null;
                        IBinder iBinder = this.b;
                        if (iBinder == null) {
                            ezcVar = null;
                        } else {
                            int i = e5.b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof ug5) {
                                ezcVar = (ug5) queryLocalInterface;
                            } else {
                                ezcVar = new ezc(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 4);
                            }
                        }
                        IBinder iBinder2 = l3dVar.b;
                        if (iBinder2 != null) {
                            int i2 = e5.b;
                            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface2 instanceof ug5) {
                                obj2 = (ug5) queryLocalInterface2;
                            } else {
                                obj2 = new ezc(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 4);
                            }
                        }
                        if (cqe.a(ezcVar, obj2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.f(parcel, 2, this.b);
        jte.k(parcel, 3, this.c, i);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        jte.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        jte.s(parcel, r);
    }
}
