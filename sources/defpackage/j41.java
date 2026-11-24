package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class j41 {
    public static volatile j41[] e = new j41[4];
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

    public j41(int i) {
        this.a = i;
    }

    public static j41 d(int i) {
        j41 j41Var;
        j41 j41Var2 = e[i];
        if (j41Var2 == null) {
            synchronized (f[i]) {
                j41Var = e[i];
                if (j41Var == null) {
                    j41[] j41VarArr = e;
                    j41 j41Var3 = new j41(i);
                    j41VarArr[i] = j41Var3;
                    j41Var = j41Var3;
                }
            }
            return j41Var;
        }
        return j41Var2;
    }

    public final void a(f41 f41Var, String str) {
        TL_account.TL_businessChatLink c = c(str);
        if (c != null) {
            ArrayList arrayList = this.b;
            int indexOf = arrayList.indexOf(c);
            arrayList.remove(c);
            kk7.f(this.a).k(kk7.I1, new Object[0]);
            u21.b0(f41Var).U(k96.M0(2131752703, null), true, new va7(this, indexOf, c, (byte) 8), new fv0(this, str, c, (byte) 7)).j();
        }
    }

    public final void b(TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, av1 av1Var) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.a).sendRequest(editbusinesschatlink, new en0(this, tL_businessChatLink, av1Var, (byte) 9));
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
                    ad7 Y = ad7.Y(i);
                    Y.a.c(new mn6(this, Y, z2, (byte) 7));
                    return;
                }
                ConnectionsManager.getInstance(i).sendRequest(new TL_account.getBusinessChatLinks(), new h41(this, (byte) 0));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.b);
        ad7 Y = ad7.Y(this.a);
        Y.a.c(new i41(Y, arrayList, (byte) 0));
    }
}
