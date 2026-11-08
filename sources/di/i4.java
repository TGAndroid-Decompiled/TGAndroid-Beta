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
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.ud;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y20;
import org.telegram.ui.Components.zs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.fr0;
import org.telegram.ui.ix;
public abstract class i4 extends rt0 implements ls {
    public org.telegram.ui.Components.i6 A0;
    public boolean A1;
    public long A2;
    public final w1 A3;
    public org.telegram.ui.Components.w5 B0;
    public y6 B1;
    public boolean B2;
    public final ArrayList B3;
    public org.telegram.ui.Components.w5 C0;
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
    public final fr0 G2;
    public final org.telegram.ui.Components.w5 G3;
    public boolean H0;
    public q1 H1;
    public boolean H2;
    public final org.telegram.ui.Components.w5 H3;
    public boolean I0;
    public r1 I1;
    public x2 I2;
    public final org.telegram.ui.Components.w5 I3;
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
    public n8 S1;
    public boolean S2;
    public final ix T0;
    public ViewPropertyAnimator T1;
    public boolean T2;
    public n4 U0;
    public final fh.g U1;
    public final ImageReceiver U2;
    public float V0;
    public final fh.g V1;
    public ch.d V2;
    public final org.telegram.ui.Components.w8 W0;
    public final Paint W1;
    public final ImageReceiver W2;
    public final e4 X0;
    public int X1;
    public org.telegram.ui.Components.i5 X2;
    public final o8 Y0;
    public ValueAnimator Y1;
    public boolean Y2;
    public m6.n Z0;
    public float Z1;
    public boolean Z2;
    public int f9130a1;
    public float f9131a2;
    public ii0 f9132a3;
    public org.telegram.ui.ActionBar.z0 f9133b1;
    public float f9134b2;
    public boolean f9135b3;
    public z3 f9136c1;
    public int f9137c2;
    public float f9138c3;
    public TL_stories.PeerStories f9139d1;
    public boolean d2;
    public boolean f9140d3;
    public final ArrayList f9141e1;
    public boolean f9142e2;
    public float f9143e3;
    public final ImageView f9144f0;
    public final ArrayList f9145f1;
    public boolean f9146f2;
    public int f9147f3;
    public final ImageView f9148g0;
    public final f4 f9149g1;
    public boolean f9150g2;
    public int f9151g3;
    public final a4 f9152h0;
    public final bg.r0 f9153h1;
    public int f9154h2;
    public int f9155h3;
    public final ch0 f9156i0;
    public ArrayList f9157i1;
    public final int f9158i2;
    public w1 f9159i3;
    public final ImageView f9160j0;
    public int f9161j1;
    public TextView f9162j2;
    public float j3;
    public final org.telegram.ui.ActionBar.f6 f9163k0;
    public long f9164k1;
    public u f9165k2;
    public boolean f9166k3;
    public final u8 f9167l0;
    public boolean l1;
    public int f9168l2;
    public h6.m f9169l3;
    public final a3 m0;
    public boolean f9170m1;
    public int f9171m2;
    public org.telegram.ui.ActionBar.z0 f9172m3;
    public d7 f9173n0;
    public boolean n1;
    public boolean f9174n2;
    public org.telegram.ui.ActionBar.z0 f9175n3;
    public fi.m3 f9176o0;
    public boolean f9177o1;
    public b3 f9178o2;
    public final dh.c f9179o3;
    public fi.m3 f9180p0;
    public boolean f9181p1;
    public boolean f9182p2;
    public final ri.a f9183p3;
    public fi.m3 f9184q0;
    public long f9185q1;
    public float f9186q2;
    public final ri.f f9187q3;
    public int f9188r0;
    public final float f9189r1;
    public u2 f9190r2;
    public final gh.b f9191r3;
    public final p9 f9192s0;
    public int f9193s1;
    public o40 f9194s2;
    public TL_stories.TL_premium_boostsStatus f9195s3;
    public final n3 f9196t0;
    public boolean f9197t1;
    public int f9198t2;
    public org.telegram.messenger.e3 f9199t3;
    public final g2 f9200u0;
    public int f9201u1;
    public boolean f9202u2;
    public long f9203u3;
    public final View f9204v0;
    public int f9205v1;
    public final h4 f9206v2;
    public long f9207v3;
    public final ImageView f9208w0;
    public int f9209w1;
    public final h2.f f9210w2;
    public boolean f9211w3;
    public final LinearLayout f9212x0;
    public final g4 f9213x1;
    public final org.telegram.ui.Components.w5 f9214x2;
    public TLRPC.TL_channels_sendAsPeers f9215x3;
    public final a3 f9216y0;
    public final a8.b8 f9217y1;
    public final org.telegram.ui.Components.w5 f9218y2;
    public final w1 f9219y3;
    public org.telegram.ui.Components.i6 f9220z0;
    public b4 f9221z1;
    public float f9222z2;
    public int f9223z3;

