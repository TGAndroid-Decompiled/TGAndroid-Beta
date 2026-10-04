package n6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
public final class v extends o6.a {
    public static final Parcelable.Creator<v> CREATOR = new m8.h(16);
    public final int f16752a;
    public final IBinder f16753b;
    public final k6.a f16754c;
    public final boolean d;
    public final boolean f16755e;

    public v(int i10, IBinder iBinder, k6.a aVar, boolean z10, boolean z11) {
        this.f16752a = i10;
        this.f16753b = iBinder;
        this.f16754c = aVar;
        this.d = z10;
        this.f16755e = z11;
    }

    public final boolean equals(Object obj) {
        Object aVar;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof v) {
                    v vVar = (v) obj;
                    if (this.f16754c.equals(vVar.f16754c)) {
                        Object obj2 = null;
                        IBinder iBinder = this.f16753b;
                        if (iBinder == null) {
                            aVar = null;
                        } else {
                            int i10 = a.f16652b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof h) {
                                aVar = (h) queryLocalInterface;
                            } else {
                                aVar = new a9.a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 7);
                            }
                        }
                        IBinder iBinder2 = vVar.f16753b;
                        if (iBinder2 != null) {
                            int i11 = a.f16652b;
                            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface2 instanceof h) {
                                obj2 = (h) queryLocalInterface2;
                            } else {
                                obj2 = new a9.a(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 7);
                            }
                        }
                        if (l.l(aVar, obj2)) {
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
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f16752a);
        w7.g0.f(parcel, 2, this.f16753b);
        w7.g0.k(parcel, 3, this.f16754c, i10);
        w7.g0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.g0.s(parcel, 5, 4);
        parcel.writeInt(this.f16755e ? 1 : 0);
        w7.g0.r(parcel, q6);
    }
}
