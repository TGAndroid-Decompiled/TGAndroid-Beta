package o5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import h7.r8;
import n6.w0;

public final class a extends z5.a {

    public final String f19297a;

    public final String f19298b;

    public final k f19299c;
    public final f d;

    public final boolean f19300e;

    public final boolean f19301f;
    public static final r5.b h = new r5.b("CastMediaOptions", null);
    public static final Parcelable.Creator<a> CREATOR = new w0(6);

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z10, boolean z11) {
        k kVar;
        this.f19297a = str;
        this.f19298b = str2;
        if (iBinder == null) {
            kVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            kVar = iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new k(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 1);
        }
        this.f19299c = kVar;
        this.d = fVar;
        this.f19300e = z10;
        this.f19301f = z11;
    }

    public final void b() {
        k kVar = this.f19299c;
        if (kVar != null) {
            try {
                Parcel parcelO0 = kVar.O0(kVar.M0(), 2);
                i6.a aVarJ0 = i6.b.J0(parcelO0.readStrongBinder());
                parcelO0.recycle();
                if (i6.b.K0(aVarJ0) == null) {
                } else {
                    throw new ClassCastException();
                }
            } catch (RemoteException e9) {
                h.a(e9, "Unable to call %s on %s.", "getWrappedClientObject", k.class.getSimpleName());
            }
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f19297a);
        r8.l(parcel, 3, this.f19298b);
        k kVar = this.f19299c;
        r8.f(parcel, 4, kVar == null ? null : kVar.f2456b);
        r8.k(parcel, 5, this.d, i10);
        r8.s(parcel, 6, 4);
        parcel.writeInt(this.f19300e ? 1 : 0);
        r8.s(parcel, 7, 4);
        parcel.writeInt(this.f19301f ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
