package fi;

import a8.sa;
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
import c8.ma;
import c8.ra;
import c8.va;
import di.pb;
import di.xb;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.bz;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.de;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.z40;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.fr0;
import org.telegram.ui.nx;
public abstract class z3 extends au0 implements fs {
    public org.telegram.ui.Components.m6 A0;
    public s3 A1;
    public float A2;
    public int A3;
    public org.telegram.ui.Components.m6 B0;
    public boolean B1;
    public long B2;
    public final r1 B3;
    public org.telegram.ui.Components.c6 C0;
    public p6 C1;
    public boolean C2;
    public final ArrayList C3;
    public org.telegram.ui.Components.c6 D0;
    public boolean D1;
    public boolean D2;
    public final ArrayList D3;
    public boolean E0;
    public boolean E1;
    public boolean E2;
    public boolean E3;
    public boolean F0;
    public boolean F1;
    public boolean F2;
    public boolean F3;
    public long G0;
    public t2 G1;
    public j30 G2;
    public final sa G3;
    public long H0;
    public a H1;
    public final fr0 H2;
    public final org.telegram.ui.Components.c6 H3;
    public boolean I0;
    public m1 I1;
    public boolean I2;
    public final org.telegram.ui.Components.c6 I3;
    public boolean J0;
    public n1 J1;
    public q2 J2;
    public final org.telegram.ui.Components.c6 J3;
    public boolean K0;
    public j1 K1;
    public FrameLayout K2;
    public float K3;
    public boolean L0;
    public i2 L1;
    public xb L2;
    public final Path L3;
    public final c3 M0;
    public lh.h M1;
    public boolean M2;
    public boolean M3;
    public final FrameLayout N0;
    public hi.m3 N1;
    public k2 N2;
    public ValueAnimator N3;
    public final s2 O0;
    public ValueAnimator O1;
    public float O2;
    public float O3;
    public final ImageReceiver P0;
    public vi0 P1;
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
    public final y2 T0;
    public d8 T1;
    public boolean T2;
    public final nx U0;
    public ViewPropertyAnimator U1;
    public boolean U2;
    public e4 V0;
    public final fh.g V1;
    public final ImageReceiver V2;
    public float W0;
    public final fh.g W1;
    public ch.d W2;
    public final org.telegram.ui.Components.b9 X0;
    public final Paint X1;
    public final ImageReceiver X2;
    public final v3 Y0;
    public int Y1;
    public org.telegram.ui.Components.o5 Y2;
    public final e8 Z0;
    public ValueAnimator Z1;
    public boolean Z2;
    public m6.n f12807a1;
    public float f12808a2;
    public boolean f12809a3;
    public int f12810b1;
    public float f12811b2;
    public vi0 f12812b3;
    public org.telegram.ui.ActionBar.z0 f12813c1;
    public float f12814c2;
    public boolean f12815c3;
    public r3 f12816d1;
    public int d2;
    public float f12817d3;
    public TL_stories.PeerStories f12818e1;
    public boolean f12819e2;
    public boolean f12820e3;
    public final ArrayList f12821f1;
    public boolean f12822f2;
    public float f12823f3;
    public final ImageView f12824g0;
    public final ArrayList f12825g1;
    public boolean f12826g2;
    public int f12827g3;
    public final ImageView f12828h0;
    public final w3 f12829h1;
    public boolean f12830h2;
    public int f12831h3;
    public final bi.p2 f12832i0;
    public final bg.r0 f12833i1;
    public int f12834i2;
    public int f12835i3;
    public final ph0 f12836j0;
    public ArrayList f12837j1;
    public final int f12838j2;
    public r1 j3;
    public final ImageView f12839k0;
    public int f12840k1;
    public TextView f12841k2;
    public float f12842k3;
    public final org.telegram.ui.ActionBar.i6 f12843l0;
    public long l1;
    public u f12844l2;
    public boolean f12845l3;
    public final k8 m0;
    public boolean f12846m1;
    public int f12847m2;
    public h6.m f12848m3;
    public final t2 f12849n0;
    public boolean n1;
    public int f12850n2;
    public org.telegram.ui.ActionBar.z0 f12851n3;
    public u6 f12852o0;
    public boolean f12853o1;
    public boolean f12854o2;
    public org.telegram.ui.ActionBar.z0 f12855o3;
    public hi.m3 f12856p0;
    public boolean f12857p1;
    public u2 f12858p2;
    public final dh.c f12859p3;
    public hi.m3 f12860q0;
    public boolean f12861q1;
    public boolean f12862q2;
    public final ui.a f12863q3;
    public hi.m3 f12864r0;
    public long f12865r1;
    public float f12866r2;
    public final ui.f f12867r3;
    public int f12868s0;
    public final float f12869s1;
    public n2 f12870s2;
    public final gh.b f12871s3;
    public final f9 f12872t0;
    public int f12873t1;
    public z40 f12874t2;
    public TL_stories.TL_premium_boostsStatus f12875t3;
    public final g3 f12876u0;
    public boolean f12877u1;
    public int f12878u2;
    public org.telegram.messenger.g3 f12879u3;
    public final a2 f12880v0;
    public int f12881v1;
    public boolean f12882v2;
    public long f12883v3;
    public final View f12884w0;
    public int f12885w1;
    public final y3 f12886w2;
    public long f12887w3;
    public final ImageView f12888x0;
    public int f12889x1;
    public final h2.f f12890x2;
    public boolean f12891x3;
    public final LinearLayout f12892y0;
    public final x3 f12893y1;
    public final org.telegram.ui.Components.c6 f12894y2;
    public TLRPC.TL_channels_sendAsPeers f12895y3;
    public final t2 f12896z0;
    public final a8.b8 f12897z1;
    public final org.telegram.ui.Components.c6 f12898z2;
    public final r1 f12899z3;

