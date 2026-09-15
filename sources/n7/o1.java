package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class o1 implements IInterface {
    public final IBinder f15155a;
    public final String f15156b;

    public o1(IBinder iBinder, String str) {
        this.f15155a = iBinder;
        this.f15156b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f15155a;
    }
}
