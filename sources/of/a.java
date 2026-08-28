package of;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f19235a;
    public final c f19236b;
    public final String f19237c;
    public final Location d;

    public a(c cVar, String str, Location location, int i9) {
        this.f19235a = i9;
        this.f19236b = cVar;
        this.f19237c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f19235a) {
            case 0:
                c cVar = this.f19236b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f19237c, this.d, 1));
                return;
            default:
                c cVar2 = this.f19236b;
                cVar2.A = null;
                cVar2.v = null;
                cVar2.H(this.f19237c, this.d, true);
                return;
        }
    }
}
