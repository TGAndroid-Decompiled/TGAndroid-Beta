package mi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import b8.mf;
import b8.pf;
import gi.j8;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.xq;
import org.telegram.ui.s51;
public final class y3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final LinearLayout E;
    public final ImageView F;
    public final x1 G;
    public final s51 H;
    public final FrameLayout I;
    public final fh0 J;
    public final LinearLayout K;
    public int L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final LinearLayout O;
    public final y1 P;
    public final y1 Q;
    public final y1 R;
    public final y1 S;
    public final y1 T;
    public final ArrayList U;
    public final ArrayList V;
    public final ArrayList W;
    public final l f20053a;
    public boolean f20054a0;
    public final org.telegram.ui.ActionBar.e6 f20055b;
    public int f20056b0;
    public final View f20057c;
    public int f20058c0;
    public final View d;
    public boolean f20059d0;
    public final FrameLayout f20060e;
    public final GradientDrawable f20061e0;
    public final ImageView f20062f;
    public final GradientDrawable f20063f0;
    public final ArrayList f20064g0;
    public final LinearLayout h;
    public final ArrayList f20065h0;
    public final ArrayList f20066i0;
    public final ArrayList f20067j0;
    public final ArrayList f20068k0;
    public int f20069l0;
    public boolean m0;
    public final ImageView f20070n;
    public int f20071n0;
    public boolean f20072o0;
    public final ImageView f20073r;
    public final FrameLayout f20074s;
    public final FrameLayout f20075w;
    public final LinearLayout f20076x;
    public final hg f20077y;

    public y3(Context context, final l lVar) {
        super(context);
        int i3;
        int i10;
        this.L = Integer.MAX_VALUE;
        this.U = new ArrayList();
        this.V = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.W = arrayList;
        this.f20056b0 = -1;
        this.f20058c0 = 0;
        this.f20064g0 = new ArrayList();
        this.f20065h0 = new ArrayList();
        this.f20066i0 = new ArrayList();
        this.f20067j0 = new ArrayList();
        this.f20068k0 = new ArrayList();
        this.f20053a = lVar;
        org.telegram.ui.ActionBar.e6 e6Var = lVar.f19728a.f38415a;
        this.f20055b = e6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.f20057c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i11 = k6.f27878d6;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{k6.w0(i11, e6Var), k6.r1(0.0f, k6.w0(i11, e6Var))});
        this.f20061e0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, mf.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{k6.r1(0.0f, k6.w0(i11, e6Var)), k6.w0(i11, e6Var)});
        this.f20063f0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        addView(view2, mf.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f20060e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, mf.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f20062f = imageView;
        imageView.setImageResource(2131231240);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i12 = k6.Ml;
        int w02 = k6.w0(i12, e6Var);
        int w03 = k6.w0(i12, e6Var);
        int i13 = k6.f27972i6;
        org.telegram.ui.Cells.y b02 = k6.b0(w02, k6.w(w03, k6.w0(i13, e6Var)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        f(imageView, i12, b02);
        imageView.setBackground(new b2(b02));
        int i14 = k6.G6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        r6.t(imageView, i14, e6Var, mode);
        pf.a(imageView);
        imageView.setContentDescription(bd.M0(2131754878, null));
        imageView.setOnClickListener(new ai.t(lVar, 10));
        frameLayout.addView(imageView, mf.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        ShapeDrawable d02 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i12, e6Var));
        f(linearLayout, i12, d02);
        linearLayout.setBackground(new b2(d02));
        frameLayout.addView(linearLayout, mf.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.f20070n = imageView2;
        imageView2.setImageResource(2131231598);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y h02 = k6.h0(k6.w0(i13, e6Var), 1, -1);
        n6 N = r6.N(i13);
        imageView2.setBackground(h02);
        r6.k(imageView2, h02, null, N, e6Var);
        r6.t(imageView2, i14, e6Var, mode);
        pf.a(imageView2);
        imageView2.setContentDescription("Undo");
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f19728a;
                        pVar.f19793r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f19728a.f19793r.c4(view3);
                        return;
                    case 2:
                        lVar.f19728a.f19793r.d4();
                        return;
                    case 3:
                        lVar.f19728a.f19793r.a4();
                        return;
                    case 4:
                        lVar.f19728a.f19793r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f19728a;
                        k3 k22 = pVar2.f19793r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f38415a);
                                e0Var.s1(a10);
                                e0Var.f33236d2 = new j8(k22, 12);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f19728a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f19728a.f19793r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f19728a.f19793r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f19728a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f19792n, context2, new j8(lVar2, 13), pVar3.f38415a).show();
                        return;
                    case 10:
                        p.P(lVar.f19728a);
                        return;
                    default:
                        p pVar4 = lVar.f19728a;
                        pVar4.f19793r.f19909j4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView2, mf.r(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.f20073r = imageView3;
        imageView3.setImageResource(2131231581);
        imageView3.setScaleType(scaleType);
        org.telegram.ui.Cells.y h03 = k6.h0(k6.w0(i13, e6Var), 1, -1);
        n6 N2 = r6.N(i13);
        imageView3.setBackground(h03);
        r6.k(imageView3, h03, null, N2, e6Var);
        r6.t(imageView3, i14, e6Var, mode);
        pf.a(imageView3);
        imageView3.setContentDescription("Redo");
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f19728a;
                        pVar.f19793r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f19728a.f19793r.c4(view3);
                        return;
                    case 2:
                        lVar.f19728a.f19793r.d4();
                        return;
                    case 3:
                        lVar.f19728a.f19793r.a4();
                        return;
                    case 4:
                        lVar.f19728a.f19793r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f19728a;
                        k3 k22 = pVar2.f19793r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f38415a);
                                e0Var.s1(a10);
                                e0Var.f33236d2 = new j8(k22, 12);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f19728a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f19728a.f19793r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f19728a.f19793r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f19728a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f19792n, context2, new j8(lVar2, 13), pVar3.f38415a).show();
                        return;
                    case 10:
                        p.P(lVar.f19728a);
                        return;
                    default:
                        p pVar4 = lVar.f19728a;
                        pVar4.f19793r.f19909j4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView3, mf.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f20074s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, mf.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f20075w = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, mf.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f20076x = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout3.addView(linearLayout2, mf.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.ActionBar.s2(context));
        imageView4.setScaleType(scaleType);
        r6.t(imageView4, i14, e6Var, mode);
        org.telegram.ui.Cells.y b03 = k6.b0(k6.w0(i12, e6Var), k6.w(k6.w0(i12, e6Var), k6.w0(i13, e6Var)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        f(imageView4, i12, b03);
        imageView4.setBackground(new b2(b03));
        linearLayout2.addView(imageView4, mf.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        pf.a(imageView4);
        imageView4.setContentDescription("AI");
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f19728a;
                        pVar.f19793r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f19728a.f19793r.c4(view3);
                        return;
                    case 2:
                        lVar.f19728a.f19793r.d4();
                        return;
                    case 3:
                        lVar.f19728a.f19793r.a4();
                        return;
                    case 4:
                        lVar.f19728a.f19793r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f19728a;
                        k3 k22 = pVar2.f19793r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f38415a);
                                e0Var.s1(a10);
                                e0Var.f33236d2 = new j8(k22, 12);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f19728a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f19728a.f19793r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f19728a.f19793r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f19728a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f19792n, context2, new j8(lVar2, 13), pVar3.f38415a).show();
                        return;
                    case 10:
                        p.P(lVar.f19728a);
                        return;
                    default:
                        p pVar4 = lVar.f19728a;
                        pVar4.f19793r.f19909j4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        ShapeDrawable d03 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i11, e6Var));
        f(frameLayout5, i11, d03);
        frameLayout5.setBackground(new b2(d03));
        frameLayout4.addView(frameLayout5, mf.e(-2, 44, 81));
        v1 v1Var = new v1(context, 1);
        v1Var.setClipToOutline(true);
        v1Var.setOutlineProvider(new cg.p0(7));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        linearLayout3.setOrientation(0);
        v1Var.addView(linearLayout3);
        frameLayout5.addView(v1Var, mf.c(-1.0f, -1));
        hg hgVar = new hg(context, 24);
        this.f20077y = hgVar;
        hgVar.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        r6.t(hgVar, i14, e6Var, mode);
        org.telegram.ui.Cells.y b04 = k6.b0(k6.w0(i11, e6Var), k6.w0(i13, e6Var), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        n6 N3 = r6.N(i11);
        n6 N4 = r6.N(i13);
        hgVar.setBackground(b04);
        r6.k(hgVar, b04, N3, N4, e6Var);
        hgVar.j(fg.f33793e, false);
        linearLayout3.addView(hgVar, mf.r(38, 38, 16));
        pf.a(hgVar);
        hgVar.setContentDescription("Emoji");
        hgVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f19728a;
                        pVar.f19793r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f19728a.f19793r.c4(view3);
                        return;
                    case 2:
                        lVar.f19728a.f19793r.d4();
                        return;
                    case 3:
                        lVar.f19728a.f19793r.a4();
                        return;
                    case 4:
                        lVar.f19728a.f19793r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f19728a;
                        k3 k22 = pVar2.f19793r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f38415a);
                                e0Var.s1(a10);
                                e0Var.f33236d2 = new j8(k22, 12);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f19728a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f19728a.f19793r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f19728a.f19793r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f19728a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f19792n, context2, new j8(lVar2, 13), pVar3.f38415a).show();
                        return;
                    case 10:
                        p.P(lVar.f19728a);
                        return;
                    default:
                        p pVar4 = lVar.f19728a;
                        pVar4.f19793r.f19909j4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        a(2131231595, 1, false);
        a(2131231567, 2, true);
        a(2131231584, 4, true);
        a(2131231569, 7, true);
        ImageView imageView5 = new ImageView(context);
        this.F = imageView5;
        imageView5.setImageResource(2131232489);
        imageView5.setScaleType(scaleType);
        r6.t(imageView5, i14, e6Var, mode);
        org.telegram.ui.Cells.y b05 = k6.b0(k6.w0(i11, e6Var), k6.w0(i13, e6Var), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        n6 N5 = r6.N(i11);
        n6 N6 = r6.N(i13);
        imageView5.setBackground(b05);
        r6.k(imageView5, b05, N5, N6, e6Var);
        linearLayout3.addView(imageView5, mf.t(38, 38, 16, 2, 0, 0, 0));
        pf.a(imageView5);
        imageView5.setContentDescription("Attach");
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f19728a;
                        pVar.f19793r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f19728a.f19793r.c4(view3);
                        return;
                    case 2:
                        lVar.f19728a.f19793r.d4();
                        return;
                    case 3:
                        lVar.f19728a.f19793r.a4();
                        return;
                    case 4:
                        lVar.f19728a.f19793r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f19728a;
                        k3 k22 = pVar2.f19793r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f38415a);
                                e0Var.s1(a10);
                                e0Var.f33236d2 = new j8(k22, 12);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f19728a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f19728a.f19793r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f19728a.f19793r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f19728a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f19792n, context2, new j8(lVar2, 13), pVar3.f38415a).show();
                        return;
                    case 10:
                        p.P(lVar.f19728a);
                        return;
                    default:
                        p pVar4 = lVar.f19728a;
                        pVar4.f19793r.f19909j4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout2.addView(frameLayout4, mf.l(1.0f, 0, 44));
        s51 s51Var = new s51(8, context, this);
        this.H = s51Var;
        s51Var.setOrientation(0);
        s51Var.setClipToPadding(false);
        s51Var.setClipChildren(false);
        s51Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(s51Var, mf.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.I = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(frameLayout6, mf.e(80, 60, 81));
        ?? imageView6 = new ImageView(context);
        this.J = imageView6;
        imageView6.f(2131624042, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), null);
        ch0 animatedDrawable = imageView6.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(k6.w0(i14, e6Var), mode));
        ShapeDrawable d04 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i12, e6Var));
        f(imageView6, i12, d04);
        imageView6.setBackground(new b2(d04));
        frameLayout6.addView((View) imageView6, mf.e(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        ShapeDrawable d05 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i12, e6Var));
        f(frameLayout7, i12, d05);
        frameLayout7.setBackground(new b2(d05));
        s51Var.addView(frameLayout7, mf.c(44.0f, -2));
        x3 x3Var = new x3(this, context, 0);
        x3Var.setHorizontalScrollBarEnabled(false);
        x3Var.setClipToOutline(true);
        x3Var.setOutlineProvider(new cg.p0(8));
        frameLayout7.addView(x3Var, mf.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.K = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        x3Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(2131231199, 1, false);
        b(2131231201, 2, false);
        b(2131231207, 16, false);
        b(2131231206, 8, false);
        b(2131231205, 256, false);
        b(2131231551, 4, false);
        b(2131231582, 16384, true);
        b(2131231583, 32768, true);
        y1 y1Var = new y1(2131231580, context, e6Var);
        this.T = y1Var;
        y1Var.c(i12);
        y1Var.setContentDescription(bd.M0(2131746448, null));
        y1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f19728a;
                        pVar.f19793r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f19728a.f19793r.c4(view3);
                        return;
                    case 2:
                        lVar.f19728a.f19793r.d4();
                        return;
                    case 3:
                        lVar.f19728a.f19793r.a4();
                        return;
                    case 4:
                        lVar.f19728a.f19793r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f19728a;
                        k3 k22 = pVar2.f19793r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f38415a);
                                e0Var.s1(a10);
                                e0Var.f33236d2 = new j8(k22, 12);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f19728a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f19728a.f19793r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f19728a.f19793r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f19728a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f19792n, context2, new j8(lVar2, 13), pVar3.f38415a).show();
                        return;
                    case 10:
                        p.P(lVar.f19728a);
                        return;
                    default:
                        p pVar4 = lVar.f19728a;
                        pVar4.f19793r.f19909j4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        if (linearLayout4.getChildCount() == 0) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        linearLayout4.addView(y1Var, mf.t(38, 38, 16, i3, 0, 0, 0));
        y1 y1Var2 = new y1(2131231548, context, e6Var);
        this.Q = y1Var2;
        y1Var2.c(i12);
        y1Var2.setContentDescription(bd.M0(2131746021, null));
        y1Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f19728a;
                        pVar.f19793r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f19728a.f19793r.c4(view3);
                        return;
                    case 2:
                        lVar.f19728a.f19793r.d4();
                        return;
                    case 3:
                        lVar.f19728a.f19793r.a4();
                        return;
                    case 4:
                        lVar.f19728a.f19793r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f19728a;
                        k3 k22 = pVar2.f19793r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f38415a);
                                e0Var.s1(a10);
                                e0Var.f33236d2 = new j8(k22, 12);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f19728a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f19728a.f19793r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f19728a.f19793r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f19728a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f19792n, context2, new j8(lVar2, 13), pVar3.f38415a).show();
                        return;
                    case 10:
                        p.P(lVar.f19728a);
                        return;
                    default:
                        p pVar4 = lVar.f19728a;
                        pVar4.f19793r.f19909j4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        if (linearLayout4.getChildCount() == 0) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        linearLayout4.addView(y1Var2, mf.t(38, 38, 16, i10, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.N = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        ShapeDrawable d06 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i12, e6Var));
        f(linearLayout5, i12, d06);
        linearLayout5.setBackground(new b2(d06));
        s51Var.addView(linearLayout5, mf.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        y1 y1Var3 = new y1(2131231745, context, e6Var);
        this.P = y1Var3;
        y1Var3.c(i12);
        y1Var3.setContentDescription(bd.M0(2131751745, null));
        y1Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f19728a;
                        pVar.f19793r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f19728a.f19793r.c4(view3);
                        return;
                    case 2:
                        lVar.f19728a.f19793r.d4();
                        return;
                    case 3:
                        lVar.f19728a.f19793r.a4();
                        return;
                    case 4:
                        lVar.f19728a.f19793r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f19728a;
                        k3 k22 = pVar2.f19793r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f38415a);
                                e0Var.s1(a10);
                                e0Var.f33236d2 = new j8(k22, 12);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f19728a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f19728a.f19793r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f19728a.f19793r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f19728a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f19792n, context2, new j8(lVar2, 13), pVar3.f38415a).show();
                        return;
                    case 10:
                        p.P(lVar.f19728a);
                        return;
                    default:
                        p pVar4 = lVar.f19728a;
                        pVar4.f19793r.f19909j4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(y1Var3, mf.r(38, 38, 16));
        y1 y1Var4 = new y1(2131232077, context, e6Var);
        this.R = y1Var4;
        y1Var4.c(i12);
        y1Var4.setContentDescription(bd.M0(2131754862, null));
        y1Var4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f19728a;
                        pVar.f19793r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f19728a.f19793r.c4(view3);
                        return;
                    case 2:
                        lVar.f19728a.f19793r.d4();
                        return;
                    case 3:
                        lVar.f19728a.f19793r.a4();
                        return;
                    case 4:
                        lVar.f19728a.f19793r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f19728a;
                        k3 k22 = pVar2.f19793r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f38415a);
                                e0Var.s1(a10);
                                e0Var.f33236d2 = new j8(k22, 12);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f19728a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f19728a.f19793r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f19728a.f19793r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f19728a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f19792n, context2, new j8(lVar2, 13), pVar3.f38415a).show();
                        return;
                    case 10:
                        p.P(lVar.f19728a);
                        return;
                    default:
                        p pVar4 = lVar.f19728a;
                        pVar4.f19793r.f19909j4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(y1Var4, mf.r(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.O = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        ShapeDrawable d07 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i12, e6Var));
        f(linearLayout6, i12, d07);
        linearLayout6.setBackground(new b2(d07));
        s51Var.addView(linearLayout6, mf.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        y1 y1Var5 = new y1(2131231569, context, e6Var);
        this.S = y1Var5;
        y1Var5.c(i12);
        y1Var5.d();
        arrayList.add(y1Var5);
        y1Var5.setContentDescription(bd.M0(2131754864, null));
        y1Var5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f19728a;
                        pVar.f19793r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f19728a.f19793r.c4(view3);
                        return;
                    case 2:
                        lVar.f19728a.f19793r.d4();
                        return;
                    case 3:
                        lVar.f19728a.f19793r.a4();
                        return;
                    case 4:
                        lVar.f19728a.f19793r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f19728a;
                        k3 k22 = pVar2.f19793r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f38415a);
                                e0Var.s1(a10);
                                e0Var.f33236d2 = new j8(k22, 12);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f19728a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f19728a.f19793r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f19728a.f19793r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f19728a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f19792n, context2, new j8(lVar2, 13), pVar3.f38415a).show();
                        return;
                    case 10:
                        p.P(lVar.f19728a);
                        return;
                    default:
                        p pVar4 = lVar.f19728a;
                        pVar4.f19793r.f19909j4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout6.addView(y1Var5, mf.r(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.M = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        ShapeDrawable d08 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i12, e6Var));
        f(linearLayout7, i12, d08);
        linearLayout7.setBackground(new b2(d08));
        s51Var.addView(linearLayout7, 0, mf.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        y1 y1Var6 = new y1(2131231493, context, e6Var);
        y1Var6.setImageDrawable(new org.telegram.ui.ActionBar.s2(context));
        y1Var6.c(i12);
        y1Var6.setContentDescription(bd.M0(2131755006, null));
        y1Var6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f19728a;
                        pVar.f19793r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f19728a.f19793r.c4(view3);
                        return;
                    case 2:
                        lVar.f19728a.f19793r.d4();
                        return;
                    case 3:
                        lVar.f19728a.f19793r.a4();
                        return;
                    case 4:
                        lVar.f19728a.f19793r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f19728a;
                        k3 k22 = pVar2.f19793r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f38415a);
                                e0Var.s1(a10);
                                e0Var.f33236d2 = new j8(k22, 12);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f19728a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f19728a.f19793r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f19728a.f19793r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f19728a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f19792n, context2, new j8(lVar2, 13), pVar3.f38415a).show();
                        return;
                    case 10:
                        p.P(lVar.f19728a);
                        return;
                    default:
                        p pVar4 = lVar.f19728a;
                        pVar4.f19793r.f19909j4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout7.addView(y1Var6, mf.r(38, 38, 16));
        x1 x1Var = new x1(this, context, e6Var);
        this.G = x1Var;
        int i15 = k6.Me;
        ShapeDrawable d09 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i15, e6Var));
        f(x1Var, i15, d09);
        x1Var.setBackground(new b2(d09));
        pf.a(x1Var);
        linearLayout2.addView(x1Var, mf.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        x1Var.setContentDescription("Send");
        x1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f19728a;
                        pVar.f19793r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f19728a.f19793r.c4(view3);
                        return;
                    case 2:
                        lVar.f19728a.f19793r.d4();
                        return;
                    case 3:
                        lVar.f19728a.f19793r.a4();
                        return;
                    case 4:
                        lVar.f19728a.f19793r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f19728a;
                        k3 k22 = pVar2.f19793r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f38415a);
                                e0Var.s1(a10);
                                e0Var.f33236d2 = new j8(k22, 12);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f19728a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f19728a.f19793r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f19728a.f19793r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f19728a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f19792n, context2, new j8(lVar2, 13), pVar3.f38415a).show();
                        return;
                    case 10:
                        p.P(lVar.f19728a);
                        return;
                    default:
                        p pVar4 = lVar.f19728a;
                        pVar4.f19793r.f19909j4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        x1Var.setOnLongClickListener(new gi.p4(lVar, 4));
        g(0, false);
    }

    public final void a(int i3, int i10, boolean z10) {
        int i11;
        LinearLayout linearLayout = this.E;
        y1 y1Var = new y1(i3, linearLayout.getContext(), this.f20055b);
        y1Var.c(k6.f27878d6);
        if (z10) {
            y1Var.d();
            this.W.add(y1Var);
        }
        y1Var.setTag(Integer.valueOf(i10));
        y1Var.setContentDescription(c2.l0(i10));
        y1Var.setOnClickListener(new w3(this, i10, 1));
        this.U.add(y1Var);
        if (linearLayout.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout.addView(y1Var, mf.t(38, 38, 16, i11, 0, 0, 0));
    }

    public final void b(int i3, int i10, boolean z10) {
        int i11;
        y1 y1Var = new y1(i3, getContext(), this.f20055b);
        y1Var.c(k6.Ml);
        if (z10) {
            y1Var.d();
            this.W.add(y1Var);
        }
        y1Var.setTag(Integer.valueOf(i10));
        y1Var.setContentDescription(c2.n0(i10));
        y1Var.setOnClickListener(new w3(this, i10, 0));
        this.V.add(y1Var);
        LinearLayout linearLayout = this.K;
        if (linearLayout.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout.addView(y1Var, mf.t(38, 38, 16, i11, 0, 0, 0));
    }

    public final void c(int i3, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            y1 y1Var = (y1) obj;
            int intValue = ((Integer) y1Var.getTag()).intValue();
            if ((i3 & intValue) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            y1Var.setSelected(z15);
            if (intValue == 1 || intValue == 2) {
                y1Var.setEnabled(z14);
            }
        }
        y1 y1Var2 = this.P;
        y1Var2.setSelected(z10);
        y1 y1Var3 = this.R;
        y1Var3.setSelected(z11);
        y1Var2.setEnabled(z12);
        this.Q.setEnabled(z13);
        y1Var3.setEnabled(z12);
        this.S.setEnabled(z12);
    }

    public final void d(int i3, int i10) {
        boolean z10;
        ArrayList arrayList = this.U;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            y1 y1Var = (y1) obj;
            if (i3 == ((Integer) y1Var.getTag()).intValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            y1Var.setSelected(z10);
            if (z10 && i10 != 0) {
                y1Var.e(i10);
            } else {
                y1Var.a();
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        float f10;
        int i3;
        if (this.f20059d0 != z10 || !z11) {
            this.f20059d0 = z10;
            if (z10) {
                f10 = 1.15f;
            } else {
                f10 = 1.0f;
            }
            fh0 fh0Var = this.J;
            if (z11) {
                fh0Var.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(xq.h).start();
            } else {
                fh0Var.animate().cancel();
                fh0Var.setScaleX(f10);
                fh0Var.setScaleY(f10);
            }
            if (z10) {
                i3 = k6.f28122q7;
            } else {
                i3 = k6.G6;
            }
            fh0Var.setColorFilter(new PorterDuffColorFilter(k6.w0(i3, this.f20055b), PorterDuff.Mode.SRC_IN));
            ch0 animatedDrawable = fh0Var.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f32721b0 > 34) {
                        animatedDrawable.N(0, false, false);
                    }
                    animatedDrawable.P(33);
                } else {
                    animatedDrawable.P(0);
                }
                animatedDrawable.start();
            }
        }
    }

    public final void f(View view, int i3, Drawable drawable) {
        int i10;
        this.f20064g0.add(view);
        this.f20065h0.add(drawable);
        this.f20066i0.add(Integer.valueOf(i3));
        org.telegram.ui.ActionBar.e6 e6Var = this.f20055b;
        this.f20067j0.add(Integer.valueOf(k6.w0(i3, e6Var)));
        if (drawable instanceof RippleDrawable) {
            i10 = k6.w(k6.w0(i3, e6Var), k6.w0(k6.f27972i6, e6Var));
        } else {
            i10 = 0;
        }
        this.f20068k0.add(Integer.valueOf(i10));
    }

    public final void g(int i3, boolean z10) {
        int i10;
        float f10;
        float f11;
        float f12;
        float L;
        int i11;
        float f13;
        float f14;
        float f15;
        float L2;
        float f16;
        float f17;
        float f18;
        float f19;
        float L3;
        float f20;
        float f21;
        float f22;
        float L4;
        float f23;
        if (this.f20056b0 == i3) {
            return;
        }
        this.f20056b0 = i3;
        FrameLayout frameLayout = this.I;
        int i12 = 0;
        s51 s51Var = this.H;
        LinearLayout linearLayout = this.f20076x;
        float f24 = 0.0f;
        float f25 = 0.8f;
        if (z10) {
            linearLayout.setVisibility(0);
            ViewPropertyAnimator animate = linearLayout.animate();
            if (i3 == 0) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f17);
            if (i3 == 0) {
                f18 = 1.0f;
            } else {
                f18 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f18);
            if (i3 == 0) {
                f19 = 1.0f;
            } else {
                f19 = 0.8f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f19);
            if (i3 == 0) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(30.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationY(L3).setDuration(420L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).withEndAction(new Runnable(this) {
                public final y3 f19979b;

                {
                    this.f19979b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            y3 y3Var = this.f19979b;
                            if (y3Var.f20056b0 != 0) {
                                y3Var.f20076x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            y3 y3Var2 = this.f19979b;
                            if (y3Var2.f20056b0 != 1) {
                                y3Var2.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            y3 y3Var3 = this.f19979b;
                            if (y3Var3.f20056b0 != 2) {
                                y3Var3.I.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            s51Var.setVisibility(0);
            ViewPropertyAnimator animate2 = s51Var.animate();
            if (i3 == 1) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f20);
            if (i3 == 1) {
                f21 = 1.0f;
            } else {
                f21 = 0.8f;
            }
            ViewPropertyAnimator scaleX2 = alpha2.scaleX(f21);
            if (i3 == 1) {
                f22 = 1.0f;
            } else {
                f22 = 0.8f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f22);
            if (i3 == 1) {
                L4 = 0.0f;
            } else {
                L4 = org.telegram.messenger.g0.L(30.0f);
            }
            scaleY2.translationY(L4).setDuration(420L).setInterpolator(xqVar).withEndAction(new Runnable(this) {
                public final y3 f19979b;

                {
                    this.f19979b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            y3 y3Var = this.f19979b;
                            if (y3Var.f20056b0 != 0) {
                                y3Var.f20076x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            y3 y3Var2 = this.f19979b;
                            if (y3Var2.f20056b0 != 1) {
                                y3Var2.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            y3 y3Var3 = this.f19979b;
                            if (y3Var3.f20056b0 != 2) {
                                y3Var3.I.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate3 = frameLayout.animate();
            if (i3 == 2) {
                f24 = 1.0f;
            }
            ViewPropertyAnimator alpha3 = animate3.alpha(f24);
            if (i3 == 2) {
                f23 = 1.0f;
            } else {
                f23 = 0.8f;
            }
            ViewPropertyAnimator scaleX3 = alpha3.scaleX(f23);
            if (i3 == 2) {
                f25 = 1.0f;
            }
            scaleX3.scaleY(f25).setDuration(420L).setInterpolator(xqVar).withEndAction(new Runnable(this) {
                public final y3 f19979b;

                {
                    this.f19979b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            y3 y3Var = this.f19979b;
                            if (y3Var.f20056b0 != 0) {
                                y3Var.f20076x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            y3 y3Var2 = this.f19979b;
                            if (y3Var2.f20056b0 != 1) {
                                y3Var2.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            y3 y3Var3 = this.f19979b;
                            if (y3Var3.f20056b0 != 2) {
                                y3Var3.I.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        if (i3 == 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        if (i3 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        linearLayout.setAlpha(f10);
        if (i3 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        linearLayout.setScaleX(f11);
        if (i3 == 0) {
            f12 = 1.0f;
        } else {
            f12 = 0.8f;
        }
        linearLayout.setScaleY(f12);
        if (i3 == 0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(30.0f);
        }
        linearLayout.setTranslationY(L);
        if (i3 == 1) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        s51Var.setVisibility(i11);
        if (i3 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        s51Var.setAlpha(f13);
        if (i3 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        s51Var.setScaleX(f14);
        if (i3 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        s51Var.setScaleY(f15);
        if (i3 == 1) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.g0.L(30.0f);
        }
        s51Var.setTranslationY(L2);
        if (i3 != 2) {
            i12 = 8;
        }
        frameLayout.setVisibility(i12);
        if (i3 == 2) {
            f24 = 1.0f;
        }
        frameLayout.setAlpha(f24);
        if (i3 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.8f;
        }
        frameLayout.setScaleX(f16);
        if (i3 == 2) {
            f25 = 1.0f;
        }
        frameLayout.setScaleY(f25);
    }

    public ImageView getAddButton() {
        return this.F;
    }

    public FrameLayout getBottomContainer() {
        return this.f20074s;
    }

    public FrameLayout getBottomInnerContainer() {
        return this.f20075w;
    }

    public LinearLayout getBottomPanel() {
        return this.f20076x;
    }

    public View getEmojiButton() {
        return this.f20077y;
    }

    public bg getSendButton() {
        return this.G;
    }

    public void setBackVisible(boolean z10) {
        int i3;
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.f20062f.setVisibility(i3);
    }

    public void setBottomGradientTranslationY(float f10) {
        this.d.setTranslationY(f10);
    }

    public void setEmojiOpened(boolean z10) {
        fg fgVar;
        String str;
        if (z10) {
            fgVar = fg.d;
        } else {
            fgVar = fg.f33793e;
        }
        hg hgVar = this.f20077y;
        hgVar.j(fgVar, true);
        if (z10) {
            str = "Keyboard";
        } else {
            str = "Emoji";
        }
        hgVar.setContentDescription(str);
    }

    public void setPremiumLocked(boolean z10) {
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((y1) obj).setPremiumLocked(z10);
        }
    }

    public void setQuoteState(boolean z10) {
        this.T.setSelected(z10);
    }

    public void setSelectedBlockType(int i3) {
        d(i3, 0);
    }

    public void setSendEditing(boolean z10) {
        int i3;
        if (z10) {
            i3 = 2131231501;
        } else {
            i3 = 2131232692;
        }
        this.G.setResourceId(i3);
    }

    public void setSendEnabled(boolean z10) {
        float f10;
        x1 x1Var = this.G;
        if (x1Var.isEnabled() == z10) {
            return;
        }
        x1Var.setEnabled(z10);
        ViewPropertyAnimator animate = x1Var.animate();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        org.telegram.messenger.camera.q.k(animate, f10, 150L);
    }

    public void setSendLoading(boolean z10) {
        if (this.f20054a0 == z10) {
            return;
        }
        this.f20054a0 = z10;
        this.G.invalidate();
    }

    public void setTopButtonsOffset(int i3) {
        LinearLayout linearLayout = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.topMargin != i3) {
            layoutParams.topMargin = i3;
            linearLayout.setLayoutParams(layoutParams);
        }
        ImageView imageView = this.f20062f;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        if (layoutParams2.topMargin != i3) {
            layoutParams2.topMargin = i3;
            imageView.setLayoutParams(layoutParams2);
        }
    }

    public void setTopGradientVisible(boolean z10) {
        int i3;
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.f20057c.setVisibility(i3);
    }

    public void setTopPanelVisible(boolean z10) {
        int i3;
        int i10 = 8;
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.f20060e.setVisibility(i3);
        if (z10) {
            i10 = 0;
        }
        this.f20057c.setVisibility(i10);
    }

    @Override
    public final void updateColors() {
        throw new UnsupportedOperationException("Method not decompiled: mi.y3.updateColors():void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
