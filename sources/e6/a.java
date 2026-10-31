package e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import c7.r0;
import w7.h0;
public final class a extends o6.a {
    public final String f6254a;
    public final String f6255b;
    public final k f6256c;
    public final f d;
    public final boolean e;
    public final boolean f6257f;
    public static final g6.b h = new g6.b("CastMediaOptions", null);
    public static final Parcelable.Creator<a> CREATOR = new r0(28);

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z10, boolean z11) {
        k aVar;
        this.f6254a = str;
        this.f6255b = str2;
        if (iBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof k) {
                aVar = (k) queryLocalInterface;
            } else {
                aVar = new a9.a(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 1);
            }
        }
        this.f6256c = aVar;
        this.d = fVar;
        this.e = z10;
        this.f6257f = z11;
    }

    public final void b() {
        k kVar = this.f6256c;
        if (kVar != null) {
            try {
                Parcel R0 = kVar.R0(kVar.P0(), 2);
                x6.a M0 = x6.b.M0(R0.readStrongBinder());
                R0.recycle();
                if (x6.b.N0(M0) != null) {
                    throw new ClassCastException();
                }
            } catch (RemoteException e) {
                h.a(e, "Unable to call %s on %s.", "getWrappedClientObject", k.class.getSimpleName());
            }
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder iBinder;
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f6254a);
        h0.l(parcel, 3, this.f6255b);
        k kVar = this.f6256c;
        if (kVar == null) {
            iBinder = null;
        } else {
            iBinder = kVar.f317b;
        }
        h0.f(parcel, 4, iBinder);
        h0.k(parcel, 5, this.d, i10);
        h0.s(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        h0.s(parcel, 7, 4);
        parcel.writeInt(this.f6257f ? 1 : 0);
        h0.r(parcel, q6);
    }
}
