package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
public final class h76 extends FrameLayout {
    public final e76 a;
    public final be0 b;
    public final pb0 c;
    public final ImageView d;
    public final f76 e;
    public j76 f;

    public h76(Context context) {
        super(context);
        ote.a(this);
        e76 e76Var = new e76(this, context);
        this.a = e76Var;
        e76Var.setOrientation(0);
        addView(e76Var, nme.d(-2, -2.0f, 119, 0.0f, 0.0f, 6.0f, 0.0f));
        this.c = new pb0((wjb) null);
        be0 be0Var = new be0(context);
        this.b = be0Var;
        be0Var.setRoundRadius(gl.L(11.0f));
        e76Var.addView(be0Var, nme.q(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        e76Var.addView(imageView, nme.t(18, 18, 19, 0, 0, 3, 0));
        f76 f76Var = new f76(context);
        this.e = f76Var;
        f76Var.setLines(1);
        f76Var.setSingleLine();
        f76Var.setTextColor(-1);
        f76Var.setTextSize(1, 14.0f);
        f76Var.setTypeface(gl.o());
        e76Var.addView(f76Var, nme.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(j76 j76Var) {
        this.f = j76Var;
        int i = (j76Var.b > 0L ? 1 : (j76Var.b == 0L ? 0 : -1));
        int i2 = y6c.t0;
        be0 be0Var = this.b;
        pb0 pb0Var = this.c;
        if (i >= 0) {
            TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(j76Var.b));
            pb0Var.q(V1);
            be0Var.f(V1, pb0Var);
        } else {
            TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-j76Var.b));
            pb0Var.p(K0);
            be0Var.f(K0, pb0Var);
        }
        int i3 = j76Var.e;
        ImageView imageView = this.d;
        if (i3 > 0) {
            imageView.setImageDrawable(new vd1(getContext(), j76Var.e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.e.setText(cf3.k(y6c.t0, j76Var.b));
        this.a.invalidate();
    }
}
