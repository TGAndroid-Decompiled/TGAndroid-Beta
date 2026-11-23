package di;

import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.f40;
import org.telegram.ui.ff0;
import org.telegram.ui.ml0;
import org.telegram.ui.ow;
import org.telegram.ui.se0;
import org.telegram.ui.xd;
import org.telegram.ui.xn;
public final class o8 implements RequestDelegate {
    public final int f9456a;
    public final boolean f9457b;
    public final Object f9458c;
    public final Object d;

    public o8(Object obj, Object obj2, boolean z10, int i7) {
        this.f9456a = i7;
        this.f9458c = obj;
        this.d = obj2;
        this.f9457b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f9456a) {
            case 0:
                org.telegram.messenger.g0.g3(new aa.c0((p8) this.f9458c, (int[]) this.d, tLObject, this.f9457b, 1));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new aa.c0((hi.r1) this.f9458c, tLObject, (String) this.d, this.f9457b, 3));
                return;
            case 2:
                jg.z1 z1Var = (jg.z1) this.f9458c;
                String str = (String) this.d;
                a0.h hVar = z1Var.h;
                ArrayList arrayList = z1Var.f17726g;
                int i7 = z1Var.f17731m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    z1Var.f17732n = str.toLowerCase();
                    np.u1(i7).f4(tL_channels_channelParticipants.users, false);
                    np.u1(i7).Z3(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    hVar.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long e10 = k10.i(i7).e();
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                        long B1 = gj.B1(channelParticipant.peer);
                        if (!this.f9457b && B1 == e10) {
                            arrayList.remove(channelParticipant);
                        } else {
                            hVar.k(channelParticipant, B1);
                        }
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.g3(new ai.e((xd) this.f9458c, tL_error, tLObject, (TwoStepVerificationActivity) this.d, this.f9457b, 6));
                return;
            case 4:
                org.telegram.messenger.g0.g3(new xn((zv0) this.f9458c, tLObject, this.f9457b, (org.telegram.ui.ActionBar.t1) this.d));
                return;
            case 5:
                org.telegram.messenger.g0.g3(new ai.e((ow) this.f9458c, tL_error, tLObject, (String) this.d, this.f9457b));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new xn((Object) ((f40) this.f9458c), tLObject, (Object) ((TLRPC.ChatFull) this.d), this.f9457b, 8));
                return;
            case 7:
                ff0 ff0Var = (ff0) this.f9458c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i11 = 0; i11 < tL_messages_exportedChatInvites.invites.size(); i11++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i11)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i11);
                                org.telegram.messenger.g0.g3(new se0(ff0Var, tL_chatInviteExported, tL_error, tLObject, this.f9457b, 0));
                                return;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                org.telegram.messenger.g0.g3(new se0(ff0Var, tL_chatInviteExported, tL_error, tLObject, this.f9457b, 0));
                return;
            default:
                org.telegram.messenger.g0.g3(new ai.e((Object) ((ml0) this.f9458c), (TLObject) tL_error, this.f9457b, tLObject, (String) this.d, 14));
                return;
        }
    }

    public o8(Object obj, boolean z10, Object obj2, int i7) {
        this.f9456a = i7;
        this.f9458c = obj;
        this.f9457b = z10;
        this.d = obj2;
    }
}
