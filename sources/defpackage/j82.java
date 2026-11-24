package defpackage;

import org.telegram.tgnet.TLRPC;
public final class j82 implements ed, vc7, ma6, sc7 {
    public final byte a;
    public final p82 b;

    public j82(p82 p82Var, byte b) {
        this.a = b;
        this.b = p82Var;
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        p82 p82Var = this.b;
        TLRPC.ChatFull chatFull = p82Var.y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        p82Var.t0(false, true);
        p82Var.getMessagesController().X2(0, p82Var.w0, true);
    }

    @Override
    public final void k(boolean z) {
        boolean O1 = gl.O1();
        int i = kk7.s;
        p82 p82Var = this.b;
        if (O1) {
            p82Var.getNotificationCenter().k(i, Long.valueOf(-p82Var.w0));
        } else {
            p82Var.getNotificationCenter().k(i, new Object[0]);
        }
        p82Var.finishFragment();
        p82Var.getNotificationCenter().k(kk7.J2, Long.valueOf(-p82Var.x0.id), null, p82Var.x0, Boolean.valueOf(z));
    }

    @Override
    public final void run(long j) {
        byte b = this.a;
        p82 p82Var = this.b;
        switch (b) {
            case 4:
                p82Var.x0(Long.valueOf(j));
                return;
            default:
                if (j == 0) {
                    p82Var.O0 = false;
                    return;
                }
                p82Var.w0 = j;
                p82Var.x0 = p82Var.getMessagesController().K0(Long.valueOf(j));
                p82Var.O0 = false;
                TLRPC.ChatFull chatFull = p82Var.y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                p82Var.n0();
                return;
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        p82 p82Var = this.b;
        switch (b) {
            case 0:
                p82Var.n0();
                return;
            case 1:
                p82Var.finishFragment();
                return;
            case 2:
                p82Var.n0();
                return;
            default:
                p82Var.finishFragment();
                return;
        }
    }
}
