package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
public final class iv4 implements icc {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;

    public iv4(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        TLRPC.Updates updates = null;
        long j = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                ((ng) obj3).a(((ov4) obj4).b(j), (TLRPC.TL_error) obj2);
                return;
            case 1:
                jw5 jw5Var = (jw5) obj4;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    updates = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    uc7.s1(jw5Var.a).Y3(updates, false);
                } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    hl.c3(new ew5(jw5Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, this.b, (byte) 1));
                }
                hl.c3(new g65(jw5Var, tL_error, updates, tL_messages_importChatInvite, (byte) 8));
                return;
            case 2:
                uc7 uc7Var = (uc7) obj4;
                cp2 cp2Var = (cp2) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (bool != null) {
                    uc7Var.e3(0, j, true);
                }
                cp2Var.a(bool, tL_error2);
                return;
            case 3:
                uc7 uc7Var2 = (uc7) obj4;
                cp2 cp2Var2 = (cp2) obj3;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (bool2 != null) {
                    uc7Var2.e3(0, j, true);
                }
                cp2Var2.a(bool2, tL_error3);
                return;
            case 4:
                ih6 ih6Var = (ih6) obj3;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                ((id) obj4).dismiss();
                if (tL_error4 != null) {
                    ih6Var.a(Long.valueOf(j), null, tL_error4.text);
                    return;
                } else {
                    ih6Var.a(Long.valueOf(j), auth_authorization, null);
                    return;
                }
            case 5:
                md9 md9Var = (md9) obj4;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                zta ztaVar = (zta) obj;
                l01 l01Var = (l01) obj2;
                l01Var.d();
                jxa.u(md9Var.a, ztaVar.a).f(ztaVar.b, tL_starGiftUnique, this.b, null, true, new p(md9Var, l01Var, tL_starGiftUnique, (byte) 25));
                return;
            default:
                ((zya) obj4).Z0((b8c) obj3, this.b, (Boolean) obj, (String) obj2);
                return;
        }
    }

    public iv4(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
