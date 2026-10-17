package ai;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.p00;
public final class y8 implements Runnable {
    public final int f2495a;
    public final int f2496b;
    public final boolean f2497c;
    public final Object d;

    public y8(Object obj, int i10, boolean z10, int i11) {
        this.f2495a = i11;
        this.d = obj;
        this.f2496b = i10;
        this.f2497c = z10;
    }

    @Override
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i10;
        String formatPluralString;
        switch (this.f2495a) {
            case 0:
                fa faVar = (fa) this.d;
                if (!this.f2497c) {
                    faVar.getClass();
                    return;
                }
                Set set = faVar.Q;
                int i11 = this.f2496b;
                set.remove(Integer.valueOf(i11));
                Runnable runnable = (Runnable) faVar.R.remove(Integer.valueOf(i11));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                i2.p0 p0Var = (i2.p0) this.d;
                j2.f fVar = p0Var.M;
                i2.p1[] p1VarArr = p0Var.f12536a;
                int i12 = this.f2496b;
                int i13 = p1VarArr[i12].f12567a.f12314b;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1033, new j2.c(p5, i12, i13, this.f2497c));
                return;
            case 2:
                ((jg0) this.d).f27523a.f27864b.y3(this.f2496b, this.f2497c);
                return;
            case 3:
                vn0 vn0Var = (vn0) this.d;
                vn0Var.f31332o = null;
                vn0Var.c(this.f2496b, this.f2497c, true);
                return;
            case 4:
                sv0 sv0Var = ((kt0) this.d).f27985a;
                org.telegram.ui.ActionBar.n2 n2Var = sv0Var.f30388v1;
                if (n2Var != null) {
                    boolean z10 = this.f2497c;
                    int i14 = this.f2496b;
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = sv0.e0(i14, true);
                        tL_channels_setMainProfileTab.channel = n2Var.getMessagesController().getInputChannel(sv0Var.f30350d1.f20273id);
                        TLRPC.ChatFull chatFull = sv0Var.f30350d1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab e02 = sv0.e0(i14, true);
                        tL_account_setMainProfileTab2.tab = e02;
                        TLRPC.UserFull userFull = sv0Var.f30352e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = e02;
                            n2Var.getMessagesStorage().updateUserInfo(sv0Var.f30352e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    n2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    sv0Var.y1(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0((p00) this.d);
                boolean z11 = this.f2497c;
                if (z11) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i15 = this.f2496b;
                if (z11) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i15, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i15, new Object[0]);
                }
                org.telegram.ui.Components.qc M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f29639j = 5000;
                M.j();
                return;
        }
    }

    public y8(Object obj, boolean z10, int i10, int i11) {
        this.f2495a = i11;
        this.d = obj;
        this.f2497c = z10;
        this.f2496b = i10;
    }
}
