package hg;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f11813a;
    public final c f11814b;
    public final String f11815c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f11813a = i10;
        this.f11814b = cVar;
        this.f11815c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f11813a) {
            case 0:
                c cVar = this.f11814b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f11815c, this.d, 1));
                return;
            default:
                c cVar2 = this.f11814b;
                cVar2.E = null;
                cVar2.v = null;
                cVar2.H(this.f11815c, this.d, true);
                return;
        }
    }
}
