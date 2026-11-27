package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class r41 {
    public static volatile r41[] e = new r41[4];
    public static final Object[] f = new Object[4];
    public final int a;
    public final ArrayList b = new ArrayList();
    public boolean c = false;
    public boolean d = false;

    static {
        for (int i = 0; i < 4; i++) {
            f[i] = new Object();
        }
    }

    public r41(int i) {
        this.a = i;
    }

    public static r41 d(int i) {
        r41 r41Var;
        r41 r41Var2 = e[i];
        if (r41Var2 == null) {
            synchronized (f[i]) {
                r41Var = e[i];
                if (r41Var == null) {
                    r41[] r41VarArr = e;
                    r41 r41Var3 = new r41(i);
                    r41VarArr[i] = r41Var3;
                    r41Var = r41Var3;
                }
            }
            return r41Var;
        }
        return r41Var2;
    }

    public final void a(n41 n41Var, String str) {
        TL_account.TL_businessChatLink c = c(str);
        if (c != null) {
            ArrayList arrayList = this.b;
            int indexOf = arrayList.indexOf(c);
            arrayList.remove(c);
            jn7.f(this.a).k(jn7.J1, new Object[0]);
            d31.b0(n41Var).U(ob6.M0(2131752696, null), true, new ze7(this, indexOf, c, (byte) 8), new tu0(this, str, c, (byte) 8)).j();
        }
    }

    public final void b(TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, fw1 fw1Var) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.a).sendRequest(editbusinesschatlink, new fn0(this, tL_businessChatLink, fw1Var, (byte) 9));
    }

    public final TL_account.TL_businessChatLink c(String str) {
        TL_account.TL_businessChatLink tL_businessChatLink;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList.get(i);
                if (!TextUtils.equals(tL_businessChatLink.link, str)) {
                    String str2 = tL_businessChatLink.link;
                    if (!TextUtils.equals(str2, "https://" + str)) {
                        String str3 = tL_businessChatLink.link;
                        if (!TextUtils.equals(str3, "https://t.me/m/" + str)) {
                            String str4 = tL_businessChatLink.link;
                            if (TextUtils.equals(str4, "tg://message?slug=" + str)) {
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
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

    public final void e(boolean z, boolean z2) {
        if (!this.c) {
            if (!this.d || (z2 && !z)) {
                this.c = true;
                int i = this.a;
                if (z) {
                    jf7 Y = jf7.Y(i);
                    Y.a.c(new ds6(this, Y, z2, (byte) 7));
                    return;
                }
                ConnectionsManager.getInstance(i).sendRequest(new TL_account.getBusinessChatLinks(), new p41(this, (byte) 0));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.b);
        jf7 Y = jf7.Y(this.a);
        Y.a.c(new q41(Y, arrayList, (byte) 0));
    }
}
