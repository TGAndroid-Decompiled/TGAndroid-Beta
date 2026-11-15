package kg;

import android.text.TextUtils;
import bi.j6;
import di.m6;
import fi.s5;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.uc;
public final class y {
    public static volatile y[] f18141e = new y[4];
    public static final Object[] f18142f = new Object[4];
    public final int f18143a;
    public final ArrayList f18144b = new ArrayList();
    public boolean f18145c = false;
    public boolean d = false;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            f18142f[i7] = new Object();
        }
    }

    public y(int i7) {
        this.f18143a = i7;
    }

    public static y d(int i7) {
        y yVar;
        y yVar2 = f18141e[i7];
        if (yVar2 == null) {
            synchronized (f18142f[i7]) {
                try {
                    yVar = f18141e[i7];
                    if (yVar == null) {
                        y[] yVarArr = f18141e;
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
            ArrayList arrayList = this.f18144b;
            int indexOf = arrayList.indexOf(c10);
            arrayList.remove(c10);
            ns.f(this.f18143a).k(ns.J1, new Object[0]);
            cc.a0(vVar).U(hd.M0(2131752715, null), true, new ai.z0(this, indexOf, c10, 19), new s5((Object) this, (Object) str, (Object) c10, 25)).j();
        }
    }

    public final void b(TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, uc ucVar) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.f18143a).sendRequest(editbusinesschatlink, new j6(this, tL_businessChatLink, ucVar, 8));
    }

    public final TL_account.TL_businessChatLink c(String str) {
        TL_account.TL_businessChatLink tL_businessChatLink;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f18144b;
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
        if (!this.f18145c) {
            if (!this.d || (z11 && !z10)) {
                this.f18145c = true;
                int i7 = this.f18143a;
                if (z10) {
                    vr a02 = vr.a0(i7);
                    a02.f27220a.c(new m6(this, a02, z11, 5));
                    return;
                }
                ConnectionsManager.getInstance(i7).sendRequest(new TL_account.getBusinessChatLinks(), new x(this, 0));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.f18144b);
        vr a02 = vr.a0(this.f18143a);
        a02.f27220a.c(new hi.y0(a02, arrayList, 1));
    }
}
