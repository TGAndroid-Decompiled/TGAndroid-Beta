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
public final class j20 extends nx0 implements fn7, jq3 {
    public static j20 S2;
    public static final float[] T2 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final lu5 A1;
    public int A2;
    public final z10 B1;
    public float B2;
    public final a20 C1;
    public int C2;
    public final n10 D1;
    public long D2;
    public final o10 E1;
    public long E2;
    public final a20 F1;
    public boolean F2;
    public final s7 G1;
    public float G2;
    public final eh2 H1;
    public final p1 H2;
    public b8 I1;
    public u10 I2;
    public final p10 J1;
    public long J2;
    public final boolean K1;
    public float K2;
    public final n46 L1;
    public final w10 L2;
    public final b20 M1;
    public ValueAnimator M2;
    public final ema N1;
    public int N2;
    public final s7 O1;
    public boolean O2;
    public final zoa P1;
    public int P2;
    public final w7 Q1;
    public int Q2;
    public boolean R1;
    public int R2;
    public final b8[] S1;
    public final TextView T1;
    public final s7 U1;
    public final b8 V1;
    public final b8 W1;
    public final b8 X1;
    public final b8 Y1;
    public final ImageView Z1;
    public final mf8 a2;
    public final l10 b2;
    public final de0 c2;
    public final s7 d2;
    public final s7 e2;
    public boolean f2;
    public final View[] g2;
    public final vpa h2;
    public long i2;
    public boolean j2;
    public boolean k2;
    public final View l1;
    public int l2;
    public final y10 m1;
    public int m2;
    public final View n1;
    public final boolean n2;
    public final View o1;
    public final boolean o2;
    public boolean p1;
    public pc7 p2;
    public boolean q1;
    public ArrayList q2;
    public final q10 r1;
    public r47 r2;
    public final x46 s1;
    public boolean s2;
    public final i20 t1;
    public int t2;
    public final LinearLayout u1;
    public String u2;
    public final TextView v1;
    public AnimatorSet v2;
    public final TextView w1;
    public int w2;
    public final l10 x1;
    public int x2;
    public final c51 y1;
    public final int y2;
    public final c51 z1;
    public final LaunchActivity z2;

