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
public final class ui9 extends FrameLayout implements snb {
    public final LinearLayout E;
    public final ImageView F;
    public final di3 G;
    public final oob H;
    public final FrameLayout I;
    public final e29 J;
    public final LinearLayout K;
    public int L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final LinearLayout O;
    public final ug9 P;
    public final ug9 Q;
    public final ug9 R;
    public final ug9 S;
    public final ug9 T;
    public final ArrayList U;
    public final ArrayList V;
    public final ArrayList W;
    public final r72 a;
    public boolean a0;
    public final vnb b;
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
    public final iz1 y;

    public ui9(Context context, final r72 r72Var) {
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
        this.a = r72Var;
        vnb vnbVar = r72Var.a.a;
        this.b = vnbVar;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i3 = aob.d6;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{aob.v0(i3, vnbVar), aob.p1(0.0f, aob.v0(i3, vnbVar))});
        this.e0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, tre.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{aob.p1(0.0f, aob.v0(i3, vnbVar)), aob.v0(i3, vnbVar)});
        this.f0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        addView(view2, tre.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, tre.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(2131231243);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i4 = aob.Pl;
        int v0 = aob.v0(i4, vnbVar);
        int v02 = aob.v0(i4, vnbVar);
        int i5 = aob.i6;
        hf0 Z = aob.Z(v0, aob.v(v02, aob.v0(i5, vnbVar)), hl.L(22.0f), hl.L(22.0f));
        f(imageView, i4, Z);
        imageView.setBackground(new xg9(Z));
        int i6 = aob.G6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        yob.s(imageView, i6, vnbVar, mode);
        iye.a(imageView);
        imageView.setContentDescription(ob6.M0(2131754874, null));
        imageView.setOnClickListener(new y00(r72Var, (byte) 14));
        frameLayout.addView(imageView, tre.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        ShapeDrawable b0 = aob.b0(hl.L(22.0f), aob.v0(i4, vnbVar));
        f(linearLayout, i4, b0);
        linearLayout.setBackground(new xg9(b0));
        frameLayout.addView(linearLayout, tre.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.n = imageView2;
        imageView2.setImageResource(2131231602);
        imageView2.setScaleType(scaleType);
        hf0 f0 = aob.f0(aob.v0(i5, vnbVar), 1, -1);
        uob M = yob.M(i5);
        imageView2.setBackground(f0);
        yob.j(imageView2, f0, null, M, vnbVar);
        yob.s(imageView2, i6, vnbVar, mode);
        iye.a(imageView2);
        imageView2.setContentDescription("Undo");
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                r72 r72Var2 = r72Var;
                switch (b) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        return;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        return;
                    case 2:
                        r72Var2.a.r.b4();
                        return;
                    case 3:
                        r72Var2.a.r.Y3();
                        return;
                    case 4:
                        r72Var2.a.r.c4();
                        return;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        return;
                    case 10:
                        r72Var2.a.X();
                        return;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView2, tre.r(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.r = imageView3;
        imageView3.setImageResource(2131231585);
        imageView3.setScaleType(scaleType);
        hf0 f02 = aob.f0(aob.v0(i5, vnbVar), 1, -1);
        uob M2 = yob.M(i5);
        imageView3.setBackground(f02);
        yob.j(imageView3, f02, null, M2, vnbVar);
        yob.s(imageView3, i6, vnbVar, mode);
        iye.a(imageView3);
        imageView3.setContentDescription("Redo");
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                r72 r72Var2 = r72Var;
                switch (b) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        return;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        return;
                    case 2:
                        r72Var2.a.r.b4();
                        return;
                    case 3:
                        r72Var2.a.r.Y3();
                        return;
                    case 4:
                        r72Var2.a.r.c4();
                        return;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        return;
                    case 10:
                        r72Var2.a.X();
                        return;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView3, tre.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, tre.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.w = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, tre.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.x = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        frameLayout3.addView(linearLayout2, tre.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new hc(context));
        imageView4.setScaleType(scaleType);
        yob.s(imageView4, i6, vnbVar, mode);
        hf0 Z2 = aob.Z(aob.v0(i4, vnbVar), aob.v(aob.v0(i4, vnbVar), aob.v0(i5, vnbVar)), hl.L(22.0f), hl.L(22.0f));
        f(imageView4, i4, Z2);
        imageView4.setBackground(new xg9(Z2));
        linearLayout2.addView(imageView4, tre.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        iye.a(imageView4);
        imageView4.setContentDescription("AI");
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                r72 r72Var2 = r72Var;
                switch (b) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        return;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        return;
                    case 2:
                        r72Var2.a.r.b4();
                        return;
                    case 3:
                        r72Var2.a.r.Y3();
                        return;
                    case 4:
                        r72Var2.a.r.c4();
                        return;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        return;
                    case 10:
                        r72Var2.a.X();
                        return;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        return;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        ShapeDrawable b02 = aob.b0(hl.L(22.0f), aob.v0(i3, vnbVar));
        f(frameLayout5, i3, b02);
        frameLayout5.setBackground(new xg9(b02));
        frameLayout4.addView(frameLayout5, tre.e(-2, 44, 81));
        sg9 sg9Var = new sg9(context, (byte) 1);
        sg9Var.setClipToOutline(true);
        sg9Var.setOutlineProvider(new yi((byte) 15));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        linearLayout3.setOrientation(0);
        sg9Var.addView(linearLayout3);
        frameLayout5.addView(sg9Var, tre.c(-1.0f, -1));
        iz1 iz1Var = new iz1(context, 24);
        this.y = iz1Var;
        iz1Var.setPadding(hl.L(7.0f), hl.L(7.0f), hl.L(7.0f), hl.L(7.0f));
        yob.s(iz1Var, i6, vnbVar, mode);
        hf0 Z3 = aob.Z(aob.v0(i3, vnbVar), aob.v0(i5, vnbVar), hl.L(20.0f), hl.L(20.0f));
        uob M3 = yob.M(i3);
        uob M4 = yob.M(i5);
        iz1Var.setBackground(Z3);
        yob.j(iz1Var, Z3, M3, M4, vnbVar);
        iz1Var.j(gz1.e, false);
        linearLayout3.addView(iz1Var, tre.r(38, 38, 16));
        iye.a(iz1Var);
        iz1Var.setContentDescription("Emoji");
        iz1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                r72 r72Var2 = r72Var;
                switch (b) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        return;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        return;
                    case 2:
                        r72Var2.a.r.b4();
                        return;
                    case 3:
                        r72Var2.a.r.Y3();
                        return;
                    case 4:
                        r72Var2.a.r.c4();
                        return;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        return;
                    case 10:
                        r72Var2.a.X();
                        return;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
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
        imageView5.setImageResource(2131232505);
        imageView5.setScaleType(scaleType);
        yob.s(imageView5, i6, vnbVar, mode);
        hf0 Z4 = aob.Z(aob.v0(i3, vnbVar), aob.v0(i5, vnbVar), hl.L(20.0f), hl.L(20.0f));
        uob M5 = yob.M(i3);
        uob M6 = yob.M(i5);
        imageView5.setBackground(Z4);
        yob.j(imageView5, Z4, M5, M6, vnbVar);
        linearLayout3.addView(imageView5, tre.t(38, 38, 16, 2, 0, 0, 0));
        iye.a(imageView5);
        imageView5.setContentDescription("Attach");
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                r72 r72Var2 = r72Var;
                switch (b) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        return;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        return;
                    case 2:
                        r72Var2.a.r.b4();
                        return;
                    case 3:
                        r72Var2.a.r.Y3();
                        return;
                    case 4:
                        r72Var2.a.r.c4();
                        return;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        return;
                    case 10:
                        r72Var2.a.X();
                        return;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        return;
                }
            }
        });
        linearLayout2.addView(frameLayout4, tre.l(1.0f, 0, 44));
        oob oobVar = new oob((byte) 14, context, this);
        this.H = oobVar;
        oobVar.setOrientation(0);
        oobVar.setClipToPadding(false);
        oobVar.setClipChildren(false);
        oobVar.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        frameLayout2.addView(oobVar, tre.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.I = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        frameLayout2.addView(frameLayout6, tre.e(80, 60, 81));
        ?? imageView6 = new ImageView(context);
        this.J = imageView6;
        imageView6.f(2131624043, hl.L(16.0f), hl.L(16.0f), null);
        b29 animatedDrawable = imageView6.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.F(0);
            animatedDrawable.K(0);
        }
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(aob.v0(i6, vnbVar), mode));
        ShapeDrawable b03 = aob.b0(hl.L(22.0f), aob.v0(i4, vnbVar));
        f(imageView6, i4, b03);
        imageView6.setBackground(new xg9(b03));
        frameLayout6.addView((View) imageView6, tre.e(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        ShapeDrawable b04 = aob.b0(hl.L(22.0f), aob.v0(i4, vnbVar));
        f(frameLayout7, i4, b04);
        frameLayout7.setBackground(new xg9(b04));
        oobVar.addView(frameLayout7, tre.c(44.0f, -2));
        ti9 ti9Var = new ti9(this, context, (byte) 0);
        ti9Var.setHorizontalScrollBarEnabled(false);
        ti9Var.setClipToOutline(true);
        ti9Var.setOutlineProvider(new yi((byte) 16));
        frameLayout7.addView(ti9Var, tre.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.K = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        ti9Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(2131231202, 1, false);
        b(2131231204, 2, false);
        b(2131231210, 16, false);
        b(2131231209, 8, false);
        b(2131231208, 256, false);
        b(2131231555, 4, false);
        b(2131231586, 16384, true);
        b(2131231587, 32768, true);
        ug9 ug9Var = new ug9(2131231584, vnbVar, context);
        this.T = ug9Var;
        ug9Var.c(i4);
        ug9Var.setContentDescription(ob6.M0(2131746167, null));
        ug9Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                r72 r72Var2 = r72Var;
                switch (b) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        return;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        return;
                    case 2:
                        r72Var2.a.r.b4();
                        return;
                    case 3:
                        r72Var2.a.r.Y3();
                        return;
                    case 4:
                        r72Var2.a.r.c4();
                        return;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        return;
                    case 10:
                        r72Var2.a.X();
                        return;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        return;
                }
            }
        });
        if (linearLayout4.getChildCount() == 0) {
            i = 0;
        } else {
            i = 2;
        }
        linearLayout4.addView(ug9Var, tre.t(38, 38, 16, i, 0, 0, 0));
        ug9 ug9Var2 = new ug9(2131231552, vnbVar, context);
        this.Q = ug9Var2;
        ug9Var2.c(i4);
        ug9Var2.setContentDescription(ob6.M0(2131745738, null));
        ug9Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                r72 r72Var2 = r72Var;
                switch (b) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        return;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        return;
                    case 2:
                        r72Var2.a.r.b4();
                        return;
                    case 3:
                        r72Var2.a.r.Y3();
                        return;
                    case 4:
                        r72Var2.a.r.c4();
                        return;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        return;
                    case 10:
                        r72Var2.a.X();
                        return;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        return;
                }
            }
        });
        if (linearLayout4.getChildCount() == 0) {
            i2 = 0;
        } else {
            i2 = 2;
        }
        linearLayout4.addView(ug9Var2, tre.t(38, 38, 16, i2, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.N = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        ShapeDrawable b05 = aob.b0(hl.L(22.0f), aob.v0(i4, vnbVar));
        f(linearLayout5, i4, b05);
        linearLayout5.setBackground(new xg9(b05));
        oobVar.addView(linearLayout5, tre.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        ug9 ug9Var3 = new ug9(2131231749, vnbVar, context);
        this.P = ug9Var3;
        ug9Var3.c(i4);
        ug9Var3.setContentDescription(ob6.M0(2131751709, null));
        ug9Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                r72 r72Var2 = r72Var;
                switch (b) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        return;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        return;
                    case 2:
                        r72Var2.a.r.b4();
                        return;
                    case 3:
                        r72Var2.a.r.Y3();
                        return;
                    case 4:
                        r72Var2.a.r.c4();
                        return;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        return;
                    case 10:
                        r72Var2.a.X();
                        return;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(ug9Var3, tre.r(38, 38, 16));
        ug9 ug9Var4 = new ug9(2131232082, vnbVar, context);
        this.R = ug9Var4;
        ug9Var4.c(i4);
        ug9Var4.setContentDescription(ob6.M0(2131754857, null));
        ug9Var4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                r72 r72Var2 = r72Var;
                switch (b) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        return;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        return;
                    case 2:
                        r72Var2.a.r.b4();
                        return;
                    case 3:
                        r72Var2.a.r.Y3();
                        return;
                    case 4:
                        r72Var2.a.r.c4();
                        return;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        return;
                    case 10:
                        r72Var2.a.X();
                        return;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(ug9Var4, tre.r(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.O = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        ShapeDrawable b06 = aob.b0(hl.L(22.0f), aob.v0(i4, vnbVar));
        f(linearLayout6, i4, b06);
        linearLayout6.setBackground(new xg9(b06));
        oobVar.addView(linearLayout6, tre.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        ug9 ug9Var5 = new ug9(2131231573, vnbVar, context);
        this.S = ug9Var5;
        ug9Var5.c(i4);
        ug9Var5.d();
        arrayList.add(ug9Var5);
        ug9Var5.setContentDescription(ob6.M0(2131754859, null));
        ug9Var5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                r72 r72Var2 = r72Var;
                switch (b) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        return;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        return;
                    case 2:
                        r72Var2.a.r.b4();
                        return;
                    case 3:
                        r72Var2.a.r.Y3();
                        return;
                    case 4:
                        r72Var2.a.r.c4();
                        return;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        return;
                    case 10:
                        r72Var2.a.X();
                        return;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        return;
                }
            }
        });
        linearLayout6.addView(ug9Var5, tre.r(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.M = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        ShapeDrawable b07 = aob.b0(hl.L(22.0f), aob.v0(i4, vnbVar));
        f(linearLayout7, i4, b07);
        linearLayout7.setBackground(new xg9(b07));
        oobVar.addView(linearLayout7, 0, tre.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        ug9 ug9Var6 = new ug9(2131231496, vnbVar, context);
        ug9Var6.setImageDrawable(new hc(context));
        ug9Var6.c(i4);
        ug9Var6.setContentDescription(ob6.M0(2131755003, null));
        ug9Var6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                r72 r72Var2 = r72Var;
                switch (b) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        return;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        return;
                    case 2:
                        r72Var2.a.r.b4();
                        return;
                    case 3:
                        r72Var2.a.r.Y3();
                        return;
                    case 4:
                        r72Var2.a.r.c4();
                        return;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        return;
                    case 10:
                        r72Var2.a.X();
                        return;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        return;
                }
            }
        });
        linearLayout7.addView(ug9Var6, tre.r(38, 38, 16));
        di3 di3Var = new di3(this, context, vnbVar);
        this.G = di3Var;
        int i7 = aob.Pe;
        ShapeDrawable b08 = aob.b0(hl.L(22.0f), aob.v0(i7, vnbVar));
        f(di3Var, i7, b08);
        di3Var.setBackground(new xg9(b08));
        iye.a(di3Var);
        linearLayout2.addView(di3Var, tre.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        di3Var.setContentDescription("Send");
        di3Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                r72 r72Var2 = r72Var;
                switch (b) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        return;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        return;
                    case 2:
                        r72Var2.a.r.b4();
                        return;
                    case 3:
                        r72Var2.a.r.Y3();
                        return;
                    case 4:
                        r72Var2.a.r.c4();
                        return;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            return;
                        }
                        return;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        return;
                    case 10:
                        r72Var2.a.X();
                        return;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        return;
                }
            }
        });
        di3Var.setOnLongClickListener(new zs(r72Var, (byte) 14));
        g(0, false);
    }

    public final void a(int i, int i2, boolean z) {
        int i3;
        LinearLayout linearLayout = this.E;
        ug9 ug9Var = new ug9(i, this.b, linearLayout.getContext());
        ug9Var.c(aob.d6);
        if (z) {
            ug9Var.d();
            this.W.add(ug9Var);
        }
        ug9Var.setTag(Integer.valueOf(i2));
        ug9Var.setContentDescription(yg9.c0(i2));
        ug9Var.setOnClickListener(new ib(this, i2, (byte) 6));
        this.U.add(ug9Var);
        if (linearLayout.getChildCount() == 0) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        linearLayout.addView(ug9Var, tre.t(38, 38, 16, i3, 0, 0, 0));
    }

    public final void b(int i, final int i2, boolean z) {
        int i3;
        ug9 ug9Var = new ug9(i, this.b, getContext());
        ug9Var.c(aob.Pl);
        if (z) {
            ug9Var.d();
            this.W.add(ug9Var);
        }
        ug9Var.setTag(Integer.valueOf(i2));
        ug9Var.setContentDescription(yg9.e0(i2));
        ug9Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ui9.this.a.a.r.Z3(i2);
            }
        });
        this.V.add(ug9Var);
        LinearLayout linearLayout = this.K;
        if (linearLayout.getChildCount() == 0) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        linearLayout.addView(ug9Var, tre.t(38, 38, 16, i3, 0, 0, 0));
    }

    public final void c(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ug9 ug9Var = (ug9) obj;
            int intValue = ((Integer) ug9Var.getTag()).intValue();
            if ((i & intValue) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            ug9Var.setSelected(z6);
            if (intValue == 1 || intValue == 2) {
                ug9Var.setEnabled(z5);
            }
        }
        ug9 ug9Var2 = this.P;
        ug9Var2.setSelected(z);
        ug9 ug9Var3 = this.R;
        ug9Var3.setSelected(z2);
        ug9Var2.setEnabled(z3);
        this.Q.setEnabled(z4);
        ug9Var3.setEnabled(z3);
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
            ug9 ug9Var = (ug9) obj;
            if (i == ((Integer) ug9Var.getTag()).intValue()) {
                z = true;
            } else {
                z = false;
            }
            ug9Var.setSelected(z);
            if (z && i2 != 0) {
                ug9Var.e(i2);
            } else {
                ug9Var.a();
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
            e29 e29Var = this.J;
            if (z2) {
                e29Var.animate().scaleX(f).scaleY(f).setDuration(180L).setInterpolator(k43.h).start();
            } else {
                e29Var.animate().cancel();
                e29Var.setScaleX(f);
                e29Var.setScaleY(f);
            }
            if (z) {
                i = aob.q7;
            } else {
                i = aob.G6;
            }
            e29Var.setColorFilter(new PorterDuffColorFilter(aob.v0(i, this.b), PorterDuff.Mode.SRC_IN));
            b29 animatedDrawable = e29Var.getAnimatedDrawable();
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
        vnb vnbVar = this.b;
        this.j0.add(Integer.valueOf(aob.v0(i, vnbVar)));
        if (drawable instanceof RippleDrawable) {
            i2 = aob.v(aob.v0(i, vnbVar), aob.v0(aob.i6, vnbVar));
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
        oob oobVar = this.H;
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
                L3 = hl.L(30.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationY(L3).setDuration(420L);
            k43 k43Var = k43.h;
            duration.setInterpolator(k43Var).withEndAction(new Runnable(this) {
                public final ui9 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r2;
                    ui9 ui9Var = this.b;
                    switch (b) {
                        case 0:
                            if (ui9Var.b0 != 0) {
                                ui9Var.x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            if (ui9Var.b0 != 1) {
                                ui9Var.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (ui9Var.b0 != 2) {
                                ui9Var.I.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            oobVar.setVisibility(0);
            ViewPropertyAnimator animate2 = oobVar.animate();
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
                L4 = hl.L(30.0f);
            }
            scaleY2.translationY(L4).setDuration(420L).setInterpolator(k43Var).withEndAction(new Runnable(this) {
                public final ui9 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r2;
                    ui9 ui9Var = this.b;
                    switch (b) {
                        case 0:
                            if (ui9Var.b0 != 0) {
                                ui9Var.x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            if (ui9Var.b0 != 1) {
                                ui9Var.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (ui9Var.b0 != 2) {
                                ui9Var.I.setVisibility(8);
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
            scaleX3.scaleY(f16).setDuration(420L).setInterpolator(k43Var).withEndAction(new Runnable(this) {
                public final ui9 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r2;
                    ui9 ui9Var = this.b;
                    switch (b) {
                        case 0:
                            if (ui9Var.b0 != 0) {
                                ui9Var.x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            if (ui9Var.b0 != 1) {
                                ui9Var.H.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (ui9Var.b0 != 2) {
                                ui9Var.I.setVisibility(8);
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
            L = hl.L(30.0f);
        }
        linearLayout.setTranslationY(L);
        if (i == 1) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        oobVar.setVisibility(i3);
        if (i == 1) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        oobVar.setAlpha(f4);
        if (i == 1) {
            f5 = 1.0f;
        } else {
            f5 = 0.8f;
        }
        oobVar.setScaleX(f5);
        if (i == 1) {
            f6 = 1.0f;
        } else {
            f6 = 0.8f;
        }
        oobVar.setScaleY(f6);
        if (i == 1) {
            L2 = 0.0f;
        } else {
            L2 = hl.L(30.0f);
        }
        oobVar.setTranslationY(L2);
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

    public bz1 getSendButton() {
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
        gz1 gz1Var;
        String str;
        if (z) {
            gz1Var = gz1.d;
        } else {
            gz1Var = gz1.e;
        }
        iz1 iz1Var = this.y;
        iz1Var.j(gz1Var, true);
        if (z) {
            str = "Keyboard";
        } else {
            str = "Emoji";
        }
        iz1Var.setContentDescription(str);
    }

    public void setPremiumLocked(boolean z) {
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ug9) obj).setPremiumLocked(z);
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
            i = 2131232710;
        }
        this.G.setResourceId(i);
    }

    public void setSendEnabled(boolean z) {
        float f;
        di3 di3Var = this.G;
        if (di3Var.isEnabled() == z) {
            return;
        }
        di3Var.setEnabled(z);
        ViewPropertyAnimator animate = di3Var.animate();
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        ik8.s(animate, f, 150L);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui9.updateColors():void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
