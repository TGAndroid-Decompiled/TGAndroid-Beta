package e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import c7.r0;
import w7.c0;
public final class a extends o6.a {
    public final String f8634a;
    public final String f8635b;
    public final l f8636c;
    public final f d;
    public final boolean f8637e;
    public final boolean f8638f;
    public static final g6.b h = new g6.b("CastMediaOptions", null);
    public static final Parcelable.Creator<a> CREATOR = new r0(29);

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z10, boolean z11) {
        l aVar;
        this.f8634a = str;
        this.f8635b = str2;
        if (iBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof l) {
                aVar = (l) queryLocalInterface;
            } else {
                aVar = new a9.a(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 1);
            }
        }
        this.f8636c = aVar;
        this.d = fVar;
        this.f8637e = z10;
        this.f8638f = z11;
    }

    public final void b() {
        l lVar = this.f8636c;
        if (lVar != null) {
            try {
                Parcel P0 = lVar.P0(lVar.N0(), 2);
                x6.a K0 = x6.b.K0(P0.readStrongBinder());
                P0.recycle();
                if (x6.b.L0(K0) != null) {
                    throw new ClassCastException();
                }
            } catch (RemoteException e7) {
                h.a(e7, "Unable to call %s on %s.", "getWrappedClientObject", l.class.getSimpleName());
            }
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder iBinder;
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 2, this.f8634a);
        c0.l(parcel, 3, this.f8635b);
        l lVar = this.f8636c;
        if (lVar == null) {
            iBinder = null;
        } else {
            iBinder = lVar.f338b;
        }
        c0.f(parcel, 4, iBinder);
        c0.k(parcel, 5, this.d, i10);
        c0.s(parcel, 6, 4);
        parcel.writeInt(this.f8637e ? 1 : 0);
        c0.s(parcel, 7, 4);
        parcel.writeInt(this.f8638f ? 1 : 0);
        c0.r(parcel, q6);
    }
}
