package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f17297a;
    public final String f17298b;

    public m1(IBinder iBinder, String str) {
        this.f17297a = iBinder;
        this.f17298b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f17297a;
    }
}
