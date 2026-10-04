package gg;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f10508a;
    public final c f10509b;
    public final String f10510c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f10508a = i10;
        this.f10509b = cVar;
        this.f10510c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f10508a) {
            case 0:
                c cVar = this.f10509b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f10510c, this.d, 1));
                return;
            default:
                c cVar2 = this.f10509b;
                cVar2.E = null;
                cVar2.v = null;
                cVar2.H(this.f10510c, this.d, true);
                return;
        }
    }
}
