package hg;

import bi.fa;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f1 implements Runnable {
    public final TLRPC.Chat f11065a;
    public final String f11066b;
    public final long f11067c;
    public final ArrayList d;
    public final a0.i f11068e;
    public final MessagesController f11069f;
    public final k1 h;

    public f1(k1 k1Var, TLRPC.Chat chat, String str, long j3, ArrayList arrayList, a0.i iVar, MessagesController messagesController) {
        this.h = k1Var;
        this.f11065a = chat;
        this.f11066b = str;
        this.f11067c = j3;
        this.d = arrayList;
        this.f11068e = iVar;
        this.f11069f = messagesController;
    }

    @Override
    public final void run() {
        k1 k1Var = this.h;
        if (k1Var.E != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f11065a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i10 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i10 | 1;
        tL_channelParticipantsMentions.f19895q = this.f11066b;
        long j3 = this.f11067c;
        if (j3 != 0) {
            tL_channelParticipantsMentions.flags = i10 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j3;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i11 = k1Var.f11165i0 + 1;
        k1Var.f11165i0 = i11;
        k1Var.f11166j0 = ConnectionsManager.getInstance(k1Var.f11161f).sendRequest(tL_channels_getParticipants, new fa(this, i11, this.d, this.f11068e, this.f11069f, 1));
    }
}
