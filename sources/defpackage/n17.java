package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class n17 implements Runnable {
    public final TLRPC.Chat a;
    public final String b;
    public final long c;
    public final ArrayList d;
    public final zh6 e;
    public final uc7 f;
    public final r17 h;

    public n17(r17 r17Var, TLRPC.Chat chat, String str, long j, ArrayList arrayList, zh6 zh6Var, uc7 uc7Var) {
        this.h = r17Var;
        this.a = chat;
        this.b = str;
        this.c = j;
        this.d = arrayList;
        this.e = zh6Var;
        this.f = uc7Var;
    }

    @Override
    public final void run() {
        r17 r17Var = this.h;
        if (r17Var.F != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = uc7.i1(this.a);
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
        int i2 = r17Var.j0 + 1;
        r17Var.j0 = i2;
        r17Var.k0 = ConnectionsManager.getInstance(r17Var.f).sendRequest(tL_channels_getParticipants, new eu0(this, i2, this.d, this.e, this.f, (byte) 8));
    }
}
