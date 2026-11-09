package di;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ha;
import c8.ka;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
public final class r0 extends FrameLayout {
    public final o0 f9660a;
    public final org.telegram.ui.Components.l9 f9661b;
    public final org.telegram.ui.Components.w8 f9662c;
    public final ImageView d;
    public final p0 f9663e;
    public t0 f9664f;

    public r0(Context context) {
        super(context);
        ka.a(this);
        o0 o0Var = new o0(this, context);
        this.f9660a = o0Var;
        o0Var.setOrientation(0);
        addView(o0Var, ha.d(-2, -2.0f, 119, 0.0f, 0.0f, 6.0f, 0.0f));
        this.f9662c = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f9661b = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        o0Var.addView(l9Var, ha.q(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        o0Var.addView(imageView, ha.t(18, 18, 19, 0, 0, 3, 0));
        p0 p0Var = new p0(context);
        this.f9663e = p0Var;
        p0Var.setLines(1);
        p0Var.setSingleLine();
        p0Var.setTextColor(-1);
        p0Var.setTextSize(1, 14.0f);
        p0Var.setTypeface(org.telegram.messenger.g0.o());
        o0Var.addView(p0Var, ha.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(t0 t0Var) {
        this.f9664f = t0Var;
        int i7 = (t0Var.f9768b > 0L ? 1 : (t0Var.f9768b == 0L ? 0 : -1));
        org.telegram.ui.Components.l9 l9Var = this.f9661b;
        org.telegram.ui.Components.w8 w8Var = this.f9662c;
        if (i7 >= 0) {
            TLRPC.User a22 = qp.s1(p10.f24470s0).a2(Long.valueOf(t0Var.f9768b));
            w8Var.r(a22);
            l9Var.e(a22, w8Var);
        } else {
            TLRPC.Chat M0 = qp.s1(p10.f24470s0).M0(Long.valueOf(-t0Var.f9768b));
            w8Var.q(M0);
            l9Var.e(M0, w8Var);
        }
        int i10 = t0Var.f9770e;
        ImageView imageView = this.d;
        if (i10 > 0) {
            imageView.setImageDrawable(new j0(getContext(), t0Var.f9770e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.f9663e.setText(org.telegram.messenger.m5.l(p10.f24470s0, t0Var.f9768b));
        this.f9660a.invalidate();
    }
}
