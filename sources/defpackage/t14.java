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
public class t14 extends FrameLayout implements tjb, x74, gk7, cn5 {
    public static final int U2 = 0;
    public final o14 A0;
    public final LongSparseArray A1;
    public int A2;
    public final py3 B0;
    public int B1;
    public ArrayList B2;
    public final gz3 C0;
    public final gw3 C1;
    public int C2;
    public final hz3 D0;
    public final int D1;
    public long D2;
    public final ImageView E;
    public final bz3 E0;
    public final int[] E1;
    public final fm0 E2;
    public final ImageView F;
    public final cz3 F0;
    public int F1;
    public ArrayList F2;
    public AnimatorSet G;
    public r14 G0;
    public int G1;
    public Drawable G2;
    public AnimatorSet H;
    public final fz3 H0;
    public int H1;
    public int H2;
    public float I;
    public final wm4 I0;
    public int I1;
    public int I2;
    public final yz3 J;
    public boolean J0;
    public int J1;
    public int J2;
    public final tz3 K;
    public boolean K0;
    public TLRPC.ChatFull K1;
    public int K2;
    public final st L;
    public boolean L0;
    public boolean L1;
    public boolean L2;
    public final um4 M;
    public final n04 M0;
    public int M1;
    public wtc M2;
    public final st N;
    public AnimatorSet N0;
    public final nj9 N1;
    public wtc N2;
    public final um4 O;
    public final wb O0;
    public boolean O1;
    public boolean O2;
    public final View P;
    public a04 P0;
    public int P1;
    public AnimatorSet P2;
    public final g04 Q;
    public boolean Q0;
    public boolean Q1;
    public sy3 Q2;
    public final uz3 R;
    public final int[] R0;
    public boolean R1;
    public final ly3 R2;
    public final d04 S;
    public final ObjectAnimator[] S0;
    public c14 S1;
    public boolean S2;
    public final t04 T;
    public boolean T0;
    public float T1;
    public boolean T2;
    public r14 U;
    public mz3 U0;
    public float U1;
    public final wm4 V;
    public boolean V0;
    public float V1;
    public final ty3 W;
    public boolean W0;
    public float W1;
    public String[] X0;
    public float X1;
    public final Drawable[] Y0;
    public boolean Y1;
    public final Drawable[] Z0;
    public final d Z1;
    public final fm0 a;
    public AnimatorSet a0;
    public final Drawable[] a1;
    public final wjb a2;
    public final fm0 b;
    public final cu6 b0;
    public final String[] b1;
    public final ojb b2;
    public int c;
    public final cu6 c0;
    public final int c1;
    public final ojb c2;
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
    public final ez3 g2;
    public final iz3 h;
    public final vy3 h0;
    public boolean h1;
    public final pz3 h2;
    public final wy3 i0;
    public TLRPC.TL_messages_stickerSet i1;
    public boolean i2;
    public final z04 j0;
    public ArrayList j1;
    public final boolean j2;
    public final y04 k0;
    public ArrayList k1;
    public final cq3 k2;
    public final b14 l0;
    public ArrayList l1;
    public final vw0 l2;
    public final HashMap m0;
    public ArrayList m1;
    public final ix4 m2;
    public final FrameLayout n;
    public final py3 n0;
    public final ArrayList n1;
    public final qw4 n2;
    public final y04 o0;
    public final ArrayList o1;
    public boolean o2;
    public final yy3 p0;
    public final ArrayList p1;
    public boolean p2;
    public final b04 q0;
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
    public u04 u1;
    public int u2;
    public boolean v0;
    public long v1;
    public long v2;
    public final View w;
    public boolean w0;
    public boolean w1;
    public boolean w2;
    public final sr7 x;
    public boolean x0;
    public boolean x1;
    public boolean x2;
    public final jz3 y;
    public final zy3 y0;
    public final TLRPC.StickerSetCovered[] y1;
    public final Rect y2;
    public final l14 z0;
    public final LongSparseArray z1;
    public final GradientDrawable z2;

