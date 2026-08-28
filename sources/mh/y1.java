package mh;

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
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;
import org.telegram.ui.y21;
public final class y1 implements Runnable {
    public final int f18229a;
    public final c3 f18230b;

    public y1(c3 c3Var, int i9) {
        this.f18229a = i9;
        this.f18230b = c3Var;
    }

    @Override
    public final void run() {
        int i9 = this.f18229a;
        int i10 = 1;
        c3 c3Var = this.f18230b;
        switch (i9) {
            case 0:
                c3.d(c3Var);
                return;
            case 1:
                if (!c3Var.Y && c3Var.F != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(c3Var.C).getInputUser(c3Var.D);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(c3Var.C).getInputPeer(c3Var.E);
                    tL_messages_prolongWebView.query_id = c3Var.F;
                    tL_messages_prolongWebView.silent = false;
                    if (c3Var.G != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(c3Var.C).createReplyInput(c3Var.G);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (c3Var.H != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(c3Var.C).getInputPeer(c3Var.H);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (c3Var.H != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(c3Var.C).getInputPeer(c3Var.H);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(c3Var.C).sendRequest(tL_messages_prolongWebView, new i2(c3Var, 0));
                    return;
                }
                return;
            case 2:
                c3Var.D();
                return;
            case 3:
                c3Var.v.requestLayout();
                return;
            case 4:
                if (!c3Var.f17778x.z()) {
                    c3Var.q();
                    return;
                }
                return;
            case 5:
                c3Var.f17773t0 = true;
                c3Var.k(true);
                return;
            case 6:
                c3Var.r();
                return;
            case 7:
                Paint paint = c3Var.K;
                t2 t2Var = c3Var.v;
                if (t2Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - g7.n.a(t2Var.getSwipeOffsetY() / t2Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                c3Var.f17754e.invalidate();
                c3Var.f17778x.n(false, false);
                if (c3Var.f17751c != null) {
                    if (1.0f - (Math.min(t2Var.getTopActionBarOffsetY(), t2Var.getTranslationY() - t2Var.getTopActionBarOffsetY()) / t2Var.getTopActionBarOffsetY()) <= 0.5f) {
                        i10 = 0;
                    }
                    float f10 = i10 * 100.0f;
                    o1.j jVar = c3Var.f17751c;
                    o1.k kVar = jVar.f18800u;
                    if (((float) kVar.f18807i) != f10) {
                        kVar.f18807i = f10;
                        jVar.f();
                    }
                }
                if (c3Var.Z) {
                    int i11 = c3Var.h.bottom;
                } else {
                    Math.max(0.0f, t2Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                return;
            case 8:
                c3Var.f17778x.n(true, false);
                return;
            case 9:
                Activity activity = c3Var.f17758g0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).p0(qn.R9(c3Var.D));
                }
                c3Var.k(true);
                return;
            case 10:
                u2 u2Var = c3Var.f17778x;
                u2Var.getClass();
                u2Var.L = System.currentTimeMillis();
                u2Var.v("settings_button_pressed", null);
                return;
            case 11:
                a3 a3Var = c3Var.f17780y;
                u2 u2Var2 = c3Var.f17778x;
                if (u2Var2.getWebView() != null) {
                    u2Var2.getWebView().animate().cancel();
                    u2Var2.getWebView().animate().alpha(0.0f).start();
                }
                a3Var.setLoadProgress(0.0f);
                a3Var.setAlpha(1.0f);
                a3Var.setVisibility(0);
                u2Var2.setBotUser(MessagesController.getInstance(c3Var.C).getUser(Long.valueOf(c3Var.D)));
                u2Var2.q(c3Var.C, c3Var.D);
                NotificationCenter.getInstance(u2Var2.I).doOnIdle(new org.telegram.ui.web.t(u2Var2, 2));
                return;
            case 12:
                MediaDataController.getInstance(c3Var.C).installShortcut(c3Var.D, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                return;
            case 13:
                ve.e.s(c3Var.getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                return;
            case 14:
                int i12 = c3Var.C;
                Context context = c3Var.getContext();
                oc ocVar = new oc(cb.a(c3Var.getContext()), c3Var.A);
                long j10 = c3Var.D;
                int i13 = y21.v;
                y21.J(i12, context, j10, false, false, new ArrayList(), ocVar, null, new byte[0], null, null);
                return;
            case 15:
                c3.j(c3Var.C, c3Var.D, new y1(c3Var, 16));
                return;
            case 16:
                c3Var.k(false);
                return;
            default:
                c3Var.k(false);
                return;
        }
    }
}
