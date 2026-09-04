package fi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
import org.telegram.ui.e41;
public final class e2 implements Runnable {
    public final int f9636a;
    public final k3 f9637b;

    public e2(k3 k3Var, int i10) {
        this.f9636a = i10;
        this.f9637b = k3Var;
    }

    @Override
    public final void run() {
        int i10 = this.f9636a;
        int i11 = 1;
        k3 k3Var = this.f9637b;
        switch (i10) {
            case 0:
                k3.d(k3Var);
                return;
            case 1:
                if (!k3Var.f9763c0 && k3Var.J != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(k3Var.G).getInputUser(k3Var.H);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(k3Var.G).getInputPeer(k3Var.I);
                    tL_messages_prolongWebView.query_id = k3Var.J;
                    tL_messages_prolongWebView.silent = false;
                    if (k3Var.K != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(k3Var.G).createReplyInput(k3Var.K);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (k3Var.L != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(k3Var.G).getInputPeer(k3Var.L);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (k3Var.L != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(k3Var.G).getInputPeer(k3Var.L);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(k3Var.G).sendRequest(tL_messages_prolongWebView, new p2(k3Var, 0));
                    return;
                }
                return;
            case 2:
                k3Var.D();
                return;
            case 3:
                k3Var.v.requestLayout();
                return;
            case 4:
                if (!k3Var.f9789x.D()) {
                    k3Var.q();
                    return;
                }
                return;
            case 5:
                k3Var.f9790x0 = true;
                k3Var.k(true);
                return;
            case 6:
                k3Var.r();
                return;
            case 7:
                Paint paint = k3Var.O;
                a3 a3Var = k3Var.v;
                if (a3Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - w7.p.a(a3Var.getSwipeOffsetY() / a3Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                k3Var.f9765e.invalidate();
                k3Var.f9789x.o(false, false);
                if (k3Var.f9762c != null) {
                    if (1.0f - (Math.min(a3Var.getTopActionBarOffsetY(), a3Var.getTranslationY() - a3Var.getTopActionBarOffsetY()) / a3Var.getTopActionBarOffsetY()) <= 0.5f) {
                        i11 = 0;
                    }
                    float f7 = i11 * 100.0f;
                    o1.k kVar = k3Var.f9762c;
                    o1.l lVar = kVar.f16825u;
                    if (((float) lVar.f16832i) != f7) {
                        lVar.f16832i = f7;
                        kVar.f();
                    }
                }
                if (k3Var.f9764d0) {
                    int i12 = k3Var.h.bottom;
                } else {
                    Math.max(0.0f, a3Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                return;
            case 8:
                k3Var.f9789x.o(true, false);
                return;
            case 9:
                Activity activity = k3Var.f9773k0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).p0(co.R9(k3Var.H));
                }
                k3Var.k(true);
                return;
            case 10:
                b3 b3Var = k3Var.f9789x;
                b3Var.getClass();
                b3Var.P = System.currentTimeMillis();
                b3Var.z("settings_button_pressed", null);
                return;
            case 11:
                i3 i3Var = k3Var.f9791y;
                b3 b3Var2 = k3Var.f9789x;
                if (b3Var2.getWebView() != null) {
                    b3Var2.getWebView().animate().cancel();
                    b3Var2.getWebView().animate().alpha(0.0f).start();
                }
                i3Var.setLoadProgress(0.0f);
                i3Var.setAlpha(1.0f);
                i3Var.setVisibility(0);
                b3Var2.setBotUser(MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H)));
                b3Var2.t(k3Var.G, k3Var.H);
                NotificationCenter.getInstance(b3Var2.M).doOnIdle(new org.telegram.ui.web.u(b3Var2, 2));
                return;
            case 12:
                MediaDataController.getInstance(k3Var.G).installShortcut(k3Var.H, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                return;
            case 13:
                of.f.s(k3Var.getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                return;
            case 14:
                int i13 = k3Var.G;
                Context context = k3Var.getContext();
                yc ycVar = new yc(lb.a(k3Var.getContext()), k3Var.E);
                long j3 = k3Var.H;
                int i14 = e41.v;
                e41.K(i13, context, j3, false, false, new ArrayList(), ycVar, null, new byte[0], null, null);
                return;
            case 15:
                k3.j(k3Var.G, k3Var.H, new e2(k3Var, 16));
                return;
            case 16:
                k3Var.k(false);
                return;
            default:
                k3Var.k(false);
                return;
        }
    }
}
