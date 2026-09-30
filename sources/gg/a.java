package gg;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f9663a;
    public final c f9664b;
    public final String f9665c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f9663a = i10;
        this.f9664b = cVar;
        this.f9665c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f9663a) {
            case 0:
                c cVar = this.f9664b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f9665c, this.d, 1));
                return;
            default:
                c cVar2 = this.f9664b;
                cVar2.E = null;
                cVar2.v = null;
                cVar2.H(this.f9665c, this.d, true);
                return;
        }
    }
}
