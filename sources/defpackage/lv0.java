package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class lv0 implements Runnable {
    public final byte a;
    public final ow0 b;

    public lv0(ow0 ow0Var, byte b) {
        this.a = b;
        this.b = ow0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 1;
        ow0 ow0Var = this.b;
        switch (b) {
            case 0:
                ow0Var.q();
                return;
            case 1:
                if (!ow0Var.e0 && ow0Var.L != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = na7.q1(ow0Var.I).m1(ow0Var.J);
                    tL_messages_prolongWebView.peer = na7.q1(ow0Var.I).h1(ow0Var.K);
                    tL_messages_prolongWebView.query_id = ow0Var.L;
                    tL_messages_prolongWebView.silent = false;
                    if (ow0Var.M != 0) {
                        z3a.B(ow0Var.I);
                        int i2 = ow0Var.M;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i2;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (ow0Var.N != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = na7.q1(ow0Var.I).h1(ow0Var.N);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (ow0Var.N != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = na7.q1(ow0Var.I).h1(ow0Var.N);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(ow0Var.I).sendRequest(tL_messages_prolongWebView, new wv0(ow0Var, (byte) 0));
                    return;
                }
                return;
            case 2:
                ow0Var.I();
                return;
            case 3:
                ow0Var.x.requestLayout();
                return;
            case 4:
                if (!ow0Var.E.A()) {
                    ow0Var.v();
                    return;
                }
                return;
            case 5:
                ow0Var.z0 = true;
                ow0Var.m(true);
                return;
            case 6:
                ow0Var.w();
                return;
            case 7:
                fw0 fw0Var = ow0Var.x;
                int i3 = (fw0Var.getSwipeOffsetY() > 0.0f ? 1 : (fw0Var.getSwipeOffsetY() == 0.0f ? 0 : -1));
                Paint paint = ow0Var.Q;
                if (i3 > 0) {
                    paint.setAlpha((int) ((1.0f - moe.a(fw0Var.getSwipeOffsetY() / fw0Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                ow0Var.f.invalidate();
                ow0Var.E.l(false, false);
                if (ow0Var.d != null) {
                    if (1.0f - (Math.min(fw0Var.getTopActionBarOffsetY(), fw0Var.getTranslationY() - fw0Var.getTopActionBarOffsetY()) / fw0Var.getTopActionBarOffsetY()) <= 0.5f) {
                        i = 0;
                    }
                    float f = i * 100.0f;
                    yla ylaVar = ow0Var.d;
                    zla zlaVar = ylaVar.m;
                    if (((float) zlaVar.i) != f) {
                        zlaVar.i = f;
                        ylaVar.h();
                    }
                }
                if (ow0Var.f0) {
                    int i4 = ow0Var.n.bottom;
                } else {
                    fw0Var.getSwipeOffsetY();
                }
                System.currentTimeMillis();
                return;
            case 8:
                ow0Var.E.l(true, false);
                return;
            case 9:
                Activity activity = ow0Var.m0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).t0(mu1.U9(ow0Var.J));
                }
                ow0Var.m(true);
                return;
            case 10:
                gw0 gw0Var = ow0Var.E;
                gw0Var.getClass();
                gw0Var.Q = System.currentTimeMillis();
                gw0Var.v("settings_button_pressed", null);
                return;
            case 11:
                hq6.d0(ow0Var.I).z0(ow0Var.J, hq6.f2 ? 1 : 0, null);
                return;
            case 12:
                d01.t(ow0Var.getContext(), k96.M0(2131752881, null));
                return;
            case 13:
                int i5 = ow0Var.I;
                Context context = ow0Var.getContext();
                u21 u21Var = new u21(f11.a(ow0Var.getContext()), ow0Var.G);
                long j = ow0Var.J;
                int i6 = b89.v1;
                b89.D0(i5, context, j, false, false, new ArrayList(), u21Var, null, new byte[0], null, null);
                return;
            case 14:
                ow0.l(ow0Var.I, ow0Var.J, new lv0(ow0Var, (byte) 15));
                return;
            case 15:
                ow0Var.m(false);
                return;
            default:
                ow0Var.m(false);
                return;
        }
    }
}
