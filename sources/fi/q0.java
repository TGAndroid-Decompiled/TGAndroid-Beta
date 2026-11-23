package fi;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.na;
import c8.sa;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p9;
public final class q0 extends FrameLayout {
    public final n0 f12450a;
    public final p9 f12451b;
    public final org.telegram.ui.Components.a9 f12452c;
    public final ImageView d;
    public final o0 f12453e;
    public s0 f12454f;

    public q0(Context context) {
        super(context);
        sa.a(this);
        n0 n0Var = new n0(this, context);
        this.f12450a = n0Var;
        n0Var.setOrientation(0);
        addView(n0Var, na.d(-2, -2.0f, 119, 0.0f, 0.0f, 6.0f, 0.0f));
        this.f12452c = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        p9 p9Var = new p9(context);
        this.f12451b = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        n0Var.addView(p9Var, na.q(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        n0Var.addView(imageView, na.t(18, 18, 19, 0, 0, 3, 0));
        o0 o0Var = new o0(context);
        this.f12453e = o0Var;
        o0Var.setLines(1);
        o0Var.setSingleLine();
        o0Var.setTextColor(-1);
        o0Var.setTextSize(1, 14.0f);
        o0Var.setTypeface(org.telegram.messenger.g0.o());
        n0Var.addView(o0Var, na.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(s0 s0Var) {
        this.f12454f = s0Var;
        int i7 = (s0Var.f12517b > 0L ? 1 : (s0Var.f12517b == 0L ? 0 : -1));
        p9 p9Var = this.f12451b;
        org.telegram.ui.Components.a9 a9Var = this.f12452c;
        if (i7 >= 0) {
            TLRPC.User c22 = mp.u1(i10.f24637t0).c2(Long.valueOf(s0Var.f12517b));
            a9Var.r(c22);
            p9Var.f(c22, a9Var);
        } else {
            TLRPC.Chat O0 = mp.u1(i10.f24637t0).O0(Long.valueOf(-s0Var.f12517b));
            a9Var.q(O0);
            p9Var.f(O0, a9Var);
        }
        int i10 = s0Var.f12519e;
        ImageView imageView = this.d;
        if (i10 > 0) {
            imageView.setImageDrawable(new i0(getContext(), s0Var.f12519e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.f12453e.setText(org.telegram.messenger.n5.l(i10.f24637t0, s0Var.f12517b));
        this.f12450a.invalidate();
    }
}
