package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lj implements RequestDelegate {
    public final int f25418a;
    public final mp f25419b;
    public final long f25420c;

    public lj(mp mpVar, long j3, int i7) {
        this.f25418a = i7;
        this.f25419b = mpVar;
        this.f25420c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25418a) {
            case 0:
                long j3 = this.f25420c;
                int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                mp mpVar = this.f25419b;
                if (i7 != 0) {
                    mpVar.getMessagesStorage().q1(j3);
                    return;
                } else {
                    mpVar.getClass();
                    return;
                }
            case 1:
                g0.g3(new gl(this.f25419b, this.f25420c, tLObject));
                return;
            case 2:
                boolean z10 = tLObject instanceof TLRPC.TL_channels_channelParticipants;
                mp mpVar2 = this.f25419b;
                if (z10) {
                    mpVar2.P3(this.f25420c, (TLRPC.TL_channels_channelParticipants) tLObject);
                    return;
                }
                mpVar2.getClass();
                return;
            case 3:
                mp mpVar3 = this.f25419b;
                mpVar3.getClass();
                if (tL_error == null) {
                    mpVar3.V3((TLRPC.Updates) tLObject, false);
                }
                long j10 = this.f25420c;
                if (j10 != 0) {
                    mpVar3.getMessagesStorage().q1(j10);
                    return;
                }
                return;
            case 4:
                mp mpVar4 = this.f25419b;
                mpVar4.getClass();
                if (tL_error == null) {
                    mpVar4.V3((TLRPC.Updates) tLObject, false);
                }
                long j11 = this.f25420c;
                if (j11 != 0) {
                    mpVar4.getMessagesStorage().q1(j11);
                    return;
                }
                return;
            case 5:
                mp mpVar5 = this.f25419b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    mpVar5.T3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                }
                long j12 = this.f25420c;
                if (j12 != 0) {
                    mpVar5.getMessagesStorage().q1(j12);
                    return;
                }
                return;
            case 6:
                long j13 = this.f25420c;
                int i10 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                mp mpVar6 = this.f25419b;
                if (i10 != 0) {
                    mpVar6.getMessagesStorage().q1(j13);
                    return;
                } else {
                    mpVar6.getClass();
                    return;
                }
            case 7:
                mp mpVar7 = this.f25419b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    mpVar7.T3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                }
                long j14 = this.f25420c;
                if (j14 != 0) {
                    mpVar7.getMessagesStorage().q1(j14);
                    return;
                }
                return;
            case 8:
                this.f25419b.getMessagesStorage().q1(this.f25420c);
                return;
            case 9:
                if (tL_error == null) {
                    g0.g3(new gl(this.f25419b, tLObject, this.f25420c));
                    return;
                }
                return;
            case 10:
                long j15 = this.f25420c;
                int i11 = (j15 > 0L ? 1 : (j15 == 0L ? 0 : -1));
                mp mpVar8 = this.f25419b;
                if (i11 != 0) {
                    mpVar8.getMessagesStorage().q1(j15);
                    return;
                } else {
                    mpVar8.getClass();
                    return;
                }
            case 11:
                long j16 = this.f25420c;
                int i12 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
                mp mpVar9 = this.f25419b;
                if (i12 != 0) {
                    mpVar9.getMessagesStorage().q1(j16);
                    return;
                } else {
                    mpVar9.getClass();
                    return;
                }
            case 12:
                if (tLObject != null) {
                    TLRPC.TL_chatOnlines tL_chatOnlines = (TLRPC.TL_chatOnlines) tLObject;
                    mp mpVar10 = this.f25419b;
                    tr messagesStorage = mpVar10.getMessagesStorage();
                    int i13 = tL_chatOnlines.onlines;
                    q5 q5Var = messagesStorage.f27080a;
                    long j17 = this.f25420c;
                    q5Var.c(new vp(messagesStorage, i13, j17, 7));
                    g0.g3(new d4(mpVar10, j17, tL_chatOnlines, 19));
                    return;
                }
                return;
            case 13:
                mp mpVar11 = this.f25419b;
                mpVar11.getClass();
                if (tL_error == null) {
                    mpVar11.V3((TLRPC.Updates) tLObject, false);
                }
                long j18 = this.f25420c;
                if (j18 != 0) {
                    mpVar11.getMessagesStorage().q1(j18);
                    return;
                }
                return;
            case 14:
                if (tL_error == null) {
                    mp mpVar12 = this.f25419b;
                    mpVar12.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    g0.h3(new ik(mpVar12, this.f25420c, 21), 1000L);
                    return;
                }
                return;
            case 15:
                mp mpVar13 = this.f25419b;
                if (tL_error == null) {
                    mpVar13.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    g0.h3(new ik(mpVar13, this.f25420c, 19), 1000L);
                    return;
                }
                mpVar13.getClass();
                return;
            case 16:
                long j19 = this.f25420c;
                int i14 = (j19 > 0L ? 1 : (j19 == 0L ? 0 : -1));
                mp mpVar14 = this.f25419b;
                if (i14 != 0) {
                    mpVar14.getMessagesStorage().q1(j19);
                } else {
                    mpVar14.getClass();
                }
                if (tLObject != null) {
                    mpVar14.V3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                mp mpVar15 = this.f25419b;
                long j20 = this.f25420c;
                if (z11) {
                    long j21 = -j20;
                    if (mpVar15.P0(j21) == null) {
                        mpVar15.b3(0, j21, true);
                        return;
                    }
                    return;
                }
                mpVar15.getClass();
                if (tL_error != null && tL_error.code == 400) {
                    mpVar15.b3(0, -j20, true);
                    return;
                }
                return;
        }
    }
}
