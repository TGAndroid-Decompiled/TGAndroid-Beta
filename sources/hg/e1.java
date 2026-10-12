package hg;

import bi.ia;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class e1 implements Runnable {
    public final TLRPC.Chat f10537a;
    public final String f10538b;
    public final long f10539c;
    public final ArrayList d;
    public final a0.h e;
    public final MessagesController f10540f;
    public final j1 h;

    public e1(j1 j1Var, TLRPC.Chat chat, String str, long j10, ArrayList arrayList, a0.h hVar, MessagesController messagesController) {
        this.h = j1Var;
        this.f10537a = chat;
        this.f10538b = str;
        this.f10539c = j10;
        this.d = arrayList;
        this.e = hVar;
        this.f10540f = messagesController;
    }

    @Override
    public final void run() {
        j1 j1Var = this.h;
        if (j1Var.E != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f10537a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i10 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i10 | 1;
        tL_channelParticipantsMentions.f19215q = this.f10538b;
        long j10 = this.f10539c;
        if (j10 != 0) {
            tL_channelParticipantsMentions.flags = i10 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j10;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i11 = j1Var.f10621i0 + 1;
        j1Var.f10621i0 = i11;
        j1Var.f10622j0 = ConnectionsManager.getInstance(j1Var.f10617f).sendRequest(tL_channels_getParticipants, new ia(this, i11, this.d, this.e, this.f10540f, 1));
    }
}
