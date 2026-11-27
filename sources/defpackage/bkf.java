package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class bkf extends v3d {
    public final jkf Z(br7 br7Var, vjf vjfVar) {
        jkf createFromParcel;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i = nld.a;
        obtain.writeStrongBinder(br7Var);
        obtain.writeInt(1);
        vjfVar.writeToParcel(obtain, 0);
        Parcel T = T(obtain, 3);
        Parcelable.Creator<jkf> creator = jkf.CREATOR;
        if (T.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(T);
        }
        jkf jkfVar = createFromParcel;
        T.recycle();
        return jkfVar;
    }
}
