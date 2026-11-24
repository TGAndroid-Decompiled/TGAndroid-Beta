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
public abstract class y28 extends cja implements gk7 {
    public static final int U3 = 0;
    public final i28 A0;
    public boolean A1;
    public int A2;
    public long A3;
    public final l18 B0;
    public int B1;
    public boolean B2;
    public long B3;
    public final View C0;
    public int C1;
    public final c30 C2;
    public boolean C3;
    public final ImageView D0;
    public int D1;
    public final on D2;
    public TLRPC.TL_channels_sendAsPeers D3;
    public final LinearLayout E0;
    public final x28 E1;
    public final lm E2;
    public final e18 E3;
    public final y18 F0;
    public final ep F1;
    public final lm F2;
    public int F3;
    public gn G0;
    public t28 G1;
    public float G2;
    public final e18 G3;
    public gn H0;
    public boolean H1;
    public long H2;
    public final ArrayList H3;
    public lm I0;
    public g2b I1;
    public boolean I2;
    public final ArrayList I3;
    public lm J0;
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
    public final bg7 L3;
    public long M0;
    public y18 M1;
    public ke5 M2;
    public final lm M3;
    public long N0;
    public jm2 N1;
    public final ma8 N2;
    public final lm N3;
    public boolean O0;
    public vr7 O1;
    public boolean O2;
    public final lm O3;
    public boolean P0;
    public wr7 P1;
    public w18 P2;
    public float P3;
    public boolean Q0;
    public kh7 Q1;
    public FrameLayout Q2;
    public final Path Q3;
    public boolean R0;
    public q18 R1;
    public wb R2;
    public boolean R3;
    public final d28 S0;
    public dz1 S1;
    public boolean S2;
    public ValueAnimator S3;
    public final FrameLayout T0;
    public je5 T1;
    public s18 T2;
    public float T3;
    public final ml U0;
    public ValueAnimator U1;
    public float U2;
    public final ImageReceiver V0;
    public t09 V1;
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
    public final b28 Z0;
    public g4b Z1;
    public boolean Z2;
    public final zu3 a1;
    public ViewPropertyAnimator a2;
    public boolean a3;
    public mz9 b1;
    public final il0 b2;
    public final ImageReceiver b3;
    public float c1;
    public final il0 c2;
    public xl c3;
    public final pb0 d1;
    public final Paint d2;
    public final ImageReceiver d3;
    public final v28 e1;
    public int e2;
    public vl e3;
    public final h4b f1;
    public ValueAnimator f2;
    public boolean f3;
    public igf g1;
    public float g2;
    public boolean g3;
    public int h1;
    public float h2;
    public t09 h3;
    public a8 i1;
    public float i2;
    public boolean i3;
    public s28 j1;
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
    public final w28 n1;
    public boolean n2;
    public int n3;
    public final a6 o0;
    public final nj9 o1;
    public int o2;
    public int o3;
    public final ry8 p0;
    public ArrayList p1;
    public final int p2;
    public e18 p3;
    public final ImageView q0;
    public int q1;
    public TextView q2;
    public float q3;
    public final f53 r0;
    public long r1;
    public uy1 r2;
    public boolean r3;
    public final z5b s0;
    public boolean s1;
    public int s2;
    public mv6 s3;
    public final y18 t0;
    public boolean t1;
    public int t2;
    public a8 t3;
    public l2b u0;
    public boolean u1;
    public boolean u2;
    public a8 u3;
    public je5 v0;
    public boolean v1;
    public s71 v2;
    public final kl0 v3;
    public je5 w0;
    public boolean w1;
    public boolean w2;
    public final lx4 w3;
    public je5 x0;
    public long x1;
    public float x2;
    public final bl0 x3;
    public int y0;
    public final float y1;
    public x31 y2;
    public TL_stories.TL_premium_boostsStatus y3;
    public final m8b z0;
    public int z1;
    public q z2;
    public ng1 z3;

