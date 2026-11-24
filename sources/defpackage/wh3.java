package defpackage;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class wh3 implements va5 {
    public final hd a;
    public final cj3 b;

    public wh3(cj3 cj3Var, hd hdVar) {
        this.b = cj3Var;
        this.a = hdVar;
    }

    @Override
    public final void a(wa5 wa5Var, final long j) {
        final d[] dVarArr = {wa5Var, null};
        p8c p8cVar = new p8c(this) {
            public final wh3 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                byte b = r5;
                d[] dVarArr2 = dVarArr;
                long j2 = j;
                wh3 wh3Var = this.b;
                Runnable runnable = (Runnable) obj;
                switch (b) {
                    case 0:
                        cj3 cj3Var = wh3Var.b;
                        Boolean bool = cj3Var.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j2);
                            bundle.putBoolean("forcePublic", cj3Var.H.has_username.booleanValue());
                            yh1 yh1Var = new yh1(bundle);
                            yh1Var.v0 = new w72(runnable, (byte) 18);
                            cj3Var.presentFragment(yh1Var);
                            dVarArr2[1] = yh1Var;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        cj3 cj3Var2 = wh3Var.b;
                        cj3Var2.i5(cj3Var2.getMessagesController().K0(Long.valueOf(j2)), runnable, new wc3(wh3Var, dVarArr2, (byte) 6));
                        return;
                }
            }
        };
        p8c p8cVar2 = new p8c(this) {
            public final wh3 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                byte b = r5;
                d[] dVarArr2 = dVarArr;
                long j2 = j;
                wh3 wh3Var = this.b;
                Runnable runnable = (Runnable) obj;
                switch (b) {
                    case 0:
                        cj3 cj3Var = wh3Var.b;
                        Boolean bool = cj3Var.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j2);
                            bundle.putBoolean("forcePublic", cj3Var.H.has_username.booleanValue());
                            yh1 yh1Var = new yh1(bundle);
                            yh1Var.v0 = new w72(runnable, (byte) 18);
                            cj3Var.presentFragment(yh1Var);
                            dVarArr2[1] = yh1Var;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        cj3 cj3Var2 = wh3Var.b;
                        cj3Var2.i5(cj3Var2.getMessagesController().K0(Long.valueOf(j2)), runnable, new wc3(wh3Var, dVarArr2, (byte) 6));
                        return;
                }
            }
        };
        hd hdVar = this.a;
        Utilities.u(0, p8cVar, p8cVar2, new p0c(this, hdVar, j, (byte) 2), new p8c(this) {
            public final wh3 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z;
                byte b = r4;
                wh3 wh3Var = this.b;
                switch (b) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        cj3 cj3Var = wh3Var.b;
                        if (cj3Var.H.bot_admin_rights != null) {
                            TLRPC.User V1 = cj3Var.getMessagesController().V1(Long.valueOf(cj3Var.I));
                            na7 messagesController = cj3Var.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = cj3Var.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            boolean z2 = z;
                            messagesController.U4(j, V1, tL_chatAdminRights, null, false, cj3Var, z2, true, null, runnable, new ce(runnable, (byte) 14));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        cj3 cj3Var2 = wh3Var.b;
                        if (cj3Var2.H.user_admin_rights != null) {
                            na7 messagesController2 = cj3Var2.getMessagesController();
                            long j2 = j;
                            cj3Var2.getMessagesController().U4(j2, y6c.h(cj3Var2.getAccountInstance().a).f(), zc2.o0(messagesController2.K0(Long.valueOf(j2)).admin_rights, cj3Var2.H.user_admin_rights), null, false, cj3Var2, false, true, null, runnable2, new ce(runnable2, (byte) 13));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new p8c(this) {
            public final wh3 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z;
                byte b = r4;
                wh3 wh3Var = this.b;
                switch (b) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        cj3 cj3Var = wh3Var.b;
                        if (cj3Var.H.bot_admin_rights != null) {
                            TLRPC.User V1 = cj3Var.getMessagesController().V1(Long.valueOf(cj3Var.I));
                            na7 messagesController = cj3Var.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = cj3Var.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            boolean z2 = z;
                            messagesController.U4(j, V1, tL_chatAdminRights, null, false, cj3Var, z2, true, null, runnable, new ce(runnable, (byte) 14));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        cj3 cj3Var2 = wh3Var.b;
                        if (cj3Var2.H.user_admin_rights != null) {
                            na7 messagesController2 = cj3Var2.getMessagesController();
                            long j2 = j;
                            cj3Var2.getMessagesController().U4(j2, y6c.h(cj3Var2.getAccountInstance().a).f(), zc2.o0(messagesController2.K0(Long.valueOf(j2)).admin_rights, cj3Var2.H.user_admin_rights), null, false, cj3Var2, false, true, null, runnable2, new ce(runnable2, (byte) 13));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new s0c(this, hdVar, j, dVarArr, (byte) 3));
    }
}
