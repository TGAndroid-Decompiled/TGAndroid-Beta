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
    public final wjb a;
    public final be0 b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final l46 h;

    public no0(Activity activity, wjb wjbVar) {
        super(activity);
        this.a = wjbVar;
        LinearLayout m = ir2.m(activity, 0);
        m.setPadding(gl.L(16.0f), gl.L(5.0f), gl.L(8.0f), gl.L(5.0f));
        ote.b(m, 0.025f, 1.4f);
        addView(m, nme.e(-1, -1, 119));
        int i = bkb.Ei;
        Drawable Y = bkb.Y(bkb.p1(0.1f, bkb.v0(i, wjbVar)), 0, 0);
        vkb K = zkb.K(0.1f, i);
        setBackground(Y);
        zkb.j(this, Y, null, K, wjbVar);
        LinearLayout m2 = ir2.m(activity, 1);
        m.addView(m2, nme.p(-1, -2, 1.0f, 3));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        m2.addView(linearLayout, nme.q(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i2 = bkb.F6;
        zkb.X(textView, i2, wjbVar);
        textView.setTypeface(gl.o());
        linearLayout.addView(textView, nme.p(-2, -2, 0.0f, 16));
        kk7.i(textView);
        TextView textView2 = new TextView(activity);
        this.f = textView2;
        textView2.setTextSize(1, 11.0f);
        zkb.X(textView2, i, wjbVar);
        ote.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(gl.L(6.33f), 0, gl.L(6.33f), 0);
        ShapeDrawable b0 = bkb.b0(gl.L(9.0f), bkb.p1(0.1f, bkb.v0(i, wjbVar)));
        vkb K2 = zkb.K(0.1f, i);
        textView2.setBackground(b0);
        zkb.j(textView2, b0, K2, null, wjbVar);
        textView2.setText(k96.M0(2131753152, null));
        linearLayout.addView(textView2, nme.q(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        zkb.X(textView3, i2, wjbVar);
        textView3.setTypeface(gl.o());
        m2.addView(textView3, nme.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        kk7.i(textView3);
        l46 l46Var = new l46(activity, null);
        this.h = l46Var;
        l46Var.setTextSize(1, 13.0f);
        zkb.G(l46Var, bkb.Wc, wjbVar);
        zkb.X(l46Var, i2, wjbVar);
        m2.addView(l46Var, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        kk7.i(l46Var);
        be0 be0Var = new be0(activity);
        this.b = be0Var;
        be0Var.setRoundRadius(gl.L(4.0f));
        be0Var.setVisibility(8);
        m.addView(be0Var, nme.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setBackground(bkb.f0(5, bkb.p1(0.2f, bkb.v0(bkb.V5, wjbVar)), -1));
        ote.a(imageView);
        imageView.setImageResource(2131232101);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        zkb.s(imageView, bkb.Te, wjbVar, PorterDuff.Mode.SRC_IN);
        imageView.setOnClickListener(new x00((byte) 1));
        imageView.setVisibility(8);
        m.addView(imageView, nme.t(32, 32, 53, 10, 3, 0, 2));
    }

    public final void a(final defpackage.mu1 r24, final defpackage.k27 r25, defpackage.wl1 r26, defpackage.wl1 r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no0.a(mu1, k27, wl1, wl1):void");
    }
}
