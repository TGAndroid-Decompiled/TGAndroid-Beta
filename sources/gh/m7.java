package gh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.co0;
import org.telegram.ui.fe;
import org.telegram.ui.hh0;
import org.telegram.ui.o50;
import org.telegram.ui.qx;
import org.telegram.ui.ug0;
public final class m7 implements RequestDelegate {
    public final int f8571a;
    public final boolean f8572b;
    public final Object f8573c;
    public final Object d;

    public m7(Object obj, Object obj2, boolean z10, int i9) {
        this.f8571a = i9;
        this.f8573c = obj;
        this.d = obj2;
        this.f8572b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f8571a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bg.d((n7) this.f8573c, (int[]) this.d, tLObject, this.f8572b, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new bg.d((kh.u1) this.f8573c, tLObject, (String) this.d, this.f8572b, 3));
                return;
            case 2:
                of.v1 v1Var = (of.v1) this.f8573c;
                String str = (String) this.d;
                a0.h hVar = v1Var.h;
                ArrayList arrayList = v1Var.f19529g;
                int i9 = v1Var.f19534m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    v1Var.f19535n = str.toLowerCase();
                    MessagesController.getInstance(i9).putUsers(tL_channels_channelParticipants.users, false);
                    MessagesController.getInstance(i9).putChats(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    hVar.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long clientUserId = UserConfig.getInstance(i9).getClientUserId();
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                        long peerId = MessageObject.getPeerId(channelParticipant.peer);
                        if (!this.f8572b && peerId == clientUserId) {
                            arrayList.remove(channelParticipant);
                        } else {
                            hVar.k(channelParticipant, peerId);
                        }
                    }
                    return;
                }
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new bg.m((fe) this.f8573c, tL_error, tLObject, (TwoStepVerificationActivity) this.d, this.f8572b, 12));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new bg.d((rw0) this.f8573c, tLObject, this.f8572b, (org.telegram.ui.ActionBar.c2) this.d, 17));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new bg.m((Object) ((qx) this.f8573c), tL_error, tLObject, (String) this.d, this.f8572b, 18));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new bg.d((o50) this.f8573c, tLObject, (TLRPC.ChatFull) this.d, this.f8572b, 19));
                return;
            case 7:
                hh0 hh0Var = (hh0) this.f8573c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i11 = 0; i11 < tL_messages_exportedChatInvites.invites.size(); i11++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i11)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i11);
                                AndroidUtilities.runOnUIThread(new ug0(hh0Var, tL_chatInviteExported, tL_error, tLObject, this.f8572b, 0));
                                return;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                AndroidUtilities.runOnUIThread(new ug0(hh0Var, tL_chatInviteExported, tL_error, tLObject, this.f8572b, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new bg.m((Object) ((co0) this.f8573c), (TLObject) tL_error, this.f8572b, tLObject, (String) this.d, 20));
                return;
        }
    }

    public m7(Object obj, boolean z10, Object obj2, int i9) {
        this.f8571a = i9;
        this.f8573c = obj;
        this.f8572b = z10;
        this.d = obj2;
    }
}
