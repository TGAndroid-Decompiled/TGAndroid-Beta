package bi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.j60;
import org.telegram.ui.ky;
import org.telegram.ui.mh0;
import org.telegram.ui.wo0;
import org.telegram.ui.zh0;
public final class f2 implements RequestDelegate {
    public final int f2688a;
    public final Object f2689b;
    public final boolean f2690c;
    public final Object d;

    public f2(Object obj, Object obj2, boolean z10, int i10) {
        this.f2688a = i10;
        this.d = obj;
        this.f2689b = obj2;
        this.f2690c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f2688a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g2((h2) this.d, tLObject, (String) this.f2689b, this.f2690c, 0));
                return;
            case 1:
                fg.d2 d2Var = (fg.d2) this.d;
                String str = (String) this.f2689b;
                a0.i iVar = d2Var.h;
                ArrayList arrayList = d2Var.f7983g;
                int i10 = d2Var.f7988m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    d2Var.f7989n = str.toLowerCase();
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
                        if (!this.f2690c && peerId == clientUserId) {
                            arrayList.remove(channelParticipant);
                        } else {
                            iVar.k(channelParticipant, peerId);
                        }
                    }
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new e2((Object) ((org.telegram.ui.le) this.d), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.f2689b), this.f2690c, 13));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new g2((wx0) this.d, tLObject, this.f2690c, (org.telegram.ui.ActionBar.d2) this.f2689b, 19));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new e2((Object) ((ky) this.d), (Object) tL_error, tLObject, (Object) ((String) this.f2689b), this.f2690c, 19));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new g2((j60) this.d, tLObject, (TLRPC.ChatFull) this.f2689b, this.f2690c, 21));
                return;
            case 6:
                zh0 zh0Var = (zh0) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f2689b;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i12 = 0; i12 < tL_messages_exportedChatInvites.invites.size(); i12++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i12)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i12);
                                AndroidUtilities.runOnUIThread(new mh0(zh0Var, tL_chatInviteExported, tL_error, tLObject, this.f2690c, 0));
                                return;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                AndroidUtilities.runOnUIThread(new mh0(zh0Var, tL_chatInviteExported, tL_error, tLObject, this.f2690c, 0));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new e2((NotificationCenter.NotificationCenterDelegate) ((wo0) this.d), (TLObject) tL_error, this.f2690c, tLObject, (Object) ((String) this.f2689b), 21));
                return;
            default:
                AndroidUtilities.runOnUIThread(new xh.m5((xh.n5) this.d, (int[]) this.f2689b, tLObject, this.f2690c));
                return;
        }
    }

    public f2(Object obj, boolean z10, Object obj2, int i10) {
        this.f2688a = i10;
        this.d = obj;
        this.f2690c = z10;
        this.f2689b = obj2;
    }
}
