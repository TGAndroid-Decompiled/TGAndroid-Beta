package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x67 implements RequestDelegate {
    public final byte a;
    public final oc7 b;
    public final long c;

    public x67(oc7 oc7Var, long j, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = j;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        long j = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                if (j != 0) {
                    oc7Var.getMessagesStorage().n1(j);
                    return;
                } else {
                    oc7Var.getClass();
                    return;
                }
            case 1:
                gm.c3(new u87(oc7Var, j, tLObject));
                return;
            case 2:
                if (tLObject instanceof TLRPC.TL_channels_channelParticipants) {
                    oc7Var.N3(j, (TLRPC.TL_channels_channelParticipants) tLObject);
                    return;
                }
                return;
            case 3:
                if (tL_error == null) {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                }
                if (j != 0) {
                    oc7Var.getMessagesStorage().n1(j);
                    return;
                }
                return;
            case 4:
                if (tL_error == null) {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                }
                if (j != 0) {
                    oc7Var.getMessagesStorage().n1(j);
                    return;
                }
                return;
            case 5:
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    oc7Var.R3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                }
                if (j != 0) {
                    oc7Var.getMessagesStorage().n1(j);
                    return;
                }
                return;
            case 6:
                if (j != 0) {
                    oc7Var.getMessagesStorage().n1(j);
                    return;
                }
                return;
            case 7:
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    oc7Var.R3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                }
                if (j != 0) {
                    oc7Var.getMessagesStorage().n1(j);
                    return;
                }
                return;
            case 8:
                oc7Var.getMessagesStorage().n1(j);
                return;
            case 9:
                if (tL_error == null) {
                    gm.c3(new u87(oc7Var, tLObject, j));
                    return;
                }
                return;
            case 10:
                if (j != 0) {
                    oc7Var.getMessagesStorage().n1(j);
                    return;
                } else {
                    oc7Var.getClass();
                    return;
                }
            case 11:
                if (j != 0) {
                    oc7Var.getMessagesStorage().n1(j);
                    return;
                }
                return;
            case 12:
                if (tL_error == null) {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                }
                if (j != 0) {
                    oc7Var.getMessagesStorage().n1(j);
                    return;
                }
                return;
            case 13:
                if (tLObject != null) {
                    TLRPC.TL_chatOnlines tL_chatOnlines = (TLRPC.TL_chatOnlines) tLObject;
                    oc7 oc7Var2 = this.b;
                    cf7 messagesStorage = oc7Var2.getMessagesStorage();
                    int i = tL_chatOnlines.onlines;
                    mp3 mp3Var = messagesStorage.a;
                    long j2 = this.c;
                    mp3Var.c(new cd7(messagesStorage, i, j2, (byte) 7));
                    gm.c3(new hq6(oc7Var2, j2, tL_chatOnlines, (byte) 2));
                    return;
                }
                return;
            case 14:
                if (tL_error == null) {
                    oc7Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    gm.d3(new r77(oc7Var, j, (byte) 21), 1000L);
                    return;
                }
                return;
            case 15:
                if (tL_error == null) {
                    oc7Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    gm.d3(new r77(oc7Var, j, (byte) 20), 1000L);
                    return;
                }
                oc7Var.getClass();
                return;
            case 16:
                if (j != 0) {
                    oc7Var.getMessagesStorage().n1(j);
                }
                if (tLObject != null) {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j3 = -j;
                    if (oc7Var.M0(j3) == null) {
                        oc7Var.a3(0, j3, true);
                        return;
                    }
                    return;
                } else if (tL_error != null && tL_error.code == 400) {
                    oc7Var.a3(0, -j, true);
                    return;
                } else {
                    return;
                }
        }
    }
}
