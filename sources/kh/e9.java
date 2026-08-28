package kh;

import android.util.Pair;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ew0;
public final class e9 implements Utilities.Callback {
    public final int f15166a;
    public final long f15167b;
    public final Object f15168c;

    public e9(Object obj, long j10, int i9) {
        this.f15166a = i9;
        this.f15168c = obj;
        this.f15167b = j10;
    }

    @Override
    public final void run(Object obj) {
        long j10;
        switch (this.f15166a) {
            case 0:
                n9 n9Var = (n9) this.f15168c;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                org.telegram.ui.ActionBar.c2 c2Var = n9Var.C;
                if (c2Var != null) {
                    c2Var.c(350L);
                    n9Var.C = null;
                }
                if (tL_channels_channelParticipants != null && !tL_channels_channelParticipants.participants.isEmpty()) {
                    TLRPC.TL_chatParticipants tL_chatParticipants = new TLRPC.TL_chatParticipants();
                    for (int i9 = 0; i9 < tL_channels_channelParticipants.participants.size(); i9++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i9);
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
                    n9Var.d(this.f15167b, tL_chatParticipants);
                    return;
                }
                return;
            case 1:
                ResultCallback resultCallback = (ResultCallback) this.f15168c;
                lf.a aVar = (lf.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.f15167b), aVar));
                    return;
                }
                return;
            default:
                ew0 ew0Var = (ew0) this.f15168c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new e5.w(ew0Var, tL_messages_emojiGroups, this.f15167b, 26));
                    return;
                }
                return;
        }
    }
}
