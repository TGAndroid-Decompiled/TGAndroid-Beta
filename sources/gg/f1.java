package gg;

import ai.ya;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f1 implements Runnable {
    public final TLRPC.Chat f10579a;
    public final String f10580b;
    public final long f10581c;
    public final ArrayList d;
    public final a0.i f10582e;
    public final MessagesController f10583f;
    public final k1 h;

    public f1(k1 k1Var, TLRPC.Chat chat, String str, long j3, ArrayList arrayList, a0.i iVar, MessagesController messagesController) {
        this.h = k1Var;
        this.f10579a = chat;
        this.f10580b = str;
        this.f10581c = j3;
        this.d = arrayList;
        this.f10582e = iVar;
        this.f10583f = messagesController;
    }

    @Override
    public final void run() {
        k1 k1Var = this.h;
        if (k1Var.E != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f10579a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i10 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i10 | 1;
        tL_channelParticipantsMentions.f20041q = this.f10580b;
        long j3 = this.f10581c;
        if (j3 != 0) {
            tL_channelParticipantsMentions.flags = i10 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j3;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i11 = k1Var.f10679i0 + 1;
        k1Var.f10679i0 = i11;
        k1Var.f10680j0 = ConnectionsManager.getInstance(k1Var.f10675f).sendRequest(tL_channels_getParticipants, new ya(this, i11, this.d, this.f10582e, this.f10583f, 1));
    }
}
