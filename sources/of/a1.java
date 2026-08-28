package of;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final TLRPC.Chat f19241a;
    public final String f19242b;
    public final long f19243c;
    public final ArrayList d;
    public final a0.h f19244e;
    public final MessagesController f19245f;
    public final f1 h;

    public a1(f1 f1Var, TLRPC.Chat chat, String str, long j10, ArrayList arrayList, a0.h hVar, MessagesController messagesController) {
        this.h = f1Var;
        this.f19241a = chat;
        this.f19242b = str;
        this.f19243c = j10;
        this.d = arrayList;
        this.f19244e = hVar;
        this.f19245f = messagesController;
    }

    @Override
    public final void run() {
        f1 f1Var = this.h;
        if (f1Var.A != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f19241a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i9 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i9 | 1;
        tL_channelParticipantsMentions.f22379q = this.f19242b;
        long j10 = this.f19243c;
        if (j10 != 0) {
            tL_channelParticipantsMentions.flags = i9 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j10;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i10 = f1Var.f19326e0 + 1;
        f1Var.f19326e0 = i10;
        f1Var.f19328f0 = ConnectionsManager.getInstance(f1Var.f19327f).sendRequest(tL_channels_getParticipants, new ff.j0(this, i10, this.d, this.f19244e, this.f19245f, 4));
    }
}
