package defpackage;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.opengl.Matrix;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class upa extends FrameLayout {
    public final kpa[] E;
    public final fm F;
    public final lpa G;
    public final LinearLayout H;
    public final hn I;
    public final hn J;
    public final ry8 K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final LinearLayout O;
    public nv4[] P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public final FrameLayout T;
    public je5 U;
    public final int[] V;
    public final int[] W;
    public final wjb a;
    public int a0;
    public final tpa b;
    public long b0;
    public final ImageView c;
    public TLRPC.Document c0;
    public final gw9[] d;
    public String d0;
    public final gw9 e;
    public ArrayList e0;
    public final qpa f;
    public k8c f0;
    public i8c g0;
    public final opa h;
    public Runnable h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public Runnable l0;
    public ry8 m0;
    public final spa[] n;
    public SpannableStringBuilder n0;
    public final wla r;
    public boolean s;
    public final LinearLayout w;
    public final LinearLayout x;
    public final kpa[] y;

    public upa(Context context, wjb wjbVar) {
        super(context);
        gw9[] gw9VarArr;
        float f;
        byte b;
        float f2;
        int i;
        int i2 = 6;
        this.V = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.W = new int[]{bkb.p1(0.08f, -1), bkb.p1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.a = wjbVar;
        tpa tpaVar = new tpa();
        this.b = tpaVar;
        Drawable d = b00.d(context, 2131231113);
        d.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        tpaVar.g = d;
        setBackground(tpaVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        addView(frameLayout, nme.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(2131232507);
        imageView.setBackground(new iqa(gl.L(24.0f), bkb.p1(0.08f, -1)));
        frameLayout.addView(imageView, nme.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new jpa(this, (byte) 0));
        ote.a(imageView);
        ImageView k = tb4.k(context, 2131232101);
        k.setBackground(new iqa(gl.L(24.0f), bkb.p1(0.08f, -1)));
        frameLayout.addView(k, nme.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        byte b2 = 1;
        k.setOnClickListener(new jpa(this, (byte) 1));
        ote.a(k);
        TextView textView = new TextView(context);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(k96.M0(2131749742, null));
        addView(textView, nme.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R = frameLayout2;
        addView(frameLayout2, nme.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.S = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, nme.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.T = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, nme.e(-1, -1, 119));
        wla wlaVar = new wla(context);
        this.r = wlaVar;
        wlaVar.setGravity(17);
        wlaVar.setTextSize(1, 13.0f);
        wlaVar.setTextColor(-1);
        frameLayout2.addView(wlaVar, nme.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.w = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(2, 320L);
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        s33 s33Var = s33.h;
        layoutTransition.setInterpolator(2, s33Var);
        layoutTransition.setInterpolator(3, s33Var);
        layoutTransition.setInterpolator(0, s33Var);
        layoutTransition.setInterpolator(1, s33Var);
        layoutTransition.setInterpolator(4, s33Var);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.x = linearLayout2;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(2, 320L);
        layoutTransition2.setDuration(3, 320L);
        layoutTransition2.setDuration(0, 320L);
        layoutTransition2.setDuration(1, 320L);
        layoutTransition2.setDuration(4, 320L);
        layoutTransition2.setInterpolator(2, s33Var);
        layoutTransition2.setInterpolator(3, s33Var);
        layoutTransition2.setInterpolator(0, s33Var);
        layoutTransition2.setInterpolator(1, s33Var);
        layoutTransition2.setInterpolator(4, s33Var);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.y = new kpa[4];
        this.E = new kpa[4];
        for (int i3 = 0; i3 < 4; i3++) {
            LinearLayout linearLayout3 = this.w;
            kpa[] kpaVarArr = this.y;
            kpa kpaVar = new kpa(context);
            kpaVarArr[i3] = kpaVar;
            linearLayout3.addView(kpaVar, nme.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.y[i3].setOnClickListener(new jpa(this, (byte) 2));
        }
        for (int i4 = 0; i4 < 4; i4++) {
            LinearLayout linearLayout4 = this.w;
            kpa[] kpaVarArr2 = this.E;
            kpa kpaVar2 = new kpa(context);
            kpaVarArr2[i4] = kpaVar2;
            linearLayout4.addView(kpaVar2, nme.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.E[i4].setOnClickListener(new jpa(this, (byte) 3));
        }
        this.n = new spa[4];
        this.d = new gw9[6];
        int i5 = 0;
        while (true) {
            gw9VarArr = this.d;
            if (i5 >= i2) {
                break;
            }
            if (i5 == 5) {
                b = b2;
            } else {
                b = 0;
            }
            gw9 gw9Var = new gw9(context, b2);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new iqa(gl.L(24.0f), bkb.p1(0.08f, -1)));
            gw9Var.addView(frameLayout5, nme.d(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
            be0 be0Var = new be0(context);
            be0Var.setImageResource(2131231609);
            if (b != 0) {
                f2 = 1.0f;
            } else {
                f2 = 0.45f;
            }
            be0Var.setAlpha(f2);
            if (b != 0) {
                i = 42;
            } else {
                i = 64;
            }
            frameLayout5.addView(be0Var, nme.e(i, i, 17));
            if (b != 0) {
                be0Var.setTranslationX(gl.L(-4.0f));
                ppa ppaVar = new ppa(context);
                gw9Var.c = ppaVar;
                ppaVar.e = gl.L(37.0f);
                ppaVar.a.setStrokeWidth(gl.N(4.66f));
                frameLayout5.addView(ppaVar, nme.e(90, 90, 17));
                hn hnVar = new hn(context, false, false, false);
                gw9Var.b = hnVar;
                hnVar.getDrawable().r(false, true);
                hnVar.setTypeface(gl.o());
                hnVar.setTextColor(-1);
                hnVar.setTextSize(gl.L(14.0f));
                hnVar.setGravity(17);
                hnVar.setText("0%");
                frameLayout5.addView(hnVar, nme.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            gw9VarArr[i5] = gw9Var;
            i5++;
            i2 = 6;
            b2 = 1;
        }
        this.e = gw9VarArr[5];
        qpa qpaVar = new qpa(context);
        this.f = qpaVar;
        qpaVar.setVisibility(8);
        qpaVar.setAlpha(0.0f);
        addView(qpaVar, nme.d(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        opa opaVar = new opa(context, this.d);
        this.h = opaVar;
        addView(opaVar, nme.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        fm fmVar = new fm(context);
        this.F = fmVar;
        fmVar.setTextSize(1, 12.0f);
        fmVar.setTypeface(gl.o());
        fmVar.setText(gl.E2(k96.M0(2131749738, null), false, gl.L(1.0f), gl.L(1.0f)));
        fmVar.setPadding(gl.L(9.0f), 0, gl.L(9.0f), 0);
        fmVar.setGravity(17);
        fmVar.setTextColor(-1);
        if (this.e0 != null) {
            f = 1.0f;
        } else {
            f = 0.25f;
        }
        fmVar.setAlpha(f);
        fmVar.setBackground(new iqa(gl.L(14.0f), bkb.p1(0.08f, -1)));
        ote.b(fmVar, 0.02f, 1.2f);
        this.R.addView(fmVar, nme.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        fmVar.setOnClickListener(new b99(this, wjbVar, (byte) 16));
        this.R.addView(this.w, nme.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.R.addView(this.x, nme.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.H = linearLayout5;
        linearLayout5.setOrientation(1);
        lpa lpaVar = new lpa();
        this.G = lpaVar;
        linearLayout5.setBackground(lpaVar);
        lpaVar.a(bkb.p1(0.08f, -1), bkb.p1(0.08f, -1));
        ote.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, nme.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new jpa(this, (byte) 4));
        hn hnVar2 = new hn(context, false, false, false);
        this.I = hnVar2;
        hnVar2.setTypeface(gl.o());
        hnVar2.setGravity(17);
        hnVar2.setTextColor(bkb.p1(0.75f, -1));
        hnVar2.setText(k96.M0(2131749781, null));
        hnVar2.setTextSize(gl.L(14.0f));
        linearLayout5.addView(hnVar2, nme.s(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        hn hnVar3 = new hn(context, false, false, false);
        this.J = hnVar3;
        hnVar3.getDrawable().r(true, false);
        hnVar3.setGravity(17);
        hnVar3.setTextColor(bkb.p1(0.75f, -1));
        hnVar3.setText(gl.S2(k96.a0(null, null, 2131749750, "0%")));
        hnVar3.setTextSize(gl.L(12.0f));
        linearLayout5.addView(hnVar3, nme.s(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ?? imageView2 = new ImageView(context);
        this.K = imageView2;
        imageView2.setAutoRepeat(true);
        imageView2.f(2131624036, 30, 30, null);
        linearLayout6.addView((View) imageView2, nme.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(gl.o());
        textView2.setGravity(17);
        textView2.setText(k96.M0(2131749758, null));
        linearLayout6.addView(textView2, nme.t(-2, -2, 17, 0, 0, 0, 0));
        this.S.addView(linearLayout6, nme.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.L = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(bkb.p1(0.5f, -1));
        textView3.setTypeface(gl.o());
        textView3.setGravity(17);
        TextView l = ug8.l(this.S, textView3, nme.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.M = l;
        l.setTextSize(1, 13.0f);
        l.setTextColor(-1);
        l.setTypeface(gl.o());
        l.setGravity(17);
        l.setPadding(gl.L(9.0f), 0, gl.L(9.0f), 0);
        l.setBackground(new iqa(gl.L(14.0f), bkb.p1(0.08f, -1)));
        TextView l2 = ug8.l(this.S, l, nme.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        l2.setTextSize(1, 13.0f);
        l2.setTextColor(bkb.p1(0.5f, -1));
        de9.q(l2, 17, null, 2131749759);
        TextView l3 = ug8.l(this.S, l2, nme.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        l3.setText(k96.M0(2131749772, null));
        l3.setTextColor(-505270);
        l3.setTextSize(1, 20.0f);
        l3.setTypeface(gl.o());
        l3.setGravity(17);
        TextView l4 = ug8.l(this.T, l3, nme.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.N = l4;
        l4.setTextColor(-17253);
        l4.setTextSize(1, 13.0f);
        l4.setGravity(17);
        this.T.addView(l4, nme.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.O = linearLayout7;
        linearLayout7.setOrientation(0);
        this.T.addView(linearLayout7, nme.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.P = null;
        d(true);
    }

    public final void a(int i, long j, TLRPC.Document document, String str) {
        spa[] spaVarArr;
        float f;
        this.a0 = i;
        this.b0 = j;
        this.c0 = document;
        this.d0 = str;
        this.i0 = false;
        this.k0 = false;
        int i2 = 0;
        while (true) {
            spaVarArr = this.n;
            if (i2 >= spaVarArr.length) {
                break;
            }
            spa spaVar = spaVarArr[i2];
            if (spaVar != null) {
                gl.B2(spaVar);
            }
            i2++;
        }
        opa opaVar = this.h;
        View[] viewArr = opaVar.a;
        npa npaVar = opaVar.I;
        if (npaVar != null) {
            npaVar.e = true;
            npaVar.l = false;
            npaVar.a.I = null;
            opaVar.I = null;
        }
        ValueAnimator valueAnimator = opaVar.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            opaVar.H = null;
        }
        opaVar.G = -1;
        opaVar.F = 0.0f;
        opaVar.w.clear();
        opaVar.x.clear();
        opaVar.y.clear();
        for (int i3 = 0; i3 < 6; i3++) {
            opaVar.E[i3] = 0.0f;
        }
        opaVar.removeAllViews();
        for (int i4 = 0; i4 < viewArr.length; i4++) {
            viewArr[i4].setAlpha(1.0f);
            viewArr[i4].setVisibility(0);
            opaVar.addView(viewArr[i4], nme.e(108, 108, 17));
        }
        Matrix.setIdentityM(opaVar.c, 0);
        opaVar.e = 0.0f;
        opaVar.d = 0.0f;
        opaVar.f = true;
        spa spaVar2 = new spa(getContext());
        spaVarArr[0] = spaVar2;
        addView(spaVar2, nme.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        spa spaVar3 = new spa(getContext());
        spaVarArr[1] = spaVar3;
        addView(spaVar3, nme.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        spa spaVar4 = new spa(getContext());
        spaVarArr[2] = spaVar4;
        addView(spaVar4, nme.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        spa spaVar5 = new spa(getContext());
        spaVarArr[3] = spaVar5;
        addView(spaVar5, nme.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i5 = 0; i5 < spaVarArr.length; i5++) {
            ote.a(spaVarArr[i5]);
            spaVarArr[i5].setClickable(true);
            spaVarArr[i5].setOnClickListener(new jpa(this, (byte) 5));
        }
        d(false);
        this.i0 = false;
        FrameLayout frameLayout = this.R;
        frameLayout.animate().cancel();
        frameLayout.setAlpha(1.0f);
        LinearLayout linearLayout = this.H;
        linearLayout.animate().cancel();
        linearLayout.setAlpha(1.0f);
        FrameLayout frameLayout2 = this.S;
        frameLayout2.animate().cancel();
        frameLayout2.setAlpha(0.0f);
        FrameLayout frameLayout3 = this.T;
        frameLayout3.animate().cancel();
        frameLayout3.setAlpha(0.0f);
        FrameLayout frameLayout4 = this.Q;
        frameLayout4.animate().cancel();
        frameLayout4.setAlpha(1.0f);
        if (this.s) {
            f = 0.0f;
        } else if (this.e0 != null) {
            f = 1.0f;
        } else {
            f = 0.25f;
        }
        this.F.setAlpha(f);
        qpa qpaVar = this.f;
        qpaVar.setVisibility(8);
        qpaVar.setAlpha(0.0f);
        String M0 = k96.M0(2131749781, null);
        hn hnVar = this.I;
        hnVar.setText(M0);
        hnVar.setTranslationY(0.0f);
        this.J.setAlpha(1.0f);
        kt4.c(i).j(j, new um1(this, j, j, (byte) 2));
    }

    public final void b(kpa kpaVar) {
        if (kpaVar.d != null) {
            c(kpaVar, gl.S2(k96.G(Math.round(kpaVar.f * 100.0f), "GiftCraftBackdropChance", kpaVar.d.name)));
        } else if (kpaVar.e != null) {
            c(kpaVar, gl.S2(k96.G(Math.round(kpaVar.f * 100.0f), "GiftCraftSymbolChance", kpaVar.e.name)));
        }
    }

    public final void c(kpa kpaVar, SpannableStringBuilder spannableStringBuilder) {
        float f;
        float f2;
        je5 je5Var = this.U;
        View view = null;
        if (je5Var != null) {
            je5Var.f(true);
            this.U = null;
        }
        if (!this.i0 && !this.k0) {
            if (kpaVar.getParent() instanceof View) {
                view = (View) kpaVar.getParent();
            }
            if (view != null) {
                f = view.getX();
            } else {
                f = 0.0f;
            }
            float x = kpaVar.getX() + f;
            if (view != null) {
                f2 = view.getY();
            } else {
                f2 = 0.0f;
            }
            float y = kpaVar.getY() + f2;
            je5 je5Var2 = new je5(getContext(), 3);
            this.U = je5Var2;
            je5Var2.p(true);
            this.U.t(spannableStringBuilder);
            je5 je5Var3 = this.U;
            je5Var3.h = je5.a(je5Var3.getText(), this.U.getTextPaint());
            je5 je5Var4 = this.U;
            je5Var4.L = Layout.Alignment.ALIGN_CENTER;
            je5Var4.setPadding(gl.L(2.0f), 0, gl.L(2.0f), 0);
            addView(this.U, nme.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            this.U.setTranslationY(y - gl.L(100.0f));
            this.U.o(0.0f, ((kpaVar.getWidth() / 2.0f) + x) - gl.L(2.0f));
            this.U.v();
        }
    }

    public final void d(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upa.d(boolean):void");
    }

    public TL_stars.StarGift getFirstGift() {
        TL_stars.StarGift starGift;
        int i = 0;
        while (true) {
            spa[] spaVarArr = this.n;
            if (i >= spaVarArr.length) {
                return null;
            }
            spa spaVar = spaVarArr[i];
            if (spaVar != null) {
                TL_stars.StarGift starGift2 = spaVar.h;
                if (starGift2 != null) {
                    starGift = starGift2;
                } else {
                    starGift = null;
                }
                if (starGift != null) {
                    if (starGift2 == null) {
                        return null;
                    }
                    return starGift2;
                }
            }
            i++;
        }
    }

    public int getGiftsSelectedCount() {
        int i = 0;
        int i2 = 0;
        while (true) {
            spa[] spaVarArr = this.n;
            if (i < spaVarArr.length) {
                spa spaVar = spaVarArr[i];
                if (spaVar != null) {
                    TL_stars.StarGift starGift = spaVar.h;
                    if (starGift == null) {
                        starGift = null;
                    }
                    if (starGift != null) {
                        i2++;
                    }
                }
                i++;
            } else {
                return i2;
            }
        }
    }

    public int getGiftsSuccessChance() {
        TL_stars.StarGift starGift;
        int i = 0;
        int i2 = 0;
        while (true) {
            spa[] spaVarArr = this.n;
            if (i < spaVarArr.length) {
                spa spaVar = spaVarArr[i];
                if (spaVar != null) {
                    TL_stars.StarGift starGift2 = spaVar.h;
                    if (starGift2 != null) {
                        starGift = starGift2;
                    } else {
                        starGift = null;
                    }
                    if (starGift != null) {
                        if (starGift2 == null) {
                            starGift2 = null;
                        }
                        i2 += starGift2.craft_chance_permille;
                    }
                }
                i++;
            } else {
                return i2;
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void setOnAddGift(i8c i8cVar) {
        this.g0 = i8cVar;
    }

    public void setOnClose(Runnable runnable) {
        this.h0 = runnable;
    }

    public void setOnCraft(k8c k8cVar) {
        this.f0 = k8cVar;
    }
}
