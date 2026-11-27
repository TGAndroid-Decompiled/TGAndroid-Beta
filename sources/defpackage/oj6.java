package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oj6 implements RequestDelegate {
    public final byte a;
    public final ck6 b;
    public final TLRPC.TL_chatInviteExported c;

    public oj6(ck6 ck6Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, byte b) {
        this.a = b;
        this.b = ck6Var;
        this.c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final ck6 ck6Var = this.b;
                ck6Var.getClass();
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.c;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r5;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ck6 ck6Var2 = ck6Var;
                        switch (b) {
                            case 0:
                                ck6Var2.getClass();
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    ck6Var2.e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = ck6Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (ck6Var2.getParentActivity() != null) {
                                        tL_chatInviteExported2.revoked = true;
                                        uj6 k0 = ck6Var2.k0();
                                        ck6Var2.k0.add(0, tL_chatInviteExported2);
                                        ck6Var2.m0(k0);
                                        bs2.v(null, 2131748871, d31.b0(ck6Var2), 2131624080, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = ck6Var2.j0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ck6Var2.p0) {
                                            ck6Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported2.revoked = true;
                                        uj6 k02 = ck6Var2.k0();
                                        if (ck6Var2.p0 && ck6Var2.f == yac.h(ck6Var2.getAccountInstance().a).e()) {
                                            arrayList.remove(tL_chatInviteExported2);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ck6Var2.e != null) {
                                            ck6Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ck6Var2.k0.add(0, tL_chatInviteExported2);
                                        ck6Var2.m0(k02);
                                    } else {
                                        ck6Var2.t0.b(tL_chatInviteExported2, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ck6Var2.d;
                                        if (chatFull2 != null) {
                                            int i = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i;
                                            if (i < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ck6Var2.getMessagesStorage().t1(ck6Var2.d.invitesCount, ck6Var2.n);
                                        }
                                    }
                                    if (ck6Var2.getParentActivity() != null) {
                                        bs2.v(null, 2131748871, d31.b0(ck6Var2), 2131624080, 36);
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
                final ck6 ck6Var2 = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.c;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r5;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ck6 ck6Var22 = ck6Var2;
                        switch (b) {
                            case 0:
                                ck6Var22.getClass();
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    ck6Var22.e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = ck6Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (ck6Var22.getParentActivity() != null) {
                                        tL_chatInviteExported22.revoked = true;
                                        uj6 k0 = ck6Var22.k0();
                                        ck6Var22.k0.add(0, tL_chatInviteExported22);
                                        ck6Var22.m0(k0);
                                        bs2.v(null, 2131748871, d31.b0(ck6Var22), 2131624080, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = ck6Var22.j0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ck6Var22.p0) {
                                            ck6Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported22.revoked = true;
                                        uj6 k02 = ck6Var22.k0();
                                        if (ck6Var22.p0 && ck6Var22.f == yac.h(ck6Var22.getAccountInstance().a).e()) {
                                            arrayList.remove(tL_chatInviteExported22);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ck6Var22.e != null) {
                                            ck6Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ck6Var22.k0.add(0, tL_chatInviteExported22);
                                        ck6Var22.m0(k02);
                                    } else {
                                        ck6Var22.t0.b(tL_chatInviteExported22, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ck6Var22.d;
                                        if (chatFull2 != null) {
                                            int i = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i;
                                            if (i < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ck6Var22.getMessagesStorage().t1(ck6Var22.d.invitesCount, ck6Var22.n);
                                        }
                                    }
                                    if (ck6Var22.getParentActivity() != null) {
                                        bs2.v(null, 2131748871, d31.b0(ck6Var22), 2131624080, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ck6 ck6Var3 = this.b;
                ck6Var3.getClass();
                hl.c3(new yg6(ck6Var3, tL_error, this.c, (byte) 2));
                return;
        }
    }
}
