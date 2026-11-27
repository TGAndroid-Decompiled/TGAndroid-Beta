package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public abstract class wfd extends Binder implements IInterface {
    @Override
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        gsd gsdVar = (gsd) this;
        if (i != 1) {
            boolean z = false;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        String stringFlagValue = gsdVar.getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(stringFlagValue);
                        return true;
                    }
                    long longFlagValue = gsdVar.getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeLong(longFlagValue);
                    return true;
                }
                int intFlagValue = gsdVar.getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(intFlagValue);
                return true;
            }
            String readString = parcel.readString();
            int i3 = fld.a;
            if (parcel.readInt() != 0) {
                z = true;
            }
            boolean booleanFlagValue = gsdVar.getBooleanFlagValue(readString, z, parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(booleanFlagValue ? 1 : 0);
            return true;
        }
        gsdVar.init(br7.T(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }

    @Override
    public IBinder asBinder() {
        return this;
    }
}
