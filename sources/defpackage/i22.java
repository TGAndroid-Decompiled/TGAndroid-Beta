package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public class i22 extends my0 implements jm7, hy0, g94 {
    public static final int G4 = 0;
    public boolean A1;
    public final h12 A2;
    public boolean A3;
    public boolean A4;
    public boolean B1;
    public final k12 B2;
    public final io B3;
    public lc1 B4;
    public int C1;
    public final ImageView C2;
    public float C3;
    public final mr3 C4;
    public f D1;
    public final int[] D2;
    public int D3;
    public final kz4 D4;
    public int E1;
    public final h12 E2;
    public k47 E3;
    public final km0 E4;
    public int F1;
    public final p12 F2;
    public boolean F3;
    public final ms0 F4;
    public boolean G1;
    public final TextPaint G2;
    public final int G3;
    public boolean H1;
    public final RectF H2;
    public boolean H3;
    public boolean I1;
    public final Paint I2;
    public boolean I3;
    public boolean J1;
    public AnimatorSet J2;
    public boolean J3;
    public un5 K1;
    public long K2;
    public boolean K3;
    public boolean L1;
    public final su L2;
    public boolean L3;
    public final by7 M1;
    public final m12 M2;
    public boolean M3;
    public q82 N1;
    public byte N2;
    public boolean N3;
    public wn5 O1;
    public wg0 O2;
    public boolean O3;
    public boolean P1;
    public boolean P2;
    public int P3;
    public boolean Q1;
    public boolean Q2;
    public boolean Q3;
    public f42 R1;
    public boolean R2;
    public boolean R3;
    public p22 S1;
    public final float S2;
    public float S3;
    public long T1;
    public long T2;
    public float T3;
    public boolean U1;
    public final x20 U2;
    public ValueAnimator U3;
    public final qm0 V1;
    public AnimatorSet V2;
    public int V3;
    public boolean W1;
    public AnimatorSet W2;
    public g22 W3;
    public float X1;
    public final r7 X2;
    public j72 X3;
    public final t12 Y1;
    public final tl2 Y2;
    public final int[] Y3;
    public final d Z1;
    public final r7 Z2;
    public int Z3;
    public final boolean a2;
    public hg5 a3;
    public float a4;
    public oy1 b2;
    public final r7 b3;
    public float b4;
    public boolean c2;
    public final t8 c3;
    public boolean c4;
    public final ChatAttachAlertPhotoLayout d2;
    public float d3;
    public float d4;
    public w32 e2;
    public float e3;
    public final boolean e4;
    public s22 f2;
    public final h12 f3;
    public boolean f4;
    public v72 g2;
    public final TextView g3;
    public final ArrayList g4;
    public v72 h2;
    public final r7 h3;
    public final Rect h4;
    public n52 i2;
    public final LinearLayout i3;
    public float i4;
    public p42 j2;
    public final ImageView j3;
    public boolean j4;
    public x62 k2;
    public final LinearLayout k3;
    public int k4;
    public final fn0 l1;
    public h32 l2;
    public final TextView l3;
    public final t12 l4;
    public final fn0 m1;
    public a82 m2;
    public float m3;
    public zna m4;
    public final fn0 n1;
    public q42 n2;
    public boolean n3;
    public AnimatorSet n4;
    public final fn0 o1;
    public q42 o2;
    public final v12 o3;
    public int o4;
    public final fn0 p1;
    public p82 p2;
    public boolean p3;
    public int p4;
    public final fn0 q1;
    public c52 q2;
    public Object q3;
    public boolean q4;
    public final m99 r1;
    public boolean r2;
    public boolean r3;
    public boolean r4;
    public wv1 s1;
    public float s2;
    public final e02 s3;
    public boolean s4;
    public final io t1;
    public final a22[] t2;
    public final j12 t3;
    public m52 t4;
    public final io u1;
    public final LongSparseArray u2;
    public final h12 u3;
    public boolean u4;
    public final ImageView v1;
    public a22 v2;
    public final i12 v3;
    public boolean v4;
    public final hd w1;
    public a22 w2;
    public final u46 w3;
    public File w4;
    public final ImageView x1;
    public final im0 x2;
    public final f22 x3;
    public double[] x4;
    public final hd y1;
    public final im0 y2;
    public boolean y3;
    public boolean y4;
    public boolean z1;
    public final b51 z2;
    public final RadialProgressView z3;
    public boolean z4;

    public i22(Context context, d dVar, boolean z, boolean z2, boolean z3, final ylb ylbVar) {
        super(1, ylbVar, context, false);
        km0 km0Var;
        km0 km0Var2;
        boolean z4;
        r7 r7Var;
        t8 t8Var;
        float f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i;
        int L;
        d53 d53Var = d53.h;
        this.l1 = new fn0(0, this, d53Var, 380L, false);
        this.m1 = new fn0(1, this, d53Var, 380L, false);
        this.n1 = new fn0(2, this, d53Var, 380L, false);
        this.o1 = new fn0(3, this, d53Var, 380L, false);
        this.p1 = new fn0(4, this, d53Var, 380L, true);
        this.q1 = new fn0(5, this, d53Var, 320L, false);
        m99 m99Var = new m99(new s02(this, (byte) 2), d53Var, 380L);
        this.r1 = m99Var;
        this.G1 = false;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.X1 = 0.0f;
        this.Y1 = new t12(this, (byte) 0);
        this.c2 = false;
        a22[] a22VarArr = new a22[12];
        this.t2 = a22VarArr;
        this.u2 = new LongSparseArray();
        this.D2 = new int[2];
        TextPaint textPaint = new TextPaint(1);
        this.G2 = textPaint;
        this.H2 = new RectF();
        this.I2 = new Paint(1);
        this.R2 = true;
        this.S2 = 1.0f;
        this.y3 = false;
        this.A3 = false;
        int i2 = z8c.t0;
        this.G3 = i2;
        this.H3 = true;
        this.I3 = true;
        this.J3 = true;
        this.K3 = true;
        this.L3 = true;
        this.M3 = true;
        this.N3 = true;
        this.P3 = -1;
        this.Q3 = true;
        this.V3 = gm.L(85.0f);
        this.Y3 = new int[2];
        new Paint(1);
        this.f4 = false;
        ArrayList arrayList = new ArrayList();
        this.g4 = arrayList;
        Rect rect = new Rect();
        this.h4 = rect;
        this.l4 = new t12(this, (byte) 1);
        this.r4 = true;
        this.s4 = false;
        this.z4 = false;
        this.A4 = false;
        this.y = true;
        kz4 kz4Var = new kz4();
        this.D4 = kz4Var;
        kz4Var.a(cmb.v0(cmb.c6, this.J0));
        this.X0.E.add(new qy4(kz4Var, new s02(this, (byte) 4)));
        if (Build.VERSION.SDK_INT >= 31 && gda.f()) {
            mr3 mr3Var = new mr3(false);
            this.C4 = mr3Var;
            this.X0.a(mr3Var);
            nz4 nz4Var = new nz4(kz4Var);
            nz4Var.f = kz4Var;
            nz4Var.d = mr3Var;
            nz4Var.e = -2;
            nz4 nz4Var2 = new nz4(null);
            nz4Var2.f = kz4Var;
            nz4Var2.d = mr3Var;
            nz4Var2.e = -3;
            km0Var = new km0(nz4Var, nz4Var, nz4Var);
            this.E4 = km0Var;
            km0Var.k = true;
            if (e86.e(262144)) {
                L = gm.L(8.0f);
            } else {
                L = gm.L(48.0f);
            }
            km0Var.d = L;
            km0Var.e = L;
            km0Var2 = new km0(nz4Var2, nz4Var2, nz4Var2);
            km0Var2.k = true;
            int L2 = gm.L(48.0f);
            km0Var2.d = L2;
            km0Var2.e = L2;
        } else {
            this.C4 = null;
            km0Var = new km0(kz4Var, kz4Var, kz4Var);
            this.E4 = km0Var;
            km0Var2 = new km0(kz4Var, kz4Var, kz4Var);
        }
        km0 km0Var3 = km0Var;
        km0 km0Var4 = new km0(kz4Var, kz4Var, kz4Var);
        this.F4 = new ms0(this, (byte) 3);
        this.e4 = z;
        if ((dVar instanceof yv1) && dVar.isInBubbleMode()) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.a2 = z4;
        this.l0 = new OvershootInterpolator(0.7f);
        this.Z1 = dVar;
        this.G = true;
        this.z0 = this;
        nm7.f(i2).b(this, nm7.T0);
        nm7.f(i2).b(this, nm7.a5);
        nm7.f(i2).b(this, nm7.j5);
        nm7.f(i2).b(this, nm7.F1);
        arrayList.add(rect);
        v12 v12Var = new v12(this, context);
        this.o3 = v12Var;
        v12Var.setDelegate(new w12(this));
        this.b = v12Var;
        v12Var.setWillNotDraw(false);
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        ViewGroup viewGroup = this.b;
        int i3 = this.u0;
        viewGroup.setPadding(i3, 0, i3, 0);
        x20 x20Var = new x20(this, context, ylbVar, (byte) 1);
        this.U2 = x20Var;
        x20Var.d1 = true;
        x20Var.setForcedMenuWidth(gm.L(46.0f));
        x20Var.setBackButtonDrawable(new ee0(false));
        int i4 = cmb.i5;
        anb.l(x20Var, 1, i4, ylbVar);
        int i5 = cmb.H5;
        anb.l(x20Var, 3, i5, ylbVar);
        anb.l(x20Var, 5, i4, ylbVar);
        x20Var.setOccupyStatusBar(true);
        x20Var.setAlpha(0.0f);
        x20Var.setActionBarMenuOnItemClick(new r8(this, (byte) 23));
        km0 km0Var5 = km0Var2;
        r7 r7Var2 = new r7(context, null, 0, cmb.v0(i4, this.J0), false, ylbVar);
        this.X2 = r7Var2;
        r7Var2.setLongClickEnabled(false);
        r7Var2.setIcon(2131231248);
        r7Var2.setContentDescription(jb6.M0(2131754838, null));
        r7Var2.setVisibility(4);
        r7Var2.setAlpha(0.0f);
        r7Var2.setScaleX(0.6f);
        r7Var2.setScaleY(0.6f);
        r7Var2.setSubMenuOpenSide(2);
        r7Var2.setDelegate(new s02(this, (byte) 10));
        r7Var2.setAdditionalYOffset(gm.L(72.0f));
        r7Var2.setTranslationX(gm.L(1.0f));
        fg0 f0 = cmb.f0(cmb.v0(i5, this.J0), 6, -1);
        wmb M = anb.M(i5);
        r7Var2.setBackground(f0);
        anb.j(r7Var2, f0, null, M, ylbVar);
        r7Var2.setOnClickListener(new View.OnClickListener(this) {
            public final i22 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                e32 e32Var;
                int i6;
                byte b = r2;
                boolean z5 = false;
                i22 i22Var = this.b;
                switch (b) {
                    case 0:
                        if (i22Var.v2 != i22Var.k2) {
                            z5 = true;
                        }
                        i22Var.J1(z5);
                        return;
                    case 1:
                        long j = i22Var.T2;
                        if (j < 0 && (e32Var = (e32) i22Var.u2.get(-j)) != null) {
                            qw0 webViewContainer = e32Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = i22Var.W1;
                        if (!z6) {
                            i22Var.q1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = i22Var.W1;
                        if (z7) {
                            i22Var.q1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        i22Var.i1();
                        return;
                    case 5:
                        i22Var.X2.U(null, null);
                        return;
                    case 6:
                        if (i22Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z8 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = i22Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jo6) {
                                        jo6 jo6Var = (jo6) entry.getValue();
                                        if (jo6Var.d()) {
                                            jo6Var.O = Boolean.valueOf(S);
                                            for (int i7 = 0; i7 < chatAttachAlertPhotoLayout2.F.getChildCount(); i7++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i7);
                                                if (childAt instanceof q68) {
                                                    q68 q68Var = (q68) childAt;
                                                    if (q68Var.getPhotoEntry() == jo6Var) {
                                                        q68Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gda.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            i22Var.I1(true);
                            r7 r7Var3 = i22Var.Z2;
                            hg5 hg5Var = i22Var.a3;
                            if (hg5Var != null) {
                                hg5Var.f(true);
                            }
                            hg5 hg5Var2 = new hg5(i22Var.getContext(), 1);
                            i22Var.a3 = hg5Var2;
                            if (!S) {
                                i6 = 2131748589;
                            } else {
                                i6 = 2131748590;
                            }
                            hg5Var2.t(gm.S2(jb6.M0(i6, null)));
                            i22Var.a3.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                            i22Var.a3.o(1.0f, -((i22Var.b.getWidth() - ((r7Var3.getWidth() / 2.0f) + r7Var3.getX())) - gm.L(14.0f)));
                            i22Var.a3.setTranslationY(i22Var.X2.getTranslationY());
                            hg5 hg5Var3 = i22Var.a3;
                            hg5Var3.r0 = new lx1(i22Var, hg5Var2, (byte) 5);
                            i22Var.b.addView(hg5Var3, qoe.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            i22Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        a22 a22Var = i22Var.v2;
                        if (a22Var != null) {
                            a22Var.w(40);
                            return;
                        }
                        return;
                    default:
                        i22Var.h3.U(null, null);
                        return;
                }
            }
        });
        r7 r7Var3 = new r7(context, null, 0, cmb.v0(i4, this.J0), false, ylbVar);
        this.Z2 = r7Var3;
        r7Var3.setLongClickEnabled(false);
        tl2 tl2Var = new tl2();
        this.Y2 = tl2Var;
        r7Var3.setIcon(tl2Var);
        r7Var3.setContentDescription(jb6.M0(2131754838, null));
        r7Var3.setVisibility(8);
        r7Var3.setAlpha(0.0f);
        r7Var3.setScaleX(0.6f);
        r7Var3.setScaleY(0.6f);
        r7Var3.setAdditionalYOffset(gm.L(72.0f));
        r7Var3.setTranslationX(-gm.L(3.0f));
        fg0 f02 = cmb.f0(cmb.v0(i5, this.J0), 6, -1);
        wmb M2 = anb.M(i5);
        r7Var3.setBackground(f02);
        anb.j(r7Var3, f02, null, M2, ylbVar);
        r7Var3.setOnClickListener(new View.OnClickListener(this) {
            public final i22 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                e32 e32Var;
                int i6;
                byte b = r2;
                boolean z5 = false;
                i22 i22Var = this.b;
                switch (b) {
                    case 0:
                        if (i22Var.v2 != i22Var.k2) {
                            z5 = true;
                        }
                        i22Var.J1(z5);
                        return;
                    case 1:
                        long j = i22Var.T2;
                        if (j < 0 && (e32Var = (e32) i22Var.u2.get(-j)) != null) {
                            qw0 webViewContainer = e32Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = i22Var.W1;
                        if (!z6) {
                            i22Var.q1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = i22Var.W1;
                        if (z7) {
                            i22Var.q1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        i22Var.i1();
                        return;
                    case 5:
                        i22Var.X2.U(null, null);
                        return;
                    case 6:
                        if (i22Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z8 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = i22Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jo6) {
                                        jo6 jo6Var = (jo6) entry.getValue();
                                        if (jo6Var.d()) {
                                            jo6Var.O = Boolean.valueOf(S);
                                            for (int i7 = 0; i7 < chatAttachAlertPhotoLayout2.F.getChildCount(); i7++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i7);
                                                if (childAt instanceof q68) {
                                                    q68 q68Var = (q68) childAt;
                                                    if (q68Var.getPhotoEntry() == jo6Var) {
                                                        q68Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gda.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            i22Var.I1(true);
                            r7 r7Var32 = i22Var.Z2;
                            hg5 hg5Var = i22Var.a3;
                            if (hg5Var != null) {
                                hg5Var.f(true);
                            }
                            hg5 hg5Var2 = new hg5(i22Var.getContext(), 1);
                            i22Var.a3 = hg5Var2;
                            if (!S) {
                                i6 = 2131748589;
                            } else {
                                i6 = 2131748590;
                            }
                            hg5Var2.t(gm.S2(jb6.M0(i6, null)));
                            i22Var.a3.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                            i22Var.a3.o(1.0f, -((i22Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gm.L(14.0f)));
                            i22Var.a3.setTranslationY(i22Var.X2.getTranslationY());
                            hg5 hg5Var3 = i22Var.a3;
                            hg5Var3.r0 = new lx1(i22Var, hg5Var2, (byte) 5);
                            i22Var.b.addView(hg5Var3, qoe.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            i22Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        a22 a22Var = i22Var.v2;
                        if (a22Var != null) {
                            a22Var.w(40);
                            return;
                        }
                        return;
                    default:
                        i22Var.h3.U(null, null);
                        return;
                }
            }
        });
        t8 t8Var2 = new t8(this, context);
        anb.X(t8Var2, cmb.Ii, ylbVar);
        t8Var2.setText(jb6.M0(2131751690, null));
        t8Var2.setTypeface(gm.o());
        t8Var2.setTextSize(1, 14.0f);
        t8Var2.setVisibility(4);
        t8Var2.setAlpha(0.0f);
        t8Var2.setGravity(17);
        t8Var2.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
        t8Var2.setTranslationX(-gm.L(12.0f));
        t8Var2.setOnClickListener(new View.OnClickListener(this) {
            public final i22 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                e32 e32Var;
                int i6;
                byte b = r2;
                boolean z5 = false;
                i22 i22Var = this.b;
                switch (b) {
                    case 0:
                        if (i22Var.v2 != i22Var.k2) {
                            z5 = true;
                        }
                        i22Var.J1(z5);
                        return;
                    case 1:
                        long j = i22Var.T2;
                        if (j < 0 && (e32Var = (e32) i22Var.u2.get(-j)) != null) {
                            qw0 webViewContainer = e32Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = i22Var.W1;
                        if (!z6) {
                            i22Var.q1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = i22Var.W1;
                        if (z7) {
                            i22Var.q1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        i22Var.i1();
                        return;
                    case 5:
                        i22Var.X2.U(null, null);
                        return;
                    case 6:
                        if (i22Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z8 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = i22Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jo6) {
                                        jo6 jo6Var = (jo6) entry.getValue();
                                        if (jo6Var.d()) {
                                            jo6Var.O = Boolean.valueOf(S);
                                            for (int i7 = 0; i7 < chatAttachAlertPhotoLayout2.F.getChildCount(); i7++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i7);
                                                if (childAt instanceof q68) {
                                                    q68 q68Var = (q68) childAt;
                                                    if (q68Var.getPhotoEntry() == jo6Var) {
                                                        q68Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gda.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            i22Var.I1(true);
                            r7 r7Var32 = i22Var.Z2;
                            hg5 hg5Var = i22Var.a3;
                            if (hg5Var != null) {
                                hg5Var.f(true);
                            }
                            hg5 hg5Var2 = new hg5(i22Var.getContext(), 1);
                            i22Var.a3 = hg5Var2;
                            if (!S) {
                                i6 = 2131748589;
                            } else {
                                i6 = 2131748590;
                            }
                            hg5Var2.t(gm.S2(jb6.M0(i6, null)));
                            i22Var.a3.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                            i22Var.a3.o(1.0f, -((i22Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gm.L(14.0f)));
                            i22Var.a3.setTranslationY(i22Var.X2.getTranslationY());
                            hg5 hg5Var3 = i22Var.a3;
                            hg5Var3.r0 = new lx1(i22Var, hg5Var2, (byte) 5);
                            i22Var.b.addView(hg5Var3, qoe.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            i22Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        a22 a22Var = i22Var.v2;
                        if (a22Var != null) {
                            a22Var.w(40);
                            return;
                        }
                        return;
                    default:
                        i22Var.h3.U(null, null);
                        return;
                }
            }
        });
        rve.a(t8Var2);
        this.c3 = t8Var2;
        G1();
        if (dVar != null) {
            r7Var = r7Var3;
            t8Var = t8Var2;
            f = 14.0f;
            r7 r7Var4 = new r7(context, null, 0, cmb.v0(i4, this.J0), false, ylbVar);
            this.b3 = r7Var4;
            r7Var4.setLongClickEnabled(false);
            r7Var4.setIcon(2131232503);
            r7Var4.setContentDescription(jb6.M0(2131745570, null));
            r7Var4.setVisibility(4);
            r7Var4.setAlpha(0.0f);
            r7Var4.setTranslationX(-gm.L(42.0f));
            fg0 f03 = cmb.f0(cmb.v0(i5, this.J0), 6, -1);
            wmb M3 = anb.M(i5);
            r7Var4.setBackground(f03);
            anb.j(r7Var4, f03, null, M3, ylbVar);
            r7Var4.setOnClickListener(new v6((byte) 2, this, z2));
        } else {
            r7Var = r7Var3;
            t8Var = t8Var2;
            f = 14.0f;
        }
        r7 r7Var5 = new r7(context, null, 0, cmb.v0(i4, this.J0), false, ylbVar);
        this.h3 = r7Var5;
        r7Var5.setLongClickEnabled(false);
        r7Var5.setIcon(2131231248);
        r7Var5.setContentDescription(jb6.M0(2131754838, null));
        r7Var5.setVisibility(8);
        fg0 f04 = cmb.f0(cmb.v0(i5, this.J0), 3, -1);
        wmb M4 = anb.M(i5);
        r7Var5.setBackground(f04);
        anb.j(r7Var5, f04, null, M4, ylbVar);
        r7Var5.e(1, 2131232050, jb6.M0(2131744566, null)).setOnClickListener(new View.OnClickListener(this) {
            public final i22 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                yv1 yv1Var;
                byte b = r3;
                ylb ylbVar2 = ylbVar;
                final i22 i22Var = this.b;
                boolean z5 = false;
                boolean z6 = true;
                switch (b) {
                    case 0:
                        k12 k12Var = i22Var.B2;
                        if (k12Var != null) {
                            oc7.d1().edit().putInt("aihintshown", 3).apply();
                            a1 a1Var = new a1(i22Var.getContext(), ylbVar2);
                            a1Var.o1(k12Var.getText());
                            a1Var.e2 = new qac() {
                                @Override
                                public final void a(Object obj) {
                                    byte b2 = r2;
                                    i22 i22Var2 = i22Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b2) {
                                        case 0:
                                            k12 k12Var2 = i22Var2.B2;
                                            k12Var2.setText(charSequence);
                                            k12Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            m12 m12Var = i22Var2.M2;
                                            m12Var.setText(charSequence);
                                            m12Var.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j = i22Var.T1;
                            if (i22Var.E3 == null) {
                                z6 = false;
                            }
                            a1Var.m1(j, z6, new z02(i22Var, (byte) 0));
                            a1Var.show();
                            return;
                        }
                        return;
                    case 1:
                        m12 m12Var = i22Var.M2;
                        if (m12Var != null) {
                            oc7.d1().edit().putInt("aihintshown", 3).apply();
                            a1 a1Var2 = new a1(i22Var.getContext(), ylbVar2);
                            a1Var2.o1(m12Var.getText());
                            a1Var2.e2 = new qac() {
                                @Override
                                public final void a(Object obj) {
                                    byte b2 = r2;
                                    i22 i22Var2 = i22Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b2) {
                                        case 0:
                                            k12 k12Var2 = i22Var2.B2;
                                            k12Var2.setText(charSequence);
                                            k12Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            m12 m12Var2 = i22Var2.M2;
                                            m12Var2.setText(charSequence);
                                            m12Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j2 = i22Var.T1;
                            if (i22Var.E3 != null) {
                                z5 = true;
                            }
                            a1Var2.m1(j2, z5, new z02(i22Var, (byte) 1));
                            a1Var2.show();
                            return;
                        }
                        return;
                    default:
                        i22Var.h3.U(null, null);
                        PhotoViewer r0 = PhotoViewer.r0();
                        d dVar2 = i22Var.Z1;
                        r0.T1(null, dVar2, ylbVar2);
                        PhotoViewer.r0().U1(i22Var);
                        PhotoViewer r02 = PhotoViewer.r0();
                        int i6 = i22Var.P3;
                        boolean z7 = i22Var.Q3;
                        r02.h = i6;
                        r02.n = z7;
                        if (!i22Var.W3.B()) {
                            gm.t1(dVar2.getFragmentView().findFocus());
                            gm.t1(i22Var.c.findFocus());
                        }
                        File w = g6b.w(i22Var.G3, "webp");
                        Point point = gm.q;
                        int i7 = point.x;
                        int i8 = point.y;
                        if (i7 > 1080 || i8 > 1080) {
                            float min = Math.min(i7, i8) / 1080.0f;
                            i7 = (int) (i7 * min);
                            i8 = (int) (i8 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w));
                        } catch (Throwable th) {
                            fc4.g(th, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        jo6 jo6Var = new jo6(0, w.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(jo6Var);
                        PhotoViewer r03 = PhotoViewer.r0();
                        z12 z12Var = new z12(i22Var, jo6Var);
                        if (dVar2 instanceof yv1) {
                            yv1Var = (yv1) dVar2;
                        } else {
                            yv1Var = null;
                        }
                        r03.o1(arrayList2, 0, 11, false, z12Var, yv1Var);
                        if (i22Var.A1) {
                            PhotoViewer.r0().U(null, null, true, i22Var.D1);
                            return;
                        }
                        return;
                }
            }
        });
        r7Var5.setMenuYOffset(gm.L(-12.0f));
        r7Var5.setAdditionalXOffset(gm.L(12.0f));
        r7Var5.setOnClickListener(new View.OnClickListener(this) {
            public final i22 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                e32 e32Var;
                int i6;
                byte b = r2;
                boolean z5 = false;
                i22 i22Var = this.b;
                switch (b) {
                    case 0:
                        if (i22Var.v2 != i22Var.k2) {
                            z5 = true;
                        }
                        i22Var.J1(z5);
                        return;
                    case 1:
                        long j = i22Var.T2;
                        if (j < 0 && (e32Var = (e32) i22Var.u2.get(-j)) != null) {
                            qw0 webViewContainer = e32Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = i22Var.W1;
                        if (!z6) {
                            i22Var.q1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = i22Var.W1;
                        if (z7) {
                            i22Var.q1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        i22Var.i1();
                        return;
                    case 5:
                        i22Var.X2.U(null, null);
                        return;
                    case 6:
                        if (i22Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z8 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = i22Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jo6) {
                                        jo6 jo6Var = (jo6) entry.getValue();
                                        if (jo6Var.d()) {
                                            jo6Var.O = Boolean.valueOf(S);
                                            for (int i7 = 0; i7 < chatAttachAlertPhotoLayout2.F.getChildCount(); i7++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i7);
                                                if (childAt instanceof q68) {
                                                    q68 q68Var = (q68) childAt;
                                                    if (q68Var.getPhotoEntry() == jo6Var) {
                                                        q68Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gda.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            i22Var.I1(true);
                            r7 r7Var32 = i22Var.Z2;
                            hg5 hg5Var = i22Var.a3;
                            if (hg5Var != null) {
                                hg5Var.f(true);
                            }
                            hg5 hg5Var2 = new hg5(i22Var.getContext(), 1);
                            i22Var.a3 = hg5Var2;
                            if (!S) {
                                i6 = 2131748589;
                            } else {
                                i6 = 2131748590;
                            }
                            hg5Var2.t(gm.S2(jb6.M0(i6, null)));
                            i22Var.a3.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                            i22Var.a3.o(1.0f, -((i22Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gm.L(14.0f)));
                            i22Var.a3.setTranslationY(i22Var.X2.getTranslationY());
                            hg5 hg5Var3 = i22Var.a3;
                            hg5Var3.r0 = new lx1(i22Var, hg5Var2, (byte) 5);
                            i22Var.b.addView(hg5Var3, qoe.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            i22Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        a22 a22Var = i22Var.v2;
                        if (a22Var != null) {
                            a22Var.w(40);
                            return;
                        }
                        return;
                    default:
                        i22Var.h3.U(null, null);
                        return;
                }
            }
        });
        h12 h12Var = new h12(this, context, (byte) 0);
        this.f3 = h12Var;
        h12Var.setOnClickListener(new View.OnClickListener(this) {
            public final i22 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                e32 e32Var;
                int i6;
                byte b = r2;
                boolean z5 = false;
                i22 i22Var = this.b;
                switch (b) {
                    case 0:
                        if (i22Var.v2 != i22Var.k2) {
                            z5 = true;
                        }
                        i22Var.J1(z5);
                        return;
                    case 1:
                        long j = i22Var.T2;
                        if (j < 0 && (e32Var = (e32) i22Var.u2.get(-j)) != null) {
                            qw0 webViewContainer = e32Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = i22Var.W1;
                        if (!z6) {
                            i22Var.q1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = i22Var.W1;
                        if (z7) {
                            i22Var.q1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        i22Var.i1();
                        return;
                    case 5:
                        i22Var.X2.U(null, null);
                        return;
                    case 6:
                        if (i22Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z8 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = i22Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jo6) {
                                        jo6 jo6Var = (jo6) entry.getValue();
                                        if (jo6Var.d()) {
                                            jo6Var.O = Boolean.valueOf(S);
                                            for (int i7 = 0; i7 < chatAttachAlertPhotoLayout2.F.getChildCount(); i7++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i7);
                                                if (childAt instanceof q68) {
                                                    q68 q68Var = (q68) childAt;
                                                    if (q68Var.getPhotoEntry() == jo6Var) {
                                                        q68Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gda.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            i22Var.I1(true);
                            r7 r7Var32 = i22Var.Z2;
                            hg5 hg5Var = i22Var.a3;
                            if (hg5Var != null) {
                                hg5Var.f(true);
                            }
                            hg5 hg5Var2 = new hg5(i22Var.getContext(), 1);
                            i22Var.a3 = hg5Var2;
                            if (!S) {
                                i6 = 2131748589;
                            } else {
                                i6 = 2131748590;
                            }
                            hg5Var2.t(gm.S2(jb6.M0(i6, null)));
                            i22Var.a3.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                            i22Var.a3.o(1.0f, -((i22Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gm.L(14.0f)));
                            i22Var.a3.setTranslationY(i22Var.X2.getTranslationY());
                            hg5 hg5Var3 = i22Var.a3;
                            hg5Var3.r0 = new lx1(i22Var, hg5Var2, (byte) 5);
                            i22Var.b.addView(hg5Var3, qoe.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            i22Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        a22 a22Var = i22Var.v2;
                        if (a22Var != null) {
                            a22Var.w(40);
                            return;
                        }
                        return;
                    default:
                        i22Var.h3.U(null, null);
                        return;
                }
            }
        });
        h12Var.setAlpha(0.0f);
        h12Var.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.i3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.g3 = textView;
        td4.x(textView, i4, ylbVar, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, qoe.r(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.j3 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(2131230876).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.x(imageView, mutate, i4, ylbVar, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, qoe.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        h12Var.addView(linearLayout, qoe.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.k3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(2131230875).mutate();
        anb.x(imageView2, mutate2, i4, ylbVar, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, qoe.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.l3 = textView2;
        td4.x(textView2, i4, ylbVar, 1, 16.0f);
        hg9.p(textView2, 19, "AttachMediaPreview", 2131753923);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, qoe.r(-2, -2, 16));
        h12Var.addView(linearLayout2, qoe.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = new ChatAttachAlertPhotoLayout(this, context, z, z3, ylbVar);
        this.d2 = chatAttachAlertPhotoLayout2;
        a22VarArr[0] = chatAttachAlertPhotoLayout2;
        chatAttachAlertPhotoLayout2.setTranslationX(0.0f);
        this.v2 = chatAttachAlertPhotoLayout2;
        this.T2 = 1L;
        this.b.addView(chatAttachAlertPhotoLayout2, qoe.c(-1.0f, -1));
        e02 e02Var = new e02(context);
        this.s3 = e02Var;
        e02Var.setup(km0Var4);
        e02Var.setFadeTopAlpha(0);
        e02Var.setFadeHeightTop(gm.L(48.0f));
        e02Var.setFadeHeightBottom(gm.L(48.0f));
        e02Var.setFadeZoneTop(gm.L(5.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gm.m);
        this.b.addView(e02Var, qoe.g());
        this.b.addView(h12Var, qoe.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        su suVar = new su(context, (byte) 6);
        this.L2 = suVar;
        this.b.addView(suVar, qoe.e(-1, -2, 55));
        this.b.addView(x20Var, qoe.c(-2.0f, -1));
        this.b.addView(r7Var2, qoe.e(48, 48, 53));
        this.b.addView(r7Var, qoe.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        r7 r7Var6 = this.b3;
        if (r7Var6 != null) {
            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout2;
            this.b.addView(r7Var6, qoe.e(48, 48, 53));
        } else {
            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout2;
        }
        h12Var.addView(r7Var5, qoe.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.b.addView(t8Var, qoe.e(-2, 48, 53));
        h12 h12Var2 = new h12(this, context, (byte) 1);
        this.u3 = h12Var2;
        i12 i12Var = new i12(context, (byte) 0);
        this.v3 = i12Var;
        i12Var.setClipChildren(true);
        i12Var.setClipToPadding(false);
        f22 f22Var = new f22(this, context);
        this.x3 = f22Var;
        i12Var.setAdapter(f22Var);
        u46 u46Var = new u46(0, false);
        this.w3 = u46Var;
        i12Var.setLayoutManager(u46Var);
        i12Var.setVerticalScrollBarEnabled(false);
        i12Var.setHorizontalScrollBarEnabled(false);
        i12Var.setItemAnimator(null);
        i12Var.setLayoutAnimation(null);
        anb.l(i12Var, 21, cmb.z5, ylbVar);
        i12Var.z2 = true;
        i12Var.setOverScrollMode(2);
        sy4 sy4Var = this.X0;
        km0Var3.j = sy4Var;
        km0Var5.j = sy4Var;
        km0Var4.j = sy4Var;
        j12 j12Var = new j12(this, context, (byte) 0);
        this.t3 = j12Var;
        qm0 qm0Var = new qm0(km0Var4.c(j12Var, null, false));
        this.V1 = qm0Var;
        if (gda.f()) {
            e86.e(262144);
        }
        qm0Var.b(gm.L(72.0f), true);
        this.b.addView(j12Var, qoe.g());
        im0 c = km0Var3.c(h12Var2, qqd.g(ylbVar), false);
        c.r(gm.L(28.0f));
        c.q(gm.L(7.0f));
        h12Var2.setBackground(c);
        i12Var.setPadding(gm.L(11.0f), gm.L(11.0f), gm.L(11.0f), gm.L(11.0f));
        i12Var.setClipToOutline(true);
        xj xjVar = agc.a;
        i12Var.setOutlineProvider(new yfc(gm.L(11.0f), gm.L(28.0f)));
        i12Var.setImportantForAccessibility(1);
        h12Var2.addView(i12Var, qoe.g());
        this.b.addView(h12Var2, qoe.e(-1, 70, 81));
        i12Var.setOnItemClickListener(new k0(this, ylbVar, (byte) 8));
        i12Var.setOnItemLongClickListener(new s02(this, (byte) 3));
        io ioVar = new io(context, true, false, true);
        this.B3 = ioVar;
        ioVar.setVisibility(8);
        ioVar.setAlpha(0.0f);
        ioVar.setGravity(17);
        ioVar.setTypeface(gm.o());
        int L3 = gm.L(16.0f);
        ioVar.setPadding(L3, 0, L3, 0);
        ioVar.setTextSize(gm.L(f));
        ioVar.setOnClickListener(new View.OnClickListener(this) {
            public final i22 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                e32 e32Var;
                int i6;
                byte b = r2;
                boolean z5 = false;
                i22 i22Var = this.b;
                switch (b) {
                    case 0:
                        if (i22Var.v2 != i22Var.k2) {
                            z5 = true;
                        }
                        i22Var.J1(z5);
                        return;
                    case 1:
                        long j = i22Var.T2;
                        if (j < 0 && (e32Var = (e32) i22Var.u2.get(-j)) != null) {
                            qw0 webViewContainer = e32Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = i22Var.W1;
                        if (!z6) {
                            i22Var.q1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = i22Var.W1;
                        if (z7) {
                            i22Var.q1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        i22Var.i1();
                        return;
                    case 5:
                        i22Var.X2.U(null, null);
                        return;
                    case 6:
                        if (i22Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z8 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout22 = i22Var.d2;
                            chatAttachAlertPhotoLayout22.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jo6) {
                                        jo6 jo6Var = (jo6) entry.getValue();
                                        if (jo6Var.d()) {
                                            jo6Var.O = Boolean.valueOf(S);
                                            for (int i7 = 0; i7 < chatAttachAlertPhotoLayout22.F.getChildCount(); i7++) {
                                                View childAt = chatAttachAlertPhotoLayout22.F.getChildAt(i7);
                                                if (childAt instanceof q68) {
                                                    q68 q68Var = (q68) childAt;
                                                    if (q68Var.getPhotoEntry() == jo6Var) {
                                                        q68Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gda.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout22.y0();
                            }
                            i22Var.I1(true);
                            r7 r7Var32 = i22Var.Z2;
                            hg5 hg5Var = i22Var.a3;
                            if (hg5Var != null) {
                                hg5Var.f(true);
                            }
                            hg5 hg5Var2 = new hg5(i22Var.getContext(), 1);
                            i22Var.a3 = hg5Var2;
                            if (!S) {
                                i6 = 2131748589;
                            } else {
                                i6 = 2131748590;
                            }
                            hg5Var2.t(gm.S2(jb6.M0(i6, null)));
                            i22Var.a3.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                            i22Var.a3.o(1.0f, -((i22Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gm.L(14.0f)));
                            i22Var.a3.setTranslationY(i22Var.X2.getTranslationY());
                            hg5 hg5Var3 = i22Var.a3;
                            hg5Var3.r0 = new lx1(i22Var, hg5Var2, (byte) 5);
                            i22Var.b.addView(hg5Var3, qoe.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            i22Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        a22 a22Var = i22Var.v2;
                        if (a22Var != null) {
                            a22Var.w(40);
                            return;
                        }
                        return;
                    default:
                        i22Var.h3.U(null, null);
                        return;
                }
            }
        });
        this.b.addView(ioVar, qoe.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.z3 = radialProgressView;
        radialProgressView.setSize(gm.L(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.b.addView(radialProgressView, qoe.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.C2 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i6 = cmb.y6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        anb.s(imageView3, i6, ylbVar, mode2);
        imageView3.setImageResource(2131231843);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final i22 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                e32 e32Var;
                int i62;
                byte b = r2;
                boolean z5 = false;
                i22 i22Var = this.b;
                switch (b) {
                    case 0:
                        if (i22Var.v2 != i22Var.k2) {
                            z5 = true;
                        }
                        i22Var.J1(z5);
                        return;
                    case 1:
                        long j = i22Var.T2;
                        if (j < 0 && (e32Var = (e32) i22Var.u2.get(-j)) != null) {
                            qw0 webViewContainer = e32Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = i22Var.W1;
                        if (!z6) {
                            i22Var.q1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = i22Var.W1;
                        if (z7) {
                            i22Var.q1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        i22Var.i1();
                        return;
                    case 5:
                        i22Var.X2.U(null, null);
                        return;
                    case 6:
                        if (i22Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z8 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout22 = i22Var.d2;
                            chatAttachAlertPhotoLayout22.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jo6) {
                                        jo6 jo6Var = (jo6) entry.getValue();
                                        if (jo6Var.d()) {
                                            jo6Var.O = Boolean.valueOf(S);
                                            for (int i7 = 0; i7 < chatAttachAlertPhotoLayout22.F.getChildCount(); i7++) {
                                                View childAt = chatAttachAlertPhotoLayout22.F.getChildAt(i7);
                                                if (childAt instanceof q68) {
                                                    q68 q68Var = (q68) childAt;
                                                    if (q68Var.getPhotoEntry() == jo6Var) {
                                                        q68Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gda.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout22.y0();
                            }
                            i22Var.I1(true);
                            r7 r7Var32 = i22Var.Z2;
                            hg5 hg5Var = i22Var.a3;
                            if (hg5Var != null) {
                                hg5Var.f(true);
                            }
                            hg5 hg5Var2 = new hg5(i22Var.getContext(), 1);
                            i22Var.a3 = hg5Var2;
                            if (!S) {
                                i62 = 2131748589;
                            } else {
                                i62 = 2131748590;
                            }
                            hg5Var2.t(gm.S2(jb6.M0(i62, null)));
                            i22Var.a3.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                            i22Var.a3.o(1.0f, -((i22Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gm.L(14.0f)));
                            i22Var.a3.setTranslationY(i22Var.X2.getTranslationY());
                            hg5 hg5Var3 = i22Var.a3;
                            hg5Var3.r0 = new lx1(i22Var, hg5Var2, (byte) 5);
                            i22Var.b.addView(hg5Var3, qoe.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            i22Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        a22 a22Var = i22Var.v2;
                        if (a22Var != null) {
                            a22Var.w(40);
                            return;
                        }
                        return;
                    default:
                        i22Var.h3.U(null, null);
                        return;
                }
            }
        });
        h12 h12Var3 = new h12(this, context, (byte) 2);
        this.A2 = h12Var3;
        b51 b51Var = new b51(this, context);
        this.z2 = b51Var;
        h12Var3.addView(b51Var, qoe.e(-1, -1, 119));
        im0 c2 = km0Var5.c(v12Var, qqd.n(ylbVar), false);
        this.x2 = c2;
        c2.U = true;
        c2.s(gm.L(29.0f), gm.L(29.0f), 0.0f, 0.0f);
        c2.u(gm.L(32.0f));
        c2.S.g = 0.4f;
        c2.n();
        im0 c3 = km0Var3.c(b51Var, qqd.n(ylbVar), false);
        this.y2 = c3;
        c3.r(gm.L(22.0f));
        c3.q(gm.L(7.0f));
        b51Var.setPadding(gm.L(7.0f), gm.L(5.0f), gm.L(7.0f), gm.L(5.0f));
        h12Var3.setWillNotDraw(false);
        h12Var3.setVisibility(4);
        h12Var3.setAlpha(0.0f);
        this.b.addView(h12Var3, qoe.e(-1, -2, 83));
        h12Var3.setOnTouchListener(new w02((byte) 0));
        io ioVar2 = new io(context, false, false, false);
        this.t1 = ioVar2;
        ioVar2.setAllowCancel(true);
        ioVar2.setScaleProperty(0.6f);
        ioVar2.setVisibility(8);
        ioVar2.setTextSize(gm.L(15.0f));
        int i7 = cmb.x6;
        anb.U(ioVar2, i7, ylbVar);
        ioVar2.setTypeface(gm.o());
        ioVar2.setGravity(17);
        b51Var.addView(ioVar2, qoe.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.v1 = imageView4;
        hd hdVar = new hd(context);
        this.w1 = hdVar;
        imageView4.setImageDrawable(hdVar);
        imageView4.setScaleType(scaleType);
        int i8 = cmb.Ml;
        anb.s(imageView4, i8, ylbVar, mode);
        int i9 = cmb.h6;
        fg0 f05 = cmb.f0(cmb.v0(i9, this.J0), 1, gm.L(16.0f));
        wmb M5 = anb.M(i9);
        imageView4.setBackground(f05);
        anb.j(imageView4, f05, null, M5, ylbVar);
        b51Var.addView(imageView4, qoe.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(jb6.M0(2131755006, null));
        rve.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final i22 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                yv1 yv1Var;
                byte b = r3;
                ylb ylbVar2 = ylbVar;
                final i22 i22Var = this.b;
                boolean z5 = false;
                boolean z6 = true;
                switch (b) {
                    case 0:
                        k12 k12Var = i22Var.B2;
                        if (k12Var != null) {
                            oc7.d1().edit().putInt("aihintshown", 3).apply();
                            a1 a1Var = new a1(i22Var.getContext(), ylbVar2);
                            a1Var.o1(k12Var.getText());
                            a1Var.e2 = new qac() {
                                @Override
                                public final void a(Object obj) {
                                    byte b2 = r2;
                                    i22 i22Var2 = i22Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b2) {
                                        case 0:
                                            k12 k12Var2 = i22Var2.B2;
                                            k12Var2.setText(charSequence);
                                            k12Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            m12 m12Var2 = i22Var2.M2;
                                            m12Var2.setText(charSequence);
                                            m12Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j = i22Var.T1;
                            if (i22Var.E3 == null) {
                                z6 = false;
                            }
                            a1Var.m1(j, z6, new z02(i22Var, (byte) 0));
                            a1Var.show();
                            return;
                        }
                        return;
                    case 1:
                        m12 m12Var = i22Var.M2;
                        if (m12Var != null) {
                            oc7.d1().edit().putInt("aihintshown", 3).apply();
                            a1 a1Var2 = new a1(i22Var.getContext(), ylbVar2);
                            a1Var2.o1(m12Var.getText());
                            a1Var2.e2 = new qac() {
                                @Override
                                public final void a(Object obj) {
                                    byte b2 = r2;
                                    i22 i22Var2 = i22Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b2) {
                                        case 0:
                                            k12 k12Var2 = i22Var2.B2;
                                            k12Var2.setText(charSequence);
                                            k12Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            m12 m12Var2 = i22Var2.M2;
                                            m12Var2.setText(charSequence);
                                            m12Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j2 = i22Var.T1;
                            if (i22Var.E3 != null) {
                                z5 = true;
                            }
                            a1Var2.m1(j2, z5, new z02(i22Var, (byte) 1));
                            a1Var2.show();
                            return;
                        }
                        return;
                    default:
                        i22Var.h3.U(null, null);
                        PhotoViewer r0 = PhotoViewer.r0();
                        d dVar2 = i22Var.Z1;
                        r0.T1(null, dVar2, ylbVar2);
                        PhotoViewer.r0().U1(i22Var);
                        PhotoViewer r02 = PhotoViewer.r0();
                        int i62 = i22Var.P3;
                        boolean z7 = i22Var.Q3;
                        r02.h = i62;
                        r02.n = z7;
                        if (!i22Var.W3.B()) {
                            gm.t1(dVar2.getFragmentView().findFocus());
                            gm.t1(i22Var.c.findFocus());
                        }
                        File w = g6b.w(i22Var.G3, "webp");
                        Point point = gm.q;
                        int i72 = point.x;
                        int i82 = point.y;
                        if (i72 > 1080 || i82 > 1080) {
                            float min = Math.min(i72, i82) / 1080.0f;
                            i72 = (int) (i72 * min);
                            i82 = (int) (i82 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i72, i82, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w));
                        } catch (Throwable th) {
                            fc4.g(th, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        jo6 jo6Var = new jo6(0, w.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(jo6Var);
                        PhotoViewer r03 = PhotoViewer.r0();
                        z12 z12Var = new z12(i22Var, jo6Var);
                        if (dVar2 instanceof yv1) {
                            yv1Var = (yv1) dVar2;
                        } else {
                            yv1Var = null;
                        }
                        r03.o1(arrayList2, 0, 11, false, z12Var, yv1Var);
                        if (i22Var.A1) {
                            PhotoViewer.r0().U(null, null, true, i22Var.D1);
                            return;
                        }
                        return;
                }
            }
        });
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        this.E1 = oc7.r1(z8c.t0).G0();
        k12 k12Var = new k12(this, context, v12Var, ylbVar);
        this.B2 = k12Var;
        k12Var.K = true;
        k12Var.setHint(jb6.M0(2131754451, "AddCaption"));
        k12Var.s();
        k12Var.getEditText().setLayoutParams(qoe.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        k12Var.getEditText().addTextChangedListener(new l12(this, (byte) 0));
        b51Var.addView(k12Var, qoe.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        b51Var.setClipChildren(false);
        h12Var3.setClipChildren(false);
        k12Var.setClipChildren(false);
        suVar.setPadding(gm.L(10.0f), gm.L(2.0f), gm.L(10.0f), gm.L(10.0f));
        suVar.setWillNotDraw(false);
        m12 m12Var = new m12(this, context, v12Var, ylbVar);
        this.M2 = m12Var;
        m12Var.K = true;
        m12Var.getEditText().addTextChangedListener(new o12(this, dVar));
        m12Var.getEditText().setPadding(0, gm.L(9.0f), 0, gm.L(9.0f));
        m12Var.getEditText().setLayoutParams(qoe.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        m12Var.getEditText().setTextSize(1, 17.0f);
        m12Var.getEmojiButton().setLayoutParams(qoe.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        m12Var.setHint(jb6.M0(2131754451, "AddCaption"));
        suVar.addView(m12Var, qoe.e(-1, -2, 119));
        suVar.setAlpha(0.0f);
        suVar.setVisibility(8);
        k12Var.addView(imageView3, qoe.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        im0 c4 = km0Var3.c(suVar, qqd.n(ylbVar), false);
        c4.r(gm.L(22.0f));
        c4.q(gm.L(7.0f));
        suVar.setBackground(c4);
        suVar.setPadding(gm.L(11.0f), gm.L(9.0f), gm.L(11.0f), gm.L(9.0f));
        io ioVar3 = new io(context, false, false, false);
        this.u1 = ioVar3;
        ioVar3.setScaleProperty(0.6f);
        ioVar3.setVisibility(8);
        ioVar3.setTextSize(gm.L(15.0f));
        anb.U(ioVar3, i7, ylbVar);
        ioVar3.setTypeface(gm.o());
        ioVar3.setGravity(17);
        ioVar3.setAllowCancel(true);
        suVar.addView(ioVar3, qoe.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(2131231844);
        anb.s(imageView5, cmb.Ne, ylbVar, mode2);
        m12Var.addView(imageView5, qoe.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final i22 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                e32 e32Var;
                int i62;
                byte b = r2;
                boolean z5 = false;
                i22 i22Var = this.b;
                switch (b) {
                    case 0:
                        if (i22Var.v2 != i22Var.k2) {
                            z5 = true;
                        }
                        i22Var.J1(z5);
                        return;
                    case 1:
                        long j = i22Var.T2;
                        if (j < 0 && (e32Var = (e32) i22Var.u2.get(-j)) != null) {
                            qw0 webViewContainer = e32Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = i22Var.W1;
                        if (!z6) {
                            i22Var.q1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = i22Var.W1;
                        if (z7) {
                            i22Var.q1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        i22Var.i1();
                        return;
                    case 5:
                        i22Var.X2.U(null, null);
                        return;
                    case 6:
                        if (i22Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z8 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout22 = i22Var.d2;
                            chatAttachAlertPhotoLayout22.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jo6) {
                                        jo6 jo6Var = (jo6) entry.getValue();
                                        if (jo6Var.d()) {
                                            jo6Var.O = Boolean.valueOf(S);
                                            for (int i72 = 0; i72 < chatAttachAlertPhotoLayout22.F.getChildCount(); i72++) {
                                                View childAt = chatAttachAlertPhotoLayout22.F.getChildAt(i72);
                                                if (childAt instanceof q68) {
                                                    q68 q68Var = (q68) childAt;
                                                    if (q68Var.getPhotoEntry() == jo6Var) {
                                                        q68Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gda.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout22.y0();
                            }
                            i22Var.I1(true);
                            r7 r7Var32 = i22Var.Z2;
                            hg5 hg5Var = i22Var.a3;
                            if (hg5Var != null) {
                                hg5Var.f(true);
                            }
                            hg5 hg5Var2 = new hg5(i22Var.getContext(), 1);
                            i22Var.a3 = hg5Var2;
                            if (!S) {
                                i62 = 2131748589;
                            } else {
                                i62 = 2131748590;
                            }
                            hg5Var2.t(gm.S2(jb6.M0(i62, null)));
                            i22Var.a3.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                            i22Var.a3.o(1.0f, -((i22Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gm.L(14.0f)));
                            i22Var.a3.setTranslationY(i22Var.X2.getTranslationY());
                            hg5 hg5Var3 = i22Var.a3;
                            hg5Var3.r0 = new lx1(i22Var, hg5Var2, (byte) 5);
                            i22Var.b.addView(hg5Var3, qoe.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            i22Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        a22 a22Var = i22Var.v2;
                        if (a22Var != null) {
                            a22Var.w(40);
                            return;
                        }
                        return;
                    default:
                        i22Var.h3.U(null, null);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.x1 = imageView6;
        hd hdVar2 = new hd(context);
        this.y1 = hdVar2;
        imageView6.setImageDrawable(hdVar2);
        imageView6.setScaleType(scaleType);
        anb.s(imageView6, i8, ylbVar, mode);
        fg0 f06 = cmb.f0(cmb.v0(i9, this.J0), 1, gm.L(16.0f));
        wmb M6 = anb.M(i9);
        imageView6.setBackground(f06);
        anb.j(imageView6, f06, null, M6, ylbVar);
        suVar.addView(imageView6, qoe.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(jb6.M0(2131755006, null));
        rve.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final i22 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                yv1 yv1Var;
                byte b = r3;
                ylb ylbVar2 = ylbVar;
                final i22 i22Var = this.b;
                boolean z5 = false;
                boolean z6 = true;
                switch (b) {
                    case 0:
                        k12 k12Var2 = i22Var.B2;
                        if (k12Var2 != null) {
                            oc7.d1().edit().putInt("aihintshown", 3).apply();
                            a1 a1Var = new a1(i22Var.getContext(), ylbVar2);
                            a1Var.o1(k12Var2.getText());
                            a1Var.e2 = new qac() {
                                @Override
                                public final void a(Object obj) {
                                    byte b2 = r2;
                                    i22 i22Var2 = i22Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b2) {
                                        case 0:
                                            k12 k12Var22 = i22Var2.B2;
                                            k12Var22.setText(charSequence);
                                            k12Var22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            m12 m12Var2 = i22Var2.M2;
                                            m12Var2.setText(charSequence);
                                            m12Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j = i22Var.T1;
                            if (i22Var.E3 == null) {
                                z6 = false;
                            }
                            a1Var.m1(j, z6, new z02(i22Var, (byte) 0));
                            a1Var.show();
                            return;
                        }
                        return;
                    case 1:
                        m12 m12Var2 = i22Var.M2;
                        if (m12Var2 != null) {
                            oc7.d1().edit().putInt("aihintshown", 3).apply();
                            a1 a1Var2 = new a1(i22Var.getContext(), ylbVar2);
                            a1Var2.o1(m12Var2.getText());
                            a1Var2.e2 = new qac() {
                                @Override
                                public final void a(Object obj) {
                                    byte b2 = r2;
                                    i22 i22Var2 = i22Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b2) {
                                        case 0:
                                            k12 k12Var22 = i22Var2.B2;
                                            k12Var22.setText(charSequence);
                                            k12Var22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            m12 m12Var22 = i22Var2.M2;
                                            m12Var22.setText(charSequence);
                                            m12Var22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j2 = i22Var.T1;
                            if (i22Var.E3 != null) {
                                z5 = true;
                            }
                            a1Var2.m1(j2, z5, new z02(i22Var, (byte) 1));
                            a1Var2.show();
                            return;
                        }
                        return;
                    default:
                        i22Var.h3.U(null, null);
                        PhotoViewer r0 = PhotoViewer.r0();
                        d dVar2 = i22Var.Z1;
                        r0.T1(null, dVar2, ylbVar2);
                        PhotoViewer.r0().U1(i22Var);
                        PhotoViewer r02 = PhotoViewer.r0();
                        int i62 = i22Var.P3;
                        boolean z7 = i22Var.Q3;
                        r02.h = i62;
                        r02.n = z7;
                        if (!i22Var.W3.B()) {
                            gm.t1(dVar2.getFragmentView().findFocus());
                            gm.t1(i22Var.c.findFocus());
                        }
                        File w = g6b.w(i22Var.G3, "webp");
                        Point point = gm.q;
                        int i72 = point.x;
                        int i82 = point.y;
                        if (i72 > 1080 || i82 > 1080) {
                            float min = Math.min(i72, i82) / 1080.0f;
                            i72 = (int) (i72 * min);
                            i82 = (int) (i82 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i72, i82, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w));
                        } catch (Throwable th) {
                            fc4.g(th, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        jo6 jo6Var = new jo6(0, w.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(jo6Var);
                        PhotoViewer r03 = PhotoViewer.r0();
                        z12 z12Var = new z12(i22Var, jo6Var);
                        if (dVar2 instanceof yv1) {
                            yv1Var = (yv1) dVar2;
                        } else {
                            yv1Var = null;
                        }
                        r03.o1(arrayList2, 0, 11, false, z12Var, yv1Var);
                        if (i22Var.A1) {
                            PhotoViewer.r0().U(null, null, true, i22Var.D1);
                            return;
                        }
                        return;
                }
            }
        });
        imageView6.setVisibility(8);
        imageView6.setAlpha(0.0f);
        imageView6.setScaleX(0.6f);
        imageView6.setScaleY(0.6f);
        h12 h12Var4 = new h12(this, context, (byte) 3);
        this.E2 = h12Var4;
        h12Var4.setFocusable(true);
        h12Var4.setFocusableInTouchMode(true);
        h12Var4.setVisibility(4);
        h12Var4.setScaleX(0.2f);
        h12Var4.setScaleY(0.2f);
        h12Var4.setAlpha(0.0f);
        h12Var4.setClipChildren(false);
        h12Var4.setClipToPadding(false);
        this.b.addView(h12Var4, qoe.e(110, 50, 85));
        p12 p12Var = new p12(this, ylbVar, context);
        this.F2 = p12Var;
        p12Var.setImportantForAccessibility(2);
        h12Var4.addView(p12Var, qoe.e(-1, -1, 119));
        p12Var.setTranslationX(this.u0);
        int L4 = gm.L(52.0f);
        int L5 = gm.L(38.0f);
        p12Var.L = L4;
        p12Var.M = L5;
        p12Var.P = gm.L(7.0f);
        p12Var.Q = gm.L(6.0f);
        p12Var.s0 = true;
        p12Var.setOnClickListener(new View.OnClickListener(this) {
            public final i22 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                e32 e32Var;
                int i62;
                byte b = r2;
                boolean z5 = false;
                i22 i22Var = this.b;
                switch (b) {
                    case 0:
                        if (i22Var.v2 != i22Var.k2) {
                            z5 = true;
                        }
                        i22Var.J1(z5);
                        return;
                    case 1:
                        long j = i22Var.T2;
                        if (j < 0 && (e32Var = (e32) i22Var.u2.get(-j)) != null) {
                            qw0 webViewContainer = e32Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = i22Var.W1;
                        if (!z6) {
                            i22Var.q1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = i22Var.W1;
                        if (z7) {
                            i22Var.q1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        i22Var.i1();
                        return;
                    case 5:
                        i22Var.X2.U(null, null);
                        return;
                    case 6:
                        if (i22Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z8 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout22 = i22Var.d2;
                            chatAttachAlertPhotoLayout22.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jo6) {
                                        jo6 jo6Var = (jo6) entry.getValue();
                                        if (jo6Var.d()) {
                                            jo6Var.O = Boolean.valueOf(S);
                                            for (int i72 = 0; i72 < chatAttachAlertPhotoLayout22.F.getChildCount(); i72++) {
                                                View childAt = chatAttachAlertPhotoLayout22.F.getChildAt(i72);
                                                if (childAt instanceof q68) {
                                                    q68 q68Var = (q68) childAt;
                                                    if (q68Var.getPhotoEntry() == jo6Var) {
                                                        q68Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gda.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout22.y0();
                            }
                            i22Var.I1(true);
                            r7 r7Var32 = i22Var.Z2;
                            hg5 hg5Var = i22Var.a3;
                            if (hg5Var != null) {
                                hg5Var.f(true);
                            }
                            hg5 hg5Var2 = new hg5(i22Var.getContext(), 1);
                            i22Var.a3 = hg5Var2;
                            if (!S) {
                                i62 = 2131748589;
                            } else {
                                i62 = 2131748590;
                            }
                            hg5Var2.t(gm.S2(jb6.M0(i62, null)));
                            i22Var.a3.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                            i22Var.a3.o(1.0f, -((i22Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gm.L(14.0f)));
                            i22Var.a3.setTranslationY(i22Var.X2.getTranslationY());
                            hg5 hg5Var3 = i22Var.a3;
                            hg5Var3.r0 = new lx1(i22Var, hg5Var2, (byte) 5);
                            i22Var.b.addView(hg5Var3, qoe.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            i22Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        a22 a22Var = i22Var.v2;
                        if (a22Var != null) {
                            a22Var.w(40);
                            return;
                        }
                        return;
                    default:
                        i22Var.h3.U(null, null);
                        return;
                }
            }
        });
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout;
        p12Var.setOnLongClickListener(new vn1(this, context, ylbVar, dVar, (byte) 1));
        textPaint.setTextSize(gm.L(12.0f));
        textPaint.setTypeface(gm.o());
        j12 j12Var2 = new j12(this, context, (byte) 1);
        j12Var2.setAlpha(0.0f);
        j12Var2.setScaleX(0.2f);
        j12Var2.setScaleY(0.2f);
        if (z) {
            H0();
            i = -1;
            this.G0 = -1;
        } else {
            i = -1;
        }
        chatAttachAlertPhotoLayout3.F.getFastScroll().a(km0Var3, qqd.n(ylbVar));
        by7 by7Var = new by7(context);
        this.M1 = by7Var;
        this.b.addView(by7Var, qoe.c(-1.0f, i));
        nm0 nm0Var = new nm0(ylbVar);
        nm0Var.e = new s02(this, (byte) 5);
        nm0Var.c = new s02(this, (byte) 6);
        nm0Var.d = new s02(this, (byte) 7);
        nm0Var.b = new s02(this, (byte) 8);
        float N = gm.N(3.3333333f);
        float N2 = gm.N(0.6666667f);
        nm0Var.n = N;
        nm0Var.r = N2;
        float N3 = gm.N(1.0f);
        float N4 = gm.N(0.6666667f);
        nm0Var.f = N3;
        nm0Var.h = N4;
        x20Var.P(km0Var3, nm0Var, false);
        m99Var.h(1L, false);
        this.X0.i(this.b);
        sy4 sy4Var2 = this.X0;
        sy4Var2.a = new s02(this, (byte) 9);
        sy4Var2.d = new cz4(gm.L(48.0f));
    }

    public static boolean b1(TLRPC.User user) {
        if (user != null && !m9c.D(user) && !m9c.v(user) && !m9c.z(user) && !m9c.C(user.id) && !m9c.B(user) && !m9c.u(user) && user.id != 489000 && !oc7.G2(user)) {
            return true;
        }
        return false;
    }

    public static void n1(a22 a22Var) {
        if (a22Var != null) {
            int i = anb.b;
            Object tag = a22Var.getTag(2131296712);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                return;
            }
            a22Var.setTag(2131296712, Integer.valueOf(i));
            try {
                anb.c0(a22Var, true);
                a22Var.d();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override
    public final boolean A0() {
        a22 a22Var = this.v2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (a22Var == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.j1) {
            return true;
        }
        return false;
    }

    public final void A1(a22 a22Var) {
        long j = this.T2;
        q82 q82Var = this.N1;
        if (a22Var == q82Var) {
            j = q82Var.s;
        } else if (a22Var == this.d2) {
            j = 1;
        } else if (a22Var == this.f2) {
            j = 3;
        } else if (a22Var == this.j2) {
            j = 4;
        } else if (a22Var == this.e2) {
            j = 5;
        } else if (a22Var == this.i2) {
            j = 6;
        } else if (a22Var == this.g2) {
            j = 9;
        } else if (a22Var == this.l2) {
            j = 10;
        } else if (a22Var == this.m2) {
            j = 11;
        } else if (a22Var == this.h2) {
            j = 12;
        } else if (a22Var == this.n2) {
            j = 14;
        } else if (a22Var == this.o2) {
            j = 13;
        } else if (a22Var == this.p2) {
            j = 16;
        } else if (a22Var == this.q2) {
            j = 17;
        }
        B1(a22Var, j, true);
    }

    public final void B1(a22 a22Var, long j, boolean z) {
        boolean z2;
        int i;
        m62 m62Var;
        boolean z3;
        Integer num;
        m62 m62Var2;
        Float f;
        int i2;
        boolean z4;
        Float valueOf = Float.valueOf(0.0f);
        if (this.q3 == null && this.J2 == null) {
            a22 a22Var2 = this.v2;
            if (a22Var2 == a22Var) {
                a22Var2.J();
                return;
            }
            int i3 = 0;
            if (a22Var == this.h2 && !z8c.h(this.G3).p()) {
                new kj8(this.Z1, 39, false).show();
                return;
            }
            int i4 = (j > 1L ? 1 : (j == 1L ? 0 : -1));
            if (i4 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.p1.a(z2, z);
            this.r1.h(Long.valueOf(j), z);
            this.A3 = false;
            this.y3 = false;
            this.C3 = 0.0f;
            this.B3.setVisibility(8);
            RadialProgressView radialProgressView = this.z3;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.1f);
            radialProgressView.setScaleY(0.1f);
            radialProgressView.setVisibility(8);
            h12 h12Var = this.u3;
            h12Var.setAlpha(1.0f);
            h12Var.setTranslationY(this.C3);
            int i5 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.u2;
                if (i5 >= longSparseArray.size()) {
                    break;
                }
                ((e32) longSparseArray.valueAt(i5)).setMeasureOffsetY(0);
                i5++;
            }
            this.T2 = j;
            i12 i12Var = this.v3;
            int childCount = i12Var.getChildCount();
            int i6 = 0;
            while (i6 < childCount) {
                View childAt = i12Var.getChildAt(i6);
                if (childAt instanceof c22) {
                    c22 c22Var = (c22) childAt;
                    i2 = childCount;
                    f = valueOf;
                    if (c22Var.b == c22Var.c.T2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    c22Var.a.f(z4, true);
                } else {
                    f = valueOf;
                    i2 = childCount;
                    if (childAt instanceof b22) {
                        ((b22) childAt).a(true);
                    }
                }
                i6++;
                childCount = i2;
                valueOf = f;
            }
            Float f2 = valueOf;
            int firstOffset = (this.v2.getFirstOffset() - gm.L(11.0f)) - this.Y3[0];
            this.w2 = a22Var;
            K0(a22Var);
            if (this.w2.j() != 0) {
                i = 0;
            } else {
                i = 4;
            }
            x20 x20Var = this.U2;
            x20Var.setVisibility(i);
            if (x20Var.o0) {
                x20Var.o(true);
            }
            this.v2.u();
            a22 a22Var3 = this.w2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
            if (a22Var3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.w2.H(this.v2);
            this.w2.setVisibility(0);
            if (a22Var.getParent() != null) {
                this.b.removeView(this.w2);
            }
            int indexOfChild = this.b.indexOfChild(this.v2);
            if (this.w2.getParent() != this.b) {
                n1(this.w2);
                ViewGroup viewGroup = this.b;
                a22 a22Var4 = this.w2;
                if (a22Var4 != this.i2) {
                    indexOfChild++;
                }
                viewGroup.addView(a22Var4, indexOfChild, qoe.c(-1.0f, -1));
            }
            vr0 vr0Var = new vr0(this, (byte) 6);
            a22 a22Var5 = this.v2;
            boolean z5 = a22Var5 instanceof x62;
            t12 t12Var = this.Y1;
            if (!z5 && !(this.w2 instanceof x62)) {
                if (z) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.w2.setAlpha(0.0f);
                    this.w2.setTranslationY(gm.L(78.0f));
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this.v2, View.TRANSLATION_Y, gm.L(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.v2, t12Var, 0.0f, 1.0f), ObjectAnimator.ofFloat(x20Var, View.ALPHA, x20Var.getAlpha(), 0.0f));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(d53.f);
                    animatorSet.addListener(new q12(this, firstOffset, vr0Var, (byte) 0));
                    this.q3 = animatorSet;
                    a22 a22Var6 = this.v2;
                    t12Var.getClass();
                    t12Var.a(a22Var6, f2);
                    animatorSet.start();
                } else {
                    a22Var5.setAlpha(0.0f);
                    vr0Var.run();
                    K1(0);
                    this.b.invalidate();
                }
            } else {
                int max = Math.max(this.w2.getWidth(), this.v2.getWidth());
                a22 a22Var7 = this.w2;
                if (a22Var7 instanceof x62) {
                    a22Var7.setTranslationX(max);
                    a22 a22Var8 = this.v2;
                    if ((a22Var8 instanceof ChatAttachAlertPhotoLayout) && (m62Var2 = ((ChatAttachAlertPhotoLayout) a22Var8).Q) != null) {
                        m62Var2.setVisibility(4);
                    }
                } else {
                    this.v2.setTranslationX(-max);
                    a22 a22Var9 = this.w2;
                    if (a22Var9 == chatAttachAlertPhotoLayout && (m62Var = ((ChatAttachAlertPhotoLayout) a22Var9).Q) != null) {
                        m62Var.setVisibility(0);
                    }
                }
                this.w2.setAlpha(1.0f);
                this.v2.setAlpha(1.0f);
                if (z) {
                    a22 a22Var10 = this.v2;
                    t12Var.getClass();
                    t12Var.a(a22Var10, f2);
                    gm.c3(new co1(this, a22Var, vr0Var, (byte) 13));
                } else {
                    if (this.w2.getCurrentItemTop() <= a22Var.getButtonsHideOffset()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.v2.v(1.0f);
                    this.w2.v(1.0f);
                    this.v2.m(this.i4);
                    this.w2.m(this.i4);
                    this.b.invalidate();
                    this.X0.g();
                    a22 a22Var11 = this.v2;
                    Float valueOf2 = Float.valueOf(1.0f);
                    t12Var.getClass();
                    t12Var.a(a22Var11, valueOf2);
                    if (z3) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    x20Var.setTag(num);
                    vr0Var.run();
                }
            }
            if (this.j4 && !(a22Var instanceof e32)) {
                this.j4 = false;
                x20Var.updateColors();
                x20Var.invalidate();
                d1();
            }
            if (i4 != 0 && j != 6 && j != 17 && !(a22Var instanceof e32)) {
                if (j == 4) {
                    i3 = gm.L(84.0f);
                }
            } else {
                i3 = gm.L(46.0f);
            }
            x20Var.setForcedMenuWidth(i3);
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final void C1(boolean z, Boolean bool) {
        i22 i22Var;
        if (this.g2 == null) {
            i22Var = this;
            v72 v72Var = new v72(i22Var, getContext(), false, this.J0, bool);
            i22Var.g2 = v72Var;
            i22Var.t2[1] = v72Var;
            v72Var.setDelegate(new s02(i22Var, (byte) 17));
        } else {
            i22Var = this;
        }
        i22Var.B1(i22Var.g2, 9L, z);
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        int i2;
        if (i == 0) {
            N0();
            J0();
            return;
        }
        int i3 = 1;
        if (i == 2) {
            J0();
            v72 v72Var = this.g2;
            if (v72Var != null) {
                if (this.w2 != v72Var) {
                    if (this.v2 == v72Var) {
                        i2 = 0;
                    }
                } else {
                    i2 = 1;
                }
                K1(i2);
            }
            v72 v72Var2 = this.h2;
            if (v72Var2 != null) {
                if (this.w2 != v72Var2) {
                    if (this.v2 == v72Var2) {
                        i3 = 0;
                    } else {
                        return;
                    }
                }
                K1(i3);
            }
        } else if (i == 1) {
            J0();
        } else if (i == 3) {
            M0();
        } else if (i == 4) {
            M0();
        } else if (i == 5) {
            M0();
            p12 p12Var = this.F2;
            if (p12Var != null) {
                p12Var.setEphemeralFactor(f);
                p12Var.setSameWidthFactor(f);
            }
        }
    }

    public final void D1(boolean z, boolean z2) {
        Integer num;
        boolean z3;
        float f;
        float f2;
        a22 a22Var;
        float f3;
        float f4;
        float f5;
        int i;
        boolean z4;
        this.n1.a(z, z2);
        x20 x20Var = this.U2;
        Object tag = x20Var.getTag();
        if (z) {
            if (tag == null) {
                num = 1;
            } else {
                return;
            }
        } else if (tag != null) {
            num = null;
        } else {
            return;
        }
        x20Var.setTag(num);
        AnimatorSet animatorSet = this.V2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.V2 = null;
        }
        if (!this.z1 && !this.Q2 && ((this.N2 != 0 || !this.n3) && this.v2 == this.d2 && (this.I3 || this.J3))) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.v2 == this.N1) {
            z3 = false;
        }
        h12 h12Var = this.u3;
        r7 r7Var = this.X2;
        if (z) {
            if (z3) {
                r7Var.setVisibility(0);
                r7Var.setClickable(true);
            }
        } else if (this.P2 && this.A2.getTag() == null) {
            h12Var.setVisibility(0);
        }
        d dVar = this.Z1;
        if (dVar != null) {
            if (z) {
                if (this.e4) {
                    i = cmb.jh;
                } else {
                    i = cmb.g5;
                }
                if (on2.h(cmb.v0(i, this.J0)) > 0.699999988079071d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                gm.l3(this, z4);
            } else {
                gm.l3(this, dVar.isLightStatusBar());
            }
        }
        float f6 = 0.6f;
        float f7 = 0.0f;
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.V2 = animatorSet2;
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            animatorSet2.setDuration(Math.abs(f3 - x20Var.getAlpha()) * 180.0f);
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x20Var, property, f4);
            ofFloat.addUpdateListener(new t02(this, (byte) 4));
            arrayList.add(ofFloat);
            if (z3) {
                if (z) {
                    f7 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(r7Var, property, f7));
                Property property2 = View.SCALE_X;
                if (z) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.6f;
                }
                arrayList.add(ObjectAnimator.ofFloat(r7Var, property2, f5));
                Property property3 = View.SCALE_Y;
                if (z) {
                    f6 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(r7Var, property3, f6));
            }
            this.V2.playTogether(arrayList);
            this.V2.addListener(new y7((byte) 15, this, z));
            this.V2.setInterpolator(d53.h);
            this.V2.setDuration(380L);
            this.V2.start();
            return;
        }
        if (z && this.P2 && ((a22Var = this.v2) == null || a22Var.M())) {
            h12Var.setVisibility(4);
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        x20Var.setAlpha(f);
        if (z3) {
            if (z) {
                f7 = 1.0f;
            }
            r7Var.setAlpha(f7);
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.6f;
            }
            r7Var.setScaleX(f2);
            if (z) {
                f6 = 1.0f;
            }
            r7Var.setScaleY(f6);
        }
        if (!z) {
            r7 r7Var2 = this.b3;
            if (r7Var2 != null) {
                r7Var2.setVisibility(4);
            }
            if (this.N2 != 0 || !this.n3) {
                r7Var.setVisibility(4);
            }
        }
    }

    @Override
    public final boolean E() {
        return this.v2.b();
    }

    public final void E0() {
        if (U0().a.length() <= 0) {
            return;
        }
        this.v2.a(U0().getText());
    }

    public final void E1() {
        float alpha;
        int[] iArr = this.D2;
        k12 k12Var = this.B2;
        k12Var.getLocationOnScreen(iArr);
        if (this.B4 != null) {
            a22 a22Var = this.v2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
            if ((a22Var == chatAttachAlertPhotoLayout || a22Var == this.k2) && this.W1) {
                su suVar = this.L2;
                alpha = (suVar.getAlpha() * suVar.getMeasuredHeight()) + (suVar.getY() - this.B4.getTop());
            } else {
                alpha = -k12Var.getHeight();
            }
            if (Math.abs(this.B4.getTranslationY() - alpha) > 0.5f) {
                this.B4.setTranslationY(alpha);
                this.B4.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.W();
                }
            }
        }
        N0();
    }

    public final boolean F0() {
        d dVar = this.Z1;
        if ((dVar instanceof yv1) && ((yv1) dVar).W4()) {
            return true;
        }
        return false;
    }

    public final void F1(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i22.F1(int):void");
    }

    @Override
    public final void G() {
        AnimatorSet animatorSet = this.A0;
        if (animatorSet != null) {
            animatorSet.cancel();
            zna znaVar = this.m4;
            if (znaVar != null) {
                znaVar.d();
            }
            AnimatorSet animatorSet2 = this.n4;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.A0 = null;
            this.B0 = (byte) 0;
        }
    }

    public final boolean G0(CharSequence charSequence) {
        d dVar = this.Z1;
        if (dVar instanceof yv1) {
            return ChatActivityEnterView.J(this.G3, ((yv1) dVar).a(), dVar, charSequence);
        }
        return false;
    }

    public final void G1() {
        boolean i;
        float f;
        float f2;
        float f3;
        a22 a22Var = this.v2;
        int i2 = 0;
        if (a22Var == null) {
            i = false;
        } else {
            i = a22Var.i();
        }
        t8 t8Var = this.c3;
        t8Var.setEnabled(i);
        a22 a22Var2 = this.v2;
        float f4 = 0.5f;
        if (a22Var2 != null) {
            if (a22Var2.i()) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            if (this.w2 == null) {
                f3 = 1.0f;
            } else {
                f3 = this.X1;
            }
            f = (f2 * f3) + 0.0f;
        } else {
            f = 0.0f;
        }
        a22 a22Var3 = this.w2;
        if (a22Var3 != null) {
            if (a22Var3.i()) {
                f4 = 1.0f;
            }
            f = td4.A(1.0f, this.X1, f4, f);
        }
        this.d3 = f;
        if (t8Var != null) {
            float f5 = f * this.e3;
            t8Var.setAlpha(f5);
            if (f5 <= 0.0f) {
                i2 = 4;
            }
            t8Var.setVisibility(i2);
        }
    }

    @Override
    public void H() {
        g22 g22Var = this.W3;
        if (g22Var != null) {
            g22Var.a1(new vr0(this, (byte) 5));
        } else {
            o1();
        }
    }

    public final void H0() {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        i12 i12Var = this.v3;
        if (i12Var == null) {
            return;
        }
        int childCount = i12Var.getChildCount();
        boolean z2 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            i12Var.getChildAt(i9);
        }
        boolean z3 = this.e4;
        if (z3) {
            i = cmb.Xg;
        } else {
            i = cmb.i5;
        }
        anb.X(this.g3, i, this.J0);
        if (z3) {
            i2 = cmb.Xg;
        } else {
            i2 = cmb.i5;
        }
        anb.X(this.l3, i2, this.J0);
        anb.X(this.c3, cmb.Ii, this.J0);
        if (z3) {
            i3 = cmb.Xg;
        } else {
            i3 = cmb.i5;
        }
        int v0 = cmb.v0(i3, this.J0);
        if (this.q4 && v0 == this.p4) {
            z = false;
        } else {
            z = true;
        }
        this.q4 = true;
        this.p4 = v0;
        r7 r7Var = this.X2;
        if (z) {
            r7Var.setIconColor(v0);
        }
        Drawable background = r7Var.getBackground();
        if (z3) {
            i4 = cmb.Yg;
        } else {
            i4 = cmb.H5;
        }
        cmb.A1(cmb.v0(i4, this.J0), background);
        int i10 = cmb.D8;
        r7Var.O(cmb.v0(i10, this.J0), false);
        r7Var.O(cmb.v0(i10, this.J0), true);
        r7Var.I(cmb.v0(cmb.F8, this.J0));
        r7 r7Var2 = this.Z2;
        if (r7Var2 != null && z) {
            r7Var2.setIconColor(v0);
        }
        r7 r7Var3 = this.b3;
        if (r7Var3 != null) {
            if (z) {
                r7Var3.setIconColor(v0);
            }
            Drawable background2 = r7Var3.getBackground();
            if (z3) {
                i8 = cmb.Yg;
            } else {
                i8 = cmb.H5;
            }
            cmb.A1(cmb.v0(i8, this.J0), background2);
        }
        k12 k12Var = this.B2;
        ylb ylbVar = k12Var.N;
        wu3 wu3Var = k12Var.a;
        int i11 = k12Var.M;
        if (i11 == 0) {
            wu3Var.setHintTextColor(cmb.v0(cmb.G6, ylbVar));
            int i12 = cmb.F6;
            wu3Var.setCursorColor(cmb.v0(i12, ylbVar));
            wu3Var.setTextColor(cmb.v0(i12, ylbVar));
        } else if (i11 != 2 && i11 != 3) {
            wu3Var.setHintTextColor(cmb.v0(cmb.s5, ylbVar));
            wu3Var.setTextColor(cmb.v0(cmb.i5, ylbVar));
        } else {
            wu3Var.setHintTextColor(-1929379841);
            wu3Var.setTextColor(-1);
            wu3Var.setCursorColor(-1);
            wu3Var.setHandlesColor(-1);
            wu3Var.setHighlightColor(822083583);
            wu3Var.E = -1;
        }
        k12Var.c.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.Ne, ylbVar), PorterDuff.Mode.MULTIPLY));
        xu3 xu3Var = k12Var.d;
        if (xu3Var != null) {
            xu3Var.updateColors();
        }
        anb.l(i12Var, 21, cmb.z5, this.J0);
        if (z3) {
            i5 = cmb.Xg;
        } else {
            i5 = cmb.i5;
        }
        ylb ylbVar2 = this.J0;
        x20 x20Var = this.U2;
        anb.l(x20Var, 1, i5, ylbVar2);
        if (z3) {
            i6 = cmb.Yg;
        } else {
            i6 = cmb.H5;
        }
        anb.l(x20Var, 3, i6, this.J0);
        if (z3) {
            i7 = cmb.Xg;
        } else {
            i7 = cmb.i5;
        }
        anb.l(x20Var, 5, i7, this.J0);
        int Y0 = Y0(false);
        cmb.A1(Y0, this.s0);
        kz4 kz4Var = this.D4;
        if (kz4Var.b != Y0) {
            kz4Var.a(Y0);
            e02 e02Var = this.s3;
            if (e02Var != null) {
                e02Var.invalidate();
            }
            j12 j12Var = this.t3;
            if (j12Var != null) {
                j12Var.invalidate();
            }
        }
        this.b.invalidate();
        int i13 = 0;
        while (true) {
            a22[] a22VarArr = this.t2;
            if (i13 >= a22VarArr.length) {
                break;
            }
            a22 a22Var = a22VarArr[i13];
            if (a22Var != null) {
                a22Var.d();
            }
            i13++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            this.H0 = cmb.v0(cmb.h5, this.J0);
            gm.o3(this, cmb.v0(cmb.g5, this.J0), false, null);
            if (gm.B(this.H0) > 0.721d) {
                z2 = true;
            }
            gm.i3(this, z2);
            return;
        }
        L(cmb.g5);
    }

    public final void H1(a22 a22Var, int i) {
        boolean z;
        int i2;
        int i3;
        if (a22Var != null) {
            mr3 mr3Var = this.C4;
            if (mr3Var != null && Build.VERSION.SDK_INT >= 31) {
                mr3Var.f(0.0f, i);
            }
            int currentItemTop = a22Var.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z2 = false;
                if (a22Var == this.v2 && currentItemTop <= a22Var.getButtonsHideOffset()) {
                    z = true;
                } else {
                    z = false;
                }
                this.L1 = z;
                if (a22Var == this.v2) {
                    D1(z, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a22Var.getLayoutParams();
                if (layoutParams == null) {
                    i2 = 0;
                } else {
                    i2 = layoutParams.topMargin;
                }
                int z3 = b10.z(11.0f, i2, currentItemTop);
                a22 a22Var2 = this.v2;
                if (a22Var2 == a22Var) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                if ((a22Var2 instanceof x62) || (this.w2 instanceof x62)) {
                    Object obj = this.q3;
                    if ((obj instanceof zna) && ((zna) obj).f) {
                        z2 = true;
                    }
                }
                int[] iArr = this.Y3;
                int i4 = iArr[i3];
                if (i4 == z3 && !z2) {
                    if (i != 0) {
                        this.Z3 = i4;
                        return;
                    }
                    return;
                }
                this.Z3 = i4;
                iArr[i3] = z3;
                K1(i3);
                this.b.invalidate();
            }
        }
    }

    @Override
    public final void I(int i) {
        super.I(i);
        this.v2.r(i);
    }

    public final void I0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i22.I0(boolean):void");
    }

    public final void I1(boolean z) {
        tl2 tl2Var;
        boolean z2;
        float f;
        float f2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (chatAttachAlertPhotoLayout != null && (tl2Var = this.Y2) != null) {
            int i = 0;
            if (this.n3 && this.c2 && this.v2 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.e0()) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = !ChatAttachAlertPhotoLayout.S();
            tl2Var.f = z3;
            if (!z) {
                ((ln) tl2Var.g).a(z3);
            }
            tl2Var.invalidateSelf();
            float f3 = 0.0f;
            float f4 = 0.6f;
            r7 r7Var = this.Z2;
            if (z && this.n3) {
                r7Var.setVisibility(0);
                ViewPropertyAnimator animate = r7Var.animate();
                if (z2) {
                    f3 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f3);
                if (z2) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.6f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f2);
                if (z2) {
                    f4 = 1.0f;
                }
                scaleX.scaleY(f4).setDuration(320L).setInterpolator(d53.h).withEndAction(new c12(this, z2, (byte) 0)).start();
                return;
            }
            if (!z2) {
                i = 8;
            }
            r7Var.setVisibility(i);
            if (z2) {
                f3 = 1.0f;
            }
            r7Var.setAlpha(f3);
            if (z2) {
                f = 1.0f;
            } else {
                f = 0.6f;
            }
            r7Var.setScaleX(f);
            if (z2) {
                f4 = 1.0f;
            }
            r7Var.setScaleY(f4);
        }
    }

    public final void J0() {
        float f = this.m1.e;
        float f2 = (1.0f - this.l1.e) * f;
        float min = Math.min(Math.min(1.0f, 1.0f - ((1.0f - f) * (1.0f - this.n1.e))), 1.0f - f2);
        this.t3.setTranslationY(gm.L(48.0f) * min);
    }

    public final void J1(boolean z) {
        boolean z2;
        float f;
        a22 a22Var = this.d2;
        if (z) {
            if (!this.G1) {
                return;
            }
            if (this.k2 == null) {
                Context context = getContext();
                ylb ylbVar = this.s1;
                if (ylbVar == null) {
                    ylbVar = this.J0;
                }
                ?? a22Var2 = new a22(this, ylbVar, context);
                a22Var2.E = 0.0f;
                a22Var2.F = 0.0f;
                a22Var2.G = 0.0f;
                a22Var2.H = 0.0f;
                a22Var2.I = 0.0f;
                a22Var2.J = 0.0f;
                a22Var2.K = null;
                a22Var2.L = false;
                a22Var2.N = 0.0f;
                a22Var2.R = false;
                a22Var2.T = false;
                Point point = gm.q;
                if (point.y > point.x) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                a22Var2.U = z2;
                a22Var2.n = ylbVar;
                a22Var2.f = true;
                a22Var2.setWillNotDraw(false);
                i22 i22Var = a22Var2.b;
                r6 t = i22Var.U2.t();
                TextView textView = new TextView(context);
                a22Var2.y = textView;
                ylb ylbVar2 = a22Var2.a;
                h62 h62Var = new h62(a22Var2, context, t, ylbVar2, (byte) 1);
                x20 x20Var = i22Var.U2;
                if (gm.O1()) {
                    f = 64.0f;
                } else {
                    f = 56.0f;
                }
                x20Var.addView(h62Var, 0, qoe.d(-2, -1.0f, 51, f, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                anb.X(textView, cmb.i5, ylbVar2);
                textView.setText(jb6.M0(2131753923, null));
                textView.setTypeface(gm.o());
                textView.setCompoundDrawablePadding(gm.L(4.0f));
                textView.setPadding(0, 0, gm.L(10.0f), 0);
                textView.setAlpha(0.0f);
                h62Var.addView(textView, qoe.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                fv fvVar = new fv(a22Var2, context, ylbVar2, (byte) 10);
                a22Var2.r = fvVar;
                fvVar.setAdapter(new js(a22Var2, (byte) 3));
                u46 u46Var = new u46(1, false);
                a22Var2.s = u46Var;
                fvVar.setLayoutManager(u46Var);
                fvVar.setClipChildren(false);
                fvVar.setClipToPadding(false);
                fvVar.setOverScrollMode(2);
                fvVar.setVerticalScrollBarEnabled(false);
                w62 w62Var = new w62(a22Var2, context);
                a22Var2.w = w62Var;
                w62Var.setClipToPadding(true);
                w62Var.setClipChildren(true);
                a22Var2.addView(fvVar, qoe.c(-1.0f, -1));
                a22Var2.Q = i22Var.d2;
                w62Var.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = a22Var2.Q;
                w62Var.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                w62Var.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                w62Var.c();
                UndoView undoView = new UndoView(context, null, false, i22Var.s1);
                a22Var2.x = undoView;
                undoView.setEnterOffsetMargin(gm.L(32.0f));
                a22Var2.addView(undoView, qoe.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                a22Var2.O = context.getResources().getDrawable(2131232566);
                this.k2 = a22Var2;
                a22Var2.bringToFront();
            }
            a22 a22Var3 = this.v2;
            x62 x62Var = this.k2;
            if (a22Var3 != x62Var) {
                a22Var = x62Var;
            }
            A1(a22Var);
            return;
        }
        A1(a22Var);
    }

    public final void K0(a22 a22Var) {
        int L;
        boolean e = a22Var.e();
        int i = 0;
        e02 e02Var = this.s3;
        if (e02Var != null) {
            if (e) {
                L = 0;
            } else {
                L = gm.L(48.0f);
            }
            e02Var.setFadeHeightBottom(L);
        }
        j12 j12Var = this.t3;
        if (j12Var != null) {
            if (e) {
                i = 4;
            }
            j12Var.setVisibility(i);
        }
    }

    public final void K1(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i22.K1(int):void");
    }

    public final void L0() {
        x20 x20Var;
        boolean z;
        boolean o;
        int i;
        e02 e02Var = this.s3;
        if (e02Var != null && (x20Var = this.U2) != null) {
            a22 a22Var = this.w2;
            if (a22Var == null) {
                a22Var = this.v2;
            }
            int i2 = 0;
            if (a22Var != null && a22Var.f()) {
                z = true;
            } else {
                z = false;
            }
            ylb ylbVar = this.J0;
            if (ylbVar != null) {
                o = ylbVar.a();
            } else {
                o = cmb.I.o();
            }
            if (!z && x20Var.getVisibility() == 0) {
                if (o) {
                    i = 255;
                } else {
                    i = 160;
                }
                i2 = (int) (x20Var.getAlpha() * i);
            }
            e02Var.setFadeTopAlpha(i2);
        }
    }

    public final void L1() {
        int i = 0;
        K1(0);
        this.o3.invalidate();
        su suVar = this.L2;
        suVar.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (chatAttachAlertPhotoLayout != null) {
            d62 d62Var = chatAttachAlertPhotoLayout.F;
            chatAttachAlertPhotoLayout.W();
            if (d62Var != null && d62Var.getFastScroll() != null) {
                y49 fastScroll = d62Var.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.q1;
                if (this.W1) {
                    i = (int) (suVar.getAlpha() * suVar.getMeasuredHeight());
                }
                fastScroll.i0 = currentActionBarHeight + i;
                d62Var.getFastScroll().invalidate();
            }
        }
        E1();
        N0();
    }

    public final void M0() {
        float f;
        float f2 = this.o1.e;
        float f3 = this.p1.e;
        float a = aie.a(this.q1.e);
        if (this.O3) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        wp4.d(this.C2, mlb.C(f2, f3, a, f));
    }

    public final void N0() {
        p12 p12Var = this.F2;
        h12 h12Var = this.E2;
        su suVar = this.L2;
        if (suVar != null && suVar.getVisibility() == 0 && suVar.getAlpha() != 0.0f) {
            float f = this.l1.e;
            float abs = Math.abs(gm.R1(-1.0f, 1.0f, f));
            p12Var.setAlpha(abs * abs * abs * abs);
            h12Var.setTranslationY(gm.R1(this.d4, ((suVar.getTranslationY() + suVar.getTop()) - h12Var.getTop()) + gm.L(8.0f), d53.j.getInterpolation(f)));
            return;
        }
        h12Var.setTranslationY(this.d4);
        p12Var.setAlpha(1.0f);
    }

    public final void O0() {
        lc1 lc1Var = new lc1(this, getContext(), this.T1, LaunchActivity.Q(), this.J0, (byte) 1);
        this.B4 = lc1Var;
        lc1Var.p(new k6d(this, (byte) 19));
        ViewGroup viewGroup = this.b;
        viewGroup.addView(this.B4, viewGroup.indexOfChild(this.A2), qoe.e(-1, -1, 83));
        lc1 lc1Var2 = this.B4;
        lc1Var2.getAdapter().c = false;
        lc1Var2.getAdapter().d = false;
        lc1Var2.getAdapter().e = false;
        d dVar = this.Z1;
        boolean z = true;
        if (dVar instanceof yv1) {
            lc1Var2.getAdapter().n0 = false;
            yv1 yv1Var = (yv1) dVar;
            k17 adapter = lc1Var2.getAdapter();
            yv1Var.h();
            TLRPC.Chat chat = yv1Var.e;
            adapter.getClass();
            adapter.m0 = chat;
            lc1Var2.getAdapter().V(yv1Var.r8);
            k17 adapter2 = lc1Var2.getAdapter();
            if (yv1Var.e == null) {
                z = false;
            }
            adapter2.f0 = z;
        } else {
            lc1Var2.getAdapter().n0 = true;
            lc1Var2.getAdapter().V(null);
            lc1Var2.getAdapter().f0 = false;
        }
        lc1Var2.getAdapter().g0 = false;
        E1();
    }

    public final void P0(int i) {
        this.P2 = true;
        this.u3.setVisibility(0);
        this.B1 = true;
        this.C1 = i;
        this.N2 = (byte) 0;
        this.z1 = false;
        this.A1 = false;
        this.D1 = null;
        r7 r7Var = this.h3;
        if (r7Var != null) {
            this.g3.setTranslationY(0.0f);
            r7Var.setVisibility(8);
        }
    }

    public final void Q0(f fVar) {
        String M0 = jb6.M0(2131752059, null);
        TextView textView = this.g3;
        textView.setText(M0);
        this.P2 = false;
        this.u3.setVisibility(8);
        this.N2 = (byte) 1;
        this.z1 = true;
        this.A1 = true;
        this.c2 = false;
        this.D1 = fVar;
        r7 r7Var = this.h3;
        if (r7Var != null) {
            textView.setTranslationY(-gm.L(8.0f));
            r7Var.setVisibility(0);
            r7Var.setClickable(true);
            r7Var.setAlpha(1.0f);
            r7Var.setScaleX(1.0f);
            r7Var.setScaleY(1.0f);
        }
    }

    @Override
    public final ArrayList R() {
        ArrayList<cnb> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            a22[] a22VarArr = this.t2;
            if (i < a22VarArr.length) {
                a22 a22Var = a22VarArr[i];
                if (a22Var != null && (themeDescriptions = a22Var.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i++;
            } else {
                arrayList.add(new cnb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.h5));
                return arrayList;
            }
        }
    }

    public final int R0() {
        o47 o47Var;
        m47 m47Var;
        d dVar = this.Z1;
        if (!(dVar instanceof yv1) || (o47Var = ((yv1) dVar).x5) == null || (m47Var = o47Var.b) == null) {
            return 0;
        }
        return m47Var.g.size();
    }

    public final TLRPC.Chat S0() {
        d dVar = this.Z1;
        if (dVar instanceof yv1) {
            return ((yv1) dVar).e;
        }
        return oc7.r1(this.G3).L0(Long.valueOf(-this.T1));
    }

    public final float T0() {
        h12 h12Var = this.A2;
        float alpha = 1.0f - h12Var.getAlpha();
        return h12Var.getMeasuredHeight() - (alpha * (h12Var.getMeasuredHeight() - gm.L(84.0f)));
    }

    public final cv3 U0() {
        a22 a22Var;
        if (this.W1 && ((a22Var = this.v2) == this.d2 || a22Var == this.k2)) {
            return this.M2;
        }
        return this.B2;
    }

    public final long V0() {
        d dVar = this.Z1;
        if (dVar instanceof yv1) {
            return ((yv1) dVar).a();
        }
        return this.T1;
    }

    public final int W0() {
        a22 a22Var = this.v2;
        v72 v72Var = this.g2;
        if (a22Var == v72Var && v72Var.F != null) {
            return v72Var.getEmojiPadding();
        }
        v72 v72Var2 = this.h2;
        if (a22Var == v72Var2 && v72Var2.F != null) {
            return v72Var2.getEmojiPadding();
        }
        if (this.W1) {
            return this.M2.getEmojiPadding();
        }
        return this.B2.getEmojiPadding();
    }

    public final int X0(int i) {
        a22 a22Var = this.w2;
        int[] iArr = this.Y3;
        if (a22Var != null && ((this.v2 instanceof x62) || (a22Var instanceof x62))) {
            return gm.U1(this.X1, iArr[0], iArr[1]);
        }
        return iArr[i];
    }

    public final int Y0(boolean z) {
        boolean o;
        int i;
        x20 x20Var;
        if (this.e4) {
            return cmb.v0(cmb.jh, this.J0);
        }
        ylb ylbVar = this.J0;
        if (ylbVar != null) {
            o = ylbVar.a();
        } else {
            o = cmb.I.o();
        }
        Iterator it = this.r1.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            u66 u66Var = (u66) it.next();
            long longValue = ((Long) u66Var.a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f += u66Var.c();
            }
        }
        float a = pqe.a(f, 0.0f, 1.0f);
        if (z && (x20Var = this.U2) != null && x20Var.getVisibility() == 0) {
            a *= 1.0f - x20Var.getAlpha();
        }
        int v0 = cmb.v0(cmb.g5, this.J0);
        if (o) {
            i = cmb.Z6;
        } else {
            i = cmb.h5;
        }
        return on2.f(a, v0, cmb.v0(i, this.J0));
    }

    public final void Z0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i22.Z0():void");
    }

    @Override
    public final void a(boolean z) {
        if (z) {
            this.A4 = z;
        }
        dismiss();
    }

    public final boolean a1() {
        if (this.W1) {
            a22 a22Var = this.v2;
            if (a22Var == this.d2 || a22Var == this.k2) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean c0(MotionEvent motionEvent) {
        return this.v2.o(motionEvent);
    }

    public final void c1(EditTextBoldCursor editTextBoldCursor, boolean z) {
        long j;
        g22 g22Var = this.W3;
        if (g22Var != null && !this.r3) {
            boolean B = g22Var.B();
            this.r3 = true;
            np6 np6Var = new np6(this, editTextBoldCursor, z, (byte) 12);
            if (B) {
                j = 200;
            } else {
                j = 0;
            }
            gm.d3(np6Var, j);
        }
    }

    public final void d1() {
        if (this.s0 != null && this.b != null) {
            int Y0 = Y0(false);
            cmb.A1(Y0, this.s0);
            kz4 kz4Var = this.D4;
            if (kz4Var.b != Y0) {
                kz4Var.a(Y0);
                e02 e02Var = this.s3;
                if (e02Var != null) {
                    e02Var.invalidate();
                }
                j12 j12Var = this.t3;
                if (j12Var != null) {
                    j12Var.invalidate();
                }
            }
            G1();
            this.b.invalidate();
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != nm7.T0 && i != nm7.a5 && i != nm7.F1) {
            if (i == nm7.j5) {
                this.E1 = oc7.r1(z8c.t0).G0();
                return;
            }
            return;
        }
        f22 f22Var = this.x3;
        if (f22Var != null) {
            f22Var.f();
        }
    }

    @Override
    public final void dismiss() {
        boolean z;
        m12 m12Var;
        k12 k12Var;
        if (!this.v2.q() && !this.J) {
            a22 a22Var = this.v2;
            c52 c52Var = this.q2;
            if (a22Var == c52Var && c52Var != null && !c52Var.L && c52Var.Q0 != null) {
                z = true;
            } else {
                z = false;
            }
            this.r2 = z;
            if (!z && (k12Var = this.B2) != null) {
                gm.t1(k12Var.getEditText());
            }
            if (!this.r2 && (m12Var = this.M2) != null) {
                gm.t1(m12Var.getEditText());
            }
            this.u2.clear();
            d dVar = this.Z1;
            if (dVar == null) {
                dVar = LaunchActivity.Q();
            }
            if (!this.A4 && dVar != null && this.v2.getSelectedItemsCount() > 0 && !this.z1) {
                if (!this.z4) {
                    this.z4 = true;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, dVar.getParentActivity());
                    String M0 = jb6.M0(2131751336, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    heVar.U = jb6.M0(2131751337, null);
                    alertDialog$Builder.j(jb6.M0(2131751343, null), new s02(this, (byte) 1));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                    heVar.setOnCancelListener(new ct0(this, (byte) 3));
                    heVar.O = new n1(this, (byte) 14);
                    heVar.show();
                    TextView textView = (TextView) heVar.c(-1);
                    if (textView != null) {
                        anb.X(textView, cmb.p7, this.J0);
                        return;
                    }
                    return;
                }
                return;
            }
            int i = 0;
            while (true) {
                a22[] a22VarArr = this.t2;
                if (i >= a22VarArr.length) {
                    break;
                }
                a22 a22Var2 = a22VarArr[i];
                if (a22Var2 != null && this.v2 != a22Var2) {
                    a22Var2.q();
                }
                i++;
            }
            gm.o3(this, on2.p(cmb.v0(cmb.Z6, this.J0), 0), true, new s02(this, (byte) 11));
            if (dVar != null) {
                gm.l3(this, dVar.isLightStatusBar());
            }
            this.f4 = false;
            super.dismiss();
            this.A4 = false;
        }
    }

    public final void e1() {
        int i = 0;
        while (true) {
            a22[] a22VarArr = this.t2;
            if (i >= a22VarArr.length) {
                break;
            }
            a22 a22Var = a22VarArr[i];
            if (a22Var != null) {
                a22Var.p();
            }
            i++;
        }
        int i2 = this.G3;
        nm7.f(i2).n(this, nm7.T0);
        nm7.f(i2).n(this, nm7.a5);
        nm7.f(i2).n(this, nm7.j5);
        nm7.f(i2).n(this, nm7.F1);
        this.P1 = true;
        k12 k12Var = this.B2;
        if (k12Var != null) {
            k12Var.o();
        }
        m12 m12Var = this.M2;
        if (m12Var != null) {
            m12Var.o();
        }
    }

    public final void f1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String r;
        if (tL_attachMenuBot != null) {
            r = tL_attachMenuBot.short_name;
        } else {
            r = m9c.r(user);
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = hs6.d0(this.G3).b.bots;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i);
            i++;
            if (tL_attachMenuBot2.bot_id == user.id) {
                break;
            }
        }
        String a0 = jb6.a0("BotRemoveFromMenu", null, 2131752955, r);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = jb6.M0(2131752954, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        if (tL_attachMenuBot == null) {
            a0 = jb6.a0("BotRemoveInlineFromMenu", null, 2131752953, r);
        }
        heVar.U = gm.S2(a0);
        alertDialog$Builder.j(jb6.M0(2131747564, "OK"), new jf(this, tL_attachMenuBot, user, (byte) 20));
        wi8.y("Cancel", 2131752542, alertDialog$Builder, null);
    }

    @Override
    public final boolean g0() {
        TL_wallet.walletTransaction wallettransaction;
        final c52 c52Var = this.q2;
        if (c52Var != null && this.v2 == c52Var) {
            final vr0 vr0Var = new vr0(this, (byte) 2);
            int i = c52Var.n;
            qrc qrcVar = c52Var.S;
            i22 i22Var = c52Var.b;
            AnimatorSet animatorSet = null;
            if (!c52Var.L && (wallettransaction = c52Var.Q0) != null && c52Var.R0 == null && c52Var.S0 == null) {
                if (c52Var.T0) {
                    goc gocVar = new goc();
                    gocVar.setCurrentAccount(i);
                    d dVar = i22Var.Z1;
                    if (dVar != null && dVar.presentFragment(gocVar, false, true)) {
                        esc escVar = new esc(i22Var.c, i22Var.b, qrcVar.getDiamondView(), gocVar, c52Var.Q0, new Runnable() {
                            @Override
                            public final void run() {
                                byte b = r3;
                                vr0 vr0Var2 = vr0Var;
                                c52 c52Var2 = c52Var;
                                switch (b) {
                                    case 0:
                                        if (!c52Var2.L) {
                                            vr0Var2.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!c52Var2.L) {
                                            vr0Var2.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, i22Var);
                        c52Var.S0 = escVar;
                        animatorSet = escVar.m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    npc diamondView = qrcVar.getDiamondView();
                    if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        d dVar2 = i22Var.Z1;
                        if (dVar2 instanceof yv1) {
                            yv1 yv1Var = (yv1) dVar2;
                            if (yv1Var.getCurrentAccount() == i && yv1Var.a() == c52Var.r.id && yv1Var.g4 == 0 && yv1Var.getFragmentView() != null && yv1Var.getFragmentView().isAttachedToWindow()) {
                                apc apcVar = new apc(i22Var.c, i22Var.b, qrcVar.getDiamondView(), yv1Var, c52Var.Q0, new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r3;
                                        vr0 vr0Var2 = vr0Var;
                                        c52 c52Var2 = c52Var;
                                        switch (b) {
                                            case 0:
                                                if (!c52Var2.L) {
                                                    vr0Var2.run();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (!c52Var2.L) {
                                                    vr0Var2.run();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, i22Var);
                                c52Var.R0 = apcVar;
                                animatorSet = apcVar.m;
                            }
                        }
                    }
                }
            }
            if (animatorSet != null) {
                this.A0 = animatorSet;
                this.B0 = (byte) 2;
                return true;
            }
        }
        return false;
    }

    public final void g1() {
        int i = 0;
        while (true) {
            a22[] a22VarArr = this.t2;
            if (i < a22VarArr.length) {
                a22 a22Var = a22VarArr[i];
                if (a22Var != null) {
                    a22Var.A();
                }
                i++;
            } else {
                this.c4 = true;
                return;
            }
        }
    }

    @Override
    public final boolean h0(View view, int i, int i2, int i3, int i4) {
        boolean z;
        int L;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        b1d b1dVar = chatAttachAlertPhotoLayout.m0;
        yd ydVar = chatAttachAlertPhotoLayout.k0;
        d62 d62Var = chatAttachAlertPhotoLayout.r;
        TextView textView = chatAttachAlertPhotoLayout.q0;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 < i6) {
            z = true;
        } else {
            z = false;
        }
        int i7 = gm.n;
        if (view == ydVar) {
            if (z) {
                if (d62Var.getVisibility() == 0) {
                    ydVar.layout(0, kt6.y(222.0f, i4, i7), i5, kt6.y(96.0f, i4, i7));
                    return true;
                }
                ydVar.layout(0, kt6.y(126.0f, i4, i7), i5, i4 - i7);
                return true;
            } else if (d62Var.getVisibility() == 0) {
                ydVar.layout(kt6.y(222.0f, i3, i7), 0, i3 - gm.L(96.0f), i6 - i7);
                return true;
            } else {
                ydVar.layout(kt6.y(126.0f, i3, i7), 0, i3, i6 - i7);
                return true;
            }
        } else if (view == b1dVar) {
            if (z) {
                if (d62Var.getVisibility() == 0) {
                    b1dVar.layout(0, kt6.y(310.0f, i4, i7), i5, kt6.y(260.0f, i4, i7));
                    return true;
                }
                b1dVar.layout(0, kt6.y(176.0f, i4, i7), i5, kt6.y(126.0f, i4, i7));
                return true;
            } else if (d62Var.getVisibility() == 0) {
                b1dVar.layout(kt6.y(310.0f, i3, i7), 0, i3 - gm.L(260.0f), i6 - i7);
                return true;
            } else {
                b1dVar.layout(kt6.y(176.0f, i3, i7), 0, i3 - gm.L(126.0f), i6 - i7);
                return true;
            }
        } else if (view == textView) {
            if (z) {
                L = (i5 - textView.getMeasuredWidth()) / 2;
                int L2 = i4 - gm.L(167.0f);
                textView.setRotation(0.0f);
                if (d62Var.getVisibility() == 0) {
                    L2 -= gm.L(96.0f);
                }
                measuredWidth = L2 - i7;
            } else {
                L = i3 - gm.L(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i6 / 2);
                textView.setRotation(-90.0f);
                if (d62Var.getVisibility() == 0) {
                    L -= gm.L(96.0f);
                }
            }
            textView.layout(L, measuredWidth, textView.getMeasuredWidth() + L, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != d62Var) {
            return false;
        } else {
            if (z) {
                int y = kt6.y(88.0f, i6, i7);
                view.layout(0, y, view.getMeasuredWidth(), view.getMeasuredHeight() + y);
                return true;
            }
            int L3 = (i + i5) - gm.L(88.0f);
            view.layout(L3, 0, view.getMeasuredWidth() + L3, view.getMeasuredHeight());
            return true;
        }
    }

    public final void h1() {
        int i = 0;
        this.c4 = false;
        while (true) {
            a22[] a22VarArr = this.t2;
            if (i >= a22VarArr.length) {
                break;
            }
            a22 a22Var = a22VarArr[i];
            if (a22Var != null) {
                a22Var.C();
            }
            i++;
        }
        if (isShowing()) {
            this.W3.B();
        }
        f22 f22Var = this.x3;
        if (f22Var != null) {
            f22Var.f();
        }
    }

    @Override
    public final boolean i0(View view, int i, int i2) {
        boolean z;
        WindowInsets windowInsets;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        p62 p62Var = chatAttachAlertPhotoLayout.w;
        i22 i22Var = chatAttachAlertPhotoLayout.b;
        d62 d62Var = chatAttachAlertPhotoLayout.r;
        zs zsVar = chatAttachAlertPhotoLayout.s;
        int i3 = 0;
        if (i < i2) {
            z = true;
        } else {
            z = false;
        }
        if (view == chatAttachAlertPhotoLayout.Q) {
            if (chatAttachAlertPhotoLayout.c0 && !chatAttachAlertPhotoLayout.e0) {
                int Q = i22Var.Q() + i;
                if (i22Var.h != null) {
                    i3 = (int) (windowInsets.getSystemWindowInsetRight() * 1.0f);
                }
                chatAttachAlertPhotoLayout.Q.measure(View.MeasureSpec.makeMeasureSpec(i3 + Q, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
                return true;
            }
        } else {
            yd ydVar = chatAttachAlertPhotoLayout.k0;
            if (view == ydVar) {
                if (z) {
                    ydVar.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(126.0f), 1073741824));
                    return true;
                }
                ydVar.measure(View.MeasureSpec.makeMeasureSpec(gm.L(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
                return true;
            }
            b1d b1dVar = chatAttachAlertPhotoLayout.m0;
            if (view == b1dVar) {
                if (z) {
                    b1dVar.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), 1073741824));
                    return true;
                }
                b1dVar.measure(View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
                return true;
            } else if (view == d62Var) {
                chatAttachAlertPhotoLayout.K0 = true;
                if (z) {
                    d62Var.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(80.0f), 1073741824));
                    if (zsVar.o) {
                        d62Var.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                        zsVar.i1(0);
                        p62Var.f();
                    }
                } else {
                    d62Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
                    if (!zsVar.o) {
                        d62Var.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
                        zsVar.i1(1);
                        p62Var.f();
                    }
                }
                chatAttachAlertPhotoLayout.K0 = false;
                return true;
            }
        }
        return false;
    }

    public final void i1() {
        k47 k47Var = this.E3;
        d dVar = this.Z1;
        int i = this.G3;
        if (k47Var != null && k47Var.o5() && !sd2.z(i, 24, k47.B0(this.E3.k)) && (dVar instanceof yv1)) {
            yv1 yv1Var = (yv1) dVar;
            v67 v67Var = yv1Var.y5;
            if (v67Var == null) {
                v67Var = v67.b(this.E3.k.suggested_post);
            }
            if (!jva.Q(i, v67Var.a)) {
                yv1Var.wc(v67Var);
                return;
            }
        }
        if (this.E1 - this.F1 < 0) {
            gm.z3(this.t1);
            gm.z3(this.u1);
            try {
                this.F2.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!oc7.r1(i).H3() && oc7.r1(i).l4.h1.f() > this.F1) {
                y1(dVar);
                return;
            }
            return;
        }
        if (this.E3 == null && (dVar instanceof yv1)) {
            yv1 yv1Var2 = (yv1) dVar;
            if (yv1Var2.X7()) {
                ik.J(getContext(), yv1Var2.a(), new s02(this, (byte) 14), this.J0);
                return;
            }
        }
        a22 a22Var = this.v2;
        if (a22Var != this.d2 && a22Var != this.k2) {
            if (!a22Var.K(true, 0, 0, this.K2, a1())) {
                this.A4 = true;
                dismiss();
                return;
            }
            return;
        }
        p1(true, 0, 0, this.K2, a1());
    }

    @Override
    public final boolean j0() {
        int i;
        this.d2.setTranslationX(0.0f);
        this.k3.setAlpha(0.0f);
        this.i3.setAlpha(1.0f);
        this.b.setTranslationY(this.b.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.n4 = animatorSet;
        t12 t12Var = this.l4;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, t12Var, 0.0f, 400.0f));
        this.n4.setDuration(400L);
        this.n4.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        t12Var.getClass();
        t12Var.a(this, valueOf);
        this.n4.start();
        ValueAnimator valueAnimator = this.C0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D0, 1.0f);
        this.C0 = ofFloat;
        ofFloat.addUpdateListener(new t02(this, (byte) 2));
        zna znaVar = this.m4;
        if (znaVar != null) {
            znaVar.d();
        }
        zna znaVar2 = new zna((Object) this.b, (vk4) zna.p, 0.0f);
        this.m4 = znaVar2;
        k47 k47Var = this.E3;
        aoa aoaVar = znaVar2.m;
        if (k47Var != null) {
            aoaVar.a(0.75f);
            this.m4.m.b(350.0f);
        } else {
            aoaVar.a(0.75f);
            this.m4.m.b(350.0f);
        }
        this.m4.h();
        if (this.K) {
            this.c.setLayerType(2, null);
        }
        this.B0 = (byte) 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.A0 = animatorSet2;
        qo qoVar = so.d;
        if (this.p0) {
            i = this.q0;
        } else {
            i = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.Z, qoVar, i));
        this.A0.setDuration(400L);
        this.A0.setStartDelay(20L);
        this.A0.setInterpolator(this.l0);
        po poVar = new po(null);
        co1 co1Var = new co1(this, poVar, this.z0, (byte) 14);
        this.m4.a(new w21(this, co1Var, (byte) 1));
        this.A0.addListener(new u5(this, co1Var, (byte) 14));
        poVar.d();
        nm7.e().k(nm7.j1, 512);
        this.A0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        u1(0.0f);
        ofFloat2.addUpdateListener(new t02(this, (byte) 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(d53.f);
        ofFloat2.start();
        return true;
    }

    public final void j1(int i) {
        Activity activity;
        boolean z = true;
        d dVar = this.Z1;
        if (i == 3) {
            if (this.K3 || !F0()) {
                if (dVar != null) {
                    activity = dVar.getParentActivity();
                } else {
                    activity = null;
                }
                if (activity != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                            return;
                        }
                    } else if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                }
                k1(true);
            }
        } else if (i == 6 && gm.H1(dVar)) {
            if (this.i2 == null) {
                n52 n52Var = new n52(this, getContext(), this.J0, (this.B1 || this.O3) ? false : false);
                this.i2 = n52Var;
                this.t2[5] = n52Var;
                m52 m52Var = this.t4;
                if (m52Var != null) {
                    n52Var.setDelegate(m52Var);
                } else if (dVar instanceof yv1) {
                    n52Var.setDelegate(new s02(this, (byte) 18));
                }
            }
            A1(this.i2);
        }
    }

    public final void k1(boolean z) {
        if (!this.K3 && z) {
            q82 q82Var = new q82(3, this, this.J0, getContext());
            this.N1 = q82Var;
            A1(q82Var);
        }
        int i = 1;
        if (this.f2 == null) {
            s22 s22Var = new s22(this, this.J0, getContext());
            this.f2 = s22Var;
            this.t2[3] = s22Var;
            s22Var.setupBlurredSearchField(this.E4);
            this.f2.setDelegate(new s02(this, (byte) 15));
            if (this.B1) {
                this.f2.setMaxSelectedFiles(1);
            }
        }
        d dVar = this.Z1;
        if (dVar instanceof yv1) {
            TLRPC.Chat chat = ((yv1) dVar).e;
            s22 s22Var2 = this.f2;
            if ((chat == null || sd2.N(chat) || !chat.slowmode_enabled) && this.E3 == null) {
                i = -1;
            }
            s22Var2.setMaxSelectedFiles(i);
        }
        if (z) {
            A1(this.f2);
        }
    }

    @Override
    public final void l0() {
        if (this.v2.s()) {
            dismiss();
        }
    }

    public final void l1() {
        boolean z;
        if (!this.N3) {
            q82 q82Var = new q82(5, this, this.J0, getContext());
            this.N1 = q82Var;
            A1(q82Var);
        }
        if (this.e2 == null) {
            w32 w32Var = new w32(this, this.J0, getContext());
            this.e2 = w32Var;
            this.t2[2] = w32Var;
            w32Var.setupBlurredSearchField(this.E4);
            this.e2.setDelegate(new r12(this));
        }
        d dVar = this.Z1;
        if (dVar instanceof yv1) {
            TLRPC.Chat chat = ((yv1) dVar).e;
            w32 w32Var2 = this.e2;
            if (chat != null && !sd2.N(chat) && chat.slowmode_enabled) {
                z = false;
            } else {
                z = true;
            }
            w32Var2.setMultipleSelectionAllowed(z);
        }
        A1(this.e2);
    }

    public final void m1(boolean z) {
        int i;
        if (!this.H3 && z) {
            q82 q82Var = new q82(4, this, this.J0, getContext());
            this.N1 = q82Var;
            A1(q82Var);
        }
        boolean z2 = false;
        if (this.j2 == null) {
            if (this.H1) {
                i = 2;
            } else {
                i = 0;
            }
            p42 p42Var = new p42(i, this, this.J0, getContext());
            this.j2 = p42Var;
            this.t2[4] = p42Var;
            p42Var.setDelegate(new s12(this));
        }
        int i2 = 1;
        if (this.B1) {
            this.j2.setMaxSelectedFiles(1);
        } else {
            d dVar = this.Z1;
            if (dVar instanceof yv1) {
                TLRPC.Chat chat = ((yv1) dVar).e;
                p42 p42Var2 = this.j2;
                if ((chat == null || sd2.N(chat) || !chat.slowmode_enabled) && this.E3 == null) {
                    i2 = -1;
                }
                p42Var2.setMaxSelectedFiles(i2);
            } else {
                this.j2.setMaxSelectedFiles(this.P3);
                p42 p42Var3 = this.j2;
                if (!this.H1 && !this.Q1) {
                    z2 = true;
                }
                p42Var3.setCanSelectOnlyImageFiles(z2);
            }
        }
        p42 p42Var4 = this.j2;
        p42Var4.e0 = this.H1;
        if (z) {
            A1(p42Var4);
        }
    }

    public final void o1() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        x20 x20Var = this.U2;
        int i = 1;
        if (x20Var.o0) {
            x20Var.o(true);
        }
        this.e2 = null;
        this.m2 = null;
        this.f2 = null;
        this.g2 = null;
        this.h2 = null;
        this.i2 = null;
        this.j2 = null;
        this.q2 = null;
        while (true) {
            a22[] a22VarArr = this.t2;
            if (i >= a22VarArr.length) {
                break;
            }
            a22 a22Var = a22VarArr[i];
            if (a22Var != null) {
                a22Var.p();
                this.b.removeView(a22VarArr[i]);
                a22VarArr[i] = null;
            }
            i++;
        }
        D1(false, false);
        super.H();
        if (this.r2) {
            this.r2 = false;
            this.s2 = 0.0f;
            d dVar = this.Z1;
            if (dVar != null && dVar.getFragmentView() != null) {
                View fragmentView = dVar.getFragmentView();
                WeakHashMap weakHashMap = kfc.a;
                afc.c(fragmentView);
            }
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.M1.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        x20 x20Var = this.U2;
        if (x20Var.o0) {
            x20Var.o(true);
        } else if (this.v2.k()) {
        } else {
            if (U0() != null && U0().e) {
                U0().k(true);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d dVar = this.Z1;
        if (dVar != null) {
            gm.l3(this, dVar.isLightStatusBar());
        }
    }

    @Override
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.v2.G(i)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).A0.add(this.M1);
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).A0.remove(this.M1);
        }
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            H0();
            qm0 qm0Var = this.V1;
            if (qm0Var != null) {
                qm0Var.updateColors();
            }
            int v0 = cmb.v0(cmb.i5, this.J0);
            r7 r7Var = this.h3;
            if (r7Var != null && v0 != this.o4) {
                this.o4 = v0;
                r7Var.setIconColor(v0);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final boolean p1(final boolean z, final int i, final int i2, final long j, final boolean z2) {
        if (this.F3) {
            return false;
        }
        d dVar = this.Z1;
        if (dVar instanceof yv1) {
            yv1 yv1Var = (yv1) dVar;
            TLRPC.Chat chat = yv1Var.e;
            if (yv1Var.h() != null || ((sd2.T(chat) && chat.megagroup) || !sd2.T(chat))) {
                SharedPreferences.Editor edit = oc7.r1(this.G3).W3.edit();
                edit.putBoolean("silent_" + yv1Var.a(), !z).commit();
            }
        }
        int i3 = 1;
        if (G0(U0().getText())) {
            return true;
        }
        E0();
        if (this.q1.f) {
            this.F3 = true;
            this.W3.E0(7, true, z, i, i2, j, z2, false, 0L);
            return true;
        }
        long V0 = V0();
        a22 a22Var = this.v2;
        if (a22Var != null) {
            i3 = a22Var.getSelectedItemsCount();
        }
        return ik.Y(this.G3, V0, R0() + i3, new qac() {
            @Override
            public final void a(Object obj) {
                i22 i22Var = i22.this;
                i22Var.F3 = true;
                i22Var.W3.E0(7, true, z, i, i2, j, z2, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void q1(boolean z, boolean z2) {
        final boolean z3;
        boolean z4;
        final boolean z5;
        int i;
        float f;
        float f2;
        float measuredHeight;
        this.l1.a(z, z2);
        cv3 U0 = U0();
        this.W1 = z;
        cv3 U02 = U0();
        int i2 = 0;
        if (this.A2.getTag() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        a22 a22Var = this.v2;
        if (a22Var != this.d2 && a22Var != this.k2) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (this.W1 && z4) {
            z5 = true;
        } else {
            z5 = false;
        }
        int i3 = 8;
        su suVar = this.L2;
        float f3 = 1.0f;
        b51 b51Var = this.z2;
        float f4 = 0.0f;
        if (z2) {
            if (z3) {
                i3 = 0;
            }
            suVar.setVisibility(i3);
            ViewPropertyAnimator animate = suVar.animate();
            if (z5 && z3) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f2).setDuration(320L);
            d53 d53Var = d53.h;
            duration.setInterpolator(d53Var).setUpdateListener(new t02(this, (byte) 0)).withEndAction(new Runnable(this) {
                public final i22 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r4;
                    boolean z6 = z3;
                    boolean z7 = z5;
                    i22 i22Var = this.b;
                    switch (b) {
                        case 0:
                            if (!z7 || !z6) {
                                i22Var.L2.setVisibility(8);
                            }
                            i22Var.L1();
                            return;
                        default:
                            if (z7 || !z6) {
                                i22Var.z2.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            b51Var.setVisibility(0);
            ViewPropertyAnimator animate2 = b51Var.animate();
            if (!z5 && z3) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = b51Var.getMeasuredHeight();
            }
            ViewPropertyAnimator translationY = animate2.translationY(measuredHeight);
            if (z5 || !z3) {
                f3 = 0.0f;
            }
            translationY.alpha(f3).setDuration(320L).setInterpolator(d53Var).setUpdateListener(new t02(this, (byte) 1)).withEndAction(new Runnable(this) {
                public final i22 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r4;
                    boolean z6 = z3;
                    boolean z7 = z5;
                    i22 i22Var = this.b;
                    switch (b) {
                        case 0:
                            if (!z7 || !z6) {
                                i22Var.L2.setVisibility(8);
                            }
                            i22Var.L1();
                            return;
                        default:
                            if (z7 || !z6) {
                                i22Var.z2.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
        } else {
            if (z5 && z3) {
                i = 0;
            } else {
                i = 8;
            }
            suVar.setVisibility(i);
            if (z5 && z3) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            suVar.setAlpha(f);
            L1();
            if (z5 || !z3) {
                f3 = 0.0f;
            }
            b51Var.setAlpha(f3);
            if (z5 || !z3) {
                f4 = b51Var.getMeasuredHeight();
            }
            b51Var.setTranslationY(f4);
            if (z5 || !z3) {
                i2 = 8;
            }
            b51Var.setVisibility(i2);
        }
        if (U0 != U02) {
            U0.k(true);
            U02.setText(gn.cloneSpans(U0.getText()));
            U02.getEditText().setAllowTextEntitiesIntersection(U0.getEditText().getAllowTextEntitiesIntersection());
            if (U0.getEditText().isFocused()) {
                U02.getEditText().requestFocus();
                U02.getEditText().setSelection(U0.getEditText().getSelectionStart(), U0.getEditText().getSelectionEnd());
            }
        }
        gm.c3(new vr0(this, (byte) 1));
    }

    @Override
    public final void r0(boolean z) {
        this.r0 = true;
    }

    public final void r1(int i, k47 k47Var) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (k47Var != null && (chatAttachAlertPhotoLayout = this.d2) != null) {
            chatAttachAlertPhotoLayout.a0();
        }
        if (this.E3 == k47Var && this.D3 == i) {
            return;
        }
        this.E3 = k47Var;
        if (k47Var != null && k47Var.z2()) {
            if (this.E3.I3()) {
                i = 2;
            } else if (this.E3.U2()) {
                i = 1;
            } else {
                i = 0;
            }
        }
        this.D3 = i;
        if (this.E3 != null) {
            this.P3 = 1;
            this.Q3 = false;
        } else {
            this.P3 = -1;
            this.Q3 = true;
        }
        this.x3.f();
        F1(0);
    }

    public final void s1(float f) {
        int i;
        float translationY = this.b.getTranslationY() - this.s2;
        this.s2 = this.b.getHeight() * f;
        this.b.setTranslationY(translationY);
        c52 c52Var = this.q2;
        if (c52Var != null) {
            c52Var.setSendTransitionProgress(f);
        }
        if (this.p0) {
            i = Math.round((1.0f - f) * this.q0);
        } else {
            i = 0;
        }
        this.Z.setAlpha(i);
        this.D0 = 1.0f - f;
        this.c.invalidate();
    }

    @Override
    public final void show() {
        boolean z;
        super.show();
        this.F3 = false;
        d dVar = this.Z1;
        if (dVar instanceof yv1) {
            this.i0 = ((yv1) dVar).Y7();
        }
        G1();
        this.p3 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int p = on2.p(cmb.v0(cmb.Z6, this.J0), 0);
            this.H0 = p;
            gm.o3(this, p, false, null);
            if (gm.B(this.H0) > 0.721d) {
                z = true;
            } else {
                z = false;
            }
            gm.i3(this, z);
        }
        if (this.j4) {
            this.j4 = false;
            x20 x20Var = this.U2;
            x20Var.updateColors();
            x20Var.invalidate();
            d1();
        }
    }

    public final void t1(int i, boolean z) {
        if (this.E3 != null) {
            return;
        }
        this.P3 = i;
        this.Q3 = z;
    }

    public final void u1(float f) {
        boolean z = false;
        int p = on2.p(cmb.v0(cmb.Z6, this.J0), Math.min(255, Math.max(0, (int) (f * 255.0f))));
        this.H0 = p;
        gm.o3(this, p, false, null);
        if (gm.B(this.H0) > 0.721d) {
            z = true;
        }
        gm.i3(this, z);
        this.c.invalidate();
    }

    public final void v1(String str) {
        boolean z = true;
        this.N2 = (byte) 1;
        this.z1 = true;
        this.P2 = false;
        this.J3 = false;
        this.u3.setVisibility(8);
        this.g3.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (chatAttachAlertPhotoLayout != null) {
            i22 i22Var = chatAttachAlertPhotoLayout.b;
            if (i22Var.N2 == 0 || i22Var.z1) {
                z = false;
            }
            chatAttachAlertPhotoLayout.h1 = z;
        }
    }

    @Override
    public final void w() {
        if (this.Z1 instanceof yv1) {
            String[] strArr = MediaController.W1;
        } else {
            String[] strArr2 = MediaController.W1;
        }
        this.v2.x();
        gm.g2(jb6.M0(2131754921, "AccDescrAttachButton"));
        this.p3 = true;
        if (!this.J3 && !this.I3) {
            F0();
        }
    }

    public final void w1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i22.w1(boolean):void");
    }

    @Override
    public final boolean x() {
        return true;
    }

    public final void x1(long r26, java.lang.String r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i22.x1(long, java.lang.String, boolean, boolean):void");
    }

    public final void y1(d dVar) {
        if ((dVar instanceof yv1) && sd2.V(((yv1) dVar).e)) {
            new c41(this.o3, this.J0).f(oc7.r1(this.G3).l4.h1.f(), new lx1(this, dVar, (byte) 6)).j();
        }
    }

    public final boolean z1(boolean z, boolean z2) {
        boolean z3;
        Integer num;
        boolean z4;
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        float f5;
        float f6;
        int i2;
        float f7;
        float f8;
        float f9;
        a22 a22Var;
        float f10;
        float L;
        long L1;
        float f11;
        float f12;
        x20 x20Var;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float L2;
        this.m1.a(z, true);
        h12 h12Var = this.A2;
        if (h12Var.getTag() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z == z3) {
            return false;
        }
        AnimatorSet animatorSet = this.J2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z) {
            num = 1;
        } else {
            num = null;
        }
        h12Var.setTag(num);
        k12 k12Var = this.B2;
        if (k12Var.getEditText().isFocused()) {
            gm.t1(k12Var.getEditText());
        }
        k12Var.k(true);
        this.M2.k(true);
        h12 h12Var2 = this.u3;
        h12 h12Var3 = this.E2;
        if (z) {
            if (!this.H1) {
                h12Var.setVisibility(0);
            }
            h12Var3.setVisibility(0);
        } else if (this.P2) {
            h12Var2.setVisibility(0);
        }
        a22 a22Var2 = this.v2;
        if ((a22Var2 == this.d2 || a22Var2 == this.k2) && this.W1) {
            z4 = true;
        } else {
            z4 = false;
        }
        x20 x20Var2 = this.U2;
        su suVar = this.L2;
        b51 b51Var = this.z2;
        p12 p12Var = this.F2;
        float f20 = 1.0f;
        if (z2) {
            this.J2 = new AnimatorSet();
            if (z4) {
                suVar.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(h12Var, property, f11));
            if (z && !z4) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(b51Var, property, f12));
            if (z && !z4) {
                b51Var.setVisibility(0);
                x20Var = x20Var2;
                arrayList.add(ObjectAnimator.ofFloat(b51Var, View.TRANSLATION_Y, 0.0f));
            } else {
                x20Var = x20Var2;
            }
            if (z && z4) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(suVar, property, f13));
            Property property2 = View.SCALE_X;
            if (z) {
                f14 = 1.0f;
            } else {
                f14 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(h12Var3, property2, f14));
            Property property3 = View.SCALE_Y;
            if (z) {
                f15 = 1.0f;
            } else {
                f15 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(h12Var3, property3, f15));
            if (z) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(h12Var3, property, f16));
            if (z) {
                f17 = 1.0f;
            } else {
                f17 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(p12Var, property2, f17));
            if (z) {
                f18 = 1.0f;
            } else {
                f18 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(p12Var, property3, f18));
            if (x20Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (z) {
                    L2 = 0.0f;
                } else {
                    L2 = gm.L(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(h12Var, property4, L2));
            } else if (this.P2) {
                Property property5 = View.TRANSLATION_Y;
                if (z) {
                    f19 = gm.L(36.0f);
                } else {
                    f19 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(h12Var2, property5, f19));
                if (z) {
                    f20 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(h12Var2, property, f20));
            }
            if (z4) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new t02(this, (byte) 5));
                arrayList.add(ofFloat);
            }
            this.J2.playTogether(arrayList);
            this.J2.setInterpolator(new DecelerateInterpolator());
            this.J2.setDuration(180L);
            this.J2.addListener(new x5(this, z, z4, (byte) 3));
            this.J2.start();
            i = 0;
        } else {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            h12Var.setAlpha(f);
            if (z && z4) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            b51Var.setAlpha(f2);
            if (z && !z4) {
                i = 0;
                b51Var.setVisibility(0);
                f3 = 0.0f;
                b51Var.setTranslationY(0.0f);
            } else {
                f3 = 0.0f;
                i = 0;
            }
            if (z) {
                f4 = 1.0f;
            } else {
                f4 = 0.2f;
            }
            h12Var3.setScaleX(f4);
            if (z) {
                f5 = 1.0f;
            } else {
                f5 = 0.2f;
            }
            h12Var3.setScaleY(f5);
            if (z) {
                f6 = 1.0f;
            } else {
                f6 = f3;
            }
            h12Var3.setAlpha(f6);
            if (z && z4) {
                i2 = i;
            } else {
                i2 = 8;
            }
            suVar.setVisibility(i2);
            if (z && z4) {
                f7 = 1.0f;
            } else {
                f7 = f3;
            }
            suVar.setAlpha(f7);
            if (z) {
                f8 = 1.0f;
            } else {
                f8 = 0.2f;
            }
            p12Var.setScaleX(f8);
            if (z) {
                f9 = 1.0f;
            } else {
                f9 = 0.2f;
            }
            p12Var.setScaleY(f9);
            if (x20Var2.getTag() != null) {
                if (z) {
                    L = f3;
                } else {
                    L = gm.L(48.0f);
                }
                h12Var.setTranslationY(L);
            } else if (this.P2 && ((a22Var = this.v2) == null || a22Var.M())) {
                if (z) {
                    f10 = gm.L(84.0f);
                } else {
                    f10 = f3;
                }
                h12Var2.setTranslationY(f10);
            }
            if (!z) {
                h12Var.setVisibility(4);
                h12Var3.setVisibility(4);
            }
            if (z4) {
                L1();
            }
        }
        if (z) {
            i = Math.max(1, this.v2.getSelectedItemsCount());
        }
        p12Var.f(i, z2);
        if (this.E3 != null) {
            L1 = 0;
        } else {
            L1 = oc7.r1(this.G3).L1(V0());
        }
        p12Var.i(R0() + this.v2.getSelectedItemsCount(), L1, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) k12Var.getLayoutParams();
        int max = Math.max(gm.L(48.0f), p12Var.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            k12Var.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    @Override
    public final void V(float f, int i) {
    }

    public i22(Activity activity, d dVar, boolean z, boolean z2) {
        this(activity, dVar, z, z2, true, null);
    }
}
