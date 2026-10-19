package ai;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.n00;
public final class y8 implements Runnable {
    public final int f2488a;
    public final int f2489b;
    public final boolean f2490c;
    public final Object d;

    public y8(Object obj, int i10, boolean z10, int i11) {
        this.f2488a = i11;
        this.d = obj;
        this.f2489b = i10;
        this.f2490c = z10;
    }

    @Override
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i10;
        String formatPluralString;
        switch (this.f2488a) {
            case 0:
                ga gaVar = (ga) this.d;
                if (!this.f2490c) {
                    gaVar.getClass();
                    return;
                }
                Set set = gaVar.Q;
                int i11 = this.f2489b;
                set.remove(Integer.valueOf(i11));
                Runnable runnable = (Runnable) gaVar.R.remove(Integer.valueOf(i11));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                i2.r0 r0Var = (i2.r0) this.d;
                j2.f fVar = r0Var.M;
                i2.q1[] q1VarArr = r0Var.f12544a;
                int i12 = this.f2489b;
                int i13 = q1VarArr[i12].f12539a.f12314b;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1033, new j2.c(p5, i12, i13, this.f2490c));
                return;
            case 2:
                ((jg0) this.d).f27526a.f27844b.y3(this.f2489b, this.f2490c);
                return;
            case 3:
                vn0 vn0Var = (vn0) this.d;
                vn0Var.f31343o = null;
                vn0Var.c(this.f2489b, this.f2490c, true);
                return;
            case 4:
                tv0 tv0Var = ((lt0) this.d).f28307a;
                org.telegram.ui.ActionBar.n2 n2Var = tv0Var.f30734v1;
                if (n2Var != null) {
                    boolean z10 = this.f2490c;
                    int i14 = this.f2489b;
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = tv0.e0(i14, true);
                        tL_channels_setMainProfileTab.channel = n2Var.getMessagesController().getInputChannel(tv0Var.f30696d1.f20276id);
                        TLRPC.ChatFull chatFull = tv0Var.f30696d1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab e02 = tv0.e0(i14, true);
                        tL_account_setMainProfileTab2.tab = e02;
                        TLRPC.UserFull userFull = tv0Var.f30698e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = e02;
                            n2Var.getMessagesStorage().updateUserInfo(tv0Var.f30698e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    n2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    tv0Var.y1(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0((n00) this.d);
                boolean z11 = this.f2490c;
                if (z11) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i15 = this.f2489b;
                if (z11) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i15, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i15, new Object[0]);
                }
                org.telegram.ui.Components.qc M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f29596j = 5000;
                M.j();
                return;
        }
    }

    public y8(Object obj, boolean z10, int i10, int i11) {
        this.f2488a = i11;
        this.d = obj;
        this.f2490c = z10;
        this.f2489b = i10;
    }
}
