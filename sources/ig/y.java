package ig;

import ai.p2;
import ai.x7;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.rd;
import org.telegram.ui.Components.xc;
public final class y {
    public static volatile y[] e = new y[4];
    public static final Object[] f13085f = new Object[4];
    public final int f13086a;
    public final ArrayList f13087b = new ArrayList();
    public boolean f13088c = false;
    public boolean d = false;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f13085f[i10] = new Object();
        }
    }

    public y(int i10) {
        this.f13086a = i10;
    }

    public static y d(int i10) {
        y yVar;
        y yVar2 = e[i10];
        if (yVar2 == null) {
            synchronized (f13085f[i10]) {
                try {
                    yVar = e[i10];
                    if (yVar == null) {
                        y[] yVarArr = e;
                        y yVar3 = new y(i10);
                        yVarArr[i10] = yVar3;
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
            ArrayList arrayList = this.f13087b;
            int indexOf = arrayList.indexOf(c10);
            arrayList.remove(c10);
            NotificationCenter.getInstance(this.f13086a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
            xc.a0(vVar).U(LocaleController.getString(R.string.BusinessLinkDeleted), true, new ah.o(this, indexOf, c10, 18), new ei.z1(this, str, c10, 26)).j();
        }
    }

    public final void b(TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, rd rdVar) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.f13086a).sendRequest(editbusinesschatlink, new p2(this, tL_businessChatLink, rdVar, 9));
    }

    public final TL_account.TL_businessChatLink c(String str) {
        TL_account.TL_businessChatLink tL_businessChatLink;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f13087b;
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
        if (!this.f13088c) {
            if (!this.d || (z11 && !z10)) {
                this.f13088c = true;
                int i10 = this.f13086a;
                if (z10) {
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                    messagesStorage.getStorageQueue().postRunnable(new x7(this, messagesStorage, z11, 5));
                    return;
                }
                ConnectionsManager.getInstance(i10).sendRequest(new TL_account.getBusinessChatLinks(), new x(this, 0));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.f13087b);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f13086a);
        messagesStorage.getStorageQueue().postRunnable(new ei.w0(1, arrayList, messagesStorage));
    }
}
