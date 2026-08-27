package lh;

import android.util.Pair;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gw0;

public final class b9 implements Utilities.Callback {

    public final int f15692a;

    public final long f15693b;

    public final Object f15694c;

    public b9(Object obj, long j10, int i10) {
        this.f15692a = i10;
        this.f15694c = obj;
        this.f15693b = j10;
    }

    @Override
    public final void run(Object obj) {
        long peerDialogId;
        switch (this.f15692a) {
            case 0:
                k9 k9Var = (k9) this.f15694c;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                org.telegram.ui.ActionBar.b2 b2Var = k9Var.C;
                if (b2Var != null) {
                    b2Var.c(350L);
                    k9Var.C = null;
                }
                if (tL_channels_channelParticipants != null && !tL_channels_channelParticipants.participants.isEmpty()) {
                    TLRPC.TL_chatParticipants tL_chatParticipants = new TLRPC.TL_chatParticipants();
                    for (int i10 = 0; i10 < tL_channels_channelParticipants.participants.size(); i10++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        TLRPC.Peer peer = channelParticipant.peer;
                        if (peer != null) {
                            peerDialogId = DialogObject.getPeerDialogId(peer);
                            if (peerDialogId < 0) {
                            }
                        } else {
                            peerDialogId = channelParticipant.user_id;
                        }
                        tL_chatParticipant.user_id = peerDialogId;
                        tL_chatParticipants.participants.add(tL_chatParticipant);
                    }
                    k9Var.d(this.f15693b, tL_chatParticipants);
                    break;
                }
                break;
            case 1:
                ResultCallback resultCallback = (ResultCallback) this.f15694c;
                mf.a aVar = (mf.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.f15693b), aVar));
                }
                break;
            default:
                gw0 gw0Var = (gw0) this.f15694c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new e5.u(gw0Var, tL_messages_emojiGroups, this.f15693b, 26));
                }
                break;
        }
    }
}
