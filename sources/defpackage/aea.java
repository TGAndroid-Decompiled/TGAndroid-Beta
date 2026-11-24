package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class aea extends n39 {
    public final Context c;
    public TLRPC.ChatFull d;
    public ArrayList e;
    public final nfa f;

    public aea(nfa nfaVar, Context context) {
        this.f = nfaVar;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
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
    public final void t(s49 s49Var, int i) {
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
        nfa nfaVar = this.f;
        d dVar = nfaVar.y1;
        View view = s49Var.a;
        if (view instanceof v6c) {
            v6c v6cVar = (v6c) view;
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
                            str2 = k96.M0(2131752411, "ChannelCreator");
                        }
                        z7 = true;
                        z8 = true;
                        z6 = false;
                    } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = k96.M0(2131752508, "ChannelAdmin");
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
                            str3 = k96.M0(2131752411, "ChannelCreator");
                        }
                        str = str3;
                        z = true;
                        z2 = true;
                        z3 = false;
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = k96.M0(2131752508, "ChannelAdmin");
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
                TLRPC.User V1 = dVar.getMessagesController().V1(Long.valueOf(chatParticipant.user_id));
                if (l7c.C(V1) && hc2.h(dVar.getMessagesController().K0(Long.valueOf(-nfaVar.m1)))) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                v6cVar.a(str, z, z2, z5, new pq5(this, V1, str, z, z2, z3, (byte) 2));
                if (i == this.d.participants.participants.size() - 1) {
                    z9 = false;
                }
                v6cVar.d(V1, null, null, z9);
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        nfa nfaVar = this.f;
        if (i == 20) {
            bi G = nfa.G(7, nfaVar.m1, nfaVar.I1, this.c);
            G.setLayoutParams(new e49(-1, -1));
            return new s49(G);
        }
        v6c v6cVar = new v6c(9, 0, nfaVar.I1, this.c, true, false);
        v6cVar.setLayoutParams(new e49(-1, -2));
        return new s49(v6cVar);
    }
}
