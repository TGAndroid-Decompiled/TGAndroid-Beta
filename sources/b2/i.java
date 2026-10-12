package b2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
public final class i extends Binder {
    public final e9.n0 f2160a;

    public i(List list) {
        this.f2160a = e9.n0.u(list);
    }

    public static e9.n0 a(IBinder iBinder) {
        int readInt;
        if (iBinder instanceof i) {
            return ((i) iBinder).f2160a;
        }
        e9.k0 t10 = e9.n0.t();
        int i10 = 0;
        int i11 = 1;
        while (i11 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i10);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            Bundle readBundle = obtain2.readBundle();
                            readBundle.getClass();
                            t10.c(readBundle);
                            i10++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i11 = readInt;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th2) {
                obtain2.recycle();
                obtain.recycle();
                throw th2;
            }
        }
        return t10.f();
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        int i12 = 0;
        if (parcel2 == null) {
            return false;
        }
        e9.n0 n0Var = this.f2160a;
        int size = n0Var.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < n.f2216a) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) n0Var.get(readInt));
            readInt++;
        }
        if (readInt < size) {
            i12 = 2;
        }
        parcel2.writeInt(i12);
        return true;
    }
}
