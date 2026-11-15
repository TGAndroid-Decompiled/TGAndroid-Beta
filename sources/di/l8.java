package di;

import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c40;
import org.telegram.ui.cf0;
import org.telegram.ui.jl0;
import org.telegram.ui.lw;
import org.telegram.ui.qe0;
import org.telegram.ui.wn;
import org.telegram.ui.xd;
public final class l8 implements RequestDelegate {
    public final int f8992a;
    public final boolean f8993b;
    public final Object f8994c;
    public final Object d;

    public l8(Object obj, Object obj2, boolean z10, int i7) {
        this.f8992a = i7;
        this.f8994c = obj;
        this.d = obj2;
        this.f8993b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f8992a) {
            case 0:
                org.telegram.messenger.g0.h3(new aa.c0((m8) this.f8994c, (int[]) this.d, tLObject, this.f8993b, 1));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new aa.c0((hi.r1) this.f8994c, tLObject, (String) this.d, this.f8993b, 3));
                return;
            case 2:
                jg.z1 z1Var = (jg.z1) this.f8994c;
                String str = (String) this.d;
                a0.h hVar = z1Var.h;
                ArrayList arrayList = z1Var.f17349g;
                int i7 = z1Var.f17354m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    z1Var.f17355n = str.toLowerCase();
                    np.s1(i7).Y3(tL_channels_channelParticipants.users, false);
                    np.s1(i7).S3(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    hVar.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long e10 = m10.i(i7).e();
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                        long B1 = gj.B1(channelParticipant.peer);
                        if (!this.f8993b && B1 == e10) {
                            arrayList.remove(channelParticipant);
                        } else {
                            hVar.k(channelParticipant, B1);
                        }
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.h3(new ai.j((xd) this.f8994c, tL_error, tLObject, (TwoStepVerificationActivity) this.d, this.f8993b, 7));
                return;
            case 4:
                org.telegram.messenger.g0.h3(new wn((pv0) this.f8994c, tLObject, this.f8993b, (org.telegram.ui.ActionBar.t1) this.d));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new ai.j((lw) this.f8994c, tL_error, tLObject, (String) this.d, this.f8993b));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new wn((Object) ((c40) this.f8994c), tLObject, (Object) ((TLRPC.ChatFull) this.d), this.f8993b, 8));
                return;
            case 7:
                cf0 cf0Var = (cf0) this.f8994c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i11 = 0; i11 < tL_messages_exportedChatInvites.invites.size(); i11++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i11)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i11);
                                org.telegram.messenger.g0.h3(new qe0(cf0Var, tL_chatInviteExported, tL_error, tLObject, this.f8993b, 0));
                                return;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                org.telegram.messenger.g0.h3(new qe0(cf0Var, tL_chatInviteExported, tL_error, tLObject, this.f8993b, 0));
                return;
            default:
                org.telegram.messenger.g0.h3(new ai.j((Object) ((jl0) this.f8994c), (TLObject) tL_error, this.f8993b, tLObject, (String) this.d, 15));
                return;
        }
    }

    public l8(Object obj, boolean z10, Object obj2, int i7) {
        this.f8992a = i7;
        this.f8994c = obj;
        this.f8993b = z10;
        this.d = obj2;
    }
}
