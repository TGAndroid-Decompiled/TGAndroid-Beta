package hi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import c8.j9;
import java.util.ArrayList;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.oy0;
public final class x1 implements Runnable {
    public final int f15030a;
    public final a3 f15031b;

    public x1(a3 a3Var, int i7) {
        this.f15030a = i7;
        this.f15031b = a3Var;
    }

    @Override
    public final void run() {
        int i7 = this.f15030a;
        int i10 = 1;
        a3 a3Var = this.f15031b;
        switch (i7) {
            case 0:
                a3.f(a3Var);
                return;
            case 1:
                if (!a3Var.f14516d0 && a3Var.K != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = qp.s1(a3Var.H).o1(a3Var.I);
                    tL_messages_prolongWebView.peer = qp.s1(a3Var.H).j1(a3Var.J);
                    tL_messages_prolongWebView.query_id = a3Var.K;
                    tL_messages_prolongWebView.silent = false;
                    if (a3Var.L != 0) {
                        gz.C(a3Var.H);
                        int i11 = a3Var.L;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i11;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (a3Var.M != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = qp.s1(a3Var.H).j1(a3Var.M);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (a3Var.M != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = qp.s1(a3Var.H).j1(a3Var.M);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(a3Var.H).sendRequest(tL_messages_prolongWebView, new i2(a3Var, 0));
                    return;
                }
                return;
            case 2:
                a3Var.I();
                return;
            case 3:
                a3Var.f14541x.requestLayout();
                return;
            case 4:
                if (!a3Var.D.D()) {
                    a3Var.v();
                    return;
                }
                return;
            case 5:
                a3Var.f14544y0 = true;
                a3Var.o(true);
                return;
            case 6:
                a3Var.w();
                return;
            case 7:
                Paint paint = a3Var.P;
                r2 r2Var = a3Var.f14541x;
                if (r2Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - j9.a(r2Var.getSwipeOffsetY() / r2Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                a3Var.f14519f.invalidate();
                a3Var.D.n(false, false);
                if (a3Var.d != null) {
                    if (1.0f - (Math.min(r2Var.getTopActionBarOffsetY(), r2Var.getTranslationY() - r2Var.getTopActionBarOffsetY()) / r2Var.getTopActionBarOffsetY()) <= 0.5f) {
                        i10 = 0;
                    }
                    float f10 = i10 * 100.0f;
                    r1.g gVar = a3Var.d;
                    r1.h hVar = gVar.f54174m;
                    if (((float) hVar.f54182i) != f10) {
                        hVar.f54182i = f10;
                        gVar.h();
                    }
                }
                if (a3Var.f14518e0) {
                    int i12 = a3Var.f14527n.bottom;
                } else {
                    Math.max(0.0f, r2Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                return;
            case 8:
                a3Var.D.n(true, false);
                return;
            case 9:
                Activity activity = a3Var.f14526l0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).t0(an.ra(a3Var.I));
                }
                a3Var.o(true);
                return;
            case 10:
                s2 s2Var = a3Var.D;
                s2Var.getClass();
                s2Var.P = System.currentTimeMillis();
                s2Var.y("settings_button_pressed", null);
                return;
            case 11:
                ui.b0(a3Var.H).y0(a3Var.I, ui.f25794c2, null);
                return;
            case 12:
                vf.c.t(a3Var.getContext(), hd.M0(2131752893, null));
                return;
            case 13:
                int i13 = a3Var.H;
                Context context = a3Var.getContext();
                hc hcVar = new hc(xa.a(a3Var.getContext()), a3Var.F);
                long j3 = a3Var.I;
                int i14 = oy0.f48566s1;
                oy0.J0(i13, context, j3, false, false, new ArrayList(), hcVar, null, new byte[0], null, null);
                return;
            case 14:
                a3.n(a3Var.H, a3Var.I, new x1(a3Var, 15));
                return;
            case 15:
                a3Var.o(false);
                return;
            default:
                a3Var.o(false);
                return;
        }
    }
}
