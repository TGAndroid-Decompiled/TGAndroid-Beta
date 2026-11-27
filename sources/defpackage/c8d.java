package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
public final class c8d extends c4 {
    public static final Parcelable.Creator<c8d> CREATOR = new s5d((byte) 15);
    public final int a;
    public final IBinder b;
    public final ws2 c;
    public final boolean d;
    public final boolean e;

    public c8d(int i, IBinder iBinder, ws2 ws2Var, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = ws2Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        Object v3dVar;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof c8d) {
                    c8d c8dVar = (c8d) obj;
                    if (this.c.equals(c8dVar.c)) {
                        Object obj2 = null;
                        IBinder iBinder = this.b;
                        if (iBinder == null) {
                            v3dVar = null;
                        } else {
                            int i = f5.b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof wi5) {
                                v3dVar = (wi5) queryLocalInterface;
                            } else {
                                v3dVar = new v3d(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 4);
                            }
                        }
                        IBinder iBinder2 = c8dVar.b;
                        if (iBinder2 != null) {
                            int i2 = f5.b;
                            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface2 instanceof wi5) {
                                obj2 = (wi5) queryLocalInterface2;
                            } else {
                                obj2 = new v3d(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 4);
                            }
                        }
                        if (vue.a(v3dVar, obj2)) {
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
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.f(parcel, 2, this.b);
        bye.k(parcel, 3, this.c, i);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bye.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        bye.s(parcel, r);
    }
}
