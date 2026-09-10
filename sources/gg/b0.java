package gg;

import android.text.TextUtils;
import bi.g3;
import bi.wa;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.qd;
import org.telegram.ui.Components.wc;
public final class b0 {
    public static volatile b0[] e = new b0[4];
    public static final Object[] f8815f = new Object[4];
    public final int f8816a;
    public final ArrayList f8817b = new ArrayList();
    public boolean f8818c = false;
    public boolean d = false;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f8815f[i10] = new Object();
        }
    }

    public b0(int i10) {
        this.f8816a = i10;
    }

    public static b0 d(int i10) {
        b0 b0Var;
        b0 b0Var2 = e[i10];
        if (b0Var2 == null) {
            synchronized (f8815f[i10]) {
                try {
                    b0Var = e[i10];
                    if (b0Var == null) {
                        b0[] b0VarArr = e;
                        b0 b0Var3 = new b0(i10);
                        b0VarArr[i10] = b0Var3;
                        b0Var = b0Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return b0Var;
        }
        return b0Var2;
    }

    public final void a(x xVar, String str) {
        TL_account.TL_businessChatLink c10 = c(str);
        if (c10 != null) {
            ArrayList arrayList = this.f8817b;
            int indexOf = arrayList.indexOf(c10);
            arrayList.remove(c10);
            NotificationCenter.getInstance(this.f8816a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
            wc.a0(xVar).U(LocaleController.getString(R.string.BusinessLinkDeleted), true, new g3(this, indexOf, c10, 9), new a0(this, str, c10, 0)).j();
        }
    }

    public final void b(TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, qd qdVar) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.f8816a).sendRequest(editbusinesschatlink, new wa(this, tL_businessChatLink, qdVar, 3));
    }

    public final TL_account.TL_businessChatLink c(String str) {
        TL_account.TL_businessChatLink tL_businessChatLink;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f8817b;
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
        if (!this.f8818c) {
            if (!this.d || (z11 && !z10)) {
                this.f8818c = true;
                int i10 = this.f8816a;
                if (z10) {
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                    messagesStorage.getStorageQueue().postRunnable(new bi.c1(this, messagesStorage, z11));
                    return;
                }
                ConnectionsManager.getInstance(i10).sendRequest(new TL_account.getBusinessChatLinks(), new z(this, 0));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.f8817b);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f8816a);
        messagesStorage.getStorageQueue().postRunnable(new bi.a1(1, arrayList, messagesStorage));
    }
}
