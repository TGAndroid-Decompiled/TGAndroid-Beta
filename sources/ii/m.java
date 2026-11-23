package ii;

import java.lang.ref.WeakReference;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.g2;
public final class m {
    public final int f16310a;
    public final long f16312c;
    public final int d;
    public final WeakReference f16314f;
    public String f16315g;
    public boolean h;
    public final long f16313e = System.currentTimeMillis();
    public final String f16311b = Long.toHexString(Utilities.f22772b.nextLong());

    public m(int i7, long j3, g2 g2Var) {
        this.f16310a = i7;
        this.f16312c = j3;
        this.d = ConnectionsManager.getInstance(i7).getCurrentTime();
        this.f16314f = new WeakReference(g2Var);
    }
}
