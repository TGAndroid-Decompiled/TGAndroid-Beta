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
import org.telegram.ui.Components.jx0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.f60;
import org.telegram.ui.fy;
import org.telegram.ui.gh0;
import org.telegram.ui.je;
import org.telegram.ui.qo0;
import org.telegram.ui.th0;
public final class v1 implements RequestDelegate {
    public final int f5659a;
    public final Object f5660b;
    public final boolean f5661c;
    public final Object d;

    public v1(Object obj, Object obj2, boolean z10, int i10) {
        this.f5659a = i10;
        this.d = obj;
        this.f5660b = obj2;
        this.f5661c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f5659a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.s4((w1) this.d, tLObject, (String) this.f5660b, this.f5661c, 1));
                return;
            case 1:
                gg.c2 c2Var = (gg.c2) this.d;
                String str = (String) this.f5660b;
                a0.i iVar = c2Var.h;
                ArrayList arrayList = c2Var.f9676g;
                int i10 = c2Var.f9681m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    c2Var.f9682n = str.toLowerCase();
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
                        if (!this.f5661c && peerId == clientUserId) {
                            arrayList.remove(channelParticipant);
                        } else {
                            iVar.k(channelParticipant, peerId);
                        }
                    }
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new u1((Object) ((je) this.d), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.f5660b), this.f5661c, 13));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ai.s4((jx0) this.d, tLObject, this.f5661c, (org.telegram.ui.ActionBar.b2) this.f5660b, 19));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new u1((Object) ((fy) this.d), (Object) tL_error, tLObject, (Object) ((String) this.f5660b), this.f5661c, 19));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ai.s4((f60) this.d, tLObject, (TLRPC.ChatFull) this.f5660b, this.f5661c, 21));
                return;
            case 6:
                th0 th0Var = (th0) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f5660b;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i12 = 0; i12 < tL_messages_exportedChatInvites.invites.size(); i12++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i12)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i12);
                                AndroidUtilities.runOnUIThread(new gh0(th0Var, tL_chatInviteExported, tL_error, tLObject, this.f5661c, 0));
                                return;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                AndroidUtilities.runOnUIThread(new gh0(th0Var, tL_chatInviteExported, tL_error, tLObject, this.f5661c, 0));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new u1((NotificationCenter.NotificationCenterDelegate) ((qo0) this.d), (TLObject) tL_error, this.f5661c, tLObject, (Object) ((String) this.f5660b), 21));
                return;
            default:
                AndroidUtilities.runOnUIThread(new tg.c((yh.l5) this.d, (int[]) this.f5660b, tLObject, this.f5661c));
                return;
        }
    }

    public v1(Object obj, boolean z10, Object obj2, int i10) {
        this.f5659a = i10;
        this.d = obj;
        this.f5661c = z10;
        this.f5660b = obj2;
    }
}
