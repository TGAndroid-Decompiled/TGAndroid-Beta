package b8;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public abstract class b extends Binder implements IInterface {
    public final int f2125a;

    public b(int i10) {
        this.f2125a = i10;
    }

    public static void G0(Parcel parcel) {
        int i10 = q7.a.f40544a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(dataAvail).length() + 45);
        sb2.append("Parcel data not fully consumed, unread size: ");
        sb2.append(dataAvail);
        throw new BadParcelableException(sb2.toString());
    }

    public abstract boolean H0(int i10, Parcel parcel, Parcel parcel2);

    public abstract boolean I0(int i10, Parcel parcel, Parcel parcel2);

    public boolean J0(int i10, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean K0(Parcel parcel, int i10);

    @Override
    public IBinder asBinder() {
        int i10 = this.f2125a;
        return this;
    }

    @Override
    public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: b8.b.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public b(String str, int i10) {
        this.f2125a = i10;
        switch (i10) {
            case 4:
                attachInterface(this, str);
                return;
            case 5:
                attachInterface(this, str);
                return;
            case 6:
                attachInterface(this, str);
                return;
            case 7:
                attachInterface(this, str);
                return;
            case 8:
            default:
                attachInterface(this, str);
                return;
            case 9:
                attachInterface(this, str);
                return;
            case 10:
                attachInterface(this, str);
                return;
        }
    }
}
