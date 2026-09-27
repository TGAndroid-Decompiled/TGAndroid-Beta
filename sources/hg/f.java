package hg;

import ai.n8;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class f {
    public static volatile f[] f10269g = new f[4];
    public static final Object[] h = new Object[4];
    public final int f10270a;
    public long f10271b;
    public TL_account.connectedBots f10272c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f10273f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public f(int i10) {
        this.f10270a = i10;
    }

    public static f a(int i10) {
        f fVar;
        f fVar2 = f10269g[i10];
        if (fVar2 == null) {
            synchronized (h[i10]) {
                try {
                    fVar = f10269g[i10];
                    if (fVar == null) {
                        f[] fVarArr = f10269g;
                        f fVar3 = new f(i10);
                        fVarArr[i10] = fVar3;
                        fVar = fVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fVar;
        }
        return fVar2;
    }

    public final void b() {
        this.f10273f = false;
        c(null);
    }

    public final void c(Utilities.Callback callback) {
        boolean z10;
        if (callback != null) {
            this.d.add(callback);
        }
        if (!this.e) {
            if (System.currentTimeMillis() - this.f10271b <= 60000 && (z10 = this.f10273f)) {
                if (z10) {
                    d();
                    return;
                }
                return;
            }
            this.e = true;
            ConnectionsManager.getInstance(this.f10270a).sendRequest(new TL_account.getConnectedBots(), new n8(this, 11));
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) != null) {
                    ((Utilities.Callback) arrayList.get(i10)).run(this.f10272c);
                }
                i10++;
            } else {
                arrayList.clear();
                NotificationCenter.getInstance(this.f10270a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updatedChatbot, new Object[0]);
                return;
            }
        }
    }
}
