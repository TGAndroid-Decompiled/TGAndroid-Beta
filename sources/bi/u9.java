package bi;

import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.e40;
import org.telegram.ui.ef0;
import org.telegram.ui.jl0;
import org.telegram.ui.lw;
import org.telegram.ui.se0;
import org.telegram.ui.xn;
public final class u9 implements RequestDelegate {
    public final int f4830a;
    public final boolean f4831b;
    public final Object f4832c;
    public final Object d;

    public u9(Object obj, Object obj2, boolean z9, int i7) {
        this.f4830a = i7;
        this.f4832c = obj;
        this.d = obj2;
        this.f4831b = z9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f4830a) {
            case 0:
                org.telegram.messenger.g0.h3(new aa.d0((v9) this.f4832c, (int[]) this.d, tLObject, this.f4831b, 1));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new aa.d0((fi.r1) this.f4832c, tLObject, (String) this.d, this.f4831b, 3));
                return;
            case 2:
                jg.z1 z1Var = (jg.z1) this.f4832c;
                String str = (String) this.d;
                a0.h hVar = z1Var.h;
                ArrayList arrayList = z1Var.f16997g;
                int i7 = z1Var.f17002m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    z1Var.f17003n = str.toLowerCase();
                    qp.s1(i7).Y3(tL_channels_channelParticipants.users, false);
                    qp.s1(i7).S3(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    hVar.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long e10 = p10.i(i7).e();
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                        long B1 = ij.B1(channelParticipant.peer);
                        if (!this.f4831b && B1 == e10) {
                            arrayList.remove(channelParticipant);
                        } else {
                            hVar.k(channelParticipant, B1);
                        }
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.h3(new fi.q1((Object) ((org.telegram.ui.zd) this.f4832c), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.d), this.f4831b, 5));
                return;
            case 4:
                org.telegram.messenger.g0.h3(new xn((ov0) this.f4832c, tLObject, this.f4831b, (org.telegram.ui.ActionBar.u1) this.d));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new fi.q1((Object) ((lw) this.f4832c), (Object) tL_error, tLObject, (Object) ((String) this.d), this.f4831b, 11));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new xn((Object) ((e40) this.f4832c), tLObject, (Object) ((TLRPC.ChatFull) this.d), this.f4831b, 8));
                return;
            case 7:
                ef0 ef0Var = (ef0) this.f4832c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i11 = 0; i11 < tL_messages_exportedChatInvites.invites.size(); i11++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i11)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i11);
                                org.telegram.messenger.g0.h3(new se0(ef0Var, tL_chatInviteExported, tL_error, tLObject, this.f4831b, 0));
                                return;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                org.telegram.messenger.g0.h3(new se0(ef0Var, tL_chatInviteExported, tL_error, tLObject, this.f4831b, 0));
                return;
            default:
                org.telegram.messenger.g0.h3(new fi.q1((jl0) this.f4832c, tL_error, this.f4831b, tLObject, (String) this.d));
                return;
        }
    }

    public u9(Object obj, boolean z9, Object obj2, int i7) {
        this.f4830a = i7;
        this.f4832c = obj;
        this.f4831b = z9;
        this.d = obj2;
    }
}
