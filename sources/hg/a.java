package hg;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f11788a;
    public final c f11789b;
    public final String f11790c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f11788a = i10;
        this.f11789b = cVar;
        this.f11790c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f11788a) {
            case 0:
                c cVar = this.f11789b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f11790c, this.d, 1));
                return;
            default:
                c cVar2 = this.f11789b;
                cVar2.E = null;
                cVar2.v = null;
                cVar2.H(this.f11790c, this.d, true);
                return;
        }
    }
}
