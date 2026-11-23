package hi;

import android.os.SystemClock;
import android.util.Pair;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kv0;
public final class x8 implements w10 {
    public final int f15786a;
    public final long f15787b;
    public final Object f15788c;

    public x8(Object obj, long j3, int i7) {
        this.f15786a = i7;
        this.f15788c = obj;
        this.f15787b = j3;
    }

    @Override
    public final void a(Object obj) {
        long j3;
        switch (this.f15786a) {
            case 0:
                f9 f9Var = (f9) this.f15788c;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                org.telegram.ui.ActionBar.t1 t1Var = f9Var.H;
                if (t1Var != null) {
                    t1Var.c(350L);
                    f9Var.H = null;
                }
                if (tL_channels_channelParticipants != null && !tL_channels_channelParticipants.participants.isEmpty()) {
                    TLRPC.TL_chatParticipants tL_chatParticipants = new TLRPC.TL_chatParticipants();
                    for (int i7 = 0; i7 < tL_channels_channelParticipants.participants.size(); i7++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i7);
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        TLRPC.Peer peer = channelParticipant.peer;
                        if (peer != null) {
                            j3 = org.telegram.messenger.n5.o(peer);
                            if (j3 < 0) {
                            }
                        } else {
                            j3 = channelParticipant.user_id;
                        }
                        tL_chatParticipant.user_id = j3;
                        tL_chatParticipants.participants.add(tL_chatParticipant);
                    }
                    f9Var.e(this.f15787b, tL_chatParticipants);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ji.f(2, (ji.n) this.f15788c, (String) obj), Math.max(0L, (this.f15787b + 1200) - SystemClock.uptimeMillis()));
                return;
            case 2:
                ResultCallback resultCallback = (ResultCallback) this.f15788c;
                gg.a aVar = (gg.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.f15787b), aVar));
                    return;
                }
                return;
            default:
                kv0 kv0Var = (kv0) this.f15788c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    ks.f(i10.f24637t0).d(new bi.s2(kv0Var, tL_messages_emojiGroups, this.f15787b, 26));
                    return;
                }
                return;
        }
    }
}
