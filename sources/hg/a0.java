package hg;

import ai.s5;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.td;
import org.telegram.ui.Components.xc;
public final class a0 {
    public static volatile a0[] e = new a0[4];
    public static final Object[] f10191f = new Object[4];
    public final int f10192a;
    public final ArrayList f10193b = new ArrayList();
    public boolean f10194c = false;
    public boolean d = false;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f10191f[i10] = new Object();
        }
    }

    public a0(int i10) {
        this.f10192a = i10;
    }

    public static a0 d(int i10) {
        a0 a0Var;
        a0 a0Var2 = e[i10];
        if (a0Var2 == null) {
            synchronized (f10191f[i10]) {
                try {
                    a0Var = e[i10];
                    if (a0Var == null) {
                        a0[] a0VarArr = e;
                        a0 a0Var3 = new a0(i10);
                        a0VarArr[i10] = a0Var3;
                        a0Var = a0Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return a0Var;
        }
        return a0Var2;
    }

    public final void a(x xVar, String str) {
        TL_account.TL_businessChatLink c10 = c(str);
        if (c10 != null) {
            ArrayList arrayList = this.f10193b;
            int indexOf = arrayList.indexOf(c10);
            arrayList.remove(c10);
            NotificationCenter.getInstance(this.f10192a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
            xc.a0(xVar).U(LocaleController.getString(R.string.BusinessLinkDeleted), true, new ai.s1(this, indexOf, c10, 12), new gg.t(this, str, c10, 8)).j();
        }
    }

    public final void b(TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, td tdVar) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.f10192a).sendRequest(editbusinesschatlink, new s5(this, tL_businessChatLink, tdVar, 4));
    }

    public final TL_account.TL_businessChatLink c(String str) {
        TL_account.TL_businessChatLink tL_businessChatLink;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f10193b;
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
        if (!this.f10194c) {
            if (!this.d || (z11 && !z10)) {
                this.f10194c = true;
                int i10 = this.f10192a;
                if (z10) {
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                    messagesStorage.getStorageQueue().postRunnable(new ci.y0(this, messagesStorage, z11));
                    return;
                }
                ConnectionsManager.getInstance(i10).sendRequest(new TL_account.getBusinessChatLinks(), new z(this, 0));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.f10193b);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f10192a);
        messagesStorage.getStorageQueue().postRunnable(new ci.w0(1, arrayList, messagesStorage));
    }
}
