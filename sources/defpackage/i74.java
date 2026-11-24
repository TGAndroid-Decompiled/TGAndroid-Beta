package defpackage;

import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class i74 implements Runnable {
    public final byte a;
    public final boolean b;
    public final int c;
    public final Object d;

    public i74(Object obj, int i, boolean z, byte b) {
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
                r74 r74Var = (r74) obj;
                xa3 xa3Var = r74Var.N;
                byte b2 = r74Var.a[i2].a.b;
                tk U = xa3Var.U();
                xa3Var.V(U, 1033, new u03(U, i2, b2, z));
                return;
            case 1:
                c41 b0 = c41.b0((qf4) obj);
                if (z) {
                    G = jb6.G(i2, "FolderLinkAddedChats", new Object[0]);
                    i = 2131624026;
                } else {
                    G = jb6.G(i2, "FolderLinkRemovedChats", new Object[0]);
                    i = 2131624027;
                }
                u31 I = b0.I(i, G, jb6.M0(2131750600, null));
                I.j = 5000;
                I.j();
                return;
            case 2:
                oc7 oc7Var = (oc7) obj;
                int i3 = 0;
                while (i3 < oc7Var.G0.size()) {
                    if (((ub7) oc7Var.G0.get(i3)).a == i2) {
                        oc7Var.G0.remove(i3);
                        i3--;
                    }
                    i3++;
                }
                oc7Var.H0 = null;
                oc7Var.I0.clear();
                oc7Var.getNotificationCenter().k(185, new Object[0]);
                if (z) {
                    oc7Var.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            case 3:
                HashMap hashMap = ((a6a) obj).I;
                Boolean bool = (Boolean) hashMap.get(Integer.valueOf(i2));
                if (bool != null && bool.booleanValue() == z) {
                    hashMap.remove(Integer.valueOf(i2));
                    return;
                }
                return;
            case 4:
                nha nhaVar = ((mfa) obj).a;
                d dVar = nhaVar.y1;
                if (dVar != null) {
                    if (z) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = nha.Y(i2, true);
                        tL_channels_setMainProfileTab.channel = dVar.getMessagesController().g1(nhaVar.g1.id);
                        TLRPC.ChatFull chatFull = nhaVar.g1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab Y = nha.Y(i2, true);
                        tL_account_setMainProfileTab2.tab = Y;
                        TLRPC.UserFull userFull = nhaVar.h1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = Y;
                            dVar.getMessagesStorage().g2(nhaVar.h1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    dVar.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    nhaVar.N1(true);
                    return;
                }
                return;
            default:
                jva jvaVar = (jva) obj;
                if (z) {
                    jvaVar.Q.remove(Integer.valueOf(i2));
                    Runnable runnable = (Runnable) jvaVar.R.remove(Integer.valueOf(i2));
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public i74(Object obj, boolean z, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = i;
    }
}
