package di;

import a8.ra;
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
import bi.dd;
import bi.md;
import c8.ha;
import c8.ka;
import c8.qa;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.c20;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.td;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.we;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.y20;
import org.telegram.ui.Components.ys;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;
import org.telegram.ui.ir0;
import org.telegram.ui.lx;
public abstract class j4 extends st0 implements ls {
    public org.telegram.ui.Components.h6 A0;
    public boolean A1;
    public long A2;
    public final w1 A3;
    public org.telegram.ui.Components.v5 B0;
    public z6 B1;
    public boolean B2;
    public final ArrayList B3;
    public org.telegram.ui.Components.v5 C0;
    public boolean C1;
    public boolean C2;
    public final ArrayList C3;
    public boolean D0;
    public boolean D1;
    public boolean D2;
    public boolean D3;
    public boolean E0;
    public boolean E1;
    public boolean E2;
    public boolean E3;
    public long F0;
    public a3 F1;
    public y20 F2;
    public final ra F3;
    public long G0;
    public a G1;
    public final ir0 G2;
    public final org.telegram.ui.Components.v5 G3;
    public boolean H0;
    public q1 H1;
    public boolean H2;
    public final org.telegram.ui.Components.v5 H3;
    public boolean I0;
    public r1 I1;
    public x2 I2;
    public final org.telegram.ui.Components.v5 I3;
    public boolean J0;
    public n1 J1;
    public FrameLayout J2;
    public float J3;
    public boolean K0;
    public o2 K1;
    public md K2;
    public final Path K3;
    public final j3 L0;
    public lh.h L1;
    public boolean L2;
    public boolean L3;
    public final FrameLayout M0;
    public fi.m3 M1;
    public q2 M2;
    public ValueAnimator M3;
    public final z2 N0;
    public ValueAnimator N1;
    public float N2;
    public float N3;
    public final ImageReceiver O0;
    public ii0 O1;
    public boolean O2;
    public final ImageReceiver P0;
    public LinearLayout P1;
    public boolean P2;
    public final ArrayList Q0;
    public TextView Q1;
    public boolean Q2;
    public Runnable R0;
    public TextView R1;
    public boolean R2;
    public final f3 S0;
    public o8 S1;
    public boolean S2;
    public final lx T0;
    public ViewPropertyAnimator T1;
    public boolean T2;
    public o4 U0;
    public final fh.g U1;
    public final ImageReceiver U2;
    public float V0;
    public final fh.g V1;
    public ch.d V2;
    public final org.telegram.ui.Components.v8 W0;
    public final Paint W1;
    public final ImageReceiver W2;
    public final f4 X0;
    public int X1;
    public org.telegram.ui.Components.h5 X2;
    public final p8 Y0;
    public ValueAnimator Y1;
    public boolean Y2;
    public m6.n Z0;
    public float Z1;
    public boolean Z2;
    public int f9167a1;
    public float f9168a2;
    public ii0 f9169a3;
    public org.telegram.ui.ActionBar.z0 f9170b1;
    public float f9171b2;
    public boolean f9172b3;
    public a4 f9173c1;
    public int f9174c2;
    public float f9175c3;
    public TL_stories.PeerStories f9176d1;
    public boolean d2;
    public boolean f9177d3;
    public final ArrayList f9178e1;
    public boolean f9179e2;
    public float f9180e3;
    public final ImageView f9181f0;
    public final ArrayList f9182f1;
    public boolean f9183f2;
    public int f9184f3;
    public final ImageView f9185g0;
    public final g4 f9186g1;
    public boolean f9187g2;
    public int f9188g3;
    public final b4 f9189h0;
    public final bg.r0 f9190h1;
    public int f9191h2;
    public int f9192h3;
    public final ch0 f9193i0;
    public ArrayList f9194i1;
    public final int f9195i2;
    public w1 f9196i3;
    public final ImageView f9197j0;
    public int f9198j1;
    public TextView f9199j2;
    public float j3;
    public final org.telegram.ui.ActionBar.h6 f9200k0;
    public long f9201k1;
    public u f9202k2;
    public boolean f9203k3;
    public final v8 f9204l0;
    public boolean l1;
    public int f9205l2;
    public h6.m f9206l3;
    public final a3 m0;
    public boolean f9207m1;
    public int f9208m2;
    public org.telegram.ui.ActionBar.z0 f9209m3;
    public e7 f9210n0;
    public boolean n1;
    public boolean f9211n2;
    public org.telegram.ui.ActionBar.z0 f9212n3;
    public fi.m3 f9213o0;
    public boolean f9214o1;
    public b3 f9215o2;
    public final dh.c f9216o3;
    public fi.m3 f9217p0;
    public boolean f9218p1;
    public boolean f9219p2;
    public final ri.a f9220p3;
    public fi.m3 f9221q0;
    public long f9222q1;
    public float f9223q2;
    public final ri.f f9224q3;
    public int f9225r0;
    public final float f9226r1;
    public u2 f9227r2;
    public final gh.b f9228r3;
    public final q9 f9229s0;
    public int f9230s1;
    public o40 f9231s2;
    public TL_stories.TL_premium_boostsStatus f9232s3;
    public final n3 f9233t0;
    public boolean f9234t1;
    public int f9235t2;
    public org.telegram.messenger.e3 f9236t3;
    public final g2 f9237u0;
    public int f9238u1;
    public boolean f9239u2;
    public long f9240u3;
    public final View f9241v0;
    public int f9242v1;
    public final i4 f9243v2;
    public long f9244v3;
    public final ImageView f9245w0;
    public int f9246w1;
    public final h2.f f9247w2;
    public boolean f9248w3;
    public final LinearLayout f9249x0;
    public final h4 f9250x1;
    public final org.telegram.ui.Components.v5 f9251x2;
    public TLRPC.TL_channels_sendAsPeers f9252x3;
    public final a3 f9253y0;
    public final a8.b8 f9254y1;
    public final org.telegram.ui.Components.v5 f9255y2;
    public final w1 f9256y3;
    public org.telegram.ui.Components.h6 f9257z0;
    public c4 f9258z1;
    public float f9259z2;
    public int f9260z3;

