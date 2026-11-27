package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
public final class l96 extends FrameLayout {
    public final i96 a;
    public final de0 b;
    public final rb0 c;
    public final ImageView d;
    public final j96 e;
    public n96 f;

    public l96(Context context) {
        super(context);
        iye.a(this);
        i96 i96Var = new i96(this, context);
        this.a = i96Var;
        i96Var.setOrientation(0);
        addView(i96Var, tre.d(-2, -2.0f, 119, 0.0f, 0.0f, 6.0f, 0.0f));
        this.c = new rb0((vnb) null);
        de0 de0Var = new de0(context);
        this.b = de0Var;
        de0Var.setRoundRadius(hl.L(11.0f));
        i96Var.addView(de0Var, tre.q(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        i96Var.addView(imageView, tre.t(18, 18, 19, 0, 0, 3, 0));
        j96 j96Var = new j96(context);
        this.e = j96Var;
        j96Var.setLines(1);
        j96Var.setSingleLine();
        j96Var.setTextColor(-1);
        j96Var.setTextSize(1, 14.0f);
        j96Var.setTypeface(hl.o());
        i96Var.addView(j96Var, tre.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(n96 n96Var) {
        this.f = n96Var;
        int i = (n96Var.b > 0L ? 1 : (n96Var.b == 0L ? 0 : -1));
        int i2 = yac.t0;
        de0 de0Var = this.b;
        rb0 rb0Var = this.c;
        if (i >= 0) {
            TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(n96Var.b));
            rb0Var.q(X1);
            de0Var.f(X1, rb0Var);
        } else {
            TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-n96Var.b));
            rb0Var.p(M0);
            de0Var.f(M0, rb0Var);
        }
        int i3 = n96Var.e;
        ImageView imageView = this.d;
        if (i3 > 0) {
            imageView.setImageDrawable(new ee1(getContext(), n96Var.e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.e.setText(wf3.k(yac.t0, n96Var.b));
        this.a.invalidate();
    }
}
