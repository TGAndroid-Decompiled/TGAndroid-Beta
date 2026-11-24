package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class q64 extends LinearLayout {
    public final ImageView a;
    public final l46 b;
    public final l46 c;

    public q64(int i, wjb wjbVar, Context context) {
        super(context);
        float f;
        float f2;
        setOrientation(0);
        if (i == 1) {
            f = 11.0f;
        } else {
            f = 32.0f;
        }
        int L = gl.L(f);
        int L2 = gl.L(i == 1 ? 11.0f : 32.0f);
        if (i == 1) {
            f2 = 8.0f;
        } else {
            f2 = 12.0f;
        }
        setPadding(L, 0, L2, gl.L(f2));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i2 = bkb.F6;
        zkb.s(imageView, i2, null, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, nme.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        l46 l46Var = new l46(context, null);
        this.b = l46Var;
        l46Var.setTypeface(gl.o());
        l46Var.setTextSize(1, 14.0f);
        zkb.X(l46Var, i2, wjbVar);
        int i3 = bkb.Wc;
        zkb.G(l46Var, i3, wjbVar);
        linearLayout.addView(l46Var, nme.t(-1, -2, 7, 0, 0, 0, 3));
        l46 l46Var2 = new l46(context, null);
        this.c = l46Var2;
        l46Var2.setTextSize(1, 14.0f);
        zkb.X(l46Var2, bkb.y6, wjbVar);
        zkb.G(l46Var2, i3, wjbVar);
        linearLayout.addView(l46Var2, nme.r(-1, -2, 7));
        addView(linearLayout, nme.q(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(int i, CharSequence charSequence, CharSequence charSequence2) {
        this.a.setImageResource(i);
        this.b.setText(charSequence);
        this.c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
