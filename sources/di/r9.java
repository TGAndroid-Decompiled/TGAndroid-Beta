package di;

import android.util.Pair;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vw0;
public final class r9 implements Utilities.Callback {
    public final int f8102a;
    public final long f8103b;
    public final Object f8104c;

    public r9(Object obj, long j3, int i10) {
        this.f8102a = i10;
        this.f8104c = obj;
        this.f8103b = j3;
    }

    @Override
    public final void run(Object obj) {
        long j3;
        switch (this.f8102a) {
            case 0:
                ba baVar = (ba) this.f8104c;
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
                    baVar.d(this.f8103b, tL_chatParticipants);
                    return;
                }
                return;
            case 1:
                ResultCallback resultCallback = (ResultCallback) this.f8104c;
                dg.a aVar = (dg.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.f8103b), aVar));
                    return;
                }
                return;
            default:
                vw0 vw0Var = (vw0) this.f8104c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new a3.h0(vw0Var, tL_messages_emojiGroups, this.f8103b, 23));
                    return;
                }
                return;
        }
    }
}
