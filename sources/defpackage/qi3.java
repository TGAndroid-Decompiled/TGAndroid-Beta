package defpackage;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class qi3 implements wc5 {
    public final id a;
    public final uj3 b;

    public qi3(uj3 uj3Var, id idVar) {
        this.b = uj3Var;
        this.a = idVar;
    }

    @Override
    public final void a(xc5 xc5Var, final long j) {
        final e[] eVarArr = {xc5Var, null};
        pcc pccVar = new pcc(this) {
            public final qi3 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                byte b = r5;
                e[] eVarArr2 = eVarArr;
                long j2 = j;
                qi3 qi3Var = this.b;
                Runnable runnable = (Runnable) obj;
                switch (b) {
                    case 0:
                        uj3 uj3Var = qi3Var.b;
                        Boolean bool = uj3Var.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j2);
                            bundle.putBoolean("forcePublic", uj3Var.H.has_username.booleanValue());
                            gi1 gi1Var = new gi1(bundle);
                            gi1Var.v0 = new n82(runnable, (byte) 18);
                            uj3Var.presentFragment(gi1Var);
                            eVarArr2[1] = gi1Var;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        uj3 uj3Var2 = qi3Var.b;
                        uj3Var2.m5(uj3Var2.getMessagesController().M0(Long.valueOf(j2)), runnable, new wd3(qi3Var, eVarArr2, (byte) 5));
                        return;
                }
            }
        };
        pcc pccVar2 = new pcc(this) {
            public final qi3 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                byte b = r5;
                e[] eVarArr2 = eVarArr;
                long j2 = j;
                qi3 qi3Var = this.b;
                Runnable runnable = (Runnable) obj;
                switch (b) {
                    case 0:
                        uj3 uj3Var = qi3Var.b;
                        Boolean bool = uj3Var.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j2);
                            bundle.putBoolean("forcePublic", uj3Var.H.has_username.booleanValue());
                            gi1 gi1Var = new gi1(bundle);
                            gi1Var.v0 = new n82(runnable, (byte) 18);
                            uj3Var.presentFragment(gi1Var);
                            eVarArr2[1] = gi1Var;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        uj3 uj3Var2 = qi3Var.b;
                        uj3Var2.m5(uj3Var2.getMessagesController().M0(Long.valueOf(j2)), runnable, new wd3(qi3Var, eVarArr2, (byte) 5));
                        return;
                }
            }
        };
        id idVar = this.a;
        Utilities.u(0, pccVar, pccVar2, new p4c(this, idVar, j, (byte) 2), new pcc(this) {
            public final qi3 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z;
                byte b = r4;
                qi3 qi3Var = this.b;
                switch (b) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        uj3 uj3Var = qi3Var.b;
                        if (uj3Var.H.bot_admin_rights != null) {
                            TLRPC.User X1 = uj3Var.getMessagesController().X1(Long.valueOf(uj3Var.I));
                            uc7 messagesController = uj3Var.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = uj3Var.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            boolean z2 = z;
                            messagesController.d5(j, X1, tL_chatAdminRights, null, false, uj3Var, z2, true, null, runnable, new td(runnable, (byte) 14));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        uj3 uj3Var2 = qi3Var.b;
                        if (uj3Var2.H.user_admin_rights != null) {
                            uc7 messagesController2 = uj3Var2.getMessagesController();
                            long j2 = j;
                            uj3Var2.getMessagesController().d5(j2, yac.h(uj3Var2.getAccountInstance().a).f(), pd2.o0(messagesController2.M0(Long.valueOf(j2)).admin_rights, uj3Var2.H.user_admin_rights), null, false, uj3Var2, false, true, null, runnable2, new td(runnable2, (byte) 13));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new pcc(this) {
            public final qi3 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z;
                byte b = r4;
                qi3 qi3Var = this.b;
                switch (b) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        uj3 uj3Var = qi3Var.b;
                        if (uj3Var.H.bot_admin_rights != null) {
                            TLRPC.User X1 = uj3Var.getMessagesController().X1(Long.valueOf(uj3Var.I));
                            uc7 messagesController = uj3Var.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = uj3Var.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            boolean z2 = z;
                            messagesController.d5(j, X1, tL_chatAdminRights, null, false, uj3Var, z2, true, null, runnable, new td(runnable, (byte) 14));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        uj3 uj3Var2 = qi3Var.b;
                        if (uj3Var2.H.user_admin_rights != null) {
                            uc7 messagesController2 = uj3Var2.getMessagesController();
                            long j2 = j;
                            uj3Var2.getMessagesController().d5(j2, yac.h(uj3Var2.getAccountInstance().a).f(), pd2.o0(messagesController2.M0(Long.valueOf(j2)).admin_rights, uj3Var2.H.user_admin_rights), null, false, uj3Var2, false, true, null, runnable2, new td(runnable2, (byte) 13));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new r4c(this, idVar, j, eVarArr, (byte) 3));
    }
}
