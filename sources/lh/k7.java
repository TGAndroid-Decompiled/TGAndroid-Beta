package lh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c60;
import org.telegram.ui.ch0;
import org.telegram.ui.cy;
import org.telegram.ui.jo0;
import org.telegram.ui.ke;
import org.telegram.ui.ph0;
public final class k7 implements RequestDelegate {
    public final int f12732a;
    public final boolean f12733b;
    public final Object f12734c;
    public final Object d;

    public k7(Object obj, Object obj2, boolean z4, int i10) {
        this.f12732a = i10;
        this.f12734c = obj;
        this.d = obj2;
        this.f12733b = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f12732a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cg.u0((l7) this.f12734c, (int[]) this.d, tLObject, this.f12733b, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gg.j((ke) this.f12734c, tL_error, tLObject, (TwoStepVerificationActivity) this.d, this.f12733b, 10));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new cg.u0((lx0) this.f12734c, tLObject, this.f12733b, (org.telegram.ui.ActionBar.d2) this.d, 15));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new gg.j((Object) ((cy) this.f12734c), tL_error, tLObject, (String) this.d, this.f12733b, 16));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new cg.u0((c60) this.f12734c, tLObject, (TLRPC.ChatFull) this.d, this.f12733b, 17));
                return;
            case 5:
                ph0 ph0Var = (ph0) this.f12734c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i10 = 0; i10 < tL_messages_exportedChatInvites.invites.size(); i10++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i10)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i10);
                                AndroidUtilities.runOnUIThread(new ch0(ph0Var, tL_chatInviteExported, tL_error, tLObject, this.f12733b, 0));
                                return;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                AndroidUtilities.runOnUIThread(new ch0(ph0Var, tL_chatInviteExported, tL_error, tLObject, this.f12733b, 0));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new gg.j((Object) ((jo0) this.f12734c), (TLObject) tL_error, this.f12733b, tLObject, (String) this.d, 18));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new cg.u0((ph.g1) this.f12734c, tLObject, (String) this.d, this.f12733b, 25));
                return;
            default:
                tf.k1 k1Var = (tf.k1) this.f12734c;
                String str = (String) this.d;
                a0.h hVar = k1Var.h;
                ArrayList arrayList = k1Var.f44773g;
                int i11 = k1Var.f44778m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    k1Var.f44779n = str.toLowerCase();
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
                        if (!this.f12733b && peerId == clientUserId) {
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

    public k7(Object obj, boolean z4, Object obj2, int i10) {
        this.f12732a = i10;
        this.f12734c = obj;
        this.f12733b = z4;
        this.d = obj2;
    }
}
