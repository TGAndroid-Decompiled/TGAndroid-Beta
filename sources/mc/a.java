package mc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f19261a;
    public Object f19262b;

    @Override
    public final void b(String str) {
        switch (this.f19261a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f19262b) + ":" + str);
                return;
            default:
                ((Logger) this.f19262b).log(Level.FINE, str);
                return;
        }
    }
}
