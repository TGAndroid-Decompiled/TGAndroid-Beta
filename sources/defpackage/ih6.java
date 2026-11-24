package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ih6 implements RequestDelegate {
    public final byte a;
    public final yh6 b;
    public final TLRPC.TL_chatInviteExported c;

    public ih6(yh6 yh6Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, byte b) {
        this.a = b;
        this.b = yh6Var;
        this.c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final yh6 yh6Var = this.b;
                yh6Var.getClass();
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.c;
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r5;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        yh6 yh6Var2 = yh6Var;
                        switch (b) {
                            case 0:
                                yh6Var2.getClass();
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    yh6Var2.e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = yh6Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (yh6Var2.getParentActivity() != null) {
                                        tL_chatInviteExported2.revoked = true;
                                        qh6 k0 = yh6Var2.k0();
                                        yh6Var2.k0.add(0, tL_chatInviteExported2);
                                        yh6Var2.m0(k0);
                                        ir2.v(null, 2131748925, u21.b0(yh6Var2), 2131624080, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = yh6Var2.j0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!yh6Var2.p0) {
                                            yh6Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported2.revoked = true;
                                        qh6 k02 = yh6Var2.k0();
                                        if (yh6Var2.p0 && yh6Var2.f == y6c.h(yh6Var2.getAccountInstance().a).e()) {
                                            arrayList.remove(tL_chatInviteExported2);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (yh6Var2.e != null) {
                                            yh6Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        yh6Var2.k0.add(0, tL_chatInviteExported2);
                                        yh6Var2.m0(k02);
                                    } else {
                                        yh6Var2.t0.b(tL_chatInviteExported2, tLObject2);
                                        TLRPC.ChatFull chatFull2 = yh6Var2.d;
                                        if (chatFull2 != null) {
                                            int i = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i;
                                            if (i < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            yh6Var2.getMessagesStorage().t1(yh6Var2.d.invitesCount, yh6Var2.n);
                                        }
                                    }
                                    if (yh6Var2.getParentActivity() != null) {
                                        ir2.v(null, 2131748925, u21.b0(yh6Var2), 2131624080, 36);
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
                yh6 yh6Var2 = this.b;
                yh6Var2.getClass();
                gl.d3(new sx5(yh6Var2, tL_error, this.c, (byte) 27));
                return;
            default:
                final yh6 yh6Var3 = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.c;
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r5;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        yh6 yh6Var22 = yh6Var3;
                        switch (b) {
                            case 0:
                                yh6Var22.getClass();
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    yh6Var22.e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = yh6Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (yh6Var22.getParentActivity() != null) {
                                        tL_chatInviteExported22.revoked = true;
                                        qh6 k0 = yh6Var22.k0();
                                        yh6Var22.k0.add(0, tL_chatInviteExported22);
                                        yh6Var22.m0(k0);
                                        ir2.v(null, 2131748925, u21.b0(yh6Var22), 2131624080, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = yh6Var22.j0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!yh6Var22.p0) {
                                            yh6Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported22.revoked = true;
                                        qh6 k02 = yh6Var22.k0();
                                        if (yh6Var22.p0 && yh6Var22.f == y6c.h(yh6Var22.getAccountInstance().a).e()) {
                                            arrayList.remove(tL_chatInviteExported22);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (yh6Var22.e != null) {
                                            yh6Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        yh6Var22.k0.add(0, tL_chatInviteExported22);
                                        yh6Var22.m0(k02);
                                    } else {
                                        yh6Var22.t0.b(tL_chatInviteExported22, tLObject2);
                                        TLRPC.ChatFull chatFull2 = yh6Var22.d;
                                        if (chatFull2 != null) {
                                            int i = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i;
                                            if (i < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            yh6Var22.getMessagesStorage().t1(yh6Var22.d.invitesCount, yh6Var22.n);
                                        }
                                    }
                                    if (yh6Var22.getParentActivity() != null) {
                                        ir2.v(null, 2131748925, u21.b0(yh6Var22), 2131624080, 36);
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
