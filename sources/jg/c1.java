package jg;

import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class c1 implements Runnable {
    public final TLRPC.Chat f17031a;
    public final String f17032b;
    public final long f17033c;
    public final ArrayList d;
    public final a0.h f17034e;
    public final np f17035f;
    public final h1 h;

    public c1(h1 h1Var, TLRPC.Chat chat, String str, long j3, ArrayList arrayList, a0.h hVar, np npVar) {
        this.h = h1Var;
        this.f17031a = chat;
        this.f17032b = str;
        this.f17033c = j3;
        this.d = arrayList;
        this.f17034e = hVar;
        this.f17035f = npVar;
    }

    @Override
    public final void run() {
        h1 h1Var = this.h;
        if (h1Var.F != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = np.i1(this.f17031a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i7 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i7 | 1;
        tL_channelParticipantsMentions.f28050q = this.f17032b;
        long j3 = this.f17033c;
        if (j3 != 0) {
            tL_channelParticipantsMentions.flags = i7 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j3;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i10 = h1Var.f17129j0 + 1;
        h1Var.f17129j0 = i10;
        h1Var.f17130k0 = ConnectionsManager.getInstance(h1Var.f17124f).sendRequest(tL_channels_getParticipants, new bg.k0(this, i10, this.d, this.f17034e, this.f17035f, 4));
    }
}
