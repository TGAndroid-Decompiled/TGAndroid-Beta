package ig;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class f {
    public static volatile f[] f12884g = new f[4];
    public static final Object[] h = new Object[4];
    public final int f12885a;
    public long f12886b;
    public TL_account.connectedBots f12887c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f12888f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public f(int i10) {
        this.f12885a = i10;
    }

    public static f a(int i10) {
        f fVar;
        f fVar2 = f12884g[i10];
        if (fVar2 == null) {
            synchronized (h[i10]) {
                try {
                    fVar = f12884g[i10];
                    if (fVar == null) {
                        f[] fVarArr = f12884g;
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
        this.f12888f = false;
        c(null);
    }

    public final void c(Utilities.Callback callback) {
        boolean z10;
        if (callback != null) {
            this.d.add(callback);
        }
        if (!this.e) {
            if (System.currentTimeMillis() - this.f12886b <= 60000 && (z10 = this.f12888f)) {
                if (z10) {
                    d();
                    return;
                }
                return;
            }
            this.e = true;
            ConnectionsManager.getInstance(this.f12885a).sendRequest(new TL_account.getConnectedBots(), new ai.h(this, 17));
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) != null) {
                    ((Utilities.Callback) arrayList.get(i10)).run(this.f12887c);
                }
                i10++;
            } else {
                arrayList.clear();
                NotificationCenter.getInstance(this.f12885a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updatedChatbot, new Object[0]);
                return;
            }
        }
    }
}
