package nh;

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
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rn;
import org.telegram.ui.x21;

public final class y1 implements Runnable {

    public final int f19057a;

    public final b3 f19058b;

    public y1(b3 b3Var, int i10) {
        this.f19057a = i10;
        this.f19058b = b3Var;
    }

    @Override
    public final void run() {
        int i10 = this.f19057a;
        int i11 = 0;
        b3 b3Var = this.f19058b;
        switch (i10) {
            case 0:
                b3.d(b3Var);
                break;
            case 1:
                if (!b3Var.Y && b3Var.F != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(b3Var.C).getInputUser(b3Var.D);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(b3Var.C).getInputPeer(b3Var.E);
                    tL_messages_prolongWebView.query_id = b3Var.F;
                    tL_messages_prolongWebView.silent = false;
                    if (b3Var.G != 0) {
                        TLRPC.InputReplyTo inputReplyToCreateReplyInput = SendMessagesHelper.getInstance(b3Var.C).createReplyInput(b3Var.G);
                        tL_messages_prolongWebView.reply_to = inputReplyToCreateReplyInput;
                        if (b3Var.H != 0) {
                            inputReplyToCreateReplyInput.monoforum_peer_id = MessagesController.getInstance(b3Var.C).getInputPeer(b3Var.H);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (b3Var.H != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(b3Var.C).getInputPeer(b3Var.H);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(b3Var.C).sendRequest(tL_messages_prolongWebView, new i2(b3Var, i11));
                    break;
                }
                break;
            case 2:
                b3Var.D();
                break;
            case 3:
                b3Var.v.requestLayout();
                break;
            case 4:
                if (!b3Var.f18599x.z()) {
                    b3Var.q();
                }
                break;
            case 5:
                b3Var.f18594t0 = true;
                b3Var.k(true);
                break;
            case 6:
                b3Var.r();
                break;
            case 7:
                Paint paint = b3Var.K;
                s2 s2Var = b3Var.v;
                if (s2Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - h7.n.a(s2Var.getSwipeOffsetY() / s2Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                b3Var.f18575e.invalidate();
                b3Var.f18599x.n(false, false);
                if (b3Var.f18572c != null) {
                    float f10 = (1.0f - (Math.min(s2Var.getTopActionBarOffsetY(), s2Var.getTranslationY() - s2Var.getTopActionBarOffsetY()) / s2Var.getTopActionBarOffsetY()) <= 0.5f ? 0 : 1) * 100.0f;
                    o1.j jVar = b3Var.f18572c;
                    o1.k kVar = jVar.f19147u;
                    if (((float) kVar.f19154i) != f10) {
                        kVar.f19154i = f10;
                        jVar.f();
                    }
                }
                if (b3Var.Z) {
                    int i12 = b3Var.h.bottom;
                } else {
                    Math.max(0.0f, s2Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                break;
            case 8:
                b3Var.f18599x.n(true, false);
                break;
            case 9:
                Activity activity = b3Var.f18579g0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).p0(rn.R9(b3Var.D));
                }
                b3Var.k(true);
                break;
            case 10:
                t2 t2Var = b3Var.f18599x;
                t2Var.getClass();
                t2Var.L = System.currentTimeMillis();
                t2Var.v("settings_button_pressed", null);
                break;
            case 11:
                z2 z2Var = b3Var.f18601y;
                t2 t2Var2 = b3Var.f18599x;
                if (t2Var2.getWebView() != null) {
                    t2Var2.getWebView().animate().cancel();
                    t2Var2.getWebView().animate().alpha(0.0f).start();
                }
                z2Var.setLoadProgress(0.0f);
                z2Var.setAlpha(1.0f);
                z2Var.setVisibility(0);
                t2Var2.setBotUser(MessagesController.getInstance(b3Var.C).getUser(Long.valueOf(b3Var.D)));
                t2Var2.q(b3Var.C, b3Var.D);
                NotificationCenter.getInstance(t2Var2.I).doOnIdle(new org.telegram.ui.web.u(t2Var2, 2));
                break;
            case 12:
                MediaDataController.getInstance(b3Var.C).installShortcut(b3Var.D, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                break;
            case 13:
                we.e.s(b3Var.getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                break;
            case 14:
                int i13 = b3Var.C;
                Context context = b3Var.getContext();
                mc mcVar = new mc(ab.a(b3Var.getContext()), b3Var.A);
                long j10 = b3Var.D;
                int i14 = x21.v;
                x21.K(i13, context, j10, false, false, new ArrayList(), mcVar, null, new byte[0], null, null);
                break;
            case 15:
                b3.j(b3Var.C, b3Var.D, new y1(b3Var, 16));
                break;
            case 16:
                b3Var.k(false);
                break;
            default:
                b3Var.k(false);
                break;
        }
    }
}
