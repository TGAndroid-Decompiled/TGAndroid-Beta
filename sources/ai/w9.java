package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fo0;
import org.telegram.ui.kh0;
import org.telegram.ui.rx;
import org.telegram.ui.s50;
import org.telegram.ui.wg0;
public final class w9 implements RequestDelegate {
    public final int f2378a;
    public final boolean f2379b;
    public final Object f2380c;
    public final Object d;

    public w9(Object obj, Object obj2, boolean z10, int i10) {
        this.f2378a = i10;
        this.f2380c = obj;
        this.d = obj2;
        this.f2379b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f2378a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y3((Object) ((x9) this.f2380c), (Object) ((int[]) this.d), tLObject, this.f2379b, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new y3((ei.t1) this.f2380c, tLObject, (String) this.d, this.f2379b, 3));
                return;
            case 2:
                hg.a2 a2Var = (hg.a2) this.f2380c;
                String str = (String) this.d;
                a0.h hVar = a2Var.h;
                ArrayList arrayList = a2Var.f11797g;
                int i10 = a2Var.f11802m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    a2Var.f11803n = str.toLowerCase();
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
                        if (!this.f2379b && peerId == clientUserId) {
                            arrayList.remove(channelParticipant);
                        } else {
                            hVar.k(channelParticipant, peerId);
                        }
                    }
                    return;
                }
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new e2((org.telegram.ui.ke) this.f2380c, tL_error, tLObject, (TwoStepVerificationActivity) this.d, this.f2379b, 14));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new y3((dy0) this.f2380c, tLObject, this.f2379b, (org.telegram.ui.ActionBar.b2) this.d, 20));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new e2((rx) this.f2380c, tL_error, tLObject, (String) this.d, this.f2379b, 20));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new y3((Object) ((s50) this.f2380c), (Object) tLObject, (Object) ((TLRPC.ChatFull) this.d), this.f2379b, 22));
                return;
            case 7:
                kh0 kh0Var = (kh0) this.f2380c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i12 = 0; i12 < tL_messages_exportedChatInvites.invites.size(); i12++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i12)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i12);
                                AndroidUtilities.runOnUIThread(new wg0(kh0Var, tL_chatInviteExported, tL_error, tLObject, this.f2379b, 0));
                                return;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                AndroidUtilities.runOnUIThread(new wg0(kh0Var, tL_chatInviteExported, tL_error, tLObject, this.f2379b, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new e2((Object) ((fo0) this.f2380c), (Object) tL_error, this.f2379b, (Object) tLObject, (Object) ((String) this.d), 22));
                return;
        }
    }

    public w9(Object obj, boolean z10, Object obj2, int i10) {
        this.f2378a = i10;
        this.f2380c = obj;
        this.f2379b = z10;
        this.d = obj2;
    }
}
