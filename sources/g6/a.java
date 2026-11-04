package g6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import f6.c0;
public final class a extends q6.a {
    public final String f11972a;
    public final String f11973b;
    public final k f11974c;
    public final f d;
    public final boolean f11975e;
    public final boolean f11976f;
    public static final i6.b h = new i6.b("CastMediaOptions", null);
    public static final Parcelable.Creator<a> CREATOR = new c0(2);

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z10, boolean z11) {
        k aVar;
        this.f11972a = str;
        this.f11973b = str2;
        if (iBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof k) {
                aVar = (k) queryLocalInterface;
            } else {
                aVar = new b8.a(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 2);
            }
        }
        this.f11974c = aVar;
        this.d = fVar;
        this.f11975e = z10;
        this.f11976f = z11;
    }

    public final void b() {
        k kVar = this.f11974c;
        if (kVar != null) {
            try {
                Parcel R0 = kVar.R0(kVar.P0(), 2);
                z6.a M0 = z6.b.M0(R0.readStrongBinder());
                R0.recycle();
                if (z6.b.N0(M0) != null) {
                    throw new ClassCastException();
                }
            } catch (RemoteException e10) {
                h.a(e10, "Unable to call %s on %s.", "getWrappedClientObject", k.class.getSimpleName());
            }
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        IBinder iBinder;
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f11972a);
        j8.a.m(parcel, 3, this.f11973b);
        k kVar = this.f11974c;
        if (kVar == null) {
            iBinder = null;
        } else {
            iBinder = kVar.f2456b;
        }
        j8.a.g(parcel, 4, iBinder);
        j8.a.l(parcel, 5, this.d, i3);
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(this.f11975e ? 1 : 0);
        j8.a.r(parcel, 7, 4);
        parcel.writeInt(this.f11976f ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
