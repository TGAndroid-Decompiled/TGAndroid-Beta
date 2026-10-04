package gg;

import ai.ya;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f1 implements Runnable {
    public final TLRPC.Chat f10578a;
    public final String f10579b;
    public final long f10580c;
    public final ArrayList d;
    public final a0.i f10581e;
    public final MessagesController f10582f;
    public final k1 h;

    public f1(k1 k1Var, TLRPC.Chat chat, String str, long j3, ArrayList arrayList, a0.i iVar, MessagesController messagesController) {
        this.h = k1Var;
        this.f10578a = chat;
        this.f10579b = str;
        this.f10580c = j3;
        this.d = arrayList;
        this.f10581e = iVar;
        this.f10582f = messagesController;
    }

    @Override
    public final void run() {
        k1 k1Var = this.h;
        if (k1Var.E != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f10578a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i10 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i10 | 1;
        tL_channelParticipantsMentions.f20037q = this.f10579b;
        long j3 = this.f10580c;
        if (j3 != 0) {
            tL_channelParticipantsMentions.flags = i10 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j3;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i11 = k1Var.f10678i0 + 1;
        k1Var.f10678i0 = i11;
        k1Var.f10679j0 = ConnectionsManager.getInstance(k1Var.f10674f).sendRequest(tL_channels_getParticipants, new ya(this, i11, this.d, this.f10581e, this.f10582f, 1));
    }
}
