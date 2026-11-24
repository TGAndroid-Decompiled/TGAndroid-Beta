package defpackage;

import java.lang.ref.WeakReference;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.d;
public final class t15 {
    public final int a;
    public final long c;
    public final int d;
    public final WeakReference f;
    public String g;
    public boolean h;
    public final long e = System.currentTimeMillis();
    public final String b = Long.toHexString(Utilities.b.nextLong());

    public t15(int i, long j, d dVar) {
        this.a = i;
        this.c = j;
        this.d = ConnectionsManager.getInstance(i).getCurrentTime();
        this.f = new WeakReference(dVar);
    }
}
