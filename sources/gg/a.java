package gg;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f10519a;
    public final c f10520b;
    public final String f10521c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f10519a = i10;
        this.f10520b = cVar;
        this.f10521c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f10519a) {
            case 0:
                c cVar = this.f10520b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f10521c, this.d, 1));
                return;
            default:
                c cVar2 = this.f10520b;
                cVar2.E = null;
                cVar2.v = null;
                cVar2.H(this.f10521c, this.d, true);
                return;
        }
    }
}
