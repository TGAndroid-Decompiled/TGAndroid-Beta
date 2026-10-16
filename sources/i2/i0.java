package i2;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.k10;
import zh.n5;
public final class i0 implements Runnable {
    public final int f11043a;
    public final boolean f11044b;
    public final int f11045c;
    public final Object d;

    public i0(Object obj, int i10, boolean z10, int i11) {
        this.f11043a = i11;
        this.d = obj;
        this.f11045c = i10;
        this.f11044b = z10;
    }

    @Override
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i10;
        String formatPluralString;
        switch (this.f11043a) {
            case 0:
                r0 r0Var = (r0) this.d;
                j2.f fVar = r0Var.M;
                r1[] r1VarArr = r0Var.f11153a;
                int i11 = this.f11045c;
                int i12 = r1VarArr[i11].f11184a.f10920b;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1033, new j2.c(p5, i11, i12, this.f11044b));
                return;
            case 1:
                ((qg0) this.d).f28282a.f28524b.y3(this.f11045c, this.f11044b);
                return;
            case 2:
                zn0 zn0Var = (zn0) this.d;
                zn0Var.f31609o = null;
                zn0Var.c(this.f11045c, this.f11044b, true);
                return;
            case 3:
                xv0 xv0Var = ((pt0) this.d).f28107a;
                m2 m2Var = xv0Var.f31069v1;
                if (m2Var != null) {
                    boolean z10 = this.f11044b;
                    int i13 = this.f11045c;
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = xv0.d0(i13, true);
                        tL_channels_setMainProfileTab.channel = m2Var.getMessagesController().getInputChannel(xv0Var.f31031d1.f18917id);
                        TLRPC.ChatFull chatFull = xv0Var.f31031d1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = xv0.d0(i13, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = xv0Var.f31033e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            m2Var.getMessagesStorage().updateUserInfo(xv0Var.f31033e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    m2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    xv0Var.w1(true);
                    return;
                }
                return;
            case 4:
                zc a02 = zc.a0((k10) this.d);
                boolean z11 = this.f11044b;
                if (z11) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i14 = this.f11045c;
                if (z11) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i14, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i14, new Object[0]);
                }
                sc M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f28805j = 5000;
                M.j();
                return;
            default:
                n5 n5Var = (n5) this.d;
                if (!this.f11044b) {
                    n5Var.getClass();
                    return;
                }
                Set set = n5Var.Q;
                int i15 = this.f11045c;
                set.remove(Integer.valueOf(i15));
                Runnable runnable = (Runnable) n5Var.R.remove(Integer.valueOf(i15));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public i0(Object obj, boolean z10, int i10, int i11) {
        this.f11043a = i11;
        this.d = obj;
        this.f11044b = z10;
        this.f11045c = i10;
    }
}
