package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f15381a;
    public final String f15382b;

    public m1(IBinder iBinder, String str) {
        this.f15381a = iBinder;
        this.f15382b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f15381a;
    }
}
