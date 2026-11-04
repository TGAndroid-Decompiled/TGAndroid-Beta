package ai;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.cd;
import b8.mf;
import b8.pf;
import ci.e9;
import ci.lb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs;
import org.telegram.ui.LaunchActivity;
public class i6 extends org.telegram.ui.ActionBar.d2 implements qe.b {
    public HorizontalScrollView E;
    public LinearLayout F;
    public o5 G;
    public o5 H;
    public o5 I;
    public o5 J;
    public gz K;
    public boolean L;
    public int M;
    public int N;
    public LinearLayout O;
    public si.c P;
    public eh.c Q;
    public final qe.a f716a;
    public final long f717b;
    public final String f718c;
    public final w5 d;
    public u10 f719e;
    public org.telegram.ui.ActionBar.w1 f720f;
    public View h;
    public i5 f721n;
    public FrameLayout f722r;
    public FrameLayout f723s;
    public TextView f724w;
    public d2 f725x;
    public boolean f726y;

    public i6(long j10, String str, long j11, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null);
        this.f716a = new qe.a(0, this, xq.h, 380L, false);
        this.L = true;
        this.f717b = j10;
        this.f718c = str;
        this.resourceProvider = e6Var;
        w5 w5Var = new w5(this.currentAccount, j11, new v2(this, 1));
        this.d = w5Var;
        w5Var.g(false);
    }

    public static void Z(i6 i6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        if (j10 == h10.i(i6Var.currentAccount).e()) {
            i6Var.d.d.remove(tL_starGiftUnique);
            i6Var.j0(false);
            if (j10 == h10.i(i6Var.currentAccount).e()) {
                fc a02 = fc.a0(i6Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String M0 = bd.M0(2131752887, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                ac O = a02.O(document, M0, bd.a0(null, null, 2131752888, k2.p1.l(tL_starGiftUnique.num, ',', sb2)));
                O.f31800r = false;
                O.j();
            } else {
                ac O2 = fc.a0(i6Var).O(tL_starGiftUnique.getDocument(), bd.M0(2131752885, null), bd.a0(null, null, 2131752886, org.telegram.messenger.m5.s(i6Var.currentAccount, j10)));
                O2.f31800r = false;
                O2.j();
            }
            i6Var.K.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        f5 f5Var = new f5(bundle, tL_starGiftUnique, j10);
        org.telegram.ui.ActionBar.q4 q4Var = i6Var.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).f27279b) {
            Dialog dialog = i6Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.t2) && z10) {
                ((org.telegram.ui.ActionBar.t2) dialog).O0 = true;
            }
            i6Var.finishFragment();
            org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(f5Var, false, z10);
            }
        } else {
            i6Var.presentFragment(f5Var, true, z10);
        }
        u10 u10Var = i6Var.f719e;
        if (u10Var != null) {
            u10Var.a(Boolean.valueOf(z10));
        }
    }

    public static void a0(i6 i6Var, Context context) {
        w5 w5Var = i6Var.d;
        if (!i6Var.L || w5Var.h.isEmpty()) {
            return;
        }
        f60 f60Var = new f60(i6Var, i6Var.J, false, false);
        f60Var.f33748t = false;
        f60Var.Y = true;
        f60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        f60Var.R = true;
        f60Var.f33742p = new g4(f60Var, 1);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(w5Var.h);
        Collections.sort(arrayList, new w4(i6Var, 0));
        i5 i5Var = new i5(i6Var, new x4(i6Var, strArr, arrayList, 0), new y4(i6Var, f60Var, 0), null, 3);
        i5Var.f35594g3.f33698r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232735);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.F8, i6Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, mf.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        xs xsVar = new xs(context, i6Var.resourceProvider);
        xsVar.setTextSize(1, 16.0f);
        xsVar.setInputType(573441);
        xsVar.setRawInputType(573441);
        org.telegram.ui.ActionBar.r6.E(xsVar, org.telegram.ui.ActionBar.k6.A6, i6Var.resourceProvider);
        org.telegram.ui.ActionBar.r6.m(xsVar, 30, org.telegram.ui.ActionBar.k6.G6, i6Var.resourceProvider);
        xsVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        xsVar.setCursorWidth(1.5f);
        xsVar.setHint(bd.M0(2131750017, null));
        org.telegram.ui.ActionBar.r6.V(xsVar, org.telegram.ui.ActionBar.k6.E8, i6Var.resourceProvider);
        xsVar.setBackground(null);
        frameLayout.addView(xsVar, mf.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        xsVar.addTextChangedListener(new a0(strArr, i5Var, false, 1));
        if (arrayList.size() > 8) {
            f60Var.r(frameLayout, mf.o(-1, 44));
            f60Var.k();
        }
        if (!w5Var.f1076l.isEmpty()) {
            f60Var.c(2131232357, bd.M0(2131745680, null), new z4(i6Var, 0), false);
        }
        f60Var.q(i5Var);
        f60Var.Z();
    }

    public static void b0(i6 i6Var, Context context) {
        w5 w5Var = i6Var.d;
        if (!i6Var.L || w5Var.f1071f.isEmpty()) {
            return;
        }
        f60 f60Var = new f60(i6Var, i6Var.H, false, false);
        f60Var.f33748t = false;
        f60Var.Y = true;
        f60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        f60Var.R = true;
        f60Var.f33742p = new g4(f60Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(w5Var.f1071f);
        Collections.sort(arrayList, new w4(i6Var, 2));
        i5 i5Var = new i5(i6Var, new x4(i6Var, strArr, arrayList, 2), new y4(i6Var, f60Var, 2), null, 1);
        i5Var.f35594g3.f33698r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232735);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.F8, i6Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, mf.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        xs xsVar = new xs(context, i6Var.resourceProvider);
        xsVar.setTextSize(1, 16.0f);
        xsVar.setInputType(573441);
        xsVar.setRawInputType(573441);
        org.telegram.ui.ActionBar.r6.E(xsVar, org.telegram.ui.ActionBar.k6.A6, i6Var.resourceProvider);
        org.telegram.ui.ActionBar.r6.m(xsVar, 30, org.telegram.ui.ActionBar.k6.G6, i6Var.resourceProvider);
        xsVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        xsVar.setCursorWidth(1.5f);
        xsVar.setHint(bd.M0(2131750017, null));
        org.telegram.ui.ActionBar.r6.V(xsVar, org.telegram.ui.ActionBar.k6.E8, i6Var.resourceProvider);
        xsVar.setBackground(null);
        frameLayout.addView(xsVar, mf.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        xsVar.addTextChangedListener(new a0(strArr, i5Var, false, 2));
        if (arrayList.size() > 8) {
            f60Var.r(frameLayout, mf.o(-1, 44));
            f60Var.k();
        }
        if (!w5Var.f1074j.isEmpty()) {
            f60Var.c(2131232357, bd.M0(2131745680, null), new z4(i6Var, 2), false);
        }
        f60Var.q(i5Var);
        f60Var.Z();
    }

    public static void c0(i6 i6Var, Context context) {
        w5 w5Var = i6Var.d;
        if (!i6Var.L || w5Var.f1072g.isEmpty()) {
            return;
        }
        f60 f60Var = new f60(i6Var, i6Var.I, false, false);
        f60Var.f33748t = false;
        f60Var.Y = true;
        f60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        f60Var.R = true;
        f60Var.f33742p = new g4(f60Var, 2);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(w5Var.f1072g);
        Collections.sort(arrayList, new w4(i6Var, 1));
        i5 i5Var = new i5(i6Var, new x4(i6Var, strArr, arrayList, 1), new y4(i6Var, f60Var, 1), null, 2);
        i5Var.f35594g3.f33698r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232735);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.F8, i6Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, mf.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        xs xsVar = new xs(context, i6Var.resourceProvider);
        xsVar.setTextSize(1, 16.0f);
        xsVar.setInputType(573441);
        xsVar.setRawInputType(573441);
        org.telegram.ui.ActionBar.r6.E(xsVar, org.telegram.ui.ActionBar.k6.A6, i6Var.resourceProvider);
        org.telegram.ui.ActionBar.r6.m(xsVar, 30, org.telegram.ui.ActionBar.k6.G6, i6Var.resourceProvider);
        xsVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        xsVar.setCursorWidth(1.5f);
        xsVar.setHint(bd.M0(2131750017, null));
        org.telegram.ui.ActionBar.r6.V(xsVar, org.telegram.ui.ActionBar.k6.E8, i6Var.resourceProvider);
        xsVar.setBackground(null);
        frameLayout.addView(xsVar, mf.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        xsVar.addTextChangedListener(new a0(strArr, i5Var, false, 3));
        if (arrayList.size() > 8) {
            f60Var.r(frameLayout, mf.o(-1, 44));
            f60Var.k();
        }
        if (!w5Var.f1075k.isEmpty()) {
            f60Var.c(2131232357, bd.M0(2131745680, null), new z4(i6Var, 1), false);
        }
        f60Var.q(i5Var);
        f60Var.Z();
    }

    public static void d0(i6 i6Var, r31 r31Var) {
        Object obj = r31Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            ci.l6 l6Var = new ci.l6(i6Var.getParentActivity(), i6Var.currentAccount, i6Var.f717b, i6Var.resourceProvider, null);
            l6Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, i6Var.d);
            l6Var.K2 = new b5(i6Var);
            i6Var.showDialog(l6Var);
        }
    }

    public static org.telegram.ui.ActionBar.k e0(i6 i6Var) {
        return i6Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k f0(i6 i6Var) {
        return i6Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k g0(i6 i6Var) {
        return i6Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k h0(i6 i6Var) {
        return i6Var.actionBar;
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            this.f723s.setTranslationY((-org.telegram.messenger.g0.L(52.0f)) * f10);
            l00.d(this.f722r, f10);
        }
    }

    @Override
    public final View createView(final Context context) {
        si.c cVar = new si.c();
        this.P = cVar;
        int i3 = org.telegram.ui.ActionBar.k6.f27878d6;
        cVar.a(getThemedColor(i3));
        si.c cVar2 = this.P;
        this.Q = new eh.c(cVar2, cVar2, cVar2);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(false);
        this.f720f = w1Var;
        kVar.setBackButtonDrawable(w1Var);
        this.f720f.f28772k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new g5(this, 0));
        this.actionBar.setTitle(this.f718c);
        org.telegram.ui.ActionBar.r6.i(i3, this.actionBar, getResourceProvider());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(kVar2, 1, i10, getResourceProvider());
        org.telegram.ui.ActionBar.r6.b(this.actionBar, i10, getResourceProvider(), true);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f28292z8, getResourceProvider());
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 5, i10, getResourceProvider());
        org.telegram.ui.ActionBar.r6.c(this.actionBar, org.telegram.ui.ActionBar.k6.f28290z6, getResourceProvider());
        h5 h5Var = new h5(0, context, this);
        int w10 = org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(i3, this.resourceProvider), org.telegram.ui.ActionBar.k6.r1(0.04f, org.telegram.ui.ActionBar.k6.w0(i10, this.resourceProvider)));
        h5Var.setBackgroundColor(w10);
        this.M = w10;
        this.fragmentView = h5Var;
        lb lbVar = new lb(this.currentAccount, context, this.resourceProvider);
        lbVar.d = true;
        pf.a(lbVar);
        lbVar.setOnClickListener(new d(1, this, lbVar));
        this.actionBar.addView(lbVar, mf.d(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        i5 i5Var = new i5(this, new c(this, 7), new b5(this), new a3.j(this, 3), 0);
        this.f721n = i5Var;
        i5Var.f35594g3.f33698r = false;
        i5Var.setSpanCount(3);
        this.f721n.j(new j5(this, 0));
        this.f721n.setPadding(0, org.telegram.messenger.g0.L(45.0f), 0, org.telegram.messenger.g0.L(101.0f));
        this.f721n.setClipToPadding(false);
        h5Var.addView(this.f721n, mf.d(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        h5Var.addView(this.actionBar);
        d2 d2Var = new d2(context, new View.OnClickListener(this) {
            public final i6 f546b;

            {
                this.f546b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w5 w5Var = this.f546b.d;
                        w5Var.f1075k.clear();
                        w5Var.f1074j.clear();
                        w5Var.f1076l.clear();
                        w5Var.h();
                        return;
                    default:
                        w5 w5Var2 = this.f546b.d;
                        w5Var2.f1075k.clear();
                        w5Var2.f1074j.clear();
                        w5Var2.f1076l.clear();
                        w5Var2.h();
                        return;
                }
            }
        }, this.resourceProvider);
        this.f725x = d2Var;
        this.f726y = false;
        d2Var.setAlpha(0.0f);
        this.f725x.setScaleX(0.95f);
        this.f725x.setScaleY(0.95f);
        this.f725x.setVisibility(8);
        h5Var.addView(this.f725x, mf.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.F = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
        this.F.setOrientation(0);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.E = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.E.addView(this.F);
        this.E.setBackgroundColor(w10);
        this.E.setClipChildren(false);
        h5Var.addView(this.E, mf.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27879d7, view, getResourceProvider());
        this.h.setAlpha(0.0f);
        h5Var.addView(this.h, mf.a(-1.0f, 2.0f / org.telegram.messenger.g0.f22607p, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
        linearLayout2.setOrientation(0);
        final wo woVar = new wo(24, context, this.resourceProvider);
        woVar.b(org.telegram.ui.ActionBar.k6.h7, org.telegram.ui.ActionBar.k6.f27990j7, org.telegram.ui.ActionBar.k6.f28008k7);
        woVar.setDrawUnchecked(true);
        woVar.a(false, false);
        woVar.setDrawBackgroundAsArc(10);
        woVar.setTranslationX(org.telegram.messenger.g0.L(4.0f));
        woVar.setScaleX(0.8f);
        woVar.setScaleY(0.8f);
        linearLayout2.addView(woVar, mf.r(26, 26, 16));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, this.resourceProvider);
        k2.p1.u(textView, 1, 14.0f, null, 2131749621);
        linearLayout2.addView(textView, mf.t(-2, -2, 16, 9, 0, 0, 0));
        int L = org.telegram.messenger.g0.L(18.0f);
        int themedColor = getThemedColor(i3);
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        int w11 = org.telegram.ui.ActionBar.k6.w(themedColor, org.telegram.ui.ActionBar.k6.r1(0.1f, getThemedColor(i11)));
        linearLayout2.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, w11, w11));
        this.O = linearLayout2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f723s = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout2 = this.f723s;
        gh.g c2 = this.Q.c(frameLayout2, null, false);
        c2.p(cd.l(this.resourceProvider));
        c2.q(org.telegram.messenger.g0.L(8.0f));
        c2.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout2.setBackground(c2);
        this.f723s.setOnClickListener(new View.OnClickListener(this) {
            public final i6 f572b;

            {
                this.f572b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i12 = r3;
                final wo woVar2 = woVar;
                final i6 i6Var = this.f572b;
                switch (i12) {
                    case 0:
                        w5 w5Var = i6Var.d;
                        if (w5Var != null) {
                            boolean z10 = !w5Var.f1082r;
                            w5Var.f1082r = z10;
                            woVar2.a(z10, true);
                            w5Var.h();
                            return;
                        }
                        return;
                    default:
                        w5 w5Var2 = i6Var.d;
                        if (i6Var.L) {
                            f60 H = f60.H(i6Var, i6Var.G);
                            H.c(2131231890, bd.M0(2131746149, null), new z4(i6Var, 3), false);
                            H.c(2131231888, bd.M0(2131746153, null), new z4(i6Var, 4), false);
                            H.c(2131231889, bd.M0(2131746151, null), new z4(i6Var, 5), false);
                            H.k();
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            w5 w5Var3 = i6Var.d;
                                            if (w5Var3.f1082r) {
                                                w5Var3.f1082r = false;
                                                woVar2.a(false, true);
                                                w5Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            w5 w5Var4 = i6Var.d;
                                            if (!w5Var4.f1082r) {
                                                w5Var4.f1082r = true;
                                                woVar2.a(true, true);
                                                w5Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, bd.M0(2131749623, null), !w5Var2.f1082r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            w5 w5Var3 = i6Var.d;
                                            if (w5Var3.f1082r) {
                                                w5Var3.f1082r = false;
                                                woVar2.a(false, true);
                                                w5Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            w5 w5Var4 = i6Var.d;
                                            if (!w5Var4.f1082r) {
                                                w5Var4.f1082r = true;
                                                woVar2.a(true, true);
                                                w5Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, bd.M0(2131749622, null), w5Var2.f1082r);
                            H.f33748t = false;
                            H.Y = true;
                            H.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        this.f723s.addView(linearLayout2, mf.c(-1.0f, -2));
        pf.b(this.f723s, 0.04f, 1.5f);
        h5Var.addView(this.f723s, mf.d(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.f22603n / org.telegram.messenger.g0.f22607p));
        e9 y9 = e9.y(this.currentAccount, true);
        if (y9.f5032e && !y9.s().k()) {
            this.f723s.setVisibility(8);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f722r = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout4 = this.f722r;
        gh.g c10 = this.Q.c(frameLayout4, null, false);
        c10.p(cd.l(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(22.0f));
        frameLayout4.setBackground(c10);
        h5Var.addView(this.f722r, mf.d(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.f22603n / org.telegram.messenger.g0.f22607p));
        this.f724w = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new wp(2131232095, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) bd.M0(2131750022, null));
        this.f724w.setText(spannableStringBuilder);
        org.telegram.ui.ActionBar.r6.V(this.f724w, i11, getResourceProvider());
        this.f724w.setTypeface(org.telegram.messenger.g0.o());
        this.f724w.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        TextView textView2 = this.f724w;
        int L2 = org.telegram.messenger.g0.L(22.0f);
        int w12 = org.telegram.ui.ActionBar.k6.w(getThemedColor(i3), org.telegram.ui.ActionBar.k6.r1(0.1f, getThemedColor(i11)));
        textView2.setBackground(org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, 0, w12, w12));
        this.f724w.setGravity(17);
        this.f722r.setOnClickListener(new View.OnClickListener(this) {
            public final i6 f546b;

            {
                this.f546b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        w5 w5Var = this.f546b.d;
                        w5Var.f1075k.clear();
                        w5Var.f1074j.clear();
                        w5Var.f1076l.clear();
                        w5Var.h();
                        return;
                    default:
                        w5 w5Var2 = this.f546b.d;
                        w5Var2.f1075k.clear();
                        w5Var2.f1074j.clear();
                        w5Var2.f1076l.clear();
                        w5Var2.h();
                        return;
                }
            }
        });
        this.f722r.addView(this.f724w, mf.c(-1.0f, -2));
        this.f722r.setVisibility(8);
        pf.b(this.f722r, 0.05f, 1.5f);
        o5 o5Var = new o5(context, this.resourceProvider);
        this.G = o5Var;
        o5Var.setSorting(this.d.f1080p);
        this.F.addView(this.G, mf.t(-2, -2, 16, 0, 0, 6, 0));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final i6 f572b;

            {
                this.f572b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i12 = r3;
                final wo woVar2 = woVar;
                final i6 i6Var = this.f572b;
                switch (i12) {
                    case 0:
                        w5 w5Var = i6Var.d;
                        if (w5Var != null) {
                            boolean z10 = !w5Var.f1082r;
                            w5Var.f1082r = z10;
                            woVar2.a(z10, true);
                            w5Var.h();
                            return;
                        }
                        return;
                    default:
                        w5 w5Var2 = i6Var.d;
                        if (i6Var.L) {
                            f60 H = f60.H(i6Var, i6Var.G);
                            H.c(2131231890, bd.M0(2131746149, null), new z4(i6Var, 3), false);
                            H.c(2131231888, bd.M0(2131746153, null), new z4(i6Var, 4), false);
                            H.c(2131231889, bd.M0(2131746151, null), new z4(i6Var, 5), false);
                            H.k();
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            w5 w5Var3 = i6Var.d;
                                            if (w5Var3.f1082r) {
                                                w5Var3.f1082r = false;
                                                woVar2.a(false, true);
                                                w5Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            w5 w5Var4 = i6Var.d;
                                            if (!w5Var4.f1082r) {
                                                w5Var4.f1082r = true;
                                                woVar2.a(true, true);
                                                w5Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, bd.M0(2131749623, null), !w5Var2.f1082r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            w5 w5Var3 = i6Var.d;
                                            if (w5Var3.f1082r) {
                                                w5Var3.f1082r = false;
                                                woVar2.a(false, true);
                                                w5Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            w5 w5Var4 = i6Var.d;
                                            if (!w5Var4.f1082r) {
                                                w5Var4.f1082r = true;
                                                woVar2.a(true, true);
                                                w5Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, bd.M0(2131749622, null), w5Var2.f1082r);
                            H.f33748t = false;
                            H.Y = true;
                            H.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        o5 o5Var2 = new o5(context, this.resourceProvider);
        this.H = o5Var2;
        o5Var2.setValue(bd.M0(2131750395, null));
        this.F.addView(this.H, mf.t(-2, -2, 16, 0, 0, 6, 0));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final i6 f1041b;

            {
                this.f1041b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        i6.b0(this.f1041b, context);
                        return;
                    case 1:
                        i6.c0(this.f1041b, context);
                        return;
                    default:
                        i6.a0(this.f1041b, context);
                        return;
                }
            }
        });
        o5 o5Var3 = new o5(context, this.resourceProvider);
        this.I = o5Var3;
        o5Var3.setValue(bd.M0(2131750396, null));
        this.F.addView(this.I, mf.t(-2, -2, 16, 0, 0, 6, 0));
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final i6 f1041b;

            {
                this.f1041b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        i6.b0(this.f1041b, context);
                        return;
                    case 1:
                        i6.c0(this.f1041b, context);
                        return;
                    default:
                        i6.a0(this.f1041b, context);
                        return;
                }
            }
        });
        o5 o5Var4 = new o5(context, this.resourceProvider);
        this.J = o5Var4;
        o5Var4.setValue(bd.M0(2131750388, null));
        this.F.addView(this.J, mf.t(-2, -2, 16, 0, 0, 0, 0));
        this.J.setOnClickListener(new View.OnClickListener(this) {
            public final i6 f1041b;

            {
                this.f1041b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        i6.b0(this.f1041b, context);
                        return;
                    case 1:
                        i6.c0(this.f1041b, context);
                        return;
                    default:
                        i6.a0(this.f1041b, context);
                        return;
                }
            }
        });
        gz gzVar = new gz(getParentActivity());
        this.K = gzVar;
        h5Var.addView(gzVar, mf.c(-1.0f, -1));
        i0(false, false);
        return h5Var;
    }

    public final void i0(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.L == z10) {
            return;
        }
        this.L = z10;
        float f14 = 1.0f;
        int i3 = 0;
        float f15 = 0.0f;
        if (z11) {
            this.E.setVisibility(0);
            ViewPropertyAnimator animate = this.E.animate();
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = -org.telegram.messenger.g0.L(45.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(f12);
            if (!z10) {
                f14 = 0.0f;
            }
            ViewPropertyAnimator alpha = translationY.alpha(f14);
            xq xqVar = xq.h;
            alpha.setInterpolator(xqVar).setDuration(420L).setListener(new e5(this, z10, 0)).start();
            ViewPropertyAnimator animate2 = this.h.animate();
            if (z10) {
                f13 = 0.0f;
            } else {
                f13 = -org.telegram.messenger.g0.L(45.0f);
            }
            animate2.translationY(f13).setInterpolator(xqVar).setDuration(420L).start();
            ViewPropertyAnimator animate3 = this.f721n.animate();
            if (!z10) {
                f15 = -org.telegram.messenger.g0.L(39.0f);
            }
            animate3.translationY(f15).setInterpolator(xqVar).setDuration(420L).start();
            return;
        }
        HorizontalScrollView horizontalScrollView = this.E;
        if (!z10) {
            i3 = 8;
        }
        horizontalScrollView.setVisibility(i3);
        HorizontalScrollView horizontalScrollView2 = this.E;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = -org.telegram.messenger.g0.L(45.0f);
        }
        horizontalScrollView2.setTranslationY(f10);
        HorizontalScrollView horizontalScrollView3 = this.E;
        if (!z10) {
            f14 = 0.0f;
        }
        horizontalScrollView3.setAlpha(f14);
        View view = this.h;
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = -org.telegram.messenger.g0.L(45.0f);
        }
        view.setTranslationY(f11);
        i5 i5Var = this.f721n;
        if (!z10) {
            f15 = -org.telegram.messenger.g0.L(39.0f);
        }
        i5Var.setTranslationY(f15);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().I0) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false);
            if (this.actionBar.v()) {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28236w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        String M0;
        String M02;
        String M03;
        String H;
        f41 f41Var;
        w5 w5Var = this.d;
        int i3 = w5Var.f1070e;
        HashSet hashSet = w5Var.f1076l;
        ArrayList arrayList = w5Var.h;
        HashSet hashSet2 = w5Var.f1075k;
        ArrayList arrayList2 = w5Var.f1072g;
        HashSet hashSet3 = w5Var.f1074j;
        ArrayList arrayList3 = w5Var.f1071f;
        if (i3 > 12) {
            i0(true, true);
        }
        i5 i5Var = this.f721n;
        boolean z11 = false;
        if (i5Var != null && (f41Var = i5Var.f35594g3) != null) {
            f41Var.O(true);
            if (z10) {
                this.f721n.v0(0);
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(this.f718c);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i10 = w5Var.f1070e;
            if (i10 <= 0) {
                H = bd.M0(2131750015, null);
            } else {
                H = bd.H(',', "Gift2ListingsCount", i10);
            }
            kVar2.setSubtitle(H);
        }
        o5 o5Var = this.G;
        if (o5Var != null) {
            o5Var.setSorting(w5Var.f1080p);
        }
        if (this.H != null) {
            int size = arrayList3.size() - hashSet3.size();
            o5 o5Var2 = this.H;
            if (size > 0 && size != arrayList3.size()) {
                M03 = bd.H(',', "Gift2ResaleFilterModels", size);
            } else {
                M03 = bd.M0(2131750031, null);
            }
            o5Var2.setValue(M03);
        }
        if (this.I != null) {
            int size2 = arrayList2.size() - hashSet2.size();
            o5 o5Var3 = this.I;
            if (size2 > 0 && size2 != arrayList2.size()) {
                M02 = bd.H(',', "Gift2ResaleFilterBackdrops", size2);
            } else {
                M02 = bd.M0(2131750035, null);
            }
            o5Var3.setValue(M02);
        }
        if (this.J != null) {
            int size3 = arrayList.size() - hashSet.size();
            o5 o5Var4 = this.J;
            if (size3 > 0 && size3 != arrayList.size()) {
                M0 = bd.H(',', "Gift2ResaleFilterSymbols", size3);
            } else {
                M0 = bd.M0(2131750027, null);
            }
            o5Var4.setValue(M0);
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.f721n.getChildCount()) {
                break;
            } else if (this.f721n.getChildAt(i11) instanceof iz) {
                w5Var.g(false);
                break;
            } else {
                i11++;
            }
        }
        if ((w5Var.f1084t || w5Var.f1070e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z11 = true;
        }
        this.f716a.a(z11, true);
    }

    @Override
    public final void onThemeColorsChanged() {
        boolean z10;
        try {
            super.onThemeColorsChanged();
            si.c cVar = this.P;
            int i3 = org.telegram.ui.ActionBar.k6.f27878d6;
            cVar.a(getThemedColor(i3));
            int w10 = org.telegram.ui.ActionBar.k6.w(getThemedColor(i3), org.telegram.ui.ActionBar.k6.r1(0.1f, getThemedColor(org.telegram.ui.ActionBar.k6.Ci)));
            if (w10 != this.N) {
                this.N = w10;
                TextView textView = this.f724w;
                if (textView != null) {
                    org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), w10, true);
                }
                LinearLayout linearLayout = this.O;
                if (linearLayout != null) {
                    org.telegram.ui.ActionBar.k6.H1(linearLayout.getBackground(), w10, true);
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            int w11 = org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.resourceProvider), org.telegram.ui.ActionBar.k6.r1(0.04f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.resourceProvider)));
            int i10 = this.M;
            if (w11 != i10) {
                HorizontalScrollView horizontalScrollView = this.E;
                boolean z11 = false;
                if (horizontalScrollView != null && (horizontalScrollView.getBackground() instanceof ColorDrawable) && ((ColorDrawable) horizontalScrollView.getBackground()).getColor() == i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.E.setBackgroundColor(w11);
                }
                View view = this.fragmentView;
                int i11 = this.M;
                if (view != null && (view.getBackground() instanceof ColorDrawable) && ((ColorDrawable) view.getBackground()).getColor() == i11) {
                    z11 = true;
                }
                if (z11) {
                    this.fragmentView.setBackgroundColor(w11);
                }
                this.M = w11;
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
