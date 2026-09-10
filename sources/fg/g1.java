package fg;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g1 implements Runnable {
    public final TLRPC.Chat f8023a;
    public final String f8024b;
    public final long f8025c;
    public final ArrayList d;
    public final a0.i e;
    public final MessagesController f8026f;
    public final l1 h;

    public g1(l1 l1Var, TLRPC.Chat chat, String str, long j3, ArrayList arrayList, a0.i iVar, MessagesController messagesController) {
        this.h = l1Var;
        this.f8023a = chat;
        this.f8024b = str;
        this.f8025c = j3;
        this.d = arrayList;
        this.e = iVar;
        this.f8026f = messagesController;
    }

    @Override
    public final void run() {
        l1 l1Var = this.h;
        if (l1Var.E != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f8023a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i10 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i10 | 1;
        tL_channelParticipantsMentions.f17194q = this.f8024b;
        long j3 = this.f8025c;
        if (j3 != 0) {
            tL_channelParticipantsMentions.flags = i10 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j3;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i11 = l1Var.f8112i0 + 1;
        l1Var.f8112i0 = i11;
        l1Var.f8113j0 = ConnectionsManager.getInstance(l1Var.f8108f).sendRequest(tL_channels_getParticipants, new e1(this, i11, this.d, this.e, this.f8026f, 0));
    }
}
