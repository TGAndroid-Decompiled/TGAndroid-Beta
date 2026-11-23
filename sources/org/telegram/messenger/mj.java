package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mj implements RequestDelegate {
    public final int f25596a;
    public final np f25597b;
    public final long f25598c;

    public mj(np npVar, long j3, int i7) {
        this.f25596a = i7;
        this.f25597b = npVar;
        this.f25598c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25596a) {
            case 0:
                long j3 = this.f25598c;
                int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                np npVar = this.f25597b;
                if (i7 != 0) {
                    npVar.getMessagesStorage().q1(j3);
                    return;
                } else {
                    npVar.getClass();
                    return;
                }
            case 1:
                g0.g3(new hl(this.f25597b, this.f25598c, tLObject));
                return;
            case 2:
                boolean z10 = tLObject instanceof TLRPC.TL_channels_channelParticipants;
                np npVar2 = this.f25597b;
                if (z10) {
                    npVar2.P3(this.f25598c, (TLRPC.TL_channels_channelParticipants) tLObject);
                    return;
                }
                npVar2.getClass();
                return;
            case 3:
                np npVar3 = this.f25597b;
                npVar3.getClass();
                if (tL_error == null) {
                    npVar3.V3((TLRPC.Updates) tLObject, false);
                }
                long j10 = this.f25598c;
                if (j10 != 0) {
                    npVar3.getMessagesStorage().q1(j10);
                    return;
                }
                return;
            case 4:
                np npVar4 = this.f25597b;
                npVar4.getClass();
                if (tL_error == null) {
                    npVar4.V3((TLRPC.Updates) tLObject, false);
                }
                long j11 = this.f25598c;
                if (j11 != 0) {
                    npVar4.getMessagesStorage().q1(j11);
                    return;
                }
                return;
            case 5:
                np npVar5 = this.f25597b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    npVar5.T3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                }
                long j12 = this.f25598c;
                if (j12 != 0) {
                    npVar5.getMessagesStorage().q1(j12);
                    return;
                }
                return;
            case 6:
                long j13 = this.f25598c;
                int i10 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                np npVar6 = this.f25597b;
                if (i10 != 0) {
                    npVar6.getMessagesStorage().q1(j13);
                    return;
                } else {
                    npVar6.getClass();
                    return;
                }
            case 7:
                np npVar7 = this.f25597b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    npVar7.T3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                }
                long j14 = this.f25598c;
                if (j14 != 0) {
                    npVar7.getMessagesStorage().q1(j14);
                    return;
                }
                return;
            case 8:
                this.f25597b.getMessagesStorage().q1(this.f25598c);
                return;
            case 9:
                if (tL_error == null) {
                    g0.g3(new hl(this.f25597b, tLObject, this.f25598c));
                    return;
                }
                return;
            case 10:
                long j15 = this.f25598c;
                int i11 = (j15 > 0L ? 1 : (j15 == 0L ? 0 : -1));
                np npVar8 = this.f25597b;
                if (i11 != 0) {
                    npVar8.getMessagesStorage().q1(j15);
                    return;
                } else {
                    npVar8.getClass();
                    return;
                }
            case 11:
                long j16 = this.f25598c;
                int i12 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
                np npVar9 = this.f25597b;
                if (i12 != 0) {
                    npVar9.getMessagesStorage().q1(j16);
                    return;
                } else {
                    npVar9.getClass();
                    return;
                }
            case 12:
                if (tLObject != null) {
                    TLRPC.TL_chatOnlines tL_chatOnlines = (TLRPC.TL_chatOnlines) tLObject;
                    np npVar10 = this.f25597b;
                    ur messagesStorage = npVar10.getMessagesStorage();
                    int i13 = tL_chatOnlines.onlines;
                    q5 q5Var = messagesStorage.f27250a;
                    long j17 = this.f25598c;
                    q5Var.c(new wp(messagesStorage, i13, j17, 7));
                    g0.g3(new d4(npVar10, j17, tL_chatOnlines, 19));
                    return;
                }
                return;
            case 13:
                np npVar11 = this.f25597b;
                npVar11.getClass();
                if (tL_error == null) {
                    npVar11.V3((TLRPC.Updates) tLObject, false);
                }
                long j18 = this.f25598c;
                if (j18 != 0) {
                    npVar11.getMessagesStorage().q1(j18);
                    return;
                }
                return;
            case 14:
                if (tL_error == null) {
                    np npVar12 = this.f25597b;
                    npVar12.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    g0.h3(new jk(npVar12, this.f25598c, 21), 1000L);
                    return;
                }
                return;
            case 15:
                np npVar13 = this.f25597b;
                if (tL_error == null) {
                    npVar13.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    g0.h3(new jk(npVar13, this.f25598c, 19), 1000L);
                    return;
                }
                npVar13.getClass();
                return;
            case 16:
                long j19 = this.f25598c;
                int i14 = (j19 > 0L ? 1 : (j19 == 0L ? 0 : -1));
                np npVar14 = this.f25597b;
                if (i14 != 0) {
                    npVar14.getMessagesStorage().q1(j19);
                } else {
                    npVar14.getClass();
                }
                if (tLObject != null) {
                    npVar14.V3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                np npVar15 = this.f25597b;
                long j20 = this.f25598c;
                if (z11) {
                    long j21 = -j20;
                    if (npVar15.P0(j21) == null) {
                        npVar15.b3(0, j21, true);
                        return;
                    }
                    return;
                }
                npVar15.getClass();
                if (tL_error != null && tL_error.code == 400) {
                    npVar15.b3(0, -j20, true);
                    return;
                }
                return;
        }
    }
}
