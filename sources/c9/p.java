package c9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public abstract class p extends Binder implements IInterface {
    public p(String str) {
        attachInterface(this, str);
    }

    public abstract boolean a(int i3, Parcel parcel, Parcel parcel2, int i10);

    @Override
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        if (i3 > 16777215) {
            if (super.onTransact(i3, parcel, parcel2, i10)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return a(i3, parcel, parcel2, i10);
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
