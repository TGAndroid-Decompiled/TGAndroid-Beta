package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ho0;
import org.telegram.ui.lh0;
import org.telegram.ui.rx;
import org.telegram.ui.u50;
import org.telegram.ui.xg0;
public final class w9 implements RequestDelegate {
    public final int f2386a;
    public final boolean f2387b;
    public final Object f2388c;
    public final Object d;

    public w9(Object obj, Object obj2, boolean z10, int i10) {
        this.f2386a = i10;
        this.f2388c = obj;
        this.d = obj2;
        this.f2387b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f2386a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x9((y9) this.f2388c, (int[]) this.d, tLObject, this.f2387b, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new x9((Object) ((ei.t1) this.f2388c), tLObject, (Object) ((String) this.d), this.f2387b, 2));
                return;
            case 2:
                hg.a2 a2Var = (hg.a2) this.f2388c;
                String str = (String) this.d;
                a0.h hVar = a2Var.h;
                ArrayList arrayList = a2Var.f11823g;
                int i10 = a2Var.f11828m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    a2Var.f11829n = str.toLowerCase();
                    MessagesController.getInstance(i10).putUsers(tL_channels_channelParticipants.users, false);
                    MessagesController.getInstance(i10).putChats(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    hVar.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i11);
                        long peerId = MessageObject.getPeerId(channelParticipant.peer);
                        if (!this.f2387b && peerId == clientUserId) {
                            arrayList.remove(channelParticipant);
                        } else {
                            hVar.k(channelParticipant, peerId);
                        }
                    }
                    return;
                }
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ei.s1((Object) ((org.telegram.ui.ie) this.f2388c), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.d), this.f2387b, 13));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new x9((hy0) this.f2388c, tLObject, this.f2387b, (org.telegram.ui.ActionBar.c2) this.d));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ei.s1((Object) ((rx) this.f2388c), (Object) tL_error, tLObject, (Object) ((String) this.d), this.f2387b, 19));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new x9((Object) ((u50) this.f2388c), tLObject, (Object) ((TLRPC.ChatFull) this.d), this.f2387b, 22));
                return;
            case 7:
                lh0 lh0Var = (lh0) this.f2388c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i12 = 0; i12 < tL_messages_exportedChatInvites.invites.size(); i12++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i12)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i12);
                                AndroidUtilities.runOnUIThread(new xg0(lh0Var, tL_chatInviteExported, tL_error, tLObject, this.f2387b, 0));
                                return;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                AndroidUtilities.runOnUIThread(new xg0(lh0Var, tL_chatInviteExported, tL_error, tLObject, this.f2387b, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ei.s1((NotificationCenter.NotificationCenterDelegate) ((ho0) this.f2388c), (TLObject) tL_error, this.f2387b, tLObject, (Object) ((String) this.d), 21));
                return;
        }
    }

    public w9(Object obj, boolean z10, Object obj2, int i10) {
        this.f2386a = i10;
        this.f2388c = obj;
        this.f2387b = z10;
        this.d = obj2;
    }
}
