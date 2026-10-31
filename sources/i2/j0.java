package i2;

import java.util.HashMap;
import org.telegram.messenger.ap;
import org.telegram.messenger.cd;
import org.telegram.messenger.qz;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.vr0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.i00;
import rh.e6;
public final class j0 implements Runnable {
    public final int f7941a;
    public final int f7942b;
    public final boolean f7943c;
    public final Object d;

    public j0(Object obj, int i10, boolean z10, int i11) {
        this.f7941a = i11;
        this.d = obj;
        this.f7942b = i10;
        this.f7943c = z10;
    }

    @Override
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i10;
        String G;
        int i11 = this.f7941a;
        int i12 = this.f7942b;
        boolean z10 = this.f7943c;
        Object obj = this.d;
        switch (i11) {
            case 0:
                s0 s0Var = (s0) obj;
                j2.g gVar = s0Var.M;
                int i13 = s0Var.f8047a[i12].f8086a.f7808b;
                j2.a U = gVar.U();
                gVar.V(U, 1033, new j2.c(U, i12, i13, z10));
                return;
            case 1:
                vp vpVar = (vp) obj;
                int i14 = 0;
                while (i14 < vpVar.P0.size()) {
                    if (((ap) vpVar.P0.get(i14)).f14645a == i12) {
                        vpVar.P0.remove(i14);
                        i14--;
                    }
                    i14++;
                }
                vpVar.Q0 = null;
                vpVar.R0.clear();
                vpVar.getNotificationCenter().k(184, new Object[0]);
                if (z10) {
                    vpVar.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            case 2:
                HashMap hashMap = ((qz) obj).H;
                Boolean bool = (Boolean) hashMap.get(Integer.valueOf(i12));
                if (bool != null && bool.booleanValue() == z10) {
                    hashMap.remove(Integer.valueOf(i12));
                    return;
                }
                return;
            case 3:
                ((ue0) obj).f30912a.f31235b.B3(i12, z10);
                return;
            case 4:
                im0 im0Var = (im0) obj;
                im0Var.f27029o = null;
                im0Var.c(i12, z10, true);
                return;
            case 5:
                zt0 zt0Var = ((vr0) obj).f31835a;
                k2 k2Var = zt0Var.f33240x1;
                if (k2Var != null) {
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = zt0.m0(i12, true);
                        tL_channels_setMainProfileTab.channel = k2Var.getMessagesController().g1(zt0Var.f33188f1.f19794id);
                        TLRPC.ChatFull chatFull = zt0Var.f33188f1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab m0 = zt0.m0(i12, true);
                        tL_account_setMainProfileTab2.tab = m0;
                        TLRPC.UserFull userFull = zt0Var.f33191g1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = m0;
                            k2Var.getMessagesStorage().j2(zt0Var.f33191g1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    k2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    zt0Var.K1(true);
                    return;
                }
                return;
            case 6:
                cc a02 = cc.a0((i00) obj);
                if (z10) {
                    i10 = 2131624024;
                } else {
                    i10 = 2131624025;
                }
                if (z10) {
                    G = cd.G(i12, "FolderLinkAddedChats", new Object[0]);
                } else {
                    G = cd.G(i12, "FolderLinkRemovedChats", new Object[0]);
                }
                wb I = a02.I(i10, G, cd.L0(2131750669, null));
                I.f32135j = 5000;
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
        this.f7941a = i11;
        this.d = obj;
        this.f7943c = z10;
        this.f7942b = i10;
    }
}
