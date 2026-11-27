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
import org.telegram.ui.ActionBar.e;
public class o24 extends FrameLayout implements snb, s84, fn7, fp5 {
    public static final int U2 = 0;
    public final j24 A0;
    public final LongSparseArray A1;
    public int A2;
    public final kz3 B0;
    public int B1;
    public ArrayList B2;
    public final b04 C0;
    public final bx3 C1;
    public int C2;
    public final c04 D0;
    public final int D1;
    public long D2;
    public final ImageView E;
    public final wz3 E0;
    public final int[] E1;
    public final fm0 E2;
    public final ImageView F;
    public final xz3 F0;
    public int F1;
    public ArrayList F2;
    public AnimatorSet G;
    public m24 G0;
    public int G1;
    public Drawable G2;
    public AnimatorSet H;
    public final a04 H0;
    public int H1;
    public int H2;
    public float I;
    public final bp4 I0;
    public int I1;
    public int I2;
    public final t04 J;
    public boolean J0;
    public int J1;
    public int J2;
    public final o04 K;
    public boolean K0;
    public TLRPC.ChatFull K1;
    public int K2;
    public final tt L;
    public boolean L0;
    public boolean L1;
    public boolean L2;
    public final zo4 M;
    public final i14 M0;
    public int M1;
    public u8a M2;
    public final tt N;
    public AnimatorSet N0;
    public final bn9 N1;
    public u8a N2;
    public final zo4 O;
    public final xb O0;
    public boolean O1;
    public boolean O2;
    public final View P;
    public v04 P0;
    public int P1;
    public AnimatorSet P2;
    public final b14 Q;
    public boolean Q0;
    public boolean Q1;
    public mz3 Q2;
    public final p04 R;
    public final int[] R0;
    public boolean R1;
    public final gz3 R2;
    public final y04 S;
    public final ObjectAnimator[] S0;
    public x14 S1;
    public boolean S2;
    public final o14 T;
    public boolean T0;
    public float T1;
    public boolean T2;
    public m24 U;
    public h04 U0;
    public float U1;
    public final bp4 V;
    public boolean V0;
    public float V1;
    public final oz3 W;
    public boolean W0;
    public float W1;
    public String[] X0;
    public float X1;
    public final Drawable[] Y0;
    public boolean Y1;
    public final Drawable[] Z0;
    public final e Z1;
    public final fm0 a;
    public AnimatorSet a0;
    public final Drawable[] a1;
    public final vnb a2;
    public final fm0 b;
    public final hw6 b0;
    public final String[] b1;
    public final nnb b2;
    public int c;
    public final hw6 c0;
    public final int c1;
    public final nnb c2;
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
    public final zz3 g2;
    public final d04 h;
    public final qz3 h0;
    public boolean h1;
    public final k04 h2;
    public final rz3 i0;
    public TLRPC.TL_messages_stickerSet i1;
    public boolean i2;
    public final u14 j0;
    public ArrayList j1;
    public final boolean j2;
    public final t14 k0;
    public ArrayList k1;
    public final tq3 k2;
    public final w14 l0;
    public ArrayList l1;
    public final mr0 l2;
    public final HashMap m0;
    public ArrayList m1;
    public final oz4 m2;
    public final FrameLayout n;
    public final kz3 n0;
    public final ArrayList n1;
    public final vy4 n2;
    public final t14 o0;
    public final ArrayList o1;
    public boolean o2;
    public final tz3 p0;
    public final ArrayList p1;
    public boolean p2;
    public final w04 q0;
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
    public p14 u1;
    public int u2;
    public boolean v0;
    public long v1;
    public long v2;
    public final View w;
    public boolean w0;
    public boolean w1;
    public boolean w2;
    public final yu7 x;
    public boolean x0;
    public boolean x1;
    public boolean x2;
    public final e04 y;
    public final uz3 y0;
    public final TLRPC.StickerSetCovered[] y1;
    public final Rect y2;
    public final g24 z0;
    public final LongSparseArray z1;
    public final GradientDrawable z2;

