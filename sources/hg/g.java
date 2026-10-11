package hg;

import ai.o8;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class g {
    public static volatile g[] f11235g = new g[4];
    public static final Object[] h = new Object[4];
    public final int f11236a;
    public long f11237b;
    public TL_account.connectedBots f11238c;
    public final ArrayList d = new ArrayList();
    public boolean f11239e;
    public boolean f11240f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public g(int i10) {
        this.f11236a = i10;
    }

    public static g a(int i10) {
        g gVar;
        g gVar2 = f11235g[i10];
        if (gVar2 == null) {
            synchronized (h[i10]) {
                try {
                    gVar = f11235g[i10];
                    if (gVar == null) {
                        g[] gVarArr = f11235g;
                        g gVar3 = new g(i10);
                        gVarArr[i10] = gVar3;
                        gVar = gVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return gVar;
        }
        return gVar2;
    }

    public final void b() {
        this.f11240f = false;
        c(null);
    }

    public final void c(Utilities.Callback callback) {
        boolean z10;
        if (callback != null) {
            this.d.add(callback);
        }
        if (!this.f11239e) {
            if (System.currentTimeMillis() - this.f11237b <= 60000 && (z10 = this.f11240f)) {
                if (z10) {
                    d();
                    return;
                }
                return;
            }
            this.f11239e = true;
            ConnectionsManager.getInstance(this.f11236a).sendRequest(new TL_account.getConnectedBots(), new o8(this, 11));
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) != null) {
                    ((Utilities.Callback) arrayList.get(i10)).run(this.f11238c);
                }
                i10++;
            } else {
                arrayList.clear();
                NotificationCenter.getInstance(this.f11236a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updatedChatbot, new Object[0]);
                return;
            }
        }
    }
}
