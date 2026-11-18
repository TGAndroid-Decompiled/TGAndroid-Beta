package bi;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ma;
import c8.ra;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.sg;
import org.telegram.ui.bn;
public final class g1 extends org.telegram.ui.ActionBar.x2 {
    public int A1;
    public boolean B1;
    public final d1 C1;
    public final TL_stars.TL_starGiftUnique D1;
    public final long E1;
    public f1 F1;
    public boolean G1;
    public final b9 f3621m1;
    public final jh.l n1;
    public final ui.g f3622o1;
    public final dh.c f3623p1;
    public final jh.f f3624q1;
    public final rh.h f3625r1;
    public final b1 f3626s1;
    public final FrameLayout f3627t1;
    public final mp f3628u1;
    public final TextView f3629v1;
    public final org.telegram.ui.Components.n6 f3630w1;
    public final ImageView f3631x1;
    public final Drawable f3632y1;
    public final int f3633z1;

    public g1(Context context, org.telegram.ui.ActionBar.i6 i6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (org.telegram.ui.ActionBar.i6) null, true, true);
        boolean z10;
        bn bnVar;
        this.n1 = new jh.l();
        rh.h hVar = new rh.h(new y0(this, 0));
        this.f3625r1 = hVar;
        org.telegram.messenger.g0.S(getWindow());
        this.D1 = tL_starGiftUnique;
        this.E1 = j3;
        this.f3633z1 = org.telegram.messenger.mp.u1(this.f30189a).G6;
        ?? obj = new Object();
        this.f3622o1 = obj;
        dh.c cVar = new dh.c(obj, obj, obj);
        this.f3623p1 = cVar;
        a1 a1Var = new a1(this, context);
        this.f30192b = a1Var;
        int i7 = this.f30227u0;
        a1Var.setPadding(i7, 0, i7, 0);
        jh.k kVar = new jh.k(this.f30192b);
        ViewGroup viewGroup = this.f30192b;
        cVar.h = kVar;
        cVar.f8380i = viewGroup;
        rh.d dVar = new rh.d(this.f30195c);
        ViewGroup viewGroup2 = this.f30192b;
        hVar.E = dVar;
        hVar.F = viewGroup2;
        dVar.d.add(hVar);
        Drawable e10 = hi.w5.e(null, this.f30189a, j3, org.telegram.ui.ActionBar.n6.I.q());
        this.f3632y1 = e10;
        a1Var.U(e10);
        b9 b9Var = new b9(this.f30189a, context, i6Var);
        this.f3621m1 = b9Var;
        b9Var.a(tL_starGiftUnique, j10.i(this.f30189a).e(), null, gd.M0(2131749728, null), false);
        b9Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        b9Var.setLayoutBackground(new org.telegram.ui.ActionBar.y5(b9Var, this.f30192b, org.telegram.messenger.g0.L(18.0f), K0("paintChatActionBackground")));
        a1Var.addView(b9Var, ma.e(-2, -2, 48));
        jh.f fVar = new jh.f(context);
        this.f3624q1 = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(hVar);
        fVar.setInputIslandBubbleDrawable(cVar.c(fVar, c8.i0.b(i6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(cVar.c(fVar, c8.i0.b(i6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        b1 b1Var = new b1(this, org.telegram.messenger.g0.u0(), a1Var);
        this.f3626s1 = b1Var;
        b1Var.setInAppInsetsController(hVar);
        b1Var.setOverrideHint(gd.M0(2131749733, null));
        b1Var.W5 = false;
        this.f30192b.setClipChildren(false);
        this.f30192b.setClipToPadding(false);
        b1Var.V5 = false;
        if (!org.telegram.messenger.g0.E && ((bnVar = b1Var.D3) == null || !bnVar.isInBubbleMode())) {
            z10 = true;
        } else {
            z10 = false;
        }
        b1Var.W2 = z10;
        b1Var.t1(false, false, false);
        b1Var.E1(true, false);
        b1Var.f32644n2.setPadding(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(20.0f), 0);
        b1Var.getSendButton().setAlpha(0.0f);
        b1Var.getEditField().setMaxLines(3);
        b1Var.setCustomWindowView(this.f30195c);
        b1Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(b1Var, ma.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.f30192b.addView(fVar.getFadeView(), ma.c(-1.0f, -1));
        this.f30192b.addView(fVar, ma.c(-1.0f, -1));
        b1Var.setDelegate(new c1(this, tL_starGiftUnique));
        gf gfVar = b1Var.F0;
        Object obj2 = new Object();
        InputFilter[] filters = gfVar.getFilters();
        if (filters == null) {
            gfVar.setFilters(new InputFilter[]{obj2});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = obj2;
            gfVar.setFilters(inputFilterArr);
        }
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, false, false);
        this.f3630w1 = n6Var;
        n6Var.setAllowCancel(true);
        n6Var.setScaleProperty(0.6f);
        n6Var.setVisibility(8);
        n6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.f29788y6, i6Var);
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        n6Var.setGravity(17);
        this.f30192b.addView(n6Var, ma.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        ?? sgVar = new sg(2131232696, context, i6Var, false);
        this.C1 = sgVar;
        int L = org.telegram.messenger.g0.L(38.0f);
        int L2 = org.telegram.messenger.g0.L(38.0f);
        sgVar.L = L;
        sgVar.M = L2;
        sgVar.P = org.telegram.messenger.g0.L(6.0f);
        sgVar.Q = org.telegram.messenger.g0.L(8.0f);
        sgVar.f39643s0 = true;
        this.f30192b.addView((View) sgVar, ma.e(110, 50, 85));
        sgVar.setScrimViewBackgroundColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29396d6, this.J0));
        sgVar.setOnClickListener(new View.OnClickListener(this) {
            public final g1 f4296b;

            {
                this.f4296b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g1 g1Var = this.f4296b;
                        if (g1Var.f3633z1 - g1Var.A1 < 0) {
                            org.telegram.messenger.g0.D3(g1Var.f3630w1);
                            return;
                        }
                        f1 f1Var = g1Var.F1;
                        if (f1Var != null) {
                            f1Var.b(g1Var.f3626s1.getTextWithEntities(), g1Var.B1);
                            return;
                        }
                        return;
                    case 1:
                        g1 g1Var2 = this.f4296b;
                        boolean z11 = g1Var2.B1;
                        g1Var2.B1 = !z11;
                        g1Var2.f3628u1.a(z11, true);
                        return;
                    default:
                        this.f4296b.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f3629v1 = textView;
        int i10 = org.telegram.ui.ActionBar.n6.Zc;
        org.telegram.messenger.f3.l(textView, i10, i6Var, 1, 14.0f);
        textView.setText(gd.M0(2131749729, null));
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setBackground(new org.telegram.ui.ActionBar.y5(textView, this.f30192b, org.telegram.messenger.g0.L(23.0f) / 2, K0("paintChatActionBackground")));
        this.f30192b.addView(textView, ma.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f3627t1 = frameLayout;
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView2, i10, i6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(gd.M0(2131749730, null));
        frameLayout.addView(textView2, ma.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        mp mpVar = new mp(18, context, i6Var);
        this.f3628u1 = mpVar;
        mpVar.getCheckBoxBase().j(true);
        mpVar.getCheckBoxBase().f32827e = 0.9f;
        mpVar.b(i10, i10, org.telegram.ui.ActionBar.n6.f29526k7);
        mpVar.setDrawUnchecked(true);
        mpVar.a(!this.B1, false);
        b9Var.getLayout().V = new y0(this, 1);
        b9Var.getLayout().U = new y0(this, 2);
        mpVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(mpVar, ma.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new org.telegram.ui.ActionBar.y5(frameLayout, this.f30192b, org.telegram.messenger.g0.L(16.0f), K0("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final g1 f4296b;

            {
                this.f4296b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g1 g1Var = this.f4296b;
                        if (g1Var.f3633z1 - g1Var.A1 < 0) {
                            org.telegram.messenger.g0.D3(g1Var.f3630w1);
                            return;
                        }
                        f1 f1Var = g1Var.F1;
                        if (f1Var != null) {
                            f1Var.b(g1Var.f3626s1.getTextWithEntities(), g1Var.B1);
                            return;
                        }
                        return;
                    case 1:
                        g1 g1Var2 = this.f4296b;
                        boolean z11 = g1Var2.B1;
                        g1Var2.B1 = !z11;
                        g1Var2.f3628u1.a(z11, true);
                        return;
                    default:
                        this.f4296b.dismiss();
                        return;
                }
            }
        });
        this.f30192b.addView(frameLayout, ma.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.f3631x1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        org.telegram.ui.ActionBar.y5 y5Var = new org.telegram.ui.ActionBar.y5(imageView, this.f30192b, org.telegram.messenger.g0.L(16.0f), K0("paintChatActionBackground"));
        int L3 = org.telegram.messenger.g0.L(32.0f);
        int L4 = org.telegram.messenger.g0.L(32.0f);
        Matrix matrix = ih.d.f16257a;
        imageView.setBackground(new ih.c(L3, L4, y5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final g1 f4296b;

            {
                this.f4296b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g1 g1Var = this.f4296b;
                        if (g1Var.f3633z1 - g1Var.A1 < 0) {
                            org.telegram.messenger.g0.D3(g1Var.f3630w1);
                            return;
                        }
                        f1 f1Var = g1Var.F1;
                        if (f1Var != null) {
                            f1Var.b(g1Var.f3626s1.getTextWithEntities(), g1Var.B1);
                            return;
                        }
                        return;
                    case 1:
                        g1 g1Var2 = this.f4296b;
                        boolean z11 = g1Var2.B1;
                        g1Var2.B1 = !z11;
                        g1Var2.f3628u1.a(z11, true);
                        return;
                    default:
                        this.f4296b.dismiss();
                        return;
                }
            }
        });
        this.f30192b.addView(imageView, ma.e(56, 56, 53));
        ra.b(frameLayout, 0.05f, 1.2f);
        ra.a(imageView);
        ViewGroup viewGroup3 = this.f30192b;
        a1.c cVar2 = new a1.c(this, 13);
        WeakHashMap weakHashMap = r0.i0.f56244a;
        r0.a0.i(viewGroup3, cVar2);
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void J0() {
        rh.h hVar = this.f3625r1;
        int i7 = hVar.f(647).f15893b;
        float inputBubbleHeight = this.f3624q1.getInputBubbleHeight() + hVar.d() + org.telegram.messenger.g0.L(9.0f);
        int height = this.f30192b.getHeight();
        b9 b9Var = this.f3621m1;
        FrameLayout frameLayout = this.f3627t1;
        b9Var.setTranslationY(Math.min((((org.telegram.messenger.g0.L(36.0f) + i7) - (org.telegram.messenger.g0.L(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - b9Var.getHeight()) / 2.0f), ((((this.f30192b.getHeight() - inputBubbleHeight) - org.telegram.messenger.g0.L(14.0f)) - frameLayout.getHeight()) - org.telegram.messenger.g0.L(10.0f)) - b9Var.getHeight()));
        b9Var.invalidate();
        float y10 = b9Var.getY() - org.telegram.messenger.g0.L(33.0f);
        TextView textView = this.f3629v1;
        textView.setTranslationY(y10);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + org.telegram.messenger.g0.L(14.0f)));
        frameLayout.invalidate();
        float f10 = i7;
        ImageView imageView = this.f3631x1;
        imageView.setTranslationY(f10);
        imageView.invalidate();
    }

    public final Paint K0(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.i6 i6Var = this.J0;
        if (i6Var != null) {
            paint = i6Var.g("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.n6.V0("paintChatActionBackground");
    }

    @Override
    public final void L() {
        super.L();
        this.f3626s1.Y0();
    }

    @Override
    public final void onBackPressed() {
        b1 b1Var = this.f3626s1;
        if (b1Var != null && b1Var.O0()) {
            b1Var.G0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            d1 d1Var = this.C1;
            if (d1Var != null) {
                d1Var.setScrimViewBackgroundColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29396d6, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void v() {
        u0(false);
        e1 e1Var = new e1(this, 0);
        org.telegram.ui.ActionBar.n2 n2Var = this.f30195c;
        gc.a(n2Var, e1Var);
        k30 k30Var = k30.f36658s;
        if (k30Var.c()) {
            k30Var.b();
            TLObject g22 = org.telegram.messenger.mp.u1(this.f30189a).g2(this.E1);
            StringBuilder sb2 = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.D1;
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            new lc(n2Var, this.J0).V(Arrays.asList(g22), gd.M0(2131749732, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749734, org.telegram.messenger.n5.u(g22), i5.c.l(tL_starGiftUnique.num, ',', sb2))), null).k(true);
        }
    }
}
