package b6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class w extends c6.a {
    public static final Parcelable.Creator<w> CREATOR = new w.a(23);
    public final int f1665a;
    public final IBinder f1666b;
    public final y5.a f1667c;
    public final boolean d;
    public final boolean e;

    public w(int i10, IBinder iBinder, y5.a aVar, boolean z4, boolean z10) {
        this.f1665a = i10;
        this.f1666b = iBinder;
        this.f1667c = aVar;
        this.d = z4;
        this.e = z10;
    }

    public final boolean equals(Object obj) {
        Object aVar;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof w) {
                    w wVar = (w) obj;
                    if (this.f1667c.equals(wVar.f1667c)) {
                        Object obj2 = null;
                        IBinder iBinder = this.f1666b;
                        if (iBinder == null) {
                            aVar = null;
                        } else {
                            int i10 = a.f1569b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof i) {
                                aVar = (i) queryLocalInterface;
                            } else {
                                aVar = new a7.a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 0);
                            }
                        }
                        IBinder iBinder2 = wVar.f1666b;
                        if (iBinder2 != null) {
                            int i11 = a.f1569b;
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
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f1665a);
        f5.f(parcel, 2, this.f1666b);
        f5.k(parcel, 3, this.f1667c, i10);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f5.r(parcel, q10);
    }
}
