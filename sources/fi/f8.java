package fi;

import android.util.Pair;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.av0;
public final class f8 implements c20 {
    public final int f11987a;
    public final long f11988b;
    public final Object f11989c;

    public f8(Object obj, long j3, int i7) {
        this.f11987a = i7;
        this.f11989c = obj;
        this.f11988b = j3;
    }

    @Override
    public final void a(Object obj) {
        long j3;
        switch (this.f11987a) {
            case 0:
                n8 n8Var = (n8) this.f11989c;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                org.telegram.ui.ActionBar.u1 u1Var = n8Var.G;
                if (u1Var != null) {
                    u1Var.c(350L);
                    n8Var.G = null;
                }
                if (tL_channels_channelParticipants != null && !tL_channels_channelParticipants.participants.isEmpty()) {
                    TLRPC.TL_chatParticipants tL_chatParticipants = new TLRPC.TL_chatParticipants();
                    for (int i7 = 0; i7 < tL_channels_channelParticipants.participants.size(); i7++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i7);
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        TLRPC.Peer peer = channelParticipant.peer;
                        if (peer != null) {
                            j3 = org.telegram.messenger.m5.o(peer);
                            if (j3 < 0) {
                            }
                        } else {
                            j3 = channelParticipant.user_id;
                        }
                        tL_chatParticipant.user_id = j3;
                        tL_chatParticipants.participants.add(tL_chatParticipant);
                    }
                    n8Var.e(this.f11988b, tL_chatParticipants);
                    return;
                }
                return;
            case 1:
                ResultCallback resultCallback = (ResultCallback) this.f11989c;
                gg.a aVar = (gg.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.f11988b), aVar));
                    return;
                }
                return;
            default:
                av0 av0Var = (av0) this.f11989c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    qs.f(p10.f24470s0).d(new bi.d3(av0Var, tL_messages_emojiGroups, this.f11988b, 25));
                    return;
                }
                return;
        }
    }
}
