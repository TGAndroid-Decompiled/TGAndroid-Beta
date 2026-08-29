package l7;

import android.os.Parcel;
import android.os.Parcelable;
public final class dg extends com.google.android.gms.internal.cast.a {
    public final ig U0(j6.b bVar, ag agVar) {
        ig createFromParcel;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3997c);
        int i10 = t.f14957a;
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
