package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
public final class c extends Binder implements b {
    public static final int f5217b = 0;
    public final d f5218a;

    public c(d dVar) {
        this.f5218a = dVar;
        attachInterface(this, b.h);
    }

    @Override
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        Object obj;
        String str = b.h;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i7 == 1598968902) {
            parcel2.writeString(str);
            return true;
        } else if (i7 != 1) {
            return super.onTransact(i7, parcel, parcel2, i10);
        } else {
            int readInt = parcel.readInt();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            this.f5218a.a(readInt, (Bundle) obj);
            return true;
        }
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
