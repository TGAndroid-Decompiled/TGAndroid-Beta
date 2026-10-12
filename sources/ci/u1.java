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
import org.telegram.ui.Components.sy0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ai0;
import org.telegram.ui.i60;
import org.telegram.ui.jy;
import org.telegram.ui.nh0;
import org.telegram.ui.oe;
import org.telegram.ui.xo0;
public final class u1 implements RequestDelegate {
    public final int f6051a;
    public final Object f6052b;
    public final boolean f6053c;
    public final Object d;

    public u1(Object obj, Object obj2, boolean z10, int i10) {
        this.f6051a = i10;
        this.d = obj;
        this.f6052b = obj2;
        this.f6053c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f6051a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.t4((v1) this.d, tLObject, (String) this.f6052b, this.f6053c, 1));
                return;
            case 1:
                gg.b2 b2Var = (gg.b2) this.d;
                String str = (String) this.f6052b;
                a0.i iVar = b2Var.h;
                ArrayList arrayList = b2Var.f10535g;
                int i10 = b2Var.f10540m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    b2Var.f10541n = str.toLowerCase();
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
                        if (!this.f6053c && peerId == clientUserId) {
                            arrayList.remove(channelParticipant);
                        } else {
                            iVar.k(channelParticipant, peerId);
                        }
                    }
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new t1((Object) ((oe) this.d), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.f6052b), this.f6053c, 13));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ai.t4((sy0) this.d, tLObject, this.f6053c, (org.telegram.ui.ActionBar.a2) this.f6052b, 19));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new t1((Object) ((jy) this.d), (Object) tL_error, tLObject, (Object) ((String) this.f6052b), this.f6053c, 19));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ai.t4((i60) this.d, tLObject, (TLRPC.ChatFull) this.f6052b, this.f6053c, 21));
                return;
            case 6:
                ai0 ai0Var = (ai0) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f6052b;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i12 = 0; i12 < tL_messages_exportedChatInvites.invites.size(); i12++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i12)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i12);
                                AndroidUtilities.runOnUIThread(new nh0(ai0Var, tL_chatInviteExported, tL_error, tLObject, this.f6053c, 0));
                                return;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                AndroidUtilities.runOnUIThread(new nh0(ai0Var, tL_chatInviteExported, tL_error, tLObject, this.f6053c, 0));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new t1((NotificationCenter.NotificationCenterDelegate) ((xo0) this.d), (TLObject) tL_error, this.f6053c, tLObject, (Object) ((String) this.f6052b), 21));
                return;
            default:
                AndroidUtilities.runOnUIThread(new qi.e0((yh.f5) this.d, (int[]) this.f6052b, tLObject, this.f6053c));
                return;
        }
    }

    public u1(Object obj, boolean z10, Object obj2, int i10) {
        this.f6051a = i10;
        this.d = obj;
        this.f6053c = z10;
        this.f6052b = obj2;
    }
}
