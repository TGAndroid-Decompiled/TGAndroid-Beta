package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class aga extends q59 {
    public final Context c;
    public TLRPC.ChatFull d;
    public ArrayList e;
    public final nha f;

    public aga(nha nhaVar, Context context) {
        this.f = nhaVar;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override
    public final int b() {
        TLRPC.ChatFull chatFull = this.d;
        if (chatFull != null && chatFull.participants.participants.isEmpty()) {
            return 1;
        }
        TLRPC.ChatFull chatFull2 = this.d;
        if (chatFull2 != null) {
            return chatFull2.participants.participants.size();
        }
        return 0;
    }

    @Override
    public final int d(int i) {
        TLRPC.ChatFull chatFull = this.d;
        if (chatFull != null && chatFull.participants.participants.isEmpty()) {
            return 20;
        }
        return 21;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        TLRPC.ChatParticipant chatParticipant;
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        nha nhaVar = this.f;
        d dVar = nhaVar.y1;
        View view = u69Var.a;
        if (view instanceof w8c) {
            w8c w8cVar = (w8c) view;
            boolean isEmpty = this.e.isEmpty();
            TLRPC.ChatFull chatFull = this.d;
            if (!isEmpty) {
                chatParticipant = chatFull.participants.participants.get(((Integer) this.e.get(i)).intValue());
            } else {
                chatParticipant = chatFull.participants.participants.get(i);
            }
            if (chatParticipant != null) {
                boolean z9 = true;
                if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                    String str2 = channelParticipant.rank;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = jb6.M0(2131752369, "ChannelCreator");
                        }
                        z7 = true;
                        z8 = true;
                        z6 = false;
                    } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = jb6.M0(2131752467, "ChannelAdmin");
                        }
                        if (channelParticipant.promoted_by == dVar.getUserConfig().e()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = true;
                        z8 = false;
                    } else {
                        z6 = false;
                        z7 = false;
                        z8 = false;
                    }
                    boolean z10 = z8;
                    z3 = z6;
                    z = z7;
                    z2 = z10;
                    str = str2;
                } else {
                    String str3 = chatParticipant.rank;
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = jb6.M0(2131752369, "ChannelCreator");
                        }
                        str = str3;
                        z = true;
                        z2 = true;
                        z3 = false;
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = jb6.M0(2131752467, "ChannelAdmin");
                        }
                        if (chatParticipant.inviter_id == dVar.getUserConfig().e()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z3 = z4;
                        str = str3;
                        z = true;
                        z2 = false;
                    } else {
                        str = str3;
                        z = false;
                        z2 = false;
                        z3 = false;
                    }
                }
                TLRPC.User W1 = dVar.getMessagesController().W1(Long.valueOf(chatParticipant.user_id));
                if (m9c.D(W1) && sd2.h(dVar.getMessagesController().L0(Long.valueOf(-nhaVar.m1)))) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                w8cVar.a(str, z, z2, z5, new ns5(this, W1, str, z, z2, z3, (byte) 2));
                if (i == this.d.participants.participants.size() - 1) {
                    z9 = false;
                }
                w8cVar.d(W1, null, null, z9);
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        nha nhaVar = this.f;
        if (i == 20) {
            bj G = nha.G(7, nhaVar.m1, nhaVar.I1, this.c);
            G.setLayoutParams(new g69(-1, -1));
            return new u69(G);
        }
        w8c w8cVar = new w8c(9, 0, nhaVar.I1, this.c, true, false);
        w8cVar.setLayoutParams(new g69(-1, -2));
        return new u69(w8cVar);
    }
}
