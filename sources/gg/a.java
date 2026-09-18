package gg;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f9669a;
    public final c f9670b;
    public final String f9671c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f9669a = i10;
        this.f9670b = cVar;
        this.f9671c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f9669a) {
            case 0:
                c cVar = this.f9670b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f9671c, this.d, 1));
                return;
            default:
                c cVar2 = this.f9670b;
                cVar2.E = null;
                cVar2.v = null;
                cVar2.H(this.f9671c, this.d, true);
                return;
        }
    }
}
