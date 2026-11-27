package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
public final class le9 extends Binder implements cl5 {
    public static final int b = 0;
    public final me9 a;

    public le9(me9 me9Var) {
        this.a = me9Var;
        attachInterface(this, cl5.h);
    }

    @Override
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Object obj;
        String str = cl5.h;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        } else if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            int readInt = parcel.readInt();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            this.a.a(readInt, (Bundle) obj);
            return true;
        }
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
