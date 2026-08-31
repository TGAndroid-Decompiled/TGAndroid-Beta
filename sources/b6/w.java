package b6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class w extends c6.a {
    public static final Parcelable.Creator<w> CREATOR = new w.a(23);
    public final int f1789a;
    public final IBinder f1790b;
    public final y5.a f1791c;
    public final boolean d;
    public final boolean f1792e;

    public w(int i10, IBinder iBinder, y5.a aVar, boolean z4, boolean z10) {
        this.f1789a = i10;
        this.f1790b = iBinder;
        this.f1791c = aVar;
        this.d = z4;
        this.f1792e = z10;
    }

    public final boolean equals(Object obj) {
        Object aVar;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof w) {
                    w wVar = (w) obj;
                    if (this.f1791c.equals(wVar.f1791c)) {
                        Object obj2 = null;
                        IBinder iBinder = this.f1790b;
                        if (iBinder == null) {
                            aVar = null;
                        } else {
                            int i10 = a.f1685b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof i) {
                                aVar = (i) queryLocalInterface;
                            } else {
                                aVar = new a7.a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 0);
                            }
                        }
                        IBinder iBinder2 = wVar.f1790b;
                        if (iBinder2 != null) {
                            int i11 = a.f1685b;
                            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface2 instanceof i) {
                                obj2 = (i) queryLocalInterface2;
                            } else {
                                obj2 = new a7.a(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 0);
                            }
                        }
                        if (m.l(aVar, obj2)) {
                            return true;
                        }
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f1789a);
        g5.f(parcel, 2, this.f1790b);
        g5.k(parcel, 3, this.f1791c, i10);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g5.s(parcel, 5, 4);
        parcel.writeInt(this.f1792e ? 1 : 0);
        g5.r(parcel, q10);
    }
}
