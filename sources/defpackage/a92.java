package defpackage;

import org.telegram.tgnet.TLRPC;
public final class a92 implements fd, ef7, qc6, bf7 {
    public final byte a;
    public final g92 b;

    public a92(g92 g92Var, byte b) {
        this.a = b;
        this.b = g92Var;
    }

    @Override
    public final void A(boolean z) {
        boolean O1 = hl.O1();
        int i = jn7.s;
        g92 g92Var = this.b;
        if (O1) {
            g92Var.getNotificationCenter().k(i, Long.valueOf(-g92Var.w0));
        } else {
            g92Var.getNotificationCenter().k(i, new Object[0]);
        }
        g92Var.finishFragment();
        g92Var.getNotificationCenter().k(jn7.K2, Long.valueOf(-g92Var.x0.id), null, g92Var.x0, Boolean.valueOf(z));
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        g92 g92Var = this.b;
        TLRPC.ChatFull chatFull = g92Var.y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        g92Var.t0(false, true);
        g92Var.getMessagesController().e3(0, g92Var.w0, true);
    }

    @Override
    public final void run(long j) {
        byte b = this.a;
        g92 g92Var = this.b;
        switch (b) {
            case 4:
                g92Var.y0(Long.valueOf(j));
                return;
            default:
                if (j == 0) {
                    g92Var.O0 = false;
                    return;
                }
                g92Var.w0 = j;
                g92Var.x0 = g92Var.getMessagesController().M0(Long.valueOf(j));
                g92Var.O0 = false;
                TLRPC.ChatFull chatFull = g92Var.y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                g92Var.n0();
                return;
        }
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        g92 g92Var = this.b;
        switch (b) {
            case 0:
                g92Var.n0();
                return;
            case 1:
                g92Var.finishFragment();
                return;
            case 2:
                g92Var.n0();
                return;
            default:
                g92Var.finishFragment();
                return;
        }
    }
}
