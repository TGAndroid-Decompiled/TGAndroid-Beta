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
import org.telegram.ui.Components.wq;
public final class x6 extends FrameLayout {
    public final int f13088a;
    public final org.telegram.ui.Components.v8 f13089b;
    public final org.telegram.ui.Components.k9 f13090c;
    public final TextView d;
    public ViewPropertyAnimator f13091e;

    public x6(Activity activity, int i7) {
        super(activity);
        this.f13088a = i7;
        this.f13089b = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(activity);
        this.f13090c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
        addView(k9Var, c8.ha.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
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
        textView2.setTextColor(org.telegram.ui.ActionBar.m6.r1(0.85f, -1));
        addView(textView2, c8.ha.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(org.telegram.messenger.g0.J2(id.M0(2131748807, null), false, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.33f), 1.0f, 2131232241));
        set(null);
    }

    public final void a(boolean z9, boolean z10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f13091e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f13091e = null;
        }
        float f10 = 0.0f;
        int i7 = 0;
        if (z10) {
            setVisibility(0);
            ViewPropertyAnimator animate = animate();
            if (z9) {
                f10 = 1.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setInterpolator(wq.h).withEndAction(new bi.k1(8, this, z9)).setDuration(320L);
            this.f13091e = duration;
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
        int i7 = this.f13088a;
        if (inputPeer == null) {
            n10 = p10.i(i7).e();
        } else {
            n10 = org.telegram.messenger.m5.n(inputPeer);
        }
        int i10 = (n10 > 0L ? 1 : (n10 == 0L ? 0 : -1));
        TextView textView = this.d;
        org.telegram.ui.Components.k9 k9Var = this.f13090c;
        org.telegram.ui.Components.v8 v8Var = this.f13089b;
        if (i10 >= 0) {
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(n10));
            v8Var.r(a22);
            k9Var.e(a22, v8Var);
            textView.setText(t10.p(a22));
            return;
        }
        TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-n10));
        v8Var.q(M0);
        k9Var.e(M0, v8Var);
        if (M0 == null) {
            str = "";
        } else {
            str = M0.title;
        }
        textView.setText(str);
    }
}
