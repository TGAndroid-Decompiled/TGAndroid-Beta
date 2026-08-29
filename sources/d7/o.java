package d7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
public final class o extends a6.a {
    public static final Parcelable.Creator<o> CREATOR = new m(2);
    public final int f5454a;
    public final n f5455b;
    public final s7.p f5456c;
    public final s7.m d;
    public final PendingIntent f5457e;
    public final y f5458f;
    public final String h;

    public o(int i10, n nVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        s7.p pVar;
        s7.m mVar;
        this.f5454a = i10;
        this.f5455b = nVar;
        y yVar = null;
        if (iBinder != null) {
            int i11 = s7.o.f47685b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface instanceof s7.p) {
                pVar = (s7.p) queryLocalInterface;
            } else {
                pVar = new com.google.android.gms.internal.cast.a(iBinder, "com.google.android.gms.location.ILocationListener", 3);
            }
        } else {
            pVar = null;
        }
        this.f5456c = pVar;
        this.f5457e = pendingIntent;
        if (iBinder2 != null) {
            int i12 = i.f5439c;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface2 instanceof s7.m) {
                mVar = (s7.m) queryLocalInterface2;
            } else {
                mVar = new com.google.android.gms.internal.cast.a(iBinder2, "com.google.android.gms.location.ILocationCallback", 3);
            }
        } else {
            mVar = null;
        }
        this.d = mVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface3 instanceof y) {
                yVar = (y) queryLocalInterface3;
            } else {
                yVar = new com.google.android.gms.internal.cast.a(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 3);
            }
        }
        this.f5458f = yVar;
        this.h = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        IBinder asBinder2;
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f5454a);
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.f5455b, i10);
        IBinder iBinder = null;
        s7.p pVar = this.f5456c;
        if (pVar == null) {
            asBinder = null;
        } else {
            asBinder = pVar.asBinder();
        }
        com.google.android.gms.internal.cast.o.f(parcel, 3, asBinder);
        com.google.android.gms.internal.cast.o.k(parcel, 4, this.f5457e, i10);
        s7.m mVar = this.d;
        if (mVar == null) {
            asBinder2 = null;
        } else {
            asBinder2 = mVar.asBinder();
        }
        com.google.android.gms.internal.cast.o.f(parcel, 5, asBinder2);
        y yVar = this.f5458f;
        if (yVar != null) {
            iBinder = yVar.asBinder();
        }
        com.google.android.gms.internal.cast.o.f(parcel, 6, iBinder);
        com.google.android.gms.internal.cast.o.l(parcel, 8, this.h);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
