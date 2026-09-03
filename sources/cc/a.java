package cc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f2275a;
    public Object f2276b;

    @Override
    public final void b(String str) {
        switch (this.f2275a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f2276b) + ":" + str);
                return;
            default:
                ((Logger) this.f2276b).log(Level.FINE, str);
                return;
        }
    }
}
