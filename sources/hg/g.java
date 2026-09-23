package hg;

import ai.n8;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class g {
    public static volatile g[] f10272g = new g[4];
    public static final Object[] h = new Object[4];
    public final int f10273a;
    public long f10274b;
    public TL_account.connectedBots f10275c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f10276f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public g(int i10) {
        this.f10273a = i10;
    }

    public static g a(int i10) {
        g gVar;
        g gVar2 = f10272g[i10];
        if (gVar2 == null) {
            synchronized (h[i10]) {
                try {
                    gVar = f10272g[i10];
                    if (gVar == null) {
                        g[] gVarArr = f10272g;
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
        this.f10276f = false;
        c(null);
    }

    public final void c(Utilities.Callback callback) {
        boolean z10;
        if (callback != null) {
            this.d.add(callback);
        }
        if (!this.e) {
            if (System.currentTimeMillis() - this.f10274b <= 60000 && (z10 = this.f10276f)) {
                if (z10) {
                    d();
                    return;
                }
                return;
            }
            this.e = true;
            ConnectionsManager.getInstance(this.f10273a).sendRequest(new TL_account.getConnectedBots(), new n8(this, 11));
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) != null) {
                    ((Utilities.Callback) arrayList.get(i10)).run(this.f10275c);
                }
                i10++;
            } else {
                arrayList.clear();
                NotificationCenter.getInstance(this.f10273a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updatedChatbot, new Object[0]);
                return;
            }
        }
    }
}
