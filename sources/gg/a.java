package gg;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f10520a;
    public final c f10521b;
    public final String f10522c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f10520a = i10;
        this.f10521b = cVar;
        this.f10522c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f10520a) {
            case 0:
                c cVar = this.f10521b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f10522c, this.d, 1));
                return;
            default:
                c cVar2 = this.f10521b;
                cVar2.E = null;
                cVar2.v = null;
                cVar2.H(this.f10522c, this.d, true);
                return;
        }
    }
}
