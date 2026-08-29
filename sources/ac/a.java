package ac;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f349a;
    public Object f350b;

    @Override
    public final void b(String str) {
        switch (this.f349a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f350b) + ":" + str);
                return;
            default:
                ((Logger) this.f350b).log(Level.FINE, str);
                return;
        }
    }
}
