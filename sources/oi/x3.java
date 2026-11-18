package oi;

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
import c8.ma;
import c8.ra;
import hi.t6;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.yg;
import org.telegram.ui.d61;
public final class x3 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final LinearLayout E;
    public final ImageView F;
    public final u1 G;
    public final d61 H;
    public final FrameLayout I;
    public final ph0 J;
    public final LinearLayout K;
    public int L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final LinearLayout O;
    public final v1 P;
    public final v1 Q;
    public final v1 R;
    public final v1 S;
    public final v1 T;
    public final ArrayList U;
    public final ArrayList V;
    public final ArrayList W;
    public final k f22455a;
    public boolean f22456a0;
    public final i6 f22457b;
    public int f22458b0;
    public final View f22459c;
    public int f22460c0;
    public final View d;
    public boolean f22461d0;
    public final FrameLayout f22462e;
    public final GradientDrawable f22463e0;
    public final ImageView f22464f;
    public final GradientDrawable f22465f0;
    public final ArrayList f22466g0;
    public final LinearLayout h;
    public final ArrayList f22467h0;
    public final ArrayList f22468i0;
    public final ArrayList f22469j0;
    public final ArrayList f22470k0;
    public int f22471l0;
    public boolean m0;
    public final ImageView f22472n;
    public int f22473n0;
    public boolean f22474o0;
    public final ImageView f22475r;
    public final FrameLayout f22476s;
    public final FrameLayout f22477w;
    public final LinearLayout f22478x;
    public final yg f22479y;

    public x3(Context context, final k kVar) {
        super(context);
        int i7;
        int i10;
        this.L = Integer.MAX_VALUE;
        this.U = new ArrayList();
        this.V = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.W = arrayList;
        this.f22458b0 = -1;
        this.f22460c0 = 0;
        this.f22466g0 = new ArrayList();
        this.f22467h0 = new ArrayList();
        this.f22468i0 = new ArrayList();
        this.f22469j0 = new ArrayList();
        this.f22470k0 = new ArrayList();
        this.f22455a = kVar;
        i6 i6Var = kVar.f22126a.f36765a;
        this.f22457b = i6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.f22459c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i11 = n6.f29394d6;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{n6.w0(i11, i6Var), n6.r1(0.0f, n6.w0(i11, i6Var))});
        this.f22463e0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, ma.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{n6.r1(0.0f, n6.w0(i11, i6Var)), n6.w0(i11, i6Var)});
        this.f22465f0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        addView(view2, ma.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f22462e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, ma.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f22464f = imageView;
        imageView.setImageResource(2131231240);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i12 = n6.Pl;
        int w02 = n6.w0(i12, i6Var);
        int w03 = n6.w0(i12, i6Var);
        int i13 = n6.f29486i6;
        org.telegram.ui.Cells.y b02 = n6.b0(w02, n6.w(w03, n6.w0(i13, i6Var)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        f(imageView, i12, b02);
        imageView.setBackground(new y1(b02));
        int i14 = n6.G6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        u6.s(imageView, i14, i6Var, mode);
        ra.a(imageView);
        imageView.setContentDescription(gd.M0(2131754878, null));
        imageView.setOnClickListener(new bi.o(kVar, 11));
        frameLayout.addView(imageView, ma.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        ShapeDrawable d02 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i12, i6Var));
        f(linearLayout, i12, d02);
        linearLayout.setBackground(new y1(d02));
        frameLayout.addView(linearLayout, ma.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.f22472n = imageView2;
        imageView2.setImageResource(2131231599);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y h02 = n6.h0(n6.w0(i13, i6Var), 1, -1);
        q6 M = u6.M(i13);
        imageView2.setBackground(h02);
        u6.j(imageView2, h02, null, M, i6Var);
        u6.s(imageView2, i14, i6Var, mode);
        ra.a(imageView2);
        imageView2.setContentDescription("Undo");
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22126a;
                        oVar.f22207r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22126a.f22207r.c4(view3);
                        return;
                    case 2:
                        kVar.f22126a.f22207r.d4();
                        return;
                    case 3:
                        kVar.f22126a.f22207r.a4();
                        return;
                    case 4:
                        kVar.f22126a.f22207r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22126a;
                        j3 k22 = oVar2.f22207r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.f36765a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new t6(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22126a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22126a.f22207r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22126a.f22207r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22126a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22206n, context2, new t6(kVar2, 16), oVar3.f36765a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22126a);
                        return;
                    default:
                        o oVar4 = kVar.f22126a;
                        oVar4.f22207r.f22327j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView2, ma.r(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.f22475r = imageView3;
        imageView3.setImageResource(2131231582);
        imageView3.setScaleType(scaleType);
        org.telegram.ui.Cells.y h03 = n6.h0(n6.w0(i13, i6Var), 1, -1);
        q6 M2 = u6.M(i13);
        imageView3.setBackground(h03);
        u6.j(imageView3, h03, null, M2, i6Var);
        u6.s(imageView3, i14, i6Var, mode);
        ra.a(imageView3);
        imageView3.setContentDescription("Redo");
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22126a;
                        oVar.f22207r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22126a.f22207r.c4(view3);
                        return;
                    case 2:
                        kVar.f22126a.f22207r.d4();
                        return;
                    case 3:
                        kVar.f22126a.f22207r.a4();
                        return;
                    case 4:
                        kVar.f22126a.f22207r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22126a;
                        j3 k22 = oVar2.f22207r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.f36765a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new t6(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22126a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22126a.f22207r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22126a.f22207r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22126a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22206n, context2, new t6(kVar2, 16), oVar3.f36765a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22126a);
                        return;
                    default:
                        o oVar4 = kVar.f22126a;
                        oVar4.f22207r.f22327j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView3, ma.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f22476s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, ma.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f22477w = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, ma.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f22478x = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout3.addView(linearLayout2, ma.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.ActionBar.w2(context));
        imageView4.setScaleType(scaleType);
        u6.s(imageView4, i14, i6Var, mode);
        org.telegram.ui.Cells.y b03 = n6.b0(n6.w0(i12, i6Var), n6.w(n6.w0(i12, i6Var), n6.w0(i13, i6Var)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        f(imageView4, i12, b03);
        imageView4.setBackground(new y1(b03));
        linearLayout2.addView(imageView4, ma.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        ra.a(imageView4);
        imageView4.setContentDescription("AI");
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22126a;
                        oVar.f22207r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22126a.f22207r.c4(view3);
                        return;
                    case 2:
                        kVar.f22126a.f22207r.d4();
                        return;
                    case 3:
                        kVar.f22126a.f22207r.a4();
                        return;
                    case 4:
                        kVar.f22126a.f22207r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22126a;
                        j3 k22 = oVar2.f22207r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.f36765a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new t6(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22126a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22126a.f22207r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22126a.f22207r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22126a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22206n, context2, new t6(kVar2, 16), oVar3.f36765a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22126a);
                        return;
                    default:
                        o oVar4 = kVar.f22126a;
                        oVar4.f22207r.f22327j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        ShapeDrawable d03 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i11, i6Var));
        f(frameLayout5, i11, d03);
        frameLayout5.setBackground(new y1(d03));
        frameLayout4.addView(frameLayout5, ma.e(-2, 44, 81));
        s1 s1Var = new s1(context, 1);
        s1Var.setClipToOutline(true);
        s1Var.setOutlineProvider(new bg.q0(6));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        linearLayout3.setOrientation(0);
        s1Var.addView(linearLayout3);
        frameLayout5.addView(s1Var, ma.c(-1.0f, -1));
        yg ygVar = new yg(context, 24);
        this.f22479y = ygVar;
        ygVar.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        u6.s(ygVar, i14, i6Var, mode);
        org.telegram.ui.Cells.y b04 = n6.b0(n6.w0(i11, i6Var), n6.w0(i13, i6Var), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        q6 M3 = u6.M(i11);
        q6 M4 = u6.M(i13);
        ygVar.setBackground(b04);
        u6.j(ygVar, b04, M3, M4, i6Var);
        ygVar.j(wg.f41711e, false);
        linearLayout3.addView(ygVar, ma.r(38, 38, 16));
        ra.a(ygVar);
        ygVar.setContentDescription("Emoji");
        ygVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22126a;
                        oVar.f22207r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22126a.f22207r.c4(view3);
                        return;
                    case 2:
                        kVar.f22126a.f22207r.d4();
                        return;
                    case 3:
                        kVar.f22126a.f22207r.a4();
                        return;
                    case 4:
                        kVar.f22126a.f22207r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22126a;
                        j3 k22 = oVar2.f22207r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.f36765a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new t6(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22126a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22126a.f22207r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22126a.f22207r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22126a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22206n, context2, new t6(kVar2, 16), oVar3.f36765a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22126a);
                        return;
                    default:
                        o oVar4 = kVar.f22126a;
                        oVar4.f22207r.f22327j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        a(2131231596, 1, false);
        a(2131231568, 2, true);
        a(2131231585, 4, true);
        a(2131231570, 7, true);
        ImageView imageView5 = new ImageView(context);
        this.F = imageView5;
        imageView5.setImageResource(2131232491);
        imageView5.setScaleType(scaleType);
        u6.s(imageView5, i14, i6Var, mode);
        org.telegram.ui.Cells.y b05 = n6.b0(n6.w0(i11, i6Var), n6.w0(i13, i6Var), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        q6 M5 = u6.M(i11);
        q6 M6 = u6.M(i13);
        imageView5.setBackground(b05);
        u6.j(imageView5, b05, M5, M6, i6Var);
        linearLayout3.addView(imageView5, ma.t(38, 38, 16, 2, 0, 0, 0));
        ra.a(imageView5);
        imageView5.setContentDescription("Attach");
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22126a;
                        oVar.f22207r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22126a.f22207r.c4(view3);
                        return;
                    case 2:
                        kVar.f22126a.f22207r.d4();
                        return;
                    case 3:
                        kVar.f22126a.f22207r.a4();
                        return;
                    case 4:
                        kVar.f22126a.f22207r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22126a;
                        j3 k22 = oVar2.f22207r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.f36765a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new t6(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22126a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22126a.f22207r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22126a.f22207r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22126a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22206n, context2, new t6(kVar2, 16), oVar3.f36765a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22126a);
                        return;
                    default:
                        o oVar4 = kVar.f22126a;
                        oVar4.f22207r.f22327j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout2.addView(frameLayout4, ma.l(1.0f, 0, 44));
        d61 d61Var = new d61(7, context, this);
        this.H = d61Var;
        d61Var.setOrientation(0);
        d61Var.setClipToPadding(false);
        d61Var.setClipChildren(false);
        d61Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(d61Var, ma.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.I = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(frameLayout6, ma.e(80, 60, 81));
        ?? imageView6 = new ImageView(context);
        this.J = imageView6;
        imageView6.f(2131624043, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), null);
        mh0 animatedDrawable = imageView6.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(n6.w0(i14, i6Var), mode));
        ShapeDrawable d04 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i12, i6Var));
        f(imageView6, i12, d04);
        imageView6.setBackground(new y1(d04));
        frameLayout6.addView((View) imageView6, ma.e(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        ShapeDrawable d05 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i12, i6Var));
        f(frameLayout7, i12, d05);
        frameLayout7.setBackground(new y1(d05));
        d61Var.addView(frameLayout7, ma.c(44.0f, -2));
        w3 w3Var = new w3(this, context, 0);
        w3Var.setHorizontalScrollBarEnabled(false);
        w3Var.setClipToOutline(true);
        w3Var.setOutlineProvider(new bg.q0(7));
        frameLayout7.addView(w3Var, ma.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.K = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        w3Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(2131231199, 1, false);
        b(2131231201, 2, false);
        b(2131231207, 16, false);
        b(2131231206, 8, false);
        b(2131231205, 256, false);
        b(2131231552, 4, false);
        b(2131231583, 16384, true);
        b(2131231584, 32768, true);
        v1 v1Var = new v1(2131231581, context, i6Var);
        this.T = v1Var;
        v1Var.c(i12);
        v1Var.setContentDescription(gd.M0(2131746245, null));
        v1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22126a;
                        oVar.f22207r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22126a.f22207r.c4(view3);
                        return;
                    case 2:
                        kVar.f22126a.f22207r.d4();
                        return;
                    case 3:
                        kVar.f22126a.f22207r.a4();
                        return;
                    case 4:
                        kVar.f22126a.f22207r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22126a;
                        j3 k22 = oVar2.f22207r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.f36765a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new t6(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22126a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22126a.f22207r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22126a.f22207r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22126a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22206n, context2, new t6(kVar2, 16), oVar3.f36765a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22126a);
                        return;
                    default:
                        o oVar4 = kVar.f22126a;
                        oVar4.f22207r.f22327j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        if (linearLayout4.getChildCount() == 0) {
            i7 = 0;
        } else {
            i7 = 2;
        }
        linearLayout4.addView(v1Var, ma.t(38, 38, 16, i7, 0, 0, 0));
        v1 v1Var2 = new v1(2131231549, context, i6Var);
        this.Q = v1Var2;
        v1Var2.c(i12);
        v1Var2.setContentDescription(gd.M0(2131745816, null));
        v1Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22126a;
                        oVar.f22207r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22126a.f22207r.c4(view3);
                        return;
                    case 2:
                        kVar.f22126a.f22207r.d4();
                        return;
                    case 3:
                        kVar.f22126a.f22207r.a4();
                        return;
                    case 4:
                        kVar.f22126a.f22207r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22126a;
                        j3 k22 = oVar2.f22207r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.f36765a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new t6(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22126a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22126a.f22207r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22126a.f22207r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22126a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22206n, context2, new t6(kVar2, 16), oVar3.f36765a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22126a);
                        return;
                    default:
                        o oVar4 = kVar.f22126a;
                        oVar4.f22207r.f22327j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        if (linearLayout4.getChildCount() == 0) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        linearLayout4.addView(v1Var2, ma.t(38, 38, 16, i10, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.N = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        ShapeDrawable d06 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i12, i6Var));
        f(linearLayout5, i12, d06);
        linearLayout5.setBackground(new y1(d06));
        d61Var.addView(linearLayout5, ma.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        v1 v1Var3 = new v1(2131231746, context, i6Var);
        this.P = v1Var3;
        v1Var3.c(i12);
        v1Var3.setContentDescription(gd.M0(2131751733, null));
        v1Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22126a;
                        oVar.f22207r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22126a.f22207r.c4(view3);
                        return;
                    case 2:
                        kVar.f22126a.f22207r.d4();
                        return;
                    case 3:
                        kVar.f22126a.f22207r.a4();
                        return;
                    case 4:
                        kVar.f22126a.f22207r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22126a;
                        j3 k22 = oVar2.f22207r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.f36765a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new t6(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22126a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22126a.f22207r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22126a.f22207r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22126a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22206n, context2, new t6(kVar2, 16), oVar3.f36765a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22126a);
                        return;
                    default:
                        o oVar4 = kVar.f22126a;
                        oVar4.f22207r.f22327j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(v1Var3, ma.r(38, 38, 16));
        v1 v1Var4 = new v1(2131232079, context, i6Var);
        this.R = v1Var4;
        v1Var4.c(i12);
        v1Var4.setContentDescription(gd.M0(2131754862, null));
        v1Var4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22126a;
                        oVar.f22207r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22126a.f22207r.c4(view3);
                        return;
                    case 2:
                        kVar.f22126a.f22207r.d4();
                        return;
                    case 3:
                        kVar.f22126a.f22207r.a4();
                        return;
                    case 4:
                        kVar.f22126a.f22207r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22126a;
                        j3 k22 = oVar2.f22207r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.f36765a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new t6(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22126a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22126a.f22207r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22126a.f22207r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22126a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22206n, context2, new t6(kVar2, 16), oVar3.f36765a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22126a);
                        return;
                    default:
                        o oVar4 = kVar.f22126a;
                        oVar4.f22207r.f22327j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(v1Var4, ma.r(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.O = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        ShapeDrawable d07 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i12, i6Var));
        f(linearLayout6, i12, d07);
        linearLayout6.setBackground(new y1(d07));
        d61Var.addView(linearLayout6, ma.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        v1 v1Var5 = new v1(2131231570, context, i6Var);
        this.S = v1Var5;
        v1Var5.c(i12);
        v1Var5.d();
        arrayList.add(v1Var5);
        v1Var5.setContentDescription(gd.M0(2131754864, null));
        v1Var5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22126a;
                        oVar.f22207r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22126a.f22207r.c4(view3);
                        return;
                    case 2:
                        kVar.f22126a.f22207r.d4();
                        return;
                    case 3:
                        kVar.f22126a.f22207r.a4();
                        return;
                    case 4:
                        kVar.f22126a.f22207r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22126a;
                        j3 k22 = oVar2.f22207r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.f36765a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new t6(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22126a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22126a.f22207r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22126a.f22207r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22126a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22206n, context2, new t6(kVar2, 16), oVar3.f36765a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22126a);
                        return;
                    default:
                        o oVar4 = kVar.f22126a;
                        oVar4.f22207r.f22327j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout6.addView(v1Var5, ma.r(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.M = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        ShapeDrawable d08 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i12, i6Var));
        f(linearLayout7, i12, d08);
        linearLayout7.setBackground(new y1(d08));
        d61Var.addView(linearLayout7, 0, ma.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        v1 v1Var6 = new v1(2131231493, context, i6Var);
        v1Var6.setImageDrawable(new org.telegram.ui.ActionBar.w2(context));
        v1Var6.c(i12);
        v1Var6.setContentDescription(gd.M0(2131755006, null));
        v1Var6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22126a;
                        oVar.f22207r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22126a.f22207r.c4(view3);
                        return;
                    case 2:
                        kVar.f22126a.f22207r.d4();
                        return;
                    case 3:
                        kVar.f22126a.f22207r.a4();
                        return;
                    case 4:
                        kVar.f22126a.f22207r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22126a;
                        j3 k22 = oVar2.f22207r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.f36765a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new t6(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22126a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22126a.f22207r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22126a.f22207r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22126a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22206n, context2, new t6(kVar2, 16), oVar3.f36765a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22126a);
                        return;
                    default:
                        o oVar4 = kVar.f22126a;
                        oVar4.f22207r.f22327j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout7.addView(v1Var6, ma.r(38, 38, 16));
        u1 u1Var = new u1(this, context, i6Var);
        this.G = u1Var;
        int i15 = n6.Pe;
        ShapeDrawable d09 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i15, i6Var));
        f(u1Var, i15, d09);
        u1Var.setBackground(new y1(d09));
        ra.a(u1Var);
        linearLayout2.addView(u1Var, ma.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        u1Var.setContentDescription("Send");
        u1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22126a;
                        oVar.f22207r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22126a.f22207r.c4(view3);
                        return;
                    case 2:
                        kVar.f22126a.f22207r.d4();
                        return;
                    case 3:
                        kVar.f22126a.f22207r.a4();
                        return;
                    case 4:
                        kVar.f22126a.f22207r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22126a;
                        j3 k22 = oVar2.f22207r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.f36765a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new t6(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22126a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22126a.f22207r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22126a.f22207r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22126a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22206n, context2, new t6(kVar2, 16), oVar3.f36765a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22126a);
                        return;
                    default:
                        o oVar4 = kVar.f22126a;
                        oVar4.f22207r.f22327j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        u1Var.setOnLongClickListener(new hi.o4(kVar, 5));
        g(0, false);
    }

    public final void a(int i7, int i10, boolean z10) {
        int i11;
        LinearLayout linearLayout = this.E;
        v1 v1Var = new v1(i7, linearLayout.getContext(), this.f22457b);
        v1Var.c(n6.f29394d6);
        if (z10) {
            v1Var.d();
            this.W.add(v1Var);
        }
        v1Var.setTag(Integer.valueOf(i10));
        v1Var.setContentDescription(z1.l0(i10));
        v1Var.setOnClickListener(new v3(this, i10, 1));
        this.U.add(v1Var);
        if (linearLayout.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout.addView(v1Var, ma.t(38, 38, 16, i11, 0, 0, 0));
    }

    public final void b(int i7, int i10, boolean z10) {
        int i11;
        v1 v1Var = new v1(i7, getContext(), this.f22457b);
        v1Var.c(n6.Pl);
        if (z10) {
            v1Var.d();
            this.W.add(v1Var);
        }
        v1Var.setTag(Integer.valueOf(i10));
        v1Var.setContentDescription(z1.n0(i10));
        v1Var.setOnClickListener(new v3(this, i10, 0));
        this.V.add(v1Var);
        LinearLayout linearLayout = this.K;
        if (linearLayout.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout.addView(v1Var, ma.t(38, 38, 16, i11, 0, 0, 0));
    }

    public final void c(int i7, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v1 v1Var = (v1) obj;
            int intValue = ((Integer) v1Var.getTag()).intValue();
            if ((i7 & intValue) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            v1Var.setSelected(z15);
            if (intValue == 1 || intValue == 2) {
                v1Var.setEnabled(z14);
            }
        }
        v1 v1Var2 = this.P;
        v1Var2.setSelected(z10);
        v1 v1Var3 = this.R;
        v1Var3.setSelected(z11);
        v1Var2.setEnabled(z12);
        this.Q.setEnabled(z13);
        v1Var3.setEnabled(z12);
        this.S.setEnabled(z12);
    }

    public final void d(int i7, int i10) {
        boolean z10;
        ArrayList arrayList = this.U;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            v1 v1Var = (v1) obj;
            if (i7 == ((Integer) v1Var.getTag()).intValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            v1Var.setSelected(z10);
            if (z10 && i10 != 0) {
                v1Var.e(i10);
            } else {
                v1Var.a();
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        float f10;
        int i7;
        if (this.f22461d0 != z10 || !z11) {
            this.f22461d0 = z10;
            if (z10) {
                f10 = 1.15f;
            } else {
                f10 = 1.0f;
            }
            ph0 ph0Var = this.J;
            if (z11) {
                ph0Var.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(lr.h).start();
            } else {
                ph0Var.animate().cancel();
                ph0Var.setScaleX(f10);
                ph0Var.setScaleY(f10);
            }
            if (z10) {
                i7 = n6.f29635q7;
            } else {
                i7 = n6.G6;
            }
            ph0Var.setColorFilter(new PorterDuffColorFilter(n6.w0(i7, this.f22457b), PorterDuff.Mode.SRC_IN));
            mh0 animatedDrawable = ph0Var.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f37482b0 > 34) {
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

    public final void f(View view, int i7, Drawable drawable) {
        int i10;
        this.f22466g0.add(view);
        this.f22467h0.add(drawable);
        this.f22468i0.add(Integer.valueOf(i7));
        i6 i6Var = this.f22457b;
        this.f22469j0.add(Integer.valueOf(n6.w0(i7, i6Var)));
        if (drawable instanceof RippleDrawable) {
            i10 = n6.w(n6.w0(i7, i6Var), n6.w0(n6.f29486i6, i6Var));
        } else {
            i10 = 0;
        }
        this.f22470k0.add(Integer.valueOf(i10));
    }

    public final void g(int i7, boolean z10) {
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
        if (this.f22458b0 == i7) {
            return;
        }
        this.f22458b0 = i7;
        FrameLayout frameLayout = this.I;
        int i12 = 0;
        d61 d61Var = this.H;
        LinearLayout linearLayout = this.f22478x;
        float f24 = 0.0f;
        float f25 = 0.8f;
        if (z10) {
            linearLayout.setVisibility(0);
            ViewPropertyAnimator animate = linearLayout.animate();
            if (i7 == 0) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f17);
            if (i7 == 0) {
                f18 = 1.0f;
            } else {
                f18 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f18);
            if (i7 == 0) {
                f19 = 1.0f;
            } else {
                f19 = 0.8f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f19);
            if (i7 == 0) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(30.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationY(L3).setDuration(420L);
            lr lrVar = lr.h;
            duration.setInterpolator(lrVar).withEndAction(new Runnable(this) {
                public final x3 f22387b;

                {
                    this.f22387b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            x3 x3Var = this.f22387b;
                            if (x3Var.f22458b0 != 0) {
                                x3Var.f22478x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            x3 x3Var2 = this.f22387b;
                            if (x3Var2.f22458b0 != 1) {
                                x3Var2.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            x3 x3Var3 = this.f22387b;
                            if (x3Var3.f22458b0 != 2) {
                                x3Var3.I.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            d61Var.setVisibility(0);
            ViewPropertyAnimator animate2 = d61Var.animate();
            if (i7 == 1) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f20);
            if (i7 == 1) {
                f21 = 1.0f;
            } else {
                f21 = 0.8f;
            }
            ViewPropertyAnimator scaleX2 = alpha2.scaleX(f21);
            if (i7 == 1) {
                f22 = 1.0f;
            } else {
                f22 = 0.8f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f22);
            if (i7 == 1) {
                L4 = 0.0f;
            } else {
                L4 = org.telegram.messenger.g0.L(30.0f);
            }
            scaleY2.translationY(L4).setDuration(420L).setInterpolator(lrVar).withEndAction(new Runnable(this) {
                public final x3 f22387b;

                {
                    this.f22387b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            x3 x3Var = this.f22387b;
                            if (x3Var.f22458b0 != 0) {
                                x3Var.f22478x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            x3 x3Var2 = this.f22387b;
                            if (x3Var2.f22458b0 != 1) {
                                x3Var2.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            x3 x3Var3 = this.f22387b;
                            if (x3Var3.f22458b0 != 2) {
                                x3Var3.I.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate3 = frameLayout.animate();
            if (i7 == 2) {
                f24 = 1.0f;
            }
            ViewPropertyAnimator alpha3 = animate3.alpha(f24);
            if (i7 == 2) {
                f23 = 1.0f;
            } else {
                f23 = 0.8f;
            }
            ViewPropertyAnimator scaleX3 = alpha3.scaleX(f23);
            if (i7 == 2) {
                f25 = 1.0f;
            }
            scaleX3.scaleY(f25).setDuration(420L).setInterpolator(lrVar).withEndAction(new Runnable(this) {
                public final x3 f22387b;

                {
                    this.f22387b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            x3 x3Var = this.f22387b;
                            if (x3Var.f22458b0 != 0) {
                                x3Var.f22478x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            x3 x3Var2 = this.f22387b;
                            if (x3Var2.f22458b0 != 1) {
                                x3Var2.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            x3 x3Var3 = this.f22387b;
                            if (x3Var3.f22458b0 != 2) {
                                x3Var3.I.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        if (i7 == 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        if (i7 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        linearLayout.setAlpha(f10);
        if (i7 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        linearLayout.setScaleX(f11);
        if (i7 == 0) {
            f12 = 1.0f;
        } else {
            f12 = 0.8f;
        }
        linearLayout.setScaleY(f12);
        if (i7 == 0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(30.0f);
        }
        linearLayout.setTranslationY(L);
        if (i7 == 1) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        d61Var.setVisibility(i11);
        if (i7 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        d61Var.setAlpha(f13);
        if (i7 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        d61Var.setScaleX(f14);
        if (i7 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        d61Var.setScaleY(f15);
        if (i7 == 1) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.g0.L(30.0f);
        }
        d61Var.setTranslationY(L2);
        if (i7 != 2) {
            i12 = 8;
        }
        frameLayout.setVisibility(i12);
        if (i7 == 2) {
            f24 = 1.0f;
        }
        frameLayout.setAlpha(f24);
        if (i7 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.8f;
        }
        frameLayout.setScaleX(f16);
        if (i7 == 2) {
            f25 = 1.0f;
        }
        frameLayout.setScaleY(f25);
    }

    public ImageView getAddButton() {
        return this.F;
    }

    public FrameLayout getBottomContainer() {
        return this.f22476s;
    }

    public FrameLayout getBottomInnerContainer() {
        return this.f22477w;
    }

    public LinearLayout getBottomPanel() {
        return this.f22478x;
    }

    public View getEmojiButton() {
        return this.f22479y;
    }

    public sg getSendButton() {
        return this.G;
    }

    public void setBackVisible(boolean z10) {
        int i7;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f22464f.setVisibility(i7);
    }

    public void setBottomGradientTranslationY(float f10) {
        this.d.setTranslationY(f10);
    }

    public void setEmojiOpened(boolean z10) {
        wg wgVar;
        String str;
        if (z10) {
            wgVar = wg.d;
        } else {
            wgVar = wg.f41711e;
        }
        yg ygVar = this.f22479y;
        ygVar.j(wgVar, true);
        if (z10) {
            str = "Keyboard";
        } else {
            str = "Emoji";
        }
        ygVar.setContentDescription(str);
    }

    public void setPremiumLocked(boolean z10) {
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((v1) obj).setPremiumLocked(z10);
        }
    }

    public void setQuoteState(boolean z10) {
        this.T.setSelected(z10);
    }

    public void setSelectedBlockType(int i7) {
        d(i7, 0);
    }

    public void setSendEditing(boolean z10) {
        int i7;
        if (z10) {
            i7 = 2131231502;
        } else {
            i7 = 2131232696;
        }
        this.G.setResourceId(i7);
    }

    public void setSendEnabled(boolean z10) {
        float f10;
        u1 u1Var = this.G;
        if (u1Var.isEnabled() == z10) {
            return;
        }
        u1Var.setEnabled(z10);
        ViewPropertyAnimator animate = u1Var.animate();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        n10.n(animate, f10, 150L);
    }

    public void setSendLoading(boolean z10) {
        if (this.f22456a0 == z10) {
            return;
        }
        this.f22456a0 = z10;
        this.G.invalidate();
    }

    public void setTopButtonsOffset(int i7) {
        LinearLayout linearLayout = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.topMargin != i7) {
            layoutParams.topMargin = i7;
            linearLayout.setLayoutParams(layoutParams);
        }
        ImageView imageView = this.f22464f;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        if (layoutParams2.topMargin != i7) {
            layoutParams2.topMargin = i7;
            imageView.setLayoutParams(layoutParams2);
        }
    }

    public void setTopGradientVisible(boolean z10) {
        int i7;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f22459c.setVisibility(i7);
    }

    public void setTopPanelVisible(boolean z10) {
        int i7;
        int i10 = 8;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f22462e.setVisibility(i7);
        if (z10) {
            i10 = 0;
        }
        this.f22459c.setVisibility(i10);
    }

    @Override
    public final void updateColors() {
        throw new UnsupportedOperationException("Method not decompiled: oi.x3.updateColors():void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
