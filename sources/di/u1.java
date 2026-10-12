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
import org.telegram.ui.Components.iy0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cp0;
import org.telegram.ui.ei0;
import org.telegram.ui.my;
import org.telegram.ui.n60;
import org.telegram.ui.qe;
import org.telegram.ui.rh0;
public final class u1 implements RequestDelegate {
    public final int f7882a;
    public final Object f7883b;
    public final boolean f7884c;
    public final Object d;

    public u1(Object obj, Object obj2, boolean z10, int i10) {
        this.f7882a = i10;
        this.d = obj;
        this.f7883b = obj2;
        this.f7884c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f7882a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.h4((v1) this.d, tLObject, (String) this.f7883b, this.f7884c, 1));
                return;
            case 1:
                hg.a2 a2Var = (hg.a2) this.d;
                String str = (String) this.f7883b;
                a0.h hVar = a2Var.h;
                ArrayList arrayList = a2Var.f10488g;
                int i10 = a2Var.f10493m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    a2Var.f10494n = str.toLowerCase();
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
                        if (!this.f7884c && peerId == clientUserId) {
                            arrayList.remove(channelParticipant);
                        } else {
                            hVar.k(channelParticipant, peerId);
                        }
                    }
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new t1((Object) ((qe) this.d), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.f7883b), this.f7884c, 14));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new bi.h4((iy0) this.d, tLObject, this.f7884c, (org.telegram.ui.ActionBar.a2) this.f7883b, 19));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new t1((Object) ((my) this.d), (Object) tL_error, tLObject, (Object) ((String) this.f7883b), this.f7884c, 20));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new bi.h4((n60) this.d, tLObject, (TLRPC.ChatFull) this.f7883b, this.f7884c, 21));
                return;
            case 6:
                ei0 ei0Var = (ei0) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f7883b;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i12 = 0; i12 < tL_messages_exportedChatInvites.invites.size(); i12++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i12)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i12);
                                AndroidUtilities.runOnUIThread(new rh0(ei0Var, tL_chatInviteExported, tL_error, tLObject, this.f7884c, 0));
                                return;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                AndroidUtilities.runOnUIThread(new rh0(ei0Var, tL_chatInviteExported, tL_error, tLObject, this.f7884c, 0));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new t1((NotificationCenter.NotificationCenterDelegate) ((cp0) this.d), (TLObject) tL_error, this.f7884c, tLObject, (Object) ((String) this.f7883b), 22));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ug.c((zh.f5) this.d, (int[]) this.f7883b, tLObject, this.f7884c));
                return;
        }
    }

    public u1(Object obj, boolean z10, Object obj2, int i10) {
        this.f7882a = i10;
        this.d = obj;
        this.f7884c = z10;
        this.f7883b = obj2;
    }
}
