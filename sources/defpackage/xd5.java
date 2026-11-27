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
public final class xd5 extends ny0 {
    public final byte S1 = 1;
    public final LinearLayout T1;
    public l9c U1;

    public xd5(Activity activity, vnb vnbVar, dn9 dn9Var) {
        super(activity, null, false, false, vnbVar);
        int i;
        J();
        this.u1 = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i2 = aob.Fi;
        paint.setColor(aob.v0(i2, vnbVar));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.T1 = linearLayout;
        linearLayout.setPadding(hl.L(6.0f) + this.u0, 0, hl.L(6.0f) + this.u0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231604);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable K = aob.K(hl.L(80.0f), aob.v0(i2, vnbVar));
        uob M = yob.M(i2);
        imageView.setBackground(K);
        yob.j(imageView, K, M, null, vnbVar);
        frameLayout.addView(imageView, tre.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(activity);
        textView.setText(ob6.M0(2131745553, null));
        textView.setTypeface(hl.o());
        int i3 = aob.G6;
        yob.X(textView, i3, vnbVar);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        linearLayout.addView(textView, tre.t(-2, -2, 1, 22, 14, 22, 0));
        TextView textView2 = new TextView(activity);
        textView2.setText(ob6.M0(2131745554, null));
        yob.X(textView2, i3, vnbVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, tre.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new ir8(this, activity, 2131231864, ob6.M0(2131745561, null), ob6.M0(2131745562, null)), tre.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        boolean p = yac.h(this.a).p();
        String M0 = ob6.M0(2131745558, null);
        if (p) {
            i = 2131745559;
        } else {
            i = 2131745560;
        }
        linearLayout.addView(new ir8(this, activity, 2131231811, M0, hl.D2(hl.N2(ob6.M0(i, null), -1, 0, new yn6(this, p, dn9Var, (byte) 21), null), true)), tre.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        yob.h(aob.d7, vnbVar, view);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(hl.L(24.0f), hl.L(20.0f), hl.L(24.0f), hl.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView3 = new TextView(activity);
        textView3.setText(ob6.M0(2131745555, null));
        textView3.setTypeface(hl.o());
        yob.X(textView3, i3, vnbVar);
        textView3.setTextSize(1, 20.0f);
        textView3.setTextAlignment(4);
        textView3.setGravity(17);
        linearLayout.addView(textView3, tre.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder G2 = hl.G2(hl.S2(ob6.M0(2131745556, null)), hl.D2(hl.N2(ob6.M0(2131745557, null), -1, 0, new v59(this, (byte) 25), null), true), "%1$s");
        p66 p66Var = new p66(activity, null);
        p66Var.setText(G2);
        yob.X(p66Var, i3, vnbVar);
        yob.G(p66Var, aob.Xc, vnbVar);
        p66Var.setTextSize(1, 14.0f);
        p66Var.setGravity(1);
        p66Var.setLineSpacing(hl.L(2.0f), 1.0f);
        linearLayout.addView(p66Var, tre.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView4 = new TextView(activity);
        textView4.setLines(1);
        textView4.setSingleLine(true);
        textView4.setGravity(17);
        textView4.setEllipsize(TextUtils.TruncateAt.END);
        yob.X(textView4, aob.Ji, vnbVar);
        textView4.setTypeface(hl.o());
        textView4.setTextSize(1, 14.0f);
        textView4.setText(ob6.M0(2131745552, null));
        hf0 e = rnb.e(aob.v0(i2, vnbVar), 24.0f);
        uob M2 = yob.M(i2);
        uob e2 = yob.e(i2);
        textView4.setBackground(e);
        yob.j(textView4, e, M2, e2, vnbVar);
        textView4.setOnClickListener(new jn8(this, (byte) 16));
        linearLayout.addView(textView4, tre.t(-1, 48, 0, 14, 22, 14, 14));
        this.U1.O(false);
    }

    public static hr8 Z0(Activity activity, TLObject tLObject, int i) {
        hr8 hr8Var = new hr8(activity);
        hr8Var.setRoundRadius(i / 2);
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.k(tLObject);
        hr8Var.setImageDrawable(rb0Var);
        hr8Var.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        return hr8Var;
    }

    @Override
    public final c79 H0(d79 d79Var) {
        switch (this.S1) {
            case 0:
                l9c l9cVar = new l9c(this.n1, getContext(), this.a, 0, true, new yt4(this, (byte) 9), this.J0);
                this.U1 = l9cVar;
                l9cVar.r = false;
                return l9cVar;
            case 1:
                l9c l9cVar2 = new l9c(d79Var, getContext(), this.a, 0, true, new hj8(this, (byte) 15), this.J0);
                this.U1 = l9cVar2;
                return l9cVar2;
            default:
                i74 i74Var = new i74(d79Var, getContext(), this.a, 0, true, new n82(this, (byte) 28), this.J0, (byte) 0);
                this.U1 = i74Var;
                return i74Var;
        }
    }

    @Override
    public final CharSequence K0() {
        switch (this.S1) {
            case 0:
                return "";
            case 1:
                return ob6.M0(2131754939, null);
            default:
                return ob6.M0(2131750825, null);
        }
    }

    public xd5(Context context) {
        super(context, null, false, false, null);
        this.u1 = 0.1f;
        J();
        d79 d79Var = this.n1;
        int i = this.u0;
        d79Var.setPadding(i, 0, i, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.T1 = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        uya uyaVar = new uya(context, 70, 0);
        frameLayout.addView(uyaVar, tre.c(-1.0f, -1));
        it4 it4Var = new it4(context, 1, 2);
        ys4 ys4Var = it4Var.b;
        ys4Var.z = aob.Wk;
        ys4Var.A = aob.Xk;
        ys4Var.b();
        it4Var.setStarParticlesView(uyaVar);
        frameLayout.addView(it4Var, tre.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        it4Var.setPaused(false);
        linearLayout.addView(frameLayout, tre.c(150.0f, -1));
        TextView textView = new TextView(context);
        bs2.t(textView, 1, 20.0f);
        int i2 = aob.j5;
        yob.X(textView, i2, this.J0);
        uh9.q(textView, 17, null, 2131750825);
        TextView m = ik8.m(linearLayout, textView, tre.t(-2, -2, 1, 0, 2, 0, 0), context);
        m.setTextSize(1, 14.0f);
        yob.X(m, i2, this.J0);
        uh9.q(m, 17, null, 2131750824);
        linearLayout.addView(m, tre.t(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        c51 c51Var = new c51(this.J0, context, true);
        c51Var.i(ob6.M0(2131750834, null), false, true);
        c51Var.setOnClickListener(new mh3(this, (byte) 9));
        frameLayout2.addView(c51Var, tre.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        int i3 = this.u0;
        frameLayout2.setPadding(i3, 0, i3, 0);
        yob.h(aob.h5, null, frameLayout2);
        this.b.addView(frameLayout2, tre.e(-1, -2, 87));
        ((i74) this.U1).O(false);
    }

    public xd5(Activity activity, vnb vnbVar, TLRPC.User user, TLObject tLObject, hd2 hd2Var) {
        super(activity, null, false, false, 1, vnbVar);
        J();
        LinearLayout linearLayout = new LinearLayout(activity);
        this.T1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        hr8 Z0 = Z0(activity, user, hl.L(60.0f));
        hr8 Z02 = Z0(activity, tLObject, hl.L(60.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(2131232061);
        yob.s(imageView, aob.z6, vnbVar, PorterDuff.Mode.SRC_ATOP);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        linearLayout2.addView(Z0, tre.o(60, 60));
        linearLayout2.addView(imageView, tre.t(24, 24, 16, 7, 0, 7, 0));
        linearLayout2.addView(Z02, tre.o(60, 60));
        frameLayout.addView(linearLayout2, tre.e(-2, -2, 17));
        linearLayout.addView(frameLayout, tre.t(-1, -2, 1, 0, 23, 0, 19));
        TextView textView = new TextView(activity);
        textView.setTypeface(hl.o());
        textView.setGravity(17);
        textView.setText(ob6.M0(2131749123, null));
        textView.setTextSize(1, 20.0f);
        int i = aob.G6;
        yob.X(textView, i, vnbVar);
        linearLayout.addView(textView, tre.t(-1, -2, 17, 20, 0, 20, 6));
        String t = wf3.t(user);
        String t2 = wf3.t(tLObject);
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        uh9.r(null, null, 2131749124, new Object[]{t, t2}, textView2);
        textView2.setTextSize(1, 14.0f);
        yob.X(textView2, i, vnbVar);
        textView2.setLineSpacing(hl.L(2.66f), 1.0f);
        linearLayout.addView(textView2, tre.t(-1, -2, 17, 24, 0, 24, 29));
        c51 c51Var = new c51(vnbVar, activity, true);
        c51Var.f();
        c51Var.i(ob6.a0(null, null, 2131749122, t2), false, true);
        c51Var.setOnClickListener(new je3(this, hd2Var, (byte) 26));
        linearLayout.addView(c51Var, tre.k(14.0f, 0.0f, 14.0f, 10.0f, -1, 48));
        c51 c51Var2 = new c51(vnbVar, activity, true);
        c51Var2.f();
        c51Var2.e();
        c51Var2.i(ob6.a0(null, null, 2131749125, t), false, true);
        c51Var2.setOnClickListener(new sa5(this, (byte) 7));
        linearLayout.addView(c51Var2, tre.k(14.0f, 0.0f, 14.0f, 14.0f, -1, 48));
        d79 d79Var = this.n1;
        int i2 = this.u0;
        d79Var.setPadding(i2, 0, i2, 0);
        this.U1.O(false);
    }
}
