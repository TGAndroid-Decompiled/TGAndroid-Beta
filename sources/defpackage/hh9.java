package defpackage;

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
import org.telegram.tgnet.tl.TL_iv;
public final class hh9 extends FrameLayout implements vlb {
    public final LinearLayout E;
    public final ImageView F;
    public final vi3 G;
    public final qmb H;
    public final FrameLayout I;
    public final s09 J;
    public final LinearLayout K;
    public int L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final LinearLayout O;
    public final ff9 P;
    public final ff9 Q;
    public final ff9 R;
    public final ff9 S;
    public final ff9 T;
    public final ArrayList U;
    public final ArrayList V;
    public final ArrayList W;
    public final l82 a;
    public boolean a0;
    public final ylb b;
    public int b0;
    public final View c;
    public int c0;
    public final View d;
    public boolean d0;
    public final FrameLayout e;
    public final GradientDrawable e0;
    public final ImageView f;
    public final GradientDrawable f0;
    public final ArrayList g0;
    public final LinearLayout h;
    public final ArrayList h0;
    public final ArrayList i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public int l0;
    public boolean m0;
    public final ImageView n;
    public int n0;
    public boolean o0;
    public final ImageView r;
    public final FrameLayout s;
    public final FrameLayout w;
    public final LinearLayout x;
    public final d02 y;

