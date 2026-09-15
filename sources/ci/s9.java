package ci;

import android.util.Pair;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ww0;
public final class s9 implements Utilities.Callback {
    public final int f5516a;
    public final long f5517b;
    public final Object f5518c;

    public s9(Object obj, long j3, int i10) {
        this.f5516a = i10;
        this.f5518c = obj;
        this.f5517b = j3;
    }

    @Override
    public final void run(Object obj) {
        long j3;
        switch (this.f5516a) {
            case 0:
                ba baVar = (ba) this.f5518c;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                org.telegram.ui.ActionBar.b2 b2Var = baVar.G;
                if (b2Var != null) {
                    b2Var.c(350L);
                    baVar.G = null;
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
                    baVar.d(this.f5517b, tL_chatParticipants);
                    return;
                }
                return;
            case 1:
                ResultCallback resultCallback = (ResultCallback) this.f5518c;
                dg.a aVar = (dg.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.f5517b), aVar));
                    return;
                }
                return;
            default:
                ww0 ww0Var = (ww0) this.f5518c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new a3.h0(ww0Var, tL_messages_emojiGroups, this.f5517b, 23));
                    return;
                }
                return;
        }
    }
}
