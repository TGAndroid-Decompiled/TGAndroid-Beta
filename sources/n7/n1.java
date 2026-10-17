package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class n1 implements IInterface {
    public final IBinder f17294a;
    public final String f17295b;

    public n1(IBinder iBinder, String str) {
        this.f17294a = iBinder;
        this.f17295b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f17294a;
    }
}
