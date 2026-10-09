package gg;

import ai.za;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class e1 implements Runnable {
    public final TLRPC.Chat f10585a;
    public final String f10586b;
    public final long f10587c;
    public final ArrayList d;
    public final a0.i f10588e;
    public final MessagesController f10589f;
    public final j1 h;

    public e1(j1 j1Var, TLRPC.Chat chat, String str, long j3, ArrayList arrayList, a0.i iVar, MessagesController messagesController) {
        this.h = j1Var;
        this.f10585a = chat;
        this.f10586b = str;
        this.f10587c = j3;
        this.d = arrayList;
        this.f10588e = iVar;
        this.f10589f = messagesController;
    }

    @Override
    public final void run() {
        j1 j1Var = this.h;
        if (j1Var.E != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f10585a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i10 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i10 | 1;
        tL_channelParticipantsMentions.f20037q = this.f10586b;
        long j3 = this.f10587c;
        if (j3 != 0) {
            tL_channelParticipantsMentions.flags = i10 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j3;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i11 = j1Var.f10677i0 + 1;
        j1Var.f10677i0 = i11;
        j1Var.f10678j0 = ConnectionsManager.getInstance(j1Var.f10673f).sendRequest(tL_channels_getParticipants, new za(this, i11, this.d, this.f10588e, this.f10589f, 1));
    }
}
