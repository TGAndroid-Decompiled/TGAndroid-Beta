package ei;

import android.util.Pair;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qx0;
public final class c9 implements Utilities.Callback {
    public final int f8836a;
    public final long f8837b;
    public final Object f8838c;

    public c9(Object obj, long j10, int i10) {
        this.f8836a = i10;
        this.f8838c = obj;
        this.f8837b = j10;
    }

    @Override
    public final void run(Object obj) {
        long j10;
        switch (this.f8836a) {
            case 0:
                k9 k9Var = (k9) this.f8838c;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                org.telegram.ui.ActionBar.b2 b2Var = k9Var.G;
                if (b2Var != null) {
                    b2Var.c(350L);
                    k9Var.G = null;
                }
                if (tL_channels_channelParticipants != null && !tL_channels_channelParticipants.participants.isEmpty()) {
                    TLRPC.TL_chatParticipants tL_chatParticipants = new TLRPC.TL_chatParticipants();
                    for (int i10 = 0; i10 < tL_channels_channelParticipants.participants.size(); i10++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        TLRPC.Peer peer = channelParticipant.peer;
                        if (peer != null) {
                            j10 = DialogObject.getPeerDialogId(peer);
                            if (j10 < 0) {
                            }
                        } else {
                            j10 = channelParticipant.user_id;
                        }
                        tL_chatParticipant.user_id = j10;
                        tL_chatParticipants.participants.add(tL_chatParticipant);
                    }
                    k9Var.d(this.f8837b, tL_chatParticipants);
                    return;
                }
                return;
            case 1:
                ResultCallback resultCallback = (ResultCallback) this.f8838c;
                eg.a aVar = (eg.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.f8837b), aVar));
                    return;
                }
                return;
            default:
                qx0 qx0Var = (qx0) this.f8838c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new a3.i0(qx0Var, tL_messages_emojiGroups, this.f8837b, 25));
                    return;
                }
                return;
        }
    }
}
