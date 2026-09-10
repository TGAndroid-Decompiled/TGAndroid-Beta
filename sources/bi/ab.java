package bi;

import android.util.Pair;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hx0;
public final class ab implements Utilities.Callback {
    public final int f2336a;
    public final long f2337b;
    public final Object f2338c;

    public ab(Object obj, long j3, int i10) {
        this.f2336a = i10;
        this.f2338c = obj;
        this.f2337b = j3;
    }

    @Override
    public final void run(Object obj) {
        long j3;
        switch (this.f2336a) {
            case 0:
                kb kbVar = (kb) this.f2338c;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                org.telegram.ui.ActionBar.d2 d2Var = kbVar.G;
                if (d2Var != null) {
                    d2Var.c(350L);
                    kbVar.G = null;
                }
                if (tL_channels_channelParticipants != null && !tL_channels_channelParticipants.participants.isEmpty()) {
                    TLRPC.TL_chatParticipants tL_chatParticipants = new TLRPC.TL_chatParticipants();
                    for (int i10 = 0; i10 < tL_channels_channelParticipants.participants.size(); i10++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        TLRPC.Peer peer = channelParticipant.peer;
                        if (peer != null) {
                            j3 = DialogObject.getPeerDialogId(peer);
                            if (j3 < 0) {
                            }
                        } else {
                            j3 = channelParticipant.user_id;
                        }
                        tL_chatParticipant.user_id = j3;
                        tL_chatParticipants.participants.add(tL_chatParticipant);
                    }
                    kbVar.d(this.f2337b, tL_chatParticipants);
                    return;
                }
                return;
            case 1:
                ResultCallback resultCallback = (ResultCallback) this.f2338c;
                cg.a aVar = (cg.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.f2337b), aVar));
                    return;
                }
                return;
            default:
                hx0 hx0Var = (hx0) this.f2338c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new a3.h0(hx0Var, tL_messages_emojiGroups, this.f2337b, 17));
                    return;
                }
                return;
        }
    }
}
