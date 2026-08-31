package cc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f2445a;
    public Object f2446b;

    @Override
    public final void b(String str) {
        switch (this.f2445a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f2446b) + ":" + str);
                return;
            default:
                ((Logger) this.f2446b).log(Level.FINE, str);
                return;
        }
    }
}
