package ci;

import android.util.Pair;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rx0;
public final class o9 implements Utilities.Callback {
    public final int f5667a;
    public final long f5668b;
    public final Object f5669c;

    public o9(Object obj, long j3, int i10) {
        this.f5667a = i10;
        this.f5669c = obj;
        this.f5668b = j3;
    }

    @Override
    public final void run(Object obj) {
        long j3;
        switch (this.f5667a) {
            case 0:
                x9 x9Var = (x9) this.f5669c;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                org.telegram.ui.ActionBar.b2 b2Var = x9Var.G;
                if (b2Var != null) {
                    b2Var.c(350L);
                    x9Var.G = null;
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
                    x9Var.d(this.f5668b, tL_chatParticipants);
                    return;
                }
                return;
            case 1:
                ResultCallback resultCallback = (ResultCallback) this.f5669c;
                dg.a aVar = (dg.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.f5668b), aVar));
                    return;
                }
                return;
            default:
                rx0 rx0Var = (rx0) this.f5669c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new a3.h0(rx0Var, tL_messages_emojiGroups, this.f5668b, 22));
                    return;
                }
                return;
        }
    }
}
