package hg;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f10478a;
    public final c f10479b;
    public final String f10480c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f10478a = i10;
        this.f10479b = cVar;
        this.f10480c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f10478a) {
            case 0:
                c cVar = this.f10479b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f10480c, this.d, 1));
                return;
            default:
                c cVar2 = this.f10479b;
                cVar2.E = null;
                cVar2.v = null;
                cVar2.H(this.f10480c, this.d, true);
                return;
        }
    }
}
