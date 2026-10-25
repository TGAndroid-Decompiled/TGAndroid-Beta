package a8;

import android.os.Parcel;
import android.os.Parcelable;
public final class wg extends a {
    public final bh V0(y6.b bVar, tg tgVar) {
        bh createFromParcel;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f344c);
        int i10 = a0.f345a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        tgVar.writeToParcel(obtain, 0);
        Parcel P0 = P0(obtain, 3);
        Parcelable.Creator<bh> creator = bh.CREATOR;
        if (P0.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(P0);
        }
        bh bhVar = createFromParcel;
        P0.recycle();
        return bhVar;
    }
}
