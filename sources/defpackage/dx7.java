package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
public abstract class dx7 extends xma implements qv7, f44, lv7, vma, nbb {
    public final ow7 A0;
    public ArrayList A1;
    public final zw7 B0;
    public int B1;
    public final FrameLayout C0;
    public int C1;
    public final ax7 D0;
    public sm2 D1;
    public final ow7 E0;
    public final boolean E1;
    public final FrameLayout F0;
    public final File F1;
    public g7 G0;
    public final boolean G1;
    public final View H0;
    public final boolean H1;
    public int I0;
    public boolean I1;
    public int J0;
    public i49 J1;
    public float K0;
    public s39 K1;
    public ValueAnimator L0;
    public float L1;
    public boolean M0;
    public boolean M1;
    public final gx7 N0;
    public boolean N1;
    public final xh4 O0;
    public tl0 O1;
    public final int P0;
    public final o00 P1;
    public BigInteger Q0;
    public final gbb Q1;
    public TextView R0;
    public boolean R1;
    public TextView S0;
    public ObjectAnimator S1;
    public TextView T0;
    public boolean T1;
    public final rv7 U0;
    public final gc1 U1;
    public final nv7 V0;
    public final c8b V1;
    public final zv7 W0;
    public final kj4 W1;
    public final ImageView X0;
    public final float[] X1;
    public final TextView Y0;
    public tw7 Y1;
    public final TextView Z0;
    public boolean Z1;
    public final TextView a1;
    public boolean a2;
    public final Paint b1;
    public boolean b2;
    public final Paint c1;
    public final int[] c2;
    public float d1;
    public o24 d2;
    public boolean e1;
    public boolean e2;
    public vpa f1;
    public boolean f2;
    public final pw7 g1;
    public boolean g2;
    public final Paint h1;
    public int h2;
    public final Paint i1;
    public boolean i2;
    public final Paint j1;
    public int j2;
    public final dv7 k0;
    public final igb k1;
    public int k2;
    public final iv7 l0;
    public boolean l1;
    public int l2;
    public final Bitmap m0;
    public vpa m1;
    public boolean m2;
    public final a9c n0;
    public float n1;
    public final uo3 o0;
    public final Paint o1;
    public final fo6 p0;
    public final int p1;
    public boolean q0;
    public final uk5 q1;
    public qma r0;
    public n8 r1;
    public boolean s0;
    public cx7 s1;
    public h44 t0;
    public Rect t1;
    public boolean u0;
    public Runnable u1;
    public int v0;
    public Runnable v1;
    public boolean w0;
    public final qbb w1;
    public final boolean x0;
    public AnimatorSet x1;
    public final yw7 y0;
    public final qw7 y1;
    public final tb z0;
    public c8b z1;

