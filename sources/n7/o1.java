package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class o1 implements IInterface {
    public final IBinder f15153a;
    public final String f15154b;

    public o1(IBinder iBinder, String str) {
        this.f15153a = iBinder;
        this.f15154b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f15153a;
    }
}
