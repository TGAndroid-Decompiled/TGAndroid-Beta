package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;
public final class mi1 implements RequestDelegate {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;

    public mi1(Object obj, Object obj2, boolean z, byte b) {
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
                gl.d3(new z77((zi1) obj2, tL_error, tLObject, (TwoStepVerificationActivity) obj, this.b, (byte) 6));
                return;
            case 1:
                gl.d3(new qg((fc2) obj2, this.b, tLObject, (TL_phone.getGroupParticipants) obj, (byte) 12));
                return;
            case 2:
                gl.d3(new z77((mi3) obj2, tL_error, tLObject, (String) obj, this.b, (byte) 8));
                return;
            case 3:
                gl.d3(new qg((lv3) obj2, tLObject, (String) obj, this.b, (byte) 16));
                return;
            case 4:
                gl.d3(new qg((h75) obj2, tLObject, (TLRPC.ChatFull) obj, this.b, (byte) 20));
                return;
            case 5:
                yh6 yh6Var = (yh6) obj2;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        while (i < tL_messages_exportedChatInvites.invites.size()) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i);
                                gl.d3(new lh6(yh6Var, tL_chatInviteExported, tL_error, tLObject, this.b, (byte) 0));
                                return;
                            }
                            i++;
                        }
                    }
                }
                tL_chatInviteExported = null;
                gl.d3(new lh6(yh6Var, tL_chatInviteExported, tL_error, tLObject, this.b, (byte) 0));
                return;
            case 6:
                gl.d3(new qg((hq6) obj2, tL_error, tLObject, (String) obj, this.b));
                return;
            case 7:
                gl.d3(new qg((hq6) obj2, tLObject, (SharedPreferences) obj, this.b, (byte) 27));
                return;
            case 8:
                na7 na7Var = (na7) obj2;
                na7Var.getClass();
                gl.d3(new qg(na7Var, tLObject, this.b, (TLRPC.TL_contacts_getBlocked) obj, (byte) 29));
                return;
            case 9:
                gl.d3(new d97((r97) obj2, (int[]) obj, tLObject, this.b, (byte) 1));
                return;
            case 10:
                gl.d3(new z77((p) obj2, tL_error, this.b, tLObject, (String) obj, (byte) 16));
                return;
            case 11:
                zr9 zr9Var = (zr9) obj2;
                String str = (String) obj;
                vf6 vf6Var = zr9Var.h;
                ArrayList arrayList = zr9Var.g;
                int i2 = zr9Var.m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    zr9Var.n = str.toLowerCase();
                    na7.q1(i2).a4(tL_channels_channelParticipants.users, false);
                    na7.q1(i2).U3(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    vf6Var.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long e = y6c.h(i2).e();
                    int size = tL_channels_channelParticipants.participants.size();
                    while (i < size) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i);
                        long B1 = k27.B1(channelParticipant.peer);
                        if (!this.b && B1 == e) {
                            arrayList.remove(channelParticipant);
                        } else {
                            vf6Var.k(channelParticipant, B1);
                        }
                        i++;
                    }
                    return;
                }
                return;
            case 12:
                gl.d3(new d97((xsa) obj2, (int[]) obj, tLObject, this.b, (byte) 14));
                return;
            default:
                gl.d3(new d97((j0b) obj2, tLObject, this.b, (hd) obj, (byte) 15));
                return;
        }
    }

    public mi1(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }
}