    public i4(Context context, final p9 p9Var, f4 f4Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null);
        this.K0 = true;
        this.Q0 = new ArrayList();
        this.f9130a1 = -5;
        this.f9189r1 = 1.0f;
        g4 g4Var = new g4(this);
        this.f9213x1 = g4Var;
        this.Z1 = -1.0f;
        this.f9131a2 = -1.0f;
        this.f9134b2 = -1.0f;
        this.f9158i2 = ConnectionsManager.generateClassGuid();
        this.f9214x2 = new org.telegram.ui.Components.w5(this);
        this.f9218y2 = new org.telegram.ui.Components.w5(this);
        fr0 fr0Var = new fr0();
        this.G2 = fr0Var;
        this.N2 = 1.0f;
        this.f9219y3 = new w1(this, 4);
        this.A3 = new w1(this, 11);
        this.B3 = new ArrayList();
        this.C3 = new ArrayList();
        this.F3 = new ra(this, 20);
        this.G3 = new org.telegram.ui.Components.w5(this);
        this.H3 = new org.telegram.ui.Components.w5(this);
        this.I3 = new org.telegram.ui.Components.w5(this);
        this.K3 = new Path();
        fr0Var.E = new cb.c(this, 19);
        ?? obj = new Object();
        obj.f9079g = new ArrayList();
        this.f9206v2 = obj;
        this.f9210w2 = new h2.f((int[]) null);
        this.f9141e1 = new ArrayList();
        this.f9145f1 = new ArrayList();
        z2 z2Var = new z2(this, 0);
        this.N0 = z2Var;
        z2Var.A0 = false;
        z2Var.f21236z1 = true;
        z2Var.f21232y = true;
        z2Var.h0(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.U2 = imageReceiver;
        imageReceiver.f21236z1 = true;
        imageReceiver.f21232y = true;
        imageReceiver.h0(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.W2 = imageReceiver2;
        imageReceiver2.f21236z1 = true;
        imageReceiver2.f21232y = true;
        imageReceiver2.h0(3);
        ImageReceiver imageReceiver3 = new ImageReceiver(null);
        this.O0 = imageReceiver3;
        imageReceiver3.f21236z1 = true;
        imageReceiver3.f21232y = true;
        imageReceiver3.h0(0);
        ImageReceiver imageReceiver4 = new ImageReceiver(null);
        this.P0 = imageReceiver4;
        imageReceiver4.f21236z1 = true;
        imageReceiver4.f21232y = true;
        imageReceiver4.h0(0);
        z2Var.f21177a = Arrays.asList(imageReceiver3, imageReceiver4);
        this.W0 = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        this.f9192s0 = p9Var;
        this.f9149g1 = f4Var;
        this.f9217y1 = f4Var.f8985g;
        this.B1 = qp.s1(p10.f24470s0).P1();
        f4Var.f8989l.setColor(-16777216);
        this.W1 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.f9163k0 = f6Var;
        setClipChildren(false);
        f3 f3Var = new f3(this, context, this.L0, f6Var, p9Var);
        this.S0 = f3Var;
        gh.b bVar = new gh.b(f6Var, org.telegram.ui.ActionBar.k6.Ge, 0.8f);
        this.f9191r3 = bVar;
        ri.c cVar = new ri.c();
        cVar.a(i0.a.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT >= 31 && iz.e()) {
            ri.f fVar = new ri.f(cVar);
            this.f9187q3 = fVar;
            fVar.l(org.telegram.messenger.g0.L(8.0f));
            this.f9183p3 = fVar;
        } else {
            this.f9187q3 = null;
            this.f9183p3 = cVar;
        }
        jh.k kVar = new jh.k(this);
        ri.a aVar = this.f9183p3;
        dh.c cVar2 = new dh.c(aVar, aVar, aVar);
        cVar2.h = kVar;
        cVar2.f8708i = this;
        this.f9179o3 = cVar2;
        this.U1 = cVar2.c(this, bVar, false);
        fh.g c10 = cVar2.c(this, bVar, false);
        this.V1 = c10;
        c10.u(org.telegram.messenger.g0.L(32.0f));
        j3 j3Var = new j3(this, context, f4Var, p9Var);
        this.L0 = j3Var;
        j3Var.setClipChildren(false);
        this.T0 = new ix(this.f9168l2, j3Var);
        j3Var.addView(f3Var, ha.c(-1.0f, -1));
        n3 n3Var = new n3(this, getContext(), p9Var.D, p9Var, f6Var);
        this.f9196t0 = n3Var;
        n3Var.f9095b0.setOnClickListener(new y1(this, 10));
        ImageView imageView = new ImageView(context);
        this.f9208w0 = imageView;
        imageView.setImageDrawable(f4Var.f8990m);
        int L = org.telegram.messenger.g0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        imageView.setOnClickListener(new y1(this, 11));
        imageView.setContentDescription(id.M0(2131745462, null));
        ka.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(f4Var.f8991n);
        imageView2.setPadding(L, L, L, L);
        a3 a3Var = new a3(this, getContext(), 1);
        this.f9216y0 = a3Var;
        org.telegram.ui.Components.i6 i6Var = this.A0;
        if (i6Var != null) {
            i6Var.setCallback(a3Var);
        }
        a3Var.setWillNotDraw(false);
        a3Var.setOnClickListener(new y1(this, 12));
        a3 a3Var2 = new a3(this, getContext(), 2);
        this.m0 = a3Var2;
        org.telegram.ui.Components.i6 i6Var2 = this.f9220z0;
        if (i6Var2 != null) {
            i6Var2.setCallback(a3Var2);
        }
        a3Var2.setWillNotDraw(false);
        a3Var2.setOnClickListener(new y1(this, 13));
        a3Var2.setOnLongClickListener(new f2(0, this, p9Var));
        d7 d7Var = new d7(context, f4Var);
        this.f9173n0 = d7Var;
        d7Var.setPadding(L, L, L, L);
        a3Var2.addView(this.f9173n0, ha.e(40, 40, 3));
        a3Var.addView(imageView2, ha.e(40, 40, 3));
        ka.b(a3Var2, 0.3f, 5.0f);
        ka.b(a3Var, 0.3f, 5.0f);
        z2Var.f21236z1 = true;
        z2Var.H0(j3Var);
        bg.r0 r0Var = new bg.r0(10);
        this.f9153h1 = r0Var;
        j3Var.setOutlineProvider(r0Var);
        j3Var.setClipToOutline(true);
        addView(j3Var);
        e4 e4Var = new e4(context, g4Var);
        this.X0 = e4Var;
        e4Var.setOnClickListener(new View.OnClickListener(this) {
            public final i4 f9779b;

            {
                this.f9779b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7;
                int i10 = r3;
                p9 p9Var2 = p9Var;
                i4 i4Var = this.f9779b;
                switch (i10) {
                    case 0:
                        long j3 = p10.i(i4Var.f9168l2).f24489n;
                        long j10 = i4Var.f9164k1;
                        if (j3 == j10) {
                            Bundle f10 = rf.b.f(1, "type");
                            f10.putLong("dialog_id", i4Var.f9164k1);
                            p9Var2.N(new u80(f10, null));
                            return;
                        } else if (j10 > 0) {
                            p9Var2.N(ProfileActivity.A4(j10));
                            return;
                        } else {
                            p9Var2.N(an.ra(j10));
                            return;
                        }
                    default:
                        if (i4Var.f9213x1.j()) {
                            p9Var2.U();
                            if (!p9.C1) {
                                qp.e1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            a4 a4Var = i4Var.f9152h0;
                            if (!p9.C1) {
                                i7 = 2131748315;
                            } else {
                                i7 = 2131743852;
                            }
                            a4Var.setContentDescription(id.M0(i7, null));
                            return;
                        }
                        i4Var.a1(true);
                        return;
                }
            }
        });
        j3Var.addView(e4Var, ha.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.M0 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f9212x0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, ha.r(40, 40, 5));
        linearLayout.addView(a3Var, ha.r(40, 40, 5));
        linearLayout.addView(a3Var2, ha.r(40, 40, 5));
        addView(linearLayout, ha.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f9144f0 = imageView3;
        imageView3.setImageDrawable(f4Var.f8994q);
        imageView3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.h0(-1, 1, -1));
        imageView3.setContentDescription(id.M0(2131754839, null));
        j3Var.addView(imageView3, ha.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.f9148g0 = imageView4;
        imageView4.setImageDrawable(f4Var.f8995r);
        imageView4.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.k6.h0(-1, 1, -1));
        imageView4.setContentDescription(id.M0(2131754808, null));
        j3Var.addView(imageView4, ha.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new ah.d(p9Var, 15));
        imageView3.setOnClickListener(new d0(this, f6Var, p9Var, context, f4Var, 1));
        a4 a4Var = new a4(context, 0);
        this.f9152h0 = a4Var;
        j3Var.addView(a4Var, ha.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ?? imageView5 = new ImageView(context);
        this.f9156i0 = imageView5;
        imageView5.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        a4Var.addView(imageView5);
        ImageView imageView6 = new ImageView(context);
        this.f9160j0 = imageView6;
        imageView6.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        imageView6.setImageDrawable(f4Var.f8997t);
        a4Var.addView(imageView6);
        imageView6.setVisibility(8);
        u8 u8Var = new u8(context);
        this.f9167l0 = u8Var;
        u8Var.setOnClickListener(new y1(this, 2));
        j3Var.addView(u8Var, ha.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        a4Var.setOnClickListener(new View.OnClickListener(this) {
            public final i4 f9779b;

            {
                this.f9779b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7;
                int i10 = r3;
                p9 p9Var2 = p9Var;
                i4 i4Var = this.f9779b;
                switch (i10) {
                    case 0:
                        long j3 = p10.i(i4Var.f9168l2).f24489n;
                        long j10 = i4Var.f9164k1;
                        if (j3 == j10) {
                            Bundle f10 = rf.b.f(1, "type");
                            f10.putLong("dialog_id", i4Var.f9164k1);
                            p9Var2.N(new u80(f10, null));
                            return;
                        } else if (j10 > 0) {
                            p9Var2.N(ProfileActivity.A4(j10));
                            return;
                        } else {
                            p9Var2.N(an.ra(j10));
                            return;
                        }
                    default:
                        if (i4Var.f9213x1.j()) {
                            p9Var2.U();
                            if (!p9.C1) {
                                qp.e1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            a4 a4Var2 = i4Var.f9152h0;
                            if (!p9.C1) {
                                i7 = 2131748315;
                            } else {
                                i7 = 2131743852;
                            }
                            a4Var2.setContentDescription(id.M0(i7, null));
                            return;
                        }
                        i4Var.a1(true);
                        return;
                }
            }
        });
        this.Y0 = new o8(this, f4Var);
        j3Var.addView(n3Var, ha.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f9204v0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        g2 g2Var = new g2(this, context, p9Var, p9Var.f9578w, view, frameLayout, p9Var);
        this.f9200u0 = g2Var;
        j3Var.addView(view, ha.e(-1, 200, 87));
        j3Var.addView(g2Var, ha.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        j3Var.addView(frameLayout, ha.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int L2 = org.telegram.messenger.g0.L(20.0f);
        int o4 = i0.a.o(-1, 100);
        a4Var.setBackground(org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, 0, o4, o4));
        int L3 = org.telegram.messenger.g0.L(20.0f);
        int o10 = i0.a.o(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, 0, o10, o10));
        int L4 = org.telegram.messenger.g0.L(20.0f);
        int o11 = i0.a.o(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.k6.k0(L4, L4, L4, L4, 0, o11, o11));
        int L5 = org.telegram.messenger.g0.L(20.0f);
        int o12 = i0.a.o(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.k0(L5, L5, L5, L5, 0, o12, o12));
        int L6 = org.telegram.messenger.g0.L(20.0f);
        int o13 = i0.a.o(-1, 100);
        a3Var2.setBackground(org.telegram.ui.ActionBar.k6.k0(L6, L6, L6, L6, 0, o13, o13));
        int L7 = org.telegram.messenger.g0.L(20.0f);
        int o14 = i0.a.o(-1, 100);
        a3Var.setBackground(org.telegram.ui.ActionBar.k6.k0(L7, L7, L7, L7, 0, o14, o14));
        org.telegram.ui.Cells.s9 s9Var = n3Var.W;
        View n10 = s9Var.n(context);
        if (n10 != null) {
            org.telegram.messenger.g0.E2(n10);
            addView(n10);
        }
        s9Var.D = new h2(this, 0);
        s9Var.S(this);
    }

    public static void T0(x6 x6Var, ImageReceiver imageReceiver, String str) {
        if (x6Var.f9935s) {
            imageReceiver.u0(null, null, hc.g(x6Var.f9932f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.r0(hc.g(x6Var.f9931e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void X(i4 i4Var, ValueAnimator valueAnimator) {
        float f10;
        u8 u8Var = i4Var.f9167l0;
        i4Var.N3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        e4 e4Var = i4Var.X0;
        e4Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * i4Var.N3);
        e4Var.setAlpha(1.0f - i4Var.N3);
        ImageView imageView = i4Var.f9144f0;
        imageView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * i4Var.N3);
        imageView.setAlpha(1.0f - i4Var.N3);
        ImageView imageView2 = i4Var.f9148g0;
        imageView2.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * i4Var.N3);
        imageView2.setAlpha(1.0f - i4Var.N3);
        a4 a4Var = i4Var.f9152h0;
        a4Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * i4Var.N3);
        a4Var.setAlpha((1.0f - i4Var.N3) * i4Var.N2);
        a3 a3Var = i4Var.F1;
        if (a3Var != null) {
            a3Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * i4Var.N3);
            i4Var.F1.setAlpha(1.0f - i4Var.N3);
        }
        if (u8Var != null) {
            u8Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * i4Var.N3);
            u8Var.setAlpha(1.0f - i4Var.N3);
        }
        i4Var.f9196t0.setAlpha(1.0f - i4Var.N3);
        b4 b4Var = i4Var.f9221z1;
        if (b4Var == null) {
            f10 = 0.0f;
        } else {
            f10 = ((g9) b4Var).d.V;
        }
        float hideInterfaceAlpha = i4Var.getHideInterfaceAlpha();
        a3 a3Var2 = i4Var.m0;
        if (a3Var2 != null) {
            a3Var2.setAlpha((1.0f - i4Var.N3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        ImageView imageView3 = i4Var.f9208w0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - i4Var.N3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        a3 a3Var3 = i4Var.f9216y0;
        if (a3Var3 != null) {
            a3Var3.setAlpha((1.0f - i4Var.N3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        o2 o2Var = i4Var.K1;
        if (o2Var != null) {
            o2Var.setAlpha(1.0f - i4Var.N3);
            i4Var.invalidate();
        }
        i4Var.L0.invalidate();
    }

    public static void Y(i4 i4Var, boolean z9) {
        org.telegram.ui.ActionBar.z0 z0Var = i4Var.f9172m3;
        if (z0Var != null && i4Var.f9169l3 != null && z0Var.getVisibility() == 0) {
            if (z9) {
                if (Math.abs(p9.A1 - 0.2f) < 0.05f) {
                    i4Var.f9172m3.setSubtext(id.M0(2131743577, null));
                } else if (Math.abs(p9.A1 - 0.5f) < 0.05f) {
                    i4Var.f9172m3.setSubtext(id.M0(2131743579, null));
                } else if (Math.abs(p9.A1 - 1.0f) < 0.05f) {
                    i4Var.f9172m3.setSubtext(id.M0(2131743580, null));
                } else if (Math.abs(p9.A1 - 1.5f) < 0.05f) {
                    i4Var.f9172m3.setSubtext(id.M0(2131743581, null));
                } else if (Math.abs(p9.A1 - 2.0f) < 0.05f) {
                    i4Var.f9172m3.setSubtext(id.M0(2131743578, null));
                } else {
                    org.telegram.ui.ActionBar.z0 z0Var2 = i4Var.f9172m3;
                    z0Var2.setSubtext(id.a0(null, null, 2131743582, du0.a(p9.A1) + "x"));
                }
            }
            i4Var.f9169l3.H(z9, p9.A1);
        }
    }

    public static void Z(i4 i4Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (!i4Var.G0() && !i4Var.f9213x1.f9042f) {
            if (p10.i(i4Var.f9168l2).q()) {
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232393, id.M0(2131744890, null), false, i4Var.f9163k0).setOnClickListener(new y1(i4Var, 8));
                return;
            }
            Drawable drawable = i4Var.getContext().getDrawable(2131232169);
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            i2 i2Var = new i2(i4Var.getContext().getDrawable(2131232381), drawable, 0);
            org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232393, id.M0(2131744890, null), false, i4Var.f9163k0);
            c10.setOnClickListener(new y1(i4Var, 9));
            c10.setIcon(i2Var);
        }
    }

    public static void b0(i4 i4Var) {
        g4 g4Var = i4Var.f9213x1;
        TL_stories.StoryItem storyItem = g4Var.f9038a;
        if ((storyItem == null && g4Var.f9039b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = g4Var.h();
        boolean z9 = g4Var.f9041e;
        if (h != null && h.exists()) {
            MediaController.d0(h.toString(), i4Var.getContext(), z9 ? 1 : 0, null, null, new bi.b9(1, i4Var, z9));
            return;
        }
        i4Var.Y0();
    }

    public static void c0(i4 i4Var, long j3) {
        String str;
        boolean z9;
        TLRPC.User user;
        if (j3 > 0) {
            TLRPC.User a22 = qp.s1(i4Var.f9168l2).a2(Long.valueOf(j3));
            str = a22.first_name;
            z9 = a22.stories_hidden;
            user = a22;
        } else {
            TLRPC.Chat M0 = qp.s1(i4Var.f9168l2).M0(Long.valueOf(-j3));
            str = M0.title;
            z9 = M0.stories_hidden;
            user = M0;
        }
        org.telegram.messenger.g0.i3(new bi.o(i4Var, qp.s1(i4Var.f9168l2), j3, !z9, str, user), 200L);
    }

    public static void d0(i4 i4Var) {
        int i7;
        int i10;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, i4Var.getContext(), i4Var.f9163k0);
        if (i4Var.G0()) {
            i7 = 2131751565;
        } else {
            i7 = 2131751488;
        }
        String M0 = id.M0(i7, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = M0;
        if (i4Var.G0()) {
            i10 = 2131751566;
        } else {
            i10 = 2131751489;
        }
        u1Var.T = id.M0(i10, null);
        alertDialog$Builder.k(id.M0(2131751599, null), new s1(i4Var, 2));
        alertDialog$Builder.h(id.M0(2131752589, null), new a1(2));
        ((g9) i4Var.f9221z1).h(u1Var);
        u1Var.i();
    }

    public static void f0(i4 i4Var) {
        String str;
        cc K;
        org.telegram.ui.ActionBar.f6 f6Var = i4Var.f9163k0;
        j3 j3Var = i4Var.L0;
        if (i4Var.f9181p1) {
            return;
        }
        if (i4Var.n1) {
            if (i4Var.f9195s3 != null && i4Var.f9199t3 != null) {
                ug.i0.w1(new bi.w4(i4Var, 1), i4Var.f9195s3, i4Var.f9199t3, i4Var.f9164k1, true);
                return;
            }
            p9 p9Var = i4Var.f9192s0;
            if (p9Var != null) {
                p9Var.f9553j1 = true;
                p9Var.V();
            }
            qp.s1(i4Var.f9168l2).G0().a(i4Var.f9164k1, new z1(i4Var, 0));
            return;
        }
        o2 o2Var = i4Var.K1;
        int i7 = -i4Var.f9130a1;
        i4Var.f9130a1 = i7;
        org.telegram.messenger.g0.G3(i7, o2Var, null);
        org.telegram.messenger.p2.APP_ERROR.a();
        if (i4Var.f9164k1 >= 0) {
            str = t10.p(qp.s1(i4Var.f9168l2).a2(Long.valueOf(i4Var.f9164k1)));
        } else {
            str = "";
        }
        if (qp.s1(i4Var.f9168l2).D3()) {
            K = new org.telegram.ui.Components.hc(j3Var, f6Var).Q(2131624216, 36, org.telegram.messenger.g0.X2(id.a0(null, null, 2131743761, str)));
        } else {
            K = new org.telegram.ui.Components.hc(j3Var, f6Var).K(2131624216, org.telegram.messenger.g0.X2(id.a0(null, null, 2131743761, str)), id.M0(2131743762, null), new w1(i4Var, 5));
        }
        K.j();
    }

    public org.telegram.messenger.c getAccountInstance() {
        return org.telegram.messenger.c.a(this.f9168l2);
    }

    public float getHideInterfaceAlpha() {
        float f10;
        float f11 = 1.0f - this.f9214x2.f39805c;
        s5 s5Var = this.f9192s0.f9580x;
        if (s5Var == null) {
            f10 = 0.0f;
        } else {
            f10 = s5Var.f9759f;
        }
        return (1.0f - f10) * f11;
    }

    public long getMessageMinPrice() {
        p9 p9Var;
        if (!this.f9213x1.f9042f || (p9Var = this.f9192s0) == null || p9Var.A0 == null || B0(true)) {
            return 0L;
        }
        return p9Var.A0.j();
    }

    public static void h0(i4 i4Var) {
        g4 g4Var = i4Var.f9213x1;
        if (g4Var.f9038a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.f27200id = g4Var.f9038a.f27195id;
        tL_stories_exportStoryLink.peer = qp.s1(i4Var.f9168l2).j1(i4Var.f9164k1);
        ConnectionsManager.getInstance(i4Var.f9168l2).sendRequest(tL_stories_exportStoryLink, new Object());
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
        textView.setText(id.M0(2131744456, null));
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f9163k0;
        org.telegram.ui.ActionBar.r6.V(textView, i7, f6Var);
        TextView textView2 = new TextView(getContext());
        ka.a(textView2);
        textView2.setText(id.M0(2131754230, null));
        int i10 = org.telegram.ui.ActionBar.k6.Gi;
        org.telegram.ui.ActionBar.r6.V(textView2, i10, f6Var);
        textView2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 15.0f);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, f6Var);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i10, f6Var), 30);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, o4, o4);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i10, 30);
        textView2.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(textView2, k02, N, h, f6Var);
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
        long e10 = p10.i(this.f9168l2).e();
        int i10 = (this.f9164k1 > 0L ? 1 : (this.f9164k1 == 0L ? 0 : -1));
        p9 p9Var = this.f9192s0;
        if (i10 < 0 && (g1Var2 = p9Var.A0) != null) {
            if (z9) {
                TLRPC.Peer i11 = g1Var2.i();
                TLRPC.Chat M0 = qp.s1(this.f9168l2).M0(Long.valueOf(-this.f9164k1));
                if (p9Var.A0.l() || org.telegram.messenger.t3.w(14, M0)) {
                    if (i11 == null || this.f9164k1 == org.telegram.messenger.m5.o(i11) || org.telegram.messenger.m5.o(i11) == p10.i(this.f9168l2).e()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } else if (i10 >= 0 && p9Var != null && (g1Var = p9Var.A0) != null && g1Var.l()) {
            if (!z9 || (i7 = p9Var.A0.i()) == null || this.f9164k1 == org.telegram.messenger.m5.o(i7) || org.telegram.messenger.m5.o(i7) == e10 || this.f9164k1 == e10) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public final void C0(Canvas canvas, int i7, int i10) {
        TextureView textureView;
        h4 h4Var = this.f9206v2;
        org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) h4Var.f9077e;
        if (j4Var != null && ((SurfaceView) h4Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                org.telegram.messenger.g0.z0((SurfaceView) h4Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else if (j4Var != null && (textureView = (TextureView) h4Var.f9078f) != null) {
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
        b4 b4Var = this.f9221z1;
        Context context = getContext();
        if (storyItem.pinned) {
            i7 = Integer.MAX_VALUE;
        } else {
            i7 = storyItem.expire_date - storyItem.date;
        }
        fi.s8 s8Var = new fi.s8(i7, context, this.f9163k0);
        s8Var.W0(q8Var);
        fi.g1 g1Var = s8Var.f12803i1;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof fi.n8) {
                    ((fi.n8) view).f(false);
                }
            }
        }
        s8Var.Q0(true);
        s8Var.K1 = new ab.g(11, this, storyItem);
        ((g9) b4Var).h(s8Var);
    }

    public final boolean E0(android.view.ViewGroup r11, float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: di.i4.E0(android.view.ViewGroup, float, float, boolean):boolean");
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
        q6 q6Var;
        p9 p9Var = this.f9192s0;
        if (p9Var != null && (q6Var = p9Var.N0) != null && q6Var.f9640e == 4) {
            return true;
        }
        return false;
    }

    public final boolean H0() {
        TLRPC.User a22;
        if (!G0() || (a22 = qp.s1(this.f9168l2).a2(Long.valueOf(this.f9192s0.N0.d))) == null || !a22.bot || !a22.bot_can_edit) {
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
        g4 g4Var = this.f9213x1;
        TL_stories.StoryItem storyItem = g4Var.f9038a;
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
            this.B1.j0(this.f9164k1, g4Var.f9038a, null);
        } else if (o0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(this.f9168l2).f25836r.get("❤");
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
                this.B1.j0(this.f9164k1, g4Var.f9038a, ch.o0.c(tL_availableReaction));
            }
        } else {
            j0();
            this.B1.j0(this.f9164k1, g4Var.f9038a, o0Var);
        }
        TL_stories.StoryItem storyItem2 = g4Var.f9038a;
        a3 a3Var = this.m0;
        if (storyItem2 != null && (reaction = storyItem2.sent_reaction) != null) {
            z9 = !z9;
            this.f9173n0.setReaction(ch.o0.d(reaction));
            a3Var.setContentDescription(id.M0(2131754850, null));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z10 = true;
        } else {
            this.f9173n0.setReaction(null);
            a3Var.setContentDescription(id.M0(2131754851, null));
            z10 = false;
        }
        if (this.f9170m1 && z9) {
            TL_stories.StoryItem storyItem3 = g4Var.f9038a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = g4Var.f9038a.views;
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
        TL_stories.StoryItem storyItem4 = g4Var.f9038a;
        ch.q0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        i1(true);
    }

    public final void K0() {
        g1 g1Var;
        boolean z9;
        if (this.f9215x3 == null) {
            p9 p9Var = this.f9192s0;
            if (p9Var != null && (g1Var = p9Var.A0) != null) {
                TLRPC.GroupCall groupCall = g1Var.f9030w;
                if (groupCall == null) {
                    z9 = false;
                } else {
                    z9 = !groupCall.messages_enabled;
                }
                if (z9) {
                    return;
                }
            }
            TLRPC.TL_channels_sendAsPeers M1 = qp.s1(this.f9168l2).M1(this.f9164k1, true);
            this.f9215x3 = M1;
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
        boolean z9 = o2Var.f31163z2;
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
        long e10 = p10.i(this.f9168l2).e();
        TLRPC.Peer i10 = this.f9192s0.A0.i();
        if (i10 != null) {
            e10 = org.telegram.messenger.m5.o(i10);
        }
        Context context = getContext();
        int i11 = this.f9168l2;
        String s5 = org.telegram.messenger.m5.s(i11, this.f9164k1);
        long messageMinPrice = getMessageMinPrice();
        long j12 = this.f9203u3;
        z1 z1Var2 = new z1(this, 1);
        b bVar = new b();
        org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(1, context, (org.telegram.ui.ActionBar.f6) bVar, false);
        v2Var.N();
        v2Var.f28651v0 = false;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        v2Var.N = f10;
        int[] iArr = qp.s1(i11).X6;
        CharSequence j02 = ij.j0(textWithEntities, false, false, new TextPaint());
        if (j02 instanceof Spannable) {
            Spannable spannable = (Spannable) j02;
            charSequence = j02;
            j3 = j12;
            z1Var = z1Var2;
            i7 = ((org.telegram.ui.Components.r5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.r5.class)).length + ((org.telegram.messenger.f6[]) spannable.getSpans(0, charSequence.length(), org.telegram.messenger.f6.class)).length;
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
        obj.f9738c = e10;
        obj.f9740f = textWithEntities;
        obj.f9741g = jArr[0];
        n0 n0Var = new n0(i11, context, true);
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
        bi.e5 e5Var = new bi.e5(context, id.M0(2131748815, null), bVar);
        f11.addView(e5Var, ha.q(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        bi.e5 e5Var2 = new bi.e5(context, id.M0(2131748816, null), bVar);
        f11.addView(e5Var2, ha.q(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        bi.e5 e5Var3 = new bi.e5(context, id.M0(2131748817, null), bVar);
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
        sVar.f5201e0 = iArr4;
        sVar.setValue((int) jArr[0]);
        f10.addView(sVar, ha.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        c20VarArr[0].a(Integer.valueOf((int) jArr[0]));
        f10.addView(f11, ha.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i20 = org.telegram.ui.ActionBar.k6.f27960j5;
        TextView b10 = qa.b(context, 20.0f, i20, true, bVar);
        org.telegram.messenger.k5.m(b10, 17, null, 2131748812);
        f10.addView(b10, ha.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = qa.b(context, 14.0f, i20, false, bVar);
        b11.setGravity(17);
        org.telegram.messenger.k5.r(null, null, 2131748813, new Object[]{s5}, b11);
        f10.addView(b11, ha.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        f10.addView(n0Var, ha.t(-2, -2, 17, 42, 22, 42, 20));
        f10.addView(dVar, ha.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        v2Var.show();
        dVar.setOnClickListener(new ah.g(z1Var3, jArr, v2Var, 4));
    }

    public final void N0() {
        if (this.K1 == null) {
            return;
        }
        r0();
        this.f9190r2.f32932a2.i0();
        this.f9190r2.y1(-1, true);
        u2 u2Var = this.f9190r2;
        u2Var.Q1 = this.f9164k1;
        u2Var.e1();
        this.f9190r2.a1().setText(this.K1.getFieldText());
        ((g9) this.f9221z1).h(this.f9190r2);
    }

    public final void O0() {
        Bundle bundle = new Bundle();
        long j3 = this.f9164k1;
        if (j3 < 0) {
            bundle.putLong("chat_id", -j3);
        } else {
            bundle.putLong("user_id", j3);
        }
        TLRPC.Dialog S0 = qp.s1(this.f9168l2).S0(this.f9164k1);
        if (S0 != null) {
            bundle.putInt("message_id", S0.top_message);
        }
        this.f9192s0.N(new an(bundle));
    }

    public final void P0(long r22) {
        throw new UnsupportedOperationException("Method not decompiled: di.i4.P0(long):void");
    }

    public final void Q0(android.net.Uri r18) {
        throw new UnsupportedOperationException("Method not decompiled: di.i4.Q0(android.net.Uri):void");
    }

    public final void R0(long j3, boolean z9) {
        int i7;
        int i10;
        g4 g4Var;
        if (this.f9197t1 != z9) {
            this.f9197t1 = z9;
            ch0 ch0Var = this.f9156i0;
            int i11 = 0;
            if (z9) {
                if (this.f9192s0.f9529a && Build.VERSION.SDK_INT < 33) {
                    p9 p9Var = ((g9) this.f9221z1).d;
                    p9Var.f9555k1 = true;
                    p9Var.V();
                    ra raVar = this.F3;
                    org.telegram.messenger.g0.r(raVar);
                    org.telegram.messenger.g0.i3(raVar, 100L);
                }
                P0(j3);
                e1();
                ch0Var.setAnimation(this.f9149g1.f8998u);
                this.f9197t1 = true;
                this.X0.f8959a.getImageReceiver().O0(true, true);
                if (this.f9213x1.f9038a != null) {
                    org.telegram.messenger.a8.b("StoryViewer displayed story dialogId=" + this.f9164k1 + " storyId=" + g4Var.f9038a.f27195id + " " + g4.c(g4Var));
                }
            } else {
                n0();
                ch0Var.a();
                this.U0 = null;
                this.f9202u2 = false;
                this.f9214x2.e(true, 0.0f);
                this.L0.invalidate();
                invalidate();
                o0();
                p9 p9Var2 = ((g9) this.f9221z1).d;
                p9Var2.H0 = false;
                p9Var2.V();
            }
            if (this.f9197t1) {
                i7 = 3;
            } else {
                i7 = 2;
            }
            this.N0.h0(i7);
            if (this.f9197t1) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            this.O0.h0(i10);
            if (this.f9197t1) {
                i11 = 2;
            }
            this.P0.h0(i11);
            if (this.l1 || this.f9170m1) {
                y6 y6Var = this.B1;
                long j10 = this.f9164k1;
                boolean z10 = this.f9197t1;
                a0.h hVar = y6Var.f9973m;
                y9 y9Var = (y9) hVar.f(j10);
                if (y9Var == null) {
                    y9Var = new y9(y6Var.f9963a, j10, y6Var);
                    hVar.k(y9Var, j10);
                }
                y9Var.b(z10);
            }
        }
    }

    public final void S0(int i7, long j3) {
        if (this.f9164k1 != j3) {
            g4 g4Var = this.f9213x1;
            g4Var.f9039b = null;
            g4Var.f9038a = null;
        }
        this.f9164k1 = j3;
        this.f9157i1 = null;
        m0(i7);
        TL_stories.PeerStories peerStories = this.f9192s0.P0;
        boolean z9 = true;
        if (peerStories != null) {
            this.B1.V(peerStories, true);
            return;
        }
        y6 y6Var = this.B1;
        TL_stories.PeerStories y10 = y6Var.y(j3);
        if (y10 == null) {
            y10 = y6Var.z(j3);
        } else {
            z9 = false;
        }
        y6Var.V(y10, z9);
    }

    public final void U0(long j3, boolean z9, boolean z10) {
        String str;
        if (!z9 && j3 == this.f9207v3 && this.f9211w3 == z10) {
            return;
        }
        this.f9207v3 = j3;
        this.f9211w3 = z10;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        e4 e4Var = this.X0;
        if (i7 >= 0) {
            if (this.l1 && !z10) {
                e4Var.f8960b.l(id.M0(2131745644, null), false);
                e4Var.f8960b.i(null);
                return;
            }
            TLRPC.User a22 = qp.s1(this.f9168l2).a2(Long.valueOf(j3));
            if (a22 != null && a22.verified) {
                Drawable mutate = getContext().getDrawable(2131232793).mutate();
                mutate.setAlpha(255);
                xp xpVar = new xp(mutate, null);
                xpVar.f40361x = true;
                int L = org.telegram.messenger.g0.L(16.0f);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                xpVar.h = L;
                xpVar.f40357n = L2;
                e4Var.f8960b.i(xpVar);
            } else {
                e4Var.f8960b.i(null);
            }
            if (a22 != null) {
                e4Var.f8960b.l(org.telegram.messenger.i6.m(org.telegram.messenger.g0.D2(org.telegram.messenger.g5.p(a22)), e4Var.f8960b.getPaint().getFontMetricsInt(), false, null, 0), false);
                return;
            }
            e4Var.f8960b.l(null, false);
            return;
        }
        TLRPC.Chat M0 = qp.s1(this.f9168l2).M0(Long.valueOf(-j3));
        d4 d4Var = e4Var.f8960b;
        d4 d4Var2 = e4Var.f8960b;
        if (M0 == null) {
            str = "";
        } else {
            str = M0.title;
        }
        d4Var.l(org.telegram.messenger.g0.D2(str), false);
        if (M0 != null && M0.verified) {
            Drawable mutate2 = getContext().getDrawable(2131232793).mutate();
            mutate2.setAlpha(255);
            xp xpVar2 = new xp(mutate2, null);
            xpVar2.f40361x = true;
            int L3 = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            xpVar2.h = L3;
            xpVar2.f40357n = L4;
            d4Var2.i(xpVar2);
            return;
        }
        d4Var2.i(null);
    }

    public final void V0(float f10, float f11, n4 n4Var) {
        this.V0 = f10;
        this.j3 = 1.0f / f11;
        if (this.U0 != n4Var) {
            this.U0 = n4Var;
            if (n4Var != null) {
                ImageReceiver imageReceiver = n4Var.f9399a;
                if (imageReceiver.n() != null) {
                    Bitmap copy = imageReceiver.n().copy(Bitmap.Config.ARGB_8888, false);
                    z2 z2Var = this.N0;
                    z2Var.f21184c0 = null;
                    z2Var.Z0.setShader(null);
                    z2Var.N0(new BitmapDrawable(copy));
                }
            }
        }
    }

    public final void W0(boolean z9) {
        boolean z10;
        g4 g4Var = this.f9213x1;
        if (g4Var.f9038a != null) {
            p9 p9Var = this.f9192s0;
            if (p9Var.f9543f != null) {
                String e10 = g4Var.e();
                TLRPC.Chat chat = null;
                if (z9) {
                    m2 m2Var = new m2(2, this.f9163k0);
                    if (this.f9170m1) {
                        chat = qp.s1(this.f9168l2).M0(Long.valueOf(-this.f9164k1));
                    }
                    if (qp.s1(this.f9168l2).W4() && ((!this.f9170m1 && !t10.A(this.f9164k1)) || org.telegram.messenger.t3.t0(chat))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x2 x2Var = new x2(this, p9Var.f9543f.getContext(), e10, e10, z10, m2Var);
                    this.I2 = x2Var;
                    x2Var.f36036a2 = true;
                    TL_stories.StoryItem storyItem = g4Var.f9038a;
                    storyItem.dialogId = this.f9164k1;
                    x2Var.f36072x2 = storyItem;
                    x2Var.f36048k2 = new d6.i(this, 18);
                    ((g9) this.f9221z1).h(x2Var);
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", e10);
                LaunchActivity.G1.startActivityForResult(Intent.createChooser(intent, id.M0(2131744849, null)), 500);
            }
        }
    }

    public final void X0() {
        j3 j3Var = this.L0;
        org.telegram.ui.ActionBar.f6 f6Var = this.f9163k0;
        org.telegram.messenger.k5.p(null, 2131743836, new org.telegram.ui.Components.hc(j3Var, f6Var), f6Var);
    }

    public final void Y0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f9163k0);
        String M0 = id.M0(2131689472, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = M0;
        alertDialog$Builder.k(id.M0(2131747832, null), null);
        u1Var.T = id.M0(2131747219, null);
        ((g9) this.f9221z1).h(u1Var);
    }

    public final void Z0(boolean z9) {
        if (this.f9135b3 != z9) {
            g4 g4Var = this.f9213x1;
            if (g4Var.f9038a != null) {
                this.f9135b3 = z9;
                if (z9) {
                    this.f9132a3.setVisibility(0);
                }
                this.f9132a3.setStoryItem(g4Var.f9038a);
                p9 p9Var = ((g9) this.f9221z1).d;
                p9Var.f9561o1 = z9;
                p9Var.V();
                float f10 = 0.0f;
                if (z9) {
                    float f11 = this.f9138c3;
                    if (z9) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    this.f9132a3.setTransitionProgress(this.f9138c3);
                    ofFloat.addUpdateListener(new x1(this, 1));
                    ofFloat.addListener(new j2(this, z9, 0));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(xq.f40367g);
                    ofFloat.start();
                    return;
                }
                if (this.f9132a3.getReactionsWindow() != null) {
                    this.f9132a3.getReactionsWindow().e();
                }
                this.f9132a3.animate().alpha(0.0f).setDuration(150L).setListener(new k2(this, 0)).start();
            }
        }
    }

    public final void a1(boolean z9) {
        int i7;
        if (this.f9180p0 == null) {
            fi.m3 m3Var = new fi.m3(getContext(), 1);
            m3Var.o(1.0f, -56.0f);
            this.f9180p0 = m3Var;
            m3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
            this.L0.addView(this.f9180p0, ha.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        fi.m3 m3Var2 = this.f9180p0;
        if (z9) {
            i7 = 2131744610;
        } else {
            i7 = 2131744460;
        }
        m3Var2.u(id.M0(i7, null));
        this.f9180p0.w();
    }

    public final boolean b1(boolean z9) {
        if (this.f9192s0.Q0) {
            z9 = !z9;
        }
        if (z9) {
            if (this.f9193s1 < getStoriesCount() - 1) {
                this.f9193s1++;
                d1(false);
                return true;
            }
        } else {
            int i7 = this.f9193s1;
            if (i7 > 0) {
                this.f9193s1 = i7 - 1;
                d1(false);
                return true;
            }
        }
        return false;
    }

    public final void c1() {
        if (!qp.s1(this.f9168l2).W4()) {
            return;
        }
        File h = this.f9213x1.h();
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
        throw new UnsupportedOperationException("Method not decompiled: di.i4.d1(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        float f10;
        g1 g1Var;
        boolean z9;
        int i11 = qs.f25095v5;
        long j3 = 0;
        p9 p9Var = this.f9192s0;
        boolean z10 = false;
        if (i7 != i11 && (i7 != qs.f25109x5 || p9Var.N0 != objArr[0])) {
            if (i7 == qs.f25038m3) {
                d1(false);
                return;
            } else if (i7 == qs.f25018i4) {
                this.f9196t0.f9095b0.invalidate();
                return;
            } else if (i7 == qs.D5) {
                p0(true);
                return;
            } else if (i7 == qs.f24976b3) {
                s6 o4 = qp.s1(this.f9168l2).P1().o();
                if (o4 != null && o4.a(this.f9168l2, 1) && this.f9221z1 != null) {
                    bi.w4 w4Var = new bi.w4(this, 1);
                    Context W = org.telegram.messenger.g0.W(getContext());
                    if (W == null) {
                        W = LaunchActivity.G1;
                    }
                    ((g9) this.f9221z1).h(new ug.i0(o4.b(), this.f9168l2, W, w4Var, null));
                    return;
                }
                return;
            } else if (i7 == qs.f25017i3) {
                TL_account.RequirementToContact J2 = qp.s1(this.f9168l2).J2(this.f9164k1);
                if (this.f9164k1 >= 0 && !p10.i(this.f9168l2).q() && (J2 instanceof TL_account.requirementToContactPremium)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (this.f9177o1 != z9 || this.f9185q1 != org.telegram.messenger.m5.k(J2)) {
                    this.f9177o1 = z9;
                    this.f9185q1 = org.telegram.messenger.m5.k(J2);
                    d1(false);
                    p0(true);
                    return;
                }
                return;
            } else if (i7 == qs.T) {
                Object obj = objArr[0];
                if ((obj instanceof TLRPC.ChatFull) && this.f9164k1 == (-((TLRPC.ChatFull) obj).f26957id)) {
                    d1(false);
                    return;
                }
                return;
            } else if (i7 == qs.G2) {
                long longValue = ((Long) objArr[0]).longValue();
                if (p9Var != null && (g1Var = p9Var.A0) != null && g1Var.g() == longValue) {
                    d1(false);
                    o2 o2Var = this.K1;
                    if (o2Var != null) {
                        o2Var.E(true);
                        this.K1.R1(true);
                        p0(true);
                    }
                    g2 g2Var = this.f9200u0;
                    if (g2Var != null) {
                        g1 g1Var2 = g2Var.P;
                        if (g1Var2 != null) {
                            j3 = g1Var2.j();
                        }
                        if (g2Var.H != j3) {
                            g2Var.f9816e.O(true);
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
        b4 b4Var = this.f9221z1;
        if (b4Var == null || !((g9) b4Var).d.G0) {
            if (this.f9197t1) {
                h1();
                if (this.f9161j1 == 0) {
                    if (!this.f9174n2) {
                        this.f9174n2 = true;
                        ((g9) this.f9221z1).j();
                        return;
                    }
                    return;
                }
                int i12 = this.f9193s1;
                ArrayList arrayList = this.f9141e1;
                int size = arrayList.size();
                ArrayList arrayList2 = this.f9145f1;
                if (i12 >= arrayList2.size() + size) {
                    this.f9193s1 = (arrayList2.size() + arrayList.size()) - 1;
                }
                d1(false);
                if (this.l1 || this.f9170m1) {
                    i1(true);
                }
            }
            TL_stories.PeerStories peerStories = p9Var.P0;
            if (peerStories != null) {
                this.B1.V(peerStories, true);
            } else {
                long j10 = this.f9164k1;
                if (j10 != 0) {
                    y6 y6Var = this.B1;
                    TL_stories.PeerStories y10 = y6Var.y(j10);
                    if (y10 == null) {
                        y10 = y6Var.z(j10);
                        z10 = true;
                    }
                    y6Var.V(y10, z10);
                }
            }
            org.telegram.ui.ActionBar.z0 z0Var = this.f9133b1;
            if (z0Var != null) {
                ViewPropertyAnimator animate = z0Var.animate();
                if (this.B1.M(this.f9164k1) && this.f9213x1.f9041e && !iz.b()) {
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
        ud udVar;
        Canvas canvas2;
        org.telegram.ui.Components.i6 i6Var;
        org.telegram.ui.Components.i6 i6Var2;
        j1();
        if (this.f9170m1 && (i6Var2 = this.f9220z0) != null) {
            i6Var2.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(40.0f));
        }
        if (this.f9170m1 && (i6Var = this.A0) != null) {
            i6Var.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z9 = this.f9140d3;
        LinearLayout linearLayout = this.f9212x0;
        a3 a3Var = this.m0;
        if (z9) {
            float measuredWidth = (a3Var.getMeasuredWidth() / 2.0f) + a3Var.getX() + linearLayout.getX();
            float measuredHeight = (a3Var.getMeasuredHeight() / 2.0f) + a3Var.getY() + linearLayout.getY();
            int L = org.telegram.messenger.g0.L(24.0f);
            float f10 = L / 2.0f;
            float T1 = org.telegram.messenger.g0.T1(this.f9147f3, measuredWidth - f10, xq.f40367g.getInterpolation(this.f9143e3));
            float T12 = org.telegram.messenger.g0.T1(this.f9151g3, measuredHeight - f10, this.f9143e3);
            int W1 = org.telegram.messenger.g0.W1(this.f9143e3, this.f9155h3, L);
            if (this.Y2) {
                org.telegram.ui.Components.i5 i5Var = this.X2;
                if (i5Var != null) {
                    float f11 = W1;
                    i5Var.setBounds((int) T1, (int) T12, (int) (T1 + f11), (int) (T12 + f11));
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
            ud udVar2 = o2Var.f31157y1;
            ud udVar3 = o2Var.f31162z1;
            if (o2Var.getAlpha() != 0.0f && (udVar = o2Var.f31041e1) != null && udVar.getParent() != null && o2Var.f31041e1.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(o2Var.f31041e1.getX() + udVar2.getX() + udVar3.getX() + o2Var.getX(), o2Var.f31041e1.getY() + udVar2.getY() + udVar3.getY() + o2Var.getY());
                if (o2Var.getAlpha() != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, o2Var.getMeasuredWidth(), o2Var.getMeasuredHeight(), (int) (o2Var.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                o2Var.f31041e1.draw(canvas2);
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
        f4 f4Var = this.f9149g1;
        if (view == o2Var) {
            float f11 = this.Z1;
            int i7 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            g4 g4Var = this.f9213x1;
            if (i7 > 0 && !g4Var.f9042f) {
                f4Var.f8989l.setAlpha((int) (f11 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), f4Var.f8989l);
            }
            RectF rectF = f4Var.h;
            RectF rectF2 = f4Var.f8986i;
            RectF rectF3 = f4Var.f8987j;
            rectF.set(this.K1.getX(), this.K1.getY() + this.K1.getAnimatedTop() + org.telegram.messenger.g0.L(1.33f), this.K1.getX() + this.K1.getMeasuredWidth(), this.K1.getY() + this.K1.getMeasuredHeight());
            float L2 = org.telegram.messenger.g0.L(40.0f);
            if (!g4Var.f9042f) {
                if (this.B2) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
                if (this.C2 && this.f9170m1) {
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
            org.telegram.messenger.g0.Z1(rectF2, f4Var.h, this.Z1, rectF3);
            fh.g gVar = this.U1;
            if (gVar != null) {
                gVar.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                gVar.r(L3);
                gVar.setAlpha((int) ((1.0f - this.N3) * (1.0f - this.f9131a2) * 255.0f * getHideInterfaceAlpha()));
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
            RectF rectF4 = f4Var.f8988k;
            RectF rectF5 = f4Var.f8988k;
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
                if (view == this.f9132a3) {
                    view.setTranslationY((this.f9212x0.getY() + (a3Var.getY() + (-(ii0Var2.getMeasuredHeight() - this.f9132a3.getPaddingBottom())))) - org.telegram.messenger.g0.L(18.0f));
                } else {
                    j3 j3Var = this.L0;
                    if (view == j3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (fVar = this.f9187q3) != null && !fVar.f54574r) {
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
        throw new UnsupportedOperationException("Method not decompiled: di.i4.e1():void");
    }

    public final void f1() {
        int i7;
        if (this.f9181p1) {
            TextView textView = this.Q1;
            if (textView != null) {
                textView.setText(id.M0(2131748824, null));
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
                i7 = 2131744668;
            } else {
                i7 = 2131744496;
            }
            textView3.setText(id.M0(i7, null));
        }
        TextView textView4 = this.R1;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.R1.setText(id.M0(2131744495, null));
        }
    }

    public final void g1() {
        TL_stories.PeerStories peerStories;
        int i7;
        ArrayList arrayList = this.f9157i1;
        p9 p9Var = this.f9192s0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.f9145f1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i7 = arrayList2.size();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    long j3 = ((x6) arrayList2.get(i10)).f9928a;
                    if (((int) (j3 ^ (j3 >>> 32))) == p9Var.O0) {
                        this.f9193s1 = i10;
                        return;
                    }
                }
            } else {
                i7 = 0;
            }
            int indexOf = this.f9157i1.indexOf(Integer.valueOf(p9Var.O0));
            if (indexOf < 0 && !this.f9157i1.isEmpty()) {
                if (p9Var.O0 > ((Integer) this.f9157i1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (p9Var.O0 < ((Integer) jg.g.i(1, this.f9157i1)).intValue()) {
                    indexOf = this.f9157i1.size() - 1;
                }
            }
            this.f9193s1 = i7 + indexOf;
        } else {
            int i11 = p9Var.f9539d1.get(this.f9164k1, -1);
            this.f9193s1 = i11;
            if (i11 == -1 && !p9Var.M0 && (peerStories = this.f9139d1) != null && peerStories.max_read_id > 0) {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f9141e1;
                    if (i12 >= arrayList3.size()) {
                        break;
                    } else if (((TL_stories.StoryItem) arrayList3.get(i12)).f27195id > this.f9139d1.max_read_id) {
                        this.f9193s1 = i12;
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        if (this.f9193s1 == -1) {
            this.f9193s1 = 0;
        }
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.f9157i1;
    }

    public long getCurrentPeer() {
        return this.f9164k1;
    }

    public int getListPosition() {
        return this.f9201u1;
    }

    public Bitmap getPlayingBitmap() {
        j3 j3Var = this.L0;
        Bitmap createBitmap = Bitmap.createBitmap(j3Var.getWidth(), j3Var.getHeight(), Bitmap.Config.ARGB_8888);
        C0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.f9193s1;
    }

    public y6 getStoriesController() {
        return qp.s1(this.f9168l2).P1();
    }

    public int getStoriesCount() {
        return Math.max(this.f9171m2, this.f9141e1.size()) + this.f9145f1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f9141e1;
    }

    public final void h1() {
        q6 q6Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f9141e1;
        arrayList.clear();
        p9 p9Var = this.f9192s0;
        if (p9Var.M0) {
            if (!p9Var.R0) {
                arrayList.add(p9Var.S0);
            }
        } else {
            ArrayList arrayList2 = this.f9157i1;
            int i7 = 0;
            ArrayList arrayList3 = this.f9145f1;
            if (arrayList2 != null && (q6Var = p9Var.N0) != null) {
                if (q6Var instanceof j6) {
                    arrayList3.clear();
                    ArrayList F = qp.s1(this.f9168l2).P1().F(this.f9164k1);
                    String str = ((j6) p9Var.N0).E;
                    if (F != null) {
                        for (int i10 = 0; i10 < F.size(); i10++) {
                            x6 x6Var = (x6) F.get(i10);
                            fi.e7 e7Var = x6Var.f9930c;
                            if (e7Var != null && !e7Var.f11892g && TextUtils.equals(e7Var.K0, str)) {
                                arrayList3.add(x6Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.f9157i1;
                int size = arrayList4.size();
                while (i7 < size) {
                    Object obj = arrayList4.get(i7);
                    i7++;
                    ij f10 = p9Var.N0.f(((Integer) obj).intValue());
                    if (f10 != null && (storyItem = f10.f23266l) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (p9Var.N0 != null) {
                while (i7 < p9Var.N0.f9643i.size()) {
                    arrayList.add(((ij) p9Var.N0.f9643i.get(i7)).f23266l);
                    i7++;
                }
            } else {
                TL_stories.PeerStories peerStories = p9Var.P0;
                if (peerStories != null && org.telegram.messenger.m5.o(peerStories.peer) == this.f9164k1) {
                    this.f9139d1 = p9Var.P0;
                } else {
                    TL_stories.PeerStories y10 = this.B1.y(this.f9164k1);
                    this.f9139d1 = y10;
                    if (y10 == null) {
                        this.f9139d1 = this.B1.z(this.f9164k1);
                    }
                }
                this.f9171m2 = 0;
                TL_stories.PeerStories peerStories2 = this.f9139d1;
                if (peerStories2 != null) {
                    this.f9171m2 = peerStories2.stories.size();
                    arrayList.addAll(this.f9139d1.stories);
                }
                arrayList3.clear();
                ArrayList F2 = this.B1.F(this.f9164k1);
                if (F2 != null) {
                    arrayList3.addAll(F2);
                }
            }
        }
        this.f9161j1 = getStoriesCount();
    }

    public final void i0(boolean z9) {
        i4 currentPeerView;
        o40 o40Var = this.f9194s2;
        if (o40Var != null) {
            o40Var.f36543e0 = null;
            o40Var.a(false);
        }
        long j3 = this.f9164k1;
        TL_stories.StoryItem storyItem = this.f9213x1.f9038a;
        p9 p9Var = this.f9192s0;
        p9Var.getClass();
        if (j3 != 0 && storyItem != null) {
            p9.D1.remove(j3 + (j3 >> 16) + (storyItem.f27195id << 16));
        }
        this.R2 = true;
        f9 f9Var = p9Var.f9559n0;
        if (f9Var != null && (currentPeerView = f9Var.getCurrentPeerView()) != null) {
            currentPeerView.q0();
        }
        if (z9) {
            cc J = new org.telegram.ui.Components.hc(this.L0, this.f9163k0).J(2131624028, id.M0(2131748484, null), id.M0(2131743555, null), 5000, false, new w1(this, 2));
            J.f32553r = false;
            J.k(false);
        }
        qp.s1(this.f9168l2).s0(this.f9164k1, 0, null);
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
        g4 g4Var = this.f9213x1;
        TL_stories.StoryItem storyItem = g4Var.f9038a;
        if (storyItem == null) {
            storyItem = g4Var.f9040c;
        }
        boolean z12 = this.f9170m1;
        if (z12 || this.l1) {
            if (storyItem != null) {
                p9 p9Var = this.f9192s0;
                a3 a3Var = this.m0;
                if (z12) {
                    if (storyItem.views == null) {
                        storyItem.views = new TL_stories.TL_storyViews();
                    }
                    TL_stories.StoryViews storyViews = storyItem.views;
                    if (storyViews.views_count <= 0) {
                        storyViews.views_count = 1;
                    }
                    org.telegram.ui.Components.i6 i6Var = this.A0;
                    if (i6Var != null && (i10 = storyViews.forwards_count) > 0) {
                        String num = Integer.toString(i10);
                        if (z9 && this.E0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        i6Var.t(num, z11, true);
                        this.E0 = true;
                    } else {
                        this.E0 = false;
                    }
                    int i11 = storyItem.views.reactions_count;
                    if (i11 > 0) {
                        org.telegram.ui.Components.i6 i6Var2 = this.f9220z0;
                        String num2 = Integer.toString(i11);
                        if (z9 && this.D0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i6Var2.t(num2, z10, true);
                        this.D0 = true;
                    } else {
                        this.D0 = false;
                    }
                    if (!z9) {
                        org.telegram.ui.Components.w5 w5Var = this.B0;
                        if (this.D0) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        w5Var.e(true, f12);
                        org.telegram.ui.Components.w5 w5Var2 = this.C0;
                        if (w5Var2 != null) {
                            if (this.E0) {
                                f13 = 1.0f;
                            } else {
                                f13 = 0.0f;
                            }
                            w5Var2.e(true, f13);
                        }
                    }
                    TLRPC.Chat M03 = qp.s1(this.f9168l2).M0(Long.valueOf(-this.f9164k1));
                    if ((!this.n1 || (!org.telegram.messenger.t3.q(M03) && !org.telegram.messenger.t3.s0(M03))) && storyItem.views.views_count > 0) {
                        TextView textView = this.f9162j2;
                        if (p9Var.N0 == null) {
                            M02 = id.M0(2131748124, null);
                        } else {
                            M02 = id.M0(2131748123, null);
                        }
                        textView.setText(M02);
                        this.f9162j2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "d  ");
                        spannableStringBuilder.setSpan(new wp(2131231185, 0), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.o0(storyItem.views.views_count, 0));
                        this.f9162j2.setText(spannableStringBuilder);
                    } else {
                        this.f9162j2.setText("");
                    }
                    ViewGroup.LayoutParams layoutParams = a3Var.getLayoutParams();
                    float L = org.telegram.messenger.g0.L(40.0f);
                    if (this.D0) {
                        f10 = this.f9220z0.d + org.telegram.messenger.g0.L(4.0f);
                    } else {
                        f10 = 0.0f;
                    }
                    layoutParams.width = (int) (L + f10);
                    ((ViewGroup.MarginLayoutParams) this.F1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(40.0f) + a3Var.getLayoutParams().width;
                    a3 a3Var2 = this.f9216y0;
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
                    this.f9165k2.setVisibility(8);
                    this.f9178o2.setVisibility(8);
                    TL_stories.StoryItem storyItem2 = g4Var.f9038a;
                    f3 f3Var = this.S0;
                    if (storyItem2 == null) {
                        f3Var.getClass();
                        return;
                    }
                    for (int i12 = 0; i12 < f3Var.getChildCount(); i12++) {
                        if (f3Var.getChildAt(i12) instanceof w8) {
                            ((w8) f3Var.getChildAt(i12)).c(storyItem2.views, z9);
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
                            TLObject e22 = qp.s1(this.f9168l2).e2(storyItem.views.recent_viewers.get(i14).longValue());
                            if (e22 != null) {
                                this.f9165k2.b(i15, this.f9168l2, e22);
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
                        this.f9165k2.b(i16, this.f9168l2, null);
                    }
                    this.f9165k2.a(false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(id.H(',', "Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        wp wpVar = new wp(2131231980, 0);
                        wpVar.f40024y = -53704;
                        wpVar.f40019n = org.telegram.messenger.g0.L(0.2f);
                        spannableStringBuilder2.setSpan(wpVar, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        wp wpVar2 = new wp(2131231971, 0);
                        wpVar2.f40024y = -14161823;
                        wpVar2.f40019n = org.telegram.messenger.g0.L(0.2f);
                        spannableStringBuilder2.setSpan(wpVar2, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.f9162j2.setText(spannableStringBuilder2);
                    if (i15 == 0) {
                        this.f9165k2.setVisibility(8);
                        this.f9162j2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                    } else {
                        this.f9165k2.setVisibility(0);
                        this.f9162j2.setTranslationX(org.telegram.messenger.g0.L(10.0f) + com.google.android.recaptcha.internal.a.e(i15, 1, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + org.telegram.messenger.g0.L(13.0f)));
                    }
                    this.f9178o2.setVisibility(0);
                } else {
                    TextView textView2 = this.f9162j2;
                    if (p9Var.N0 == null) {
                        M0 = id.M0(2131748124, null);
                    } else {
                        M0 = id.M0(2131748123, null);
                    }
                    textView2.setText(M0);
                    this.f9162j2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                    this.f9165k2.setVisibility(8);
                    this.f9178o2.setVisibility(8);
                }
                a3Var.getLayoutParams().width = org.telegram.messenger.g0.L(40.0f);
                this.f9212x0.requestLayout();
                return;
            }
            this.f9162j2.setText("");
            this.f9178o2.setVisibility(8);
            this.f9165k2.setVisibility(8);
        }
    }

    public final void j0() {
        d7 d7Var = this.f9173n0;
        d7Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new l2(0, d7Var)).setDuration(150L).start();
        int L = org.telegram.messenger.g0.L(8.0f);
        d7 d7Var2 = new d7(getContext(), this.f9149g1);
        this.f9173n0 = d7Var2;
        d7Var2.setPadding(L, L, L, L);
        this.f9173n0.setAlpha(0.0f);
        this.f9173n0.setScaleX(0.8f);
        this.f9173n0.setScaleY(0.8f);
        this.f9173n0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.m0.addView(this.f9173n0, ha.e(40, 40, 3));
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
        float f24 = ((g9) this.f9221z1).d.V;
        if (this.f9202u2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.w5 w5Var = this.f9214x2;
        w5Var.e(false, f10);
        int i12 = this.f9137c2;
        if (i12 != 0 && this.d2) {
            f11 = c8.j9.a(this.f9186q2 / i12, 0.0f, 1.0f);
        } else if (this.f9142e2) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        org.telegram.ui.Components.w5 w5Var2 = this.G3;
        float f25 = w5Var2.f39805c;
        org.telegram.ui.Components.w5 w5Var3 = this.H3;
        float f26 = w5Var3.f39805c;
        org.telegram.ui.Components.w5 w5Var4 = this.I3;
        float f27 = w5Var4.f39805c;
        if (this.f9182p2) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        w5Var2.e(false, f12);
        if (!this.R2) {
            o2 o2Var2 = this.K1;
            if (o2Var2 != null && !TextUtils.isEmpty(o2Var2.getFieldText())) {
                f23 = 1.0f;
            } else {
                f23 = 0.0f;
            }
            w5Var3.e(false, f23);
        }
        o2 o2Var3 = this.K1;
        if (o2Var3 != null && o2Var3.f31164z3) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        w5Var4.e(false, f13);
        final o2 o2Var4 = this.K1;
        if (o2Var4 != null) {
            i4 i4Var = o2Var4.f9451x5;
            f14 = 1.0f;
            int backgroundTop = o2Var4.getBackgroundTop();
            int i13 = o2Var4.f9448u5;
            if (i13 != 0 && backgroundTop != i13) {
                int i14 = (o2Var4.T1 + i13) - backgroundTop;
                o2Var4.setAnimatedTop(i14);
                i4Var.E2 = true;
                ValueAnimator valueAnimator = i4Var.N1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    i4Var.N1.cancel();
                }
                View view = o2Var4.G1;
                if (view != null && view.getVisibility() == 0) {
                    o2Var4.G1.setTranslationY(((1.0f - o2Var4.getTopViewEnterProgress()) * o2Var4.G1.getLayoutParams().height) + o2Var4.T1);
                }
                i4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i14, 0.0f);
                i4Var.N1 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                o2 o2Var5 = o2Var4;
                                o2Var5.getClass();
                                o2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                i4 i4Var2 = o2Var5.f9451x5;
                                i4Var2.E2 = true;
                                i4Var2.invalidate();
                                o2Var5.invalidate();
                                return;
                            default:
                                o2Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                i4Var.N1.addListener(new bi.t5(o2Var4, 9));
                i4Var.N1.setDuration(250L);
                i4Var.N1.setInterpolator(mi.l.V);
                i4Var.N1.start();
                o2Var4.f9448u5 = 0;
            }
            if (o2Var4.f31095n3) {
                float scrollY = (o2Var4.f9450w5 - o2Var4.E0.getScrollY()) + (o2Var4.f9449v5 - o2Var4.E0.getMeasuredHeight());
                xe xeVar = o2Var4.E0;
                xeVar.setOffsetY(xeVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(o2Var4.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                o2 o2Var5 = o2Var4;
                                o2Var5.getClass();
                                o2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                i4 i4Var2 = o2Var5.f9451x5;
                                i4Var2.E2 = true;
                                i4Var2.invalidate();
                                o2Var5.invalidate();
                                return;
                            default:
                                o2Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = o2Var4.f9447t5;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                o2Var4.f9447t5 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(mi.l.V);
                ofFloat2.start();
                o2Var4.f31095n3 = false;
                i4Var.j1();
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
        boolean z11 = this.f9150g2;
        Paint paint = this.W1;
        if (z11) {
            paint.setColor(i0.a.f(this.Z1, -14933463, org.telegram.ui.ActionBar.k6.r1(0.44f, -16777216)));
            float f28 = f14;
            paint.setAlpha((int) ((f28 - this.N3) * org.telegram.messenger.k5.A(f28, this.f9131a2, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(i0.a.o(-16777216, (int) ((f14 - this.N3) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z12 = this.E2;
        p9 p9Var = this.f9192s0;
        if (z12 || this.J3 != p9Var.f9538d0 || w5Var.f39805c != this.f9222z2 || this.f9134b2 != this.f9186q2 || f11 != this.Z1 || f24 != this.f9131a2 || f25 != w5Var2.f39805c || z9 || f27 != w5Var4.f39805c || f26 != w5Var3.f39805c) {
            this.E2 = false;
            this.f9134b2 = this.f9186q2;
            int i15 = (w5Var.f39805c > this.f9222z2 ? 1 : (w5Var.f39805c == this.f9222z2 ? 0 : -1));
            j3 j3Var = this.L0;
            if (i15 != 0) {
                j3Var.invalidate();
            }
            if (f24 != 0.0f) {
                j3Var.setLayerType(2, null);
            } else {
                j3Var.setLayerType(0, null);
            }
            this.f9222z2 = w5Var.f39805c;
            this.f9131a2 = f24;
            this.Z1 = f11;
            this.J3 = p9Var.f9538d0;
            float height = this.f9186q2 - (getHeight() - j3Var.getBottom());
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
                if (this.f9142e2) {
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
                zs editField = this.K1.getEditField();
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
            if (this.f9150g2) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(58.0f) * (1.0f - f11);
            }
            float max3 = Math.max(0.0f, L + max);
            if (!this.f9150g2 && !this.f9142e2) {
                i7 = org.telegram.messenger.g0.L(58.0f);
            } else {
                i7 = 0;
            }
            float max4 = Math.max(0.0f, max2 + i7);
            float L2 = (org.telegram.messenger.g0.L(f17) * f11) + max3;
            g2 g2Var = this.f9200u0;
            bi.q1 q1Var = g2Var.f9813c;
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
            fi.s3 s3Var = p9Var.D0;
            if (s3Var != null) {
                s3Var.setKeyboardOffset(max);
            }
            ii0 ii0Var2 = this.O1;
            g4 g4Var = this.f9213x1;
            if (ii0Var2 != null) {
                if (this.Z1 > 0.0f && (g4Var == null || !g4Var.f9042f)) {
                    i11 = i10;
                } else {
                    i11 = 8;
                }
                ii0Var2.setVisibility(i11);
            }
            int i16 = i10;
            while (true) {
                int childCount = getChildCount();
                a3Var = this.f9216y0;
                imageView = this.f9208w0;
                n3Var = this.f9196t0;
                a3Var2 = this.m0;
                if (i16 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i16);
                if (childAt.getVisibility() == 0 && childAt != this.F1 && childAt.getTag(2131296591) == null && childAt != n3Var.W.n(getContext())) {
                    o2 o2Var8 = this.K1;
                    if (o2Var8 != null && childAt == o2Var8.getEmojiView()) {
                        childAt.setTranslationY(this.K1.getEmojiView().getMeasuredHeight() - this.f9186q2);
                    } else if (childAt instanceof y20) {
                        y20 y20Var = (y20) childAt;
                        View view2 = y20Var.f40540c;
                        if (view2 != null) {
                            y20Var.d(view2);
                        }
                    } else if (childAt != this.f9194s2 && childAt != j3Var && childAt != imageView && childAt != this.f9212x0 && childAt != a3Var && childAt != this.F2 && childAt != this.M1 && childAt != a3Var2 && ((ii0Var = this.f9132a3) == null || ii0Var.getReactionsWindow() == null || childAt != this.f9132a3.getReactionsWindow().f6185c)) {
                        float f29 = this.Z1;
                        f29 = (childAt == this.G1 || childAt == this.I1 || childAt == this.J1 || childAt == this.H1) ? 0.0f : 0.0f;
                        float f30 = 1.0f - f29;
                        float L3 = (((((-this.f9198t2) * f30) - (org.telegram.messenger.g0.L(7.0f) * f29)) - this.f9186q2) - (org.telegram.messenger.g0.L(f19) * f30)) - (org.telegram.messenger.g0.L(20.0f) * p9Var.f9538d0);
                        if (childAt == this.G1 || childAt == this.I1 || childAt == this.J1 || childAt == this.H1) {
                            L3 += this.f9186q2;
                        }
                        if (this.f9150g2) {
                            f21 = (1.0f - this.f9131a2) * hideInterfaceAlpha;
                        } else {
                            f21 = hideInterfaceAlpha * 1.0f;
                        }
                        if (childAt == this.K2) {
                            L3 = p9Var.f9538d0 * (-org.telegram.messenger.g0.L(20.0f));
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
                            float f31 = (1.0f - w5Var3.f39805c) * (1.0f - f27) * (1.0f - w5Var2.f39805c) * this.Z1;
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
                    if (this.f9150g2) {
                        childAt.setAlpha((1.0f - this.N3) * (1.0f - this.f9131a2) * hideInterfaceAlpha);
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
                if (childAt2 != null && childAt2 != this.f9204v0) {
                    e4 e4Var = this.X0;
                    a4 a4Var = this.f9152h0;
                    if (childAt2 != e4Var && childAt2 != this.f9144f0 && childAt2 != this.f9148g0 && childAt2 != a4Var && childAt2 != this.F1 && childAt2 != n3Var && childAt2 != this.f9167l0) {
                        childAt2.setAlpha(hideInterfaceAlpha);
                    } else {
                        if (childAt2 == a4Var) {
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
                if (!g4Var.f9042f) {
                    if (this.B2) {
                        L4 += org.telegram.messenger.g0.L(46.0f);
                    }
                    if (this.C2 && this.f9170m1) {
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
                if ((this.B2 || this.n1) && !g4Var.f9042f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o2Var10.g1(f36, f37, f38, z10);
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
        this.M3.setInterpolator(xq.h);
        this.M3.start();
    }

    public final void l0(Runnable runnable) {
        if (qp.s1(this.f9168l2).v2()) {
            org.telegram.ui.b.b(this.f9168l2);
            return;
        }
        int i7 = iz.f23397e0;
        if (i7 > 0 && this.T2) {
            int i10 = i7 - 1;
            iz.f23397e0 = i10;
            iz.T(i10);
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(0, getContext(), this.f9163k0);
            u1Var.setTitle(id.M0(2131744888, null));
            u1Var.n(id.M0(2131744889, null));
            String M0 = id.M0(2131746744, null);
            ba.b bVar = new ba.b(runnable);
            u1Var.f28576l0 = M0;
            u1Var.m0 = bVar;
            String M02 = id.M0(2131752589, null);
            a1 a1Var = new a1(1);
            u1Var.f28578n0 = M02;
            u1Var.f28579o0 = a1Var;
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
        this.f9174n2 = false;
        this.E2 = true;
        this.f9166k3 = false;
        this.f9170m1 = false;
        this.n1 = false;
        long j3 = this.f9164k1;
        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        e4 e4Var = this.X0;
        org.telegram.ui.Components.w8 w8Var = this.W0;
        if (i12 >= 0) {
            if (j3 == p10.i(this.f9168l2).e()) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.l1 = z13;
            TLRPC.User a22 = qp.s1(this.f9168l2).a2(Long.valueOf(this.f9164k1));
            TL_account.RequirementToContact J2 = qp.s1(this.f9168l2).J2(this.f9164k1);
            if (!p10.i(this.f9168l2).q() && (J2 instanceof TL_account.requirementToContactPremium)) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f9177o1 = z14;
            this.f9185q1 = org.telegram.messenger.m5.k(J2);
            w8Var.r(a22);
            e4Var.f8959a.getImageReceiver().i0(a22, w8Var, null);
            U0(this.f9164k1, true, false);
        } else {
            this.l1 = false;
            this.f9170m1 = true;
            if (!this.B1.h(j3)) {
                boolean z15 = org.telegram.messenger.r2.f25212a;
            } else {
                this.f9166k3 = true;
            }
            TLRPC.Chat M0 = qp.s1(this.f9168l2).M0(Long.valueOf(-this.f9164k1));
            boolean V = org.telegram.messenger.t3.V(M0);
            this.n1 = !V;
            if (!V && qp.s1(this.f9168l2).N0(-this.f9164k1) == null) {
                yr.a0(this.f9168l2).F0(-this.f9164k1, true, new CountDownLatch(1), false, false, 0);
            }
            if (this.n1 && !org.telegram.messenger.t3.q(M0)) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f9177o1 = z9;
            this.f9185q1 = qp.s1(this.f9168l2).N1(this.f9164k1);
            w8Var.q(M0);
            e4Var.f8959a.getImageReceiver().i0(M0, w8Var, null);
            U0(this.f9164k1, true, false);
        }
        if (this.f9197t1 && (this.l1 || this.f9170m1)) {
            y6 y6Var = this.B1;
            long j10 = this.f9164k1;
            a0.h hVar = y6Var.f9973m;
            y9 y9Var = (y9) hVar.f(j10);
            if (y9Var == null) {
                y9Var = new y9(y6Var.f9963a, j10, y6Var);
                hVar.k(y9Var, j10);
            }
            y9Var.b(true);
        }
        h1();
        this.f9193s1 = i7;
        if (i7 < 0) {
            this.f9193s1 = 0;
        }
        this.F0 = 0L;
        this.H0 = false;
        this.f9195s3 = null;
        this.f9199t3 = null;
        boolean z16 = this.f9170m1;
        j3 j3Var = this.L0;
        p9 p9Var = this.f9192s0;
        int i13 = 8;
        g4 g4Var = this.f9213x1;
        if (z16) {
            z0();
            if (this.K1 == null && (this.n1 || g4Var.f9042f)) {
                t0();
            }
            if (this.K1 != null) {
                TLRPC.Chat M02 = qp.s1(this.f9168l2).M0(Long.valueOf(-this.f9164k1));
                o2 o2Var = this.K1;
                if (g4Var.f9042f || (!G0() && this.n1 && (org.telegram.messenger.t3.q(M02) || org.telegram.messenger.t3.s0(M02)))) {
                    i13 = 0;
                }
                o2Var.setVisibility(i13);
                o2 o2Var2 = this.K1;
                boolean z17 = g4Var.f9042f;
                B0(true);
                o2Var2.h1(z17);
                o2 o2Var3 = this.K1;
                if (g4Var.f9042f && !B0(true) && (this.f9142e2 || this.K1.W0)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                o2Var3.o1(z12, true);
                zs editField = this.K1.getEditField();
                long j11 = this.f9164k1;
                TL_stories.StoryItem storyItem = g4Var.f9038a;
                p9Var.getClass();
                editField.setText(p9.A(j11, storyItem));
                this.K1.a1(this.f9168l2, this.f9164k1);
                this.K1.M1(M02, null);
            }
            org.telegram.ui.Components.i6 i6Var = this.f9220z0;
            org.telegram.ui.ActionBar.f6 f6Var = this.f9163k0;
            if (i6Var == null) {
                org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, false, false);
                this.f9220z0 = i6Var2;
                a3 a3Var = this.m0;
                i6Var2.setCallback(a3Var);
                this.f9220z0.u(f6Var.h(org.telegram.ui.ActionBar.k6.G6));
                this.f9220z0.w(org.telegram.messenger.g0.L(14.0f));
                this.B0 = new org.telegram.ui.Components.w5(a3Var);
            }
            a3 a3Var2 = this.f9216y0;
            if (a3Var2 != null && this.A0 == null) {
                org.telegram.ui.Components.i6 i6Var3 = new org.telegram.ui.Components.i6(false, false, false);
                this.A0 = i6Var3;
                i6Var3.setCallback(a3Var2);
                this.A0.u(f6Var.h(org.telegram.ui.ActionBar.k6.G6));
                this.A0.w(org.telegram.messenger.g0.L(14.0f));
                this.C0 = new org.telegram.ui.Components.w5(a3Var2);
            }
            if (i7 == -1) {
                g1();
            }
            d1(false);
            this.f9161j1 = getStoriesCount();
            j3Var.invalidate();
            invalidate();
        } else if (this.l1) {
            z0();
            if (g4Var.f9042f) {
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
                boolean z18 = g4Var.f9042f;
                B0(true);
                o2Var5.h1(z18);
                o2 o2Var6 = this.K1;
                if (g4Var.f9042f && !B0(true) && (this.f9142e2 || this.K1.W0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                o2Var6.o1(z11, true);
            }
            if (i7 == -1) {
                ArrayList arrayList = this.f9157i1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(p9Var.O0));
                    if (indexOf < 0 && !this.f9157i1.isEmpty()) {
                        if (p9Var.O0 > ((Integer) this.f9157i1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (p9Var.O0 < ((Integer) jg.g.i(1, this.f9157i1)).intValue()) {
                            indexOf = this.f9157i1.size() - 1;
                        }
                    }
                    this.f9193s1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.f9145f1.isEmpty();
                    ArrayList arrayList2 = this.f9141e1;
                    if (!isEmpty) {
                        this.f9193s1 = arrayList2.size();
                    } else {
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i14)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i14)).f27195id > this.B1.f9967f.get(this.f9164k1)) {
                                this.f9193s1 = i14;
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
            if (this.f9177o1 && this.P1 == null) {
                x0();
            }
            if (this.P1 != null) {
                if (this.f9177o1 || this.f9181p1) {
                    f1();
                }
                LinearLayout linearLayout = this.P1;
                if ((this.f9177o1 && !g4Var.f9042f) || this.f9181p1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                linearLayout.setVisibility(i11);
            }
            n8 n8Var = this.S1;
            if (n8Var != null) {
                n8Var.setVisibility(8);
            }
            if (i7 == -1) {
                g1();
            }
            d1(false);
            o2 o2Var7 = this.K1;
            if (o2Var7 != null) {
                if (!G0() && !t10.A(this.f9164k1)) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                o2Var7.setVisibility(i10);
                o2 o2Var8 = this.K1;
                boolean z19 = g4Var.f9042f;
                B0(true);
                o2Var8.h1(z19);
                o2 o2Var9 = this.K1;
                if (g4Var.f9042f && !B0(true) && (this.f9142e2 || this.K1.W0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o2Var9.o1(z10, true);
                zs editField2 = this.K1.getEditField();
                long j12 = this.f9164k1;
                TL_stories.StoryItem storyItem2 = g4Var.f9038a;
                p9Var.getClass();
                editField2.setText(p9.A(j12, storyItem2));
                this.K1.a1(this.f9168l2, this.f9164k1);
                TLRPC.UserFull b22 = qp.s1(this.f9168l2).b2(this.f9164k1);
                if (b22 != null) {
                    this.K1.M1(null, b22);
                } else {
                    qp.s1(this.f9168l2).W2(qp.s1(this.f9168l2).a2(Long.valueOf(this.f9164k1)), this.f9158i2, false, null);
                }
            }
            this.f9161j1 = getStoriesCount();
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
        n3 n3Var = this.f9196t0;
        if (n3Var.W.x()) {
            n3Var.W.f(false);
        }
    }

    public final void o0() {
        if (this.f9197t1) {
            ((g9) this.f9221z1).d.V();
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
                qs.f(this.f9168l2).c(this, qs.T);
                qs.f(this.f9168l2).c(this, qs.G2);
                qs.f(this.f9168l2).c(this, qs.f25095v5);
                qs.f(this.f9168l2).c(this, qs.f25038m3);
                qs.f(this.f9168l2).c(this, qs.f25109x5);
                qs.f(this.f9168l2).c(this, qs.D5);
                qs.f(this.f9168l2).c(this, qs.f24976b3);
                qs.f(this.f9168l2).c(this, qs.f25017i3);
                qs.f(this.f9168l2).c(this, qs.F);
                qs.e().c(this, qs.f25018i4);
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
        org.telegram.ui.Components.i5 i5Var = this.X2;
        if (i5Var != null) {
            i5Var.n(this);
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
                qs.f(this.f9168l2).n(this, qs.T);
                qs.f(this.f9168l2).n(this, qs.G2);
                qs.f(this.f9168l2).n(this, qs.f25095v5);
                qs.f(this.f9168l2).n(this, qs.f25038m3);
                qs.f(this.f9168l2).n(this, qs.f25109x5);
                qs.f(this.f9168l2).n(this, qs.D5);
                qs.f(this.f9168l2).n(this, qs.f24976b3);
                qs.f(this.f9168l2).n(this, qs.f25017i3);
                qs.f(this.f9168l2).n(this, qs.F);
                qs.e().n(this, qs.f25018i4);
                return;
            }
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f9149g1.d.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(72.0f));
    }

    @Override
    public final void onMeasure(int r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: di.i4.onMeasure(int, int):void");
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
            w1 w1Var = this.f9219y3;
            org.telegram.messenger.g0.r(w1Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.B1.B;
            this.K1.E(true);
            boolean z10 = this.f9177o1;
            g4 g4Var = this.f9213x1;
            if ((z10 && !g4Var.f9042f) || this.f9181p1) {
                this.T2 = false;
                this.K1.setEnabled(false);
                this.K1.i1(" ", z9);
            } else if (this.f9185q1 > 0) {
                this.T2 = false;
                this.K1.setEnabled(true);
                this.K1.i1(dd.T0(id.a0(null, null, 2131743929, id.E(this.f9185q1, ','))), z9);
            } else {
                if (!g4Var.f9042f && tL_storiesStealthMode != null) {
                    int currentTime = ConnectionsManager.getInstance(this.f9168l2).getCurrentTime();
                    int i10 = tL_storiesStealthMode.active_until_date;
                    if (currentTime < i10) {
                        this.T2 = true;
                        int currentTime2 = i10 - ConnectionsManager.getInstance(this.f9168l2).getCurrentTime();
                        int i11 = currentTime2 / 60;
                        int i12 = currentTime2 % 60;
                        Locale locale = Locale.US;
                        String a02 = id.a0(null, null, 2131744891, String.format(locale, "%02d:%02d", 99, 99));
                        this.K1.setEnabled(true);
                        if (((int) this.K1.getEditField().getPaint().measureText(a02)) * 1.2f >= this.K1.getEditField().getMeasuredWidth()) {
                            o2 o2Var = this.K1;
                            String a03 = id.a0(null, null, 2131744891, "");
                            String format = String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
                            o2Var.f31039e = a03;
                            o2Var.f31046f = format;
                            o2Var.I1(z9);
                        } else {
                            this.K1.i1(id.a0(null, null, 2131744892, String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12))), z9);
                        }
                        org.telegram.messenger.g0.i3(w1Var, 1000L);
                        return;
                    }
                }
                this.T2 = false;
                this.K1.setEnabled(true);
                if (g4Var.f9042f) {
                    long starsPrice = this.K1.getStarsPrice();
                    if (starsPrice > 0) {
                        this.K1.i1(dd.Y0(false, id.a0(null, null, 2131752004, id.E((int) starsPrice, ',')), this.K1.O4), z9);
                        wp wpVar = this.K1.O4[0];
                        if (wpVar != null) {
                            wpVar.G = 0.9f;
                            return;
                        }
                        return;
                    }
                    this.K1.i1(id.M0(2131752005, null), z9);
                    return;
                }
                o2 o2Var2 = this.K1;
                if (this.n1) {
                    i7 = 2131746253;
                } else {
                    i7 = 2131746258;
                }
                o2Var2.i1(id.M0(i7, null), z9);
            }
        }
    }

    public final boolean q0() {
        if (this.f9135b3) {
            if (this.f9132a3.getReactionsWindow() != null) {
                if (this.f9154h2 > 0) {
                    org.telegram.messenger.g0.v1(this.f9132a3.getReactionsWindow().f6185c);
                    return true;
                }
                this.f9132a3.getReactionsWindow().d();
                return true;
            }
            Z0(false);
            return true;
        }
        f3 f3Var = this.S0;
        if (f3Var != null) {
            fi.m3 m3Var = f3Var.f9796c;
            if (m3Var != null) {
                m3Var.f(true);
                f3Var.f9796c = null;
            }
            f3Var.f9795b = null;
            f3Var.invalidate();
            f3Var.b(false);
        }
        n3 n3Var = this.f9196t0;
        if (n3Var.W.x()) {
            n3Var.W.f(false);
            return true;
        }
        fi.m3 m3Var2 = this.f9176o0;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
        fi.m3 m3Var3 = this.f9180p0;
        if (m3Var3 != null) {
            m3Var3.f(true);
        }
        y20 y20Var = this.F2;
        if (y20Var != null) {
            y20Var.a();
        }
        z3 z3Var = this.f9136c1;
        if (z3Var != null && z3Var.f17105a) {
            z3Var.a();
            return true;
        }
        o2 o2Var = this.K1;
        if (o2Var != null && o2Var.u0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f9163k0);
            boolean z9 = this.K1.f31029c1;
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            if (z9) {
                u1Var.R = id.M0(2131751396, null);
                u1Var.T = id.M0(2131751397, null);
            } else {
                u1Var.R = id.M0(2131751393, null);
                u1Var.T = id.M0(2131751394, null);
            }
            alertDialog$Builder.k(id.M0(2131751395, null), new s1(this, 0));
            alertDialog$Builder.h(id.M0(2131751771, null), null);
            ((g9) this.f9221z1).h(u1Var);
            return true;
        }
        ii0 ii0Var = this.O1;
        if (ii0Var != null && ii0Var.getReactionsWindow() != null && !this.O1.getReactionsWindow().f6197q) {
            this.O1.getReactionsWindow().d();
            return true;
        }
        o2 o2Var2 = this.K1;
        if (o2Var2 != null && o2Var2.s0()) {
            if (this.f9154h2 > 0) {
                org.telegram.messenger.g0.v1(this.K1.getEmojiView());
                return true;
            }
            this.K1.j0();
            return true;
        } else if (getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f)) {
            o2 o2Var3 = this.K1;
            if (o2Var3 != null) {
                long j3 = this.f9164k1;
                TL_stories.StoryItem storyItem = this.f9213x1.f9038a;
                Editable editText = o2Var3.getEditText();
                this.f9192s0.getClass();
                p9.P(j3, storyItem, editText);
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
        if (this.f9190r2 == null) {
            u2 u2Var = new u2(this, getContext(), this.f9163k0);
            this.f9190r2 = u2Var;
            u2Var.T3 = new v2(this);
            u2Var.f32932a2.i0();
            u2 u2Var2 = this.f9190r2;
            u2Var2.N1 = true;
            u2Var2.e1();
            u2 u2Var3 = this.f9190r2;
            u2Var3.O1 = new w2(this);
            u2Var3.a1().setText(this.K1.getFieldText());
        }
    }

    public final void s0() {
        if (this.G1 == null && getContext() != null) {
            a aVar = new a(getContext(), this.f9191r3);
            this.G1 = aVar;
            aVar.setOnClickListener(new y1(this, 1));
            addView(this.G1, ha.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public void setAccount(int i7) {
        this.f9168l2 = i7;
        this.B1 = qp.s1(i7).f24795h0;
        this.T0.f46763b = i7;
        ii0 ii0Var = this.O1;
        if (ii0Var != null) {
            ii0Var.setCurrentAccount(i7);
            this.O1.p(null, null, true);
        }
        ii0 ii0Var2 = this.f9132a3;
        if (ii0Var2 != null) {
            ii0Var2.setCurrentAccount(i7);
        }
    }

    public void setActive(boolean z9) {
        R0(0L, z9);
    }

    public void setDelegate(b4 b4Var) {
        this.f9221z1 = b4Var;
    }

    public void setIsVisible(boolean z9) {
        if (this.O2 != z9) {
            this.O2 = z9;
            if (z9) {
                this.N0.f21197h1 = 1.0f;
                p0(false);
            }
        }
    }

    public void setLongpressed(boolean z9) {
        if (this.f9197t1) {
            this.f9202u2 = z9;
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
            if (this.f9197t1 && this.f9192s0.f9529a && Build.VERSION.SDK_INT < 33) {
                ra raVar = this.F3;
                if (z9) {
                    org.telegram.messenger.g0.r(raVar);
                    org.telegram.messenger.g0.i3(raVar, 250L);
                    return;
                }
                org.telegram.messenger.g0.r(raVar);
                p9 p9Var = ((g9) this.f9221z1).d;
                p9Var.f9555k1 = true;
                p9Var.V();
            }
        }
    }

    public void setPaused(boolean z9) {
        if (this.A1 != z9) {
            this.A1 = z9;
            z2 z2Var = this.N0;
            if (z9) {
                z2Var.Q0();
                z2Var.f21220t0 = false;
            } else {
                z2Var.P0(false);
                z2Var.f21220t0 = true;
            }
            this.G0 = 0L;
            this.L0.invalidate();
        }
    }

    public final void t0() {
        org.telegram.ui.ActionBar.f6 f6Var = this.f9163k0;
        o2 o2Var = new o2(this, org.telegram.messenger.g0.W(getContext()), this, new m2(1, f6Var));
        this.K1 = o2Var;
        zs editField = o2Var.getEditField();
        editField.getClass();
        rs rsVar = new rs(editField, 0);
        editField.f31365t0 = rsVar;
        rsVar.q(true);
        editField.f31365t0.u(editField.f31373x0);
        editField.f31365t0.w(editField.getPaint().getTextSize());
        rs rsVar2 = new rs(editField, 1);
        editField.f31367u0 = rsVar2;
        rsVar2.f34552b = 5;
        rsVar2.u(editField.f31373x0);
        editField.f31367u0.w(editField.getPaint().getTextSize());
        this.K1.getEditField().setScaleX(0.0f);
        this.K1.setOverrideKeyboardAnimation(true);
        this.K1.setClipChildren(false);
        this.K1.setDelegate(new p2(this));
        setDelegate(this.K1);
        o2 o2Var2 = this.K1;
        o2Var2.f31160y4 = false;
        o2Var2.f31165z4 = true;
        if (this.f9213x1.f9042f) {
            o2Var2.U0(false, false, false);
        } else {
            o2Var2.U0(true, true, false);
        }
        this.K1.updateColors();
        o2 o2Var3 = this.K1;
        o2Var3.A4 = true;
        addView(o2Var3, ha.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.f9215x3 != null) {
            this.K1.R1(false);
        }
        this.K1.G2 = this.f9158i2;
        h4 h4Var = this.f9206v2;
        ((ArrayList) h4Var.f9079g).add(this.L0);
        ((ArrayList) h4Var.f9079g).add(this);
        if (this.J0) {
            this.K1.E0();
        }
        p0(false);
        if (G0()) {
            this.K1.setVisibility(8);
        }
        lh.h hVar = new lh.h(getContext(), f6Var, this.f9191r3, this.f9179o3);
        this.L1 = hVar;
        hVar.setOnClickListener(new s1(this, 1));
        addView(this.L1, ha.e(57, 300, 85));
        this.L1.setVisibility(8);
        this.K1.setSideButtonsForAttach(this.L1);
        this.f9188r0 = getChildCount();
    }

    public final void u0() {
        if (this.S1 != null) {
            return;
        }
        n8 n8Var = new n8(getContext(), this.f9163k0);
        this.S1 = n8Var;
        n8Var.setOnClickListener(new y1(this, 4));
        this.S1.setAlpha(0.0f);
        this.S1.setVisibility(8);
        addView(this.S1, ha.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void v0() {
        boolean z9;
        if (this.J1 == null && getContext() != null) {
            n1 n1Var = new n1(getContext(), this.f9191r3);
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
            this.H1 = new q1(getContext(), this.f9168l2);
            r1 r1Var = new r1(getContext(), this.H1, this.f9191r3);
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
            i7 = 2131744668;
        } else {
            i7 = 2131744496;
        }
        textView2.setText(id.M0(i7, null));
        TextView textView3 = new TextView(getContext());
        this.R1 = textView3;
        textView3.setTextColor(-1);
        this.R1.setTextSize(1, 12.0f);
        TextView textView4 = this.R1;
        int L = org.telegram.messenger.g0.L(40.0f);
        textView4.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 452984831, 855638015, 855638015));
        this.R1.setGravity(17);
        ka.a(this.R1);
        this.R1.setText(id.M0(2131744495, null));
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
        this.K2.setText(id.M0(2131744494, null));
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
        this.f9178o2 = b3Var;
        b3Var.setOnClickListener(new y1(this, 0));
        this.F1.addView(this.f9178o2, ha.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        u uVar = new u(0, getContext(), false);
        this.f9165k2 = uVar;
        uVar.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        this.F1.addView(this.f9165k2, ha.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f9162j2 = textView;
        textView.setTextSize(1, 14.0f);
        this.f9162j2.setTextColor(-1);
        this.F1.addView(this.f9162j2, ha.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.f9149g1.f8996s);
        b3 b3Var2 = this.f9178o2;
        int L = org.telegram.messenger.g0.L(15.0f);
        int o4 = i0.a.o(-1, 120);
        b3Var2.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, o4, o4));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.O(i0.a.o(-1, 120), -org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f)));
    }
}