    public o24(e eVar, boolean z, boolean z2, boolean z3, Context context, boolean z4, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z5, final vnb vnbVar, boolean z6, boolean z7) {
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
        vy4 vy4Var;
        boolean z8;
        Field field;
        y04 y04Var;
        boolean z9;
        boolean z10;
        ll0 ll0Var;
        int i;
        k43 k43Var = k43.h;
        this.a = new fm0(0, this, k43Var, 320L, false);
        this.b = new fm0(1, this, k43Var, 320L, false);
        this.c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.d0 = true;
        this.l0 = new w14(this);
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
        int i2 = yac.t0;
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
        this.g2 = new zz3(this, (byte) 0);
        this.h2 = new k04(this);
        this.i2 = true;
        vy4 vy4Var2 = new vy4();
        this.n2 = vy4Var2;
        this.r2 = -1.0f;
        this.t2 = -1;
        this.u2 = -1;
        this.v2 = -1L;
        this.w2 = false;
        this.x2 = true;
        this.y2 = new Rect();
        this.z2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.E2 = new fm0(0, new hz3(this, (byte) 3), k43Var, 380L, true);
        this.R2 = new gz3(this, (byte) 1);
        this.S2 = false;
        this.v0 = z5;
        this.Z1 = eVar;
        this.d2 = z;
        this.a2 = vnbVar;
        this.j2 = z7;
        oz4 oz4Var = new oz4();
        this.m2 = oz4Var;
        oz4Var.a(y(aob.d6));
        if (z6) {
            s(true);
        }
        vm2.o(y(aob.Nl), 30);
        int L = hl.L(50.0f);
        this.c1 = L;
        this.e0 = z4;
        if (z7) {
            y = u(0.4f);
            y2 = u(0.8f);
        } else {
            y = y(aob.Jf);
            y2 = y(aob.Gf);
        }
        nnb V = aob.V(context, 2131232759, y, y2);
        if (z7) {
            y3 = u(0.4f);
            y4 = u(0.8f);
        } else {
            y3 = y(aob.Jf);
            y4 = y(aob.Gf);
        }
        nnb V2 = aob.V(context, 2131232756, y3, y4);
        if (z7) {
            y5 = u(0.4f);
            y6 = u(0.8f);
        } else {
            y5 = y(aob.Jf);
            y6 = y(aob.Gf);
        }
        this.Y0 = new Drawable[]{V, V2, aob.V(context, 2131232760, y5, y6)};
        if (z7) {
            y7 = u(0.4f);
            y8 = u(0.8f);
        } else {
            y7 = y(aob.Ef);
            y8 = y(aob.Gf);
        }
        nnb V3 = aob.V(context, 2131232130, y7, y8);
        if (z7) {
            y9 = u(0.4f);
            y10 = u(0.8f);
        } else {
            y9 = y(aob.Ef);
            y10 = y(aob.Gf);
        }
        nnb V4 = aob.V(context, 2131231066, y9, y10);
        if (z7) {
            y11 = u(0.4f);
            y12 = u(0.8f);
        } else {
            y11 = y(aob.Ef);
            y12 = y(aob.Gf);
        }
        nnb V5 = aob.V(context, 2131231069, y11, y12);
        if (z7) {
            y13 = u(0.4f);
            y14 = u(0.8f);
        } else {
            y13 = y(aob.Ef);
            y14 = y(aob.Gf);
        }
        nnb V6 = aob.V(context, 2131231067, y13, y14);
        this.b2 = V6;
        int i3 = aob.If;
        nnb V7 = aob.V(context, 2131231068, y(i3), y(i3));
        this.c2 = V7;
        this.Z0 = new Drawable[]{V3, V4, V5, new LayerDrawable(new Drawable[]{V6, V7})};
        if (z7) {
            y15 = u(0.4f);
            y16 = u(0.8f);
        } else {
            y15 = y(aob.Ef);
            y16 = y(aob.Gf);
        }
        nnb V8 = aob.V(context, 2131232130, y15, y16);
        if (z7) {
            y17 = u(0.4f);
            y18 = u(0.8f);
        } else {
            y17 = y(aob.Ef);
            y18 = y(aob.Gf);
        }
        this.a1 = new Drawable[]{V8, aob.V(context, 2131232786, y17, y18)};
        this.b1 = new String[]{ob6.M0(2131751160, null), ob6.M0(2131751159, null), ob6.M0(2131751158, null), ob6.M0(2131751157, null), ob6.M0(2131751156, null), ob6.M0(2131751155, null), ob6.M0(2131751154, null), ob6.M0(2131751153, null)};
        this.K1 = chatFull;
        Paint paint = new Paint(1);
        this.t1 = paint;
        paint.setColor(y(aob.Sf));
        yi yiVar = yhc.a;
        this.N1 = new bn9(hl.L(6.0f));
        o04 o04Var = new o04(this, context);
        this.K = o04Var;
        ?? obj = new Object();
        obj.a = (byte) 0;
        obj.b = o04Var;
        arrayList.add(obj);
        if (z) {
            ls6.d0(i2).D(5);
            ls6.d0(i2).y();
            this.f2 = new PorterDuffColorFilter(y(aob.Fi), PorterDuff.Mode.SRC_IN);
        }
        b14 b14Var = new b14(this, context);
        this.Q = b14Var;
        vy4Var2.b(b14Var);
        zb3 zb3Var = new zb3();
        zb3Var.c = (short) 220;
        zb3Var.e = (short) 220;
        zb3Var.f = (short) 160;
        zb3Var.g = (short) 160;
        zb3Var.i = k43.g;
        b14Var.setItemAnimator(zb3Var);
        b14Var.setOnTouchListener(new View.OnTouchListener(this) {
            public final o24 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                byte b = r3;
                o24 o24Var = this.b;
                switch (b) {
                    case 0:
                        rw2 e = rw2.e();
                        b14 b14Var2 = o24Var.Q;
                        o24Var.getMeasuredHeight();
                        return e.h(motionEvent, b14Var2, null, o24Var.h2, vnbVar);
                    case 1:
                        return rw2.e().h(motionEvent, o24Var.i0, o24Var.n0, o24Var.h2, vnbVar);
                    default:
                        rw2 e2 = rw2.e();
                        wz3 wz3Var = o24Var.E0;
                        o24Var.getMeasuredHeight();
                        return e2.h(motionEvent, wz3Var, o24Var.B0, o24Var.h2, vnbVar);
                }
            }
        });
        b14Var.setOnItemLongClickListener(new hz3(this, (byte) 1));
        b14Var.setInstantClick(true);
        p04 p04Var = new p04(this);
        this.R = p04Var;
        b14Var.setLayoutManager(p04Var);
        b14Var.setTopGlowOffset(hl.L(38.0f));
        b14Var.setBottomGlowOffset(hl.L(36.0f));
        b14Var.setPadding(hl.L(5.0f), hl.L(36.0f), hl.L(5.0f), hl.L(44.0f));
        int i4 = aob.zf;
        yob.l(b14Var, 21, i4, vnbVar);
        b14Var.setItemSelectorColorProvider(new su3((byte) 6));
        b14Var.setClipToPadding(false);
        p04Var.O = new q04(this);
        y04 y04Var2 = new y04(this);
        this.S = y04Var2;
        b14Var.setAdapter(y04Var2);
        b14Var.i(new lr(this, (byte) 5));
        this.T = new o14(this, context);
        o04Var.addView(b14Var, tre.c(-1.0f, -1));
        hw6 hw6Var = new hw6(b14Var, p04Var);
        this.c0 = hw6Var;
        hw6Var.r = new r04(this);
        b14Var.setOnScrollListener(new s04(this));
        t04 t04Var = new t04(this, context, vnbVar, z, eVar != null ? new gz3(this, (byte) 2) : null, z7);
        this.J = t04Var;
        if (z4) {
            oz3 oz3Var = new oz3(this, context);
            this.W = oz3Var;
            o04Var.addView(oz3Var, new FrameLayout.LayoutParams(-1, hl.e1() + L));
            oz3Var.d.setOnFocusChangeListener(new pz3(this));
            bp4 bp4Var = new bp4(context, vnbVar);
            this.V = bp4Var;
            bp4Var.setVisibility(8);
            bp4Var.setOnBackClickListener(new View.OnClickListener(this) {
                public final o24 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    c24 c24Var;
                    byte b = r2;
                    o24 o24Var = this.b;
                    switch (b) {
                        case 0:
                            o14 o14Var = o24Var.T;
                            j14 j14Var = o14Var.c;
                            int childCount = j14Var.getChildCount();
                            for (int i5 = 0; i5 < childCount; i5++) {
                                ((ap4) j14Var.getChildAt(i5)).a(false, true);
                            }
                            o14Var.d = 0L;
                            o14Var.G.b.a(false, true);
                            o14Var.f();
                            return;
                        case 1:
                            j24 j24Var = o24Var.A0;
                            j14 j14Var2 = j24Var.c;
                            int childCount2 = j14Var2.getChildCount();
                            for (int i6 = 0; i6 < childCount2; i6++) {
                                ((ap4) j14Var2.getChildAt(i6)).a(false, true);
                            }
                            j24Var.d = 0L;
                            j24Var.R.a.a(false, true);
                            j24Var.f();
                            return;
                        case 2:
                            p14 p14Var = o24Var.u1;
                            if (p14Var != null) {
                                p14Var.v();
                                return;
                            }
                            return;
                        default:
                            int currentItem = o24Var.h.getCurrentItem();
                            if (currentItem == 0) {
                                c24Var = o24Var.W;
                            } else if (currentItem == 1) {
                                c24Var = o24Var.p0;
                            } else {
                                c24Var = o24Var.H0;
                            }
                            if (c24Var != null) {
                                a24 a24Var = c24Var.d;
                                a24Var.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                a24Var.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                a24Var.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            o04Var.addView(bp4Var, new FrameLayout.LayoutParams(-1, L));
        }
        if (Color.alpha(y(i4)) >= 255) {
            yob.h(i4, vnbVar, t04Var);
        }
        y04Var2.G(true);
        t04Var.p(getEmojipacks());
        o04Var.addView(t04Var, tre.c(36.0f, -1));
        View view = new View(context);
        this.P = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i5 = aob.Cf;
        yob.h(i5, vnbVar, view);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, hl.e1(), 51);
        layoutParams.topMargin = hl.L(36.0f);
        o04Var.addView(view, layoutParams);
        zo4 zo4Var = new zo4(context, vnbVar);
        this.M = zo4Var;
        tt ttVar = new tt(context, vnbVar, (byte) 16);
        this.L = ttVar;
        ttVar.setVisibility(8);
        ttVar.addView(zo4Var, tre.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        o04Var.addView(ttVar, tre.e(-1, -2, 80));
        if (z2) {
            wu9 wu9Var = wu9.b;
            if (z3) {
                qz3 qz3Var = new qz3(this, context);
                this.h0 = qz3Var;
                ?? obj2 = new Object();
                obj2.a = (byte) 1;
                obj2.b = qz3Var;
                arrayList.add(obj2);
                rz3 rz3Var = new rz3(this, context);
                this.i0 = rz3Var;
                vy4Var2.b(rz3Var);
                rz3Var.setClipToPadding(false);
                u14 u14Var = new u14(this);
                this.j0 = u14Var;
                rz3Var.setLayoutManager(u14Var);
                rz3Var.i(new sz3(this));
                rz3Var.setPadding(0, L, 0, hl.L(44.0f) + this.q2);
                ((cma) rz3Var.getItemAnimator()).m = false;
                t14 t14Var = new t14(this, context, true, Integer.MAX_VALUE);
                this.o0 = t14Var;
                rz3Var.setAdapter(t14Var);
                this.k0 = new t14(this, context, false, 0);
                rz3Var.setOnScrollListener(new n24(this, 2));
                rz3Var.setOnTouchListener(new View.OnTouchListener(this) {
                    public final o24 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        byte b = r3;
                        o24 o24Var = this.b;
                        switch (b) {
                            case 0:
                                rw2 e = rw2.e();
                                b14 b14Var2 = o24Var.Q;
                                o24Var.getMeasuredHeight();
                                return e.h(motionEvent, b14Var2, null, o24Var.h2, vnbVar);
                            case 1:
                                return rw2.e().h(motionEvent, o24Var.i0, o24Var.n0, o24Var.h2, vnbVar);
                            default:
                                rw2 e2 = rw2.e();
                                wz3 wz3Var = o24Var.E0;
                                o24Var.getMeasuredHeight();
                                return e2.h(motionEvent, wz3Var, o24Var.B0, o24Var.h2, vnbVar);
                        }
                    }
                });
                ?? r10 = new r69(this) {
                    public final o24 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void e(int i6, View view2) {
                        int i7;
                        String str;
                        byte b = r2;
                        o24 o24Var = this.b;
                        switch (b) {
                            case 0:
                                rz3 rz3Var2 = o24Var.i0;
                                t14 t14Var2 = o24Var.k0;
                                t14 t14Var3 = o24Var.o0;
                                if (o24Var.u1 != null) {
                                    t14Var3.getClass();
                                    ArrayList arrayList2 = t14Var3.y;
                                    if (rz3Var2.getAdapter() == t14Var3) {
                                        if (i6 >= 0) {
                                            int i8 = t14Var3.I;
                                            if (i6 < i8) {
                                                o24Var.u1.u(view2, o24Var.j1.get(i6), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i8 > 0) {
                                                i7 = (i6 - i8) - 1;
                                            } else {
                                                i7 = i6;
                                            }
                                            if (i7 >= 0 && i7 < arrayList2.size()) {
                                                o24Var.u1.u(view2, arrayList2.get(i7), null, t14Var3.n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (rz3Var2.getAdapter() == t14Var2 && i6 >= 0 && i6 < t14Var2.y.size()) {
                                        o24Var.u1.u(view2, t14Var2.y.get(i6), t14Var2.x, t14Var2.n, true, 0, 0);
                                        o24Var.W();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                j79 adapter = o24Var.E0.getAdapter();
                                j24 j24Var = o24Var.A0;
                                if (adapter == j24Var) {
                                    str = j24Var.O;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof x2b) {
                                    x2b x2bVar = (x2b) view2;
                                    if (x2bVar.getSticker() != null && r47.W3(x2bVar.getSticker()) && !yac.h(k5.a(o24Var.d1).a).p()) {
                                        rw2.e().m(x2bVar);
                                        return;
                                    }
                                    rw2.e().j();
                                    if (!x2bVar.r) {
                                        x2bVar.r = true;
                                        x2bVar.n = 0.5f;
                                        x2bVar.y = 0L;
                                        w2b w2bVar = x2bVar.a;
                                        w2bVar.setAlpha(0.5f * x2bVar.I);
                                        w2bVar.invalidate();
                                        x2bVar.s = System.currentTimeMillis();
                                        x2bVar.invalidate();
                                        o24Var.u1.x(x2bVar, x2bVar.getSticker(), str2, x2bVar.getParentObject(), x2bVar.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.n0 = r10;
                rz3Var.setOnItemClickListener((r69) r10);
                qz3Var.addView(rz3Var, tre.c(-1.0f, -1));
                tz3 tz3Var = new tz3(this, context);
                this.p0 = tz3Var;
                qz3Var.addView(tz3Var, new FrameLayout.LayoutParams(-1, hl.e1() + L));
                w04 w04Var = new w04(this, context, vnbVar);
                this.q0 = w04Var;
                w04Var.setType(wu9Var);
                w04Var.setUnderlineHeight(hl.e1());
                i = i3;
                w04Var.setIndicatorColor(y(i));
                w04Var.setUnderlineColor(y(i5));
                yob.h(i4, vnbVar, w04Var);
                V();
                w04Var.setDelegate(new hz3(this, (byte) 2));
                t14Var.F("", "", true, true, true);
            } else {
                i = i3;
            }
            uz3 uz3Var = new uz3(this, context, z5);
            this.y0 = uz3Var;
            ls6.d0(i2).D(0);
            ls6.d0(i2).z();
            wz3 wz3Var = new wz3(this, context);
            this.E0 = wz3Var;
            vy4Var2.b(wz3Var);
            xz3 xz3Var = new xz3(this);
            this.F0 = xz3Var;
            wz3Var.setLayoutManager(xz3Var);
            xz3Var.O = new yz3(this);
            vy4Var = vy4Var2;
            wz3Var.setPadding(0, hl.L(36.0f), 0, hl.L(44.0f));
            wz3Var.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.a = (byte) 2;
            obj3.b = uz3Var;
            arrayList.add(obj3);
            this.A0 = new j24(this, context);
            g24 g24Var = new g24(this, context);
            this.z0 = g24Var;
            wz3Var.setAdapter(g24Var);
            wz3Var.setOnTouchListener(new View.OnTouchListener(this) {
                public final o24 b;

                {
                    this.b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    byte b = r3;
                    o24 o24Var = this.b;
                    switch (b) {
                        case 0:
                            rw2 e = rw2.e();
                            b14 b14Var2 = o24Var.Q;
                            o24Var.getMeasuredHeight();
                            return e.h(motionEvent, b14Var2, null, o24Var.h2, vnbVar);
                        case 1:
                            return rw2.e().h(motionEvent, o24Var.i0, o24Var.n0, o24Var.h2, vnbVar);
                        default:
                            rw2 e2 = rw2.e();
                            wz3 wz3Var2 = o24Var.E0;
                            o24Var.getMeasuredHeight();
                            return e2.h(motionEvent, wz3Var2, o24Var.B0, o24Var.h2, vnbVar);
                    }
                }
            });
            ?? r5 = new r69(this) {
                public final o24 b;

                {
                    this.b = this;
                }

                @Override
                public final void e(int i6, View view2) {
                    int i7;
                    String str;
                    byte b = r2;
                    o24 o24Var = this.b;
                    switch (b) {
                        case 0:
                            rz3 rz3Var2 = o24Var.i0;
                            t14 t14Var2 = o24Var.k0;
                            t14 t14Var3 = o24Var.o0;
                            if (o24Var.u1 != null) {
                                t14Var3.getClass();
                                ArrayList arrayList2 = t14Var3.y;
                                if (rz3Var2.getAdapter() == t14Var3) {
                                    if (i6 >= 0) {
                                        int i8 = t14Var3.I;
                                        if (i6 < i8) {
                                            o24Var.u1.u(view2, o24Var.j1.get(i6), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i8 > 0) {
                                            i7 = (i6 - i8) - 1;
                                        } else {
                                            i7 = i6;
                                        }
                                        if (i7 >= 0 && i7 < arrayList2.size()) {
                                            o24Var.u1.u(view2, arrayList2.get(i7), null, t14Var3.n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (rz3Var2.getAdapter() == t14Var2 && i6 >= 0 && i6 < t14Var2.y.size()) {
                                    o24Var.u1.u(view2, t14Var2.y.get(i6), t14Var2.x, t14Var2.n, true, 0, 0);
                                    o24Var.W();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            j79 adapter = o24Var.E0.getAdapter();
                            j24 j24Var = o24Var.A0;
                            if (adapter == j24Var) {
                                str = j24Var.O;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof x2b) {
                                x2b x2bVar = (x2b) view2;
                                if (x2bVar.getSticker() != null && r47.W3(x2bVar.getSticker()) && !yac.h(k5.a(o24Var.d1).a).p()) {
                                    rw2.e().m(x2bVar);
                                    return;
                                }
                                rw2.e().j();
                                if (!x2bVar.r) {
                                    x2bVar.r = true;
                                    x2bVar.n = 0.5f;
                                    x2bVar.y = 0L;
                                    w2b w2bVar = x2bVar.a;
                                    w2bVar.setAlpha(0.5f * x2bVar.I);
                                    w2bVar.invalidate();
                                    x2bVar.s = System.currentTimeMillis();
                                    x2bVar.invalidate();
                                    o24Var.u1.x(x2bVar, x2bVar.getSticker(), str2, x2bVar.getParentObject(), x2bVar.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.B0 = r5;
            wz3Var.setOnItemClickListener((r69) r5);
            yob.l(wz3Var, 21, i4, vnbVar);
            uz3Var.addView(wz3Var);
            this.b0 = new hw6(wz3Var, xz3Var);
            a04 a04Var = new a04(this, context);
            this.H0 = a04Var;
            uz3Var.addView(a04Var, new FrameLayout.LayoutParams(-1, hl.e1() + L));
            bp4 bp4Var2 = new bp4(context, vnbVar);
            this.I0 = bp4Var2;
            bp4Var2.setVisibility(8);
            bp4Var2.setOnBackClickListener(new View.OnClickListener(this) {
                public final o24 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    c24 c24Var;
                    byte b = r2;
                    o24 o24Var = this.b;
                    switch (b) {
                        case 0:
                            o14 o14Var = o24Var.T;
                            j14 j14Var = o14Var.c;
                            int childCount = j14Var.getChildCount();
                            for (int i52 = 0; i52 < childCount; i52++) {
                                ((ap4) j14Var.getChildAt(i52)).a(false, true);
                            }
                            o14Var.d = 0L;
                            o14Var.G.b.a(false, true);
                            o14Var.f();
                            return;
                        case 1:
                            j24 j24Var = o24Var.A0;
                            j14 j14Var2 = j24Var.c;
                            int childCount2 = j14Var2.getChildCount();
                            for (int i6 = 0; i6 < childCount2; i6++) {
                                ((ap4) j14Var2.getChildAt(i6)).a(false, true);
                            }
                            j24Var.d = 0L;
                            j24Var.R.a.a(false, true);
                            j24Var.f();
                            return;
                        case 2:
                            p14 p14Var = o24Var.u1;
                            if (p14Var != null) {
                                p14Var.v();
                                return;
                            }
                            return;
                        default:
                            int currentItem = o24Var.h.getCurrentItem();
                            if (currentItem == 0) {
                                c24Var = o24Var.W;
                            } else if (currentItem == 1) {
                                c24Var = o24Var.p0;
                            } else {
                                c24Var = o24Var.H0;
                            }
                            if (c24Var != null) {
                                a24 a24Var = c24Var.d;
                                a24Var.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                a24Var.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                a24Var.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            uz3Var.addView(bp4Var2, new FrameLayout.LayoutParams(-1, L));
            z8 = z5;
            b04 b04Var = new b04(this, context, vnbVar, eVar, z8);
            this.C0 = b04Var;
            b04Var.setDragEnabled(true);
            b04Var.setWillNotDraw(false);
            b04Var.setType(wu9Var);
            b04Var.setUnderlineHeight(wz3Var.canScrollVertically(-1) ? hl.e1() : 0);
            b04Var.setIndicatorColor(y(i));
            b04Var.setUnderlineColor(y(i5));
            if (viewGroup != null && z8) {
                c04 c04Var = new c04(this, context);
                this.D0 = c04Var;
                c04Var.addView(b04Var, tre.e(-1, 36, 51));
                viewGroup.addView(c04Var, tre.c(-2.0f, -1));
            } else {
                uz3Var.addView(b04Var, tre.e(-1, 36, 51));
            }
            X(true);
            b04Var.setDelegate(new hz3(this, (byte) 4));
            wz3Var.setOnScrollListener(new n24(this, 0));
            zo4 zo4Var2 = new zo4(context, vnbVar);
            this.O = zo4Var2;
            tt ttVar2 = new tt(context, vnbVar, (byte) 16);
            this.N = ttVar2;
            ttVar2.setVisibility(8);
            ttVar2.addView(zo4Var2, tre.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            uz3Var.addView(ttVar2, tre.e(-1, -2, 80));
        } else {
            vy4Var = vy4Var2;
            z8 = z5;
        }
        this.e.clear();
        this.e.addAll(this.d);
        d04 d04Var = new d04(this, context);
        this.h = d04Var;
        vy4 vy4Var3 = vy4Var;
        d04Var.b(new ny4(vy4Var3, d04Var));
        d04Var.setOverScrollMode(2);
        i14 i14Var = new i14(this);
        this.M0 = i14Var;
        d04Var.setAdapter(i14Var);
        e04 e04Var = new e04(this, context);
        this.y = e04Var;
        e04Var.setHapticFeedbackEnabled(true);
        e04Var.setImageResource(2131232755);
        int u = z7 ? u(0.6f) : y(aob.Jf);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        e04Var.setColorFilter(new PorterDuffColorFilter(u, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        e04Var.setScaleType(scaleType);
        e04Var.setContentDescription(ob6.M0(2131754916, null));
        e04Var.setFocusable(true);
        e04Var.setOnClickListener(new Object());
        iye.a(e04Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        if (z4) {
            addView(frameLayout, tre.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (hl.e1() / hl.p) + 40.0f));
        } else {
            addView(frameLayout, tre.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        addView(frameLayout2, tre.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.n = frameLayout3;
        View view2 = new View(context);
        this.w = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, hl.L(40.0f), 83));
        if (z4) {
            addView(frameLayout3, tre.e(-1, 48, 80));
            frameLayout3.addView(e04Var, tre.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z2) {
                ImageView imageView = new ImageView(context);
                this.E = imageView;
                imageView.setImageResource(2131232758);
                imageView.setColorFilter(new PorterDuffColorFilter(z7 ? u(0.6f) : y(aob.Jf), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(ob6.M0(2131745223, null));
                iye.a(imageView);
                frameLayout3.addView(imageView, tre.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final o24 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        c24 c24Var;
                        byte b = r2;
                        o24 o24Var = this.b;
                        switch (b) {
                            case 0:
                                o14 o14Var = o24Var.T;
                                j14 j14Var = o14Var.c;
                                int childCount = j14Var.getChildCount();
                                for (int i52 = 0; i52 < childCount; i52++) {
                                    ((ap4) j14Var.getChildAt(i52)).a(false, true);
                                }
                                o14Var.d = 0L;
                                o14Var.G.b.a(false, true);
                                o14Var.f();
                                return;
                            case 1:
                                j24 j24Var = o24Var.A0;
                                j14 j14Var2 = j24Var.c;
                                int childCount2 = j14Var2.getChildCount();
                                for (int i6 = 0; i6 < childCount2; i6++) {
                                    ((ap4) j14Var2.getChildAt(i6)).a(false, true);
                                }
                                j24Var.d = 0L;
                                j24Var.R.a.a(false, true);
                                j24Var.f();
                                return;
                            case 2:
                                p14 p14Var = o24Var.u1;
                                if (p14Var != null) {
                                    p14Var.v();
                                    return;
                                }
                                return;
                            default:
                                int currentItem = o24Var.h.getCurrentItem();
                                if (currentItem == 0) {
                                    c24Var = o24Var.W;
                                } else if (currentItem == 1) {
                                    c24Var = o24Var.p0;
                                } else {
                                    c24Var = o24Var.H0;
                                }
                                if (c24Var != null) {
                                    a24 a24Var = c24Var.d;
                                    a24Var.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    a24Var.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    a24Var.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            yu7 yu7Var = new yu7(context, vnbVar);
            this.x = yu7Var;
            yu7Var.setViewPager(d04Var);
            yu7Var.setShouldExpand(false);
            yu7Var.setIndicatorHeight(hl.L(3.0f));
            yu7Var.setIndicatorColor(vm2.o(y(aob.Gf), 20));
            yu7Var.setUnderlineHeight(0);
            yu7Var.setTabPaddingLeftRight(hl.L(11.0f));
            yu7Var.setPadding(hl.L(4.0f), hl.L(11.0f), hl.L(4.0f), hl.L(11.0f));
            frameLayout3.addView(yu7Var, tre.e(-2, 48, 81));
            yu7Var.setOnPageChangeListener(new g04(this, z8));
            ImageView imageView2 = new ImageView(context);
            this.F = imageView2;
            imageView2.setImageResource(2131232757);
            imageView2.setColorFilter(new PorterDuffColorFilter(z7 ? u(0.6f) : y(aob.Jf), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(ob6.M0(2131745564, null));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, tre.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final o24 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view22) {
                    c24 c24Var;
                    byte b = r2;
                    o24 o24Var = this.b;
                    switch (b) {
                        case 0:
                            o14 o14Var = o24Var.T;
                            j14 j14Var = o14Var.c;
                            int childCount = j14Var.getChildCount();
                            for (int i52 = 0; i52 < childCount; i52++) {
                                ((ap4) j14Var.getChildAt(i52)).a(false, true);
                            }
                            o14Var.d = 0L;
                            o14Var.G.b.a(false, true);
                            o14Var.f();
                            return;
                        case 1:
                            j24 j24Var = o24Var.A0;
                            j14 j14Var2 = j24Var.c;
                            int childCount2 = j14Var2.getChildCount();
                            for (int i6 = 0; i6 < childCount2; i6++) {
                                ((ap4) j14Var2.getChildAt(i6)).a(false, true);
                            }
                            j24Var.d = 0L;
                            j24Var.R.a.a(false, true);
                            j24Var.f();
                            return;
                        case 2:
                            p14 p14Var = o24Var.u1;
                            if (p14Var != null) {
                                p14Var.v();
                                return;
                            }
                            return;
                        default:
                            int currentItem = o24Var.h.getCurrentItem();
                            if (currentItem == 0) {
                                c24Var = o24Var.W;
                            } else if (currentItem == 1) {
                                c24Var = o24Var.p0;
                            } else {
                                c24Var = o24Var.H0;
                            }
                            if (c24Var != null) {
                                a24 a24Var = c24Var.d;
                                a24Var.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                a24Var.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                a24Var.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            addView(frameLayout3, tre.d(56, 48.0f, (ob6.a0 ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            hf0 h0 = aob.h0(hl.L(56.0f), y(i4), y(i4));
            iye.a(e04Var);
            e04Var.setPadding(0, 0, hl.L(2.0f), 0);
            e04Var.setBackground(h0);
            e04Var.setContentDescription(ob6.M0(2131754916, null));
            e04Var.setFocusable(true);
            frameLayout3.addView(e04Var, tre.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(d04Var, 0, tre.e(-1, -1, 51));
        xb xbVar = new xb(context, (byte) 18);
        this.O0 = xbVar;
        int L2 = hl.L(6.0f);
        int i6 = aob.hg;
        ShapeDrawable b0 = aob.b0(L2, y(i6));
        uob M = yob.M(i6);
        xbVar.setBackground(b0);
        yob.j(xbVar, b0, M, null, vnbVar);
        yob.X(xbVar, aob.gg, vnbVar);
        xbVar.setPadding(hl.L(12.0f), hl.L(7.0f), hl.L(12.0f), hl.L(7.0f));
        xbVar.setGravity(16);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setVisibility(4);
        addView(xbVar, tre.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.D1 = hl.L(hl.O1() ? 40.0f : 32.0f);
        Field field2 = bx3.f;
        bx3 bx3Var = new bx3(new ax3(context, vnbVar));
        Field field3 = bx3.f;
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
            bx3.f = field3;
        }
        if (field3 != null) {
            try {
                bx3Var.a = (ViewTreeObserver.OnScrollChangedListener) field3.get(bx3Var);
                bx3.f.set(bx3Var, bx3.g);
            } catch (Exception unused3) {
                bx3Var.a = null;
            }
        }
        this.C1 = bx3Var;
        bx3Var.c.setOnSelectionUpdateListener(new n82(this, (byte) 24));
        this.B1 = uc7.d1().getInt("selected_page", 0);
        HashMap hashMap = pv3.h;
        if (!pv3.k) {
            pv3.k = true;
            SharedPreferences d1 = uc7.d1();
            try {
                hashMap.clear();
                if (d1.contains("emojis")) {
                    String string = d1.getString("emojis", "");
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
                    d1.edit().remove("emojis").commit();
                    pv3.r();
                } else {
                    String string2 = d1.getString("emojis2", "");
                    if (string2 != null && string2.length() > 0) {
                        for (String str : string2.split(",")) {
                            String[] split3 = str.split("=");
                            hashMap.put(split3[0], Utilities.z(split3[1]));
                        }
                    }
                }
                if (hashMap.isEmpty() && !d1.getBoolean("filled_default", false)) {
                    int i11 = 0;
                    while (true) {
                        String[] strArr2 = pv3.o;
                        if (i11 >= strArr2.length) {
                            break;
                        }
                        hashMap.put(strArr2[i11], Integer.valueOf(strArr2.length - i11));
                        i11++;
                    }
                    d1.edit().putBoolean("filled_default", true).commit();
                    pv3.r();
                }
                pv3.s();
            } catch (Exception e) {
                cc4.g(e, true);
            }
            try {
                String string3 = d1.getString("color", "");
                if (string3 != null && string3.length() > 0) {
                    for (String str2 : string3.split(",")) {
                        String[] split4 = str2.split("=");
                        pv3.j.put(split4[0], split4[1]);
                    }
                }
            } catch (Exception e2) {
                z10 = true;
                cc4.g(e2, true);
                y04Var = y04Var2;
                z9 = false;
            }
        }
        y04Var = y04Var2;
        z9 = false;
        z10 = true;
        y04Var.F(z9);
        H(z10, z2, z3, z9);
        if (Build.VERSION.SDK_INT >= 31) {
            tq3 tq3Var = new tq3(z9);
            this.k2 = tq3Var;
            vy4Var3.a(tq3Var);
            rz4 rz4Var = new rz4(null);
            rz4Var.f = oz4Var;
            rz4Var.d = tq3Var;
            rz4Var.e = -2;
            ll0Var = new ll0(rz4Var, rz4Var, rz4Var);
            ll0Var.k = true;
            int L3 = hl.L(i86.e(262144) ? 8.0f : 48.0f);
            ll0Var.d = L3;
            ll0Var.e = L3;
            ll0Var.j = vy4Var3;
        } else {
            ll0Var = new ll0(oz4Var, oz4Var, oz4Var);
            ll0Var.j = vy4Var3;
            this.k2 = null;
        }
        this.l2 = new mr0(this, (byte) 4);
        setBlurredBackgroundDrawableFactory(ll0Var);
        vy4Var3.i(this);
        vy4Var3.a = new hz3(this, (byte) 0);
    }

    public static String c(String str, String str2) {
        String str3;
        String str4;
        boolean z = true;
        if (jr2.c(str) != null) {
            if (jr2.c(str) == null) {
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
        if (pv3.b(str)) {
            str = bs2.n(2, 0, str);
        } else {
            z = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = bs2.n(2, 0, str);
        } else if (length > 3 && str.charAt(str.length() - 3) == 8205) {
            str3 = str.substring(str.length() - 3);
            str = bs2.n(3, 0, str);
        } else {
            str3 = null;
        }
        String i = c00.i(str, str2);
        if (str3 != null) {
            i = i.concat(str3);
        }
        if (z) {
            return i.concat("\u200d➡");
        }
        return i;
    }

    public static void f(int i, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public final void A() {
        u8a u8aVar = this.M2;
        if (u8aVar != null) {
            u8aVar.a();
            this.M2 = null;
        }
        u8a u8aVar2 = this.N2;
        if (u8aVar2 != null) {
            u8aVar2.a();
            this.N2 = null;
            this.O2 = false;
        }
    }

    public final void B(boolean z, boolean z2) {
        b24 b24Var;
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
        d04 d04Var = this.h;
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
                if (d04Var.getCurrentItem() != 2) {
                    d04Var.x(2, false);
                }
                b04 b04Var = this.C0;
                if (b04Var != null) {
                    this.T0 = true;
                    int i3 = this.H1;
                    if (i3 >= 0) {
                        b04Var.m(i3);
                    } else {
                        int i4 = this.G1;
                        if (i4 >= 0) {
                            b04Var.m(i4);
                        } else {
                            b04Var.m(this.F1);
                        }
                    }
                    this.T0 = false;
                    this.F0.g1(0, 0);
                }
            } else if (i2 == 2) {
                K(false, false);
                P(false, false);
                if (d04Var.getCurrentItem() != 1) {
                    d04Var.x(1, false);
                }
                w04 w04Var = this.q0;
                if (w04Var != null) {
                    w04Var.m(0);
                }
                tz3 tz3Var = this.p0;
                if (tz3Var != null && (b24Var = tz3Var.r) != null) {
                    b24Var.J1(null);
                }
            }
        } else {
            K(true, false);
            P(false, false);
            if (d04Var.getCurrentItem() != 0) {
                d04Var.x(0, !z);
            }
            if (z2) {
                hl.d3(new gz3(this, (byte) 3), 350L);
            }
        }
        L(true);
    }

    public final void C() {
        g24 g24Var = this.z0;
        if (g24Var != null) {
            g24Var.f();
        }
        j24 j24Var = this.A0;
        if (j24Var != null) {
            j24Var.f();
        }
        if (rw2.e().E) {
            rw2.e().b();
        }
        rw2.e().j();
    }

    public final void D(int i) {
        p14 p14Var = this.u1;
        if ((p14Var != null && p14Var.z()) || i == 0) {
            return;
        }
        HorizontalScrollView x = x(i);
        this.R0[i] = 0;
        x.setTranslationY(0.0f);
    }

    public final void E(int i, int i2) {
        p04 p04Var = this.R;
        View m = p04Var.m(i);
        int K0 = p04Var.K0();
        int i3 = 1;
        if ((m == null && Math.abs(i - K0) > p04Var.J * 9.0f) || !xea.c()) {
            if (p04Var.K0() < i) {
                i3 = 0;
            }
            hw6 hw6Var = this.c0;
            hw6Var.b = i3;
            hw6Var.k(i, i2, false, false);
            return;
        }
        this.K0 = true;
        aw3 aw3Var = new aw3((byte) 1, this.Q.getContext(), this);
        aw3Var.a = i;
        aw3Var.p = i2;
        p04Var.v0(aw3Var);
    }

    public final void F(int i, int i2) {
        xz3 xz3Var = this.F0;
        View m = xz3Var.m(i);
        int K0 = xz3Var.K0();
        int i3 = 1;
        if (m == null && Math.abs(i - K0) > 40) {
            if (xz3Var.K0() < i) {
                i3 = 0;
            }
            hw6 hw6Var = this.b0;
            hw6Var.b = i3;
            hw6Var.k(i, i2, false, false);
            return;
        }
        this.K0 = true;
        this.E0.A0(i);
    }

    public final void G(x14 x14Var, String str) {
        String str2;
        String str3;
        boolean z;
        String str4;
        p14 p14Var;
        d31 d31Var;
        if (x14Var != null) {
            if (x14Var.getSpan() != null) {
                if (this.u1 != null) {
                    long j = x14Var.getSpan().documentId;
                    TLRPC.Document document = x14Var.getSpan().document;
                    c14 c14Var = x14Var.e;
                    if (c14Var != null && c14Var.i) {
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
                            c14 c14Var2 = (c14) arrayList.get(i);
                            int i2 = 0;
                            while (true) {
                                ArrayList arrayList2 = c14Var2.c;
                                if (arrayList2 != null && i2 < arrayList2.size()) {
                                    if (((TLRPC.Document) c14Var2.c.get(i2)).id == j) {
                                        document = (TLRPC.Document) c14Var2.c.get(i2);
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
                        document = wl.e(i3, j);
                    }
                    if (document != null) {
                        str4 = r47.U(document);
                    } else {
                        str4 = null;
                    }
                    if (!r47.m3(document) && !yac.h(i3).p() && (((p14Var = this.u1) == null || !p14Var.h()) && !this.V0 && !z)) {
                        L(false);
                        e eVar = this.Z1;
                        if (eVar != null) {
                            d31Var = d31.b0(eVar);
                        } else {
                            d31Var = new d31(this.r, this.a2);
                        }
                        if (!this.i2 && eVar != null) {
                            d31Var.K(2131624185, hl.S2(ob6.M0(2131743518, null)), ob6.M0(2131747544, null), new gz3(this, (byte) 5)).j();
                        } else {
                            d31Var.r(document, hl.S2(ob6.M0(2131743519, null)), ob6.M0(2131746762, null), new gz3(this, (byte) 4)).j();
                        }
                        this.i2 = !this.i2;
                        return;
                    }
                    this.D2 = SystemClock.elapsedRealtime();
                    L(true);
                    d("animated_" + j);
                    this.u1.w(j, document, str4, x14Var.c);
                    return;
                }
                return;
            }
            this.D2 = SystemClock.elapsedRealtime();
            L(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) x14Var.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!x14Var.c && (str3 = (String) pv3.j.get(str2)) != null) {
                    str2 = c(str2, str3);
                }
                d(str2);
                p14 p14Var2 = this.u1;
                if (p14Var2 != null) {
                    p14Var2.m(pv3.c(str2));
                    return;
                }
                return;
            }
            p14 p14Var3 = this.u1;
            if (p14Var3 != null) {
                p14Var3.m(pv3.c(str));
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
            if (((k24) arrayList2.get(i)).a == 0 && z) {
                arrayList.add((k24) arrayList2.get(i));
            }
            if (((k24) arrayList2.get(i)).a == 1 && z3) {
                arrayList.add((k24) arrayList2.get(i));
            }
            if (((k24) arrayList2.get(i)).a == 2 && z2) {
                arrayList.add((k24) arrayList2.get(i));
            }
            i++;
        }
        yu7 yu7Var = this.x;
        if (yu7Var != null) {
            if (arrayList.size() > 1) {
                z5 = true;
            }
            hl.T3(yu7Var, z5, 1.0f, true, z4);
        }
        d04 d04Var = this.h;
        if (d04Var != null) {
            d04Var.setAdapter(null);
            d04Var.setAdapter(this.M0);
            if (yu7Var != null) {
                yu7Var.setViewPager(d04Var);
            }
        }
    }

    public final void I(final zo4 zo4Var, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z, boolean z2) {
        String G;
        j24 j24Var;
        o14 o14Var;
        if (stickerSet != null) {
            if (!z || (o14Var = this.T) == null || o14Var.d == stickerSet.id) {
                if (!z && (j24Var = this.A0) != null && j24Var.d != stickerSet.id) {
                    return;
                }
                final boolean D0 = ls6.d0(this.d1).D0(stickerSet.id, true);
                boolean z3 = stickerSet.masks;
                if (D0) {
                    if (z3) {
                        G = ob6.G(stickerSet.count, "RemoveManyMasksCount", new Object[0]);
                    } else {
                        boolean z4 = stickerSet.emojis;
                        int i = stickerSet.count;
                        if (z4) {
                            G = ob6.G(i, "RemoveManyEmojiCount", new Object[0]);
                        } else {
                            G = ob6.G(i, "RemoveManyStickersCount", new Object[0]);
                        }
                    }
                } else if (z3) {
                    G = ob6.G(stickerSet.count, "AddManyMasksCount", new Object[0]);
                } else {
                    boolean z5 = stickerSet.emojis;
                    int i2 = stickerSet.count;
                    if (z5) {
                        G = ob6.G(i2, "AddManyEmojiCount", new Object[0]);
                    } else {
                        G = ob6.G(i2, "AddManyStickersCount", new Object[0]);
                    }
                }
                zo4Var.i(G, z2, true);
                zo4Var.m0.a(!D0, z2);
                zo4Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i3;
                        o24 o24Var = o24.this;
                        ls6 d0 = ls6.d0(o24Var.d1);
                        Context context = o24Var.getContext();
                        if (D0) {
                            i3 = 0;
                        } else {
                            i3 = 2;
                        }
                        int i4 = i3;
                        e eVar = o24Var.Z1;
                        FrameLayout frameLayout = o24Var.s;
                        zo4 zo4Var2 = zo4Var;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z6 = z;
                        d0.i2(context, tLObject2, document2, i4, eVar, frameLayout, false, true, new y6a(o24Var, zo4Var2, tLObject2, stickerSet2, document2, z6), false);
                        o24Var.I(zo4Var2, tLObject2, stickerSet2, document2, z6, true);
                    }
                });
            }
        }
    }

    public final void J(long j, boolean z, boolean z2) {
        int i;
        View childAt;
        float f;
        yu7 yu7Var = this.x;
        if (yu7Var != null) {
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
            LinearLayout linearLayout = yu7Var.d;
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
                d04 d04Var = this.h;
                int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                if (z2) {
                    if (i2 != 0 && d04Var.getCurrentItem() != 0) {
                        K(true, true);
                        P(false, true);
                        d04Var.x(0, false);
                    }
                } else if (i2 != 0 && d04Var.getCurrentItem() != 1) {
                    K(false, true);
                    P(false, true);
                    d04Var.x(1, false);
                }
            }
        }
    }

    public final void K(boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        e04 e04Var = this.y;
        Object tag = e04Var.getTag();
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
            e04Var.setTag(num);
            int i = 0;
            float f5 = 0.0f;
            if (z2) {
                if (z) {
                    e04Var.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.G = animatorSet2;
                if (z) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(e04Var, View.ALPHA, f3);
                if (z) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(e04Var, View.SCALE_X, f4);
                if (z) {
                    f5 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(e04Var, View.SCALE_Y, f5));
                this.G.setDuration(200L);
                this.G.setInterpolator(k43.g);
                this.G.addListener(new l04(this, z, (byte) 0));
                this.G.start();
                return;
            }
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            e04Var.setAlpha(f);
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            e04Var.setScaleX(f2);
            if (z) {
                f5 = 1.0f;
            }
            e04Var.setScaleY(f5);
            if (!z) {
                i = 4;
            }
            e04Var.setVisibility(i);
        }
    }

    public final void L(boolean z) {
        Integer num;
        this.I = 0.0f;
        p14 p14Var = this.u1;
        if (p14Var != null && p14Var.z()) {
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
            this.a0.setInterpolator(k43.g);
            this.a0.addListener(new cn2(this, (byte) 17));
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
            u55 v = v(i);
            int K0 = v.K0();
            if (z) {
                if (K0 == 1 || K0 == 2) {
                    v.m0(0);
                    D(i);
                }
            } else if (K0 == 0) {
                v.g1(0, 0);
            }
        }
    }

    public final void O(boolean z, boolean z2, boolean z3) {
        float f;
        float translationY;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat M0 = uc7.s1(this.d1).M0(Long.valueOf(this.v1));
        if (M0 != null) {
            xb xbVar = this.O0;
            if (z) {
                if (!xc2.N(M0) && (tL_chatBannedRights = M0.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z2 && tL_chatBannedRights.send_plain))) {
                    e eVar = this.Z1;
                    if (!(eVar instanceof zu1) || !((zu1) eVar).V4()) {
                        if (z2) {
                            xbVar.setText(ob6.M0(2131749317, null));
                        } else if (z3) {
                            xbVar.setText(ob6.M0(2131749316, null));
                        } else {
                            xbVar.setText(ob6.M0(2131749310, null));
                        }
                    } else {
                        return;
                    }
                } else {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = M0.banned_rights;
                    if (tL_chatBannedRights2 == null) {
                        return;
                    }
                    if (hl.B1(tL_chatBannedRights2)) {
                        if (z2) {
                            xbVar.setText(ob6.M0(2131753936, null));
                        } else if (z3) {
                            xbVar.setText(ob6.M0(2131753962, null));
                        } else {
                            xbVar.setText(ob6.M0(2131753927, null));
                        }
                    } else {
                        if (z2) {
                            xbVar.setText(ob6.a0("AttachPlainRestricted", null, 2131753937, ob6.v(M0.banned_rights.until_date)));
                        }
                        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = M0.banned_rights;
                        if (z3) {
                            xbVar.setText(ob6.a0("AttachGifRestricted", null, 2131753963, ob6.v(tL_chatBannedRights3.until_date)));
                        } else {
                            xbVar.setText(ob6.a0("AttachStickersRestricted", null, 2131753928, ob6.v(tL_chatBannedRights3.until_date)));
                        }
                    }
                }
                xbVar.setVisibility(0);
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
                f = xbVar.getAlpha();
            } else {
                f = 1.0f;
                f3 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xbVar, View.ALPHA, f, f3);
            if (z) {
                translationY = hl.L(12.0f);
            } else {
                translationY = xbVar.getTranslationY();
                f2 = hl.L(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(xbVar, View.TRANSLATION_Y, translationY, f2));
            mz3 mz3Var = this.Q2;
            if (mz3Var != null) {
                hl.r(mz3Var);
            }
            if (z) {
                mz3 mz3Var2 = new mz3(this, z2, z3, (byte) 0);
                this.Q2 = mz3Var2;
                hl.d3(mz3Var2, 3500L);
            }
            this.P2.setDuration(320L);
            this.P2.setInterpolator(k43.h);
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
                this.H.setInterpolator(k43.g);
                this.H.addListener(new l04(this, z, (byte) 1));
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
        rz3 rz3Var = this.i0;
        if (rz3Var != null) {
            int childCount = rz3Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = rz3Var.getChildAt(i);
                if (childAt instanceof vw2) {
                    ImageReceiver photoImage = ((vw2) childAt).getPhotoImage();
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
        e eVar;
        View view = (View) getParent();
        if (view != null) {
            float y = getY();
            if (getLayoutParams().height > 0) {
                measuredHeight = getLayoutParams().height;
            } else {
                measuredHeight = getMeasuredHeight();
            }
            float f = y + measuredHeight;
            if ((!hl.E && ((eVar = this.Z1) == null || !eVar.isInBubbleMode())) || this.W0) {
                L = view.getHeight();
            } else {
                L = hl.L(1.0f);
            }
            float f2 = f - L;
            int i = (this.r2 > 0.0f ? 1 : (this.r2 == 0.0f ? 0 : -1));
            FrameLayout frameLayout = this.n;
            if (i >= 0) {
                f2 += getMeasuredHeight() - this.r2;
            } else if (frameLayout.getTop() - f2 < 0.0f || !this.x2) {
                f2 = 0.0f;
            }
            float U1 = (-f2) + hl.U1(this.E2.e, hl.L(50.0f), -this.q2);
            frameLayout.setTranslationY(U1);
            if (this.e0) {
                this.r.setTranslationY(U1);
            }
        }
    }

    public final void S() {
        c24 c24Var;
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
        uy3 uy3Var;
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
        } else if (!hl.E && !this.O1) {
            int i = aob.zf;
            setBackgroundColor(y(i));
            if (this.e0) {
                view.setBackgroundColor(y(i));
            }
        } else {
            Drawable background = getBackground();
            int y16 = y(aob.zf);
            if (background != null && (background != this.G2 || y16 != this.H2)) {
                this.G2 = background;
                this.H2 = y16;
                background.setColorFilter(new PorterDuffColorFilter(y16, PorterDuff.Mode.MULTIPLY));
            }
        }
        t04 t04Var = this.J;
        if (t04Var != null) {
            if (this.v0) {
                t04Var.setBackgroundColor(y(aob.zf));
                this.P.setBackgroundColor(y(aob.Cf));
            } else {
                t04Var.setBackground(null);
            }
        }
        bx3 bx3Var = this.C1;
        if (bx3Var != null) {
            bx3Var.c.a();
        }
        int i2 = 0;
        while (true) {
            c24Var = this.W;
            z = this.j2;
            if (i2 >= 3) {
                break;
            }
            if (i2 == 0) {
                c24Var = this.H0;
            } else if (i2 != 1) {
                c24Var = this.p0;
            }
            if (c24Var != null) {
                a24 a24Var = c24Var.d;
                FrameLayout frameLayout = c24Var.n;
                boolean z4 = this.v0;
                View view2 = c24Var.f;
                if (z4) {
                    view2.setBackgroundColor(y(aob.zf));
                } else {
                    view2.setBackground(null);
                }
                c24Var.e.setBackgroundColor(y(aob.Cf));
                dw9 dw9Var = c24Var.c;
                if (z) {
                    y12 = u(0.4f);
                } else {
                    y12 = y(aob.Bf);
                }
                dw9Var.a(y12);
                Drawable background2 = frameLayout.getBackground();
                if (z) {
                    y13 = u(0.06f);
                } else {
                    y13 = y(aob.Af);
                }
                aob.A1(y13, background2);
                frameLayout.invalidate();
                if (z) {
                    y14 = u(0.45f);
                } else {
                    y14 = y(aob.Bf);
                }
                a24Var.setHintTextColor(y14);
                if (z) {
                    y15 = u(0.8f);
                } else {
                    y15 = y(aob.G6);
                }
                a24Var.setTextColor(y15);
            }
            i2++;
        }
        Paint paint = this.t1;
        if (paint != null) {
            paint.setColor(y(aob.Sf));
        }
        b14 b14Var = this.Q;
        if (b14Var != null) {
            b14Var.setGlowColor(y(aob.zf));
        }
        wz3 wz3Var = this.E0;
        if (wz3Var != null) {
            wz3Var.setGlowColor(y(aob.zf));
        }
        b04 b04Var = this.C0;
        if (b04Var != null) {
            b04Var.setIndicatorColor(y(aob.If));
            b04Var.setUnderlineColor(y(aob.Cf));
            if (this.v0) {
                b04Var.setBackgroundColor(y(aob.zf));
            } else {
                b04Var.setBackground(null);
            }
        }
        w04 w04Var = this.q0;
        if (w04Var != null) {
            w04Var.setIndicatorColor(y(aob.If));
            w04Var.setUnderlineColor(y(aob.Cf));
            if (this.v0) {
                w04Var.setBackgroundColor(y(aob.zf));
            } else {
                w04Var.setBackground(null);
            }
        }
        if (z) {
            y = u(0.6f);
        } else {
            y = y(aob.Jf);
        }
        if (y != this.I2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.I2 = y;
        e04 e04Var = this.y;
        if (e04Var != null) {
            if (z2) {
                e04Var.setColorFilter(new PorterDuffColorFilter(y, PorterDuff.Mode.MULTIPLY));
            }
            if (c24Var == null) {
                Drawable background3 = e04Var.getBackground();
                int i3 = aob.zf;
                aob.F1(background3, y(i3), false);
                aob.F1(e04Var.getBackground(), y(i3), true);
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
        xb xbVar = this.O0;
        if (xbVar != null) {
            if (xbVar.getBackground() instanceof ShapeDrawable) {
                ((ShapeDrawable) xbVar.getBackground()).getPaint().setColor(y(aob.hg));
                xbVar.invalidate();
            }
            xbVar.setTextColor(y(aob.gg));
        }
        t14 t14Var = this.k0;
        if (t14Var != null) {
            v14 v14Var = t14Var.e;
            int i4 = aob.Df;
            int y17 = y(i4);
            if (y17 != this.J2) {
                this.J2 = y17;
                v14Var.a.setColorFilter(new PorterDuffColorFilter(y17, PorterDuff.Mode.MULTIPLY));
            }
            v14Var.b.setTextColor(y(i4));
            v14Var.c.setProgressColor(y(aob.h6));
        }
        int y18 = y(aob.Fi);
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
                y10 = y(aob.Ff);
            }
            aob.C1(drawable, y10, false);
            Drawable drawable2 = drawableArr[i5];
            if (z) {
                y11 = u(0.8f);
            } else {
                y11 = y(aob.Gf);
            }
            aob.C1(drawable2, y11, true);
            i5++;
        }
        if (t04Var != null && (uy3Var = t04Var.y) != null) {
            uy3Var.d();
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
                y8 = y(aob.Ef);
            }
            aob.C1(drawable3, y8, false);
            Drawable drawable4 = drawableArr2[i6];
            if (z) {
                y9 = u(0.8f);
            } else {
                y9 = y(aob.Gf);
            }
            aob.C1(drawable4, y9, true);
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
                y6 = y(aob.Ef);
            }
            aob.C1(drawable5, y6, false);
            Drawable drawable6 = drawableArr3[i7];
            if (z) {
                y7 = u(0.8f);
            } else {
                y7 = y(aob.Gf);
            }
            aob.C1(drawable6, y7, true);
            i7++;
        }
        nnb nnbVar = this.b2;
        if (nnbVar != null) {
            if (z) {
                y4 = u(0.4f);
            } else {
                y4 = y(aob.Ff);
            }
            aob.C1(nnbVar, y4, false);
            if (z) {
                y5 = u(0.8f);
            } else {
                y5 = y(aob.Gf);
            }
            aob.C1(nnbVar, y5, true);
        }
        nnb nnbVar2 = this.c2;
        if (nnbVar2 != null) {
            if (z) {
                y2 = u(0.4f);
            } else {
                y2 = y(aob.If);
            }
            aob.C1(nnbVar2, y2, false);
            if (z) {
                y3 = u(0.8f);
            } else {
                y3 = y(aob.If);
            }
            aob.C1(nnbVar2, y3, true);
        }
    }

    public final void T() {
        b14 b14Var = this.Q;
        if (b14Var != null) {
            for (int i = 0; i < b14Var.getChildCount(); i++) {
                View childAt = b14Var.getChildAt(i);
                if (childAt instanceof g14) {
                    ((g14) childAt).a(true);
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
                y04 y04Var = this.S;
                int i4 = y04Var.c;
                ArrayList arrayList = y04Var.y;
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
                        String[][] strArr = jx3.f;
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
                        ArrayList<c14> emojipacks = getEmojipacks();
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (((Integer) arrayList.get(size2)).intValue() <= i) {
                                c14 c14Var = (c14) this.r1.get(size2);
                                while (i5 < emojipacks.size()) {
                                    long j = emojipacks.get(i5).b.id;
                                    long j2 = c14Var.b.id;
                                    if (j == j2 && (!c14Var.g || (!c14Var.f && !this.q1.contains(Long.valueOf(j2))))) {
                                        char[] cArr = jx3.a;
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

    public final void V() {
        boolean z;
        boolean z2;
        int i;
        b24 b24Var;
        int i2;
        boolean z3;
        boolean z4;
        w04 w04Var = this.q0;
        int currentPosition = w04Var.getCurrentPosition();
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
        w04Var.d(false);
        this.s0 = -2;
        this.t0 = -2;
        this.u0 = -2;
        Drawable[] drawableArr = this.a1;
        if (!isEmpty) {
            this.s0 = 0;
            w04Var.b(0, drawableArr[0]).setContentDescription(ob6.M0(2131746091, null));
            i = 1;
        } else {
            i = 0;
        }
        this.t0 = i;
        w04Var.b(1, drawableArr[1]).setContentDescription(ob6.M0(2131750799, null));
        this.u0 = i + 1;
        Typeface typeface = hl.a;
        int i4 = this.d1;
        ArrayList arrayList = uc7.s1(i4).x3;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            String str = (String) arrayList.get(i5);
            lv3 g = pv3.g(str);
            if (g != null) {
                TLRPC.Document V = ls6.d0(i4).V(str);
                String k = uh9.k(i5 + 3, "tab");
                int i6 = w04Var.y;
                w04Var.y = i6 + 1;
                u3b u3bVar = (u3b) w04Var.n.get(k);
                if (u3bVar != null) {
                    w04Var.g(k, u3bVar, i6);
                    i2 = currentPosition;
                    z3 = z2;
                } else {
                    i2 = currentPosition;
                    z3 = z2;
                    u3bVar = new u3b(w04Var.getContext(), 2);
                    u3bVar.setFocusable(true);
                    u3bVar.setOnClickListener(new jn8(w04Var, (byte) 15));
                    u3bVar.setExpanded(w04Var.g0);
                    u3bVar.a(w04Var.j0);
                    w04Var.e.addView(u3bVar, i6);
                }
                u3bVar.d = false;
                u3bVar.setTag(2131296463, Integer.valueOf(i6));
                u3bVar.setTag(2131296593, g);
                u3bVar.setTag(2131296587, V);
                if (i6 == w04Var.E) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                u3bVar.setSelected(z4);
                w04Var.h.put(k, u3bVar);
                u3bVar.setContentDescription(str);
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
        w04Var.h();
        w04Var.q();
        if (z && isEmpty) {
            w04Var.m(this.t0);
            tz3 tz3Var = this.p0;
            if (tz3Var != null && (b24Var = tz3Var.r) != null) {
                b24Var.J1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = ihc.a;
        if (w04Var.isLaidOut()) {
            if (!isEmpty) {
                if (!z5) {
                    w04Var.k(i7 + 1, 0);
                }
            } else if (z5) {
                w04Var.k(i7 - 1, 0);
            }
        }
    }

    public final void W() {
        t14 t14Var;
        int size = this.j1.size();
        long p = ls6.p(Integer.MAX_VALUE, this.j1);
        ArrayList arrayList = new ArrayList(ls6.d0(this.d1).j0);
        this.j1 = arrayList;
        long p2 = ls6.p(Integer.MAX_VALUE, arrayList);
        if ((this.q0 != null && size == 0 && !this.j1.isEmpty()) || (size != 0 && this.j1.isEmpty())) {
            V();
        }
        if ((size != this.j1.size() || p != p2) && (t14Var = this.o0) != null) {
            t14Var.f();
        }
    }

    public final void X(boolean z) {
        boolean z2;
        TLRPC.Document document;
        boolean z3;
        byte b;
        boolean z4;
        vnb vnbVar;
        boolean z5;
        boolean z6;
        ArrayList<TLRPC.Document> arrayList;
        boolean z7;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        int i;
        final b04 b04Var = this.C0;
        if (b04Var != null) {
            oob oobVar = b04Var.e;
            if (b04Var.s != null) {
                return;
            }
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.J1 = -2;
            final byte b2 = 0;
            this.f0 = false;
            this.F1 = 0;
            int currentPosition = b04Var.getCurrentPosition();
            if (getParent() != null && getVisibility() == 0 && (this.z1.size() != 0 || this.A1.size() != 0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            b04Var.d(z2);
            int i2 = this.d1;
            ls6 d0 = ls6.d0(i2);
            SharedPreferences sharedPreferences = uc7.s1(i2).Y3;
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
            m24 m24Var = this.G0;
            if (m24Var != null) {
                m24Var.f();
            }
            boolean isEmpty = arrayList4.isEmpty();
            long j = 0;
            Drawable[] drawableArr = this.Z0;
            vnb vnbVar2 = null;
            if (!isEmpty && (arrayList3.isEmpty() || sharedPreferences.getLong("featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id)) {
                if (d0.v0[0].isEmpty()) {
                    i = 2;
                } else {
                    i = 3;
                }
                u3b c = b04Var.c(i, drawableArr[i]);
                c.h.setText(ob6.M0(2131750796, null));
                c.setContentDescription(ob6.M0(2131750798, null));
                int i4 = this.F1;
                this.I1 = i4;
                this.F1 = i4 + 1;
            }
            if (!this.l1.isEmpty()) {
                int i5 = this.F1;
                this.H1 = i5;
                this.F1 = i5 + 1;
                u3b c2 = b04Var.c(1, drawableArr[1]);
                c2.h.setText(ob6.M0(2131750803, null));
                c2.setContentDescription(ob6.M0(2131750806, null));
            }
            if (!this.k1.isEmpty()) {
                int i6 = this.F1;
                this.G1 = i6;
                this.F1 = i6 + 1;
                u3b c3 = b04Var.c(0, drawableArr[0]);
                c3.h.setText(ob6.M0(2131746090, null));
                c3.setContentDescription(ob6.M0(2131746091, null));
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
            ArrayList w0 = uc7.s1(i2).w0(arrayList6);
            for (int i8 = 0; i8 < w0.size(); i8++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) w0.get(i8);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList5.add(tL_messages_stickerSet2);
                }
            }
            if (this.K1 != null) {
                long j4 = uc7.s1(i2).Y3.getLong("group_hide_stickers_" + this.K1.id, -1L);
                TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(this.K1.id));
                if (M0 != null && this.K1.stickerset != null && xc2.N(M0)) {
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
                    TLRPC.Chat M02 = uc7.s1(i2).M0(Long.valueOf(this.K1.id));
                    if (M02 == null) {
                        arrayList5.remove(b2);
                        i9--;
                    } else {
                        this.f0 = true;
                        String str = "chat" + M02.id;
                        int i10 = b04Var.y;
                        b04Var.y = i10 + 1;
                        u3b u3bVar = (u3b) b04Var.n.get(str);
                        if (u3bVar != null) {
                            b04Var.g(str, u3bVar, i10);
                        } else {
                            u3bVar = new u3b(b04Var.getContext(), b2);
                            u3bVar.setFocusable(true);
                            u3bVar.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    byte b3 = b2;
                                    b04 b04Var2 = b04Var;
                                    switch (b3) {
                                        case 0:
                                            b04Var2.f.a(((Integer) view.getTag(2131296463)).intValue());
                                            return;
                                        default:
                                            b04Var2.f.a(((Integer) view.getTag(2131296463)).intValue());
                                            return;
                                    }
                                }
                            });
                            oobVar.addView(u3bVar, i10);
                            u3bVar.x = true;
                            rb0 rb0Var = new rb0(vnbVar2);
                            rb0Var.s(hl.L(14.0f));
                            rb0Var.p(M02);
                            int i11 = b04Var.a;
                            de0 de0Var = u3bVar.e;
                            de0Var.setLayerNum(i11);
                            de0Var.f(M02, rb0Var);
                            de0Var.setAspectFit(true);
                            u3bVar.setExpanded(b04Var.g0);
                            u3bVar.a(b04Var.j0);
                            u3bVar.h.setText(M02.title);
                        }
                        u3bVar.d = true;
                        u3bVar.setTag(2131296463, Integer.valueOf(i10));
                        if (i10 == b04Var.E) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        u3bVar.setSelected(z5);
                        b04Var.h.put(str, u3bVar);
                    }
                    b = 0;
                    vnbVar = null;
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
                    Object w = xb4.w(tL_messages_stickerSet5.set.thumbs, 90, z3, null, z3);
                    if (w == null || tL_messages_stickerSet5.set.gifs) {
                        w = document;
                    }
                    String str2 = "set" + tL_messages_stickerSet5.set.id;
                    int i13 = b04Var.y;
                    b04Var.y = i13 + 1;
                    u3b u3bVar2 = (u3b) b04Var.n.get(str2);
                    if (u3bVar2 != null) {
                        b04Var.g(str2, u3bVar2, i13);
                    } else {
                        u3bVar2 = new u3b(b04Var.getContext(), 0);
                        u3bVar2.setFocusable(true);
                        u3bVar2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                byte b3 = b2;
                                b04 b04Var2 = b04Var;
                                switch (b3) {
                                    case 0:
                                        b04Var2.f.a(((Integer) view.getTag(2131296463)).intValue());
                                        return;
                                    default:
                                        b04Var2.f.a(((Integer) view.getTag(2131296463)).intValue());
                                        return;
                                }
                            }
                        });
                        u3bVar2.setExpanded(b04Var.g0);
                        u3bVar2.a(b04Var.j0);
                        oobVar.addView(u3bVar2, i13);
                    }
                    u3bVar2.e.setLayerNum(b04Var.a);
                    b = 0;
                    u3bVar2.d = false;
                    u3bVar2.setTag(w);
                    u3bVar2.setTag(2131296463, Integer.valueOf(i13));
                    u3bVar2.setTag(2131296593, tL_messages_stickerSet5);
                    u3bVar2.setTag(2131296587, document);
                    if (i13 == b04Var.E) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    u3bVar2.setSelected(z4);
                    b04Var.h.put(str2, u3bVar2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(tL_messages_stickerSet5.set.title);
                    sb.append(", ");
                    vnbVar = null;
                    sb.append(ob6.M0(2131754752, null));
                    u3bVar2.setContentDescription(sb.toString());
                }
                i9++;
                b2 = b;
                vnbVar2 = vnbVar;
            }
            b04Var.h();
            b04Var.q();
            if (currentPosition != 0) {
                b04Var.k(currentPosition, currentPosition);
            }
            l();
        }
    }

    public final void Y() {
        boolean z;
        int i;
        c04 c04Var = this.D0;
        b04 b04Var = this.C0;
        if (b04Var != null && c04Var == null && this.u1 != null) {
            b04Var.setTranslationY(this.u1.o() * (-hl.L(50.0f)));
        }
        if (c04Var == null) {
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
        c04Var.setVisibility(i);
        if (z) {
            Rect rect = this.y2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.y0, rect, null);
            float o = this.u1.o() * hl.L(50.0f);
            int i2 = rect.left;
            if (i2 != 0 || o != 0.0f) {
                this.Y1 = false;
            }
            c04Var.setTranslationX(i2);
            float translationY = (((getTranslationY() + getTop()) - c04Var.getTop()) - b04Var.getExpandedOffset()) - o;
            if (c04Var.getTranslationY() != translationY) {
                c04Var.setTranslationY(translationY);
                c04Var.invalidate();
            }
        }
        if (this.Y1 && z && this.Q0) {
            b04Var.i(true, this.X1);
            return;
        }
        this.Y1 = false;
        b04Var.i(false, this.X1);
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o24.Z():void");
    }

    @Override
    public final void a(int i) {
        setBottomInset(i);
    }

    @Override
    public final void b(float f) {
        this.r2 = f;
        R();
    }

    public final void d(String str) {
        if (str != null) {
            if (str.startsWith("animated_") || pv3.h(str)) {
                pv3.a(str);
                int i = 0;
                if (getVisibility() != 0 || this.h.getCurrentItem() != 0) {
                    pv3.s();
                    this.S.F(false);
                }
                pv3.r();
                if (!this.d2) {
                    ArrayList arrayList = this.B2;
                    if (arrayList == null) {
                        this.B2 = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    while (true) {
                        ArrayList arrayList2 = pv3.i;
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
        pcc pccVar;
        TLRPC.StickerSet stickerSet;
        int i3 = jn7.x0;
        y04 y04Var = this.S;
        gz3 gz3Var = this.R2;
        if (i == i3) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.z0 != null) {
                    X(((Boolean) objArr[1]).booleanValue());
                    Z();
                    C();
                    l();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    hl.r(gz3Var);
                    hl.d3(gz3Var, 100L);
                    return;
                }
                y04Var.F(false);
            }
        } else if (i == jn7.s3) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.K1;
            if (chatFull != null && chatFull.id == longValue && booleanValue) {
                y04Var.F(true);
            }
        } else if (i == jn7.X0) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                g(booleanValue2);
            }
        } else if (i == jn7.z0) {
            Z();
            yu7 yu7Var = this.x;
            if (yu7Var != null) {
                int childCount = yu7Var.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    yu7Var.getChildAt(i4).invalidate();
                }
            }
            X(false);
        } else if (i == jn7.A0) {
            if (y04Var != null) {
                y04Var.F(false);
            }
        } else {
            int i5 = jn7.B0;
            o14 o14Var = this.T;
            if (i == i5) {
                Long l = (Long) objArr[0];
                long longValue2 = l.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    j24 j24Var = this.A0;
                    if (j24Var != null && j24Var.d == longValue2 && j24Var.f.size() < tL_messages_stickerSet.documents.size()) {
                        j24Var.f = tL_messages_stickerSet.documents;
                        j24Var.f();
                    }
                    if (o14Var != null && o14Var.d == longValue2 && o14Var.f.size() < tL_messages_stickerSet.documents.size()) {
                        o14Var.f = tL_messages_stickerSet.documents;
                        o14Var.f();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.K1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.id == longValue2) {
                    X(false);
                }
                HashMap hashMap = this.s1;
                if (hashMap.containsKey(l) && objArr.length >= 2 && ((pcc) hashMap.get(l)) != null && tL_messages_stickerSet != null && (pccVar = (pcc) hashMap.remove(l)) != null) {
                    pccVar.a(tL_messages_stickerSet);
                }
                hl.r(gz3Var);
                hl.d3(gz3Var, 100L);
                return;
            }
            int i6 = jn7.l4;
            b14 b14Var = this.Q;
            if (i == i6) {
                wz3 wz3Var = this.E0;
                if (wz3Var != null) {
                    int childCount2 = wz3Var.getChildCount();
                    for (int i7 = 0; i7 < childCount2; i7++) {
                        View childAt = wz3Var.getChildAt(i7);
                        if ((childAt instanceof t3b) || (childAt instanceof x2b)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (b14Var != null) {
                    b14Var.invalidate();
                    int childCount3 = b14Var.getChildCount();
                    for (int i8 = 0; i8 < childCount3; i8++) {
                        View childAt2 = b14Var.getChildAt(i8);
                        if (childAt2 instanceof x14) {
                            childAt2.invalidate();
                        }
                    }
                }
                bx3 bx3Var = this.C1;
                if (bx3Var != null) {
                    bx3Var.c.invalidate();
                }
                w04 w04Var = this.q0;
                if (w04Var != null) {
                    oob oobVar = w04Var.e;
                    int childCount4 = oobVar.getChildCount();
                    for (int i9 = 0; i9 < childCount4; i9++) {
                        oobVar.getChildAt(i9).invalidate();
                    }
                }
            } else if (i == jn7.L2) {
                if (b14Var != null && this.e0) {
                    if ((this.W.c.k == 2 || b14Var.getAdapter() == o14Var) && !TextUtils.isEmpty(o14Var.w)) {
                        o14Var.E(o14Var.w, true);
                    }
                }
            } else if (i == jn7.i5) {
                if (y04Var != null) {
                    y04Var.F(false);
                }
                T();
                X(false);
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
                canvas.drawColor(vm2.o(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j);
            float Q0 = hl.Q0(this.q2);
            if (Q0 > 0.0f) {
                int p1 = aob.p1(Q0, y(aob.zf));
                int i = this.A2;
                GradientDrawable gradientDrawable = this.z2;
                if (i != p1) {
                    gradientDrawable.setColors(new int[]{p1, aob.p1(0.66f, p1), vm2.o(p1, 0)});
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
        if (i == 2 || w(i).L(0) == null) {
            return;
        }
        m04 m04Var = new m04(getContext(), i2);
        m04Var.a = !z ? 1 : 0;
        v(i).v0(m04Var);
    }

    public final void g(boolean z) {
        if (z) {
            W();
            return;
        }
        int size = this.k1.size();
        int size2 = this.l1.size();
        int i = this.d1;
        this.k1 = ls6.d0(i).j0(0, true);
        this.l1 = ls6.d0(i).j0(2, false);
        if (yac.h(i).p()) {
            this.m1 = ls6.d0(i).j0(7, false);
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
        if (uc7.s1(i).M3()) {
            int i4 = 0;
            while (i4 < this.l1.size()) {
                if (r47.W3((TLRPC.Document) this.l1.get(i4))) {
                    this.l1.remove(i4);
                    i4--;
                }
                i4++;
            }
            int i5 = 0;
            while (i5 < this.k1.size()) {
                if (r47.W3((TLRPC.Document) this.k1.get(i5))) {
                    this.k1.remove(i5);
                    i5--;
                }
                i5++;
            }
        }
        if (size != this.k1.size() || size2 != this.l1.size()) {
            X(false);
        }
        g24 g24Var = this.z0;
        if (g24Var != null) {
            g24Var.f();
        }
        l();
    }

    public int getCurrentPage() {
        return this.B1;
    }

    public ArrayList<c14> getEmojipacks() {
        ArrayList<c14> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.r1;
            if (i < arrayList2.size()) {
                c14 c14Var = (c14) arrayList2.get(i);
                boolean z = c14Var.g;
                ArrayList arrayList3 = this.q1;
                if ((!z && (c14Var.f || arrayList3.contains(Long.valueOf(c14Var.b.id)))) || (c14Var.g && !c14Var.f && !arrayList3.contains(Long.valueOf(c14Var.b.id)))) {
                    arrayList.add(c14Var);
                }
                i++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.d2) {
            return pv3.i;
        }
        if (this.B2 == null) {
            this.B2 = new ArrayList();
        }
        if (pv3.i.size() != this.C2) {
            this.B2.clear();
            int i = 0;
            while (true) {
                ArrayList arrayList = pv3.i;
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
        b04 b04Var = this.C0;
        if (b04Var == null) {
            return 0.0f;
        }
        return b04Var.getExpandedOffset();
    }

    public final void h(boolean z) {
        int i;
        boolean z2;
        p14 p14Var = this.u1;
        fm0 fm0Var = this.b;
        b14 b14Var = this.Q;
        oz3 oz3Var = this.W;
        if (p14Var != null && p14Var.z()) {
            f89 L = b14Var.L(0);
            if (L == null) {
                oz3Var.e(true, !z);
            } else {
                if (L.a.getTop() < b14Var.getPaddingTop()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                oz3Var.e(z2, !z);
            }
            M(false, !z);
            oz3Var.setTranslationY(fm0Var.e * hl.L(15.0f));
        } else if (oz3Var != null && b14Var != null) {
            f89 L2 = b14Var.L(0);
            if (L2 != null) {
                i = L2.a.getTop();
            } else {
                i = -this.c1;
            }
            oz3Var.setTranslationY((fm0Var.e * hl.L(15.0f)) + i);
            oz3Var.e(false, !z);
            i(Math.round(this.J.getTranslationY()));
        }
    }

    public final void i(int i) {
        ObjectAnimator objectAnimator = this.S0[1];
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        boolean z = false;
        f89 L = this.Q.L(0);
        int L2 = hl.L(38.0f) + i;
        if (L2 > 0 && (L == null || L.a.getBottom() < L2)) {
            z = true;
        }
        M(z, !this.L1);
    }

    public final void j(int i, View view) {
        b14 b14Var;
        f89 L;
        int i2;
        t04 t04Var = this.J;
        int[] iArr = this.R0;
        if (view == null) {
            iArr[1] = 0;
            t04Var.setTranslationY(0.0f);
        } else if (view.getVisibility() == 0 && !this.g0) {
            p14 p14Var = this.u1;
            if (p14Var == null || !p14Var.z()) {
                if (i > 0 && (b14Var = this.Q) != null && b14Var.getVisibility() == 0 && (L = b14Var.L(0)) != null) {
                    int top = L.a.getTop();
                    if (this.e0) {
                        i2 = this.c1;
                    } else {
                        i2 = 0;
                    }
                    if (top + i2 >= b14Var.getPaddingTop()) {
                        return;
                    }
                }
                int i3 = iArr[1] - i;
                iArr[1] = i3;
                if (i3 > 0) {
                    iArr[1] = 0;
                } else if (i3 < (-hl.L(108.0f))) {
                    iArr[1] = -hl.L(108.0f);
                }
                t04Var.setTranslationY(Math.max(-hl.L(36.0f), iArr[1]));
            }
        }
    }

    public final void k(boolean z) {
        u14 u14Var;
        int M0;
        rz3 rz3Var = this.i0;
        if (rz3Var != null && (rz3Var.getAdapter() instanceof t14)) {
            t14 t14Var = (t14) rz3Var.getAdapter();
            if (!t14Var.s && t14Var.h == 0 && !t14Var.y.isEmpty() && (M0 = (u14Var = this.j0).M0()) != -1 && M0 > u14Var.A() - 5) {
                String str = t14Var.x;
                String str2 = t14Var.r;
                boolean z2 = t14Var.w;
                t14Var.F(str, str2, true, z2, z2);
            }
        }
        p14 p14Var = this.u1;
        tz3 tz3Var = this.p0;
        if (p14Var != null && p14Var.z()) {
            boolean z3 = false;
            f89 L = rz3Var.L(0);
            if (L == null) {
                tz3Var.e(true, !z);
                return;
            }
            if (L.a.getTop() < rz3Var.getPaddingTop()) {
                z3 = true;
            }
            tz3Var.e(z3, !z);
        } else if (tz3Var != null && rz3Var != null) {
            tz3Var.e(true, !z);
        }
    }

    public final void l() {
        int K0;
        b04 b04Var = this.C0;
        if (b04Var != null && (K0 = this.F0.K0()) != -1) {
            int i = this.H1;
            if (i <= 0 && (i = this.G1) <= 0) {
                i = this.F1;
            }
            b04Var.k(this.z0.F(K0), i);
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
            j79 adapter = this.i0.getAdapter();
            t14 t14Var = this.o0;
            if (adapter == t14Var && t14Var.J >= 0 && this.t0 >= 0 && this.s0 >= 0 && (K0 = this.j0.K0()) != -1) {
                if (K0 >= t14Var.J) {
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
        p14 p14Var = this.u1;
        fm0 fm0Var = this.a;
        wz3 wz3Var = this.E0;
        boolean z2 = false;
        a04 a04Var = this.H0;
        if (p14Var != null && p14Var.z()) {
            f89 L = wz3Var.L(0);
            if (L == null) {
                a04Var.e(true, !z);
            } else {
                if (L.a.getTop() < wz3Var.getPaddingTop()) {
                    z2 = true;
                }
                a04Var.e(z2, !z);
            }
            a04Var.setTranslationY(fm0Var.e * hl.L(15.0f));
        } else if (a04Var != null && wz3Var != null) {
            f89 L2 = wz3Var.L(0);
            if (L2 != null) {
                i = L2.a.getTop();
            } else {
                i = -this.c1;
            }
            a04Var.setTranslationY((fm0Var.e * hl.L(15.0f)) + i);
            a04Var.e(false, !z);
        }
    }

    public final void o(int i, int i2) {
        f89 L;
        if (i == 1) {
            j(i2, this.Q);
            return;
        }
        p14 p14Var = this.u1;
        if ((p14Var == null || !p14Var.z()) && !this.K0) {
            d79 w = w(i);
            if (i2 > 0 && w != null && w.getVisibility() == 0 && (L = w.L(0)) != null && L.a.getTop() + this.c1 >= w.getPaddingTop()) {
                return;
            }
            int[] iArr = this.R0;
            int i3 = iArr[i] - i2;
            iArr[i] = i3;
            if (i3 > 0) {
                iArr[i] = 0;
            } else if (i3 < (-hl.L(288.0f))) {
                iArr[i] = -hl.L(288.0f);
            }
            if (i == 0) {
                Y();
            } else {
                x(i).setTranslationY(Math.max(-hl.L(48.0f), iArr[i]));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u8a u8aVar = this.M2;
        if (u8aVar != null) {
            u8aVar.a();
            this.M2 = null;
        }
        u8a u8aVar2 = (u8a) new ou0(jn7.f(this.d1), this).b;
        u8aVar2.e(jn7.l4);
        u8aVar2.b(jn7.L2);
        u8aVar2.b(jn7.s3);
        this.M2 = u8aVar2;
        if (this.z0 != null) {
            u8aVar2.b(jn7.x0);
            u8aVar2.b(jn7.X0);
            u8aVar2.b(jn7.z0);
            u8aVar2.b(jn7.B0);
            u8aVar2.b(jn7.i5);
            hl.c3(new gz3(this, (byte) 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx3 bx3Var = this.C1;
        if (bx3Var != null && bx3Var.isShowing()) {
            bx3Var.dismiss();
        }
        rw2 e = rw2.e();
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
        R();
        Y();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.L1 = true;
        boolean z = hl.E;
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
                    int i3 = aob.zf;
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
                setElevation(hl.L(2.0f));
            }
            setBackgroundResource(2131232754);
            Drawable background = getBackground();
            int i4 = aob.zf;
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

    public final void p() {
        HashMap hashMap = pv3.a;
        uc7.d1().edit().putBoolean("filled_default", true).commit();
        pv3.h.clear();
        pv3.i.clear();
        pv3.r();
        this.S.F(false);
    }

    public final void q(long j, boolean z) {
        c24 c24Var;
        x46 x46Var;
        View view;
        d79 d79Var;
        int i;
        int i2;
        TLRPC.TL_messages_stickerSet p0;
        g24 g24Var;
        int E;
        AnimatorSet animatorSet = this.N0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i3 = 2;
        if (currentItem == 2 && j != -1 && (p0 = ls6.d0(this.d1).p0(j)) != null && (E = (g24Var = this.z0).E(p0)) >= 0 && E < g24Var.b()) {
            F(E, hl.L(48.0f));
        }
        int i4 = 0;
        t14 t14Var = this.k0;
        if (t14Var != null) {
            t14Var.L = false;
        }
        int i5 = 0;
        while (i5 < 3) {
            d79 d79Var2 = this.E0;
            d79 d79Var3 = this.i0;
            tz3 tz3Var = this.p0;
            d79 d79Var4 = this.Q;
            if (i5 == 0) {
                c24Var = this.W;
                x46Var = this.R;
                view = this.J;
                d79Var = d79Var4;
            } else if (i5 == 1) {
                x46Var = this.j0;
                view = this.q0;
                d79Var = d79Var3;
                c24Var = tz3Var;
            } else {
                c24Var = this.H0;
                x46Var = this.F0;
                view = this.C0;
                d79Var = d79Var2;
            }
            if (c24Var == null) {
                i2 = i4;
                i = i3;
            } else {
                int i6 = i4;
                b24 b24Var = c24Var.r;
                int i7 = i3;
                c24Var.d.setText("");
                if (b24Var != null) {
                    b24Var.J1(null);
                    b24Var.H1();
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
                        fArr2[i6] = hl.L(36.0f);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(d79Var, property, fArr2);
                        float[] fArr3 = new float[1];
                        fArr3[i6] = hl.L(36.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c24Var, property, fArr3);
                        Animator[] animatorArr = new Animator[3];
                        animatorArr[i6] = ofFloat;
                        animatorArr[1] = ofFloat2;
                        animatorArr[i7] = ofFloat3;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        float[] fArr4 = new float[1];
                        fArr4[i6] = hl.L(36.0f) - i8;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(d79Var, property, fArr4);
                        Animator[] animatorArr2 = new Animator[1];
                        animatorArr2[i6] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.N0.setDuration(200L);
                    this.N0.setInterpolator(k43.h);
                    this.N0.addListener(new j8(this, x46Var, d79Var, (byte) 6));
                    this.N0.start();
                    i2 = i6;
                    i = i7;
                } else {
                    if (c24Var != tz3Var) {
                        c24Var.setTranslationY(hl.L(36.0f) - i8);
                    }
                    i = i7;
                    if (view != null && i5 != i) {
                        view.setTranslationY(0.0f);
                    }
                    if (d79Var == d79Var2) {
                        i2 = i6;
                        d79Var.setPadding(i2, hl.L(36.0f), i2, hl.L(44.0f) + this.q2);
                    } else {
                        i2 = i6;
                        if (d79Var == d79Var3) {
                            d79Var.setPadding(i2, hl.L(40.0f), i2, hl.L(44.0f) + this.q2);
                        } else {
                            if (d79Var == d79Var4) {
                                d79Var.setPadding(hl.L(5.0f), hl.L(36.0f), hl.L(5.0f), hl.L(44.0f) + this.q2);
                            }
                            i2 = 0;
                        }
                    }
                    x46Var.g1(i2, i2);
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
        g24 g24Var;
        boolean z2 = this.T2;
        this.T2 = z;
        if (z2 && !z) {
            int i = this.B1;
            if (i == 0) {
                y04 y04Var = this.S;
                if (y04Var != null) {
                    y04Var.F(false);
                }
            } else if (i == 1) {
                t14 t14Var = this.o0;
                if (t14Var != null) {
                    t14Var.f();
                }
            } else if (i == 2 && (g24Var = this.z0) != null) {
                g24Var.f();
            }
        }
    }

    public void setBlurredBackgroundDrawableFactory(ll0 ll0Var) {
        vnb vnbVar = this.a2;
        View view = this.y;
        if (view != null) {
            jl0 c = ll0Var.c(view, null, false);
            c.p(dtd.e(vnbVar));
            c.r(hl.L(18.0f));
            c.q(hl.L(6.0f));
            view.setBackground(c);
        }
        View view2 = this.F;
        if (view2 != null) {
            jl0 c2 = ll0Var.c(view2, null, false);
            c2.p(dtd.e(vnbVar));
            c2.r(hl.L(18.0f));
            c2.q(hl.L(6.0f));
            view2.setBackground(c2);
        }
        View view3 = this.x;
        if (view3 != null) {
            jl0 c3 = ll0Var.c(view3, null, false);
            c3.p(dtd.e(vnbVar));
            c3.r(hl.L(18.0f));
            c3.q(hl.L(6.0f));
            view3.setBackground(c3);
        }
        View view4 = this.E;
        if (view4 != null) {
            jl0 c4 = ll0Var.c(view4, null, false);
            c4.p(dtd.e(vnbVar));
            c4.r(hl.L(18.0f));
            c4.q(hl.L(6.0f));
            view4.setBackground(c4);
        }
    }

    public void setBottomInset(int i) {
        if (this.q2 != i) {
            this.q2 = i;
            f(i, this.L);
            f(i, this.N);
            f(hl.L(44.0f) + i, this.Q);
            f(hl.L(44.0f) + i, this.E0);
            f(hl.L(44.0f) + i, this.i0);
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
        X(false);
    }

    public void setDelegate(p14 p14Var) {
        this.u1 = p14Var;
    }

    public void setDragListener(v04 v04Var) {
        this.P0 = v04Var;
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        a04 a04Var = this.H0;
        if (a04Var != null) {
            a04Var.d.setEnabled(z);
        }
        tz3 tz3Var = this.p0;
        if (tz3Var != null) {
            tz3Var.d.setEnabled(z);
        }
        oz3 oz3Var = this.W;
        if (oz3Var != null) {
            oz3Var.d.setEnabled(z);
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
        Y();
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        Y();
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
                pv3.s();
                this.S.F(false);
                u8a u8aVar = this.N2;
                int i2 = this.d1;
                if (u8aVar == null) {
                    u8aVar = (u8a) new ou0(jn7.f(i2), this).b;
                    u8aVar.b(jn7.x0);
                    this.N2 = u8aVar;
                }
                if (this.z0 != null) {
                    if (!this.O2) {
                        this.O2 = true;
                        u8aVar.b(jn7.X0);
                    }
                    X(false);
                    C();
                }
                g(true);
                g(false);
                ls6.d0(i2).X0(true, true, false, 0);
                ls6.d0(i2).X0(false, true, false, 0);
                ls6.d0(i2).X0(false, true, false, 2);
            }
            h04 h04Var = this.U0;
            if (h04Var != null) {
                h04Var.a();
            }
        }
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 4;
        if (i == 0) {
            n(false);
            float f3 = 1.0f - this.a.e;
            a04 a04Var = this.H0;
            a04Var.setAlpha(f3);
            if (f3 > 0.0f) {
                i4 = 0;
            } else {
                i4 = 4;
            }
            a04Var.setVisibility(i4);
            float f4 = 1.0f - f3;
            bp4 bp4Var = this.I0;
            bp4Var.setAlpha(f4);
            bp4Var.setTranslationY((-hl.L(15.0f)) * f3);
            int i7 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
            if (i7 > 0) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            bp4Var.setVisibility(i5);
            tt ttVar = this.N;
            ttVar.setAlpha(f4);
            ttVar.setTranslationY(hl.L(30.0f) * f3);
            if (i7 > 0) {
                i6 = 0;
            }
            ttVar.setVisibility(i6);
            R();
            this.y0.invalidate();
        } else if (i == 1) {
            h(false);
            float f5 = 1.0f - this.b.e;
            oz3 oz3Var = this.W;
            oz3Var.setAlpha(f5);
            if (f5 > 0.0f) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            oz3Var.setVisibility(i2);
            float f6 = 1.0f - f5;
            bp4 bp4Var2 = this.V;
            bp4Var2.setAlpha(f6);
            bp4Var2.setTranslationY((-hl.L(15.0f)) * f5);
            int i8 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
            if (i8 > 0) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            bp4Var2.setVisibility(i3);
            tt ttVar2 = this.L;
            ttVar2.setAlpha(f6);
            ttVar2.setTranslationY(hl.L(30.0f) * f5);
            if (i8 > 0) {
                i6 = 0;
            }
            ttVar2.setVisibility(i6);
            R();
            this.K.invalidate();
        }
    }

    public final int u(float f) {
        return vm2.o(aob.v0(aob.Nl, this.a2), (int) (f * 255.0f));
    }

    @Override
    public final void updateColors() {
        try {
            S();
            oz4 oz4Var = this.m2;
            if (oz4Var != null) {
                oz4Var.a(y(aob.d6));
            }
            yu7 yu7Var = this.x;
            if (yu7Var != null) {
                yu7Var.setIndicatorColor(vm2.o(y(aob.Gf), 20));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final u55 v(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return this.j0;
                }
                lq5.j(uh9.k(i, "Unexpected argument: "));
                return null;
            }
            return this.R;
        }
        return this.F0;
    }

    public final d79 w(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return this.i0;
                }
                lq5.j(uh9.k(i, "Unexpected argument: "));
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
                lq5.j(uh9.k(i, "Unexpected argument: "));
                return null;
            }
            return this.J;
        }
        return this.C0;
    }

    public final int y(int i) {
        vnb vnbVar = this.a2;
        if (vnbVar != null) {
            return vnbVar.h(i);
        }
        return aob.w0(null, i, false);
    }

    public final void z() {
        a04 a04Var = this.H0;
        if (a04Var != null) {
            a04Var.a();
        }
        tz3 tz3Var = this.p0;
        if (tz3Var != null) {
            tz3Var.a();
        }
        oz3 oz3Var = this.W;
        if (oz3Var != null) {
            oz3Var.a();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void v0(float f, int i) {
    }
}
