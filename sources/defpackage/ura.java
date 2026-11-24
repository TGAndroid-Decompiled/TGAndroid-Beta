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
public final class ura extends FrameLayout {
    public final kra[] E;
    public final fn F;
    public final lra G;
    public final LinearLayout H;
    public final io I;
    public final io J;
    public final s09 K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final LinearLayout O;
    public ox4[] P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public final FrameLayout T;
    public hg5 U;
    public final int[] V;
    public final int[] W;
    public final ylb a;
    public int a0;
    public final tra b;
    public long b0;
    public final ImageView c;
    public TLRPC.Document c0;
    public final qw9[] d;
    public String d0;
    public final qw9 e;
    public ArrayList e0;
    public final qra f;
    public lac f0;
    public jac g0;
    public final ora h;
    public Runnable h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public Runnable l0;
    public s09 m0;
    public final sra[] n;
    public SpannableStringBuilder n0;
    public final xna r;
    public boolean s;
    public final LinearLayout w;
    public final LinearLayout x;
    public final kra[] y;

    public ura(Context context, ylb ylbVar) {
        super(context);
        qw9[] qw9VarArr;
        float f;
        boolean z;
        float f2;
        int i;
        int i2 = 6;
        this.V = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.W = new int[]{cmb.p1(0.08f, -1), cmb.p1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.a = ylbVar;
        tra traVar = new tra();
        this.b = traVar;
        Drawable d = b10.d(context, 2131231114);
        d.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        traVar.g = d;
        setBackground(traVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        addView(frameLayout, qoe.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(2131232519);
        imageView.setBackground(new isa(gm.L(24.0f), cmb.p1(0.08f, -1)));
        frameLayout.addView(imageView, qoe.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new jra(this, (byte) 0));
        rve.a(imageView);
        ImageView k = td4.k(context, 2131232102);
        k.setBackground(new isa(gm.L(24.0f), cmb.p1(0.08f, -1)));
        frameLayout.addView(k, qoe.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        boolean z2 = true;
        k.setOnClickListener(new jra(this, (byte) 1));
        rve.a(k);
        TextView textView = new TextView(context);
        textView.setTypeface(gm.o());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(jb6.M0(2131749691, null));
        addView(textView, qoe.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R = frameLayout2;
        addView(frameLayout2, qoe.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.S = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, qoe.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.T = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, qoe.e(-1, -1, 119));
        xna xnaVar = new xna(context);
        this.r = xnaVar;
        xnaVar.setGravity(17);
        xnaVar.setTextSize(1, 13.0f);
        xnaVar.setTextColor(-1);
        frameLayout2.addView(xnaVar, qoe.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.w = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        byte b = 2;
        layoutTransition.setDuration(2, 320L);
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        d53 d53Var = d53.h;
        layoutTransition.setInterpolator(2, d53Var);
        layoutTransition.setInterpolator(3, d53Var);
        layoutTransition.setInterpolator(0, d53Var);
        layoutTransition.setInterpolator(1, d53Var);
        layoutTransition.setInterpolator(4, d53Var);
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
        layoutTransition2.setInterpolator(2, d53Var);
        layoutTransition2.setInterpolator(3, d53Var);
        layoutTransition2.setInterpolator(0, d53Var);
        layoutTransition2.setInterpolator(1, d53Var);
        layoutTransition2.setInterpolator(4, d53Var);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.y = new kra[4];
        this.E = new kra[4];
        for (int i3 = 0; i3 < 4; i3++) {
            LinearLayout linearLayout3 = this.w;
            kra[] kraVarArr = this.y;
            kra kraVar = new kra(context);
            kraVarArr[i3] = kraVar;
            linearLayout3.addView(kraVar, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.y[i3].setOnClickListener(new jra(this, (byte) 2));
        }
        for (int i4 = 0; i4 < 4; i4++) {
            LinearLayout linearLayout4 = this.w;
            kra[] kraVarArr2 = this.E;
            kra kraVar2 = new kra(context);
            kraVarArr2[i4] = kraVar2;
            linearLayout4.addView(kraVar2, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.E[i4].setOnClickListener(new jra(this, (byte) 3));
        }
        this.n = new sra[4];
        this.d = new qw9[6];
        int i5 = 0;
        while (true) {
            qw9VarArr = this.d;
            if (i5 >= i2) {
                break;
            }
            if (i5 == 5) {
                z = z2;
            } else {
                z = false;
            }
            qw9 qw9Var = new qw9(context, b);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new isa(gm.L(24.0f), cmb.p1(0.08f, -1)));
            qw9Var.addView(frameLayout5, qoe.d(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
            bf0 bf0Var = new bf0(context);
            bf0Var.setImageResource(2131231610);
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.45f;
            }
            bf0Var.setAlpha(f2);
            if (z) {
                i = 42;
            } else {
                i = 64;
            }
            frameLayout5.addView(bf0Var, qoe.e(i, i, 17));
            if (z) {
                bf0Var.setTranslationX(gm.L(-4.0f));
                pra praVar = new pra(context);
                qw9Var.c = praVar;
                praVar.e = gm.L(37.0f);
                praVar.a.setStrokeWidth(gm.N(4.66f));
                frameLayout5.addView(praVar, qoe.e(90, 90, 17));
                io ioVar = new io(context, false, false, false);
                qw9Var.b = ioVar;
                ioVar.getDrawable().r(false, true);
                ioVar.setTypeface(gm.o());
                ioVar.setTextColor(-1);
                ioVar.setTextSize(gm.L(14.0f));
                ioVar.setGravity(17);
                ioVar.setText("0%");
                frameLayout5.addView(ioVar, qoe.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            qw9VarArr[i5] = qw9Var;
            i5++;
            i2 = 6;
            z2 = true;
            b = 2;
        }
        this.e = qw9VarArr[5];
        qra qraVar = new qra(context);
        this.f = qraVar;
        qraVar.setVisibility(8);
        qraVar.setAlpha(0.0f);
        addView(qraVar, qoe.d(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ora oraVar = new ora(context, this.d);
        this.h = oraVar;
        addView(oraVar, qoe.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        fn fnVar = new fn(context);
        this.F = fnVar;
        fnVar.setTextSize(1, 12.0f);
        fnVar.setTypeface(gm.o());
        fnVar.setText(gm.E2(jb6.M0(2131749687, null), false, gm.L(1.0f), gm.L(1.0f)));
        fnVar.setPadding(gm.L(9.0f), 0, gm.L(9.0f), 0);
        fnVar.setGravity(17);
        fnVar.setTextColor(-1);
        if (this.e0 != null) {
            f = 1.0f;
        } else {
            f = 0.25f;
        }
        fnVar.setAlpha(f);
        fnVar.setBackground(new isa(gm.L(14.0f), cmb.p1(0.08f, -1)));
        rve.b(fnVar, 0.02f, 1.2f);
        this.R.addView(fnVar, qoe.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        fnVar.setOnClickListener(new r39(this, ylbVar, (byte) 17));
        this.R.addView(this.w, qoe.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.R.addView(this.x, qoe.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.H = linearLayout5;
        linearLayout5.setOrientation(1);
        lra lraVar = new lra();
        this.G = lraVar;
        linearLayout5.setBackground(lraVar);
        lraVar.a(cmb.p1(0.08f, -1), cmb.p1(0.08f, -1));
        rve.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, qoe.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new jra(this, (byte) 4));
        io ioVar2 = new io(context, false, false, false);
        this.I = ioVar2;
        ioVar2.setTypeface(gm.o());
        ioVar2.setGravity(17);
        ioVar2.setTextColor(cmb.p1(0.75f, -1));
        ioVar2.setText(jb6.M0(2131749730, null));
        ioVar2.setTextSize(gm.L(14.0f));
        linearLayout5.addView(ioVar2, qoe.s(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        io ioVar3 = new io(context, false, false, false);
        this.J = ioVar3;
        ioVar3.getDrawable().r(true, false);
        ioVar3.setGravity(17);
        ioVar3.setTextColor(cmb.p1(0.75f, -1));
        ioVar3.setText(gm.S2(jb6.a0(null, null, 2131749699, "0%")));
        ioVar3.setTextSize(gm.L(12.0f));
        linearLayout5.addView(ioVar3, qoe.s(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ?? imageView2 = new ImageView(context);
        this.K = imageView2;
        imageView2.setAutoRepeat(true);
        imageView2.f(2131624036, 30, 30, null);
        linearLayout6.addView((View) imageView2, qoe.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(gm.o());
        textView2.setGravity(17);
        textView2.setText(jb6.M0(2131749707, null));
        linearLayout6.addView(textView2, qoe.t(-2, -2, 17, 0, 0, 0, 0));
        this.S.addView(linearLayout6, qoe.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.L = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(cmb.p1(0.5f, -1));
        textView3.setTypeface(gm.o());
        textView3.setGravity(17);
        TextView l = wi8.l(this.S, textView3, qoe.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.M = l;
        l.setTextSize(1, 13.0f);
        l.setTextColor(-1);
        l.setTypeface(gm.o());
        l.setGravity(17);
        l.setPadding(gm.L(9.0f), 0, gm.L(9.0f), 0);
        l.setBackground(new isa(gm.L(14.0f), cmb.p1(0.08f, -1)));
        TextView l2 = wi8.l(this.S, l, qoe.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        l2.setTextSize(1, 13.0f);
        l2.setTextColor(cmb.p1(0.5f, -1));
        hg9.p(l2, 17, null, 2131749708);
        TextView l3 = wi8.l(this.S, l2, qoe.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        l3.setText(jb6.M0(2131749721, null));
        l3.setTextColor(-505270);
        l3.setTextSize(1, 20.0f);
        l3.setTypeface(gm.o());
        l3.setGravity(17);
        TextView l4 = wi8.l(this.T, l3, qoe.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.N = l4;
        l4.setTextColor(-17253);
        l4.setTextSize(1, 13.0f);
        l4.setGravity(17);
        this.T.addView(l4, qoe.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.O = linearLayout7;
        linearLayout7.setOrientation(0);
        this.T.addView(linearLayout7, qoe.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.P = null;
        d(true);
    }

    public final void a(int i, long j, TLRPC.Document document, String str) {
        sra[] sraVarArr;
        float f;
        this.a0 = i;
        this.b0 = j;
        this.c0 = document;
        this.d0 = str;
        this.i0 = false;
        this.k0 = false;
        int i2 = 0;
        while (true) {
            sraVarArr = this.n;
            if (i2 >= sraVarArr.length) {
                break;
            }
            sra sraVar = sraVarArr[i2];
            if (sraVar != null) {
                gm.B2(sraVar);
            }
            i2++;
        }
        ora oraVar = this.h;
        View[] viewArr = oraVar.a;
        nra nraVar = oraVar.I;
        if (nraVar != null) {
            nraVar.e = true;
            nraVar.l = false;
            nraVar.a.I = null;
            oraVar.I = null;
        }
        ValueAnimator valueAnimator = oraVar.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            oraVar.H = null;
        }
        oraVar.G = -1;
        oraVar.F = 0.0f;
        oraVar.w.clear();
        oraVar.x.clear();
        oraVar.y.clear();
        for (int i3 = 0; i3 < 6; i3++) {
            oraVar.E[i3] = 0.0f;
        }
        oraVar.removeAllViews();
        for (int i4 = 0; i4 < viewArr.length; i4++) {
            viewArr[i4].setAlpha(1.0f);
            viewArr[i4].setVisibility(0);
            oraVar.addView(viewArr[i4], qoe.e(108, 108, 17));
        }
        Matrix.setIdentityM(oraVar.c, 0);
        oraVar.e = 0.0f;
        oraVar.d = 0.0f;
        oraVar.f = true;
        sra sraVar2 = new sra(getContext());
        sraVarArr[0] = sraVar2;
        addView(sraVar2, qoe.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        sra sraVar3 = new sra(getContext());
        sraVarArr[1] = sraVar3;
        addView(sraVar3, qoe.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        sra sraVar4 = new sra(getContext());
        sraVarArr[2] = sraVar4;
        addView(sraVar4, qoe.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        sra sraVar5 = new sra(getContext());
        sraVarArr[3] = sraVar5;
        addView(sraVar5, qoe.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i5 = 0; i5 < sraVarArr.length; i5++) {
            rve.a(sraVarArr[i5]);
            sraVarArr[i5].setClickable(true);
            sraVarArr[i5].setOnClickListener(new jra(this, (byte) 5));
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
        qra qraVar = this.f;
        qraVar.setVisibility(8);
        qraVar.setAlpha(0.0f);
        String M0 = jb6.M0(2131749730, null);
        io ioVar = this.I;
        ioVar.setText(M0);
        ioVar.setTranslationY(0.0f);
        this.J.setAlpha(1.0f);
        lv4.c(i).j(j, new xn1(this, j, j, (byte) 2));
    }

    public final void b(kra kraVar) {
        if (kraVar.d != null) {
            c(kraVar, gm.S2(jb6.G(Math.round(kraVar.f * 100.0f), "GiftCraftBackdropChance", kraVar.d.name)));
        } else if (kraVar.e != null) {
            c(kraVar, gm.S2(jb6.G(Math.round(kraVar.f * 100.0f), "GiftCraftSymbolChance", kraVar.e.name)));
        }
    }

    public final void c(kra kraVar, SpannableStringBuilder spannableStringBuilder) {
        float f;
        float f2;
        hg5 hg5Var = this.U;
        View view = null;
        if (hg5Var != null) {
            hg5Var.f(true);
            this.U = null;
        }
        if (!this.i0 && !this.k0) {
            if (kraVar.getParent() instanceof View) {
                view = (View) kraVar.getParent();
            }
            if (view != null) {
                f = view.getX();
            } else {
                f = 0.0f;
            }
            float x = kraVar.getX() + f;
            if (view != null) {
                f2 = view.getY();
            } else {
                f2 = 0.0f;
            }
            float y = kraVar.getY() + f2;
            hg5 hg5Var2 = new hg5(getContext(), 3);
            this.U = hg5Var2;
            hg5Var2.p(true);
            this.U.t(spannableStringBuilder);
            hg5 hg5Var3 = this.U;
            hg5Var3.h = hg5.a(hg5Var3.getText(), this.U.getTextPaint());
            hg5 hg5Var4 = this.U;
            hg5Var4.L = Layout.Alignment.ALIGN_CENTER;
            hg5Var4.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
            addView(this.U, qoe.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            this.U.setTranslationY(y - gm.L(100.0f));
            this.U.o(0.0f, ((kraVar.getWidth() / 2.0f) + x) - gm.L(2.0f));
            this.U.v();
        }
    }

    public final void d(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ura.d(boolean):void");
    }

    public TL_stars.StarGift getFirstGift() {
        TL_stars.StarGift starGift;
        int i = 0;
        while (true) {
            sra[] sraVarArr = this.n;
            if (i >= sraVarArr.length) {
                return null;
            }
            sra sraVar = sraVarArr[i];
            if (sraVar != null) {
                TL_stars.StarGift starGift2 = sraVar.h;
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
            sra[] sraVarArr = this.n;
            if (i < sraVarArr.length) {
                sra sraVar = sraVarArr[i];
                if (sraVar != null) {
                    TL_stars.StarGift starGift = sraVar.h;
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
            sra[] sraVarArr = this.n;
            if (i < sraVarArr.length) {
                sra sraVar = sraVarArr[i];
                if (sraVar != null) {
                    TL_stars.StarGift starGift2 = sraVar.h;
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

    public void setOnAddGift(jac jacVar) {
        this.g0 = jacVar;
    }

    public void setOnClose(Runnable runnable) {
        this.h0 = runnable;
    }

    public void setOnCraft(lac lacVar) {
        this.f0 = lacVar;
    }
}
