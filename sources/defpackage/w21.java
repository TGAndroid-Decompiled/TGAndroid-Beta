package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
public final class w21 extends Binder {
    public final mm5 a;

    public w21(List list) {
        this.a = mm5.q(list);
    }

    public static mm5 a(IBinder iBinder) {
        int readInt;
        if (iBinder instanceof w21) {
            return ((w21) iBinder).a;
        }
        jm5 p = mm5.p();
        int i = 0;
        int i2 = 1;
        while (i2 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            Bundle readBundle = obtain2.readBundle();
                            readBundle.getClass();
                            p.c(readBundle);
                            i++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i2 = readInt;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return p.f();
    }

    @Override
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = 0;
        if (parcel2 == null) {
            return false;
        }
        mm5 mm5Var = this.a;
        int size = mm5Var.size();
        int readInt = parcel.readInt();
        while (true) {
            if (readInt < size) {
                if (parcel2.dataSize() < g51.a) {
                    parcel2.writeInt(1);
                    parcel2.writeBundle((Bundle) mm5Var.get(readInt));
                    readInt++;
                } else {
                    i3 = 2;
                    break;
                }
            } else {
                break;
            }
        }
        parcel2.writeInt(i3);
        return true;
    }
}
