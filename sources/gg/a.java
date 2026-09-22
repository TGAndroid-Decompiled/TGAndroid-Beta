package gg;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f9666a;
    public final c f9667b;
    public final String f9668c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f9666a = i10;
        this.f9667b = cVar;
        this.f9668c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f9666a) {
            case 0:
                c cVar = this.f9667b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f9668c, this.d, 1));
                return;
            default:
                c cVar2 = this.f9667b;
                cVar2.E = null;
                cVar2.v = null;
                cVar2.H(this.f9668c, this.d, true);
                return;
        }
    }
}
