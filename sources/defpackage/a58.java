package defpackage;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.q;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public abstract class a58 extends ela implements jm7 {
    public static final int U3 = 0;
    public final l48 A0;
    public boolean A1;
    public int A2;
    public long A3;
    public final n38 B0;
    public int B1;
    public boolean B2;
    public long B3;
    public final View C0;
    public int C1;
    public final c40 C2;
    public boolean C3;
    public final ImageView D0;
    public int D1;
    public final po D2;
    public TLRPC.TL_channels_sendAsPeers D3;
    public final LinearLayout E0;
    public final z48 E1;
    public final ln E2;
    public final h38 E3;
    public final b48 F0;
    public final eq F1;
    public final ln F2;
    public int F3;
    public ho G0;
    public w48 G1;
    public float G2;
    public final h38 G3;
    public ho H0;
    public boolean H1;
    public long H2;
    public final ArrayList H3;
    public ln I0;
    public h4b I1;
    public boolean I2;
    public final ArrayList I3;
    public ln J0;
    public boolean J1;
    public boolean J2;
    public boolean J3;
    public boolean K0;
    public boolean K1;
    public boolean K2;
    public boolean K3;
    public boolean L0;
    public boolean L1;
    public boolean L2;
    public final ei7 L3;
    public long M0;
    public b48 M1;
    public ig5 M2;
    public final ln M3;
    public long N0;
    public vn2 N1;
    public final pc8 N2;
    public final ln N3;
    public boolean O0;
    public wt7 O1;
    public boolean O2;
    public final ln O3;
    public boolean P0;
    public xt7 P1;
    public z38 P2;
    public float P3;
    public boolean Q0;
    public nj7 Q1;
    public FrameLayout Q2;
    public final Path Q3;
    public boolean R0;
    public t38 R1;
    public wb R2;
    public boolean R3;
    public final g48 S0;
    public q02 S1;
    public boolean S2;
    public ValueAnimator S3;
    public final FrameLayout T0;
    public hg5 T1;
    public v38 T2;
    public float T3;
    public final mm U0;
    public ValueAnimator U1;
    public float U2;
    public final ImageReceiver V0;
    public v29 V1;
    public boolean V2;
    public final ImageReceiver W0;
    public LinearLayout W1;
    public boolean W2;
    public final ArrayList X0;
    public TextView X1;
    public boolean X2;
    public Runnable Y0;
    public TextView Y1;
    public boolean Y2;
    public final e48 Z0;
    public h6b Z1;
    public boolean Z2;
    public final kw3 a1;
    public ViewPropertyAnimator a2;
    public boolean a3;
    public o1a b1;
    public final im0 b2;
    public final ImageReceiver b3;
    public float c1;
    public final im0 c2;
    public xm c3;
    public final pc0 d1;
    public final Paint d2;
    public final ImageReceiver d3;
    public final x48 e1;
    public int e2;
    public vm e3;
    public final i6b f1;
    public ValueAnimator f2;
    public boolean f3;
    public jif g1;
    public float g2;
    public boolean g3;
    public int h1;
    public float h2;
    public v29 h3;
    public a8 i1;
    public float i2;
    public boolean i3;
    public v48 j1;
    public int j2;
    public float j3;
    public TL_stories.PeerStories k1;
    public boolean k2;
    public boolean k3;
    public final ArrayList l1;
    public boolean l2;
    public float l3;
    public final ImageView m0;
    public final ArrayList m1;
    public boolean m2;
    public int m3;
    public final ImageView n0;
    public final y48 n1;
    public boolean n2;
    public int n3;
    public final a6 o0;
    public final pl9 o1;
    public int o2;
    public int o3;
    public final s09 p0;
    public ArrayList p1;
    public final int p2;
    public h38 p3;
    public final ImageView q0;
    public int q1;
    public TextView q2;
    public float q3;
    public final r63 r0;
    public long r1;
    public h02 r2;
    public boolean r3;
    public final b8b s0;
    public boolean s1;
    public int s2;
    public mx6 s3;
    public final b48 t0;
    public boolean t1;
    public int t2;
    public a8 t3;
    public m4b u0;
    public boolean u1;
    public boolean u2;
    public a8 u3;
    public hg5 v0;
    public boolean v1;
    public a91 v2;
    public final km0 v3;
    public hg5 w0;
    public boolean w1;
    public boolean w2;
    public final nz4 w3;
    public hg5 x0;
    public long x1;
    public float x2;
    public final bm0 x3;
    public int y0;
    public final float y1;
    public e51 y2;
    public TL_stories.TL_premium_boostsStatus y3;
    public final oab z0;
    public int z1;
    public q z2;
    public vh1 z3;

    public a58(Context context, final oab oabVar, y48 y48Var, r63 r63Var) {
        super(context, null);
        this.R0 = true;
        this.X0 = new ArrayList();
        this.h1 = -5;
        this.y1 = 1.0f;
        z48 z48Var = new z48(this);
        this.E1 = z48Var;
        this.g2 = -1.0f;
        this.h2 = -1.0f;
        this.i2 = -1.0f;
        this.p2 = ConnectionsManager.generateClassGuid();
        this.E2 = new ln(this);
        this.F2 = new ln(this);
        pc8 pc8Var = new pc8();
        this.N2 = pc8Var;
        this.U2 = 1.0f;
        this.E3 = new h38(this, (byte) 4);
        this.G3 = new h38(this, (byte) 11);
        this.H3 = new ArrayList();
        this.I3 = new ArrayList();
        this.L3 = new ei7(this, (byte) 6);
        this.M3 = new ln(this);
        this.N3 = new ln(this);
        this.O3 = new ln(this);
        this.Q3 = new Path();
        pc8Var.E = new fk3(this);
        ?? obj = new Object();
        obj.g = new ArrayList();
        this.C2 = obj;
        this.D2 = new po(null);
        this.l1 = new ArrayList();
        this.m1 = new ArrayList();
        mm mmVar = new mm(this, (byte) 5);
        this.U0 = mmVar;
        mmVar.B0 = false;
        mmVar.A1 = true;
        mmVar.y = true;
        mmVar.T(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b3 = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.y = true;
        imageReceiver.T(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.d3 = imageReceiver2;
        imageReceiver2.A1 = true;
        imageReceiver2.y = true;
        imageReceiver2.T(3);
        ImageReceiver imageReceiver3 = new ImageReceiver(null);
        this.V0 = imageReceiver3;
        imageReceiver3.A1 = true;
        imageReceiver3.y = true;
        imageReceiver3.T(0);
        ImageReceiver imageReceiver4 = new ImageReceiver(null);
        this.W0 = imageReceiver4;
        imageReceiver4.A1 = true;
        imageReceiver4.y = true;
        imageReceiver4.T(0);
        mmVar.a = Arrays.asList(imageReceiver3, imageReceiver4);
        this.d1 = new pc0((ylb) null);
        this.z0 = oabVar;
        this.n1 = y48Var;
        this.F1 = y48Var.g;
        this.I1 = oc7.r1(z8c.t0).N1();
        y48Var.l.setColor(-16777216);
        this.d2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.r0 = r63Var;
        setClipChildren(false);
        e48 e48Var = new e48(this, context, this.S0, r63Var, oabVar);
        this.Z0 = e48Var;
        bm0 bm0Var = new bm0(r63Var, cmb.Ie, 0.8f);
        this.x3 = bm0Var;
        kz4 kz4Var = new kz4();
        kz4Var.a(on2.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT >= 31 && gda.e()) {
            nz4 nz4Var = new nz4(kz4Var);
            this.w3 = nz4Var;
            nz4Var.l(gm.L(8.0f));
            kz4Var = nz4Var;
        } else {
            this.w3 = null;
        }
        zgc zgcVar = new zgc(this);
        km0 km0Var = new km0(kz4Var, kz4Var, kz4Var);
        km0Var.h = zgcVar;
        km0Var.i = this;
        this.v3 = km0Var;
        this.b2 = km0Var.c(this, bm0Var, false);
        im0 c = km0Var.c(this, bm0Var, false);
        this.c2 = c;
        c.u(gm.L(32.0f));
        g48 g48Var = new g48(this, context, y48Var, oabVar);
        this.S0 = g48Var;
        g48Var.setClipChildren(false);
        this.a1 = new kw3(this.s2, g48Var);
        g48Var.addView(e48Var, qoe.c(-1.0f, -1));
        l48 l48Var = new l48(this, getContext(), oabVar.E, oabVar, r63Var);
        this.A0 = l48Var;
        l48Var.b0.setOnClickListener(new j38(this, (byte) 10));
        ImageView imageView = new ImageView(context);
        this.D0 = imageView;
        imageView.setImageDrawable(y48Var.m);
        int L = gm.L(8.0f);
        imageView.setPadding(L, L, L, L);
        imageView.setOnClickListener(new j38(this, (byte) 11));
        imageView.setContentDescription(jb6.M0(2131745193, null));
        rve.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(y48Var.n);
        imageView2.setPadding(L, L, L, L);
        b48 b48Var = new b48(this, getContext(), (byte) 1);
        this.F0 = b48Var;
        ho hoVar = this.H0;
        if (hoVar != null) {
            hoVar.setCallback(b48Var);
        }
        b48Var.setWillNotDraw(false);
        b48Var.setOnClickListener(new j38(this, (byte) 12));
        b48 b48Var2 = new b48(this, getContext(), (byte) 2);
        this.t0 = b48Var2;
        ho hoVar2 = this.G0;
        if (hoVar2 != null) {
            hoVar2.setCallback(b48Var2);
        }
        b48Var2.setWillNotDraw(false);
        b48Var2.setOnClickListener(new j38(this, (byte) 13));
        b48Var2.setOnLongClickListener(new u0(this, oabVar, (byte) 3));
        m4b m4bVar = new m4b(context, y48Var);
        this.u0 = m4bVar;
        m4bVar.setPadding(L, L, L, L);
        b48Var2.addView(this.u0, qoe.e(40, 40, 3));
        b48Var.addView(imageView2, qoe.e(40, 40, 3));
        rve.b(b48Var2, 0.3f, 5.0f);
        rve.b(b48Var, 0.3f, 5.0f);
        mmVar.A1 = true;
        mmVar.p0(g48Var);
        pl9 pl9Var = new pl9(10);
        this.o1 = pl9Var;
        g48Var.setOutlineProvider(pl9Var);
        g48Var.setClipToOutline(true);
        addView(g48Var);
        x48 x48Var = new x48(context, z48Var);
        this.e1 = x48Var;
        x48Var.setOnClickListener(new View.OnClickListener(this) {
            public final a58 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                int i;
                byte b = r3;
                oab oabVar2 = oabVar;
                a58 a58Var = this.b;
                switch (b) {
                    case 0:
                        long j = z8c.h(a58Var.s2).n;
                        long j2 = a58Var.r1;
                        if (j == j2) {
                            Bundle j3 = kt6.j(1, "type");
                            j3.putLong("dialog_id", a58Var.r1);
                            oabVar2.L(new cm6(j3, null));
                            return;
                        } else if (j2 > 0) {
                            oabVar2.L(ProfileActivity.S2(j2));
                            return;
                        } else {
                            oabVar2.L(yv1.ga(j2));
                            return;
                        }
                    default:
                        if (a58Var.E1.h()) {
                            oabVar2.T();
                            if (!oab.D1) {
                                oc7.d1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            a6 a6Var = a58Var.o0;
                            if (!oab.D1) {
                                i = 2131748071;
                            } else {
                                i = 2131743536;
                            }
                            a6Var.setContentDescription(jb6.M0(i, null));
                            return;
                        }
                        a58Var.X0(true);
                        return;
                }
            }
        });
        g48Var.addView(x48Var, qoe.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T0 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.E0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, qoe.r(40, 40, 5));
        linearLayout.addView(b48Var, qoe.r(40, 40, 5));
        linearLayout.addView(b48Var2, qoe.r(40, 40, 5));
        addView(linearLayout, qoe.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.m0 = imageView3;
        imageView3.setImageDrawable(y48Var.q);
        imageView3.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        imageView3.setBackground(cmb.f0(-1, 1, -1));
        imageView3.setContentDescription(jb6.M0(2131754838, null));
        g48Var.addView(imageView3, qoe.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.n0 = imageView4;
        imageView4.setImageDrawable(y48Var.r);
        imageView4.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        imageView4.setBackground(cmb.f0(-1, 1, -1));
        imageView4.setContentDescription(jb6.M0(2131754807, null));
        g48Var.addView(imageView4, qoe.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new m67(oabVar, (byte) 10));
        imageView3.setOnClickListener(new oh(this, r63Var, oabVar, context, y48Var, (byte) 11));
        a6 a6Var = new a6(context, (byte) 22);
        this.o0 = a6Var;
        g48Var.addView(a6Var, qoe.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ?? imageView5 = new ImageView(context);
        this.p0 = imageView5;
        imageView5.setPadding(gm.L(6.0f), gm.L(6.0f), gm.L(6.0f), gm.L(6.0f));
        a6Var.addView(imageView5);
        ImageView imageView6 = new ImageView(context);
        this.q0 = imageView6;
        imageView6.setPadding(gm.L(6.0f), gm.L(6.0f), gm.L(6.0f), gm.L(6.0f));
        imageView6.setImageDrawable(y48Var.t);
        a6Var.addView(imageView6);
        imageView6.setVisibility(8);
        b8b b8bVar = new b8b(context);
        this.s0 = b8bVar;
        b8bVar.setOnClickListener(new j38(this, (byte) 2));
        g48Var.addView(b8bVar, qoe.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        a6Var.setOnClickListener(new View.OnClickListener(this) {
            public final a58 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                int i;
                byte b = r3;
                oab oabVar2 = oabVar;
                a58 a58Var = this.b;
                switch (b) {
                    case 0:
                        long j = z8c.h(a58Var.s2).n;
                        long j2 = a58Var.r1;
                        if (j == j2) {
                            Bundle j3 = kt6.j(1, "type");
                            j3.putLong("dialog_id", a58Var.r1);
                            oabVar2.L(new cm6(j3, null));
                            return;
                        } else if (j2 > 0) {
                            oabVar2.L(ProfileActivity.S2(j2));
                            return;
                        } else {
                            oabVar2.L(yv1.ga(j2));
                            return;
                        }
                    default:
                        if (a58Var.E1.h()) {
                            oabVar2.T();
                            if (!oab.D1) {
                                oc7.d1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            a6 a6Var2 = a58Var.o0;
                            if (!oab.D1) {
                                i = 2131748071;
                            } else {
                                i = 2131743536;
                            }
                            a6Var2.setContentDescription(jb6.M0(i, null));
                            return;
                        }
                        a58Var.X0(true);
                        return;
                }
            }
        });
        this.f1 = new i6b(this, y48Var);
        g48Var.addView(l48Var, qoe.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.C0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        n38 n38Var = new n38(this, context, oabVar, oabVar.w, view, frameLayout, oabVar);
        this.B0 = n38Var;
        g48Var.addView(view, qoe.e(-1, 200, 87));
        g48Var.addView(n38Var, qoe.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        g48Var.addView(frameLayout, qoe.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int L2 = gm.L(20.0f);
        int p = on2.p(-1, 100);
        a6Var.setBackground(cmb.i0(L2, L2, L2, L2, 0, p, p));
        int L3 = gm.L(20.0f);
        int p2 = on2.p(-1, 100);
        imageView3.setBackground(cmb.i0(L3, L3, L3, L3, 0, p2, p2));
        int L4 = gm.L(20.0f);
        int p3 = on2.p(-1, 100);
        imageView4.setBackground(cmb.i0(L4, L4, L4, L4, 0, p3, p3));
        int L5 = gm.L(20.0f);
        int p4 = on2.p(-1, 100);
        imageView.setBackground(cmb.i0(L5, L5, L5, L5, 0, p4, p4));
        int L6 = gm.L(20.0f);
        int p5 = on2.p(-1, 100);
        b48Var2.setBackground(cmb.i0(L6, L6, L6, L6, 0, p5, p5));
        int L7 = gm.L(20.0f);
        int p6 = on2.p(-1, 100);
        b48Var.setBackground(cmb.i0(L7, L7, L7, L7, 0, p6, p6));
        pkb pkbVar = l48Var.W;
        View m = pkbVar.m(context);
        gm.B2(m);
        addView(m);
        pkbVar.D = new ts1(this, (byte) 2);
        pkbVar.Q(this);
    }

    public static void Q0(g4b g4bVar, ImageReceiver imageReceiver, String str) {
        if (g4bVar.s) {
            imageReceiver.Y(null, null, gn5.g(g4bVar.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.Z(gn5.g(g4bVar.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public j5 getAccountInstance() {
        return j5.a(this.s2);
    }

    public float getHideInterfaceAlpha() {
        float f;
        float f2 = 1.0f - this.E2.c;
        p2a p2aVar = this.z0.x;
        if (p2aVar == null) {
            f = 0.0f;
        } else {
            f = p2aVar.f;
        }
        return (1.0f - f) * f2;
    }

    public long getMessageMinPrice() {
        oab oabVar;
        if (!this.E1.f || (oabVar = this.z0) == null || oabVar.B0 == null || v0(true)) {
            return 0L;
        }
        return oabVar.B0.m();
    }

    public final boolean A0() {
        z3b z3bVar;
        oab oabVar = this.z0;
        if (oabVar != null && (z3bVar = oabVar.O0) != null && z3bVar.e == 4) {
            return true;
        }
        return false;
    }

    public final boolean B0() {
        TLRPC.User W1;
        if (A0() && (W1 = oc7.r1(this.s2).W1(Long.valueOf(this.z0.O0.d))) != null && W1.bot && W1.bot_can_edit) {
            return true;
        }
        return false;
    }

    public abstract boolean C0();

    public final void D0(ValueAnimator valueAnimator) {
        float f;
        this.T3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f2 = (-gm.L(8.0f)) * this.T3;
        x48 x48Var = this.e1;
        x48Var.setTranslationY(f2);
        x48Var.setAlpha(1.0f - this.T3);
        float f3 = (-gm.L(8.0f)) * this.T3;
        ImageView imageView = this.m0;
        imageView.setTranslationY(f3);
        imageView.setAlpha(1.0f - this.T3);
        float f4 = (-gm.L(8.0f)) * this.T3;
        ImageView imageView2 = this.n0;
        imageView2.setTranslationY(f4);
        imageView2.setAlpha(1.0f - this.T3);
        float f5 = (-gm.L(8.0f)) * this.T3;
        a6 a6Var = this.o0;
        a6Var.setTranslationY(f5);
        a6Var.setAlpha((1.0f - this.T3) * this.U2);
        b48 b48Var = this.M1;
        if (b48Var != null) {
            b48Var.setTranslationY(gm.L(8.0f) * this.T3);
            this.M1.setAlpha(1.0f - this.T3);
        }
        b8b b8bVar = this.s0;
        if (b8bVar != null) {
            b8bVar.setTranslationY((-gm.L(8.0f)) * this.T3);
            b8bVar.setAlpha(1.0f - this.T3);
        }
        this.A0.setAlpha(1.0f - this.T3);
        w48 w48Var = this.G1;
        if (w48Var == null) {
            f = 0.0f;
        } else {
            f = ((fab) w48Var).d.W;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        b48 b48Var2 = this.t0;
        if (b48Var2 != null) {
            b48Var2.setAlpha((1.0f - this.T3) * (1.0f - f) * hideInterfaceAlpha);
        }
        ImageView imageView3 = this.D0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - this.T3) * (1.0f - f) * hideInterfaceAlpha);
        }
        b48 b48Var3 = this.F0;
        if (b48Var3 != null) {
            b48Var3.setAlpha((1.0f - this.T3) * (1.0f - f) * hideInterfaceAlpha);
        }
        t38 t38Var = this.R1;
        if (t38Var != null) {
            t38Var.setAlpha(1.0f - this.T3);
            invalidate();
        }
        this.S0.invalidate();
    }

    public final void E0(k39 k39Var) {
        boolean z;
        boolean z2;
        int i;
        TLRPC.Reaction reaction;
        z48 z48Var = this.E1;
        TL_stories.StoryItem storyItem = z48Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        if (reaction2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (reaction2 != null && k39Var == null) {
            b0();
            this.I1.i0(this.r1, z48Var.a, null);
        } else if (k39Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(this.s2).r.get("❤");
            if (tL_availableReaction != null) {
                this.f3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a = g39.a();
                gn5 b = gn5.b(document);
                ImageReceiver imageReceiver = this.b3;
                imageReceiver.d0(b, a, null, null, null, 0);
                if (imageReceiver.y() != null) {
                    imageReceiver.y().I(0, false, true);
                }
                this.g3 = true;
                this.I1.i0(this.r1, z48Var.a, k39.c(tL_availableReaction));
            }
        } else {
            b0();
            this.I1.i0(this.r1, z48Var.a, k39Var);
        }
        TL_stories.StoryItem storyItem2 = z48Var.a;
        b48 b48Var = this.t0;
        if (storyItem2 != null && (reaction = storyItem2.sent_reaction) != null) {
            z = !z;
            this.u0.setReaction(k39.d(reaction));
            b48Var.setContentDescription(jb6.M0(2131754849, null));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z2 = true;
        } else {
            this.u0.setReaction(null);
            b48Var.setContentDescription(jb6.M0(2131754850, null));
            z2 = false;
        }
        if (this.t1 && z) {
            TL_stories.StoryItem storyItem3 = z48Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = z48Var.a.views;
            int i2 = storyViews.reactions_count;
            if (z2) {
                i = 1;
            } else {
                i = -1;
            }
            int i3 = i2 + i;
            storyViews.reactions_count = i3;
            if (i3 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = z48Var.a;
        n39.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        i1(true);
    }

    public final void F0() {
        s96 s96Var;
        boolean z;
        if (this.D3 == null) {
            oab oabVar = this.z0;
            if (oabVar != null && (s96Var = oabVar.B0) != null) {
                TLRPC.GroupCall groupCall = s96Var.s;
                if (groupCall == null) {
                    z = false;
                } else {
                    z = !groupCall.messages_enabled;
                }
                if (z) {
                    return;
                }
            }
            TLRPC.TL_channels_sendAsPeers K1 = oc7.r1(this.s2).K1(this.r1, true);
            this.D3 = K1;
            t38 t38Var = this.R1;
            if (t38Var != null && K1 != null) {
                t38Var.A2(true);
            }
        }
    }

    public final boolean G0() {
        t38 t38Var = this.R1;
        if (t38Var == null) {
            return false;
        }
        boolean z = t38Var.p3;
        if (z) {
            t38Var.Y1();
        }
        gm.d3(new h38(this, (byte) 3), 300L);
        return z;
    }

    public final void H0() {
        long j;
        k38 k38Var;
        CharSequence charSequence;
        int i;
        long j2;
        oc7.d1().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.R1.getTextWithEntities();
        long e = z8c.h(this.s2).e();
        TLRPC.Peer l = this.z0.B0.l();
        if (l != null) {
            e = pg3.n(l);
        }
        Context context = getContext();
        int i2 = this.s2;
        String r = pg3.r(i2, this.r1);
        long messageMinPrice = getMessageMinPrice();
        long j3 = this.A3;
        k38 k38Var2 = new k38(this, (byte) 1);
        r63 r63Var = new r63();
        my0 my0Var = new my0(1, (ylb) r63Var, context, false);
        my0Var.J();
        my0Var.w0 = false;
        LinearLayout i3 = hg9.i(context, 1);
        my0Var.O = i3;
        int[] iArr = oc7.r1(i2).T3;
        CharSequence j0 = k47.j0(textWithEntities, false, false, new TextPaint());
        if (j0 instanceof Spannable) {
            Spannable spannable = (Spannable) j0;
            j = j3;
            k38Var = k38Var2;
            charSequence = j0;
            i = ((gn[]) spannable.getSpans(0, j0.length(), gn.class)).length + ((dw3[]) spannable.getSpans(0, j0.length(), dw3.class)).length;
        } else {
            j = j3;
            k38Var = k38Var2;
            charSequence = j0;
            i = 0;
        }
        if (j <= 0) {
            j2 = 100;
        } else {
            j2 = j;
        }
        int max = (int) Math.max(messageMinPrice, j2);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length < 0) {
                break;
            }
            int i4 = length * 7;
            int i5 = iArr[i4];
            int[] iArr2 = iArr;
            int i6 = iArr2[i4 + 2];
            if (i <= iArr2[i4 + 3] && charSequence.length() <= i6) {
                max = Math.max(max, i5);
                break;
            } else {
                length--;
                iArr = iArr2;
            }
        }
        long[] jArr = {max};
        b61 b61Var = new b61(null, context, true);
        ?? obj = new Object();
        obj.c = e;
        obj.f = textWithEntities;
        obj.g = jArr[0];
        d96 d96Var = new d96(i2, context, true);
        LinearLayout i7 = hg9.i(context, 0);
        yd ydVar = new yd(context, jb6.M0(2131748571, null), r63Var);
        i7.addView(ydVar, qoe.q(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        yd ydVar2 = new yd(context, jb6.M0(2131748572, null), r63Var);
        i7.addView(ydVar2, qoe.q(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        yd ydVar3 = new yd(context, jb6.M0(2131748573, null), r63Var);
        i7.addView(ydVar3, qoe.q(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        ag5 ag5Var = new ag5(context, r63Var, r3);
        k38 k38Var3 = k38Var;
        qac[] qacVarArr = {new zf5(jArr, b61Var, new pn2[1], (i96) obj, d96Var, i2, ydVar, ydVar2, ydVar3, ag5Var, new boolean[]{true})};
        d96Var.set(obj);
        int i8 = 9;
        int[] iArr3 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int f = oc7.r1(i2).l4.L2.f();
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (true) {
            if (i9 >= i8) {
                break;
            }
            int[] iArr4 = iArr3;
            if (iArr3[i9] >= messageMinPrice) {
                if (i9 > 0 && arrayList.isEmpty() && iArr4[i9] > messageMinPrice) {
                    arrayList.add(Integer.valueOf((int) messageMinPrice));
                }
                int i10 = iArr4[i9];
                if (i10 > f) {
                    arrayList.add(Integer.valueOf(f));
                    break;
                }
                arrayList.add(Integer.valueOf(i10));
                if (iArr4[i9] == f) {
                    break;
                }
            }
            i9++;
            iArr3 = iArr4;
            i8 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) b10.f(1, arrayList)).intValue() < f) {
            arrayList.add(Integer.valueOf(f));
        }
        int[] iArr5 = new int[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            iArr5[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        ag5Var.f0 = iArr5;
        ag5Var.setValue((int) jArr[0]);
        i3.addView(ag5Var, qoe.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        qacVarArr[0].a(Integer.valueOf((int) jArr[0]));
        i3.addView(i7, qoe.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i12 = cmb.i5;
        TextView b = jxe.b(context, 20.0f, i12, true, r63Var);
        hg9.p(b, 17, null, 2131748568);
        i3.addView(b, qoe.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b2 = jxe.b(context, 14.0f, i12, false, r63Var);
        b2.setGravity(17);
        hg9.q(null, null, 2131748569, new Object[]{r}, b2);
        i3.addView(b2, qoe.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        i3.addView(d96Var, qoe.t(-2, -2, 17, 42, 22, 42, 20));
        i3.addView(b61Var, qoe.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        my0Var.show();
        b61Var.setOnClickListener(new jw4(k38Var3, jArr, my0Var, (byte) 3));
    }

    public final void I0() {
        z48 z48Var = this.E1;
        if (z48Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = z48Var.a.id;
        tL_stories_exportStoryLink.peer = oc7.r1(this.s2).i1(this.r1);
        ConnectionsManager.getInstance(this.s2).sendRequest(tL_stories_exportStoryLink, new Object());
    }

    public final void J0() {
        if (this.R1 == null) {
            return;
        }
        j0();
        this.y2.d2.h0();
        this.y2.t1(-1, true);
        e51 e51Var = this.y2;
        e51Var.T1 = this.r1;
        e51Var.Z0();
        this.y2.U0().setText(this.R1.getFieldText());
        ((fab) this.G1).h(this.y2);
    }

    public final void K0() {
        Bundle bundle = new Bundle();
        long j = this.r1;
        if (j < 0) {
            bundle.putLong("chat_id", -j);
        } else {
            bundle.putLong("user_id", j);
        }
        TLRPC.Dialog R0 = oc7.r1(this.s2).R0(this.r1);
        if (R0 != null) {
            bundle.putInt("message_id", R0.top_message);
        }
        this.z0.L(new yv1(bundle));
    }

    public final void L0(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a58.L0(long):void");
    }

    public final void M0() {
        z48 z48Var = this.E1;
        TL_stories.StoryItem storyItem = z48Var.a;
        if ((storyItem == null && z48Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File f = z48Var.f();
        boolean z = z48Var.e;
        if (f != null && f.exists()) {
            MediaController.d0(f.toString(), getContext(), z ? 1 : 0, null, null, new ra((byte) 4, this, z));
            return;
        }
        V0();
    }

    public final void N0(android.net.Uri r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a58.N0(android.net.Uri):void");
    }

    public final void O0(long j, boolean z) {
        int i;
        int i2;
        z48 z48Var;
        if (this.A1 != z) {
            this.A1 = z;
            s09 s09Var = this.p0;
            int i3 = 0;
            if (z) {
                if (this.z0.a && Build.VERSION.SDK_INT < 33) {
                    oab oabVar = ((fab) this.G1).d;
                    oabVar.l1 = true;
                    oabVar.U();
                    ei7 ei7Var = this.L3;
                    gm.r(ei7Var);
                    gm.d3(ei7Var, 100L);
                }
                L0(j);
                d1();
                s09Var.setAnimation(this.n1.u);
                this.A1 = true;
                this.e1.a.getImageReceiver().v0(true, true);
                if (this.E1.a != null) {
                    fc4.b("StoryViewer displayed story dialogId=" + this.r1 + " storyId=" + z48Var.a.id + " " + z48Var.d());
                }
            } else {
                f0();
                s09Var.a();
                this.b1 = null;
                this.B2 = false;
                this.E2.e(true, 0.0f);
                this.S0.invalidate();
                invalidate();
                g0();
                oab oabVar2 = ((fab) this.G1).d;
                oabVar2.I0 = false;
                oabVar2.U();
            }
            if (this.A1) {
                i = 3;
            } else {
                i = 2;
            }
            this.U0.T(i);
            if (this.A1) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            this.V0.T(i2);
            if (this.A1) {
                i3 = 2;
            }
            this.W0.T(i3);
            if (this.s1 || this.t1) {
                h4b h4bVar = this.I1;
                long j2 = this.r1;
                boolean z2 = this.A1;
                vh6 vh6Var = h4bVar.m;
                ihc ihcVar = (ihc) vh6Var.f(j2);
                if (ihcVar == null) {
                    ihcVar = new ihc(h4bVar.a, j2, h4bVar);
                    vh6Var.k(ihcVar, j2);
                }
                ihcVar.b(z2);
            }
        }
    }

    public final void P0(int i, long j) {
        if (this.r1 != j) {
            z48 z48Var = this.E1;
            z48Var.b = null;
            z48Var.a = null;
        }
        this.r1 = j;
        this.p1 = null;
        e0(i);
        TL_stories.PeerStories peerStories = this.z0.Q0;
        h4b h4bVar = this.I1;
        boolean z = true;
        if (peerStories != null) {
            h4bVar.U(peerStories, true);
            return;
        }
        TL_stories.PeerStories x = h4bVar.x(j);
        if (x == null) {
            x = h4bVar.y(j);
        } else {
            z = false;
        }
        h4bVar.U(x, z);
    }

    public final void R0(long j, boolean z, boolean z2) {
        String str;
        if (!z && j == this.B3 && this.C3 == z2) {
            return;
        }
        this.B3 = j;
        this.C3 = z2;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        x48 x48Var = this.e1;
        if (i >= 0) {
            if (this.s1 && !z2) {
                x48Var.b.l(jb6.M0(2131745375, null), false);
                x48Var.b.i(null);
                return;
            }
            TLRPC.User W1 = oc7.r1(this.s2).W1(Long.valueOf(j));
            if (W1 != null && W1.verified) {
                Drawable mutate = getContext().getDrawable(2131232811).mutate();
                mutate.setAlpha(255);
                sn2 sn2Var = new sn2(mutate, null);
                sn2Var.x = true;
                int L = gm.L(16.0f);
                int L2 = gm.L(16.0f);
                sn2Var.h = L;
                sn2Var.n = L2;
                x48Var.b.i(sn2Var);
            } else {
                x48Var.b.i(null);
            }
            if (W1 != null) {
                x48Var.b.l(gw3.m(gm.A2(bw2.p(W1)), x48Var.b.getPaint().getFontMetricsInt(), false, null, 0), false);
                return;
            }
            x48Var.b.l(null, false);
            return;
        }
        TLRPC.Chat L0 = oc7.r1(this.s2).L0(Long.valueOf(-j));
        dg0 dg0Var = x48Var.b;
        dg0 dg0Var2 = x48Var.b;
        if (L0 == null) {
            str = "";
        } else {
            str = L0.title;
        }
        dg0Var.l(gm.A2(str), false);
        if (L0 != null && L0.verified) {
            Drawable mutate2 = getContext().getDrawable(2131232811).mutate();
            mutate2.setAlpha(255);
            sn2 sn2Var2 = new sn2(mutate2, null);
            sn2Var2.x = true;
            int L3 = gm.L(16.0f);
            int L4 = gm.L(16.0f);
            sn2Var2.h = L3;
            sn2Var2.n = L4;
            dg0Var2.i(sn2Var2);
            return;
        }
        dg0Var2.i(null);
    }

    public final void S0(float f, float f2, o1a o1aVar) {
        this.c1 = f;
        this.q3 = 1.0f / f2;
        if (this.b1 != o1aVar) {
            this.b1 = o1aVar;
            if (o1aVar != null) {
                ImageReceiver imageReceiver = o1aVar.a;
                if (imageReceiver.n() != null) {
                    Bitmap copy = imageReceiver.n().copy(Bitmap.Config.ARGB_8888, false);
                    mm mmVar = this.U0;
                    mmVar.d0 = null;
                    mmVar.a1.setShader(null);
                    mmVar.u0(new BitmapDrawable(copy));
                }
            }
        }
    }

    public final void T0(boolean z) {
        boolean z2;
        z48 z48Var = this.E1;
        if (z48Var.a != null) {
            oab oabVar = this.z0;
            if (oabVar.f != null) {
                String b = z48Var.b();
                TLRPC.Chat chat = null;
                if (z) {
                    pv0 pv0Var = new pv0(this.r0, (byte) 5);
                    if (this.t1) {
                        chat = oc7.r1(this.s2).L0(Long.valueOf(-this.r1));
                    }
                    if (oc7.r1(this.s2).e5() && ((!this.t1 && !m9c.C(this.r1)) || sd2.t0(chat))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z38 z38Var = new z38(this, oabVar.f.getContext(), b, b, z2, pv0Var);
                    this.P2 = z38Var;
                    z38Var.d2 = true;
                    TL_stories.StoryItem storyItem = z48Var.a;
                    storyItem.dialogId = this.r1;
                    z38Var.A2 = storyItem;
                    z38Var.n2 = new k44(this, (byte) 23);
                    ((fab) this.G1).h(z38Var);
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", b);
                LaunchActivity.H1.startActivityForResult(Intent.createChooser(intent, jb6.M0(2131744535, null)), 500);
            }
        }
    }

    public final void U0() {
        g48 g48Var = this.S0;
        r63 r63Var = this.r0;
        new c41(g48Var, r63Var).t(jb6.M0(2131743520, null), r63Var).j();
    }

    public final void V0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.r0, getContext());
        String M0 = jb6.M0(2131689472, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
        heVar.U = jb6.M0(2131746951, null);
        ((fab) this.G1).h(heVar);
    }

    public final void W0(boolean z) {
        if (this.i3 != z) {
            z48 z48Var = this.E1;
            if (z48Var.a != null) {
                this.i3 = z;
                if (z) {
                    this.h3.setVisibility(0);
                }
                this.h3.setStoryItem(z48Var.a);
                oab oabVar = ((fab) this.G1).d;
                oabVar.p1 = z;
                oabVar.U();
                float f = 0.0f;
                if (z) {
                    float f2 = this.j3;
                    if (z) {
                        f = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                    this.h3.setTransitionProgress(this.j3);
                    ofFloat.addUpdateListener(new i38(this, (byte) 1));
                    ofFloat.addListener(new p38(this, z, (byte) 0));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(d53.g);
                    ofFloat.start();
                    return;
                }
                if (this.h3.getReactionsWindow() != null) {
                    this.h3.getReactionsWindow().e();
                }
                this.h3.animate().alpha(0.0f).setDuration(150L).setListener(new q38(this, (byte) 0)).start();
            }
        }
    }

    public final void X0(boolean z) {
        int i;
        if (this.w0 == null) {
            hg5 hg5Var = new hg5(getContext(), 1);
            hg5Var.n(1.0f, -56.0f);
            this.w0 = hg5Var;
            hg5Var.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
            this.S0.addView(this.w0, qoe.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        hg5 hg5Var2 = this.w0;
        if (z) {
            i = 2131744293;
        } else {
            i = 2131744143;
        }
        hg5Var2.t(jb6.M0(i, null));
        this.w0.v();
    }

    public final void Y0() {
        String str;
        u31 K;
        if (this.w1) {
            return;
        }
        if (this.u1) {
            if (this.y3 != null && this.z3 != null) {
                i46.n1(new qv0(this, (byte) 9), this.y3, this.z3, this.r1, true);
                return;
            }
            oab oabVar = this.z0;
            if (oabVar != null) {
                oabVar.k1 = true;
                oabVar.U();
            }
            oc7.r1(this.s2).F0().a(this.r1, new k38(this, (byte) 0));
            return;
        }
        t38 t38Var = this.R1;
        int i = -this.h1;
        this.h1 = i;
        gm.A3(i, t38Var, null);
        xx0.APP_ERROR.a();
        if (this.r1 >= 0) {
            str = m9c.r(oc7.r1(this.s2).W1(Long.valueOf(this.r1)));
        } else {
            str = "";
        }
        boolean H3 = oc7.r1(this.s2).H3();
        r63 r63Var = this.r0;
        g48 g48Var = this.S0;
        if (H3) {
            K = new c41(g48Var, r63Var).Q(2131624211, 36, gm.S2(jb6.a0(null, null, 2131743445, str)));
        } else {
            K = new c41(g48Var, r63Var).K(2131624211, gm.S2(jb6.a0(null, null, 2131743445, str)), jb6.M0(2131743446, null), new h38(this, (byte) 5));
        }
        K.j();
    }

    public final boolean Z0(boolean z) {
        if (this.z0.R0) {
            z = !z;
        }
        int i = this.z1;
        if (z) {
            if (i < getStoriesCount() - 1) {
                this.z1++;
                c1(false);
                return true;
            }
        } else if (i > 0) {
            this.z1 = i - 1;
            c1(false);
            return true;
        }
        return false;
    }

    public final void a0(boolean z) {
        a58 currentPeerView;
        q qVar = this.z2;
        if (qVar != null) {
            qVar.f(false);
        }
        long j = this.r1;
        TL_stories.StoryItem storyItem = this.E1.a;
        oab oabVar = this.z0;
        oabVar.getClass();
        if (j != 0 && storyItem != null) {
            oab.E1.remove(j + (j >> 16) + (storyItem.id << 16));
        }
        this.Y2 = true;
        eab eabVar = oabVar.o0;
        if (eabVar != null && (currentPeerView = eabVar.getCurrentPeerView()) != null) {
            currentPeerView.i0();
        }
        if (z) {
            u31 J = new c41(this.S0, this.r0).J(2131624029, jb6.M0(2131748240, null), jb6.M0(2131743236, null), 5000, false, new h38(this, (byte) 2));
            J.s = false;
            J.k(false);
        }
        oc7.r1(this.s2).p0(this.r1, 0, null);
    }

    public final void a1(long j) {
        String str;
        boolean z;
        TLRPC.User user;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.s2;
        if (i > 0) {
            TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(j));
            str = W1.first_name;
            z = W1.stories_hidden;
            user = W1;
        } else {
            TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-j));
            str = L0.title;
            z = L0.stories_hidden;
            user = L0;
        }
        gm.d3(new ut0(this, oc7.r1(this.s2), j, !z, str, user), 200L);
    }

    public final void b0() {
        m4b m4bVar = this.u0;
        m4bVar.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new ul(m4bVar, (byte) 1)).setDuration(150L).start();
        int L = gm.L(8.0f);
        m4b m4bVar2 = new m4b(getContext(), this.n1);
        this.u0 = m4bVar2;
        m4bVar2.setPadding(L, L, L, L);
        this.u0.setAlpha(0.0f);
        this.u0.setScaleX(0.8f);
        this.u0.setScaleY(0.8f);
        this.u0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.t0.addView(this.u0, qoe.e(40, 40, 3));
        this.g3 = false;
    }

    public final void b1() {
        if (!oc7.r1(this.s2).e5()) {
            return;
        }
        File f = this.E1.f();
        if (f != null && f.exists()) {
            z38 z38Var = this.P2;
            if (z38Var != null) {
                z38Var.dismiss();
            }
            gm.d3(new h38(this, (byte) 8), 120L);
            return;
        }
        V0();
    }

    public final void c0(boolean z) {
        float f;
        ValueAnimator valueAnimator = this.S3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = this.T3;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.S3 = ofFloat;
        ofFloat.addUpdateListener(new i38(this, (byte) 2));
        this.S3.addListener(new p38(this, z, (byte) 1));
        this.S3.setDuration(420L);
        this.S3.setInterpolator(d53.h);
        this.S3.start();
    }

    public final void c1(boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a58.c1(boolean):void");
    }

    public final void d0(Runnable runnable) {
        if (oc7.r1(this.s2).u2()) {
            h5.b(this.s2);
            return;
        }
        int i = gda.b0;
        if (i > 0 && this.a3) {
            int i2 = i - 1;
            gda.b0 = i2;
            gda.Q(i2);
            he heVar = new he(0, this.r0, getContext());
            heVar.setTitle(jb6.M0(2131744574, null));
            heVar.m(jb6.M0(2131744575, null));
            String M0 = jb6.M0(2131746478, null);
            cf cfVar = new cf(runnable, (byte) 15);
            heVar.m0 = M0;
            heVar.n0 = cfVar;
            String M02 = jb6.M0(2131752542, null);
            bh7 bh7Var = new bh7((byte) 27);
            heVar.o0 = M02;
            heVar.p0 = bh7Var;
            heVar.show();
            return;
        }
        runnable.run();
    }

    public final void d1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a58.d1():void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        float f;
        s96 s96Var;
        boolean z;
        int i3 = nm7.z5;
        long j = 0;
        oab oabVar = this.z0;
        boolean z2 = false;
        if (i != i3 && (i != nm7.B5 || oabVar.O0 != objArr[0])) {
            if (i == nm7.o3) {
                c1(false);
                return;
            } else if (i == nm7.m4) {
                this.A0.b0.invalidate();
                return;
            } else if (i == nm7.H5) {
                h0(true);
                return;
            } else if (i == nm7.d3) {
                xy n = oc7.r1(this.s2).N1().n();
                if (n != null && n.a(this.s2, 1) && this.G1 != null) {
                    qv0 qv0Var = new qv0(this, (byte) 9);
                    Context W = gm.W(getContext());
                    if (W == null) {
                        W = LaunchActivity.H1;
                    }
                    ((fab) this.G1).h(new i46(n.b(), this.s2, null, W, qv0Var));
                    return;
                }
                return;
            } else if (i == nm7.k3) {
                TL_account.RequirementToContact L2 = oc7.r1(this.s2).L2(this.r1);
                if (this.r1 >= 0 && !z8c.h(this.s2).p() && (L2 instanceof TL_account.requirementToContactPremium)) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.v1 != z || this.x1 != pg3.j(L2)) {
                    this.v1 = z;
                    this.x1 = pg3.j(L2);
                    c1(false);
                    h0(true);
                    return;
                }
                return;
            } else if (i == nm7.T) {
                Object obj = objArr[0];
                if ((obj instanceof TLRPC.ChatFull) && this.r1 == (-((TLRPC.ChatFull) obj).id)) {
                    c1(false);
                    return;
                }
                return;
            } else if (i == nm7.G2) {
                long longValue = ((Long) objArr[0]).longValue();
                if (oabVar != null && (s96Var = oabVar.B0) != null && s96Var.j() == longValue) {
                    c1(false);
                    t38 t38Var = this.R1;
                    if (t38Var != null) {
                        t38Var.M(true);
                        this.R1.A2(true);
                        h0(true);
                    }
                    n38 n38Var = this.B0;
                    if (n38Var != null) {
                        s96 s96Var2 = n38Var.Q;
                        if (s96Var2 != null) {
                            j = s96Var2.m();
                        }
                        if (n38Var.I != j) {
                            n38Var.e.O(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i == nm7.E && ((Boolean) objArr[2]).booleanValue()) {
                F0();
                return;
            } else {
                return;
            }
        }
        w48 w48Var = this.G1;
        if (w48Var == null || !((fab) w48Var).d.H0) {
            if (this.A1) {
                h1();
                if (this.q1 == 0) {
                    if (!this.u2) {
                        this.u2 = true;
                        ((fab) this.G1).j();
                        return;
                    }
                    return;
                }
                int i4 = this.z1;
                ArrayList arrayList = this.l1;
                int size = arrayList.size();
                ArrayList arrayList2 = this.m1;
                if (i4 >= arrayList2.size() + size) {
                    this.z1 = (arrayList2.size() + arrayList.size()) - 1;
                }
                c1(false);
                if (this.s1 || this.t1) {
                    i1(true);
                }
            }
            TL_stories.PeerStories peerStories = oabVar.Q0;
            if (peerStories != null) {
                this.I1.U(peerStories, true);
            } else {
                long j2 = this.r1;
                if (j2 != 0) {
                    h4b h4bVar = this.I1;
                    TL_stories.PeerStories x = h4bVar.x(j2);
                    if (x == null) {
                        x = h4bVar.y(j2);
                        z2 = true;
                    }
                    h4bVar.U(x, z2);
                }
            }
            a8 a8Var = this.i1;
            if (a8Var != null) {
                ViewPropertyAnimator animate = a8Var.animate();
                if (this.I1.L(this.r1) && this.E1.e && !gda.b()) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                animate.alpha(f).start();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        px1 px1Var;
        Canvas canvas2;
        ho hoVar;
        ho hoVar2;
        j1();
        if (this.t1 && (hoVar2 = this.G0) != null) {
            hoVar2.setBounds(0, 0, getMeasuredWidth(), gm.L(40.0f));
        }
        if (this.t1 && (hoVar = this.H0) != null) {
            hoVar.setBounds(0, 0, getMeasuredWidth(), gm.L(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z = this.k3;
        LinearLayout linearLayout = this.E0;
        b48 b48Var = this.t0;
        if (z) {
            float measuredWidth = (b48Var.getMeasuredWidth() / 2.0f) + b48Var.getX() + linearLayout.getX();
            float measuredHeight = (b48Var.getMeasuredHeight() / 2.0f) + b48Var.getY() + linearLayout.getY();
            int L = gm.L(24.0f);
            float f = L / 2.0f;
            float R1 = gm.R1(this.m3, measuredWidth - f, d53.g.getInterpolation(this.l3));
            float R12 = gm.R1(this.n3, measuredHeight - f, this.l3);
            int U1 = gm.U1(this.l3, this.o3, L);
            if (this.f3) {
                vm vmVar = this.e3;
                if (vmVar != null) {
                    float f2 = U1;
                    vmVar.setBounds((int) R1, (int) R12, (int) (R1 + f2), (int) (R12 + f2));
                    this.e3.draw(canvas);
                }
            } else {
                float f3 = U1;
                ImageReceiver imageReceiver = this.d3;
                imageReceiver.i0(R1, R12, f3, f3);
                imageReceiver.h(canvas, null);
            }
        }
        if (this.g3) {
            float measuredWidth2 = (b48Var.getMeasuredWidth() / 2.0f) + b48Var.getX() + linearLayout.getX();
            float measuredHeight2 = (b48Var.getMeasuredHeight() / 2.0f) + b48Var.getY() + linearLayout.getY();
            int L2 = gm.L(120.0f);
            if (!this.f3) {
                float f4 = L2;
                float f5 = f4 / 2.0f;
                float f6 = measuredWidth2 - f5;
                float f7 = measuredHeight2 - f5;
                ImageReceiver imageReceiver2 = this.b3;
                imageReceiver2.i0(f6, f7, f4, f4);
                imageReceiver2.h(canvas, null);
                if (imageReceiver2.y() != null && imageReceiver2.y().v()) {
                    this.g3 = false;
                }
            } else {
                xm xmVar = this.c3;
                if (xmVar != null) {
                    float f8 = L2 / 2.0f;
                    xmVar.e((int) (measuredWidth2 - f8), (int) (measuredHeight2 - f8), (int) (measuredWidth2 + f8), (int) (measuredHeight2 + f8));
                    this.c3.b(canvas);
                    if (this.c3.c()) {
                        this.c3.d(this);
                        this.c3 = null;
                        this.g3 = false;
                    }
                } else {
                    this.g3 = false;
                }
            }
        }
        t38 t38Var = this.R1;
        if (t38Var != null) {
            px1 px1Var2 = t38Var.o2;
            px1 px1Var3 = t38Var.p2;
            if (t38Var.getAlpha() != 0.0f && (px1Var = t38Var.f1) != null && px1Var.getParent() != null && t38Var.f1.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(t38Var.f1.getX() + px1Var2.getX() + px1Var3.getX() + t38Var.getX(), t38Var.f1.getY() + px1Var2.getY() + px1Var3.getY() + t38Var.getY());
                if (t38Var.getAlpha() != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, t38Var.getMeasuredWidth(), t38Var.getMeasuredHeight(), (int) (t38Var.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                t38Var.f1.draw(canvas2);
                canvas2.restoreToCount(save);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        v29 v29Var;
        v29 v29Var2;
        nz4 nz4Var;
        float L;
        float f;
        if (view == this.T2) {
            canvas.save();
            canvas.clipRect(0.0f, this.T2.getY(), getMeasuredWidth(), this.T2.getY() + this.T2.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        t38 t38Var = this.R1;
        Paint paint = this.d2;
        b48 b48Var = this.t0;
        y48 y48Var = this.n1;
        if (view == t38Var) {
            float f2 = this.g2;
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            z48 z48Var = this.E1;
            if (i > 0 && !z48Var.f) {
                y48Var.l.setAlpha((int) (f2 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), y48Var.l);
            }
            RectF rectF = y48Var.h;
            RectF rectF2 = y48Var.i;
            RectF rectF3 = y48Var.j;
            rectF.set(this.R1.getX(), this.R1.getY() + this.R1.getAnimatedTop() + gm.L(1.33f), this.R1.getX() + this.R1.getMeasuredWidth(), this.R1.getY() + this.R1.getMeasuredHeight());
            float L2 = gm.L(40.0f);
            if (!z48Var.f) {
                if (this.I2) {
                    L2 += gm.L(46.0f);
                }
                if (this.J2 && this.t1) {
                    L2 += gm.L(46.0f);
                }
                if (b48Var != null && b48Var.getVisibility() == 0) {
                    L2 = (L2 - gm.L(40.0f)) + b48Var.getLayoutParams().width;
                }
                L = 0.0f;
            } else {
                L = gm.L(46.0f);
                L2 = gm.L(46.0f);
                nj7 nj7Var = this.Q1;
                if (nj7Var != null && nj7Var.getVisibility() == 0) {
                    L2 += gm.L(46.0f);
                }
            }
            rectF2.set(gm.L(10.0f) + L, ((this.R1.getY() + this.R1.getMeasuredHeight()) - gm.L(5.0f)) - gm.L(38.0f), (getMeasuredWidth() - gm.L(10.0f)) - L2, (this.R1.getY() + this.R1.getMeasuredHeight()) - gm.L(5.0f));
            this.R1.setTranslationX((1.0f - this.g2) * L);
            if (this.R1.getMeasuredHeight() > gm.L(50.0f)) {
                f = ((1.0f - this.g2) * (this.R1.getMeasuredHeight() - gm.L(50.0f))) + 0.0f;
            } else {
                f = 0.0f;
            }
            this.R1.getEditField().setTranslationY(td4.A(1.0f, this.g2, -gm.L(2.0f), f));
            float L3 = gm.L(50.0f) / 2.0f;
            gm.X1(rectF2, y48Var.h, this.g2, rectF3);
            im0 im0Var = this.b2;
            if (im0Var != null) {
                im0Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                im0Var.r(L3);
                im0Var.setAlpha((int) ((1.0f - this.T3) * (1.0f - this.h2) * 255.0f * getHideInterfaceAlpha()));
                im0Var.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, L3, L3, paint);
            }
            if (this.g2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild2;
            }
        } else if (t38Var != null && t38Var.S0(view)) {
            float L4 = gm.L(30.0f);
            RectF rectF4 = y48Var.k;
            RectF rectF5 = y48Var.k;
            rectF4.set(0.0f, view.getY() + gm.L(1.0f), getWidth(), gm.L(20.0f) + getHeight());
            Path path = this.Q3;
            path.rewind();
            path.addRoundRect(rectF5, L4, L4, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            im0 im0Var2 = this.c2;
            if (im0Var2 != null) {
                im0Var2.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                im0Var2.s(L4, L4, L4, L4);
                im0Var2.setAlpha(255);
                im0Var2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF5, L4, L4, paint);
            }
            boolean drawChild3 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild3;
        } else {
            if (view == this.V1 && this.R1 != null) {
                view.setTranslationY(((this.R1.getY() + this.R1.getAnimatedTop()) + (-v29Var.getMeasuredHeight())) - gm.L(18.0f));
            } else {
                if (view == this.h3) {
                    view.setTranslationY((this.E0.getY() + (b48Var.getY() + (-(v29Var2.getMeasuredHeight() - this.h3.getPaddingBottom())))) - gm.L(18.0f));
                } else {
                    g48 g48Var = this.S0;
                    if (view == g48Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (nz4Var = this.w3) != null && !nz4Var.r) {
                        RecordingCanvas i2 = nz4Var.i(getMeasuredWidth(), getMeasuredHeight());
                        i2.drawColor(on2.f(0.2f, -16777216, -1));
                        i2.translate(g48Var.getX(), g48Var.getY());
                        view.draw(i2);
                        nz4Var.j();
                    }
                }
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e0(int i) {
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        this.u2 = false;
        this.L2 = true;
        this.r3 = false;
        this.t1 = false;
        this.u1 = false;
        long j = this.r1;
        int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        x48 x48Var = this.e1;
        pc0 pc0Var = this.d1;
        if (i4 >= 0) {
            if (j == z8c.h(this.s2).e()) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.s1 = z5;
            TLRPC.User W1 = oc7.r1(this.s2).W1(Long.valueOf(this.r1));
            TL_account.RequirementToContact L2 = oc7.r1(this.s2).L2(this.r1);
            if (!z8c.h(this.s2).p() && (L2 instanceof TL_account.requirementToContactPremium)) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.v1 = z6;
            this.x1 = pg3.j(L2);
            pc0Var.q(W1);
            x48Var.a.getImageReceiver().U(W1, pc0Var, null);
            R0(this.r1, true, false);
        } else {
            this.s1 = false;
            this.t1 = true;
            if (!this.I1.g(j)) {
                boolean z7 = e21.a;
            } else {
                this.r3 = true;
            }
            TLRPC.Chat L0 = oc7.r1(this.s2).L0(Long.valueOf(-this.r1));
            boolean V = sd2.V(L0);
            this.u1 = !V;
            if (!V && oc7.r1(this.s2).M0(-this.r1) == null) {
                cf7.Y(this.s2).C0(-this.r1, true, new CountDownLatch(1), false, false, 0);
            }
            if (this.u1 && !sd2.q(L0)) {
                z = true;
            } else {
                z = false;
            }
            this.v1 = z;
            this.x1 = oc7.r1(this.s2).L1(this.r1);
            pc0Var.p(L0);
            x48Var.a.getImageReceiver().U(L0, pc0Var, null);
            R0(this.r1, true, false);
        }
        if (this.A1 && (this.s1 || this.t1)) {
            h4b h4bVar = this.I1;
            long j2 = this.r1;
            vh6 vh6Var = h4bVar.m;
            ihc ihcVar = (ihc) vh6Var.f(j2);
            if (ihcVar == null) {
                ihcVar = new ihc(h4bVar.a, j2, h4bVar);
                vh6Var.k(ihcVar, j2);
            }
            ihcVar.b(true);
        }
        h1();
        this.z1 = i;
        if (i < 0) {
            this.z1 = 0;
        }
        this.M0 = 0L;
        this.O0 = false;
        this.y3 = null;
        this.z3 = null;
        boolean z8 = this.t1;
        g48 g48Var = this.S0;
        oab oabVar = this.z0;
        int i5 = 8;
        z48 z48Var = this.E1;
        if (z8) {
            r0();
            if (this.R1 == null && (this.u1 || z48Var.f)) {
                l0();
            }
            if (this.R1 != null) {
                TLRPC.Chat L02 = oc7.r1(this.s2).L0(Long.valueOf(-this.r1));
                t38 t38Var = this.R1;
                if (z48Var.f || (!A0() && this.u1 && (sd2.q(L02) || sd2.s0(L02)))) {
                    i5 = 0;
                }
                t38Var.setVisibility(i5);
                t38 t38Var2 = this.R1;
                boolean z9 = z48Var.f;
                v0(true);
                t38Var2.M1(z9);
                t38 t38Var3 = this.R1;
                if (z48Var.f && !v0(true) && (this.l2 || this.R1.X0)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                t38Var3.T1(z4, true);
                qu3 editField = this.R1.getEditField();
                long j3 = this.r1;
                TL_stories.StoryItem storyItem = z48Var.a;
                oabVar.getClass();
                editField.setText(oab.x(j3, storyItem));
                this.R1.F1(this.s2, this.r1);
                this.R1.v2(L02, null);
            }
            ho hoVar = this.G0;
            r63 r63Var = this.r0;
            if (hoVar == null) {
                ho hoVar2 = new ho(false, false, false);
                this.G0 = hoVar2;
                b48 b48Var = this.t0;
                hoVar2.setCallback(b48Var);
                this.G0.u(r63Var.h(cmb.F6));
                this.G0.w(gm.L(14.0f));
                this.I0 = new ln(b48Var);
            }
            b48 b48Var2 = this.F0;
            if (b48Var2 != null && this.H0 == null) {
                ho hoVar3 = new ho(false, false, false);
                this.H0 = hoVar3;
                hoVar3.setCallback(b48Var2);
                this.H0.u(r63Var.h(cmb.F6));
                this.H0.w(gm.L(14.0f));
                this.J0 = new ln(b48Var2);
            }
            if (i == -1) {
                f1();
            }
            c1(false);
            this.q1 = getStoriesCount();
            g48Var.invalidate();
            invalidate();
        } else if (this.s1) {
            r0();
            boolean z10 = z48Var.f;
            b48 b48Var3 = this.M1;
            if (z10) {
                b48Var3.setVisibility(8);
                if (this.R1 == null) {
                    l0();
                }
                this.R1.setVisibility(0);
            } else {
                b48Var3.setVisibility(0);
                t38 t38Var4 = this.R1;
                if (t38Var4 != null) {
                    t38Var4.setVisibility(8);
                }
            }
            t38 t38Var5 = this.R1;
            if (t38Var5 != null) {
                boolean z11 = z48Var.f;
                v0(true);
                t38Var5.M1(z11);
                t38 t38Var6 = this.R1;
                if (z48Var.f && !v0(true) && (this.l2 || this.R1.X0)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                t38Var6.T1(z3, true);
            }
            if (i == -1) {
                ArrayList arrayList = this.p1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(oabVar.P0));
                    if (indexOf < 0 && !this.p1.isEmpty()) {
                        if (oabVar.P0 > ((Integer) this.p1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (oabVar.P0 < ((Integer) b10.f(1, this.p1)).intValue()) {
                            indexOf = this.p1.size() - 1;
                        }
                    }
                    this.z1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.m1.isEmpty();
                    ArrayList arrayList2 = this.l1;
                    if (!isEmpty) {
                        this.z1 = arrayList2.size();
                    } else {
                        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i6)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i6)).id > this.I1.f.get(this.r1)) {
                                this.z1 = i6;
                                break;
                            }
                        }
                    }
                }
            }
            c1(false);
            g48Var.invalidate();
            invalidate();
        } else {
            if (this.R1 == null) {
                l0();
            }
            if (this.v1 && this.W1 == null) {
                p0();
            }
            if (this.W1 != null) {
                if (this.v1 || this.w1) {
                    e1();
                }
                LinearLayout linearLayout = this.W1;
                if ((this.v1 && !z48Var.f) || this.w1) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                linearLayout.setVisibility(i3);
            }
            h6b h6bVar = this.Z1;
            if (h6bVar != null) {
                h6bVar.setVisibility(8);
            }
            if (i == -1) {
                f1();
            }
            c1(false);
            t38 t38Var7 = this.R1;
            if (t38Var7 != null) {
                if (!A0() && !m9c.C(this.r1)) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                t38Var7.setVisibility(i2);
                t38 t38Var8 = this.R1;
                boolean z12 = z48Var.f;
                v0(true);
                t38Var8.M1(z12);
                t38 t38Var9 = this.R1;
                if (z48Var.f && !v0(true) && (this.l2 || this.R1.X0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                t38Var9.T1(z2, true);
                qu3 editField2 = this.R1.getEditField();
                long j4 = this.r1;
                TL_stories.StoryItem storyItem2 = z48Var.a;
                oabVar.getClass();
                editField2.setText(oab.x(j4, storyItem2));
                this.R1.F1(this.s2, this.r1);
                TLRPC.UserFull X1 = oc7.r1(this.s2).X1(this.r1);
                if (X1 != null) {
                    this.R1.v2(null, X1);
                } else {
                    oc7.r1(this.s2).b3(oc7.r1(this.s2).W1(Long.valueOf(this.r1)), this.p2, false, null);
                }
            }
            this.q1 = getStoriesCount();
            b48 b48Var4 = this.M1;
            if (b48Var4 != null) {
                b48Var4.setVisibility(8);
            }
            g48Var.invalidate();
            invalidate();
        }
        h0(false);
    }

    public final void e1() {
        int i;
        boolean z = this.w1;
        TextView textView = this.X1;
        if (z) {
            if (textView != null) {
                textView.setText(jb6.M0(2131748580, null));
            }
            TextView textView2 = this.Y1;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        if (textView != null) {
            if (this.u1) {
                i = 2131744351;
            } else {
                i = 2131744179;
            }
            textView.setText(jb6.M0(i, null));
        }
        TextView textView3 = this.Y1;
        if (textView3 != null) {
            textView3.setVisibility(0);
            this.Y1.setText(jb6.M0(2131744178, null));
        }
    }

    public final void f0() {
        l48 l48Var = this.A0;
        if (l48Var.W.w()) {
            l48Var.W.e(false);
        }
    }

    public final void f1() {
        TL_stories.PeerStories peerStories;
        int i;
        ArrayList arrayList = this.p1;
        oab oabVar = this.z0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.m1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i = arrayList2.size();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    long j = ((g4b) arrayList2.get(i2)).a;
                    if (((int) (j ^ (j >>> 32))) == oabVar.P0) {
                        this.z1 = i2;
                        return;
                    }
                }
            } else {
                i = 0;
            }
            int indexOf = this.p1.indexOf(Integer.valueOf(oabVar.P0));
            if (indexOf < 0 && !this.p1.isEmpty()) {
                if (oabVar.P0 > ((Integer) this.p1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (oabVar.P0 < ((Integer) b10.f(1, this.p1)).intValue()) {
                    indexOf = this.p1.size() - 1;
                }
            }
            this.z1 = i + indexOf;
        } else {
            int i3 = oabVar.e1.get(this.r1, -1);
            this.z1 = i3;
            if (i3 == -1 && !oabVar.N0 && (peerStories = this.k1) != null && peerStories.max_read_id > 0) {
                int i4 = 0;
                while (true) {
                    ArrayList arrayList3 = this.l1;
                    if (i4 >= arrayList3.size()) {
                        break;
                    } else if (((TL_stories.StoryItem) arrayList3.get(i4)).id > this.k1.max_read_id) {
                        this.z1 = i4;
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        if (this.z1 == -1) {
            this.z1 = 0;
        }
    }

    public final void g0() {
        if (this.A1) {
            ((fab) this.G1).d.U();
        }
    }

    public final void g1(boolean z) {
        a8 a8Var = this.t3;
        if (a8Var != null && this.s3 != null && a8Var.getVisibility() == 0) {
            if (z) {
                if (Math.abs(oab.B1 - 0.2f) < 0.05f) {
                    this.t3.setSubtext(jb6.M0(2131743258, null));
                } else if (Math.abs(oab.B1 - 0.5f) < 0.05f) {
                    this.t3.setSubtext(jb6.M0(2131743260, null));
                } else if (Math.abs(oab.B1 - 1.0f) < 0.05f) {
                    this.t3.setSubtext(jb6.M0(2131743261, null));
                } else if (Math.abs(oab.B1 - 1.5f) < 0.05f) {
                    this.t3.setSubtext(jb6.M0(2131743262, null));
                } else {
                    int i = (Math.abs(oab.B1 - 2.0f) > 0.05f ? 1 : (Math.abs(oab.B1 - 2.0f) == 0.05f ? 0 : -1));
                    a8 a8Var2 = this.t3;
                    if (i < 0) {
                        a8Var2.setSubtext(jb6.M0(2131743259, null));
                    } else {
                        a8Var2.setSubtext(jb6.a0(null, null, 2131743263, dna.a(oab.B1).concat("x")));
                    }
                }
            }
            this.s3.B0(z, oab.B1);
        }
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.p1;
    }

    public long getCurrentPeer() {
        return this.r1;
    }

    public int getListPosition() {
        return this.B1;
    }

    public Bitmap getPlayingBitmap() {
        g48 g48Var = this.S0;
        Bitmap createBitmap = Bitmap.createBitmap(g48Var.getWidth(), g48Var.getHeight(), Bitmap.Config.ARGB_8888);
        w0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.z1;
    }

    public h4b getStoriesController() {
        return oc7.r1(this.s2).N1();
    }

    public int getStoriesCount() {
        return Math.max(this.t2, this.l1.size()) + this.m1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.l1;
    }

    public final void h0(boolean z) {
        int i;
        if (this.R1 != null && this.V2 && this.Q0) {
            h38 h38Var = this.E3;
            gm.r(h38Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.I1.B;
            this.R1.M(true);
            boolean z2 = this.v1;
            z48 z48Var = this.E1;
            if ((z2 && !z48Var.f) || this.w1) {
                this.a3 = false;
                this.R1.setEnabled(false);
                this.R1.O1(" ", z);
            } else if (this.x1 > 0) {
                this.a3 = false;
                this.R1.setEnabled(true);
                this.R1.O1(nxa.T0(jb6.a0(null, null, 2131743613, jb6.E(this.x1, ','))), z);
            } else {
                if (!z48Var.f && tL_storiesStealthMode != null) {
                    int currentTime = ConnectionsManager.getInstance(this.s2).getCurrentTime();
                    int i2 = tL_storiesStealthMode.active_until_date;
                    if (currentTime < i2) {
                        this.a3 = true;
                        int currentTime2 = i2 - ConnectionsManager.getInstance(this.s2).getCurrentTime();
                        int i3 = currentTime2 / 60;
                        int i4 = currentTime2 % 60;
                        Locale locale = Locale.US;
                        String a0 = jb6.a0(null, null, 2131744577, String.format(locale, "%02d:%02d", 99, 99));
                        this.R1.setEnabled(true);
                        int i5 = ((((int) this.R1.getEditField().getPaint().measureText(a0)) * 1.2f) > this.R1.getEditField().getMeasuredWidth() ? 1 : ((((int) this.R1.getEditField().getPaint().measureText(a0)) * 1.2f) == this.R1.getEditField().getMeasuredWidth() ? 0 : -1));
                        t38 t38Var = this.R1;
                        if (i5 >= 0) {
                            String a02 = jb6.a0(null, null, 2131744577, "");
                            String format = String.format(locale, "%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i4));
                            t38Var.e = a02;
                            t38Var.f = format;
                            t38Var.r2(z);
                        } else {
                            t38Var.O1(jb6.a0(null, null, 2131744578, String.format(locale, "%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i4))), z);
                        }
                        gm.d3(h38Var, 1000L);
                        return;
                    }
                }
                this.a3 = false;
                this.R1.setEnabled(true);
                boolean z3 = z48Var.f;
                t38 t38Var2 = this.R1;
                if (z3) {
                    long starsPrice = t38Var2.getStarsPrice();
                    int i6 = (starsPrice > 0L ? 1 : (starsPrice == 0L ? 0 : -1));
                    t38 t38Var3 = this.R1;
                    if (i6 > 0) {
                        t38Var3.O1(nxa.Z0(false, jb6.a0(null, null, 2131751941, jb6.E((int) starsPrice, ',')), this.R1.S6), z);
                        pn2 pn2Var = this.R1.S6[0];
                        if (pn2Var != null) {
                            pn2Var.H = 0.9f;
                            return;
                        }
                        return;
                    }
                    t38Var3.O1(jb6.M0(2131751942, null), z);
                    return;
                }
                if (this.u1) {
                    i = 2131745983;
                } else {
                    i = 2131745988;
                }
                t38Var2.O1(jb6.M0(i, null), z);
            }
        }
    }

    public final void h1() {
        TL_stories.PeerStories x;
        z3b z3bVar;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.l1;
        arrayList.clear();
        oab oabVar = this.z0;
        if (oabVar.N0) {
            if (!oabVar.S0) {
                arrayList.add(oabVar.T0);
            }
        } else {
            ArrayList arrayList2 = this.p1;
            int i = 0;
            ArrayList arrayList3 = this.m1;
            if (arrayList2 != null && (z3bVar = oabVar.O0) != null) {
                if (z3bVar instanceof t3b) {
                    arrayList3.clear();
                    ArrayList E = oc7.r1(this.s2).N1().E(this.r1);
                    String str = ((t3b) oabVar.O0).E;
                    if (E != null) {
                        for (int i2 = 0; i2 < E.size(); i2++) {
                            g4b g4bVar = (g4b) E.get(i2);
                            g6b g6bVar = g4bVar.c;
                            if (g6bVar != null && !g6bVar.g && TextUtils.equals(g6bVar.K0, str)) {
                                arrayList3.add(g4bVar);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.p1;
                int size = arrayList4.size();
                while (i < size) {
                    Object obj = arrayList4.get(i);
                    i++;
                    k47 f = oabVar.O0.f(((Integer) obj).intValue());
                    if (f != null && (storyItem = f.l) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (oabVar.O0 != null) {
                while (i < oabVar.O0.i.size()) {
                    arrayList.add(((k47) oabVar.O0.i.get(i)).l);
                    i++;
                }
            } else {
                TL_stories.PeerStories peerStories = oabVar.Q0;
                if (peerStories != null && pg3.n(peerStories.peer) == this.r1) {
                    x = oabVar.Q0;
                    this.k1 = x;
                } else {
                    x = this.I1.x(this.r1);
                    this.k1 = x;
                    if (x == null) {
                        x = this.I1.y(this.r1);
                        this.k1 = x;
                    }
                }
                this.t2 = 0;
                if (x != null) {
                    this.t2 = x.stories.size();
                    arrayList.addAll(this.k1.stories);
                }
                arrayList3.clear();
                ArrayList E2 = this.I1.E(this.r1);
                if (E2 != null) {
                    arrayList3.addAll(E2);
                }
            }
        }
        this.q1 = getStoriesCount();
    }

    public final boolean i0() {
        if (this.i3) {
            if (this.h3.getReactionsWindow() != null) {
                int i = this.o2;
                v29 v29Var = this.h3;
                if (i > 0) {
                    gm.t1(v29Var.getReactionsWindow().c);
                    return true;
                }
                v29Var.getReactionsWindow().d();
                return true;
            }
            W0(false);
            return true;
        }
        e48 e48Var = this.Z0;
        if (e48Var != null) {
            hg5 hg5Var = e48Var.c;
            if (hg5Var != null) {
                hg5Var.f(true);
                e48Var.c = null;
            }
            e48Var.b = null;
            e48Var.invalidate();
            e48Var.b(false);
        }
        l48 l48Var = this.A0;
        if (l48Var.W.w()) {
            l48Var.W.e(false);
            return true;
        }
        hg5 hg5Var2 = this.v0;
        if (hg5Var2 != null) {
            hg5Var2.f(true);
        }
        hg5 hg5Var3 = this.w0;
        if (hg5Var3 != null) {
            hg5Var3.f(true);
        }
        ig5 ig5Var = this.M2;
        if (ig5Var != null) {
            ig5Var.a();
        }
        v48 v48Var = this.j1;
        if (v48Var != null && v48Var.a) {
            v48Var.a();
            return true;
        }
        t38 t38Var = this.R1;
        if (t38Var != null && t38Var.T0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.r0, getContext());
            boolean z = this.R1.d1;
            he heVar = alertDialog$Builder.a;
            if (z) {
                heVar.S = jb6.M0(2131751332, null);
                heVar.U = jb6.M0(2131751333, null);
            } else {
                heVar.S = jb6.M0(2131751329, null);
                heVar.U = jb6.M0(2131751330, null);
            }
            alertDialog$Builder.j(jb6.M0(2131751331, null), new e38(this, (byte) 0));
            alertDialog$Builder.g(jb6.M0(2131751708, null), null);
            ((fab) this.G1).h(heVar);
            return true;
        }
        v29 v29Var2 = this.V1;
        if (v29Var2 != null && v29Var2.getReactionsWindow() != null && !this.V1.getReactionsWindow().q) {
            this.V1.getReactionsWindow().d();
            return true;
        }
        t38 t38Var2 = this.R1;
        if (t38Var2 != null && t38Var2.R0()) {
            int i2 = this.o2;
            t38 t38Var3 = this.R1;
            if (i2 > 0) {
                gm.t1(t38Var3.getEmojiView());
                return true;
            }
            t38Var3.K0(true, false, true);
            return true;
        } else if (getKeyboardHeight() >= gm.L(20.0f)) {
            t38 t38Var4 = this.R1;
            if (t38Var4 != null) {
                long j = this.r1;
                TL_stories.StoryItem storyItem = this.E1.a;
                Editable editText = t38Var4.getEditText();
                this.z0.getClass();
                oab.N(j, storyItem, editText);
            }
            gm.t1(this.R1);
            return true;
        } else if (l48Var.getVisibility() != 0 || l48Var.getProgressToBlackout() <= 0.0f) {
            return false;
        } else {
            l48Var.D();
            this.W2 = false;
            this.S0.invalidate();
            return true;
        }
    }

    public final void i1(boolean z) {
        String M0;
        int i;
        h02 h02Var;
        boolean z2;
        String M02;
        float f;
        float f2;
        float f3;
        boolean z3;
        int i2;
        boolean z4;
        z48 z48Var = this.E1;
        TL_stories.StoryItem storyItem = z48Var.a;
        if (storyItem == null) {
            storyItem = z48Var.c;
        }
        boolean z5 = this.t1;
        if (z5 || this.s1) {
            if (storyItem != null) {
                TL_stories.StoryViews storyViews = storyItem.views;
                oab oabVar = this.z0;
                b48 b48Var = this.t0;
                if (z5) {
                    if (storyViews == null) {
                        storyViews = new TL_stories.TL_storyViews();
                        storyItem.views = storyViews;
                    }
                    if (storyViews.views_count <= 0) {
                        storyViews.views_count = 1;
                    }
                    ho hoVar = this.H0;
                    if (hoVar != null && (i2 = storyViews.forwards_count) > 0) {
                        String num = Integer.toString(i2);
                        if (z && this.L0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        hoVar.t(num, z4, true);
                        this.L0 = true;
                    } else {
                        this.L0 = false;
                    }
                    int i3 = storyItem.views.reactions_count;
                    if (i3 > 0) {
                        ho hoVar2 = this.G0;
                        String num2 = Integer.toString(i3);
                        if (z && this.K0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        hoVar2.t(num2, z3, true);
                        this.K0 = true;
                        z2 = true;
                    } else {
                        this.K0 = false;
                        z2 = false;
                    }
                    float f4 = 0.0f;
                    if (!z) {
                        ln lnVar = this.I0;
                        if (z2) {
                            f2 = 1.0f;
                        } else {
                            f2 = 0.0f;
                        }
                        lnVar.e(true, f2);
                        ln lnVar2 = this.J0;
                        if (lnVar2 != null) {
                            if (this.L0) {
                                f3 = 1.0f;
                            } else {
                                f3 = 0.0f;
                            }
                            lnVar2.e(true, f3);
                        }
                    }
                    TLRPC.Chat L0 = oc7.r1(this.s2).L0(Long.valueOf(-this.r1));
                    if ((!this.u1 || (!sd2.q(L0) && !sd2.s0(L0))) && storyItem.views.views_count > 0) {
                        TextView textView = this.q2;
                        if (oabVar.O0 == null) {
                            M02 = jb6.M0(2131747857, null);
                        } else {
                            M02 = jb6.M0(2131747856, null);
                        }
                        textView.setText(M02);
                        this.q2.setTranslationX(gm.L(16.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "d  ");
                        spannableStringBuilder.setSpan(new pn2(2131231188, 0), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                        spannableStringBuilder.append((CharSequence) gm.o0(storyItem.views.views_count, 0));
                        this.q2.setText(spannableStringBuilder);
                    } else {
                        this.q2.setText("");
                    }
                    ViewGroup.LayoutParams layoutParams = b48Var.getLayoutParams();
                    float L = gm.L(40.0f);
                    if (this.K0) {
                        f = this.G0.d + gm.L(4.0f);
                    } else {
                        f = 0.0f;
                    }
                    layoutParams.width = (int) (L + f);
                    ((ViewGroup.MarginLayoutParams) this.M1.getLayoutParams()).rightMargin = gm.L(40.0f) + b48Var.getLayoutParams().width;
                    b48 b48Var2 = this.F0;
                    if (b48Var2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = b48Var2.getLayoutParams();
                        float L2 = gm.L(40.0f);
                        if (this.L0) {
                            f4 = this.H0.d + gm.L(4.0f);
                        }
                        layoutParams2.width = (int) (L2 + f4);
                        ((ViewGroup.MarginLayoutParams) this.M1.getLayoutParams()).rightMargin += b48Var2.getLayoutParams().width;
                        b48Var2.requestLayout();
                    }
                    this.M1.requestLayout();
                    b48Var.requestLayout();
                    this.r2.setVisibility(8);
                    this.v2.setVisibility(8);
                    TL_stories.StoryItem storyItem2 = z48Var.a;
                    e48 e48Var = this.Z0;
                    if (storyItem2 == null) {
                        e48Var.getClass();
                        return;
                    }
                    for (int i4 = 0; i4 < e48Var.getChildCount(); i4++) {
                        if (e48Var.getChildAt(i4) instanceof e8b) {
                            ((e8b) e48Var.getChildAt(i4)).c(storyItem2.views, z);
                        }
                    }
                    return;
                }
                int i5 = 3;
                if (storyViews != null && storyViews.views_count > 0) {
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (i6 < storyItem.views.recent_viewers.size()) {
                            TLObject a2 = oc7.r1(this.s2).a2(storyItem.views.recent_viewers.get(i6).longValue());
                            if (a2 != null) {
                                this.r2.b(i7, this.s2, a2);
                                i7++;
                            }
                            i = i5;
                            if (i7 >= i) {
                                break;
                            }
                            i6++;
                            i5 = i;
                        } else {
                            i = i5;
                            break;
                        }
                    }
                    int i8 = i7;
                    while (true) {
                        h02Var = this.r2;
                        if (i8 >= i) {
                            break;
                        }
                        h02Var.b(i8, this.s2, null);
                        i8++;
                    }
                    h02Var.a(false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(jb6.H(',', "Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        pn2 pn2Var = new pn2(2131231985, 0);
                        pn2Var.y = -53704;
                        pn2Var.n = gm.L(0.2f);
                        spannableStringBuilder2.setSpan(pn2Var, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        pn2 pn2Var2 = new pn2(2131231976, 0);
                        pn2Var2.y = -14161823;
                        pn2Var2.n = gm.L(0.2f);
                        spannableStringBuilder2.setSpan(pn2Var2, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.q2.setText(spannableStringBuilder2);
                    h02 h02Var2 = this.r2;
                    if (i7 == 0) {
                        h02Var2.setVisibility(8);
                        this.q2.setTranslationX(gm.L(16.0f));
                    } else {
                        h02Var2.setVisibility(0);
                        this.q2.setTranslationX(gm.L(10.0f) + aq1.h(i7, 1, gm.L(20.0f), gm.L(24.0f) + gm.L(13.0f)));
                    }
                    this.v2.setVisibility(0);
                } else {
                    TextView textView2 = this.q2;
                    if (oabVar.O0 == null) {
                        M0 = jb6.M0(2131747857, null);
                    } else {
                        M0 = jb6.M0(2131747856, null);
                    }
                    textView2.setText(M0);
                    this.q2.setTranslationX(gm.L(16.0f));
                    this.r2.setVisibility(8);
                    this.v2.setVisibility(8);
                }
                b48Var.getLayoutParams().width = gm.L(40.0f);
                this.E0.requestLayout();
                return;
            }
            this.q2.setText("");
            this.v2.setVisibility(8);
            this.r2.setVisibility(8);
        }
    }

    public final void j0() {
        if (this.y2 == null) {
            e51 e51Var = new e51(this, getContext(), this.r0);
            this.y2 = e51Var;
            e51Var.W3 = new x38(this);
            e51Var.d2.h0();
            e51 e51Var2 = this.y2;
            e51Var2.Q1 = true;
            e51Var2.Z0();
            e51 e51Var3 = this.y2;
            e51Var3.R1 = new y38(this);
            e51Var3.U0().setText(this.R1.getFieldText());
        }
    }

    public final void j1() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z;
        t38 t38Var;
        float heightWithTopView;
        float f6;
        float f7;
        float f8;
        float L;
        int i;
        float f9;
        float f10;
        int i2;
        b48 b48Var;
        ImageView imageView;
        l48 l48Var;
        b48 b48Var2;
        boolean z2;
        float f11;
        v29 v29Var;
        float f12;
        int i3;
        float f13;
        float f14;
        float f15 = ((fab) this.G1).d.W;
        if (this.B2) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ln lnVar = this.E2;
        lnVar.e(false, f);
        int i4 = this.j2;
        if (i4 != 0 && this.k2) {
            f2 = pqe.a(this.x2 / i4, 0.0f, 1.0f);
        } else if (this.l2) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        ln lnVar2 = this.M3;
        float f16 = lnVar2.c;
        ln lnVar3 = this.N3;
        float f17 = lnVar3.c;
        ln lnVar4 = this.O3;
        float f18 = lnVar4.c;
        if (this.w2) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        lnVar2.e(false, f3);
        if (!this.Y2) {
            t38 t38Var2 = this.R1;
            if (t38Var2 != null && !TextUtils.isEmpty(t38Var2.getFieldText())) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            lnVar3.e(false, f14);
        }
        t38 t38Var3 = this.R1;
        if (t38Var3 != null && t38Var3.p4) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        lnVar4.e(false, f4);
        final t38 t38Var4 = this.R1;
        if (t38Var4 != null) {
            a58 a58Var = t38Var4.E7;
            f5 = 1.0f;
            int backgroundTop = t38Var4.getBackgroundTop();
            int i5 = t38Var4.B7;
            if (i5 != 0 && backgroundTop != i5) {
                int i6 = (t38Var4.J2 + i5) - backgroundTop;
                t38Var4.setAnimatedTop(i6);
                a58Var.L2 = true;
                ValueAnimator valueAnimator = a58Var.U1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    a58Var.U1.cancel();
                }
                View view = t38Var4.w2;
                if (view != null && view.getVisibility() == 0) {
                    t38Var4.w2.setTranslationY(((1.0f - t38Var4.getTopViewEnterProgress()) * t38Var4.w2.getLayoutParams().height) + t38Var4.J2);
                }
                a58Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i6, 0.0f);
                a58Var.U1 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        byte b = r2;
                        t38 t38Var5 = t38Var4;
                        switch (b) {
                            case 0:
                                t38Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                a58 a58Var2 = t38Var5.E7;
                                a58Var2.L2 = true;
                                a58Var2.invalidate();
                                t38Var5.invalidate();
                                return;
                            default:
                                t38Var5.F0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                a58Var.U1.addListener(new s38(t38Var4, (byte) 0));
                a58Var.U1.setDuration(250L);
                a58Var.U1.setInterpolator(wb2.V);
                a58Var.U1.start();
                t38Var4.B7 = 0;
            }
            if (t38Var4.d4) {
                float scrollY = (t38Var4.D7 - t38Var4.F0.getScrollY()) + (t38Var4.C7 - t38Var4.F0.getMeasuredHeight());
                sy1 sy1Var = t38Var4.F0;
                sy1Var.setOffsetY(sy1Var.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(t38Var4.F0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        byte b = r2;
                        t38 t38Var5 = t38Var4;
                        switch (b) {
                            case 0:
                                t38Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                a58 a58Var2 = t38Var5.E7;
                                a58Var2.L2 = true;
                                a58Var2.invalidate();
                                t38Var5.invalidate();
                                return;
                            default:
                                t38Var5.F0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = t38Var4.A7;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                t38Var4.A7 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(wb2.V);
                ofFloat2.start();
                t38Var4.d4 = false;
                a58Var.j1();
            }
            t38Var4.getMeasuredHeight();
        } else {
            f5 = 1.0f;
        }
        t38 t38Var5 = this.R1;
        if (t38Var5 != null && t38Var5.R0()) {
            z = true;
        } else {
            z = false;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        boolean z3 = this.n2;
        Paint paint = this.d2;
        if (z3) {
            paint.setColor(on2.f(this.g2, -14933463, cmb.p1(0.44f, -16777216)));
            float f19 = f5;
            paint.setAlpha((int) ((f19 - this.T3) * td4.z(f19, this.h2, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(on2.p(-16777216, (int) ((f5 - this.T3) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z4 = this.L2;
        oab oabVar = this.z0;
        if (z4 || this.P3 != oabVar.e0 || lnVar.c != this.G2 || this.i2 != this.x2 || f2 != this.g2 || f15 != this.h2 || f16 != lnVar2.c || z || f18 != lnVar4.c || f17 != lnVar3.c) {
            this.L2 = false;
            this.i2 = this.x2;
            int i7 = (lnVar.c > this.G2 ? 1 : (lnVar.c == this.G2 ? 0 : -1));
            g48 g48Var = this.S0;
            if (i7 != 0) {
                g48Var.invalidate();
            }
            if (f15 != 0.0f) {
                g48Var.setLayerType(2, null);
            } else {
                g48Var.setLayerType(0, null);
            }
            this.G2 = lnVar.c;
            this.h2 = f15;
            this.g2 = f2;
            this.P3 = oabVar.e0;
            float height = this.x2 - (getHeight() - g48Var.getBottom());
            if (this.R1 == null) {
                heightWithTopView = 0.0f;
            } else {
                heightWithTopView = t38Var.getHeightWithTopView() * f2;
            }
            float max = Math.max(0.0f, height + heightWithTopView);
            float height2 = this.e2 - (getHeight() - g48Var.getBottom());
            t38 t38Var6 = this.R1;
            if (t38Var6 == null) {
                f7 = 0.0f;
            } else {
                float heightWithTopView2 = t38Var6.getHeightWithTopView();
                if (this.l2) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                f7 = heightWithTopView2 * f6;
            }
            float max2 = Math.max(0.0f, height2 + f7);
            t38 t38Var7 = this.R1;
            if (t38Var7 != null) {
                if (this.T1 != null) {
                    ImageView suggestButton = t38Var7.getSuggestButton();
                    if (suggestButton != null) {
                        this.T1.o(1.0f, -(gm.L(74.0f) - suggestButton.getTranslationX()));
                    }
                    this.T1.setTranslationY(-((getHeight() - this.R1.getY()) + gm.L(6.0f)));
                }
                qu3 editField = this.R1.getEditField();
                m6a senderSelectView = this.R1.getSenderSelectView();
                if (editField != null) {
                    f8 = 6.0f;
                    f13 = 1.0f;
                    float R1 = gm.R1(0.88f, 1.0f, f2);
                    editField.setScaleX(R1);
                    editField.setScaleY(R1);
                } else {
                    f8 = 6.0f;
                    f13 = 1.0f;
                }
                if (senderSelectView != null) {
                    float R12 = gm.R1(0.8f, f13, f2);
                    senderSelectView.setScaleX(R12);
                    senderSelectView.setScaleY(R12);
                    senderSelectView.setTranslationY(gm.U1(f2, -gm.L(2.0f), 0));
                }
            } else {
                f8 = 6.0f;
            }
            if (this.n2) {
                L = 0.0f;
            } else {
                L = gm.L(58.0f) * (1.0f - f2);
            }
            float max3 = Math.max(0.0f, L + max);
            if (!this.n2 && !this.l2) {
                i = gm.L(58.0f);
            } else {
                i = 0;
            }
            float max4 = Math.max(0.0f, max2 + i);
            float L2 = (gm.L(f8) * f2) + max3;
            n38 n38Var = this.B0;
            fv fvVar = n38Var.c;
            n38Var.L = L2;
            if (Math.abs(n38Var.M - max4) > 0.1f) {
                n38Var.M = max4;
                f9 = 0.8f;
                i2 = 0;
                f10 = 8.0f;
                fvVar.setPadding(gm.L(8.0f), Math.max(0, ((int) max4) - fvVar.getTop()) + gm.L(7.5f), gm.L(8.0f), gm.L(7.5f));
                if (!fvVar.canScrollVertically(1)) {
                    n38Var.d.g1(0, gm.L(100.0f));
                }
            } else {
                f9 = 0.8f;
                f10 = 8.0f;
                i2 = 0;
            }
            n38Var.setTranslationY(-n38Var.L);
            n38Var.invalidate();
            t96 t96Var = oabVar.E0;
            if (t96Var != null) {
                t96Var.setKeyboardOffset(max);
            }
            v29 v29Var2 = this.V1;
            z48 z48Var = this.E1;
            if (v29Var2 != null) {
                if (this.g2 > 0.0f && (z48Var == null || !z48Var.f)) {
                    i3 = i2;
                } else {
                    i3 = 8;
                }
                v29Var2.setVisibility(i3);
            }
            int i8 = i2;
            while (true) {
                int childCount = getChildCount();
                b48Var = this.F0;
                imageView = this.D0;
                l48Var = this.A0;
                b48Var2 = this.t0;
                if (i8 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() == 0 && childAt != this.M1 && childAt.getTag(2131296593) == null && childAt != l48Var.W.m(getContext())) {
                    t38 t38Var8 = this.R1;
                    if (t38Var8 != null && childAt == t38Var8.getEmojiView()) {
                        childAt.setTranslationY(this.R1.getEmojiView().getMeasuredHeight() - this.x2);
                    } else if (childAt instanceof ig5) {
                        ig5 ig5Var = (ig5) childAt;
                        View view2 = ig5Var.c;
                        if (view2 != null) {
                            ig5Var.d(view2);
                        }
                    } else if (childAt != this.z2 && childAt != g48Var && childAt != imageView && childAt != this.E0 && childAt != b48Var && childAt != this.M2 && childAt != this.T1 && childAt != b48Var2 && ((v29Var = this.h3) == null || v29Var.getReactionsWindow() == null || childAt != this.h3.getReactionsWindow().c)) {
                        float f20 = this.g2;
                        f20 = (childAt == this.N1 || childAt == this.P1 || childAt == this.Q1 || childAt == this.O1) ? 0.0f : 0.0f;
                        float f21 = 1.0f - f20;
                        float L3 = (((((-this.A2) * f21) - (gm.L(7.0f) * f20)) - this.x2) - (gm.L(f10) * f21)) - (gm.L(20.0f) * oabVar.e0);
                        if (childAt == this.N1 || childAt == this.P1 || childAt == this.Q1 || childAt == this.O1) {
                            L3 += this.x2;
                        }
                        if (this.n2) {
                            f12 = (1.0f - this.h2) * hideInterfaceAlpha;
                        } else {
                            f12 = hideInterfaceAlpha * 1.0f;
                        }
                        if (childAt == this.R2) {
                            L3 = oabVar.e0 * (-gm.L(20.0f));
                        }
                        if (childAt == this.T2) {
                            L3 -= this.R1.getMeasuredHeight() - this.R1.getAnimatedTop();
                            f12 = this.g2;
                            childAt.invalidate();
                        }
                        if (childAt == this.S1) {
                            L3 -= this.R1.getMeasuredHeight() - this.R1.getAnimatedTop();
                            f12 *= this.g2;
                        }
                        if (childAt == this.V1) {
                            float f22 = (1.0f - lnVar3.c) * (1.0f - f18) * (1.0f - lnVar2.c) * this.g2;
                            float f23 = f12 * f22 * 1.0f;
                            if (childAt.getAlpha() != 0.0f && f23 == 0.0f) {
                                this.V1.k();
                            }
                            childAt.setAlpha(f23);
                            float f24 = (f22 * 0.2f) + f9;
                            childAt.setScaleX(f24);
                            childAt.setScaleY(f24);
                        } else {
                            childAt.setTranslationY(L3);
                            t38 t38Var9 = this.R1;
                            if (t38Var9 == null || childAt != t38Var9.E2) {
                                childAt.setAlpha(f12);
                            }
                        }
                    }
                } else if (childAt == this.M1) {
                    if (this.n2) {
                        childAt.setAlpha((1.0f - this.T3) * (1.0f - this.h2) * hideInterfaceAlpha);
                    } else {
                        childAt.setAlpha((1.0f - this.T3) * hideInterfaceAlpha);
                    }
                }
                i8++;
            }
            float f25 = 0.0f;
            float f26 = (1.0f - f15) * hideInterfaceAlpha;
            imageView.setAlpha((1.0f - this.T3) * f26);
            b48Var2.setAlpha((1.0f - this.T3) * f26);
            if (b48Var != null) {
                b48Var.setAlpha((1.0f - this.T3) * f26);
            }
            for (int i9 = 0; i9 < g48Var.getChildCount(); i9++) {
                View childAt2 = g48Var.getChildAt(i9);
                if (childAt2 != null && childAt2 != this.C0) {
                    x48 x48Var = this.e1;
                    a6 a6Var = this.o0;
                    if (childAt2 != x48Var && childAt2 != this.m0 && childAt2 != this.n0 && childAt2 != a6Var && childAt2 != this.M1 && childAt2 != l48Var && childAt2 != this.s0) {
                        childAt2.setAlpha(hideInterfaceAlpha);
                    } else {
                        if (childAt2 == a6Var) {
                            f11 = this.U2;
                        } else {
                            f11 = 1.0f;
                        }
                        float f27 = this.T3;
                        if (childAt2 == l48Var) {
                            childAt2.setAlpha((1.0f - f27) * f11 * hideInterfaceAlpha);
                        } else {
                            childAt2.setAlpha((1.0f - f27) * f11 * hideInterfaceAlpha);
                        }
                    }
                }
            }
            if (this.R1 != null) {
                float L4 = gm.L(40.0f);
                if (!z48Var.f) {
                    if (this.I2) {
                        L4 += gm.L(46.0f);
                    }
                    if (this.J2 && this.t1) {
                        L4 += gm.L(46.0f);
                    }
                    if (b48Var2.getVisibility() == 0) {
                        L4 = (L4 - gm.L(40.0f)) + b48Var2.getLayoutParams().width;
                    }
                } else {
                    float L5 = gm.L(46.0f);
                    L4 = gm.L(46.0f);
                    nj7 nj7Var = this.Q1;
                    if (nj7Var != null && nj7Var.getVisibility() == 0) {
                        L4 += gm.L(46.0f);
                    }
                    f25 = L5;
                }
                t38 t38Var10 = this.R1;
                float f28 = -gm.L(10.0f);
                float f29 = -(gm.L(10.0f) + L4 + f25);
                float f30 = this.g2;
                if ((this.I2 || this.u1) && !z48Var.f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                t38Var10.L1(f28, f29, f30, z2);
                if (this.R1.getEmojiView() != null) {
                    this.R1.getEmojiView().setAlpha(this.g2);
                }
            }
        }
    }

    public final void k0() {
        if (this.N1 == null && getContext() != null) {
            vn2 vn2Var = new vn2(getContext(), this.x3);
            this.N1 = vn2Var;
            vn2Var.setOnClickListener(new j38(this, (byte) 1));
            addView(this.N1, qoe.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void l0() {
        r63 r63Var = this.r0;
        t38 t38Var = new t38(this, gm.W(getContext()), this, new pv0(r63Var, (byte) 4));
        this.R1 = t38Var;
        qu3 editField = t38Var.getEditField();
        editField.getClass();
        hu3 hu3Var = new hu3(editField, (byte) 0);
        editField.u0 = hu3Var;
        hu3Var.q(true);
        editField.u0.u(editField.y0);
        editField.u0.w(editField.getPaint().getTextSize());
        hu3 hu3Var2 = new hu3(editField, (byte) 1);
        editField.v0 = hu3Var2;
        hu3Var2.b = 5;
        hu3Var2.u(editField.y0);
        editField.v0.w(editField.getPaint().getTextSize());
        this.R1.getEditField().setScaleX(0.0f);
        this.R1.setOverrideKeyboardAnimation(true);
        this.R1.setClipChildren(false);
        this.R1.setDelegate(new u38(this));
        setDelegate(this.R1);
        t38 t38Var2 = this.R1;
        t38Var2.X5 = false;
        t38Var2.Y5 = true;
        if (this.E1.f) {
            t38Var2.z1(false, false, false);
        } else {
            t38Var2.z1(true, true, false);
        }
        this.R1.updateColors();
        t38 t38Var3 = this.R1;
        t38Var3.Z5 = true;
        addView(t38Var3, qoe.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.D3 != null) {
            this.R1.A2(false);
        }
        this.R1.w3 = this.p2;
        c40 c40Var = this.C2;
        ((ArrayList) c40Var.g).add(this.S0);
        ((ArrayList) c40Var.g).add(this);
        if (this.Q0) {
            this.R1.g1();
        }
        h0(false);
        if (A0()) {
            this.R1.setVisibility(8);
        }
        q02 q02Var = new q02(getContext(), r63Var, this.x3, this.v3);
        this.S1 = q02Var;
        q02Var.setOnClickListener(new e38(this, (byte) 1));
        addView(this.S1, qoe.e(57, 300, 85));
        this.S1.setVisibility(8);
        this.R1.setSideButtonsForAttach(this.S1);
        this.y0 = getChildCount();
    }

    public final void m0() {
        if (this.Z1 != null) {
            return;
        }
        h6b h6bVar = new h6b(getContext(), this.r0);
        this.Z1 = h6bVar;
        h6bVar.setOnClickListener(new j38(this, (byte) 4));
        this.Z1.setAlpha(0.0f);
        this.Z1.setVisibility(8);
        addView(this.Z1, qoe.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void n0() {
        boolean z;
        if (this.Q1 == null && getContext() != null) {
            nj7 nj7Var = new nj7(getContext(), this.x3);
            this.Q1 = nj7Var;
            nj7Var.setOnClickListener(new j38(this, (byte) 5));
            nj7 nj7Var2 = this.Q1;
            s96 s96Var = s96.N;
            boolean z2 = true;
            if (s96Var != null && s96Var.r()) {
                z = true;
            } else {
                z = false;
            }
            nj7Var2.b(z, false);
            nj7 nj7Var3 = this.Q1;
            s96 s96Var2 = s96.N;
            if (s96Var2 != null && !s96Var2.G) {
                z2 = false;
            }
            nj7Var3.a(z2, false);
            addView(this.Q1, qoe.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void o0() {
        if (this.P1 == null && getContext() != null) {
            this.O1 = new wt7(getContext(), this.s2);
            xt7 xt7Var = new xt7(getContext(), this.O1, this.x3);
            this.P1 = xt7Var;
            xt7Var.setOnClickListener(new j38(this, (byte) 6));
            this.P1.setOnLongClickListener(new g38(this, (byte) 1));
            addView(this.P1, qoe.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
            addView(this.O1, qoe.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q0 = true;
        this.U0.I();
        this.W0.I();
        this.V0.I();
        this.b3.I();
        this.d3.I();
        t38 t38Var = this.R1;
        if (t38Var != null) {
            t38Var.g1();
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.X0;
            if (i < arrayList.size()) {
                ((d29) arrayList.get(i)).b(true);
                i++;
            } else {
                nm7.f(this.s2).b(this, nm7.T);
                nm7.f(this.s2).b(this, nm7.G2);
                nm7.f(this.s2).b(this, nm7.z5);
                nm7.f(this.s2).b(this, nm7.o3);
                nm7.f(this.s2).b(this, nm7.B5);
                nm7.f(this.s2).b(this, nm7.H5);
                nm7.f(this.s2).b(this, nm7.d3);
                nm7.f(this.s2).b(this, nm7.k3);
                nm7.f(this.s2).b(this, nm7.E);
                nm7.e().b(this, nm7.m4);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q0 = false;
        this.U0.K();
        this.W0.K();
        this.V0.K();
        this.b3.K();
        this.d3.K();
        t38 t38Var = this.R1;
        if (t38Var != null) {
            t38Var.f1();
        }
        vm vmVar = this.e3;
        if (vmVar != null) {
            vmVar.o(this);
            this.e3 = null;
        }
        xm xmVar = this.c3;
        if (xmVar != null) {
            xmVar.d(this);
            this.c3 = null;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.X0;
            if (i < arrayList.size()) {
                ((d29) arrayList.get(i)).b(false);
                i++;
            } else {
                nm7.f(this.s2).n(this, nm7.T);
                nm7.f(this.s2).n(this, nm7.G2);
                nm7.f(this.s2).n(this, nm7.z5);
                nm7.f(this.s2).n(this, nm7.o3);
                nm7.f(this.s2).n(this, nm7.B5);
                nm7.f(this.s2).n(this, nm7.H5);
                nm7.f(this.s2).n(this, nm7.d3);
                nm7.f(this.s2).n(this, nm7.k3);
                nm7.f(this.s2).n(this, nm7.E);
                nm7.e().n(this, nm7.m4);
                return;
            }
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.n1.d.setBounds(0, 0, getMeasuredWidth(), gm.L(72.0f));
    }

    @Override
    public final void onMeasure(int r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a58.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.g2 = -1.0f;
        this.L2 = true;
        invalidate();
    }

    public final void p0() {
        int i;
        if (this.W1 != null) {
            return;
        }
        if (this.R1 == null) {
            l0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.W1 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(2131231981);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.X1 = textView;
        textView.setTextColor(-8026747);
        this.X1.setTextSize(1, 16.0f);
        TextView textView2 = this.X1;
        if (this.u1) {
            i = 2131744351;
        } else {
            i = 2131744179;
        }
        textView2.setText(jb6.M0(i, null));
        TextView textView3 = new TextView(getContext());
        this.Y1 = textView3;
        textView3.setTextColor(-1);
        this.Y1.setTextSize(1, 12.0f);
        TextView textView4 = this.Y1;
        int L = gm.L(40.0f);
        textView4.setBackground(cmb.i0(L, L, L, L, 452984831, 855638015, 855638015));
        this.Y1.setGravity(17);
        rve.a(this.Y1);
        this.Y1.setText(jb6.M0(2131744178, null));
        this.Y1.setPadding(gm.L(7.0f), 0, gm.L(7.0f), 0);
        this.W1.addView(imageView, qoe.t(22, 22, 16, 12, 1, 4, 0));
        this.W1.addView(this.X1, qoe.s(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.W1.addView(this.Y1, qoe.s(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.R1.addView(this.W1, qoe.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    public final void q0() {
        if (this.R2 != null) {
            return;
        }
        wb wbVar = new wb(getContext(), (byte) 29);
        this.R2 = wbVar;
        wbVar.setTextSize(1, 14.0f);
        this.R2.setTextColor(on2.f(0.5f, -16777216, -1));
        this.R2.setGravity(19);
        this.R2.setText(jb6.M0(2131744177, null));
        addView(this.R2, qoe.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void r0() {
        if (this.M1 != null) {
            return;
        }
        b48 b48Var = new b48(this, getContext(), (byte) 0);
        this.M1 = b48Var;
        b48Var.setClickable(true);
        addView(this.M1, qoe.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        a91 a91Var = new a91(this, getContext());
        this.v2 = a91Var;
        a91Var.setOnClickListener(new j38(this, (byte) 0));
        this.M1.addView(this.v2, qoe.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        h02 h02Var = new h02((byte) 1, getContext(), false);
        this.r2 = h02Var;
        h02Var.setAvatarsTextSize(gm.L(18.0f));
        this.M1.addView(this.r2, qoe.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.q2 = textView;
        textView.setTextSize(1, 14.0f);
        this.q2.setTextColor(-1);
        this.M1.addView(this.q2, qoe.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.n1.s);
        a91 a91Var2 = this.v2;
        int L = gm.L(15.0f);
        int p = on2.p(-1, 120);
        a91Var2.setBackground(cmb.i0(L, L, L, L, 0, p, p));
        imageView.setBackground(cmb.N(on2.p(-1, 120), -gm.L(2.0f), -gm.L(2.0f)));
    }

    public final void s0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (!A0() && !this.E1.f) {
            boolean p = z8c.h(this.s2).p();
            r63 r63Var = this.r0;
            if (p) {
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232399, jb6.M0(2131744576, null), false, r63Var).setOnClickListener(new j38(this, (byte) 8));
                return;
            }
            Drawable drawable = getContext().getDrawable(2131232175);
            drawable.setColorFilter(new PorterDuffColorFilter(on2.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            o38 o38Var = new o38(getContext().getDrawable(2131232387), drawable, (byte) 0);
            a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232399, jb6.M0(2131744576, null), false, r63Var);
            c.setOnClickListener(new j38(this, (byte) 9));
            c.setIcon(o38Var);
        }
    }

    public void setAccount(int i) {
        this.s2 = i;
        this.I1 = oc7.r1(i).e0;
        this.a1.b = i;
        v29 v29Var = this.V1;
        if (v29Var != null) {
            v29Var.setCurrentAccount(i);
            this.V1.m(null, null, true);
        }
        v29 v29Var2 = this.h3;
        if (v29Var2 != null) {
            v29Var2.setCurrentAccount(i);
        }
    }

    public void setActive(boolean z) {
        O0(0L, z);
    }

    public void setDelegate(w48 w48Var) {
        this.G1 = w48Var;
    }

    public void setIsVisible(boolean z) {
        if (this.V2 != z) {
            this.V2 = z;
            if (z) {
                this.U0.i1 = 1.0f;
                h0(false);
            }
        }
    }

    public void setLongpressed(boolean z) {
        if (this.A1) {
            this.B2 = z;
            invalidate();
        }
    }

    public void setOffset(float f) {
        boolean z;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (this.R0 != z) {
            this.R0 = z;
            this.S0.invalidate();
            if (this.A1 && this.z0.a && Build.VERSION.SDK_INT < 33) {
                ei7 ei7Var = this.L3;
                if (z) {
                    gm.r(ei7Var);
                    gm.d3(ei7Var, 250L);
                    return;
                }
                gm.r(ei7Var);
                oab oabVar = ((fab) this.G1).d;
                oabVar.l1 = true;
                oabVar.U();
            }
        }
    }

    public void setPaused(boolean z) {
        if (this.H1 != z) {
            this.H1 = z;
            mm mmVar = this.U0;
            if (z) {
                mmVar.x0();
                mmVar.u0 = false;
            } else {
                mmVar.w0(false);
                mmVar.u0 = true;
            }
            this.N0 = 0L;
            this.S0.invalidate();
        }
    }

    public final void t0() {
        if (this.Q2 != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTypeface(gm.o());
        textView.setGravity(1);
        textView.setTextSize(1, 16.0f);
        textView.setText(jb6.M0(2131744139, null));
        int i = cmb.F6;
        r63 r63Var = this.r0;
        anb.X(textView, i, r63Var);
        TextView textView2 = new TextView(getContext());
        rve.a(textView2);
        textView2.setText(jb6.M0(2131754195, null));
        int i2 = cmb.Ii;
        anb.X(textView2, i2, r63Var);
        textView2.setPadding(gm.L(16.0f), gm.L(12.0f), gm.L(16.0f), gm.L(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(gm.o());
        textView2.setTextSize(1, 15.0f);
        int L = gm.L(8.0f);
        int i3 = cmb.Ei;
        int v0 = cmb.v0(i3, r63Var);
        int p = on2.p(cmb.v0(i2, r63Var), 30);
        fg0 i0 = cmb.i0(L, L, L, L, v0, p, p);
        wmb M = anb.M(i3);
        wmb g = anb.g(i2, 30);
        textView2.setBackground(i0);
        anb.j(textView2, i0, M, g, r63Var);
        textView2.setOnClickListener(new j38(this, (byte) 3));
        linearLayout.addView(textView, qoe.o(-1, -2));
        linearLayout.addView(textView2, qoe.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, qoe.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.S0.addView(frameLayout);
        this.Q2 = frameLayout;
    }

    public final void u0() {
        int i;
        int i2;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.r0, getContext());
        if (A0()) {
            i = 2131751501;
        } else {
            i = 2131751424;
        }
        String M0 = jb6.M0(i, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        if (A0()) {
            i2 = 2131751502;
        } else {
            i2 = 2131751425;
        }
        heVar.U = jb6.M0(i2, null);
        alertDialog$Builder.j(jb6.M0(2131751535, null), new e38(this, (byte) 2));
        alertDialog$Builder.g(jb6.M0(2131752542, null), new bh7((byte) 28));
        ((fab) this.G1).h(heVar);
        heVar.h();
    }

    public final boolean v0(boolean z) {
        s96 s96Var;
        TLRPC.Peer l;
        long e = z8c.h(this.s2).e();
        int i = (this.r1 > 0L ? 1 : (this.r1 == 0L ? 0 : -1));
        oab oabVar = this.z0;
        if (i < 0) {
            s96 s96Var2 = oabVar.B0;
            if (s96Var2 != null && z) {
                TLRPC.Peer l2 = s96Var2.l();
                TLRPC.Chat L0 = oc7.r1(this.s2).L0(Long.valueOf(-this.r1));
                if (oabVar.B0.o() || sd2.w(14, L0)) {
                    if (l2 == null || this.r1 == pg3.n(l2) || pg3.n(l2) == z8c.h(this.s2).e()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } else if (oabVar != null && (s96Var = oabVar.B0) != null && s96Var.o()) {
            if (!z || (l = oabVar.B0.l()) == null || this.r1 == pg3.n(l) || pg3.n(l) == e || this.r1 == e) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public final void w0(Canvas canvas, int i, int i2) {
        c40 c40Var = this.C2;
        if (((jy) c40Var.e) != null) {
            if (((SurfaceView) c40Var.d) != null) {
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                if (Build.VERSION.SDK_INT >= 24) {
                    gm.y0((SurfaceView) c40Var.d, createBitmap);
                }
                if (createBitmap != null) {
                    canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                    return;
                }
                return;
            }
            TextureView textureView = (TextureView) c40Var.f;
            if (textureView != null) {
                Bitmap bitmap = textureView.getBitmap(i, i2);
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    return;
                }
                return;
            }
        }
        canvas.save();
        g48 g48Var = this.S0;
        canvas.scale(i / g48Var.getMeasuredWidth(), i2 / g48Var.getMeasuredHeight());
        this.U0.h(canvas, null);
        canvas.restore();
    }

    public final void x0(y7b y7bVar, TL_stories.StoryItem storyItem) {
        int i;
        View[] viewPages;
        w48 w48Var = this.G1;
        Context context = getContext();
        if (storyItem.pinned) {
            i = Integer.MAX_VALUE;
        } else {
            i = storyItem.expire_date - storyItem.date;
        }
        a8b a8bVar = new a8b(context, i, this.r0);
        a8bVar.R0(y7bVar);
        hs1 hs1Var = a8bVar.l1;
        if (hs1Var != null) {
            for (View view : hs1Var.getViewPages()) {
                if (view instanceof v7b) {
                    ((v7b) view).f(false);
                }
            }
        }
        a8bVar.L0(true);
        a8bVar.N1 = new cz6(this, storyItem, (byte) 13);
        ((fab) w48Var).h(a8bVar);
    }

    public final boolean y0(android.view.ViewGroup r11, float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a58.y0(android.view.ViewGroup, float, float, boolean):boolean");
    }

    public final boolean z0(View view, MotionEvent motionEvent) {
        float x = getX();
        g48 g48Var = this.S0;
        float x2 = view.getX() + g48Var.getX() + x;
        float y = view.getY() + g48Var.getY() + getY();
        if (motionEvent.getX() >= x2 && motionEvent.getX() <= x2 + view.getWidth() && motionEvent.getY() >= y && motionEvent.getY() <= y + view.getHeight()) {
            return true;
        }
        return false;
    }
}
