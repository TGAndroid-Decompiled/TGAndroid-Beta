package bi;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import c8.na;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
public class a6 extends org.telegram.ui.ActionBar.e2 implements te.b {
    public LinearLayout E;
    public f5 F;
    public f5 G;
    public f5 H;
    public f5 I;
    public nz J;
    public int K;
    public int L;
    public float M;
    public gh.e N;
    public final g5 O;
    public boolean P;
    public ValueAnimator Q;
    public int R;
    public LinearLayout S;
    public final te.a f3378a;
    public final long f3379b;
    public final String f3380c;
    public final o5 d;
    public z10 f3381e;
    public y4 f3382f;
    public View h;
    public FrameLayout f3383n;
    public FrameLayout f3384r;
    public TextView f3385s;
    public v1 f3386w;
    public boolean f3387x;
    public HorizontalScrollView f3388y;

    public a6(long j3, String str, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null);
        this.f3378a = new te.a(0, this, er.h, 380L, false);
        ?? obj = new Object();
        obj.f3555e = this;
        this.O = obj;
        this.P = true;
        this.f3379b = j3;
        this.f3380c = str;
        this.resourceProvider = e6Var;
        o5 o5Var = new o5(this.currentAccount, j10, new j4(this, 0));
        this.d = o5Var;
        o5Var.g(false);
    }

    public static void Z(a6 a6Var, Context context) {
        o5 o5Var = a6Var.d;
        if (!a6Var.P || o5Var.f3762g.isEmpty()) {
            return;
        }
        m60 m60Var = new m60(a6Var, a6Var.H, false, false);
        m60Var.f37112t = false;
        m60Var.Y = true;
        m60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        m60Var.R = true;
        m60Var.f37106p = new u3(m60Var, 2);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(o5Var.f3762g);
        Collections.sort(arrayList, new n4(a6Var, 1));
        y4 y4Var = new y4(a6Var, new o4(a6Var, strArr, arrayList, 1), new p4(a6Var, m60Var, 1), null, 2);
        y4Var.f39892g3.f38199r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232738);
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.F8, a6Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, ja.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ft ftVar = new ft(context, a6Var.resourceProvider);
        ftVar.setTextSize(1, 16.0f);
        ftVar.setInputType(573441);
        ftVar.setRawInputType(573441);
        org.telegram.ui.ActionBar.q6.D(ftVar, org.telegram.ui.ActionBar.j6.A6, a6Var.resourceProvider);
        org.telegram.ui.ActionBar.q6.l(ftVar, 30, org.telegram.ui.ActionBar.j6.G6, a6Var.resourceProvider);
        ftVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        ftVar.setCursorWidth(1.5f);
        ftVar.setHint(hd.M0(2131750009, null));
        org.telegram.ui.ActionBar.q6.U(ftVar, org.telegram.ui.ActionBar.j6.E8, a6Var.resourceProvider);
        ftVar.setBackground(null);
        frameLayout.addView(ftVar, ja.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        ftVar.addTextChangedListener(new v(strArr, y4Var, false, 2));
        if (arrayList.size() > 8) {
            m60Var.r(frameLayout, ja.o(-1, 44));
            m60Var.k();
        }
        if (!o5Var.f3765k.isEmpty()) {
            m60Var.c(2131232358, hd.M0(2131745670, null), new q4(a6Var, 1), false);
        }
        m60Var.q(y4Var);
        a6Var.i0(a6Var.H, m60Var);
    }

    public static void a0(a6 a6Var, Context context) {
        o5 o5Var = a6Var.d;
        if (!a6Var.P || o5Var.h.isEmpty()) {
            return;
        }
        m60 m60Var = new m60(a6Var, a6Var.I, false, false);
        m60Var.f37112t = false;
        m60Var.Y = true;
        m60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        m60Var.R = true;
        m60Var.f37106p = new u3(m60Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(o5Var.h);
        Collections.sort(arrayList, new n4(a6Var, 2));
        y4 y4Var = new y4(a6Var, new o4(a6Var, strArr, arrayList, 2), new p4(a6Var, m60Var, 2), null, 3);
        y4Var.f39892g3.f38199r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232738);
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.F8, a6Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, ja.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ft ftVar = new ft(context, a6Var.resourceProvider);
        ftVar.setTextSize(1, 16.0f);
        ftVar.setInputType(573441);
        ftVar.setRawInputType(573441);
        org.telegram.ui.ActionBar.q6.D(ftVar, org.telegram.ui.ActionBar.j6.A6, a6Var.resourceProvider);
        org.telegram.ui.ActionBar.q6.l(ftVar, 30, org.telegram.ui.ActionBar.j6.G6, a6Var.resourceProvider);
        ftVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        ftVar.setCursorWidth(1.5f);
        ftVar.setHint(hd.M0(2131750009, null));
        org.telegram.ui.ActionBar.q6.U(ftVar, org.telegram.ui.ActionBar.j6.E8, a6Var.resourceProvider);
        ftVar.setBackground(null);
        frameLayout.addView(ftVar, ja.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        ftVar.addTextChangedListener(new v(strArr, y4Var, false, 3));
        if (arrayList.size() > 8) {
            m60Var.r(frameLayout, ja.o(-1, 44));
            m60Var.k();
        }
        if (!o5Var.f3766l.isEmpty()) {
            m60Var.c(2131232358, hd.M0(2131745670, null), new q4(a6Var, 5), false);
        }
        m60Var.q(y4Var);
        a6Var.i0(a6Var.I, m60Var);
    }

    public static void b0(a6 a6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        if (j3 == m10.i(a6Var.currentAccount).e()) {
            a6Var.d.d.remove(tL_starGiftUnique);
            a6Var.k0(false);
            if (j3 == m10.i(a6Var.currentAccount).e()) {
                cc a02 = cc.a0(a6Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String M0 = hd.M0(2131752887, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                xb O = a02.O(document, M0, hd.a0(null, null, 2131752888, i5.c.l(tL_starGiftUnique.num, ',', sb2)));
                O.f41643r = false;
                O.j();
            } else {
                xb O2 = cc.a0(a6Var).O(tL_starGiftUnique.getDocument(), hd.M0(2131752885, null), hd.a0(null, null, 2131752886, org.telegram.messenger.m5.s(a6Var.currentAccount, j3)));
                O2.f41643r = false;
                O2.j();
            }
            a6Var.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        w4 w4Var = new w4(bundle, tL_starGiftUnique, j3);
        org.telegram.ui.ActionBar.o4 o4Var = a6Var.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).f28328b) {
            Dialog dialog = a6Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.u2) && z10) {
                ((org.telegram.ui.ActionBar.u2) dialog).O0 = true;
            }
            a6Var.finishFragment();
            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(w4Var, false, z10);
            }
        } else {
            a6Var.presentFragment(w4Var, true, z10);
        }
        z10 z10Var = a6Var.f3381e;
        if (z10Var != null) {
            z10Var.a(Boolean.valueOf(z10));
        }
    }

    public static void d0(a6 a6Var, Context context) {
        o5 o5Var = a6Var.d;
        if (!a6Var.P || o5Var.f3761f.isEmpty()) {
            return;
        }
        m60 m60Var = new m60(a6Var, a6Var.G, false, false);
        m60Var.f37112t = false;
        m60Var.Y = true;
        m60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        m60Var.R = true;
        m60Var.f37106p = new u3(m60Var, 1);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(o5Var.f3761f);
        Collections.sort(arrayList, new n4(a6Var, 0));
        y4 y4Var = new y4(a6Var, new o4(a6Var, strArr, arrayList, 0), new p4(a6Var, m60Var, 0), null, 1);
        y4Var.f39892g3.f38199r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232738);
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.F8, a6Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, ja.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ft ftVar = new ft(context, a6Var.resourceProvider);
        ftVar.setTextSize(1, 16.0f);
        ftVar.setInputType(573441);
        ftVar.setRawInputType(573441);
        org.telegram.ui.ActionBar.q6.D(ftVar, org.telegram.ui.ActionBar.j6.A6, a6Var.resourceProvider);
        org.telegram.ui.ActionBar.q6.l(ftVar, 30, org.telegram.ui.ActionBar.j6.G6, a6Var.resourceProvider);
        ftVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        ftVar.setCursorWidth(1.5f);
        ftVar.setHint(hd.M0(2131750009, null));
        org.telegram.ui.ActionBar.q6.U(ftVar, org.telegram.ui.ActionBar.j6.E8, a6Var.resourceProvider);
        ftVar.setBackground(null);
        frameLayout.addView(ftVar, ja.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        ftVar.addTextChangedListener(new v(strArr, y4Var, false, 1));
        if (arrayList.size() > 8) {
            m60Var.r(frameLayout, ja.o(-1, 44));
            m60Var.k();
        }
        if (!o5Var.f3764j.isEmpty()) {
            m60Var.c(2131232358, hd.M0(2131745670, null), new q4(a6Var, 0), false);
        }
        m60Var.q(y4Var);
        a6Var.i0(a6Var.G, m60Var);
    }

    public static void e0(a6 a6Var, b41 b41Var) {
        Object obj = b41Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            di.c6 c6Var = new di.c6(a6Var.getParentActivity(), a6Var.currentAccount, a6Var.f3379b, a6Var.resourceProvider, null);
            c6Var.i2(tL_starGiftUnique.slug, tL_starGiftUnique, a6Var.d);
            c6Var.N2 = new s4(a6Var);
            a6Var.showDialog(c6Var);
        }
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            this.f3384r.setTranslationY((-org.telegram.messenger.g0.L(52.0f)) * f10);
            t00.d(this.f3383n, f10);
        }
    }

    @Override
    public final View createView(final Context context) {
        String H;
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new x4(this, 0));
        this.simpleActionBar.setTitle(this.f3380c);
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        o5 o5Var = this.d;
        if (w4Var != null) {
            int i7 = o5Var.f3760e;
            if (i7 <= 0) {
                H = hd.M0(2131750007, null);
            } else {
                H = hd.H(',', "Gift2ListingsCount", i7);
            }
            w4Var.setSubtitle(H);
        }
        FrameLayout st0Var = new st0(context, null);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28792a7, st0Var, getResourceProvider());
        this.fragmentView = st0Var;
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        y4 y4Var = new y4(this, new b(this, 7), new s4(this), new a3.l(this, 21), 0);
        this.f3382f = y4Var;
        y4Var.f39892g3.f38199r = false;
        y4Var.setSpanCount(3);
        this.f3382f.j(new z4(this, 0));
        st0Var.addView(this.f3382f, ja.e(-1, -1, 119));
        v1 v1Var = new v1(context, new View.OnClickListener(this) {
            public final a6 f3652b;

            {
                this.f3652b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o5 o5Var2 = this.f3652b.d;
                        o5Var2.f3765k.clear();
                        o5Var2.f3764j.clear();
                        o5Var2.f3766l.clear();
                        o5Var2.h();
                        return;
                    default:
                        o5 o5Var3 = this.f3652b.d;
                        o5Var3.f3765k.clear();
                        o5Var3.f3764j.clear();
                        o5Var3.f3766l.clear();
                        o5Var3.h();
                        return;
                }
            }
        }, this.resourceProvider);
        this.f3386w = v1Var;
        this.f3387x = false;
        v1Var.setAlpha(0.0f);
        this.f3386w.setScaleX(0.95f);
        this.f3386w.setScaleY(0.95f);
        this.f3386w.setVisibility(8);
        st0Var.addView(this.f3386w, ja.e(-1, -1, 119));
        View view = new View(context);
        this.h = view;
        st0Var.addView(view, ja.e(-1, 0, 48));
        baseSimpleGlass.f(st0Var, this.f3382f, this.simpleActionBar, this.resourceProvider);
        View view2 = this.h;
        view2.setBackground(baseSimpleGlass.a(view2));
        this.simpleActionBar.setBackground(null);
        c5 c5Var = new c5(this.currentAccount, context, this.resourceProvider);
        dh.c cVar = baseSimpleGlass.f56042c;
        fh.g c10 = cVar.c(c5Var, null, false);
        c10.p(c8.g0.l(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(23.0f));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        c5Var.setBackground(c10);
        na.a(c5Var);
        c5Var.setOnClickListener(new ai.v2(3, this, c5Var));
        c5Var.setOnWidthChanged(new j4(this, 1));
        this.simpleActionBar.addView(c5Var, ja.e(-2, 58, 5));
        this.N = c8.g0.l(this.resourceProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(0);
        this.E.setClipChildren(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f3388y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.f3388y.setOverScrollMode(2);
        this.f3388y.addView(this.E);
        this.f3388y.setClipChildren(false);
        st0Var.addView(this.f3388y, ja.e(-1, 52, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
        linearLayout2.setOrientation(0);
        final fp fpVar = new fp(24, context, this.resourceProvider);
        fpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.f28959j7, org.telegram.ui.ActionBar.j6.f28979k7);
        fpVar.setDrawUnchecked(true);
        fpVar.a(false, false);
        fpVar.setDrawBackgroundAsArc(10);
        fpVar.setTranslationX(org.telegram.messenger.g0.L(4.0f));
        fpVar.setScaleX(0.8f);
        fpVar.setScaleY(0.8f);
        linearLayout2.addView(fpVar, ja.r(26, 26, 16));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, this.resourceProvider);
        i5.c.w(textView, 1, 14.0f, null, 2131749613);
        linearLayout2.addView(textView, ja.t(-2, -2, 16, 9, 0, 0, 0));
        int L = org.telegram.messenger.g0.L(20.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        int r12 = org.telegram.ui.ActionBar.j6.r1(0.1f, getThemedColor(i10));
        linearLayout2.setBackground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, 0, r12, r12));
        this.S = linearLayout2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f3384r = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        View view3 = this.f3384r;
        fh.g c11 = cVar.c(view3, null, false);
        c11.p(c8.g0.l(this.resourceProvider));
        c11.q(org.telegram.messenger.g0.L(8.0f));
        c11.r(org.telegram.messenger.g0.L(20.0f));
        view3.setBackground(c11);
        this.f3384r.setOnClickListener(new View.OnClickListener(this) {
            public final a6 f3677b;

            {
                this.f3677b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i11 = r3;
                final fp fpVar2 = fpVar;
                final a6 a6Var = this.f3677b;
                switch (i11) {
                    case 0:
                        o5 o5Var2 = a6Var.d;
                        if (a6Var.P) {
                            m60 H2 = m60.H(a6Var, a6Var.F);
                            H2.c(2131231890, hd.M0(2131746139, null), new q4(a6Var, 2), false);
                            H2.c(2131231888, hd.M0(2131746143, null), new q4(a6Var, 3), false);
                            H2.c(2131231889, hd.M0(2131746141, null), new q4(a6Var, 4), false);
                            H2.k();
                            H2.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            o5 o5Var3 = a6Var.d;
                                            if (o5Var3.f3772r) {
                                                o5Var3.f3772r = false;
                                                fpVar2.a(false, true);
                                                o5Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            o5 o5Var4 = a6Var.d;
                                            if (!o5Var4.f3772r) {
                                                o5Var4.f3772r = true;
                                                fpVar2.a(true, true);
                                                o5Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, hd.M0(2131749615, null), !o5Var2.f3772r);
                            H2.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            o5 o5Var3 = a6Var.d;
                                            if (o5Var3.f3772r) {
                                                o5Var3.f3772r = false;
                                                fpVar2.a(false, true);
                                                o5Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            o5 o5Var4 = a6Var.d;
                                            if (!o5Var4.f3772r) {
                                                o5Var4.f3772r = true;
                                                fpVar2.a(true, true);
                                                o5Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, hd.M0(2131749614, null), o5Var2.f3772r);
                            H2.f37112t = false;
                            H2.Y = true;
                            H2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a6Var.i0(a6Var.F, H2);
                            return;
                        }
                        return;
                    default:
                        o5 o5Var3 = a6Var.d;
                        if (o5Var3 != null) {
                            boolean z10 = !o5Var3.f3772r;
                            o5Var3.f3772r = z10;
                            fpVar2.a(z10, true);
                            o5Var3.h();
                            return;
                        }
                        return;
                }
            }
        });
        this.f3384r.addView(linearLayout2, ja.c(-1.0f, -2));
        na.b(this.f3384r, 0.04f, 1.5f);
        st0Var.addView(this.f3384r, ja.e(-2, 56, 81));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f3383n = frameLayout2;
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        View view4 = this.f3383n;
        fh.g c12 = cVar.c(view4, null, false);
        c12.p(c8.g0.l(this.resourceProvider));
        c12.q(org.telegram.messenger.g0.L(8.0f));
        c12.r(org.telegram.messenger.g0.L(22.0f));
        view4.setBackground(c12);
        st0Var.addView(this.f3383n, ja.e(-2, 60, 81));
        this.f3385s = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new eq(2131232096, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.M0(2131750014, null));
        this.f3385s.setText(spannableStringBuilder);
        org.telegram.ui.ActionBar.q6.U(this.f3385s, i10, getResourceProvider());
        this.f3385s.setTypeface(org.telegram.messenger.g0.o());
        this.f3385s.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        TextView textView2 = this.f3385s;
        int L2 = org.telegram.messenger.g0.L(22.0f);
        int r13 = org.telegram.ui.ActionBar.j6.r1(0.1f, getThemedColor(i10));
        textView2.setBackground(org.telegram.ui.ActionBar.j6.k0(L2, L2, L2, L2, 0, r13, r13));
        this.f3385s.setGravity(17);
        this.f3383n.setOnClickListener(new View.OnClickListener(this) {
            public final a6 f3652b;

            {
                this.f3652b = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (r2) {
                    case 0:
                        o5 o5Var2 = this.f3652b.d;
                        o5Var2.f3765k.clear();
                        o5Var2.f3764j.clear();
                        o5Var2.f3766l.clear();
                        o5Var2.h();
                        return;
                    default:
                        o5 o5Var3 = this.f3652b.d;
                        o5Var3.f3765k.clear();
                        o5Var3.f3764j.clear();
                        o5Var3.f3766l.clear();
                        o5Var3.h();
                        return;
                }
            }
        });
        this.f3383n.addView(this.f3385s, ja.c(-1.0f, -2));
        this.f3383n.setVisibility(8);
        na.b(this.f3383n, 0.05f, 1.5f);
        onInsets(0, 0, 0, 0);
        f5 f5Var = new f5(context, this.resourceProvider, true);
        this.F = f5Var;
        f5Var.setSorting(o5Var.f3770p);
        g0(this.F, false);
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final a6 f3677b;

            {
                this.f3677b = this;
            }

            @Override
            public final void onClick(View view42) {
                int i11 = r3;
                final fp fpVar2 = fpVar;
                final a6 a6Var = this.f3677b;
                switch (i11) {
                    case 0:
                        o5 o5Var2 = a6Var.d;
                        if (a6Var.P) {
                            m60 H2 = m60.H(a6Var, a6Var.F);
                            H2.c(2131231890, hd.M0(2131746139, null), new q4(a6Var, 2), false);
                            H2.c(2131231888, hd.M0(2131746143, null), new q4(a6Var, 3), false);
                            H2.c(2131231889, hd.M0(2131746141, null), new q4(a6Var, 4), false);
                            H2.k();
                            H2.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            o5 o5Var3 = a6Var.d;
                                            if (o5Var3.f3772r) {
                                                o5Var3.f3772r = false;
                                                fpVar2.a(false, true);
                                                o5Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            o5 o5Var4 = a6Var.d;
                                            if (!o5Var4.f3772r) {
                                                o5Var4.f3772r = true;
                                                fpVar2.a(true, true);
                                                o5Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, hd.M0(2131749615, null), !o5Var2.f3772r);
                            H2.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            o5 o5Var3 = a6Var.d;
                                            if (o5Var3.f3772r) {
                                                o5Var3.f3772r = false;
                                                fpVar2.a(false, true);
                                                o5Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            o5 o5Var4 = a6Var.d;
                                            if (!o5Var4.f3772r) {
                                                o5Var4.f3772r = true;
                                                fpVar2.a(true, true);
                                                o5Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, hd.M0(2131749614, null), o5Var2.f3772r);
                            H2.f37112t = false;
                            H2.Y = true;
                            H2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a6Var.i0(a6Var.F, H2);
                            return;
                        }
                        return;
                    default:
                        o5 o5Var3 = a6Var.d;
                        if (o5Var3 != null) {
                            boolean z10 = !o5Var3.f3772r;
                            o5Var3.f3772r = z10;
                            fpVar2.a(z10, true);
                            o5Var3.h();
                            return;
                        }
                        return;
                }
            }
        });
        f5 f5Var2 = new f5(context, this.resourceProvider, true);
        this.G = f5Var2;
        f5Var2.setValue(hd.M0(2131750387, null));
        g0(this.G, false);
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final a6 f3716b;

            {
                this.f3716b = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (r3) {
                    case 0:
                        a6.d0(this.f3716b, context);
                        return;
                    case 1:
                        a6.Z(this.f3716b, context);
                        return;
                    default:
                        a6.a0(this.f3716b, context);
                        return;
                }
            }
        });
        f5 f5Var3 = new f5(context, this.resourceProvider, true);
        this.H = f5Var3;
        f5Var3.setValue(hd.M0(2131750388, null));
        g0(this.H, false);
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final a6 f3716b;

            {
                this.f3716b = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (r3) {
                    case 0:
                        a6.d0(this.f3716b, context);
                        return;
                    case 1:
                        a6.Z(this.f3716b, context);
                        return;
                    default:
                        a6.a0(this.f3716b, context);
                        return;
                }
            }
        });
        f5 f5Var4 = new f5(context, this.resourceProvider, true);
        this.I = f5Var4;
        f5Var4.setValue(hd.M0(2131750380, null));
        g0(this.I, true);
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final a6 f3716b;

            {
                this.f3716b = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (r3) {
                    case 0:
                        a6.d0(this.f3716b, context);
                        return;
                    case 1:
                        a6.Z(this.f3716b, context);
                        return;
                    default:
                        a6.a0(this.f3716b, context);
                        return;
                }
            }
        });
        nz nzVar = new nz(getParentActivity());
        this.J = nzVar;
        st0Var.addView(nzVar, ja.c(-1.0f, -1));
        h0(false, false);
        return st0Var;
    }

    public final void g0(f5 f5Var, boolean z10) {
        int L = org.telegram.messenger.g0.L(6.0f);
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        frameLayout.setPadding(L, L, L, L);
        int i7 = 0;
        fh.g c10 = getBaseSimpleGlass().f56042c.c(frameLayout, null, false);
        c10.p(this.N);
        c10.r(org.telegram.messenger.g0.L(20.0f));
        c10.q(L);
        frameLayout.setBackground(c10);
        frameLayout.addView(f5Var, ja.c(40.0f, -2));
        frameLayout.setOnClickListener(new ah.d(f5Var, 7));
        na.a(frameLayout);
        LinearLayout linearLayout = this.E;
        if (!z10) {
            i7 = -4;
        }
        linearLayout.addView(frameLayout, ja.t(-2, -2, 16, 0, 0, i7, 0));
    }

    public final void h0(boolean z10, boolean z11) {
        float f10;
        if (this.P == z10) {
            return;
        }
        this.P = z10;
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q = null;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M, f10);
            this.Q = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 1));
            this.Q.setInterpolator(er.h);
            this.Q.setDuration(420L);
            this.Q.start();
            return;
        }
        this.M = f10;
        j0();
    }

    public final void i0(f5 f5Var, m60 m60Var) {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.g5 simpleMenuOverlay = getSimpleMenuOverlay();
        if (simpleMenuOverlay != null && (m60Var.A instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) && (f5Var.getParent() instanceof FrameLayout)) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) m60Var.A;
            FrameLayout frameLayout2 = (FrameLayout) f5Var.getParent();
            g5 g5Var = this.O;
            if (g5Var.f3552a && (frameLayout = (FrameLayout) g5Var.f3553b) != null && frameLayout != frameLayout2) {
                frameLayout.setVisibility(0);
            }
            g5Var.f3553b = frameLayout2;
            g5Var.f3554c = f5Var;
            g5Var.d = simpleMenuOverlay;
            m60Var.f37106p = new t4(simpleMenuOverlay, 0);
            simpleMenuOverlay.setOnClosed(new u4(actionBarPopupWindow$ActionBarPopupWindowLayout, 0));
            simpleMenuOverlay.d(g5Var, null, actionBarPopupWindow$ActionBarPopupWindowLayout);
            return;
        }
        m60Var.Z();
    }

    @Override
    public final boolean isLightStatusBar() {
        if ((getLastStoryViewer() == null || getLastStoryViewer().H0) && i0.a.h(getThemedColor(org.telegram.ui.ActionBar.j6.f28792a7)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        int i7;
        if (this.f3388y == null) {
            return;
        }
        float f10 = this.M;
        float L = org.telegram.messenger.g0.L(47.0f) * f10;
        this.f3388y.setTranslationY((ri.a.d(this.K) - org.telegram.messenger.g0.L(6.0f)) - L);
        this.f3388y.setAlpha(1.0f - f10);
        HorizontalScrollView horizontalScrollView = this.f3388y;
        if (f10 >= 1.0f) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        horizontalScrollView.setVisibility(i7);
        float f11 = -L;
        this.f3382f.setTranslationY(f11);
        this.h.setTranslationY(f11);
    }

    public final void k0(boolean z10) {
        String M0;
        String M02;
        String M03;
        String H;
        p41 p41Var;
        o5 o5Var = this.d;
        int i7 = o5Var.f3760e;
        HashSet hashSet = o5Var.f3766l;
        ArrayList arrayList = o5Var.h;
        HashSet hashSet2 = o5Var.f3765k;
        ArrayList arrayList2 = o5Var.f3762g;
        HashSet hashSet3 = o5Var.f3764j;
        ArrayList arrayList3 = o5Var.f3761f;
        if (i7 > 12) {
            h0(true, true);
        }
        y4 y4Var = this.f3382f;
        boolean z11 = false;
        if (y4Var != null && (p41Var = y4Var.f39892g3) != null) {
            p41Var.O(true);
            if (z10) {
                this.f3382f.v0(0);
            }
        }
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        if (w4Var != null) {
            int i10 = o5Var.f3760e;
            if (i10 <= 0) {
                H = hd.M0(2131750007, null);
            } else {
                H = hd.H(',', "Gift2ListingsCount", i10);
            }
            w4Var.setSubtitle(H);
        }
        f5 f5Var = this.F;
        if (f5Var != null) {
            f5Var.setSorting(o5Var.f3770p);
        }
        if (this.G != null) {
            int size = arrayList3.size() - hashSet3.size();
            f5 f5Var2 = this.G;
            if (size > 0 && size != arrayList3.size()) {
                M03 = hd.H(',', "Gift2ResaleFilterModels", size);
            } else {
                M03 = hd.M0(2131750023, null);
            }
            f5Var2.setValue(M03);
        }
        if (this.H != null) {
            int size2 = arrayList2.size() - hashSet2.size();
            f5 f5Var3 = this.H;
            if (size2 > 0 && size2 != arrayList2.size()) {
                M02 = hd.H(',', "Gift2ResaleFilterBackdrops", size2);
            } else {
                M02 = hd.M0(2131750027, null);
            }
            f5Var3.setValue(M02);
        }
        if (this.I != null) {
            int size3 = arrayList.size() - hashSet.size();
            f5 f5Var4 = this.I;
            if (size3 > 0 && size3 != arrayList.size()) {
                M0 = hd.H(',', "Gift2ResaleFilterSymbols", size3);
            } else {
                M0 = hd.M0(2131750019, null);
            }
            f5Var4.setValue(M0);
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.f3382f.getChildCount()) {
                break;
            } else if (this.f3382f.getChildAt(i11) instanceof pz) {
                o5Var.g(false);
                break;
            } else {
                i11++;
            }
        }
        if ((o5Var.f3774t || o5Var.f3760e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z11 = true;
        }
        this.f3378a.a(z11, true);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        if (w4Var != null && w4Var.getOccupyStatusBar()) {
            i10 = Math.max(i10, org.telegram.messenger.g0.f23605m);
        }
        this.K = i10;
        this.L = Math.max(i12, org.telegram.messenger.g0.f23606n);
        if (this.f3382f == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(40.0f) + ri.a.d(this.K);
        int L2 = org.telegram.messenger.g0.L(47.0f);
        int i13 = -ri.a.c(this.K);
        int i14 = (-ri.a.c(this.L)) - L2;
        org.telegram.messenger.g0.A3(this.f3382f, org.telegram.messenger.g0.L(7.33f), i13, org.telegram.messenger.g0.L(7.33f), i14);
        this.f3382f.setPadding(0, (org.telegram.messenger.g0.L(4.0f) + L) - i13, 0, (org.telegram.messenger.g0.L(56.0f) + this.L) - i14);
        this.h.getLayoutParams().height = org.telegram.messenger.g0.L(6.0f) + L;
        this.h.requestLayout();
        org.telegram.messenger.g0.A3(this.f3386w, 0, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.K, 0, 0);
        ((FrameLayout.LayoutParams) this.f3384r.getLayoutParams()).bottomMargin = this.L;
        ((FrameLayout.LayoutParams) this.f3383n.getLayoutParams()).bottomMargin = this.L;
        this.f3384r.requestLayout();
        this.f3383n.requestLayout();
        j0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int r12 = org.telegram.ui.ActionBar.j6.r1(0.1f, getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
            if (r12 != this.R) {
                this.R = r12;
                TextView textView = this.f3385s;
                if (textView != null) {
                    org.telegram.ui.ActionBar.j6.H1(textView.getBackground(), r12, true);
                }
                LinearLayout linearLayout = this.S;
                if (linearLayout != null) {
                    org.telegram.ui.ActionBar.j6.H1(linearLayout.getBackground(), r12, true);
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
