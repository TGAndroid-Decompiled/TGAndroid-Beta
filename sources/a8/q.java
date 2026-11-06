package a8;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public abstract class q extends Binder implements IInterface {
    public final int f583a;

    public static void H0(Parcel parcel) {
        int i7 = t7.a.f55357a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(dataAvail).length() + 45);
        sb2.append("Parcel data not fully consumed, unread size: ");
        sb2.append(dataAvail);
        throw new BadParcelableException(sb2.toString());
    }

    public abstract boolean I0(int i7, Parcel parcel, Parcel parcel2);

    public abstract boolean J0(int i7, Parcel parcel, Parcel parcel2);

    public boolean K0(int i7, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean L0(Parcel parcel, int i7);

    @Override
    public IBinder asBinder() {
        int i7 = this.f583a;
        return this;
    }

    @Override
    public boolean onTransact(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: a8.q.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public q(String str, int i7) {
        this.f583a = i7;
        switch (i7) {
            case 6:
                attachInterface(this, str);
                return;
            case 7:
                attachInterface(this, str);
                return;
            case 8:
                attachInterface(this, str);
                return;
            case 9:
                attachInterface(this, str);
                return;
            case 10:
            default:
                attachInterface(this, str);
                return;
            case 11:
                attachInterface(this, str);
                return;
            case 12:
                attachInterface(this, str);
                return;
        }
    }
}
