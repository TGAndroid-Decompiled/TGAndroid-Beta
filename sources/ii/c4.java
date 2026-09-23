package ii;

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
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.ug;
import org.telegram.ui.Components.yg;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.ub1;
public final class c4 extends FrameLayout {
    public final ImageView E;
    public final z1 F;
    public final ub1 G;
    public final FrameLayout H;
    public final bj0 I;
    public final LinearLayout J;
    public int K;
    public final LinearLayout L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final a2 O;
    public final a2 P;
    public final a2 Q;
    public final a2 R;
    public final a2 S;
    public final ArrayList T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public final m f11270a;
    public int f11271a0;
    public final org.telegram.ui.ActionBar.d6 f11272b;
    public int f11273b0;
    public final View f11274c;
    public boolean f11275c0;
    public final View d;
    public final FrameLayout e;
    public final ImageView f11276f;
    public final LinearLayout h;
    public final ImageView f11277n;
    public final ImageView f11278r;
    public final FrameLayout f11279s;
    public final FrameLayout v;
    public final LinearLayout f11280w;
    public final ah f11281x;
    public final LinearLayout f11282y;

    public c4(Context context, final m mVar) {
        super(context);
        int i10;
        int i11;
        this.K = Integer.MAX_VALUE;
        this.T = new ArrayList();
        this.U = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.V = arrayList;
        this.f11271a0 = -1;
        this.f11273b0 = 0;
        this.f11270a = mVar;
        org.telegram.ui.ActionBar.d6 d6Var = mVar.f11493a.f26743a;
        this.f11272b = d6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.f11274c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i12 = org.telegram.ui.ActionBar.h6.f18789d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.h6.v0(i12, d6Var), org.telegram.ui.ActionBar.h6.l1(0.0f, org.telegram.ui.ActionBar.h6.v0(i12, d6Var))}));
        addView(view, w7.x5.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.h6.l1(0.0f, org.telegram.ui.ActionBar.h6.v0(i12, d6Var)), org.telegram.ui.ActionBar.h6.v0(i12, d6Var)}));
        addView(view2, w7.x5.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, w7.x5.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f11276f = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i13 = org.telegram.ui.ActionBar.h6.Yk;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i13, d6Var);
        int v03 = org.telegram.ui.ActionBar.h6.v0(i13, d6Var);
        int i14 = org.telegram.ui.ActionBar.h6.f18878i6;
        imageView.setBackground(new d2(org.telegram.ui.ActionBar.h6.Z(v02, org.telegram.ui.ActionBar.h6.v(v03, org.telegram.ui.ActionBar.h6.v0(i14, d6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        int i15 = org.telegram.ui.ActionBar.h6.G6;
        int v04 = org.telegram.ui.ActionBar.h6.v0(i15, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        w7.z5.a(imageView);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView.setOnClickListener(new ai.e2(mVar, 4));
        frameLayout.addView(imageView, w7.x5.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(new d2(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.h6.v0(i13, d6Var))));
        frameLayout.addView(linearLayout, w7.x5.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.f11277n = imageView2;
        imageView2.setImageResource(R.drawable.iv_undo);
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i14, d6Var), 1, -1));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i15, d6Var), mode));
        w7.z5.a(imageView2);
        imageView2.setContentDescription("Undo");
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f11493a;
                        rVar.f11572r.Q4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f11493a.f11572r.Z3(view3);
                        return;
                    case 2:
                        mVar.f11493a.f11572r.a4();
                        return;
                    case 3:
                        mVar.f11493a.f11572r.X3();
                        return;
                    case 4:
                        mVar.f11493a.f11572r.b4();
                        return;
                    case 5:
                        r rVar2 = mVar.f11493a;
                        o3 h22 = rVar2.f11572r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(rVar2.getContext(), rVar2.f26743a);
                                e0Var.n0(a2);
                                e0Var.f23505k0 = new ai.y1(h22, 28);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f11493a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        i2 i2Var = mVar.f11493a.f11572r.J3;
                        if (i2Var != null) {
                            i2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        i2 i2Var2 = mVar.f11493a.f11572r.J3;
                        if (i2Var2 != null) {
                            i2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f11493a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f11571n, context2, new ai.y1(mVar2, 29), rVar3.f26743a).show();
                        return;
                    case 10:
                        r.L(mVar.f11493a);
                        return;
                    default:
                        r rVar4 = mVar.f11493a;
                        rVar4.f11572r.f11720b4 = null;
                        r.O(rVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView2, w7.x5.q(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.f11278r = imageView3;
        imageView3.setImageResource(R.drawable.iv_redo);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i14, d6Var), 1, -1));
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i15, d6Var), mode));
        w7.z5.a(imageView3);
        imageView3.setContentDescription("Redo");
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f11493a;
                        rVar.f11572r.Q4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f11493a.f11572r.Z3(view3);
                        return;
                    case 2:
                        mVar.f11493a.f11572r.a4();
                        return;
                    case 3:
                        mVar.f11493a.f11572r.X3();
                        return;
                    case 4:
                        mVar.f11493a.f11572r.b4();
                        return;
                    case 5:
                        r rVar2 = mVar.f11493a;
                        o3 h22 = rVar2.f11572r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(rVar2.getContext(), rVar2.f26743a);
                                e0Var.n0(a2);
                                e0Var.f23505k0 = new ai.y1(h22, 28);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f11493a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        i2 i2Var = mVar.f11493a.f11572r.J3;
                        if (i2Var != null) {
                            i2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        i2 i2Var2 = mVar.f11493a.f11572r.J3;
                        if (i2Var2 != null) {
                            i2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f11493a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f11571n, context2, new ai.y1(mVar2, 29), rVar3.f26743a).show();
                        return;
                    case 10:
                        r.L(mVar.f11493a);
                        return;
                    default:
                        r rVar4 = mVar.f11493a;
                        rVar4.f11572r.f11720b4 = null;
                        r.O(rVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView3, w7.x5.q(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f11279s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, w7.x5.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, w7.x5.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f11280w = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout3.addView(linearLayout2, w7.x5.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.Components.i0(context));
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i15, d6Var), mode));
        imageView4.setBackground(new d2(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.v0(i13, d6Var), org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.v0(i13, d6Var), org.telegram.ui.ActionBar.h6.v0(i14, d6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        linearLayout2.addView(imageView4, w7.x5.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        w7.z5.a(imageView4);
        imageView4.setContentDescription("AI");
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f11493a;
                        rVar.f11572r.Q4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f11493a.f11572r.Z3(view3);
                        return;
                    case 2:
                        mVar.f11493a.f11572r.a4();
                        return;
                    case 3:
                        mVar.f11493a.f11572r.X3();
                        return;
                    case 4:
                        mVar.f11493a.f11572r.b4();
                        return;
                    case 5:
                        r rVar2 = mVar.f11493a;
                        o3 h22 = rVar2.f11572r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(rVar2.getContext(), rVar2.f26743a);
                                e0Var.n0(a2);
                                e0Var.f23505k0 = new ai.y1(h22, 28);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f11493a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        i2 i2Var = mVar.f11493a.f11572r.J3;
                        if (i2Var != null) {
                            i2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        i2 i2Var2 = mVar.f11493a.f11572r.J3;
                        if (i2Var2 != null) {
                            i2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f11493a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f11571n, context2, new ai.y1(mVar2, 29), rVar3.f26743a).show();
                        return;
                    case 10:
                        r.L(mVar.f11493a);
                        return;
                    default:
                        r rVar4 = mVar.f11493a;
                        rVar4.f11572r.f11720b4 = null;
                        r.O(rVar4, 90, 0);
                        return;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setBackground(new d2(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.h6.v0(i12, d6Var))));
        frameLayout4.addView(frameLayout5, w7.x5.e(-2, 44, 81));
        x1 x1Var = new x1(context, 1);
        x1Var.setClipToOutline(true);
        x1Var.setOutlineProvider(new ai.k2(5));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f11282y = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout3.setOrientation(0);
        x1Var.addView(linearLayout3);
        frameLayout5.addView(x1Var, w7.x5.c(-1.0f, -1));
        ah ahVar = new ah(context, 24);
        this.f11281x = ahVar;
        ahVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        ahVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i15, d6Var), mode));
        ahVar.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.v0(i12, d6Var), org.telegram.ui.ActionBar.h6.v0(i14, d6Var), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        ahVar.j(yg.e, false);
        linearLayout3.addView(ahVar, w7.x5.q(38, 38, 16));
        w7.z5.a(ahVar);
        ahVar.setContentDescription("Emoji");
        ahVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f11493a;
                        rVar.f11572r.Q4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f11493a.f11572r.Z3(view3);
                        return;
                    case 2:
                        mVar.f11493a.f11572r.a4();
                        return;
                    case 3:
                        mVar.f11493a.f11572r.X3();
                        return;
                    case 4:
                        mVar.f11493a.f11572r.b4();
                        return;
                    case 5:
                        r rVar2 = mVar.f11493a;
                        o3 h22 = rVar2.f11572r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(rVar2.getContext(), rVar2.f26743a);
                                e0Var.n0(a2);
                                e0Var.f23505k0 = new ai.y1(h22, 28);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f11493a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        i2 i2Var = mVar.f11493a.f11572r.J3;
                        if (i2Var != null) {
                            i2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        i2 i2Var2 = mVar.f11493a.f11572r.J3;
                        if (i2Var2 != null) {
                            i2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f11493a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f11571n, context2, new ai.y1(mVar2, 29), rVar3.f26743a).show();
                        return;
                    case 10:
                        r.L(mVar.f11493a);
                        return;
                    default:
                        r rVar4 = mVar.f11493a;
                        rVar4.f11572r.f11720b4 = null;
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
        imageView5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i15, d6Var), mode));
        imageView5.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.v0(i12, d6Var), org.telegram.ui.ActionBar.h6.v0(i14, d6Var), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        linearLayout3.addView(imageView5, w7.x5.t(38, 38, 16, 2, 0, 0, 0));
        w7.z5.a(imageView5);
        imageView5.setContentDescription("Attach");
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f11493a;
                        rVar.f11572r.Q4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f11493a.f11572r.Z3(view3);
                        return;
                    case 2:
                        mVar.f11493a.f11572r.a4();
                        return;
                    case 3:
                        mVar.f11493a.f11572r.X3();
                        return;
                    case 4:
                        mVar.f11493a.f11572r.b4();
                        return;
                    case 5:
                        r rVar2 = mVar.f11493a;
                        o3 h22 = rVar2.f11572r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(rVar2.getContext(), rVar2.f26743a);
                                e0Var.n0(a2);
                                e0Var.f23505k0 = new ai.y1(h22, 28);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f11493a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        i2 i2Var = mVar.f11493a.f11572r.J3;
                        if (i2Var != null) {
                            i2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        i2 i2Var2 = mVar.f11493a.f11572r.J3;
                        if (i2Var2 != null) {
                            i2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f11493a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f11571n, context2, new ai.y1(mVar2, 29), rVar3.f26743a).show();
                        return;
                    case 10:
                        r.L(mVar.f11493a);
                        return;
                    default:
                        r rVar4 = mVar.f11493a;
                        rVar4.f11572r.f11720b4 = null;
                        r.O(rVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout2.addView(frameLayout4, w7.x5.l(1.0f, 0, 44));
        ub1 ub1Var = new ub1(this, context, 3);
        this.G = ub1Var;
        ub1Var.setOrientation(0);
        ub1Var.setClipToPadding(false);
        ub1Var.setClipChildren(false);
        ub1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(ub1Var, w7.x5.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.H = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(frameLayout6, w7.x5.e(80, 60, 81));
        ?? imageView6 = new ImageView(context);
        this.I = imageView6;
        imageView6.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        yi0 animatedDrawable = imageView6.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i15, d6Var), mode));
        imageView6.setBackground(new d2(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.h6.v0(i13, d6Var))));
        frameLayout6.addView((View) imageView6, w7.x5.e(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        frameLayout7.setBackground(new d2(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.h6.v0(i13, d6Var))));
        ub1Var.addView(frameLayout7, w7.x5.c(44.0f, -2));
        b4 b4Var = new b4(this, context, 0);
        b4Var.setHorizontalScrollBarEnabled(false);
        b4Var.setClipToOutline(true);
        b4Var.setOutlineProvider(new ai.k2(6));
        frameLayout7.addView(b4Var, w7.x5.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.J = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        b4Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(R.drawable.formatting_bold, 1, false);
        b(R.drawable.formatting_italic, 2, false);
        b(R.drawable.formatting_underline, 16, false);
        b(R.drawable.formatting_strikethrough, 8, false);
        b(R.drawable.formatting_spoiler, 256, false);
        b(R.drawable.iv_code, 4, false);
        b(R.drawable.iv_sub, 16384, true);
        b(R.drawable.iv_super, 32768, true);
        a2 a2Var = new a2(context, R.drawable.iv_quote, d6Var);
        this.S = a2Var;
        a2Var.c(i13);
        a2Var.setContentDescription(LocaleController.getString(R.string.Quote));
        a2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f11493a;
                        rVar.f11572r.Q4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f11493a.f11572r.Z3(view3);
                        return;
                    case 2:
                        mVar.f11493a.f11572r.a4();
                        return;
                    case 3:
                        mVar.f11493a.f11572r.X3();
                        return;
                    case 4:
                        mVar.f11493a.f11572r.b4();
                        return;
                    case 5:
                        r rVar2 = mVar.f11493a;
                        o3 h22 = rVar2.f11572r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(rVar2.getContext(), rVar2.f26743a);
                                e0Var.n0(a2);
                                e0Var.f23505k0 = new ai.y1(h22, 28);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f11493a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        i2 i2Var = mVar.f11493a.f11572r.J3;
                        if (i2Var != null) {
                            i2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        i2 i2Var2 = mVar.f11493a.f11572r.J3;
                        if (i2Var2 != null) {
                            i2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f11493a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f11571n, context2, new ai.y1(mVar2, 29), rVar3.f26743a).show();
                        return;
                    case 10:
                        r.L(mVar.f11493a);
                        return;
                    default:
                        r rVar4 = mVar.f11493a;
                        rVar4.f11572r.f11720b4 = null;
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
        linearLayout4.addView(a2Var, w7.x5.t(38, 38, 16, i10, 0, 0, 0));
        a2 a2Var2 = new a2(context, R.drawable.iv_button, d6Var);
        this.P = a2Var2;
        a2Var2.c(i13);
        a2Var2.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        a2Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f11493a;
                        rVar.f11572r.Q4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f11493a.f11572r.Z3(view3);
                        return;
                    case 2:
                        mVar.f11493a.f11572r.a4();
                        return;
                    case 3:
                        mVar.f11493a.f11572r.X3();
                        return;
                    case 4:
                        mVar.f11493a.f11572r.b4();
                        return;
                    case 5:
                        r rVar2 = mVar.f11493a;
                        o3 h22 = rVar2.f11572r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(rVar2.getContext(), rVar2.f26743a);
                                e0Var.n0(a2);
                                e0Var.f23505k0 = new ai.y1(h22, 28);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f11493a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        i2 i2Var = mVar.f11493a.f11572r.J3;
                        if (i2Var != null) {
                            i2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        i2 i2Var2 = mVar.f11493a.f11572r.J3;
                        if (i2Var2 != null) {
                            i2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f11493a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f11571n, context2, new ai.y1(mVar2, 29), rVar3.f26743a).show();
                        return;
                    case 10:
                        r.L(mVar.f11493a);
                        return;
                    default:
                        r rVar4 = mVar.f11493a;
                        rVar4.f11572r.f11720b4 = null;
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
        linearLayout4.addView(a2Var2, w7.x5.t(38, 38, 16, i11, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.M = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout5.setBackground(new d2(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.h6.v0(i13, d6Var))));
        ub1Var.addView(linearLayout5, w7.x5.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        a2 a2Var3 = new a2(context, R.drawable.media_link_24, d6Var);
        this.O = a2Var3;
        a2Var3.c(i13);
        a2Var3.setContentDescription(LocaleController.getString(R.string.CreateLink));
        a2Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f11493a;
                        rVar.f11572r.Q4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f11493a.f11572r.Z3(view3);
                        return;
                    case 2:
                        mVar.f11493a.f11572r.a4();
                        return;
                    case 3:
                        mVar.f11493a.f11572r.X3();
                        return;
                    case 4:
                        mVar.f11493a.f11572r.b4();
                        return;
                    case 5:
                        r rVar2 = mVar.f11493a;
                        o3 h22 = rVar2.f11572r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(rVar2.getContext(), rVar2.f26743a);
                                e0Var.n0(a2);
                                e0Var.f23505k0 = new ai.y1(h22, 28);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f11493a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        i2 i2Var = mVar.f11493a.f11572r.J3;
                        if (i2Var != null) {
                            i2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        i2 i2Var2 = mVar.f11493a.f11572r.J3;
                        if (i2Var2 != null) {
                            i2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f11493a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f11571n, context2, new ai.y1(mVar2, 29), rVar3.f26743a).show();
                        return;
                    case 10:
                        r.L(mVar.f11493a);
                        return;
                    default:
                        r rVar4 = mVar.f11493a;
                        rVar4.f11572r.f11720b4 = null;
                        r.O(rVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(a2Var3, w7.x5.q(38, 38, 16));
        a2 a2Var4 = new a2(context, R.drawable.msg_calendar2, d6Var);
        this.Q = a2Var4;
        a2Var4.c(i13);
        a2Var4.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        a2Var4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f11493a;
                        rVar.f11572r.Q4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f11493a.f11572r.Z3(view3);
                        return;
                    case 2:
                        mVar.f11493a.f11572r.a4();
                        return;
                    case 3:
                        mVar.f11493a.f11572r.X3();
                        return;
                    case 4:
                        mVar.f11493a.f11572r.b4();
                        return;
                    case 5:
                        r rVar2 = mVar.f11493a;
                        o3 h22 = rVar2.f11572r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(rVar2.getContext(), rVar2.f26743a);
                                e0Var.n0(a2);
                                e0Var.f23505k0 = new ai.y1(h22, 28);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f11493a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        i2 i2Var = mVar.f11493a.f11572r.J3;
                        if (i2Var != null) {
                            i2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        i2 i2Var2 = mVar.f11493a.f11572r.J3;
                        if (i2Var2 != null) {
                            i2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f11493a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f11571n, context2, new ai.y1(mVar2, 29), rVar3.f26743a).show();
                        return;
                    case 10:
                        r.L(mVar.f11493a);
                        return;
                    default:
                        r rVar4 = mVar.f11493a;
                        rVar4.f11572r.f11720b4 = null;
                        r.O(rVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(a2Var4, w7.x5.q(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.N = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout6.setBackground(new d2(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.h6.v0(i13, d6Var))));
        ub1Var.addView(linearLayout6, w7.x5.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        a2 a2Var5 = new a2(context, R.drawable.iv_math, d6Var);
        this.R = a2Var5;
        a2Var5.c(i13);
        a2Var5.d();
        arrayList.add(a2Var5);
        a2Var5.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        a2Var5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f11493a;
                        rVar.f11572r.Q4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f11493a.f11572r.Z3(view3);
                        return;
                    case 2:
                        mVar.f11493a.f11572r.a4();
                        return;
                    case 3:
                        mVar.f11493a.f11572r.X3();
                        return;
                    case 4:
                        mVar.f11493a.f11572r.b4();
                        return;
                    case 5:
                        r rVar2 = mVar.f11493a;
                        o3 h22 = rVar2.f11572r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(rVar2.getContext(), rVar2.f26743a);
                                e0Var.n0(a2);
                                e0Var.f23505k0 = new ai.y1(h22, 28);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f11493a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        i2 i2Var = mVar.f11493a.f11572r.J3;
                        if (i2Var != null) {
                            i2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        i2 i2Var2 = mVar.f11493a.f11572r.J3;
                        if (i2Var2 != null) {
                            i2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f11493a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f11571n, context2, new ai.y1(mVar2, 29), rVar3.f26743a).show();
                        return;
                    case 10:
                        r.L(mVar.f11493a);
                        return;
                    default:
                        r rVar4 = mVar.f11493a;
                        rVar4.f11572r.f11720b4 = null;
                        r.O(rVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout6.addView(a2Var5, w7.x5.q(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.L = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout7.setBackground(new d2(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.h6.v0(i13, d6Var))));
        ub1Var.addView(linearLayout7, 0, w7.x5.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        a2 a2Var6 = new a2(context, R.drawable.input_ai, d6Var);
        a2Var6.setImageDrawable(new org.telegram.ui.Components.i0(context));
        a2Var6.c(i13);
        a2Var6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        a2Var6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f11493a;
                        rVar.f11572r.Q4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f11493a.f11572r.Z3(view3);
                        return;
                    case 2:
                        mVar.f11493a.f11572r.a4();
                        return;
                    case 3:
                        mVar.f11493a.f11572r.X3();
                        return;
                    case 4:
                        mVar.f11493a.f11572r.b4();
                        return;
                    case 5:
                        r rVar2 = mVar.f11493a;
                        o3 h22 = rVar2.f11572r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(rVar2.getContext(), rVar2.f26743a);
                                e0Var.n0(a2);
                                e0Var.f23505k0 = new ai.y1(h22, 28);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f11493a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        i2 i2Var = mVar.f11493a.f11572r.J3;
                        if (i2Var != null) {
                            i2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        i2 i2Var2 = mVar.f11493a.f11572r.J3;
                        if (i2Var2 != null) {
                            i2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f11493a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f11571n, context2, new ai.y1(mVar2, 29), rVar3.f26743a).show();
                        return;
                    case 10:
                        r.L(mVar.f11493a);
                        return;
                    default:
                        r rVar4 = mVar.f11493a;
                        rVar4.f11572r.f11720b4 = null;
                        r.O(rVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout7.addView(a2Var6, w7.x5.q(38, 38, 16));
        z1 z1Var = new z1(this, context, R.drawable.send_plane_24, d6Var, 1);
        this.F = z1Var;
        z1Var.setBackground(new d2(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Yd, d6Var))));
        w7.z5.a(z1Var);
        linearLayout2.addView(z1Var, w7.x5.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        z1Var.setContentDescription("Send");
        z1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        r rVar = mVar.f11493a;
                        rVar.f11572r.Q4();
                        rVar.W();
                        return;
                    case 1:
                        mVar.f11493a.f11572r.Z3(view3);
                        return;
                    case 2:
                        mVar.f11493a.f11572r.a4();
                        return;
                    case 3:
                        mVar.f11493a.f11572r.X3();
                        return;
                    case 4:
                        mVar.f11493a.f11572r.b4();
                        return;
                    case 5:
                        r rVar2 = mVar.f11493a;
                        o3 h22 = rVar2.f11572r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(rVar2.getContext(), rVar2.f26743a);
                                e0Var.n0(a2);
                                e0Var.f23505k0 = new ai.y1(h22, 28);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        mVar.f11493a.I(0, true, 0, false, 0L);
                        return;
                    case 7:
                        i2 i2Var = mVar.f11493a.f11572r.J3;
                        if (i2Var != null) {
                            i2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        i2 i2Var2 = mVar.f11493a.f11572r.J3;
                        if (i2Var2 != null) {
                            i2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        m mVar2 = mVar;
                        r rVar3 = mVar2.f11493a;
                        Context context2 = rVar3.getContext();
                        new x(rVar3.f11571n, context2, new ai.y1(mVar2, 29), rVar3.f26743a).show();
                        return;
                    case 10:
                        r.L(mVar.f11493a);
                        return;
                    default:
                        r rVar4 = mVar.f11493a;
                        rVar4.f11572r.f11720b4 = null;
                        r.O(rVar4, 90, 0);
                        return;
                }
            }
        });
        z1Var.setOnLongClickListener(new ci.m5(mVar, 4));
        f(0, false);
    }

    public final void a(int i10, int i11, boolean z10) {
        int i12;
        LinearLayout linearLayout = this.f11282y;
        a2 a2Var = new a2(linearLayout.getContext(), i10, this.f11272b);
        a2Var.c(org.telegram.ui.ActionBar.h6.f18789d6);
        if (z10) {
            a2Var.d();
            this.V.add(a2Var);
        }
        a2Var.setTag(Integer.valueOf(i11));
        a2Var.setContentDescription(e2.g0(i11));
        a2Var.setOnClickListener(new a4(this, i11, 1));
        this.T.add(a2Var);
        if (linearLayout.getChildCount() == 0) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        linearLayout.addView(a2Var, w7.x5.t(38, 38, 16, i12, 0, 0, 0));
    }

    public final void b(int i10, int i11, boolean z10) {
        int i12;
        a2 a2Var = new a2(getContext(), i10, this.f11272b);
        a2Var.c(org.telegram.ui.ActionBar.h6.Yk);
        if (z10) {
            a2Var.d();
            this.V.add(a2Var);
        }
        a2Var.setTag(Integer.valueOf(i11));
        a2Var.setContentDescription(e2.i0(i11));
        a2Var.setOnClickListener(new a4(this, i11, 0));
        this.U.add(a2Var);
        LinearLayout linearLayout = this.J;
        if (linearLayout.getChildCount() == 0) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        linearLayout.addView(a2Var, w7.x5.t(38, 38, 16, i12, 0, 0, 0));
    }

    public final void c(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        ArrayList arrayList = this.U;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            a2 a2Var = (a2) obj;
            int intValue = ((Integer) a2Var.getTag()).intValue();
            if ((i10 & intValue) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            a2Var.setSelected(z15);
            if (intValue == 1 || intValue == 2) {
                a2Var.setEnabled(z14);
            }
        }
        a2 a2Var2 = this.O;
        a2Var2.setSelected(z10);
        a2 a2Var3 = this.Q;
        a2Var3.setSelected(z11);
        a2Var2.setEnabled(z12);
        this.P.setEnabled(z13);
        a2Var3.setEnabled(z12);
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
            a2 a2Var = (a2) obj;
            if (i10 == ((Integer) a2Var.getTag()).intValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            a2Var.setSelected(z10);
            if (z10 && i11 != 0) {
                a2Var.f(i11);
            } else {
                a2Var.a();
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        int i10;
        if (this.f11275c0 != z10 || !z11) {
            this.f11275c0 = z10;
            if (z10) {
                f7 = 1.15f;
            } else {
                f7 = 1.0f;
            }
            bj0 bj0Var = this.I;
            if (z11) {
                bj0Var.animate().scaleX(f7).scaleY(f7).setDuration(180L).setInterpolator(rr.h).start();
            } else {
                bj0Var.animate().cancel();
                bj0Var.setScaleX(f7);
                bj0Var.setScaleY(f7);
            }
            if (z10) {
                i10 = org.telegram.ui.ActionBar.h6.f19026q7;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.G6;
            }
            bj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i10, this.f11272b), PorterDuff.Mode.SRC_IN));
            yi0 animatedDrawable = bj0Var.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f30258a0 > 34) {
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
        if (this.f11271a0 == i10) {
            return;
        }
        this.f11271a0 = i10;
        FrameLayout frameLayout = this.H;
        int i13 = 0;
        ub1 ub1Var = this.G;
        LinearLayout linearLayout = this.f11280w;
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
            rr rrVar = rr.h;
            duration.setInterpolator(rrVar).withEndAction(new Runnable(this) {
                public final c4 f11792b;

                {
                    this.f11792b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            c4 c4Var = this.f11792b;
                            if (c4Var.f11271a0 != 0) {
                                c4Var.f11280w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            c4 c4Var2 = this.f11792b;
                            if (c4Var2.f11271a0 != 1) {
                                c4Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            c4 c4Var3 = this.f11792b;
                            if (c4Var3.f11271a0 != 2) {
                                c4Var3.H.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            ub1Var.setVisibility(0);
            ViewPropertyAnimator animate2 = ub1Var.animate();
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
            scaleY2.translationY(dp4).setDuration(420L).setInterpolator(rrVar).withEndAction(new Runnable(this) {
                public final c4 f11792b;

                {
                    this.f11792b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            c4 c4Var = this.f11792b;
                            if (c4Var.f11271a0 != 0) {
                                c4Var.f11280w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            c4 c4Var2 = this.f11792b;
                            if (c4Var2.f11271a0 != 1) {
                                c4Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            c4 c4Var3 = this.f11792b;
                            if (c4Var3.f11271a0 != 2) {
                                c4Var3.H.setVisibility(8);
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
            scaleX3.scaleY(f24).setDuration(420L).setInterpolator(rrVar).withEndAction(new Runnable(this) {
                public final c4 f11792b;

                {
                    this.f11792b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            c4 c4Var = this.f11792b;
                            if (c4Var.f11271a0 != 0) {
                                c4Var.f11280w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            c4 c4Var2 = this.f11792b;
                            if (c4Var2.f11271a0 != 1) {
                                c4Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            c4 c4Var3 = this.f11792b;
                            if (c4Var3.f11271a0 != 2) {
                                c4Var3.H.setVisibility(8);
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
        ub1Var.setVisibility(i12);
        if (i10 == 1) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        ub1Var.setAlpha(f12);
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.8f;
        }
        ub1Var.setScaleX(f13);
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        ub1Var.setScaleY(f14);
        if (i10 == 1) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(30.0f);
        }
        ub1Var.setTranslationY(dp2);
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
        return this.f11279s;
    }

    public FrameLayout getBottomInnerContainer() {
        return this.v;
    }

    public LinearLayout getBottomPanel() {
        return this.f11280w;
    }

    public View getEmojiButton() {
        return this.f11281x;
    }

    public ug getSendButton() {
        return this.F;
    }

    public void setBackVisible(boolean z10) {
        int i10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f11276f.setVisibility(i10);
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
        ah ahVar = this.f11281x;
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
            ((a2) obj).setPremiumLocked(z10);
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
        z1 z1Var = this.F;
        if (z1Var.isEnabled() == z10) {
            return;
        }
        z1Var.setEnabled(z10);
        ViewPropertyAnimator animate = z1Var.animate();
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
        ImageView imageView = this.f11276f;
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
        this.f11274c.setVisibility(i10);
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
        this.f11274c.setVisibility(i11);
    }
}
