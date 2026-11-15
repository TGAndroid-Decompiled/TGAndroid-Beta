package fi;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ja;
import c8.na;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
public final class r0 extends FrameLayout {
    public final o0 f12252a;
    public final org.telegram.ui.Components.i9 f12253b;
    public final org.telegram.ui.Components.t8 f12254c;
    public final ImageView d;
    public final p0 f12255e;
    public t0 f12256f;

    public r0(Context context) {
        super(context);
        na.a(this);
        o0 o0Var = new o0(this, context);
        this.f12252a = o0Var;
        o0Var.setOrientation(0);
        addView(o0Var, ja.d(-2, -2.0f, 119, 0.0f, 0.0f, 6.0f, 0.0f));
        this.f12254c = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f12253b = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        o0Var.addView(i9Var, ja.q(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        o0Var.addView(imageView, ja.t(18, 18, 19, 0, 0, 3, 0));
        p0 p0Var = new p0(context);
        this.f12255e = p0Var;
        p0Var.setLines(1);
        p0Var.setSingleLine();
        p0Var.setTextColor(-1);
        p0Var.setTextSize(1, 14.0f);
        p0Var.setTypeface(org.telegram.messenger.g0.o());
        o0Var.addView(p0Var, ja.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(t0 t0Var) {
        this.f12256f = t0Var;
        int i7 = (t0Var.f12347b > 0L ? 1 : (t0Var.f12347b == 0L ? 0 : -1));
        org.telegram.ui.Components.i9 i9Var = this.f12253b;
        org.telegram.ui.Components.t8 t8Var = this.f12254c;
        if (i7 >= 0) {
            TLRPC.User a22 = np.s1(m10.f24940t0).a2(Long.valueOf(t0Var.f12347b));
            t8Var.r(a22);
            i9Var.f(a22, t8Var);
        } else {
            TLRPC.Chat M0 = np.s1(m10.f24940t0).M0(Long.valueOf(-t0Var.f12347b));
            t8Var.q(M0);
            i9Var.f(M0, t8Var);
        }
        int i10 = t0Var.f12349e;
        ImageView imageView = this.d;
        if (i10 > 0) {
            imageView.setImageDrawable(new j0(getContext(), t0Var.f12349e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.f12255e.setText(org.telegram.messenger.m5.l(m10.f24940t0, t0Var.f12347b));
        this.f12252a.invalidate();
    }
}
