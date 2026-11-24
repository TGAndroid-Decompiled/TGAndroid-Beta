package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class np0 extends FrameLayout {
    public final ylb a;
    public final bf0 b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final l66 h;

    public np0(Activity activity, ylb ylbVar) {
        super(activity);
        this.a = ylbVar;
        LinearLayout l = td4.l(activity, 0);
        l.setPadding(gm.L(16.0f), gm.L(5.0f), gm.L(8.0f), gm.L(5.0f));
        rve.b(l, 0.025f, 1.4f);
        addView(l, qoe.e(-1, -1, 119));
        int i = cmb.Ei;
        Drawable Y = cmb.Y(cmb.p1(0.1f, cmb.v0(i, ylbVar)), 0, 0);
        wmb K = anb.K(0.1f, i);
        setBackground(Y);
        anb.j(this, Y, null, K, ylbVar);
        LinearLayout l2 = td4.l(activity, 1);
        l.addView(l2, qoe.p(-1, -2, 1.0f, 3));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        l2.addView(linearLayout, qoe.q(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i2 = cmb.F6;
        anb.X(textView, i2, ylbVar);
        textView.setTypeface(gm.o());
        linearLayout.addView(textView, qoe.p(-2, -2, 0.0f, 16));
        nm7.i(textView);
        TextView textView2 = new TextView(activity);
        this.f = textView2;
        textView2.setTextSize(1, 11.0f);
        anb.X(textView2, i, ylbVar);
        rve.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(gm.L(6.33f), 0, gm.L(6.33f), 0);
        ShapeDrawable b0 = cmb.b0(gm.L(9.0f), cmb.p1(0.1f, cmb.v0(i, ylbVar)));
        wmb K2 = anb.K(0.1f, i);
        textView2.setBackground(b0);
        anb.j(textView2, b0, K2, null, ylbVar);
        textView2.setText(jb6.M0(2131753120, null));
        linearLayout.addView(textView2, qoe.q(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        anb.X(textView3, i2, ylbVar);
        textView3.setTypeface(gm.o());
        l2.addView(textView3, qoe.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        nm7.i(textView3);
        l66 l66Var = new l66(activity, null);
        this.h = l66Var;
        l66Var.setTextSize(1, 13.0f);
        anb.G(l66Var, cmb.Wc, ylbVar);
        anb.X(l66Var, i2, ylbVar);
        l2.addView(l66Var, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        nm7.i(l66Var);
        bf0 bf0Var = new bf0(activity);
        this.b = bf0Var;
        bf0Var.setRoundRadius(gm.L(4.0f));
        bf0Var.setVisibility(8);
        l.addView(bf0Var, qoe.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setBackground(cmb.f0(5, cmb.p1(0.2f, cmb.v0(cmb.V5, ylbVar)), -1));
        rve.a(imageView);
        imageView.setImageResource(2131232102);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        anb.s(imageView, cmb.Te, ylbVar, PorterDuff.Mode.SRC_IN);
        imageView.setOnClickListener(new x10((byte) 1));
        imageView.setVisibility(8);
        l.addView(imageView, qoe.t(32, 32, 53, 10, 3, 0, 2));
    }

    public final void a(final defpackage.yv1 r24, final defpackage.k47 r25, defpackage.en1 r26, defpackage.en1 r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np0.a(yv1, k47, en1, en1):void");
    }
}