    public z3(Context context, final f9 f9Var, w3 w3Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null);
        this.L0 = true;
        this.R0 = new ArrayList();
        this.f12810b1 = -5;
        this.f12869s1 = 1.0f;
        x3 x3Var = new x3(this);
        this.f12893y1 = x3Var;
        this.f12808a2 = -1.0f;
        this.f12811b2 = -1.0f;
        this.f12814c2 = -1.0f;
        this.f12838j2 = ConnectionsManager.generateClassGuid();
        this.f12894y2 = new org.telegram.ui.Components.c6(this);
        this.f12898z2 = new org.telegram.ui.Components.c6(this);
        fr0 fr0Var = new fr0();
        this.H2 = fr0Var;
        this.O2 = 1.0f;
        this.f12899z3 = new r1(this, 4);
        this.B3 = new r1(this, 11);
        this.C3 = new ArrayList();
        this.D3 = new ArrayList();
        this.G3 = new sa(this, 24);
        this.H3 = new org.telegram.ui.Components.c6(this);
        this.I3 = new org.telegram.ui.Components.c6(this);
        this.J3 = new org.telegram.ui.Components.c6(this);
        this.L3 = new Path();
        fr0Var.E = new ob.c(this, 22);
        ?? obj = new Object();
        obj.f12775g = new ArrayList();
        this.f12886w2 = obj;
        this.f12890x2 = new h2.f((int[]) null);
        this.f12821f1 = new ArrayList();
        this.f12825g1 = new ArrayList();
        s2 s2Var = new s2(this, 0);
        this.O0 = s2Var;
        s2Var.B0 = false;
        s2Var.A1 = true;
        s2Var.f22674y = true;
        s2Var.h0(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.V2 = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.f22674y = true;
        imageReceiver.h0(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.X2 = imageReceiver2;
        imageReceiver2.A1 = true;
        imageReceiver2.f22674y = true;
        imageReceiver2.h0(3);
        ImageReceiver imageReceiver3 = new ImageReceiver(null);
        this.P0 = imageReceiver3;
        imageReceiver3.A1 = true;
        imageReceiver3.f22674y = true;
        imageReceiver3.h0(0);
        ImageReceiver imageReceiver4 = new ImageReceiver(null);
        this.Q0 = imageReceiver4;
        imageReceiver4.A1 = true;
        imageReceiver4.f22674y = true;
        imageReceiver4.h0(0);
        s2Var.f22619a = Arrays.asList(imageReceiver3, imageReceiver4);
        this.X0 = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        this.f12872t0 = f9Var;
        this.f12829h1 = w3Var;
        this.f12897z1 = w3Var.f12682g;
        this.C1 = mp.u1(j10.f24770t0).R1();
        w3Var.f12686l.setColor(-16777216);
        this.X1 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.f12843l0 = i6Var;
        setClipChildren(false);
        y2 y2Var = new y2(this, context, this.M0, i6Var, f9Var);
        this.T0 = y2Var;
        gh.b bVar = new gh.b(i6Var, org.telegram.ui.ActionBar.n6.Je, 0.8f);
        this.f12871s3 = bVar;
        ui.c cVar = new ui.c();
        cVar.a(i0.a.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT >= 31 && bz.e()) {
            ui.f fVar = new ui.f(cVar);
            this.f12867r3 = fVar;
            fVar.k(org.telegram.messenger.g0.L(8.0f));
            this.f12863q3 = fVar;
        } else {
            this.f12867r3 = null;
            this.f12863q3 = cVar;
        }
        jh.k kVar = new jh.k(this);
        ui.a aVar = this.f12863q3;
        dh.c cVar2 = new dh.c(aVar, aVar, aVar);
        cVar2.h = kVar;
        cVar2.f8377i = this;
        this.f12859p3 = cVar2;
        this.V1 = cVar2.c(this, bVar, false);
        fh.g c10 = cVar2.c(this, bVar, false);
        this.W1 = c10;
        c10.u(org.telegram.messenger.g0.L(32.0f));
        c3 c3Var = new c3(this, context, w3Var, f9Var);
        this.M0 = c3Var;
        c3Var.setClipChildren(false);
        this.U0 = new nx(this.f12847m2, c3Var);
        c3Var.addView(y2Var, ma.c(-1.0f, -1));
        g3 g3Var = new g3(this, getContext(), f9Var.E, f9Var, i6Var);
        this.f12876u0 = g3Var;
        g3Var.f12737c0.setOnClickListener(new t1(this, 10));
        ImageView imageView = new ImageView(context);
        this.f12888x0 = imageView;
        imageView.setImageDrawable(w3Var.f12687m);
        int L = org.telegram.messenger.g0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        imageView.setOnClickListener(new t1(this, 11));
        imageView.setContentDescription(gd.M0(2131745264, null));
        ra.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(w3Var.f12688n);
        imageView2.setPadding(L, L, L, L);
        t2 t2Var = new t2(this, getContext(), 1);
        this.f12896z0 = t2Var;
        org.telegram.ui.Components.m6 m6Var = this.B0;
        if (m6Var != null) {
            m6Var.setCallback(t2Var);
        }
        t2Var.setWillNotDraw(false);
        t2Var.setOnClickListener(new t1(this, 12));
        t2 t2Var2 = new t2(this, getContext(), 2);
        this.f12849n0 = t2Var2;
        org.telegram.ui.Components.m6 m6Var2 = this.A0;
        if (m6Var2 != null) {
            m6Var2.setCallback(t2Var2);
        }
        t2Var2.setWillNotDraw(false);
        t2Var2.setOnClickListener(new t1(this, 13));
        t2Var2.setOnLongClickListener(new z1(0, this, f9Var));
        u6 u6Var = new u6(context, w3Var);
        this.f12852o0 = u6Var;
        u6Var.setPadding(L, L, L, L);
        t2Var2.addView(this.f12852o0, ma.e(40, 40, 3));
        t2Var.addView(imageView2, ma.e(40, 40, 3));
        ra.b(t2Var2, 0.3f, 5.0f);
        ra.b(t2Var, 0.3f, 5.0f);
        s2Var.A1 = true;
        s2Var.H0(c3Var);
        bg.r0 r0Var = new bg.r0(10);
        this.f12833i1 = r0Var;
        c3Var.setOutlineProvider(r0Var);
        c3Var.setClipToOutline(true);
        addView(c3Var);
        v3 v3Var = new v3(context, x3Var);
        this.Y0 = v3Var;
        v3Var.setOnClickListener(new View.OnClickListener(this) {
            public final z3 f12368b;

            {
                this.f12368b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7;
                int i10 = r3;
                f9 f9Var2 = f9Var;
                z3 z3Var = this.f12368b;
                switch (i10) {
                    case 0:
                        long j3 = j10.i(z3Var.f12847m2).f24789n;
                        long j10 = z3Var.l1;
                        if (j3 == j10) {
                            Bundle f10 = p5.c.f(1, "type");
                            f10.putLong("dialog_id", z3Var.l1);
                            f9Var2.N(new i90(f10, null));
                            return;
                        } else if (j10 > 0) {
                            f9Var2.N(ProfileActivity.D4(j10));
                            return;
                        } else {
                            f9Var2.N(bn.ua(j10));
                            return;
                        }
                    default:
                        if (z3Var.f12893y1.j()) {
                            f9Var2.U();
                            if (!f9.D1) {
                                mp.g1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            bi.p2 p2Var = z3Var.f12832i0;
                            if (!f9.D1) {
                                i7 = 2131748122;
                            } else {
                                i7 = 2131743612;
                            }
                            p2Var.setContentDescription(gd.M0(i7, null));
                            return;
                        }
                        z3Var.a1(true);
                        return;
                }
            }
        });
        c3Var.addView(v3Var, ma.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.N0 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f12892y0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, ma.r(40, 40, 5));
        linearLayout.addView(t2Var, ma.r(40, 40, 5));
        linearLayout.addView(t2Var2, ma.r(40, 40, 5));
        addView(linearLayout, ma.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f12824g0 = imageView3;
        imageView3.setImageDrawable(w3Var.f12691q);
        imageView3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.n6.h0(-1, 1, -1));
        imageView3.setContentDescription(gd.M0(2131754839, null));
        c3Var.addView(imageView3, ma.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.f12828h0 = imageView4;
        imageView4.setImageDrawable(w3Var.f12692r);
        imageView4.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.n6.h0(-1, 1, -1));
        imageView4.setContentDescription(gd.M0(2131754808, null));
        c3Var.addView(imageView4, ma.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new ah.d(f9Var, 23));
        imageView3.setOnClickListener(new d0(this, i6Var, f9Var, context, w3Var, 1));
        bi.p2 p2Var = new bi.p2(context, 2);
        this.f12832i0 = p2Var;
        c3Var.addView(p2Var, ma.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ?? imageView5 = new ImageView(context);
        this.f12836j0 = imageView5;
        imageView5.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        p2Var.addView(imageView5);
        ImageView imageView6 = new ImageView(context);
        this.f12839k0 = imageView6;
        imageView6.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        imageView6.setImageDrawable(w3Var.f12694t);
        p2Var.addView(imageView6);
        imageView6.setVisibility(8);
        k8 k8Var = new k8(context);
        this.m0 = k8Var;
        k8Var.setOnClickListener(new t1(this, 2));
        c3Var.addView(k8Var, ma.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        p2Var.setOnClickListener(new View.OnClickListener(this) {
            public final z3 f12368b;

            {
                this.f12368b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7;
                int i10 = r3;
                f9 f9Var2 = f9Var;
                z3 z3Var = this.f12368b;
                switch (i10) {
                    case 0:
                        long j3 = j10.i(z3Var.f12847m2).f24789n;
                        long j10 = z3Var.l1;
                        if (j3 == j10) {
                            Bundle f10 = p5.c.f(1, "type");
                            f10.putLong("dialog_id", z3Var.l1);
                            f9Var2.N(new i90(f10, null));
                            return;
                        } else if (j10 > 0) {
                            f9Var2.N(ProfileActivity.D4(j10));
                            return;
                        } else {
                            f9Var2.N(bn.ua(j10));
                            return;
                        }
                    default:
                        if (z3Var.f12893y1.j()) {
                            f9Var2.U();
                            if (!f9.D1) {
                                mp.g1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            bi.p2 p2Var2 = z3Var.f12832i0;
                            if (!f9.D1) {
                                i7 = 2131748122;
                            } else {
                                i7 = 2131743612;
                            }
                            p2Var2.setContentDescription(gd.M0(i7, null));
                            return;
                        }
                        z3Var.a1(true);
                        return;
                }
            }
        });
        this.Z0 = new e8(this, w3Var);
        c3Var.addView(g3Var, ma.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f12884w0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        a2 a2Var = new a2(this, context, f9Var, f9Var.f12001w, view, frameLayout, f9Var);
        this.f12880v0 = a2Var;
        c3Var.addView(view, ma.e(-1, 200, 87));
        c3Var.addView(a2Var, ma.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        c3Var.addView(frameLayout, ma.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int L2 = org.telegram.messenger.g0.L(20.0f);
        int o4 = i0.a.o(-1, 100);
        p2Var.setBackground(org.telegram.ui.ActionBar.n6.k0(L2, L2, L2, L2, 0, o4, o4));
        int L3 = org.telegram.messenger.g0.L(20.0f);
        int o10 = i0.a.o(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.n6.k0(L3, L3, L3, L3, 0, o10, o10));
        int L4 = org.telegram.messenger.g0.L(20.0f);
        int o11 = i0.a.o(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.n6.k0(L4, L4, L4, L4, 0, o11, o11));
        int L5 = org.telegram.messenger.g0.L(20.0f);
        int o12 = i0.a.o(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.n6.k0(L5, L5, L5, L5, 0, o12, o12));
        int L6 = org.telegram.messenger.g0.L(20.0f);
        int o13 = i0.a.o(-1, 100);
        t2Var2.setBackground(org.telegram.ui.ActionBar.n6.k0(L6, L6, L6, L6, 0, o13, o13));
        int L7 = org.telegram.messenger.g0.L(20.0f);
        int o14 = i0.a.o(-1, 100);
        t2Var.setBackground(org.telegram.ui.ActionBar.n6.k0(L7, L7, L7, L7, 0, o14, o14));
        t9 t9Var = g3Var.f12735a0;
        View n10 = t9Var.n(context);
        if (n10 != null) {
            org.telegram.messenger.g0.E2(n10);
            addView(n10);
        }
        t9Var.D = new b2(this, 0);
        t9Var.S(this);
    }

    public static void T0(o6 o6Var, ImageReceiver imageReceiver, String str) {
        if (o6Var.f12335s) {
            imageReceiver.u0(null, null, fc.g(o6Var.f12332f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.r0(fc.g(o6Var.f12331e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void X(z3 z3Var, ValueAnimator valueAnimator) {
        float f10;
        k8 k8Var = z3Var.m0;
        z3Var.O3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        v3 v3Var = z3Var.Y0;
        v3Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * z3Var.O3);
        v3Var.setAlpha(1.0f - z3Var.O3);
        ImageView imageView = z3Var.f12824g0;
        imageView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * z3Var.O3);
        imageView.setAlpha(1.0f - z3Var.O3);
        ImageView imageView2 = z3Var.f12828h0;
        imageView2.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * z3Var.O3);
        imageView2.setAlpha(1.0f - z3Var.O3);
        bi.p2 p2Var = z3Var.f12832i0;
        p2Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * z3Var.O3);
        p2Var.setAlpha((1.0f - z3Var.O3) * z3Var.O2);
        t2 t2Var = z3Var.G1;
        if (t2Var != null) {
            t2Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * z3Var.O3);
            z3Var.G1.setAlpha(1.0f - z3Var.O3);
        }
        if (k8Var != null) {
            k8Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * z3Var.O3);
            k8Var.setAlpha(1.0f - z3Var.O3);
        }
        z3Var.f12876u0.setAlpha(1.0f - z3Var.O3);
        s3 s3Var = z3Var.A1;
        if (s3Var == null) {
            f10 = 0.0f;
        } else {
            f10 = ((w8) s3Var).d.W;
        }
        float hideInterfaceAlpha = z3Var.getHideInterfaceAlpha();
        t2 t2Var2 = z3Var.f12849n0;
        if (t2Var2 != null) {
            t2Var2.setAlpha((1.0f - z3Var.O3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        ImageView imageView3 = z3Var.f12888x0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - z3Var.O3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        t2 t2Var3 = z3Var.f12896z0;
        if (t2Var3 != null) {
            t2Var3.setAlpha((1.0f - z3Var.O3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        i2 i2Var = z3Var.L1;
        if (i2Var != null) {
            i2Var.setAlpha(1.0f - z3Var.O3);
            z3Var.invalidate();
        }
        z3Var.M0.invalidate();
    }

    public static void Y(z3 z3Var, boolean z10) {
        org.telegram.ui.ActionBar.z0 z0Var = z3Var.f12851n3;
        if (z0Var != null && z3Var.f12848m3 != null && z0Var.getVisibility() == 0) {
            if (z10) {
                if (Math.abs(f9.B1 - 0.2f) < 0.05f) {
                    z3Var.f12851n3.setSubtext(gd.M0(2131743337, null));
                } else if (Math.abs(f9.B1 - 0.5f) < 0.05f) {
                    z3Var.f12851n3.setSubtext(gd.M0(2131743339, null));
                } else if (Math.abs(f9.B1 - 1.0f) < 0.05f) {
                    z3Var.f12851n3.setSubtext(gd.M0(2131743340, null));
                } else if (Math.abs(f9.B1 - 1.5f) < 0.05f) {
                    z3Var.f12851n3.setSubtext(gd.M0(2131743341, null));
                } else if (Math.abs(f9.B1 - 2.0f) < 0.05f) {
                    z3Var.f12851n3.setSubtext(gd.M0(2131743338, null));
                } else {
                    org.telegram.ui.ActionBar.z0 z0Var2 = z3Var.f12851n3;
                    z0Var2.setSubtext(gd.a0(null, null, 2131743342, mu0.a(f9.B1) + "x"));
                }
            }
            z3Var.f12848m3.K(z10, f9.B1);
        }
    }

    public static void Z(z3 z3Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (!z3Var.G0() && !z3Var.f12893y1.f12724f) {
            if (j10.i(z3Var.f12847m2).q()) {
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232395, gd.M0(2131744652, null), false, z3Var.f12843l0).setOnClickListener(new t1(z3Var, 8));
                return;
            }
            Drawable drawable = z3Var.getContext().getDrawable(2131232171);
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            c2 c2Var = new c2(z3Var.getContext().getDrawable(2131232383), drawable, 0);
            org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232395, gd.M0(2131744652, null), false, z3Var.f12843l0);
            c10.setOnClickListener(new t1(z3Var, 9));
            c10.setIcon(c2Var);
        }
    }

    public static void b0(z3 z3Var) {
        x3 x3Var = z3Var.f12893y1;
        TL_stories.StoryItem storyItem = x3Var.f12720a;
        if ((storyItem == null && x3Var.f12721b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = x3Var.h();
        boolean z10 = x3Var.f12723e;
        if (h != null && h.exists()) {
            MediaController.d0(h.toString(), z3Var.getContext(), z10 ? 1 : 0, null, null, new ai.u2(2, z3Var, z10));
            return;
        }
        z3Var.Y0();
    }

    public static void c0(z3 z3Var, long j3) {
        String str;
        boolean z10;
        TLRPC.User user;
        if (j3 > 0) {
            TLRPC.User c22 = mp.u1(z3Var.f12847m2).c2(Long.valueOf(j3));
            str = c22.first_name;
            z10 = c22.stories_hidden;
            user = c22;
        } else {
            TLRPC.Chat O0 = mp.u1(z3Var.f12847m2).O0(Long.valueOf(-j3));
            str = O0.title;
            z10 = O0.stories_hidden;
            user = O0;
        }
        org.telegram.messenger.g0.h3(new di.m(z3Var, mp.u1(z3Var.f12847m2), j3, !z10, str, user), 200L);
    }

    public static void d0(z3 z3Var) {
        int i7;
        int i10;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, z3Var.getContext(), z3Var.f12843l0);
        if (z3Var.G0()) {
            i7 = 2131751553;
        } else {
            i7 = 2131751476;
        }
        String M0 = gd.M0(i7, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = M0;
        if (z3Var.G0()) {
            i10 = 2131751554;
        } else {
            i10 = 2131751477;
        }
        u1Var.U = gd.M0(i10, null);
        alertDialog$Builder.k(gd.M0(2131751587, null), new o1(z3Var, 2));
        alertDialog$Builder.h(gd.M0(2131752578, null), new ci.v(27));
        ((w8) z3Var.A1).h(u1Var);
        u1Var.i();
    }

    public static void f0(z3 z3Var) {
        String str;
        gc K;
        org.telegram.ui.ActionBar.i6 i6Var = z3Var.f12843l0;
        c3 c3Var = z3Var.M0;
        if (z3Var.f12861q1) {
            return;
        }
        if (z3Var.f12853o1) {
            if (z3Var.f12875t3 != null && z3Var.f12879u3 != null) {
                ug.l0.x1(new bi.y8(z3Var, 2), z3Var.f12875t3, z3Var.f12879u3, z3Var.l1, true);
                return;
            }
            f9 f9Var = z3Var.f12872t0;
            if (f9Var != null) {
                f9Var.f11978k1 = true;
                f9Var.V();
            }
            mp.u1(z3Var.f12847m2).I0().a(z3Var.l1, new u1(z3Var, 0));
            return;
        }
        i2 i2Var = z3Var.L1;
        int i7 = -z3Var.f12810b1;
        z3Var.f12810b1 = i7;
        org.telegram.messenger.g0.E3(i7, i2Var, null);
        org.telegram.messenger.q2.APP_ERROR.a();
        if (z3Var.l1 >= 0) {
            str = o10.q(mp.u1(z3Var.f12847m2).c2(Long.valueOf(z3Var.l1)));
        } else {
            str = "";
        }
        if (mp.u1(z3Var.f12847m2).K3()) {
            K = new lc(c3Var, i6Var).Q(2131624217, 36, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131743521, str)));
        } else {
            K = new lc(c3Var, i6Var).K(2131624217, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131743521, str)), gd.M0(2131743522, null), new r1(z3Var, 5));
        }
        K.j();
    }

    public org.telegram.messenger.c getAccountInstance() {
        return org.telegram.messenger.c.a(this.f12847m2);
    }

    public float getHideInterfaceAlpha() {
        float f10;
        float f11 = 1.0f - this.f12894y2.f33892c;
        i5 i5Var = this.f12872t0.f12004x;
        if (i5Var == null) {
            f10 = 0.0f;
        } else {
            f10 = i5Var.f12102f;
        }
        return (1.0f - f10) * f11;
    }

    public long getMessageMinPrice() {
        f9 f9Var;
        if (!this.f12893y1.f12724f || (f9Var = this.f12872t0) == null || f9Var.B0 == null || B0(true)) {
            return 0L;
        }
        return f9Var.B0.j();
    }

    public static void h0(z3 z3Var) {
        x3 x3Var = z3Var.f12893y1;
        if (x3Var.f12720a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.f28647id = x3Var.f12720a.f28642id;
        tL_stories_exportStoryLink.peer = mp.u1(z3Var.f12847m2).l1(z3Var.l1);
        ConnectionsManager.getInstance(z3Var.f12847m2).sendRequest(tL_stories_exportStoryLink, new Object());
    }

    public final void A0() {
        if (this.K2 != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        textView.setTextSize(1, 16.0f);
        textView.setText(gd.M0(2131744218, null));
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f12843l0;
        org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
        TextView textView2 = new TextView(getContext());
        ra.a(textView2);
        textView2.setText(gd.M0(2131754228, null));
        int i10 = org.telegram.ui.ActionBar.n6.Ji;
        org.telegram.ui.ActionBar.u6.U(textView2, i10, i6Var);
        textView2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 15.0f);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i11 = org.telegram.ui.ActionBar.n6.Fi;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(i10, i6Var), 30);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w02, o4, o4);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i10, 30);
        textView2.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(textView2, k02, M, g10, i6Var);
        textView2.setOnClickListener(new t1(this, 3));
        linearLayout.addView(textView, ma.o(-1, -2));
        linearLayout.addView(textView2, ma.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, ma.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.M0.addView(frameLayout);
        this.K2 = frameLayout;
    }

    public final boolean B0(boolean z10) {
        c1 c1Var;
        TLRPC.Peer i7;
        c1 c1Var2;
        long e10 = j10.i(this.f12847m2).e();
        int i10 = (this.l1 > 0L ? 1 : (this.l1 == 0L ? 0 : -1));
        f9 f9Var = this.f12872t0;
        if (i10 < 0 && (c1Var2 = f9Var.B0) != null) {
            if (z10) {
                TLRPC.Peer i11 = c1Var2.i();
                TLRPC.Chat O0 = mp.u1(this.f12847m2).O0(Long.valueOf(-this.l1));
                if (f9Var.B0.l() || org.telegram.messenger.v3.w(14, O0)) {
                    if (i11 == null || this.l1 == org.telegram.messenger.n5.o(i11) || org.telegram.messenger.n5.o(i11) == j10.i(this.f12847m2).e()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } else if (i10 >= 0 && f9Var != null && (c1Var = f9Var.B0) != null && c1Var.l()) {
            if (!z10 || (i7 = f9Var.B0.i()) == null || this.l1 == org.telegram.messenger.n5.o(i7) || org.telegram.messenger.n5.o(i7) == e10 || this.l1 == e10) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public final void C0(Canvas canvas, int i7, int i10) {
        TextureView textureView;
        y3 y3Var = this.f12886w2;
        org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) y3Var.f12773e;
        if (j4Var != null && ((SurfaceView) y3Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                org.telegram.messenger.g0.z0((SurfaceView) y3Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else if (j4Var != null && (textureView = (TextureView) y3Var.f12774f) != null) {
            Bitmap bitmap = textureView.getBitmap(i7, i10);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            canvas.save();
            c3 c3Var = this.M0;
            canvas.scale(i7 / c3Var.getMeasuredWidth(), i10 / c3Var.getMeasuredHeight());
            this.O0.h(canvas, null);
            canvas.restore();
        }
    }

    public final void D0(hi.o8 o8Var, TL_stories.StoryItem storyItem) {
        int i7;
        View[] viewPages;
        s3 s3Var = this.A1;
        Context context = getContext();
        if (storyItem.pinned) {
            i7 = Integer.MAX_VALUE;
        } else {
            i7 = storyItem.expire_date - storyItem.date;
        }
        hi.q8 q8Var = new hi.q8(i7, context, this.f12843l0);
        q8Var.X0(o8Var);
        hi.i1 i1Var = q8Var.f15280m1;
        if (i1Var != null) {
            for (View view : i1Var.getViewPages()) {
                if (view instanceof hi.l8) {
                    ((hi.l8) view).f(false);
                }
            }
        }
        q8Var.R0(true);
        q8Var.O1 = new ab.g(15, this, storyItem);
        ((w8) s3Var).h(q8Var);
    }

    public final boolean E0(android.view.ViewGroup r11, float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: fi.z3.E0(android.view.ViewGroup, float, float, boolean):boolean");
    }

    public final boolean F0(View view, MotionEvent motionEvent) {
        float x10 = getX();
        c3 c3Var = this.M0;
        float x11 = view.getX() + c3Var.getX() + x10;
        float y10 = view.getY() + c3Var.getY() + getY();
        if (motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + view.getWidth() && motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + view.getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean G0() {
        h6 h6Var;
        f9 f9Var = this.f12872t0;
        if (f9Var != null && (h6Var = f9Var.O0) != null && h6Var.f12042e == 4) {
            return true;
        }
        return false;
    }

    public final boolean H0() {
        TLRPC.User c22;
        if (!G0() || (c22 = mp.u1(this.f12847m2).c2(Long.valueOf(this.f12872t0.O0.d))) == null || !c22.bot || !c22.bot_can_edit) {
            return false;
        }
        return true;
    }

    public abstract boolean I0();

    public final void J0(ch.p0 p0Var) {
        boolean z10;
        boolean z11;
        int i7;
        TLRPC.Reaction reaction;
        x3 x3Var = this.f12893y1;
        TL_stories.StoryItem storyItem = x3Var.f12720a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        if (reaction2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (reaction2 != null && p0Var == null) {
            j0();
            this.C1.j0(this.l1, x3Var.f12720a, null);
        } else if (p0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(this.f12847m2).f26633r.get("❤");
            if (tL_availableReaction != null) {
                this.Z2 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a10 = ch.l0.a();
                fc b10 = fc.b(document);
                ImageReceiver imageReceiver = this.V2;
                imageReceiver.q0(b10, a10, null, null, null, 0);
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                this.f12809a3 = true;
                this.C1.j0(this.l1, x3Var.f12720a, ch.p0.c(tL_availableReaction));
            }
        } else {
            j0();
            this.C1.j0(this.l1, x3Var.f12720a, p0Var);
        }
        TL_stories.StoryItem storyItem2 = x3Var.f12720a;
        t2 t2Var = this.f12849n0;
        if (storyItem2 != null && (reaction = storyItem2.sent_reaction) != null) {
            z10 = !z10;
            this.f12852o0.setReaction(ch.p0.d(reaction));
            t2Var.setContentDescription(gd.M0(2131754850, null));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z11 = true;
        } else {
            this.f12852o0.setReaction(null);
            t2Var.setContentDescription(gd.M0(2131754851, null));
            z11 = false;
        }
        if (this.n1 && z10) {
            TL_stories.StoryItem storyItem3 = x3Var.f12720a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = x3Var.f12720a.views;
            int i10 = storyViews.reactions_count;
            if (z11) {
                i7 = 1;
            } else {
                i7 = -1;
            }
            int i11 = i10 + i7;
            storyViews.reactions_count = i11;
            if (i11 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = x3Var.f12720a;
        ch.s0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        i1(true);
    }

    public final void K0() {
        c1 c1Var;
        boolean z10;
        if (this.f12895y3 == null) {
            f9 f9Var = this.f12872t0;
            if (f9Var != null && (c1Var = f9Var.B0) != null) {
                TLRPC.GroupCall groupCall = c1Var.f11798w;
                if (groupCall == null) {
                    z10 = false;
                } else {
                    z10 = !groupCall.messages_enabled;
                }
                if (z10) {
                    return;
                }
            }
            TLRPC.TL_channels_sendAsPeers O1 = mp.u1(this.f12847m2).O1(this.l1, true);
            this.f12895y3 = O1;
            i2 i2Var = this.L1;
            if (i2Var != null && O1 != null) {
                i2Var.t2(true);
            }
        }
    }

    public final boolean L0() {
        i2 i2Var = this.L1;
        if (i2Var == null) {
            return false;
        }
        boolean z10 = i2Var.f32645n3;
        if (z10) {
            i2Var.S1();
        }
        org.telegram.messenger.g0.h3(new r1(this, 3), 300L);
        return z10;
    }

    public final void M0() {
        CharSequence charSequence;
        long j3;
        u1 u1Var;
        int i7;
        long j10;
        long j11;
        mp.g1().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.L1.getTextWithEntities();
        long e10 = j10.i(this.f12847m2).e();
        TLRPC.Peer i10 = this.f12872t0.B0.i();
        if (i10 != null) {
            e10 = org.telegram.messenger.n5.o(i10);
        }
        Context context = getContext();
        int i11 = this.f12847m2;
        String s5 = org.telegram.messenger.n5.s(i11, this.l1);
        long messageMinPrice = getMessageMinPrice();
        long j12 = this.f12883v3;
        u1 u1Var2 = new u1(this, 1);
        b bVar = new b();
        org.telegram.ui.ActionBar.x2 x2Var = new org.telegram.ui.ActionBar.x2(1, context, (org.telegram.ui.ActionBar.i6) bVar, false);
        x2Var.O();
        x2Var.f30228w0 = false;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        x2Var.O = g10;
        int[] iArr = mp.u1(i11).f25601a7;
        CharSequence j02 = fj.j0(textWithEntities, false, false, new TextPaint());
        if (j02 instanceof Spannable) {
            Spannable spannable = (Spannable) j02;
            charSequence = j02;
            j3 = j12;
            u1Var = u1Var2;
            i7 = ((org.telegram.ui.Components.x5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.x5.class)).length + ((org.telegram.messenger.g6[]) spannable.getSpans(0, charSequence.length(), org.telegram.messenger.g6.class)).length;
        } else {
            charSequence = j02;
            j3 = j12;
            u1Var = u1Var2;
            i7 = 0;
        }
        if (j3 <= 0) {
            j10 = 100;
        } else {
            j10 = j3;
        }
        int max = (int) Math.max(messageMinPrice, j10);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length >= 0) {
                int i12 = length * 7;
                int i13 = iArr[i12];
                j11 = messageMinPrice;
                int i14 = iArr[i12 + 2];
                if (i7 <= iArr[i12 + 3] && charSequence.length() <= i14) {
                    max = Math.max(max, i13);
                    break;
                } else {
                    length--;
                    messageMinPrice = j11;
                }
            } else {
                j11 = messageMinPrice;
                break;
            }
        }
        long[] jArr = {max};
        hi.d dVar = new hi.d(context, null, true);
        ?? obj = new Object();
        obj.f12485c = e10;
        obj.f12487f = textWithEntities;
        obj.f12488g = jArr[0];
        m0 m0Var = new m0(i11, context, true);
        LinearLayout g11 = org.telegram.messenger.f3.g(context, 0);
        bi.a3 a3Var = new bi.a3(context, gd.M0(2131748622, null), bVar);
        g11.addView(a3Var, ma.q(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        bi.a3 a3Var2 = new bi.a3(context, gd.M0(2131748623, null), bVar);
        g11.addView(a3Var2, ma.q(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        bi.a3 a3Var3 = new bi.a3(context, gd.M0(2131748624, null), bVar);
        g11.addView(a3Var3, ma.q(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        s sVar = new s(context, bVar, r1);
        u1 u1Var3 = u1Var;
        long j13 = j11;
        x10[] x10VarArr = {new r(jArr, dVar, new lq[1], (r0) obj, m0Var, i11, a3Var, a3Var2, a3Var3, sVar, new boolean[]{true})};
        m0Var.set(obj);
        int i15 = 9;
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int i16 = mp.u1(i11).f25611b7;
        ArrayList arrayList = new ArrayList();
        int i17 = 0;
        while (true) {
            if (i17 >= i15) {
                break;
            }
            int[] iArr3 = iArr2;
            if (iArr2[i17] >= j13) {
                if (i17 > 0 && arrayList.isEmpty() && iArr3[i17] > j13) {
                    arrayList.add(Integer.valueOf((int) j13));
                }
                int i18 = iArr3[i17];
                if (i18 > i16) {
                    arrayList.add(Integer.valueOf(i16));
                    break;
                }
                arrayList.add(Integer.valueOf(i18));
                if (iArr3[i17] == i16) {
                    break;
                }
            }
            i17++;
            iArr2 = iArr3;
            i15 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) i5.c.h(1, arrayList)).intValue() < i16) {
            arrayList.add(Integer.valueOf(i16));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            iArr4[i19] = ((Integer) arrayList.get(i19)).intValue();
        }
        sVar.f9115f0 = iArr4;
        sVar.setValue((int) jArr[0]);
        g10.addView(sVar, ma.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        x10VarArr[0].a(Integer.valueOf((int) jArr[0]));
        g10.addView(g11, ma.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i20 = org.telegram.ui.ActionBar.n6.f29502j5;
        TextView b10 = va.b(context, 20.0f, i20, true, bVar);
        org.telegram.messenger.f3.k(b10, 17, null, 2131748619);
        g10.addView(b10, ma.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = va.b(context, 14.0f, i20, false, bVar);
        b11.setGravity(17);
        org.telegram.messenger.f3.q(null, null, 2131748620, new Object[]{s5}, b11);
        g10.addView(b11, ma.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        g10.addView(m0Var, ma.t(-2, -2, 17, 42, 22, 42, 20));
        g10.addView(dVar, ma.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        x2Var.show();
        dVar.setOnClickListener(new ah.h(u1Var3, jArr, x2Var, 9));
    }

    public final void N0() {
        if (this.L1 == null) {
            return;
        }
        r0();
        this.f12870s2.f39670e2.i0();
        this.f12870s2.z1(-1, true);
        n2 n2Var = this.f12870s2;
        n2Var.U1 = this.l1;
        n2Var.f1();
        this.f12870s2.b1().setText(this.L1.getFieldText());
        ((w8) this.A1).h(this.f12870s2);
    }

    public final void O0() {
        Bundle bundle = new Bundle();
        long j3 = this.l1;
        if (j3 < 0) {
            bundle.putLong("chat_id", -j3);
        } else {
            bundle.putLong("user_id", j3);
        }
        TLRPC.Dialog U0 = mp.u1(this.f12847m2).U0(this.l1);
        if (U0 != null) {
            bundle.putInt("message_id", U0.top_message);
        }
        this.f12872t0.N(new bn(bundle));
    }

    public final void P0(long r22) {
        throw new UnsupportedOperationException("Method not decompiled: fi.z3.P0(long):void");
    }

    public final void Q0(android.net.Uri r18) {
        throw new UnsupportedOperationException("Method not decompiled: fi.z3.Q0(android.net.Uri):void");
    }

    public final void R0(long j3, boolean z10) {
        int i7;
        int i10;
        x3 x3Var;
        if (this.f12877u1 != z10) {
            this.f12877u1 = z10;
            ph0 ph0Var = this.f12836j0;
            int i11 = 0;
            if (z10) {
                if (this.f12872t0.f11952a && Build.VERSION.SDK_INT < 33) {
                    f9 f9Var = ((w8) this.A1).d;
                    f9Var.l1 = true;
                    f9Var.V();
                    sa saVar = this.G3;
                    org.telegram.messenger.g0.r(saVar);
                    org.telegram.messenger.g0.h3(saVar, 100L);
                }
                P0(j3);
                e1();
                ph0Var.setAnimation(this.f12829h1.f12695u);
                this.f12877u1 = true;
                this.Y0.f12637a.getImageReceiver().O0(true, true);
                if (this.f12893y1.f12720a != null) {
                    org.telegram.messenger.a8.b("StoryViewer displayed story dialogId=" + this.l1 + " storyId=" + x3Var.f12720a.f28642id + " " + x3.c(x3Var));
                }
            } else {
                n0();
                ph0Var.a();
                this.V0 = null;
                this.f12882v2 = false;
                this.f12894y2.e(true, 0.0f);
                this.M0.invalidate();
                invalidate();
                o0();
                f9 f9Var2 = ((w8) this.A1).d;
                f9Var2.I0 = false;
                f9Var2.V();
            }
            if (this.f12877u1) {
                i7 = 3;
            } else {
                i7 = 2;
            }
            this.O0.h0(i7);
            if (this.f12877u1) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            this.P0.h0(i10);
            if (this.f12877u1) {
                i11 = 2;
            }
            this.Q0.h0(i11);
            if (this.f12846m1 || this.n1) {
                p6 p6Var = this.C1;
                long j10 = this.l1;
                boolean z11 = this.f12877u1;
                a0.h hVar = p6Var.f12392m;
                o9 o9Var = (o9) hVar.f(j10);
                if (o9Var == null) {
                    o9Var = new o9(p6Var.f12382a, j10, p6Var);
                    hVar.k(o9Var, j10);
                }
                o9Var.b(z11);
            }
        }
    }

    public final void S0(int i7, long j3) {
        if (this.l1 != j3) {
            x3 x3Var = this.f12893y1;
            x3Var.f12721b = null;
            x3Var.f12720a = null;
        }
        this.l1 = j3;
        this.f12837j1 = null;
        m0(i7);
        TL_stories.PeerStories peerStories = this.f12872t0.Q0;
        boolean z10 = true;
        if (peerStories != null) {
            this.C1.V(peerStories, true);
            return;
        }
        p6 p6Var = this.C1;
        TL_stories.PeerStories y10 = p6Var.y(j3);
        if (y10 == null) {
            y10 = p6Var.z(j3);
        } else {
            z10 = false;
        }
        p6Var.V(y10, z10);
    }

    public final void U0(long j3, boolean z10, boolean z11) {
        String str;
        if (!z10 && j3 == this.f12887w3 && this.f12891x3 == z11) {
            return;
        }
        this.f12887w3 = j3;
        this.f12891x3 = z11;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        v3 v3Var = this.Y0;
        if (i7 >= 0) {
            if (this.f12846m1 && !z11) {
                v3Var.f12638b.l(gd.M0(2131745446, null), false);
                v3Var.f12638b.i(null);
                return;
            }
            TLRPC.User c22 = mp.u1(this.f12847m2).c2(Long.valueOf(j3));
            if (c22 != null && c22.verified) {
                Drawable mutate = getContext().getDrawable(2131232795).mutate();
                mutate.setAlpha(255);
                mq mqVar = new mq(mutate, null);
                mqVar.f37616x = true;
                int L = org.telegram.messenger.g0.L(16.0f);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                mqVar.h = L;
                mqVar.f37612n = L2;
                v3Var.f12638b.i(mqVar);
            } else {
                v3Var.f12638b.i(null);
            }
            if (c22 != null) {
                v3Var.f12638b.l(org.telegram.messenger.j6.m(org.telegram.messenger.g0.D2(org.telegram.messenger.i5.p(c22)), v3Var.f12638b.getPaint().getFontMetricsInt(), false, null, 0), false);
                return;
            }
            v3Var.f12638b.l(null, false);
            return;
        }
        TLRPC.Chat O0 = mp.u1(this.f12847m2).O0(Long.valueOf(-j3));
        u3 u3Var = v3Var.f12638b;
        u3 u3Var2 = v3Var.f12638b;
        if (O0 == null) {
            str = "";
        } else {
            str = O0.title;
        }
        u3Var.l(org.telegram.messenger.g0.D2(str), false);
        if (O0 != null && O0.verified) {
            Drawable mutate2 = getContext().getDrawable(2131232795).mutate();
            mutate2.setAlpha(255);
            mq mqVar2 = new mq(mutate2, null);
            mqVar2.f37616x = true;
            int L3 = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            mqVar2.h = L3;
            mqVar2.f37612n = L4;
            u3Var2.i(mqVar2);
            return;
        }
        u3Var2.i(null);
    }

    public final void V0(float f10, float f11, e4 e4Var) {
        this.W0 = f10;
        this.f12842k3 = 1.0f / f11;
        if (this.V0 != e4Var) {
            this.V0 = e4Var;
            if (e4Var != null) {
                ImageReceiver imageReceiver = e4Var.f11881a;
                if (imageReceiver.n() != null) {
                    Bitmap copy = imageReceiver.n().copy(Bitmap.Config.ARGB_8888, false);
                    s2 s2Var = this.O0;
                    s2Var.f22628d0 = null;
                    s2Var.f22621a1.setShader(null);
                    s2Var.N0(new BitmapDrawable(copy));
                }
            }
        }
    }

    public final void W0(boolean z10) {
        boolean z11;
        x3 x3Var = this.f12893y1;
        if (x3Var.f12720a != null) {
            f9 f9Var = this.f12872t0;
            if (f9Var.f11966f != null) {
                String e10 = x3Var.e();
                TLRPC.Chat chat = null;
                if (z10) {
                    g2 g2Var = new g2(2, this.f12843l0);
                    if (this.n1) {
                        chat = mp.u1(this.f12847m2).O0(Long.valueOf(-this.l1));
                    }
                    if (mp.u1(this.f12847m2).i5() && ((!this.n1 && !o10.B(this.l1)) || org.telegram.messenger.v3.t0(chat))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    q2 q2Var = new q2(this, f9Var.f11966f.getContext(), e10, e10, z11, g2Var);
                    this.J2 = q2Var;
                    q2Var.f42556e2 = true;
                    TL_stories.StoryItem storyItem = x3Var.f12720a;
                    storyItem.dialogId = this.l1;
                    q2Var.B2 = storyItem;
                    q2Var.f42568o2 = new cb.c(this, 22);
                    ((w8) this.A1).h(q2Var);
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", e10);
                LaunchActivity.H1.startActivityForResult(Intent.createChooser(intent, gd.M0(2131744611, null)), 500);
            }
        }
    }

    public final void X0() {
        c3 c3Var = this.M0;
        org.telegram.ui.ActionBar.i6 i6Var = this.f12843l0;
        org.telegram.messenger.f3.o(null, 2131743596, new lc(c3Var, i6Var), i6Var);
    }

    public final void Y0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f12843l0);
        String M0 = gd.M0(2131689472, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = M0;
        alertDialog$Builder.k(gd.M0(2131747638, null), null);
        u1Var.U = gd.M0(2131747025, null);
        ((w8) this.A1).h(u1Var);
    }

    public final void Z0(boolean z10) {
        if (this.f12815c3 != z10) {
            x3 x3Var = this.f12893y1;
            if (x3Var.f12720a != null) {
                this.f12815c3 = z10;
                if (z10) {
                    this.f12812b3.setVisibility(0);
                }
                this.f12812b3.setStoryItem(x3Var.f12720a);
                f9 f9Var = ((w8) this.A1).d;
                f9Var.f11986p1 = z10;
                f9Var.V();
                float f10 = 0.0f;
                if (z10) {
                    float f11 = this.f12817d3;
                    if (z10) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    this.f12812b3.setTransitionProgress(this.f12817d3);
                    ofFloat.addUpdateListener(new s1(this, 1));
                    ofFloat.addListener(new d2(this, z10, 0));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(lr.f37209g);
                    ofFloat.start();
                    return;
                }
                if (this.f12812b3.getReactionsWindow() != null) {
                    this.f12812b3.getReactionsWindow().e();
                }
                this.f12812b3.animate().alpha(0.0f).setDuration(150L).setListener(new e2(this, 0)).start();
            }
        }
    }

    public final void a1(boolean z10) {
        int i7;
        if (this.f12860q0 == null) {
            hi.m3 m3Var = new hi.m3(getContext(), 1);
            m3Var.o(1.0f, -56.0f);
            this.f12860q0 = m3Var;
            m3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
            this.M0.addView(this.f12860q0, ma.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        hi.m3 m3Var2 = this.f12860q0;
        if (z10) {
            i7 = 2131744372;
        } else {
            i7 = 2131744222;
        }
        m3Var2.v(gd.M0(i7, null));
        this.f12860q0.x();
    }

    public final boolean b1(boolean z10) {
        if (this.f12872t0.R0) {
            z10 = !z10;
        }
        if (z10) {
            if (this.f12873t1 < getStoriesCount() - 1) {
                this.f12873t1++;
                d1(false);
                return true;
            }
        } else {
            int i7 = this.f12873t1;
            if (i7 > 0) {
                this.f12873t1 = i7 - 1;
                d1(false);
                return true;
            }
        }
        return false;
    }

    public final void c1() {
        if (!mp.u1(this.f12847m2).i5()) {
            return;
        }
        File h = this.f12893y1.h();
        if (h != null && h.exists()) {
            q2 q2Var = this.J2;
            if (q2Var != null) {
                q2Var.dismiss();
            }
            org.telegram.messenger.g0.h3(new r1(this, 8), 120L);
            return;
        }
        Y0();
    }

    public final void d1(boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: fi.z3.d1(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        float f10;
        c1 c1Var;
        boolean z10;
        int i11 = ks.f25230y5;
        long j3 = 0;
        f9 f9Var = this.f12872t0;
        boolean z11 = false;
        if (i7 != i11 && (i7 != ks.A5 || f9Var.O0 != objArr[0])) {
            if (i7 == ks.f25163o3) {
                d1(false);
                return;
            } else if (i7 == ks.f25148l4) {
                this.f12876u0.f12737c0.invalidate();
                return;
            } else if (i7 == ks.G5) {
                p0(true);
                return;
            } else if (i7 == ks.f25101d3) {
                j6 o4 = mp.u1(this.f12847m2).R1().o();
                if (o4 != null && o4.a(this.f12847m2, 1) && this.A1 != null) {
                    bi.y8 y8Var = new bi.y8(this, 2);
                    Context W = org.telegram.messenger.g0.W(getContext());
                    if (W == null) {
                        W = LaunchActivity.H1;
                    }
                    ((w8) this.A1).h(new ug.l0(o4.b(), this.f12847m2, W, y8Var, null));
                    return;
                }
                return;
            } else if (i7 == ks.f25142k3) {
                TL_account.RequirementToContact P2 = mp.u1(this.f12847m2).P2(this.l1);
                if (this.l1 >= 0 && !j10.i(this.f12847m2).q() && (P2 instanceof TL_account.requirementToContactPremium)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f12857p1 != z10 || this.f12865r1 != org.telegram.messenger.n5.k(P2)) {
                    this.f12857p1 = z10;
                    this.f12865r1 = org.telegram.messenger.n5.k(P2);
                    d1(false);
                    p0(true);
                    return;
                }
                return;
            } else if (i7 == ks.T) {
                Object obj = objArr[0];
                if ((obj instanceof TLRPC.ChatFull) && this.l1 == (-((TLRPC.ChatFull) obj).f28404id)) {
                    d1(false);
                    return;
                }
                return;
            } else if (i7 == ks.G2) {
                long longValue = ((Long) objArr[0]).longValue();
                if (f9Var != null && (c1Var = f9Var.B0) != null && c1Var.g() == longValue) {
                    d1(false);
                    i2 i2Var = this.L1;
                    if (i2Var != null) {
                        i2Var.P(true);
                        this.L1.t2(true);
                        p0(true);
                    }
                    a2 a2Var = this.f12880v0;
                    if (a2Var != null) {
                        c1 c1Var2 = a2Var.Q;
                        if (c1Var2 != null) {
                            j3 = c1Var2.j();
                        }
                        if (a2Var.I != j3) {
                            a2Var.f12561e.O(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i7 == ks.F && ((Boolean) objArr[2]).booleanValue()) {
                K0();
                return;
            } else {
                return;
            }
        }
        s3 s3Var = this.A1;
        if (s3Var == null || !((w8) s3Var).d.H0) {
            if (this.f12877u1) {
                h1();
                if (this.f12840k1 == 0) {
                    if (!this.f12854o2) {
                        this.f12854o2 = true;
                        ((w8) this.A1).j();
                        return;
                    }
                    return;
                }
                int i12 = this.f12873t1;
                ArrayList arrayList = this.f12821f1;
                int size = arrayList.size();
                ArrayList arrayList2 = this.f12825g1;
                if (i12 >= arrayList2.size() + size) {
                    this.f12873t1 = (arrayList2.size() + arrayList.size()) - 1;
                }
                d1(false);
                if (this.f12846m1 || this.n1) {
                    i1(true);
                }
            }
            TL_stories.PeerStories peerStories = f9Var.Q0;
            if (peerStories != null) {
                this.C1.V(peerStories, true);
            } else {
                long j10 = this.l1;
                if (j10 != 0) {
                    p6 p6Var = this.C1;
                    TL_stories.PeerStories y10 = p6Var.y(j10);
                    if (y10 == null) {
                        y10 = p6Var.z(j10);
                        z11 = true;
                    }
                    p6Var.V(y10, z11);
                }
            }
            org.telegram.ui.ActionBar.z0 z0Var = this.f12813c1;
            if (z0Var != null) {
                ViewPropertyAnimator animate = z0Var.animate();
                if (this.C1.M(this.l1) && this.f12893y1.f12723e && !bz.b()) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                animate.alpha(f10).start();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        de deVar;
        Canvas canvas2;
        org.telegram.ui.Components.m6 m6Var;
        org.telegram.ui.Components.m6 m6Var2;
        j1();
        if (this.n1 && (m6Var2 = this.A0) != null) {
            m6Var2.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(40.0f));
        }
        if (this.n1 && (m6Var = this.B0) != null) {
            m6Var.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.f12820e3;
        LinearLayout linearLayout = this.f12892y0;
        t2 t2Var = this.f12849n0;
        if (z10) {
            float measuredWidth = (t2Var.getMeasuredWidth() / 2.0f) + t2Var.getX() + linearLayout.getX();
            float measuredHeight = (t2Var.getMeasuredHeight() / 2.0f) + t2Var.getY() + linearLayout.getY();
            int L = org.telegram.messenger.g0.L(24.0f);
            float f10 = L / 2.0f;
            float T1 = org.telegram.messenger.g0.T1(this.f12827g3, measuredWidth - f10, lr.f37209g.getInterpolation(this.f12823f3));
            float T12 = org.telegram.messenger.g0.T1(this.f12831h3, measuredHeight - f10, this.f12823f3);
            int W1 = org.telegram.messenger.g0.W1(this.f12823f3, this.f12835i3, L);
            if (this.Z2) {
                org.telegram.ui.Components.o5 o5Var = this.Y2;
                if (o5Var != null) {
                    float f11 = W1;
                    o5Var.setBounds((int) T1, (int) T12, (int) (T1 + f11), (int) (T12 + f11));
                    this.Y2.draw(canvas);
                }
            } else {
                float f12 = W1;
                ImageReceiver imageReceiver = this.X2;
                imageReceiver.y0(T1, T12, f12, f12);
                imageReceiver.h(canvas, null);
            }
        }
        if (this.f12809a3) {
            float measuredWidth2 = (t2Var.getMeasuredWidth() / 2.0f) + t2Var.getX() + linearLayout.getX();
            float measuredHeight2 = (t2Var.getMeasuredHeight() / 2.0f) + t2Var.getY() + linearLayout.getY();
            int L2 = org.telegram.messenger.g0.L(120.0f);
            if (!this.Z2) {
                float f13 = L2;
                float f14 = f13 / 2.0f;
                float f15 = measuredWidth2 - f14;
                float f16 = measuredHeight2 - f14;
                ImageReceiver imageReceiver2 = this.V2;
                imageReceiver2.y0(f15, f16, f13, f13);
                imageReceiver2.h(canvas, null);
                if (imageReceiver2.B() != null && imageReceiver2.B().A()) {
                    this.f12809a3 = false;
                }
            } else {
                ch.d dVar = this.W2;
                if (dVar != null) {
                    float f17 = L2 / 2.0f;
                    dVar.e((int) (measuredWidth2 - f17), (int) (measuredHeight2 - f17), (int) (measuredWidth2 + f17), (int) (measuredHeight2 + f17));
                    this.W2.b(canvas);
                    if (this.W2.c()) {
                        this.W2.d(this);
                        this.W2 = null;
                        this.f12809a3 = false;
                    }
                } else {
                    this.f12809a3 = false;
                }
            }
        }
        i2 i2Var = this.L1;
        if (i2Var != null) {
            de deVar2 = i2Var.f32636m2;
            de deVar3 = i2Var.f32644n2;
            if (i2Var.getAlpha() != 0.0f && (deVar = i2Var.f32584f1) != null && deVar.getParent() != null && i2Var.f32584f1.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(i2Var.f32584f1.getX() + deVar2.getX() + deVar3.getX() + i2Var.getX(), i2Var.f32584f1.getY() + deVar2.getY() + deVar3.getY() + i2Var.getY());
                if (i2Var.getAlpha() != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, i2Var.getMeasuredWidth(), i2Var.getMeasuredHeight(), (int) (i2Var.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                i2Var.f32584f1.draw(canvas2);
                canvas2.restoreToCount(save);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        vi0 vi0Var;
        vi0 vi0Var2;
        ui.f fVar;
        float L;
        float f10;
        if (view == this.N2) {
            canvas.save();
            canvas.clipRect(0.0f, this.N2.getY(), getMeasuredWidth(), this.N2.getY() + this.N2.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        i2 i2Var = this.L1;
        Paint paint = this.X1;
        t2 t2Var = this.f12849n0;
        w3 w3Var = this.f12829h1;
        if (view == i2Var) {
            float f11 = this.f12808a2;
            int i7 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            x3 x3Var = this.f12893y1;
            if (i7 > 0 && !x3Var.f12724f) {
                w3Var.f12686l.setAlpha((int) (f11 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), w3Var.f12686l);
            }
            RectF rectF = w3Var.h;
            RectF rectF2 = w3Var.f12683i;
            RectF rectF3 = w3Var.f12684j;
            rectF.set(this.L1.getX(), this.L1.getY() + this.L1.getAnimatedTop() + org.telegram.messenger.g0.L(1.33f), this.L1.getX() + this.L1.getMeasuredWidth(), this.L1.getY() + this.L1.getMeasuredHeight());
            float L2 = org.telegram.messenger.g0.L(40.0f);
            if (!x3Var.f12724f) {
                if (this.C2) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
                if (this.D2 && this.n1) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
                if (t2Var != null && t2Var.getVisibility() == 0) {
                    L2 = (L2 - org.telegram.messenger.g0.L(40.0f)) + t2Var.getLayoutParams().width;
                }
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(46.0f);
                L2 = org.telegram.messenger.g0.L(46.0f);
                j1 j1Var = this.K1;
                if (j1Var != null && j1Var.getVisibility() == 0) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
            }
            rectF2.set(org.telegram.messenger.g0.L(10.0f) + L, ((this.L1.getY() + this.L1.getMeasuredHeight()) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(38.0f), (getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f)) - L2, (this.L1.getY() + this.L1.getMeasuredHeight()) - org.telegram.messenger.g0.L(5.0f));
            this.L1.setTranslationX((1.0f - this.f12808a2) * L);
            if (this.L1.getMeasuredHeight() > org.telegram.messenger.g0.L(50.0f)) {
                f10 = ((1.0f - this.f12808a2) * (this.L1.getMeasuredHeight() - org.telegram.messenger.g0.L(50.0f))) + 0.0f;
            } else {
                f10 = 0.0f;
            }
            this.L1.getEditField().setTranslationY(com.google.android.gms.internal.vision.e2.z(1.0f, this.f12808a2, -org.telegram.messenger.g0.L(2.0f), f10));
            float L3 = org.telegram.messenger.g0.L(50.0f) / 2.0f;
            org.telegram.messenger.g0.Z1(rectF2, w3Var.h, this.f12808a2, rectF3);
            fh.g gVar = this.V1;
            if (gVar != null) {
                gVar.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                gVar.r(L3);
                gVar.setAlpha((int) ((1.0f - this.O3) * (1.0f - this.f12811b2) * 255.0f * getHideInterfaceAlpha()));
                gVar.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, L3, L3, paint);
            }
            if (this.f12808a2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            }
        } else if (i2Var != null && i2Var.P0(view)) {
            float L4 = org.telegram.messenger.g0.L(30.0f);
            RectF rectF4 = w3Var.f12685k;
            RectF rectF5 = w3Var.f12685k;
            rectF4.set(0.0f, view.getY() + org.telegram.messenger.g0.L(1.0f), getWidth(), org.telegram.messenger.g0.L(20.0f) + getHeight());
            Path path = this.L3;
            path.rewind();
            path.addRoundRect(rectF5, L4, L4, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            fh.g gVar2 = this.W1;
            if (gVar2 != null) {
                gVar2.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                gVar2.s(L4, L4, L4, L4);
                gVar2.setAlpha(255);
                gVar2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF5, L4, L4, paint);
            }
            boolean drawChild3 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild3;
        } else {
            if (view == this.P1 && this.L1 != null) {
                view.setTranslationY(((this.L1.getY() + this.L1.getAnimatedTop()) + (-vi0Var.getMeasuredHeight())) - org.telegram.messenger.g0.L(18.0f));
            } else {
                if (view == this.f12812b3) {
                    view.setTranslationY((this.f12892y0.getY() + (t2Var.getY() + (-(vi0Var2.getMeasuredHeight() - this.f12812b3.getPaddingBottom())))) - org.telegram.messenger.g0.L(18.0f));
                } else {
                    c3 c3Var = this.M0;
                    if (view == c3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (fVar = this.f12867r3) != null && !fVar.f59010r) {
                        RecordingCanvas h = fVar.h(getMeasuredWidth(), getMeasuredHeight());
                        h.drawColor(i0.a.f(0.2f, -16777216, -1));
                        h.translate(c3Var.getX(), c3Var.getY());
                        view.draw(h);
                        fVar.i();
                    }
                }
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e1() {
        throw new UnsupportedOperationException("Method not decompiled: fi.z3.e1():void");
    }

    public final void f1() {
        int i7;
        if (this.f12861q1) {
            TextView textView = this.R1;
            if (textView != null) {
                textView.setText(gd.M0(2131748631, null));
            }
            TextView textView2 = this.S1;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.R1;
        if (textView3 != null) {
            if (this.f12853o1) {
                i7 = 2131744430;
            } else {
                i7 = 2131744258;
            }
            textView3.setText(gd.M0(i7, null));
        }
        TextView textView4 = this.S1;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.S1.setText(gd.M0(2131744257, null));
        }
    }

    public final void g1() {
        TL_stories.PeerStories peerStories;
        int i7;
        ArrayList arrayList = this.f12837j1;
        f9 f9Var = this.f12872t0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.f12825g1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i7 = arrayList2.size();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    long j3 = ((o6) arrayList2.get(i10)).f12328a;
                    if (((int) (j3 ^ (j3 >>> 32))) == f9Var.P0) {
                        this.f12873t1 = i10;
                        return;
                    }
                }
            } else {
                i7 = 0;
            }
            int indexOf = this.f12837j1.indexOf(Integer.valueOf(f9Var.P0));
            if (indexOf < 0 && !this.f12837j1.isEmpty()) {
                if (f9Var.P0 > ((Integer) this.f12837j1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (f9Var.P0 < ((Integer) i5.c.h(1, this.f12837j1)).intValue()) {
                    indexOf = this.f12837j1.size() - 1;
                }
            }
            this.f12873t1 = i7 + indexOf;
        } else {
            int i11 = f9Var.f11965e1.get(this.l1, -1);
            this.f12873t1 = i11;
            if (i11 == -1 && !f9Var.N0 && (peerStories = this.f12818e1) != null && peerStories.max_read_id > 0) {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f12821f1;
                    if (i12 >= arrayList3.size()) {
                        break;
                    } else if (((TL_stories.StoryItem) arrayList3.get(i12)).f28642id > this.f12818e1.max_read_id) {
                        this.f12873t1 = i12;
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        if (this.f12873t1 == -1) {
            this.f12873t1 = 0;
        }
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.f12837j1;
    }

    public long getCurrentPeer() {
        return this.l1;
    }

    public int getListPosition() {
        return this.f12881v1;
    }

    public Bitmap getPlayingBitmap() {
        c3 c3Var = this.M0;
        Bitmap createBitmap = Bitmap.createBitmap(c3Var.getWidth(), c3Var.getHeight(), Bitmap.Config.ARGB_8888);
        C0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.f12873t1;
    }

    public p6 getStoriesController() {
        return mp.u1(this.f12847m2).R1();
    }

    public int getStoriesCount() {
        return Math.max(this.f12850n2, this.f12821f1.size()) + this.f12825g1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f12821f1;
    }

    public final void h1() {
        h6 h6Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f12821f1;
        arrayList.clear();
        f9 f9Var = this.f12872t0;
        if (f9Var.N0) {
            if (!f9Var.S0) {
                arrayList.add(f9Var.T0);
            }
        } else {
            ArrayList arrayList2 = this.f12837j1;
            int i7 = 0;
            ArrayList arrayList3 = this.f12825g1;
            if (arrayList2 != null && (h6Var = f9Var.O0) != null) {
                if (h6Var instanceof z5) {
                    arrayList3.clear();
                    ArrayList F = mp.u1(this.f12847m2).R1().F(this.l1);
                    String str = ((z5) f9Var.O0).E;
                    if (F != null) {
                        for (int i10 = 0; i10 < F.size(); i10++) {
                            o6 o6Var = (o6) F.get(i10);
                            hi.d7 d7Var = o6Var.f12330c;
                            if (d7Var != null && !d7Var.f14401g && TextUtils.equals(d7Var.K0, str)) {
                                arrayList3.add(o6Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.f12837j1;
                int size = arrayList4.size();
                while (i7 < size) {
                    Object obj = arrayList4.get(i7);
                    i7++;
                    fj f10 = f9Var.O0.f(((Integer) obj).intValue());
                    if (f10 != null && (storyItem = f10.f23970l) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (f9Var.O0 != null) {
                while (i7 < f9Var.O0.f12045i.size()) {
                    arrayList.add(((fj) f9Var.O0.f12045i.get(i7)).f23970l);
                    i7++;
                }
            } else {
                TL_stories.PeerStories peerStories = f9Var.Q0;
                if (peerStories != null && org.telegram.messenger.n5.o(peerStories.peer) == this.l1) {
                    this.f12818e1 = f9Var.Q0;
                } else {
                    TL_stories.PeerStories y10 = this.C1.y(this.l1);
                    this.f12818e1 = y10;
                    if (y10 == null) {
                        this.f12818e1 = this.C1.z(this.l1);
                    }
                }
                this.f12850n2 = 0;
                TL_stories.PeerStories peerStories2 = this.f12818e1;
                if (peerStories2 != null) {
                    this.f12850n2 = peerStories2.stories.size();
                    arrayList.addAll(this.f12818e1.stories);
                }
                arrayList3.clear();
                ArrayList F2 = this.C1.F(this.l1);
                if (F2 != null) {
                    arrayList3.addAll(F2);
                }
            }
        }
        this.f12840k1 = getStoriesCount();
    }

    public final void i0(boolean z10) {
        z3 currentPeerView;
        z40 z40Var = this.f12874t2;
        if (z40Var != null) {
            z40Var.f42774f0 = null;
            z40Var.a(false);
        }
        long j3 = this.l1;
        TL_stories.StoryItem storyItem = this.f12893y1.f12720a;
        f9 f9Var = this.f12872t0;
        f9Var.getClass();
        if (j3 != 0 && storyItem != null) {
            f9.E1.remove(j3 + (j3 >> 16) + (storyItem.f28642id << 16));
        }
        this.S2 = true;
        v8 v8Var = f9Var.f11983o0;
        if (v8Var != null && (currentPeerView = v8Var.getCurrentPeerView()) != null) {
            currentPeerView.q0();
        }
        if (z10) {
            gc J = new lc(this.M0, this.f12843l0).J(2131624029, gd.M0(2131748291, null), gd.M0(2131743315, null), 5000, false, new r1(this, 2));
            J.f35469r = false;
            J.k(false);
        }
        mp.u1(this.f12847m2).t0(this.l1, 0, null);
    }

    public final void i1(boolean z10) {
        String M0;
        int i7;
        String M02;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z11;
        int i10;
        boolean z12;
        x3 x3Var = this.f12893y1;
        TL_stories.StoryItem storyItem = x3Var.f12720a;
        if (storyItem == null) {
            storyItem = x3Var.f12722c;
        }
        boolean z13 = this.n1;
        if (z13 || this.f12846m1) {
            if (storyItem != null) {
                f9 f9Var = this.f12872t0;
                t2 t2Var = this.f12849n0;
                if (z13) {
                    if (storyItem.views == null) {
                        storyItem.views = new TL_stories.TL_storyViews();
                    }
                    TL_stories.StoryViews storyViews = storyItem.views;
                    if (storyViews.views_count <= 0) {
                        storyViews.views_count = 1;
                    }
                    org.telegram.ui.Components.m6 m6Var = this.B0;
                    if (m6Var != null && (i10 = storyViews.forwards_count) > 0) {
                        String num = Integer.toString(i10);
                        if (z10 && this.F0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        m6Var.t(num, z12, true);
                        this.F0 = true;
                    } else {
                        this.F0 = false;
                    }
                    int i11 = storyItem.views.reactions_count;
                    if (i11 > 0) {
                        org.telegram.ui.Components.m6 m6Var2 = this.A0;
                        String num2 = Integer.toString(i11);
                        if (z10 && this.E0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        m6Var2.t(num2, z11, true);
                        this.E0 = true;
                    } else {
                        this.E0 = false;
                    }
                    if (!z10) {
                        org.telegram.ui.Components.c6 c6Var = this.C0;
                        if (this.E0) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        c6Var.e(true, f12);
                        org.telegram.ui.Components.c6 c6Var2 = this.D0;
                        if (c6Var2 != null) {
                            if (this.F0) {
                                f13 = 1.0f;
                            } else {
                                f13 = 0.0f;
                            }
                            c6Var2.e(true, f13);
                        }
                    }
                    TLRPC.Chat O0 = mp.u1(this.f12847m2).O0(Long.valueOf(-this.l1));
                    if ((!this.f12853o1 || (!org.telegram.messenger.v3.q(O0) && !org.telegram.messenger.v3.s0(O0))) && storyItem.views.views_count > 0) {
                        TextView textView = this.f12841k2;
                        if (f9Var.O0 == null) {
                            M02 = gd.M0(2131747931, null);
                        } else {
                            M02 = gd.M0(2131747930, null);
                        }
                        textView.setText(M02);
                        this.f12841k2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "d  ");
                        spannableStringBuilder.setSpan(new lq(2131231185, 0), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.o0(storyItem.views.views_count, 0));
                        this.f12841k2.setText(spannableStringBuilder);
                    } else {
                        this.f12841k2.setText("");
                    }
                    ViewGroup.LayoutParams layoutParams = t2Var.getLayoutParams();
                    float L = org.telegram.messenger.g0.L(40.0f);
                    if (this.E0) {
                        f10 = this.A0.d + org.telegram.messenger.g0.L(4.0f);
                    } else {
                        f10 = 0.0f;
                    }
                    layoutParams.width = (int) (L + f10);
                    ((ViewGroup.MarginLayoutParams) this.G1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(40.0f) + t2Var.getLayoutParams().width;
                    t2 t2Var2 = this.f12896z0;
                    if (t2Var2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = t2Var2.getLayoutParams();
                        float L2 = org.telegram.messenger.g0.L(40.0f);
                        if (this.F0) {
                            f11 = org.telegram.messenger.g0.L(4.0f) + this.B0.d;
                        } else {
                            f11 = 0.0f;
                        }
                        layoutParams2.width = (int) (L2 + f11);
                        ((ViewGroup.MarginLayoutParams) this.G1.getLayoutParams()).rightMargin += t2Var2.getLayoutParams().width;
                        t2Var2.requestLayout();
                    }
                    this.G1.requestLayout();
                    t2Var.requestLayout();
                    this.f12844l2.setVisibility(8);
                    this.f12858p2.setVisibility(8);
                    TL_stories.StoryItem storyItem2 = x3Var.f12720a;
                    y2 y2Var = this.T0;
                    if (storyItem2 == null) {
                        y2Var.getClass();
                        return;
                    }
                    for (int i12 = 0; i12 < y2Var.getChildCount(); i12++) {
                        if (y2Var.getChildAt(i12) instanceof m8) {
                            ((m8) y2Var.getChildAt(i12)).c(storyItem2.views, z10);
                        }
                    }
                    return;
                }
                int i13 = 3;
                TL_stories.StoryViews storyViews2 = storyItem.views;
                if (storyViews2 != null && storyViews2.views_count > 0) {
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        if (i14 < storyItem.views.recent_viewers.size()) {
                            TLObject g22 = mp.u1(this.f12847m2).g2(storyItem.views.recent_viewers.get(i14).longValue());
                            if (g22 != null) {
                                this.f12844l2.b(i15, this.f12847m2, g22);
                                i15++;
                            }
                            i7 = i13;
                            if (i15 >= i7) {
                                break;
                            }
                            i14++;
                            i13 = i7;
                        } else {
                            i7 = i13;
                            break;
                        }
                    }
                    for (int i16 = i15; i16 < i7; i16++) {
                        this.f12844l2.b(i16, this.f12847m2, null);
                    }
                    this.f12844l2.a(false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(gd.H(',', "Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        lq lqVar = new lq(2131231981, 0);
                        lqVar.f37202y = -53704;
                        lqVar.f37197n = org.telegram.messenger.g0.L(0.2f);
                        spannableStringBuilder2.setSpan(lqVar, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        lq lqVar2 = new lq(2131231972, 0);
                        lqVar2.f37202y = -14161823;
                        lqVar2.f37197n = org.telegram.messenger.g0.L(0.2f);
                        spannableStringBuilder2.setSpan(lqVar2, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.f12841k2.setText(spannableStringBuilder2);
                    if (i15 == 0) {
                        this.f12844l2.setVisibility(8);
                        this.f12841k2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                    } else {
                        this.f12844l2.setVisibility(0);
                        this.f12841k2.setTranslationX(org.telegram.messenger.g0.L(10.0f) + com.google.android.gms.internal.vision.e2.v(i15, 1, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + org.telegram.messenger.g0.L(13.0f)));
                    }
                    this.f12858p2.setVisibility(0);
                } else {
                    TextView textView2 = this.f12841k2;
                    if (f9Var.O0 == null) {
                        M0 = gd.M0(2131747931, null);
                    } else {
                        M0 = gd.M0(2131747930, null);
                    }
                    textView2.setText(M0);
                    this.f12841k2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                    this.f12844l2.setVisibility(8);
                    this.f12858p2.setVisibility(8);
                }
                t2Var.getLayoutParams().width = org.telegram.messenger.g0.L(40.0f);
                this.f12892y0.requestLayout();
                return;
            }
            this.f12841k2.setText("");
            this.f12858p2.setVisibility(8);
            this.f12844l2.setVisibility(8);
        }
    }

    public final void j0() {
        u6 u6Var = this.f12852o0;
        u6Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new f2(0, u6Var)).setDuration(150L).start();
        int L = org.telegram.messenger.g0.L(8.0f);
        u6 u6Var2 = new u6(getContext(), this.f12829h1);
        this.f12852o0 = u6Var2;
        u6Var2.setPadding(L, L, L, L);
        this.f12852o0.setAlpha(0.0f);
        this.f12852o0.setScaleX(0.8f);
        this.f12852o0.setScaleY(0.8f);
        this.f12852o0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.f12849n0.addView(this.f12852o0, ma.e(40, 40, 3));
        this.f12809a3 = false;
    }

    public final void j1() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z10;
        i2 i2Var;
        float heightWithTopView;
        float f15;
        float f16;
        float f17;
        float L;
        int i7;
        float f18;
        float f19;
        int i10;
        t2 t2Var;
        ImageView imageView;
        g3 g3Var;
        t2 t2Var2;
        boolean z11;
        float f20;
        vi0 vi0Var;
        float f21;
        int i11;
        float f22;
        float f23;
        float f24 = ((w8) this.A1).d.W;
        if (this.f12882v2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.c6 c6Var = this.f12894y2;
        c6Var.e(false, f10);
        int i12 = this.d2;
        if (i12 != 0 && this.f12819e2) {
            f11 = c8.l9.a(this.f12866r2 / i12, 0.0f, 1.0f);
        } else if (this.f12822f2) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        org.telegram.ui.Components.c6 c6Var2 = this.H3;
        float f25 = c6Var2.f33892c;
        org.telegram.ui.Components.c6 c6Var3 = this.I3;
        float f26 = c6Var3.f33892c;
        org.telegram.ui.Components.c6 c6Var4 = this.J3;
        float f27 = c6Var4.f33892c;
        if (this.f12862q2) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        c6Var2.e(false, f12);
        if (!this.S2) {
            i2 i2Var2 = this.L1;
            if (i2Var2 != null && !TextUtils.isEmpty(i2Var2.getFieldText())) {
                f23 = 1.0f;
            } else {
                f23 = 0.0f;
            }
            c6Var3.e(false, f23);
        }
        i2 i2Var3 = this.L1;
        if (i2Var3 != null && i2Var3.f32646n4) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        c6Var4.e(false, f13);
        final i2 i2Var4 = this.L1;
        if (i2Var4 != null) {
            z3 z3Var = i2Var4.f12089s7;
            f14 = 1.0f;
            int backgroundTop = i2Var4.getBackgroundTop();
            int i13 = i2Var4.f12086p7;
            if (i13 != 0 && backgroundTop != i13) {
                int i14 = (i2Var4.H2 + i13) - backgroundTop;
                i2Var4.setAnimatedTop(i14);
                z3Var.F2 = true;
                ValueAnimator valueAnimator = z3Var.O1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    z3Var.O1.cancel();
                }
                View view = i2Var4.f32692u2;
                if (view != null && view.getVisibility() == 0) {
                    i2Var4.f32692u2.setTranslationY(((1.0f - i2Var4.getTopViewEnterProgress()) * i2Var4.f32692u2.getLayoutParams().height) + i2Var4.H2);
                }
                z3Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i14, 0.0f);
                z3Var.O1 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                i2 i2Var5 = i2Var4;
                                i2Var5.getClass();
                                i2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                z3 z3Var2 = i2Var5.f12089s7;
                                z3Var2.F2 = true;
                                z3Var2.invalidate();
                                i2Var5.invalidate();
                                return;
                            default:
                                i2Var4.F0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                z3Var.O1.addListener(new ai.j0(i2Var4, 11));
                z3Var.O1.setDuration(250L);
                z3Var.O1.setInterpolator(pi.k.V);
                z3Var.O1.start();
                i2Var4.f12086p7 = 0;
            }
            if (i2Var4.f32553b4) {
                float scrollY = (i2Var4.f12088r7 - i2Var4.F0.getScrollY()) + (i2Var4.f12087q7 - i2Var4.F0.getMeasuredHeight());
                gf gfVar = i2Var4.F0;
                gfVar.setOffsetY(gfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(i2Var4.F0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                i2 i2Var5 = i2Var4;
                                i2Var5.getClass();
                                i2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                z3 z3Var2 = i2Var5.f12089s7;
                                z3Var2.F2 = true;
                                z3Var2.invalidate();
                                i2Var5.invalidate();
                                return;
                            default:
                                i2Var4.F0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = i2Var4.f12085o7;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                i2Var4.f12085o7 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(pi.k.V);
                ofFloat2.start();
                i2Var4.f32553b4 = false;
                z3Var.j1();
            }
            i2Var4.getMeasuredHeight();
        } else {
            f14 = 1.0f;
        }
        i2 i2Var5 = this.L1;
        if (i2Var5 != null && i2Var5.O0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        boolean z12 = this.f12830h2;
        Paint paint = this.X1;
        if (z12) {
            paint.setColor(i0.a.f(this.f12808a2, -14933463, org.telegram.ui.ActionBar.n6.r1(0.44f, -16777216)));
            float f28 = f14;
            paint.setAlpha((int) ((f28 - this.O3) * org.telegram.messenger.f3.A(f28, this.f12811b2, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(i0.a.o(-16777216, (int) ((f14 - this.O3) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z13 = this.F2;
        f9 f9Var = this.f12872t0;
        if (z13 || this.K3 != f9Var.f11964e0 || c6Var.f33892c != this.A2 || this.f12814c2 != this.f12866r2 || f11 != this.f12808a2 || f24 != this.f12811b2 || f25 != c6Var2.f33892c || z10 || f27 != c6Var4.f33892c || f26 != c6Var3.f33892c) {
            this.F2 = false;
            this.f12814c2 = this.f12866r2;
            int i15 = (c6Var.f33892c > this.A2 ? 1 : (c6Var.f33892c == this.A2 ? 0 : -1));
            c3 c3Var = this.M0;
            if (i15 != 0) {
                c3Var.invalidate();
            }
            if (f24 != 0.0f) {
                c3Var.setLayerType(2, null);
            } else {
                c3Var.setLayerType(0, null);
            }
            this.A2 = c6Var.f33892c;
            this.f12811b2 = f24;
            this.f12808a2 = f11;
            this.K3 = f9Var.f11964e0;
            float height = this.f12866r2 - (getHeight() - c3Var.getBottom());
            if (this.L1 == null) {
                heightWithTopView = 0.0f;
            } else {
                heightWithTopView = i2Var.getHeightWithTopView() * f11;
            }
            float max = Math.max(0.0f, height + heightWithTopView);
            float height2 = this.Y1 - (getHeight() - c3Var.getBottom());
            i2 i2Var6 = this.L1;
            if (i2Var6 == null) {
                f16 = 0.0f;
            } else {
                float heightWithTopView2 = i2Var6.getHeightWithTopView();
                if (this.f12822f2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                f16 = heightWithTopView2 * f15;
            }
            float max2 = Math.max(0.0f, height2 + f16);
            i2 i2Var7 = this.L1;
            if (i2Var7 != null) {
                if (this.N1 != null) {
                    ImageView suggestButton = i2Var7.getSuggestButton();
                    if (suggestButton != null) {
                        this.N1.p(1.0f, -(org.telegram.messenger.g0.L(74.0f) - suggestButton.getTranslationX()));
                    }
                    this.N1.setTranslationY(-((getHeight() - this.L1.getY()) + org.telegram.messenger.g0.L(6.0f)));
                }
                mt editField = this.L1.getEditField();
                pn0 senderSelectView = this.L1.getSenderSelectView();
                if (editField != null) {
                    f17 = 6.0f;
                    f22 = 1.0f;
                    float T1 = org.telegram.messenger.g0.T1(0.88f, 1.0f, f11);
                    editField.setScaleX(T1);
                    editField.setScaleY(T1);
                } else {
                    f17 = 6.0f;
                    f22 = 1.0f;
                }
                if (senderSelectView != null) {
                    float T12 = org.telegram.messenger.g0.T1(0.8f, f22, f11);
                    senderSelectView.setScaleX(T12);
                    senderSelectView.setScaleY(T12);
                    senderSelectView.setTranslationY(org.telegram.messenger.g0.W1(f11, -org.telegram.messenger.g0.L(2.0f), 0));
                }
            } else {
                f17 = 6.0f;
            }
            if (this.f12830h2) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(58.0f) * (1.0f - f11);
            }
            float max3 = Math.max(0.0f, L + max);
            if (!this.f12830h2 && !this.f12822f2) {
                i7 = org.telegram.messenger.g0.L(58.0f);
            } else {
                i7 = 0;
            }
            float max4 = Math.max(0.0f, max2 + i7);
            float L2 = (org.telegram.messenger.g0.L(f17) * f11) + max3;
            a2 a2Var = this.f12880v0;
            di.b1 b1Var = a2Var.f12558c;
            a2Var.L = L2;
            if (Math.abs(a2Var.M - max4) > 0.1f) {
                a2Var.M = max4;
                f18 = 0.8f;
                i10 = 0;
                f19 = 8.0f;
                b1Var.setPadding(org.telegram.messenger.g0.L(8.0f), Math.max(0, ((int) max4) - b1Var.getTop()) + org.telegram.messenger.g0.L(7.5f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.5f));
                if (!b1Var.canScrollVertically(1)) {
                    a2Var.d.h1(0, org.telegram.messenger.g0.L(100.0f));
                }
            } else {
                f18 = 0.8f;
                f19 = 8.0f;
                i10 = 0;
            }
            a2Var.setTranslationY(-a2Var.L);
            a2Var.invalidate();
            hi.r3 r3Var = f9Var.E0;
            if (r3Var != null) {
                r3Var.setKeyboardOffset(max);
            }
            vi0 vi0Var2 = this.P1;
            x3 x3Var = this.f12893y1;
            if (vi0Var2 != null) {
                if (this.f12808a2 > 0.0f && (x3Var == null || !x3Var.f12724f)) {
                    i11 = i10;
                } else {
                    i11 = 8;
                }
                vi0Var2.setVisibility(i11);
            }
            int i16 = i10;
            while (true) {
                int childCount = getChildCount();
                t2Var = this.f12896z0;
                imageView = this.f12888x0;
                g3Var = this.f12876u0;
                t2Var2 = this.f12849n0;
                if (i16 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i16);
                if (childAt.getVisibility() == 0 && childAt != this.G1 && childAt.getTag(2131296591) == null && childAt != g3Var.f12735a0.n(getContext())) {
                    i2 i2Var8 = this.L1;
                    if (i2Var8 != null && childAt == i2Var8.getEmojiView()) {
                        childAt.setTranslationY(this.L1.getEmojiView().getMeasuredHeight() - this.f12866r2);
                    } else if (childAt instanceof j30) {
                        j30 j30Var = (j30) childAt;
                        View view2 = j30Var.f36311c;
                        if (view2 != null) {
                            j30Var.d(view2);
                        }
                    } else if (childAt != this.f12874t2 && childAt != c3Var && childAt != imageView && childAt != this.f12892y0 && childAt != t2Var && childAt != this.G2 && childAt != this.N1 && childAt != t2Var2 && ((vi0Var = this.f12812b3) == null || vi0Var.getReactionsWindow() == null || childAt != this.f12812b3.getReactionsWindow().f5296c)) {
                        float f29 = this.f12808a2;
                        f29 = (childAt == this.H1 || childAt == this.J1 || childAt == this.K1 || childAt == this.I1) ? 0.0f : 0.0f;
                        float f30 = 1.0f - f29;
                        float L3 = (((((-this.f12878u2) * f30) - (org.telegram.messenger.g0.L(7.0f) * f29)) - this.f12866r2) - (org.telegram.messenger.g0.L(f19) * f30)) - (org.telegram.messenger.g0.L(20.0f) * f9Var.f11964e0);
                        if (childAt == this.H1 || childAt == this.J1 || childAt == this.K1 || childAt == this.I1) {
                            L3 += this.f12866r2;
                        }
                        if (this.f12830h2) {
                            f21 = (1.0f - this.f12811b2) * hideInterfaceAlpha;
                        } else {
                            f21 = hideInterfaceAlpha * 1.0f;
                        }
                        if (childAt == this.L2) {
                            L3 = f9Var.f11964e0 * (-org.telegram.messenger.g0.L(20.0f));
                        }
                        if (childAt == this.N2) {
                            L3 -= this.L1.getMeasuredHeight() - this.L1.getAnimatedTop();
                            f21 = this.f12808a2;
                            childAt.invalidate();
                        }
                        if (childAt == this.M1) {
                            L3 -= this.L1.getMeasuredHeight() - this.L1.getAnimatedTop();
                            f21 *= this.f12808a2;
                        }
                        if (childAt == this.P1) {
                            float f31 = (1.0f - c6Var3.f33892c) * (1.0f - f27) * (1.0f - c6Var2.f33892c) * this.f12808a2;
                            float f32 = f21 * f31 * 1.0f;
                            if (childAt.getAlpha() != 0.0f && f32 == 0.0f) {
                                this.P1.n();
                            }
                            childAt.setAlpha(f32);
                            float f33 = (f31 * 0.2f) + f18;
                            childAt.setScaleX(f33);
                            childAt.setScaleY(f33);
                        } else {
                            childAt.setTranslationY(L3);
                            i2 i2Var9 = this.L1;
                            if (i2Var9 == null || childAt != i2Var9.C2) {
                                childAt.setAlpha(f21);
                            }
                        }
                    }
                } else if (childAt == this.G1) {
                    if (this.f12830h2) {
                        childAt.setAlpha((1.0f - this.O3) * (1.0f - this.f12811b2) * hideInterfaceAlpha);
                    } else {
                        childAt.setAlpha((1.0f - this.O3) * hideInterfaceAlpha);
                    }
                    i16++;
                }
                i16++;
            }
            float f34 = 0.0f;
            float f35 = (1.0f - f24) * hideInterfaceAlpha;
            imageView.setAlpha((1.0f - this.O3) * f35);
            t2Var2.setAlpha((1.0f - this.O3) * f35);
            if (t2Var != null) {
                t2Var.setAlpha((1.0f - this.O3) * f35);
            }
            for (int i17 = 0; i17 < c3Var.getChildCount(); i17++) {
                View childAt2 = c3Var.getChildAt(i17);
                if (childAt2 != null && childAt2 != this.f12884w0) {
                    v3 v3Var = this.Y0;
                    bi.p2 p2Var = this.f12832i0;
                    if (childAt2 != v3Var && childAt2 != this.f12824g0 && childAt2 != this.f12828h0 && childAt2 != p2Var && childAt2 != this.G1 && childAt2 != g3Var && childAt2 != this.m0) {
                        childAt2.setAlpha(hideInterfaceAlpha);
                    } else {
                        if (childAt2 == p2Var) {
                            f20 = this.O2;
                        } else {
                            f20 = 1.0f;
                        }
                        if (childAt2 == g3Var) {
                            childAt2.setAlpha((1.0f - this.O3) * f20 * hideInterfaceAlpha);
                        } else {
                            childAt2.setAlpha((1.0f - this.O3) * f20 * hideInterfaceAlpha);
                        }
                    }
                }
            }
            if (this.L1 != null) {
                float L4 = org.telegram.messenger.g0.L(40.0f);
                if (!x3Var.f12724f) {
                    if (this.C2) {
                        L4 += org.telegram.messenger.g0.L(46.0f);
                    }
                    if (this.D2 && this.n1) {
                        L4 += org.telegram.messenger.g0.L(46.0f);
                    }
                    if (t2Var2.getVisibility() == 0) {
                        L4 = (L4 - org.telegram.messenger.g0.L(40.0f)) + t2Var2.getLayoutParams().width;
                    }
                } else {
                    float L5 = org.telegram.messenger.g0.L(46.0f);
                    L4 = org.telegram.messenger.g0.L(46.0f);
                    j1 j1Var = this.K1;
                    if (j1Var != null && j1Var.getVisibility() == 0) {
                        L4 += org.telegram.messenger.g0.L(46.0f);
                    }
                    f34 = L5;
                }
                i2 i2Var10 = this.L1;
                float f36 = -org.telegram.messenger.g0.L(10.0f);
                float f37 = -(org.telegram.messenger.g0.L(10.0f) + L4 + f34);
                float f38 = this.f12808a2;
                if ((this.C2 || this.f12853o1) && !x3Var.f12724f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i2Var10.F1(f36, f37, f38, z11);
                if (this.L1.getEmojiView() != null) {
                    this.L1.getEmojiView().setAlpha(this.f12808a2);
                }
            }
        }
    }

    public final void k0(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.N3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.O3;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.N3 = ofFloat;
        ofFloat.addUpdateListener(new s1(this, 2));
        this.N3.addListener(new d2(this, z10, 1));
        this.N3.setDuration(420L);
        this.N3.setInterpolator(lr.h);
        this.N3.start();
    }

    public final void l0(Runnable runnable) {
        if (mp.u1(this.f12847m2).A2()) {
            org.telegram.ui.b.b(this.f12847m2);
            return;
        }
        int i7 = bz.f23157e0;
        if (i7 > 0 && this.U2) {
            int i10 = i7 - 1;
            bz.f23157e0 = i10;
            bz.T(i10);
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(0, getContext(), this.f12843l0);
            u1Var.setTitle(gd.M0(2131744650, null));
            u1Var.n(gd.M0(2131744651, null));
            String M0 = gd.M0(2131746550, null);
            ba.b bVar = new ba.b(runnable);
            u1Var.m0 = M0;
            u1Var.f30052n0 = bVar;
            String M02 = gd.M0(2131752578, null);
            ci.v vVar = new ci.v(26);
            u1Var.f30053o0 = M02;
            u1Var.f30054p0 = vVar;
            u1Var.show();
            return;
        }
        runnable.run();
    }

    public final void m0(int i7) {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        this.f12854o2 = false;
        this.F2 = true;
        this.f12845l3 = false;
        this.n1 = false;
        this.f12853o1 = false;
        long j3 = this.l1;
        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        v3 v3Var = this.Y0;
        org.telegram.ui.Components.b9 b9Var = this.X0;
        if (i12 >= 0) {
            if (j3 == j10.i(this.f12847m2).e()) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f12846m1 = z14;
            TLRPC.User c22 = mp.u1(this.f12847m2).c2(Long.valueOf(this.l1));
            TL_account.RequirementToContact P2 = mp.u1(this.f12847m2).P2(this.l1);
            if (!j10.i(this.f12847m2).q() && (P2 instanceof TL_account.requirementToContactPremium)) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.f12857p1 = z15;
            this.f12865r1 = org.telegram.messenger.n5.k(P2);
            b9Var.r(c22);
            v3Var.f12637a.getImageReceiver().i0(c22, b9Var, null);
            U0(this.l1, true, false);
        } else {
            this.f12846m1 = false;
            this.n1 = true;
            if (!this.C1.h(j3)) {
                boolean z16 = org.telegram.messenger.s2.f26721a;
            } else {
                this.f12845l3 = true;
            }
            TLRPC.Chat O0 = mp.u1(this.f12847m2).O0(Long.valueOf(-this.l1));
            boolean V = org.telegram.messenger.v3.V(O0);
            this.f12853o1 = !V;
            if (!V && mp.u1(this.f12847m2).P0(-this.l1) == null) {
                tr.a0(this.f12847m2).F0(-this.l1, true, new CountDownLatch(1), false, false, 0);
            }
            if (this.f12853o1 && !org.telegram.messenger.v3.q(O0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f12857p1 = z10;
            this.f12865r1 = mp.u1(this.f12847m2).P1(this.l1);
            b9Var.q(O0);
            v3Var.f12637a.getImageReceiver().i0(O0, b9Var, null);
            U0(this.l1, true, false);
        }
        if (this.f12877u1 && (this.f12846m1 || this.n1)) {
            p6 p6Var = this.C1;
            long j10 = this.l1;
            a0.h hVar = p6Var.f12392m;
            o9 o9Var = (o9) hVar.f(j10);
            if (o9Var == null) {
                o9Var = new o9(p6Var.f12382a, j10, p6Var);
                hVar.k(o9Var, j10);
            }
            o9Var.b(true);
        }
        h1();
        this.f12873t1 = i7;
        if (i7 < 0) {
            this.f12873t1 = 0;
        }
        this.G0 = 0L;
        this.I0 = false;
        this.f12875t3 = null;
        this.f12879u3 = null;
        boolean z17 = this.n1;
        c3 c3Var = this.M0;
        f9 f9Var = this.f12872t0;
        int i13 = 8;
        x3 x3Var = this.f12893y1;
        if (z17) {
            z0();
            if (this.L1 == null && (this.f12853o1 || x3Var.f12724f)) {
                t0();
            }
            if (this.L1 != null) {
                TLRPC.Chat O02 = mp.u1(this.f12847m2).O0(Long.valueOf(-this.l1));
                i2 i2Var = this.L1;
                if (x3Var.f12724f || (!G0() && this.f12853o1 && (org.telegram.messenger.v3.q(O02) || org.telegram.messenger.v3.s0(O02)))) {
                    i13 = 0;
                }
                i2Var.setVisibility(i13);
                i2 i2Var2 = this.L1;
                boolean z18 = x3Var.f12724f;
                B0(true);
                i2Var2.G1(z18);
                i2 i2Var3 = this.L1;
                if (x3Var.f12724f && !B0(true) && (this.f12822f2 || this.L1.X0)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                i2Var3.N1(z13, true);
                mt editField = this.L1.getEditField();
                long j11 = this.l1;
                TL_stories.StoryItem storyItem = x3Var.f12720a;
                f9Var.getClass();
                editField.setText(f9.A(j11, storyItem));
                this.L1.z1(this.f12847m2, this.l1);
                this.L1.n2(O02, null);
            }
            org.telegram.ui.Components.m6 m6Var = this.A0;
            org.telegram.ui.ActionBar.i6 i6Var = this.f12843l0;
            if (m6Var == null) {
                org.telegram.ui.Components.m6 m6Var2 = new org.telegram.ui.Components.m6(false, false, false);
                this.A0 = m6Var2;
                t2 t2Var = this.f12849n0;
                m6Var2.setCallback(t2Var);
                this.A0.u(i6Var.k(org.telegram.ui.ActionBar.n6.G6));
                this.A0.w(org.telegram.messenger.g0.L(14.0f));
                this.C0 = new org.telegram.ui.Components.c6(t2Var);
            }
            t2 t2Var2 = this.f12896z0;
            if (t2Var2 != null && this.B0 == null) {
                org.telegram.ui.Components.m6 m6Var3 = new org.telegram.ui.Components.m6(false, false, false);
                this.B0 = m6Var3;
                m6Var3.setCallback(t2Var2);
                this.B0.u(i6Var.k(org.telegram.ui.ActionBar.n6.G6));
                this.B0.w(org.telegram.messenger.g0.L(14.0f));
                this.D0 = new org.telegram.ui.Components.c6(t2Var2);
            }
            if (i7 == -1) {
                g1();
            }
            d1(false);
            this.f12840k1 = getStoriesCount();
            c3Var.invalidate();
            invalidate();
        } else if (this.f12846m1) {
            z0();
            if (x3Var.f12724f) {
                this.G1.setVisibility(8);
                if (this.L1 == null) {
                    t0();
                }
                this.L1.setVisibility(0);
            } else {
                this.G1.setVisibility(0);
                i2 i2Var4 = this.L1;
                if (i2Var4 != null) {
                    i2Var4.setVisibility(8);
                }
            }
            i2 i2Var5 = this.L1;
            if (i2Var5 != null) {
                boolean z19 = x3Var.f12724f;
                B0(true);
                i2Var5.G1(z19);
                i2 i2Var6 = this.L1;
                if (x3Var.f12724f && !B0(true) && (this.f12822f2 || this.L1.X0)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i2Var6.N1(z12, true);
            }
            if (i7 == -1) {
                ArrayList arrayList = this.f12837j1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(f9Var.P0));
                    if (indexOf < 0 && !this.f12837j1.isEmpty()) {
                        if (f9Var.P0 > ((Integer) this.f12837j1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (f9Var.P0 < ((Integer) i5.c.h(1, this.f12837j1)).intValue()) {
                            indexOf = this.f12837j1.size() - 1;
                        }
                    }
                    this.f12873t1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.f12825g1.isEmpty();
                    ArrayList arrayList2 = this.f12821f1;
                    if (!isEmpty) {
                        this.f12873t1 = arrayList2.size();
                    } else {
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i14)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i14)).f28642id > this.C1.f12386f.get(this.l1)) {
                                this.f12873t1 = i14;
                                break;
                            }
                        }
                    }
                }
            }
            d1(false);
            c3Var.invalidate();
            invalidate();
        } else {
            if (this.L1 == null) {
                t0();
            }
            if (this.f12857p1 && this.Q1 == null) {
                x0();
            }
            if (this.Q1 != null) {
                if (this.f12857p1 || this.f12861q1) {
                    f1();
                }
                LinearLayout linearLayout = this.Q1;
                if ((this.f12857p1 && !x3Var.f12724f) || this.f12861q1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                linearLayout.setVisibility(i11);
            }
            d8 d8Var = this.T1;
            if (d8Var != null) {
                d8Var.setVisibility(8);
            }
            if (i7 == -1) {
                g1();
            }
            d1(false);
            i2 i2Var7 = this.L1;
            if (i2Var7 != null) {
                if (!G0() && !o10.B(this.l1)) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                i2Var7.setVisibility(i10);
                i2 i2Var8 = this.L1;
                boolean z20 = x3Var.f12724f;
                B0(true);
                i2Var8.G1(z20);
                i2 i2Var9 = this.L1;
                if (x3Var.f12724f && !B0(true) && (this.f12822f2 || this.L1.X0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i2Var9.N1(z11, true);
                mt editField2 = this.L1.getEditField();
                long j12 = this.l1;
                TL_stories.StoryItem storyItem2 = x3Var.f12720a;
                f9Var.getClass();
                editField2.setText(f9.A(j12, storyItem2));
                this.L1.z1(this.f12847m2, this.l1);
                TLRPC.UserFull d2 = mp.u1(this.f12847m2).d2(this.l1);
                if (d2 != null) {
                    this.L1.n2(null, d2);
                } else {
                    mp.u1(this.f12847m2).c3(mp.u1(this.f12847m2).c2(Long.valueOf(this.l1)), this.f12838j2, false, null);
                }
            }
            this.f12840k1 = getStoriesCount();
            t2 t2Var3 = this.G1;
            if (t2Var3 != null) {
                t2Var3.setVisibility(8);
            }
            c3Var.invalidate();
            invalidate();
        }
        p0(false);
    }

    public final void n0() {
        g3 g3Var = this.f12876u0;
        if (g3Var.f12735a0.x()) {
            g3Var.f12735a0.f(false);
        }
    }

    public final void o0() {
        if (this.f12877u1) {
            ((w8) this.A1).d.V();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K0 = true;
        this.O0.P();
        this.Q0.P();
        this.P0.P();
        this.V2.P();
        this.X2.P();
        i2 i2Var = this.L1;
        if (i2Var != null) {
            i2Var.b1();
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.R0;
            if (i7 < arrayList.size()) {
                ((ch.g0) arrayList.get(i7)).b(true);
                i7++;
            } else {
                ks.f(this.f12847m2).c(this, ks.T);
                ks.f(this.f12847m2).c(this, ks.G2);
                ks.f(this.f12847m2).c(this, ks.f25230y5);
                ks.f(this.f12847m2).c(this, ks.f25163o3);
                ks.f(this.f12847m2).c(this, ks.A5);
                ks.f(this.f12847m2).c(this, ks.G5);
                ks.f(this.f12847m2).c(this, ks.f25101d3);
                ks.f(this.f12847m2).c(this, ks.f25142k3);
                ks.f(this.f12847m2).c(this, ks.F);
                ks.e().c(this, ks.f25148l4);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K0 = false;
        this.O0.R();
        this.Q0.R();
        this.P0.R();
        this.V2.R();
        this.X2.R();
        i2 i2Var = this.L1;
        if (i2Var != null) {
            i2Var.a1();
        }
        org.telegram.ui.Components.o5 o5Var = this.Y2;
        if (o5Var != null) {
            o5Var.n(this);
            this.Y2 = null;
        }
        ch.d dVar = this.W2;
        if (dVar != null) {
            dVar.d(this);
            this.W2 = null;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.R0;
            if (i7 < arrayList.size()) {
                ((ch.g0) arrayList.get(i7)).b(false);
                i7++;
            } else {
                ks.f(this.f12847m2).n(this, ks.T);
                ks.f(this.f12847m2).n(this, ks.G2);
                ks.f(this.f12847m2).n(this, ks.f25230y5);
                ks.f(this.f12847m2).n(this, ks.f25163o3);
                ks.f(this.f12847m2).n(this, ks.A5);
                ks.f(this.f12847m2).n(this, ks.G5);
                ks.f(this.f12847m2).n(this, ks.f25101d3);
                ks.f(this.f12847m2).n(this, ks.f25142k3);
                ks.f(this.f12847m2).n(this, ks.F);
                ks.e().n(this, ks.f25148l4);
                return;
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f12829h1.d.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(72.0f));
    }

    @Override
    public final void onMeasure(int r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: fi.z3.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.f12808a2 = -1.0f;
        this.F2 = true;
        invalidate();
    }

    public final void p0(boolean z10) {
        int i7;
        if (this.L1 != null && this.P2 && this.K0) {
            r1 r1Var = this.f12899z3;
            org.telegram.messenger.g0.r(r1Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.C1.B;
            this.L1.P(true);
            boolean z11 = this.f12857p1;
            x3 x3Var = this.f12893y1;
            if ((z11 && !x3Var.f12724f) || this.f12861q1) {
                this.U2 = false;
                this.L1.setEnabled(false);
                this.L1.I1(" ", z10);
            } else if (this.f12865r1 > 0) {
                this.U2 = false;
                this.L1.setEnabled(true);
                this.L1.I1(pb.T0(gd.a0(null, null, 2131743689, gd.E(this.f12865r1, ','))), z10);
            } else {
                if (!x3Var.f12724f && tL_storiesStealthMode != null) {
                    int currentTime = ConnectionsManager.getInstance(this.f12847m2).getCurrentTime();
                    int i10 = tL_storiesStealthMode.active_until_date;
                    if (currentTime < i10) {
                        this.U2 = true;
                        int currentTime2 = i10 - ConnectionsManager.getInstance(this.f12847m2).getCurrentTime();
                        int i11 = currentTime2 / 60;
                        int i12 = currentTime2 % 60;
                        Locale locale = Locale.US;
                        String a02 = gd.a0(null, null, 2131744653, String.format(locale, "%02d:%02d", 99, 99));
                        this.L1.setEnabled(true);
                        if (((int) this.L1.getEditField().getPaint().measureText(a02)) * 1.2f >= this.L1.getEditField().getMeasuredWidth()) {
                            i2 i2Var = this.L1;
                            String a03 = gd.a0(null, null, 2131744653, "");
                            String format = String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
                            i2Var.f32573e = a03;
                            i2Var.f32582f = format;
                            i2Var.j2(z10);
                        } else {
                            this.L1.I1(gd.a0(null, null, 2131744654, String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12))), z10);
                        }
                        org.telegram.messenger.g0.h3(r1Var, 1000L);
                        return;
                    }
                }
                this.U2 = false;
                this.L1.setEnabled(true);
                if (x3Var.f12724f) {
                    long starsPrice = this.L1.getStarsPrice();
                    if (starsPrice > 0) {
                        this.L1.I1(pb.Z0(false, gd.a0(null, null, 2131751993, gd.E((int) starsPrice, ',')), this.L1.J6), z10);
                        lq lqVar = this.L1.J6[0];
                        if (lqVar != null) {
                            lqVar.H = 0.9f;
                            return;
                        }
                        return;
                    }
                    this.L1.I1(gd.M0(2131751994, null), z10);
                    return;
                }
                i2 i2Var2 = this.L1;
                if (this.f12853o1) {
                    i7 = 2131746055;
                } else {
                    i7 = 2131746060;
                }
                i2Var2.I1(gd.M0(i7, null), z10);
            }
        }
    }

    public final boolean q0() {
        if (this.f12815c3) {
            if (this.f12812b3.getReactionsWindow() != null) {
                if (this.f12834i2 > 0) {
                    org.telegram.messenger.g0.v1(this.f12812b3.getReactionsWindow().f5296c);
                    return true;
                }
                this.f12812b3.getReactionsWindow().d();
                return true;
            }
            Z0(false);
            return true;
        }
        y2 y2Var = this.T0;
        if (y2Var != null) {
            hi.m3 m3Var = y2Var.f12161c;
            if (m3Var != null) {
                m3Var.f(true);
                y2Var.f12161c = null;
            }
            y2Var.f12160b = null;
            y2Var.invalidate();
            y2Var.b(false);
        }
        g3 g3Var = this.f12876u0;
        if (g3Var.f12735a0.x()) {
            g3Var.f12735a0.f(false);
            return true;
        }
        hi.m3 m3Var2 = this.f12856p0;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
        hi.m3 m3Var3 = this.f12860q0;
        if (m3Var3 != null) {
            m3Var3.f(true);
        }
        j30 j30Var = this.G2;
        if (j30Var != null) {
            j30Var.a();
        }
        r3 r3Var = this.f12816d1;
        if (r3Var != null && r3Var.f18055a) {
            r3Var.a();
            return true;
        }
        i2 i2Var = this.L1;
        if (i2Var != null && i2Var.Q0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f12843l0);
            boolean z10 = this.L1.f32567d1;
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            if (z10) {
                u1Var.S = gd.M0(2131751384, null);
                u1Var.U = gd.M0(2131751385, null);
            } else {
                u1Var.S = gd.M0(2131751381, null);
                u1Var.U = gd.M0(2131751382, null);
            }
            alertDialog$Builder.k(gd.M0(2131751383, null), new o1(this, 0));
            alertDialog$Builder.h(gd.M0(2131751760, null), null);
            ((w8) this.A1).h(u1Var);
            return true;
        }
        vi0 vi0Var = this.P1;
        if (vi0Var != null && vi0Var.getReactionsWindow() != null && !this.P1.getReactionsWindow().f5308q) {
            this.P1.getReactionsWindow().d();
            return true;
        }
        i2 i2Var2 = this.L1;
        if (i2Var2 != null && i2Var2.O0()) {
            if (this.f12834i2 > 0) {
                org.telegram.messenger.g0.v1(this.L1.getEmojiView());
                return true;
            }
            this.L1.H0(true, false, true);
            return true;
        } else if (getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f)) {
            i2 i2Var3 = this.L1;
            if (i2Var3 != null) {
                long j3 = this.l1;
                TL_stories.StoryItem storyItem = this.f12893y1.f12720a;
                Editable editText = i2Var3.getEditText();
                this.f12872t0.getClass();
                f9.P(j3, storyItem, editText);
            }
            org.telegram.messenger.g0.v1(this.L1);
            return true;
        } else if (g3Var.getVisibility() != 0 || g3Var.getProgressToBlackout() <= 0.0f) {
            return false;
        } else {
            g3Var.D();
            this.Q2 = false;
            this.M0.invalidate();
            return true;
        }
    }

    public final void r0() {
        if (this.f12870s2 == null) {
            n2 n2Var = new n2(this, getContext(), this.f12843l0);
            this.f12870s2 = n2Var;
            n2Var.X3 = new o2(this);
            n2Var.f39670e2.i0();
            n2 n2Var2 = this.f12870s2;
            n2Var2.R1 = true;
            n2Var2.f1();
            n2 n2Var3 = this.f12870s2;
            n2Var3.S1 = new p2(this);
            n2Var3.b1().setText(this.L1.getFieldText());
        }
    }

    public final void s0() {
        if (this.H1 == null && getContext() != null) {
            a aVar = new a(getContext(), this.f12871s3);
            this.H1 = aVar;
            aVar.setOnClickListener(new t1(this, 1));
            addView(this.H1, ma.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public void setAccount(int i7) {
        this.f12847m2 = i7;
        this.C1 = mp.u1(i7).f25668i0;
        this.U0.f50326b = i7;
        vi0 vi0Var = this.P1;
        if (vi0Var != null) {
            vi0Var.setCurrentAccount(i7);
            this.P1.p(null, null, true);
        }
        vi0 vi0Var2 = this.f12812b3;
        if (vi0Var2 != null) {
            vi0Var2.setCurrentAccount(i7);
        }
    }

    public void setActive(boolean z10) {
        R0(0L, z10);
    }

    public void setDelegate(s3 s3Var) {
        this.A1 = s3Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.P2 != z10) {
            this.P2 = z10;
            if (z10) {
                this.O0.f22641i1 = 1.0f;
                p0(false);
            }
        }
    }

    public void setLongpressed(boolean z10) {
        if (this.f12877u1) {
            this.f12882v2 = z10;
            invalidate();
        }
    }

    public void setOffset(float f10) {
        boolean z10;
        if (f10 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.L0 != z10) {
            this.L0 = z10;
            this.M0.invalidate();
            if (this.f12877u1 && this.f12872t0.f11952a && Build.VERSION.SDK_INT < 33) {
                sa saVar = this.G3;
                if (z10) {
                    org.telegram.messenger.g0.r(saVar);
                    org.telegram.messenger.g0.h3(saVar, 250L);
                    return;
                }
                org.telegram.messenger.g0.r(saVar);
                f9 f9Var = ((w8) this.A1).d;
                f9Var.l1 = true;
                f9Var.V();
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.B1 != z10) {
            this.B1 = z10;
            s2 s2Var = this.O0;
            if (z10) {
                s2Var.Q0();
                s2Var.f22664u0 = false;
            } else {
                s2Var.P0(false);
                s2Var.f22664u0 = true;
            }
            this.H0 = 0L;
            this.M0.invalidate();
        }
    }

    public final void t0() {
        org.telegram.ui.ActionBar.i6 i6Var = this.f12843l0;
        i2 i2Var = new i2(this, org.telegram.messenger.g0.W(getContext()), this, new g2(1, i6Var));
        this.L1 = i2Var;
        mt editField = i2Var.getEditField();
        editField.getClass();
        et etVar = new et(editField, 0);
        editField.f32940u0 = etVar;
        etVar.q(true);
        editField.f32940u0.u(editField.f32948y0);
        editField.f32940u0.w(editField.getPaint().getTextSize());
        et etVar2 = new et(editField, 1);
        editField.f32942v0 = etVar2;
        etVar2.f37377b = 5;
        etVar2.u(editField.f32948y0);
        editField.f32942v0.w(editField.getPaint().getTextSize());
        this.L1.getEditField().setScaleX(0.0f);
        this.L1.setOverrideKeyboardAnimation(true);
        this.L1.setClipChildren(false);
        this.L1.setDelegate(new j2(this));
        setDelegate(this.L1);
        i2 i2Var2 = this.L1;
        i2Var2.W5 = false;
        i2Var2.X5 = true;
        if (this.f12893y1.f12724f) {
            i2Var2.t1(false, false, false);
        } else {
            i2Var2.t1(true, true, false);
        }
        this.L1.updateColors();
        i2 i2Var3 = this.L1;
        i2Var3.Y5 = true;
        addView(i2Var3, ma.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.f12895y3 != null) {
            this.L1.t2(false);
        }
        this.L1.f32693u3 = this.f12838j2;
        y3 y3Var = this.f12886w2;
        ((ArrayList) y3Var.f12775g).add(this.M0);
        ((ArrayList) y3Var.f12775g).add(this);
        if (this.K0) {
            this.L1.b1();
        }
        p0(false);
        if (G0()) {
            this.L1.setVisibility(8);
        }
        lh.h hVar = new lh.h(getContext(), i6Var, this.f12871s3, this.f12859p3);
        this.M1 = hVar;
        hVar.setOnClickListener(new o1(this, 1));
        addView(this.M1, ma.e(57, 300, 85));
        this.M1.setVisibility(8);
        this.L1.setSideButtonsForAttach(this.M1);
        this.f12868s0 = getChildCount();
    }

    public final void u0() {
        if (this.T1 != null) {
            return;
        }
        d8 d8Var = new d8(getContext(), this.f12843l0);
        this.T1 = d8Var;
        d8Var.setOnClickListener(new t1(this, 4));
        this.T1.setAlpha(0.0f);
        this.T1.setVisibility(8);
        addView(this.T1, ma.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void v0() {
        boolean z10;
        if (this.K1 == null && getContext() != null) {
            j1 j1Var = new j1(getContext(), this.f12871s3);
            this.K1 = j1Var;
            j1Var.setOnClickListener(new t1(this, 5));
            j1 j1Var2 = this.K1;
            c1 c1Var = c1.X;
            boolean z11 = true;
            if (c1Var != null && c1Var.o()) {
                z10 = true;
            } else {
                z10 = false;
            }
            j1Var2.b(z10, false);
            j1 j1Var3 = this.K1;
            c1 c1Var2 = c1.X;
            if (c1Var2 != null && !c1Var2.m()) {
                z11 = false;
            }
            j1Var3.a(z11, false);
            addView(this.K1, ma.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void w0() {
        if (this.J1 == null && getContext() != null) {
            this.I1 = new m1(getContext(), this.f12847m2);
            n1 n1Var = new n1(getContext(), this.I1, this.f12871s3);
            this.J1 = n1Var;
            n1Var.setOnClickListener(new t1(this, 6));
            this.J1.setOnLongClickListener(new q1(this, 1));
            addView(this.J1, ma.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
            addView(this.I1, ma.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void x0() {
        int i7;
        if (this.Q1 != null) {
            return;
        }
        if (this.L1 == null) {
            t0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.Q1 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(2131231977);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.R1 = textView;
        textView.setTextColor(-8026747);
        this.R1.setTextSize(1, 16.0f);
        TextView textView2 = this.R1;
        if (this.f12853o1) {
            i7 = 2131744430;
        } else {
            i7 = 2131744258;
        }
        textView2.setText(gd.M0(i7, null));
        TextView textView3 = new TextView(getContext());
        this.S1 = textView3;
        textView3.setTextColor(-1);
        this.S1.setTextSize(1, 12.0f);
        TextView textView4 = this.S1;
        int L = org.telegram.messenger.g0.L(40.0f);
        textView4.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 452984831, 855638015, 855638015));
        this.S1.setGravity(17);
        ra.a(this.S1);
        this.S1.setText(gd.M0(2131744257, null));
        this.S1.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        this.Q1.addView(imageView, ma.t(22, 22, 16, 12, 1, 4, 0));
        this.Q1.addView(this.R1, ma.s(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.Q1.addView(this.S1, ma.s(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.L1.addView(this.Q1, ma.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    public final void y0() {
        if (this.L2 != null) {
            return;
        }
        xb xbVar = new xb(getContext(), 1);
        this.L2 = xbVar;
        xbVar.setTextSize(1, 14.0f);
        this.L2.setTextColor(i0.a.f(0.5f, -16777216, -1));
        this.L2.setGravity(19);
        this.L2.setText(gd.M0(2131744256, null));
        addView(this.L2, ma.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void z0() {
        if (this.G1 != null) {
            return;
        }
        t2 t2Var = new t2(this, getContext(), 0);
        this.G1 = t2Var;
        t2Var.setClickable(true);
        addView(this.G1, ma.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        u2 u2Var = new u2(this, getContext());
        this.f12858p2 = u2Var;
        u2Var.setOnClickListener(new t1(this, 0));
        this.G1.addView(this.f12858p2, ma.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        u uVar = new u(0, getContext(), false);
        this.f12844l2 = uVar;
        uVar.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        this.G1.addView(this.f12844l2, ma.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f12841k2 = textView;
        textView.setTextSize(1, 14.0f);
        this.f12841k2.setTextColor(-1);
        this.G1.addView(this.f12841k2, ma.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.f12829h1.f12693s);
        u2 u2Var2 = this.f12858p2;
        int L = org.telegram.messenger.g0.L(15.0f);
        int o4 = i0.a.o(-1, 120);
        u2Var2.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 0, o4, o4));
        imageView.setBackground(org.telegram.ui.ActionBar.n6.O(i0.a.o(-1, 120), -org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f)));
    }
}
