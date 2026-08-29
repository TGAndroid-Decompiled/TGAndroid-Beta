package nh;

import android.util.Pair;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ow0;
public final class q8 implements Utilities.Callback {
    public final int f18404a;
    public final long f18405b;
    public final Object f18406c;

    public q8(Object obj, long j10, int i10) {
        this.f18404a = i10;
        this.f18406c = obj;
        this.f18405b = j10;
    }

    @Override
    public final void run(Object obj) {
        long j10;
        switch (this.f18404a) {
            case 0:
                y8 y8Var = (y8) this.f18406c;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                org.telegram.ui.ActionBar.c2 c2Var = y8Var.C;
                if (c2Var != null) {
                    c2Var.c(350L);
                    y8Var.C = null;
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
                    y8Var.d(this.f18405b, tL_chatParticipants);
                    return;
                }
                return;
            case 1:
                ResultCallback resultCallback = (ResultCallback) this.f18406c;
                of.a aVar = (of.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.f18405b), aVar));
                    return;
                }
                return;
            default:
                ow0 ow0Var = (ow0) this.f18406c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new g5.v(ow0Var, tL_messages_emojiGroups, this.f18405b, 25));
                    return;
                }
                return;
        }
    }
}
