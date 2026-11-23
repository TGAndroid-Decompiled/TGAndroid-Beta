package ii;

import java.lang.ref.WeakReference;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.g2;
public final class m {
    public final int f16407a;
    public final long f16409c;
    public final int d;
    public final WeakReference f16411f;
    public String f16412g;
    public boolean h;
    public final long f16410e = System.currentTimeMillis();
    public final String f16408b = Long.toHexString(Utilities.f22875b.nextLong());

    public m(int i7, long j3, g2 g2Var) {
        this.f16407a = i7;
        this.f16409c = j3;
        this.d = ConnectionsManager.getInstance(i7).getCurrentTime();
        this.f16411f = new WeakReference(g2Var);
    }
}
