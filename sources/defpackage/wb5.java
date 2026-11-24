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
public final class wb5 extends fy0 {
    public final byte S1 = 0;
    public final LinearLayout T1;
    public l5c U1;

    public wb5(Activity activity, wjb wjbVar, tj9 tj9Var) {
        super(activity, null, false, false, wjbVar);
        int i;
        K();
        this.u1 = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i2 = bkb.Ei;
        paint.setColor(bkb.v0(i2, wjbVar));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.T1 = linearLayout;
        linearLayout.setPadding(gl.L(6.0f) + this.u0, 0, gl.L(6.0f) + this.u0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231604);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable K = bkb.K(gl.L(80.0f), bkb.v0(i2, wjbVar));
        vkb M = zkb.M(i2);
        imageView.setBackground(K);
        zkb.j(imageView, K, M, null, wjbVar);
        frameLayout.addView(imageView, nme.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(activity);
        textView.setText(k96.M0(2131745633, null));
        textView.setTypeface(gl.o());
        int i3 = bkb.F6;
        zkb.X(textView, i3, wjbVar);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        linearLayout.addView(textView, nme.t(-2, -2, 1, 22, 14, 22, 0));
        TextView textView2 = new TextView(activity);
        textView2.setText(k96.M0(2131745634, null));
        zkb.X(textView2, i3, wjbVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, nme.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new ar8(this, activity, 2131231864, k96.M0(2131745641, null), k96.M0(2131745642, null)), nme.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        boolean p = y6c.h(this.a).p();
        String M0 = k96.M0(2131745638, null);
        if (p) {
            i = 2131745639;
        } else {
            i = 2131745640;
        }
        linearLayout.addView(new ar8(this, activity, 2131231811, M0, gl.D2(gl.N2(k96.M0(i, null), -1, 0, new vj6(this, p, tj9Var, (byte) 22), null), true)), nme.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        zkb.h(bkb.c7, wjbVar, view);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(gl.L(24.0f), gl.L(20.0f), gl.L(24.0f), gl.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView3 = new TextView(activity);
        textView3.setText(k96.M0(2131745635, null));
        textView3.setTypeface(gl.o());
        zkb.X(textView3, i3, wjbVar);
        textView3.setTextSize(1, 20.0f);
        textView3.setTextAlignment(4);
        textView3.setGravity(17);
        linearLayout.addView(textView3, nme.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder G2 = gl.G2(gl.S2(k96.M0(2131745636, null)), gl.D2(gl.N2(k96.M0(2131745637, null), -1, 0, new zk9(this, (byte) 9), null), true), "%1$s");
        l46 l46Var = new l46(activity, null);
        l46Var.setText(G2);
        zkb.X(l46Var, i3, wjbVar);
        zkb.G(l46Var, bkb.Wc, wjbVar);
        l46Var.setTextSize(1, 14.0f);
        l46Var.setGravity(1);
        l46Var.setLineSpacing(gl.L(2.0f), 1.0f);
        linearLayout.addView(l46Var, nme.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView4 = new TextView(activity);
        textView4.setLines(1);
        textView4.setSingleLine(true);
        textView4.setGravity(17);
        textView4.setEllipsize(TextUtils.TruncateAt.END);
        zkb.X(textView4, bkb.Ii, wjbVar);
        textView4.setTypeface(gl.o());
        textView4.setTextSize(1, 14.0f);
        textView4.setText(k96.M0(2131745632, null));
        ff0 e = sjb.e(bkb.v0(i2, wjbVar), 24.0f);
        vkb M2 = zkb.M(i2);
        vkb e2 = zkb.e(i2);
        textView4.setBackground(e);
        zkb.j(textView4, e, M2, e2, wjbVar);
        textView4.setOnClickListener(new ik8(this, (byte) 14));
        linearLayout.addView(textView4, nme.t(-1, 48, 0, 14, 22, 14, 14));
        this.U1.O(false);
    }

    public static wn8 Y0(Activity activity, TLObject tLObject, int i) {
        wn8 wn8Var = new wn8(activity);
        wn8Var.setRoundRadius(i / 2);
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.k(tLObject);
        wn8Var.setImageDrawable(pb0Var);
        wn8Var.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        return wn8Var;
    }

    @Override
    public final n39 G0(o39 o39Var) {
        switch (this.S1) {
            case 0:
                l5c l5cVar = new l5c(this.n1, getContext(), this.a, 0, true, new ur4(this, (byte) 9), this.J0);
                this.U1 = l5cVar;
                l5cVar.r = false;
                return l5cVar;
            case 1:
                l5c l5cVar2 = new l5c(o39Var, getContext(), this.a, 0, true, new tf8(this, (byte) 15), this.J0);
                this.U1 = l5cVar2;
                return l5cVar2;
            default:
                o64 o64Var = new o64(o39Var, getContext(), this.a, 0, true, new w72(this, (byte) 28), this.J0, (byte) 0);
                this.U1 = o64Var;
                return o64Var;
        }
    }

    @Override
    public final CharSequence J0() {
        switch (this.S1) {
            case 0:
                return "";
            case 1:
                return k96.M0(2131754943, null);
            default:
                return k96.M0(2131750848, null);
        }
    }

    public wb5(Context context) {
        super(context, null, false, false, null);
        this.u1 = 0.1f;
        K();
        o39 o39Var = this.n1;
        int i = this.u0;
        o39Var.setPadding(i, 0, i, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.T1 = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        qua quaVar = new qua(context, 70, 0);
        frameLayout.addView(quaVar, nme.c(-1.0f, -1));
        er4 er4Var = new er4(context, 1, 2);
        uq4 uq4Var = er4Var.b;
        uq4Var.z = bkb.Vk;
        uq4Var.A = bkb.Wk;
        uq4Var.b();
        er4Var.setStarParticlesView(quaVar);
        frameLayout.addView(er4Var, nme.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        er4Var.setPaused(false);
        linearLayout.addView(frameLayout, nme.c(150.0f, -1));
        TextView textView = new TextView(context);
        ir2.t(textView, 1, 20.0f);
        int i2 = bkb.i5;
        zkb.X(textView, i2, this.J0);
        de9.q(textView, 17, null, 2131750848);
        TextView m = ug8.m(linearLayout, textView, nme.t(-2, -2, 1, 0, 2, 0, 0), context);
        m.setTextSize(1, 14.0f);
        zkb.X(m, i2, this.J0);
        de9.q(m, 17, null, 2131750847);
        linearLayout.addView(m, nme.t(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        u41 u41Var = new u41(this.J0, context, true);
        u41Var.i(k96.M0(2131750857, null), false, true);
        u41Var.setOnClickListener(new yj3(this, (byte) 7));
        frameLayout2.addView(u41Var, nme.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        int i3 = this.u0;
        frameLayout2.setPadding(i3, 0, i3, 0);
        zkb.h(bkb.g5, null, frameLayout2);
        this.b.addView(frameLayout2, nme.e(-1, -2, 87));
        ((o64) this.U1).O(false);
    }

    public wb5(Activity activity, wjb wjbVar, TLRPC.User user, TLObject tLObject, rc2 rc2Var) {
        super(activity, null, false, false, 1, wjbVar);
        K();
        LinearLayout linearLayout = new LinearLayout(activity);
        this.T1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        wn8 Y0 = Y0(activity, user, gl.L(60.0f));
        wn8 Y02 = Y0(activity, tLObject, gl.L(60.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(2131232061);
        zkb.s(imageView, bkb.y6, wjbVar, PorterDuff.Mode.SRC_ATOP);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        linearLayout2.addView(Y0, nme.o(60, 60));
        linearLayout2.addView(imageView, nme.t(24, 24, 16, 7, 0, 7, 0));
        linearLayout2.addView(Y02, nme.o(60, 60));
        frameLayout.addView(linearLayout2, nme.e(-2, -2, 17));
        linearLayout.addView(frameLayout, nme.t(-1, -2, 1, 0, 23, 0, 19));
        TextView textView = new TextView(activity);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        textView.setText(k96.M0(2131749177, null));
        textView.setTextSize(1, 20.0f);
        int i = bkb.F6;
        zkb.X(textView, i, wjbVar);
        linearLayout.addView(textView, nme.t(-1, -2, 17, 20, 0, 20, 6));
        String t = cf3.t(user);
        String t2 = cf3.t(tLObject);
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        de9.r(null, null, 2131749178, new Object[]{t, t2}, textView2);
        textView2.setTextSize(1, 14.0f);
        zkb.X(textView2, i, wjbVar);
        textView2.setLineSpacing(gl.L(2.66f), 1.0f);
        linearLayout.addView(textView2, nme.t(-1, -2, 17, 24, 0, 24, 29));
        u41 u41Var = new u41(wjbVar, activity, true);
        u41Var.f();
        u41Var.i(k96.a0(null, null, 2131749176, t2), false, true);
        u41Var.setOnClickListener(new xf3(this, rc2Var, (byte) 23));
        linearLayout.addView(u41Var, nme.k(14.0f, 0.0f, 14.0f, 10.0f, -1, 48));
        u41 u41Var2 = new u41(wjbVar, activity, true);
        u41Var2.f();
        u41Var2.e();
        u41Var2.i(k96.a0(null, null, 2131749179, t), false, true);
        u41Var2.setOnClickListener(new b95(this, (byte) 6));
        linearLayout.addView(u41Var2, nme.k(14.0f, 0.0f, 14.0f, 14.0f, -1, 48));
        o39 o39Var = this.n1;
        int i2 = this.u0;
        o39Var.setPadding(i2, 0, i2, 0);
        this.U1.O(false);
    }
}
