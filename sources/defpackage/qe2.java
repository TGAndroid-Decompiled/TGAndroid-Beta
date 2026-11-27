package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Wallet.c;
public final class qe2 implements icc {
    public final byte a;
    public final Object b;
    public final Object c;

    public qe2(c cVar, String str, pcc pccVar) {
        this.a = (byte) 16;
        this.b = str;
        this.c = pccVar;
    }

    private final void b(Object obj, Object obj2) {
        boolean z;
        c58 c58Var = (c58) this.b;
        TL_phone.getGroupCallStars getgroupcallstars = (TL_phone.getGroupCallStars) this.c;
        TL_phone.groupCallStars groupcallstars = (TL_phone.groupCallStars) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        a96 a96Var = c58Var.W;
        int i = c58Var.O;
        boolean z2 = false;
        c58Var.V = false;
        TLRPC.InputGroupCall inputGroupCall = c58Var.P;
        if (inputGroupCall != null && inputGroupCall.id == getgroupcallstars.call.id) {
            if (groupcallstars != null) {
                uc7.s1(i).j4(groupcallstars.users, false);
                uc7.s1(i).c4(groupcallstars.chats, false);
                int i2 = 0;
                while (true) {
                    if (i2 >= groupcallstars.top_donors.size()) {
                        break;
                    } else if (groupcallstars.top_donors.get(i2).my) {
                        if (groupcallstars.top_donors.get(i2).stars > 0) {
                            z = true;
                        }
                    } else {
                        i2++;
                    }
                }
                z = false;
                long j = groupcallstars.total_stars;
                if (j != c58Var.R || c58Var.T != z) {
                    z2 = true;
                }
                c58Var.R = j;
                c58Var.U = groupcallstars.top_donors;
                c58Var.T = z;
                if (z2) {
                    c58Var.i();
                }
                c58Var.s();
            }
            if (c58Var.isAttachedToWindow()) {
                hl.r(a96Var);
                hl.d3(a96Var, 5000L);
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        uc7 uc7Var = (uc7) this.b;
        icc iccVar = (icc) this.c;
        TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        if (messages_chats != null) {
            ArrayList arrayList = new ArrayList(messages_chats.chats.size());
            uc7Var.c4(messages_chats.chats, true);
            ArrayList<TLRPC.Chat> arrayList2 = messages_chats.chats;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                TLRPC.Chat chat = arrayList2.get(i);
                i++;
                TLRPC.Chat chat2 = chat;
                if (chat2.creator && !xc2.p0(chat2) && !xc2.Y(chat2)) {
                    arrayList.add(chat2);
                }
            }
            iccVar.a(arrayList, null);
            return;
        }
        iccVar.a(null, tL_error);
    }

    @Override
    public final void a(java.lang.Object r24, java.lang.Object r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe2.a(java.lang.Object, java.lang.Object):void");
    }

    public qe2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
