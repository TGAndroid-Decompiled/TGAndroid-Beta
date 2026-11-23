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
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.ug;
import org.telegram.ui.Components.yg;
import org.telegram.ui.d61;
public final class x3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final LinearLayout E;
    public final ImageView F;
    public final v1 G;
    public final d61 H;
    public final FrameLayout I;
    public final rh0 J;
    public final LinearLayout K;
    public int L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final LinearLayout O;
    public final w1 P;
    public final w1 Q;
    public final w1 R;
    public final w1 S;
    public final w1 T;
    public final ArrayList U;
    public final ArrayList V;
    public final ArrayList W;
    public final k f22481a;
    public boolean f22482a0;
    public final h6 f22483b;
    public int f22484b0;
    public final View f22485c;
    public int f22486c0;
    public final View d;
    public boolean f22487d0;
    public final FrameLayout f22488e;
    public final GradientDrawable f22489e0;
    public final ImageView f22490f;
    public final GradientDrawable f22491f0;
    public final ArrayList f22492g0;
    public final LinearLayout h;
    public final ArrayList f22493h0;
    public final ArrayList f22494i0;
    public final ArrayList f22495j0;
    public final ArrayList f22496k0;
    public int f22497l0;
    public boolean m0;
    public final ImageView f22498n;
    public int f22499n0;
    public boolean f22500o0;
    public final ImageView f22501r;
    public final FrameLayout f22502s;
    public final FrameLayout f22503w;
    public final LinearLayout f22504x;
    public final ah f22505y;

    public x3(Context context, final k kVar) {
        super(context);
        int i7;
        int i10;
        this.L = Integer.MAX_VALUE;
        this.U = new ArrayList();
        this.V = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.W = arrayList;
        this.f22484b0 = -1;
        this.f22486c0 = 0;
        this.f22492g0 = new ArrayList();
        this.f22493h0 = new ArrayList();
        this.f22494i0 = new ArrayList();
        this.f22495j0 = new ArrayList();
        this.f22496k0 = new ArrayList();
        this.f22481a = kVar;
        h6 h6Var = kVar.f22155a.f37476a;
        this.f22483b = h6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.f22485c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i11 = m6.f29347d6;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{m6.w0(i11, h6Var), m6.r1(0.0f, m6.w0(i11, h6Var))});
        this.f22489e0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, na.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{m6.r1(0.0f, m6.w0(i11, h6Var)), m6.w0(i11, h6Var)});
        this.f22491f0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        addView(view2, na.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f22488e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, na.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f22490f = imageView;
        imageView.setImageResource(2131231240);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i12 = m6.Pl;
        int w02 = m6.w0(i12, h6Var);
        int w03 = m6.w0(i12, h6Var);
        int i13 = m6.f29439i6;
        org.telegram.ui.Cells.y b02 = m6.b0(w02, m6.w(w03, m6.w0(i13, h6Var)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        f(imageView, i12, b02);
        imageView.setBackground(new z1(b02));
        int i14 = m6.G6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        t6.s(imageView, i14, h6Var, mode);
        sa.a(imageView);
        imageView.setContentDescription(hd.N0(2131754878, null));
        imageView.setOnClickListener(new bi.o(kVar, 11));
        frameLayout.addView(imageView, na.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        ShapeDrawable d02 = m6.d0(org.telegram.messenger.g0.L(22.0f), m6.w0(i12, h6Var));
        f(linearLayout, i12, d02);
        linearLayout.setBackground(new z1(d02));
        frameLayout.addView(linearLayout, na.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.f22498n = imageView2;
        imageView2.setImageResource(2131231599);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y h02 = m6.h0(m6.w0(i13, h6Var), 1, -1);
        p6 M = t6.M(i13);
        imageView2.setBackground(h02);
        t6.j(imageView2, h02, null, M, h6Var);
        t6.s(imageView2, i14, h6Var, mode);
        sa.a(imageView2);
        imageView2.setContentDescription("Undo");
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22155a;
                        oVar.f22237r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22155a.f22237r.c4(view3);
                        return;
                    case 2:
                        kVar.f22155a.f22237r.d4();
                        return;
                    case 3:
                        kVar.f22155a.f22237r.a4();
                        return;
                    case 4:
                        kVar.f22155a.f22237r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22155a;
                        j3 k22 = oVar2.f22237r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.n0 n0Var = new org.telegram.ui.Components.n0(oVar2.getContext(), oVar2.f37476a);
                                n0Var.w1(a10);
                                n0Var.f37642g2 = new hi.t6(k22, 15);
                                n0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22155a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22155a.f22237r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22155a.f22237r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22155a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22236n, context2, new hi.t6(kVar2, 16), oVar3.f37476a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22155a);
                        return;
                    default:
                        o oVar4 = kVar.f22155a;
                        oVar4.f22237r.f22358j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView2, na.r(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.f22501r = imageView3;
        imageView3.setImageResource(2131231582);
        imageView3.setScaleType(scaleType);
        org.telegram.ui.Cells.y h03 = m6.h0(m6.w0(i13, h6Var), 1, -1);
        p6 M2 = t6.M(i13);
        imageView3.setBackground(h03);
        t6.j(imageView3, h03, null, M2, h6Var);
        t6.s(imageView3, i14, h6Var, mode);
        sa.a(imageView3);
        imageView3.setContentDescription("Redo");
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22155a;
                        oVar.f22237r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22155a.f22237r.c4(view3);
                        return;
                    case 2:
                        kVar.f22155a.f22237r.d4();
                        return;
                    case 3:
                        kVar.f22155a.f22237r.a4();
                        return;
                    case 4:
                        kVar.f22155a.f22237r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22155a;
                        j3 k22 = oVar2.f22237r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.n0 n0Var = new org.telegram.ui.Components.n0(oVar2.getContext(), oVar2.f37476a);
                                n0Var.w1(a10);
                                n0Var.f37642g2 = new hi.t6(k22, 15);
                                n0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22155a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22155a.f22237r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22155a.f22237r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22155a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22236n, context2, new hi.t6(kVar2, 16), oVar3.f37476a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22155a);
                        return;
                    default:
                        o oVar4 = kVar.f22155a;
                        oVar4.f22237r.f22358j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView3, na.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f22502s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, na.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f22503w = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, na.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f22504x = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout3.addView(linearLayout2, na.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.ActionBar.v2(context));
        imageView4.setScaleType(scaleType);
        t6.s(imageView4, i14, h6Var, mode);
        org.telegram.ui.Cells.y b03 = m6.b0(m6.w0(i12, h6Var), m6.w(m6.w0(i12, h6Var), m6.w0(i13, h6Var)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        f(imageView4, i12, b03);
        imageView4.setBackground(new z1(b03));
        linearLayout2.addView(imageView4, na.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        sa.a(imageView4);
        imageView4.setContentDescription("AI");
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22155a;
                        oVar.f22237r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22155a.f22237r.c4(view3);
                        return;
                    case 2:
                        kVar.f22155a.f22237r.d4();
                        return;
                    case 3:
                        kVar.f22155a.f22237r.a4();
                        return;
                    case 4:
                        kVar.f22155a.f22237r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22155a;
                        j3 k22 = oVar2.f22237r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.n0 n0Var = new org.telegram.ui.Components.n0(oVar2.getContext(), oVar2.f37476a);
                                n0Var.w1(a10);
                                n0Var.f37642g2 = new hi.t6(k22, 15);
                                n0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22155a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22155a.f22237r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22155a.f22237r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22155a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22236n, context2, new hi.t6(kVar2, 16), oVar3.f37476a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22155a);
                        return;
                    default:
                        o oVar4 = kVar.f22155a;
                        oVar4.f22237r.f22358j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        ShapeDrawable d03 = m6.d0(org.telegram.messenger.g0.L(22.0f), m6.w0(i11, h6Var));
        f(frameLayout5, i11, d03);
        frameLayout5.setBackground(new z1(d03));
        frameLayout4.addView(frameLayout5, na.e(-2, 44, 81));
        t1 t1Var = new t1(context, 1);
        t1Var.setClipToOutline(true);
        t1Var.setOutlineProvider(new bg.q0(6));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        linearLayout3.setOrientation(0);
        t1Var.addView(linearLayout3);
        frameLayout5.addView(t1Var, na.c(-1.0f, -1));
        ah ahVar = new ah(context, 24);
        this.f22505y = ahVar;
        ahVar.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        t6.s(ahVar, i14, h6Var, mode);
        org.telegram.ui.Cells.y b04 = m6.b0(m6.w0(i11, h6Var), m6.w0(i13, h6Var), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        p6 M3 = t6.M(i11);
        p6 M4 = t6.M(i13);
        ahVar.setBackground(b04);
        t6.j(ahVar, b04, M3, M4, h6Var);
        ahVar.j(yg.f42410e, false);
        linearLayout3.addView(ahVar, na.r(38, 38, 16));
        sa.a(ahVar);
        ahVar.setContentDescription("Emoji");
        ahVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22155a;
                        oVar.f22237r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22155a.f22237r.c4(view3);
                        return;
                    case 2:
                        kVar.f22155a.f22237r.d4();
                        return;
                    case 3:
                        kVar.f22155a.f22237r.a4();
                        return;
                    case 4:
                        kVar.f22155a.f22237r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22155a;
                        j3 k22 = oVar2.f22237r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.n0 n0Var = new org.telegram.ui.Components.n0(oVar2.getContext(), oVar2.f37476a);
                                n0Var.w1(a10);
                                n0Var.f37642g2 = new hi.t6(k22, 15);
                                n0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22155a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22155a.f22237r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22155a.f22237r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22155a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22236n, context2, new hi.t6(kVar2, 16), oVar3.f37476a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22155a);
                        return;
                    default:
                        o oVar4 = kVar.f22155a;
                        oVar4.f22237r.f22358j4 = null;
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
        t6.s(imageView5, i14, h6Var, mode);
        org.telegram.ui.Cells.y b05 = m6.b0(m6.w0(i11, h6Var), m6.w0(i13, h6Var), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        p6 M5 = t6.M(i11);
        p6 M6 = t6.M(i13);
        imageView5.setBackground(b05);
        t6.j(imageView5, b05, M5, M6, h6Var);
        linearLayout3.addView(imageView5, na.t(38, 38, 16, 2, 0, 0, 0));
        sa.a(imageView5);
        imageView5.setContentDescription("Attach");
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22155a;
                        oVar.f22237r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22155a.f22237r.c4(view3);
                        return;
                    case 2:
                        kVar.f22155a.f22237r.d4();
                        return;
                    case 3:
                        kVar.f22155a.f22237r.a4();
                        return;
                    case 4:
                        kVar.f22155a.f22237r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22155a;
                        j3 k22 = oVar2.f22237r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.n0 n0Var = new org.telegram.ui.Components.n0(oVar2.getContext(), oVar2.f37476a);
                                n0Var.w1(a10);
                                n0Var.f37642g2 = new hi.t6(k22, 15);
                                n0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22155a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22155a.f22237r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22155a.f22237r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22155a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22236n, context2, new hi.t6(kVar2, 16), oVar3.f37476a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22155a);
                        return;
                    default:
                        o oVar4 = kVar.f22155a;
                        oVar4.f22237r.f22358j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout2.addView(frameLayout4, na.l(1.0f, 0, 44));
        d61 d61Var = new d61(7, context, this);
        this.H = d61Var;
        d61Var.setOrientation(0);
        d61Var.setClipToPadding(false);
        d61Var.setClipChildren(false);
        d61Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(d61Var, na.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.I = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(frameLayout6, na.e(80, 60, 81));
        ?? imageView6 = new ImageView(context);
        this.J = imageView6;
        imageView6.f(2131624043, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), null);
        oh0 animatedDrawable = imageView6.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(m6.w0(i14, h6Var), mode));
        ShapeDrawable d04 = m6.d0(org.telegram.messenger.g0.L(22.0f), m6.w0(i12, h6Var));
        f(imageView6, i12, d04);
        imageView6.setBackground(new z1(d04));
        frameLayout6.addView((View) imageView6, na.e(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        ShapeDrawable d05 = m6.d0(org.telegram.messenger.g0.L(22.0f), m6.w0(i12, h6Var));
        f(frameLayout7, i12, d05);
        frameLayout7.setBackground(new z1(d05));
        d61Var.addView(frameLayout7, na.c(44.0f, -2));
        w3 w3Var = new w3(this, context, 0);
        w3Var.setHorizontalScrollBarEnabled(false);
        w3Var.setClipToOutline(true);
        w3Var.setOutlineProvider(new bg.q0(7));
        frameLayout7.addView(w3Var, na.c(-1.0f, -1));
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
        w1 w1Var = new w1(2131231581, context, h6Var);
        this.T = w1Var;
        w1Var.c(i12);
        w1Var.setContentDescription(hd.N0(2131746244, null));
        w1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22155a;
                        oVar.f22237r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22155a.f22237r.c4(view3);
                        return;
                    case 2:
                        kVar.f22155a.f22237r.d4();
                        return;
                    case 3:
                        kVar.f22155a.f22237r.a4();
                        return;
                    case 4:
                        kVar.f22155a.f22237r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22155a;
                        j3 k22 = oVar2.f22237r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.n0 n0Var = new org.telegram.ui.Components.n0(oVar2.getContext(), oVar2.f37476a);
                                n0Var.w1(a10);
                                n0Var.f37642g2 = new hi.t6(k22, 15);
                                n0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22155a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22155a.f22237r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22155a.f22237r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22155a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22236n, context2, new hi.t6(kVar2, 16), oVar3.f37476a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22155a);
                        return;
                    default:
                        o oVar4 = kVar.f22155a;
                        oVar4.f22237r.f22358j4 = null;
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
        linearLayout4.addView(w1Var, na.t(38, 38, 16, i7, 0, 0, 0));
        w1 w1Var2 = new w1(2131231549, context, h6Var);
        this.Q = w1Var2;
        w1Var2.c(i12);
        w1Var2.setContentDescription(hd.N0(2131745815, null));
        w1Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22155a;
                        oVar.f22237r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22155a.f22237r.c4(view3);
                        return;
                    case 2:
                        kVar.f22155a.f22237r.d4();
                        return;
                    case 3:
                        kVar.f22155a.f22237r.a4();
                        return;
                    case 4:
                        kVar.f22155a.f22237r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22155a;
                        j3 k22 = oVar2.f22237r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.n0 n0Var = new org.telegram.ui.Components.n0(oVar2.getContext(), oVar2.f37476a);
                                n0Var.w1(a10);
                                n0Var.f37642g2 = new hi.t6(k22, 15);
                                n0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22155a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22155a.f22237r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22155a.f22237r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22155a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22236n, context2, new hi.t6(kVar2, 16), oVar3.f37476a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22155a);
                        return;
                    default:
                        o oVar4 = kVar.f22155a;
                        oVar4.f22237r.f22358j4 = null;
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
        linearLayout4.addView(w1Var2, na.t(38, 38, 16, i10, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.N = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        ShapeDrawable d06 = m6.d0(org.telegram.messenger.g0.L(22.0f), m6.w0(i12, h6Var));
        f(linearLayout5, i12, d06);
        linearLayout5.setBackground(new z1(d06));
        d61Var.addView(linearLayout5, na.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        w1 w1Var3 = new w1(2131231746, context, h6Var);
        this.P = w1Var3;
        w1Var3.c(i12);
        w1Var3.setContentDescription(hd.N0(2131751732, null));
        w1Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22155a;
                        oVar.f22237r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22155a.f22237r.c4(view3);
                        return;
                    case 2:
                        kVar.f22155a.f22237r.d4();
                        return;
                    case 3:
                        kVar.f22155a.f22237r.a4();
                        return;
                    case 4:
                        kVar.f22155a.f22237r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22155a;
                        j3 k22 = oVar2.f22237r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.n0 n0Var = new org.telegram.ui.Components.n0(oVar2.getContext(), oVar2.f37476a);
                                n0Var.w1(a10);
                                n0Var.f37642g2 = new hi.t6(k22, 15);
                                n0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22155a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22155a.f22237r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22155a.f22237r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22155a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22236n, context2, new hi.t6(kVar2, 16), oVar3.f37476a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22155a);
                        return;
                    default:
                        o oVar4 = kVar.f22155a;
                        oVar4.f22237r.f22358j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(w1Var3, na.r(38, 38, 16));
        w1 w1Var4 = new w1(2131232079, context, h6Var);
        this.R = w1Var4;
        w1Var4.c(i12);
        w1Var4.setContentDescription(hd.N0(2131754861, null));
        w1Var4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22155a;
                        oVar.f22237r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22155a.f22237r.c4(view3);
                        return;
                    case 2:
                        kVar.f22155a.f22237r.d4();
                        return;
                    case 3:
                        kVar.f22155a.f22237r.a4();
                        return;
                    case 4:
                        kVar.f22155a.f22237r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22155a;
                        j3 k22 = oVar2.f22237r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.n0 n0Var = new org.telegram.ui.Components.n0(oVar2.getContext(), oVar2.f37476a);
                                n0Var.w1(a10);
                                n0Var.f37642g2 = new hi.t6(k22, 15);
                                n0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22155a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22155a.f22237r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22155a.f22237r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22155a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22236n, context2, new hi.t6(kVar2, 16), oVar3.f37476a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22155a);
                        return;
                    default:
                        o oVar4 = kVar.f22155a;
                        oVar4.f22237r.f22358j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(w1Var4, na.r(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.O = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        ShapeDrawable d07 = m6.d0(org.telegram.messenger.g0.L(22.0f), m6.w0(i12, h6Var));
        f(linearLayout6, i12, d07);
        linearLayout6.setBackground(new z1(d07));
        d61Var.addView(linearLayout6, na.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        w1 w1Var5 = new w1(2131231570, context, h6Var);
        this.S = w1Var5;
        w1Var5.c(i12);
        w1Var5.d();
        arrayList.add(w1Var5);
        w1Var5.setContentDescription(hd.N0(2131754863, null));
        w1Var5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22155a;
                        oVar.f22237r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22155a.f22237r.c4(view3);
                        return;
                    case 2:
                        kVar.f22155a.f22237r.d4();
                        return;
                    case 3:
                        kVar.f22155a.f22237r.a4();
                        return;
                    case 4:
                        kVar.f22155a.f22237r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22155a;
                        j3 k22 = oVar2.f22237r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.n0 n0Var = new org.telegram.ui.Components.n0(oVar2.getContext(), oVar2.f37476a);
                                n0Var.w1(a10);
                                n0Var.f37642g2 = new hi.t6(k22, 15);
                                n0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22155a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22155a.f22237r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22155a.f22237r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22155a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22236n, context2, new hi.t6(kVar2, 16), oVar3.f37476a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22155a);
                        return;
                    default:
                        o oVar4 = kVar.f22155a;
                        oVar4.f22237r.f22358j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout6.addView(w1Var5, na.r(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.M = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        ShapeDrawable d08 = m6.d0(org.telegram.messenger.g0.L(22.0f), m6.w0(i12, h6Var));
        f(linearLayout7, i12, d08);
        linearLayout7.setBackground(new z1(d08));
        d61Var.addView(linearLayout7, 0, na.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        w1 w1Var6 = new w1(2131231493, context, h6Var);
        w1Var6.setImageDrawable(new org.telegram.ui.ActionBar.v2(context));
        w1Var6.c(i12);
        w1Var6.setContentDescription(hd.N0(2131755006, null));
        w1Var6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22155a;
                        oVar.f22237r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22155a.f22237r.c4(view3);
                        return;
                    case 2:
                        kVar.f22155a.f22237r.d4();
                        return;
                    case 3:
                        kVar.f22155a.f22237r.a4();
                        return;
                    case 4:
                        kVar.f22155a.f22237r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22155a;
                        j3 k22 = oVar2.f22237r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.n0 n0Var = new org.telegram.ui.Components.n0(oVar2.getContext(), oVar2.f37476a);
                                n0Var.w1(a10);
                                n0Var.f37642g2 = new hi.t6(k22, 15);
                                n0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22155a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22155a.f22237r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22155a.f22237r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22155a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22236n, context2, new hi.t6(kVar2, 16), oVar3.f37476a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22155a);
                        return;
                    default:
                        o oVar4 = kVar.f22155a;
                        oVar4.f22237r.f22358j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout7.addView(w1Var6, na.r(38, 38, 16));
        v1 v1Var = new v1(this, context, h6Var);
        this.G = v1Var;
        int i15 = m6.Pe;
        ShapeDrawable d09 = m6.d0(org.telegram.messenger.g0.L(22.0f), m6.w0(i15, h6Var));
        f(v1Var, i15, d09);
        v1Var.setBackground(new z1(d09));
        sa.a(v1Var);
        linearLayout2.addView(v1Var, na.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        v1Var.setContentDescription("Send");
        v1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f22155a;
                        oVar.f22237r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f22155a.f22237r.c4(view3);
                        return;
                    case 2:
                        kVar.f22155a.f22237r.d4();
                        return;
                    case 3:
                        kVar.f22155a.f22237r.a4();
                        return;
                    case 4:
                        kVar.f22155a.f22237r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f22155a;
                        j3 k22 = oVar2.f22237r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.n0 n0Var = new org.telegram.ui.Components.n0(oVar2.getContext(), oVar2.f37476a);
                                n0Var.w1(a10);
                                n0Var.f37642g2 = new hi.t6(k22, 15);
                                n0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f22155a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        e2 e2Var = kVar.f22155a.f22237r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        e2 e2Var2 = kVar.f22155a.f22237r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f22155a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f22236n, context2, new hi.t6(kVar2, 16), oVar3.f37476a).show();
                        return;
                    case 10:
                        o.Q(kVar.f22155a);
                        return;
                    default:
                        o oVar4 = kVar.f22155a;
                        oVar4.f22237r.f22358j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        v1Var.setOnLongClickListener(new hi.o4(kVar, 5));
        g(0, false);
    }

    public final void a(int i7, int i10, boolean z10) {
        int i11;
        LinearLayout linearLayout = this.E;
        w1 w1Var = new w1(i7, linearLayout.getContext(), this.f22483b);
        w1Var.c(m6.f29347d6);
        if (z10) {
            w1Var.d();
            this.W.add(w1Var);
        }
        w1Var.setTag(Integer.valueOf(i10));
        w1Var.setContentDescription(a2.l0(i10));
        w1Var.setOnClickListener(new v3(this, i10, 1));
        this.U.add(w1Var);
        if (linearLayout.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout.addView(w1Var, na.t(38, 38, 16, i11, 0, 0, 0));
    }

    public final void b(int i7, int i10, boolean z10) {
        int i11;
        w1 w1Var = new w1(i7, getContext(), this.f22483b);
        w1Var.c(m6.Pl);
        if (z10) {
            w1Var.d();
            this.W.add(w1Var);
        }
        w1Var.setTag(Integer.valueOf(i10));
        w1Var.setContentDescription(a2.n0(i10));
        w1Var.setOnClickListener(new v3(this, i10, 0));
        this.V.add(w1Var);
        LinearLayout linearLayout = this.K;
        if (linearLayout.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout.addView(w1Var, na.t(38, 38, 16, i11, 0, 0, 0));
    }

    public final void c(int i7, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            w1 w1Var = (w1) obj;
            int intValue = ((Integer) w1Var.getTag()).intValue();
            if ((i7 & intValue) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            w1Var.setSelected(z15);
            if (intValue == 1 || intValue == 2) {
                w1Var.setEnabled(z14);
            }
        }
        w1 w1Var2 = this.P;
        w1Var2.setSelected(z10);
        w1 w1Var3 = this.R;
        w1Var3.setSelected(z11);
        w1Var2.setEnabled(z12);
        this.Q.setEnabled(z13);
        w1Var3.setEnabled(z12);
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
            w1 w1Var = (w1) obj;
            if (i7 == ((Integer) w1Var.getTag()).intValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            w1Var.setSelected(z10);
            if (z10 && i10 != 0) {
                w1Var.e(i10);
            } else {
                w1Var.a();
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        float f10;
        int i7;
        if (this.f22487d0 != z10 || !z11) {
            this.f22487d0 = z10;
            if (z10) {
                f10 = 1.15f;
            } else {
                f10 = 1.0f;
            }
            rh0 rh0Var = this.J;
            if (z11) {
                rh0Var.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(nr.h).start();
            } else {
                rh0Var.animate().cancel();
                rh0Var.setScaleX(f10);
                rh0Var.setScaleY(f10);
            }
            if (z10) {
                i7 = m6.f29588q7;
            } else {
                i7 = m6.G6;
            }
            rh0Var.setColorFilter(new PorterDuffColorFilter(m6.w0(i7, this.f22483b), PorterDuff.Mode.SRC_IN));
            oh0 animatedDrawable = rh0Var.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f38175b0 > 34) {
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
        this.f22492g0.add(view);
        this.f22493h0.add(drawable);
        this.f22494i0.add(Integer.valueOf(i7));
        h6 h6Var = this.f22483b;
        this.f22495j0.add(Integer.valueOf(m6.w0(i7, h6Var)));
        if (drawable instanceof RippleDrawable) {
            i10 = m6.w(m6.w0(i7, h6Var), m6.w0(m6.f29439i6, h6Var));
        } else {
            i10 = 0;
        }
        this.f22496k0.add(Integer.valueOf(i10));
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
        if (this.f22484b0 == i7) {
            return;
        }
        this.f22484b0 = i7;
        FrameLayout frameLayout = this.I;
        int i12 = 0;
        d61 d61Var = this.H;
        LinearLayout linearLayout = this.f22504x;
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
            nr nrVar = nr.h;
            duration.setInterpolator(nrVar).withEndAction(new Runnable(this) {
                public final x3 f22417b;

                {
                    this.f22417b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            x3 x3Var = this.f22417b;
                            if (x3Var.f22484b0 != 0) {
                                x3Var.f22504x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            x3 x3Var2 = this.f22417b;
                            if (x3Var2.f22484b0 != 1) {
                                x3Var2.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            x3 x3Var3 = this.f22417b;
                            if (x3Var3.f22484b0 != 2) {
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
            scaleY2.translationY(L4).setDuration(420L).setInterpolator(nrVar).withEndAction(new Runnable(this) {
                public final x3 f22417b;

                {
                    this.f22417b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            x3 x3Var = this.f22417b;
                            if (x3Var.f22484b0 != 0) {
                                x3Var.f22504x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            x3 x3Var2 = this.f22417b;
                            if (x3Var2.f22484b0 != 1) {
                                x3Var2.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            x3 x3Var3 = this.f22417b;
                            if (x3Var3.f22484b0 != 2) {
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
            scaleX3.scaleY(f25).setDuration(420L).setInterpolator(nrVar).withEndAction(new Runnable(this) {
                public final x3 f22417b;

                {
                    this.f22417b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            x3 x3Var = this.f22417b;
                            if (x3Var.f22484b0 != 0) {
                                x3Var.f22504x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            x3 x3Var2 = this.f22417b;
                            if (x3Var2.f22484b0 != 1) {
                                x3Var2.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            x3 x3Var3 = this.f22417b;
                            if (x3Var3.f22484b0 != 2) {
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
        return this.f22502s;
    }

    public FrameLayout getBottomInnerContainer() {
        return this.f22503w;
    }

    public LinearLayout getBottomPanel() {
        return this.f22504x;
    }

    public View getEmojiButton() {
        return this.f22505y;
    }

    public ug getSendButton() {
        return this.G;
    }

    public void setBackVisible(boolean z10) {
        int i7;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f22490f.setVisibility(i7);
    }

    public void setBottomGradientTranslationY(float f10) {
        this.d.setTranslationY(f10);
    }

    public void setEmojiOpened(boolean z10) {
        yg ygVar;
        String str;
        if (z10) {
            ygVar = yg.d;
        } else {
            ygVar = yg.f42410e;
        }
        ah ahVar = this.f22505y;
        ahVar.j(ygVar, true);
        if (z10) {
            str = "Keyboard";
        } else {
            str = "Emoji";
        }
        ahVar.setContentDescription(str);
    }

    public void setPremiumLocked(boolean z10) {
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((w1) obj).setPremiumLocked(z10);
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
        v1 v1Var = this.G;
        if (v1Var.isEnabled() == z10) {
            return;
        }
        v1Var.setEnabled(z10);
        ViewPropertyAnimator animate = v1Var.animate();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        o10.n(animate, f10, 150L);
    }

    public void setSendLoading(boolean z10) {
        if (this.f22482a0 == z10) {
            return;
        }
        this.f22482a0 = z10;
        this.G.invalidate();
    }

    public void setTopButtonsOffset(int i7) {
        LinearLayout linearLayout = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.topMargin != i7) {
            layoutParams.topMargin = i7;
            linearLayout.setLayoutParams(layoutParams);
        }
        ImageView imageView = this.f22490f;
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
        this.f22485c.setVisibility(i7);
    }

    public void setTopPanelVisible(boolean z10) {
        int i7;
        int i10 = 8;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f22488e.setVisibility(i7);
        if (z10) {
            i10 = 0;
        }
        this.f22485c.setVisibility(i10);
    }

    @Override
    public final void updateColors() {
        throw new UnsupportedOperationException("Method not decompiled: oi.x3.updateColors():void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