    public t14(d dVar, boolean z, boolean z2, boolean z3, Context context, boolean z4, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z5, final wjb wjbVar, boolean z6, boolean z7) {
        super(context);
        int y;
        int y2;
        int y3;
        int y4;
        int y5;
        int y6;
        int y7;
        int y8;
        int y9;
        int y10;
        int y11;
        int y12;
        int y13;
        int y14;
        int y15;
        int y16;
        int y17;
        int y18;
        qw4 qw4Var;
        boolean z8;
        Field field;
        d04 d04Var;
        boolean z9;
        boolean z10;
        kl0 kl0Var;
        int i;
        s33 s33Var = s33.h;
        this.a = new fm0(0, this, s33Var, 320L, false);
        this.b = new fm0(1, this, s33Var, 320L, false);
        this.c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.d0 = true;
        this.l0 = new b14(this);
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
        int i2 = y6c.t0;
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
        this.g2 = new ez3(this, (byte) 0);
        this.h2 = new pz3(this);
        this.i2 = true;
        qw4 qw4Var2 = new qw4();
        this.n2 = qw4Var2;
        this.r2 = -1.0f;
        this.t2 = -1;
        this.u2 = -1;
        this.v2 = -1L;
        this.w2 = false;
        this.x2 = true;
        this.y2 = new Rect();
        this.z2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.E2 = new fm0(0, new my3(this, (byte) 3), s33Var, 380L, true);
        this.R2 = new ly3(this, (byte) 1);
        this.S2 = false;
        this.v0 = z5;
        this.Z1 = dVar;
        this.d2 = z;
        this.a2 = wjbVar;
        this.j2 = z7;
        ix4 ix4Var = new ix4();
        this.m2 = ix4Var;
        ix4Var.a(y(bkb.c6));
        if (z6) {
            t(true);
        }
        bm2.o(y(bkb.Ml), 30);
        int L = gl.L(50.0f);
        this.c1 = L;
        this.e0 = z4;
        if (z7) {
            y = u(0.4f);
            y2 = u(0.8f);
        } else {
            y = y(bkb.If);
            y2 = y(bkb.Ff);
        }
        ojb V = bkb.V(context, 2131232748, y, y2);
        if (z7) {
            y3 = u(0.4f);
            y4 = u(0.8f);
        } else {
            y3 = y(bkb.If);
            y4 = y(bkb.Ff);
        }
        ojb V2 = bkb.V(context, 2131232745, y3, y4);
        if (z7) {
            y5 = u(0.4f);
            y6 = u(0.8f);
        } else {
            y5 = y(bkb.If);
            y6 = y(bkb.Ff);
        }
        this.Y0 = new Drawable[]{V, V2, bkb.V(context, 2131232749, y5, y6)};
        if (z7) {
            y7 = u(0.4f);
            y8 = u(0.8f);
        } else {
            y7 = y(bkb.Df);
            y8 = y(bkb.Ff);
        }
        ojb V3 = bkb.V(context, 2131232130, y7, y8);
        if (z7) {
            y9 = u(0.4f);
            y10 = u(0.8f);
        } else {
            y9 = y(bkb.Df);
            y10 = y(bkb.Ff);
        }
        ojb V4 = bkb.V(context, 2131231066, y9, y10);
        if (z7) {
            y11 = u(0.4f);
            y12 = u(0.8f);
        } else {
            y11 = y(bkb.Df);
            y12 = y(bkb.Ff);
        }
        ojb V5 = bkb.V(context, 2131231069, y11, y12);
        if (z7) {
            y13 = u(0.4f);
            y14 = u(0.8f);
        } else {
            y13 = y(bkb.Df);
            y14 = y(bkb.Ff);
        }
        ojb V6 = bkb.V(context, 2131231067, y13, y14);
        this.b2 = V6;
        int i3 = bkb.Hf;
        ojb V7 = bkb.V(context, 2131231068, y(i3), y(i3));
        this.c2 = V7;
        this.Z0 = new Drawable[]{V3, V4, V5, new LayerDrawable(new Drawable[]{V6, V7})};
        if (z7) {
            y15 = u(0.4f);
            y16 = u(0.8f);
        } else {
            y15 = y(bkb.Df);
            y16 = y(bkb.Ff);
        }
        ojb V8 = bkb.V(context, 2131232130, y15, y16);
        if (z7) {
            y17 = u(0.4f);
            y18 = u(0.8f);
        } else {
            y17 = y(bkb.Df);
            y18 = y(bkb.Ff);
        }
        this.a1 = new Drawable[]{V8, bkb.V(context, 2131232768, y17, y18)};
        this.b1 = new String[]{k96.M0(2131751183, null), k96.M0(2131751182, null), k96.M0(2131751181, null), k96.M0(2131751180, null), k96.M0(2131751179, null), k96.M0(2131751178, null), k96.M0(2131751177, null), k96.M0(2131751176, null)};
        this.K1 = chatFull;
        Paint paint = new Paint(1);
        this.t1 = paint;
        paint.setColor(y(bkb.Rf));
        xi xiVar = zdc.a;
        this.N1 = new nj9(gl.L(6.0f));
        tz3 tz3Var = new tz3(this, context);
        this.K = tz3Var;
        ?? obj = new Object();
        obj.a = (byte) 0;
        obj.b = tz3Var;
        arrayList.add(obj);
        if (z) {
            hq6.d0(i2).D(5);
            hq6.d0(i2).y();
            this.f2 = new PorterDuffColorFilter(y(bkb.Ei), PorterDuff.Mode.SRC_IN);
        }
        g04 g04Var = new g04(this, context);
        this.Q = g04Var;
        qw4Var2.b(g04Var);
        gb3 gb3Var = new gb3();
        gb3Var.c = (short) 220;
        gb3Var.e = (short) 220;
        gb3Var.f = (short) 160;
        gb3Var.g = (short) 160;
        gb3Var.i = s33.g;
        g04Var.setItemAnimator(gb3Var);
        g04Var.setOnTouchListener(new View.OnTouchListener(this) {
            public final t14 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                byte b = r3;
                t14 t14Var = this.b;
                switch (b) {
                    case 0:
                        xv2 e = xv2.e();
                        g04 g04Var2 = t14Var.Q;
                        t14Var.getMeasuredHeight();
                        return e.h(motionEvent, g04Var2, null, t14Var.h2, wjbVar);
                    case 1:
                        return xv2.e().h(motionEvent, t14Var.i0, t14Var.n0, t14Var.h2, wjbVar);
                    default:
                        xv2 e2 = xv2.e();
                        bz3 bz3Var = t14Var.E0;
                        t14Var.getMeasuredHeight();
                        return e2.h(motionEvent, bz3Var, t14Var.B0, t14Var.h2, wjbVar);
                }
            }
        });
        g04Var.setOnItemLongClickListener(new my3(this, (byte) 1));
        g04Var.setInstantClick(true);
        uz3 uz3Var = new uz3(this);
        this.R = uz3Var;
        g04Var.setLayoutManager(uz3Var);
        g04Var.setTopGlowOffset(gl.L(38.0f));
        g04Var.setBottomGlowOffset(gl.L(36.0f));
        g04Var.setPadding(gl.L(5.0f), gl.L(36.0f), gl.L(5.0f), gl.L(44.0f));
        int i4 = bkb.yf;
        zkb.l(g04Var, 21, i4, wjbVar);
        g04Var.setItemSelectorColorProvider(new k93((byte) 25));
        g04Var.setClipToPadding(false);
        uz3Var.O = new vz3(this);
        d04 d04Var2 = new d04(this);
        this.S = d04Var2;
        g04Var.setAdapter(d04Var2);
        g04Var.i(new kr(this, (byte) 5));
        this.T = new t04(this, context);
        tz3Var.addView(g04Var, nme.c(-1.0f, -1));
        cu6 cu6Var = new cu6(g04Var, uz3Var);
        this.c0 = cu6Var;
        cu6Var.r = new wz3(this);
        g04Var.setOnScrollListener(new xz3(this));
        yz3 yz3Var = new yz3(this, context, wjbVar, z, dVar != null ? new ly3(this, (byte) 2) : null, z7);
        this.J = yz3Var;
        if (z4) {
            ty3 ty3Var = new ty3(this, context);
            this.W = ty3Var;
            tz3Var.addView(ty3Var, new FrameLayout.LayoutParams(-1, gl.e1() + L));
            ty3Var.d.setOnFocusChangeListener(new uy3(this));
            wm4 wm4Var = new wm4(context, wjbVar);
            this.V = wm4Var;
            wm4Var.setVisibility(8);
            wm4Var.setOnBackClickListener(new View.OnClickListener(this) {
                public final t14 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    h14 h14Var;
                    byte b = r2;
                    t14 t14Var = this.b;
                    switch (b) {
                        case 0:
                            t04 t04Var = t14Var.T;
                            o04 o04Var = t04Var.c;
                            int childCount = o04Var.getChildCount();
                            for (int i5 = 0; i5 < childCount; i5++) {
                                ((vm4) o04Var.getChildAt(i5)).a(false, true);
                            }
                            t04Var.d = 0L;
                            t04Var.G.b.a(false, true);
                            t04Var.f();
                            return;
                        case 1:
                            o14 o14Var = t14Var.A0;
                            o04 o04Var2 = o14Var.c;
                            int childCount2 = o04Var2.getChildCount();
                            for (int i6 = 0; i6 < childCount2; i6++) {
                                ((vm4) o04Var2.getChildAt(i6)).a(false, true);
                            }
                            o14Var.d = 0L;
                            o14Var.R.a.a(false, true);
                            o14Var.f();
                            return;
                        case 2:
                            u04 u04Var = t14Var.u1;
                            if (u04Var != null) {
                                u04Var.v();
                                return;
                            }
                            return;
                        default:
                            int currentItem = t14Var.h.getCurrentItem();
                            if (currentItem == 0) {
                                h14Var = t14Var.W;
                            } else if (currentItem == 1) {
                                h14Var = t14Var.p0;
                            } else {
                                h14Var = t14Var.H0;
                            }
                            if (h14Var != null) {
                                f14 f14Var = h14Var.d;
                                f14Var.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                f14Var.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                f14Var.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            tz3Var.addView(wm4Var, new FrameLayout.LayoutParams(-1, L));
        }
        if (Color.alpha(y(i4)) >= 255) {
            zkb.h(i4, wjbVar, yz3Var);
        }
        d04Var2.G(true);
        yz3Var.p(getEmojipacks());
        tz3Var.addView(yz3Var, nme.c(36.0f, -1));
        View view = new View(context);
        this.P = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i5 = bkb.Bf;
        zkb.h(i5, wjbVar, view);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gl.e1(), 51);
        layoutParams.topMargin = gl.L(36.0f);
        tz3Var.addView(view, layoutParams);
        um4 um4Var = new um4(context, wjbVar);
        this.M = um4Var;
        st stVar = new st(context, wjbVar, (byte) 15);
        this.L = stVar;
        stVar.setVisibility(8);
        stVar.addView(um4Var, nme.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        tz3Var.addView(stVar, nme.e(-1, -2, 80));
        if (z2) {
            dr9 dr9Var = dr9.b;
            if (z3) {
                vy3 vy3Var = new vy3(this, context);
                this.h0 = vy3Var;
                ?? obj2 = new Object();
                obj2.a = (byte) 1;
                obj2.b = vy3Var;
                arrayList.add(obj2);
                wy3 wy3Var = new wy3(this, context);
                this.i0 = wy3Var;
                qw4Var2.b(wy3Var);
                wy3Var.setClipToPadding(false);
                z04 z04Var = new z04(this);
                this.j0 = z04Var;
                wy3Var.setLayoutManager(z04Var);
                wy3Var.i(new xy3(this));
                wy3Var.setPadding(0, L, 0, gl.L(44.0f) + this.q2);
                ((hia) wy3Var.getItemAnimator()).m = false;
                y04 y04Var = new y04(this, context, true, Integer.MAX_VALUE);
                this.o0 = y04Var;
                wy3Var.setAdapter(y04Var);
                this.k0 = new y04(this, context, false, 0);
                wy3Var.setOnScrollListener(new s14(this, 2));
                wy3Var.setOnTouchListener(new View.OnTouchListener(this) {
                    public final t14 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        byte b = r3;
                        t14 t14Var = this.b;
                        switch (b) {
                            case 0:
                                xv2 e = xv2.e();
                                g04 g04Var2 = t14Var.Q;
                                t14Var.getMeasuredHeight();
                                return e.h(motionEvent, g04Var2, null, t14Var.h2, wjbVar);
                            case 1:
                                return xv2.e().h(motionEvent, t14Var.i0, t14Var.n0, t14Var.h2, wjbVar);
                            default:
                                xv2 e2 = xv2.e();
                                bz3 bz3Var = t14Var.E0;
                                t14Var.getMeasuredHeight();
                                return e2.h(motionEvent, bz3Var, t14Var.B0, t14Var.h2, wjbVar);
                        }
                    }
                });
                ?? r10 = new c39(this) {
                    public final t14 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void d(int i6, View view2) {
                        int i7;
                        String str;
                        byte b = r2;
                        t14 t14Var = this.b;
                        switch (b) {
                            case 0:
                                wy3 wy3Var2 = t14Var.i0;
                                y04 y04Var2 = t14Var.k0;
                                y04 y04Var3 = t14Var.o0;
                                if (t14Var.u1 != null) {
                                    y04Var3.getClass();
                                    ArrayList arrayList2 = y04Var3.y;
                                    if (wy3Var2.getAdapter() == y04Var3) {
                                        if (i6 >= 0) {
                                            int i8 = y04Var3.I;
                                            if (i6 < i8) {
                                                t14Var.u1.u(view2, t14Var.j1.get(i6), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i8 > 0) {
                                                i7 = (i6 - i8) - 1;
                                            } else {
                                                i7 = i6;
                                            }
                                            if (i7 >= 0 && i7 < arrayList2.size()) {
                                                t14Var.u1.u(view2, arrayList2.get(i7), null, y04Var3.n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (wy3Var2.getAdapter() == y04Var2 && i6 >= 0 && i6 < y04Var2.y.size()) {
                                        t14Var.u1.u(view2, y04Var2.y.get(i6), y04Var2.x, y04Var2.n, true, 0, 0);
                                        t14Var.X();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                w39 adapter = t14Var.E0.getAdapter();
                                o14 o14Var = t14Var.A0;
                                if (adapter == o14Var) {
                                    str = o14Var.O;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof xya) {
                                    xya xyaVar = (xya) view2;
                                    if (xyaVar.getSticker() != null && k27.W3(xyaVar.getSticker()) && !y6c.h(j5.a(t14Var.d1).a).p()) {
                                        xv2.e().m(xyaVar);
                                        return;
                                    }
                                    xv2.e().j();
                                    if (!xyaVar.r) {
                                        xyaVar.r = true;
                                        xyaVar.n = 0.5f;
                                        xyaVar.y = 0L;
                                        wya wyaVar = xyaVar.a;
                                        wyaVar.setAlpha(0.5f * xyaVar.I);
                                        wyaVar.invalidate();
                                        xyaVar.s = System.currentTimeMillis();
                                        xyaVar.invalidate();
                                        t14Var.u1.x(xyaVar, xyaVar.getSticker(), str2, xyaVar.getParentObject(), xyaVar.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.n0 = r10;
                wy3Var.setOnItemClickListener((c39) r10);
                vy3Var.addView(wy3Var, nme.c(-1.0f, -1));
                yy3 yy3Var = new yy3(this, context);
                this.p0 = yy3Var;
                vy3Var.addView(yy3Var, new FrameLayout.LayoutParams(-1, gl.e1() + L));
                b04 b04Var = new b04(this, context, wjbVar);
                this.q0 = b04Var;
                b04Var.setType(dr9Var);
                b04Var.setUnderlineHeight(gl.e1());
                i = i3;
                b04Var.setIndicatorColor(y(i));
                b04Var.setUnderlineColor(y(i5));
                zkb.h(i4, wjbVar, b04Var);
                W();
                b04Var.setDelegate(new my3(this, (byte) 2));
                y04Var.F("", "", true, true, true);
            } else {
                i = i3;
            }
            zy3 zy3Var = new zy3(this, context, z5);
            this.y0 = zy3Var;
            hq6.d0(i2).D(0);
            hq6.d0(i2).z();
            bz3 bz3Var = new bz3(this, context);
            this.E0 = bz3Var;
            qw4Var2.b(bz3Var);
            cz3 cz3Var = new cz3(this);
            this.F0 = cz3Var;
            bz3Var.setLayoutManager(cz3Var);
            cz3Var.O = new dz3(this);
            qw4Var = qw4Var2;
            bz3Var.setPadding(0, gl.L(36.0f), 0, gl.L(44.0f));
            bz3Var.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.a = (byte) 2;
            obj3.b = zy3Var;
            arrayList.add(obj3);
            this.A0 = new o14(this, context);
            l14 l14Var = new l14(this, context);
            this.z0 = l14Var;
            bz3Var.setAdapter(l14Var);
            bz3Var.setOnTouchListener(new View.OnTouchListener(this) {
                public final t14 b;

                {
                    this.b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    byte b = r3;
                    t14 t14Var = this.b;
                    switch (b) {
                        case 0:
                            xv2 e = xv2.e();
                            g04 g04Var2 = t14Var.Q;
                            t14Var.getMeasuredHeight();
                            return e.h(motionEvent, g04Var2, null, t14Var.h2, wjbVar);
                        case 1:
                            return xv2.e().h(motionEvent, t14Var.i0, t14Var.n0, t14Var.h2, wjbVar);
                        default:
                            xv2 e2 = xv2.e();
                            bz3 bz3Var2 = t14Var.E0;
                            t14Var.getMeasuredHeight();
                            return e2.h(motionEvent, bz3Var2, t14Var.B0, t14Var.h2, wjbVar);
                    }
                }
            });
            ?? r5 = new c39(this) {
                public final t14 b;

                {
                    this.b = this;
                }

                @Override
                public final void d(int i6, View view2) {
                    int i7;
                    String str;
                    byte b = r2;
                    t14 t14Var = this.b;
                    switch (b) {
                        case 0:
                            wy3 wy3Var2 = t14Var.i0;
                            y04 y04Var2 = t14Var.k0;
                            y04 y04Var3 = t14Var.o0;
                            if (t14Var.u1 != null) {
                                y04Var3.getClass();
                                ArrayList arrayList2 = y04Var3.y;
                                if (wy3Var2.getAdapter() == y04Var3) {
                                    if (i6 >= 0) {
                                        int i8 = y04Var3.I;
                                        if (i6 < i8) {
                                            t14Var.u1.u(view2, t14Var.j1.get(i6), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i8 > 0) {
                                            i7 = (i6 - i8) - 1;
                                        } else {
                                            i7 = i6;
                                        }
                                        if (i7 >= 0 && i7 < arrayList2.size()) {
                                            t14Var.u1.u(view2, arrayList2.get(i7), null, y04Var3.n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (wy3Var2.getAdapter() == y04Var2 && i6 >= 0 && i6 < y04Var2.y.size()) {
                                    t14Var.u1.u(view2, y04Var2.y.get(i6), y04Var2.x, y04Var2.n, true, 0, 0);
                                    t14Var.X();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            w39 adapter = t14Var.E0.getAdapter();
                            o14 o14Var = t14Var.A0;
                            if (adapter == o14Var) {
                                str = o14Var.O;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof xya) {
                                xya xyaVar = (xya) view2;
                                if (xyaVar.getSticker() != null && k27.W3(xyaVar.getSticker()) && !y6c.h(j5.a(t14Var.d1).a).p()) {
                                    xv2.e().m(xyaVar);
                                    return;
                                }
                                xv2.e().j();
                                if (!xyaVar.r) {
                                    xyaVar.r = true;
                                    xyaVar.n = 0.5f;
                                    xyaVar.y = 0L;
                                    wya wyaVar = xyaVar.a;
                                    wyaVar.setAlpha(0.5f * xyaVar.I);
                                    wyaVar.invalidate();
                                    xyaVar.s = System.currentTimeMillis();
                                    xyaVar.invalidate();
                                    t14Var.u1.x(xyaVar, xyaVar.getSticker(), str2, xyaVar.getParentObject(), xyaVar.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.B0 = r5;
            bz3Var.setOnItemClickListener((c39) r5);
            zkb.l(bz3Var, 21, i4, wjbVar);
            zy3Var.addView(bz3Var);
            this.b0 = new cu6(bz3Var, cz3Var);
            fz3 fz3Var = new fz3(this, context);
            this.H0 = fz3Var;
            zy3Var.addView(fz3Var, new FrameLayout.LayoutParams(-1, gl.e1() + L));
            wm4 wm4Var2 = new wm4(context, wjbVar);
            this.I0 = wm4Var2;
            wm4Var2.setVisibility(8);
            wm4Var2.setOnBackClickListener(new View.OnClickListener(this) {
                public final t14 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    h14 h14Var;
                    byte b = r2;
                    t14 t14Var = this.b;
                    switch (b) {
                        case 0:
                            t04 t04Var = t14Var.T;
                            o04 o04Var = t04Var.c;
                            int childCount = o04Var.getChildCount();
                            for (int i52 = 0; i52 < childCount; i52++) {
                                ((vm4) o04Var.getChildAt(i52)).a(false, true);
                            }
                            t04Var.d = 0L;
                            t04Var.G.b.a(false, true);
                            t04Var.f();
                            return;
                        case 1:
                            o14 o14Var = t14Var.A0;
                            o04 o04Var2 = o14Var.c;
                            int childCount2 = o04Var2.getChildCount();
                            for (int i6 = 0; i6 < childCount2; i6++) {
                                ((vm4) o04Var2.getChildAt(i6)).a(false, true);
                            }
                            o14Var.d = 0L;
                            o14Var.R.a.a(false, true);
                            o14Var.f();
                            return;
                        case 2:
                            u04 u04Var = t14Var.u1;
                            if (u04Var != null) {
                                u04Var.v();
                                return;
                            }
                            return;
                        default:
                            int currentItem = t14Var.h.getCurrentItem();
                            if (currentItem == 0) {
                                h14Var = t14Var.W;
                            } else if (currentItem == 1) {
                                h14Var = t14Var.p0;
                            } else {
                                h14Var = t14Var.H0;
                            }
                            if (h14Var != null) {
                                f14 f14Var = h14Var.d;
                                f14Var.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                f14Var.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                f14Var.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            zy3Var.addView(wm4Var2, new FrameLayout.LayoutParams(-1, L));
            z8 = z5;
            gz3 gz3Var = new gz3(this, context, wjbVar, dVar, z8);
            this.C0 = gz3Var;
            gz3Var.setDragEnabled(true);
            gz3Var.setWillNotDraw(false);
            gz3Var.setType(dr9Var);
            gz3Var.setUnderlineHeight(bz3Var.canScrollVertically(-1) ? gl.e1() : 0);
            gz3Var.setIndicatorColor(y(i));
            gz3Var.setUnderlineColor(y(i5));
            if (viewGroup != null && z8) {
                hz3 hz3Var = new hz3(this, context);
                this.D0 = hz3Var;
                hz3Var.addView(gz3Var, nme.e(-1, 36, 51));
                viewGroup.addView(hz3Var, nme.c(-2.0f, -1));
            } else {
                zy3Var.addView(gz3Var, nme.e(-1, 36, 51));
            }
            Y(true);
            gz3Var.setDelegate(new my3(this, (byte) 4));
            bz3Var.setOnScrollListener(new s14(this, 0));
            um4 um4Var2 = new um4(context, wjbVar);
            this.O = um4Var2;
            st stVar2 = new st(context, wjbVar, (byte) 15);
            this.N = stVar2;
            stVar2.setVisibility(8);
            stVar2.addView(um4Var2, nme.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            zy3Var.addView(stVar2, nme.e(-1, -2, 80));
        } else {
            qw4Var = qw4Var2;
            z8 = z5;
        }
        this.e.clear();
        this.e.addAll(this.d);
        iz3 iz3Var = new iz3(this, context);
        this.h = iz3Var;
        qw4 qw4Var3 = qw4Var;
        iz3Var.b(new iw4(qw4Var3, iz3Var));
        iz3Var.setOverScrollMode(2);
        n04 n04Var = new n04(this);
        this.M0 = n04Var;
        iz3Var.setAdapter(n04Var);
        jz3 jz3Var = new jz3(this, context);
        this.y = jz3Var;
        jz3Var.setHapticFeedbackEnabled(true);
        jz3Var.setImageResource(2131232744);
        int u = z7 ? u(0.6f) : y(bkb.If);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        jz3Var.setColorFilter(new PorterDuffColorFilter(u, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        jz3Var.setScaleType(scaleType);
        jz3Var.setContentDescription(k96.M0(2131754920, null));
        jz3Var.setFocusable(true);
        jz3Var.setOnClickListener(new Object());
        ote.a(jz3Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        if (z4) {
            addView(frameLayout, nme.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (gl.e1() / gl.p) + 40.0f));
        } else {
            addView(frameLayout, nme.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        addView(frameLayout2, nme.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.n = frameLayout3;
        View view2 = new View(context);
        this.w = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, gl.L(40.0f), 83));
        if (z4) {
            addView(frameLayout3, nme.e(-1, 48, 80));
            frameLayout3.addView(jz3Var, nme.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z2) {
                ImageView imageView = new ImageView(context);
                this.E = imageView;
                imageView.setImageResource(2131232747);
                imageView.setColorFilter(new PorterDuffColorFilter(z7 ? u(0.6f) : y(bkb.If), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(k96.M0(2131745303, null));
                ote.a(imageView);
                frameLayout3.addView(imageView, nme.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final t14 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        h14 h14Var;
                        byte b = r2;
                        t14 t14Var = this.b;
                        switch (b) {
                            case 0:
                                t04 t04Var = t14Var.T;
                                o04 o04Var = t04Var.c;
                                int childCount = o04Var.getChildCount();
                                for (int i52 = 0; i52 < childCount; i52++) {
                                    ((vm4) o04Var.getChildAt(i52)).a(false, true);
                                }
                                t04Var.d = 0L;
                                t04Var.G.b.a(false, true);
                                t04Var.f();
                                return;
                            case 1:
                                o14 o14Var = t14Var.A0;
                                o04 o04Var2 = o14Var.c;
                                int childCount2 = o04Var2.getChildCount();
                                for (int i6 = 0; i6 < childCount2; i6++) {
                                    ((vm4) o04Var2.getChildAt(i6)).a(false, true);
                                }
                                o14Var.d = 0L;
                                o14Var.R.a.a(false, true);
                                o14Var.f();
                                return;
                            case 2:
                                u04 u04Var = t14Var.u1;
                                if (u04Var != null) {
                                    u04Var.v();
                                    return;
                                }
                                return;
                            default:
                                int currentItem = t14Var.h.getCurrentItem();
                                if (currentItem == 0) {
                                    h14Var = t14Var.W;
                                } else if (currentItem == 1) {
                                    h14Var = t14Var.p0;
                                } else {
                                    h14Var = t14Var.H0;
                                }
                                if (h14Var != null) {
                                    f14 f14Var = h14Var.d;
                                    f14Var.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    f14Var.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    f14Var.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            sr7 sr7Var = new sr7(context, wjbVar);
            this.x = sr7Var;
            sr7Var.setViewPager(iz3Var);
            sr7Var.setShouldExpand(false);
            sr7Var.setIndicatorHeight(gl.L(3.0f));
            sr7Var.setIndicatorColor(bm2.o(y(bkb.Ff), 20));
            sr7Var.setUnderlineHeight(0);
            sr7Var.setTabPaddingLeftRight(gl.L(11.0f));
            sr7Var.setPadding(gl.L(4.0f), gl.L(11.0f), gl.L(4.0f), gl.L(11.0f));
            frameLayout3.addView(sr7Var, nme.e(-2, 48, 81));
            sr7Var.setOnPageChangeListener(new lz3(this, z8));
            ImageView imageView2 = new ImageView(context);
            this.F = imageView2;
            imageView2.setImageResource(2131232746);
            imageView2.setColorFilter(new PorterDuffColorFilter(z7 ? u(0.6f) : y(bkb.If), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(k96.M0(2131745644, null));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, nme.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final t14 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view22) {
                    h14 h14Var;
                    byte b = r2;
                    t14 t14Var = this.b;
                    switch (b) {
                        case 0:
                            t04 t04Var = t14Var.T;
                            o04 o04Var = t04Var.c;
                            int childCount = o04Var.getChildCount();
                            for (int i52 = 0; i52 < childCount; i52++) {
                                ((vm4) o04Var.getChildAt(i52)).a(false, true);
                            }
                            t04Var.d = 0L;
                            t04Var.G.b.a(false, true);
                            t04Var.f();
                            return;
                        case 1:
                            o14 o14Var = t14Var.A0;
                            o04 o04Var2 = o14Var.c;
                            int childCount2 = o04Var2.getChildCount();
                            for (int i6 = 0; i6 < childCount2; i6++) {
                                ((vm4) o04Var2.getChildAt(i6)).a(false, true);
                            }
                            o14Var.d = 0L;
                            o14Var.R.a.a(false, true);
                            o14Var.f();
                            return;
                        case 2:
                            u04 u04Var = t14Var.u1;
                            if (u04Var != null) {
                                u04Var.v();
                                return;
                            }
                            return;
                        default:
                            int currentItem = t14Var.h.getCurrentItem();
                            if (currentItem == 0) {
                                h14Var = t14Var.W;
                            } else if (currentItem == 1) {
                                h14Var = t14Var.p0;
                            } else {
                                h14Var = t14Var.H0;
                            }
                            if (h14Var != null) {
                                f14 f14Var = h14Var.d;
                                f14Var.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                f14Var.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                f14Var.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            addView(frameLayout3, nme.d(56, 48.0f, (k96.a0 ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            ff0 h0 = bkb.h0(gl.L(56.0f), y(i4), y(i4));
            ote.a(jz3Var);
            jz3Var.setPadding(0, 0, gl.L(2.0f), 0);
            jz3Var.setBackground(h0);
            jz3Var.setContentDescription(k96.M0(2131754920, null));
            jz3Var.setFocusable(true);
            frameLayout3.addView(jz3Var, nme.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(iz3Var, 0, nme.e(-1, -1, 51));
        wb wbVar = new wb(context, (byte) 18);
        this.O0 = wbVar;
        int L2 = gl.L(6.0f);
        int i6 = bkb.gg;
        ShapeDrawable b0 = bkb.b0(L2, y(i6));
        vkb M = zkb.M(i6);
        wbVar.setBackground(b0);
        zkb.j(wbVar, b0, M, null, wjbVar);
        zkb.X(wbVar, bkb.fg, wjbVar);
        wbVar.setPadding(gl.L(12.0f), gl.L(7.0f), gl.L(12.0f), gl.L(7.0f));
        char c = 16;
        wbVar.setGravity(16);
        wbVar.setTextSize(1, 14.0f);
        wbVar.setVisibility(4);
        addView(wbVar, nme.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.D1 = gl.L(gl.O1() ? 40.0f : 32.0f);
        Field field2 = gw3.f;
        gw3 gw3Var = new gw3(new fw3(context, wjbVar));
        Field field3 = gw3.f;
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
            gw3.f = field3;
        }
        if (field3 != null) {
            try {
                gw3Var.a = (ViewTreeObserver.OnScrollChangedListener) field3.get(gw3Var);
                gw3.f.set(gw3Var, gw3.g);
            } catch (Exception unused3) {
                gw3Var.a = null;
            }
        }
        this.C1 = gw3Var;
        gw3Var.c.setOnSelectionUpdateListener(new w72(this, (byte) 24));
        this.B1 = na7.b1().getInt("selected_page", 0);
        HashMap hashMap = vu3.h;
        if (!vu3.k) {
            vu3.k = true;
            SharedPreferences b1 = na7.b1();
            try {
                hashMap.clear();
                if (b1.contains("emojis")) {
                    String string = b1.getString("emojis", "");
                    if (string != null && string.length() > 0) {
                        String[] split = string.split(",");
                        int length = split.length;
                        int i7 = 0;
                        while (i7 < length) {
                            String[] split2 = split[i7].split("=");
                            long longValue = Utilities.A(split2[0]).longValue();
                            char c2 = c;
                            StringBuilder sb = new StringBuilder();
                            String[] strArr = split;
                            int i8 = i7;
                            int i9 = length;
                            long j = longValue;
                            for (int i10 = 0; i10 < 4; i10++) {
                                sb.insert(0, (char) j);
                                j >>= c2;
                                if (j == 0) {
                                    break;
                                }
                            }
                            if (sb.length() > 0) {
                                hashMap.put(sb.toString(), Utilities.z(split2[1]));
                            }
                            i7 = i8 + 1;
                            c = c2;
                            split = strArr;
                            length = i9;
                        }
                    }
                    b1.edit().remove("emojis").commit();
                    vu3.r();
                } else {
                    String string2 = b1.getString("emojis2", "");
                    if (string2 != null && string2.length() > 0) {
                        for (String str : string2.split(",")) {
                            String[] split3 = str.split("=");
                            hashMap.put(split3[0], Utilities.z(split3[1]));
                        }
                    }
                }
                if (hashMap.isEmpty() && !b1.getBoolean("filled_default", false)) {
                    int i11 = 0;
                    while (true) {
                        String[] strArr2 = vu3.o;
                        if (i11 >= strArr2.length) {
                            break;
                        }
                        hashMap.put(strArr2[i11], Integer.valueOf(strArr2.length - i11));
                        i11++;
                    }
                    b1.edit().putBoolean("filled_default", true).commit();
                    vu3.r();
                }
                vu3.s();
            } catch (Exception e) {
                fa4.g(e, true);
            }
            try {
                String string3 = b1.getString("color", "");
                if (string3 != null && string3.length() > 0) {
                    for (String str2 : string3.split(",")) {
                        String[] split4 = str2.split("=");
                        vu3.j.put(split4[0], split4[1]);
                    }
                }
            } catch (Exception e2) {
                z10 = true;
                fa4.g(e2, true);
                d04Var = d04Var2;
                z9 = false;
            }
        }
        d04Var = d04Var2;
        z9 = false;
        z10 = true;
        d04Var.F(z9);
        I(z10, z2, z3, z9);
        if (Build.VERSION.SDK_INT >= 31) {
            cq3 cq3Var = new cq3(z9);
            this.k2 = cq3Var;
            qw4Var3.a(cq3Var);
            lx4 lx4Var = new lx4(null);
            lx4Var.f = ix4Var;
            lx4Var.d = cq3Var;
            lx4Var.e = -2;
            kl0Var = new kl0(lx4Var, lx4Var, lx4Var);
            kl0Var.k = true;
            int L3 = gl.L(e66.e(262144) ? 8.0f : 48.0f);
            kl0Var.d = L3;
            kl0Var.e = L3;
            kl0Var.j = qw4Var3;
        } else {
            kl0Var = new kl0(ix4Var, ix4Var, ix4Var);
            kl0Var.j = qw4Var3;
            this.k2 = null;
        }
        this.l2 = new vw0(this, (byte) 3);
        setBlurredBackgroundDrawableFactory(kl0Var);
        qw4Var3.i(this);
        qw4Var3.a = new my3(this, (byte) 0);
    }

    public static String c(String str, String str2) {
        String str3;
        String str4;
        boolean z = true;
        if (qq2.c(str) != null) {
            if (qq2.c(str) == null) {
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
        if (vu3.b(str)) {
            str = ir2.n(2, 0, str);
        } else {
            z = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = ir2.n(2, 0, str);
        } else if (length > 3 && str.charAt(str.length() - 3) == 8205) {
            str3 = str.substring(str.length() - 3);
            str = ir2.n(3, 0, str);
        } else {
            str3 = null;
        }
        String h = b00.h(str, str2);
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

    public final void A() {
        wtc wtcVar = this.M2;
        if (wtcVar != null) {
            wtcVar.a();
            this.M2 = null;
        }
        wtc wtcVar2 = this.N2;
        if (wtcVar2 != null) {
            wtcVar2.a();
            this.N2 = null;
            this.O2 = false;
        }
    }

    public final void B(boolean z, boolean z2) {
        g14 g14Var;
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
        iz3 iz3Var = this.h;
        if (i != 0 && !z && this.e.size() != 1) {
            int i2 = this.B1;
            if (i2 == 1) {
                L(false, false);
                if (!this.v0 && !this.w0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                Q(z3, false);
                if (iz3Var.getCurrentItem() != 2) {
                    iz3Var.x(2, false);
                }
                gz3 gz3Var = this.C0;
                if (gz3Var != null) {
                    this.T0 = true;
                    int i3 = this.H1;
                    if (i3 >= 0) {
                        gz3Var.m(i3);
                    } else {
                        int i4 = this.G1;
                        if (i4 >= 0) {
                            gz3Var.m(i4);
                        } else {
                            gz3Var.m(this.F1);
                        }
                    }
                    this.T0 = false;
                    this.F0.g1(0, 0);
                }
            } else if (i2 == 2) {
                L(false, false);
                Q(false, false);
                if (iz3Var.getCurrentItem() != 1) {
                    iz3Var.x(1, false);
                }
                b04 b04Var = this.q0;
                if (b04Var != null) {
                    b04Var.m(0);
                }
                yy3 yy3Var = this.p0;
                if (yy3Var != null && (g14Var = yy3Var.r) != null) {
                    g14Var.I1(null);
                }
            }
        } else {
            L(true, false);
            Q(false, false);
            if (iz3Var.getCurrentItem() != 0) {
                iz3Var.x(0, !z);
            }
            if (z2) {
                gl.e3(new ly3(this, (byte) 5), 350L);
            }
        }
        M(true);
    }

    public final void C() {
        l14 l14Var = this.z0;
        if (l14Var != null) {
            l14Var.f();
        }
        o14 o14Var = this.A0;
        if (o14Var != null) {
            o14Var.f();
        }
        if (xv2.e().E) {
            xv2.e().b();
        }
        xv2.e().j();
    }

    public final void E(int i) {
        u04 u04Var = this.u1;
        if ((u04Var != null && u04Var.z()) || i == 0) {
            return;
        }
        HorizontalScrollView x = x(i);
        this.R0[i] = 0;
        x.setTranslationY(0.0f);
    }

    public final void F(int i, int i2) {
        uz3 uz3Var = this.R;
        View m = uz3Var.m(i);
        int K0 = uz3Var.K0();
        int i3 = 1;
        if ((m == null && Math.abs(i - K0) > uz3Var.J * 9.0f) || !gba.c()) {
            if (uz3Var.K0() < i) {
                i3 = 0;
            }
            cu6 cu6Var = this.c0;
            cu6Var.b = i3;
            cu6Var.k(i, i2, false, false);
            return;
        }
        this.K0 = true;
        gv3 gv3Var = new gv3((byte) 1, this.Q.getContext(), this);
        gv3Var.a = i;
        gv3Var.p = i2;
        uz3Var.v0(gv3Var);
    }

    public final void G(int i, int i2) {
        cz3 cz3Var = this.F0;
        View m = cz3Var.m(i);
        int K0 = cz3Var.K0();
        int i3 = 1;
        if (m == null && Math.abs(i - K0) > 40) {
            if (cz3Var.K0() < i) {
                i3 = 0;
            }
            cu6 cu6Var = this.b0;
            cu6Var.b = i3;
            cu6Var.k(i, i2, false, false);
            return;
        }
        this.K0 = true;
        this.E0.z0(i);
    }

    public final void H(c14 c14Var, String str) {
        String str2;
        String str3;
        boolean z;
        String str4;
        u04 u04Var;
        u21 u21Var;
        if (c14Var != null) {
            if (c14Var.getSpan() != null) {
                if (this.u1 != null) {
                    long j = c14Var.getSpan().documentId;
                    TLRPC.Document document = c14Var.getSpan().document;
                    h04 h04Var = c14Var.e;
                    if (h04Var != null && h04Var.i) {
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
                            h04 h04Var2 = (h04) arrayList.get(i);
                            int i2 = 0;
                            while (true) {
                                ArrayList arrayList2 = h04Var2.c;
                                if (arrayList2 != null && i2 < arrayList2.size()) {
                                    if (((TLRPC.Document) h04Var2.c.get(i2)).id == j) {
                                        document = (TLRPC.Document) h04Var2.c.get(i2);
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
                        document = vl.e(i3, j);
                    }
                    if (document != null) {
                        str4 = k27.U(document);
                    } else {
                        str4 = null;
                    }
                    if (!k27.m3(document) && !y6c.h(i3).p() && (((u04Var = this.u1) == null || !u04Var.h()) && !this.V0 && !z)) {
                        M(false);
                        d dVar = this.Z1;
                        if (dVar != null) {
                            u21Var = u21.b0(dVar);
                        } else {
                            u21Var = new u21(this.r, this.a2);
                        }
                        if (!this.i2 && dVar != null) {
                            u21Var.K(2131624186, gl.T2(k96.M0(2131743624, null)), k96.M0(2131747624, null), new ly3(this, (byte) 4)).j();
                        } else {
                            u21Var.r(document, gl.T2(k96.M0(2131743625, null)), k96.M0(2131746842, null), new ly3(this, (byte) 3)).j();
                        }
                        this.i2 = !this.i2;
                        return;
                    }
                    this.D2 = SystemClock.elapsedRealtime();
                    M(true);
                    d("animated_" + j);
                    this.u1.w(j, document, str4, c14Var.c);
                    return;
                }
                return;
            }
            this.D2 = SystemClock.elapsedRealtime();
            M(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) c14Var.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!c14Var.c && (str3 = (String) vu3.j.get(str2)) != null) {
                    str2 = c(str2, str3);
                }
                d(str2);
                u04 u04Var2 = this.u1;
                if (u04Var2 != null) {
                    u04Var2.m(vu3.c(str2));
                    return;
                }
                return;
            }
            u04 u04Var3 = this.u1;
            if (u04Var3 != null) {
                u04Var3.m(vu3.c(str));
            }
        }
    }

    public final void I(boolean z, boolean z2, boolean z3, boolean z4) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        boolean z5 = false;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i >= arrayList2.size()) {
                break;
            }
            if (((p14) arrayList2.get(i)).a == 0 && z) {
                arrayList.add((p14) arrayList2.get(i));
            }
            if (((p14) arrayList2.get(i)).a == 1 && z3) {
                arrayList.add((p14) arrayList2.get(i));
            }
            if (((p14) arrayList2.get(i)).a == 2 && z2) {
                arrayList.add((p14) arrayList2.get(i));
            }
            i++;
        }
        sr7 sr7Var = this.x;
        if (sr7Var != null) {
            if (arrayList.size() > 1) {
                z5 = true;
            }
            gl.U3(sr7Var, z5, 1.0f, true, z4);
        }
        iz3 iz3Var = this.h;
        if (iz3Var != null) {
            iz3Var.setAdapter(null);
            iz3Var.setAdapter(this.M0);
            if (sr7Var != null) {
                sr7Var.setViewPager(iz3Var);
            }
        }
    }

    public final void J(final um4 um4Var, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z, boolean z2) {
        String G;
        o14 o14Var;
        t04 t04Var;
        if (stickerSet != null) {
            if (!z || (t04Var = this.T) == null || t04Var.d == stickerSet.id) {
                if (!z && (o14Var = this.A0) != null && o14Var.d != stickerSet.id) {
                    return;
                }
                final boolean D0 = hq6.d0(this.d1).D0(stickerSet.id, true);
                boolean z3 = stickerSet.masks;
                if (D0) {
                    if (z3) {
                        G = k96.G(stickerSet.count, "RemoveManyMasksCount", new Object[0]);
                    } else {
                        boolean z4 = stickerSet.emojis;
                        int i = stickerSet.count;
                        if (z4) {
                            G = k96.G(i, "RemoveManyEmojiCount", new Object[0]);
                        } else {
                            G = k96.G(i, "RemoveManyStickersCount", new Object[0]);
                        }
                    }
                } else if (z3) {
                    G = k96.G(stickerSet.count, "AddManyMasksCount", new Object[0]);
                } else {
                    boolean z5 = stickerSet.emojis;
                    int i2 = stickerSet.count;
                    if (z5) {
                        G = k96.G(i2, "AddManyEmojiCount", new Object[0]);
                    } else {
                        G = k96.G(i2, "AddManyStickersCount", new Object[0]);
                    }
                }
                um4Var.i(G, z2, true);
                um4Var.m0.a(!D0, z2);
                um4Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i3;
                        t14 t14Var = t14.this;
                        hq6 d0 = hq6.d0(t14Var.d1);
                        Context context = t14Var.getContext();
                        if (D0) {
                            i3 = 0;
                        } else {
                            i3 = 2;
                        }
                        int i4 = i3;
                        d dVar = t14Var.Z1;
                        FrameLayout frameLayout = t14Var.s;
                        um4 um4Var2 = um4Var;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z6 = z;
                        d0.i2(context, tLObject2, document2, i4, dVar, frameLayout, false, true, new z2a(t14Var, um4Var2, tLObject2, stickerSet2, document2, z6), false);
                        t14Var.J(um4Var2, tLObject2, stickerSet2, document2, z6, true);
                    }
                });
            }
        }
    }

    public final void K(long j, boolean z, boolean z2) {
        int i;
        View childAt;
        float f;
        sr7 sr7Var = this.x;
        if (sr7Var != null) {
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
            LinearLayout linearLayout = sr7Var.d;
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
                iz3 iz3Var = this.h;
                int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                if (z2) {
                    if (i2 != 0 && iz3Var.getCurrentItem() != 0) {
                        L(true, true);
                        Q(false, true);
                        iz3Var.x(0, false);
                    }
                } else if (i2 != 0 && iz3Var.getCurrentItem() != 1) {
                    L(false, true);
                    Q(false, true);
                    iz3Var.x(1, false);
                }
            }
        }
    }

    public final void L(boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        jz3 jz3Var = this.y;
        Object tag = jz3Var.getTag();
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
            jz3Var.setTag(num);
            int i = 0;
            float f5 = 0.0f;
            if (z2) {
                if (z) {
                    jz3Var.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.G = animatorSet2;
                if (z) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jz3Var, View.ALPHA, f3);
                if (z) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(jz3Var, View.SCALE_X, f4);
                if (z) {
                    f5 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(jz3Var, View.SCALE_Y, f5));
                this.G.setDuration(200L);
                this.G.setInterpolator(s33.g);
                this.G.addListener(new qz3(this, z, (byte) 0));
                this.G.start();
                return;
            }
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            jz3Var.setAlpha(f);
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            jz3Var.setScaleX(f2);
            if (z) {
                f5 = 1.0f;
            }
            jz3Var.setScaleY(f5);
            if (!z) {
                i = 4;
            }
            jz3Var.setVisibility(i);
        }
    }

    public final void M(boolean z) {
        Integer num;
        this.I = 0.0f;
        u04 u04Var = this.u1;
        if (u04Var != null && u04Var.z()) {
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

    public final void N(boolean z, boolean z2) {
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
            this.a0.setInterpolator(s33.g);
            this.a0.addListener(new im2(this, (byte) 17));
            this.a0.start();
            return;
        }
        if (z) {
            f = 1.0f;
        }
        view.setAlpha(f);
    }

    public final void O(boolean z) {
        for (int i = 0; i < 3; i++) {
            r35 v = v(i);
            int K0 = v.K0();
            if (z) {
                if (K0 == 1 || K0 == 2) {
                    v.m0(0);
                    E(i);
                }
            } else if (K0 == 0) {
                v.g1(0, 0);
            }
        }
    }

    public final void P(boolean z, boolean z2, boolean z3) {
        float f;
        float translationY;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat K0 = na7.q1(this.d1).K0(Long.valueOf(this.v1));
        if (K0 != null) {
            wb wbVar = this.O0;
            if (z) {
                if (!hc2.N(K0) && (tL_chatBannedRights = K0.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z2 && tL_chatBannedRights.send_plain))) {
                    d dVar = this.Z1;
                    if (!(dVar instanceof mu1) || !((mu1) dVar).O4()) {
                        if (z2) {
                            wbVar.setText(k96.M0(2131749371, null));
                        } else if (z3) {
                            wbVar.setText(k96.M0(2131749370, null));
                        } else {
                            wbVar.setText(k96.M0(2131749364, null));
                        }
                    } else {
                        return;
                    }
                } else {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = K0.banned_rights;
                    if (tL_chatBannedRights2 == null) {
                        return;
                    }
                    if (gl.B1(tL_chatBannedRights2)) {
                        if (z2) {
                            wbVar.setText(k96.M0(2131753940, null));
                        } else if (z3) {
                            wbVar.setText(k96.M0(2131753966, null));
                        } else {
                            wbVar.setText(k96.M0(2131753931, null));
                        }
                    } else {
                        if (z2) {
                            wbVar.setText(k96.a0("AttachPlainRestricted", null, 2131753941, k96.v(K0.banned_rights.until_date)));
                        }
                        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = K0.banned_rights;
                        if (z3) {
                            wbVar.setText(k96.a0("AttachGifRestricted", null, 2131753967, k96.v(tL_chatBannedRights3.until_date)));
                        } else {
                            wbVar.setText(k96.a0("AttachStickersRestricted", null, 2131753932, k96.v(tL_chatBannedRights3.until_date)));
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
                translationY = gl.L(12.0f);
            } else {
                translationY = wbVar.getTranslationY();
                f2 = gl.L(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(wbVar, View.TRANSLATION_Y, translationY, f2));
            sy3 sy3Var = this.Q2;
            if (sy3Var != null) {
                gl.r(sy3Var);
            }
            if (z) {
                sy3 sy3Var2 = new sy3(this, z2, z3, (byte) 0);
                this.Q2 = sy3Var2;
                gl.e3(sy3Var2, 3500L);
            }
            this.P2.setDuration(320L);
            this.P2.setInterpolator(s33.h);
            this.P2.start();
        }
    }

    public final void Q(boolean z, boolean z2) {
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
                this.H.setInterpolator(s33.g);
                this.H.addListener(new qz3(this, z, (byte) 1));
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

    public final void R(boolean z) {
        wy3 wy3Var = this.i0;
        if (wy3Var != null) {
            int childCount = wy3Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = wy3Var.getChildAt(i);
                if (childAt instanceof bw2) {
                    ImageReceiver photoImage = ((bw2) childAt).getPhotoImage();
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

    public final void S() {
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
            if ((!gl.E && ((dVar = this.Z1) == null || !dVar.isInBubbleMode())) || this.W0) {
                L = view.getHeight();
            } else {
                L = gl.L(1.0f);
            }
            float f2 = f - L;
            int i = (this.r2 > 0.0f ? 1 : (this.r2 == 0.0f ? 0 : -1));
            FrameLayout frameLayout = this.n;
            if (i >= 0) {
                f2 += getMeasuredHeight() - this.r2;
            } else if (frameLayout.getTop() - f2 < 0.0f || !this.x2) {
                f2 = 0.0f;
            }
            float U1 = (-f2) + gl.U1(this.E2.e, gl.L(50.0f), -this.q2);
            frameLayout.setTranslationY(U1);
            if (this.e0) {
                this.r.setTranslationY(U1);
            }
        }
    }

    public final void T() {
        h14 h14Var;
        boolean z;
        int y;
        boolean z2;
        int y2;
        int y3;
        int y4;
        int y5;
        int y6;
        int y7;
        int y8;
        int y9;
        zx3 zx3Var;
        int y10;
        int y11;
        int y12;
        int y13;
        int y14;
        int y15;
        boolean z3 = this.v0;
        View view = this.w;
        if (!z3) {
            setBackground(null);
            view.setBackground(null);
        } else if (!gl.E && !this.O1) {
            int i = bkb.yf;
            setBackgroundColor(y(i));
            if (this.e0) {
                view.setBackgroundColor(y(i));
            }
        } else {
            Drawable background = getBackground();
            int y16 = y(bkb.yf);
            if (background != null && (background != this.G2 || y16 != this.H2)) {
                this.G2 = background;
                this.H2 = y16;
                background.setColorFilter(new PorterDuffColorFilter(y16, PorterDuff.Mode.MULTIPLY));
            }
        }
        yz3 yz3Var = this.J;
        if (yz3Var != null) {
            if (this.v0) {
                yz3Var.setBackgroundColor(y(bkb.yf));
                this.P.setBackgroundColor(y(bkb.Bf));
            } else {
                yz3Var.setBackground(null);
            }
        }
        gw3 gw3Var = this.C1;
        if (gw3Var != null) {
            gw3Var.c.a();
        }
        int i2 = 0;
        while (true) {
            h14Var = this.W;
            z = this.j2;
            if (i2 >= 3) {
                break;
            }
            if (i2 == 0) {
                h14Var = this.H0;
            } else if (i2 != 1) {
                h14Var = this.p0;
            }
            if (h14Var != null) {
                f14 f14Var = h14Var.d;
                FrameLayout frameLayout = h14Var.n;
                boolean z4 = this.v0;
                View view2 = h14Var.f;
                if (z4) {
                    view2.setBackgroundColor(y(bkb.yf));
                } else {
                    view2.setBackground(null);
                }
                h14Var.e.setBackgroundColor(y(bkb.Bf));
                ks9 ks9Var = h14Var.c;
                if (z) {
                    y12 = u(0.4f);
                } else {
                    y12 = y(bkb.Af);
                }
                ks9Var.a(y12);
                Drawable background2 = frameLayout.getBackground();
                if (z) {
                    y13 = u(0.06f);
                } else {
                    y13 = y(bkb.zf);
                }
                bkb.A1(y13, background2);
                frameLayout.invalidate();
                if (z) {
                    y14 = u(0.45f);
                } else {
                    y14 = y(bkb.Af);
                }
                f14Var.setHintTextColor(y14);
                if (z) {
                    y15 = u(0.8f);
                } else {
                    y15 = y(bkb.F6);
                }
                f14Var.setTextColor(y15);
            }
            i2++;
        }
        Paint paint = this.t1;
        if (paint != null) {
            paint.setColor(y(bkb.Rf));
        }
        g04 g04Var = this.Q;
        if (g04Var != null) {
            g04Var.setGlowColor(y(bkb.yf));
        }
        bz3 bz3Var = this.E0;
        if (bz3Var != null) {
            bz3Var.setGlowColor(y(bkb.yf));
        }
        gz3 gz3Var = this.C0;
        if (gz3Var != null) {
            gz3Var.setIndicatorColor(y(bkb.Hf));
            gz3Var.setUnderlineColor(y(bkb.Bf));
            if (this.v0) {
                gz3Var.setBackgroundColor(y(bkb.yf));
            } else {
                gz3Var.setBackground(null);
            }
        }
        b04 b04Var = this.q0;
        if (b04Var != null) {
            b04Var.setIndicatorColor(y(bkb.Hf));
            b04Var.setUnderlineColor(y(bkb.Bf));
            if (this.v0) {
                b04Var.setBackgroundColor(y(bkb.yf));
            } else {
                b04Var.setBackground(null);
            }
        }
        if (z) {
            y = u(0.6f);
        } else {
            y = y(bkb.If);
        }
        if (y != this.I2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.I2 = y;
        jz3 jz3Var = this.y;
        if (jz3Var != null) {
            if (z2) {
                jz3Var.setColorFilter(new PorterDuffColorFilter(y, PorterDuff.Mode.MULTIPLY));
            }
            if (h14Var == null) {
                Drawable background3 = jz3Var.getBackground();
                int i3 = bkb.yf;
                bkb.F1(background3, y(i3), false);
                bkb.F1(jz3Var.getBackground(), y(i3), true);
            }
        }
        ImageView imageView = this.E;
        if (imageView != null && z2) {
            imageView.setColorFilter(new PorterDuffColorFilter(y, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.F;
        if (imageView2 != null && z2) {
            imageView2.setColorFilter(new PorterDuffColorFilter(y, PorterDuff.Mode.MULTIPLY));
        }
        wb wbVar = this.O0;
        if (wbVar != null) {
            if (wbVar.getBackground() instanceof ShapeDrawable) {
                ((ShapeDrawable) wbVar.getBackground()).getPaint().setColor(y(bkb.gg));
                wbVar.invalidate();
            }
            wbVar.setTextColor(y(bkb.fg));
        }
        y04 y04Var = this.k0;
        if (y04Var != null) {
            a14 a14Var = y04Var.e;
            int i4 = bkb.Cf;
            int y17 = y(i4);
            if (y17 != this.J2) {
                this.J2 = y17;
                a14Var.a.setColorFilter(new PorterDuffColorFilter(y17, PorterDuff.Mode.MULTIPLY));
            }
            a14Var.b.setTextColor(y(i4));
            a14Var.c.setProgressColor(y(bkb.g6));
        }
        int y18 = y(bkb.Ei);
        if (this.f2 == null || y18 != this.K2) {
            this.K2 = y18;
            this.f2 = new PorterDuffColorFilter(y18, PorterDuff.Mode.SRC_IN);
        }
        int i5 = 0;
        while (true) {
            Drawable[] drawableArr = this.Y0;
            if (i5 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i5];
            if (z) {
                y10 = u(0.4f);
            } else {
                y10 = y(bkb.Ef);
            }
            bkb.C1(drawable, y10, false);
            Drawable drawable2 = drawableArr[i5];
            if (z) {
                y11 = u(0.8f);
            } else {
                y11 = y(bkb.Ff);
            }
            bkb.C1(drawable2, y11, true);
            i5++;
        }
        if (yz3Var != null && (zx3Var = yz3Var.y) != null) {
            zx3Var.d();
        }
        int i6 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Z0;
            if (i6 >= drawableArr2.length) {
                break;
            }
            Drawable drawable3 = drawableArr2[i6];
            if (z) {
                y8 = u(0.4f);
            } else {
                y8 = y(bkb.Df);
            }
            bkb.C1(drawable3, y8, false);
            Drawable drawable4 = drawableArr2[i6];
            if (z) {
                y9 = u(0.8f);
            } else {
                y9 = y(bkb.Ff);
            }
            bkb.C1(drawable4, y9, true);
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
                y6 = u(0.4f);
            } else {
                y6 = y(bkb.Df);
            }
            bkb.C1(drawable5, y6, false);
            Drawable drawable6 = drawableArr3[i7];
            if (z) {
                y7 = u(0.8f);
            } else {
                y7 = y(bkb.Ff);
            }
            bkb.C1(drawable6, y7, true);
            i7++;
        }
        ojb ojbVar = this.b2;
        if (ojbVar != null) {
            if (z) {
                y4 = u(0.4f);
            } else {
                y4 = y(bkb.Ef);
            }
            bkb.C1(ojbVar, y4, false);
            if (z) {
                y5 = u(0.8f);
            } else {
                y5 = y(bkb.Ff);
            }
            bkb.C1(ojbVar, y5, true);
        }
        ojb ojbVar2 = this.c2;
        if (ojbVar2 != null) {
            if (z) {
                y2 = u(0.4f);
            } else {
                y2 = y(bkb.Hf);
            }
            bkb.C1(ojbVar2, y2, false);
            if (z) {
                y3 = u(0.8f);
            } else {
                y3 = y(bkb.Hf);
            }
            bkb.C1(ojbVar2, y3, true);
        }
    }

    public final void U() {
        g04 g04Var = this.Q;
        if (g04Var != null) {
            for (int i = 0; i < g04Var.getChildCount(); i++) {
                View childAt = g04Var.getChildAt(i);
                if (childAt instanceof l04) {
                    ((l04) childAt).a(true);
                }
            }
        }
    }

    public final void V(int i) {
        int i2;
        if (!this.g0) {
            int i3 = -1;
            if (i != -1) {
                int size = getRecentEmoji().size() + (this.e0 ? 1 : 0);
                d04 d04Var = this.S;
                int i4 = d04Var.c;
                ArrayList arrayList = d04Var.y;
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
                        String[][] strArr = ow3.f;
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
                        ArrayList<h04> emojipacks = getEmojipacks();
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (((Integer) arrayList.get(size2)).intValue() <= i) {
                                h04 h04Var = (h04) this.r1.get(size2);
                                while (i5 < emojipacks.size()) {
                                    long j = emojipacks.get(i5).b.id;
                                    long j2 = h04Var.b.id;
                                    if (j == j2 && (!h04Var.g || (!h04Var.f && !this.q1.contains(Long.valueOf(j2))))) {
                                        char[] cArr = ow3.a;
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
        g14 g14Var;
        int i2;
        boolean z3;
        boolean z4;
        b04 b04Var = this.q0;
        int currentPosition = b04Var.getCurrentPosition();
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
        b04Var.d(false);
        this.s0 = -2;
        this.t0 = -2;
        this.u0 = -2;
        Drawable[] drawableArr = this.a1;
        if (!isEmpty) {
            this.s0 = 0;
            b04Var.b(0, drawableArr[0]).setContentDescription(k96.M0(2131746171, null));
            i = 1;
        } else {
            i = 0;
        }
        this.t0 = i;
        b04Var.b(1, drawableArr[1]).setContentDescription(k96.M0(2131750822, null));
        this.u0 = i + 1;
        Typeface typeface = gl.a;
        int i4 = this.d1;
        ArrayList arrayList = na7.q1(i4).x3;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            String str = (String) arrayList.get(i5);
            ru3 g = vu3.g(str);
            if (g != null) {
                TLRPC.Document V = hq6.d0(i4).V(str);
                String k = de9.k(i5 + 3, "tab");
                int i6 = b04Var.y;
                b04Var.y = i6 + 1;
                xza xzaVar = (xza) b04Var.n.get(k);
                if (xzaVar != null) {
                    b04Var.g(k, xzaVar, i6);
                    i2 = currentPosition;
                    z3 = z2;
                } else {
                    i2 = currentPosition;
                    z3 = z2;
                    xzaVar = new xza(b04Var.getContext(), 2);
                    xzaVar.setFocusable(true);
                    xzaVar.setOnClickListener(new ik8(b04Var, (byte) 13));
                    xzaVar.setExpanded(b04Var.g0);
                    xzaVar.a(b04Var.j0);
                    b04Var.e.addView(xzaVar, i6);
                }
                xzaVar.d = false;
                xzaVar.setTag(2131296463, Integer.valueOf(i6));
                xzaVar.setTag(2131296593, g);
                xzaVar.setTag(2131296587, V);
                if (i6 == b04Var.E) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                xzaVar.setSelected(z4);
                b04Var.h.put(k, xzaVar);
                xzaVar.setContentDescription(str);
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
        b04Var.h();
        b04Var.q();
        if (z && isEmpty) {
            b04Var.m(this.t0);
            yy3 yy3Var = this.p0;
            if (yy3Var != null && (g14Var = yy3Var.r) != null) {
                g14Var.I1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = jdc.a;
        if (b04Var.isLaidOut()) {
            if (!isEmpty) {
                if (!z5) {
                    b04Var.k(i7 + 1, 0);
                }
            } else if (z5) {
                b04Var.k(i7 - 1, 0);
            }
        }
    }

    public final void X() {
        y04 y04Var;
        int size = this.j1.size();
        long p = hq6.p(Integer.MAX_VALUE, this.j1);
        ArrayList arrayList = new ArrayList(hq6.d0(this.d1).j0);
        this.j1 = arrayList;
        long p2 = hq6.p(Integer.MAX_VALUE, arrayList);
        if ((this.q0 != null && size == 0 && !this.j1.isEmpty()) || (size != 0 && this.j1.isEmpty())) {
            W();
        }
        if ((size != this.j1.size() || p != p2) && (y04Var = this.o0) != null) {
            y04Var.f();
        }
    }

    public final void Y(boolean z) {
        boolean z2;
        TLRPC.Document document;
        boolean z3;
        byte b;
        boolean z4;
        wjb wjbVar;
        boolean z5;
        boolean z6;
        ArrayList<TLRPC.Document> arrayList;
        boolean z7;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        int i;
        final gz3 gz3Var = this.C0;
        if (gz3Var != null) {
            pkb pkbVar = gz3Var.e;
            if (gz3Var.s != null) {
                return;
            }
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.J1 = -2;
            final byte b2 = 0;
            this.f0 = false;
            this.F1 = 0;
            int currentPosition = gz3Var.getCurrentPosition();
            if (getParent() != null && getVisibility() == 0 && (this.z1.size() != 0 || this.A1.size() != 0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            gz3Var.d(z2);
            int i2 = this.d1;
            hq6 d0 = hq6.d0(i2);
            SharedPreferences sharedPreferences = na7.q1(i2).Y3;
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
            r14 r14Var = this.G0;
            if (r14Var != null) {
                r14Var.f();
            }
            boolean isEmpty = arrayList4.isEmpty();
            long j = 0;
            Drawable[] drawableArr = this.Z0;
            wjb wjbVar2 = null;
            if (!isEmpty && (arrayList3.isEmpty() || sharedPreferences.getLong("featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id)) {
                if (d0.v0[0].isEmpty()) {
                    i = 2;
                } else {
                    i = 3;
                }
                xza c = gz3Var.c(i, drawableArr[i]);
                c.h.setText(k96.M0(2131750819, null));
                c.setContentDescription(k96.M0(2131750821, null));
                int i4 = this.F1;
                this.I1 = i4;
                this.F1 = i4 + 1;
            }
            if (!this.l1.isEmpty()) {
                int i5 = this.F1;
                this.H1 = i5;
                this.F1 = i5 + 1;
                xza c2 = gz3Var.c(1, drawableArr[1]);
                c2.h.setText(k96.M0(2131750826, null));
                c2.setContentDescription(k96.M0(2131750829, null));
            }
            if (!this.k1.isEmpty()) {
                int i6 = this.F1;
                this.G1 = i6;
                this.F1 = i6 + 1;
                xza c3 = gz3Var.c(0, drawableArr[0]);
                c3.h.setText(k96.M0(2131746170, null));
                c3.setContentDescription(k96.M0(2131746171, null));
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
            ArrayList u0 = na7.q1(i2).u0(arrayList6);
            for (int i8 = 0; i8 < u0.size(); i8++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) u0.get(i8);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList5.add(tL_messages_stickerSet2);
                }
            }
            if (this.K1 != null) {
                long j4 = na7.q1(i2).Y3.getLong("group_hide_stickers_" + this.K1.id, -1L);
                TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(this.K1.id));
                if (K0 != null && this.K1.stickerset != null && hc2.N(K0)) {
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
                    TLRPC.Chat K02 = na7.q1(i2).K0(Long.valueOf(this.K1.id));
                    if (K02 == null) {
                        arrayList5.remove(b2);
                        i9--;
                    } else {
                        this.f0 = true;
                        String str = "chat" + K02.id;
                        int i10 = gz3Var.y;
                        gz3Var.y = i10 + 1;
                        xza xzaVar = (xza) gz3Var.n.get(str);
                        if (xzaVar != null) {
                            gz3Var.g(str, xzaVar, i10);
                        } else {
                            xzaVar = new xza(gz3Var.getContext(), b2);
                            xzaVar.setFocusable(true);
                            xzaVar.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    byte b3 = b2;
                                    gz3 gz3Var2 = gz3Var;
                                    switch (b3) {
                                        case 0:
                                            gz3Var2.f.a(((Integer) view.getTag(2131296463)).intValue());
                                            return;
                                        default:
                                            gz3Var2.f.a(((Integer) view.getTag(2131296463)).intValue());
                                            return;
                                    }
                                }
                            });
                            pkbVar.addView(xzaVar, i10);
                            xzaVar.x = true;
                            pb0 pb0Var = new pb0(wjbVar2);
                            pb0Var.s(gl.L(14.0f));
                            pb0Var.p(K02);
                            int i11 = gz3Var.a;
                            be0 be0Var = xzaVar.e;
                            be0Var.setLayerNum(i11);
                            be0Var.f(K02, pb0Var);
                            be0Var.setAspectFit(true);
                            xzaVar.setExpanded(gz3Var.g0);
                            xzaVar.a(gz3Var.j0);
                            xzaVar.h.setText(K02.title);
                        }
                        xzaVar.d = true;
                        xzaVar.setTag(2131296463, Integer.valueOf(i10));
                        if (i10 == gz3Var.E) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        xzaVar.setSelected(z5);
                        gz3Var.h.put(str, xzaVar);
                    }
                    b = 0;
                    wjbVar = null;
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
                    Object w = ba4.w(tL_messages_stickerSet5.set.thumbs, 90, z3, null, z3);
                    if (w == null || tL_messages_stickerSet5.set.gifs) {
                        w = document;
                    }
                    String str2 = "set" + tL_messages_stickerSet5.set.id;
                    int i13 = gz3Var.y;
                    gz3Var.y = i13 + 1;
                    xza xzaVar2 = (xza) gz3Var.n.get(str2);
                    if (xzaVar2 != null) {
                        gz3Var.g(str2, xzaVar2, i13);
                    } else {
                        xzaVar2 = new xza(gz3Var.getContext(), 0);
                        xzaVar2.setFocusable(true);
                        xzaVar2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                byte b3 = b2;
                                gz3 gz3Var2 = gz3Var;
                                switch (b3) {
                                    case 0:
                                        gz3Var2.f.a(((Integer) view.getTag(2131296463)).intValue());
                                        return;
                                    default:
                                        gz3Var2.f.a(((Integer) view.getTag(2131296463)).intValue());
                                        return;
                                }
                            }
                        });
                        xzaVar2.setExpanded(gz3Var.g0);
                        xzaVar2.a(gz3Var.j0);
                        pkbVar.addView(xzaVar2, i13);
                    }
                    xzaVar2.e.setLayerNum(gz3Var.a);
                    b = 0;
                    xzaVar2.d = false;
                    xzaVar2.setTag(w);
                    xzaVar2.setTag(2131296463, Integer.valueOf(i13));
                    xzaVar2.setTag(2131296593, tL_messages_stickerSet5);
                    xzaVar2.setTag(2131296587, document);
                    if (i13 == gz3Var.E) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    xzaVar2.setSelected(z4);
                    gz3Var.h.put(str2, xzaVar2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(tL_messages_stickerSet5.set.title);
                    sb.append(", ");
                    wjbVar = null;
                    sb.append(k96.M0(2131754756, null));
                    xzaVar2.setContentDescription(sb.toString());
                }
                i9++;
                b2 = b;
                wjbVar2 = wjbVar;
            }
            gz3Var.h();
            gz3Var.q();
            if (currentPosition != 0) {
                gz3Var.k(currentPosition, currentPosition);
            }
            l();
        }
    }

    public final void Z() {
        boolean z;
        int i;
        hz3 hz3Var = this.D0;
        gz3 gz3Var = this.C0;
        if (gz3Var != null && hz3Var == null && this.u1 != null) {
            gz3Var.setTranslationY(this.u1.o() * (-gl.L(50.0f)));
        }
        if (hz3Var == null) {
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
        hz3Var.setVisibility(i);
        if (z) {
            Rect rect = this.y2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.y0, rect, null);
            float o = this.u1.o() * gl.L(50.0f);
            int i2 = rect.left;
            if (i2 != 0 || o != 0.0f) {
                this.Y1 = false;
            }
            hz3Var.setTranslationX(i2);
            float translationY = (((getTranslationY() + getTop()) - hz3Var.getTop()) - gz3Var.getExpandedOffset()) - o;
            if (hz3Var.getTranslationY() != translationY) {
                hz3Var.setTranslationY(translationY);
                hz3Var.invalidate();
            }
        }
        if (this.Y1 && z && this.Q0) {
            gz3Var.i(true, this.X1);
            return;
        }
        this.Y1 = false;
        gz3Var.i(false, this.X1);
    }

    @Override
    public final void a(int i) {
        setBottomInset(i);
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t14.a0():void");
    }

    @Override
    public final void b(float f) {
        this.r2 = f;
        S();
    }

    public final void d(String str) {
        if (str != null) {
            if (str.startsWith("animated_") || vu3.h(str)) {
                vu3.a(str);
                int i = 0;
                if (getVisibility() != 0 || this.h.getCurrentItem() != 0) {
                    vu3.s();
                    this.S.F(false);
                }
                vu3.r();
                if (!this.d2) {
                    ArrayList arrayList = this.B2;
                    if (arrayList == null) {
                        this.B2 = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    while (true) {
                        ArrayList arrayList2 = vu3.i;
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
        p8c p8cVar;
        TLRPC.StickerSet stickerSet;
        int i3 = kk7.w0;
        d04 d04Var = this.S;
        ly3 ly3Var = this.R2;
        if (i == i3) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.z0 != null) {
                    Y(((Boolean) objArr[1]).booleanValue());
                    a0();
                    C();
                    l();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    gl.r(ly3Var);
                    gl.e3(ly3Var, 100L);
                    return;
                }
                d04Var.F(false);
            }
        } else if (i == kk7.r3) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.K1;
            if (chatFull != null && chatFull.id == longValue && booleanValue) {
                d04Var.F(true);
            }
        } else if (i == kk7.W0) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                g(booleanValue2);
            }
        } else if (i == kk7.y0) {
            a0();
            sr7 sr7Var = this.x;
            if (sr7Var != null) {
                int childCount = sr7Var.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    sr7Var.getChildAt(i4).invalidate();
                }
            }
            Y(false);
        } else if (i == kk7.z0) {
            if (d04Var != null) {
                d04Var.F(false);
            }
        } else {
            int i5 = kk7.A0;
            t04 t04Var = this.T;
            if (i == i5) {
                Long l = (Long) objArr[0];
                long longValue2 = l.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    o14 o14Var = this.A0;
                    if (o14Var != null && o14Var.d == longValue2 && o14Var.f.size() < tL_messages_stickerSet.documents.size()) {
                        o14Var.f = tL_messages_stickerSet.documents;
                        o14Var.f();
                    }
                    if (t04Var != null && t04Var.d == longValue2 && t04Var.f.size() < tL_messages_stickerSet.documents.size()) {
                        t04Var.f = tL_messages_stickerSet.documents;
                        t04Var.f();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.K1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.id == longValue2) {
                    Y(false);
                }
                HashMap hashMap = this.s1;
                if (hashMap.containsKey(l) && objArr.length >= 2 && ((p8c) hashMap.get(l)) != null && tL_messages_stickerSet != null && (p8cVar = (p8c) hashMap.remove(l)) != null) {
                    p8cVar.a(tL_messages_stickerSet);
                }
                gl.r(ly3Var);
                gl.e3(ly3Var, 100L);
                return;
            }
            int i6 = kk7.k4;
            g04 g04Var = this.Q;
            if (i == i6) {
                bz3 bz3Var = this.E0;
                if (bz3Var != null) {
                    int childCount2 = bz3Var.getChildCount();
                    for (int i7 = 0; i7 < childCount2; i7++) {
                        View childAt = bz3Var.getChildAt(i7);
                        if ((childAt instanceof vza) || (childAt instanceof xya)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (g04Var != null) {
                    g04Var.invalidate();
                    int childCount3 = g04Var.getChildCount();
                    for (int i8 = 0; i8 < childCount3; i8++) {
                        View childAt2 = g04Var.getChildAt(i8);
                        if (childAt2 instanceof c14) {
                            childAt2.invalidate();
                        }
                    }
                }
                gw3 gw3Var = this.C1;
                if (gw3Var != null) {
                    gw3Var.c.invalidate();
                }
                b04 b04Var = this.q0;
                if (b04Var != null) {
                    pkb pkbVar = b04Var.e;
                    int childCount4 = pkbVar.getChildCount();
                    for (int i9 = 0; i9 < childCount4; i9++) {
                        pkbVar.getChildAt(i9).invalidate();
                    }
                }
            } else if (i == kk7.K2) {
                if (g04Var != null && this.e0) {
                    if ((this.W.c.k == 2 || g04Var.getAdapter() == t04Var) && !TextUtils.isEmpty(t04Var.w)) {
                        t04Var.E(t04Var.w, true);
                    }
                }
            } else if (i == kk7.h5) {
                if (d04Var != null) {
                    d04Var.F(false);
                }
                U();
                Y(false);
            }
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        S();
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.h) {
            canvas.save();
            if (this.n.getVisibility() != 8 && !this.v0 && this.x0) {
                canvas.drawColor(bm2.o(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j);
            float Q0 = gl.Q0(this.q2);
            if (Q0 > 0.0f) {
                int p1 = bkb.p1(Q0, y(bkb.yf));
                int i = this.A2;
                GradientDrawable gradientDrawable = this.z2;
                if (i != p1) {
                    gradientDrawable.setColors(new int[]{p1, bkb.p1(0.66f, p1), bm2.o(p1, 0)});
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
        if (i == 2 || w(i).K(0) == null) {
            return;
        }
        rz3 rz3Var = new rz3(getContext(), i2);
        rz3Var.a = !z ? 1 : 0;
        v(i).v0(rz3Var);
    }

    public final void g(boolean z) {
        if (z) {
            X();
            return;
        }
        int size = this.k1.size();
        int size2 = this.l1.size();
        int i = this.d1;
        this.k1 = hq6.d0(i).j0(0, true);
        this.l1 = hq6.d0(i).j0(2, false);
        if (y6c.h(i).p()) {
            this.m1 = hq6.d0(i).j0(7, false);
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
        if (na7.q1(i).E3()) {
            int i4 = 0;
            while (i4 < this.l1.size()) {
                if (k27.W3((TLRPC.Document) this.l1.get(i4))) {
                    this.l1.remove(i4);
                    i4--;
                }
                i4++;
            }
            int i5 = 0;
            while (i5 < this.k1.size()) {
                if (k27.W3((TLRPC.Document) this.k1.get(i5))) {
                    this.k1.remove(i5);
                    i5--;
                }
                i5++;
            }
        }
        if (size != this.k1.size() || size2 != this.l1.size()) {
            Y(false);
        }
        l14 l14Var = this.z0;
        if (l14Var != null) {
            l14Var.f();
        }
        l();
    }

    public int getCurrentPage() {
        return this.B1;
    }

    public ArrayList<h04> getEmojipacks() {
        ArrayList<h04> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.r1;
            if (i < arrayList2.size()) {
                h04 h04Var = (h04) arrayList2.get(i);
                boolean z = h04Var.g;
                ArrayList arrayList3 = this.q1;
                if ((!z && (h04Var.f || arrayList3.contains(Long.valueOf(h04Var.b.id)))) || (h04Var.g && !h04Var.f && !arrayList3.contains(Long.valueOf(h04Var.b.id)))) {
                    arrayList.add(h04Var);
                }
                i++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.d2) {
            return vu3.i;
        }
        if (this.B2 == null) {
            this.B2 = new ArrayList();
        }
        if (vu3.i.size() != this.C2) {
            this.B2.clear();
            int i = 0;
            while (true) {
                ArrayList arrayList = vu3.i;
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
        gz3 gz3Var = this.C0;
        if (gz3Var == null) {
            return 0.0f;
        }
        return gz3Var.getExpandedOffset();
    }

    public final void h(boolean z) {
        int i;
        boolean z2;
        u04 u04Var = this.u1;
        fm0 fm0Var = this.b;
        g04 g04Var = this.Q;
        ty3 ty3Var = this.W;
        if (u04Var != null && u04Var.z()) {
            s49 K = g04Var.K(0);
            if (K == null) {
                ty3Var.e(true, !z);
            } else {
                if (K.a.getTop() < g04Var.getPaddingTop()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ty3Var.e(z2, !z);
            }
            N(false, !z);
            ty3Var.setTranslationY(fm0Var.e * gl.L(15.0f));
        } else if (ty3Var != null && g04Var != null) {
            s49 K2 = g04Var.K(0);
            if (K2 != null) {
                i = K2.a.getTop();
            } else {
                i = -this.c1;
            }
            ty3Var.setTranslationY((fm0Var.e * gl.L(15.0f)) + i);
            ty3Var.e(false, !z);
            i(Math.round(this.J.getTranslationY()));
        }
    }

    public final void i(int i) {
        ObjectAnimator objectAnimator = this.S0[1];
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        boolean z = false;
        s49 K = this.Q.K(0);
        int L = gl.L(38.0f) + i;
        if (L > 0 && (K == null || K.a.getBottom() < L)) {
            z = true;
        }
        N(z, !this.L1);
    }

    public final void j(int i, View view) {
        g04 g04Var;
        s49 K;
        int i2;
        yz3 yz3Var = this.J;
        int[] iArr = this.R0;
        if (view == null) {
            iArr[1] = 0;
            yz3Var.setTranslationY(0.0f);
        } else if (view.getVisibility() == 0 && !this.g0) {
            u04 u04Var = this.u1;
            if (u04Var == null || !u04Var.z()) {
                if (i > 0 && (g04Var = this.Q) != null && g04Var.getVisibility() == 0 && (K = g04Var.K(0)) != null) {
                    int top = K.a.getTop();
                    if (this.e0) {
                        i2 = this.c1;
                    } else {
                        i2 = 0;
                    }
                    if (top + i2 >= g04Var.getPaddingTop()) {
                        return;
                    }
                }
                int i3 = iArr[1] - i;
                iArr[1] = i3;
                if (i3 > 0) {
                    iArr[1] = 0;
                } else if (i3 < (-gl.L(108.0f))) {
                    iArr[1] = -gl.L(108.0f);
                }
                yz3Var.setTranslationY(Math.max(-gl.L(36.0f), iArr[1]));
            }
        }
    }

    public final void k(boolean z) {
        z04 z04Var;
        int M0;
        wy3 wy3Var = this.i0;
        if (wy3Var != null && (wy3Var.getAdapter() instanceof y04)) {
            y04 y04Var = (y04) wy3Var.getAdapter();
            if (!y04Var.s && y04Var.h == 0 && !y04Var.y.isEmpty() && (M0 = (z04Var = this.j0).M0()) != -1 && M0 > z04Var.A() - 5) {
                String str = y04Var.x;
                String str2 = y04Var.r;
                boolean z2 = y04Var.w;
                y04Var.F(str, str2, true, z2, z2);
            }
        }
        u04 u04Var = this.u1;
        yy3 yy3Var = this.p0;
        if (u04Var != null && u04Var.z()) {
            boolean z3 = false;
            s49 K = wy3Var.K(0);
            if (K == null) {
                yy3Var.e(true, !z);
                return;
            }
            if (K.a.getTop() < wy3Var.getPaddingTop()) {
                z3 = true;
            }
            yy3Var.e(z3, !z);
        } else if (yy3Var != null && wy3Var != null) {
            yy3Var.e(true, !z);
        }
    }

    public final void l() {
        int K0;
        gz3 gz3Var = this.C0;
        if (gz3Var != null && (K0 = this.F0.K0()) != -1) {
            int i = this.H1;
            if (i <= 0 && (i = this.G1) <= 0) {
                i = this.F1;
            }
            gz3Var.k(this.z0.F(K0), i);
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
            w39 adapter = this.i0.getAdapter();
            y04 y04Var = this.o0;
            if (adapter == y04Var && y04Var.J >= 0 && this.t0 >= 0 && this.s0 >= 0 && (K0 = this.j0.K0()) != -1) {
                if (K0 >= y04Var.J) {
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
        u04 u04Var = this.u1;
        fm0 fm0Var = this.a;
        bz3 bz3Var = this.E0;
        boolean z2 = false;
        fz3 fz3Var = this.H0;
        if (u04Var != null && u04Var.z()) {
            s49 K = bz3Var.K(0);
            if (K == null) {
                fz3Var.e(true, !z);
            } else {
                if (K.a.getTop() < bz3Var.getPaddingTop()) {
                    z2 = true;
                }
                fz3Var.e(z2, !z);
            }
            fz3Var.setTranslationY(fm0Var.e * gl.L(15.0f));
        } else if (fz3Var != null && bz3Var != null) {
            s49 K2 = bz3Var.K(0);
            if (K2 != null) {
                i = K2.a.getTop();
            } else {
                i = -this.c1;
            }
            fz3Var.setTranslationY((fm0Var.e * gl.L(15.0f)) + i);
            fz3Var.e(false, !z);
        }
    }

    public final void o(int i, int i2) {
        s49 K;
        if (i == 1) {
            j(i2, this.Q);
            return;
        }
        u04 u04Var = this.u1;
        if ((u04Var == null || !u04Var.z()) && !this.K0) {
            o39 w = w(i);
            if (i2 > 0 && w != null && w.getVisibility() == 0 && (K = w.K(0)) != null && K.a.getTop() + this.c1 >= w.getPaddingTop()) {
                return;
            }
            int[] iArr = this.R0;
            int i3 = iArr[i] - i2;
            iArr[i] = i3;
            if (i3 > 0) {
                iArr[i] = 0;
            } else if (i3 < (-gl.L(288.0f))) {
                iArr[i] = -gl.L(288.0f);
            }
            if (i == 0) {
                Z();
            } else {
                x(i).setTranslationY(Math.max(-gl.L(48.0f), iArr[i]));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wtc wtcVar = this.M2;
        if (wtcVar != null) {
            wtcVar.a();
            this.M2 = null;
        }
        wtc wtcVar2 = (wtc) new fu0(kk7.f(this.d1), this).b;
        wtcVar2.e(kk7.k4);
        wtcVar2.b(kk7.K2);
        wtcVar2.b(kk7.r3);
        this.M2 = wtcVar2;
        if (this.z0 != null) {
            wtcVar2.b(kk7.w0);
            wtcVar2.b(kk7.W0);
            wtcVar2.b(kk7.y0);
            wtcVar2.b(kk7.A0);
            wtcVar2.b(kk7.h5);
            gl.d3(new ly3(this, (byte) 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gw3 gw3Var = this.C1;
        if (gw3Var != null && gw3Var.isShowing()) {
            gw3Var.dismiss();
        }
        xv2 e = xv2.e();
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
            C();
        }
        super.onLayout(z, i, i2, i3, i4);
        S();
        Z();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.L1 = true;
        boolean z = gl.E;
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
                    int i3 = bkb.yf;
                    setBackgroundColor(y(i3));
                    if (z2) {
                        view.setBackgroundColor(y(i3));
                    }
                }
                this.M1 = 0;
            }
        } else if (this.M1 != 1) {
            if (!this.L2) {
                setOutlineProvider(this.N1);
                setClipToOutline(true);
                setElevation(gl.L(2.0f));
            }
            setBackgroundResource(2131232743);
            Drawable background = getBackground();
            int i4 = bkb.yf;
            background.setColorFilter(new PorterDuffColorFilter(y(i4), PorterDuff.Mode.MULTIPLY));
            if (z2 && this.v0) {
                view.setBackgroundColor(y(i4));
            }
            this.M1 = 1;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        this.L1 = false;
        setTranslationY(getTranslationY());
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 4;
        if (i == 0) {
            n(false);
            float f3 = 1.0f - this.a.e;
            fz3 fz3Var = this.H0;
            fz3Var.setAlpha(f3);
            if (f3 > 0.0f) {
                i4 = 0;
            } else {
                i4 = 4;
            }
            fz3Var.setVisibility(i4);
            float f4 = 1.0f - f3;
            wm4 wm4Var = this.I0;
            wm4Var.setAlpha(f4);
            wm4Var.setTranslationY((-gl.L(15.0f)) * f3);
            int i7 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
            if (i7 > 0) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            wm4Var.setVisibility(i5);
            st stVar = this.N;
            stVar.setAlpha(f4);
            stVar.setTranslationY(gl.L(30.0f) * f3);
            if (i7 > 0) {
                i6 = 0;
            }
            stVar.setVisibility(i6);
            S();
            this.y0.invalidate();
        } else if (i == 1) {
            h(false);
            float f5 = 1.0f - this.b.e;
            ty3 ty3Var = this.W;
            ty3Var.setAlpha(f5);
            if (f5 > 0.0f) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            ty3Var.setVisibility(i2);
            float f6 = 1.0f - f5;
            wm4 wm4Var2 = this.V;
            wm4Var2.setAlpha(f6);
            wm4Var2.setTranslationY((-gl.L(15.0f)) * f5);
            int i8 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
            if (i8 > 0) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            wm4Var2.setVisibility(i3);
            st stVar2 = this.L;
            stVar2.setAlpha(f6);
            stVar2.setTranslationY(gl.L(30.0f) * f5);
            if (i8 > 0) {
                i6 = 0;
            }
            stVar2.setVisibility(i6);
            S();
            this.K.invalidate();
        }
    }

    public final void q() {
        HashMap hashMap = vu3.a;
        na7.b1().edit().putBoolean("filled_default", true).commit();
        vu3.h.clear();
        vu3.i.clear();
        vu3.r();
        this.S.F(false);
    }

    public final void r(long j, boolean z) {
        h14 h14Var;
        t26 t26Var;
        View view;
        o39 o39Var;
        int i;
        int i2;
        TLRPC.TL_messages_stickerSet p0;
        l14 l14Var;
        int E;
        AnimatorSet animatorSet = this.N0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i3 = 2;
        if (currentItem == 2 && j != -1 && (p0 = hq6.d0(this.d1).p0(j)) != null && (E = (l14Var = this.z0).E(p0)) >= 0 && E < l14Var.b()) {
            G(E, gl.L(48.0f));
        }
        int i4 = 0;
        y04 y04Var = this.k0;
        if (y04Var != null) {
            y04Var.L = false;
        }
        int i5 = 0;
        while (i5 < 3) {
            o39 o39Var2 = this.E0;
            o39 o39Var3 = this.i0;
            yy3 yy3Var = this.p0;
            o39 o39Var4 = this.Q;
            if (i5 == 0) {
                h14Var = this.W;
                t26Var = this.R;
                view = this.J;
                o39Var = o39Var4;
            } else if (i5 == 1) {
                t26Var = this.j0;
                view = this.q0;
                o39Var = o39Var3;
                h14Var = yy3Var;
            } else {
                h14Var = this.H0;
                t26Var = this.F0;
                view = this.C0;
                o39Var = o39Var2;
            }
            if (h14Var == null) {
                i2 = i4;
                i = i3;
            } else {
                int i6 = i4;
                g14 g14Var = h14Var.r;
                int i7 = i3;
                h14Var.d.setText("");
                if (g14Var != null) {
                    g14Var.I1(null);
                    g14Var.G1();
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
                        fArr2[i6] = gl.L(36.0f);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(o39Var, property, fArr2);
                        float[] fArr3 = new float[1];
                        fArr3[i6] = gl.L(36.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(h14Var, property, fArr3);
                        Animator[] animatorArr = new Animator[3];
                        animatorArr[i6] = ofFloat;
                        animatorArr[1] = ofFloat2;
                        animatorArr[i7] = ofFloat3;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        float[] fArr4 = new float[1];
                        fArr4[i6] = gl.L(36.0f) - i8;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(o39Var, property, fArr4);
                        Animator[] animatorArr2 = new Animator[1];
                        animatorArr2[i6] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.N0.setDuration(200L);
                    this.N0.setInterpolator(s33.h);
                    this.N0.addListener(new i8(this, t26Var, o39Var, (byte) 5));
                    this.N0.start();
                    i2 = i6;
                    i = i7;
                } else {
                    if (h14Var != yy3Var) {
                        h14Var.setTranslationY(gl.L(36.0f) - i8);
                    }
                    i = i7;
                    if (view != null && i5 != i) {
                        view.setTranslationY(0.0f);
                    }
                    if (o39Var == o39Var2) {
                        i2 = i6;
                        o39Var.setPadding(i2, gl.L(36.0f), i2, gl.L(44.0f) + this.q2);
                    } else {
                        i2 = i6;
                        if (o39Var == o39Var3) {
                            o39Var.setPadding(i2, gl.L(40.0f), i2, gl.L(44.0f) + this.q2);
                        } else {
                            if (o39Var == o39Var4) {
                                o39Var.setPadding(gl.L(5.0f), gl.L(36.0f), gl.L(5.0f), gl.L(44.0f) + this.q2);
                            }
                            i2 = 0;
                        }
                    }
                    t26Var.g1(i2, i2);
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

    @Override
    public final void requestLayout() {
        if (this.L1) {
            return;
        }
        super.requestLayout();
    }

    public final void s(boolean z) {
        r(-1L, z);
    }

    public void setBlurredBackgroundDrawableFactory(kl0 kl0Var) {
        wjb wjbVar = this.a2;
        View view = this.y;
        if (view != null) {
            il0 c = kl0Var.c(view, null, false);
            c.p(nod.e(wjbVar));
            c.r(gl.L(18.0f));
            c.q(gl.L(6.0f));
            view.setBackground(c);
        }
        View view2 = this.F;
        if (view2 != null) {
            il0 c2 = kl0Var.c(view2, null, false);
            c2.p(nod.e(wjbVar));
            c2.r(gl.L(18.0f));
            c2.q(gl.L(6.0f));
            view2.setBackground(c2);
        }
        View view3 = this.x;
        if (view3 != null) {
            il0 c3 = kl0Var.c(view3, null, false);
            c3.p(nod.e(wjbVar));
            c3.r(gl.L(18.0f));
            c3.q(gl.L(6.0f));
            view3.setBackground(c3);
        }
        View view4 = this.E;
        if (view4 != null) {
            il0 c4 = kl0Var.c(view4, null, false);
            c4.p(nod.e(wjbVar));
            c4.r(gl.L(18.0f));
            c4.q(gl.L(6.0f));
            view4.setBackground(c4);
        }
    }

    public void setBottomInset(int i) {
        if (this.q2 != i) {
            this.q2 = i;
            f(i, this.L);
            f(i, this.N);
            f(gl.L(44.0f) + i, this.Q);
            f(gl.L(44.0f) + i, this.E0);
            f(gl.L(44.0f) + i, this.i0);
            FrameLayout frameLayout = this.s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i);
            }
            S();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.K1 = chatFull;
        Y(false);
    }

    public void setDelegate(u04 u04Var) {
        this.u1 = u04Var;
    }

    public void setDragListener(a04 a04Var) {
        this.P0 = a04Var;
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        fz3 fz3Var = this.H0;
        if (fz3Var != null) {
            fz3Var.d.setEnabled(z);
        }
        yy3 yy3Var = this.p0;
        if (yy3Var != null) {
            yy3Var.d.setEnabled(z);
        }
        ty3 ty3Var = this.W;
        if (ty3Var != null) {
            ty3Var.d.setEnabled(z);
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
        S();
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
                vu3.s();
                this.S.F(false);
                wtc wtcVar = this.N2;
                int i2 = this.d1;
                if (wtcVar == null) {
                    wtcVar = (wtc) new fu0(kk7.f(i2), this).b;
                    wtcVar.b(kk7.w0);
                    this.N2 = wtcVar;
                }
                if (this.z0 != null) {
                    if (!this.O2) {
                        this.O2 = true;
                        wtcVar.b(kk7.W0);
                    }
                    Y(false);
                    C();
                }
                g(true);
                g(false);
                hq6.d0(i2).X0(true, true, false, 0);
                hq6.d0(i2).X0(false, true, false, 0);
                hq6.d0(i2).X0(false, true, false, 2);
            }
            mz3 mz3Var = this.U0;
            if (mz3Var != null) {
                mz3Var.a();
            }
        }
    }

    public final void t(boolean z) {
        l14 l14Var;
        boolean z2 = this.T2;
        this.T2 = z;
        if (z2 && !z) {
            int i = this.B1;
            if (i == 0) {
                d04 d04Var = this.S;
                if (d04Var != null) {
                    d04Var.F(false);
                }
            } else if (i == 1) {
                y04 y04Var = this.o0;
                if (y04Var != null) {
                    y04Var.f();
                }
            } else if (i == 2 && (l14Var = this.z0) != null) {
                l14Var.f();
            }
        }
    }

    public final int u(float f) {
        return bm2.o(bkb.v0(bkb.Ml, this.a2), (int) (f * 255.0f));
    }

    @Override
    public final void updateColors() {
        try {
            T();
            ix4 ix4Var = this.m2;
            if (ix4Var != null) {
                ix4Var.a(y(bkb.c6));
            }
            sr7 sr7Var = this.x;
            if (sr7Var != null) {
                sr7Var.setIndicatorColor(bm2.o(y(bkb.Ff), 20));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final r35 v(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return this.j0;
                }
                w26.j(de9.k(i, "Unexpected argument: "));
                return null;
            }
            return this.R;
        }
        return this.F0;
    }

    public final o39 w(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return this.i0;
                }
                w26.j(de9.k(i, "Unexpected argument: "));
                return null;
            }
            return this.Q;
        }
        return this.E0;
    }

    public final HorizontalScrollView x(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return this.q0;
                }
                w26.j(de9.k(i, "Unexpected argument: "));
                return null;
            }
            return this.J;
        }
        return this.C0;
    }

    public final int y(int i) {
        wjb wjbVar = this.a2;
        if (wjbVar != null) {
            return wjbVar.h(i);
        }
        return bkb.w0(null, i, false);
    }

    public final void z() {
        fz3 fz3Var = this.H0;
        if (fz3Var != null) {
            fz3Var.a();
        }
        yy3 yy3Var = this.p0;
        if (yy3Var != null) {
            yy3Var.a();
        }
        ty3 ty3Var = this.W;
        if (ty3Var != null) {
            ty3Var.a();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void D(float f, int i) {
    }
}
