package jh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bo0;
import org.telegram.ui.de;
import org.telegram.ui.hh0;
import org.telegram.ui.r50;
import org.telegram.ui.sx;
import org.telegram.ui.ug0;
public final class j7 implements RequestDelegate {
    public final int f12341a;
    public final boolean f12342b;
    public final Object f12343c;
    public final Object d;

    public j7(Object obj, Object obj2, boolean z10, int i10) {
        this.f12341a = i10;
        this.f12343c = obj;
        this.d = obj2;
        this.f12342b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f12341a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ag.w0((k7) this.f12343c, (int[]) this.d, tLObject, this.f12342b, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ag.w0((nh.r1) this.f12343c, tLObject, (String) this.d, this.f12342b, 4));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new eg.j((de) this.f12343c, tL_error, tLObject, (TwoStepVerificationActivity) this.d, this.f12342b, 12));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ag.w0((cx0) this.f12343c, tLObject, this.f12342b, (org.telegram.ui.ActionBar.c2) this.d, 17));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new eg.j((Object) ((sx) this.f12343c), tL_error, tLObject, (String) this.d, this.f12342b, 18));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ag.w0((r50) this.f12343c, tLObject, (TLRPC.ChatFull) this.d, this.f12342b, 19));
                return;
            case 6:
                hh0 hh0Var = (hh0) this.f12343c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i10 = 0; i10 < tL_messages_exportedChatInvites.invites.size(); i10++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i10)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i10);
                                AndroidUtilities.runOnUIThread(new ug0(hh0Var, tL_chatInviteExported, tL_error, tLObject, this.f12342b, 0));
                                return;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                AndroidUtilities.runOnUIThread(new ug0(hh0Var, tL_chatInviteExported, tL_error, tLObject, this.f12342b, 0));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new eg.j((Object) ((bo0) this.f12343c), (TLObject) tL_error, this.f12342b, tLObject, (String) this.d, 20));
                return;
            default:
                rf.k1 k1Var = (rf.k1) this.f12343c;
                String str = (String) this.d;
                a0.h hVar = k1Var.h;
                ArrayList arrayList = k1Var.f47282g;
                int i11 = k1Var.f47287m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    k1Var.f47288n = str.toLowerCase();
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
                        if (!this.f12342b && peerId == clientUserId) {
                            arrayList.remove(channelParticipant);
                        } else {
                            hVar.k(channelParticipant, peerId);
                        }
                    }
                    return;
                }
                return;
        }
    }

    public j7(Object obj, boolean z10, Object obj2, int i10) {
        this.f12341a = i10;
        this.f12343c = obj;
        this.f12342b = z10;
        this.d = obj2;
    }
}
