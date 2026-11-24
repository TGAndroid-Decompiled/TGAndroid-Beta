package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class q0a extends FrameLayout {
    public final int a;
    public final pc0 b;
    public final bf0 c;
    public final TextView d;
    public ViewPropertyAnimator e;

    public q0a(Activity activity, int i) {
        super(activity);
        this.a = i;
        this.b = new pc0((ylb) null);
        bf0 bf0Var = new bf0(activity);
        this.c = bf0Var;
        bf0Var.setRoundRadius(gm.L(15.0f));
        addView(bf0Var, qoe.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(gm.o());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, qoe.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(cmb.p1(0.85f, -1));
        addView(textView2, qoe.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(gm.F2(jb6.M0(2131748564, null), false, gm.L(2.6666667f), gm.L(0.33f), 1.0f, 2131232247));
        set(null);
    }

    public final void a(boolean z, boolean z2) {
        ViewPropertyAnimator viewPropertyAnimator = this.e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.e = null;
        }
        float f = 0.0f;
        int i = 0;
        if (z2) {
            setVisibility(0);
            ViewPropertyAnimator animate = animate();
            if (z) {
                f = 1.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f).setInterpolator(d53.h).withEndAction(new n28((byte) 11, this, z)).setDuration(320L);
            this.e = duration;
            duration.start();
            return;
        }
        if (!z) {
            i = 8;
        }
        setVisibility(i);
        if (z) {
            f = 1.0f;
        }
        setAlpha(f);
    }

    public void set(TLRPC.InputPeer inputPeer) {
        long m;
        String str;
        int i = this.a;
        if (inputPeer == null) {
            m = z8c.h(i).e();
        } else {
            m = pg3.m(inputPeer);
        }
        int i2 = (m > 0L ? 1 : (m == 0L ? 0 : -1));
        TextView textView = this.d;
        bf0 bf0Var = this.c;
        pc0 pc0Var = this.b;
        if (i2 >= 0) {
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(m));
            pc0Var.q(W1);
            bf0Var.f(W1, pc0Var);
            textView.setText(m9c.r(W1));
            return;
        }
        TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-m));
        pc0Var.p(L0);
        bf0Var.f(L0, pc0Var);
        if (L0 == null) {
            str = "";
        } else {
            str = L0.title;
        }
        textView.setText(str);
    }
}
