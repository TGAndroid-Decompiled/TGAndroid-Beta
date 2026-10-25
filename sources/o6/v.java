package o6;

import a8.df;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
public final class v extends p6.a {
    public static final Parcelable.Creator<v> CREATOR = new n4.x(14);
    public final int f19187a;
    public final IBinder f19188b;
    public final l6.a f19189c;
    public final boolean d;
    public final boolean e;

    public v(int i10, IBinder iBinder, l6.a aVar, boolean z10, boolean z11) {
        this.f19187a = i10;
        this.f19188b = iBinder;
        this.f19189c = aVar;
        this.d = z10;
        this.e = z11;
    }

    public final boolean equals(Object obj) {
        Object aVar;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof v) {
                    v vVar = (v) obj;
                    if (this.f19189c.equals(vVar.f19189c)) {
                        Object obj2 = null;
                        IBinder iBinder = this.f19188b;
                        if (iBinder == null) {
                            aVar = null;
                        } else {
                            int i10 = a.f19095b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof h) {
                                aVar = (h) queryLocalInterface;
                            } else {
                                aVar = new a8.a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 8);
                            }
                        }
                        IBinder iBinder2 = vVar.f19188b;
                        if (iBinder2 != null) {
                            int i11 = a.f19095b;
                            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface2 instanceof h) {
                                obj2 = (h) queryLocalInterface2;
                            } else {
                                obj2 = new a8.a(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 8);
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
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f19187a);
        df.f(parcel, 2, this.f19188b);
        df.k(parcel, 3, this.f19189c, i10);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        df.r(parcel, q5);
    }
}
