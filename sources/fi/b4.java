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
import c8.ja;
import c8.na;
import di.lb;
import di.tb;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.ud;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.ys;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.dr0;
import org.telegram.ui.jx;
public abstract class b4 extends st0 implements is {
    public org.telegram.ui.Components.g6 A0;
    public u3 A1;
    public float A2;
    public int A3;
    public org.telegram.ui.Components.g6 B0;
    public boolean B1;
    public long B2;
    public final t1 B3;
    public org.telegram.ui.Components.u5 C0;
    public s6 C1;
    public boolean C2;
    public final ArrayList C3;
    public org.telegram.ui.Components.u5 D0;
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
    public v2 G1;
    public b30 G2;
    public final sa G3;
    public long H0;
    public a H1;
    public final dr0 H2;
    public final org.telegram.ui.Components.u5 H3;
    public boolean I0;
    public o1 I1;
    public boolean I2;
    public final org.telegram.ui.Components.u5 I3;
    public boolean J0;
    public p1 J1;
    public s2 J2;
    public final org.telegram.ui.Components.u5 J3;
    public boolean K0;
    public l1 K1;
    public FrameLayout K2;
    public float K3;
    public boolean L0;
    public k2 L1;
    public tb L2;
    public final Path L3;
    public final e3 M0;
    public lh.h M1;
    public boolean M2;
    public boolean M3;
    public final FrameLayout N0;
    public hi.l3 N1;
    public m2 N2;
    public ValueAnimator N3;
    public final u2 O0;
    public ValueAnimator O1;
    public float O2;
    public float O3;
    public final ImageReceiver P0;
    public mi0 P1;
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
    public final a3 T0;
    public g8 T1;
    public boolean T2;
    public final jx U0;
    public ViewPropertyAnimator U1;
    public boolean U2;
    public g4 V0;
    public final fh.g V1;
    public final ImageReceiver V2;
    public float W0;
    public final fh.g W1;
    public ch.d W2;
    public final org.telegram.ui.Components.t8 X0;
    public final Paint X1;
    public final ImageReceiver X2;
    public final x3 Y0;
    public int Y1;
    public org.telegram.ui.Components.g5 Y2;
    public final h8 Z0;
    public ValueAnimator Z1;
    public boolean Z2;
    public m6.n f11457a1;
    public float f11458a2;
    public boolean f11459a3;
    public int f11460b1;
    public float f11461b2;
    public mi0 f11462b3;
    public org.telegram.ui.ActionBar.z0 f11463c1;
    public float f11464c2;
    public boolean f11465c3;
    public t3 f11466d1;
    public int d2;
    public float f11467d3;
    public TL_stories.PeerStories f11468e1;
    public boolean f11469e2;
    public boolean f11470e3;
    public final ArrayList f11471f1;
    public boolean f11472f2;
    public float f11473f3;
    public final ImageView f11474g0;
    public final ArrayList f11475g1;
    public boolean f11476g2;
    public int f11477g3;
    public final ImageView f11478h0;
    public final y3 f11479h1;
    public boolean f11480h2;
    public int f11481h3;
    public final bi.v1 f11482i0;
    public final bg.q0 f11483i1;
    public int f11484i2;
    public int f11485i3;
    public final fh0 f11486j0;
    public ArrayList f11487j1;
    public final int f11488j2;
    public t1 j3;
    public final ImageView f11489k0;
    public int f11490k1;
    public TextView f11491k2;
    public float f11492k3;
    public final org.telegram.ui.ActionBar.e6 f11493l0;
    public long l1;
    public u f11494l2;
    public boolean f11495l3;
    public final n8 m0;
    public boolean f11496m1;
    public int f11497m2;
    public h6.m f11498m3;
    public final v2 f11499n0;
    public boolean n1;
    public int f11500n2;
    public org.telegram.ui.ActionBar.z0 f11501n3;
    public x6 f11502o0;
    public boolean f11503o1;
    public boolean f11504o2;
    public org.telegram.ui.ActionBar.z0 f11505o3;
    public hi.l3 f11506p0;
    public boolean f11507p1;
    public w2 f11508p2;
    public final dh.c f11509p3;
    public hi.l3 f11510q0;
    public boolean f11511q1;
    public boolean f11512q2;
    public final ui.a f11513q3;
    public hi.l3 f11514r0;
    public long f11515r1;
    public float f11516r2;
    public final ui.f f11517r3;
    public int f11518s0;
    public final float f11519s1;
    public p2 f11520s2;
    public final gh.b f11521s3;
    public final i9 f11522t0;
    public int f11523t1;
    public r40 f11524t2;
    public TL_stories.TL_premium_boostsStatus f11525t3;
    public final i3 f11526u0;
    public boolean f11527u1;
    public int f11528u2;
    public org.telegram.messenger.e3 f11529u3;
    public final c2 f11530v0;
    public int f11531v1;
    public boolean f11532v2;
    public long f11533v3;
    public final View f11534w0;
    public int f11535w1;
    public final a4 f11536w2;
    public long f11537w3;
    public final ImageView f11538x0;
    public int f11539x1;
    public final h2.f f11540x2;
    public boolean f11541x3;
    public final LinearLayout f11542y0;
    public final z3 f11543y1;
    public final org.telegram.ui.Components.u5 f11544y2;
    public TLRPC.TL_channels_sendAsPeers f11545y3;
    public final v2 f11546z0;
    public final a8.b8 f11547z1;
    public final org.telegram.ui.Components.u5 f11548z2;
    public final t1 f11549z3;

