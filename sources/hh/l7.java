package hh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fe;
import org.telegram.ui.kh0;
import org.telegram.ui.s50;
import org.telegram.ui.xg0;

public final class l7 implements RequestDelegate {

    public final int f9674a;

    public final boolean f9675b;

    public final Object f9676c;
    public final Object d;

    public l7(Object obj, Object obj2, boolean z10, int i10) {
        this.f9674a = i10;
        this.f9676c = obj;
        this.d = obj2;
        this.f9675b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f9674a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cg.c((m7) this.f9676c, (int[]) this.d, tLObject, this.f9675b, 1));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new cg.c((lh.s1) this.f9676c, tLObject, (String) this.d, this.f9675b, 3));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new cg.j((fe) this.f9676c, tL_error, tLObject, (TwoStepVerificationActivity) this.d, this.f9675b, 12));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new cg.c((tw0) this.f9676c, tLObject, this.f9675b, (org.telegram.ui.ActionBar.b2) this.d, 16));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new cg.j(this.f9676c, tL_error, tLObject, (String) this.d, this.f9675b, 18));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new cg.c((s50) this.f9676c, tLObject, (TLRPC.ChatFull) this.d, this.f9675b, 18));
                break;
            case 6:
                kh0 kh0Var = (kh0) this.f9676c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() <= 0 || tL_chatInviteExported2 == null) {
                        tL_chatInviteExported = null;
                    } else {
                        for (int i10 = 0; i10 < tL_messages_exportedChatInvites.invites.size(); i10++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i10)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i10);
                            }
                        }
                        tL_chatInviteExported = null;
                    }
                } else {
                    tL_chatInviteExported = null;
                }
                AndroidUtilities.runOnUIThread(new xg0(kh0Var, tL_chatInviteExported, tL_error, tLObject, this.f9675b, 0));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new cg.j(this.f9676c, (TLObject) tL_error, this.f9675b, tLObject, (String) this.d, 20));
                break;
            default:
                pf.j1 j1Var = (pf.j1) this.f9676c;
                String str = (String) this.d;
                a0.h hVar = j1Var.h;
                ArrayList arrayList = j1Var.f45841g;
                int i11 = j1Var.f45846m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    j1Var.f45847n = str.toLowerCase();
                    MessagesController.getInstance(i11).putUsers(tL_channels_channelParticipants.users, false);
                    MessagesController.getInstance(i11).putChats(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    hVar.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long clientUserId = UserConfig.getInstance(i11).getClientUserId();
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i12);
                        long peerId = MessageObject.getPeerId(channelParticipant.peer);
                        if (this.f9675b || peerId != clientUserId) {
                            hVar.k(channelParticipant, peerId);
                        } else {
                            arrayList.remove(channelParticipant);
                        }
                    }
                }
                break;
        }
    }

    public l7(Object obj, boolean z10, Object obj2, int i10) {
        this.f9674a = i10;
        this.f9676c = obj;
        this.f9675b = z10;
        this.d = obj2;
    }
}
