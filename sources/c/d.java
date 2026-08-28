package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
public final class d extends Binder implements b {
    public static final int f2049b = 0;
    public final e f2050a;

    public d(e eVar) {
        this.f2050a = eVar;
        attachInterface(this, b.h);
    }

    @Override
    public final boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        Object obj;
        String str = b.h;
        if (i9 >= 1 && i9 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i9 == 1598968902) {
            parcel2.writeString(str);
            return true;
        } else if (i9 != 1) {
            return super.onTransact(i9, parcel, parcel2, i10);
        } else {
            int readInt = parcel.readInt();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            this.f2050a.a(readInt, (Bundle) obj);
            return true;
        }
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
