package ii;

import java.lang.ref.WeakReference;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.g2;
public final class m {
    public final int f16344a;
    public final long f16346c;
    public final int d;
    public final WeakReference f16348f;
    public String f16349g;
    public boolean h;
    public final long f16347e = System.currentTimeMillis();
    public final String f16345b = Long.toHexString(Utilities.f22808b.nextLong());

    public m(int i7, long j3, g2 g2Var) {
        this.f16344a = i7;
        this.f16346c = j3;
        this.d = ConnectionsManager.getInstance(i7).getCurrentTime();
        this.f16348f = new WeakReference(g2Var);
    }
}
