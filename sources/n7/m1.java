package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f16204a;
    public final String f16205b;

    public m1(IBinder iBinder, String str) {
        this.f16204a = iBinder;
        this.f16205b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f16204a;
    }
}
