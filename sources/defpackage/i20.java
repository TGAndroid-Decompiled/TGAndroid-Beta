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
public final class i20 extends fx0 implements gk7, sp3 {
    public static i20 S2;
    public static final float[] T2 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final is5 A1;
    public int A2;
    public final y10 B1;
    public float B2;
    public final z10 C1;
    public int C2;
    public final m10 D1;
    public long D2;
    public final n10 E1;
    public long E2;
    public final z10 F1;
    public boolean F2;
    public final r7 G1;
    public float G2;
    public final mg2 H1;
    public final o1 H2;
    public a8 I1;
    public t10 I2;
    public final o10 J1;
    public long J2;
    public final boolean K1;
    public float K2;
    public final j26 L1;
    public final v10 L2;
    public final a20 M1;
    public ValueAnimator M2;
    public final jia N1;
    public int N2;
    public final r7 O1;
    public boolean O2;
    public final cla P1;
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
    public final xb8 a2;
    public final k10 b2;
    public final be0 c2;
    public final r7 d2;
    public final r7 e2;
    public boolean f2;
    public final View[] g2;
    public final yla h2;
    public long i2;
    public boolean j2;
    public boolean k2;
    public final View l1;
    public int l2;
    public final x10 m1;
    public int m2;
    public final View n1;
    public final boolean n2;
    public final View o1;
    public final boolean o2;
    public boolean p1;
    public ia7 p2;
    public boolean q1;
    public ArrayList q2;
    public final p10 r1;
    public k27 r2;
    public final t26 s1;
    public boolean s2;
    public final h20 t1;
    public int t2;
    public final LinearLayout u1;
    public String u2;
    public final TextView v1;
    public AnimatorSet v2;
    public final TextView w1;
    public int w2;
    public final k10 x1;
    public int x2;
    public final u41 y1;
    public final int y2;
    public final u41 z1;
    public final LaunchActivity z2;

