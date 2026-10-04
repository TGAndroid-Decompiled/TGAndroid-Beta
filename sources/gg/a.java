package gg;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f10509a;
    public final c f10510b;
    public final String f10511c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f10509a = i10;
        this.f10510b = cVar;
        this.f10511c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f10509a) {
            case 0:
                c cVar = this.f10510b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f10511c, this.d, 1));
                return;
            default:
                c cVar2 = this.f10510b;
                cVar2.E = null;
                cVar2.v = null;
                cVar2.H(this.f10511c, this.d, true);
                return;
        }
    }
}
