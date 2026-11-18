package di;

import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.ro;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.je0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.kz;
public final class x7 implements Runnable {
    public final int f10015a;
    public final int f10016b;
    public final boolean f10017c;
    public final Object d;

    public x7(Object obj, int i7, boolean z10, int i10) {
        this.f10015a = i10;
        this.d = obj;
        this.f10016b = i7;
        this.f10017c = z10;
    }

    @Override
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i7;
        String G;
        int i10 = this.f10015a;
        int i11 = this.f10016b;
        boolean z10 = this.f10017c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                x8 x8Var = (x8) obj;
                if (!z10) {
                    x8Var.getClass();
                    return;
                }
                x8Var.Q.remove(Integer.valueOf(i11));
                Runnable runnable = (Runnable) x8Var.R.remove(Integer.valueOf(i11));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                l2.o0 o0Var = (l2.o0) obj;
                m2.d dVar = o0Var.N;
                int i12 = o0Var.f19488a[i11].f19481a.f19256b;
                m2.a U = dVar.U();
                dVar.V(U, 1033, new li.c(U, i11, i12, z10));
                return;
            case 2:
                mp mpVar = (mp) obj;
                int i13 = 0;
                while (i13 < mpVar.Q0.size()) {
                    if (((ro) mpVar.Q0.get(i13)).f26674a == i11) {
                        mpVar.Q0.remove(i13);
                        i13--;
                    }
                    i13++;
                }
                mpVar.R0 = null;
                mpVar.S0.clear();
                mpVar.getNotificationCenter().k(184, new Object[0]);
                if (z10) {
                    mpVar.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            case 3:
                HashMap hashMap = ((zy) obj).I;
                Boolean bool = (Boolean) hashMap.get(Integer.valueOf(i11));
                if (bool != null && bool.booleanValue() == z10) {
                    hashMap.remove(Integer.valueOf(i11));
                    return;
                }
                return;
            case 4:
                ((je0) obj).f36422a.f36744b.x3(i11, z10);
                return;
            case 5:
                sl0 sl0Var = (sl0) obj;
                sl0Var.f39781o = null;
                sl0Var.c(i11, z10, true);
                return;
            case 6:
                gt0 gt0Var = ((fr0) obj).f35159a;
                org.telegram.ui.ActionBar.h2 h2Var = gt0Var.f35642y1;
                if (h2Var != null) {
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = gt0.o0(i11, true);
                        tL_channels_setMainProfileTab.channel = h2Var.getMessagesController().j1(gt0Var.f35590g1.f28406id);
                        TLRPC.ChatFull chatFull = gt0Var.f35590g1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab o02 = gt0.o0(i11, true);
                        tL_account_setMainProfileTab2.tab = o02;
                        TLRPC.UserFull userFull = gt0Var.f35593h1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = o02;
                            h2Var.getMessagesStorage().j2(gt0Var.f35593h1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    h2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    gt0Var.P1(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0((kz) obj);
                if (z10) {
                    i7 = 2131624026;
                } else {
                    i7 = 2131624027;
                }
                if (z10) {
                    G = gd.G(i11, "FolderLinkAddedChats", new Object[0]);
                } else {
                    G = gd.G(i11, "FolderLinkRemovedChats", new Object[0]);
                }
                org.telegram.ui.Components.gc I = b02.I(i7, G, gd.M0(2131750652, null));
                I.f35461j = 5000;
                I.j();
                return;
        }
    }

    public x7(Object obj, boolean z10, int i7, int i10) {
        this.f10015a = i10;
        this.d = obj;
        this.f10017c = z10;
        this.f10016b = i7;
    }
}
