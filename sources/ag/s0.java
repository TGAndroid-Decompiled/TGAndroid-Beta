package ag;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.hs;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.tc;
public final class s0 {
    public static volatile s0[] e = new s0[4];
    public static final Object[] f700f = new Object[4];
    public final int f701a;
    public final ArrayList f702b = new ArrayList();
    public boolean f703c = false;
    public boolean d = false;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f700f[i10] = new Object();
        }
    }

    public s0(int i10) {
        this.f701a = i10;
    }

    public static s0 d(int i10) {
        s0 s0Var;
        s0 s0Var2 = e[i10];
        if (s0Var2 == null) {
            synchronized (f700f[i10]) {
                try {
                    s0Var = e[i10];
                    if (s0Var == null) {
                        s0[] s0VarArr = e;
                        s0 s0Var3 = new s0(i10);
                        s0VarArr[i10] = s0Var3;
                        s0Var = s0Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return s0Var;
        }
        return s0Var2;
    }

    public final void a(i0 i0Var, String str) {
        TL_account.TL_businessChatLink c10 = c(str);
        if (c10 != null) {
            ArrayList arrayList = this.f702b;
            int indexOf = arrayList.indexOf(c10);
            arrayList.remove(c10);
            zs.f(this.f701a).k(zs.J1, new Object[0]);
            cc.a0(i0Var).U(cd.L0(2131752715, null), true, new o0(this, indexOf, c10, 0), new a3.l0(this, str, c10, 4)).j();
        }
    }

    public final void b(TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, tc tcVar) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.f701a).sendRequest(editbusinesschatlink, new p0(this, tL_businessChatLink, tcVar, 0));
    }

    public final TL_account.TL_businessChatLink c(String str) {
        TL_account.TL_businessChatLink tL_businessChatLink;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f702b;
            if (i10 < arrayList.size()) {
                tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList.get(i10);
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
                        i10++;
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
        if (!this.f703c) {
            if (!this.d || (z11 && !z10)) {
                this.f703c = true;
                int i10 = this.f701a;
                if (z10) {
                    hs a02 = hs.a0(i10);
                    a02.f15938a.c(new j0(this, a02, z11, 0));
                    return;
                }
                ConnectionsManager.getInstance(i10).sendRequest(new TL_account.getBusinessChatLinks(), new m0(this, 0));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.f702b);
        hs a02 = hs.a0(this.f701a);
        a02.f15938a.c(new r0(a02, arrayList, 0));
    }
}
