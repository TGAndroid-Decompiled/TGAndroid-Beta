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
import c8.na;
import c8.sa;
import hi.c7;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.xg;
import org.telegram.ui.Components.zg;
import org.telegram.ui.b61;
public final class y3 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final LinearLayout E;
    public final ImageView F;
    public final w1 G;
    public final b61 H;
    public final FrameLayout I;
    public final qh0 J;
    public final LinearLayout K;
    public int L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final LinearLayout O;
    public final x1 P;
    public final x1 Q;
    public final x1 R;
    public final x1 S;
    public final x1 T;
    public final ArrayList U;
    public final ArrayList V;
    public final ArrayList W;
    public final l f22611a;
    public boolean f22612a0;
    public final i6 f22613b;
    public int f22614b0;
    public final View f22615c;
    public int f22616c0;
    public final View d;
    public boolean f22617d0;
    public final FrameLayout f22618e;
    public final GradientDrawable f22619e0;
    public final ImageView f22620f;
    public final GradientDrawable f22621f0;
    public final ArrayList f22622g0;
    public final LinearLayout h;
    public final ArrayList f22623h0;
    public final ArrayList f22624i0;
    public final ArrayList f22625j0;
    public final ArrayList f22626k0;
    public int f22627l0;
    public boolean m0;
    public final ImageView f22628n;
    public int f22629n0;
    public boolean f22630o0;
    public final ImageView f22631r;
    public final FrameLayout f22632s;
    public final FrameLayout f22633w;
    public final LinearLayout f22634x;
    public final zg f22635y;

    public y3(Context context, final l lVar) {
        super(context);
        int i7;
        int i10;
        this.L = Integer.MAX_VALUE;
        this.U = new ArrayList();
        this.V = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.W = arrayList;
        this.f22614b0 = -1;
        this.f22616c0 = 0;
        this.f22622g0 = new ArrayList();
        this.f22623h0 = new ArrayList();
        this.f22624i0 = new ArrayList();
        this.f22625j0 = new ArrayList();
        this.f22626k0 = new ArrayList();
        this.f22611a = lVar;
        i6 i6Var = lVar.f22285a.f37134a;
        this.f22613b = i6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.f22615c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i11 = n6.f29451d6;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{n6.w0(i11, i6Var), n6.r1(0.0f, n6.w0(i11, i6Var))});
        this.f22619e0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, na.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{n6.r1(0.0f, n6.w0(i11, i6Var)), n6.w0(i11, i6Var)});
        this.f22621f0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        addView(view2, na.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f22618e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, na.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f22620f = imageView;
        imageView.setImageResource(2131231243);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i12 = n6.Pl;
        int w02 = n6.w0(i12, i6Var);
        int w03 = n6.w0(i12, i6Var);
        int i13 = n6.f29543i6;
        org.telegram.ui.Cells.y b02 = n6.b0(w02, n6.w(w03, n6.w0(i13, i6Var)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        f(imageView, i12, b02);
        imageView.setBackground(new a2(b02));
        int i14 = n6.G6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        u6.s(imageView, i14, i6Var, mode);
        sa.a(imageView);
        imageView.setContentDescription(gd.N0(2131754878, null));
        imageView.setOnClickListener(new bi.o(lVar, 11));
        frameLayout.addView(imageView, na.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        ShapeDrawable d02 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i12, i6Var));
        f(linearLayout, i12, d02);
        linearLayout.setBackground(new a2(d02));
        frameLayout.addView(linearLayout, na.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.f22628n = imageView2;
        imageView2.setImageResource(2131231602);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y h02 = n6.h0(n6.w0(i13, i6Var), 1, -1);
        q6 M = u6.M(i13);
        imageView2.setBackground(h02);
        u6.j(imageView2, h02, null, M, i6Var);
        u6.s(imageView2, i14, i6Var, mode);
        sa.a(imageView2);
        imageView2.setContentDescription("Undo");
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f22285a;
                        pVar.f22367r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f22285a.f22367r.c4(view3);
                        return;
                    case 2:
                        lVar.f22285a.f22367r.d4();
                        return;
                    case 3:
                        lVar.f22285a.f22367r.a4();
                        return;
                    case 4:
                        lVar.f22285a.f22367r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f22285a;
                        k3 k22 = pVar2.f22367r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(pVar2.getContext(), pVar2.f37134a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new c7(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f22285a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f22285a.f22367r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f22285a.f22367r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f22285a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f22366n, context2, new c7(lVar2, 16), pVar3.f37134a).show();
                        return;
                    case 10:
                        p.Q(lVar.f22285a);
                        return;
                    default:
                        p pVar4 = lVar.f22285a;
                        pVar4.f22367r.f22488j4 = null;
                        p.T(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView2, na.r(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.f22631r = imageView3;
        imageView3.setImageResource(2131231585);
        imageView3.setScaleType(scaleType);
        org.telegram.ui.Cells.y h03 = n6.h0(n6.w0(i13, i6Var), 1, -1);
        q6 M2 = u6.M(i13);
        imageView3.setBackground(h03);
        u6.j(imageView3, h03, null, M2, i6Var);
        u6.s(imageView3, i14, i6Var, mode);
        sa.a(imageView3);
        imageView3.setContentDescription("Redo");
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f22285a;
                        pVar.f22367r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f22285a.f22367r.c4(view3);
                        return;
                    case 2:
                        lVar.f22285a.f22367r.d4();
                        return;
                    case 3:
                        lVar.f22285a.f22367r.a4();
                        return;
                    case 4:
                        lVar.f22285a.f22367r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f22285a;
                        k3 k22 = pVar2.f22367r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(pVar2.getContext(), pVar2.f37134a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new c7(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f22285a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f22285a.f22367r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f22285a.f22367r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f22285a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f22366n, context2, new c7(lVar2, 16), pVar3.f37134a).show();
                        return;
                    case 10:
                        p.Q(lVar.f22285a);
                        return;
                    default:
                        p pVar4 = lVar.f22285a;
                        pVar4.f22367r.f22488j4 = null;
                        p.T(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView3, na.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f22632s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, na.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f22633w = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, na.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f22634x = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout3.addView(linearLayout2, na.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.ActionBar.v2(context));
        imageView4.setScaleType(scaleType);
        u6.s(imageView4, i14, i6Var, mode);
        org.telegram.ui.Cells.y b03 = n6.b0(n6.w0(i12, i6Var), n6.w(n6.w0(i12, i6Var), n6.w0(i13, i6Var)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        f(imageView4, i12, b03);
        imageView4.setBackground(new a2(b03));
        linearLayout2.addView(imageView4, na.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        sa.a(imageView4);
        imageView4.setContentDescription("AI");
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f22285a;
                        pVar.f22367r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f22285a.f22367r.c4(view3);
                        return;
                    case 2:
                        lVar.f22285a.f22367r.d4();
                        return;
                    case 3:
                        lVar.f22285a.f22367r.a4();
                        return;
                    case 4:
                        lVar.f22285a.f22367r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f22285a;
                        k3 k22 = pVar2.f22367r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(pVar2.getContext(), pVar2.f37134a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new c7(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f22285a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f22285a.f22367r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f22285a.f22367r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f22285a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f22366n, context2, new c7(lVar2, 16), pVar3.f37134a).show();
                        return;
                    case 10:
                        p.Q(lVar.f22285a);
                        return;
                    default:
                        p pVar4 = lVar.f22285a;
                        pVar4.f22367r.f22488j4 = null;
                        p.T(pVar4, 90, 0);
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
        frameLayout5.setBackground(new a2(d03));
        frameLayout4.addView(frameLayout5, na.e(-2, 44, 81));
        u1 u1Var = new u1(context, 1);
        u1Var.setClipToOutline(true);
        u1Var.setOutlineProvider(new bg.q0(6));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        linearLayout3.setOrientation(0);
        u1Var.addView(linearLayout3);
        frameLayout5.addView(u1Var, na.c(-1.0f, -1));
        zg zgVar = new zg(context, 24);
        this.f22635y = zgVar;
        zgVar.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        u6.s(zgVar, i14, i6Var, mode);
        org.telegram.ui.Cells.y b04 = n6.b0(n6.w0(i11, i6Var), n6.w0(i13, i6Var), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        q6 M3 = u6.M(i11);
        q6 M4 = u6.M(i13);
        zgVar.setBackground(b04);
        u6.j(zgVar, b04, M3, M4, i6Var);
        zgVar.j(xg.f41996e, false);
        linearLayout3.addView(zgVar, na.r(38, 38, 16));
        sa.a(zgVar);
        zgVar.setContentDescription("Emoji");
        zgVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f22285a;
                        pVar.f22367r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f22285a.f22367r.c4(view3);
                        return;
                    case 2:
                        lVar.f22285a.f22367r.d4();
                        return;
                    case 3:
                        lVar.f22285a.f22367r.a4();
                        return;
                    case 4:
                        lVar.f22285a.f22367r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f22285a;
                        k3 k22 = pVar2.f22367r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(pVar2.getContext(), pVar2.f37134a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new c7(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f22285a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f22285a.f22367r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f22285a.f22367r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f22285a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f22366n, context2, new c7(lVar2, 16), pVar3.f37134a).show();
                        return;
                    case 10:
                        p.Q(lVar.f22285a);
                        return;
                    default:
                        p pVar4 = lVar.f22285a;
                        pVar4.f22367r.f22488j4 = null;
                        p.T(pVar4, 90, 0);
                        return;
                }
            }
        });
        a(2131231599, 1, false);
        a(2131231571, 2, true);
        a(2131231588, 4, true);
        a(2131231573, 7, true);
        ImageView imageView5 = new ImageView(context);
        this.F = imageView5;
        imageView5.setImageResource(2131232494);
        imageView5.setScaleType(scaleType);
        u6.s(imageView5, i14, i6Var, mode);
        org.telegram.ui.Cells.y b05 = n6.b0(n6.w0(i11, i6Var), n6.w0(i13, i6Var), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        q6 M5 = u6.M(i11);
        q6 M6 = u6.M(i13);
        imageView5.setBackground(b05);
        u6.j(imageView5, b05, M5, M6, i6Var);
        linearLayout3.addView(imageView5, na.t(38, 38, 16, 2, 0, 0, 0));
        sa.a(imageView5);
        imageView5.setContentDescription("Attach");
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f22285a;
                        pVar.f22367r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f22285a.f22367r.c4(view3);
                        return;
                    case 2:
                        lVar.f22285a.f22367r.d4();
                        return;
                    case 3:
                        lVar.f22285a.f22367r.a4();
                        return;
                    case 4:
                        lVar.f22285a.f22367r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f22285a;
                        k3 k22 = pVar2.f22367r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(pVar2.getContext(), pVar2.f37134a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new c7(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f22285a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f22285a.f22367r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f22285a.f22367r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f22285a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f22366n, context2, new c7(lVar2, 16), pVar3.f37134a).show();
                        return;
                    case 10:
                        p.Q(lVar.f22285a);
                        return;
                    default:
                        p pVar4 = lVar.f22285a;
                        pVar4.f22367r.f22488j4 = null;
                        p.T(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout2.addView(frameLayout4, na.l(1.0f, 0, 44));
        b61 b61Var = new b61(7, context, this);
        this.H = b61Var;
        b61Var.setOrientation(0);
        b61Var.setClipToPadding(false);
        b61Var.setClipChildren(false);
        b61Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(b61Var, na.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.I = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(frameLayout6, na.e(80, 60, 81));
        ?? imageView6 = new ImageView(context);
        this.J = imageView6;
        imageView6.f(2131624043, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), null);
        nh0 animatedDrawable = imageView6.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(n6.w0(i14, i6Var), mode));
        ShapeDrawable d04 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i12, i6Var));
        f(imageView6, i12, d04);
        imageView6.setBackground(new a2(d04));
        frameLayout6.addView((View) imageView6, na.e(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        ShapeDrawable d05 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i12, i6Var));
        f(frameLayout7, i12, d05);
        frameLayout7.setBackground(new a2(d05));
        b61Var.addView(frameLayout7, na.c(44.0f, -2));
        x3 x3Var = new x3(this, context, 0);
        x3Var.setHorizontalScrollBarEnabled(false);
        x3Var.setClipToOutline(true);
        x3Var.setOutlineProvider(new bg.q0(7));
        frameLayout7.addView(x3Var, na.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.K = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        x3Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(2131231202, 1, false);
        b(2131231204, 2, false);
        b(2131231210, 16, false);
        b(2131231209, 8, false);
        b(2131231208, 256, false);
        b(2131231555, 4, false);
        b(2131231586, 16384, true);
        b(2131231587, 32768, true);
        x1 x1Var = new x1(2131231584, context, i6Var);
        this.T = x1Var;
        x1Var.c(i12);
        x1Var.setContentDescription(gd.N0(2131746244, null));
        x1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f22285a;
                        pVar.f22367r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f22285a.f22367r.c4(view3);
                        return;
                    case 2:
                        lVar.f22285a.f22367r.d4();
                        return;
                    case 3:
                        lVar.f22285a.f22367r.a4();
                        return;
                    case 4:
                        lVar.f22285a.f22367r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f22285a;
                        k3 k22 = pVar2.f22367r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(pVar2.getContext(), pVar2.f37134a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new c7(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f22285a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f22285a.f22367r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f22285a.f22367r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f22285a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f22366n, context2, new c7(lVar2, 16), pVar3.f37134a).show();
                        return;
                    case 10:
                        p.Q(lVar.f22285a);
                        return;
                    default:
                        p pVar4 = lVar.f22285a;
                        pVar4.f22367r.f22488j4 = null;
                        p.T(pVar4, 90, 0);
                        return;
                }
            }
        });
        if (linearLayout4.getChildCount() == 0) {
            i7 = 0;
        } else {
            i7 = 2;
        }
        linearLayout4.addView(x1Var, na.t(38, 38, 16, i7, 0, 0, 0));
        x1 x1Var2 = new x1(2131231552, context, i6Var);
        this.Q = x1Var2;
        x1Var2.c(i12);
        x1Var2.setContentDescription(gd.N0(2131745815, null));
        x1Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f22285a;
                        pVar.f22367r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f22285a.f22367r.c4(view3);
                        return;
                    case 2:
                        lVar.f22285a.f22367r.d4();
                        return;
                    case 3:
                        lVar.f22285a.f22367r.a4();
                        return;
                    case 4:
                        lVar.f22285a.f22367r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f22285a;
                        k3 k22 = pVar2.f22367r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(pVar2.getContext(), pVar2.f37134a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new c7(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f22285a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f22285a.f22367r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f22285a.f22367r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f22285a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f22366n, context2, new c7(lVar2, 16), pVar3.f37134a).show();
                        return;
                    case 10:
                        p.Q(lVar.f22285a);
                        return;
                    default:
                        p pVar4 = lVar.f22285a;
                        pVar4.f22367r.f22488j4 = null;
                        p.T(pVar4, 90, 0);
                        return;
                }
            }
        });
        if (linearLayout4.getChildCount() == 0) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        linearLayout4.addView(x1Var2, na.t(38, 38, 16, i10, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.N = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        ShapeDrawable d06 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i12, i6Var));
        f(linearLayout5, i12, d06);
        linearLayout5.setBackground(new a2(d06));
        b61Var.addView(linearLayout5, na.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        x1 x1Var3 = new x1(2131231749, context, i6Var);
        this.P = x1Var3;
        x1Var3.c(i12);
        x1Var3.setContentDescription(gd.N0(2131751732, null));
        x1Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f22285a;
                        pVar.f22367r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f22285a.f22367r.c4(view3);
                        return;
                    case 2:
                        lVar.f22285a.f22367r.d4();
                        return;
                    case 3:
                        lVar.f22285a.f22367r.a4();
                        return;
                    case 4:
                        lVar.f22285a.f22367r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f22285a;
                        k3 k22 = pVar2.f22367r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(pVar2.getContext(), pVar2.f37134a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new c7(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f22285a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f22285a.f22367r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f22285a.f22367r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f22285a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f22366n, context2, new c7(lVar2, 16), pVar3.f37134a).show();
                        return;
                    case 10:
                        p.Q(lVar.f22285a);
                        return;
                    default:
                        p pVar4 = lVar.f22285a;
                        pVar4.f22367r.f22488j4 = null;
                        p.T(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(x1Var3, na.r(38, 38, 16));
        x1 x1Var4 = new x1(2131232082, context, i6Var);
        this.R = x1Var4;
        x1Var4.c(i12);
        x1Var4.setContentDescription(gd.N0(2131754861, null));
        x1Var4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f22285a;
                        pVar.f22367r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f22285a.f22367r.c4(view3);
                        return;
                    case 2:
                        lVar.f22285a.f22367r.d4();
                        return;
                    case 3:
                        lVar.f22285a.f22367r.a4();
                        return;
                    case 4:
                        lVar.f22285a.f22367r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f22285a;
                        k3 k22 = pVar2.f22367r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(pVar2.getContext(), pVar2.f37134a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new c7(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f22285a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f22285a.f22367r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f22285a.f22367r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f22285a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f22366n, context2, new c7(lVar2, 16), pVar3.f37134a).show();
                        return;
                    case 10:
                        p.Q(lVar.f22285a);
                        return;
                    default:
                        p pVar4 = lVar.f22285a;
                        pVar4.f22367r.f22488j4 = null;
                        p.T(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(x1Var4, na.r(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.O = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        ShapeDrawable d07 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i12, i6Var));
        f(linearLayout6, i12, d07);
        linearLayout6.setBackground(new a2(d07));
        b61Var.addView(linearLayout6, na.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        x1 x1Var5 = new x1(2131231573, context, i6Var);
        this.S = x1Var5;
        x1Var5.c(i12);
        x1Var5.d();
        arrayList.add(x1Var5);
        x1Var5.setContentDescription(gd.N0(2131754863, null));
        x1Var5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f22285a;
                        pVar.f22367r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f22285a.f22367r.c4(view3);
                        return;
                    case 2:
                        lVar.f22285a.f22367r.d4();
                        return;
                    case 3:
                        lVar.f22285a.f22367r.a4();
                        return;
                    case 4:
                        lVar.f22285a.f22367r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f22285a;
                        k3 k22 = pVar2.f22367r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(pVar2.getContext(), pVar2.f37134a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new c7(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f22285a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f22285a.f22367r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f22285a.f22367r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f22285a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f22366n, context2, new c7(lVar2, 16), pVar3.f37134a).show();
                        return;
                    case 10:
                        p.Q(lVar.f22285a);
                        return;
                    default:
                        p pVar4 = lVar.f22285a;
                        pVar4.f22367r.f22488j4 = null;
                        p.T(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout6.addView(x1Var5, na.r(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.M = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        ShapeDrawable d08 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i12, i6Var));
        f(linearLayout7, i12, d08);
        linearLayout7.setBackground(new a2(d08));
        b61Var.addView(linearLayout7, 0, na.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        x1 x1Var6 = new x1(2131231496, context, i6Var);
        x1Var6.setImageDrawable(new org.telegram.ui.ActionBar.v2(context));
        x1Var6.c(i12);
        x1Var6.setContentDescription(gd.N0(2131755006, null));
        x1Var6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f22285a;
                        pVar.f22367r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f22285a.f22367r.c4(view3);
                        return;
                    case 2:
                        lVar.f22285a.f22367r.d4();
                        return;
                    case 3:
                        lVar.f22285a.f22367r.a4();
                        return;
                    case 4:
                        lVar.f22285a.f22367r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f22285a;
                        k3 k22 = pVar2.f22367r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(pVar2.getContext(), pVar2.f37134a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new c7(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f22285a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f22285a.f22367r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f22285a.f22367r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f22285a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f22366n, context2, new c7(lVar2, 16), pVar3.f37134a).show();
                        return;
                    case 10:
                        p.Q(lVar.f22285a);
                        return;
                    default:
                        p pVar4 = lVar.f22285a;
                        pVar4.f22367r.f22488j4 = null;
                        p.T(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout7.addView(x1Var6, na.r(38, 38, 16));
        w1 w1Var = new w1(this, context, i6Var);
        this.G = w1Var;
        int i15 = n6.Pe;
        ShapeDrawable d09 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i15, i6Var));
        f(w1Var, i15, d09);
        w1Var.setBackground(new a2(d09));
        sa.a(w1Var);
        linearLayout2.addView(w1Var, na.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        w1Var.setContentDescription("Send");
        w1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f22285a;
                        pVar.f22367r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f22285a.f22367r.c4(view3);
                        return;
                    case 2:
                        lVar.f22285a.f22367r.d4();
                        return;
                    case 3:
                        lVar.f22285a.f22367r.a4();
                        return;
                    case 4:
                        lVar.f22285a.f22367r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f22285a;
                        k3 k22 = pVar2.f22367r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(pVar2.getContext(), pVar2.f37134a);
                                m0Var.w1(a10);
                                m0Var.f37286g2 = new c7(k22, 15);
                                m0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f22285a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        g2 g2Var = lVar.f22285a.f22367r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = lVar.f22285a.f22367r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f22285a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f22366n, context2, new c7(lVar2, 16), pVar3.f37134a).show();
                        return;
                    case 10:
                        p.Q(lVar.f22285a);
                        return;
                    default:
                        p pVar4 = lVar.f22285a;
                        pVar4.f22367r.f22488j4 = null;
                        p.T(pVar4, 90, 0);
                        return;
                }
            }
        });
        w1Var.setOnLongClickListener(new hi.y4(lVar, 5));
        g(0, false);
    }

    public final void a(int i7, int i10, boolean z10) {
        int i11;
        LinearLayout linearLayout = this.E;
        x1 x1Var = new x1(i7, linearLayout.getContext(), this.f22613b);
        x1Var.c(n6.f29451d6);
        if (z10) {
            x1Var.d();
            this.W.add(x1Var);
        }
        x1Var.setTag(Integer.valueOf(i10));
        x1Var.setContentDescription(b2.l0(i10));
        x1Var.setOnClickListener(new w3(this, i10, 1));
        this.U.add(x1Var);
        if (linearLayout.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout.addView(x1Var, na.t(38, 38, 16, i11, 0, 0, 0));
    }

    public final void b(int i7, int i10, boolean z10) {
        int i11;
        x1 x1Var = new x1(i7, getContext(), this.f22613b);
        x1Var.c(n6.Pl);
        if (z10) {
            x1Var.d();
            this.W.add(x1Var);
        }
        x1Var.setTag(Integer.valueOf(i10));
        x1Var.setContentDescription(b2.n0(i10));
        x1Var.setOnClickListener(new w3(this, i10, 0));
        this.V.add(x1Var);
        LinearLayout linearLayout = this.K;
        if (linearLayout.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout.addView(x1Var, na.t(38, 38, 16, i11, 0, 0, 0));
    }

    public final void c(int i7, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            x1 x1Var = (x1) obj;
            int intValue = ((Integer) x1Var.getTag()).intValue();
            if ((i7 & intValue) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            x1Var.setSelected(z15);
            if (intValue == 1 || intValue == 2) {
                x1Var.setEnabled(z14);
            }
        }
        x1 x1Var2 = this.P;
        x1Var2.setSelected(z10);
        x1 x1Var3 = this.R;
        x1Var3.setSelected(z11);
        x1Var2.setEnabled(z12);
        this.Q.setEnabled(z13);
        x1Var3.setEnabled(z12);
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
            x1 x1Var = (x1) obj;
            if (i7 == ((Integer) x1Var.getTag()).intValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            x1Var.setSelected(z10);
            if (z10 && i10 != 0) {
                x1Var.e(i10);
            } else {
                x1Var.a();
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        float f10;
        int i7;
        if (this.f22617d0 != z10 || !z11) {
            this.f22617d0 = z10;
            if (z10) {
                f10 = 1.15f;
            } else {
                f10 = 1.0f;
            }
            qh0 qh0Var = this.J;
            if (z11) {
                qh0Var.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(kr.h).start();
            } else {
                qh0Var.animate().cancel();
                qh0Var.setScaleX(f10);
                qh0Var.setScaleY(f10);
            }
            if (z10) {
                i7 = n6.f29692q7;
            } else {
                i7 = n6.G6;
            }
            qh0Var.setColorFilter(new PorterDuffColorFilter(n6.w0(i7, this.f22613b), PorterDuff.Mode.SRC_IN));
            nh0 animatedDrawable = qh0Var.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f37801b0 > 34) {
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
        this.f22622g0.add(view);
        this.f22623h0.add(drawable);
        this.f22624i0.add(Integer.valueOf(i7));
        i6 i6Var = this.f22613b;
        this.f22625j0.add(Integer.valueOf(n6.w0(i7, i6Var)));
        if (drawable instanceof RippleDrawable) {
            i10 = n6.w(n6.w0(i7, i6Var), n6.w0(n6.f29543i6, i6Var));
        } else {
            i10 = 0;
        }
        this.f22626k0.add(Integer.valueOf(i10));
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
        if (this.f22614b0 == i7) {
            return;
        }
        this.f22614b0 = i7;
        FrameLayout frameLayout = this.I;
        int i12 = 0;
        b61 b61Var = this.H;
        LinearLayout linearLayout = this.f22634x;
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
            kr krVar = kr.h;
            duration.setInterpolator(krVar).withEndAction(new Runnable(this) {
                public final y3 f22547b;

                {
                    this.f22547b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            y3 y3Var = this.f22547b;
                            if (y3Var.f22614b0 != 0) {
                                y3Var.f22634x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            y3 y3Var2 = this.f22547b;
                            if (y3Var2.f22614b0 != 1) {
                                y3Var2.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            y3 y3Var3 = this.f22547b;
                            if (y3Var3.f22614b0 != 2) {
                                y3Var3.I.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            b61Var.setVisibility(0);
            ViewPropertyAnimator animate2 = b61Var.animate();
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
            scaleY2.translationY(L4).setDuration(420L).setInterpolator(krVar).withEndAction(new Runnable(this) {
                public final y3 f22547b;

                {
                    this.f22547b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            y3 y3Var = this.f22547b;
                            if (y3Var.f22614b0 != 0) {
                                y3Var.f22634x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            y3 y3Var2 = this.f22547b;
                            if (y3Var2.f22614b0 != 1) {
                                y3Var2.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            y3 y3Var3 = this.f22547b;
                            if (y3Var3.f22614b0 != 2) {
                                y3Var3.I.setVisibility(8);
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
            scaleX3.scaleY(f25).setDuration(420L).setInterpolator(krVar).withEndAction(new Runnable(this) {
                public final y3 f22547b;

                {
                    this.f22547b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            y3 y3Var = this.f22547b;
                            if (y3Var.f22614b0 != 0) {
                                y3Var.f22634x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            y3 y3Var2 = this.f22547b;
                            if (y3Var2.f22614b0 != 1) {
                                y3Var2.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            y3 y3Var3 = this.f22547b;
                            if (y3Var3.f22614b0 != 2) {
                                y3Var3.I.setVisibility(8);
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
        b61Var.setVisibility(i11);
        if (i7 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        b61Var.setAlpha(f13);
        if (i7 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        b61Var.setScaleX(f14);
        if (i7 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        b61Var.setScaleY(f15);
        if (i7 == 1) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.g0.L(30.0f);
        }
        b61Var.setTranslationY(L2);
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
        return this.f22632s;
    }

    public FrameLayout getBottomInnerContainer() {
        return this.f22633w;
    }

    public LinearLayout getBottomPanel() {
        return this.f22634x;
    }

    public View getEmojiButton() {
        return this.f22635y;
    }

    public tg getSendButton() {
        return this.G;
    }

    public void setBackVisible(boolean z10) {
        int i7;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f22620f.setVisibility(i7);
    }

    public void setBottomGradientTranslationY(float f10) {
        this.d.setTranslationY(f10);
    }

    public void setEmojiOpened(boolean z10) {
        xg xgVar;
        String str;
        if (z10) {
            xgVar = xg.d;
        } else {
            xgVar = xg.f41996e;
        }
        zg zgVar = this.f22635y;
        zgVar.j(xgVar, true);
        if (z10) {
            str = "Keyboard";
        } else {
            str = "Emoji";
        }
        zgVar.setContentDescription(str);
    }

    public void setPremiumLocked(boolean z10) {
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((x1) obj).setPremiumLocked(z10);
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
            i7 = 2131231505;
        } else {
            i7 = 2131232699;
        }
        this.G.setResourceId(i7);
    }

    public void setSendEnabled(boolean z10) {
        float f10;
        w1 w1Var = this.G;
        if (w1Var.isEnabled() == z10) {
            return;
        }
        w1Var.setEnabled(z10);
        ViewPropertyAnimator animate = w1Var.animate();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        m10.n(animate, f10, 150L);
    }

    public void setSendLoading(boolean z10) {
        if (this.f22612a0 == z10) {
            return;
        }
        this.f22612a0 = z10;
        this.G.invalidate();
    }

    public void setTopButtonsOffset(int i7) {
        LinearLayout linearLayout = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.topMargin != i7) {
            layoutParams.topMargin = i7;
            linearLayout.setLayoutParams(layoutParams);
        }
        ImageView imageView = this.f22620f;
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
        this.f22615c.setVisibility(i7);
    }

    public void setTopPanelVisible(boolean z10) {
        int i7;
        int i10 = 8;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f22618e.setVisibility(i7);
        if (z10) {
            i10 = 0;
        }
        this.f22615c.setVisibility(i10);
    }

    @Override
    public final void updateColors() {
        throw new UnsupportedOperationException("Method not decompiled: oi.y3.updateColors():void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
