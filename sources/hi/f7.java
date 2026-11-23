package hi;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kr;
public final class f7 extends FrameLayout {
    public final int f14480a;
    public final org.telegram.ui.Components.a9 f14481b;
    public final org.telegram.ui.Components.p9 f14482c;
    public final TextView d;
    public ViewPropertyAnimator f14483e;

    public f7(Activity activity, int i7) {
        super(activity);
        this.f14480a = i7;
        this.f14481b = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(activity);
        this.f14482c = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
        addView(p9Var, c8.na.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.na.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.n6.r1(0.85f, -1));
        addView(textView2, c8.na.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(org.telegram.messenger.g0.J2(gd.N0(2131748614, null), false, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.33f), 1.0f, 2131232246));
        set(null);
    }

    public final void a(boolean z10, boolean z11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f14483e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f14483e = null;
        }
        float f10 = 0.0f;
        int i7 = 0;
        if (z11) {
            setVisibility(0);
            ViewPropertyAnimator animate = animate();
            if (z10) {
                f10 = 1.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setInterpolator(kr.h).withEndAction(new ch.k(8, this, z10)).setDuration(320L);
            this.f14483e = duration;
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
        int i7 = this.f14480a;
        if (inputPeer == null) {
            n10 = i10.i(i7).e();
        } else {
            n10 = org.telegram.messenger.n5.n(inputPeer);
        }
        int i10 = (n10 > 0L ? 1 : (n10 == 0L ? 0 : -1));
        TextView textView = this.d;
        org.telegram.ui.Components.p9 p9Var = this.f14482c;
        org.telegram.ui.Components.a9 a9Var = this.f14481b;
        if (i10 >= 0) {
            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(n10));
            a9Var.r(c22);
            p9Var.f(c22, a9Var);
            textView.setText(n10.q(c22));
            return;
        }
        TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-n10));
        a9Var.q(O0);
        p9Var.f(O0, a9Var);
        if (O0 == null) {
            str = "";
        } else {
            str = O0.title;
        }
        textView.setText(str);
    }
}
