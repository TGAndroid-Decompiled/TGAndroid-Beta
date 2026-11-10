package li;

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
import c8.ha;
import c8.ka;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.gg;
import org.telegram.ui.Components.ig;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.e61;
public final class y3 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final LinearLayout D;
    public final ImageView E;
    public final w1 F;
    public final e61 G;
    public final FrameLayout H;
    public final ch0 I;
    public final LinearLayout J;
    public int K;
    public final LinearLayout L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final x1 O;
    public final x1 P;
    public final x1 Q;
    public final x1 R;
    public final x1 S;
    public final ArrayList T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public final l f19004a;
    public int f19005a0;
    public final h6 f19006b;
    public int f19007b0;
    public final View f19008c;
    public boolean f19009c0;
    public final View d;
    public final GradientDrawable f19010d0;
    public final FrameLayout f19011e;
    public final GradientDrawable f19012e0;
    public final ImageView f19013f;
    public final ArrayList f19014f0;
    public final ArrayList f19015g0;
    public final LinearLayout h;
    public final ArrayList f19016h0;
    public final ArrayList f19017i0;
    public final ArrayList f19018j0;
    public int f19019k0;
    public boolean f19020l0;
    public int m0;
    public final ImageView f19021n;
    public boolean f19022n0;
    public final ImageView f19023r;
    public final FrameLayout f19024s;
    public final FrameLayout f19025w;
    public final LinearLayout f19026x;
    public final ig f19027y;

    public y3(Context context, final l lVar) {
        super(context);
        this.K = Integer.MAX_VALUE;
        this.T = new ArrayList();
        this.U = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.V = arrayList;
        this.f19005a0 = -1;
        this.f19007b0 = 0;
        this.f19014f0 = new ArrayList();
        this.f19015g0 = new ArrayList();
        this.f19016h0 = new ArrayList();
        this.f19017i0 = new ArrayList();
        this.f19018j0 = new ArrayList();
        this.f19004a = lVar;
        h6 h6Var = lVar.f18681a.f38655a;
        this.f19006b = h6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.f19008c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i7 = m6.f27890d6;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{m6.w0(i7, h6Var), m6.r1(0.0f, m6.w0(i7, h6Var))});
        this.f19010d0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, ha.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{m6.r1(0.0f, m6.w0(i7, h6Var)), m6.w0(i7, h6Var)});
        this.f19012e0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        addView(view2, ha.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f19011e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, ha.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f19013f = imageView;
        imageView.setImageResource(2131231240);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i10 = m6.Ml;
        int w02 = m6.w0(i10, h6Var);
        int w03 = m6.w0(i10, h6Var);
        int i11 = m6.f27982i6;
        org.telegram.ui.Cells.y b02 = m6.b0(w02, m6.w(w03, m6.w0(i11, h6Var)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        f(imageView, i10, b02);
        imageView.setBackground(new a2(b02));
        int i12 = m6.G6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        t6.s(imageView, i12, h6Var, mode);
        ka.a(imageView);
        imageView.setContentDescription(id.M0(2131754878, null));
        imageView.setOnClickListener(new bi.l1(lVar, 6));
        frameLayout.addView(imageView, ha.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        ShapeDrawable d02 = m6.d0(org.telegram.messenger.g0.L(22.0f), m6.w0(i10, h6Var));
        f(linearLayout, i10, d02);
        linearLayout.setBackground(new a2(d02));
        frameLayout.addView(linearLayout, ha.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.f19021n = imageView2;
        imageView2.setImageResource(2131231598);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y h02 = m6.h0(m6.w0(i11, h6Var), 1, -1);
        p6 M = t6.M(i11);
        imageView2.setBackground(h02);
        t6.j(imageView2, h02, null, M, h6Var);
        t6.s(imageView2, i12, h6Var, mode);
        ka.a(imageView2);
        imageView2.setContentDescription("Undo");
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f18681a;
                        pVar.f18763r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f18681a.f18763r.c4(view3);
                        return;
                    case 2:
                        lVar.f18681a.f18763r.d4();
                        return;
                    case 3:
                        lVar.f18681a.f18763r.a4();
                        return;
                    case 4:
                        lVar.f18681a.f18763r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f18681a;
                        k3 k22 = pVar2.f18763r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(pVar2.getContext(), pVar2.f38655a);
                                f0Var.s1(a10);
                                f0Var.f33409f2 = new ii.c(k22, 9);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f18681a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        f2 f2Var = lVar.f18681a.f18763r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f18681a.f18763r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f18681a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f18762n, context2, new ii.c(lVar2, 10), pVar3.f38655a).show();
                        return;
                    case 10:
                        p.P(lVar.f18681a);
                        return;
                    default:
                        p pVar4 = lVar.f18681a;
                        pVar4.f18763r.f18885i4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView2, ha.r(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.f19023r = imageView3;
        imageView3.setImageResource(2131231581);
        imageView3.setScaleType(scaleType);
        org.telegram.ui.Cells.y h03 = m6.h0(m6.w0(i11, h6Var), 1, -1);
        p6 M2 = t6.M(i11);
        imageView3.setBackground(h03);
        t6.j(imageView3, h03, null, M2, h6Var);
        t6.s(imageView3, i12, h6Var, mode);
        ka.a(imageView3);
        imageView3.setContentDescription("Redo");
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f18681a;
                        pVar.f18763r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f18681a.f18763r.c4(view3);
                        return;
                    case 2:
                        lVar.f18681a.f18763r.d4();
                        return;
                    case 3:
                        lVar.f18681a.f18763r.a4();
                        return;
                    case 4:
                        lVar.f18681a.f18763r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f18681a;
                        k3 k22 = pVar2.f18763r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(pVar2.getContext(), pVar2.f38655a);
                                f0Var.s1(a10);
                                f0Var.f33409f2 = new ii.c(k22, 9);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f18681a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        f2 f2Var = lVar.f18681a.f18763r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f18681a.f18763r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f18681a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f18762n, context2, new ii.c(lVar2, 10), pVar3.f38655a).show();
                        return;
                    case 10:
                        p.P(lVar.f18681a);
                        return;
                    default:
                        p pVar4 = lVar.f18681a;
                        pVar4.f18763r.f18885i4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView3, ha.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f19024s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, ha.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f19025w = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, ha.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f19026x = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout3.addView(linearLayout2, ha.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.ActionBar.v2(context));
        imageView4.setScaleType(scaleType);
        t6.s(imageView4, i12, h6Var, mode);
        org.telegram.ui.Cells.y b03 = m6.b0(m6.w0(i10, h6Var), m6.w(m6.w0(i10, h6Var), m6.w0(i11, h6Var)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        f(imageView4, i10, b03);
        imageView4.setBackground(new a2(b03));
        linearLayout2.addView(imageView4, ha.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        ka.a(imageView4);
        imageView4.setContentDescription("AI");
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f18681a;
                        pVar.f18763r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f18681a.f18763r.c4(view3);
                        return;
                    case 2:
                        lVar.f18681a.f18763r.d4();
                        return;
                    case 3:
                        lVar.f18681a.f18763r.a4();
                        return;
                    case 4:
                        lVar.f18681a.f18763r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f18681a;
                        k3 k22 = pVar2.f18763r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(pVar2.getContext(), pVar2.f38655a);
                                f0Var.s1(a10);
                                f0Var.f33409f2 = new ii.c(k22, 9);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f18681a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        f2 f2Var = lVar.f18681a.f18763r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f18681a.f18763r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f18681a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f18762n, context2, new ii.c(lVar2, 10), pVar3.f38655a).show();
                        return;
                    case 10:
                        p.P(lVar.f18681a);
                        return;
                    default:
                        p pVar4 = lVar.f18681a;
                        pVar4.f18763r.f18885i4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        ShapeDrawable d03 = m6.d0(org.telegram.messenger.g0.L(22.0f), m6.w0(i7, h6Var));
        f(frameLayout5, i7, d03);
        frameLayout5.setBackground(new a2(d03));
        frameLayout4.addView(frameLayout5, ha.e(-2, 44, 81));
        u1 u1Var = new u1(context, 1);
        u1Var.setClipToOutline(true);
        u1Var.setOutlineProvider(new bg.q0(6));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.D = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        linearLayout3.setOrientation(0);
        u1Var.addView(linearLayout3);
        frameLayout5.addView(u1Var, ha.c(-1.0f, -1));
        ig igVar = new ig(context, 24);
        this.f19027y = igVar;
        igVar.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        t6.s(igVar, i12, h6Var, mode);
        org.telegram.ui.Cells.y b04 = m6.b0(m6.w0(i7, h6Var), m6.w0(i11, h6Var), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        p6 M3 = t6.M(i7);
        p6 M4 = t6.M(i11);
        igVar.setBackground(b04);
        t6.j(igVar, b04, M3, M4, h6Var);
        igVar.j(gg.f33892e, false);
        linearLayout3.addView(igVar, ha.r(38, 38, 16));
        ka.a(igVar);
        igVar.setContentDescription("Emoji");
        igVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f18681a;
                        pVar.f18763r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f18681a.f18763r.c4(view3);
                        return;
                    case 2:
                        lVar.f18681a.f18763r.d4();
                        return;
                    case 3:
                        lVar.f18681a.f18763r.a4();
                        return;
                    case 4:
                        lVar.f18681a.f18763r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f18681a;
                        k3 k22 = pVar2.f18763r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(pVar2.getContext(), pVar2.f38655a);
                                f0Var.s1(a10);
                                f0Var.f33409f2 = new ii.c(k22, 9);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f18681a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        f2 f2Var = lVar.f18681a.f18763r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f18681a.f18763r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f18681a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f18762n, context2, new ii.c(lVar2, 10), pVar3.f38655a).show();
                        return;
                    case 10:
                        p.P(lVar.f18681a);
                        return;
                    default:
                        p pVar4 = lVar.f18681a;
                        pVar4.f18763r.f18885i4 = null;
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
        this.E = imageView5;
        imageView5.setImageResource(2131232489);
        imageView5.setScaleType(scaleType);
        t6.s(imageView5, i12, h6Var, mode);
        org.telegram.ui.Cells.y b05 = m6.b0(m6.w0(i7, h6Var), m6.w0(i11, h6Var), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        p6 M5 = t6.M(i7);
        p6 M6 = t6.M(i11);
        imageView5.setBackground(b05);
        t6.j(imageView5, b05, M5, M6, h6Var);
        linearLayout3.addView(imageView5, ha.t(38, 38, 16, 2, 0, 0, 0));
        ka.a(imageView5);
        imageView5.setContentDescription("Attach");
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f18681a;
                        pVar.f18763r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f18681a.f18763r.c4(view3);
                        return;
                    case 2:
                        lVar.f18681a.f18763r.d4();
                        return;
                    case 3:
                        lVar.f18681a.f18763r.a4();
                        return;
                    case 4:
                        lVar.f18681a.f18763r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f18681a;
                        k3 k22 = pVar2.f18763r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(pVar2.getContext(), pVar2.f38655a);
                                f0Var.s1(a10);
                                f0Var.f33409f2 = new ii.c(k22, 9);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f18681a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        f2 f2Var = lVar.f18681a.f18763r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f18681a.f18763r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f18681a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f18762n, context2, new ii.c(lVar2, 10), pVar3.f38655a).show();
                        return;
                    case 10:
                        p.P(lVar.f18681a);
                        return;
                    default:
                        p pVar4 = lVar.f18681a;
                        pVar4.f18763r.f18885i4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout2.addView(frameLayout4, ha.l(1.0f, 0, 44));
        e61 e61Var = new e61(7, context, this);
        this.G = e61Var;
        e61Var.setOrientation(0);
        e61Var.setClipToPadding(false);
        e61Var.setClipChildren(false);
        e61Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(e61Var, ha.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.H = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(frameLayout6, ha.e(80, 60, 81));
        ?? imageView6 = new ImageView(context);
        this.I = imageView6;
        imageView6.f(2131624042, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), null);
        zg0 animatedDrawable = imageView6.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(m6.w0(i12, h6Var), mode));
        ShapeDrawable d04 = m6.d0(org.telegram.messenger.g0.L(22.0f), m6.w0(i10, h6Var));
        f(imageView6, i10, d04);
        imageView6.setBackground(new a2(d04));
        frameLayout6.addView((View) imageView6, ha.e(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        ShapeDrawable d05 = m6.d0(org.telegram.messenger.g0.L(22.0f), m6.w0(i10, h6Var));
        f(frameLayout7, i10, d05);
        frameLayout7.setBackground(new a2(d05));
        e61Var.addView(frameLayout7, ha.c(44.0f, -2));
        x3 x3Var = new x3(this, context, 0);
        x3Var.setHorizontalScrollBarEnabled(false);
        x3Var.setClipToOutline(true);
        x3Var.setOutlineProvider(new bg.q0(7));
        frameLayout7.addView(x3Var, ha.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.J = linearLayout4;
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
        x1 x1Var = new x1(2131231580, context, h6Var);
        this.S = x1Var;
        x1Var.c(i10);
        x1Var.setContentDescription(id.M0(2131746440, null));
        x1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f18681a;
                        pVar.f18763r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f18681a.f18763r.c4(view3);
                        return;
                    case 2:
                        lVar.f18681a.f18763r.d4();
                        return;
                    case 3:
                        lVar.f18681a.f18763r.a4();
                        return;
                    case 4:
                        lVar.f18681a.f18763r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f18681a;
                        k3 k22 = pVar2.f18763r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(pVar2.getContext(), pVar2.f38655a);
                                f0Var.s1(a10);
                                f0Var.f33409f2 = new ii.c(k22, 9);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f18681a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        f2 f2Var = lVar.f18681a.f18763r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f18681a.f18763r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f18681a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f18762n, context2, new ii.c(lVar2, 10), pVar3.f38655a).show();
                        return;
                    case 10:
                        p.P(lVar.f18681a);
                        return;
                    default:
                        p pVar4 = lVar.f18681a;
                        pVar4.f18763r.f18885i4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout4.addView(x1Var, ha.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        x1 x1Var2 = new x1(2131231548, context, h6Var);
        this.P = x1Var2;
        x1Var2.c(i10);
        x1Var2.setContentDescription(id.M0(2131746011, null));
        x1Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f18681a;
                        pVar.f18763r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f18681a.f18763r.c4(view3);
                        return;
                    case 2:
                        lVar.f18681a.f18763r.d4();
                        return;
                    case 3:
                        lVar.f18681a.f18763r.a4();
                        return;
                    case 4:
                        lVar.f18681a.f18763r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f18681a;
                        k3 k22 = pVar2.f18763r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(pVar2.getContext(), pVar2.f38655a);
                                f0Var.s1(a10);
                                f0Var.f33409f2 = new ii.c(k22, 9);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f18681a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        f2 f2Var = lVar.f18681a.f18763r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f18681a.f18763r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f18681a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f18762n, context2, new ii.c(lVar2, 10), pVar3.f38655a).show();
                        return;
                    case 10:
                        p.P(lVar.f18681a);
                        return;
                    default:
                        p pVar4 = lVar.f18681a;
                        pVar4.f18763r.f18885i4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout4.addView(x1Var2, ha.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.M = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        ShapeDrawable d06 = m6.d0(org.telegram.messenger.g0.L(22.0f), m6.w0(i10, h6Var));
        f(linearLayout5, i10, d06);
        linearLayout5.setBackground(new a2(d06));
        e61Var.addView(linearLayout5, ha.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        x1 x1Var3 = new x1(2131231745, context, h6Var);
        this.O = x1Var3;
        x1Var3.c(i10);
        x1Var3.setContentDescription(id.M0(2131751744, null));
        x1Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f18681a;
                        pVar.f18763r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f18681a.f18763r.c4(view3);
                        return;
                    case 2:
                        lVar.f18681a.f18763r.d4();
                        return;
                    case 3:
                        lVar.f18681a.f18763r.a4();
                        return;
                    case 4:
                        lVar.f18681a.f18763r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f18681a;
                        k3 k22 = pVar2.f18763r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(pVar2.getContext(), pVar2.f38655a);
                                f0Var.s1(a10);
                                f0Var.f33409f2 = new ii.c(k22, 9);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f18681a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        f2 f2Var = lVar.f18681a.f18763r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f18681a.f18763r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f18681a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f18762n, context2, new ii.c(lVar2, 10), pVar3.f38655a).show();
                        return;
                    case 10:
                        p.P(lVar.f18681a);
                        return;
                    default:
                        p pVar4 = lVar.f18681a;
                        pVar4.f18763r.f18885i4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(x1Var3, ha.r(38, 38, 16));
        x1 x1Var4 = new x1(2131232077, context, h6Var);
        this.Q = x1Var4;
        x1Var4.c(i10);
        x1Var4.setContentDescription(id.M0(2131754862, null));
        x1Var4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f18681a;
                        pVar.f18763r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f18681a.f18763r.c4(view3);
                        return;
                    case 2:
                        lVar.f18681a.f18763r.d4();
                        return;
                    case 3:
                        lVar.f18681a.f18763r.a4();
                        return;
                    case 4:
                        lVar.f18681a.f18763r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f18681a;
                        k3 k22 = pVar2.f18763r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(pVar2.getContext(), pVar2.f38655a);
                                f0Var.s1(a10);
                                f0Var.f33409f2 = new ii.c(k22, 9);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f18681a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        f2 f2Var = lVar.f18681a.f18763r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f18681a.f18763r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f18681a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f18762n, context2, new ii.c(lVar2, 10), pVar3.f38655a).show();
                        return;
                    case 10:
                        p.P(lVar.f18681a);
                        return;
                    default:
                        p pVar4 = lVar.f18681a;
                        pVar4.f18763r.f18885i4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(x1Var4, ha.r(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.N = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        ShapeDrawable d07 = m6.d0(org.telegram.messenger.g0.L(22.0f), m6.w0(i10, h6Var));
        f(linearLayout6, i10, d07);
        linearLayout6.setBackground(new a2(d07));
        e61Var.addView(linearLayout6, ha.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        x1 x1Var5 = new x1(2131231569, context, h6Var);
        this.R = x1Var5;
        x1Var5.c(i10);
        x1Var5.d();
        arrayList.add(x1Var5);
        x1Var5.setContentDescription(id.M0(2131754864, null));
        x1Var5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f18681a;
                        pVar.f18763r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f18681a.f18763r.c4(view3);
                        return;
                    case 2:
                        lVar.f18681a.f18763r.d4();
                        return;
                    case 3:
                        lVar.f18681a.f18763r.a4();
                        return;
                    case 4:
                        lVar.f18681a.f18763r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f18681a;
                        k3 k22 = pVar2.f18763r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(pVar2.getContext(), pVar2.f38655a);
                                f0Var.s1(a10);
                                f0Var.f33409f2 = new ii.c(k22, 9);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f18681a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        f2 f2Var = lVar.f18681a.f18763r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f18681a.f18763r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f18681a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f18762n, context2, new ii.c(lVar2, 10), pVar3.f38655a).show();
                        return;
                    case 10:
                        p.P(lVar.f18681a);
                        return;
                    default:
                        p pVar4 = lVar.f18681a;
                        pVar4.f18763r.f18885i4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout6.addView(x1Var5, ha.r(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.L = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        ShapeDrawable d08 = m6.d0(org.telegram.messenger.g0.L(22.0f), m6.w0(i10, h6Var));
        f(linearLayout7, i10, d08);
        linearLayout7.setBackground(new a2(d08));
        e61Var.addView(linearLayout7, 0, ha.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        x1 x1Var6 = new x1(2131231493, context, h6Var);
        x1Var6.setImageDrawable(new org.telegram.ui.ActionBar.v2(context));
        x1Var6.c(i10);
        x1Var6.setContentDescription(id.M0(2131755006, null));
        x1Var6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f18681a;
                        pVar.f18763r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f18681a.f18763r.c4(view3);
                        return;
                    case 2:
                        lVar.f18681a.f18763r.d4();
                        return;
                    case 3:
                        lVar.f18681a.f18763r.a4();
                        return;
                    case 4:
                        lVar.f18681a.f18763r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f18681a;
                        k3 k22 = pVar2.f18763r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(pVar2.getContext(), pVar2.f38655a);
                                f0Var.s1(a10);
                                f0Var.f33409f2 = new ii.c(k22, 9);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f18681a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        f2 f2Var = lVar.f18681a.f18763r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f18681a.f18763r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f18681a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f18762n, context2, new ii.c(lVar2, 10), pVar3.f38655a).show();
                        return;
                    case 10:
                        p.P(lVar.f18681a);
                        return;
                    default:
                        p pVar4 = lVar.f18681a;
                        pVar4.f18763r.f18885i4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout7.addView(x1Var6, ha.r(38, 38, 16));
        w1 w1Var = new w1(this, context, h6Var);
        this.F = w1Var;
        int i13 = m6.Me;
        ShapeDrawable d09 = m6.d0(org.telegram.messenger.g0.L(22.0f), m6.w0(i13, h6Var));
        f(w1Var, i13, d09);
        w1Var.setBackground(new a2(d09));
        ka.a(w1Var);
        linearLayout2.addView(w1Var, ha.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        w1Var.setContentDescription("Send");
        w1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = lVar.f18681a;
                        pVar.f18763r.T4();
                        pVar.b0();
                        return;
                    case 1:
                        lVar.f18681a.f18763r.c4(view3);
                        return;
                    case 2:
                        lVar.f18681a.f18763r.d4();
                        return;
                    case 3:
                        lVar.f18681a.f18763r.a4();
                        return;
                    case 4:
                        lVar.f18681a.f18763r.e4();
                        return;
                    case 5:
                        p pVar2 = lVar.f18681a;
                        k3 k22 = pVar2.f18763r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(pVar2.getContext(), pVar2.f38655a);
                                f0Var.s1(a10);
                                f0Var.f33409f2 = new ii.c(k22, 9);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f18681a.L(true, 0, 0, 0L, false);
                        return;
                    case 7:
                        f2 f2Var = lVar.f18681a.f18763r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f18681a.f18763r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.f18681a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f18762n, context2, new ii.c(lVar2, 10), pVar3.f38655a).show();
                        return;
                    case 10:
                        p.P(lVar.f18681a);
                        return;
                    default:
                        p pVar4 = lVar.f18681a;
                        pVar4.f18763r.f18885i4 = null;
                        p.S(pVar4, 90, 0);
                        return;
                }
            }
        });
        w1Var.setOnLongClickListener(new fi.s4(lVar, 4));
        g(0, false);
    }

    public final void a(int i7, int i10, boolean z9) {
        int i11;
        LinearLayout linearLayout = this.D;
        x1 x1Var = new x1(i7, linearLayout.getContext(), this.f19006b);
        x1Var.c(m6.f27890d6);
        if (z9) {
            x1Var.d();
            this.V.add(x1Var);
        }
        x1Var.setTag(Integer.valueOf(i10));
        x1Var.setContentDescription(b2.l0(i10));
        x1Var.setOnClickListener(new w3(this, i10, 1));
        this.T.add(x1Var);
        if (linearLayout.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout.addView(x1Var, ha.t(38, 38, 16, i11, 0, 0, 0));
    }

    public final void b(int i7, int i10, boolean z9) {
        int i11;
        x1 x1Var = new x1(i7, getContext(), this.f19006b);
        x1Var.c(m6.Ml);
        if (z9) {
            x1Var.d();
            this.V.add(x1Var);
        }
        x1Var.setTag(Integer.valueOf(i10));
        x1Var.setContentDescription(b2.n0(i10));
        x1Var.setOnClickListener(new w3(this, i10, 0));
        this.U.add(x1Var);
        LinearLayout linearLayout = this.J;
        if (linearLayout.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout.addView(x1Var, ha.t(38, 38, 16, i11, 0, 0, 0));
    }

    public final void c(int i7, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        ArrayList arrayList = this.U;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            x1 x1Var = (x1) obj;
            int intValue = ((Integer) x1Var.getTag()).intValue();
            if ((i7 & intValue) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            x1Var.setSelected(z14);
            if (intValue == 1 || intValue == 2) {
                x1Var.setEnabled(z13);
            }
        }
        x1 x1Var2 = this.O;
        x1Var2.setSelected(z9);
        x1 x1Var3 = this.Q;
        x1Var3.setSelected(z10);
        x1Var2.setEnabled(z11);
        this.P.setEnabled(z12);
        x1Var3.setEnabled(z11);
        this.R.setEnabled(z11);
    }

    public final void d(int i7, int i10) {
        boolean z9;
        ArrayList arrayList = this.T;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            x1 x1Var = (x1) obj;
            if (i7 == ((Integer) x1Var.getTag()).intValue()) {
                z9 = true;
            } else {
                z9 = false;
            }
            x1Var.setSelected(z9);
            if (z9 && i10 != 0) {
                x1Var.e(i10);
            } else {
                x1Var.a();
            }
        }
    }

    public final void e(boolean z9, boolean z10) {
        float f10;
        int i7;
        if (this.f19009c0 != z9 || !z10) {
            this.f19009c0 = z9;
            if (z9) {
                f10 = 1.15f;
            } else {
                f10 = 1.0f;
            }
            ch0 ch0Var = this.I;
            if (z10) {
                ch0Var.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(wq.h).start();
            } else {
                ch0Var.animate().cancel();
                ch0Var.setScaleX(f10);
                ch0Var.setScaleY(f10);
            }
            if (z9) {
                i7 = m6.f28131q7;
            } else {
                i7 = m6.G6;
            }
            ch0Var.setColorFilter(new PorterDuffColorFilter(m6.w0(i7, this.f19006b), PorterDuff.Mode.SRC_IN));
            zg0 animatedDrawable = ch0Var.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z9) {
                    if (animatedDrawable.f40962a0 > 34) {
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
        this.f19014f0.add(view);
        this.f19015g0.add(drawable);
        this.f19016h0.add(Integer.valueOf(i7));
        h6 h6Var = this.f19006b;
        this.f19017i0.add(Integer.valueOf(m6.w0(i7, h6Var)));
        if (drawable instanceof RippleDrawable) {
            i10 = m6.w(m6.w0(i7, h6Var), m6.w0(m6.f27982i6, h6Var));
        } else {
            i10 = 0;
        }
        this.f19018j0.add(Integer.valueOf(i10));
    }

    public final void g(int i7, boolean z9) {
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
        if (this.f19005a0 == i7) {
            return;
        }
        this.f19005a0 = i7;
        FrameLayout frameLayout = this.H;
        int i12 = 0;
        e61 e61Var = this.G;
        LinearLayout linearLayout = this.f19026x;
        float f24 = 0.0f;
        float f25 = 0.8f;
        if (z9) {
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
            wq wqVar = wq.h;
            duration.setInterpolator(wqVar).withEndAction(new Runnable(this) {
                public final y3 f18947b;

                {
                    this.f18947b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            y3 y3Var = this.f18947b;
                            if (y3Var.f19005a0 != 0) {
                                y3Var.f19026x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            y3 y3Var2 = this.f18947b;
                            if (y3Var2.f19005a0 != 1) {
                                y3Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            y3 y3Var3 = this.f18947b;
                            if (y3Var3.f19005a0 != 2) {
                                y3Var3.H.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            e61Var.setVisibility(0);
            ViewPropertyAnimator animate2 = e61Var.animate();
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
            scaleY2.translationY(L4).setDuration(420L).setInterpolator(wqVar).withEndAction(new Runnable(this) {
                public final y3 f18947b;

                {
                    this.f18947b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            y3 y3Var = this.f18947b;
                            if (y3Var.f19005a0 != 0) {
                                y3Var.f19026x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            y3 y3Var2 = this.f18947b;
                            if (y3Var2.f19005a0 != 1) {
                                y3Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            y3 y3Var3 = this.f18947b;
                            if (y3Var3.f19005a0 != 2) {
                                y3Var3.H.setVisibility(8);
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
            scaleX3.scaleY(f25).setDuration(420L).setInterpolator(wqVar).withEndAction(new Runnable(this) {
                public final y3 f18947b;

                {
                    this.f18947b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            y3 y3Var = this.f18947b;
                            if (y3Var.f19005a0 != 0) {
                                y3Var.f19026x.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            y3 y3Var2 = this.f18947b;
                            if (y3Var2.f19005a0 != 1) {
                                y3Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            y3 y3Var3 = this.f18947b;
                            if (y3Var3.f19005a0 != 2) {
                                y3Var3.H.setVisibility(8);
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
        e61Var.setVisibility(i11);
        if (i7 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        e61Var.setAlpha(f13);
        if (i7 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        e61Var.setScaleX(f14);
        if (i7 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        e61Var.setScaleY(f15);
        if (i7 == 1) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.g0.L(30.0f);
        }
        e61Var.setTranslationY(L2);
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
        return this.E;
    }

    public FrameLayout getBottomContainer() {
        return this.f19024s;
    }

    public FrameLayout getBottomInnerContainer() {
        return this.f19025w;
    }

    public LinearLayout getBottomPanel() {
        return this.f19026x;
    }

    public View getEmojiButton() {
        return this.f19027y;
    }

    public cg getSendButton() {
        return this.F;
    }

    public void setBackVisible(boolean z9) {
        int i7;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f19013f.setVisibility(i7);
    }

    public void setBottomGradientTranslationY(float f10) {
        this.d.setTranslationY(f10);
    }

    public void setEmojiOpened(boolean z9) {
        gg ggVar;
        String str;
        if (z9) {
            ggVar = gg.d;
        } else {
            ggVar = gg.f33892e;
        }
        ig igVar = this.f19027y;
        igVar.j(ggVar, true);
        if (z9) {
            str = "Keyboard";
        } else {
            str = "Emoji";
        }
        igVar.setContentDescription(str);
    }

    public void setPremiumLocked(boolean z9) {
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((x1) obj).setPremiumLocked(z9);
        }
    }

    public void setQuoteState(boolean z9) {
        this.S.setSelected(z9);
    }

    public void setSelectedBlockType(int i7) {
        d(i7, 0);
    }

    public void setSendEditing(boolean z9) {
        int i7;
        if (z9) {
            i7 = 2131231501;
        } else {
            i7 = 2131232694;
        }
        this.F.setResourceId(i7);
    }

    public void setSendEnabled(boolean z9) {
        float f10;
        w1 w1Var = this.F;
        if (w1Var.isEnabled() == z9) {
            return;
        }
        w1Var.setEnabled(z9);
        ViewPropertyAnimator animate = w1Var.animate();
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        org.telegram.messenger.camera.q.k(animate, f10, 150L);
    }

    public void setSendLoading(boolean z9) {
        if (this.W == z9) {
            return;
        }
        this.W = z9;
        this.F.invalidate();
    }

    public void setTopButtonsOffset(int i7) {
        LinearLayout linearLayout = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.topMargin != i7) {
            layoutParams.topMargin = i7;
            linearLayout.setLayoutParams(layoutParams);
        }
        ImageView imageView = this.f19013f;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        if (layoutParams2.topMargin != i7) {
            layoutParams2.topMargin = i7;
            imageView.setLayoutParams(layoutParams2);
        }
    }

    public void setTopGradientVisible(boolean z9) {
        int i7;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f19008c.setVisibility(i7);
    }

    public void setTopPanelVisible(boolean z9) {
        int i7;
        int i10 = 8;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f19011e.setVisibility(i7);
        if (z9) {
            i10 = 0;
        }
        this.f19008c.setVisibility(i10);
    }

    @Override
    public final void updateColors() {
        throw new UnsupportedOperationException("Method not decompiled: li.y3.updateColors():void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
