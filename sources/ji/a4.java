package ji;

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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.zg;
import org.telegram.ui.cc1;
public final class a4 extends FrameLayout {
    public final ImageView E;
    public final x1 F;
    public final cc1 G;
    public final FrameLayout H;
    public final aj0 I;
    public final LinearLayout J;
    public int K;
    public final LinearLayout L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final y1 O;
    public final y1 P;
    public final y1 Q;
    public final y1 R;
    public final y1 S;
    public final ArrayList T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public final m f13788a;
    public int f13789a0;
    public final org.telegram.ui.ActionBar.f6 f13790b;
    public int f13791b0;
    public final View f13792c;
    public boolean f13793c0;
    public final View d;
    public final FrameLayout f13794e;
    public final ImageView f13795f;
    public final LinearLayout h;
    public final ImageView f13796n;
    public final ImageView f13797r;
    public final FrameLayout f13798s;
    public final FrameLayout v;
    public final LinearLayout f13799w;
    public final bh f13800x;
    public final LinearLayout f13801y;

    public a4(Context context, final m mVar) {
        super(context);
        int i10;
        int i11;
        this.K = Integer.MAX_VALUE;
        this.T = new ArrayList();
        this.U = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.V = arrayList;
        this.f13789a0 = -1;
        this.f13791b0 = 0;
        this.f13788a = mVar;
        org.telegram.ui.ActionBar.f6 f6Var = mVar.f14074a.f28779a;
        this.f13790b = f6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.f13792c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i12 = org.telegram.ui.ActionBar.j6.f20690d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.l1(0.0f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var))}));
        addView(view, w7.x5.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var)), org.telegram.ui.ActionBar.j6.v0(i12, f6Var)}));
        addView(view2, w7.x5.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f13794e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, w7.x5.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f13795f = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i13 = org.telegram.ui.ActionBar.j6.Yk;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
        int v03 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
        int i14 = org.telegram.ui.ActionBar.j6.f20780i6;
        imageView.setBackground(new b2(org.telegram.ui.ActionBar.j6.Z(v02, org.telegram.ui.ActionBar.j6.v(v03, org.telegram.ui.ActionBar.j6.v0(i14, f6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        int i15 = org.telegram.ui.ActionBar.j6.G6;
        int v04 = org.telegram.ui.ActionBar.j6.v0(i15, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        w7.z5.a(imageView);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView.setOnClickListener(new ah.f(mVar, 5));
        frameLayout.addView(imageView, w7.x5.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(i13, f6Var))));
        frameLayout.addView(linearLayout, w7.x5.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.f13796n = imageView2;
        imageView2.setImageResource(R.drawable.iv_undo);
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), 1, -1));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i15, f6Var), mode));
        w7.z5.a(imageView2);
        imageView2.setContentDescription("Undo");
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f14074a;
                        rVar.f14159r.P4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f14074a.f14159r.Y3(view3);
                        return;
                    case 2:
                        mVar.f14074a.f14159r.Z3();
                        return;
                    case 3:
                        mVar.f14074a.f14159r.W3();
                        return;
                    case 4:
                        mVar.f14074a.f14159r.a4();
                        return;
                    case 5:
                        r rVar2 = mVar.f14074a;
                        m3 g22 = rVar2.f14159r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(rVar2.getContext(), rVar2.f28779a);
                                f0Var.n0(a2);
                                f0Var.f25856k0 = new bi.o1(g22, 25);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f14074a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        g2 g2Var = mVar.f14074a.f14159r.J3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = mVar.f14074a.f14159r.J3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f14074a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f14158n, context2, new bi.o1(mVar2, 26), rVar3.f28779a).show();
                        return;
                    case 10:
                        r.L(mVar.f14074a);
                        return;
                    default:
                        r rVar4 = mVar.f14074a;
                        rVar4.f14159r.f14267b4 = null;
                        r.O(rVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView2, w7.x5.q(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.f13797r = imageView3;
        imageView3.setImageResource(R.drawable.iv_redo);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), 1, -1));
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i15, f6Var), mode));
        w7.z5.a(imageView3);
        imageView3.setContentDescription("Redo");
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f14074a;
                        rVar.f14159r.P4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f14074a.f14159r.Y3(view3);
                        return;
                    case 2:
                        mVar.f14074a.f14159r.Z3();
                        return;
                    case 3:
                        mVar.f14074a.f14159r.W3();
                        return;
                    case 4:
                        mVar.f14074a.f14159r.a4();
                        return;
                    case 5:
                        r rVar2 = mVar.f14074a;
                        m3 g22 = rVar2.f14159r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(rVar2.getContext(), rVar2.f28779a);
                                f0Var.n0(a2);
                                f0Var.f25856k0 = new bi.o1(g22, 25);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f14074a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        g2 g2Var = mVar.f14074a.f14159r.J3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = mVar.f14074a.f14159r.J3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f14074a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f14158n, context2, new bi.o1(mVar2, 26), rVar3.f28779a).show();
                        return;
                    case 10:
                        r.L(mVar.f14074a);
                        return;
                    default:
                        r rVar4 = mVar.f14074a;
                        rVar4.f14159r.f14267b4 = null;
                        r.O(rVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView3, w7.x5.q(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f13798s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, w7.x5.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, w7.x5.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f13799w = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout3.addView(linearLayout2, w7.x5.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.Components.j0(context));
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i15, f6Var), mode));
        imageView4.setBackground(new b2(org.telegram.ui.ActionBar.j6.Z(org.telegram.ui.ActionBar.j6.v0(i13, f6Var), org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(i13, f6Var), org.telegram.ui.ActionBar.j6.v0(i14, f6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        linearLayout2.addView(imageView4, w7.x5.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        w7.z5.a(imageView4);
        imageView4.setContentDescription("AI");
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f14074a;
                        rVar.f14159r.P4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f14074a.f14159r.Y3(view3);
                        return;
                    case 2:
                        mVar.f14074a.f14159r.Z3();
                        return;
                    case 3:
                        mVar.f14074a.f14159r.W3();
                        return;
                    case 4:
                        mVar.f14074a.f14159r.a4();
                        return;
                    case 5:
                        r rVar2 = mVar.f14074a;
                        m3 g22 = rVar2.f14159r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(rVar2.getContext(), rVar2.f28779a);
                                f0Var.n0(a2);
                                f0Var.f25856k0 = new bi.o1(g22, 25);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f14074a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        g2 g2Var = mVar.f14074a.f14159r.J3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = mVar.f14074a.f14159r.J3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f14074a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f14158n, context2, new bi.o1(mVar2, 26), rVar3.f28779a).show();
                        return;
                    case 10:
                        r.L(mVar.f14074a);
                        return;
                    default:
                        r rVar4 = mVar.f14074a;
                        rVar4.f14159r.f14267b4 = null;
                        r.O(rVar4, 90, 0);
                        return;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(i12, f6Var))));
        frameLayout4.addView(frameLayout5, w7.x5.e(-2, 44, 81));
        v1 v1Var = new v1(context, 1);
        v1Var.setClipToOutline(true);
        v1Var.setOutlineProvider(new bi.z1(5));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f13801y = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout3.setOrientation(0);
        v1Var.addView(linearLayout3);
        frameLayout5.addView(v1Var, w7.x5.c(-1.0f, -1));
        bh bhVar = new bh(context, 24);
        this.f13800x = bhVar;
        bhVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        bhVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i15, f6Var), mode));
        bhVar.setBackground(org.telegram.ui.ActionBar.j6.Z(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(i14, f6Var), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        bhVar.j(zg.f33179e, false);
        linearLayout3.addView(bhVar, w7.x5.q(38, 38, 16));
        w7.z5.a(bhVar);
        bhVar.setContentDescription("Emoji");
        bhVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f14074a;
                        rVar.f14159r.P4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f14074a.f14159r.Y3(view3);
                        return;
                    case 2:
                        mVar.f14074a.f14159r.Z3();
                        return;
                    case 3:
                        mVar.f14074a.f14159r.W3();
                        return;
                    case 4:
                        mVar.f14074a.f14159r.a4();
                        return;
                    case 5:
                        r rVar2 = mVar.f14074a;
                        m3 g22 = rVar2.f14159r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(rVar2.getContext(), rVar2.f28779a);
                                f0Var.n0(a2);
                                f0Var.f25856k0 = new bi.o1(g22, 25);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f14074a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        g2 g2Var = mVar.f14074a.f14159r.J3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = mVar.f14074a.f14159r.J3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f14074a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f14158n, context2, new bi.o1(mVar2, 26), rVar3.f28779a).show();
                        return;
                    case 10:
                        r.L(mVar.f14074a);
                        return;
                    default:
                        r rVar4 = mVar.f14074a;
                        rVar4.f14159r.f14267b4 = null;
                        r.O(rVar4, 90, 0);
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
        linearLayout3.addView(imageView5, w7.x5.t(38, 38, 16, 2, 0, 0, 0));
        w7.z5.a(imageView5);
        imageView5.setContentDescription("Attach");
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f14074a;
                        rVar.f14159r.P4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f14074a.f14159r.Y3(view3);
                        return;
                    case 2:
                        mVar.f14074a.f14159r.Z3();
                        return;
                    case 3:
                        mVar.f14074a.f14159r.W3();
                        return;
                    case 4:
                        mVar.f14074a.f14159r.a4();
                        return;
                    case 5:
                        r rVar2 = mVar.f14074a;
                        m3 g22 = rVar2.f14159r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(rVar2.getContext(), rVar2.f28779a);
                                f0Var.n0(a2);
                                f0Var.f25856k0 = new bi.o1(g22, 25);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f14074a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        g2 g2Var = mVar.f14074a.f14159r.J3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = mVar.f14074a.f14159r.J3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f14074a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f14158n, context2, new bi.o1(mVar2, 26), rVar3.f28779a).show();
                        return;
                    case 10:
                        r.L(mVar.f14074a);
                        return;
                    default:
                        r rVar4 = mVar.f14074a;
                        rVar4.f14159r.f14267b4 = null;
                        r.O(rVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout2.addView(frameLayout4, w7.x5.l(1.0f, 0, 44));
        cc1 cc1Var = new cc1(this, context, 3);
        this.G = cc1Var;
        cc1Var.setOrientation(0);
        cc1Var.setClipToPadding(false);
        cc1Var.setClipChildren(false);
        cc1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(cc1Var, w7.x5.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.H = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(frameLayout6, w7.x5.e(80, 60, 81));
        ?? imageView6 = new ImageView(context);
        this.I = imageView6;
        imageView6.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        xi0 animatedDrawable = imageView6.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.I(0);
            animatedDrawable.N(0);
        }
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i15, f6Var), mode));
        imageView6.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(i13, f6Var))));
        frameLayout6.addView((View) imageView6, w7.x5.e(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        frameLayout7.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(i13, f6Var))));
        cc1Var.addView(frameLayout7, w7.x5.c(44.0f, -2));
        z3 z3Var = new z3(this, context, 0);
        z3Var.setHorizontalScrollBarEnabled(false);
        z3Var.setClipToOutline(true);
        z3Var.setOutlineProvider(new bi.z1(6));
        frameLayout7.addView(z3Var, w7.x5.c(-1.0f, -1));
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
        y1 y1Var = new y1(context, R.drawable.iv_quote, f6Var);
        this.S = y1Var;
        y1Var.c(i13);
        y1Var.setContentDescription(LocaleController.getString(R.string.Quote));
        y1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f14074a;
                        rVar.f14159r.P4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f14074a.f14159r.Y3(view3);
                        return;
                    case 2:
                        mVar.f14074a.f14159r.Z3();
                        return;
                    case 3:
                        mVar.f14074a.f14159r.W3();
                        return;
                    case 4:
                        mVar.f14074a.f14159r.a4();
                        return;
                    case 5:
                        r rVar2 = mVar.f14074a;
                        m3 g22 = rVar2.f14159r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(rVar2.getContext(), rVar2.f28779a);
                                f0Var.n0(a2);
                                f0Var.f25856k0 = new bi.o1(g22, 25);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f14074a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        g2 g2Var = mVar.f14074a.f14159r.J3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = mVar.f14074a.f14159r.J3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f14074a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f14158n, context2, new bi.o1(mVar2, 26), rVar3.f28779a).show();
                        return;
                    case 10:
                        r.L(mVar.f14074a);
                        return;
                    default:
                        r rVar4 = mVar.f14074a;
                        rVar4.f14159r.f14267b4 = null;
                        r.O(rVar4, 90, 0);
                        return;
                }
            }
        });
        if (linearLayout4.getChildCount() == 0) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        linearLayout4.addView(y1Var, w7.x5.t(38, 38, 16, i10, 0, 0, 0));
        y1 y1Var2 = new y1(context, R.drawable.iv_button, f6Var);
        this.P = y1Var2;
        y1Var2.c(i13);
        y1Var2.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        y1Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f14074a;
                        rVar.f14159r.P4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f14074a.f14159r.Y3(view3);
                        return;
                    case 2:
                        mVar.f14074a.f14159r.Z3();
                        return;
                    case 3:
                        mVar.f14074a.f14159r.W3();
                        return;
                    case 4:
                        mVar.f14074a.f14159r.a4();
                        return;
                    case 5:
                        r rVar2 = mVar.f14074a;
                        m3 g22 = rVar2.f14159r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(rVar2.getContext(), rVar2.f28779a);
                                f0Var.n0(a2);
                                f0Var.f25856k0 = new bi.o1(g22, 25);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f14074a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        g2 g2Var = mVar.f14074a.f14159r.J3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = mVar.f14074a.f14159r.J3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f14074a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f14158n, context2, new bi.o1(mVar2, 26), rVar3.f28779a).show();
                        return;
                    case 10:
                        r.L(mVar.f14074a);
                        return;
                    default:
                        r rVar4 = mVar.f14074a;
                        rVar4.f14159r.f14267b4 = null;
                        r.O(rVar4, 90, 0);
                        return;
                }
            }
        });
        if (linearLayout4.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout4.addView(y1Var2, w7.x5.t(38, 38, 16, i11, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.M = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout5.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(i13, f6Var))));
        cc1Var.addView(linearLayout5, w7.x5.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        y1 y1Var3 = new y1(context, R.drawable.media_link_24, f6Var);
        this.O = y1Var3;
        y1Var3.c(i13);
        y1Var3.setContentDescription(LocaleController.getString(R.string.CreateLink));
        y1Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f14074a;
                        rVar.f14159r.P4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f14074a.f14159r.Y3(view3);
                        return;
                    case 2:
                        mVar.f14074a.f14159r.Z3();
                        return;
                    case 3:
                        mVar.f14074a.f14159r.W3();
                        return;
                    case 4:
                        mVar.f14074a.f14159r.a4();
                        return;
                    case 5:
                        r rVar2 = mVar.f14074a;
                        m3 g22 = rVar2.f14159r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(rVar2.getContext(), rVar2.f28779a);
                                f0Var.n0(a2);
                                f0Var.f25856k0 = new bi.o1(g22, 25);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f14074a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        g2 g2Var = mVar.f14074a.f14159r.J3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = mVar.f14074a.f14159r.J3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f14074a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f14158n, context2, new bi.o1(mVar2, 26), rVar3.f28779a).show();
                        return;
                    case 10:
                        r.L(mVar.f14074a);
                        return;
                    default:
                        r rVar4 = mVar.f14074a;
                        rVar4.f14159r.f14267b4 = null;
                        r.O(rVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(y1Var3, w7.x5.q(38, 38, 16));
        y1 y1Var4 = new y1(context, R.drawable.msg_calendar2, f6Var);
        this.Q = y1Var4;
        y1Var4.c(i13);
        y1Var4.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        y1Var4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f14074a;
                        rVar.f14159r.P4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f14074a.f14159r.Y3(view3);
                        return;
                    case 2:
                        mVar.f14074a.f14159r.Z3();
                        return;
                    case 3:
                        mVar.f14074a.f14159r.W3();
                        return;
                    case 4:
                        mVar.f14074a.f14159r.a4();
                        return;
                    case 5:
                        r rVar2 = mVar.f14074a;
                        m3 g22 = rVar2.f14159r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(rVar2.getContext(), rVar2.f28779a);
                                f0Var.n0(a2);
                                f0Var.f25856k0 = new bi.o1(g22, 25);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f14074a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        g2 g2Var = mVar.f14074a.f14159r.J3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = mVar.f14074a.f14159r.J3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f14074a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f14158n, context2, new bi.o1(mVar2, 26), rVar3.f28779a).show();
                        return;
                    case 10:
                        r.L(mVar.f14074a);
                        return;
                    default:
                        r rVar4 = mVar.f14074a;
                        rVar4.f14159r.f14267b4 = null;
                        r.O(rVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(y1Var4, w7.x5.q(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.N = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout6.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(i13, f6Var))));
        cc1Var.addView(linearLayout6, w7.x5.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        y1 y1Var5 = new y1(context, R.drawable.iv_math, f6Var);
        this.R = y1Var5;
        y1Var5.c(i13);
        y1Var5.e();
        arrayList.add(y1Var5);
        y1Var5.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        y1Var5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f14074a;
                        rVar.f14159r.P4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f14074a.f14159r.Y3(view3);
                        return;
                    case 2:
                        mVar.f14074a.f14159r.Z3();
                        return;
                    case 3:
                        mVar.f14074a.f14159r.W3();
                        return;
                    case 4:
                        mVar.f14074a.f14159r.a4();
                        return;
                    case 5:
                        r rVar2 = mVar.f14074a;
                        m3 g22 = rVar2.f14159r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(rVar2.getContext(), rVar2.f28779a);
                                f0Var.n0(a2);
                                f0Var.f25856k0 = new bi.o1(g22, 25);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f14074a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        g2 g2Var = mVar.f14074a.f14159r.J3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = mVar.f14074a.f14159r.J3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f14074a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f14158n, context2, new bi.o1(mVar2, 26), rVar3.f28779a).show();
                        return;
                    case 10:
                        r.L(mVar.f14074a);
                        return;
                    default:
                        r rVar4 = mVar.f14074a;
                        rVar4.f14159r.f14267b4 = null;
                        r.O(rVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout6.addView(y1Var5, w7.x5.q(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.L = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout7.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(i13, f6Var))));
        cc1Var.addView(linearLayout7, 0, w7.x5.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        y1 y1Var6 = new y1(context, R.drawable.input_ai, f6Var);
        y1Var6.setImageDrawable(new org.telegram.ui.Components.j0(context));
        y1Var6.c(i13);
        y1Var6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        y1Var6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f14074a;
                        rVar.f14159r.P4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f14074a.f14159r.Y3(view3);
                        return;
                    case 2:
                        mVar.f14074a.f14159r.Z3();
                        return;
                    case 3:
                        mVar.f14074a.f14159r.W3();
                        return;
                    case 4:
                        mVar.f14074a.f14159r.a4();
                        return;
                    case 5:
                        r rVar2 = mVar.f14074a;
                        m3 g22 = rVar2.f14159r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(rVar2.getContext(), rVar2.f28779a);
                                f0Var.n0(a2);
                                f0Var.f25856k0 = new bi.o1(g22, 25);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f14074a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        g2 g2Var = mVar.f14074a.f14159r.J3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = mVar.f14074a.f14159r.J3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f14074a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f14158n, context2, new bi.o1(mVar2, 26), rVar3.f28779a).show();
                        return;
                    case 10:
                        r.L(mVar.f14074a);
                        return;
                    default:
                        r rVar4 = mVar.f14074a;
                        rVar4.f14159r.f14267b4 = null;
                        r.O(rVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout7.addView(y1Var6, w7.x5.q(38, 38, 16));
        x1 x1Var = new x1(this, context, R.drawable.send_plane_24, f6Var, 1);
        this.F = x1Var;
        x1Var.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Yd, f6Var))));
        w7.z5.a(x1Var);
        linearLayout2.addView(x1Var, w7.x5.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        x1Var.setContentDescription("Send");
        x1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f14074a;
                        rVar.f14159r.P4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f14074a.f14159r.Y3(view3);
                        return;
                    case 2:
                        mVar.f14074a.f14159r.Z3();
                        return;
                    case 3:
                        mVar.f14074a.f14159r.W3();
                        return;
                    case 4:
                        mVar.f14074a.f14159r.a4();
                        return;
                    case 5:
                        r rVar2 = mVar.f14074a;
                        m3 g22 = rVar2.f14159r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(rVar2.getContext(), rVar2.f28779a);
                                f0Var.n0(a2);
                                f0Var.f25856k0 = new bi.o1(g22, 25);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f14074a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        g2 g2Var = mVar.f14074a.f14159r.J3;
                        if (g2Var != null) {
                            g2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        g2 g2Var2 = mVar.f14074a.f14159r.J3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f14074a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f14158n, context2, new bi.o1(mVar2, 26), rVar3.f28779a).show();
                        return;
                    case 10:
                        r.L(mVar.f14074a);
                        return;
                    default:
                        r rVar4 = mVar.f14074a;
                        rVar4.f14159r.f14267b4 = null;
                        r.O(rVar4, 90, 0);
                        return;
                }
            }
        });
        x1Var.setOnLongClickListener(new di.n5(mVar, 4));
        f(0, false);
    }

    public final void a(int i10, int i11, boolean z10) {
        int i12;
        LinearLayout linearLayout = this.f13801y;
        y1 y1Var = new y1(linearLayout.getContext(), i10, this.f13790b);
        y1Var.c(org.telegram.ui.ActionBar.j6.f20690d6);
        if (z10) {
            y1Var.e();
            this.V.add(y1Var);
        }
        y1Var.setTag(Integer.valueOf(i11));
        y1Var.setContentDescription(c2.g0(i11));
        y1Var.setOnClickListener(new y3(this, i11, 1));
        this.T.add(y1Var);
        if (linearLayout.getChildCount() == 0) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        linearLayout.addView(y1Var, w7.x5.t(38, 38, 16, i12, 0, 0, 0));
    }

    public final void b(int i10, int i11, boolean z10) {
        int i12;
        y1 y1Var = new y1(getContext(), i10, this.f13790b);
        y1Var.c(org.telegram.ui.ActionBar.j6.Yk);
        if (z10) {
            y1Var.e();
            this.V.add(y1Var);
        }
        y1Var.setTag(Integer.valueOf(i11));
        y1Var.setContentDescription(c2.i0(i11));
        y1Var.setOnClickListener(new y3(this, i11, 0));
        this.U.add(y1Var);
        LinearLayout linearLayout = this.J;
        if (linearLayout.getChildCount() == 0) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        linearLayout.addView(y1Var, w7.x5.t(38, 38, 16, i12, 0, 0, 0));
    }

    public final void c(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        ArrayList arrayList = this.U;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            y1 y1Var = (y1) obj;
            int intValue = ((Integer) y1Var.getTag()).intValue();
            if ((i10 & intValue) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            y1Var.setSelected(z15);
            if (intValue == 1 || intValue == 2) {
                y1Var.setEnabled(z14);
            }
        }
        y1 y1Var2 = this.O;
        y1Var2.setSelected(z10);
        y1 y1Var3 = this.Q;
        y1Var3.setSelected(z11);
        y1Var2.setEnabled(z12);
        this.P.setEnabled(z13);
        y1Var3.setEnabled(z12);
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
            y1 y1Var = (y1) obj;
            if (i10 == ((Integer) y1Var.getTag()).intValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            y1Var.setSelected(z10);
            if (z10 && i11 != 0) {
                y1Var.f(i11);
            } else {
                y1Var.a();
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        int i10;
        if (this.f13793c0 != z10 || !z11) {
            this.f13793c0 = z10;
            if (z10) {
                f7 = 1.15f;
            } else {
                f7 = 1.0f;
            }
            aj0 aj0Var = this.I;
            if (z11) {
                aj0Var.animate().scaleX(f7).scaleY(f7).setDuration(180L).setInterpolator(pr.h).start();
            } else {
                aj0Var.animate().cancel();
                aj0Var.setScaleX(f7);
                aj0Var.setScaleY(f7);
            }
            if (z10) {
                i10 = org.telegram.ui.ActionBar.j6.f20925q7;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.G6;
            }
            aj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, this.f13790b), PorterDuff.Mode.SRC_IN));
            xi0 animatedDrawable = aj0Var.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f32580b0 > 34) {
                        animatedDrawable.L(0, false, false);
                    }
                    animatedDrawable.N(33);
                } else {
                    animatedDrawable.N(0);
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
        if (this.f13789a0 == i10) {
            return;
        }
        this.f13789a0 = i10;
        FrameLayout frameLayout = this.H;
        int i13 = 0;
        cc1 cc1Var = this.G;
        LinearLayout linearLayout = this.f13799w;
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
            pr prVar = pr.h;
            duration.setInterpolator(prVar).withEndAction(new Runnable(this) {
                public final a4 f14356b;

                {
                    this.f14356b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            a4 a4Var = this.f14356b;
                            if (a4Var.f13789a0 != 0) {
                                a4Var.f13799w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            a4 a4Var2 = this.f14356b;
                            if (a4Var2.f13789a0 != 1) {
                                a4Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            a4 a4Var3 = this.f14356b;
                            if (a4Var3.f13789a0 != 2) {
                                a4Var3.H.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            cc1Var.setVisibility(0);
            ViewPropertyAnimator animate2 = cc1Var.animate();
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
            scaleY2.translationY(dp4).setDuration(420L).setInterpolator(prVar).withEndAction(new Runnable(this) {
                public final a4 f14356b;

                {
                    this.f14356b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            a4 a4Var = this.f14356b;
                            if (a4Var.f13789a0 != 0) {
                                a4Var.f13799w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            a4 a4Var2 = this.f14356b;
                            if (a4Var2.f13789a0 != 1) {
                                a4Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            a4 a4Var3 = this.f14356b;
                            if (a4Var3.f13789a0 != 2) {
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
            scaleX3.scaleY(f24).setDuration(420L).setInterpolator(prVar).withEndAction(new Runnable(this) {
                public final a4 f14356b;

                {
                    this.f14356b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            a4 a4Var = this.f14356b;
                            if (a4Var.f13789a0 != 0) {
                                a4Var.f13799w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            a4 a4Var2 = this.f14356b;
                            if (a4Var2.f13789a0 != 1) {
                                a4Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            a4 a4Var3 = this.f14356b;
                            if (a4Var3.f13789a0 != 2) {
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
        cc1Var.setVisibility(i12);
        if (i10 == 1) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        cc1Var.setAlpha(f12);
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.8f;
        }
        cc1Var.setScaleX(f13);
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        cc1Var.setScaleY(f14);
        if (i10 == 1) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(30.0f);
        }
        cc1Var.setTranslationY(dp2);
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
        return this.f13798s;
    }

    public FrameLayout getBottomInnerContainer() {
        return this.v;
    }

    public LinearLayout getBottomPanel() {
        return this.f13799w;
    }

    public View getEmojiButton() {
        return this.f13800x;
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
        this.f13795f.setVisibility(i10);
    }

    public void setBottomGradientTranslationY(float f7) {
        this.d.setTranslationY(f7);
    }

    public void setEmojiOpened(boolean z10) {
        zg zgVar;
        String str;
        if (z10) {
            zgVar = zg.d;
        } else {
            zgVar = zg.f33179e;
        }
        bh bhVar = this.f13800x;
        bhVar.j(zgVar, true);
        if (z10) {
            str = "Keyboard";
        } else {
            str = "Emoji";
        }
        bhVar.setContentDescription(str);
    }

    public void setPremiumLocked(boolean z10) {
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((y1) obj).setPremiumLocked(z10);
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
        x1 x1Var = this.F;
        if (x1Var.isEnabled() == z10) {
            return;
        }
        x1Var.setEnabled(z10);
        ViewPropertyAnimator animate = x1Var.animate();
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
        ImageView imageView = this.f13795f;
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
        this.f13792c.setVisibility(i10);
    }

    public void setTopPanelVisible(boolean z10) {
        int i10;
        int i11 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f13794e.setVisibility(i10);
        if (z10) {
            i11 = 0;
        }
        this.f13792c.setVisibility(i11);
    }
}
