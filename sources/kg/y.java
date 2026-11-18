package kg;

import android.text.TextUtils;
import di.ga;
import di.p6;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.lc;
public final class y {
    public static volatile y[] f18536e = new y[4];
    public static final Object[] f18537f = new Object[4];
    public final int f18538a;
    public final ArrayList f18539b = new ArrayList();
    public boolean f18540c = false;
    public boolean d = false;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            f18537f[i7] = new Object();
        }
    }

    public y(int i7) {
        this.f18538a = i7;
    }

    public static y d(int i7) {
        y yVar;
        y yVar2 = f18536e[i7];
        if (yVar2 == null) {
            synchronized (f18537f[i7]) {
                try {
                    yVar = f18536e[i7];
                    if (yVar == null) {
                        y[] yVarArr = f18536e;
                        y yVar3 = new y(i7);
                        yVarArr[i7] = yVar3;
                        yVar = yVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return yVar;
        }
        return yVar2;
    }

    public final void a(v vVar, String str) {
        TL_account.TL_businessChatLink c10 = c(str);
        if (c10 != null) {
            ArrayList arrayList = this.f18539b;
            int indexOf = arrayList.indexOf(c10);
            arrayList.remove(c10);
            ks.f(this.f18538a).k(ks.J1, new Object[0]);
            lc.b0(vVar).U(gd.M0(2131752704, null), true, new ai.a1(this, indexOf, c10, 20), new ga(this, str, c10, 29)).j();
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
        ConnectionsManager.getInstance(this.f18538a).sendRequest(editbusinesschatlink, new bi.m1(this, tL_businessChatLink, ddVar, 10));
    }

    public final TL_account.TL_businessChatLink c(String str) {
        TL_account.TL_businessChatLink tL_businessChatLink;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f18539b;
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
        if (!this.f18540c) {
            if (!this.d || (z11 && !z10)) {
                this.f18540c = true;
                int i7 = this.f18538a;
                if (z10) {
                    tr a02 = tr.a0(i7);
                    a02.f27054a.c(new p6(this, a02, z11, 5));
                    return;
                }
                ConnectionsManager.getInstance(i7).sendRequest(new TL_account.getBusinessChatLinks(), new x(this, 0));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.f18539b);
        tr a02 = tr.a0(this.f18538a);
        a02.f27054a.c(new hi.z0(a02, arrayList, 1));
    }
}
