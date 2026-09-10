package fg;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f7948a;
    public final c f7949b;
    public final String f7950c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f7948a = i10;
        this.f7949b = cVar;
        this.f7950c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f7948a) {
            case 0:
                c cVar = this.f7949b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f7950c, this.d, 1));
                return;
            default:
                c cVar2 = this.f7949b;
                cVar2.E = null;
                cVar2.v = null;
                cVar2.H(this.f7950c, this.d, true);
                return;
        }
    }
}
