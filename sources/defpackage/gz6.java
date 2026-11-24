package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class gz6 implements Runnable {
    public final TLRPC.Chat a;
    public final String b;
    public final long c;
    public final ArrayList d;
    public final vf6 e;
    public final na7 f;
    public final kz6 h;

    public gz6(kz6 kz6Var, TLRPC.Chat chat, String str, long j, ArrayList arrayList, vf6 vf6Var, na7 na7Var) {
        this.h = kz6Var;
        this.a = chat;
        this.b = str;
        this.c = j;
        this.d = arrayList;
        this.e = vf6Var;
        this.f = na7Var;
    }

    @Override
    public final void run() {
        kz6 kz6Var = this.h;
        if (kz6Var.F != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = na7.g1(this.a);
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
        int i2 = kz6Var.j0 + 1;
        kz6Var.j0 = i2;
        kz6Var.k0 = ConnectionsManager.getInstance(kz6Var.f).sendRequest(tL_channels_getParticipants, new vt0(this, i2, this.d, this.e, this.f, (byte) 8));
    }
}
