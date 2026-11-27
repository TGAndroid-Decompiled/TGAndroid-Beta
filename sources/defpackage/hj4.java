package defpackage;

import android.content.Context;
import java.io.File;
public final class hj4 implements sr4 {
    public final byte a;
    public final Context b;

    public hj4(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    @Override
    public final Object invoke() {
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                File a = mge.a(context, "firebaseSessions/sessionConfigsDataStore.data");
                ij4.b(a);
                return a;
            default:
                File a2 = mge.a(context, "firebaseSessions/sessionDataStore.data");
                ij4.b(a2);
                return a2;
        }
    }
}
