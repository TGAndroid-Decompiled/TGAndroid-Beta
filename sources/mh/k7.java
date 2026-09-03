package mh;

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
import org.telegram.ui.d60;
import org.telegram.ui.dh0;
import org.telegram.ui.dy;
import org.telegram.ui.ke;
import org.telegram.ui.lo0;
import org.telegram.ui.qh0;
public final class k7 implements RequestDelegate {
    public final int f14365a;
    public final boolean f14366b;
    public final Object f14367c;
    public final Object d;

    public k7(Object obj, Object obj2, boolean z4, int i10) {
        this.f14365a = i10;
        this.f14367c = obj;
        this.d = obj2;
        this.f14366b = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f14365a) {
            case 0:
                AndroidUtilities.runOnUIThread(new dg.t0((l7) this.f14367c, (int[]) this.d, tLObject, this.f14366b, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new hg.j((ke) this.f14367c, tL_error, tLObject, (TwoStepVerificationActivity) this.d, this.f14366b, 10));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new dg.t0((lx0) this.f14367c, tLObject, this.f14366b, (org.telegram.ui.ActionBar.d2) this.d, 15));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new hg.j((Object) ((dy) this.f14367c), tL_error, tLObject, (String) this.d, this.f14366b, 16));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new dg.t0((d60) this.f14367c, tLObject, (TLRPC.ChatFull) this.d, this.f14366b, 17));
                return;
            case 5:
                qh0 qh0Var = (qh0) this.f14367c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i10 = 0; i10 < tL_messages_exportedChatInvites.invites.size(); i10++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i10)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i10);
                                AndroidUtilities.runOnUIThread(new dh0(qh0Var, tL_chatInviteExported, tL_error, tLObject, this.f14366b, 0));
                                return;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                AndroidUtilities.runOnUIThread(new dh0(qh0Var, tL_chatInviteExported, tL_error, tLObject, this.f14366b, 0));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new hg.j((Object) ((lo0) this.f14367c), (TLObject) tL_error, this.f14366b, tLObject, (String) this.d, 18));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new dg.t0((qh.f1) this.f14367c, tLObject, (String) this.d, this.f14366b, 25));
                return;
            default:
                uf.k1 k1Var = (uf.k1) this.f14367c;
                String str = (String) this.d;
                a0.h hVar = k1Var.h;
                ArrayList arrayList = k1Var.f48659g;
                int i11 = k1Var.f48664m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    k1Var.f48665n = str.toLowerCase();
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
                        if (!this.f14366b && peerId == clientUserId) {
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
        this.f14365a = i10;
        this.f14367c = obj;
        this.f14366b = z4;
        this.d = obj2;
    }
}