    public hh9(Context context, final l82 l82Var) {
        super(context);
        int i;
        int i2;
        this.L = Integer.MAX_VALUE;
        this.U = new ArrayList();
        this.V = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.W = arrayList;
        this.b0 = -1;
        this.c0 = 0;
        this.g0 = new ArrayList();
        this.h0 = new ArrayList();
        this.i0 = new ArrayList();
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        this.a = l82Var;
        ylb ylbVar = l82Var.a.a;
        this.b = ylbVar;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i3 = cmb.c6;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{cmb.v0(i3, ylbVar), cmb.p1(0.0f, cmb.v0(i3, ylbVar))});
        this.e0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, qoe.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{cmb.p1(0.0f, cmb.v0(i3, ylbVar)), cmb.v0(i3, ylbVar)});
        this.f0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        addView(view2, qoe.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, qoe.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(2131231244);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i4 = cmb.Ol;
        int v0 = cmb.v0(i4, ylbVar);
        int v02 = cmb.v0(i4, ylbVar);
        int i5 = cmb.h6;
        fg0 Z = cmb.Z(v0, cmb.v(v02, cmb.v0(i5, ylbVar)), gm.L(22.0f), gm.L(22.0f));
        f(imageView, i4, Z);
        imageView.setBackground(new if9(Z));
        int i6 = cmb.F6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        anb.s(imageView, i6, ylbVar, mode);
        rve.a(imageView);
        imageView.setContentDescription(jb6.M0(2131754878, null));
        imageView.setOnClickListener(new x10(l82Var, (byte) 14));
        frameLayout.addView(imageView, qoe.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        ShapeDrawable b0 = cmb.b0(gm.L(22.0f), cmb.v0(i4, ylbVar));
        f(linearLayout, i4, b0);
        linearLayout.setBackground(new if9(b0));
        frameLayout.addView(linearLayout, qoe.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.n = imageView2;
        imageView2.setImageResource(2131231603);
        imageView2.setScaleType(scaleType);
        fg0 f0 = cmb.f0(cmb.v0(i5, ylbVar), 1, -1);
        wmb M = anb.M(i5);
        imageView2.setBackground(f0);
        anb.j(imageView2, f0, null, M, ylbVar);
        anb.s(imageView2, i6, ylbVar, mode);
        rve.a(imageView2);
        imageView2.setContentDescription("Undo");
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                l82 l82Var2 = l82Var;
                switch (b) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        return;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        l82Var2.a.r.a4();
                        return;
                    case 3:
                        l82Var2.a.r.X3();
                        return;
                    case 4:
                        l82Var2.a.r.b4();
                        return;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        return;
                    case 10:
                        l82Var2.a.Y();
                        return;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView2, qoe.r(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.r = imageView3;
        imageView3.setImageResource(2131231586);
        imageView3.setScaleType(scaleType);
        fg0 f02 = cmb.f0(cmb.v0(i5, ylbVar), 1, -1);
        wmb M2 = anb.M(i5);
        imageView3.setBackground(f02);
        anb.j(imageView3, f02, null, M2, ylbVar);
        anb.s(imageView3, i6, ylbVar, mode);
        rve.a(imageView3);
        imageView3.setContentDescription("Redo");
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                l82 l82Var2 = l82Var;
                switch (b) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        return;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        l82Var2.a.r.a4();
                        return;
                    case 3:
                        l82Var2.a.r.X3();
                        return;
                    case 4:
                        l82Var2.a.r.b4();
                        return;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        return;
                    case 10:
                        l82Var2.a.Y();
                        return;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView3, qoe.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, qoe.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.w = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, qoe.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.x = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        frameLayout3.addView(linearLayout2, qoe.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new hd(context));
        imageView4.setScaleType(scaleType);
        anb.s(imageView4, i6, ylbVar, mode);
        fg0 Z2 = cmb.Z(cmb.v0(i4, ylbVar), cmb.v(cmb.v0(i4, ylbVar), cmb.v0(i5, ylbVar)), gm.L(22.0f), gm.L(22.0f));
        f(imageView4, i4, Z2);
        imageView4.setBackground(new if9(Z2));
        linearLayout2.addView(imageView4, qoe.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        rve.a(imageView4);
        imageView4.setContentDescription("AI");
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                l82 l82Var2 = l82Var;
                switch (b) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        return;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        l82Var2.a.r.a4();
                        return;
                    case 3:
                        l82Var2.a.r.X3();
                        return;
                    case 4:
                        l82Var2.a.r.b4();
                        return;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        return;
                    case 10:
                        l82Var2.a.Y();
                        return;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        return;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        ShapeDrawable b02 = cmb.b0(gm.L(22.0f), cmb.v0(i3, ylbVar));
        f(frameLayout5, i3, b02);
        frameLayout5.setBackground(new if9(b02));
        frameLayout4.addView(frameLayout5, qoe.e(-2, 44, 81));
        df9 df9Var = new df9(context, (byte) 1);
        df9Var.setClipToOutline(true);
        df9Var.setOutlineProvider(new xj((byte) 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        linearLayout3.setOrientation(0);
        df9Var.addView(linearLayout3);
        frameLayout5.addView(df9Var, qoe.c(-1.0f, -1));
        d02 d02Var = new d02(context, 24);
        this.y = d02Var;
        d02Var.setPadding(gm.L(7.0f), gm.L(7.0f), gm.L(7.0f), gm.L(7.0f));
        anb.s(d02Var, i6, ylbVar, mode);
        fg0 Z3 = cmb.Z(cmb.v0(i3, ylbVar), cmb.v0(i5, ylbVar), gm.L(20.0f), gm.L(20.0f));
        wmb M3 = anb.M(i3);
        wmb M4 = anb.M(i5);
        d02Var.setBackground(Z3);
        anb.j(d02Var, Z3, M3, M4, ylbVar);
        d02Var.j(b02.e, false);
        linearLayout3.addView(d02Var, qoe.r(38, 38, 16));
        rve.a(d02Var);
        d02Var.setContentDescription("Emoji");
        d02Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                l82 l82Var2 = l82Var;
                switch (b) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        return;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        l82Var2.a.r.a4();
                        return;
                    case 3:
                        l82Var2.a.r.X3();
                        return;
                    case 4:
                        l82Var2.a.r.b4();
                        return;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        return;
                    case 10:
                        l82Var2.a.Y();
                        return;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        return;
                }
            }
        });
        a(2131231600, 1, false);
        a(2131231572, 2, true);
        a(2131231589, 4, true);
        a(2131231574, 7, true);
        ImageView imageView5 = new ImageView(context);
        this.F = imageView5;
        imageView5.setImageResource(2131232506);
        imageView5.setScaleType(scaleType);
        anb.s(imageView5, i6, ylbVar, mode);
        fg0 Z4 = cmb.Z(cmb.v0(i3, ylbVar), cmb.v0(i5, ylbVar), gm.L(20.0f), gm.L(20.0f));
        wmb M5 = anb.M(i3);
        wmb M6 = anb.M(i5);
        imageView5.setBackground(Z4);
        anb.j(imageView5, Z4, M5, M6, ylbVar);
        linearLayout3.addView(imageView5, qoe.t(38, 38, 16, 2, 0, 0, 0));
        rve.a(imageView5);
        imageView5.setContentDescription("Attach");
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                l82 l82Var2 = l82Var;
                switch (b) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        return;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        l82Var2.a.r.a4();
                        return;
                    case 3:
                        l82Var2.a.r.X3();
                        return;
                    case 4:
                        l82Var2.a.r.b4();
                        return;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        return;
                    case 10:
                        l82Var2.a.Y();
                        return;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        return;
                }
            }
        });
        linearLayout2.addView(frameLayout4, qoe.l(1.0f, 0, 44));
        qmb qmbVar = new qmb((byte) 14, context, this);
        this.H = qmbVar;
        qmbVar.setOrientation(0);
        qmbVar.setClipToPadding(false);
        qmbVar.setClipChildren(false);
        qmbVar.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        frameLayout2.addView(qmbVar, qoe.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.I = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        frameLayout2.addView(frameLayout6, qoe.e(80, 60, 81));
        ?? imageView6 = new ImageView(context);
        this.J = imageView6;
        imageView6.f(2131624043, gm.L(16.0f), gm.L(16.0f), null);
        p09 animatedDrawable = imageView6.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.F(0);
            animatedDrawable.K(0);
        }
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(cmb.v0(i6, ylbVar), mode));
        ShapeDrawable b03 = cmb.b0(gm.L(22.0f), cmb.v0(i4, ylbVar));
        f(imageView6, i4, b03);
        imageView6.setBackground(new if9(b03));
        frameLayout6.addView((View) imageView6, qoe.e(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        ShapeDrawable b04 = cmb.b0(gm.L(22.0f), cmb.v0(i4, ylbVar));
        f(frameLayout7, i4, b04);
        frameLayout7.setBackground(new if9(b04));
        qmbVar.addView(frameLayout7, qoe.c(44.0f, -2));
        gh9 gh9Var = new gh9(this, context, (byte) 0);
        gh9Var.setHorizontalScrollBarEnabled(false);
        gh9Var.setClipToOutline(true);
        gh9Var.setOutlineProvider(new xj((byte) 17));
        frameLayout7.addView(gh9Var, qoe.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.K = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        gh9Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(2131231203, 1, false);
        b(2131231205, 2, false);
        b(2131231211, 16, false);
        b(2131231210, 8, false);
        b(2131231209, 256, false);
        b(2131231556, 4, false);
        b(2131231587, 16384, true);
        b(2131231588, 32768, true);
        ff9 ff9Var = new ff9(2131231585, ylbVar, context);
        this.T = ff9Var;
        ff9Var.c(i4);
        ff9Var.setContentDescription(jb6.M0(2131746173, null));
        ff9Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                l82 l82Var2 = l82Var;
                switch (b) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        return;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        l82Var2.a.r.a4();
                        return;
                    case 3:
                        l82Var2.a.r.X3();
                        return;
                    case 4:
                        l82Var2.a.r.b4();
                        return;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        return;
                    case 10:
                        l82Var2.a.Y();
                        return;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        return;
                }
            }
        });
        if (linearLayout4.getChildCount() == 0) {
            i = 0;
        } else {
            i = 2;
        }
        linearLayout4.addView(ff9Var, qoe.t(38, 38, 16, i, 0, 0, 0));
        ff9 ff9Var2 = new ff9(2131231553, ylbVar, context);
        this.Q = ff9Var2;
        ff9Var2.c(i4);
        ff9Var2.setContentDescription(jb6.M0(2131745744, null));
        ff9Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                l82 l82Var2 = l82Var;
                switch (b) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        return;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        l82Var2.a.r.a4();
                        return;
                    case 3:
                        l82Var2.a.r.X3();
                        return;
                    case 4:
                        l82Var2.a.r.b4();
                        return;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        return;
                    case 10:
                        l82Var2.a.Y();
                        return;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        return;
                }
            }
        });
        if (linearLayout4.getChildCount() == 0) {
            i2 = 0;
        } else {
            i2 = 2;
        }
        linearLayout4.addView(ff9Var2, qoe.t(38, 38, 16, i2, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.N = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        ShapeDrawable b05 = cmb.b0(gm.L(22.0f), cmb.v0(i4, ylbVar));
        f(linearLayout5, i4, b05);
        linearLayout5.setBackground(new if9(b05));
        qmbVar.addView(linearLayout5, qoe.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        ff9 ff9Var3 = new ff9(2131231750, ylbVar, context);
        this.P = ff9Var3;
        ff9Var3.c(i4);
        ff9Var3.setContentDescription(jb6.M0(2131751681, null));
        ff9Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                l82 l82Var2 = l82Var;
                switch (b) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        return;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        l82Var2.a.r.a4();
                        return;
                    case 3:
                        l82Var2.a.r.X3();
                        return;
                    case 4:
                        l82Var2.a.r.b4();
                        return;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        return;
                    case 10:
                        l82Var2.a.Y();
                        return;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(ff9Var3, qoe.r(38, 38, 16));
        ff9 ff9Var4 = new ff9(2131232083, ylbVar, context);
        this.R = ff9Var4;
        ff9Var4.c(i4);
        ff9Var4.setContentDescription(jb6.M0(2131754861, null));
        ff9Var4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                l82 l82Var2 = l82Var;
                switch (b) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        return;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        l82Var2.a.r.a4();
                        return;
                    case 3:
                        l82Var2.a.r.X3();
                        return;
                    case 4:
                        l82Var2.a.r.b4();
                        return;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        return;
                    case 10:
                        l82Var2.a.Y();
                        return;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(ff9Var4, qoe.r(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.O = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        ShapeDrawable b06 = cmb.b0(gm.L(22.0f), cmb.v0(i4, ylbVar));
        f(linearLayout6, i4, b06);
        linearLayout6.setBackground(new if9(b06));
        qmbVar.addView(linearLayout6, qoe.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        ff9 ff9Var5 = new ff9(2131231574, ylbVar, context);
        this.S = ff9Var5;
        ff9Var5.c(i4);
        ff9Var5.d();
        arrayList.add(ff9Var5);
        ff9Var5.setContentDescription(jb6.M0(2131754863, null));
        ff9Var5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                l82 l82Var2 = l82Var;
                switch (b) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        return;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        l82Var2.a.r.a4();
                        return;
                    case 3:
                        l82Var2.a.r.X3();
                        return;
                    case 4:
                        l82Var2.a.r.b4();
                        return;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        return;
                    case 10:
                        l82Var2.a.Y();
                        return;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        return;
                }
            }
        });
        linearLayout6.addView(ff9Var5, qoe.r(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.M = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        ShapeDrawable b07 = cmb.b0(gm.L(22.0f), cmb.v0(i4, ylbVar));
        f(linearLayout7, i4, b07);
        linearLayout7.setBackground(new if9(b07));
        qmbVar.addView(linearLayout7, 0, qoe.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        ff9 ff9Var6 = new ff9(2131231497, ylbVar, context);
        ff9Var6.setImageDrawable(new hd(context));
        ff9Var6.c(i4);
        ff9Var6.setContentDescription(jb6.M0(2131755006, null));
        ff9Var6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                l82 l82Var2 = l82Var;
                switch (b) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        return;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        l82Var2.a.r.a4();
                        return;
                    case 3:
                        l82Var2.a.r.X3();
                        return;
                    case 4:
                        l82Var2.a.r.b4();
                        return;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        return;
                    case 10:
                        l82Var2.a.Y();
                        return;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        return;
                }
            }
        });
        linearLayout7.addView(ff9Var6, qoe.r(38, 38, 16));
        vi3 vi3Var = new vi3(this, context, ylbVar);
        this.G = vi3Var;
        int i7 = cmb.Oe;
        ShapeDrawable b08 = cmb.b0(gm.L(22.0f), cmb.v0(i7, ylbVar));
        f(vi3Var, i7, b08);
        vi3Var.setBackground(new if9(b08));
        rve.a(vi3Var);
        linearLayout2.addView(vi3Var, qoe.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        vi3Var.setContentDescription("Send");
        vi3Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                l82 l82Var2 = l82Var;
                switch (b) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        return;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        l82Var2.a.r.a4();
                        return;
                    case 3:
                        l82Var2.a.r.X3();
                        return;
                    case 4:
                        l82Var2.a.r.b4();
                        return;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        return;
                    case 10:
                        l82Var2.a.Y();
                        return;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        return;
                }
            }
        });
        vi3Var.setOnLongClickListener(new au(l82Var, (byte) 14));
        g(0, false);
    }

    public final void a(int i, int i2, boolean z) {
        int i3;
        LinearLayout linearLayout = this.E;
        ff9 ff9Var = new ff9(i, this.b, linearLayout.getContext());
        ff9Var.c(cmb.c6);
        if (z) {
            ff9Var.d();
            this.W.add(ff9Var);
        }
        ff9Var.setTag(Integer.valueOf(i2));
        ff9Var.setContentDescription(jf9.d0(i2));
        ff9Var.setOnClickListener(new hb(this, i2, (byte) 6));
        this.U.add(ff9Var);
        if (linearLayout.getChildCount() == 0) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        linearLayout.addView(ff9Var, qoe.t(38, 38, 16, i3, 0, 0, 0));
    }

    public final void b(int i, final int i2, boolean z) {
        int i3;
        ff9 ff9Var = new ff9(i, this.b, getContext());
        ff9Var.c(cmb.Ol);
        if (z) {
            ff9Var.d();
            this.W.add(ff9Var);
        }
        ff9Var.setTag(Integer.valueOf(i2));
        ff9Var.setContentDescription(jf9.f0(i2));
        ff9Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                hh9.this.a.a.r.Y3(i2);
            }
        });
        this.V.add(ff9Var);
        LinearLayout linearLayout = this.K;
        if (linearLayout.getChildCount() == 0) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        linearLayout.addView(ff9Var, qoe.t(38, 38, 16, i3, 0, 0, 0));
    }

    public final void c(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ff9 ff9Var = (ff9) obj;
            int intValue = ((Integer) ff9Var.getTag()).intValue();
            if ((i & intValue) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            ff9Var.setSelected(z6);
            if (intValue == 1 || intValue == 2) {
                ff9Var.setEnabled(z5);
            }
        }
        ff9 ff9Var2 = this.P;
        ff9Var2.setSelected(z);
        ff9 ff9Var3 = this.R;
        ff9Var3.setSelected(z2);
        ff9Var2.setEnabled(z3);
        this.Q.setEnabled(z4);
        ff9Var3.setEnabled(z3);
        this.S.setEnabled(z3);
    }

    public final void d(int i, int i2) {
        boolean z;
        ArrayList arrayList = this.U;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ff9 ff9Var = (ff9) obj;
            if (i == ((Integer) ff9Var.getTag()).intValue()) {
                z = true;
            } else {
                z = false;
            }
            ff9Var.setSelected(z);
            if (z && i2 != 0) {
                ff9Var.e(i2);
            } else {
                ff9Var.a();
            }
        }
    }

    public final void e(boolean z, boolean z2) {
        float f;
        int i;
        if (this.d0 != z || !z2) {
            this.d0 = z;
            if (z) {
                f = 1.15f;
            } else {
                f = 1.0f;
            }
            s09 s09Var = this.J;
            if (z2) {
                s09Var.animate().scaleX(f).scaleY(f).setDuration(180L).setInterpolator(d53.h).start();
            } else {
                s09Var.animate().cancel();
                s09Var.setScaleX(f);
                s09Var.setScaleY(f);
            }
            if (z) {
                i = cmb.p7;
            } else {
                i = cmb.F6;
            }
            s09Var.setColorFilter(new PorterDuffColorFilter(cmb.v0(i, this.b), PorterDuff.Mode.SRC_IN));
            p09 animatedDrawable = s09Var.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z) {
                    if (animatedDrawable.b0 > 34) {
                        animatedDrawable.I(0, false, false);
                    }
                    animatedDrawable.K(33);
                } else {
                    animatedDrawable.K(0);
                }
                animatedDrawable.start();
            }
        }
    }

    public final void f(View view, int i, Drawable drawable) {
        int i2;
        this.g0.add(view);
        this.h0.add(drawable);
        this.i0.add(Integer.valueOf(i));
        ylb ylbVar = this.b;
        this.j0.add(Integer.valueOf(cmb.v0(i, ylbVar)));
        if (drawable instanceof RippleDrawable) {
            i2 = cmb.v(cmb.v0(i, ylbVar), cmb.v0(cmb.h6, ylbVar));
        } else {
            i2 = 0;
        }
        this.k0.add(Integer.valueOf(i2));
    }

    public final void g(int i, boolean z) {
        int i2;
        float f;
        float f2;
        float f3;
        float L;
        int i3;
        float f4;
        float f5;
        float f6;
        float L2;
        float f7;
        float f8;
        float f9;
        float f10;
        float L3;
        float f11;
        float f12;
        float f13;
        float L4;
        float f14;
        if (this.b0 == i) {
            return;
        }
        this.b0 = i;
        FrameLayout frameLayout = this.I;
        int i4 = 0;
        LinearLayout linearLayout = this.x;
        qmb qmbVar = this.H;
        float f15 = 0.0f;
        float f16 = 0.8f;
        if (z) {
            linearLayout.setVisibility(0);
            ViewPropertyAnimator animate = linearLayout.animate();
            if (i == 0) {
                f8 = 1.0f;
            } else {
                f8 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f8);
            if (i == 0) {
                f9 = 1.0f;
            } else {
                f9 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f9);
            if (i == 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.8f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
            if (i == 0) {
                L3 = 0.0f;
            } else {
                L3 = gm.L(30.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationY(L3).setDuration(420L);
            d53 d53Var = d53.h;
            duration.setInterpolator(d53Var).withEndAction(new Runnable(this) {
                public final hh9 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r2;
                    hh9 hh9Var = this.b;
                    switch (b) {
                        case 0:
                            if (hh9Var.b0 != 0) {
                                hh9Var.x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            if (hh9Var.b0 != 1) {
                                hh9Var.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (hh9Var.b0 != 2) {
                                hh9Var.I.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            qmbVar.setVisibility(0);
            ViewPropertyAnimator animate2 = qmbVar.animate();
            if (i == 1) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f11);
            if (i == 1) {
                f12 = 1.0f;
            } else {
                f12 = 0.8f;
            }
            ViewPropertyAnimator scaleX2 = alpha2.scaleX(f12);
            if (i == 1) {
                f13 = 1.0f;
            } else {
                f13 = 0.8f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f13);
            if (i == 1) {
                L4 = 0.0f;
            } else {
                L4 = gm.L(30.0f);
            }
            scaleY2.translationY(L4).setDuration(420L).setInterpolator(d53Var).withEndAction(new Runnable(this) {
                public final hh9 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r2;
                    hh9 hh9Var = this.b;
                    switch (b) {
                        case 0:
                            if (hh9Var.b0 != 0) {
                                hh9Var.x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            if (hh9Var.b0 != 1) {
                                hh9Var.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (hh9Var.b0 != 2) {
                                hh9Var.I.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate3 = frameLayout.animate();
            if (i == 2) {
                f15 = 1.0f;
            }
            ViewPropertyAnimator alpha3 = animate3.alpha(f15);
            if (i == 2) {
                f14 = 1.0f;
            } else {
                f14 = 0.8f;
            }
            ViewPropertyAnimator scaleX3 = alpha3.scaleX(f14);
            if (i == 2) {
                f16 = 1.0f;
            }
            scaleX3.scaleY(f16).setDuration(420L).setInterpolator(d53Var).withEndAction(new Runnable(this) {
                public final hh9 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r2;
                    hh9 hh9Var = this.b;
                    switch (b) {
                        case 0:
                            if (hh9Var.b0 != 0) {
                                hh9Var.x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            if (hh9Var.b0 != 1) {
                                hh9Var.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (hh9Var.b0 != 2) {
                                hh9Var.I.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
        if (i == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        linearLayout.setAlpha(f);
        if (i == 0) {
            f2 = 1.0f;
        } else {
            f2 = 0.8f;
        }
        linearLayout.setScaleX(f2);
        if (i == 0) {
            f3 = 1.0f;
        } else {
            f3 = 0.8f;
        }
        linearLayout.setScaleY(f3);
        if (i == 0) {
            L = 0.0f;
        } else {
            L = gm.L(30.0f);
        }
        linearLayout.setTranslationY(L);
        if (i == 1) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        qmbVar.setVisibility(i3);
        if (i == 1) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        qmbVar.setAlpha(f4);
        if (i == 1) {
            f5 = 1.0f;
        } else {
            f5 = 0.8f;
        }
        qmbVar.setScaleX(f5);
        if (i == 1) {
            f6 = 1.0f;
        } else {
            f6 = 0.8f;
        }
        qmbVar.setScaleY(f6);
        if (i == 1) {
            L2 = 0.0f;
        } else {
            L2 = gm.L(30.0f);
        }
        qmbVar.setTranslationY(L2);
        if (i != 2) {
            i4 = 8;
        }
        frameLayout.setVisibility(i4);
        if (i == 2) {
            f15 = 1.0f;
        }
        frameLayout.setAlpha(f15);
        if (i == 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.8f;
        }
        frameLayout.setScaleX(f7);
        if (i == 2) {
            f16 = 1.0f;
        }
        frameLayout.setScaleY(f16);
    }

    public ImageView getAddButton() {
        return this.F;
    }

    public FrameLayout getBottomContainer() {
        return this.s;
    }

    public FrameLayout getBottomInnerContainer() {
        return this.w;
    }

    public LinearLayout getBottomPanel() {
        return this.x;
    }

    public View getEmojiButton() {
        return this.y;
    }

    public xz1 getSendButton() {
        return this.G;
    }

    public void setBackVisible(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.f.setVisibility(i);
    }

    public void setBottomGradientTranslationY(float f) {
        this.d.setTranslationY(f);
    }

    public void setEmojiOpened(boolean z) {
        b02 b02Var;
        String str;
        if (z) {
            b02Var = b02.d;
        } else {
            b02Var = b02.e;
        }
        d02 d02Var = this.y;
        d02Var.j(b02Var, true);
        if (z) {
            str = "Keyboard";
        } else {
            str = "Emoji";
        }
        d02Var.setContentDescription(str);
    }

    public void setPremiumLocked(boolean z) {
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ff9) obj).setPremiumLocked(z);
        }
    }

    public void setQuoteState(boolean z) {
        this.T.setSelected(z);
    }

    public void setSelectedBlockType(int i) {
        d(i, 0);
    }

    public void setSendEditing(boolean z) {
        int i;
        if (z) {
            i = 2131231506;
        } else {
            i = 2131232711;
        }
        this.G.setResourceId(i);
    }

    public void setSendEnabled(boolean z) {
        float f;
        vi3 vi3Var = this.G;
        if (vi3Var.isEnabled() == z) {
            return;
        }
        vi3Var.setEnabled(z);
        ViewPropertyAnimator animate = vi3Var.animate();
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        wi8.s(animate, f, 150L);
    }

    public void setSendLoading(boolean z) {
        if (this.a0 == z) {
            return;
        }
        this.a0 = z;
        this.G.invalidate();
    }

    public void setTopButtonsOffset(int i) {
        LinearLayout linearLayout = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.topMargin != i) {
            layoutParams.topMargin = i;
            linearLayout.setLayoutParams(layoutParams);
        }
        ImageView imageView = this.f;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        if (layoutParams2.topMargin != i) {
            layoutParams2.topMargin = i;
            imageView.setLayoutParams(layoutParams2);
        }
    }

    public void setTopGradientVisible(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.c.setVisibility(i);
    }

    public void setTopPanelVisible(boolean z) {
        int i;
        int i2 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.e.setVisibility(i);
        if (z) {
            i2 = 0;
        }
        this.c.setVisibility(i2);
    }

    @Override
    public final void updateColors() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh9.updateColors():void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
