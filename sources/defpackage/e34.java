package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public class e34 extends FrameLayout implements vlb, g94, jm7, cp5 {
    public static final int U2 = 0;
    public final z24 A0;
    public final LongSparseArray A1;
    public int A2;
    public final zz3 B0;
    public int B1;
    public ArrayList B2;
    public final q04 C0;
    public final rx3 C1;
    public int C2;
    public final r04 D0;
    public final int D1;
    public long D2;
    public final ImageView E;
    public final l04 E0;
    public final int[] E1;
    public final fn0 E2;
    public final ImageView F;
    public final m04 F0;
    public int F1;
    public ArrayList F2;
    public AnimatorSet G;
    public c34 G0;
    public int G1;
    public Drawable G2;
    public AnimatorSet H;
    public final p04 H0;
    public int H1;
    public int H2;
    public float I;
    public final xo4 I0;
    public int I1;
    public int I2;
    public final j14 J;
    public boolean J0;
    public int J1;
    public int J2;
    public final e14 K;
    public boolean K0;
    public TLRPC.ChatFull K1;
    public int K2;
    public final su L;
    public boolean L0;
    public boolean L1;
    public boolean L2;
    public final vo4 M;
    public final y14 M0;
    public int M1;
    public e7a M2;
    public final su N;
    public AnimatorSet N0;
    public final pl9 N1;
    public e7a N2;
    public final vo4 O;
    public final wb O0;
    public boolean O1;
    public boolean O2;
    public final View P;
    public l14 P0;
    public int P1;
    public AnimatorSet P2;
    public final r14 Q;
    public boolean Q0;
    public boolean Q1;
    public c04 Q2;
    public final f14 R;
    public final int[] R0;
    public boolean R1;
    public final vz3 R2;
    public final o14 S;
    public final ObjectAnimator[] S0;
    public n24 S1;
    public boolean S2;
    public final e24 T;
    public boolean T0;
    public float T1;
    public boolean T2;
    public c34 U;
    public w04 U0;
    public float U1;
    public final xo4 V;
    public boolean V0;
    public float V1;
    public final d04 W;
    public boolean W0;
    public float W1;
    public String[] X0;
    public float X1;
    public final Drawable[] Y0;
    public boolean Y1;
    public final Drawable[] Z0;
    public final d Z1;
    public final fn0 a;
    public AnimatorSet a0;
    public final Drawable[] a1;
    public final ylb a2;
    public final fn0 b;
    public final cw6 b0;
    public final String[] b1;
    public final qlb b2;
    public int c;
    public final cw6 c0;
    public final int c1;
    public final qlb c2;
    public final ArrayList d;
    public boolean d0;
    public final int d1;
    public final boolean d2;
    public final ArrayList e;
    public final boolean e0;
    public final ArrayList e1;
    public LongSparseArray e2;
    public boolean f;
    public boolean f0;
    public int f1;
    public PorterDuffColorFilter f2;
    public boolean g0;
    public int g1;
    public final o04 g2;
    public final s04 h;
    public final f04 h0;
    public boolean h1;
    public final z04 h2;
    public final g04 i0;
    public TLRPC.TL_messages_stickerSet i1;
    public boolean i2;
    public final k24 j0;
    public ArrayList j1;
    public final boolean j2;
    public final j24 k0;
    public ArrayList k1;
    public final mr3 k2;
    public final m24 l0;
    public ArrayList l1;
    public final ms0 l2;
    public final HashMap m0;
    public ArrayList m1;
    public final kz4 m2;
    public final FrameLayout n;
    public final zz3 n0;
    public final ArrayList n1;
    public final sy4 n2;
    public final j24 o0;
    public final ArrayList o1;
    public boolean o2;
    public final i04 p0;
    public final ArrayList p1;
    public boolean p2;
    public final m14 q0;
    public final ArrayList q1;
    public int q2;
    public final FrameLayout r;
    public boolean r0;
    public final ArrayList r1;
    public float r2;
    public final FrameLayout s;
    public int s0;
    public final HashMap s1;
    public View s2;
    public int t0;
    public final Paint t1;
    public int t2;
    public int u0;
    public f24 u1;
    public int u2;
    public boolean v0;
    public long v1;
    public long v2;
    public final View w;
    public boolean w0;
    public boolean w1;
    public boolean w2;
    public final tt7 x;
    public boolean x0;
    public boolean x1;
    public boolean x2;
    public final t04 y;
    public final j04 y0;
    public final TLRPC.StickerSetCovered[] y1;
    public final Rect y2;
    public final w24 z0;
    public final LongSparseArray z1;
    public final GradientDrawable z2;

    public e34(d dVar, boolean z, boolean z2, boolean z3, Context context, boolean z4, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z5, final ylb ylbVar, boolean z6, boolean z7) {
        super(context);
        int x;
        int x2;
        int x3;
        int x4;
        int x5;
        int x6;
        int x7;
        int x8;
        int x9;
        int x10;
        int x11;
        int x12;
        int x13;
        int x14;
        int x15;
        int x16;
        int x17;
        int x18;
        sy4 sy4Var;
        boolean z8;
        Field field;
        o14 o14Var;
        boolean z9;
        boolean z10;
        km0 km0Var;
        int i;
        d53 d53Var = d53.h;
        this.a = new fn0(0, this, d53Var, 320L, false);
        this.b = new fn0(1, this, d53Var, 320L, false);
        this.c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.d0 = true;
        this.l0 = new m24(this);
        this.m0 = new HashMap();
        this.r0 = true;
        this.s0 = -2;
        this.t0 = -2;
        this.u0 = -2;
        this.v0 = true;
        this.x0 = true;
        this.J0 = true;
        this.R0 = new int[3];
        this.S0 = new ObjectAnimator[3];
        int i2 = z8c.t0;
        this.d1 = i2;
        this.e1 = new ArrayList();
        this.j1 = new ArrayList();
        this.k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.m1 = new ArrayList();
        this.n1 = new ArrayList();
        this.o1 = new ArrayList();
        this.p1 = new ArrayList();
        this.q1 = new ArrayList();
        this.r1 = new ArrayList();
        this.s1 = new HashMap();
        this.y1 = new TLRPC.StickerSetCovered[10];
        this.z1 = new LongSparseArray();
        this.A1 = new LongSparseArray();
        this.E1 = new int[2];
        this.G1 = -2;
        this.H1 = -2;
        this.I1 = -2;
        this.J1 = -2;
        this.M1 = -1;
        this.g2 = new o04(this, (byte) 0);
        this.h2 = new z04(this);
        this.i2 = true;
        sy4 sy4Var2 = new sy4();
        this.n2 = sy4Var2;
        this.r2 = -1.0f;
        this.t2 = -1;
        this.u2 = -1;
        this.v2 = -1L;
        this.w2 = false;
        this.x2 = true;
        this.y2 = new Rect();
        this.z2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.E2 = new fn0(0, new wz3(this, (byte) 3), d53Var, 380L, true);
        this.R2 = new vz3(this, (byte) 1);
        this.S2 = false;
        this.v0 = z5;
        this.Z1 = dVar;
        this.d2 = z;
        this.a2 = ylbVar;
        this.j2 = z7;
        kz4 kz4Var = new kz4();
        this.m2 = kz4Var;
        kz4Var.a(x(cmb.c6));
        if (z6) {
            s(true);
        }
        on2.p(x(cmb.Ml), 30);
        int L = gm.L(50.0f);
        this.c1 = L;
        this.e0 = z4;
        if (z7) {
            x = t(0.4f);
            x2 = t(0.8f);
        } else {
            x = x(cmb.If);
            x2 = x(cmb.Ff);
        }
        qlb V = cmb.V(context, 2131232760, x, x2);
        if (z7) {
            x3 = t(0.4f);
            x4 = t(0.8f);
        } else {
            x3 = x(cmb.If);
            x4 = x(cmb.Ff);
        }
        qlb V2 = cmb.V(context, 2131232757, x3, x4);
        if (z7) {
            x5 = t(0.4f);
            x6 = t(0.8f);
        } else {
            x5 = x(cmb.If);
            x6 = x(cmb.Ff);
        }
        this.Y0 = new Drawable[]{V, V2, cmb.V(context, 2131232761, x5, x6)};
        if (z7) {
            x7 = t(0.4f);
            x8 = t(0.8f);
        } else {
            x7 = x(cmb.Df);
            x8 = x(cmb.Ff);
        }
        qlb V3 = cmb.V(context, 2131232131, x7, x8);
        if (z7) {
            x9 = t(0.4f);
            x10 = t(0.8f);
        } else {
            x9 = x(cmb.Df);
            x10 = x(cmb.Ff);
        }
        qlb V4 = cmb.V(context, 2131231067, x9, x10);
        if (z7) {
            x11 = t(0.4f);
            x12 = t(0.8f);
        } else {
            x11 = x(cmb.Df);
            x12 = x(cmb.Ff);
        }
        qlb V5 = cmb.V(context, 2131231070, x11, x12);
        if (z7) {
            x13 = t(0.4f);
            x14 = t(0.8f);
        } else {
            x13 = x(cmb.Df);
            x14 = x(cmb.Ff);
        }
        qlb V6 = cmb.V(context, 2131231068, x13, x14);
        this.b2 = V6;
        int i3 = cmb.Hf;
        qlb V7 = cmb.V(context, 2131231069, x(i3), x(i3));
        this.c2 = V7;
        this.Z0 = new Drawable[]{V3, V4, V5, new LayerDrawable(new Drawable[]{V6, V7})};
        if (z7) {
            x15 = t(0.4f);
            x16 = t(0.8f);
        } else {
            x15 = x(cmb.Df);
            x16 = x(cmb.Ff);
        }
        qlb V8 = cmb.V(context, 2131232131, x15, x16);
        if (z7) {
            x17 = t(0.4f);
            x18 = t(0.8f);
        } else {
            x17 = x(cmb.Df);
            x18 = x(cmb.Ff);
        }
        this.a1 = new Drawable[]{V8, cmb.V(context, 2131232780, x17, x18)};
        this.b1 = new String[]{jb6.M0(2131751132, null), jb6.M0(2131751131, null), jb6.M0(2131751130, null), jb6.M0(2131751129, null), jb6.M0(2131751128, null), jb6.M0(2131751127, null), jb6.M0(2131751126, null), jb6.M0(2131751125, null)};
        this.K1 = chatFull;
        Paint paint = new Paint(1);
        this.t1 = paint;
        paint.setColor(x(cmb.Rf));
        xj xjVar = agc.a;
        this.N1 = new pl9(gm.L(6.0f));
        e14 e14Var = new e14(this, context);
        this.K = e14Var;
        ?? obj = new Object();
        obj.a = (byte) 0;
        obj.b = e14Var;
        arrayList.add(obj);
        if (z) {
            hs6.d0(i2).D(5);
            hs6.d0(i2).y();
            this.f2 = new PorterDuffColorFilter(x(cmb.Ei), PorterDuff.Mode.SRC_IN);
        }
        r14 r14Var = new r14(this, context);
        this.Q = r14Var;
        sy4Var2.b(r14Var);
        sc3 sc3Var = new sc3();
        sc3Var.c = (short) 220;
        sc3Var.e = (short) 220;
        sc3Var.f = (short) 160;
        sc3Var.g = (short) 160;
        sc3Var.i = d53.g;
        r14Var.setItemAnimator(sc3Var);
        r14Var.setOnTouchListener(new View.OnTouchListener(this) {
            public final e34 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                byte b = r3;
                e34 e34Var = this.b;
                switch (b) {
                    case 0:
                        hx2 e = hx2.e();
                        r14 r14Var2 = e34Var.Q;
                        e34Var.getMeasuredHeight();
                        return e.h(motionEvent, r14Var2, null, e34Var.h2, ylbVar);
                    case 1:
                        return hx2.e().h(motionEvent, e34Var.i0, e34Var.n0, e34Var.h2, ylbVar);
                    default:
                        hx2 e2 = hx2.e();
                        l04 l04Var = e34Var.E0;
                        e34Var.getMeasuredHeight();
                        return e2.h(motionEvent, l04Var, e34Var.B0, e34Var.h2, ylbVar);
                }
            }
        });
        r14Var.setOnItemLongClickListener(new wz3(this, (byte) 1));
        r14Var.setInstantClick(true);
        f14 f14Var = new f14(this);
        this.R = f14Var;
        r14Var.setLayoutManager(f14Var);
        r14Var.setTopGlowOffset(gm.L(38.0f));
        r14Var.setBottomGlowOffset(gm.L(36.0f));
        r14Var.setPadding(gm.L(5.0f), gm.L(36.0f), gm.L(5.0f), gm.L(44.0f));
        int i4 = cmb.yf;
        anb.l(r14Var, 21, i4, ylbVar);
        r14Var.setItemSelectorColorProvider(new wa3((byte) 26));
        r14Var.setClipToPadding(false);
        f14Var.O = new g14(this);
        o14 o14Var2 = new o14(this);
        this.S = o14Var2;
        r14Var.setAdapter(o14Var2);
        r14Var.i(new ks(this, (byte) 5));
        this.T = new e24(this, context);
        e14Var.addView(r14Var, qoe.c(-1.0f, -1));
        cw6 cw6Var = new cw6(r14Var, f14Var);
        this.c0 = cw6Var;
        cw6Var.r = new h14(this);
        r14Var.setOnScrollListener(new i14(this));
        j14 j14Var = new j14(this, context, ylbVar, z, dVar != null ? new vz3(this, (byte) 2) : null, z7);
        this.J = j14Var;
        if (z4) {
            d04 d04Var = new d04(this, context);
            this.W = d04Var;
            e14Var.addView(d04Var, new FrameLayout.LayoutParams(-1, gm.e1() + L));
            d04Var.d.setOnFocusChangeListener(new e04(this));
            xo4 xo4Var = new xo4(context, ylbVar);
            this.V = xo4Var;
            xo4Var.setVisibility(8);
            xo4Var.setOnBackClickListener(new View.OnClickListener(this) {
                public final e34 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    s24 s24Var;
                    byte b = r2;
                    e34 e34Var = this.b;
                    switch (b) {
                        case 0:
                            e24 e24Var = e34Var.T;
                            z14 z14Var = e24Var.c;
                            int childCount = z14Var.getChildCount();
                            for (int i5 = 0; i5 < childCount; i5++) {
                                ((wo4) z14Var.getChildAt(i5)).a(false, true);
                            }
                            e24Var.d = 0L;
                            e24Var.G.b.a(false, true);
                            e24Var.f();
                            return;
                        case 1:
                            z24 z24Var = e34Var.A0;
                            z14 z14Var2 = z24Var.c;
                            int childCount2 = z14Var2.getChildCount();
                            for (int i6 = 0; i6 < childCount2; i6++) {
                                ((wo4) z14Var2.getChildAt(i6)).a(false, true);
                            }
                            z24Var.d = 0L;
                            z24Var.R.a.a(false, true);
                            z24Var.f();
                            return;
                        case 2:
                            f24 f24Var = e34Var.u1;
                            if (f24Var != null) {
                                f24Var.v();
                                return;
                            }
                            return;
                        default:
                            int currentItem = e34Var.h.getCurrentItem();
                            if (currentItem == 0) {
                                s24Var = e34Var.W;
                            } else if (currentItem == 1) {
                                s24Var = e34Var.p0;
                            } else {
                                s24Var = e34Var.H0;
                            }
                            if (s24Var != null) {
                                q24 q24Var = s24Var.d;
                                q24Var.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                q24Var.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                q24Var.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            e14Var.addView(xo4Var, new FrameLayout.LayoutParams(-1, L));
        }
        if (Color.alpha(x(i4)) >= 255) {
            anb.h(i4, ylbVar, j14Var);
        }
        o14Var2.G(true);
        j14Var.p(getEmojipacks());
        e14Var.addView(j14Var, qoe.c(36.0f, -1));
        View view = new View(context);
        this.P = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i5 = cmb.Bf;
        anb.h(i5, ylbVar, view);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gm.e1(), 51);
        layoutParams.topMargin = gm.L(36.0f);
        e14Var.addView(view, layoutParams);
        vo4 vo4Var = new vo4(context, ylbVar);
        this.M = vo4Var;
        su suVar = new su(context, ylbVar, (byte) 16);
        this.L = suVar;
        suVar.setVisibility(8);
        suVar.addView(vo4Var, qoe.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        e14Var.addView(suVar, qoe.e(-1, -2, 80));
        if (z2) {
            ft9 ft9Var = ft9.b;
            if (z3) {
                f04 f04Var = new f04(this, context);
                this.h0 = f04Var;
                ?? obj2 = new Object();
                obj2.a = (byte) 1;
                obj2.b = f04Var;
                arrayList.add(obj2);
                g04 g04Var = new g04(this, context);
                this.i0 = g04Var;
                sy4Var2.b(g04Var);
                g04Var.setClipToPadding(false);
                k24 k24Var = new k24(this);
                this.j0 = k24Var;
                g04Var.setLayoutManager(k24Var);
                g04Var.i(new h04(this));
                g04Var.setPadding(0, L, 0, gm.L(44.0f) + this.q2);
                ((jka) g04Var.getItemAnimator()).m = false;
                j24 j24Var = new j24(this, context, true, Integer.MAX_VALUE);
                this.o0 = j24Var;
                g04Var.setAdapter(j24Var);
                this.k0 = new j24(this, context, false, 0);
                g04Var.setOnScrollListener(new d34(this, 2));
                g04Var.setOnTouchListener(new View.OnTouchListener(this) {
                    public final e34 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        byte b = r3;
                        e34 e34Var = this.b;
                        switch (b) {
                            case 0:
                                hx2 e = hx2.e();
                                r14 r14Var2 = e34Var.Q;
                                e34Var.getMeasuredHeight();
                                return e.h(motionEvent, r14Var2, null, e34Var.h2, ylbVar);
                            case 1:
                                return hx2.e().h(motionEvent, e34Var.i0, e34Var.n0, e34Var.h2, ylbVar);
                            default:
                                hx2 e2 = hx2.e();
                                l04 l04Var = e34Var.E0;
                                e34Var.getMeasuredHeight();
                                return e2.h(motionEvent, l04Var, e34Var.B0, e34Var.h2, ylbVar);
                        }
                    }
                });
                ?? r10 = new f59(this) {
                    public final e34 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void g(int i6, View view2) {
                        int i7;
                        String str;
                        byte b = r2;
                        e34 e34Var = this.b;
                        switch (b) {
                            case 0:
                                g04 g04Var2 = e34Var.i0;
                                j24 j24Var2 = e34Var.k0;
                                j24 j24Var3 = e34Var.o0;
                                if (e34Var.u1 != null) {
                                    j24Var3.getClass();
                                    ArrayList arrayList2 = j24Var3.y;
                                    if (g04Var2.getAdapter() == j24Var3) {
                                        if (i6 >= 0) {
                                            int i8 = j24Var3.I;
                                            if (i6 < i8) {
                                                e34Var.u1.u(view2, e34Var.j1.get(i6), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i8 > 0) {
                                                i7 = (i6 - i8) - 1;
                                            } else {
                                                i7 = i6;
                                            }
                                            if (i7 >= 0 && i7 < arrayList2.size()) {
                                                e34Var.u1.u(view2, arrayList2.get(i7), null, j24Var3.n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (g04Var2.getAdapter() == j24Var2 && i6 >= 0 && i6 < j24Var2.y.size()) {
                                        e34Var.u1.u(view2, j24Var2.y.get(i6), j24Var2.x, j24Var2.n, true, 0, 0);
                                        e34Var.X();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                y59 adapter = e34Var.E0.getAdapter();
                                z24 z24Var = e34Var.A0;
                                if (adapter == z24Var) {
                                    str = z24Var.O;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof y0b) {
                                    y0b y0bVar = (y0b) view2;
                                    if (y0bVar.getSticker() != null && k47.W3(y0bVar.getSticker()) && !z8c.h(j5.a(e34Var.d1).a).p()) {
                                        hx2.e().m(y0bVar);
                                        return;
                                    }
                                    hx2.e().j();
                                    if (!y0bVar.r) {
                                        y0bVar.r = true;
                                        y0bVar.n = 0.5f;
                                        y0bVar.y = 0L;
                                        x0b x0bVar = y0bVar.a;
                                        x0bVar.setAlpha(0.5f * y0bVar.I);
                                        x0bVar.invalidate();
                                        y0bVar.s = System.currentTimeMillis();
                                        y0bVar.invalidate();
                                        e34Var.u1.x(y0bVar, y0bVar.getSticker(), str2, y0bVar.getParentObject(), y0bVar.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.n0 = r10;
                g04Var.setOnItemClickListener((f59) r10);
                f04Var.addView(g04Var, qoe.c(-1.0f, -1));
                i04 i04Var = new i04(this, context);
                this.p0 = i04Var;
                f04Var.addView(i04Var, new FrameLayout.LayoutParams(-1, gm.e1() + L));
                m14 m14Var = new m14(this, context, ylbVar);
                this.q0 = m14Var;
                m14Var.setType(ft9Var);
                m14Var.setUnderlineHeight(gm.e1());
                i = i3;
                m14Var.setIndicatorColor(x(i));
                m14Var.setUnderlineColor(x(i5));
                anb.h(i4, ylbVar, m14Var);
                W();
                m14Var.setDelegate(new wz3(this, (byte) 2));
                j24Var.F("", "", true, true, true);
            } else {
                i = i3;
            }
            j04 j04Var = new j04(this, context, z5);
            this.y0 = j04Var;
            hs6.d0(i2).D(0);
            hs6.d0(i2).z();
            l04 l04Var = new l04(this, context);
            this.E0 = l04Var;
            sy4Var2.b(l04Var);
            m04 m04Var = new m04(this);
            this.F0 = m04Var;
            l04Var.setLayoutManager(m04Var);
            m04Var.O = new n04(this);
            sy4Var = sy4Var2;
            l04Var.setPadding(0, gm.L(36.0f), 0, gm.L(44.0f));
            l04Var.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.a = (byte) 2;
            obj3.b = j04Var;
            arrayList.add(obj3);
            this.A0 = new z24(this, context);
            w24 w24Var = new w24(this, context);
            this.z0 = w24Var;
            l04Var.setAdapter(w24Var);
            l04Var.setOnTouchListener(new View.OnTouchListener(this) {
                public final e34 b;

                {
                    this.b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    byte b = r3;
                    e34 e34Var = this.b;
                    switch (b) {
                        case 0:
                            hx2 e = hx2.e();
                            r14 r14Var2 = e34Var.Q;
                            e34Var.getMeasuredHeight();
                            return e.h(motionEvent, r14Var2, null, e34Var.h2, ylbVar);
                        case 1:
                            return hx2.e().h(motionEvent, e34Var.i0, e34Var.n0, e34Var.h2, ylbVar);
                        default:
                            hx2 e2 = hx2.e();
                            l04 l04Var2 = e34Var.E0;
                            e34Var.getMeasuredHeight();
                            return e2.h(motionEvent, l04Var2, e34Var.B0, e34Var.h2, ylbVar);
                    }
                }
            });
            ?? r5 = new f59(this) {
                public final e34 b;

                {
                    this.b = this;
                }

                @Override
                public final void g(int i6, View view2) {
                    int i7;
                    String str;
                    byte b = r2;
                    e34 e34Var = this.b;
                    switch (b) {
                        case 0:
                            g04 g04Var2 = e34Var.i0;
                            j24 j24Var2 = e34Var.k0;
                            j24 j24Var3 = e34Var.o0;
                            if (e34Var.u1 != null) {
                                j24Var3.getClass();
                                ArrayList arrayList2 = j24Var3.y;
                                if (g04Var2.getAdapter() == j24Var3) {
                                    if (i6 >= 0) {
                                        int i8 = j24Var3.I;
                                        if (i6 < i8) {
                                            e34Var.u1.u(view2, e34Var.j1.get(i6), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i8 > 0) {
                                            i7 = (i6 - i8) - 1;
                                        } else {
                                            i7 = i6;
                                        }
                                        if (i7 >= 0 && i7 < arrayList2.size()) {
                                            e34Var.u1.u(view2, arrayList2.get(i7), null, j24Var3.n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (g04Var2.getAdapter() == j24Var2 && i6 >= 0 && i6 < j24Var2.y.size()) {
                                    e34Var.u1.u(view2, j24Var2.y.get(i6), j24Var2.x, j24Var2.n, true, 0, 0);
                                    e34Var.X();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            y59 adapter = e34Var.E0.getAdapter();
                            z24 z24Var = e34Var.A0;
                            if (adapter == z24Var) {
                                str = z24Var.O;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof y0b) {
                                y0b y0bVar = (y0b) view2;
                                if (y0bVar.getSticker() != null && k47.W3(y0bVar.getSticker()) && !z8c.h(j5.a(e34Var.d1).a).p()) {
                                    hx2.e().m(y0bVar);
                                    return;
                                }
                                hx2.e().j();
                                if (!y0bVar.r) {
                                    y0bVar.r = true;
                                    y0bVar.n = 0.5f;
                                    y0bVar.y = 0L;
                                    x0b x0bVar = y0bVar.a;
                                    x0bVar.setAlpha(0.5f * y0bVar.I);
                                    x0bVar.invalidate();
                                    y0bVar.s = System.currentTimeMillis();
                                    y0bVar.invalidate();
                                    e34Var.u1.x(y0bVar, y0bVar.getSticker(), str2, y0bVar.getParentObject(), y0bVar.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.B0 = r5;
            l04Var.setOnItemClickListener((f59) r5);
            anb.l(l04Var, 21, i4, ylbVar);
            j04Var.addView(l04Var);
            this.b0 = new cw6(l04Var, m04Var);
            p04 p04Var = new p04(this, context);
            this.H0 = p04Var;
            j04Var.addView(p04Var, new FrameLayout.LayoutParams(-1, gm.e1() + L));
            xo4 xo4Var2 = new xo4(context, ylbVar);
            this.I0 = xo4Var2;
            xo4Var2.setVisibility(8);
            xo4Var2.setOnBackClickListener(new View.OnClickListener(this) {
                public final e34 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    s24 s24Var;
                    byte b = r2;
                    e34 e34Var = this.b;
                    switch (b) {
                        case 0:
                            e24 e24Var = e34Var.T;
                            z14 z14Var = e24Var.c;
                            int childCount = z14Var.getChildCount();
                            for (int i52 = 0; i52 < childCount; i52++) {
                                ((wo4) z14Var.getChildAt(i52)).a(false, true);
                            }
                            e24Var.d = 0L;
                            e24Var.G.b.a(false, true);
                            e24Var.f();
                            return;
                        case 1:
                            z24 z24Var = e34Var.A0;
                            z14 z14Var2 = z24Var.c;
                            int childCount2 = z14Var2.getChildCount();
                            for (int i6 = 0; i6 < childCount2; i6++) {
                                ((wo4) z14Var2.getChildAt(i6)).a(false, true);
                            }
                            z24Var.d = 0L;
                            z24Var.R.a.a(false, true);
                            z24Var.f();
                            return;
                        case 2:
                            f24 f24Var = e34Var.u1;
                            if (f24Var != null) {
                                f24Var.v();
                                return;
                            }
                            return;
                        default:
                            int currentItem = e34Var.h.getCurrentItem();
                            if (currentItem == 0) {
                                s24Var = e34Var.W;
                            } else if (currentItem == 1) {
                                s24Var = e34Var.p0;
                            } else {
                                s24Var = e34Var.H0;
                            }
                            if (s24Var != null) {
                                q24 q24Var = s24Var.d;
                                q24Var.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                q24Var.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                q24Var.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            j04Var.addView(xo4Var2, new FrameLayout.LayoutParams(-1, L));
            z8 = z5;
            q04 q04Var = new q04(this, context, ylbVar, dVar, z8);
            this.C0 = q04Var;
            q04Var.setDragEnabled(true);
            q04Var.setWillNotDraw(false);
            q04Var.setType(ft9Var);
            q04Var.setUnderlineHeight(l04Var.canScrollVertically(-1) ? gm.e1() : 0);
            q04Var.setIndicatorColor(x(i));
            q04Var.setUnderlineColor(x(i5));
            if (viewGroup != null && z8) {
                r04 r04Var = new r04(this, context);
                this.D0 = r04Var;
                r04Var.addView(q04Var, qoe.e(-1, 36, 51));
                viewGroup.addView(r04Var, qoe.c(-2.0f, -1));
            } else {
                j04Var.addView(q04Var, qoe.e(-1, 36, 51));
            }
            Y(true);
            q04Var.setDelegate(new wz3(this, (byte) 4));
            l04Var.setOnScrollListener(new d34(this, 0));
            vo4 vo4Var2 = new vo4(context, ylbVar);
            this.O = vo4Var2;
            su suVar2 = new su(context, ylbVar, (byte) 16);
            this.N = suVar2;
            suVar2.setVisibility(8);
            suVar2.addView(vo4Var2, qoe.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            j04Var.addView(suVar2, qoe.e(-1, -2, 80));
        } else {
            sy4Var = sy4Var2;
            z8 = z5;
        }
        this.e.clear();
        this.e.addAll(this.d);
        s04 s04Var = new s04(this, context);
        this.h = s04Var;
        sy4 sy4Var3 = sy4Var;
        s04Var.b(new ky4(sy4Var3, s04Var));
        s04Var.setOverScrollMode(2);
        y14 y14Var = new y14(this);
        this.M0 = y14Var;
        s04Var.setAdapter(y14Var);
        t04 t04Var = new t04(this, context);
        this.y = t04Var;
        t04Var.setHapticFeedbackEnabled(true);
        t04Var.setImageResource(2131232756);
        int t = z7 ? t(0.6f) : x(cmb.If);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        t04Var.setColorFilter(new PorterDuffColorFilter(t, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        t04Var.setScaleType(scaleType);
        t04Var.setContentDescription(jb6.M0(2131754920, null));
        t04Var.setFocusable(true);
        t04Var.setOnClickListener(new Object());
        rve.a(t04Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        if (z4) {
            addView(frameLayout, qoe.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (gm.e1() / gm.p) + 40.0f));
        } else {
            addView(frameLayout, qoe.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        addView(frameLayout2, qoe.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.n = frameLayout3;
        View view2 = new View(context);
        this.w = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, gm.L(40.0f), 83));
        if (z4) {
            addView(frameLayout3, qoe.e(-1, 48, 80));
            frameLayout3.addView(t04Var, qoe.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z2) {
                ImageView imageView = new ImageView(context);
                this.E = imageView;
                imageView.setImageResource(2131232759);
                imageView.setColorFilter(new PorterDuffColorFilter(z7 ? t(0.6f) : x(cmb.If), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(jb6.M0(2131745229, null));
                rve.a(imageView);
                frameLayout3.addView(imageView, qoe.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final e34 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        s24 s24Var;
                        byte b = r2;
                        e34 e34Var = this.b;
                        switch (b) {
                            case 0:
                                e24 e24Var = e34Var.T;
                                z14 z14Var = e24Var.c;
                                int childCount = z14Var.getChildCount();
                                for (int i52 = 0; i52 < childCount; i52++) {
                                    ((wo4) z14Var.getChildAt(i52)).a(false, true);
                                }
                                e24Var.d = 0L;
                                e24Var.G.b.a(false, true);
                                e24Var.f();
                                return;
                            case 1:
                                z24 z24Var = e34Var.A0;
                                z14 z14Var2 = z24Var.c;
                                int childCount2 = z14Var2.getChildCount();
                                for (int i6 = 0; i6 < childCount2; i6++) {
                                    ((wo4) z14Var2.getChildAt(i6)).a(false, true);
                                }
                                z24Var.d = 0L;
                                z24Var.R.a.a(false, true);
                                z24Var.f();
                                return;
                            case 2:
                                f24 f24Var = e34Var.u1;
                                if (f24Var != null) {
                                    f24Var.v();
                                    return;
                                }
                                return;
                            default:
                                int currentItem = e34Var.h.getCurrentItem();
                                if (currentItem == 0) {
                                    s24Var = e34Var.W;
                                } else if (currentItem == 1) {
                                    s24Var = e34Var.p0;
                                } else {
                                    s24Var = e34Var.H0;
                                }
                                if (s24Var != null) {
                                    q24 q24Var = s24Var.d;
                                    q24Var.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    q24Var.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    q24Var.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            tt7 tt7Var = new tt7(context, ylbVar);
            this.x = tt7Var;
            tt7Var.setViewPager(s04Var);
            tt7Var.setShouldExpand(false);
            tt7Var.setIndicatorHeight(gm.L(3.0f));
            tt7Var.setIndicatorColor(on2.p(x(cmb.Ff), 20));
            tt7Var.setUnderlineHeight(0);
            tt7Var.setTabPaddingLeftRight(gm.L(11.0f));
            tt7Var.setPadding(gm.L(4.0f), gm.L(11.0f), gm.L(4.0f), gm.L(11.0f));
            frameLayout3.addView(tt7Var, qoe.e(-2, 48, 81));
            tt7Var.setOnPageChangeListener(new v04(this, z8));
            ImageView imageView2 = new ImageView(context);
            this.F = imageView2;
            imageView2.setImageResource(2131232758);
            imageView2.setColorFilter(new PorterDuffColorFilter(z7 ? t(0.6f) : x(cmb.If), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(jb6.M0(2131745570, null));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, qoe.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final e34 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view22) {
                    s24 s24Var;
                    byte b = r2;
                    e34 e34Var = this.b;
                    switch (b) {
                        case 0:
                            e24 e24Var = e34Var.T;
                            z14 z14Var = e24Var.c;
                            int childCount = z14Var.getChildCount();
                            for (int i52 = 0; i52 < childCount; i52++) {
                                ((wo4) z14Var.getChildAt(i52)).a(false, true);
                            }
                            e24Var.d = 0L;
                            e24Var.G.b.a(false, true);
                            e24Var.f();
                            return;
                        case 1:
                            z24 z24Var = e34Var.A0;
                            z14 z14Var2 = z24Var.c;
                            int childCount2 = z14Var2.getChildCount();
                            for (int i6 = 0; i6 < childCount2; i6++) {
                                ((wo4) z14Var2.getChildAt(i6)).a(false, true);
                            }
                            z24Var.d = 0L;
                            z24Var.R.a.a(false, true);
                            z24Var.f();
                            return;
                        case 2:
                            f24 f24Var = e34Var.u1;
                            if (f24Var != null) {
                                f24Var.v();
                                return;
                            }
                            return;
                        default:
                            int currentItem = e34Var.h.getCurrentItem();
                            if (currentItem == 0) {
                                s24Var = e34Var.W;
                            } else if (currentItem == 1) {
                                s24Var = e34Var.p0;
                            } else {
                                s24Var = e34Var.H0;
                            }
                            if (s24Var != null) {
                                q24 q24Var = s24Var.d;
                                q24Var.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                q24Var.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                q24Var.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            addView(frameLayout3, qoe.d(56, 48.0f, (jb6.a0 ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            fg0 h0 = cmb.h0(gm.L(56.0f), x(i4), x(i4));
            rve.a(t04Var);
            t04Var.setPadding(0, 0, gm.L(2.0f), 0);
            t04Var.setBackground(h0);
            t04Var.setContentDescription(jb6.M0(2131754920, null));
            t04Var.setFocusable(true);
            frameLayout3.addView(t04Var, qoe.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(s04Var, 0, qoe.e(-1, -1, 51));
        wb wbVar = new wb(context, (byte) 18);
        this.O0 = wbVar;
        int L2 = gm.L(6.0f);
        int i6 = cmb.gg;
        ShapeDrawable b0 = cmb.b0(L2, x(i6));
        wmb M = anb.M(i6);
        wbVar.setBackground(b0);
        anb.j(wbVar, b0, M, null, ylbVar);
        anb.X(wbVar, cmb.fg, ylbVar);
        wbVar.setPadding(gm.L(12.0f), gm.L(7.0f), gm.L(12.0f), gm.L(7.0f));
        wbVar.setGravity(16);
        wbVar.setTextSize(1, 14.0f);
        wbVar.setVisibility(4);
        addView(wbVar, qoe.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.D1 = gm.L(gm.O1() ? 40.0f : 32.0f);
        Field field2 = rx3.f;
        rx3 rx3Var = new rx3(new qx3(context, ylbVar));
        Field field3 = rx3.f;
        if (field3 == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            field3 = field;
            rx3.f = field3;
        }
        if (field3 != null) {
            try {
                rx3Var.a = (ViewTreeObserver.OnScrollChangedListener) field3.get(rx3Var);
                rx3.f.set(rx3Var, rx3.g);
            } catch (Exception unused3) {
                rx3Var.a = null;
            }
        }
        this.C1 = rx3Var;
        rx3Var.c.setOnSelectionUpdateListener(new h92(this, (byte) 24));
        this.B1 = oc7.c1().getInt("selected_page", 0);
        HashMap hashMap = gw3.h;
        if (!gw3.k) {
            gw3.k = true;
            SharedPreferences c1 = oc7.c1();
            try {
                hashMap.clear();
                if (c1.contains("emojis")) {
                    String string = c1.getString("emojis", "");
                    if (string != null && string.length() > 0) {
                        String[] split = string.split(",");
                        int length = split.length;
                        int i7 = 0;
                        while (i7 < length) {
                            String[] split2 = split[i7].split("=");
                            long longValue = Utilities.A(split2[0]).longValue();
                            StringBuilder sb = new StringBuilder();
                            String[] strArr = split;
                            int i8 = i7;
                            int i9 = length;
                            long j = longValue;
                            for (int i10 = 0; i10 < 4; i10++) {
                                sb.insert(0, (char) j);
                                j >>= 16;
                                if (j == 0) {
                                    break;
                                }
                            }
                            if (sb.length() > 0) {
                                hashMap.put(sb.toString(), Utilities.z(split2[1]));
                            }
                            i7 = i8 + 1;
                            split = strArr;
                            length = i9;
                        }
                    }
                    c1.edit().remove("emojis").commit();
                    gw3.r();
                } else {
                    String string2 = c1.getString("emojis2", "");
                    if (string2 != null && string2.length() > 0) {
                        for (String str : string2.split(",")) {
                            String[] split3 = str.split("=");
                            hashMap.put(split3[0], Utilities.z(split3[1]));
                        }
                    }
                }
                if (hashMap.isEmpty() && !c1.getBoolean("filled_default", false)) {
                    int i11 = 0;
                    while (true) {
                        String[] strArr2 = gw3.o;
                        if (i11 >= strArr2.length) {
                            break;
                        }
                        hashMap.put(strArr2[i11], Integer.valueOf(strArr2.length - i11));
                        i11++;
                    }
                    c1.edit().putBoolean("filled_default", true).commit();
                    gw3.r();
                }
                gw3.s();
            } catch (Exception e) {
                fc4.g(e, true);
            }
            try {
                String string3 = c1.getString("color", "");
                if (string3 != null && string3.length() > 0) {
                    for (String str2 : string3.split(",")) {
                        String[] split4 = str2.split("=");
                        gw3.j.put(split4[0], split4[1]);
                    }
                }
            } catch (Exception e2) {
                z10 = true;
                fc4.g(e2, true);
                o14Var = o14Var2;
                z9 = false;
            }
        }
        o14Var = o14Var2;
        z9 = false;
        z10 = true;
        o14Var.F(z9);
        H(z10, z2, z3, z9);
        if (Build.VERSION.SDK_INT >= 31) {
            mr3 mr3Var = new mr3(z9);
            this.k2 = mr3Var;
            sy4Var3.a(mr3Var);
            nz4 nz4Var = new nz4(null);
            nz4Var.f = kz4Var;
            nz4Var.d = mr3Var;
            nz4Var.e = -2;
            km0Var = new km0(nz4Var, nz4Var, nz4Var);
            km0Var.k = true;
            int L3 = gm.L(e86.e(262144) ? 8.0f : 48.0f);
            km0Var.d = L3;
            km0Var.e = L3;
            km0Var.j = sy4Var3;
        } else {
            km0Var = new km0(kz4Var, kz4Var, kz4Var);
            km0Var.j = sy4Var3;
            this.k2 = null;
        }
        this.l2 = new ms0(this, (byte) 4);
        setBlurredBackgroundDrawableFactory(km0Var);
        sy4Var3.i(this);
        sy4Var3.a = new wz3(this, (byte) 0);
    }

    public static String c(String str, String str2) {
        String str3;
        String str4;
        boolean z = true;
        if (bs2.c(str) != null) {
            if (bs2.c(str) == null) {
                return str;
            }
            if (str2 == null) {
                return "🤝";
            }
            if (str2.contains("\u200d")) {
                String[] split = str2.split("\u200d");
                StringBuilder sb = new StringBuilder("🫱");
                String str5 = "";
                if (split.length < 1) {
                    str4 = "";
                } else {
                    str4 = split[0];
                }
                sb.append(str4);
                sb.append("\u200d🫲");
                if (split.length >= 2) {
                    str5 = split[1];
                }
                sb.append(str5);
                return sb.toString();
            }
            return "🤝".concat(str2);
        }
        if (gw3.b(str)) {
            str = ts2.m(2, 0, str);
        } else {
            z = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = ts2.m(2, 0, str);
        } else if (length > 3 && str.charAt(str.length() - 3) == 8205) {
            str3 = str.substring(str.length() - 3);
            str = ts2.m(3, 0, str);
        } else {
            str3 = null;
        }
        String h = b10.h(str, str2);
        if (str3 != null) {
            h = h.concat(str3);
        }
        if (z) {
            return h.concat("\u200d➡");
        }
        return h;
    }

    public static void f(int i, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public final void A(boolean z, boolean z2) {
        r24 r24Var;
        boolean z3;
        int i = this.B1;
        if (i != 0 && this.x1) {
            this.B1 = 0;
            i = 0;
        }
        if (i == 0 && this.w1) {
            this.B1 = 1;
            i = 1;
        }
        s04 s04Var = this.h;
        if (i != 0 && !z && this.e.size() != 1) {
            int i2 = this.B1;
            if (i2 == 1) {
                K(false, false);
                if (!this.v0 && !this.w0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                P(z3, false);
                if (s04Var.getCurrentItem() != 2) {
                    s04Var.x(2, false);
                }
                q04 q04Var = this.C0;
                if (q04Var != null) {
                    this.T0 = true;
                    int i3 = this.H1;
                    if (i3 >= 0) {
                        q04Var.m(i3);
                    } else {
                        int i4 = this.G1;
                        if (i4 >= 0) {
                            q04Var.m(i4);
                        } else {
                            q04Var.m(this.F1);
                        }
                    }
                    this.T0 = false;
                    this.F0.g1(0, 0);
                }
            } else if (i2 == 2) {
                K(false, false);
                P(false, false);
                if (s04Var.getCurrentItem() != 1) {
                    s04Var.x(1, false);
                }
                m14 m14Var = this.q0;
                if (m14Var != null) {
                    m14Var.m(0);
                }
                i04 i04Var = this.p0;
                if (i04Var != null && (r24Var = i04Var.r) != null) {
                    r24Var.I1(null);
                }
            }
        } else {
            K(true, false);
            P(false, false);
            if (s04Var.getCurrentItem() != 0) {
                s04Var.x(0, !z);
            }
            if (z2) {
                gm.d3(new vz3(this, (byte) 5), 350L);
            }
        }
        L(true);
    }

    public final void B() {
        w24 w24Var = this.z0;
        if (w24Var != null) {
            w24Var.f();
        }
        z24 z24Var = this.A0;
        if (z24Var != null) {
            z24Var.f();
        }
        if (hx2.e().E) {
            hx2.e().b();
        }
        hx2.e().j();
    }

    public final void C(int i) {
        f24 f24Var = this.u1;
        if ((f24Var != null && f24Var.z()) || i == 0) {
            return;
        }
        HorizontalScrollView w = w(i);
        this.R0[i] = 0;
        w.setTranslationY(0.0f);
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 4;
        if (i == 0) {
            n(false);
            float f3 = 1.0f - this.a.e;
            p04 p04Var = this.H0;
            p04Var.setAlpha(f3);
            if (f3 > 0.0f) {
                i4 = 0;
            } else {
                i4 = 4;
            }
            p04Var.setVisibility(i4);
            float f4 = 1.0f - f3;
            xo4 xo4Var = this.I0;
            xo4Var.setAlpha(f4);
            xo4Var.setTranslationY((-gm.L(15.0f)) * f3);
            int i7 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
            if (i7 > 0) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            xo4Var.setVisibility(i5);
            su suVar = this.N;
            suVar.setAlpha(f4);
            suVar.setTranslationY(gm.L(30.0f) * f3);
            if (i7 > 0) {
                i6 = 0;
            }
            suVar.setVisibility(i6);
            R();
            this.y0.invalidate();
        } else if (i == 1) {
            h(false);
            float f5 = 1.0f - this.b.e;
            d04 d04Var = this.W;
            d04Var.setAlpha(f5);
            if (f5 > 0.0f) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            d04Var.setVisibility(i2);
            float f6 = 1.0f - f5;
            xo4 xo4Var2 = this.V;
            xo4Var2.setAlpha(f6);
            xo4Var2.setTranslationY((-gm.L(15.0f)) * f5);
            int i8 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
            if (i8 > 0) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            xo4Var2.setVisibility(i3);
            su suVar2 = this.L;
            suVar2.setAlpha(f6);
            suVar2.setTranslationY(gm.L(30.0f) * f5);
            if (i8 > 0) {
                i6 = 0;
            }
            suVar2.setVisibility(i6);
            R();
            this.K.invalidate();
        }
    }

    public final void E(int i, int i2) {
        f14 f14Var = this.R;
        View m = f14Var.m(i);
        int K0 = f14Var.K0();
        int i3 = 1;
        if ((m == null && Math.abs(i - K0) > f14Var.J * 9.0f) || !gda.c()) {
            if (f14Var.K0() < i) {
                i3 = 0;
            }
            cw6 cw6Var = this.c0;
            cw6Var.b = i3;
            cw6Var.l(i, i2, false, false);
            return;
        }
        this.K0 = true;
        rw3 rw3Var = new rw3((byte) 1, this.Q.getContext(), this);
        rw3Var.a = i;
        rw3Var.p = i2;
        f14Var.v0(rw3Var);
    }

    public final void F(int i, int i2) {
        m04 m04Var = this.F0;
        View m = m04Var.m(i);
        int K0 = m04Var.K0();
        int i3 = 1;
        if (m == null && Math.abs(i - K0) > 40) {
            if (m04Var.K0() < i) {
                i3 = 0;
            }
            cw6 cw6Var = this.b0;
            cw6Var.b = i3;
            cw6Var.l(i, i2, false, false);
            return;
        }
        this.K0 = true;
        this.E0.z0(i);
    }

    public final void G(n24 n24Var, String str) {
        String str2;
        String str3;
        boolean z;
        String str4;
        f24 f24Var;
        c41 c41Var;
        if (n24Var != null) {
            if (n24Var.getSpan() != null) {
                if (this.u1 != null) {
                    long j = n24Var.getSpan().documentId;
                    TLRPC.Document document = n24Var.getSpan().document;
                    s14 s14Var = n24Var.e;
                    if (s14Var != null && s14Var.i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (document == null) {
                        int i = 0;
                        while (true) {
                            ArrayList arrayList = this.r1;
                            if (i >= arrayList.size()) {
                                break;
                            }
                            s14 s14Var2 = (s14) arrayList.get(i);
                            int i2 = 0;
                            while (true) {
                                ArrayList arrayList2 = s14Var2.c;
                                if (arrayList2 != null && i2 < arrayList2.size()) {
                                    if (((TLRPC.Document) s14Var2.c.get(i2)).id == j) {
                                        document = (TLRPC.Document) s14Var2.c.get(i2);
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            i++;
                        }
                    }
                    int i3 = this.d1;
                    if (document == null) {
                        document = vm.e(i3, j);
                    }
                    if (document != null) {
                        str4 = k47.U(document);
                    } else {
                        str4 = null;
                    }
                    if (!k47.m3(document) && !z8c.h(i3).p() && (((f24Var = this.u1) == null || !f24Var.h()) && !this.V0 && !z)) {
                        L(false);
                        d dVar = this.Z1;
                        if (dVar != null) {
                            c41Var = c41.b0(dVar);
                        } else {
                            c41Var = new c41(this.r, this.a2);
                        }
                        if (!this.i2 && dVar != null) {
                            c41Var.K(2131624185, gm.S2(jb6.M0(2131743550, null)), jb6.M0(2131747550, null), new vz3(this, (byte) 4)).j();
                        } else {
                            c41Var.r(document, gm.S2(jb6.M0(2131743551, null)), jb6.M0(2131746768, null), new vz3(this, (byte) 3)).j();
                        }
                        this.i2 = !this.i2;
                        return;
                    }
                    this.D2 = SystemClock.elapsedRealtime();
                    L(true);
                    d("animated_" + j);
                    this.u1.w(j, document, str4, n24Var.c);
                    return;
                }
                return;
            }
            this.D2 = SystemClock.elapsedRealtime();
            L(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) n24Var.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!n24Var.c && (str3 = (String) gw3.j.get(str2)) != null) {
                    str2 = c(str2, str3);
                }
                d(str2);
                f24 f24Var2 = this.u1;
                if (f24Var2 != null) {
                    f24Var2.m(gw3.c(str2));
                    return;
                }
                return;
            }
            f24 f24Var3 = this.u1;
            if (f24Var3 != null) {
                f24Var3.m(gw3.c(str));
            }
        }
    }

    public final void H(boolean z, boolean z2, boolean z3, boolean z4) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        boolean z5 = false;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i >= arrayList2.size()) {
                break;
            }
            if (((a34) arrayList2.get(i)).a == 0 && z) {
                arrayList.add((a34) arrayList2.get(i));
            }
            if (((a34) arrayList2.get(i)).a == 1 && z3) {
                arrayList.add((a34) arrayList2.get(i));
            }
            if (((a34) arrayList2.get(i)).a == 2 && z2) {
                arrayList.add((a34) arrayList2.get(i));
            }
            i++;
        }
        tt7 tt7Var = this.x;
        if (tt7Var != null) {
            if (arrayList.size() > 1) {
                z5 = true;
            }
            gm.T3(tt7Var, z5, 1.0f, true, z4);
        }
        s04 s04Var = this.h;
        if (s04Var != null) {
            s04Var.setAdapter(null);
            s04Var.setAdapter(this.M0);
            if (tt7Var != null) {
                tt7Var.setViewPager(s04Var);
            }
        }
    }

    public final void I(final vo4 vo4Var, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z, boolean z2) {
        String G;
        z24 z24Var;
        e24 e24Var;
        if (stickerSet != null) {
            if (!z || (e24Var = this.T) == null || e24Var.d == stickerSet.id) {
                if (!z && (z24Var = this.A0) != null && z24Var.d != stickerSet.id) {
                    return;
                }
                final boolean D0 = hs6.d0(this.d1).D0(stickerSet.id, true);
                boolean z3 = stickerSet.masks;
                if (D0) {
                    if (z3) {
                        G = jb6.G(stickerSet.count, "RemoveManyMasksCount", new Object[0]);
                    } else {
                        boolean z4 = stickerSet.emojis;
                        int i = stickerSet.count;
                        if (z4) {
                            G = jb6.G(i, "RemoveManyEmojiCount", new Object[0]);
                        } else {
                            G = jb6.G(i, "RemoveManyStickersCount", new Object[0]);
                        }
                    }
                } else if (z3) {
                    G = jb6.G(stickerSet.count, "AddManyMasksCount", new Object[0]);
                } else {
                    boolean z5 = stickerSet.emojis;
                    int i2 = stickerSet.count;
                    if (z5) {
                        G = jb6.G(i2, "AddManyEmojiCount", new Object[0]);
                    } else {
                        G = jb6.G(i2, "AddManyStickersCount", new Object[0]);
                    }
                }
                vo4Var.i(G, z2, true);
                vo4Var.m0.a(!D0, z2);
                vo4Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i3;
                        e34 e34Var = e34.this;
                        hs6 d0 = hs6.d0(e34Var.d1);
                        Context context = e34Var.getContext();
                        if (D0) {
                            i3 = 0;
                        } else {
                            i3 = 2;
                        }
                        int i4 = i3;
                        d dVar = e34Var.Z1;
                        FrameLayout frameLayout = e34Var.s;
                        vo4 vo4Var2 = vo4Var;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z6 = z;
                        d0.i2(context, tLObject2, document2, i4, dVar, frameLayout, false, true, new b5a(e34Var, vo4Var2, tLObject2, stickerSet2, document2, z6), false);
                        e34Var.I(vo4Var2, tLObject2, stickerSet2, document2, z6, true);
                    }
                });
            }
        }
    }

    public final void J(long j, boolean z, boolean z2) {
        int i;
        View childAt;
        float f;
        tt7 tt7Var = this.x;
        if (tt7Var != null) {
            this.w1 = z;
            this.x1 = z2;
            if (!z2 && !z) {
                this.v1 = 0L;
            } else {
                this.v1 = j;
            }
            if (z2) {
                i = 2;
            } else {
                i = 0;
            }
            LinearLayout linearLayout = tt7Var.d;
            if (i >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i);
            }
            if (childAt != null) {
                if (this.v1 != 0) {
                    f = 0.15f;
                } else {
                    f = 1.0f;
                }
                childAt.setAlpha(f);
                long j2 = this.v1;
                s04 s04Var = this.h;
                int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                if (z2) {
                    if (i2 != 0 && s04Var.getCurrentItem() != 0) {
                        K(true, true);
                        P(false, true);
                        s04Var.x(0, false);
                    }
                } else if (i2 != 0 && s04Var.getCurrentItem() != 1) {
                    K(false, true);
                    P(false, true);
                    s04Var.x(1, false);
                }
            }
        }
    }

    public final void K(boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        t04 t04Var = this.y;
        Object tag = t04Var.getTag();
        if (z) {
            if (tag == null) {
                return;
            }
        } else if (tag != null) {
            return;
        }
        if (!this.o2) {
            AnimatorSet animatorSet = this.G;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.G = null;
            }
            if (!z) {
                num = 1;
            }
            t04Var.setTag(num);
            int i = 0;
            float f5 = 0.0f;
            if (z2) {
                if (z) {
                    t04Var.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.G = animatorSet2;
                if (z) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t04Var, View.ALPHA, f3);
                if (z) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(t04Var, View.SCALE_X, f4);
                if (z) {
                    f5 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(t04Var, View.SCALE_Y, f5));
                this.G.setDuration(200L);
                this.G.setInterpolator(d53.g);
                this.G.addListener(new b14(this, z, (byte) 0));
                this.G.start();
                return;
            }
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            t04Var.setAlpha(f);
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            t04Var.setScaleX(f2);
            if (z) {
                f5 = 1.0f;
            }
            t04Var.setScaleY(f5);
            if (!z) {
                i = 4;
            }
            t04Var.setVisibility(i);
        }
    }

    public final void L(boolean z) {
        Integer num;
        this.I = 0.0f;
        f24 f24Var = this.u1;
        if (f24Var != null && f24Var.z()) {
            z = false;
        }
        FrameLayout frameLayout = this.n;
        Object tag = frameLayout.getTag();
        if (z) {
            if (tag != null) {
                num = null;
            } else {
                return;
            }
        } else if (tag != null) {
            return;
        } else {
            num = 1;
        }
        frameLayout.setTag(num);
        this.E2.a(z, true);
    }

    public final void M(boolean z, boolean z2) {
        View view = this.P;
        Object tag = view.getTag();
        if (z) {
            if (tag == null) {
                return;
            }
        } else if (tag != null) {
            return;
        }
        AnimatorSet animatorSet = this.a0;
        Integer num = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.a0 = null;
        }
        if (!z) {
            num = 1;
        }
        view.setTag(num);
        float f = 0.0f;
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.a0 = animatorSet2;
            if (z) {
                f = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, f));
            this.a0.setDuration(200L);
            this.a0.setInterpolator(d53.g);
            this.a0.addListener(new kh2(this, (byte) 19));
            this.a0.start();
            return;
        }
        if (z) {
            f = 1.0f;
        }
        view.setAlpha(f);
    }

    public final void N(boolean z) {
        for (int i = 0; i < 3; i++) {
            q55 u = u(i);
            int K0 = u.K0();
            if (z) {
                if (K0 == 1 || K0 == 2) {
                    u.m0(0);
                    C(i);
                }
            } else if (K0 == 0) {
                u.g1(0, 0);
            }
        }
    }

    public final void O(boolean z, boolean z2, boolean z3) {
        float f;
        float translationY;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat L0 = oc7.r1(this.d1).L0(Long.valueOf(this.v1));
        if (L0 != null) {
            wb wbVar = this.O0;
            if (z) {
                if (!sd2.N(L0) && (tL_chatBannedRights = L0.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z2 && tL_chatBannedRights.send_plain))) {
                    d dVar = this.Z1;
                    if (!(dVar instanceof yv1) || !((yv1) dVar).W4()) {
                        if (z2) {
                            wbVar.setText(jb6.M0(2131749320, null));
                        } else if (z3) {
                            wbVar.setText(jb6.M0(2131749319, null));
                        } else {
                            wbVar.setText(jb6.M0(2131749313, null));
                        }
                    } else {
                        return;
                    }
                } else {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = L0.banned_rights;
                    if (tL_chatBannedRights2 == null) {
                        return;
                    }
                    if (gm.B1(tL_chatBannedRights2)) {
                        if (z2) {
                            wbVar.setText(jb6.M0(2131753908, null));
                        } else if (z3) {
                            wbVar.setText(jb6.M0(2131753934, null));
                        } else {
                            wbVar.setText(jb6.M0(2131753899, null));
                        }
                    } else {
                        if (z2) {
                            wbVar.setText(jb6.a0("AttachPlainRestricted", null, 2131753909, jb6.v(L0.banned_rights.until_date)));
                        }
                        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = L0.banned_rights;
                        if (z3) {
                            wbVar.setText(jb6.a0("AttachGifRestricted", null, 2131753935, jb6.v(tL_chatBannedRights3.until_date)));
                        } else {
                            wbVar.setText(jb6.a0("AttachStickersRestricted", null, 2131753900, jb6.v(tL_chatBannedRights3.until_date)));
                        }
                    }
                }
                wbVar.setVisibility(0);
            }
            AnimatorSet animatorSet = this.P2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.P2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.P2 = animatorSet2;
            float f2 = 0.0f;
            float f3 = 1.0f;
            if (z) {
                f = wbVar.getAlpha();
            } else {
                f = 1.0f;
                f3 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wbVar, View.ALPHA, f, f3);
            if (z) {
                translationY = gm.L(12.0f);
            } else {
                translationY = wbVar.getTranslationY();
                f2 = gm.L(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(wbVar, View.TRANSLATION_Y, translationY, f2));
            c04 c04Var = this.Q2;
            if (c04Var != null) {
                gm.r(c04Var);
            }
            if (z) {
                c04 c04Var2 = new c04(this, z2, z3, (byte) 0);
                this.Q2 = c04Var2;
                gm.d3(c04Var2, 3500L);
            }
            this.P2.setDuration(320L);
            this.P2.setInterpolator(d53.h);
            this.P2.start();
        }
    }

    public final void P(boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        ImageView imageView = this.E;
        if (imageView != null && !this.p2) {
            Object tag = imageView.getTag();
            if (z) {
                if (tag == null) {
                    return;
                }
            } else if (tag != null) {
                return;
            }
            AnimatorSet animatorSet = this.H;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.H = null;
            }
            if (!z) {
                num = 1;
            }
            imageView.setTag(num);
            int i = 0;
            float f5 = 0.0f;
            if (z2) {
                if (z) {
                    imageView.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.H = animatorSet2;
                if (z) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.ALPHA, f3);
                if (z) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, View.SCALE_X, f4);
                if (z) {
                    f5 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(imageView, View.SCALE_Y, f5));
                this.H.setDuration(200L);
                this.H.setInterpolator(d53.g);
                this.H.addListener(new b14(this, z, (byte) 1));
                this.H.start();
                return;
            }
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            imageView.setAlpha(f);
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            imageView.setScaleX(f2);
            if (z) {
                f5 = 1.0f;
            }
            imageView.setScaleY(f5);
            if (!z) {
                i = 4;
            }
            imageView.setVisibility(i);
        }
    }

    public final void Q(boolean z) {
        g04 g04Var = this.i0;
        if (g04Var != null) {
            int childCount = g04Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = g04Var.getChildAt(i);
                if (childAt instanceof lx2) {
                    ImageReceiver photoImage = ((lx2) childAt).getPhotoImage();
                    if (z) {
                        photoImage.u0 = true;
                        photoImage.w0(false);
                    } else {
                        photoImage.u0 = false;
                        photoImage.x0();
                    }
                }
            }
        }
    }

    public final void R() {
        int measuredHeight;
        int L;
        d dVar;
        View view = (View) getParent();
        if (view != null) {
            float y = getY();
            if (getLayoutParams().height > 0) {
                measuredHeight = getLayoutParams().height;
            } else {
                measuredHeight = getMeasuredHeight();
            }
            float f = y + measuredHeight;
            if ((!gm.E && ((dVar = this.Z1) == null || !dVar.isInBubbleMode())) || this.W0) {
                L = view.getHeight();
            } else {
                L = gm.L(1.0f);
            }
            float f2 = f - L;
            int i = (this.r2 > 0.0f ? 1 : (this.r2 == 0.0f ? 0 : -1));
            FrameLayout frameLayout = this.n;
            if (i >= 0) {
                f2 += getMeasuredHeight() - this.r2;
            } else if (frameLayout.getTop() - f2 < 0.0f || !this.x2) {
                f2 = 0.0f;
            }
            float U1 = (-f2) + gm.U1(this.E2.e, gm.L(50.0f), -this.q2);
            frameLayout.setTranslationY(U1);
            if (this.e0) {
                this.r.setTranslationY(U1);
            }
        }
    }

    public final void S() {
        s24 s24Var;
        boolean z;
        int x;
        boolean z2;
        int x2;
        int x3;
        int x4;
        int x5;
        int x6;
        int x7;
        int x8;
        int x9;
        jz3 jz3Var;
        int x10;
        int x11;
        int x12;
        int x13;
        int x14;
        int x15;
        boolean z3 = this.v0;
        View view = this.w;
        if (!z3) {
            setBackground(null);
            view.setBackground(null);
        } else if (!gm.E && !this.O1) {
            int i = cmb.yf;
            setBackgroundColor(x(i));
            if (this.e0) {
                view.setBackgroundColor(x(i));
            }
        } else {
            Drawable background = getBackground();
            int x16 = x(cmb.yf);
            if (background != null && (background != this.G2 || x16 != this.H2)) {
                this.G2 = background;
                this.H2 = x16;
                background.setColorFilter(new PorterDuffColorFilter(x16, PorterDuff.Mode.MULTIPLY));
            }
        }
        j14 j14Var = this.J;
        if (j14Var != null) {
            if (this.v0) {
                j14Var.setBackgroundColor(x(cmb.yf));
                this.P.setBackgroundColor(x(cmb.Bf));
            } else {
                j14Var.setBackground(null);
            }
        }
        rx3 rx3Var = this.C1;
        if (rx3Var != null) {
            rx3Var.c.a();
        }
        int i2 = 0;
        while (true) {
            s24Var = this.W;
            z = this.j2;
            if (i2 >= 3) {
                break;
            }
            if (i2 == 0) {
                s24Var = this.H0;
            } else if (i2 != 1) {
                s24Var = this.p0;
            }
            if (s24Var != null) {
                q24 q24Var = s24Var.d;
                FrameLayout frameLayout = s24Var.n;
                boolean z4 = this.v0;
                View view2 = s24Var.f;
                if (z4) {
                    view2.setBackgroundColor(x(cmb.yf));
                } else {
                    view2.setBackground(null);
                }
                s24Var.e.setBackgroundColor(x(cmb.Bf));
                mu9 mu9Var = s24Var.c;
                if (z) {
                    x12 = t(0.4f);
                } else {
                    x12 = x(cmb.Af);
                }
                mu9Var.a(x12);
                Drawable background2 = frameLayout.getBackground();
                if (z) {
                    x13 = t(0.06f);
                } else {
                    x13 = x(cmb.zf);
                }
                cmb.A1(x13, background2);
                frameLayout.invalidate();
                if (z) {
                    x14 = t(0.45f);
                } else {
                    x14 = x(cmb.Af);
                }
                q24Var.setHintTextColor(x14);
                if (z) {
                    x15 = t(0.8f);
                } else {
                    x15 = x(cmb.F6);
                }
                q24Var.setTextColor(x15);
            }
            i2++;
        }
        Paint paint = this.t1;
        if (paint != null) {
            paint.setColor(x(cmb.Rf));
        }
        r14 r14Var = this.Q;
        if (r14Var != null) {
            r14Var.setGlowColor(x(cmb.yf));
        }
        l04 l04Var = this.E0;
        if (l04Var != null) {
            l04Var.setGlowColor(x(cmb.yf));
        }
        q04 q04Var = this.C0;
        if (q04Var != null) {
            q04Var.setIndicatorColor(x(cmb.Hf));
            q04Var.setUnderlineColor(x(cmb.Bf));
            if (this.v0) {
                q04Var.setBackgroundColor(x(cmb.yf));
            } else {
                q04Var.setBackground(null);
            }
        }
        m14 m14Var = this.q0;
        if (m14Var != null) {
            m14Var.setIndicatorColor(x(cmb.Hf));
            m14Var.setUnderlineColor(x(cmb.Bf));
            if (this.v0) {
                m14Var.setBackgroundColor(x(cmb.yf));
            } else {
                m14Var.setBackground(null);
            }
        }
        if (z) {
            x = t(0.6f);
        } else {
            x = x(cmb.If);
        }
        if (x != this.I2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.I2 = x;
        t04 t04Var = this.y;
        if (t04Var != null) {
            if (z2) {
                t04Var.setColorFilter(new PorterDuffColorFilter(x, PorterDuff.Mode.MULTIPLY));
            }
            if (s24Var == null) {
                Drawable background3 = t04Var.getBackground();
                int i3 = cmb.yf;
                cmb.F1(background3, x(i3), false);
                cmb.F1(t04Var.getBackground(), x(i3), true);
            }
        }
        ImageView imageView = this.E;
        if (imageView != null && z2) {
            imageView.setColorFilter(new PorterDuffColorFilter(x, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.F;
        if (imageView2 != null && z2) {
            imageView2.setColorFilter(new PorterDuffColorFilter(x, PorterDuff.Mode.MULTIPLY));
        }
        wb wbVar = this.O0;
        if (wbVar != null) {
            if (wbVar.getBackground() instanceof ShapeDrawable) {
                ((ShapeDrawable) wbVar.getBackground()).getPaint().setColor(x(cmb.gg));
                wbVar.invalidate();
            }
            wbVar.setTextColor(x(cmb.fg));
        }
        j24 j24Var = this.k0;
        if (j24Var != null) {
            l24 l24Var = j24Var.e;
            int i4 = cmb.Cf;
            int x17 = x(i4);
            if (x17 != this.J2) {
                this.J2 = x17;
                l24Var.a.setColorFilter(new PorterDuffColorFilter(x17, PorterDuff.Mode.MULTIPLY));
            }
            l24Var.b.setTextColor(x(i4));
            l24Var.c.setProgressColor(x(cmb.g6));
        }
        int x18 = x(cmb.Ei);
        if (this.f2 == null || x18 != this.K2) {
            this.K2 = x18;
            this.f2 = new PorterDuffColorFilter(x18, PorterDuff.Mode.SRC_IN);
        }
        int i5 = 0;
        while (true) {
            Drawable[] drawableArr = this.Y0;
            if (i5 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i5];
            if (z) {
                x10 = t(0.4f);
            } else {
                x10 = x(cmb.Ef);
            }
            cmb.C1(drawable, x10, false);
            Drawable drawable2 = drawableArr[i5];
            if (z) {
                x11 = t(0.8f);
            } else {
                x11 = x(cmb.Ff);
            }
            cmb.C1(drawable2, x11, true);
            i5++;
        }
        if (j14Var != null && (jz3Var = j14Var.y) != null) {
            jz3Var.d();
        }
        int i6 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Z0;
            if (i6 >= drawableArr2.length) {
                break;
            }
            Drawable drawable3 = drawableArr2[i6];
            if (z) {
                x8 = t(0.4f);
            } else {
                x8 = x(cmb.Df);
            }
            cmb.C1(drawable3, x8, false);
            Drawable drawable4 = drawableArr2[i6];
            if (z) {
                x9 = t(0.8f);
            } else {
                x9 = x(cmb.Ff);
            }
            cmb.C1(drawable4, x9, true);
            i6++;
        }
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.a1;
            if (i7 >= drawableArr3.length) {
                break;
            }
            Drawable drawable5 = drawableArr3[i7];
            if (z) {
                x6 = t(0.4f);
            } else {
                x6 = x(cmb.Df);
            }
            cmb.C1(drawable5, x6, false);
            Drawable drawable6 = drawableArr3[i7];
            if (z) {
                x7 = t(0.8f);
            } else {
                x7 = x(cmb.Ff);
            }
            cmb.C1(drawable6, x7, true);
            i7++;
        }
        qlb qlbVar = this.b2;
        if (qlbVar != null) {
            if (z) {
                x4 = t(0.4f);
            } else {
                x4 = x(cmb.Ef);
            }
            cmb.C1(qlbVar, x4, false);
            if (z) {
                x5 = t(0.8f);
            } else {
                x5 = x(cmb.Ff);
            }
            cmb.C1(qlbVar, x5, true);
        }
        qlb qlbVar2 = this.c2;
        if (qlbVar2 != null) {
            if (z) {
                x2 = t(0.4f);
            } else {
                x2 = x(cmb.Hf);
            }
            cmb.C1(qlbVar2, x2, false);
            if (z) {
                x3 = t(0.8f);
            } else {
                x3 = x(cmb.Hf);
            }
            cmb.C1(qlbVar2, x3, true);
        }
    }

    public final void T() {
        r14 r14Var = this.Q;
        if (r14Var != null) {
            for (int i = 0; i < r14Var.getChildCount(); i++) {
                View childAt = r14Var.getChildAt(i);
                if (childAt instanceof w14) {
                    ((w14) childAt).a(true);
                }
            }
        }
    }

    public final void U(int i) {
        int i2;
        if (!this.g0) {
            int i3 = -1;
            if (i != -1) {
                int size = getRecentEmoji().size() + (this.e0 ? 1 : 0);
                o14 o14Var = this.S;
                int i4 = o14Var.c;
                ArrayList arrayList = o14Var.y;
                int i5 = 0;
                if (i4 >= 0) {
                    i2 = 3;
                } else {
                    i2 = 0;
                }
                int i6 = size + i2;
                if (i >= i6) {
                    int i7 = 0;
                    while (true) {
                        String[][] strArr = zx3.f;
                        if (i7 >= 8) {
                            break;
                        }
                        i6 += strArr[i7].length + 1;
                        if (i < i6) {
                            i3 = i7 + 1;
                            break;
                        }
                        i7++;
                    }
                    if (i3 < 0) {
                        ArrayList<s14> emojipacks = getEmojipacks();
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (((Integer) arrayList.get(size2)).intValue() <= i) {
                                s14 s14Var = (s14) this.r1.get(size2);
                                while (i5 < emojipacks.size()) {
                                    long j = emojipacks.get(i5).b.id;
                                    long j2 = s14Var.b.id;
                                    if (j == j2 && (!s14Var.g || (!s14Var.f && !this.q1.contains(Long.valueOf(j2))))) {
                                        char[] cArr = zx3.a;
                                        i5 = 9 + i5;
                                        break;
                                    }
                                    i5++;
                                }
                            } else {
                                size2--;
                            }
                        }
                    }
                    i5 = i3;
                }
                if (i5 >= 0) {
                    this.J.j(i5, true);
                }
            }
        }
    }

    public final void W() {
        boolean z;
        boolean z2;
        int i;
        r24 r24Var;
        int i2;
        boolean z3;
        boolean z4;
        m14 m14Var = this.q0;
        int currentPosition = m14Var.getCurrentPosition();
        int i3 = this.s0;
        if (currentPosition == i3) {
            z = true;
        } else {
            z = false;
        }
        if (i3 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean isEmpty = this.j1.isEmpty();
        m14Var.d(false);
        this.s0 = -2;
        this.t0 = -2;
        this.u0 = -2;
        Drawable[] drawableArr = this.a1;
        if (!isEmpty) {
            this.s0 = 0;
            m14Var.b(0, drawableArr[0]).setContentDescription(jb6.M0(2131746097, null));
            i = 1;
        } else {
            i = 0;
        }
        this.t0 = i;
        m14Var.b(1, drawableArr[1]).setContentDescription(jb6.M0(2131750771, null));
        this.u0 = i + 1;
        Typeface typeface = gm.a;
        int i4 = this.d1;
        ArrayList arrayList = oc7.r1(i4).x3;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            String str = (String) arrayList.get(i5);
            cw3 g = gw3.g(str);
            if (g != null) {
                TLRPC.Document V = hs6.d0(i4).V(str);
                String j = hg9.j(i5 + 3, "tab");
                int i6 = m14Var.y;
                m14Var.y = i6 + 1;
                y1b y1bVar = (y1b) m14Var.n.get(j);
                if (y1bVar != null) {
                    m14Var.g(j, y1bVar, i6);
                    i2 = currentPosition;
                    z3 = z2;
                } else {
                    i2 = currentPosition;
                    z3 = z2;
                    y1bVar = new y1b(m14Var.getContext(), 2);
                    y1bVar.setFocusable(true);
                    y1bVar.setOnClickListener(new wk8(m14Var, (byte) 16));
                    y1bVar.setExpanded(m14Var.g0);
                    y1bVar.a(m14Var.j0);
                    m14Var.e.addView(y1bVar, i6);
                }
                y1bVar.d = false;
                y1bVar.setTag(2131296463, Integer.valueOf(i6));
                y1bVar.setTag(2131296593, g);
                y1bVar.setTag(2131296587, V);
                if (i6 == m14Var.E) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                y1bVar.setSelected(z4);
                m14Var.h.put(j, y1bVar);
                y1bVar.setContentDescription(str);
            } else {
                i2 = currentPosition;
                z3 = z2;
            }
            i5++;
            currentPosition = i2;
            z2 = z3;
        }
        int i7 = currentPosition;
        boolean z5 = z2;
        m14Var.h();
        m14Var.q();
        if (z && isEmpty) {
            m14Var.m(this.t0);
            i04 i04Var = this.p0;
            if (i04Var != null && (r24Var = i04Var.r) != null) {
                r24Var.I1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = kfc.a;
        if (m14Var.isLaidOut()) {
            if (!isEmpty) {
                if (!z5) {
                    m14Var.k(i7 + 1, 0);
                }
            } else if (z5) {
                m14Var.k(i7 - 1, 0);
            }
        }
    }

    public final void X() {
        j24 j24Var;
        int size = this.j1.size();
        long p = hs6.p(Integer.MAX_VALUE, this.j1);
        ArrayList arrayList = new ArrayList(hs6.d0(this.d1).j0);
        this.j1 = arrayList;
        long p2 = hs6.p(Integer.MAX_VALUE, arrayList);
        if ((this.q0 != null && size == 0 && !this.j1.isEmpty()) || (size != 0 && this.j1.isEmpty())) {
            W();
        }
        if ((size != this.j1.size() || p != p2) && (j24Var = this.o0) != null) {
            j24Var.f();
        }
    }

    public final void Y(boolean z) {
        boolean z2;
        TLRPC.Document document;
        boolean z3;
        byte b;
        boolean z4;
        ylb ylbVar;
        boolean z5;
        boolean z6;
        ArrayList<TLRPC.Document> arrayList;
        boolean z7;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        int i;
        final q04 q04Var = this.C0;
        if (q04Var != null) {
            qmb qmbVar = q04Var.e;
            if (q04Var.s != null) {
                return;
            }
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.J1 = -2;
            final byte b2 = 0;
            this.f0 = false;
            this.F1 = 0;
            int currentPosition = q04Var.getCurrentPosition();
            if (getParent() != null && getVisibility() == 0 && (this.z1.size() != 0 || this.A1.size() != 0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            q04Var.d(z2);
            int i2 = this.d1;
            hs6 d0 = hs6.d0(i2);
            SharedPreferences sharedPreferences = oc7.r1(i2).Y3;
            ArrayList arrayList3 = this.n1;
            arrayList3.clear();
            ArrayList arrayList4 = d0.t0[0];
            int size = arrayList4.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList4.get(i3);
                if (!d0.D0(stickerSetCovered.set.id, true)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            c34 c34Var = this.G0;
            if (c34Var != null) {
                c34Var.f();
            }
            boolean isEmpty = arrayList4.isEmpty();
            long j = 0;
            Drawable[] drawableArr = this.Z0;
            ylb ylbVar2 = null;
            if (!isEmpty && (arrayList3.isEmpty() || sharedPreferences.getLong("featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id)) {
                if (d0.v0[0].isEmpty()) {
                    i = 2;
                } else {
                    i = 3;
                }
                y1b c = q04Var.c(i, drawableArr[i]);
                c.h.setText(jb6.M0(2131750768, null));
                c.setContentDescription(jb6.M0(2131750770, null));
                int i4 = this.F1;
                this.I1 = i4;
                this.F1 = i4 + 1;
            }
            if (!this.l1.isEmpty()) {
                int i5 = this.F1;
                this.H1 = i5;
                this.F1 = i5 + 1;
                y1b c2 = q04Var.c(1, drawableArr[1]);
                c2.h.setText(jb6.M0(2131750775, null));
                c2.setContentDescription(jb6.M0(2131750778, null));
            }
            if (!this.k1.isEmpty()) {
                int i6 = this.F1;
                this.G1 = i6;
                this.F1 = i6 + 1;
                y1b c3 = q04Var.c(0, drawableArr[0]);
                c3.h.setText(jb6.M0(2131746096, null));
                c3.setContentDescription(jb6.M0(2131746097, null));
            }
            ArrayList arrayList5 = this.e1;
            arrayList5.clear();
            this.i1 = null;
            this.g1 = -1;
            this.f1 = -10;
            ArrayList arrayList6 = this.F2;
            if (arrayList6 == null || z) {
                arrayList6 = new ArrayList(d0.t0(0));
                this.F2 = arrayList6;
            }
            int i7 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.y1;
                if (i7 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i7];
                long j2 = j;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet p0 = d0.p0(stickerSetCovered2.set.id);
                    if (p0 != null && (stickerSet = p0.set) != null && !stickerSet.archived) {
                        stickerSetCoveredArr[i7] = null;
                    } else {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = new TLRPC.TL_messages_stickerSet();
                        tL_messages_stickerSet.set = stickerSetCovered2.set;
                        TLRPC.Document document2 = stickerSetCovered2.cover;
                        if (document2 != null) {
                            tL_messages_stickerSet.documents.add(document2);
                        } else if (!stickerSetCovered2.covers.isEmpty()) {
                            tL_messages_stickerSet.documents.addAll(stickerSetCovered2.covers);
                        }
                        if (!tL_messages_stickerSet.documents.isEmpty()) {
                            arrayList5.add(tL_messages_stickerSet);
                        }
                    }
                }
                i7++;
                j = j2;
            }
            long j3 = j;
            ArrayList u0 = oc7.r1(i2).u0(arrayList6);
            for (int i8 = 0; i8 < u0.size(); i8++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) u0.get(i8);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList5.add(tL_messages_stickerSet2);
                }
            }
            if (this.K1 != null) {
                long j4 = oc7.r1(i2).Y3.getLong("group_hide_stickers_" + this.K1.id, -1L);
                TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(this.K1.id));
                if (L0 != null && this.K1.stickerset != null && sd2.N(L0)) {
                    TLRPC.StickerSet stickerSet3 = this.K1.stickerset;
                    if (stickerSet3 != null) {
                        if (j4 == stickerSet3.id) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        this.h1 = z7;
                    }
                } else {
                    if (j4 != -1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    this.h1 = z6;
                }
                TLRPC.ChatFull chatFull = this.K1;
                TLRPC.StickerSet stickerSet4 = chatFull.stickerset;
                if (stickerSet4 != null) {
                    TLRPC.TL_messages_stickerSet a0 = d0.a0(stickerSet4);
                    if (a0 != null && (arrayList = a0.documents) != null && !arrayList.isEmpty() && a0.set != null) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                        tL_messages_stickerSet3.documents = a0.documents;
                        tL_messages_stickerSet3.packs = a0.packs;
                        tL_messages_stickerSet3.set = a0.set;
                        if (this.h1) {
                            this.f1 = arrayList5.size();
                            arrayList5.add(tL_messages_stickerSet3);
                        } else {
                            this.f1 = 0;
                            arrayList5.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.K1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.i1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.h1) {
                        this.f1 = arrayList5.size();
                        arrayList5.add(tL_messages_stickerSet4);
                    } else {
                        this.f1 = 0;
                        arrayList5.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i9 = 0;
            while (i9 < arrayList5.size()) {
                if (i9 == this.f1) {
                    TLRPC.Chat L02 = oc7.r1(i2).L0(Long.valueOf(this.K1.id));
                    if (L02 == null) {
                        arrayList5.remove(b2);
                        i9--;
                    } else {
                        this.f0 = true;
                        String str = "chat" + L02.id;
                        int i10 = q04Var.y;
                        q04Var.y = i10 + 1;
                        y1b y1bVar = (y1b) q04Var.n.get(str);
                        if (y1bVar != null) {
                            q04Var.g(str, y1bVar, i10);
                        } else {
                            y1bVar = new y1b(q04Var.getContext(), b2);
                            y1bVar.setFocusable(true);
                            y1bVar.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    byte b3 = b2;
                                    q04 q04Var2 = q04Var;
                                    switch (b3) {
                                        case 0:
                                            q04Var2.f.a(((Integer) view.getTag(2131296463)).intValue());
                                            return;
                                        default:
                                            q04Var2.f.a(((Integer) view.getTag(2131296463)).intValue());
                                            return;
                                    }
                                }
                            });
                            qmbVar.addView(y1bVar, i10);
                            y1bVar.x = true;
                            pc0 pc0Var = new pc0(ylbVar2);
                            pc0Var.s(gm.L(14.0f));
                            pc0Var.p(L02);
                            int i11 = q04Var.a;
                            bf0 bf0Var = y1bVar.e;
                            bf0Var.setLayerNum(i11);
                            bf0Var.f(L02, pc0Var);
                            bf0Var.setAspectFit(true);
                            y1bVar.setExpanded(q04Var.g0);
                            y1bVar.a(q04Var.j0);
                            y1bVar.h.setText(L02.title);
                        }
                        y1bVar.d = true;
                        y1bVar.setTag(2131296463, Integer.valueOf(i10));
                        if (i10 == q04Var.E) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        y1bVar.setSelected(z5);
                        q04Var.h.put(str, y1bVar);
                    }
                    b = 0;
                    ylbVar = null;
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList5.get(i9);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j3) {
                        for (int i12 = 0; i12 < tL_messages_stickerSet5.documents.size(); i12++) {
                            document = tL_messages_stickerSet5.documents.get(i12);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.id) {
                                break;
                            }
                        }
                    }
                    document = null;
                    if (document == null) {
                        z3 = false;
                        document = tL_messages_stickerSet5.documents.get(0);
                    } else {
                        z3 = false;
                    }
                    Object w = bc4.w(tL_messages_stickerSet5.set.thumbs, 90, z3, null, z3);
                    if (w == null || tL_messages_stickerSet5.set.gifs) {
                        w = document;
                    }
                    String str2 = "set" + tL_messages_stickerSet5.set.id;
                    int i13 = q04Var.y;
                    q04Var.y = i13 + 1;
                    y1b y1bVar2 = (y1b) q04Var.n.get(str2);
                    if (y1bVar2 != null) {
                        q04Var.g(str2, y1bVar2, i13);
                    } else {
                        y1bVar2 = new y1b(q04Var.getContext(), 0);
                        y1bVar2.setFocusable(true);
                        y1bVar2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                byte b3 = b2;
                                q04 q04Var2 = q04Var;
                                switch (b3) {
                                    case 0:
                                        q04Var2.f.a(((Integer) view.getTag(2131296463)).intValue());
                                        return;
                                    default:
                                        q04Var2.f.a(((Integer) view.getTag(2131296463)).intValue());
                                        return;
                                }
                            }
                        });
                        y1bVar2.setExpanded(q04Var.g0);
                        y1bVar2.a(q04Var.j0);
                        qmbVar.addView(y1bVar2, i13);
                    }
                    y1bVar2.e.setLayerNum(q04Var.a);
                    b = 0;
                    y1bVar2.d = false;
                    y1bVar2.setTag(w);
                    y1bVar2.setTag(2131296463, Integer.valueOf(i13));
                    y1bVar2.setTag(2131296593, tL_messages_stickerSet5);
                    y1bVar2.setTag(2131296587, document);
                    if (i13 == q04Var.E) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    y1bVar2.setSelected(z4);
                    q04Var.h.put(str2, y1bVar2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(tL_messages_stickerSet5.set.title);
                    sb.append(", ");
                    ylbVar = null;
                    sb.append(jb6.M0(2131754756, null));
                    y1bVar2.setContentDescription(sb.toString());
                }
                i9++;
                b2 = b;
                ylbVar2 = ylbVar;
            }
            q04Var.h();
            q04Var.q();
            if (currentPosition != 0) {
                q04Var.k(currentPosition, currentPosition);
            }
            l();
        }
    }

    public final void Z() {
        boolean z;
        int i;
        r04 r04Var = this.D0;
        q04 q04Var = this.C0;
        if (q04Var != null && r04Var == null && this.u1 != null) {
            q04Var.setTranslationY(this.u1.o() * (-gm.L(50.0f)));
        }
        if (r04Var == null) {
            return;
        }
        if (getVisibility() == 0 && this.L0 && this.u1.o() != 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        r04Var.setVisibility(i);
        if (z) {
            Rect rect = this.y2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.y0, rect, null);
            float o = this.u1.o() * gm.L(50.0f);
            int i2 = rect.left;
            if (i2 != 0 || o != 0.0f) {
                this.Y1 = false;
            }
            r04Var.setTranslationX(i2);
            float translationY = (((getTranslationY() + getTop()) - r04Var.getTop()) - q04Var.getExpandedOffset()) - o;
            if (r04Var.getTranslationY() != translationY) {
                r04Var.setTranslationY(translationY);
                r04Var.invalidate();
            }
        }
        if (this.Y1 && z && this.Q0) {
            q04Var.i(true, this.X1);
            return;
        }
        this.Y1 = false;
        q04Var.i(false, this.X1);
    }

    @Override
    public final void a(int i) {
        setBottomInset(i);
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e34.a0():void");
    }

    @Override
    public final void b(float f) {
        this.r2 = f;
        R();
    }

    public final void d(String str) {
        if (str != null) {
            if (str.startsWith("animated_") || gw3.h(str)) {
                gw3.a(str);
                int i = 0;
                if (getVisibility() != 0 || this.h.getCurrentItem() != 0) {
                    gw3.s();
                    this.S.F(false);
                }
                gw3.r();
                if (!this.d2) {
                    ArrayList arrayList = this.B2;
                    if (arrayList == null) {
                        this.B2 = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    while (true) {
                        ArrayList arrayList2 = gw3.i;
                        if (i < arrayList2.size()) {
                            if (!((String) arrayList2.get(i)).startsWith("animated_")) {
                                this.B2.add((String) arrayList2.get(i));
                            }
                            i++;
                        } else {
                            this.C2 = this.B2.size();
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        qac qacVar;
        TLRPC.StickerSet stickerSet;
        int i3 = nm7.x0;
        o14 o14Var = this.S;
        vz3 vz3Var = this.R2;
        if (i == i3) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.z0 != null) {
                    Y(((Boolean) objArr[1]).booleanValue());
                    a0();
                    B();
                    l();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    gm.r(vz3Var);
                    gm.d3(vz3Var, 100L);
                    return;
                }
                o14Var.F(false);
            }
        } else if (i == nm7.s3) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.K1;
            if (chatFull != null && chatFull.id == longValue && booleanValue) {
                o14Var.F(true);
            }
        } else if (i == nm7.X0) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                g(booleanValue2);
            }
        } else if (i == nm7.z0) {
            a0();
            tt7 tt7Var = this.x;
            if (tt7Var != null) {
                int childCount = tt7Var.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    tt7Var.getChildAt(i4).invalidate();
                }
            }
            Y(false);
        } else if (i == nm7.A0) {
            if (o14Var != null) {
                o14Var.F(false);
            }
        } else {
            int i5 = nm7.B0;
            e24 e24Var = this.T;
            if (i == i5) {
                Long l = (Long) objArr[0];
                long longValue2 = l.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    z24 z24Var = this.A0;
                    if (z24Var != null && z24Var.d == longValue2 && z24Var.f.size() < tL_messages_stickerSet.documents.size()) {
                        z24Var.f = tL_messages_stickerSet.documents;
                        z24Var.f();
                    }
                    if (e24Var != null && e24Var.d == longValue2 && e24Var.f.size() < tL_messages_stickerSet.documents.size()) {
                        e24Var.f = tL_messages_stickerSet.documents;
                        e24Var.f();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.K1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.id == longValue2) {
                    Y(false);
                }
                HashMap hashMap = this.s1;
                if (hashMap.containsKey(l) && objArr.length >= 2 && ((qac) hashMap.get(l)) != null && tL_messages_stickerSet != null && (qacVar = (qac) hashMap.remove(l)) != null) {
                    qacVar.a(tL_messages_stickerSet);
                }
                gm.r(vz3Var);
                gm.d3(vz3Var, 100L);
                return;
            }
            int i6 = nm7.m4;
            r14 r14Var = this.Q;
            if (i == i6) {
                l04 l04Var = this.E0;
                if (l04Var != null) {
                    int childCount2 = l04Var.getChildCount();
                    for (int i7 = 0; i7 < childCount2; i7++) {
                        View childAt = l04Var.getChildAt(i7);
                        if ((childAt instanceof w1b) || (childAt instanceof y0b)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (r14Var != null) {
                    r14Var.invalidate();
                    int childCount3 = r14Var.getChildCount();
                    for (int i8 = 0; i8 < childCount3; i8++) {
                        View childAt2 = r14Var.getChildAt(i8);
                        if (childAt2 instanceof n24) {
                            childAt2.invalidate();
                        }
                    }
                }
                rx3 rx3Var = this.C1;
                if (rx3Var != null) {
                    rx3Var.c.invalidate();
                }
                m14 m14Var = this.q0;
                if (m14Var != null) {
                    qmb qmbVar = m14Var.e;
                    int childCount4 = qmbVar.getChildCount();
                    for (int i9 = 0; i9 < childCount4; i9++) {
                        qmbVar.getChildAt(i9).invalidate();
                    }
                }
            } else if (i == nm7.L2) {
                if (r14Var != null && this.e0) {
                    if ((this.W.c.k == 2 || r14Var.getAdapter() == e24Var) && !TextUtils.isEmpty(e24Var.w)) {
                        e24Var.E(e24Var.w, true);
                    }
                }
            } else if (i == nm7.j5) {
                if (o14Var != null) {
                    o14Var.F(false);
                }
                T();
                Y(false);
            }
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        R();
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.h) {
            canvas.save();
            if (this.n.getVisibility() != 8 && !this.v0 && this.x0) {
                canvas.drawColor(on2.p(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j);
            float Q0 = gm.Q0(this.q2);
            if (Q0 > 0.0f) {
                int p1 = cmb.p1(Q0, x(cmb.yf));
                int i = this.A2;
                GradientDrawable gradientDrawable = this.z2;
                if (i != p1) {
                    gradientDrawable.setColors(new int[]{p1, cmb.p1(0.66f, p1), on2.p(p1, 0)});
                    this.A2 = p1;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.q2, getMeasuredWidth(), getMeasuredHeight());
                gradientDrawable.draw(canvas);
            }
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(int i, int i2, boolean z) {
        if (i == 2 || v(i).K(0) == null) {
            return;
        }
        c14 c14Var = new c14(getContext(), i2);
        c14Var.a = !z ? 1 : 0;
        u(i).v0(c14Var);
    }

    public final void g(boolean z) {
        if (z) {
            X();
            return;
        }
        int size = this.k1.size();
        int size2 = this.l1.size();
        int i = this.d1;
        this.k1 = hs6.d0(i).j0(0, true);
        this.l1 = hs6.d0(i).j0(2, false);
        if (z8c.h(i).p()) {
            this.m1 = hs6.d0(i).j0(7, false);
        } else {
            this.m1 = new ArrayList();
        }
        for (int i2 = 0; i2 < this.l1.size(); i2++) {
            TLRPC.Document document = (TLRPC.Document) this.l1.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < this.k1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.k1.get(i3);
                    if (document2.dc_id == document.dc_id && document2.id == document.id) {
                        this.k1.remove(i3);
                        break;
                    }
                    i3++;
                }
            }
        }
        if (oc7.r1(i).H3()) {
            int i4 = 0;
            while (i4 < this.l1.size()) {
                if (k47.W3((TLRPC.Document) this.l1.get(i4))) {
                    this.l1.remove(i4);
                    i4--;
                }
                i4++;
            }
            int i5 = 0;
            while (i5 < this.k1.size()) {
                if (k47.W3((TLRPC.Document) this.k1.get(i5))) {
                    this.k1.remove(i5);
                    i5--;
                }
                i5++;
            }
        }
        if (size != this.k1.size() || size2 != this.l1.size()) {
            Y(false);
        }
        w24 w24Var = this.z0;
        if (w24Var != null) {
            w24Var.f();
        }
        l();
    }

    public int getCurrentPage() {
        return this.B1;
    }

    public ArrayList<s14> getEmojipacks() {
        ArrayList<s14> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.r1;
            if (i < arrayList2.size()) {
                s14 s14Var = (s14) arrayList2.get(i);
                boolean z = s14Var.g;
                ArrayList arrayList3 = this.q1;
                if ((!z && (s14Var.f || arrayList3.contains(Long.valueOf(s14Var.b.id)))) || (s14Var.g && !s14Var.f && !arrayList3.contains(Long.valueOf(s14Var.b.id)))) {
                    arrayList.add(s14Var);
                }
                i++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.d2) {
            return gw3.i;
        }
        if (this.B2 == null) {
            this.B2 = new ArrayList();
        }
        if (gw3.i.size() != this.C2) {
            this.B2.clear();
            int i = 0;
            while (true) {
                ArrayList arrayList = gw3.i;
                if (i >= arrayList.size()) {
                    break;
                }
                if (!((String) arrayList.get(i)).startsWith("animated_")) {
                    this.B2.add((String) arrayList.get(i));
                }
                i++;
            }
            this.C2 = this.B2.size();
        }
        return this.B2;
    }

    public float getStickersExpandOffset() {
        q04 q04Var = this.C0;
        if (q04Var == null) {
            return 0.0f;
        }
        return q04Var.getExpandedOffset();
    }

    public final void h(boolean z) {
        int i;
        boolean z2;
        f24 f24Var = this.u1;
        fn0 fn0Var = this.b;
        r14 r14Var = this.Q;
        d04 d04Var = this.W;
        if (f24Var != null && f24Var.z()) {
            u69 K = r14Var.K(0);
            if (K == null) {
                d04Var.e(true, !z);
            } else {
                if (K.a.getTop() < r14Var.getPaddingTop()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                d04Var.e(z2, !z);
            }
            M(false, !z);
            d04Var.setTranslationY(fn0Var.e * gm.L(15.0f));
        } else if (d04Var != null && r14Var != null) {
            u69 K2 = r14Var.K(0);
            if (K2 != null) {
                i = K2.a.getTop();
            } else {
                i = -this.c1;
            }
            d04Var.setTranslationY((fn0Var.e * gm.L(15.0f)) + i);
            d04Var.e(false, !z);
            i(Math.round(this.J.getTranslationY()));
        }
    }

    public final void i(int i) {
        ObjectAnimator objectAnimator = this.S0[1];
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        boolean z = false;
        u69 K = this.Q.K(0);
        int L = gm.L(38.0f) + i;
        if (L > 0 && (K == null || K.a.getBottom() < L)) {
            z = true;
        }
        M(z, !this.L1);
    }

    public final void j(int i, View view) {
        r14 r14Var;
        u69 K;
        int i2;
        j14 j14Var = this.J;
        int[] iArr = this.R0;
        if (view == null) {
            iArr[1] = 0;
            j14Var.setTranslationY(0.0f);
        } else if (view.getVisibility() == 0 && !this.g0) {
            f24 f24Var = this.u1;
            if (f24Var == null || !f24Var.z()) {
                if (i > 0 && (r14Var = this.Q) != null && r14Var.getVisibility() == 0 && (K = r14Var.K(0)) != null) {
                    int top = K.a.getTop();
                    if (this.e0) {
                        i2 = this.c1;
                    } else {
                        i2 = 0;
                    }
                    if (top + i2 >= r14Var.getPaddingTop()) {
                        return;
                    }
                }
                int i3 = iArr[1] - i;
                iArr[1] = i3;
                if (i3 > 0) {
                    iArr[1] = 0;
                } else if (i3 < (-gm.L(108.0f))) {
                    iArr[1] = -gm.L(108.0f);
                }
                j14Var.setTranslationY(Math.max(-gm.L(36.0f), iArr[1]));
            }
        }
    }

    public final void k(boolean z) {
        k24 k24Var;
        int M0;
        g04 g04Var = this.i0;
        if (g04Var != null && (g04Var.getAdapter() instanceof j24)) {
            j24 j24Var = (j24) g04Var.getAdapter();
            if (!j24Var.s && j24Var.h == 0 && !j24Var.y.isEmpty() && (M0 = (k24Var = this.j0).M0()) != -1 && M0 > k24Var.A() - 5) {
                String str = j24Var.x;
                String str2 = j24Var.r;
                boolean z2 = j24Var.w;
                j24Var.F(str, str2, true, z2, z2);
            }
        }
        f24 f24Var = this.u1;
        i04 i04Var = this.p0;
        if (f24Var != null && f24Var.z()) {
            boolean z3 = false;
            u69 K = g04Var.K(0);
            if (K == null) {
                i04Var.e(true, !z);
                return;
            }
            if (K.a.getTop() < g04Var.getPaddingTop()) {
                z3 = true;
            }
            i04Var.e(z3, !z);
        } else if (i04Var != null && g04Var != null) {
            i04Var.e(true, !z);
        }
    }

    public final void l() {
        int K0;
        q04 q04Var = this.C0;
        if (q04Var != null && (K0 = this.F0.K0()) != -1) {
            int i = this.H1;
            if (i <= 0 && (i = this.G1) <= 0) {
                i = this.F1;
            }
            q04Var.k(this.z0.F(K0), i);
        }
    }

    public final void m(int i) {
        int K0;
        int i2;
        int K02;
        if (i == 0) {
            if (!this.K0 && (K02 = this.F0.K0()) != -1 && this.E0 != null) {
                int i3 = this.H1;
                if (i3 <= 0 && (i3 = this.G1) <= 0) {
                    i3 = this.F1;
                }
                this.C0.k(this.z0.F(K02), i3);
            }
        } else if (i == 2) {
            y59 adapter = this.i0.getAdapter();
            j24 j24Var = this.o0;
            if (adapter == j24Var && j24Var.J >= 0 && this.t0 >= 0 && this.s0 >= 0 && (K0 = this.j0.K0()) != -1) {
                if (K0 >= j24Var.J) {
                    i2 = this.t0;
                } else {
                    i2 = this.s0;
                }
                this.q0.k(i2, 0);
            }
        }
    }

    public final void n(boolean z) {
        int i;
        f24 f24Var = this.u1;
        fn0 fn0Var = this.a;
        l04 l04Var = this.E0;
        boolean z2 = false;
        p04 p04Var = this.H0;
        if (f24Var != null && f24Var.z()) {
            u69 K = l04Var.K(0);
            if (K == null) {
                p04Var.e(true, !z);
            } else {
                if (K.a.getTop() < l04Var.getPaddingTop()) {
                    z2 = true;
                }
                p04Var.e(z2, !z);
            }
            p04Var.setTranslationY(fn0Var.e * gm.L(15.0f));
        } else if (p04Var != null && l04Var != null) {
            u69 K2 = l04Var.K(0);
            if (K2 != null) {
                i = K2.a.getTop();
            } else {
                i = -this.c1;
            }
            p04Var.setTranslationY((fn0Var.e * gm.L(15.0f)) + i);
            p04Var.e(false, !z);
        }
    }

    public final void o(int i, int i2) {
        u69 K;
        if (i == 1) {
            j(i2, this.Q);
            return;
        }
        f24 f24Var = this.u1;
        if ((f24Var == null || !f24Var.z()) && !this.K0) {
            r59 v = v(i);
            if (i2 > 0 && v != null && v.getVisibility() == 0 && (K = v.K(0)) != null && K.a.getTop() + this.c1 >= v.getPaddingTop()) {
                return;
            }
            int[] iArr = this.R0;
            int i3 = iArr[i] - i2;
            iArr[i] = i3;
            if (i3 > 0) {
                iArr[i] = 0;
            } else if (i3 < (-gm.L(288.0f))) {
                iArr[i] = -gm.L(288.0f);
            }
            if (i == 0) {
                Z();
            } else {
                w(i).setTranslationY(Math.max(-gm.L(48.0f), iArr[i]));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e7a e7aVar = this.M2;
        if (e7aVar != null) {
            e7aVar.a();
            this.M2 = null;
        }
        e7a e7aVar2 = (e7a) new ov0(nm7.f(this.d1), this).b;
        e7aVar2.e(nm7.m4);
        e7aVar2.b(nm7.L2);
        e7aVar2.b(nm7.s3);
        this.M2 = e7aVar2;
        if (this.z0 != null) {
            e7aVar2.b(nm7.x0);
            e7aVar2.b(nm7.X0);
            e7aVar2.b(nm7.z0);
            e7aVar2.b(nm7.B0);
            e7aVar2.b(nm7.j5);
            gm.c3(new vz3(this, (byte) 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rx3 rx3Var = this.C1;
        if (rx3Var != null && rx3Var.isShowing()) {
            rx3Var.dismiss();
        }
        hx2 e = hx2.e();
        if (e.l == this.h2) {
            e.W = null;
            e.a0 = null;
            e.Y = null;
            e.l = null;
            e.c0 = null;
            e.j();
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        if (this.P1 != i5) {
            this.P1 = i5;
            B();
        }
        super.onLayout(z, i, i2, i3, i4);
        R();
        Z();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.L1 = true;
        boolean z = gm.E;
        View view = this.w;
        boolean z2 = this.e0;
        if (!z && !this.O1) {
            if (this.M1 != 0) {
                if (!this.L2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.v0) {
                    int i3 = cmb.yf;
                    setBackgroundColor(x(i3));
                    if (z2) {
                        view.setBackgroundColor(x(i3));
                    }
                }
                this.M1 = 0;
            }
        } else if (this.M1 != 1) {
            if (!this.L2) {
                setOutlineProvider(this.N1);
                setClipToOutline(true);
                setElevation(gm.L(2.0f));
            }
            setBackgroundResource(2131232755);
            Drawable background = getBackground();
            int i4 = cmb.yf;
            background.setColorFilter(new PorterDuffColorFilter(x(i4), PorterDuff.Mode.MULTIPLY));
            if (z2 && this.v0) {
                view.setBackgroundColor(x(i4));
            }
            this.M1 = 1;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        this.L1 = false;
        setTranslationY(getTranslationY());
    }

    public final void p() {
        HashMap hashMap = gw3.a;
        oc7.c1().edit().putBoolean("filled_default", true).commit();
        gw3.h.clear();
        gw3.i.clear();
        gw3.r();
        this.S.F(false);
    }

    public final void q(long j, boolean z) {
        s24 s24Var;
        u46 u46Var;
        View view;
        r59 r59Var;
        int i;
        int i2;
        TLRPC.TL_messages_stickerSet p0;
        w24 w24Var;
        int E;
        AnimatorSet animatorSet = this.N0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i3 = 2;
        if (currentItem == 2 && j != -1 && (p0 = hs6.d0(this.d1).p0(j)) != null && (E = (w24Var = this.z0).E(p0)) >= 0 && E < w24Var.b()) {
            F(E, gm.L(48.0f));
        }
        int i4 = 0;
        j24 j24Var = this.k0;
        if (j24Var != null) {
            j24Var.L = false;
        }
        int i5 = 0;
        while (i5 < 3) {
            r59 r59Var2 = this.E0;
            r59 r59Var3 = this.i0;
            i04 i04Var = this.p0;
            r59 r59Var4 = this.Q;
            if (i5 == 0) {
                s24Var = this.W;
                u46Var = this.R;
                view = this.J;
                r59Var = r59Var4;
            } else if (i5 == 1) {
                u46Var = this.j0;
                view = this.q0;
                r59Var = r59Var3;
                s24Var = i04Var;
            } else {
                s24Var = this.H0;
                u46Var = this.F0;
                view = this.C0;
                r59Var = r59Var2;
            }
            if (s24Var == null) {
                i2 = i4;
                i = i3;
            } else {
                int i6 = i4;
                r24 r24Var = s24Var.r;
                int i7 = i3;
                s24Var.d.setText("");
                if (r24Var != null) {
                    r24Var.I1(null);
                    r24Var.G1();
                }
                int i8 = this.c1;
                if (i5 == currentItem && z) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.N0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view != null && i5 != 1) {
                        float[] fArr = new float[1];
                        fArr[i6] = 0.0f;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                        float[] fArr2 = new float[1];
                        fArr2[i6] = gm.L(36.0f);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r59Var, property, fArr2);
                        float[] fArr3 = new float[1];
                        fArr3[i6] = gm.L(36.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(s24Var, property, fArr3);
                        Animator[] animatorArr = new Animator[3];
                        animatorArr[i6] = ofFloat;
                        animatorArr[1] = ofFloat2;
                        animatorArr[i7] = ofFloat3;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        float[] fArr4 = new float[1];
                        fArr4[i6] = gm.L(36.0f) - i8;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(r59Var, property, fArr4);
                        Animator[] animatorArr2 = new Animator[1];
                        animatorArr2[i6] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.N0.setDuration(200L);
                    this.N0.setInterpolator(d53.h);
                    this.N0.addListener(new i8(this, u46Var, r59Var, (byte) 6));
                    this.N0.start();
                    i2 = i6;
                    i = i7;
                } else {
                    if (s24Var != i04Var) {
                        s24Var.setTranslationY(gm.L(36.0f) - i8);
                    }
                    i = i7;
                    if (view != null && i5 != i) {
                        view.setTranslationY(0.0f);
                    }
                    if (r59Var == r59Var2) {
                        i2 = i6;
                        r59Var.setPadding(i2, gm.L(36.0f), i2, gm.L(44.0f) + this.q2);
                    } else {
                        i2 = i6;
                        if (r59Var == r59Var3) {
                            r59Var.setPadding(i2, gm.L(40.0f), i2, gm.L(44.0f) + this.q2);
                        } else {
                            if (r59Var == r59Var4) {
                                r59Var.setPadding(gm.L(5.0f), gm.L(36.0f), gm.L(5.0f), gm.L(44.0f) + this.q2);
                            }
                            i2 = 0;
                        }
                    }
                    u46Var.g1(i2, i2);
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        int i9 = i4;
        if (!z) {
            this.u1.j(i9);
        }
    }

    public final void r(boolean z) {
        q(-1L, z);
    }

    @Override
    public final void requestLayout() {
        if (this.L1) {
            return;
        }
        super.requestLayout();
    }

    public final void s(boolean z) {
        w24 w24Var;
        boolean z2 = this.T2;
        this.T2 = z;
        if (z2 && !z) {
            int i = this.B1;
            if (i == 0) {
                o14 o14Var = this.S;
                if (o14Var != null) {
                    o14Var.F(false);
                }
            } else if (i == 1) {
                j24 j24Var = this.o0;
                if (j24Var != null) {
                    j24Var.f();
                }
            } else if (i == 2 && (w24Var = this.z0) != null) {
                w24Var.f();
            }
        }
    }

    public void setBlurredBackgroundDrawableFactory(km0 km0Var) {
        ylb ylbVar = this.a2;
        View view = this.y;
        if (view != null) {
            im0 c = km0Var.c(view, null, false);
            c.p(qqd.e(ylbVar));
            c.r(gm.L(18.0f));
            c.q(gm.L(6.0f));
            view.setBackground(c);
        }
        View view2 = this.F;
        if (view2 != null) {
            im0 c2 = km0Var.c(view2, null, false);
            c2.p(qqd.e(ylbVar));
            c2.r(gm.L(18.0f));
            c2.q(gm.L(6.0f));
            view2.setBackground(c2);
        }
        View view3 = this.x;
        if (view3 != null) {
            im0 c3 = km0Var.c(view3, null, false);
            c3.p(qqd.e(ylbVar));
            c3.r(gm.L(18.0f));
            c3.q(gm.L(6.0f));
            view3.setBackground(c3);
        }
        View view4 = this.E;
        if (view4 != null) {
            im0 c4 = km0Var.c(view4, null, false);
            c4.p(qqd.e(ylbVar));
            c4.r(gm.L(18.0f));
            c4.q(gm.L(6.0f));
            view4.setBackground(c4);
        }
    }

    public void setBottomInset(int i) {
        if (this.q2 != i) {
            this.q2 = i;
            f(i, this.L);
            f(i, this.N);
            f(gm.L(44.0f) + i, this.Q);
            f(gm.L(44.0f) + i, this.E0);
            f(gm.L(44.0f) + i, this.i0);
            FrameLayout frameLayout = this.s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i);
            }
            R();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.K1 = chatFull;
        Y(false);
    }

    public void setDelegate(f24 f24Var) {
        this.u1 = f24Var;
    }

    public void setDragListener(l14 l14Var) {
        this.P0 = l14Var;
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        p04 p04Var = this.H0;
        if (p04Var != null) {
            p04Var.d.setEnabled(z);
        }
        i04 i04Var = this.p0;
        if (i04Var != null) {
            i04Var.d.setEnabled(z);
        }
        d04 d04Var = this.W;
        if (d04Var != null) {
            d04Var.d.setEnabled(z);
        }
    }

    public void setForseMultiwindowLayout(boolean z) {
        this.O1 = z;
    }

    public void setShouldDrawBackground(boolean z) {
        if (this.v0 != z) {
            this.v0 = z;
            updateColors();
        }
    }

    public void setShowing(boolean z) {
        this.Q0 = z;
        Z();
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        Z();
        R();
    }

    @Override
    public void setVisibility(int i) {
        boolean z;
        if (getVisibility() != i) {
            z = true;
        } else {
            z = false;
        }
        super.setVisibility(i);
        if (z) {
            if (i != 8) {
                gw3.s();
                this.S.F(false);
                e7a e7aVar = this.N2;
                int i2 = this.d1;
                if (e7aVar == null) {
                    e7aVar = (e7a) new ov0(nm7.f(i2), this).b;
                    e7aVar.b(nm7.x0);
                    this.N2 = e7aVar;
                }
                if (this.z0 != null) {
                    if (!this.O2) {
                        this.O2 = true;
                        e7aVar.b(nm7.X0);
                    }
                    Y(false);
                    B();
                }
                g(true);
                g(false);
                hs6.d0(i2).X0(true, true, false, 0);
                hs6.d0(i2).X0(false, true, false, 0);
                hs6.d0(i2).X0(false, true, false, 2);
            }
            w04 w04Var = this.U0;
            if (w04Var != null) {
                w04Var.a();
            }
        }
    }

    public final int t(float f) {
        return on2.p(cmb.v0(cmb.Ml, this.a2), (int) (f * 255.0f));
    }

    public final q55 u(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return this.j0;
                }
                u36.j(hg9.j(i, "Unexpected argument: "));
                return null;
            }
            return this.R;
        }
        return this.F0;
    }

    @Override
    public final void updateColors() {
        try {
            S();
            kz4 kz4Var = this.m2;
            if (kz4Var != null) {
                kz4Var.a(x(cmb.c6));
            }
            tt7 tt7Var = this.x;
            if (tt7Var != null) {
                tt7Var.setIndicatorColor(on2.p(x(cmb.Ff), 20));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final r59 v(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return this.i0;
                }
                u36.j(hg9.j(i, "Unexpected argument: "));
                return null;
            }
            return this.Q;
        }
        return this.E0;
    }

    public final HorizontalScrollView w(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return this.q0;
                }
                u36.j(hg9.j(i, "Unexpected argument: "));
                return null;
            }
            return this.J;
        }
        return this.C0;
    }

    public final int x(int i) {
        ylb ylbVar = this.a2;
        if (ylbVar != null) {
            return ylbVar.h(i);
        }
        return cmb.w0(null, i, false);
    }

    public final void y() {
        p04 p04Var = this.H0;
        if (p04Var != null) {
            p04Var.a();
        }
        i04 i04Var = this.p0;
        if (i04Var != null) {
            i04Var.a();
        }
        d04 d04Var = this.W;
        if (d04Var != null) {
            d04Var.a();
        }
    }

    public final void z() {
        e7a e7aVar = this.M2;
        if (e7aVar != null) {
            e7aVar.a();
            this.M2 = null;
        }
        e7a e7aVar2 = this.N2;
        if (e7aVar2 != null) {
            e7aVar2.a();
            this.N2 = null;
            this.O2 = false;
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void V(float f, int i) {
    }
}
