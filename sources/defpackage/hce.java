package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class hce implements IInterface {
    public final IBinder a;

    public hce(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }
}
