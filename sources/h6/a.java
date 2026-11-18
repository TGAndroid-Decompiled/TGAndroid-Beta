package h6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import c8.bc;
import f7.t0;
public final class a extends r6.a {
    public final String f13887a;
    public final String f13888b;
    public final k f13889c;
    public final f d;
    public final boolean f13890e;
    public final boolean f13891f;
    public static final j6.b h = new j6.b("CastMediaOptions", null);
    public static final Parcelable.Creator<a> CREATOR = new t0(17);

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z10, boolean z11) {
        k aVar;
        this.f13887a = str;
        this.f13888b = str2;
        if (iBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof k) {
                aVar = (k) queryLocalInterface;
            } else {
                aVar = new a8.a(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 2);
            }
        }
        this.f13889c = aVar;
        this.d = fVar;
        this.f13890e = z10;
        this.f13891f = z11;
    }

    public final void b() {
        k kVar = this.f13889c;
        if (kVar != null) {
            try {
                Parcel r12 = kVar.r1(kVar.p1(), 2);
                a7.a m12 = a7.b.m1(r12.readStrongBinder());
                r12.recycle();
                if (a7.b.n1(m12) != null) {
                    throw new ClassCastException();
                }
            } catch (RemoteException e10) {
                h.a(e10, "Unable to call %s on %s.", "getWrappedClientObject", k.class.getSimpleName());
            }
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        IBinder iBinder;
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f13887a);
        bc.l(parcel, 3, this.f13888b);
        k kVar = this.f13889c;
        if (kVar == null) {
            iBinder = null;
        } else {
            iBinder = kVar.f306b;
        }
        bc.f(parcel, 4, iBinder);
        bc.k(parcel, 5, this.d, i7);
        bc.q(parcel, 6, 4);
        parcel.writeInt(this.f13890e ? 1 : 0);
        bc.q(parcel, 7, 4);
        parcel.writeInt(this.f13891f ? 1 : 0);
        bc.s(parcel, r10);
    }
}
