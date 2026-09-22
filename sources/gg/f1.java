package gg;

import ai.ya;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f1 implements Runnable {
    public final TLRPC.Chat f9734a;
    public final String f9735b;
    public final long f9736c;
    public final ArrayList d;
    public final a0.i e;
    public final MessagesController f9737f;
    public final k1 h;

    public f1(k1 k1Var, TLRPC.Chat chat, String str, long j3, ArrayList arrayList, a0.i iVar, MessagesController messagesController) {
        this.h = k1Var;
        this.f9734a = chat;
        this.f9735b = str;
        this.f9736c = j3;
        this.d = arrayList;
        this.e = iVar;
        this.f9737f = messagesController;
    }

    @Override
    public final void run() {
        k1 k1Var = this.h;
        if (k1Var.E != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f9734a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i10 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i10 | 1;
        tL_channelParticipantsMentions.f18342q = this.f9735b;
        long j3 = this.f9736c;
        if (j3 != 0) {
            tL_channelParticipantsMentions.flags = i10 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j3;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i11 = k1Var.f9825i0 + 1;
        k1Var.f9825i0 = i11;
        k1Var.f9826j0 = ConnectionsManager.getInstance(k1Var.f9821f).sendRequest(tL_channels_getParticipants, new ya(this, i11, this.d, this.e, this.f9737f, 1));
    }
}
