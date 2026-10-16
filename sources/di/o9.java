package di;

import android.util.Pair;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ux0;
public final class o9 implements Utilities.Callback {
    public final int f7566a;
    public final long f7567b;
    public final Object f7568c;

    public o9(Object obj, long j10, int i10) {
        this.f7566a = i10;
        this.f7568c = obj;
        this.f7567b = j10;
    }

    @Override
    public final void run(Object obj) {
        long j10;
        switch (this.f7566a) {
            case 0:
                x9 x9Var = (x9) this.f7568c;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                org.telegram.ui.ActionBar.a2 a2Var = x9Var.G;
                if (a2Var != null) {
                    a2Var.c(350L);
                    x9Var.G = null;
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
                    x9Var.d(this.f7567b, tL_chatParticipants);
                    return;
                }
                return;
            case 1:
                ResultCallback resultCallback = (ResultCallback) this.f7568c;
                eg.a aVar = (eg.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.f7567b), aVar));
                    return;
                }
                return;
            default:
                ux0 ux0Var = (ux0) this.f7568c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new a3.i0(ux0Var, tL_messages_emojiGroups, this.f7567b, 22));
                    return;
                }
                return;
        }
    }
}
