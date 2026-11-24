package defpackage;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class ek extends cc6 {
    public final byte a;
    public Object b;

    @Override
    public final void b(String str) {
        switch (this.a) {
            case 0:
                Log.d("isoparser", ((String) this.b) + ":" + str);
                return;
            default:
                ((Logger) this.b).log(Level.FINE, str);
                return;
        }
    }
}
