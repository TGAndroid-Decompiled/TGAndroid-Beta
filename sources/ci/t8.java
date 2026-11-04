package ci;

import java.util.ArrayList;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dl0;
import org.telegram.ui.gw;
import org.telegram.ui.le0;
import org.telegram.ui.rn;
import org.telegram.ui.x30;
import org.telegram.ui.xd;
import org.telegram.ui.xe0;
public final class t8 implements RequestDelegate {
    public final int f6041a;
    public final boolean f6042b;
    public final Object f6043c;
    public final Object d;

    public t8(Object obj, Object obj2, boolean z10, int i3) {
        this.f6041a = i3;
        this.f6043c = obj;
        this.d = obj2;
        this.f6042b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f6041a) {
            case 0:
                org.telegram.messenger.g0.h3(new u8((v8) this.f6043c, (int[]) this.d, tLObject, this.f6042b, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new u8((Object) ((gi.r1) this.f6043c), tLObject, (Object) ((String) this.d), this.f6042b, 2));
                return;
            case 2:
                kg.v1 v1Var = (kg.v1) this.f6043c;
                String str = (String) this.d;
                a0.h hVar = v1Var.h;
                ArrayList arrayList = v1Var.f17211g;
                int i3 = v1Var.f17216m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    v1Var.f17217n = str.toLowerCase();
                    hp.s1(i3).Y3(tL_channels_channelParticipants.users, false);
                    hp.s1(i3).S3(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    hVar.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long e10 = h10.i(i3).e();
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                        long C1 = zi.C1(channelParticipant.peer);
                        if (!this.f6042b && C1 == e10) {
                            arrayList.remove(channelParticipant);
                        } else {
                            hVar.k(channelParticipant, C1);
                        }
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.h3(new gi.q1((Object) ((xd) this.f6043c), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.d), this.f6042b, 5));
                return;
            case 4:
                org.telegram.messenger.g0.h3(new rn((mv0) this.f6043c, tLObject, this.f6042b, (org.telegram.ui.ActionBar.s1) this.d));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new gi.q1((Object) ((gw) this.f6043c), (Object) tL_error, tLObject, (Object) ((String) this.d), this.f6042b, 11));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new rn((Object) ((x30) this.f6043c), tLObject, (Object) ((TLRPC.ChatFull) this.d), this.f6042b, 8));
                return;
            case 7:
                xe0 xe0Var = (xe0) this.f6043c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i11 = 0; i11 < tL_messages_exportedChatInvites.invites.size(); i11++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i11)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i11);
                                org.telegram.messenger.g0.h3(new le0(xe0Var, tL_chatInviteExported, tL_error, tLObject, this.f6042b, 0));
                                return;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                org.telegram.messenger.g0.h3(new le0(xe0Var, tL_chatInviteExported, tL_error, tLObject, this.f6042b, 0));
                return;
            default:
                org.telegram.messenger.g0.h3(new gi.q1((dl0) this.f6043c, tL_error, this.f6042b, tLObject, (String) this.d));
                return;
        }
    }

    public t8(Object obj, boolean z10, Object obj2, int i3) {
        this.f6041a = i3;
        this.f6043c = obj;
        this.f6042b = z10;
        this.d = obj2;
    }
}
