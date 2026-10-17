package ki;

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
import org.telegram.messenger.wh;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.yg;
import org.telegram.ui.sa1;
public final class b4 extends FrameLayout {
    public final ImageView E;
    public final y1 F;
    public final sa1 G;
    public final FrameLayout H;
    public final xj0 I;
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
    public final l f15139a;
    public int f15140a0;
    public final org.telegram.ui.ActionBar.d6 f15141b;
    public int f15142b0;
    public final View f15143c;
    public boolean f15144c0;
    public final View d;
    public final FrameLayout e;
    public final ImageView f15145f;
    public final LinearLayout h;
    public final ImageView f15146n;
    public final ImageView f15147r;
    public final FrameLayout f15148s;
    public final FrameLayout v;
    public final LinearLayout f15149w;
    public final ah f15150x;
    public final LinearLayout f15151y;

    public b4(Context context, final l lVar) {
        super(context);
        int i10;
        int i11;
        this.K = Integer.MAX_VALUE;
        this.T = new ArrayList();
        this.U = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.V = arrayList;
        this.f15140a0 = -1;
        this.f15142b0 = 0;
        this.f15139a = lVar;
        org.telegram.ui.ActionBar.d6 d6Var = lVar.f15362a.f28237a;
        this.f15141b = d6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.f15143c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i12 = h6.f20986d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{h6.w0(i12, d6Var), h6.m1(0.0f, h6.w0(i12, d6Var))}));
        addView(view, w7.z5.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{h6.m1(0.0f, h6.w0(i12, d6Var)), h6.w0(i12, d6Var)}));
        addView(view2, w7.z5.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, w7.z5.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f15145f = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i13 = h6.Yk;
        int w02 = h6.w0(i13, d6Var);
        int w03 = h6.w0(i13, d6Var);
        int i14 = h6.f21075i6;
        imageView.setBackground(new c2(h6.a0(w02, h6.v(w03, h6.w0(i14, d6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        int i15 = h6.G6;
        int w04 = h6.w0(i15, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w04, mode));
        w7.b6.a(imageView);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView.setOnClickListener(new ah.f(lVar, 7));
        frameLayout.addView(imageView, w7.z5.a(44.0f, 8.0f, 8.0f, 8.0f, 8.0f, 44, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(new c2(h6.c0(AndroidUtilities.dp(22.0f), h6.w0(i13, d6Var))));
        frameLayout.addView(linearLayout, w7.z5.a(44.0f, 8.0f, 8.0f, 8.0f, 8.0f, 82, 53));
        ImageView imageView2 = new ImageView(context);
        this.f15146n = imageView2;
        imageView2.setImageResource(R.drawable.iv_undo);
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(h6.g0(h6.w0(i14, d6Var), 1, -1));
        imageView2.setColorFilter(new PorterDuffColorFilter(h6.w0(i15, d6Var), mode));
        w7.b6.a(imageView2);
        imageView2.setContentDescription("Undo");
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15362a;
                        qVar.f15442r.R4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15362a.f15442r.a4(view3);
                        return;
                    case 2:
                        lVar.f15362a.f15442r.b4();
                        return;
                    case 3:
                        lVar.f15362a.f15442r.Y3();
                        return;
                    case 4:
                        lVar.f15362a.f15442r.c4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15362a;
                        n3 i22 = qVar2.f15442r.i2();
                        if (i22 != null) {
                            TL_iv.RichMessage a2 = i22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28237a);
                                e0Var.o0(a2);
                                e0Var.f25743k0 = new ig.l0(i22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15362a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15362a.f15442r.H3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15362a.f15442r.H3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15362a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15441n, context2, new ig.l0(lVar2, 5), qVar3.f28237a).show();
                        return;
                    case 10:
                        q.O(lVar.f15362a);
                        return;
                    default:
                        q qVar4 = lVar.f15362a;
                        qVar4.f15442r.Z3 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView2, w7.z5.q(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.f15147r = imageView3;
        imageView3.setImageResource(R.drawable.iv_redo);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(h6.g0(h6.w0(i14, d6Var), 1, -1));
        imageView3.setColorFilter(new PorterDuffColorFilter(h6.w0(i15, d6Var), mode));
        w7.b6.a(imageView3);
        imageView3.setContentDescription("Redo");
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15362a;
                        qVar.f15442r.R4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15362a.f15442r.a4(view3);
                        return;
                    case 2:
                        lVar.f15362a.f15442r.b4();
                        return;
                    case 3:
                        lVar.f15362a.f15442r.Y3();
                        return;
                    case 4:
                        lVar.f15362a.f15442r.c4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15362a;
                        n3 i22 = qVar2.f15442r.i2();
                        if (i22 != null) {
                            TL_iv.RichMessage a2 = i22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28237a);
                                e0Var.o0(a2);
                                e0Var.f25743k0 = new ig.l0(i22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15362a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15362a.f15442r.H3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15362a.f15442r.H3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15362a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15441n, context2, new ig.l0(lVar2, 5), qVar3.f28237a).show();
                        return;
                    case 10:
                        q.O(lVar.f15362a);
                        return;
                    default:
                        q qVar4 = lVar.f15362a;
                        qVar4.f15442r.Z3 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView3, w7.z5.q(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f15148s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, w7.z5.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, w7.z5.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f15149w = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout3.addView(linearLayout2, w7.z5.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.Components.i0(context));
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(h6.w0(i15, d6Var), mode));
        imageView4.setBackground(new c2(h6.a0(h6.w0(i13, d6Var), h6.v(h6.w0(i13, d6Var), h6.w0(i14, d6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        linearLayout2.addView(imageView4, w7.z5.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        w7.b6.a(imageView4);
        imageView4.setContentDescription("AI");
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15362a;
                        qVar.f15442r.R4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15362a.f15442r.a4(view3);
                        return;
                    case 2:
                        lVar.f15362a.f15442r.b4();
                        return;
                    case 3:
                        lVar.f15362a.f15442r.Y3();
                        return;
                    case 4:
                        lVar.f15362a.f15442r.c4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15362a;
                        n3 i22 = qVar2.f15442r.i2();
                        if (i22 != null) {
                            TL_iv.RichMessage a2 = i22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28237a);
                                e0Var.o0(a2);
                                e0Var.f25743k0 = new ig.l0(i22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15362a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15362a.f15442r.H3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15362a.f15442r.H3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15362a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15441n, context2, new ig.l0(lVar2, 5), qVar3.f28237a).show();
                        return;
                    case 10:
                        q.O(lVar.f15362a);
                        return;
                    default:
                        q qVar4 = lVar.f15362a;
                        qVar4.f15442r.Z3 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setBackground(new c2(h6.c0(AndroidUtilities.dp(22.0f), h6.w0(i12, d6Var))));
        frameLayout4.addView(frameLayout5, w7.z5.e(-2, 44, 81));
        w1 w1Var = new w1(context, 1);
        w1Var.setClipToOutline(true);
        w1Var.setOutlineProvider(new ci.o1(5));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f15151y = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout3.setOrientation(0);
        w1Var.addView(linearLayout3);
        frameLayout5.addView(w1Var, w7.z5.d(-1.0f, -1));
        ah ahVar = new ah(context, 24);
        this.f15150x = ahVar;
        ahVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        ahVar.setColorFilter(new PorterDuffColorFilter(h6.w0(i15, d6Var), mode));
        ahVar.setBackground(h6.a0(h6.w0(i12, d6Var), h6.w0(i14, d6Var), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        ahVar.j(yg.e, false);
        linearLayout3.addView(ahVar, w7.z5.q(38, 38, 16));
        w7.b6.a(ahVar);
        ahVar.setContentDescription("Emoji");
        ahVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15362a;
                        qVar.f15442r.R4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15362a.f15442r.a4(view3);
                        return;
                    case 2:
                        lVar.f15362a.f15442r.b4();
                        return;
                    case 3:
                        lVar.f15362a.f15442r.Y3();
                        return;
                    case 4:
                        lVar.f15362a.f15442r.c4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15362a;
                        n3 i22 = qVar2.f15442r.i2();
                        if (i22 != null) {
                            TL_iv.RichMessage a2 = i22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28237a);
                                e0Var.o0(a2);
                                e0Var.f25743k0 = new ig.l0(i22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15362a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15362a.f15442r.H3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15362a.f15442r.H3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15362a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15441n, context2, new ig.l0(lVar2, 5), qVar3.f28237a).show();
                        return;
                    case 10:
                        q.O(lVar.f15362a);
                        return;
                    default:
                        q qVar4 = lVar.f15362a;
                        qVar4.f15442r.Z3 = null;
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
        imageView5.setColorFilter(new PorterDuffColorFilter(h6.w0(i15, d6Var), mode));
        imageView5.setBackground(h6.a0(h6.w0(i12, d6Var), h6.w0(i14, d6Var), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        linearLayout3.addView(imageView5, w7.z5.t(38, 38, 16, 2, 0, 0, 0));
        w7.b6.a(imageView5);
        imageView5.setContentDescription("Attach");
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15362a;
                        qVar.f15442r.R4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15362a.f15442r.a4(view3);
                        return;
                    case 2:
                        lVar.f15362a.f15442r.b4();
                        return;
                    case 3:
                        lVar.f15362a.f15442r.Y3();
                        return;
                    case 4:
                        lVar.f15362a.f15442r.c4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15362a;
                        n3 i22 = qVar2.f15442r.i2();
                        if (i22 != null) {
                            TL_iv.RichMessage a2 = i22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28237a);
                                e0Var.o0(a2);
                                e0Var.f25743k0 = new ig.l0(i22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15362a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15362a.f15442r.H3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15362a.f15442r.H3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15362a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15441n, context2, new ig.l0(lVar2, 5), qVar3.f28237a).show();
                        return;
                    case 10:
                        q.O(lVar.f15362a);
                        return;
                    default:
                        q qVar4 = lVar.f15362a;
                        qVar4.f15442r.Z3 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout2.addView(frameLayout4, w7.z5.l(1.0f, 0, 44));
        sa1 sa1Var = new sa1(this, context, 5);
        this.G = sa1Var;
        sa1Var.setOrientation(0);
        sa1Var.setClipToPadding(false);
        sa1Var.setClipChildren(false);
        sa1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(sa1Var, w7.z5.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.H = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(frameLayout6, w7.z5.e(80, 60, 81));
        ?? imageView6 = new ImageView(context);
        this.I = imageView6;
        imageView6.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        uj0 animatedDrawable = imageView6.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(h6.w0(i15, d6Var), mode));
        imageView6.setBackground(new c2(h6.c0(AndroidUtilities.dp(22.0f), h6.w0(i13, d6Var))));
        frameLayout6.addView((View) imageView6, w7.z5.e(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        frameLayout7.setBackground(new c2(h6.c0(AndroidUtilities.dp(22.0f), h6.w0(i13, d6Var))));
        sa1Var.addView(frameLayout7, w7.z5.d(44.0f, -2));
        a4 a4Var = new a4(this, context, 0);
        a4Var.setHorizontalScrollBarEnabled(false);
        a4Var.setClipToOutline(true);
        a4Var.setOutlineProvider(new ci.o1(6));
        frameLayout7.addView(a4Var, w7.z5.d(-1.0f, -1));
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
        z1 z1Var = new z1(context, R.drawable.iv_quote, d6Var);
        this.S = z1Var;
        z1Var.c(i13);
        z1Var.setContentDescription(LocaleController.getString(R.string.Quote));
        z1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15362a;
                        qVar.f15442r.R4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15362a.f15442r.a4(view3);
                        return;
                    case 2:
                        lVar.f15362a.f15442r.b4();
                        return;
                    case 3:
                        lVar.f15362a.f15442r.Y3();
                        return;
                    case 4:
                        lVar.f15362a.f15442r.c4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15362a;
                        n3 i22 = qVar2.f15442r.i2();
                        if (i22 != null) {
                            TL_iv.RichMessage a2 = i22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28237a);
                                e0Var.o0(a2);
                                e0Var.f25743k0 = new ig.l0(i22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15362a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15362a.f15442r.H3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15362a.f15442r.H3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15362a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15441n, context2, new ig.l0(lVar2, 5), qVar3.f28237a).show();
                        return;
                    case 10:
                        q.O(lVar.f15362a);
                        return;
                    default:
                        q qVar4 = lVar.f15362a;
                        qVar4.f15442r.Z3 = null;
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
        z1 z1Var2 = new z1(context, R.drawable.iv_button, d6Var);
        this.P = z1Var2;
        z1Var2.c(i13);
        z1Var2.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        z1Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15362a;
                        qVar.f15442r.R4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15362a.f15442r.a4(view3);
                        return;
                    case 2:
                        lVar.f15362a.f15442r.b4();
                        return;
                    case 3:
                        lVar.f15362a.f15442r.Y3();
                        return;
                    case 4:
                        lVar.f15362a.f15442r.c4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15362a;
                        n3 i22 = qVar2.f15442r.i2();
                        if (i22 != null) {
                            TL_iv.RichMessage a2 = i22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28237a);
                                e0Var.o0(a2);
                                e0Var.f25743k0 = new ig.l0(i22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15362a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15362a.f15442r.H3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15362a.f15442r.H3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15362a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15441n, context2, new ig.l0(lVar2, 5), qVar3.f28237a).show();
                        return;
                    case 10:
                        q.O(lVar.f15362a);
                        return;
                    default:
                        q qVar4 = lVar.f15362a;
                        qVar4.f15442r.Z3 = null;
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
        linearLayout5.setBackground(new c2(h6.c0(AndroidUtilities.dp(22.0f), h6.w0(i13, d6Var))));
        sa1Var.addView(linearLayout5, w7.z5.a(44.0f, 8.0f, 0.0f, 0.0f, 0.0f, -2, 80));
        z1 z1Var3 = new z1(context, R.drawable.media_link_24, d6Var);
        this.O = z1Var3;
        z1Var3.c(i13);
        z1Var3.setContentDescription(LocaleController.getString(R.string.CreateLink));
        z1Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15362a;
                        qVar.f15442r.R4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15362a.f15442r.a4(view3);
                        return;
                    case 2:
                        lVar.f15362a.f15442r.b4();
                        return;
                    case 3:
                        lVar.f15362a.f15442r.Y3();
                        return;
                    case 4:
                        lVar.f15362a.f15442r.c4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15362a;
                        n3 i22 = qVar2.f15442r.i2();
                        if (i22 != null) {
                            TL_iv.RichMessage a2 = i22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28237a);
                                e0Var.o0(a2);
                                e0Var.f25743k0 = new ig.l0(i22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15362a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15362a.f15442r.H3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15362a.f15442r.H3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15362a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15441n, context2, new ig.l0(lVar2, 5), qVar3.f28237a).show();
                        return;
                    case 10:
                        q.O(lVar.f15362a);
                        return;
                    default:
                        q qVar4 = lVar.f15362a;
                        qVar4.f15442r.Z3 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(z1Var3, w7.z5.q(38, 38, 16));
        z1 z1Var4 = new z1(context, R.drawable.msg_calendar2, d6Var);
        this.Q = z1Var4;
        z1Var4.c(i13);
        z1Var4.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        z1Var4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15362a;
                        qVar.f15442r.R4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15362a.f15442r.a4(view3);
                        return;
                    case 2:
                        lVar.f15362a.f15442r.b4();
                        return;
                    case 3:
                        lVar.f15362a.f15442r.Y3();
                        return;
                    case 4:
                        lVar.f15362a.f15442r.c4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15362a;
                        n3 i22 = qVar2.f15442r.i2();
                        if (i22 != null) {
                            TL_iv.RichMessage a2 = i22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28237a);
                                e0Var.o0(a2);
                                e0Var.f25743k0 = new ig.l0(i22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15362a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15362a.f15442r.H3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15362a.f15442r.H3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15362a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15441n, context2, new ig.l0(lVar2, 5), qVar3.f28237a).show();
                        return;
                    case 10:
                        q.O(lVar.f15362a);
                        return;
                    default:
                        q qVar4 = lVar.f15362a;
                        qVar4.f15442r.Z3 = null;
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
        linearLayout6.setBackground(new c2(h6.c0(AndroidUtilities.dp(22.0f), h6.w0(i13, d6Var))));
        sa1Var.addView(linearLayout6, w7.z5.a(44.0f, 8.0f, 0.0f, 0.0f, 0.0f, -2, 80));
        z1 z1Var5 = new z1(context, R.drawable.iv_math, d6Var);
        this.R = z1Var5;
        z1Var5.c(i13);
        z1Var5.e();
        arrayList.add(z1Var5);
        z1Var5.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        z1Var5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15362a;
                        qVar.f15442r.R4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15362a.f15442r.a4(view3);
                        return;
                    case 2:
                        lVar.f15362a.f15442r.b4();
                        return;
                    case 3:
                        lVar.f15362a.f15442r.Y3();
                        return;
                    case 4:
                        lVar.f15362a.f15442r.c4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15362a;
                        n3 i22 = qVar2.f15442r.i2();
                        if (i22 != null) {
                            TL_iv.RichMessage a2 = i22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28237a);
                                e0Var.o0(a2);
                                e0Var.f25743k0 = new ig.l0(i22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15362a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15362a.f15442r.H3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15362a.f15442r.H3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15362a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15441n, context2, new ig.l0(lVar2, 5), qVar3.f28237a).show();
                        return;
                    case 10:
                        q.O(lVar.f15362a);
                        return;
                    default:
                        q qVar4 = lVar.f15362a;
                        qVar4.f15442r.Z3 = null;
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
        linearLayout7.setBackground(new c2(h6.c0(AndroidUtilities.dp(22.0f), h6.w0(i13, d6Var))));
        sa1Var.addView(linearLayout7, 0, w7.z5.a(44.0f, 0.0f, 0.0f, 8.0f, 0.0f, -2, 80));
        z1 z1Var6 = new z1(context, R.drawable.input_ai, d6Var);
        z1Var6.setImageDrawable(new org.telegram.ui.Components.i0(context));
        z1Var6.c(i13);
        z1Var6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        z1Var6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15362a;
                        qVar.f15442r.R4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15362a.f15442r.a4(view3);
                        return;
                    case 2:
                        lVar.f15362a.f15442r.b4();
                        return;
                    case 3:
                        lVar.f15362a.f15442r.Y3();
                        return;
                    case 4:
                        lVar.f15362a.f15442r.c4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15362a;
                        n3 i22 = qVar2.f15442r.i2();
                        if (i22 != null) {
                            TL_iv.RichMessage a2 = i22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28237a);
                                e0Var.o0(a2);
                                e0Var.f25743k0 = new ig.l0(i22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15362a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15362a.f15442r.H3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15362a.f15442r.H3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15362a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15441n, context2, new ig.l0(lVar2, 5), qVar3.f28237a).show();
                        return;
                    case 10:
                        q.O(lVar.f15362a);
                        return;
                    default:
                        q qVar4 = lVar.f15362a;
                        qVar4.f15442r.Z3 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout7.addView(z1Var6, w7.z5.q(38, 38, 16));
        y1 y1Var = new y1(R.drawable.send_plane_24, 1, context, this, d6Var);
        this.F = y1Var;
        y1Var.setBackground(new c2(h6.c0(AndroidUtilities.dp(22.0f), h6.w0(h6.Yd, d6Var))));
        w7.b6.a(y1Var);
        linearLayout2.addView(y1Var, w7.z5.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        y1Var.setContentDescription("Send");
        y1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f15362a;
                        qVar.f15442r.R4();
                        qVar.Z();
                        return;
                    case 1:
                        lVar.f15362a.f15442r.a4(view3);
                        return;
                    case 2:
                        lVar.f15362a.f15442r.b4();
                        return;
                    case 3:
                        lVar.f15362a.f15442r.Y3();
                        return;
                    case 4:
                        lVar.f15362a.f15442r.c4();
                        return;
                    case 5:
                        q qVar2 = lVar.f15362a;
                        n3 i22 = qVar2.f15442r.i2();
                        if (i22 != null) {
                            TL_iv.RichMessage a2 = i22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.f28237a);
                                e0Var.o0(a2);
                                e0Var.f25743k0 = new ig.l0(i22, 4);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f15362a.K(0, true, 0, false, 0L);
                        return;
                    case 7:
                        h2 h2Var = lVar.f15362a.f15442r.H3;
                        if (h2Var != null) {
                            h2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        h2 h2Var2 = lVar.f15362a.f15442r.H3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f15362a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.f15441n, context2, new ig.l0(lVar2, 5), qVar3.f28237a).show();
                        return;
                    case 10:
                        q.O(lVar.f15362a);
                        return;
                    default:
                        q qVar4 = lVar.f15362a;
                        qVar4.f15442r.Z3 = null;
                        q.R(qVar4, 90, 0);
                        return;
                }
            }
        });
        y1Var.setOnLongClickListener(new ei.c5(lVar, 4));
        f(0, false);
    }

    public final void a(int i10, int i11, boolean z10) {
        int i12;
        LinearLayout linearLayout = this.f15151y;
        z1 z1Var = new z1(linearLayout.getContext(), i10, this.f15141b);
        z1Var.c(h6.f20986d6);
        if (z10) {
            z1Var.e();
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
        z1 z1Var = new z1(getContext(), i10, this.f15141b);
        z1Var.c(h6.Yk);
        if (z10) {
            z1Var.e();
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
                z1Var.f(i11);
            } else {
                z1Var.a();
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        int i10;
        if (this.f15144c0 != z10 || !z11) {
            this.f15144c0 = z10;
            if (z10) {
                f7 = 1.15f;
            } else {
                f7 = 1.0f;
            }
            xj0 xj0Var = this.I;
            if (z11) {
                xj0Var.animate().scaleX(f7).scaleY(f7).setDuration(180L).setInterpolator(bs.h).start();
            } else {
                xj0Var.animate().cancel();
                xj0Var.setScaleX(f7);
                xj0Var.setScaleY(f7);
            }
            if (z10) {
                i10 = h6.f21224q7;
            } else {
                i10 = h6.G6;
            }
            xj0Var.setColorFilter(new PorterDuffColorFilter(h6.w0(i10, this.f15141b), PorterDuff.Mode.SRC_IN));
            uj0 animatedDrawable = xj0Var.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f31001a0 > 34) {
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
        if (this.f15140a0 == i10) {
            return;
        }
        this.f15140a0 = i10;
        FrameLayout frameLayout = this.H;
        int i13 = 0;
        sa1 sa1Var = this.G;
        LinearLayout linearLayout = this.f15149w;
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
                public final b4 f15657b;

                {
                    this.f15657b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            b4 b4Var = this.f15657b;
                            if (b4Var.f15140a0 != 0) {
                                b4Var.f15149w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            b4 b4Var2 = this.f15657b;
                            if (b4Var2.f15140a0 != 1) {
                                b4Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            b4 b4Var3 = this.f15657b;
                            if (b4Var3.f15140a0 != 2) {
                                b4Var3.H.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            sa1Var.setVisibility(0);
            ViewPropertyAnimator animate2 = sa1Var.animate();
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
                public final b4 f15657b;

                {
                    this.f15657b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            b4 b4Var = this.f15657b;
                            if (b4Var.f15140a0 != 0) {
                                b4Var.f15149w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            b4 b4Var2 = this.f15657b;
                            if (b4Var2.f15140a0 != 1) {
                                b4Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            b4 b4Var3 = this.f15657b;
                            if (b4Var3.f15140a0 != 2) {
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
                public final b4 f15657b;

                {
                    this.f15657b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            b4 b4Var = this.f15657b;
                            if (b4Var.f15140a0 != 0) {
                                b4Var.f15149w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            b4 b4Var2 = this.f15657b;
                            if (b4Var2.f15140a0 != 1) {
                                b4Var2.G.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            b4 b4Var3 = this.f15657b;
                            if (b4Var3.f15140a0 != 2) {
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
        sa1Var.setVisibility(i12);
        if (i10 == 1) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        sa1Var.setAlpha(f12);
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.8f;
        }
        sa1Var.setScaleX(f13);
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        sa1Var.setScaleY(f14);
        if (i10 == 1) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(30.0f);
        }
        sa1Var.setTranslationY(dp2);
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
        return this.f15148s;
    }

    public FrameLayout getBottomInnerContainer() {
        return this.v;
    }

    public LinearLayout getBottomPanel() {
        return this.f15149w;
    }

    public View getEmojiButton() {
        return this.f15150x;
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
        this.f15145f.setVisibility(i10);
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
        ah ahVar = this.f15150x;
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
        wh.s(animate, f7, 150L);
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
        ImageView imageView = this.f15145f;
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
        this.f15143c.setVisibility(i10);
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
        this.f15143c.setVisibility(i11);
    }
}
