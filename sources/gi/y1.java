package gi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.q21;
import org.telegram.ui.sn;
public final class y1 implements Runnable {
    public final int f11566a;
    public final d3 f11567b;

    public y1(d3 d3Var, int i10) {
        this.f11566a = i10;
        this.f11567b = d3Var;
    }

    @Override
    public final void run() {
        int i10 = this.f11566a;
        int i11 = 1;
        d3 d3Var = this.f11567b;
        switch (i10) {
            case 0:
                d3.d(d3Var);
                return;
            case 1:
                if (!d3Var.f11140c0 && d3Var.J != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(d3Var.G).getInputUser(d3Var.H);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(d3Var.G).getInputPeer(d3Var.I);
                    tL_messages_prolongWebView.query_id = d3Var.J;
                    tL_messages_prolongWebView.silent = false;
                    if (d3Var.K != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(d3Var.G).createReplyInput(d3Var.K);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (d3Var.L != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(d3Var.G).getInputPeer(d3Var.L);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags = 1 | tL_messages_prolongWebView.flags;
                    } else if (d3Var.L != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(d3Var.G).getInputPeer(d3Var.L);
                        tL_messages_prolongWebView.flags = 1 | tL_messages_prolongWebView.flags;
                    }
                    ConnectionsManager.getInstance(d3Var.G).sendRequest(tL_messages_prolongWebView, new j2(d3Var, 0));
                    return;
                }
                return;
            case 2:
                d3Var.E();
                return;
            case 3:
                d3Var.v.requestLayout();
                return;
            case 4:
                if (!d3Var.f11165x.C()) {
                    d3Var.r();
                    return;
                }
                return;
            case 5:
                d3Var.f11166x0 = true;
                d3Var.k(true);
                return;
            case 6:
                d3Var.s();
                return;
            case 7:
                Paint paint = d3Var.O;
                u2 u2Var = d3Var.v;
                if (u2Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - w7.r.a(u2Var.getSwipeOffsetY() / u2Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                d3Var.e.invalidate();
                d3Var.f11165x.n(false, false);
                if (d3Var.f11139c != null) {
                    if (1.0f - (Math.min(u2Var.getTopActionBarOffsetY(), u2Var.getTranslationY() - u2Var.getTopActionBarOffsetY()) / u2Var.getTopActionBarOffsetY()) <= 0.5f) {
                        i11 = 0;
                    }
                    float f7 = i11 * 100.0f;
                    o1.k kVar = d3Var.f11139c;
                    o1.l lVar = kVar.f17555u;
                    if (((float) lVar.f17561i) != f7) {
                        lVar.f17561i = f7;
                        kVar.h();
                    }
                }
                if (d3Var.f11141d0) {
                    int i12 = d3Var.h.bottom;
                } else {
                    Math.max(0.0f, u2Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                return;
            case 8:
                d3Var.f11165x.n(true, false);
                return;
            case 9:
                Activity activity = d3Var.f11149k0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).t0(sn.W9(d3Var.H));
                }
                d3Var.k(true);
                return;
            case 10:
                v2 v2Var = d3Var.f11165x;
                v2Var.getClass();
                v2Var.P = System.currentTimeMillis();
                v2Var.y("settings_button_pressed", null);
                return;
            case 11:
                MediaDataController.getInstance(d3Var.G).installShortcut(d3Var.H, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                return;
            case 12:
                pf.d.r(d3Var.getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                return;
            case 13:
                int i13 = d3Var.G;
                Context context = d3Var.getContext();
                xc xcVar = new xc(lb.a(d3Var.getContext()), d3Var.E);
                long j10 = d3Var.H;
                int i14 = q21.v;
                q21.L(i13, context, j10, false, false, new ArrayList(), xcVar, null, new byte[0], null, null);
                return;
            case 14:
                d3.j(d3Var.G, d3Var.H, new y1(d3Var, 15));
                return;
            case 15:
                d3Var.k(false);
                return;
            default:
                d3Var.k(false);
                return;
        }
    }
}
