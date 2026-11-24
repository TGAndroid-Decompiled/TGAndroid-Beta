package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ud5 extends mz0 {
    public final byte S1 = 1;
    public final LinearLayout T1;
    public l7c U1;

    public ud5(Activity activity, ylb ylbVar, il9 il9Var) {
        super(activity, null, false, false, ylbVar);
        int i;
        J();
        this.u1 = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i2 = cmb.Ei;
        paint.setColor(cmb.v0(i2, ylbVar));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.T1 = linearLayout;
        linearLayout.setPadding(gm.L(6.0f) + this.u0, 0, gm.L(6.0f) + this.u0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231605);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable K = cmb.K(gm.L(80.0f), cmb.v0(i2, ylbVar));
        wmb M = anb.M(i2);
        imageView.setBackground(K);
        anb.j(imageView, K, M, null, ylbVar);
        frameLayout.addView(imageView, qoe.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(activity);
        textView.setText(jb6.M0(2131745559, null));
        textView.setTypeface(gm.o());
        int i3 = cmb.F6;
        anb.X(textView, i3, ylbVar);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        linearLayout.addView(textView, qoe.t(-2, -2, 1, 22, 14, 22, 0));
        TextView textView2 = new TextView(activity);
        textView2.setText(jb6.M0(2131745560, null));
        anb.X(textView2, i3, ylbVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, qoe.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new ct8(this, activity, 2131231865, jb6.M0(2131745567, null), jb6.M0(2131745568, null)), qoe.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        boolean p = z8c.h(this.a).p();
        String M0 = jb6.M0(2131745564, null);
        if (p) {
            i = 2131745565;
        } else {
            i = 2131745566;
        }
        linearLayout.addView(new ct8(this, activity, 2131231812, M0, gm.D2(gm.N2(jb6.M0(i, null), -1, 0, new yl6(this, p, il9Var, (byte) 22), null), true)), qoe.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        anb.h(cmb.c7, ylbVar, view);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(gm.L(24.0f), gm.L(20.0f), gm.L(24.0f), gm.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView3 = new TextView(activity);
        textView3.setText(jb6.M0(2131745561, null));
        textView3.setTypeface(gm.o());
        anb.X(textView3, i3, ylbVar);
        textView3.setTextSize(1, 20.0f);
        textView3.setTextAlignment(4);
        textView3.setGravity(17);
        linearLayout.addView(textView3, qoe.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder G2 = gm.G2(gm.S2(jb6.M0(2131745562, null)), gm.D2(gm.N2(jb6.M0(2131745563, null), -1, 0, new kf9(this, (byte) 17), null), true), "%1$s");
        l66 l66Var = new l66(activity, null);
        l66Var.setText(G2);
        anb.X(l66Var, i3, ylbVar);
        anb.G(l66Var, cmb.Wc, ylbVar);
        l66Var.setTextSize(1, 14.0f);
        l66Var.setGravity(1);
        l66Var.setLineSpacing(gm.L(2.0f), 1.0f);
        linearLayout.addView(l66Var, qoe.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView4 = new TextView(activity);
        textView4.setLines(1);
        textView4.setSingleLine(true);
        textView4.setGravity(17);
        textView4.setEllipsize(TextUtils.TruncateAt.END);
        anb.X(textView4, cmb.Ii, ylbVar);
        textView4.setTypeface(gm.o());
        textView4.setTextSize(1, 14.0f);
        textView4.setText(jb6.M0(2131745558, null));
        fg0 e = ulb.e(cmb.v0(i2, ylbVar), 24.0f);
        wmb M2 = anb.M(i2);
        wmb e2 = anb.e(i2);
        textView4.setBackground(e);
        anb.j(textView4, e, M2, e2, ylbVar);
        textView4.setOnClickListener(new wk8(this, (byte) 17));
        linearLayout.addView(textView4, qoe.t(-1, 48, 0, 14, 22, 14, 14));
        this.U1.O(false);
    }

    public static xp8 Y0(Activity activity, TLObject tLObject, int i) {
        xp8 xp8Var = new xp8(activity);
        xp8Var.setRoundRadius(i / 2);
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.k(tLObject);
        xp8Var.setImageDrawable(pc0Var);
        xp8Var.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        return xp8Var;
    }

    @Override
    public final q59 G0(r59 r59Var) {
        switch (this.S1) {
            case 0:
                l7c l7cVar = new l7c(this.n1, getContext(), this.a, 0, true, new vt4(this, (byte) 9), this.J0);
                this.U1 = l7cVar;
                l7cVar.r = false;
                return l7cVar;
            case 1:
                l7c l7cVar2 = new l7c(r59Var, getContext(), this.a, 0, true, new vh8(this, (byte) 15), this.J0);
                this.U1 = l7cVar2;
                return l7cVar2;
            default:
                x74 x74Var = new x74(r59Var, getContext(), this.a, 0, true, new h92(this, (byte) 28), this.J0, (byte) 0);
                this.U1 = x74Var;
                return x74Var;
        }
    }

    @Override
    public final CharSequence J0() {
        switch (this.S1) {
            case 0:
                return "";
            case 1:
                return jb6.M0(2131754943, null);
            default:
                return jb6.M0(2131750797, null);
        }
    }

    public ud5(Context context) {
        super(context, null, false, false, null);
        this.u1 = 0.1f;
        J();
        r59 r59Var = this.n1;
        int i = this.u0;
        r59Var.setPadding(i, 0, i, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.T1 = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        uwa uwaVar = new uwa(context, 70, 0);
        frameLayout.addView(uwaVar, qoe.c(-1.0f, -1));
        ft4 ft4Var = new ft4(context, 1, 2);
        vs4 vs4Var = ft4Var.b;
        vs4Var.z = cmb.Vk;
        vs4Var.A = cmb.Wk;
        vs4Var.b();
        ft4Var.setStarParticlesView(uwaVar);
        frameLayout.addView(ft4Var, qoe.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        ft4Var.setPaused(false);
        linearLayout.addView(frameLayout, qoe.c(150.0f, -1));
        TextView textView = new TextView(context);
        ts2.s(textView, 1, 20.0f);
        int i2 = cmb.i5;
        anb.X(textView, i2, this.J0);
        hg9.p(textView, 17, null, 2131750797);
        TextView m = wi8.m(linearLayout, textView, qoe.t(-2, -2, 1, 0, 2, 0, 0), context);
        m.setTextSize(1, 14.0f);
        anb.X(m, i2, this.J0);
        hg9.p(m, 17, null, 2131750796);
        linearLayout.addView(m, qoe.t(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        b61 b61Var = new b61(this.J0, context, true);
        b61Var.i(jb6.M0(2131750806, null), false, true);
        b61Var.setOnClickListener(new sf3(this, (byte) 10));
        frameLayout2.addView(b61Var, qoe.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        int i3 = this.u0;
        frameLayout2.setPadding(i3, 0, i3, 0);
        anb.h(cmb.g5, null, frameLayout2);
        this.b.addView(frameLayout2, qoe.e(-1, -2, 87));
        ((x74) this.U1).O(false);
    }

    public ud5(Activity activity, ylb ylbVar, TLRPC.User user, TLObject tLObject, ce2 ce2Var) {
        super(activity, null, false, false, 1, ylbVar);
        J();
        LinearLayout linearLayout = new LinearLayout(activity);
        this.T1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        xp8 Y0 = Y0(activity, user, gm.L(60.0f));
        xp8 Y02 = Y0(activity, tLObject, gm.L(60.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(2131232062);
        anb.s(imageView, cmb.y6, ylbVar, PorterDuff.Mode.SRC_ATOP);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        linearLayout2.addView(Y0, qoe.o(60, 60));
        linearLayout2.addView(imageView, qoe.t(24, 24, 16, 7, 0, 7, 0));
        linearLayout2.addView(Y02, qoe.o(60, 60));
        frameLayout.addView(linearLayout2, qoe.e(-2, -2, 17));
        linearLayout.addView(frameLayout, qoe.t(-1, -2, 1, 0, 23, 0, 19));
        TextView textView = new TextView(activity);
        textView.setTypeface(gm.o());
        textView.setGravity(17);
        textView.setText(jb6.M0(2131749126, null));
        textView.setTextSize(1, 20.0f);
        int i = cmb.F6;
        anb.X(textView, i, ylbVar);
        linearLayout.addView(textView, qoe.t(-1, -2, 17, 20, 0, 20, 6));
        String t = pg3.t(user);
        String t2 = pg3.t(tLObject);
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        hg9.q(null, null, 2131749127, new Object[]{t, t2}, textView2);
        textView2.setTextSize(1, 14.0f);
        anb.X(textView2, i, ylbVar);
        textView2.setLineSpacing(gm.L(2.66f), 1.0f);
        linearLayout.addView(textView2, qoe.t(-1, -2, 17, 24, 0, 24, 29));
        b61 b61Var = new b61(ylbVar, activity, true);
        b61Var.f();
        b61Var.i(jb6.a0(null, null, 2131749125, t2), false, true);
        b61Var.setOnClickListener(new tf3(this, ce2Var, (byte) 24));
        linearLayout.addView(b61Var, qoe.k(14.0f, 0.0f, 14.0f, 10.0f, -1, 48));
        b61 b61Var2 = new b61(ylbVar, activity, true);
        b61Var2.f();
        b61Var2.e();
        b61Var2.i(jb6.a0(null, null, 2131749128, t), false, true);
        b61Var2.setOnClickListener(new ca5(this, (byte) 9));
        linearLayout.addView(b61Var2, qoe.k(14.0f, 0.0f, 14.0f, 14.0f, -1, 48));
        r59 r59Var = this.n1;
        int i2 = this.u0;
        r59Var.setPadding(i2, 0, i2, 0);
        this.U1.O(false);
    }
}
