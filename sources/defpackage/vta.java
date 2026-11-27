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
public final class vta extends FrameLayout {
    public final lta[] E;
    public final gm F;
    public final mta G;
    public final LinearLayout H;
    public final in I;
    public final in J;
    public final e29 K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final LinearLayout O;
    public sx4[] P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public final FrameLayout T;
    public kg5 U;
    public final int[] V;
    public final int[] W;
    public final vnb a;
    public int a0;
    public final uta b;
    public long b0;
    public final ImageView c;
    public TLRPC.Document c0;
    public final iy9[] d;
    public String d0;
    public final iy9 e;
    public ArrayList e0;
    public final rta f;
    public kcc f0;
    public icc g0;
    public final pta h;
    public Runnable h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public Runnable l0;
    public e29 m0;
    public final tta[] n;
    public SpannableStringBuilder n0;
    public final tpa r;
    public boolean s;
    public final LinearLayout w;
    public final LinearLayout x;
    public final lta[] y;

    public vta(Context context, vnb vnbVar) {
        super(context);
        iy9[] iy9VarArr;
        float f;
        boolean z;
        float f2;
        int i;
        int i2 = 6;
        this.V = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.W = new int[]{aob.p1(0.08f, -1), aob.p1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.a = vnbVar;
        uta utaVar = new uta();
        this.b = utaVar;
        Drawable e = c00.e(context, 2131231113);
        e.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        utaVar.g = e;
        setBackground(utaVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        addView(frameLayout, tre.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(2131232518);
        imageView.setBackground(new jua(hl.L(24.0f), aob.p1(0.08f, -1)));
        frameLayout.addView(imageView, tre.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new jta(this, (byte) 0));
        iye.a(imageView);
        ImageView k = qd4.k(context, 2131232101);
        k.setBackground(new jua(hl.L(24.0f), aob.p1(0.08f, -1)));
        frameLayout.addView(k, tre.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        boolean z2 = true;
        k.setOnClickListener(new jta(this, (byte) 1));
        iye.a(k);
        TextView textView = new TextView(context);
        textView.setTypeface(hl.o());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(ob6.M0(2131749704, null));
        addView(textView, tre.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R = frameLayout2;
        addView(frameLayout2, tre.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.S = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, tre.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.T = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, tre.e(-1, -1, 119));
        tpa tpaVar = new tpa(context);
        this.r = tpaVar;
        tpaVar.setGravity(17);
        tpaVar.setTextSize(1, 13.0f);
        tpaVar.setTextColor(-1);
        frameLayout2.addView(tpaVar, tre.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.w = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        byte b = 2;
        layoutTransition.setDuration(2, 320L);
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        k43 k43Var = k43.h;
        layoutTransition.setInterpolator(2, k43Var);
        layoutTransition.setInterpolator(3, k43Var);
        layoutTransition.setInterpolator(0, k43Var);
        layoutTransition.setInterpolator(1, k43Var);
        layoutTransition.setInterpolator(4, k43Var);
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
        layoutTransition2.setInterpolator(2, k43Var);
        layoutTransition2.setInterpolator(3, k43Var);
        layoutTransition2.setInterpolator(0, k43Var);
        layoutTransition2.setInterpolator(1, k43Var);
        layoutTransition2.setInterpolator(4, k43Var);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.y = new lta[4];
        this.E = new lta[4];
        for (int i3 = 0; i3 < 4; i3++) {
            LinearLayout linearLayout3 = this.w;
            lta[] ltaVarArr = this.y;
            lta ltaVar = new lta(context);
            ltaVarArr[i3] = ltaVar;
            linearLayout3.addView(ltaVar, tre.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.y[i3].setOnClickListener(new jta(this, (byte) 2));
        }
        for (int i4 = 0; i4 < 4; i4++) {
            LinearLayout linearLayout4 = this.w;
            lta[] ltaVarArr2 = this.E;
            lta ltaVar2 = new lta(context);
            ltaVarArr2[i4] = ltaVar2;
            linearLayout4.addView(ltaVar2, tre.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.E[i4].setOnClickListener(new jta(this, (byte) 3));
        }
        this.n = new tta[4];
        this.d = new iy9[6];
        int i5 = 0;
        while (true) {
            iy9VarArr = this.d;
            if (i5 >= i2) {
                break;
            }
            if (i5 == 5) {
                z = z2;
            } else {
                z = false;
            }
            iy9 iy9Var = new iy9(context, b);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new jua(hl.L(24.0f), aob.p1(0.08f, -1)));
            iy9Var.addView(frameLayout5, tre.d(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
            de0 de0Var = new de0(context);
            de0Var.setImageResource(2131231609);
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.45f;
            }
            de0Var.setAlpha(f2);
            if (z) {
                i = 42;
            } else {
                i = 64;
            }
            frameLayout5.addView(de0Var, tre.e(i, i, 17));
            if (z) {
                de0Var.setTranslationX(hl.L(-4.0f));
                qta qtaVar = new qta(context);
                iy9Var.c = qtaVar;
                qtaVar.e = hl.L(37.0f);
                qtaVar.a.setStrokeWidth(hl.N(4.66f));
                frameLayout5.addView(qtaVar, tre.e(90, 90, 17));
                in inVar = new in(context, false, false, false);
                iy9Var.b = inVar;
                inVar.getDrawable().r(false, true);
                inVar.setTypeface(hl.o());
                inVar.setTextColor(-1);
                inVar.setTextSize(hl.L(14.0f));
                inVar.setGravity(17);
                inVar.setText("0%");
                frameLayout5.addView(inVar, tre.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            iy9VarArr[i5] = iy9Var;
            i5++;
            i2 = 6;
            z2 = true;
            b = 2;
        }
        this.e = iy9VarArr[5];
        rta rtaVar = new rta(context);
        this.f = rtaVar;
        rtaVar.setVisibility(8);
        rtaVar.setAlpha(0.0f);
        addView(rtaVar, tre.d(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        pta ptaVar = new pta(context, this.d);
        this.h = ptaVar;
        addView(ptaVar, tre.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        gm gmVar = new gm(context);
        this.F = gmVar;
        gmVar.setTextSize(1, 12.0f);
        gmVar.setTypeface(hl.o());
        gmVar.setText(hl.E2(ob6.M0(2131749700, null), false, hl.L(1.0f), hl.L(1.0f)));
        gmVar.setPadding(hl.L(9.0f), 0, hl.L(9.0f), 0);
        gmVar.setGravity(17);
        gmVar.setTextColor(-1);
        if (this.e0 != null) {
            f = 1.0f;
        } else {
            f = 0.25f;
        }
        gmVar.setAlpha(f);
        gmVar.setBackground(new jua(hl.L(14.0f), aob.p1(0.08f, -1)));
        iye.b(gmVar, 0.02f, 1.2f);
        this.R.addView(gmVar, tre.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        gmVar.setOnClickListener(new jy8(this, vnbVar, (byte) 19));
        this.R.addView(this.w, tre.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.R.addView(this.x, tre.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.H = linearLayout5;
        linearLayout5.setOrientation(1);
        mta mtaVar = new mta();
        this.G = mtaVar;
        linearLayout5.setBackground(mtaVar);
        mtaVar.a(aob.p1(0.08f, -1), aob.p1(0.08f, -1));
        iye.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, tre.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new jta(this, (byte) 4));
        in inVar2 = new in(context, false, false, false);
        this.I = inVar2;
        inVar2.setTypeface(hl.o());
        inVar2.setGravity(17);
        inVar2.setTextColor(aob.p1(0.75f, -1));
        inVar2.setText(ob6.M0(2131749743, null));
        inVar2.setTextSize(hl.L(14.0f));
        linearLayout5.addView(inVar2, tre.s(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        in inVar3 = new in(context, false, false, false);
        this.J = inVar3;
        inVar3.getDrawable().r(true, false);
        inVar3.setGravity(17);
        inVar3.setTextColor(aob.p1(0.75f, -1));
        inVar3.setText(hl.S2(ob6.a0(null, null, 2131749712, "0%")));
        inVar3.setTextSize(hl.L(12.0f));
        linearLayout5.addView(inVar3, tre.s(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ?? imageView2 = new ImageView(context);
        this.K = imageView2;
        imageView2.setAutoRepeat(true);
        imageView2.f(2131624036, 30, 30, null);
        linearLayout6.addView((View) imageView2, tre.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(hl.o());
        textView2.setGravity(17);
        textView2.setText(ob6.M0(2131749720, null));
        linearLayout6.addView(textView2, tre.t(-2, -2, 17, 0, 0, 0, 0));
        this.S.addView(linearLayout6, tre.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.L = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(aob.p1(0.5f, -1));
        textView3.setTypeface(hl.o());
        textView3.setGravity(17);
        TextView l = ik8.l(this.S, textView3, tre.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.M = l;
        l.setTextSize(1, 13.0f);
        l.setTextColor(-1);
        l.setTypeface(hl.o());
        l.setGravity(17);
        l.setPadding(hl.L(9.0f), 0, hl.L(9.0f), 0);
        l.setBackground(new jua(hl.L(14.0f), aob.p1(0.08f, -1)));
        TextView l2 = ik8.l(this.S, l, tre.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        l2.setTextSize(1, 13.0f);
        l2.setTextColor(aob.p1(0.5f, -1));
        uh9.q(l2, 17, null, 2131749721);
        TextView l3 = ik8.l(this.S, l2, tre.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        l3.setText(ob6.M0(2131749734, null));
        l3.setTextColor(-505270);
        l3.setTextSize(1, 20.0f);
        l3.setTypeface(hl.o());
        l3.setGravity(17);
        TextView l4 = ik8.l(this.T, l3, tre.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.N = l4;
        l4.setTextColor(-17253);
        l4.setTextSize(1, 13.0f);
        l4.setGravity(17);
        this.T.addView(l4, tre.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.O = linearLayout7;
        linearLayout7.setOrientation(0);
        this.T.addView(linearLayout7, tre.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.P = null;
        d(true);
    }

    public final void a(int i, long j, TLRPC.Document document, String str) {
        tta[] ttaVarArr;
        float f;
        this.a0 = i;
        this.b0 = j;
        this.c0 = document;
        this.d0 = str;
        this.i0 = false;
        this.k0 = false;
        int i2 = 0;
        while (true) {
            ttaVarArr = this.n;
            if (i2 >= ttaVarArr.length) {
                break;
            }
            tta ttaVar = ttaVarArr[i2];
            if (ttaVar != null) {
                hl.B2(ttaVar);
            }
            i2++;
        }
        pta ptaVar = this.h;
        View[] viewArr = ptaVar.a;
        ota otaVar = ptaVar.I;
        if (otaVar != null) {
            otaVar.e = true;
            otaVar.l = false;
            otaVar.a.I = null;
            ptaVar.I = null;
        }
        ValueAnimator valueAnimator = ptaVar.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            ptaVar.H = null;
        }
        ptaVar.G = -1;
        ptaVar.F = 0.0f;
        ptaVar.w.clear();
        ptaVar.x.clear();
        ptaVar.y.clear();
        for (int i3 = 0; i3 < 6; i3++) {
            ptaVar.E[i3] = 0.0f;
        }
        ptaVar.removeAllViews();
        for (int i4 = 0; i4 < viewArr.length; i4++) {
            viewArr[i4].setAlpha(1.0f);
            viewArr[i4].setVisibility(0);
            ptaVar.addView(viewArr[i4], tre.e(108, 108, 17));
        }
        Matrix.setIdentityM(ptaVar.c, 0);
        ptaVar.e = 0.0f;
        ptaVar.d = 0.0f;
        ptaVar.f = true;
        tta ttaVar2 = new tta(getContext());
        ttaVarArr[0] = ttaVar2;
        addView(ttaVar2, tre.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        tta ttaVar3 = new tta(getContext());
        ttaVarArr[1] = ttaVar3;
        addView(ttaVar3, tre.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        tta ttaVar4 = new tta(getContext());
        ttaVarArr[2] = ttaVar4;
        addView(ttaVar4, tre.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        tta ttaVar5 = new tta(getContext());
        ttaVarArr[3] = ttaVar5;
        addView(ttaVar5, tre.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i5 = 0; i5 < ttaVarArr.length; i5++) {
            iye.a(ttaVarArr[i5]);
            ttaVarArr[i5].setClickable(true);
            ttaVarArr[i5].setOnClickListener(new jta(this, (byte) 5));
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
        rta rtaVar = this.f;
        rtaVar.setVisibility(8);
        rtaVar.setAlpha(0.0f);
        String M0 = ob6.M0(2131749743, null);
        in inVar = this.I;
        inVar.setText(M0);
        inVar.setTranslationY(0.0f);
        this.J.setAlpha(1.0f);
        ov4.c(i).j(j, new sm1(this, j, j, (byte) 2));
    }

    public final void b(lta ltaVar) {
        if (ltaVar.d != null) {
            c(ltaVar, hl.S2(ob6.G(Math.round(ltaVar.f * 100.0f), "GiftCraftBackdropChance", ltaVar.d.name)));
        } else if (ltaVar.e != null) {
            c(ltaVar, hl.S2(ob6.G(Math.round(ltaVar.f * 100.0f), "GiftCraftSymbolChance", ltaVar.e.name)));
        }
    }

    public final void c(lta ltaVar, SpannableStringBuilder spannableStringBuilder) {
        float f;
        float f2;
        kg5 kg5Var = this.U;
        View view = null;
        if (kg5Var != null) {
            kg5Var.f(true);
            this.U = null;
        }
        if (!this.i0 && !this.k0) {
            if (ltaVar.getParent() instanceof View) {
                view = (View) ltaVar.getParent();
            }
            if (view != null) {
                f = view.getX();
            } else {
                f = 0.0f;
            }
            float x = ltaVar.getX() + f;
            if (view != null) {
                f2 = view.getY();
            } else {
                f2 = 0.0f;
            }
            float y = ltaVar.getY() + f2;
            kg5 kg5Var2 = new kg5(getContext(), 3);
            this.U = kg5Var2;
            kg5Var2.p(true);
            this.U.t(spannableStringBuilder);
            kg5 kg5Var3 = this.U;
            kg5Var3.h = kg5.a(kg5Var3.getText(), this.U.getTextPaint());
            kg5 kg5Var4 = this.U;
            kg5Var4.L = Layout.Alignment.ALIGN_CENTER;
            kg5Var4.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
            addView(this.U, tre.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            this.U.setTranslationY(y - hl.L(100.0f));
            this.U.o(0.0f, ((ltaVar.getWidth() / 2.0f) + x) - hl.L(2.0f));
            this.U.v();
        }
    }

    public final void d(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vta.d(boolean):void");
    }

    public TL_stars.StarGift getFirstGift() {
        TL_stars.StarGift starGift;
        int i = 0;
        while (true) {
            tta[] ttaVarArr = this.n;
            if (i >= ttaVarArr.length) {
                return null;
            }
            tta ttaVar = ttaVarArr[i];
            if (ttaVar != null) {
                TL_stars.StarGift starGift2 = ttaVar.h;
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
            tta[] ttaVarArr = this.n;
            if (i < ttaVarArr.length) {
                tta ttaVar = ttaVarArr[i];
                if (ttaVar != null) {
                    TL_stars.StarGift starGift = ttaVar.h;
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
            tta[] ttaVarArr = this.n;
            if (i < ttaVarArr.length) {
                tta ttaVar = ttaVarArr[i];
                if (ttaVar != null) {
                    TL_stars.StarGift starGift2 = ttaVar.h;
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

    public void setOnAddGift(icc iccVar) {
        this.g0 = iccVar;
    }

    public void setOnClose(Runnable runnable) {
        this.h0 = runnable;
    }

    public void setOnCraft(kcc kccVar) {
        this.f0 = kccVar;
    }
}
