package i2;

import java.util.HashMap;
import org.telegram.messenger.bp;
import org.telegram.messenger.dd;
import org.telegram.messenger.rz;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.h00;
import rh.e6;
public final class j0 implements Runnable {
    public final int f7942a;
    public final int f7943b;
    public final boolean f7944c;
    public final Object d;

    public j0(Object obj, int i10, boolean z10, int i11) {
        this.f7942a = i11;
        this.d = obj;
        this.f7943b = i10;
        this.f7944c = z10;
    }

    @Override
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i10;
        String G;
        int i11 = this.f7942a;
        int i12 = this.f7943b;
        boolean z10 = this.f7944c;
        Object obj = this.d;
        switch (i11) {
            case 0:
                s0 s0Var = (s0) obj;
                j2.g gVar = s0Var.M;
                int i13 = s0Var.f8048a[i12].f8087a.f7809b;
                j2.a U = gVar.U();
                gVar.V(U, 1033, new j2.c(U, i12, i13, z10));
                return;
            case 1:
                wp wpVar = (wp) obj;
                int i14 = 0;
                while (i14 < wpVar.P0.size()) {
                    if (((bp) wpVar.P0.get(i14)).f15000a == i12) {
                        wpVar.P0.remove(i14);
                        i14--;
                    }
                    i14++;
                }
                wpVar.Q0 = null;
                wpVar.R0.clear();
                wpVar.getNotificationCenter().k(184, new Object[0]);
                if (z10) {
                    wpVar.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            case 2:
                HashMap hashMap = ((rz) obj).H;
                Boolean bool = (Boolean) hashMap.get(Integer.valueOf(i12));
                if (bool != null && bool.booleanValue() == z10) {
                    hashMap.remove(Integer.valueOf(i12));
                    return;
                }
                return;
            case 3:
                ((ue0) obj).f30946a.f31270b.B3(i12, z10);
                return;
            case 4:
                jm0 jm0Var = (jm0) obj;
                jm0Var.f27471o = null;
                jm0Var.c(i12, z10, true);
                return;
            case 5:
                au0 au0Var = ((wr0) obj).f32302a;
                k2 k2Var = au0Var.f24568x1;
                if (k2Var != null) {
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = au0.n0(i12, true);
                        tL_channels_setMainProfileTab.channel = k2Var.getMessagesController().g1(au0Var.f24516f1.f19795id);
                        TLRPC.ChatFull chatFull = au0Var.f24516f1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab n02 = au0.n0(i12, true);
                        tL_account_setMainProfileTab2.tab = n02;
                        TLRPC.UserFull userFull = au0Var.f24519g1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = n02;
                            k2Var.getMessagesStorage().j2(au0Var.f24519g1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    k2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    au0Var.L1(true);
                    return;
                }
                return;
            case 6:
                cc a02 = cc.a0((h00) obj);
                if (z10) {
                    i10 = 2131624024;
                } else {
                    i10 = 2131624025;
                }
                if (z10) {
                    G = dd.G(i12, "FolderLinkAddedChats", new Object[0]);
                } else {
                    G = dd.G(i12, "FolderLinkRemovedChats", new Object[0]);
                }
                wb I = a02.I(i10, G, dd.L0(2131750669, null));
                I.f32201j = 5000;
                I.j();
                return;
            default:
                e6 e6Var = (e6) obj;
                if (!z10) {
                    e6Var.getClass();
                    return;
                }
                e6Var.Q.remove(Integer.valueOf(i12));
                Runnable runnable = (Runnable) e6Var.R.remove(Integer.valueOf(i12));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public j0(Object obj, boolean z10, int i10, int i11) {
        this.f7942a = i11;
        this.d = obj;
        this.f7944c = z10;
        this.f7943b = i10;
    }
}
