package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sj implements RequestDelegate {
    public final int f17918a;
    public final vp f17919b;
    public final long f17920c;

    public sj(vp vpVar, long j10, int i10) {
        this.f17918a = i10;
        this.f17919b = vpVar;
        this.f17920c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17918a) {
            case 0:
                long j10 = this.f17920c;
                int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                vp vpVar = this.f17919b;
                if (i10 != 0) {
                    vpVar.getMessagesStorage().q1(j10);
                    return;
                } else {
                    vpVar.getClass();
                    return;
                }
            case 1:
                i0.g3(new zl(this.f17919b, this.f17920c, tLObject));
                return;
            case 2:
                boolean z10 = tLObject instanceof TLRPC.TL_channels_channelParticipants;
                vp vpVar2 = this.f17919b;
                if (z10) {
                    vpVar2.F3(this.f17920c, (TLRPC.TL_channels_channelParticipants) tLObject);
                    return;
                }
                vpVar2.getClass();
                return;
            case 3:
                vp vpVar3 = this.f17919b;
                vpVar3.getClass();
                if (tL_error == null) {
                    vpVar3.L3((TLRPC.Updates) tLObject, false);
                }
                long j11 = this.f17920c;
                if (j11 != 0) {
                    vpVar3.getMessagesStorage().q1(j11);
                    return;
                }
                return;
            case 4:
                vp vpVar4 = this.f17919b;
                vpVar4.getClass();
                if (tL_error == null) {
                    vpVar4.L3((TLRPC.Updates) tLObject, false);
                }
                long j12 = this.f17920c;
                if (j12 != 0) {
                    vpVar4.getMessagesStorage().q1(j12);
                    return;
                }
                return;
            case 5:
                vp vpVar5 = this.f17919b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    vpVar5.J3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                }
                long j13 = this.f17920c;
                if (j13 != 0) {
                    vpVar5.getMessagesStorage().q1(j13);
                    return;
                }
                return;
            case 6:
                long j14 = this.f17920c;
                int i11 = (j14 > 0L ? 1 : (j14 == 0L ? 0 : -1));
                vp vpVar6 = this.f17919b;
                if (i11 != 0) {
                    vpVar6.getMessagesStorage().q1(j14);
                    return;
                } else {
                    vpVar6.getClass();
                    return;
                }
            case 7:
                vp vpVar7 = this.f17919b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    vpVar7.J3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                }
                long j15 = this.f17920c;
                if (j15 != 0) {
                    vpVar7.getMessagesStorage().q1(j15);
                    return;
                }
                return;
            case 8:
                this.f17919b.getMessagesStorage().q1(this.f17920c);
                return;
            case 9:
                if (tL_error == null) {
                    i0.g3(new zl(this.f17919b, tLObject, this.f17920c));
                    return;
                }
                return;
            case 10:
                long j16 = this.f17920c;
                int i12 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
                vp vpVar8 = this.f17919b;
                if (i12 != 0) {
                    vpVar8.getMessagesStorage().q1(j16);
                    return;
                } else {
                    vpVar8.getClass();
                    return;
                }
            case 11:
                long j17 = this.f17920c;
                int i13 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
                vp vpVar9 = this.f17919b;
                if (i13 != 0) {
                    vpVar9.getMessagesStorage().q1(j17);
                    return;
                } else {
                    vpVar9.getClass();
                    return;
                }
            case 12:
                if (tLObject != null) {
                    TLRPC.TL_chatOnlines tL_chatOnlines = (TLRPC.TL_chatOnlines) tLObject;
                    vp vpVar10 = this.f17919b;
                    hs messagesStorage = vpVar10.getMessagesStorage();
                    int i14 = tL_chatOnlines.onlines;
                    r5 r5Var = messagesStorage.f15938a;
                    long j18 = this.f17920c;
                    r5Var.c(new gq(messagesStorage, i14, j18, 7));
                    i0.g3(new d4(vpVar10, j18, tL_chatOnlines, 19));
                    return;
                }
                return;
            case 13:
                vp vpVar11 = this.f17919b;
                vpVar11.getClass();
                if (tL_error == null) {
                    vpVar11.L3((TLRPC.Updates) tLObject, false);
                }
                long j19 = this.f17920c;
                if (j19 != 0) {
                    vpVar11.getMessagesStorage().q1(j19);
                    return;
                }
                return;
            case 14:
                if (tL_error == null) {
                    vp vpVar12 = this.f17919b;
                    vpVar12.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    i0.h3(new wk(vpVar12, this.f17920c, 20), 1000L);
                    return;
                }
                return;
            case 15:
                vp vpVar13 = this.f17919b;
                if (tL_error == null) {
                    vpVar13.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    i0.h3(new wk(vpVar13, this.f17920c, 19), 1000L);
                    return;
                }
                vpVar13.getClass();
                return;
            case 16:
                long j20 = this.f17920c;
                int i15 = (j20 > 0L ? 1 : (j20 == 0L ? 0 : -1));
                vp vpVar14 = this.f17919b;
                if (i15 != 0) {
                    vpVar14.getMessagesStorage().q1(j20);
                } else {
                    vpVar14.getClass();
                }
                if (tLObject != null) {
                    vpVar14.L3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                vp vpVar15 = this.f17919b;
                long j21 = this.f17920c;
                if (z11) {
                    long j22 = -j21;
                    if (vpVar15.M0(j22) == null) {
                        vpVar15.T2(0, j22, true);
                        return;
                    }
                    return;
                }
                vpVar15.getClass();
                if (tL_error != null && tL_error.code == 400) {
                    vpVar15.T2(0, -j21, true);
                    return;
                }
                return;
        }
    }
}
