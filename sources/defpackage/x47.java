package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x47 implements RequestDelegate {
    public final byte a;
    public final na7 b;
    public final long c;

    public x47(na7 na7Var, long j, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = j;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        long j = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                if (j != 0) {
                    na7Var.getMessagesStorage().n1(j);
                    return;
                } else {
                    na7Var.getClass();
                    return;
                }
            case 1:
                gl.d3(new w67(na7Var, j, tLObject));
                return;
            case 2:
                if (tLObject instanceof TLRPC.TL_channels_channelParticipants) {
                    na7Var.K3(j, (TLRPC.TL_channels_channelParticipants) tLObject);
                    return;
                }
                return;
            case 3:
                if (tL_error == null) {
                    na7Var.Q3((TLRPC.Updates) tLObject, false);
                }
                if (j != 0) {
                    na7Var.getMessagesStorage().n1(j);
                    return;
                }
                return;
            case 4:
                if (tL_error == null) {
                    na7Var.Q3((TLRPC.Updates) tLObject, false);
                }
                if (j != 0) {
                    na7Var.getMessagesStorage().n1(j);
                    return;
                }
                return;
            case 5:
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    na7Var.O3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                }
                if (j != 0) {
                    na7Var.getMessagesStorage().n1(j);
                    return;
                }
                return;
            case 6:
                if (j != 0) {
                    na7Var.getMessagesStorage().n1(j);
                    return;
                }
                return;
            case 7:
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    na7Var.O3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                }
                if (j != 0) {
                    na7Var.getMessagesStorage().n1(j);
                    return;
                }
                return;
            case 8:
                na7Var.getMessagesStorage().n1(j);
                return;
            case 9:
                if (tL_error == null) {
                    gl.d3(new w67(na7Var, tLObject, j));
                    return;
                }
                return;
            case 10:
                if (j != 0) {
                    na7Var.getMessagesStorage().n1(j);
                    return;
                } else {
                    na7Var.getClass();
                    return;
                }
            case 11:
                if (j != 0) {
                    na7Var.getMessagesStorage().n1(j);
                    return;
                }
                return;
            case 12:
                if (tL_error == null) {
                    na7Var.Q3((TLRPC.Updates) tLObject, false);
                }
                if (j != 0) {
                    na7Var.getMessagesStorage().n1(j);
                    return;
                }
                return;
            case 13:
                if (tLObject != null) {
                    TLRPC.TL_chatOnlines tL_chatOnlines = (TLRPC.TL_chatOnlines) tLObject;
                    na7 na7Var2 = this.b;
                    ad7 messagesStorage = na7Var2.getMessagesStorage();
                    int i = tL_chatOnlines.onlines;
                    co3 co3Var = messagesStorage.a;
                    long j2 = this.c;
                    co3Var.c(new bb7(messagesStorage, i, j2, (byte) 7));
                    gl.d3(new go6(na7Var2, j2, tL_chatOnlines, (byte) 2));
                    return;
                }
                return;
            case 14:
                if (tL_error == null) {
                    na7Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                    gl.e3(new r57(na7Var, j, (byte) 20), 1000L);
                    return;
                }
                return;
            case 15:
                if (tL_error == null) {
                    na7Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                    gl.e3(new r57(na7Var, j, (byte) 18), 1000L);
                    return;
                }
                na7Var.getClass();
                return;
            case 16:
                if (j != 0) {
                    na7Var.getMessagesStorage().n1(j);
                }
                if (tLObject != null) {
                    na7Var.Q3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j3 = -j;
                    if (na7Var.L0(j3) == null) {
                        na7Var.X2(0, j3, true);
                        return;
                    }
                    return;
                } else if (tL_error != null && tL_error.code == 400) {
                    na7Var.X2(0, -j, true);
                    return;
                } else {
                    return;
                }
        }
    }
}
