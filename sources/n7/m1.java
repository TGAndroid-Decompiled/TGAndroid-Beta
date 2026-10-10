package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f16785a;
    public final String f16786b;

    public m1(IBinder iBinder, String str) {
        this.f16785a = iBinder;
        this.f16786b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f16785a;
    }
}
