package ig;

import bi.z7;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class f {
    public static volatile f[] f11498g = new f[4];
    public static final Object[] h = new Object[4];
    public final int f11499a;
    public long f11500b;
    public TL_account.connectedBots f11501c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f11502f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public f(int i10) {
        this.f11499a = i10;
    }

    public static f a(int i10) {
        f fVar;
        f fVar2 = f11498g[i10];
        if (fVar2 == null) {
            synchronized (h[i10]) {
                try {
                    fVar = f11498g[i10];
                    if (fVar == null) {
                        f[] fVarArr = f11498g;
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
        this.f11502f = false;
        c(null);
    }

    public final void c(Utilities.Callback callback) {
        boolean z10;
        if (callback != null) {
            this.d.add(callback);
        }
        if (!this.e) {
            if (System.currentTimeMillis() - this.f11500b <= 60000 && (z10 = this.f11502f)) {
                if (z10) {
                    d();
                    return;
                }
                return;
            }
            this.e = true;
            ConnectionsManager.getInstance(this.f11499a).sendRequest(new TL_account.getConnectedBots(), new z7(this, 11));
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) != null) {
                    ((Utilities.Callback) arrayList.get(i10)).run(this.f11501c);
                }
                i10++;
            } else {
                arrayList.clear();
                NotificationCenter.getInstance(this.f11499a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updatedChatbot, new Object[0]);
                return;
            }
        }
    }
}
