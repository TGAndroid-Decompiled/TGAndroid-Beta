package h6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import c8.xb;
import f7.t0;
public final class a extends r6.a {
    public final String f14213a;
    public final String f14214b;
    public final k f14215c;
    public final f d;
    public final boolean f14216e;
    public final boolean f14217f;
    public static final j6.b h = new j6.b("CastMediaOptions", null);
    public static final Parcelable.Creator<a> CREATOR = new t0(17);

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z9, boolean z10) {
        k aVar;
        this.f14213a = str;
        this.f14214b = str2;
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
        this.f14215c = aVar;
        this.d = fVar;
        this.f14216e = z9;
        this.f14217f = z10;
    }

    public final void b() {
        k kVar = this.f14215c;
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
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f14213a);
        xb.l(parcel, 3, this.f14214b);
        k kVar = this.f14215c;
        if (kVar == null) {
            iBinder = null;
        } else {
            iBinder = kVar.f306b;
        }
        xb.f(parcel, 4, iBinder);
        xb.k(parcel, 5, this.d, i7);
        xb.q(parcel, 6, 4);
        parcel.writeInt(this.f14216e ? 1 : 0);
        xb.q(parcel, 7, 4);
        parcel.writeInt(this.f14217f ? 1 : 0);
        xb.s(parcel, r10);
    }
}
