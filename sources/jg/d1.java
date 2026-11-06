package jg;

import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class d1 implements Runnable {
    public final TLRPC.Chat f16691a;
    public final String f16692b;
    public final long f16693c;
    public final ArrayList d;
    public final a0.h f16694e;
    public final qp f16695f;
    public final i1 h;

    public d1(i1 i1Var, TLRPC.Chat chat, String str, long j3, ArrayList arrayList, a0.h hVar, qp qpVar) {
        this.h = i1Var;
        this.f16691a = chat;
        this.f16692b = str;
        this.f16693c = j3;
        this.d = arrayList;
        this.f16694e = hVar;
        this.f16695f = qpVar;
    }

    @Override
    public final void run() {
        i1 i1Var = this.h;
        if (i1Var.E != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = qp.i1(this.f16691a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i7 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i7 | 1;
        tL_channelParticipantsMentions.f26951q = this.f16692b;
        long j3 = this.f16693c;
        if (j3 != 0) {
            tL_channelParticipantsMentions.flags = i7 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j3;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i10 = i1Var.f16782i0 + 1;
        i1Var.f16782i0 = i10;
        i1Var.f16783j0 = ConnectionsManager.getInstance(i1Var.f16778f).sendRequest(tL_channels_getParticipants, new bg.k0(this, i10, this.d, this.f16694e, this.f16695f, 4));
    }
}
