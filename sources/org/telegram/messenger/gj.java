package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gj implements RequestDelegate {
    public final int f22730a;
    public final hp f22731b;
    public final long f22732c;

    public gj(hp hpVar, long j10, int i3) {
        this.f22730a = i3;
        this.f22731b = hpVar;
        this.f22732c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22730a) {
            case 0:
                long j10 = this.f22732c;
                int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                hp hpVar = this.f22731b;
                if (i3 != 0) {
                    hpVar.getMessagesStorage().q1(j10);
                    return;
                } else {
                    hpVar.getClass();
                    return;
                }
            case 1:
                g0.h3(new rl(this.f22731b, this.f22732c, tLObject));
                return;
            case 2:
                boolean z10 = tLObject instanceof TLRPC.TL_channels_channelParticipants;
                hp hpVar2 = this.f22731b;
                if (z10) {
                    hpVar2.I3(this.f22732c, (TLRPC.TL_channels_channelParticipants) tLObject);
                    return;
                }
                hpVar2.getClass();
                return;
            case 3:
                hp hpVar3 = this.f22731b;
                hpVar3.getClass();
                if (tL_error == null) {
                    hpVar3.O3((TLRPC.Updates) tLObject, false);
                }
                long j11 = this.f22732c;
                if (j11 != 0) {
                    hpVar3.getMessagesStorage().q1(j11);
                    return;
                }
                return;
            case 4:
                hp hpVar4 = this.f22731b;
                hpVar4.getClass();
                if (tL_error == null) {
                    hpVar4.O3((TLRPC.Updates) tLObject, false);
                }
                long j12 = this.f22732c;
                if (j12 != 0) {
                    hpVar4.getMessagesStorage().q1(j12);
                    return;
                }
                return;
            case 5:
                hp hpVar5 = this.f22731b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    hpVar5.M3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                }
                long j13 = this.f22732c;
                if (j13 != 0) {
                    hpVar5.getMessagesStorage().q1(j13);
                    return;
                }
                return;
            case 6:
                long j14 = this.f22732c;
                int i10 = (j14 > 0L ? 1 : (j14 == 0L ? 0 : -1));
                hp hpVar6 = this.f22731b;
                if (i10 != 0) {
                    hpVar6.getMessagesStorage().q1(j14);
                    return;
                } else {
                    hpVar6.getClass();
                    return;
                }
            case 7:
                hp hpVar7 = this.f22731b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    hpVar7.M3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                }
                long j15 = this.f22732c;
                if (j15 != 0) {
                    hpVar7.getMessagesStorage().q1(j15);
                    return;
                }
                return;
            case 8:
                this.f22731b.getMessagesStorage().q1(this.f22732c);
                return;
            case 9:
                if (tL_error == null) {
                    g0.h3(new rl(this.f22731b, tLObject, this.f22732c));
                    return;
                }
                return;
            case 10:
                long j16 = this.f22732c;
                int i11 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
                hp hpVar8 = this.f22731b;
                if (i11 != 0) {
                    hpVar8.getMessagesStorage().q1(j16);
                    return;
                } else {
                    hpVar8.getClass();
                    return;
                }
            case 11:
                long j17 = this.f22732c;
                int i12 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
                hp hpVar9 = this.f22731b;
                if (i12 != 0) {
                    hpVar9.getMessagesStorage().q1(j17);
                    return;
                } else {
                    hpVar9.getClass();
                    return;
                }
            case 12:
                if (tLObject != null) {
                    TLRPC.TL_chatOnlines tL_chatOnlines = (TLRPC.TL_chatOnlines) tLObject;
                    hp hpVar10 = this.f22731b;
                    qr messagesStorage = hpVar10.getMessagesStorage();
                    int i13 = tL_chatOnlines.onlines;
                    p5 p5Var = messagesStorage.f24934a;
                    long j18 = this.f22732c;
                    p5Var.c(new rp(messagesStorage, i13, j18, 7));
                    g0.h3(new a4(hpVar10, j18, tL_chatOnlines, 16));
                    return;
                }
                return;
            case 13:
                hp hpVar11 = this.f22731b;
                hpVar11.getClass();
                if (tL_error == null) {
                    hpVar11.O3((TLRPC.Updates) tLObject, false);
                }
                long j19 = this.f22732c;
                if (j19 != 0) {
                    hpVar11.getMessagesStorage().q1(j19);
                    return;
                }
                return;
            case 14:
                if (tL_error == null) {
                    hp hpVar12 = this.f22731b;
                    hpVar12.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    g0.i3(new dk(hpVar12, this.f22732c, 18), 1000L);
                    return;
                }
                return;
            case 15:
                hp hpVar13 = this.f22731b;
                if (tL_error == null) {
                    hpVar13.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    g0.i3(new dk(hpVar13, this.f22732c, 20), 1000L);
                    return;
                }
                hpVar13.getClass();
                return;
            case 16:
                long j20 = this.f22732c;
                int i14 = (j20 > 0L ? 1 : (j20 == 0L ? 0 : -1));
                hp hpVar14 = this.f22731b;
                if (i14 != 0) {
                    hpVar14.getMessagesStorage().q1(j20);
                } else {
                    hpVar14.getClass();
                }
                if (tLObject != null) {
                    hpVar14.O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                hp hpVar15 = this.f22731b;
                long j21 = this.f22732c;
                if (z11) {
                    long j22 = -j21;
                    if (hpVar15.N0(j22) == null) {
                        hpVar15.V2(0, j22, true);
                        return;
                    }
                    return;
                }
                hpVar15.getClass();
                if (tL_error != null && tL_error.code == 400) {
                    hpVar15.V2(0, -j21, true);
                    return;
                }
                return;
        }
    }
}
