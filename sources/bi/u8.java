package bi;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.db1;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.fb1;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.o00;
public final class u8 implements Runnable {
    public final int f5522a;
    public final int f5523b;
    public final boolean f5524c;
    public final Object d;

    public u8(Object obj, int i10, boolean z10, int i11) {
        this.f5522a = i11;
        this.d = obj;
        this.f5523b = i10;
        this.f5524c = z10;
    }

    @Override
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i10;
        String formatPluralString;
        switch (this.f5522a) {
            case 0:
                ca caVar = (ca) this.d;
                if (!this.f5524c) {
                    caVar.getClass();
                    return;
                }
                Set set = caVar.Q;
                int i11 = this.f5523b;
                set.remove(Integer.valueOf(i11));
                Runnable runnable = (Runnable) caVar.R.remove(Integer.valueOf(i11));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                i2.s0 s0Var = (i2.s0) this.d;
                j2.e eVar = s0Var.M;
                i2.r1[] r1VarArr = s0Var.f13728a;
                int i12 = this.f5523b;
                int i13 = r1VarArr[i12].f13722a.f13491b;
                j2.a p10 = eVar.p();
                eVar.q(p10, 1033, new ig.g(p10, i12, i13, this.f5524c));
                return;
            case 2:
                ((lg0) this.d).f30206a.f30573b.A3(this.f5523b, this.f5524c);
                return;
            case 3:
                eo0 eo0Var = (eo0) this.d;
                eo0Var.f27920o = null;
                eo0Var.c(this.f5523b, this.f5524c, true);
                return;
            case 4:
                aw0 aw0Var = ((vt0) this.d).f34257a;
                org.telegram.ui.ActionBar.r2 r2Var = aw0Var.f26702x1;
                if (r2Var != null) {
                    boolean z10 = this.f5524c;
                    int i14 = this.f5523b;
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = aw0.l0(i14, true);
                        tL_channels_setMainProfileTab.channel = r2Var.getMessagesController().getInputChannel(aw0Var.f26653f1.f22028id);
                        TLRPC.ChatFull chatFull = aw0Var.f26653f1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab l02 = aw0.l0(i14, true);
                        tL_account_setMainProfileTab2.tab = l02;
                        TLRPC.UserFull userFull = aw0Var.f26656g1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = l02;
                            r2Var.getMessagesStorage().updateUserInfo(aw0Var.f26656g1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    r2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    aw0Var.J1(true);
                    return;
                }
                return;
            case 5:
                db1 db1Var = (db1) fb1.f28143a.get((String) this.d);
                if (db1Var != null && db1Var.f27490i != null) {
                    boolean contains = fb1.f28147g.contains(db1Var);
                    int i15 = this.f5523b;
                    if (contains) {
                        db1Var.f27501t = i15;
                        db1Var.f27490i.l(i15);
                        return;
                    }
                    db1Var.f27501t = i15;
                    db1Var.f27502u = this.f5524c;
                    ArrayList arrayList = fb1.f28146f;
                    arrayList.remove(db1Var);
                    arrayList.add(db1Var);
                    fb1.j();
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0((o00) this.d);
                boolean z11 = this.f5524c;
                if (z11) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i16 = this.f5523b;
                if (z11) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i16, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i16, new Object[0]);
                }
                org.telegram.ui.Components.qc M = b02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f31887j = 5000;
                M.j();
                return;
        }
    }

    public u8(Object obj, boolean z10, int i10, int i11) {
        this.f5522a = i11;
        this.d = obj;
        this.f5524c = z10;
        this.f5523b = i10;
    }
}
