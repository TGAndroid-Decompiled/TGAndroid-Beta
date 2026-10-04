package hg;

import ai.n8;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class f {
    public static volatile f[] f11181g = new f[4];
    public static final Object[] h = new Object[4];
    public final int f11182a;
    public long f11183b;
    public TL_account.connectedBots f11184c;
    public final ArrayList d = new ArrayList();
    public boolean f11185e;
    public boolean f11186f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public f(int i10) {
        this.f11182a = i10;
    }

    public static f a(int i10) {
        f fVar;
        f fVar2 = f11181g[i10];
        if (fVar2 == null) {
            synchronized (h[i10]) {
                try {
                    fVar = f11181g[i10];
                    if (fVar == null) {
                        f[] fVarArr = f11181g;
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
        this.f11186f = false;
        c(null);
    }

    public final void c(Utilities.Callback callback) {
        boolean z10;
        if (callback != null) {
            this.d.add(callback);
        }
        if (!this.f11185e) {
            if (System.currentTimeMillis() - this.f11183b <= 60000 && (z10 = this.f11186f)) {
                if (z10) {
                    d();
                    return;
                }
                return;
            }
            this.f11185e = true;
            ConnectionsManager.getInstance(this.f11182a).sendRequest(new TL_account.getConnectedBots(), new n8(this, 11));
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) != null) {
                    ((Utilities.Callback) arrayList.get(i10)).run(this.f11184c);
                }
                i10++;
            } else {
                arrayList.clear();
                NotificationCenter.getInstance(this.f11182a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updatedChatbot, new Object[0]);
                return;
            }
        }
    }
}
