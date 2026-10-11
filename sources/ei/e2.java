package ei;

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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.nb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b41;
import org.telegram.ui.zn;
public final class e2 implements Runnable {
    public final int f9031a;
    public final k3 f9032b;

    public e2(k3 k3Var, int i10) {
        this.f9031a = i10;
        this.f9032b = k3Var;
    }

    @Override
    public final void run() {
        int i10 = this.f9031a;
        int i11 = 1;
        k3 k3Var = this.f9032b;
        switch (i10) {
            case 0:
                k3.d(k3Var);
                return;
            case 1:
                if (!k3Var.f9156c0 && k3Var.J != 0) {
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
                        tL_messages_prolongWebView.flags = 1 | tL_messages_prolongWebView.flags;
                    } else if (k3Var.L != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(k3Var.G).getInputPeer(k3Var.L);
                        tL_messages_prolongWebView.flags = 1 | tL_messages_prolongWebView.flags;
                    }
                    ConnectionsManager.getInstance(k3Var.G).sendRequest(tL_messages_prolongWebView, new p2(k3Var, 0));
                    return;
                }
                return;
            case 2:
                k3Var.E();
                return;
            case 3:
                k3Var.v.requestLayout();
                return;
            case 4:
                if (!k3Var.f9182x.C()) {
                    k3Var.r();
                    return;
                }
                return;
            case 5:
                k3Var.f9183x0 = true;
                k3Var.k(true);
                return;
            case 6:
                k3Var.s();
                return;
            case 7:
                Paint paint = k3Var.O;
                a3 a3Var = k3Var.v;
                if (a3Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - w7.o.a(a3Var.getSwipeOffsetY() / a3Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                k3Var.f9158e.invalidate();
                k3Var.f9182x.n(false, false);
                if (k3Var.f9155c != null) {
                    if (1.0f - (Math.min(a3Var.getTopActionBarOffsetY(), a3Var.getTranslationY() - a3Var.getTopActionBarOffsetY()) / a3Var.getTopActionBarOffsetY()) <= 0.5f) {
                        i11 = 0;
                    }
                    float f7 = i11 * 100.0f;
                    o1.k kVar = k3Var.f9155c;
                    o1.l lVar = kVar.f17024u;
                    if (((float) lVar.f17031i) != f7) {
                        lVar.f17031i = f7;
                        kVar.h();
                    }
                }
                if (k3Var.f9157d0) {
                    int i12 = k3Var.h.bottom;
                } else {
                    Math.max(0.0f, a3Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                return;
            case 8:
                k3Var.f9182x.n(true, false);
                return;
            case 9:
                Activity activity = k3Var.f9166k0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).p0(zn.W9(k3Var.H));
                }
                k3Var.k(true);
                return;
            case 10:
                b3 b3Var = k3Var.f9182x;
                b3Var.getClass();
                b3Var.P = System.currentTimeMillis();
                b3Var.y("settings_button_pressed", null);
                return;
            case 11:
                MediaDataController.getInstance(k3Var.G).installShortcut(k3Var.H, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                return;
            case 12:
                of.f.s(k3Var.getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                return;
            case 13:
                int i13 = k3Var.G;
                Context context = k3Var.getContext();
                ad adVar = new ad(nb.a(k3Var.getContext()), k3Var.E);
                long j3 = k3Var.H;
                int i14 = b41.v;
                b41.L(i13, context, j3, false, false, new ArrayList(), adVar, null, new byte[0], null, null);
                return;
            case 14:
                k3.j(k3Var.G, k3Var.H, new e2(k3Var, 15));
                return;
            case 15:
                k3Var.k(false);
                return;
            default:
                k3Var.k(false);
                return;
        }
    }
}
