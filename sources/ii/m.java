package ii;

import java.lang.ref.WeakReference;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.h2;
public final class m {
    public final int f16319a;
    public final long f16321c;
    public final int d;
    public final WeakReference f16323f;
    public String f16324g;
    public boolean h;
    public final long f16322e = System.currentTimeMillis();
    public final String f16320b = Long.toHexString(Utilities.f22780b.nextLong());

    public m(int i7, long j3, h2 h2Var) {
        this.f16319a = i7;
        this.f16321c = j3;
        this.d = ConnectionsManager.getInstance(i7).getCurrentTime();
        this.f16323f = new WeakReference(h2Var);
    }
}
