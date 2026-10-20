package ai;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.n00;
public final class z8 implements Runnable {
    public final int f2546a;
    public final int f2547b;
    public final boolean f2548c;
    public final Object d;

    public z8(Object obj, int i10, boolean z10, int i11) {
        this.f2546a = i11;
        this.d = obj;
        this.f2547b = i10;
        this.f2548c = z10;
    }

    @Override
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i10;
        String formatPluralString;
        switch (this.f2546a) {
            case 0:
                ga gaVar = (ga) this.d;
                if (!this.f2548c) {
                    gaVar.getClass();
                    return;
                }
                Set set = gaVar.Q;
                int i11 = this.f2547b;
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
                i2.q1[] q1VarArr = r0Var.f12542a;
                int i12 = this.f2547b;
                int i13 = q1VarArr[i12].f12537a.f12312b;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1033, new j2.c(p5, i12, i13, this.f2548c));
                return;
            case 2:
                ((kg0) this.d).f27874a.f28152b.A3(this.f2547b, this.f2548c);
                return;
            case 3:
                wn0 wn0Var = (wn0) this.d;
                wn0Var.f32169o = null;
                wn0Var.c(this.f2547b, this.f2548c, true);
                return;
            case 4:
                uv0 uv0Var = ((mt0) this.d).f28598a;
                org.telegram.ui.ActionBar.n2 n2Var = uv0Var.f31070v1;
                if (n2Var != null) {
                    boolean z10 = this.f2548c;
                    int i14 = this.f2547b;
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = uv0.e0(i14, true);
                        tL_channels_setMainProfileTab.channel = n2Var.getMessagesController().getInputChannel(uv0Var.f31032d1.f20277id);
                        TLRPC.ChatFull chatFull = uv0Var.f31032d1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab e02 = uv0.e0(i14, true);
                        tL_account_setMainProfileTab2.tab = e02;
                        TLRPC.UserFull userFull = uv0Var.f31034e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = e02;
                            n2Var.getMessagesStorage().updateUserInfo(uv0Var.f31034e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    n2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    uv0Var.y1(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0((n00) this.d);
                boolean z11 = this.f2548c;
                if (z11) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i15 = this.f2547b;
                if (z11) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i15, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i15, new Object[0]);
                }
                org.telegram.ui.Components.qc M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f29530j = 5000;
                M.j();
                return;
        }
    }

    public z8(Object obj, boolean z10, int i10, int i11) {
        this.f2546a = i11;
        this.d = obj;
        this.f2548c = z10;
        this.f2547b = i10;
    }
}
