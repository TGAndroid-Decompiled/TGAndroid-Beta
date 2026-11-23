package kg;

import android.text.TextUtils;
import di.p6;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.ur;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.lc;
public final class z {
    public static volatile z[] f18539e = new z[4];
    public static final Object[] f18540f = new Object[4];
    public final int f18541a;
    public final ArrayList f18542b = new ArrayList();
    public boolean f18543c = false;
    public boolean d = false;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            f18540f[i7] = new Object();
        }
    }

    public z(int i7) {
        this.f18541a = i7;
    }

    public static z d(int i7) {
        z zVar;
        z zVar2 = f18539e[i7];
        if (zVar2 == null) {
            synchronized (f18540f[i7]) {
                try {
                    zVar = f18539e[i7];
                    if (zVar == null) {
                        z[] zVarArr = f18539e;
                        z zVar3 = new z(i7);
                        zVarArr[i7] = zVar3;
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
        TL_account.TL_businessChatLink c10 = c(str);
        if (c10 != null) {
            ArrayList arrayList = this.f18542b;
            int indexOf = arrayList.indexOf(c10);
            arrayList.remove(c10);
            ls.f(this.f18541a).k(ls.J1, new Object[0]);
            lc.b0(vVar).U(hd.N0(2131752703, null), true, new ai.d1(this, indexOf, c10, 19), new y(this, str, c10, 0)).j();
        }
    }

    public final void b(TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, dd ddVar) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.f18541a).sendRequest(editbusinesschatlink, new bi.q1(this, tL_businessChatLink, ddVar, 10));
    }

    public final TL_account.TL_businessChatLink c(String str) {
        TL_account.TL_businessChatLink tL_businessChatLink;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f18542b;
            if (i7 < arrayList.size()) {
                tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList.get(i7);
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
                        i7++;
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
        if (!this.f18543c) {
            if (!this.d || (z11 && !z10)) {
                this.f18543c = true;
                int i7 = this.f18541a;
                if (z10) {
                    ur a02 = ur.a0(i7);
                    a02.f27214a.c(new p6(this, a02, z11, 5));
                    return;
                }
                ConnectionsManager.getInstance(i7).sendRequest(new TL_account.getBusinessChatLinks(), new x(this, 0));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.f18542b);
        ur a02 = ur.a0(this.f18541a);
        a02.f27214a.c(new hi.y0(a02, arrayList, 1));
    }
}
