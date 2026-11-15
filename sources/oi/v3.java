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
import c8.ja;
import c8.na;
import hi.g7;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.pg;
import org.telegram.ui.z51;
public final class v3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final LinearLayout E;
    public final ImageView F;
    public final u1 G;
    public final z51 H;
    public final FrameLayout I;
    public final fh0 J;
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
    public final k f22057a;
    public boolean f22058a0;
    public final e6 f22059b;
    public int f22060b0;
    public final View f22061c;
    public int f22062c0;
    public final View d;
    public boolean f22063d0;
    public final FrameLayout f22064e;
    public final GradientDrawable f22065e0;
    public final ImageView f22066f;
    public final GradientDrawable f22067f0;
    public final ArrayList f22068g0;
    public final LinearLayout h;
    public final ArrayList f22069h0;
    public final ArrayList f22070i0;
    public final ArrayList f22071j0;
    public final ArrayList f22072k0;
    public int f22073l0;
    public boolean m0;
    public final ImageView f22074n;
    public int f22075n0;
    public boolean f22076o0;
    public final ImageView f22077r;
    public final FrameLayout f22078s;
    public final FrameLayout f22079w;
    public final LinearLayout f22080x;
    public final pg f22081y;

    public v3(Context context, final k kVar) {
        super(context);
        this.L = Integer.MAX_VALUE;
        this.U = new ArrayList();
        this.V = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.W = arrayList;
        this.f22060b0 = -1;
        this.f22062c0 = 0;
        this.f22068g0 = new ArrayList();
        this.f22069h0 = new ArrayList();
        this.f22070i0 = new ArrayList();
        this.f22071j0 = new ArrayList();
        this.f22072k0 = new ArrayList();
        this.f22057a = kVar;
        e6 e6Var = kVar.f21766a.f33606a;
        this.f22059b = e6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.f22061c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i7 = j6.f28849d6;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{j6.w0(i7, e6Var), j6.r1(0.0f, j6.w0(i7, e6Var))});
        this.f22065e0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, ja.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{j6.r1(0.0f, j6.w0(i7, e6Var)), j6.w0(i7, e6Var)});
        this.f22067f0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        addView(view2, ja.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f22064e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, ja.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f22066f = imageView;
        imageView.setImageResource(2131231240);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i10 = j6.Pl;
        int w02 = j6.w0(i10, e6Var);
        int w03 = j6.w0(i10, e6Var);
        int i11 = j6.f28941i6;
        org.telegram.ui.Cells.y b02 = j6.b0(w02, j6.w(w03, j6.w0(i11, e6Var)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        f(imageView, i10, b02);
        imageView.setBackground(new y1(b02));
        int i12 = j6.G6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        q6.s(imageView, i12, e6Var, mode);
        na.a(imageView);
        imageView.setContentDescription(hd.M0(2131754878, null));
        imageView.setOnClickListener(new bi.o(kVar, 9));
        frameLayout.addView(imageView, ja.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        ShapeDrawable d02 = j6.d0(org.telegram.messenger.g0.L(22.0f), j6.w0(i10, e6Var));
        f(linearLayout, i10, d02);
        linearLayout.setBackground(new y1(d02));
        frameLayout.addView(linearLayout, ja.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.f22074n = imageView2;
        imageView2.setImageResource(2131231598);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y h02 = j6.h0(j6.w0(i11, e6Var), 1, -1);
        m6 M = q6.M(i11);
        imageView2.setBackground(h02);
        q6.j(imageView2, h02, null, M, e6Var);
        q6.s(imageView2, i12, e6Var, mode);
        na.a(imageView2);
        imageView2.setContentDescription("Undo");
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f21766a;
                        oVar.f21848r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f21766a.f21848r.c4(view3);
                        return;
                    case 2:
                        kVar.f21766a.f21848r.d4();
                        return;
                    case 3:
                        kVar.f21766a.f21848r.a4();
                        return;
                    case 4:
                        kVar.f21766a.f21848r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f21766a;
                        h3 k22 = oVar2.f21848r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.d0 d0Var = new org.telegram.ui.Components.d0(oVar2.getContext(), oVar2.f33606a);
                                d0Var.r1(a10);
                                d0Var.f33752g2 = new g7(k22, 14);
                                d0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f21766a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        d2 d2Var = kVar.f21766a.f21848r.R3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = kVar.f21766a.f21848r.R3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f21766a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f21847n, context2, new g7(kVar2, 15), oVar3.f33606a).show();
                        return;
                    case 10:
                        o.Q(kVar.f21766a);
                        return;
                    default:
                        o oVar4 = kVar.f21766a;
                        oVar4.f21848r.f21924j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView2, ja.r(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.f22077r = imageView3;
        imageView3.setImageResource(2131231581);
        imageView3.setScaleType(scaleType);
        org.telegram.ui.Cells.y h03 = j6.h0(j6.w0(i11, e6Var), 1, -1);
        m6 M2 = q6.M(i11);
        imageView3.setBackground(h03);
        q6.j(imageView3, h03, null, M2, e6Var);
        q6.s(imageView3, i12, e6Var, mode);
        na.a(imageView3);
        imageView3.setContentDescription("Redo");
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f21766a;
                        oVar.f21848r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f21766a.f21848r.c4(view3);
                        return;
                    case 2:
                        kVar.f21766a.f21848r.d4();
                        return;
                    case 3:
                        kVar.f21766a.f21848r.a4();
                        return;
                    case 4:
                        kVar.f21766a.f21848r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f21766a;
                        h3 k22 = oVar2.f21848r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.d0 d0Var = new org.telegram.ui.Components.d0(oVar2.getContext(), oVar2.f33606a);
                                d0Var.r1(a10);
                                d0Var.f33752g2 = new g7(k22, 14);
                                d0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f21766a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        d2 d2Var = kVar.f21766a.f21848r.R3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = kVar.f21766a.f21848r.R3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f21766a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f21847n, context2, new g7(kVar2, 15), oVar3.f33606a).show();
                        return;
                    case 10:
                        o.Q(kVar.f21766a);
                        return;
                    default:
                        o oVar4 = kVar.f21766a;
                        oVar4.f21848r.f21924j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView3, ja.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f22078s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, ja.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f22079w = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, ja.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f22080x = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout3.addView(linearLayout2, ja.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.ActionBar.t2(context));
        imageView4.setScaleType(scaleType);
        q6.s(imageView4, i12, e6Var, mode);
        org.telegram.ui.Cells.y b03 = j6.b0(j6.w0(i10, e6Var), j6.w(j6.w0(i10, e6Var), j6.w0(i11, e6Var)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        f(imageView4, i10, b03);
        imageView4.setBackground(new y1(b03));
        linearLayout2.addView(imageView4, ja.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        na.a(imageView4);
        imageView4.setContentDescription("AI");
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f21766a;
                        oVar.f21848r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f21766a.f21848r.c4(view3);
                        return;
                    case 2:
                        kVar.f21766a.f21848r.d4();
                        return;
                    case 3:
                        kVar.f21766a.f21848r.a4();
                        return;
                    case 4:
                        kVar.f21766a.f21848r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f21766a;
                        h3 k22 = oVar2.f21848r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.d0 d0Var = new org.telegram.ui.Components.d0(oVar2.getContext(), oVar2.f33606a);
                                d0Var.r1(a10);
                                d0Var.f33752g2 = new g7(k22, 14);
                                d0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f21766a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        d2 d2Var = kVar.f21766a.f21848r.R3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = kVar.f21766a.f21848r.R3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f21766a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f21847n, context2, new g7(kVar2, 15), oVar3.f33606a).show();
                        return;
                    case 10:
                        o.Q(kVar.f21766a);
                        return;
                    default:
                        o oVar4 = kVar.f21766a;
                        oVar4.f21848r.f21924j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        ShapeDrawable d03 = j6.d0(org.telegram.messenger.g0.L(22.0f), j6.w0(i7, e6Var));
        f(frameLayout5, i7, d03);
        frameLayout5.setBackground(new y1(d03));
        frameLayout4.addView(frameLayout5, ja.e(-2, 44, 81));
        s1 s1Var = new s1(context, 1);
        s1Var.setClipToOutline(true);
        s1Var.setOutlineProvider(new bg.p0(6));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        linearLayout3.setOrientation(0);
        s1Var.addView(linearLayout3);
        frameLayout5.addView(s1Var, ja.c(-1.0f, -1));
        pg pgVar = new pg(context, 24);
        this.f22081y = pgVar;
        pgVar.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        q6.s(pgVar, i12, e6Var, mode);
        org.telegram.ui.Cells.y b04 = j6.b0(j6.w0(i7, e6Var), j6.w0(i11, e6Var), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        m6 M3 = q6.M(i7);
        m6 M4 = q6.M(i11);
        pgVar.setBackground(b04);
        q6.j(pgVar, b04, M3, M4, e6Var);
        pgVar.j(ng.f37583e, false);
        linearLayout3.addView(pgVar, ja.r(38, 38, 16));
        na.a(pgVar);
        pgVar.setContentDescription("Emoji");
        pgVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f21766a;
                        oVar.f21848r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f21766a.f21848r.c4(view3);
                        return;
                    case 2:
                        kVar.f21766a.f21848r.d4();
                        return;
                    case 3:
                        kVar.f21766a.f21848r.a4();
                        return;
                    case 4:
                        kVar.f21766a.f21848r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f21766a;
                        h3 k22 = oVar2.f21848r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.d0 d0Var = new org.telegram.ui.Components.d0(oVar2.getContext(), oVar2.f33606a);
                                d0Var.r1(a10);
                                d0Var.f33752g2 = new g7(k22, 14);
                                d0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f21766a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        d2 d2Var = kVar.f21766a.f21848r.R3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = kVar.f21766a.f21848r.R3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f21766a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f21847n, context2, new g7(kVar2, 15), oVar3.f33606a).show();
                        return;
                    case 10:
                        o.Q(kVar.f21766a);
                        return;
                    default:
                        o oVar4 = kVar.f21766a;
                        oVar4.f21848r.f21924j4 = null;
                        o.T(oVar4, 90, 0);
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
        imageView5.setImageResource(2131232490);
        imageView5.setScaleType(scaleType);
        q6.s(imageView5, i12, e6Var, mode);
        org.telegram.ui.Cells.y b05 = j6.b0(j6.w0(i7, e6Var), j6.w0(i11, e6Var), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        m6 M5 = q6.M(i7);
        m6 M6 = q6.M(i11);
        imageView5.setBackground(b05);
        q6.j(imageView5, b05, M5, M6, e6Var);
        linearLayout3.addView(imageView5, ja.t(38, 38, 16, 2, 0, 0, 0));
        na.a(imageView5);
        imageView5.setContentDescription("Attach");
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f21766a;
                        oVar.f21848r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f21766a.f21848r.c4(view3);
                        return;
                    case 2:
                        kVar.f21766a.f21848r.d4();
                        return;
                    case 3:
                        kVar.f21766a.f21848r.a4();
                        return;
                    case 4:
                        kVar.f21766a.f21848r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f21766a;
                        h3 k22 = oVar2.f21848r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.d0 d0Var = new org.telegram.ui.Components.d0(oVar2.getContext(), oVar2.f33606a);
                                d0Var.r1(a10);
                                d0Var.f33752g2 = new g7(k22, 14);
                                d0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f21766a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        d2 d2Var = kVar.f21766a.f21848r.R3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = kVar.f21766a.f21848r.R3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f21766a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f21847n, context2, new g7(kVar2, 15), oVar3.f33606a).show();
                        return;
                    case 10:
                        o.Q(kVar.f21766a);
                        return;
                    default:
                        o oVar4 = kVar.f21766a;
                        oVar4.f21848r.f21924j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout2.addView(frameLayout4, ja.l(1.0f, 0, 44));
        z51 z51Var = new z51(8, context, this);
        this.H = z51Var;
        z51Var.setOrientation(0);
        z51Var.setClipToPadding(false);
        z51Var.setClipChildren(false);
        z51Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(z51Var, ja.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.I = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(frameLayout6, ja.e(80, 60, 81));
        ?? imageView6 = new ImageView(context);
        this.J = imageView6;
        imageView6.f(2131624043, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), null);
        ch0 animatedDrawable = imageView6.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(j6.w0(i12, e6Var), mode));
        ShapeDrawable d04 = j6.d0(org.telegram.messenger.g0.L(22.0f), j6.w0(i10, e6Var));
        f(imageView6, i10, d04);
        imageView6.setBackground(new y1(d04));
        frameLayout6.addView((View) imageView6, ja.e(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        ShapeDrawable d05 = j6.d0(org.telegram.messenger.g0.L(22.0f), j6.w0(i10, e6Var));
        f(frameLayout7, i10, d05);
        frameLayout7.setBackground(new y1(d05));
        z51Var.addView(frameLayout7, ja.c(44.0f, -2));
        u3 u3Var = new u3(this, context, 0);
        u3Var.setHorizontalScrollBarEnabled(false);
        u3Var.setClipToOutline(true);
        u3Var.setOutlineProvider(new bg.p0(7));
        frameLayout7.addView(u3Var, ja.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.K = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        u3Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(2131231199, 1, false);
        b(2131231201, 2, false);
        b(2131231207, 16, false);
        b(2131231206, 8, false);
        b(2131231205, 256, false);
        b(2131231551, 4, false);
        b(2131231582, 16384, true);
        b(2131231583, 32768, true);
        v1 v1Var = new v1(2131231580, context, e6Var);
        this.T = v1Var;
        v1Var.c(i10);
        v1Var.setContentDescription(hd.M0(2131746440, null));
        v1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f21766a;
                        oVar.f21848r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f21766a.f21848r.c4(view3);
                        return;
                    case 2:
                        kVar.f21766a.f21848r.d4();
                        return;
                    case 3:
                        kVar.f21766a.f21848r.a4();
                        return;
                    case 4:
                        kVar.f21766a.f21848r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f21766a;
                        h3 k22 = oVar2.f21848r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.d0 d0Var = new org.telegram.ui.Components.d0(oVar2.getContext(), oVar2.f33606a);
                                d0Var.r1(a10);
                                d0Var.f33752g2 = new g7(k22, 14);
                                d0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f21766a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        d2 d2Var = kVar.f21766a.f21848r.R3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = kVar.f21766a.f21848r.R3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f21766a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f21847n, context2, new g7(kVar2, 15), oVar3.f33606a).show();
                        return;
                    case 10:
                        o.Q(kVar.f21766a);
                        return;
                    default:
                        o oVar4 = kVar.f21766a;
                        oVar4.f21848r.f21924j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout4.addView(v1Var, ja.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        v1 v1Var2 = new v1(2131231548, context, e6Var);
        this.Q = v1Var2;
        v1Var2.c(i10);
        v1Var2.setContentDescription(hd.M0(2131746011, null));
        v1Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f21766a;
                        oVar.f21848r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f21766a.f21848r.c4(view3);
                        return;
                    case 2:
                        kVar.f21766a.f21848r.d4();
                        return;
                    case 3:
                        kVar.f21766a.f21848r.a4();
                        return;
                    case 4:
                        kVar.f21766a.f21848r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f21766a;
                        h3 k22 = oVar2.f21848r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.d0 d0Var = new org.telegram.ui.Components.d0(oVar2.getContext(), oVar2.f33606a);
                                d0Var.r1(a10);
                                d0Var.f33752g2 = new g7(k22, 14);
                                d0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f21766a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        d2 d2Var = kVar.f21766a.f21848r.R3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = kVar.f21766a.f21848r.R3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f21766a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f21847n, context2, new g7(kVar2, 15), oVar3.f33606a).show();
                        return;
                    case 10:
                        o.Q(kVar.f21766a);
                        return;
                    default:
                        o oVar4 = kVar.f21766a;
                        oVar4.f21848r.f21924j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout4.addView(v1Var2, ja.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.N = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        ShapeDrawable d06 = j6.d0(org.telegram.messenger.g0.L(22.0f), j6.w0(i10, e6Var));
        f(linearLayout5, i10, d06);
        linearLayout5.setBackground(new y1(d06));
        z51Var.addView(linearLayout5, ja.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        v1 v1Var3 = new v1(2131231745, context, e6Var);
        this.P = v1Var3;
        v1Var3.c(i10);
        v1Var3.setContentDescription(hd.M0(2131751744, null));
        v1Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f21766a;
                        oVar.f21848r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f21766a.f21848r.c4(view3);
                        return;
                    case 2:
                        kVar.f21766a.f21848r.d4();
                        return;
                    case 3:
                        kVar.f21766a.f21848r.a4();
                        return;
                    case 4:
                        kVar.f21766a.f21848r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f21766a;
                        h3 k22 = oVar2.f21848r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.d0 d0Var = new org.telegram.ui.Components.d0(oVar2.getContext(), oVar2.f33606a);
                                d0Var.r1(a10);
                                d0Var.f33752g2 = new g7(k22, 14);
                                d0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f21766a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        d2 d2Var = kVar.f21766a.f21848r.R3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = kVar.f21766a.f21848r.R3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f21766a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f21847n, context2, new g7(kVar2, 15), oVar3.f33606a).show();
                        return;
                    case 10:
                        o.Q(kVar.f21766a);
                        return;
                    default:
                        o oVar4 = kVar.f21766a;
                        oVar4.f21848r.f21924j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(v1Var3, ja.r(38, 38, 16));
        v1 v1Var4 = new v1(2131232078, context, e6Var);
        this.R = v1Var4;
        v1Var4.c(i10);
        v1Var4.setContentDescription(hd.M0(2131754862, null));
        v1Var4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f21766a;
                        oVar.f21848r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f21766a.f21848r.c4(view3);
                        return;
                    case 2:
                        kVar.f21766a.f21848r.d4();
                        return;
                    case 3:
                        kVar.f21766a.f21848r.a4();
                        return;
                    case 4:
                        kVar.f21766a.f21848r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f21766a;
                        h3 k22 = oVar2.f21848r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.d0 d0Var = new org.telegram.ui.Components.d0(oVar2.getContext(), oVar2.f33606a);
                                d0Var.r1(a10);
                                d0Var.f33752g2 = new g7(k22, 14);
                                d0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f21766a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        d2 d2Var = kVar.f21766a.f21848r.R3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = kVar.f21766a.f21848r.R3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f21766a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f21847n, context2, new g7(kVar2, 15), oVar3.f33606a).show();
                        return;
                    case 10:
                        o.Q(kVar.f21766a);
                        return;
                    default:
                        o oVar4 = kVar.f21766a;
                        oVar4.f21848r.f21924j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(v1Var4, ja.r(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.O = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        ShapeDrawable d07 = j6.d0(org.telegram.messenger.g0.L(22.0f), j6.w0(i10, e6Var));
        f(linearLayout6, i10, d07);
        linearLayout6.setBackground(new y1(d07));
        z51Var.addView(linearLayout6, ja.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        v1 v1Var5 = new v1(2131231569, context, e6Var);
        this.S = v1Var5;
        v1Var5.c(i10);
        v1Var5.d();
        arrayList.add(v1Var5);
        v1Var5.setContentDescription(hd.M0(2131754864, null));
        v1Var5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f21766a;
                        oVar.f21848r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f21766a.f21848r.c4(view3);
                        return;
                    case 2:
                        kVar.f21766a.f21848r.d4();
                        return;
                    case 3:
                        kVar.f21766a.f21848r.a4();
                        return;
                    case 4:
                        kVar.f21766a.f21848r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f21766a;
                        h3 k22 = oVar2.f21848r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.d0 d0Var = new org.telegram.ui.Components.d0(oVar2.getContext(), oVar2.f33606a);
                                d0Var.r1(a10);
                                d0Var.f33752g2 = new g7(k22, 14);
                                d0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f21766a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        d2 d2Var = kVar.f21766a.f21848r.R3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = kVar.f21766a.f21848r.R3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f21766a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f21847n, context2, new g7(kVar2, 15), oVar3.f33606a).show();
                        return;
                    case 10:
                        o.Q(kVar.f21766a);
                        return;
                    default:
                        o oVar4 = kVar.f21766a;
                        oVar4.f21848r.f21924j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout6.addView(v1Var5, ja.r(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.M = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        ShapeDrawable d08 = j6.d0(org.telegram.messenger.g0.L(22.0f), j6.w0(i10, e6Var));
        f(linearLayout7, i10, d08);
        linearLayout7.setBackground(new y1(d08));
        z51Var.addView(linearLayout7, 0, ja.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        v1 v1Var6 = new v1(2131231493, context, e6Var);
        v1Var6.setImageDrawable(new org.telegram.ui.ActionBar.t2(context));
        v1Var6.c(i10);
        v1Var6.setContentDescription(hd.M0(2131755006, null));
        v1Var6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f21766a;
                        oVar.f21848r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f21766a.f21848r.c4(view3);
                        return;
                    case 2:
                        kVar.f21766a.f21848r.d4();
                        return;
                    case 3:
                        kVar.f21766a.f21848r.a4();
                        return;
                    case 4:
                        kVar.f21766a.f21848r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f21766a;
                        h3 k22 = oVar2.f21848r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.d0 d0Var = new org.telegram.ui.Components.d0(oVar2.getContext(), oVar2.f33606a);
                                d0Var.r1(a10);
                                d0Var.f33752g2 = new g7(k22, 14);
                                d0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f21766a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        d2 d2Var = kVar.f21766a.f21848r.R3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = kVar.f21766a.f21848r.R3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f21766a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f21847n, context2, new g7(kVar2, 15), oVar3.f33606a).show();
                        return;
                    case 10:
                        o.Q(kVar.f21766a);
                        return;
                    default:
                        o oVar4 = kVar.f21766a;
                        oVar4.f21848r.f21924j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout7.addView(v1Var6, ja.r(38, 38, 16));
        u1 u1Var = new u1(this, context, e6Var);
        this.G = u1Var;
        int i13 = j6.Pe;
        ShapeDrawable d09 = j6.d0(org.telegram.messenger.g0.L(22.0f), j6.w0(i13, e6Var));
        f(u1Var, i13, d09);
        u1Var.setBackground(new y1(d09));
        na.a(u1Var);
        linearLayout2.addView(u1Var, ja.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        u1Var.setContentDescription("Send");
        u1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o oVar = kVar.f21766a;
                        oVar.f21848r.T4();
                        oVar.b0();
                        return;
                    case 1:
                        kVar.f21766a.f21848r.c4(view3);
                        return;
                    case 2:
                        kVar.f21766a.f21848r.d4();
                        return;
                    case 3:
                        kVar.f21766a.f21848r.a4();
                        return;
                    case 4:
                        kVar.f21766a.f21848r.e4();
                        return;
                    case 5:
                        o oVar2 = kVar.f21766a;
                        h3 k22 = oVar2.f21848r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.d0 d0Var = new org.telegram.ui.Components.d0(oVar2.getContext(), oVar2.f33606a);
                                d0Var.r1(a10);
                                d0Var.f33752g2 = new g7(k22, 14);
                                d0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f21766a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        d2 d2Var = kVar.f21766a.f21848r.R3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = kVar.f21766a.f21848r.R3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.f21766a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.f21847n, context2, new g7(kVar2, 15), oVar3.f33606a).show();
                        return;
                    case 10:
                        o.Q(kVar.f21766a);
                        return;
                    default:
                        o oVar4 = kVar.f21766a;
                        oVar4.f21848r.f21924j4 = null;
                        o.T(oVar4, 90, 0);
                        return;
                }
            }
        });
        u1Var.setOnLongClickListener(new hi.p4(kVar, 5));
        g(0, false);
    }

    public final void a(int i7, int i10, boolean z10) {
        int i11;
        LinearLayout linearLayout = this.E;
        v1 v1Var = new v1(i7, linearLayout.getContext(), this.f22059b);
        v1Var.c(j6.f28849d6);
        if (z10) {
            v1Var.d();
            this.W.add(v1Var);
        }
        v1Var.setTag(Integer.valueOf(i10));
        v1Var.setContentDescription(z1.l0(i10));
        v1Var.setOnClickListener(new t3(this, i10, 1));
        this.U.add(v1Var);
        if (linearLayout.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout.addView(v1Var, ja.t(38, 38, 16, i11, 0, 0, 0));
    }

    public final void b(int i7, int i10, boolean z10) {
        int i11;
        v1 v1Var = new v1(i7, getContext(), this.f22059b);
        v1Var.c(j6.Pl);
        if (z10) {
            v1Var.d();
            this.W.add(v1Var);
        }
        v1Var.setTag(Integer.valueOf(i10));
        v1Var.setContentDescription(z1.n0(i10));
        v1Var.setOnClickListener(new t3(this, i10, 0));
        this.V.add(v1Var);
        LinearLayout linearLayout = this.K;
        if (linearLayout.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout.addView(v1Var, ja.t(38, 38, 16, i11, 0, 0, 0));
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
        if (this.f22063d0 != z10 || !z11) {
            this.f22063d0 = z10;
            if (z10) {
                f10 = 1.15f;
            } else {
                f10 = 1.0f;
            }
            fh0 fh0Var = this.J;
            if (z11) {
                fh0Var.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(er.h).start();
            } else {
                fh0Var.animate().cancel();
                fh0Var.setScaleX(f10);
                fh0Var.setScaleY(f10);
            }
            if (z10) {
                i7 = j6.f29090q7;
            } else {
                i7 = j6.G6;
            }
            fh0Var.setColorFilter(new PorterDuffColorFilter(j6.w0(i7, this.f22059b), PorterDuff.Mode.SRC_IN));
            ch0 animatedDrawable = fh0Var.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f33573b0 > 34) {
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
        this.f22068g0.add(view);
        this.f22069h0.add(drawable);
        this.f22070i0.add(Integer.valueOf(i7));
        e6 e6Var = this.f22059b;
        this.f22071j0.add(Integer.valueOf(j6.w0(i7, e6Var)));
        if (drawable instanceof RippleDrawable) {
            i10 = j6.w(j6.w0(i7, e6Var), j6.w0(j6.f28941i6, e6Var));
        } else {
            i10 = 0;
        }
        this.f22072k0.add(Integer.valueOf(i10));
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
        if (this.f22060b0 == i7) {
            return;
        }
        this.f22060b0 = i7;
        FrameLayout frameLayout = this.I;
        int i12 = 0;
        z51 z51Var = this.H;
        LinearLayout linearLayout = this.f22080x;
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
            er erVar = er.h;
            duration.setInterpolator(erVar).withEndAction(new Runnable(this) {
                public final v3 f21992b;

                {
                    this.f21992b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            v3 v3Var = this.f21992b;
                            if (v3Var.f22060b0 != 0) {
                                v3Var.f22080x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            v3 v3Var2 = this.f21992b;
                            if (v3Var2.f22060b0 != 1) {
                                v3Var2.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            v3 v3Var3 = this.f21992b;
                            if (v3Var3.f22060b0 != 2) {
                                v3Var3.I.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            z51Var.setVisibility(0);
            ViewPropertyAnimator animate2 = z51Var.animate();
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
            scaleY2.translationY(L4).setDuration(420L).setInterpolator(erVar).withEndAction(new Runnable(this) {
                public final v3 f21992b;

                {
                    this.f21992b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            v3 v3Var = this.f21992b;
                            if (v3Var.f22060b0 != 0) {
                                v3Var.f22080x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            v3 v3Var2 = this.f21992b;
                            if (v3Var2.f22060b0 != 1) {
                                v3Var2.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            v3 v3Var3 = this.f21992b;
                            if (v3Var3.f22060b0 != 2) {
                                v3Var3.I.setVisibility(8);
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
            scaleX3.scaleY(f25).setDuration(420L).setInterpolator(erVar).withEndAction(new Runnable(this) {
                public final v3 f21992b;

                {
                    this.f21992b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            v3 v3Var = this.f21992b;
                            if (v3Var.f22060b0 != 0) {
                                v3Var.f22080x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            v3 v3Var2 = this.f21992b;
                            if (v3Var2.f22060b0 != 1) {
                                v3Var2.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            v3 v3Var3 = this.f21992b;
                            if (v3Var3.f22060b0 != 2) {
                                v3Var3.I.setVisibility(8);
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
        z51Var.setVisibility(i11);
        if (i7 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        z51Var.setAlpha(f13);
        if (i7 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        z51Var.setScaleX(f14);
        if (i7 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        z51Var.setScaleY(f15);
        if (i7 == 1) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.g0.L(30.0f);
        }
        z51Var.setTranslationY(L2);
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
        return this.f22078s;
    }

    public FrameLayout getBottomInnerContainer() {
        return this.f22079w;
    }

    public LinearLayout getBottomPanel() {
        return this.f22080x;
    }

    public View getEmojiButton() {
        return this.f22081y;
    }

    public jg getSendButton() {
        return this.G;
    }

    public void setBackVisible(boolean z10) {
        int i7;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f22066f.setVisibility(i7);
    }

    public void setBottomGradientTranslationY(float f10) {
        this.d.setTranslationY(f10);
    }

    public void setEmojiOpened(boolean z10) {
        ng ngVar;
        String str;
        if (z10) {
            ngVar = ng.d;
        } else {
            ngVar = ng.f37583e;
        }
        pg pgVar = this.f22081y;
        pgVar.j(ngVar, true);
        if (z10) {
            str = "Keyboard";
        } else {
            str = "Emoji";
        }
        pgVar.setContentDescription(str);
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
            i7 = 2131231501;
        } else {
            i7 = 2131232695;
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
        i20.m(animate, f10, 150L);
    }

    public void setSendLoading(boolean z10) {
        if (this.f22058a0 == z10) {
            return;
        }
        this.f22058a0 = z10;
        this.G.invalidate();
    }

    public void setTopButtonsOffset(int i7) {
        LinearLayout linearLayout = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.topMargin != i7) {
            layoutParams.topMargin = i7;
            linearLayout.setLayoutParams(layoutParams);
        }
        ImageView imageView = this.f22066f;
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
        this.f22061c.setVisibility(i7);
    }

    public void setTopPanelVisible(boolean z10) {
        int i7;
        int i10 = 8;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f22064e.setVisibility(i7);
        if (z10) {
            i10 = 0;
        }
        this.f22061c.setVisibility(i10);
    }

    @Override
    public final void updateColors() {
        throw new UnsupportedOperationException("Method not decompiled: oi.v3.updateColors():void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
