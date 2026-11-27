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
public abstract class o68 extends wma implements fn7 {
    public static final int O3 = 0;
    public hn A0;
    public k68 A1;
    public float A2;
    public final u48 A3;
    public hn B0;
    public boolean B1;
    public long B2;
    public final ArrayList B3;
    public mm C0;
    public c6b C1;
    public boolean C2;
    public final ArrayList C3;
    public mm D0;
    public boolean D1;
    public boolean D2;
    public boolean D3;
    public boolean E0;
    public boolean E1;
    public boolean E2;
    public boolean E3;
    public boolean F0;
    public boolean F1;
    public boolean F2;
    public final ki7 F3;
    public long G0;
    public o58 G1;
    public lg5 G2;
    public final mm G3;
    public long H0;
    public dn2 H1;
    public final de8 H2;
    public final mm H3;
    public boolean I0;
    public bv7 I1;
    public boolean I2;
    public final mm I3;
    public boolean J0;
    public cv7 J1;
    public m58 J2;
    public float J3;
    public boolean K0;
    public tj7 K1;
    public FrameLayout K2;
    public final Path K3;
    public boolean L0;
    public g58 L1;
    public xb L2;
    public boolean L3;
    public final t58 M0;
    public vz1 M1;
    public boolean M2;
    public ValueAnimator M3;
    public final FrameLayout N0;
    public kg5 N1;
    public i58 N2;
    public float N3;
    public final nl O0;
    public ValueAnimator O1;
    public float O2;
    public final ImageReceiver P0;
    public i49 P1;
    public boolean P2;
    public final ImageReceiver Q0;
    public LinearLayout Q1;
    public boolean Q2;
    public final ArrayList R0;
    public TextView R1;
    public boolean R2;
    public Runnable S0;
    public TextView S1;
    public boolean S2;
    public final r58 T0;
    public d8b T1;
    public boolean T2;
    public final tv3 U0;
    public ViewPropertyAnimator U1;
    public boolean U2;
    public g3a V0;
    public final jl0 V1;
    public final ImageReceiver V2;
    public float W0;
    public final jl0 W1;
    public yl W2;
    public final rb0 X0;
    public final Paint X1;
    public final ImageReceiver X2;
    public final l68 Y0;
    public int Y1;
    public wl Y2;
    public final e8b Z0;
    public ValueAnimator Z1;
    public boolean Z2;
    public ykf a1;
    public float a2;
    public boolean a3;
    public int b1;
    public float b2;
    public i49 b3;
    public b8 c1;
    public float c2;
    public boolean c3;
    public j68 d1;
    public int d2;
    public float d3;
    public TL_stories.PeerStories e1;
    public boolean e2;
    public boolean e3;
    public final ArrayList f1;
    public boolean f2;
    public float f3;
    public final ImageView g0;
    public final ArrayList g1;
    public boolean g2;
    public int g3;
    public final ImageView h0;
    public final m68 h1;
    public boolean h2;
    public int h3;
    public final b6 i0;
    public final bn9 i1;
    public int i2;
    public int i3;
    public final e29 j0;
    public ArrayList j1;
    public final int j2;
    public u48 j3;
    public final ImageView k0;
    public int k1;
    public TextView k2;
    public float k3;
    public final x53 l0;
    public long l1;
    public mz1 l2;
    public boolean l3;
    public final x9b m0;
    public boolean m1;
    public int m2;
    public rx6 m3;
    public final o58 n0;
    public boolean n1;
    public int n2;
    public b8 n3;
    public h6b o0;
    public boolean o1;
    public boolean o2;
    public b8 o3;
    public kg5 p0;
    public boolean p1;
    public a81 p2;
    public final ll0 p3;
    public kg5 q0;
    public boolean q1;
    public boolean q2;
    public final rz4 q3;
    public kg5 r0;
    public long r1;
    public float r2;
    public final cl0 r3;
    public int s0;
    public final float s1;
    public f41 s2;
    public TL_stories.TL_premium_boostsStatus s3;
    public final lcb t0;
    public int t1;
    public q t2;
    public wg1 t3;
    public final y58 u0;
    public boolean u1;
    public int u2;
    public long u3;
    public final b58 v0;
    public int v1;
    public boolean v2;
    public long v3;
    public final View w0;
    public int w1;
    public final d30 w2;
    public boolean w3;
    public final ImageView x0;
    public int x1;
    public final pn x2;
    public TLRPC.TL_channels_sendAsPeers x3;
    public final LinearLayout y0;
    public final n68 y1;
    public final mm y2;
    public final u48 y3;
    public final o58 z0;
    public final fp z1;
    public final mm z2;
    public int z3;

