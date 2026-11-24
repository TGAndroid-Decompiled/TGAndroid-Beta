package defpackage;

import android.app.Activity;
import android.graphics.Paint;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class vw0 implements Runnable {
    public final byte a;
    public final wx0 b;

    public vw0(wx0 wx0Var, byte b) {
        this.a = b;
        this.b = wx0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        wx0 wx0Var = this.b;
        switch (b) {
            case 0:
                wx0Var.q();
                return;
            case 1:
                if (!wx0Var.e0 && wx0Var.L != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = oc7.r1(wx0Var.I).n1(wx0Var.J);
                    tL_messages_prolongWebView.peer = oc7.r1(wx0Var.I).i1(wx0Var.K);
                    tL_messages_prolongWebView.query_id = wx0Var.L;
                    tL_messages_prolongWebView.silent = false;
                    if (wx0Var.M != 0) {
                        a6a.B(wx0Var.I);
                        int i2 = wx0Var.M;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i2;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (wx0Var.N != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = oc7.r1(wx0Var.I).i1(wx0Var.N);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (wx0Var.N != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = oc7.r1(wx0Var.I).i1(wx0Var.N);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(wx0Var.I).sendRequest(tL_messages_prolongWebView, new sw0(wx0Var, (byte) 1));
                    return;
                }
                return;
            case 2:
                wx0Var.I();
                return;
            case 3:
                wx0Var.x.requestLayout();
                return;
            case 4:
                if (!wx0Var.E.A()) {
                    wx0Var.v();
                    return;
                }
                return;
            case 5:
                wx0Var.z0 = true;
                wx0Var.m(true);
                return;
            case 6:
                wx0Var.w();
                return;
            case 7:
                nx0 nx0Var = wx0Var.x;
                int i3 = (nx0Var.getSwipeOffsetY() > 0.0f ? 1 : (nx0Var.getSwipeOffsetY() == 0.0f ? 0 : -1));
                Paint paint = wx0Var.Q;
                if (i3 > 0) {
                    paint.setAlpha((int) ((1.0f - pqe.a(nx0Var.getSwipeOffsetY() / nx0Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                wx0Var.f.invalidate();
                wx0Var.E.l(false, false);
                if (wx0Var.d != null) {
                    if (1.0f - (Math.min(nx0Var.getTopActionBarOffsetY(), nx0Var.getTranslationY() - nx0Var.getTopActionBarOffsetY()) / nx0Var.getTopActionBarOffsetY()) > 0.5f) {
                        i = 1;
                    }
                    float f = i * 100.0f;
                    zna znaVar = wx0Var.d;
                    aoa aoaVar = znaVar.m;
                    if (((float) aoaVar.i) != f) {
                        aoaVar.i = f;
                        znaVar.h();
                    }
                }
                if (wx0Var.f0) {
                    int i4 = wx0Var.n.bottom;
                } else {
                    nx0Var.getSwipeOffsetY();
                }
                System.currentTimeMillis();
                return;
            case 8:
                wx0Var.E.l(true, false);
                return;
            case 9:
                Activity activity = wx0Var.m0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).t0(yv1.ga(wx0Var.J));
                }
                wx0Var.m(true);
                return;
            case 10:
                ox0 ox0Var = wx0Var.E;
                ox0Var.getClass();
                ox0Var.Q = System.currentTimeMillis();
                ox0Var.v("settings_button_pressed", null);
                return;
            case 11:
                hs6.d0(wx0Var.I).z0(wx0Var.J, hs6.f2 ? 1 : 0, null);
                return;
            case 12:
                l11.u(wx0Var.getContext(), jb6.M0(2131752846, null));
                return;
            case 13:
                da9.E0(wx0Var.I, wx0Var.getContext(), new c41(n21.a(wx0Var.getContext()), wx0Var.G), wx0Var.J);
                return;
            case 14:
                wx0.l(wx0Var.I, wx0Var.J, new vw0(wx0Var, (byte) 15));
                return;
            case 15:
                wx0Var.m(false);
                return;
            default:
                wx0Var.m(false);
                return;
        }
    }
}
