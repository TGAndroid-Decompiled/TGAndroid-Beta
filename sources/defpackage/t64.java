package defpackage;

import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class t64 implements Runnable {
    public final byte a;
    public final boolean b;
    public final int c;
    public final Object d;

    public t64(Object obj, int i, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.c = i;
        this.b = z;
    }

    @Override
    public final void run() {
        String G;
        int i;
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        byte b = this.a;
        int i2 = this.c;
        boolean z = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                c74 c74Var = (c74) obj;
                ea3 ea3Var = c74Var.N;
                byte b2 = c74Var.a[i2].a.b;
                uj U = ea3Var.U();
                ea3Var.V(U, 1033, new uy2(U, i2, b2, z));
                return;
            case 1:
                d31 b0 = d31.b0((nf4) obj);
                if (z) {
                    G = ob6.G(i2, "FolderLinkAddedChats", new Object[0]);
                    i = 2131624026;
                } else {
                    G = ob6.G(i2, "FolderLinkRemovedChats", new Object[0]);
                    i = 2131624027;
                }
                v21 I = b0.I(i, G, ob6.M0(2131750628, null));
                I.j = 5000;
                I.j();
                return;
            case 2:
                uc7 uc7Var = (uc7) obj;
                int i3 = 0;
                while (i3 < uc7Var.G0.size()) {
                    if (((ac7) uc7Var.G0.get(i3)).a == i2) {
                        uc7Var.G0.remove(i3);
                        i3--;
                    }
                    i3++;
                }
                uc7Var.H0 = null;
                uc7Var.I0.clear();
                uc7Var.getNotificationCenter().k(185, new Object[0]);
                if (z) {
                    uc7Var.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            case 3:
                HashMap hashMap = ((r7a) obj).I;
                Boolean bool = (Boolean) hashMap.get(Integer.valueOf(i2));
                if (bool != null && bool.booleanValue() == z) {
                    hashMap.remove(Integer.valueOf(i2));
                    return;
                }
                return;
            case 4:
                eja ejaVar = ((dha) obj).a;
                e eVar = ejaVar.y1;
                if (eVar != null) {
                    if (z) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = eja.Y(i2, true);
                        tL_channels_setMainProfileTab.channel = eVar.getMessagesController().h1(ejaVar.g1.id);
                        TLRPC.ChatFull chatFull = ejaVar.g1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab Y = eja.Y(i2, true);
                        tL_account_setMainProfileTab2.tab = Y;
                        TLRPC.UserFull userFull = ejaVar.h1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = Y;
                            eVar.getMessagesStorage().g2(ejaVar.h1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    eVar.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    ejaVar.N1(true);
                    return;
                }
                return;
            default:
                jxa jxaVar = (jxa) obj;
                if (z) {
                    jxaVar.Q.remove(Integer.valueOf(i2));
                    Runnable runnable = (Runnable) jxaVar.R.remove(Integer.valueOf(i2));
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public t64(Object obj, boolean z, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = i;
    }
}
