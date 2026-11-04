package ei;

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
import b8.be;
import b8.mf;
import b8.pf;
import b8.rf;
import ci.ec;
import ci.wb;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ac;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.sd;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fx;
import org.telegram.ui.vq0;
import org.telegram.ui.wm;
public abstract class j4 extends qt0 implements cs {
    public org.telegram.ui.Components.g6 A0;
    public c4 A1;
    public float A2;
    public int A3;
    public org.telegram.ui.Components.g6 B0;
    public boolean B1;
    public long B2;
    public final a2 B3;
    public org.telegram.ui.Components.u5 C0;
    public z6 C1;
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
    public d3 G1;
    public u20 G2;
    public final a3.o G3;
    public long H0;
    public a H1;
    public final vq0 H2;
    public final org.telegram.ui.Components.u5 H3;
    public boolean I0;
    public v1 I1;
    public boolean I2;
    public final org.telegram.ui.Components.u5 I3;
    public boolean J0;
    public w1 J1;
    public a3 J2;
    public final org.telegram.ui.Components.u5 J3;
    public boolean K0;
    public s1 K1;
    public FrameLayout K2;
    public float K3;
    public boolean L0;
    public s2 L1;
    public ec L2;
    public final Path L3;
    public final m3 M0;
    public mh.h M1;
    public boolean M2;
    public boolean M3;
    public final FrameLayout N0;
    public gi.l3 N1;
    public u2 N2;
    public ValueAnimator N3;
    public final c3 O0;
    public ValueAnimator O1;
    public float O2;
    public float O3;
    public final ImageReceiver P0;
    public li0 P1;
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
    public final i3 T0;
    public n8 T1;
    public boolean T2;
    public final fx U0;
    public ViewPropertyAnimator U1;
    public boolean U2;
    public o4 V0;
    public final gh.g V1;
    public final ImageReceiver V2;
    public float W0;
    public final gh.g W1;
    public dh.d W2;
    public final org.telegram.ui.Components.u8 X0;
    public final Paint X1;
    public final ImageReceiver X2;
    public final f4 Y0;
    public int Y1;
    public org.telegram.ui.Components.g5 Y2;
    public final o8 Z0;
    public ValueAnimator Z1;
    public boolean Z2;
    public l6.n f10441a1;
    public float f10442a2;
    public boolean f10443a3;
    public int f10444b1;
    public float f10445b2;
    public li0 f10446b3;
    public org.telegram.ui.ActionBar.y0 f10447c1;
    public float c2;
    public boolean f10448c3;
    public b4 f10449d1;
    public int f10450d2;
    public float f10451d3;
    public TL_stories.PeerStories f10452e1;
    public boolean f10453e2;
    public boolean f10454e3;
    public final ArrayList f10455f1;
    public boolean f10456f2;
    public float f10457f3;
    public final ImageView f10458g0;
    public final ArrayList f10459g1;
    public boolean f10460g2;
    public int f10461g3;
    public final ImageView f10462h0;
    public final g4 f10463h1;
    public boolean f10464h2;
    public int f10465h3;
    public final ai.d2 f10466i0;
    public final cg.q0 f10467i1;
    public int f10468i2;
    public int i3;
    public final fh0 f10469j0;
    public ArrayList f10470j1;
    public final int f10471j2;
    public a2 f10472j3;
    public final ImageView f10473k0;
    public int k1;
    public TextView f10474k2;
    public float f10475k3;
    public final org.telegram.ui.ActionBar.e6 f10476l0;
    public long f10477l1;
    public v f10478l2;
    public boolean f10479l3;
    public final u8 m0;
    public boolean m1;
    public int f10480m2;
    public k4.j f10481m3;
    public final d3 f10482n0;
    public boolean f10483n1;
    public int f10484n2;
    public org.telegram.ui.ActionBar.y0 f10485n3;
    public e7 f10486o0;
    public boolean f10487o1;
    public boolean f10488o2;
    public org.telegram.ui.ActionBar.y0 f10489o3;
    public gi.l3 f10490p0;
    public boolean f10491p1;
    public e3 f10492p2;
    public final eh.c f10493p3;
    public gi.l3 f10494q0;
    public boolean f10495q1;
    public boolean f10496q2;
    public final si.a f10497q3;
    public gi.l3 f10498r0;
    public long f10499r1;
    public float f10500r2;
    public final si.f f10501r3;
    public int f10502s0;
    public final float f10503s1;
    public x2 f10504s2;
    public final hh.b f10505s3;
    public final r9 f10506t0;
    public int f10507t1;
    public k40 f10508t2;
    public TL_stories.TL_premium_boostsStatus f10509t3;
    public final q3 f10510u0;
    public boolean f10511u1;
    public int f10512u2;
    public org.telegram.messenger.e3 f10513u3;
    public final k2 f10514v0;
    public int f10515v1;
    public boolean f10516v2;
    public long f10517v3;
    public final View f10518w0;
    public int f10519w1;
    public final i4 f10520w2;
    public long f10521w3;
    public final ImageView f10522x0;
    public int f10523x1;
    public final g2.g f10524x2;
    public boolean f10525x3;
    public final LinearLayout f10526y0;
    public final h4 f10527y1;
    public final org.telegram.ui.Components.u5 f10528y2;
    public TLRPC.TL_channels_sendAsPeers f10529y3;
    public final d3 f10530z0;
    public final l2.e f10531z1;
    public final org.telegram.ui.Components.u5 f10532z2;
    public final a2 f10533z3;

