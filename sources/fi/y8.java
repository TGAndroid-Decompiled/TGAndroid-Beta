package fi;

import android.util.Pair;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.by0;
public final class y8 implements Utilities.Callback {
    public final int f12005a;
    public final long f12006b;
    public final Object f12007c;

    public y8(Object obj, long j10, int i10) {
        this.f12005a = i10;
        this.f12007c = obj;
        this.f12006b = j10;
    }

    @Override
    public final void run(Object obj) {
        long j10;
        switch (this.f12005a) {
            case 0:
                g9 g9Var = (g9) this.f12007c;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                org.telegram.ui.ActionBar.e2 e2Var = g9Var.G;
                if (e2Var != null) {
                    e2Var.c(350L);
                    g9Var.G = null;
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
                    g9Var.d(this.f12006b, tL_chatParticipants);
                    return;
                }
                return;
            case 1:
                ResultCallback resultCallback = (ResultCallback) this.f12007c;
                fg.a aVar = (fg.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.f12006b), aVar));
                    return;
                }
                return;
            default:
                by0 by0Var = (by0) this.f12007c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new a3.i0(by0Var, tL_messages_emojiGroups, this.f12006b, 25));
                    return;
                }
                return;
        }
    }
}
