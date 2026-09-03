package f7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class p extends c6.a {
    public static final Parcelable.Creator<p> CREATOR = new n(2);
    public final int f6025a;
    public final o f6026b;
    public final u7.p f6027c;
    public final u7.m d;
    public final PendingIntent e;
    public final z f6028f;
    public final String h;

    public p(int i10, o oVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        u7.p pVar;
        u7.m mVar;
        this.f6025a = i10;
        this.f6026b = oVar;
        z zVar = null;
        if (iBinder != null) {
            int i11 = u7.o.f45257b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface instanceof u7.p) {
                pVar = (u7.p) queryLocalInterface;
            } else {
                pVar = new a7.a(iBinder, "com.google.android.gms.location.ILocationListener", 4);
            }
        } else {
            pVar = null;
        }
        this.f6027c = pVar;
        this.e = pendingIntent;
        if (iBinder2 != null) {
            int i12 = j.f6012c;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface2 instanceof u7.m) {
                mVar = (u7.m) queryLocalInterface2;
            } else {
                mVar = new a7.a(iBinder2, "com.google.android.gms.location.ILocationCallback", 4);
            }
        } else {
            mVar = null;
        }
        this.d = mVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface3 instanceof z) {
                zVar = (z) queryLocalInterface3;
            } else {
                zVar = new a7.a(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 4);
            }
        }
        this.f6028f = zVar;
        this.h = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        IBinder asBinder2;
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f6025a);
        f5.k(parcel, 2, this.f6026b, i10);
        IBinder iBinder = null;
        u7.p pVar = this.f6027c;
        if (pVar == null) {
            asBinder = null;
        } else {
            asBinder = pVar.asBinder();
        }
        f5.f(parcel, 3, asBinder);
        f5.k(parcel, 4, this.e, i10);
        u7.m mVar = this.d;
        if (mVar == null) {
            asBinder2 = null;
        } else {
            asBinder2 = mVar.asBinder();
        }
        f5.f(parcel, 5, asBinder2);
        z zVar = this.f6028f;
        if (zVar != null) {
            iBinder = zVar.asBinder();
        }
        f5.f(parcel, 6, iBinder);
        f5.l(parcel, 8, this.h);
        f5.r(parcel, q10);
    }
}
