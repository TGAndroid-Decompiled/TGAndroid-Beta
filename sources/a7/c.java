package a7;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public abstract class c extends Binder implements IInterface {
    public final int f125a;

    public c(int i10) {
        this.f125a = i10;
    }

    public static void E0(Parcel parcel) {
        int i10 = e7.a.f5158a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(dataAvail).length() + 45);
        sb.append("Parcel data not fully consumed, unread size: ");
        sb.append(dataAvail);
        throw new BadParcelableException(sb.toString());
    }

    public abstract boolean F0(int i10, Parcel parcel, Parcel parcel2);

    public abstract boolean G0(int i10, Parcel parcel, Parcel parcel2);

    public boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean I0(Parcel parcel, int i10);

    @Override
    public IBinder asBinder() {
        int i10 = this.f125a;
        return this;
    }

    @Override
    public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: a7.c.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public c(String str, int i10) {
        this.f125a = i10;
        switch (i10) {
            case 1:
                attachInterface(this, str);
                return;
            case 2:
            case 3:
            case 4:
            case 7:
            case 8:
            default:
                attachInterface(this, str);
                return;
            case 5:
                attachInterface(this, str);
                return;
            case 6:
                attachInterface(this, str);
                return;
            case 9:
                attachInterface(this, str);
                return;
            case 10:
                attachInterface(this, str);
                return;
            case 11:
                attachInterface(this, str);
                return;
        }
    }
}
