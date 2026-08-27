package k7;

import android.os.Parcel;

public final class dg extends c7.a {
    public final ig U0(i6.b bVar, ag agVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f2457c);
        int i10 = t.f14952a;
        parcelObtain.writeStrongBinder(bVar);
        parcelObtain.writeInt(1);
        agVar.writeToParcel(parcelObtain, 0);
        Parcel parcelO0 = O0(parcelObtain, 3);
        ig igVarCreateFromParcel = parcelO0.readInt() == 0 ? null : ig.CREATOR.createFromParcel(parcelO0);
        parcelO0.recycle();
        return igVarCreateFromParcel;
    }
}