    public y28(Context context, final m8b m8bVar, w28 w28Var, f53 f53Var) {
        super(context, null);
        this.R0 = true;
        this.X0 = new ArrayList();
        this.h1 = -5;
        this.y1 = 1.0f;
        x28 x28Var = new x28(this);
        this.E1 = x28Var;
        this.g2 = -1.0f;
        this.h2 = -1.0f;
        this.i2 = -1.0f;
        this.p2 = ConnectionsManager.generateClassGuid();
        this.E2 = new lm(this);
        this.F2 = new lm(this);
        ma8 ma8Var = new ma8();
        this.N2 = ma8Var;
        this.U2 = 1.0f;
        this.E3 = new e18(this, (byte) 4);
        this.G3 = new e18(this, (byte) 11);
        this.H3 = new ArrayList();
        this.I3 = new ArrayList();
        this.L3 = new bg7(this, (byte) 6);
        this.M3 = new lm(this);
        this.N3 = new lm(this);
        this.O3 = new lm(this);
        this.Q3 = new Path();
        ma8Var.E = new s34(this, (byte) 21);
        ?? obj = new Object();
        obj.g = new ArrayList();
        this.C2 = obj;
        this.D2 = new on(null);
        this.l1 = new ArrayList();
        this.m1 = new ArrayList();
        ml mlVar = new ml(this, (byte) 5);
        this.U0 = mlVar;
        mlVar.B0 = false;
        mlVar.A1 = true;
        mlVar.y = true;
        mlVar.T(0);
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
        mlVar.a = Arrays.asList(imageReceiver3, imageReceiver4);
        this.d1 = new pb0((wjb) null);
        this.z0 = m8bVar;
        this.n1 = w28Var;
        this.F1 = w28Var.g;
        this.I1 = na7.q1(y6c.t0).M1();
        w28Var.l.setColor(-16777216);
        this.d2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.r0 = f53Var;
        setClipChildren(false);
        b28 b28Var = new b28(this, context, this.S0, f53Var, m8bVar);
        this.Z0 = b28Var;
        bl0 bl0Var = new bl0(f53Var, bkb.Ie, 0.8f);
        this.x3 = bl0Var;
        ix4 ix4Var = new ix4();
        ix4Var.a(bm2.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT >= 31 && gba.e()) {
            lx4 lx4Var = new lx4(ix4Var);
            this.w3 = lx4Var;
            lx4Var.l(gl.L(8.0f));
            ix4Var = lx4Var;
        } else {
            this.w3 = null;
        }
        zec zecVar = new zec(this);
        kl0 kl0Var = new kl0(ix4Var, ix4Var, ix4Var);
        kl0Var.h = zecVar;
        kl0Var.i = this;
        this.v3 = kl0Var;
        this.b2 = kl0Var.c(this, bl0Var, false);
        il0 c = kl0Var.c(this, bl0Var, false);
        this.c2 = c;
        c.u(gl.L(32.0f));
        d28 d28Var = new d28(this, context, w28Var, m8bVar);
        this.S0 = d28Var;
        d28Var.setClipChildren(false);
        this.a1 = new zu3(this.s2, d28Var);
        d28Var.addView(b28Var, nme.c(-1.0f, -1));
        i28 i28Var = new i28(this, getContext(), m8bVar.E, m8bVar, f53Var);
        this.A0 = i28Var;
        i28Var.b0.setOnClickListener(new g18(this, (byte) 10));
        ImageView imageView = new ImageView(context);
        this.D0 = imageView;
        imageView.setImageDrawable(w28Var.m);
        int L = gl.L(8.0f);
        imageView.setPadding(L, L, L, L);
        imageView.setOnClickListener(new g18(this, (byte) 11));
        imageView.setContentDescription(k96.M0(2131745267, null));
        ote.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(w28Var.n);
        imageView2.setPadding(L, L, L, L);
        y18 y18Var = new y18(this, getContext(), (byte) 1);
        this.F0 = y18Var;
        gn gnVar = this.H0;
        if (gnVar != null) {
            gnVar.setCallback(y18Var);
        }
        y18Var.setWillNotDraw(false);
        y18Var.setOnClickListener(new g18(this, (byte) 12));
        y18 y18Var2 = new y18(this, getContext(), (byte) 2);
        this.t0 = y18Var2;
        gn gnVar2 = this.G0;
        if (gnVar2 != null) {
            gnVar2.setCallback(y18Var2);
        }
        y18Var2.setWillNotDraw(false);
        y18Var2.setOnClickListener(new g18(this, (byte) 13));
        y18Var2.setOnLongClickListener(new u0(this, m8bVar, (byte) 3));
        l2b l2bVar = new l2b(context, w28Var);
        this.u0 = l2bVar;
        l2bVar.setPadding(L, L, L, L);
        y18Var2.addView(this.u0, nme.e(40, 40, 3));
        y18Var.addView(imageView2, nme.e(40, 40, 3));
        ote.b(y18Var2, 0.3f, 5.0f);
        ote.b(y18Var, 0.3f, 5.0f);
        mlVar.A1 = true;
        mlVar.p0(d28Var);
        nj9 nj9Var = new nj9(10);
        this.o1 = nj9Var;
        d28Var.setOutlineProvider(nj9Var);
        d28Var.setClipToOutline(true);
        addView(d28Var);
        v28 v28Var = new v28(context, x28Var);
        this.e1 = v28Var;
        v28Var.setOnClickListener(new View.OnClickListener(this) {
            public final y28 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                int i;
                byte b = r3;
                m8b m8bVar2 = m8bVar;
                y28 y28Var = this.b;
                switch (b) {
                    case 0:
                        long j = y6c.h(y28Var.s2).n;
                        long j2 = y28Var.r1;
                        if (j == j2) {
                            Bundle j3 = ls6.j(1, "type");
                            j3.putLong("dialog_id", y28Var.r1);
                            m8bVar2.L(new zj6(j3, null));
                            return;
                        } else if (j2 > 0) {
                            m8bVar2.L(ProfileActivity.P2(j2));
                            return;
                        } else {
                            m8bVar2.L(mu1.W9(j2));
                            return;
                        }
                    default:
                        if (y28Var.E1.h()) {
                            m8bVar2.T();
                            if (!m8b.D1) {
                                na7.c1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            a6 a6Var = y28Var.o0;
                            if (!m8b.D1) {
                                i = 2131748122;
                            } else {
                                i = 2131743610;
                            }
                            a6Var.setContentDescription(k96.M0(i, null));
                            return;
                        }
                        y28Var.X0(true);
                        return;
                }
            }
        });
        d28Var.addView(v28Var, nme.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
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
        linearLayout.addView(imageView, nme.r(40, 40, 5));
        linearLayout.addView(y18Var, nme.r(40, 40, 5));
        linearLayout.addView(y18Var2, nme.r(40, 40, 5));
        addView(linearLayout, nme.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.m0 = imageView3;
        imageView3.setImageDrawable(w28Var.q);
        imageView3.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        imageView3.setBackground(bkb.f0(-1, 1, -1));
        imageView3.setContentDescription(k96.M0(2131754838, null));
        d28Var.addView(imageView3, nme.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.n0 = imageView4;
        imageView4.setImageDrawable(w28Var.r);
        imageView4.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        imageView4.setBackground(bkb.f0(-1, 1, -1));
        imageView4.setContentDescription(k96.M0(2131754807, null));
        d28Var.addView(imageView4, nme.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new fr7(m8bVar, (byte) 7));
        imageView3.setOnClickListener(new og(this, f53Var, m8bVar, context, w28Var, (byte) 11));
        a6 a6Var = new a6(context, (byte) 22);
        this.o0 = a6Var;
        d28Var.addView(a6Var, nme.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ?? imageView5 = new ImageView(context);
        this.p0 = imageView5;
        imageView5.setPadding(gl.L(6.0f), gl.L(6.0f), gl.L(6.0f), gl.L(6.0f));
        a6Var.addView(imageView5);
        ImageView imageView6 = new ImageView(context);
        this.q0 = imageView6;
        imageView6.setPadding(gl.L(6.0f), gl.L(6.0f), gl.L(6.0f), gl.L(6.0f));
        imageView6.setImageDrawable(w28Var.t);
        a6Var.addView(imageView6);
        imageView6.setVisibility(8);
        z5b z5bVar = new z5b(context);
        this.s0 = z5bVar;
        z5bVar.setOnClickListener(new g18(this, (byte) 2));
        d28Var.addView(z5bVar, nme.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        a6Var.setOnClickListener(new View.OnClickListener(this) {
            public final y28 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                int i;
                byte b = r3;
                m8b m8bVar2 = m8bVar;
                y28 y28Var = this.b;
                switch (b) {
                    case 0:
                        long j = y6c.h(y28Var.s2).n;
                        long j2 = y28Var.r1;
                        if (j == j2) {
                            Bundle j3 = ls6.j(1, "type");
                            j3.putLong("dialog_id", y28Var.r1);
                            m8bVar2.L(new zj6(j3, null));
                            return;
                        } else if (j2 > 0) {
                            m8bVar2.L(ProfileActivity.P2(j2));
                            return;
                        } else {
                            m8bVar2.L(mu1.W9(j2));
                            return;
                        }
                    default:
                        if (y28Var.E1.h()) {
                            m8bVar2.T();
                            if (!m8b.D1) {
                                na7.c1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            a6 a6Var2 = y28Var.o0;
                            if (!m8b.D1) {
                                i = 2131748122;
                            } else {
                                i = 2131743610;
                            }
                            a6Var2.setContentDescription(k96.M0(i, null));
                            return;
                        }
                        y28Var.X0(true);
                        return;
                }
            }
        });
        this.f1 = new h4b(this, w28Var);
        d28Var.addView(i28Var, nme.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.C0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        l18 l18Var = new l18(this, context, m8bVar, m8bVar.w, view, frameLayout, m8bVar);
        this.B0 = l18Var;
        d28Var.addView(view, nme.e(-1, 200, 87));
        d28Var.addView(l18Var, nme.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        d28Var.addView(frameLayout, nme.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int L2 = gl.L(20.0f);
        int o = bm2.o(-1, 100);
        a6Var.setBackground(bkb.i0(L2, L2, L2, L2, 0, o, o));
        int L3 = gl.L(20.0f);
        int o2 = bm2.o(-1, 100);
        imageView3.setBackground(bkb.i0(L3, L3, L3, L3, 0, o2, o2));
        int L4 = gl.L(20.0f);
        int o3 = bm2.o(-1, 100);
        imageView4.setBackground(bkb.i0(L4, L4, L4, L4, 0, o3, o3));
        int L5 = gl.L(20.0f);
        int o4 = bm2.o(-1, 100);
        imageView.setBackground(bkb.i0(L5, L5, L5, L5, 0, o4, o4));
        int L6 = gl.L(20.0f);
        int o5 = bm2.o(-1, 100);
        y18Var2.setBackground(bkb.i0(L6, L6, L6, L6, 0, o5, o5));
        int L7 = gl.L(20.0f);
        int o6 = bm2.o(-1, 100);
        y18Var.setBackground(bkb.i0(L7, L7, L7, L7, 0, o6, o6));
        oib oibVar = i28Var.W;
        View m = oibVar.m(context);
        gl.B2(m);
        addView(m);
        oibVar.D = new hr1(this, (byte) 2);
        oibVar.Q(this);
    }

    public static void Q0(f2b f2bVar, ImageReceiver imageReceiver, String str) {
        if (f2bVar.s) {
            imageReceiver.Y(null, null, gl5.g(f2bVar.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.Z(gl5.g(f2bVar.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public j5 getAccountInstance() {
        return j5.a(this.s2);
    }

    public float getHideInterfaceAlpha() {
        float f;
        float f2 = 1.0f - this.E2.c;
        n0a n0aVar = this.z0.x;
        if (n0aVar == null) {
            f = 0.0f;
        } else {
            f = n0aVar.f;
        }
        return (1.0f - f) * f2;
    }

    public long getMessageMinPrice() {
        m8b m8bVar;
        if (!this.E1.f || (m8bVar = this.z0) == null || m8bVar.B0 == null || v0(true)) {
            return 0L;
        }
        return m8bVar.B0.m();
    }

    public final boolean A0() {
        y1b y1bVar;
        m8b m8bVar = this.z0;
        if (m8bVar != null && (y1bVar = m8bVar.O0) != null && y1bVar.e == 4) {
            return true;
        }
        return false;
    }

    public final boolean B0() {
        TLRPC.User V1;
        if (A0() && (V1 = na7.q1(this.s2).V1(Long.valueOf(this.z0.O0.d))) != null && V1.bot && V1.bot_can_edit) {
            return true;
        }
        return false;
    }

    public abstract boolean C0();

    public final void D0(ValueAnimator valueAnimator) {
        float f;
        this.T3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f2 = (-gl.L(8.0f)) * this.T3;
        v28 v28Var = this.e1;
        v28Var.setTranslationY(f2);
        v28Var.setAlpha(1.0f - this.T3);
        float f3 = (-gl.L(8.0f)) * this.T3;
        ImageView imageView = this.m0;
        imageView.setTranslationY(f3);
        imageView.setAlpha(1.0f - this.T3);
        float f4 = (-gl.L(8.0f)) * this.T3;
        ImageView imageView2 = this.n0;
        imageView2.setTranslationY(f4);
        imageView2.setAlpha(1.0f - this.T3);
        float f5 = (-gl.L(8.0f)) * this.T3;
        a6 a6Var = this.o0;
        a6Var.setTranslationY(f5);
        a6Var.setAlpha((1.0f - this.T3) * this.U2);
        y18 y18Var = this.M1;
        if (y18Var != null) {
            y18Var.setTranslationY(gl.L(8.0f) * this.T3);
            this.M1.setAlpha(1.0f - this.T3);
        }
        z5b z5bVar = this.s0;
        if (z5bVar != null) {
            z5bVar.setTranslationY((-gl.L(8.0f)) * this.T3);
            z5bVar.setAlpha(1.0f - this.T3);
        }
        this.A0.setAlpha(1.0f - this.T3);
        t28 t28Var = this.G1;
        if (t28Var == null) {
            f = 0.0f;
        } else {
            f = ((d8b) t28Var).d.W;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        y18 y18Var2 = this.t0;
        if (y18Var2 != null) {
            y18Var2.setAlpha((1.0f - this.T3) * (1.0f - f) * hideInterfaceAlpha);
        }
        ImageView imageView3 = this.D0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - this.T3) * (1.0f - f) * hideInterfaceAlpha);
        }
        y18 y18Var3 = this.F0;
        if (y18Var3 != null) {
            y18Var3.setAlpha((1.0f - this.T3) * (1.0f - f) * hideInterfaceAlpha);
        }
        q18 q18Var = this.R1;
        if (q18Var != null) {
            q18Var.setAlpha(1.0f - this.T3);
            invalidate();
        }
        this.S0.invalidate();
    }

    public final void E0(h19 h19Var) {
        boolean z;
        boolean z2;
        int i;
        TLRPC.Reaction reaction;
        x28 x28Var = this.E1;
        TL_stories.StoryItem storyItem = x28Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        if (reaction2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (reaction2 != null && h19Var == null) {
            b0();
            this.I1.i0(this.r1, x28Var.a, null);
        } else if (h19Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(this.s2).r.get("❤");
            if (tL_availableReaction != null) {
                this.f3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a = d19.a();
                gl5 b = gl5.b(document);
                ImageReceiver imageReceiver = this.b3;
                imageReceiver.d0(b, a, null, null, null, 0);
                if (imageReceiver.y() != null) {
                    imageReceiver.y().I(0, false, true);
                }
                this.g3 = true;
                this.I1.i0(this.r1, x28Var.a, h19.c(tL_availableReaction));
            }
        } else {
            b0();
            this.I1.i0(this.r1, x28Var.a, h19Var);
        }
        TL_stories.StoryItem storyItem2 = x28Var.a;
        y18 y18Var = this.t0;
        if (storyItem2 != null && (reaction = storyItem2.sent_reaction) != null) {
            z = !z;
            this.u0.setReaction(h19.d(reaction));
            y18Var.setContentDescription(k96.M0(2131754849, null));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z2 = true;
        } else {
            this.u0.setReaction(null);
            y18Var.setContentDescription(k96.M0(2131754850, null));
            z2 = false;
        }
        if (this.t1 && z) {
            TL_stories.StoryItem storyItem3 = x28Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = x28Var.a.views;
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
        TL_stories.StoryItem storyItem4 = x28Var.a;
        k19.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        i1(true);
    }

    public final void F0() {
        t76 t76Var;
        boolean z;
        if (this.D3 == null) {
            m8b m8bVar = this.z0;
            if (m8bVar != null && (t76Var = m8bVar.B0) != null) {
                TLRPC.GroupCall groupCall = t76Var.s;
                if (groupCall == null) {
                    z = false;
                } else {
                    z = !groupCall.messages_enabled;
                }
                if (z) {
                    return;
                }
            }
            TLRPC.TL_channels_sendAsPeers J1 = na7.q1(this.s2).J1(this.r1, true);
            this.D3 = J1;
            q18 q18Var = this.R1;
            if (q18Var != null && J1 != null) {
                q18Var.v2(true);
            }
        }
    }

    public final boolean G0() {
        q18 q18Var = this.R1;
        if (q18Var == null) {
            return false;
        }
        boolean z = q18Var.p3;
        if (z) {
            q18Var.V1();
        }
        gl.d3(new e18(this, (byte) 3), 300L);
        return z;
    }

    public final void H0() {
        long j;
        i18 i18Var;
        CharSequence charSequence;
        int i;
        long j2;
        na7.c1().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.R1.getTextWithEntities();
        long e = y6c.h(this.s2).e();
        TLRPC.Peer l = this.z0.B0.l();
        if (l != null) {
            e = cf3.n(l);
        }
        Context context = getContext();
        int i2 = this.s2;
        String r = cf3.r(i2, this.r1);
        long messageMinPrice = getMessageMinPrice();
        long j3 = this.A3;
        i18 i18Var2 = new i18(this, (byte) 1);
        f53 f53Var = new f53();
        fx0 fx0Var = new fx0(1, (wjb) f53Var, context, false);
        fx0Var.K();
        fx0Var.w0 = false;
        LinearLayout j4 = de9.j(context, 1);
        fx0Var.O = j4;
        int[] iArr = na7.q1(i2).T3;
        CharSequence j0 = k27.j0(textWithEntities, false, false, new TextPaint());
        if (j0 instanceof Spannable) {
            Spannable spannable = (Spannable) j0;
            j = j3;
            i18Var = i18Var2;
            charSequence = j0;
            i = ((gm[]) spannable.getSpans(0, j0.length(), gm.class)).length + ((su3[]) spannable.getSpans(0, j0.length(), su3.class)).length;
        } else {
            j = j3;
            i18Var = i18Var2;
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
            int i3 = length * 7;
            int i4 = iArr[i3];
            int[] iArr2 = iArr;
            int i5 = iArr2[i3 + 2];
            if (i <= iArr2[i3 + 3] && charSequence.length() <= i5) {
                max = Math.max(max, i4);
                break;
            } else {
                length--;
                iArr = iArr2;
            }
        }
        long[] jArr = {max};
        u41 u41Var = new u41(null, context, true);
        ?? obj = new Object();
        obj.c = e;
        obj.f = textWithEntities;
        obj.g = jArr[0];
        d76 d76Var = new d76(i2, context, true);
        LinearLayout j5 = de9.j(context, 0);
        yc ycVar = new yc(context, k96.M0(2131748622, null), f53Var);
        j5.addView(ycVar, nme.q(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        yc ycVar2 = new yc(context, k96.M0(2131748623, null), f53Var);
        j5.addView(ycVar2, nme.q(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        yc ycVar3 = new yc(context, k96.M0(2131748624, null), f53Var);
        j5.addView(ycVar3, nme.q(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        ce5 ce5Var = new ce5(context, f53Var, r3);
        i18 i18Var3 = i18Var;
        p8c[] p8cVarArr = {new be5(jArr, u41Var, new cm2[1], (i76) obj, d76Var, i2, ycVar, ycVar2, ycVar3, ce5Var, new boolean[]{true})};
        d76Var.set(obj);
        int i6 = 9;
        int[] iArr3 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int f = na7.q1(i2).k4.L2.f();
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            if (i7 >= i6) {
                break;
            }
            int[] iArr4 = iArr3;
            if (iArr3[i7] >= messageMinPrice) {
                if (i7 > 0 && arrayList.isEmpty() && iArr4[i7] > messageMinPrice) {
                    arrayList.add(Integer.valueOf((int) messageMinPrice));
                }
                int i8 = iArr4[i7];
                if (i8 > f) {
                    arrayList.add(Integer.valueOf(f));
                    break;
                }
                arrayList.add(Integer.valueOf(i8));
                if (iArr4[i7] == f) {
                    break;
                }
            }
            i7++;
            iArr3 = iArr4;
            i6 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) b00.f(1, arrayList)).intValue() < f) {
            arrayList.add(Integer.valueOf(f));
        }
        int[] iArr5 = new int[arrayList.size()];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            iArr5[i9] = ((Integer) arrayList.get(i9)).intValue();
        }
        ce5Var.f0 = iArr5;
        ce5Var.setValue((int) jArr[0]);
        j4.addView(ce5Var, nme.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        p8cVarArr[0].a(Integer.valueOf((int) jArr[0]));
        j4.addView(j5, nme.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i10 = bkb.i5;
        TextView b = hve.b(context, 20.0f, i10, true, f53Var);
        de9.q(b, 17, null, 2131748619);
        j4.addView(b, nme.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b2 = hve.b(context, 14.0f, i10, false, f53Var);
        b2.setGravity(17);
        de9.r(null, null, 2131748620, new Object[]{r}, b2);
        j4.addView(b2, nme.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        j4.addView(d76Var, nme.t(-2, -2, 17, 42, 22, 42, 20));
        j4.addView(u41Var, nme.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        fx0Var.show();
        u41Var.setOnClickListener(new hu4(i18Var3, jArr, fx0Var, (byte) 3));
    }

    public final void I0() {
        x28 x28Var = this.E1;
        if (x28Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = x28Var.a.id;
        tL_stories_exportStoryLink.peer = na7.q1(this.s2).h1(this.r1);
        ConnectionsManager.getInstance(this.s2).sendRequest(tL_stories_exportStoryLink, new Object());
    }

    public final void J0() {
        if (this.R1 == null) {
            return;
        }
        j0();
        this.y2.d2.h0();
        this.y2.t1(-1, true);
        x31 x31Var = this.y2;
        x31Var.T1 = this.r1;
        x31Var.Z0();
        this.y2.U0().setText(this.R1.getFieldText());
        ((d8b) this.G1).h(this.y2);
    }

    public final void K0() {
        Bundle bundle = new Bundle();
        long j = this.r1;
        if (j < 0) {
            bundle.putLong("chat_id", -j);
        } else {
            bundle.putLong("user_id", j);
        }
        TLRPC.Dialog Q0 = na7.q1(this.s2).Q0(this.r1);
        if (Q0 != null) {
            bundle.putInt("message_id", Q0.top_message);
        }
        this.z0.L(new mu1(bundle));
    }

    public final void L0(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y28.L0(long):void");
    }

    public final void M0() {
        x28 x28Var = this.E1;
        TL_stories.StoryItem storyItem = x28Var.a;
        if ((storyItem == null && x28Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File f = x28Var.f();
        boolean z = x28Var.e;
        if (f != null && f.exists()) {
            MediaController.d0(f.toString(), getContext(), z ? 1 : 0, null, null, new ra((byte) 4, this, z));
            return;
        }
        V0();
    }

    public final void N0(android.net.Uri r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y28.N0(android.net.Uri):void");
    }

    public final void O0(long j, boolean z) {
        int i;
        int i2;
        x28 x28Var;
        if (this.A1 != z) {
            this.A1 = z;
            ry8 ry8Var = this.p0;
            int i3 = 0;
            if (z) {
                if (this.z0.a && Build.VERSION.SDK_INT < 33) {
                    m8b m8bVar = ((d8b) this.G1).d;
                    m8bVar.l1 = true;
                    m8bVar.U();
                    bg7 bg7Var = this.L3;
                    gl.r(bg7Var);
                    gl.d3(bg7Var, 100L);
                }
                L0(j);
                d1();
                ry8Var.setAnimation(this.n1.u);
                this.A1 = true;
                this.e1.a.getImageReceiver().v0(true, true);
                if (this.E1.a != null) {
                    fa4.b("StoryViewer displayed story dialogId=" + this.r1 + " storyId=" + x28Var.a.id + " " + x28Var.d());
                }
            } else {
                f0();
                ry8Var.a();
                this.b1 = null;
                this.B2 = false;
                this.E2.e(true, 0.0f);
                this.S0.invalidate();
                invalidate();
                g0();
                m8b m8bVar2 = ((d8b) this.G1).d;
                m8bVar2.I0 = false;
                m8bVar2.U();
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
                g2b g2bVar = this.I1;
                long j2 = this.r1;
                boolean z2 = this.A1;
                vf6 vf6Var = g2bVar.m;
                ifc ifcVar = (ifc) vf6Var.f(j2);
                if (ifcVar == null) {
                    ifcVar = new ifc(g2bVar.a, j2, g2bVar);
                    vf6Var.k(ifcVar, j2);
                }
                ifcVar.b(z2);
            }
        }
    }

    public final void P0(int i, long j) {
        if (this.r1 != j) {
            x28 x28Var = this.E1;
            x28Var.b = null;
            x28Var.a = null;
        }
        this.r1 = j;
        this.p1 = null;
        e0(i);
        TL_stories.PeerStories peerStories = this.z0.Q0;
        g2b g2bVar = this.I1;
        boolean z = true;
        if (peerStories != null) {
            g2bVar.U(peerStories, true);
            return;
        }
        TL_stories.PeerStories x = g2bVar.x(j);
        if (x == null) {
            x = g2bVar.y(j);
        } else {
            z = false;
        }
        g2bVar.U(x, z);
    }

    public final void R0(long j, boolean z, boolean z2) {
        String str;
        if (!z && j == this.B3 && this.C3 == z2) {
            return;
        }
        this.B3 = j;
        this.C3 = z2;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        v28 v28Var = this.e1;
        if (i >= 0) {
            if (this.s1 && !z2) {
                v28Var.b.l(k96.M0(2131745449, null), false);
                v28Var.b.i(null);
                return;
            }
            TLRPC.User V1 = na7.q1(this.s2).V1(Long.valueOf(j));
            if (V1 != null && V1.verified) {
                Drawable mutate = getContext().getDrawable(2131232798).mutate();
                mutate.setAlpha(255);
                fm2 fm2Var = new fm2(mutate, null);
                fm2Var.x = true;
                int L = gl.L(16.0f);
                int L2 = gl.L(16.0f);
                fm2Var.h = L;
                fm2Var.n = L2;
                v28Var.b.i(fm2Var);
            } else {
                v28Var.b.i(null);
            }
            if (V1 != null) {
                v28Var.b.l(vu3.m(gl.A2(qu2.p(V1)), v28Var.b.getPaint().getFontMetricsInt(), false, null, 0), false);
                return;
            }
            v28Var.b.l(null, false);
            return;
        }
        TLRPC.Chat K0 = na7.q1(this.s2).K0(Long.valueOf(-j));
        df0 df0Var = v28Var.b;
        df0 df0Var2 = v28Var.b;
        if (K0 == null) {
            str = "";
        } else {
            str = K0.title;
        }
        df0Var.l(gl.A2(str), false);
        if (K0 != null && K0.verified) {
            Drawable mutate2 = getContext().getDrawable(2131232798).mutate();
            mutate2.setAlpha(255);
            fm2 fm2Var2 = new fm2(mutate2, null);
            fm2Var2.x = true;
            int L3 = gl.L(16.0f);
            int L4 = gl.L(16.0f);
            fm2Var2.h = L3;
            fm2Var2.n = L4;
            df0Var2.i(fm2Var2);
            return;
        }
        df0Var2.i(null);
    }

    public final void S0(float f, float f2, mz9 mz9Var) {
        this.c1 = f;
        this.q3 = 1.0f / f2;
        if (this.b1 != mz9Var) {
            this.b1 = mz9Var;
            if (mz9Var != null) {
                ImageReceiver imageReceiver = mz9Var.a;
                if (imageReceiver.n() != null) {
                    Bitmap copy = imageReceiver.n().copy(Bitmap.Config.ARGB_8888, false);
                    ml mlVar = this.U0;
                    mlVar.d0 = null;
                    mlVar.a1.setShader(null);
                    mlVar.u0(new BitmapDrawable(copy));
                }
            }
        }
    }

    public final void T0(boolean z) {
        boolean z2;
        x28 x28Var = this.E1;
        if (x28Var.a != null) {
            m8b m8bVar = this.z0;
            if (m8bVar.f != null) {
                String b = x28Var.b();
                TLRPC.Chat chat = null;
                if (z) {
                    gu0 gu0Var = new gu0(this.r0, (byte) 5);
                    if (this.t1) {
                        chat = na7.q1(this.s2).K0(Long.valueOf(-this.r1));
                    }
                    if (na7.q1(this.s2).c5() && ((!this.t1 && !l7c.C(this.r1)) || hc2.t0(chat))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    w18 w18Var = new w18(this, m8bVar.f.getContext(), b, b, z2, gu0Var);
                    this.P2 = w18Var;
                    w18Var.d2 = true;
                    TL_stories.StoryItem storyItem = x28Var.a;
                    storyItem.dialogId = this.r1;
                    w18Var.A2 = storyItem;
                    w18Var.n2 = new pj4(this, (byte) 22);
                    ((d8b) this.G1).h(w18Var);
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", b);
                LaunchActivity.H1.startActivityForResult(Intent.createChooser(intent, k96.M0(2131744609, null)), 500);
            }
        }
    }

    public final void U0() {
        d28 d28Var = this.S0;
        f53 f53Var = this.r0;
        new u21(d28Var, f53Var).t(k96.M0(2131743594, null), f53Var).j();
    }

    public final void V0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.r0, getContext());
        String M0 = k96.M0(2131689472, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        alertDialog$Builder.j(k96.M0(2131747638, null), null);
        hdVar.U = k96.M0(2131747025, null);
        ((d8b) this.G1).h(hdVar);
    }

    public final void W0(boolean z) {
        if (this.i3 != z) {
            x28 x28Var = this.E1;
            if (x28Var.a != null) {
                this.i3 = z;
                if (z) {
                    this.h3.setVisibility(0);
                }
                this.h3.setStoryItem(x28Var.a);
                m8b m8bVar = ((d8b) this.G1).d;
                m8bVar.p1 = z;
                m8bVar.U();
                float f = 0.0f;
                if (z) {
                    float f2 = this.j3;
                    if (z) {
                        f = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                    this.h3.setTransitionProgress(this.j3);
                    ofFloat.addUpdateListener(new f18(this, (byte) 1));
                    ofFloat.addListener(new n18(this, z, (byte) 0));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(s33.g);
                    ofFloat.start();
                    return;
                }
                if (this.h3.getReactionsWindow() != null) {
                    this.h3.getReactionsWindow().e();
                }
                this.h3.animate().alpha(0.0f).setDuration(150L).setListener(new o18(this, (byte) 0)).start();
            }
        }
    }

    public final void X0(boolean z) {
        int i;
        if (this.w0 == null) {
            je5 je5Var = new je5(getContext(), 1);
            je5Var.n(1.0f, -56.0f);
            this.w0 = je5Var;
            je5Var.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
            this.S0.addView(this.w0, nme.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        je5 je5Var2 = this.w0;
        if (z) {
            i = 2131744367;
        } else {
            i = 2131744217;
        }
        je5Var2.t(k96.M0(i, null));
        this.w0.v();
    }

    public final void Y0() {
        String str;
        m21 K;
        if (this.w1) {
            return;
        }
        if (this.u1) {
            if (this.y3 != null && this.z3 != null) {
                h26.n1(new hu0(this, (byte) 9), this.y3, this.z3, this.r1, true);
                return;
            }
            m8b m8bVar = this.z0;
            if (m8bVar != null) {
                m8bVar.k1 = true;
                m8bVar.U();
            }
            na7.q1(this.s2).E0().a(this.r1, new i18(this, (byte) 0));
            return;
        }
        q18 q18Var = this.R1;
        int i = -this.h1;
        this.h1 = i;
        gl.A3(i, q18Var, null);
        pw0.APP_ERROR.a();
        if (this.r1 >= 0) {
            str = l7c.r(na7.q1(this.s2).V1(Long.valueOf(this.r1)));
        } else {
            str = "";
        }
        boolean F3 = na7.q1(this.s2).F3();
        f53 f53Var = this.r0;
        d28 d28Var = this.S0;
        if (F3) {
            K = new u21(d28Var, f53Var).Q(2131624211, 36, gl.S2(k96.a0(null, null, 2131743519, str)));
        } else {
            K = new u21(d28Var, f53Var).K(2131624211, gl.S2(k96.a0(null, null, 2131743519, str)), k96.M0(2131743520, null), new e18(this, (byte) 5));
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
        y28 currentPeerView;
        q qVar = this.z2;
        if (qVar != null) {
            qVar.f(false);
        }
        long j = this.r1;
        TL_stories.StoryItem storyItem = this.E1.a;
        m8b m8bVar = this.z0;
        m8bVar.getClass();
        if (j != 0 && storyItem != null) {
            m8b.E1.remove(j + (j >> 16) + (storyItem.id << 16));
        }
        this.Y2 = true;
        c8b c8bVar = m8bVar.o0;
        if (c8bVar != null && (currentPeerView = c8bVar.getCurrentPeerView()) != null) {
            currentPeerView.i0();
        }
        if (z) {
            m21 J = new u21(this.S0, this.r0).J(2131624029, k96.M0(2131748291, null), k96.M0(2131743310, null), 5000, false, new e18(this, (byte) 2));
            J.r = false;
            J.k(false);
        }
        na7.q1(this.s2).p0(this.r1, 0, null);
    }

    public final void a1(long j) {
        String str;
        boolean z;
        TLRPC.User user;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.s2;
        if (i > 0) {
            TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(j));
            str = V1.first_name;
            z = V1.stories_hidden;
            user = V1;
        } else {
            TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-j));
            str = K0.title;
            z = K0.stories_hidden;
            user = K0;
        }
        gl.d3(new ms0(this, na7.q1(this.s2), j, !z, str, user), 200L);
    }

    public final void b0() {
        l2b l2bVar = this.u0;
        l2bVar.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new uk(l2bVar, (byte) 1)).setDuration(150L).start();
        int L = gl.L(8.0f);
        l2b l2bVar2 = new l2b(getContext(), this.n1);
        this.u0 = l2bVar2;
        l2bVar2.setPadding(L, L, L, L);
        this.u0.setAlpha(0.0f);
        this.u0.setScaleX(0.8f);
        this.u0.setScaleY(0.8f);
        this.u0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.t0.addView(this.u0, nme.e(40, 40, 3));
        this.g3 = false;
    }

    public final void b1() {
        if (!na7.q1(this.s2).c5()) {
            return;
        }
        File f = this.E1.f();
        if (f != null && f.exists()) {
            w18 w18Var = this.P2;
            if (w18Var != null) {
                w18Var.dismiss();
            }
            gl.d3(new e18(this, (byte) 8), 120L);
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
        ofFloat.addUpdateListener(new f18(this, (byte) 2));
        this.S3.addListener(new n18(this, z, (byte) 1));
        this.S3.setDuration(420L);
        this.S3.setInterpolator(s33.h);
        this.S3.start();
    }

    public final void c1(boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y28.c1(boolean):void");
    }

    public final void d0(Runnable runnable) {
        if (na7.q1(this.s2).t2()) {
            h5.b(this.s2);
            return;
        }
        int i = gba.b0;
        if (i > 0 && this.a3) {
            int i2 = i - 1;
            gba.b0 = i2;
            gba.Q(i2);
            hd hdVar = new hd(0, this.r0, getContext());
            hdVar.setTitle(k96.M0(2131744648, null));
            hdVar.m(k96.M0(2131744649, null));
            String M0 = k96.M0(2131746552, null);
            ce ceVar = new ce(runnable, (byte) 15);
            hdVar.m0 = M0;
            hdVar.n0 = ceVar;
            String M02 = k96.M0(2131752577, null);
            fi7 fi7Var = new fi7((byte) 25);
            hdVar.o0 = M02;
            hdVar.p0 = fi7Var;
            hdVar.show();
            return;
        }
        runnable.run();
    }

    public final void d1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y28.d1():void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        float f;
        t76 t76Var;
        boolean z;
        int i3 = kk7.x5;
        long j = 0;
        m8b m8bVar = this.z0;
        boolean z2 = false;
        if (i != i3 && (i != kk7.z5 || m8bVar.O0 != objArr[0])) {
            if (i == kk7.n3) {
                c1(false);
                return;
            } else if (i == kk7.k4) {
                this.A0.b0.invalidate();
                return;
            } else if (i == kk7.F5) {
                h0(true);
                return;
            } else if (i == kk7.c3) {
                wx n = na7.q1(this.s2).M1().n();
                if (n != null && n.a(this.s2, 1) && this.G1 != null) {
                    hu0 hu0Var = new hu0(this, (byte) 9);
                    Context W = gl.W(getContext());
                    if (W == null) {
                        W = LaunchActivity.H1;
                    }
                    ((d8b) this.G1).h(new h26(n.b(), this.s2, null, W, hu0Var));
                    return;
                }
                return;
            } else if (i == kk7.j3) {
                TL_account.RequirementToContact J2 = na7.q1(this.s2).J2(this.r1);
                if (this.r1 >= 0 && !y6c.h(this.s2).p() && (J2 instanceof TL_account.requirementToContactPremium)) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.v1 != z || this.x1 != cf3.j(J2)) {
                    this.v1 = z;
                    this.x1 = cf3.j(J2);
                    c1(false);
                    h0(true);
                    return;
                }
                return;
            } else if (i == kk7.S) {
                Object obj = objArr[0];
                if ((obj instanceof TLRPC.ChatFull) && this.r1 == (-((TLRPC.ChatFull) obj).id)) {
                    c1(false);
                    return;
                }
                return;
            } else if (i == kk7.F2) {
                long longValue = ((Long) objArr[0]).longValue();
                if (m8bVar != null && (t76Var = m8bVar.B0) != null && t76Var.j() == longValue) {
                    c1(false);
                    q18 q18Var = this.R1;
                    if (q18Var != null) {
                        q18Var.N(true);
                        this.R1.v2(true);
                        h0(true);
                    }
                    l18 l18Var = this.B0;
                    if (l18Var != null) {
                        t76 t76Var2 = l18Var.Q;
                        if (t76Var2 != null) {
                            j = t76Var2.m();
                        }
                        if (l18Var.I != j) {
                            l18Var.e.O(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i == kk7.E && ((Boolean) objArr[2]).booleanValue()) {
                F0();
                return;
            } else {
                return;
            }
        }
        t28 t28Var = this.G1;
        if (t28Var == null || !((d8b) t28Var).d.H0) {
            if (this.A1) {
                h1();
                if (this.q1 == 0) {
                    if (!this.u2) {
                        this.u2 = true;
                        ((d8b) this.G1).j();
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
            TL_stories.PeerStories peerStories = m8bVar.Q0;
            if (peerStories != null) {
                this.I1.U(peerStories, true);
            } else {
                long j2 = this.r1;
                if (j2 != 0) {
                    g2b g2bVar = this.I1;
                    TL_stories.PeerStories x = g2bVar.x(j2);
                    if (x == null) {
                        x = g2bVar.y(j2);
                        z2 = true;
                    }
                    g2bVar.U(x, z2);
                }
            }
            a8 a8Var = this.i1;
            if (a8Var != null) {
                ViewPropertyAnimator animate = a8Var.animate();
                if (this.I1.L(this.r1) && this.E1.e && !gba.b()) {
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
        cw1 cw1Var;
        Canvas canvas2;
        gn gnVar;
        gn gnVar2;
        j1();
        if (this.t1 && (gnVar2 = this.G0) != null) {
            gnVar2.setBounds(0, 0, getMeasuredWidth(), gl.L(40.0f));
        }
        if (this.t1 && (gnVar = this.H0) != null) {
            gnVar.setBounds(0, 0, getMeasuredWidth(), gl.L(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z = this.k3;
        LinearLayout linearLayout = this.E0;
        y18 y18Var = this.t0;
        if (z) {
            float measuredWidth = (y18Var.getMeasuredWidth() / 2.0f) + y18Var.getX() + linearLayout.getX();
            float measuredHeight = (y18Var.getMeasuredHeight() / 2.0f) + y18Var.getY() + linearLayout.getY();
            int L = gl.L(24.0f);
            float f = L / 2.0f;
            float R1 = gl.R1(this.m3, measuredWidth - f, s33.g.getInterpolation(this.l3));
            float R12 = gl.R1(this.n3, measuredHeight - f, this.l3);
            int U1 = gl.U1(this.l3, this.o3, L);
            if (this.f3) {
                vl vlVar = this.e3;
                if (vlVar != null) {
                    float f2 = U1;
                    vlVar.setBounds((int) R1, (int) R12, (int) (R1 + f2), (int) (R12 + f2));
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
            float measuredWidth2 = (y18Var.getMeasuredWidth() / 2.0f) + y18Var.getX() + linearLayout.getX();
            float measuredHeight2 = (y18Var.getMeasuredHeight() / 2.0f) + y18Var.getY() + linearLayout.getY();
            int L2 = gl.L(120.0f);
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
                xl xlVar = this.c3;
                if (xlVar != null) {
                    float f8 = L2 / 2.0f;
                    xlVar.e((int) (measuredWidth2 - f8), (int) (measuredHeight2 - f8), (int) (measuredWidth2 + f8), (int) (measuredHeight2 + f8));
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
        q18 q18Var = this.R1;
        if (q18Var != null) {
            cw1 cw1Var2 = q18Var.o2;
            cw1 cw1Var3 = q18Var.p2;
            if (q18Var.getAlpha() != 0.0f && (cw1Var = q18Var.f1) != null && cw1Var.getParent() != null && q18Var.f1.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(q18Var.f1.getX() + cw1Var2.getX() + cw1Var3.getX() + q18Var.getX(), q18Var.f1.getY() + cw1Var2.getY() + cw1Var3.getY() + q18Var.getY());
                if (q18Var.getAlpha() != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, q18Var.getMeasuredWidth(), q18Var.getMeasuredHeight(), (int) (q18Var.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                q18Var.f1.draw(canvas2);
                canvas2.restoreToCount(save);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        t09 t09Var;
        t09 t09Var2;
        lx4 lx4Var;
        float L;
        float f;
        if (view == this.T2) {
            canvas.save();
            canvas.clipRect(0.0f, this.T2.getY(), getMeasuredWidth(), this.T2.getY() + this.T2.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        q18 q18Var = this.R1;
        Paint paint = this.d2;
        y18 y18Var = this.t0;
        w28 w28Var = this.n1;
        if (view == q18Var) {
            float f2 = this.g2;
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            x28 x28Var = this.E1;
            if (i > 0 && !x28Var.f) {
                w28Var.l.setAlpha((int) (f2 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), w28Var.l);
            }
            RectF rectF = w28Var.h;
            RectF rectF2 = w28Var.i;
            RectF rectF3 = w28Var.j;
            rectF.set(this.R1.getX(), this.R1.getY() + this.R1.getAnimatedTop() + gl.L(1.33f), this.R1.getX() + this.R1.getMeasuredWidth(), this.R1.getY() + this.R1.getMeasuredHeight());
            float L2 = gl.L(40.0f);
            if (!x28Var.f) {
                if (this.I2) {
                    L2 += gl.L(46.0f);
                }
                if (this.J2 && this.t1) {
                    L2 += gl.L(46.0f);
                }
                if (y18Var != null && y18Var.getVisibility() == 0) {
                    L2 = (L2 - gl.L(40.0f)) + y18Var.getLayoutParams().width;
                }
                L = 0.0f;
            } else {
                L = gl.L(46.0f);
                L2 = gl.L(46.0f);
                kh7 kh7Var = this.Q1;
                if (kh7Var != null && kh7Var.getVisibility() == 0) {
                    L2 += gl.L(46.0f);
                }
            }
            rectF2.set(gl.L(10.0f) + L, ((this.R1.getY() + this.R1.getMeasuredHeight()) - gl.L(5.0f)) - gl.L(38.0f), (getMeasuredWidth() - gl.L(10.0f)) - L2, (this.R1.getY() + this.R1.getMeasuredHeight()) - gl.L(5.0f));
            this.R1.setTranslationX((1.0f - this.g2) * L);
            if (this.R1.getMeasuredHeight() > gl.L(50.0f)) {
                f = ((1.0f - this.g2) * (this.R1.getMeasuredHeight() - gl.L(50.0f))) + 0.0f;
            } else {
                f = 0.0f;
            }
            this.R1.getEditField().setTranslationY(tb4.A(1.0f, this.g2, -gl.L(2.0f), f));
            float L3 = gl.L(50.0f) / 2.0f;
            gl.X1(rectF2, w28Var.h, this.g2, rectF3);
            il0 il0Var = this.b2;
            if (il0Var != null) {
                il0Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                il0Var.r(L3);
                il0Var.setAlpha((int) ((1.0f - this.T3) * (1.0f - this.h2) * 255.0f * getHideInterfaceAlpha()));
                il0Var.draw(canvas);
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
        } else if (q18Var != null && q18Var.R0(view)) {
            float L4 = gl.L(30.0f);
            RectF rectF4 = w28Var.k;
            RectF rectF5 = w28Var.k;
            rectF4.set(0.0f, view.getY() + gl.L(1.0f), getWidth(), gl.L(20.0f) + getHeight());
            Path path = this.Q3;
            path.rewind();
            path.addRoundRect(rectF5, L4, L4, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            il0 il0Var2 = this.c2;
            if (il0Var2 != null) {
                il0Var2.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                il0Var2.s(L4, L4, L4, L4);
                il0Var2.setAlpha(255);
                il0Var2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF5, L4, L4, paint);
            }
            boolean drawChild3 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild3;
        } else {
            if (view == this.V1 && this.R1 != null) {
                view.setTranslationY(((this.R1.getY() + this.R1.getAnimatedTop()) + (-t09Var.getMeasuredHeight())) - gl.L(18.0f));
            } else {
                if (view == this.h3) {
                    view.setTranslationY((this.E0.getY() + (y18Var.getY() + (-(t09Var2.getMeasuredHeight() - this.h3.getPaddingBottom())))) - gl.L(18.0f));
                } else {
                    d28 d28Var = this.S0;
                    if (view == d28Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (lx4Var = this.w3) != null && !lx4Var.r) {
                        RecordingCanvas i2 = lx4Var.i(getMeasuredWidth(), getMeasuredHeight());
                        i2.drawColor(bm2.f(0.2f, -16777216, -1));
                        i2.translate(d28Var.getX(), d28Var.getY());
                        view.draw(i2);
                        lx4Var.j();
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
        v28 v28Var = this.e1;
        pb0 pb0Var = this.d1;
        if (i4 >= 0) {
            if (j == y6c.h(this.s2).e()) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.s1 = z5;
            TLRPC.User V1 = na7.q1(this.s2).V1(Long.valueOf(this.r1));
            TL_account.RequirementToContact J2 = na7.q1(this.s2).J2(this.r1);
            if (!y6c.h(this.s2).p() && (J2 instanceof TL_account.requirementToContactPremium)) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.v1 = z6;
            this.x1 = cf3.j(J2);
            pb0Var.q(V1);
            v28Var.a.getImageReceiver().U(V1, pb0Var, null);
            R0(this.r1, true, false);
        } else {
            this.s1 = false;
            this.t1 = true;
            if (!this.I1.g(j)) {
                boolean z7 = w01.a;
            } else {
                this.r3 = true;
            }
            TLRPC.Chat K0 = na7.q1(this.s2).K0(Long.valueOf(-this.r1));
            boolean V = hc2.V(K0);
            this.u1 = !V;
            if (!V && na7.q1(this.s2).L0(-this.r1) == null) {
                ad7.Y(this.s2).C0(-this.r1, true, new CountDownLatch(1), false, false, 0);
            }
            if (this.u1 && !hc2.q(K0)) {
                z = true;
            } else {
                z = false;
            }
            this.v1 = z;
            this.x1 = na7.q1(this.s2).K1(this.r1);
            pb0Var.p(K0);
            v28Var.a.getImageReceiver().U(K0, pb0Var, null);
            R0(this.r1, true, false);
        }
        if (this.A1 && (this.s1 || this.t1)) {
            g2b g2bVar = this.I1;
            long j2 = this.r1;
            vf6 vf6Var = g2bVar.m;
            ifc ifcVar = (ifc) vf6Var.f(j2);
            if (ifcVar == null) {
                ifcVar = new ifc(g2bVar.a, j2, g2bVar);
                vf6Var.k(ifcVar, j2);
            }
            ifcVar.b(true);
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
        d28 d28Var = this.S0;
        m8b m8bVar = this.z0;
        int i5 = 8;
        x28 x28Var = this.E1;
        if (z8) {
            r0();
            if (this.R1 == null && (this.u1 || x28Var.f)) {
                l0();
            }
            if (this.R1 != null) {
                TLRPC.Chat K02 = na7.q1(this.s2).K0(Long.valueOf(-this.r1));
                q18 q18Var = this.R1;
                if (x28Var.f || (!A0() && this.u1 && (hc2.q(K02) || hc2.s0(K02)))) {
                    i5 = 0;
                }
                q18Var.setVisibility(i5);
                q18 q18Var2 = this.R1;
                boolean z9 = x28Var.f;
                v0(true);
                q18Var2.J1(z9);
                q18 q18Var3 = this.R1;
                if (x28Var.f && !v0(true) && (this.l2 || this.R1.X0)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                q18Var3.Q1(z4, true);
                gt3 editField = this.R1.getEditField();
                long j3 = this.r1;
                TL_stories.StoryItem storyItem = x28Var.a;
                m8bVar.getClass();
                editField.setText(m8b.x(j3, storyItem));
                this.R1.C1(this.s2, this.r1);
                this.R1.q2(K02, null);
            }
            gn gnVar = this.G0;
            f53 f53Var = this.r0;
            if (gnVar == null) {
                gn gnVar2 = new gn(false, false, false);
                this.G0 = gnVar2;
                y18 y18Var = this.t0;
                gnVar2.setCallback(y18Var);
                this.G0.u(f53Var.h(bkb.F6));
                this.G0.w(gl.L(14.0f));
                this.I0 = new lm(y18Var);
            }
            y18 y18Var2 = this.F0;
            if (y18Var2 != null && this.H0 == null) {
                gn gnVar3 = new gn(false, false, false);
                this.H0 = gnVar3;
                gnVar3.setCallback(y18Var2);
                this.H0.u(f53Var.h(bkb.F6));
                this.H0.w(gl.L(14.0f));
                this.J0 = new lm(y18Var2);
            }
            if (i == -1) {
                f1();
            }
            c1(false);
            this.q1 = getStoriesCount();
            d28Var.invalidate();
            invalidate();
        } else if (this.s1) {
            r0();
            boolean z10 = x28Var.f;
            y18 y18Var3 = this.M1;
            if (z10) {
                y18Var3.setVisibility(8);
                if (this.R1 == null) {
                    l0();
                }
                this.R1.setVisibility(0);
            } else {
                y18Var3.setVisibility(0);
                q18 q18Var4 = this.R1;
                if (q18Var4 != null) {
                    q18Var4.setVisibility(8);
                }
            }
            q18 q18Var5 = this.R1;
            if (q18Var5 != null) {
                boolean z11 = x28Var.f;
                v0(true);
                q18Var5.J1(z11);
                q18 q18Var6 = this.R1;
                if (x28Var.f && !v0(true) && (this.l2 || this.R1.X0)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                q18Var6.Q1(z3, true);
            }
            if (i == -1) {
                ArrayList arrayList = this.p1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(m8bVar.P0));
                    if (indexOf < 0 && !this.p1.isEmpty()) {
                        if (m8bVar.P0 > ((Integer) this.p1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (m8bVar.P0 < ((Integer) b00.f(1, this.p1)).intValue()) {
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
            d28Var.invalidate();
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
                if ((this.v1 && !x28Var.f) || this.w1) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                linearLayout.setVisibility(i3);
            }
            g4b g4bVar = this.Z1;
            if (g4bVar != null) {
                g4bVar.setVisibility(8);
            }
            if (i == -1) {
                f1();
            }
            c1(false);
            q18 q18Var7 = this.R1;
            if (q18Var7 != null) {
                if (!A0() && !l7c.C(this.r1)) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                q18Var7.setVisibility(i2);
                q18 q18Var8 = this.R1;
                boolean z12 = x28Var.f;
                v0(true);
                q18Var8.J1(z12);
                q18 q18Var9 = this.R1;
                if (x28Var.f && !v0(true) && (this.l2 || this.R1.X0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                q18Var9.Q1(z2, true);
                gt3 editField2 = this.R1.getEditField();
                long j4 = this.r1;
                TL_stories.StoryItem storyItem2 = x28Var.a;
                m8bVar.getClass();
                editField2.setText(m8b.x(j4, storyItem2));
                this.R1.C1(this.s2, this.r1);
                TLRPC.UserFull W1 = na7.q1(this.s2).W1(this.r1);
                if (W1 != null) {
                    this.R1.q2(null, W1);
                } else {
                    na7.q1(this.s2).Z2(na7.q1(this.s2).V1(Long.valueOf(this.r1)), this.p2, false, null);
                }
            }
            this.q1 = getStoriesCount();
            y18 y18Var4 = this.M1;
            if (y18Var4 != null) {
                y18Var4.setVisibility(8);
            }
            d28Var.invalidate();
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
                textView.setText(k96.M0(2131748631, null));
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
                i = 2131744425;
            } else {
                i = 2131744253;
            }
            textView.setText(k96.M0(i, null));
        }
        TextView textView3 = this.Y1;
        if (textView3 != null) {
            textView3.setVisibility(0);
            this.Y1.setText(k96.M0(2131744252, null));
        }
    }

    public final void f0() {
        i28 i28Var = this.A0;
        if (i28Var.W.w()) {
            i28Var.W.e(false);
        }
    }

    public final void f1() {
        TL_stories.PeerStories peerStories;
        int i;
        ArrayList arrayList = this.p1;
        m8b m8bVar = this.z0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.m1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i = arrayList2.size();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    long j = ((f2b) arrayList2.get(i2)).a;
                    if (((int) (j ^ (j >>> 32))) == m8bVar.P0) {
                        this.z1 = i2;
                        return;
                    }
                }
            } else {
                i = 0;
            }
            int indexOf = this.p1.indexOf(Integer.valueOf(m8bVar.P0));
            if (indexOf < 0 && !this.p1.isEmpty()) {
                if (m8bVar.P0 > ((Integer) this.p1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (m8bVar.P0 < ((Integer) b00.f(1, this.p1)).intValue()) {
                    indexOf = this.p1.size() - 1;
                }
            }
            this.z1 = i + indexOf;
        } else {
            int i3 = m8bVar.e1.get(this.r1, -1);
            this.z1 = i3;
            if (i3 == -1 && !m8bVar.N0 && (peerStories = this.k1) != null && peerStories.max_read_id > 0) {
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
            ((d8b) this.G1).d.U();
        }
    }

    public final void g1(boolean z) {
        a8 a8Var = this.t3;
        if (a8Var != null && this.s3 != null && a8Var.getVisibility() == 0) {
            if (z) {
                if (Math.abs(m8b.B1 - 0.2f) < 0.05f) {
                    this.t3.setSubtext(k96.M0(2131743332, null));
                } else if (Math.abs(m8b.B1 - 0.5f) < 0.05f) {
                    this.t3.setSubtext(k96.M0(2131743334, null));
                } else if (Math.abs(m8b.B1 - 1.0f) < 0.05f) {
                    this.t3.setSubtext(k96.M0(2131743335, null));
                } else if (Math.abs(m8b.B1 - 1.5f) < 0.05f) {
                    this.t3.setSubtext(k96.M0(2131743336, null));
                } else {
                    int i = (Math.abs(m8b.B1 - 2.0f) > 0.05f ? 1 : (Math.abs(m8b.B1 - 2.0f) == 0.05f ? 0 : -1));
                    a8 a8Var2 = this.t3;
                    if (i < 0) {
                        a8Var2.setSubtext(k96.M0(2131743333, null));
                    } else {
                        a8Var2.setSubtext(k96.a0(null, null, 2131743337, cla.a(m8b.B1).concat("x")));
                    }
                }
            }
            this.s3.w0(z, m8b.B1);
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
        d28 d28Var = this.S0;
        Bitmap createBitmap = Bitmap.createBitmap(d28Var.getWidth(), d28Var.getHeight(), Bitmap.Config.ARGB_8888);
        w0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.z1;
    }

    public g2b getStoriesController() {
        return na7.q1(this.s2).M1();
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
            e18 e18Var = this.E3;
            gl.r(e18Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.I1.B;
            this.R1.N(true);
            boolean z2 = this.v1;
            x28 x28Var = this.E1;
            if ((z2 && !x28Var.f) || this.w1) {
                this.a3 = false;
                this.R1.setEnabled(false);
                this.R1.L1(" ", z);
            } else if (this.x1 > 0) {
                this.a3 = false;
                this.R1.setEnabled(true);
                this.R1.L1(jva.S0(k96.a0(null, null, 2131743687, k96.E(this.x1, ','))), z);
            } else {
                if (!x28Var.f && tL_storiesStealthMode != null) {
                    int currentTime = ConnectionsManager.getInstance(this.s2).getCurrentTime();
                    int i2 = tL_storiesStealthMode.active_until_date;
                    if (currentTime < i2) {
                        this.a3 = true;
                        int currentTime2 = i2 - ConnectionsManager.getInstance(this.s2).getCurrentTime();
                        int i3 = currentTime2 / 60;
                        int i4 = currentTime2 % 60;
                        Locale locale = Locale.US;
                        String a0 = k96.a0(null, null, 2131744651, String.format(locale, "%02d:%02d", 99, 99));
                        this.R1.setEnabled(true);
                        int i5 = ((((int) this.R1.getEditField().getPaint().measureText(a0)) * 1.2f) > this.R1.getEditField().getMeasuredWidth() ? 1 : ((((int) this.R1.getEditField().getPaint().measureText(a0)) * 1.2f) == this.R1.getEditField().getMeasuredWidth() ? 0 : -1));
                        q18 q18Var = this.R1;
                        if (i5 >= 0) {
                            String a02 = k96.a0(null, null, 2131744651, "");
                            String format = String.format(locale, "%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i4));
                            q18Var.e = a02;
                            q18Var.f = format;
                            q18Var.m2(z);
                        } else {
                            q18Var.L1(k96.a0(null, null, 2131744652, String.format(locale, "%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i4))), z);
                        }
                        gl.d3(e18Var, 1000L);
                        return;
                    }
                }
                this.a3 = false;
                this.R1.setEnabled(true);
                boolean z3 = x28Var.f;
                q18 q18Var2 = this.R1;
                if (z3) {
                    long starsPrice = q18Var2.getStarsPrice();
                    int i6 = (starsPrice > 0L ? 1 : (starsPrice == 0L ? 0 : -1));
                    q18 q18Var3 = this.R1;
                    if (i6 > 0) {
                        q18Var3.L1(jva.Y0(false, k96.a0(null, null, 2131751992, k96.E((int) starsPrice, ',')), this.R1.K6), z);
                        cm2 cm2Var = this.R1.K6[0];
                        if (cm2Var != null) {
                            cm2Var.H = 0.9f;
                            return;
                        }
                        return;
                    }
                    q18Var3.L1(k96.M0(2131751993, null), z);
                    return;
                }
                if (this.u1) {
                    i = 2131746057;
                } else {
                    i = 2131746062;
                }
                q18Var2.L1(k96.M0(i, null), z);
            }
        }
    }

    public final void h1() {
        TL_stories.PeerStories x;
        y1b y1bVar;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.l1;
        arrayList.clear();
        m8b m8bVar = this.z0;
        if (m8bVar.N0) {
            if (!m8bVar.S0) {
                arrayList.add(m8bVar.T0);
            }
        } else {
            ArrayList arrayList2 = this.p1;
            int i = 0;
            ArrayList arrayList3 = this.m1;
            if (arrayList2 != null && (y1bVar = m8bVar.O0) != null) {
                if (y1bVar instanceof s1b) {
                    arrayList3.clear();
                    ArrayList E = na7.q1(this.s2).M1().E(this.r1);
                    String str = ((s1b) m8bVar.O0).E;
                    if (E != null) {
                        for (int i2 = 0; i2 < E.size(); i2++) {
                            f2b f2bVar = (f2b) E.get(i2);
                            f4b f4bVar = f2bVar.c;
                            if (f4bVar != null && !f4bVar.g && TextUtils.equals(f4bVar.K0, str)) {
                                arrayList3.add(f2bVar);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.p1;
                int size = arrayList4.size();
                while (i < size) {
                    Object obj = arrayList4.get(i);
                    i++;
                    k27 f = m8bVar.O0.f(((Integer) obj).intValue());
                    if (f != null && (storyItem = f.l) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (m8bVar.O0 != null) {
                while (i < m8bVar.O0.i.size()) {
                    arrayList.add(((k27) m8bVar.O0.i.get(i)).l);
                    i++;
                }
            } else {
                TL_stories.PeerStories peerStories = m8bVar.Q0;
                if (peerStories != null && cf3.n(peerStories.peer) == this.r1) {
                    x = m8bVar.Q0;
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
                t09 t09Var = this.h3;
                if (i > 0) {
                    gl.t1(t09Var.getReactionsWindow().c);
                    return true;
                }
                t09Var.getReactionsWindow().d();
                return true;
            }
            W0(false);
            return true;
        }
        b28 b28Var = this.Z0;
        if (b28Var != null) {
            je5 je5Var = b28Var.c;
            if (je5Var != null) {
                je5Var.f(true);
                b28Var.c = null;
            }
            b28Var.b = null;
            b28Var.invalidate();
            b28Var.b(false);
        }
        i28 i28Var = this.A0;
        if (i28Var.W.w()) {
            i28Var.W.e(false);
            return true;
        }
        je5 je5Var2 = this.v0;
        if (je5Var2 != null) {
            je5Var2.f(true);
        }
        je5 je5Var3 = this.w0;
        if (je5Var3 != null) {
            je5Var3.f(true);
        }
        ke5 ke5Var = this.M2;
        if (ke5Var != null) {
            ke5Var.a();
        }
        s28 s28Var = this.j1;
        if (s28Var != null && s28Var.a) {
            s28Var.a();
            return true;
        }
        q18 q18Var = this.R1;
        if (q18Var != null && q18Var.S0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.r0, getContext());
            boolean z = this.R1.d1;
            hd hdVar = alertDialog$Builder.a;
            if (z) {
                hdVar.S = k96.M0(2131751383, null);
                hdVar.U = k96.M0(2131751384, null);
            } else {
                hdVar.S = k96.M0(2131751380, null);
                hdVar.U = k96.M0(2131751381, null);
            }
            alertDialog$Builder.j(k96.M0(2131751382, null), new b18(this, (byte) 0));
            alertDialog$Builder.g(k96.M0(2131751759, null), null);
            ((d8b) this.G1).h(hdVar);
            return true;
        }
        t09 t09Var2 = this.V1;
        if (t09Var2 != null && t09Var2.getReactionsWindow() != null && !this.V1.getReactionsWindow().q) {
            this.V1.getReactionsWindow().d();
            return true;
        }
        q18 q18Var2 = this.R1;
        if (q18Var2 != null && q18Var2.Q0()) {
            int i2 = this.o2;
            q18 q18Var3 = this.R1;
            if (i2 > 0) {
                gl.t1(q18Var3.getEmojiView());
                return true;
            }
            q18Var3.K0(true, false, true);
            return true;
        } else if (getKeyboardHeight() >= gl.L(20.0f)) {
            q18 q18Var4 = this.R1;
            if (q18Var4 != null) {
                long j = this.r1;
                TL_stories.StoryItem storyItem = this.E1.a;
                Editable editText = q18Var4.getEditText();
                this.z0.getClass();
                m8b.N(j, storyItem, editText);
            }
            gl.t1(this.R1);
            return true;
        } else if (i28Var.getVisibility() != 0 || i28Var.getProgressToBlackout() <= 0.0f) {
            return false;
        } else {
            i28Var.D();
            this.W2 = false;
            this.S0.invalidate();
            return true;
        }
    }

    public final void i1(boolean z) {
        String M0;
        int i;
        uy1 uy1Var;
        boolean z2;
        String M02;
        float f;
        float f2;
        float f3;
        boolean z3;
        int i2;
        boolean z4;
        x28 x28Var = this.E1;
        TL_stories.StoryItem storyItem = x28Var.a;
        if (storyItem == null) {
            storyItem = x28Var.c;
        }
        boolean z5 = this.t1;
        if (z5 || this.s1) {
            if (storyItem != null) {
                TL_stories.StoryViews storyViews = storyItem.views;
                m8b m8bVar = this.z0;
                y18 y18Var = this.t0;
                if (z5) {
                    if (storyViews == null) {
                        storyViews = new TL_stories.TL_storyViews();
                        storyItem.views = storyViews;
                    }
                    if (storyViews.views_count <= 0) {
                        storyViews.views_count = 1;
                    }
                    gn gnVar = this.H0;
                    if (gnVar != null && (i2 = storyViews.forwards_count) > 0) {
                        String num = Integer.toString(i2);
                        if (z && this.L0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        gnVar.t(num, z4, true);
                        this.L0 = true;
                    } else {
                        this.L0 = false;
                    }
                    int i3 = storyItem.views.reactions_count;
                    if (i3 > 0) {
                        gn gnVar2 = this.G0;
                        String num2 = Integer.toString(i3);
                        if (z && this.K0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        gnVar2.t(num2, z3, true);
                        this.K0 = true;
                        z2 = true;
                    } else {
                        this.K0 = false;
                        z2 = false;
                    }
                    float f4 = 0.0f;
                    if (!z) {
                        lm lmVar = this.I0;
                        if (z2) {
                            f2 = 1.0f;
                        } else {
                            f2 = 0.0f;
                        }
                        lmVar.e(true, f2);
                        lm lmVar2 = this.J0;
                        if (lmVar2 != null) {
                            if (this.L0) {
                                f3 = 1.0f;
                            } else {
                                f3 = 0.0f;
                            }
                            lmVar2.e(true, f3);
                        }
                    }
                    TLRPC.Chat K0 = na7.q1(this.s2).K0(Long.valueOf(-this.r1));
                    if ((!this.u1 || (!hc2.q(K0) && !hc2.s0(K0))) && storyItem.views.views_count > 0) {
                        TextView textView = this.q2;
                        if (m8bVar.O0 == null) {
                            M02 = k96.M0(2131747931, null);
                        } else {
                            M02 = k96.M0(2131747930, null);
                        }
                        textView.setText(M02);
                        this.q2.setTranslationX(gl.L(16.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "d  ");
                        spannableStringBuilder.setSpan(new cm2(2131231187, 0), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                        spannableStringBuilder.append((CharSequence) gl.o0(storyItem.views.views_count, 0));
                        this.q2.setText(spannableStringBuilder);
                    } else {
                        this.q2.setText("");
                    }
                    ViewGroup.LayoutParams layoutParams = y18Var.getLayoutParams();
                    float L = gl.L(40.0f);
                    if (this.K0) {
                        f = this.G0.d + gl.L(4.0f);
                    } else {
                        f = 0.0f;
                    }
                    layoutParams.width = (int) (L + f);
                    ((ViewGroup.MarginLayoutParams) this.M1.getLayoutParams()).rightMargin = gl.L(40.0f) + y18Var.getLayoutParams().width;
                    y18 y18Var2 = this.F0;
                    if (y18Var2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = y18Var2.getLayoutParams();
                        float L2 = gl.L(40.0f);
                        if (this.L0) {
                            f4 = this.H0.d + gl.L(4.0f);
                        }
                        layoutParams2.width = (int) (L2 + f4);
                        ((ViewGroup.MarginLayoutParams) this.M1.getLayoutParams()).rightMargin += y18Var2.getLayoutParams().width;
                        y18Var2.requestLayout();
                    }
                    this.M1.requestLayout();
                    y18Var.requestLayout();
                    this.r2.setVisibility(8);
                    this.v2.setVisibility(8);
                    TL_stories.StoryItem storyItem2 = x28Var.a;
                    b28 b28Var = this.Z0;
                    if (storyItem2 == null) {
                        b28Var.getClass();
                        return;
                    }
                    for (int i4 = 0; i4 < b28Var.getChildCount(); i4++) {
                        if (b28Var.getChildAt(i4) instanceof c6b) {
                            ((c6b) b28Var.getChildAt(i4)).c(storyItem2.views, z);
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
                            TLObject Z1 = na7.q1(this.s2).Z1(storyItem.views.recent_viewers.get(i6).longValue());
                            if (Z1 != null) {
                                this.r2.b(i7, this.s2, Z1);
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
                        uy1Var = this.r2;
                        if (i8 >= i) {
                            break;
                        }
                        uy1Var.b(i8, this.s2, null);
                        i8++;
                    }
                    uy1Var.a(false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(k96.H(',', "Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        cm2 cm2Var = new cm2(2131231984, 0);
                        cm2Var.y = -53704;
                        cm2Var.n = gl.L(0.2f);
                        spannableStringBuilder2.setSpan(cm2Var, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        cm2 cm2Var2 = new cm2(2131231975, 0);
                        cm2Var2.y = -14161823;
                        cm2Var2.n = gl.L(0.2f);
                        spannableStringBuilder2.setSpan(cm2Var2, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.q2.setText(spannableStringBuilder2);
                    uy1 uy1Var2 = this.r2;
                    if (i7 == 0) {
                        uy1Var2.setVisibility(8);
                        this.q2.setTranslationX(gl.L(16.0f));
                    } else {
                        uy1Var2.setVisibility(0);
                        this.q2.setTranslationX(gl.L(10.0f) + oo1.h(i7, 1, gl.L(20.0f), gl.L(24.0f) + gl.L(13.0f)));
                    }
                    this.v2.setVisibility(0);
                } else {
                    TextView textView2 = this.q2;
                    if (m8bVar.O0 == null) {
                        M0 = k96.M0(2131747931, null);
                    } else {
                        M0 = k96.M0(2131747930, null);
                    }
                    textView2.setText(M0);
                    this.q2.setTranslationX(gl.L(16.0f));
                    this.r2.setVisibility(8);
                    this.v2.setVisibility(8);
                }
                y18Var.getLayoutParams().width = gl.L(40.0f);
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
            x31 x31Var = new x31(this, getContext(), this.r0);
            this.y2 = x31Var;
            x31Var.W3 = new u18(this);
            x31Var.d2.h0();
            x31 x31Var2 = this.y2;
            x31Var2.Q1 = true;
            x31Var2.Z0();
            x31 x31Var3 = this.y2;
            x31Var3.R1 = new v18(this);
            x31Var3.U0().setText(this.R1.getFieldText());
        }
    }

    public final void j1() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z;
        q18 q18Var;
        float heightWithTopView;
        float f6;
        float f7;
        float f8;
        float L;
        int i;
        float f9;
        float f10;
        int i2;
        y18 y18Var;
        ImageView imageView;
        i28 i28Var;
        y18 y18Var2;
        boolean z2;
        float f11;
        t09 t09Var;
        float f12;
        int i3;
        float f13;
        float f14;
        float f15 = ((d8b) this.G1).d.W;
        if (this.B2) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        lm lmVar = this.E2;
        lmVar.e(false, f);
        int i4 = this.j2;
        if (i4 != 0 && this.k2) {
            f2 = moe.a(this.x2 / i4, 0.0f, 1.0f);
        } else if (this.l2) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        lm lmVar2 = this.M3;
        float f16 = lmVar2.c;
        lm lmVar3 = this.N3;
        float f17 = lmVar3.c;
        lm lmVar4 = this.O3;
        float f18 = lmVar4.c;
        if (this.w2) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        lmVar2.e(false, f3);
        if (!this.Y2) {
            q18 q18Var2 = this.R1;
            if (q18Var2 != null && !TextUtils.isEmpty(q18Var2.getFieldText())) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            lmVar3.e(false, f14);
        }
        q18 q18Var3 = this.R1;
        if (q18Var3 != null && q18Var3.p4) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        lmVar4.e(false, f4);
        final q18 q18Var4 = this.R1;
        if (q18Var4 != null) {
            y28 y28Var = q18Var4.w7;
            f5 = 1.0f;
            int backgroundTop = q18Var4.getBackgroundTop();
            int i5 = q18Var4.t7;
            if (i5 != 0 && backgroundTop != i5) {
                int i6 = (q18Var4.J2 + i5) - backgroundTop;
                q18Var4.setAnimatedTop(i6);
                y28Var.L2 = true;
                ValueAnimator valueAnimator = y28Var.U1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    y28Var.U1.cancel();
                }
                View view = q18Var4.w2;
                if (view != null && view.getVisibility() == 0) {
                    q18Var4.w2.setTranslationY(((1.0f - q18Var4.getTopViewEnterProgress()) * q18Var4.w2.getLayoutParams().height) + q18Var4.J2);
                }
                y28Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i6, 0.0f);
                y28Var.U1 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        byte b = r2;
                        q18 q18Var5 = q18Var4;
                        switch (b) {
                            case 0:
                                q18Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                y28 y28Var2 = q18Var5.w7;
                                y28Var2.L2 = true;
                                y28Var2.invalidate();
                                q18Var5.invalidate();
                                return;
                            default:
                                q18Var5.F0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                y28Var.U1.addListener(new v85(q18Var4, (byte) 28));
                y28Var.U1.setDuration(250L);
                y28Var.U1.setInterpolator(la2.V);
                y28Var.U1.start();
                q18Var4.t7 = 0;
            }
            if (q18Var4.d4) {
                float scrollY = (q18Var4.v7 - q18Var4.F0.getScrollY()) + (q18Var4.u7 - q18Var4.F0.getMeasuredHeight());
                ex1 ex1Var = q18Var4.F0;
                ex1Var.setOffsetY(ex1Var.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(q18Var4.F0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        byte b = r2;
                        q18 q18Var5 = q18Var4;
                        switch (b) {
                            case 0:
                                q18Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                y28 y28Var2 = q18Var5.w7;
                                y28Var2.L2 = true;
                                y28Var2.invalidate();
                                q18Var5.invalidate();
                                return;
                            default:
                                q18Var5.F0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = q18Var4.s7;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                q18Var4.s7 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(la2.V);
                ofFloat2.start();
                q18Var4.d4 = false;
                y28Var.j1();
            }
            q18Var4.getMeasuredHeight();
        } else {
            f5 = 1.0f;
        }
        q18 q18Var5 = this.R1;
        if (q18Var5 != null && q18Var5.Q0()) {
            z = true;
        } else {
            z = false;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        boolean z3 = this.n2;
        Paint paint = this.d2;
        if (z3) {
            paint.setColor(bm2.f(this.g2, -14933463, bkb.p1(0.44f, -16777216)));
            float f19 = f5;
            paint.setAlpha((int) ((f19 - this.T3) * tb4.z(f19, this.h2, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(bm2.o(-16777216, (int) ((f5 - this.T3) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z4 = this.L2;
        m8b m8bVar = this.z0;
        if (z4 || this.P3 != m8bVar.e0 || lmVar.c != this.G2 || this.i2 != this.x2 || f2 != this.g2 || f15 != this.h2 || f16 != lmVar2.c || z || f18 != lmVar4.c || f17 != lmVar3.c) {
            this.L2 = false;
            this.i2 = this.x2;
            int i7 = (lmVar.c > this.G2 ? 1 : (lmVar.c == this.G2 ? 0 : -1));
            d28 d28Var = this.S0;
            if (i7 != 0) {
                d28Var.invalidate();
            }
            if (f15 != 0.0f) {
                d28Var.setLayerType(2, null);
            } else {
                d28Var.setLayerType(0, null);
            }
            this.G2 = lmVar.c;
            this.h2 = f15;
            this.g2 = f2;
            this.P3 = m8bVar.e0;
            float height = this.x2 - (getHeight() - d28Var.getBottom());
            if (this.R1 == null) {
                heightWithTopView = 0.0f;
            } else {
                heightWithTopView = q18Var.getHeightWithTopView() * f2;
            }
            float max = Math.max(0.0f, height + heightWithTopView);
            float height2 = this.e2 - (getHeight() - d28Var.getBottom());
            q18 q18Var6 = this.R1;
            if (q18Var6 == null) {
                f7 = 0.0f;
            } else {
                float heightWithTopView2 = q18Var6.getHeightWithTopView();
                if (this.l2) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                f7 = heightWithTopView2 * f6;
            }
            float max2 = Math.max(0.0f, height2 + f7);
            q18 q18Var7 = this.R1;
            if (q18Var7 != null) {
                if (this.T1 != null) {
                    ImageView suggestButton = q18Var7.getSuggestButton();
                    if (suggestButton != null) {
                        this.T1.o(1.0f, -(gl.L(74.0f) - suggestButton.getTranslationX()));
                    }
                    this.T1.setTranslationY(-((getHeight() - this.R1.getY()) + gl.L(6.0f)));
                }
                gt3 editField = this.R1.getEditField();
                k4a senderSelectView = this.R1.getSenderSelectView();
                if (editField != null) {
                    f8 = 6.0f;
                    f13 = 1.0f;
                    float R1 = gl.R1(0.88f, 1.0f, f2);
                    editField.setScaleX(R1);
                    editField.setScaleY(R1);
                } else {
                    f8 = 6.0f;
                    f13 = 1.0f;
                }
                if (senderSelectView != null) {
                    float R12 = gl.R1(0.8f, f13, f2);
                    senderSelectView.setScaleX(R12);
                    senderSelectView.setScaleY(R12);
                    senderSelectView.setTranslationY(gl.U1(f2, -gl.L(2.0f), 0));
                }
            } else {
                f8 = 6.0f;
            }
            if (this.n2) {
                L = 0.0f;
            } else {
                L = gl.L(58.0f) * (1.0f - f2);
            }
            float max3 = Math.max(0.0f, L + max);
            if (!this.n2 && !this.l2) {
                i = gl.L(58.0f);
            } else {
                i = 0;
            }
            float max4 = Math.max(0.0f, max2 + i);
            float L2 = (gl.L(f8) * f2) + max3;
            l18 l18Var = this.B0;
            fu fuVar = l18Var.c;
            l18Var.L = L2;
            if (Math.abs(l18Var.M - max4) > 0.1f) {
                l18Var.M = max4;
                f9 = 0.8f;
                i2 = 0;
                f10 = 8.0f;
                fuVar.setPadding(gl.L(8.0f), Math.max(0, ((int) max4) - fuVar.getTop()) + gl.L(7.5f), gl.L(8.0f), gl.L(7.5f));
                if (!fuVar.canScrollVertically(1)) {
                    l18Var.d.g1(0, gl.L(100.0f));
                }
            } else {
                f9 = 0.8f;
                f10 = 8.0f;
                i2 = 0;
            }
            l18Var.setTranslationY(-l18Var.L);
            l18Var.invalidate();
            u76 u76Var = m8bVar.E0;
            if (u76Var != null) {
                u76Var.setKeyboardOffset(max);
            }
            t09 t09Var2 = this.V1;
            x28 x28Var = this.E1;
            if (t09Var2 != null) {
                if (this.g2 > 0.0f && (x28Var == null || !x28Var.f)) {
                    i3 = i2;
                } else {
                    i3 = 8;
                }
                t09Var2.setVisibility(i3);
            }
            int i8 = i2;
            while (true) {
                int childCount = getChildCount();
                y18Var = this.F0;
                imageView = this.D0;
                i28Var = this.A0;
                y18Var2 = this.t0;
                if (i8 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() == 0 && childAt != this.M1 && childAt.getTag(2131296593) == null && childAt != i28Var.W.m(getContext())) {
                    q18 q18Var8 = this.R1;
                    if (q18Var8 != null && childAt == q18Var8.getEmojiView()) {
                        childAt.setTranslationY(this.R1.getEmojiView().getMeasuredHeight() - this.x2);
                    } else if (childAt instanceof ke5) {
                        ke5 ke5Var = (ke5) childAt;
                        View view2 = ke5Var.c;
                        if (view2 != null) {
                            ke5Var.d(view2);
                        }
                    } else if (childAt != this.z2 && childAt != d28Var && childAt != imageView && childAt != this.E0 && childAt != y18Var && childAt != this.M2 && childAt != this.T1 && childAt != y18Var2 && ((t09Var = this.h3) == null || t09Var.getReactionsWindow() == null || childAt != this.h3.getReactionsWindow().c)) {
                        float f20 = this.g2;
                        f20 = (childAt == this.N1 || childAt == this.P1 || childAt == this.Q1 || childAt == this.O1) ? 0.0f : 0.0f;
                        float f21 = 1.0f - f20;
                        float L3 = (((((-this.A2) * f21) - (gl.L(7.0f) * f20)) - this.x2) - (gl.L(f10) * f21)) - (gl.L(20.0f) * m8bVar.e0);
                        if (childAt == this.N1 || childAt == this.P1 || childAt == this.Q1 || childAt == this.O1) {
                            L3 += this.x2;
                        }
                        if (this.n2) {
                            f12 = (1.0f - this.h2) * hideInterfaceAlpha;
                        } else {
                            f12 = hideInterfaceAlpha * 1.0f;
                        }
                        if (childAt == this.R2) {
                            L3 = m8bVar.e0 * (-gl.L(20.0f));
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
                            float f22 = (1.0f - lmVar3.c) * (1.0f - f18) * (1.0f - lmVar2.c) * this.g2;
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
                            q18 q18Var9 = this.R1;
                            if (q18Var9 == null || childAt != q18Var9.E2) {
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
            y18Var2.setAlpha((1.0f - this.T3) * f26);
            if (y18Var != null) {
                y18Var.setAlpha((1.0f - this.T3) * f26);
            }
            for (int i9 = 0; i9 < d28Var.getChildCount(); i9++) {
                View childAt2 = d28Var.getChildAt(i9);
                if (childAt2 != null && childAt2 != this.C0) {
                    v28 v28Var = this.e1;
                    a6 a6Var = this.o0;
                    if (childAt2 != v28Var && childAt2 != this.m0 && childAt2 != this.n0 && childAt2 != a6Var && childAt2 != this.M1 && childAt2 != i28Var && childAt2 != this.s0) {
                        childAt2.setAlpha(hideInterfaceAlpha);
                    } else {
                        if (childAt2 == a6Var) {
                            f11 = this.U2;
                        } else {
                            f11 = 1.0f;
                        }
                        float f27 = this.T3;
                        if (childAt2 == i28Var) {
                            childAt2.setAlpha((1.0f - f27) * f11 * hideInterfaceAlpha);
                        } else {
                            childAt2.setAlpha((1.0f - f27) * f11 * hideInterfaceAlpha);
                        }
                    }
                }
            }
            if (this.R1 != null) {
                float L4 = gl.L(40.0f);
                if (!x28Var.f) {
                    if (this.I2) {
                        L4 += gl.L(46.0f);
                    }
                    if (this.J2 && this.t1) {
                        L4 += gl.L(46.0f);
                    }
                    if (y18Var2.getVisibility() == 0) {
                        L4 = (L4 - gl.L(40.0f)) + y18Var2.getLayoutParams().width;
                    }
                } else {
                    float L5 = gl.L(46.0f);
                    L4 = gl.L(46.0f);
                    kh7 kh7Var = this.Q1;
                    if (kh7Var != null && kh7Var.getVisibility() == 0) {
                        L4 += gl.L(46.0f);
                    }
                    f25 = L5;
                }
                q18 q18Var10 = this.R1;
                float f28 = -gl.L(10.0f);
                float f29 = -(gl.L(10.0f) + L4 + f25);
                float f30 = this.g2;
                if ((this.I2 || this.u1) && !x28Var.f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                q18Var10.I1(f28, f29, f30, z2);
                if (this.R1.getEmojiView() != null) {
                    this.R1.getEmojiView().setAlpha(this.g2);
                }
            }
        }
    }

    public final void k0() {
        if (this.N1 == null && getContext() != null) {
            jm2 jm2Var = new jm2(getContext(), this.x3);
            this.N1 = jm2Var;
            jm2Var.setOnClickListener(new g18(this, (byte) 1));
            addView(this.N1, nme.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void l0() {
        f53 f53Var = this.r0;
        q18 q18Var = new q18(this, gl.W(getContext()), this, new gu0(f53Var, (byte) 4));
        this.R1 = q18Var;
        gt3 editField = q18Var.getEditField();
        editField.getClass();
        xs3 xs3Var = new xs3(editField, (byte) 0);
        editField.u0 = xs3Var;
        xs3Var.q(true);
        editField.u0.u(editField.y0);
        editField.u0.w(editField.getPaint().getTextSize());
        xs3 xs3Var2 = new xs3(editField, (byte) 1);
        editField.v0 = xs3Var2;
        xs3Var2.b = 5;
        xs3Var2.u(editField.y0);
        editField.v0.w(editField.getPaint().getTextSize());
        this.R1.getEditField().setScaleX(0.0f);
        this.R1.setOverrideKeyboardAnimation(true);
        this.R1.setClipChildren(false);
        this.R1.setDelegate(new r18(this));
        setDelegate(this.R1);
        q18 q18Var2 = this.R1;
        q18Var2.X5 = false;
        q18Var2.Y5 = true;
        if (this.E1.f) {
            q18Var2.w1(false, false, false);
        } else {
            q18Var2.w1(true, true, false);
        }
        this.R1.updateColors();
        q18 q18Var3 = this.R1;
        q18Var3.Z5 = true;
        addView(q18Var3, nme.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.D3 != null) {
            this.R1.v2(false);
        }
        this.R1.w3 = this.p2;
        c30 c30Var = this.C2;
        ((ArrayList) c30Var.g).add(this.S0);
        ((ArrayList) c30Var.g).add(this);
        if (this.Q0) {
            this.R1.e1();
        }
        h0(false);
        if (A0()) {
            this.R1.setVisibility(8);
        }
        dz1 dz1Var = new dz1(getContext(), f53Var, this.x3, this.v3);
        this.S1 = dz1Var;
        dz1Var.setOnClickListener(new b18(this, (byte) 1));
        addView(this.S1, nme.e(57, 300, 85));
        this.S1.setVisibility(8);
        this.R1.setSideButtonsForAttach(this.S1);
        this.y0 = getChildCount();
    }

    public final void m0() {
        if (this.Z1 != null) {
            return;
        }
        g4b g4bVar = new g4b(getContext(), this.r0);
        this.Z1 = g4bVar;
        g4bVar.setOnClickListener(new g18(this, (byte) 4));
        this.Z1.setAlpha(0.0f);
        this.Z1.setVisibility(8);
        addView(this.Z1, nme.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void n0() {
        boolean z;
        if (this.Q1 == null && getContext() != null) {
            kh7 kh7Var = new kh7(getContext(), this.x3);
            this.Q1 = kh7Var;
            kh7Var.setOnClickListener(new g18(this, (byte) 5));
            kh7 kh7Var2 = this.Q1;
            t76 t76Var = t76.N;
            boolean z2 = true;
            if (t76Var != null && t76Var.r()) {
                z = true;
            } else {
                z = false;
            }
            kh7Var2.b(z, false);
            kh7 kh7Var3 = this.Q1;
            t76 t76Var2 = t76.N;
            if (t76Var2 != null && !t76Var2.G) {
                z2 = false;
            }
            kh7Var3.a(z2, false);
            addView(this.Q1, nme.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void o0() {
        if (this.P1 == null && getContext() != null) {
            this.O1 = new vr7(getContext(), this.s2);
            wr7 wr7Var = new wr7(getContext(), this.O1, this.x3);
            this.P1 = wr7Var;
            wr7Var.setOnClickListener(new g18(this, (byte) 6));
            this.P1.setOnLongClickListener(new d18(this, (byte) 1));
            addView(this.P1, nme.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
            addView(this.O1, nme.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
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
        q18 q18Var = this.R1;
        if (q18Var != null) {
            q18Var.e1();
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.X0;
            if (i < arrayList.size()) {
                ((b09) arrayList.get(i)).b(true);
                i++;
            } else {
                kk7.f(this.s2).b(this, kk7.S);
                kk7.f(this.s2).b(this, kk7.F2);
                kk7.f(this.s2).b(this, kk7.x5);
                kk7.f(this.s2).b(this, kk7.n3);
                kk7.f(this.s2).b(this, kk7.z5);
                kk7.f(this.s2).b(this, kk7.F5);
                kk7.f(this.s2).b(this, kk7.c3);
                kk7.f(this.s2).b(this, kk7.j3);
                kk7.f(this.s2).b(this, kk7.E);
                kk7.e().b(this, kk7.k4);
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
        q18 q18Var = this.R1;
        if (q18Var != null) {
            q18Var.d1();
        }
        vl vlVar = this.e3;
        if (vlVar != null) {
            vlVar.o(this);
            this.e3 = null;
        }
        xl xlVar = this.c3;
        if (xlVar != null) {
            xlVar.d(this);
            this.c3 = null;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.X0;
            if (i < arrayList.size()) {
                ((b09) arrayList.get(i)).b(false);
                i++;
            } else {
                kk7.f(this.s2).n(this, kk7.S);
                kk7.f(this.s2).n(this, kk7.F2);
                kk7.f(this.s2).n(this, kk7.x5);
                kk7.f(this.s2).n(this, kk7.n3);
                kk7.f(this.s2).n(this, kk7.z5);
                kk7.f(this.s2).n(this, kk7.F5);
                kk7.f(this.s2).n(this, kk7.c3);
                kk7.f(this.s2).n(this, kk7.j3);
                kk7.f(this.s2).n(this, kk7.E);
                kk7.e().n(this, kk7.k4);
                return;
            }
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.n1.d.setBounds(0, 0, getMeasuredWidth(), gl.L(72.0f));
    }

    @Override
    public final void onMeasure(int r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y28.onMeasure(int, int):void");
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
        imageView.setImageResource(2131231980);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.X1 = textView;
        textView.setTextColor(-8026747);
        this.X1.setTextSize(1, 16.0f);
        TextView textView2 = this.X1;
        if (this.u1) {
            i = 2131744425;
        } else {
            i = 2131744253;
        }
        textView2.setText(k96.M0(i, null));
        TextView textView3 = new TextView(getContext());
        this.Y1 = textView3;
        textView3.setTextColor(-1);
        this.Y1.setTextSize(1, 12.0f);
        TextView textView4 = this.Y1;
        int L = gl.L(40.0f);
        textView4.setBackground(bkb.i0(L, L, L, L, 452984831, 855638015, 855638015));
        this.Y1.setGravity(17);
        ote.a(this.Y1);
        this.Y1.setText(k96.M0(2131744252, null));
        this.Y1.setPadding(gl.L(7.0f), 0, gl.L(7.0f), 0);
        this.W1.addView(imageView, nme.t(22, 22, 16, 12, 1, 4, 0));
        this.W1.addView(this.X1, nme.s(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.W1.addView(this.Y1, nme.s(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.R1.addView(this.W1, nme.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    public final void q0() {
        if (this.R2 != null) {
            return;
        }
        wb wbVar = new wb(getContext(), (byte) 29);
        this.R2 = wbVar;
        wbVar.setTextSize(1, 14.0f);
        this.R2.setTextColor(bm2.f(0.5f, -16777216, -1));
        this.R2.setGravity(19);
        this.R2.setText(k96.M0(2131744251, null));
        addView(this.R2, nme.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void r0() {
        if (this.M1 != null) {
            return;
        }
        y18 y18Var = new y18(this, getContext(), (byte) 0);
        this.M1 = y18Var;
        y18Var.setClickable(true);
        addView(this.M1, nme.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        s71 s71Var = new s71(this, getContext());
        this.v2 = s71Var;
        s71Var.setOnClickListener(new g18(this, (byte) 0));
        this.M1.addView(this.v2, nme.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        uy1 uy1Var = new uy1((byte) 1, getContext(), false);
        this.r2 = uy1Var;
        uy1Var.setAvatarsTextSize(gl.L(18.0f));
        this.M1.addView(this.r2, nme.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.q2 = textView;
        textView.setTextSize(1, 14.0f);
        this.q2.setTextColor(-1);
        this.M1.addView(this.q2, nme.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.n1.s);
        s71 s71Var2 = this.v2;
        int L = gl.L(15.0f);
        int o = bm2.o(-1, 120);
        s71Var2.setBackground(bkb.i0(L, L, L, L, 0, o, o));
        imageView.setBackground(bkb.N(bm2.o(-1, 120), -gl.L(2.0f), -gl.L(2.0f)));
    }

    public final void s0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (!A0() && !this.E1.f) {
            boolean p = y6c.h(this.s2).p();
            f53 f53Var = this.r0;
            if (p) {
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232398, k96.M0(2131744650, null), false, f53Var).setOnClickListener(new g18(this, (byte) 8));
                return;
            }
            Drawable drawable = getContext().getDrawable(2131232174);
            drawable.setColorFilter(new PorterDuffColorFilter(bm2.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            m18 m18Var = new m18(getContext().getDrawable(2131232386), drawable, (byte) 0);
            a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232398, k96.M0(2131744650, null), false, f53Var);
            c.setOnClickListener(new g18(this, (byte) 9));
            c.setIcon(m18Var);
        }
    }

    public void setAccount(int i) {
        this.s2 = i;
        this.I1 = na7.q1(i).e0;
        this.a1.b = i;
        t09 t09Var = this.V1;
        if (t09Var != null) {
            t09Var.setCurrentAccount(i);
            this.V1.m(null, null, true);
        }
        t09 t09Var2 = this.h3;
        if (t09Var2 != null) {
            t09Var2.setCurrentAccount(i);
        }
    }

    public void setActive(boolean z) {
        O0(0L, z);
    }

    public void setDelegate(t28 t28Var) {
        this.G1 = t28Var;
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
                bg7 bg7Var = this.L3;
                if (z) {
                    gl.r(bg7Var);
                    gl.d3(bg7Var, 250L);
                    return;
                }
                gl.r(bg7Var);
                m8b m8bVar = ((d8b) this.G1).d;
                m8bVar.l1 = true;
                m8bVar.U();
            }
        }
    }

    public void setPaused(boolean z) {
        if (this.H1 != z) {
            this.H1 = z;
            ml mlVar = this.U0;
            if (z) {
                mlVar.x0();
                mlVar.u0 = false;
            } else {
                mlVar.w0(false);
                mlVar.u0 = true;
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
        textView.setTypeface(gl.o());
        textView.setGravity(1);
        textView.setTextSize(1, 16.0f);
        textView.setText(k96.M0(2131744213, null));
        int i = bkb.F6;
        f53 f53Var = this.r0;
        zkb.X(textView, i, f53Var);
        TextView textView2 = new TextView(getContext());
        ote.a(textView2);
        textView2.setText(k96.M0(2131754227, null));
        int i2 = bkb.Ii;
        zkb.X(textView2, i2, f53Var);
        textView2.setPadding(gl.L(16.0f), gl.L(12.0f), gl.L(16.0f), gl.L(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(gl.o());
        textView2.setTextSize(1, 15.0f);
        int L = gl.L(8.0f);
        int i3 = bkb.Ei;
        int v0 = bkb.v0(i3, f53Var);
        int o = bm2.o(bkb.v0(i2, f53Var), 30);
        ff0 i0 = bkb.i0(L, L, L, L, v0, o, o);
        vkb M = zkb.M(i3);
        vkb g = zkb.g(i2, 30);
        textView2.setBackground(i0);
        zkb.j(textView2, i0, M, g, f53Var);
        textView2.setOnClickListener(new g18(this, (byte) 3));
        linearLayout.addView(textView, nme.o(-1, -2));
        linearLayout.addView(textView2, nme.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, nme.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.S0.addView(frameLayout);
        this.Q2 = frameLayout;
    }

    public final void u0() {
        int i;
        int i2;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.r0, getContext());
        if (A0()) {
            i = 2131751552;
        } else {
            i = 2131751475;
        }
        String M0 = k96.M0(i, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        if (A0()) {
            i2 = 2131751553;
        } else {
            i2 = 2131751476;
        }
        hdVar.U = k96.M0(i2, null);
        alertDialog$Builder.j(k96.M0(2131751586, null), new b18(this, (byte) 2));
        alertDialog$Builder.g(k96.M0(2131752577, null), new fi7((byte) 26));
        ((d8b) this.G1).h(hdVar);
        hdVar.h();
    }

    public final boolean v0(boolean z) {
        t76 t76Var;
        TLRPC.Peer l;
        long e = y6c.h(this.s2).e();
        int i = (this.r1 > 0L ? 1 : (this.r1 == 0L ? 0 : -1));
        m8b m8bVar = this.z0;
        if (i < 0) {
            t76 t76Var2 = m8bVar.B0;
            if (t76Var2 != null && z) {
                TLRPC.Peer l2 = t76Var2.l();
                TLRPC.Chat K0 = na7.q1(this.s2).K0(Long.valueOf(-this.r1));
                if (m8bVar.B0.o() || hc2.w(14, K0)) {
                    if (l2 == null || this.r1 == cf3.n(l2) || cf3.n(l2) == y6c.h(this.s2).e()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } else if (m8bVar != null && (t76Var = m8bVar.B0) != null && t76Var.o()) {
            if (!z || (l = m8bVar.B0.l()) == null || this.r1 == cf3.n(l) || cf3.n(l) == e || this.r1 == e) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public final void w0(Canvas canvas, int i, int i2) {
        c30 c30Var = this.C2;
        if (((ix) c30Var.e) != null) {
            if (((SurfaceView) c30Var.d) != null) {
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                if (Build.VERSION.SDK_INT >= 24) {
                    gl.y0((SurfaceView) c30Var.d, createBitmap);
                }
                if (createBitmap != null) {
                    canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                    return;
                }
                return;
            }
            TextureView textureView = (TextureView) c30Var.f;
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
        d28 d28Var = this.S0;
        canvas.scale(i / d28Var.getMeasuredWidth(), i2 / d28Var.getMeasuredHeight());
        this.U0.h(canvas, null);
        canvas.restore();
    }

    public final void x0(w5b w5bVar, TL_stories.StoryItem storyItem) {
        int i;
        View[] viewPages;
        t28 t28Var = this.G1;
        Context context = getContext();
        if (storyItem.pinned) {
            i = Integer.MAX_VALUE;
        } else {
            i = storyItem.expire_date - storyItem.date;
        }
        y5b y5bVar = new y5b(context, i, this.r0);
        y5bVar.R0(w5bVar);
        vq1 vq1Var = y5bVar.l1;
        if (vq1Var != null) {
            for (View view : vq1Var.getViewPages()) {
                if (view instanceof t5b) {
                    ((t5b) view).f(false);
                }
            }
        }
        y5bVar.L0(true);
        y5bVar.N1 = new dx6(this, storyItem, (byte) 12);
        ((d8b) t28Var).h(y5bVar);
    }

    public final boolean y0(android.view.ViewGroup r11, float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y28.y0(android.view.ViewGroup, float, float, boolean):boolean");
    }

    public final boolean z0(View view, MotionEvent motionEvent) {
        float x = getX();
        d28 d28Var = this.S0;
        float x2 = view.getX() + d28Var.getX() + x;
        float y = view.getY() + d28Var.getY() + getY();
        if (motionEvent.getX() >= x2 && motionEvent.getX() <= x2 + view.getWidth() && motionEvent.getY() >= y && motionEvent.getY() <= y + view.getHeight()) {
            return true;
        }
        return false;
    }
}
