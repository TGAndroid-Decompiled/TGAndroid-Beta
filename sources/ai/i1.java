package ai;

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
import b8.cd;
import b8.mf;
import b8.pf;
import ci.e9;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.v20;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.wo;
import org.telegram.ui.wm;
public final class i1 extends org.telegram.ui.ActionBar.t2 {
    public final TL_stars.TL_starGiftUnique A1;
    public final long B1;
    public ci.x3 C1;
    public boolean D1;
    public final e7 f693j1;
    public final kh.l k1;
    public final si.g f694l1;
    public final eh.c m1;
    public final kh.f f695n1;
    public final sh.h f696o1;
    public final d1 f697p1;
    public final FrameLayout f698q1;
    public final wo f699r1;
    public final TextView f700s1;
    public final org.telegram.ui.Components.h6 f701t1;
    public final ImageView f702u1;
    public final Drawable f703v1;
    public final int f704w1;
    public int f705x1;
    public boolean f706y1;
    public final g1 f707z1;

    public i1(Context context, org.telegram.ui.ActionBar.e6 e6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(context, (org.telegram.ui.ActionBar.e6) null, true, true);
        boolean z10;
        wm wmVar;
        this.k1 = new kh.l();
        sh.h hVar = new sh.h(new a1(this, 0));
        this.f696o1 = hVar;
        org.telegram.messenger.g0.S(getWindow());
        this.A1 = tL_starGiftUnique;
        this.B1 = j10;
        this.f704w1 = hp.s1(this.f28583a).D6;
        ?? obj = new Object();
        this.f694l1 = obj;
        eh.c cVar = new eh.c(obj, obj, obj);
        this.m1 = cVar;
        c1 c1Var = new c1(this, context);
        this.f28586b = c1Var;
        int i3 = this.f28618u0;
        c1Var.setPadding(i3, 0, i3, 0);
        kh.k kVar = new kh.k(this.f28586b);
        ViewGroup viewGroup = this.f28586b;
        cVar.h = kVar;
        cVar.f9986i = viewGroup;
        sh.d dVar = new sh.d(this.f28589c);
        ViewGroup viewGroup2 = this.f28586b;
        hVar.E = dVar;
        hVar.F = viewGroup2;
        dVar.d.add(hVar);
        Drawable e10 = gi.y5.e(null, this.f28583a, j10, org.telegram.ui.ActionBar.k6.I.q());
        this.f703v1 = e10;
        c1Var.U(e10);
        e7 e7Var = new e7(this.f28583a, context, e6Var);
        this.f693j1 = e7Var;
        e7Var.a(tL_starGiftUnique, h10.i(this.f28583a).e(), null, bd.M0(2131749753, null), false);
        e7Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        e7Var.setLayoutBackground(new org.telegram.ui.ActionBar.v5(e7Var, this.f28586b, org.telegram.messenger.g0.L(18.0f), J0("paintChatActionBackground")));
        c1Var.addView(e7Var, mf.e(-2, -2, 48));
        kh.f fVar = new kh.f(context);
        this.f695n1 = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(hVar);
        fVar.setInputIslandBubbleDrawable(cVar.c(fVar, cd.b(e6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(cVar.c(fVar, cd.b(e6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        d1 d1Var = new d1(this, org.telegram.messenger.g0.u0(), c1Var);
        this.f697p1 = d1Var;
        d1Var.setInAppInsetsController(hVar);
        d1Var.setOverrideHint(bd.M0(2131749758, null));
        d1Var.f31235z4 = false;
        this.f28586b.setClipChildren(false);
        this.f28586b.setClipToPadding(false);
        d1Var.f31230y4 = false;
        if (!org.telegram.messenger.g0.E && ((wmVar = d1Var.Q2) == null || !wmVar.isInBubbleMode())) {
            z10 = true;
        } else {
            z10 = false;
        }
        d1Var.f31142j2 = z10;
        d1Var.U0(false, false, false);
        d1Var.f1(true, false);
        d1Var.A1.setPadding(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(20.0f), 0);
        d1Var.getSendButton().setAlpha(0.0f);
        d1Var.getEditField().setMaxLines(3);
        d1Var.setCustomWindowView(this.f28589c);
        d1Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(d1Var, mf.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.f28586b.addView(fVar.getFadeView(), mf.c(-1.0f, -1));
        this.f28586b.addView(fVar, mf.c(-1.0f, -1));
        d1Var.setDelegate(new f1(this, tL_starGiftUnique));
        ve veVar = d1Var.F0;
        Object obj2 = new Object();
        InputFilter[] filters = veVar.getFilters();
        if (filters == null) {
            veVar.setFilters(new InputFilter[]{obj2});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = obj2;
            veVar.setFilters(inputFilterArr);
        }
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f701t1 = h6Var;
        h6Var.setAllowCancel(true);
        h6Var.setScaleProperty(0.6f);
        h6Var.setVisibility(8);
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.r6.Z(h6Var, org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setGravity(17);
        this.f28586b.addView(h6Var, mf.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        ?? bgVar = new bg(2131232692, context, e6Var, false);
        this.f707z1 = bgVar;
        int L = org.telegram.messenger.g0.L(38.0f);
        int L2 = org.telegram.messenger.g0.L(38.0f);
        bgVar.J = L;
        bgVar.K = L2;
        bgVar.N = org.telegram.messenger.g0.L(6.0f);
        bgVar.O = org.telegram.messenger.g0.L(8.0f);
        bgVar.f32192i0 = true;
        this.f28586b.addView((View) bgVar, mf.e(110, 50, 85));
        bgVar.setScrimViewBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.J0));
        bgVar.setOnClickListener(new View.OnClickListener(this) {
            public final i1 f506b;

            {
                this.f506b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i1 i1Var = this.f506b;
                        if (i1Var.f704w1 - i1Var.f705x1 < 0) {
                            org.telegram.messenger.g0.F3(i1Var.f701t1);
                            return;
                        }
                        ci.x3 x3Var = i1Var.C1;
                        if (x3Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = i1Var.f697p1.getTextWithEntities();
                            boolean z11 = i1Var.f706y1;
                            ci.l6 l6Var = (ci.l6) x3Var.f6333c;
                            i1 i1Var2 = (i1) x3Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) x3Var.f6334e;
                            long j11 = x3Var.f6332b;
                            dg.b bVar = (dg.b) x3Var.f6335f;
                            if (!i1Var2.D1) {
                                l6Var.f5451d2.setLoading(true);
                                if (!i1Var2.D1) {
                                    i1Var2.D1 = true;
                                    i1Var2.f707z1.f(true);
                                }
                                e9.x(l6Var.f28583a, bVar).H(tL_starGiftUnique2, j11, textWithEntities, z11, new ci.z1(l6Var, i1Var2, bVar, tL_starGiftUnique2, j11, textWithEntities, z11));
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        i1 i1Var3 = this.f506b;
                        boolean z12 = i1Var3.f706y1;
                        i1Var3.f706y1 = !z12;
                        i1Var3.f699r1.a(z12, true);
                        return;
                    default:
                        this.f506b.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f700s1 = textView;
        int i10 = org.telegram.ui.ActionBar.k6.Wc;
        org.telegram.messenger.k5.n(textView, i10, e6Var, 1, 14.0f);
        textView.setText(bd.M0(2131749754, null));
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setBackground(new org.telegram.ui.ActionBar.v5(textView, this.f28586b, org.telegram.messenger.g0.L(23.0f) / 2, J0("paintChatActionBackground")));
        this.f28586b.addView(textView, mf.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f698q1 = frameLayout;
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView2, i10, e6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(bd.M0(2131749755, null));
        frameLayout.addView(textView2, mf.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        wo woVar = new wo(18, context, e6Var);
        this.f699r1 = woVar;
        woVar.getCheckBoxBase().j(true);
        woVar.getCheckBoxBase().f31323e = 0.9f;
        woVar.b(i10, i10, org.telegram.ui.ActionBar.k6.f28008k7);
        woVar.setDrawUnchecked(true);
        woVar.a(!this.f706y1, false);
        e7Var.getLayout().V = new a1(this, 1);
        e7Var.getLayout().U = new a1(this, 2);
        woVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(woVar, mf.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new org.telegram.ui.ActionBar.v5(frameLayout, this.f28586b, org.telegram.messenger.g0.L(16.0f), J0("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final i1 f506b;

            {
                this.f506b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i1 i1Var = this.f506b;
                        if (i1Var.f704w1 - i1Var.f705x1 < 0) {
                            org.telegram.messenger.g0.F3(i1Var.f701t1);
                            return;
                        }
                        ci.x3 x3Var = i1Var.C1;
                        if (x3Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = i1Var.f697p1.getTextWithEntities();
                            boolean z11 = i1Var.f706y1;
                            ci.l6 l6Var = (ci.l6) x3Var.f6333c;
                            i1 i1Var2 = (i1) x3Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) x3Var.f6334e;
                            long j11 = x3Var.f6332b;
                            dg.b bVar = (dg.b) x3Var.f6335f;
                            if (!i1Var2.D1) {
                                l6Var.f5451d2.setLoading(true);
                                if (!i1Var2.D1) {
                                    i1Var2.D1 = true;
                                    i1Var2.f707z1.f(true);
                                }
                                e9.x(l6Var.f28583a, bVar).H(tL_starGiftUnique2, j11, textWithEntities, z11, new ci.z1(l6Var, i1Var2, bVar, tL_starGiftUnique2, j11, textWithEntities, z11));
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        i1 i1Var3 = this.f506b;
                        boolean z12 = i1Var3.f706y1;
                        i1Var3.f706y1 = !z12;
                        i1Var3.f699r1.a(z12, true);
                        return;
                    default:
                        this.f506b.dismiss();
                        return;
                }
            }
        });
        this.f28586b.addView(frameLayout, mf.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.f702u1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        org.telegram.ui.ActionBar.v5 v5Var = new org.telegram.ui.ActionBar.v5(imageView, this.f28586b, org.telegram.messenger.g0.L(16.0f), J0("paintChatActionBackground"));
        int L3 = org.telegram.messenger.g0.L(32.0f);
        int L4 = org.telegram.messenger.g0.L(32.0f);
        Matrix matrix = jh.d.f16256a;
        imageView.setBackground(new jh.c(L3, L4, v5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final i1 f506b;

            {
                this.f506b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i1 i1Var = this.f506b;
                        if (i1Var.f704w1 - i1Var.f705x1 < 0) {
                            org.telegram.messenger.g0.F3(i1Var.f701t1);
                            return;
                        }
                        ci.x3 x3Var = i1Var.C1;
                        if (x3Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = i1Var.f697p1.getTextWithEntities();
                            boolean z11 = i1Var.f706y1;
                            ci.l6 l6Var = (ci.l6) x3Var.f6333c;
                            i1 i1Var2 = (i1) x3Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) x3Var.f6334e;
                            long j11 = x3Var.f6332b;
                            dg.b bVar = (dg.b) x3Var.f6335f;
                            if (!i1Var2.D1) {
                                l6Var.f5451d2.setLoading(true);
                                if (!i1Var2.D1) {
                                    i1Var2.D1 = true;
                                    i1Var2.f707z1.f(true);
                                }
                                e9.x(l6Var.f28583a, bVar).H(tL_starGiftUnique2, j11, textWithEntities, z11, new ci.z1(l6Var, i1Var2, bVar, tL_starGiftUnique2, j11, textWithEntities, z11));
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        i1 i1Var3 = this.f506b;
                        boolean z12 = i1Var3.f706y1;
                        i1Var3.f706y1 = !z12;
                        i1Var3.f699r1.a(z12, true);
                        return;
                    default:
                        this.f506b.dismiss();
                        return;
                }
            }
        });
        this.f28586b.addView(imageView, mf.e(56, 56, 53));
        pf.b(frameLayout, 0.05f, 1.2f);
        pf.a(imageView);
        ViewGroup viewGroup3 = this.f28586b;
        a1.c cVar2 = new a1.c(this, 4);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(viewGroup3, cVar2);
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void I0() {
        sh.h hVar = this.f696o1;
        int i3 = hVar.f(647).f14496b;
        float inputBubbleHeight = this.f695n1.getInputBubbleHeight() + hVar.d() + org.telegram.messenger.g0.L(9.0f);
        int height = this.f28586b.getHeight();
        e7 e7Var = this.f693j1;
        FrameLayout frameLayout = this.f698q1;
        e7Var.setTranslationY(Math.min((((org.telegram.messenger.g0.L(36.0f) + i3) - (org.telegram.messenger.g0.L(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - e7Var.getHeight()) / 2.0f), ((((this.f28586b.getHeight() - inputBubbleHeight) - org.telegram.messenger.g0.L(14.0f)) - frameLayout.getHeight()) - org.telegram.messenger.g0.L(10.0f)) - e7Var.getHeight()));
        e7Var.invalidate();
        float y9 = e7Var.getY() - org.telegram.messenger.g0.L(33.0f);
        TextView textView = this.f700s1;
        textView.setTranslationY(y9);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + org.telegram.messenger.g0.L(14.0f)));
        frameLayout.invalidate();
        float f10 = i3;
        ImageView imageView = this.f702u1;
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
        return org.telegram.ui.ActionBar.k6.V0("paintChatActionBackground");
    }

    @Override
    public final void K() {
        super.K();
        this.f697p1.A0();
    }

    @Override
    public final void onBackPressed() {
        d1 d1Var = this.f697p1;
        if (d1Var != null && d1Var.r0()) {
            d1Var.j0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            g1 g1Var = this.f707z1;
            if (g1Var != null) {
                g1Var.setScrimViewBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.J0));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void v() {
        u0(false);
        h1 h1Var = new h1(this, 0);
        org.telegram.ui.ActionBar.j2 j2Var = this.f28589c;
        ac.a(j2Var, h1Var);
        v20 v20Var = v20.f38965s;
        if (v20Var.c()) {
            v20Var.b();
            TLObject e22 = hp.s1(this.f28583a).e2(this.B1);
            StringBuilder sb2 = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.A1;
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            new fc(j2Var, this.J0).V(Arrays.asList(e22), bd.M0(2131749757, null), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749759, org.telegram.messenger.m5.u(e22), k2.p1.l(tL_starGiftUnique.num, ',', sb2))), null).k(true);
        }
    }
}
