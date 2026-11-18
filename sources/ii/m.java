package ii;

import java.lang.ref.WeakReference;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.h2;
public final class m {
    public final int f16316a;
    public final long f16318c;
    public final int d;
    public final WeakReference f16320f;
    public String f16321g;
    public boolean h;
    public final long f16319e = System.currentTimeMillis();
    public final String f16317b = Long.toHexString(Utilities.f22777b.nextLong());

    public m(int i7, long j3, h2 h2Var) {
        this.f16316a = i7;
        this.f16318c = j3;
        this.d = ConnectionsManager.getInstance(i7).getCurrentTime();
        this.f16320f = new WeakReference(h2Var);
    }
}
