package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class oy9 extends FrameLayout {
    public final int a;
    public final pb0 b;
    public final be0 c;
    public final TextView d;
    public ViewPropertyAnimator e;

    public oy9(Context context, int i) {
        super(context);
        this.a = i;
        this.b = new pb0((wjb) null);
        be0 be0Var = new be0(context);
        this.c = be0Var;
        be0Var.setRoundRadius(gl.L(15.0f));
        addView(be0Var, nme.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(gl.o());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, nme.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(bkb.p1(0.85f, -1));
        addView(textView2, nme.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(gl.F2(k96.M0(2131748615, null), false, gl.L(2.6666667f), gl.L(0.33f), 1.0f, 2131232246));
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
            ViewPropertyAnimator duration = animate.alpha(f).setInterpolator(s33.h).withEndAction(new k08((byte) 11, this, z)).setDuration(320L);
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
            m = y6c.h(i).e();
        } else {
            m = cf3.m(inputPeer);
        }
        int i2 = (m > 0L ? 1 : (m == 0L ? 0 : -1));
        TextView textView = this.d;
        be0 be0Var = this.c;
        pb0 pb0Var = this.b;
        if (i2 >= 0) {
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(m));
            pb0Var.q(V1);
            be0Var.f(V1, pb0Var);
            textView.setText(l7c.r(V1));
            return;
        }
        TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-m));
        pb0Var.p(K0);
        be0Var.f(K0, pb0Var);
        if (K0 == null) {
            str = "";
        } else {
            str = K0.title;
        }
        textView.setText(str);
    }
}
