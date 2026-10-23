package ki;

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
import org.telegram.messenger.sl;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.yg;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.va1;
public final class b4 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final ImageView E;
    public final y1 F;
    public final va1 G;
    public final FrameLayout H;
    public final bk0 I;
    public final LinearLayout J;
    public int K;
    public final LinearLayout L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final z1 O;
    public final z1 P;
    public final z1 Q;
    public final z1 R;
    public final z1 S;
    public final ArrayList T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public final l f15191a;
    public int f15192a0;
    public final org.telegram.ui.ActionBar.g6 f15193b;
    public int f15194b0;
    public final View f15195c;
    public boolean f15196c0;
    public final View d;
    public final GradientDrawable f15197d0;
    public final FrameLayout e;
    public final GradientDrawable f15198e0;
    public final ImageView f15199f;
    public final ArrayList f15200f0;
    public final ArrayList f15201g0;
    public final LinearLayout h;
    public final ArrayList f15202h0;
    public final ArrayList f15203i0;
    public final ArrayList f15204j0;
    public int f15205k0;
    public boolean f15206l0;
    public int m0;
    public final ImageView f15207n;
    public boolean f15208n0;
    public final ImageView f15209r;
    public final FrameLayout f15210s;
    public final FrameLayout v;
    public final LinearLayout f15211w;
    public final ah f15212x;
    public final LinearLayout f15213y;

    public b4(Context context, final l lVar) {
        super(context);
        int i10;
        int i11;
        this.K = Integer.MAX_VALUE;
        this.T = new ArrayList();
        this.U = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.V = arrayList;
        this.f15192a0 = -1;
        this.f15194b0 = 0;
        this.f15200f0 = new ArrayList();
        this.f15201g0 = new ArrayList();
        this.f15202h0 = new ArrayList();
        this.f15203i0 = new ArrayList();
        this.f15204j0 = new ArrayList();
        this.f15191a = lVar;
        org.telegram.ui.ActionBar.g6 g6Var = lVar.f15428a.f28365a;
        this.f15193b = g6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.f15195c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i12 = k6.f21183d6;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{k6.w0(i12, g6Var), k6.o1(0.0f, k6.w0(i12, g6Var))});
        this.f15197d0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, w7.z5.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{k6.o1(0.0f, k6.w0(i12, g6Var)), k6.w0(i12, g6Var)});
        this.f15198e0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        addView(view2, w7.z5.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, w7.z5.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f15199f = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i13 = k6.Yk;
        int w02 = k6.w0(i13, g6Var);
        int w03 = k6.w0(i13, g6Var);
        int i14 = k6.f21272i6;
        org.telegram.ui.Cells.y a02 = k6.a0(w02, k6.v(w03, k6.w0(i14, g6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
        f(imageView, i13, a02);
        imageView.setBackground(new c2(a02));
        int i15 = k6.G6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        r6.t(imageView, i15, g6Var, mode);
        w7.b6.a(imageView);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView.setOnClickListener(new ah.f(lVar, 7));
        frameLayout.addView(imageView, w7.z5.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        ShapeDrawable c02 = k6.c0(AndroidUtilities.dp(22.0f), k6.w0(i13, g6Var));
        f(linearLayout, i13, c02);
        linearLayout.setBackground(new c2(c02));
        frameLayout.addView(linearLayout, w7.z5.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.f15207n = imageView2;
        imageView2.setImageResource(R.drawable.iv_undo);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y g02 = k6.g0(k6.w0(i14, g6Var), 1, -1);
        n6 O = r6.O(i14);
        imageView2.setBackground(g02);
        r6.k(imageView2, g02, null, O, g6Var);
        r6.t(imageView2, i15, g6Var, mode);
        w7.b6.a(imageView2);
        imageView2.setContentDescription("Undo");
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15428a;
                        qVar.f15508r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15428a.f15508r.f4(view3);
                        return;
                    case 2:
                        lVar.f15428a.f15508r.g4();
                        return;
                    case 3:
                        lVar.f15428a.f15508r.d4();
                        return;
                    case 4:
                        lVar.f15428a.f15508r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15428a;
                        n3 n22 = qVar2.f15508r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28365a);
                                e0Var.n0(a2);
                                e0Var.f25774k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15428a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15428a.f15508r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15428a.f15508r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15428a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15507n, context2, new ig.k0(lVar2, 5), qVar3.f28365a).show();
                        return;
                    case 10:
                        q.O(lVar.f15428a);
                        return;
                    default:
                        q qVar4 = lVar.f15428a;
                        qVar4.f15508r.f15648c4 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView2, w7.z5.q(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.f15209r = imageView3;
        imageView3.setImageResource(R.drawable.iv_redo);
        imageView3.setScaleType(scaleType);
        org.telegram.ui.Cells.y g03 = k6.g0(k6.w0(i14, g6Var), 1, -1);
        n6 O2 = r6.O(i14);
        imageView3.setBackground(g03);
        r6.k(imageView3, g03, null, O2, g6Var);
        r6.t(imageView3, i15, g6Var, mode);
        w7.b6.a(imageView3);
        imageView3.setContentDescription("Redo");
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15428a;
                        qVar.f15508r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15428a.f15508r.f4(view3);
                        return;
                    case 2:
                        lVar.f15428a.f15508r.g4();
                        return;
                    case 3:
                        lVar.f15428a.f15508r.d4();
                        return;
                    case 4:
                        lVar.f15428a.f15508r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15428a;
                        n3 n22 = qVar2.f15508r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28365a);
                                e0Var.n0(a2);
                                e0Var.f25774k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15428a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15428a.f15508r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15428a.f15508r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15428a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15507n, context2, new ig.k0(lVar2, 5), qVar3.f28365a).show();
                        return;
                    case 10:
                        q.O(lVar.f15428a);
                        return;
                    default:
                        q qVar4 = lVar.f15428a;
                        qVar4.f15508r.f15648c4 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView3, w7.z5.q(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f15210s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, w7.z5.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, w7.z5.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f15211w = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout3.addView(linearLayout2, w7.z5.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.Components.i0(context));
        imageView4.setScaleType(scaleType);
        r6.t(imageView4, i15, g6Var, mode);
        org.telegram.ui.Cells.y a03 = k6.a0(k6.w0(i13, g6Var), k6.v(k6.w0(i13, g6Var), k6.w0(i14, g6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
        f(imageView4, i13, a03);
        imageView4.setBackground(new c2(a03));
        linearLayout2.addView(imageView4, w7.z5.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        w7.b6.a(imageView4);
        imageView4.setContentDescription("AI");
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15428a;
                        qVar.f15508r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15428a.f15508r.f4(view3);
                        return;
                    case 2:
                        lVar.f15428a.f15508r.g4();
                        return;
                    case 3:
                        lVar.f15428a.f15508r.d4();
                        return;
                    case 4:
                        lVar.f15428a.f15508r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15428a;
                        n3 n22 = qVar2.f15508r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28365a);
                                e0Var.n0(a2);
                                e0Var.f25774k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15428a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15428a.f15508r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15428a.f15508r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15428a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15507n, context2, new ig.k0(lVar2, 5), qVar3.f28365a).show();
                        return;
                    case 10:
                        q.O(lVar.f15428a);
                        return;
                    default:
                        q qVar4 = lVar.f15428a;
                        qVar4.f15508r.f15648c4 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        ShapeDrawable c03 = k6.c0(AndroidUtilities.dp(22.0f), k6.w0(i12, g6Var));
        f(frameLayout5, i12, c03);
        frameLayout5.setBackground(new c2(c03));
        frameLayout4.addView(frameLayout5, w7.z5.e(-2, 44, 81));
        w1 w1Var = new w1(context, 1);
        w1Var.setClipToOutline(true);
        w1Var.setOutlineProvider(new ci.n1(5));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f15213y = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout3.setOrientation(0);
        w1Var.addView(linearLayout3);
        frameLayout5.addView(w1Var, w7.z5.c(-1.0f, -1));
        ah ahVar = new ah(context, 24);
        this.f15212x = ahVar;
        ahVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        r6.t(ahVar, i15, g6Var, mode);
        org.telegram.ui.Cells.y a04 = k6.a0(k6.w0(i12, g6Var), k6.w0(i14, g6Var), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        n6 O3 = r6.O(i12);
        n6 O4 = r6.O(i14);
        ahVar.setBackground(a04);
        r6.k(ahVar, a04, O3, O4, g6Var);
        ahVar.j(yg.e, false);
        linearLayout3.addView(ahVar, w7.z5.q(38, 38, 16));
        w7.b6.a(ahVar);
        ahVar.setContentDescription("Emoji");
        ahVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15428a;
                        qVar.f15508r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15428a.f15508r.f4(view3);
                        return;
                    case 2:
                        lVar.f15428a.f15508r.g4();
                        return;
                    case 3:
                        lVar.f15428a.f15508r.d4();
                        return;
                    case 4:
                        lVar.f15428a.f15508r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15428a;
                        n3 n22 = qVar2.f15508r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28365a);
                                e0Var.n0(a2);
                                e0Var.f25774k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15428a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15428a.f15508r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15428a.f15508r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15428a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15507n, context2, new ig.k0(lVar2, 5), qVar3.f28365a).show();
                        return;
                    case 10:
                        q.O(lVar.f15428a);
                        return;
                    default:
                        q qVar4 = lVar.f15428a;
                        qVar4.f15508r.f15648c4 = null;
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
        r6.t(imageView5, i15, g6Var, mode);
        org.telegram.ui.Cells.y a05 = k6.a0(k6.w0(i12, g6Var), k6.w0(i14, g6Var), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        n6 O5 = r6.O(i12);
        n6 O6 = r6.O(i14);
        imageView5.setBackground(a05);
        r6.k(imageView5, a05, O5, O6, g6Var);
        linearLayout3.addView(imageView5, w7.z5.t(38, 38, 16, 2, 0, 0, 0));
        w7.b6.a(imageView5);
        imageView5.setContentDescription("Attach");
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15428a;
                        qVar.f15508r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15428a.f15508r.f4(view3);
                        return;
                    case 2:
                        lVar.f15428a.f15508r.g4();
                        return;
                    case 3:
                        lVar.f15428a.f15508r.d4();
                        return;
                    case 4:
                        lVar.f15428a.f15508r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15428a;
                        n3 n22 = qVar2.f15508r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28365a);
                                e0Var.n0(a2);
                                e0Var.f25774k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15428a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15428a.f15508r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15428a.f15508r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15428a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15507n, context2, new ig.k0(lVar2, 5), qVar3.f28365a).show();
                        return;
                    case 10:
                        q.O(lVar.f15428a);
                        return;
                    default:
                        q qVar4 = lVar.f15428a;
                        qVar4.f15508r.f15648c4 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout2.addView(frameLayout4, w7.z5.l(1.0f, 0, 44));
        va1 va1Var = new va1(this, context, 5);
        this.G = va1Var;
        va1Var.setOrientation(0);
        va1Var.setClipToPadding(false);
        va1Var.setClipChildren(false);
        va1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(va1Var, w7.z5.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.H = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(frameLayout6, w7.z5.e(80, 60, 81));
        ?? imageView6 = new ImageView(context);
        this.I = imageView6;
        imageView6.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        yj0 animatedDrawable = imageView6.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(k6.w0(i15, g6Var), mode));
        ShapeDrawable c04 = k6.c0(AndroidUtilities.dp(22.0f), k6.w0(i13, g6Var));
        f(imageView6, i13, c04);
        imageView6.setBackground(new c2(c04));
        frameLayout6.addView((View) imageView6, w7.z5.e(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        ShapeDrawable c05 = k6.c0(AndroidUtilities.dp(22.0f), k6.w0(i13, g6Var));
        f(frameLayout7, i13, c05);
        frameLayout7.setBackground(new c2(c05));
        va1Var.addView(frameLayout7, w7.z5.c(44.0f, -2));
        a4 a4Var = new a4(this, context, 0);
        a4Var.setHorizontalScrollBarEnabled(false);
        a4Var.setClipToOutline(true);
        a4Var.setOutlineProvider(new ci.n1(6));
        frameLayout7.addView(a4Var, w7.z5.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.J = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        a4Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(R.drawable.formatting_bold, 1, false);
        b(R.drawable.formatting_italic, 2, false);
        b(R.drawable.formatting_underline, 16, false);
        b(R.drawable.formatting_strikethrough, 8, false);
        b(R.drawable.formatting_spoiler, 256, false);
        b(R.drawable.iv_code, 4, false);
        b(R.drawable.iv_sub, 16384, true);
        b(R.drawable.iv_super, 32768, true);
        z1 z1Var = new z1(context, R.drawable.iv_quote, g6Var);
        this.S = z1Var;
        z1Var.c(i13);
        z1Var.setContentDescription(LocaleController.getString(R.string.Quote));
        z1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15428a;
                        qVar.f15508r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15428a.f15508r.f4(view3);
                        return;
                    case 2:
                        lVar.f15428a.f15508r.g4();
                        return;
                    case 3:
                        lVar.f15428a.f15508r.d4();
                        return;
                    case 4:
                        lVar.f15428a.f15508r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15428a;
                        n3 n22 = qVar2.f15508r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28365a);
                                e0Var.n0(a2);
                                e0Var.f25774k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15428a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15428a.f15508r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15428a.f15508r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15428a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15507n, context2, new ig.k0(lVar2, 5), qVar3.f28365a).show();
                        return;
                    case 10:
                        q.O(lVar.f15428a);
                        return;
                    default:
                        q qVar4 = lVar.f15428a;
                        qVar4.f15508r.f15648c4 = null;
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
        linearLayout4.addView(z1Var, w7.z5.t(38, 38, 16, i10, 0, 0, 0));
        z1 z1Var2 = new z1(context, R.drawable.iv_button, g6Var);
        this.P = z1Var2;
        z1Var2.c(i13);
        z1Var2.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        z1Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15428a;
                        qVar.f15508r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15428a.f15508r.f4(view3);
                        return;
                    case 2:
                        lVar.f15428a.f15508r.g4();
                        return;
                    case 3:
                        lVar.f15428a.f15508r.d4();
                        return;
                    case 4:
                        lVar.f15428a.f15508r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15428a;
                        n3 n22 = qVar2.f15508r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28365a);
                                e0Var.n0(a2);
                                e0Var.f25774k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15428a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15428a.f15508r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15428a.f15508r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15428a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15507n, context2, new ig.k0(lVar2, 5), qVar3.f28365a).show();
                        return;
                    case 10:
                        q.O(lVar.f15428a);
                        return;
                    default:
                        q qVar4 = lVar.f15428a;
                        qVar4.f15508r.f15648c4 = null;
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
        linearLayout4.addView(z1Var2, w7.z5.t(38, 38, 16, i11, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.M = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        ShapeDrawable c06 = k6.c0(AndroidUtilities.dp(22.0f), k6.w0(i13, g6Var));
        f(linearLayout5, i13, c06);
        linearLayout5.setBackground(new c2(c06));
        va1Var.addView(linearLayout5, w7.z5.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        z1 z1Var3 = new z1(context, R.drawable.media_link_24, g6Var);
        this.O = z1Var3;
        z1Var3.c(i13);
        z1Var3.setContentDescription(LocaleController.getString(R.string.CreateLink));
        z1Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15428a;
                        qVar.f15508r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15428a.f15508r.f4(view3);
                        return;
                    case 2:
                        lVar.f15428a.f15508r.g4();
                        return;
                    case 3:
                        lVar.f15428a.f15508r.d4();
                        return;
                    case 4:
                        lVar.f15428a.f15508r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15428a;
                        n3 n22 = qVar2.f15508r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28365a);
                                e0Var.n0(a2);
                                e0Var.f25774k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15428a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15428a.f15508r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15428a.f15508r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15428a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15507n, context2, new ig.k0(lVar2, 5), qVar3.f28365a).show();
                        return;
                    case 10:
                        q.O(lVar.f15428a);
                        return;
                    default:
                        q qVar4 = lVar.f15428a;
                        qVar4.f15508r.f15648c4 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(z1Var3, w7.z5.q(38, 38, 16));
        z1 z1Var4 = new z1(context, R.drawable.msg_calendar2, g6Var);
        this.Q = z1Var4;
        z1Var4.c(i13);
        z1Var4.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        z1Var4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15428a;
                        qVar.f15508r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15428a.f15508r.f4(view3);
                        return;
                    case 2:
                        lVar.f15428a.f15508r.g4();
                        return;
                    case 3:
                        lVar.f15428a.f15508r.d4();
                        return;
                    case 4:
                        lVar.f15428a.f15508r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15428a;
                        n3 n22 = qVar2.f15508r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28365a);
                                e0Var.n0(a2);
                                e0Var.f25774k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15428a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15428a.f15508r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15428a.f15508r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15428a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15507n, context2, new ig.k0(lVar2, 5), qVar3.f28365a).show();
                        return;
                    case 10:
                        q.O(lVar.f15428a);
                        return;
                    default:
                        q qVar4 = lVar.f15428a;
                        qVar4.f15508r.f15648c4 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(z1Var4, w7.z5.q(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.N = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        ShapeDrawable c07 = k6.c0(AndroidUtilities.dp(22.0f), k6.w0(i13, g6Var));
        f(linearLayout6, i13, c07);
        linearLayout6.setBackground(new c2(c07));
        va1Var.addView(linearLayout6, w7.z5.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        z1 z1Var5 = new z1(context, R.drawable.iv_math, g6Var);
        this.R = z1Var5;
        z1Var5.c(i13);
        z1Var5.d();
        arrayList.add(z1Var5);
        z1Var5.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        z1Var5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15428a;
                        qVar.f15508r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15428a.f15508r.f4(view3);
                        return;
                    case 2:
                        lVar.f15428a.f15508r.g4();
                        return;
                    case 3:
                        lVar.f15428a.f15508r.d4();
                        return;
                    case 4:
                        lVar.f15428a.f15508r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15428a;
                        n3 n22 = qVar2.f15508r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28365a);
                                e0Var.n0(a2);
                                e0Var.f25774k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15428a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15428a.f15508r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15428a.f15508r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15428a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15507n, context2, new ig.k0(lVar2, 5), qVar3.f28365a).show();
                        return;
                    case 10:
                        q.O(lVar.f15428a);
                        return;
                    default:
                        q qVar4 = lVar.f15428a;
                        qVar4.f15508r.f15648c4 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout6.addView(z1Var5, w7.z5.q(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.L = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        ShapeDrawable c08 = k6.c0(AndroidUtilities.dp(22.0f), k6.w0(i13, g6Var));
        f(linearLayout7, i13, c08);
        linearLayout7.setBackground(new c2(c08));
        va1Var.addView(linearLayout7, 0, w7.z5.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        z1 z1Var6 = new z1(context, R.drawable.input_ai, g6Var);
        z1Var6.setImageDrawable(new org.telegram.ui.Components.i0(context));
        z1Var6.c(i13);
        z1Var6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        z1Var6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15428a;
                        qVar.f15508r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15428a.f15508r.f4(view3);
                        return;
                    case 2:
                        lVar.f15428a.f15508r.g4();
                        return;
                    case 3:
                        lVar.f15428a.f15508r.d4();
                        return;
                    case 4:
                        lVar.f15428a.f15508r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15428a;
                        n3 n22 = qVar2.f15508r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28365a);
                                e0Var.n0(a2);
                                e0Var.f25774k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15428a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15428a.f15508r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15428a.f15508r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15428a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15507n, context2, new ig.k0(lVar2, 5), qVar3.f28365a).show();
                        return;
                    case 10:
                        q.O(lVar.f15428a);
                        return;
                    default:
                        q qVar4 = lVar.f15428a;
                        qVar4.f15508r.f15648c4 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout7.addView(z1Var6, w7.z5.q(38, 38, 16));
        y1 y1Var = new y1(R.drawable.send_plane_24, 1, context, this, g6Var);
        this.F = y1Var;
        int i16 = k6.Yd;
        ShapeDrawable c09 = k6.c0(AndroidUtilities.dp(22.0f), k6.w0(i16, g6Var));
        f(y1Var, i16, c09);
        y1Var.setBackground(new c2(c09));
        w7.b6.a(y1Var);
        linearLayout2.addView(y1Var, w7.z5.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        y1Var.setContentDescription("Send");
        y1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15428a;
                        qVar.f15508r.W4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15428a.f15508r.f4(view3);
                        return;
                    case 2:
                        lVar.f15428a.f15508r.g4();
                        return;
                    case 3:
                        lVar.f15428a.f15508r.d4();
                        return;
                    case 4:
                        lVar.f15428a.f15508r.h4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15428a;
                        n3 n22 = qVar2.f15508r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28365a);
                                e0Var.n0(a2);
                                e0Var.f25774k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15428a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15428a.f15508r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15428a.f15508r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15428a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15507n, context2, new ig.k0(lVar2, 5), qVar3.f28365a).show();
                        return;
                    case 10:
                        q.O(lVar.f15428a);
                        return;
                    default:
                        q qVar4 = lVar.f15428a;
                        qVar4.f15508r.f15648c4 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        y1Var.setOnLongClickListener(new ei.c5(lVar, 4));
        g(0, false);
    }

    public final void a(int i10, int i11, boolean z10) {
        int i12;
        LinearLayout linearLayout = this.f15213y;
        z1 z1Var = new z1(linearLayout.getContext(), i10, this.f15193b);
        z1Var.c(k6.f21183d6);
        if (z10) {
            z1Var.d();
            this.V.add(z1Var);
        }
        z1Var.setTag(Integer.valueOf(i11));
        z1Var.setContentDescription(d2.g0(i11));
        z1Var.setOnClickListener(new z3(this, i11, 1));
        this.T.add(z1Var);
        if (linearLayout.getChildCount() == 0) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        linearLayout.addView(z1Var, w7.z5.t(38, 38, 16, i12, 0, 0, 0));
    }

    public final void b(int i10, int i11, boolean z10) {
        int i12;
        z1 z1Var = new z1(getContext(), i10, this.f15193b);
        z1Var.c(k6.Yk);
        if (z10) {
            z1Var.d();
            this.V.add(z1Var);
        }
        z1Var.setTag(Integer.valueOf(i11));
        z1Var.setContentDescription(d2.i0(i11));
        z1Var.setOnClickListener(new z3(this, i11, 0));
        this.U.add(z1Var);
        LinearLayout linearLayout = this.J;
        if (linearLayout.getChildCount() == 0) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        linearLayout.addView(z1Var, w7.z5.t(38, 38, 16, i12, 0, 0, 0));
    }

    public final void c(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        ArrayList arrayList = this.U;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            z1 z1Var = (z1) obj;
            int intValue = ((Integer) z1Var.getTag()).intValue();
            if ((i10 & intValue) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            z1Var.setSelected(z15);
            if (intValue == 1 || intValue == 2) {
                z1Var.setEnabled(z14);
            }
        }
        z1 z1Var2 = this.O;
        z1Var2.setSelected(z10);
        z1 z1Var3 = this.Q;
        z1Var3.setSelected(z11);
        z1Var2.setEnabled(z12);
        this.P.setEnabled(z13);
        z1Var3.setEnabled(z12);
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
            z1 z1Var = (z1) obj;
            if (i10 == ((Integer) z1Var.getTag()).intValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            z1Var.setSelected(z10);
            if (z10 && i11 != 0) {
                z1Var.e(i11);
            } else {
                z1Var.a();
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        int i10;
        if (this.f15196c0 != z10 || !z11) {
            this.f15196c0 = z10;
            if (z10) {
                f7 = 1.15f;
            } else {
                f7 = 1.0f;
            }
            bk0 bk0Var = this.I;
            if (z11) {
                bk0Var.animate().scaleX(f7).scaleY(f7).setDuration(180L).setInterpolator(bs.h).start();
            } else {
                bk0Var.animate().cancel();
                bk0Var.setScaleX(f7);
                bk0Var.setScaleY(f7);
            }
            if (z10) {
                i10 = k6.f21421q7;
            } else {
                i10 = k6.G6;
            }
            bk0Var.setColorFilter(new PorterDuffColorFilter(k6.w0(i10, this.f15193b), PorterDuff.Mode.SRC_IN));
            yj0 animatedDrawable = bk0Var.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f32933a0 > 34) {
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
        this.f15200f0.add(view);
        this.f15201g0.add(drawable);
        this.f15202h0.add(Integer.valueOf(i10));
        org.telegram.ui.ActionBar.g6 g6Var = this.f15193b;
        this.f15203i0.add(Integer.valueOf(k6.w0(i10, g6Var)));
        if (drawable instanceof RippleDrawable) {
            i11 = k6.v(k6.w0(i10, g6Var), k6.w0(k6.f21272i6, g6Var));
        } else {
            i11 = 0;
        }
        this.f15204j0.add(Integer.valueOf(i11));
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
        if (this.f15192a0 == i10) {
            return;
        }
        this.f15192a0 = i10;
        FrameLayout frameLayout = this.H;
        int i13 = 0;
        va1 va1Var = this.G;
        LinearLayout linearLayout = this.f15211w;
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
            bs bsVar = bs.h;
            duration.setInterpolator(bsVar).withEndAction(new Runnable(this) {
                public final b4 f15725b;

                {
                    this.f15725b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            b4 b4Var = this.f15725b;
                            if (b4Var.f15192a0 != 0) {
                                b4Var.f15211w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            b4 b4Var2 = this.f15725b;
                            if (b4Var2.f15192a0 != 1) {
                                b4Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            b4 b4Var3 = this.f15725b;
                            if (b4Var3.f15192a0 != 2) {
                                b4Var3.H.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            va1Var.setVisibility(0);
            ViewPropertyAnimator animate2 = va1Var.animate();
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
            scaleY2.translationY(dp4).setDuration(420L).setInterpolator(bsVar).withEndAction(new Runnable(this) {
                public final b4 f15725b;

                {
                    this.f15725b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            b4 b4Var = this.f15725b;
                            if (b4Var.f15192a0 != 0) {
                                b4Var.f15211w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            b4 b4Var2 = this.f15725b;
                            if (b4Var2.f15192a0 != 1) {
                                b4Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            b4 b4Var3 = this.f15725b;
                            if (b4Var3.f15192a0 != 2) {
                                b4Var3.H.setVisibility(8);
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
            scaleX3.scaleY(f24).setDuration(420L).setInterpolator(bsVar).withEndAction(new Runnable(this) {
                public final b4 f15725b;

                {
                    this.f15725b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            b4 b4Var = this.f15725b;
                            if (b4Var.f15192a0 != 0) {
                                b4Var.f15211w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            b4 b4Var2 = this.f15725b;
                            if (b4Var2.f15192a0 != 1) {
                                b4Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            b4 b4Var3 = this.f15725b;
                            if (b4Var3.f15192a0 != 2) {
                                b4Var3.H.setVisibility(8);
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
        va1Var.setVisibility(i12);
        if (i10 == 1) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        va1Var.setAlpha(f12);
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.8f;
        }
        va1Var.setScaleX(f13);
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        va1Var.setScaleY(f14);
        if (i10 == 1) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(30.0f);
        }
        va1Var.setTranslationY(dp2);
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
        return this.f15210s;
    }

    public FrameLayout getBottomInnerContainer() {
        return this.v;
    }

    public LinearLayout getBottomPanel() {
        return this.f15211w;
    }

    public View getEmojiButton() {
        return this.f15212x;
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
        this.f15199f.setVisibility(i10);
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
        ah ahVar = this.f15212x;
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
            ((z1) obj).setPremiumLocked(z10);
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
        y1 y1Var = this.F;
        if (y1Var.isEnabled() == z10) {
            return;
        }
        y1Var.setEnabled(z10);
        ViewPropertyAnimator animate = y1Var.animate();
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        sl.s(animate, f7, 150L);
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
        ImageView imageView = this.f15199f;
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
        this.f15195c.setVisibility(i10);
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
        this.f15195c.setVisibility(i11);
    }

    @Override
    public final void updateColors() {
        throw new UnsupportedOperationException("Method not decompiled: ki.b4.updateColors():void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
