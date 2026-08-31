package mh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mx0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.d60;
import org.telegram.ui.dh0;
import org.telegram.ui.dy;
import org.telegram.ui.ke;
import org.telegram.ui.lo0;
import org.telegram.ui.qh0;
public final class k7 implements RequestDelegate {
    public final int f14363a;
    public final boolean f14364b;
    public final Object f14365c;
    public final Object d;

    public k7(Object obj, Object obj2, boolean z4, int i10) {
        this.f14363a = i10;
        this.f14365c = obj;
        this.d = obj2;
        this.f14364b = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f14363a) {
            case 0:
                AndroidUtilities.runOnUIThread(new dg.t0((l7) this.f14365c, (int[]) this.d, tLObject, this.f14364b, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new hg.j((ke) this.f14365c, tL_error, tLObject, (TwoStepVerificationActivity) this.d, this.f14364b, 10));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new dg.t0((mx0) this.f14365c, tLObject, this.f14364b, (org.telegram.ui.ActionBar.d2) this.d, 15));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new hg.j((Object) ((dy) this.f14365c), tL_error, tLObject, (String) this.d, this.f14364b, 16));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new dg.t0((d60) this.f14365c, tLObject, (TLRPC.ChatFull) this.d, this.f14364b, 17));
                return;
            case 5:
                qh0 qh0Var = (qh0) this.f14365c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i10 = 0; i10 < tL_messages_exportedChatInvites.invites.size(); i10++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i10)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i10);
                                AndroidUtilities.runOnUIThread(new dh0(qh0Var, tL_chatInviteExported, tL_error, tLObject, this.f14364b, 0));
                                return;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                AndroidUtilities.runOnUIThread(new dh0(qh0Var, tL_chatInviteExported, tL_error, tLObject, this.f14364b, 0));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new hg.j((Object) ((lo0) this.f14365c), (TLObject) tL_error, this.f14364b, tLObject, (String) this.d, 18));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new dg.t0((qh.g1) this.f14365c, tLObject, (String) this.d, this.f14364b, 25));
                return;
            default:
                uf.k1 k1Var = (uf.k1) this.f14365c;
                String str = (String) this.d;
                a0.h hVar = k1Var.h;
                ArrayList arrayList = k1Var.f48623g;
                int i11 = k1Var.f48628m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    k1Var.f48629n = str.toLowerCase();
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
                        if (!this.f14364b && peerId == clientUserId) {
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
        this.f14363a = i10;
        this.f14365c = obj;
        this.f14364b = z4;
        this.d = obj2;
    }
}
