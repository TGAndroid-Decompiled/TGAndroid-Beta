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
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.ug;
import org.telegram.ui.bn;
public final class k1 extends org.telegram.ui.ActionBar.w2 {
    public int A1;
    public boolean B1;
    public final h1 C1;
    public final TL_stars.TL_starGiftUnique D1;
    public final long E1;
    public j1 F1;
    public boolean G1;
    public final d9 f3771m1;
    public final jh.l n1;
    public final ui.g f3772o1;
    public final dh.c f3773p1;
    public final jh.f f3774q1;
    public final rh.h f3775r1;
    public final f1 f3776s1;
    public final FrameLayout f3777t1;
    public final op f3778u1;
    public final TextView f3779v1;
    public final org.telegram.ui.Components.o6 f3780w1;
    public final ImageView f3781x1;
    public final Drawable f3782y1;
    public final int f3783z1;

    public k1(Context context, org.telegram.ui.ActionBar.h6 h6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (org.telegram.ui.ActionBar.h6) null, true, true);
        boolean z10;
        bn bnVar;
        this.n1 = new jh.l();
        rh.h hVar = new rh.h(new c1(this, 0));
        this.f3775r1 = hVar;
        org.telegram.messenger.g0.S(getWindow());
        this.D1 = tL_starGiftUnique;
        this.E1 = j3;
        this.f3783z1 = np.u1(this.f30173a).G6;
        ?? obj = new Object();
        this.f3772o1 = obj;
        dh.c cVar = new dh.c(obj, obj, obj);
        this.f3773p1 = cVar;
        e1 e1Var = new e1(this, context);
        this.f30176b = e1Var;
        int i7 = this.f30211u0;
        e1Var.setPadding(i7, 0, i7, 0);
        jh.k kVar = new jh.k(this.f30176b);
        ViewGroup viewGroup = this.f30176b;
        cVar.h = kVar;
        cVar.f8409i = viewGroup;
        rh.d dVar = new rh.d(this.f30179c);
        ViewGroup viewGroup2 = this.f30176b;
        hVar.E = dVar;
        hVar.F = viewGroup2;
        dVar.d.add(hVar);
        Drawable e10 = hi.v5.e(null, this.f30173a, j3, org.telegram.ui.ActionBar.m6.I.q());
        this.f3782y1 = e10;
        e1Var.U(e10);
        d9 d9Var = new d9(this.f30173a, context, h6Var);
        this.f3771m1 = d9Var;
        d9Var.a(tL_starGiftUnique, k10.i(this.f30173a).e(), null, hd.N0(2131749727, null), false);
        d9Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        d9Var.setLayoutBackground(new org.telegram.ui.ActionBar.x5(d9Var, this.f30176b, org.telegram.messenger.g0.L(18.0f), K0("paintChatActionBackground")));
        e1Var.addView(d9Var, ma.e(-2, -2, 48));
        jh.f fVar = new jh.f(context);
        this.f3774q1 = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(hVar);
        fVar.setInputIslandBubbleDrawable(cVar.c(fVar, c8.i0.b(h6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(cVar.c(fVar, c8.i0.b(h6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        f1 f1Var = new f1(this, org.telegram.messenger.g0.u0(), e1Var);
        this.f3776s1 = f1Var;
        f1Var.setInAppInsetsController(hVar);
        f1Var.setOverrideHint(hd.N0(2131749732, null));
        f1Var.Y5 = false;
        this.f30176b.setClipChildren(false);
        this.f30176b.setClipToPadding(false);
        f1Var.X5 = false;
        if (!org.telegram.messenger.g0.E && ((bnVar = f1Var.F3) == null || !bnVar.isInBubbleMode())) {
            z10 = true;
        } else {
            z10 = false;
        }
        f1Var.Y2 = z10;
        f1Var.x1(false, false, false);
        f1Var.I1(true, false);
        f1Var.f32690p2.setPadding(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(20.0f), 0);
        f1Var.getSendButton().setAlpha(0.0f);
        f1Var.getEditField().setMaxLines(3);
        f1Var.setCustomWindowView(this.f30179c);
        f1Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(f1Var, ma.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.f30176b.addView(fVar.getFadeView(), ma.c(-1.0f, -1));
        this.f30176b.addView(fVar, ma.c(-1.0f, -1));
        f1Var.setDelegate(new g1(this, tL_starGiftUnique));
        gf gfVar = f1Var.F0;
        Object obj2 = new Object();
        InputFilter[] filters = gfVar.getFilters();
        if (filters == null) {
            gfVar.setFilters(new InputFilter[]{obj2});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = obj2;
            gfVar.setFilters(inputFilterArr);
        }
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f3780w1 = o6Var;
        o6Var.setAllowCancel(true);
        o6Var.setScaleProperty(0.6f);
        o6Var.setVisibility(8);
        o6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.f29773y6, h6Var);
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        o6Var.setGravity(17);
        this.f30176b.addView(o6Var, ma.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        ?? ugVar = new ug(2131232696, context, h6Var, false);
        this.C1 = ugVar;
        int L = org.telegram.messenger.g0.L(38.0f);
        int L2 = org.telegram.messenger.g0.L(38.0f);
        ugVar.L = L;
        ugVar.M = L2;
        ugVar.P = org.telegram.messenger.g0.L(6.0f);
        ugVar.Q = org.telegram.messenger.g0.L(8.0f);
        ugVar.f40352s0 = true;
        this.f30176b.addView((View) ugVar, ma.e(110, 50, 85));
        ugVar.setScrimViewBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29381d6, this.J0));
        ugVar.setOnClickListener(new View.OnClickListener(this) {
            public final k1 f3533b;

            {
                this.f3533b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k1 k1Var = this.f3533b;
                        if (k1Var.f3783z1 - k1Var.A1 < 0) {
                            org.telegram.messenger.g0.D3(k1Var.f3780w1);
                            return;
                        }
                        j1 j1Var = k1Var.F1;
                        if (j1Var != null) {
                            j1Var.b(k1Var.f3776s1.getTextWithEntities(), k1Var.B1);
                            return;
                        }
                        return;
                    case 1:
                        k1 k1Var2 = this.f3533b;
                        boolean z11 = k1Var2.B1;
                        k1Var2.B1 = !z11;
                        k1Var2.f3778u1.a(z11, true);
                        return;
                    default:
                        this.f3533b.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f3779v1 = textView;
        int i10 = org.telegram.ui.ActionBar.m6.Zc;
        org.telegram.messenger.f3.l(textView, i10, h6Var, 1, 14.0f);
        textView.setText(hd.N0(2131749728, null));
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setBackground(new org.telegram.ui.ActionBar.x5(textView, this.f30176b, org.telegram.messenger.g0.L(23.0f) / 2, K0("paintChatActionBackground")));
        this.f30176b.addView(textView, ma.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f3777t1 = frameLayout;
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView2, i10, h6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(hd.N0(2131749729, null));
        frameLayout.addView(textView2, ma.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        op opVar = new op(18, context, h6Var);
        this.f3778u1 = opVar;
        opVar.getCheckBoxBase().j(true);
        opVar.getCheckBoxBase().f32863e = 0.9f;
        opVar.b(i10, i10, org.telegram.ui.ActionBar.m6.f29511k7);
        opVar.setDrawUnchecked(true);
        opVar.a(!this.B1, false);
        d9Var.getLayout().V = new c1(this, 1);
        d9Var.getLayout().U = new c1(this, 2);
        opVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(opVar, ma.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new org.telegram.ui.ActionBar.x5(frameLayout, this.f30176b, org.telegram.messenger.g0.L(16.0f), K0("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final k1 f3533b;

            {
                this.f3533b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k1 k1Var = this.f3533b;
                        if (k1Var.f3783z1 - k1Var.A1 < 0) {
                            org.telegram.messenger.g0.D3(k1Var.f3780w1);
                            return;
                        }
                        j1 j1Var = k1Var.F1;
                        if (j1Var != null) {
                            j1Var.b(k1Var.f3776s1.getTextWithEntities(), k1Var.B1);
                            return;
                        }
                        return;
                    case 1:
                        k1 k1Var2 = this.f3533b;
                        boolean z11 = k1Var2.B1;
                        k1Var2.B1 = !z11;
                        k1Var2.f3778u1.a(z11, true);
                        return;
                    default:
                        this.f3533b.dismiss();
                        return;
                }
            }
        });
        this.f30176b.addView(frameLayout, ma.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.f3781x1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        org.telegram.ui.ActionBar.x5 x5Var = new org.telegram.ui.ActionBar.x5(imageView, this.f30176b, org.telegram.messenger.g0.L(16.0f), K0("paintChatActionBackground"));
        int L3 = org.telegram.messenger.g0.L(32.0f);
        int L4 = org.telegram.messenger.g0.L(32.0f);
        Matrix matrix = ih.d.f16282a;
        imageView.setBackground(new ih.c(L3, L4, x5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final k1 f3533b;

            {
                this.f3533b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k1 k1Var = this.f3533b;
                        if (k1Var.f3783z1 - k1Var.A1 < 0) {
                            org.telegram.messenger.g0.D3(k1Var.f3780w1);
                            return;
                        }
                        j1 j1Var = k1Var.F1;
                        if (j1Var != null) {
                            j1Var.b(k1Var.f3776s1.getTextWithEntities(), k1Var.B1);
                            return;
                        }
                        return;
                    case 1:
                        k1 k1Var2 = this.f3533b;
                        boolean z11 = k1Var2.B1;
                        k1Var2.B1 = !z11;
                        k1Var2.f3778u1.a(z11, true);
                        return;
                    default:
                        this.f3533b.dismiss();
                        return;
                }
            }
        });
        this.f30176b.addView(imageView, ma.e(56, 56, 53));
        ra.b(frameLayout, 0.05f, 1.2f);
        ra.a(imageView);
        ViewGroup viewGroup3 = this.f30176b;
        a1.c cVar2 = new a1.c(this, 14);
        WeakHashMap weakHashMap = r0.i0.f56289a;
        r0.a0.i(viewGroup3, cVar2);
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void J0() {
        rh.h hVar = this.f3775r1;
        int i7 = hVar.f(647).f15918b;
        float inputBubbleHeight = this.f3774q1.getInputBubbleHeight() + hVar.d() + org.telegram.messenger.g0.L(9.0f);
        int height = this.f30176b.getHeight();
        d9 d9Var = this.f3771m1;
        FrameLayout frameLayout = this.f3777t1;
        d9Var.setTranslationY(Math.min((((org.telegram.messenger.g0.L(36.0f) + i7) - (org.telegram.messenger.g0.L(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - d9Var.getHeight()) / 2.0f), ((((this.f30176b.getHeight() - inputBubbleHeight) - org.telegram.messenger.g0.L(14.0f)) - frameLayout.getHeight()) - org.telegram.messenger.g0.L(10.0f)) - d9Var.getHeight()));
        d9Var.invalidate();
        float y10 = d9Var.getY() - org.telegram.messenger.g0.L(33.0f);
        TextView textView = this.f3779v1;
        textView.setTranslationY(y10);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + org.telegram.messenger.g0.L(14.0f)));
        frameLayout.invalidate();
        float f10 = i7;
        ImageView imageView = this.f3781x1;
        imageView.setTranslationY(f10);
        imageView.invalidate();
    }

    public final Paint K0(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.h6 h6Var = this.J0;
        if (h6Var != null) {
            paint = h6Var.g("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.m6.V0("paintChatActionBackground");
    }

    @Override
    public final void L() {
        super.L();
        this.f3776s1.c1();
    }

    @Override
    public final void onBackPressed() {
        f1 f1Var = this.f3776s1;
        if (f1Var != null && f1Var.S0()) {
            f1Var.K0(true);
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
                h1Var.setScrimViewBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29381d6, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void v() {
        u0(false);
        i1 i1Var = new i1(this, 0);
        org.telegram.ui.ActionBar.m2 m2Var = this.f30179c;
        gc.a(m2Var, i1Var);
        n30 n30Var = n30.f37760s;
        if (n30Var.c()) {
            n30Var.b();
            TLObject g22 = np.u1(this.f30173a).g2(this.E1);
            StringBuilder sb2 = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.D1;
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            new lc(m2Var, this.J0).V(Arrays.asList(g22), hd.N0(2131749731, null), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749733, org.telegram.messenger.n5.u(g22), i5.c.l(tL_starGiftUnique.num, ',', sb2))), null).k(true);
        }
    }
}
