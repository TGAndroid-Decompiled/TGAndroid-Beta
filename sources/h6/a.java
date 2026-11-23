package h6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import c8.cc;
import f7.t0;
public final class a extends r6.a {
    public final String f13879a;
    public final String f13880b;
    public final k f13881c;
    public final f d;
    public final boolean f13882e;
    public final boolean f13883f;
    public static final j6.b h = new j6.b("CastMediaOptions", null);
    public static final Parcelable.Creator<a> CREATOR = new t0(17);

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z10, boolean z11) {
        k aVar;
        this.f13879a = str;
        this.f13880b = str2;
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
        this.f13881c = aVar;
        this.d = fVar;
        this.f13882e = z10;
        this.f13883f = z11;
    }

    public final void b() {
        k kVar = this.f13881c;
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
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f13879a);
        cc.l(parcel, 3, this.f13880b);
        k kVar = this.f13881c;
        if (kVar == null) {
            iBinder = null;
        } else {
            iBinder = kVar.f306b;
        }
        cc.f(parcel, 4, iBinder);
        cc.k(parcel, 5, this.d, i7);
        cc.q(parcel, 6, 4);
        parcel.writeInt(this.f13882e ? 1 : 0);
        cc.q(parcel, 7, 4);
        parcel.writeInt(this.f13883f ? 1 : 0);
        cc.s(parcel, r10);
    }
}
