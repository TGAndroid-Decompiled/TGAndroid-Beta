package n7;

import android.os.Parcel;
import android.os.Parcelable;
public final class eg extends a7.a {
    public final jg U0(l6.b bVar, bg bgVar) {
        jg createFromParcel;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f136c);
        int i10 = t.f15730a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        bgVar.writeToParcel(obtain, 0);
        Parcel O0 = O0(obtain, 3);
        Parcelable.Creator<jg> creator = jg.CREATOR;
        if (O0.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(O0);
        }
        jg jgVar = createFromParcel;
        O0.recycle();
        return jgVar;
    }
}
