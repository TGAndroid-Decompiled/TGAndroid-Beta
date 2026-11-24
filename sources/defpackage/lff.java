package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class lff extends ezc {
    public final tff Z(bo7 bo7Var, fff fffVar) {
        tff createFromParcel;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i = wgd.a;
        obtain.writeStrongBinder(bo7Var);
        obtain.writeInt(1);
        fffVar.writeToParcel(obtain, 0);
        Parcel T = T(obtain, 3);
        Parcelable.Creator<tff> creator = tff.CREATOR;
        if (T.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(T);
        }
        tff tffVar = createFromParcel;
        T.recycle();
        return tffVar;
    }
}
