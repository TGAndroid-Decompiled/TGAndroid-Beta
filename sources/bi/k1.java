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
import c8.na;
import c8.sa;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.tg;
import org.telegram.ui.bn;
public final class k1 extends org.telegram.ui.ActionBar.w2 {
    public int A1;
    public boolean B1;
    public final h1 C1;
    public final TL_stars.TL_starGiftUnique D1;
    public final long E1;
    public j1 F1;
    public boolean G1;
    public final g9 f3735m1;
    public final jh.l n1;
    public final ui.g f3736o1;
    public final dh.c f3737p1;
    public final jh.f f3738q1;
    public final rh.h f3739r1;
    public final f1 f3740s1;
    public final FrameLayout f3741t1;
    public final lp f3742u1;
    public final TextView f3743v1;
    public final org.telegram.ui.Components.n6 f3744w1;
    public final ImageView f3745x1;
    public final Drawable f3746y1;
    public final int f3747z1;

    public k1(Context context, org.telegram.ui.ActionBar.i6 i6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (org.telegram.ui.ActionBar.i6) null, true, true);
        boolean z10;
        bn bnVar;
        this.n1 = new jh.l();
        rh.h hVar = new rh.h(new c1(this, 0));
        this.f3739r1 = hVar;
        org.telegram.messenger.g0.S(getWindow());
        this.D1 = tL_starGiftUnique;
        this.E1 = j3;
        this.f3747z1 = mp.u1(this.f30223a).G6;
        ?? obj = new Object();
        this.f3736o1 = obj;
        dh.c cVar = new dh.c(obj, obj, obj);
        this.f3737p1 = cVar;
        e1 e1Var = new e1(this, context);
        this.f30226b = e1Var;
        int i7 = this.f30261u0;
        e1Var.setPadding(i7, 0, i7, 0);
        jh.k kVar = new jh.k(this.f30226b);
        ViewGroup viewGroup = this.f30226b;
        cVar.h = kVar;
        cVar.f8371i = viewGroup;
        rh.d dVar = new rh.d(this.f30229c);
        ViewGroup viewGroup2 = this.f30226b;
        hVar.E = dVar;
        hVar.F = viewGroup2;
        dVar.d.add(hVar);
        Drawable e10 = hi.f6.e(null, this.f30223a, j3, org.telegram.ui.ActionBar.n6.I.q());
        this.f3746y1 = e10;
        e1Var.U(e10);
        g9 g9Var = new g9(this.f30223a, context, i6Var);
        this.f3735m1 = g9Var;
        g9Var.a(tL_starGiftUnique, i10.i(this.f30223a).e(), null, gd.N0(2131749727, null), false);
        g9Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        g9Var.setLayoutBackground(new org.telegram.ui.ActionBar.y5(g9Var, this.f30226b, org.telegram.messenger.g0.L(18.0f), K0("paintChatActionBackground")));
        e1Var.addView(g9Var, na.e(-2, -2, 48));
        jh.f fVar = new jh.f(context);
        this.f3738q1 = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(hVar);
        fVar.setInputIslandBubbleDrawable(cVar.c(fVar, c8.j0.b(i6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(cVar.c(fVar, c8.j0.b(i6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        f1 f1Var = new f1(this, org.telegram.messenger.g0.u0(), e1Var);
        this.f3740s1 = f1Var;
        f1Var.setInAppInsetsController(hVar);
        f1Var.setOverrideHint(gd.N0(2131749732, null));
        f1Var.Y5 = false;
        this.f30226b.setClipChildren(false);
        this.f30226b.setClipToPadding(false);
        f1Var.X5 = false;
        if (!org.telegram.messenger.g0.E && ((bnVar = f1Var.F3) == null || !bnVar.isInBubbleMode())) {
            z10 = true;
        } else {
            z10 = false;
        }
        f1Var.Y2 = z10;
        f1Var.y1(false, false, false);
        f1Var.J1(true, false);
        f1Var.f32754p2.setPadding(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(20.0f), 0);
        f1Var.getSendButton().setAlpha(0.0f);
        f1Var.getEditField().setMaxLines(3);
        f1Var.setCustomWindowView(this.f30229c);
        f1Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(f1Var, na.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.f30226b.addView(fVar.getFadeView(), na.c(-1.0f, -1));
        this.f30226b.addView(fVar, na.c(-1.0f, -1));
        f1Var.setDelegate(new g1(this, tL_starGiftUnique));
        hf hfVar = f1Var.F0;
        Object obj2 = new Object();
        InputFilter[] filters = hfVar.getFilters();
        if (filters == null) {
            hfVar.setFilters(new InputFilter[]{obj2});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = obj2;
            hfVar.setFilters(inputFilterArr);
        }
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, false, false);
        this.f3744w1 = n6Var;
        n6Var.setAllowCancel(true);
        n6Var.setScaleProperty(0.6f);
        n6Var.setVisibility(8);
        n6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.f29843y6, i6Var);
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        n6Var.setGravity(17);
        this.f30226b.addView(n6Var, na.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        ?? tgVar = new tg(2131232699, context, i6Var, false);
        this.C1 = tgVar;
        int L = org.telegram.messenger.g0.L(38.0f);
        int L2 = org.telegram.messenger.g0.L(38.0f);
        tgVar.L = L;
        tgVar.M = L2;
        tgVar.P = org.telegram.messenger.g0.L(6.0f);
        tgVar.Q = org.telegram.messenger.g0.L(8.0f);
        tgVar.f39940s0 = true;
        this.f30226b.addView((View) tgVar, na.e(110, 50, 85));
        tgVar.setScrimViewBackgroundColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, this.J0));
        tgVar.setOnClickListener(new View.OnClickListener(this) {
            public final k1 f3454b;

            {
                this.f3454b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k1 k1Var = this.f3454b;
                        if (k1Var.f3747z1 - k1Var.A1 < 0) {
                            org.telegram.messenger.g0.D3(k1Var.f3744w1);
                            return;
                        }
                        j1 j1Var = k1Var.F1;
                        if (j1Var != null) {
                            j1Var.a(k1Var.f3740s1.getTextWithEntities(), k1Var.B1);
                            return;
                        }
                        return;
                    case 1:
                        k1 k1Var2 = this.f3454b;
                        boolean z11 = k1Var2.B1;
                        k1Var2.B1 = !z11;
                        k1Var2.f3742u1.a(z11, true);
                        return;
                    default:
                        this.f3454b.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f3743v1 = textView;
        int i10 = org.telegram.ui.ActionBar.n6.Zc;
        org.telegram.messenger.f3.l(textView, i10, i6Var, 1, 14.0f);
        textView.setText(gd.N0(2131749728, null));
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setBackground(new org.telegram.ui.ActionBar.y5(textView, this.f30226b, org.telegram.messenger.g0.L(23.0f) / 2, K0("paintChatActionBackground")));
        this.f30226b.addView(textView, na.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f3741t1 = frameLayout;
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView2, i10, i6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(gd.N0(2131749729, null));
        frameLayout.addView(textView2, na.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        lp lpVar = new lp(18, context, i6Var);
        this.f3742u1 = lpVar;
        lpVar.getCheckBoxBase().j(true);
        lpVar.getCheckBoxBase().f32927e = 0.9f;
        lpVar.b(i10, i10, org.telegram.ui.ActionBar.n6.f29581k7);
        lpVar.setDrawUnchecked(true);
        lpVar.a(!this.B1, false);
        g9Var.getLayout().V = new c1(this, 1);
        g9Var.getLayout().U = new c1(this, 2);
        lpVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(lpVar, na.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new org.telegram.ui.ActionBar.y5(frameLayout, this.f30226b, org.telegram.messenger.g0.L(16.0f), K0("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final k1 f3454b;

            {
                this.f3454b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k1 k1Var = this.f3454b;
                        if (k1Var.f3747z1 - k1Var.A1 < 0) {
                            org.telegram.messenger.g0.D3(k1Var.f3744w1);
                            return;
                        }
                        j1 j1Var = k1Var.F1;
                        if (j1Var != null) {
                            j1Var.a(k1Var.f3740s1.getTextWithEntities(), k1Var.B1);
                            return;
                        }
                        return;
                    case 1:
                        k1 k1Var2 = this.f3454b;
                        boolean z11 = k1Var2.B1;
                        k1Var2.B1 = !z11;
                        k1Var2.f3742u1.a(z11, true);
                        return;
                    default:
                        this.f3454b.dismiss();
                        return;
                }
            }
        });
        this.f30226b.addView(frameLayout, na.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.f3745x1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231272);
        org.telegram.ui.ActionBar.y5 y5Var = new org.telegram.ui.ActionBar.y5(imageView, this.f30226b, org.telegram.messenger.g0.L(16.0f), K0("paintChatActionBackground"));
        int L3 = org.telegram.messenger.g0.L(32.0f);
        int L4 = org.telegram.messenger.g0.L(32.0f);
        Matrix matrix = ih.d.f16345a;
        imageView.setBackground(new ih.c(L3, L4, y5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final k1 f3454b;

            {
                this.f3454b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k1 k1Var = this.f3454b;
                        if (k1Var.f3747z1 - k1Var.A1 < 0) {
                            org.telegram.messenger.g0.D3(k1Var.f3744w1);
                            return;
                        }
                        j1 j1Var = k1Var.F1;
                        if (j1Var != null) {
                            j1Var.a(k1Var.f3740s1.getTextWithEntities(), k1Var.B1);
                            return;
                        }
                        return;
                    case 1:
                        k1 k1Var2 = this.f3454b;
                        boolean z11 = k1Var2.B1;
                        k1Var2.B1 = !z11;
                        k1Var2.f3742u1.a(z11, true);
                        return;
                    default:
                        this.f3454b.dismiss();
                        return;
                }
            }
        });
        this.f30226b.addView(imageView, na.e(56, 56, 53));
        sa.b(frameLayout, 0.05f, 1.2f);
        sa.a(imageView);
        ViewGroup viewGroup3 = this.f30226b;
        a1.c cVar2 = new a1.c(this, 14);
        WeakHashMap weakHashMap = r0.i0.f56367a;
        r0.a0.i(viewGroup3, cVar2);
    }

    @Override
    public final boolean F() {
        return false;
    }

    public final void J0() {
        rh.h hVar = this.f3739r1;
        int i7 = hVar.f(647).f15979b;
        float inputBubbleHeight = this.f3738q1.getInputBubbleHeight() + hVar.d() + org.telegram.messenger.g0.L(9.0f);
        int height = this.f30226b.getHeight();
        g9 g9Var = this.f3735m1;
        FrameLayout frameLayout = this.f3741t1;
        g9Var.setTranslationY(Math.min((((org.telegram.messenger.g0.L(36.0f) + i7) - (org.telegram.messenger.g0.L(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - g9Var.getHeight()) / 2.0f), ((((this.f30226b.getHeight() - inputBubbleHeight) - org.telegram.messenger.g0.L(14.0f)) - frameLayout.getHeight()) - org.telegram.messenger.g0.L(10.0f)) - g9Var.getHeight()));
        g9Var.invalidate();
        float y10 = g9Var.getY() - org.telegram.messenger.g0.L(33.0f);
        TextView textView = this.f3743v1;
        textView.setTranslationY(y10);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + org.telegram.messenger.g0.L(14.0f)));
        frameLayout.invalidate();
        float f10 = i7;
        ImageView imageView = this.f3745x1;
        imageView.setTranslationY(f10);
        imageView.invalidate();
    }

    public final Paint K0(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.i6 i6Var = this.J0;
        if (i6Var != null) {
            paint = i6Var.e("paintChatActionBackground");
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
        this.f3740s1.d1();
    }

    @Override
    public final void onBackPressed() {
        f1 f1Var = this.f3740s1;
        if (f1Var != null && f1Var.T0()) {
            f1Var.L0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            h1 h1Var = this.C1;
            if (h1Var != null) {
                h1Var.setScrimViewBackgroundColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void v() {
        u0(false);
        i1 i1Var = new i1(this, 0);
        org.telegram.ui.ActionBar.m2 m2Var = this.f30229c;
        fc.a(m2Var, i1Var);
        k30 k30Var = k30.f36626s;
        if (k30Var.c()) {
            k30Var.b();
            TLObject g22 = mp.u1(this.f30223a).g2(this.E1);
            StringBuilder sb2 = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.D1;
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            new kc(m2Var, this.J0).V(Arrays.asList(g22), gd.N0(2131749731, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749733, org.telegram.messenger.n5.u(g22), i5.c.l(tL_starGiftUnique.num, ',', sb2))), null).k(true);
        }
    }
}
