package jc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f9813a;
    public Object f9814b;

    @Override
    public final void b(String str) {
        switch (this.f9813a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f9814b) + ":" + str);
                return;
            default:
                ((Logger) this.f9814b).log(Level.FINE, str);
                return;
        }
    }
}
