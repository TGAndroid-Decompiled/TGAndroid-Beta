package a7;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public abstract class a extends Binder implements IInterface {
    public final int f103a;

    public a(int i9) {
        this.f103a = i9;
    }

    public static void E0(Parcel parcel) {
        int i9 = b.f104a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(dataAvail).length() + 45);
        sb2.append("Parcel data not fully consumed, unread size: ");
        sb2.append(dataAvail);
        throw new BadParcelableException(sb2.toString());
    }

    public abstract boolean F0(int i9, Parcel parcel, Parcel parcel2);

    public abstract boolean G0(int i9, Parcel parcel, Parcel parcel2);

    public boolean H0(int i9, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean I0(Parcel parcel, int i9);

    @Override
    public IBinder asBinder() {
        int i9 = this.f103a;
        return this;
    }

    @Override
    public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: a7.a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public a(String str, int i9) {
        this.f103a = i9;
        switch (i9) {
            case 2:
                attachInterface(this, str);
                return;
            case 3:
                attachInterface(this, str);
                return;
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                attachInterface(this, str);
                return;
            case 8:
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
