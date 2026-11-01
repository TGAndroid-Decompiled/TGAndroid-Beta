package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tj implements RequestDelegate {
    public final int f18269a;
    public final wp f18270b;
    public final long f18271c;

    public tj(wp wpVar, long j10, int i10) {
        this.f18269a = i10;
        this.f18270b = wpVar;
        this.f18271c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18269a) {
            case 0:
                long j10 = this.f18271c;
                int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                wp wpVar = this.f18270b;
                if (i10 != 0) {
                    wpVar.getMessagesStorage().q1(j10);
                    return;
                } else {
                    wpVar.getClass();
                    return;
                }
            case 1:
                i0.g3(new am(this.f18270b, this.f18271c, tLObject));
                return;
            case 2:
                boolean z10 = tLObject instanceof TLRPC.TL_channels_channelParticipants;
                wp wpVar2 = this.f18270b;
                if (z10) {
                    wpVar2.F3(this.f18271c, (TLRPC.TL_channels_channelParticipants) tLObject);
                    return;
                }
                wpVar2.getClass();
                return;
            case 3:
                wp wpVar3 = this.f18270b;
                wpVar3.getClass();
                if (tL_error == null) {
                    wpVar3.L3((TLRPC.Updates) tLObject, false);
                }
                long j11 = this.f18271c;
                if (j11 != 0) {
                    wpVar3.getMessagesStorage().q1(j11);
                    return;
                }
                return;
            case 4:
                wp wpVar4 = this.f18270b;
                wpVar4.getClass();
                if (tL_error == null) {
                    wpVar4.L3((TLRPC.Updates) tLObject, false);
                }
                long j12 = this.f18271c;
                if (j12 != 0) {
                    wpVar4.getMessagesStorage().q1(j12);
                    return;
                }
                return;
            case 5:
                wp wpVar5 = this.f18270b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    wpVar5.J3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                }
                long j13 = this.f18271c;
                if (j13 != 0) {
                    wpVar5.getMessagesStorage().q1(j13);
                    return;
                }
                return;
            case 6:
                long j14 = this.f18271c;
                int i11 = (j14 > 0L ? 1 : (j14 == 0L ? 0 : -1));
                wp wpVar6 = this.f18270b;
                if (i11 != 0) {
                    wpVar6.getMessagesStorage().q1(j14);
                    return;
                } else {
                    wpVar6.getClass();
                    return;
                }
            case 7:
                wp wpVar7 = this.f18270b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    wpVar7.J3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                }
                long j15 = this.f18271c;
                if (j15 != 0) {
                    wpVar7.getMessagesStorage().q1(j15);
                    return;
                }
                return;
            case 8:
                this.f18270b.getMessagesStorage().q1(this.f18271c);
                return;
            case 9:
                if (tL_error == null) {
                    i0.g3(new am(this.f18270b, tLObject, this.f18271c));
                    return;
                }
                return;
            case 10:
                long j16 = this.f18271c;
                int i12 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
                wp wpVar8 = this.f18270b;
                if (i12 != 0) {
                    wpVar8.getMessagesStorage().q1(j16);
                    return;
                } else {
                    wpVar8.getClass();
                    return;
                }
            case 11:
                long j17 = this.f18271c;
                int i13 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
                wp wpVar9 = this.f18270b;
                if (i13 != 0) {
                    wpVar9.getMessagesStorage().q1(j17);
                    return;
                } else {
                    wpVar9.getClass();
                    return;
                }
            case 12:
                if (tLObject != null) {
                    TLRPC.TL_chatOnlines tL_chatOnlines = (TLRPC.TL_chatOnlines) tLObject;
                    wp wpVar10 = this.f18270b;
                    is messagesStorage = wpVar10.getMessagesStorage();
                    int i14 = tL_chatOnlines.onlines;
                    r5 r5Var = messagesStorage.f16331a;
                    long j18 = this.f18271c;
                    r5Var.c(new hq(messagesStorage, i14, j18, 7));
                    i0.g3(new d4(wpVar10, j18, tL_chatOnlines, 19));
                    return;
                }
                return;
            case 13:
                wp wpVar11 = this.f18270b;
                wpVar11.getClass();
                if (tL_error == null) {
                    wpVar11.L3((TLRPC.Updates) tLObject, false);
                }
                long j19 = this.f18271c;
                if (j19 != 0) {
                    wpVar11.getMessagesStorage().q1(j19);
                    return;
                }
                return;
            case 14:
                if (tL_error == null) {
                    wp wpVar12 = this.f18270b;
                    wpVar12.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    i0.h3(new xk(wpVar12, this.f18271c, 20), 1000L);
                    return;
                }
                return;
            case 15:
                wp wpVar13 = this.f18270b;
                if (tL_error == null) {
                    wpVar13.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    i0.h3(new xk(wpVar13, this.f18271c, 19), 1000L);
                    return;
                }
                wpVar13.getClass();
                return;
            case 16:
                long j20 = this.f18271c;
                int i15 = (j20 > 0L ? 1 : (j20 == 0L ? 0 : -1));
                wp wpVar14 = this.f18270b;
                if (i15 != 0) {
                    wpVar14.getMessagesStorage().q1(j20);
                } else {
                    wpVar14.getClass();
                }
                if (tLObject != null) {
                    wpVar14.L3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                wp wpVar15 = this.f18270b;
                long j21 = this.f18271c;
                if (z11) {
                    long j22 = -j21;
                    if (wpVar15.M0(j22) == null) {
                        wpVar15.T2(0, j22, true);
                        return;
                    }
                    return;
                }
                wpVar15.getClass();
                if (tL_error != null && tL_error.code == 400) {
                    wpVar15.T2(0, -j21, true);
                    return;
                }
                return;
        }
    }
}
