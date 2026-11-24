package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kj6 implements RequestDelegate {
    public final byte a;
    public final ak6 b;
    public final TLRPC.TL_chatInviteExported c;

    public kj6(ak6 ak6Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, byte b) {
        this.a = b;
        this.b = ak6Var;
        this.c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final ak6 ak6Var = this.b;
                ak6Var.getClass();
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.c;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r5;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ak6 ak6Var2 = ak6Var;
                        switch (b) {
                            case 0:
                                ak6Var2.getClass();
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    ak6Var2.e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = ak6Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (ak6Var2.getParentActivity() != null) {
                                        tL_chatInviteExported2.revoked = true;
                                        sj6 l0 = ak6Var2.l0();
                                        ak6Var2.k0.add(0, tL_chatInviteExported2);
                                        ak6Var2.n0(l0);
                                        ts2.u(null, 2131748874, c41.b0(ak6Var2), 2131624080, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = ak6Var2.j0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ak6Var2.p0) {
                                            ak6Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported2.revoked = true;
                                        sj6 l02 = ak6Var2.l0();
                                        if (ak6Var2.p0 && ak6Var2.f == z8c.h(ak6Var2.getAccountInstance().a).e()) {
                                            arrayList.remove(tL_chatInviteExported2);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ak6Var2.e != null) {
                                            ak6Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ak6Var2.k0.add(0, tL_chatInviteExported2);
                                        ak6Var2.n0(l02);
                                    } else {
                                        ak6Var2.t0.b(tL_chatInviteExported2, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ak6Var2.d;
                                        if (chatFull2 != null) {
                                            int i = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i;
                                            if (i < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ak6Var2.getMessagesStorage().t1(ak6Var2.d.invitesCount, ak6Var2.n);
                                        }
                                    }
                                    if (ak6Var2.getParentActivity() != null) {
                                        ts2.u(null, 2131748874, c41.b0(ak6Var2), 2131624080, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                ak6 ak6Var2 = this.b;
                ak6Var2.getClass();
                gm.c3(new dt5(ak6Var2, tL_error, this.c, (byte) 29));
                return;
            default:
                final ak6 ak6Var3 = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.c;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r5;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ak6 ak6Var22 = ak6Var3;
                        switch (b) {
                            case 0:
                                ak6Var22.getClass();
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    ak6Var22.e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = ak6Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (ak6Var22.getParentActivity() != null) {
                                        tL_chatInviteExported22.revoked = true;
                                        sj6 l0 = ak6Var22.l0();
                                        ak6Var22.k0.add(0, tL_chatInviteExported22);
                                        ak6Var22.n0(l0);
                                        ts2.u(null, 2131748874, c41.b0(ak6Var22), 2131624080, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = ak6Var22.j0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ak6Var22.p0) {
                                            ak6Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported22.revoked = true;
                                        sj6 l02 = ak6Var22.l0();
                                        if (ak6Var22.p0 && ak6Var22.f == z8c.h(ak6Var22.getAccountInstance().a).e()) {
                                            arrayList.remove(tL_chatInviteExported22);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ak6Var22.e != null) {
                                            ak6Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ak6Var22.k0.add(0, tL_chatInviteExported22);
                                        ak6Var22.n0(l02);
                                    } else {
                                        ak6Var22.t0.b(tL_chatInviteExported22, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ak6Var22.d;
                                        if (chatFull2 != null) {
                                            int i = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i;
                                            if (i < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ak6Var22.getMessagesStorage().t1(ak6Var22.d.invitesCount, ak6Var22.n);
                                        }
                                    }
                                    if (ak6Var22.getParentActivity() != null) {
                                        ts2.u(null, 2131748874, c41.b0(ak6Var22), 2131624080, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
