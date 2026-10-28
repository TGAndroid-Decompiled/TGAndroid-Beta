package ig;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class e1 implements Runnable {
    public final TLRPC.Chat f14044a;
    public final String f14045b;
    public final long f14046c;
    public final ArrayList d;
    public final a0.h e;
    public final MessagesController f14047f;
    public final j1 h;

    public e1(j1 j1Var, TLRPC.Chat chat, String str, long j10, ArrayList arrayList, a0.h hVar, MessagesController messagesController) {
        this.h = j1Var;
        this.f14044a = chat;
        this.f14045b = str;
        this.f14046c = j10;
        this.d = arrayList;
        this.e = hVar;
        this.f14047f = messagesController;
    }

    @Override
    public final void run() {
        j1 j1Var = this.h;
        if (j1Var.E != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f14044a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i10 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i10 | 1;
        tL_channelParticipantsMentions.f22027q = this.f14045b;
        long j10 = this.f14046c;
        if (j10 != 0) {
            tL_channelParticipantsMentions.flags = i10 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j10;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i11 = j1Var.f14119i0 + 1;
        j1Var.f14119i0 = i11;
        j1Var.f14120j0 = ConnectionsManager.getInstance(j1Var.f14115f).sendRequest(tL_channels_getParticipants, new ag.p0(this, i11, this.d, this.e, this.f14047f, 4));
    }
}
