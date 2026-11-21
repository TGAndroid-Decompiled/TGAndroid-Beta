package hi;

import android.os.SystemClock;
import android.util.Pair;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lv0;
public final class c8 implements x10 {
    public final int f14388a;
    public final long f14389b;
    public final Object f14390c;

    public c8(Object obj, long j3, int i7) {
        this.f14388a = i7;
        this.f14390c = obj;
        this.f14389b = j3;
    }

    @Override
    public final void a(Object obj) {
        long j3;
        switch (this.f14388a) {
            case 0:
                k8 k8Var = (k8) this.f14390c;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                org.telegram.ui.ActionBar.t1 t1Var = k8Var.H;
                if (t1Var != null) {
                    t1Var.c(350L);
                    k8Var.H = null;
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
                    k8Var.e(this.f14389b, tL_chatParticipants);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ji.i(0, (ji.o) this.f14390c, (String) obj), Math.max(0L, (this.f14389b + 1200) - SystemClock.uptimeMillis()));
                return;
            case 2:
                ResultCallback resultCallback = (ResultCallback) this.f14390c;
                gg.a aVar = (gg.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.f14389b), aVar));
                    return;
                }
                return;
            default:
                lv0 lv0Var = (lv0) this.f14390c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    ks.f(j10.f24798t0).d(new bi.q2(lv0Var, tL_messages_emojiGroups, this.f14389b, 26));
                    return;
                }
                return;
        }
    }
}
