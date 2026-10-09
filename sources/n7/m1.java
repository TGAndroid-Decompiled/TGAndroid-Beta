package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f16781a;
    public final String f16782b;

    public m1(IBinder iBinder, String str) {
        this.f16781a = iBinder;
        this.f16782b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f16781a;
    }
}
