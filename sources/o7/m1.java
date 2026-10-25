package o7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f19238a;
    public final String f19239b;

    public m1(IBinder iBinder, String str) {
        this.f19238a = iBinder;
        this.f19239b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f19238a;
    }
}