    public dx7(Context context, boolean z, File file, boolean z2, boolean z3, qbb qbbVar, Activity activity, final int i, Bitmap bitmap, Bitmap bitmap2, int i2, ArrayList arrayList, c8b c8bVar, int i3, int i4, fo6 fo6Var, tl0 tl0Var, x53 x53Var, o00 o00Var, gbb gbbVar) {
        super(context, activity);
        nx7 nx7Var;
        tl0 tl0Var2;
        int i5;
        this.I0 = 0;
        this.J0 = -1;
        final vab vabVar = (vab) this;
        xh4 xh4Var = new xh4(vabVar, (byte) 19);
        this.O0 = xh4Var;
        Paint paint = new Paint(1);
        this.b1 = paint;
        Paint paint2 = new Paint(1);
        this.c1 = paint2;
        this.h1 = new Paint(1);
        this.i1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.j1 = paint3;
        igb igbVar = new igb(1.0f, 0.016773745f, -1);
        this.k1 = igbVar;
        this.o1 = new Paint(1);
        kj4 kj4Var = new kj4(vabVar, (byte) 22);
        this.W1 = kj4Var;
        this.X1 = new float[2];
        this.a2 = false;
        this.c2 = new int[2];
        new ki7(vabVar, (byte) 3);
        setDelegate(this);
        this.O1 = tl0Var;
        this.P1 = o00Var;
        this.E1 = z;
        this.F1 = file;
        this.G1 = z2;
        this.H1 = z3;
        this.w1 = qbbVar;
        this.B1 = i3;
        this.C1 = i4;
        this.Q1 = gbbVar;
        this.p1 = i;
        if (z2 && !z3 && c8bVar != null && c8bVar.L != null && !c8bVar.v()) {
            this.V1 = c8bVar;
            File file2 = c8bVar.L;
            gc1 gc1Var = (file2 != null && file2.exists() && DictationAsr.x(i) && qn3.h()) ? new gc1(file2, kj4Var) : null;
            this.U1 = gc1Var;
            if (gc1Var != null) {
                gc1Var.d = new ew7(vabVar, (byte) 0);
            }
        }
        uk5 uk5Var = new uk5(x53Var);
        this.q1 = uk5Var;
        this.p0 = fo6Var;
        this.x0 = context instanceof BubbleActivity;
        a78 e = a78.e(i);
        e.i(0, true);
        igbVar.a = e.c();
        igbVar.c = e.i;
        uo3 uo3Var = new uo3("Paint", true);
        this.o0 = uo3Var;
        this.m0 = bitmap;
        this.P0 = i2;
        a9c a9cVar = new a9c();
        this.n0 = a9cVar;
        a9cVar.a = new bm6(vabVar, (byte) 25);
        View view = new View(context);
        this.H0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        nx7 nx7Var2 = new nx7(getPaintingSize(), null, i2, tl0Var);
        if (c8bVar == null || !c8bVar.u) {
            nx7Var = nx7Var2;
            tl0Var2 = tl0Var;
        } else {
            nx7Var = nx7Var2;
            tl0Var2 = null;
        }
        yw7 yw7Var = new yw7(vabVar, context, nx7Var, bitmap, bitmap2, tl0Var2);
        this.y0 = yw7Var;
        yw7Var.setDelegate(new aj3(vabVar, (byte) 23));
        yw7Var.setUndoStore(a9cVar);
        yw7Var.setQueue(uo3Var);
        yw7Var.setVisibility(4);
        tb tbVar = new tb((byte) 23, context, vabVar);
        this.z0 = tbVar;
        tbVar.setVisibility(4);
        zw7 zw7Var = new zw7(vabVar, context, new v34(vabVar, (byte) 20));
        this.B0 = zw7Var;
        this.z1 = c8bVar;
        this.A1 = arrayList;
        if (this.B1 > 0 && this.C1 > 0) {
            G0();
        }
        zw7Var.setVisibility(4);
        this.A0 = new ow7(vabVar, context, (byte) 1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.C0 = frameLayout;
        frameLayout.setPadding(hl.L(4.0f), hl.L(12.0f), hl.L(4.0f), hl.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(frameLayout, tre.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.X0 = imageView;
        imageView.setImageResource(2131232547);
        imageView.setPadding(hl.L(3.0f), hl.L(3.0f), hl.L(3.0f), hl.L(3.0f));
        imageView.setBackground(aob.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                byte b = r2;
                vab vabVar2 = vabVar;
                switch (b) {
                    case 0:
                        if (vabVar2.l1) {
                            vabVar2.H0(false);
                            return;
                        } else if (vabVar2.e2) {
                            vabVar2.s0(true);
                            return;
                        } else if (vabVar2.u0) {
                            vabVar2.C0(null, true);
                            return;
                        } else {
                            Runnable runnable = vabVar2.v1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                    case 1:
                        yw7 yw7Var2 = vabVar2.y0;
                        if (yw7Var2 != null && (yw7Var2.getCurrentBrush() instanceof u01)) {
                            yw7Var2.b();
                            vabVar2.U0.setSelectedIndex(1);
                            vabVar2.s((v01) v01.a.get(0));
                            return;
                        }
                        vabVar2.n0.c();
                        return;
                    case 2:
                        yw7 yw7Var3 = vabVar2.y0;
                        a9c a9cVar2 = vabVar2.n0;
                        if (a9cVar2.a()) {
                            if (yw7Var3 != null && (yw7Var3.getCurrentBrush() instanceof u01)) {
                                yw7Var3.b();
                                vabVar2.U0.setSelectedIndex(1);
                                vabVar2.s((v01) v01.a.get(0));
                            }
                            if (yw7Var3 != null) {
                                yw7Var3.a();
                            }
                            a9cVar2.c.clear();
                            a9cVar2.b.clear();
                            hl.c3(new azb(a9cVar2, (byte) 7));
                            vabVar2.B0.removeAllViews();
                            return;
                        }
                        return;
                    case 3:
                        h44 h44Var = vabVar2.t0;
                        if (h44Var instanceof rlb) {
                            hl.t1(((rlb) h44Var).getFocusedView());
                        }
                        if (vabVar2.e2) {
                            vabVar2.s0(false);
                        }
                        vabVar2.B0(vabVar2.t0);
                        vabVar2.C0(null, true);
                        return;
                    default:
                        vabVar2.C0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, tre.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(aob.f0(822083583, 7, -1));
        linearLayout.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(hl.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(ob6.M0(2131746994, null));
        linearLayout.addView(qd4.k(context, 2131232548), tre.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, tre.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new y00((byte) 12));
        frameLayout.addView(linearLayout, tre.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.Y0 = textView2;
        textView2.setBackground(aob.f0(822083583, 7, -1));
        textView2.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        textView2.setText(ob6.M0(2131747006, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(hl.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                byte b = r2;
                vab vabVar2 = vabVar;
                switch (b) {
                    case 0:
                        if (vabVar2.l1) {
                            vabVar2.H0(false);
                            return;
                        } else if (vabVar2.e2) {
                            vabVar2.s0(true);
                            return;
                        } else if (vabVar2.u0) {
                            vabVar2.C0(null, true);
                            return;
                        } else {
                            Runnable runnable = vabVar2.v1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                    case 1:
                        yw7 yw7Var2 = vabVar2.y0;
                        if (yw7Var2 != null && (yw7Var2.getCurrentBrush() instanceof u01)) {
                            yw7Var2.b();
                            vabVar2.U0.setSelectedIndex(1);
                            vabVar2.s((v01) v01.a.get(0));
                            return;
                        }
                        vabVar2.n0.c();
                        return;
                    case 2:
                        yw7 yw7Var3 = vabVar2.y0;
                        a9c a9cVar2 = vabVar2.n0;
                        if (a9cVar2.a()) {
                            if (yw7Var3 != null && (yw7Var3.getCurrentBrush() instanceof u01)) {
                                yw7Var3.b();
                                vabVar2.U0.setSelectedIndex(1);
                                vabVar2.s((v01) v01.a.get(0));
                            }
                            if (yw7Var3 != null) {
                                yw7Var3.a();
                            }
                            a9cVar2.c.clear();
                            a9cVar2.b.clear();
                            hl.c3(new azb(a9cVar2, (byte) 7));
                            vabVar2.B0.removeAllViews();
                            return;
                        }
                        return;
                    case 3:
                        h44 h44Var = vabVar2.t0;
                        if (h44Var instanceof rlb) {
                            hl.t1(((rlb) h44Var).getFocusedView());
                        }
                        if (vabVar2.e2) {
                            vabVar2.s0(false);
                        }
                        vabVar2.B0(vabVar2.t0);
                        vabVar2.C0(null, true);
                        return;
                    default:
                        vabVar2.C0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView l = ik8.l(frameLayout, textView2, tre.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.Z0 = l;
        l.setBackground(aob.f0(822083583, 7, -1));
        l.setText(ob6.M0(2131752066, null));
        l.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        l.setGravity(16);
        l.setTextColor(-1);
        l.setTypeface(hl.o());
        l.setTextSize(1, 16.0f);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                byte b = r2;
                vab vabVar2 = vabVar;
                switch (b) {
                    case 0:
                        if (vabVar2.l1) {
                            vabVar2.H0(false);
                            return;
                        } else if (vabVar2.e2) {
                            vabVar2.s0(true);
                            return;
                        } else if (vabVar2.u0) {
                            vabVar2.C0(null, true);
                            return;
                        } else {
                            Runnable runnable = vabVar2.v1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                    case 1:
                        yw7 yw7Var2 = vabVar2.y0;
                        if (yw7Var2 != null && (yw7Var2.getCurrentBrush() instanceof u01)) {
                            yw7Var2.b();
                            vabVar2.U0.setSelectedIndex(1);
                            vabVar2.s((v01) v01.a.get(0));
                            return;
                        }
                        vabVar2.n0.c();
                        return;
                    case 2:
                        yw7 yw7Var3 = vabVar2.y0;
                        a9c a9cVar2 = vabVar2.n0;
                        if (a9cVar2.a()) {
                            if (yw7Var3 != null && (yw7Var3.getCurrentBrush() instanceof u01)) {
                                yw7Var3.b();
                                vabVar2.U0.setSelectedIndex(1);
                                vabVar2.s((v01) v01.a.get(0));
                            }
                            if (yw7Var3 != null) {
                                yw7Var3.a();
                            }
                            a9cVar2.c.clear();
                            a9cVar2.b.clear();
                            hl.c3(new azb(a9cVar2, (byte) 7));
                            vabVar2.B0.removeAllViews();
                            return;
                        }
                        return;
                    case 3:
                        h44 h44Var = vabVar2.t0;
                        if (h44Var instanceof rlb) {
                            hl.t1(((rlb) h44Var).getFocusedView());
                        }
                        if (vabVar2.e2) {
                            vabVar2.s0(false);
                        }
                        vabVar2.B0(vabVar2.t0);
                        vabVar2.C0(null, true);
                        return;
                    default:
                        vabVar2.C0(null, true);
                        return;
                }
            }
        });
        l.setAlpha(0.0f);
        l.setVisibility(8);
        TextView l2 = ik8.l(frameLayout, l, tre.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.a1 = l2;
        l2.setBackground(aob.f0(822083583, 7, -1));
        l2.setText(ob6.M0(2131751319, null));
        l2.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        l2.setGravity(16);
        l2.setTextColor(-1);
        l2.setTypeface(hl.o());
        l2.setTextSize(1, 16.0f);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                byte b = r2;
                vab vabVar2 = vabVar;
                switch (b) {
                    case 0:
                        if (vabVar2.l1) {
                            vabVar2.H0(false);
                            return;
                        } else if (vabVar2.e2) {
                            vabVar2.s0(true);
                            return;
                        } else if (vabVar2.u0) {
                            vabVar2.C0(null, true);
                            return;
                        } else {
                            Runnable runnable = vabVar2.v1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                    case 1:
                        yw7 yw7Var2 = vabVar2.y0;
                        if (yw7Var2 != null && (yw7Var2.getCurrentBrush() instanceof u01)) {
                            yw7Var2.b();
                            vabVar2.U0.setSelectedIndex(1);
                            vabVar2.s((v01) v01.a.get(0));
                            return;
                        }
                        vabVar2.n0.c();
                        return;
                    case 2:
                        yw7 yw7Var3 = vabVar2.y0;
                        a9c a9cVar2 = vabVar2.n0;
                        if (a9cVar2.a()) {
                            if (yw7Var3 != null && (yw7Var3.getCurrentBrush() instanceof u01)) {
                                yw7Var3.b();
                                vabVar2.U0.setSelectedIndex(1);
                                vabVar2.s((v01) v01.a.get(0));
                            }
                            if (yw7Var3 != null) {
                                yw7Var3.a();
                            }
                            a9cVar2.c.clear();
                            a9cVar2.b.clear();
                            hl.c3(new azb(a9cVar2, (byte) 7));
                            vabVar2.B0.removeAllViews();
                            return;
                        }
                        return;
                    case 3:
                        h44 h44Var = vabVar2.t0;
                        if (h44Var instanceof rlb) {
                            hl.t1(((rlb) h44Var).getFocusedView());
                        }
                        if (vabVar2.e2) {
                            vabVar2.s0(false);
                        }
                        vabVar2.B0(vabVar2.t0);
                        vabVar2.C0(null, true);
                        return;
                    default:
                        vabVar2.C0(null, true);
                        return;
                }
            }
        });
        l2.setAlpha(0.0f);
        l2.setVisibility(8);
        frameLayout.addView(l2, tre.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ax7 ax7Var = new ax7(vabVar, context, e);
        this.D0 = ax7Var;
        ax7Var.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), 0);
        ax7Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(ax7Var, tre.e(-1, 104, 80));
        rv7 rv7Var = new rv7(context, (c8bVar == null || c8bVar.v() || c8bVar.u || tl0Var == null) ? false : true);
        this.U0 = rv7Var;
        rv7Var.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        rv7Var.setDelegate(this);
        rv7Var.setSelectedIndex(1);
        ax7Var.addView(rv7Var, tre.c(48.0f, -1));
        nv7 nv7Var = new nv7(context);
        this.V0 = nv7Var;
        nv7Var.setPadding(hl.L(16.0f), 0, hl.L(8.0f), 0);
        nv7Var.setVisibility(8);
        nv7Var.setDelegate(this);
        post(new Runnable() {
            @Override
            public final void run() {
                byte b = r3;
                int i6 = i;
                vab vabVar2 = vabVar;
                switch (b) {
                    case 0:
                        igb igbVar2 = vabVar2.k1;
                        vabVar2.E0(igbVar2);
                        a78.e(i6).j(igbVar2.c);
                        return;
                    default:
                        vabVar2.V0.setTypeface(a78.e(i6).j);
                        return;
                }
            }
        });
        nv7Var.setAlignment(a78.e(i).g);
        ax7Var.addView(nv7Var, tre.c(48.0f, -1));
        ow7 ow7Var = new ow7(vabVar, context, (byte) 0);
        this.E0 = ow7Var;
        addView(ow7Var, tre.c(-1.0f, -1));
        zv7 zv7Var = new zv7(context);
        this.W0 = zv7Var;
        zv7Var.setVisibility(8);
        zv7Var.setOnItemClickListener(new zg4(vabVar, (byte) 15));
        nv7Var.setTypefaceListView(zv7Var);
        ow7Var.addView(zv7Var, tre.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(352321535);
        paint2.setColor(aob.v0(aob.G8, uk5Var));
        pw7 pw7Var = new pw7(vabVar, context);
        this.g1 = pw7Var;
        pw7Var.setVisibility(8);
        pw7Var.setColorPalette(a78.e(i));
        pw7Var.setColorListener(new hw(vabVar, (byte) 11));
        ax7Var.addView(pw7Var, tre.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        dv7 dv7Var = new dv7(context);
        this.k0 = dv7Var;
        dv7Var.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        dv7Var.setBackground(aob.f0(1090519039, 1, -1));
        ax7Var.addView(dv7Var, tre.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        dv7Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                byte b = r2;
                vab vabVar2 = vabVar;
                switch (b) {
                    case 0:
                        if (vabVar2.l1) {
                            vabVar2.H0(false);
                            return;
                        } else if (vabVar2.e2) {
                            vabVar2.s0(true);
                            return;
                        } else if (vabVar2.u0) {
                            vabVar2.C0(null, true);
                            return;
                        } else {
                            Runnable runnable = vabVar2.v1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                    case 1:
                        yw7 yw7Var2 = vabVar2.y0;
                        if (yw7Var2 != null && (yw7Var2.getCurrentBrush() instanceof u01)) {
                            yw7Var2.b();
                            vabVar2.U0.setSelectedIndex(1);
                            vabVar2.s((v01) v01.a.get(0));
                            return;
                        }
                        vabVar2.n0.c();
                        return;
                    case 2:
                        yw7 yw7Var3 = vabVar2.y0;
                        a9c a9cVar2 = vabVar2.n0;
                        if (a9cVar2.a()) {
                            if (yw7Var3 != null && (yw7Var3.getCurrentBrush() instanceof u01)) {
                                yw7Var3.b();
                                vabVar2.U0.setSelectedIndex(1);
                                vabVar2.s((v01) v01.a.get(0));
                            }
                            if (yw7Var3 != null) {
                                yw7Var3.a();
                            }
                            a9cVar2.c.clear();
                            a9cVar2.b.clear();
                            hl.c3(new azb(a9cVar2, (byte) 7));
                            vabVar2.B0.removeAllViews();
                            return;
                        }
                        return;
                    case 3:
                        h44 h44Var = vabVar2.t0;
                        if (h44Var instanceof rlb) {
                            hl.t1(((rlb) h44Var).getFocusedView());
                        }
                        if (vabVar2.e2) {
                            vabVar2.s0(false);
                        }
                        vabVar2.B0(vabVar2.t0);
                        vabVar2.C0(null, true);
                        return;
                    default:
                        vabVar2.C0(null, true);
                        return;
                }
            }
        });
        iv7 iv7Var = new iv7(context);
        this.l0 = iv7Var;
        iv7Var.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        iv7Var.setBackground(aob.f0(1090519039, 1, -1));
        iv7Var.setOnClickListener(new lw4(vabVar, context, e, (byte) 12));
        ax7Var.addView(iv7Var, tre.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        gx7 gx7Var = new gx7(context);
        this.N0 = gx7Var;
        gx7Var.setColorSwatch(igbVar);
        gx7Var.setRenderView(yw7Var);
        gx7Var.setValueOverride(xh4Var);
        igbVar.c = xh4Var.get();
        gx7Var.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                byte b = r3;
                int i6 = i;
                vab vabVar2 = vabVar;
                switch (b) {
                    case 0:
                        igb igbVar2 = vabVar2.k1;
                        vabVar2.E0(igbVar2);
                        a78.e(i6).j(igbVar2.c);
                        return;
                    default:
                        vabVar2.V0.setTypeface(a78.e(i6).j);
                        return;
                }
            }
        });
        addView(gx7Var, tre.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.F0 = frameLayout2;
        addView(frameLayout2, tre.c(-1.0f, -1));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(hl.L(2.0f));
        D0(igbVar, null, false);
        s((v01) v01.a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = hl.q;
            i5 = 1;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), hl.L(100.0f), (int) (point.y * 0.65d))));
        } else {
            i5 = 1;
        }
        this.y1 = new qw7(vabVar, qbbVar, new v35(vabVar, qbbVar, (byte) 15));
        zw3.C1 = i5;
    }

    public static void F0(rlb rlbVar, int i) {
        int i2;
        rlbVar.setAlign(i);
        int i3 = 2;
        if (i != 1) {
            if (i != 2) {
                i2 = 19;
            } else {
                i2 = 21;
            }
        } else {
            i2 = 17;
        }
        rlbVar.getEditText().setGravity(i2);
        if (i != 1) {
            boolean z = ob6.a0;
            if (i == 2 ? !z : z) {
                i3 = 3;
            }
        } else {
            i3 = 4;
        }
        rlbVar.getEditText().setTextAlignment(i3);
    }

    public static void Z(dx7 dx7Var, h44 h44Var) {
        dx7Var.setTextWeightRange(h44Var);
    }

    public ViewGroup getBarView() {
        if (this.I0 == 2) {
            return this.V0;
        }
        return this.U0;
    }

    private int getFrameRotation() {
        int i = this.P0;
        if (i != 90) {
            if (i != 180) {
                if (i != 270) {
                    return 0;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    private qma getPaintingSize() {
        qma qmaVar = this.r0;
        if (qmaVar != null) {
            return qmaVar;
        }
        qma qmaVar2 = new qma(1080.0f, 1920.0f);
        this.r0 = qmaVar2;
        return qmaVar2;
    }

    private void setCoverPause(boolean z) {
        int i = 0;
        while (true) {
            zw7 zw7Var = this.B0;
            if (i < zw7Var.getChildCount()) {
                View childAt = zw7Var.getChildAt(i);
                if (childAt instanceof v3b) {
                    ImageReceiver imageReceiver = ((v3b) childAt).z0;
                    b29 y = imageReceiver.y();
                    lm m = imageReceiver.m();
                    boolean z2 = !z;
                    imageReceiver.v0 = z2;
                    imageReceiver.u0 = z2;
                    if (y != null) {
                        if (z) {
                            y.stop();
                        } else {
                            y.start();
                        }
                    } else if (m != null) {
                        m.E = z;
                        if (z) {
                            m.x(false);
                            m.stop();
                        } else {
                            m.start();
                        }
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setNewColor(int i) {
        igb igbVar = this.k1;
        int i2 = igbVar.a;
        igbVar.a = i;
        D0(igbVar, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new cn(this, i2, i, (byte) 3));
        duration.start();
    }

    private void setTextType(int i) {
        this.v0 = i;
        h44 h44Var = this.t0;
        if (h44Var instanceof rlb) {
            ((rlb) h44Var).setType(i);
        }
        a78 e = a78.e(this.p1);
        e.h = i;
        e.a.edit().putInt("text_type", i).apply();
        this.V0.e(i, true);
    }

    public void setTextWeightRange(h44 h44Var) {
        boolean z = h44Var instanceof kc1;
        gx7 gx7Var = this.N0;
        if (z) {
            gx7Var.b(0.3f, 1.1f);
        } else {
            gx7Var.b(0.5f, 2.0f);
        }
    }

    private void setupTabsLayout(Context context) {
        g7 g7Var = new g7(this, context);
        this.G0 = g7Var;
        g7Var.setClipToPadding(false);
        this.G0.setOrientation(0);
        this.D0.addView(this.G0, tre.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.R0 = textView;
        textView.setText(ob6.M0(2131747004, null).toUpperCase());
        TextView textView2 = this.R0;
        int i = aob.i6;
        uk5 uk5Var = this.q1;
        yob.R(textView2, aob.f0(aob.v0(i, uk5Var), 7, -1), null, yob.M(i), uk5Var);
        this.R0.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        this.R0.setTextColor(-1);
        this.R0.setTextSize(1, 14.0f);
        this.R0.setGravity(1);
        this.R0.setTypeface(hl.o());
        this.R0.setSingleLine();
        this.R0.setOnClickListener(new View.OnClickListener(this) {
            public final dx7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                dx7 dx7Var = this.b;
                switch (b) {
                    case 0:
                        dx7Var.z0();
                        return;
                    case 1:
                        dx7Var.Q0(2);
                        if (!(dx7Var.t0 instanceof rlb)) {
                            dx7Var.Z1 = true;
                            dx7Var.l0(true);
                            return;
                        }
                        return;
                    default:
                        if (dx7Var.u0) {
                            dx7Var.C0(null, true);
                            return;
                        } else {
                            dx7Var.Q0(0);
                            return;
                        }
                }
            }
        });
        this.G0.addView(this.R0, tre.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.S0 = textView3;
        textView3.setText(ob6.M0(2131747003, null).toUpperCase());
        yob.R(this.S0, aob.f0(aob.v0(i, uk5Var), 7, -1), null, yob.M(i), uk5Var);
        this.S0.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        this.S0.setOnClickListener(new View.OnClickListener(this) {
            public final dx7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                dx7 dx7Var = this.b;
                switch (b) {
                    case 0:
                        dx7Var.z0();
                        return;
                    case 1:
                        dx7Var.Q0(2);
                        if (!(dx7Var.t0 instanceof rlb)) {
                            dx7Var.Z1 = true;
                            dx7Var.l0(true);
                            return;
                        }
                        return;
                    default:
                        if (dx7Var.u0) {
                            dx7Var.C0(null, true);
                            return;
                        } else {
                            dx7Var.Q0(0);
                            return;
                        }
                }
            }
        });
        this.S0.setTextColor(-1);
        this.S0.setTextSize(1, 14.0f);
        this.S0.setGravity(1);
        this.S0.setTypeface(hl.o());
        this.S0.setAlpha(0.6f);
        this.S0.setSingleLine();
        this.G0.addView(this.S0, tre.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.T0 = textView4;
        textView4.setText(ob6.M0(2131747002, null).toUpperCase());
        yob.R(this.T0, aob.f0(aob.v0(i, uk5Var), 7, -1), null, yob.M(i), uk5Var);
        this.T0.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        this.T0.setTextColor(-1);
        this.T0.setTextSize(1, 14.0f);
        this.T0.setGravity(1);
        this.T0.setTypeface(hl.o());
        this.T0.setAlpha(0.6f);
        this.T0.setSingleLine();
        this.T0.setOnClickListener(new View.OnClickListener(this) {
            public final dx7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                dx7 dx7Var = this.b;
                switch (b) {
                    case 0:
                        dx7Var.z0();
                        return;
                    case 1:
                        dx7Var.Q0(2);
                        if (!(dx7Var.t0 instanceof rlb)) {
                            dx7Var.Z1 = true;
                            dx7Var.l0(true);
                            return;
                        }
                        return;
                    default:
                        if (dx7Var.u0) {
                            dx7Var.C0(null, true);
                            return;
                        } else {
                            dx7Var.Q0(0);
                            return;
                        }
                }
            }
        });
        this.G0.addView(this.T0, tre.l(1.0f, 0, -2));
    }

    public static boolean u0(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void A(h44 h44Var) {
        N0(false);
        L0(h44Var);
    }

    public final void A0(h44 h44Var) {
        this.n0.b(h44Var.getUUID(), new hw7(this, h44Var, (byte) 0));
    }

    public final void B0(h44 h44Var) {
        h44 h44Var2 = this.t0;
        if (h44Var == h44Var2 && h44Var2 != null) {
            h44Var2.l(h44Var2.o0, false);
            C0(null, true);
            if (h44Var instanceof rlb) {
                ValueAnimator valueAnimator = this.L0;
                if (valueAnimator != null && this.J0 != 0) {
                    valueAnimator.cancel();
                }
                Q0(0);
            }
        }
        this.B0.removeView(h44Var);
        c0();
        if (h44Var != null) {
            UUID uuid = h44Var.getUUID();
            a9c a9cVar = this.n0;
            a9cVar.b.remove(uuid);
            a9cVar.c.remove(uuid);
            hl.c3(new azb(a9cVar, (byte) 7));
        }
        gx7 gx7Var = this.N0;
        xh4 xh4Var = this.O0;
        gx7Var.setValueOverride(xh4Var);
        gx7Var.setShowPreview(true);
        float f = xh4Var.get();
        igb igbVar = this.k1;
        igbVar.c = f;
        D0(igbVar, null, false);
        if (!this.b2 && (h44Var instanceof pp9)) {
            rbb rbbVar = ((vab) this).o2;
            gbb gbbVar = rbbVar.Y0;
            if (gbbVar != null) {
                gbbVar.s(null, null, true);
            }
            vab vabVar = rbbVar.w1;
            if (vabVar != null) {
                vabVar.n0();
            }
            hbb hbbVar = rbbVar.d1;
            if (hbbVar != null) {
                hbbVar.setHasRoundVideo(false);
            }
            c8b c8bVar = rbbVar.L1;
            if (c8bVar != null) {
                File file = c8bVar.o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    c8bVar = rbbVar.L1;
                    c8bVar.o0 = null;
                }
                if (c8bVar.p0 != null) {
                    try {
                        new File(rbbVar.L1.p0).delete();
                    } catch (Exception unused2) {
                    }
                    rbbVar.L1.p0 = null;
                }
            }
        }
    }

    public final boolean C0(h44 h44Var, boolean z) {
        boolean z2;
        ksb ksbVar;
        ksb ksbVar2;
        i49 i49Var;
        int i;
        int i2;
        boolean z3 = h44Var instanceof rlb;
        int i3 = 0;
        if (z3 && ((i2 = this.J0) != -1 ? i2 != 2 : this.I0 != 2)) {
            ValueAnimator valueAnimator = this.L0;
            if (valueAnimator != null && i2 != 2) {
                valueAnimator.cancel();
            }
            if (this.l1) {
                H0(false);
            }
            Q0(2);
        }
        boolean z4 = true;
        if (z3 && z) {
            rlb rlbVar = (rlb) h44Var;
            int gravity = rlbVar.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i = 0;
                } else {
                    i = 2;
                }
            } else {
                i = 1;
            }
            nv7 nv7Var = this.V0;
            nv7Var.setAlignment(i);
            xv7 typeface = rlbVar.getTypeface();
            if (typeface != null) {
                nv7Var.setTypeface(typeface.a);
            }
            nv7Var.e(rlbVar.getType(), true);
            this.E0.invalidate();
        }
        h44 h44Var2 = this.t0;
        if (h44Var2 != null) {
            if (h44Var2 == h44Var) {
                if (!h44Var.f0) {
                    if (h44Var instanceof sd6) {
                        sd6 sd6Var = (sd6) h44Var;
                        sd6Var.setType((sd6Var.getType() + 1) % sd6Var.getTypesCount());
                        return true;
                    } else if (h44Var instanceof xwc) {
                        xwc xwcVar = (xwc) h44Var;
                        xwcVar.setType((xwcVar.getType() + 1) % xwcVar.getTypesCount());
                        return true;
                    } else if (h44Var instanceof s66) {
                        s66 s66Var = (s66) h44Var;
                        h66 h66Var = s66Var.s0;
                        if (h66Var.e()) {
                            if (h66Var.getPreviewType() == 0) {
                                i3 = 1;
                            }
                            h66Var.setPreviewType(i3);
                            return true;
                        }
                        s66Var.setType(s66Var.getNextType());
                        return true;
                    } else if (!this.u0) {
                        if (h44Var instanceof rlb) {
                            this.w0 = true;
                            o0();
                            return true;
                        } else if (h44Var instanceof s39) {
                            s39 s39Var = (s39) h44Var;
                            if (this.M1 && this.K1 == h44Var) {
                                s39Var.q(true);
                                return true;
                            }
                            s39 s39Var2 = this.K1;
                            if (s39Var2 != null && s39Var2 != s39Var && (i49Var = this.J1) != null) {
                                i49Var.animate().alpha(0.0f).setListener(new rw7(i49Var, (byte) 0));
                                this.J1 = null;
                                this.M1 = false;
                                this.L1 = 0.0f;
                            }
                            if (this.J1 == null) {
                                i49 i49Var2 = new i49(2, this.p1, new pu0(new x53(), (byte) 2), getContext(), LaunchActivity.Q());
                                this.J1 = i49Var2;
                                xl0 xl0Var = new xl0(this.O1, i49Var2, 0, false);
                                this.J1.setPadding(0, hl.L(22.0f), 0, hl.L(22.0f));
                                this.w1.addView(this.J1, tre.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                                Paint paint = new Paint(1);
                                paint.setColor(vm2.o(-16777216, 120));
                                this.J1.setDelegate(new am2(this, xl0Var, paint));
                                this.J1.m(null, null, true);
                            }
                            this.J1.setFragment(LaunchActivity.Q());
                            this.K1 = s39Var;
                            N0(true);
                            return true;
                        } else {
                            L0(h44Var2);
                            return true;
                        }
                    } else if (h44Var2 instanceof rlb) {
                        hl.E3(((rlb) h44Var2).getFocusedView());
                        s0(false);
                    }
                }
                return true;
            }
            h44Var2.l(h44Var2.o0, false);
            h44 h44Var3 = this.t0;
            if (h44Var3 instanceof rlb) {
                ((rlb) h44Var3).r();
                if (!z3) {
                    this.u0 = false;
                    hl.t1(((rlb) this.t0).getFocusedView());
                    s0(false);
                }
            } else if ((h44Var3 instanceof pp9) && (ksbVar2 = ((vab) this).o2.a1) != null) {
                ksbVar2.l(false);
            }
            z2 = true;
        } else {
            z2 = false;
        }
        h44 h44Var4 = this.t0;
        this.t0 = h44Var;
        if ((h44Var4 instanceof rlb) && TextUtils.isEmpty(((rlb) h44Var4).getText()) && !(h44Var4 instanceof kc1)) {
            B0(h44Var4);
        }
        h44 h44Var5 = this.t0;
        if (h44Var4 != h44Var5 && (h44Var5 instanceof pp9) && (ksbVar = ((vab) this).o2.a1) != null) {
            ksbVar.l(true);
        }
        h44 h44Var6 = this.t0;
        xh4 xh4Var = this.O0;
        igb igbVar = this.k1;
        gx7 gx7Var = this.N0;
        if (h44Var6 != null) {
            ow7 ow7Var = this.A0;
            h44Var6.o0 = ow7Var;
            h44Var6.l(ow7Var, true);
            h44 h44Var7 = this.t0;
            if (h44Var7 instanceof rlb) {
                rlb rlbVar2 = (rlb) h44Var7;
                rlbVar2.getSwatch().c = igbVar.c;
                rlbVar2.B0 = false;
                E0(rlbVar2.getSwatch());
                setTextWeightRange(rlbVar2);
                gx7Var.setValueOverride(new ky5(rlbVar2, (int) (this.r0.a / 9.0f), (byte) 1));
                gx7Var.setShowPreview(false);
            } else {
                gx7Var.setValueOverride(xh4Var);
                gx7Var.setShowPreview(true);
                igbVar.c = xh4Var.get();
                D0(igbVar, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.L0;
            if (valueAnimator2 != null && this.J0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.l1) {
                H0(false);
            }
            Q0(0);
            gx7Var.setValueOverride(xh4Var);
            gx7Var.setShowPreview(true);
            igbVar.c = xh4Var.get();
            D0(igbVar, null, false);
            z4 = z2;
        }
        T0();
        return z4;
    }

    @Override
    public final void D() {
        O0(true);
    }

    public final void D0(igb igbVar, Integer num, boolean z) {
        igb igbVar2 = this.k1;
        if (igbVar2 != igbVar) {
            igbVar2.a = igbVar.a;
            igbVar2.b = igbVar.b;
            igbVar2.c = igbVar.c;
            int i = this.p1;
            a78.e(i).h(igbVar.a, true);
            a78.e(i).j(igbVar.c);
        }
        int i2 = igbVar.a;
        yw7 yw7Var = this.y0;
        yw7Var.setColor(i2);
        yw7Var.setBrushSize(igbVar.c);
        int i3 = igbVar2.a;
        if (num != null && num.intValue() != i3) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new e34(this, num, i3, (byte) 2));
            duration.start();
        } else {
            ax7 ax7Var = this.D0;
            if (ax7Var != null) {
                ax7Var.invalidate();
            }
        }
        h44 h44Var = this.t0;
        if (h44Var instanceof rlb) {
            if (!this.T1) {
                ((rlb) h44Var).setSwatch(new igb(igbVar.b, igbVar.c, igbVar.a));
            }
        } else if (z) {
            if (h44Var instanceof sd6) {
                ((sd6) h44Var).setColor(igbVar.a);
                ((sd6) this.t0).setType(3);
            } else if (h44Var instanceof xwc) {
                ((xwc) h44Var).setColor(igbVar.a);
                ((xwc) this.t0).setType(3);
            } else if (h44Var instanceof s66) {
                ((s66) h44Var).setColor(igbVar.a);
                ((s66) this.t0).setType(0);
            }
        }
    }

    public final void E0(igb igbVar) {
        D0(igbVar, null, false);
    }

    public final void G0() {
        int i;
        mec mecVar;
        float f;
        h44 h44Var;
        h44 h44Var2;
        mv3[] mv3VarArr;
        h44 h44Var3;
        ArrayList arrayList = this.A1;
        if (arrayList != null) {
            c8b c8bVar = this.z1;
            this.z1 = null;
            this.A1 = null;
            int size = arrayList.size();
            boolean z = false;
            kc1 kc1Var = null;
            int i2 = 0;
            while (true) {
                ?? r15 = this.B0;
                if (i2 < size) {
                    mec mecVar2 = (mec) arrayList.get(i2);
                    byte b = mecVar2.a;
                    if (b == 11) {
                        if (kc1Var != null) {
                            kc1Var.u(mecVar2.V, mecVar2.W, mecVar2.j, mecVar2.X);
                            i = i2;
                            i2 = i + 1;
                            z = false;
                        } else {
                            kc1 e0 = e0();
                            e0.setType(mecVar2.b);
                            e0.setTypeface(mecVar2.n);
                            e0.setBaseFontSize(mecVar2.m);
                            F0(e0, mecVar2.p);
                            igb swatch = e0.getSwatch();
                            swatch.a = mecVar2.l;
                            e0.setSwatch(swatch);
                            e0.u(mecVar2.V, mecVar2.W, mecVar2.j, mecVar2.X);
                            f = 1.0f;
                            i = i2;
                            kc1Var = e0;
                            h44Var3 = e0;
                            mecVar = mecVar2;
                            h44Var = h44Var3;
                        }
                    } else if (b == 0) {
                        ww7 k0 = k0(mecVar2.C, mecVar2.B);
                        if ((mecVar2.b & 2) != 0) {
                            k0.r(z);
                        }
                        ViewGroup.LayoutParams layoutParams = k0.getLayoutParams();
                        layoutParams.width = mecVar2.q;
                        layoutParams.height = mecVar2.r;
                        f = 1.0f;
                        i = i2;
                        h44Var3 = k0;
                        mecVar = mecVar2;
                        h44Var = h44Var3;
                    } else {
                        if (b == 1) {
                            rlb l0 = l0(z);
                            l0.setType(mecVar2.b);
                            l0.setTypeface(mecVar2.n);
                            l0.setBaseFontSize(mecVar2.m);
                            SpannableString spannableString = new SpannableString(mecVar2.j);
                            ArrayList arrayList2 = mecVar2.k;
                            int size2 = arrayList2.size();
                            ArrayList arrayList3 = arrayList2;
                            for (int i3 = z; i3 < size2; i3++) {
                                lec lecVar = (lec) arrayList3.get(i3);
                                ArrayList arrayList4 = arrayList3;
                                hm hmVar = new hm(lecVar.document_id, 1.0f, l0.getFontMetricsInt());
                                int i4 = lecVar.offset;
                                spannableString.setSpan(hmVar, i4, lecVar.length + i4, 33);
                                i2 = i2;
                                arrayList3 = arrayList4;
                            }
                            i = i2;
                            CharSequence m = pv3.m(spannableString, l0.getFontMetricsInt(), false, null, 0);
                            if ((m instanceof Spanned) && (mv3VarArr = (mv3[]) ((Spanned) m).getSpans(0, m.length(), mv3.class)) != null) {
                                for (mv3 mv3Var : mv3VarArr) {
                                    mv3Var.b = 0.85f;
                                }
                            }
                            l0.setText(m);
                            F0(l0, mecVar2.p);
                            igb swatch2 = l0.getSwatch();
                            swatch2.a = mecVar2.l;
                            l0.setSwatch(swatch2);
                            h44Var2 = l0;
                        } else {
                            i = i2;
                            if (b == 2) {
                                v98 h0 = h0(mecVar2.j, false);
                                h0.I0 = mecVar2.u;
                                h0.D0 = false;
                                if ((mecVar2.b & 2) != 0) {
                                    h0.r(false);
                                }
                                if ((mecVar2.b & 16) != 0) {
                                    h0.t(false);
                                }
                                ViewGroup.LayoutParams layoutParams2 = h0.getLayoutParams();
                                layoutParams2.width = mecVar2.q;
                                layoutParams2.height = mecVar2.r;
                                h44Var2 = h0;
                            } else if (b == 6) {
                                ArrayList arrayList5 = c8bVar.v;
                                boolean z2 = c8bVar.K;
                                this.Z1 = true;
                                f = 1.0f;
                                mecVar = mecVar2;
                                h44 vw7Var = new vw7(this, getContext(), b0(), arrayList5, this.O1, z2, this.P1);
                                vw7Var.setDelegate(this);
                                r15.addView(vw7Var);
                                c0();
                                if (mecVar.q > 0 && mecVar.r > 0) {
                                    ViewGroup.LayoutParams layoutParams3 = vw7Var.getLayoutParams();
                                    layoutParams3.width = mecVar.q;
                                    layoutParams3.height = mecVar.r;
                                }
                                h44Var = vw7Var;
                            } else {
                                mecVar = mecVar2;
                                f = 1.0f;
                                if (b == 3) {
                                    sd6 g0 = g0(mecVar.O, mecVar.N);
                                    int i5 = mecVar.l;
                                    if (i5 != 0) {
                                        g0.setColor(i5);
                                    }
                                    g0.setType(mecVar.b);
                                    h44Var = g0;
                                } else {
                                    if (b == 8) {
                                        vwc vwcVar = mecVar.P;
                                        if (vwcVar != null) {
                                            xwc m0 = m0(vwcVar);
                                            int i6 = mecVar.l;
                                            if (i6 != 0) {
                                                m0.setColor(i6);
                                            }
                                            m0.setType(mecVar.b);
                                            h44Var = m0;
                                        }
                                    } else if (b == 7) {
                                        s66 f0 = f0(mecVar.a0);
                                        h66 h66Var = f0.s0;
                                        int i7 = mecVar.l;
                                        if (i7 != 0) {
                                            f0.setColor(i7);
                                        }
                                        boolean e = h66Var.e();
                                        int i8 = h66Var.h;
                                        int i9 = h66Var.f;
                                        if (e) {
                                            h66Var.setPreviewType(mecVar.b);
                                        }
                                        byte b2 = mecVar.b;
                                        if (b2 == -1) {
                                            f0.setType(3);
                                            h66Var.d();
                                            mecVar.q = ((int) Math.ceil(h66Var.b0)) + i9 + i9;
                                            mecVar.r = ((int) Math.ceil(h66Var.c0)) + i8 + i8;
                                            PointF position = f0.getPosition();
                                            position.y = (this.C1 * 0.3f) + position.y;
                                            f0.setPosition(position);
                                        } else {
                                            f0.setType(b2);
                                            h44Var = f0;
                                        }
                                    } else if (b == 4) {
                                        s39 i0 = i0(false);
                                        i0.s(w49.d(mecVar.N.reaction), false);
                                        if (mecVar.N.flipped) {
                                            i0.r(false);
                                        }
                                        h44Var = i0;
                                        if (mecVar.N.dark) {
                                            i0.q(false);
                                            h44Var = i0;
                                        }
                                    } else if (b == 5 && c8bVar.o0 != null) {
                                        pp9 j0 = j0(c8bVar.p0, false);
                                        rbb rbbVar = ((vab) this).o2;
                                        gbb gbbVar = rbbVar.Y0;
                                        if (gbbVar != null) {
                                            gbbVar.x = j0;
                                            kfc kfcVar = gbbVar.y;
                                            if (kfcVar != null) {
                                                kfcVar.z0(j0.w0);
                                            }
                                        }
                                        hbb hbbVar = rbbVar.d1;
                                        if (hbbVar != null) {
                                            hbbVar.setHasRoundVideo(true);
                                        }
                                        h44Var = j0;
                                        if ((mecVar.b & 2) != 0) {
                                            boolean z3 = !j0.t0;
                                            j0.t0 = z3;
                                            j0.u0.f(z3, true);
                                            j0.invalidate();
                                            h44Var = j0;
                                        }
                                    }
                                    i2 = i + 1;
                                    z = false;
                                }
                            }
                        }
                        mecVar = mecVar2;
                        f = 1.0f;
                        h44Var = h44Var2;
                    }
                    h44Var.setX((mecVar.c * this.B1) - (((f - mecVar.v) * mecVar.q) / 2.0f));
                    h44Var.setY((mecVar.d * this.C1) - (((f - mecVar.v) * mecVar.r) / 2.0f));
                    h44Var.setPosition(new PointF((mecVar.q / 2.0f) + h44Var.getX(), (mecVar.r / 2.0f) + h44Var.getY()));
                    h44Var.setScale(mecVar.v);
                    h44Var.setRotation((float) (((-mecVar.e) / 3.141592653589793d) * 180.0d));
                    i2 = i + 1;
                    z = false;
                } else {
                    r15.setVisibility(z ? 1 : 0);
                    return;
                }
            }
        }
    }

    public final void H0(final boolean z) {
        float f;
        boolean z2;
        if (this.l1 != z) {
            this.l1 = z;
            vpa vpaVar = this.m1;
            if (vpaVar != null) {
                vpaVar.d();
            }
            float f2 = 1000.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = 1000.0f;
            }
            vpa vpaVar2 = new vpa(new xk4(f));
            this.m1 = vpaVar2;
            wpa wpaVar = new wpa();
            if (!z) {
                f2 = 0.0f;
            }
            wpaVar.i = f2;
            wpaVar.b(1250.0f);
            wpaVar.a(1.0f);
            vpaVar2.m = wpaVar;
            if (!this.y1.c() && this.h2 <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            final boolean[] zArr = {z2};
            final float translationY = this.D0.getTranslationY();
            final float alpha = this.l0.getAlpha();
            final ViewGroup barView = getBarView();
            this.m1.b(new qs3() {
                @Override
                public final void a(vpa vpaVar3, float f3, float f4) {
                    float f5;
                    int i;
                    dx7 dx7Var = dx7.this;
                    ax7 ax7Var = dx7Var.D0;
                    float f6 = f3 / 1000.0f;
                    dx7Var.n1 = f6;
                    float f7 = 1.0f;
                    float f8 = ((1.0f - f6) * 0.4f) + 0.6f;
                    ViewGroup viewGroup = barView;
                    viewGroup.setScaleX(f8);
                    viewGroup.setScaleY(f8);
                    viewGroup.setTranslationY((Math.min(dx7Var.n1, 0.25f) * hl.L(16.0f)) / 0.25f);
                    viewGroup.setAlpha(1.0f - (Math.min(dx7Var.n1, 0.25f) / 0.25f));
                    pw7 pw7Var = dx7Var.g1;
                    float f9 = dx7Var.n1;
                    boolean z3 = z;
                    pw7Var.C1(z3, f9);
                    iv7 iv7Var = dx7Var.l0;
                    iv7Var.setProgress(dx7Var.n1);
                    dv7 dv7Var = dx7Var.k0;
                    dv7Var.setProgress(dx7Var.n1);
                    dx7Var.G0.setTranslationY(hl.L(32.0f) * dx7Var.n1);
                    AnimatorSet animatorSet = dx7Var.x1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f10 = dx7Var.n1;
                        if (z3) {
                            f5 = 1.0f;
                        } else {
                            f10 = 1.0f - f10;
                            f5 = 0.0f;
                        }
                        float f11 = alpha;
                        iv7Var.setAlpha(hl.R1(f11, f5, f10));
                        if (!z3) {
                            f7 = 0.0f;
                        }
                        dv7Var.setAlpha(hl.R1(f11, f7, f10));
                        float L = hl.L(39.0f) * f10;
                        if (z3) {
                            i = 1;
                        } else {
                            i = -1;
                        }
                        ax7Var.setTranslationY(translationY - (L * i));
                    }
                    ax7Var.invalidate();
                    if (viewGroup == dx7Var.V0) {
                        dx7Var.E0.invalidate();
                    }
                }
            });
            this.m1.a(new dw7(this, z, (byte) 0));
            this.m1.h();
            if (z) {
                pw7 pw7Var = this.g1;
                pw7Var.setVisibility(0);
                pw7Var.setSelectedColorIndex(a78.e(this.p1).d());
            }
        }
    }

    public final void I0(int i) {
        boolean z;
        nv7 nv7Var = this.V0;
        qw7 qw7Var = this.y1;
        if (i == 1) {
            o24 o24Var = this.d2;
            if (o24Var != null && o24Var.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            o24 o24Var2 = this.d2;
            qbb qbbVar = this.w1;
            if (o24Var2 != null && o24Var2.d1 != yac.t0) {
                qbbVar.removeView(o24Var2);
                o24Var2 = null;
                this.d2 = null;
            }
            if (o24Var2 == null) {
                o24 o24Var3 = new o24(null, true, false, false, getContext(), false, null, null, true, this.q1, false, false);
                this.d2 = o24Var3;
                o24Var3.x2 = false;
                o24Var3.V0 = true;
                o24Var3.setVisibility(8);
                if (hl.O1()) {
                    this.d2.setForseMultiwindowLayout(true);
                }
                this.d2.setDelegate(new xw7(this));
                qbbVar.addView(this.d2);
            }
            this.d2.setVisibility(0);
            this.e2 = true;
            o24 o24Var4 = this.d2;
            if (this.j2 <= 0) {
                if (hl.O1()) {
                    this.j2 = hl.L(150.0f);
                } else {
                    this.j2 = uc7.d1().getInt("kbd_height", hl.L(200.0f));
                }
            }
            int i2 = this.k2;
            if (i2 <= 0) {
                if (hl.O1()) {
                    i2 = hl.L(150.0f);
                    this.k2 = i2;
                } else {
                    i2 = uc7.d1().getInt("kbd_height_land3", hl.L(200.0f));
                    this.k2 = i2;
                }
            }
            Point point = hl.q;
            if (point.x <= point.y) {
                i2 = this.j2;
            }
            int paddingUnderContainer = qbbVar.getPaddingUnderContainer() + i2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o24Var4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            o24Var4.setLayoutParams(layoutParams);
            if (!hl.E && !hl.O1()) {
                h44 h44Var = this.t0;
                if (h44Var instanceof rlb) {
                    hl.t1(((rlb) h44Var).getEditText());
                }
            }
            this.h2 = paddingUnderContainer;
            qw7Var.a();
            requestLayout();
            iz1 emojiButton = nv7Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(gz1.d, true);
            }
            if (!z) {
                if (this.f2) {
                    this.i2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h2, 0.0f);
                    ofFloat.addUpdateListener(new aw7(this, (byte) 1));
                    ofFloat.addListener(new sw7(this, (byte) 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(hb.w);
                    ofFloat.start();
                }
            }
        } else {
            iz1 emojiButton2 = nv7Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(gz1.e, true);
            }
            o24 o24Var5 = this.d2;
            if (o24Var5 != null) {
                this.e2 = false;
                if (hl.D || hl.E) {
                    o24Var5.setVisibility(8);
                }
            }
            if (i == 0) {
                this.h2 = 0;
                qw7Var.a();
            }
            requestLayout();
        }
        R0();
    }

    public final void J0(s66 s66Var) {
        r8b r8bVar = new r8b(getContext(), this.q1, this.Q1, new v35(this, s66Var, (byte) 17));
        if (s66Var != null) {
            g66 g66Var = s66Var.w0;
            r8bVar.X1 = true;
            zt3 zt3Var = r8bVar.U1;
            zt3 zt3Var2 = r8bVar.T1;
            if (g66Var != null) {
                r8bVar.b2 = g66Var.d;
                r8bVar.c2 = false;
                zt3Var2.setText(g66Var.c);
                zt3Var.setText(g66Var.b);
                r8bVar.h2 = !TextUtils.isEmpty(g66Var.b);
                r8bVar.i2 = g66Var.f;
                r8bVar.j2 = g66Var.e;
            } else {
                zt3Var2.setText("");
                zt3Var.setText("");
                r8bVar.i2 = true;
                r8bVar.j2 = false;
            }
            String M0 = ob6.M0(2131744295, null);
            c51 c51Var = r8bVar.W1;
            c51Var.i(M0, false, true);
            i74 i74Var = r8bVar.S1;
            if (i74Var != null) {
                i74Var.O(false);
            }
            c51Var.setEnabled(r8bVar.b1(zt3Var2.getText().toString()));
            r8bVar.X1 = false;
        }
        r8bVar.setOnDismissListener(new nw7(this, (byte) 1));
        r8bVar.show();
        y0(true);
    }

    public final void K0(sd6 sd6Var, icc iccVar) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        n12 n12Var = new n12(getContext(), new uw7(this, iccVar), false, true, false, this.q1);
        n12Var.W3 = new sjf((byte) 22);
        m02 m02Var = n12Var.u3;
        if (sd6Var != null && (messageMedia = sd6Var.w0) != null && (geoPoint = messageMedia.geo) != null) {
            n12Var.x4 = new double[]{geoPoint.lat, geoPoint._long};
            n12Var.I1 = true;
            m02Var.setVisibility(8);
        } else if (this.E1) {
            n12Var.v4 = this.G1;
            n12Var.w4 = this.F1;
            n12Var.I1 = true;
            m02Var.setVisibility(8);
        } else {
            n12Var.I1 = true;
            m02Var.setVisibility(8);
        }
        n12Var.setOnDismissListener(new nw7(this, (byte) 0));
        n12Var.a1();
        n12Var.show();
    }

    @Override
    public final void L(int i, boolean z) {
        boolean z2;
        boolean z3;
        int i2;
        if (i > hl.L(50.0f) && this.f2 && !hl.E && !hl.O1()) {
            if (z) {
                this.k2 = i;
                uc7.d1().edit().putInt("kbd_height_land3", this.k2).commit();
            } else {
                this.j2 = i;
                uc7.d1().edit().putInt("kbd_height", this.j2).commit();
            }
        }
        boolean z4 = this.e2;
        qw7 qw7Var = this.y1;
        if (z4) {
            if (z) {
                i2 = this.k2;
            } else {
                i2 = this.j2;
            }
            int paddingUnderContainer = this.w1.getPaddingUnderContainer() + i2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = hl.q.x;
            if (i3 != i4 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i4;
                layoutParams.height = paddingUnderContainer;
                this.d2.setLayoutParams(layoutParams);
                this.h2 = layoutParams.height;
                qw7Var.a();
                requestLayout();
            }
        }
        if (this.l2 == i && this.m2 == z) {
            return;
        }
        this.l2 = i;
        this.m2 = z;
        boolean z5 = this.f2;
        h44 h44Var = this.t0;
        if (h44Var instanceof rlb) {
            if (((rlb) h44Var).getEditText().isFocused() && qw7Var.c()) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f2 = z2;
        } else {
            this.f2 = false;
            z2 = false;
        }
        if (z2 && this.e2) {
            I0(0);
        }
        if (this.h2 != 0 && !(z3 = this.f2) && z3 != z5 && !this.e2) {
            this.h2 = 0;
            qw7Var.a();
            requestLayout();
        }
        T0();
        if (z5 && !this.f2 && this.h2 > 0 && this.i2) {
            this.i2 = false;
        }
        R0();
    }

    public final void L0(h44 h44Var) {
        if (h44Var instanceof b47) {
            n8 n8Var = this.r1;
            if (n8Var != null && n8Var.isShowing()) {
                this.r1.d(true);
                return;
            }
            return;
        }
        int[] iArr = this.c2;
        h44Var.getLocationInWindow(iArr);
        float scaleX = h44Var.getScaleX() * h44Var.getWidth();
        zw7 zw7Var = this.B0;
        float scaleX2 = zw7Var.getScaleX() * scaleX;
        float scaleY = h44Var.getScaleY();
        float scaleY2 = zw7Var.getScaleY() * scaleY * h44Var.getHeight();
        int i = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i;
        int i2 = (int) ((scaleY2 / 2.0f) + iArr[1]);
        iArr[1] = i2;
        M0(new hw7(this, h44Var, (byte) 1), this, 51, i, i2 - hl.L(32.0f), true);
    }

    public final void M0(Runnable runnable, dx7 dx7Var, int i, int i2, int i3, boolean z) {
        n8 n8Var = this.r1;
        if (n8Var != null && n8Var.isShowing()) {
            this.r1.d(true);
            return;
        }
        if (this.s1 == null) {
            this.t1 = new Rect();
            cx7 cx7Var = new cx7(this, getContext());
            this.s1 = cx7Var;
            cx7Var.setAnimationEnabled(true);
            this.s1.setOnTouchListener(new b7(this, (byte) 12));
            this.s1.setDispatchKeyEventListener(new jw7(this));
            this.s1.setShownFromBottom(true);
        }
        cx7 cx7Var2 = this.s1;
        cx7Var2.a0 = z;
        cx7Var2.d();
        runnable.run();
        if (this.r1 == null) {
            n8 n8Var2 = new n8(this.s1, -2, -2);
            this.r1 = n8Var2;
            n8Var2.b = true;
            n8Var2.setAnimationStyle(2131755191);
            this.r1.setOutsideTouchable(true);
            this.r1.setClippingEnabled(true);
            this.r1.setInputMethodMode(2);
            this.r1.setSoftInputMode(0);
            this.r1.getContentView().setFocusableInTouchMode(true);
            this.r1.setOnDismissListener(new y6(this, (byte) 6));
        }
        this.s1.measure(View.MeasureSpec.makeMeasureSpec(hl.L(10000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(10000.0f), Integer.MIN_VALUE));
        this.r1.setFocusable(true);
        int measuredWidth = i2 - (this.s1.getMeasuredWidth() / 2);
        int measuredHeight = i3 - this.s1.getMeasuredHeight();
        this.r1.showAtLocation(dx7Var, i, measuredWidth, measuredHeight);
        n8.i(this.s1);
        Drawable mutate = getContext().getResources().getDrawable(2131232582).mutate();
        cx7 cx7Var3 = this.s1;
        if (z) {
            cx7Var3.setBackgroundDrawable(new wl0(new xl0(this.O1, cx7Var3, 5, false), measuredWidth, measuredHeight, mutate, hl.N(8.3f)));
            return;
        }
        cx7Var3.setBackgroundDrawable(mutate);
        this.s1.setBackgroundColor(-14145495);
    }

    public final void N0(boolean z) {
        if (this.M1 != z) {
            if (z || this.J1 != null) {
                this.M1 = z;
                float f = 0.0f;
                if (z) {
                    this.J1.k();
                    this.J1.setVisibility(0);
                    this.J1.setSelectedReaction(this.K1.getCurrentReaction());
                    this.J1.getParent().bringChildToFront(this.J1);
                    this.N1 = true;
                    this.w1.invalidate();
                    float f2 = this.L1;
                    if (z) {
                        f = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                    this.J1.setTransitionProgress(this.L1);
                    ofFloat.addUpdateListener(new aw7(this, (byte) 2));
                    ofFloat.addListener(new gf4((byte) 17, this, z));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(k43.g);
                    ofFloat.start();
                    return;
                }
                this.K1 = null;
                if (this.J1.getReactionsWindow() != null) {
                    this.J1.getReactionsWindow().e();
                }
                this.J1.animate().alpha(0.0f).setDuration(150L).setListener(new sw7(this, (byte) 0)).start();
            }
        }
    }

    public final void O0(boolean z) {
        float f;
        if (this.e1 != z) {
            this.e1 = z;
            vpa vpaVar = this.f1;
            if (vpaVar != null) {
                vpaVar.d();
            }
            float f2 = 1000.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = 1000.0f;
            }
            vpa vpaVar2 = new vpa(new xk4(f));
            this.f1 = vpaVar2;
            wpa wpaVar = new wpa();
            if (!z) {
                f2 = 0.0f;
            }
            wpaVar.i = f2;
            wpaVar.b(1250.0f);
            wpaVar.a(1.0f);
            vpaVar2.m = wpaVar;
            if (z) {
                zv7 zv7Var = this.W0;
                zv7Var.setAlpha(0.0f);
                zv7Var.setVisibility(0);
            }
            this.f1.b(new i10(this, (byte) 9));
            this.f1.a(new dw7(this, z, (byte) 1));
            this.f1.h();
        }
    }

    public final PointF P0(h44 h44Var) {
        float f;
        float f2;
        float f3 = 200.0f;
        fo6 fo6Var = this.p0;
        if (fo6Var != null) {
            f3 = 200.0f / fo6Var.c;
        }
        float f4 = 0.2f;
        if (h44Var != null) {
            PointF position = h44Var.getPosition();
            float min = Math.min(h44Var.getHeight(), h44Var.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f5 = 100.0f;
        if (fo6Var != null) {
            f5 = 100.0f / fo6Var.c;
        }
        PointF b0 = b0();
        int i = 0;
        while (i < 10) {
            int i2 = 0;
            boolean z = false;
            while (true) {
                zw7 zw7Var = this.B0;
                if (i2 >= zw7Var.getChildCount()) {
                    break;
                }
                View childAt = zw7Var.getChildAt(i2);
                if ((childAt instanceof h44) && !(childAt instanceof b47)) {
                    PointF position2 = ((h44) childAt).getPosition();
                    f = f4;
                    f2 = f5;
                    if (((float) Math.sqrt(Math.pow(position2.y - b0.y, 2.0d) + Math.pow(position2.x - b0.x, 2.0d))) < f2) {
                        f3 = Math.min(childAt.getHeight(), childAt.getWidth()) * f;
                        z = true;
                    }
                } else {
                    f = f4;
                    f2 = f5;
                }
                i2++;
                f5 = f2;
                f4 = f;
            }
            float f6 = f4;
            float f7 = f5;
            if (!z) {
                break;
            }
            i++;
            b0 = new PointF(b0.x + f3, b0.y + f3);
            f4 = f6;
            f5 = f7;
        }
        return b0;
    }

    @Override
    public final int Q() {
        return this.y1.l - this.w1.getBottomPadding2();
    }

    public final void Q0(int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z;
        if (this.I0 != i && this.J0 != i) {
            ValueAnimator valueAnimator = this.L0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i2 = this.I0;
            ViewGroup viewGroup3 = this.V0;
            ViewGroup viewGroup4 = this.U0;
            if (i2 == 0) {
                viewGroup = viewGroup4;
            } else if (i2 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.J0 = i;
            if (i == 0) {
                viewGroup2 = viewGroup4;
            } else if (i == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i3 = this.p1;
            a78 e = a78.e(i3);
            boolean z2 = true;
            if (i == 2) {
                z = true;
            } else {
                z = false;
            }
            if (e.l != z) {
                e.l = z;
                if (z) {
                    e.i(-1, false);
                } else {
                    e.i(e.a.getInt("brush", 0), false);
                }
            }
            int c = a78.e(i3).c();
            igb igbVar = this.k1;
            igbVar.a = c;
            if (i == 2) {
                z2 = false;
            }
            this.T1 = z2;
            D0(igbVar, null, false);
            this.T1 = false;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.L0 = duration;
            duration.setInterpolator(k43.f);
            this.L0.addUpdateListener(new nk(this, viewGroup, viewGroup2, (byte) 3));
            this.L0.addListener(new eq1(this, viewGroup, viewGroup2, i, (byte) 4));
            this.L0.start();
        }
    }

    public final void R0() {
        boolean z;
        qw7 qw7Var = this.y1;
        nv7 nv7Var = this.V0;
        if (nv7Var != null) {
            if (qw7Var.c()) {
                nv7Var.a(2131231516);
            } else if (this.e2) {
                nv7Var.a(2131231508);
            } else {
                nv7Var.a(2131232047);
            }
        }
        if (!qw7Var.c() && !this.e2) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = !z;
        hl.O3(1.0f, this.Y0, z2, false);
        hl.O3(1.0f, this.X0, z2, false);
        hl.O3(1.0f, this.a1, z, false);
        hl.O3(1.0f, this.Z0, z, false);
    }

    public final void S0() {
        float f;
        h44 h44Var;
        ObjectAnimator objectAnimator = this.S1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.y0.getParent();
        if (view == null) {
            return;
        }
        qw7 qw7Var = this.y1;
        if (((qw7Var.c() && !qw7Var.d) || this.h2 > 0) && (h44Var = this.t0) != null) {
            f = view.getScaleY() * (-(h44Var.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f);
        this.S1 = ofFloat;
        ofFloat.setDuration(350L);
        this.S1.setInterpolator(k43.h);
        this.S1.start();
    }

    public final void T0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dx7.T0():void");
    }

    @Override
    public final void a() {
        H0(true);
    }

    public final void a0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new pl7(this, view, (byte) 12)).start();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G8));
        hashSet.add(Integer.valueOf(aob.h5));
        hashSet.add(Integer.valueOf(aob.j5));
        hashSet.add(Integer.valueOf(aob.r5));
        hashSet.add(Integer.valueOf(aob.zf));
        hashSet.add(Integer.valueOf(aob.Cf));
        hashSet.add(Integer.valueOf(aob.Ff));
        hashSet.add(Integer.valueOf(aob.Jf));
        hashSet.add(Integer.valueOf(aob.Ef));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.Di));
        hashSet.add(Integer.valueOf(aob.wi));
        hashSet.add(Integer.valueOf(aob.vi));
        hashSet.add(Integer.valueOf(aob.xi));
        hashSet.add(Integer.valueOf(aob.yi));
        hashSet.add(Integer.valueOf(aob.Bf));
        hashSet.add(Integer.valueOf(aob.Af));
        hashSet.add(Integer.valueOf(aob.a7));
    }

    @Override
    public final void b() {
        setTextType((this.v0 + 1) % 4);
    }

    public final PointF b0() {
        zw7 zw7Var = this.B0;
        int measuredWidth = zw7Var.getMeasuredWidth();
        int measuredHeight = zw7Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.B1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.C1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    @Override
    public final void c(int i) {
        h44 h44Var = this.t0;
        if (h44Var instanceof rlb) {
            F0((rlb) h44Var, i);
            a78 e = a78.e(this.p1);
            e.g = i;
            e.a.edit().putInt("text_alignment", i).apply();
        }
    }

    public final void c0() {
        hm[] hmVarArr;
        boolean z = this.G1;
        zw7 zw7Var = this.B0;
        boolean z2 = true;
        if (!z && !this.I1) {
            int i = 0;
            loop0: while (true) {
                if (i < zw7Var.getChildCount()) {
                    View childAt = zw7Var.getChildAt(i);
                    boolean z3 = childAt instanceof rlb;
                    int i2 = this.p1;
                    if (z3) {
                        CharSequence text = ((rlb) childAt).getText();
                        if (text instanceof Spanned) {
                            for (hm hmVar : (hm[]) ((Spanned) text).getSpans(0, text.length(), hm.class)) {
                                TLRPC.Document document = hmVar.document;
                                if (document == null) {
                                    document = wl.e(i2, hmVar.getDocumentId());
                                }
                                if (document != null) {
                                    wl.g(i2).e(document);
                                }
                                xb4.G(i2);
                                if (c8b.u(document, xb4.J(document, null, true, true).getAbsolutePath())) {
                                    break loop0;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                        i++;
                    } else if (childAt instanceof v3b) {
                        TLRPC.Document sticker = ((v3b) childAt).getSticker();
                        xb4.G(i2);
                        if (c8b.u(sticker, xb4.J(sticker, null, true, true).getAbsolutePath())) {
                            break;
                        }
                        i++;
                    } else if (childAt instanceof pp9) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
        }
        for (int i3 = 0; i3 < zw7Var.getChildCount(); i3++) {
            View childAt2 = zw7Var.getChildAt(i3);
            if (childAt2 instanceof h44) {
                ((h44) childAt2).setIsVideo(z2);
            }
        }
    }

    public final TextView d0(int i, String str) {
        TextView textView = new TextView(getContext());
        yob.X(textView, aob.E8, this.q1);
        textView.setGravity(16);
        textView.setLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(hl.o());
        textView.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(Integer.valueOf(i));
        textView.setText(str);
        return textView;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        fo6 fo6Var;
        int i = 0;
        if ((view == this.y0 || view == this.z0 || view == this.B0 || view == this.A0) && (fo6Var = this.p0) != null) {
            canvas.save();
            if (!this.x0) {
                i = hl.m;
            }
            int currentActionBarHeight = a.getCurrentActionBarHeight() + i;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = fo6Var.k;
            if (i2 == 90 || i2 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * fo6Var.e)) / fo6Var.c);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * fo6Var.f)) / fo6Var.c);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + 0.0f;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - hl.L(48.0f))) - scaleY) / 2.0f) + hl.L(8.0f) + i + 0.0f;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (i != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    public final kc1 e0() {
        qma paintingSize = getPaintingSize();
        PointF b0 = b0();
        b0.y *= 1.5f;
        kc1 kc1Var = new kc1(getContext(), b0, (int) ((paintingSize.a / 9.0f) * 0.5f), new igb(1.0f, this.k1.c, -1));
        float f = paintingSize.a / 9.0f;
        iw7 iw7Var = new iw7(this, (byte) 2);
        kc1Var.y0 = (int) (0.5f * f);
        kc1Var.z0 = (int) (f * 2.0f);
        kc1Var.A0 = iw7Var;
        kc1Var.B0 = true;
        kc1Var.setStickyX(2);
        kc1Var.setDelegate(this);
        kc1Var.setMaxWidth(this.B1 - hl.L(32.0f));
        kc1Var.setTypeface(a78.e(this.p1).j);
        kc1Var.setType(3);
        gc1 gc1Var = this.U1;
        if (gc1Var != null) {
            gc1Var.b(kc1Var);
        } else {
            final kj4 kj4Var = this.W1;
            Objects.requireNonNull(kj4Var);
            kc1Var.setPositionProvider(new bm6(kj4Var, (byte) 26));
            kc1Var.setOnEditing(new pcc() {
                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            kj4Var.i(((Boolean) obj).booleanValue());
                            return;
                        default:
                            kj4Var.M(((Long) obj).longValue());
                            return;
                    }
                }
            });
            kc1Var.setOnSeek(new pcc() {
                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            kj4Var.i(((Boolean) obj).booleanValue());
                            return;
                        default:
                            kj4Var.M(((Long) obj).longValue());
                            return;
                    }
                }
            });
        }
        this.B0.addView(kc1Var, tre.c(-2.0f, -2));
        F0(kc1Var, 1);
        c0();
        fo6 fo6Var = this.p0;
        if (fo6Var != null) {
            kc1Var.j(1.0f / fo6Var.c);
            kc1Var.f(-(fo6Var.k + fo6Var.d));
        }
        return kc1Var;
    }

    public final s66 f0(g66 g66Var) {
        int measuredWidth;
        int i;
        this.Z1 = true;
        getPaintingSize();
        PointF P0 = P0(null);
        zw7 zw7Var = this.B0;
        if (zw7Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.B1;
        } else {
            measuredWidth = zw7Var.getMeasuredWidth();
        }
        float f = measuredWidth;
        int L = ((int) f) - hl.L(58.0f);
        s66 s66Var = new s66(getContext(), P0, this.p1, g66Var, f / 360.0f, L);
        if (P0.x == zw7Var.getMeasuredWidth() / 2.0f) {
            s66Var.setStickyX(2);
        }
        if (P0.y == zw7Var.getMeasuredHeight() / 2.0f) {
            s66Var.setStickyY(2);
        }
        igb igbVar = this.k1;
        if (igbVar != null && (i = igbVar.a) != -47814) {
            s66Var.setColor(i);
        }
        s66Var.setDelegate(this);
        s66Var.setMaxWidth(L);
        zw7Var.addView(s66Var, tre.c(-2.0f, -2));
        c0();
        fo6 fo6Var = this.p0;
        if (fo6Var != null) {
            s66Var.j(1.0f / fo6Var.c);
            s66Var.f(-(fo6Var.k + fo6Var.d));
        }
        return s66Var;
    }

    public final sd6 g0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i;
        this.Z1 = true;
        getPaintingSize();
        PointF P0 = P0(null);
        zw7 zw7Var = this.B0;
        if (zw7Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.B1;
        } else {
            measuredWidth = zw7Var.getMeasuredWidth();
        }
        float f = measuredWidth;
        int L = ((int) f) - hl.L(58.0f);
        sd6 sd6Var = new sd6(getContext(), P0, this.p1, messageMedia, mediaArea, f / 240.0f, L);
        if (P0.x == zw7Var.getMeasuredWidth() / 2.0f) {
            sd6Var.setStickyX(2);
        }
        if (P0.y == zw7Var.getMeasuredHeight() / 2.0f) {
            sd6Var.setStickyY(2);
        }
        igb igbVar = this.k1;
        if (igbVar != null && (i = igbVar.a) != -47814) {
            sd6Var.setColor(i);
        }
        sd6Var.setDelegate(this);
        sd6Var.setMaxWidth(L);
        zw7Var.addView(sd6Var, tre.c(-2.0f, -2));
        c0();
        fo6 fo6Var = this.p0;
        if (fo6Var != null) {
            sd6Var.j(1.0f / fo6Var.c);
            sd6Var.f(-(fo6Var.k + fo6Var.d));
        }
        return sd6Var;
    }

    public int getAdditionalBottom() {
        return hl.L(24.0f);
    }

    public int getAdditionalTop() {
        return hl.L(48.0f);
    }

    public Bitmap getBlurBitmap() {
        return this.y0.c(true, false);
    }

    public View getBottomLayout() {
        return this.D0;
    }

    public View getCancelView() {
        return this.k0;
    }

    public float getCropRotation() {
        fo6 fo6Var = this.p0;
        if (fo6Var != null) {
            return fo6Var.d + fo6Var.k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.l0;
    }

    public View getEntitiesView() {
        return this.B0;
    }

    public long getLcm() {
        return this.Q0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        hm[] hmVarArr;
        zw7 zw7Var = this.B0;
        int childCount = zw7Var.getChildCount();
        ArrayList arrayList = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = zw7Var.getChildAt(i);
            if (childAt instanceof v3b) {
                TLRPC.Document sticker = ((v3b) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = sticker.id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof rlb) {
                CharSequence text = ((rlb) childAt).getText();
                if ((text instanceof Spanned) && (hmVarArr = (hm[]) ((Spanned) text).getSpans(0, text.length(), hm.class)) != null) {
                    for (hm hmVar : hmVarArr) {
                        if (hmVar != null) {
                            TLRPC.Document document = hmVar.document;
                            if (document == null) {
                                document = wl.e(this.p1, hmVar.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.id = document.id;
                                tL_inputDocument2.access_hash = document.access_hash;
                                byte[] bArr2 = document.file_reference;
                                tL_inputDocument2.file_reference = bArr2;
                                if (bArr2 == null) {
                                    tL_inputDocument2.file_reference = new byte[0];
                                }
                                arrayList.add(tL_inputDocument2);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public float getOffsetTranslationY() {
        return 0.0f;
    }

    public List<View> getPreviewViews() {
        return Arrays.asList(this.y0, this.z0, this.B0, this.A0);
    }

    public View getRenderInputView() {
        return this.z0;
    }

    public pa9 getRenderView() {
        return this.y0;
    }

    public h44 getSelectedEntity() {
        return this.t0;
    }

    public View getSelectionEntitiesView() {
        return this.A0;
    }

    public View getTextDimView() {
        return this.H0;
    }

    public View getTopLayout() {
        return this.C0;
    }

    public View getWeightChooserView() {
        return this.N0;
    }

    @Override
    public final boolean h(MotionEvent motionEvent) {
        if (this.a2) {
            return false;
        }
        if (this.t0 != null) {
            C0(null, true);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x, y);
        this.y0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final v98 h0(String str, boolean z) {
        float f;
        qma qmaVar;
        this.Z1 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f = options.outWidth / options.outHeight;
        } catch (Exception e) {
            cc4.g(e, true);
            f = 1.0f;
        }
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        zw7 zw7Var = this.B0;
        if (i > 0) {
            float floor = (float) Math.floor(Math.max(this.B1, zw7Var.getMeasuredWidth()) * 0.5d);
            qmaVar = new qma(floor, floor / f);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.C1, zw7Var.getMeasuredHeight()) * 0.5d);
            qmaVar = new qma(f * floor2, floor2);
        }
        qma qmaVar2 = qmaVar;
        Pair N0 = hl.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f2 = qmaVar2.a;
            qmaVar2.a = qmaVar2.b;
            qmaVar2.b = f2;
        }
        Context context = getContext();
        PointF b0 = b0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        v98 v98Var = new v98(context, b0, qmaVar2, str, intValue);
        v98Var.setDelegate(this);
        zw7Var.addView(v98Var);
        c0();
        return v98Var;
    }

    @Override
    public final boolean i(h44 h44Var) {
        return C0(h44Var, true);
    }

    public final s39 i0(boolean z) {
        String str;
        qma qmaVar = new qma(hl.L(106.0f), hl.L(106.0f));
        PointF b0 = b0();
        zw7 zw7Var = this.B0;
        if (zw7Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i = 0; i < zw7Var.getChildCount(); i++) {
                    View childAt = zw7Var.getChildAt(i);
                    if (dte.a(b0.x, b0.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < hl.L(6.0f)) {
                        break;
                    }
                }
                b0.x = (zw7Var.getMeasuredWidth() * 0.05f) + b0.x;
                b0.y = (zw7Var.getMeasuredHeight() * 0.05f) + b0.y;
                b0.x = Utilities.i(b0.x, zw7Var.getMeasuredWidth(), 0.0f);
                b0.y = Utilities.i(b0.y, zw7Var.getMeasuredHeight(), 0.0f);
            }
        }
        ?? h44Var = new h44(getContext(), b0);
        h44Var.t0 = new z9b(h44Var);
        h44Var.u0 = new z9b(h44Var);
        h44Var.v0 = new p39(h44Var);
        h44Var.w0 = new p39(h44Var);
        mm mmVar = new mm((View) h44Var);
        h44Var.y0 = mmVar;
        mm mmVar2 = new mm((View) h44Var);
        h44Var.z0 = mmVar2;
        h44Var.B0 = 1.0f;
        h44Var.s0 = qmaVar;
        mmVar2.e(true, 1.0f);
        mmVar.e(true, 1.0f);
        ArrayList arrayList = ls6.d0(yac.t0).h;
        p39 p39Var = h44Var.v0;
        int i2 = 0;
        while (true) {
            if (i2 < arrayList.size()) {
                if (((TLRPC.TL_availableReaction) arrayList.get(i2)).title.equals("Red Heart")) {
                    str = ((TLRPC.TL_availableReaction) arrayList.get(i2)).reaction;
                    break;
                }
                i2++;
            } else {
                str = ((TLRPC.TL_availableReaction) arrayList.get(0)).reaction;
                break;
            }
        }
        w49 b = w49.b(str);
        h44Var.x0 = b;
        p39Var.e(b);
        h44Var.k();
        h44Var.setDelegate(this);
        zw7Var.addView(h44Var);
        c0();
        if (z) {
            A0(h44Var);
            C0(h44Var, true);
        }
        return h44Var;
    }

    public final pp9 j0(String str, boolean z) {
        float f;
        this.Z1 = true;
        this.b2 = true;
        n0();
        zw7 zw7Var = this.B0;
        int measuredWidth = zw7Var.getMeasuredWidth();
        zw7Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.B1;
        }
        float floor = (float) Math.floor(0.43f * f);
        qma qmaVar = new qma(floor, floor);
        pp9 pp9Var = new pp9(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - hl.L(16.0f), (qmaVar.b / 2.0f) + hl.L(72.0f)), qmaVar, str);
        pp9Var.setDelegate(this);
        zw7Var.addView(pp9Var);
        c0();
        if (z) {
            A0(pp9Var);
            post(new kw7(this, pp9Var, (byte) 0));
        }
        this.b2 = false;
        return pp9Var;
    }

    public final ww7 k0(Object obj, TLRPC.Document document) {
        float f;
        for (int i = 0; i < document.attributes.size() && !(document.attributes.get(i) instanceof TLRPC.TL_documentAttributeSticker); i++) {
        }
        float f2 = 0.75f;
        fo6 fo6Var = this.p0;
        if (fo6Var != null) {
            f = -(fo6Var.k + fo6Var.d);
            f2 = 0.75f / fo6Var.c;
        } else {
            f = 0.0f;
        }
        vy5 vy5Var = new vy5(b0(), f2, f);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().a * 0.5d);
        ?? v3bVar = new v3b(context, vy5Var.a, vy5Var.c, vy5Var.b, new qma(floor, floor), document, obj);
        boolean B4 = r47.B4(document);
        ImageReceiver imageReceiver = v3bVar.z0;
        if (B4) {
            imageReceiver.p1 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        imageReceiver.m0(12);
        v3bVar.setDelegate(this);
        this.B0.addView(v3bVar);
        c0();
        return v3bVar;
    }

    public final rlb l0(boolean z) {
        qma paintingSize = getPaintingSize();
        PointF P0 = P0(null);
        rlb rlbVar = new rlb(getContext(), P0, (int) (paintingSize.a / 9.0f), "", this.k1, this.v0);
        float f = paintingSize.a / 9.0f;
        iw7 iw7Var = new iw7(this, (byte) 0);
        rlbVar.y0 = (int) (0.5f * f);
        rlbVar.z0 = (int) (f * 2.0f);
        rlbVar.A0 = iw7Var;
        float f2 = P0.x;
        zw7 zw7Var = this.B0;
        if (f2 == zw7Var.getMeasuredWidth() / 2.0f) {
            rlbVar.setStickyX(2);
        }
        if (P0.y == zw7Var.getMeasuredHeight() / 2.0f) {
            rlbVar.setStickyY(2);
        }
        rlbVar.setDelegate(this);
        rlbVar.setMaxWidth(this.B1 - hl.L(32.0f));
        int i = this.p1;
        rlbVar.setTypeface(a78.e(i).j);
        rlbVar.setType(a78.e(i).h);
        zw7Var.addView(rlbVar, tre.c(-2.0f, -2));
        c0();
        fo6 fo6Var = this.p0;
        if (fo6Var != null) {
            rlbVar.j(1.0f / fo6Var.c);
            rlbVar.f(-(fo6Var.k + fo6Var.d));
        }
        if (z) {
            A0(rlbVar);
            rlbVar.q();
            C0(rlbVar, false);
            rlbVar.getFocusedView().requestFocus();
            hl.E3(rlbVar.getFocusedView());
            this.u0 = true;
            int i2 = a78.e(i).g;
            nv7 nv7Var = this.V0;
            nv7Var.d(i2, true);
            nv7Var.setOutlineType(a78.e(i).h);
        }
        return rlbVar;
    }

    public final xwc m0(vwc vwcVar) {
        int measuredWidth;
        int i;
        this.Z1 = true;
        getPaintingSize();
        PointF P0 = P0(null);
        zw7 zw7Var = this.B0;
        if (zw7Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.B1;
        } else {
            measuredWidth = zw7Var.getMeasuredWidth();
        }
        float f = measuredWidth;
        int L = ((int) f) - hl.L(58.0f);
        xwc xwcVar = new xwc(getContext(), P0, this.p1, vwcVar, f / 240.0f, L);
        if (P0.x == zw7Var.getMeasuredWidth() / 2.0f) {
            xwcVar.setStickyX(2);
        }
        if (P0.y == zw7Var.getMeasuredHeight() / 2.0f) {
            xwcVar.setStickyY(2);
        }
        igb igbVar = this.k1;
        if (igbVar != null && (i = igbVar.a) != -47814) {
            xwcVar.setColor(i);
        }
        xwcVar.setDelegate(this);
        xwcVar.setMaxWidth(L);
        zw7Var.addView(xwcVar, tre.c(-2.0f, -2));
        c0();
        fo6 fo6Var = this.p0;
        if (fo6Var != null) {
            xwcVar.j(1.0f / fo6Var.c);
            xwcVar.f(-(fo6Var.k + fo6Var.d));
        }
        return xwcVar;
    }

    public final void n0() {
        int i = 0;
        while (true) {
            zw7 zw7Var = this.B0;
            if (i < zw7Var.getChildCount()) {
                View childAt = zw7Var.getChildAt(i);
                if (childAt instanceof pp9) {
                    if (this.t0 == childAt) {
                        C0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(k43.h).withEndAction(new kw7(this, (pp9) childAt, (byte) 1)).start();
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean o() {
        return !(this.t0 instanceof b47);
    }

    public abstract void o0();

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        gc1 gc1Var = this.U1;
        if (gc1Var != null) {
            gc1Var.f(null);
            gd4 gd4Var = gc1Var.c;
            if (gd4Var != null) {
                gd4Var.f = null;
                v21 v21Var = (v21) gd4Var.g;
                if (v21Var != null) {
                    v21Var.b();
                    gd4Var.g = null;
                }
                gc1Var.c = null;
            }
            gc1Var.a.i(false);
        }
        this.W1.i(false);
        i49 i49Var = this.J1;
        if (i49Var != null) {
            hl.B2(i49Var);
            this.J1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        bc1 bc1Var;
        this.q0 = true;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int i3 = hl.q.y;
        a.getCurrentActionBarHeight();
        getAdditionalTop();
        getAdditionalBottom();
        Bitmap bitmap = this.m0;
        if (bitmap != null) {
            bitmap.getWidth();
            bitmap.getHeight();
        } else {
            a.getCurrentActionBarHeight();
        }
        float f = this.r0.a;
        h44 h44Var = this.t0;
        if (h44Var != null) {
            h44Var.m();
        }
        measureChild(this.D0, i, i2);
        measureChild(this.N0, i, i2);
        measureChild(this.F0, i, i2);
        gc1 gc1Var = this.U1;
        if (gc1Var != null && (bc1Var = gc1Var.e) != null) {
            bc1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        measureChild(this.E0, i, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.h2 - this.w1.getPaddingUnderContainer(), Q()), 1073741824));
        FrameLayout frameLayout = this.C0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), hl.L(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i, i2);
        this.q0 = false;
        if (hl.L(20.0f) >= 0 && !this.e2 && !this.g2) {
            this.q0 = true;
            t0();
            this.q0 = false;
        }
        if (hl.L(20.0f) >= 0) {
            return;
        }
        t0();
    }

    @Override
    public final boolean p() {
        return !this.u0;
    }

    public final b47 p0() {
        int i = 0;
        while (true) {
            zw7 zw7Var = this.B0;
            if (i < zw7Var.getChildCount()) {
                View childAt = zw7Var.getChildAt(i);
                if (childAt instanceof b47) {
                    return (b47) childAt;
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public final android.graphics.Bitmap q0(java.util.ArrayList r38, boolean r39, boolean r40, boolean r41, boolean r42, defpackage.c8b r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dx7.q0(java.util.ArrayList, boolean, boolean, boolean, boolean, c8b):android.graphics.Bitmap");
    }

    public final boolean r0() {
        if (!this.n0.a() && !this.Z1) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.q0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(v01 v01Var) {
        boolean z = v01Var instanceof p01;
        gx7 gx7Var = this.N0;
        if (!z && !(v01Var instanceof r01)) {
            gx7Var.b(0.05f, 1.0f);
        } else {
            gx7Var.b(0.4f, 1.75f);
        }
        gx7Var.setDrawCenter(!(v01Var instanceof u01));
        yw7 yw7Var = this.y0;
        if (yw7Var.getCurrentBrush() instanceof u01) {
            this.M0 = true;
        }
        yw7Var.setBrush(v01Var);
        igb igbVar = this.k1;
        int i = igbVar.a;
        igbVar.a = a78.e(this.p1).c();
        igbVar.c = this.O0.get();
        D0(igbVar, Integer.valueOf(i), false);
        this.z0.invalidate();
    }

    public final void s0(boolean z) {
        if (this.e2) {
            I0(0);
        }
        if (z) {
            o24 o24Var = this.d2;
            if (o24Var != null && o24Var.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.d2.getMeasuredHeight());
                ofFloat.addUpdateListener(new aw7(this, (byte) 0));
                this.g2 = true;
                ofFloat.addListener(new sw7(this, (byte) 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(hb.w);
                ofFloat.start();
                return;
            }
            t0();
        }
    }

    public void setBlurManager(tl0 tl0Var) {
        this.O1 = tl0Var;
    }

    public void setCoverPreview(boolean z) {
        if (this.a2 != z) {
            this.a2 = z;
            if (z) {
                C0(null, true);
            }
            setCoverPause(z);
        }
    }

    public void setCoverTime(long j) {
        int i = 0;
        while (true) {
            zw7 zw7Var = this.B0;
            if (i < zw7Var.getChildCount()) {
                View childAt = zw7Var.getChildAt(i);
                if (childAt instanceof v3b) {
                    ImageReceiver imageReceiver = ((v3b) childAt).z0;
                    b29 y = imageReceiver.y();
                    imageReceiver.m();
                    if (y != null) {
                        y.I(Math.round(((((float) j) % ((float) y.m())) / ((float) y.m())) * y.e[0]), true, false);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setHasAudio(boolean z) {
        if (z != this.I1) {
            this.I1 = z;
            c0();
        }
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.v1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.u1 = runnable;
    }

    @Override
    public final void t() {
        if (!this.f2 && !this.e2) {
            this.Z1 = true;
            l0(true);
            return;
        }
        if (this.e2) {
            h44 h44Var = this.t0;
            if (h44Var instanceof rlb) {
                this.y1.e = true;
                hl.E3(((rlb) h44Var).getEditText());
            }
        }
        I0(!this.e2 ? 1 : 0);
    }

    public final void t0() {
        o24 o24Var;
        if (!this.e2 && (o24Var = this.d2) != null && o24Var.getVisibility() != 8) {
            this.d2.setVisibility(8);
        }
        int i = this.h2;
        this.h2 = 0;
        if (i != 0) {
            this.y1.a();
        }
    }

    @Override
    public final void u(float f, float f2, float[] fArr) {
        View view;
        View view2 = (View) this.y0.getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x = (f - view2.getX()) - view.getLeft();
        float y = (f2 - view2.getY()) - view.getTop();
        float pivotX = ((x - view2.getPivotX()) / view2.getScaleX()) + view2.getPivotX();
        float pivotY = view2.getPivotY();
        fArr[0] = pivotX;
        fArr[1] = ((y - view2.getPivotY()) / view2.getScaleY()) + pivotY;
    }

    @Override
    public final void updateColors() {
        this.o1.setColor(-15132391);
    }

    @Override
    public final int[] v(h44 h44Var) {
        int[] iArr = this.c2;
        iArr[0] = (int) h44Var.getPosition().x;
        iArr[1] = (int) h44Var.getPosition().y;
        return iArr;
    }

    public final void v0(a78 a78Var, Integer num) {
        a78Var.h(num.intValue(), true);
        a78Var.g();
        setNewColor(num.intValue());
        this.g1.setSelectedColorIndex(a78Var.d());
        this.D1 = null;
    }

    @Override
    public final a78 w() {
        return a78.e(this.p1);
    }

    public final void w0(Integer num) {
        setNewColor(num.intValue());
        H0(false);
    }

    public final boolean x0() {
        if (this.M1) {
            if (this.J1.getReactionsWindow() != null && !this.J1.getReactionsWindow().q) {
                this.J1.b();
                return true;
            }
            N0(false);
            return true;
        } else if (this.l1) {
            H0(false);
            return true;
        } else if (this.e2) {
            s0(true);
            return true;
        } else if (!this.u0) {
            return false;
        } else {
            if (this.w0) {
                this.w0 = false;
                this.y1.b(true);
                return false;
            }
            C0(null, true);
            return true;
        }
    }

    public abstract void y0(boolean z);

    @Override
    public final void z() {
        M0(new iw7(this, (byte) 4), this, 53, 0, getHeight(), false);
    }

    public final void z0() {
        int i = this.I0;
        Q0(1);
        postDelayed(new pg6(this, (byte) 13), 350L);
        tw7 tw7Var = new tw7(this, getContext(), this.q1, i);
        this.Y1 = tw7Var;
        qbb qbbVar = this.w1;
        Objects.requireNonNull(qbbVar);
        tw7Var.w1 = new yt4(qbbVar, (byte) 26);
        boolean[] zArr = {true};
        tw7Var.setOnDismissListener(new gy5(this, zArr, i, (byte) 1));
        tw7Var.y1 = new jw7(this);
        tw7Var.K0(new r(this, zArr, tw7Var, (byte) 2));
        tw7Var.show();
        y0(true);
    }

    public View getView() {
        return this;
    }

    public void setOffsetTranslationX(float f) {
    }
}
