package hg;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f10997a;
    public final c f10998b;
    public final String f10999c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f10997a = i10;
        this.f10998b = cVar;
        this.f10999c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f10997a) {
            case 0:
                c cVar = this.f10998b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f10999c, this.d, 1));
                return;
            default:
                c cVar2 = this.f10998b;
                cVar2.E = null;
                cVar2.v = null;
                cVar2.H(this.f10999c, this.d, true);
                return;
        }
    }
}
