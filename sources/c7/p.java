package c7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class p extends z5.a {
    public static final Parcelable.Creator<p> CREATOR = new n(2);

    public final int f2485a;

    public final o f2486b;

    public final r7.p f2487c;
    public final r7.m d;

    public final PendingIntent f2488e;

    public final a0 f2489f;
    public final String h;

    public p(int i10, o oVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        r7.p nVar;
        r7.m lVar;
        this.f2485a = i10;
        this.f2486b = oVar;
        a0 yVar = null;
        if (iBinder != null) {
            int i11 = r7.o.f46873b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            nVar = iInterfaceQueryLocalInterface instanceof r7.p ? (r7.p) iInterfaceQueryLocalInterface : new r7.n(iBinder, "com.google.android.gms.location.ILocationListener", 0);
        } else {
            nVar = null;
        }
        this.f2487c = nVar;
        this.f2488e = pendingIntent;
        if (iBinder2 != null) {
            int i12 = j.f2470c;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            lVar = iInterfaceQueryLocalInterface2 instanceof r7.m ? (r7.m) iInterfaceQueryLocalInterface2 : new r7.l(iBinder2, "com.google.android.gms.location.ILocationCallback", 0);
        } else {
            lVar = null;
        }
        this.d = lVar;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            yVar = iInterfaceQueryLocalInterface3 instanceof a0 ? (a0) iInterfaceQueryLocalInterface3 : new y(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 0);
        }
        this.f2489f = yVar;
        this.h = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f2485a);
        r8.k(parcel, 2, this.f2486b, i10);
        r7.p pVar = this.f2487c;
        r8.f(parcel, 3, pVar == null ? null : pVar.asBinder());
        r8.k(parcel, 4, this.f2488e, i10);
        r7.m mVar = this.d;
        r8.f(parcel, 5, mVar == null ? null : mVar.asBinder());
        a0 a0Var = this.f2489f;
        r8.f(parcel, 6, a0Var != null ? a0Var.asBinder() : null);
        r8.l(parcel, 8, this.h);
        r8.r(parcel, iQ);
    }
}
