package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pj implements RequestDelegate {
    public final int f24567a;
    public final qp f24568b;
    public final long f24569c;

    public pj(qp qpVar, long j3, int i7) {
        this.f24567a = i7;
        this.f24568b = qpVar;
        this.f24569c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24567a) {
            case 0:
                long j3 = this.f24569c;
                int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                qp qpVar = this.f24568b;
                if (i7 != 0) {
                    qpVar.getMessagesStorage().q1(j3);
                    return;
                } else {
                    qpVar.getClass();
                    return;
                }
            case 1:
                g0.h3(new bm(this.f24568b, this.f24569c, tLObject));
                return;
            case 2:
                boolean z9 = tLObject instanceof TLRPC.TL_channels_channelParticipants;
                qp qpVar2 = this.f24568b;
                if (z9) {
                    qpVar2.I3(this.f24569c, (TLRPC.TL_channels_channelParticipants) tLObject);
                    return;
                }
                qpVar2.getClass();
                return;
            case 3:
                qp qpVar3 = this.f24568b;
                qpVar3.getClass();
                if (tL_error == null) {
                    qpVar3.O3((TLRPC.Updates) tLObject, false);
                }
                long j10 = this.f24569c;
                if (j10 != 0) {
                    qpVar3.getMessagesStorage().q1(j10);
                    return;
                }
                return;
            case 4:
                qp qpVar4 = this.f24568b;
                qpVar4.getClass();
                if (tL_error == null) {
                    qpVar4.O3((TLRPC.Updates) tLObject, false);
                }
                long j11 = this.f24569c;
                if (j11 != 0) {
                    qpVar4.getMessagesStorage().q1(j11);
                    return;
                }
                return;
            case 5:
                qp qpVar5 = this.f24568b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    qpVar5.M3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                }
                long j12 = this.f24569c;
                if (j12 != 0) {
                    qpVar5.getMessagesStorage().q1(j12);
                    return;
                }
                return;
            case 6:
                long j13 = this.f24569c;
                int i10 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                qp qpVar6 = this.f24568b;
                if (i10 != 0) {
                    qpVar6.getMessagesStorage().q1(j13);
                    return;
                } else {
                    qpVar6.getClass();
                    return;
                }
            case 7:
                qp qpVar7 = this.f24568b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    qpVar7.M3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                }
                long j14 = this.f24569c;
                if (j14 != 0) {
                    qpVar7.getMessagesStorage().q1(j14);
                    return;
                }
                return;
            case 8:
                this.f24568b.getMessagesStorage().q1(this.f24569c);
                return;
            case 9:
                if (tL_error == null) {
                    g0.h3(new bm(this.f24568b, tLObject, this.f24569c));
                    return;
                }
                return;
            case 10:
                long j15 = this.f24569c;
                int i11 = (j15 > 0L ? 1 : (j15 == 0L ? 0 : -1));
                qp qpVar8 = this.f24568b;
                if (i11 != 0) {
                    qpVar8.getMessagesStorage().q1(j15);
                    return;
                } else {
                    qpVar8.getClass();
                    return;
                }
            case 11:
                long j16 = this.f24569c;
                int i12 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
                qp qpVar9 = this.f24568b;
                if (i12 != 0) {
                    qpVar9.getMessagesStorage().q1(j16);
                    return;
                } else {
                    qpVar9.getClass();
                    return;
                }
            case 12:
                if (tLObject != null) {
                    TLRPC.TL_chatOnlines tL_chatOnlines = (TLRPC.TL_chatOnlines) tLObject;
                    qp qpVar10 = this.f24568b;
                    yr messagesStorage = qpVar10.getMessagesStorage();
                    int i13 = tL_chatOnlines.onlines;
                    p5 p5Var = messagesStorage.f26696a;
                    long j17 = this.f24569c;
                    p5Var.c(new aq(messagesStorage, i13, j17, 7));
                    g0.h3(new a4(qpVar10, j17, tL_chatOnlines, 16));
                    return;
                }
                return;
            case 13:
                qp qpVar11 = this.f24568b;
                qpVar11.getClass();
                if (tL_error == null) {
                    qpVar11.O3((TLRPC.Updates) tLObject, false);
                }
                long j18 = this.f24569c;
                if (j18 != 0) {
                    qpVar11.getMessagesStorage().q1(j18);
                    return;
                }
                return;
            case 14:
                if (tL_error == null) {
                    qp qpVar12 = this.f24568b;
                    qpVar12.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    g0.i3(new nk(qpVar12, this.f24569c, 18), 1000L);
                    return;
                }
                return;
            case 15:
                qp qpVar13 = this.f24568b;
                if (tL_error == null) {
                    qpVar13.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    g0.i3(new nk(qpVar13, this.f24569c, 20), 1000L);
                    return;
                }
                qpVar13.getClass();
                return;
            case 16:
                long j19 = this.f24569c;
                int i14 = (j19 > 0L ? 1 : (j19 == 0L ? 0 : -1));
                qp qpVar14 = this.f24568b;
                if (i14 != 0) {
                    qpVar14.getMessagesStorage().q1(j19);
                } else {
                    qpVar14.getClass();
                }
                if (tLObject != null) {
                    qpVar14.O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                qp qpVar15 = this.f24568b;
                long j20 = this.f24569c;
                if (z10) {
                    long j21 = -j20;
                    if (qpVar15.N0(j21) == null) {
                        qpVar15.V2(0, j21, true);
                        return;
                    }
                    return;
                }
                qpVar15.getClass();
                if (tL_error != null && tL_error.code == 400) {
                    qpVar15.V2(0, -j20, true);
                    return;
                }
                return;
        }
    }
}
