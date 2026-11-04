package d2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
public final class h extends Binder {
    public final g9.i0 f8115a;

    public h(List list) {
        this.f8115a = g9.i0.q(list);
    }

    public static g9.i0 a(IBinder iBinder) {
        int readInt;
        if (iBinder instanceof h) {
            return ((h) iBinder).f8115a;
        }
        g9.f0 p10 = g9.i0.p();
        int i3 = 0;
        int i10 = 1;
        while (i10 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i3);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            Bundle readBundle = obtain2.readBundle();
                            readBundle.getClass();
                            p10.c(readBundle);
                            i3++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i10 = readInt;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                obtain2.recycle();
                obtain.recycle();
                throw th2;
            }
        }
        return p10.f();
    }

    @Override
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        if (i3 != 1) {
            return super.onTransact(i3, parcel, parcel2, i10);
        }
        int i11 = 0;
        if (parcel2 == null) {
            return false;
        }
        g9.i0 i0Var = this.f8115a;
        int size = i0Var.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < m.f8182a) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) i0Var.get(readInt));
            readInt++;
        }
        if (readInt < size) {
            i11 = 2;
        }
        parcel2.writeInt(i11);
        return true;
    }
}
