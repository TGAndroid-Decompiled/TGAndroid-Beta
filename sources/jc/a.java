package jc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f9812a;
    public Object f9813b;

    @Override
    public final void b(String str) {
        switch (this.f9812a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f9813b) + ":" + str);
                return;
            default:
                ((Logger) this.f9813b).log(Level.FINE, str);
                return;
        }
    }
}
