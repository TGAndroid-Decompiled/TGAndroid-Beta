package defpackage;

import android.app.Activity;
import android.graphics.Paint;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class wv0 implements Runnable {
    public final byte a;
    public final xw0 b;

    public wv0(xw0 xw0Var, byte b) {
        this.a = b;
        this.b = xw0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        xw0 xw0Var = this.b;
        switch (b) {
            case 0:
                xw0Var.q();
                return;
            case 1:
                if (!xw0Var.e0 && xw0Var.L != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = uc7.s1(xw0Var.I).o1(xw0Var.J);
                    tL_messages_prolongWebView.peer = uc7.s1(xw0Var.I).j1(xw0Var.K);
                    tL_messages_prolongWebView.query_id = xw0Var.L;
                    tL_messages_prolongWebView.silent = false;
                    if (xw0Var.M != 0) {
                        r7a.B(xw0Var.I);
                        int i2 = xw0Var.M;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i2;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (xw0Var.N != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = uc7.s1(xw0Var.I).j1(xw0Var.N);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (xw0Var.N != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = uc7.s1(xw0Var.I).j1(xw0Var.N);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(xw0Var.I).sendRequest(tL_messages_prolongWebView, new tv0(xw0Var, (byte) 1));
                    return;
                }
                return;
            case 2:
                xw0Var.I();
                return;
            case 3:
                xw0Var.x.requestLayout();
                return;
            case 4:
                if (!xw0Var.E.A()) {
                    xw0Var.v();
                    return;
                }
                return;
            case 5:
                xw0Var.z0 = true;
                xw0Var.m(true);
                return;
            case 6:
                xw0Var.w();
                return;
            case 7:
                ow0 ow0Var = xw0Var.x;
                int i3 = (ow0Var.getSwipeOffsetY() > 0.0f ? 1 : (ow0Var.getSwipeOffsetY() == 0.0f ? 0 : -1));
                Paint paint = xw0Var.Q;
                if (i3 > 0) {
                    paint.setAlpha((int) ((1.0f - ete.a(ow0Var.getSwipeOffsetY() / ow0Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                xw0Var.f.invalidate();
                xw0Var.E.l(false, false);
                if (xw0Var.d != null) {
                    if (1.0f - (Math.min(ow0Var.getTopActionBarOffsetY(), ow0Var.getTranslationY() - ow0Var.getTopActionBarOffsetY()) / ow0Var.getTopActionBarOffsetY()) > 0.5f) {
                        i = 1;
                    }
                    float f = i * 100.0f;
                    vpa vpaVar = xw0Var.d;
                    wpa wpaVar = vpaVar.m;
                    if (((float) wpaVar.i) != f) {
                        wpaVar.i = f;
                        vpaVar.h();
                    }
                }
                if (xw0Var.f0) {
                    int i4 = xw0Var.n.bottom;
                } else {
                    ow0Var.getSwipeOffsetY();
                }
                System.currentTimeMillis();
                return;
            case 8:
                xw0Var.E.l(true, false);
                return;
            case 9:
                Activity activity = xw0Var.m0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).t0(zu1.ha(xw0Var.J));
                }
                xw0Var.m(true);
                return;
            case 10:
                pw0 pw0Var = xw0Var.E;
                pw0Var.getClass();
                pw0Var.Q = System.currentTimeMillis();
                pw0Var.v("settings_button_pressed", null);
                return;
            case 11:
                ls6.d0(xw0Var.I).z0(xw0Var.J, ls6.f2 ? 1 : 0, null);
                return;
            case 12:
                m01.u(xw0Var.getContext(), ob6.M0(2131752874, null));
                return;
            case 13:
                nb9.F0(xw0Var.I, xw0Var.getContext(), new d31(o11.a(xw0Var.getContext()), xw0Var.G), xw0Var.J);
                return;
            case 14:
                xw0.l(xw0Var.I, xw0Var.J, new wv0(xw0Var, (byte) 15));
                return;
            case 15:
                xw0Var.m(false);
                return;
            default:
                xw0Var.m(false);
                return;
        }
    }
}
