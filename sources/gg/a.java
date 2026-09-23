package gg;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f9652a;
    public final c f9653b;
    public final String f9654c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f9652a = i10;
        this.f9653b = cVar;
        this.f9654c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f9652a) {
            case 0:
                c cVar = this.f9653b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f9654c, this.d, 1));
                return;
            default:
                c cVar2 = this.f9653b;
                cVar2.E = null;
                cVar2.v = null;
                cVar2.H(this.f9654c, this.d, true);
                return;
        }
    }
}
