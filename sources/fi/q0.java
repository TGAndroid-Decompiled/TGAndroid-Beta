package fi;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ma;
import c8.ra;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q9;
public final class q0 extends FrameLayout {
    public final n0 f12448a;
    public final q9 f12449b;
    public final org.telegram.ui.Components.b9 f12450c;
    public final ImageView d;
    public final o0 f12451e;
    public s0 f12452f;

    public q0(Context context) {
        super(context);
        ra.a(this);
        n0 n0Var = new n0(this, context);
        this.f12448a = n0Var;
        n0Var.setOrientation(0);
        addView(n0Var, ma.d(-2, -2.0f, 119, 0.0f, 0.0f, 6.0f, 0.0f));
        this.f12450c = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        q9 q9Var = new q9(context);
        this.f12449b = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        n0Var.addView(q9Var, ma.q(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        n0Var.addView(imageView, ma.t(18, 18, 19, 0, 0, 3, 0));
        o0 o0Var = new o0(context);
        this.f12451e = o0Var;
        o0Var.setLines(1);
        o0Var.setSingleLine();
        o0Var.setTextColor(-1);
        o0Var.setTextSize(1, 14.0f);
        o0Var.setTypeface(org.telegram.messenger.g0.o());
        n0Var.addView(o0Var, ma.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(s0 s0Var) {
        this.f12452f = s0Var;
        int i7 = (s0Var.f12515b > 0L ? 1 : (s0Var.f12515b == 0L ? 0 : -1));
        q9 q9Var = this.f12449b;
        org.telegram.ui.Components.b9 b9Var = this.f12450c;
        if (i7 >= 0) {
            TLRPC.User c22 = mp.u1(j10.f24773t0).c2(Long.valueOf(s0Var.f12515b));
            b9Var.r(c22);
            q9Var.f(c22, b9Var);
        } else {
            TLRPC.Chat O0 = mp.u1(j10.f24773t0).O0(Long.valueOf(-s0Var.f12515b));
            b9Var.q(O0);
            q9Var.f(O0, b9Var);
        }
        int i10 = s0Var.f12517e;
        ImageView imageView = this.d;
        if (i10 > 0) {
            imageView.setImageDrawable(new i0(getContext(), s0Var.f12517e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.f12451e.setText(org.telegram.messenger.n5.l(j10.f24773t0, s0Var.f12515b));
        this.f12448a.invalidate();
    }
}
