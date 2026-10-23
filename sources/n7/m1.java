package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f17358a;
    public final String f17359b;

    public m1(IBinder iBinder, String str) {
        this.f17358a = iBinder;
        this.f17359b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f17358a;
    }
}
