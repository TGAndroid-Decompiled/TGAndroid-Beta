package hi;

import a8.ee;
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
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
import org.telegram.ui.v21;
public final class g2 implements Runnable {
    public final int f12995a;
    public final m3 f12996b;

    public g2(m3 m3Var, int i10) {
        this.f12995a = i10;
        this.f12996b = m3Var;
    }

    @Override
    public final void run() {
        int i10 = this.f12995a;
        int i11 = 1;
        m3 m3Var = this.f12996b;
        switch (i10) {
            case 0:
                m3.d(m3Var);
                return;
            case 1:
                if (!m3Var.f13107d0 && m3Var.K != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(m3Var.H).getInputUser(m3Var.I);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(m3Var.H).getInputPeer(m3Var.J);
                    tL_messages_prolongWebView.query_id = m3Var.K;
                    tL_messages_prolongWebView.silent = false;
                    if (m3Var.L != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(m3Var.H).createReplyInput(m3Var.L);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (m3Var.M != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(m3Var.H).getInputPeer(m3Var.M);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags = 1 | tL_messages_prolongWebView.flags;
                    } else if (m3Var.M != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(m3Var.H).getInputPeer(m3Var.M);
                        tL_messages_prolongWebView.flags = 1 | tL_messages_prolongWebView.flags;
                    }
                    ConnectionsManager.getInstance(m3Var.H).sendRequest(tL_messages_prolongWebView, new r2(m3Var, 0));
                    return;
                }
                return;
            case 2:
                m3Var.E();
                return;
            case 3:
                m3Var.f13129w.requestLayout();
                return;
            case 4:
                if (!m3Var.f13133y.C()) {
                    m3Var.r();
                    return;
                }
                return;
            case 5:
                m3Var.f13134y0 = true;
                m3Var.k(true);
                return;
            case 6:
                m3Var.s();
                return;
            case 7:
                Paint paint = m3Var.P;
                d3 d3Var = m3Var.f13129w;
                if (d3Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - ee.a(d3Var.getSwipeOffsetY() / d3Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                m3Var.f13109f.invalidate();
                m3Var.f13133y.n(false, false);
                if (m3Var.d != null) {
                    if (1.0f - (Math.min(d3Var.getTopActionBarOffsetY(), d3Var.getTranslationY() - d3Var.getTopActionBarOffsetY()) / d3Var.getTopActionBarOffsetY()) <= 0.5f) {
                        i11 = 0;
                    }
                    float f7 = i11 * 100.0f;
                    o1.j jVar = m3Var.d;
                    o1.k kVar = jVar.f18969u;
                    if (((float) kVar.f18975i) != f7) {
                        kVar.f18975i = f7;
                        jVar.h();
                    }
                }
                if (m3Var.f13108e0) {
                    int i12 = m3Var.f13117n.bottom;
                } else {
                    Math.max(0.0f, d3Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                return;
            case 8:
                m3Var.f13133y.n(true, false);
                return;
            case 9:
                Activity activity = m3Var.f13116l0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).u0(un.ba(m3Var.I));
                }
                m3Var.k(true);
                return;
            case 10:
                e3 e3Var = m3Var.f13133y;
                e3Var.getClass();
                e3Var.P = System.currentTimeMillis();
                e3Var.y("settings_button_pressed", null);
                return;
            case 11:
                MediaDataController.getInstance(m3Var.H).installShortcut(m3Var.I, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                return;
            case 12:
                qf.d.r(m3Var.getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                return;
            case 13:
                int i13 = m3Var.H;
                Context context = m3Var.getContext();
                wc wcVar = new wc(lb.a(m3Var.getContext()), m3Var.F);
                long j10 = m3Var.I;
                int i14 = v21.f44577w;
                v21.N(i13, context, j10, false, false, new ArrayList(), wcVar, null, new byte[0], null, null);
                return;
            case 14:
                m3.j(m3Var.H, m3Var.I, new g2(m3Var, 15));
                return;
            case 15:
                m3Var.k(false);
                return;
            default:
                m3Var.k(false);
                return;
        }
    }
}
