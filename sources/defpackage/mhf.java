package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class mhf extends f1d {
    public final uhf Z(eq7 eq7Var, ghf ghfVar) {
        uhf createFromParcel;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i = xid.a;
        obtain.writeStrongBinder(eq7Var);
        obtain.writeInt(1);
        ghfVar.writeToParcel(obtain, 0);
        Parcel T = T(obtain, 3);
        Parcelable.Creator<uhf> creator = uhf.CREATOR;
        if (T.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(T);
        }
        uhf uhfVar = createFromParcel;
        T.recycle();
        return uhfVar;
    }
}