    public j4(Context context, final r9 r9Var, g4 g4Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null);
        this.L0 = true;
        this.R0 = new ArrayList();
        this.f10444b1 = -5;
        this.f10503s1 = 1.0f;
        h4 h4Var = new h4(this);
        this.f10527y1 = h4Var;
        this.f10442a2 = -1.0f;
        this.f10445b2 = -1.0f;
        this.c2 = -1.0f;
        this.f10471j2 = ConnectionsManager.generateClassGuid();
        this.f10528y2 = new org.telegram.ui.Components.u5(this);
        this.f10532z2 = new org.telegram.ui.Components.u5(this);
        vq0 vq0Var = new vq0();
        this.H2 = vq0Var;
        this.O2 = 1.0f;
        this.f10533z3 = new a2(this, 4);
        this.B3 = new a2(this, 11);
        this.C3 = new ArrayList();
        this.D3 = new ArrayList();
        this.G3 = new a3.o(this, 20);
        this.H3 = new org.telegram.ui.Components.u5(this);
        this.I3 = new org.telegram.ui.Components.u5(this);
        this.J3 = new org.telegram.ui.Components.u5(this);
        this.L3 = new Path();
        vq0Var.E = new android.support.v4.media.c(this, 21);
        ?? obj = new Object();
        obj.f10407g = new ArrayList();
        this.f10520w2 = obj;
        this.f10524x2 = new g2.g((int[]) null);
        this.f10455f1 = new ArrayList();
        this.f10459g1 = new ArrayList();
        c3 c3Var = new c3(this, 0);
        this.O0 = c3Var;
        c3Var.B0 = false;
        c3Var.A1 = true;
        c3Var.f21282y = true;
        c3Var.h0(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.V2 = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.f21282y = true;
        imageReceiver.h0(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.X2 = imageReceiver2;
        imageReceiver2.A1 = true;
        imageReceiver2.f21282y = true;
        imageReceiver2.h0(3);
        ImageReceiver imageReceiver3 = new ImageReceiver(null);
        this.P0 = imageReceiver3;
        imageReceiver3.A1 = true;
        imageReceiver3.f21282y = true;
        imageReceiver3.h0(0);
        ImageReceiver imageReceiver4 = new ImageReceiver(null);
        this.Q0 = imageReceiver4;
        imageReceiver4.A1 = true;
        imageReceiver4.f21282y = true;
        imageReceiver4.h0(0);
        c3Var.f21227a = Arrays.asList(imageReceiver3, imageReceiver4);
        this.X0 = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.f10506t0 = r9Var;
        this.f10463h1 = g4Var;
        this.f10531z1 = g4Var.f10319g;
        this.C1 = hp.s1(h10.f22829t0).P1();
        g4Var.f10323l.setColor(-16777216);
        this.X1 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.f10476l0 = e6Var;
        setClipChildren(false);
        i3 i3Var = new i3(this, context, this.M0, e6Var, r9Var);
        this.T0 = i3Var;
        hh.b bVar = new hh.b(e6Var, org.telegram.ui.ActionBar.k6.Ge, 0.8f);
        this.f10505s3 = bVar;
        si.c cVar = new si.c();
        cVar.a(i0.a.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT >= 31 && az.e()) {
            si.f fVar = new si.f(cVar);
            this.f10501r3 = fVar;
            fVar.k(org.telegram.messenger.g0.L(8.0f));
            this.f10497q3 = fVar;
        } else {
            this.f10501r3 = null;
            this.f10497q3 = cVar;
        }
        kh.k kVar = new kh.k(this);
        si.a aVar = this.f10497q3;
        eh.c cVar2 = new eh.c(aVar, aVar, aVar);
        cVar2.h = kVar;
        cVar2.f9986i = this;
        this.f10493p3 = cVar2;
        this.V1 = cVar2.c(this, bVar, false);
        gh.g c2 = cVar2.c(this, bVar, false);
        this.W1 = c2;
        c2.u(org.telegram.messenger.g0.L(32.0f));
        m3 m3Var = new m3(this, context, g4Var, r9Var);
        this.M0 = m3Var;
        m3Var.setClipChildren(false);
        this.U0 = new fx(this.f10480m2, m3Var);
        m3Var.addView(i3Var, mf.c(-1.0f, -1));
        q3 q3Var = new q3(this, getContext(), r9Var.E, r9Var, e6Var);
        this.f10510u0 = q3Var;
        q3Var.f10375c0.setOnClickListener(new c2(this, 10));
        ImageView imageView = new ImageView(context);
        this.f10522x0 = imageView;
        imageView.setImageDrawable(g4Var.f10324m);
        int L = org.telegram.messenger.g0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        imageView.setOnClickListener(new c2(this, 11));
        imageView.setContentDescription(bd.M0(2131745469, null));
        pf.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(g4Var.f10325n);
        imageView2.setPadding(L, L, L, L);
        d3 d3Var = new d3(this, getContext(), 1);
        this.f10530z0 = d3Var;
        org.telegram.ui.Components.g6 g6Var = this.B0;
        if (g6Var != null) {
            g6Var.setCallback(d3Var);
        }
        d3Var.setWillNotDraw(false);
        d3Var.setOnClickListener(new c2(this, 12));
        d3 d3Var2 = new d3(this, getContext(), 2);
        this.f10482n0 = d3Var2;
        org.telegram.ui.Components.g6 g6Var2 = this.A0;
        if (g6Var2 != null) {
            g6Var2.setCallback(d3Var2);
        }
        d3Var2.setWillNotDraw(false);
        d3Var2.setOnClickListener(new c2(this, 13));
        d3Var2.setOnLongClickListener(new j2(0, this, r9Var));
        e7 e7Var = new e7(context, g4Var);
        this.f10486o0 = e7Var;
        e7Var.setPadding(L, L, L, L);
        d3Var2.addView(this.f10486o0, mf.e(40, 40, 3));
        d3Var.addView(imageView2, mf.e(40, 40, 3));
        pf.b(d3Var2, 0.3f, 5.0f);
        pf.b(d3Var, 0.3f, 5.0f);
        c3Var.A1 = true;
        c3Var.H0(m3Var);
        cg.q0 q0Var = new cg.q0(10);
        this.f10467i1 = q0Var;
        m3Var.setOutlineProvider(q0Var);
        m3Var.setClipToOutline(true);
        addView(m3Var);
        f4 f4Var = new f4(context, h4Var);
        this.Y0 = f4Var;
        f4Var.setOnClickListener(new View.OnClickListener(this) {
            public final j4 f11225b;

            {
                this.f11225b = this;
            }

            @Override
            public final void onClick(View view) {
                int i3;
                int i10 = r3;
                r9 r9Var2 = r9Var;
                j4 j4Var = this.f11225b;
                switch (i10) {
                    case 0:
                        long j10 = h10.i(j4Var.f10480m2).f22848n;
                        long j11 = j4Var.f10477l1;
                        if (j10 == j11) {
                            Bundle k10 = org.telegram.ui.Cells.f1.k(1, "type");
                            k10.putLong("dialog_id", j4Var.f10477l1);
                            r9Var2.V(new r80(k10, null));
                            return;
                        } else if (j11 > 0) {
                            r9Var2.V(ProfileActivity.A4(j11));
                            return;
                        } else {
                            r9Var2.V(wm.ra(j11));
                            return;
                        }
                    default:
                        if (j4Var.f10527y1.j()) {
                            r9Var2.c0();
                            if (!r9.E1) {
                                hp.e1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            ai.d2 d2Var = j4Var.f10466i0;
                            if (!r9.E1) {
                                i3 = 2131748322;
                            } else {
                                i3 = 2131743859;
                            }
                            d2Var.setContentDescription(bd.M0(i3, null));
                            return;
                        }
                        j4Var.a1(true);
                        return;
                }
            }
        });
        m3Var.addView(f4Var, mf.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.N0 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10526y0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, mf.r(40, 40, 5));
        linearLayout.addView(d3Var, mf.r(40, 40, 5));
        linearLayout.addView(d3Var2, mf.r(40, 40, 5));
        addView(linearLayout, mf.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f10458g0 = imageView3;
        imageView3.setImageDrawable(g4Var.f10328q);
        imageView3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.h0(-1, 1, -1));
        imageView3.setContentDescription(bd.M0(2131754839, null));
        m3Var.addView(imageView3, mf.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.f10462h0 = imageView4;
        imageView4.setImageDrawable(g4Var.f10329r);
        imageView4.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.k6.h0(-1, 1, -1));
        imageView4.setContentDescription(bd.M0(2131754808, null));
        m3Var.addView(imageView4, mf.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new ai.b(r9Var, 18));
        imageView3.setOnClickListener(new f0(this, e6Var, r9Var, context, g4Var, 1));
        ai.d2 d2Var = new ai.d2(context, 2);
        this.f10466i0 = d2Var;
        m3Var.addView(d2Var, mf.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ?? imageView5 = new ImageView(context);
        this.f10469j0 = imageView5;
        imageView5.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        d2Var.addView(imageView5);
        ImageView imageView6 = new ImageView(context);
        this.f10473k0 = imageView6;
        imageView6.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        imageView6.setImageDrawable(g4Var.f10331t);
        d2Var.addView(imageView6);
        imageView6.setVisibility(8);
        u8 u8Var = new u8(context);
        this.m0 = u8Var;
        u8Var.setOnClickListener(new c2(this, 2));
        m3Var.addView(u8Var, mf.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        d2Var.setOnClickListener(new View.OnClickListener(this) {
            public final j4 f11225b;

            {
                this.f11225b = this;
            }

            @Override
            public final void onClick(View view) {
                int i3;
                int i10 = r3;
                r9 r9Var2 = r9Var;
                j4 j4Var = this.f11225b;
                switch (i10) {
                    case 0:
                        long j10 = h10.i(j4Var.f10480m2).f22848n;
                        long j11 = j4Var.f10477l1;
                        if (j10 == j11) {
                            Bundle k10 = org.telegram.ui.Cells.f1.k(1, "type");
                            k10.putLong("dialog_id", j4Var.f10477l1);
                            r9Var2.V(new r80(k10, null));
                            return;
                        } else if (j11 > 0) {
                            r9Var2.V(ProfileActivity.A4(j11));
                            return;
                        } else {
                            r9Var2.V(wm.ra(j11));
                            return;
                        }
                    default:
                        if (j4Var.f10527y1.j()) {
                            r9Var2.c0();
                            if (!r9.E1) {
                                hp.e1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            ai.d2 d2Var2 = j4Var.f10466i0;
                            if (!r9.E1) {
                                i3 = 2131748322;
                            } else {
                                i3 = 2131743859;
                            }
                            d2Var2.setContentDescription(bd.M0(i3, null));
                            return;
                        }
                        j4Var.a1(true);
                        return;
                }
            }
        });
        this.Z0 = new o8(this, g4Var);
        m3Var.addView(q3Var, mf.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f10518w0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        k2 k2Var = new k2(this, context, r9Var, r9Var.f10957w, view, frameLayout, r9Var);
        this.f10514v0 = k2Var;
        m3Var.addView(view, mf.e(-1, 200, 87));
        m3Var.addView(k2Var, mf.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        m3Var.addView(frameLayout, mf.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int L2 = org.telegram.messenger.g0.L(20.0f);
        int o10 = i0.a.o(-1, 100);
        d2Var.setBackground(org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, 0, o10, o10));
        int L3 = org.telegram.messenger.g0.L(20.0f);
        int o11 = i0.a.o(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, 0, o11, o11));
        int L4 = org.telegram.messenger.g0.L(20.0f);
        int o12 = i0.a.o(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.k6.k0(L4, L4, L4, L4, 0, o12, o12));
        int L5 = org.telegram.messenger.g0.L(20.0f);
        int o13 = i0.a.o(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.k0(L5, L5, L5, L5, 0, o13, o13));
        int L6 = org.telegram.messenger.g0.L(20.0f);
        int o14 = i0.a.o(-1, 100);
        d3Var2.setBackground(org.telegram.ui.ActionBar.k6.k0(L6, L6, L6, L6, 0, o14, o14));
        int L7 = org.telegram.messenger.g0.L(20.0f);
        int o15 = i0.a.o(-1, 100);
        d3Var.setBackground(org.telegram.ui.ActionBar.k6.k0(L7, L7, L7, L7, 0, o15, o15));
        org.telegram.ui.Cells.r9 r9Var2 = q3Var.f10373a0;
        View n4 = r9Var2.n(context);
        if (n4 != null) {
            org.telegram.messenger.g0.E2(n4);
            addView(n4);
        }
        r9Var2.D = new l2(this, 0);
        r9Var2.S(this);
    }

    public static void T0(y6 y6Var, ImageReceiver imageReceiver, String str) {
        if (y6Var.f11241s) {
            imageReceiver.u0(null, null, ac.g(y6Var.f11238f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.r0(ac.g(y6Var.f11237e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void X(j4 j4Var, ValueAnimator valueAnimator) {
        float f10;
        u8 u8Var = j4Var.m0;
        j4Var.O3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        f4 f4Var = j4Var.Y0;
        f4Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var.O3);
        f4Var.setAlpha(1.0f - j4Var.O3);
        ImageView imageView = j4Var.f10458g0;
        imageView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var.O3);
        imageView.setAlpha(1.0f - j4Var.O3);
        ImageView imageView2 = j4Var.f10462h0;
        imageView2.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var.O3);
        imageView2.setAlpha(1.0f - j4Var.O3);
        ai.d2 d2Var = j4Var.f10466i0;
        d2Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var.O3);
        d2Var.setAlpha((1.0f - j4Var.O3) * j4Var.O2);
        d3 d3Var = j4Var.G1;
        if (d3Var != null) {
            d3Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * j4Var.O3);
            j4Var.G1.setAlpha(1.0f - j4Var.O3);
        }
        if (u8Var != null) {
            u8Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var.O3);
            u8Var.setAlpha(1.0f - j4Var.O3);
        }
        j4Var.f10510u0.setAlpha(1.0f - j4Var.O3);
        c4 c4Var = j4Var.A1;
        if (c4Var == null) {
            f10 = 0.0f;
        } else {
            f10 = ((i9) c4Var).d.W;
        }
        float hideInterfaceAlpha = j4Var.getHideInterfaceAlpha();
        d3 d3Var2 = j4Var.f10482n0;
        if (d3Var2 != null) {
            d3Var2.setAlpha((1.0f - j4Var.O3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        ImageView imageView3 = j4Var.f10522x0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - j4Var.O3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        d3 d3Var3 = j4Var.f10530z0;
        if (d3Var3 != null) {
            d3Var3.setAlpha((1.0f - j4Var.O3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        s2 s2Var = j4Var.L1;
        if (s2Var != null) {
            s2Var.setAlpha(1.0f - j4Var.O3);
            j4Var.invalidate();
        }
        j4Var.M0.invalidate();
    }

    public static void Y(j4 j4Var, boolean z10) {
        org.telegram.ui.ActionBar.y0 y0Var = j4Var.f10485n3;
        if (y0Var != null && j4Var.f10481m3 != null && y0Var.getVisibility() == 0) {
            if (z10) {
                if (Math.abs(r9.C1 - 0.2f) < 0.05f) {
                    j4Var.f10485n3.setSubtext(bd.M0(2131743584, null));
                } else if (Math.abs(r9.C1 - 0.5f) < 0.05f) {
                    j4Var.f10485n3.setSubtext(bd.M0(2131743586, null));
                } else if (Math.abs(r9.C1 - 1.0f) < 0.05f) {
                    j4Var.f10485n3.setSubtext(bd.M0(2131743587, null));
                } else if (Math.abs(r9.C1 - 1.5f) < 0.05f) {
                    j4Var.f10485n3.setSubtext(bd.M0(2131743588, null));
                } else if (Math.abs(r9.C1 - 2.0f) < 0.05f) {
                    j4Var.f10485n3.setSubtext(bd.M0(2131743585, null));
                } else {
                    org.telegram.ui.ActionBar.y0 y0Var2 = j4Var.f10485n3;
                    y0Var2.setSubtext(bd.a0(null, null, 2131743589, cu0.a(r9.C1) + "x"));
                }
            }
            j4Var.f10481m3.K(z10, r9.C1);
        }
    }

    public static void Z(j4 j4Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (!j4Var.G0() && !j4Var.f10527y1.f10362f) {
            if (h10.i(j4Var.f10480m2).q()) {
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232393, bd.M0(2131744897, null), false, j4Var.f10476l0).setOnClickListener(new c2(j4Var, 8));
                return;
            }
            Drawable drawable = j4Var.getContext().getDrawable(2131232169);
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            m2 m2Var = new m2(j4Var.getContext().getDrawable(2131232381), drawable, 0);
            org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232393, bd.M0(2131744897, null), false, j4Var.f10476l0);
            c2.setOnClickListener(new c2(j4Var, 9));
            c2.setIcon(m2Var);
        }
    }

    public static void b0(j4 j4Var) {
        h4 h4Var = j4Var.f10527y1;
        TL_stories.StoryItem storyItem = h4Var.f10358a;
        if ((storyItem == null && h4Var.f10359b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = h4Var.h();
        boolean z10 = h4Var.f10361e;
        if (h != null && h.exists()) {
            MediaController.d0(h.toString(), j4Var.getContext(), z10 ? 1 : 0, null, null, new ci.b8(1, j4Var, z10));
            return;
        }
        j4Var.Y0();
    }

    public static void c0(j4 j4Var, long j10) {
        String str;
        boolean z10;
        TLRPC.User user;
        if (j10 > 0) {
            TLRPC.User a22 = hp.s1(j4Var.f10480m2).a2(Long.valueOf(j10));
            str = a22.first_name;
            z10 = a22.stories_hidden;
            user = a22;
        } else {
            TLRPC.Chat M0 = hp.s1(j4Var.f10480m2).M0(Long.valueOf(-j10));
            str = M0.title;
            z10 = M0.stories_hidden;
            user = M0;
        }
        org.telegram.messenger.g0.i3(new ci.n(j4Var, hp.s1(j4Var.f10480m2), j10, !z10, str, user), 200L);
    }

    public static void d0(j4 j4Var) {
        int i3;
        int i10;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, j4Var.getContext(), j4Var.f10476l0);
        if (j4Var.G0()) {
            i3 = 2131751565;
        } else {
            i3 = 2131751488;
        }
        String M0 = bd.M0(i3, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        if (j4Var.G0()) {
            i10 = 2131751566;
        } else {
            i10 = 2131751489;
        }
        s1Var.U = bd.M0(i10, null);
        alertDialog$Builder.k(bd.M0(2131751599, null), new x1(j4Var, 2));
        alertDialog$Builder.h(bd.M0(2131752589, null), new d2.t1(20));
        ((i9) j4Var.A1).h(s1Var);
        s1Var.i();
    }

    public static void f0(j4 j4Var) {
        String str;
        org.telegram.ui.Components.ac K;
        org.telegram.ui.ActionBar.e6 e6Var = j4Var.f10476l0;
        m3 m3Var = j4Var.M0;
        if (j4Var.f10495q1) {
            return;
        }
        if (j4Var.f10487o1) {
            if (j4Var.f10509t3 != null && j4Var.f10513u3 != null) {
                vg.i0.w1(new ai.c7(j4Var, 2), j4Var.f10509t3, j4Var.f10513u3, j4Var.f10477l1, true);
                return;
            }
            r9 r9Var = j4Var.f10506t0;
            if (r9Var != null) {
                r9Var.f10935l1 = true;
                r9Var.d0();
            }
            hp.s1(j4Var.f10480m2).G0().a(j4Var.f10477l1, new d2(j4Var, 0));
            return;
        }
        s2 s2Var = j4Var.L1;
        int i3 = -j4Var.f10444b1;
        j4Var.f10444b1 = i3;
        org.telegram.messenger.g0.G3(i3, s2Var, null);
        org.telegram.messenger.p2.APP_ERROR.a();
        if (j4Var.f10477l1 >= 0) {
            str = l10.p(hp.s1(j4Var.f10480m2).a2(Long.valueOf(j4Var.f10477l1)));
        } else {
            str = "";
        }
        if (hp.s1(j4Var.f10480m2).D3()) {
            K = new fc(m3Var, e6Var).Q(2131624216, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131743768, str)));
        } else {
            K = new fc(m3Var, e6Var).K(2131624216, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131743768, str)), bd.M0(2131743769, null), new a2(j4Var, 5));
        }
        K.j();
    }

    public org.telegram.messenger.c getAccountInstance() {
        return org.telegram.messenger.c.a(this.f10480m2);
    }

    public float getHideInterfaceAlpha() {
        float f10;
        float f11 = 1.0f - this.f10528y2.f38645c;
        s5 s5Var = this.f10506t0.f10960x;
        if (s5Var == null) {
            f10 = 0.0f;
        } else {
            f10 = s5Var.f11001f;
        }
        return (1.0f - f10) * f11;
    }

    public long getMessageMinPrice() {
        r9 r9Var;
        if (!this.f10527y1.f10362f || (r9Var = this.f10506t0) == null || r9Var.B0 == null || B0(true)) {
            return 0L;
        }
        return r9Var.B0.j();
    }

    public static void h0(j4 j4Var) {
        h4 h4Var = j4Var.f10527y1;
        if (h4Var.f10358a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.f27245id = h4Var.f10358a.f27240id;
        tL_stories_exportStoryLink.peer = hp.s1(j4Var.f10480m2).j1(j4Var.f10477l1);
        ConnectionsManager.getInstance(j4Var.f10480m2).sendRequest(tL_stories_exportStoryLink, new Object());
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
        textView.setText(bd.M0(2131744463, null));
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f10476l0;
        org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
        TextView textView2 = new TextView(getContext());
        pf.a(textView2);
        textView2.setText(bd.M0(2131754230, null));
        int i10 = org.telegram.ui.ActionBar.k6.Gi;
        org.telegram.ui.ActionBar.r6.V(textView2, i10, e6Var);
        textView2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 15.0f);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i10, e6Var), 30);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, o10, o10);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i10, 30);
        textView2.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(textView2, k02, N, h, e6Var);
        textView2.setOnClickListener(new c2(this, 3));
        linearLayout.addView(textView, mf.o(-1, -2));
        linearLayout.addView(textView2, mf.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, mf.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.M0.addView(frameLayout);
        this.K2 = frameLayout;
    }

    public final boolean B0(boolean z10) {
        g1 g1Var;
        TLRPC.Peer i3;
        g1 g1Var2;
        long e10 = h10.i(this.f10480m2).e();
        int i10 = (this.f10477l1 > 0L ? 1 : (this.f10477l1 == 0L ? 0 : -1));
        r9 r9Var = this.f10506t0;
        if (i10 < 0 && (g1Var2 = r9Var.B0) != null) {
            if (z10) {
                TLRPC.Peer i11 = g1Var2.i();
                TLRPC.Chat M0 = hp.s1(this.f10480m2).M0(Long.valueOf(-this.f10477l1));
                if (r9Var.B0.l() || org.telegram.messenger.t3.w(14, M0)) {
                    if (i11 == null || this.f10477l1 == org.telegram.messenger.m5.o(i11) || org.telegram.messenger.m5.o(i11) == h10.i(this.f10480m2).e()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } else if (i10 >= 0 && r9Var != null && (g1Var = r9Var.B0) != null && g1Var.l()) {
            if (!z10 || (i3 = r9Var.B0.i()) == null || this.f10477l1 == org.telegram.messenger.m5.o(i3) || org.telegram.messenger.m5.o(i3) == e10 || this.f10477l1 == e10) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public final void C0(Canvas canvas, int i3, int i10) {
        TextureView textureView;
        i4 i4Var = this.f10520w2;
        org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) i4Var.f10405e;
        if (l4Var != null && ((SurfaceView) i4Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i3, i10, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                org.telegram.messenger.g0.z0((SurfaceView) i4Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else if (l4Var != null && (textureView = (TextureView) i4Var.f10406f) != null) {
            Bitmap bitmap = textureView.getBitmap(i3, i10);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            canvas.save();
            m3 m3Var = this.M0;
            canvas.scale(i3 / m3Var.getMeasuredWidth(), i10 / m3Var.getMeasuredHeight());
            this.O0.h(canvas, null);
            canvas.restore();
        }
    }

    public final void D0(gi.r8 r8Var, TL_stories.StoryItem storyItem) {
        int i3;
        View[] viewPages;
        c4 c4Var = this.A1;
        Context context = getContext();
        if (storyItem.pinned) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = storyItem.expire_date - storyItem.date;
        }
        gi.t8 t8Var = new gi.t8(i3, context, this.f10476l0);
        t8Var.W0(r8Var);
        gi.g1 g1Var = t8Var.f13621j1;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof gi.o8) {
                    ((gi.o8) view).f(false);
                }
            }
        }
        t8Var.Q0(true);
        t8Var.L1 = new ai.n(14, this, storyItem);
        ((i9) c4Var).h(t8Var);
    }

    public final boolean E0(android.view.ViewGroup r11, float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: ei.j4.E0(android.view.ViewGroup, float, float, boolean):boolean");
    }

    public final boolean F0(View view, MotionEvent motionEvent) {
        float x10 = getX();
        m3 m3Var = this.M0;
        float x11 = view.getX() + m3Var.getX() + x10;
        float y9 = view.getY() + m3Var.getY() + getY();
        if (motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + view.getWidth() && motionEvent.getY() >= y9 && motionEvent.getY() <= y9 + view.getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean G0() {
        r6 r6Var;
        r9 r9Var = this.f10506t0;
        if (r9Var != null && (r6Var = r9Var.P0) != null && r6Var.f10873e == 4) {
            return true;
        }
        return false;
    }

    public final boolean H0() {
        TLRPC.User a22;
        if (!G0() || (a22 = hp.s1(this.f10480m2).a2(Long.valueOf(this.f10506t0.P0.d))) == null || !a22.bot || !a22.bot_can_edit) {
            return false;
        }
        return true;
    }

    public abstract boolean I0();

    public final void J0(dh.n0 n0Var) {
        boolean z10;
        boolean z11;
        int i3;
        TLRPC.Reaction reaction;
        h4 h4Var = this.f10527y1;
        TL_stories.StoryItem storyItem = h4Var.f10358a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        if (reaction2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (reaction2 != null && n0Var == null) {
            j0();
            this.C1.j0(this.f10477l1, h4Var.f10358a, null);
        } else if (n0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(this.f10480m2).f24045r.get("❤");
            if (tL_availableReaction != null) {
                this.Z2 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a10 = dh.j0.a();
                ac b10 = ac.b(document);
                ImageReceiver imageReceiver = this.V2;
                imageReceiver.q0(b10, a10, null, null, null, 0);
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                this.f10443a3 = true;
                this.C1.j0(this.f10477l1, h4Var.f10358a, dh.n0.c(tL_availableReaction));
            }
        } else {
            j0();
            this.C1.j0(this.f10477l1, h4Var.f10358a, n0Var);
        }
        TL_stories.StoryItem storyItem2 = h4Var.f10358a;
        d3 d3Var = this.f10482n0;
        if (storyItem2 != null && (reaction = storyItem2.sent_reaction) != null) {
            z10 = !z10;
            this.f10486o0.setReaction(dh.n0.d(reaction));
            d3Var.setContentDescription(bd.M0(2131754850, null));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z11 = true;
        } else {
            this.f10486o0.setReaction(null);
            d3Var.setContentDescription(bd.M0(2131754851, null));
            z11 = false;
        }
        if (this.f10483n1 && z10) {
            TL_stories.StoryItem storyItem3 = h4Var.f10358a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = h4Var.f10358a.views;
            int i10 = storyViews.reactions_count;
            if (z11) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            int i11 = i10 + i3;
            storyViews.reactions_count = i11;
            if (i11 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = h4Var.f10358a;
        dh.p0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        i1(true);
    }

    public final void K0() {
        g1 g1Var;
        boolean z10;
        if (this.f10529y3 == null) {
            r9 r9Var = this.f10506t0;
            if (r9Var != null && (g1Var = r9Var.B0) != null) {
                TLRPC.GroupCall groupCall = g1Var.f10304w;
                if (groupCall == null) {
                    z10 = false;
                } else {
                    z10 = !groupCall.messages_enabled;
                }
                if (z10) {
                    return;
                }
            }
            TLRPC.TL_channels_sendAsPeers M1 = hp.s1(this.f10480m2).M1(this.f10477l1, true);
            this.f10529y3 = M1;
            s2 s2Var = this.L1;
            if (s2Var != null && M1 != null) {
                s2Var.Q1(true);
            }
        }
    }

    public final boolean L0() {
        s2 s2Var = this.L1;
        if (s2Var == null) {
            return false;
        }
        boolean z10 = s2Var.A2;
        if (z10) {
            s2Var.r1();
        }
        org.telegram.messenger.g0.i3(new a2(this, 3), 300L);
        return z10;
    }

    public final void M0() {
        CharSequence charSequence;
        long j10;
        d2 d2Var;
        int i3;
        long j11;
        long j12;
        hp.e1().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.L1.getTextWithEntities();
        long e10 = h10.i(this.f10480m2).e();
        TLRPC.Peer i10 = this.f10506t0.B0.i();
        if (i10 != null) {
            e10 = org.telegram.messenger.m5.o(i10);
        }
        Context context = getContext();
        int i11 = this.f10480m2;
        String s6 = org.telegram.messenger.m5.s(i11, this.f10477l1);
        long messageMinPrice = getMessageMinPrice();
        long j13 = this.f10517v3;
        d2 d2Var2 = new d2(this, 1);
        b bVar = new b();
        org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(1, context, (org.telegram.ui.ActionBar.e6) bVar, false);
        t2Var.N();
        t2Var.f28621w0 = false;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        t2Var.O = f10;
        int[] iArr = hp.s1(i11).X6;
        CharSequence j02 = zi.j0(textWithEntities, false, false, new TextPaint());
        if (j02 instanceof Spannable) {
            Spannable spannable = (Spannable) j02;
            charSequence = j02;
            j10 = j13;
            d2Var = d2Var2;
            i3 = ((org.telegram.ui.Components.p5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.p5.class)).length + ((org.telegram.messenger.f6[]) spannable.getSpans(0, charSequence.length(), org.telegram.messenger.f6.class)).length;
        } else {
            charSequence = j02;
            j10 = j13;
            d2Var = d2Var2;
            i3 = 0;
        }
        if (j10 <= 0) {
            j11 = 100;
        } else {
            j11 = j10;
        }
        int max = (int) Math.max(messageMinPrice, j11);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length >= 0) {
                int i12 = length * 7;
                int i13 = iArr[i12];
                j12 = messageMinPrice;
                int i14 = iArr[i12 + 2];
                if (i3 <= iArr[i12 + 3] && charSequence.length() <= i14) {
                    max = Math.max(max, i13);
                    break;
                } else {
                    length--;
                    messageMinPrice = j12;
                }
            } else {
                j12 = messageMinPrice;
                break;
            }
        }
        long[] jArr = {max};
        gi.d dVar = new gi.d(context, null, true);
        ?? obj = new Object();
        obj.f11071c = e10;
        obj.f11073f = textWithEntities;
        obj.f11074g = jArr[0];
        p0 p0Var = new p0(i11, context, true);
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
        ai.o2 o2Var = new ai.o2(context, bd.M0(2131748822, null), bVar);
        f11.addView(o2Var, mf.q(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        ai.o2 o2Var2 = new ai.o2(context, bd.M0(2131748823, null), bVar);
        f11.addView(o2Var2, mf.q(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        ai.o2 o2Var3 = new ai.o2(context, bd.M0(2131748824, null), bVar);
        f11.addView(o2Var3, mf.q(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        t tVar = new t(context, bVar, r1);
        d2 d2Var3 = d2Var;
        long j14 = j12;
        u10[] u10VarArr = {new s(jArr, dVar, new wp[1], (u0) obj, p0Var, i11, o2Var, o2Var2, o2Var3, tVar, new boolean[]{true})};
        p0Var.set(obj);
        int i15 = 9;
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int i16 = hp.s1(i11).Y6;
        ArrayList arrayList = new ArrayList();
        int i17 = 0;
        while (true) {
            if (i17 >= i15) {
                break;
            }
            int[] iArr3 = iArr2;
            if (iArr2[i17] >= j14) {
                if (i17 > 0 && arrayList.isEmpty() && iArr3[i17] > j14) {
                    arrayList.add(Integer.valueOf((int) j14));
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
        if (arrayList.isEmpty() || ((Integer) k2.p1.h(1, arrayList)).intValue() < i16) {
            arrayList.add(Integer.valueOf(i16));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            iArr4[i19] = ((Integer) arrayList.get(i19)).intValue();
        }
        tVar.f5866f0 = iArr4;
        tVar.setValue((int) jArr[0]);
        f10.addView(tVar, mf.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        u10VarArr[0].a(Integer.valueOf((int) jArr[0]));
        f10.addView(f11, mf.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i20 = org.telegram.ui.ActionBar.k6.f27988j5;
        TextView b10 = rf.b(context, 20.0f, i20, true, bVar);
        org.telegram.messenger.k5.m(b10, 17, null, 2131748819);
        f10.addView(b10, mf.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = rf.b(context, 14.0f, i20, false, bVar);
        b11.setGravity(17);
        org.telegram.messenger.k5.r(null, null, 2131748820, new Object[]{s6}, b11);
        f10.addView(b11, mf.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        f10.addView(p0Var, mf.t(-2, -2, 17, 42, 22, 42, 20));
        f10.addView(dVar, mf.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        t2Var.show();
        dVar.setOnClickListener(new ai.h(d2Var3, jArr, t2Var, 9));
    }

    public final void N0() {
        if (this.L1 == null) {
            return;
        }
        r0();
        this.f10504s2.f32215b2.i0();
        this.f10504s2.y1(-1, true);
        x2 x2Var = this.f10504s2;
        x2Var.R1 = this.f10477l1;
        x2Var.e1();
        this.f10504s2.a1().setText(this.L1.getFieldText());
        ((i9) this.A1).h(this.f10504s2);
    }

    public final void O0() {
        Bundle bundle = new Bundle();
        long j10 = this.f10477l1;
        if (j10 < 0) {
            bundle.putLong("chat_id", -j10);
        } else {
            bundle.putLong("user_id", j10);
        }
        TLRPC.Dialog S0 = hp.s1(this.f10480m2).S0(this.f10477l1);
        if (S0 != null) {
            bundle.putInt("message_id", S0.top_message);
        }
        this.f10506t0.V(new wm(bundle));
    }

    public final void P0(long r24) {
        throw new UnsupportedOperationException("Method not decompiled: ei.j4.P0(long):void");
    }

    public final void Q0(android.net.Uri r18) {
        throw new UnsupportedOperationException("Method not decompiled: ei.j4.Q0(android.net.Uri):void");
    }

    public final void R0(long j10, boolean z10) {
        int i3;
        int i10;
        h4 h4Var;
        if (this.f10511u1 != z10) {
            this.f10511u1 = z10;
            fh0 fh0Var = this.f10469j0;
            int i11 = 0;
            if (z10) {
                if (this.f10506t0.f10908a && Build.VERSION.SDK_INT < 33) {
                    r9 r9Var = ((i9) this.A1).d;
                    r9Var.m1 = true;
                    r9Var.d0();
                    a3.o oVar = this.G3;
                    org.telegram.messenger.g0.r(oVar);
                    org.telegram.messenger.g0.i3(oVar, 100L);
                }
                P0(j10);
                e1();
                fh0Var.setAnimation(this.f10463h1.f10332u);
                this.f10511u1 = true;
                this.Y0.f10263a.getImageReceiver().O0(true, true);
                if (this.f10527y1.f10358a != null) {
                    org.telegram.messenger.a8.b("StoryViewer displayed story dialogId=" + this.f10477l1 + " storyId=" + h4Var.f10358a.f27240id + " " + h4.c(h4Var));
                }
            } else {
                n0();
                fh0Var.a();
                this.V0 = null;
                this.f10516v2 = false;
                this.f10528y2.e(true, 0.0f);
                this.M0.invalidate();
                invalidate();
                o0();
                r9 r9Var2 = ((i9) this.A1).d;
                r9Var2.J0 = false;
                r9Var2.d0();
            }
            if (this.f10511u1) {
                i3 = 3;
            } else {
                i3 = 2;
            }
            this.O0.h0(i3);
            if (this.f10511u1) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            this.P0.h0(i10);
            if (this.f10511u1) {
                i11 = 2;
            }
            this.Q0.h0(i11);
            if (this.m1 || this.f10483n1) {
                z6 z6Var = this.C1;
                long j11 = this.f10477l1;
                boolean z11 = this.f10511u1;
                a0.h hVar = z6Var.f11284m;
                aa aaVar = (aa) hVar.f(j11);
                if (aaVar == null) {
                    aaVar = new aa(z6Var.f11274a, j11, z6Var);
                    hVar.k(aaVar, j11);
                }
                aaVar.b(z11);
            }
        }
    }

    public final void S0(int i3, long j10) {
        if (this.f10477l1 != j10) {
            h4 h4Var = this.f10527y1;
            h4Var.f10359b = null;
            h4Var.f10358a = null;
        }
        this.f10477l1 = j10;
        this.f10470j1 = null;
        m0(i3);
        TL_stories.PeerStories peerStories = this.f10506t0.R0;
        boolean z10 = true;
        if (peerStories != null) {
            this.C1.V(peerStories, true);
            return;
        }
        z6 z6Var = this.C1;
        TL_stories.PeerStories y9 = z6Var.y(j10);
        if (y9 == null) {
            y9 = z6Var.z(j10);
        } else {
            z10 = false;
        }
        z6Var.V(y9, z10);
    }

    public final void U0(long j10, boolean z10, boolean z11) {
        String str;
        if (!z10 && j10 == this.f10521w3 && this.f10525x3 == z11) {
            return;
        }
        this.f10521w3 = j10;
        this.f10525x3 = z11;
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        f4 f4Var = this.Y0;
        if (i3 >= 0) {
            if (this.m1 && !z11) {
                f4Var.f10264b.l(bd.M0(2131745651, null), false);
                f4Var.f10264b.i(null);
                return;
            }
            TLRPC.User a22 = hp.s1(this.f10480m2).a2(Long.valueOf(j10));
            if (a22 != null && a22.verified) {
                Drawable mutate = getContext().getDrawable(2131232791).mutate();
                mutate.setAlpha(255);
                xp xpVar = new xp(mutate, null);
                xpVar.f40447x = true;
                int L = org.telegram.messenger.g0.L(16.0f);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                xpVar.h = L;
                xpVar.f40443n = L2;
                f4Var.f10264b.i(xpVar);
            } else {
                f4Var.f10264b.i(null);
            }
            if (a22 != null) {
                f4Var.f10264b.l(org.telegram.messenger.i6.m(org.telegram.messenger.g0.D2(org.telegram.messenger.g5.p(a22)), f4Var.f10264b.getPaint().getFontMetricsInt(), false, null, 0), false);
                return;
            }
            f4Var.f10264b.l(null, false);
            return;
        }
        TLRPC.Chat M0 = hp.s1(this.f10480m2).M0(Long.valueOf(-j10));
        e4 e4Var = f4Var.f10264b;
        e4 e4Var2 = f4Var.f10264b;
        if (M0 == null) {
            str = "";
        } else {
            str = M0.title;
        }
        e4Var.l(org.telegram.messenger.g0.D2(str), false);
        if (M0 != null && M0.verified) {
            Drawable mutate2 = getContext().getDrawable(2131232791).mutate();
            mutate2.setAlpha(255);
            xp xpVar2 = new xp(mutate2, null);
            xpVar2.f40447x = true;
            int L3 = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            xpVar2.h = L3;
            xpVar2.f40443n = L4;
            e4Var2.i(xpVar2);
            return;
        }
        e4Var2.i(null);
    }

    public final void V0(float f10, float f11, o4 o4Var) {
        this.W0 = f10;
        this.f10475k3 = 1.0f / f11;
        if (this.V0 != o4Var) {
            this.V0 = o4Var;
            if (o4Var != null) {
                ImageReceiver imageReceiver = o4Var.f10688a;
                if (imageReceiver.n() != null) {
                    Bitmap copy = imageReceiver.n().copy(Bitmap.Config.ARGB_8888, false);
                    c3 c3Var = this.O0;
                    c3Var.f21236d0 = null;
                    c3Var.f21229a1.setShader(null);
                    c3Var.N0(new BitmapDrawable(copy));
                }
            }
        }
    }

    public final void W0(boolean z10) {
        boolean z11;
        h4 h4Var = this.f10527y1;
        if (h4Var.f10358a != null) {
            r9 r9Var = this.f10506t0;
            if (r9Var.f10922f != null) {
                String e10 = h4Var.e();
                TLRPC.Chat chat = null;
                if (z10) {
                    q2 q2Var = new q2(2, this.f10476l0);
                    if (this.f10483n1) {
                        chat = hp.s1(this.f10480m2).M0(Long.valueOf(-this.f10477l1));
                    }
                    if (hp.s1(this.f10480m2).W4() && ((!this.f10483n1 && !l10.A(this.f10477l1)) || org.telegram.messenger.t3.t0(chat))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a3 a3Var = new a3(this, r9Var.f10922f.getContext(), e10, e10, z11, q2Var);
                    this.J2 = a3Var;
                    a3Var.f36876b2 = true;
                    TL_stories.StoryItem storyItem = h4Var.f10358a;
                    storyItem.dialogId = this.f10477l1;
                    a3Var.f36912y2 = storyItem;
                    a3Var.f36887l2 = new bb.c(this, 22);
                    ((i9) this.A1).h(a3Var);
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", e10);
                LaunchActivity.K1.startActivityForResult(Intent.createChooser(intent, bd.M0(2131744856, null)), 500);
            }
        }
    }

    public final void X0() {
        m3 m3Var = this.M0;
        org.telegram.ui.ActionBar.e6 e6Var = this.f10476l0;
        org.telegram.messenger.k5.p(null, 2131743843, new fc(m3Var, e6Var), e6Var);
    }

    public final void Y0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f10476l0);
        String M0 = bd.M0(2131689472, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        alertDialog$Builder.k(bd.M0(2131747839, null), null);
        s1Var.U = bd.M0(2131747226, null);
        ((i9) this.A1).h(s1Var);
    }

    public final void Z0(boolean z10) {
        if (this.f10448c3 != z10) {
            h4 h4Var = this.f10527y1;
            if (h4Var.f10358a != null) {
                this.f10448c3 = z10;
                if (z10) {
                    this.f10446b3.setVisibility(0);
                }
                this.f10446b3.setStoryItem(h4Var.f10358a);
                r9 r9Var = ((i9) this.A1).d;
                r9Var.f10944q1 = z10;
                r9Var.d0();
                float f10 = 0.0f;
                if (z10) {
                    float f11 = this.f10451d3;
                    if (z10) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    this.f10446b3.setTransitionProgress(this.f10451d3);
                    ofFloat.addUpdateListener(new b2(this, 1));
                    ofFloat.addListener(new n2(this, z10, 0));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(xq.f40453g);
                    ofFloat.start();
                    return;
                }
                if (this.f10446b3.getReactionsWindow() != null) {
                    this.f10446b3.getReactionsWindow().e();
                }
                this.f10446b3.animate().alpha(0.0f).setDuration(150L).setListener(new o2(this, 0)).start();
            }
        }
    }

    public final void a1(boolean z10) {
        int i3;
        if (this.f10494q0 == null) {
            gi.l3 l3Var = new gi.l3(getContext(), 1);
            l3Var.o(1.0f, -56.0f);
            this.f10494q0 = l3Var;
            l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
            this.M0.addView(this.f10494q0, mf.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        gi.l3 l3Var2 = this.f10494q0;
        if (z10) {
            i3 = 2131744617;
        } else {
            i3 = 2131744467;
        }
        l3Var2.u(bd.M0(i3, null));
        this.f10494q0.w();
    }

    public final boolean b1(boolean z10) {
        if (this.f10506t0.S0) {
            z10 = !z10;
        }
        if (z10) {
            if (this.f10507t1 < getStoriesCount() - 1) {
                this.f10507t1++;
                d1(false);
                return true;
            }
        } else {
            int i3 = this.f10507t1;
            if (i3 > 0) {
                this.f10507t1 = i3 - 1;
                d1(false);
                return true;
            }
        }
        return false;
    }

    public final void c1() {
        if (!hp.s1(this.f10480m2).W4()) {
            return;
        }
        File h = this.f10527y1.h();
        if (h != null && h.exists()) {
            a3 a3Var = this.J2;
            if (a3Var != null) {
                a3Var.dismiss();
            }
            org.telegram.messenger.g0.i3(new a2(this, 8), 120L);
            return;
        }
        Y0();
    }

    public final void d1(boolean r55) {
        throw new UnsupportedOperationException("Method not decompiled: ei.j4.d1(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        float f10;
        g1 g1Var;
        boolean z10;
        int i11 = hs.f23324v5;
        long j10 = 0;
        r9 r9Var = this.f10506t0;
        boolean z11 = false;
        if (i3 != i11 && (i3 != hs.f23338x5 || r9Var.P0 != objArr[0])) {
            if (i3 == hs.f23266m3) {
                d1(false);
                return;
            } else if (i3 == hs.f23246i4) {
                this.f10510u0.f10375c0.invalidate();
                return;
            } else if (i3 == hs.D5) {
                p0(true);
                return;
            } else if (i3 == hs.f23205b3) {
                t6 o10 = hp.s1(this.f10480m2).P1().o();
                if (o10 != null && o10.a(this.f10480m2, 1) && this.A1 != null) {
                    ai.c7 c7Var = new ai.c7(this, 2);
                    Context W = org.telegram.messenger.g0.W(getContext());
                    if (W == null) {
                        W = LaunchActivity.K1;
                    }
                    ((i9) this.A1).h(new vg.i0(o10.b(), this.f10480m2, W, c7Var, null));
                    return;
                }
                return;
            } else if (i3 == hs.i3) {
                TL_account.RequirementToContact J2 = hp.s1(this.f10480m2).J2(this.f10477l1);
                if (this.f10477l1 >= 0 && !h10.i(this.f10480m2).q() && (J2 instanceof TL_account.requirementToContactPremium)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f10491p1 != z10 || this.f10499r1 != org.telegram.messenger.m5.k(J2)) {
                    this.f10491p1 = z10;
                    this.f10499r1 = org.telegram.messenger.m5.k(J2);
                    d1(false);
                    p0(true);
                    return;
                }
                return;
            } else if (i3 == hs.T) {
                Object obj = objArr[0];
                if ((obj instanceof TLRPC.ChatFull) && this.f10477l1 == (-((TLRPC.ChatFull) obj).f27002id)) {
                    d1(false);
                    return;
                }
                return;
            } else if (i3 == hs.G2) {
                long longValue = ((Long) objArr[0]).longValue();
                if (r9Var != null && (g1Var = r9Var.B0) != null && g1Var.g() == longValue) {
                    d1(false);
                    s2 s2Var = this.L1;
                    if (s2Var != null) {
                        s2Var.E(true);
                        this.L1.Q1(true);
                        p0(true);
                    }
                    k2 k2Var = this.f10514v0;
                    if (k2Var != null) {
                        g1 g1Var2 = k2Var.Q;
                        if (g1Var2 != null) {
                            j10 = g1Var2.j();
                        }
                        if (k2Var.I != j10) {
                            k2Var.f11153e.O(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i3 == hs.F && ((Boolean) objArr[2]).booleanValue()) {
                K0();
                return;
            } else {
                return;
            }
        }
        c4 c4Var = this.A1;
        if (c4Var == null || !((i9) c4Var).d.I0) {
            if (this.f10511u1) {
                h1();
                if (this.k1 == 0) {
                    if (!this.f10488o2) {
                        this.f10488o2 = true;
                        ((i9) this.A1).j();
                        return;
                    }
                    return;
                }
                int i12 = this.f10507t1;
                ArrayList arrayList = this.f10455f1;
                int size = arrayList.size();
                ArrayList arrayList2 = this.f10459g1;
                if (i12 >= arrayList2.size() + size) {
                    this.f10507t1 = (arrayList2.size() + arrayList.size()) - 1;
                }
                d1(false);
                if (this.m1 || this.f10483n1) {
                    i1(true);
                }
            }
            TL_stories.PeerStories peerStories = r9Var.R0;
            if (peerStories != null) {
                this.C1.V(peerStories, true);
            } else {
                long j11 = this.f10477l1;
                if (j11 != 0) {
                    z6 z6Var = this.C1;
                    TL_stories.PeerStories y9 = z6Var.y(j11);
                    if (y9 == null) {
                        y9 = z6Var.z(j11);
                        z11 = true;
                    }
                    z6Var.V(y9, z11);
                }
            }
            org.telegram.ui.ActionBar.y0 y0Var = this.f10447c1;
            if (y0Var != null) {
                ViewPropertyAnimator animate = y0Var.animate();
                if (this.C1.M(this.f10477l1) && this.f10527y1.f10361e && !az.b()) {
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
        sd sdVar;
        Canvas canvas2;
        org.telegram.ui.Components.g6 g6Var;
        org.telegram.ui.Components.g6 g6Var2;
        j1();
        if (this.f10483n1 && (g6Var2 = this.A0) != null) {
            g6Var2.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(40.0f));
        }
        if (this.f10483n1 && (g6Var = this.B0) != null) {
            g6Var.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.f10454e3;
        LinearLayout linearLayout = this.f10526y0;
        d3 d3Var = this.f10482n0;
        if (z10) {
            float measuredWidth = (d3Var.getMeasuredWidth() / 2.0f) + d3Var.getX() + linearLayout.getX();
            float measuredHeight = (d3Var.getMeasuredHeight() / 2.0f) + d3Var.getY() + linearLayout.getY();
            int L = org.telegram.messenger.g0.L(24.0f);
            float f10 = L / 2.0f;
            float T1 = org.telegram.messenger.g0.T1(this.f10461g3, measuredWidth - f10, xq.f40453g.getInterpolation(this.f10457f3));
            float T12 = org.telegram.messenger.g0.T1(this.f10465h3, measuredHeight - f10, this.f10457f3);
            int W1 = org.telegram.messenger.g0.W1(this.f10457f3, this.i3, L);
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
        if (this.f10443a3) {
            float measuredWidth2 = (d3Var.getMeasuredWidth() / 2.0f) + d3Var.getX() + linearLayout.getX();
            float measuredHeight2 = (d3Var.getMeasuredHeight() / 2.0f) + d3Var.getY() + linearLayout.getY();
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
                    this.f10443a3 = false;
                }
            } else {
                dh.d dVar = this.W2;
                if (dVar != null) {
                    float f17 = L2 / 2.0f;
                    dVar.e((int) (measuredWidth2 - f17), (int) (measuredHeight2 - f17), (int) (measuredWidth2 + f17), (int) (measuredHeight2 + f17));
                    this.W2.b(canvas);
                    if (this.W2.c()) {
                        this.W2.d(this);
                        this.W2 = null;
                        this.f10443a3 = false;
                    }
                } else {
                    this.f10443a3 = false;
                }
            }
        }
        s2 s2Var = this.L1;
        if (s2Var != null) {
            sd sdVar2 = s2Var.f31232z1;
            sd sdVar3 = s2Var.A1;
            if (s2Var.getAlpha() != 0.0f && (sdVar = s2Var.f31118f1) != null && sdVar.getParent() != null && s2Var.f31118f1.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(s2Var.f31118f1.getX() + sdVar2.getX() + sdVar3.getX() + s2Var.getX(), s2Var.f31118f1.getY() + sdVar2.getY() + sdVar3.getY() + s2Var.getY());
                if (s2Var.getAlpha() != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, s2Var.getMeasuredWidth(), s2Var.getMeasuredHeight(), (int) (s2Var.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                s2Var.f31118f1.draw(canvas2);
                canvas2.restoreToCount(save);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        li0 li0Var;
        li0 li0Var2;
        si.f fVar;
        float L;
        float f10;
        if (view == this.N2) {
            canvas.save();
            canvas.clipRect(0.0f, this.N2.getY(), getMeasuredWidth(), this.N2.getY() + this.N2.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        s2 s2Var = this.L1;
        Paint paint = this.X1;
        d3 d3Var = this.f10482n0;
        g4 g4Var = this.f10463h1;
        if (view == s2Var) {
            float f11 = this.f10442a2;
            int i3 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            h4 h4Var = this.f10527y1;
            if (i3 > 0 && !h4Var.f10362f) {
                g4Var.f10323l.setAlpha((int) (f11 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), g4Var.f10323l);
            }
            RectF rectF = g4Var.h;
            RectF rectF2 = g4Var.f10320i;
            RectF rectF3 = g4Var.f10321j;
            rectF.set(this.L1.getX(), this.L1.getY() + this.L1.getAnimatedTop() + org.telegram.messenger.g0.L(1.33f), this.L1.getX() + this.L1.getMeasuredWidth(), this.L1.getY() + this.L1.getMeasuredHeight());
            float L2 = org.telegram.messenger.g0.L(40.0f);
            if (!h4Var.f10362f) {
                if (this.C2) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
                if (this.D2 && this.f10483n1) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
                if (d3Var != null && d3Var.getVisibility() == 0) {
                    L2 = (L2 - org.telegram.messenger.g0.L(40.0f)) + d3Var.getLayoutParams().width;
                }
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(46.0f);
                L2 = org.telegram.messenger.g0.L(46.0f);
                s1 s1Var = this.K1;
                if (s1Var != null && s1Var.getVisibility() == 0) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
            }
            rectF2.set(org.telegram.messenger.g0.L(10.0f) + L, ((this.L1.getY() + this.L1.getMeasuredHeight()) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(38.0f), (getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f)) - L2, (this.L1.getY() + this.L1.getMeasuredHeight()) - org.telegram.messenger.g0.L(5.0f));
            this.L1.setTranslationX((1.0f - this.f10442a2) * L);
            if (this.L1.getMeasuredHeight() > org.telegram.messenger.g0.L(50.0f)) {
                f10 = ((1.0f - this.f10442a2) * (this.L1.getMeasuredHeight() - org.telegram.messenger.g0.L(50.0f))) + 0.0f;
            } else {
                f10 = 0.0f;
            }
            this.L1.getEditField().setTranslationY(com.google.android.recaptcha.internal.a.y(1.0f, this.f10442a2, -org.telegram.messenger.g0.L(2.0f), f10));
            float L3 = org.telegram.messenger.g0.L(50.0f) / 2.0f;
            org.telegram.messenger.g0.Z1(rectF2, g4Var.h, this.f10442a2, rectF3);
            gh.g gVar = this.V1;
            if (gVar != null) {
                gVar.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                gVar.r(L3);
                gVar.setAlpha((int) ((1.0f - this.O3) * (1.0f - this.f10445b2) * 255.0f * getHideInterfaceAlpha()));
                gVar.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, L3, L3, paint);
            }
            if (this.f10442a2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            }
        } else if (s2Var != null && s2Var.s0(view)) {
            float L4 = org.telegram.messenger.g0.L(30.0f);
            RectF rectF4 = g4Var.f10322k;
            RectF rectF5 = g4Var.f10322k;
            rectF4.set(0.0f, view.getY() + org.telegram.messenger.g0.L(1.0f), getWidth(), org.telegram.messenger.g0.L(20.0f) + getHeight());
            Path path = this.L3;
            path.rewind();
            path.addRoundRect(rectF5, L4, L4, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            gh.g gVar2 = this.W1;
            if (gVar2 != null) {
                gVar2.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                gVar2.s(L4, L4, L4, L4);
                gVar2.setAlpha(255);
                gVar2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF5, L4, L4, paint);
            }
            boolean drawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild3;
        } else {
            if (view == this.P1 && this.L1 != null) {
                view.setTranslationY(((this.L1.getY() + this.L1.getAnimatedTop()) + (-li0Var.getMeasuredHeight())) - org.telegram.messenger.g0.L(18.0f));
            } else {
                if (view == this.f10446b3) {
                    view.setTranslationY((this.f10526y0.getY() + (d3Var.getY() + (-(li0Var2.getMeasuredHeight() - this.f10446b3.getPaddingBottom())))) - org.telegram.messenger.g0.L(18.0f));
                } else {
                    m3 m3Var = this.M0;
                    if (view == m3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (fVar = this.f10501r3) != null && !fVar.f54758r) {
                        RecordingCanvas h = fVar.h(getMeasuredWidth(), getMeasuredHeight());
                        h.drawColor(i0.a.f(0.2f, -16777216, -1));
                        h.translate(m3Var.getX(), m3Var.getY());
                        view.draw(h);
                        fVar.i();
                    }
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e1() {
        throw new UnsupportedOperationException("Method not decompiled: ei.j4.e1():void");
    }

    public final void f1() {
        int i3;
        if (this.f10495q1) {
            TextView textView = this.R1;
            if (textView != null) {
                textView.setText(bd.M0(2131748831, null));
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
            if (this.f10487o1) {
                i3 = 2131744675;
            } else {
                i3 = 2131744503;
            }
            textView3.setText(bd.M0(i3, null));
        }
        TextView textView4 = this.S1;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.S1.setText(bd.M0(2131744502, null));
        }
    }

    public final void g1() {
        TL_stories.PeerStories peerStories;
        int i3;
        ArrayList arrayList = this.f10470j1;
        r9 r9Var = this.f10506t0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.f10459g1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i3 = arrayList2.size();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    long j10 = ((y6) arrayList2.get(i10)).f11234a;
                    if (((int) (j10 ^ (j10 >>> 32))) == r9Var.Q0) {
                        this.f10507t1 = i10;
                        return;
                    }
                }
            } else {
                i3 = 0;
            }
            int indexOf = this.f10470j1.indexOf(Integer.valueOf(r9Var.Q0));
            if (indexOf < 0 && !this.f10470j1.isEmpty()) {
                if (r9Var.Q0 > ((Integer) this.f10470j1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (r9Var.Q0 < ((Integer) k2.p1.h(1, this.f10470j1)).intValue()) {
                    indexOf = this.f10470j1.size() - 1;
                }
            }
            this.f10507t1 = i3 + indexOf;
        } else {
            int i11 = r9Var.f10924f1.get(this.f10477l1, -1);
            this.f10507t1 = i11;
            if (i11 == -1 && !r9Var.O0 && (peerStories = this.f10452e1) != null && peerStories.max_read_id > 0) {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f10455f1;
                    if (i12 >= arrayList3.size()) {
                        break;
                    } else if (((TL_stories.StoryItem) arrayList3.get(i12)).f27240id > this.f10452e1.max_read_id) {
                        this.f10507t1 = i12;
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        if (this.f10507t1 == -1) {
            this.f10507t1 = 0;
        }
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.f10470j1;
    }

    public long getCurrentPeer() {
        return this.f10477l1;
    }

    public int getListPosition() {
        return this.f10515v1;
    }

    public Bitmap getPlayingBitmap() {
        m3 m3Var = this.M0;
        Bitmap createBitmap = Bitmap.createBitmap(m3Var.getWidth(), m3Var.getHeight(), Bitmap.Config.ARGB_8888);
        C0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.f10507t1;
    }

    public z6 getStoriesController() {
        return hp.s1(this.f10480m2).P1();
    }

    public int getStoriesCount() {
        return Math.max(this.f10484n2, this.f10455f1.size()) + this.f10459g1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f10455f1;
    }

    public final void h1() {
        r6 r6Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f10455f1;
        arrayList.clear();
        r9 r9Var = this.f10506t0;
        if (r9Var.O0) {
            if (!r9Var.T0) {
                arrayList.add(r9Var.U0);
            }
        } else {
            ArrayList arrayList2 = this.f10470j1;
            int i3 = 0;
            ArrayList arrayList3 = this.f10459g1;
            if (arrayList2 != null && (r6Var = r9Var.P0) != null) {
                if (r6Var instanceof k6) {
                    arrayList3.clear();
                    ArrayList F = hp.s1(this.f10480m2).P1().F(this.f10477l1);
                    String str = ((k6) r9Var.P0).E;
                    if (F != null) {
                        for (int i10 = 0; i10 < F.size(); i10++) {
                            y6 y6Var = (y6) F.get(i10);
                            gi.f7 f7Var = y6Var.f11236c;
                            if (f7Var != null && !f7Var.f12718g && TextUtils.equals(f7Var.K0, str)) {
                                arrayList3.add(y6Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.f10470j1;
                int size = arrayList4.size();
                while (i3 < size) {
                    Object obj = arrayList4.get(i3);
                    i3++;
                    zi f10 = r9Var.P0.f(((Integer) obj).intValue());
                    if (f10 != null && (storyItem = f10.f26871l) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (r9Var.P0 != null) {
                while (i3 < r9Var.P0.f10876i.size()) {
                    arrayList.add(((zi) r9Var.P0.f10876i.get(i3)).f26871l);
                    i3++;
                }
            } else {
                TL_stories.PeerStories peerStories = r9Var.R0;
                if (peerStories != null && org.telegram.messenger.m5.o(peerStories.peer) == this.f10477l1) {
                    this.f10452e1 = r9Var.R0;
                } else {
                    TL_stories.PeerStories y9 = this.C1.y(this.f10477l1);
                    this.f10452e1 = y9;
                    if (y9 == null) {
                        this.f10452e1 = this.C1.z(this.f10477l1);
                    }
                }
                this.f10484n2 = 0;
                TL_stories.PeerStories peerStories2 = this.f10452e1;
                if (peerStories2 != null) {
                    this.f10484n2 = peerStories2.stories.size();
                    arrayList.addAll(this.f10452e1.stories);
                }
                arrayList3.clear();
                ArrayList F2 = this.C1.F(this.f10477l1);
                if (F2 != null) {
                    arrayList3.addAll(F2);
                }
            }
        }
        this.k1 = getStoriesCount();
    }

    public final void i0(boolean z10) {
        j4 currentPeerView;
        k40 k40Var = this.f10508t2;
        if (k40Var != null) {
            k40Var.f35276f0 = null;
            k40Var.a(false);
        }
        long j10 = this.f10477l1;
        TL_stories.StoryItem storyItem = this.f10527y1.f10358a;
        r9 r9Var = this.f10506t0;
        r9Var.getClass();
        if (j10 != 0 && storyItem != null) {
            r9.F1.remove(j10 + (j10 >> 16) + (storyItem.f27240id << 16));
        }
        this.S2 = true;
        g9 g9Var = r9Var.f10939o0;
        if (g9Var != null && (currentPeerView = g9Var.getCurrentPeerView()) != null) {
            currentPeerView.q0();
        }
        if (z10) {
            org.telegram.ui.Components.ac J = new fc(this.M0, this.f10476l0).J(2131624028, bd.M0(2131748491, null), bd.M0(2131743562, null), 5000, false, new a2(this, 2));
            J.f31800r = false;
            J.k(false);
        }
        hp.s1(this.f10480m2).s0(this.f10477l1, 0, null);
    }

    public final void i1(boolean z10) {
        String M0;
        int i3;
        String M02;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z11;
        int i10;
        boolean z12;
        h4 h4Var = this.f10527y1;
        TL_stories.StoryItem storyItem = h4Var.f10358a;
        if (storyItem == null) {
            storyItem = h4Var.f10360c;
        }
        boolean z13 = this.f10483n1;
        if (z13 || this.m1) {
            if (storyItem != null) {
                r9 r9Var = this.f10506t0;
                d3 d3Var = this.f10482n0;
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
                    TLRPC.Chat M03 = hp.s1(this.f10480m2).M0(Long.valueOf(-this.f10477l1));
                    if ((!this.f10487o1 || (!org.telegram.messenger.t3.q(M03) && !org.telegram.messenger.t3.s0(M03))) && storyItem.views.views_count > 0) {
                        TextView textView = this.f10474k2;
                        if (r9Var.P0 == null) {
                            M02 = bd.M0(2131748131, null);
                        } else {
                            M02 = bd.M0(2131748130, null);
                        }
                        textView.setText(M02);
                        this.f10474k2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "d  ");
                        spannableStringBuilder.setSpan(new wp(2131231185, 0), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.o0(storyItem.views.views_count, 0));
                        this.f10474k2.setText(spannableStringBuilder);
                    } else {
                        this.f10474k2.setText("");
                    }
                    ViewGroup.LayoutParams layoutParams = d3Var.getLayoutParams();
                    float L = org.telegram.messenger.g0.L(40.0f);
                    if (this.E0) {
                        f10 = this.A0.d + org.telegram.messenger.g0.L(4.0f);
                    } else {
                        f10 = 0.0f;
                    }
                    layoutParams.width = (int) (L + f10);
                    ((ViewGroup.MarginLayoutParams) this.G1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(40.0f) + d3Var.getLayoutParams().width;
                    d3 d3Var2 = this.f10530z0;
                    if (d3Var2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = d3Var2.getLayoutParams();
                        float L2 = org.telegram.messenger.g0.L(40.0f);
                        if (this.F0) {
                            f11 = org.telegram.messenger.g0.L(4.0f) + this.B0.d;
                        } else {
                            f11 = 0.0f;
                        }
                        layoutParams2.width = (int) (L2 + f11);
                        ((ViewGroup.MarginLayoutParams) this.G1.getLayoutParams()).rightMargin += d3Var2.getLayoutParams().width;
                        d3Var2.requestLayout();
                    }
                    this.G1.requestLayout();
                    d3Var.requestLayout();
                    this.f10478l2.setVisibility(8);
                    this.f10492p2.setVisibility(8);
                    TL_stories.StoryItem storyItem2 = h4Var.f10358a;
                    i3 i3Var = this.T0;
                    if (storyItem2 == null) {
                        i3Var.getClass();
                        return;
                    }
                    for (int i12 = 0; i12 < i3Var.getChildCount(); i12++) {
                        if (i3Var.getChildAt(i12) instanceof w8) {
                            ((w8) i3Var.getChildAt(i12)).c(storyItem2.views, z10);
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
                            TLObject e22 = hp.s1(this.f10480m2).e2(storyItem.views.recent_viewers.get(i14).longValue());
                            if (e22 != null) {
                                this.f10478l2.b(i15, this.f10480m2, e22);
                                i15++;
                            }
                            i3 = i13;
                            if (i15 >= i3) {
                                break;
                            }
                            i14++;
                            i13 = i3;
                        } else {
                            i3 = i13;
                            break;
                        }
                    }
                    for (int i16 = i15; i16 < i3; i16++) {
                        this.f10478l2.b(i16, this.f10480m2, null);
                    }
                    this.f10478l2.a(false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(bd.H(',', "Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        wp wpVar = new wp(2131231980, 0);
                        wpVar.f40049y = -53704;
                        wpVar.f40044n = org.telegram.messenger.g0.L(0.2f);
                        spannableStringBuilder2.setSpan(wpVar, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        wp wpVar2 = new wp(2131231971, 0);
                        wpVar2.f40049y = -14161823;
                        wpVar2.f40044n = org.telegram.messenger.g0.L(0.2f);
                        spannableStringBuilder2.setSpan(wpVar2, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.f10474k2.setText(spannableStringBuilder2);
                    if (i15 == 0) {
                        this.f10478l2.setVisibility(8);
                        this.f10474k2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                    } else {
                        this.f10478l2.setVisibility(0);
                        this.f10474k2.setTranslationX(org.telegram.messenger.g0.L(10.0f) + com.google.android.recaptcha.internal.a.e(i15, 1, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + org.telegram.messenger.g0.L(13.0f)));
                    }
                    this.f10492p2.setVisibility(0);
                } else {
                    TextView textView2 = this.f10474k2;
                    if (r9Var.P0 == null) {
                        M0 = bd.M0(2131748131, null);
                    } else {
                        M0 = bd.M0(2131748130, null);
                    }
                    textView2.setText(M0);
                    this.f10474k2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                    this.f10478l2.setVisibility(8);
                    this.f10492p2.setVisibility(8);
                }
                d3Var.getLayoutParams().width = org.telegram.messenger.g0.L(40.0f);
                this.f10526y0.requestLayout();
                return;
            }
            this.f10474k2.setText("");
            this.f10492p2.setVisibility(8);
            this.f10478l2.setVisibility(8);
        }
    }

    public final void j0() {
        e7 e7Var = this.f10486o0;
        e7Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new p2(0, e7Var)).setDuration(150L).start();
        int L = org.telegram.messenger.g0.L(8.0f);
        e7 e7Var2 = new e7(getContext(), this.f10463h1);
        this.f10486o0 = e7Var2;
        e7Var2.setPadding(L, L, L, L);
        this.f10486o0.setAlpha(0.0f);
        this.f10486o0.setScaleX(0.8f);
        this.f10486o0.setScaleY(0.8f);
        this.f10486o0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.f10482n0.addView(this.f10486o0, mf.e(40, 40, 3));
        this.f10443a3 = false;
    }

    public final void j1() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z10;
        s2 s2Var;
        float heightWithTopView;
        float f15;
        float f16;
        float f17;
        float L;
        int i3;
        float f18;
        float f19;
        int i10;
        d3 d3Var;
        ImageView imageView;
        q3 q3Var;
        d3 d3Var2;
        boolean z11;
        float f20;
        li0 li0Var;
        float f21;
        int i11;
        float f22;
        float f23;
        float f24 = ((i9) this.A1).d.W;
        if (this.f10516v2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.u5 u5Var = this.f10528y2;
        u5Var.e(false, f10);
        int i12 = this.f10450d2;
        if (i12 != 0 && this.f10453e2) {
            f11 = be.a(this.f10500r2 / i12, 0.0f, 1.0f);
        } else if (this.f10456f2) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        org.telegram.ui.Components.u5 u5Var2 = this.H3;
        float f25 = u5Var2.f38645c;
        org.telegram.ui.Components.u5 u5Var3 = this.I3;
        float f26 = u5Var3.f38645c;
        org.telegram.ui.Components.u5 u5Var4 = this.J3;
        float f27 = u5Var4.f38645c;
        if (this.f10496q2) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        u5Var2.e(false, f12);
        if (!this.S2) {
            s2 s2Var2 = this.L1;
            if (s2Var2 != null && !TextUtils.isEmpty(s2Var2.getFieldText())) {
                f23 = 1.0f;
            } else {
                f23 = 0.0f;
            }
            u5Var3.e(false, f23);
        }
        s2 s2Var3 = this.L1;
        if (s2Var3 != null && s2Var3.A3) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        u5Var4.e(false, f13);
        final s2 s2Var4 = this.L1;
        if (s2Var4 != null) {
            j4 j4Var = s2Var4.f10988y5;
            f14 = 1.0f;
            int backgroundTop = s2Var4.getBackgroundTop();
            int i13 = s2Var4.f10985v5;
            if (i13 != 0 && backgroundTop != i13) {
                int i14 = (s2Var4.U1 + i13) - backgroundTop;
                s2Var4.setAnimatedTop(i14);
                j4Var.F2 = true;
                ValueAnimator valueAnimator = j4Var.O1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    j4Var.O1.cancel();
                }
                View view = s2Var4.H1;
                if (view != null && view.getVisibility() == 0) {
                    s2Var4.H1.setTranslationY(((1.0f - s2Var4.getTopViewEnterProgress()) * s2Var4.H1.getLayoutParams().height) + s2Var4.U1);
                }
                j4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i14, 0.0f);
                j4Var.O1 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                s2 s2Var5 = s2Var4;
                                s2Var5.getClass();
                                s2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                j4 j4Var2 = s2Var5.f10988y5;
                                j4Var2.F2 = true;
                                j4Var2.invalidate();
                                s2Var5.invalidate();
                                return;
                            default:
                                s2Var4.F0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                j4Var.O1.addListener(new ai.e1(s2Var4, 11));
                j4Var.O1.setDuration(250L);
                j4Var.O1.setInterpolator(ni.l.V);
                j4Var.O1.start();
                s2Var4.f10985v5 = 0;
            }
            if (s2Var4.f31170o3) {
                float scrollY = (s2Var4.f10987x5 - s2Var4.F0.getScrollY()) + (s2Var4.f10986w5 - s2Var4.F0.getMeasuredHeight());
                ve veVar = s2Var4.F0;
                veVar.setOffsetY(veVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(s2Var4.F0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                s2 s2Var5 = s2Var4;
                                s2Var5.getClass();
                                s2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                j4 j4Var2 = s2Var5.f10988y5;
                                j4Var2.F2 = true;
                                j4Var2.invalidate();
                                s2Var5.invalidate();
                                return;
                            default:
                                s2Var4.F0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = s2Var4.f10984u5;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                s2Var4.f10984u5 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ni.l.V);
                ofFloat2.start();
                s2Var4.f31170o3 = false;
                j4Var.j1();
            }
            s2Var4.getMeasuredHeight();
        } else {
            f14 = 1.0f;
        }
        s2 s2Var5 = this.L1;
        if (s2Var5 != null && s2Var5.r0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        boolean z12 = this.f10464h2;
        Paint paint = this.X1;
        if (z12) {
            paint.setColor(i0.a.f(this.f10442a2, -14933463, org.telegram.ui.ActionBar.k6.r1(0.44f, -16777216)));
            float f28 = f14;
            paint.setAlpha((int) ((f28 - this.O3) * org.telegram.messenger.k5.A(f28, this.f10445b2, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(i0.a.o(-16777216, (int) ((f14 - this.O3) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z13 = this.F2;
        r9 r9Var = this.f10506t0;
        if (z13 || this.K3 != r9Var.f10920e0 || u5Var.f38645c != this.A2 || this.c2 != this.f10500r2 || f11 != this.f10442a2 || f24 != this.f10445b2 || f25 != u5Var2.f38645c || z10 || f27 != u5Var4.f38645c || f26 != u5Var3.f38645c) {
            this.F2 = false;
            this.c2 = this.f10500r2;
            int i15 = (u5Var.f38645c > this.A2 ? 1 : (u5Var.f38645c == this.A2 ? 0 : -1));
            m3 m3Var = this.M0;
            if (i15 != 0) {
                m3Var.invalidate();
            }
            if (f24 != 0.0f) {
                m3Var.setLayerType(2, null);
            } else {
                m3Var.setLayerType(0, null);
            }
            this.A2 = u5Var.f38645c;
            this.f10445b2 = f24;
            this.f10442a2 = f11;
            this.K3 = r9Var.f10920e0;
            float height = this.f10500r2 - (getHeight() - m3Var.getBottom());
            if (this.L1 == null) {
                heightWithTopView = 0.0f;
            } else {
                heightWithTopView = s2Var.getHeightWithTopView() * f11;
            }
            float max = Math.max(0.0f, height + heightWithTopView);
            float height2 = this.Y1 - (getHeight() - m3Var.getBottom());
            s2 s2Var6 = this.L1;
            if (s2Var6 == null) {
                f16 = 0.0f;
            } else {
                float heightWithTopView2 = s2Var6.getHeightWithTopView();
                if (this.f10456f2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                f16 = heightWithTopView2 * f15;
            }
            float max2 = Math.max(0.0f, height2 + f16);
            s2 s2Var7 = this.L1;
            if (s2Var7 != null) {
                if (this.N1 != null) {
                    ImageView suggestButton = s2Var7.getSuggestButton();
                    if (suggestButton != null) {
                        this.N1.p(1.0f, -(org.telegram.messenger.g0.L(74.0f) - suggestButton.getTranslationX()));
                    }
                    this.N1.setTranslationY(-((getHeight() - this.L1.getY()) + org.telegram.messenger.g0.L(6.0f)));
                }
                xs editField = this.L1.getEditField();
                fn0 senderSelectView = this.L1.getSenderSelectView();
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
            if (this.f10464h2) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(58.0f) * (1.0f - f11);
            }
            float max3 = Math.max(0.0f, L + max);
            if (!this.f10464h2 && !this.f10456f2) {
                i3 = org.telegram.messenger.g0.L(58.0f);
            } else {
                i3 = 0;
            }
            float max4 = Math.max(0.0f, max2 + i3);
            float L2 = (org.telegram.messenger.g0.L(f17) * f11) + max3;
            k2 k2Var = this.f10514v0;
            ci.j1 j1Var = k2Var.f11150c;
            k2Var.L = L2;
            if (Math.abs(k2Var.M - max4) > 0.1f) {
                k2Var.M = max4;
                f18 = 0.8f;
                i10 = 0;
                f19 = 8.0f;
                j1Var.setPadding(org.telegram.messenger.g0.L(8.0f), Math.max(0, ((int) max4) - j1Var.getTop()) + org.telegram.messenger.g0.L(7.5f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.5f));
                if (!j1Var.canScrollVertically(1)) {
                    k2Var.d.h1(0, org.telegram.messenger.g0.L(100.0f));
                }
            } else {
                f18 = 0.8f;
                f19 = 8.0f;
                i10 = 0;
            }
            k2Var.setTranslationY(-k2Var.L);
            k2Var.invalidate();
            gi.r3 r3Var = r9Var.E0;
            if (r3Var != null) {
                r3Var.setKeyboardOffset(max);
            }
            li0 li0Var2 = this.P1;
            h4 h4Var = this.f10527y1;
            if (li0Var2 != null) {
                if (this.f10442a2 > 0.0f && (h4Var == null || !h4Var.f10362f)) {
                    i11 = i10;
                } else {
                    i11 = 8;
                }
                li0Var2.setVisibility(i11);
            }
            int i16 = i10;
            while (true) {
                int childCount = getChildCount();
                d3Var = this.f10530z0;
                imageView = this.f10522x0;
                q3Var = this.f10510u0;
                d3Var2 = this.f10482n0;
                if (i16 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i16);
                if (childAt.getVisibility() == 0 && childAt != this.G1 && childAt.getTag(2131296591) == null && childAt != q3Var.f10373a0.n(getContext())) {
                    s2 s2Var8 = this.L1;
                    if (s2Var8 != null && childAt == s2Var8.getEmojiView()) {
                        childAt.setTranslationY(this.L1.getEmojiView().getMeasuredHeight() - this.f10500r2);
                    } else if (childAt instanceof u20) {
                        u20 u20Var = (u20) childAt;
                        View view2 = u20Var.f38619c;
                        if (view2 != null) {
                            u20Var.d(view2);
                        }
                    } else if (childAt != this.f10508t2 && childAt != m3Var && childAt != imageView && childAt != this.f10526y0 && childAt != d3Var && childAt != this.G2 && childAt != this.N1 && childAt != d3Var2 && ((li0Var = this.f10446b3) == null || li0Var.getReactionsWindow() == null || childAt != this.f10446b3.getReactionsWindow().f8933c)) {
                        float f29 = this.f10442a2;
                        f29 = (childAt == this.H1 || childAt == this.J1 || childAt == this.K1 || childAt == this.I1) ? 0.0f : 0.0f;
                        float f30 = 1.0f - f29;
                        float L3 = (((((-this.f10512u2) * f30) - (org.telegram.messenger.g0.L(7.0f) * f29)) - this.f10500r2) - (org.telegram.messenger.g0.L(f19) * f30)) - (org.telegram.messenger.g0.L(20.0f) * r9Var.f10920e0);
                        if (childAt == this.H1 || childAt == this.J1 || childAt == this.K1 || childAt == this.I1) {
                            L3 += this.f10500r2;
                        }
                        if (this.f10464h2) {
                            f21 = (1.0f - this.f10445b2) * hideInterfaceAlpha;
                        } else {
                            f21 = hideInterfaceAlpha * 1.0f;
                        }
                        if (childAt == this.L2) {
                            L3 = r9Var.f10920e0 * (-org.telegram.messenger.g0.L(20.0f));
                        }
                        if (childAt == this.N2) {
                            L3 -= this.L1.getMeasuredHeight() - this.L1.getAnimatedTop();
                            f21 = this.f10442a2;
                            childAt.invalidate();
                        }
                        if (childAt == this.M1) {
                            L3 -= this.L1.getMeasuredHeight() - this.L1.getAnimatedTop();
                            f21 *= this.f10442a2;
                        }
                        if (childAt == this.P1) {
                            float f31 = (1.0f - u5Var3.f38645c) * (1.0f - f27) * (1.0f - u5Var2.f38645c) * this.f10442a2;
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
                            s2 s2Var9 = this.L1;
                            if (s2Var9 == null || childAt != s2Var9.P1) {
                                childAt.setAlpha(f21);
                            }
                        }
                    }
                } else if (childAt == this.G1) {
                    if (this.f10464h2) {
                        childAt.setAlpha((1.0f - this.O3) * (1.0f - this.f10445b2) * hideInterfaceAlpha);
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
            d3Var2.setAlpha((1.0f - this.O3) * f35);
            if (d3Var != null) {
                d3Var.setAlpha((1.0f - this.O3) * f35);
            }
            for (int i17 = 0; i17 < m3Var.getChildCount(); i17++) {
                View childAt2 = m3Var.getChildAt(i17);
                if (childAt2 != null && childAt2 != this.f10518w0) {
                    f4 f4Var = this.Y0;
                    ai.d2 d2Var = this.f10466i0;
                    if (childAt2 != f4Var && childAt2 != this.f10458g0 && childAt2 != this.f10462h0 && childAt2 != d2Var && childAt2 != this.G1 && childAt2 != q3Var && childAt2 != this.m0) {
                        childAt2.setAlpha(hideInterfaceAlpha);
                    } else {
                        if (childAt2 == d2Var) {
                            f20 = this.O2;
                        } else {
                            f20 = 1.0f;
                        }
                        if (childAt2 == q3Var) {
                            childAt2.setAlpha((1.0f - this.O3) * f20 * hideInterfaceAlpha);
                        } else {
                            childAt2.setAlpha((1.0f - this.O3) * f20 * hideInterfaceAlpha);
                        }
                    }
                }
            }
            if (this.L1 != null) {
                float L4 = org.telegram.messenger.g0.L(40.0f);
                if (!h4Var.f10362f) {
                    if (this.C2) {
                        L4 += org.telegram.messenger.g0.L(46.0f);
                    }
                    if (this.D2 && this.f10483n1) {
                        L4 += org.telegram.messenger.g0.L(46.0f);
                    }
                    if (d3Var2.getVisibility() == 0) {
                        L4 = (L4 - org.telegram.messenger.g0.L(40.0f)) + d3Var2.getLayoutParams().width;
                    }
                } else {
                    float L5 = org.telegram.messenger.g0.L(46.0f);
                    L4 = org.telegram.messenger.g0.L(46.0f);
                    s1 s1Var = this.K1;
                    if (s1Var != null && s1Var.getVisibility() == 0) {
                        L4 += org.telegram.messenger.g0.L(46.0f);
                    }
                    f34 = L5;
                }
                s2 s2Var10 = this.L1;
                float f36 = -org.telegram.messenger.g0.L(10.0f);
                float f37 = -(org.telegram.messenger.g0.L(10.0f) + L4 + f34);
                float f38 = this.f10442a2;
                if ((this.C2 || this.f10487o1) && !h4Var.f10362f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                s2Var10.g1(f36, f37, f38, z11);
                if (this.L1.getEmojiView() != null) {
                    this.L1.getEmojiView().setAlpha(this.f10442a2);
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
        ofFloat.addUpdateListener(new b2(this, 2));
        this.N3.addListener(new n2(this, z10, 1));
        this.N3.setDuration(420L);
        this.N3.setInterpolator(xq.h);
        this.N3.start();
    }

    public final void l0(Runnable runnable) {
        if (hp.s1(this.f10480m2).v2()) {
            org.telegram.ui.b.b(this.f10480m2);
            return;
        }
        int i3 = az.f21624e0;
        if (i3 > 0 && this.U2) {
            int i10 = i3 - 1;
            az.f21624e0 = i10;
            az.T(i10);
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(0, getContext(), this.f10476l0);
            s1Var.setTitle(bd.M0(2131744895, null));
            s1Var.n(bd.M0(2131744896, null));
            String M0 = bd.M0(2131746751, null);
            aa.c cVar = new aa.c(runnable);
            s1Var.f28553o0 = M0;
            s1Var.f28554p0 = cVar;
            String M02 = bd.M0(2131752589, null);
            d2.t1 t1Var = new d2.t1(19);
            s1Var.f28555q0 = M02;
            s1Var.f28557r0 = t1Var;
            s1Var.show();
            return;
        }
        runnable.run();
    }

    public final void m0(int i3) {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        this.f10488o2 = false;
        this.F2 = true;
        this.f10479l3 = false;
        this.f10483n1 = false;
        this.f10487o1 = false;
        long j10 = this.f10477l1;
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        f4 f4Var = this.Y0;
        org.telegram.ui.Components.u8 u8Var = this.X0;
        if (i12 >= 0) {
            if (j10 == h10.i(this.f10480m2).e()) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.m1 = z14;
            TLRPC.User a22 = hp.s1(this.f10480m2).a2(Long.valueOf(this.f10477l1));
            TL_account.RequirementToContact J2 = hp.s1(this.f10480m2).J2(this.f10477l1);
            if (!h10.i(this.f10480m2).q() && (J2 instanceof TL_account.requirementToContactPremium)) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.f10491p1 = z15;
            this.f10499r1 = org.telegram.messenger.m5.k(J2);
            u8Var.r(a22);
            f4Var.f10263a.getImageReceiver().i0(a22, u8Var, null);
            U0(this.f10477l1, true, false);
        } else {
            this.m1 = false;
            this.f10483n1 = true;
            if (!this.C1.h(j10)) {
                boolean z16 = org.telegram.messenger.r2.f25040a;
            } else {
                this.f10479l3 = true;
            }
            TLRPC.Chat M0 = hp.s1(this.f10480m2).M0(Long.valueOf(-this.f10477l1));
            boolean V = org.telegram.messenger.t3.V(M0);
            this.f10487o1 = !V;
            if (!V && hp.s1(this.f10480m2).N0(-this.f10477l1) == null) {
                qr.a0(this.f10480m2).F0(-this.f10477l1, true, new CountDownLatch(1), false, false, 0);
            }
            if (this.f10487o1 && !org.telegram.messenger.t3.q(M0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f10491p1 = z10;
            this.f10499r1 = hp.s1(this.f10480m2).N1(this.f10477l1);
            u8Var.q(M0);
            f4Var.f10263a.getImageReceiver().i0(M0, u8Var, null);
            U0(this.f10477l1, true, false);
        }
        if (this.f10511u1 && (this.m1 || this.f10483n1)) {
            z6 z6Var = this.C1;
            long j11 = this.f10477l1;
            a0.h hVar = z6Var.f11284m;
            aa aaVar = (aa) hVar.f(j11);
            if (aaVar == null) {
                aaVar = new aa(z6Var.f11274a, j11, z6Var);
                hVar.k(aaVar, j11);
            }
            aaVar.b(true);
        }
        h1();
        this.f10507t1 = i3;
        if (i3 < 0) {
            this.f10507t1 = 0;
        }
        this.G0 = 0L;
        this.I0 = false;
        this.f10509t3 = null;
        this.f10513u3 = null;
        boolean z17 = this.f10483n1;
        m3 m3Var = this.M0;
        r9 r9Var = this.f10506t0;
        int i13 = 8;
        h4 h4Var = this.f10527y1;
        if (z17) {
            z0();
            if (this.L1 == null && (this.f10487o1 || h4Var.f10362f)) {
                t0();
            }
            if (this.L1 != null) {
                TLRPC.Chat M02 = hp.s1(this.f10480m2).M0(Long.valueOf(-this.f10477l1));
                s2 s2Var = this.L1;
                if (h4Var.f10362f || (!G0() && this.f10487o1 && (org.telegram.messenger.t3.q(M02) || org.telegram.messenger.t3.s0(M02)))) {
                    i13 = 0;
                }
                s2Var.setVisibility(i13);
                s2 s2Var2 = this.L1;
                boolean z18 = h4Var.f10362f;
                B0(true);
                s2Var2.h1(z18);
                s2 s2Var3 = this.L1;
                if (h4Var.f10362f && !B0(true) && (this.f10456f2 || this.L1.X0)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                s2Var3.n1(z13, true);
                xs editField = this.L1.getEditField();
                long j12 = this.f10477l1;
                TL_stories.StoryItem storyItem = h4Var.f10358a;
                r9Var.getClass();
                editField.setText(r9.I(j12, storyItem));
                this.L1.a1(this.f10480m2, this.f10477l1);
                this.L1.L1(M02, null);
            }
            org.telegram.ui.Components.g6 g6Var = this.A0;
            org.telegram.ui.ActionBar.e6 e6Var = this.f10476l0;
            if (g6Var == null) {
                org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(false, false, false);
                this.A0 = g6Var2;
                d3 d3Var = this.f10482n0;
                g6Var2.setCallback(d3Var);
                this.A0.u(e6Var.h(org.telegram.ui.ActionBar.k6.G6));
                this.A0.w(org.telegram.messenger.g0.L(14.0f));
                this.C0 = new org.telegram.ui.Components.u5(d3Var);
            }
            d3 d3Var2 = this.f10530z0;
            if (d3Var2 != null && this.B0 == null) {
                org.telegram.ui.Components.g6 g6Var3 = new org.telegram.ui.Components.g6(false, false, false);
                this.B0 = g6Var3;
                g6Var3.setCallback(d3Var2);
                this.B0.u(e6Var.h(org.telegram.ui.ActionBar.k6.G6));
                this.B0.w(org.telegram.messenger.g0.L(14.0f));
                this.D0 = new org.telegram.ui.Components.u5(d3Var2);
            }
            if (i3 == -1) {
                g1();
            }
            d1(false);
            this.k1 = getStoriesCount();
            m3Var.invalidate();
            invalidate();
        } else if (this.m1) {
            z0();
            if (h4Var.f10362f) {
                this.G1.setVisibility(8);
                if (this.L1 == null) {
                    t0();
                }
                this.L1.setVisibility(0);
            } else {
                this.G1.setVisibility(0);
                s2 s2Var4 = this.L1;
                if (s2Var4 != null) {
                    s2Var4.setVisibility(8);
                }
            }
            s2 s2Var5 = this.L1;
            if (s2Var5 != null) {
                boolean z19 = h4Var.f10362f;
                B0(true);
                s2Var5.h1(z19);
                s2 s2Var6 = this.L1;
                if (h4Var.f10362f && !B0(true) && (this.f10456f2 || this.L1.X0)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                s2Var6.n1(z12, true);
            }
            if (i3 == -1) {
                ArrayList arrayList = this.f10470j1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(r9Var.Q0));
                    if (indexOf < 0 && !this.f10470j1.isEmpty()) {
                        if (r9Var.Q0 > ((Integer) this.f10470j1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (r9Var.Q0 < ((Integer) k2.p1.h(1, this.f10470j1)).intValue()) {
                            indexOf = this.f10470j1.size() - 1;
                        }
                    }
                    this.f10507t1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.f10459g1.isEmpty();
                    ArrayList arrayList2 = this.f10455f1;
                    if (!isEmpty) {
                        this.f10507t1 = arrayList2.size();
                    } else {
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i14)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i14)).f27240id > this.C1.f11278f.get(this.f10477l1)) {
                                this.f10507t1 = i14;
                                break;
                            }
                        }
                    }
                }
            }
            d1(false);
            m3Var.invalidate();
            invalidate();
        } else {
            if (this.L1 == null) {
                t0();
            }
            if (this.f10491p1 && this.Q1 == null) {
                x0();
            }
            if (this.Q1 != null) {
                if (this.f10491p1 || this.f10495q1) {
                    f1();
                }
                LinearLayout linearLayout = this.Q1;
                if ((this.f10491p1 && !h4Var.f10362f) || this.f10495q1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                linearLayout.setVisibility(i11);
            }
            n8 n8Var = this.T1;
            if (n8Var != null) {
                n8Var.setVisibility(8);
            }
            if (i3 == -1) {
                g1();
            }
            d1(false);
            s2 s2Var7 = this.L1;
            if (s2Var7 != null) {
                if (!G0() && !l10.A(this.f10477l1)) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                s2Var7.setVisibility(i10);
                s2 s2Var8 = this.L1;
                boolean z20 = h4Var.f10362f;
                B0(true);
                s2Var8.h1(z20);
                s2 s2Var9 = this.L1;
                if (h4Var.f10362f && !B0(true) && (this.f10456f2 || this.L1.X0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                s2Var9.n1(z11, true);
                xs editField2 = this.L1.getEditField();
                long j13 = this.f10477l1;
                TL_stories.StoryItem storyItem2 = h4Var.f10358a;
                r9Var.getClass();
                editField2.setText(r9.I(j13, storyItem2));
                this.L1.a1(this.f10480m2, this.f10477l1);
                TLRPC.UserFull b22 = hp.s1(this.f10480m2).b2(this.f10477l1);
                if (b22 != null) {
                    this.L1.L1(null, b22);
                } else {
                    hp.s1(this.f10480m2).W2(hp.s1(this.f10480m2).a2(Long.valueOf(this.f10477l1)), this.f10471j2, false, null);
                }
            }
            this.k1 = getStoriesCount();
            d3 d3Var3 = this.G1;
            if (d3Var3 != null) {
                d3Var3.setVisibility(8);
            }
            m3Var.invalidate();
            invalidate();
        }
        p0(false);
    }

    public final void n0() {
        q3 q3Var = this.f10510u0;
        if (q3Var.f10373a0.x()) {
            q3Var.f10373a0.f(false);
        }
    }

    public final void o0() {
        if (this.f10511u1) {
            ((i9) this.A1).d.d0();
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
        s2 s2Var = this.L1;
        if (s2Var != null) {
            s2Var.D0();
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.R0;
            if (i3 < arrayList.size()) {
                ((dh.e0) arrayList.get(i3)).b(true);
                i3++;
            } else {
                hs.f(this.f10480m2).c(this, hs.T);
                hs.f(this.f10480m2).c(this, hs.G2);
                hs.f(this.f10480m2).c(this, hs.f23324v5);
                hs.f(this.f10480m2).c(this, hs.f23266m3);
                hs.f(this.f10480m2).c(this, hs.f23338x5);
                hs.f(this.f10480m2).c(this, hs.D5);
                hs.f(this.f10480m2).c(this, hs.f23205b3);
                hs.f(this.f10480m2).c(this, hs.i3);
                hs.f(this.f10480m2).c(this, hs.F);
                hs.e().c(this, hs.f23246i4);
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
        s2 s2Var = this.L1;
        if (s2Var != null) {
            s2Var.C0();
        }
        org.telegram.ui.Components.g5 g5Var = this.Y2;
        if (g5Var != null) {
            g5Var.n(this);
            this.Y2 = null;
        }
        dh.d dVar = this.W2;
        if (dVar != null) {
            dVar.d(this);
            this.W2 = null;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.R0;
            if (i3 < arrayList.size()) {
                ((dh.e0) arrayList.get(i3)).b(false);
                i3++;
            } else {
                hs.f(this.f10480m2).n(this, hs.T);
                hs.f(this.f10480m2).n(this, hs.G2);
                hs.f(this.f10480m2).n(this, hs.f23324v5);
                hs.f(this.f10480m2).n(this, hs.f23266m3);
                hs.f(this.f10480m2).n(this, hs.f23338x5);
                hs.f(this.f10480m2).n(this, hs.D5);
                hs.f(this.f10480m2).n(this, hs.f23205b3);
                hs.f(this.f10480m2).n(this, hs.i3);
                hs.f(this.f10480m2).n(this, hs.F);
                hs.e().n(this, hs.f23246i4);
                return;
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        this.f10463h1.d.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(72.0f));
    }

    @Override
    public final void onMeasure(int r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: ei.j4.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        this.f10442a2 = -1.0f;
        this.F2 = true;
        invalidate();
    }

    public final void p0(boolean z10) {
        int i3;
        if (this.L1 != null && this.P2 && this.K0) {
            a2 a2Var = this.f10533z3;
            org.telegram.messenger.g0.r(a2Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.C1.B;
            this.L1.E(true);
            boolean z11 = this.f10491p1;
            h4 h4Var = this.f10527y1;
            if ((z11 && !h4Var.f10362f) || this.f10495q1) {
                this.U2 = false;
                this.L1.setEnabled(false);
                this.L1.i1(" ", z10);
            } else if (this.f10499r1 > 0) {
                this.U2 = false;
                this.L1.setEnabled(true);
                this.L1.i1(wb.T0(bd.a0(null, null, 2131743936, bd.E(this.f10499r1, ','))), z10);
            } else {
                if (!h4Var.f10362f && tL_storiesStealthMode != null) {
                    int currentTime = ConnectionsManager.getInstance(this.f10480m2).getCurrentTime();
                    int i10 = tL_storiesStealthMode.active_until_date;
                    if (currentTime < i10) {
                        this.U2 = true;
                        int currentTime2 = i10 - ConnectionsManager.getInstance(this.f10480m2).getCurrentTime();
                        int i11 = currentTime2 / 60;
                        int i12 = currentTime2 % 60;
                        Locale locale = Locale.US;
                        String a02 = bd.a0(null, null, 2131744898, String.format(locale, "%02d:%02d", 99, 99));
                        this.L1.setEnabled(true);
                        if (((int) this.L1.getEditField().getPaint().measureText(a02)) * 1.2f >= this.L1.getEditField().getMeasuredWidth()) {
                            s2 s2Var = this.L1;
                            String a03 = bd.a0(null, null, 2131744898, "");
                            String format = String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
                            s2Var.f31109e = a03;
                            s2Var.f31116f = format;
                            s2Var.H1(z10);
                        } else {
                            this.L1.i1(bd.a0(null, null, 2131744899, String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12))), z10);
                        }
                        org.telegram.messenger.g0.i3(a2Var, 1000L);
                        return;
                    }
                }
                this.U2 = false;
                this.L1.setEnabled(true);
                if (h4Var.f10362f) {
                    long starsPrice = this.L1.getStarsPrice();
                    if (starsPrice > 0) {
                        this.L1.i1(wb.Y0(false, bd.a0(null, null, 2131752004, bd.E((int) starsPrice, ',')), this.L1.P4), z10);
                        wp wpVar = this.L1.P4[0];
                        if (wpVar != null) {
                            wpVar.H = 0.9f;
                            return;
                        }
                        return;
                    }
                    this.L1.i1(bd.M0(2131752005, null), z10);
                    return;
                }
                s2 s2Var2 = this.L1;
                if (this.f10487o1) {
                    i3 = 2131746260;
                } else {
                    i3 = 2131746265;
                }
                s2Var2.i1(bd.M0(i3, null), z10);
            }
        }
    }

    public final boolean q0() {
        if (this.f10448c3) {
            if (this.f10446b3.getReactionsWindow() != null) {
                if (this.f10468i2 > 0) {
                    org.telegram.messenger.g0.v1(this.f10446b3.getReactionsWindow().f8933c);
                    return true;
                }
                this.f10446b3.getReactionsWindow().d();
                return true;
            }
            Z0(false);
            return true;
        }
        i3 i3Var = this.T0;
        if (i3Var != null) {
            gi.l3 l3Var = i3Var.f11057c;
            if (l3Var != null) {
                l3Var.f(true);
                i3Var.f11057c = null;
            }
            i3Var.f11056b = null;
            i3Var.invalidate();
            i3Var.b(false);
        }
        q3 q3Var = this.f10510u0;
        if (q3Var.f10373a0.x()) {
            q3Var.f10373a0.f(false);
            return true;
        }
        gi.l3 l3Var2 = this.f10490p0;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
        gi.l3 l3Var3 = this.f10494q0;
        if (l3Var3 != null) {
            l3Var3.f(true);
        }
        u20 u20Var = this.G2;
        if (u20Var != null) {
            u20Var.a();
        }
        b4 b4Var = this.f10449d1;
        if (b4Var != null && b4Var.f16384a) {
            b4Var.a();
            return true;
        }
        s2 s2Var = this.L1;
        if (s2Var != null && s2Var.t0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f10476l0);
            boolean z10 = this.L1.f31104d1;
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            if (z10) {
                s1Var.S = bd.M0(2131751396, null);
                s1Var.U = bd.M0(2131751397, null);
            } else {
                s1Var.S = bd.M0(2131751393, null);
                s1Var.U = bd.M0(2131751394, null);
            }
            alertDialog$Builder.k(bd.M0(2131751395, null), new x1(this, 0));
            alertDialog$Builder.h(bd.M0(2131751771, null), null);
            ((i9) this.A1).h(s1Var);
            return true;
        }
        li0 li0Var = this.P1;
        if (li0Var != null && li0Var.getReactionsWindow() != null && !this.P1.getReactionsWindow().f8945q) {
            this.P1.getReactionsWindow().d();
            return true;
        }
        s2 s2Var2 = this.L1;
        if (s2Var2 != null && s2Var2.r0()) {
            if (this.f10468i2 > 0) {
                org.telegram.messenger.g0.v1(this.L1.getEmojiView());
                return true;
            }
            this.L1.k0(true, false, true);
            return true;
        } else if (getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f)) {
            s2 s2Var3 = this.L1;
            if (s2Var3 != null) {
                long j10 = this.f10477l1;
                TL_stories.StoryItem storyItem = this.f10527y1.f10358a;
                Editable editText = s2Var3.getEditText();
                this.f10506t0.getClass();
                r9.X(j10, storyItem, editText);
            }
            org.telegram.messenger.g0.v1(this.L1);
            return true;
        } else if (q3Var.getVisibility() != 0 || q3Var.getProgressToBlackout() <= 0.0f) {
            return false;
        } else {
            q3Var.D();
            this.Q2 = false;
            this.M0.invalidate();
            return true;
        }
    }

    public final void r0() {
        if (this.f10504s2 == null) {
            x2 x2Var = new x2(this, getContext(), this.f10476l0);
            this.f10504s2 = x2Var;
            x2Var.U3 = new y2(this);
            x2Var.f32215b2.i0();
            x2 x2Var2 = this.f10504s2;
            x2Var2.O1 = true;
            x2Var2.e1();
            x2 x2Var3 = this.f10504s2;
            x2Var3.P1 = new z2(this);
            x2Var3.a1().setText(this.L1.getFieldText());
        }
    }

    public final void s0() {
        if (this.H1 == null && getContext() != null) {
            a aVar = new a(getContext(), this.f10505s3);
            this.H1 = aVar;
            aVar.setOnClickListener(new c2(this, 1));
            addView(this.H1, mf.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public void setAccount(int i3) {
        this.f10480m2 = i3;
        this.C1 = hp.s1(i3).f23027i0;
        this.U0.f45386b = i3;
        li0 li0Var = this.P1;
        if (li0Var != null) {
            li0Var.setCurrentAccount(i3);
            this.P1.p(null, null, true);
        }
        li0 li0Var2 = this.f10446b3;
        if (li0Var2 != null) {
            li0Var2.setCurrentAccount(i3);
        }
    }

    public void setActive(boolean z10) {
        R0(0L, z10);
    }

    public void setDelegate(c4 c4Var) {
        this.A1 = c4Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.P2 != z10) {
            this.P2 = z10;
            if (z10) {
                this.O0.f21249i1 = 1.0f;
                p0(false);
            }
        }
    }

    public void setLongpressed(boolean z10) {
        if (this.f10511u1) {
            this.f10516v2 = z10;
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
            if (this.f10511u1 && this.f10506t0.f10908a && Build.VERSION.SDK_INT < 33) {
                a3.o oVar = this.G3;
                if (z10) {
                    org.telegram.messenger.g0.r(oVar);
                    org.telegram.messenger.g0.i3(oVar, 250L);
                    return;
                }
                org.telegram.messenger.g0.r(oVar);
                r9 r9Var = ((i9) this.A1).d;
                r9Var.m1 = true;
                r9Var.d0();
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.B1 != z10) {
            this.B1 = z10;
            c3 c3Var = this.O0;
            if (z10) {
                c3Var.Q0();
                c3Var.f21272u0 = false;
            } else {
                c3Var.P0(false);
                c3Var.f21272u0 = true;
            }
            this.H0 = 0L;
            this.M0.invalidate();
        }
    }

    public final void t0() {
        org.telegram.ui.ActionBar.e6 e6Var = this.f10476l0;
        s2 s2Var = new s2(this, org.telegram.messenger.g0.W(getContext()), this, new q2(1, e6Var));
        this.L1 = s2Var;
        xs editField = s2Var.getEditField();
        editField.getClass();
        rs rsVar = new rs(editField, 0);
        editField.f31437u0 = rsVar;
        rsVar.q(true);
        editField.f31437u0.u(editField.f31445y0);
        editField.f31437u0.w(editField.getPaint().getTextSize());
        rs rsVar2 = new rs(editField, 1);
        editField.f31439v0 = rsVar2;
        rsVar2.f33983b = 5;
        rsVar2.u(editField.f31445y0);
        editField.f31439v0.w(editField.getPaint().getTextSize());
        this.L1.getEditField().setScaleX(0.0f);
        this.L1.setOverrideKeyboardAnimation(true);
        this.L1.setClipChildren(false);
        this.L1.setDelegate(new t2(this));
        setDelegate(this.L1);
        s2 s2Var2 = this.L1;
        s2Var2.f31235z4 = false;
        s2Var2.A4 = true;
        if (this.f10527y1.f10362f) {
            s2Var2.U0(false, false, false);
        } else {
            s2Var2.U0(true, true, false);
        }
        this.L1.updateColors();
        s2 s2Var3 = this.L1;
        s2Var3.B4 = true;
        addView(s2Var3, mf.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.f10529y3 != null) {
            this.L1.Q1(false);
        }
        this.L1.H2 = this.f10471j2;
        i4 i4Var = this.f10520w2;
        ((ArrayList) i4Var.f10407g).add(this.M0);
        ((ArrayList) i4Var.f10407g).add(this);
        if (this.K0) {
            this.L1.D0();
        }
        p0(false);
        if (G0()) {
            this.L1.setVisibility(8);
        }
        mh.h hVar = new mh.h(getContext(), e6Var, this.f10505s3, this.f10493p3);
        this.M1 = hVar;
        hVar.setOnClickListener(new x1(this, 1));
        addView(this.M1, mf.e(57, 300, 85));
        this.M1.setVisibility(8);
        this.L1.setSideButtonsForAttach(this.M1);
        this.f10502s0 = getChildCount();
    }

    public final void u0() {
        if (this.T1 != null) {
            return;
        }
        n8 n8Var = new n8(getContext(), this.f10476l0);
        this.T1 = n8Var;
        n8Var.setOnClickListener(new c2(this, 4));
        this.T1.setAlpha(0.0f);
        this.T1.setVisibility(8);
        addView(this.T1, mf.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void v0() {
        boolean z10;
        if (this.K1 == null && getContext() != null) {
            s1 s1Var = new s1(getContext(), this.f10505s3);
            this.K1 = s1Var;
            s1Var.setOnClickListener(new c2(this, 5));
            s1 s1Var2 = this.K1;
            g1 g1Var = g1.X;
            boolean z11 = true;
            if (g1Var != null && g1Var.o()) {
                z10 = true;
            } else {
                z10 = false;
            }
            s1Var2.b(z10, false);
            s1 s1Var3 = this.K1;
            g1 g1Var2 = g1.X;
            if (g1Var2 != null && !g1Var2.m()) {
                z11 = false;
            }
            s1Var3.a(z11, false);
            addView(this.K1, mf.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void w0() {
        if (this.J1 == null && getContext() != null) {
            this.I1 = new v1(getContext(), this.f10480m2);
            w1 w1Var = new w1(getContext(), this.I1, this.f10505s3);
            this.J1 = w1Var;
            w1Var.setOnClickListener(new c2(this, 6));
            this.J1.setOnLongClickListener(new z1(this, 1));
            addView(this.J1, mf.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
            addView(this.I1, mf.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void x0() {
        int i3;
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
        if (this.f10487o1) {
            i3 = 2131744675;
        } else {
            i3 = 2131744503;
        }
        textView2.setText(bd.M0(i3, null));
        TextView textView3 = new TextView(getContext());
        this.S1 = textView3;
        textView3.setTextColor(-1);
        this.S1.setTextSize(1, 12.0f);
        TextView textView4 = this.S1;
        int L = org.telegram.messenger.g0.L(40.0f);
        textView4.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 452984831, 855638015, 855638015));
        this.S1.setGravity(17);
        pf.a(this.S1);
        this.S1.setText(bd.M0(2131744502, null));
        this.S1.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        this.Q1.addView(imageView, mf.t(22, 22, 16, 12, 1, 4, 0));
        this.Q1.addView(this.R1, mf.s(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.Q1.addView(this.S1, mf.s(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.L1.addView(this.Q1, mf.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    public final void y0() {
        if (this.L2 != null) {
            return;
        }
        ec ecVar = new ec(getContext(), 1);
        this.L2 = ecVar;
        ecVar.setTextSize(1, 14.0f);
        this.L2.setTextColor(i0.a.f(0.5f, -16777216, -1));
        this.L2.setGravity(19);
        this.L2.setText(bd.M0(2131744501, null));
        addView(this.L2, mf.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void z0() {
        if (this.G1 != null) {
            return;
        }
        d3 d3Var = new d3(this, getContext(), 0);
        this.G1 = d3Var;
        d3Var.setClickable(true);
        addView(this.G1, mf.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        e3 e3Var = new e3(this, getContext());
        this.f10492p2 = e3Var;
        e3Var.setOnClickListener(new c2(this, 0));
        this.G1.addView(this.f10492p2, mf.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        v vVar = new v(0, getContext(), false);
        this.f10478l2 = vVar;
        vVar.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        this.G1.addView(this.f10478l2, mf.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f10474k2 = textView;
        textView.setTextSize(1, 14.0f);
        this.f10474k2.setTextColor(-1);
        this.G1.addView(this.f10474k2, mf.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.f10463h1.f10330s);
        e3 e3Var2 = this.f10492p2;
        int L = org.telegram.messenger.g0.L(15.0f);
        int o10 = i0.a.o(-1, 120);
        e3Var2.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, o10, o10));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.O(i0.a.o(-1, 120), -org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f)));
    }
}
