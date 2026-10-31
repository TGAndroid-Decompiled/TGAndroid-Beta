package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f13696a;
    public final String f13697b;

    public m1(IBinder iBinder, String str) {
        this.f13696a = iBinder;
        this.f13697b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f13696a;
    }
}
