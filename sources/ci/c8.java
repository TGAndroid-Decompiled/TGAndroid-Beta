package ci;

import java.util.HashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.mo;
import org.telegram.messenger.yy;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.ez;
public final class c8 implements Runnable {
    public final int f4919a;
    public final int f4920b;
    public final boolean f4921c;
    public final Object d;

    public c8(Object obj, int i3, boolean z10, int i10) {
        this.f4919a = i10;
        this.d = obj;
        this.f4920b = i3;
        this.f4921c = z10;
    }

    @Override
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i3;
        String G;
        int i10 = this.f4919a;
        int i11 = this.f4920b;
        boolean z10 = this.f4921c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                e9 e9Var = (e9) obj;
                if (!z10) {
                    e9Var.getClass();
                    return;
                }
                e9Var.Q.remove(Integer.valueOf(i11));
                Runnable runnable = (Runnable) e9Var.R.remove(Integer.valueOf(i11));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                k2.r0 r0Var = (k2.r0) obj;
                l2.f fVar = r0Var.N;
                int i12 = r0Var.f16688a[i11].f16721a.f16444b;
                l2.a U = fVar.U();
                fVar.V(U, 1033, new l2.c(i11, i12, U, z10));
                return;
            case 2:
                hp hpVar = (hp) obj;
                int i13 = 0;
                while (i13 < hpVar.Q0.size()) {
                    if (((mo) hpVar.Q0.get(i13)).f24237a == i11) {
                        hpVar.Q0.remove(i13);
                        i13--;
                    }
                    i13++;
                }
                hpVar.R0 = null;
                hpVar.S0.clear();
                hpVar.getNotificationCenter().k(184, new Object[0]);
                if (z10) {
                    hpVar.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            case 3:
                HashMap hashMap = ((yy) obj).I;
                Boolean bool = (Boolean) hashMap.get(Integer.valueOf(i11));
                if (bool != null && bool.booleanValue() == z10) {
                    hashMap.remove(Integer.valueOf(i11));
                    return;
                }
                return;
            case 4:
                ((td0) obj).f38396a.f38720b.B3(i11, z10);
                return;
            case 5:
                jl0 jl0Var = (jl0) obj;
                jl0Var.f35113o = null;
                jl0Var.c(i11, z10, true);
                return;
            case 6:
                ws0 ws0Var = ((uq0) obj).f38849a;
                org.telegram.ui.ActionBar.d2 d2Var = ws0Var.f40142y1;
                if (d2Var != null) {
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = ws0.o0(i11, true);
                        tL_channels_setMainProfileTab.channel = d2Var.getMessagesController().h1(ws0Var.f40090g1.f27002id);
                        TLRPC.ChatFull chatFull = ws0Var.f40090g1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab o02 = ws0.o0(i11, true);
                        tL_account_setMainProfileTab2.tab = o02;
                        TLRPC.UserFull userFull = ws0Var.f40093h1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = o02;
                            d2Var.getMessagesStorage().j2(ws0Var.f40093h1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    d2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    ws0Var.N1(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0((ez) obj);
                if (z10) {
                    i3 = 2131624025;
                } else {
                    i3 = 2131624026;
                }
                if (z10) {
                    G = bd.G(i11, "FolderLinkAddedChats", new Object[0]);
                } else {
                    G = bd.G(i11, "FolderLinkRemovedChats", new Object[0]);
                }
                org.telegram.ui.Components.ac I = a02.I(i3, G, bd.M0(2131750669, null));
                I.f31792j = 5000;
                I.j();
                return;
        }
    }

    public c8(Object obj, boolean z10, int i3, int i10) {
        this.f4919a = i10;
        this.d = obj;
        this.f4921c = z10;
        this.f4920b = i3;
    }
}
