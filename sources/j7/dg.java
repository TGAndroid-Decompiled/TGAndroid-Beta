package j7;

import android.os.Parcel;
import android.os.Parcelable;
public final class dg extends b7.a {
    public final ig U0(h6.b bVar, ag agVar) {
        ig createFromParcel;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f1550c);
        int i9 = t.f14098a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        agVar.writeToParcel(obtain, 0);
        Parcel O0 = O0(obtain, 3);
        Parcelable.Creator<ig> creator = ig.CREATOR;
        if (O0.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(O0);
        }
        ig igVar = createFromParcel;
        O0.recycle();
        return igVar;
    }
}
