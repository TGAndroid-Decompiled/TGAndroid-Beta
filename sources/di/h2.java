package di;

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
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.h41;
public final class h2 implements Runnable {
    public final int f6664a;
    public final n3 f6665b;

    public h2(n3 n3Var, int i10) {
        this.f6664a = i10;
        this.f6665b = n3Var;
    }

    @Override
    public final void run() {
        int i10 = this.f6664a;
        int i11 = 1;
        n3 n3Var = this.f6665b;
        switch (i10) {
            case 0:
                n3.d(n3Var);
                return;
            case 1:
                if (!n3Var.f6787c0 && n3Var.J != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(n3Var.G).getInputUser(n3Var.H);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(n3Var.G).getInputPeer(n3Var.I);
                    tL_messages_prolongWebView.query_id = n3Var.J;
                    tL_messages_prolongWebView.silent = false;
                    if (n3Var.K != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(n3Var.G).createReplyInput(n3Var.K);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (n3Var.L != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(n3Var.G).getInputPeer(n3Var.L);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (n3Var.L != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(n3Var.G).getInputPeer(n3Var.L);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(n3Var.G).sendRequest(tL_messages_prolongWebView, new s2(n3Var, 0));
                    return;
                }
                return;
            case 2:
                n3Var.D();
                return;
            case 3:
                n3Var.v.requestLayout();
                return;
            case 4:
                if (!n3Var.f6812x.D()) {
                    n3Var.q();
                    return;
                }
                return;
            case 5:
                n3Var.f6813x0 = true;
                n3Var.k(true);
                return;
            case 6:
                n3Var.r();
                return;
            case 7:
                Paint paint = n3Var.O;
                d3 d3Var = n3Var.v;
                if (d3Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - w7.q.a(d3Var.getSwipeOffsetY() / d3Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                n3Var.e.invalidate();
                n3Var.f6812x.o(false, false);
                if (n3Var.f6786c != null) {
                    if (1.0f - (Math.min(d3Var.getTopActionBarOffsetY(), d3Var.getTranslationY() - d3Var.getTopActionBarOffsetY()) / d3Var.getTopActionBarOffsetY()) <= 0.5f) {
                        i11 = 0;
                    }
                    float f7 = i11 * 100.0f;
                    o1.k kVar = n3Var.f6786c;
                    o1.l lVar = kVar.f14134u;
                    if (((float) lVar.f14140i) != f7) {
                        lVar.f14140i = f7;
                        kVar.f();
                    }
                }
                if (n3Var.f6788d0) {
                    int i12 = n3Var.h.bottom;
                } else {
                    Math.max(0.0f, d3Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                return;
            case 8:
                n3Var.f6812x.o(true, false);
                return;
            case 9:
                Activity activity = n3Var.f6796k0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).p0(eo.R9(n3Var.H));
                }
                n3Var.k(true);
                return;
            case 10:
                e3 e3Var = n3Var.f6812x;
                e3Var.getClass();
                e3Var.P = System.currentTimeMillis();
                e3Var.y("settings_button_pressed", null);
                return;
            case 11:
                l3 l3Var = n3Var.f6814y;
                e3 e3Var2 = n3Var.f6812x;
                if (e3Var2.getWebView() != null) {
                    e3Var2.getWebView().animate().cancel();
                    e3Var2.getWebView().animate().alpha(0.0f).start();
                }
                l3Var.setLoadProgress(0.0f);
                l3Var.setAlpha(1.0f);
                l3Var.setVisibility(0);
                e3Var2.setBotUser(MessagesController.getInstance(n3Var.G).getUser(Long.valueOf(n3Var.H)));
                e3Var2.t(n3Var.G, n3Var.H);
                NotificationCenter.getInstance(e3Var2.M).doOnIdle(new org.telegram.ui.web.t(e3Var2, 2));
                return;
            case 12:
                MediaDataController.getInstance(n3Var.G).installShortcut(n3Var.H, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                return;
            case 13:
                nf.f.s(n3Var.getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                return;
            case 14:
                int i13 = n3Var.G;
                Context context = n3Var.getContext();
                wc wcVar = new wc(kb.a(n3Var.getContext()), n3Var.E);
                long j3 = n3Var.H;
                int i14 = h41.v;
                h41.K(i13, context, j3, false, false, new ArrayList(), wcVar, null, new byte[0], null, null);
                return;
            case 15:
                n3.j(n3Var.G, n3Var.H, new h2(n3Var, 16));
                return;
            case 16:
                n3Var.k(false);
                return;
            default:
                n3Var.k(false);
                return;
        }
    }
}
