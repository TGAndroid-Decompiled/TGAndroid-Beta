package kg;

import android.text.TextUtils;
import bi.f2;
import bi.u7;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.zc;
public final class y {
    public static volatile y[] f17586e = new y[4];
    public static final Object[] f17587f = new Object[4];
    public final int f17588a;
    public final ArrayList f17589b = new ArrayList();
    public boolean f17590c = false;
    public boolean d = false;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            f17587f[i7] = new Object();
        }
    }

    public y(int i7) {
        this.f17588a = i7;
    }

    public static y d(int i7) {
        y yVar;
        y yVar2 = f17586e[i7];
        if (yVar2 == null) {
            synchronized (f17587f[i7]) {
                try {
                    yVar = f17586e[i7];
                    if (yVar == null) {
                        y[] yVarArr = f17586e;
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
            ArrayList arrayList = this.f17589b;
            int indexOf = arrayList.indexOf(c10);
            arrayList.remove(c10);
            qs.f(this.f17588a).k(qs.J1, new Object[0]);
            gc.a0(vVar).U(id.M0(2131752715, null), true, new ai.e0(this, indexOf, c10, 18), new fi.x1(this, str, c10, 25)).j();
        }
    }

    public final void b(TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, zc zcVar) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.f17588a).sendRequest(editbusinesschatlink, new f2(this, tL_businessChatLink, zcVar, 9));
    }

    public final TL_account.TL_businessChatLink c(String str) {
        TL_account.TL_businessChatLink tL_businessChatLink;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f17589b;
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

    public final void e(boolean z9, boolean z10) {
        if (!this.f17590c) {
            if (!this.d || (z10 && !z9)) {
                this.f17590c = true;
                int i7 = this.f17588a;
                if (z9) {
                    yr a02 = yr.a0(i7);
                    a02.f26723a.c(new u7(this, a02, z10, 5));
                    return;
                }
                ConnectionsManager.getInstance(i7).sendRequest(new TL_account.getBusinessChatLinks(), new x(this, 0));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.f17589b);
        yr a02 = yr.a0(this.f17588a);
        a02.f26723a.c(new fi.x0(a02, arrayList, 1));
    }
}
