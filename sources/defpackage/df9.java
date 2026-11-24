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
public final class df9 extends FrameLayout implements tjb {
    public final LinearLayout E;
    public final ImageView F;
    public final jh3 G;
    public final pkb H;
    public final FrameLayout I;
    public final ry8 J;
    public final LinearLayout K;
    public int L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final LinearLayout O;
    public final dd9 P;
    public final dd9 Q;
    public final dd9 R;
    public final dd9 S;
    public final dd9 T;
    public final ArrayList U;
    public final ArrayList V;
    public final ArrayList W;
    public final a72 a;
    public boolean a0;
    public final wjb b;
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
    public final qy1 y;

    public df9(Context context, final a72 a72Var) {
        super(context);
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
        this.a = a72Var;
        wjb wjbVar = a72Var.a.a;
        this.b = wjbVar;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i = bkb.c6;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{bkb.v0(i, wjbVar), bkb.p1(0.0f, bkb.v0(i, wjbVar))});
        this.e0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, nme.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{bkb.p1(0.0f, bkb.v0(i, wjbVar)), bkb.v0(i, wjbVar)});
        this.f0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        addView(view2, nme.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, nme.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(2131231243);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i2 = bkb.Ol;
        int v0 = bkb.v0(i2, wjbVar);
        int v02 = bkb.v0(i2, wjbVar);
        int i3 = bkb.h6;
        ff0 Z = bkb.Z(v0, bkb.v(v02, bkb.v0(i3, wjbVar)), gl.L(22.0f), gl.L(22.0f));
        f(imageView, i2, Z);
        imageView.setBackground(new gd9(Z));
        int i4 = bkb.F6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        zkb.s(imageView, i4, wjbVar, mode);
        ote.a(imageView);
        imageView.setContentDescription(k96.M0(2131754878, null));
        imageView.setOnClickListener(new x00(a72Var, (byte) 14));
        frameLayout.addView(imageView, nme.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        ShapeDrawable b0 = bkb.b0(gl.L(22.0f), bkb.v0(i2, wjbVar));
        f(linearLayout, i2, b0);
        linearLayout.setBackground(new gd9(b0));
        frameLayout.addView(linearLayout, nme.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.n = imageView2;
        imageView2.setImageResource(2131231602);
        imageView2.setScaleType(scaleType);
        ff0 f0 = bkb.f0(bkb.v0(i3, wjbVar), 1, -1);
        vkb M = zkb.M(i3);
        imageView2.setBackground(f0);
        zkb.j(imageView2, f0, null, M, wjbVar);
        zkb.s(imageView2, i4, wjbVar, mode);
        ote.a(imageView2);
        imageView2.setContentDescription("Undo");
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                a72 a72Var2 = a72Var;
                switch (b) {
                    case 0:
                        e72 e72Var = a72Var2.a;
                        e72Var.r.T4();
                        e72Var.b0();
                        return;
                    case 1:
                        a72Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        a72Var2.a.r.a4();
                        return;
                    case 3:
                        a72Var2.a.r.X3();
                        return;
                    case 4:
                        a72Var2.a.r.b4();
                        return;
                    case 5:
                        e72 e72Var2 = a72Var2.a;
                        pe9 c2 = e72Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(e72Var2.getContext(), e72Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new be2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        a72Var2.a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ld9 ld9Var = a72Var2.a.r.R3;
                        if (ld9Var != null) {
                            ld9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ld9 ld9Var2 = a72Var2.a.r.R3;
                        if (ld9Var2 != null) {
                            ld9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        e72 e72Var3 = a72Var2.a;
                        new gb9(e72Var3.n, e72Var3.a, new be2(a72Var2, (byte) 21), e72Var3.getContext()).show();
                        return;
                    case 10:
                        a72Var2.a.Y();
                        return;
                    default:
                        e72 e72Var4 = a72Var2.a;
                        e72Var4.r.j4 = null;
                        e72Var4.T(90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView2, nme.r(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.r = imageView3;
        imageView3.setImageResource(2131231585);
        imageView3.setScaleType(scaleType);
        ff0 f02 = bkb.f0(bkb.v0(i3, wjbVar), 1, -1);
        vkb M2 = zkb.M(i3);
        imageView3.setBackground(f02);
        zkb.j(imageView3, f02, null, M2, wjbVar);
        zkb.s(imageView3, i4, wjbVar, mode);
        ote.a(imageView3);
        imageView3.setContentDescription("Redo");
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                a72 a72Var2 = a72Var;
                switch (b) {
                    case 0:
                        e72 e72Var = a72Var2.a;
                        e72Var.r.T4();
                        e72Var.b0();
                        return;
                    case 1:
                        a72Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        a72Var2.a.r.a4();
                        return;
                    case 3:
                        a72Var2.a.r.X3();
                        return;
                    case 4:
                        a72Var2.a.r.b4();
                        return;
                    case 5:
                        e72 e72Var2 = a72Var2.a;
                        pe9 c2 = e72Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(e72Var2.getContext(), e72Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new be2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        a72Var2.a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ld9 ld9Var = a72Var2.a.r.R3;
                        if (ld9Var != null) {
                            ld9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ld9 ld9Var2 = a72Var2.a.r.R3;
                        if (ld9Var2 != null) {
                            ld9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        e72 e72Var3 = a72Var2.a;
                        new gb9(e72Var3.n, e72Var3.a, new be2(a72Var2, (byte) 21), e72Var3.getContext()).show();
                        return;
                    case 10:
                        a72Var2.a.Y();
                        return;
                    default:
                        e72 e72Var4 = a72Var2.a;
                        e72Var4.r.j4 = null;
                        e72Var4.T(90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView3, nme.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, nme.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.w = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, nme.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.x = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        frameLayout3.addView(linearLayout2, nme.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new gc(context));
        imageView4.setScaleType(scaleType);
        zkb.s(imageView4, i4, wjbVar, mode);
        ff0 Z2 = bkb.Z(bkb.v0(i2, wjbVar), bkb.v(bkb.v0(i2, wjbVar), bkb.v0(i3, wjbVar)), gl.L(22.0f), gl.L(22.0f));
        f(imageView4, i2, Z2);
        imageView4.setBackground(new gd9(Z2));
        linearLayout2.addView(imageView4, nme.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        ote.a(imageView4);
        imageView4.setContentDescription("AI");
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                a72 a72Var2 = a72Var;
                switch (b) {
                    case 0:
                        e72 e72Var = a72Var2.a;
                        e72Var.r.T4();
                        e72Var.b0();
                        return;
                    case 1:
                        a72Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        a72Var2.a.r.a4();
                        return;
                    case 3:
                        a72Var2.a.r.X3();
                        return;
                    case 4:
                        a72Var2.a.r.b4();
                        return;
                    case 5:
                        e72 e72Var2 = a72Var2.a;
                        pe9 c2 = e72Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(e72Var2.getContext(), e72Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new be2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        a72Var2.a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ld9 ld9Var = a72Var2.a.r.R3;
                        if (ld9Var != null) {
                            ld9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ld9 ld9Var2 = a72Var2.a.r.R3;
                        if (ld9Var2 != null) {
                            ld9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        e72 e72Var3 = a72Var2.a;
                        new gb9(e72Var3.n, e72Var3.a, new be2(a72Var2, (byte) 21), e72Var3.getContext()).show();
                        return;
                    case 10:
                        a72Var2.a.Y();
                        return;
                    default:
                        e72 e72Var4 = a72Var2.a;
                        e72Var4.r.j4 = null;
                        e72Var4.T(90, 0);
                        return;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        ShapeDrawable b02 = bkb.b0(gl.L(22.0f), bkb.v0(i, wjbVar));
        f(frameLayout5, i, b02);
        frameLayout5.setBackground(new gd9(b02));
        frameLayout4.addView(frameLayout5, nme.e(-2, 44, 81));
        bd9 bd9Var = new bd9(context, (byte) 1);
        bd9Var.setClipToOutline(true);
        bd9Var.setOutlineProvider(new xi((byte) 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setPadding(gl.L(2.0f), 0, gl.L(2.0f), 0);
        linearLayout3.setOrientation(0);
        bd9Var.addView(linearLayout3);
        frameLayout5.addView(bd9Var, nme.c(-1.0f, -1));
        qy1 qy1Var = new qy1(context, 24);
        this.y = qy1Var;
        qy1Var.setPadding(gl.L(7.0f), gl.L(7.0f), gl.L(7.0f), gl.L(7.0f));
        zkb.s(qy1Var, i4, wjbVar, mode);
        ff0 Z3 = bkb.Z(bkb.v0(i, wjbVar), bkb.v0(i3, wjbVar), gl.L(20.0f), gl.L(20.0f));
        vkb M3 = zkb.M(i);
        vkb M4 = zkb.M(i3);
        qy1Var.setBackground(Z3);
        zkb.j(qy1Var, Z3, M3, M4, wjbVar);
        qy1Var.j(oy1.e, false);
        linearLayout3.addView(qy1Var, nme.r(38, 38, 16));
        ote.a(qy1Var);
        qy1Var.setContentDescription("Emoji");
        qy1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                a72 a72Var2 = a72Var;
                switch (b) {
                    case 0:
                        e72 e72Var = a72Var2.a;
                        e72Var.r.T4();
                        e72Var.b0();
                        return;
                    case 1:
                        a72Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        a72Var2.a.r.a4();
                        return;
                    case 3:
                        a72Var2.a.r.X3();
                        return;
                    case 4:
                        a72Var2.a.r.b4();
                        return;
                    case 5:
                        e72 e72Var2 = a72Var2.a;
                        pe9 c2 = e72Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(e72Var2.getContext(), e72Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new be2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        a72Var2.a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ld9 ld9Var = a72Var2.a.r.R3;
                        if (ld9Var != null) {
                            ld9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ld9 ld9Var2 = a72Var2.a.r.R3;
                        if (ld9Var2 != null) {
                            ld9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        e72 e72Var3 = a72Var2.a;
                        new gb9(e72Var3.n, e72Var3.a, new be2(a72Var2, (byte) 21), e72Var3.getContext()).show();
                        return;
                    case 10:
                        a72Var2.a.Y();
                        return;
                    default:
                        e72 e72Var4 = a72Var2.a;
                        e72Var4.r.j4 = null;
                        e72Var4.T(90, 0);
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
        zkb.s(imageView5, i4, wjbVar, mode);
        ff0 Z4 = bkb.Z(bkb.v0(i, wjbVar), bkb.v0(i3, wjbVar), gl.L(20.0f), gl.L(20.0f));
        vkb M5 = zkb.M(i);
        vkb M6 = zkb.M(i3);
        imageView5.setBackground(Z4);
        zkb.j(imageView5, Z4, M5, M6, wjbVar);
        linearLayout3.addView(imageView5, nme.t(38, 38, 16, 2, 0, 0, 0));
        ote.a(imageView5);
        imageView5.setContentDescription("Attach");
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                a72 a72Var2 = a72Var;
                switch (b) {
                    case 0:
                        e72 e72Var = a72Var2.a;
                        e72Var.r.T4();
                        e72Var.b0();
                        return;
                    case 1:
                        a72Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        a72Var2.a.r.a4();
                        return;
                    case 3:
                        a72Var2.a.r.X3();
                        return;
                    case 4:
                        a72Var2.a.r.b4();
                        return;
                    case 5:
                        e72 e72Var2 = a72Var2.a;
                        pe9 c2 = e72Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(e72Var2.getContext(), e72Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new be2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        a72Var2.a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ld9 ld9Var = a72Var2.a.r.R3;
                        if (ld9Var != null) {
                            ld9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ld9 ld9Var2 = a72Var2.a.r.R3;
                        if (ld9Var2 != null) {
                            ld9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        e72 e72Var3 = a72Var2.a;
                        new gb9(e72Var3.n, e72Var3.a, new be2(a72Var2, (byte) 21), e72Var3.getContext()).show();
                        return;
                    case 10:
                        a72Var2.a.Y();
                        return;
                    default:
                        e72 e72Var4 = a72Var2.a;
                        e72Var4.r.j4 = null;
                        e72Var4.T(90, 0);
                        return;
                }
            }
        });
        linearLayout2.addView(frameLayout4, nme.l(1.0f, 0, 44));
        pkb pkbVar = new pkb((byte) 14, context, this);
        this.H = pkbVar;
        pkbVar.setOrientation(0);
        pkbVar.setClipToPadding(false);
        pkbVar.setClipChildren(false);
        pkbVar.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        frameLayout2.addView(pkbVar, nme.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.I = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        frameLayout2.addView(frameLayout6, nme.e(80, 60, 81));
        ?? imageView6 = new ImageView(context);
        this.J = imageView6;
        imageView6.f(2131624043, gl.L(16.0f), gl.L(16.0f), null);
        oy8 animatedDrawable = imageView6.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.F(0);
            animatedDrawable.K(0);
        }
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(bkb.v0(i4, wjbVar), mode));
        ShapeDrawable b03 = bkb.b0(gl.L(22.0f), bkb.v0(i2, wjbVar));
        f(imageView6, i2, b03);
        imageView6.setBackground(new gd9(b03));
        frameLayout6.addView((View) imageView6, nme.e(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        ShapeDrawable b04 = bkb.b0(gl.L(22.0f), bkb.v0(i2, wjbVar));
        f(frameLayout7, i2, b04);
        frameLayout7.setBackground(new gd9(b04));
        pkbVar.addView(frameLayout7, nme.c(44.0f, -2));
        cf9 cf9Var = new cf9(this, context, (byte) 0);
        cf9Var.setHorizontalScrollBarEnabled(false);
        cf9Var.setClipToOutline(true);
        cf9Var.setOutlineProvider(new xi((byte) 17));
        frameLayout7.addView(cf9Var, nme.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.K = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(gl.L(2.0f), 0, gl.L(2.0f), 0);
        cf9Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(2131231202, 1, false);
        b(2131231204, 2, false);
        b(2131231210, 16, false);
        b(2131231209, 8, false);
        b(2131231208, 256, false);
        b(2131231555, 4, false);
        b(2131231586, 16384, true);
        b(2131231587, 32768, true);
        dd9 dd9Var = new dd9(2131231584, wjbVar, context);
        this.T = dd9Var;
        dd9Var.c(i2);
        dd9Var.setContentDescription(k96.M0(2131746247, null));
        dd9Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                a72 a72Var2 = a72Var;
                switch (b) {
                    case 0:
                        e72 e72Var = a72Var2.a;
                        e72Var.r.T4();
                        e72Var.b0();
                        return;
                    case 1:
                        a72Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        a72Var2.a.r.a4();
                        return;
                    case 3:
                        a72Var2.a.r.X3();
                        return;
                    case 4:
                        a72Var2.a.r.b4();
                        return;
                    case 5:
                        e72 e72Var2 = a72Var2.a;
                        pe9 c2 = e72Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(e72Var2.getContext(), e72Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new be2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        a72Var2.a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ld9 ld9Var = a72Var2.a.r.R3;
                        if (ld9Var != null) {
                            ld9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ld9 ld9Var2 = a72Var2.a.r.R3;
                        if (ld9Var2 != null) {
                            ld9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        e72 e72Var3 = a72Var2.a;
                        new gb9(e72Var3.n, e72Var3.a, new be2(a72Var2, (byte) 21), e72Var3.getContext()).show();
                        return;
                    case 10:
                        a72Var2.a.Y();
                        return;
                    default:
                        e72 e72Var4 = a72Var2.a;
                        e72Var4.r.j4 = null;
                        e72Var4.T(90, 0);
                        return;
                }
            }
        });
        linearLayout4.addView(dd9Var, nme.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        dd9 dd9Var2 = new dd9(2131231552, wjbVar, context);
        this.Q = dd9Var2;
        dd9Var2.c(i2);
        dd9Var2.setContentDescription(k96.M0(2131745818, null));
        dd9Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                a72 a72Var2 = a72Var;
                switch (b) {
                    case 0:
                        e72 e72Var = a72Var2.a;
                        e72Var.r.T4();
                        e72Var.b0();
                        return;
                    case 1:
                        a72Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        a72Var2.a.r.a4();
                        return;
                    case 3:
                        a72Var2.a.r.X3();
                        return;
                    case 4:
                        a72Var2.a.r.b4();
                        return;
                    case 5:
                        e72 e72Var2 = a72Var2.a;
                        pe9 c2 = e72Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(e72Var2.getContext(), e72Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new be2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        a72Var2.a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ld9 ld9Var = a72Var2.a.r.R3;
                        if (ld9Var != null) {
                            ld9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ld9 ld9Var2 = a72Var2.a.r.R3;
                        if (ld9Var2 != null) {
                            ld9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        e72 e72Var3 = a72Var2.a;
                        new gb9(e72Var3.n, e72Var3.a, new be2(a72Var2, (byte) 21), e72Var3.getContext()).show();
                        return;
                    case 10:
                        a72Var2.a.Y();
                        return;
                    default:
                        e72 e72Var4 = a72Var2.a;
                        e72Var4.r.j4 = null;
                        e72Var4.T(90, 0);
                        return;
                }
            }
        });
        linearLayout4.addView(dd9Var2, nme.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.N = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(gl.L(2.0f), 0, gl.L(2.0f), 0);
        ShapeDrawable b05 = bkb.b0(gl.L(22.0f), bkb.v0(i2, wjbVar));
        f(linearLayout5, i2, b05);
        linearLayout5.setBackground(new gd9(b05));
        pkbVar.addView(linearLayout5, nme.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        dd9 dd9Var3 = new dd9(2131231749, wjbVar, context);
        this.P = dd9Var3;
        dd9Var3.c(i2);
        dd9Var3.setContentDescription(k96.M0(2131751732, null));
        dd9Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                a72 a72Var2 = a72Var;
                switch (b) {
                    case 0:
                        e72 e72Var = a72Var2.a;
                        e72Var.r.T4();
                        e72Var.b0();
                        return;
                    case 1:
                        a72Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        a72Var2.a.r.a4();
                        return;
                    case 3:
                        a72Var2.a.r.X3();
                        return;
                    case 4:
                        a72Var2.a.r.b4();
                        return;
                    case 5:
                        e72 e72Var2 = a72Var2.a;
                        pe9 c2 = e72Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(e72Var2.getContext(), e72Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new be2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        a72Var2.a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ld9 ld9Var = a72Var2.a.r.R3;
                        if (ld9Var != null) {
                            ld9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ld9 ld9Var2 = a72Var2.a.r.R3;
                        if (ld9Var2 != null) {
                            ld9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        e72 e72Var3 = a72Var2.a;
                        new gb9(e72Var3.n, e72Var3.a, new be2(a72Var2, (byte) 21), e72Var3.getContext()).show();
                        return;
                    case 10:
                        a72Var2.a.Y();
                        return;
                    default:
                        e72 e72Var4 = a72Var2.a;
                        e72Var4.r.j4 = null;
                        e72Var4.T(90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(dd9Var3, nme.r(38, 38, 16));
        dd9 dd9Var4 = new dd9(2131232082, wjbVar, context);
        this.R = dd9Var4;
        dd9Var4.c(i2);
        dd9Var4.setContentDescription(k96.M0(2131754861, null));
        dd9Var4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                a72 a72Var2 = a72Var;
                switch (b) {
                    case 0:
                        e72 e72Var = a72Var2.a;
                        e72Var.r.T4();
                        e72Var.b0();
                        return;
                    case 1:
                        a72Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        a72Var2.a.r.a4();
                        return;
                    case 3:
                        a72Var2.a.r.X3();
                        return;
                    case 4:
                        a72Var2.a.r.b4();
                        return;
                    case 5:
                        e72 e72Var2 = a72Var2.a;
                        pe9 c2 = e72Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(e72Var2.getContext(), e72Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new be2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        a72Var2.a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ld9 ld9Var = a72Var2.a.r.R3;
                        if (ld9Var != null) {
                            ld9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ld9 ld9Var2 = a72Var2.a.r.R3;
                        if (ld9Var2 != null) {
                            ld9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        e72 e72Var3 = a72Var2.a;
                        new gb9(e72Var3.n, e72Var3.a, new be2(a72Var2, (byte) 21), e72Var3.getContext()).show();
                        return;
                    case 10:
                        a72Var2.a.Y();
                        return;
                    default:
                        e72 e72Var4 = a72Var2.a;
                        e72Var4.r.j4 = null;
                        e72Var4.T(90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(dd9Var4, nme.r(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.O = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(gl.L(2.0f), 0, gl.L(2.0f), 0);
        ShapeDrawable b06 = bkb.b0(gl.L(22.0f), bkb.v0(i2, wjbVar));
        f(linearLayout6, i2, b06);
        linearLayout6.setBackground(new gd9(b06));
        pkbVar.addView(linearLayout6, nme.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        dd9 dd9Var5 = new dd9(2131231573, wjbVar, context);
        this.S = dd9Var5;
        dd9Var5.c(i2);
        dd9Var5.d();
        arrayList.add(dd9Var5);
        dd9Var5.setContentDescription(k96.M0(2131754863, null));
        dd9Var5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                a72 a72Var2 = a72Var;
                switch (b) {
                    case 0:
                        e72 e72Var = a72Var2.a;
                        e72Var.r.T4();
                        e72Var.b0();
                        return;
                    case 1:
                        a72Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        a72Var2.a.r.a4();
                        return;
                    case 3:
                        a72Var2.a.r.X3();
                        return;
                    case 4:
                        a72Var2.a.r.b4();
                        return;
                    case 5:
                        e72 e72Var2 = a72Var2.a;
                        pe9 c2 = e72Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(e72Var2.getContext(), e72Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new be2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        a72Var2.a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ld9 ld9Var = a72Var2.a.r.R3;
                        if (ld9Var != null) {
                            ld9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ld9 ld9Var2 = a72Var2.a.r.R3;
                        if (ld9Var2 != null) {
                            ld9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        e72 e72Var3 = a72Var2.a;
                        new gb9(e72Var3.n, e72Var3.a, new be2(a72Var2, (byte) 21), e72Var3.getContext()).show();
                        return;
                    case 10:
                        a72Var2.a.Y();
                        return;
                    default:
                        e72 e72Var4 = a72Var2.a;
                        e72Var4.r.j4 = null;
                        e72Var4.T(90, 0);
                        return;
                }
            }
        });
        linearLayout6.addView(dd9Var5, nme.r(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.M = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(gl.L(2.0f), 0, gl.L(2.0f), 0);
        ShapeDrawable b07 = bkb.b0(gl.L(22.0f), bkb.v0(i2, wjbVar));
        f(linearLayout7, i2, b07);
        linearLayout7.setBackground(new gd9(b07));
        pkbVar.addView(linearLayout7, 0, nme.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        dd9 dd9Var6 = new dd9(2131231496, wjbVar, context);
        dd9Var6.setImageDrawable(new gc(context));
        dd9Var6.c(i2);
        dd9Var6.setContentDescription(k96.M0(2131755006, null));
        dd9Var6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                a72 a72Var2 = a72Var;
                switch (b) {
                    case 0:
                        e72 e72Var = a72Var2.a;
                        e72Var.r.T4();
                        e72Var.b0();
                        return;
                    case 1:
                        a72Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        a72Var2.a.r.a4();
                        return;
                    case 3:
                        a72Var2.a.r.X3();
                        return;
                    case 4:
                        a72Var2.a.r.b4();
                        return;
                    case 5:
                        e72 e72Var2 = a72Var2.a;
                        pe9 c2 = e72Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(e72Var2.getContext(), e72Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new be2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        a72Var2.a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ld9 ld9Var = a72Var2.a.r.R3;
                        if (ld9Var != null) {
                            ld9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ld9 ld9Var2 = a72Var2.a.r.R3;
                        if (ld9Var2 != null) {
                            ld9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        e72 e72Var3 = a72Var2.a;
                        new gb9(e72Var3.n, e72Var3.a, new be2(a72Var2, (byte) 21), e72Var3.getContext()).show();
                        return;
                    case 10:
                        a72Var2.a.Y();
                        return;
                    default:
                        e72 e72Var4 = a72Var2.a;
                        e72Var4.r.j4 = null;
                        e72Var4.T(90, 0);
                        return;
                }
            }
        });
        linearLayout7.addView(dd9Var6, nme.r(38, 38, 16));
        jh3 jh3Var = new jh3(this, context, wjbVar);
        this.G = jh3Var;
        int i5 = bkb.Oe;
        ShapeDrawable b08 = bkb.b0(gl.L(22.0f), bkb.v0(i5, wjbVar));
        f(jh3Var, i5, b08);
        jh3Var.setBackground(new gd9(b08));
        ote.a(jh3Var);
        linearLayout2.addView(jh3Var, nme.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        jh3Var.setContentDescription("Send");
        jh3Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                a72 a72Var2 = a72Var;
                switch (b) {
                    case 0:
                        e72 e72Var = a72Var2.a;
                        e72Var.r.T4();
                        e72Var.b0();
                        return;
                    case 1:
                        a72Var2.a.r.Z3(view3);
                        return;
                    case 2:
                        a72Var2.a.r.a4();
                        return;
                    case 3:
                        a72Var2.a.r.X3();
                        return;
                    case 4:
                        a72Var2.a.r.b4();
                        return;
                    case 5:
                        e72 e72Var2 = a72Var2.a;
                        pe9 c2 = e72Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(e72Var2.getContext(), e72Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new be2(c2, (byte) 20);
                                a1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        a72Var2.a.M(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ld9 ld9Var = a72Var2.a.r.R3;
                        if (ld9Var != null) {
                            ld9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ld9 ld9Var2 = a72Var2.a.r.R3;
                        if (ld9Var2 != null) {
                            ld9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        e72 e72Var3 = a72Var2.a;
                        new gb9(e72Var3.n, e72Var3.a, new be2(a72Var2, (byte) 21), e72Var3.getContext()).show();
                        return;
                    case 10:
                        a72Var2.a.Y();
                        return;
                    default:
                        e72 e72Var4 = a72Var2.a;
                        e72Var4.r.j4 = null;
                        e72Var4.T(90, 0);
                        return;
                }
            }
        });
        jh3Var.setOnLongClickListener(new zs(a72Var, (byte) 14));
        g(0, false);
    }

    public final void a(int i, int i2, boolean z) {
        int i3;
        LinearLayout linearLayout = this.E;
        dd9 dd9Var = new dd9(i, this.b, linearLayout.getContext());
        dd9Var.c(bkb.c6);
        if (z) {
            dd9Var.d();
            this.W.add(dd9Var);
        }
        dd9Var.setTag(Integer.valueOf(i2));
        dd9Var.setContentDescription(hd9.c0(i2));
        dd9Var.setOnClickListener(new hb(this, i2, (byte) 6));
        this.U.add(dd9Var);
        if (linearLayout.getChildCount() == 0) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        linearLayout.addView(dd9Var, nme.t(38, 38, 16, i3, 0, 0, 0));
    }

    public final void b(int i, final int i2, boolean z) {
        int i3;
        dd9 dd9Var = new dd9(i, this.b, getContext());
        dd9Var.c(bkb.Ol);
        if (z) {
            dd9Var.d();
            this.W.add(dd9Var);
        }
        dd9Var.setTag(Integer.valueOf(i2));
        dd9Var.setContentDescription(hd9.e0(i2));
        dd9Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                df9.this.a.a.r.Y3(i2);
            }
        });
        this.V.add(dd9Var);
        LinearLayout linearLayout = this.K;
        if (linearLayout.getChildCount() == 0) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        linearLayout.addView(dd9Var, nme.t(38, 38, 16, i3, 0, 0, 0));
    }

    public final void c(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            dd9 dd9Var = (dd9) obj;
            int intValue = ((Integer) dd9Var.getTag()).intValue();
            if ((i & intValue) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            dd9Var.setSelected(z6);
            if (intValue == 1 || intValue == 2) {
                dd9Var.setEnabled(z5);
            }
        }
        dd9 dd9Var2 = this.P;
        dd9Var2.setSelected(z);
        dd9 dd9Var3 = this.R;
        dd9Var3.setSelected(z2);
        dd9Var2.setEnabled(z3);
        this.Q.setEnabled(z4);
        dd9Var3.setEnabled(z3);
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
            dd9 dd9Var = (dd9) obj;
            if (i == ((Integer) dd9Var.getTag()).intValue()) {
                z = true;
            } else {
                z = false;
            }
            dd9Var.setSelected(z);
            if (z && i2 != 0) {
                dd9Var.e(i2);
            } else {
                dd9Var.a();
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
            ry8 ry8Var = this.J;
            if (z2) {
                ry8Var.animate().scaleX(f).scaleY(f).setDuration(180L).setInterpolator(s33.h).start();
            } else {
                ry8Var.animate().cancel();
                ry8Var.setScaleX(f);
                ry8Var.setScaleY(f);
            }
            if (z) {
                i = bkb.p7;
            } else {
                i = bkb.F6;
            }
            ry8Var.setColorFilter(new PorterDuffColorFilter(bkb.v0(i, this.b), PorterDuff.Mode.SRC_IN));
            oy8 animatedDrawable = ry8Var.getAnimatedDrawable();
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
        wjb wjbVar = this.b;
        this.j0.add(Integer.valueOf(bkb.v0(i, wjbVar)));
        if (drawable instanceof RippleDrawable) {
            i2 = bkb.v(bkb.v0(i, wjbVar), bkb.v0(bkb.h6, wjbVar));
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
        pkb pkbVar = this.H;
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
                L3 = gl.L(30.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationY(L3).setDuration(420L);
            s33 s33Var = s33.h;
            duration.setInterpolator(s33Var).withEndAction(new Runnable(this) {
                public final df9 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r2;
                    df9 df9Var = this.b;
                    switch (b) {
                        case 0:
                            if (df9Var.b0 != 0) {
                                df9Var.x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            if (df9Var.b0 != 1) {
                                df9Var.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (df9Var.b0 != 2) {
                                df9Var.I.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            pkbVar.setVisibility(0);
            ViewPropertyAnimator animate2 = pkbVar.animate();
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
                L4 = gl.L(30.0f);
            }
            scaleY2.translationY(L4).setDuration(420L).setInterpolator(s33Var).withEndAction(new Runnable(this) {
                public final df9 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r2;
                    df9 df9Var = this.b;
                    switch (b) {
                        case 0:
                            if (df9Var.b0 != 0) {
                                df9Var.x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            if (df9Var.b0 != 1) {
                                df9Var.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (df9Var.b0 != 2) {
                                df9Var.I.setVisibility(8);
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
            scaleX3.scaleY(f16).setDuration(420L).setInterpolator(s33Var).withEndAction(new Runnable(this) {
                public final df9 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r2;
                    df9 df9Var = this.b;
                    switch (b) {
                        case 0:
                            if (df9Var.b0 != 0) {
                                df9Var.x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            if (df9Var.b0 != 1) {
                                df9Var.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (df9Var.b0 != 2) {
                                df9Var.I.setVisibility(8);
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
            L = gl.L(30.0f);
        }
        linearLayout.setTranslationY(L);
        if (i == 1) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        pkbVar.setVisibility(i3);
        if (i == 1) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        pkbVar.setAlpha(f4);
        if (i == 1) {
            f5 = 1.0f;
        } else {
            f5 = 0.8f;
        }
        pkbVar.setScaleX(f5);
        if (i == 1) {
            f6 = 1.0f;
        } else {
            f6 = 0.8f;
        }
        pkbVar.setScaleY(f6);
        if (i == 1) {
            L2 = 0.0f;
        } else {
            L2 = gl.L(30.0f);
        }
        pkbVar.setTranslationY(L2);
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

    public ky1 getSendButton() {
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
        oy1 oy1Var;
        String str;
        if (z) {
            oy1Var = oy1.d;
        } else {
            oy1Var = oy1.e;
        }
        qy1 qy1Var = this.y;
        qy1Var.j(oy1Var, true);
        if (z) {
            str = "Keyboard";
        } else {
            str = "Emoji";
        }
        qy1Var.setContentDescription(str);
    }

    public void setPremiumLocked(boolean z) {
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((dd9) obj).setPremiumLocked(z);
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
            i = 2131231505;
        } else {
            i = 2131232699;
        }
        this.G.setResourceId(i);
    }

    public void setSendEnabled(boolean z) {
        float f;
        jh3 jh3Var = this.G;
        if (jh3Var.isEnabled() == z) {
            return;
        }
        jh3Var.setEnabled(z);
        ViewPropertyAnimator animate = jh3Var.animate();
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        ug8.s(animate, f, 150L);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.df9.updateColors():void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
