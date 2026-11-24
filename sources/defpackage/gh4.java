package defpackage;

import android.content.Context;
import java.io.File;
public final class gh4 implements op4 {
    public final byte a;
    public final Context b;

    public gh4(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    @Override
    public final Object invoke() {
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                File a = wbe.a(context, "firebaseSessions/sessionConfigsDataStore.data");
                hh4.b(a);
                return a;
            default:
                File a2 = wbe.a(context, "firebaseSessions/sessionDataStore.data");
                hh4.b(a2);
                return a2;
        }
    }
}
