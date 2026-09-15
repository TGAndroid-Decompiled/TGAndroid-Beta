package gg;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f9665a;
    public final c f9666b;
    public final String f9667c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f9665a = i10;
        this.f9666b = cVar;
        this.f9667c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f9665a) {
            case 0:
                c cVar = this.f9666b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f9667c, this.d, 1));
                return;
            default:
                c cVar2 = this.f9666b;
                cVar2.E = null;
                cVar2.v = null;
                cVar2.H(this.f9667c, this.d, true);
                return;
        }
    }
}
