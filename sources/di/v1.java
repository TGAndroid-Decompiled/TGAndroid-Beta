package di;

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
import org.telegram.ui.iy;
import org.telegram.ui.j60;
import org.telegram.ui.ke;
import org.telegram.ui.lh0;
import org.telegram.ui.xo0;
import org.telegram.ui.yh0;
public final class v1 implements RequestDelegate {
    public final int f8308a;
    public final Object f8309b;
    public final boolean f8310c;
    public final Object d;

    public v1(Object obj, Object obj2, boolean z10, int i10) {
        this.f8308a = i10;
        this.d = obj;
        this.f8309b = obj2;
        this.f8310c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f8308a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.e4((w1) this.d, tLObject, (String) this.f8309b, this.f8310c, 1));
                return;
            case 1:
                hg.b2 b2Var = (hg.b2) this.d;
                String str = (String) this.f8309b;
                a0.i iVar = b2Var.h;
                ArrayList arrayList = b2Var.f11010g;
                int i10 = b2Var.f11015m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    b2Var.f11016n = str.toLowerCase();
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
                        if (!this.f8310c && peerId == clientUserId) {
                            arrayList.remove(channelParticipant);
                        } else {
                            iVar.k(channelParticipant, peerId);
                        }
                    }
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new u1((Object) ((ke) this.d), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.f8309b), this.f8310c, 13));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new bi.e4((jx0) this.d, tLObject, this.f8310c, (org.telegram.ui.ActionBar.b2) this.f8309b, 19));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new u1((Object) ((iy) this.d), (Object) tL_error, tLObject, (Object) ((String) this.f8309b), this.f8310c, 19));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new bi.e4((j60) this.d, tLObject, (TLRPC.ChatFull) this.f8309b, this.f8310c, 21));
                return;
            case 6:
                yh0 yh0Var = (yh0) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f8309b;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i12 = 0; i12 < tL_messages_exportedChatInvites.invites.size(); i12++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i12)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i12);
                                AndroidUtilities.runOnUIThread(new lh0(yh0Var, tL_chatInviteExported, tL_error, tLObject, this.f8310c, 0));
                                return;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                AndroidUtilities.runOnUIThread(new lh0(yh0Var, tL_chatInviteExported, tL_error, tLObject, this.f8310c, 0));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new u1((NotificationCenter.NotificationCenterDelegate) ((xo0) this.d), (TLObject) tL_error, this.f8310c, tLObject, (Object) ((String) this.f8309b), 21));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ug.c((zh.j5) this.d, (int[]) this.f8309b, tLObject, this.f8310c));
                return;
        }
    }

    public v1(Object obj, boolean z10, Object obj2, int i10) {
        this.f8308a = i10;
        this.d = obj;
        this.f8310c = z10;
        this.f8309b = obj2;
    }
}
