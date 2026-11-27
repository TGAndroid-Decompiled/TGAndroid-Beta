package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e77 implements RequestDelegate {
    public final byte a;
    public final uc7 b;
    public final long c;

    public e77(uc7 uc7Var, long j, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = j;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        long j = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                if (tLObject instanceof TLRPC.TL_channels_channelParticipants) {
                    uc7Var.S3(j, (TLRPC.TL_channels_channelParticipants) tLObject);
                    return;
                }
                return;
            case 1:
                if (tL_error == null) {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                }
                if (j != 0) {
                    uc7Var.getMessagesStorage().r1(j);
                    return;
                }
                return;
            case 2:
                if (tL_error == null) {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                }
                if (j != 0) {
                    uc7Var.getMessagesStorage().r1(j);
                    return;
                }
                return;
            case 3:
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    uc7Var.W3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                }
                if (j != 0) {
                    uc7Var.getMessagesStorage().r1(j);
                    return;
                }
                return;
            case 4:
                if (j != 0) {
                    uc7Var.getMessagesStorage().r1(j);
                    return;
                }
                return;
            case 5:
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    uc7Var.W3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                }
                if (j != 0) {
                    uc7Var.getMessagesStorage().r1(j);
                    return;
                }
                return;
            case 6:
                if (tL_error == null) {
                    hl.c3(new v87(uc7Var, tLObject, j));
                    return;
                }
                return;
            case 7:
                if (j != 0) {
                    uc7Var.getMessagesStorage().r1(j);
                    return;
                } else {
                    uc7Var.getClass();
                    return;
                }
            case 8:
                if (j != 0) {
                    uc7Var.getMessagesStorage().r1(j);
                    return;
                } else {
                    uc7Var.getClass();
                    return;
                }
            case 9:
                if (j != 0) {
                    uc7Var.getMessagesStorage().r1(j);
                    return;
                }
                return;
            case 10:
                uc7Var.getMessagesStorage().r1(j);
                return;
            case 11:
                if (tL_error == null) {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                }
                if (j != 0) {
                    uc7Var.getMessagesStorage().r1(j);
                    return;
                }
                return;
            case 12:
                if (tLObject != null) {
                    TLRPC.TL_chatOnlines tL_chatOnlines = (TLRPC.TL_chatOnlines) tLObject;
                    uc7 uc7Var2 = this.b;
                    kf7 messagesStorage = uc7Var2.getMessagesStorage();
                    int i = tL_chatOnlines.onlines;
                    to3 to3Var = messagesStorage.a;
                    long j2 = this.c;
                    to3Var.c(new id7(messagesStorage, i, j2, (byte) 7));
                    hl.c3(new cq6(uc7Var2, j2, tL_chatOnlines, (byte) 2));
                    return;
                }
                return;
            case 13:
                if (tL_error == null) {
                    uc7Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    hl.d3(new t77(uc7Var, j, (byte) 21), 1000L);
                    return;
                }
                return;
            case 14:
                if (tL_error == null) {
                    uc7Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    hl.d3(new t77(uc7Var, j, (byte) 20), 1000L);
                    return;
                }
                uc7Var.getClass();
                return;
            case 15:
                if (j != 0) {
                    uc7Var.getMessagesStorage().r1(j);
                }
                if (tLObject != null) {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 16:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j3 = -j;
                    if (uc7Var.N0(j3) == null) {
                        uc7Var.e3(0, j3, true);
                        return;
                    }
                    return;
                } else if (tL_error != null && tL_error.code == 400) {
                    uc7Var.e3(0, -j, true);
                    return;
                } else {
                    return;
                }
            default:
                hl.c3(new v87(uc7Var, j, tLObject));
                return;
        }
    }
}
