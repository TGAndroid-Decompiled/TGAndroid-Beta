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
import c8.ja;
import c8.na;
import di.v8;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.xe;
import org.telegram.ui.an;
public final class f1 extends org.telegram.ui.ActionBar.u2 {
    public int A1;
    public boolean B1;
    public final d1 C1;
    public final TL_stars.TL_starGiftUnique D1;
    public final long E1;
    public di.o3 F1;
    public boolean G1;
    public final v6 f3496m1;
    public final jh.l n1;
    public final ui.g f3497o1;
    public final dh.c f3498p1;
    public final jh.f f3499q1;
    public final rh.h f3500r1;
    public final b1 f3501s1;
    public final FrameLayout f3502t1;
    public final fp f3503u1;
    public final TextView f3504v1;
    public final org.telegram.ui.Components.h6 f3505w1;
    public final ImageView f3506x1;
    public final Drawable f3507y1;
    public final int f3508z1;

    public f1(Context context, org.telegram.ui.ActionBar.e6 e6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (org.telegram.ui.ActionBar.e6) null, true, true);
        boolean z10;
        an anVar;
        this.n1 = new jh.l();
        rh.h hVar = new rh.h(new y0(this, 0));
        this.f3500r1 = hVar;
        org.telegram.messenger.g0.S(getWindow());
        this.D1 = tL_starGiftUnique;
        this.E1 = j3;
        this.f3508z1 = np.s1(this.f29679a).E6;
        ?? obj = new Object();
        this.f3497o1 = obj;
        dh.c cVar = new dh.c(obj, obj, obj);
        this.f3498p1 = cVar;
        a1 a1Var = new a1(this, context);
        this.f29682b = a1Var;
        int i7 = this.f29717u0;
        a1Var.setPadding(i7, 0, i7, 0);
        jh.k kVar = new jh.k(this.f29682b);
        ViewGroup viewGroup = this.f29682b;
        cVar.h = kVar;
        cVar.f8095i = viewGroup;
        rh.d dVar = new rh.d(this.f29685c);
        ViewGroup viewGroup2 = this.f29682b;
        hVar.E = dVar;
        hVar.F = viewGroup2;
        dVar.d.add(hVar);
        Drawable e10 = hi.x5.e(null, this.f29679a, j3, org.telegram.ui.ActionBar.j6.I.q());
        this.f3507y1 = e10;
        a1Var.U(e10);
        v6 v6Var = new v6(this.f29679a, context, e6Var);
        this.f3496m1 = v6Var;
        v6Var.a(tL_starGiftUnique, m10.i(this.f29679a).e(), null, hd.M0(2131749745, null), false);
        v6Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        v6Var.setLayoutBackground(new org.telegram.ui.ActionBar.v5(v6Var, this.f29682b, org.telegram.messenger.g0.L(18.0f), J0("paintChatActionBackground")));
        a1Var.addView(v6Var, ja.e(-2, -2, 48));
        jh.f fVar = new jh.f(context);
        this.f3499q1 = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(hVar);
        fVar.setInputIslandBubbleDrawable(cVar.c(fVar, c8.g0.b(e6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(cVar.c(fVar, c8.g0.b(e6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        b1 b1Var = new b1(this, org.telegram.messenger.g0.u0(), a1Var);
        this.f3501s1 = b1Var;
        b1Var.setInAppInsetsController(hVar);
        b1Var.setOverrideHint(hd.M0(2131749750, null));
        b1Var.Q5 = false;
        this.f29682b.setClipChildren(false);
        this.f29682b.setClipToPadding(false);
        b1Var.P5 = false;
        if (!org.telegram.messenger.g0.E && ((anVar = b1Var.f32319x3) == null || !anVar.isInBubbleMode())) {
            z10 = true;
        } else {
            z10 = false;
        }
        b1Var.Q2 = z10;
        b1Var.l1(false, false, false);
        b1Var.w1(true, false);
        b1Var.f32208h2.setPadding(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(20.0f), 0);
        b1Var.getSendButton().setAlpha(0.0f);
        b1Var.getEditField().setMaxLines(3);
        b1Var.setCustomWindowView(this.f29685c);
        b1Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(b1Var, ja.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.f29682b.addView(fVar.getFadeView(), ja.c(-1.0f, -1));
        this.f29682b.addView(fVar, ja.c(-1.0f, -1));
        b1Var.setDelegate(new c1(this, tL_starGiftUnique));
        xe xeVar = b1Var.F0;
        Object obj2 = new Object();
        InputFilter[] filters = xeVar.getFilters();
        if (filters == null) {
            xeVar.setFilters(new InputFilter[]{obj2});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = obj2;
            xeVar.setFilters(inputFilterArr);
        }
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f3505w1 = h6Var;
        h6Var.setAllowCancel(true);
        h6Var.setScaleProperty(0.6f);
        h6Var.setVisibility(8);
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.f29241y6, e6Var);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setGravity(17);
        this.f29682b.addView(h6Var, ja.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        ?? jgVar = new jg(2131232695, context, e6Var, false);
        this.C1 = jgVar;
        int L = org.telegram.messenger.g0.L(38.0f);
        int L2 = org.telegram.messenger.g0.L(38.0f);
        jgVar.L = L;
        jgVar.M = L2;
        jgVar.P = org.telegram.messenger.g0.L(6.0f);
        jgVar.Q = org.telegram.messenger.g0.L(8.0f);
        jgVar.f35994q0 = true;
        this.f29682b.addView((View) jgVar, ja.e(110, 50, 85));
        jgVar.setScrimViewBackgroundColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, this.J0));
        jgVar.setOnClickListener(new View.OnClickListener(this) {
            public final f1 f4024b;

            {
                this.f4024b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f1 f1Var = this.f4024b;
                        if (f1Var.f3508z1 - f1Var.A1 < 0) {
                            org.telegram.messenger.g0.E3(f1Var.f3505w1);
                            return;
                        }
                        di.o3 o3Var = f1Var.F1;
                        if (o3Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = f1Var.f3501s1.getTextWithEntities();
                            boolean z11 = f1Var.B1;
                            di.c6 c6Var = (di.c6) o3Var.f9145c;
                            f1 f1Var2 = (f1) o3Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) o3Var.f9146e;
                            long j10 = o3Var.f9144b;
                            cg.b bVar = (cg.b) o3Var.f9147f;
                            if (!f1Var2.G1) {
                                c6Var.f8318g2.setLoading(true);
                                if (!f1Var2.G1) {
                                    f1Var2.G1 = true;
                                    f1Var2.C1.g(true);
                                }
                                v8.x(c6Var.f29679a, bVar).H(tL_starGiftUnique2, j10, textWithEntities, z11, new di.t1(c6Var, f1Var2, bVar, tL_starGiftUnique2, j10, textWithEntities, z11));
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        f1 f1Var3 = this.f4024b;
                        boolean z12 = f1Var3.B1;
                        f1Var3.B1 = !z12;
                        f1Var3.f3503u1.a(z12, true);
                        return;
                    default:
                        this.f4024b.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f3504v1 = textView;
        int i10 = org.telegram.ui.ActionBar.j6.Zc;
        org.telegram.messenger.k5.m(textView, i10, e6Var, 1, 14.0f);
        textView.setText(hd.M0(2131749746, null));
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setBackground(new org.telegram.ui.ActionBar.v5(textView, this.f29682b, org.telegram.messenger.g0.L(23.0f) / 2, J0("paintChatActionBackground")));
        this.f29682b.addView(textView, ja.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f3502t1 = frameLayout;
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView2, i10, e6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(hd.M0(2131749747, null));
        frameLayout.addView(textView2, ja.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        fp fpVar = new fp(18, context, e6Var);
        this.f3503u1 = fpVar;
        fpVar.getCheckBoxBase().j(true);
        fpVar.getCheckBoxBase().f32430e = 0.9f;
        fpVar.b(i10, i10, org.telegram.ui.ActionBar.j6.f28979k7);
        fpVar.setDrawUnchecked(true);
        fpVar.a(!this.B1, false);
        v6Var.getLayout().V = new y0(this, 1);
        v6Var.getLayout().U = new y0(this, 2);
        fpVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(fpVar, ja.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new org.telegram.ui.ActionBar.v5(frameLayout, this.f29682b, org.telegram.messenger.g0.L(16.0f), J0("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final f1 f4024b;

            {
                this.f4024b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f1 f1Var = this.f4024b;
                        if (f1Var.f3508z1 - f1Var.A1 < 0) {
                            org.telegram.messenger.g0.E3(f1Var.f3505w1);
                            return;
                        }
                        di.o3 o3Var = f1Var.F1;
                        if (o3Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = f1Var.f3501s1.getTextWithEntities();
                            boolean z11 = f1Var.B1;
                            di.c6 c6Var = (di.c6) o3Var.f9145c;
                            f1 f1Var2 = (f1) o3Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) o3Var.f9146e;
                            long j10 = o3Var.f9144b;
                            cg.b bVar = (cg.b) o3Var.f9147f;
                            if (!f1Var2.G1) {
                                c6Var.f8318g2.setLoading(true);
                                if (!f1Var2.G1) {
                                    f1Var2.G1 = true;
                                    f1Var2.C1.g(true);
                                }
                                v8.x(c6Var.f29679a, bVar).H(tL_starGiftUnique2, j10, textWithEntities, z11, new di.t1(c6Var, f1Var2, bVar, tL_starGiftUnique2, j10, textWithEntities, z11));
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        f1 f1Var3 = this.f4024b;
                        boolean z12 = f1Var3.B1;
                        f1Var3.B1 = !z12;
                        f1Var3.f3503u1.a(z12, true);
                        return;
                    default:
                        this.f4024b.dismiss();
                        return;
                }
            }
        });
        this.f29682b.addView(frameLayout, ja.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.f3506x1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        org.telegram.ui.ActionBar.v5 v5Var = new org.telegram.ui.ActionBar.v5(imageView, this.f29682b, org.telegram.messenger.g0.L(16.0f), J0("paintChatActionBackground"));
        int L3 = org.telegram.messenger.g0.L(32.0f);
        int L4 = org.telegram.messenger.g0.L(32.0f);
        Matrix matrix = ih.d.f15941a;
        imageView.setBackground(new ih.c(L3, L4, v5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final f1 f4024b;

            {
                this.f4024b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f1 f1Var = this.f4024b;
                        if (f1Var.f3508z1 - f1Var.A1 < 0) {
                            org.telegram.messenger.g0.E3(f1Var.f3505w1);
                            return;
                        }
                        di.o3 o3Var = f1Var.F1;
                        if (o3Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = f1Var.f3501s1.getTextWithEntities();
                            boolean z11 = f1Var.B1;
                            di.c6 c6Var = (di.c6) o3Var.f9145c;
                            f1 f1Var2 = (f1) o3Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) o3Var.f9146e;
                            long j10 = o3Var.f9144b;
                            cg.b bVar = (cg.b) o3Var.f9147f;
                            if (!f1Var2.G1) {
                                c6Var.f8318g2.setLoading(true);
                                if (!f1Var2.G1) {
                                    f1Var2.G1 = true;
                                    f1Var2.C1.g(true);
                                }
                                v8.x(c6Var.f29679a, bVar).H(tL_starGiftUnique2, j10, textWithEntities, z11, new di.t1(c6Var, f1Var2, bVar, tL_starGiftUnique2, j10, textWithEntities, z11));
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        f1 f1Var3 = this.f4024b;
                        boolean z12 = f1Var3.B1;
                        f1Var3.B1 = !z12;
                        f1Var3.f3503u1.a(z12, true);
                        return;
                    default:
                        this.f4024b.dismiss();
                        return;
                }
            }
        });
        this.f29682b.addView(imageView, ja.e(56, 56, 53));
        na.b(frameLayout, 0.05f, 1.2f);
        na.a(imageView);
        ViewGroup viewGroup3 = this.f29682b;
        a1.c cVar2 = new a1.c(this, 13);
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.a0.i(viewGroup3, cVar2);
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final void I0() {
        rh.h hVar = this.f3500r1;
        int i7 = hVar.f(647).f15575b;
        float inputBubbleHeight = this.f3499q1.getInputBubbleHeight() + hVar.d() + org.telegram.messenger.g0.L(9.0f);
        int height = this.f29682b.getHeight();
        v6 v6Var = this.f3496m1;
        FrameLayout frameLayout = this.f3502t1;
        v6Var.setTranslationY(Math.min((((org.telegram.messenger.g0.L(36.0f) + i7) - (org.telegram.messenger.g0.L(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - v6Var.getHeight()) / 2.0f), ((((this.f29682b.getHeight() - inputBubbleHeight) - org.telegram.messenger.g0.L(14.0f)) - frameLayout.getHeight()) - org.telegram.messenger.g0.L(10.0f)) - v6Var.getHeight()));
        v6Var.invalidate();
        float y10 = v6Var.getY() - org.telegram.messenger.g0.L(33.0f);
        TextView textView = this.f3504v1;
        textView.setTranslationY(y10);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + org.telegram.messenger.g0.L(14.0f)));
        frameLayout.invalidate();
        float f10 = i7;
        ImageView imageView = this.f3506x1;
        imageView.setTranslationY(f10);
        imageView.invalidate();
    }

    public final Paint J0(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        if (e6Var != null) {
            paint = e6Var.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.j6.V0("paintChatActionBackground");
    }

    @Override
    public final void L() {
        super.L();
        this.f3501s1.Q0();
    }

    @Override
    public final void onBackPressed() {
        b1 b1Var = this.f3501s1;
        if (b1Var != null && b1Var.G0()) {
            b1Var.y0(true);
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
                d1Var.setScrimViewBackgroundColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, this.J0));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void v() {
        u0(false);
        e1 e1Var = new e1(this, 0);
        org.telegram.ui.ActionBar.k2 k2Var = this.f29685c;
        xb.a(k2Var, e1Var);
        c30 c30Var = c30.f33487s;
        if (c30Var.c()) {
            c30Var.b();
            TLObject e22 = np.s1(this.f29679a).e2(this.E1);
            StringBuilder sb2 = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.D1;
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            new cc(k2Var, this.J0).V(Arrays.asList(e22), hd.M0(2131749749, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749751, org.telegram.messenger.m5.u(e22), i5.c.l(tL_starGiftUnique.num, ',', sb2))), null).k(true);
        }
    }
}
