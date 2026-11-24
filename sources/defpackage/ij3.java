package defpackage;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class ij3 implements tc5 {
    public final he a;
    public final nk3 b;

    public ij3(nk3 nk3Var, he heVar) {
        this.b = nk3Var;
        this.a = heVar;
    }

    @Override
    public final void a(uc5 uc5Var, final long j) {
        final d[] dVarArr = {uc5Var, null};
        qac qacVar = new qac(this) {
            public final ij3 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                byte b = r5;
                d[] dVarArr2 = dVarArr;
                long j2 = j;
                ij3 ij3Var = this.b;
                Runnable runnable = (Runnable) obj;
                switch (b) {
                    case 0:
                        nk3 nk3Var = ij3Var.b;
                        Boolean bool = nk3Var.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j2);
                            bundle.putBoolean("forcePublic", nk3Var.H.has_username.booleanValue());
                            fj1 fj1Var = new fj1(bundle);
                            fj1Var.v0 = new h92(runnable, (byte) 18);
                            nk3Var.presentFragment(fj1Var);
                            dVarArr2[1] = fj1Var;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        nk3 nk3Var2 = ij3Var.b;
                        nk3Var2.m5(nk3Var2.getMessagesController().L0(Long.valueOf(j2)), runnable, new rd3(ij3Var, dVarArr2, (byte) 7));
                        return;
                }
            }
        };
        qac qacVar2 = new qac(this) {
            public final ij3 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                byte b = r5;
                d[] dVarArr2 = dVarArr;
                long j2 = j;
                ij3 ij3Var = this.b;
                Runnable runnable = (Runnable) obj;
                switch (b) {
                    case 0:
                        nk3 nk3Var = ij3Var.b;
                        Boolean bool = nk3Var.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j2);
                            bundle.putBoolean("forcePublic", nk3Var.H.has_username.booleanValue());
                            fj1 fj1Var = new fj1(bundle);
                            fj1Var.v0 = new h92(runnable, (byte) 18);
                            nk3Var.presentFragment(fj1Var);
                            dVarArr2[1] = fj1Var;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        nk3 nk3Var2 = ij3Var.b;
                        nk3Var2.m5(nk3Var2.getMessagesController().L0(Long.valueOf(j2)), runnable, new rd3(ij3Var, dVarArr2, (byte) 7));
                        return;
                }
            }
        };
        he heVar = this.a;
        Utilities.u(0, qacVar, qacVar2, new p2c(this, heVar, j, (byte) 2), new qac(this) {
            public final ij3 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z;
                byte b = r4;
                ij3 ij3Var = this.b;
                switch (b) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        nk3 nk3Var = ij3Var.b;
                        if (nk3Var.H.bot_admin_rights != null) {
                            TLRPC.User W1 = nk3Var.getMessagesController().W1(Long.valueOf(nk3Var.I));
                            oc7 messagesController = nk3Var.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = nk3Var.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            boolean z2 = z;
                            messagesController.X4(j, W1, tL_chatAdminRights, null, false, nk3Var, z2, true, null, runnable, new cf(runnable, (byte) 14));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        nk3 nk3Var2 = ij3Var.b;
                        if (nk3Var2.H.user_admin_rights != null) {
                            oc7 messagesController2 = nk3Var2.getMessagesController();
                            long j2 = j;
                            nk3Var2.getMessagesController().X4(j2, z8c.h(nk3Var2.getAccountInstance().a).f(), ke2.p0(messagesController2.L0(Long.valueOf(j2)).admin_rights, nk3Var2.H.user_admin_rights), null, false, nk3Var2, false, true, null, runnable2, new cf(runnable2, (byte) 13));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new qac(this) {
            public final ij3 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z;
                byte b = r4;
                ij3 ij3Var = this.b;
                switch (b) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        nk3 nk3Var = ij3Var.b;
                        if (nk3Var.H.bot_admin_rights != null) {
                            TLRPC.User W1 = nk3Var.getMessagesController().W1(Long.valueOf(nk3Var.I));
                            oc7 messagesController = nk3Var.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = nk3Var.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            boolean z2 = z;
                            messagesController.X4(j, W1, tL_chatAdminRights, null, false, nk3Var, z2, true, null, runnable, new cf(runnable, (byte) 14));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        nk3 nk3Var2 = ij3Var.b;
                        if (nk3Var2.H.user_admin_rights != null) {
                            oc7 messagesController2 = nk3Var2.getMessagesController();
                            long j2 = j;
                            nk3Var2.getMessagesController().X4(j2, z8c.h(nk3Var2.getAccountInstance().a).f(), ke2.p0(messagesController2.L0(Long.valueOf(j2)).admin_rights, nk3Var2.H.user_admin_rights), null, false, nk3Var2, false, true, null, runnable2, new cf(runnable2, (byte) 13));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new s2c(this, heVar, j, dVarArr, (byte) 3));
    }
}
