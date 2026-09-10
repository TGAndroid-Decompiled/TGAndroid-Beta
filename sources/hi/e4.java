package hi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xg;
import org.telegram.ui.gc1;
public final class e4 extends FrameLayout {
    public final ImageView E;
    public final b2 F;
    public final gc1 G;
    public final FrameLayout H;
    public final kj0 I;
    public final LinearLayout J;
    public int K;
    public final LinearLayout L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final c2 O;
    public final c2 P;
    public final c2 Q;
    public final c2 R;
    public final c2 S;
    public final ArrayList T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public final n f9543a;
    public int f9544a0;
    public final org.telegram.ui.ActionBar.f6 f9545b;
    public int f9546b0;
    public final View f9547c;
    public boolean f9548c0;
    public final View d;
    public final FrameLayout e;
    public final ImageView f9549f;
    public final LinearLayout h;
    public final ImageView f9550n;
    public final ImageView f9551r;
    public final FrameLayout f9552s;
    public final FrameLayout v;
    public final LinearLayout f9553w;
    public final dh f9554x;
    public final LinearLayout f9555y;

    public e4(Context context, final n nVar) {
        super(context);
        int i10;
        int i11;
        this.K = Integer.MAX_VALUE;
        this.T = new ArrayList();
        this.U = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.V = arrayList;
        this.f9544a0 = -1;
        this.f9546b0 = 0;
        this.f9543a = nVar;
        org.telegram.ui.ActionBar.f6 f6Var = nVar.f9749a.f26421a;
        this.f9545b = f6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.f9547c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i12 = org.telegram.ui.ActionBar.j6.f17928d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.l1(0.0f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var))}));
        addView(view, w7.a6.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var)), org.telegram.ui.ActionBar.j6.v0(i12, f6Var)}));
        addView(view2, w7.a6.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, w7.a6.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f9549f = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i13 = org.telegram.ui.ActionBar.j6.Yk;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
        int v03 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
        int i14 = org.telegram.ui.ActionBar.j6.f18017i6;
        imageView.setBackground(new f2(org.telegram.ui.ActionBar.j6.Z(v02, org.telegram.ui.ActionBar.j6.v(v03, org.telegram.ui.ActionBar.j6.v0(i14, f6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        int i15 = org.telegram.ui.ActionBar.j6.G6;
        int v04 = org.telegram.ui.ActionBar.j6.v0(i15, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        w7.c6.a(imageView);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView.setOnClickListener(new bi.d5(nVar, 3));
        frameLayout.addView(imageView, w7.a6.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(new f2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(i13, f6Var))));
        frameLayout.addView(linearLayout, w7.a6.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.f9550n = imageView2;
        imageView2.setImageResource(R.drawable.iv_undo);
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), 1, -1));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i15, f6Var), mode));
        w7.c6.a(imageView2);
        imageView2.setContentDescription("Undo");
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        s sVar = nVar.f9749a;
                        sVar.f9835r.P4();
                        sVar.W();
                        return;
                    case 1:
                        nVar.f9749a.f9835r.Y3(view3);
                        return;
                    case 2:
                        nVar.f9749a.f9835r.Z3();
                        return;
                    case 3:
                        nVar.f9749a.f9835r.W3();
                        return;
                    case 4:
                        nVar.f9749a.f9835r.a4();
                        return;
                    case 5:
                        s sVar2 = nVar.f9749a;
                        q3 g22 = sVar2.f9835r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(sVar2.getContext(), sVar2.f26421a);
                                g0Var.n0(a2);
                                g0Var.f23121k0 = new ai.b(g22, 21);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        nVar.f9749a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        k2 k2Var = nVar.f9749a.f9835r.J3;
                        if (k2Var != null) {
                            k2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        k2 k2Var2 = nVar.f9749a.f9835r.J3;
                        if (k2Var2 != null) {
                            k2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        n nVar2 = nVar;
                        s sVar3 = nVar2.f9749a;
                        Context context2 = sVar3.getContext();
                        new y(sVar3.f9834n, context2, new ai.b(nVar2, 22), sVar3.f26421a).show();
                        return;
                    case 10:
                        s.L(nVar.f9749a);
                        return;
                    default:
                        s sVar4 = nVar.f9749a;
                        sVar4.f9835r.f9993b4 = null;
                        s.O(sVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView2, w7.a6.q(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.f9551r = imageView3;
        imageView3.setImageResource(R.drawable.iv_redo);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), 1, -1));
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i15, f6Var), mode));
        w7.c6.a(imageView3);
        imageView3.setContentDescription("Redo");
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        s sVar = nVar.f9749a;
                        sVar.f9835r.P4();
                        sVar.W();
                        return;
                    case 1:
                        nVar.f9749a.f9835r.Y3(view3);
                        return;
                    case 2:
                        nVar.f9749a.f9835r.Z3();
                        return;
                    case 3:
                        nVar.f9749a.f9835r.W3();
                        return;
                    case 4:
                        nVar.f9749a.f9835r.a4();
                        return;
                    case 5:
                        s sVar2 = nVar.f9749a;
                        q3 g22 = sVar2.f9835r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(sVar2.getContext(), sVar2.f26421a);
                                g0Var.n0(a2);
                                g0Var.f23121k0 = new ai.b(g22, 21);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        nVar.f9749a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        k2 k2Var = nVar.f9749a.f9835r.J3;
                        if (k2Var != null) {
                            k2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        k2 k2Var2 = nVar.f9749a.f9835r.J3;
                        if (k2Var2 != null) {
                            k2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        n nVar2 = nVar;
                        s sVar3 = nVar2.f9749a;
                        Context context2 = sVar3.getContext();
                        new y(sVar3.f9834n, context2, new ai.b(nVar2, 22), sVar3.f26421a).show();
                        return;
                    case 10:
                        s.L(nVar.f9749a);
                        return;
                    default:
                        s sVar4 = nVar.f9749a;
                        sVar4.f9835r.f9993b4 = null;
                        s.O(sVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView3, w7.a6.q(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f9552s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, w7.a6.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, w7.a6.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f9553w = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout3.addView(linearLayout2, w7.a6.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.Components.k0(context));
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i15, f6Var), mode));
        imageView4.setBackground(new f2(org.telegram.ui.ActionBar.j6.Z(org.telegram.ui.ActionBar.j6.v0(i13, f6Var), org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(i13, f6Var), org.telegram.ui.ActionBar.j6.v0(i14, f6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        linearLayout2.addView(imageView4, w7.a6.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        w7.c6.a(imageView4);
        imageView4.setContentDescription("AI");
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        s sVar = nVar.f9749a;
                        sVar.f9835r.P4();
                        sVar.W();
                        return;
                    case 1:
                        nVar.f9749a.f9835r.Y3(view3);
                        return;
                    case 2:
                        nVar.f9749a.f9835r.Z3();
                        return;
                    case 3:
                        nVar.f9749a.f9835r.W3();
                        return;
                    case 4:
                        nVar.f9749a.f9835r.a4();
                        return;
                    case 5:
                        s sVar2 = nVar.f9749a;
                        q3 g22 = sVar2.f9835r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(sVar2.getContext(), sVar2.f26421a);
                                g0Var.n0(a2);
                                g0Var.f23121k0 = new ai.b(g22, 21);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        nVar.f9749a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        k2 k2Var = nVar.f9749a.f9835r.J3;
                        if (k2Var != null) {
                            k2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        k2 k2Var2 = nVar.f9749a.f9835r.J3;
                        if (k2Var2 != null) {
                            k2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        n nVar2 = nVar;
                        s sVar3 = nVar2.f9749a;
                        Context context2 = sVar3.getContext();
                        new y(sVar3.f9834n, context2, new ai.b(nVar2, 22), sVar3.f26421a).show();
                        return;
                    case 10:
                        s.L(nVar.f9749a);
                        return;
                    default:
                        s sVar4 = nVar.f9749a;
                        sVar4.f9835r.f9993b4 = null;
                        s.O(sVar4, 90, 0);
                        return;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setBackground(new f2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(i12, f6Var))));
        frameLayout4.addView(frameLayout5, w7.a6.e(-2, 44, 81));
        z1 z1Var = new z1(context, 1);
        z1Var.setClipToOutline(true);
        z1Var.setOutlineProvider(new bi.g(4));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f9555y = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout3.setOrientation(0);
        z1Var.addView(linearLayout3);
        frameLayout5.addView(z1Var, w7.a6.c(-1.0f, -1));
        dh dhVar = new dh(context, 24);
        this.f9554x = dhVar;
        dhVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        dhVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i15, f6Var), mode));
        dhVar.setBackground(org.telegram.ui.ActionBar.j6.Z(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(i14, f6Var), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        dhVar.j(bh.e, false);
        linearLayout3.addView(dhVar, w7.a6.q(38, 38, 16));
        w7.c6.a(dhVar);
        dhVar.setContentDescription("Emoji");
        dhVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        s sVar = nVar.f9749a;
                        sVar.f9835r.P4();
                        sVar.W();
                        return;
                    case 1:
                        nVar.f9749a.f9835r.Y3(view3);
                        return;
                    case 2:
                        nVar.f9749a.f9835r.Z3();
                        return;
                    case 3:
                        nVar.f9749a.f9835r.W3();
                        return;
                    case 4:
                        nVar.f9749a.f9835r.a4();
                        return;
                    case 5:
                        s sVar2 = nVar.f9749a;
                        q3 g22 = sVar2.f9835r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(sVar2.getContext(), sVar2.f26421a);
                                g0Var.n0(a2);
                                g0Var.f23121k0 = new ai.b(g22, 21);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        nVar.f9749a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        k2 k2Var = nVar.f9749a.f9835r.J3;
                        if (k2Var != null) {
                            k2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        k2 k2Var2 = nVar.f9749a.f9835r.J3;
                        if (k2Var2 != null) {
                            k2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        n nVar2 = nVar;
                        s sVar3 = nVar2.f9749a;
                        Context context2 = sVar3.getContext();
                        new y(sVar3.f9834n, context2, new ai.b(nVar2, 22), sVar3.f26421a).show();
                        return;
                    case 10:
                        s.L(nVar.f9749a);
                        return;
                    default:
                        s sVar4 = nVar.f9749a;
                        sVar4.f9835r.f9993b4 = null;
                        s.O(sVar4, 90, 0);
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
        imageView5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i15, f6Var), mode));
        imageView5.setBackground(org.telegram.ui.ActionBar.j6.Z(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(i14, f6Var), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        linearLayout3.addView(imageView5, w7.a6.t(38, 38, 16, 2, 0, 0, 0));
        w7.c6.a(imageView5);
        imageView5.setContentDescription("Attach");
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        s sVar = nVar.f9749a;
                        sVar.f9835r.P4();
                        sVar.W();
                        return;
                    case 1:
                        nVar.f9749a.f9835r.Y3(view3);
                        return;
                    case 2:
                        nVar.f9749a.f9835r.Z3();
                        return;
                    case 3:
                        nVar.f9749a.f9835r.W3();
                        return;
                    case 4:
                        nVar.f9749a.f9835r.a4();
                        return;
                    case 5:
                        s sVar2 = nVar.f9749a;
                        q3 g22 = sVar2.f9835r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(sVar2.getContext(), sVar2.f26421a);
                                g0Var.n0(a2);
                                g0Var.f23121k0 = new ai.b(g22, 21);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        nVar.f9749a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        k2 k2Var = nVar.f9749a.f9835r.J3;
                        if (k2Var != null) {
                            k2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        k2 k2Var2 = nVar.f9749a.f9835r.J3;
                        if (k2Var2 != null) {
                            k2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        n nVar2 = nVar;
                        s sVar3 = nVar2.f9749a;
                        Context context2 = sVar3.getContext();
                        new y(sVar3.f9834n, context2, new ai.b(nVar2, 22), sVar3.f26421a).show();
                        return;
                    case 10:
                        s.L(nVar.f9749a);
                        return;
                    default:
                        s sVar4 = nVar.f9749a;
                        sVar4.f9835r.f9993b4 = null;
                        s.O(sVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout2.addView(frameLayout4, w7.a6.l(1.0f, 0, 44));
        gc1 gc1Var = new gc1(this, context, 3);
        this.G = gc1Var;
        gc1Var.setOrientation(0);
        gc1Var.setClipToPadding(false);
        gc1Var.setClipChildren(false);
        gc1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(gc1Var, w7.a6.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.H = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(frameLayout6, w7.a6.e(80, 60, 81));
        ?? imageView6 = new ImageView(context);
        this.I = imageView6;
        imageView6.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        hj0 animatedDrawable = imageView6.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i15, f6Var), mode));
        imageView6.setBackground(new f2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(i13, f6Var))));
        frameLayout6.addView((View) imageView6, w7.a6.e(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        frameLayout7.setBackground(new f2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(i13, f6Var))));
        gc1Var.addView(frameLayout7, w7.a6.c(44.0f, -2));
        d4 d4Var = new d4(this, context, 0);
        d4Var.setHorizontalScrollBarEnabled(false);
        d4Var.setClipToOutline(true);
        d4Var.setOutlineProvider(new bi.g(5));
        frameLayout7.addView(d4Var, w7.a6.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.J = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        d4Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(R.drawable.formatting_bold, 1, false);
        b(R.drawable.formatting_italic, 2, false);
        b(R.drawable.formatting_underline, 16, false);
        b(R.drawable.formatting_strikethrough, 8, false);
        b(R.drawable.formatting_spoiler, 256, false);
        b(R.drawable.iv_code, 4, false);
        b(R.drawable.iv_sub, 16384, true);
        b(R.drawable.iv_super, 32768, true);
        c2 c2Var = new c2(context, R.drawable.iv_quote, f6Var);
        this.S = c2Var;
        c2Var.c(i13);
        c2Var.setContentDescription(LocaleController.getString(R.string.Quote));
        c2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        s sVar = nVar.f9749a;
                        sVar.f9835r.P4();
                        sVar.W();
                        return;
                    case 1:
                        nVar.f9749a.f9835r.Y3(view3);
                        return;
                    case 2:
                        nVar.f9749a.f9835r.Z3();
                        return;
                    case 3:
                        nVar.f9749a.f9835r.W3();
                        return;
                    case 4:
                        nVar.f9749a.f9835r.a4();
                        return;
                    case 5:
                        s sVar2 = nVar.f9749a;
                        q3 g22 = sVar2.f9835r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(sVar2.getContext(), sVar2.f26421a);
                                g0Var.n0(a2);
                                g0Var.f23121k0 = new ai.b(g22, 21);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        nVar.f9749a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        k2 k2Var = nVar.f9749a.f9835r.J3;
                        if (k2Var != null) {
                            k2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        k2 k2Var2 = nVar.f9749a.f9835r.J3;
                        if (k2Var2 != null) {
                            k2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        n nVar2 = nVar;
                        s sVar3 = nVar2.f9749a;
                        Context context2 = sVar3.getContext();
                        new y(sVar3.f9834n, context2, new ai.b(nVar2, 22), sVar3.f26421a).show();
                        return;
                    case 10:
                        s.L(nVar.f9749a);
                        return;
                    default:
                        s sVar4 = nVar.f9749a;
                        sVar4.f9835r.f9993b4 = null;
                        s.O(sVar4, 90, 0);
                        return;
                }
            }
        });
        if (linearLayout4.getChildCount() == 0) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        linearLayout4.addView(c2Var, w7.a6.t(38, 38, 16, i10, 0, 0, 0));
        c2 c2Var2 = new c2(context, R.drawable.iv_button, f6Var);
        this.P = c2Var2;
        c2Var2.c(i13);
        c2Var2.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        c2Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        s sVar = nVar.f9749a;
                        sVar.f9835r.P4();
                        sVar.W();
                        return;
                    case 1:
                        nVar.f9749a.f9835r.Y3(view3);
                        return;
                    case 2:
                        nVar.f9749a.f9835r.Z3();
                        return;
                    case 3:
                        nVar.f9749a.f9835r.W3();
                        return;
                    case 4:
                        nVar.f9749a.f9835r.a4();
                        return;
                    case 5:
                        s sVar2 = nVar.f9749a;
                        q3 g22 = sVar2.f9835r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(sVar2.getContext(), sVar2.f26421a);
                                g0Var.n0(a2);
                                g0Var.f23121k0 = new ai.b(g22, 21);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        nVar.f9749a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        k2 k2Var = nVar.f9749a.f9835r.J3;
                        if (k2Var != null) {
                            k2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        k2 k2Var2 = nVar.f9749a.f9835r.J3;
                        if (k2Var2 != null) {
                            k2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        n nVar2 = nVar;
                        s sVar3 = nVar2.f9749a;
                        Context context2 = sVar3.getContext();
                        new y(sVar3.f9834n, context2, new ai.b(nVar2, 22), sVar3.f26421a).show();
                        return;
                    case 10:
                        s.L(nVar.f9749a);
                        return;
                    default:
                        s sVar4 = nVar.f9749a;
                        sVar4.f9835r.f9993b4 = null;
                        s.O(sVar4, 90, 0);
                        return;
                }
            }
        });
        if (linearLayout4.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout4.addView(c2Var2, w7.a6.t(38, 38, 16, i11, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.M = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout5.setBackground(new f2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(i13, f6Var))));
        gc1Var.addView(linearLayout5, w7.a6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        c2 c2Var3 = new c2(context, R.drawable.media_link_24, f6Var);
        this.O = c2Var3;
        c2Var3.c(i13);
        c2Var3.setContentDescription(LocaleController.getString(R.string.CreateLink));
        c2Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        s sVar = nVar.f9749a;
                        sVar.f9835r.P4();
                        sVar.W();
                        return;
                    case 1:
                        nVar.f9749a.f9835r.Y3(view3);
                        return;
                    case 2:
                        nVar.f9749a.f9835r.Z3();
                        return;
                    case 3:
                        nVar.f9749a.f9835r.W3();
                        return;
                    case 4:
                        nVar.f9749a.f9835r.a4();
                        return;
                    case 5:
                        s sVar2 = nVar.f9749a;
                        q3 g22 = sVar2.f9835r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(sVar2.getContext(), sVar2.f26421a);
                                g0Var.n0(a2);
                                g0Var.f23121k0 = new ai.b(g22, 21);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        nVar.f9749a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        k2 k2Var = nVar.f9749a.f9835r.J3;
                        if (k2Var != null) {
                            k2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        k2 k2Var2 = nVar.f9749a.f9835r.J3;
                        if (k2Var2 != null) {
                            k2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        n nVar2 = nVar;
                        s sVar3 = nVar2.f9749a;
                        Context context2 = sVar3.getContext();
                        new y(sVar3.f9834n, context2, new ai.b(nVar2, 22), sVar3.f26421a).show();
                        return;
                    case 10:
                        s.L(nVar.f9749a);
                        return;
                    default:
                        s sVar4 = nVar.f9749a;
                        sVar4.f9835r.f9993b4 = null;
                        s.O(sVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(c2Var3, w7.a6.q(38, 38, 16));
        c2 c2Var4 = new c2(context, R.drawable.msg_calendar2, f6Var);
        this.Q = c2Var4;
        c2Var4.c(i13);
        c2Var4.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        c2Var4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        s sVar = nVar.f9749a;
                        sVar.f9835r.P4();
                        sVar.W();
                        return;
                    case 1:
                        nVar.f9749a.f9835r.Y3(view3);
                        return;
                    case 2:
                        nVar.f9749a.f9835r.Z3();
                        return;
                    case 3:
                        nVar.f9749a.f9835r.W3();
                        return;
                    case 4:
                        nVar.f9749a.f9835r.a4();
                        return;
                    case 5:
                        s sVar2 = nVar.f9749a;
                        q3 g22 = sVar2.f9835r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(sVar2.getContext(), sVar2.f26421a);
                                g0Var.n0(a2);
                                g0Var.f23121k0 = new ai.b(g22, 21);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        nVar.f9749a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        k2 k2Var = nVar.f9749a.f9835r.J3;
                        if (k2Var != null) {
                            k2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        k2 k2Var2 = nVar.f9749a.f9835r.J3;
                        if (k2Var2 != null) {
                            k2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        n nVar2 = nVar;
                        s sVar3 = nVar2.f9749a;
                        Context context2 = sVar3.getContext();
                        new y(sVar3.f9834n, context2, new ai.b(nVar2, 22), sVar3.f26421a).show();
                        return;
                    case 10:
                        s.L(nVar.f9749a);
                        return;
                    default:
                        s sVar4 = nVar.f9749a;
                        sVar4.f9835r.f9993b4 = null;
                        s.O(sVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(c2Var4, w7.a6.q(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.N = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout6.setBackground(new f2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(i13, f6Var))));
        gc1Var.addView(linearLayout6, w7.a6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        c2 c2Var5 = new c2(context, R.drawable.iv_math, f6Var);
        this.R = c2Var5;
        c2Var5.c(i13);
        c2Var5.d();
        arrayList.add(c2Var5);
        c2Var5.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        c2Var5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        s sVar = nVar.f9749a;
                        sVar.f9835r.P4();
                        sVar.W();
                        return;
                    case 1:
                        nVar.f9749a.f9835r.Y3(view3);
                        return;
                    case 2:
                        nVar.f9749a.f9835r.Z3();
                        return;
                    case 3:
                        nVar.f9749a.f9835r.W3();
                        return;
                    case 4:
                        nVar.f9749a.f9835r.a4();
                        return;
                    case 5:
                        s sVar2 = nVar.f9749a;
                        q3 g22 = sVar2.f9835r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(sVar2.getContext(), sVar2.f26421a);
                                g0Var.n0(a2);
                                g0Var.f23121k0 = new ai.b(g22, 21);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        nVar.f9749a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        k2 k2Var = nVar.f9749a.f9835r.J3;
                        if (k2Var != null) {
                            k2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        k2 k2Var2 = nVar.f9749a.f9835r.J3;
                        if (k2Var2 != null) {
                            k2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        n nVar2 = nVar;
                        s sVar3 = nVar2.f9749a;
                        Context context2 = sVar3.getContext();
                        new y(sVar3.f9834n, context2, new ai.b(nVar2, 22), sVar3.f26421a).show();
                        return;
                    case 10:
                        s.L(nVar.f9749a);
                        return;
                    default:
                        s sVar4 = nVar.f9749a;
                        sVar4.f9835r.f9993b4 = null;
                        s.O(sVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout6.addView(c2Var5, w7.a6.q(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.L = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout7.setBackground(new f2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(i13, f6Var))));
        gc1Var.addView(linearLayout7, 0, w7.a6.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        c2 c2Var6 = new c2(context, R.drawable.input_ai, f6Var);
        c2Var6.setImageDrawable(new org.telegram.ui.Components.k0(context));
        c2Var6.c(i13);
        c2Var6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        c2Var6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        s sVar = nVar.f9749a;
                        sVar.f9835r.P4();
                        sVar.W();
                        return;
                    case 1:
                        nVar.f9749a.f9835r.Y3(view3);
                        return;
                    case 2:
                        nVar.f9749a.f9835r.Z3();
                        return;
                    case 3:
                        nVar.f9749a.f9835r.W3();
                        return;
                    case 4:
                        nVar.f9749a.f9835r.a4();
                        return;
                    case 5:
                        s sVar2 = nVar.f9749a;
                        q3 g22 = sVar2.f9835r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(sVar2.getContext(), sVar2.f26421a);
                                g0Var.n0(a2);
                                g0Var.f23121k0 = new ai.b(g22, 21);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        nVar.f9749a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        k2 k2Var = nVar.f9749a.f9835r.J3;
                        if (k2Var != null) {
                            k2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        k2 k2Var2 = nVar.f9749a.f9835r.J3;
                        if (k2Var2 != null) {
                            k2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        n nVar2 = nVar;
                        s sVar3 = nVar2.f9749a;
                        Context context2 = sVar3.getContext();
                        new y(sVar3.f9834n, context2, new ai.b(nVar2, 22), sVar3.f26421a).show();
                        return;
                    case 10:
                        s.L(nVar.f9749a);
                        return;
                    default:
                        s sVar4 = nVar.f9749a;
                        sVar4.f9835r.f9993b4 = null;
                        s.O(sVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout7.addView(c2Var6, w7.a6.q(38, 38, 16));
        b2 b2Var = new b2(this, context, R.drawable.send_plane_24, f6Var, 1);
        this.F = b2Var;
        b2Var.setBackground(new f2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Yd, f6Var))));
        w7.c6.a(b2Var);
        linearLayout2.addView(b2Var, w7.a6.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        b2Var.setContentDescription("Send");
        b2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        s sVar = nVar.f9749a;
                        sVar.f9835r.P4();
                        sVar.W();
                        return;
                    case 1:
                        nVar.f9749a.f9835r.Y3(view3);
                        return;
                    case 2:
                        nVar.f9749a.f9835r.Z3();
                        return;
                    case 3:
                        nVar.f9749a.f9835r.W3();
                        return;
                    case 4:
                        nVar.f9749a.f9835r.a4();
                        return;
                    case 5:
                        s sVar2 = nVar.f9749a;
                        q3 g22 = sVar2.f9835r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(sVar2.getContext(), sVar2.f26421a);
                                g0Var.n0(a2);
                                g0Var.f23121k0 = new ai.b(g22, 21);
                                g0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        nVar.f9749a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        k2 k2Var = nVar.f9749a.f9835r.J3;
                        if (k2Var != null) {
                            k2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        k2 k2Var2 = nVar.f9749a.f9835r.J3;
                        if (k2Var2 != null) {
                            k2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        n nVar2 = nVar;
                        s sVar3 = nVar2.f9749a;
                        Context context2 = sVar3.getContext();
                        new y(sVar3.f9834n, context2, new ai.b(nVar2, 22), sVar3.f26421a).show();
                        return;
                    case 10:
                        s.L(nVar.f9749a);
                        return;
                    default:
                        s sVar4 = nVar.f9749a;
                        sVar4.f9835r.f9993b4 = null;
                        s.O(sVar4, 90, 0);
                        return;
                }
            }
        });
        b2Var.setOnLongClickListener(new bi.l6(nVar, 4));
        f(0, false);
    }

    public final void a(int i10, int i11, boolean z10) {
        int i12;
        LinearLayout linearLayout = this.f9555y;
        c2 c2Var = new c2(linearLayout.getContext(), i10, this.f9545b);
        c2Var.c(org.telegram.ui.ActionBar.j6.f17928d6);
        if (z10) {
            c2Var.d();
            this.V.add(c2Var);
        }
        c2Var.setTag(Integer.valueOf(i11));
        c2Var.setContentDescription(g2.g0(i11));
        c2Var.setOnClickListener(new c4(this, i11, 1));
        this.T.add(c2Var);
        if (linearLayout.getChildCount() == 0) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        linearLayout.addView(c2Var, w7.a6.t(38, 38, 16, i12, 0, 0, 0));
    }

    public final void b(int i10, int i11, boolean z10) {
        int i12;
        c2 c2Var = new c2(getContext(), i10, this.f9545b);
        c2Var.c(org.telegram.ui.ActionBar.j6.Yk);
        if (z10) {
            c2Var.d();
            this.V.add(c2Var);
        }
        c2Var.setTag(Integer.valueOf(i11));
        c2Var.setContentDescription(g2.i0(i11));
        c2Var.setOnClickListener(new c4(this, i11, 0));
        this.U.add(c2Var);
        LinearLayout linearLayout = this.J;
        if (linearLayout.getChildCount() == 0) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        linearLayout.addView(c2Var, w7.a6.t(38, 38, 16, i12, 0, 0, 0));
    }

    public final void c(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        ArrayList arrayList = this.U;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            c2 c2Var = (c2) obj;
            int intValue = ((Integer) c2Var.getTag()).intValue();
            if ((i10 & intValue) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            c2Var.setSelected(z15);
            if (intValue == 1 || intValue == 2) {
                c2Var.setEnabled(z14);
            }
        }
        c2 c2Var2 = this.O;
        c2Var2.setSelected(z10);
        c2 c2Var3 = this.Q;
        c2Var3.setSelected(z11);
        c2Var2.setEnabled(z12);
        this.P.setEnabled(z13);
        c2Var3.setEnabled(z12);
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
            c2 c2Var = (c2) obj;
            if (i10 == ((Integer) c2Var.getTag()).intValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            c2Var.setSelected(z10);
            if (z10 && i11 != 0) {
                c2Var.f(i11);
            } else {
                c2Var.a();
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        int i10;
        if (this.f9548c0 != z10 || !z11) {
            this.f9548c0 = z10;
            if (z10) {
                f7 = 1.15f;
            } else {
                f7 = 1.0f;
            }
            kj0 kj0Var = this.I;
            if (z11) {
                kj0Var.animate().scaleX(f7).scaleY(f7).setDuration(180L).setInterpolator(wr.h).start();
            } else {
                kj0Var.animate().cancel();
                kj0Var.setScaleX(f7);
                kj0Var.setScaleY(f7);
            }
            if (z10) {
                i10 = org.telegram.ui.ActionBar.j6.f18162q7;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.G6;
            }
            kj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, this.f9545b), PorterDuff.Mode.SRC_IN));
            hj0 animatedDrawable = kj0Var.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f23648b0 > 34) {
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

    public final void f(int i10, boolean z10) {
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
        if (this.f9544a0 == i10) {
            return;
        }
        this.f9544a0 = i10;
        FrameLayout frameLayout = this.H;
        int i13 = 0;
        gc1 gc1Var = this.G;
        LinearLayout linearLayout = this.f9553w;
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
            wr wrVar = wr.h;
            duration.setInterpolator(wrVar).withEndAction(new Runnable(this) {
                public final e4 f9474b;

                {
                    this.f9474b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            e4 e4Var = this.f9474b;
                            if (e4Var.f9544a0 != 0) {
                                e4Var.f9553w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            e4 e4Var2 = this.f9474b;
                            if (e4Var2.f9544a0 != 1) {
                                e4Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            e4 e4Var3 = this.f9474b;
                            if (e4Var3.f9544a0 != 2) {
                                e4Var3.H.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            gc1Var.setVisibility(0);
            ViewPropertyAnimator animate2 = gc1Var.animate();
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
            scaleY2.translationY(dp4).setDuration(420L).setInterpolator(wrVar).withEndAction(new Runnable(this) {
                public final e4 f9474b;

                {
                    this.f9474b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            e4 e4Var = this.f9474b;
                            if (e4Var.f9544a0 != 0) {
                                e4Var.f9553w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            e4 e4Var2 = this.f9474b;
                            if (e4Var2.f9544a0 != 1) {
                                e4Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            e4 e4Var3 = this.f9474b;
                            if (e4Var3.f9544a0 != 2) {
                                e4Var3.H.setVisibility(8);
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
            scaleX3.scaleY(f24).setDuration(420L).setInterpolator(wrVar).withEndAction(new Runnable(this) {
                public final e4 f9474b;

                {
                    this.f9474b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            e4 e4Var = this.f9474b;
                            if (e4Var.f9544a0 != 0) {
                                e4Var.f9553w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            e4 e4Var2 = this.f9474b;
                            if (e4Var2.f9544a0 != 1) {
                                e4Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            e4 e4Var3 = this.f9474b;
                            if (e4Var3.f9544a0 != 2) {
                                e4Var3.H.setVisibility(8);
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
        gc1Var.setVisibility(i12);
        if (i10 == 1) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        gc1Var.setAlpha(f12);
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.8f;
        }
        gc1Var.setScaleX(f13);
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        gc1Var.setScaleY(f14);
        if (i10 == 1) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(30.0f);
        }
        gc1Var.setTranslationY(dp2);
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
        return this.f9552s;
    }

    public FrameLayout getBottomInnerContainer() {
        return this.v;
    }

    public LinearLayout getBottomPanel() {
        return this.f9553w;
    }

    public View getEmojiButton() {
        return this.f9554x;
    }

    public xg getSendButton() {
        return this.F;
    }

    public void setBackVisible(boolean z10) {
        int i10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f9549f.setVisibility(i10);
    }

    public void setBottomGradientTranslationY(float f7) {
        this.d.setTranslationY(f7);
    }

    public void setEmojiOpened(boolean z10) {
        bh bhVar;
        String str;
        if (z10) {
            bhVar = bh.d;
        } else {
            bhVar = bh.e;
        }
        dh dhVar = this.f9554x;
        dhVar.j(bhVar, true);
        if (z10) {
            str = "Keyboard";
        } else {
            str = "Emoji";
        }
        dhVar.setContentDescription(str);
    }

    public void setPremiumLocked(boolean z10) {
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((c2) obj).setPremiumLocked(z10);
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
        b2 b2Var = this.F;
        if (b2Var.isEnabled() == z10) {
            return;
        }
        b2Var.setEnabled(z10);
        ViewPropertyAnimator animate = b2Var.animate();
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).setDuration(150L).start();
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
        ImageView imageView = this.f9549f;
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
        this.f9547c.setVisibility(i10);
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
        this.f9547c.setVisibility(i11);
    }
}
