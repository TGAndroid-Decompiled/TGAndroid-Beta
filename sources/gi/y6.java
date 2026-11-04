package gi;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;
public final class y6 extends FrameLayout {
    public final int f13972a;
    public final org.telegram.ui.Components.u8 f13973b;
    public final org.telegram.ui.Components.k9 f13974c;
    public final TextView d;
    public ViewPropertyAnimator f13975e;

    public y6(Activity activity, int i3) {
        super(activity);
        this.f13972a = i3;
        this.f13973b = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(activity);
        this.f13974c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
        addView(k9Var, mf.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, mf.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.85f, -1));
        addView(textView2, mf.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(org.telegram.messenger.g0.J2(bd.M0(2131748815, null), false, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.33f), 1.0f, 2131232241));
        set(null);
    }

    public final void a(boolean z10, boolean z11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f13975e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f13975e = null;
        }
        float f10 = 0.0f;
        int i3 = 0;
        if (z11) {
            setVisibility(0);
            ViewPropertyAnimator animate = animate();
            if (z10) {
                f10 = 1.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setInterpolator(xq.h).withEndAction(new ci.e1(8, this, z10)).setDuration(320L);
            this.f13975e = duration;
            duration.start();
            return;
        }
        if (!z10) {
            i3 = 8;
        }
        setVisibility(i3);
        if (z10) {
            f10 = 1.0f;
        }
        setAlpha(f10);
    }

    public void set(TLRPC.InputPeer inputPeer) {
        long n4;
        String str;
        int i3 = this.f13972a;
        if (inputPeer == null) {
            n4 = h10.i(i3).e();
        } else {
            n4 = org.telegram.messenger.m5.n(inputPeer);
        }
        int i10 = (n4 > 0L ? 1 : (n4 == 0L ? 0 : -1));
        TextView textView = this.d;
        org.telegram.ui.Components.k9 k9Var = this.f13974c;
        org.telegram.ui.Components.u8 u8Var = this.f13973b;
        if (i10 >= 0) {
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(n4));
            u8Var.r(a22);
            k9Var.e(a22, u8Var);
            textView.setText(l10.p(a22));
            return;
        }
        TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-n4));
        u8Var.q(M0);
        k9Var.e(M0, u8Var);
        if (M0 == null) {
            str = "";
        } else {
            str = M0.title;
        }
        textView.setText(str);
    }
}