    public i20(Activity activity, final wjb wjbVar) {
        super(1, wjbVar, (Context) activity, true);
        int i;
        boolean z;
        r6 r6Var;
        boolean z2;
        TLRPC.User V1;
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
        this.L2 = new v10(this);
        this.r = true;
        K();
        k27 k27Var = MediaController.w().v0;
        if (k27Var != null) {
            i = k27Var.K1;
            this.a = i;
        } else {
            i = y6c.t0;
            this.a = i;
        }
        this.z2 = (LaunchActivity) activity;
        this.y2 = up3.q(i).k();
        kk7.f(this.a).b(this, kk7.e2);
        kk7.f(this.a).b(this, kk7.f2);
        kk7.f(this.a).b(this, kk7.g2);
        kk7.f(this.a).b(this, kk7.d2);
        kk7.f(this.a).b(this, kk7.X1);
        kk7.f(this.a).b(this, kk7.W1);
        kk7.f(this.a).b(this, kk7.J0);
        kk7.f(this.a).b(this, kk7.K0);
        kk7.f(this.a).b(this, kk7.W3);
        kk7.e().b(this, kk7.L4);
        w10 w10Var = new w10(this, activity);
        this.b = w10Var;
        w10Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i4 = this.u0;
        viewGroup.setPadding(i4, 0, i4, 0);
        x10 x10Var = new x10(this, activity, wjbVar, (byte) 0);
        this.m1 = x10Var;
        x10Var.setBackgroundColor(0);
        x10Var.setBackButtonImage(2131231243);
        int i5 = bkb.Ej;
        zkb.l(x10Var, 1, i5, wjbVar);
        zkb.l(x10Var, 3, bkb.Dj, wjbVar);
        zkb.l(x10Var, 5, i5, wjbVar);
        zkb.l(x10Var, 6, bkb.Fj, wjbVar);
        x10Var.setOccupyStatusBar(true);
        r6 t = x10Var.t();
        t.setLayoutParams(nme.e(-1, -1, 119));
        View view = new View(activity);
        this.l1 = view;
        zkb.h(bkb.g5, wjbVar, view);
        x10Var.addView(view, 0, nme.e(-1, -1, 119));
        view.setAlpha(0.0f);
        x10Var.setAlpha(0.0f);
        x10Var.setActionBarMenuOnItemClick(new r8(this, (byte) 3));
        View view2 = new View(activity);
        this.n1 = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(2131231240);
        View view3 = new View(activity);
        this.o1 = view3;
        zkb.h(bkb.U5, wjbVar, view3);
        k10 k10Var = new k10(this, activity, (byte) 2);
        this.x1 = k10Var;
        y10 y10Var = new y10(this, activity);
        this.B1 = y10Var;
        k10Var.addView(y10Var, nme.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        z10 z10Var = new z10(this, activity, activity, (byte) 0);
        this.C1 = z10Var;
        k10Var.addView(z10Var, nme.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        z10 z10Var2 = new z10(this, activity, activity, (byte) 1);
        this.F1 = z10Var2;
        k10Var.addView(z10Var2, nme.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        a20 a20Var = new a20(this, activity, wjbVar);
        this.M1 = a20Var;
        a20Var.setLineWidth(4);
        a20Var.setDelegate(new lj9(this, (byte) 7));
        a20Var.setReportChanges(true);
        k10Var.addView(a20Var, nme.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        yla ylaVar = new yla(new ti4(0.0f));
        zla zlaVar = new zla();
        zlaVar.b(750.0f);
        zlaVar.a(1.0f);
        ylaVar.m = zlaVar;
        ylaVar.b(new h10(this, (byte) 0));
        this.h2 = ylaVar;
        j26 j26Var = new j26(activity);
        this.L1 = j26Var;
        j26Var.setVisibility(4);
        zkb.h(bkb.Jj, wjbVar, j26Var);
        j26Var.setProgressColor(bkb.v0(bkb.Lj, this.J0));
        k10Var.addView(j26Var, nme.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        jia jiaVar = new jia(activity);
        this.N1 = jiaVar;
        jiaVar.setTextSize(12);
        jiaVar.l("0:00", false);
        int i6 = bkb.Ij;
        zkb.W(jiaVar, i6, wjbVar);
        jiaVar.setImportantForAccessibility(2);
        k10Var.addView(jiaVar, nme.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.T1 = textView;
        textView.setTextSize(1, 12.0f);
        zkb.X(textView, i6, wjbVar);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        k10Var.addView(textView, nme.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        r7 r7Var = new r7(activity, null, 0, bkb.v0(i6, this.J0), false, wjbVar);
        this.O1 = r7Var;
        r7Var.setLongClickEnabled(false);
        r7Var.setShowSubmenuByMove(false);
        r7Var.setAdditionalYOffset(-gl.L(224.0f));
        r7Var.setContentDescription(k96.M0(2131754804, null));
        r7Var.setDelegate(new u00(this, (byte) 0));
        cla claVar = new cla();
        this.P1 = claVar;
        r7Var.setIcon(claVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        v7 v7Var = new v7(getContext(), wjbVar);
        this.Q1 = v7Var;
        v7Var.setRoundRadiusDp(6.0f);
        v7Var.setDrawShadow(true);
        v7Var.setOnValueChange(new v00(this, (byte) 0));
        a8VarArr[0] = r7Var.e(0, 2131232378, k96.M0(2131745029, null));
        a8VarArr[1] = r7Var.e(1, 2131232377, k96.M0(2131745030, null));
        a8VarArr[2] = r7Var.e(2, 2131232376, k96.M0(2131745031, null));
        a8VarArr[3] = r7Var.e(3, 2131232375, k96.M0(2131745033, null));
        a8VarArr[4] = r7Var.e(4, 2131232380, k96.M0(2131745027, null));
        a8VarArr[5] = r7Var.e(5, 2131232379, k96.M0(2131745028, null));
        if (gl.p >= 3.0f) {
            r7Var.setPadding(0, 1, 0, 0);
        }
        r7Var.setAdditionalXOffset(gl.L(8.0f));
        r7Var.setAdditionalYOffset(-gl.L(400.0f));
        r7Var.setShowedFromBottom(true);
        k10Var.addView(r7Var, nme.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        r7Var.setOnClickListener(new t(this, fArr, (byte) 19));
        r7Var.setOnLongClickListener(new u0(this, wjbVar, (byte) 1));
        V0(false);
        k10 k10Var2 = new k10(this, activity, (byte) 0);
        k10Var.addView(k10Var2, nme.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        r7 r7Var2 = new r7(activity, null, 0, 0, false, wjbVar);
        this.U1 = r7Var2;
        viewArr[0] = r7Var2;
        r7Var2.setLongClickEnabled(false);
        r7Var2.setShowSubmenuByMove(false);
        r7Var2.setAdditionalYOffset(-gl.L(166.0f));
        int i7 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.v0(i7, this.J0), 1, gl.L(18.0f));
        vkb M = zkb.M(i7);
        r7Var2.setBackground(f0);
        zkb.j(r7Var2, f0, null, M, wjbVar);
        k10Var2.addView(r7Var2, nme.e(48, 48, 51));
        r7Var2.setOnClickListener(new View.OnClickListener(this) {
            public final i20 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view4) {
                byte b = r2;
                i20 i20Var = this.b;
                switch (b) {
                    case 0:
                        i20Var.Y0();
                        i20Var.U1.U(null, null);
                        return;
                    default:
                        o10 o10Var = i20Var.J1;
                        k27 k27Var2 = MediaController.w().v0;
                        if (k27Var2 != null) {
                            boolean z3 = true;
                            cs5 H = cs5.H(i20Var.c, i20Var.J0, view4, true);
                            cs5 D0 = i20Var.D0(H, k27Var2);
                            if (!i20Var.I0()) {
                                H.k(2131232395, k96.M0(2131753913, null), new c10(H, D0, (byte) 1), !i20Var.s2);
                                if (!i20Var.s2 && H.z() != null) {
                                    H.z().setRightIcon(2131232064);
                                }
                                H.j();
                            }
                            H.k(2131232170, k96.M0(2131750570, null), new d10(i20Var, H, (byte) 0), !i20Var.s2);
                            H.k(2131232370, k96.M0(2131745267, null), new d10(i20Var, H, (byte) 1), !i20Var.s2);
                            if (k27Var2.e1() <= 0) {
                                z3 = false;
                            }
                            H.k(2131232229, k96.M0(2131745150, null), new d10(i20Var, H, (byte) 2), z3);
                            if (i20Var.K1) {
                                a8 a8Var = new a8(0, H.d, H.e, false, false);
                                H.c(a8Var);
                                i20Var.I1 = a8Var;
                                a8Var.j(k96.M0(2131743350, null), 2131231916, null);
                                i20Var.I1.setOnClickListener(new t(i20Var, H, (byte) 20));
                                gl.B2(o10Var);
                                i20Var.I1.addView(o10Var, 0, nme.c(-1.0f, -1));
                                i20Var.updateColors();
                            }
                            H.l(2131232113, new d10(i20Var, H, (byte) 3), k96.M0(2131746452, null), i20Var.I0(), true);
                            H.Y(gl.L(64.0f));
                            H.a0();
                            return;
                        }
                        return;
                }
            }
        });
        this.V1 = r7Var2.e(3, 2131232561, k96.M0(2131746080, null));
        this.W1 = r7Var2.e(4, 2131232560, k96.M0(2131746083, null));
        r7Var2.a(-1).getLayoutParams().height = gl.L(4.0f);
        this.X1 = r7Var2.e(2, 2131232562, k96.M0(2131745130, null));
        r7Var2.a(-1).getLayoutParams().height = gl.L(4.0f);
        this.Y1 = r7Var2.e(1, 2131232556, k96.M0(2131745834, null));
        r7Var2.setShowedFromBottom(true);
        r7Var2.setDelegate(new u00(this, (byte) 1));
        int i8 = bkb.Mj;
        int v0 = bkb.v0(i8, this.J0);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        m10 m10Var = new m10(this, activity, scaledTouchSlop);
        this.D1 = m10Var;
        viewArr[1] = m10Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        m10Var.setScaleType(scaleType);
        m10Var.f(2131624137, 20, 20, null);
        m10Var.h(v0, "Triangle 3");
        m10Var.h(v0, "Triangle 4");
        m10Var.h(v0, "Rectangle 4");
        ff0 f02 = bkb.f0(bkb.v0(i7, this.J0), 1, gl.L(22.0f));
        vkb M2 = zkb.M(i7);
        m10Var.setBackground(f02);
        zkb.j(m10Var, f02, null, M2, wjbVar);
        k10Var2.addView(m10Var, nme.e(48, 48, 51));
        m10Var.setContentDescription(k96.M0(2131754799, null));
        ImageView imageView = new ImageView(activity);
        this.Z1 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        xb8 xb8Var = new xb8(28);
        this.a2 = xb8Var;
        imageView.setImageDrawable(xb8Var);
        xb8Var.a(!MediaController.w().C(), false);
        zkb.s(imageView, i8, wjbVar, PorterDuff.Mode.MULTIPLY);
        ff0 f03 = bkb.f0(bkb.v0(i7, this.J0), 1, gl.L(24.0f));
        vkb M3 = zkb.M(i7);
        imageView.setBackground(f03);
        zkb.j(imageView, f03, null, M3, wjbVar);
        k10Var2.addView(imageView, nme.e(48, 48, 51));
        imageView.setOnClickListener(new x00((byte) 0));
        n10 n10Var = new n10(this, activity, scaledTouchSlop);
        this.E1 = n10Var;
        viewArr[3] = n10Var;
        n10Var.setScaleType(scaleType);
        n10Var.f(2131624137, 20, 20, null);
        n10Var.h(v0, "Triangle 3");
        n10Var.h(v0, "Triangle 4");
        n10Var.h(v0, "Rectangle 4");
        n10Var.setRotation(180.0f);
        ff0 f04 = bkb.f0(bkb.v0(i7, this.J0), 1, gl.L(22.0f));
        vkb M4 = zkb.M(i7);
        n10Var.setBackground(f04);
        zkb.j(n10Var, f04, null, M4, wjbVar);
        k10Var2.addView(n10Var, nme.e(48, 48, 51));
        n10Var.setContentDescription(k96.M0(2131748058, null));
        r7 r7Var3 = new r7(activity, null, 0, v0, false, wjbVar);
        this.G1 = r7Var3;
        viewArr[4] = r7Var3;
        mg2 mg2Var = new mg2(activity, 2131231247, wjbVar);
        this.H1 = mg2Var;
        r7Var3.setIcon(mg2Var);
        r7Var3.setLongClickEnabled(false);
        r7Var3.setAdditionalYOffset(-gl.L(197.0f));
        ff0 f05 = bkb.f0(bkb.v0(i7, this.J0), 1, gl.L(18.0f));
        vkb M5 = zkb.M(i7);
        r7Var3.setBackground(f05);
        zkb.j(r7Var3, f05, null, M5, wjbVar);
        r7Var3.setOnClickListener(new View.OnClickListener(this) {
            public final i20 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view4) {
                byte b = r2;
                i20 i20Var = this.b;
                switch (b) {
                    case 0:
                        i20Var.Y0();
                        i20Var.U1.U(null, null);
                        return;
                    default:
                        o10 o10Var = i20Var.J1;
                        k27 k27Var2 = MediaController.w().v0;
                        if (k27Var2 != null) {
                            boolean z3 = true;
                            cs5 H = cs5.H(i20Var.c, i20Var.J0, view4, true);
                            cs5 D0 = i20Var.D0(H, k27Var2);
                            if (!i20Var.I0()) {
                                H.k(2131232395, k96.M0(2131753913, null), new c10(H, D0, (byte) 1), !i20Var.s2);
                                if (!i20Var.s2 && H.z() != null) {
                                    H.z().setRightIcon(2131232064);
                                }
                                H.j();
                            }
                            H.k(2131232170, k96.M0(2131750570, null), new d10(i20Var, H, (byte) 0), !i20Var.s2);
                            H.k(2131232370, k96.M0(2131745267, null), new d10(i20Var, H, (byte) 1), !i20Var.s2);
                            if (k27Var2.e1() <= 0) {
                                z3 = false;
                            }
                            H.k(2131232229, k96.M0(2131745150, null), new d10(i20Var, H, (byte) 2), z3);
                            if (i20Var.K1) {
                                a8 a8Var = new a8(0, H.d, H.e, false, false);
                                H.c(a8Var);
                                i20Var.I1 = a8Var;
                                a8Var.j(k96.M0(2131743350, null), 2131231916, null);
                                i20Var.I1.setOnClickListener(new t(i20Var, H, (byte) 20));
                                gl.B2(o10Var);
                                i20Var.I1.addView(o10Var, 0, nme.c(-1.0f, -1));
                                i20Var.updateColors();
                            }
                            H.l(2131232113, new d10(i20Var, H, (byte) 3), k96.M0(2131746452, null), i20Var.I0(), true);
                            H.Y(gl.L(64.0f));
                            H.a0();
                            return;
                        }
                        return;
                }
            }
        });
        k10Var2.addView(r7Var3, nme.e(48, 48, 51));
        o10 o10Var = new o10(this, activity, (byte) 0);
        this.J1 = o10Var;
        this.K1 = true;
        try {
            o10Var.setRouteSelector(ad1.c(activity).a());
        } catch (Exception e) {
            fa4.g(e, true);
            this.K1 = false;
        }
        this.J1.setVisibility(4);
        mg2 mg2Var2 = this.H1;
        if (mg2Var2 != null) {
            mg2Var2.a(fo.w());
        }
        this.G1.setShowedFromBottom(true);
        this.G1.setDelegate(new u00(this, (byte) 2));
        this.G1.setContentDescription(k96.M0(2131754838, null));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.u1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i9 = 8;
        linearLayout.setVisibility(8);
        this.b.addView(linearLayout, nme.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new p8((byte) 15));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(2131232446);
        zkb.s(imageView2, bkb.V5, wjbVar, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, nme.o(-2, -2));
        TextView textView2 = new TextView(activity);
        this.v1 = textView2;
        int i10 = bkb.W5;
        zkb.X(textView2, i10, wjbVar);
        textView2.setGravity(17);
        textView2.setText(k96.M0(2131748051, null));
        textView2.setTypeface(gl.o());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(gl.L(40.0f), 0, gl.L(40.0f), 0);
        linearLayout.addView(textView2, nme.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.w1 = textView3;
        zkb.X(textView3, i10, wjbVar);
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(gl.L(40.0f), 0, gl.L(40.0f), 0);
        linearLayout.addView(textView3, nme.t(-2, -2, 17, 0, 6, 0, 0));
        p10 p10Var = new p10(this, activity);
        this.r1 = p10Var;
        p10Var.setClipToPadding(false);
        getContext();
        t26 t26Var = new t26(1, false);
        this.s1 = t26Var;
        p10Var.setLayoutManager(t26Var);
        p10Var.setHorizontalScrollBarEnabled(false);
        p10Var.setVerticalScrollBarEnabled(false);
        this.b.addView(p10Var, nme.e(-1, -1, 51));
        h20 h20Var = new h20(this, activity);
        this.t1 = h20Var;
        p10Var.setAdapter(h20Var);
        zkb.l(p10Var, 21, bkb.z5, wjbVar);
        p10Var.setOnItemClickListener(new l5((byte) 1));
        p10Var.setOnItemLongClickListener(new u00(this, (byte) 3));
        p10Var.setOnScrollListener(new y(this, (byte) 5));
        u41 u41Var = new u41(wjbVar, activity, true);
        u41Var.setRoundRadius(24);
        this.y1 = u41Var;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        spannableStringBuilder.setSpan(new cm2(2131231180, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) k96.M0(2131753922, null));
        u41Var.setText(spannableStringBuilder);
        u41Var.setOnClickListener(new View.OnClickListener(this) {
            public final i20 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view4) {
                byte b = r3;
                wjb wjbVar2 = wjbVar;
                i20 i20Var = this.b;
                switch (b) {
                    case 0:
                        k27 k27Var2 = MediaController.w().v0;
                        if (k27Var2 != null && i20Var.z2 != null) {
                            i20Var.L0(k27Var2, true, new jc((byte) 10), false);
                            i20Var.O0(true);
                            ir2.v(null, 2131753909, new u21((FrameLayout) i20Var.b, wjbVar2), 2131624185, 36);
                            return;
                        }
                        return;
                    default:
                        k27 k27Var3 = MediaController.w().v0;
                        if (k27Var3 != null && i20Var.z2 != null) {
                            i20Var.L0(k27Var3, false, new jc((byte) 10), false);
                            i20Var.O0(false);
                            ir2.v(null, 2131753908, new u21((FrameLayout) i20Var.b, wjbVar2), 2131624052, 36);
                            return;
                        }
                        return;
                }
            }
        });
        this.x1.addView(u41Var, nme.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        u41 u41Var2 = new u41(wjbVar, activity, true);
        u41Var2.setRoundRadius(24);
        u41Var2.e();
        this.z1 = u41Var2;
        u41Var2.setText(k96.M0(2131753914, null));
        u41Var2.setOnClickListener(new View.OnClickListener(this) {
            public final i20 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view4) {
                byte b = r3;
                wjb wjbVar2 = wjbVar;
                i20 i20Var = this.b;
                switch (b) {
                    case 0:
                        k27 k27Var2 = MediaController.w().v0;
                        if (k27Var2 != null && i20Var.z2 != null) {
                            i20Var.L0(k27Var2, true, new jc((byte) 10), false);
                            i20Var.O0(true);
                            ir2.v(null, 2131753909, new u21((FrameLayout) i20Var.b, wjbVar2), 2131624185, 36);
                            return;
                        }
                        return;
                    default:
                        k27 k27Var3 = MediaController.w().v0;
                        if (k27Var3 != null && i20Var.z2 != null) {
                            i20Var.L0(k27Var3, false, new jc((byte) 10), false);
                            i20Var.O0(false);
                            ir2.v(null, 2131753908, new u21((FrameLayout) i20Var.b, wjbVar2), 2131624052, 36);
                            return;
                        }
                        return;
                }
            }
        });
        this.x1.addView(u41Var2, nme.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ia7 ia7Var = MediaController.w().R0;
        this.p2 = ia7Var;
        if (ia7Var != null) {
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
            this.d2 = r6Var.a(8, 2131232047);
        } else {
            r6Var = t;
        }
        r7 a = r6Var.a(0, 2131232491);
        a.N();
        a.I = new q10(this, (byte) 0);
        this.e2 = a;
        a.setContentDescription(k96.M0(2131745644, null));
        EditTextBoldCursor searchField = a.getSearchField();
        searchField.setHint(k96.M0(2131745644, null));
        int i11 = bkb.Ej;
        zkb.X(searchField, i11, wjbVar);
        zkb.D(searchField, bkb.Ij, wjbVar);
        zkb.l(searchField, 30, i11, wjbVar);
        if (z) {
            p10Var.r1();
            s0(bkb.v0(bkb.Z6, wjbVar));
            this.m1.setAlpha(1.0f);
            this.l1.setAlpha(0.0f);
            v10 v10Var = this.L2;
            x10 x10Var2 = this.m1;
            Float valueOf = Float.valueOf(0.0f);
            v10Var.getClass();
            v10Var.a(x10Var2, valueOf);
        }
        if (this.q2.size() > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        h20Var.h = z2;
        if (z2) {
            p10Var.setVisibility(0);
            p10Var.setTranslationY(0.0f);
        } else {
            p10Var.setVisibility(8);
            p10Var.setTranslationY(gl.q.y);
        }
        h20Var.f();
        this.m1.setTitle(k96.M0(2131753949, null));
        ia7 ia7Var2 = this.p2;
        if (ia7Var2 != null) {
            int i12 = (ia7Var2.b > y6c.h(this.a).e() ? 1 : (ia7Var2.b == y6c.h(this.a).e() ? 0 : -1));
            x10 x10Var3 = this.m1;
            if (i12 == 0) {
                x10Var3.setTitle(k96.M0(2131746450, null));
            } else {
                x10Var3.setTitle(k96.a0(null, null, 2131746451, cf3.s(this.p2.b)));
            }
        } else if (k27Var != null && MediaController.w().D0 == null) {
            long B0 = k27.B0(k27Var.k);
            boolean B = cf3.B(B0);
            int i13 = this.a;
            if (B) {
                TLRPC.EncryptedChat Y0 = na7.q1(i13).Y0(Integer.valueOf((int) (B0 & 4294967295L)));
                if (Y0 != null && (V1 = na7.q1(this.a).V1(Long.valueOf(Y0.user_id))) != null) {
                    this.m1.setTitle(qu2.m(0, V1.first_name, V1.last_name));
                }
            } else if (B0 == y6c.h(i13).e()) {
                int i14 = (k27Var.P1() > 2666000L ? 1 : (k27Var.P1() == 2666000L ? 0 : -1));
                x10 x10Var4 = this.m1;
                if (i14 == 0) {
                    x10Var4.setTitle(k96.M0(2131754249, null));
                } else {
                    x10Var4.setTitle(k96.M0(2131745709, null));
                }
            } else {
                boolean D = cf3.D(B0);
                int i15 = this.a;
                if (D) {
                    TLRPC.User V12 = na7.q1(i15).V1(Long.valueOf(B0));
                    if (V12 != null) {
                        this.m1.setTitle(qu2.m(0, V12.first_name, V12.last_name));
                    }
                } else {
                    TLRPC.Chat K0 = na7.q1(i15).K0(Long.valueOf(-B0));
                    if (K0 != null) {
                        this.m1.setTitle(K0.title);
                    }
                }
            }
        }
        if (I0()) {
            u41Var.setVisibility(8);
            u41Var2.setVisibility(8);
            is5 is5Var = new is5(new r10(this, (byte) 0));
            this.A1 = is5Var;
            is5Var.h(p10Var);
        }
        ViewGroup viewGroup2 = this.b;
        k10 k10Var3 = this.x1;
        int i16 = 52;
        if (!I0() && !this.s2) {
            i2 = 52;
        } else {
            i2 = 0;
        }
        viewGroup2.addView(k10Var3, nme.e(-1, i2 + 179, 83));
        this.b.addView(this.o1, new FrameLayout.LayoutParams(-1, gl.e1(), 83));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.x1.getLayoutParams();
        if (!I0() && !this.s2) {
            i3 = 52;
        } else {
            i3 = 0;
        }
        layoutParams.height = gl.L(i3 + 179);
        ((FrameLayout.LayoutParams) this.o1.getLayoutParams()).bottomMargin = gl.L(179 + ((I0() || this.s2) ? 0 : 0));
        this.b.addView(this.n1, nme.c(3.0f, -1));
        this.b.addView(this.m1);
        k10 k10Var4 = new k10(this, activity, (byte) 1);
        this.b2 = k10Var4;
        k10Var4.setAlpha(0.0f);
        k10Var4.setVisibility(4);
        this.c.addView(k10Var4);
        be0 be0Var = new be0(activity);
        this.c2 = be0Var;
        be0Var.setAspectFit(true);
        be0Var.setRoundRadius(gl.L(8.0f));
        be0Var.setScaleX(0.9f);
        be0Var.setScaleY(0.9f);
        k10Var4.addView(be0Var, nme.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        a1(false);
        X0();
        if (this.q1 && h20Var.b() == 0) {
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

    public static gl5 H0(k27 k27Var) {
        TLRPC.PhotoSize photoSize;
        TLRPC.Document F0 = k27Var.F0();
        if (F0 != null) {
            photoSize = ba4.w(F0.thumbs, 360, false, null, false);
        } else {
            photoSize = null;
        }
        if (!(photoSize instanceof TLRPC.TL_photoSize) && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            photoSize = null;
        }
        if (photoSize != null) {
            return gl5.c(photoSize, F0);
        }
        String u0 = k27Var.u0(true);
        if (u0 == null) {
            return null;
        }
        return gl5.g(u0);
    }

    @Override
    public final void A(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.Hj));
        hashSet.add(Integer.valueOf(bkb.Lj));
        hashSet.add(Integer.valueOf(bkb.Kj));
        hashSet.add(Integer.valueOf(bkb.Yd));
        hashSet.add(Integer.valueOf(bkb.Zd));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.ld));
        hashSet.add(Integer.valueOf(bkb.kd));
        hashSet.add(Integer.valueOf(bkb.Ze));
        hashSet.add(Integer.valueOf(bkb.Dc));
        hashSet.add(Integer.valueOf(bkb.Ye));
    }

    @Override
    public final boolean D() {
        return false;
    }

    public final cs5 D0(cs5 cs5Var, k27 k27Var) {
        long j;
        ha7 E1 = na7.q1(this.a).E1();
        TLRPC.Document F0 = k27Var.F0();
        if (F0 != null) {
            j = F0.id;
        } else {
            j = 0;
        }
        cs5 K = cs5Var.K();
        K.b(2131231243, k96.M0(2131753753, null), new en1(cs5Var, (byte) 0), false);
        K.j();
        K.k(2131231625, k96.M0(2131753910, null), new b10(this, k27Var, cs5Var, (byte) 6), !E1.b.contains(Long.valueOf(j)));
        K.b(2131232356, k96.M0(2131753907, null), new b10(this, k27Var, cs5Var, (byte) 7), false);
        K.b(2131231793, k96.M0(2131753911, null), new b10(this, k27Var, cs5Var, (byte) 8), false);
        K.j();
        K.o(12, gl.L(200.0f), k96.M0(2131753912, null));
        return K;
    }

    public final void E0() {
        r7 r7Var = this.U1;
        int v0 = bkb.v0(((Integer) r7Var.getTag()).intValue(), this.J0);
        int v02 = bkb.v0(bkb.Mj, this.J0);
        int v03 = bkb.v0(bkb.h6, this.J0);
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
            bkb.F1(r7Var.getBackground(), v03, true);
            bkb.F1(r7Var2.getBackground(), v03, true);
        }
        this.O2 = true;
        this.L1.setProgressColor(bkb.v0(bkb.Lj, this.J0));
        Y0();
        int i = bkb.F8;
        r7Var.I(bkb.v0(i, this.J0));
        int i2 = bkb.D8;
        r7Var2.O(bkb.v0(i2, this.J0), false);
        r7Var2.O(bkb.v0(i2, this.J0), true);
        r7Var2.I(bkb.v0(i, this.J0));
    }

    public final void G0(k27 k27Var) {
        ArrayList t;
        TLRPC.TL_document tL_document;
        int i = y6c.t0;
        int i2 = this.a;
        LaunchActivity launchActivity = this.z2;
        if (i != i2) {
            launchActivity.N0(i2);
        }
        Bundle j = tb4.j(3, "onlySelect", "dialogsType", true);
        j.putBoolean("canSelectTopics", true);
        cj3 cj3Var = new cj3(j);
        if (k27Var.e1() < 0) {
            if (!(k27Var.F0() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) k27Var.F0();
            t = null;
        } else {
            t = tb4.t(k27Var);
            tL_document = null;
        }
        cj3Var.E2 = new lt(this, t, tL_document, k27Var, (byte) 1);
        launchActivity.t0(cj3Var);
        dismiss();
    }

    public final boolean I0() {
        ia7 ia7Var = this.p2;
        if (ia7Var != null && ia7Var.b == y6c.h(this.a).e()) {
            return true;
        }
        return false;
    }

    public final void J0(int i) {
        LaunchActivity launchActivity;
        k27 k27Var = MediaController.w().v0;
        if (k27Var != null && (launchActivity = this.z2) != null) {
            if (i == 1) {
                G0(k27Var);
            } else if (i == 2) {
                P0(k27Var);
            } else if (i == 4) {
                int i2 = y6c.t0;
                int i3 = this.a;
                if (i2 != i3) {
                    launchActivity.N0(i3);
                }
                Bundle bundle = new Bundle();
                long B0 = k27.B0(k27Var.k);
                if (cf3.B(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (cf3.D(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat K0 = na7.q1(this.a).K0(Long.valueOf(-B0));
                    if (K0 != null && K0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -K0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", k27Var.e1());
                kk7.f(this.a).k(kk7.s, new Object[0]);
                launchActivity.u0(new mu1(bundle), false, false);
                dismiss();
            } else if (i == 5) {
                K0(k27Var);
            } else if (i == 6) {
                tg2.N().Y(MediaController.w().u());
                this.J1.performClick();
            } else if (i == 7) {
                L0(k27Var, false, new y00(this, k27Var, (byte) 0), false);
            } else if (i == 8) {
                yx9 yx9Var = new yx9(getContext(), true, null, new a10(this, (byte) 0), null);
                yx9Var.c2 = true;
                yx9Var.U1 = false;
                yx9Var.j2.O(true);
                yx9Var.show();
            }
        }
    }

    public final void K0(k27 k27Var) {
        String str;
        if (Build.VERSION.SDK_INT <= 28 || w01.b) {
            LaunchActivity launchActivity = this.z2;
            if (launchActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                launchActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        String B = ba4.B(k27Var.F0());
        if (TextUtils.isEmpty(B)) {
            B = k27Var.S0();
        }
        String str2 = B;
        String str3 = k27Var.k.attachPath;
        if (str3 != null && str3.length() > 0 && !oo1.t(str3)) {
            str3 = null;
        }
        if (str3 == null || str3.length() == 0) {
            ba4.G(this.a);
            str3 = ba4.M(k27Var.k, false, true).toString();
        }
        if (k27Var.F0() != null) {
            str = k27Var.F0().mime_type;
        } else {
            str = "";
        }
        String str4 = str;
        String str5 = str3;
        MediaController.d0(str5, this.z2, 3, str2, str4, new a10(this, (byte) 1));
    }

    public final void L0(k27 k27Var, boolean z, Runnable runnable, boolean z2) {
        TLRPC.Document F0 = k27Var.F0();
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_account_saveMusic, new e10(this, z2, k27Var, z, runnable, j, F0));
    }

    public final boolean M0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i20.M0(boolean):boolean");
    }

    public final void N0(a8 a8Var, boolean z) {
        if (z) {
            int i = bkb.Nj;
            a8Var.setTextColor(bkb.v0(i, this.J0));
            a8Var.setIconColor(bkb.v0(i, this.J0));
            return;
        }
        int i2 = bkb.D8;
        a8Var.setTextColor(bkb.v0(i2, this.J0));
        a8Var.setIconColor(bkb.v0(i2, this.J0));
    }

    public final void O0(final boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        boolean I0 = I0();
        u41 u41Var = this.z1;
        u41 u41Var2 = this.y1;
        if (!I0 && !this.s2) {
            u41Var2.setVisibility(0);
            u41Var.setVisibility(0);
            ViewPropertyAnimator animate = u41Var2.animate();
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
            s33 s33Var = s33.h;
            duration.setInterpolator(s33Var).withEndAction(new Runnable(this) {
                public final i20 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    int i = 8;
                    boolean z2 = z;
                    i20 i20Var = this.b;
                    switch (b) {
                        case 0:
                            u41 u41Var3 = i20Var.y1;
                            if (!z2) {
                                i = 0;
                            }
                            u41Var3.setVisibility(i);
                            return;
                        default:
                            u41 u41Var4 = i20Var.z1;
                            if (z2) {
                                i = 0;
                            }
                            u41Var4.setVisibility(i);
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = u41Var.animate();
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
            scaleX2.scaleY(f6).setDuration(420L).setInterpolator(s33Var).withEndAction(new Runnable(this) {
                public final i20 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    int i = 8;
                    boolean z2 = z;
                    i20 i20Var = this.b;
                    switch (b) {
                        case 0:
                            u41 u41Var3 = i20Var.y1;
                            if (!z2) {
                                i = 0;
                            }
                            u41Var3.setVisibility(i);
                            return;
                        default:
                            u41 u41Var4 = i20Var.z1;
                            if (z2) {
                                i = 0;
                            }
                            u41Var4.setVisibility(i);
                            return;
                    }
                }
            }).start();
            return;
        }
        u41Var2.setVisibility(8);
        u41Var.setVisibility(8);
    }

    public final void P0(defpackage.k27 r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i20.P0(k27):void");
    }

    @Override
    public final int Q() {
        k10 k10Var = this.x1;
        if (k10Var == null) {
            return 0;
        }
        if (this.q2.size() <= 1) {
            return k10Var.getMeasuredHeight() + this.t0;
        }
        int L = gl.L(13.0f);
        int translationY = (int) (this.r1.getTranslationY() + ((this.t2 - this.t0) - L));
        if (this.t0 + translationY < a.getCurrentActionBarHeight()) {
            float L2 = gl.L(4.0f) + L;
            translationY -= (int) ((a.getCurrentActionBarHeight() - L2) * Math.min(1.0f, ((a.getCurrentActionBarHeight() - translationY) - this.t0) / L2));
        }
        return this.c.getMeasuredHeight() - (translationY + gl.m);
    }

    public final void Q0(boolean z, boolean z2) {
        be0 be0Var = this.c2;
        k10 k10Var = this.b2;
        if (z) {
            if (k10Var.getVisibility() != 0 && !this.f2) {
                k10Var.setTag(1);
                y10 y10Var = this.B1;
                be0Var.setImageBitmap(y10Var.a[y10Var.b ? 1 : 0].getImageReceiver().n());
                this.f2 = true;
                tq9.d(new v00(this, (byte) 1));
                k10Var.setVisibility(0);
                k10Var.animate().alpha(1.0f).setDuration(180L).setListener(new u10(this, (byte) 0)).start();
                be0Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            }
        } else if (k10Var.getVisibility() != 0) {
        } else {
            k10Var.setTag(null);
            if (z2) {
                this.f2 = true;
                k10Var.animate().alpha(0.0f).setDuration(180L).setListener(new u10(this, (byte) 1)).start();
                be0Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
                return;
            }
            k10Var.setAlpha(0.0f);
            k10Var.setVisibility(4);
            be0Var.setImageBitmap(null);
            be0Var.setScaleX(0.9f);
            be0Var.setScaleY(0.9f);
        }
    }

    public final void R0(j20 j20Var, k27 k27Var) {
        cs5 H = cs5.H(this.c, this.J0, j20Var, true);
        int i = 3;
        boolean z = false;
        if (I0()) {
            H.k(2131232170, k96.M0(2131750570, null), new b10(this, H, k27Var, (byte) 0), !this.s2);
            H.k(2131232370, k96.M0(2131745267, null), new b10(this, H, k27Var, (byte) 1), !this.s2);
            H.b(2131232113, k96.M0(2131751586, null), new b10(this, k27Var, H, (byte) 2), true);
        } else {
            H.k(2131232395, k96.M0(2131753913, null), new c10(H, D0(H, k27Var), (byte) 0), !this.s2);
            if (!this.s2 && H.z() != null) {
                H.z().setRightIcon(2131232064);
            }
            H.j();
            H.k(2131232170, k96.M0(2131750570, null), new b10(this, H, k27Var, (byte) 3), !this.s2);
            H.k(2131232368, k96.M0(2131745267, null), new b10(this, H, k27Var, (byte) 4), !this.s2);
            if (k27Var.e1() > 0) {
                z = true;
            }
            H.k(2131232425, k96.M0(2131745150, null), new y00(this, k27Var, (byte) 1), z);
        }
        if (!k96.a0) {
            i = 5;
        }
        H.W(i);
        H.a0();
    }

    @Override
    public final ArrayList S() {
        ArrayList arrayList = new ArrayList();
        t00 t00Var = new t00(this, (byte) 0);
        int i = bkb.Ej;
        arrayList.add(new blb(this.m1, 1024, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        int i2 = bkb.Ij;
        arrayList.add(new blb(this.m1, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.b, 0, (Class[]) null, (Paint) null, new Drawable[]{this.s0}, (alb) null, bkb.g5));
        arrayList.add(new blb(this.L1, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Lj));
        int i3 = bkb.v7;
        r7 r7Var = this.O1;
        arrayList.add(new blb(r7Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i3));
        arrayList.add(new blb(r7Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.w7));
        int i4 = bkb.Mj;
        r7 r7Var2 = this.U1;
        arrayList.add(new blb(r7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, i4));
        arrayList.add(new blb(r7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, bkb.Nj));
        int i5 = bkb.D8;
        arrayList.add(new blb(r7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, i5));
        int i6 = bkb.F8;
        arrayList.add(new blb(r7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, i6));
        r7 r7Var3 = this.G1;
        arrayList.add(new blb(r7Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, i4));
        arrayList.add(new blb(r7Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, i5));
        arrayList.add(new blb(r7Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, i6));
        m10 m10Var = this.D1;
        arrayList.add(new blb(m10Var, new oy8[]{m10Var.getAnimatedDrawable()}, "Triangle 3", i4));
        arrayList.add(new blb(m10Var, new oy8[]{m10Var.getAnimatedDrawable()}, "Triangle 4", i4));
        arrayList.add(new blb(m10Var, new oy8[]{m10Var.getAnimatedDrawable()}, "Rectangle 4", i4));
        int i7 = bkb.h6;
        arrayList.add(new blb(this.D1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i7));
        arrayList.add(new blb(this.Z1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i7));
        n10 n10Var = this.E1;
        arrayList.add(new blb(n10Var, new oy8[]{n10Var.getAnimatedDrawable()}, "Triangle 3", i4));
        arrayList.add(new blb(n10Var, new oy8[]{n10Var.getAnimatedDrawable()}, "Triangle 4", i4));
        arrayList.add(new blb(n10Var, new oy8[]{n10Var.getAnimatedDrawable()}, "Rectangle 4", i4));
        arrayList.add(new blb(this.E1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i7));
        int i8 = bkb.W5;
        arrayList.add(new blb(this.v1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i8));
        arrayList.add(new blb(this.w1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i8));
        arrayList.add(new blb(this.L1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.b7));
        arrayList.add(new blb(this.L1, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g6));
        z10 z10Var = this.C1;
        arrayList.add(new blb(z10Var.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(z10Var.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        z10 z10Var2 = this.F1;
        arrayList.add(new blb(z10Var2.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(z10Var2.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.yj));
        return arrayList;
    }

    public final void S0() {
        if (this.A2 == 1) {
            this.D2 = System.currentTimeMillis();
            this.B2 = MediaController.w().v0.b0;
            o1 o1Var = this.H2;
            gl.r(o1Var);
            gl.c3(o1Var);
        }
    }

    public final void T0() {
        int i;
        LinearLayout linearLayout = this.u1;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        if (this.x1.getVisibility() == 0) {
            i = gl.L(150.0f);
        } else {
            i = -gl.L(30.0f);
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.b.getMeasuredHeight()) - i) / 2);
    }

    @Override
    public final boolean U(float f, float f2) {
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

    public final void U0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i20.U0():void");
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
                        int i2 = bkb.Gi;
                        a8Var.d(bkb.v0(i2, this.J0), bkb.v0(i2, this.J0));
                    } else {
                        a8 a8Var2 = a8VarArr[i];
                        int i3 = bkb.D8;
                        a8Var2.d(bkb.v0(i3, this.J0), bkb.v0(i3, this.J0));
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void W0(defpackage.k27 r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i20.W0(k27, boolean):void");
    }

    public final void X0() {
        int i = gba.O0;
        r7 r7Var = this.U1;
        if (i != 0 && i != 1) {
            if (i == 2) {
                r7Var.setIcon(2131232561);
                int i2 = bkb.Nj;
                r7Var.setTag(Integer.valueOf(i2));
                r7Var.setIconColor(bkb.v0(i2, this.J0));
                bkb.F1(r7Var.getBackground(), bkb.v0(i2, this.J0) & 436207615, true);
                r7Var.setContentDescription(k96.M0(2131754784, null));
                return;
            }
            return;
        }
        if (gba.J0) {
            if (i == 0) {
                r7Var.setIcon(2131232562);
            } else {
                r7Var.setIcon(2131232559);
            }
        } else if (gba.K0) {
            if (i == 0) {
                r7Var.setIcon(2131232556);
            } else {
                r7Var.setIcon(2131232558);
            }
        } else {
            r7Var.setIcon(2131232560);
        }
        if (i == 0 && !gba.J0 && !gba.K0) {
            int i3 = bkb.Mj;
            r7Var.setTag(Integer.valueOf(i3));
            r7Var.setIconColor(bkb.v0(i3, this.J0));
            bkb.F1(r7Var.getBackground(), bkb.v0(bkb.h6, this.J0), true);
            r7Var.setContentDescription(k96.M0(2131754785, null));
            return;
        }
        int i4 = bkb.Nj;
        r7Var.setTag(Integer.valueOf(i4));
        r7Var.setIconColor(bkb.v0(i4, this.J0));
        bkb.F1(r7Var.getBackground(), bkb.v0(i4, this.J0) & 436207615, true);
        if (i == 0) {
            if (gba.J0) {
                r7Var.setContentDescription(k96.M0(2131745130, null));
                return;
            } else {
                r7Var.setContentDescription(k96.M0(2131745834, null));
                return;
            }
        }
        r7Var.setContentDescription(k96.M0(2131754786, null));
    }

    public final void Y0() {
        boolean z;
        N0(this.X1, gba.J0);
        N0(this.Y1, gba.K0);
        boolean z2 = false;
        if (gba.O0 == 1) {
            z = true;
        } else {
            z = false;
        }
        N0(this.W1, z);
        if (gba.O0 == 2) {
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
            i = bkb.Z6;
        } else {
            i = bkb.g5;
        }
        int v02 = bkb.v0(i, this.J0);
        if (v02 != this.N2) {
            this.N2 = v02;
            s0(v02);
        }
        int v03 = bkb.v0(bkb.Mj, this.J0);
        m10 m10Var = this.D1;
        if (m10Var != null) {
            m10Var.h(v03, "Triangle 3");
            m10Var.h(v03, "Triangle 4");
            m10Var.h(v03, "Rectangle 4");
        }
        n10 n10Var = this.E1;
        if (n10Var != null) {
            n10Var.h(v03, "Triangle 3");
            n10Var.h(v03, "Triangle 4");
            n10Var.h(v03, "Rectangle 4");
        }
        a20 a20Var = this.M1;
        if (a20Var != null) {
            a20Var.setOuterColor(bkb.v0(bkb.Lj, this.J0));
        }
        boolean z = false;
        r7 r7Var = this.O1;
        if (r7Var != null) {
            float f = MediaController.w().r0;
            if (!F0(f, 1.0f)) {
                i2 = bkb.Gi;
            } else {
                i2 = bkb.w7;
            }
            int v04 = bkb.v0(i2, this.J0);
            cla claVar = this.P1;
            if (claVar != null) {
                claVar.a.u(v04);
                Paint paint = claVar.b;
                if (paint != null) {
                    paint.setColor(v04);
                }
            }
            bkb.F1(r7Var.getBackground(), v04 & 436207615, true);
            int i4 = 0;
            while (true) {
                a8[] a8VarArr = this.S1;
                if (i4 >= a8VarArr.length) {
                    break;
                }
                if (a8VarArr[i4] != null) {
                    if (F0(f, T2[i4])) {
                        i3 = bkb.Gi;
                    } else {
                        i3 = bkb.D8;
                    }
                    int v05 = bkb.v0(i3, this.J0);
                    a8VarArr[i4].d(v05, v05);
                }
                i4++;
            }
        }
        a8 a8Var = this.I1;
        if (a8Var != null) {
            o10 o10Var = this.J1;
            if (o10Var != null && o10Var.b()) {
                z = true;
            }
            int v06 = bkb.v0(bkb.D8, this.J0);
            int v07 = bkb.v0(bkb.E8, this.J0);
            int i5 = bkb.Ei;
            a8Var.e(v06, v07, bkb.v0(i5, this.J0), z);
            a8 a8Var2 = this.I1;
            if (o10Var != null && o10Var.b()) {
                v0 = bkb.p1(0.1f, bkb.v0(i5, this.J0));
            } else {
                v0 = bkb.v0(bkb.h6, this.J0);
            }
            a8Var2.setSelectorColor(v0);
        }
    }

    public final void a1(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i20.a1(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean z;
        j20 j20Var;
        k27 messageObject;
        j20 j20Var2;
        k27 messageObject2;
        k27 k27Var;
        int i3 = kk7.g2;
        int i4 = kk7.e2;
        int i5 = kk7.f2;
        p10 p10Var = this.r1;
        int i6 = 0;
        if (i != i3 && i != i5 && i != i4) {
            if (i == kk7.d2) {
                k27 k27Var2 = MediaController.w().v0;
                if (k27Var2 != null && k27Var2.I3()) {
                    W0(k27Var2, false);
                    return;
                }
                return;
            } else if (i == kk7.L4) {
                V0(true);
                return;
            } else {
                int i7 = kk7.J0;
                h20 h20Var = this.t1;
                if (i == i7) {
                    this.p2 = MediaController.w().R0;
                    this.q2 = MediaController.w().S0;
                    h20Var.f();
                    return;
                } else if (i == kk7.K0) {
                    this.p2 = MediaController.w().R0;
                    this.q2 = MediaController.w().S0;
                    h20Var.f();
                    if (gba.K0) {
                        p10Var.D0();
                        int intValue = ((Integer) objArr[0]).intValue();
                        t26 t26Var = this.s1;
                        t26Var.K0();
                        int M0 = t26Var.M0();
                        if (M0 != -1) {
                            View m = t26Var.m(M0);
                            if (m != null) {
                                i6 = m.getTop();
                            }
                            t26Var.g1(M0 + intValue, i6);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == kk7.X1) {
                    if (((String) objArr[0]).equals(this.u2)) {
                        a1(false);
                        this.j2 = true;
                        return;
                    }
                    return;
                } else if (i == kk7.W1) {
                    if (((String) objArr[0]).equals(this.u2) && (k27Var = MediaController.w().v0) != null) {
                        Long l = (Long) objArr[1];
                        Long l2 = (Long) objArr[2];
                        float f = 1.0f;
                        if (!this.j2) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.i2) >= 500) {
                                if (MediaController.w().m0) {
                                    f = ba4.G(this.a).t(this.u2, k27Var.b0);
                                }
                                this.i2 = elapsedRealtime;
                            } else {
                                f = -1.0f;
                            }
                        }
                        if (f != -1.0f) {
                            yla ylaVar = this.h2;
                            ylaVar.m.i = f * 1000.0f;
                            ylaVar.h();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == kk7.W3) {
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
            if (((k27) objArr[0]).T == 0) {
                int childCount = p10Var.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = p10Var.getChildAt(i8);
                    if ((childAt instanceof j20) && (messageObject2 = (j20Var2 = (j20) childAt).getMessageObject()) != null && (k27.Q4(messageObject2.k) || messageObject2.I3())) {
                        j20Var2.b(false, true);
                    }
                }
            } else {
                return;
            }
        } else {
            int childCount2 = p10Var.getChildCount();
            for (int i9 = 0; i9 < childCount2; i9++) {
                View childAt2 = p10Var.getChildAt(i9);
                if ((childAt2 instanceof j20) && (messageObject = (j20Var = (j20) childAt2).getMessageObject()) != null && (k27.Q4(messageObject.k) || messageObject.I3())) {
                    j20Var.b(false, true);
                }
            }
            if (i == i5 && MediaController.w().v0 != null) {
                if (MediaController.w().C()) {
                    S0();
                } else if (this.A2 == 1 && this.B2 != -1.0f) {
                    o1 o1Var = this.H2;
                    gl.r(o1Var);
                    this.E2 = 0L;
                    o1Var.run();
                    this.B2 = -1.0f;
                }
            }
        }
        mg2 mg2Var = this.H1;
        if (mg2Var != null) {
            mg2Var.a(fo.w());
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        kk7.f(this.a).n(this, kk7.e2);
        kk7.f(this.a).n(this, kk7.f2);
        kk7.f(this.a).n(this, kk7.g2);
        kk7.f(this.a).n(this, kk7.d2);
        kk7.f(this.a).n(this, kk7.X1);
        kk7.f(this.a).n(this, kk7.W1);
        kk7.f(this.a).n(this, kk7.J0);
        kk7.f(this.a).n(this, kk7.K0);
        kk7.f(this.a).n(this, kk7.W3);
        kk7.e().n(this, kk7.L4);
        up3.q(this.a).v(this);
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
        k10 k10Var = this.b2;
        if (view != k10Var) {
            return false;
        }
        k10Var.layout(0, 0, k10Var.getMeasuredWidth(), k10Var.getMeasuredHeight());
        return true;
    }

    @Override
    public final void i(long j, long j2) {
        this.L1.a(true, Math.min(1.0f, ((float) j) / ((float) j2)));
    }

    @Override
    public final boolean i0(View view, int i, int i2) {
        k10 k10Var = this.b2;
        if (view == k10Var) {
            ww0 ww0Var = this.c;
            k10Var.measure(View.MeasureSpec.makeMeasureSpec(ww0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ww0Var.getMeasuredHeight(), 1073741824));
            return true;
        }
        return false;
    }

    @Override
    public final void onBackPressed() {
        x10 x10Var = this.m1;
        if (x10Var != null && x10Var.o0) {
            x10Var.n(true);
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
            fa4.g(e, true);
        }
        try {
            Z0();
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        try {
            float f = this.G2;
            if (f >= 0.0f) {
                if (f <= 0.5f && bm2.h(bkb.v0(bkb.g5, this.J0)) > 0.699999988079071d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != this.F2) {
                    this.F2 = z;
                    gl.l3(this, z);
                }
            }
        } catch (Exception e3) {
            fa4.g(e3, true);
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
                i = bkb.Gi;
            } else {
                i = bkb.w7;
            }
            int v02 = bkb.v0(i, this.J0);
            cla claVar = this.P1;
            if (claVar != null) {
                claVar.a.u(v02);
                Paint paint = claVar.b;
                if (paint != null) {
                    paint.setColor(v02);
                }
            }
            r7Var.setBackground(bkb.f0(v02 & 436207615, 1, gl.L(14.0f)));
        }
        a8 a8Var = this.I1;
        if (a8Var != null) {
            o10 o10Var = this.J1;
            z = (o10Var == null || !o10Var.b()) ? false : false;
            int v03 = bkb.v0(bkb.D8, this.J0);
            int v04 = bkb.v0(bkb.E8, this.J0);
            int i2 = bkb.Ei;
            a8Var.e(v03, v04, bkb.v0(i2, this.J0), z);
            a8 a8Var2 = this.I1;
            if (o10Var != null && o10Var.b()) {
                v0 = bkb.p1(0.1f, bkb.v0(i2, this.J0));
            } else {
                v0 = bkb.v0(bkb.h6, this.J0);
            }
            a8Var2.setSelectorColor(v0);
        }
    }

    @Override
    public final void B(boolean z) {
    }

    @Override
    public final void N(String str) {
    }

    @Override
    public final void l(long j, long j2) {
    }
}
