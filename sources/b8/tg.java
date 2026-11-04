package b8;

import android.os.Parcel;
import android.os.Parcelable;
public final class tg extends a {
    public final yg X0(z6.b bVar, qg qgVar) {
        yg createFromParcel;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2457c);
        int i3 = a0.f2458a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        qgVar.writeToParcel(obtain, 0);
        Parcel R0 = R0(obtain, 3);
        Parcelable.Creator<yg> creator = yg.CREATOR;
        if (R0.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(R0);
        }
        yg ygVar = createFromParcel;
        R0.recycle();
        return ygVar;
    }
}
