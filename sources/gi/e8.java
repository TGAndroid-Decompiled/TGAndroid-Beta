package gi;

import android.util.Pair;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xu0;
public final class e8 implements u10 {
    public final int f12666a;
    public final long f12667b;
    public final Object f12668c;

    public e8(Object obj, long j10, int i3) {
        this.f12666a = i3;
        this.f12668c = obj;
        this.f12667b = j10;
    }

    @Override
    public final void a(Object obj) {
        long j10;
        switch (this.f12666a) {
            case 0:
                o8 o8Var = (o8) this.f12668c;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                org.telegram.ui.ActionBar.s1 s1Var = o8Var.H;
                if (s1Var != null) {
                    s1Var.c(350L);
                    o8Var.H = null;
                }
                if (tL_channels_channelParticipants != null && !tL_channels_channelParticipants.participants.isEmpty()) {
                    TLRPC.TL_chatParticipants tL_chatParticipants = new TLRPC.TL_chatParticipants();
                    for (int i3 = 0; i3 < tL_channels_channelParticipants.participants.size(); i3++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i3);
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        TLRPC.Peer peer = channelParticipant.peer;
                        if (peer != null) {
                            j10 = org.telegram.messenger.m5.o(peer);
                            if (j10 < 0) {
                            }
                        } else {
                            j10 = channelParticipant.user_id;
                        }
                        tL_chatParticipant.user_id = j10;
                        tL_chatParticipants.participants.add(tL_chatParticipant);
                    }
                    o8Var.e(this.f12667b, tL_chatParticipants);
                    return;
                }
                return;
            case 1:
                ResultCallback resultCallback = (ResultCallback) this.f12668c;
                hg.a aVar = (hg.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.f12667b), aVar));
                    return;
                }
                return;
            default:
                xu0 xu0Var = (xu0) this.f12668c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    hs.f(h10.f22829t0).d(new ai.r1(xu0Var, tL_messages_emojiGroups, this.f12667b, 26));
                    return;
                }
                return;
        }
    }
}
