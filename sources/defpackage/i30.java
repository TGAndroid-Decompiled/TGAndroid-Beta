package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class i30 extends my0 implements jm7, cr3 {
    public static i30 S2;
    public static final float[] T2 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final hu5 A1;
    public int A2;
    public final y20 B1;
    public float B2;
    public final z20 C1;
    public int C2;
    public final m20 D1;
    public long D2;
    public final n20 E1;
    public long E2;
    public final z20 F1;
    public boolean F2;
    public final r7 G1;
    public float G2;
    public final ai2 H1;
    public final o1 H2;
    public a8 I1;
    public t20 I2;
    public final o20 J1;
    public long J2;
    public final boolean K1;
    public float K2;
    public final k46 L1;
    public final v20 L2;
    public final a30 M1;
    public ValueAnimator M2;
    public final lka N1;
    public int N2;
    public final r7 O1;
    public boolean O2;
    public final dna P1;
    public int P2;
    public final v7 Q1;
    public int Q2;
    public boolean R1;
    public int R2;
    public final a8[] S1;
    public final TextView T1;
    public final r7 U1;
    public final a8 V1;
    public final a8 W1;
    public final a8 X1;
    public final a8 Y1;
    public final ImageView Z1;
    public final ae8 a2;
    public final k20 b2;
    public final bf0 c2;
    public final r7 d2;
    public final r7 e2;
    public boolean f2;
    public final View[] g2;
    public final zna h2;
    public long i2;
    public boolean j2;
    public boolean k2;
    public final View l1;
    public int l2;
    public final x20 m1;
    public int m2;
    public final View n1;
    public final boolean n2;
    public final View o1;
    public final boolean o2;
    public boolean p1;
    public jc7 p2;
    public boolean q1;
    public ArrayList q2;
    public final p20 r1;
    public k47 r2;
    public final u46 s1;
    public boolean s2;
    public final h30 t1;
    public int t2;
    public final LinearLayout u1;
    public String u2;
    public final TextView v1;
    public AnimatorSet v2;
    public final TextView w1;
    public int w2;
    public final k20 x1;
    public int x2;
    public final b61 y1;
    public final int y2;
    public final b61 z1;
    public final LaunchActivity z2;

    public i30(Activity activity, final ylb ylbVar) {
        super(1, ylbVar, (Context) activity, true);
        int i;
        boolean z;
        r6 r6Var;
        boolean z2;
        TLRPC.User W1;
        int i2;
        int i3;
        a8[] a8VarArr = new a8[6];
        this.S1 = a8VarArr;
        View[] viewArr = new View[5];
        this.g2 = viewArr;
        this.k2 = true;
        this.l2 = -1;
        this.t2 = Integer.MAX_VALUE;
        this.B2 = -1.0f;
        this.G2 = -1.0f;
        this.H2 = new o1(this, (byte) 4);
        this.L2 = new v20(this);
        this.r = true;
        J();
        k47 k47Var = MediaController.w().v0;
        if (k47Var != null) {
            i = k47Var.K1;
            this.a = i;
        } else {
            i = z8c.t0;
            this.a = i;
        }
        this.z2 = (LaunchActivity) activity;
        this.y2 = er3.q(i).k();
        nm7.f(this.a).b(this, nm7.f2);
        nm7.f(this.a).b(this, nm7.g2);
        nm7.f(this.a).b(this, nm7.h2);
        nm7.f(this.a).b(this, nm7.e2);
        nm7.f(this.a).b(this, nm7.Y1);
        nm7.f(this.a).b(this, nm7.X1);
        nm7.f(this.a).b(this, nm7.K0);
        nm7.f(this.a).b(this, nm7.L0);
        nm7.f(this.a).b(this, nm7.X3);
        nm7.e().b(this, nm7.N4);
        w20 w20Var = new w20(this, activity);
        this.b = w20Var;
        w20Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i4 = this.u0;
        viewGroup.setPadding(i4, 0, i4, 0);
        x20 x20Var = new x20(this, activity, ylbVar, (byte) 0);
        this.m1 = x20Var;
        x20Var.setBackgroundColor(0);
        x20Var.setBackButtonImage(2131231244);
        int i5 = cmb.Ej;
        anb.l(x20Var, 1, i5, ylbVar);
        anb.l(x20Var, 3, cmb.Dj, ylbVar);
        anb.l(x20Var, 5, i5, ylbVar);
        anb.l(x20Var, 6, cmb.Fj, ylbVar);
        x20Var.setOccupyStatusBar(true);
        r6 t = x20Var.t();
        t.setLayoutParams(qoe.e(-1, -1, 119));
        View view = new View(activity);
        this.l1 = view;
        anb.h(cmb.g5, ylbVar, view);
        x20Var.addView(view, 0, qoe.e(-1, -1, 119));
        view.setAlpha(0.0f);
        x20Var.setAlpha(0.0f);
        x20Var.setActionBarMenuOnItemClick(new r8(this, (byte) 3));
        View view2 = new View(activity);
        this.n1 = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(2131231241);
        View view3 = new View(activity);
        this.o1 = view3;
        anb.h(cmb.U5, ylbVar, view3);
        k20 k20Var = new k20(this, activity, (byte) 2);
        this.x1 = k20Var;
        y20 y20Var = new y20(this, activity);
        this.B1 = y20Var;
        k20Var.addView(y20Var, qoe.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        z20 z20Var = new z20(this, activity, activity, (byte) 0);
        this.C1 = z20Var;
        k20Var.addView(z20Var, qoe.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        z20 z20Var2 = new z20(this, activity, activity, (byte) 1);
        this.F1 = z20Var2;
        k20Var.addView(z20Var2, qoe.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        a30 a30Var = new a30(this, activity, ylbVar);
        this.M1 = a30Var;
        a30Var.setLineWidth(4);
        a30Var.setDelegate(new nl9(this, (byte) 7));
        a30Var.setReportChanges(true);
        k20Var.addView(a30Var, qoe.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        zna znaVar = new zna(new xk4(0.0f));
        aoa aoaVar = new aoa();
        aoaVar.b(750.0f);
        aoaVar.a(1.0f);
        znaVar.m = aoaVar;
        znaVar.b(new h20(this, (byte) 0));
        this.h2 = znaVar;
        k46 k46Var = new k46(activity);
        this.L1 = k46Var;
        k46Var.setVisibility(4);
        anb.h(cmb.Jj, ylbVar, k46Var);
        k46Var.setProgressColor(cmb.v0(cmb.Lj, this.J0));
        k20Var.addView(k46Var, qoe.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        lka lkaVar = new lka(activity);
        this.N1 = lkaVar;
        lkaVar.setTextSize(12);
        lkaVar.l("0:00", false);
        int i6 = cmb.Ij;
        anb.W(lkaVar, i6, ylbVar);
        lkaVar.setImportantForAccessibility(2);
        k20Var.addView(lkaVar, qoe.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.T1 = textView;
        textView.setTextSize(1, 12.0f);
        anb.X(textView, i6, ylbVar);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        k20Var.addView(textView, qoe.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        r7 r7Var = new r7(activity, null, 0, cmb.v0(i6, this.J0), false, ylbVar);
        this.O1 = r7Var;
        r7Var.setLongClickEnabled(false);
        r7Var.setShowSubmenuByMove(false);
        r7Var.setAdditionalYOffset(-gm.L(224.0f));
        r7Var.setContentDescription(jb6.M0(2131754804, null));
        r7Var.setDelegate(new u10(this, (byte) 0));
        dna dnaVar = new dna();
        this.P1 = dnaVar;
        r7Var.setIcon(dnaVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        v7 v7Var = new v7(getContext(), ylbVar);
        this.Q1 = v7Var;
        v7Var.setRoundRadiusDp(6.0f);
        v7Var.setDrawShadow(true);
        v7Var.setOnValueChange(new v10(this, (byte) 0));
        a8VarArr[0] = r7Var.e(0, 2131232379, jb6.M0(2131744955, null));
        a8VarArr[1] = r7Var.e(1, 2131232378, jb6.M0(2131744956, null));
        a8VarArr[2] = r7Var.e(2, 2131232377, jb6.M0(2131744957, null));
        a8VarArr[3] = r7Var.e(3, 2131232376, jb6.M0(2131744959, null));
        a8VarArr[4] = r7Var.e(4, 2131232381, jb6.M0(2131744953, null));
        a8VarArr[5] = r7Var.e(5, 2131232380, jb6.M0(2131744954, null));
        if (gm.p >= 3.0f) {
            r7Var.setPadding(0, 1, 0, 0);
        }
        r7Var.setAdditionalXOffset(gm.L(8.0f));
        r7Var.setAdditionalYOffset(-gm.L(400.0f));
        r7Var.setShowedFromBottom(true);
        k20Var.addView(r7Var, qoe.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        r7Var.setOnClickListener(new t(this, fArr, (byte) 19));
        r7Var.setOnLongClickListener(new u0(this, ylbVar, (byte) 1));
        V0(false);
        k20 k20Var2 = new k20(this, activity, (byte) 0);
        k20Var.addView(k20Var2, qoe.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        r7 r7Var2 = new r7(activity, null, 0, 0, false, ylbVar);
        this.U1 = r7Var2;
        viewArr[0] = r7Var2;
        r7Var2.setLongClickEnabled(false);
        r7Var2.setShowSubmenuByMove(false);
        r7Var2.setAdditionalYOffset(-gm.L(166.0f));
        int i7 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i7, this.J0), 1, gm.L(18.0f));
        wmb M = anb.M(i7);
        r7Var2.setBackground(f0);
        anb.j(r7Var2, f0, null, M, ylbVar);
        k20Var2.addView(r7Var2, qoe.e(48, 48, 51));
        r7Var2.setOnClickListener(new View.OnClickListener(this) {
            public final i30 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view4) {
                byte b = r2;
                i30 i30Var = this.b;
                switch (b) {
                    case 0:
                        i30Var.Y0();
                        i30Var.U1.U(null, null);
                        return;
                    default:
                        o20 o20Var = i30Var.J1;
                        k47 k47Var2 = MediaController.w().v0;
                        if (k47Var2 != null) {
                            boolean z3 = true;
                            bu5 H = bu5.H(i30Var.c, i30Var.J0, view4, true);
                            bu5 D0 = i30Var.D0(H, k47Var2);
                            if (!i30Var.I0()) {
                                H.k(2131232396, jb6.M0(2131753881, null), new c20(H, D0, (byte) 1), !i30Var.s2);
                                if (!i30Var.s2 && H.z() != null) {
                                    H.z().setRightIcon(2131232065);
                                }
                                H.j();
                            }
                            H.k(2131232171, jb6.M0(2131750519, null), new d20(i30Var, H, (byte) 0), !i30Var.s2);
                            H.k(2131232371, jb6.M0(2131745193, null), new d20(i30Var, H, (byte) 1), !i30Var.s2);
                            if (k47Var2.e1() <= 0) {
                                z3 = false;
                            }
                            H.k(2131232230, jb6.M0(2131745076, null), new d20(i30Var, H, (byte) 2), z3);
                            if (i30Var.K1) {
                                a8 a8Var = new a8(0, H.d, H.e, false, false);
                                H.c(a8Var);
                                i30Var.I1 = a8Var;
                                a8Var.j(jb6.M0(2131743276, null), 2131231917, null);
                                i30Var.I1.setOnClickListener(new t(i30Var, H, (byte) 20));
                                gm.B2(o20Var);
                                i30Var.I1.addView(o20Var, 0, qoe.c(-1.0f, -1));
                                i30Var.updateColors();
                            }
                            H.l(2131232114, new d20(i30Var, H, (byte) 3), jb6.M0(2131746378, null), i30Var.I0(), true);
                            H.Y(gm.L(64.0f));
                            H.a0();
                            return;
                        }
                        return;
                }
            }
        });
        this.V1 = r7Var2.e(3, 2131232573, jb6.M0(2131746006, null));
        this.W1 = r7Var2.e(4, 2131232572, jb6.M0(2131746009, null));
        r7Var2.a(-1).getLayoutParams().height = gm.L(4.0f);
        this.X1 = r7Var2.e(2, 2131232574, jb6.M0(2131745056, null));
        r7Var2.a(-1).getLayoutParams().height = gm.L(4.0f);
        this.Y1 = r7Var2.e(1, 2131232568, jb6.M0(2131745760, null));
        r7Var2.setShowedFromBottom(true);
        r7Var2.setDelegate(new u10(this, (byte) 1));
        int i8 = cmb.Mj;
        int v0 = cmb.v0(i8, this.J0);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        m20 m20Var = new m20(this, activity, scaledTouchSlop);
        this.D1 = m20Var;
        viewArr[1] = m20Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        m20Var.setScaleType(scaleType);
        m20Var.f(2131624137, 20, 20, null);
        m20Var.h(v0, "Triangle 3");
        m20Var.h(v0, "Triangle 4");
        m20Var.h(v0, "Rectangle 4");
        fg0 f02 = cmb.f0(cmb.v0(i7, this.J0), 1, gm.L(22.0f));
        wmb M2 = anb.M(i7);
        m20Var.setBackground(f02);
        anb.j(m20Var, f02, null, M2, ylbVar);
        k20Var2.addView(m20Var, qoe.e(48, 48, 51));
        m20Var.setContentDescription(jb6.M0(2131754799, null));
        ImageView imageView = new ImageView(activity);
        this.Z1 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        ae8 ae8Var = new ae8(28);
        this.a2 = ae8Var;
        imageView.setImageDrawable(ae8Var);
        ae8Var.a(!MediaController.w().C(), false);
        anb.s(imageView, i8, ylbVar, PorterDuff.Mode.MULTIPLY);
        fg0 f03 = cmb.f0(cmb.v0(i7, this.J0), 1, gm.L(24.0f));
        wmb M3 = anb.M(i7);
        imageView.setBackground(f03);
        anb.j(imageView, f03, null, M3, ylbVar);
        k20Var2.addView(imageView, qoe.e(48, 48, 51));
        imageView.setOnClickListener(new x10((byte) 0));
        n20 n20Var = new n20(this, activity, scaledTouchSlop);
        this.E1 = n20Var;
        viewArr[3] = n20Var;
        n20Var.setScaleType(scaleType);
        n20Var.f(2131624137, 20, 20, null);
        n20Var.h(v0, "Triangle 3");
        n20Var.h(v0, "Triangle 4");
        n20Var.h(v0, "Rectangle 4");
        n20Var.setRotation(180.0f);
        fg0 f04 = cmb.f0(cmb.v0(i7, this.J0), 1, gm.L(22.0f));
        wmb M4 = anb.M(i7);
        n20Var.setBackground(f04);
        anb.j(n20Var, f04, null, M4, ylbVar);
        k20Var2.addView(n20Var, qoe.e(48, 48, 51));
        n20Var.setContentDescription(jb6.M0(2131747984, null));
        r7 r7Var3 = new r7(activity, null, 0, v0, false, ylbVar);
        this.G1 = r7Var3;
        viewArr[4] = r7Var3;
        ai2 ai2Var = new ai2(activity, 2131231248, ylbVar);
        this.H1 = ai2Var;
        r7Var3.setIcon(ai2Var);
        r7Var3.setLongClickEnabled(false);
        r7Var3.setAdditionalYOffset(-gm.L(197.0f));
        fg0 f05 = cmb.f0(cmb.v0(i7, this.J0), 1, gm.L(18.0f));
        wmb M5 = anb.M(i7);
        r7Var3.setBackground(f05);
        anb.j(r7Var3, f05, null, M5, ylbVar);
        r7Var3.setOnClickListener(new View.OnClickListener(this) {
            public final i30 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view4) {
                byte b = r2;
                i30 i30Var = this.b;
                switch (b) {
                    case 0:
                        i30Var.Y0();
                        i30Var.U1.U(null, null);
                        return;
                    default:
                        o20 o20Var = i30Var.J1;
                        k47 k47Var2 = MediaController.w().v0;
                        if (k47Var2 != null) {
                            boolean z3 = true;
                            bu5 H = bu5.H(i30Var.c, i30Var.J0, view4, true);
                            bu5 D0 = i30Var.D0(H, k47Var2);
                            if (!i30Var.I0()) {
                                H.k(2131232396, jb6.M0(2131753881, null), new c20(H, D0, (byte) 1), !i30Var.s2);
                                if (!i30Var.s2 && H.z() != null) {
                                    H.z().setRightIcon(2131232065);
                                }
                                H.j();
                            }
                            H.k(2131232171, jb6.M0(2131750519, null), new d20(i30Var, H, (byte) 0), !i30Var.s2);
                            H.k(2131232371, jb6.M0(2131745193, null), new d20(i30Var, H, (byte) 1), !i30Var.s2);
                            if (k47Var2.e1() <= 0) {
                                z3 = false;
                            }
                            H.k(2131232230, jb6.M0(2131745076, null), new d20(i30Var, H, (byte) 2), z3);
                            if (i30Var.K1) {
                                a8 a8Var = new a8(0, H.d, H.e, false, false);
                                H.c(a8Var);
                                i30Var.I1 = a8Var;
                                a8Var.j(jb6.M0(2131743276, null), 2131231917, null);
                                i30Var.I1.setOnClickListener(new t(i30Var, H, (byte) 20));
                                gm.B2(o20Var);
                                i30Var.I1.addView(o20Var, 0, qoe.c(-1.0f, -1));
                                i30Var.updateColors();
                            }
                            H.l(2131232114, new d20(i30Var, H, (byte) 3), jb6.M0(2131746378, null), i30Var.I0(), true);
                            H.Y(gm.L(64.0f));
                            H.a0();
                            return;
                        }
                        return;
                }
            }
        });
        k20Var2.addView(r7Var3, qoe.e(48, 48, 51));
        o20 o20Var = new o20(this, activity, (byte) 0);
        this.J1 = o20Var;
        this.K1 = true;
        try {
            o20Var.setRouteSelector(ie1.c(activity).a());
        } catch (Exception e) {
            fc4.g(e, true);
            this.K1 = false;
        }
        this.J1.setVisibility(4);
        ai2 ai2Var2 = this.H1;
        if (ai2Var2 != null) {
            ai2Var2.a(fp.w());
        }
        this.G1.setShowedFromBottom(true);
        this.G1.setDelegate(new u10(this, (byte) 2));
        this.G1.setContentDescription(jb6.M0(2131754838, null));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.u1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i9 = 8;
        linearLayout.setVisibility(8);
        this.b.addView(linearLayout, qoe.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new p8((byte) 15));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(2131232447);
        anb.s(imageView2, cmb.V5, ylbVar, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, qoe.o(-2, -2));
        TextView textView2 = new TextView(activity);
        this.v1 = textView2;
        int i10 = cmb.W5;
        anb.X(textView2, i10, ylbVar);
        textView2.setGravity(17);
        textView2.setText(jb6.M0(2131747977, null));
        textView2.setTypeface(gm.o());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(gm.L(40.0f), 0, gm.L(40.0f), 0);
        linearLayout.addView(textView2, qoe.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.w1 = textView3;
        anb.X(textView3, i10, ylbVar);
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(gm.L(40.0f), 0, gm.L(40.0f), 0);
        linearLayout.addView(textView3, qoe.t(-2, -2, 17, 0, 6, 0, 0));
        p20 p20Var = new p20(this, activity);
        this.r1 = p20Var;
        p20Var.setClipToPadding(false);
        getContext();
        u46 u46Var = new u46(1, false);
        this.s1 = u46Var;
        p20Var.setLayoutManager(u46Var);
        p20Var.setHorizontalScrollBarEnabled(false);
        p20Var.setVerticalScrollBarEnabled(false);
        this.b.addView(p20Var, qoe.e(-1, -1, 51));
        h30 h30Var = new h30(this, activity);
        this.t1 = h30Var;
        p20Var.setAdapter(h30Var);
        anb.l(p20Var, 21, cmb.z5, ylbVar);
        p20Var.setOnItemClickListener(new l5((byte) 1));
        p20Var.setOnItemLongClickListener(new u10(this, (byte) 3));
        p20Var.setOnScrollListener(new y(this, (byte) 6));
        b61 b61Var = new b61(ylbVar, activity, true);
        b61Var.setRoundRadius(24);
        this.y1 = b61Var;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        spannableStringBuilder.setSpan(new pn2(2131231181, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) jb6.M0(2131753890, null));
        b61Var.setText(spannableStringBuilder);
        b61Var.setOnClickListener(new View.OnClickListener(this) {
            public final i30 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view4) {
                byte b = r3;
                ylb ylbVar2 = ylbVar;
                i30 i30Var = this.b;
                switch (b) {
                    case 0:
                        k47 k47Var2 = MediaController.w().v0;
                        if (k47Var2 != null && i30Var.z2 != null) {
                            i30Var.L0(k47Var2, true, new jd((byte) 10), false);
                            i30Var.O0(true);
                            ts2.u(null, 2131753877, new c41((FrameLayout) i30Var.b, ylbVar2), 2131624185, 36);
                            return;
                        }
                        return;
                    default:
                        k47 k47Var3 = MediaController.w().v0;
                        if (k47Var3 != null && i30Var.z2 != null) {
                            i30Var.L0(k47Var3, false, new jd((byte) 10), false);
                            i30Var.O0(false);
                            ts2.u(null, 2131753876, new c41((FrameLayout) i30Var.b, ylbVar2), 2131624052, 36);
                            return;
                        }
                        return;
                }
            }
        });
        this.x1.addView(b61Var, qoe.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        b61 b61Var2 = new b61(ylbVar, activity, true);
        b61Var2.setRoundRadius(24);
        b61Var2.e();
        this.z1 = b61Var2;
        b61Var2.setText(jb6.M0(2131753882, null));
        b61Var2.setOnClickListener(new View.OnClickListener(this) {
            public final i30 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view4) {
                byte b = r3;
                ylb ylbVar2 = ylbVar;
                i30 i30Var = this.b;
                switch (b) {
                    case 0:
                        k47 k47Var2 = MediaController.w().v0;
                        if (k47Var2 != null && i30Var.z2 != null) {
                            i30Var.L0(k47Var2, true, new jd((byte) 10), false);
                            i30Var.O0(true);
                            ts2.u(null, 2131753877, new c41((FrameLayout) i30Var.b, ylbVar2), 2131624185, 36);
                            return;
                        }
                        return;
                    default:
                        k47 k47Var3 = MediaController.w().v0;
                        if (k47Var3 != null && i30Var.z2 != null) {
                            i30Var.L0(k47Var3, false, new jd((byte) 10), false);
                            i30Var.O0(false);
                            ts2.u(null, 2131753876, new c41((FrameLayout) i30Var.b, ylbVar2), 2131624052, 36);
                            return;
                        }
                        return;
                }
            }
        });
        this.x1.addView(b61Var2, qoe.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        jc7 jc7Var = MediaController.w().R0;
        this.p2 = jc7Var;
        if (jc7Var != null) {
            z = true;
        } else {
            z = false;
        }
        this.n2 = z;
        this.m1.n0 = z;
        this.o2 = I0();
        this.q2 = MediaController.w().S0;
        if (I0()) {
            r6Var = t;
            this.d2 = r6Var.a(8, 2131232048);
        } else {
            r6Var = t;
        }
        r7 a = r6Var.a(0, 2131232503);
        a.N();
        a.I = new q20(this, (byte) 0);
        this.e2 = a;
        a.setContentDescription(jb6.M0(2131745570, null));
        EditTextBoldCursor searchField = a.getSearchField();
        searchField.setHint(jb6.M0(2131745570, null));
        int i11 = cmb.Ej;
        anb.X(searchField, i11, ylbVar);
        anb.D(searchField, cmb.Ij, ylbVar);
        anb.l(searchField, 30, i11, ylbVar);
        if (z) {
            p20Var.r1();
            s0(cmb.v0(cmb.Z6, ylbVar));
            this.m1.setAlpha(1.0f);
            this.l1.setAlpha(0.0f);
            v20 v20Var = this.L2;
            x20 x20Var2 = this.m1;
            Float valueOf = Float.valueOf(0.0f);
            v20Var.getClass();
            v20Var.a(x20Var2, valueOf);
        }
        if (this.q2.size() > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        h30Var.h = z2;
        if (z2) {
            p20Var.setVisibility(0);
            p20Var.setTranslationY(0.0f);
        } else {
            p20Var.setVisibility(8);
            p20Var.setTranslationY(gm.q.y);
        }
        h30Var.f();
        this.m1.setTitle(jb6.M0(2131753917, null));
        jc7 jc7Var2 = this.p2;
        if (jc7Var2 != null) {
            int i12 = (jc7Var2.b > z8c.h(this.a).e() ? 1 : (jc7Var2.b == z8c.h(this.a).e() ? 0 : -1));
            x20 x20Var3 = this.m1;
            if (i12 == 0) {
                x20Var3.setTitle(jb6.M0(2131746376, null));
            } else {
                x20Var3.setTitle(jb6.a0(null, null, 2131746377, pg3.s(this.p2.b)));
            }
        } else if (k47Var != null && MediaController.w().D0 == null) {
            long B0 = k47.B0(k47Var.k);
            boolean B = pg3.B(B0);
            int i13 = this.a;
            if (B) {
                TLRPC.EncryptedChat Z0 = oc7.r1(i13).Z0(Integer.valueOf((int) (B0 & 4294967295L)));
                if (Z0 != null && (W1 = oc7.r1(this.a).W1(Long.valueOf(Z0.user_id))) != null) {
                    this.m1.setTitle(bw2.m(0, W1.first_name, W1.last_name));
                }
            } else if (B0 == z8c.h(i13).e()) {
                int i14 = (k47Var.P1() > 2666000L ? 1 : (k47Var.P1() == 2666000L ? 0 : -1));
                x20 x20Var4 = this.m1;
                if (i14 == 0) {
                    x20Var4.setTitle(jb6.M0(2131754217, null));
                } else {
                    x20Var4.setTitle(jb6.M0(2131745635, null));
                }
            } else {
                boolean D = pg3.D(B0);
                int i15 = this.a;
                if (D) {
                    TLRPC.User W12 = oc7.r1(i15).W1(Long.valueOf(B0));
                    if (W12 != null) {
                        this.m1.setTitle(bw2.m(0, W12.first_name, W12.last_name));
                    }
                } else {
                    TLRPC.Chat L0 = oc7.r1(i15).L0(Long.valueOf(-B0));
                    if (L0 != null) {
                        this.m1.setTitle(L0.title);
                    }
                }
            }
        }
        if (I0()) {
            b61Var.setVisibility(8);
            b61Var2.setVisibility(8);
            hu5 hu5Var = new hu5(new r20(this, (byte) 0));
            this.A1 = hu5Var;
            hu5Var.h(p20Var);
        }
        ViewGroup viewGroup2 = this.b;
        k20 k20Var3 = this.x1;
        int i16 = 52;
        if (!I0() && !this.s2) {
            i2 = 52;
        } else {
            i2 = 0;
        }
        viewGroup2.addView(k20Var3, qoe.e(-1, i2 + 179, 83));
        this.b.addView(this.o1, new FrameLayout.LayoutParams(-1, gm.e1(), 83));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.x1.getLayoutParams();
        if (!I0() && !this.s2) {
            i3 = 52;
        } else {
            i3 = 0;
        }
        layoutParams.height = gm.L(i3 + 179);
        ((FrameLayout.LayoutParams) this.o1.getLayoutParams()).bottomMargin = gm.L(179 + ((I0() || this.s2) ? 0 : 0));
        this.b.addView(this.n1, qoe.c(3.0f, -1));
        this.b.addView(this.m1);
        k20 k20Var4 = new k20(this, activity, (byte) 1);
        this.b2 = k20Var4;
        k20Var4.setAlpha(0.0f);
        k20Var4.setVisibility(4);
        this.c.addView(k20Var4);
        bf0 bf0Var = new bf0(activity);
        this.c2 = bf0Var;
        bf0Var.setAspectFit(true);
        bf0Var.setRoundRadius(gm.L(8.0f));
        bf0Var.setScaleX(0.9f);
        bf0Var.setScaleY(0.9f);
        k20Var4.addView(bf0Var, qoe.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        a1(false);
        X0();
        if (this.q1 && h30Var.b() == 0) {
            i9 = 0;
        }
        linearLayout.setVisibility(i9);
        T0();
    }

    public static boolean F0(float f, float f2) {
        if (Math.abs(f - f2) < 0.05f) {
            return true;
        }
        return false;
    }

    public static gn5 H0(k47 k47Var) {
        TLRPC.PhotoSize photoSize;
        TLRPC.Document F0 = k47Var.F0();
        if (F0 != null) {
            photoSize = bc4.w(F0.thumbs, 360, false, null, false);
        } else {
            photoSize = null;
        }
        if (!(photoSize instanceof TLRPC.TL_photoSize) && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            photoSize = null;
        }
        if (photoSize != null) {
            return gn5.c(photoSize, F0);
        }
        String u0 = k47Var.u0(true);
        if (u0 == null) {
            return null;
        }
        return gn5.g(u0);
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final bu5 D0(bu5 bu5Var, k47 k47Var) {
        long j;
        ic7 F1 = oc7.r1(this.a).F1();
        TLRPC.Document F0 = k47Var.F0();
        if (F0 != null) {
            j = F0.id;
        } else {
            j = 0;
        }
        bu5 K = bu5Var.K();
        K.b(2131231244, jb6.M0(2131753721, null), new bo1(bu5Var, (byte) 0), false);
        K.j();
        K.k(2131231626, jb6.M0(2131753878, null), new b20(this, k47Var, bu5Var, (byte) 6), !F1.b.contains(Long.valueOf(j)));
        K.b(2131232357, jb6.M0(2131753875, null), new b20(this, k47Var, bu5Var, (byte) 7), false);
        K.b(2131231794, jb6.M0(2131753879, null), new b20(this, k47Var, bu5Var, (byte) 8), false);
        K.j();
        K.o(12, gm.L(200.0f), jb6.M0(2131753880, null));
        return K;
    }

    public final void E0() {
        r7 r7Var = this.U1;
        int v0 = cmb.v0(((Integer) r7Var.getTag()).intValue(), this.J0);
        int v02 = cmb.v0(cmb.Mj, this.J0);
        int v03 = cmb.v0(cmb.h6, this.J0);
        if (!this.O2 || v0 != this.P2) {
            this.P2 = v0;
            r7Var.setIconColor(v0);
        }
        boolean z = this.O2;
        r7 r7Var2 = this.G1;
        if (!z || v02 != this.Q2) {
            this.Q2 = v02;
            r7Var2.setIconColor(v02);
        }
        if (!this.O2 || v03 != this.R2) {
            this.R2 = v03;
            cmb.F1(r7Var.getBackground(), v03, true);
            cmb.F1(r7Var2.getBackground(), v03, true);
        }
        this.O2 = true;
        this.L1.setProgressColor(cmb.v0(cmb.Lj, this.J0));
        Y0();
        int i = cmb.F8;
        r7Var.I(cmb.v0(i, this.J0));
        int i2 = cmb.D8;
        r7Var2.O(cmb.v0(i2, this.J0), false);
        r7Var2.O(cmb.v0(i2, this.J0), true);
        r7Var2.I(cmb.v0(i, this.J0));
    }

    public final void G0(k47 k47Var) {
        ArrayList u;
        TLRPC.TL_document tL_document;
        int i = z8c.t0;
        int i2 = this.a;
        LaunchActivity launchActivity = this.z2;
        if (i != i2) {
            launchActivity.N0(i2);
        }
        Bundle j = td4.j(3, "onlySelect", "dialogsType", true);
        j.putBoolean("canSelectTopics", true);
        nk3 nk3Var = new nk3(j);
        if (k47Var.e1() < 0) {
            if (!(k47Var.F0() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) k47Var.F0();
            u = null;
        } else {
            u = td4.u(k47Var);
            tL_document = null;
        }
        nk3Var.E2 = new lu(this, u, tL_document, k47Var, (byte) 1);
        launchActivity.t0(nk3Var);
        dismiss();
    }

    public final boolean I0() {
        jc7 jc7Var = this.p2;
        if (jc7Var != null && jc7Var.b == z8c.h(this.a).e()) {
            return true;
        }
        return false;
    }

    public final void J0(int i) {
        LaunchActivity launchActivity;
        k47 k47Var = MediaController.w().v0;
        if (k47Var != null && (launchActivity = this.z2) != null) {
            if (i == 1) {
                G0(k47Var);
            } else if (i == 2) {
                P0(k47Var);
            } else if (i == 4) {
                int i2 = z8c.t0;
                int i3 = this.a;
                if (i2 != i3) {
                    launchActivity.N0(i3);
                }
                Bundle bundle = new Bundle();
                long B0 = k47.B0(k47Var.k);
                if (pg3.B(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (pg3.D(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat L0 = oc7.r1(this.a).L0(Long.valueOf(-B0));
                    if (L0 != null && L0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -L0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", k47Var.e1());
                nm7.f(this.a).k(nm7.s, new Object[0]);
                launchActivity.u0(new yv1(bundle), false, false);
                dismiss();
            } else if (i == 5) {
                K0(k47Var);
            } else if (i == 6) {
                hi2.v().Q(MediaController.w().u());
                this.J1.performClick();
            } else if (i == 7) {
                L0(k47Var, false, new y10(this, k47Var, (byte) 0), false);
            } else if (i == 8) {
                zz9 zz9Var = new zz9(getContext(), true, null, new a20(this, (byte) 0), null);
                zz9Var.c2 = true;
                zz9Var.U1 = false;
                zz9Var.j2.O(true);
                zz9Var.show();
            }
        }
    }

    public final void K0(k47 k47Var) {
        String str;
        if (Build.VERSION.SDK_INT <= 28 || e21.b) {
            LaunchActivity launchActivity = this.z2;
            if (launchActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                launchActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        String B = bc4.B(k47Var.F0());
        if (TextUtils.isEmpty(B)) {
            B = k47Var.S0();
        }
        String str2 = B;
        String str3 = k47Var.k.attachPath;
        if (str3 != null && str3.length() > 0 && !aq1.t(str3)) {
            str3 = null;
        }
        if (str3 == null || str3.length() == 0) {
            bc4.G(this.a);
            str3 = bc4.M(k47Var.k, false, true).toString();
        }
        if (k47Var.F0() != null) {
            str = k47Var.F0().mime_type;
        } else {
            str = "";
        }
        String str4 = str;
        String str5 = str3;
        MediaController.d0(str5, this.z2, 3, str2, str4, new a20(this, (byte) 1));
    }

    public final void L0(k47 k47Var, boolean z, Runnable runnable, boolean z2) {
        TLRPC.Document F0 = k47Var.F0();
        if (F0 == null) {
            return;
        }
        long j = F0.id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.id = tL_inputDocument;
        tL_inputDocument.id = j;
        tL_inputDocument.access_hash = F0.access_hash;
        byte[] bArr = F0.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_account_saveMusic, new e20(this, z2, k47Var, z, runnable, j, F0));
    }

    public final boolean M0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i30.M0(boolean):boolean");
    }

    public final void N0(a8 a8Var, boolean z) {
        if (z) {
            int i = cmb.Nj;
            a8Var.setTextColor(cmb.v0(i, this.J0));
            a8Var.setIconColor(cmb.v0(i, this.J0));
            return;
        }
        int i2 = cmb.D8;
        a8Var.setTextColor(cmb.v0(i2, this.J0));
        a8Var.setIconColor(cmb.v0(i2, this.J0));
    }

    public final void O0(final boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        boolean I0 = I0();
        b61 b61Var = this.z1;
        b61 b61Var2 = this.y1;
        if (!I0 && !this.s2) {
            b61Var2.setVisibility(0);
            b61Var.setVisibility(0);
            ViewPropertyAnimator animate = b61Var2.animate();
            float f5 = 0.0f;
            float f6 = 1.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f);
            if (z) {
                f2 = 0.8f;
            } else {
                f2 = 1.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f2);
            if (z) {
                f3 = 0.8f;
            } else {
                f3 = 1.0f;
            }
            ViewPropertyAnimator duration = scaleX.scaleY(f3).setDuration(420L);
            d53 d53Var = d53.h;
            duration.setInterpolator(d53Var).withEndAction(new Runnable(this) {
                public final i30 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    int i = 8;
                    boolean z2 = z;
                    i30 i30Var = this.b;
                    switch (b) {
                        case 0:
                            b61 b61Var3 = i30Var.y1;
                            if (!z2) {
                                i = 0;
                            }
                            b61Var3.setVisibility(i);
                            return;
                        default:
                            b61 b61Var4 = i30Var.z1;
                            if (z2) {
                                i = 0;
                            }
                            b61Var4.setVisibility(i);
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = b61Var.animate();
            if (z) {
                f5 = 1.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f5);
            if (!z) {
                f4 = 0.8f;
            } else {
                f4 = 1.0f;
            }
            ViewPropertyAnimator scaleX2 = alpha2.scaleX(f4);
            if (!z) {
                f6 = 0.8f;
            }
            scaleX2.scaleY(f6).setDuration(420L).setInterpolator(d53Var).withEndAction(new Runnable(this) {
                public final i30 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    int i = 8;
                    boolean z2 = z;
                    i30 i30Var = this.b;
                    switch (b) {
                        case 0:
                            b61 b61Var3 = i30Var.y1;
                            if (!z2) {
                                i = 0;
                            }
                            b61Var3.setVisibility(i);
                            return;
                        default:
                            b61 b61Var4 = i30Var.z1;
                            if (z2) {
                                i = 0;
                            }
                            b61Var4.setVisibility(i);
                            return;
                    }
                }
            }).start();
            return;
        }
        b61Var2.setVisibility(8);
        b61Var.setVisibility(8);
    }

    @Override
    public final int P() {
        k20 k20Var = this.x1;
        if (k20Var == null) {
            return 0;
        }
        if (this.q2.size() <= 1) {
            return k20Var.getMeasuredHeight() + this.t0;
        }
        int L = gm.L(13.0f);
        int translationY = (int) (this.r1.getTranslationY() + ((this.t2 - this.t0) - L));
        if (this.t0 + translationY < a.getCurrentActionBarHeight()) {
            float L2 = gm.L(4.0f) + L;
            translationY -= (int) ((a.getCurrentActionBarHeight() - L2) * Math.min(1.0f, ((a.getCurrentActionBarHeight() - translationY) - this.t0) / L2));
        }
        return this.c.getMeasuredHeight() - (translationY + gm.m);
    }

    public final void P0(defpackage.k47 r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i30.P0(k47):void");
    }

    public final void Q0(boolean z, boolean z2) {
        bf0 bf0Var = this.c2;
        k20 k20Var = this.b2;
        if (z) {
            if (k20Var.getVisibility() != 0 && !this.f2) {
                k20Var.setTag(1);
                y20 y20Var = this.B1;
                bf0Var.setImageBitmap(y20Var.a[y20Var.b ? 1 : 0].getImageReceiver().n());
                this.f2 = true;
                vs9.d(new v10(this, (byte) 1));
                k20Var.setVisibility(0);
                k20Var.animate().alpha(1.0f).setDuration(180L).setListener(new u20(this, (byte) 0)).start();
                bf0Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            }
        } else if (k20Var.getVisibility() != 0) {
        } else {
            k20Var.setTag(null);
            if (z2) {
                this.f2 = true;
                k20Var.animate().alpha(0.0f).setDuration(180L).setListener(new u20(this, (byte) 1)).start();
                bf0Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
                return;
            }
            k20Var.setAlpha(0.0f);
            k20Var.setVisibility(4);
            bf0Var.setImageBitmap(null);
            bf0Var.setScaleX(0.9f);
            bf0Var.setScaleY(0.9f);
        }
    }

    @Override
    public final ArrayList R() {
        ArrayList arrayList = new ArrayList();
        t10 t10Var = new t10(this, (byte) 0);
        int i = cmb.Ej;
        arrayList.add(new cnb(this.m1, 1024, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        int i2 = cmb.Ij;
        arrayList.add(new cnb(this.m1, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.b, 0, (Class[]) null, (Paint) null, new Drawable[]{this.s0}, (bnb) null, cmb.g5));
        arrayList.add(new cnb(this.L1, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Lj));
        int i3 = cmb.v7;
        r7 r7Var = this.O1;
        arrayList.add(new cnb(r7Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i3));
        arrayList.add(new cnb(r7Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.w7));
        int i4 = cmb.Mj;
        r7 r7Var2 = this.U1;
        arrayList.add(new cnb(r7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, i4));
        arrayList.add(new cnb(r7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, cmb.Nj));
        int i5 = cmb.D8;
        arrayList.add(new cnb(r7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, i5));
        int i6 = cmb.F8;
        arrayList.add(new cnb(r7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, i6));
        r7 r7Var3 = this.G1;
        arrayList.add(new cnb(r7Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, i4));
        arrayList.add(new cnb(r7Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, i5));
        arrayList.add(new cnb(r7Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, i6));
        m20 m20Var = this.D1;
        arrayList.add(new cnb(m20Var, new p09[]{m20Var.getAnimatedDrawable()}, "Triangle 3", i4));
        arrayList.add(new cnb(m20Var, new p09[]{m20Var.getAnimatedDrawable()}, "Triangle 4", i4));
        arrayList.add(new cnb(m20Var, new p09[]{m20Var.getAnimatedDrawable()}, "Rectangle 4", i4));
        int i7 = cmb.h6;
        arrayList.add(new cnb(this.D1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i7));
        arrayList.add(new cnb(this.Z1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i7));
        n20 n20Var = this.E1;
        arrayList.add(new cnb(n20Var, new p09[]{n20Var.getAnimatedDrawable()}, "Triangle 3", i4));
        arrayList.add(new cnb(n20Var, new p09[]{n20Var.getAnimatedDrawable()}, "Triangle 4", i4));
        arrayList.add(new cnb(n20Var, new p09[]{n20Var.getAnimatedDrawable()}, "Rectangle 4", i4));
        arrayList.add(new cnb(this.E1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i7));
        int i8 = cmb.W5;
        arrayList.add(new cnb(this.v1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i8));
        arrayList.add(new cnb(this.w1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i8));
        arrayList.add(new cnb(this.L1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.b7));
        arrayList.add(new cnb(this.L1, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g6));
        z20 z20Var = this.C1;
        arrayList.add(new cnb(z20Var.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(z20Var.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        z20 z20Var2 = this.F1;
        arrayList.add(new cnb(z20Var2.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(z20Var2.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.yj));
        return arrayList;
    }

    public final void R0(j30 j30Var, k47 k47Var) {
        bu5 H = bu5.H(this.c, this.J0, j30Var, true);
        int i = 3;
        boolean z = false;
        if (I0()) {
            H.k(2131232171, jb6.M0(2131750519, null), new b20(this, H, k47Var, (byte) 0), !this.s2);
            H.k(2131232371, jb6.M0(2131745193, null), new b20(this, H, k47Var, (byte) 1), !this.s2);
            H.b(2131232114, jb6.M0(2131751535, null), new b20(this, k47Var, H, (byte) 2), true);
        } else {
            H.k(2131232396, jb6.M0(2131753881, null), new c20(H, D0(H, k47Var), (byte) 0), !this.s2);
            if (!this.s2 && H.z() != null) {
                H.z().setRightIcon(2131232065);
            }
            H.j();
            H.k(2131232171, jb6.M0(2131750519, null), new b20(this, H, k47Var, (byte) 3), !this.s2);
            H.k(2131232369, jb6.M0(2131745193, null), new b20(this, H, k47Var, (byte) 4), !this.s2);
            if (k47Var.e1() > 0) {
                z = true;
            }
            H.k(2131232426, jb6.M0(2131745076, null), new y10(this, k47Var, (byte) 1), z);
        }
        if (!jb6.a0) {
            i = 5;
        }
        H.W(i);
        H.a0();
    }

    public final void S0() {
        if (this.A2 == 1) {
            this.D2 = System.currentTimeMillis();
            this.B2 = MediaController.w().v0.b0;
            o1 o1Var = this.H2;
            gm.r(o1Var);
            gm.c3(o1Var);
        }
    }

    @Override
    public final boolean T(float f, float f2) {
        int i;
        FrameLayout frameLayout = this.F;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.F.getChildAt(0);
            if (f2 >= childAt.getY() + this.F.getY()) {
                if (f2 <= childAt.getY() + this.F.getY() + childAt.getHeight()) {
                    if (f >= childAt.getX() + this.F.getX()) {
                        if (f <= childAt.getX() + this.F.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        int top = this.b.getTop();
        Drawable drawable = this.s0;
        if (drawable != null) {
            i = drawable.getBounds().top;
        } else {
            i = 0;
        }
        if (f2 >= top + i && f >= this.b.getLeft() && f <= this.b.getRight()) {
            return false;
        }
        return true;
    }

    public final void T0() {
        int i;
        LinearLayout linearLayout = this.u1;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        if (this.x1.getVisibility() == 0) {
            i = gm.L(150.0f);
        } else {
            i = -gm.L(30.0f);
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.b.getMeasuredHeight()) - i) / 2);
    }

    public final void U0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i30.U0():void");
    }

    public final void V0(boolean z) {
        if (this.O1 != null) {
            float f = MediaController.w().r0;
            this.P1.b(z, f);
            this.Q1.e(z, f);
            updateColors();
            boolean z2 = this.R1;
            int i = 0;
            this.R1 = false;
            while (true) {
                a8[] a8VarArr = this.S1;
                if (i < a8VarArr.length) {
                    if (!z2 && F0(f, T2[i])) {
                        a8 a8Var = a8VarArr[i];
                        int i2 = cmb.Gi;
                        a8Var.d(cmb.v0(i2, this.J0), cmb.v0(i2, this.J0));
                    } else {
                        a8 a8Var2 = a8VarArr[i];
                        int i3 = cmb.D8;
                        a8Var2.d(cmb.v0(i3, this.J0), cmb.v0(i3, this.J0));
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void W0(defpackage.k47 r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i30.W0(k47, boolean):void");
    }

    public final void X0() {
        int i = gda.O0;
        r7 r7Var = this.U1;
        if (i != 0 && i != 1) {
            if (i == 2) {
                r7Var.setIcon(2131232573);
                int i2 = cmb.Nj;
                r7Var.setTag(Integer.valueOf(i2));
                r7Var.setIconColor(cmb.v0(i2, this.J0));
                cmb.F1(r7Var.getBackground(), cmb.v0(i2, this.J0) & 436207615, true);
                r7Var.setContentDescription(jb6.M0(2131754784, null));
                return;
            }
            return;
        }
        if (gda.J0) {
            if (i == 0) {
                r7Var.setIcon(2131232574);
            } else {
                r7Var.setIcon(2131232571);
            }
        } else if (gda.K0) {
            if (i == 0) {
                r7Var.setIcon(2131232568);
            } else {
                r7Var.setIcon(2131232570);
            }
        } else {
            r7Var.setIcon(2131232572);
        }
        if (i == 0 && !gda.J0 && !gda.K0) {
            int i3 = cmb.Mj;
            r7Var.setTag(Integer.valueOf(i3));
            r7Var.setIconColor(cmb.v0(i3, this.J0));
            cmb.F1(r7Var.getBackground(), cmb.v0(cmb.h6, this.J0), true);
            r7Var.setContentDescription(jb6.M0(2131754785, null));
            return;
        }
        int i4 = cmb.Nj;
        r7Var.setTag(Integer.valueOf(i4));
        r7Var.setIconColor(cmb.v0(i4, this.J0));
        cmb.F1(r7Var.getBackground(), cmb.v0(i4, this.J0) & 436207615, true);
        if (i == 0) {
            if (gda.J0) {
                r7Var.setContentDescription(jb6.M0(2131745056, null));
                return;
            } else {
                r7Var.setContentDescription(jb6.M0(2131745760, null));
                return;
            }
        }
        r7Var.setContentDescription(jb6.M0(2131754786, null));
    }

    public final void Y0() {
        boolean z;
        N0(this.X1, gda.J0);
        N0(this.Y1, gda.K0);
        boolean z2 = false;
        if (gda.O0 == 1) {
            z = true;
        } else {
            z = false;
        }
        N0(this.W1, z);
        if (gda.O0 == 2) {
            z2 = true;
        }
        N0(this.V1, z2);
    }

    public final void Z0() {
        int i;
        int v0;
        int i2;
        int i3;
        if (this.n2) {
            i = cmb.Z6;
        } else {
            i = cmb.g5;
        }
        int v02 = cmb.v0(i, this.J0);
        if (v02 != this.N2) {
            this.N2 = v02;
            s0(v02);
        }
        int v03 = cmb.v0(cmb.Mj, this.J0);
        m20 m20Var = this.D1;
        if (m20Var != null) {
            m20Var.h(v03, "Triangle 3");
            m20Var.h(v03, "Triangle 4");
            m20Var.h(v03, "Rectangle 4");
        }
        n20 n20Var = this.E1;
        if (n20Var != null) {
            n20Var.h(v03, "Triangle 3");
            n20Var.h(v03, "Triangle 4");
            n20Var.h(v03, "Rectangle 4");
        }
        a30 a30Var = this.M1;
        if (a30Var != null) {
            a30Var.setOuterColor(cmb.v0(cmb.Lj, this.J0));
        }
        boolean z = false;
        r7 r7Var = this.O1;
        if (r7Var != null) {
            float f = MediaController.w().r0;
            if (!F0(f, 1.0f)) {
                i2 = cmb.Gi;
            } else {
                i2 = cmb.w7;
            }
            int v04 = cmb.v0(i2, this.J0);
            dna dnaVar = this.P1;
            if (dnaVar != null) {
                dnaVar.a.u(v04);
                Paint paint = dnaVar.b;
                if (paint != null) {
                    paint.setColor(v04);
                }
            }
            cmb.F1(r7Var.getBackground(), v04 & 436207615, true);
            int i4 = 0;
            while (true) {
                a8[] a8VarArr = this.S1;
                if (i4 >= a8VarArr.length) {
                    break;
                }
                if (a8VarArr[i4] != null) {
                    if (F0(f, T2[i4])) {
                        i3 = cmb.Gi;
                    } else {
                        i3 = cmb.D8;
                    }
                    int v05 = cmb.v0(i3, this.J0);
                    a8VarArr[i4].d(v05, v05);
                }
                i4++;
            }
        }
        a8 a8Var = this.I1;
        if (a8Var != null) {
            o20 o20Var = this.J1;
            if (o20Var != null && o20Var.b()) {
                z = true;
            }
            int v06 = cmb.v0(cmb.D8, this.J0);
            int v07 = cmb.v0(cmb.E8, this.J0);
            int i5 = cmb.Ei;
            a8Var.e(v06, v07, cmb.v0(i5, this.J0), z);
            a8 a8Var2 = this.I1;
            if (o20Var != null && o20Var.b()) {
                v0 = cmb.p1(0.1f, cmb.v0(i5, this.J0));
            } else {
                v0 = cmb.v0(cmb.h6, this.J0);
            }
            a8Var2.setSelectorColor(v0);
        }
    }

    public final void a1(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i30.a1(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean z;
        j30 j30Var;
        k47 messageObject;
        j30 j30Var2;
        k47 messageObject2;
        k47 k47Var;
        int i3 = nm7.h2;
        int i4 = nm7.f2;
        int i5 = nm7.g2;
        p20 p20Var = this.r1;
        int i6 = 0;
        if (i != i3 && i != i5 && i != i4) {
            if (i == nm7.e2) {
                k47 k47Var2 = MediaController.w().v0;
                if (k47Var2 != null && k47Var2.I3()) {
                    W0(k47Var2, false);
                    return;
                }
                return;
            } else if (i == nm7.N4) {
                V0(true);
                return;
            } else {
                int i7 = nm7.K0;
                h30 h30Var = this.t1;
                if (i == i7) {
                    this.p2 = MediaController.w().R0;
                    this.q2 = MediaController.w().S0;
                    h30Var.f();
                    return;
                } else if (i == nm7.L0) {
                    this.p2 = MediaController.w().R0;
                    this.q2 = MediaController.w().S0;
                    h30Var.f();
                    if (gda.K0) {
                        p20Var.D0();
                        int intValue = ((Integer) objArr[0]).intValue();
                        u46 u46Var = this.s1;
                        u46Var.K0();
                        int M0 = u46Var.M0();
                        if (M0 != -1) {
                            View m = u46Var.m(M0);
                            if (m != null) {
                                i6 = m.getTop();
                            }
                            u46Var.g1(M0 + intValue, i6);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == nm7.Y1) {
                    if (((String) objArr[0]).equals(this.u2)) {
                        a1(false);
                        this.j2 = true;
                        return;
                    }
                    return;
                } else if (i == nm7.X1) {
                    if (((String) objArr[0]).equals(this.u2) && (k47Var = MediaController.w().v0) != null) {
                        Long l = (Long) objArr[1];
                        Long l2 = (Long) objArr[2];
                        float f = 1.0f;
                        if (!this.j2) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.i2) >= 500) {
                                if (MediaController.w().m0) {
                                    f = bc4.G(this.a).t(this.u2, k47Var.b0);
                                }
                                this.i2 = elapsedRealtime;
                            } else {
                                f = -1.0f;
                            }
                        }
                        if (f != -1.0f) {
                            zna znaVar = this.h2;
                            znaVar.m.i = f * 1000.0f;
                            znaVar.h();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == nm7.X3) {
                    a1(false);
                    return;
                } else {
                    return;
                }
            }
        }
        if (i == i4 && ((Boolean) objArr[1]).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        a1(z);
        if (i != i4 && i != i5) {
            if (((k47) objArr[0]).T == 0) {
                int childCount = p20Var.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = p20Var.getChildAt(i8);
                    if ((childAt instanceof j30) && (messageObject2 = (j30Var2 = (j30) childAt).getMessageObject()) != null && (k47.Q4(messageObject2.k) || messageObject2.I3())) {
                        j30Var2.b(false, true);
                    }
                }
            } else {
                return;
            }
        } else {
            int childCount2 = p20Var.getChildCount();
            for (int i9 = 0; i9 < childCount2; i9++) {
                View childAt2 = p20Var.getChildAt(i9);
                if ((childAt2 instanceof j30) && (messageObject = (j30Var = (j30) childAt2).getMessageObject()) != null && (k47.Q4(messageObject.k) || messageObject.I3())) {
                    j30Var.b(false, true);
                }
            }
            if (i == i5 && MediaController.w().v0 != null) {
                if (MediaController.w().C()) {
                    S0();
                } else if (this.A2 == 1 && this.B2 != -1.0f) {
                    o1 o1Var = this.H2;
                    gm.r(o1Var);
                    this.E2 = 0L;
                    o1Var.run();
                    this.B2 = -1.0f;
                }
            }
        }
        ai2 ai2Var = this.H1;
        if (ai2Var != null) {
            ai2Var.a(fp.w());
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        nm7.f(this.a).n(this, nm7.f2);
        nm7.f(this.a).n(this, nm7.g2);
        nm7.f(this.a).n(this, nm7.h2);
        nm7.f(this.a).n(this, nm7.e2);
        nm7.f(this.a).n(this, nm7.Y1);
        nm7.f(this.a).n(this, nm7.X1);
        nm7.f(this.a).n(this, nm7.K0);
        nm7.f(this.a).n(this, nm7.L0);
        nm7.f(this.a).n(this, nm7.X3);
        nm7.e().n(this, nm7.N4);
        er3.q(this.a).v(this);
        if (S2 == this) {
            S2 = null;
        }
    }

    @Override
    public final int getObserverTag() {
        return this.y2;
    }

    @Override
    public final boolean h0(View view, int i, int i2, int i3, int i4) {
        k20 k20Var = this.b2;
        if (view != k20Var) {
            return false;
        }
        k20Var.layout(0, 0, k20Var.getMeasuredWidth(), k20Var.getMeasuredHeight());
        return true;
    }

    @Override
    public final void i(long j, long j2) {
        this.L1.a(true, Math.min(1.0f, ((float) j) / ((float) j2)));
    }

    @Override
    public final boolean i0(View view, int i, int i2) {
        k20 k20Var = this.b2;
        if (view == k20Var) {
            dy0 dy0Var = this.c;
            k20Var.measure(View.MeasureSpec.makeMeasureSpec(dy0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(dy0Var.getMeasuredHeight(), 1073741824));
            return true;
        }
        return false;
    }

    @Override
    public final void onBackPressed() {
        x20 x20Var = this.m1;
        if (x20Var != null && x20Var.o0) {
            x20Var.o(true);
        } else if (this.b2.getTag() != null) {
            Q0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void p0() {
        boolean z;
        super.p0();
        try {
            if (this.e2 != null && this.U1 != null && this.G1 != null && this.L1 != null) {
                E0();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            Z0();
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
        try {
            float f = this.G2;
            if (f >= 0.0f) {
                if (f <= 0.5f && on2.h(cmb.v0(cmb.g5, this.J0)) > 0.699999988079071d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != this.F2) {
                    this.F2 = z;
                    gm.l3(this, z);
                }
            }
        } catch (Exception e3) {
            fc4.g(e3, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        S2 = this;
    }

    public final void updateColors() {
        int v0;
        int i;
        boolean z = true;
        r7 r7Var = this.O1;
        if (r7Var != null) {
            if (!F0(MediaController.w().r0, 1.0f)) {
                i = cmb.Gi;
            } else {
                i = cmb.w7;
            }
            int v02 = cmb.v0(i, this.J0);
            dna dnaVar = this.P1;
            if (dnaVar != null) {
                dnaVar.a.u(v02);
                Paint paint = dnaVar.b;
                if (paint != null) {
                    paint.setColor(v02);
                }
            }
            r7Var.setBackground(cmb.f0(v02 & 436207615, 1, gm.L(14.0f)));
        }
        a8 a8Var = this.I1;
        if (a8Var != null) {
            o20 o20Var = this.J1;
            z = (o20Var == null || !o20Var.b()) ? false : false;
            int v03 = cmb.v0(cmb.D8, this.J0);
            int v04 = cmb.v0(cmb.E8, this.J0);
            int i2 = cmb.Ei;
            a8Var.e(v03, v04, cmb.v0(i2, this.J0), z);
            a8 a8Var2 = this.I1;
            if (o20Var != null && o20Var.b()) {
                v0 = cmb.p1(0.1f, cmb.v0(i2, this.J0));
            } else {
                v0 = cmb.v0(cmb.h6, this.J0);
            }
            a8Var2.setSelectorColor(v0);
        }
    }

    @Override
    public final void z(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.Hj));
        hashSet.add(Integer.valueOf(cmb.Lj));
        hashSet.add(Integer.valueOf(cmb.Kj));
        hashSet.add(Integer.valueOf(cmb.Yd));
        hashSet.add(Integer.valueOf(cmb.Zd));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.ld));
        hashSet.add(Integer.valueOf(cmb.kd));
        hashSet.add(Integer.valueOf(cmb.Ze));
        hashSet.add(Integer.valueOf(cmb.Dc));
        hashSet.add(Integer.valueOf(cmb.Ye));
    }

    @Override
    public final void A(boolean z) {
    }

    @Override
    public final void N(String str) {
    }

    @Override
    public final void l(long j, long j2) {
    }
}
