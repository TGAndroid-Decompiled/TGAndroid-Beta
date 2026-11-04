package lg;

import ai.e3;
import ai.r6;
import android.text.TextUtils;
import ci.v6;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.yc;
public final class z {
    public static volatile z[] f18522e = new z[4];
    public static final Object[] f18523f = new Object[4];
    public final int f18524a;
    public final ArrayList f18525b = new ArrayList();
    public boolean f18526c = false;
    public boolean d = false;

    static {
        for (int i3 = 0; i3 < 4; i3++) {
            f18523f[i3] = new Object();
        }
    }

    public z(int i3) {
        this.f18524a = i3;
    }

    public static z d(int i3) {
        z zVar;
        z zVar2 = f18522e[i3];
        if (zVar2 == null) {
            synchronized (f18523f[i3]) {
                try {
                    zVar = f18522e[i3];
                    if (zVar == null) {
                        z[] zVarArr = f18522e;
                        z zVar3 = new z(i3);
                        zVarArr[i3] = zVar3;
                        zVar = zVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zVar;
        }
        return zVar2;
    }

    public final void a(v vVar, String str) {
        TL_account.TL_businessChatLink c2 = c(str);
        if (c2 != null) {
            ArrayList arrayList = this.f18525b;
            int indexOf = arrayList.indexOf(c2);
            arrayList.remove(c2);
            hs.f(this.f18524a).k(hs.J1, new Object[0]);
            fc.a0(vVar).U(bd.M0(2131752715, null), true, new e3(this, indexOf, c2, 20), new y(this, str, c2, 0)).j();
        }
    }

    public final void b(TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, yc ycVar) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.f18524a).sendRequest(editbusinesschatlink, new r6(this, tL_businessChatLink, ycVar, 10));
    }

    public final TL_account.TL_businessChatLink c(String str) {
        TL_account.TL_businessChatLink tL_businessChatLink;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f18525b;
            if (i3 < arrayList.size()) {
                tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList.get(i3);
                if (!TextUtils.equals(tL_businessChatLink.link, str)) {
                    String str2 = tL_businessChatLink.link;
                    if (!TextUtils.equals(str2, "https://" + str)) {
                        String str3 = tL_businessChatLink.link;
                        if (TextUtils.equals(str3, "https://t.me/m/" + str)) {
                            break;
                        }
                        String str4 = tL_businessChatLink.link;
                        if (TextUtils.equals(str4, "tg://message?slug=" + str)) {
                            break;
                        }
                        i3++;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return null;
            }
        }
        return tL_businessChatLink;
    }

    public final void e(boolean z10, boolean z11) {
        if (!this.f18526c) {
            if (!this.d || (z11 && !z10)) {
                this.f18526c = true;
                int i3 = this.f18524a;
                if (z10) {
                    qr a02 = qr.a0(i3);
                    a02.f24934a.c(new v6(this, a02, z11, 5));
                    return;
                }
                ConnectionsManager.getInstance(i3).sendRequest(new TL_account.getBusinessChatLinks(), new x(this, 0));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.f18525b);
        qr a02 = qr.a0(this.f18524a);
        a02.f24934a.c(new gi.x0(a02, arrayList, 1));
    }
}
