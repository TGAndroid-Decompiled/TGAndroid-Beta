package ii;

import java.lang.ref.WeakReference;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.g2;
public final class m {
    public final int f16341a;
    public final long f16343c;
    public final int d;
    public final WeakReference f16345f;
    public String f16346g;
    public boolean h;
    public final long f16344e = System.currentTimeMillis();
    public final String f16342b = Long.toHexString(Utilities.f22805b.nextLong());

    public m(int i7, long j3, g2 g2Var) {
        this.f16341a = i7;
        this.f16343c = j3;
        this.d = ConnectionsManager.getInstance(i7).getCurrentTime();
        this.f16345f = new WeakReference(g2Var);
    }
}