    public j20(Activity activity, final vnb vnbVar) {
        super(1, vnbVar, (Context) activity, true);
        int i;
        boolean z;
        s6 s6Var;
        boolean z2;
        TLRPC.User X1;
        int i2;
        int i3;
        b8[] b8VarArr = new b8[6];
        this.S1 = b8VarArr;
        View[] viewArr = new View[5];
        this.g2 = viewArr;
        this.k2 = true;
        this.l2 = -1;
        this.t2 = Integer.MAX_VALUE;
        this.B2 = -1.0f;
        this.G2 = -1.0f;
        this.H2 = new p1(this, (byte) 4);
        this.L2 = new w10(this);
        this.r = true;
        J();
        r47 r47Var = MediaController.z().v0;
        if (r47Var != null) {
            i = r47Var.K1;
            this.a = i;
        } else {
            i = yac.t0;
            this.a = i;
        }
        this.z2 = (LaunchActivity) activity;
        this.y2 = lq3.q(i).k();
        jn7.f(this.a).b(this, jn7.f2);
        jn7.f(this.a).b(this, jn7.g2);
        jn7.f(this.a).b(this, jn7.h2);
        jn7.f(this.a).b(this, jn7.e2);
        jn7.f(this.a).b(this, jn7.Y1);
        jn7.f(this.a).b(this, jn7.X1);
        jn7.f(this.a).b(this, jn7.K0);
        jn7.f(this.a).b(this, jn7.L0);
        jn7.f(this.a).b(this, jn7.X3);
        jn7.e().b(this, jn7.M4);
        x10 x10Var = new x10(this, activity);
        this.b = x10Var;
        x10Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i4 = this.u0;
        viewGroup.setPadding(i4, 0, i4, 0);
        y10 y10Var = new y10(this, activity, vnbVar, (byte) 0);
        this.m1 = y10Var;
        y10Var.setBackgroundColor(0);
        y10Var.setBackButtonImage(2131231243);
        int i5 = aob.Fj;
        yob.l(y10Var, 1, i5, vnbVar);
        yob.l(y10Var, 3, aob.Ej, vnbVar);
        yob.l(y10Var, 5, i5, vnbVar);
        yob.l(y10Var, 6, aob.Gj, vnbVar);
        y10Var.setOccupyStatusBar(true);
        s6 u = y10Var.u();
        u.setLayoutParams(tre.e(-1, -1, 119));
        View view = new View(activity);
        this.l1 = view;
        yob.h(aob.h5, vnbVar, view);
        y10Var.addView(view, 0, tre.e(-1, -1, 119));
        view.setAlpha(0.0f);
        y10Var.setAlpha(0.0f);
        y10Var.setActionBarMenuOnItemClick(new s8(this, (byte) 3));
        View view2 = new View(activity);
        this.n1 = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(2131231240);
        View view3 = new View(activity);
        this.o1 = view3;
        yob.h(aob.V5, vnbVar, view3);
        l10 l10Var = new l10(this, activity, (byte) 2);
        this.x1 = l10Var;
        z10 z10Var = new z10(this, activity);
        this.B1 = z10Var;
        l10Var.addView(z10Var, tre.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        a20 a20Var = new a20(this, activity, activity, (byte) 0);
        this.C1 = a20Var;
        l10Var.addView(a20Var, tre.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        a20 a20Var2 = new a20(this, activity, activity, (byte) 1);
        this.F1 = a20Var2;
        l10Var.addView(a20Var2, tre.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        b20 b20Var = new b20(this, activity, vnbVar);
        this.M1 = b20Var;
        b20Var.setLineWidth(4);
        b20Var.setDelegate(new zm9(this, (byte) 7));
        b20Var.setReportChanges(true);
        l10Var.addView(b20Var, tre.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        vpa vpaVar = new vpa(new xk4(0.0f));
        wpa wpaVar = new wpa();
        wpaVar.b(750.0f);
        wpaVar.a(1.0f);
        vpaVar.m = wpaVar;
        vpaVar.b(new i10(this, (byte) 0));
        this.h2 = vpaVar;
        n46 n46Var = new n46(activity);
        this.L1 = n46Var;
        n46Var.setVisibility(4);
        yob.h(aob.Kj, vnbVar, n46Var);
        n46Var.setProgressColor(aob.v0(aob.Mj, this.J0));
        l10Var.addView(n46Var, tre.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        ema emaVar = new ema(activity);
        this.N1 = emaVar;
        emaVar.setTextSize(12);
        emaVar.l("0:00", false);
        int i6 = aob.Jj;
        yob.W(emaVar, i6, vnbVar);
        emaVar.setImportantForAccessibility(2);
        l10Var.addView(emaVar, tre.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.T1 = textView;
        textView.setTextSize(1, 12.0f);
        yob.X(textView, i6, vnbVar);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        l10Var.addView(textView, tre.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        s7 s7Var = new s7(activity, null, 0, aob.v0(i6, this.J0), false, vnbVar);
        this.O1 = s7Var;
        s7Var.setLongClickEnabled(false);
        s7Var.setShowSubmenuByMove(false);
        s7Var.setAdditionalYOffset(-hl.L(224.0f));
        s7Var.setContentDescription(ob6.M0(2131754800, null));
        s7Var.setDelegate(new v00(this, (byte) 0));
        zoa zoaVar = new zoa();
        this.P1 = zoaVar;
        s7Var.setIcon(zoaVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        w7 w7Var = new w7(getContext(), vnbVar);
        this.Q1 = w7Var;
        w7Var.setRoundRadiusDp(6.0f);
        w7Var.setDrawShadow(true);
        w7Var.setOnValueChange(new w00(this, (byte) 0));
        b8VarArr[0] = s7Var.e(0, 2131232378, ob6.M0(2131744923, null));
        b8VarArr[1] = s7Var.e(1, 2131232377, ob6.M0(2131744924, null));
        b8VarArr[2] = s7Var.e(2, 2131232376, ob6.M0(2131744925, null));
        b8VarArr[3] = s7Var.e(3, 2131232375, ob6.M0(2131744927, null));
        b8VarArr[4] = s7Var.e(4, 2131232380, ob6.M0(2131744921, null));
        b8VarArr[5] = s7Var.e(5, 2131232379, ob6.M0(2131744922, null));
        if (hl.p >= 3.0f) {
            s7Var.setPadding(0, 1, 0, 0);
        }
        s7Var.setAdditionalXOffset(hl.L(8.0f));
        s7Var.setAdditionalYOffset(-hl.L(400.0f));
        s7Var.setShowedFromBottom(true);
        l10Var.addView(s7Var, tre.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        s7Var.setOnClickListener(new t(this, fArr, (byte) 19));
        s7Var.setOnLongClickListener(new v0(this, vnbVar, (byte) 1));
        W0(false);
        l10 l10Var2 = new l10(this, activity, (byte) 0);
        l10Var.addView(l10Var2, tre.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        s7 s7Var2 = new s7(activity, null, 0, 0, false, vnbVar);
        this.U1 = s7Var2;
        viewArr[0] = s7Var2;
        s7Var2.setLongClickEnabled(false);
        s7Var2.setShowSubmenuByMove(false);
        s7Var2.setAdditionalYOffset(-hl.L(166.0f));
        int i7 = aob.i6;
        hf0 f0 = aob.f0(aob.v0(i7, this.J0), 1, hl.L(18.0f));
        uob M = yob.M(i7);
        s7Var2.setBackground(f0);
        yob.j(s7Var2, f0, null, M, vnbVar);
        l10Var2.addView(s7Var2, tre.e(48, 48, 51));
        s7Var2.setOnClickListener(new View.OnClickListener(this) {
            public final j20 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view4) {
                byte b = r2;
                j20 j20Var = this.b;
                switch (b) {
                    case 0:
                        j20Var.Z0();
                        j20Var.U1.U(null, null);
                        return;
                    default:
                        p10 p10Var = j20Var.J1;
                        r47 r47Var2 = MediaController.z().v0;
                        if (r47Var2 != null) {
                            boolean z3 = true;
                            fu5 H = fu5.H(j20Var.c, j20Var.J0, view4, true);
                            fu5 E0 = j20Var.E0(H, r47Var2);
                            if (!j20Var.J0()) {
                                H.k(2131232395, ob6.M0(2131753909, null), new c10(H, E0, (byte) 0), !j20Var.s2);
                                if (!j20Var.s2 && H.z() != null) {
                                    H.z().setRightIcon(2131232064);
                                }
                                H.j();
                            }
                            H.k(2131232170, ob6.M0(2131750547, null), new d10(j20Var, H, (byte) 0), !j20Var.s2);
                            H.k(2131232370, ob6.M0(2131745187, null), new d10(j20Var, H, (byte) 1), !j20Var.s2);
                            if (r47Var2.e1() <= 0) {
                                z3 = false;
                            }
                            H.k(2131232229, ob6.M0(2131745070, null), new d10(j20Var, H, (byte) 2), z3);
                            if (j20Var.K1) {
                                b8 b8Var = new b8(0, H.d, H.e, false, false);
                                H.c(b8Var);
                                j20Var.I1 = b8Var;
                                b8Var.j(ob6.M0(2131743244, null), 2131231916, null);
                                j20Var.I1.setOnClickListener(new t(j20Var, H, (byte) 20));
                                hl.B2(p10Var);
                                j20Var.I1.addView(p10Var, 0, tre.c(-1.0f, -1));
                                j20Var.updateColors();
                            }
                            H.l(2131232113, new d10(j20Var, H, (byte) 3), ob6.M0(2131746372, null), j20Var.J0(), true);
                            H.Y(hl.L(64.0f));
                            H.a0();
                            return;
                        }
                        return;
                }
            }
        });
        this.V1 = s7Var2.e(3, 2131232572, ob6.M0(2131746000, null));
        this.W1 = s7Var2.e(4, 2131232571, ob6.M0(2131746003, null));
        s7Var2.a(-1).getLayoutParams().height = hl.L(4.0f);
        this.X1 = s7Var2.e(2, 2131232573, ob6.M0(2131745050, null));
        s7Var2.a(-1).getLayoutParams().height = hl.L(4.0f);
        this.Y1 = s7Var2.e(1, 2131232567, ob6.M0(2131745754, null));
        s7Var2.setShowedFromBottom(true);
        s7Var2.setDelegate(new v00(this, (byte) 1));
        int i8 = aob.Nj;
        int v0 = aob.v0(i8, this.J0);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        n10 n10Var = new n10(this, activity, scaledTouchSlop);
        this.D1 = n10Var;
        viewArr[1] = n10Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        n10Var.setScaleType(scaleType);
        n10Var.f(2131624137, 20, 20, null);
        n10Var.h(v0, "Triangle 3");
        n10Var.h(v0, "Triangle 4");
        n10Var.h(v0, "Rectangle 4");
        hf0 f02 = aob.f0(aob.v0(i7, this.J0), 1, hl.L(22.0f));
        uob M2 = yob.M(i7);
        n10Var.setBackground(f02);
        yob.j(n10Var, f02, null, M2, vnbVar);
        l10Var2.addView(n10Var, tre.e(48, 48, 51));
        n10Var.setContentDescription(ob6.M0(2131754795, null));
        ImageView imageView = new ImageView(activity);
        this.Z1 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        mf8 mf8Var = new mf8(28);
        this.a2 = mf8Var;
        imageView.setImageDrawable(mf8Var);
        mf8Var.a(!MediaController.z().G(), false);
        yob.s(imageView, i8, vnbVar, PorterDuff.Mode.MULTIPLY);
        hf0 f03 = aob.f0(aob.v0(i7, this.J0), 1, hl.L(24.0f));
        uob M3 = yob.M(i7);
        imageView.setBackground(f03);
        yob.j(imageView, f03, null, M3, vnbVar);
        l10Var2.addView(imageView, tre.e(48, 48, 51));
        imageView.setOnClickListener(new y00((byte) 0));
        o10 o10Var = new o10(this, activity, scaledTouchSlop);
        this.E1 = o10Var;
        viewArr[3] = o10Var;
        o10Var.setScaleType(scaleType);
        o10Var.f(2131624137, 20, 20, null);
        o10Var.h(v0, "Triangle 3");
        o10Var.h(v0, "Triangle 4");
        o10Var.h(v0, "Rectangle 4");
        o10Var.setRotation(180.0f);
        hf0 f04 = aob.f0(aob.v0(i7, this.J0), 1, hl.L(22.0f));
        uob M4 = yob.M(i7);
        o10Var.setBackground(f04);
        yob.j(o10Var, f04, null, M4, vnbVar);
        l10Var2.addView(o10Var, tre.e(48, 48, 51));
        o10Var.setContentDescription(ob6.M0(2131747981, null));
        s7 s7Var3 = new s7(activity, null, 0, v0, false, vnbVar);
        this.G1 = s7Var3;
        viewArr[4] = s7Var3;
        eh2 eh2Var = new eh2(activity, 2131231247, vnbVar);
        this.H1 = eh2Var;
        s7Var3.setIcon(eh2Var);
        s7Var3.setLongClickEnabled(false);
        s7Var3.setAdditionalYOffset(-hl.L(197.0f));
        hf0 f05 = aob.f0(aob.v0(i7, this.J0), 1, hl.L(18.0f));
        uob M5 = yob.M(i7);
        s7Var3.setBackground(f05);
        yob.j(s7Var3, f05, null, M5, vnbVar);
        s7Var3.setOnClickListener(new View.OnClickListener(this) {
            public final j20 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view4) {
                byte b = r2;
                j20 j20Var = this.b;
                switch (b) {
                    case 0:
                        j20Var.Z0();
                        j20Var.U1.U(null, null);
                        return;
                    default:
                        p10 p10Var = j20Var.J1;
                        r47 r47Var2 = MediaController.z().v0;
                        if (r47Var2 != null) {
                            boolean z3 = true;
                            fu5 H = fu5.H(j20Var.c, j20Var.J0, view4, true);
                            fu5 E0 = j20Var.E0(H, r47Var2);
                            if (!j20Var.J0()) {
                                H.k(2131232395, ob6.M0(2131753909, null), new c10(H, E0, (byte) 0), !j20Var.s2);
                                if (!j20Var.s2 && H.z() != null) {
                                    H.z().setRightIcon(2131232064);
                                }
                                H.j();
                            }
                            H.k(2131232170, ob6.M0(2131750547, null), new d10(j20Var, H, (byte) 0), !j20Var.s2);
                            H.k(2131232370, ob6.M0(2131745187, null), new d10(j20Var, H, (byte) 1), !j20Var.s2);
                            if (r47Var2.e1() <= 0) {
                                z3 = false;
                            }
                            H.k(2131232229, ob6.M0(2131745070, null), new d10(j20Var, H, (byte) 2), z3);
                            if (j20Var.K1) {
                                b8 b8Var = new b8(0, H.d, H.e, false, false);
                                H.c(b8Var);
                                j20Var.I1 = b8Var;
                                b8Var.j(ob6.M0(2131743244, null), 2131231916, null);
                                j20Var.I1.setOnClickListener(new t(j20Var, H, (byte) 20));
                                hl.B2(p10Var);
                                j20Var.I1.addView(p10Var, 0, tre.c(-1.0f, -1));
                                j20Var.updateColors();
                            }
                            H.l(2131232113, new d10(j20Var, H, (byte) 3), ob6.M0(2131746372, null), j20Var.J0(), true);
                            H.Y(hl.L(64.0f));
                            H.a0();
                            return;
                        }
                        return;
                }
            }
        });
        l10Var2.addView(s7Var3, tre.e(48, 48, 51));
        p10 p10Var = new p10(this, activity, (byte) 0);
        this.J1 = p10Var;
        this.K1 = true;
        try {
            p10Var.setRouteSelector(id1.c(activity).a());
        } catch (Exception e) {
            cc4.g(e, true);
            this.K1 = false;
        }
        this.J1.setVisibility(4);
        eh2 eh2Var2 = this.H1;
        if (eh2Var2 != null) {
            eh2Var2.a(go.w());
        }
        this.G1.setShowedFromBottom(true);
        this.G1.setDelegate(new v00(this, (byte) 2));
        this.G1.setContentDescription(ob6.M0(2131754834, null));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.u1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i9 = 8;
        linearLayout.setVisibility(8);
        this.b.addView(linearLayout, tre.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new q8((byte) 15));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(2131232446);
        yob.s(imageView2, aob.W5, vnbVar, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, tre.o(-2, -2));
        TextView textView2 = new TextView(activity);
        this.v1 = textView2;
        int i10 = aob.X5;
        yob.X(textView2, i10, vnbVar);
        textView2.setGravity(17);
        textView2.setText(ob6.M0(2131747974, null));
        textView2.setTypeface(hl.o());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(hl.L(40.0f), 0, hl.L(40.0f), 0);
        linearLayout.addView(textView2, tre.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.w1 = textView3;
        yob.X(textView3, i10, vnbVar);
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(hl.L(40.0f), 0, hl.L(40.0f), 0);
        linearLayout.addView(textView3, tre.t(-2, -2, 17, 0, 6, 0, 0));
        q10 q10Var = new q10(this, activity);
        this.r1 = q10Var;
        q10Var.setClipToPadding(false);
        getContext();
        x46 x46Var = new x46(1, false);
        this.s1 = x46Var;
        q10Var.setLayoutManager(x46Var);
        q10Var.setHorizontalScrollBarEnabled(false);
        q10Var.setVerticalScrollBarEnabled(false);
        this.b.addView(q10Var, tre.e(-1, -1, 51));
        i20 i20Var = new i20(this, activity);
        this.t1 = i20Var;
        q10Var.setAdapter(i20Var);
        yob.l(q10Var, 21, aob.A5, vnbVar);
        q10Var.setOnItemClickListener(new m5((byte) 1));
        q10Var.setOnItemLongClickListener(new v00(this, (byte) 3));
        q10Var.setOnScrollListener(new y(this, (byte) 5));
        c51 c51Var = new c51(vnbVar, activity, true);
        c51Var.setRoundRadius(24);
        this.y1 = c51Var;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        spannableStringBuilder.setSpan(new wm2(2131231180, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) ob6.M0(2131753918, null));
        c51Var.setText(spannableStringBuilder);
        c51Var.setOnClickListener(new View.OnClickListener(this) {
            public final j20 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view4) {
                byte b = r3;
                vnb vnbVar2 = vnbVar;
                j20 j20Var = this.b;
                switch (b) {
                    case 0:
                        r47 r47Var2 = MediaController.z().v0;
                        if (r47Var2 != null && j20Var.z2 != null) {
                            j20Var.M0(r47Var2, true, new kc((byte) 10), false);
                            j20Var.P0(true);
                            bs2.v(null, 2131753905, new d31((FrameLayout) j20Var.b, vnbVar2), 2131624185, 36);
                            return;
                        }
                        return;
                    default:
                        r47 r47Var3 = MediaController.z().v0;
                        if (r47Var3 != null && j20Var.z2 != null) {
                            j20Var.M0(r47Var3, false, new kc((byte) 10), false);
                            j20Var.P0(false);
                            bs2.v(null, 2131753904, new d31((FrameLayout) j20Var.b, vnbVar2), 2131624052, 36);
                            return;
                        }
                        return;
                }
            }
        });
        this.x1.addView(c51Var, tre.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        c51 c51Var2 = new c51(vnbVar, activity, true);
        c51Var2.setRoundRadius(24);
        c51Var2.e();
        this.z1 = c51Var2;
        c51Var2.setText(ob6.M0(2131753910, null));
        c51Var2.setOnClickListener(new View.OnClickListener(this) {
            public final j20 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view4) {
                byte b = r3;
                vnb vnbVar2 = vnbVar;
                j20 j20Var = this.b;
                switch (b) {
                    case 0:
                        r47 r47Var2 = MediaController.z().v0;
                        if (r47Var2 != null && j20Var.z2 != null) {
                            j20Var.M0(r47Var2, true, new kc((byte) 10), false);
                            j20Var.P0(true);
                            bs2.v(null, 2131753905, new d31((FrameLayout) j20Var.b, vnbVar2), 2131624185, 36);
                            return;
                        }
                        return;
                    default:
                        r47 r47Var3 = MediaController.z().v0;
                        if (r47Var3 != null && j20Var.z2 != null) {
                            j20Var.M0(r47Var3, false, new kc((byte) 10), false);
                            j20Var.P0(false);
                            bs2.v(null, 2131753904, new d31((FrameLayout) j20Var.b, vnbVar2), 2131624052, 36);
                            return;
                        }
                        return;
                }
            }
        });
        this.x1.addView(c51Var2, tre.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        pc7 pc7Var = MediaController.z().R0;
        this.p2 = pc7Var;
        if (pc7Var != null) {
            z = true;
        } else {
            z = false;
        }
        this.n2 = z;
        this.m1.n0 = z;
        this.o2 = J0();
        this.q2 = MediaController.z().S0;
        if (J0()) {
            s6Var = u;
            this.d2 = s6Var.a(8, 2131232047);
        } else {
            s6Var = u;
        }
        s7 a = s6Var.a(0, 2131232502);
        a.N();
        a.I = new r10(this, (byte) 0);
        this.e2 = a;
        a.setContentDescription(ob6.M0(2131745564, null));
        EditTextBoldCursor searchField = a.getSearchField();
        searchField.setHint(ob6.M0(2131745564, null));
        int i11 = aob.Fj;
        yob.X(searchField, i11, vnbVar);
        yob.D(searchField, aob.Jj, vnbVar);
        yob.l(searchField, 30, i11, vnbVar);
        if (z) {
            q10Var.s1();
            s0(aob.v0(aob.a7, vnbVar));
            this.m1.setAlpha(1.0f);
            this.l1.setAlpha(0.0f);
            w10 w10Var = this.L2;
            y10 y10Var2 = this.m1;
            Float valueOf = Float.valueOf(0.0f);
            w10Var.getClass();
            w10Var.a(y10Var2, valueOf);
        }
        if (this.q2.size() > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        i20Var.h = z2;
        if (z2) {
            q10Var.setVisibility(0);
            q10Var.setTranslationY(0.0f);
        } else {
            q10Var.setVisibility(8);
            q10Var.setTranslationY(hl.q.y);
        }
        i20Var.f();
        this.m1.setTitle(ob6.M0(2131753945, null));
        pc7 pc7Var2 = this.p2;
        if (pc7Var2 != null) {
            int i12 = (pc7Var2.b > yac.h(this.a).e() ? 1 : (pc7Var2.b == yac.h(this.a).e() ? 0 : -1));
            y10 y10Var3 = this.m1;
            if (i12 == 0) {
                y10Var3.setTitle(ob6.M0(2131746370, null));
            } else {
                y10Var3.setTitle(ob6.a0(null, null, 2131746371, wf3.s(this.p2.b)));
            }
        } else if (r47Var != null && MediaController.z().D0 == null) {
            long B0 = r47.B0(r47Var.k);
            boolean B = wf3.B(B0);
            int i13 = this.a;
            if (B) {
                TLRPC.EncryptedChat a1 = uc7.s1(i13).a1(Integer.valueOf((int) (B0 & 4294967295L)));
                if (a1 != null && (X1 = uc7.s1(this.a).X1(Long.valueOf(a1.user_id))) != null) {
                    this.m1.setTitle(lv2.m(0, X1.first_name, X1.last_name));
                }
            } else if (B0 == yac.h(i13).e()) {
                int i14 = (r47Var.P1() > 2666000L ? 1 : (r47Var.P1() == 2666000L ? 0 : -1));
                y10 y10Var4 = this.m1;
                if (i14 == 0) {
                    y10Var4.setTitle(ob6.M0(2131754245, null));
                } else {
                    y10Var4.setTitle(ob6.M0(2131745629, null));
                }
            } else {
                boolean D = wf3.D(B0);
                int i15 = this.a;
                if (D) {
                    TLRPC.User X12 = uc7.s1(i15).X1(Long.valueOf(B0));
                    if (X12 != null) {
                        this.m1.setTitle(lv2.m(0, X12.first_name, X12.last_name));
                    }
                } else {
                    TLRPC.Chat M0 = uc7.s1(i15).M0(Long.valueOf(-B0));
                    if (M0 != null) {
                        this.m1.setTitle(M0.title);
                    }
                }
            }
        }
        if (J0()) {
            c51Var.setVisibility(8);
            c51Var2.setVisibility(8);
            lu5 lu5Var = new lu5(new s10(this, (byte) 0));
            this.A1 = lu5Var;
            lu5Var.h(q10Var);
        }
        ViewGroup viewGroup2 = this.b;
        l10 l10Var3 = this.x1;
        int i16 = 52;
        if (!J0() && !this.s2) {
            i2 = 52;
        } else {
            i2 = 0;
        }
        viewGroup2.addView(l10Var3, tre.e(-1, i2 + 179, 83));
        this.b.addView(this.o1, new FrameLayout.LayoutParams(-1, hl.e1(), 83));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.x1.getLayoutParams();
        if (!J0() && !this.s2) {
            i3 = 52;
        } else {
            i3 = 0;
        }
        layoutParams.height = hl.L(i3 + 179);
        ((FrameLayout.LayoutParams) this.o1.getLayoutParams()).bottomMargin = hl.L(179 + ((J0() || this.s2) ? 0 : 0));
        this.b.addView(this.n1, tre.c(3.0f, -1));
        this.b.addView(this.m1);
        l10 l10Var4 = new l10(this, activity, (byte) 1);
        this.b2 = l10Var4;
        l10Var4.setAlpha(0.0f);
        l10Var4.setVisibility(4);
        this.c.addView(l10Var4);
        de0 de0Var = new de0(activity);
        this.c2 = de0Var;
        de0Var.setAspectFit(true);
        de0Var.setRoundRadius(hl.L(8.0f));
        de0Var.setScaleX(0.9f);
        de0Var.setScaleY(0.9f);
        l10Var4.addView(de0Var, tre.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        b1(false);
        Y0();
        if (this.q1 && i20Var.b() == 0) {
            i9 = 0;
        }
        linearLayout.setVisibility(i9);
        U0();
    }

    public static boolean G0(float f, float f2) {
        if (Math.abs(f - f2) < 0.05f) {
            return true;
        }
        return false;
    }

    public static jn5 I0(r47 r47Var) {
        TLRPC.PhotoSize photoSize;
        TLRPC.Document F0 = r47Var.F0();
        if (F0 != null) {
            photoSize = xb4.w(F0.thumbs, 360, false, null, false);
        } else {
            photoSize = null;
        }
        if (!(photoSize instanceof TLRPC.TL_photoSize) && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            photoSize = null;
        }
        if (photoSize != null) {
            return jn5.c(photoSize, F0);
        }
        String u0 = r47Var.u0(true);
        if (u0 == null) {
            return null;
        }
        return jn5.g(u0);
    }

    @Override
    public final void A(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.Ij));
        hashSet.add(Integer.valueOf(aob.Mj));
        hashSet.add(Integer.valueOf(aob.Lj));
        hashSet.add(Integer.valueOf(aob.Zd));
        hashSet.add(Integer.valueOf(aob.ae));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.md));
        hashSet.add(Integer.valueOf(aob.ld));
        hashSet.add(Integer.valueOf(aob.af));
        hashSet.add(Integer.valueOf(aob.Ec));
        hashSet.add(Integer.valueOf(aob.Ze));
    }

    @Override
    public final boolean D() {
        return false;
    }

    public final fu5 E0(fu5 fu5Var, r47 r47Var) {
        long j;
        oc7 G1 = uc7.s1(this.a).G1();
        TLRPC.Document F0 = r47Var.F0();
        if (F0 != null) {
            j = F0.id;
        } else {
            j = 0;
        }
        fu5 K = fu5Var.K();
        K.b(2131231243, ob6.M0(2131753749, null), new vn1(fu5Var, (byte) 0), false);
        K.j();
        K.k(2131231625, ob6.M0(2131753906, null), new e10(this, r47Var, fu5Var, (byte) 0), !G1.b.contains(Long.valueOf(j)));
        K.b(2131232356, ob6.M0(2131753903, null), new e10(this, r47Var, fu5Var, (byte) 1), false);
        K.b(2131231793, ob6.M0(2131753907, null), new e10(this, r47Var, fu5Var, (byte) 2), false);
        K.j();
        K.o(12, hl.L(200.0f), ob6.M0(2131753908, null));
        return K;
    }

    public final void F0() {
        s7 s7Var = this.U1;
        int v0 = aob.v0(((Integer) s7Var.getTag()).intValue(), this.J0);
        int v02 = aob.v0(aob.Nj, this.J0);
        int v03 = aob.v0(aob.i6, this.J0);
        if (!this.O2 || v0 != this.P2) {
            this.P2 = v0;
            s7Var.setIconColor(v0);
        }
        boolean z = this.O2;
        s7 s7Var2 = this.G1;
        if (!z || v02 != this.Q2) {
            this.Q2 = v02;
            s7Var2.setIconColor(v02);
        }
        if (!this.O2 || v03 != this.R2) {
            this.R2 = v03;
            aob.F1(s7Var.getBackground(), v03, true);
            aob.F1(s7Var2.getBackground(), v03, true);
        }
        this.O2 = true;
        this.L1.setProgressColor(aob.v0(aob.Mj, this.J0));
        Z0();
        int i = aob.G8;
        s7Var.I(aob.v0(i, this.J0));
        int i2 = aob.E8;
        s7Var2.O(aob.v0(i2, this.J0), false);
        s7Var2.O(aob.v0(i2, this.J0), true);
        s7Var2.I(aob.v0(i, this.J0));
    }

    public final void H0(r47 r47Var) {
        ArrayList t;
        TLRPC.TL_document tL_document;
        int i = yac.t0;
        int i2 = this.a;
        LaunchActivity launchActivity = this.z2;
        if (i != i2) {
            launchActivity.N0(i2);
        }
        Bundle j = qd4.j(3, "onlySelect", "dialogsType", true);
        j.putBoolean("canSelectTopics", true);
        uj3 uj3Var = new uj3(j);
        if (r47Var.e1() < 0) {
            if (!(r47Var.F0() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) r47Var.F0();
            t = null;
        } else {
            t = qd4.t(r47Var);
            tL_document = null;
        }
        uj3Var.E2 = new pt(this, t, tL_document, r47Var, (byte) 1);
        launchActivity.t0(uj3Var);
        dismiss();
    }

    public final boolean J0() {
        pc7 pc7Var = this.p2;
        if (pc7Var != null && pc7Var.b == yac.h(this.a).e()) {
            return true;
        }
        return false;
    }

    public final void K0(int i) {
        LaunchActivity launchActivity;
        r47 r47Var = MediaController.z().v0;
        if (r47Var != null && (launchActivity = this.z2) != null) {
            if (i == 1) {
                H0(r47Var);
            } else if (i == 2) {
                Q0(r47Var);
            } else if (i == 4) {
                int i2 = yac.t0;
                int i3 = this.a;
                if (i2 != i3) {
                    launchActivity.N0(i3);
                }
                Bundle bundle = new Bundle();
                long B0 = r47.B0(r47Var.k);
                if (wf3.B(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (wf3.D(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat M0 = uc7.s1(this.a).M0(Long.valueOf(-B0));
                    if (M0 != null && M0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -M0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", r47Var.e1());
                jn7.f(this.a).k(jn7.s, new Object[0]);
                launchActivity.u0(new zu1(bundle), false, false);
                dismiss();
            } else if (i == 5) {
                L0(r47Var);
            } else if (i == 6) {
                lh2.t().T(MediaController.z().x());
                this.J1.performClick();
            } else if (i == 7) {
                M0(r47Var, false, new z00(this, r47Var, (byte) 0), false);
            } else if (i == 8) {
                r1a r1aVar = new r1a(getContext(), true, null, new b10(this, (byte) 0), null);
                r1aVar.c2 = true;
                r1aVar.U1 = false;
                r1aVar.j2.O(true);
                r1aVar.show();
            }
        }
    }

    public final void L0(r47 r47Var) {
        String str;
        if (Build.VERSION.SDK_INT <= 28 || f11.b) {
            LaunchActivity launchActivity = this.z2;
            if (launchActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                launchActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        String B = xb4.B(r47Var.F0());
        if (TextUtils.isEmpty(B)) {
            B = r47Var.S0();
        }
        String str2 = B;
        String str3 = r47Var.k.attachPath;
        if (str3 != null && str3.length() > 0 && !bp1.t(str3)) {
            str3 = null;
        }
        if (str3 == null || str3.length() == 0) {
            xb4.G(this.a);
            str3 = xb4.M(r47Var.k, false, true).toString();
        }
        if (r47Var.F0() != null) {
            str = r47Var.F0().mime_type;
        } else {
            str = "";
        }
        String str4 = str;
        String str5 = str3;
        MediaController.g0(str5, this.z2, 3, str2, str4, new b10(this, (byte) 1));
    }

    public final void M0(r47 r47Var, boolean z, Runnable runnable, boolean z2) {
        TLRPC.Document F0 = r47Var.F0();
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_account_saveMusic, new f10(this, z2, r47Var, z, runnable, j, F0));
    }

    public final boolean N0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j20.N0(boolean):boolean");
    }

    public final void O0(b8 b8Var, boolean z) {
        if (z) {
            int i = aob.Oj;
            b8Var.setTextColor(aob.v0(i, this.J0));
            b8Var.setIconColor(aob.v0(i, this.J0));
            return;
        }
        int i2 = aob.E8;
        b8Var.setTextColor(aob.v0(i2, this.J0));
        b8Var.setIconColor(aob.v0(i2, this.J0));
    }

    @Override
    public final int P() {
        l10 l10Var = this.x1;
        if (l10Var == null) {
            return 0;
        }
        if (this.q2.size() <= 1) {
            return l10Var.getMeasuredHeight() + this.t0;
        }
        int L = hl.L(13.0f);
        int translationY = (int) (this.r1.getTranslationY() + ((this.t2 - this.t0) - L));
        if (this.t0 + translationY < a.getCurrentActionBarHeight()) {
            float L2 = hl.L(4.0f) + L;
            translationY -= (int) ((a.getCurrentActionBarHeight() - L2) * Math.min(1.0f, ((a.getCurrentActionBarHeight() - translationY) - this.t0) / L2));
        }
        return this.c.getMeasuredHeight() - (translationY + hl.m);
    }

    public final void P0(final boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        boolean J0 = J0();
        c51 c51Var = this.z1;
        c51 c51Var2 = this.y1;
        if (!J0 && !this.s2) {
            c51Var2.setVisibility(0);
            c51Var.setVisibility(0);
            ViewPropertyAnimator animate = c51Var2.animate();
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
            k43 k43Var = k43.h;
            duration.setInterpolator(k43Var).withEndAction(new Runnable(this) {
                public final j20 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    int i = 8;
                    boolean z2 = z;
                    j20 j20Var = this.b;
                    switch (b) {
                        case 0:
                            c51 c51Var3 = j20Var.y1;
                            if (!z2) {
                                i = 0;
                            }
                            c51Var3.setVisibility(i);
                            return;
                        default:
                            c51 c51Var4 = j20Var.z1;
                            if (z2) {
                                i = 0;
                            }
                            c51Var4.setVisibility(i);
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = c51Var.animate();
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
            scaleX2.scaleY(f6).setDuration(420L).setInterpolator(k43Var).withEndAction(new Runnable(this) {
                public final j20 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    int i = 8;
                    boolean z2 = z;
                    j20 j20Var = this.b;
                    switch (b) {
                        case 0:
                            c51 c51Var3 = j20Var.y1;
                            if (!z2) {
                                i = 0;
                            }
                            c51Var3.setVisibility(i);
                            return;
                        default:
                            c51 c51Var4 = j20Var.z1;
                            if (z2) {
                                i = 0;
                            }
                            c51Var4.setVisibility(i);
                            return;
                    }
                }
            }).start();
            return;
        }
        c51Var2.setVisibility(8);
        c51Var.setVisibility(8);
    }

    public final void Q0(defpackage.r47 r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j20.Q0(r47):void");
    }

    public final void R0(boolean z, boolean z2) {
        de0 de0Var = this.c2;
        l10 l10Var = this.b2;
        if (z) {
            if (l10Var.getVisibility() != 0 && !this.f2) {
                l10Var.setTag(1);
                z10 z10Var = this.B1;
                de0Var.setImageBitmap(z10Var.a[z10Var.b ? 1 : 0].getImageReceiver().n());
                this.f2 = true;
                mu9.d(new w00(this, (byte) 1));
                l10Var.setVisibility(0);
                l10Var.animate().alpha(1.0f).setDuration(180L).setListener(new v10(this, (byte) 0)).start();
                de0Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            }
        } else if (l10Var.getVisibility() != 0) {
        } else {
            l10Var.setTag(null);
            if (z2) {
                this.f2 = true;
                l10Var.animate().alpha(0.0f).setDuration(180L).setListener(new v10(this, (byte) 1)).start();
                de0Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
                return;
            }
            l10Var.setAlpha(0.0f);
            l10Var.setVisibility(4);
            de0Var.setImageBitmap(null);
            de0Var.setScaleX(0.9f);
            de0Var.setScaleY(0.9f);
        }
    }

    @Override
    public final ArrayList S() {
        ArrayList arrayList = new ArrayList();
        u00 u00Var = new u00(this, (byte) 0);
        int i = aob.Fj;
        arrayList.add(new apb(this.m1, 1024, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        int i2 = aob.Jj;
        arrayList.add(new apb(this.m1, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.b, 0, (Class[]) null, (Paint) null, new Drawable[]{this.s0}, (zob) null, aob.h5));
        arrayList.add(new apb(this.L1, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Mj));
        int i3 = aob.w7;
        s7 s7Var = this.O1;
        arrayList.add(new apb(s7Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i3));
        arrayList.add(new apb(s7Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.x7));
        int i4 = aob.Nj;
        s7 s7Var2 = this.U1;
        arrayList.add(new apb(s7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, i4));
        arrayList.add(new apb(s7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, aob.Oj));
        int i5 = aob.E8;
        arrayList.add(new apb(s7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, i5));
        int i6 = aob.G8;
        arrayList.add(new apb(s7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, i6));
        s7 s7Var3 = this.G1;
        arrayList.add(new apb(s7Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, i4));
        arrayList.add(new apb(s7Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, i5));
        arrayList.add(new apb(s7Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, i6));
        n10 n10Var = this.D1;
        arrayList.add(new apb(n10Var, new b29[]{n10Var.getAnimatedDrawable()}, "Triangle 3", i4));
        arrayList.add(new apb(n10Var, new b29[]{n10Var.getAnimatedDrawable()}, "Triangle 4", i4));
        arrayList.add(new apb(n10Var, new b29[]{n10Var.getAnimatedDrawable()}, "Rectangle 4", i4));
        int i7 = aob.i6;
        arrayList.add(new apb(this.D1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i7));
        arrayList.add(new apb(this.Z1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i7));
        o10 o10Var = this.E1;
        arrayList.add(new apb(o10Var, new b29[]{o10Var.getAnimatedDrawable()}, "Triangle 3", i4));
        arrayList.add(new apb(o10Var, new b29[]{o10Var.getAnimatedDrawable()}, "Triangle 4", i4));
        arrayList.add(new apb(o10Var, new b29[]{o10Var.getAnimatedDrawable()}, "Rectangle 4", i4));
        arrayList.add(new apb(this.E1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i7));
        int i8 = aob.X5;
        arrayList.add(new apb(this.v1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i8));
        arrayList.add(new apb(this.w1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i8));
        arrayList.add(new apb(this.L1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.c7));
        arrayList.add(new apb(this.L1, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h6));
        a20 a20Var = this.C1;
        arrayList.add(new apb(a20Var.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(a20Var.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        a20 a20Var2 = this.F1;
        arrayList.add(new apb(a20Var2.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(a20Var2.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.zj));
        return arrayList;
    }

    public final void S0(k20 k20Var, r47 r47Var) {
        boolean z;
        fu5 H = fu5.H(this.c, this.J0, k20Var, true);
        int i = 5;
        if (J0()) {
            H.k(2131232170, ob6.M0(2131750547, null), new e10(this, H, r47Var, (byte) 3), !this.s2);
            H.k(2131232370, ob6.M0(2131745187, null), new e10(this, H, r47Var, (byte) 4), !this.s2);
            H.b(2131232113, ob6.M0(2131751563, null), new e10(this, r47Var, H, (byte) 5), true);
        } else {
            H.k(2131232395, ob6.M0(2131753909, null), new c10(H, E0(H, r47Var), (byte) 1), !this.s2);
            if (!this.s2 && H.z() != null) {
                H.z().setRightIcon(2131232064);
            }
            H.j();
            H.k(2131232170, ob6.M0(2131750547, null), new e10(this, H, r47Var, (byte) 6), !this.s2);
            H.k(2131232368, ob6.M0(2131745187, null), new e10(this, H, r47Var, (byte) 7), !this.s2);
            if (r47Var.e1() > 0) {
                z = true;
            } else {
                z = false;
            }
            H.k(2131232425, ob6.M0(2131745070, null), new z00(this, r47Var, (byte) 1), z);
        }
        if (ob6.a0) {
            i = 3;
        }
        H.W(i);
        H.a0();
    }

    public final void T0() {
        if (this.A2 == 1) {
            this.D2 = System.currentTimeMillis();
            this.B2 = MediaController.z().v0.b0;
            p1 p1Var = this.H2;
            hl.r(p1Var);
            hl.c3(p1Var);
        }
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
        int i;
        LinearLayout linearLayout = this.u1;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        if (this.x1.getVisibility() == 0) {
            i = hl.L(150.0f);
        } else {
            i = -hl.L(30.0f);
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.b.getMeasuredHeight()) - i) / 2);
    }

    public final void V0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j20.V0():void");
    }

    public final void W0(boolean z) {
        if (this.O1 != null) {
            float f = MediaController.z().r0;
            this.P1.b(z, f);
            this.Q1.e(z, f);
            updateColors();
            boolean z2 = this.R1;
            int i = 0;
            this.R1 = false;
            while (true) {
                b8[] b8VarArr = this.S1;
                if (i < b8VarArr.length) {
                    if (!z2 && G0(f, T2[i])) {
                        b8 b8Var = b8VarArr[i];
                        int i2 = aob.Hi;
                        b8Var.d(aob.v0(i2, this.J0), aob.v0(i2, this.J0));
                    } else {
                        b8 b8Var2 = b8VarArr[i];
                        int i3 = aob.E8;
                        b8Var2.d(aob.v0(i3, this.J0), aob.v0(i3, this.J0));
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void X0(defpackage.r47 r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j20.X0(r47, boolean):void");
    }

    public final void Y0() {
        int i = xea.O0;
        s7 s7Var = this.U1;
        if (i != 0 && i != 1) {
            if (i == 2) {
                s7Var.setIcon(2131232572);
                int i2 = aob.Oj;
                s7Var.setTag(Integer.valueOf(i2));
                s7Var.setIconColor(aob.v0(i2, this.J0));
                aob.F1(s7Var.getBackground(), aob.v0(i2, this.J0) & 436207615, true);
                s7Var.setContentDescription(ob6.M0(2131754780, null));
                return;
            }
            return;
        }
        if (xea.J0) {
            if (i == 0) {
                s7Var.setIcon(2131232573);
            } else {
                s7Var.setIcon(2131232570);
            }
        } else if (xea.K0) {
            if (i == 0) {
                s7Var.setIcon(2131232567);
            } else {
                s7Var.setIcon(2131232569);
            }
        } else {
            s7Var.setIcon(2131232571);
        }
        if (i == 0 && !xea.J0 && !xea.K0) {
            int i3 = aob.Nj;
            s7Var.setTag(Integer.valueOf(i3));
            s7Var.setIconColor(aob.v0(i3, this.J0));
            aob.F1(s7Var.getBackground(), aob.v0(aob.i6, this.J0), true);
            s7Var.setContentDescription(ob6.M0(2131754781, null));
            return;
        }
        int i4 = aob.Oj;
        s7Var.setTag(Integer.valueOf(i4));
        s7Var.setIconColor(aob.v0(i4, this.J0));
        aob.F1(s7Var.getBackground(), aob.v0(i4, this.J0) & 436207615, true);
        if (i == 0) {
            if (xea.J0) {
                s7Var.setContentDescription(ob6.M0(2131745050, null));
                return;
            } else {
                s7Var.setContentDescription(ob6.M0(2131745754, null));
                return;
            }
        }
        s7Var.setContentDescription(ob6.M0(2131754782, null));
    }

    public final void Z0() {
        boolean z;
        O0(this.X1, xea.J0);
        O0(this.Y1, xea.K0);
        boolean z2 = false;
        if (xea.O0 == 1) {
            z = true;
        } else {
            z = false;
        }
        O0(this.W1, z);
        if (xea.O0 == 2) {
            z2 = true;
        }
        O0(this.V1, z2);
    }

    public final void a1() {
        int i;
        int v0;
        int i2;
        int i3;
        if (this.n2) {
            i = aob.a7;
        } else {
            i = aob.h5;
        }
        int v02 = aob.v0(i, this.J0);
        if (v02 != this.N2) {
            this.N2 = v02;
            s0(v02);
        }
        int v03 = aob.v0(aob.Nj, this.J0);
        n10 n10Var = this.D1;
        if (n10Var != null) {
            n10Var.h(v03, "Triangle 3");
            n10Var.h(v03, "Triangle 4");
            n10Var.h(v03, "Rectangle 4");
        }
        o10 o10Var = this.E1;
        if (o10Var != null) {
            o10Var.h(v03, "Triangle 3");
            o10Var.h(v03, "Triangle 4");
            o10Var.h(v03, "Rectangle 4");
        }
        b20 b20Var = this.M1;
        if (b20Var != null) {
            b20Var.setOuterColor(aob.v0(aob.Mj, this.J0));
        }
        boolean z = false;
        s7 s7Var = this.O1;
        if (s7Var != null) {
            float f = MediaController.z().r0;
            if (!G0(f, 1.0f)) {
                i2 = aob.Hi;
            } else {
                i2 = aob.x7;
            }
            int v04 = aob.v0(i2, this.J0);
            zoa zoaVar = this.P1;
            if (zoaVar != null) {
                zoaVar.a.u(v04);
                Paint paint = zoaVar.b;
                if (paint != null) {
                    paint.setColor(v04);
                }
            }
            aob.F1(s7Var.getBackground(), v04 & 436207615, true);
            int i4 = 0;
            while (true) {
                b8[] b8VarArr = this.S1;
                if (i4 >= b8VarArr.length) {
                    break;
                }
                if (b8VarArr[i4] != null) {
                    if (G0(f, T2[i4])) {
                        i3 = aob.Hi;
                    } else {
                        i3 = aob.E8;
                    }
                    int v05 = aob.v0(i3, this.J0);
                    b8VarArr[i4].d(v05, v05);
                }
                i4++;
            }
        }
        b8 b8Var = this.I1;
        if (b8Var != null) {
            p10 p10Var = this.J1;
            if (p10Var != null && p10Var.b()) {
                z = true;
            }
            int v06 = aob.v0(aob.E8, this.J0);
            int v07 = aob.v0(aob.F8, this.J0);
            int i5 = aob.Fi;
            b8Var.e(v06, v07, aob.v0(i5, this.J0), z);
            b8 b8Var2 = this.I1;
            if (p10Var != null && p10Var.b()) {
                v0 = aob.p1(0.1f, aob.v0(i5, this.J0));
            } else {
                v0 = aob.v0(aob.i6, this.J0);
            }
            b8Var2.setSelectorColor(v0);
        }
    }

    public final void b1(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j20.b1(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean z;
        k20 k20Var;
        r47 messageObject;
        k20 k20Var2;
        r47 messageObject2;
        r47 r47Var;
        int i3 = jn7.h2;
        int i4 = jn7.f2;
        int i5 = jn7.g2;
        q10 q10Var = this.r1;
        int i6 = 0;
        if (i != i3 && i != i5 && i != i4) {
            if (i == jn7.e2) {
                r47 r47Var2 = MediaController.z().v0;
                if (r47Var2 != null && r47Var2.I3()) {
                    X0(r47Var2, false);
                    return;
                }
                return;
            } else if (i == jn7.M4) {
                W0(true);
                return;
            } else {
                int i7 = jn7.K0;
                i20 i20Var = this.t1;
                if (i == i7) {
                    this.p2 = MediaController.z().R0;
                    this.q2 = MediaController.z().S0;
                    i20Var.f();
                    return;
                } else if (i == jn7.L0) {
                    this.p2 = MediaController.z().R0;
                    this.q2 = MediaController.z().S0;
                    i20Var.f();
                    if (xea.K0) {
                        q10Var.E0();
                        int intValue = ((Integer) objArr[0]).intValue();
                        x46 x46Var = this.s1;
                        x46Var.K0();
                        int M0 = x46Var.M0();
                        if (M0 != -1) {
                            View m = x46Var.m(M0);
                            if (m != null) {
                                i6 = m.getTop();
                            }
                            x46Var.g1(M0 + intValue, i6);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == jn7.Y1) {
                    if (((String) objArr[0]).equals(this.u2)) {
                        b1(false);
                        this.j2 = true;
                        return;
                    }
                    return;
                } else if (i == jn7.X1) {
                    if (((String) objArr[0]).equals(this.u2) && (r47Var = MediaController.z().v0) != null) {
                        Long l = (Long) objArr[1];
                        Long l2 = (Long) objArr[2];
                        float f = 1.0f;
                        if (!this.j2) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.i2) >= 500) {
                                if (MediaController.z().m0) {
                                    f = xb4.G(this.a).t(this.u2, r47Var.b0);
                                }
                                this.i2 = elapsedRealtime;
                            } else {
                                f = -1.0f;
                            }
                        }
                        if (f != -1.0f) {
                            vpa vpaVar = this.h2;
                            vpaVar.m.i = f * 1000.0f;
                            vpaVar.h();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == jn7.X3) {
                    b1(false);
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
        b1(z);
        if (i != i4 && i != i5) {
            if (((r47) objArr[0]).T == 0) {
                int childCount = q10Var.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = q10Var.getChildAt(i8);
                    if ((childAt instanceof k20) && (messageObject2 = (k20Var2 = (k20) childAt).getMessageObject()) != null && (r47.Q4(messageObject2.k) || messageObject2.I3())) {
                        k20Var2.b(false, true);
                    }
                }
            } else {
                return;
            }
        } else {
            int childCount2 = q10Var.getChildCount();
            for (int i9 = 0; i9 < childCount2; i9++) {
                View childAt2 = q10Var.getChildAt(i9);
                if ((childAt2 instanceof k20) && (messageObject = (k20Var = (k20) childAt2).getMessageObject()) != null && (r47.Q4(messageObject.k) || messageObject.I3())) {
                    k20Var.b(false, true);
                }
            }
            if (i == i5 && MediaController.z().v0 != null) {
                if (MediaController.z().G()) {
                    T0();
                } else if (this.A2 == 1 && this.B2 != -1.0f) {
                    p1 p1Var = this.H2;
                    hl.r(p1Var);
                    this.E2 = 0L;
                    p1Var.run();
                    this.B2 = -1.0f;
                }
            }
        }
        eh2 eh2Var = this.H1;
        if (eh2Var != null) {
            eh2Var.a(go.w());
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        jn7.f(this.a).n(this, jn7.f2);
        jn7.f(this.a).n(this, jn7.g2);
        jn7.f(this.a).n(this, jn7.h2);
        jn7.f(this.a).n(this, jn7.e2);
        jn7.f(this.a).n(this, jn7.Y1);
        jn7.f(this.a).n(this, jn7.X1);
        jn7.f(this.a).n(this, jn7.K0);
        jn7.f(this.a).n(this, jn7.L0);
        jn7.f(this.a).n(this, jn7.X3);
        jn7.e().n(this, jn7.M4);
        lq3.q(this.a).v(this);
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
        l10 l10Var = this.b2;
        if (view != l10Var) {
            return false;
        }
        l10Var.layout(0, 0, l10Var.getMeasuredWidth(), l10Var.getMeasuredHeight());
        return true;
    }

    @Override
    public final void i(long j, long j2) {
        this.L1.a(true, Math.min(1.0f, ((float) j) / ((float) j2)));
    }

    @Override
    public final boolean i0(View view, int i, int i2) {
        l10 l10Var = this.b2;
        if (view == l10Var) {
            ex0 ex0Var = this.c;
            l10Var.measure(View.MeasureSpec.makeMeasureSpec(ex0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ex0Var.getMeasuredHeight(), 1073741824));
            return true;
        }
        return false;
    }

    @Override
    public final void onBackPressed() {
        y10 y10Var = this.m1;
        if (y10Var != null && y10Var.o0) {
            y10Var.o(true);
        } else if (this.b2.getTag() != null) {
            R0(false, true);
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
                F0();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            a1();
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        try {
            float f = this.G2;
            if (f >= 0.0f) {
                if (f <= 0.5f && vm2.h(aob.v0(aob.h5, this.J0)) > 0.699999988079071d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != this.F2) {
                    this.F2 = z;
                    hl.l3(this, z);
                }
            }
        } catch (Exception e3) {
            cc4.g(e3, true);
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
        s7 s7Var = this.O1;
        if (s7Var != null) {
            if (!G0(MediaController.z().r0, 1.0f)) {
                i = aob.Hi;
            } else {
                i = aob.x7;
            }
            int v02 = aob.v0(i, this.J0);
            zoa zoaVar = this.P1;
            if (zoaVar != null) {
                zoaVar.a.u(v02);
                Paint paint = zoaVar.b;
                if (paint != null) {
                    paint.setColor(v02);
                }
            }
            s7Var.setBackground(aob.f0(v02 & 436207615, 1, hl.L(14.0f)));
        }
        b8 b8Var = this.I1;
        if (b8Var != null) {
            p10 p10Var = this.J1;
            z = (p10Var == null || !p10Var.b()) ? false : false;
            int v03 = aob.v0(aob.E8, this.J0);
            int v04 = aob.v0(aob.F8, this.J0);
            int i2 = aob.Fi;
            b8Var.e(v03, v04, aob.v0(i2, this.J0), z);
            b8 b8Var2 = this.I1;
            if (p10Var != null && p10Var.b()) {
                v0 = aob.p1(0.1f, aob.v0(i2, this.J0));
            } else {
                v0 = aob.v0(aob.i6, this.J0);
            }
            b8Var2.setSelectorColor(v0);
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
