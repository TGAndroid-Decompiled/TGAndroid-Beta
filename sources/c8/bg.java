package c8;

import android.os.Parcel;
import android.os.Parcelable;
public final class bg extends a8.a {
    public final gg x1(a7.b bVar, yf yfVar) {
        gg createFromParcel;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f307c);
        int i7 = t.f5841a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        yfVar.writeToParcel(obtain, 0);
        Parcel r12 = r1(obtain, 3);
        Parcelable.Creator<gg> creator = gg.CREATOR;
        if (r12.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(r12);
        }
        gg ggVar = createFromParcel;
        r12.recycle();
        return ggVar;
    }
}