    public j4(Context context, final q9 q9Var, g4 g4Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null);
        this.K0 = true;
        this.Q0 = new ArrayList();
        this.f9167a1 = -5;
        this.f9226r1 = 1.0f;
        h4 h4Var = new h4(this);
        this.f9250x1 = h4Var;
        this.Z1 = -1.0f;
        this.f9168a2 = -1.0f;
        this.f9171b2 = -1.0f;
        this.f9195i2 = ConnectionsManager.generateClassGuid();
        this.f9251x2 = new org.telegram.ui.Components.v5(this);
        this.f9255y2 = new org.telegram.ui.Components.v5(this);
        ir0 ir0Var = new ir0();
        this.G2 = ir0Var;
        this.N2 = 1.0f;
        this.f9256y3 = new w1(this, 4);
        this.A3 = new w1(this, 11);
        this.B3 = new ArrayList();
        this.C3 = new ArrayList();
        this.F3 = new ra(this, 20);
        this.G3 = new org.telegram.ui.Components.v5(this);
        this.H3 = new org.telegram.ui.Components.v5(this);
        this.I3 = new org.telegram.ui.Components.v5(this);
        this.K3 = new Path();
        ir0Var.E = new cb.c(this, 19);
        ?? obj = new Object();
        obj.f9114g = new ArrayList();
        this.f9243v2 = obj;
        this.f9247w2 = new h2.f((int[]) null);
        this.f9178e1 = new ArrayList();
        this.f9182f1 = new ArrayList();
        z2 z2Var = new z2(this, 0);
        this.N0 = z2Var;
        z2Var.A0 = false;
        z2Var.f21241z1 = true;
        z2Var.f21237y = true;
        z2Var.h0(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.U2 = imageReceiver;
        imageReceiver.f21241z1 = true;
        imageReceiver.f21237y = true;
        imageReceiver.h0(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.W2 = imageReceiver2;
        imageReceiver2.f21241z1 = true;
        imageReceiver2.f21237y = true;
        imageReceiver2.h0(3);
        ImageReceiver imageReceiver3 = new ImageReceiver(null);
        this.O0 = imageReceiver3;
        imageReceiver3.f21241z1 = true;
        imageReceiver3.f21237y = true;
        imageReceiver3.h0(0);
        ImageReceiver imageReceiver4 = new ImageReceiver(null);
        this.P0 = imageReceiver4;
        imageReceiver4.f21241z1 = true;
        imageReceiver4.f21237y = true;
        imageReceiver4.h0(0);
        z2Var.f21182a = Arrays.asList(imageReceiver3, imageReceiver4);
        this.W0 = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        this.f9229s0 = q9Var;
        this.f9186g1 = g4Var;
        this.f9254y1 = g4Var.f9023g;
        this.B1 = qp.s1(p10.f24474s0).P1();
        g4Var.f9027l.setColor(-16777216);
        this.W1 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.f9200k0 = h6Var;
        setClipChildren(false);
        f3 f3Var = new f3(this, context, this.L0, h6Var, q9Var);
        this.S0 = f3Var;
        gh.b bVar = new gh.b(h6Var, org.telegram.ui.ActionBar.m6.Ge, 0.8f);
        this.f9228r3 = bVar;
        ri.c cVar = new ri.c();
        cVar.a(i0.a.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT >= 31 && iz.e()) {
            ri.f fVar = new ri.f(cVar);
            this.f9224q3 = fVar;
            fVar.l(org.telegram.messenger.g0.L(8.0f));
            this.f9220p3 = fVar;
        } else {
            this.f9224q3 = null;
            this.f9220p3 = cVar;
        }
        jh.k kVar = new jh.k(this);
        ri.a aVar = this.f9220p3;
        dh.c cVar2 = new dh.c(aVar, aVar, aVar);
        cVar2.h = kVar;
        cVar2.f8711i = this;
        this.f9216o3 = cVar2;
        this.U1 = cVar2.c(this, bVar, false);
        fh.g c10 = cVar2.c(this, bVar, false);
        this.V1 = c10;
        c10.u(org.telegram.messenger.g0.L(32.0f));
        j3 j3Var = new j3(this, context, g4Var, q9Var);
        this.L0 = j3Var;
        j3Var.setClipChildren(false);
        this.T0 = new lx(this.f9205l2, j3Var);
        j3Var.addView(f3Var, ha.c(-1.0f, -1));
        n3 n3Var = new n3(this, getContext(), q9Var.D, q9Var, h6Var);
        this.f9233t0 = n3Var;
        n3Var.f9130b0.setOnClickListener(new y1(this, 10));
        ImageView imageView = new ImageView(context);
        this.f9245w0 = imageView;
        imageView.setImageDrawable(g4Var.f9028m);
        int L = org.telegram.messenger.g0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        imageView.setOnClickListener(new y1(this, 11));
        imageView.setContentDescription(id.M0(2131745459, null));
        ka.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(g4Var.f9029n);
        imageView2.setPadding(L, L, L, L);
        a3 a3Var = new a3(this, getContext(), 1);
        this.f9253y0 = a3Var;
        org.telegram.ui.Components.h6 h6Var2 = this.A0;
        if (h6Var2 != null) {
            h6Var2.setCallback(a3Var);
        }
        a3Var.setWillNotDraw(false);
        a3Var.setOnClickListener(new y1(this, 12));
        a3 a3Var2 = new a3(this, getContext(), 2);
        this.m0 = a3Var2;
        org.telegram.ui.Components.h6 h6Var3 = this.f9257z0;
        if (h6Var3 != null) {
            h6Var3.setCallback(a3Var2);
        }
        a3Var2.setWillNotDraw(false);
        a3Var2.setOnClickListener(new y1(this, 13));
        a3Var2.setOnLongClickListener(new f2(0, this, q9Var));
        e7 e7Var = new e7(context, g4Var);
        this.f9210n0 = e7Var;
        e7Var.setPadding(L, L, L, L);
        a3Var2.addView(this.f9210n0, ha.e(40, 40, 3));
        a3Var.addView(imageView2, ha.e(40, 40, 3));
        ka.b(a3Var2, 0.3f, 5.0f);
        ka.b(a3Var, 0.3f, 5.0f);
        z2Var.f21241z1 = true;
        z2Var.H0(j3Var);
        bg.r0 r0Var = new bg.r0(10);
        this.f9190h1 = r0Var;
        j3Var.setOutlineProvider(r0Var);
        j3Var.setClipToOutline(true);
        addView(j3Var);
        f4 f4Var = new f4(context, h4Var);
        this.X0 = f4Var;
        f4Var.setOnClickListener(new View.OnClickListener(this) {
            public final j4 f9778b;

            {
                this.f9778b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7;
                int i10 = r3;
                q9 q9Var2 = q9Var;
                j4 j4Var = this.f9778b;
                switch (i10) {
                    case 0:
                        long j3 = p10.i(j4Var.f9205l2).f24493n;
                        long j10 = j4Var.f9201k1;
                        if (j3 == j10) {
                            Bundle f10 = rf.b.f(1, "type");
                            f10.putLong("dialog_id", j4Var.f9201k1);
                            q9Var2.N(new v80(f10, null));
                            return;
                        } else if (j10 > 0) {
                            q9Var2.N(ProfileActivity.D4(j10));
                            return;
                        } else {
                            q9Var2.N(cn.ta(j10));
                            return;
                        }
                    default:
                        if (j4Var.f9250x1.j()) {
                            q9Var2.U();
                            if (!q9.C1) {
                                qp.e1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            b4 b4Var = j4Var.f9189h0;
                            if (!q9.C1) {
                                i7 = 2131748314;
                            } else {
                                i7 = 2131743849;
                            }
                            b4Var.setContentDescription(id.M0(i7, null));
                            return;
                        }
                        j4Var.a1(true);
                        return;
                }
            }
        });
        j3Var.addView(f4Var, ha.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.M0 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f9249x0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, ha.r(40, 40, 5));
        linearLayout.addView(a3Var, ha.r(40, 40, 5));
        linearLayout.addView(a3Var2, ha.r(40, 40, 5));
        addView(linearLayout, ha.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f9181f0 = imageView3;
        imageView3.setImageDrawable(g4Var.f9032q);
        imageView3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.m6.h0(-1, 1, -1));
        imageView3.setContentDescription(id.M0(2131754839, null));
        j3Var.addView(imageView3, ha.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.f9185g0 = imageView4;
        imageView4.setImageDrawable(g4Var.f9033r);
        imageView4.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.m6.h0(-1, 1, -1));
        imageView4.setContentDescription(id.M0(2131754808, null));
        j3Var.addView(imageView4, ha.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new ah.d(q9Var, 15));
        imageView3.setOnClickListener(new d0(this, h6Var, q9Var, context, g4Var, 1));
        b4 b4Var = new b4(context, 0);
        this.f9189h0 = b4Var;
        j3Var.addView(b4Var, ha.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ?? imageView5 = new ImageView(context);
        this.f9193i0 = imageView5;
        imageView5.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        b4Var.addView(imageView5);
        ImageView imageView6 = new ImageView(context);
        this.f9197j0 = imageView6;
        imageView6.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        imageView6.setImageDrawable(g4Var.f9035t);
        b4Var.addView(imageView6);
        imageView6.setVisibility(8);
        v8 v8Var = new v8(context);
        this.f9204l0 = v8Var;
        v8Var.setOnClickListener(new y1(this, 2));
        j3Var.addView(v8Var, ha.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        b4Var.setOnClickListener(new View.OnClickListener(this) {
            public final j4 f9778b;

            {
                this.f9778b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7;
                int i10 = r3;
                q9 q9Var2 = q9Var;
                j4 j4Var = this.f9778b;
                switch (i10) {
                    case 0:
                        long j3 = p10.i(j4Var.f9205l2).f24493n;
                        long j10 = j4Var.f9201k1;
                        if (j3 == j10) {
                            Bundle f10 = rf.b.f(1, "type");
                            f10.putLong("dialog_id", j4Var.f9201k1);
                            q9Var2.N(new v80(f10, null));
                            return;
                        } else if (j10 > 0) {
                            q9Var2.N(ProfileActivity.D4(j10));
                            return;
                        } else {
                            q9Var2.N(cn.ta(j10));
                            return;
                        }
                    default:
                        if (j4Var.f9250x1.j()) {
                            q9Var2.U();
                            if (!q9.C1) {
                                qp.e1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            b4 b4Var2 = j4Var.f9189h0;
                            if (!q9.C1) {
                                i7 = 2131748314;
                            } else {
                                i7 = 2131743849;
                            }
                            b4Var2.setContentDescription(id.M0(i7, null));
                            return;
                        }
                        j4Var.a1(true);
                        return;
                }
            }
        });
        this.Y0 = new p8(this, g4Var);
        j3Var.addView(n3Var, ha.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f9241v0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        g2 g2Var = new g2(this, context, q9Var, q9Var.f9648w, view, frameLayout, q9Var);
        this.f9237u0 = g2Var;
        j3Var.addView(view, ha.e(-1, 200, 87));
        j3Var.addView(g2Var, ha.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        j3Var.addView(frameLayout, ha.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int L2 = org.telegram.messenger.g0.L(20.0f);
        int o4 = i0.a.o(-1, 100);
        b4Var.setBackground(org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, 0, o4, o4));
        int L3 = org.telegram.messenger.g0.L(20.0f);
        int o10 = i0.a.o(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.m6.k0(L3, L3, L3, L3, 0, o10, o10));
        int L4 = org.telegram.messenger.g0.L(20.0f);
        int o11 = i0.a.o(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.m6.k0(L4, L4, L4, L4, 0, o11, o11));
        int L5 = org.telegram.messenger.g0.L(20.0f);
        int o12 = i0.a.o(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.m6.k0(L5, L5, L5, L5, 0, o12, o12));
        int L6 = org.telegram.messenger.g0.L(20.0f);
        int o13 = i0.a.o(-1, 100);
        a3Var2.setBackground(org.telegram.ui.ActionBar.m6.k0(L6, L6, L6, L6, 0, o13, o13));
        int L7 = org.telegram.messenger.g0.L(20.0f);
        int o14 = i0.a.o(-1, 100);
        a3Var.setBackground(org.telegram.ui.ActionBar.m6.k0(L7, L7, L7, L7, 0, o14, o14));
        org.telegram.ui.Cells.s9 s9Var = n3Var.W;
        View n10 = s9Var.n(context);
        if (n10 != null) {
            org.telegram.messenger.g0.E2(n10);
            addView(n10);
        }
        s9Var.D = new h2(this, 0);
        s9Var.S(this);
    }

    public static void T0(y6 y6Var, ImageReceiver imageReceiver, String str) {
        if (y6Var.f9970s) {
            imageReceiver.u0(null, null, hc.g(y6Var.f9967f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.r0(hc.g(y6Var.f9966e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void X(j4 j4Var, ValueAnimator valueAnimator) {
        float f10;
        v8 v8Var = j4Var.f9204l0;
        j4Var.N3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        f4 f4Var = j4Var.X0;
        f4Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var.N3);
        f4Var.setAlpha(1.0f - j4Var.N3);
        ImageView imageView = j4Var.f9181f0;
        imageView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var.N3);
        imageView.setAlpha(1.0f - j4Var.N3);
        ImageView imageView2 = j4Var.f9185g0;
        imageView2.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var.N3);
        imageView2.setAlpha(1.0f - j4Var.N3);
        b4 b4Var = j4Var.f9189h0;
        b4Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var.N3);
        b4Var.setAlpha((1.0f - j4Var.N3) * j4Var.N2);
        a3 a3Var = j4Var.F1;
        if (a3Var != null) {
            a3Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * j4Var.N3);
            j4Var.F1.setAlpha(1.0f - j4Var.N3);
        }
        if (v8Var != null) {
            v8Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var.N3);
            v8Var.setAlpha(1.0f - j4Var.N3);
        }
        j4Var.f9233t0.setAlpha(1.0f - j4Var.N3);
        c4 c4Var = j4Var.f9258z1;
        if (c4Var == null) {
            f10 = 0.0f;
        } else {
            f10 = ((h9) c4Var).d.V;
        }
        float hideInterfaceAlpha = j4Var.getHideInterfaceAlpha();
        a3 a3Var2 = j4Var.m0;
        if (a3Var2 != null) {
            a3Var2.setAlpha((1.0f - j4Var.N3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        ImageView imageView3 = j4Var.f9245w0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - j4Var.N3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        a3 a3Var3 = j4Var.f9253y0;
        if (a3Var3 != null) {
            a3Var3.setAlpha((1.0f - j4Var.N3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        o2 o2Var = j4Var.K1;
        if (o2Var != null) {
            o2Var.setAlpha(1.0f - j4Var.N3);
            j4Var.invalidate();
        }
        j4Var.L0.invalidate();
    }

    public static void Y(j4 j4Var, boolean z9) {
        org.telegram.ui.ActionBar.z0 z0Var = j4Var.f9209m3;
        if (z0Var != null && j4Var.f9206l3 != null && z0Var.getVisibility() == 0) {
            if (z9) {
                if (Math.abs(q9.A1 - 0.2f) < 0.05f) {
                    j4Var.f9209m3.setSubtext(id.M0(2131743574, null));
                } else if (Math.abs(q9.A1 - 0.5f) < 0.05f) {
                    j4Var.f9209m3.setSubtext(id.M0(2131743576, null));
                } else if (Math.abs(q9.A1 - 1.0f) < 0.05f) {
                    j4Var.f9209m3.setSubtext(id.M0(2131743577, null));
                } else if (Math.abs(q9.A1 - 1.5f) < 0.05f) {
                    j4Var.f9209m3.setSubtext(id.M0(2131743578, null));
                } else if (Math.abs(q9.A1 - 2.0f) < 0.05f) {
                    j4Var.f9209m3.setSubtext(id.M0(2131743575, null));
                } else {
                    org.telegram.ui.ActionBar.z0 z0Var2 = j4Var.f9209m3;
                    z0Var2.setSubtext(id.a0(null, null, 2131743579, eu0.a(q9.A1) + "x"));
                }
            }
            j4Var.f9206l3.H(z9, q9.A1);
        }
    }

    public static void Z(j4 j4Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (!j4Var.G0() && !j4Var.f9250x1.f9073f) {
            if (p10.i(j4Var.f9205l2).q()) {
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232393, id.M0(2131744887, null), false, j4Var.f9200k0).setOnClickListener(new y1(j4Var, 8));
                return;
            }
            Drawable drawable = j4Var.getContext().getDrawable(2131232169);
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            i2 i2Var = new i2(j4Var.getContext().getDrawable(2131232381), drawable, 0);
            org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232393, id.M0(2131744887, null), false, j4Var.f9200k0);
            c10.setOnClickListener(new y1(j4Var, 9));
            c10.setIcon(i2Var);
        }
    }

    public static void b0(j4 j4Var) {
        h4 h4Var = j4Var.f9250x1;
        TL_stories.StoryItem storyItem = h4Var.f9069a;
        if ((storyItem == null && h4Var.f9070b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = h4Var.h();
        boolean z9 = h4Var.f9072e;
        if (h != null && h.exists()) {
            MediaController.d0(h.toString(), j4Var.getContext(), z9 ? 1 : 0, null, null, new bi.b9(1, j4Var, z9));
            return;
        }
        j4Var.Y0();
    }

    public static void c0(j4 j4Var, long j3) {
        String str;
        boolean z9;
        TLRPC.User user;
        if (j3 > 0) {
            TLRPC.User a22 = qp.s1(j4Var.f9205l2).a2(Long.valueOf(j3));
            str = a22.first_name;
            z9 = a22.stories_hidden;
            user = a22;
        } else {
            TLRPC.Chat M0 = qp.s1(j4Var.f9205l2).M0(Long.valueOf(-j3));
            str = M0.title;
            z9 = M0.stories_hidden;
            user = M0;
        }
        org.telegram.messenger.g0.i3(new bi.o(j4Var, qp.s1(j4Var.f9205l2), j3, !z9, str, user), 200L);
    }

    public static void d0(j4 j4Var) {
        int i7;
        int i10;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, j4Var.getContext(), j4Var.f9200k0);
        if (j4Var.G0()) {
            i7 = 2131751564;
        } else {
            i7 = 2131751487;
        }
        String M0 = id.M0(i7, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.R = M0;
        if (j4Var.G0()) {
            i10 = 2131751565;
        } else {
            i10 = 2131751488;
        }
        u1Var.T = id.M0(i10, null);
        alertDialog$Builder.k(id.M0(2131751598, null), new s1(j4Var, 2));
        alertDialog$Builder.h(id.M0(2131752589, null), new a1(2));
        ((h9) j4Var.f9258z1).h(u1Var);
        u1Var.i();
    }

    public static void f0(j4 j4Var) {
        String str;
        bc K;
        org.telegram.ui.ActionBar.h6 h6Var = j4Var.f9200k0;
        j3 j3Var = j4Var.L0;
        if (j4Var.f9218p1) {
            return;
        }
        if (j4Var.n1) {
            if (j4Var.f9232s3 != null && j4Var.f9236t3 != null) {
                ug.i0.w1(new bi.w4(j4Var, 1), j4Var.f9232s3, j4Var.f9236t3, j4Var.f9201k1, true);
                return;
            }
            q9 q9Var = j4Var.f9229s0;
            if (q9Var != null) {
                q9Var.f9623j1 = true;
                q9Var.V();
            }
            qp.s1(j4Var.f9205l2).G0().a(j4Var.f9201k1, new z1(j4Var, 0));
            return;
        }
        o2 o2Var = j4Var.K1;
        int i7 = -j4Var.f9167a1;
        j4Var.f9167a1 = i7;
        org.telegram.messenger.g0.G3(i7, o2Var, null);
        org.telegram.messenger.p2.APP_ERROR.a();
        if (j4Var.f9201k1 >= 0) {
            str = t10.p(qp.s1(j4Var.f9205l2).a2(Long.valueOf(j4Var.f9201k1)));
        } else {
            str = "";
        }
        if (qp.s1(j4Var.f9205l2).D3()) {
            K = new gc(j3Var, h6Var).Q(2131624216, 36, org.telegram.messenger.g0.X2(id.a0(null, null, 2131743758, str)));
        } else {
            K = new gc(j3Var, h6Var).K(2131624216, org.telegram.messenger.g0.X2(id.a0(null, null, 2131743758, str)), id.M0(2131743759, null), new w1(j4Var, 5));
        }
        K.j();
    }

    public org.telegram.messenger.c getAccountInstance() {
        return org.telegram.messenger.c.a(this.f9205l2);
    }

    public float getHideInterfaceAlpha() {
        float f10;
        float f11 = 1.0f - this.f9251x2.f38854c;
        t5 t5Var = this.f9229s0.f9650x;
        if (t5Var == null) {
            f10 = 0.0f;
        } else {
            f10 = t5Var.f9793f;
        }
        return (1.0f - f10) * f11;
    }

    public long getMessageMinPrice() {
        q9 q9Var;
        if (!this.f9250x1.f9073f || (q9Var = this.f9229s0) == null || q9Var.A0 == null || B0(true)) {
            return 0L;
        }
        return q9Var.A0.j();
    }

    public static void h0(j4 j4Var) {
        h4 h4Var = j4Var.f9250x1;
        if (h4Var.f9069a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.f27204id = h4Var.f9069a.f27199id;
        tL_stories_exportStoryLink.peer = qp.s1(j4Var.f9205l2).j1(j4Var.f9201k1);
        ConnectionsManager.getInstance(j4Var.f9205l2).sendRequest(tL_stories_exportStoryLink, new Object());
    }

    public final void A0() {
        if (this.J2 != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        textView.setTextSize(1, 16.0f);
        textView.setText(id.M0(2131744453, null));
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f9200k0;
        org.telegram.ui.ActionBar.t6.U(textView, i7, h6Var);
        TextView textView2 = new TextView(getContext());
        ka.a(textView2);
        textView2.setText(id.M0(2131754230, null));
        int i10 = org.telegram.ui.ActionBar.m6.Gi;
        org.telegram.ui.ActionBar.t6.U(textView2, i10, h6Var);
        textView2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 15.0f);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i11 = org.telegram.ui.ActionBar.m6.Ci;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i11, h6Var);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(i10, h6Var), 30);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w02, o4, o4);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i10, 30);
        textView2.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(textView2, k02, M, g10, h6Var);
        textView2.setOnClickListener(new y1(this, 3));
        linearLayout.addView(textView, ha.o(-1, -2));
        linearLayout.addView(textView2, ha.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, ha.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.L0.addView(frameLayout);
        this.J2 = frameLayout;
    }

    public final boolean B0(boolean z9) {
        g1 g1Var;
        TLRPC.Peer i7;
        g1 g1Var2;
        long e10 = p10.i(this.f9205l2).e();
        int i10 = (this.f9201k1 > 0L ? 1 : (this.f9201k1 == 0L ? 0 : -1));
        q9 q9Var = this.f9229s0;
        if (i10 < 0 && (g1Var2 = q9Var.A0) != null) {
            if (z9) {
                TLRPC.Peer i11 = g1Var2.i();
                TLRPC.Chat M0 = qp.s1(this.f9205l2).M0(Long.valueOf(-this.f9201k1));
                if (q9Var.A0.l() || org.telegram.messenger.t3.w(14, M0)) {
                    if (i11 == null || this.f9201k1 == org.telegram.messenger.m5.o(i11) || org.telegram.messenger.m5.o(i11) == p10.i(this.f9205l2).e()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } else if (i10 >= 0 && q9Var != null && (g1Var = q9Var.A0) != null && g1Var.l()) {
            if (!z9 || (i7 = q9Var.A0.i()) == null || this.f9201k1 == org.telegram.messenger.m5.o(i7) || org.telegram.messenger.m5.o(i7) == e10 || this.f9201k1 == e10) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public final void C0(Canvas canvas, int i7, int i10) {
        TextureView textureView;
        i4 i4Var = this.f9243v2;
        org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) i4Var.f9112e;
        if (j4Var != null && ((SurfaceView) i4Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                org.telegram.messenger.g0.z0((SurfaceView) i4Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else if (j4Var != null && (textureView = (TextureView) i4Var.f9113f) != null) {
            Bitmap bitmap = textureView.getBitmap(i7, i10);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            canvas.save();
            j3 j3Var = this.L0;
            canvas.scale(i7 / j3Var.getMeasuredWidth(), i10 / j3Var.getMeasuredHeight());
            this.N0.h(canvas, null);
            canvas.restore();
        }
    }

    public final void D0(fi.q8 q8Var, TL_stories.StoryItem storyItem) {
        int i7;
        View[] viewPages;
        c4 c4Var = this.f9258z1;
        Context context = getContext();
        if (storyItem.pinned) {
            i7 = Integer.MAX_VALUE;
        } else {
            i7 = storyItem.expire_date - storyItem.date;
        }
        fi.s8 s8Var = new fi.s8(i7, context, this.f9200k0);
        s8Var.W0(q8Var);
        fi.g1 g1Var = s8Var.l1;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof fi.n8) {
                    ((fi.n8) view).f(false);
                }
            }
        }
        s8Var.Q0(true);
        s8Var.N1 = new ab.g(11, this, storyItem);
        ((h9) c4Var).h(s8Var);
    }

    public final boolean E0(android.view.ViewGroup r11, float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: di.j4.E0(android.view.ViewGroup, float, float, boolean):boolean");
    }

    public final boolean F0(View view, MotionEvent motionEvent) {
        float x10 = getX();
        j3 j3Var = this.L0;
        float x11 = view.getX() + j3Var.getX() + x10;
        float y10 = view.getY() + j3Var.getY() + getY();
        if (motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + view.getWidth() && motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + view.getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean G0() {
        r6 r6Var;
        q9 q9Var = this.f9229s0;
        if (q9Var != null && (r6Var = q9Var.N0) != null && r6Var.f9696e == 4) {
            return true;
        }
        return false;
    }

    public final boolean H0() {
        TLRPC.User a22;
        if (!G0() || (a22 = qp.s1(this.f9205l2).a2(Long.valueOf(this.f9229s0.N0.d))) == null || !a22.bot || !a22.bot_can_edit) {
            return false;
        }
        return true;
    }

    public abstract boolean I0();

    public final void J0(ch.o0 o0Var) {
        boolean z9;
        boolean z10;
        int i7;
        TLRPC.Reaction reaction;
        h4 h4Var = this.f9250x1;
        TL_stories.StoryItem storyItem = h4Var.f9069a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        if (reaction2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (reaction2 != null && o0Var == null) {
            j0();
            this.B1.j0(this.f9201k1, h4Var.f9069a, null);
        } else if (o0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(this.f9205l2).f25840r.get("❤");
            if (tL_availableReaction != null) {
                this.Y2 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a10 = ch.k0.a();
                hc b10 = hc.b(document);
                ImageReceiver imageReceiver = this.U2;
                imageReceiver.q0(b10, a10, null, null, null, 0);
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                this.Z2 = true;
                this.B1.j0(this.f9201k1, h4Var.f9069a, ch.o0.c(tL_availableReaction));
            }
        } else {
            j0();
            this.B1.j0(this.f9201k1, h4Var.f9069a, o0Var);
        }
        TL_stories.StoryItem storyItem2 = h4Var.f9069a;
        a3 a3Var = this.m0;
        if (storyItem2 != null && (reaction = storyItem2.sent_reaction) != null) {
            z9 = !z9;
            this.f9210n0.setReaction(ch.o0.d(reaction));
            a3Var.setContentDescription(id.M0(2131754850, null));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z10 = true;
        } else {
            this.f9210n0.setReaction(null);
            a3Var.setContentDescription(id.M0(2131754851, null));
            z10 = false;
        }
        if (this.f9207m1 && z9) {
            TL_stories.StoryItem storyItem3 = h4Var.f9069a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = h4Var.f9069a.views;
            int i10 = storyViews.reactions_count;
            if (z10) {
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
        TL_stories.StoryItem storyItem4 = h4Var.f9069a;
        ch.q0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        i1(true);
    }

    public final void K0() {
        g1 g1Var;
        boolean z9;
        if (this.f9252x3 == null) {
            q9 q9Var = this.f9229s0;
            if (q9Var != null && (g1Var = q9Var.A0) != null) {
                TLRPC.GroupCall groupCall = g1Var.f9010w;
                if (groupCall == null) {
                    z9 = false;
                } else {
                    z9 = !groupCall.messages_enabled;
                }
                if (z9) {
                    return;
                }
            }
            TLRPC.TL_channels_sendAsPeers M1 = qp.s1(this.f9205l2).M1(this.f9201k1, true);
            this.f9252x3 = M1;
            o2 o2Var = this.K1;
            if (o2Var != null && M1 != null) {
                o2Var.R1(true);
            }
        }
    }

    public final boolean L0() {
        o2 o2Var = this.K1;
        if (o2Var == null) {
            return false;
        }
        boolean z9 = o2Var.f31179z2;
        if (z9) {
            o2Var.s1();
        }
        org.telegram.messenger.g0.i3(new w1(this, 3), 300L);
        return z9;
    }

    public final void M0() {
        CharSequence charSequence;
        long j3;
        z1 z1Var;
        int i7;
        long j10;
        long j11;
        qp.e1().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.K1.getTextWithEntities();
        long e10 = p10.i(this.f9205l2).e();
        TLRPC.Peer i10 = this.f9229s0.A0.i();
        if (i10 != null) {
            e10 = org.telegram.messenger.m5.o(i10);
        }
        Context context = getContext();
        int i11 = this.f9205l2;
        String s5 = org.telegram.messenger.m5.s(i11, this.f9201k1);
        long messageMinPrice = getMessageMinPrice();
        long j12 = this.f9240u3;
        z1 z1Var2 = new z1(this, 1);
        b bVar = new b();
        org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, context, (org.telegram.ui.ActionBar.h6) bVar, false);
        w2Var.N();
        w2Var.f28707v0 = false;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        w2Var.N = f10;
        int[] iArr = qp.s1(i11).X6;
        CharSequence j02 = ij.j0(textWithEntities, false, false, new TextPaint());
        if (j02 instanceof Spannable) {
            Spannable spannable = (Spannable) j02;
            charSequence = j02;
            j3 = j12;
            z1Var = z1Var2;
            i7 = ((org.telegram.ui.Components.q5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.q5.class)).length + ((org.telegram.messenger.f6[]) spannable.getSpans(0, charSequence.length(), org.telegram.messenger.f6.class)).length;
        } else {
            charSequence = j02;
            j3 = j12;
            z1Var = z1Var2;
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
        fi.d dVar = new fi.d(context, null, true);
        ?? obj = new Object();
        obj.f9721c = e10;
        obj.f9723f = textWithEntities;
        obj.f9724g = jArr[0];
        n0 n0Var = new n0(i11, context, true);
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
        bi.e5 e5Var = new bi.e5(context, id.M0(2131748814, null), bVar);
        f11.addView(e5Var, ha.q(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        bi.e5 e5Var2 = new bi.e5(context, id.M0(2131748815, null), bVar);
        f11.addView(e5Var2, ha.q(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        bi.e5 e5Var3 = new bi.e5(context, id.M0(2131748816, null), bVar);
        f11.addView(e5Var3, ha.q(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        s sVar = new s(context, bVar, r1);
        z1 z1Var3 = z1Var;
        long j13 = j11;
        c20[] c20VarArr = {new r(jArr, dVar, new wp[1], (s0) obj, n0Var, i11, e5Var, e5Var2, e5Var3, sVar, new boolean[]{true})};
        n0Var.set(obj);
        int i15 = 9;
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int i16 = qp.s1(i11).Y6;
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
        if (arrayList.isEmpty() || ((Integer) jg.g.i(1, arrayList)).intValue() < i16) {
            arrayList.add(Integer.valueOf(i16));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            iArr4[i19] = ((Integer) arrayList.get(i19)).intValue();
        }
        sVar.f5204e0 = iArr4;
        sVar.setValue((int) jArr[0]);
        f10.addView(sVar, ha.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        c20VarArr[0].a(Integer.valueOf((int) jArr[0]));
        f10.addView(f11, ha.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i20 = org.telegram.ui.ActionBar.m6.f27998j5;
        TextView b10 = qa.b(context, 20.0f, i20, true, bVar);
        org.telegram.messenger.k5.m(b10, 17, null, 2131748811);
        f10.addView(b10, ha.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = qa.b(context, 14.0f, i20, false, bVar);
        b11.setGravity(17);
        org.telegram.messenger.k5.r(null, null, 2131748812, new Object[]{s5}, b11);
        f10.addView(b11, ha.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        f10.addView(n0Var, ha.t(-2, -2, 17, 42, 22, 42, 20));
        f10.addView(dVar, ha.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        w2Var.show();
        dVar.setOnClickListener(new ah.g(z1Var3, jArr, w2Var, 4));
    }

    public final void N0() {
        if (this.K1 == null) {
            return;
        }
        r0();
        this.f9227r2.d2.i0();
        this.f9227r2.y1(-1, true);
        u2 u2Var = this.f9227r2;
        u2Var.T1 = this.f9201k1;
        u2Var.e1();
        this.f9227r2.a1().setText(this.K1.getFieldText());
        ((h9) this.f9258z1).h(this.f9227r2);
    }

    public final void O0() {
        Bundle bundle = new Bundle();
        long j3 = this.f9201k1;
        if (j3 < 0) {
            bundle.putLong("chat_id", -j3);
        } else {
            bundle.putLong("user_id", j3);
        }
        TLRPC.Dialog S0 = qp.s1(this.f9205l2).S0(this.f9201k1);
        if (S0 != null) {
            bundle.putInt("message_id", S0.top_message);
        }
        this.f9229s0.N(new cn(bundle));
    }

    public final void P0(long r22) {
        throw new UnsupportedOperationException("Method not decompiled: di.j4.P0(long):void");
    }

    public final void Q0(android.net.Uri r18) {
        throw new UnsupportedOperationException("Method not decompiled: di.j4.Q0(android.net.Uri):void");
    }

    public final void R0(long j3, boolean z9) {
        int i7;
        int i10;
        h4 h4Var;
        if (this.f9234t1 != z9) {
            this.f9234t1 = z9;
            ch0 ch0Var = this.f9193i0;
            int i11 = 0;
            if (z9) {
                if (this.f9229s0.f9599a && Build.VERSION.SDK_INT < 33) {
                    q9 q9Var = ((h9) this.f9258z1).d;
                    q9Var.f9625k1 = true;
                    q9Var.V();
                    ra raVar = this.F3;
                    org.telegram.messenger.g0.r(raVar);
                    org.telegram.messenger.g0.i3(raVar, 100L);
                }
                P0(j3);
                e1();
                ch0Var.setAnimation(this.f9186g1.f9036u);
                this.f9234t1 = true;
                this.X0.f8990a.getImageReceiver().O0(true, true);
                if (this.f9250x1.f9069a != null) {
                    org.telegram.messenger.a8.b("StoryViewer displayed story dialogId=" + this.f9201k1 + " storyId=" + h4Var.f9069a.f27199id + " " + h4.c(h4Var));
                }
            } else {
                n0();
                ch0Var.a();
                this.U0 = null;
                this.f9239u2 = false;
                this.f9251x2.e(true, 0.0f);
                this.L0.invalidate();
                invalidate();
                o0();
                q9 q9Var2 = ((h9) this.f9258z1).d;
                q9Var2.H0 = false;
                q9Var2.V();
            }
            if (this.f9234t1) {
                i7 = 3;
            } else {
                i7 = 2;
            }
            this.N0.h0(i7);
            if (this.f9234t1) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            this.O0.h0(i10);
            if (this.f9234t1) {
                i11 = 2;
            }
            this.P0.h0(i11);
            if (this.l1 || this.f9207m1) {
                z6 z6Var = this.B1;
                long j10 = this.f9201k1;
                boolean z10 = this.f9234t1;
                a0.h hVar = z6Var.f10007m;
                z9 z9Var = (z9) hVar.f(j10);
                if (z9Var == null) {
                    z9Var = new z9(z6Var.f9997a, j10, z6Var);
                    hVar.k(z9Var, j10);
                }
                z9Var.b(z10);
            }
        }
    }

    public final void S0(int i7, long j3) {
        if (this.f9201k1 != j3) {
            h4 h4Var = this.f9250x1;
            h4Var.f9070b = null;
            h4Var.f9069a = null;
        }
        this.f9201k1 = j3;
        this.f9194i1 = null;
        m0(i7);
        TL_stories.PeerStories peerStories = this.f9229s0.P0;
        boolean z9 = true;
        if (peerStories != null) {
            this.B1.V(peerStories, true);
            return;
        }
        z6 z6Var = this.B1;
        TL_stories.PeerStories y10 = z6Var.y(j3);
        if (y10 == null) {
            y10 = z6Var.z(j3);
        } else {
            z9 = false;
        }
        z6Var.V(y10, z9);
    }

    public final void U0(long j3, boolean z9, boolean z10) {
        String str;
        if (!z9 && j3 == this.f9244v3 && this.f9248w3 == z10) {
            return;
        }
        this.f9244v3 = j3;
        this.f9248w3 = z10;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        f4 f4Var = this.X0;
        if (i7 >= 0) {
            if (this.l1 && !z10) {
                f4Var.f8991b.l(id.M0(2131745641, null), false);
                f4Var.f8991b.i(null);
                return;
            }
            TLRPC.User a22 = qp.s1(this.f9205l2).a2(Long.valueOf(j3));
            if (a22 != null && a22.verified) {
                Drawable mutate = getContext().getDrawable(2131232793).mutate();
                mutate.setAlpha(255);
                xp xpVar = new xp(mutate, null);
                xpVar.f40383x = true;
                int L = org.telegram.messenger.g0.L(16.0f);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                xpVar.h = L;
                xpVar.f40379n = L2;
                f4Var.f8991b.i(xpVar);
            } else {
                f4Var.f8991b.i(null);
            }
            if (a22 != null) {
                f4Var.f8991b.l(org.telegram.messenger.i6.m(org.telegram.messenger.g0.D2(org.telegram.messenger.g5.p(a22)), f4Var.f8991b.getPaint().getFontMetricsInt(), false, null, 0), false);
                return;
            }
            f4Var.f8991b.l(null, false);
            return;
        }
        TLRPC.Chat M0 = qp.s1(this.f9205l2).M0(Long.valueOf(-j3));
        e4 e4Var = f4Var.f8991b;
        e4 e4Var2 = f4Var.f8991b;
        if (M0 == null) {
            str = "";
        } else {
            str = M0.title;
        }
        e4Var.l(org.telegram.messenger.g0.D2(str), false);
        if (M0 != null && M0.verified) {
            Drawable mutate2 = getContext().getDrawable(2131232793).mutate();
            mutate2.setAlpha(255);
            xp xpVar2 = new xp(mutate2, null);
            xpVar2.f40383x = true;
            int L3 = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            xpVar2.h = L3;
            xpVar2.f40379n = L4;
            e4Var2.i(xpVar2);
            return;
        }
        e4Var2.i(null);
    }

    public final void V0(float f10, float f11, o4 o4Var) {
        this.V0 = f10;
        this.j3 = 1.0f / f11;
        if (this.U0 != o4Var) {
            this.U0 = o4Var;
            if (o4Var != null) {
                ImageReceiver imageReceiver = o4Var.f9437a;
                if (imageReceiver.n() != null) {
                    Bitmap copy = imageReceiver.n().copy(Bitmap.Config.ARGB_8888, false);
                    z2 z2Var = this.N0;
                    z2Var.f21189c0 = null;
                    z2Var.Z0.setShader(null);
                    z2Var.N0(new BitmapDrawable(copy));
                }
            }
        }
    }

    public final void W0(boolean z9) {
        boolean z10;
        h4 h4Var = this.f9250x1;
        if (h4Var.f9069a != null) {
            q9 q9Var = this.f9229s0;
            if (q9Var.f9613f != null) {
                String e10 = h4Var.e();
                TLRPC.Chat chat = null;
                if (z9) {
                    m2 m2Var = new m2(2, this.f9200k0);
                    if (this.f9207m1) {
                        chat = qp.s1(this.f9205l2).M0(Long.valueOf(-this.f9201k1));
                    }
                    if (qp.s1(this.f9205l2).W4() && ((!this.f9207m1 && !t10.A(this.f9201k1)) || org.telegram.messenger.t3.t0(chat))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x2 x2Var = new x2(this, q9Var.f9613f.getContext(), e10, e10, z10, m2Var);
                    this.I2 = x2Var;
                    x2Var.d2 = true;
                    TL_stories.StoryItem storyItem = h4Var.f9069a;
                    storyItem.dialogId = this.f9201k1;
                    x2Var.A2 = storyItem;
                    x2Var.f36040n2 = new d6.i(this, 18);
                    ((h9) this.f9258z1).h(x2Var);
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", e10);
                LaunchActivity.G1.startActivityForResult(Intent.createChooser(intent, id.M0(2131744846, null)), 500);
            }
        }
    }

    public final void X0() {
        j3 j3Var = this.L0;
        org.telegram.ui.ActionBar.h6 h6Var = this.f9200k0;
        org.telegram.messenger.k5.p(null, 2131743833, new gc(j3Var, h6Var), h6Var);
    }

    public final void Y0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f9200k0);
        String M0 = id.M0(2131689472, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.R = M0;
        alertDialog$Builder.k(id.M0(2131747831, null), null);
        u1Var.T = id.M0(2131747218, null);
        ((h9) this.f9258z1).h(u1Var);
    }

    public final void Z0(boolean z9) {
        if (this.f9172b3 != z9) {
            h4 h4Var = this.f9250x1;
            if (h4Var.f9069a != null) {
                this.f9172b3 = z9;
                if (z9) {
                    this.f9169a3.setVisibility(0);
                }
                this.f9169a3.setStoryItem(h4Var.f9069a);
                q9 q9Var = ((h9) this.f9258z1).d;
                q9Var.f9631o1 = z9;
                q9Var.V();
                float f10 = 0.0f;
                if (z9) {
                    float f11 = this.f9175c3;
                    if (z9) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    this.f9169a3.setTransitionProgress(this.f9175c3);
                    ofFloat.addUpdateListener(new x1(this, 1));
                    ofFloat.addListener(new j2(this, z9, 0));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(wq.f40047g);
                    ofFloat.start();
                    return;
                }
                if (this.f9169a3.getReactionsWindow() != null) {
                    this.f9169a3.getReactionsWindow().e();
                }
                this.f9169a3.animate().alpha(0.0f).setDuration(150L).setListener(new k2(this, 0)).start();
            }
        }
    }

    public final void a1(boolean z9) {
        int i7;
        if (this.f9217p0 == null) {
            fi.m3 m3Var = new fi.m3(getContext(), 1);
            m3Var.o(1.0f, -56.0f);
            this.f9217p0 = m3Var;
            m3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
            this.L0.addView(this.f9217p0, ha.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        fi.m3 m3Var2 = this.f9217p0;
        if (z9) {
            i7 = 2131744607;
        } else {
            i7 = 2131744457;
        }
        m3Var2.u(id.M0(i7, null));
        this.f9217p0.w();
    }

    public final boolean b1(boolean z9) {
        if (this.f9229s0.Q0) {
            z9 = !z9;
        }
        if (z9) {
            if (this.f9230s1 < getStoriesCount() - 1) {
                this.f9230s1++;
                d1(false);
                return true;
            }
        } else {
            int i7 = this.f9230s1;
            if (i7 > 0) {
                this.f9230s1 = i7 - 1;
                d1(false);
                return true;
            }
        }
        return false;
    }

    public final void c1() {
        if (!qp.s1(this.f9205l2).W4()) {
            return;
        }
        File h = this.f9250x1.h();
        if (h != null && h.exists()) {
            x2 x2Var = this.I2;
            if (x2Var != null) {
                x2Var.dismiss();
            }
            org.telegram.messenger.g0.i3(new w1(this, 8), 120L);
            return;
        }
        Y0();
    }

    public final void d1(boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: di.j4.d1(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        float f10;
        g1 g1Var;
        boolean z9;
        int i11 = qs.f25099v5;
        long j3 = 0;
        q9 q9Var = this.f9229s0;
        boolean z10 = false;
        if (i7 != i11 && (i7 != qs.f25113x5 || q9Var.N0 != objArr[0])) {
            if (i7 == qs.f25042m3) {
                d1(false);
                return;
            } else if (i7 == qs.f25022i4) {
                this.f9233t0.f9130b0.invalidate();
                return;
            } else if (i7 == qs.D5) {
                p0(true);
                return;
            } else if (i7 == qs.f24980b3) {
                t6 o4 = qp.s1(this.f9205l2).P1().o();
                if (o4 != null && o4.a(this.f9205l2, 1) && this.f9258z1 != null) {
                    bi.w4 w4Var = new bi.w4(this, 1);
                    Context W = org.telegram.messenger.g0.W(getContext());
                    if (W == null) {
                        W = LaunchActivity.G1;
                    }
                    ((h9) this.f9258z1).h(new ug.i0(o4.b(), this.f9205l2, W, w4Var, null));
                    return;
                }
                return;
            } else if (i7 == qs.f25021i3) {
                TL_account.RequirementToContact J2 = qp.s1(this.f9205l2).J2(this.f9201k1);
                if (this.f9201k1 >= 0 && !p10.i(this.f9205l2).q() && (J2 instanceof TL_account.requirementToContactPremium)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (this.f9214o1 != z9 || this.f9222q1 != org.telegram.messenger.m5.k(J2)) {
                    this.f9214o1 = z9;
                    this.f9222q1 = org.telegram.messenger.m5.k(J2);
                    d1(false);
                    p0(true);
                    return;
                }
                return;
            } else if (i7 == qs.T) {
                Object obj = objArr[0];
                if ((obj instanceof TLRPC.ChatFull) && this.f9201k1 == (-((TLRPC.ChatFull) obj).f26961id)) {
                    d1(false);
                    return;
                }
                return;
            } else if (i7 == qs.G2) {
                long longValue = ((Long) objArr[0]).longValue();
                if (q9Var != null && (g1Var = q9Var.A0) != null && g1Var.g() == longValue) {
                    d1(false);
                    o2 o2Var = this.K1;
                    if (o2Var != null) {
                        o2Var.E(true);
                        this.K1.R1(true);
                        p0(true);
                    }
                    g2 g2Var = this.f9237u0;
                    if (g2Var != null) {
                        g1 g1Var2 = g2Var.P;
                        if (g1Var2 != null) {
                            j3 = g1Var2.j();
                        }
                        if (g2Var.H != j3) {
                            g2Var.f9813e.O(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i7 == qs.F && ((Boolean) objArr[2]).booleanValue()) {
                K0();
                return;
            } else {
                return;
            }
        }
        c4 c4Var = this.f9258z1;
        if (c4Var == null || !((h9) c4Var).d.G0) {
            if (this.f9234t1) {
                h1();
                if (this.f9198j1 == 0) {
                    if (!this.f9211n2) {
                        this.f9211n2 = true;
                        ((h9) this.f9258z1).j();
                        return;
                    }
                    return;
                }
                int i12 = this.f9230s1;
                ArrayList arrayList = this.f9178e1;
                int size = arrayList.size();
                ArrayList arrayList2 = this.f9182f1;
                if (i12 >= arrayList2.size() + size) {
                    this.f9230s1 = (arrayList2.size() + arrayList.size()) - 1;
                }
                d1(false);
                if (this.l1 || this.f9207m1) {
                    i1(true);
                }
            }
            TL_stories.PeerStories peerStories = q9Var.P0;
            if (peerStories != null) {
                this.B1.V(peerStories, true);
            } else {
                long j10 = this.f9201k1;
                if (j10 != 0) {
                    z6 z6Var = this.B1;
                    TL_stories.PeerStories y10 = z6Var.y(j10);
                    if (y10 == null) {
                        y10 = z6Var.z(j10);
                        z10 = true;
                    }
                    z6Var.V(y10, z10);
                }
            }
            org.telegram.ui.ActionBar.z0 z0Var = this.f9170b1;
            if (z0Var != null) {
                ViewPropertyAnimator animate = z0Var.animate();
                if (this.B1.M(this.f9201k1) && this.f9250x1.f9072e && !iz.b()) {
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
        td tdVar;
        Canvas canvas2;
        org.telegram.ui.Components.h6 h6Var;
        org.telegram.ui.Components.h6 h6Var2;
        j1();
        if (this.f9207m1 && (h6Var2 = this.f9257z0) != null) {
            h6Var2.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(40.0f));
        }
        if (this.f9207m1 && (h6Var = this.A0) != null) {
            h6Var.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z9 = this.f9177d3;
        LinearLayout linearLayout = this.f9249x0;
        a3 a3Var = this.m0;
        if (z9) {
            float measuredWidth = (a3Var.getMeasuredWidth() / 2.0f) + a3Var.getX() + linearLayout.getX();
            float measuredHeight = (a3Var.getMeasuredHeight() / 2.0f) + a3Var.getY() + linearLayout.getY();
            int L = org.telegram.messenger.g0.L(24.0f);
            float f10 = L / 2.0f;
            float T1 = org.telegram.messenger.g0.T1(this.f9184f3, measuredWidth - f10, wq.f40047g.getInterpolation(this.f9180e3));
            float T12 = org.telegram.messenger.g0.T1(this.f9188g3, measuredHeight - f10, this.f9180e3);
            int W1 = org.telegram.messenger.g0.W1(this.f9180e3, this.f9192h3, L);
            if (this.Y2) {
                org.telegram.ui.Components.h5 h5Var = this.X2;
                if (h5Var != null) {
                    float f11 = W1;
                    h5Var.setBounds((int) T1, (int) T12, (int) (T1 + f11), (int) (T12 + f11));
                    this.X2.draw(canvas);
                }
            } else {
                float f12 = W1;
                ImageReceiver imageReceiver = this.W2;
                imageReceiver.y0(T1, T12, f12, f12);
                imageReceiver.h(canvas, null);
            }
        }
        if (this.Z2) {
            float measuredWidth2 = (a3Var.getMeasuredWidth() / 2.0f) + a3Var.getX() + linearLayout.getX();
            float measuredHeight2 = (a3Var.getMeasuredHeight() / 2.0f) + a3Var.getY() + linearLayout.getY();
            int L2 = org.telegram.messenger.g0.L(120.0f);
            if (!this.Y2) {
                float f13 = L2;
                float f14 = f13 / 2.0f;
                float f15 = measuredWidth2 - f14;
                float f16 = measuredHeight2 - f14;
                ImageReceiver imageReceiver2 = this.U2;
                imageReceiver2.y0(f15, f16, f13, f13);
                imageReceiver2.h(canvas, null);
                if (imageReceiver2.B() != null && imageReceiver2.B().A()) {
                    this.Z2 = false;
                }
            } else {
                ch.d dVar = this.V2;
                if (dVar != null) {
                    float f17 = L2 / 2.0f;
                    dVar.e((int) (measuredWidth2 - f17), (int) (measuredHeight2 - f17), (int) (measuredWidth2 + f17), (int) (measuredHeight2 + f17));
                    this.V2.b(canvas);
                    if (this.V2.c()) {
                        this.V2.d(this);
                        this.V2 = null;
                        this.Z2 = false;
                    }
                } else {
                    this.Z2 = false;
                }
            }
        }
        o2 o2Var = this.K1;
        if (o2Var != null) {
            td tdVar2 = o2Var.f31173y1;
            td tdVar3 = o2Var.f31178z1;
            if (o2Var.getAlpha() != 0.0f && (tdVar = o2Var.f31057e1) != null && tdVar.getParent() != null && o2Var.f31057e1.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(o2Var.f31057e1.getX() + tdVar2.getX() + tdVar3.getX() + o2Var.getX(), o2Var.f31057e1.getY() + tdVar2.getY() + tdVar3.getY() + o2Var.getY());
                if (o2Var.getAlpha() != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, o2Var.getMeasuredWidth(), o2Var.getMeasuredHeight(), (int) (o2Var.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                o2Var.f31057e1.draw(canvas2);
                canvas2.restoreToCount(save);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ii0 ii0Var;
        ii0 ii0Var2;
        ri.f fVar;
        float L;
        float f10;
        if (view == this.M2) {
            canvas.save();
            canvas.clipRect(0.0f, this.M2.getY(), getMeasuredWidth(), this.M2.getY() + this.M2.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        o2 o2Var = this.K1;
        Paint paint = this.W1;
        a3 a3Var = this.m0;
        g4 g4Var = this.f9186g1;
        if (view == o2Var) {
            float f11 = this.Z1;
            int i7 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            h4 h4Var = this.f9250x1;
            if (i7 > 0 && !h4Var.f9073f) {
                g4Var.f9027l.setAlpha((int) (f11 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), g4Var.f9027l);
            }
            RectF rectF = g4Var.h;
            RectF rectF2 = g4Var.f9024i;
            RectF rectF3 = g4Var.f9025j;
            rectF.set(this.K1.getX(), this.K1.getY() + this.K1.getAnimatedTop() + org.telegram.messenger.g0.L(1.33f), this.K1.getX() + this.K1.getMeasuredWidth(), this.K1.getY() + this.K1.getMeasuredHeight());
            float L2 = org.telegram.messenger.g0.L(40.0f);
            if (!h4Var.f9073f) {
                if (this.B2) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
                if (this.C2 && this.f9207m1) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
                if (a3Var != null && a3Var.getVisibility() == 0) {
                    L2 = (L2 - org.telegram.messenger.g0.L(40.0f)) + a3Var.getLayoutParams().width;
                }
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(46.0f);
                L2 = org.telegram.messenger.g0.L(46.0f);
                n1 n1Var = this.J1;
                if (n1Var != null && n1Var.getVisibility() == 0) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
            }
            rectF2.set(org.telegram.messenger.g0.L(10.0f) + L, ((this.K1.getY() + this.K1.getMeasuredHeight()) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(38.0f), (getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f)) - L2, (this.K1.getY() + this.K1.getMeasuredHeight()) - org.telegram.messenger.g0.L(5.0f));
            this.K1.setTranslationX((1.0f - this.Z1) * L);
            if (this.K1.getMeasuredHeight() > org.telegram.messenger.g0.L(50.0f)) {
                f10 = ((1.0f - this.Z1) * (this.K1.getMeasuredHeight() - org.telegram.messenger.g0.L(50.0f))) + 0.0f;
            } else {
                f10 = 0.0f;
            }
            this.K1.getEditField().setTranslationY(com.google.android.recaptcha.internal.a.z(1.0f, this.Z1, -org.telegram.messenger.g0.L(2.0f), f10));
            float L3 = org.telegram.messenger.g0.L(50.0f) / 2.0f;
            org.telegram.messenger.g0.Z1(rectF2, g4Var.h, this.Z1, rectF3);
            fh.g gVar = this.U1;
            if (gVar != null) {
                gVar.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                gVar.r(L3);
                gVar.setAlpha((int) ((1.0f - this.N3) * (1.0f - this.f9168a2) * 255.0f * getHideInterfaceAlpha()));
                gVar.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, L3, L3, paint);
            }
            if (this.Z1 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            }
        } else if (o2Var != null && o2Var.t0(view)) {
            float L4 = org.telegram.messenger.g0.L(30.0f);
            RectF rectF4 = g4Var.f9026k;
            RectF rectF5 = g4Var.f9026k;
            rectF4.set(0.0f, view.getY() + org.telegram.messenger.g0.L(1.0f), getWidth(), org.telegram.messenger.g0.L(20.0f) + getHeight());
            Path path = this.K3;
            path.rewind();
            path.addRoundRect(rectF5, L4, L4, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            fh.g gVar2 = this.V1;
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
            if (view == this.O1 && this.K1 != null) {
                view.setTranslationY(((this.K1.getY() + this.K1.getAnimatedTop()) + (-ii0Var.getMeasuredHeight())) - org.telegram.messenger.g0.L(18.0f));
            } else {
                if (view == this.f9169a3) {
                    view.setTranslationY((this.f9249x0.getY() + (a3Var.getY() + (-(ii0Var2.getMeasuredHeight() - this.f9169a3.getPaddingBottom())))) - org.telegram.messenger.g0.L(18.0f));
                } else {
                    j3 j3Var = this.L0;
                    if (view == j3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (fVar = this.f9224q3) != null && !fVar.f54586r) {
                        RecordingCanvas i10 = fVar.i(getMeasuredWidth(), getMeasuredHeight());
                        i10.drawColor(i0.a.f(0.2f, -16777216, -1));
                        i10.translate(j3Var.getX(), j3Var.getY());
                        view.draw(i10);
                        fVar.j();
                    }
                }
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e1() {
        throw new UnsupportedOperationException("Method not decompiled: di.j4.e1():void");
    }

    public final void f1() {
        int i7;
        if (this.f9218p1) {
            TextView textView = this.Q1;
            if (textView != null) {
                textView.setText(id.M0(2131748823, null));
            }
            TextView textView2 = this.R1;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.Q1;
        if (textView3 != null) {
            if (this.n1) {
                i7 = 2131744665;
            } else {
                i7 = 2131744493;
            }
            textView3.setText(id.M0(i7, null));
        }
        TextView textView4 = this.R1;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.R1.setText(id.M0(2131744492, null));
        }
    }

    public final void g1() {
        TL_stories.PeerStories peerStories;
        int i7;
        ArrayList arrayList = this.f9194i1;
        q9 q9Var = this.f9229s0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.f9182f1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i7 = arrayList2.size();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    long j3 = ((y6) arrayList2.get(i10)).f9963a;
                    if (((int) (j3 ^ (j3 >>> 32))) == q9Var.O0) {
                        this.f9230s1 = i10;
                        return;
                    }
                }
            } else {
                i7 = 0;
            }
            int indexOf = this.f9194i1.indexOf(Integer.valueOf(q9Var.O0));
            if (indexOf < 0 && !this.f9194i1.isEmpty()) {
                if (q9Var.O0 > ((Integer) this.f9194i1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (q9Var.O0 < ((Integer) jg.g.i(1, this.f9194i1)).intValue()) {
                    indexOf = this.f9194i1.size() - 1;
                }
            }
            this.f9230s1 = i7 + indexOf;
        } else {
            int i11 = q9Var.f9609d1.get(this.f9201k1, -1);
            this.f9230s1 = i11;
            if (i11 == -1 && !q9Var.M0 && (peerStories = this.f9176d1) != null && peerStories.max_read_id > 0) {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f9178e1;
                    if (i12 >= arrayList3.size()) {
                        break;
                    } else if (((TL_stories.StoryItem) arrayList3.get(i12)).f27199id > this.f9176d1.max_read_id) {
                        this.f9230s1 = i12;
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        if (this.f9230s1 == -1) {
            this.f9230s1 = 0;
        }
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.f9194i1;
    }

    public long getCurrentPeer() {
        return this.f9201k1;
    }

    public int getListPosition() {
        return this.f9238u1;
    }

    public Bitmap getPlayingBitmap() {
        j3 j3Var = this.L0;
        Bitmap createBitmap = Bitmap.createBitmap(j3Var.getWidth(), j3Var.getHeight(), Bitmap.Config.ARGB_8888);
        C0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.f9230s1;
    }

    public z6 getStoriesController() {
        return qp.s1(this.f9205l2).P1();
    }

    public int getStoriesCount() {
        return Math.max(this.f9208m2, this.f9178e1.size()) + this.f9182f1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f9178e1;
    }

    public final void h1() {
        r6 r6Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f9178e1;
        arrayList.clear();
        q9 q9Var = this.f9229s0;
        if (q9Var.M0) {
            if (!q9Var.R0) {
                arrayList.add(q9Var.S0);
            }
        } else {
            ArrayList arrayList2 = this.f9194i1;
            int i7 = 0;
            ArrayList arrayList3 = this.f9182f1;
            if (arrayList2 != null && (r6Var = q9Var.N0) != null) {
                if (r6Var instanceof k6) {
                    arrayList3.clear();
                    ArrayList F = qp.s1(this.f9205l2).P1().F(this.f9201k1);
                    String str = ((k6) q9Var.N0).E;
                    if (F != null) {
                        for (int i10 = 0; i10 < F.size(); i10++) {
                            y6 y6Var = (y6) F.get(i10);
                            fi.e7 e7Var = y6Var.f9965c;
                            if (e7Var != null && !e7Var.f11896g && TextUtils.equals(e7Var.K0, str)) {
                                arrayList3.add(y6Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.f9194i1;
                int size = arrayList4.size();
                while (i7 < size) {
                    Object obj = arrayList4.get(i7);
                    i7++;
                    ij f10 = q9Var.N0.f(((Integer) obj).intValue());
                    if (f10 != null && (storyItem = f10.f23270l) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (q9Var.N0 != null) {
                while (i7 < q9Var.N0.f9699i.size()) {
                    arrayList.add(((ij) q9Var.N0.f9699i.get(i7)).f23270l);
                    i7++;
                }
            } else {
                TL_stories.PeerStories peerStories = q9Var.P0;
                if (peerStories != null && org.telegram.messenger.m5.o(peerStories.peer) == this.f9201k1) {
                    this.f9176d1 = q9Var.P0;
                } else {
                    TL_stories.PeerStories y10 = this.B1.y(this.f9201k1);
                    this.f9176d1 = y10;
                    if (y10 == null) {
                        this.f9176d1 = this.B1.z(this.f9201k1);
                    }
                }
                this.f9208m2 = 0;
                TL_stories.PeerStories peerStories2 = this.f9176d1;
                if (peerStories2 != null) {
                    this.f9208m2 = peerStories2.stories.size();
                    arrayList.addAll(this.f9176d1.stories);
                }
                arrayList3.clear();
                ArrayList F2 = this.B1.F(this.f9201k1);
                if (F2 != null) {
                    arrayList3.addAll(F2);
                }
            }
        }
        this.f9198j1 = getStoriesCount();
    }

    public final void i0(boolean z9) {
        j4 currentPeerView;
        o40 o40Var = this.f9231s2;
        if (o40Var != null) {
            o40Var.f36483e0 = null;
            o40Var.a(false);
        }
        long j3 = this.f9201k1;
        TL_stories.StoryItem storyItem = this.f9250x1.f9069a;
        q9 q9Var = this.f9229s0;
        q9Var.getClass();
        if (j3 != 0 && storyItem != null) {
            q9.D1.remove(j3 + (j3 >> 16) + (storyItem.f27199id << 16));
        }
        this.R2 = true;
        g9 g9Var = q9Var.f9629n0;
        if (g9Var != null && (currentPeerView = g9Var.getCurrentPeerView()) != null) {
            currentPeerView.q0();
        }
        if (z9) {
            bc J = new gc(this.L0, this.f9200k0).J(2131624028, id.M0(2131748483, null), id.M0(2131743552, null), 5000, false, new w1(this, 2));
            J.f32211r = false;
            J.k(false);
        }
        qp.s1(this.f9205l2).s0(this.f9201k1, 0, null);
    }

    public final void i1(boolean z9) {
        String M0;
        int i7;
        String M02;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        int i10;
        boolean z11;
        h4 h4Var = this.f9250x1;
        TL_stories.StoryItem storyItem = h4Var.f9069a;
        if (storyItem == null) {
            storyItem = h4Var.f9071c;
        }
        boolean z12 = this.f9207m1;
        if (z12 || this.l1) {
            if (storyItem != null) {
                q9 q9Var = this.f9229s0;
                a3 a3Var = this.m0;
                if (z12) {
                    if (storyItem.views == null) {
                        storyItem.views = new TL_stories.TL_storyViews();
                    }
                    TL_stories.StoryViews storyViews = storyItem.views;
                    if (storyViews.views_count <= 0) {
                        storyViews.views_count = 1;
                    }
                    org.telegram.ui.Components.h6 h6Var = this.A0;
                    if (h6Var != null && (i10 = storyViews.forwards_count) > 0) {
                        String num = Integer.toString(i10);
                        if (z9 && this.E0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        h6Var.t(num, z11, true);
                        this.E0 = true;
                    } else {
                        this.E0 = false;
                    }
                    int i11 = storyItem.views.reactions_count;
                    if (i11 > 0) {
                        org.telegram.ui.Components.h6 h6Var2 = this.f9257z0;
                        String num2 = Integer.toString(i11);
                        if (z9 && this.D0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        h6Var2.t(num2, z10, true);
                        this.D0 = true;
                    } else {
                        this.D0 = false;
                    }
                    if (!z9) {
                        org.telegram.ui.Components.v5 v5Var = this.B0;
                        if (this.D0) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        v5Var.e(true, f12);
                        org.telegram.ui.Components.v5 v5Var2 = this.C0;
                        if (v5Var2 != null) {
                            if (this.E0) {
                                f13 = 1.0f;
                            } else {
                                f13 = 0.0f;
                            }
                            v5Var2.e(true, f13);
                        }
                    }
                    TLRPC.Chat M03 = qp.s1(this.f9205l2).M0(Long.valueOf(-this.f9201k1));
                    if ((!this.n1 || (!org.telegram.messenger.t3.q(M03) && !org.telegram.messenger.t3.s0(M03))) && storyItem.views.views_count > 0) {
                        TextView textView = this.f9199j2;
                        if (q9Var.N0 == null) {
                            M02 = id.M0(2131748123, null);
                        } else {
                            M02 = id.M0(2131748122, null);
                        }
                        textView.setText(M02);
                        this.f9199j2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "d  ");
                        spannableStringBuilder.setSpan(new wp(2131231185, 0), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.o0(storyItem.views.views_count, 0));
                        this.f9199j2.setText(spannableStringBuilder);
                    } else {
                        this.f9199j2.setText("");
                    }
                    ViewGroup.LayoutParams layoutParams = a3Var.getLayoutParams();
                    float L = org.telegram.messenger.g0.L(40.0f);
                    if (this.D0) {
                        f10 = this.f9257z0.d + org.telegram.messenger.g0.L(4.0f);
                    } else {
                        f10 = 0.0f;
                    }
                    layoutParams.width = (int) (L + f10);
                    ((ViewGroup.MarginLayoutParams) this.F1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(40.0f) + a3Var.getLayoutParams().width;
                    a3 a3Var2 = this.f9253y0;
                    if (a3Var2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = a3Var2.getLayoutParams();
                        float L2 = org.telegram.messenger.g0.L(40.0f);
                        if (this.E0) {
                            f11 = org.telegram.messenger.g0.L(4.0f) + this.A0.d;
                        } else {
                            f11 = 0.0f;
                        }
                        layoutParams2.width = (int) (L2 + f11);
                        ((ViewGroup.MarginLayoutParams) this.F1.getLayoutParams()).rightMargin += a3Var2.getLayoutParams().width;
                        a3Var2.requestLayout();
                    }
                    this.F1.requestLayout();
                    a3Var.requestLayout();
                    this.f9202k2.setVisibility(8);
                    this.f9215o2.setVisibility(8);
                    TL_stories.StoryItem storyItem2 = h4Var.f9069a;
                    f3 f3Var = this.S0;
                    if (storyItem2 == null) {
                        f3Var.getClass();
                        return;
                    }
                    for (int i12 = 0; i12 < f3Var.getChildCount(); i12++) {
                        if (f3Var.getChildAt(i12) instanceof x8) {
                            ((x8) f3Var.getChildAt(i12)).c(storyItem2.views, z9);
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
                            TLObject e22 = qp.s1(this.f9205l2).e2(storyItem.views.recent_viewers.get(i14).longValue());
                            if (e22 != null) {
                                this.f9202k2.b(i15, this.f9205l2, e22);
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
                        this.f9202k2.b(i16, this.f9205l2, null);
                    }
                    this.f9202k2.a(false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(id.H(',', "Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        wp wpVar = new wp(2131231980, 0);
                        wpVar.f40042y = -53704;
                        wpVar.f40037n = org.telegram.messenger.g0.L(0.2f);
                        spannableStringBuilder2.setSpan(wpVar, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        wp wpVar2 = new wp(2131231971, 0);
                        wpVar2.f40042y = -14161823;
                        wpVar2.f40037n = org.telegram.messenger.g0.L(0.2f);
                        spannableStringBuilder2.setSpan(wpVar2, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.f9199j2.setText(spannableStringBuilder2);
                    if (i15 == 0) {
                        this.f9202k2.setVisibility(8);
                        this.f9199j2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                    } else {
                        this.f9202k2.setVisibility(0);
                        this.f9199j2.setTranslationX(org.telegram.messenger.g0.L(10.0f) + com.google.android.recaptcha.internal.a.e(i15, 1, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + org.telegram.messenger.g0.L(13.0f)));
                    }
                    this.f9215o2.setVisibility(0);
                } else {
                    TextView textView2 = this.f9199j2;
                    if (q9Var.N0 == null) {
                        M0 = id.M0(2131748123, null);
                    } else {
                        M0 = id.M0(2131748122, null);
                    }
                    textView2.setText(M0);
                    this.f9199j2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                    this.f9202k2.setVisibility(8);
                    this.f9215o2.setVisibility(8);
                }
                a3Var.getLayoutParams().width = org.telegram.messenger.g0.L(40.0f);
                this.f9249x0.requestLayout();
                return;
            }
            this.f9199j2.setText("");
            this.f9215o2.setVisibility(8);
            this.f9202k2.setVisibility(8);
        }
    }

    public final void j0() {
        e7 e7Var = this.f9210n0;
        e7Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new l2(0, e7Var)).setDuration(150L).start();
        int L = org.telegram.messenger.g0.L(8.0f);
        e7 e7Var2 = new e7(getContext(), this.f9186g1);
        this.f9210n0 = e7Var2;
        e7Var2.setPadding(L, L, L, L);
        this.f9210n0.setAlpha(0.0f);
        this.f9210n0.setScaleX(0.8f);
        this.f9210n0.setScaleY(0.8f);
        this.f9210n0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.m0.addView(this.f9210n0, ha.e(40, 40, 3));
        this.Z2 = false;
    }

    public final void j1() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z9;
        o2 o2Var;
        float heightWithTopView;
        float f15;
        float f16;
        float f17;
        float L;
        int i7;
        float f18;
        float f19;
        int i10;
        a3 a3Var;
        ImageView imageView;
        n3 n3Var;
        a3 a3Var2;
        boolean z10;
        float f20;
        ii0 ii0Var;
        float f21;
        int i11;
        float f22;
        float f23;
        float f24 = ((h9) this.f9258z1).d.V;
        if (this.f9239u2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.v5 v5Var = this.f9251x2;
        v5Var.e(false, f10);
        int i12 = this.f9174c2;
        if (i12 != 0 && this.d2) {
            f11 = c8.j9.a(this.f9223q2 / i12, 0.0f, 1.0f);
        } else if (this.f9179e2) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        org.telegram.ui.Components.v5 v5Var2 = this.G3;
        float f25 = v5Var2.f38854c;
        org.telegram.ui.Components.v5 v5Var3 = this.H3;
        float f26 = v5Var3.f38854c;
        org.telegram.ui.Components.v5 v5Var4 = this.I3;
        float f27 = v5Var4.f38854c;
        if (this.f9219p2) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        v5Var2.e(false, f12);
        if (!this.R2) {
            o2 o2Var2 = this.K1;
            if (o2Var2 != null && !TextUtils.isEmpty(o2Var2.getFieldText())) {
                f23 = 1.0f;
            } else {
                f23 = 0.0f;
            }
            v5Var3.e(false, f23);
        }
        o2 o2Var3 = this.K1;
        if (o2Var3 != null && o2Var3.f31180z3) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        v5Var4.e(false, f13);
        final o2 o2Var4 = this.K1;
        if (o2Var4 != null) {
            j4 j4Var = o2Var4.f9434x5;
            f14 = 1.0f;
            int backgroundTop = o2Var4.getBackgroundTop();
            int i13 = o2Var4.f9431u5;
            if (i13 != 0 && backgroundTop != i13) {
                int i14 = (o2Var4.T1 + i13) - backgroundTop;
                o2Var4.setAnimatedTop(i14);
                j4Var.E2 = true;
                ValueAnimator valueAnimator = j4Var.N1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    j4Var.N1.cancel();
                }
                View view = o2Var4.G1;
                if (view != null && view.getVisibility() == 0) {
                    o2Var4.G1.setTranslationY(((1.0f - o2Var4.getTopViewEnterProgress()) * o2Var4.G1.getLayoutParams().height) + o2Var4.T1);
                }
                j4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i14, 0.0f);
                j4Var.N1 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                o2 o2Var5 = o2Var4;
                                o2Var5.getClass();
                                o2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                j4 j4Var2 = o2Var5.f9434x5;
                                j4Var2.E2 = true;
                                j4Var2.invalidate();
                                o2Var5.invalidate();
                                return;
                            default:
                                o2Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                j4Var.N1.addListener(new bi.t5(o2Var4, 9));
                j4Var.N1.setDuration(250L);
                j4Var.N1.setInterpolator(mi.l.V);
                j4Var.N1.start();
                o2Var4.f9431u5 = 0;
            }
            if (o2Var4.f31111n3) {
                float scrollY = (o2Var4.f9433w5 - o2Var4.E0.getScrollY()) + (o2Var4.f9432v5 - o2Var4.E0.getMeasuredHeight());
                we weVar = o2Var4.E0;
                weVar.setOffsetY(weVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(o2Var4.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                o2 o2Var5 = o2Var4;
                                o2Var5.getClass();
                                o2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                j4 j4Var2 = o2Var5.f9434x5;
                                j4Var2.E2 = true;
                                j4Var2.invalidate();
                                o2Var5.invalidate();
                                return;
                            default:
                                o2Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = o2Var4.f9430t5;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                o2Var4.f9430t5 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(mi.l.V);
                ofFloat2.start();
                o2Var4.f31111n3 = false;
                j4Var.j1();
            }
            o2Var4.getMeasuredHeight();
        } else {
            f14 = 1.0f;
        }
        o2 o2Var5 = this.K1;
        if (o2Var5 != null && o2Var5.s0()) {
            z9 = true;
        } else {
            z9 = false;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        boolean z11 = this.f9187g2;
        Paint paint = this.W1;
        if (z11) {
            paint.setColor(i0.a.f(this.Z1, -14933463, org.telegram.ui.ActionBar.m6.r1(0.44f, -16777216)));
            float f28 = f14;
            paint.setAlpha((int) ((f28 - this.N3) * org.telegram.messenger.k5.A(f28, this.f9168a2, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(i0.a.o(-16777216, (int) ((f14 - this.N3) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z12 = this.E2;
        q9 q9Var = this.f9229s0;
        if (z12 || this.J3 != q9Var.f9608d0 || v5Var.f38854c != this.f9259z2 || this.f9171b2 != this.f9223q2 || f11 != this.Z1 || f24 != this.f9168a2 || f25 != v5Var2.f38854c || z9 || f27 != v5Var4.f38854c || f26 != v5Var3.f38854c) {
            this.E2 = false;
            this.f9171b2 = this.f9223q2;
            int i15 = (v5Var.f38854c > this.f9259z2 ? 1 : (v5Var.f38854c == this.f9259z2 ? 0 : -1));
            j3 j3Var = this.L0;
            if (i15 != 0) {
                j3Var.invalidate();
            }
            if (f24 != 0.0f) {
                j3Var.setLayerType(2, null);
            } else {
                j3Var.setLayerType(0, null);
            }
            this.f9259z2 = v5Var.f38854c;
            this.f9168a2 = f24;
            this.Z1 = f11;
            this.J3 = q9Var.f9608d0;
            float height = this.f9223q2 - (getHeight() - j3Var.getBottom());
            if (this.K1 == null) {
                heightWithTopView = 0.0f;
            } else {
                heightWithTopView = o2Var.getHeightWithTopView() * f11;
            }
            float max = Math.max(0.0f, height + heightWithTopView);
            float height2 = this.X1 - (getHeight() - j3Var.getBottom());
            o2 o2Var6 = this.K1;
            if (o2Var6 == null) {
                f16 = 0.0f;
            } else {
                float heightWithTopView2 = o2Var6.getHeightWithTopView();
                if (this.f9179e2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                f16 = heightWithTopView2 * f15;
            }
            float max2 = Math.max(0.0f, height2 + f16);
            o2 o2Var7 = this.K1;
            if (o2Var7 != null) {
                if (this.M1 != null) {
                    ImageView suggestButton = o2Var7.getSuggestButton();
                    if (suggestButton != null) {
                        this.M1.p(1.0f, -(org.telegram.messenger.g0.L(74.0f) - suggestButton.getTranslationX()));
                    }
                    this.M1.setTranslationY(-((getHeight() - this.K1.getY()) + org.telegram.messenger.g0.L(6.0f)));
                }
                ys editField = this.K1.getEditField();
                cn0 senderSelectView = this.K1.getSenderSelectView();
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
            if (this.f9187g2) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(58.0f) * (1.0f - f11);
            }
            float max3 = Math.max(0.0f, L + max);
            if (!this.f9187g2 && !this.f9179e2) {
                i7 = org.telegram.messenger.g0.L(58.0f);
            } else {
                i7 = 0;
            }
            float max4 = Math.max(0.0f, max2 + i7);
            float L2 = (org.telegram.messenger.g0.L(f17) * f11) + max3;
            g2 g2Var = this.f9237u0;
            bi.q1 q1Var = g2Var.f9810c;
            g2Var.K = L2;
            if (Math.abs(g2Var.L - max4) > 0.1f) {
                g2Var.L = max4;
                f18 = 0.8f;
                i10 = 0;
                f19 = 8.0f;
                q1Var.setPadding(org.telegram.messenger.g0.L(8.0f), Math.max(0, ((int) max4) - q1Var.getTop()) + org.telegram.messenger.g0.L(7.5f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.5f));
                if (!q1Var.canScrollVertically(1)) {
                    g2Var.d.h1(0, org.telegram.messenger.g0.L(100.0f));
                }
            } else {
                f18 = 0.8f;
                f19 = 8.0f;
                i10 = 0;
            }
            g2Var.setTranslationY(-g2Var.K);
            g2Var.invalidate();
            fi.s3 s3Var = q9Var.D0;
            if (s3Var != null) {
                s3Var.setKeyboardOffset(max);
            }
            ii0 ii0Var2 = this.O1;
            h4 h4Var = this.f9250x1;
            if (ii0Var2 != null) {
                if (this.Z1 > 0.0f && (h4Var == null || !h4Var.f9073f)) {
                    i11 = i10;
                } else {
                    i11 = 8;
                }
                ii0Var2.setVisibility(i11);
            }
            int i16 = i10;
            while (true) {
                int childCount = getChildCount();
                a3Var = this.f9253y0;
                imageView = this.f9245w0;
                n3Var = this.f9233t0;
                a3Var2 = this.m0;
                if (i16 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i16);
                if (childAt.getVisibility() == 0 && childAt != this.F1 && childAt.getTag(2131296591) == null && childAt != n3Var.W.n(getContext())) {
                    o2 o2Var8 = this.K1;
                    if (o2Var8 != null && childAt == o2Var8.getEmojiView()) {
                        childAt.setTranslationY(this.K1.getEmojiView().getMeasuredHeight() - this.f9223q2);
                    } else if (childAt instanceof y20) {
                        y20 y20Var = (y20) childAt;
                        View view2 = y20Var.f40468c;
                        if (view2 != null) {
                            y20Var.d(view2);
                        }
                    } else if (childAt != this.f9231s2 && childAt != j3Var && childAt != imageView && childAt != this.f9249x0 && childAt != a3Var && childAt != this.F2 && childAt != this.M1 && childAt != a3Var2 && ((ii0Var = this.f9169a3) == null || ii0Var.getReactionsWindow() == null || childAt != this.f9169a3.getReactionsWindow().f6188c)) {
                        float f29 = this.Z1;
                        f29 = (childAt == this.G1 || childAt == this.I1 || childAt == this.J1 || childAt == this.H1) ? 0.0f : 0.0f;
                        float f30 = 1.0f - f29;
                        float L3 = (((((-this.f9235t2) * f30) - (org.telegram.messenger.g0.L(7.0f) * f29)) - this.f9223q2) - (org.telegram.messenger.g0.L(f19) * f30)) - (org.telegram.messenger.g0.L(20.0f) * q9Var.f9608d0);
                        if (childAt == this.G1 || childAt == this.I1 || childAt == this.J1 || childAt == this.H1) {
                            L3 += this.f9223q2;
                        }
                        if (this.f9187g2) {
                            f21 = (1.0f - this.f9168a2) * hideInterfaceAlpha;
                        } else {
                            f21 = hideInterfaceAlpha * 1.0f;
                        }
                        if (childAt == this.K2) {
                            L3 = q9Var.f9608d0 * (-org.telegram.messenger.g0.L(20.0f));
                        }
                        if (childAt == this.M2) {
                            L3 -= this.K1.getMeasuredHeight() - this.K1.getAnimatedTop();
                            f21 = this.Z1;
                            childAt.invalidate();
                        }
                        if (childAt == this.L1) {
                            L3 -= this.K1.getMeasuredHeight() - this.K1.getAnimatedTop();
                            f21 *= this.Z1;
                        }
                        if (childAt == this.O1) {
                            float f31 = (1.0f - v5Var3.f38854c) * (1.0f - f27) * (1.0f - v5Var2.f38854c) * this.Z1;
                            float f32 = f21 * f31 * 1.0f;
                            if (childAt.getAlpha() != 0.0f && f32 == 0.0f) {
                                this.O1.n();
                            }
                            childAt.setAlpha(f32);
                            float f33 = (f31 * 0.2f) + f18;
                            childAt.setScaleX(f33);
                            childAt.setScaleY(f33);
                        } else {
                            childAt.setTranslationY(L3);
                            o2 o2Var9 = this.K1;
                            if (o2Var9 == null || childAt != o2Var9.O1) {
                                childAt.setAlpha(f21);
                            }
                        }
                    }
                } else if (childAt == this.F1) {
                    if (this.f9187g2) {
                        childAt.setAlpha((1.0f - this.N3) * (1.0f - this.f9168a2) * hideInterfaceAlpha);
                    } else {
                        childAt.setAlpha((1.0f - this.N3) * hideInterfaceAlpha);
                    }
                    i16++;
                }
                i16++;
            }
            float f34 = 0.0f;
            float f35 = (1.0f - f24) * hideInterfaceAlpha;
            imageView.setAlpha((1.0f - this.N3) * f35);
            a3Var2.setAlpha((1.0f - this.N3) * f35);
            if (a3Var != null) {
                a3Var.setAlpha((1.0f - this.N3) * f35);
            }
            for (int i17 = 0; i17 < j3Var.getChildCount(); i17++) {
                View childAt2 = j3Var.getChildAt(i17);
                if (childAt2 != null && childAt2 != this.f9241v0) {
                    f4 f4Var = this.X0;
                    b4 b4Var = this.f9189h0;
                    if (childAt2 != f4Var && childAt2 != this.f9181f0 && childAt2 != this.f9185g0 && childAt2 != b4Var && childAt2 != this.F1 && childAt2 != n3Var && childAt2 != this.f9204l0) {
                        childAt2.setAlpha(hideInterfaceAlpha);
                    } else {
                        if (childAt2 == b4Var) {
                            f20 = this.N2;
                        } else {
                            f20 = 1.0f;
                        }
                        if (childAt2 == n3Var) {
                            childAt2.setAlpha((1.0f - this.N3) * f20 * hideInterfaceAlpha);
                        } else {
                            childAt2.setAlpha((1.0f - this.N3) * f20 * hideInterfaceAlpha);
                        }
                    }
                }
            }
            if (this.K1 != null) {
                float L4 = org.telegram.messenger.g0.L(40.0f);
                if (!h4Var.f9073f) {
                    if (this.B2) {
                        L4 += org.telegram.messenger.g0.L(46.0f);
                    }
                    if (this.C2 && this.f9207m1) {
                        L4 += org.telegram.messenger.g0.L(46.0f);
                    }
                    if (a3Var2.getVisibility() == 0) {
                        L4 = (L4 - org.telegram.messenger.g0.L(40.0f)) + a3Var2.getLayoutParams().width;
                    }
                } else {
                    float L5 = org.telegram.messenger.g0.L(46.0f);
                    L4 = org.telegram.messenger.g0.L(46.0f);
                    n1 n1Var = this.J1;
                    if (n1Var != null && n1Var.getVisibility() == 0) {
                        L4 += org.telegram.messenger.g0.L(46.0f);
                    }
                    f34 = L5;
                }
                o2 o2Var10 = this.K1;
                float f36 = -org.telegram.messenger.g0.L(10.0f);
                float f37 = -(org.telegram.messenger.g0.L(10.0f) + L4 + f34);
                float f38 = this.Z1;
                if ((this.B2 || this.n1) && !h4Var.f9073f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o2Var10.h1(f36, f37, f38, z10);
                if (this.K1.getEmojiView() != null) {
                    this.K1.getEmojiView().setAlpha(this.Z1);
                }
            }
        }
    }

    public final void k0(boolean z9) {
        float f10;
        ValueAnimator valueAnimator = this.M3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.N3;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.M3 = ofFloat;
        ofFloat.addUpdateListener(new x1(this, 2));
        this.M3.addListener(new j2(this, z9, 1));
        this.M3.setDuration(420L);
        this.M3.setInterpolator(wq.h);
        this.M3.start();
    }

    public final void l0(Runnable runnable) {
        if (qp.s1(this.f9205l2).v2()) {
            org.telegram.ui.b.b(this.f9205l2);
            return;
        }
        int i7 = iz.f23401e0;
        if (i7 > 0 && this.T2) {
            int i10 = i7 - 1;
            iz.f23401e0 = i10;
            iz.T(i10);
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(0, getContext(), this.f9200k0);
            u1Var.setTitle(id.M0(2131744885, null));
            u1Var.n(id.M0(2131744886, null));
            String M0 = id.M0(2131746743, null);
            ba.b bVar = new ba.b(runnable);
            u1Var.f28562l0 = M0;
            u1Var.m0 = bVar;
            String M02 = id.M0(2131752589, null);
            a1 a1Var = new a1(1);
            u1Var.f28564n0 = M02;
            u1Var.f28565o0 = a1Var;
            u1Var.show();
            return;
        }
        runnable.run();
    }

    public final void m0(int i7) {
        boolean z9;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        this.f9211n2 = false;
        this.E2 = true;
        this.f9203k3 = false;
        this.f9207m1 = false;
        this.n1 = false;
        long j3 = this.f9201k1;
        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        f4 f4Var = this.X0;
        org.telegram.ui.Components.v8 v8Var = this.W0;
        if (i12 >= 0) {
            if (j3 == p10.i(this.f9205l2).e()) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.l1 = z13;
            TLRPC.User a22 = qp.s1(this.f9205l2).a2(Long.valueOf(this.f9201k1));
            TL_account.RequirementToContact J2 = qp.s1(this.f9205l2).J2(this.f9201k1);
            if (!p10.i(this.f9205l2).q() && (J2 instanceof TL_account.requirementToContactPremium)) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f9214o1 = z14;
            this.f9222q1 = org.telegram.messenger.m5.k(J2);
            v8Var.r(a22);
            f4Var.f8990a.getImageReceiver().i0(a22, v8Var, null);
            U0(this.f9201k1, true, false);
        } else {
            this.l1 = false;
            this.f9207m1 = true;
            if (!this.B1.h(j3)) {
                boolean z15 = org.telegram.messenger.r2.f25216a;
            } else {
                this.f9203k3 = true;
            }
            TLRPC.Chat M0 = qp.s1(this.f9205l2).M0(Long.valueOf(-this.f9201k1));
            boolean V = org.telegram.messenger.t3.V(M0);
            this.n1 = !V;
            if (!V && qp.s1(this.f9205l2).N0(-this.f9201k1) == null) {
                yr.a0(this.f9205l2).F0(-this.f9201k1, true, new CountDownLatch(1), false, false, 0);
            }
            if (this.n1 && !org.telegram.messenger.t3.q(M0)) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f9214o1 = z9;
            this.f9222q1 = qp.s1(this.f9205l2).N1(this.f9201k1);
            v8Var.q(M0);
            f4Var.f8990a.getImageReceiver().i0(M0, v8Var, null);
            U0(this.f9201k1, true, false);
        }
        if (this.f9234t1 && (this.l1 || this.f9207m1)) {
            z6 z6Var = this.B1;
            long j10 = this.f9201k1;
            a0.h hVar = z6Var.f10007m;
            z9 z9Var = (z9) hVar.f(j10);
            if (z9Var == null) {
                z9Var = new z9(z6Var.f9997a, j10, z6Var);
                hVar.k(z9Var, j10);
            }
            z9Var.b(true);
        }
        h1();
        this.f9230s1 = i7;
        if (i7 < 0) {
            this.f9230s1 = 0;
        }
        this.F0 = 0L;
        this.H0 = false;
        this.f9232s3 = null;
        this.f9236t3 = null;
        boolean z16 = this.f9207m1;
        j3 j3Var = this.L0;
        q9 q9Var = this.f9229s0;
        int i13 = 8;
        h4 h4Var = this.f9250x1;
        if (z16) {
            z0();
            if (this.K1 == null && (this.n1 || h4Var.f9073f)) {
                t0();
            }
            if (this.K1 != null) {
                TLRPC.Chat M02 = qp.s1(this.f9205l2).M0(Long.valueOf(-this.f9201k1));
                o2 o2Var = this.K1;
                if (h4Var.f9073f || (!G0() && this.n1 && (org.telegram.messenger.t3.q(M02) || org.telegram.messenger.t3.s0(M02)))) {
                    i13 = 0;
                }
                o2Var.setVisibility(i13);
                o2 o2Var2 = this.K1;
                boolean z17 = h4Var.f9073f;
                B0(true);
                o2Var2.i1(z17);
                o2 o2Var3 = this.K1;
                if (h4Var.f9073f && !B0(true) && (this.f9179e2 || this.K1.W0)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                o2Var3.o1(z12, true);
                ys editField = this.K1.getEditField();
                long j11 = this.f9201k1;
                TL_stories.StoryItem storyItem = h4Var.f9069a;
                q9Var.getClass();
                editField.setText(q9.A(j11, storyItem));
                this.K1.b1(this.f9205l2, this.f9201k1);
                this.K1.M1(M02, null);
            }
            org.telegram.ui.Components.h6 h6Var = this.f9257z0;
            org.telegram.ui.ActionBar.h6 h6Var2 = this.f9200k0;
            if (h6Var == null) {
                org.telegram.ui.Components.h6 h6Var3 = new org.telegram.ui.Components.h6(false, false, false);
                this.f9257z0 = h6Var3;
                a3 a3Var = this.m0;
                h6Var3.setCallback(a3Var);
                this.f9257z0.u(h6Var2.h(org.telegram.ui.ActionBar.m6.G6));
                this.f9257z0.w(org.telegram.messenger.g0.L(14.0f));
                this.B0 = new org.telegram.ui.Components.v5(a3Var);
            }
            a3 a3Var2 = this.f9253y0;
            if (a3Var2 != null && this.A0 == null) {
                org.telegram.ui.Components.h6 h6Var4 = new org.telegram.ui.Components.h6(false, false, false);
                this.A0 = h6Var4;
                h6Var4.setCallback(a3Var2);
                this.A0.u(h6Var2.h(org.telegram.ui.ActionBar.m6.G6));
                this.A0.w(org.telegram.messenger.g0.L(14.0f));
                this.C0 = new org.telegram.ui.Components.v5(a3Var2);
            }
            if (i7 == -1) {
                g1();
            }
            d1(false);
            this.f9198j1 = getStoriesCount();
            j3Var.invalidate();
            invalidate();
        } else if (this.l1) {
            z0();
            if (h4Var.f9073f) {
                this.F1.setVisibility(8);
                if (this.K1 == null) {
                    t0();
                }
                this.K1.setVisibility(0);
            } else {
                this.F1.setVisibility(0);
                o2 o2Var4 = this.K1;
                if (o2Var4 != null) {
                    o2Var4.setVisibility(8);
                }
            }
            o2 o2Var5 = this.K1;
            if (o2Var5 != null) {
                boolean z18 = h4Var.f9073f;
                B0(true);
                o2Var5.i1(z18);
                o2 o2Var6 = this.K1;
                if (h4Var.f9073f && !B0(true) && (this.f9179e2 || this.K1.W0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                o2Var6.o1(z11, true);
            }
            if (i7 == -1) {
                ArrayList arrayList = this.f9194i1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(q9Var.O0));
                    if (indexOf < 0 && !this.f9194i1.isEmpty()) {
                        if (q9Var.O0 > ((Integer) this.f9194i1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (q9Var.O0 < ((Integer) jg.g.i(1, this.f9194i1)).intValue()) {
                            indexOf = this.f9194i1.size() - 1;
                        }
                    }
                    this.f9230s1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.f9182f1.isEmpty();
                    ArrayList arrayList2 = this.f9178e1;
                    if (!isEmpty) {
                        this.f9230s1 = arrayList2.size();
                    } else {
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i14)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i14)).f27199id > this.B1.f10001f.get(this.f9201k1)) {
                                this.f9230s1 = i14;
                                break;
                            }
                        }
                    }
                }
            }
            d1(false);
            j3Var.invalidate();
            invalidate();
        } else {
            if (this.K1 == null) {
                t0();
            }
            if (this.f9214o1 && this.P1 == null) {
                x0();
            }
            if (this.P1 != null) {
                if (this.f9214o1 || this.f9218p1) {
                    f1();
                }
                LinearLayout linearLayout = this.P1;
                if ((this.f9214o1 && !h4Var.f9073f) || this.f9218p1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                linearLayout.setVisibility(i11);
            }
            o8 o8Var = this.S1;
            if (o8Var != null) {
                o8Var.setVisibility(8);
            }
            if (i7 == -1) {
                g1();
            }
            d1(false);
            o2 o2Var7 = this.K1;
            if (o2Var7 != null) {
                if (!G0() && !t10.A(this.f9201k1)) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                o2Var7.setVisibility(i10);
                o2 o2Var8 = this.K1;
                boolean z19 = h4Var.f9073f;
                B0(true);
                o2Var8.i1(z19);
                o2 o2Var9 = this.K1;
                if (h4Var.f9073f && !B0(true) && (this.f9179e2 || this.K1.W0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o2Var9.o1(z10, true);
                ys editField2 = this.K1.getEditField();
                long j12 = this.f9201k1;
                TL_stories.StoryItem storyItem2 = h4Var.f9069a;
                q9Var.getClass();
                editField2.setText(q9.A(j12, storyItem2));
                this.K1.b1(this.f9205l2, this.f9201k1);
                TLRPC.UserFull b22 = qp.s1(this.f9205l2).b2(this.f9201k1);
                if (b22 != null) {
                    this.K1.M1(null, b22);
                } else {
                    qp.s1(this.f9205l2).W2(qp.s1(this.f9205l2).a2(Long.valueOf(this.f9201k1)), this.f9195i2, false, null);
                }
            }
            this.f9198j1 = getStoriesCount();
            a3 a3Var3 = this.F1;
            if (a3Var3 != null) {
                a3Var3.setVisibility(8);
            }
            j3Var.invalidate();
            invalidate();
        }
        p0(false);
    }

    public final void n0() {
        n3 n3Var = this.f9233t0;
        if (n3Var.W.x()) {
            n3Var.W.f(false);
        }
    }

    public final void o0() {
        if (this.f9234t1) {
            ((h9) this.f9258z1).d.V();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J0 = true;
        this.N0.P();
        this.P0.P();
        this.O0.P();
        this.U2.P();
        this.W2.P();
        o2 o2Var = this.K1;
        if (o2Var != null) {
            o2Var.E0();
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q0;
            if (i7 < arrayList.size()) {
                ((ch.f0) arrayList.get(i7)).b(true);
                i7++;
            } else {
                qs.f(this.f9205l2).c(this, qs.T);
                qs.f(this.f9205l2).c(this, qs.G2);
                qs.f(this.f9205l2).c(this, qs.f25099v5);
                qs.f(this.f9205l2).c(this, qs.f25042m3);
                qs.f(this.f9205l2).c(this, qs.f25113x5);
                qs.f(this.f9205l2).c(this, qs.D5);
                qs.f(this.f9205l2).c(this, qs.f24980b3);
                qs.f(this.f9205l2).c(this, qs.f25021i3);
                qs.f(this.f9205l2).c(this, qs.F);
                qs.e().c(this, qs.f25022i4);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J0 = false;
        this.N0.R();
        this.P0.R();
        this.O0.R();
        this.U2.R();
        this.W2.R();
        o2 o2Var = this.K1;
        if (o2Var != null) {
            o2Var.D0();
        }
        org.telegram.ui.Components.h5 h5Var = this.X2;
        if (h5Var != null) {
            h5Var.n(this);
            this.X2 = null;
        }
        ch.d dVar = this.V2;
        if (dVar != null) {
            dVar.d(this);
            this.V2 = null;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q0;
            if (i7 < arrayList.size()) {
                ((ch.f0) arrayList.get(i7)).b(false);
                i7++;
            } else {
                qs.f(this.f9205l2).n(this, qs.T);
                qs.f(this.f9205l2).n(this, qs.G2);
                qs.f(this.f9205l2).n(this, qs.f25099v5);
                qs.f(this.f9205l2).n(this, qs.f25042m3);
                qs.f(this.f9205l2).n(this, qs.f25113x5);
                qs.f(this.f9205l2).n(this, qs.D5);
                qs.f(this.f9205l2).n(this, qs.f24980b3);
                qs.f(this.f9205l2).n(this, qs.f25021i3);
                qs.f(this.f9205l2).n(this, qs.F);
                qs.e().n(this, qs.f25022i4);
                return;
            }
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f9186g1.d.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(72.0f));
    }

    @Override
    public final void onMeasure(int r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: di.j4.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.Z1 = -1.0f;
        this.E2 = true;
        invalidate();
    }

    public final void p0(boolean z9) {
        int i7;
        if (this.K1 != null && this.O2 && this.J0) {
            w1 w1Var = this.f9256y3;
            org.telegram.messenger.g0.r(w1Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.B1.B;
            this.K1.E(true);
            boolean z10 = this.f9214o1;
            h4 h4Var = this.f9250x1;
            if ((z10 && !h4Var.f9073f) || this.f9218p1) {
                this.T2 = false;
                this.K1.setEnabled(false);
                this.K1.j1(" ", z9);
            } else if (this.f9222q1 > 0) {
                this.T2 = false;
                this.K1.setEnabled(true);
                this.K1.j1(dd.T0(id.a0(null, null, 2131743926, id.E(this.f9222q1, ','))), z9);
            } else {
                if (!h4Var.f9073f && tL_storiesStealthMode != null) {
                    int currentTime = ConnectionsManager.getInstance(this.f9205l2).getCurrentTime();
                    int i10 = tL_storiesStealthMode.active_until_date;
                    if (currentTime < i10) {
                        this.T2 = true;
                        int currentTime2 = i10 - ConnectionsManager.getInstance(this.f9205l2).getCurrentTime();
                        int i11 = currentTime2 / 60;
                        int i12 = currentTime2 % 60;
                        Locale locale = Locale.US;
                        String a02 = id.a0(null, null, 2131744888, String.format(locale, "%02d:%02d", 99, 99));
                        this.K1.setEnabled(true);
                        if (((int) this.K1.getEditField().getPaint().measureText(a02)) * 1.2f >= this.K1.getEditField().getMeasuredWidth()) {
                            o2 o2Var = this.K1;
                            String a03 = id.a0(null, null, 2131744888, "");
                            String format = String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
                            o2Var.f31055e = a03;
                            o2Var.f31062f = format;
                            o2Var.I1(z9);
                        } else {
                            this.K1.j1(id.a0(null, null, 2131744889, String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12))), z9);
                        }
                        org.telegram.messenger.g0.i3(w1Var, 1000L);
                        return;
                    }
                }
                this.T2 = false;
                this.K1.setEnabled(true);
                if (h4Var.f9073f) {
                    long starsPrice = this.K1.getStarsPrice();
                    if (starsPrice > 0) {
                        this.K1.j1(dd.Y0(false, id.a0(null, null, 2131752004, id.E((int) starsPrice, ',')), this.K1.O4), z9);
                        wp wpVar = this.K1.O4[0];
                        if (wpVar != null) {
                            wpVar.G = 0.9f;
                            return;
                        }
                        return;
                    }
                    this.K1.j1(id.M0(2131752005, null), z9);
                    return;
                }
                o2 o2Var2 = this.K1;
                if (this.n1) {
                    i7 = 2131746250;
                } else {
                    i7 = 2131746255;
                }
                o2Var2.j1(id.M0(i7, null), z9);
            }
        }
    }

    public final boolean q0() {
        if (this.f9172b3) {
            if (this.f9169a3.getReactionsWindow() != null) {
                if (this.f9191h2 > 0) {
                    org.telegram.messenger.g0.v1(this.f9169a3.getReactionsWindow().f6188c);
                    return true;
                }
                this.f9169a3.getReactionsWindow().d();
                return true;
            }
            Z0(false);
            return true;
        }
        f3 f3Var = this.S0;
        if (f3Var != null) {
            fi.m3 m3Var = f3Var.f9843c;
            if (m3Var != null) {
                m3Var.f(true);
                f3Var.f9843c = null;
            }
            f3Var.f9842b = null;
            f3Var.invalidate();
            f3Var.b(false);
        }
        n3 n3Var = this.f9233t0;
        if (n3Var.W.x()) {
            n3Var.W.f(false);
            return true;
        }
        fi.m3 m3Var2 = this.f9213o0;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
        fi.m3 m3Var3 = this.f9217p0;
        if (m3Var3 != null) {
            m3Var3.f(true);
        }
        y20 y20Var = this.F2;
        if (y20Var != null) {
            y20Var.a();
        }
        a4 a4Var = this.f9173c1;
        if (a4Var != null && a4Var.f17105a) {
            a4Var.a();
            return true;
        }
        o2 o2Var = this.K1;
        if (o2Var != null && o2Var.u0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f9200k0);
            boolean z9 = this.K1.f31045c1;
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            if (z9) {
                u1Var.R = id.M0(2131751395, null);
                u1Var.T = id.M0(2131751396, null);
            } else {
                u1Var.R = id.M0(2131751392, null);
                u1Var.T = id.M0(2131751393, null);
            }
            alertDialog$Builder.k(id.M0(2131751394, null), new s1(this, 0));
            alertDialog$Builder.h(id.M0(2131751771, null), null);
            ((h9) this.f9258z1).h(u1Var);
            return true;
        }
        ii0 ii0Var = this.O1;
        if (ii0Var != null && ii0Var.getReactionsWindow() != null && !this.O1.getReactionsWindow().f6200q) {
            this.O1.getReactionsWindow().d();
            return true;
        }
        o2 o2Var2 = this.K1;
        if (o2Var2 != null && o2Var2.s0()) {
            if (this.f9191h2 > 0) {
                org.telegram.messenger.g0.v1(this.K1.getEmojiView());
                return true;
            }
            this.K1.j0();
            return true;
        } else if (getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f)) {
            o2 o2Var3 = this.K1;
            if (o2Var3 != null) {
                long j3 = this.f9201k1;
                TL_stories.StoryItem storyItem = this.f9250x1.f9069a;
                Editable editText = o2Var3.getEditText();
                this.f9229s0.getClass();
                q9.P(j3, storyItem, editText);
            }
            org.telegram.messenger.g0.v1(this.K1);
            return true;
        } else if (n3Var.getVisibility() != 0 || n3Var.getProgressToBlackout() <= 0.0f) {
            return false;
        } else {
            n3Var.D();
            this.P2 = false;
            this.L0.invalidate();
            return true;
        }
    }

    public final void r0() {
        if (this.f9227r2 == null) {
            u2 u2Var = new u2(this, getContext(), this.f9200k0);
            this.f9227r2 = u2Var;
            u2Var.W3 = new v2(this);
            u2Var.d2.i0();
            u2 u2Var2 = this.f9227r2;
            u2Var2.Q1 = true;
            u2Var2.e1();
            u2 u2Var3 = this.f9227r2;
            u2Var3.R1 = new w2(this);
            u2Var3.a1().setText(this.K1.getFieldText());
        }
    }

    public final void s0() {
        if (this.G1 == null && getContext() != null) {
            a aVar = new a(getContext(), this.f9228r3);
            this.G1 = aVar;
            aVar.setOnClickListener(new y1(this, 1));
            addView(this.G1, ha.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public void setAccount(int i7) {
        this.f9205l2 = i7;
        this.B1 = qp.s1(i7).f24799h0;
        this.T0.f47711b = i7;
        ii0 ii0Var = this.O1;
        if (ii0Var != null) {
            ii0Var.setCurrentAccount(i7);
            this.O1.p(null, null, true);
        }
        ii0 ii0Var2 = this.f9169a3;
        if (ii0Var2 != null) {
            ii0Var2.setCurrentAccount(i7);
        }
    }

    public void setActive(boolean z9) {
        R0(0L, z9);
    }

    public void setDelegate(c4 c4Var) {
        this.f9258z1 = c4Var;
    }

    public void setIsVisible(boolean z9) {
        if (this.O2 != z9) {
            this.O2 = z9;
            if (z9) {
                this.N0.f21202h1 = 1.0f;
                p0(false);
            }
        }
    }

    public void setLongpressed(boolean z9) {
        if (this.f9234t1) {
            this.f9239u2 = z9;
            invalidate();
        }
    }

    public void setOffset(float f10) {
        boolean z9;
        if (f10 == 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.K0 != z9) {
            this.K0 = z9;
            this.L0.invalidate();
            if (this.f9234t1 && this.f9229s0.f9599a && Build.VERSION.SDK_INT < 33) {
                ra raVar = this.F3;
                if (z9) {
                    org.telegram.messenger.g0.r(raVar);
                    org.telegram.messenger.g0.i3(raVar, 250L);
                    return;
                }
                org.telegram.messenger.g0.r(raVar);
                q9 q9Var = ((h9) this.f9258z1).d;
                q9Var.f9625k1 = true;
                q9Var.V();
            }
        }
    }

    public void setPaused(boolean z9) {
        if (this.A1 != z9) {
            this.A1 = z9;
            z2 z2Var = this.N0;
            if (z9) {
                z2Var.Q0();
                z2Var.f21225t0 = false;
            } else {
                z2Var.P0(false);
                z2Var.f21225t0 = true;
            }
            this.G0 = 0L;
            this.L0.invalidate();
        }
    }

    public final void t0() {
        org.telegram.ui.ActionBar.h6 h6Var = this.f9200k0;
        o2 o2Var = new o2(this, org.telegram.messenger.g0.W(getContext()), this, new m2(1, h6Var));
        this.K1 = o2Var;
        ys editField = o2Var.getEditField();
        editField.getClass();
        org.telegram.ui.Components.qs qsVar = new org.telegram.ui.Components.qs(editField, 0);
        editField.f31381t0 = qsVar;
        qsVar.q(true);
        editField.f31381t0.u(editField.f31389x0);
        editField.f31381t0.w(editField.getPaint().getTextSize());
        org.telegram.ui.Components.qs qsVar2 = new org.telegram.ui.Components.qs(editField, 1);
        editField.f31383u0 = qsVar2;
        qsVar2.f34187b = 5;
        qsVar2.u(editField.f31389x0);
        editField.f31383u0.w(editField.getPaint().getTextSize());
        this.K1.getEditField().setScaleX(0.0f);
        this.K1.setOverrideKeyboardAnimation(true);
        this.K1.setClipChildren(false);
        this.K1.setDelegate(new p2(this));
        setDelegate(this.K1);
        o2 o2Var2 = this.K1;
        o2Var2.f31176y4 = false;
        o2Var2.f31181z4 = true;
        if (this.f9250x1.f9073f) {
            o2Var2.V0(false, false, false);
        } else {
            o2Var2.V0(true, true, false);
        }
        this.K1.updateColors();
        o2 o2Var3 = this.K1;
        o2Var3.A4 = true;
        addView(o2Var3, ha.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.f9252x3 != null) {
            this.K1.R1(false);
        }
        this.K1.G2 = this.f9195i2;
        i4 i4Var = this.f9243v2;
        ((ArrayList) i4Var.f9114g).add(this.L0);
        ((ArrayList) i4Var.f9114g).add(this);
        if (this.J0) {
            this.K1.E0();
        }
        p0(false);
        if (G0()) {
            this.K1.setVisibility(8);
        }
        lh.h hVar = new lh.h(getContext(), h6Var, this.f9228r3, this.f9216o3);
        this.L1 = hVar;
        hVar.setOnClickListener(new s1(this, 1));
        addView(this.L1, ha.e(57, 300, 85));
        this.L1.setVisibility(8);
        this.K1.setSideButtonsForAttach(this.L1);
        this.f9225r0 = getChildCount();
    }

    public final void u0() {
        if (this.S1 != null) {
            return;
        }
        o8 o8Var = new o8(getContext(), this.f9200k0);
        this.S1 = o8Var;
        o8Var.setOnClickListener(new y1(this, 4));
        this.S1.setAlpha(0.0f);
        this.S1.setVisibility(8);
        addView(this.S1, ha.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void v0() {
        boolean z9;
        if (this.J1 == null && getContext() != null) {
            n1 n1Var = new n1(getContext(), this.f9228r3);
            this.J1 = n1Var;
            n1Var.setOnClickListener(new y1(this, 5));
            n1 n1Var2 = this.J1;
            g1 g1Var = g1.W;
            boolean z10 = true;
            if (g1Var != null && g1Var.o()) {
                z9 = true;
            } else {
                z9 = false;
            }
            n1Var2.b(z9, false);
            n1 n1Var3 = this.J1;
            g1 g1Var2 = g1.W;
            if (g1Var2 != null && !g1Var2.m()) {
                z10 = false;
            }
            n1Var3.a(z10, false);
            addView(this.J1, ha.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void w0() {
        if (this.I1 == null && getContext() != null) {
            this.H1 = new q1(getContext(), this.f9205l2);
            r1 r1Var = new r1(getContext(), this.H1, this.f9228r3);
            this.I1 = r1Var;
            r1Var.setOnClickListener(new y1(this, 6));
            this.I1.setOnLongClickListener(new v1(this, 1));
            addView(this.I1, ha.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
            addView(this.H1, ha.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void x0() {
        int i7;
        if (this.P1 != null) {
            return;
        }
        if (this.K1 == null) {
            t0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.P1 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(2131231976);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.Q1 = textView;
        textView.setTextColor(-8026747);
        this.Q1.setTextSize(1, 16.0f);
        TextView textView2 = this.Q1;
        if (this.n1) {
            i7 = 2131744665;
        } else {
            i7 = 2131744493;
        }
        textView2.setText(id.M0(i7, null));
        TextView textView3 = new TextView(getContext());
        this.R1 = textView3;
        textView3.setTextColor(-1);
        this.R1.setTextSize(1, 12.0f);
        TextView textView4 = this.R1;
        int L = org.telegram.messenger.g0.L(40.0f);
        textView4.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 452984831, 855638015, 855638015));
        this.R1.setGravity(17);
        ka.a(this.R1);
        this.R1.setText(id.M0(2131744492, null));
        this.R1.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        this.P1.addView(imageView, ha.t(22, 22, 16, 12, 1, 4, 0));
        this.P1.addView(this.Q1, ha.s(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.P1.addView(this.R1, ha.s(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.K1.addView(this.P1, ha.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    public final void y0() {
        if (this.K2 != null) {
            return;
        }
        md mdVar = new md(getContext(), 1);
        this.K2 = mdVar;
        mdVar.setTextSize(1, 14.0f);
        this.K2.setTextColor(i0.a.f(0.5f, -16777216, -1));
        this.K2.setGravity(19);
        this.K2.setText(id.M0(2131744491, null));
        addView(this.K2, ha.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void z0() {
        if (this.F1 != null) {
            return;
        }
        a3 a3Var = new a3(this, getContext(), 0);
        this.F1 = a3Var;
        a3Var.setClickable(true);
        addView(this.F1, ha.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        b3 b3Var = new b3(this, getContext());
        this.f9215o2 = b3Var;
        b3Var.setOnClickListener(new y1(this, 0));
        this.F1.addView(this.f9215o2, ha.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        u uVar = new u(0, getContext(), false);
        this.f9202k2 = uVar;
        uVar.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        this.F1.addView(this.f9202k2, ha.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f9199j2 = textView;
        textView.setTextSize(1, 14.0f);
        this.f9199j2.setTextColor(-1);
        this.F1.addView(this.f9199j2, ha.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.f9186g1.f9034s);
        b3 b3Var2 = this.f9215o2;
        int L = org.telegram.messenger.g0.L(15.0f);
        int o4 = i0.a.o(-1, 120);
        b3Var2.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 0, o4, o4));
        imageView.setBackground(org.telegram.ui.ActionBar.m6.O(i0.a.o(-1, 120), -org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f)));
    }
}
