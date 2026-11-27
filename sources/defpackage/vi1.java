package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;
public final class vi1 implements RequestDelegate {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;

    public vi1(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        byte b = this.a;
        int i = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                hl.c3(new va7((ij1) obj2, tL_error, tLObject, (TwoStepVerificationActivity) obj, this.b, (byte) 6));
                return;
            case 1:
                hl.c3(new lg((vc2) obj2, this.b, tLObject, (TL_phone.getGroupParticipants) obj, (byte) 12));
                return;
            case 2:
                hl.c3(new va7((fj3) obj2, tL_error, tLObject, (String) obj, this.b, (byte) 8));
                return;
            case 3:
                hl.c3(new lg((fw3) obj2, tLObject, (String) obj, this.b, (byte) 16));
                return;
            case 4:
                hl.c3(new lg((j95) obj2, tLObject, (TLRPC.ChatFull) obj, this.b, (byte) 20));
                return;
            case 5:
                ck6 ck6Var = (ck6) obj2;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        while (i < tL_messages_exportedChatInvites.invites.size()) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i);
                                hl.c3(new rj6(ck6Var, tL_chatInviteExported, tL_error, tLObject, this.b, (byte) 0));
                                return;
                            }
                            i++;
                        }
                    }
                }
                tL_chatInviteExported = null;
                hl.c3(new rj6(ck6Var, tL_chatInviteExported, tL_error, tLObject, this.b, (byte) 0));
                return;
            case 6:
                hl.c3(new lg((ls6) obj2, tL_error, tLObject, (String) obj, this.b));
                return;
            case 7:
                hl.c3(new lg((ls6) obj2, tLObject, (SharedPreferences) obj, this.b, (byte) 27));
                return;
            case 8:
                uc7 uc7Var = (uc7) obj2;
                uc7Var.getClass();
                hl.c3(new lg(uc7Var, tLObject, this.b, (TLRPC.TL_contacts_getBlocked) obj, (byte) 29));
                return;
            case 9:
                hl.c3(new lb7((yb7) obj2, (int[]) obj, tLObject, this.b, (byte) 1));
                return;
            case 10:
                hl.c3(new va7((p) obj2, tL_error, this.b, tLObject, (String) obj, (byte) 16));
                return;
            case 11:
                sv9 sv9Var = (sv9) obj2;
                String str = (String) obj;
                zh6 zh6Var = sv9Var.h;
                ArrayList arrayList = sv9Var.g;
                int i2 = sv9Var.m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    sv9Var.n = str.toLowerCase();
                    uc7.s1(i2).j4(tL_channels_channelParticipants.users, false);
                    uc7.s1(i2).c4(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    zh6Var.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long e = yac.h(i2).e();
                    int size = tL_channels_channelParticipants.participants.size();
                    while (i < size) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i);
                        long B1 = r47.B1(channelParticipant.peer);
                        if (!this.b && B1 == e) {
                            arrayList.remove(channelParticipant);
                        } else {
                            zh6Var.k(B1, channelParticipant);
                        }
                        i++;
                    }
                    return;
                }
                return;
            case 12:
                hl.c3(new lb7((axa) obj2, (int[]) obj, tLObject, this.b, (byte) 14));
                return;
            default:
                hl.c3(new lb7((h4b) obj2, tLObject, this.b, (id) obj, (byte) 15));
                return;
        }
    }

    public vi1(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }
}
