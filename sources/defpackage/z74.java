package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class z74 extends LinearLayout {
    public final ImageView a;
    public final l66 b;
    public final l66 c;

    public z74(int i, ylb ylbVar, Context context) {
        super(context);
        float f;
        float f2;
        setOrientation(0);
        if (i == 1) {
            f = 11.0f;
        } else {
            f = 32.0f;
        }
        int L = gm.L(f);
        int L2 = gm.L(i == 1 ? 11.0f : 32.0f);
        if (i == 1) {
            f2 = 8.0f;
        } else {
            f2 = 12.0f;
        }
        setPadding(L, 0, L2, gm.L(f2));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i2 = cmb.F6;
        anb.s(imageView, i2, null, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, qoe.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        l66 l66Var = new l66(context, null);
        this.b = l66Var;
        l66Var.setTypeface(gm.o());
        l66Var.setTextSize(1, 14.0f);
        anb.X(l66Var, i2, ylbVar);
        int i3 = cmb.Wc;
        anb.G(l66Var, i3, ylbVar);
        linearLayout.addView(l66Var, qoe.t(-1, -2, 7, 0, 0, 0, 3));
        l66 l66Var2 = new l66(context, null);
        this.c = l66Var2;
        l66Var2.setTextSize(1, 14.0f);
        anb.X(l66Var2, cmb.y6, ylbVar);
        anb.G(l66Var2, i3, ylbVar);
        linearLayout.addView(l66Var2, qoe.r(-1, -2, 7));
        addView(linearLayout, qoe.q(-1, -2, 1.0f, 55, 0, 0, 0, 0));
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
