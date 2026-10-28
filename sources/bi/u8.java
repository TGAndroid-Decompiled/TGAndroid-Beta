package bi;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.jb1;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.wt0;
import org.telegram.ui.q00;
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
                i2.r1[] r1VarArr = s0Var.f13727a;
                int i12 = this.f5523b;
                int i13 = r1VarArr[i12].f13721a.f13490b;
                j2.a p10 = eVar.p();
                eVar.q(p10, 1033, new ig.g(p10, i12, i13, this.f5524c));
                return;
            case 2:
                ((mg0) this.d).f30537a.f30907b.B3(this.f5523b, this.f5524c);
                return;
            case 3:
                fo0 fo0Var = (fo0) this.d;
                fo0Var.f28230o = null;
                fo0Var.c(this.f5523b, this.f5524c, true);
                return;
            case 4:
                bw0 bw0Var = ((wt0) this.d).f34574a;
                org.telegram.ui.ActionBar.r2 r2Var = bw0Var.f26992x1;
                if (r2Var != null) {
                    boolean z10 = this.f5524c;
                    int i14 = this.f5523b;
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = bw0.l0(i14, true);
                        tL_channels_setMainProfileTab.channel = r2Var.getMessagesController().getInputChannel(bw0Var.f26943f1.f22029id);
                        TLRPC.ChatFull chatFull = bw0Var.f26943f1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab l02 = bw0.l0(i14, true);
                        tL_account_setMainProfileTab2.tab = l02;
                        TLRPC.UserFull userFull = bw0Var.f26946g1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = l02;
                            r2Var.getMessagesStorage().updateUserInfo(bw0Var.f26946g1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    r2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    bw0Var.J1(true);
                    return;
                }
                return;
            case 5:
                gb1 gb1Var = (gb1) jb1.f29624a.get((String) this.d);
                if (gb1Var != null && gb1Var.f28526s != null) {
                    boolean contains = jb1.f29628g.contains(gb1Var);
                    int i15 = this.f5523b;
                    if (contains) {
                        gb1Var.D = i15;
                        gb1Var.f28526s.q(i15);
                        return;
                    }
                    gb1Var.D = i15;
                    gb1Var.E = this.f5524c;
                    ArrayList arrayList = jb1.f29627f;
                    arrayList.remove(gb1Var);
                    arrayList.add(gb1Var);
                    jb1.n();
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0((q00) this.d);
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
                M.f31861j = 5000;
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
