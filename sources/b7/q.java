package b7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class q extends y5.a {
    public static final Parcelable.Creator<q> CREATOR = new o(2);
    public final int f1579a;
    public final p f1580b;
    public final q7.q f1581c;
    public final q7.n d;
    public final PendingIntent f1582e;
    public final b0 f1583f;
    public final String h;

    public q(int i9, p pVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        q7.q qVar;
        q7.n nVar;
        this.f1579a = i9;
        this.f1580b = pVar;
        b0 b0Var = null;
        if (iBinder != null) {
            int i10 = q7.p.f46114b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface instanceof q7.q) {
                qVar = (q7.q) queryLocalInterface;
            } else {
                qVar = new a(iBinder, "com.google.android.gms.location.ILocationListener", 0);
            }
        } else {
            qVar = null;
        }
        this.f1581c = qVar;
        this.f1582e = pendingIntent;
        if (iBinder2 != null) {
            int i11 = k.f1564c;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface2 instanceof q7.n) {
                nVar = (q7.n) queryLocalInterface2;
            } else {
                nVar = new a(iBinder2, "com.google.android.gms.location.ILocationCallback", 0);
            }
        } else {
            nVar = null;
        }
        this.d = nVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface3 instanceof b0) {
                b0Var = (b0) queryLocalInterface3;
            } else {
                b0Var = new a(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 0);
            }
        }
        this.f1583f = b0Var;
        this.h = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        IBinder asBinder;
        IBinder asBinder2;
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f1579a);
        p8.k(parcel, 2, this.f1580b, i9);
        IBinder iBinder = null;
        q7.q qVar = this.f1581c;
        if (qVar == null) {
            asBinder = null;
        } else {
            asBinder = qVar.asBinder();
        }
        p8.f(parcel, 3, asBinder);
        p8.k(parcel, 4, this.f1582e, i9);
        q7.n nVar = this.d;
        if (nVar == null) {
            asBinder2 = null;
        } else {
            asBinder2 = nVar.asBinder();
        }
        p8.f(parcel, 5, asBinder2);
        b0 b0Var = this.f1583f;
        if (b0Var != null) {
            iBinder = b0Var.asBinder();
        }
        p8.f(parcel, 6, iBinder);
        p8.l(parcel, 8, this.h);
        p8.r(parcel, q10);
    }
}
