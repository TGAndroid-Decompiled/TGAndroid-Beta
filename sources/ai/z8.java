package ai;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.q00;
public final class z8 implements Runnable {
    public final int f2550a;
    public final int f2551b;
    public final boolean f2552c;
    public final Object d;

    public z8(Object obj, int i10, boolean z10, int i11) {
        this.f2550a = i11;
        this.d = obj;
        this.f2551b = i10;
        this.f2552c = z10;
    }

    @Override
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i10;
        String formatPluralString;
        switch (this.f2550a) {
            case 0:
                ha haVar = (ha) this.d;
                if (!this.f2552c) {
                    haVar.getClass();
                    return;
                }
                Set set = haVar.Q;
                int i11 = this.f2551b;
                set.remove(Integer.valueOf(i11));
                Runnable runnable = (Runnable) haVar.R.remove(Integer.valueOf(i11));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                i2.q0 q0Var = (i2.q0) this.d;
                j2.e eVar = q0Var.M;
                i2.q1[] q1VarArr = q0Var.f12567a;
                int i12 = this.f2551b;
                int i13 = q1VarArr[i12].f12598a.f12344b;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1033, new ih.l(p5, i12, i13, this.f2552c));
                return;
            case 2:
                ((ng0) this.d).f28906a.f29270b.A3(this.f2551b, this.f2552c);
                return;
            case 3:
                yn0 yn0Var = (yn0) this.d;
                yn0Var.f33007o = null;
                yn0Var.c(this.f2551b, this.f2552c, true);
                return;
            case 4:
                wv0 wv0Var = ((ot0) this.d).f29380a;
                org.telegram.ui.ActionBar.o2 o2Var = wv0Var.f32410v1;
                if (o2Var != null) {
                    boolean z10 = this.f2552c;
                    int i14 = this.f2551b;
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = wv0.f0(i14, true);
                        tL_channels_setMainProfileTab.channel = o2Var.getMessagesController().getInputChannel(wv0Var.f32369d1.f20345id);
                        TLRPC.ChatFull chatFull = wv0Var.f32369d1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab f02 = wv0.f0(i14, true);
                        tL_account_setMainProfileTab2.tab = f02;
                        TLRPC.UserFull userFull = wv0Var.f32372e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = f02;
                            o2Var.getMessagesStorage().updateUserInfo(wv0Var.f32372e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    o2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    wv0Var.A1(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0((q00) this.d);
                boolean z11 = this.f2552c;
                if (z11) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i15 = this.f2551b;
                if (z11) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i15, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i15, new Object[0]);
                }
                org.telegram.ui.Components.oc M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f29203j = 5000;
                M.j();
                return;
        }
    }

    public z8(Object obj, boolean z10, int i10, int i11) {
        this.f2550a = i11;
        this.d = obj;
        this.f2552c = z10;
        this.f2551b = i10;
    }
}
