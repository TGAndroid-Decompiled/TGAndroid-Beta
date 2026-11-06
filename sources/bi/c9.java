package bi;

import java.util.HashMap;
import org.telegram.messenger.gz;
import org.telegram.messenger.qp;
import org.telegram.messenger.vo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.Components.zd0;
public final class c9 implements Runnable {
    public final int f3584a;
    public final int f3585b;
    public final boolean f3586c;
    public final Object d;

    public c9(Object obj, int i7, boolean z9, int i10) {
        this.f3584a = i10;
        this.d = obj;
        this.f3585b = i7;
        this.f3586c = z9;
    }

    @Override
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i7;
        String G;
        int i10 = this.f3584a;
        int i11 = this.f3585b;
        boolean z9 = this.f3586c;
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
                int i12 = r0Var.f18001a[i11].f18033a.f17757b;
                m2.a U = eVar.U();
                eVar.V(U, 1033, new m2.c(U, i11, i12, z9));
                return;
            case 2:
                qp qpVar = (qp) obj;
                int i13 = 0;
                while (i13 < qpVar.P0.size()) {
                    if (((vo) qpVar.P0.get(i13)).f26064a == i11) {
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
                ((zd0) obj).f40937a.f31784b.w3(i11, z9);
                return;
            case 5:
                fl0 fl0Var = (fl0) obj;
                fl0Var.f33581o = null;
                fl0Var.c(i11, z9, true);
                return;
            case 6:
                xs0 xs0Var = ((uq0) obj).f38697a;
                org.telegram.ui.ActionBar.f2 f2Var = xs0Var.f40440x1;
                if (f2Var != null) {
                    if (z9) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = xs0.o0(i11, true);
                        tL_channels_setMainProfileTab.channel = f2Var.getMessagesController().h1(xs0Var.f40389f1.f26954id);
                        TLRPC.ChatFull chatFull = xs0Var.f40389f1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab o02 = xs0.o0(i11, true);
                        tL_account_setMainProfileTab2.tab = o02;
                        TLRPC.UserFull userFull = xs0Var.f40392g1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = o02;
                            f2Var.getMessagesStorage().j2(xs0Var.f40392g1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    f2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    xs0Var.N1(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0((org.telegram.ui.gz) obj);
                if (z9) {
                    i7 = 2131624025;
                } else {
                    i7 = 2131624026;
                }
                if (z9) {
                    G = org.telegram.messenger.hd.G(i11, "FolderLinkAddedChats", new Object[0]);
                } else {
                    G = org.telegram.messenger.hd.G(i11, "FolderLinkRemovedChats", new Object[0]);
                }
                org.telegram.ui.Components.cc I = a02.I(i7, G, org.telegram.messenger.hd.M0(2131750669, null));
                I.f32514j = 5000;
                I.j();
                return;
        }
    }

    public c9(Object obj, boolean z9, int i7, int i10) {
        this.f3584a = i10;
        this.d = obj;
        this.f3586c = z9;
        this.f3585b = i7;
    }
}
