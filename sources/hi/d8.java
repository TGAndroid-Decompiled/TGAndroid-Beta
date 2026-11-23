package hi;

import android.os.SystemClock;
import android.util.Pair;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lv0;
public final class d8 implements y10 {
    public final int f14415a;
    public final long f14416b;
    public final Object f14417c;

    public d8(Object obj, long j3, int i7) {
        this.f14415a = i7;
        this.f14417c = obj;
        this.f14416b = j3;
    }

    @Override
    public final void a(Object obj) {
        long j3;
        switch (this.f14415a) {
            case 0:
                l8 l8Var = (l8) this.f14417c;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                org.telegram.ui.ActionBar.t1 t1Var = l8Var.H;
                if (t1Var != null) {
                    t1Var.c(350L);
                    l8Var.H = null;
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
                    l8Var.e(this.f14416b, tL_chatParticipants);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.h3(new q1(28, (ji.n) this.f14417c, (String) obj), Math.max(0L, (this.f14416b + 1200) - SystemClock.uptimeMillis()));
                return;
            case 2:
                ResultCallback resultCallback = (ResultCallback) this.f14417c;
                gg.a aVar = (gg.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.f14416b), aVar));
                    return;
                }
                return;
            default:
                lv0 lv0Var = (lv0) this.f14417c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    ls.f(k10.f24932t0).d(new bi.s2(lv0Var, tL_messages_emojiGroups, this.f14416b, 26));
                    return;
                }
                return;
        }
    }
}
