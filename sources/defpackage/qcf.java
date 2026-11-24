package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class qcf implements IInterface {
    public final IBinder a;
    public final String b;

    public qcf(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }
}
