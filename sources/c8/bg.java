package c8;

import android.os.Parcel;
import android.os.Parcelable;
public final class bg extends a8.a {
    public final gg X0(a7.b bVar, yf yfVar) {
        gg createFromParcel;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f307c);
        int i7 = t.f5843a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        yfVar.writeToParcel(obtain, 0);
        Parcel R0 = R0(obtain, 3);
        Parcelable.Creator<gg> creator = gg.CREATOR;
        if (R0.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(R0);
        }
        gg ggVar = createFromParcel;
        R0.recycle();
        return ggVar;
    }
}
