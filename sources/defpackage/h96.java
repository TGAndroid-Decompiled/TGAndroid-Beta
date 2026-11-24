package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
public final class h96 extends FrameLayout {
    public final e96 a;
    public final bf0 b;
    public final pc0 c;
    public final ImageView d;
    public final f96 e;
    public j96 f;

    public h96(Context context) {
        super(context);
        rve.a(this);
        e96 e96Var = new e96(this, context);
        this.a = e96Var;
        e96Var.setOrientation(0);
        addView(e96Var, qoe.d(-2, -2.0f, 119, 0.0f, 0.0f, 6.0f, 0.0f));
        this.c = new pc0((ylb) null);
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        bf0Var.setRoundRadius(gm.L(11.0f));
        e96Var.addView(bf0Var, qoe.q(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        e96Var.addView(imageView, qoe.t(18, 18, 19, 0, 0, 3, 0));
        f96 f96Var = new f96(context);
        this.e = f96Var;
        f96Var.setLines(1);
        f96Var.setSingleLine();
        f96Var.setTextColor(-1);
        f96Var.setTextSize(1, 14.0f);
        f96Var.setTypeface(gm.o());
        e96Var.addView(f96Var, qoe.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(j96 j96Var) {
        this.f = j96Var;
        int i = (j96Var.b > 0L ? 1 : (j96Var.b == 0L ? 0 : -1));
        int i2 = z8c.t0;
        bf0 bf0Var = this.b;
        pc0 pc0Var = this.c;
        if (i >= 0) {
            TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(j96Var.b));
            pc0Var.q(W1);
            bf0Var.f(W1, pc0Var);
        } else {
            TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-j96Var.b));
            pc0Var.p(L0);
            bf0Var.f(L0, pc0Var);
        }
        int i3 = j96Var.e;
        ImageView imageView = this.d;
        if (i3 > 0) {
            imageView.setImageDrawable(new df1(getContext(), j96Var.e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.e.setText(pg3.k(z8c.t0, j96Var.b));
        this.a.invalidate();
    }
}
