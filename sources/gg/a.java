package gg;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f9651a;
    public final c f9652b;
    public final String f9653c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f9651a = i10;
        this.f9652b = cVar;
        this.f9653c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f9651a) {
            case 0:
                c cVar = this.f9652b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f9653c, this.d, 1));
                return;
            default:
                c cVar2 = this.f9652b;
                cVar2.E = null;
                cVar2.v = null;
                cVar2.H(this.f9653c, this.d, true);
                return;
        }
    }
}
