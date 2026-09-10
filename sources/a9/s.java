package a9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public abstract class s extends Binder implements IInterface {
    public s(String str) {
        attachInterface(this, str);
    }

    public abstract boolean a(int i10, Parcel parcel, Parcel parcel2, int i11);

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 > 16777215) {
            if (super.onTransact(i10, parcel, parcel2, i11)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return a(i10, parcel, parcel2, i11);
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
