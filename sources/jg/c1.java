package jg;

import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class c1 implements Runnable {
    public final TLRPC.Chat f17417a;
    public final String f17418b;
    public final long f17419c;
    public final ArrayList d;
    public final a0.h f17420e;
    public final mp f17421f;
    public final h1 h;

    public c1(h1 h1Var, TLRPC.Chat chat, String str, long j3, ArrayList arrayList, a0.h hVar, mp mpVar) {
        this.h = h1Var;
        this.f17417a = chat;
        this.f17418b = str;
        this.f17419c = j3;
        this.d = arrayList;
        this.f17420e = hVar;
        this.f17421f = mpVar;
    }

    @Override
    public final void run() {
        h1 h1Var = this.h;
        if (h1Var.F != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = mp.k1(this.f17417a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i7 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i7 | 1;
        tL_channelParticipantsMentions.f28404q = this.f17418b;
        long j3 = this.f17419c;
        if (j3 != 0) {
            tL_channelParticipantsMentions.flags = i7 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j3;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i10 = h1Var.f17515j0 + 1;
        h1Var.f17515j0 = i10;
        h1Var.f17516k0 = ConnectionsManager.getInstance(h1Var.f17510f).sendRequest(tL_channels_getParticipants, new bg.l0(this, i10, this.d, this.f17420e, this.f17421f, 4));
    }
}
