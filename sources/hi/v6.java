package hi;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nr;
public final class v6 extends FrameLayout {
    public final int f15655a;
    public final org.telegram.ui.Components.b9 f15656b;
    public final org.telegram.ui.Components.q9 f15657c;
    public final TextView d;
    public ViewPropertyAnimator f15658e;

    public v6(Activity activity, int i7) {
        super(activity);
        this.f15655a = i7;
        this.f15656b = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(activity);
        this.f15657c = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
        addView(q9Var, c8.ma.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.ma.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.m6.r1(0.85f, -1));
        addView(textView2, c8.ma.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(org.telegram.messenger.g0.J2(hd.N0(2131748614, null), false, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.33f), 1.0f, 2131232243));
        set(null);
    }

    public final void a(boolean z10, boolean z11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f15658e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f15658e = null;
        }
        float f10 = 0.0f;
        int i7 = 0;
        if (z11) {
            setVisibility(0);
            ViewPropertyAnimator animate = animate();
            if (z10) {
                f10 = 1.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setInterpolator(nr.h).withEndAction(new ch.k(8, this, z10)).setDuration(320L);
            this.f15658e = duration;
            duration.start();
            return;
        }
        if (!z10) {
            i7 = 8;
        }
        setVisibility(i7);
        if (z10) {
            f10 = 1.0f;
        }
        setAlpha(f10);
    }

    public void set(TLRPC.InputPeer inputPeer) {
        long n10;
        String str;
        int i7 = this.f15655a;
        if (inputPeer == null) {
            n10 = k10.i(i7).e();
        } else {
            n10 = org.telegram.messenger.n5.n(inputPeer);
        }
        int i10 = (n10 > 0L ? 1 : (n10 == 0L ? 0 : -1));
        TextView textView = this.d;
        org.telegram.ui.Components.q9 q9Var = this.f15657c;
        org.telegram.ui.Components.b9 b9Var = this.f15656b;
        if (i10 >= 0) {
            TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(n10));
            b9Var.r(c22);
            q9Var.f(c22, b9Var);
            textView.setText(p10.q(c22));
            return;
        }
        TLRPC.Chat O0 = np.u1(i7).O0(Long.valueOf(-n10));
        b9Var.q(O0);
        q9Var.f(O0, b9Var);
        if (O0 == null) {
            str = "";
        } else {
            str = O0.title;
        }
        textView.setText(str);
    }
}
