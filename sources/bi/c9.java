package bi;

import java.util.HashMap;
import org.telegram.messenger.gz;
import org.telegram.messenger.qp;
import org.telegram.messenger.vo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.Components.zd0;
import org.telegram.ui.jz;
public final class c9 implements Runnable {
    public final int f3587a;
    public final int f3588b;
    public final boolean f3589c;
    public final Object d;

    public c9(Object obj, int i7, boolean z9, int i10) {
        this.f3587a = i10;
        this.d = obj;
        this.f3588b = i7;
        this.f3589c = z9;
    }

    @Override
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i7;
        String G;
        int i10 = this.f3587a;
        int i11 = this.f3588b;
        boolean z9 = this.f3589c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                ea eaVar = (ea) obj;
                if (!z9) {
                    eaVar.getClass();
                    return;
                }
                eaVar.Q.remove(Integer.valueOf(i11));
                Runnable runnable = (Runnable) eaVar.R.remove(Integer.valueOf(i11));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                l2.r0 r0Var = (l2.r0) obj;
                m2.e eVar = r0Var.M;
                int i12 = r0Var.f18005a[i11].f18037a.f17761b;
                m2.a U = eVar.U();
                eVar.V(U, 1033, new m2.c(U, i11, i12, z9));
                return;
            case 2:
                qp qpVar = (qp) obj;
                int i13 = 0;
                while (i13 < qpVar.P0.size()) {
                    if (((vo) qpVar.P0.get(i13)).f26074a == i11) {
                        qpVar.P0.remove(i13);
                        i13--;
                    }
                    i13++;
                }
                qpVar.Q0 = null;
                qpVar.R0.clear();
                qpVar.getNotificationCenter().k(184, new Object[0]);
                if (z9) {
                    qpVar.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            case 3:
                HashMap hashMap = ((gz) obj).H;
                Boolean bool = (Boolean) hashMap.get(Integer.valueOf(i11));
                if (bool != null && bool.booleanValue() == z9) {
                    hashMap.remove(Integer.valueOf(i11));
                    return;
                }
                return;
            case 4:
                ((zd0) obj).f40919a.f31842b.w3(i11, z9);
                return;
            case 5:
                fl0 fl0Var = (fl0) obj;
                fl0Var.f33578o = null;
                fl0Var.c(i11, z9, true);
                return;
            case 6:
                ys0 ys0Var = ((wq0) obj).f40056a;
                org.telegram.ui.ActionBar.f2 f2Var = ys0Var.f40719x1;
                if (f2Var != null) {
                    if (z9) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = ys0.o0(i11, true);
                        tL_channels_setMainProfileTab.channel = f2Var.getMessagesController().h1(ys0Var.f40668f1.f26961id);
                        TLRPC.ChatFull chatFull = ys0Var.f40668f1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab o02 = ys0.o0(i11, true);
                        tL_account_setMainProfileTab2.tab = o02;
                        TLRPC.UserFull userFull = ys0Var.f40671g1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = o02;
                            f2Var.getMessagesStorage().j2(ys0Var.f40671g1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    f2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    ys0Var.P1(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.gc a02 = org.telegram.ui.Components.gc.a0((jz) obj);
                if (z9) {
                    i7 = 2131624025;
                } else {
                    i7 = 2131624026;
                }
                if (z9) {
                    G = org.telegram.messenger.id.G(i11, "FolderLinkAddedChats", new Object[0]);
                } else {
                    G = org.telegram.messenger.id.G(i11, "FolderLinkRemovedChats", new Object[0]);
                }
                org.telegram.ui.Components.bc I = a02.I(i7, G, org.telegram.messenger.id.M0(2131750668, null));
                I.f32203j = 5000;
                I.j();
                return;
        }
    }

    public c9(Object obj, boolean z9, int i7, int i10) {
        this.f3587a = i10;
        this.d = obj;
        this.f3589c = z9;
        this.f3588b = i7;
    }
}
