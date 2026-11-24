package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Wallet.c;
public final class ae2 implements i8c {
    public final byte a;
    public final Object b;
    public final Object c;

    public ae2(c cVar, String str, p8c p8cVar) {
        this.a = (byte) 16;
        this.b = str;
        this.c = p8cVar;
    }

    private final void b(Object obj, Object obj2) {
        boolean z;
        l18 l18Var = (l18) this.b;
        TL_phone.getGroupCallStars getgroupcallstars = (TL_phone.getGroupCallStars) this.c;
        TL_phone.groupCallStars groupcallstars = (TL_phone.groupCallStars) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        w66 w66Var = l18Var.W;
        int i = l18Var.O;
        boolean z2 = false;
        l18Var.V = false;
        TLRPC.InputGroupCall inputGroupCall = l18Var.P;
        if (inputGroupCall != null && inputGroupCall.id == getgroupcallstars.call.id) {
            if (groupcallstars != null) {
                na7.q1(i).b4(groupcallstars.users, false);
                na7.q1(i).V3(groupcallstars.chats, false);
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
                if (j != l18Var.R || l18Var.T != z) {
                    z2 = true;
                }
                l18Var.R = j;
                l18Var.U = groupcallstars.top_donors;
                l18Var.T = z;
                if (z2) {
                    l18Var.i();
                }
                l18Var.s();
            }
            if (l18Var.isAttachedToWindow()) {
                gl.r(w66Var);
                gl.d3(w66Var, 5000L);
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        na7 na7Var = (na7) this.b;
        i8c i8cVar = (i8c) this.c;
        TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        if (messages_chats != null) {
            ArrayList arrayList = new ArrayList(messages_chats.chats.size());
            na7Var.V3(messages_chats.chats, true);
            ArrayList<TLRPC.Chat> arrayList2 = messages_chats.chats;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                TLRPC.Chat chat = arrayList2.get(i);
                i++;
                TLRPC.Chat chat2 = chat;
                if (chat2.creator && !hc2.p0(chat2) && !hc2.Y(chat2)) {
                    arrayList.add(chat2);
                }
            }
            i8cVar.a(arrayList, null);
            return;
        }
        i8cVar.a(null, tL_error);
    }

    @Override
    public final void a(java.lang.Object r26, java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ae2.a(java.lang.Object, java.lang.Object):void");
    }

    public ae2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
