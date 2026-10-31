package bi;

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
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.zf;
import org.telegram.ui.u71;
public final class i4 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final LinearLayout D;
    public final ImageView E;
    public final f2 F;
    public final u71 G;
    public final FrameLayout H;
    public final ei0 I;
    public final LinearLayout J;
    public int K;
    public final LinearLayout L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final g2 O;
    public final g2 P;
    public final g2 Q;
    public final g2 R;
    public final g2 S;
    public final ArrayList T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public final p f3075a;
    public int f3076a0;
    public final org.telegram.ui.ActionBar.p6 f3077b;
    public int f3078b0;
    public final View f3079c;
    public boolean f3080c0;
    public final View d;
    public final GradientDrawable f3081d0;
    public final FrameLayout e;
    public final GradientDrawable f3082e0;
    public final ImageView f3083f;
    public final ArrayList f3084f0;
    public final ArrayList f3085g0;
    public final LinearLayout h;
    public final ArrayList f3086h0;
    public final ArrayList f3087i0;
    public final ArrayList f3088j0;
    public int f3089k0;
    public boolean f3090l0;
    public int m0;
    public final ImageView f3091n;
    public boolean f3092n0;
    public final ImageView f3093r;
    public final FrameLayout f3094s;
    public final FrameLayout f3095w;
    public final LinearLayout f3096x;
    public final fg f3097y;

    public i4(Context context, final p pVar) {
        super(context);
        int i10;
        int i11;
        this.K = Integer.MAX_VALUE;
        this.T = new ArrayList();
        this.U = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.V = arrayList;
        this.f3076a0 = -1;
        this.f3078b0 = 0;
        this.f3084f0 = new ArrayList();
        this.f3085g0 = new ArrayList();
        this.f3086h0 = new ArrayList();
        this.f3087i0 = new ArrayList();
        this.f3088j0 = new ArrayList();
        this.f3075a = pVar;
        org.telegram.ui.ActionBar.p6 p6Var = pVar.f3271a.f30946a;
        this.f3077b = p6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.f3079c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i12 = org.telegram.ui.ActionBar.t6.f20929d6;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.t6.w0(i12, p6Var), org.telegram.ui.ActionBar.t6.r1(0.0f, org.telegram.ui.ActionBar.t6.w0(i12, p6Var))});
        this.f3081d0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, w7.b6.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, org.telegram.ui.ActionBar.t6.w0(i12, p6Var)), org.telegram.ui.ActionBar.t6.w0(i12, p6Var)});
        this.f3082e0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        addView(view2, w7.b6.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, w7.b6.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f3083f = imageView;
        imageView.setImageResource(2131231241);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i13 = org.telegram.ui.ActionBar.t6.Ml;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i13, p6Var);
        int w03 = org.telegram.ui.ActionBar.t6.w0(i13, p6Var);
        int i14 = org.telegram.ui.ActionBar.t6.f21020i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.t6.b0(w02, org.telegram.ui.ActionBar.t6.w(w03, org.telegram.ui.ActionBar.t6.w0(i14, p6Var)), org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(22.0f));
        f(imageView, i13, b02);
        imageView.setBackground(new j2(b02));
        int i15 = org.telegram.ui.ActionBar.t6.G6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a7.t(imageView, i15, p6Var, mode);
        w7.e6.a(imageView);
        imageView.setContentDescription(cd.L0(2131754878, null));
        imageView.setOnClickListener(new bh.c(pVar, 1));
        frameLayout.addView(imageView, w7.b6.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
        f(linearLayout, i13, d02);
        linearLayout.setBackground(new j2(d02));
        frameLayout.addView(linearLayout, w7.b6.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.f3091n = imageView2;
        imageView2.setImageResource(2131231599);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i14, p6Var), 1, -1);
        org.telegram.ui.ActionBar.w6 N = a7.N(i14);
        imageView2.setBackground(h02);
        a7.k(imageView2, h02, null, N, p6Var);
        a7.t(imageView2, i15, p6Var, mode);
        w7.e6.a(imageView2);
        imageView2.setContentDescription("Undo");
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        t tVar = pVar.f3271a;
                        tVar.f3350r.T4();
                        tVar.Z();
                        return;
                    case 1:
                        pVar.f3271a.f3350r.c4(view3);
                        return;
                    case 2:
                        pVar.f3271a.f3350r.d4();
                        return;
                    case 3:
                        pVar.f3271a.f3350r.a4();
                        return;
                    case 4:
                        pVar.f3271a.f3350r.e4();
                        return;
                    case 5:
                        t tVar2 = pVar.f3271a;
                        u3 k22 = tVar2.f3350r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.f30946a);
                                g0Var.s1(a2);
                                g0Var.f26180c2 = new ag.l(k22, 6);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        pVar.f3271a.J(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        o2 o2Var = pVar.f3271a.f3350r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        o2 o2Var2 = pVar.f3271a.f3350r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.f3271a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.f3349n, context2, new ag.l(pVar2, 7), tVar3.f30946a).show();
                        return;
                    case 10:
                        t.O(pVar.f3271a);
                        return;
                    default:
                        t tVar4 = pVar.f3271a;
                        tVar4.f3350r.f2931i4 = null;
                        t.R(tVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView2, w7.b6.r(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.f3093r = imageView3;
        imageView3.setImageResource(2131231582);
        imageView3.setScaleType(scaleType);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i14, p6Var), 1, -1);
        org.telegram.ui.ActionBar.w6 N2 = a7.N(i14);
        imageView3.setBackground(h03);
        a7.k(imageView3, h03, null, N2, p6Var);
        a7.t(imageView3, i15, p6Var, mode);
        w7.e6.a(imageView3);
        imageView3.setContentDescription("Redo");
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        t tVar = pVar.f3271a;
                        tVar.f3350r.T4();
                        tVar.Z();
                        return;
                    case 1:
                        pVar.f3271a.f3350r.c4(view3);
                        return;
                    case 2:
                        pVar.f3271a.f3350r.d4();
                        return;
                    case 3:
                        pVar.f3271a.f3350r.a4();
                        return;
                    case 4:
                        pVar.f3271a.f3350r.e4();
                        return;
                    case 5:
                        t tVar2 = pVar.f3271a;
                        u3 k22 = tVar2.f3350r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.f30946a);
                                g0Var.s1(a2);
                                g0Var.f26180c2 = new ag.l(k22, 6);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        pVar.f3271a.J(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        o2 o2Var = pVar.f3271a.f3350r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        o2 o2Var2 = pVar.f3271a.f3350r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.f3271a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.f3349n, context2, new ag.l(pVar2, 7), tVar3.f30946a).show();
                        return;
                    case 10:
                        t.O(pVar.f3271a);
                        return;
                    default:
                        t tVar4 = pVar.f3271a;
                        tVar4.f3350r.f2931i4 = null;
                        t.R(tVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView3, w7.b6.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f3094s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, w7.b6.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f3095w = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, w7.b6.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f3096x = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        frameLayout3.addView(linearLayout2, w7.b6.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.ActionBar.y2(context));
        imageView4.setScaleType(scaleType);
        a7.t(imageView4, i15, p6Var, mode);
        org.telegram.ui.Cells.y b03 = org.telegram.ui.ActionBar.t6.b0(org.telegram.ui.ActionBar.t6.w0(i13, p6Var), org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(i13, p6Var), org.telegram.ui.ActionBar.t6.w0(i14, p6Var)), org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(22.0f));
        f(imageView4, i13, b03);
        imageView4.setBackground(new j2(b03));
        linearLayout2.addView(imageView4, w7.b6.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        w7.e6.a(imageView4);
        imageView4.setContentDescription("AI");
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        t tVar = pVar.f3271a;
                        tVar.f3350r.T4();
                        tVar.Z();
                        return;
                    case 1:
                        pVar.f3271a.f3350r.c4(view3);
                        return;
                    case 2:
                        pVar.f3271a.f3350r.d4();
                        return;
                    case 3:
                        pVar.f3271a.f3350r.a4();
                        return;
                    case 4:
                        pVar.f3271a.f3350r.e4();
                        return;
                    case 5:
                        t tVar2 = pVar.f3271a;
                        u3 k22 = tVar2.f3350r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.f30946a);
                                g0Var.s1(a2);
                                g0Var.f26180c2 = new ag.l(k22, 6);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        pVar.f3271a.J(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        o2 o2Var = pVar.f3271a.f3350r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        o2 o2Var2 = pVar.f3271a.f3350r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.f3271a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.f3349n, context2, new ag.l(pVar2, 7), tVar3.f30946a).show();
                        return;
                    case 10:
                        t.O(pVar.f3271a);
                        return;
                    default:
                        t tVar4 = pVar.f3271a;
                        tVar4.f3350r.f2931i4 = null;
                        t.R(tVar4, 90, 0);
                        return;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        ShapeDrawable d03 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        f(frameLayout5, i12, d03);
        frameLayout5.setBackground(new j2(d03));
        frameLayout4.addView(frameLayout5, w7.b6.e(-2, 44, 81));
        c2 c2Var = new c2(context, 1);
        c2Var.setClipToOutline(true);
        c2Var.setOutlineProvider(new d2(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.D = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        linearLayout3.setOrientation(0);
        c2Var.addView(linearLayout3);
        frameLayout5.addView(c2Var, w7.b6.c(-1.0f, -1));
        fg fgVar = new fg(context, 24);
        this.f3097y = fgVar;
        fgVar.setPadding(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f));
        a7.t(fgVar, i15, p6Var, mode);
        org.telegram.ui.Cells.y b04 = org.telegram.ui.ActionBar.t6.b0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), org.telegram.ui.ActionBar.t6.w0(i14, p6Var), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f));
        org.telegram.ui.ActionBar.w6 N3 = a7.N(i12);
        org.telegram.ui.ActionBar.w6 N4 = a7.N(i14);
        fgVar.setBackground(b04);
        a7.k(fgVar, b04, N3, N4, p6Var);
        fgVar.j(dg.e, false);
        linearLayout3.addView(fgVar, w7.b6.r(38, 38, 16));
        w7.e6.a(fgVar);
        fgVar.setContentDescription("Emoji");
        fgVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        t tVar = pVar.f3271a;
                        tVar.f3350r.T4();
                        tVar.Z();
                        return;
                    case 1:
                        pVar.f3271a.f3350r.c4(view3);
                        return;
                    case 2:
                        pVar.f3271a.f3350r.d4();
                        return;
                    case 3:
                        pVar.f3271a.f3350r.a4();
                        return;
                    case 4:
                        pVar.f3271a.f3350r.e4();
                        return;
                    case 5:
                        t tVar2 = pVar.f3271a;
                        u3 k22 = tVar2.f3350r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.f30946a);
                                g0Var.s1(a2);
                                g0Var.f26180c2 = new ag.l(k22, 6);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        pVar.f3271a.J(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        o2 o2Var = pVar.f3271a.f3350r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        o2 o2Var2 = pVar.f3271a.f3350r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.f3271a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.f3349n, context2, new ag.l(pVar2, 7), tVar3.f30946a).show();
                        return;
                    case 10:
                        t.O(pVar.f3271a);
                        return;
                    default:
                        t tVar4 = pVar.f3271a;
                        tVar4.f3350r.f2931i4 = null;
                        t.R(tVar4, 90, 0);
                        return;
                }
            }
        });
        a(2131231596, 1, false);
        a(2131231568, 2, true);
        a(2131231585, 4, true);
        a(2131231570, 7, true);
        ImageView imageView5 = new ImageView(context);
        this.E = imageView5;
        imageView5.setImageResource(2131232488);
        imageView5.setScaleType(scaleType);
        a7.t(imageView5, i15, p6Var, mode);
        org.telegram.ui.Cells.y b05 = org.telegram.ui.ActionBar.t6.b0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), org.telegram.ui.ActionBar.t6.w0(i14, p6Var), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f));
        org.telegram.ui.ActionBar.w6 N5 = a7.N(i12);
        org.telegram.ui.ActionBar.w6 N6 = a7.N(i14);
        imageView5.setBackground(b05);
        a7.k(imageView5, b05, N5, N6, p6Var);
        linearLayout3.addView(imageView5, w7.b6.t(38, 38, 16, 2, 0, 0, 0));
        w7.e6.a(imageView5);
        imageView5.setContentDescription("Attach");
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        t tVar = pVar.f3271a;
                        tVar.f3350r.T4();
                        tVar.Z();
                        return;
                    case 1:
                        pVar.f3271a.f3350r.c4(view3);
                        return;
                    case 2:
                        pVar.f3271a.f3350r.d4();
                        return;
                    case 3:
                        pVar.f3271a.f3350r.a4();
                        return;
                    case 4:
                        pVar.f3271a.f3350r.e4();
                        return;
                    case 5:
                        t tVar2 = pVar.f3271a;
                        u3 k22 = tVar2.f3350r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.f30946a);
                                g0Var.s1(a2);
                                g0Var.f26180c2 = new ag.l(k22, 6);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        pVar.f3271a.J(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        o2 o2Var = pVar.f3271a.f3350r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        o2 o2Var2 = pVar.f3271a.f3350r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.f3271a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.f3349n, context2, new ag.l(pVar2, 7), tVar3.f30946a).show();
                        return;
                    case 10:
                        t.O(pVar.f3271a);
                        return;
                    default:
                        t tVar4 = pVar.f3271a;
                        tVar4.f3350r.f2931i4 = null;
                        t.R(tVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout2.addView(frameLayout4, w7.b6.l(1.0f, 0, 44));
        u71 u71Var = new u71(this, context, 2);
        this.G = u71Var;
        u71Var.setOrientation(0);
        u71Var.setClipToPadding(false);
        u71Var.setClipChildren(false);
        u71Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        frameLayout2.addView(u71Var, w7.b6.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.H = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        frameLayout2.addView(frameLayout6, w7.b6.e(80, 60, 81));
        ?? imageView6 = new ImageView(context);
        this.I = imageView6;
        imageView6.f(2131624041, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), null);
        bi0 animatedDrawable = imageView6.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i15, p6Var), mode));
        ShapeDrawable d04 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
        f(imageView6, i13, d04);
        imageView6.setBackground(new j2(d04));
        frameLayout6.addView((View) imageView6, w7.b6.e(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        ShapeDrawable d05 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
        f(frameLayout7, i13, d05);
        frameLayout7.setBackground(new j2(d05));
        u71Var.addView(frameLayout7, w7.b6.c(44.0f, -2));
        h4 h4Var = new h4(this, context, 0);
        h4Var.setHorizontalScrollBarEnabled(false);
        h4Var.setClipToOutline(true);
        h4Var.setOutlineProvider(new d2(3));
        frameLayout7.addView(h4Var, w7.b6.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.J = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        h4Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(2131231199, 1, false);
        b(2131231201, 2, false);
        b(2131231207, 16, false);
        b(2131231206, 8, false);
        b(2131231205, 256, false);
        b(2131231552, 4, false);
        b(2131231583, 16384, true);
        b(2131231584, 32768, true);
        g2 g2Var = new g2(2131231581, context, p6Var);
        this.S = g2Var;
        g2Var.c(i13);
        g2Var.setContentDescription(cd.L0(2131746455, null));
        g2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        t tVar = pVar.f3271a;
                        tVar.f3350r.T4();
                        tVar.Z();
                        return;
                    case 1:
                        pVar.f3271a.f3350r.c4(view3);
                        return;
                    case 2:
                        pVar.f3271a.f3350r.d4();
                        return;
                    case 3:
                        pVar.f3271a.f3350r.a4();
                        return;
                    case 4:
                        pVar.f3271a.f3350r.e4();
                        return;
                    case 5:
                        t tVar2 = pVar.f3271a;
                        u3 k22 = tVar2.f3350r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.f30946a);
                                g0Var.s1(a2);
                                g0Var.f26180c2 = new ag.l(k22, 6);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        pVar.f3271a.J(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        o2 o2Var = pVar.f3271a.f3350r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        o2 o2Var2 = pVar.f3271a.f3350r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.f3271a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.f3349n, context2, new ag.l(pVar2, 7), tVar3.f30946a).show();
                        return;
                    case 10:
                        t.O(pVar.f3271a);
                        return;
                    default:
                        t tVar4 = pVar.f3271a;
                        tVar4.f3350r.f2931i4 = null;
                        t.R(tVar4, 90, 0);
                        return;
                }
            }
        });
        if (linearLayout4.getChildCount() == 0) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        linearLayout4.addView(g2Var, w7.b6.t(38, 38, 16, i10, 0, 0, 0));
        g2 g2Var2 = new g2(2131231549, context, p6Var);
        this.P = g2Var2;
        g2Var2.c(i13);
        g2Var2.setContentDescription(cd.L0(2131746028, null));
        g2Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        t tVar = pVar.f3271a;
                        tVar.f3350r.T4();
                        tVar.Z();
                        return;
                    case 1:
                        pVar.f3271a.f3350r.c4(view3);
                        return;
                    case 2:
                        pVar.f3271a.f3350r.d4();
                        return;
                    case 3:
                        pVar.f3271a.f3350r.a4();
                        return;
                    case 4:
                        pVar.f3271a.f3350r.e4();
                        return;
                    case 5:
                        t tVar2 = pVar.f3271a;
                        u3 k22 = tVar2.f3350r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.f30946a);
                                g0Var.s1(a2);
                                g0Var.f26180c2 = new ag.l(k22, 6);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        pVar.f3271a.J(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        o2 o2Var = pVar.f3271a.f3350r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        o2 o2Var2 = pVar.f3271a.f3350r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.f3271a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.f3349n, context2, new ag.l(pVar2, 7), tVar3.f30946a).show();
                        return;
                    case 10:
                        t.O(pVar.f3271a);
                        return;
                    default:
                        t tVar4 = pVar.f3271a;
                        tVar4.f3350r.f2931i4 = null;
                        t.R(tVar4, 90, 0);
                        return;
                }
            }
        });
        if (linearLayout4.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout4.addView(g2Var2, w7.b6.t(38, 38, 16, i11, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.M = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        ShapeDrawable d06 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
        f(linearLayout5, i13, d06);
        linearLayout5.setBackground(new j2(d06));
        u71Var.addView(linearLayout5, w7.b6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        g2 g2Var3 = new g2(2131231744, context, p6Var);
        this.O = g2Var3;
        g2Var3.c(i13);
        g2Var3.setContentDescription(cd.L0(2131751745, null));
        g2Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        t tVar = pVar.f3271a;
                        tVar.f3350r.T4();
                        tVar.Z();
                        return;
                    case 1:
                        pVar.f3271a.f3350r.c4(view3);
                        return;
                    case 2:
                        pVar.f3271a.f3350r.d4();
                        return;
                    case 3:
                        pVar.f3271a.f3350r.a4();
                        return;
                    case 4:
                        pVar.f3271a.f3350r.e4();
                        return;
                    case 5:
                        t tVar2 = pVar.f3271a;
                        u3 k22 = tVar2.f3350r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.f30946a);
                                g0Var.s1(a2);
                                g0Var.f26180c2 = new ag.l(k22, 6);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        pVar.f3271a.J(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        o2 o2Var = pVar.f3271a.f3350r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        o2 o2Var2 = pVar.f3271a.f3350r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.f3271a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.f3349n, context2, new ag.l(pVar2, 7), tVar3.f30946a).show();
                        return;
                    case 10:
                        t.O(pVar.f3271a);
                        return;
                    default:
                        t tVar4 = pVar.f3271a;
                        tVar4.f3350r.f2931i4 = null;
                        t.R(tVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(g2Var3, w7.b6.r(38, 38, 16));
        g2 g2Var4 = new g2(2131232076, context, p6Var);
        this.Q = g2Var4;
        g2Var4.c(i13);
        g2Var4.setContentDescription(cd.L0(2131754862, null));
        g2Var4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        t tVar = pVar.f3271a;
                        tVar.f3350r.T4();
                        tVar.Z();
                        return;
                    case 1:
                        pVar.f3271a.f3350r.c4(view3);
                        return;
                    case 2:
                        pVar.f3271a.f3350r.d4();
                        return;
                    case 3:
                        pVar.f3271a.f3350r.a4();
                        return;
                    case 4:
                        pVar.f3271a.f3350r.e4();
                        return;
                    case 5:
                        t tVar2 = pVar.f3271a;
                        u3 k22 = tVar2.f3350r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.f30946a);
                                g0Var.s1(a2);
                                g0Var.f26180c2 = new ag.l(k22, 6);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        pVar.f3271a.J(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        o2 o2Var = pVar.f3271a.f3350r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        o2 o2Var2 = pVar.f3271a.f3350r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.f3271a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.f3349n, context2, new ag.l(pVar2, 7), tVar3.f30946a).show();
                        return;
                    case 10:
                        t.O(pVar.f3271a);
                        return;
                    default:
                        t tVar4 = pVar.f3271a;
                        tVar4.f3350r.f2931i4 = null;
                        t.R(tVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(g2Var4, w7.b6.r(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.N = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        ShapeDrawable d07 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
        f(linearLayout6, i13, d07);
        linearLayout6.setBackground(new j2(d07));
        u71Var.addView(linearLayout6, w7.b6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        g2 g2Var5 = new g2(2131231570, context, p6Var);
        this.R = g2Var5;
        g2Var5.c(i13);
        g2Var5.d();
        arrayList.add(g2Var5);
        g2Var5.setContentDescription(cd.L0(2131754864, null));
        g2Var5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        t tVar = pVar.f3271a;
                        tVar.f3350r.T4();
                        tVar.Z();
                        return;
                    case 1:
                        pVar.f3271a.f3350r.c4(view3);
                        return;
                    case 2:
                        pVar.f3271a.f3350r.d4();
                        return;
                    case 3:
                        pVar.f3271a.f3350r.a4();
                        return;
                    case 4:
                        pVar.f3271a.f3350r.e4();
                        return;
                    case 5:
                        t tVar2 = pVar.f3271a;
                        u3 k22 = tVar2.f3350r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.f30946a);
                                g0Var.s1(a2);
                                g0Var.f26180c2 = new ag.l(k22, 6);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        pVar.f3271a.J(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        o2 o2Var = pVar.f3271a.f3350r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        o2 o2Var2 = pVar.f3271a.f3350r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.f3271a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.f3349n, context2, new ag.l(pVar2, 7), tVar3.f30946a).show();
                        return;
                    case 10:
                        t.O(pVar.f3271a);
                        return;
                    default:
                        t tVar4 = pVar.f3271a;
                        tVar4.f3350r.f2931i4 = null;
                        t.R(tVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout6.addView(g2Var5, w7.b6.r(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.L = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        ShapeDrawable d08 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
        f(linearLayout7, i13, d08);
        linearLayout7.setBackground(new j2(d08));
        u71Var.addView(linearLayout7, 0, w7.b6.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        g2 g2Var6 = new g2(2131231494, context, p6Var);
        g2Var6.setImageDrawable(new org.telegram.ui.ActionBar.y2(context));
        g2Var6.c(i13);
        g2Var6.setContentDescription(cd.L0(2131755006, null));
        g2Var6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        t tVar = pVar.f3271a;
                        tVar.f3350r.T4();
                        tVar.Z();
                        return;
                    case 1:
                        pVar.f3271a.f3350r.c4(view3);
                        return;
                    case 2:
                        pVar.f3271a.f3350r.d4();
                        return;
                    case 3:
                        pVar.f3271a.f3350r.a4();
                        return;
                    case 4:
                        pVar.f3271a.f3350r.e4();
                        return;
                    case 5:
                        t tVar2 = pVar.f3271a;
                        u3 k22 = tVar2.f3350r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.f30946a);
                                g0Var.s1(a2);
                                g0Var.f26180c2 = new ag.l(k22, 6);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        pVar.f3271a.J(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        o2 o2Var = pVar.f3271a.f3350r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        o2 o2Var2 = pVar.f3271a.f3350r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.f3271a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.f3349n, context2, new ag.l(pVar2, 7), tVar3.f30946a).show();
                        return;
                    case 10:
                        t.O(pVar.f3271a);
                        return;
                    default:
                        t tVar4 = pVar.f3271a;
                        tVar4.f3350r.f2931i4 = null;
                        t.R(tVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout7.addView(g2Var6, w7.b6.r(38, 38, 16));
        f2 f2Var = new f2(this, context, p6Var);
        this.F = f2Var;
        int i16 = org.telegram.ui.ActionBar.t6.Me;
        ShapeDrawable d09 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(i16, p6Var));
        f(f2Var, i16, d09);
        f2Var.setBackground(new j2(d09));
        w7.e6.a(f2Var);
        linearLayout2.addView(f2Var, w7.b6.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        f2Var.setContentDescription("Send");
        f2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        t tVar = pVar.f3271a;
                        tVar.f3350r.T4();
                        tVar.Z();
                        return;
                    case 1:
                        pVar.f3271a.f3350r.c4(view3);
                        return;
                    case 2:
                        pVar.f3271a.f3350r.d4();
                        return;
                    case 3:
                        pVar.f3271a.f3350r.a4();
                        return;
                    case 4:
                        pVar.f3271a.f3350r.e4();
                        return;
                    case 5:
                        t tVar2 = pVar.f3271a;
                        u3 k22 = tVar2.f3350r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.f30946a);
                                g0Var.s1(a2);
                                g0Var.f26180c2 = new ag.l(k22, 6);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        pVar.f3271a.J(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        o2 o2Var = pVar.f3271a.f3350r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        o2 o2Var2 = pVar.f3271a.f3350r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.f3271a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.f3349n, context2, new ag.l(pVar2, 7), tVar3.f30946a).show();
                        return;
                    case 10:
                        t.O(pVar.f3271a);
                        return;
                    default:
                        t tVar4 = pVar.f3271a;
                        tVar4.f3350r.f2931i4 = null;
                        t.R(tVar4, 90, 0);
                        return;
                }
            }
        });
        f2Var.setOnLongClickListener(new h1(pVar, 2));
        g(0, false);
    }

    public final void a(int i10, int i11, boolean z10) {
        int i12;
        LinearLayout linearLayout = this.D;
        g2 g2Var = new g2(i10, linearLayout.getContext(), this.f3077b);
        g2Var.c(org.telegram.ui.ActionBar.t6.f20929d6);
        if (z10) {
            g2Var.d();
            this.V.add(g2Var);
        }
        g2Var.setTag(Integer.valueOf(i11));
        g2Var.setContentDescription(k2.k0(i11));
        g2Var.setOnClickListener(new g4(this, i11, 1));
        this.T.add(g2Var);
        if (linearLayout.getChildCount() == 0) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        linearLayout.addView(g2Var, w7.b6.t(38, 38, 16, i12, 0, 0, 0));
    }

    public final void b(int i10, int i11, boolean z10) {
        int i12;
        g2 g2Var = new g2(i10, getContext(), this.f3077b);
        g2Var.c(org.telegram.ui.ActionBar.t6.Ml);
        if (z10) {
            g2Var.d();
            this.V.add(g2Var);
        }
        g2Var.setTag(Integer.valueOf(i11));
        g2Var.setContentDescription(k2.m0(i11));
        g2Var.setOnClickListener(new g4(this, i11, 0));
        this.U.add(g2Var);
        LinearLayout linearLayout = this.J;
        if (linearLayout.getChildCount() == 0) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        linearLayout.addView(g2Var, w7.b6.t(38, 38, 16, i12, 0, 0, 0));
    }

    public final void c(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        ArrayList arrayList = this.U;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            g2 g2Var = (g2) obj;
            int intValue = ((Integer) g2Var.getTag()).intValue();
            if ((i10 & intValue) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            g2Var.setSelected(z15);
            if (intValue == 1 || intValue == 2) {
                g2Var.setEnabled(z14);
            }
        }
        g2 g2Var2 = this.O;
        g2Var2.setSelected(z10);
        g2 g2Var3 = this.Q;
        g2Var3.setSelected(z11);
        g2Var2.setEnabled(z12);
        this.P.setEnabled(z13);
        g2Var3.setEnabled(z12);
        this.R.setEnabled(z12);
    }

    public final void d(int i10, int i11) {
        boolean z10;
        ArrayList arrayList = this.T;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            g2 g2Var = (g2) obj;
            if (i10 == ((Integer) g2Var.getTag()).intValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            g2Var.setSelected(z10);
            if (z10 && i11 != 0) {
                g2Var.e(i11);
            } else {
                g2Var.a();
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        int i10;
        if (this.f3080c0 != z10 || !z11) {
            this.f3080c0 = z10;
            if (z10) {
                f7 = 1.15f;
            } else {
                f7 = 1.0f;
            }
            ei0 ei0Var = this.I;
            if (z11) {
                ei0Var.animate().scaleX(f7).scaleY(f7).setDuration(180L).setInterpolator(gr.h).start();
            } else {
                ei0Var.animate().cancel();
                ei0Var.setScaleX(f7);
                ei0Var.setScaleY(f7);
            }
            if (z10) {
                i10 = org.telegram.ui.ActionBar.t6.f21170q7;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.G6;
            }
            ei0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i10, this.f3077b), PorterDuff.Mode.SRC_IN));
            bi0 animatedDrawable = ei0Var.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f24752a0 > 34) {
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

    public final void f(View view, int i10, Drawable drawable) {
        int i11;
        this.f3084f0.add(view);
        this.f3085g0.add(drawable);
        this.f3086h0.add(Integer.valueOf(i10));
        org.telegram.ui.ActionBar.p6 p6Var = this.f3077b;
        this.f3087i0.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
        if (drawable instanceof RippleDrawable) {
            i11 = org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21020i6, p6Var));
        } else {
            i11 = 0;
        }
        this.f3088j0.add(Integer.valueOf(i11));
    }

    public final void g(int i10, boolean z10) {
        int i11;
        float f7;
        float f10;
        float f11;
        float L;
        int i12;
        float f12;
        float f13;
        float f14;
        float L2;
        float f15;
        float f16;
        float f17;
        float f18;
        float L3;
        float f19;
        float f20;
        float f21;
        float L4;
        float f22;
        if (this.f3076a0 == i10) {
            return;
        }
        this.f3076a0 = i10;
        FrameLayout frameLayout = this.H;
        int i13 = 0;
        u71 u71Var = this.G;
        LinearLayout linearLayout = this.f3096x;
        float f23 = 0.0f;
        float f24 = 0.8f;
        if (z10) {
            linearLayout.setVisibility(0);
            ViewPropertyAnimator animate = linearLayout.animate();
            if (i10 == 0) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f16);
            if (i10 == 0) {
                f17 = 1.0f;
            } else {
                f17 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f17);
            if (i10 == 0) {
                f18 = 1.0f;
            } else {
                f18 = 0.8f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f18);
            if (i10 == 0) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.i0.L(30.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationY(L3).setDuration(420L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).withEndAction(new Runnable(this) {
                public final i4 f3000b;

                {
                    this.f3000b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            i4 i4Var = this.f3000b;
                            if (i4Var.f3076a0 != 0) {
                                i4Var.f3096x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            i4 i4Var2 = this.f3000b;
                            if (i4Var2.f3076a0 != 1) {
                                i4Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            i4 i4Var3 = this.f3000b;
                            if (i4Var3.f3076a0 != 2) {
                                i4Var3.H.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            u71Var.setVisibility(0);
            ViewPropertyAnimator animate2 = u71Var.animate();
            if (i10 == 1) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f19);
            if (i10 == 1) {
                f20 = 1.0f;
            } else {
                f20 = 0.8f;
            }
            ViewPropertyAnimator scaleX2 = alpha2.scaleX(f20);
            if (i10 == 1) {
                f21 = 1.0f;
            } else {
                f21 = 0.8f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f21);
            if (i10 == 1) {
                L4 = 0.0f;
            } else {
                L4 = org.telegram.messenger.i0.L(30.0f);
            }
            scaleY2.translationY(L4).setDuration(420L).setInterpolator(grVar).withEndAction(new Runnable(this) {
                public final i4 f3000b;

                {
                    this.f3000b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            i4 i4Var = this.f3000b;
                            if (i4Var.f3076a0 != 0) {
                                i4Var.f3096x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            i4 i4Var2 = this.f3000b;
                            if (i4Var2.f3076a0 != 1) {
                                i4Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            i4 i4Var3 = this.f3000b;
                            if (i4Var3.f3076a0 != 2) {
                                i4Var3.H.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate3 = frameLayout.animate();
            if (i10 == 2) {
                f23 = 1.0f;
            }
            ViewPropertyAnimator alpha3 = animate3.alpha(f23);
            if (i10 == 2) {
                f22 = 1.0f;
            } else {
                f22 = 0.8f;
            }
            ViewPropertyAnimator scaleX3 = alpha3.scaleX(f22);
            if (i10 == 2) {
                f24 = 1.0f;
            }
            scaleX3.scaleY(f24).setDuration(420L).setInterpolator(grVar).withEndAction(new Runnable(this) {
                public final i4 f3000b;

                {
                    this.f3000b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            i4 i4Var = this.f3000b;
                            if (i4Var.f3076a0 != 0) {
                                i4Var.f3096x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            i4 i4Var2 = this.f3000b;
                            if (i4Var2.f3076a0 != 1) {
                                i4Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            i4 i4Var3 = this.f3000b;
                            if (i4Var3.f3076a0 != 2) {
                                i4Var3.H.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        if (i10 == 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        if (i10 == 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        linearLayout.setAlpha(f7);
        if (i10 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        linearLayout.setScaleX(f10);
        if (i10 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        linearLayout.setScaleY(f11);
        if (i10 == 0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.i0.L(30.0f);
        }
        linearLayout.setTranslationY(L);
        if (i10 == 1) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        u71Var.setVisibility(i12);
        if (i10 == 1) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        u71Var.setAlpha(f12);
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.8f;
        }
        u71Var.setScaleX(f13);
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        u71Var.setScaleY(f14);
        if (i10 == 1) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.i0.L(30.0f);
        }
        u71Var.setTranslationY(L2);
        if (i10 != 2) {
            i13 = 8;
        }
        frameLayout.setVisibility(i13);
        if (i10 == 2) {
            f23 = 1.0f;
        }
        frameLayout.setAlpha(f23);
        if (i10 == 2) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        frameLayout.setScaleX(f15);
        if (i10 == 2) {
            f24 = 1.0f;
        }
        frameLayout.setScaleY(f24);
    }

    public ImageView getAddButton() {
        return this.E;
    }

    public FrameLayout getBottomContainer() {
        return this.f3094s;
    }

    public FrameLayout getBottomInnerContainer() {
        return this.f3095w;
    }

    public LinearLayout getBottomPanel() {
        return this.f3096x;
    }

    public View getEmojiButton() {
        return this.f3097y;
    }

    public zf getSendButton() {
        return this.F;
    }

    public void setBackVisible(boolean z10) {
        int i10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f3083f.setVisibility(i10);
    }

    public void setBottomGradientTranslationY(float f7) {
        this.d.setTranslationY(f7);
    }

    public void setEmojiOpened(boolean z10) {
        dg dgVar;
        String str;
        if (z10) {
            dgVar = dg.d;
        } else {
            dgVar = dg.e;
        }
        fg fgVar = this.f3097y;
        fgVar.j(dgVar, true);
        if (z10) {
            str = "Keyboard";
        } else {
            str = "Emoji";
        }
        fgVar.setContentDescription(str);
    }

    public void setPremiumLocked(boolean z10) {
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((g2) obj).setPremiumLocked(z10);
        }
    }

    public void setQuoteState(boolean z10) {
        this.S.setSelected(z10);
    }

    public void setSelectedBlockType(int i10) {
        d(i10, 0);
    }

    public void setSendEditing(boolean z10) {
        int i10;
        if (z10) {
            i10 = 2131231502;
        } else {
            i10 = 2131232691;
        }
        this.F.setResourceId(i10);
    }

    public void setSendEnabled(boolean z10) {
        float f7;
        f2 f2Var = this.F;
        if (f2Var.isEnabled() == z10) {
            return;
        }
        f2Var.setEnabled(z10);
        ViewPropertyAnimator animate = f2Var.animate();
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        z20.l(animate, f7, 150L);
    }

    public void setSendLoading(boolean z10) {
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        this.F.invalidate();
    }

    public void setTopButtonsOffset(int i10) {
        LinearLayout linearLayout = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.topMargin != i10) {
            layoutParams.topMargin = i10;
            linearLayout.setLayoutParams(layoutParams);
        }
        ImageView imageView = this.f3083f;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        if (layoutParams2.topMargin != i10) {
            layoutParams2.topMargin = i10;
            imageView.setLayoutParams(layoutParams2);
        }
    }

    public void setTopGradientVisible(boolean z10) {
        int i10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f3079c.setVisibility(i10);
    }

    public void setTopPanelVisible(boolean z10) {
        int i10;
        int i11 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.e.setVisibility(i10);
        if (z10) {
            i11 = 0;
        }
        this.f3079c.setVisibility(i11);
    }

    @Override
    public final void updateColors() {
        throw new UnsupportedOperationException("Method not decompiled: bi.i4.updateColors():void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
