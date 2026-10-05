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
import org.telegram.ui.Components.gy0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.h60;
import org.telegram.ui.hy;
import org.telegram.ui.jh0;
import org.telegram.ui.me;
import org.telegram.ui.so0;
import org.telegram.ui.wh0;
public final class v1 implements RequestDelegate {
    public final int f6103a;
    public final Object f6104b;
    public final boolean f6105c;
    public final Object d;

    public v1(Object obj, Object obj2, boolean z10, int i10) {
        this.f6103a = i10;
        this.d = obj;
        this.f6104b = obj2;
        this.f6105c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f6103a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.s4((w1) this.d, tLObject, (String) this.f6104b, this.f6105c, 1));
                return;
            case 1:
                gg.c2 c2Var = (gg.c2) this.d;
                String str = (String) this.f6104b;
                a0.i iVar = c2Var.h;
                ArrayList arrayList = c2Var.f10537g;
                int i10 = c2Var.f10542m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    c2Var.f10543n = str.toLowerCase();
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
                        if (!this.f6105c && peerId == clientUserId) {
                            arrayList.remove(channelParticipant);
                        } else {
                            iVar.k(channelParticipant, peerId);
                        }
                    }
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new u1((Object) ((me) this.d), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.f6104b), this.f6105c, 14));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ai.s4((gy0) this.d, tLObject, this.f6105c, (org.telegram.ui.ActionBar.b2) this.f6104b, 20));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new u1((Object) ((hy) this.d), (Object) tL_error, tLObject, (Object) ((String) this.f6104b), this.f6105c, 20));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ai.s4((h60) this.d, tLObject, (TLRPC.ChatFull) this.f6104b, this.f6105c, 22));
                return;
            case 6:
                wh0 wh0Var = (wh0) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f6104b;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i12 = 0; i12 < tL_messages_exportedChatInvites.invites.size(); i12++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i12)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i12);
                                AndroidUtilities.runOnUIThread(new jh0(wh0Var, tL_chatInviteExported, tL_error, tLObject, this.f6105c, 0));
                                return;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                AndroidUtilities.runOnUIThread(new jh0(wh0Var, tL_chatInviteExported, tL_error, tLObject, this.f6105c, 0));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new u1((NotificationCenter.NotificationCenterDelegate) ((so0) this.d), (TLObject) tL_error, this.f6105c, tLObject, (Object) ((String) this.f6104b), 22));
                return;
            default:
                AndroidUtilities.runOnUIThread(new pg.l0((yh.l5) this.d, (int[]) this.f6104b, tLObject, this.f6105c, 2));
                return;
        }
    }

    public v1(Object obj, boolean z10, Object obj2, int i10) {
        this.f6103a = i10;
        this.d = obj;
        this.f6105c = z10;
        this.f6104b = obj2;
    }
}
