package o5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import g7.p8;
import m6.r0;
public final class a extends y5.a {
    public final String f18950a;
    public final String f18951b;
    public final k f18952c;
    public final f d;
    public final boolean f18953e;
    public final boolean f18954f;
    public static final q5.b h = new q5.b("CastMediaOptions", null);
    public static final Parcelable.Creator<a> CREATOR = new r0(28);

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z10, boolean z11) {
        k aVar;
        this.f18950a = str;
        this.f18951b = str2;
        if (iBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof k) {
                aVar = (k) queryLocalInterface;
            } else {
                aVar = new b7.a(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 2);
            }
        }
        this.f18952c = aVar;
        this.d = fVar;
        this.f18953e = z10;
        this.f18954f = z11;
    }

    public final void b() {
        k kVar = this.f18952c;
        if (kVar != null) {
            try {
                Parcel O0 = kVar.O0(kVar.M0(), 2);
                h6.a J0 = h6.b.J0(O0.readStrongBinder());
                O0.recycle();
                if (h6.b.K0(J0) != null) {
                    throw new ClassCastException();
                }
            } catch (RemoteException e10) {
                h.a(e10, "Unable to call %s on %s.", "getWrappedClientObject", k.class.getSimpleName());
            }
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        IBinder iBinder;
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f18950a);
        p8.l(parcel, 3, this.f18951b);
        k kVar = this.f18952c;
        if (kVar == null) {
            iBinder = null;
        } else {
            iBinder = kVar.f1549b;
        }
        p8.f(parcel, 4, iBinder);
        p8.k(parcel, 5, this.d, i9);
        p8.s(parcel, 6, 4);
        parcel.writeInt(this.f18953e ? 1 : 0);
        p8.s(parcel, 7, 4);
        parcel.writeInt(this.f18954f ? 1 : 0);
        p8.r(parcel, q10);
    }
}
