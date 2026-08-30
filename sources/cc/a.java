package cc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f2252a;
    public Object f2253b;

    @Override
    public final void b(String str) {
        switch (this.f2252a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f2253b) + ":" + str);
                return;
            default:
                ((Logger) this.f2253b).log(Level.FINE, str);
                return;
        }
    }
}
