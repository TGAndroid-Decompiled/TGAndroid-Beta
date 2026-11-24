package defpackage;

import org.telegram.tgnet.TLRPC;
public final class u92 implements ee, xe7, lc6, ue7 {
    public final byte a;
    public final ba2 b;

    public u92(ba2 ba2Var, byte b) {
        this.a = b;
        this.b = ba2Var;
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        ba2 ba2Var = this.b;
        TLRPC.ChatFull chatFull = ba2Var.y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        ba2Var.u0(false, true);
        ba2Var.getMessagesController().a3(0, ba2Var.w0, true);
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        ba2 ba2Var = this.b;
        switch (b) {
            case 0:
                ba2Var.o0();
                return;
            case 1:
                ba2Var.finishFragment();
                return;
            case 2:
                ba2Var.o0();
                return;
            default:
                ba2Var.finishFragment();
                return;
        }
    }

    @Override
    public final void run(long j) {
        byte b = this.a;
        ba2 ba2Var = this.b;
        switch (b) {
            case 4:
                ba2Var.y0(Long.valueOf(j));
                return;
            default:
                if (j == 0) {
                    ba2Var.O0 = false;
                    return;
                }
                ba2Var.w0 = j;
                ba2Var.x0 = ba2Var.getMessagesController().L0(Long.valueOf(j));
                ba2Var.O0 = false;
                TLRPC.ChatFull chatFull = ba2Var.y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                ba2Var.o0();
                return;
        }
    }

    @Override
    public final void z(boolean z) {
        boolean O1 = gm.O1();
        int i = nm7.s;
        ba2 ba2Var = this.b;
        if (O1) {
            ba2Var.getNotificationCenter().k(i, Long.valueOf(-ba2Var.w0));
        } else {
            ba2Var.getNotificationCenter().k(i, new Object[0]);
        }
        ba2Var.finishFragment();
        ba2Var.getNotificationCenter().k(nm7.K2, Long.valueOf(-ba2Var.x0.id), null, ba2Var.x0, Boolean.valueOf(z));
    }
}
