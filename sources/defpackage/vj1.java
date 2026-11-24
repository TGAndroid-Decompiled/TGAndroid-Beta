package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;
public final class vj1 implements RequestDelegate {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;

    public vj1(Object obj, Object obj2, boolean z, byte b) {
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
                gm.c3(new aa7((ik1) obj2, tL_error, tLObject, (TwoStepVerificationActivity) obj, this.b, (byte) 6));
                return;
            case 1:
                gm.c3(new rh((qd2) obj2, this.b, tLObject, (TL_phone.getGroupParticipants) obj, (byte) 12));
                return;
            case 2:
                gm.c3(new aa7((wj3) obj2, tL_error, tLObject, (String) obj, this.b, (byte) 8));
                return;
            case 3:
                gm.c3(new rh((ww3) obj2, tLObject, (String) obj, this.b, (byte) 16));
                return;
            case 4:
                gm.c3(new rh((g95) obj2, tLObject, (TLRPC.ChatFull) obj, this.b, (byte) 20));
                return;
            case 5:
                ak6 ak6Var = (ak6) obj2;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        while (i < tL_messages_exportedChatInvites.invites.size()) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i);
                                gm.c3(new oj6(ak6Var, tL_chatInviteExported, tL_error, tLObject, this.b, (byte) 0));
                                return;
                            }
                            i++;
                        }
                    }
                }
                tL_chatInviteExported = null;
                gm.c3(new oj6(ak6Var, tL_chatInviteExported, tL_error, tLObject, this.b, (byte) 0));
                return;
            case 6:
                gm.c3(new rh((hs6) obj2, tL_error, tLObject, (String) obj, this.b));
                return;
            case 7:
                gm.c3(new rh((hs6) obj2, tLObject, (SharedPreferences) obj, this.b, (byte) 27));
                return;
            case 8:
                oc7 oc7Var = (oc7) obj2;
                oc7Var.getClass();
                gm.c3(new rh(oc7Var, tLObject, this.b, (TLRPC.TL_contacts_getBlocked) obj, (byte) 29));
                return;
            case 9:
                gm.c3(new eb7((sb7) obj2, (int[]) obj, tLObject, this.b, (byte) 1));
                return;
            case 10:
                gm.c3(new aa7((p) obj2, tL_error, this.b, tLObject, (String) obj, (byte) 16));
                return;
            case 11:
                bu9 bu9Var = (bu9) obj2;
                String str = (String) obj;
                vh6 vh6Var = bu9Var.h;
                ArrayList arrayList = bu9Var.g;
                int i2 = bu9Var.m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    bu9Var.n = str.toLowerCase();
                    oc7.r1(i2).d4(tL_channels_channelParticipants.users, false);
                    oc7.r1(i2).X3(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    vh6Var.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long e = z8c.h(i2).e();
                    int size = tL_channels_channelParticipants.participants.size();
                    while (i < size) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i);
                        long B1 = k47.B1(channelParticipant.peer);
                        if (!this.b && B1 == e) {
                            arrayList.remove(channelParticipant);
                        } else {
                            vh6Var.k(channelParticipant, B1);
                        }
                        i++;
                    }
                    return;
                }
                return;
            case 12:
                gm.c3(new eb7((ava) obj2, (int[]) obj, tLObject, this.b, (byte) 14));
                return;
            default:
                gm.c3(new eb7((m2b) obj2, tLObject, this.b, (he) obj, (byte) 15));
                return;
        }
    }

    public vj1(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }
}
