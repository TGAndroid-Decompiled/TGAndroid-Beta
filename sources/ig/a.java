package ig;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f13982a;
    public final c f13983b;
    public final String f13984c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f13982a = i10;
        this.f13983b = cVar;
        this.f13984c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f13982a) {
            case 0:
                c cVar = this.f13983b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f13984c, this.d, 1));
                return;
            default:
                c cVar2 = this.f13983b;
                cVar2.E = null;
                cVar2.v = null;
                cVar2.H(this.f13984c, this.d, true);
                return;
        }
    }
}
