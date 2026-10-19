package hg;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f11786a;
    public final c f11787b;
    public final String f11788c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f11786a = i10;
        this.f11787b = cVar;
        this.f11788c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f11786a) {
            case 0:
                c cVar = this.f11787b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f11788c, this.d, 1));
                return;
            default:
                c cVar2 = this.f11787b;
                cVar2.E = null;
                cVar2.v = null;
                cVar2.H(this.f11788c, this.d, true);
                return;
        }
    }
}
