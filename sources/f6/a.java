package f6;

import a8.df;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import d7.r0;
public final class a extends p6.a {
    public final String f10182a;
    public final String f10183b;
    public final l f10184c;
    public final f d;
    public final boolean e;
    public final boolean f10185f;
    public static final h6.b h = new h6.b("CastMediaOptions", null);
    public static final Parcelable.Creator<a> CREATOR = new r0(29);

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z10, boolean z11) {
        l aVar;
        this.f10182a = str;
        this.f10183b = str2;
        if (iBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof l) {
                aVar = (l) queryLocalInterface;
            } else {
                aVar = new a8.a(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 2);
            }
        }
        this.f10184c = aVar;
        this.d = fVar;
        this.e = z10;
        this.f10185f = z11;
    }

    public final void b() {
        l lVar = this.f10184c;
        if (lVar != null) {
            try {
                Parcel P0 = lVar.P0(lVar.N0(), 2);
                y6.a K0 = y6.b.K0(P0.readStrongBinder());
                P0.recycle();
                if (y6.b.L0(K0) != null) {
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
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f10182a);
        df.l(parcel, 3, this.f10183b);
        l lVar = this.f10184c;
        if (lVar == null) {
            iBinder = null;
        } else {
            iBinder = lVar.f343b;
        }
        df.f(parcel, 4, iBinder);
        df.k(parcel, 5, this.d, i10);
        df.s(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        df.s(parcel, 7, 4);
        parcel.writeInt(this.f10185f ? 1 : 0);
        df.r(parcel, q5);
    }
}
