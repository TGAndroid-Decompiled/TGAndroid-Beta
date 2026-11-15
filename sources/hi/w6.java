package hi;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
public final class w6 extends FrameLayout {
    public final int f15296a;
    public final org.telegram.ui.Components.t8 f15297b;
    public final org.telegram.ui.Components.i9 f15298c;
    public final TextView d;
    public ViewPropertyAnimator f15299e;

    public w6(Activity activity, int i7) {
        super(activity);
        this.f15296a = i7;
        this.f15297b = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(activity);
        this.f15298c = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
        addView(i9Var, c8.ja.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.ja.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.r1(0.85f, -1));
        addView(textView2, c8.ja.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(org.telegram.messenger.g0.J2(hd.M0(2131748807, null), false, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.33f), 1.0f, 2131232242));
        set(null);
    }

    public final void a(boolean z10, boolean z11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f15299e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f15299e = null;
        }
        float f10 = 0.0f;
        int i7 = 0;
        if (z11) {
            setVisibility(0);
            ViewPropertyAnimator animate = animate();
            if (z10) {
                f10 = 1.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setInterpolator(er.h).withEndAction(new ai.q(9, this, z10)).setDuration(320L);
            this.f15299e = duration;
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
        int i7 = this.f15296a;
        if (inputPeer == null) {
            n10 = m10.i(i7).e();
        } else {
            n10 = org.telegram.messenger.m5.n(inputPeer);
        }
        int i10 = (n10 > 0L ? 1 : (n10 == 0L ? 0 : -1));
        TextView textView = this.d;
        org.telegram.ui.Components.i9 i9Var = this.f15298c;
        org.telegram.ui.Components.t8 t8Var = this.f15297b;
        if (i10 >= 0) {
            TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(n10));
            t8Var.r(a22);
            i9Var.f(a22, t8Var);
            textView.setText(q10.p(a22));
            return;
        }
        TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-n10));
        t8Var.q(M0);
        i9Var.f(M0, t8Var);
        if (M0 == null) {
            str = "";
        } else {
            str = M0.title;
        }
        textView.setText(str);
    }
}
