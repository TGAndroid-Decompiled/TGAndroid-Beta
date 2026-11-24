package defpackage;

import android.content.Context;
import java.io.File;
public final class ij4 implements pr4 {
    public final byte a;
    public final Context b;

    public ij4(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    @Override
    public final Object invoke() {
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                File a = xde.a(context, "firebaseSessions/sessionConfigsDataStore.data");
                jj4.b(a);
                return a;
            default:
                File a2 = xde.a(context, "firebaseSessions/sessionDataStore.data");
                jj4.b(a2);
                return a2;
        }
    }
}
