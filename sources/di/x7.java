package di;

import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.ro;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hr0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.kz;
public final class x7 implements Runnable {
    public final int f10043a;
    public final int f10044b;
    public final boolean f10045c;
    public final Object d;

    public x7(Object obj, int i7, boolean z10, int i10) {
        this.f10043a = i10;
        this.d = obj;
        this.f10044b = i7;
        this.f10045c = z10;
    }

    @Override
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i7;
        String G;
        int i10 = this.f10043a;
        int i11 = this.f10044b;
        boolean z10 = this.f10045c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                y8 y8Var = (y8) obj;
                if (!z10) {
                    y8Var.getClass();
                    return;
                }
                y8Var.Q.remove(Integer.valueOf(i11));
                Runnable runnable = (Runnable) y8Var.R.remove(Integer.valueOf(i11));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                l2.o0 o0Var = (l2.o0) obj;
                m2.d dVar = o0Var.N;
                int i12 = o0Var.f19513a[i11].f19506a.f19281b;
                m2.a U = dVar.U();
                dVar.V(U, 1033, new li.c(U, i11, i12, z10));
                return;
            case 2:
                mp mpVar = (mp) obj;
                int i13 = 0;
                while (i13 < mpVar.Q0.size()) {
                    if (((ro) mpVar.Q0.get(i13)).f26700a == i11) {
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
                ((ke0) obj).f36894a.f37163b.x3(i11, z10);
                return;
            case 5:
                ul0 ul0Var = (ul0) obj;
                ul0Var.f40497o = null;
                ul0Var.c(i11, z10, true);
                return;
            case 6:
                jt0 jt0Var = ((hr0) obj).f35964a;
                org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36689y1;
                if (g2Var != null) {
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = jt0.o0(i11, true);
                        tL_channels_setMainProfileTab.channel = g2Var.getMessagesController().j1(jt0Var.f36637g1.f28432id);
                        TLRPC.ChatFull chatFull = jt0Var.f36637g1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab o02 = jt0.o0(i11, true);
                        tL_account_setMainProfileTab2.tab = o02;
                        TLRPC.UserFull userFull = jt0Var.f36640h1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = o02;
                            g2Var.getMessagesStorage().j2(jt0Var.f36640h1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    g2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    jt0Var.P1(true);
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
                org.telegram.ui.Components.gc I = b02.I(i7, G, gd.N0(2131750651, null));
                I.f35508j = 5000;
                I.j();
                return;
        }
    }

    public x7(Object obj, boolean z10, int i7, int i10) {
        this.f10043a = i10;
        this.d = obj;
        this.f10045c = z10;
        this.f10044b = i7;
    }
}
