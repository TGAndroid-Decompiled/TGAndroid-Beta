package ci;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ai0;
import org.telegram.ui.k60;
import org.telegram.ui.ky;
import org.telegram.ui.le;
import org.telegram.ui.nh0;
import org.telegram.ui.yo0;
public final class v1 implements RequestDelegate {
    public final int f5646a;
    public final Object f5647b;
    public final boolean f5648c;
    public final Object d;

    public v1(Object obj, Object obj2, boolean z10, int i10) {
        this.f5646a = i10;
        this.d = obj;
        this.f5647b = obj2;
        this.f5648c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f5646a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.s4((w1) this.d, tLObject, (String) this.f5647b, this.f5648c, 1));
                return;
            case 1:
                gg.c2 c2Var = (gg.c2) this.d;
                String str = (String) this.f5647b;
                a0.i iVar = c2Var.h;
                ArrayList arrayList = c2Var.f9694g;
                int i10 = c2Var.f9699m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    c2Var.f9700n = str.toLowerCase();
                    MessagesController.getInstance(i10).putUsers(tL_channels_channelParticipants.users, false);
                    MessagesController.getInstance(i10).putChats(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    iVar.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i11);
                        long peerId = MessageObject.getPeerId(channelParticipant.peer);
                        if (!this.f5648c && peerId == clientUserId) {
                            arrayList.remove(channelParticipant);
                        } else {
                            iVar.k(channelParticipant, peerId);
                        }
                    }
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new u1((Object) ((le) this.d), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.f5647b), this.f5648c, 13));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ai.s4((lx0) this.d, tLObject, this.f5648c, (org.telegram.ui.ActionBar.c2) this.f5647b, 19));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new u1((Object) ((ky) this.d), (Object) tL_error, tLObject, (Object) ((String) this.f5647b), this.f5648c, 19));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ai.s4((k60) this.d, tLObject, (TLRPC.ChatFull) this.f5647b, this.f5648c, 21));
                return;
            case 6:
                ai0 ai0Var = (ai0) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f5647b;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i12 = 0; i12 < tL_messages_exportedChatInvites.invites.size(); i12++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i12)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i12);
                                AndroidUtilities.runOnUIThread(new nh0(ai0Var, tL_chatInviteExported, tL_error, tLObject, this.f5648c, 0));
                                return;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                AndroidUtilities.runOnUIThread(new nh0(ai0Var, tL_chatInviteExported, tL_error, tLObject, this.f5648c, 0));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new u1((NotificationCenter.NotificationCenterDelegate) ((yo0) this.d), (TLObject) tL_error, this.f5648c, tLObject, (Object) ((String) this.f5647b), 21));
                return;
            default:
                AndroidUtilities.runOnUIThread(new tg.c((yh.n5) this.d, (int[]) this.f5647b, tLObject, this.f5648c));
                return;
        }
    }

    public v1(Object obj, boolean z10, Object obj2, int i10) {
        this.f5646a = i10;
        this.d = obj;
        this.f5648c = z10;
        this.f5647b = obj2;
    }
}
