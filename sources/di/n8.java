package di;

import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.f40;
import org.telegram.ui.ff0;
import org.telegram.ui.ml0;
import org.telegram.ui.ow;
import org.telegram.ui.se0;
import org.telegram.ui.xd;
import org.telegram.ui.yn;
public final class n8 implements RequestDelegate {
    public final int f9384a;
    public final boolean f9385b;
    public final Object f9386c;
    public final Object d;

    public n8(Object obj, Object obj2, boolean z10, int i7) {
        this.f9384a = i7;
        this.f9386c = obj;
        this.d = obj2;
        this.f9385b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f9384a) {
            case 0:
                org.telegram.messenger.g0.g3(new aa.c0((o8) this.f9386c, (int[]) this.d, tLObject, this.f9385b, 1));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new aa.c0((hi.s1) this.f9386c, tLObject, (String) this.d, this.f9385b, 3));
                return;
            case 2:
                jg.z1 z1Var = (jg.z1) this.f9386c;
                String str = (String) this.d;
                a0.h hVar = z1Var.h;
                ArrayList arrayList = z1Var.f17735g;
                int i7 = z1Var.f17740m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    z1Var.f17741n = str.toLowerCase();
                    mp.u1(i7).f4(tL_channels_channelParticipants.users, false);
                    mp.u1(i7).Z3(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    hVar.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long e10 = j10.i(i7).e();
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                        long B1 = fj.B1(channelParticipant.peer);
                        if (!this.f9385b && B1 == e10) {
                            arrayList.remove(channelParticipant);
                        } else {
                            hVar.k(channelParticipant, B1);
                        }
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.g3(new ai.n((xd) this.f9386c, tL_error, tLObject, (TwoStepVerificationActivity) this.d, this.f9385b, 6));
                return;
            case 4:
                org.telegram.messenger.g0.g3(new yn((xv0) this.f9386c, tLObject, this.f9385b, (org.telegram.ui.ActionBar.u1) this.d));
                return;
            case 5:
                org.telegram.messenger.g0.g3(new ai.n((ow) this.f9386c, tL_error, tLObject, (String) this.d, this.f9385b));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new yn((Object) ((f40) this.f9386c), tLObject, (Object) ((TLRPC.ChatFull) this.d), this.f9385b, 8));
                return;
            case 7:
                ff0 ff0Var = (ff0) this.f9386c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i11 = 0; i11 < tL_messages_exportedChatInvites.invites.size(); i11++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i11)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i11);
                                org.telegram.messenger.g0.g3(new se0(ff0Var, tL_chatInviteExported, tL_error, tLObject, this.f9385b, 0));
                                return;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                org.telegram.messenger.g0.g3(new se0(ff0Var, tL_chatInviteExported, tL_error, tLObject, this.f9385b, 0));
                return;
            default:
                org.telegram.messenger.g0.g3(new ai.n((Object) ((ml0) this.f9386c), (TLObject) tL_error, this.f9385b, tLObject, (String) this.d, 14));
                return;
        }
    }

    public n8(Object obj, boolean z10, Object obj2, int i7) {
        this.f9384a = i7;
        this.f9386c = obj;
        this.f9385b = z10;
        this.d = obj2;
    }
}
