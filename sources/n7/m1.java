package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f17295a;
    public final String f17296b;

    public m1(IBinder iBinder, String str) {
        this.f17295a = iBinder;
        this.f17296b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f17295a;
    }
}