    public o68(Context context, final lcb lcbVar, m68 m68Var, x53 x53Var) {
        super(context, null);
        this.L0 = true;
        this.R0 = new ArrayList();
        this.b1 = -5;
        this.s1 = 1.0f;
        n68 n68Var = new n68(this);
        this.y1 = n68Var;
        this.a2 = -1.0f;
        this.b2 = -1.0f;
        this.c2 = -1.0f;
        this.j2 = ConnectionsManager.generateClassGuid();
        this.y2 = new mm(this);
        this.z2 = new mm(this);
        de8 de8Var = new de8();
        this.H2 = de8Var;
        this.O2 = 1.0f;
        this.y3 = new u48(this, (byte) 0);
        this.A3 = new u48(this, (byte) 1);
        this.B3 = new ArrayList();
        this.C3 = new ArrayList();
        this.F3 = new ki7(this, (byte) 6);
        this.G3 = new mm(this);
        this.H3 = new mm(this);
        this.I3 = new mm(this);
        this.K3 = new Path();
        de8Var.E = new v34(this, (byte) 21);
        ?? obj = new Object();
        obj.g = new ArrayList();
        this.w2 = obj;
        this.x2 = new pn(null);
        this.f1 = new ArrayList();
        this.g1 = new ArrayList();
        nl nlVar = new nl(this, (byte) 5);
        this.O0 = nlVar;
        nlVar.B0 = false;
        nlVar.A1 = true;
        nlVar.y = true;
        nlVar.T(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.V2 = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.y = true;
        imageReceiver.T(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.X2 = imageReceiver2;
        imageReceiver2.A1 = true;
        imageReceiver2.y = true;
        imageReceiver2.T(3);
        ImageReceiver imageReceiver3 = new ImageReceiver(null);
        this.P0 = imageReceiver3;
        imageReceiver3.A1 = true;
        imageReceiver3.y = true;
        imageReceiver3.T(0);
        ImageReceiver imageReceiver4 = new ImageReceiver(null);
        this.Q0 = imageReceiver4;
        imageReceiver4.A1 = true;
        imageReceiver4.y = true;
        imageReceiver4.T(0);
        nlVar.a = Arrays.asList(imageReceiver3, imageReceiver4);
        this.X0 = new rb0((vnb) null);
        this.t0 = lcbVar;
        this.h1 = m68Var;
        this.z1 = m68Var.g;
        this.C1 = uc7.s1(yac.t0).O1();
        m68Var.l.setColor(-16777216);
        this.X1 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.l0 = x53Var;
        setClipChildren(false);
        r58 r58Var = new r58(this, context, this.M0, x53Var, lcbVar);
        this.T0 = r58Var;
        cl0 cl0Var = new cl0(x53Var, aob.Je, 0.8f);
        this.r3 = cl0Var;
        oz4 oz4Var = new oz4();
        oz4Var.a(vm2.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT >= 31 && xea.e()) {
            rz4 rz4Var = new rz4(oz4Var);
            this.q3 = rz4Var;
            rz4Var.l(hl.L(8.0f));
            oz4Var = rz4Var;
        } else {
            this.q3 = null;
        }
        yic yicVar = new yic(this);
        ll0 ll0Var = new ll0(oz4Var, oz4Var, oz4Var);
        ll0Var.h = yicVar;
        ll0Var.i = this;
        this.p3 = ll0Var;
        this.V1 = ll0Var.c(this, cl0Var, false);
        jl0 c = ll0Var.c(this, cl0Var, false);
        this.W1 = c;
        c.u(hl.L(32.0f));
        t58 t58Var = new t58(this, context, m68Var, lcbVar);
        this.M0 = t58Var;
        t58Var.setClipChildren(false);
        this.U0 = new tv3(this.m2, t58Var);
        t58Var.addView(r58Var, tre.c(-1.0f, -1));
        y58 y58Var = new y58(this, getContext(), lcbVar.E, lcbVar, x53Var);
        this.u0 = y58Var;
        y58Var.b0.setOnClickListener(new v48(this, (byte) 1));
        ImageView imageView = new ImageView(context);
        this.x0 = imageView;
        imageView.setImageDrawable(m68Var.m);
        int L = hl.L(8.0f);
        imageView.setPadding(L, L, L, L);
        imageView.setOnClickListener(new v48(this, (byte) 2));
        imageView.setContentDescription(ob6.M0(2131745187, null));
        iye.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(m68Var.n);
        imageView2.setPadding(L, L, L, L);
        o58 o58Var = new o58(this, getContext(), (byte) 1);
        this.z0 = o58Var;
        hn hnVar = this.B0;
        if (hnVar != null) {
            hnVar.setCallback(o58Var);
        }
        o58Var.setWillNotDraw(false);
        o58Var.setOnClickListener(new v48(this, (byte) 3));
        o58 o58Var2 = new o58(this, getContext(), (byte) 2);
        this.n0 = o58Var2;
        hn hnVar2 = this.A0;
        if (hnVar2 != null) {
            hnVar2.setCallback(o58Var2);
        }
        o58Var2.setWillNotDraw(false);
        o58Var2.setOnClickListener(new v48(this, (byte) 4));
        o58Var2.setOnLongClickListener(new v0(this, lcbVar, (byte) 3));
        h6b h6bVar = new h6b(context, m68Var);
        this.o0 = h6bVar;
        h6bVar.setPadding(L, L, L, L);
        o58Var2.addView(this.o0, tre.e(40, 40, 3));
        o58Var.addView(imageView2, tre.e(40, 40, 3));
        iye.b(o58Var2, 0.3f, 5.0f);
        iye.b(o58Var, 0.3f, 5.0f);
        nlVar.A1 = true;
        nlVar.p0(t58Var);
        bn9 bn9Var = new bn9(10);
        this.i1 = bn9Var;
        t58Var.setOutlineProvider(bn9Var);
        t58Var.setClipToOutline(true);
        addView(t58Var);
        l68 l68Var = new l68(context, n68Var);
        this.Y0 = l68Var;
        l68Var.setOnClickListener(new View.OnClickListener(this) {
            public final o68 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                int i;
                byte b = r3;
                lcb lcbVar2 = lcbVar;
                o68 o68Var = this.b;
                switch (b) {
                    case 0:
                        if (o68Var.y1.h()) {
                            lcbVar2.T();
                            if (!lcb.D1) {
                                uc7.e1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            b6 b6Var = o68Var.i0;
                            if (!lcb.D1) {
                                i = 2131748068;
                            } else {
                                i = 2131743504;
                            }
                            b6Var.setContentDescription(ob6.M0(i, null));
                            return;
                        }
                        o68Var.X0(true);
                        return;
                    default:
                        long j = yac.h(o68Var.m2).n;
                        long j2 = o68Var.l1;
                        if (j == j2) {
                            Bundle j3 = qu6.j(1, "type");
                            j3.putLong("dialog_id", o68Var.l1);
                            lcbVar2.L(new em6(j3, null));
                            return;
                        } else if (j2 > 0) {
                            lcbVar2.L(ProfileActivity.Q2(j2));
                            return;
                        } else {
                            lcbVar2.L(zu1.ha(j2));
                            return;
                        }
                }
            }
        });
        t58Var.addView(l68Var, tre.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.N0 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.y0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, tre.r(40, 40, 5));
        linearLayout.addView(o58Var, tre.r(40, 40, 5));
        linearLayout.addView(o58Var2, tre.r(40, 40, 5));
        addView(linearLayout, tre.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.g0 = imageView3;
        imageView3.setImageDrawable(m68Var.q);
        imageView3.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        imageView3.setBackground(aob.f0(-1, 1, -1));
        imageView3.setContentDescription(ob6.M0(2131754834, null));
        t58Var.addView(imageView3, tre.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.h0 = imageView4;
        imageView4.setImageDrawable(m68Var.r);
        imageView4.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        imageView4.setBackground(aob.f0(-1, 1, -1));
        imageView4.setContentDescription(ob6.M0(2131754803, null));
        t58Var.addView(imageView4, tre.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new am7(lcbVar, (byte) 9));
        imageView3.setOnClickListener(new nh(this, x53Var, lcbVar, context, m68Var, (byte) 11));
        b6 b6Var = new b6(context, (byte) 23);
        this.i0 = b6Var;
        t58Var.addView(b6Var, tre.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ?? imageView5 = new ImageView(context);
        this.j0 = imageView5;
        imageView5.setPadding(hl.L(6.0f), hl.L(6.0f), hl.L(6.0f), hl.L(6.0f));
        b6Var.addView(imageView5);
        ImageView imageView6 = new ImageView(context);
        this.k0 = imageView6;
        imageView6.setPadding(hl.L(6.0f), hl.L(6.0f), hl.L(6.0f), hl.L(6.0f));
        imageView6.setImageDrawable(m68Var.t);
        b6Var.addView(imageView6);
        imageView6.setVisibility(8);
        x9b x9bVar = new x9b(context);
        this.m0 = x9bVar;
        x9bVar.setOnClickListener(new v48(this, (byte) 0));
        t58Var.addView(x9bVar, tre.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        b6Var.setOnClickListener(new View.OnClickListener(this) {
            public final o68 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                int i;
                byte b = r3;
                lcb lcbVar2 = lcbVar;
                o68 o68Var = this.b;
                switch (b) {
                    case 0:
                        if (o68Var.y1.h()) {
                            lcbVar2.T();
                            if (!lcb.D1) {
                                uc7.e1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            b6 b6Var2 = o68Var.i0;
                            if (!lcb.D1) {
                                i = 2131748068;
                            } else {
                                i = 2131743504;
                            }
                            b6Var2.setContentDescription(ob6.M0(i, null));
                            return;
                        }
                        o68Var.X0(true);
                        return;
                    default:
                        long j = yac.h(o68Var.m2).n;
                        long j2 = o68Var.l1;
                        if (j == j2) {
                            Bundle j3 = qu6.j(1, "type");
                            j3.putLong("dialog_id", o68Var.l1);
                            lcbVar2.L(new em6(j3, null));
                            return;
                        } else if (j2 > 0) {
                            lcbVar2.L(ProfileActivity.Q2(j2));
                            return;
                        } else {
                            lcbVar2.L(zu1.ha(j2));
                            return;
                        }
                }
            }
        });
        this.Z0 = new e8b(this, m68Var);
        t58Var.addView(y58Var, tre.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.w0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        b58 b58Var = new b58(this, context, lcbVar, lcbVar.w, view, frameLayout, lcbVar);
        this.v0 = b58Var;
        t58Var.addView(view, tre.e(-1, 200, 87));
        t58Var.addView(b58Var, tre.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        t58Var.addView(frameLayout, tre.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int L2 = hl.L(20.0f);
        int o = vm2.o(-1, 100);
        b6Var.setBackground(aob.i0(L2, L2, L2, L2, 0, o, o));
        int L3 = hl.L(20.0f);
        int o2 = vm2.o(-1, 100);
        imageView3.setBackground(aob.i0(L3, L3, L3, L3, 0, o2, o2));
        int L4 = hl.L(20.0f);
        int o3 = vm2.o(-1, 100);
        imageView4.setBackground(aob.i0(L4, L4, L4, L4, 0, o3, o3));
        int L5 = hl.L(20.0f);
        int o4 = vm2.o(-1, 100);
        imageView.setBackground(aob.i0(L5, L5, L5, L5, 0, o4, o4));
        int L6 = hl.L(20.0f);
        int o5 = vm2.o(-1, 100);
        o58Var2.setBackground(aob.i0(L6, L6, L6, L6, 0, o5, o5));
        int L7 = hl.L(20.0f);
        int o6 = vm2.o(-1, 100);
        o58Var.setBackground(aob.i0(L7, L7, L7, L7, 0, o6, o6));
        jmb jmbVar = y58Var.W;
        View m = jmbVar.m(context);
        hl.B2(m);
        addView(m);
        jmbVar.D = new ur1(this, (byte) 2);
        jmbVar.Q(this);
    }

    public static void Q0(b6b b6bVar, ImageReceiver imageReceiver, String str) {
        if (b6bVar.s) {
            imageReceiver.Y(null, null, jn5.g(b6bVar.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.Z(jn5.g(b6bVar.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public k5 getAccountInstance() {
        return k5.a(this.m2);
    }

    public float getHideInterfaceAlpha() {
        float f;
        float f2 = 1.0f - this.y2.c;
        g4a g4aVar = this.t0.x;
        if (g4aVar == null) {
            f = 0.0f;
        } else {
            f = g4aVar.f;
        }
        return (1.0f - f) * f2;
    }

    public long getMessageMinPrice() {
        lcb lcbVar;
        if (!this.y1.f || (lcbVar = this.t0) == null || lcbVar.B0 == null || v0(true)) {
            return 0L;
        }
        return lcbVar.B0.m();
    }

    public final boolean A0() {
        u5b u5bVar;
        lcb lcbVar = this.t0;
        if (lcbVar != null && (u5bVar = lcbVar.O0) != null && u5bVar.e == 4) {
            return true;
        }
        return false;
    }

    public final boolean B0() {
        TLRPC.User X1;
        if (A0() && (X1 = uc7.s1(this.m2).X1(Long.valueOf(this.t0.O0.d))) != null && X1.bot && X1.bot_can_edit) {
            return true;
        }
        return false;
    }

    public abstract boolean C0();

    public final void D0(ValueAnimator valueAnimator) {
        float f;
        this.N3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f2 = (-hl.L(8.0f)) * this.N3;
        l68 l68Var = this.Y0;
        l68Var.setTranslationY(f2);
        l68Var.setAlpha(1.0f - this.N3);
        float f3 = (-hl.L(8.0f)) * this.N3;
        ImageView imageView = this.g0;
        imageView.setTranslationY(f3);
        imageView.setAlpha(1.0f - this.N3);
        float f4 = (-hl.L(8.0f)) * this.N3;
        ImageView imageView2 = this.h0;
        imageView2.setTranslationY(f4);
        imageView2.setAlpha(1.0f - this.N3);
        float f5 = (-hl.L(8.0f)) * this.N3;
        b6 b6Var = this.i0;
        b6Var.setTranslationY(f5);
        b6Var.setAlpha((1.0f - this.N3) * this.O2);
        o58 o58Var = this.G1;
        if (o58Var != null) {
            o58Var.setTranslationY(hl.L(8.0f) * this.N3);
            this.G1.setAlpha(1.0f - this.N3);
        }
        x9b x9bVar = this.m0;
        if (x9bVar != null) {
            x9bVar.setTranslationY((-hl.L(8.0f)) * this.N3);
            x9bVar.setAlpha(1.0f - this.N3);
        }
        this.u0.setAlpha(1.0f - this.N3);
        k68 k68Var = this.A1;
        if (k68Var == null) {
            f = 0.0f;
        } else {
            f = ((ccb) k68Var).d.W;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        o58 o58Var2 = this.n0;
        if (o58Var2 != null) {
            o58Var2.setAlpha((1.0f - this.N3) * (1.0f - f) * hideInterfaceAlpha);
        }
        ImageView imageView3 = this.x0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - this.N3) * (1.0f - f) * hideInterfaceAlpha);
        }
        o58 o58Var3 = this.z0;
        if (o58Var3 != null) {
            o58Var3.setAlpha((1.0f - this.N3) * (1.0f - f) * hideInterfaceAlpha);
        }
        g58 g58Var = this.L1;
        if (g58Var != null) {
            g58Var.setAlpha(1.0f - this.N3);
            invalidate();
        }
        this.M0.invalidate();
    }

    public final void E0(w49 w49Var) {
        boolean z;
        boolean z2;
        int i;
        TLRPC.Reaction reaction;
        n68 n68Var = this.y1;
        TL_stories.StoryItem storyItem = n68Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        if (reaction2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (reaction2 != null && w49Var == null) {
            b0();
            this.C1.i0(this.l1, n68Var.a, null);
        } else if (w49Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(this.m2).r.get("❤");
            if (tL_availableReaction != null) {
                this.Z2 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a = s49.a();
                jn5 b = jn5.b(document);
                ImageReceiver imageReceiver = this.V2;
                imageReceiver.d0(b, a, null, null, null, 0);
                if (imageReceiver.y() != null) {
                    imageReceiver.y().I(0, false, true);
                }
                this.a3 = true;
                this.C1.i0(this.l1, n68Var.a, w49.c(tL_availableReaction));
            }
        } else {
            b0();
            this.C1.i0(this.l1, n68Var.a, w49Var);
        }
        TL_stories.StoryItem storyItem2 = n68Var.a;
        o58 o58Var = this.n0;
        if (storyItem2 != null && (reaction = storyItem2.sent_reaction) != null) {
            z = !z;
            this.o0.setReaction(w49.d(reaction));
            o58Var.setContentDescription(ob6.M0(2131754845, null));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z2 = true;
        } else {
            this.o0.setReaction(null);
            o58Var.setContentDescription(ob6.M0(2131754846, null));
            z2 = false;
        }
        if (this.n1 && z) {
            TL_stories.StoryItem storyItem3 = n68Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = n68Var.a.views;
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
        TL_stories.StoryItem storyItem4 = n68Var.a;
        z49.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        i1(true);
    }

    public final void F0() {
        w96 w96Var;
        boolean z;
        if (this.x3 == null) {
            lcb lcbVar = this.t0;
            if (lcbVar != null && (w96Var = lcbVar.B0) != null) {
                TLRPC.GroupCall groupCall = w96Var.s;
                if (groupCall == null) {
                    z = false;
                } else {
                    z = !groupCall.messages_enabled;
                }
                if (z) {
                    return;
                }
            }
            TLRPC.TL_channels_sendAsPeers L1 = uc7.s1(this.m2).L1(this.l1, true);
            this.x3 = L1;
            g58 g58Var = this.L1;
            if (g58Var != null && L1 != null) {
                g58Var.I2(true);
            }
        }
    }

    public final boolean G0() {
        g58 g58Var = this.L1;
        if (g58Var == null) {
            return false;
        }
        boolean z = g58Var.o3;
        if (z) {
            g58Var.h2();
        }
        hl.d3(new u48(this, (byte) 5), 300L);
        return z;
    }

    public final void H0() {
        long j;
        a58 a58Var;
        nx0 nx0Var;
        int i;
        long j2;
        uc7.e1().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.L1.getTextWithEntities();
        long e = yac.h(this.m2).e();
        TLRPC.Peer l = this.t0.B0.l();
        if (l != null) {
            e = wf3.n(l);
        }
        Context context = getContext();
        int i2 = this.m2;
        String r = wf3.r(i2, this.l1);
        long messageMinPrice = getMessageMinPrice();
        long j3 = this.u3;
        a58 a58Var2 = new a58(this, (byte) 0);
        x53 x53Var = new x53();
        nx0 nx0Var2 = new nx0(1, (vnb) x53Var, context, false);
        nx0Var2.J();
        nx0Var2.w0 = false;
        LinearLayout j4 = uh9.j(context, 1);
        nx0Var2.O = j4;
        int[] iArr = uc7.s1(i2).T3;
        CharSequence j0 = r47.j0(textWithEntities, false, false, new TextPaint());
        if (j0 instanceof Spannable) {
            Spannable spannable = (Spannable) j0;
            j = j3;
            a58Var = a58Var2;
            nx0Var = nx0Var2;
            i = ((hm[]) spannable.getSpans(0, j0.length(), hm.class)).length + ((mv3[]) spannable.getSpans(0, j0.length(), mv3.class)).length;
        } else {
            j = j3;
            a58Var = a58Var2;
            nx0Var = nx0Var2;
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
            if (i <= iArr2[i3 + 3] && j0.length() <= i5) {
                max = Math.max(max, i4);
                break;
            } else {
                length--;
                iArr = iArr2;
            }
        }
        long[] jArr = {max};
        c51 c51Var = new c51(null, context, true);
        ?? obj = new Object();
        obj.c = e;
        obj.f = textWithEntities;
        obj.g = jArr[0];
        h96 h96Var = new h96(i2, context, true);
        LinearLayout j5 = uh9.j(context, 0);
        zc zcVar = new zc(context, ob6.M0(2131748568, null), x53Var);
        j5.addView(zcVar, tre.q(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        zc zcVar2 = new zc(context, ob6.M0(2131748569, null), x53Var);
        j5.addView(zcVar2, tre.q(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        zc zcVar3 = new zc(context, ob6.M0(2131748570, null), x53Var);
        j5.addView(zcVar3, tre.q(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        dg5 dg5Var = new dg5(context, x53Var, r6);
        a58 a58Var3 = a58Var;
        pcc[] pccVarArr = {new cg5(jArr, c51Var, new wm2[1], (m96) obj, h96Var, i2, zcVar, zcVar2, zcVar3, dg5Var, new boolean[]{true})};
        h96Var.set(obj);
        int i6 = 9;
        int[] iArr3 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int f = uc7.s1(i2).k4.T2.f();
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
        if (arrayList.isEmpty() || ((Integer) c00.g(1, arrayList)).intValue() < f) {
            arrayList.add(Integer.valueOf(f));
        }
        int[] iArr5 = new int[arrayList.size()];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            iArr5[i9] = ((Integer) arrayList.get(i9)).intValue();
        }
        dg5Var.f0 = iArr5;
        dg5Var.setValue((int) jArr[0]);
        j4.addView(dg5Var, tre.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        pccVarArr[0].a(Integer.valueOf((int) jArr[0]));
        j4.addView(j5, tre.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i10 = aob.j5;
        TextView b = zze.b(context, 20.0f, i10, true, x53Var);
        uh9.q(b, 17, null, 2131748565);
        j4.addView(b, tre.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b2 = zze.b(context, 14.0f, i10, false, x53Var);
        b2.setGravity(17);
        uh9.r(null, null, 2131748566, new Object[]{r}, b2);
        j4.addView(b2, tre.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        j4.addView(h96Var, tre.t(-2, -2, 17, 42, 22, 42, 20));
        j4.addView(c51Var, tre.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        nx0Var.show();
        c51Var.setOnClickListener(new lw4(a58Var3, jArr, nx0Var, (byte) 4));
    }

    public final void I0() {
        n68 n68Var = this.y1;
        if (n68Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = n68Var.a.id;
        tL_stories_exportStoryLink.peer = uc7.s1(this.m2).j1(this.l1);
        ConnectionsManager.getInstance(this.m2).sendRequest(tL_stories_exportStoryLink, new Object());
    }

    public final void J0() {
        if (this.L1 == null) {
            return;
        }
        j0();
        this.s2.d2.g0();
        this.s2.u1(-1, true);
        f41 f41Var = this.s2;
        f41Var.T1 = this.l1;
        f41Var.a1();
        this.s2.V0().setText(this.L1.getFieldText());
        ((ccb) this.A1).h(this.s2);
    }

    public final void K0() {
        Bundle bundle = new Bundle();
        long j = this.l1;
        if (j < 0) {
            bundle.putLong("chat_id", -j);
        } else {
            bundle.putLong("user_id", j);
        }
        TLRPC.Dialog S0 = uc7.s1(this.m2).S0(this.l1);
        if (S0 != null) {
            bundle.putInt("message_id", S0.top_message);
        }
        this.t0.L(new zu1(bundle));
    }

    public final void L0(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o68.L0(long):void");
    }

    public final void M0() {
        n68 n68Var = this.y1;
        TL_stories.StoryItem storyItem = n68Var.a;
        if ((storyItem == null && n68Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File f = n68Var.f();
        boolean z = n68Var.e;
        if (f != null && f.exists()) {
            MediaController.g0(f.toString(), getContext(), z ? 1 : 0, null, null, new sa((byte) 4, this, z));
            return;
        }
        V0();
    }

    public final void N0(android.net.Uri r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o68.N0(android.net.Uri):void");
    }

    public final void O0(long j, boolean z) {
        int i;
        int i2;
        n68 n68Var;
        if (this.u1 != z) {
            this.u1 = z;
            e29 e29Var = this.j0;
            int i3 = 0;
            if (z) {
                if (this.t0.a && Build.VERSION.SDK_INT < 33) {
                    lcb lcbVar = ((ccb) this.A1).d;
                    lcbVar.l1 = true;
                    lcbVar.U();
                    ki7 ki7Var = this.F3;
                    hl.r(ki7Var);
                    hl.d3(ki7Var, 100L);
                }
                L0(j);
                d1();
                e29Var.setAnimation(this.h1.u);
                this.u1 = true;
                this.Y0.a.getImageReceiver().v0(true, true);
                if (this.y1.a != null) {
                    cc4.b("StoryViewer displayed story dialogId=" + this.l1 + " storyId=" + n68Var.a.id + " " + n68Var.d());
                }
            } else {
                f0();
                e29Var.a();
                this.V0 = null;
                this.v2 = false;
                this.y2.e(true, 0.0f);
                this.M0.invalidate();
                invalidate();
                g0();
                lcb lcbVar2 = ((ccb) this.A1).d;
                lcbVar2.I0 = false;
                lcbVar2.U();
            }
            if (this.u1) {
                i = 3;
            } else {
                i = 2;
            }
            this.O0.T(i);
            if (this.u1) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            this.P0.T(i2);
            if (this.u1) {
                i3 = 2;
            }
            this.Q0.T(i3);
            if (this.m1 || this.n1) {
                c6b c6bVar = this.C1;
                long j2 = this.l1;
                boolean z2 = this.u1;
                zh6 zh6Var = c6bVar.m;
                hjc hjcVar = (hjc) zh6Var.f(j2);
                if (hjcVar == null) {
                    hjcVar = new hjc(c6bVar.a, j2, c6bVar);
                    zh6Var.k(j2, hjcVar);
                }
                hjcVar.b(z2);
            }
        }
    }

    public final void P0(int i, long j) {
        if (this.l1 != j) {
            n68 n68Var = this.y1;
            n68Var.b = null;
            n68Var.a = null;
        }
        this.l1 = j;
        this.j1 = null;
        e0(i);
        TL_stories.PeerStories peerStories = this.t0.Q0;
        c6b c6bVar = this.C1;
        boolean z = true;
        if (peerStories != null) {
            c6bVar.U(peerStories, true);
            return;
        }
        TL_stories.PeerStories x = c6bVar.x(j);
        if (x == null) {
            x = c6bVar.y(j);
        } else {
            z = false;
        }
        c6bVar.U(x, z);
    }

    public final void R0(long j, boolean z, boolean z2) {
        String str;
        if (!z && j == this.v3 && this.w3 == z2) {
            return;
        }
        this.v3 = j;
        this.w3 = z2;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        l68 l68Var = this.Y0;
        if (i >= 0) {
            if (this.m1 && !z2) {
                l68Var.b.l(ob6.M0(2131745369, null), false);
                l68Var.b.i(null);
                return;
            }
            TLRPC.User X1 = uc7.s1(this.m2).X1(Long.valueOf(j));
            if (X1 != null && X1.verified) {
                Drawable mutate = getContext().getDrawable(2131232817).mutate();
                mutate.setAlpha(255);
                zm2 zm2Var = new zm2(mutate, null);
                zm2Var.x = true;
                int L = hl.L(16.0f);
                int L2 = hl.L(16.0f);
                zm2Var.h = L;
                zm2Var.n = L2;
                l68Var.b.i(zm2Var);
            } else {
                l68Var.b.i(null);
            }
            if (X1 != null) {
                l68Var.b.l(pv3.m(hl.A2(lv2.p(X1)), l68Var.b.getPaint().getFontMetricsInt(), false, null, 0), false);
                return;
            }
            l68Var.b.l(null, false);
            return;
        }
        TLRPC.Chat M0 = uc7.s1(this.m2).M0(Long.valueOf(-j));
        ff0 ff0Var = l68Var.b;
        ff0 ff0Var2 = l68Var.b;
        if (M0 == null) {
            str = "";
        } else {
            str = M0.title;
        }
        ff0Var.l(hl.A2(str), false);
        if (M0 != null && M0.verified) {
            Drawable mutate2 = getContext().getDrawable(2131232817).mutate();
            mutate2.setAlpha(255);
            zm2 zm2Var2 = new zm2(mutate2, null);
            zm2Var2.x = true;
            int L3 = hl.L(16.0f);
            int L4 = hl.L(16.0f);
            zm2Var2.h = L3;
            zm2Var2.n = L4;
            ff0Var2.i(zm2Var2);
            return;
        }
        ff0Var2.i(null);
    }

    public final void S0(float f, float f2, g3a g3aVar) {
        this.W0 = f;
        this.k3 = 1.0f / f2;
        if (this.V0 != g3aVar) {
            this.V0 = g3aVar;
            if (g3aVar != null) {
                ImageReceiver imageReceiver = g3aVar.a;
                if (imageReceiver.n() != null) {
                    Bitmap copy = imageReceiver.n().copy(Bitmap.Config.ARGB_8888, false);
                    nl nlVar = this.O0;
                    nlVar.d0 = null;
                    nlVar.a1.setShader(null);
                    nlVar.u0(new BitmapDrawable(copy));
                }
            }
        }
    }

    public final void T0(boolean z) {
        boolean z2;
        n68 n68Var = this.y1;
        if (n68Var.a != null) {
            lcb lcbVar = this.t0;
            if (lcbVar.f != null) {
                String b = n68Var.b();
                TLRPC.Chat chat = null;
                if (z) {
                    pu0 pu0Var = new pu0(this.l0, (byte) 5);
                    if (this.n1) {
                        chat = uc7.s1(this.m2).M0(Long.valueOf(-this.l1));
                    }
                    if (uc7.s1(this.m2).k5() && ((!this.n1 && !lbc.C(this.l1)) || xc2.t0(chat))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    m58 m58Var = new m58(this, lcbVar.f.getContext(), b, b, z2, pu0Var);
                    this.J2 = m58Var;
                    m58Var.d2 = true;
                    TL_stories.StoryItem storyItem = n68Var.a;
                    storyItem.dialogId = this.l1;
                    m58Var.A2 = storyItem;
                    m58Var.n2 = new kj4(this, (byte) 24);
                    ((ccb) this.A1).h(m58Var);
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", b);
                LaunchActivity.H1.startActivityForResult(Intent.createChooser(intent, ob6.M0(2131744503, null)), 500);
            }
        }
    }

    public final void U0() {
        t58 t58Var = this.M0;
        x53 x53Var = this.l0;
        new d31(t58Var, x53Var).t(ob6.M0(2131743488, null), x53Var).j();
    }

    public final void V0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.l0, getContext());
        String M0 = ob6.M0(2131689472, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
        idVar.U = ob6.M0(2131746945, null);
        ((ccb) this.A1).h(idVar);
    }

    public final void W0(boolean z) {
        if (this.c3 != z) {
            n68 n68Var = this.y1;
            if (n68Var.a != null) {
                this.c3 = z;
                if (z) {
                    this.b3.setVisibility(0);
                }
                this.b3.setStoryItem(n68Var.a);
                lcb lcbVar = ((ccb) this.A1).d;
                lcbVar.p1 = z;
                lcbVar.U();
                float f = 0.0f;
                if (z) {
                    float f2 = this.d3;
                    if (z) {
                        f = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                    this.b3.setTransitionProgress(this.d3);
                    ofFloat.addUpdateListener(new y48(this, (byte) 1));
                    ofFloat.addListener(new d58(this, z, (byte) 0));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(k43.g);
                    ofFloat.start();
                    return;
                }
                if (this.b3.getReactionsWindow() != null) {
                    this.b3.getReactionsWindow().e();
                }
                this.b3.animate().alpha(0.0f).setDuration(150L).setListener(new e58(this, (byte) 0)).start();
            }
        }
    }

    public final void X0(boolean z) {
        int i;
        if (this.q0 == null) {
            kg5 kg5Var = new kg5(getContext(), 1);
            kg5Var.n(1.0f, -56.0f);
            this.q0 = kg5Var;
            kg5Var.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
            this.M0.addView(this.q0, tre.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        kg5 kg5Var2 = this.q0;
        if (z) {
            i = 2131744261;
        } else {
            i = 2131744111;
        }
        kg5Var2.t(ob6.M0(i, null));
        this.q0.v();
    }

    public final void Y0() {
        String str;
        v21 K;
        if (this.q1) {
            return;
        }
        if (this.o1) {
            if (this.s3 != null && this.t3 != null) {
                l46.o1(new qu0(this, (byte) 9), this.s3, this.t3, this.l1, true);
                return;
            }
            lcb lcbVar = this.t0;
            if (lcbVar != null) {
                lcbVar.k1 = true;
                lcbVar.U();
            }
            uc7.s1(this.m2).G0().a(this.l1, new a58(this, (byte) 1));
            return;
        }
        g58 g58Var = this.L1;
        int i = -this.b1;
        this.b1 = i;
        hl.A3(i, g58Var, null);
        yw0.APP_ERROR.a();
        if (this.l1 >= 0) {
            str = lbc.r(uc7.s1(this.m2).X1(Long.valueOf(this.l1)));
        } else {
            str = "";
        }
        boolean M3 = uc7.s1(this.m2).M3();
        x53 x53Var = this.l0;
        t58 t58Var = this.M0;
        if (M3) {
            K = new d31(t58Var, x53Var).Q(2131624211, 36, hl.S2(ob6.a0(null, null, 2131743413, str)));
        } else {
            K = new d31(t58Var, x53Var).K(2131624211, hl.S2(ob6.a0(null, null, 2131743413, str)), ob6.M0(2131743414, null), new u48(this, (byte) 11));
        }
        K.j();
    }

    public final boolean Z0(boolean z) {
        if (this.t0.R0) {
            z = !z;
        }
        int i = this.t1;
        if (z) {
            if (i < getStoriesCount() - 1) {
                this.t1++;
                c1(false);
                return true;
            }
        } else if (i > 0) {
            this.t1 = i - 1;
            c1(false);
            return true;
        }
        return false;
    }

    public final void a0(boolean z) {
        o68 currentPeerView;
        q qVar = this.t2;
        if (qVar != null) {
            qVar.f(false);
        }
        long j = this.l1;
        TL_stories.StoryItem storyItem = this.y1.a;
        lcb lcbVar = this.t0;
        lcbVar.getClass();
        if (j != 0 && storyItem != null) {
            lcb.E1.remove(j + (j >> 16) + (storyItem.id << 16));
        }
        this.S2 = true;
        acb acbVar = lcbVar.o0;
        if (acbVar != null && (currentPeerView = acbVar.getCurrentPeerView()) != null) {
            currentPeerView.i0();
        }
        if (z) {
            v21 J = new d31(this.M0, this.l0).J(2131624029, ob6.M0(2131748237, null), ob6.M0(2131743204, null), 5000, false, new u48(this, (byte) 4));
            J.s = false;
            J.k(false);
        }
        uc7.s1(this.m2).r0(this.l1, 0, null);
    }

    public final void a1(long j) {
        String str;
        boolean z;
        TLRPC.User user;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.m2;
        if (i > 0) {
            TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(j));
            str = X1.first_name;
            z = X1.stories_hidden;
            user = X1;
        } else {
            TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-j));
            str = M0.title;
            z = M0.stories_hidden;
            user = M0;
        }
        hl.d3(new us0(this, uc7.s1(this.m2), j, !z, str, user), 200L);
    }

    public final void b0() {
        h6b h6bVar = this.o0;
        h6bVar.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new vk(h6bVar, (byte) 1)).setDuration(150L).start();
        int L = hl.L(8.0f);
        h6b h6bVar2 = new h6b(getContext(), this.h1);
        this.o0 = h6bVar2;
        h6bVar2.setPadding(L, L, L, L);
        this.o0.setAlpha(0.0f);
        this.o0.setScaleX(0.8f);
        this.o0.setScaleY(0.8f);
        this.o0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.n0.addView(this.o0, tre.e(40, 40, 3));
        this.a3 = false;
    }

    public final void b1() {
        if (!uc7.s1(this.m2).k5()) {
            return;
        }
        File f = this.y1.f();
        if (f != null && f.exists()) {
            m58 m58Var = this.J2;
            if (m58Var != null) {
                m58Var.dismiss();
            }
            hl.d3(new u48(this, (byte) 8), 120L);
            return;
        }
        V0();
    }

    public final void c0(boolean z) {
        float f;
        ValueAnimator valueAnimator = this.M3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = this.N3;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.M3 = ofFloat;
        ofFloat.addUpdateListener(new y48(this, (byte) 2));
        this.M3.addListener(new d58(this, z, (byte) 1));
        this.M3.setDuration(420L);
        this.M3.setInterpolator(k43.h);
        this.M3.start();
    }

    public final void c1(boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o68.c1(boolean):void");
    }

    public final void d0(Runnable runnable) {
        if (uc7.s1(this.m2).x2()) {
            i5.b(this.m2);
            return;
        }
        int i = xea.b0;
        if (i > 0 && this.U2) {
            int i2 = i - 1;
            xea.b0 = i2;
            xea.Q(i2);
            id idVar = new id(0, this.l0, getContext());
            idVar.setTitle(ob6.M0(2131744542, null));
            idVar.m(ob6.M0(2131744543, null));
            String M0 = ob6.M0(2131746472, null);
            td tdVar = new td(runnable, (byte) 15);
            idVar.m0 = M0;
            idVar.n0 = tdVar;
            String M02 = ob6.M0(2131752570, null);
            ku7 ku7Var = new ku7((byte) 18);
            idVar.o0 = M02;
            idVar.p0 = ku7Var;
            idVar.show();
            return;
        }
        runnable.run();
    }

    public final void d1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o68.d1():void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        float f;
        w96 w96Var;
        boolean z;
        int i3 = jn7.y5;
        long j = 0;
        lcb lcbVar = this.t0;
        boolean z2 = false;
        if (i != i3 && (i != jn7.A5 || lcbVar.O0 != objArr[0])) {
            if (i == jn7.o3) {
                c1(false);
                return;
            } else if (i == jn7.l4) {
                this.u0.b0.invalidate();
                return;
            } else if (i == jn7.G5) {
                h0(true);
                return;
            } else if (i == jn7.d3) {
                xx n = uc7.s1(this.m2).O1().n();
                if (n != null && n.a(this.m2, 1) && this.A1 != null) {
                    qu0 qu0Var = new qu0(this, (byte) 9);
                    Context W = hl.W(getContext());
                    if (W == null) {
                        W = LaunchActivity.H1;
                    }
                    ((ccb) this.A1).h(new l46(n.b(), this.m2, null, W, qu0Var));
                    return;
                }
                return;
            } else if (i == jn7.k3) {
                TL_account.RequirementToContact P2 = uc7.s1(this.m2).P2(this.l1);
                if (this.l1 >= 0 && !yac.h(this.m2).p() && (P2 instanceof TL_account.requirementToContactPremium)) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.p1 != z || this.r1 != wf3.j(P2)) {
                    this.p1 = z;
                    this.r1 = wf3.j(P2);
                    c1(false);
                    h0(true);
                    return;
                }
                return;
            } else if (i == jn7.T) {
                Object obj = objArr[0];
                if ((obj instanceof TLRPC.ChatFull) && this.l1 == (-((TLRPC.ChatFull) obj).id)) {
                    c1(false);
                    return;
                }
                return;
            } else if (i == jn7.G2) {
                long longValue = ((Long) objArr[0]).longValue();
                if (lcbVar != null && (w96Var = lcbVar.B0) != null && w96Var.j() == longValue) {
                    c1(false);
                    g58 g58Var = this.L1;
                    if (g58Var != null) {
                        g58Var.P(true);
                        this.L1.I2(true);
                        h0(true);
                    }
                    b58 b58Var = this.v0;
                    if (b58Var != null) {
                        w96 w96Var2 = b58Var.Q;
                        if (w96Var2 != null) {
                            j = w96Var2.m();
                        }
                        if (b58Var.I != j) {
                            b58Var.e.O(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i == jn7.E && ((Boolean) objArr[2]).booleanValue()) {
                F0();
                return;
            } else {
                return;
            }
        }
        k68 k68Var = this.A1;
        if (k68Var == null || !((ccb) k68Var).d.H0) {
            if (this.u1) {
                h1();
                if (this.k1 == 0) {
                    if (!this.o2) {
                        this.o2 = true;
                        ((ccb) this.A1).j();
                        return;
                    }
                    return;
                }
                int i4 = this.t1;
                ArrayList arrayList = this.f1;
                int size = arrayList.size();
                ArrayList arrayList2 = this.g1;
                if (i4 >= arrayList2.size() + size) {
                    this.t1 = (arrayList2.size() + arrayList.size()) - 1;
                }
                c1(false);
                if (this.m1 || this.n1) {
                    i1(true);
                }
            }
            TL_stories.PeerStories peerStories = lcbVar.Q0;
            if (peerStories != null) {
                this.C1.U(peerStories, true);
            } else {
                long j2 = this.l1;
                if (j2 != 0) {
                    c6b c6bVar = this.C1;
                    TL_stories.PeerStories x = c6bVar.x(j2);
                    if (x == null) {
                        x = c6bVar.y(j2);
                        z2 = true;
                    }
                    c6bVar.U(x, z2);
                }
            }
            b8 b8Var = this.c1;
            if (b8Var != null) {
                ViewPropertyAnimator animate = b8Var.animate();
                if (this.C1.L(this.l1) && this.y1.e && !xea.b()) {
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
        rw1 rw1Var;
        Canvas canvas2;
        hn hnVar;
        hn hnVar2;
        j1();
        if (this.n1 && (hnVar2 = this.A0) != null) {
            hnVar2.setBounds(0, 0, getMeasuredWidth(), hl.L(40.0f));
        }
        if (this.n1 && (hnVar = this.B0) != null) {
            hnVar.setBounds(0, 0, getMeasuredWidth(), hl.L(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z = this.e3;
        LinearLayout linearLayout = this.y0;
        o58 o58Var = this.n0;
        if (z) {
            float measuredWidth = (o58Var.getMeasuredWidth() / 2.0f) + o58Var.getX() + linearLayout.getX();
            float measuredHeight = (o58Var.getMeasuredHeight() / 2.0f) + o58Var.getY() + linearLayout.getY();
            int L = hl.L(24.0f);
            float f = L / 2.0f;
            float R1 = hl.R1(this.g3, measuredWidth - f, k43.g.getInterpolation(this.f3));
            float R12 = hl.R1(this.h3, measuredHeight - f, this.f3);
            int U1 = hl.U1(this.f3, this.i3, L);
            if (this.Z2) {
                wl wlVar = this.Y2;
                if (wlVar != null) {
                    float f2 = U1;
                    wlVar.setBounds((int) R1, (int) R12, (int) (R1 + f2), (int) (R12 + f2));
                    this.Y2.draw(canvas);
                }
            } else {
                float f3 = U1;
                ImageReceiver imageReceiver = this.X2;
                imageReceiver.i0(R1, R12, f3, f3);
                imageReceiver.h(canvas, null);
            }
        }
        if (this.a3) {
            float measuredWidth2 = (o58Var.getMeasuredWidth() / 2.0f) + o58Var.getX() + linearLayout.getX();
            float measuredHeight2 = (o58Var.getMeasuredHeight() / 2.0f) + o58Var.getY() + linearLayout.getY();
            int L2 = hl.L(120.0f);
            if (!this.Z2) {
                float f4 = L2;
                float f5 = f4 / 2.0f;
                float f6 = measuredWidth2 - f5;
                float f7 = measuredHeight2 - f5;
                ImageReceiver imageReceiver2 = this.V2;
                imageReceiver2.i0(f6, f7, f4, f4);
                imageReceiver2.h(canvas, null);
                if (imageReceiver2.y() != null && imageReceiver2.y().v()) {
                    this.a3 = false;
                }
            } else {
                yl ylVar = this.W2;
                if (ylVar != null) {
                    float f8 = L2 / 2.0f;
                    ylVar.e((int) (measuredWidth2 - f8), (int) (measuredHeight2 - f8), (int) (measuredWidth2 + f8), (int) (measuredHeight2 + f8));
                    this.W2.b(canvas);
                    if (this.W2.c()) {
                        this.W2.d(this);
                        this.W2 = null;
                        this.a3 = false;
                    }
                } else {
                    this.a3 = false;
                }
            }
        }
        g58 g58Var = this.L1;
        if (g58Var != null) {
            rw1 rw1Var2 = g58Var.n2;
            rw1 rw1Var3 = g58Var.o2;
            if (g58Var.getAlpha() != 0.0f && (rw1Var = g58Var.f1) != null && rw1Var.getParent() != null && g58Var.f1.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(g58Var.f1.getX() + rw1Var2.getX() + rw1Var3.getX() + g58Var.getX(), g58Var.f1.getY() + rw1Var2.getY() + rw1Var3.getY() + g58Var.getY());
                if (g58Var.getAlpha() != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, g58Var.getMeasuredWidth(), g58Var.getMeasuredHeight(), (int) (g58Var.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                g58Var.f1.draw(canvas2);
                canvas2.restoreToCount(save);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        i49 i49Var;
        i49 i49Var2;
        rz4 rz4Var;
        float L;
        float f;
        if (view == this.N2) {
            canvas.save();
            canvas.clipRect(0.0f, this.N2.getY(), getMeasuredWidth(), this.N2.getY() + this.N2.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        g58 g58Var = this.L1;
        Paint paint = this.X1;
        o58 o58Var = this.n0;
        m68 m68Var = this.h1;
        if (view == g58Var) {
            float f2 = this.a2;
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            n68 n68Var = this.y1;
            if (i > 0 && !n68Var.f) {
                m68Var.l.setAlpha((int) (f2 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), m68Var.l);
            }
            RectF rectF = m68Var.h;
            RectF rectF2 = m68Var.i;
            RectF rectF3 = m68Var.j;
            rectF.set(this.L1.getX(), this.L1.getY() + this.L1.getAnimatedTop() + hl.L(1.33f), this.L1.getX() + this.L1.getMeasuredWidth(), this.L1.getY() + this.L1.getMeasuredHeight());
            float L2 = hl.L(40.0f);
            if (!n68Var.f) {
                if (this.C2) {
                    L2 += hl.L(46.0f);
                }
                if (this.D2 && this.n1) {
                    L2 += hl.L(46.0f);
                }
                if (o58Var != null && o58Var.getVisibility() == 0) {
                    L2 = (L2 - hl.L(40.0f)) + o58Var.getLayoutParams().width;
                }
                L = 0.0f;
            } else {
                L = hl.L(46.0f);
                L2 = hl.L(46.0f);
                tj7 tj7Var = this.K1;
                if (tj7Var != null && tj7Var.getVisibility() == 0) {
                    L2 += hl.L(46.0f);
                }
            }
            rectF2.set(hl.L(10.0f) + L, ((this.L1.getY() + this.L1.getMeasuredHeight()) - hl.L(5.0f)) - hl.L(38.0f), (getMeasuredWidth() - hl.L(10.0f)) - L2, (this.L1.getY() + this.L1.getMeasuredHeight()) - hl.L(5.0f));
            this.L1.setTranslationX((1.0f - this.a2) * L);
            if (this.L1.getMeasuredHeight() > hl.L(50.0f)) {
                f = ((1.0f - this.a2) * (this.L1.getMeasuredHeight() - hl.L(50.0f))) + 0.0f;
            } else {
                f = 0.0f;
            }
            this.L1.getEditField().setTranslationY(qd4.A(1.0f, this.a2, -hl.L(2.0f), f));
            float L3 = hl.L(50.0f) / 2.0f;
            hl.X1(rectF2, m68Var.h, this.a2, rectF3);
            jl0 jl0Var = this.V1;
            if (jl0Var != null) {
                jl0Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                jl0Var.r(L3);
                jl0Var.setAlpha((int) ((1.0f - this.N3) * (1.0f - this.b2) * 255.0f * getHideInterfaceAlpha()));
                jl0Var.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, L3, L3, paint);
            }
            if (this.a2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild2;
            }
        } else if (g58Var != null && g58Var.V0(view)) {
            float L4 = hl.L(30.0f);
            RectF rectF4 = m68Var.k;
            RectF rectF5 = m68Var.k;
            rectF4.set(0.0f, view.getY() + hl.L(1.0f), getWidth(), hl.L(20.0f) + getHeight());
            Path path = this.K3;
            path.rewind();
            path.addRoundRect(rectF5, L4, L4, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            jl0 jl0Var2 = this.W1;
            if (jl0Var2 != null) {
                jl0Var2.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                jl0Var2.s(L4, L4, L4, L4);
                jl0Var2.setAlpha(255);
                jl0Var2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF5, L4, L4, paint);
            }
            boolean drawChild3 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild3;
        } else {
            if (view == this.P1 && this.L1 != null) {
                view.setTranslationY(((this.L1.getY() + this.L1.getAnimatedTop()) + (-i49Var.getMeasuredHeight())) - hl.L(18.0f));
            } else {
                if (view == this.b3) {
                    view.setTranslationY((this.y0.getY() + (o58Var.getY() + (-(i49Var2.getMeasuredHeight() - this.b3.getPaddingBottom())))) - hl.L(18.0f));
                } else {
                    t58 t58Var = this.M0;
                    if (view == t58Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (rz4Var = this.q3) != null && !rz4Var.r) {
                        RecordingCanvas i2 = rz4Var.i(getMeasuredWidth(), getMeasuredHeight());
                        i2.drawColor(vm2.f(0.2f, -16777216, -1));
                        i2.translate(t58Var.getX(), t58Var.getY());
                        view.draw(i2);
                        rz4Var.j();
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
        this.o2 = false;
        this.F2 = true;
        this.l3 = false;
        this.n1 = false;
        this.o1 = false;
        long j = this.l1;
        int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        l68 l68Var = this.Y0;
        rb0 rb0Var = this.X0;
        if (i4 >= 0) {
            if (j == yac.h(this.m2).e()) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.m1 = z5;
            TLRPC.User X1 = uc7.s1(this.m2).X1(Long.valueOf(this.l1));
            TL_account.RequirementToContact P2 = uc7.s1(this.m2).P2(this.l1);
            if (!yac.h(this.m2).p() && (P2 instanceof TL_account.requirementToContactPremium)) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.p1 = z6;
            this.r1 = wf3.j(P2);
            rb0Var.q(X1);
            l68Var.a.getImageReceiver().U(X1, rb0Var, null);
            R0(this.l1, true, false);
        } else {
            this.m1 = false;
            this.n1 = true;
            if (!this.C1.g(j)) {
                boolean z7 = f11.a;
            } else {
                this.l3 = true;
            }
            TLRPC.Chat M0 = uc7.s1(this.m2).M0(Long.valueOf(-this.l1));
            boolean V = xc2.V(M0);
            this.o1 = !V;
            if (!V && uc7.s1(this.m2).N0(-this.l1) == null) {
                jf7.Y(this.m2).C0(-this.l1, true, new CountDownLatch(1), false, false, 0);
            }
            if (this.o1 && !xc2.q(M0)) {
                z = true;
            } else {
                z = false;
            }
            this.p1 = z;
            this.r1 = uc7.s1(this.m2).M1(this.l1);
            rb0Var.p(M0);
            l68Var.a.getImageReceiver().U(M0, rb0Var, null);
            R0(this.l1, true, false);
        }
        if (this.u1 && (this.m1 || this.n1)) {
            c6b c6bVar = this.C1;
            long j2 = this.l1;
            zh6 zh6Var = c6bVar.m;
            hjc hjcVar = (hjc) zh6Var.f(j2);
            if (hjcVar == null) {
                hjcVar = new hjc(c6bVar.a, j2, c6bVar);
                zh6Var.k(j2, hjcVar);
            }
            hjcVar.b(true);
        }
        h1();
        this.t1 = i;
        if (i < 0) {
            this.t1 = 0;
        }
        this.G0 = 0L;
        this.I0 = false;
        this.s3 = null;
        this.t3 = null;
        boolean z8 = this.n1;
        t58 t58Var = this.M0;
        lcb lcbVar = this.t0;
        int i5 = 8;
        n68 n68Var = this.y1;
        if (z8) {
            r0();
            if (this.L1 == null && (this.o1 || n68Var.f)) {
                l0();
            }
            if (this.L1 != null) {
                TLRPC.Chat M02 = uc7.s1(this.m2).M0(Long.valueOf(-this.l1));
                g58 g58Var = this.L1;
                if (n68Var.f || (!A0() && this.o1 && (xc2.q(M02) || xc2.s0(M02)))) {
                    i5 = 0;
                }
                g58Var.setVisibility(i5);
                g58 g58Var2 = this.L1;
                boolean z9 = n68Var.f;
                v0(true);
                g58Var2.U1(z9);
                g58 g58Var3 = this.L1;
                if (n68Var.f && !v0(true) && (this.f2 || this.L1.X0)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                g58Var3.b2(z4, true);
                xt3 editField = this.L1.getEditField();
                long j3 = this.l1;
                TL_stories.StoryItem storyItem = n68Var.a;
                lcbVar.getClass();
                editField.setText(lcb.x(j3, storyItem));
                this.L1.M1(this.m2, this.l1);
                this.L1.C2(M02, null);
            }
            hn hnVar = this.A0;
            x53 x53Var = this.l0;
            if (hnVar == null) {
                hn hnVar2 = new hn(false, false, false);
                this.A0 = hnVar2;
                o58 o58Var = this.n0;
                hnVar2.setCallback(o58Var);
                this.A0.u(x53Var.h(aob.G6));
                this.A0.w(hl.L(14.0f));
                this.C0 = new mm(o58Var);
            }
            o58 o58Var2 = this.z0;
            if (o58Var2 != null && this.B0 == null) {
                hn hnVar3 = new hn(false, false, false);
                this.B0 = hnVar3;
                hnVar3.setCallback(o58Var2);
                this.B0.u(x53Var.h(aob.G6));
                this.B0.w(hl.L(14.0f));
                this.D0 = new mm(o58Var2);
            }
            if (i == -1) {
                f1();
            }
            c1(false);
            this.k1 = getStoriesCount();
            t58Var.invalidate();
            invalidate();
        } else if (this.m1) {
            r0();
            boolean z10 = n68Var.f;
            o58 o58Var3 = this.G1;
            if (z10) {
                o58Var3.setVisibility(8);
                if (this.L1 == null) {
                    l0();
                }
                this.L1.setVisibility(0);
            } else {
                o58Var3.setVisibility(0);
                g58 g58Var4 = this.L1;
                if (g58Var4 != null) {
                    g58Var4.setVisibility(8);
                }
            }
            g58 g58Var5 = this.L1;
            if (g58Var5 != null) {
                boolean z11 = n68Var.f;
                v0(true);
                g58Var5.U1(z11);
                g58 g58Var6 = this.L1;
                if (n68Var.f && !v0(true) && (this.f2 || this.L1.X0)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                g58Var6.b2(z3, true);
            }
            if (i == -1) {
                ArrayList arrayList = this.j1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(lcbVar.P0));
                    if (indexOf < 0 && !this.j1.isEmpty()) {
                        if (lcbVar.P0 > ((Integer) this.j1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (lcbVar.P0 < ((Integer) c00.g(1, this.j1)).intValue()) {
                            indexOf = this.j1.size() - 1;
                        }
                    }
                    this.t1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.g1.isEmpty();
                    ArrayList arrayList2 = this.f1;
                    if (!isEmpty) {
                        this.t1 = arrayList2.size();
                    } else {
                        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i6)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i6)).id > this.C1.f.get(this.l1)) {
                                this.t1 = i6;
                                break;
                            }
                        }
                    }
                }
            }
            c1(false);
            t58Var.invalidate();
            invalidate();
        } else {
            if (this.L1 == null) {
                l0();
            }
            if (this.p1 && this.Q1 == null) {
                p0();
            }
            if (this.Q1 != null) {
                if (this.p1 || this.q1) {
                    e1();
                }
                LinearLayout linearLayout = this.Q1;
                if ((this.p1 && !n68Var.f) || this.q1) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                linearLayout.setVisibility(i3);
            }
            d8b d8bVar = this.T1;
            if (d8bVar != null) {
                d8bVar.setVisibility(8);
            }
            if (i == -1) {
                f1();
            }
            c1(false);
            g58 g58Var7 = this.L1;
            if (g58Var7 != null) {
                if (!A0() && !lbc.C(this.l1)) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                g58Var7.setVisibility(i2);
                g58 g58Var8 = this.L1;
                boolean z12 = n68Var.f;
                v0(true);
                g58Var8.U1(z12);
                g58 g58Var9 = this.L1;
                if (n68Var.f && !v0(true) && (this.f2 || this.L1.X0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                g58Var9.b2(z2, true);
                xt3 editField2 = this.L1.getEditField();
                long j4 = this.l1;
                TL_stories.StoryItem storyItem2 = n68Var.a;
                lcbVar.getClass();
                editField2.setText(lcb.x(j4, storyItem2));
                this.L1.M1(this.m2, this.l1);
                TLRPC.UserFull Y1 = uc7.s1(this.m2).Y1(this.l1);
                if (Y1 != null) {
                    this.L1.C2(null, Y1);
                } else {
                    uc7.s1(this.m2).f3(uc7.s1(this.m2).X1(Long.valueOf(this.l1)), this.j2, false, null);
                }
            }
            this.k1 = getStoriesCount();
            o58 o58Var4 = this.G1;
            if (o58Var4 != null) {
                o58Var4.setVisibility(8);
            }
            t58Var.invalidate();
            invalidate();
        }
        h0(false);
    }

    public final void e1() {
        int i;
        boolean z = this.q1;
        TextView textView = this.R1;
        if (z) {
            if (textView != null) {
                textView.setText(ob6.M0(2131748577, null));
            }
            TextView textView2 = this.S1;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        if (textView != null) {
            if (this.o1) {
                i = 2131744319;
            } else {
                i = 2131744147;
            }
            textView.setText(ob6.M0(i, null));
        }
        TextView textView3 = this.S1;
        if (textView3 != null) {
            textView3.setVisibility(0);
            this.S1.setText(ob6.M0(2131744146, null));
        }
    }

    public final void f0() {
        y58 y58Var = this.u0;
        if (y58Var.W.w()) {
            y58Var.W.e(false);
        }
    }

    public final void f1() {
        TL_stories.PeerStories peerStories;
        int i;
        ArrayList arrayList = this.j1;
        lcb lcbVar = this.t0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.g1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i = arrayList2.size();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    long j = ((b6b) arrayList2.get(i2)).a;
                    if (((int) (j ^ (j >>> 32))) == lcbVar.P0) {
                        this.t1 = i2;
                        return;
                    }
                }
            } else {
                i = 0;
            }
            int indexOf = this.j1.indexOf(Integer.valueOf(lcbVar.P0));
            if (indexOf < 0 && !this.j1.isEmpty()) {
                if (lcbVar.P0 > ((Integer) this.j1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (lcbVar.P0 < ((Integer) c00.g(1, this.j1)).intValue()) {
                    indexOf = this.j1.size() - 1;
                }
            }
            this.t1 = i + indexOf;
        } else {
            int i3 = lcbVar.e1.get(this.l1, -1);
            this.t1 = i3;
            if (i3 == -1 && !lcbVar.N0 && (peerStories = this.e1) != null && peerStories.max_read_id > 0) {
                int i4 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f1;
                    if (i4 >= arrayList3.size()) {
                        break;
                    } else if (((TL_stories.StoryItem) arrayList3.get(i4)).id > this.e1.max_read_id) {
                        this.t1 = i4;
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        if (this.t1 == -1) {
            this.t1 = 0;
        }
    }

    public final void g0() {
        if (this.u1) {
            ((ccb) this.A1).d.U();
        }
    }

    public final void g1(boolean z) {
        b8 b8Var = this.n3;
        if (b8Var != null && this.m3 != null && b8Var.getVisibility() == 0) {
            if (z) {
                if (Math.abs(lcb.B1 - 0.2f) < 0.05f) {
                    this.n3.setSubtext(ob6.M0(2131743226, null));
                } else if (Math.abs(lcb.B1 - 0.5f) < 0.05f) {
                    this.n3.setSubtext(ob6.M0(2131743228, null));
                } else if (Math.abs(lcb.B1 - 1.0f) < 0.05f) {
                    this.n3.setSubtext(ob6.M0(2131743229, null));
                } else if (Math.abs(lcb.B1 - 1.5f) < 0.05f) {
                    this.n3.setSubtext(ob6.M0(2131743230, null));
                } else {
                    int i = (Math.abs(lcb.B1 - 2.0f) > 0.05f ? 1 : (Math.abs(lcb.B1 - 2.0f) == 0.05f ? 0 : -1));
                    b8 b8Var2 = this.n3;
                    if (i < 0) {
                        b8Var2.setSubtext(ob6.M0(2131743227, null));
                    } else {
                        b8Var2.setSubtext(ob6.a0(null, null, 2131743231, zoa.a(lcb.B1).concat("x")));
                    }
                }
            }
            this.m3.C0(z, lcb.B1);
        }
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.j1;
    }

    public long getCurrentPeer() {
        return this.l1;
    }

    public int getListPosition() {
        return this.v1;
    }

    public Bitmap getPlayingBitmap() {
        t58 t58Var = this.M0;
        Bitmap createBitmap = Bitmap.createBitmap(t58Var.getWidth(), t58Var.getHeight(), Bitmap.Config.ARGB_8888);
        w0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.t1;
    }

    public c6b getStoriesController() {
        return uc7.s1(this.m2).O1();
    }

    public int getStoriesCount() {
        return Math.max(this.n2, this.f1.size()) + this.g1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f1;
    }

    public final void h0(boolean z) {
        int i;
        if (this.L1 != null && this.P2 && this.K0) {
            u48 u48Var = this.y3;
            hl.r(u48Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.C1.B;
            this.L1.P(true);
            boolean z2 = this.p1;
            n68 n68Var = this.y1;
            if ((z2 && !n68Var.f) || this.q1) {
                this.U2 = false;
                this.L1.setEnabled(false);
                this.L1.W1(" ", z);
            } else if (this.r1 > 0) {
                this.U2 = false;
                this.L1.setEnabled(true);
                this.L1.W1(nza.T0(ob6.a0(null, null, 2131743581, ob6.E(this.r1, ','))), z);
            } else {
                if (!n68Var.f && tL_storiesStealthMode != null) {
                    int currentTime = ConnectionsManager.getInstance(this.m2).getCurrentTime();
                    int i2 = tL_storiesStealthMode.active_until_date;
                    if (currentTime < i2) {
                        this.U2 = true;
                        int currentTime2 = i2 - ConnectionsManager.getInstance(this.m2).getCurrentTime();
                        int i3 = currentTime2 / 60;
                        int i4 = currentTime2 % 60;
                        Locale locale = Locale.US;
                        String a0 = ob6.a0(null, null, 2131744545, String.format(locale, "%02d:%02d", 99, 99));
                        this.L1.setEnabled(true);
                        int i5 = ((((int) this.L1.getEditField().getPaint().measureText(a0)) * 1.2f) > this.L1.getEditField().getMeasuredWidth() ? 1 : ((((int) this.L1.getEditField().getPaint().measureText(a0)) * 1.2f) == this.L1.getEditField().getMeasuredWidth() ? 0 : -1));
                        g58 g58Var = this.L1;
                        if (i5 >= 0) {
                            String a02 = ob6.a0(null, null, 2131744545, "");
                            String format = String.format(locale, "%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i4));
                            g58Var.e = a02;
                            g58Var.f = format;
                            g58Var.y2(z);
                        } else {
                            g58Var.W1(ob6.a0(null, null, 2131744546, String.format(locale, "%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i4))), z);
                        }
                        hl.d3(u48Var, 1000L);
                        return;
                    }
                }
                this.U2 = false;
                this.L1.setEnabled(true);
                boolean z3 = n68Var.f;
                g58 g58Var2 = this.L1;
                if (z3) {
                    long starsPrice = g58Var2.getStarsPrice();
                    int i6 = (starsPrice > 0L ? 1 : (starsPrice == 0L ? 0 : -1));
                    g58 g58Var3 = this.L1;
                    if (i6 > 0) {
                        g58Var3.W1(nza.Z0(false, ob6.a0(null, null, 2131751969, ob6.E((int) starsPrice, ',')), this.L1.j7), z);
                        wm2 wm2Var = this.L1.j7[0];
                        if (wm2Var != null) {
                            wm2Var.H = 0.9f;
                            return;
                        }
                        return;
                    }
                    g58Var3.W1(ob6.M0(2131751970, null), z);
                    return;
                }
                if (this.o1) {
                    i = 2131745977;
                } else {
                    i = 2131745982;
                }
                g58Var2.W1(ob6.M0(i, null), z);
            }
        }
    }

    public final void h1() {
        TL_stories.PeerStories x;
        u5b u5bVar;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f1;
        arrayList.clear();
        lcb lcbVar = this.t0;
        if (lcbVar.N0) {
            if (!lcbVar.S0) {
                arrayList.add(lcbVar.T0);
            }
        } else {
            ArrayList arrayList2 = this.j1;
            int i = 0;
            ArrayList arrayList3 = this.g1;
            if (arrayList2 != null && (u5bVar = lcbVar.O0) != null) {
                if (u5bVar instanceof o5b) {
                    arrayList3.clear();
                    ArrayList E = uc7.s1(this.m2).O1().E(this.l1);
                    String str = ((o5b) lcbVar.O0).E;
                    if (E != null) {
                        for (int i2 = 0; i2 < E.size(); i2++) {
                            b6b b6bVar = (b6b) E.get(i2);
                            c8b c8bVar = b6bVar.c;
                            if (c8bVar != null && !c8bVar.g && TextUtils.equals(c8bVar.K0, str)) {
                                arrayList3.add(b6bVar);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.j1;
                int size = arrayList4.size();
                while (i < size) {
                    Object obj = arrayList4.get(i);
                    i++;
                    r47 f = lcbVar.O0.f(((Integer) obj).intValue());
                    if (f != null && (storyItem = f.l) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (lcbVar.O0 != null) {
                while (i < lcbVar.O0.i.size()) {
                    arrayList.add(((r47) lcbVar.O0.i.get(i)).l);
                    i++;
                }
            } else {
                TL_stories.PeerStories peerStories = lcbVar.Q0;
                if (peerStories != null && wf3.n(peerStories.peer) == this.l1) {
                    x = lcbVar.Q0;
                    this.e1 = x;
                } else {
                    x = this.C1.x(this.l1);
                    this.e1 = x;
                    if (x == null) {
                        x = this.C1.y(this.l1);
                        this.e1 = x;
                    }
                }
                this.n2 = 0;
                if (x != null) {
                    this.n2 = x.stories.size();
                    arrayList.addAll(this.e1.stories);
                }
                arrayList3.clear();
                ArrayList E2 = this.C1.E(this.l1);
                if (E2 != null) {
                    arrayList3.addAll(E2);
                }
            }
        }
        this.k1 = getStoriesCount();
    }

    public final boolean i0() {
        if (this.c3) {
            if (this.b3.getReactionsWindow() != null) {
                int i = this.i2;
                i49 i49Var = this.b3;
                if (i > 0) {
                    hl.t1(i49Var.getReactionsWindow().c);
                    return true;
                }
                i49Var.getReactionsWindow().d();
                return true;
            }
            W0(false);
            return true;
        }
        r58 r58Var = this.T0;
        if (r58Var != null) {
            kg5 kg5Var = r58Var.c;
            if (kg5Var != null) {
                kg5Var.f(true);
                r58Var.c = null;
            }
            r58Var.b = null;
            r58Var.invalidate();
            r58Var.b(false);
        }
        y58 y58Var = this.u0;
        if (y58Var.W.w()) {
            y58Var.W.e(false);
            return true;
        }
        kg5 kg5Var2 = this.p0;
        if (kg5Var2 != null) {
            kg5Var2.f(true);
        }
        kg5 kg5Var3 = this.q0;
        if (kg5Var3 != null) {
            kg5Var3.f(true);
        }
        lg5 lg5Var = this.G2;
        if (lg5Var != null) {
            lg5Var.a();
        }
        j68 j68Var = this.d1;
        if (j68Var != null && j68Var.a) {
            j68Var.a();
            return true;
        }
        g58 g58Var = this.L1;
        if (g58Var != null && g58Var.W0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.l0, getContext());
            boolean z = this.L1.d1;
            id idVar = alertDialog$Builder.a;
            if (z) {
                idVar.S = ob6.M0(2131751360, null);
                idVar.U = ob6.M0(2131751361, null);
            } else {
                idVar.S = ob6.M0(2131751357, null);
                idVar.U = ob6.M0(2131751358, null);
            }
            alertDialog$Builder.j(ob6.M0(2131751359, null), new s48(this, (byte) 1));
            alertDialog$Builder.g(ob6.M0(2131751736, null), null);
            ((ccb) this.A1).h(idVar);
            return true;
        }
        i49 i49Var2 = this.P1;
        if (i49Var2 != null && i49Var2.getReactionsWindow() != null && !this.P1.getReactionsWindow().q) {
            this.P1.getReactionsWindow().d();
            return true;
        }
        g58 g58Var2 = this.L1;
        if (g58Var2 != null && g58Var2.U0()) {
            int i2 = this.i2;
            g58 g58Var3 = this.L1;
            if (i2 > 0) {
                hl.t1(g58Var3.getEmojiView());
                return true;
            }
            g58Var3.O0(true, false, true);
            return true;
        } else if (getKeyboardHeight() >= hl.L(20.0f)) {
            g58 g58Var4 = this.L1;
            if (g58Var4 != null) {
                long j = this.l1;
                TL_stories.StoryItem storyItem = this.y1.a;
                Editable editText = g58Var4.getEditText();
                this.t0.getClass();
                lcb.N(j, storyItem, editText);
            }
            hl.t1(this.L1);
            return true;
        } else if (y58Var.getVisibility() != 0 || y58Var.getProgressToBlackout() <= 0.0f) {
            return false;
        } else {
            y58Var.D();
            this.Q2 = false;
            this.M0.invalidate();
            return true;
        }
    }

    public final void i1(boolean z) {
        String M0;
        int i;
        mz1 mz1Var;
        boolean z2;
        String M02;
        float f;
        float f2;
        float f3;
        boolean z3;
        int i2;
        boolean z4;
        n68 n68Var = this.y1;
        TL_stories.StoryItem storyItem = n68Var.a;
        if (storyItem == null) {
            storyItem = n68Var.c;
        }
        boolean z5 = this.n1;
        if (z5 || this.m1) {
            if (storyItem != null) {
                TL_stories.StoryViews storyViews = storyItem.views;
                lcb lcbVar = this.t0;
                o58 o58Var = this.n0;
                if (z5) {
                    if (storyViews == null) {
                        storyViews = new TL_stories.TL_storyViews();
                        storyItem.views = storyViews;
                    }
                    if (storyViews.views_count <= 0) {
                        storyViews.views_count = 1;
                    }
                    hn hnVar = this.B0;
                    if (hnVar != null && (i2 = storyViews.forwards_count) > 0) {
                        String num = Integer.toString(i2);
                        if (z && this.F0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        hnVar.t(num, z4, true);
                        this.F0 = true;
                    } else {
                        this.F0 = false;
                    }
                    int i3 = storyItem.views.reactions_count;
                    if (i3 > 0) {
                        hn hnVar2 = this.A0;
                        String num2 = Integer.toString(i3);
                        if (z && this.E0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        hnVar2.t(num2, z3, true);
                        this.E0 = true;
                        z2 = true;
                    } else {
                        this.E0 = false;
                        z2 = false;
                    }
                    float f4 = 0.0f;
                    if (!z) {
                        mm mmVar = this.C0;
                        if (z2) {
                            f2 = 1.0f;
                        } else {
                            f2 = 0.0f;
                        }
                        mmVar.e(true, f2);
                        mm mmVar2 = this.D0;
                        if (mmVar2 != null) {
                            if (this.F0) {
                                f3 = 1.0f;
                            } else {
                                f3 = 0.0f;
                            }
                            mmVar2.e(true, f3);
                        }
                    }
                    TLRPC.Chat M03 = uc7.s1(this.m2).M0(Long.valueOf(-this.l1));
                    if ((!this.o1 || (!xc2.q(M03) && !xc2.s0(M03))) && storyItem.views.views_count > 0) {
                        TextView textView = this.k2;
                        if (lcbVar.O0 == null) {
                            M02 = ob6.M0(2131747854, null);
                        } else {
                            M02 = ob6.M0(2131747853, null);
                        }
                        textView.setText(M02);
                        this.k2.setTranslationX(hl.L(16.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "d  ");
                        spannableStringBuilder.setSpan(new wm2(2131231187, 0), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                        spannableStringBuilder.append((CharSequence) hl.o0(storyItem.views.views_count, 0));
                        this.k2.setText(spannableStringBuilder);
                    } else {
                        this.k2.setText("");
                    }
                    ViewGroup.LayoutParams layoutParams = o58Var.getLayoutParams();
                    float L = hl.L(40.0f);
                    if (this.E0) {
                        f = this.A0.d + hl.L(4.0f);
                    } else {
                        f = 0.0f;
                    }
                    layoutParams.width = (int) (L + f);
                    ((ViewGroup.MarginLayoutParams) this.G1.getLayoutParams()).rightMargin = hl.L(40.0f) + o58Var.getLayoutParams().width;
                    o58 o58Var2 = this.z0;
                    if (o58Var2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = o58Var2.getLayoutParams();
                        float L2 = hl.L(40.0f);
                        if (this.F0) {
                            f4 = this.B0.d + hl.L(4.0f);
                        }
                        layoutParams2.width = (int) (L2 + f4);
                        ((ViewGroup.MarginLayoutParams) this.G1.getLayoutParams()).rightMargin += o58Var2.getLayoutParams().width;
                        o58Var2.requestLayout();
                    }
                    this.G1.requestLayout();
                    o58Var.requestLayout();
                    this.l2.setVisibility(8);
                    this.p2.setVisibility(8);
                    TL_stories.StoryItem storyItem2 = n68Var.a;
                    r58 r58Var = this.T0;
                    if (storyItem2 == null) {
                        r58Var.getClass();
                        return;
                    }
                    for (int i4 = 0; i4 < r58Var.getChildCount(); i4++) {
                        if (r58Var.getChildAt(i4) instanceof aab) {
                            ((aab) r58Var.getChildAt(i4)).c(storyItem2.views, z);
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
                            TLObject b2 = uc7.s1(this.m2).b2(storyItem.views.recent_viewers.get(i6).longValue());
                            if (b2 != null) {
                                this.l2.b(i7, this.m2, b2);
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
                        mz1Var = this.l2;
                        if (i8 >= i) {
                            break;
                        }
                        mz1Var.b(i8, this.m2, null);
                        i8++;
                    }
                    mz1Var.a(false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ob6.H(',', "Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        wm2 wm2Var = new wm2(2131231984, 0);
                        wm2Var.y = -53704;
                        wm2Var.n = hl.L(0.2f);
                        spannableStringBuilder2.setSpan(wm2Var, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        wm2 wm2Var2 = new wm2(2131231975, 0);
                        wm2Var2.y = -14161823;
                        wm2Var2.n = hl.L(0.2f);
                        spannableStringBuilder2.setSpan(wm2Var2, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.k2.setText(spannableStringBuilder2);
                    mz1 mz1Var2 = this.l2;
                    if (i7 == 0) {
                        mz1Var2.setVisibility(8);
                        this.k2.setTranslationX(hl.L(16.0f));
                    } else {
                        mz1Var2.setVisibility(0);
                        this.k2.setTranslationX(hl.L(10.0f) + bp1.h(i7, 1, hl.L(20.0f), hl.L(24.0f) + hl.L(13.0f)));
                    }
                    this.p2.setVisibility(0);
                } else {
                    TextView textView2 = this.k2;
                    if (lcbVar.O0 == null) {
                        M0 = ob6.M0(2131747854, null);
                    } else {
                        M0 = ob6.M0(2131747853, null);
                    }
                    textView2.setText(M0);
                    this.k2.setTranslationX(hl.L(16.0f));
                    this.l2.setVisibility(8);
                    this.p2.setVisibility(8);
                }
                o58Var.getLayoutParams().width = hl.L(40.0f);
                this.y0.requestLayout();
                return;
            }
            this.k2.setText("");
            this.p2.setVisibility(8);
            this.l2.setVisibility(8);
        }
    }

    public final void j0() {
        if (this.s2 == null) {
            f41 f41Var = new f41(this, getContext(), this.l0);
            this.s2 = f41Var;
            f41Var.W3 = new k58(this);
            f41Var.d2.g0();
            f41 f41Var2 = this.s2;
            f41Var2.Q1 = true;
            f41Var2.a1();
            f41 f41Var3 = this.s2;
            f41Var3.R1 = new l58(this);
            f41Var3.V0().setText(this.L1.getFieldText());
        }
    }

    public final void j1() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z;
        g58 g58Var;
        float heightWithTopView;
        float f6;
        float f7;
        float f8;
        float L;
        int i;
        float f9;
        float f10;
        int i2;
        o58 o58Var;
        ImageView imageView;
        y58 y58Var;
        o58 o58Var2;
        boolean z2;
        float f11;
        i49 i49Var;
        float f12;
        int i3;
        float f13;
        float f14;
        float f15 = ((ccb) this.A1).d.W;
        if (this.v2) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        mm mmVar = this.y2;
        mmVar.e(false, f);
        int i4 = this.d2;
        if (i4 != 0 && this.e2) {
            f2 = ete.a(this.r2 / i4, 0.0f, 1.0f);
        } else if (this.f2) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        mm mmVar2 = this.G3;
        float f16 = mmVar2.c;
        mm mmVar3 = this.H3;
        float f17 = mmVar3.c;
        mm mmVar4 = this.I3;
        float f18 = mmVar4.c;
        if (this.q2) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        mmVar2.e(false, f3);
        if (!this.S2) {
            g58 g58Var2 = this.L1;
            if (g58Var2 != null && !TextUtils.isEmpty(g58Var2.getFieldText())) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            mmVar3.e(false, f14);
        }
        g58 g58Var3 = this.L1;
        if (g58Var3 != null && g58Var3.o4) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        mmVar4.e(false, f4);
        final g58 g58Var4 = this.L1;
        if (g58Var4 != null) {
            o68 o68Var = g58Var4.c8;
            f5 = 1.0f;
            int backgroundTop = g58Var4.getBackgroundTop();
            int i5 = g58Var4.Z7;
            if (i5 != 0 && backgroundTop != i5) {
                int i6 = (g58Var4.I2 + i5) - backgroundTop;
                g58Var4.setAnimatedTop(i6);
                o68Var.F2 = true;
                ValueAnimator valueAnimator = o68Var.O1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    o68Var.O1.cancel();
                }
                View view = g58Var4.v2;
                if (view != null && view.getVisibility() == 0) {
                    g58Var4.v2.setTranslationY(((1.0f - g58Var4.getTopViewEnterProgress()) * g58Var4.v2.getLayoutParams().height) + g58Var4.I2);
                }
                o68Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i6, 0.0f);
                o68Var.O1 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        byte b = r2;
                        g58 g58Var5 = g58Var4;
                        switch (b) {
                            case 0:
                                g58Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                o68 o68Var2 = g58Var5.c8;
                                o68Var2.F2 = true;
                                o68Var2.invalidate();
                                g58Var5.invalidate();
                                return;
                            default:
                                g58Var5.F0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                o68Var.O1.addListener(new ad5(g58Var4, (byte) 27));
                o68Var.O1.setDuration(250L);
                o68Var.O1.setInterpolator(bb2.V);
                o68Var.O1.start();
                g58Var4.Z7 = 0;
            }
            if (g58Var4.c4) {
                float scrollY = (g58Var4.b8 - g58Var4.F0.getScrollY()) + (g58Var4.a8 - g58Var4.F0.getMeasuredHeight());
                tx1 tx1Var = g58Var4.F0;
                tx1Var.setOffsetY(tx1Var.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(g58Var4.F0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        byte b = r2;
                        g58 g58Var5 = g58Var4;
                        switch (b) {
                            case 0:
                                g58Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                o68 o68Var2 = g58Var5.c8;
                                o68Var2.F2 = true;
                                o68Var2.invalidate();
                                g58Var5.invalidate();
                                return;
                            default:
                                g58Var5.F0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = g58Var4.Y7;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                g58Var4.Y7 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(bb2.V);
                ofFloat2.start();
                g58Var4.c4 = false;
                o68Var.j1();
            }
            g58Var4.getMeasuredHeight();
        } else {
            f5 = 1.0f;
        }
        g58 g58Var5 = this.L1;
        if (g58Var5 != null && g58Var5.U0()) {
            z = true;
        } else {
            z = false;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        boolean z3 = this.h2;
        Paint paint = this.X1;
        if (z3) {
            paint.setColor(vm2.f(this.a2, -14933463, aob.p1(0.44f, -16777216)));
            float f19 = f5;
            paint.setAlpha((int) ((f19 - this.N3) * qd4.z(f19, this.b2, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(vm2.o(-16777216, (int) ((f5 - this.N3) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z4 = this.F2;
        lcb lcbVar = this.t0;
        if (z4 || this.J3 != lcbVar.e0 || mmVar.c != this.A2 || this.c2 != this.r2 || f2 != this.a2 || f15 != this.b2 || f16 != mmVar2.c || z || f18 != mmVar4.c || f17 != mmVar3.c) {
            this.F2 = false;
            this.c2 = this.r2;
            int i7 = (mmVar.c > this.A2 ? 1 : (mmVar.c == this.A2 ? 0 : -1));
            t58 t58Var = this.M0;
            if (i7 != 0) {
                t58Var.invalidate();
            }
            if (f15 != 0.0f) {
                t58Var.setLayerType(2, null);
            } else {
                t58Var.setLayerType(0, null);
            }
            this.A2 = mmVar.c;
            this.b2 = f15;
            this.a2 = f2;
            this.J3 = lcbVar.e0;
            float height = this.r2 - (getHeight() - t58Var.getBottom());
            if (this.L1 == null) {
                heightWithTopView = 0.0f;
            } else {
                heightWithTopView = g58Var.getHeightWithTopView() * f2;
            }
            float max = Math.max(0.0f, height + heightWithTopView);
            float height2 = this.Y1 - (getHeight() - t58Var.getBottom());
            g58 g58Var6 = this.L1;
            if (g58Var6 == null) {
                f7 = 0.0f;
            } else {
                float heightWithTopView2 = g58Var6.getHeightWithTopView();
                if (this.f2) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                f7 = heightWithTopView2 * f6;
            }
            float max2 = Math.max(0.0f, height2 + f7);
            g58 g58Var7 = this.L1;
            if (g58Var7 != null) {
                if (this.N1 != null) {
                    ImageView suggestButton = g58Var7.getSuggestButton();
                    if (suggestButton != null) {
                        this.N1.o(1.0f, -(hl.L(74.0f) - suggestButton.getTranslationX()));
                    }
                    this.N1.setTranslationY(-((getHeight() - this.L1.getY()) + hl.L(6.0f)));
                }
                xt3 editField = this.L1.getEditField();
                c8a senderSelectView = this.L1.getSenderSelectView();
                if (editField != null) {
                    f8 = 6.0f;
                    f13 = 1.0f;
                    float R1 = hl.R1(0.88f, 1.0f, f2);
                    editField.setScaleX(R1);
                    editField.setScaleY(R1);
                } else {
                    f8 = 6.0f;
                    f13 = 1.0f;
                }
                if (senderSelectView != null) {
                    float R12 = hl.R1(0.8f, f13, f2);
                    senderSelectView.setScaleX(R12);
                    senderSelectView.setScaleY(R12);
                    senderSelectView.setTranslationY(hl.U1(f2, -hl.L(2.0f), 0));
                }
            } else {
                f8 = 6.0f;
            }
            if (this.h2) {
                L = 0.0f;
            } else {
                L = hl.L(58.0f) * (1.0f - f2);
            }
            float max3 = Math.max(0.0f, L + max);
            if (!this.h2 && !this.f2) {
                i = hl.L(58.0f);
            } else {
                i = 0;
            }
            float max4 = Math.max(0.0f, max2 + i);
            float L2 = (hl.L(f8) * f2) + max3;
            b58 b58Var = this.v0;
            gu guVar = b58Var.c;
            b58Var.L = L2;
            if (Math.abs(b58Var.M - max4) > 0.1f) {
                b58Var.M = max4;
                f9 = 0.8f;
                i2 = 0;
                f10 = 8.0f;
                guVar.setPadding(hl.L(8.0f), Math.max(0, ((int) max4) - guVar.getTop()) + hl.L(7.5f), hl.L(8.0f), hl.L(7.5f));
                if (!guVar.canScrollVertically(1)) {
                    b58Var.d.g1(0, hl.L(100.0f));
                }
            } else {
                f9 = 0.8f;
                f10 = 8.0f;
                i2 = 0;
            }
            b58Var.setTranslationY(-b58Var.L);
            b58Var.invalidate();
            x96 x96Var = lcbVar.E0;
            if (x96Var != null) {
                x96Var.setKeyboardOffset(max);
            }
            i49 i49Var2 = this.P1;
            n68 n68Var = this.y1;
            if (i49Var2 != null) {
                if (this.a2 > 0.0f && (n68Var == null || !n68Var.f)) {
                    i3 = i2;
                } else {
                    i3 = 8;
                }
                i49Var2.setVisibility(i3);
            }
            int i8 = i2;
            while (true) {
                int childCount = getChildCount();
                o58Var = this.z0;
                imageView = this.x0;
                y58Var = this.u0;
                o58Var2 = this.n0;
                if (i8 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() == 0 && childAt != this.G1 && childAt.getTag(2131296593) == null && childAt != y58Var.W.m(getContext())) {
                    g58 g58Var8 = this.L1;
                    if (g58Var8 != null && childAt == g58Var8.getEmojiView()) {
                        childAt.setTranslationY(this.L1.getEmojiView().getMeasuredHeight() - this.r2);
                    } else if (childAt instanceof lg5) {
                        lg5 lg5Var = (lg5) childAt;
                        View view2 = lg5Var.c;
                        if (view2 != null) {
                            lg5Var.d(view2);
                        }
                    } else if (childAt != this.t2 && childAt != t58Var && childAt != imageView && childAt != this.y0 && childAt != o58Var && childAt != this.G2 && childAt != this.N1 && childAt != o58Var2 && ((i49Var = this.b3) == null || i49Var.getReactionsWindow() == null || childAt != this.b3.getReactionsWindow().c)) {
                        float f20 = this.a2;
                        f20 = (childAt == this.H1 || childAt == this.J1 || childAt == this.K1 || childAt == this.I1) ? 0.0f : 0.0f;
                        float f21 = 1.0f - f20;
                        float L3 = (((((-this.u2) * f21) - (hl.L(7.0f) * f20)) - this.r2) - (hl.L(f10) * f21)) - (hl.L(20.0f) * lcbVar.e0);
                        if (childAt == this.H1 || childAt == this.J1 || childAt == this.K1 || childAt == this.I1) {
                            L3 += this.r2;
                        }
                        if (this.h2) {
                            f12 = (1.0f - this.b2) * hideInterfaceAlpha;
                        } else {
                            f12 = hideInterfaceAlpha * 1.0f;
                        }
                        if (childAt == this.L2) {
                            L3 = lcbVar.e0 * (-hl.L(20.0f));
                        }
                        if (childAt == this.N2) {
                            L3 -= this.L1.getMeasuredHeight() - this.L1.getAnimatedTop();
                            f12 = this.a2;
                            childAt.invalidate();
                        }
                        if (childAt == this.M1) {
                            L3 -= this.L1.getMeasuredHeight() - this.L1.getAnimatedTop();
                            f12 *= this.a2;
                        }
                        if (childAt == this.P1) {
                            float f22 = (1.0f - mmVar3.c) * (1.0f - f18) * (1.0f - mmVar2.c) * this.a2;
                            float f23 = f12 * f22 * 1.0f;
                            if (childAt.getAlpha() != 0.0f && f23 == 0.0f) {
                                this.P1.k();
                            }
                            childAt.setAlpha(f23);
                            float f24 = (f22 * 0.2f) + f9;
                            childAt.setScaleX(f24);
                            childAt.setScaleY(f24);
                        } else {
                            childAt.setTranslationY(L3);
                            g58 g58Var9 = this.L1;
                            if (g58Var9 == null || childAt != g58Var9.D2) {
                                childAt.setAlpha(f12);
                            }
                        }
                    }
                } else if (childAt == this.G1) {
                    if (this.h2) {
                        childAt.setAlpha((1.0f - this.N3) * (1.0f - this.b2) * hideInterfaceAlpha);
                    } else {
                        childAt.setAlpha((1.0f - this.N3) * hideInterfaceAlpha);
                    }
                }
                i8++;
            }
            float f25 = 0.0f;
            float f26 = (1.0f - f15) * hideInterfaceAlpha;
            imageView.setAlpha((1.0f - this.N3) * f26);
            o58Var2.setAlpha((1.0f - this.N3) * f26);
            if (o58Var != null) {
                o58Var.setAlpha((1.0f - this.N3) * f26);
            }
            for (int i9 = 0; i9 < t58Var.getChildCount(); i9++) {
                View childAt2 = t58Var.getChildAt(i9);
                if (childAt2 != null && childAt2 != this.w0) {
                    l68 l68Var = this.Y0;
                    b6 b6Var = this.i0;
                    if (childAt2 != l68Var && childAt2 != this.g0 && childAt2 != this.h0 && childAt2 != b6Var && childAt2 != this.G1 && childAt2 != y58Var && childAt2 != this.m0) {
                        childAt2.setAlpha(hideInterfaceAlpha);
                    } else {
                        if (childAt2 == b6Var) {
                            f11 = this.O2;
                        } else {
                            f11 = 1.0f;
                        }
                        float f27 = this.N3;
                        if (childAt2 == y58Var) {
                            childAt2.setAlpha((1.0f - f27) * f11 * hideInterfaceAlpha);
                        } else {
                            childAt2.setAlpha((1.0f - f27) * f11 * hideInterfaceAlpha);
                        }
                    }
                }
            }
            if (this.L1 != null) {
                float L4 = hl.L(40.0f);
                if (!n68Var.f) {
                    if (this.C2) {
                        L4 += hl.L(46.0f);
                    }
                    if (this.D2 && this.n1) {
                        L4 += hl.L(46.0f);
                    }
                    if (o58Var2.getVisibility() == 0) {
                        L4 = (L4 - hl.L(40.0f)) + o58Var2.getLayoutParams().width;
                    }
                } else {
                    float L5 = hl.L(46.0f);
                    L4 = hl.L(46.0f);
                    tj7 tj7Var = this.K1;
                    if (tj7Var != null && tj7Var.getVisibility() == 0) {
                        L4 += hl.L(46.0f);
                    }
                    f25 = L5;
                }
                g58 g58Var10 = this.L1;
                float f28 = -hl.L(10.0f);
                float f29 = -(hl.L(10.0f) + L4 + f25);
                float f30 = this.a2;
                if ((this.C2 || this.o1) && !n68Var.f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                g58Var10.S1(f28, f29, f30, z2);
                if (this.L1.getEmojiView() != null) {
                    this.L1.getEmojiView().setAlpha(this.a2);
                }
            }
        }
    }

    public final void k0() {
        if (this.H1 == null && getContext() != null) {
            dn2 dn2Var = new dn2(getContext(), this.r3);
            this.H1 = dn2Var;
            dn2Var.setOnClickListener(new v48(this, (byte) 5));
            addView(this.H1, tre.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void l0() {
        x53 x53Var = this.l0;
        g58 g58Var = new g58(this, hl.W(getContext()), this, new pu0(x53Var, (byte) 4));
        this.L1 = g58Var;
        xt3 editField = g58Var.getEditField();
        editField.getClass();
        pt3 pt3Var = new pt3(editField, (byte) 0);
        editField.u0 = pt3Var;
        pt3Var.q(true);
        editField.u0.u(editField.y0);
        editField.u0.w(editField.getPaint().getTextSize());
        pt3 pt3Var2 = new pt3(editField, (byte) 1);
        editField.v0 = pt3Var2;
        pt3Var2.b = 5;
        pt3Var2.u(editField.y0);
        editField.v0.w(editField.getPaint().getTextSize());
        this.L1.getEditField().setScaleX(0.0f);
        this.L1.setOverrideKeyboardAnimation(true);
        this.L1.setClipChildren(false);
        this.L1.setDelegate(new h58(this));
        setDelegate(this.L1);
        g58 g58Var2 = this.L1;
        g58Var2.i6 = false;
        g58Var2.j6 = true;
        if (this.y1.f) {
            g58Var2.G1(false, false, false);
        } else {
            g58Var2.G1(true, true, false);
        }
        this.L1.updateColors();
        g58 g58Var3 = this.L1;
        g58Var3.k6 = true;
        addView(g58Var3, tre.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.x3 != null) {
            this.L1.I2(false);
        }
        this.L1.v3 = this.j2;
        d30 d30Var = this.w2;
        ((ArrayList) d30Var.g).add(this.M0);
        ((ArrayList) d30Var.g).add(this);
        if (this.K0) {
            this.L1.j1();
        }
        h0(false);
        if (A0()) {
            this.L1.setVisibility(8);
        }
        vz1 vz1Var = new vz1(getContext(), x53Var, this.r3, this.p3);
        this.M1 = vz1Var;
        vz1Var.setOnClickListener(new s48(this, (byte) 2));
        addView(this.M1, tre.e(57, 300, 85));
        this.M1.setVisibility(8);
        this.L1.setSideButtonsForAttach(this.M1);
        this.s0 = getChildCount();
    }

    public final void m0() {
        if (this.T1 != null) {
            return;
        }
        d8b d8bVar = new d8b(getContext(), this.l0);
        this.T1 = d8bVar;
        d8bVar.setOnClickListener(new v48(this, (byte) 7));
        this.T1.setAlpha(0.0f);
        this.T1.setVisibility(8);
        addView(this.T1, tre.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void n0() {
        boolean z;
        if (this.K1 == null && getContext() != null) {
            tj7 tj7Var = new tj7(getContext(), this.r3);
            this.K1 = tj7Var;
            tj7Var.setOnClickListener(new v48(this, (byte) 9));
            tj7 tj7Var2 = this.K1;
            w96 w96Var = w96.N;
            boolean z2 = true;
            if (w96Var != null && w96Var.r()) {
                z = true;
            } else {
                z = false;
            }
            tj7Var2.b(z, false);
            tj7 tj7Var3 = this.K1;
            w96 w96Var2 = w96.N;
            if (w96Var2 != null && !w96Var2.G) {
                z2 = false;
            }
            tj7Var3.a(z2, false);
            addView(this.K1, tre.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void o0() {
        if (this.J1 == null && getContext() != null) {
            this.I1 = new bv7(getContext(), this.m2);
            cv7 cv7Var = new cv7(getContext(), this.I1, this.r3);
            this.J1 = cv7Var;
            cv7Var.setOnClickListener(new v48(this, (byte) 10));
            this.J1.setOnLongClickListener(new x48(this, (byte) 1));
            addView(this.J1, tre.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
            addView(this.I1, tre.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K0 = true;
        this.O0.I();
        this.Q0.I();
        this.P0.I();
        this.V2.I();
        this.X2.I();
        g58 g58Var = this.L1;
        if (g58Var != null) {
            g58Var.j1();
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.R0;
            if (i < arrayList.size()) {
                ((p39) arrayList.get(i)).b(true);
                i++;
            } else {
                jn7.f(this.m2).b(this, jn7.T);
                jn7.f(this.m2).b(this, jn7.G2);
                jn7.f(this.m2).b(this, jn7.y5);
                jn7.f(this.m2).b(this, jn7.o3);
                jn7.f(this.m2).b(this, jn7.A5);
                jn7.f(this.m2).b(this, jn7.G5);
                jn7.f(this.m2).b(this, jn7.d3);
                jn7.f(this.m2).b(this, jn7.k3);
                jn7.f(this.m2).b(this, jn7.E);
                jn7.e().b(this, jn7.l4);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K0 = false;
        this.O0.K();
        this.Q0.K();
        this.P0.K();
        this.V2.K();
        this.X2.K();
        g58 g58Var = this.L1;
        if (g58Var != null) {
            g58Var.i1();
        }
        wl wlVar = this.Y2;
        if (wlVar != null) {
            wlVar.o(this);
            this.Y2 = null;
        }
        yl ylVar = this.W2;
        if (ylVar != null) {
            ylVar.d(this);
            this.W2 = null;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.R0;
            if (i < arrayList.size()) {
                ((p39) arrayList.get(i)).b(false);
                i++;
            } else {
                jn7.f(this.m2).n(this, jn7.T);
                jn7.f(this.m2).n(this, jn7.G2);
                jn7.f(this.m2).n(this, jn7.y5);
                jn7.f(this.m2).n(this, jn7.o3);
                jn7.f(this.m2).n(this, jn7.A5);
                jn7.f(this.m2).n(this, jn7.G5);
                jn7.f(this.m2).n(this, jn7.d3);
                jn7.f(this.m2).n(this, jn7.k3);
                jn7.f(this.m2).n(this, jn7.E);
                jn7.e().n(this, jn7.l4);
                return;
            }
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.h1.d.setBounds(0, 0, getMeasuredWidth(), hl.L(72.0f));
    }

    @Override
    public final void onMeasure(int r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o68.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a2 = -1.0f;
        this.F2 = true;
        invalidate();
    }

    public final void p0() {
        int i;
        if (this.Q1 != null) {
            return;
        }
        if (this.L1 == null) {
            l0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.Q1 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(2131231980);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.R1 = textView;
        textView.setTextColor(-8026747);
        this.R1.setTextSize(1, 16.0f);
        TextView textView2 = this.R1;
        if (this.o1) {
            i = 2131744319;
        } else {
            i = 2131744147;
        }
        textView2.setText(ob6.M0(i, null));
        TextView textView3 = new TextView(getContext());
        this.S1 = textView3;
        textView3.setTextColor(-1);
        this.S1.setTextSize(1, 12.0f);
        TextView textView4 = this.S1;
        int L = hl.L(40.0f);
        textView4.setBackground(aob.i0(L, L, L, L, 452984831, 855638015, 855638015));
        this.S1.setGravity(17);
        iye.a(this.S1);
        this.S1.setText(ob6.M0(2131744146, null));
        this.S1.setPadding(hl.L(7.0f), 0, hl.L(7.0f), 0);
        this.Q1.addView(imageView, tre.t(22, 22, 16, 12, 1, 4, 0));
        this.Q1.addView(this.R1, tre.s(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.Q1.addView(this.S1, tre.s(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.L1.addView(this.Q1, tre.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    public final void q0() {
        if (this.L2 != null) {
            return;
        }
        xb xbVar = new xb(getContext(), (byte) 29);
        this.L2 = xbVar;
        xbVar.setTextSize(1, 14.0f);
        this.L2.setTextColor(vm2.f(0.5f, -16777216, -1));
        this.L2.setGravity(19);
        this.L2.setText(ob6.M0(2131744145, null));
        addView(this.L2, tre.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void r0() {
        if (this.G1 != null) {
            return;
        }
        o58 o58Var = new o58(this, getContext(), (byte) 0);
        this.G1 = o58Var;
        o58Var.setClickable(true);
        addView(this.G1, tre.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        a81 a81Var = new a81(this, getContext());
        this.p2 = a81Var;
        a81Var.setOnClickListener(new v48(this, (byte) 8));
        this.G1.addView(this.p2, tre.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        mz1 mz1Var = new mz1((byte) 1, getContext(), false);
        this.l2 = mz1Var;
        mz1Var.setAvatarsTextSize(hl.L(18.0f));
        this.G1.addView(this.l2, tre.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.k2 = textView;
        textView.setTextSize(1, 14.0f);
        this.k2.setTextColor(-1);
        this.G1.addView(this.k2, tre.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.h1.s);
        a81 a81Var2 = this.p2;
        int L = hl.L(15.0f);
        int o = vm2.o(-1, 120);
        a81Var2.setBackground(aob.i0(L, L, L, L, 0, o, o));
        imageView.setBackground(aob.N(vm2.o(-1, 120), -hl.L(2.0f), -hl.L(2.0f)));
    }

    public final void s0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (!A0() && !this.y1.f) {
            boolean p = yac.h(this.m2).p();
            x53 x53Var = this.l0;
            if (p) {
                s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232398, ob6.M0(2131744544, null), false, x53Var).setOnClickListener(new v48(this, (byte) 12));
                return;
            }
            Drawable drawable = getContext().getDrawable(2131232174);
            drawable.setColorFilter(new PorterDuffColorFilter(vm2.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            c58 c58Var = new c58(getContext().getDrawable(2131232386), drawable, (byte) 0);
            b8 c = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232398, ob6.M0(2131744544, null), false, x53Var);
            c.setOnClickListener(new v48(this, (byte) 13));
            c.setIcon(c58Var);
        }
    }

    public void setAccount(int i) {
        this.m2 = i;
        this.C1 = uc7.s1(i).e0;
        this.U0.b = i;
        i49 i49Var = this.P1;
        if (i49Var != null) {
            i49Var.setCurrentAccount(i);
            this.P1.m(null, null, true);
        }
        i49 i49Var2 = this.b3;
        if (i49Var2 != null) {
            i49Var2.setCurrentAccount(i);
        }
    }

    public void setActive(boolean z) {
        O0(0L, z);
    }

    public void setDelegate(k68 k68Var) {
        this.A1 = k68Var;
    }

    public void setIsVisible(boolean z) {
        if (this.P2 != z) {
            this.P2 = z;
            if (z) {
                this.O0.i1 = 1.0f;
                h0(false);
            }
        }
    }

    public void setLongpressed(boolean z) {
        if (this.u1) {
            this.v2 = z;
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
        if (this.L0 != z) {
            this.L0 = z;
            this.M0.invalidate();
            if (this.u1 && this.t0.a && Build.VERSION.SDK_INT < 33) {
                ki7 ki7Var = this.F3;
                if (z) {
                    hl.r(ki7Var);
                    hl.d3(ki7Var, 250L);
                    return;
                }
                hl.r(ki7Var);
                lcb lcbVar = ((ccb) this.A1).d;
                lcbVar.l1 = true;
                lcbVar.U();
            }
        }
    }

    public void setPaused(boolean z) {
        if (this.B1 != z) {
            this.B1 = z;
            nl nlVar = this.O0;
            if (z) {
                nlVar.x0();
                nlVar.u0 = false;
            } else {
                nlVar.w0(false);
                nlVar.u0 = true;
            }
            this.H0 = 0L;
            this.M0.invalidate();
        }
    }

    public final void t0() {
        if (this.K2 != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTypeface(hl.o());
        textView.setGravity(1);
        textView.setTextSize(1, 16.0f);
        textView.setText(ob6.M0(2131744107, null));
        int i = aob.G6;
        x53 x53Var = this.l0;
        yob.X(textView, i, x53Var);
        TextView textView2 = new TextView(getContext());
        iye.a(textView2);
        textView2.setText(ob6.M0(2131754223, null));
        int i2 = aob.Ji;
        yob.X(textView2, i2, x53Var);
        textView2.setPadding(hl.L(16.0f), hl.L(12.0f), hl.L(16.0f), hl.L(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(hl.o());
        textView2.setTextSize(1, 15.0f);
        int L = hl.L(8.0f);
        int i3 = aob.Fi;
        int v0 = aob.v0(i3, x53Var);
        int o = vm2.o(aob.v0(i2, x53Var), 30);
        hf0 i0 = aob.i0(L, L, L, L, v0, o, o);
        uob M = yob.M(i3);
        uob g = yob.g(i2, 30);
        textView2.setBackground(i0);
        yob.j(textView2, i0, M, g, x53Var);
        textView2.setOnClickListener(new v48(this, (byte) 6));
        linearLayout.addView(textView, tre.o(-1, -2));
        linearLayout.addView(textView2, tre.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, tre.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.M0.addView(frameLayout);
        this.K2 = frameLayout;
    }

    public final void u0() {
        int i;
        int i2;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.l0, getContext());
        if (A0()) {
            i = 2131751529;
        } else {
            i = 2131751452;
        }
        String M0 = ob6.M0(i, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        if (A0()) {
            i2 = 2131751530;
        } else {
            i2 = 2131751453;
        }
        idVar.U = ob6.M0(i2, null);
        alertDialog$Builder.j(ob6.M0(2131751563, null), new s48(this, (byte) 0));
        alertDialog$Builder.g(ob6.M0(2131752570, null), new ku7((byte) 17));
        ((ccb) this.A1).h(idVar);
        idVar.h();
    }

    public final boolean v0(boolean z) {
        w96 w96Var;
        TLRPC.Peer l;
        long e = yac.h(this.m2).e();
        int i = (this.l1 > 0L ? 1 : (this.l1 == 0L ? 0 : -1));
        lcb lcbVar = this.t0;
        if (i < 0) {
            w96 w96Var2 = lcbVar.B0;
            if (w96Var2 != null && z) {
                TLRPC.Peer l2 = w96Var2.l();
                TLRPC.Chat M0 = uc7.s1(this.m2).M0(Long.valueOf(-this.l1));
                if (lcbVar.B0.o() || xc2.w(14, M0)) {
                    if (l2 == null || this.l1 == wf3.n(l2) || wf3.n(l2) == yac.h(this.m2).e()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } else if (lcbVar != null && (w96Var = lcbVar.B0) != null && w96Var.o()) {
            if (!z || (l = lcbVar.B0.l()) == null || this.l1 == wf3.n(l) || wf3.n(l) == e || this.l1 == e) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public final void w0(Canvas canvas, int i, int i2) {
        d30 d30Var = this.w2;
        if (((jx) d30Var.e) != null) {
            if (((SurfaceView) d30Var.d) != null) {
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                if (Build.VERSION.SDK_INT >= 24) {
                    hl.y0((SurfaceView) d30Var.d, createBitmap);
                }
                if (createBitmap != null) {
                    canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                    return;
                }
                return;
            }
            TextureView textureView = (TextureView) d30Var.f;
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
        t58 t58Var = this.M0;
        canvas.scale(i / t58Var.getMeasuredWidth(), i2 / t58Var.getMeasuredHeight());
        this.O0.h(canvas, null);
        canvas.restore();
    }

    public final void x0(u9b u9bVar, TL_stories.StoryItem storyItem) {
        int i;
        View[] viewPages;
        k68 k68Var = this.A1;
        Context context = getContext();
        if (storyItem.pinned) {
            i = Integer.MAX_VALUE;
        } else {
            i = storyItem.expire_date - storyItem.date;
        }
        w9b w9bVar = new w9b(context, i, this.l0);
        w9bVar.S0(u9bVar);
        ir1 ir1Var = w9bVar.l1;
        if (ir1Var != null) {
            for (View view : ir1Var.getViewPages()) {
                if (view instanceof r9b) {
                    ((r9b) view).f(false);
                }
            }
        }
        w9bVar.M0(true);
        w9bVar.N1 = new rm6(this, storyItem, (byte) 27);
        ((ccb) k68Var).h(w9bVar);
    }

    public final boolean y0(android.view.ViewGroup r11, float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o68.y0(android.view.ViewGroup, float, float, boolean):boolean");
    }

    public final boolean z0(View view, MotionEvent motionEvent) {
        float x = getX();
        t58 t58Var = this.M0;
        float x2 = view.getX() + t58Var.getX() + x;
        float y = view.getY() + t58Var.getY() + getY();
        if (motionEvent.getX() >= x2 && motionEvent.getX() <= x2 + view.getWidth() && motionEvent.getY() >= y && motionEvent.getY() <= y + view.getHeight()) {
            return true;
        }
        return false;
    }
}
