package di;

import java.util.HashMap;
import org.telegram.messenger.ez;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.so;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.xq0;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.Components.zd0;
import org.telegram.ui.hz;
public final class u7 implements Runnable {
    public final int f9539a;
    public final int f9540b;
    public final boolean f9541c;
    public final Object d;

    public u7(Object obj, int i7, boolean z10, int i10) {
        this.f9539a = i10;
        this.d = obj;
        this.f9540b = i7;
        this.f9541c = z10;
    }

    @Override
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i7;
        String G;
        int i10 = this.f9539a;
        int i11 = this.f9540b;
        boolean z10 = this.f9541c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                v8 v8Var = (v8) obj;
                if (!z10) {
                    v8Var.getClass();
                    return;
                }
                v8Var.Q.remove(Integer.valueOf(i11));
                Runnable runnable = (Runnable) v8Var.R.remove(Integer.valueOf(i11));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                l2.o0 o0Var = (l2.o0) obj;
                m2.e eVar = o0Var.N;
                int i12 = o0Var.f19121a[i11].f19114a.f18889b;
                m2.a U = eVar.U();
                eVar.V(U, 1033, new li.p(U, i11, i12, z10));
                return;
            case 2:
                np npVar = (np) obj;
                int i13 = 0;
                while (i13 < npVar.Q0.size()) {
                    if (((so) npVar.Q0.get(i13)).f26542a == i11) {
                        npVar.Q0.remove(i13);
                        i13--;
                    }
                    i13++;
                }
                npVar.R0 = null;
                npVar.S0.clear();
                npVar.getNotificationCenter().k(184, new Object[0]);
                if (z10) {
                    npVar.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            case 3:
                HashMap hashMap = ((ez) obj).I;
                Boolean bool = (Boolean) hashMap.get(Integer.valueOf(i11));
                if (bool != null && bool.booleanValue() == z10) {
                    hashMap.remove(Integer.valueOf(i11));
                    return;
                }
                return;
            case 4:
                ((zd0) obj).f42342a.f32969b.x3(i11, z10);
                return;
            case 5:
                kl0 kl0Var = (kl0) obj;
                kl0Var.f36559o = null;
                kl0Var.c(i11, z10, true);
                return;
            case 6:
                ys0 ys0Var = ((xq0) obj).f41753a;
                org.telegram.ui.ActionBar.e2 e2Var = ys0Var.f42150y1;
                if (e2Var != null) {
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = ys0.o0(i11, true);
                        tL_channels_setMainProfileTab.channel = e2Var.getMessagesController().h1(ys0Var.f42098g1.f28052id);
                        TLRPC.ChatFull chatFull = ys0Var.f42098g1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab o02 = ys0.o0(i11, true);
                        tL_account_setMainProfileTab2.tab = o02;
                        TLRPC.UserFull userFull = ys0Var.f42101h1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = o02;
                            e2Var.getMessagesStorage().j2(ys0Var.f42101h1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    e2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    ys0Var.P1(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0((hz) obj);
                if (z10) {
                    i7 = 2131624026;
                } else {
                    i7 = 2131624027;
                }
                if (z10) {
                    G = hd.G(i11, "FolderLinkAddedChats", new Object[0]);
                } else {
                    G = hd.G(i11, "FolderLinkRemovedChats", new Object[0]);
                }
                org.telegram.ui.Components.xb I = a02.I(i7, G, hd.M0(2131750668, null));
                I.f41643j = 5000;
                I.j();
                return;
        }
    }

    public u7(Object obj, boolean z10, int i7, int i10) {
        this.f9539a = i10;
        this.d = obj;
        this.f9541c = z10;
        this.f9540b = i7;
    }
}
