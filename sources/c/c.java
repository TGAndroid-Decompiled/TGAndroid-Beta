package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
public final class c extends Binder implements b {
    public static final int f3929b = 0;
    public final d f3930a;

    public c(d dVar) {
        this.f3930a = dVar;
        attachInterface(this, b.h);
    }

    @Override
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        Object obj;
        String str = b.h;
        if (i3 >= 1 && i3 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i3 == 1598968902) {
            parcel2.writeString(str);
            return true;
        } else if (i3 != 1) {
            return super.onTransact(i3, parcel, parcel2, i10);
        } else {
            int readInt = parcel.readInt();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            this.f3930a.a(readInt, (Bundle) obj);
            return true;
        }
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
