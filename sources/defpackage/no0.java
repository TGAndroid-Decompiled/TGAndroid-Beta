package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class no0 extends FrameLayout {
    public final vnb a;
    public final de0 b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final p66 h;

    public no0(Activity activity, vnb vnbVar) {
        super(activity);
        this.a = vnbVar;
        LinearLayout m = bs2.m(activity, 0);
        m.setPadding(hl.L(16.0f), hl.L(5.0f), hl.L(8.0f), hl.L(5.0f));
        iye.b(m, 0.025f, 1.4f);
        addView(m, tre.e(-1, -1, 119));
        int i = aob.Fi;
        Drawable Y = aob.Y(aob.p1(0.1f, aob.v0(i, vnbVar)), 0, 0);
        uob K = yob.K(0.1f, i);
        setBackground(Y);
        yob.j(this, Y, null, K, vnbVar);
        LinearLayout m2 = bs2.m(activity, 1);
        m.addView(m2, tre.p(-1, -2, 1.0f, 3));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        m2.addView(linearLayout, tre.q(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i2 = aob.G6;
        yob.X(textView, i2, vnbVar);
        textView.setTypeface(hl.o());
        linearLayout.addView(textView, tre.p(-2, -2, 0.0f, 16));
        jn7.i(textView);
        TextView textView2 = new TextView(activity);
        this.f = textView2;
        textView2.setTextSize(1, 11.0f);
        yob.X(textView2, i, vnbVar);
        iye.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(hl.L(6.33f), 0, hl.L(6.33f), 0);
        ShapeDrawable b0 = aob.b0(hl.L(9.0f), aob.p1(0.1f, aob.v0(i, vnbVar)));
        uob K2 = yob.K(0.1f, i);
        textView2.setBackground(b0);
        yob.j(textView2, b0, K2, null, vnbVar);
        textView2.setText(ob6.M0(2131753148, null));
        linearLayout.addView(textView2, tre.q(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        yob.X(textView3, i2, vnbVar);
        textView3.setTypeface(hl.o());
        m2.addView(textView3, tre.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        jn7.i(textView3);
        p66 p66Var = new p66(activity, null);
        this.h = p66Var;
        p66Var.setTextSize(1, 13.0f);
        yob.G(p66Var, aob.Xc, vnbVar);
        yob.X(p66Var, i2, vnbVar);
        m2.addView(p66Var, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        jn7.i(p66Var);
        de0 de0Var = new de0(activity);
        this.b = de0Var;
        de0Var.setRoundRadius(hl.L(4.0f));
        de0Var.setVisibility(8);
        m.addView(de0Var, tre.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setBackground(aob.f0(5, aob.p1(0.2f, aob.v0(aob.W5, vnbVar)), -1));
        iye.a(imageView);
        imageView.setImageResource(2131232101);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        yob.s(imageView, aob.Ue, vnbVar, PorterDuff.Mode.SRC_IN);
        imageView.setOnClickListener(new y00((byte) 1));
        imageView.setVisibility(8);
        m.addView(imageView, tre.t(32, 32, 53, 10, 3, 0, 2));
    }

    public final void a(final defpackage.zu1 r24, final defpackage.r47 r25, defpackage.ny r26, defpackage.ny r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no0.a(zu1, r47, ny, ny):void");
    }
}
