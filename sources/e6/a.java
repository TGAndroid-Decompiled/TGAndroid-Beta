package e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import c7.r0;
import w7.e0;
public final class a extends o6.a {
    public final String f7283a;
    public final String f7284b;
    public final l f7285c;
    public final f d;
    public final boolean e;
    public final boolean f7286f;
    public static final g6.b h = new g6.b("CastMediaOptions", null);
    public static final Parcelable.Creator<a> CREATOR = new r0(29);

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z10, boolean z11) {
        l aVar;
        this.f7283a = str;
        this.f7284b = str2;
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
        this.f7285c = aVar;
        this.d = fVar;
        this.e = z10;
        this.f7286f = z11;
    }

    public final void b() {
        l lVar = this.f7285c;
        if (lVar != null) {
            try {
                Parcel Q0 = lVar.Q0(lVar.O0(), 2);
                x6.a L0 = x6.b.L0(Q0.readStrongBinder());
                Q0.recycle();
                if (x6.b.M0(L0) != null) {
                    throw new ClassCastException();
                }
            } catch (RemoteException e) {
                h.a(e, "Unable to call %s on %s.", "getWrappedClientObject", l.class.getSimpleName());
            }
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder iBinder;
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f7283a);
        e0.l(parcel, 3, this.f7284b);
        l lVar = this.f7285c;
        if (lVar == null) {
            iBinder = null;
        } else {
            iBinder = lVar.f311b;
        }
        e0.f(parcel, 4, iBinder);
        e0.k(parcel, 5, this.d, i10);
        e0.s(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        e0.s(parcel, 7, 4);
        parcel.writeInt(this.f7286f ? 1 : 0);
        e0.r(parcel, q6);
    }
}
