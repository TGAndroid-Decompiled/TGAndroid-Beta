package hg;

import ai.sb;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class e1 implements Runnable {
    public final TLRPC.Chat f11846a;
    public final String f11847b;
    public final long f11848c;
    public final ArrayList d;
    public final a0.h e;
    public final MessagesController f11849f;
    public final j1 h;

    public e1(j1 j1Var, TLRPC.Chat chat, String str, long j10, ArrayList arrayList, a0.h hVar, MessagesController messagesController) {
        this.h = j1Var;
        this.f11846a = chat;
        this.f11847b = str;
        this.f11848c = j10;
        this.d = arrayList;
        this.e = hVar;
        this.f11849f = messagesController;
    }

    @Override
    public final void run() {
        j1 j1Var = this.h;
        if (j1Var.E != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f11846a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i10 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i10 | 1;
        tL_channelParticipantsMentions.f20271q = this.f11847b;
        long j10 = this.f11848c;
        if (j10 != 0) {
            tL_channelParticipantsMentions.flags = i10 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j10;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i11 = j1Var.f11930i0 + 1;
        j1Var.f11930i0 = i11;
        j1Var.f11931j0 = ConnectionsManager.getInstance(j1Var.f11926f).sendRequest(tL_channels_getParticipants, new sb(this, i11, this.d, this.e, this.f11849f, 3));
    }
}
