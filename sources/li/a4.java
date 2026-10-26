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
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.yg;
import org.telegram.ui.xa1;
public final class a4 extends FrameLayout implements p6 {
    public final ImageView E;
    public final w1 F;
    public final xa1 G;
    public final FrameLayout H;
    public final ak0 I;
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
    public final l f17081a;
    public int f17082a0;
    public final u6 f17083b;
    public int f17084b0;
    public final View f17085c;
    public boolean f17086c0;
    public final View d;
    public final GradientDrawable f17087d0;
    public final FrameLayout e;
    public final GradientDrawable f17088e0;
    public final ImageView f17089f;
    public final ArrayList f17090f0;
    public final ArrayList f17091g0;
    public final LinearLayout h;
    public final ArrayList f17092h0;
    public final ArrayList f17093i0;
    public final ArrayList f17094j0;
    public int f17095k0;
    public boolean f17096l0;
    public int m0;
    public final ImageView f17097n;
    public boolean f17098n0;
    public final ImageView f17099r;
    public final FrameLayout f17100s;
    public final FrameLayout v;
    public final LinearLayout f17101w;
    public final ah f17102x;
    public final LinearLayout f17103y;

    public a4(Context context, final l lVar) {
        super(context);
        int i10;
        int i11;
        this.K = Integer.MAX_VALUE;
        this.T = new ArrayList();
        this.U = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.V = arrayList;
        this.f17082a0 = -1;
        this.f17084b0 = 0;
        this.f17090f0 = new ArrayList();
        this.f17091g0 = new ArrayList();
        this.f17092h0 = new ArrayList();
        this.f17093i0 = new ArrayList();
        this.f17094j0 = new ArrayList();
        this.f17081a = lVar;
        u6 u6Var = lVar.f17336a.f30214a;
        this.f17083b = u6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.f17085c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i12 = y6.f23356d6;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{y6.w0(i12, u6Var), y6.o1(0.0f, y6.w0(i12, u6Var))});
        this.f17087d0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, gb1.i(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{y6.o1(0.0f, y6.w0(i12, u6Var)), y6.w0(i12, u6Var)});
        this.f17088e0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        addView(view2, gb1.i(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, gb1.i(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f17089f = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i13 = y6.Yk;
        int w02 = y6.w0(i13, u6Var);
        int w03 = y6.w0(i13, u6Var);
        int i14 = y6.f23448i6;
        org.telegram.ui.Cells.y a02 = y6.a0(w02, y6.v(w03, y6.w0(i14, u6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
        f(imageView, i13, a02);
        imageView.setBackground(new a2(a02));
        int i15 = y6.G6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        f7.t(imageView, i15, u6Var, mode);
        gb1.b(imageView);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView.setOnClickListener(new bh.f(lVar, 7));
        frameLayout.addView(imageView, gb1.h(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        ShapeDrawable c02 = y6.c0(AndroidUtilities.dp(22.0f), y6.w0(i13, u6Var));
        f(linearLayout, i13, c02);
        linearLayout.setBackground(new a2(c02));
        frameLayout.addView(linearLayout, gb1.h(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.f17097n = imageView2;
        imageView2.setImageResource(R.drawable.iv_undo);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y g02 = y6.g0(y6.w0(i14, u6Var), 1, -1);
        b7 N = f7.N(i14);
        imageView2.setBackground(g02);
        f7.k(imageView2, g02, null, N, u6Var);
        f7.t(imageView2, i15, u6Var, mode);
        gb1.b(imageView2);
        imageView2.setContentDescription("Undo");
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f17336a;
                        qVar.f17418r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f17336a.f17418r.f4(view3);
                        return;
                    case 2:
                        lVar.f17336a.f17418r.g4();
                        return;
                    case 3:
                        lVar.f17336a.f17418r.d4();
                        return;
                    case 4:
                        lVar.f17336a.f17418r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f17336a;
                        m3 n22 = qVar2.f17418r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f30214a);
                                e0Var.n0(a2);
                                e0Var.f27652k0 = new ig.o(n22, 8);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f17336a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        f2 f2Var = lVar.f17336a.f17418r.R3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f17336a.f17418r.R3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f17336a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f17417n, context2, new ig.o(lVar2, 9), qVar3.f30214a).show();
                        return;
                    case 10:
                        q.O(lVar.f17336a);
                        return;
                    default:
                        q qVar4 = lVar.f17336a;
                        qVar4.f17418r.f17550j4 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView2, gb1.u(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.f17099r = imageView3;
        imageView3.setImageResource(R.drawable.iv_redo);
        imageView3.setScaleType(scaleType);
        org.telegram.ui.Cells.y g03 = y6.g0(y6.w0(i14, u6Var), 1, -1);
        b7 N2 = f7.N(i14);
        imageView3.setBackground(g03);
        f7.k(imageView3, g03, null, N2, u6Var);
        f7.t(imageView3, i15, u6Var, mode);
        gb1.b(imageView3);
        imageView3.setContentDescription("Redo");
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f17336a;
                        qVar.f17418r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f17336a.f17418r.f4(view3);
                        return;
                    case 2:
                        lVar.f17336a.f17418r.g4();
                        return;
                    case 3:
                        lVar.f17336a.f17418r.d4();
                        return;
                    case 4:
                        lVar.f17336a.f17418r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f17336a;
                        m3 n22 = qVar2.f17418r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f30214a);
                                e0Var.n0(a2);
                                e0Var.f27652k0 = new ig.o(n22, 8);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f17336a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        f2 f2Var = lVar.f17336a.f17418r.R3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f17336a.f17418r.R3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f17336a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f17417n, context2, new ig.o(lVar2, 9), qVar3.f30214a).show();
                        return;
                    case 10:
                        q.O(lVar.f17336a);
                        return;
                    default:
                        q qVar4 = lVar.f17336a;
                        qVar4.f17418r.f17550j4 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView3, gb1.u(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f17100s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, gb1.i(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, gb1.i(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f17101w = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout3.addView(linearLayout2, gb1.i(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.Components.i0(context));
        imageView4.setScaleType(scaleType);
        f7.t(imageView4, i15, u6Var, mode);
        org.telegram.ui.Cells.y a03 = y6.a0(y6.w0(i13, u6Var), y6.v(y6.w0(i13, u6Var), y6.w0(i14, u6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
        f(imageView4, i13, a03);
        imageView4.setBackground(new a2(a03));
        linearLayout2.addView(imageView4, gb1.t(44, 44, 0.0f, 19, 0, 0, 8, 0));
        gb1.b(imageView4);
        imageView4.setContentDescription("AI");
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f17336a;
                        qVar.f17418r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f17336a.f17418r.f4(view3);
                        return;
                    case 2:
                        lVar.f17336a.f17418r.g4();
                        return;
                    case 3:
                        lVar.f17336a.f17418r.d4();
                        return;
                    case 4:
                        lVar.f17336a.f17418r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f17336a;
                        m3 n22 = qVar2.f17418r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f30214a);
                                e0Var.n0(a2);
                                e0Var.f27652k0 = new ig.o(n22, 8);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f17336a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        f2 f2Var = lVar.f17336a.f17418r.R3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f17336a.f17418r.R3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f17336a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f17417n, context2, new ig.o(lVar2, 9), qVar3.f30214a).show();
                        return;
                    case 10:
                        q.O(lVar.f17336a);
                        return;
                    default:
                        q qVar4 = lVar.f17336a;
                        qVar4.f17418r.f17550j4 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        ShapeDrawable c03 = y6.c0(AndroidUtilities.dp(22.0f), y6.w0(i12, u6Var));
        f(frameLayout5, i12, c03);
        frameLayout5.setBackground(new a2(c03));
        frameLayout4.addView(frameLayout5, gb1.i(-2, 44, 81));
        u1 u1Var = new u1(context, 1);
        u1Var.setClipToOutline(true);
        u1Var.setOutlineProvider(new ag.v0(7));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f17103y = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout3.setOrientation(0);
        u1Var.addView(linearLayout3);
        frameLayout5.addView(u1Var, gb1.g(-1.0f, -1));
        ah ahVar = new ah(context, 24);
        this.f17102x = ahVar;
        ahVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        f7.t(ahVar, i15, u6Var, mode);
        org.telegram.ui.Cells.y a04 = y6.a0(y6.w0(i12, u6Var), y6.w0(i14, u6Var), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        b7 N3 = f7.N(i12);
        b7 N4 = f7.N(i14);
        ahVar.setBackground(a04);
        f7.k(ahVar, a04, N3, N4, u6Var);
        ahVar.j(yg.e, false);
        linearLayout3.addView(ahVar, gb1.u(38, 38, 16));
        gb1.b(ahVar);
        ahVar.setContentDescription("Emoji");
        ahVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f17336a;
                        qVar.f17418r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f17336a.f17418r.f4(view3);
                        return;
                    case 2:
                        lVar.f17336a.f17418r.g4();
                        return;
                    case 3:
                        lVar.f17336a.f17418r.d4();
                        return;
                    case 4:
                        lVar.f17336a.f17418r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f17336a;
                        m3 n22 = qVar2.f17418r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f30214a);
                                e0Var.n0(a2);
                                e0Var.f27652k0 = new ig.o(n22, 8);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f17336a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        f2 f2Var = lVar.f17336a.f17418r.R3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f17336a.f17418r.R3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f17336a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f17417n, context2, new ig.o(lVar2, 9), qVar3.f30214a).show();
                        return;
                    case 10:
                        q.O(lVar.f17336a);
                        return;
                    default:
                        q qVar4 = lVar.f17336a;
                        qVar4.f17418r.f17550j4 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        a(R.drawable.iv_text, 1, false);
        a(R.drawable.iv_lists, 2, true);
        a(R.drawable.iv_table, 4, true);
        a(R.drawable.iv_math, 7, true);
        ImageView imageView5 = new ImageView(context);
        this.E = imageView5;
        imageView5.setImageResource(R.drawable.outline_poll_attach_24);
        imageView5.setScaleType(scaleType);
        f7.t(imageView5, i15, u6Var, mode);
        org.telegram.ui.Cells.y a05 = y6.a0(y6.w0(i12, u6Var), y6.w0(i14, u6Var), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        b7 N5 = f7.N(i12);
        b7 N6 = f7.N(i14);
        imageView5.setBackground(a05);
        f7.k(imageView5, a05, N5, N6, u6Var);
        linearLayout3.addView(imageView5, gb1.x(38, 38, 16, 2, 0, 0, 0));
        gb1.b(imageView5);
        imageView5.setContentDescription("Attach");
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f17336a;
                        qVar.f17418r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f17336a.f17418r.f4(view3);
                        return;
                    case 2:
                        lVar.f17336a.f17418r.g4();
                        return;
                    case 3:
                        lVar.f17336a.f17418r.d4();
                        return;
                    case 4:
                        lVar.f17336a.f17418r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f17336a;
                        m3 n22 = qVar2.f17418r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f30214a);
                                e0Var.n0(a2);
                                e0Var.f27652k0 = new ig.o(n22, 8);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f17336a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        f2 f2Var = lVar.f17336a.f17418r.R3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f17336a.f17418r.R3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f17336a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f17417n, context2, new ig.o(lVar2, 9), qVar3.f30214a).show();
                        return;
                    case 10:
                        q.O(lVar.f17336a);
                        return;
                    default:
                        q qVar4 = lVar.f17336a;
                        qVar4.f17418r.f17550j4 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout2.addView(frameLayout4, gb1.p(1.0f, 0, 44));
        xa1 xa1Var = new xa1(this, context, 6);
        this.G = xa1Var;
        xa1Var.setOrientation(0);
        xa1Var.setClipToPadding(false);
        xa1Var.setClipChildren(false);
        xa1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(xa1Var, gb1.i(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.H = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(frameLayout6, gb1.i(80, 60, 81));
        ?? imageView6 = new ImageView(context);
        this.I = imageView6;
        imageView6.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        xj0 animatedDrawable = imageView6.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(y6.w0(i15, u6Var), mode));
        ShapeDrawable c04 = y6.c0(AndroidUtilities.dp(22.0f), y6.w0(i13, u6Var));
        f(imageView6, i13, c04);
        imageView6.setBackground(new a2(c04));
        frameLayout6.addView((View) imageView6, gb1.i(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        ShapeDrawable c05 = y6.c0(AndroidUtilities.dp(22.0f), y6.w0(i13, u6Var));
        f(frameLayout7, i13, c05);
        frameLayout7.setBackground(new a2(c05));
        xa1Var.addView(frameLayout7, gb1.g(44.0f, -2));
        z3 z3Var = new z3(this, context, 0);
        z3Var.setHorizontalScrollBarEnabled(false);
        z3Var.setClipToOutline(true);
        z3Var.setOutlineProvider(new ag.v0(8));
        frameLayout7.addView(z3Var, gb1.g(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.J = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        z3Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(R.drawable.formatting_bold, 1, false);
        b(R.drawable.formatting_italic, 2, false);
        b(R.drawable.formatting_underline, 16, false);
        b(R.drawable.formatting_strikethrough, 8, false);
        b(R.drawable.formatting_spoiler, 256, false);
        b(R.drawable.iv_code, 4, false);
        b(R.drawable.iv_sub, 16384, true);
        b(R.drawable.iv_super, 32768, true);
        x1 x1Var = new x1(context, R.drawable.iv_quote, u6Var);
        this.S = x1Var;
        x1Var.c(i13);
        x1Var.setContentDescription(LocaleController.getString(R.string.Quote));
        x1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f17336a;
                        qVar.f17418r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f17336a.f17418r.f4(view3);
                        return;
                    case 2:
                        lVar.f17336a.f17418r.g4();
                        return;
                    case 3:
                        lVar.f17336a.f17418r.d4();
                        return;
                    case 4:
                        lVar.f17336a.f17418r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f17336a;
                        m3 n22 = qVar2.f17418r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f30214a);
                                e0Var.n0(a2);
                                e0Var.f27652k0 = new ig.o(n22, 8);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f17336a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        f2 f2Var = lVar.f17336a.f17418r.R3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f17336a.f17418r.R3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f17336a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f17417n, context2, new ig.o(lVar2, 9), qVar3.f30214a).show();
                        return;
                    case 10:
                        q.O(lVar.f17336a);
                        return;
                    default:
                        q qVar4 = lVar.f17336a;
                        qVar4.f17418r.f17550j4 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        if (linearLayout4.getChildCount() == 0) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        linearLayout4.addView(x1Var, gb1.x(38, 38, 16, i10, 0, 0, 0));
        x1 x1Var2 = new x1(context, R.drawable.iv_button, u6Var);
        this.P = x1Var2;
        x1Var2.c(i13);
        x1Var2.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        x1Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f17336a;
                        qVar.f17418r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f17336a.f17418r.f4(view3);
                        return;
                    case 2:
                        lVar.f17336a.f17418r.g4();
                        return;
                    case 3:
                        lVar.f17336a.f17418r.d4();
                        return;
                    case 4:
                        lVar.f17336a.f17418r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f17336a;
                        m3 n22 = qVar2.f17418r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f30214a);
                                e0Var.n0(a2);
                                e0Var.f27652k0 = new ig.o(n22, 8);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f17336a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        f2 f2Var = lVar.f17336a.f17418r.R3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f17336a.f17418r.R3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f17336a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f17417n, context2, new ig.o(lVar2, 9), qVar3.f30214a).show();
                        return;
                    case 10:
                        q.O(lVar.f17336a);
                        return;
                    default:
                        q qVar4 = lVar.f17336a;
                        qVar4.f17418r.f17550j4 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        if (linearLayout4.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout4.addView(x1Var2, gb1.x(38, 38, 16, i11, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.M = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        ShapeDrawable c06 = y6.c0(AndroidUtilities.dp(22.0f), y6.w0(i13, u6Var));
        f(linearLayout5, i13, c06);
        linearLayout5.setBackground(new a2(c06));
        xa1Var.addView(linearLayout5, gb1.h(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        x1 x1Var3 = new x1(context, R.drawable.media_link_24, u6Var);
        this.O = x1Var3;
        x1Var3.c(i13);
        x1Var3.setContentDescription(LocaleController.getString(R.string.CreateLink));
        x1Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f17336a;
                        qVar.f17418r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f17336a.f17418r.f4(view3);
                        return;
                    case 2:
                        lVar.f17336a.f17418r.g4();
                        return;
                    case 3:
                        lVar.f17336a.f17418r.d4();
                        return;
                    case 4:
                        lVar.f17336a.f17418r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f17336a;
                        m3 n22 = qVar2.f17418r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f30214a);
                                e0Var.n0(a2);
                                e0Var.f27652k0 = new ig.o(n22, 8);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f17336a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        f2 f2Var = lVar.f17336a.f17418r.R3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f17336a.f17418r.R3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f17336a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f17417n, context2, new ig.o(lVar2, 9), qVar3.f30214a).show();
                        return;
                    case 10:
                        q.O(lVar.f17336a);
                        return;
                    default:
                        q qVar4 = lVar.f17336a;
                        qVar4.f17418r.f17550j4 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(x1Var3, gb1.u(38, 38, 16));
        x1 x1Var4 = new x1(context, R.drawable.msg_calendar2, u6Var);
        this.Q = x1Var4;
        x1Var4.c(i13);
        x1Var4.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        x1Var4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f17336a;
                        qVar.f17418r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f17336a.f17418r.f4(view3);
                        return;
                    case 2:
                        lVar.f17336a.f17418r.g4();
                        return;
                    case 3:
                        lVar.f17336a.f17418r.d4();
                        return;
                    case 4:
                        lVar.f17336a.f17418r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f17336a;
                        m3 n22 = qVar2.f17418r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f30214a);
                                e0Var.n0(a2);
                                e0Var.f27652k0 = new ig.o(n22, 8);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f17336a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        f2 f2Var = lVar.f17336a.f17418r.R3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f17336a.f17418r.R3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f17336a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f17417n, context2, new ig.o(lVar2, 9), qVar3.f30214a).show();
                        return;
                    case 10:
                        q.O(lVar.f17336a);
                        return;
                    default:
                        q qVar4 = lVar.f17336a;
                        qVar4.f17418r.f17550j4 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(x1Var4, gb1.u(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.N = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        ShapeDrawable c07 = y6.c0(AndroidUtilities.dp(22.0f), y6.w0(i13, u6Var));
        f(linearLayout6, i13, c07);
        linearLayout6.setBackground(new a2(c07));
        xa1Var.addView(linearLayout6, gb1.h(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        x1 x1Var5 = new x1(context, R.drawable.iv_math, u6Var);
        this.R = x1Var5;
        x1Var5.c(i13);
        x1Var5.d();
        arrayList.add(x1Var5);
        x1Var5.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        x1Var5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f17336a;
                        qVar.f17418r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f17336a.f17418r.f4(view3);
                        return;
                    case 2:
                        lVar.f17336a.f17418r.g4();
                        return;
                    case 3:
                        lVar.f17336a.f17418r.d4();
                        return;
                    case 4:
                        lVar.f17336a.f17418r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f17336a;
                        m3 n22 = qVar2.f17418r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f30214a);
                                e0Var.n0(a2);
                                e0Var.f27652k0 = new ig.o(n22, 8);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f17336a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        f2 f2Var = lVar.f17336a.f17418r.R3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f17336a.f17418r.R3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f17336a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f17417n, context2, new ig.o(lVar2, 9), qVar3.f30214a).show();
                        return;
                    case 10:
                        q.O(lVar.f17336a);
                        return;
                    default:
                        q qVar4 = lVar.f17336a;
                        qVar4.f17418r.f17550j4 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout6.addView(x1Var5, gb1.u(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.L = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        ShapeDrawable c08 = y6.c0(AndroidUtilities.dp(22.0f), y6.w0(i13, u6Var));
        f(linearLayout7, i13, c08);
        linearLayout7.setBackground(new a2(c08));
        xa1Var.addView(linearLayout7, 0, gb1.h(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        x1 x1Var6 = new x1(context, R.drawable.input_ai, u6Var);
        x1Var6.setImageDrawable(new org.telegram.ui.Components.i0(context));
        x1Var6.c(i13);
        x1Var6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        x1Var6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f17336a;
                        qVar.f17418r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f17336a.f17418r.f4(view3);
                        return;
                    case 2:
                        lVar.f17336a.f17418r.g4();
                        return;
                    case 3:
                        lVar.f17336a.f17418r.d4();
                        return;
                    case 4:
                        lVar.f17336a.f17418r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f17336a;
                        m3 n22 = qVar2.f17418r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f30214a);
                                e0Var.n0(a2);
                                e0Var.f27652k0 = new ig.o(n22, 8);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f17336a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        f2 f2Var = lVar.f17336a.f17418r.R3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f17336a.f17418r.R3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f17336a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f17417n, context2, new ig.o(lVar2, 9), qVar3.f30214a).show();
                        return;
                    case 10:
                        q.O(lVar.f17336a);
                        return;
                    default:
                        q qVar4 = lVar.f17336a;
                        qVar4.f17418r.f17550j4 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout7.addView(x1Var6, gb1.u(38, 38, 16));
        w1 w1Var = new w1(R.drawable.send_plane_24, 1, context, this, u6Var);
        this.F = w1Var;
        int i16 = y6.Yd;
        ShapeDrawable c09 = y6.c0(AndroidUtilities.dp(22.0f), y6.w0(i16, u6Var));
        f(w1Var, i16, c09);
        w1Var.setBackground(new a2(c09));
        gb1.b(w1Var);
        linearLayout2.addView(w1Var, gb1.t(44, 44, 0.0f, 5, 8, 0, 0, 0));
        w1Var.setContentDescription("Send");
        w1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f17336a;
                        qVar.f17418r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f17336a.f17418r.f4(view3);
                        return;
                    case 2:
                        lVar.f17336a.f17418r.g4();
                        return;
                    case 3:
                        lVar.f17336a.f17418r.d4();
                        return;
                    case 4:
                        lVar.f17336a.f17418r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f17336a;
                        m3 n22 = qVar2.f17418r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f30214a);
                                e0Var.n0(a2);
                                e0Var.f27652k0 = new ig.o(n22, 8);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f17336a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        f2 f2Var = lVar.f17336a.f17418r.R3;
                        if (f2Var != null) {
                            f2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        f2 f2Var2 = lVar.f17336a.f17418r.R3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f17336a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f17417n, context2, new ig.o(lVar2, 9), qVar3.f30214a).show();
                        return;
                    case 10:
                        q.O(lVar.f17336a);
                        return;
                    default:
                        q qVar4 = lVar.f17336a;
                        qVar4.f17418r.f17550j4 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        w1Var.setOnLongClickListener(new fi.b5(lVar, 4));
        g(0, false);
    }

    public final void a(int i10, int i11, boolean z10) {
        int i12;
        LinearLayout linearLayout = this.f17103y;
        x1 x1Var = new x1(linearLayout.getContext(), i10, this.f17083b);
        x1Var.c(y6.f23356d6);
        if (z10) {
            x1Var.d();
            this.V.add(x1Var);
        }
        x1Var.setTag(Integer.valueOf(i11));
        x1Var.setContentDescription(b2.h0(i11));
        x1Var.setOnClickListener(new y3(this, i11, 1));
        this.T.add(x1Var);
        if (linearLayout.getChildCount() == 0) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        linearLayout.addView(x1Var, gb1.x(38, 38, 16, i12, 0, 0, 0));
    }

    public final void b(int i10, int i11, boolean z10) {
        int i12;
        x1 x1Var = new x1(getContext(), i10, this.f17083b);
        x1Var.c(y6.Yk);
        if (z10) {
            x1Var.d();
            this.V.add(x1Var);
        }
        x1Var.setTag(Integer.valueOf(i11));
        x1Var.setContentDescription(b2.j0(i11));
        x1Var.setOnClickListener(new y3(this, i11, 0));
        this.U.add(x1Var);
        LinearLayout linearLayout = this.J;
        if (linearLayout.getChildCount() == 0) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        linearLayout.addView(x1Var, gb1.x(38, 38, 16, i12, 0, 0, 0));
    }

    public final void c(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        ArrayList arrayList = this.U;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            x1 x1Var = (x1) obj;
            int intValue = ((Integer) x1Var.getTag()).intValue();
            if ((i10 & intValue) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            x1Var.setSelected(z15);
            if (intValue == 1 || intValue == 2) {
                x1Var.setEnabled(z14);
            }
        }
        x1 x1Var2 = this.O;
        x1Var2.setSelected(z10);
        x1 x1Var3 = this.Q;
        x1Var3.setSelected(z11);
        x1Var2.setEnabled(z12);
        this.P.setEnabled(z13);
        x1Var3.setEnabled(z12);
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
            x1 x1Var = (x1) obj;
            if (i10 == ((Integer) x1Var.getTag()).intValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            x1Var.setSelected(z10);
            if (z10 && i11 != 0) {
                x1Var.e(i11);
            } else {
                x1Var.a();
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        int i10;
        if (this.f17086c0 != z10 || !z11) {
            this.f17086c0 = z10;
            if (z10) {
                f7 = 1.15f;
            } else {
                f7 = 1.0f;
            }
            ak0 ak0Var = this.I;
            if (z11) {
                ak0Var.animate().scaleX(f7).scaleY(f7).setDuration(180L).setInterpolator(ds.h).start();
            } else {
                ak0Var.animate().cancel();
                ak0Var.setScaleX(f7);
                ak0Var.setScaleY(f7);
            }
            if (z10) {
                i10 = y6.f23598q7;
            } else {
                i10 = y6.G6;
            }
            ak0Var.setColorFilter(new PorterDuffColorFilter(y6.w0(i10, this.f17083b), PorterDuff.Mode.SRC_IN));
            xj0 animatedDrawable = ak0Var.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f34736a0 > 34) {
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
        this.f17090f0.add(view);
        this.f17091g0.add(drawable);
        this.f17092h0.add(Integer.valueOf(i10));
        u6 u6Var = this.f17083b;
        this.f17093i0.add(Integer.valueOf(y6.w0(i10, u6Var)));
        if (drawable instanceof RippleDrawable) {
            i11 = y6.v(y6.w0(i10, u6Var), y6.w0(y6.f23448i6, u6Var));
        } else {
            i11 = 0;
        }
        this.f17094j0.add(Integer.valueOf(i11));
    }

    public final void g(int i10, boolean z10) {
        int i11;
        float f7;
        float f10;
        float f11;
        float dp;
        int i12;
        float f12;
        float f13;
        float f14;
        float dp2;
        float f15;
        float f16;
        float f17;
        float f18;
        float dp3;
        float f19;
        float f20;
        float f21;
        float dp4;
        float f22;
        if (this.f17082a0 == i10) {
            return;
        }
        this.f17082a0 = i10;
        FrameLayout frameLayout = this.H;
        int i13 = 0;
        xa1 xa1Var = this.G;
        LinearLayout linearLayout = this.f17101w;
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
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(30.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationY(dp3).setDuration(420L);
            ds dsVar = ds.h;
            duration.setInterpolator(dsVar).withEndAction(new Runnable(this) {
                public final a4 f17622b;

                {
                    this.f17622b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            a4 a4Var = this.f17622b;
                            if (a4Var.f17082a0 != 0) {
                                a4Var.f17101w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            a4 a4Var2 = this.f17622b;
                            if (a4Var2.f17082a0 != 1) {
                                a4Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            a4 a4Var3 = this.f17622b;
                            if (a4Var3.f17082a0 != 2) {
                                a4Var3.H.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            xa1Var.setVisibility(0);
            ViewPropertyAnimator animate2 = xa1Var.animate();
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
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(30.0f);
            }
            scaleY2.translationY(dp4).setDuration(420L).setInterpolator(dsVar).withEndAction(new Runnable(this) {
                public final a4 f17622b;

                {
                    this.f17622b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            a4 a4Var = this.f17622b;
                            if (a4Var.f17082a0 != 0) {
                                a4Var.f17101w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            a4 a4Var2 = this.f17622b;
                            if (a4Var2.f17082a0 != 1) {
                                a4Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            a4 a4Var3 = this.f17622b;
                            if (a4Var3.f17082a0 != 2) {
                                a4Var3.H.setVisibility(8);
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
            scaleX3.scaleY(f24).setDuration(420L).setInterpolator(dsVar).withEndAction(new Runnable(this) {
                public final a4 f17622b;

                {
                    this.f17622b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            a4 a4Var = this.f17622b;
                            if (a4Var.f17082a0 != 0) {
                                a4Var.f17101w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            a4 a4Var2 = this.f17622b;
                            if (a4Var2.f17082a0 != 1) {
                                a4Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            a4 a4Var3 = this.f17622b;
                            if (a4Var3.f17082a0 != 2) {
                                a4Var3.H.setVisibility(8);
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
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(30.0f);
        }
        linearLayout.setTranslationY(dp);
        if (i10 == 1) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        xa1Var.setVisibility(i12);
        if (i10 == 1) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        xa1Var.setAlpha(f12);
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.8f;
        }
        xa1Var.setScaleX(f13);
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        xa1Var.setScaleY(f14);
        if (i10 == 1) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(30.0f);
        }
        xa1Var.setTranslationY(dp2);
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
        return this.f17100s;
    }

    public FrameLayout getBottomInnerContainer() {
        return this.v;
    }

    public LinearLayout getBottomPanel() {
        return this.f17101w;
    }

    public View getEmojiButton() {
        return this.f17102x;
    }

    public vg getSendButton() {
        return this.F;
    }

    public void setBackVisible(boolean z10) {
        int i10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f17089f.setVisibility(i10);
    }

    public void setBottomGradientTranslationY(float f7) {
        this.d.setTranslationY(f7);
    }

    public void setEmojiOpened(boolean z10) {
        yg ygVar;
        String str;
        if (z10) {
            ygVar = yg.d;
        } else {
            ygVar = yg.e;
        }
        ah ahVar = this.f17102x;
        ahVar.j(ygVar, true);
        if (z10) {
            str = "Keyboard";
        } else {
            str = "Emoji";
        }
        ahVar.setContentDescription(str);
    }

    public void setPremiumLocked(boolean z10) {
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((x1) obj).setPremiumLocked(z10);
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
            i10 = R.drawable.input_done;
        } else {
            i10 = R.drawable.send_plane_24;
        }
        this.F.setResourceId(i10);
    }

    public void setSendEnabled(boolean z10) {
        float f7;
        w1 w1Var = this.F;
        if (w1Var.isEnabled() == z10) {
            return;
        }
        w1Var.setEnabled(z10);
        ViewPropertyAnimator animate = w1Var.animate();
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        vh.p(animate, f7, 150L);
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
        ImageView imageView = this.f17089f;
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
        this.f17085c.setVisibility(i10);
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
        this.f17085c.setVisibility(i11);
    }

    @Override
    public final void updateColors() {
        throw new UnsupportedOperationException("Method not decompiled: li.a4.updateColors():void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
