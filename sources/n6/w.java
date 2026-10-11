package n6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new m8.h(16);
    public final int f16771a;
    public final IBinder f16772b;
    public final k6.a f16773c;
    public final boolean d;
    public final boolean f16774e;

    public w(int i10, IBinder iBinder, k6.a aVar, boolean z10, boolean z11) {
        this.f16771a = i10;
        this.f16772b = iBinder;
        this.f16773c = aVar;
        this.d = z10;
        this.f16774e = z11;
    }

    public final boolean equals(Object obj) {
        Object aVar;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof w) {
                    w wVar = (w) obj;
                    if (this.f16773c.equals(wVar.f16773c)) {
                        Object obj2 = null;
                        IBinder iBinder = this.f16772b;
                        if (iBinder == null) {
                            aVar = null;
                        } else {
                            int i10 = a.f16667b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof h) {
                                aVar = (h) queryLocalInterface;
                            } else {
                                aVar = new a9.a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 7);
                            }
                        }
                        IBinder iBinder2 = wVar.f16772b;
                        if (iBinder2 != null) {
                            int i11 = a.f16667b;
                            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface2 instanceof h) {
                                obj2 = (h) queryLocalInterface2;
                            } else {
                                obj2 = new a9.a(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 7);
                            }
                        }
                        if (m.l(aVar, obj2)) {
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f16771a);
        w7.d0.f(parcel, 2, this.f16772b);
        w7.d0.k(parcel, 3, this.f16773c, i10);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.d0.s(parcel, 5, 4);
        parcel.writeInt(this.f16774e ? 1 : 0);
        w7.d0.r(parcel, q6);
    }
}
