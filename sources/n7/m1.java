package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f13697a;
    public final String f13698b;

    public m1(IBinder iBinder, String str) {
        this.f13697a = iBinder;
        this.f13698b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f13697a;
    }
}