    public b4(Context context, final i9 i9Var, y3 y3Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null);
        this.L0 = true;
        this.R0 = new ArrayList();
        this.f11460b1 = -5;
        this.f11519s1 = 1.0f;
        z3 z3Var = new z3(this);
        this.f11543y1 = z3Var;
        this.f11458a2 = -1.0f;
        this.f11461b2 = -1.0f;
        this.f11464c2 = -1.0f;
        this.f11488j2 = ConnectionsManager.generateClassGuid();
        this.f11544y2 = new org.telegram.ui.Components.u5(this);
        this.f11548z2 = new org.telegram.ui.Components.u5(this);
        dr0 dr0Var = new dr0();
        this.H2 = dr0Var;
        this.O2 = 1.0f;
        this.f11549z3 = new t1(this, 4);
        this.B3 = new t1(this, 11);
        this.C3 = new ArrayList();
        this.D3 = new ArrayList();
        this.G3 = new sa(this, 24);
        this.H3 = new org.telegram.ui.Components.u5(this);
        this.I3 = new org.telegram.ui.Components.u5(this);
        this.J3 = new org.telegram.ui.Components.u5(this);
        this.L3 = new Path();
        dr0Var.E = new d6.i(this, 19);
        ?? obj = new Object();
        obj.f11410g = new ArrayList();
        this.f11536w2 = obj;
        this.f11540x2 = new h2.f((int[]) null);
        this.f11471f1 = new ArrayList();
        this.f11475g1 = new ArrayList();
        u2 u2Var = new u2(this, 0);
        this.O0 = u2Var;
        u2Var.B0 = false;
        u2Var.A1 = true;
        u2Var.f22311y = true;
        u2Var.h0(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.V2 = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.f22311y = true;
        imageReceiver.h0(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.X2 = imageReceiver2;
        imageReceiver2.A1 = true;
        imageReceiver2.f22311y = true;
        imageReceiver2.h0(3);
        ImageReceiver imageReceiver3 = new ImageReceiver(null);
        this.P0 = imageReceiver3;
        imageReceiver3.A1 = true;
        imageReceiver3.f22311y = true;
        imageReceiver3.h0(0);
        ImageReceiver imageReceiver4 = new ImageReceiver(null);
        this.Q0 = imageReceiver4;
        imageReceiver4.A1 = true;
        imageReceiver4.f22311y = true;
        imageReceiver4.h0(0);
        u2Var.f22256a = Arrays.asList(imageReceiver3, imageReceiver4);
        this.X0 = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.f11522t0 = i9Var;
        this.f11479h1 = y3Var;
        this.f11547z1 = y3Var.f12532g;
        this.C1 = np.s1(m10.f24940t0).P1();
        y3Var.f12536l.setColor(-16777216);
        this.X1 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.f11493l0 = e6Var;
        setClipChildren(false);
        a3 a3Var = new a3(this, context, this.M0, e6Var, i9Var);
        this.T0 = a3Var;
        gh.b bVar = new gh.b(e6Var, org.telegram.ui.ActionBar.j6.Je, 0.8f);
        this.f11521s3 = bVar;
        ui.c cVar = new ui.c();
        cVar.a(i0.a.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT >= 31 && gz.e()) {
            ui.f fVar = new ui.f(cVar);
            this.f11517r3 = fVar;
            fVar.k(org.telegram.messenger.g0.L(8.0f));
            this.f11513q3 = fVar;
        } else {
            this.f11517r3 = null;
            this.f11513q3 = cVar;
        }
        jh.k kVar = new jh.k(this);
        ui.a aVar = this.f11513q3;
        dh.c cVar2 = new dh.c(aVar, aVar, aVar);
        cVar2.h = kVar;
        cVar2.f8098i = this;
        this.f11509p3 = cVar2;
        this.V1 = cVar2.c(this, bVar, false);
        fh.g c10 = cVar2.c(this, bVar, false);
        this.W1 = c10;
        c10.u(org.telegram.messenger.g0.L(32.0f));
        e3 e3Var = new e3(this, context, y3Var, i9Var);
        this.M0 = e3Var;
        e3Var.setClipChildren(false);
        this.U0 = new jx(this.f11497m2, e3Var);
        e3Var.addView(a3Var, ja.c(-1.0f, -1));
        i3 i3Var = new i3(this, getContext(), i9Var.E, i9Var, e6Var);
        this.f11526u0 = i3Var;
        i3Var.f11420c0.setOnClickListener(new v1(this, 10));
        ImageView imageView = new ImageView(context);
        this.f11538x0 = imageView;
        imageView.setImageDrawable(y3Var.f12537m);
        int L = org.telegram.messenger.g0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        imageView.setOnClickListener(new v1(this, 11));
        imageView.setContentDescription(hd.M0(2131745459, null));
        na.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(y3Var.f12538n);
        imageView2.setPadding(L, L, L, L);
        v2 v2Var = new v2(this, getContext(), 1);
        this.f11546z0 = v2Var;
        org.telegram.ui.Components.g6 g6Var = this.B0;
        if (g6Var != null) {
            g6Var.setCallback(v2Var);
        }
        v2Var.setWillNotDraw(false);
        v2Var.setOnClickListener(new v1(this, 12));
        v2 v2Var2 = new v2(this, getContext(), 2);
        this.f11499n0 = v2Var2;
        org.telegram.ui.Components.g6 g6Var2 = this.A0;
        if (g6Var2 != null) {
            g6Var2.setCallback(v2Var2);
        }
        v2Var2.setWillNotDraw(false);
        v2Var2.setOnClickListener(new v1(this, 13));
        v2Var2.setOnLongClickListener(new b2(0, this, i9Var));
        x6 x6Var = new x6(context, y3Var);
        this.f11502o0 = x6Var;
        x6Var.setPadding(L, L, L, L);
        v2Var2.addView(this.f11502o0, ja.e(40, 40, 3));
        v2Var.addView(imageView2, ja.e(40, 40, 3));
        na.b(v2Var2, 0.3f, 5.0f);
        na.b(v2Var, 0.3f, 5.0f);
        u2Var.A1 = true;
        u2Var.H0(e3Var);
        bg.q0 q0Var = new bg.q0(10);
        this.f11483i1 = q0Var;
        e3Var.setOutlineProvider(q0Var);
        e3Var.setClipToOutline(true);
        addView(e3Var);
        x3 x3Var = new x3(context, z3Var);
        this.Y0 = x3Var;
        x3Var.setOnClickListener(new View.OnClickListener(this) {
            public final b4 f12258b;

            {
                this.f12258b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7;
                int i10 = r3;
                i9 i9Var2 = i9Var;
                b4 b4Var = this.f12258b;
                switch (i10) {
                    case 0:
                        long j3 = m10.i(b4Var.f11497m2).f24959n;
                        long j10 = b4Var.l1;
                        if (j3 == j10) {
                            Bundle f10 = r.b.f(1, "type");
                            f10.putLong("dialog_id", b4Var.l1);
                            i9Var2.N(new y80(f10, null));
                            return;
                        } else if (j10 > 0) {
                            i9Var2.N(ProfileActivity.C4(j10));
                            return;
                        } else {
                            i9Var2.N(an.ua(j10));
                            return;
                        }
                    default:
                        if (b4Var.f11543y1.j()) {
                            i9Var2.U();
                            if (!i9.D1) {
                                np.e1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            bi.v1 v1Var = b4Var.f11482i0;
                            if (!i9.D1) {
                                i7 = 2131748314;
                            } else {
                                i7 = 2131743849;
                            }
                            v1Var.setContentDescription(hd.M0(i7, null));
                            return;
                        }
                        b4Var.a1(true);
                        return;
                }
            }
        });
        e3Var.addView(x3Var, ja.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.N0 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f11542y0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, ja.r(40, 40, 5));
        linearLayout.addView(v2Var, ja.r(40, 40, 5));
        linearLayout.addView(v2Var2, ja.r(40, 40, 5));
        addView(linearLayout, ja.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f11474g0 = imageView3;
        imageView3.setImageDrawable(y3Var.f12541q);
        imageView3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.h0(-1, 1, -1));
        imageView3.setContentDescription(hd.M0(2131754839, null));
        e3Var.addView(imageView3, ja.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.f11478h0 = imageView4;
        imageView4.setImageDrawable(y3Var.f12542r);
        imageView4.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.h0(-1, 1, -1));
        imageView4.setContentDescription(hd.M0(2131754808, null));
        e3Var.addView(imageView4, ja.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new ah.d(i9Var, 21));
        imageView3.setOnClickListener(new d0(this, e6Var, i9Var, context, y3Var, 1));
        bi.v1 v1Var = new bi.v1(context, 2);
        this.f11482i0 = v1Var;
        e3Var.addView(v1Var, ja.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ?? imageView5 = new ImageView(context);
        this.f11486j0 = imageView5;
        imageView5.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        v1Var.addView(imageView5);
        ImageView imageView6 = new ImageView(context);
        this.f11489k0 = imageView6;
        imageView6.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        imageView6.setImageDrawable(y3Var.f12544t);
        v1Var.addView(imageView6);
        imageView6.setVisibility(8);
        n8 n8Var = new n8(context);
        this.m0 = n8Var;
        n8Var.setOnClickListener(new v1(this, 2));
        e3Var.addView(n8Var, ja.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        v1Var.setOnClickListener(new View.OnClickListener(this) {
            public final b4 f12258b;

            {
                this.f12258b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7;
                int i10 = r3;
                i9 i9Var2 = i9Var;
                b4 b4Var = this.f12258b;
                switch (i10) {
                    case 0:
                        long j3 = m10.i(b4Var.f11497m2).f24959n;
                        long j10 = b4Var.l1;
                        if (j3 == j10) {
                            Bundle f10 = r.b.f(1, "type");
                            f10.putLong("dialog_id", b4Var.l1);
                            i9Var2.N(new y80(f10, null));
                            return;
                        } else if (j10 > 0) {
                            i9Var2.N(ProfileActivity.C4(j10));
                            return;
                        } else {
                            i9Var2.N(an.ua(j10));
                            return;
                        }
                    default:
                        if (b4Var.f11543y1.j()) {
                            i9Var2.U();
                            if (!i9.D1) {
                                np.e1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            bi.v1 v1Var2 = b4Var.f11482i0;
                            if (!i9.D1) {
                                i7 = 2131748314;
                            } else {
                                i7 = 2131743849;
                            }
                            v1Var2.setContentDescription(hd.M0(i7, null));
                            return;
                        }
                        b4Var.a1(true);
                        return;
                }
            }
        });
        this.Z0 = new h8(this, y3Var);
        e3Var.addView(i3Var, ja.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f11534w0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        c2 c2Var = new c2(this, context, i9Var, i9Var.f11879w, view, frameLayout, i9Var);
        this.f11530v0 = c2Var;
        e3Var.addView(view, ja.e(-1, 200, 87));
        e3Var.addView(c2Var, ja.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        e3Var.addView(frameLayout, ja.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int L2 = org.telegram.messenger.g0.L(20.0f);
        int o4 = i0.a.o(-1, 100);
        v1Var.setBackground(org.telegram.ui.ActionBar.j6.k0(L2, L2, L2, L2, 0, o4, o4));
        int L3 = org.telegram.messenger.g0.L(20.0f);
        int o10 = i0.a.o(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.k0(L3, L3, L3, L3, 0, o10, o10));
        int L4 = org.telegram.messenger.g0.L(20.0f);
        int o11 = i0.a.o(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.k0(L4, L4, L4, L4, 0, o11, o11));
        int L5 = org.telegram.messenger.g0.L(20.0f);
        int o12 = i0.a.o(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.k0(L5, L5, L5, L5, 0, o12, o12));
        int L6 = org.telegram.messenger.g0.L(20.0f);
        int o13 = i0.a.o(-1, 100);
        v2Var2.setBackground(org.telegram.ui.ActionBar.j6.k0(L6, L6, L6, L6, 0, o13, o13));
        int L7 = org.telegram.messenger.g0.L(20.0f);
        int o14 = i0.a.o(-1, 100);
        v2Var.setBackground(org.telegram.ui.ActionBar.j6.k0(L7, L7, L7, L7, 0, o14, o14));
        org.telegram.ui.Cells.r9 r9Var = i3Var.f11418a0;
        View n10 = r9Var.n(context);
        if (n10 != null) {
            org.telegram.messenger.g0.E2(n10);
            addView(n10);
        }
        r9Var.D = new d2(this, 0);
        r9Var.S(this);
    }

    public static void T0(r6 r6Var, ImageReceiver imageReceiver, String str) {
        if (r6Var.f12279s) {
            imageReceiver.u0(null, null, gc.g(r6Var.f12276f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.r0(gc.g(r6Var.f12275e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void X(b4 b4Var, ValueAnimator valueAnimator) {
        float f10;
        n8 n8Var = b4Var.m0;
        b4Var.O3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        x3 x3Var = b4Var.Y0;
        x3Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * b4Var.O3);
        x3Var.setAlpha(1.0f - b4Var.O3);
        ImageView imageView = b4Var.f11474g0;
        imageView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * b4Var.O3);
        imageView.setAlpha(1.0f - b4Var.O3);
        ImageView imageView2 = b4Var.f11478h0;
        imageView2.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * b4Var.O3);
        imageView2.setAlpha(1.0f - b4Var.O3);
        bi.v1 v1Var = b4Var.f11482i0;
        v1Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * b4Var.O3);
        v1Var.setAlpha((1.0f - b4Var.O3) * b4Var.O2);
        v2 v2Var = b4Var.G1;
        if (v2Var != null) {
            v2Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * b4Var.O3);
            b4Var.G1.setAlpha(1.0f - b4Var.O3);
        }
        if (n8Var != null) {
            n8Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * b4Var.O3);
            n8Var.setAlpha(1.0f - b4Var.O3);
        }
        b4Var.f11526u0.setAlpha(1.0f - b4Var.O3);
        u3 u3Var = b4Var.A1;
        if (u3Var == null) {
            f10 = 0.0f;
        } else {
            f10 = ((z8) u3Var).d.W;
        }
        float hideInterfaceAlpha = b4Var.getHideInterfaceAlpha();
        v2 v2Var2 = b4Var.f11499n0;
        if (v2Var2 != null) {
            v2Var2.setAlpha((1.0f - b4Var.O3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        ImageView imageView3 = b4Var.f11538x0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - b4Var.O3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        v2 v2Var3 = b4Var.f11546z0;
        if (v2Var3 != null) {
            v2Var3.setAlpha((1.0f - b4Var.O3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        k2 k2Var = b4Var.L1;
        if (k2Var != null) {
            k2Var.setAlpha(1.0f - b4Var.O3);
            b4Var.invalidate();
        }
        b4Var.M0.invalidate();
    }

    public static void Y(b4 b4Var, boolean z10) {
        org.telegram.ui.ActionBar.z0 z0Var = b4Var.f11501n3;
        if (z0Var != null && b4Var.f11498m3 != null && z0Var.getVisibility() == 0) {
            if (z10) {
                if (Math.abs(i9.B1 - 0.2f) < 0.05f) {
                    b4Var.f11501n3.setSubtext(hd.M0(2131743574, null));
                } else if (Math.abs(i9.B1 - 0.5f) < 0.05f) {
                    b4Var.f11501n3.setSubtext(hd.M0(2131743576, null));
                } else if (Math.abs(i9.B1 - 1.0f) < 0.05f) {
                    b4Var.f11501n3.setSubtext(hd.M0(2131743577, null));
                } else if (Math.abs(i9.B1 - 1.5f) < 0.05f) {
                    b4Var.f11501n3.setSubtext(hd.M0(2131743578, null));
                } else if (Math.abs(i9.B1 - 2.0f) < 0.05f) {
                    b4Var.f11501n3.setSubtext(hd.M0(2131743575, null));
                } else {
                    org.telegram.ui.ActionBar.z0 z0Var2 = b4Var.f11501n3;
                    z0Var2.setSubtext(hd.a0(null, null, 2131743579, eu0.a(i9.B1) + "x"));
                }
            }
            b4Var.f11498m3.H(z10, i9.B1);
        }
    }

    public static void Z(b4 b4Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (!b4Var.G0() && !b4Var.f11543y1.f12583f) {
            if (m10.i(b4Var.f11497m2).q()) {
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232394, hd.M0(2131744887, null), false, b4Var.f11493l0).setOnClickListener(new v1(b4Var, 8));
                return;
            }
            Drawable drawable = b4Var.getContext().getDrawable(2131232170);
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            e2 e2Var = new e2(b4Var.getContext().getDrawable(2131232382), drawable, 0);
            org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232394, hd.M0(2131744887, null), false, b4Var.f11493l0);
            c10.setOnClickListener(new v1(b4Var, 9));
            c10.setIcon(e2Var);
        }
    }

    public static void b0(b4 b4Var) {
        z3 z3Var = b4Var.f11543y1;
        TL_stories.StoryItem storyItem = z3Var.f12579a;
        if ((storyItem == null && z3Var.f12580b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = z3Var.h();
        boolean z10 = z3Var.f12582e;
        if (h != null && h.exists()) {
            MediaController.d0(h.toString(), b4Var.getContext(), z10 ? 1 : 0, null, null, new ai.u2(2, b4Var, z10));
            return;
        }
        b4Var.Y0();
    }

    public static void c0(b4 b4Var, long j3) {
        String str;
        boolean z10;
        TLRPC.User user;
        if (j3 > 0) {
            TLRPC.User a22 = np.s1(b4Var.f11497m2).a2(Long.valueOf(j3));
            str = a22.first_name;
            z10 = a22.stories_hidden;
            user = a22;
        } else {
            TLRPC.Chat M0 = np.s1(b4Var.f11497m2).M0(Long.valueOf(-j3));
            str = M0.title;
            z10 = M0.stories_hidden;
            user = M0;
        }
        org.telegram.messenger.g0.i3(new di.l(b4Var, np.s1(b4Var.f11497m2), j3, !z10, str, user), 200L);
    }

    public static void d0(b4 b4Var) {
        int i7;
        int i10;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, b4Var.getContext(), b4Var.f11493l0);
        if (b4Var.G0()) {
            i7 = 2131751564;
        } else {
            i7 = 2131751487;
        }
        String M0 = hd.M0(i7, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        if (b4Var.G0()) {
            i10 = 2131751565;
        } else {
            i10 = 2131751488;
        }
        t1Var.U = hd.M0(i10, null);
        alertDialog$Builder.k(hd.M0(2131751598, null), new q1(b4Var, 2));
        alertDialog$Builder.h(hd.M0(2131752589, null), new di.o(26));
        ((z8) b4Var.A1).h(t1Var);
        t1Var.i();
    }

    public static void f0(b4 b4Var) {
        String str;
        xb K;
        org.telegram.ui.ActionBar.e6 e6Var = b4Var.f11493l0;
        e3 e3Var = b4Var.M0;
        if (b4Var.f11511q1) {
            return;
        }
        if (b4Var.f11503o1) {
            if (b4Var.f11525t3 != null && b4Var.f11529u3 != null) {
                ug.j0.w1(new bi.t6(b4Var, 2), b4Var.f11525t3, b4Var.f11529u3, b4Var.l1, true);
                return;
            }
            i9 i9Var = b4Var.f11522t0;
            if (i9Var != null) {
                i9Var.f11856k1 = true;
                i9Var.V();
            }
            np.s1(b4Var.f11497m2).G0().a(b4Var.l1, new w1(b4Var, 0));
            return;
        }
        k2 k2Var = b4Var.L1;
        int i7 = -b4Var.f11460b1;
        b4Var.f11460b1 = i7;
        org.telegram.messenger.g0.F3(i7, k2Var, null);
        org.telegram.messenger.p2.APP_ERROR.a();
        if (b4Var.l1 >= 0) {
            str = q10.p(np.s1(b4Var.f11497m2).a2(Long.valueOf(b4Var.l1)));
        } else {
            str = "";
        }
        if (np.s1(b4Var.f11497m2).D3()) {
            K = new cc(e3Var, e6Var).Q(2131624217, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131743758, str)));
        } else {
            K = new cc(e3Var, e6Var).K(2131624217, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131743758, str)), hd.M0(2131743759, null), new t1(b4Var, 5));
        }
        K.j();
    }

    public org.telegram.messenger.c getAccountInstance() {
        return org.telegram.messenger.c.a(this.f11497m2);
    }

    public float getHideInterfaceAlpha() {
        float f10;
        float f11 = 1.0f - this.f11544y2.f39900c;
        k5 k5Var = this.f11522t0.f11882x;
        if (k5Var == null) {
            f10 = 0.0f;
        } else {
            f10 = k5Var.f11931f;
        }
        return (1.0f - f10) * f11;
    }

    public long getMessageMinPrice() {
        i9 i9Var;
        if (!this.f11543y1.f12583f || (i9Var = this.f11522t0) == null || i9Var.B0 == null || B0(true)) {
            return 0L;
        }
        return i9Var.B0.j();
    }

    public static void h0(b4 b4Var) {
        z3 z3Var = b4Var.f11543y1;
        if (z3Var.f12579a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.f28295id = z3Var.f12579a.f28290id;
        tL_stories_exportStoryLink.peer = np.s1(b4Var.f11497m2).j1(b4Var.l1);
        ConnectionsManager.getInstance(b4Var.f11497m2).sendRequest(tL_stories_exportStoryLink, new Object());
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
        textView.setText(hd.M0(2131744453, null));
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f11493l0;
        org.telegram.ui.ActionBar.q6.U(textView, i7, e6Var);
        TextView textView2 = new TextView(getContext());
        na.a(textView2);
        textView2.setText(hd.M0(2131754230, null));
        int i10 = org.telegram.ui.ActionBar.j6.Ji;
        org.telegram.ui.ActionBar.q6.U(textView2, i10, e6Var);
        textView2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 15.0f);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i11 = org.telegram.ui.ActionBar.j6.Fi;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.w0(i10, e6Var), 30);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, w02, o4, o4);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i10, 30);
        textView2.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(textView2, k02, M, g10, e6Var);
        textView2.setOnClickListener(new v1(this, 3));
        linearLayout.addView(textView, ja.o(-1, -2));
        linearLayout.addView(textView2, ja.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, ja.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.M0.addView(frameLayout);
        this.K2 = frameLayout;
    }

    public final boolean B0(boolean z10) {
        e1 e1Var;
        TLRPC.Peer i7;
        e1 e1Var2;
        long e10 = m10.i(this.f11497m2).e();
        int i10 = (this.l1 > 0L ? 1 : (this.l1 == 0L ? 0 : -1));
        i9 i9Var = this.f11522t0;
        if (i10 < 0 && (e1Var2 = i9Var.B0) != null) {
            if (z10) {
                TLRPC.Peer i11 = e1Var2.i();
                TLRPC.Chat M0 = np.s1(this.f11497m2).M0(Long.valueOf(-this.l1));
                if (i9Var.B0.l() || org.telegram.messenger.t3.w(14, M0)) {
                    if (i11 == null || this.l1 == org.telegram.messenger.m5.o(i11) || org.telegram.messenger.m5.o(i11) == m10.i(this.f11497m2).e()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } else if (i10 >= 0 && i9Var != null && (e1Var = i9Var.B0) != null && e1Var.l()) {
            if (!z10 || (i7 = i9Var.B0.i()) == null || this.l1 == org.telegram.messenger.m5.o(i7) || org.telegram.messenger.m5.o(i7) == e10 || this.l1 == e10) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public final void C0(Canvas canvas, int i7, int i10) {
        TextureView textureView;
        a4 a4Var = this.f11536w2;
        org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) a4Var.f11408e;
        if (j4Var != null && ((SurfaceView) a4Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                org.telegram.messenger.g0.z0((SurfaceView) a4Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else if (j4Var != null && (textureView = (TextureView) a4Var.f11409f) != null) {
            Bitmap bitmap = textureView.getBitmap(i7, i10);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            canvas.save();
            e3 e3Var = this.M0;
            canvas.scale(i7 / e3Var.getMeasuredWidth(), i10 / e3Var.getMeasuredHeight());
            this.O0.h(canvas, null);
            canvas.restore();
        }
    }

    public final void D0(hi.o8 o8Var, TL_stories.StoryItem storyItem) {
        int i7;
        View[] viewPages;
        u3 u3Var = this.A1;
        Context context = getContext();
        if (storyItem.pinned) {
            i7 = Integer.MAX_VALUE;
        } else {
            i7 = storyItem.expire_date - storyItem.date;
        }
        hi.q8 q8Var = new hi.q8(i7, context, this.f11493l0);
        q8Var.W0(o8Var);
        hi.i1 i1Var = q8Var.f14918m1;
        if (i1Var != null) {
            for (View view : i1Var.getViewPages()) {
                if (view instanceof hi.l8) {
                    ((hi.l8) view).f(false);
                }
            }
        }
        q8Var.Q0(true);
        q8Var.O1 = new ab.g(17, this, storyItem);
        ((z8) u3Var).h(q8Var);
    }

    public final boolean E0(android.view.ViewGroup r11, float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: fi.b4.E0(android.view.ViewGroup, float, float, boolean):boolean");
    }

    public final boolean F0(View view, MotionEvent motionEvent) {
        float x10 = getX();
        e3 e3Var = this.M0;
        float x11 = view.getX() + e3Var.getX() + x10;
        float y10 = view.getY() + e3Var.getY() + getY();
        if (motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + view.getWidth() && motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + view.getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean G0() {
        k6 k6Var;
        i9 i9Var = this.f11522t0;
        if (i9Var != null && (k6Var = i9Var.O0) != null && k6Var.f11941e == 4) {
            return true;
        }
        return false;
    }

    public final boolean H0() {
        TLRPC.User a22;
        if (!G0() || (a22 = np.s1(this.f11497m2).a2(Long.valueOf(this.f11522t0.O0.d))) == null || !a22.bot || !a22.bot_can_edit) {
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
        z3 z3Var = this.f11543y1;
        TL_stories.StoryItem storyItem = z3Var.f12579a;
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
            this.C1.j0(this.l1, z3Var.f12579a, null);
        } else if (p0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.b0(this.f11497m2).f26505r.get("❤");
            if (tL_availableReaction != null) {
                this.Z2 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a10 = ch.l0.a();
                gc b10 = gc.b(document);
                ImageReceiver imageReceiver = this.V2;
                imageReceiver.q0(b10, a10, null, null, null, 0);
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                this.f11459a3 = true;
                this.C1.j0(this.l1, z3Var.f12579a, ch.p0.c(tL_availableReaction));
            }
        } else {
            j0();
            this.C1.j0(this.l1, z3Var.f12579a, p0Var);
        }
        TL_stories.StoryItem storyItem2 = z3Var.f12579a;
        v2 v2Var = this.f11499n0;
        if (storyItem2 != null && (reaction = storyItem2.sent_reaction) != null) {
            z10 = !z10;
            this.f11502o0.setReaction(ch.p0.d(reaction));
            v2Var.setContentDescription(hd.M0(2131754850, null));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z11 = true;
        } else {
            this.f11502o0.setReaction(null);
            v2Var.setContentDescription(hd.M0(2131754851, null));
            z11 = false;
        }
        if (this.n1 && z10) {
            TL_stories.StoryItem storyItem3 = z3Var.f12579a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = z3Var.f12579a.views;
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
        TL_stories.StoryItem storyItem4 = z3Var.f12579a;
        ch.s0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        i1(true);
    }

    public final void K0() {
        e1 e1Var;
        boolean z10;
        if (this.f11545y3 == null) {
            i9 i9Var = this.f11522t0;
            if (i9Var != null && (e1Var = i9Var.B0) != null) {
                TLRPC.GroupCall groupCall = e1Var.f11661w;
                if (groupCall == null) {
                    z10 = false;
                } else {
                    z10 = !groupCall.messages_enabled;
                }
                if (z10) {
                    return;
                }
            }
            TLRPC.TL_channels_sendAsPeers M1 = np.s1(this.f11497m2).M1(this.l1, true);
            this.f11545y3 = M1;
            k2 k2Var = this.L1;
            if (k2Var != null && M1 != null) {
                k2Var.j2(true);
            }
        }
    }

    public final boolean L0() {
        k2 k2Var = this.L1;
        if (k2Var == null) {
            return false;
        }
        boolean z10 = k2Var.f32209h3;
        if (z10) {
            k2Var.K1();
        }
        org.telegram.messenger.g0.i3(new t1(this, 3), 300L);
        return z10;
    }

    public final void M0() {
        CharSequence charSequence;
        long j3;
        w1 w1Var;
        int i7;
        long j10;
        long j11;
        np.e1().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.L1.getTextWithEntities();
        long e10 = m10.i(this.f11497m2).e();
        TLRPC.Peer i10 = this.f11522t0.B0.i();
        if (i10 != null) {
            e10 = org.telegram.messenger.m5.o(i10);
        }
        Context context = getContext();
        int i11 = this.f11497m2;
        String s5 = org.telegram.messenger.m5.s(i11, this.l1);
        long messageMinPrice = getMessageMinPrice();
        long j12 = this.f11533v3;
        w1 w1Var2 = new w1(this, 1);
        b bVar = new b();
        org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(1, context, (org.telegram.ui.ActionBar.e6) bVar, false);
        u2Var.O();
        u2Var.f29720w0 = false;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        u2Var.O = f10;
        int[] iArr = np.s1(i11).Y6;
        CharSequence j02 = gj.j0(textWithEntities, false, false, new TextPaint());
        if (j02 instanceof Spannable) {
            Spannable spannable = (Spannable) j02;
            charSequence = j02;
            j3 = j12;
            w1Var = w1Var2;
            i7 = ((org.telegram.ui.Components.p5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.p5.class)).length + ((org.telegram.messenger.g6[]) spannable.getSpans(0, charSequence.length(), org.telegram.messenger.g6.class)).length;
        } else {
            charSequence = j02;
            j3 = j12;
            w1Var = w1Var2;
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
        obj.f12299c = e10;
        obj.f12301f = textWithEntities;
        obj.f12302g = jArr[0];
        n0 n0Var = new n0(i11, context, true);
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
        bi.g2 g2Var = new bi.g2(context, hd.M0(2131748814, null), bVar);
        f11.addView(g2Var, ja.q(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        bi.g2 g2Var2 = new bi.g2(context, hd.M0(2131748815, null), bVar);
        f11.addView(g2Var2, ja.q(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        bi.g2 g2Var3 = new bi.g2(context, hd.M0(2131748816, null), bVar);
        f11.addView(g2Var3, ja.q(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        s sVar = new s(context, bVar, r1);
        w1 w1Var3 = w1Var;
        long j13 = j11;
        z10[] z10VarArr = {new r(jArr, dVar, new eq[1], (s0) obj, n0Var, i11, g2Var, g2Var2, g2Var3, sVar, new boolean[]{true})};
        n0Var.set(obj);
        int i15 = 9;
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int i16 = np.s1(i11).Z6;
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
        sVar.f8579f0 = iArr4;
        sVar.setValue((int) jArr[0]);
        f10.addView(sVar, ja.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        z10VarArr[0].a(Integer.valueOf((int) jArr[0]));
        f10.addView(f11, ja.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i20 = org.telegram.ui.ActionBar.j6.f28957j5;
        TextView b10 = c8.sa.b(context, 20.0f, i20, true, bVar);
        org.telegram.messenger.k5.l(b10, 17, null, 2131748811);
        f10.addView(b10, ja.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = c8.sa.b(context, 14.0f, i20, false, bVar);
        b11.setGravity(17);
        org.telegram.messenger.k5.q(null, null, 2131748812, new Object[]{s5}, b11);
        f10.addView(b11, ja.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        f10.addView(n0Var, ja.t(-2, -2, 17, 42, 22, 42, 20));
        f10.addView(dVar, ja.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        u2Var.show();
        dVar.setOnClickListener(new ah.g(w1Var3, jArr, u2Var, 9));
    }

    public final void N0() {
        if (this.L1 == null) {
            return;
        }
        r0();
        this.f11520s2.f36435e2.i0();
        this.f11520s2.y1(-1, true);
        p2 p2Var = this.f11520s2;
        p2Var.U1 = this.l1;
        p2Var.e1();
        this.f11520s2.a1().setText(this.L1.getFieldText());
        ((z8) this.A1).h(this.f11520s2);
    }

    public final void O0() {
        Bundle bundle = new Bundle();
        long j3 = this.l1;
        if (j3 < 0) {
            bundle.putLong("chat_id", -j3);
        } else {
            bundle.putLong("user_id", j3);
        }
        TLRPC.Dialog S0 = np.s1(this.f11497m2).S0(this.l1);
        if (S0 != null) {
            bundle.putInt("message_id", S0.top_message);
        }
        this.f11522t0.N(new an(bundle));
    }

    public final void P0(long r22) {
        throw new UnsupportedOperationException("Method not decompiled: fi.b4.P0(long):void");
    }

    public final void Q0(android.net.Uri r18) {
        throw new UnsupportedOperationException("Method not decompiled: fi.b4.Q0(android.net.Uri):void");
    }

    public final void R0(long j3, boolean z10) {
        int i7;
        int i10;
        z3 z3Var;
        if (this.f11527u1 != z10) {
            this.f11527u1 = z10;
            fh0 fh0Var = this.f11486j0;
            int i11 = 0;
            if (z10) {
                if (this.f11522t0.f11830a && Build.VERSION.SDK_INT < 33) {
                    i9 i9Var = ((z8) this.A1).d;
                    i9Var.l1 = true;
                    i9Var.V();
                    sa saVar = this.G3;
                    org.telegram.messenger.g0.r(saVar);
                    org.telegram.messenger.g0.i3(saVar, 100L);
                }
                P0(j3);
                e1();
                fh0Var.setAnimation(this.f11479h1.f12545u);
                this.f11527u1 = true;
                this.Y0.f12493a.getImageReceiver().O0(true, true);
                if (this.f11543y1.f12579a != null) {
                    org.telegram.messenger.a8.b("StoryViewer displayed story dialogId=" + this.l1 + " storyId=" + z3Var.f12579a.f28290id + " " + z3.c(z3Var));
                }
            } else {
                n0();
                fh0Var.a();
                this.V0 = null;
                this.f11532v2 = false;
                this.f11544y2.e(true, 0.0f);
                this.M0.invalidate();
                invalidate();
                o0();
                i9 i9Var2 = ((z8) this.A1).d;
                i9Var2.I0 = false;
                i9Var2.V();
            }
            if (this.f11527u1) {
                i7 = 3;
            } else {
                i7 = 2;
            }
            this.O0.h0(i7);
            if (this.f11527u1) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            this.P0.h0(i10);
            if (this.f11527u1) {
                i11 = 2;
            }
            this.Q0.h0(i11);
            if (this.f11496m1 || this.n1) {
                s6 s6Var = this.C1;
                long j10 = this.l1;
                boolean z11 = this.f11527u1;
                a0.h hVar = s6Var.f12329m;
                r9 r9Var = (r9) hVar.f(j10);
                if (r9Var == null) {
                    r9Var = new r9(s6Var.f12319a, j10, s6Var);
                    hVar.k(r9Var, j10);
                }
                r9Var.b(z11);
            }
        }
    }

    public final void S0(int i7, long j3) {
        if (this.l1 != j3) {
            z3 z3Var = this.f11543y1;
            z3Var.f12580b = null;
            z3Var.f12579a = null;
        }
        this.l1 = j3;
        this.f11487j1 = null;
        m0(i7);
        TL_stories.PeerStories peerStories = this.f11522t0.Q0;
        boolean z10 = true;
        if (peerStories != null) {
            this.C1.V(peerStories, true);
            return;
        }
        s6 s6Var = this.C1;
        TL_stories.PeerStories y10 = s6Var.y(j3);
        if (y10 == null) {
            y10 = s6Var.z(j3);
        } else {
            z10 = false;
        }
        s6Var.V(y10, z10);
    }

    public final void U0(long j3, boolean z10, boolean z11) {
        String str;
        if (!z10 && j3 == this.f11537w3 && this.f11541x3 == z11) {
            return;
        }
        this.f11537w3 = j3;
        this.f11541x3 = z11;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        x3 x3Var = this.Y0;
        if (i7 >= 0) {
            if (this.f11496m1 && !z11) {
                x3Var.f12494b.l(hd.M0(2131745641, null), false);
                x3Var.f12494b.i(null);
                return;
            }
            TLRPC.User a22 = np.s1(this.f11497m2).a2(Long.valueOf(j3));
            if (a22 != null && a22.verified) {
                Drawable mutate = getContext().getDrawable(2131232794).mutate();
                mutate.setAlpha(255);
                fq fqVar = new fq(mutate, null);
                fqVar.f34682x = true;
                int L = org.telegram.messenger.g0.L(16.0f);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                fqVar.h = L;
                fqVar.f34678n = L2;
                x3Var.f12494b.i(fqVar);
            } else {
                x3Var.f12494b.i(null);
            }
            if (a22 != null) {
                x3Var.f12494b.l(org.telegram.messenger.j6.m(org.telegram.messenger.g0.D2(org.telegram.messenger.g5.p(a22)), x3Var.f12494b.getPaint().getFontMetricsInt(), false, null, 0), false);
                return;
            }
            x3Var.f12494b.l(null, false);
            return;
        }
        TLRPC.Chat M0 = np.s1(this.f11497m2).M0(Long.valueOf(-j3));
        w3 w3Var = x3Var.f12494b;
        w3 w3Var2 = x3Var.f12494b;
        if (M0 == null) {
            str = "";
        } else {
            str = M0.title;
        }
        w3Var.l(org.telegram.messenger.g0.D2(str), false);
        if (M0 != null && M0.verified) {
            Drawable mutate2 = getContext().getDrawable(2131232794).mutate();
            mutate2.setAlpha(255);
            fq fqVar2 = new fq(mutate2, null);
            fqVar2.f34682x = true;
            int L3 = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            fqVar2.h = L3;
            fqVar2.f34678n = L4;
            w3Var2.i(fqVar2);
            return;
        }
        w3Var2.i(null);
    }

    public final void V0(float f10, float f11, g4 g4Var) {
        this.W0 = f10;
        this.f11492k3 = 1.0f / f11;
        if (this.V0 != g4Var) {
            this.V0 = g4Var;
            if (g4Var != null) {
                ImageReceiver imageReceiver = g4Var.f11736a;
                if (imageReceiver.n() != null) {
                    Bitmap copy = imageReceiver.n().copy(Bitmap.Config.ARGB_8888, false);
                    u2 u2Var = this.O0;
                    u2Var.f22265d0 = null;
                    u2Var.f22258a1.setShader(null);
                    u2Var.N0(new BitmapDrawable(copy));
                }
            }
        }
    }

    public final void W0(boolean z10) {
        boolean z11;
        z3 z3Var = this.f11543y1;
        if (z3Var.f12579a != null) {
            i9 i9Var = this.f11522t0;
            if (i9Var.f11844f != null) {
                String e10 = z3Var.e();
                TLRPC.Chat chat = null;
                if (z10) {
                    i2 i2Var = new i2(2, this.f11493l0);
                    if (this.n1) {
                        chat = np.s1(this.f11497m2).M0(Long.valueOf(-this.l1));
                    }
                    if (np.s1(this.f11497m2).X4() && ((!this.n1 && !q10.A(this.l1)) || org.telegram.messenger.t3.t0(chat))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    s2 s2Var = new s2(this, i9Var.f11844f.getContext(), e10, e10, z11, i2Var);
                    this.J2 = s2Var;
                    s2Var.f38343e2 = true;
                    TL_stories.StoryItem storyItem = z3Var.f12579a;
                    storyItem.dialogId = this.l1;
                    s2Var.B2 = storyItem;
                    s2Var.f38355o2 = new ob.c(this, 21);
                    ((z8) this.A1).h(s2Var);
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", e10);
                LaunchActivity.H1.startActivityForResult(Intent.createChooser(intent, hd.M0(2131744846, null)), 500);
            }
        }
    }

    public final void X0() {
        e3 e3Var = this.M0;
        org.telegram.ui.ActionBar.e6 e6Var = this.f11493l0;
        org.telegram.messenger.k5.o(null, 2131743833, new cc(e3Var, e6Var), e6Var);
    }

    public final void Y0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f11493l0);
        String M0 = hd.M0(2131689472, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        alertDialog$Builder.k(hd.M0(2131747831, null), null);
        t1Var.U = hd.M0(2131747218, null);
        ((z8) this.A1).h(t1Var);
    }

    public final void Z0(boolean z10) {
        if (this.f11465c3 != z10) {
            z3 z3Var = this.f11543y1;
            if (z3Var.f12579a != null) {
                this.f11465c3 = z10;
                if (z10) {
                    this.f11462b3.setVisibility(0);
                }
                this.f11462b3.setStoryItem(z3Var.f12579a);
                i9 i9Var = ((z8) this.A1).d;
                i9Var.f11864p1 = z10;
                i9Var.V();
                float f10 = 0.0f;
                if (z10) {
                    float f11 = this.f11467d3;
                    if (z10) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    this.f11462b3.setTransitionProgress(this.f11467d3);
                    ofFloat.addUpdateListener(new u1(this, 1));
                    ofFloat.addListener(new f2(this, z10, 0));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(er.f34420g);
                    ofFloat.start();
                    return;
                }
                if (this.f11462b3.getReactionsWindow() != null) {
                    this.f11462b3.getReactionsWindow().e();
                }
                this.f11462b3.animate().alpha(0.0f).setDuration(150L).setListener(new g2(this, 0)).start();
            }
        }
    }

    public final void a1(boolean z10) {
        int i7;
        if (this.f11510q0 == null) {
            hi.l3 l3Var = new hi.l3(getContext(), 1);
            l3Var.o(1.0f, -56.0f);
            this.f11510q0 = l3Var;
            l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
            this.M0.addView(this.f11510q0, ja.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        hi.l3 l3Var2 = this.f11510q0;
        if (z10) {
            i7 = 2131744607;
        } else {
            i7 = 2131744457;
        }
        l3Var2.u(hd.M0(i7, null));
        this.f11510q0.w();
    }

    public final boolean b1(boolean z10) {
        if (this.f11522t0.R0) {
            z10 = !z10;
        }
        if (z10) {
            if (this.f11523t1 < getStoriesCount() - 1) {
                this.f11523t1++;
                d1(false);
                return true;
            }
        } else {
            int i7 = this.f11523t1;
            if (i7 > 0) {
                this.f11523t1 = i7 - 1;
                d1(false);
                return true;
            }
        }
        return false;
    }

    public final void c1() {
        if (!np.s1(this.f11497m2).X4()) {
            return;
        }
        File h = this.f11543y1.h();
        if (h != null && h.exists()) {
            s2 s2Var = this.J2;
            if (s2Var != null) {
                s2Var.dismiss();
            }
            org.telegram.messenger.g0.i3(new t1(this, 8), 120L);
            return;
        }
        Y0();
    }

    public final void d1(boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: fi.b4.d1(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        float f10;
        e1 e1Var;
        boolean z10;
        int i11 = ns.f25592v5;
        long j3 = 0;
        i9 i9Var = this.f11522t0;
        boolean z11 = false;
        if (i7 != i11 && (i7 != ns.f25606x5 || i9Var.O0 != objArr[0])) {
            if (i7 == ns.f25535m3) {
                d1(false);
                return;
            } else if (i7 == ns.f25515i4) {
                this.f11526u0.f11420c0.invalidate();
                return;
            } else if (i7 == ns.D5) {
                p0(true);
                return;
            } else if (i7 == ns.f25473b3) {
                m6 o4 = np.s1(this.f11497m2).P1().o();
                if (o4 != null && o4.a(this.f11497m2, 1) && this.A1 != null) {
                    bi.t6 t6Var = new bi.t6(this, 2);
                    Context W = org.telegram.messenger.g0.W(getContext());
                    if (W == null) {
                        W = LaunchActivity.H1;
                    }
                    ((z8) this.A1).h(new ug.j0(o4.b(), this.f11497m2, W, t6Var, null));
                    return;
                }
                return;
            } else if (i7 == ns.f25514i3) {
                TL_account.RequirementToContact J2 = np.s1(this.f11497m2).J2(this.l1);
                if (this.l1 >= 0 && !m10.i(this.f11497m2).q() && (J2 instanceof TL_account.requirementToContactPremium)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f11507p1 != z10 || this.f11515r1 != org.telegram.messenger.m5.k(J2)) {
                    this.f11507p1 = z10;
                    this.f11515r1 = org.telegram.messenger.m5.k(J2);
                    d1(false);
                    p0(true);
                    return;
                }
                return;
            } else if (i7 == ns.T) {
                Object obj = objArr[0];
                if ((obj instanceof TLRPC.ChatFull) && this.l1 == (-((TLRPC.ChatFull) obj).f28052id)) {
                    d1(false);
                    return;
                }
                return;
            } else if (i7 == ns.G2) {
                long longValue = ((Long) objArr[0]).longValue();
                if (i9Var != null && (e1Var = i9Var.B0) != null && e1Var.g() == longValue) {
                    d1(false);
                    k2 k2Var = this.L1;
                    if (k2Var != null) {
                        k2Var.N(true);
                        this.L1.j2(true);
                        p0(true);
                    }
                    c2 c2Var = this.f11530v0;
                    if (c2Var != null) {
                        e1 e1Var2 = c2Var.Q;
                        if (e1Var2 != null) {
                            j3 = e1Var2.j();
                        }
                        if (c2Var.I != j3) {
                            c2Var.f12382e.O(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i7 == ns.F && ((Boolean) objArr[2]).booleanValue()) {
                K0();
                return;
            } else {
                return;
            }
        }
        u3 u3Var = this.A1;
        if (u3Var == null || !((z8) u3Var).d.H0) {
            if (this.f11527u1) {
                h1();
                if (this.f11490k1 == 0) {
                    if (!this.f11504o2) {
                        this.f11504o2 = true;
                        ((z8) this.A1).j();
                        return;
                    }
                    return;
                }
                int i12 = this.f11523t1;
                ArrayList arrayList = this.f11471f1;
                int size = arrayList.size();
                ArrayList arrayList2 = this.f11475g1;
                if (i12 >= arrayList2.size() + size) {
                    this.f11523t1 = (arrayList2.size() + arrayList.size()) - 1;
                }
                d1(false);
                if (this.f11496m1 || this.n1) {
                    i1(true);
                }
            }
            TL_stories.PeerStories peerStories = i9Var.Q0;
            if (peerStories != null) {
                this.C1.V(peerStories, true);
            } else {
                long j10 = this.l1;
                if (j10 != 0) {
                    s6 s6Var = this.C1;
                    TL_stories.PeerStories y10 = s6Var.y(j10);
                    if (y10 == null) {
                        y10 = s6Var.z(j10);
                        z11 = true;
                    }
                    s6Var.V(y10, z11);
                }
            }
            org.telegram.ui.ActionBar.z0 z0Var = this.f11463c1;
            if (z0Var != null) {
                ViewPropertyAnimator animate = z0Var.animate();
                if (this.C1.M(this.l1) && this.f11543y1.f12582e && !gz.b()) {
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
        org.telegram.ui.Components.g6 g6Var;
        org.telegram.ui.Components.g6 g6Var2;
        j1();
        if (this.n1 && (g6Var2 = this.A0) != null) {
            g6Var2.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(40.0f));
        }
        if (this.n1 && (g6Var = this.B0) != null) {
            g6Var.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.f11470e3;
        LinearLayout linearLayout = this.f11542y0;
        v2 v2Var = this.f11499n0;
        if (z10) {
            float measuredWidth = (v2Var.getMeasuredWidth() / 2.0f) + v2Var.getX() + linearLayout.getX();
            float measuredHeight = (v2Var.getMeasuredHeight() / 2.0f) + v2Var.getY() + linearLayout.getY();
            int L = org.telegram.messenger.g0.L(24.0f);
            float f10 = L / 2.0f;
            float T1 = org.telegram.messenger.g0.T1(this.f11477g3, measuredWidth - f10, er.f34420g.getInterpolation(this.f11473f3));
            float T12 = org.telegram.messenger.g0.T1(this.f11481h3, measuredHeight - f10, this.f11473f3);
            int W1 = org.telegram.messenger.g0.W1(this.f11473f3, this.f11485i3, L);
            if (this.Z2) {
                org.telegram.ui.Components.g5 g5Var = this.Y2;
                if (g5Var != null) {
                    float f11 = W1;
                    g5Var.setBounds((int) T1, (int) T12, (int) (T1 + f11), (int) (T12 + f11));
                    this.Y2.draw(canvas);
                }
            } else {
                float f12 = W1;
                ImageReceiver imageReceiver = this.X2;
                imageReceiver.y0(T1, T12, f12, f12);
                imageReceiver.h(canvas, null);
            }
        }
        if (this.f11459a3) {
            float measuredWidth2 = (v2Var.getMeasuredWidth() / 2.0f) + v2Var.getX() + linearLayout.getX();
            float measuredHeight2 = (v2Var.getMeasuredHeight() / 2.0f) + v2Var.getY() + linearLayout.getY();
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
                    this.f11459a3 = false;
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
                        this.f11459a3 = false;
                    }
                } else {
                    this.f11459a3 = false;
                }
            }
        }
        k2 k2Var = this.L1;
        if (k2Var != null) {
            ud udVar2 = k2Var.f32201g2;
            ud udVar3 = k2Var.f32208h2;
            if (k2Var.getAlpha() != 0.0f && (udVar = k2Var.f32193f1) != null && udVar.getParent() != null && k2Var.f32193f1.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(k2Var.f32193f1.getX() + udVar2.getX() + udVar3.getX() + k2Var.getX(), k2Var.f32193f1.getY() + udVar2.getY() + udVar3.getY() + k2Var.getY());
                if (k2Var.getAlpha() != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, k2Var.getMeasuredWidth(), k2Var.getMeasuredHeight(), (int) (k2Var.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                k2Var.f32193f1.draw(canvas2);
                canvas2.restoreToCount(save);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        mi0 mi0Var;
        mi0 mi0Var2;
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
        k2 k2Var = this.L1;
        Paint paint = this.X1;
        v2 v2Var = this.f11499n0;
        y3 y3Var = this.f11479h1;
        if (view == k2Var) {
            float f11 = this.f11458a2;
            int i7 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            z3 z3Var = this.f11543y1;
            if (i7 > 0 && !z3Var.f12583f) {
                y3Var.f12536l.setAlpha((int) (f11 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), y3Var.f12536l);
            }
            RectF rectF = y3Var.h;
            RectF rectF2 = y3Var.f12533i;
            RectF rectF3 = y3Var.f12534j;
            rectF.set(this.L1.getX(), this.L1.getY() + this.L1.getAnimatedTop() + org.telegram.messenger.g0.L(1.33f), this.L1.getX() + this.L1.getMeasuredWidth(), this.L1.getY() + this.L1.getMeasuredHeight());
            float L2 = org.telegram.messenger.g0.L(40.0f);
            if (!z3Var.f12583f) {
                if (this.C2) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
                if (this.D2 && this.n1) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
                if (v2Var != null && v2Var.getVisibility() == 0) {
                    L2 = (L2 - org.telegram.messenger.g0.L(40.0f)) + v2Var.getLayoutParams().width;
                }
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(46.0f);
                L2 = org.telegram.messenger.g0.L(46.0f);
                l1 l1Var = this.K1;
                if (l1Var != null && l1Var.getVisibility() == 0) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
            }
            rectF2.set(org.telegram.messenger.g0.L(10.0f) + L, ((this.L1.getY() + this.L1.getMeasuredHeight()) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(38.0f), (getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f)) - L2, (this.L1.getY() + this.L1.getMeasuredHeight()) - org.telegram.messenger.g0.L(5.0f));
            this.L1.setTranslationX((1.0f - this.f11458a2) * L);
            if (this.L1.getMeasuredHeight() > org.telegram.messenger.g0.L(50.0f)) {
                f10 = ((1.0f - this.f11458a2) * (this.L1.getMeasuredHeight() - org.telegram.messenger.g0.L(50.0f))) + 0.0f;
            } else {
                f10 = 0.0f;
            }
            this.L1.getEditField().setTranslationY(com.google.android.gms.internal.vision.e2.z(1.0f, this.f11458a2, -org.telegram.messenger.g0.L(2.0f), f10));
            float L3 = org.telegram.messenger.g0.L(50.0f) / 2.0f;
            org.telegram.messenger.g0.Z1(rectF2, y3Var.h, this.f11458a2, rectF3);
            fh.g gVar = this.V1;
            if (gVar != null) {
                gVar.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                gVar.r(L3);
                gVar.setAlpha((int) ((1.0f - this.O3) * (1.0f - this.f11461b2) * 255.0f * getHideInterfaceAlpha()));
                gVar.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, L3, L3, paint);
            }
            if (this.f11458a2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            }
        } else if (k2Var != null && k2Var.H0(view)) {
            float L4 = org.telegram.messenger.g0.L(30.0f);
            RectF rectF4 = y3Var.f12535k;
            RectF rectF5 = y3Var.f12535k;
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
                view.setTranslationY(((this.L1.getY() + this.L1.getAnimatedTop()) + (-mi0Var.getMeasuredHeight())) - org.telegram.messenger.g0.L(18.0f));
            } else {
                if (view == this.f11462b3) {
                    view.setTranslationY((this.f11542y0.getY() + (v2Var.getY() + (-(mi0Var2.getMeasuredHeight() - this.f11462b3.getPaddingBottom())))) - org.telegram.messenger.g0.L(18.0f));
                } else {
                    e3 e3Var = this.M0;
                    if (view == e3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (fVar = this.f11517r3) != null && !fVar.f58442r) {
                        RecordingCanvas h = fVar.h(getMeasuredWidth(), getMeasuredHeight());
                        h.drawColor(i0.a.f(0.2f, -16777216, -1));
                        h.translate(e3Var.getX(), e3Var.getY());
                        view.draw(h);
                        fVar.i();
                    }
                }
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e1() {
        throw new UnsupportedOperationException("Method not decompiled: fi.b4.e1():void");
    }

    public final void f1() {
        int i7;
        if (this.f11511q1) {
            TextView textView = this.R1;
            if (textView != null) {
                textView.setText(hd.M0(2131748823, null));
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
            if (this.f11503o1) {
                i7 = 2131744665;
            } else {
                i7 = 2131744493;
            }
            textView3.setText(hd.M0(i7, null));
        }
        TextView textView4 = this.S1;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.S1.setText(hd.M0(2131744492, null));
        }
    }

    public final void g1() {
        TL_stories.PeerStories peerStories;
        int i7;
        ArrayList arrayList = this.f11487j1;
        i9 i9Var = this.f11522t0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.f11475g1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i7 = arrayList2.size();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    long j3 = ((r6) arrayList2.get(i10)).f12272a;
                    if (((int) (j3 ^ (j3 >>> 32))) == i9Var.P0) {
                        this.f11523t1 = i10;
                        return;
                    }
                }
            } else {
                i7 = 0;
            }
            int indexOf = this.f11487j1.indexOf(Integer.valueOf(i9Var.P0));
            if (indexOf < 0 && !this.f11487j1.isEmpty()) {
                if (i9Var.P0 > ((Integer) this.f11487j1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (i9Var.P0 < ((Integer) i5.c.h(1, this.f11487j1)).intValue()) {
                    indexOf = this.f11487j1.size() - 1;
                }
            }
            this.f11523t1 = i7 + indexOf;
        } else {
            int i11 = i9Var.f11843e1.get(this.l1, -1);
            this.f11523t1 = i11;
            if (i11 == -1 && !i9Var.N0 && (peerStories = this.f11468e1) != null && peerStories.max_read_id > 0) {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f11471f1;
                    if (i12 >= arrayList3.size()) {
                        break;
                    } else if (((TL_stories.StoryItem) arrayList3.get(i12)).f28290id > this.f11468e1.max_read_id) {
                        this.f11523t1 = i12;
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        if (this.f11523t1 == -1) {
            this.f11523t1 = 0;
        }
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.f11487j1;
    }

    public long getCurrentPeer() {
        return this.l1;
    }

    public int getListPosition() {
        return this.f11531v1;
    }

    public Bitmap getPlayingBitmap() {
        e3 e3Var = this.M0;
        Bitmap createBitmap = Bitmap.createBitmap(e3Var.getWidth(), e3Var.getHeight(), Bitmap.Config.ARGB_8888);
        C0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.f11523t1;
    }

    public s6 getStoriesController() {
        return np.s1(this.f11497m2).P1();
    }

    public int getStoriesCount() {
        return Math.max(this.f11500n2, this.f11471f1.size()) + this.f11475g1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f11471f1;
    }

    public final void h1() {
        k6 k6Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f11471f1;
        arrayList.clear();
        i9 i9Var = this.f11522t0;
        if (i9Var.N0) {
            if (!i9Var.S0) {
                arrayList.add(i9Var.T0);
            }
        } else {
            ArrayList arrayList2 = this.f11487j1;
            int i7 = 0;
            ArrayList arrayList3 = this.f11475g1;
            if (arrayList2 != null && (k6Var = i9Var.O0) != null) {
                if (k6Var instanceof c6) {
                    arrayList3.clear();
                    ArrayList F = np.s1(this.f11497m2).P1().F(this.l1);
                    String str = ((c6) i9Var.O0).E;
                    if (F != null) {
                        for (int i10 = 0; i10 < F.size(); i10++) {
                            r6 r6Var = (r6) F.get(i10);
                            hi.d7 d7Var = r6Var.f12274c;
                            if (d7Var != null && !d7Var.f14139g && TextUtils.equals(d7Var.K0, str)) {
                                arrayList3.add(r6Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.f11487j1;
                int size = arrayList4.size();
                while (i7 < size) {
                    Object obj = arrayList4.get(i7);
                    i7++;
                    gj f10 = i9Var.O0.f(((Integer) obj).intValue());
                    if (f10 != null && (storyItem = f10.f23824l) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (i9Var.O0 != null) {
                while (i7 < i9Var.O0.f11944i.size()) {
                    arrayList.add(((gj) i9Var.O0.f11944i.get(i7)).f23824l);
                    i7++;
                }
            } else {
                TL_stories.PeerStories peerStories = i9Var.Q0;
                if (peerStories != null && org.telegram.messenger.m5.o(peerStories.peer) == this.l1) {
                    this.f11468e1 = i9Var.Q0;
                } else {
                    TL_stories.PeerStories y10 = this.C1.y(this.l1);
                    this.f11468e1 = y10;
                    if (y10 == null) {
                        this.f11468e1 = this.C1.z(this.l1);
                    }
                }
                this.f11500n2 = 0;
                TL_stories.PeerStories peerStories2 = this.f11468e1;
                if (peerStories2 != null) {
                    this.f11500n2 = peerStories2.stories.size();
                    arrayList.addAll(this.f11468e1.stories);
                }
                arrayList3.clear();
                ArrayList F2 = this.C1.F(this.l1);
                if (F2 != null) {
                    arrayList3.addAll(F2);
                }
            }
        }
        this.f11490k1 = getStoriesCount();
    }

    public final void i0(boolean z10) {
        b4 currentPeerView;
        r40 r40Var = this.f11524t2;
        if (r40Var != null) {
            r40Var.f38848f0 = null;
            r40Var.a(false);
        }
        long j3 = this.l1;
        TL_stories.StoryItem storyItem = this.f11543y1.f12579a;
        i9 i9Var = this.f11522t0;
        i9Var.getClass();
        if (j3 != 0 && storyItem != null) {
            i9.E1.remove(j3 + (j3 >> 16) + (storyItem.f28290id << 16));
        }
        this.S2 = true;
        y8 y8Var = i9Var.f11861o0;
        if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
            currentPeerView.q0();
        }
        if (z10) {
            xb J = new cc(this.M0, this.f11493l0).J(2131624029, hd.M0(2131748483, null), hd.M0(2131743552, null), 5000, false, new t1(this, 2));
            J.f41643r = false;
            J.k(false);
        }
        np.s1(this.f11497m2).s0(this.l1, 0, null);
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
        z3 z3Var = this.f11543y1;
        TL_stories.StoryItem storyItem = z3Var.f12579a;
        if (storyItem == null) {
            storyItem = z3Var.f12581c;
        }
        boolean z13 = this.n1;
        if (z13 || this.f11496m1) {
            if (storyItem != null) {
                i9 i9Var = this.f11522t0;
                v2 v2Var = this.f11499n0;
                if (z13) {
                    if (storyItem.views == null) {
                        storyItem.views = new TL_stories.TL_storyViews();
                    }
                    TL_stories.StoryViews storyViews = storyItem.views;
                    if (storyViews.views_count <= 0) {
                        storyViews.views_count = 1;
                    }
                    org.telegram.ui.Components.g6 g6Var = this.B0;
                    if (g6Var != null && (i10 = storyViews.forwards_count) > 0) {
                        String num = Integer.toString(i10);
                        if (z10 && this.F0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        g6Var.t(num, z12, true);
                        this.F0 = true;
                    } else {
                        this.F0 = false;
                    }
                    int i11 = storyItem.views.reactions_count;
                    if (i11 > 0) {
                        org.telegram.ui.Components.g6 g6Var2 = this.A0;
                        String num2 = Integer.toString(i11);
                        if (z10 && this.E0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        g6Var2.t(num2, z11, true);
                        this.E0 = true;
                    } else {
                        this.E0 = false;
                    }
                    if (!z10) {
                        org.telegram.ui.Components.u5 u5Var = this.C0;
                        if (this.E0) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        u5Var.e(true, f12);
                        org.telegram.ui.Components.u5 u5Var2 = this.D0;
                        if (u5Var2 != null) {
                            if (this.F0) {
                                f13 = 1.0f;
                            } else {
                                f13 = 0.0f;
                            }
                            u5Var2.e(true, f13);
                        }
                    }
                    TLRPC.Chat M03 = np.s1(this.f11497m2).M0(Long.valueOf(-this.l1));
                    if ((!this.f11503o1 || (!org.telegram.messenger.t3.q(M03) && !org.telegram.messenger.t3.s0(M03))) && storyItem.views.views_count > 0) {
                        TextView textView = this.f11491k2;
                        if (i9Var.O0 == null) {
                            M02 = hd.M0(2131748123, null);
                        } else {
                            M02 = hd.M0(2131748122, null);
                        }
                        textView.setText(M02);
                        this.f11491k2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "d  ");
                        spannableStringBuilder.setSpan(new eq(2131231185, 0), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.o0(storyItem.views.views_count, 0));
                        this.f11491k2.setText(spannableStringBuilder);
                    } else {
                        this.f11491k2.setText("");
                    }
                    ViewGroup.LayoutParams layoutParams = v2Var.getLayoutParams();
                    float L = org.telegram.messenger.g0.L(40.0f);
                    if (this.E0) {
                        f10 = this.A0.d + org.telegram.messenger.g0.L(4.0f);
                    } else {
                        f10 = 0.0f;
                    }
                    layoutParams.width = (int) (L + f10);
                    ((ViewGroup.MarginLayoutParams) this.G1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(40.0f) + v2Var.getLayoutParams().width;
                    v2 v2Var2 = this.f11546z0;
                    if (v2Var2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = v2Var2.getLayoutParams();
                        float L2 = org.telegram.messenger.g0.L(40.0f);
                        if (this.F0) {
                            f11 = org.telegram.messenger.g0.L(4.0f) + this.B0.d;
                        } else {
                            f11 = 0.0f;
                        }
                        layoutParams2.width = (int) (L2 + f11);
                        ((ViewGroup.MarginLayoutParams) this.G1.getLayoutParams()).rightMargin += v2Var2.getLayoutParams().width;
                        v2Var2.requestLayout();
                    }
                    this.G1.requestLayout();
                    v2Var.requestLayout();
                    this.f11494l2.setVisibility(8);
                    this.f11508p2.setVisibility(8);
                    TL_stories.StoryItem storyItem2 = z3Var.f12579a;
                    a3 a3Var = this.T0;
                    if (storyItem2 == null) {
                        a3Var.getClass();
                        return;
                    }
                    for (int i12 = 0; i12 < a3Var.getChildCount(); i12++) {
                        if (a3Var.getChildAt(i12) instanceof p8) {
                            ((p8) a3Var.getChildAt(i12)).c(storyItem2.views, z10);
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
                            TLObject e22 = np.s1(this.f11497m2).e2(storyItem.views.recent_viewers.get(i14).longValue());
                            if (e22 != null) {
                                this.f11494l2.b(i15, this.f11497m2, e22);
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
                        this.f11494l2.b(i16, this.f11497m2, null);
                    }
                    this.f11494l2.a(false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(hd.H(',', "Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        eq eqVar = new eq(2131231980, 0);
                        eqVar.f34418y = -53704;
                        eqVar.f34413n = org.telegram.messenger.g0.L(0.2f);
                        spannableStringBuilder2.setSpan(eqVar, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        eq eqVar2 = new eq(2131231971, 0);
                        eqVar2.f34418y = -14161823;
                        eqVar2.f34413n = org.telegram.messenger.g0.L(0.2f);
                        spannableStringBuilder2.setSpan(eqVar2, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.f11491k2.setText(spannableStringBuilder2);
                    if (i15 == 0) {
                        this.f11494l2.setVisibility(8);
                        this.f11491k2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                    } else {
                        this.f11494l2.setVisibility(0);
                        this.f11491k2.setTranslationX(org.telegram.messenger.g0.L(10.0f) + com.google.android.gms.internal.vision.e2.v(i15, 1, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + org.telegram.messenger.g0.L(13.0f)));
                    }
                    this.f11508p2.setVisibility(0);
                } else {
                    TextView textView2 = this.f11491k2;
                    if (i9Var.O0 == null) {
                        M0 = hd.M0(2131748123, null);
                    } else {
                        M0 = hd.M0(2131748122, null);
                    }
                    textView2.setText(M0);
                    this.f11491k2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                    this.f11494l2.setVisibility(8);
                    this.f11508p2.setVisibility(8);
                }
                v2Var.getLayoutParams().width = org.telegram.messenger.g0.L(40.0f);
                this.f11542y0.requestLayout();
                return;
            }
            this.f11491k2.setText("");
            this.f11508p2.setVisibility(8);
            this.f11494l2.setVisibility(8);
        }
    }

    public final void j0() {
        x6 x6Var = this.f11502o0;
        x6Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new h2(0, x6Var)).setDuration(150L).start();
        int L = org.telegram.messenger.g0.L(8.0f);
        x6 x6Var2 = new x6(getContext(), this.f11479h1);
        this.f11502o0 = x6Var2;
        x6Var2.setPadding(L, L, L, L);
        this.f11502o0.setAlpha(0.0f);
        this.f11502o0.setScaleX(0.8f);
        this.f11502o0.setScaleY(0.8f);
        this.f11502o0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.f11499n0.addView(this.f11502o0, ja.e(40, 40, 3));
        this.f11459a3 = false;
    }

    public final void j1() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z10;
        k2 k2Var;
        float heightWithTopView;
        float f15;
        float f16;
        float f17;
        float L;
        int i7;
        float f18;
        float f19;
        int i10;
        v2 v2Var;
        ImageView imageView;
        i3 i3Var;
        v2 v2Var2;
        boolean z11;
        float f20;
        mi0 mi0Var;
        float f21;
        int i11;
        float f22;
        float f23;
        float f24 = ((z8) this.A1).d.W;
        if (this.f11532v2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.u5 u5Var = this.f11544y2;
        u5Var.e(false, f10);
        int i12 = this.d2;
        if (i12 != 0 && this.f11469e2) {
            f11 = c8.i9.a(this.f11516r2 / i12, 0.0f, 1.0f);
        } else if (this.f11472f2) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        org.telegram.ui.Components.u5 u5Var2 = this.H3;
        float f25 = u5Var2.f39900c;
        org.telegram.ui.Components.u5 u5Var3 = this.I3;
        float f26 = u5Var3.f39900c;
        org.telegram.ui.Components.u5 u5Var4 = this.J3;
        float f27 = u5Var4.f39900c;
        if (this.f11512q2) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        u5Var2.e(false, f12);
        if (!this.S2) {
            k2 k2Var2 = this.L1;
            if (k2Var2 != null && !TextUtils.isEmpty(k2Var2.getFieldText())) {
                f23 = 1.0f;
            } else {
                f23 = 0.0f;
            }
            u5Var3.e(false, f23);
        }
        k2 k2Var3 = this.L1;
        if (k2Var3 != null && k2Var3.f32210h4) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        u5Var4.e(false, f13);
        final k2 k2Var4 = this.L1;
        if (k2Var4 != null) {
            b4 b4Var = k2Var4.S6;
            f14 = 1.0f;
            int backgroundTop = k2Var4.getBackgroundTop();
            int i13 = k2Var4.P6;
            if (i13 != 0 && backgroundTop != i13) {
                int i14 = (k2Var4.B2 + i13) - backgroundTop;
                k2Var4.setAnimatedTop(i14);
                b4Var.F2 = true;
                ValueAnimator valueAnimator = b4Var.O1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    b4Var.O1.cancel();
                }
                View view = k2Var4.f32254o2;
                if (view != null && view.getVisibility() == 0) {
                    k2Var4.f32254o2.setTranslationY(((1.0f - k2Var4.getTopViewEnterProgress()) * k2Var4.f32254o2.getLayoutParams().height) + k2Var4.B2);
                }
                b4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i14, 0.0f);
                b4Var.O1 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                k2 k2Var5 = k2Var4;
                                k2Var5.getClass();
                                k2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                b4 b4Var2 = k2Var5.S6;
                                b4Var2.F2 = true;
                                b4Var2.invalidate();
                                k2Var5.invalidate();
                                return;
                            default:
                                k2Var4.F0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                b4Var.O1.addListener(new ai.j0(k2Var4, 11));
                b4Var.O1.setDuration(250L);
                b4Var.O1.setInterpolator(pi.k.V);
                b4Var.O1.start();
                k2Var4.P6 = 0;
            }
            if (k2Var4.V3) {
                float scrollY = (k2Var4.R6 - k2Var4.F0.getScrollY()) + (k2Var4.Q6 - k2Var4.F0.getMeasuredHeight());
                xe xeVar = k2Var4.F0;
                xeVar.setOffsetY(xeVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(k2Var4.F0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                k2 k2Var5 = k2Var4;
                                k2Var5.getClass();
                                k2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                b4 b4Var2 = k2Var5.S6;
                                b4Var2.F2 = true;
                                b4Var2.invalidate();
                                k2Var5.invalidate();
                                return;
                            default:
                                k2Var4.F0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = k2Var4.O6;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                k2Var4.O6 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(pi.k.V);
                ofFloat2.start();
                k2Var4.V3 = false;
                b4Var.j1();
            }
            k2Var4.getMeasuredHeight();
        } else {
            f14 = 1.0f;
        }
        k2 k2Var5 = this.L1;
        if (k2Var5 != null && k2Var5.G0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        boolean z12 = this.f11480h2;
        Paint paint = this.X1;
        if (z12) {
            paint.setColor(i0.a.f(this.f11458a2, -14933463, org.telegram.ui.ActionBar.j6.r1(0.44f, -16777216)));
            float f28 = f14;
            paint.setAlpha((int) ((f28 - this.O3) * org.telegram.messenger.k5.A(f28, this.f11461b2, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(i0.a.o(-16777216, (int) ((f14 - this.O3) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z13 = this.F2;
        i9 i9Var = this.f11522t0;
        if (z13 || this.K3 != i9Var.f11842e0 || u5Var.f39900c != this.A2 || this.f11464c2 != this.f11516r2 || f11 != this.f11458a2 || f24 != this.f11461b2 || f25 != u5Var2.f39900c || z10 || f27 != u5Var4.f39900c || f26 != u5Var3.f39900c) {
            this.F2 = false;
            this.f11464c2 = this.f11516r2;
            int i15 = (u5Var.f39900c > this.A2 ? 1 : (u5Var.f39900c == this.A2 ? 0 : -1));
            e3 e3Var = this.M0;
            if (i15 != 0) {
                e3Var.invalidate();
            }
            if (f24 != 0.0f) {
                e3Var.setLayerType(2, null);
            } else {
                e3Var.setLayerType(0, null);
            }
            this.A2 = u5Var.f39900c;
            this.f11461b2 = f24;
            this.f11458a2 = f11;
            this.K3 = i9Var.f11842e0;
            float height = this.f11516r2 - (getHeight() - e3Var.getBottom());
            if (this.L1 == null) {
                heightWithTopView = 0.0f;
            } else {
                heightWithTopView = k2Var.getHeightWithTopView() * f11;
            }
            float max = Math.max(0.0f, height + heightWithTopView);
            float height2 = this.Y1 - (getHeight() - e3Var.getBottom());
            k2 k2Var6 = this.L1;
            if (k2Var6 == null) {
                f16 = 0.0f;
            } else {
                float heightWithTopView2 = k2Var6.getHeightWithTopView();
                if (this.f11472f2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                f16 = heightWithTopView2 * f15;
            }
            float max2 = Math.max(0.0f, height2 + f16);
            k2 k2Var7 = this.L1;
            if (k2Var7 != null) {
                if (this.N1 != null) {
                    ImageView suggestButton = k2Var7.getSuggestButton();
                    if (suggestButton != null) {
                        this.N1.p(1.0f, -(org.telegram.messenger.g0.L(74.0f) - suggestButton.getTranslationX()));
                    }
                    this.N1.setTranslationY(-((getHeight() - this.L1.getY()) + org.telegram.messenger.g0.L(6.0f)));
                }
                ft editField = this.L1.getEditField();
                gn0 senderSelectView = this.L1.getSenderSelectView();
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
            if (this.f11480h2) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(58.0f) * (1.0f - f11);
            }
            float max3 = Math.max(0.0f, L + max);
            if (!this.f11480h2 && !this.f11472f2) {
                i7 = org.telegram.messenger.g0.L(58.0f);
            } else {
                i7 = 0;
            }
            float max4 = Math.max(0.0f, max2 + i7);
            float L2 = (org.telegram.messenger.g0.L(f17) * f11) + max3;
            c2 c2Var = this.f11530v0;
            di.c1 c1Var = c2Var.f12379c;
            c2Var.L = L2;
            if (Math.abs(c2Var.M - max4) > 0.1f) {
                c2Var.M = max4;
                f18 = 0.8f;
                i10 = 0;
                f19 = 8.0f;
                c1Var.setPadding(org.telegram.messenger.g0.L(8.0f), Math.max(0, ((int) max4) - c1Var.getTop()) + org.telegram.messenger.g0.L(7.5f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.5f));
                if (!c1Var.canScrollVertically(1)) {
                    c2Var.d.h1(0, org.telegram.messenger.g0.L(100.0f));
                }
            } else {
                f18 = 0.8f;
                f19 = 8.0f;
                i10 = 0;
            }
            c2Var.setTranslationY(-c2Var.L);
            c2Var.invalidate();
            hi.r3 r3Var = i9Var.E0;
            if (r3Var != null) {
                r3Var.setKeyboardOffset(max);
            }
            mi0 mi0Var2 = this.P1;
            z3 z3Var = this.f11543y1;
            if (mi0Var2 != null) {
                if (this.f11458a2 > 0.0f && (z3Var == null || !z3Var.f12583f)) {
                    i11 = i10;
                } else {
                    i11 = 8;
                }
                mi0Var2.setVisibility(i11);
            }
            int i16 = i10;
            while (true) {
                int childCount = getChildCount();
                v2Var = this.f11546z0;
                imageView = this.f11538x0;
                i3Var = this.f11526u0;
                v2Var2 = this.f11499n0;
                if (i16 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i16);
                if (childAt.getVisibility() == 0 && childAt != this.G1 && childAt.getTag(2131296591) == null && childAt != i3Var.f11418a0.n(getContext())) {
                    k2 k2Var8 = this.L1;
                    if (k2Var8 != null && childAt == k2Var8.getEmojiView()) {
                        childAt.setTranslationY(this.L1.getEmojiView().getMeasuredHeight() - this.f11516r2);
                    } else if (childAt instanceof b30) {
                        b30 b30Var = (b30) childAt;
                        View view2 = b30Var.f33163c;
                        if (view2 != null) {
                            b30Var.d(view2);
                        }
                    } else if (childAt != this.f11524t2 && childAt != e3Var && childAt != imageView && childAt != this.f11542y0 && childAt != v2Var && childAt != this.G2 && childAt != this.N1 && childAt != v2Var2 && ((mi0Var = this.f11462b3) == null || mi0Var.getReactionsWindow() == null || childAt != this.f11462b3.getReactionsWindow().f5013c)) {
                        float f29 = this.f11458a2;
                        f29 = (childAt == this.H1 || childAt == this.J1 || childAt == this.K1 || childAt == this.I1) ? 0.0f : 0.0f;
                        float f30 = 1.0f - f29;
                        float L3 = (((((-this.f11528u2) * f30) - (org.telegram.messenger.g0.L(7.0f) * f29)) - this.f11516r2) - (org.telegram.messenger.g0.L(f19) * f30)) - (org.telegram.messenger.g0.L(20.0f) * i9Var.f11842e0);
                        if (childAt == this.H1 || childAt == this.J1 || childAt == this.K1 || childAt == this.I1) {
                            L3 += this.f11516r2;
                        }
                        if (this.f11480h2) {
                            f21 = (1.0f - this.f11461b2) * hideInterfaceAlpha;
                        } else {
                            f21 = hideInterfaceAlpha * 1.0f;
                        }
                        if (childAt == this.L2) {
                            L3 = i9Var.f11842e0 * (-org.telegram.messenger.g0.L(20.0f));
                        }
                        if (childAt == this.N2) {
                            L3 -= this.L1.getMeasuredHeight() - this.L1.getAnimatedTop();
                            f21 = this.f11458a2;
                            childAt.invalidate();
                        }
                        if (childAt == this.M1) {
                            L3 -= this.L1.getMeasuredHeight() - this.L1.getAnimatedTop();
                            f21 *= this.f11458a2;
                        }
                        if (childAt == this.P1) {
                            float f31 = (1.0f - u5Var3.f39900c) * (1.0f - f27) * (1.0f - u5Var2.f39900c) * this.f11458a2;
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
                            k2 k2Var9 = this.L1;
                            if (k2Var9 == null || childAt != k2Var9.f32310w2) {
                                childAt.setAlpha(f21);
                            }
                        }
                    }
                } else if (childAt == this.G1) {
                    if (this.f11480h2) {
                        childAt.setAlpha((1.0f - this.O3) * (1.0f - this.f11461b2) * hideInterfaceAlpha);
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
            v2Var2.setAlpha((1.0f - this.O3) * f35);
            if (v2Var != null) {
                v2Var.setAlpha((1.0f - this.O3) * f35);
            }
            for (int i17 = 0; i17 < e3Var.getChildCount(); i17++) {
                View childAt2 = e3Var.getChildAt(i17);
                if (childAt2 != null && childAt2 != this.f11534w0) {
                    x3 x3Var = this.Y0;
                    bi.v1 v1Var = this.f11482i0;
                    if (childAt2 != x3Var && childAt2 != this.f11474g0 && childAt2 != this.f11478h0 && childAt2 != v1Var && childAt2 != this.G1 && childAt2 != i3Var && childAt2 != this.m0) {
                        childAt2.setAlpha(hideInterfaceAlpha);
                    } else {
                        if (childAt2 == v1Var) {
                            f20 = this.O2;
                        } else {
                            f20 = 1.0f;
                        }
                        if (childAt2 == i3Var) {
                            childAt2.setAlpha((1.0f - this.O3) * f20 * hideInterfaceAlpha);
                        } else {
                            childAt2.setAlpha((1.0f - this.O3) * f20 * hideInterfaceAlpha);
                        }
                    }
                }
            }
            if (this.L1 != null) {
                float L4 = org.telegram.messenger.g0.L(40.0f);
                if (!z3Var.f12583f) {
                    if (this.C2) {
                        L4 += org.telegram.messenger.g0.L(46.0f);
                    }
                    if (this.D2 && this.n1) {
                        L4 += org.telegram.messenger.g0.L(46.0f);
                    }
                    if (v2Var2.getVisibility() == 0) {
                        L4 = (L4 - org.telegram.messenger.g0.L(40.0f)) + v2Var2.getLayoutParams().width;
                    }
                } else {
                    float L5 = org.telegram.messenger.g0.L(46.0f);
                    L4 = org.telegram.messenger.g0.L(46.0f);
                    l1 l1Var = this.K1;
                    if (l1Var != null && l1Var.getVisibility() == 0) {
                        L4 += org.telegram.messenger.g0.L(46.0f);
                    }
                    f34 = L5;
                }
                k2 k2Var10 = this.L1;
                float f36 = -org.telegram.messenger.g0.L(10.0f);
                float f37 = -(org.telegram.messenger.g0.L(10.0f) + L4 + f34);
                float f38 = this.f11458a2;
                if ((this.C2 || this.f11503o1) && !z3Var.f12583f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                k2Var10.x1(f36, f37, f38, z11);
                if (this.L1.getEmojiView() != null) {
                    this.L1.getEmojiView().setAlpha(this.f11458a2);
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
        ofFloat.addUpdateListener(new u1(this, 2));
        this.N3.addListener(new f2(this, z10, 1));
        this.N3.setDuration(420L);
        this.N3.setInterpolator(er.h);
        this.N3.start();
    }

    public final void l0(Runnable runnable) {
        if (np.s1(this.f11497m2).v2()) {
            org.telegram.ui.b.b(this.f11497m2);
            return;
        }
        int i7 = gz.f23944e0;
        if (i7 > 0 && this.U2) {
            int i10 = i7 - 1;
            gz.f23944e0 = i10;
            gz.T(i10);
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(0, getContext(), this.f11493l0);
            t1Var.setTitle(hd.M0(2131744885, null));
            t1Var.n(hd.M0(2131744886, null));
            String M0 = hd.M0(2131746743, null);
            ba.b bVar = new ba.b(runnable);
            t1Var.m0 = M0;
            t1Var.f29642n0 = bVar;
            String M02 = hd.M0(2131752589, null);
            di.o oVar = new di.o(25);
            t1Var.f29643o0 = M02;
            t1Var.f29644p0 = oVar;
            t1Var.show();
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
        this.f11504o2 = false;
        this.F2 = true;
        this.f11495l3 = false;
        this.n1 = false;
        this.f11503o1 = false;
        long j3 = this.l1;
        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        x3 x3Var = this.Y0;
        org.telegram.ui.Components.t8 t8Var = this.X0;
        if (i12 >= 0) {
            if (j3 == m10.i(this.f11497m2).e()) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f11496m1 = z14;
            TLRPC.User a22 = np.s1(this.f11497m2).a2(Long.valueOf(this.l1));
            TL_account.RequirementToContact J2 = np.s1(this.f11497m2).J2(this.l1);
            if (!m10.i(this.f11497m2).q() && (J2 instanceof TL_account.requirementToContactPremium)) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.f11507p1 = z15;
            this.f11515r1 = org.telegram.messenger.m5.k(J2);
            t8Var.r(a22);
            x3Var.f12493a.getImageReceiver().i0(a22, t8Var, null);
            U0(this.l1, true, false);
        } else {
            this.f11496m1 = false;
            this.n1 = true;
            if (!this.C1.h(j3)) {
                boolean z16 = org.telegram.messenger.r2.f26206a;
            } else {
                this.f11495l3 = true;
            }
            TLRPC.Chat M0 = np.s1(this.f11497m2).M0(Long.valueOf(-this.l1));
            boolean V = org.telegram.messenger.t3.V(M0);
            this.f11503o1 = !V;
            if (!V && np.s1(this.f11497m2).N0(-this.l1) == null) {
                vr.a0(this.f11497m2).F0(-this.l1, true, new CountDownLatch(1), false, false, 0);
            }
            if (this.f11503o1 && !org.telegram.messenger.t3.q(M0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f11507p1 = z10;
            this.f11515r1 = np.s1(this.f11497m2).N1(this.l1);
            t8Var.q(M0);
            x3Var.f12493a.getImageReceiver().i0(M0, t8Var, null);
            U0(this.l1, true, false);
        }
        if (this.f11527u1 && (this.f11496m1 || this.n1)) {
            s6 s6Var = this.C1;
            long j10 = this.l1;
            a0.h hVar = s6Var.f12329m;
            r9 r9Var = (r9) hVar.f(j10);
            if (r9Var == null) {
                r9Var = new r9(s6Var.f12319a, j10, s6Var);
                hVar.k(r9Var, j10);
            }
            r9Var.b(true);
        }
        h1();
        this.f11523t1 = i7;
        if (i7 < 0) {
            this.f11523t1 = 0;
        }
        this.G0 = 0L;
        this.I0 = false;
        this.f11525t3 = null;
        this.f11529u3 = null;
        boolean z17 = this.n1;
        e3 e3Var = this.M0;
        i9 i9Var = this.f11522t0;
        int i13 = 8;
        z3 z3Var = this.f11543y1;
        if (z17) {
            z0();
            if (this.L1 == null && (this.f11503o1 || z3Var.f12583f)) {
                t0();
            }
            if (this.L1 != null) {
                TLRPC.Chat M02 = np.s1(this.f11497m2).M0(Long.valueOf(-this.l1));
                k2 k2Var = this.L1;
                if (z3Var.f12583f || (!G0() && this.f11503o1 && (org.telegram.messenger.t3.q(M02) || org.telegram.messenger.t3.s0(M02)))) {
                    i13 = 0;
                }
                k2Var.setVisibility(i13);
                k2 k2Var2 = this.L1;
                boolean z18 = z3Var.f12583f;
                B0(true);
                k2Var2.y1(z18);
                k2 k2Var3 = this.L1;
                if (z3Var.f12583f && !B0(true) && (this.f11472f2 || this.L1.X0)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                k2Var3.F1(z13, true);
                ft editField = this.L1.getEditField();
                long j11 = this.l1;
                TL_stories.StoryItem storyItem = z3Var.f12579a;
                i9Var.getClass();
                editField.setText(i9.A(j11, storyItem));
                this.L1.r1(this.f11497m2, this.l1);
                this.L1.e2(M02, null);
            }
            org.telegram.ui.Components.g6 g6Var = this.A0;
            org.telegram.ui.ActionBar.e6 e6Var = this.f11493l0;
            if (g6Var == null) {
                org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(false, false, false);
                this.A0 = g6Var2;
                v2 v2Var = this.f11499n0;
                g6Var2.setCallback(v2Var);
                this.A0.u(e6Var.h(org.telegram.ui.ActionBar.j6.G6));
                this.A0.w(org.telegram.messenger.g0.L(14.0f));
                this.C0 = new org.telegram.ui.Components.u5(v2Var);
            }
            v2 v2Var2 = this.f11546z0;
            if (v2Var2 != null && this.B0 == null) {
                org.telegram.ui.Components.g6 g6Var3 = new org.telegram.ui.Components.g6(false, false, false);
                this.B0 = g6Var3;
                g6Var3.setCallback(v2Var2);
                this.B0.u(e6Var.h(org.telegram.ui.ActionBar.j6.G6));
                this.B0.w(org.telegram.messenger.g0.L(14.0f));
                this.D0 = new org.telegram.ui.Components.u5(v2Var2);
            }
            if (i7 == -1) {
                g1();
            }
            d1(false);
            this.f11490k1 = getStoriesCount();
            e3Var.invalidate();
            invalidate();
        } else if (this.f11496m1) {
            z0();
            if (z3Var.f12583f) {
                this.G1.setVisibility(8);
                if (this.L1 == null) {
                    t0();
                }
                this.L1.setVisibility(0);
            } else {
                this.G1.setVisibility(0);
                k2 k2Var4 = this.L1;
                if (k2Var4 != null) {
                    k2Var4.setVisibility(8);
                }
            }
            k2 k2Var5 = this.L1;
            if (k2Var5 != null) {
                boolean z19 = z3Var.f12583f;
                B0(true);
                k2Var5.y1(z19);
                k2 k2Var6 = this.L1;
                if (z3Var.f12583f && !B0(true) && (this.f11472f2 || this.L1.X0)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                k2Var6.F1(z12, true);
            }
            if (i7 == -1) {
                ArrayList arrayList = this.f11487j1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(i9Var.P0));
                    if (indexOf < 0 && !this.f11487j1.isEmpty()) {
                        if (i9Var.P0 > ((Integer) this.f11487j1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (i9Var.P0 < ((Integer) i5.c.h(1, this.f11487j1)).intValue()) {
                            indexOf = this.f11487j1.size() - 1;
                        }
                    }
                    this.f11523t1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.f11475g1.isEmpty();
                    ArrayList arrayList2 = this.f11471f1;
                    if (!isEmpty) {
                        this.f11523t1 = arrayList2.size();
                    } else {
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i14)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i14)).f28290id > this.C1.f12323f.get(this.l1)) {
                                this.f11523t1 = i14;
                                break;
                            }
                        }
                    }
                }
            }
            d1(false);
            e3Var.invalidate();
            invalidate();
        } else {
            if (this.L1 == null) {
                t0();
            }
            if (this.f11507p1 && this.Q1 == null) {
                x0();
            }
            if (this.Q1 != null) {
                if (this.f11507p1 || this.f11511q1) {
                    f1();
                }
                LinearLayout linearLayout = this.Q1;
                if ((this.f11507p1 && !z3Var.f12583f) || this.f11511q1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                linearLayout.setVisibility(i11);
            }
            g8 g8Var = this.T1;
            if (g8Var != null) {
                g8Var.setVisibility(8);
            }
            if (i7 == -1) {
                g1();
            }
            d1(false);
            k2 k2Var7 = this.L1;
            if (k2Var7 != null) {
                if (!G0() && !q10.A(this.l1)) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                k2Var7.setVisibility(i10);
                k2 k2Var8 = this.L1;
                boolean z20 = z3Var.f12583f;
                B0(true);
                k2Var8.y1(z20);
                k2 k2Var9 = this.L1;
                if (z3Var.f12583f && !B0(true) && (this.f11472f2 || this.L1.X0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                k2Var9.F1(z11, true);
                ft editField2 = this.L1.getEditField();
                long j12 = this.l1;
                TL_stories.StoryItem storyItem2 = z3Var.f12579a;
                i9Var.getClass();
                editField2.setText(i9.A(j12, storyItem2));
                this.L1.r1(this.f11497m2, this.l1);
                TLRPC.UserFull b22 = np.s1(this.f11497m2).b2(this.l1);
                if (b22 != null) {
                    this.L1.e2(null, b22);
                } else {
                    np.s1(this.f11497m2).W2(np.s1(this.f11497m2).a2(Long.valueOf(this.l1)), this.f11488j2, false, null);
                }
            }
            this.f11490k1 = getStoriesCount();
            v2 v2Var3 = this.G1;
            if (v2Var3 != null) {
                v2Var3.setVisibility(8);
            }
            e3Var.invalidate();
            invalidate();
        }
        p0(false);
    }

    public final void n0() {
        i3 i3Var = this.f11526u0;
        if (i3Var.f11418a0.x()) {
            i3Var.f11418a0.f(false);
        }
    }

    public final void o0() {
        if (this.f11527u1) {
            ((z8) this.A1).d.V();
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
        k2 k2Var = this.L1;
        if (k2Var != null) {
            k2Var.T0();
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.R0;
            if (i7 < arrayList.size()) {
                ((ch.g0) arrayList.get(i7)).b(true);
                i7++;
            } else {
                ns.f(this.f11497m2).c(this, ns.T);
                ns.f(this.f11497m2).c(this, ns.G2);
                ns.f(this.f11497m2).c(this, ns.f25592v5);
                ns.f(this.f11497m2).c(this, ns.f25535m3);
                ns.f(this.f11497m2).c(this, ns.f25606x5);
                ns.f(this.f11497m2).c(this, ns.D5);
                ns.f(this.f11497m2).c(this, ns.f25473b3);
                ns.f(this.f11497m2).c(this, ns.f25514i3);
                ns.f(this.f11497m2).c(this, ns.F);
                ns.e().c(this, ns.f25515i4);
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
        k2 k2Var = this.L1;
        if (k2Var != null) {
            k2Var.S0();
        }
        org.telegram.ui.Components.g5 g5Var = this.Y2;
        if (g5Var != null) {
            g5Var.n(this);
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
                ns.f(this.f11497m2).n(this, ns.T);
                ns.f(this.f11497m2).n(this, ns.G2);
                ns.f(this.f11497m2).n(this, ns.f25592v5);
                ns.f(this.f11497m2).n(this, ns.f25535m3);
                ns.f(this.f11497m2).n(this, ns.f25606x5);
                ns.f(this.f11497m2).n(this, ns.D5);
                ns.f(this.f11497m2).n(this, ns.f25473b3);
                ns.f(this.f11497m2).n(this, ns.f25514i3);
                ns.f(this.f11497m2).n(this, ns.F);
                ns.e().n(this, ns.f25515i4);
                return;
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f11479h1.d.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(72.0f));
    }

    @Override
    public final void onMeasure(int r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: fi.b4.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.f11458a2 = -1.0f;
        this.F2 = true;
        invalidate();
    }

    public final void p0(boolean z10) {
        int i7;
        if (this.L1 != null && this.P2 && this.K0) {
            t1 t1Var = this.f11549z3;
            org.telegram.messenger.g0.r(t1Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.C1.B;
            this.L1.N(true);
            boolean z11 = this.f11507p1;
            z3 z3Var = this.f11543y1;
            if ((z11 && !z3Var.f12583f) || this.f11511q1) {
                this.U2 = false;
                this.L1.setEnabled(false);
                this.L1.A1(" ", z10);
            } else if (this.f11515r1 > 0) {
                this.U2 = false;
                this.L1.setEnabled(true);
                this.L1.A1(lb.T0(hd.a0(null, null, 2131743926, hd.E(this.f11515r1, ','))), z10);
            } else {
                if (!z3Var.f12583f && tL_storiesStealthMode != null) {
                    int currentTime = ConnectionsManager.getInstance(this.f11497m2).getCurrentTime();
                    int i10 = tL_storiesStealthMode.active_until_date;
                    if (currentTime < i10) {
                        this.U2 = true;
                        int currentTime2 = i10 - ConnectionsManager.getInstance(this.f11497m2).getCurrentTime();
                        int i11 = currentTime2 / 60;
                        int i12 = currentTime2 % 60;
                        Locale locale = Locale.US;
                        String a02 = hd.a0(null, null, 2131744888, String.format(locale, "%02d:%02d", 99, 99));
                        this.L1.setEnabled(true);
                        if (((int) this.L1.getEditField().getPaint().measureText(a02)) * 1.2f >= this.L1.getEditField().getMeasuredWidth()) {
                            k2 k2Var = this.L1;
                            String a03 = hd.a0(null, null, 2131744888, "");
                            String format = String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
                            k2Var.f32183e = a03;
                            k2Var.f32191f = format;
                            k2Var.a2(z10);
                        } else {
                            this.L1.A1(hd.a0(null, null, 2131744889, String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12))), z10);
                        }
                        org.telegram.messenger.g0.i3(t1Var, 1000L);
                        return;
                    }
                }
                this.U2 = false;
                this.L1.setEnabled(true);
                if (z3Var.f12583f) {
                    long starsPrice = this.L1.getStarsPrice();
                    if (starsPrice > 0) {
                        this.L1.A1(lb.Y0(false, hd.a0(null, null, 2131752004, hd.E((int) starsPrice, ',')), this.L1.f32225j6), z10);
                        eq eqVar = this.L1.f32225j6[0];
                        if (eqVar != null) {
                            eqVar.H = 0.9f;
                            return;
                        }
                        return;
                    }
                    this.L1.A1(hd.M0(2131752005, null), z10);
                    return;
                }
                k2 k2Var2 = this.L1;
                if (this.f11503o1) {
                    i7 = 2131746250;
                } else {
                    i7 = 2131746255;
                }
                k2Var2.A1(hd.M0(i7, null), z10);
            }
        }
    }

    public final boolean q0() {
        if (this.f11465c3) {
            if (this.f11462b3.getReactionsWindow() != null) {
                if (this.f11484i2 > 0) {
                    org.telegram.messenger.g0.v1(this.f11462b3.getReactionsWindow().f5013c);
                    return true;
                }
                this.f11462b3.getReactionsWindow().d();
                return true;
            }
            Z0(false);
            return true;
        }
        a3 a3Var = this.T0;
        if (a3Var != null) {
            hi.l3 l3Var = a3Var.f12037c;
            if (l3Var != null) {
                l3Var.f(true);
                a3Var.f12037c = null;
            }
            a3Var.f12036b = null;
            a3Var.invalidate();
            a3Var.b(false);
        }
        i3 i3Var = this.f11526u0;
        if (i3Var.f11418a0.x()) {
            i3Var.f11418a0.f(false);
            return true;
        }
        hi.l3 l3Var2 = this.f11506p0;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
        hi.l3 l3Var3 = this.f11510q0;
        if (l3Var3 != null) {
            l3Var3.f(true);
        }
        b30 b30Var = this.G2;
        if (b30Var != null) {
            b30Var.a();
        }
        t3 t3Var = this.f11466d1;
        if (t3Var != null && t3Var.f17663a) {
            t3Var.a();
            return true;
        }
        k2 k2Var = this.L1;
        if (k2Var != null && k2Var.I0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f11493l0);
            boolean z10 = this.L1.f32178d1;
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            if (z10) {
                t1Var.S = hd.M0(2131751395, null);
                t1Var.U = hd.M0(2131751396, null);
            } else {
                t1Var.S = hd.M0(2131751392, null);
                t1Var.U = hd.M0(2131751393, null);
            }
            alertDialog$Builder.k(hd.M0(2131751394, null), new q1(this, 0));
            alertDialog$Builder.h(hd.M0(2131751771, null), null);
            ((z8) this.A1).h(t1Var);
            return true;
        }
        mi0 mi0Var = this.P1;
        if (mi0Var != null && mi0Var.getReactionsWindow() != null && !this.P1.getReactionsWindow().f5025q) {
            this.P1.getReactionsWindow().d();
            return true;
        }
        k2 k2Var2 = this.L1;
        if (k2Var2 != null && k2Var2.G0()) {
            if (this.f11484i2 > 0) {
                org.telegram.messenger.g0.v1(this.L1.getEmojiView());
                return true;
            }
            this.L1.z0(true, false, true);
            return true;
        } else if (getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f)) {
            k2 k2Var3 = this.L1;
            if (k2Var3 != null) {
                long j3 = this.l1;
                TL_stories.StoryItem storyItem = this.f11543y1.f12579a;
                Editable editText = k2Var3.getEditText();
                this.f11522t0.getClass();
                i9.P(j3, storyItem, editText);
            }
            org.telegram.messenger.g0.v1(this.L1);
            return true;
        } else if (i3Var.getVisibility() != 0 || i3Var.getProgressToBlackout() <= 0.0f) {
            return false;
        } else {
            i3Var.D();
            this.Q2 = false;
            this.M0.invalidate();
            return true;
        }
    }

    public final void r0() {
        if (this.f11520s2 == null) {
            p2 p2Var = new p2(this, getContext(), this.f11493l0);
            this.f11520s2 = p2Var;
            p2Var.X3 = new q2(this);
            p2Var.f36435e2.i0();
            p2 p2Var2 = this.f11520s2;
            p2Var2.R1 = true;
            p2Var2.e1();
            p2 p2Var3 = this.f11520s2;
            p2Var3.S1 = new r2(this);
            p2Var3.a1().setText(this.L1.getFieldText());
        }
    }

    public final void s0() {
        if (this.H1 == null && getContext() != null) {
            a aVar = new a(getContext(), this.f11521s3);
            this.H1 = aVar;
            aVar.setOnClickListener(new v1(this, 1));
            addView(this.H1, ja.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public void setAccount(int i7) {
        this.f11497m2 = i7;
        this.C1 = np.s1(i7).f25302i0;
        this.U0.f48435b = i7;
        mi0 mi0Var = this.P1;
        if (mi0Var != null) {
            mi0Var.setCurrentAccount(i7);
            this.P1.p(null, null, true);
        }
        mi0 mi0Var2 = this.f11462b3;
        if (mi0Var2 != null) {
            mi0Var2.setCurrentAccount(i7);
        }
    }

    public void setActive(boolean z10) {
        R0(0L, z10);
    }

    public void setDelegate(u3 u3Var) {
        this.A1 = u3Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.P2 != z10) {
            this.P2 = z10;
            if (z10) {
                this.O0.f22278i1 = 1.0f;
                p0(false);
            }
        }
    }

    public void setLongpressed(boolean z10) {
        if (this.f11527u1) {
            this.f11532v2 = z10;
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
            if (this.f11527u1 && this.f11522t0.f11830a && Build.VERSION.SDK_INT < 33) {
                sa saVar = this.G3;
                if (z10) {
                    org.telegram.messenger.g0.r(saVar);
                    org.telegram.messenger.g0.i3(saVar, 250L);
                    return;
                }
                org.telegram.messenger.g0.r(saVar);
                i9 i9Var = ((z8) this.A1).d;
                i9Var.l1 = true;
                i9Var.V();
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.B1 != z10) {
            this.B1 = z10;
            u2 u2Var = this.O0;
            if (z10) {
                u2Var.Q0();
                u2Var.f22301u0 = false;
            } else {
                u2Var.P0(false);
                u2Var.f22301u0 = true;
            }
            this.H0 = 0L;
            this.M0.invalidate();
        }
    }

    public final void t0() {
        org.telegram.ui.ActionBar.e6 e6Var = this.f11493l0;
        k2 k2Var = new k2(this, org.telegram.messenger.g0.W(getContext()), this, new i2(1, e6Var));
        this.L1 = k2Var;
        ft editField = k2Var.getEditField();
        editField.getClass();
        ys ysVar = new ys(editField, 0);
        editField.f32543u0 = ysVar;
        ysVar.q(true);
        editField.f32543u0.u(editField.f32551y0);
        editField.f32543u0.w(editField.getPaint().getTextSize());
        ys ysVar2 = new ys(editField, 1);
        editField.f32545v0 = ysVar2;
        ysVar2.f34833b = 5;
        ysVar2.u(editField.f32551y0);
        editField.f32545v0.w(editField.getPaint().getTextSize());
        this.L1.getEditField().setScaleX(0.0f);
        this.L1.setOverrideKeyboardAnimation(true);
        this.L1.setClipChildren(false);
        this.L1.setDelegate(new l2(this));
        setDelegate(this.L1);
        k2 k2Var2 = this.L1;
        k2Var2.Q5 = false;
        k2Var2.R5 = true;
        if (this.f11543y1.f12583f) {
            k2Var2.l1(false, false, false);
        } else {
            k2Var2.l1(true, true, false);
        }
        this.L1.updateColors();
        k2 k2Var3 = this.L1;
        k2Var3.S5 = true;
        addView(k2Var3, ja.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.f11545y3 != null) {
            this.L1.j2(false);
        }
        this.L1.f32255o3 = this.f11488j2;
        a4 a4Var = this.f11536w2;
        ((ArrayList) a4Var.f11410g).add(this.M0);
        ((ArrayList) a4Var.f11410g).add(this);
        if (this.K0) {
            this.L1.T0();
        }
        p0(false);
        if (G0()) {
            this.L1.setVisibility(8);
        }
        lh.h hVar = new lh.h(getContext(), e6Var, this.f11521s3, this.f11509p3);
        this.M1 = hVar;
        hVar.setOnClickListener(new q1(this, 1));
        addView(this.M1, ja.e(57, 300, 85));
        this.M1.setVisibility(8);
        this.L1.setSideButtonsForAttach(this.M1);
        this.f11518s0 = getChildCount();
    }

    public final void u0() {
        if (this.T1 != null) {
            return;
        }
        g8 g8Var = new g8(getContext(), this.f11493l0);
        this.T1 = g8Var;
        g8Var.setOnClickListener(new v1(this, 4));
        this.T1.setAlpha(0.0f);
        this.T1.setVisibility(8);
        addView(this.T1, ja.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void v0() {
        boolean z10;
        if (this.K1 == null && getContext() != null) {
            l1 l1Var = new l1(getContext(), this.f11521s3);
            this.K1 = l1Var;
            l1Var.setOnClickListener(new v1(this, 5));
            l1 l1Var2 = this.K1;
            e1 e1Var = e1.X;
            boolean z11 = true;
            if (e1Var != null && e1Var.o()) {
                z10 = true;
            } else {
                z10 = false;
            }
            l1Var2.b(z10, false);
            l1 l1Var3 = this.K1;
            e1 e1Var2 = e1.X;
            if (e1Var2 != null && !e1Var2.m()) {
                z11 = false;
            }
            l1Var3.a(z11, false);
            addView(this.K1, ja.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void w0() {
        if (this.J1 == null && getContext() != null) {
            this.I1 = new o1(getContext(), this.f11497m2);
            p1 p1Var = new p1(getContext(), this.I1, this.f11521s3);
            this.J1 = p1Var;
            p1Var.setOnClickListener(new v1(this, 6));
            this.J1.setOnLongClickListener(new s1(this, 1));
            addView(this.J1, ja.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
            addView(this.I1, ja.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
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
        imageView.setImageResource(2131231976);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.R1 = textView;
        textView.setTextColor(-8026747);
        this.R1.setTextSize(1, 16.0f);
        TextView textView2 = this.R1;
        if (this.f11503o1) {
            i7 = 2131744665;
        } else {
            i7 = 2131744493;
        }
        textView2.setText(hd.M0(i7, null));
        TextView textView3 = new TextView(getContext());
        this.S1 = textView3;
        textView3.setTextColor(-1);
        this.S1.setTextSize(1, 12.0f);
        TextView textView4 = this.S1;
        int L = org.telegram.messenger.g0.L(40.0f);
        textView4.setBackground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, 452984831, 855638015, 855638015));
        this.S1.setGravity(17);
        na.a(this.S1);
        this.S1.setText(hd.M0(2131744492, null));
        this.S1.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        this.Q1.addView(imageView, ja.t(22, 22, 16, 12, 1, 4, 0));
        this.Q1.addView(this.R1, ja.s(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.Q1.addView(this.S1, ja.s(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.L1.addView(this.Q1, ja.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    public final void y0() {
        if (this.L2 != null) {
            return;
        }
        tb tbVar = new tb(getContext(), 1);
        this.L2 = tbVar;
        tbVar.setTextSize(1, 14.0f);
        this.L2.setTextColor(i0.a.f(0.5f, -16777216, -1));
        this.L2.setGravity(19);
        this.L2.setText(hd.M0(2131744491, null));
        addView(this.L2, ja.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void z0() {
        if (this.G1 != null) {
            return;
        }
        v2 v2Var = new v2(this, getContext(), 0);
        this.G1 = v2Var;
        v2Var.setClickable(true);
        addView(this.G1, ja.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        w2 w2Var = new w2(this, getContext());
        this.f11508p2 = w2Var;
        w2Var.setOnClickListener(new v1(this, 0));
        this.G1.addView(this.f11508p2, ja.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        u uVar = new u(0, getContext(), false);
        this.f11494l2 = uVar;
        uVar.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        this.G1.addView(this.f11494l2, ja.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f11491k2 = textView;
        textView.setTextSize(1, 14.0f);
        this.f11491k2.setTextColor(-1);
        this.G1.addView(this.f11491k2, ja.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.f11479h1.f12543s);
        w2 w2Var2 = this.f11508p2;
        int L = org.telegram.messenger.g0.L(15.0f);
        int o4 = i0.a.o(-1, 120);
        w2Var2.setBackground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, 0, o4, o4));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.O(i0.a.o(-1, 120), -org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f)));
    }
}
