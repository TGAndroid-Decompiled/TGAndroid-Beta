package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f15368a;
    public final String f15369b;

    public m1(IBinder iBinder, String str) {
        this.f15368a = iBinder;
        this.f15369b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f15368a;
    }
}
