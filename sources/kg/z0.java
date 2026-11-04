package kg;

import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Runnable {
    public final TLRPC.Chat f17246a;
    public final String f17247b;
    public final long f17248c;
    public final ArrayList d;
    public final a0.h f17249e;
    public final hp f17250f;
    public final e1 h;

    public z0(e1 e1Var, TLRPC.Chat chat, String str, long j10, ArrayList arrayList, a0.h hVar, hp hpVar) {
        this.h = e1Var;
        this.f17246a = chat;
        this.f17247b = str;
        this.f17248c = j10;
        this.d = arrayList;
        this.f17249e = hVar;
        this.f17250f = hpVar;
    }

    @Override
    public final void run() {
        e1 e1Var = this.h;
        if (e1Var.F != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = hp.i1(this.f17246a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i3 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i3 | 1;
        tL_channelParticipantsMentions.f27000q = this.f17247b;
        long j10 = this.f17248c;
        if (j10 != 0) {
            tL_channelParticipantsMentions.flags = i3 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j10;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i10 = e1Var.f17002j0 + 1;
        e1Var.f17002j0 = i10;
        e1Var.f17003k0 = ConnectionsManager.getInstance(e1Var.f16997f).sendRequest(tL_channels_getParticipants, new cg.j0(this, i10, this.d, this.f17249e, this.f17250f, 4));
    }
}
