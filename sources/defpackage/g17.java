package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g17 implements Runnable {
    public final TLRPC.Chat a;
    public final String b;
    public final long c;
    public final ArrayList d;
    public final vh6 e;
    public final oc7 f;
    public final k17 h;

    public g17(k17 k17Var, TLRPC.Chat chat, String str, long j, ArrayList arrayList, vh6 vh6Var, oc7 oc7Var) {
        this.h = k17Var;
        this.a = chat;
        this.b = str;
        this.c = j;
        this.d = arrayList;
        this.e = vh6Var;
        this.f = oc7Var;
    }

    @Override
    public final void run() {
        k17 k17Var = this.h;
        if (k17Var.F != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = oc7.h1(this.a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i | 1;
        tL_channelParticipantsMentions.q = this.b;
        long j = this.c;
        if (j != 0) {
            tL_channelParticipantsMentions.flags = i | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i2 = k17Var.j0 + 1;
        k17Var.j0 = i2;
        k17Var.k0 = ConnectionsManager.getInstance(k17Var.f).sendRequest(tL_channels_getParticipants, new ev0(this, i2, this.d, this.e, this.f, (byte) 8));
    }
}
