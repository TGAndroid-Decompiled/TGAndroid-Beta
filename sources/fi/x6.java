package fi;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;
public final class x6 extends FrameLayout {
    public final int f13086a;
    public final org.telegram.ui.Components.w8 f13087b;
    public final org.telegram.ui.Components.l9 f13088c;
    public final TextView d;
    public ViewPropertyAnimator f13089e;

    public x6(Activity activity, int i7) {
        super(activity);
        this.f13086a = i7;
        this.f13087b = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(activity);
        this.f13088c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
        addView(l9Var, c8.ha.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.ha.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.85f, -1));
        addView(textView2, c8.ha.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(org.telegram.messenger.g0.J2(id.M0(2131748808, null), false, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.33f), 1.0f, 2131232241));
        set(null);
    }

    public final void a(boolean z9, boolean z10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f13089e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f13089e = null;
        }
        float f10 = 0.0f;
        int i7 = 0;
        if (z10) {
            setVisibility(0);
            ViewPropertyAnimator animate = animate();
            if (z9) {
                f10 = 1.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setInterpolator(xq.h).withEndAction(new bi.k1(8, this, z9)).setDuration(320L);
            this.f13089e = duration;
            duration.start();
            return;
        }
        if (!z9) {
            i7 = 8;
        }
        setVisibility(i7);
        if (z9) {
            f10 = 1.0f;
        }
        setAlpha(f10);
    }

    public void set(TLRPC.InputPeer inputPeer) {
        long n10;
        String str;
        int i7 = this.f13086a;
        if (inputPeer == null) {
            n10 = p10.i(i7).e();
        } else {
            n10 = org.telegram.messenger.m5.n(inputPeer);
        }
        int i10 = (n10 > 0L ? 1 : (n10 == 0L ? 0 : -1));
        TextView textView = this.d;
        org.telegram.ui.Components.l9 l9Var = this.f13088c;
        org.telegram.ui.Components.w8 w8Var = this.f13087b;
        if (i10 >= 0) {
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(n10));
            w8Var.r(a22);
            l9Var.e(a22, w8Var);
            textView.setText(t10.p(a22));
            return;
        }
        TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-n10));
        w8Var.q(M0);
        l9Var.e(M0, w8Var);
        if (M0 == null) {
            str = "";
        } else {
            str = M0.title;
        }
        textView.setText(str);
    }
}
