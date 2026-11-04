package ii;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import b8.be;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.li;
import org.telegram.messenger.yy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.wa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey0;
import org.telegram.ui.wm;
public final class x1 implements Runnable {
    public final int f15316a;
    public final a3 f15317b;

    public x1(a3 a3Var, int i3) {
        this.f15316a = i3;
        this.f15317b = a3Var;
    }

    @Override
    public final void run() {
        int i3 = this.f15316a;
        int i10 = 1;
        a3 a3Var = this.f15317b;
        switch (i3) {
            case 0:
                a3.f(a3Var);
                return;
            case 1:
                if (!a3Var.f14801e0 && a3Var.L != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = hp.s1(a3Var.I).o1(a3Var.J);
                    tL_messages_prolongWebView.peer = hp.s1(a3Var.I).j1(a3Var.K);
                    tL_messages_prolongWebView.query_id = a3Var.L;
                    tL_messages_prolongWebView.silent = false;
                    if (a3Var.M != 0) {
                        yy.C(a3Var.I);
                        int i11 = a3Var.M;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i11;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (a3Var.N != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = hp.s1(a3Var.I).j1(a3Var.N);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (a3Var.N != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = hp.s1(a3Var.I).j1(a3Var.N);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(a3Var.I).sendRequest(tL_messages_prolongWebView, new h2(a3Var, 0));
                    return;
                }
                return;
            case 2:
                a3Var.I();
                return;
            case 3:
                a3Var.f14824x.requestLayout();
                return;
            case 4:
                if (!a3Var.E.C()) {
                    a3Var.v();
                    return;
                }
                return;
            case 5:
                a3Var.f14828z0 = true;
                a3Var.o(true);
                return;
            case 6:
                a3Var.w();
                return;
            case 7:
                Paint paint = a3Var.Q;
                r2 r2Var = a3Var.f14824x;
                if (r2Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - be.a(r2Var.getSwipeOffsetY() / r2Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                a3Var.f14802f.invalidate();
                a3Var.E.n(false, false);
                if (a3Var.d != null) {
                    if (1.0f - (Math.min(r2Var.getTopActionBarOffsetY(), r2Var.getTranslationY() - r2Var.getTopActionBarOffsetY()) / r2Var.getTopActionBarOffsetY()) <= 0.5f) {
                        i10 = 0;
                    }
                    float f10 = i10 * 100.0f;
                    q1.g gVar = a3Var.d;
                    q1.h hVar = gVar.f53653m;
                    if (((float) hVar.f53661i) != f10) {
                        hVar.f53661i = f10;
                        gVar.h();
                    }
                }
                if (a3Var.f14803f0) {
                    int i12 = a3Var.f14810n.bottom;
                } else {
                    Math.max(0.0f, r2Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                return;
            case 8:
                a3Var.E.n(true, false);
                return;
            case 9:
                Activity activity = a3Var.m0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).t0(wm.ra(a3Var.J));
                }
                a3Var.o(true);
                return;
            case 10:
                s2 s2Var = a3Var.E;
                s2Var.getClass();
                s2Var.Q = System.currentTimeMillis();
                s2Var.y("settings_button_pressed", null);
                return;
            case 11:
                li.b0(a3Var.I).y0(a3Var.J, li.f24005d2, null);
                return;
            case 12:
                sf.c.t(a3Var.getContext(), bd.M0(2131752893, null));
                return;
            case 13:
                int i13 = a3Var.I;
                Context context = a3Var.getContext();
                fc fcVar = new fc(wa.a(a3Var.getContext()), a3Var.G);
                long j10 = a3Var.J;
                int i14 = ey0.f45092t1;
                ey0.J0(i13, context, j10, false, false, new ArrayList(), fcVar, null, new byte[0], null, null);
                return;
            case 14:
                a3.n(a3Var.I, a3Var.J, new x1(a3Var, 15));
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
