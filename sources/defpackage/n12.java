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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public class n12 extends nx0 implements fn7, ix0, s84 {
    public static final int G4 = 0;
    public boolean A1;
    public final m02 A2;
    public boolean A3;
    public boolean A4;
    public boolean B1;
    public final p02 B2;
    public final in B3;
    public mb1 B4;
    public int C1;
    public final ImageView C2;
    public float C3;
    public final tq3 C4;
    public c D1;
    public final int[] D2;
    public int D3;
    public final oz4 D4;
    public int E1;
    public final m02 E2;
    public r47 E3;
    public final ll0 E4;
    public int F1;
    public final u02 F2;
    public boolean F3;
    public final mr0 F4;
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
    public xn5 K1;
    public long K2;
    public boolean K3;
    public boolean L1;
    public final tt L2;
    public boolean L3;
    public final fz7 M1;
    public final r02 M2;
    public boolean M3;
    public w72 N1;
    public byte N2;
    public boolean N3;
    public zn5 O1;
    public yf0 O2;
    public boolean O3;
    public boolean P1;
    public boolean P2;
    public int P3;
    public boolean Q1;
    public boolean Q2;
    public boolean Q3;
    public k32 R1;
    public boolean R2;
    public boolean R3;
    public u12 S1;
    public final float S2;
    public float S3;
    public long T1;
    public long T2;
    public float T3;
    public boolean U1;
    public final y10 U2;
    public ValueAnimator U3;
    public final rl0 V1;
    public AnimatorSet V2;
    public int V3;
    public boolean W1;
    public AnimatorSet W2;
    public l12 W3;
    public float X1;
    public final s7 X2;
    public o62 X3;
    public final y02 Y1;
    public final bl2 Y2;
    public final int[] Y3;
    public final e Z1;
    public final s7 Z2;
    public int Z3;
    public final boolean a2;
    public kg5 a3;
    public float a4;
    public ox1 b2;
    public final s7 b3;
    public float b4;
    public boolean c2;
    public final u8 c3;
    public boolean c4;
    public final ChatAttachAlertPhotoLayout d2;
    public float d3;
    public float d4;
    public b32 e2;
    public float e3;
    public final boolean e4;
    public x12 f2;
    public final m02 f3;
    public boolean f4;
    public a72 g2;
    public final TextView g3;
    public final ArrayList g4;
    public a72 h2;
    public final s7 h3;
    public final Rect h4;
    public s42 i2;
    public final LinearLayout i3;
    public float i4;
    public u32 j2;
    public final ImageView j3;
    public boolean j4;
    public c62 k2;
    public final LinearLayout k3;
    public int k4;
    public final fm0 l1;
    public m22 l2;
    public final TextView l3;
    public final y02 l4;
    public final fm0 m1;
    public f72 m2;
    public float m3;
    public vpa m4;
    public final fm0 n1;
    public v32 n2;
    public boolean n3;
    public AnimatorSet n4;
    public final fm0 o1;
    public v32 o2;
    public final a12 o3;
    public int o4;
    public final fm0 p1;
    public v72 p2;
    public boolean p3;
    public int p4;
    public final fm0 q1;
    public h42 q2;
    public Object q3;
    public boolean q4;
    public final xa9 r1;
    public boolean r2;
    public boolean r3;
    public boolean r4;
    public xu1 s1;
    public float s2;
    public final jz1 s3;
    public boolean s4;
    public final in t1;
    public final f12[] t2;
    public final o02 t3;
    public r42 t4;
    public final in u1;
    public final LongSparseArray u2;
    public final m02 u3;
    public boolean u4;
    public final ImageView v1;
    public f12 v2;
    public final n02 v3;
    public boolean v4;
    public final hc w1;
    public f12 w2;
    public final x46 w3;
    public File w4;
    public final ImageView x1;
    public final jl0 x2;
    public final k12 x3;
    public double[] x4;
    public final hc y1;
    public final jl0 y2;
    public boolean y3;
    public boolean y4;
    public boolean z1;
    public final c41 z2;
    public final RadialProgressView z3;
    public boolean z4;

    public n12(Context context, e eVar, boolean z, boolean z2, boolean z3, final vnb vnbVar) {
        super(1, vnbVar, context, false);
        ll0 ll0Var;
        ll0 ll0Var2;
        boolean z4;
        s7 s7Var;
        u8 u8Var;
        float f;
        int i;
        int L;
        k43 k43Var = k43.h;
        this.l1 = new fm0(0, this, k43Var, 380L, false);
        this.m1 = new fm0(1, this, k43Var, 380L, false);
        this.n1 = new fm0(2, this, k43Var, 380L, false);
        this.o1 = new fm0(3, this, k43Var, 380L, false);
        this.p1 = new fm0(4, this, k43Var, 380L, true);
        this.q1 = new fm0(5, this, k43Var, 320L, false);
        xa9 xa9Var = new xa9(new xz1(this, (byte) 1), k43Var, 380L);
        this.r1 = xa9Var;
        this.G1 = false;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.X1 = 0.0f;
        this.Y1 = new y02(this, (byte) 0);
        this.c2 = false;
        f12[] f12VarArr = new f12[12];
        this.t2 = f12VarArr;
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
        int i2 = yac.t0;
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
        this.V3 = hl.L(85.0f);
        this.Y3 = new int[2];
        new Paint(1);
        this.f4 = false;
        ArrayList arrayList = new ArrayList();
        this.g4 = arrayList;
        Rect rect = new Rect();
        this.h4 = rect;
        this.l4 = new y02(this, (byte) 1);
        this.r4 = true;
        this.s4 = false;
        this.z4 = false;
        this.A4 = false;
        this.y = true;
        oz4 oz4Var = new oz4();
        this.D4 = oz4Var;
        oz4Var.a(aob.v0(aob.d6, this.J0));
        this.X0.E.add(new ty4(oz4Var, new xz1(this, (byte) 3)));
        if (Build.VERSION.SDK_INT >= 31 && xea.f()) {
            tq3 tq3Var = new tq3(false);
            this.C4 = tq3Var;
            this.X0.a(tq3Var);
            rz4 rz4Var = new rz4(oz4Var);
            rz4Var.f = oz4Var;
            rz4Var.d = tq3Var;
            rz4Var.e = -2;
            rz4 rz4Var2 = new rz4(null);
            rz4Var2.f = oz4Var;
            rz4Var2.d = tq3Var;
            rz4Var2.e = -3;
            ll0Var = new ll0(rz4Var, rz4Var, rz4Var);
            this.E4 = ll0Var;
            ll0Var.k = true;
            if (i86.e(262144)) {
                L = hl.L(8.0f);
            } else {
                L = hl.L(48.0f);
            }
            ll0Var.d = L;
            ll0Var.e = L;
            ll0Var2 = new ll0(rz4Var2, rz4Var2, rz4Var2);
            ll0Var2.k = true;
            int L2 = hl.L(48.0f);
            ll0Var2.d = L2;
            ll0Var2.e = L2;
        } else {
            this.C4 = null;
            ll0Var = new ll0(oz4Var, oz4Var, oz4Var);
            this.E4 = ll0Var;
            ll0Var2 = new ll0(oz4Var, oz4Var, oz4Var);
        }
        ll0 ll0Var3 = ll0Var;
        ll0 ll0Var4 = new ll0(oz4Var, oz4Var, oz4Var);
        this.F4 = new mr0(this, (byte) 3);
        this.e4 = z;
        if ((eVar instanceof zu1) && eVar.isInBubbleMode()) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.a2 = z4;
        this.l0 = new OvershootInterpolator(0.7f);
        this.Z1 = eVar;
        this.G = true;
        this.z0 = this;
        jn7.f(i2).b(this, jn7.T0);
        jn7.f(i2).b(this, jn7.Z4);
        jn7.f(i2).b(this, jn7.i5);
        jn7.f(i2).b(this, jn7.F1);
        arrayList.add(rect);
        a12 a12Var = new a12(this, context);
        this.o3 = a12Var;
        a12Var.setDelegate(new b12(this));
        this.b = a12Var;
        a12Var.setWillNotDraw(false);
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        ViewGroup viewGroup = this.b;
        int i3 = this.u0;
        viewGroup.setPadding(i3, 0, i3, 0);
        y10 y10Var = new y10(this, context, vnbVar, (byte) 1);
        this.U2 = y10Var;
        y10Var.d1 = true;
        y10Var.setForcedMenuWidth(hl.L(46.0f));
        y10Var.setBackButtonDrawable(new gd0(false));
        int i4 = aob.j5;
        yob.l(y10Var, 1, i4, vnbVar);
        int i5 = aob.I5;
        yob.l(y10Var, 3, i5, vnbVar);
        yob.l(y10Var, 5, i4, vnbVar);
        y10Var.setOccupyStatusBar(true);
        y10Var.setAlpha(0.0f);
        y10Var.setActionBarMenuOnItemClick(new s8(this, (byte) 23));
        ll0 ll0Var5 = ll0Var2;
        s7 s7Var2 = new s7(context, null, 0, aob.v0(i4, this.J0), false, vnbVar);
        this.X2 = s7Var2;
        s7Var2.setLongClickEnabled(false);
        s7Var2.setIcon(2131231247);
        s7Var2.setContentDescription(ob6.M0(2131754834, null));
        s7Var2.setVisibility(4);
        s7Var2.setAlpha(0.0f);
        s7Var2.setScaleX(0.6f);
        s7Var2.setScaleY(0.6f);
        s7Var2.setSubMenuOpenSide(2);
        s7Var2.setDelegate(new xz1(this, (byte) 9));
        s7Var2.setAdditionalYOffset(hl.L(72.0f));
        s7Var2.setTranslationX(hl.L(1.0f));
        hf0 f0 = aob.f0(aob.v0(i5, this.J0), 6, -1);
        uob M = yob.M(i5);
        s7Var2.setBackground(f0);
        yob.j(s7Var2, f0, null, M, vnbVar);
        s7Var2.setOnClickListener(new View.OnClickListener(this) {
            public final n12 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                j22 j22Var;
                int i6;
                byte b = r2;
                boolean z5 = false;
                n12 n12Var = this.b;
                switch (b) {
                    case 0:
                        if (n12Var.v2 != n12Var.k2) {
                            z5 = true;
                        }
                        n12Var.K1(z5);
                        return;
                    case 1:
                        long j = n12Var.T2;
                        if (j < 0 && (j22Var = (j22) n12Var.u2.get(-j)) != null) {
                            rv0 webViewContainer = j22Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = n12Var.W1;
                        if (!z6) {
                            n12Var.r1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = n12Var.W1;
                        if (z7) {
                            n12Var.r1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        n12Var.j1();
                        return;
                    case 5:
                        n12Var.X2.U(null, null);
                        return;
                    case 6:
                        if (n12Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z8 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof no6) {
                                        no6 no6Var = (no6) entry.getValue();
                                        if (no6Var.d()) {
                                            no6Var.O = Boolean.valueOf(S);
                                            for (int i7 = 0; i7 < chatAttachAlertPhotoLayout.F.getChildCount(); i7++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i7);
                                                if (childAt instanceof d88) {
                                                    d88 d88Var = (d88) childAt;
                                                    if (d88Var.getPhotoEntry() == no6Var) {
                                                        d88Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                xea.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            n12Var.J1(true);
                            s7 s7Var3 = n12Var.Z2;
                            kg5 kg5Var = n12Var.a3;
                            if (kg5Var != null) {
                                kg5Var.f(true);
                            }
                            kg5 kg5Var2 = new kg5(n12Var.getContext(), 1);
                            n12Var.a3 = kg5Var2;
                            if (!S) {
                                i6 = 2131748586;
                            } else {
                                i6 = 2131748587;
                            }
                            kg5Var2.t(hl.S2(ob6.M0(i6, null)));
                            n12Var.a3.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            n12Var.a3.o(1.0f, -((n12Var.b.getWidth() - ((s7Var3.getWidth() / 2.0f) + s7Var3.getX())) - hl.L(14.0f)));
                            n12Var.a3.setTranslationY(n12Var.X2.getTranslationY());
                            kg5 kg5Var3 = n12Var.a3;
                            kg5Var3.r0 = new dy1(n12Var, kg5Var2, (byte) 4);
                            n12Var.b.addView(kg5Var3, tre.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            n12Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        f12 f12Var = n12Var.v2;
                        if (f12Var != null) {
                            f12Var.x(40);
                            return;
                        }
                        return;
                    default:
                        n12Var.h3.U(null, null);
                        return;
                }
            }
        });
        s7 s7Var3 = new s7(context, null, 0, aob.v0(i4, this.J0), false, vnbVar);
        this.Z2 = s7Var3;
        s7Var3.setLongClickEnabled(false);
        bl2 bl2Var = new bl2();
        this.Y2 = bl2Var;
        s7Var3.setIcon(bl2Var);
        s7Var3.setContentDescription(ob6.M0(2131754834, null));
        s7Var3.setVisibility(8);
        s7Var3.setAlpha(0.0f);
        s7Var3.setScaleX(0.6f);
        s7Var3.setScaleY(0.6f);
        s7Var3.setAdditionalYOffset(hl.L(72.0f));
        s7Var3.setTranslationX(-hl.L(3.0f));
        hf0 f02 = aob.f0(aob.v0(i5, this.J0), 6, -1);
        uob M2 = yob.M(i5);
        s7Var3.setBackground(f02);
        yob.j(s7Var3, f02, null, M2, vnbVar);
        s7Var3.setOnClickListener(new View.OnClickListener(this) {
            public final n12 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                j22 j22Var;
                int i6;
                byte b = r2;
                boolean z5 = false;
                n12 n12Var = this.b;
                switch (b) {
                    case 0:
                        if (n12Var.v2 != n12Var.k2) {
                            z5 = true;
                        }
                        n12Var.K1(z5);
                        return;
                    case 1:
                        long j = n12Var.T2;
                        if (j < 0 && (j22Var = (j22) n12Var.u2.get(-j)) != null) {
                            rv0 webViewContainer = j22Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = n12Var.W1;
                        if (!z6) {
                            n12Var.r1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = n12Var.W1;
                        if (z7) {
                            n12Var.r1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        n12Var.j1();
                        return;
                    case 5:
                        n12Var.X2.U(null, null);
                        return;
                    case 6:
                        if (n12Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z8 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof no6) {
                                        no6 no6Var = (no6) entry.getValue();
                                        if (no6Var.d()) {
                                            no6Var.O = Boolean.valueOf(S);
                                            for (int i7 = 0; i7 < chatAttachAlertPhotoLayout.F.getChildCount(); i7++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i7);
                                                if (childAt instanceof d88) {
                                                    d88 d88Var = (d88) childAt;
                                                    if (d88Var.getPhotoEntry() == no6Var) {
                                                        d88Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                xea.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            n12Var.J1(true);
                            s7 s7Var32 = n12Var.Z2;
                            kg5 kg5Var = n12Var.a3;
                            if (kg5Var != null) {
                                kg5Var.f(true);
                            }
                            kg5 kg5Var2 = new kg5(n12Var.getContext(), 1);
                            n12Var.a3 = kg5Var2;
                            if (!S) {
                                i6 = 2131748586;
                            } else {
                                i6 = 2131748587;
                            }
                            kg5Var2.t(hl.S2(ob6.M0(i6, null)));
                            n12Var.a3.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            n12Var.a3.o(1.0f, -((n12Var.b.getWidth() - ((s7Var32.getWidth() / 2.0f) + s7Var32.getX())) - hl.L(14.0f)));
                            n12Var.a3.setTranslationY(n12Var.X2.getTranslationY());
                            kg5 kg5Var3 = n12Var.a3;
                            kg5Var3.r0 = new dy1(n12Var, kg5Var2, (byte) 4);
                            n12Var.b.addView(kg5Var3, tre.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            n12Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        f12 f12Var = n12Var.v2;
                        if (f12Var != null) {
                            f12Var.x(40);
                            return;
                        }
                        return;
                    default:
                        n12Var.h3.U(null, null);
                        return;
                }
            }
        });
        u8 u8Var2 = new u8(this, context);
        yob.X(u8Var2, aob.Ji, vnbVar);
        u8Var2.setText(ob6.M0(2131751718, null));
        u8Var2.setTypeface(hl.o());
        u8Var2.setTextSize(1, 14.0f);
        u8Var2.setVisibility(4);
        u8Var2.setAlpha(0.0f);
        u8Var2.setGravity(17);
        u8Var2.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        u8Var2.setTranslationX(-hl.L(12.0f));
        u8Var2.setOnClickListener(new View.OnClickListener(this) {
            public final n12 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                j22 j22Var;
                int i6;
                byte b = r2;
                boolean z5 = false;
                n12 n12Var = this.b;
                switch (b) {
                    case 0:
                        if (n12Var.v2 != n12Var.k2) {
                            z5 = true;
                        }
                        n12Var.K1(z5);
                        return;
                    case 1:
                        long j = n12Var.T2;
                        if (j < 0 && (j22Var = (j22) n12Var.u2.get(-j)) != null) {
                            rv0 webViewContainer = j22Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = n12Var.W1;
                        if (!z6) {
                            n12Var.r1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = n12Var.W1;
                        if (z7) {
                            n12Var.r1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        n12Var.j1();
                        return;
                    case 5:
                        n12Var.X2.U(null, null);
                        return;
                    case 6:
                        if (n12Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z8 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof no6) {
                                        no6 no6Var = (no6) entry.getValue();
                                        if (no6Var.d()) {
                                            no6Var.O = Boolean.valueOf(S);
                                            for (int i7 = 0; i7 < chatAttachAlertPhotoLayout.F.getChildCount(); i7++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i7);
                                                if (childAt instanceof d88) {
                                                    d88 d88Var = (d88) childAt;
                                                    if (d88Var.getPhotoEntry() == no6Var) {
                                                        d88Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                xea.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            n12Var.J1(true);
                            s7 s7Var32 = n12Var.Z2;
                            kg5 kg5Var = n12Var.a3;
                            if (kg5Var != null) {
                                kg5Var.f(true);
                            }
                            kg5 kg5Var2 = new kg5(n12Var.getContext(), 1);
                            n12Var.a3 = kg5Var2;
                            if (!S) {
                                i6 = 2131748586;
                            } else {
                                i6 = 2131748587;
                            }
                            kg5Var2.t(hl.S2(ob6.M0(i6, null)));
                            n12Var.a3.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            n12Var.a3.o(1.0f, -((n12Var.b.getWidth() - ((s7Var32.getWidth() / 2.0f) + s7Var32.getX())) - hl.L(14.0f)));
                            n12Var.a3.setTranslationY(n12Var.X2.getTranslationY());
                            kg5 kg5Var3 = n12Var.a3;
                            kg5Var3.r0 = new dy1(n12Var, kg5Var2, (byte) 4);
                            n12Var.b.addView(kg5Var3, tre.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            n12Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        f12 f12Var = n12Var.v2;
                        if (f12Var != null) {
                            f12Var.x(40);
                            return;
                        }
                        return;
                    default:
                        n12Var.h3.U(null, null);
                        return;
                }
            }
        });
        iye.a(u8Var2);
        this.c3 = u8Var2;
        H1();
        if (eVar != null) {
            s7Var = s7Var3;
            u8Var = u8Var2;
            f = 14.0f;
            s7 s7Var4 = new s7(context, null, 0, aob.v0(i4, this.J0), false, vnbVar);
            this.b3 = s7Var4;
            s7Var4.setLongClickEnabled(false);
            s7Var4.setIcon(2131232502);
            s7Var4.setContentDescription(ob6.M0(2131745564, null));
            s7Var4.setVisibility(4);
            s7Var4.setAlpha(0.0f);
            s7Var4.setTranslationX(-hl.L(42.0f));
            hf0 f03 = aob.f0(aob.v0(i5, this.J0), 6, -1);
            uob M3 = yob.M(i5);
            s7Var4.setBackground(f03);
            yob.j(s7Var4, f03, null, M3, vnbVar);
            s7Var4.setOnClickListener(new w6((byte) 2, this, z2));
        } else {
            s7Var = s7Var3;
            u8Var = u8Var2;
            f = 14.0f;
        }
        s7 s7Var5 = new s7(context, null, 0, aob.v0(i4, this.J0), false, vnbVar);
        this.h3 = s7Var5;
        s7Var5.setLongClickEnabled(false);
        s7Var5.setIcon(2131231247);
        s7Var5.setContentDescription(ob6.M0(2131754834, null));
        s7Var5.setVisibility(8);
        hf0 f04 = aob.f0(aob.v0(i5, this.J0), 3, -1);
        uob M4 = yob.M(i5);
        s7Var5.setBackground(f04);
        yob.j(s7Var5, f04, null, M4, vnbVar);
        s7Var5.e(1, 2131232049, ob6.M0(2131744534, null)).setOnClickListener(new View.OnClickListener(this) {
            public final n12 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                zu1 zu1Var;
                byte b = r3;
                vnb vnbVar2 = vnbVar;
                final n12 n12Var = this.b;
                boolean z5 = false;
                boolean z6 = true;
                switch (b) {
                    case 0:
                        p02 p02Var = n12Var.B2;
                        if (p02Var != null) {
                            uc7.e1().edit().putInt("aihintshown", 3).apply();
                            b1 b1Var = new b1(n12Var.getContext(), vnbVar2);
                            b1Var.q1(p02Var.getText());
                            b1Var.e2 = new pcc() {
                                @Override
                                public final void a(Object obj) {
                                    byte b2 = r2;
                                    n12 n12Var2 = n12Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b2) {
                                        case 0:
                                            p02 p02Var2 = n12Var2.B2;
                                            p02Var2.setText(charSequence);
                                            p02Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            r02 r02Var = n12Var2.M2;
                                            r02Var.setText(charSequence);
                                            r02Var.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j = n12Var.T1;
                            if (n12Var.E3 == null) {
                                z6 = false;
                            }
                            b1Var.o1(j, z6, new e02(n12Var, (byte) 0));
                            b1Var.show();
                            return;
                        }
                        return;
                    case 1:
                        r02 r02Var = n12Var.M2;
                        if (r02Var != null) {
                            uc7.e1().edit().putInt("aihintshown", 3).apply();
                            b1 b1Var2 = new b1(n12Var.getContext(), vnbVar2);
                            b1Var2.q1(r02Var.getText());
                            b1Var2.e2 = new pcc() {
                                @Override
                                public final void a(Object obj) {
                                    byte b2 = r2;
                                    n12 n12Var2 = n12Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b2) {
                                        case 0:
                                            p02 p02Var2 = n12Var2.B2;
                                            p02Var2.setText(charSequence);
                                            p02Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            r02 r02Var2 = n12Var2.M2;
                                            r02Var2.setText(charSequence);
                                            r02Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j2 = n12Var.T1;
                            if (n12Var.E3 != null) {
                                z5 = true;
                            }
                            b1Var2.o1(j2, z5, new e02(n12Var, (byte) 1));
                            b1Var2.show();
                            return;
                        }
                        return;
                    default:
                        n12Var.h3.U(null, null);
                        PhotoViewer q0 = PhotoViewer.q0();
                        e eVar2 = n12Var.Z1;
                        q0.T1(null, eVar2, vnbVar2);
                        PhotoViewer.q0().U1(n12Var);
                        PhotoViewer q02 = PhotoViewer.q0();
                        int i6 = n12Var.P3;
                        boolean z7 = n12Var.Q3;
                        q02.h = i6;
                        q02.n = z7;
                        if (!n12Var.W3.o()) {
                            hl.t1(eVar2.getFragmentView().findFocus());
                            hl.t1(n12Var.c.findFocus());
                        }
                        File w = c8b.w(n12Var.G3, "webp");
                        Point point = hl.q;
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
                            cc4.g(th, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        no6 no6Var = new no6(0, w.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(no6Var);
                        PhotoViewer q03 = PhotoViewer.q0();
                        e12 e12Var = new e12(n12Var, no6Var);
                        if (eVar2 instanceof zu1) {
                            zu1Var = (zu1) eVar2;
                        } else {
                            zu1Var = null;
                        }
                        q03.o1(arrayList2, 0, 11, false, e12Var, zu1Var);
                        if (n12Var.A1) {
                            PhotoViewer.q0().U(null, null, true, n12Var.D1);
                            return;
                        }
                        return;
                }
            }
        });
        s7Var5.setMenuYOffset(hl.L(-12.0f));
        s7Var5.setAdditionalXOffset(hl.L(12.0f));
        s7Var5.setOnClickListener(new View.OnClickListener(this) {
            public final n12 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                j22 j22Var;
                int i6;
                byte b = r2;
                boolean z5 = false;
                n12 n12Var = this.b;
                switch (b) {
                    case 0:
                        if (n12Var.v2 != n12Var.k2) {
                            z5 = true;
                        }
                        n12Var.K1(z5);
                        return;
                    case 1:
                        long j = n12Var.T2;
                        if (j < 0 && (j22Var = (j22) n12Var.u2.get(-j)) != null) {
                            rv0 webViewContainer = j22Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = n12Var.W1;
                        if (!z6) {
                            n12Var.r1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = n12Var.W1;
                        if (z7) {
                            n12Var.r1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        n12Var.j1();
                        return;
                    case 5:
                        n12Var.X2.U(null, null);
                        return;
                    case 6:
                        if (n12Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z8 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof no6) {
                                        no6 no6Var = (no6) entry.getValue();
                                        if (no6Var.d()) {
                                            no6Var.O = Boolean.valueOf(S);
                                            for (int i7 = 0; i7 < chatAttachAlertPhotoLayout.F.getChildCount(); i7++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i7);
                                                if (childAt instanceof d88) {
                                                    d88 d88Var = (d88) childAt;
                                                    if (d88Var.getPhotoEntry() == no6Var) {
                                                        d88Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                xea.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            n12Var.J1(true);
                            s7 s7Var32 = n12Var.Z2;
                            kg5 kg5Var = n12Var.a3;
                            if (kg5Var != null) {
                                kg5Var.f(true);
                            }
                            kg5 kg5Var2 = new kg5(n12Var.getContext(), 1);
                            n12Var.a3 = kg5Var2;
                            if (!S) {
                                i6 = 2131748586;
                            } else {
                                i6 = 2131748587;
                            }
                            kg5Var2.t(hl.S2(ob6.M0(i6, null)));
                            n12Var.a3.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            n12Var.a3.o(1.0f, -((n12Var.b.getWidth() - ((s7Var32.getWidth() / 2.0f) + s7Var32.getX())) - hl.L(14.0f)));
                            n12Var.a3.setTranslationY(n12Var.X2.getTranslationY());
                            kg5 kg5Var3 = n12Var.a3;
                            kg5Var3.r0 = new dy1(n12Var, kg5Var2, (byte) 4);
                            n12Var.b.addView(kg5Var3, tre.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            n12Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        f12 f12Var = n12Var.v2;
                        if (f12Var != null) {
                            f12Var.x(40);
                            return;
                        }
                        return;
                    default:
                        n12Var.h3.U(null, null);
                        return;
                }
            }
        });
        m02 m02Var = new m02(this, context, (byte) 0);
        this.f3 = m02Var;
        m02Var.setOnClickListener(new View.OnClickListener(this) {
            public final n12 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                j22 j22Var;
                int i6;
                byte b = r2;
                boolean z5 = false;
                n12 n12Var = this.b;
                switch (b) {
                    case 0:
                        if (n12Var.v2 != n12Var.k2) {
                            z5 = true;
                        }
                        n12Var.K1(z5);
                        return;
                    case 1:
                        long j = n12Var.T2;
                        if (j < 0 && (j22Var = (j22) n12Var.u2.get(-j)) != null) {
                            rv0 webViewContainer = j22Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = n12Var.W1;
                        if (!z6) {
                            n12Var.r1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = n12Var.W1;
                        if (z7) {
                            n12Var.r1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        n12Var.j1();
                        return;
                    case 5:
                        n12Var.X2.U(null, null);
                        return;
                    case 6:
                        if (n12Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z8 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof no6) {
                                        no6 no6Var = (no6) entry.getValue();
                                        if (no6Var.d()) {
                                            no6Var.O = Boolean.valueOf(S);
                                            for (int i7 = 0; i7 < chatAttachAlertPhotoLayout.F.getChildCount(); i7++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i7);
                                                if (childAt instanceof d88) {
                                                    d88 d88Var = (d88) childAt;
                                                    if (d88Var.getPhotoEntry() == no6Var) {
                                                        d88Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                xea.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            n12Var.J1(true);
                            s7 s7Var32 = n12Var.Z2;
                            kg5 kg5Var = n12Var.a3;
                            if (kg5Var != null) {
                                kg5Var.f(true);
                            }
                            kg5 kg5Var2 = new kg5(n12Var.getContext(), 1);
                            n12Var.a3 = kg5Var2;
                            if (!S) {
                                i6 = 2131748586;
                            } else {
                                i6 = 2131748587;
                            }
                            kg5Var2.t(hl.S2(ob6.M0(i6, null)));
                            n12Var.a3.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            n12Var.a3.o(1.0f, -((n12Var.b.getWidth() - ((s7Var32.getWidth() / 2.0f) + s7Var32.getX())) - hl.L(14.0f)));
                            n12Var.a3.setTranslationY(n12Var.X2.getTranslationY());
                            kg5 kg5Var3 = n12Var.a3;
                            kg5Var3.r0 = new dy1(n12Var, kg5Var2, (byte) 4);
                            n12Var.b.addView(kg5Var3, tre.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            n12Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        f12 f12Var = n12Var.v2;
                        if (f12Var != null) {
                            f12Var.x(40);
                            return;
                        }
                        return;
                    default:
                        n12Var.h3.U(null, null);
                        return;
                }
            }
        });
        m02Var.setAlpha(0.0f);
        m02Var.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.i3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.g3 = textView;
        qd4.w(textView, i4, vnbVar, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, tre.r(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.j3 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(2131230875).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.x(imageView, mutate, i4, vnbVar, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, tre.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        m02Var.addView(linearLayout, tre.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.k3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(2131230874).mutate();
        yob.x(imageView2, mutate2, i4, vnbVar, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, tre.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.l3 = textView2;
        qd4.w(textView2, i4, vnbVar, 1, 16.0f);
        uh9.q(textView2, 19, "AttachMediaPreview", 2131753951);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, tre.r(-2, -2, 16));
        m02Var.addView(linearLayout2, tre.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z, z3, vnbVar);
        this.d2 = chatAttachAlertPhotoLayout;
        f12VarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.v2 = chatAttachAlertPhotoLayout;
        this.T2 = 1L;
        this.b.addView(chatAttachAlertPhotoLayout, tre.c(-1.0f, -1));
        jz1 jz1Var = new jz1(context);
        this.s3 = jz1Var;
        jz1Var.setup(ll0Var4);
        jz1Var.setFadeTopAlpha(0);
        jz1Var.setFadeHeightTop(hl.L(48.0f));
        jz1Var.setFadeHeightBottom(hl.L(48.0f));
        jz1Var.setFadeZoneTop(hl.L(5.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + hl.m);
        this.b.addView(jz1Var, tre.g());
        this.b.addView(m02Var, tre.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        tt ttVar = new tt(context, (byte) 6);
        this.L2 = ttVar;
        this.b.addView(ttVar, tre.e(-1, -2, 55));
        this.b.addView(y10Var, tre.c(-2.0f, -1));
        this.b.addView(s7Var2, tre.e(48, 48, 53));
        this.b.addView(s7Var, tre.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        s7 s7Var6 = this.b3;
        if (s7Var6 != null) {
            this.b.addView(s7Var6, tre.e(48, 48, 53));
        }
        m02Var.addView(s7Var5, tre.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.b.addView(u8Var, tre.e(-2, 48, 53));
        m02 m02Var2 = new m02(this, context, (byte) 1);
        this.u3 = m02Var2;
        n02 n02Var = new n02(context, (byte) 0);
        this.v3 = n02Var;
        n02Var.setClipChildren(true);
        n02Var.setClipToPadding(false);
        k12 k12Var = new k12(this, context);
        this.x3 = k12Var;
        n02Var.setAdapter(k12Var);
        x46 x46Var = new x46(0, false);
        this.w3 = x46Var;
        n02Var.setLayoutManager(x46Var);
        n02Var.setVerticalScrollBarEnabled(false);
        n02Var.setHorizontalScrollBarEnabled(false);
        n02Var.setItemAnimator(null);
        n02Var.setLayoutAnimation(null);
        yob.l(n02Var, 21, aob.A5, vnbVar);
        n02Var.z2 = true;
        n02Var.setOverScrollMode(2);
        vy4 vy4Var = this.X0;
        ll0Var3.j = vy4Var;
        ll0Var5.j = vy4Var;
        ll0Var4.j = vy4Var;
        o02 o02Var = new o02(this, context, (byte) 0);
        this.t3 = o02Var;
        rl0 rl0Var = new rl0(ll0Var4.c(o02Var, null, false));
        this.V1 = rl0Var;
        if (xea.f()) {
            i86.e(262144);
        }
        rl0Var.b(hl.L(72.0f), true);
        this.b.addView(o02Var, tre.g());
        jl0 c = ll0Var3.c(m02Var2, dtd.g(vnbVar), false);
        c.r(hl.L(28.0f));
        c.q(hl.L(7.0f));
        m02Var2.setBackground(c);
        n02Var.setPadding(hl.L(11.0f), hl.L(11.0f), hl.L(11.0f), hl.L(11.0f));
        n02Var.setClipToOutline(true);
        yi yiVar = yhc.a;
        n02Var.setOutlineProvider(new whc(hl.L(11.0f), hl.L(28.0f)));
        n02Var.setImportantForAccessibility(1);
        m02Var2.addView(n02Var, tre.g());
        this.b.addView(m02Var2, tre.e(-1, 70, 81));
        n02Var.setOnItemClickListener(new l0(this, vnbVar, (byte) 8));
        n02Var.setOnItemLongClickListener(new xz1(this, (byte) 2));
        in inVar = new in(context, true, false, true);
        this.B3 = inVar;
        inVar.setVisibility(8);
        inVar.setAlpha(0.0f);
        inVar.setGravity(17);
        inVar.setTypeface(hl.o());
        int L3 = hl.L(16.0f);
        inVar.setPadding(L3, 0, L3, 0);
        inVar.setTextSize(hl.L(f));
        inVar.setOnClickListener(new View.OnClickListener(this) {
            public final n12 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                j22 j22Var;
                int i6;
                byte b = r2;
                boolean z5 = false;
                n12 n12Var = this.b;
                switch (b) {
                    case 0:
                        if (n12Var.v2 != n12Var.k2) {
                            z5 = true;
                        }
                        n12Var.K1(z5);
                        return;
                    case 1:
                        long j = n12Var.T2;
                        if (j < 0 && (j22Var = (j22) n12Var.u2.get(-j)) != null) {
                            rv0 webViewContainer = j22Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = n12Var.W1;
                        if (!z6) {
                            n12Var.r1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = n12Var.W1;
                        if (z7) {
                            n12Var.r1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        n12Var.j1();
                        return;
                    case 5:
                        n12Var.X2.U(null, null);
                        return;
                    case 6:
                        if (n12Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z8 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = n12Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof no6) {
                                        no6 no6Var = (no6) entry.getValue();
                                        if (no6Var.d()) {
                                            no6Var.O = Boolean.valueOf(S);
                                            for (int i7 = 0; i7 < chatAttachAlertPhotoLayout2.F.getChildCount(); i7++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i7);
                                                if (childAt instanceof d88) {
                                                    d88 d88Var = (d88) childAt;
                                                    if (d88Var.getPhotoEntry() == no6Var) {
                                                        d88Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                xea.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            n12Var.J1(true);
                            s7 s7Var32 = n12Var.Z2;
                            kg5 kg5Var = n12Var.a3;
                            if (kg5Var != null) {
                                kg5Var.f(true);
                            }
                            kg5 kg5Var2 = new kg5(n12Var.getContext(), 1);
                            n12Var.a3 = kg5Var2;
                            if (!S) {
                                i6 = 2131748586;
                            } else {
                                i6 = 2131748587;
                            }
                            kg5Var2.t(hl.S2(ob6.M0(i6, null)));
                            n12Var.a3.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            n12Var.a3.o(1.0f, -((n12Var.b.getWidth() - ((s7Var32.getWidth() / 2.0f) + s7Var32.getX())) - hl.L(14.0f)));
                            n12Var.a3.setTranslationY(n12Var.X2.getTranslationY());
                            kg5 kg5Var3 = n12Var.a3;
                            kg5Var3.r0 = new dy1(n12Var, kg5Var2, (byte) 4);
                            n12Var.b.addView(kg5Var3, tre.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            n12Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        f12 f12Var = n12Var.v2;
                        if (f12Var != null) {
                            f12Var.x(40);
                            return;
                        }
                        return;
                    default:
                        n12Var.h3.U(null, null);
                        return;
                }
            }
        });
        this.b.addView(inVar, tre.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.z3 = radialProgressView;
        radialProgressView.setSize(hl.L(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.b.addView(radialProgressView, tre.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.C2 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i6 = aob.z6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        yob.s(imageView3, i6, vnbVar, mode2);
        imageView3.setImageResource(2131231842);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final n12 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                j22 j22Var;
                int i62;
                byte b = r2;
                boolean z5 = false;
                n12 n12Var = this.b;
                switch (b) {
                    case 0:
                        if (n12Var.v2 != n12Var.k2) {
                            z5 = true;
                        }
                        n12Var.K1(z5);
                        return;
                    case 1:
                        long j = n12Var.T2;
                        if (j < 0 && (j22Var = (j22) n12Var.u2.get(-j)) != null) {
                            rv0 webViewContainer = j22Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = n12Var.W1;
                        if (!z6) {
                            n12Var.r1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = n12Var.W1;
                        if (z7) {
                            n12Var.r1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        n12Var.j1();
                        return;
                    case 5:
                        n12Var.X2.U(null, null);
                        return;
                    case 6:
                        if (n12Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z8 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = n12Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof no6) {
                                        no6 no6Var = (no6) entry.getValue();
                                        if (no6Var.d()) {
                                            no6Var.O = Boolean.valueOf(S);
                                            for (int i7 = 0; i7 < chatAttachAlertPhotoLayout2.F.getChildCount(); i7++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i7);
                                                if (childAt instanceof d88) {
                                                    d88 d88Var = (d88) childAt;
                                                    if (d88Var.getPhotoEntry() == no6Var) {
                                                        d88Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                xea.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            n12Var.J1(true);
                            s7 s7Var32 = n12Var.Z2;
                            kg5 kg5Var = n12Var.a3;
                            if (kg5Var != null) {
                                kg5Var.f(true);
                            }
                            kg5 kg5Var2 = new kg5(n12Var.getContext(), 1);
                            n12Var.a3 = kg5Var2;
                            if (!S) {
                                i62 = 2131748586;
                            } else {
                                i62 = 2131748587;
                            }
                            kg5Var2.t(hl.S2(ob6.M0(i62, null)));
                            n12Var.a3.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            n12Var.a3.o(1.0f, -((n12Var.b.getWidth() - ((s7Var32.getWidth() / 2.0f) + s7Var32.getX())) - hl.L(14.0f)));
                            n12Var.a3.setTranslationY(n12Var.X2.getTranslationY());
                            kg5 kg5Var3 = n12Var.a3;
                            kg5Var3.r0 = new dy1(n12Var, kg5Var2, (byte) 4);
                            n12Var.b.addView(kg5Var3, tre.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            n12Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        f12 f12Var = n12Var.v2;
                        if (f12Var != null) {
                            f12Var.x(40);
                            return;
                        }
                        return;
                    default:
                        n12Var.h3.U(null, null);
                        return;
                }
            }
        });
        m02 m02Var3 = new m02(this, context, (byte) 2);
        this.A2 = m02Var3;
        c41 c41Var = new c41(this, context);
        this.z2 = c41Var;
        m02Var3.addView(c41Var, tre.e(-1, -1, 119));
        jl0 c2 = ll0Var5.c(a12Var, dtd.n(vnbVar), false);
        this.x2 = c2;
        c2.U = true;
        c2.s(hl.L(29.0f), hl.L(29.0f), 0.0f, 0.0f);
        c2.u(hl.L(32.0f));
        c2.S.g = 0.4f;
        c2.n();
        jl0 c3 = ll0Var3.c(c41Var, dtd.n(vnbVar), false);
        this.y2 = c3;
        c3.r(hl.L(22.0f));
        c3.q(hl.L(7.0f));
        c41Var.setPadding(hl.L(7.0f), hl.L(5.0f), hl.L(7.0f), hl.L(5.0f));
        m02Var3.setWillNotDraw(false);
        m02Var3.setVisibility(4);
        m02Var3.setAlpha(0.0f);
        this.b.addView(m02Var3, tre.e(-1, -2, 83));
        m02Var3.setOnTouchListener(new b02((byte) 0));
        in inVar2 = new in(context, false, false, false);
        this.t1 = inVar2;
        inVar2.setAllowCancel(true);
        inVar2.setScaleProperty(0.6f);
        inVar2.setVisibility(8);
        inVar2.setTextSize(hl.L(15.0f));
        int i7 = aob.y6;
        yob.U(inVar2, i7, vnbVar);
        inVar2.setTypeface(hl.o());
        inVar2.setGravity(17);
        c41Var.addView(inVar2, tre.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.v1 = imageView4;
        hc hcVar = new hc(context);
        this.w1 = hcVar;
        imageView4.setImageDrawable(hcVar);
        imageView4.setScaleType(scaleType);
        int i8 = aob.Nl;
        yob.s(imageView4, i8, vnbVar, mode);
        int i9 = aob.i6;
        hf0 f05 = aob.f0(aob.v0(i9, this.J0), 1, hl.L(16.0f));
        uob M5 = yob.M(i9);
        imageView4.setBackground(f05);
        yob.j(imageView4, f05, null, M5, vnbVar);
        c41Var.addView(imageView4, tre.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(ob6.M0(2131755003, null));
        iye.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final n12 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                zu1 zu1Var;
                byte b = r3;
                vnb vnbVar2 = vnbVar;
                final n12 n12Var = this.b;
                boolean z5 = false;
                boolean z6 = true;
                switch (b) {
                    case 0:
                        p02 p02Var = n12Var.B2;
                        if (p02Var != null) {
                            uc7.e1().edit().putInt("aihintshown", 3).apply();
                            b1 b1Var = new b1(n12Var.getContext(), vnbVar2);
                            b1Var.q1(p02Var.getText());
                            b1Var.e2 = new pcc() {
                                @Override
                                public final void a(Object obj) {
                                    byte b2 = r2;
                                    n12 n12Var2 = n12Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b2) {
                                        case 0:
                                            p02 p02Var2 = n12Var2.B2;
                                            p02Var2.setText(charSequence);
                                            p02Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            r02 r02Var2 = n12Var2.M2;
                                            r02Var2.setText(charSequence);
                                            r02Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j = n12Var.T1;
                            if (n12Var.E3 == null) {
                                z6 = false;
                            }
                            b1Var.o1(j, z6, new e02(n12Var, (byte) 0));
                            b1Var.show();
                            return;
                        }
                        return;
                    case 1:
                        r02 r02Var = n12Var.M2;
                        if (r02Var != null) {
                            uc7.e1().edit().putInt("aihintshown", 3).apply();
                            b1 b1Var2 = new b1(n12Var.getContext(), vnbVar2);
                            b1Var2.q1(r02Var.getText());
                            b1Var2.e2 = new pcc() {
                                @Override
                                public final void a(Object obj) {
                                    byte b2 = r2;
                                    n12 n12Var2 = n12Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b2) {
                                        case 0:
                                            p02 p02Var2 = n12Var2.B2;
                                            p02Var2.setText(charSequence);
                                            p02Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            r02 r02Var2 = n12Var2.M2;
                                            r02Var2.setText(charSequence);
                                            r02Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j2 = n12Var.T1;
                            if (n12Var.E3 != null) {
                                z5 = true;
                            }
                            b1Var2.o1(j2, z5, new e02(n12Var, (byte) 1));
                            b1Var2.show();
                            return;
                        }
                        return;
                    default:
                        n12Var.h3.U(null, null);
                        PhotoViewer q0 = PhotoViewer.q0();
                        e eVar2 = n12Var.Z1;
                        q0.T1(null, eVar2, vnbVar2);
                        PhotoViewer.q0().U1(n12Var);
                        PhotoViewer q02 = PhotoViewer.q0();
                        int i62 = n12Var.P3;
                        boolean z7 = n12Var.Q3;
                        q02.h = i62;
                        q02.n = z7;
                        if (!n12Var.W3.o()) {
                            hl.t1(eVar2.getFragmentView().findFocus());
                            hl.t1(n12Var.c.findFocus());
                        }
                        File w = c8b.w(n12Var.G3, "webp");
                        Point point = hl.q;
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
                            cc4.g(th, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        no6 no6Var = new no6(0, w.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(no6Var);
                        PhotoViewer q03 = PhotoViewer.q0();
                        e12 e12Var = new e12(n12Var, no6Var);
                        if (eVar2 instanceof zu1) {
                            zu1Var = (zu1) eVar2;
                        } else {
                            zu1Var = null;
                        }
                        q03.o1(arrayList2, 0, 11, false, e12Var, zu1Var);
                        if (n12Var.A1) {
                            PhotoViewer.q0().U(null, null, true, n12Var.D1);
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
        this.E1 = uc7.s1(yac.t0).H0();
        p02 p02Var = new p02(this, context, a12Var, vnbVar);
        this.B2 = p02Var;
        p02Var.K = true;
        p02Var.setHint(ob6.M0(2131754447, "AddCaption"));
        p02Var.s();
        p02Var.getEditText().setLayoutParams(tre.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        p02Var.getEditText().addTextChangedListener(new q02(this, (byte) 0));
        c41Var.addView(p02Var, tre.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        c41Var.setClipChildren(false);
        m02Var3.setClipChildren(false);
        p02Var.setClipChildren(false);
        ttVar.setPadding(hl.L(10.0f), hl.L(2.0f), hl.L(10.0f), hl.L(10.0f));
        ttVar.setWillNotDraw(false);
        r02 r02Var = new r02(this, context, a12Var, vnbVar);
        this.M2 = r02Var;
        r02Var.K = true;
        r02Var.getEditText().addTextChangedListener(new t02(this, eVar));
        r02Var.getEditText().setPadding(0, hl.L(9.0f), 0, hl.L(9.0f));
        r02Var.getEditText().setLayoutParams(tre.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        r02Var.getEditText().setTextSize(1, 17.0f);
        r02Var.getEmojiButton().setLayoutParams(tre.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        r02Var.setHint(ob6.M0(2131754447, "AddCaption"));
        ttVar.addView(r02Var, tre.e(-1, -2, 119));
        ttVar.setAlpha(0.0f);
        ttVar.setVisibility(8);
        p02Var.addView(imageView3, tre.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        jl0 c4 = ll0Var3.c(ttVar, dtd.n(vnbVar), false);
        c4.r(hl.L(22.0f));
        c4.q(hl.L(7.0f));
        ttVar.setBackground(c4);
        ttVar.setPadding(hl.L(11.0f), hl.L(9.0f), hl.L(11.0f), hl.L(9.0f));
        in inVar3 = new in(context, false, false, false);
        this.u1 = inVar3;
        inVar3.setScaleProperty(0.6f);
        inVar3.setVisibility(8);
        inVar3.setTextSize(hl.L(15.0f));
        yob.U(inVar3, i7, vnbVar);
        inVar3.setTypeface(hl.o());
        inVar3.setGravity(17);
        inVar3.setAllowCancel(true);
        ttVar.addView(inVar3, tre.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(2131231843);
        yob.s(imageView5, aob.Oe, vnbVar, mode2);
        r02Var.addView(imageView5, tre.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final n12 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                j22 j22Var;
                int i62;
                byte b = r2;
                boolean z5 = false;
                n12 n12Var = this.b;
                switch (b) {
                    case 0:
                        if (n12Var.v2 != n12Var.k2) {
                            z5 = true;
                        }
                        n12Var.K1(z5);
                        return;
                    case 1:
                        long j = n12Var.T2;
                        if (j < 0 && (j22Var = (j22) n12Var.u2.get(-j)) != null) {
                            rv0 webViewContainer = j22Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = n12Var.W1;
                        if (!z6) {
                            n12Var.r1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = n12Var.W1;
                        if (z7) {
                            n12Var.r1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        n12Var.j1();
                        return;
                    case 5:
                        n12Var.X2.U(null, null);
                        return;
                    case 6:
                        if (n12Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z8 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = n12Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof no6) {
                                        no6 no6Var = (no6) entry.getValue();
                                        if (no6Var.d()) {
                                            no6Var.O = Boolean.valueOf(S);
                                            for (int i72 = 0; i72 < chatAttachAlertPhotoLayout2.F.getChildCount(); i72++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i72);
                                                if (childAt instanceof d88) {
                                                    d88 d88Var = (d88) childAt;
                                                    if (d88Var.getPhotoEntry() == no6Var) {
                                                        d88Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                xea.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            n12Var.J1(true);
                            s7 s7Var32 = n12Var.Z2;
                            kg5 kg5Var = n12Var.a3;
                            if (kg5Var != null) {
                                kg5Var.f(true);
                            }
                            kg5 kg5Var2 = new kg5(n12Var.getContext(), 1);
                            n12Var.a3 = kg5Var2;
                            if (!S) {
                                i62 = 2131748586;
                            } else {
                                i62 = 2131748587;
                            }
                            kg5Var2.t(hl.S2(ob6.M0(i62, null)));
                            n12Var.a3.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            n12Var.a3.o(1.0f, -((n12Var.b.getWidth() - ((s7Var32.getWidth() / 2.0f) + s7Var32.getX())) - hl.L(14.0f)));
                            n12Var.a3.setTranslationY(n12Var.X2.getTranslationY());
                            kg5 kg5Var3 = n12Var.a3;
                            kg5Var3.r0 = new dy1(n12Var, kg5Var2, (byte) 4);
                            n12Var.b.addView(kg5Var3, tre.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            n12Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        f12 f12Var = n12Var.v2;
                        if (f12Var != null) {
                            f12Var.x(40);
                            return;
                        }
                        return;
                    default:
                        n12Var.h3.U(null, null);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.x1 = imageView6;
        hc hcVar2 = new hc(context);
        this.y1 = hcVar2;
        imageView6.setImageDrawable(hcVar2);
        imageView6.setScaleType(scaleType);
        yob.s(imageView6, i8, vnbVar, mode);
        hf0 f06 = aob.f0(aob.v0(i9, this.J0), 1, hl.L(16.0f));
        uob M6 = yob.M(i9);
        imageView6.setBackground(f06);
        yob.j(imageView6, f06, null, M6, vnbVar);
        ttVar.addView(imageView6, tre.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(ob6.M0(2131755003, null));
        iye.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final n12 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                zu1 zu1Var;
                byte b = r3;
                vnb vnbVar2 = vnbVar;
                final n12 n12Var = this.b;
                boolean z5 = false;
                boolean z6 = true;
                switch (b) {
                    case 0:
                        p02 p02Var2 = n12Var.B2;
                        if (p02Var2 != null) {
                            uc7.e1().edit().putInt("aihintshown", 3).apply();
                            b1 b1Var = new b1(n12Var.getContext(), vnbVar2);
                            b1Var.q1(p02Var2.getText());
                            b1Var.e2 = new pcc() {
                                @Override
                                public final void a(Object obj) {
                                    byte b2 = r2;
                                    n12 n12Var2 = n12Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b2) {
                                        case 0:
                                            p02 p02Var22 = n12Var2.B2;
                                            p02Var22.setText(charSequence);
                                            p02Var22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            r02 r02Var2 = n12Var2.M2;
                                            r02Var2.setText(charSequence);
                                            r02Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j = n12Var.T1;
                            if (n12Var.E3 == null) {
                                z6 = false;
                            }
                            b1Var.o1(j, z6, new e02(n12Var, (byte) 0));
                            b1Var.show();
                            return;
                        }
                        return;
                    case 1:
                        r02 r02Var2 = n12Var.M2;
                        if (r02Var2 != null) {
                            uc7.e1().edit().putInt("aihintshown", 3).apply();
                            b1 b1Var2 = new b1(n12Var.getContext(), vnbVar2);
                            b1Var2.q1(r02Var2.getText());
                            b1Var2.e2 = new pcc() {
                                @Override
                                public final void a(Object obj) {
                                    byte b2 = r2;
                                    n12 n12Var2 = n12Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b2) {
                                        case 0:
                                            p02 p02Var22 = n12Var2.B2;
                                            p02Var22.setText(charSequence);
                                            p02Var22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            r02 r02Var22 = n12Var2.M2;
                                            r02Var22.setText(charSequence);
                                            r02Var22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j2 = n12Var.T1;
                            if (n12Var.E3 != null) {
                                z5 = true;
                            }
                            b1Var2.o1(j2, z5, new e02(n12Var, (byte) 1));
                            b1Var2.show();
                            return;
                        }
                        return;
                    default:
                        n12Var.h3.U(null, null);
                        PhotoViewer q0 = PhotoViewer.q0();
                        e eVar2 = n12Var.Z1;
                        q0.T1(null, eVar2, vnbVar2);
                        PhotoViewer.q0().U1(n12Var);
                        PhotoViewer q02 = PhotoViewer.q0();
                        int i62 = n12Var.P3;
                        boolean z7 = n12Var.Q3;
                        q02.h = i62;
                        q02.n = z7;
                        if (!n12Var.W3.o()) {
                            hl.t1(eVar2.getFragmentView().findFocus());
                            hl.t1(n12Var.c.findFocus());
                        }
                        File w = c8b.w(n12Var.G3, "webp");
                        Point point = hl.q;
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
                            cc4.g(th, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        no6 no6Var = new no6(0, w.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(no6Var);
                        PhotoViewer q03 = PhotoViewer.q0();
                        e12 e12Var = new e12(n12Var, no6Var);
                        if (eVar2 instanceof zu1) {
                            zu1Var = (zu1) eVar2;
                        } else {
                            zu1Var = null;
                        }
                        q03.o1(arrayList2, 0, 11, false, e12Var, zu1Var);
                        if (n12Var.A1) {
                            PhotoViewer.q0().U(null, null, true, n12Var.D1);
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
        m02 m02Var4 = new m02(this, context, (byte) 3);
        this.E2 = m02Var4;
        m02Var4.setFocusable(true);
        m02Var4.setFocusableInTouchMode(true);
        m02Var4.setVisibility(4);
        m02Var4.setScaleX(0.2f);
        m02Var4.setScaleY(0.2f);
        m02Var4.setAlpha(0.0f);
        m02Var4.setClipChildren(false);
        m02Var4.setClipToPadding(false);
        this.b.addView(m02Var4, tre.e(110, 50, 85));
        u02 u02Var = new u02(this, vnbVar, context);
        this.F2 = u02Var;
        u02Var.setImportantForAccessibility(2);
        m02Var4.addView(u02Var, tre.e(-1, -1, 119));
        u02Var.setTranslationX(this.u0);
        int L4 = hl.L(52.0f);
        int L5 = hl.L(38.0f);
        u02Var.L = L4;
        u02Var.M = L5;
        u02Var.P = hl.L(7.0f);
        u02Var.Q = hl.L(6.0f);
        u02Var.t0 = true;
        u02Var.setOnClickListener(new View.OnClickListener(this) {
            public final n12 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                j22 j22Var;
                int i62;
                byte b = r2;
                boolean z5 = false;
                n12 n12Var = this.b;
                switch (b) {
                    case 0:
                        if (n12Var.v2 != n12Var.k2) {
                            z5 = true;
                        }
                        n12Var.K1(z5);
                        return;
                    case 1:
                        long j = n12Var.T2;
                        if (j < 0 && (j22Var = (j22) n12Var.u2.get(-j)) != null) {
                            rv0 webViewContainer = j22Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = n12Var.W1;
                        if (!z6) {
                            n12Var.r1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = n12Var.W1;
                        if (z7) {
                            n12Var.r1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        n12Var.j1();
                        return;
                    case 5:
                        n12Var.X2.U(null, null);
                        return;
                    case 6:
                        if (n12Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z8 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = n12Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof no6) {
                                        no6 no6Var = (no6) entry.getValue();
                                        if (no6Var.d()) {
                                            no6Var.O = Boolean.valueOf(S);
                                            for (int i72 = 0; i72 < chatAttachAlertPhotoLayout2.F.getChildCount(); i72++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i72);
                                                if (childAt instanceof d88) {
                                                    d88 d88Var = (d88) childAt;
                                                    if (d88Var.getPhotoEntry() == no6Var) {
                                                        d88Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                xea.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            n12Var.J1(true);
                            s7 s7Var32 = n12Var.Z2;
                            kg5 kg5Var = n12Var.a3;
                            if (kg5Var != null) {
                                kg5Var.f(true);
                            }
                            kg5 kg5Var2 = new kg5(n12Var.getContext(), 1);
                            n12Var.a3 = kg5Var2;
                            if (!S) {
                                i62 = 2131748586;
                            } else {
                                i62 = 2131748587;
                            }
                            kg5Var2.t(hl.S2(ob6.M0(i62, null)));
                            n12Var.a3.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            n12Var.a3.o(1.0f, -((n12Var.b.getWidth() - ((s7Var32.getWidth() / 2.0f) + s7Var32.getX())) - hl.L(14.0f)));
                            n12Var.a3.setTranslationY(n12Var.X2.getTranslationY());
                            kg5 kg5Var3 = n12Var.a3;
                            kg5Var3.r0 = new dy1(n12Var, kg5Var2, (byte) 4);
                            n12Var.b.addView(kg5Var3, tre.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            n12Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        f12 f12Var = n12Var.v2;
                        if (f12Var != null) {
                            f12Var.x(40);
                            return;
                        }
                        return;
                    default:
                        n12Var.h3.U(null, null);
                        return;
                }
            }
        });
        u02Var.setOnLongClickListener(new am1(this, context, vnbVar, eVar, (byte) 1));
        textPaint.setTextSize(hl.L(12.0f));
        textPaint.setTypeface(hl.o());
        o02 o02Var2 = new o02(this, context, (byte) 1);
        o02Var2.setAlpha(0.0f);
        o02Var2.setScaleX(0.2f);
        o02Var2.setScaleY(0.2f);
        if (z) {
            I0();
            i = -1;
            this.G0 = -1;
        } else {
            i = -1;
        }
        chatAttachAlertPhotoLayout.F.getFastScroll().a(ll0Var3, dtd.n(vnbVar));
        fz7 fz7Var = new fz7(context);
        this.M1 = fz7Var;
        this.b.addView(fz7Var, tre.c(-1.0f, i));
        ol0 ol0Var = new ol0(vnbVar);
        ol0Var.e = new xz1(this, (byte) 4);
        ol0Var.c = new xz1(this, (byte) 5);
        ol0Var.d = new xz1(this, (byte) 6);
        ol0Var.b = new xz1(this, (byte) 7);
        float N = hl.N(3.3333333f);
        float N2 = hl.N(0.6666667f);
        ol0Var.n = N;
        ol0Var.r = N2;
        float N3 = hl.N(1.0f);
        float N4 = hl.N(0.6666667f);
        ol0Var.f = N3;
        ol0Var.h = N4;
        y10Var.P(ll0Var3, ol0Var, false);
        xa9Var.h(1L, false);
        this.X0.i(this.b);
        vy4 vy4Var2 = this.X0;
        vy4Var2.a = new xz1(this, (byte) 8);
        vy4Var2.d = new gz4(hl.L(48.0f));
    }

    public static boolean c1(TLRPC.User user) {
        if (user != null && !lbc.D(user) && !lbc.v(user) && !lbc.z(user) && !lbc.C(user.id) && !lbc.B(user) && !lbc.u(user) && user.id != 489000 && !uc7.K2(user)) {
            return true;
        }
        return false;
    }

    public static void o1(f12 f12Var) {
        if (f12Var != null) {
            int i = yob.b;
            Object tag = f12Var.getTag(2131296712);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                return;
            }
            f12Var.setTag(2131296712, Integer.valueOf(i));
            try {
                yob.c0(f12Var, true);
                f12Var.d();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final boolean A1(boolean z, boolean z2) {
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
        f12 f12Var;
        float f10;
        float L;
        long M1;
        float f11;
        float f12;
        y10 y10Var;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float L2;
        this.m1.a(z, true);
        m02 m02Var = this.A2;
        if (m02Var.getTag() != null) {
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
        m02Var.setTag(num);
        p02 p02Var = this.B2;
        if (p02Var.getEditText().isFocused()) {
            hl.t1(p02Var.getEditText());
        }
        p02Var.k(true);
        this.M2.k(true);
        m02 m02Var2 = this.u3;
        m02 m02Var3 = this.E2;
        if (z) {
            if (!this.H1) {
                m02Var.setVisibility(0);
            }
            m02Var3.setVisibility(0);
        } else if (this.P2) {
            m02Var2.setVisibility(0);
        }
        f12 f12Var2 = this.v2;
        if ((f12Var2 == this.d2 || f12Var2 == this.k2) && this.W1) {
            z4 = true;
        } else {
            z4 = false;
        }
        y10 y10Var2 = this.U2;
        tt ttVar = this.L2;
        c41 c41Var = this.z2;
        u02 u02Var = this.F2;
        float f20 = 1.0f;
        if (z2) {
            this.J2 = new AnimatorSet();
            if (z4) {
                ttVar.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(m02Var, property, f11));
            if (z && !z4) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(c41Var, property, f12));
            if (z && !z4) {
                c41Var.setVisibility(0);
                y10Var = y10Var2;
                arrayList.add(ObjectAnimator.ofFloat(c41Var, View.TRANSLATION_Y, 0.0f));
            } else {
                y10Var = y10Var2;
            }
            if (z && z4) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ttVar, property, f13));
            Property property2 = View.SCALE_X;
            if (z) {
                f14 = 1.0f;
            } else {
                f14 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(m02Var3, property2, f14));
            Property property3 = View.SCALE_Y;
            if (z) {
                f15 = 1.0f;
            } else {
                f15 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(m02Var3, property3, f15));
            if (z) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(m02Var3, property, f16));
            if (z) {
                f17 = 1.0f;
            } else {
                f17 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(u02Var, property2, f17));
            if (z) {
                f18 = 1.0f;
            } else {
                f18 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(u02Var, property3, f18));
            if (y10Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (z) {
                    L2 = 0.0f;
                } else {
                    L2 = hl.L(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(m02Var, property4, L2));
            } else if (this.P2) {
                Property property5 = View.TRANSLATION_Y;
                if (z) {
                    f19 = hl.L(36.0f);
                } else {
                    f19 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(m02Var2, property5, f19));
                if (z) {
                    f20 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(m02Var2, property, f20));
            }
            if (z4) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new yz1(this, (byte) 5));
                arrayList.add(ofFloat);
            }
            this.J2.playTogether(arrayList);
            this.J2.setInterpolator(new DecelerateInterpolator());
            this.J2.setDuration(180L);
            this.J2.addListener(new y5(this, z, z4, (byte) 3));
            this.J2.start();
            i = 0;
        } else {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            m02Var.setAlpha(f);
            if (z && z4) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            c41Var.setAlpha(f2);
            if (z && !z4) {
                i = 0;
                c41Var.setVisibility(0);
                f3 = 0.0f;
                c41Var.setTranslationY(0.0f);
            } else {
                f3 = 0.0f;
                i = 0;
            }
            if (z) {
                f4 = 1.0f;
            } else {
                f4 = 0.2f;
            }
            m02Var3.setScaleX(f4);
            if (z) {
                f5 = 1.0f;
            } else {
                f5 = 0.2f;
            }
            m02Var3.setScaleY(f5);
            if (z) {
                f6 = 1.0f;
            } else {
                f6 = f3;
            }
            m02Var3.setAlpha(f6);
            if (z && z4) {
                i2 = i;
            } else {
                i2 = 8;
            }
            ttVar.setVisibility(i2);
            if (z && z4) {
                f7 = 1.0f;
            } else {
                f7 = f3;
            }
            ttVar.setAlpha(f7);
            if (z) {
                f8 = 1.0f;
            } else {
                f8 = 0.2f;
            }
            u02Var.setScaleX(f8);
            if (z) {
                f9 = 1.0f;
            } else {
                f9 = 0.2f;
            }
            u02Var.setScaleY(f9);
            if (y10Var2.getTag() != null) {
                if (z) {
                    L = f3;
                } else {
                    L = hl.L(48.0f);
                }
                m02Var.setTranslationY(L);
            } else if (this.P2 && ((f12Var = this.v2) == null || f12Var.M())) {
                if (z) {
                    f10 = hl.L(84.0f);
                } else {
                    f10 = f3;
                }
                m02Var2.setTranslationY(f10);
            }
            if (!z) {
                m02Var.setVisibility(4);
                m02Var3.setVisibility(4);
            }
            if (z4) {
                M1();
            }
        }
        if (z) {
            i = Math.max(1, this.v2.getSelectedItemsCount());
        }
        u02Var.g(i, z2);
        if (this.E3 != null) {
            M1 = 0;
        } else {
            M1 = uc7.s1(this.G3).M1(W0());
        }
        u02Var.i(S0() + this.v2.getSelectedItemsCount(), M1, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p02Var.getLayoutParams();
        int max = Math.max(hl.L(48.0f), u02Var.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            p02Var.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    @Override
    public final boolean B0() {
        f12 f12Var = this.v2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (f12Var == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.j1) {
            return true;
        }
        return false;
    }

    public final void B1(f12 f12Var) {
        long j = this.T2;
        w72 w72Var = this.N1;
        if (f12Var == w72Var) {
            j = w72Var.s;
        } else if (f12Var == this.d2) {
            j = 1;
        } else if (f12Var == this.f2) {
            j = 3;
        } else if (f12Var == this.j2) {
            j = 4;
        } else if (f12Var == this.e2) {
            j = 5;
        } else if (f12Var == this.i2) {
            j = 6;
        } else if (f12Var == this.g2) {
            j = 9;
        } else if (f12Var == this.l2) {
            j = 10;
        } else if (f12Var == this.m2) {
            j = 11;
        } else if (f12Var == this.h2) {
            j = 12;
        } else if (f12Var == this.n2) {
            j = 14;
        } else if (f12Var == this.o2) {
            j = 13;
        } else if (f12Var == this.p2) {
            j = 16;
        } else if (f12Var == this.q2) {
            j = 17;
        }
        C1(f12Var, j, true);
    }

    public final void C1(f12 f12Var, long j, boolean z) {
        boolean z2;
        int i;
        r52 r52Var;
        boolean z3;
        Integer num;
        r52 r52Var2;
        Float f;
        int i2;
        boolean z4;
        Float valueOf = Float.valueOf(0.0f);
        if (this.q3 == null && this.J2 == null) {
            f12 f12Var2 = this.v2;
            if (f12Var2 == f12Var) {
                f12Var2.J();
                return;
            }
            int i3 = 0;
            if (f12Var == this.h2 && !yac.h(this.G3).p()) {
                new xk8(this.Z1, 39, false).show();
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
            m02 m02Var = this.u3;
            m02Var.setAlpha(1.0f);
            m02Var.setTranslationY(this.C3);
            int i5 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.u2;
                if (i5 >= longSparseArray.size()) {
                    break;
                }
                ((j22) longSparseArray.valueAt(i5)).setMeasureOffsetY(0);
                i5++;
            }
            this.T2 = j;
            n02 n02Var = this.v3;
            int childCount = n02Var.getChildCount();
            int i6 = 0;
            while (i6 < childCount) {
                View childAt = n02Var.getChildAt(i6);
                if (childAt instanceof h12) {
                    h12 h12Var = (h12) childAt;
                    i2 = childCount;
                    f = valueOf;
                    if (h12Var.b == h12Var.c.T2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    h12Var.a.f(z4, true);
                } else {
                    f = valueOf;
                    i2 = childCount;
                    if (childAt instanceof g12) {
                        ((g12) childAt).a(true);
                    }
                }
                i6++;
                childCount = i2;
                valueOf = f;
            }
            Float f2 = valueOf;
            int firstOffset = (this.v2.getFirstOffset() - hl.L(11.0f)) - this.Y3[0];
            this.w2 = f12Var;
            L0(f12Var);
            if (this.w2.j() != 0) {
                i = 0;
            } else {
                i = 4;
            }
            y10 y10Var = this.U2;
            y10Var.setVisibility(i);
            if (y10Var.o0) {
                y10Var.o(true);
            }
            this.v2.v();
            f12 f12Var3 = this.w2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
            if (f12Var3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.w2.H(this.v2);
            this.w2.setVisibility(0);
            if (f12Var.getParent() != null) {
                this.b.removeView(this.w2);
            }
            int indexOfChild = this.b.indexOfChild(this.v2);
            if (this.w2.getParent() != this.b) {
                o1(this.w2);
                ViewGroup viewGroup = this.b;
                f12 f12Var4 = this.w2;
                if (f12Var4 != this.i2) {
                    indexOfChild++;
                }
                viewGroup.addView(f12Var4, indexOfChild, tre.c(-1.0f, -1));
            }
            vq0 vq0Var = new vq0(this, (byte) 6);
            f12 f12Var5 = this.v2;
            boolean z5 = f12Var5 instanceof c62;
            y02 y02Var = this.Y1;
            if (!z5 && !(this.w2 instanceof c62)) {
                if (z) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.w2.setAlpha(0.0f);
                    this.w2.setTranslationY(hl.L(78.0f));
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this.v2, View.TRANSLATION_Y, hl.L(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.v2, y02Var, 0.0f, 1.0f), ObjectAnimator.ofFloat(y10Var, View.ALPHA, y10Var.getAlpha(), 0.0f));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(k43.f);
                    animatorSet.addListener(new v02(this, firstOffset, vq0Var, (byte) 0));
                    this.q3 = animatorSet;
                    f12 f12Var6 = this.v2;
                    y02Var.getClass();
                    y02Var.a(f12Var6, f2);
                    animatorSet.start();
                } else {
                    f12Var5.setAlpha(0.0f);
                    vq0Var.run();
                    L1(0);
                    this.b.invalidate();
                }
            } else {
                int max = Math.max(this.w2.getWidth(), this.v2.getWidth());
                f12 f12Var7 = this.w2;
                if (f12Var7 instanceof c62) {
                    f12Var7.setTranslationX(max);
                    f12 f12Var8 = this.v2;
                    if ((f12Var8 instanceof ChatAttachAlertPhotoLayout) && (r52Var2 = ((ChatAttachAlertPhotoLayout) f12Var8).Q) != null) {
                        r52Var2.setVisibility(4);
                    }
                } else {
                    this.v2.setTranslationX(-max);
                    f12 f12Var9 = this.w2;
                    if (f12Var9 == chatAttachAlertPhotoLayout && (r52Var = ((ChatAttachAlertPhotoLayout) f12Var9).Q) != null) {
                        r52Var.setVisibility(0);
                    }
                }
                this.w2.setAlpha(1.0f);
                this.v2.setAlpha(1.0f);
                if (z) {
                    f12 f12Var10 = this.v2;
                    y02Var.getClass();
                    y02Var.a(f12Var10, f2);
                    hl.c3(new on1(this, f12Var, vq0Var, (byte) 15));
                } else {
                    if (this.w2.getCurrentItemTop() <= f12Var.getButtonsHideOffset()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.v2.w(1.0f);
                    this.w2.w(1.0f);
                    this.v2.m(this.i4);
                    this.w2.m(this.i4);
                    this.b.invalidate();
                    this.X0.g();
                    f12 f12Var11 = this.v2;
                    Float valueOf2 = Float.valueOf(1.0f);
                    y02Var.getClass();
                    y02Var.a(f12Var11, valueOf2);
                    if (z3) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    y10Var.setTag(num);
                    vq0Var.run();
                }
            }
            if (this.j4 && !(f12Var instanceof j22)) {
                this.j4 = false;
                y10Var.updateColors();
                y10Var.invalidate();
                e1();
            }
            if (i4 != 0 && j != 6 && j != 17 && !(f12Var instanceof j22)) {
                if (j == 4) {
                    i3 = hl.L(84.0f);
                }
            } else {
                i3 = hl.L(46.0f);
            }
            y10Var.setForcedMenuWidth(i3);
        }
    }

    @Override
    public final boolean D() {
        return false;
    }

    public final void D1(boolean z, Boolean bool) {
        n12 n12Var;
        if (this.g2 == null) {
            n12Var = this;
            a72 a72Var = new a72(n12Var, getContext(), false, this.J0, bool);
            n12Var.g2 = a72Var;
            n12Var.t2[1] = a72Var;
            a72Var.setDelegate(new xz1(n12Var, (byte) 16));
        } else {
            n12Var = this;
        }
        n12Var.C1(n12Var.g2, 9L, z);
    }

    @Override
    public final boolean E() {
        return this.v2.b();
    }

    public final void E1(boolean z, boolean z2) {
        Integer num;
        boolean z3;
        float f;
        float f2;
        f12 f12Var;
        float f3;
        float f4;
        float f5;
        int i;
        boolean z4;
        this.n1.a(z, z2);
        y10 y10Var = this.U2;
        Object tag = y10Var.getTag();
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
        y10Var.setTag(num);
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
        m02 m02Var = this.u3;
        s7 s7Var = this.X2;
        if (z) {
            if (z3) {
                s7Var.setVisibility(0);
                s7Var.setClickable(true);
            }
        } else if (this.P2 && this.A2.getTag() == null) {
            m02Var.setVisibility(0);
        }
        e eVar = this.Z1;
        if (eVar != null) {
            if (z) {
                if (this.e4) {
                    i = aob.kh;
                } else {
                    i = aob.h5;
                }
                if (vm2.h(aob.v0(i, this.J0)) > 0.699999988079071d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                hl.l3(this, z4);
            } else {
                hl.l3(this, eVar.isLightStatusBar());
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
            animatorSet2.setDuration(Math.abs(f3 - y10Var.getAlpha()) * 180.0f);
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y10Var, property, f4);
            ofFloat.addUpdateListener(new yz1(this, (byte) 2));
            arrayList.add(ofFloat);
            if (z3) {
                if (z) {
                    f7 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(s7Var, property, f7));
                Property property2 = View.SCALE_X;
                if (z) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.6f;
                }
                arrayList.add(ObjectAnimator.ofFloat(s7Var, property2, f5));
                Property property3 = View.SCALE_Y;
                if (z) {
                    f6 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(s7Var, property3, f6));
            }
            this.V2.playTogether(arrayList);
            this.V2.addListener(new z7((byte) 15, this, z));
            this.V2.setInterpolator(k43.h);
            this.V2.setDuration(380L);
            this.V2.start();
            return;
        }
        if (z && this.P2 && ((f12Var = this.v2) == null || f12Var.M())) {
            m02Var.setVisibility(4);
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        y10Var.setAlpha(f);
        if (z3) {
            if (z) {
                f7 = 1.0f;
            }
            s7Var.setAlpha(f7);
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.6f;
            }
            s7Var.setScaleX(f2);
            if (z) {
                f6 = 1.0f;
            }
            s7Var.setScaleY(f6);
        }
        if (!z) {
            s7 s7Var2 = this.b3;
            if (s7Var2 != null) {
                s7Var2.setVisibility(4);
            }
            if (this.N2 != 0 || !this.n3) {
                s7Var.setVisibility(4);
            }
        }
    }

    public final void F0() {
        if (V0().a.length() <= 0) {
            return;
        }
        this.v2.a(V0().getText());
    }

    public final void F1() {
        float alpha;
        int[] iArr = this.D2;
        p02 p02Var = this.B2;
        p02Var.getLocationOnScreen(iArr);
        if (this.B4 != null) {
            f12 f12Var = this.v2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
            if ((f12Var == chatAttachAlertPhotoLayout || f12Var == this.k2) && this.W1) {
                tt ttVar = this.L2;
                alpha = (ttVar.getAlpha() * ttVar.getMeasuredHeight()) + (ttVar.getY() - this.B4.getTop());
            } else {
                alpha = -p02Var.getHeight();
            }
            if (Math.abs(this.B4.getTranslationY() - alpha) > 0.5f) {
                this.B4.setTranslationY(alpha);
                this.B4.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                }
            }
        }
        O0();
    }

    @Override
    public final void G() {
        AnimatorSet animatorSet = this.A0;
        if (animatorSet != null) {
            animatorSet.cancel();
            vpa vpaVar = this.m4;
            if (vpaVar != null) {
                vpaVar.d();
            }
            AnimatorSet animatorSet2 = this.n4;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.A0 = null;
            this.B0 = (byte) 0;
        }
    }

    public final boolean G0() {
        e eVar = this.Z1;
        if ((eVar instanceof zu1) && ((zu1) eVar).V4()) {
            return true;
        }
        return false;
    }

    public final void G1(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n12.G1(int):void");
    }

    @Override
    public void H() {
        l12 l12Var = this.W3;
        if (l12Var != null) {
            l12Var.O0(new vq0(this, (byte) 4));
        } else {
            p1();
        }
    }

    public final boolean H0(CharSequence charSequence) {
        e eVar = this.Z1;
        if (eVar instanceof zu1) {
            return ChatActivityEnterView.N(this.G3, ((zu1) eVar).a(), eVar, charSequence);
        }
        return false;
    }

    public final void H1() {
        boolean i;
        float f;
        float f2;
        float f3;
        f12 f12Var = this.v2;
        int i2 = 0;
        if (f12Var == null) {
            i = false;
        } else {
            i = f12Var.i();
        }
        u8 u8Var = this.c3;
        u8Var.setEnabled(i);
        f12 f12Var2 = this.v2;
        float f4 = 0.5f;
        if (f12Var2 != null) {
            if (f12Var2.i()) {
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
        f12 f12Var3 = this.w2;
        if (f12Var3 != null) {
            if (f12Var3.i()) {
                f4 = 1.0f;
            }
            f = qd4.A(1.0f, this.X1, f4, f);
        }
        this.d3 = f;
        if (u8Var != null) {
            float f5 = f * this.e3;
            u8Var.setAlpha(f5);
            if (f5 <= 0.0f) {
                i2 = 4;
            }
            u8Var.setVisibility(i2);
        }
    }

    @Override
    public final void I(int i) {
        super.I(i);
        this.v2.r(i);
    }

    public final void I0() {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        n02 n02Var = this.v3;
        if (n02Var == null) {
            return;
        }
        int childCount = n02Var.getChildCount();
        boolean z2 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            n02Var.getChildAt(i9);
        }
        boolean z3 = this.e4;
        if (z3) {
            i = aob.Yg;
        } else {
            i = aob.j5;
        }
        yob.X(this.g3, i, this.J0);
        if (z3) {
            i2 = aob.Yg;
        } else {
            i2 = aob.j5;
        }
        yob.X(this.l3, i2, this.J0);
        yob.X(this.c3, aob.Ji, this.J0);
        if (z3) {
            i3 = aob.Yg;
        } else {
            i3 = aob.j5;
        }
        int v0 = aob.v0(i3, this.J0);
        if (this.q4 && v0 == this.p4) {
            z = false;
        } else {
            z = true;
        }
        this.q4 = true;
        this.p4 = v0;
        s7 s7Var = this.X2;
        if (z) {
            s7Var.setIconColor(v0);
        }
        Drawable background = s7Var.getBackground();
        if (z3) {
            i4 = aob.Zg;
        } else {
            i4 = aob.I5;
        }
        aob.A1(aob.v0(i4, this.J0), background);
        int i10 = aob.E8;
        s7Var.O(aob.v0(i10, this.J0), false);
        s7Var.O(aob.v0(i10, this.J0), true);
        s7Var.I(aob.v0(aob.G8, this.J0));
        s7 s7Var2 = this.Z2;
        if (s7Var2 != null && z) {
            s7Var2.setIconColor(v0);
        }
        s7 s7Var3 = this.b3;
        if (s7Var3 != null) {
            if (z) {
                s7Var3.setIconColor(v0);
            }
            Drawable background2 = s7Var3.getBackground();
            if (z3) {
                i8 = aob.Zg;
            } else {
                i8 = aob.I5;
            }
            aob.A1(aob.v0(i8, this.J0), background2);
        }
        p02 p02Var = this.B2;
        vnb vnbVar = p02Var.N;
        du3 du3Var = p02Var.a;
        int i11 = p02Var.M;
        if (i11 == 0) {
            du3Var.setHintTextColor(aob.v0(aob.H6, vnbVar));
            int i12 = aob.G6;
            du3Var.setCursorColor(aob.v0(i12, vnbVar));
            du3Var.setTextColor(aob.v0(i12, vnbVar));
        } else if (i11 != 2 && i11 != 3) {
            du3Var.setHintTextColor(aob.v0(aob.t5, vnbVar));
            du3Var.setTextColor(aob.v0(aob.j5, vnbVar));
        } else {
            du3Var.setHintTextColor(-1929379841);
            du3Var.setTextColor(-1);
            du3Var.setCursorColor(-1);
            du3Var.setHandlesColor(-1);
            du3Var.setHighlightColor(822083583);
            du3Var.E = -1;
        }
        p02Var.c.setColorFilter(new PorterDuffColorFilter(aob.v0(aob.Oe, vnbVar), PorterDuff.Mode.MULTIPLY));
        eu3 eu3Var = p02Var.d;
        if (eu3Var != null) {
            eu3Var.updateColors();
        }
        yob.l(n02Var, 21, aob.A5, this.J0);
        if (z3) {
            i5 = aob.Yg;
        } else {
            i5 = aob.j5;
        }
        vnb vnbVar2 = this.J0;
        y10 y10Var = this.U2;
        yob.l(y10Var, 1, i5, vnbVar2);
        if (z3) {
            i6 = aob.Zg;
        } else {
            i6 = aob.I5;
        }
        yob.l(y10Var, 3, i6, this.J0);
        if (z3) {
            i7 = aob.Yg;
        } else {
            i7 = aob.j5;
        }
        yob.l(y10Var, 5, i7, this.J0);
        int Z0 = Z0(false);
        aob.A1(Z0, this.s0);
        oz4 oz4Var = this.D4;
        if (oz4Var.b != Z0) {
            oz4Var.a(Z0);
            jz1 jz1Var = this.s3;
            if (jz1Var != null) {
                jz1Var.invalidate();
            }
            o02 o02Var = this.t3;
            if (o02Var != null) {
                o02Var.invalidate();
            }
        }
        this.b.invalidate();
        int i13 = 0;
        while (true) {
            f12[] f12VarArr = this.t2;
            if (i13 >= f12VarArr.length) {
                break;
            }
            f12 f12Var = f12VarArr[i13];
            if (f12Var != null) {
                f12Var.d();
            }
            i13++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            this.H0 = aob.v0(aob.i5, this.J0);
            hl.o3(this, aob.v0(aob.h5, this.J0), false, null);
            if (hl.B(this.H0) > 0.721d) {
                z2 = true;
            }
            hl.i3(this, z2);
            return;
        }
        L(aob.h5);
    }

    public final void I1(f12 f12Var, int i) {
        boolean z;
        int i2;
        int i3;
        if (f12Var != null) {
            tq3 tq3Var = this.C4;
            if (tq3Var != null && Build.VERSION.SDK_INT >= 31) {
                tq3Var.f(0.0f, i);
            }
            int currentItemTop = f12Var.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z2 = false;
                if (f12Var == this.v2 && currentItemTop <= f12Var.getButtonsHideOffset()) {
                    z = true;
                } else {
                    z = false;
                }
                this.L1 = z;
                if (f12Var == this.v2) {
                    E1(z, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f12Var.getLayoutParams();
                if (layoutParams == null) {
                    i2 = 0;
                } else {
                    i2 = layoutParams.topMargin;
                }
                int A = c00.A(11.0f, i2, currentItemTop);
                f12 f12Var2 = this.v2;
                if (f12Var2 == f12Var) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                if ((f12Var2 instanceof c62) || (this.w2 instanceof c62)) {
                    Object obj = this.q3;
                    if ((obj instanceof vpa) && ((vpa) obj).f) {
                        z2 = true;
                    }
                }
                int[] iArr = this.Y3;
                int i4 = iArr[i3];
                if (i4 == A && !z2) {
                    if (i != 0) {
                        this.Z3 = i4;
                        return;
                    }
                    return;
                }
                this.Z3 = i4;
                iArr[i3] = A;
                L1(i3);
                this.b.invalidate();
            }
        }
    }

    public final void J0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n12.J0(boolean):void");
    }

    public final void J1(boolean z) {
        bl2 bl2Var;
        boolean z2;
        float f;
        float f2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (chatAttachAlertPhotoLayout != null && (bl2Var = this.Y2) != null) {
            int i = 0;
            if (this.n3 && this.c2 && this.v2 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.d0()) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = !ChatAttachAlertPhotoLayout.S();
            bl2Var.f = z3;
            if (!z) {
                ((mm) bl2Var.g).a(z3);
            }
            bl2Var.invalidateSelf();
            float f3 = 0.0f;
            float f4 = 0.6f;
            s7 s7Var = this.Z2;
            if (z && this.n3) {
                s7Var.setVisibility(0);
                ViewPropertyAnimator animate = s7Var.animate();
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
                scaleX.scaleY(f4).setDuration(320L).setInterpolator(k43.h).withEndAction(new h02(this, z2, (byte) 0)).start();
                return;
            }
            if (!z2) {
                i = 8;
            }
            s7Var.setVisibility(i);
            if (z2) {
                f3 = 1.0f;
            }
            s7Var.setAlpha(f3);
            if (z2) {
                f = 1.0f;
            } else {
                f = 0.6f;
            }
            s7Var.setScaleX(f);
            if (z2) {
                f4 = 1.0f;
            }
            s7Var.setScaleY(f4);
        }
    }

    public final void K0() {
        float f = this.m1.e;
        float f2 = (1.0f - this.l1.e) * f;
        float min = Math.min(Math.min(1.0f, 1.0f - ((1.0f - f) * (1.0f - this.n1.e))), 1.0f - f2);
        this.t3.setTranslationY(hl.L(48.0f) * min);
    }

    public final void K1(boolean z) {
        boolean z2;
        float f;
        f12 f12Var = this.d2;
        if (z) {
            if (!this.G1) {
                return;
            }
            if (this.k2 == null) {
                Context context = getContext();
                vnb vnbVar = this.s1;
                if (vnbVar == null) {
                    vnbVar = this.J0;
                }
                ?? f12Var2 = new f12(this, vnbVar, context);
                f12Var2.E = 0.0f;
                f12Var2.F = 0.0f;
                f12Var2.G = 0.0f;
                f12Var2.H = 0.0f;
                f12Var2.I = 0.0f;
                f12Var2.J = 0.0f;
                f12Var2.K = null;
                f12Var2.L = false;
                f12Var2.N = 0.0f;
                f12Var2.R = false;
                f12Var2.T = false;
                Point point = hl.q;
                if (point.y > point.x) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                f12Var2.U = z2;
                f12Var2.n = vnbVar;
                f12Var2.f = true;
                f12Var2.setWillNotDraw(false);
                n12 n12Var = f12Var2.b;
                s6 u = n12Var.U2.u();
                TextView textView = new TextView(context);
                f12Var2.y = textView;
                vnb vnbVar2 = f12Var2.a;
                m52 m52Var = new m52(f12Var2, context, u, vnbVar2, (byte) 1);
                y10 y10Var = n12Var.U2;
                if (hl.O1()) {
                    f = 64.0f;
                } else {
                    f = 56.0f;
                }
                y10Var.addView(m52Var, 0, tre.d(-2, -1.0f, 51, f, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                yob.X(textView, aob.j5, vnbVar2);
                textView.setText(ob6.M0(2131753951, null));
                textView.setTypeface(hl.o());
                textView.setCompoundDrawablePadding(hl.L(4.0f));
                textView.setPadding(0, 0, hl.L(10.0f), 0);
                textView.setAlpha(0.0f);
                m52Var.addView(textView, tre.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                gu guVar = new gu(f12Var2, context, vnbVar2, (byte) 10);
                f12Var2.r = guVar;
                guVar.setAdapter(new kr(f12Var2, (byte) 3));
                x46 x46Var = new x46(1, false);
                f12Var2.s = x46Var;
                guVar.setLayoutManager(x46Var);
                guVar.setClipChildren(false);
                guVar.setClipToPadding(false);
                guVar.setOverScrollMode(2);
                guVar.setVerticalScrollBarEnabled(false);
                b62 b62Var = new b62(f12Var2, context);
                f12Var2.w = b62Var;
                b62Var.setClipToPadding(true);
                b62Var.setClipChildren(true);
                f12Var2.addView(guVar, tre.c(-1.0f, -1));
                f12Var2.Q = n12Var.d2;
                b62Var.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = f12Var2.Q;
                b62Var.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                b62Var.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                b62Var.c();
                UndoView undoView = new UndoView(context, null, false, n12Var.s1);
                f12Var2.x = undoView;
                undoView.setEnterOffsetMargin(hl.L(32.0f));
                f12Var2.addView(undoView, tre.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                f12Var2.O = context.getResources().getDrawable(2131232565);
                this.k2 = f12Var2;
                f12Var2.bringToFront();
            }
            f12 f12Var3 = this.v2;
            c62 c62Var = this.k2;
            if (f12Var3 != c62Var) {
                f12Var = c62Var;
            }
            B1(f12Var);
            return;
        }
        B1(f12Var);
    }

    public final void L0(f12 f12Var) {
        int L;
        boolean e = f12Var.e();
        int i = 0;
        jz1 jz1Var = this.s3;
        if (jz1Var != null) {
            if (e) {
                L = 0;
            } else {
                L = hl.L(48.0f);
            }
            jz1Var.setFadeHeightBottom(L);
        }
        o02 o02Var = this.t3;
        if (o02Var != null) {
            if (e) {
                i = 4;
            }
            o02Var.setVisibility(i);
        }
    }

    public final void L1(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n12.L1(int):void");
    }

    public final void M0() {
        y10 y10Var;
        boolean z;
        boolean o;
        int i;
        jz1 jz1Var = this.s3;
        if (jz1Var != null && (y10Var = this.U2) != null) {
            f12 f12Var = this.w2;
            if (f12Var == null) {
                f12Var = this.v2;
            }
            int i2 = 0;
            if (f12Var != null && f12Var.f()) {
                z = true;
            } else {
                z = false;
            }
            vnb vnbVar = this.J0;
            if (vnbVar != null) {
                o = vnbVar.a();
            } else {
                o = aob.I.o();
            }
            if (!z && y10Var.getVisibility() == 0) {
                if (o) {
                    i = 255;
                } else {
                    i = 160;
                }
                i2 = (int) (y10Var.getAlpha() * i);
            }
            jz1Var.setFadeTopAlpha(i2);
        }
    }

    public final void M1() {
        int i = 0;
        L1(0);
        this.o3.invalidate();
        tt ttVar = this.L2;
        ttVar.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (chatAttachAlertPhotoLayout != null) {
            i52 i52Var = chatAttachAlertPhotoLayout.F;
            chatAttachAlertPhotoLayout.V();
            if (i52Var != null && i52Var.getFastScroll() != null) {
                k69 fastScroll = i52Var.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.q1;
                if (this.W1) {
                    i = (int) (ttVar.getAlpha() * ttVar.getMeasuredHeight());
                }
                fastScroll.i0 = currentActionBarHeight + i;
                i52Var.getFastScroll().invalidate();
            }
        }
        F1();
        O0();
    }

    public final void N0() {
        float f;
        float f2 = this.o1.e;
        float f3 = this.p1.e;
        float a = qke.a(this.q1.e);
        if (this.O3) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        zp4.d(this.C2, xnb.C(f2, f3, a, f));
    }

    public final void O0() {
        u02 u02Var = this.F2;
        m02 m02Var = this.E2;
        tt ttVar = this.L2;
        if (ttVar != null && ttVar.getVisibility() == 0 && ttVar.getAlpha() != 0.0f) {
            float f = this.l1.e;
            float abs = Math.abs(hl.R1(-1.0f, 1.0f, f));
            u02Var.setAlpha(abs * abs * abs * abs);
            m02Var.setTranslationY(hl.R1(this.d4, ((ttVar.getTranslationY() + ttVar.getTop()) - m02Var.getTop()) + hl.L(8.0f), k43.j.getInterpolation(f)));
            return;
        }
        m02Var.setTranslationY(this.d4);
        u02Var.setAlpha(1.0f);
    }

    public final void P0() {
        mb1 mb1Var = new mb1(this, getContext(), this.T1, LaunchActivity.Q(), this.J0, (byte) 1);
        this.B4 = mb1Var;
        mb1Var.p(new z8d(this, (byte) 19));
        ViewGroup viewGroup = this.b;
        viewGroup.addView(this.B4, viewGroup.indexOfChild(this.A2), tre.e(-1, -1, 83));
        mb1 mb1Var2 = this.B4;
        mb1Var2.getAdapter().c = false;
        mb1Var2.getAdapter().d = false;
        mb1Var2.getAdapter().e = false;
        e eVar = this.Z1;
        boolean z = true;
        if (eVar instanceof zu1) {
            mb1Var2.getAdapter().n0 = false;
            zu1 zu1Var = (zu1) eVar;
            r17 adapter = mb1Var2.getAdapter();
            zu1Var.h();
            TLRPC.Chat chat = zu1Var.e;
            adapter.getClass();
            adapter.m0 = chat;
            mb1Var2.getAdapter().V(zu1Var.r8);
            r17 adapter2 = mb1Var2.getAdapter();
            if (zu1Var.e == null) {
                z = false;
            }
            adapter2.f0 = z;
        } else {
            mb1Var2.getAdapter().n0 = true;
            mb1Var2.getAdapter().V(null);
            mb1Var2.getAdapter().f0 = false;
        }
        mb1Var2.getAdapter().g0 = false;
        F1();
    }

    public final void Q0(int i) {
        this.P2 = true;
        this.u3.setVisibility(0);
        this.B1 = true;
        this.C1 = i;
        this.N2 = (byte) 0;
        this.z1 = false;
        this.A1 = false;
        this.D1 = null;
        s7 s7Var = this.h3;
        if (s7Var != null) {
            this.g3.setTranslationY(0.0f);
            s7Var.setVisibility(8);
        }
    }

    public final void R0(c cVar) {
        String M0 = ob6.M0(2131752087, null);
        TextView textView = this.g3;
        textView.setText(M0);
        this.P2 = false;
        this.u3.setVisibility(8);
        this.N2 = (byte) 1;
        this.z1 = true;
        this.A1 = true;
        this.c2 = false;
        this.D1 = cVar;
        s7 s7Var = this.h3;
        if (s7Var != null) {
            textView.setTranslationY(-hl.L(8.0f));
            s7Var.setVisibility(0);
            s7Var.setClickable(true);
            s7Var.setAlpha(1.0f);
            s7Var.setScaleX(1.0f);
            s7Var.setScaleY(1.0f);
        }
    }

    @Override
    public final ArrayList S() {
        ArrayList<apb> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            f12[] f12VarArr = this.t2;
            if (i < f12VarArr.length) {
                f12 f12Var = f12VarArr[i];
                if (f12Var != null && (themeDescriptions = f12Var.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i++;
            } else {
                arrayList.add(new apb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.i5));
                return arrayList;
            }
        }
    }

    public final int S0() {
        v47 v47Var;
        t47 t47Var;
        e eVar = this.Z1;
        if (!(eVar instanceof zu1) || (v47Var = ((zu1) eVar).x5) == null || (t47Var = v47Var.b) == null) {
            return 0;
        }
        return t47Var.g.size();
    }

    public final TLRPC.Chat T0() {
        e eVar = this.Z1;
        if (eVar instanceof zu1) {
            return ((zu1) eVar).e;
        }
        return uc7.s1(this.G3).M0(Long.valueOf(-this.T1));
    }

    public final float U0() {
        m02 m02Var = this.A2;
        float alpha = 1.0f - m02Var.getAlpha();
        return m02Var.getMeasuredHeight() - (alpha * (m02Var.getMeasuredHeight() - hl.L(84.0f)));
    }

    public final iu3 V0() {
        f12 f12Var;
        if (this.W1 && ((f12Var = this.v2) == this.d2 || f12Var == this.k2)) {
            return this.M2;
        }
        return this.B2;
    }

    public final long W0() {
        e eVar = this.Z1;
        if (eVar instanceof zu1) {
            return ((zu1) eVar).a();
        }
        return this.T1;
    }

    public final int X0() {
        f12 f12Var = this.v2;
        a72 a72Var = this.g2;
        if (f12Var == a72Var && a72Var.F != null) {
            return a72Var.getEmojiPadding();
        }
        a72 a72Var2 = this.h2;
        if (f12Var == a72Var2 && a72Var2.F != null) {
            return a72Var2.getEmojiPadding();
        }
        if (this.W1) {
            return this.M2.getEmojiPadding();
        }
        return this.B2.getEmojiPadding();
    }

    public final int Y0(int i) {
        f12 f12Var = this.w2;
        int[] iArr = this.Y3;
        if (f12Var != null && ((this.v2 instanceof c62) || (f12Var instanceof c62))) {
            return hl.U1(this.X1, iArr[0], iArr[1]);
        }
        return iArr[i];
    }

    public final int Z0(boolean z) {
        boolean o;
        int i;
        y10 y10Var;
        if (this.e4) {
            return aob.v0(aob.kh, this.J0);
        }
        vnb vnbVar = this.J0;
        if (vnbVar != null) {
            o = vnbVar.a();
        } else {
            o = aob.I.o();
        }
        Iterator it = this.r1.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            y66 y66Var = (y66) it.next();
            long longValue = ((Long) y66Var.a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f += y66Var.c();
            }
        }
        float a = ete.a(f, 0.0f, 1.0f);
        if (z && (y10Var = this.U2) != null && y10Var.getVisibility() == 0) {
            a *= 1.0f - y10Var.getAlpha();
        }
        int v0 = aob.v0(aob.h5, this.J0);
        if (o) {
            i = aob.a7;
        } else {
            i = aob.i5;
        }
        return vm2.f(a, v0, aob.v0(i, this.J0));
    }

    @Override
    public final void a(boolean z) {
        if (z) {
            this.A4 = z;
        }
        dismiss();
    }

    public final void a1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n12.a1():void");
    }

    public final boolean b1() {
        if (this.W1) {
            f12 f12Var = this.v2;
            if (f12Var == this.d2 || f12Var == this.k2) {
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

    public final void d1(EditTextBoldCursor editTextBoldCursor, boolean z) {
        long j;
        l12 l12Var = this.W3;
        if (l12Var != null && !this.r3) {
            boolean o = l12Var.o();
            this.r3 = true;
            ds6 ds6Var = new ds6(this, editTextBoldCursor, z, (byte) 12);
            if (o) {
                j = 200;
            } else {
                j = 0;
            }
            hl.d3(ds6Var, j);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != jn7.T0 && i != jn7.Z4 && i != jn7.F1) {
            if (i == jn7.i5) {
                this.E1 = uc7.s1(yac.t0).H0();
                return;
            }
            return;
        }
        k12 k12Var = this.x3;
        if (k12Var != null) {
            k12Var.f();
        }
    }

    @Override
    public final void dismiss() {
        boolean z;
        r02 r02Var;
        p02 p02Var;
        if (!this.v2.q() && !this.J) {
            f12 f12Var = this.v2;
            h42 h42Var = this.q2;
            if (f12Var == h42Var && h42Var != null && !h42Var.L && h42Var.Q0 != null) {
                z = true;
            } else {
                z = false;
            }
            this.r2 = z;
            if (!z && (p02Var = this.B2) != null) {
                hl.t1(p02Var.getEditText());
            }
            if (!this.r2 && (r02Var = this.M2) != null) {
                hl.t1(r02Var.getEditText());
            }
            this.u2.clear();
            e eVar = this.Z1;
            if (eVar == null) {
                eVar = LaunchActivity.Q();
            }
            if (!this.A4 && eVar != null && this.v2.getSelectedItemsCount() > 0 && !this.z1) {
                if (!this.z4) {
                    this.z4 = true;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, eVar.getParentActivity());
                    String M0 = ob6.M0(2131751364, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = ob6.M0(2131751365, null);
                    alertDialog$Builder.j(ob6.M0(2131751371, null), new xz1(this, (byte) 0));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    idVar.setOnCancelListener(new cs0(this, (byte) 3));
                    idVar.O = new o1(this, (byte) 14);
                    idVar.show();
                    TextView textView = (TextView) idVar.c(-1);
                    if (textView != null) {
                        yob.X(textView, aob.q7, this.J0);
                        return;
                    }
                    return;
                }
                return;
            }
            int i = 0;
            while (true) {
                f12[] f12VarArr = this.t2;
                if (i >= f12VarArr.length) {
                    break;
                }
                f12 f12Var2 = f12VarArr[i];
                if (f12Var2 != null && this.v2 != f12Var2) {
                    f12Var2.q();
                }
                i++;
            }
            hl.o3(this, vm2.o(aob.v0(aob.a7, this.J0), 0), true, new xz1(this, (byte) 10));
            if (eVar != null) {
                hl.l3(this, eVar.isLightStatusBar());
            }
            this.f4 = false;
            super.dismiss();
            this.A4 = false;
        }
    }

    public final void e1() {
        if (this.s0 != null && this.b != null) {
            int Z0 = Z0(false);
            aob.A1(Z0, this.s0);
            oz4 oz4Var = this.D4;
            if (oz4Var.b != Z0) {
                oz4Var.a(Z0);
                jz1 jz1Var = this.s3;
                if (jz1Var != null) {
                    jz1Var.invalidate();
                }
                o02 o02Var = this.t3;
                if (o02Var != null) {
                    o02Var.invalidate();
                }
            }
            H1();
            this.b.invalidate();
        }
    }

    public final void f1() {
        int i = 0;
        while (true) {
            f12[] f12VarArr = this.t2;
            if (i >= f12VarArr.length) {
                break;
            }
            f12 f12Var = f12VarArr[i];
            if (f12Var != null) {
                f12Var.p();
            }
            i++;
        }
        int i2 = this.G3;
        jn7.f(i2).n(this, jn7.T0);
        jn7.f(i2).n(this, jn7.Z4);
        jn7.f(i2).n(this, jn7.i5);
        jn7.f(i2).n(this, jn7.F1);
        this.P1 = true;
        p02 p02Var = this.B2;
        if (p02Var != null) {
            p02Var.o();
        }
        r02 r02Var = this.M2;
        if (r02Var != null) {
            r02Var.o();
        }
    }

    @Override
    public final boolean g0() {
        TL_wallet.walletTransaction wallettransaction;
        final h42 h42Var = this.q2;
        if (h42Var != null && this.v2 == h42Var) {
            final vq0 vq0Var = new vq0(this, (byte) 2);
            int i = h42Var.n;
            duc ducVar = h42Var.S;
            n12 n12Var = h42Var.b;
            AnimatorSet animatorSet = null;
            if (!h42Var.L && (wallettransaction = h42Var.Q0) != null && h42Var.R0 == null && h42Var.S0 == null) {
                if (h42Var.T0) {
                    uqc uqcVar = new uqc();
                    uqcVar.setCurrentAccount(i);
                    e eVar = n12Var.Z1;
                    if (eVar != null && eVar.presentFragment(uqcVar, false, true)) {
                        quc qucVar = new quc(n12Var.c, n12Var.b, ducVar.getDiamondView(), uqcVar, h42Var.Q0, new Runnable() {
                            @Override
                            public final void run() {
                                byte b = r3;
                                vq0 vq0Var2 = vq0Var;
                                h42 h42Var2 = h42Var;
                                switch (b) {
                                    case 0:
                                        if (!h42Var2.L) {
                                            vq0Var2.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!h42Var2.L) {
                                            vq0Var2.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, n12Var);
                        h42Var.S0 = qucVar;
                        animatorSet = qucVar.m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    yrc diamondView = ducVar.getDiamondView();
                    if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        e eVar2 = n12Var.Z1;
                        if (eVar2 instanceof zu1) {
                            zu1 zu1Var = (zu1) eVar2;
                            if (zu1Var.getCurrentAccount() == i && zu1Var.a() == h42Var.r.id && zu1Var.g4 == 0 && zu1Var.getFragmentView() != null && zu1Var.getFragmentView().isAttachedToWindow()) {
                                nrc nrcVar = new nrc(n12Var.c, n12Var.b, ducVar.getDiamondView(), zu1Var, h42Var.Q0, new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r3;
                                        vq0 vq0Var2 = vq0Var;
                                        h42 h42Var2 = h42Var;
                                        switch (b) {
                                            case 0:
                                                if (!h42Var2.L) {
                                                    vq0Var2.run();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (!h42Var2.L) {
                                                    vq0Var2.run();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, n12Var);
                                h42Var.R0 = nrcVar;
                                animatorSet = nrcVar.m;
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

    public final void g1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String r;
        if (tL_attachMenuBot != null) {
            r = tL_attachMenuBot.short_name;
        } else {
            r = lbc.r(user);
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ls6.d0(this.G3).b.bots;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i);
            i++;
            if (tL_attachMenuBot2.bot_id == user.id) {
                break;
            }
        }
        String a0 = ob6.a0("BotRemoveFromMenu", null, 2131752983, r);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = ob6.M0(2131752982, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        if (tL_attachMenuBot == null) {
            a0 = ob6.a0("BotRemoveInlineFromMenu", null, 2131752981, r);
        }
        idVar.U = hl.S2(a0);
        alertDialog$Builder.j(ob6.M0(2131747558, "OK"), new ie(this, tL_attachMenuBot, user, (byte) 20));
        ik8.y("Cancel", 2131752570, alertDialog$Builder, null);
    }

    @Override
    public final boolean h0(View view, int i, int i2, int i3, int i4) {
        boolean z;
        int L;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        r3d r3dVar = chatAttachAlertPhotoLayout.m0;
        zc zcVar = chatAttachAlertPhotoLayout.k0;
        i52 i52Var = chatAttachAlertPhotoLayout.r;
        TextView textView = chatAttachAlertPhotoLayout.q0;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 < i6) {
            z = true;
        } else {
            z = false;
        }
        int i7 = hl.n;
        if (view == zcVar) {
            if (z) {
                if (i52Var.getVisibility() == 0) {
                    zcVar.layout(0, qu6.x(222.0f, i4, i7), i5, qu6.x(96.0f, i4, i7));
                    return true;
                }
                zcVar.layout(0, qu6.x(126.0f, i4, i7), i5, i4 - i7);
                return true;
            } else if (i52Var.getVisibility() == 0) {
                zcVar.layout(qu6.x(222.0f, i3, i7), 0, i3 - hl.L(96.0f), i6 - i7);
                return true;
            } else {
                zcVar.layout(qu6.x(126.0f, i3, i7), 0, i3, i6 - i7);
                return true;
            }
        } else if (view == r3dVar) {
            if (z) {
                if (i52Var.getVisibility() == 0) {
                    r3dVar.layout(0, qu6.x(310.0f, i4, i7), i5, qu6.x(260.0f, i4, i7));
                    return true;
                }
                r3dVar.layout(0, qu6.x(176.0f, i4, i7), i5, qu6.x(126.0f, i4, i7));
                return true;
            } else if (i52Var.getVisibility() == 0) {
                r3dVar.layout(qu6.x(310.0f, i3, i7), 0, i3 - hl.L(260.0f), i6 - i7);
                return true;
            } else {
                r3dVar.layout(qu6.x(176.0f, i3, i7), 0, i3 - hl.L(126.0f), i6 - i7);
                return true;
            }
        } else if (view == textView) {
            if (z) {
                L = (i5 - textView.getMeasuredWidth()) / 2;
                int L2 = i4 - hl.L(167.0f);
                textView.setRotation(0.0f);
                if (i52Var.getVisibility() == 0) {
                    L2 -= hl.L(96.0f);
                }
                measuredWidth = L2 - i7;
            } else {
                L = i3 - hl.L(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i6 / 2);
                textView.setRotation(-90.0f);
                if (i52Var.getVisibility() == 0) {
                    L -= hl.L(96.0f);
                }
            }
            textView.layout(L, measuredWidth, textView.getMeasuredWidth() + L, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != i52Var) {
            return false;
        } else {
            if (z) {
                int x = qu6.x(88.0f, i6, i7);
                view.layout(0, x, view.getMeasuredWidth(), view.getMeasuredHeight() + x);
                return true;
            }
            int L3 = (i + i5) - hl.L(88.0f);
            view.layout(L3, 0, view.getMeasuredWidth() + L3, view.getMeasuredHeight());
            return true;
        }
    }

    public final void h1() {
        int i = 0;
        while (true) {
            f12[] f12VarArr = this.t2;
            if (i < f12VarArr.length) {
                f12 f12Var = f12VarArr[i];
                if (f12Var != null) {
                    f12Var.B();
                }
                i++;
            } else {
                this.c4 = true;
                return;
            }
        }
    }

    @Override
    public final boolean i0(View view, int i, int i2) {
        boolean z;
        WindowInsets windowInsets;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        u52 u52Var = chatAttachAlertPhotoLayout.w;
        n12 n12Var = chatAttachAlertPhotoLayout.b;
        i52 i52Var = chatAttachAlertPhotoLayout.r;
        as asVar = chatAttachAlertPhotoLayout.s;
        int i3 = 0;
        if (i < i2) {
            z = true;
        } else {
            z = false;
        }
        if (view == chatAttachAlertPhotoLayout.Q) {
            if (chatAttachAlertPhotoLayout.c0 && !chatAttachAlertPhotoLayout.e0) {
                int Q = n12Var.Q() + i;
                if (n12Var.h != null) {
                    i3 = (int) (windowInsets.getSystemWindowInsetRight() * 1.0f);
                }
                chatAttachAlertPhotoLayout.Q.measure(View.MeasureSpec.makeMeasureSpec(i3 + Q, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
                return true;
            }
        } else {
            zc zcVar = chatAttachAlertPhotoLayout.k0;
            if (view == zcVar) {
                if (z) {
                    zcVar.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(126.0f), 1073741824));
                    return true;
                }
                zcVar.measure(View.MeasureSpec.makeMeasureSpec(hl.L(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
                return true;
            }
            r3d r3dVar = chatAttachAlertPhotoLayout.m0;
            if (view == r3dVar) {
                if (z) {
                    r3dVar.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), 1073741824));
                    return true;
                }
                r3dVar.measure(View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
                return true;
            } else if (view == i52Var) {
                chatAttachAlertPhotoLayout.K0 = true;
                if (z) {
                    i52Var.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(80.0f), 1073741824));
                    if (asVar.o) {
                        i52Var.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                        asVar.i1(0);
                        u52Var.f();
                    }
                } else {
                    i52Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
                    if (!asVar.o) {
                        i52Var.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
                        asVar.i1(1);
                        u52Var.f();
                    }
                }
                chatAttachAlertPhotoLayout.K0 = false;
                return true;
            }
        }
        return false;
    }

    public final void i1() {
        int i = 0;
        this.c4 = false;
        while (true) {
            f12[] f12VarArr = this.t2;
            if (i >= f12VarArr.length) {
                break;
            }
            f12 f12Var = f12VarArr[i];
            if (f12Var != null) {
                f12Var.D();
            }
            i++;
        }
        if (isShowing()) {
            this.W3.o();
        }
        k12 k12Var = this.x3;
        if (k12Var != null) {
            k12Var.f();
        }
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
        y02 y02Var = this.l4;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, y02Var, 0.0f, 400.0f));
        this.n4.setDuration(400L);
        this.n4.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        y02Var.getClass();
        y02Var.a(this, valueOf);
        this.n4.start();
        ValueAnimator valueAnimator = this.C0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D0, 1.0f);
        this.C0 = ofFloat;
        ofFloat.addUpdateListener(new yz1(this, (byte) 3));
        vpa vpaVar = this.m4;
        if (vpaVar != null) {
            vpaVar.d();
        }
        vpa vpaVar2 = new vpa((Object) this.b, (vk4) vpa.p, 0.0f);
        this.m4 = vpaVar2;
        r47 r47Var = this.E3;
        wpa wpaVar = vpaVar2.m;
        if (r47Var != null) {
            wpaVar.a(0.75f);
            this.m4.m.b(350.0f);
        } else {
            wpaVar.a(0.75f);
            this.m4.m.b(350.0f);
        }
        this.m4.h();
        if (this.K) {
            this.c.setLayerType(2, null);
        }
        this.B0 = (byte) 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.A0 = animatorSet2;
        qn qnVar = sn.d;
        if (this.p0) {
            i = this.q0;
        } else {
            i = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.Z, qnVar, i));
        this.A0.setDuration(400L);
        this.A0.setStartDelay(20L);
        this.A0.setInterpolator(this.l0);
        pn pnVar = new pn(null);
        on1 on1Var = new on1(this, pnVar, this.z0, (byte) 14);
        this.m4.a(new x11(this, on1Var, (byte) 1));
        this.A0.addListener(new v5(this, on1Var, (byte) 14));
        pnVar.d();
        jn7.e().k(jn7.j1, 512);
        this.A0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        v1(0.0f);
        ofFloat2.addUpdateListener(new yz1(this, (byte) 4));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(k43.f);
        ofFloat2.start();
        return true;
    }

    public final void j1() {
        r47 r47Var = this.E3;
        e eVar = this.Z1;
        int i = this.G3;
        if (r47Var != null && r47Var.o5() && !xc2.z(i, 24, r47.B0(this.E3.k)) && (eVar instanceof zu1)) {
            zu1 zu1Var = (zu1) eVar;
            b77 b77Var = zu1Var.y5;
            if (b77Var == null) {
                b77Var = b77.b(this.E3.k.suggested_post);
            }
            if (!jxa.R(i, b77Var.a)) {
                zu1Var.wc(b77Var);
                return;
            }
        }
        if (this.E1 - this.F1 < 0) {
            hl.z3(this.t1);
            hl.z3(this.u1);
            try {
                this.F2.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!uc7.s1(i).M3() && uc7.s1(i).l4.p1.f() > this.F1) {
                z1(eVar);
                return;
            }
            return;
        }
        if (this.E3 == null && (eVar instanceof zu1)) {
            zu1 zu1Var2 = (zu1) eVar;
            if (zu1Var2.X7()) {
                jj.J(getContext(), zu1Var2.a(), new xz1(this, (byte) 14), this.J0);
                return;
            }
        }
        f12 f12Var = this.v2;
        if (f12Var != this.d2 && f12Var != this.k2) {
            if (!f12Var.K(true, 0, 0, this.K2, b1())) {
                this.A4 = true;
                dismiss();
                return;
            }
            return;
        }
        q1(true, 0, 0, this.K2, b1());
    }

    public final void k1(int i) {
        Activity activity;
        boolean z = true;
        e eVar = this.Z1;
        if (i == 3) {
            if (this.K3 || !G0()) {
                if (eVar != null) {
                    activity = eVar.getParentActivity();
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
                l1(true);
            }
        } else if (i == 6 && hl.H1(eVar)) {
            if (this.i2 == null) {
                s42 s42Var = new s42(this, getContext(), this.J0, (this.B1 || this.O3) ? false : false);
                this.i2 = s42Var;
                this.t2[5] = s42Var;
                r42 r42Var = this.t4;
                if (r42Var != null) {
                    s42Var.setDelegate(r42Var);
                } else if (eVar instanceof zu1) {
                    s42Var.setDelegate(new xz1(this, (byte) 18));
                }
            }
            B1(this.i2);
        }
    }

    @Override
    public final void l0() {
        if (this.v2.s()) {
            dismiss();
        }
    }

    public final void l1(boolean z) {
        if (!this.K3 && z) {
            w72 w72Var = new w72(3, this, this.J0, getContext());
            this.N1 = w72Var;
            B1(w72Var);
        }
        int i = 1;
        if (this.f2 == null) {
            x12 x12Var = new x12(this, this.J0, getContext());
            this.f2 = x12Var;
            this.t2[3] = x12Var;
            x12Var.setupBlurredSearchField(this.E4);
            this.f2.setDelegate(new xz1(this, (byte) 17));
            if (this.B1) {
                this.f2.setMaxSelectedFiles(1);
            }
        }
        e eVar = this.Z1;
        if (eVar instanceof zu1) {
            TLRPC.Chat chat = ((zu1) eVar).e;
            x12 x12Var2 = this.f2;
            if ((chat == null || xc2.N(chat) || !chat.slowmode_enabled) && this.E3 == null) {
                i = -1;
            }
            x12Var2.setMaxSelectedFiles(i);
        }
        if (z) {
            B1(this.f2);
        }
    }

    public final void m1() {
        boolean z;
        if (!this.N3) {
            w72 w72Var = new w72(5, this, this.J0, getContext());
            this.N1 = w72Var;
            B1(w72Var);
        }
        if (this.e2 == null) {
            b32 b32Var = new b32(this, this.J0, getContext());
            this.e2 = b32Var;
            this.t2[2] = b32Var;
            b32Var.setupBlurredSearchField(this.E4);
            this.e2.setDelegate(new w02(this));
        }
        e eVar = this.Z1;
        if (eVar instanceof zu1) {
            TLRPC.Chat chat = ((zu1) eVar).e;
            b32 b32Var2 = this.e2;
            if (chat != null && !xc2.N(chat) && chat.slowmode_enabled) {
                z = false;
            } else {
                z = true;
            }
            b32Var2.setMultipleSelectionAllowed(z);
        }
        B1(this.e2);
    }

    public final void n1(boolean z) {
        int i;
        if (!this.H3 && z) {
            w72 w72Var = new w72(4, this, this.J0, getContext());
            this.N1 = w72Var;
            B1(w72Var);
        }
        boolean z2 = false;
        if (this.j2 == null) {
            if (this.H1) {
                i = 2;
            } else {
                i = 0;
            }
            u32 u32Var = new u32(i, this, this.J0, getContext());
            this.j2 = u32Var;
            this.t2[4] = u32Var;
            u32Var.setDelegate(new x02(this));
        }
        int i2 = 1;
        if (this.B1) {
            this.j2.setMaxSelectedFiles(1);
        } else {
            e eVar = this.Z1;
            if (eVar instanceof zu1) {
                TLRPC.Chat chat = ((zu1) eVar).e;
                u32 u32Var2 = this.j2;
                if ((chat == null || xc2.N(chat) || !chat.slowmode_enabled) && this.E3 == null) {
                    i2 = -1;
                }
                u32Var2.setMaxSelectedFiles(i2);
            } else {
                this.j2.setMaxSelectedFiles(this.P3);
                u32 u32Var3 = this.j2;
                if (!this.H1 && !this.Q1) {
                    z2 = true;
                }
                u32Var3.setCanSelectOnlyImageFiles(z2);
            }
        }
        u32 u32Var4 = this.j2;
        u32Var4.e0 = this.H1;
        if (z) {
            B1(u32Var4);
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
        y10 y10Var = this.U2;
        if (y10Var.o0) {
            y10Var.o(true);
        } else if (this.v2.k()) {
        } else {
            if (V0() != null && V0().e) {
                V0().k(true);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e eVar = this.Z1;
        if (eVar != null) {
            hl.l3(this, eVar.isLightStatusBar());
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
            I0();
            rl0 rl0Var = this.V1;
            if (rl0Var != null) {
                rl0Var.updateColors();
            }
            int v0 = aob.v0(aob.j5, this.J0);
            s7 s7Var = this.h3;
            if (s7Var != null && v0 != this.o4) {
                this.o4 = v0;
                s7Var.setIconColor(v0);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void p1() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        y10 y10Var = this.U2;
        int i = 1;
        if (y10Var.o0) {
            y10Var.o(true);
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
            f12[] f12VarArr = this.t2;
            if (i >= f12VarArr.length) {
                break;
            }
            f12 f12Var = f12VarArr[i];
            if (f12Var != null) {
                f12Var.p();
                this.b.removeView(f12VarArr[i]);
                f12VarArr[i] = null;
            }
            i++;
        }
        E1(false, false);
        super.H();
        if (this.r2) {
            this.r2 = false;
            this.s2 = 0.0f;
            e eVar = this.Z1;
            if (eVar != null && eVar.getFragmentView() != null) {
                View fragmentView = eVar.getFragmentView();
                WeakHashMap weakHashMap = ihc.a;
                ygc.c(fragmentView);
            }
        }
    }

    public final boolean q1(final boolean z, final int i, final int i2, final long j, final boolean z2) {
        if (this.F3) {
            return false;
        }
        e eVar = this.Z1;
        if (eVar instanceof zu1) {
            zu1 zu1Var = (zu1) eVar;
            TLRPC.Chat chat = zu1Var.e;
            if (zu1Var.h() != null || ((xc2.T(chat) && chat.megagroup) || !xc2.T(chat))) {
                SharedPreferences.Editor edit = uc7.s1(this.G3).X3.edit();
                edit.putBoolean("silent_" + zu1Var.a(), !z).commit();
            }
        }
        int i3 = 1;
        if (H0(V0().getText())) {
            return true;
        }
        F0();
        if (this.q1.f) {
            this.F3 = true;
            this.W3.z0(7, true, z, i, i2, j, z2, false, 0L);
            return true;
        }
        long W0 = W0();
        f12 f12Var = this.v2;
        if (f12Var != null) {
            i3 = f12Var.getSelectedItemsCount();
        }
        return jj.Y(this.G3, W0, S0() + i3, new pcc() {
            @Override
            public final void a(Object obj) {
                n12 n12Var = n12.this;
                n12Var.F3 = true;
                n12Var.W3.z0(7, true, z, i, i2, j, z2, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    @Override
    public final void r0(boolean z) {
        this.r0 = true;
    }

    public final void r1(boolean z, boolean z2) {
        final boolean z3;
        boolean z4;
        final boolean z5;
        int i;
        float f;
        float f2;
        float measuredHeight;
        this.l1.a(z, z2);
        iu3 V0 = V0();
        this.W1 = z;
        iu3 V02 = V0();
        int i2 = 0;
        if (this.A2.getTag() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        f12 f12Var = this.v2;
        if (f12Var != this.d2 && f12Var != this.k2) {
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
        tt ttVar = this.L2;
        float f3 = 1.0f;
        c41 c41Var = this.z2;
        float f4 = 0.0f;
        if (z2) {
            if (z3) {
                i3 = 0;
            }
            ttVar.setVisibility(i3);
            ViewPropertyAnimator animate = ttVar.animate();
            if (z5 && z3) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f2).setDuration(320L);
            k43 k43Var = k43.h;
            duration.setInterpolator(k43Var).setUpdateListener(new yz1(this, (byte) 0)).withEndAction(new Runnable(this) {
                public final n12 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r4;
                    boolean z6 = z3;
                    boolean z7 = z5;
                    n12 n12Var = this.b;
                    switch (b) {
                        case 0:
                            if (!z7 || !z6) {
                                n12Var.L2.setVisibility(8);
                            }
                            n12Var.M1();
                            return;
                        default:
                            if (z7 || !z6) {
                                n12Var.z2.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            c41Var.setVisibility(0);
            ViewPropertyAnimator animate2 = c41Var.animate();
            if (!z5 && z3) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = c41Var.getMeasuredHeight();
            }
            ViewPropertyAnimator translationY = animate2.translationY(measuredHeight);
            if (z5 || !z3) {
                f3 = 0.0f;
            }
            translationY.alpha(f3).setDuration(320L).setInterpolator(k43Var).setUpdateListener(new yz1(this, (byte) 1)).withEndAction(new Runnable(this) {
                public final n12 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r4;
                    boolean z6 = z3;
                    boolean z7 = z5;
                    n12 n12Var = this.b;
                    switch (b) {
                        case 0:
                            if (!z7 || !z6) {
                                n12Var.L2.setVisibility(8);
                            }
                            n12Var.M1();
                            return;
                        default:
                            if (z7 || !z6) {
                                n12Var.z2.setVisibility(8);
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
            ttVar.setVisibility(i);
            if (z5 && z3) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ttVar.setAlpha(f);
            M1();
            if (z5 || !z3) {
                f3 = 0.0f;
            }
            c41Var.setAlpha(f3);
            if (z5 || !z3) {
                f4 = c41Var.getMeasuredHeight();
            }
            c41Var.setTranslationY(f4);
            if (z5 || !z3) {
                i2 = 8;
            }
            c41Var.setVisibility(i2);
        }
        if (V0 != V02) {
            V0.k(true);
            V02.setText(hm.cloneSpans(V0.getText()));
            V02.getEditText().setAllowTextEntitiesIntersection(V0.getEditText().getAllowTextEntitiesIntersection());
            if (V0.getEditText().isFocused()) {
                V02.getEditText().requestFocus();
                V02.getEditText().setSelection(V0.getEditText().getSelectionStart(), V0.getEditText().getSelectionEnd());
            }
        }
        hl.c3(new vq0(this, (byte) 1));
    }

    public final void s1(int i, r47 r47Var) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (r47Var != null && (chatAttachAlertPhotoLayout = this.d2) != null) {
            chatAttachAlertPhotoLayout.Z();
        }
        if (this.E3 == r47Var && this.D3 == i) {
            return;
        }
        this.E3 = r47Var;
        if (r47Var != null && r47Var.z2()) {
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
        G1(0);
    }

    @Override
    public final void show() {
        boolean z;
        super.show();
        this.F3 = false;
        e eVar = this.Z1;
        if (eVar instanceof zu1) {
            this.i0 = ((zu1) eVar).Y7();
        }
        H1();
        this.p3 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int o = vm2.o(aob.v0(aob.a7, this.J0), 0);
            this.H0 = o;
            hl.o3(this, o, false, null);
            if (hl.B(this.H0) > 0.721d) {
                z = true;
            } else {
                z = false;
            }
            hl.i3(this, z);
        }
        if (this.j4) {
            this.j4 = false;
            y10 y10Var = this.U2;
            y10Var.updateColors();
            y10Var.invalidate();
            e1();
        }
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        int i2;
        if (i == 0) {
            O0();
            K0();
            return;
        }
        int i3 = 1;
        if (i == 2) {
            K0();
            a72 a72Var = this.g2;
            if (a72Var != null) {
                if (this.w2 != a72Var) {
                    if (this.v2 == a72Var) {
                        i2 = 0;
                    }
                } else {
                    i2 = 1;
                }
                L1(i2);
            }
            a72 a72Var2 = this.h2;
            if (a72Var2 != null) {
                if (this.w2 != a72Var2) {
                    if (this.v2 == a72Var2) {
                        i3 = 0;
                    } else {
                        return;
                    }
                }
                L1(i3);
            }
        } else if (i == 1) {
            K0();
        } else if (i == 3) {
            N0();
        } else if (i == 4) {
            N0();
        } else if (i == 5) {
            N0();
            u02 u02Var = this.F2;
            if (u02Var != null) {
                u02Var.setEphemeralFactor(f);
                u02Var.setSameWidthFactor(f);
            }
        }
    }

    public final void t1(float f) {
        int i;
        float translationY = this.b.getTranslationY() - this.s2;
        this.s2 = this.b.getHeight() * f;
        this.b.setTranslationY(translationY);
        h42 h42Var = this.q2;
        if (h42Var != null) {
            h42Var.setSendTransitionProgress(f);
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

    public final void u1(int i, boolean z) {
        if (this.E3 != null) {
            return;
        }
        this.P3 = i;
        this.Q3 = z;
    }

    public final void v1(float f) {
        boolean z = false;
        int o = vm2.o(aob.v0(aob.a7, this.J0), Math.min(255, Math.max(0, (int) (f * 255.0f))));
        this.H0 = o;
        hl.o3(this, o, false, null);
        if (hl.B(this.H0) > 0.721d) {
            z = true;
        }
        hl.i3(this, z);
        this.c.invalidate();
    }

    public final void w1(String str) {
        boolean z = true;
        this.N2 = (byte) 1;
        this.z1 = true;
        this.P2 = false;
        this.J3 = false;
        this.u3.setVisibility(8);
        this.g3.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (chatAttachAlertPhotoLayout != null) {
            n12 n12Var = chatAttachAlertPhotoLayout.b;
            if (n12Var.N2 == 0 || n12Var.z1) {
                z = false;
            }
            chatAttachAlertPhotoLayout.h1 = z;
        }
    }

    @Override
    public final void x() {
        if (this.Z1 instanceof zu1) {
            String[] strArr = MediaController.W1;
        } else {
            String[] strArr2 = MediaController.W1;
        }
        this.v2.y();
        hl.g2(ob6.M0(2131754917, "AccDescrAttachButton"));
        this.p3 = true;
        if (!this.J3 && !this.I3) {
            G0();
        }
    }

    public final void x1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n12.x1(boolean):void");
    }

    @Override
    public final boolean y() {
        return true;
    }

    public final void y1(long r26, java.lang.String r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n12.y1(long, java.lang.String, boolean, boolean):void");
    }

    public final void z1(e eVar) {
        if ((eVar instanceof zu1) && xc2.V(((zu1) eVar).e)) {
            new d31(this.o3, this.J0).f(uc7.s1(this.G3).l4.p1.f(), new dy1(this, eVar, (byte) 5)).j();
        }
    }

    @Override
    public final void v0(float f, int i) {
    }

    public n12(Activity activity, e eVar, boolean z, boolean z2) {
        this(activity, eVar, z, z2, true, null);
    }
}
