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
public class x02 extends fx0 implements gk7, ax0, x74 {
    public static final int G4 = 0;
    public boolean A1;
    public final wz1 A2;
    public boolean A3;
    public boolean A4;
    public boolean B1;
    public final zz1 B2;
    public final hn B3;
    public eb1 B4;
    public int C1;
    public final ImageView C2;
    public float C3;
    public final cq3 C4;
    public f D1;
    public final int[] D2;
    public int D3;
    public final ix4 D4;
    public int E1;
    public final wz1 E2;
    public k27 E3;
    public final kl0 E4;
    public int F1;
    public final e02 F2;
    public boolean F3;
    public final vw0 F4;
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
    public ul5 K1;
    public long K2;
    public boolean K3;
    public boolean L1;
    public final st L2;
    public boolean L3;
    public final yv7 M1;
    public final b02 M2;
    public boolean M3;
    public f72 N1;
    public byte N2;
    public boolean N3;
    public wl5 O1;
    public wf0 O2;
    public boolean O3;
    public boolean P1;
    public boolean P2;
    public int P3;
    public boolean Q1;
    public boolean Q2;
    public boolean Q3;
    public t22 R1;
    public boolean R2;
    public boolean R3;
    public e12 S1;
    public final float S2;
    public float S3;
    public long T1;
    public long T2;
    public float T3;
    public boolean U1;
    public final x10 U2;
    public ValueAnimator U3;
    public final ql0 V1;
    public AnimatorSet V2;
    public int V3;
    public boolean W1;
    public AnimatorSet W2;
    public v02 W3;
    public float X1;
    public final r7 X2;
    public y52 X3;
    public final i02 Y1;
    public final gk2 Y2;
    public final int[] Y3;
    public final d Z1;
    public final r7 Z2;
    public int Z3;
    public final boolean a2;
    public je5 a3;
    public float a4;
    public bx1 b2;
    public final r7 b3;
    public float b4;
    public boolean c2;
    public final t8 c3;
    public boolean c4;
    public final ChatAttachAlertPhotoLayout d2;
    public float d3;
    public float d4;
    public k22 e2;
    public float e3;
    public final boolean e4;
    public h12 f2;
    public final wz1 f3;
    public boolean f4;
    public k62 g2;
    public final TextView g3;
    public final ArrayList g4;
    public k62 h2;
    public final r7 h3;
    public final Rect h4;
    public c42 i2;
    public final LinearLayout i3;
    public float i4;
    public d32 j2;
    public final ImageView j3;
    public boolean j4;
    public m52 k2;
    public final LinearLayout k3;
    public int k4;
    public final fm0 l1;
    public v12 l2;
    public final TextView l3;
    public final i02 l4;
    public final fm0 m1;
    public p62 m2;
    public float m3;
    public yla m4;
    public final fm0 n1;
    public e32 n2;
    public boolean n3;
    public AnimatorSet n4;
    public final fm0 o1;
    public e32 o2;
    public final k02 o3;
    public int o4;
    public final fm0 p1;
    public e72 p2;
    public boolean p3;
    public int p4;
    public final fm0 q1;
    public r32 q2;
    public Object q3;
    public boolean q4;
    public final k79 r1;
    public boolean r2;
    public boolean r3;
    public boolean r4;
    public ku1 s1;
    public float s2;
    public final ry1 s3;
    public boolean s4;
    public final hn t1;
    public final p02[] t2;
    public final yz1 t3;
    public b42 t4;
    public final hn u1;
    public final LongSparseArray u2;
    public final wz1 u3;
    public boolean u4;
    public final ImageView v1;
    public p02 v2;
    public final xz1 v3;
    public boolean v4;
    public final gc w1;
    public p02 w2;
    public final t26 w3;
    public File w4;
    public final ImageView x1;
    public final il0 x2;
    public final u02 x3;
    public double[] x4;
    public final gc y1;
    public final il0 y2;
    public boolean y3;
    public boolean y4;
    public boolean z1;
    public final u31 z2;
    public final RadialProgressView z3;
    public boolean z4;

    public x02(Context context, d dVar, boolean z, boolean z2, boolean z3, final wjb wjbVar) {
        super(1, wjbVar, context, false);
        kl0 kl0Var;
        kl0 kl0Var2;
        boolean z4;
        r7 r7Var;
        t8 t8Var;
        float f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i;
        int L;
        s33 s33Var = s33.h;
        this.l1 = new fm0(0, this, s33Var, 380L, false);
        this.m1 = new fm0(1, this, s33Var, 380L, false);
        this.n1 = new fm0(2, this, s33Var, 380L, false);
        this.o1 = new fm0(3, this, s33Var, 380L, false);
        this.p1 = new fm0(4, this, s33Var, 380L, true);
        this.q1 = new fm0(5, this, s33Var, 320L, false);
        k79 k79Var = new k79(new fz1(this, (byte) 2), s33Var, 380L);
        this.r1 = k79Var;
        this.G1 = false;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.X1 = 0.0f;
        this.Y1 = new i02(this, (byte) 0);
        this.c2 = false;
        p02[] p02VarArr = new p02[12];
        this.t2 = p02VarArr;
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
        int i2 = y6c.t0;
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
        this.V3 = gl.L(85.0f);
        this.Y3 = new int[2];
        new Paint(1);
        this.f4 = false;
        ArrayList arrayList = new ArrayList();
        this.g4 = arrayList;
        Rect rect = new Rect();
        this.h4 = rect;
        this.l4 = new i02(this, (byte) 1);
        this.r4 = true;
        this.s4 = false;
        this.z4 = false;
        this.A4 = false;
        this.y = true;
        ix4 ix4Var = new ix4();
        this.D4 = ix4Var;
        ix4Var.a(bkb.v0(bkb.c6, this.J0));
        this.X0.E.add(new ow4(ix4Var, new fz1(this, (byte) 4)));
        if (Build.VERSION.SDK_INT >= 31 && gba.f()) {
            cq3 cq3Var = new cq3(false);
            this.C4 = cq3Var;
            this.X0.a(cq3Var);
            lx4 lx4Var = new lx4(ix4Var);
            lx4Var.f = ix4Var;
            lx4Var.d = cq3Var;
            lx4Var.e = -2;
            lx4 lx4Var2 = new lx4(null);
            lx4Var2.f = ix4Var;
            lx4Var2.d = cq3Var;
            lx4Var2.e = -3;
            kl0Var = new kl0(lx4Var, lx4Var, lx4Var);
            this.E4 = kl0Var;
            kl0Var.k = true;
            if (e66.e(262144)) {
                L = gl.L(8.0f);
            } else {
                L = gl.L(48.0f);
            }
            kl0Var.d = L;
            kl0Var.e = L;
            kl0Var2 = new kl0(lx4Var2, lx4Var2, lx4Var2);
            kl0Var2.k = true;
            int L2 = gl.L(48.0f);
            kl0Var2.d = L2;
            kl0Var2.e = L2;
        } else {
            this.C4 = null;
            kl0Var = new kl0(ix4Var, ix4Var, ix4Var);
            this.E4 = kl0Var;
            kl0Var2 = new kl0(ix4Var, ix4Var, ix4Var);
        }
        kl0 kl0Var3 = kl0Var;
        kl0 kl0Var4 = new kl0(ix4Var, ix4Var, ix4Var);
        this.F4 = new vw0(this, (byte) 2);
        this.e4 = z;
        if ((dVar instanceof mu1) && dVar.isInBubbleMode()) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.a2 = z4;
        this.l0 = new OvershootInterpolator(0.7f);
        this.Z1 = dVar;
        this.G = true;
        this.z0 = this;
        kk7.f(i2).b(this, kk7.S0);
        kk7.f(i2).b(this, kk7.Y4);
        kk7.f(i2).b(this, kk7.h5);
        kk7.f(i2).b(this, kk7.E1);
        arrayList.add(rect);
        k02 k02Var = new k02(this, context);
        this.o3 = k02Var;
        k02Var.setDelegate(new l02(this));
        this.b = k02Var;
        k02Var.setWillNotDraw(false);
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        ViewGroup viewGroup = this.b;
        int i3 = this.u0;
        viewGroup.setPadding(i3, 0, i3, 0);
        x10 x10Var = new x10(this, context, wjbVar, (byte) 1);
        this.U2 = x10Var;
        x10Var.d1 = true;
        x10Var.setForcedMenuWidth(gl.L(46.0f));
        x10Var.setBackButtonDrawable(new ed0(false));
        int i4 = bkb.i5;
        zkb.l(x10Var, 1, i4, wjbVar);
        int i5 = bkb.H5;
        zkb.l(x10Var, 3, i5, wjbVar);
        zkb.l(x10Var, 5, i4, wjbVar);
        x10Var.setOccupyStatusBar(true);
        x10Var.setAlpha(0.0f);
        x10Var.setActionBarMenuOnItemClick(new r8(this, (byte) 22));
        kl0 kl0Var5 = kl0Var2;
        r7 r7Var2 = new r7(context, null, 0, bkb.v0(i4, this.J0), false, wjbVar);
        this.X2 = r7Var2;
        r7Var2.setLongClickEnabled(false);
        r7Var2.setIcon(2131231247);
        r7Var2.setContentDescription(k96.M0(2131754838, null));
        r7Var2.setVisibility(4);
        r7Var2.setAlpha(0.0f);
        r7Var2.setScaleX(0.6f);
        r7Var2.setScaleY(0.6f);
        r7Var2.setSubMenuOpenSide(2);
        r7Var2.setDelegate(new fz1(this, (byte) 10));
        r7Var2.setAdditionalYOffset(gl.L(72.0f));
        r7Var2.setTranslationX(gl.L(1.0f));
        ff0 f0 = bkb.f0(bkb.v0(i5, this.J0), 6, -1);
        vkb M = zkb.M(i5);
        r7Var2.setBackground(f0);
        zkb.j(r7Var2, f0, null, M, wjbVar);
        r7Var2.setOnClickListener(new View.OnClickListener(this) {
            public final x02 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                s12 s12Var;
                int i6;
                byte b = r2;
                boolean z5 = false;
                x02 x02Var = this.b;
                switch (b) {
                    case 0:
                        if (x02Var.v2 != x02Var.k2) {
                            z5 = true;
                        }
                        x02Var.J1(z5);
                        return;
                    case 1:
                        long j = x02Var.T2;
                        if (j < 0 && (s12Var = (s12) x02Var.u2.get(-j)) != null) {
                            hv0 webViewContainer = s12Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = x02Var.W1;
                        if (!z6) {
                            x02Var.q1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = x02Var.W1;
                        if (z7) {
                            x02Var.q1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        x02Var.i1();
                        return;
                    case 5:
                        x02Var.X2.U(null, null);
                        return;
                    case 6:
                        if (x02Var.d2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z8 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = x02Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jm6) {
                                        jm6 jm6Var = (jm6) entry.getValue();
                                        if (jm6Var.d()) {
                                            jm6Var.O = Boolean.valueOf(T);
                                            for (int i7 = 0; i7 < chatAttachAlertPhotoLayout2.F.getChildCount(); i7++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i7);
                                                if (childAt instanceof o48) {
                                                    o48 o48Var = (o48) childAt;
                                                    if (o48Var.getPhotoEntry() == jm6Var) {
                                                        o48Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gba.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            x02Var.I1(true);
                            r7 r7Var3 = x02Var.Z2;
                            je5 je5Var = x02Var.a3;
                            if (je5Var != null) {
                                je5Var.f(true);
                            }
                            je5 je5Var2 = new je5(x02Var.getContext(), 1);
                            x02Var.a3 = je5Var2;
                            if (!T) {
                                i6 = 2131748640;
                            } else {
                                i6 = 2131748641;
                            }
                            je5Var2.t(gl.S2(k96.M0(i6, null)));
                            x02Var.a3.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            x02Var.a3.o(1.0f, -((x02Var.b.getWidth() - ((r7Var3.getWidth() / 2.0f) + r7Var3.getX())) - gl.L(14.0f)));
                            x02Var.a3.setTranslationY(x02Var.X2.getTranslationY());
                            je5 je5Var3 = x02Var.a3;
                            je5Var3.r0 = new kx1(x02Var, je5Var2, (byte) 4);
                            x02Var.b.addView(je5Var3, nme.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            x02Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        p02 p02Var = x02Var.v2;
                        if (p02Var != null) {
                            p02Var.x(40);
                            return;
                        }
                        return;
                    default:
                        x02Var.h3.U(null, null);
                        return;
                }
            }
        });
        r7 r7Var3 = new r7(context, null, 0, bkb.v0(i4, this.J0), false, wjbVar);
        this.Z2 = r7Var3;
        r7Var3.setLongClickEnabled(false);
        gk2 gk2Var = new gk2();
        this.Y2 = gk2Var;
        r7Var3.setIcon(gk2Var);
        r7Var3.setContentDescription(k96.M0(2131754838, null));
        r7Var3.setVisibility(8);
        r7Var3.setAlpha(0.0f);
        r7Var3.setScaleX(0.6f);
        r7Var3.setScaleY(0.6f);
        r7Var3.setAdditionalYOffset(gl.L(72.0f));
        r7Var3.setTranslationX(-gl.L(3.0f));
        ff0 f02 = bkb.f0(bkb.v0(i5, this.J0), 6, -1);
        vkb M2 = zkb.M(i5);
        r7Var3.setBackground(f02);
        zkb.j(r7Var3, f02, null, M2, wjbVar);
        r7Var3.setOnClickListener(new View.OnClickListener(this) {
            public final x02 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                s12 s12Var;
                int i6;
                byte b = r2;
                boolean z5 = false;
                x02 x02Var = this.b;
                switch (b) {
                    case 0:
                        if (x02Var.v2 != x02Var.k2) {
                            z5 = true;
                        }
                        x02Var.J1(z5);
                        return;
                    case 1:
                        long j = x02Var.T2;
                        if (j < 0 && (s12Var = (s12) x02Var.u2.get(-j)) != null) {
                            hv0 webViewContainer = s12Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = x02Var.W1;
                        if (!z6) {
                            x02Var.q1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = x02Var.W1;
                        if (z7) {
                            x02Var.q1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        x02Var.i1();
                        return;
                    case 5:
                        x02Var.X2.U(null, null);
                        return;
                    case 6:
                        if (x02Var.d2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z8 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = x02Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jm6) {
                                        jm6 jm6Var = (jm6) entry.getValue();
                                        if (jm6Var.d()) {
                                            jm6Var.O = Boolean.valueOf(T);
                                            for (int i7 = 0; i7 < chatAttachAlertPhotoLayout2.F.getChildCount(); i7++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i7);
                                                if (childAt instanceof o48) {
                                                    o48 o48Var = (o48) childAt;
                                                    if (o48Var.getPhotoEntry() == jm6Var) {
                                                        o48Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gba.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            x02Var.I1(true);
                            r7 r7Var32 = x02Var.Z2;
                            je5 je5Var = x02Var.a3;
                            if (je5Var != null) {
                                je5Var.f(true);
                            }
                            je5 je5Var2 = new je5(x02Var.getContext(), 1);
                            x02Var.a3 = je5Var2;
                            if (!T) {
                                i6 = 2131748640;
                            } else {
                                i6 = 2131748641;
                            }
                            je5Var2.t(gl.S2(k96.M0(i6, null)));
                            x02Var.a3.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            x02Var.a3.o(1.0f, -((x02Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gl.L(14.0f)));
                            x02Var.a3.setTranslationY(x02Var.X2.getTranslationY());
                            je5 je5Var3 = x02Var.a3;
                            je5Var3.r0 = new kx1(x02Var, je5Var2, (byte) 4);
                            x02Var.b.addView(je5Var3, nme.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            x02Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        p02 p02Var = x02Var.v2;
                        if (p02Var != null) {
                            p02Var.x(40);
                            return;
                        }
                        return;
                    default:
                        x02Var.h3.U(null, null);
                        return;
                }
            }
        });
        t8 t8Var2 = new t8(this, context);
        zkb.X(t8Var2, bkb.Ii, wjbVar);
        t8Var2.setText(k96.M0(2131751741, null));
        t8Var2.setTypeface(gl.o());
        t8Var2.setTextSize(1, 14.0f);
        t8Var2.setVisibility(4);
        t8Var2.setAlpha(0.0f);
        t8Var2.setGravity(17);
        t8Var2.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        t8Var2.setTranslationX(-gl.L(12.0f));
        t8Var2.setOnClickListener(new View.OnClickListener(this) {
            public final x02 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                s12 s12Var;
                int i6;
                byte b = r2;
                boolean z5 = false;
                x02 x02Var = this.b;
                switch (b) {
                    case 0:
                        if (x02Var.v2 != x02Var.k2) {
                            z5 = true;
                        }
                        x02Var.J1(z5);
                        return;
                    case 1:
                        long j = x02Var.T2;
                        if (j < 0 && (s12Var = (s12) x02Var.u2.get(-j)) != null) {
                            hv0 webViewContainer = s12Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = x02Var.W1;
                        if (!z6) {
                            x02Var.q1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = x02Var.W1;
                        if (z7) {
                            x02Var.q1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        x02Var.i1();
                        return;
                    case 5:
                        x02Var.X2.U(null, null);
                        return;
                    case 6:
                        if (x02Var.d2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z8 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = x02Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jm6) {
                                        jm6 jm6Var = (jm6) entry.getValue();
                                        if (jm6Var.d()) {
                                            jm6Var.O = Boolean.valueOf(T);
                                            for (int i7 = 0; i7 < chatAttachAlertPhotoLayout2.F.getChildCount(); i7++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i7);
                                                if (childAt instanceof o48) {
                                                    o48 o48Var = (o48) childAt;
                                                    if (o48Var.getPhotoEntry() == jm6Var) {
                                                        o48Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gba.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            x02Var.I1(true);
                            r7 r7Var32 = x02Var.Z2;
                            je5 je5Var = x02Var.a3;
                            if (je5Var != null) {
                                je5Var.f(true);
                            }
                            je5 je5Var2 = new je5(x02Var.getContext(), 1);
                            x02Var.a3 = je5Var2;
                            if (!T) {
                                i6 = 2131748640;
                            } else {
                                i6 = 2131748641;
                            }
                            je5Var2.t(gl.S2(k96.M0(i6, null)));
                            x02Var.a3.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            x02Var.a3.o(1.0f, -((x02Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gl.L(14.0f)));
                            x02Var.a3.setTranslationY(x02Var.X2.getTranslationY());
                            je5 je5Var3 = x02Var.a3;
                            je5Var3.r0 = new kx1(x02Var, je5Var2, (byte) 4);
                            x02Var.b.addView(je5Var3, nme.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            x02Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        p02 p02Var = x02Var.v2;
                        if (p02Var != null) {
                            p02Var.x(40);
                            return;
                        }
                        return;
                    default:
                        x02Var.h3.U(null, null);
                        return;
                }
            }
        });
        ote.a(t8Var2);
        this.c3 = t8Var2;
        G1();
        if (dVar != null) {
            r7Var = r7Var3;
            t8Var = t8Var2;
            f = 14.0f;
            r7 r7Var4 = new r7(context, null, 0, bkb.v0(i4, this.J0), false, wjbVar);
            this.b3 = r7Var4;
            r7Var4.setLongClickEnabled(false);
            r7Var4.setIcon(2131232491);
            r7Var4.setContentDescription(k96.M0(2131745644, null));
            r7Var4.setVisibility(4);
            r7Var4.setAlpha(0.0f);
            r7Var4.setTranslationX(-gl.L(42.0f));
            ff0 f03 = bkb.f0(bkb.v0(i5, this.J0), 6, -1);
            vkb M3 = zkb.M(i5);
            r7Var4.setBackground(f03);
            zkb.j(r7Var4, f03, null, M3, wjbVar);
            r7Var4.setOnClickListener(new v6((byte) 2, this, z2));
        } else {
            r7Var = r7Var3;
            t8Var = t8Var2;
            f = 14.0f;
        }
        r7 r7Var5 = new r7(context, null, 0, bkb.v0(i4, this.J0), false, wjbVar);
        this.h3 = r7Var5;
        r7Var5.setLongClickEnabled(false);
        r7Var5.setIcon(2131231247);
        r7Var5.setContentDescription(k96.M0(2131754838, null));
        r7Var5.setVisibility(8);
        ff0 f04 = bkb.f0(bkb.v0(i5, this.J0), 3, -1);
        vkb M4 = zkb.M(i5);
        r7Var5.setBackground(f04);
        zkb.j(r7Var5, f04, null, M4, wjbVar);
        r7Var5.e(1, 2131232049, k96.M0(2131744640, null)).setOnClickListener(new View.OnClickListener(this) {
            public final x02 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                mu1 mu1Var;
                byte b = r3;
                wjb wjbVar2 = wjbVar;
                final x02 x02Var = this.b;
                boolean z5 = false;
                boolean z6 = true;
                switch (b) {
                    case 0:
                        zz1 zz1Var = x02Var.B2;
                        if (zz1Var != null) {
                            na7.c1().edit().putInt("aihintshown", 3).apply();
                            a1 a1Var = new a1(x02Var.getContext(), wjbVar2);
                            a1Var.o1(zz1Var.getText());
                            a1Var.e2 = new p8c() {
                                @Override
                                public final void a(Object obj) {
                                    byte b2 = r2;
                                    x02 x02Var2 = x02Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b2) {
                                        case 0:
                                            zz1 zz1Var2 = x02Var2.B2;
                                            zz1Var2.setText(charSequence);
                                            zz1Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            b02 b02Var = x02Var2.M2;
                                            b02Var.setText(charSequence);
                                            b02Var.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j = x02Var.T1;
                            if (x02Var.E3 == null) {
                                z6 = false;
                            }
                            a1Var.m1(j, z6, new mz1(x02Var, (byte) 0));
                            a1Var.show();
                            return;
                        }
                        return;
                    case 1:
                        b02 b02Var = x02Var.M2;
                        if (b02Var != null) {
                            na7.c1().edit().putInt("aihintshown", 3).apply();
                            a1 a1Var2 = new a1(x02Var.getContext(), wjbVar2);
                            a1Var2.o1(b02Var.getText());
                            a1Var2.e2 = new p8c() {
                                @Override
                                public final void a(Object obj) {
                                    byte b2 = r2;
                                    x02 x02Var2 = x02Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b2) {
                                        case 0:
                                            zz1 zz1Var2 = x02Var2.B2;
                                            zz1Var2.setText(charSequence);
                                            zz1Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            b02 b02Var2 = x02Var2.M2;
                                            b02Var2.setText(charSequence);
                                            b02Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j2 = x02Var.T1;
                            if (x02Var.E3 != null) {
                                z5 = true;
                            }
                            a1Var2.m1(j2, z5, new mz1(x02Var, (byte) 1));
                            a1Var2.show();
                            return;
                        }
                        return;
                    default:
                        x02Var.h3.U(null, null);
                        PhotoViewer r0 = PhotoViewer.r0();
                        d dVar2 = x02Var.Z1;
                        r0.T1(null, dVar2, wjbVar2);
                        PhotoViewer.r0().U1(x02Var);
                        PhotoViewer r02 = PhotoViewer.r0();
                        int i6 = x02Var.P3;
                        boolean z7 = x02Var.Q3;
                        r02.h = i6;
                        r02.n = z7;
                        if (!x02Var.W3.g0()) {
                            gl.t1(dVar2.getFragmentView().findFocus());
                            gl.t1(x02Var.c.findFocus());
                        }
                        File w = f4b.w(x02Var.G3, "webp");
                        Point point = gl.q;
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
                            fa4.g(th, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        jm6 jm6Var = new jm6(0, w.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(jm6Var);
                        PhotoViewer r03 = PhotoViewer.r0();
                        o02 o02Var = new o02(x02Var, jm6Var);
                        if (dVar2 instanceof mu1) {
                            mu1Var = (mu1) dVar2;
                        } else {
                            mu1Var = null;
                        }
                        r03.o1(arrayList2, 0, 11, false, o02Var, mu1Var);
                        if (x02Var.A1) {
                            PhotoViewer.r0().V(null, null, true, x02Var.D1);
                            return;
                        }
                        return;
                }
            }
        });
        r7Var5.setMenuYOffset(gl.L(-12.0f));
        r7Var5.setAdditionalXOffset(gl.L(12.0f));
        r7Var5.setOnClickListener(new View.OnClickListener(this) {
            public final x02 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                s12 s12Var;
                int i6;
                byte b = r2;
                boolean z5 = false;
                x02 x02Var = this.b;
                switch (b) {
                    case 0:
                        if (x02Var.v2 != x02Var.k2) {
                            z5 = true;
                        }
                        x02Var.J1(z5);
                        return;
                    case 1:
                        long j = x02Var.T2;
                        if (j < 0 && (s12Var = (s12) x02Var.u2.get(-j)) != null) {
                            hv0 webViewContainer = s12Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = x02Var.W1;
                        if (!z6) {
                            x02Var.q1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = x02Var.W1;
                        if (z7) {
                            x02Var.q1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        x02Var.i1();
                        return;
                    case 5:
                        x02Var.X2.U(null, null);
                        return;
                    case 6:
                        if (x02Var.d2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z8 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = x02Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jm6) {
                                        jm6 jm6Var = (jm6) entry.getValue();
                                        if (jm6Var.d()) {
                                            jm6Var.O = Boolean.valueOf(T);
                                            for (int i7 = 0; i7 < chatAttachAlertPhotoLayout2.F.getChildCount(); i7++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i7);
                                                if (childAt instanceof o48) {
                                                    o48 o48Var = (o48) childAt;
                                                    if (o48Var.getPhotoEntry() == jm6Var) {
                                                        o48Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gba.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            x02Var.I1(true);
                            r7 r7Var32 = x02Var.Z2;
                            je5 je5Var = x02Var.a3;
                            if (je5Var != null) {
                                je5Var.f(true);
                            }
                            je5 je5Var2 = new je5(x02Var.getContext(), 1);
                            x02Var.a3 = je5Var2;
                            if (!T) {
                                i6 = 2131748640;
                            } else {
                                i6 = 2131748641;
                            }
                            je5Var2.t(gl.S2(k96.M0(i6, null)));
                            x02Var.a3.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            x02Var.a3.o(1.0f, -((x02Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gl.L(14.0f)));
                            x02Var.a3.setTranslationY(x02Var.X2.getTranslationY());
                            je5 je5Var3 = x02Var.a3;
                            je5Var3.r0 = new kx1(x02Var, je5Var2, (byte) 4);
                            x02Var.b.addView(je5Var3, nme.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            x02Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        p02 p02Var = x02Var.v2;
                        if (p02Var != null) {
                            p02Var.x(40);
                            return;
                        }
                        return;
                    default:
                        x02Var.h3.U(null, null);
                        return;
                }
            }
        });
        wz1 wz1Var = new wz1(this, context, (byte) 0);
        this.f3 = wz1Var;
        wz1Var.setOnClickListener(new View.OnClickListener(this) {
            public final x02 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                s12 s12Var;
                int i6;
                byte b = r2;
                boolean z5 = false;
                x02 x02Var = this.b;
                switch (b) {
                    case 0:
                        if (x02Var.v2 != x02Var.k2) {
                            z5 = true;
                        }
                        x02Var.J1(z5);
                        return;
                    case 1:
                        long j = x02Var.T2;
                        if (j < 0 && (s12Var = (s12) x02Var.u2.get(-j)) != null) {
                            hv0 webViewContainer = s12Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = x02Var.W1;
                        if (!z6) {
                            x02Var.q1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = x02Var.W1;
                        if (z7) {
                            x02Var.q1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        x02Var.i1();
                        return;
                    case 5:
                        x02Var.X2.U(null, null);
                        return;
                    case 6:
                        if (x02Var.d2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z8 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = x02Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jm6) {
                                        jm6 jm6Var = (jm6) entry.getValue();
                                        if (jm6Var.d()) {
                                            jm6Var.O = Boolean.valueOf(T);
                                            for (int i7 = 0; i7 < chatAttachAlertPhotoLayout2.F.getChildCount(); i7++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i7);
                                                if (childAt instanceof o48) {
                                                    o48 o48Var = (o48) childAt;
                                                    if (o48Var.getPhotoEntry() == jm6Var) {
                                                        o48Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gba.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            x02Var.I1(true);
                            r7 r7Var32 = x02Var.Z2;
                            je5 je5Var = x02Var.a3;
                            if (je5Var != null) {
                                je5Var.f(true);
                            }
                            je5 je5Var2 = new je5(x02Var.getContext(), 1);
                            x02Var.a3 = je5Var2;
                            if (!T) {
                                i6 = 2131748640;
                            } else {
                                i6 = 2131748641;
                            }
                            je5Var2.t(gl.S2(k96.M0(i6, null)));
                            x02Var.a3.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            x02Var.a3.o(1.0f, -((x02Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gl.L(14.0f)));
                            x02Var.a3.setTranslationY(x02Var.X2.getTranslationY());
                            je5 je5Var3 = x02Var.a3;
                            je5Var3.r0 = new kx1(x02Var, je5Var2, (byte) 4);
                            x02Var.b.addView(je5Var3, nme.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            x02Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        p02 p02Var = x02Var.v2;
                        if (p02Var != null) {
                            p02Var.x(40);
                            return;
                        }
                        return;
                    default:
                        x02Var.h3.U(null, null);
                        return;
                }
            }
        });
        wz1Var.setAlpha(0.0f);
        wz1Var.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.i3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.g3 = textView;
        tb4.w(textView, i4, wjbVar, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, nme.r(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.j3 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(2131230875).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.x(imageView, mutate, i4, wjbVar, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, nme.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        wz1Var.addView(linearLayout, nme.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.k3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(2131230874).mutate();
        zkb.x(imageView2, mutate2, i4, wjbVar, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, nme.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.l3 = textView2;
        tb4.w(textView2, i4, wjbVar, 1, 16.0f);
        de9.q(textView2, 19, "AttachMediaPreview", 2131753955);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, nme.r(-2, -2, 16));
        wz1Var.addView(linearLayout2, nme.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = new ChatAttachAlertPhotoLayout(this, context, z, z3, wjbVar);
        this.d2 = chatAttachAlertPhotoLayout2;
        p02VarArr[0] = chatAttachAlertPhotoLayout2;
        chatAttachAlertPhotoLayout2.setTranslationX(0.0f);
        this.v2 = chatAttachAlertPhotoLayout2;
        this.T2 = 1L;
        this.b.addView(chatAttachAlertPhotoLayout2, nme.c(-1.0f, -1));
        ry1 ry1Var = new ry1(context);
        this.s3 = ry1Var;
        ry1Var.setup(kl0Var4);
        ry1Var.setFadeTopAlpha(0);
        ry1Var.setFadeHeightTop(gl.L(48.0f));
        ry1Var.setFadeHeightBottom(gl.L(48.0f));
        ry1Var.setFadeZoneTop(gl.L(5.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gl.m);
        this.b.addView(ry1Var, nme.g());
        this.b.addView(wz1Var, nme.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        st stVar = new st(context, (byte) 5);
        this.L2 = stVar;
        this.b.addView(stVar, nme.e(-1, -2, 55));
        this.b.addView(x10Var, nme.c(-2.0f, -1));
        this.b.addView(r7Var2, nme.e(48, 48, 53));
        this.b.addView(r7Var, nme.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        r7 r7Var6 = this.b3;
        if (r7Var6 != null) {
            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout2;
            this.b.addView(r7Var6, nme.e(48, 48, 53));
        } else {
            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout2;
        }
        wz1Var.addView(r7Var5, nme.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.b.addView(t8Var, nme.e(-2, 48, 53));
        wz1 wz1Var2 = new wz1(this, context, (byte) 1);
        this.u3 = wz1Var2;
        xz1 xz1Var = new xz1(context, (byte) 0);
        this.v3 = xz1Var;
        xz1Var.setClipChildren(true);
        xz1Var.setClipToPadding(false);
        u02 u02Var = new u02(this, context);
        this.x3 = u02Var;
        xz1Var.setAdapter(u02Var);
        t26 t26Var = new t26(0, false);
        this.w3 = t26Var;
        xz1Var.setLayoutManager(t26Var);
        xz1Var.setVerticalScrollBarEnabled(false);
        xz1Var.setHorizontalScrollBarEnabled(false);
        xz1Var.setItemAnimator(null);
        xz1Var.setLayoutAnimation(null);
        zkb.l(xz1Var, 21, bkb.z5, wjbVar);
        xz1Var.z2 = true;
        xz1Var.setOverScrollMode(2);
        qw4 qw4Var = this.X0;
        kl0Var3.j = qw4Var;
        kl0Var5.j = qw4Var;
        kl0Var4.j = qw4Var;
        yz1 yz1Var = new yz1(this, context, (byte) 0);
        this.t3 = yz1Var;
        ql0 ql0Var = new ql0(kl0Var4.c(yz1Var, null, false));
        this.V1 = ql0Var;
        if (gba.f()) {
            e66.e(262144);
        }
        ql0Var.b(gl.L(72.0f), true);
        this.b.addView(yz1Var, nme.g());
        il0 c = kl0Var3.c(wz1Var2, nod.g(wjbVar), false);
        c.r(gl.L(28.0f));
        c.q(gl.L(7.0f));
        wz1Var2.setBackground(c);
        xz1Var.setPadding(gl.L(11.0f), gl.L(11.0f), gl.L(11.0f), gl.L(11.0f));
        xz1Var.setClipToOutline(true);
        xi xiVar = zdc.a;
        xz1Var.setOutlineProvider(new xdc(gl.L(11.0f), gl.L(28.0f)));
        xz1Var.setImportantForAccessibility(1);
        wz1Var2.addView(xz1Var, nme.g());
        this.b.addView(wz1Var2, nme.e(-1, 70, 81));
        xz1Var.setOnItemClickListener(new k0(this, wjbVar, (byte) 8));
        xz1Var.setOnItemLongClickListener(new fz1(this, (byte) 3));
        hn hnVar = new hn(context, true, false, true);
        this.B3 = hnVar;
        hnVar.setVisibility(8);
        hnVar.setAlpha(0.0f);
        hnVar.setGravity(17);
        hnVar.setTypeface(gl.o());
        int L3 = gl.L(16.0f);
        hnVar.setPadding(L3, 0, L3, 0);
        hnVar.setTextSize(gl.L(f));
        hnVar.setOnClickListener(new View.OnClickListener(this) {
            public final x02 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                s12 s12Var;
                int i6;
                byte b = r2;
                boolean z5 = false;
                x02 x02Var = this.b;
                switch (b) {
                    case 0:
                        if (x02Var.v2 != x02Var.k2) {
                            z5 = true;
                        }
                        x02Var.J1(z5);
                        return;
                    case 1:
                        long j = x02Var.T2;
                        if (j < 0 && (s12Var = (s12) x02Var.u2.get(-j)) != null) {
                            hv0 webViewContainer = s12Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = x02Var.W1;
                        if (!z6) {
                            x02Var.q1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = x02Var.W1;
                        if (z7) {
                            x02Var.q1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        x02Var.i1();
                        return;
                    case 5:
                        x02Var.X2.U(null, null);
                        return;
                    case 6:
                        if (x02Var.d2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z8 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout22 = x02Var.d2;
                            chatAttachAlertPhotoLayout22.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jm6) {
                                        jm6 jm6Var = (jm6) entry.getValue();
                                        if (jm6Var.d()) {
                                            jm6Var.O = Boolean.valueOf(T);
                                            for (int i7 = 0; i7 < chatAttachAlertPhotoLayout22.F.getChildCount(); i7++) {
                                                View childAt = chatAttachAlertPhotoLayout22.F.getChildAt(i7);
                                                if (childAt instanceof o48) {
                                                    o48 o48Var = (o48) childAt;
                                                    if (o48Var.getPhotoEntry() == jm6Var) {
                                                        o48Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gba.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout22.y0();
                            }
                            x02Var.I1(true);
                            r7 r7Var32 = x02Var.Z2;
                            je5 je5Var = x02Var.a3;
                            if (je5Var != null) {
                                je5Var.f(true);
                            }
                            je5 je5Var2 = new je5(x02Var.getContext(), 1);
                            x02Var.a3 = je5Var2;
                            if (!T) {
                                i6 = 2131748640;
                            } else {
                                i6 = 2131748641;
                            }
                            je5Var2.t(gl.S2(k96.M0(i6, null)));
                            x02Var.a3.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            x02Var.a3.o(1.0f, -((x02Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gl.L(14.0f)));
                            x02Var.a3.setTranslationY(x02Var.X2.getTranslationY());
                            je5 je5Var3 = x02Var.a3;
                            je5Var3.r0 = new kx1(x02Var, je5Var2, (byte) 4);
                            x02Var.b.addView(je5Var3, nme.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            x02Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        p02 p02Var = x02Var.v2;
                        if (p02Var != null) {
                            p02Var.x(40);
                            return;
                        }
                        return;
                    default:
                        x02Var.h3.U(null, null);
                        return;
                }
            }
        });
        this.b.addView(hnVar, nme.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.z3 = radialProgressView;
        radialProgressView.setSize(gl.L(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.b.addView(radialProgressView, nme.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.C2 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i6 = bkb.y6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        zkb.s(imageView3, i6, wjbVar, mode2);
        imageView3.setImageResource(2131231842);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final x02 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                s12 s12Var;
                int i62;
                byte b = r2;
                boolean z5 = false;
                x02 x02Var = this.b;
                switch (b) {
                    case 0:
                        if (x02Var.v2 != x02Var.k2) {
                            z5 = true;
                        }
                        x02Var.J1(z5);
                        return;
                    case 1:
                        long j = x02Var.T2;
                        if (j < 0 && (s12Var = (s12) x02Var.u2.get(-j)) != null) {
                            hv0 webViewContainer = s12Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = x02Var.W1;
                        if (!z6) {
                            x02Var.q1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = x02Var.W1;
                        if (z7) {
                            x02Var.q1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        x02Var.i1();
                        return;
                    case 5:
                        x02Var.X2.U(null, null);
                        return;
                    case 6:
                        if (x02Var.d2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z8 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout22 = x02Var.d2;
                            chatAttachAlertPhotoLayout22.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jm6) {
                                        jm6 jm6Var = (jm6) entry.getValue();
                                        if (jm6Var.d()) {
                                            jm6Var.O = Boolean.valueOf(T);
                                            for (int i7 = 0; i7 < chatAttachAlertPhotoLayout22.F.getChildCount(); i7++) {
                                                View childAt = chatAttachAlertPhotoLayout22.F.getChildAt(i7);
                                                if (childAt instanceof o48) {
                                                    o48 o48Var = (o48) childAt;
                                                    if (o48Var.getPhotoEntry() == jm6Var) {
                                                        o48Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gba.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout22.y0();
                            }
                            x02Var.I1(true);
                            r7 r7Var32 = x02Var.Z2;
                            je5 je5Var = x02Var.a3;
                            if (je5Var != null) {
                                je5Var.f(true);
                            }
                            je5 je5Var2 = new je5(x02Var.getContext(), 1);
                            x02Var.a3 = je5Var2;
                            if (!T) {
                                i62 = 2131748640;
                            } else {
                                i62 = 2131748641;
                            }
                            je5Var2.t(gl.S2(k96.M0(i62, null)));
                            x02Var.a3.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            x02Var.a3.o(1.0f, -((x02Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gl.L(14.0f)));
                            x02Var.a3.setTranslationY(x02Var.X2.getTranslationY());
                            je5 je5Var3 = x02Var.a3;
                            je5Var3.r0 = new kx1(x02Var, je5Var2, (byte) 4);
                            x02Var.b.addView(je5Var3, nme.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            x02Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        p02 p02Var = x02Var.v2;
                        if (p02Var != null) {
                            p02Var.x(40);
                            return;
                        }
                        return;
                    default:
                        x02Var.h3.U(null, null);
                        return;
                }
            }
        });
        wz1 wz1Var3 = new wz1(this, context, (byte) 2);
        this.A2 = wz1Var3;
        u31 u31Var = new u31(this, context);
        this.z2 = u31Var;
        wz1Var3.addView(u31Var, nme.e(-1, -1, 119));
        il0 c2 = kl0Var5.c(k02Var, nod.n(wjbVar), false);
        this.x2 = c2;
        c2.U = true;
        c2.s(gl.L(29.0f), gl.L(29.0f), 0.0f, 0.0f);
        c2.u(gl.L(32.0f));
        c2.S.g = 0.4f;
        c2.n();
        il0 c3 = kl0Var3.c(u31Var, nod.n(wjbVar), false);
        this.y2 = c3;
        c3.r(gl.L(22.0f));
        c3.q(gl.L(7.0f));
        u31Var.setPadding(gl.L(7.0f), gl.L(5.0f), gl.L(7.0f), gl.L(5.0f));
        wz1Var3.setWillNotDraw(false);
        wz1Var3.setVisibility(4);
        wz1Var3.setAlpha(0.0f);
        this.b.addView(wz1Var3, nme.e(-1, -2, 83));
        wz1Var3.setOnTouchListener(new jz1((byte) 0));
        hn hnVar2 = new hn(context, false, false, false);
        this.t1 = hnVar2;
        hnVar2.setAllowCancel(true);
        hnVar2.setScaleProperty(0.6f);
        hnVar2.setVisibility(8);
        hnVar2.setTextSize(gl.L(15.0f));
        int i7 = bkb.x6;
        zkb.U(hnVar2, i7, wjbVar);
        hnVar2.setTypeface(gl.o());
        hnVar2.setGravity(17);
        u31Var.addView(hnVar2, nme.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.v1 = imageView4;
        gc gcVar = new gc(context);
        this.w1 = gcVar;
        imageView4.setImageDrawable(gcVar);
        imageView4.setScaleType(scaleType);
        int i8 = bkb.Ml;
        zkb.s(imageView4, i8, wjbVar, mode);
        int i9 = bkb.h6;
        ff0 f05 = bkb.f0(bkb.v0(i9, this.J0), 1, gl.L(16.0f));
        vkb M5 = zkb.M(i9);
        imageView4.setBackground(f05);
        zkb.j(imageView4, f05, null, M5, wjbVar);
        u31Var.addView(imageView4, nme.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(k96.M0(2131755006, null));
        ote.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final x02 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                mu1 mu1Var;
                byte b = r3;
                wjb wjbVar2 = wjbVar;
                final x02 x02Var = this.b;
                boolean z5 = false;
                boolean z6 = true;
                switch (b) {
                    case 0:
                        zz1 zz1Var = x02Var.B2;
                        if (zz1Var != null) {
                            na7.c1().edit().putInt("aihintshown", 3).apply();
                            a1 a1Var = new a1(x02Var.getContext(), wjbVar2);
                            a1Var.o1(zz1Var.getText());
                            a1Var.e2 = new p8c() {
                                @Override
                                public final void a(Object obj) {
                                    byte b2 = r2;
                                    x02 x02Var2 = x02Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b2) {
                                        case 0:
                                            zz1 zz1Var2 = x02Var2.B2;
                                            zz1Var2.setText(charSequence);
                                            zz1Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            b02 b02Var2 = x02Var2.M2;
                                            b02Var2.setText(charSequence);
                                            b02Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j = x02Var.T1;
                            if (x02Var.E3 == null) {
                                z6 = false;
                            }
                            a1Var.m1(j, z6, new mz1(x02Var, (byte) 0));
                            a1Var.show();
                            return;
                        }
                        return;
                    case 1:
                        b02 b02Var = x02Var.M2;
                        if (b02Var != null) {
                            na7.c1().edit().putInt("aihintshown", 3).apply();
                            a1 a1Var2 = new a1(x02Var.getContext(), wjbVar2);
                            a1Var2.o1(b02Var.getText());
                            a1Var2.e2 = new p8c() {
                                @Override
                                public final void a(Object obj) {
                                    byte b2 = r2;
                                    x02 x02Var2 = x02Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b2) {
                                        case 0:
                                            zz1 zz1Var2 = x02Var2.B2;
                                            zz1Var2.setText(charSequence);
                                            zz1Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            b02 b02Var2 = x02Var2.M2;
                                            b02Var2.setText(charSequence);
                                            b02Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j2 = x02Var.T1;
                            if (x02Var.E3 != null) {
                                z5 = true;
                            }
                            a1Var2.m1(j2, z5, new mz1(x02Var, (byte) 1));
                            a1Var2.show();
                            return;
                        }
                        return;
                    default:
                        x02Var.h3.U(null, null);
                        PhotoViewer r0 = PhotoViewer.r0();
                        d dVar2 = x02Var.Z1;
                        r0.T1(null, dVar2, wjbVar2);
                        PhotoViewer.r0().U1(x02Var);
                        PhotoViewer r02 = PhotoViewer.r0();
                        int i62 = x02Var.P3;
                        boolean z7 = x02Var.Q3;
                        r02.h = i62;
                        r02.n = z7;
                        if (!x02Var.W3.g0()) {
                            gl.t1(dVar2.getFragmentView().findFocus());
                            gl.t1(x02Var.c.findFocus());
                        }
                        File w = f4b.w(x02Var.G3, "webp");
                        Point point = gl.q;
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
                            fa4.g(th, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        jm6 jm6Var = new jm6(0, w.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(jm6Var);
                        PhotoViewer r03 = PhotoViewer.r0();
                        o02 o02Var = new o02(x02Var, jm6Var);
                        if (dVar2 instanceof mu1) {
                            mu1Var = (mu1) dVar2;
                        } else {
                            mu1Var = null;
                        }
                        r03.o1(arrayList2, 0, 11, false, o02Var, mu1Var);
                        if (x02Var.A1) {
                            PhotoViewer.r0().V(null, null, true, x02Var.D1);
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
        this.E1 = na7.q1(y6c.t0).F0();
        zz1 zz1Var = new zz1(this, context, k02Var, wjbVar);
        this.B2 = zz1Var;
        zz1Var.K = true;
        zz1Var.setHint(k96.M0(2131754451, "AddCaption"));
        zz1Var.s();
        zz1Var.getEditText().setLayoutParams(nme.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        zz1Var.getEditText().addTextChangedListener(new a02(this, (byte) 0));
        u31Var.addView(zz1Var, nme.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        u31Var.setClipChildren(false);
        wz1Var3.setClipChildren(false);
        zz1Var.setClipChildren(false);
        stVar.setPadding(gl.L(10.0f), gl.L(2.0f), gl.L(10.0f), gl.L(10.0f));
        stVar.setWillNotDraw(false);
        b02 b02Var = new b02(this, context, k02Var, wjbVar);
        this.M2 = b02Var;
        b02Var.K = true;
        b02Var.getEditText().addTextChangedListener(new d02(this, dVar));
        b02Var.getEditText().setPadding(0, gl.L(9.0f), 0, gl.L(9.0f));
        b02Var.getEditText().setLayoutParams(nme.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        b02Var.getEditText().setTextSize(1, 17.0f);
        b02Var.getEmojiButton().setLayoutParams(nme.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        b02Var.setHint(k96.M0(2131754451, "AddCaption"));
        stVar.addView(b02Var, nme.e(-1, -2, 119));
        stVar.setAlpha(0.0f);
        stVar.setVisibility(8);
        zz1Var.addView(imageView3, nme.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        il0 c4 = kl0Var3.c(stVar, nod.n(wjbVar), false);
        c4.r(gl.L(22.0f));
        c4.q(gl.L(7.0f));
        stVar.setBackground(c4);
        stVar.setPadding(gl.L(11.0f), gl.L(9.0f), gl.L(11.0f), gl.L(9.0f));
        hn hnVar3 = new hn(context, false, false, false);
        this.u1 = hnVar3;
        hnVar3.setScaleProperty(0.6f);
        hnVar3.setVisibility(8);
        hnVar3.setTextSize(gl.L(15.0f));
        zkb.U(hnVar3, i7, wjbVar);
        hnVar3.setTypeface(gl.o());
        hnVar3.setGravity(17);
        hnVar3.setAllowCancel(true);
        stVar.addView(hnVar3, nme.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(2131231843);
        zkb.s(imageView5, bkb.Ne, wjbVar, mode2);
        b02Var.addView(imageView5, nme.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final x02 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                s12 s12Var;
                int i62;
                byte b = r2;
                boolean z5 = false;
                x02 x02Var = this.b;
                switch (b) {
                    case 0:
                        if (x02Var.v2 != x02Var.k2) {
                            z5 = true;
                        }
                        x02Var.J1(z5);
                        return;
                    case 1:
                        long j = x02Var.T2;
                        if (j < 0 && (s12Var = (s12) x02Var.u2.get(-j)) != null) {
                            hv0 webViewContainer = s12Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = x02Var.W1;
                        if (!z6) {
                            x02Var.q1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = x02Var.W1;
                        if (z7) {
                            x02Var.q1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        x02Var.i1();
                        return;
                    case 5:
                        x02Var.X2.U(null, null);
                        return;
                    case 6:
                        if (x02Var.d2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z8 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout22 = x02Var.d2;
                            chatAttachAlertPhotoLayout22.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jm6) {
                                        jm6 jm6Var = (jm6) entry.getValue();
                                        if (jm6Var.d()) {
                                            jm6Var.O = Boolean.valueOf(T);
                                            for (int i72 = 0; i72 < chatAttachAlertPhotoLayout22.F.getChildCount(); i72++) {
                                                View childAt = chatAttachAlertPhotoLayout22.F.getChildAt(i72);
                                                if (childAt instanceof o48) {
                                                    o48 o48Var = (o48) childAt;
                                                    if (o48Var.getPhotoEntry() == jm6Var) {
                                                        o48Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gba.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout22.y0();
                            }
                            x02Var.I1(true);
                            r7 r7Var32 = x02Var.Z2;
                            je5 je5Var = x02Var.a3;
                            if (je5Var != null) {
                                je5Var.f(true);
                            }
                            je5 je5Var2 = new je5(x02Var.getContext(), 1);
                            x02Var.a3 = je5Var2;
                            if (!T) {
                                i62 = 2131748640;
                            } else {
                                i62 = 2131748641;
                            }
                            je5Var2.t(gl.S2(k96.M0(i62, null)));
                            x02Var.a3.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            x02Var.a3.o(1.0f, -((x02Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gl.L(14.0f)));
                            x02Var.a3.setTranslationY(x02Var.X2.getTranslationY());
                            je5 je5Var3 = x02Var.a3;
                            je5Var3.r0 = new kx1(x02Var, je5Var2, (byte) 4);
                            x02Var.b.addView(je5Var3, nme.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            x02Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        p02 p02Var = x02Var.v2;
                        if (p02Var != null) {
                            p02Var.x(40);
                            return;
                        }
                        return;
                    default:
                        x02Var.h3.U(null, null);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.x1 = imageView6;
        gc gcVar2 = new gc(context);
        this.y1 = gcVar2;
        imageView6.setImageDrawable(gcVar2);
        imageView6.setScaleType(scaleType);
        zkb.s(imageView6, i8, wjbVar, mode);
        ff0 f06 = bkb.f0(bkb.v0(i9, this.J0), 1, gl.L(16.0f));
        vkb M6 = zkb.M(i9);
        imageView6.setBackground(f06);
        zkb.j(imageView6, f06, null, M6, wjbVar);
        stVar.addView(imageView6, nme.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(k96.M0(2131755006, null));
        ote.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final x02 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                mu1 mu1Var;
                byte b = r3;
                wjb wjbVar2 = wjbVar;
                final x02 x02Var = this.b;
                boolean z5 = false;
                boolean z6 = true;
                switch (b) {
                    case 0:
                        zz1 zz1Var2 = x02Var.B2;
                        if (zz1Var2 != null) {
                            na7.c1().edit().putInt("aihintshown", 3).apply();
                            a1 a1Var = new a1(x02Var.getContext(), wjbVar2);
                            a1Var.o1(zz1Var2.getText());
                            a1Var.e2 = new p8c() {
                                @Override
                                public final void a(Object obj) {
                                    byte b2 = r2;
                                    x02 x02Var2 = x02Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b2) {
                                        case 0:
                                            zz1 zz1Var22 = x02Var2.B2;
                                            zz1Var22.setText(charSequence);
                                            zz1Var22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            b02 b02Var2 = x02Var2.M2;
                                            b02Var2.setText(charSequence);
                                            b02Var2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j = x02Var.T1;
                            if (x02Var.E3 == null) {
                                z6 = false;
                            }
                            a1Var.m1(j, z6, new mz1(x02Var, (byte) 0));
                            a1Var.show();
                            return;
                        }
                        return;
                    case 1:
                        b02 b02Var2 = x02Var.M2;
                        if (b02Var2 != null) {
                            na7.c1().edit().putInt("aihintshown", 3).apply();
                            a1 a1Var2 = new a1(x02Var.getContext(), wjbVar2);
                            a1Var2.o1(b02Var2.getText());
                            a1Var2.e2 = new p8c() {
                                @Override
                                public final void a(Object obj) {
                                    byte b2 = r2;
                                    x02 x02Var2 = x02Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b2) {
                                        case 0:
                                            zz1 zz1Var22 = x02Var2.B2;
                                            zz1Var22.setText(charSequence);
                                            zz1Var22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            b02 b02Var22 = x02Var2.M2;
                                            b02Var22.setText(charSequence);
                                            b02Var22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j2 = x02Var.T1;
                            if (x02Var.E3 != null) {
                                z5 = true;
                            }
                            a1Var2.m1(j2, z5, new mz1(x02Var, (byte) 1));
                            a1Var2.show();
                            return;
                        }
                        return;
                    default:
                        x02Var.h3.U(null, null);
                        PhotoViewer r0 = PhotoViewer.r0();
                        d dVar2 = x02Var.Z1;
                        r0.T1(null, dVar2, wjbVar2);
                        PhotoViewer.r0().U1(x02Var);
                        PhotoViewer r02 = PhotoViewer.r0();
                        int i62 = x02Var.P3;
                        boolean z7 = x02Var.Q3;
                        r02.h = i62;
                        r02.n = z7;
                        if (!x02Var.W3.g0()) {
                            gl.t1(dVar2.getFragmentView().findFocus());
                            gl.t1(x02Var.c.findFocus());
                        }
                        File w = f4b.w(x02Var.G3, "webp");
                        Point point = gl.q;
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
                            fa4.g(th, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        jm6 jm6Var = new jm6(0, w.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(jm6Var);
                        PhotoViewer r03 = PhotoViewer.r0();
                        o02 o02Var = new o02(x02Var, jm6Var);
                        if (dVar2 instanceof mu1) {
                            mu1Var = (mu1) dVar2;
                        } else {
                            mu1Var = null;
                        }
                        r03.o1(arrayList2, 0, 11, false, o02Var, mu1Var);
                        if (x02Var.A1) {
                            PhotoViewer.r0().V(null, null, true, x02Var.D1);
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
        wz1 wz1Var4 = new wz1(this, context, (byte) 3);
        this.E2 = wz1Var4;
        wz1Var4.setFocusable(true);
        wz1Var4.setFocusableInTouchMode(true);
        wz1Var4.setVisibility(4);
        wz1Var4.setScaleX(0.2f);
        wz1Var4.setScaleY(0.2f);
        wz1Var4.setAlpha(0.0f);
        wz1Var4.setClipChildren(false);
        wz1Var4.setClipToPadding(false);
        this.b.addView(wz1Var4, nme.e(110, 50, 85));
        e02 e02Var = new e02(this, wjbVar, context);
        this.F2 = e02Var;
        e02Var.setImportantForAccessibility(2);
        wz1Var4.addView(e02Var, nme.e(-1, -1, 119));
        e02Var.setTranslationX(this.u0);
        int L4 = gl.L(52.0f);
        int L5 = gl.L(38.0f);
        e02Var.L = L4;
        e02Var.M = L5;
        e02Var.P = gl.L(7.0f);
        e02Var.Q = gl.L(6.0f);
        e02Var.s0 = true;
        e02Var.setOnClickListener(new View.OnClickListener(this) {
            public final x02 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                s12 s12Var;
                int i62;
                byte b = r2;
                boolean z5 = false;
                x02 x02Var = this.b;
                switch (b) {
                    case 0:
                        if (x02Var.v2 != x02Var.k2) {
                            z5 = true;
                        }
                        x02Var.J1(z5);
                        return;
                    case 1:
                        long j = x02Var.T2;
                        if (j < 0 && (s12Var = (s12) x02Var.u2.get(-j)) != null) {
                            hv0 webViewContainer = s12Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = x02Var.W1;
                        if (!z6) {
                            x02Var.q1(!z6, true);
                            return;
                        }
                        return;
                    case 3:
                        boolean z7 = x02Var.W1;
                        if (z7) {
                            x02Var.q1(!z7, true);
                            return;
                        }
                        return;
                    case 4:
                        x02Var.i1();
                        return;
                    case 5:
                        x02Var.X2.U(null, null);
                        return;
                    case 6:
                        if (x02Var.d2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z8 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout22 = x02Var.d2;
                            chatAttachAlertPhotoLayout22.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jm6) {
                                        jm6 jm6Var = (jm6) entry.getValue();
                                        if (jm6Var.d()) {
                                            jm6Var.O = Boolean.valueOf(T);
                                            for (int i72 = 0; i72 < chatAttachAlertPhotoLayout22.F.getChildCount(); i72++) {
                                                View childAt = chatAttachAlertPhotoLayout22.F.getChildAt(i72);
                                                if (childAt instanceof o48) {
                                                    o48 o48Var = (o48) childAt;
                                                    if (o48Var.getPhotoEntry() == jm6Var) {
                                                        o48Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gba.e1 = z8;
                                edit.putBoolean("photoLiveDefault", z8).apply();
                                chatAttachAlertPhotoLayout22.y0();
                            }
                            x02Var.I1(true);
                            r7 r7Var32 = x02Var.Z2;
                            je5 je5Var = x02Var.a3;
                            if (je5Var != null) {
                                je5Var.f(true);
                            }
                            je5 je5Var2 = new je5(x02Var.getContext(), 1);
                            x02Var.a3 = je5Var2;
                            if (!T) {
                                i62 = 2131748640;
                            } else {
                                i62 = 2131748641;
                            }
                            je5Var2.t(gl.S2(k96.M0(i62, null)));
                            x02Var.a3.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            x02Var.a3.o(1.0f, -((x02Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gl.L(14.0f)));
                            x02Var.a3.setTranslationY(x02Var.X2.getTranslationY());
                            je5 je5Var3 = x02Var.a3;
                            je5Var3.r0 = new kx1(x02Var, je5Var2, (byte) 4);
                            x02Var.b.addView(je5Var3, nme.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            x02Var.a3.v();
                            return;
                        }
                        return;
                    case 7:
                        p02 p02Var = x02Var.v2;
                        if (p02Var != null) {
                            p02Var.x(40);
                            return;
                        }
                        return;
                    default:
                        x02Var.h3.U(null, null);
                        return;
                }
            }
        });
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout;
        e02Var.setOnLongClickListener(new nm1(this, context, wjbVar, dVar, (byte) 1));
        textPaint.setTextSize(gl.L(12.0f));
        textPaint.setTypeface(gl.o());
        yz1 yz1Var2 = new yz1(this, context, (byte) 1);
        yz1Var2.setAlpha(0.0f);
        yz1Var2.setScaleX(0.2f);
        yz1Var2.setScaleY(0.2f);
        if (z) {
            H0();
            i = -1;
            this.G0 = -1;
        } else {
            i = -1;
        }
        chatAttachAlertPhotoLayout3.F.getFastScroll().a(kl0Var3, nod.n(wjbVar));
        yv7 yv7Var = new yv7(context);
        this.M1 = yv7Var;
        this.b.addView(yv7Var, nme.c(-1.0f, i));
        nl0 nl0Var = new nl0(wjbVar);
        nl0Var.e = new fz1(this, (byte) 5);
        nl0Var.c = new fz1(this, (byte) 6);
        nl0Var.d = new fz1(this, (byte) 7);
        nl0Var.b = new fz1(this, (byte) 8);
        float N = gl.N(3.3333333f);
        float N2 = gl.N(0.6666667f);
        nl0Var.n = N;
        nl0Var.r = N2;
        float N3 = gl.N(1.0f);
        float N4 = gl.N(0.6666667f);
        nl0Var.f = N3;
        nl0Var.h = N4;
        x10Var.P(kl0Var3, nl0Var, false);
        k79Var.h(1L, false);
        this.X0.i(this.b);
        qw4 qw4Var2 = this.X0;
        qw4Var2.a = new fz1(this, (byte) 9);
        qw4Var2.d = new ax4(gl.L(48.0f));
    }

    public static boolean b1(TLRPC.User user) {
        if (user != null && !l7c.D(user) && !l7c.v(user) && !l7c.z(user) && !l7c.C(user.id) && !l7c.B(user) && !l7c.u(user) && user.id != 489000 && !na7.E2(user)) {
            return true;
        }
        return false;
    }

    public static void n1(p02 p02Var) {
        if (p02Var != null) {
            int i = zkb.b;
            Object tag = p02Var.getTag(2131296712);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                return;
            }
            p02Var.setTag(2131296712, Integer.valueOf(i));
            try {
                zkb.c0(p02Var, true);
                p02Var.d();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override
    public final boolean A0() {
        p02 p02Var = this.v2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (p02Var == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.j1) {
            return true;
        }
        return false;
    }

    public final void A1(p02 p02Var) {
        long j = this.T2;
        f72 f72Var = this.N1;
        if (p02Var == f72Var) {
            j = f72Var.s;
        } else if (p02Var == this.d2) {
            j = 1;
        } else if (p02Var == this.f2) {
            j = 3;
        } else if (p02Var == this.j2) {
            j = 4;
        } else if (p02Var == this.e2) {
            j = 5;
        } else if (p02Var == this.i2) {
            j = 6;
        } else if (p02Var == this.g2) {
            j = 9;
        } else if (p02Var == this.l2) {
            j = 10;
        } else if (p02Var == this.m2) {
            j = 11;
        } else if (p02Var == this.h2) {
            j = 12;
        } else if (p02Var == this.n2) {
            j = 14;
        } else if (p02Var == this.o2) {
            j = 13;
        } else if (p02Var == this.p2) {
            j = 16;
        } else if (p02Var == this.q2) {
            j = 17;
        }
        B1(p02Var, j, true);
    }

    public final void B1(p02 p02Var, long j, boolean z) {
        boolean z2;
        int i;
        b52 b52Var;
        boolean z3;
        Integer num;
        b52 b52Var2;
        Float f;
        int i2;
        boolean z4;
        Float valueOf = Float.valueOf(0.0f);
        if (this.q3 == null && this.J2 == null) {
            p02 p02Var2 = this.v2;
            if (p02Var2 == p02Var) {
                p02Var2.K();
                return;
            }
            int i3 = 0;
            if (p02Var == this.h2 && !y6c.h(this.G3).p()) {
                new jh8(this.Z1, 39, false).show();
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
            wz1 wz1Var = this.u3;
            wz1Var.setAlpha(1.0f);
            wz1Var.setTranslationY(this.C3);
            int i5 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.u2;
                if (i5 >= longSparseArray.size()) {
                    break;
                }
                ((s12) longSparseArray.valueAt(i5)).setMeasureOffsetY(0);
                i5++;
            }
            this.T2 = j;
            xz1 xz1Var = this.v3;
            int childCount = xz1Var.getChildCount();
            int i6 = 0;
            while (i6 < childCount) {
                View childAt = xz1Var.getChildAt(i6);
                if (childAt instanceof r02) {
                    r02 r02Var = (r02) childAt;
                    i2 = childCount;
                    f = valueOf;
                    if (r02Var.b == r02Var.c.T2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    r02Var.a.f(z4, true);
                } else {
                    f = valueOf;
                    i2 = childCount;
                    if (childAt instanceof q02) {
                        ((q02) childAt).a(true);
                    }
                }
                i6++;
                childCount = i2;
                valueOf = f;
            }
            Float f2 = valueOf;
            int firstOffset = (this.v2.getFirstOffset() - gl.L(11.0f)) - this.Y3[0];
            this.w2 = p02Var;
            K0(p02Var);
            if (this.w2.j() != 0) {
                i = 0;
            } else {
                i = 4;
            }
            x10 x10Var = this.U2;
            x10Var.setVisibility(i);
            if (x10Var.o0) {
                x10Var.n(true);
            }
            this.v2.v();
            p02 p02Var3 = this.w2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
            if (p02Var3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.w2.I(this.v2);
            this.w2.setVisibility(0);
            if (p02Var.getParent() != null) {
                this.b.removeView(this.w2);
            }
            int indexOfChild = this.b.indexOfChild(this.v2);
            if (this.w2.getParent() != this.b) {
                n1(this.w2);
                ViewGroup viewGroup = this.b;
                p02 p02Var4 = this.w2;
                if (p02Var4 != this.i2) {
                    indexOfChild++;
                }
                viewGroup.addView(p02Var4, indexOfChild, nme.c(-1.0f, -1));
            }
            vq0 vq0Var = new vq0(this, (byte) 6);
            p02 p02Var5 = this.v2;
            boolean z5 = p02Var5 instanceof m52;
            i02 i02Var = this.Y1;
            if (!z5 && !(this.w2 instanceof m52)) {
                if (z) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.w2.setAlpha(0.0f);
                    this.w2.setTranslationY(gl.L(78.0f));
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this.v2, View.TRANSLATION_Y, gl.L(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.v2, i02Var, 0.0f, 1.0f), ObjectAnimator.ofFloat(x10Var, View.ALPHA, x10Var.getAlpha(), 0.0f));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(s33.f);
                    animatorSet.addListener(new f02(this, firstOffset, vq0Var, (byte) 0));
                    this.q3 = animatorSet;
                    p02 p02Var6 = this.v2;
                    i02Var.getClass();
                    i02Var.a(p02Var6, f2);
                    animatorSet.start();
                } else {
                    p02Var5.setAlpha(0.0f);
                    vq0Var.run();
                    K1(0);
                    this.b.invalidate();
                }
            } else {
                int max = Math.max(this.w2.getWidth(), this.v2.getWidth());
                p02 p02Var7 = this.w2;
                if (p02Var7 instanceof m52) {
                    p02Var7.setTranslationX(max);
                    p02 p02Var8 = this.v2;
                    if ((p02Var8 instanceof ChatAttachAlertPhotoLayout) && (b52Var2 = ((ChatAttachAlertPhotoLayout) p02Var8).Q) != null) {
                        b52Var2.setVisibility(4);
                    }
                } else {
                    this.v2.setTranslationX(-max);
                    p02 p02Var9 = this.w2;
                    if (p02Var9 == chatAttachAlertPhotoLayout && (b52Var = ((ChatAttachAlertPhotoLayout) p02Var9).Q) != null) {
                        b52Var.setVisibility(0);
                    }
                }
                this.w2.setAlpha(1.0f);
                this.v2.setAlpha(1.0f);
                if (z) {
                    p02 p02Var10 = this.v2;
                    i02Var.getClass();
                    i02Var.a(p02Var10, f2);
                    gl.c3(new jn1(this, p02Var, vq0Var, (byte) 11));
                } else {
                    if (this.w2.getCurrentItemTop() <= p02Var.getButtonsHideOffset()) {
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
                    p02 p02Var11 = this.v2;
                    Float valueOf2 = Float.valueOf(1.0f);
                    i02Var.getClass();
                    i02Var.a(p02Var11, valueOf2);
                    if (z3) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    x10Var.setTag(num);
                    vq0Var.run();
                }
            }
            if (this.j4 && !(p02Var instanceof s12)) {
                this.j4 = false;
                x10Var.updateColors();
                x10Var.invalidate();
                d1();
            }
            if (i4 != 0 && j != 6 && j != 17 && !(p02Var instanceof s12)) {
                if (j == 4) {
                    i3 = gl.L(84.0f);
                }
            } else {
                i3 = gl.L(46.0f);
            }
            x10Var.setForcedMenuWidth(i3);
        }
    }

    public final void C1(boolean z, Boolean bool) {
        x02 x02Var;
        if (this.g2 == null) {
            x02Var = this;
            k62 k62Var = new k62(x02Var, getContext(), false, this.J0, bool);
            x02Var.g2 = k62Var;
            x02Var.t2[1] = k62Var;
            k62Var.setDelegate(new fz1(x02Var, (byte) 17));
        } else {
            x02Var = this;
        }
        x02Var.B1(x02Var.g2, 9L, z);
    }

    @Override
    public final boolean D() {
        return false;
    }

    public final void D1(boolean z, boolean z2) {
        Integer num;
        boolean z3;
        float f;
        float f2;
        p02 p02Var;
        float f3;
        float f4;
        float f5;
        int i;
        boolean z4;
        this.n1.a(z, z2);
        x10 x10Var = this.U2;
        Object tag = x10Var.getTag();
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
        x10Var.setTag(num);
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
        wz1 wz1Var = this.u3;
        r7 r7Var = this.X2;
        if (z) {
            if (z3) {
                r7Var.setVisibility(0);
                r7Var.setClickable(true);
            }
        } else if (this.P2 && this.A2.getTag() == null) {
            wz1Var.setVisibility(0);
        }
        d dVar = this.Z1;
        if (dVar != null) {
            if (z) {
                if (this.e4) {
                    i = bkb.jh;
                } else {
                    i = bkb.g5;
                }
                if (bm2.h(bkb.v0(i, this.J0)) > 0.699999988079071d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                gl.l3(this, z4);
            } else {
                gl.l3(this, dVar.isLightStatusBar());
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
            animatorSet2.setDuration(Math.abs(f3 - x10Var.getAlpha()) * 180.0f);
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x10Var, property, f4);
            ofFloat.addUpdateListener(new gz1(this, (byte) 4));
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
            this.V2.setInterpolator(s33.h);
            this.V2.setDuration(380L);
            this.V2.start();
            return;
        }
        if (z && this.P2 && ((p02Var = this.v2) == null || p02Var.N())) {
            wz1Var.setVisibility(4);
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        x10Var.setAlpha(f);
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
        zz1 zz1Var = this.B2;
        zz1Var.getLocationOnScreen(iArr);
        if (this.B4 != null) {
            p02 p02Var = this.v2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
            if ((p02Var == chatAttachAlertPhotoLayout || p02Var == this.k2) && this.W1) {
                st stVar = this.L2;
                alpha = (stVar.getAlpha() * stVar.getMeasuredHeight()) + (stVar.getY() - this.B4.getTop());
            } else {
                alpha = -zz1Var.getHeight();
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
        if ((dVar instanceof mu1) && ((mu1) dVar).P4()) {
            return true;
        }
        return false;
    }

    public final void F1(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x02.F1(int):void");
    }

    public final boolean G0(CharSequence charSequence) {
        d dVar = this.Z1;
        if (dVar instanceof mu1) {
            return ChatActivityEnterView.K(this.G3, ((mu1) dVar).a(), dVar, charSequence);
        }
        return false;
    }

    public final void G1() {
        boolean i;
        float f;
        float f2;
        float f3;
        p02 p02Var = this.v2;
        int i2 = 0;
        if (p02Var == null) {
            i = false;
        } else {
            i = p02Var.i();
        }
        t8 t8Var = this.c3;
        t8Var.setEnabled(i);
        p02 p02Var2 = this.v2;
        float f4 = 0.5f;
        if (p02Var2 != null) {
            if (p02Var2.i()) {
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
        p02 p02Var3 = this.w2;
        if (p02Var3 != null) {
            if (p02Var3.i()) {
                f4 = 1.0f;
            }
            f = tb4.A(1.0f, this.X1, f4, f);
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
    public final void H() {
        AnimatorSet animatorSet = this.A0;
        if (animatorSet != null) {
            animatorSet.cancel();
            yla ylaVar = this.m4;
            if (ylaVar != null) {
                ylaVar.d();
            }
            AnimatorSet animatorSet2 = this.n4;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.A0 = null;
            this.B0 = (byte) 0;
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
        xz1 xz1Var = this.v3;
        if (xz1Var == null) {
            return;
        }
        int childCount = xz1Var.getChildCount();
        boolean z2 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            xz1Var.getChildAt(i9);
        }
        boolean z3 = this.e4;
        if (z3) {
            i = bkb.Xg;
        } else {
            i = bkb.i5;
        }
        zkb.X(this.g3, i, this.J0);
        if (z3) {
            i2 = bkb.Xg;
        } else {
            i2 = bkb.i5;
        }
        zkb.X(this.l3, i2, this.J0);
        zkb.X(this.c3, bkb.Ii, this.J0);
        if (z3) {
            i3 = bkb.Xg;
        } else {
            i3 = bkb.i5;
        }
        int v0 = bkb.v0(i3, this.J0);
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
            i4 = bkb.Yg;
        } else {
            i4 = bkb.H5;
        }
        bkb.A1(bkb.v0(i4, this.J0), background);
        int i10 = bkb.D8;
        r7Var.O(bkb.v0(i10, this.J0), false);
        r7Var.O(bkb.v0(i10, this.J0), true);
        r7Var.I(bkb.v0(bkb.F8, this.J0));
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
                i8 = bkb.Yg;
            } else {
                i8 = bkb.H5;
            }
            bkb.A1(bkb.v0(i8, this.J0), background2);
        }
        zz1 zz1Var = this.B2;
        wjb wjbVar = zz1Var.N;
        mt3 mt3Var = zz1Var.a;
        int i11 = zz1Var.M;
        if (i11 == 0) {
            mt3Var.setHintTextColor(bkb.v0(bkb.G6, wjbVar));
            int i12 = bkb.F6;
            mt3Var.setCursorColor(bkb.v0(i12, wjbVar));
            mt3Var.setTextColor(bkb.v0(i12, wjbVar));
        } else if (i11 != 2 && i11 != 3) {
            mt3Var.setHintTextColor(bkb.v0(bkb.s5, wjbVar));
            mt3Var.setTextColor(bkb.v0(bkb.i5, wjbVar));
        } else {
            mt3Var.setHintTextColor(-1929379841);
            mt3Var.setTextColor(-1);
            mt3Var.setCursorColor(-1);
            mt3Var.setHandlesColor(-1);
            mt3Var.setHighlightColor(822083583);
            mt3Var.E = -1;
        }
        zz1Var.c.setColorFilter(new PorterDuffColorFilter(bkb.v0(bkb.Ne, wjbVar), PorterDuff.Mode.MULTIPLY));
        nt3 nt3Var = zz1Var.d;
        if (nt3Var != null) {
            nt3Var.updateColors();
        }
        zkb.l(xz1Var, 21, bkb.z5, this.J0);
        if (z3) {
            i5 = bkb.Xg;
        } else {
            i5 = bkb.i5;
        }
        wjb wjbVar2 = this.J0;
        x10 x10Var = this.U2;
        zkb.l(x10Var, 1, i5, wjbVar2);
        if (z3) {
            i6 = bkb.Yg;
        } else {
            i6 = bkb.H5;
        }
        zkb.l(x10Var, 3, i6, this.J0);
        if (z3) {
            i7 = bkb.Xg;
        } else {
            i7 = bkb.i5;
        }
        zkb.l(x10Var, 5, i7, this.J0);
        int Y0 = Y0(false);
        bkb.A1(Y0, this.s0);
        ix4 ix4Var = this.D4;
        if (ix4Var.b != Y0) {
            ix4Var.a(Y0);
            ry1 ry1Var = this.s3;
            if (ry1Var != null) {
                ry1Var.invalidate();
            }
            yz1 yz1Var = this.t3;
            if (yz1Var != null) {
                yz1Var.invalidate();
            }
        }
        this.b.invalidate();
        int i13 = 0;
        while (true) {
            p02[] p02VarArr = this.t2;
            if (i13 >= p02VarArr.length) {
                break;
            }
            p02 p02Var = p02VarArr[i13];
            if (p02Var != null) {
                p02Var.d();
            }
            i13++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            this.H0 = bkb.v0(bkb.h5, this.J0);
            gl.o3(this, bkb.v0(bkb.g5, this.J0), false, null);
            if (gl.B(this.H0) > 0.721d) {
                z2 = true;
            }
            gl.i3(this, z2);
            return;
        }
        M(bkb.g5);
    }

    public final void H1(p02 p02Var, int i) {
        boolean z;
        int i2;
        int i3;
        if (p02Var != null) {
            cq3 cq3Var = this.C4;
            if (cq3Var != null && Build.VERSION.SDK_INT >= 31) {
                cq3Var.f(0.0f, i);
            }
            int currentItemTop = p02Var.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z2 = false;
                if (p02Var == this.v2 && currentItemTop <= p02Var.getButtonsHideOffset()) {
                    z = true;
                } else {
                    z = false;
                }
                this.L1 = z;
                if (p02Var == this.v2) {
                    D1(z, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) p02Var.getLayoutParams();
                if (layoutParams == null) {
                    i2 = 0;
                } else {
                    i2 = layoutParams.topMargin;
                }
                int z3 = b00.z(11.0f, i2, currentItemTop);
                p02 p02Var2 = this.v2;
                if (p02Var2 == p02Var) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                if ((p02Var2 instanceof m52) || (this.w2 instanceof m52)) {
                    Object obj = this.q3;
                    if ((obj instanceof yla) && ((yla) obj).f) {
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
    public void I() {
        v02 v02Var = this.W3;
        if (v02Var != null) {
            v02Var.z2(new vq0(this, (byte) 5));
        } else {
            o1();
        }
    }

    public final void I0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x02.I0(boolean):void");
    }

    public final void I1(boolean z) {
        gk2 gk2Var;
        boolean z2;
        float f;
        float f2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (chatAttachAlertPhotoLayout != null && (gk2Var = this.Y2) != null) {
            int i = 0;
            if (this.n3 && this.c2 && this.v2 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.e0()) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = !ChatAttachAlertPhotoLayout.T();
            gk2Var.f = z3;
            if (!z) {
                ((lm) gk2Var.g).a(z3);
            }
            gk2Var.invalidateSelf();
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
                scaleX.scaleY(f4).setDuration(320L).setInterpolator(s33.h).withEndAction(new qz1(this, z2, (byte) 0)).start();
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

    @Override
    public final void J(int i) {
        super.J(i);
        this.v2.s(i);
    }

    public final void J0() {
        float f = this.m1.e;
        float f2 = (1.0f - this.l1.e) * f;
        float min = Math.min(Math.min(1.0f, 1.0f - ((1.0f - f) * (1.0f - this.n1.e))), 1.0f - f2);
        this.t3.setTranslationY(gl.L(48.0f) * min);
    }

    public final void J1(boolean z) {
        boolean z2;
        float f;
        p02 p02Var = this.d2;
        if (z) {
            if (!this.G1) {
                return;
            }
            if (this.k2 == null) {
                Context context = getContext();
                wjb wjbVar = this.s1;
                if (wjbVar == null) {
                    wjbVar = this.J0;
                }
                ?? p02Var2 = new p02(this, wjbVar, context);
                p02Var2.E = 0.0f;
                p02Var2.F = 0.0f;
                p02Var2.G = 0.0f;
                p02Var2.H = 0.0f;
                p02Var2.I = 0.0f;
                p02Var2.J = 0.0f;
                p02Var2.K = null;
                p02Var2.L = false;
                p02Var2.N = 0.0f;
                p02Var2.R = false;
                p02Var2.T = false;
                Point point = gl.q;
                if (point.y > point.x) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                p02Var2.U = z2;
                p02Var2.n = wjbVar;
                p02Var2.f = true;
                p02Var2.setWillNotDraw(false);
                x02 x02Var = p02Var2.b;
                r6 t = x02Var.U2.t();
                TextView textView = new TextView(context);
                p02Var2.y = textView;
                wjb wjbVar2 = p02Var2.a;
                w42 w42Var = new w42(p02Var2, context, t, wjbVar2, (byte) 1);
                x10 x10Var = x02Var.U2;
                if (gl.O1()) {
                    f = 64.0f;
                } else {
                    f = 56.0f;
                }
                x10Var.addView(w42Var, 0, nme.d(-2, -1.0f, 51, f, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                zkb.X(textView, bkb.i5, wjbVar2);
                textView.setText(k96.M0(2131753955, null));
                textView.setTypeface(gl.o());
                textView.setCompoundDrawablePadding(gl.L(4.0f));
                textView.setPadding(0, 0, gl.L(10.0f), 0);
                textView.setAlpha(0.0f);
                w42Var.addView(textView, nme.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                fu fuVar = new fu(p02Var2, context, wjbVar2, (byte) 10);
                p02Var2.r = fuVar;
                fuVar.setAdapter(new jr(p02Var2, (byte) 3));
                t26 t26Var = new t26(1, false);
                p02Var2.s = t26Var;
                fuVar.setLayoutManager(t26Var);
                fuVar.setClipChildren(false);
                fuVar.setClipToPadding(false);
                fuVar.setOverScrollMode(2);
                fuVar.setVerticalScrollBarEnabled(false);
                l52 l52Var = new l52(p02Var2, context);
                p02Var2.w = l52Var;
                l52Var.setClipToPadding(true);
                l52Var.setClipChildren(true);
                p02Var2.addView(fuVar, nme.c(-1.0f, -1));
                p02Var2.Q = x02Var.d2;
                l52Var.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = p02Var2.Q;
                l52Var.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                l52Var.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                l52Var.c();
                UndoView undoView = new UndoView(context, null, false, x02Var.s1);
                p02Var2.x = undoView;
                undoView.setEnterOffsetMargin(gl.L(32.0f));
                p02Var2.addView(undoView, nme.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                p02Var2.O = context.getResources().getDrawable(2131232554);
                this.k2 = p02Var2;
                p02Var2.bringToFront();
            }
            p02 p02Var3 = this.v2;
            m52 m52Var = this.k2;
            if (p02Var3 != m52Var) {
                p02Var = m52Var;
            }
            A1(p02Var);
            return;
        }
        A1(p02Var);
    }

    public final void K0(p02 p02Var) {
        int L;
        boolean e = p02Var.e();
        int i = 0;
        ry1 ry1Var = this.s3;
        if (ry1Var != null) {
            if (e) {
                L = 0;
            } else {
                L = gl.L(48.0f);
            }
            ry1Var.setFadeHeightBottom(L);
        }
        yz1 yz1Var = this.t3;
        if (yz1Var != null) {
            if (e) {
                i = 4;
            }
            yz1Var.setVisibility(i);
        }
    }

    public final void K1(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x02.K1(int):void");
    }

    public final void L0() {
        x10 x10Var;
        boolean z;
        boolean o;
        int i;
        ry1 ry1Var = this.s3;
        if (ry1Var != null && (x10Var = this.U2) != null) {
            p02 p02Var = this.w2;
            if (p02Var == null) {
                p02Var = this.v2;
            }
            int i2 = 0;
            if (p02Var != null && p02Var.f()) {
                z = true;
            } else {
                z = false;
            }
            wjb wjbVar = this.J0;
            if (wjbVar != null) {
                o = wjbVar.a();
            } else {
                o = bkb.I.o();
            }
            if (!z && x10Var.getVisibility() == 0) {
                if (o) {
                    i = 255;
                } else {
                    i = 160;
                }
                i2 = (int) (x10Var.getAlpha() * i);
            }
            ry1Var.setFadeTopAlpha(i2);
        }
    }

    public final void L1() {
        int i = 0;
        K1(0);
        this.o3.invalidate();
        st stVar = this.L2;
        stVar.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (chatAttachAlertPhotoLayout != null) {
            s42 s42Var = chatAttachAlertPhotoLayout.F;
            chatAttachAlertPhotoLayout.W();
            if (s42Var != null && s42Var.getFastScroll() != null) {
                v29 fastScroll = s42Var.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.q1;
                if (this.W1) {
                    i = (int) (stVar.getAlpha() * stVar.getMeasuredHeight());
                }
                fastScroll.i0 = currentActionBarHeight + i;
                s42Var.getFastScroll().invalidate();
            }
        }
        E1();
        N0();
    }

    public final void M0() {
        float f;
        float f2 = this.o1.e;
        float f3 = this.p1.e;
        float a = zfe.a(this.q1.e);
        if (this.O3) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        un4.d(this.C2, yjb.C(f2, f3, a, f));
    }

    public final void N0() {
        e02 e02Var = this.F2;
        wz1 wz1Var = this.E2;
        st stVar = this.L2;
        if (stVar != null && stVar.getVisibility() == 0 && stVar.getAlpha() != 0.0f) {
            float f = this.l1.e;
            float abs = Math.abs(gl.R1(-1.0f, 1.0f, f));
            e02Var.setAlpha(abs * abs * abs * abs);
            wz1Var.setTranslationY(gl.R1(this.d4, ((stVar.getTranslationY() + stVar.getTop()) - wz1Var.getTop()) + gl.L(8.0f), s33.j.getInterpolation(f)));
            return;
        }
        wz1Var.setTranslationY(this.d4);
        e02Var.setAlpha(1.0f);
    }

    public final void O0() {
        eb1 eb1Var = new eb1(this, getContext(), this.T1, LaunchActivity.Q(), this.J0, (byte) 1);
        this.B4 = eb1Var;
        eb1Var.p(new l69(this, (byte) 20));
        ViewGroup viewGroup = this.b;
        viewGroup.addView(this.B4, viewGroup.indexOfChild(this.A2), nme.e(-1, -1, 83));
        eb1 eb1Var2 = this.B4;
        eb1Var2.getAdapter().c = false;
        eb1Var2.getAdapter().d = false;
        eb1Var2.getAdapter().e = false;
        d dVar = this.Z1;
        boolean z = true;
        if (dVar instanceof mu1) {
            eb1Var2.getAdapter().n0 = false;
            mu1 mu1Var = (mu1) dVar;
            kz6 adapter = eb1Var2.getAdapter();
            mu1Var.h();
            TLRPC.Chat chat = mu1Var.e;
            adapter.getClass();
            adapter.m0 = chat;
            eb1Var2.getAdapter().V(mu1Var.r8);
            kz6 adapter2 = eb1Var2.getAdapter();
            if (mu1Var.e == null) {
                z = false;
            }
            adapter2.f0 = z;
        } else {
            eb1Var2.getAdapter().n0 = true;
            eb1Var2.getAdapter().V(null);
            eb1Var2.getAdapter().f0 = false;
        }
        eb1Var2.getAdapter().g0 = false;
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
        String M0 = k96.M0(2131752110, null);
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
            textView.setTranslationY(-gl.L(8.0f));
            r7Var.setVisibility(0);
            r7Var.setClickable(true);
            r7Var.setAlpha(1.0f);
            r7Var.setScaleX(1.0f);
            r7Var.setScaleY(1.0f);
        }
    }

    public final int R0() {
        o27 o27Var;
        m27 m27Var;
        d dVar = this.Z1;
        if (!(dVar instanceof mu1) || (o27Var = ((mu1) dVar).x5) == null || (m27Var = o27Var.b) == null) {
            return 0;
        }
        return m27Var.g.size();
    }

    @Override
    public final ArrayList S() {
        ArrayList<blb> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            p02[] p02VarArr = this.t2;
            if (i < p02VarArr.length) {
                p02 p02Var = p02VarArr[i];
                if (p02Var != null && (themeDescriptions = p02Var.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i++;
            } else {
                arrayList.add(new blb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.h5));
                return arrayList;
            }
        }
    }

    public final TLRPC.Chat S0() {
        d dVar = this.Z1;
        if (dVar instanceof mu1) {
            return ((mu1) dVar).e;
        }
        return na7.q1(this.G3).K0(Long.valueOf(-this.T1));
    }

    public final float T0() {
        wz1 wz1Var = this.A2;
        float alpha = 1.0f - wz1Var.getAlpha();
        return wz1Var.getMeasuredHeight() - (alpha * (wz1Var.getMeasuredHeight() - gl.L(84.0f)));
    }

    public final rt3 U0() {
        p02 p02Var;
        if (this.W1 && ((p02Var = this.v2) == this.d2 || p02Var == this.k2)) {
            return this.M2;
        }
        return this.B2;
    }

    public final long V0() {
        d dVar = this.Z1;
        if (dVar instanceof mu1) {
            return ((mu1) dVar).a();
        }
        return this.T1;
    }

    public final int W0() {
        p02 p02Var = this.v2;
        k62 k62Var = this.g2;
        if (p02Var == k62Var && k62Var.F != null) {
            return k62Var.getEmojiPadding();
        }
        k62 k62Var2 = this.h2;
        if (p02Var == k62Var2 && k62Var2.F != null) {
            return k62Var2.getEmojiPadding();
        }
        if (this.W1) {
            return this.M2.getEmojiPadding();
        }
        return this.B2.getEmojiPadding();
    }

    public final int X0(int i) {
        p02 p02Var = this.w2;
        int[] iArr = this.Y3;
        if (p02Var != null && ((this.v2 instanceof m52) || (p02Var instanceof m52))) {
            return gl.U1(this.X1, iArr[0], iArr[1]);
        }
        return iArr[i];
    }

    public final int Y0(boolean z) {
        boolean o;
        int i;
        x10 x10Var;
        if (this.e4) {
            return bkb.v0(bkb.jh, this.J0);
        }
        wjb wjbVar = this.J0;
        if (wjbVar != null) {
            o = wjbVar.a();
        } else {
            o = bkb.I.o();
        }
        Iterator it = this.r1.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            u46 u46Var = (u46) it.next();
            long longValue = ((Long) u46Var.a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f += u46Var.c();
            }
        }
        float a = moe.a(f, 0.0f, 1.0f);
        if (z && (x10Var = this.U2) != null && x10Var.getVisibility() == 0) {
            a *= 1.0f - x10Var.getAlpha();
        }
        int v0 = bkb.v0(bkb.g5, this.J0);
        if (o) {
            i = bkb.Z6;
        } else {
            i = bkb.h5;
        }
        return bm2.f(a, v0, bkb.v0(i, this.J0));
    }

    public final void Z0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x02.Z0():void");
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
            p02 p02Var = this.v2;
            if (p02Var == this.d2 || p02Var == this.k2) {
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
        v02 v02Var = this.W3;
        if (v02Var != null && !this.r3) {
            boolean g0 = v02Var.g0();
            this.r3 = true;
            mn6 mn6Var = new mn6(this, editTextBoldCursor, z, (byte) 12);
            if (g0) {
                j = 200;
            } else {
                j = 0;
            }
            gl.d3(mn6Var, j);
        }
    }

    public final void d1() {
        if (this.s0 != null && this.b != null) {
            int Y0 = Y0(false);
            bkb.A1(Y0, this.s0);
            ix4 ix4Var = this.D4;
            if (ix4Var.b != Y0) {
                ix4Var.a(Y0);
                ry1 ry1Var = this.s3;
                if (ry1Var != null) {
                    ry1Var.invalidate();
                }
                yz1 yz1Var = this.t3;
                if (yz1Var != null) {
                    yz1Var.invalidate();
                }
            }
            G1();
            this.b.invalidate();
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != kk7.S0 && i != kk7.Y4 && i != kk7.E1) {
            if (i == kk7.h5) {
                this.E1 = na7.q1(y6c.t0).F0();
                return;
            }
            return;
        }
        u02 u02Var = this.x3;
        if (u02Var != null) {
            u02Var.f();
        }
    }

    @Override
    public final void dismiss() {
        boolean z;
        b02 b02Var;
        zz1 zz1Var;
        if (!this.v2.r() && !this.J) {
            p02 p02Var = this.v2;
            r32 r32Var = this.q2;
            if (p02Var == r32Var && r32Var != null && !r32Var.L && r32Var.Q0 != null) {
                z = true;
            } else {
                z = false;
            }
            this.r2 = z;
            if (!z && (zz1Var = this.B2) != null) {
                gl.t1(zz1Var.getEditText());
            }
            if (!this.r2 && (b02Var = this.M2) != null) {
                gl.t1(b02Var.getEditText());
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
                    String M0 = k96.M0(2131751387, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    hdVar.U = k96.M0(2131751388, null);
                    alertDialog$Builder.j(k96.M0(2131751394, null), new fz1(this, (byte) 1));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    hdVar.setOnCancelListener(new ur0(this, (byte) 3));
                    hdVar.O = new n1(this, (byte) 14);
                    hdVar.show();
                    TextView textView = (TextView) hdVar.c(-1);
                    if (textView != null) {
                        zkb.X(textView, bkb.p7, this.J0);
                        return;
                    }
                    return;
                }
                return;
            }
            int i = 0;
            while (true) {
                p02[] p02VarArr = this.t2;
                if (i >= p02VarArr.length) {
                    break;
                }
                p02 p02Var2 = p02VarArr[i];
                if (p02Var2 != null && this.v2 != p02Var2) {
                    p02Var2.r();
                }
                i++;
            }
            gl.o3(this, bm2.o(bkb.v0(bkb.Z6, this.J0), 0), true, new fz1(this, (byte) 11));
            if (dVar != null) {
                gl.l3(this, dVar.isLightStatusBar());
            }
            this.f4 = false;
            super.dismiss();
            this.A4 = false;
        }
    }

    public final void e1() {
        int i = 0;
        while (true) {
            p02[] p02VarArr = this.t2;
            if (i >= p02VarArr.length) {
                break;
            }
            p02 p02Var = p02VarArr[i];
            if (p02Var != null) {
                p02Var.q();
            }
            i++;
        }
        int i2 = this.G3;
        kk7.f(i2).n(this, kk7.S0);
        kk7.f(i2).n(this, kk7.Y4);
        kk7.f(i2).n(this, kk7.h5);
        kk7.f(i2).n(this, kk7.E1);
        this.P1 = true;
        zz1 zz1Var = this.B2;
        if (zz1Var != null) {
            zz1Var.o();
        }
        b02 b02Var = this.M2;
        if (b02Var != null) {
            b02Var.o();
        }
    }

    public final void f1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String r;
        if (tL_attachMenuBot != null) {
            r = tL_attachMenuBot.short_name;
        } else {
            r = l7c.r(user);
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = hq6.d0(this.G3).b.bots;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i);
            i++;
            if (tL_attachMenuBot2.bot_id == user.id) {
                break;
            }
        }
        String a0 = k96.a0("BotRemoveFromMenu", null, 2131752990, r);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = k96.M0(2131752989, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        if (tL_attachMenuBot == null) {
            a0 = k96.a0("BotRemoveInlineFromMenu", null, 2131752988, r);
        }
        hdVar.U = gl.S2(a0);
        alertDialog$Builder.j(k96.M0(2131747638, "OK"), new ie(this, tL_attachMenuBot, user, (byte) 20));
        ug8.y("Cancel", 2131752577, alertDialog$Builder, null);
    }

    @Override
    public final boolean g0() {
        TL_wallet.walletTransaction wallettransaction;
        final r32 r32Var = this.q2;
        if (r32Var != null && this.v2 == r32Var) {
            final vq0 vq0Var = new vq0(this, (byte) 2);
            int i = r32Var.n;
            ppc ppcVar = r32Var.S;
            x02 x02Var = r32Var.b;
            AnimatorSet animatorSet = null;
            if (!r32Var.L && (wallettransaction = r32Var.Q0) != null && r32Var.R0 == null && r32Var.S0 == null) {
                if (r32Var.T0) {
                    hmc hmcVar = new hmc();
                    hmcVar.setCurrentAccount(i);
                    d dVar = x02Var.Z1;
                    if (dVar != null && dVar.presentFragment(hmcVar, false, true)) {
                        cqc cqcVar = new cqc(x02Var.c, x02Var.b, ppcVar.getDiamondView(), hmcVar, r32Var.Q0, new Runnable() {
                            @Override
                            public final void run() {
                                byte b = r3;
                                vq0 vq0Var2 = vq0Var;
                                r32 r32Var2 = r32Var;
                                switch (b) {
                                    case 0:
                                        if (!r32Var2.L) {
                                            vq0Var2.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!r32Var2.L) {
                                            vq0Var2.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, x02Var);
                        r32Var.S0 = cqcVar;
                        animatorSet = cqcVar.m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    lnc diamondView = ppcVar.getDiamondView();
                    if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        d dVar2 = x02Var.Z1;
                        if (dVar2 instanceof mu1) {
                            mu1 mu1Var = (mu1) dVar2;
                            if (mu1Var.getCurrentAccount() == i && mu1Var.a() == r32Var.r.id && mu1Var.g4 == 0 && mu1Var.getFragmentView() != null && mu1Var.getFragmentView().isAttachedToWindow()) {
                                anc ancVar = new anc(x02Var.c, x02Var.b, ppcVar.getDiamondView(), mu1Var, r32Var.Q0, new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r3;
                                        vq0 vq0Var2 = vq0Var;
                                        r32 r32Var2 = r32Var;
                                        switch (b) {
                                            case 0:
                                                if (!r32Var2.L) {
                                                    vq0Var2.run();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (!r32Var2.L) {
                                                    vq0Var2.run();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, x02Var);
                                r32Var.R0 = ancVar;
                                animatorSet = ancVar.m;
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
            p02[] p02VarArr = this.t2;
            if (i < p02VarArr.length) {
                p02 p02Var = p02VarArr[i];
                if (p02Var != null) {
                    p02Var.B();
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
        azc azcVar = chatAttachAlertPhotoLayout.m0;
        yc ycVar = chatAttachAlertPhotoLayout.k0;
        s42 s42Var = chatAttachAlertPhotoLayout.r;
        TextView textView = chatAttachAlertPhotoLayout.q0;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 < i6) {
            z = true;
        } else {
            z = false;
        }
        int i7 = gl.n;
        if (view == ycVar) {
            if (z) {
                if (s42Var.getVisibility() == 0) {
                    ycVar.layout(0, ls6.x(222.0f, i4, i7), i5, ls6.x(96.0f, i4, i7));
                    return true;
                }
                ycVar.layout(0, ls6.x(126.0f, i4, i7), i5, i4 - i7);
                return true;
            } else if (s42Var.getVisibility() == 0) {
                ycVar.layout(ls6.x(222.0f, i3, i7), 0, i3 - gl.L(96.0f), i6 - i7);
                return true;
            } else {
                ycVar.layout(ls6.x(126.0f, i3, i7), 0, i3, i6 - i7);
                return true;
            }
        } else if (view == azcVar) {
            if (z) {
                if (s42Var.getVisibility() == 0) {
                    azcVar.layout(0, ls6.x(310.0f, i4, i7), i5, ls6.x(260.0f, i4, i7));
                    return true;
                }
                azcVar.layout(0, ls6.x(176.0f, i4, i7), i5, ls6.x(126.0f, i4, i7));
                return true;
            } else if (s42Var.getVisibility() == 0) {
                azcVar.layout(ls6.x(310.0f, i3, i7), 0, i3 - gl.L(260.0f), i6 - i7);
                return true;
            } else {
                azcVar.layout(ls6.x(176.0f, i3, i7), 0, i3 - gl.L(126.0f), i6 - i7);
                return true;
            }
        } else if (view == textView) {
            if (z) {
                L = (i5 - textView.getMeasuredWidth()) / 2;
                int L2 = i4 - gl.L(167.0f);
                textView.setRotation(0.0f);
                if (s42Var.getVisibility() == 0) {
                    L2 -= gl.L(96.0f);
                }
                measuredWidth = L2 - i7;
            } else {
                L = i3 - gl.L(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i6 / 2);
                textView.setRotation(-90.0f);
                if (s42Var.getVisibility() == 0) {
                    L -= gl.L(96.0f);
                }
            }
            textView.layout(L, measuredWidth, textView.getMeasuredWidth() + L, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != s42Var) {
            return false;
        } else {
            if (z) {
                int x = ls6.x(88.0f, i6, i7);
                view.layout(0, x, view.getMeasuredWidth(), view.getMeasuredHeight() + x);
                return true;
            }
            int L3 = (i + i5) - gl.L(88.0f);
            view.layout(L3, 0, view.getMeasuredWidth() + L3, view.getMeasuredHeight());
            return true;
        }
    }

    public final void h1() {
        int i = 0;
        this.c4 = false;
        while (true) {
            p02[] p02VarArr = this.t2;
            if (i >= p02VarArr.length) {
                break;
            }
            p02 p02Var = p02VarArr[i];
            if (p02Var != null) {
                p02Var.D();
            }
            i++;
        }
        if (isShowing()) {
            this.W3.g0();
        }
        u02 u02Var = this.x3;
        if (u02Var != null) {
            u02Var.f();
        }
    }

    @Override
    public final boolean i0(View view, int i, int i2) {
        boolean z;
        WindowInsets windowInsets;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        e52 e52Var = chatAttachAlertPhotoLayout.w;
        x02 x02Var = chatAttachAlertPhotoLayout.b;
        s42 s42Var = chatAttachAlertPhotoLayout.r;
        zr zrVar = chatAttachAlertPhotoLayout.s;
        int i3 = 0;
        if (i < i2) {
            z = true;
        } else {
            z = false;
        }
        if (view == chatAttachAlertPhotoLayout.Q) {
            if (chatAttachAlertPhotoLayout.c0 && !chatAttachAlertPhotoLayout.e0) {
                int R = x02Var.R() + i;
                if (x02Var.h != null) {
                    i3 = (int) (windowInsets.getSystemWindowInsetRight() * 1.0f);
                }
                chatAttachAlertPhotoLayout.Q.measure(View.MeasureSpec.makeMeasureSpec(i3 + R, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
                return true;
            }
        } else {
            yc ycVar = chatAttachAlertPhotoLayout.k0;
            if (view == ycVar) {
                if (z) {
                    ycVar.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(126.0f), 1073741824));
                    return true;
                }
                ycVar.measure(View.MeasureSpec.makeMeasureSpec(gl.L(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
                return true;
            }
            azc azcVar = chatAttachAlertPhotoLayout.m0;
            if (view == azcVar) {
                if (z) {
                    azcVar.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), 1073741824));
                    return true;
                }
                azcVar.measure(View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
                return true;
            } else if (view == s42Var) {
                chatAttachAlertPhotoLayout.K0 = true;
                if (z) {
                    s42Var.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(80.0f), 1073741824));
                    if (zrVar.o) {
                        s42Var.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                        zrVar.i1(0);
                        e52Var.f();
                    }
                } else {
                    s42Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
                    if (!zrVar.o) {
                        s42Var.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
                        zrVar.i1(1);
                        e52Var.f();
                    }
                }
                chatAttachAlertPhotoLayout.K0 = false;
                return true;
            }
        }
        return false;
    }

    public final void i1() {
        k27 k27Var = this.E3;
        d dVar = this.Z1;
        int i = this.G3;
        if (k27Var != null && k27Var.o5() && !hc2.z(i, 24, k27.B0(this.E3.k)) && (dVar instanceof mu1)) {
            mu1 mu1Var = (mu1) dVar;
            u47 u47Var = mu1Var.y5;
            if (u47Var == null) {
                u47Var = u47.b(this.E3.k.suggested_post);
            }
            if (!gta.Q(i, u47Var.a)) {
                mu1Var.kc(u47Var);
                return;
            }
        }
        if (this.E1 - this.F1 < 0) {
            gl.z3(this.t1);
            gl.z3(this.u1);
            try {
                this.F2.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!na7.q1(i).F3() && na7.q1(i).k4.h1.f() > this.F1) {
                y1(dVar);
                return;
            }
            return;
        }
        if (this.E3 == null && (dVar instanceof mu1)) {
            mu1 mu1Var2 = (mu1) dVar;
            if (mu1Var2.P7()) {
                ij.J(getContext(), mu1Var2.a(), new fz1(this, (byte) 14), this.J0);
                return;
            }
        }
        p02 p02Var = this.v2;
        if (p02Var != this.d2 && p02Var != this.k2) {
            if (!p02Var.M(true, 0, 0, this.K2, a1())) {
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
        i02 i02Var = this.l4;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, i02Var, 0.0f, 400.0f));
        this.n4.setDuration(400L);
        this.n4.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        i02Var.getClass();
        i02Var.a(this, valueOf);
        this.n4.start();
        ValueAnimator valueAnimator = this.C0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D0, 1.0f);
        this.C0 = ofFloat;
        ofFloat.addUpdateListener(new gz1(this, (byte) 2));
        yla ylaVar = this.m4;
        if (ylaVar != null) {
            ylaVar.d();
        }
        yla ylaVar2 = new yla((Object) this.b, (ri4) yla.p, 0.0f);
        this.m4 = ylaVar2;
        k27 k27Var = this.E3;
        zla zlaVar = ylaVar2.m;
        if (k27Var != null) {
            zlaVar.a(0.75f);
            this.m4.m.b(350.0f);
        } else {
            zlaVar.a(0.75f);
            this.m4.m.b(350.0f);
        }
        this.m4.h();
        if (this.K) {
            this.c.setLayerType(2, null);
        }
        this.B0 = (byte) 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.A0 = animatorSet2;
        pn pnVar = rn.d;
        if (this.p0) {
            i = this.q0;
        } else {
            i = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.Z, pnVar, i));
        this.A0.setDuration(400L);
        this.A0.setStartDelay(20L);
        this.A0.setInterpolator(this.l0);
        on onVar = new on(null);
        jn1 jn1Var = new jn1(this, onVar, this.z0, (byte) 12);
        this.m4.a(new o11(this, jn1Var, (byte) 1));
        this.A0.addListener(new u5(this, jn1Var, (byte) 14));
        onVar.d();
        kk7.e().k(kk7.i1, 512);
        this.A0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        u1(0.0f);
        ofFloat2.addUpdateListener(new gz1(this, (byte) 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(s33.f);
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
        } else if (i == 6 && gl.H1(dVar)) {
            if (this.i2 == null) {
                c42 c42Var = new c42(this, getContext(), this.J0, (this.B1 || this.O3) ? false : false);
                this.i2 = c42Var;
                this.t2[5] = c42Var;
                b42 b42Var = this.t4;
                if (b42Var != null) {
                    c42Var.setDelegate(b42Var);
                } else if (dVar instanceof mu1) {
                    c42Var.setDelegate(new fz1(this, (byte) 18));
                }
            }
            A1(this.i2);
        }
    }

    public final void k1(boolean z) {
        if (!this.K3 && z) {
            f72 f72Var = new f72(3, this, this.J0, getContext());
            this.N1 = f72Var;
            A1(f72Var);
        }
        int i = 1;
        if (this.f2 == null) {
            h12 h12Var = new h12(this, this.J0, getContext());
            this.f2 = h12Var;
            this.t2[3] = h12Var;
            h12Var.setupBlurredSearchField(this.E4);
            this.f2.setDelegate(new fz1(this, (byte) 15));
            if (this.B1) {
                this.f2.setMaxSelectedFiles(1);
            }
        }
        d dVar = this.Z1;
        if (dVar instanceof mu1) {
            TLRPC.Chat chat = ((mu1) dVar).e;
            h12 h12Var2 = this.f2;
            if ((chat == null || hc2.N(chat) || !chat.slowmode_enabled) && this.E3 == null) {
                i = -1;
            }
            h12Var2.setMaxSelectedFiles(i);
        }
        if (z) {
            A1(this.f2);
        }
    }

    @Override
    public final void l0() {
        if (this.v2.t()) {
            dismiss();
        }
    }

    public final void l1() {
        boolean z;
        if (!this.N3) {
            f72 f72Var = new f72(5, this, this.J0, getContext());
            this.N1 = f72Var;
            A1(f72Var);
        }
        if (this.e2 == null) {
            k22 k22Var = new k22(this, this.J0, getContext());
            this.e2 = k22Var;
            this.t2[2] = k22Var;
            k22Var.setupBlurredSearchField(this.E4);
            this.e2.setDelegate(new g02(this));
        }
        d dVar = this.Z1;
        if (dVar instanceof mu1) {
            TLRPC.Chat chat = ((mu1) dVar).e;
            k22 k22Var2 = this.e2;
            if (chat != null && !hc2.N(chat) && chat.slowmode_enabled) {
                z = false;
            } else {
                z = true;
            }
            k22Var2.setMultipleSelectionAllowed(z);
        }
        A1(this.e2);
    }

    public final void m1(boolean z) {
        int i;
        if (!this.H3 && z) {
            f72 f72Var = new f72(4, this, this.J0, getContext());
            this.N1 = f72Var;
            A1(f72Var);
        }
        boolean z2 = false;
        if (this.j2 == null) {
            if (this.H1) {
                i = 2;
            } else {
                i = 0;
            }
            d32 d32Var = new d32(i, this, this.J0, getContext());
            this.j2 = d32Var;
            this.t2[4] = d32Var;
            d32Var.setDelegate(new h02(this));
        }
        int i2 = 1;
        if (this.B1) {
            this.j2.setMaxSelectedFiles(1);
        } else {
            d dVar = this.Z1;
            if (dVar instanceof mu1) {
                TLRPC.Chat chat = ((mu1) dVar).e;
                d32 d32Var2 = this.j2;
                if ((chat == null || hc2.N(chat) || !chat.slowmode_enabled) && this.E3 == null) {
                    i2 = -1;
                }
                d32Var2.setMaxSelectedFiles(i2);
            } else {
                this.j2.setMaxSelectedFiles(this.P3);
                d32 d32Var3 = this.j2;
                if (!this.H1 && !this.Q1) {
                    z2 = true;
                }
                d32Var3.setCanSelectOnlyImageFiles(z2);
            }
        }
        d32 d32Var4 = this.j2;
        d32Var4.e0 = this.H1;
        if (z) {
            A1(d32Var4);
        }
    }

    public final void o1() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        x10 x10Var = this.U2;
        int i = 1;
        if (x10Var.o0) {
            x10Var.n(true);
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
            p02[] p02VarArr = this.t2;
            if (i >= p02VarArr.length) {
                break;
            }
            p02 p02Var = p02VarArr[i];
            if (p02Var != null) {
                p02Var.q();
                this.b.removeView(p02VarArr[i]);
                p02VarArr[i] = null;
            }
            i++;
        }
        D1(false, false);
        super.I();
        if (this.r2) {
            this.r2 = false;
            this.s2 = 0.0f;
            d dVar = this.Z1;
            if (dVar != null && dVar.getFragmentView() != null) {
                View fragmentView = dVar.getFragmentView();
                WeakHashMap weakHashMap = jdc.a;
                zcc.c(fragmentView);
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
        x10 x10Var = this.U2;
        if (x10Var.o0) {
            x10Var.n(true);
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
            gl.l3(this, dVar.isLightStatusBar());
        }
    }

    @Override
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.v2.H(i)) {
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
    public final void p(int i, float f, float f2, y74 y74Var) {
        int i2;
        if (i == 0) {
            N0();
            J0();
            return;
        }
        int i3 = 1;
        if (i == 2) {
            J0();
            k62 k62Var = this.g2;
            if (k62Var != null) {
                if (this.w2 != k62Var) {
                    if (this.v2 == k62Var) {
                        i2 = 0;
                    }
                } else {
                    i2 = 1;
                }
                K1(i2);
            }
            k62 k62Var2 = this.h2;
            if (k62Var2 != null) {
                if (this.w2 != k62Var2) {
                    if (this.v2 == k62Var2) {
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
            e02 e02Var = this.F2;
            if (e02Var != null) {
                e02Var.setEphemeralFactor(f);
                e02Var.setSameWidthFactor(f);
            }
        }
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            H0();
            ql0 ql0Var = this.V1;
            if (ql0Var != null) {
                ql0Var.updateColors();
            }
            int v0 = bkb.v0(bkb.i5, this.J0);
            r7 r7Var = this.h3;
            if (r7Var != null && v0 != this.o4) {
                this.o4 = v0;
                r7Var.setIconColor(v0);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final boolean p1(final boolean z, final int i, final int i2, final long j, final boolean z2) {
        if (this.F3) {
            return false;
        }
        d dVar = this.Z1;
        if (dVar instanceof mu1) {
            mu1 mu1Var = (mu1) dVar;
            TLRPC.Chat chat = mu1Var.e;
            if (mu1Var.h() != null || ((hc2.T(chat) && chat.megagroup) || !hc2.T(chat))) {
                SharedPreferences.Editor edit = na7.q1(this.G3).W3.edit();
                edit.putBoolean("silent_" + mu1Var.a(), !z).commit();
            }
        }
        int i3 = 1;
        if (G0(U0().getText())) {
            return true;
        }
        E0();
        if (this.q1.f) {
            this.F3 = true;
            this.W3.B1(7, true, z, i, i2, j, z2, false, 0L);
            return true;
        }
        long V0 = V0();
        p02 p02Var = this.v2;
        if (p02Var != null) {
            i3 = p02Var.getSelectedItemsCount();
        }
        return ij.Y(this.G3, V0, R0() + i3, new p8c() {
            @Override
            public final void a(Object obj) {
                x02 x02Var = x02.this;
                x02Var.F3 = true;
                x02Var.W3.B1(7, true, z, i, i2, j, z2, false, ((Long) obj).longValue());
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
        rt3 U0 = U0();
        this.W1 = z;
        rt3 U02 = U0();
        int i2 = 0;
        if (this.A2.getTag() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        p02 p02Var = this.v2;
        if (p02Var != this.d2 && p02Var != this.k2) {
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
        st stVar = this.L2;
        float f3 = 1.0f;
        u31 u31Var = this.z2;
        float f4 = 0.0f;
        if (z2) {
            if (z3) {
                i3 = 0;
            }
            stVar.setVisibility(i3);
            ViewPropertyAnimator animate = stVar.animate();
            if (z5 && z3) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f2).setDuration(320L);
            s33 s33Var = s33.h;
            duration.setInterpolator(s33Var).setUpdateListener(new gz1(this, (byte) 0)).withEndAction(new Runnable(this) {
                public final x02 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r4;
                    boolean z6 = z3;
                    boolean z7 = z5;
                    x02 x02Var = this.b;
                    switch (b) {
                        case 0:
                            if (!z7 || !z6) {
                                x02Var.L2.setVisibility(8);
                            }
                            x02Var.L1();
                            return;
                        default:
                            if (z7 || !z6) {
                                x02Var.z2.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            u31Var.setVisibility(0);
            ViewPropertyAnimator animate2 = u31Var.animate();
            if (!z5 && z3) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = u31Var.getMeasuredHeight();
            }
            ViewPropertyAnimator translationY = animate2.translationY(measuredHeight);
            if (z5 || !z3) {
                f3 = 0.0f;
            }
            translationY.alpha(f3).setDuration(320L).setInterpolator(s33Var).setUpdateListener(new gz1(this, (byte) 1)).withEndAction(new Runnable(this) {
                public final x02 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r4;
                    boolean z6 = z3;
                    boolean z7 = z5;
                    x02 x02Var = this.b;
                    switch (b) {
                        case 0:
                            if (!z7 || !z6) {
                                x02Var.L2.setVisibility(8);
                            }
                            x02Var.L1();
                            return;
                        default:
                            if (z7 || !z6) {
                                x02Var.z2.setVisibility(8);
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
            stVar.setVisibility(i);
            if (z5 && z3) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            stVar.setAlpha(f);
            L1();
            if (z5 || !z3) {
                f3 = 0.0f;
            }
            u31Var.setAlpha(f3);
            if (z5 || !z3) {
                f4 = u31Var.getMeasuredHeight();
            }
            u31Var.setTranslationY(f4);
            if (z5 || !z3) {
                i2 = 8;
            }
            u31Var.setVisibility(i2);
        }
        if (U0 != U02) {
            U0.k(true);
            U02.setText(gm.cloneSpans(U0.getText()));
            U02.getEditText().setAllowTextEntitiesIntersection(U0.getEditText().getAllowTextEntitiesIntersection());
            if (U0.getEditText().isFocused()) {
                U02.getEditText().requestFocus();
                U02.getEditText().setSelection(U0.getEditText().getSelectionStart(), U0.getEditText().getSelectionEnd());
            }
        }
        gl.c3(new vq0(this, (byte) 1));
    }

    @Override
    public final void r0(boolean z) {
        this.r0 = true;
    }

    public final void r1(int i, k27 k27Var) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (k27Var != null && (chatAttachAlertPhotoLayout = this.d2) != null) {
            chatAttachAlertPhotoLayout.a0();
        }
        if (this.E3 == k27Var && this.D3 == i) {
            return;
        }
        this.E3 = k27Var;
        if (k27Var != null && k27Var.z2()) {
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
        r32 r32Var = this.q2;
        if (r32Var != null) {
            r32Var.setSendTransitionProgress(f);
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
        if (dVar instanceof mu1) {
            this.i0 = ((mu1) dVar).Q7();
        }
        G1();
        this.p3 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int o = bm2.o(bkb.v0(bkb.Z6, this.J0), 0);
            this.H0 = o;
            gl.o3(this, o, false, null);
            if (gl.B(this.H0) > 0.721d) {
                z = true;
            } else {
                z = false;
            }
            gl.i3(this, z);
        }
        if (this.j4) {
            this.j4 = false;
            x10 x10Var = this.U2;
            x10Var.updateColors();
            x10Var.invalidate();
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
        int o = bm2.o(bkb.v0(bkb.Z6, this.J0), Math.min(255, Math.max(0, (int) (f * 255.0f))));
        this.H0 = o;
        gl.o3(this, o, false, null);
        if (gl.B(this.H0) > 0.721d) {
            z = true;
        }
        gl.i3(this, z);
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
            x02 x02Var = chatAttachAlertPhotoLayout.b;
            if (x02Var.N2 == 0 || x02Var.z1) {
                z = false;
            }
            chatAttachAlertPhotoLayout.h1 = z;
        }
    }

    public final void w1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x02.w1(boolean):void");
    }

    @Override
    public final void x() {
        if (this.Z1 instanceof mu1) {
            String[] strArr = MediaController.W1;
        } else {
            String[] strArr2 = MediaController.W1;
        }
        this.v2.y();
        gl.g2(k96.M0(2131754921, "AccDescrAttachButton"));
        this.p3 = true;
        if (!this.J3 && !this.I3) {
            F0();
        }
    }

    public final void x1(long r26, java.lang.String r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x02.x1(long, java.lang.String, boolean, boolean):void");
    }

    @Override
    public final boolean y() {
        return true;
    }

    public final void y1(d dVar) {
        if ((dVar instanceof mu1) && hc2.V(((mu1) dVar).e)) {
            new u21(this.o3, this.J0).f(na7.q1(this.G3).k4.h1.f(), new kx1(this, dVar, (byte) 5)).j();
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
        p02 p02Var;
        float f10;
        float L;
        long K1;
        float f11;
        float f12;
        x10 x10Var;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float L2;
        this.m1.a(z, true);
        wz1 wz1Var = this.A2;
        if (wz1Var.getTag() != null) {
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
        wz1Var.setTag(num);
        zz1 zz1Var = this.B2;
        if (zz1Var.getEditText().isFocused()) {
            gl.t1(zz1Var.getEditText());
        }
        zz1Var.k(true);
        this.M2.k(true);
        wz1 wz1Var2 = this.u3;
        wz1 wz1Var3 = this.E2;
        if (z) {
            if (!this.H1) {
                wz1Var.setVisibility(0);
            }
            wz1Var3.setVisibility(0);
        } else if (this.P2) {
            wz1Var2.setVisibility(0);
        }
        p02 p02Var2 = this.v2;
        if ((p02Var2 == this.d2 || p02Var2 == this.k2) && this.W1) {
            z4 = true;
        } else {
            z4 = false;
        }
        x10 x10Var2 = this.U2;
        st stVar = this.L2;
        u31 u31Var = this.z2;
        e02 e02Var = this.F2;
        float f20 = 1.0f;
        if (z2) {
            this.J2 = new AnimatorSet();
            if (z4) {
                stVar.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(wz1Var, property, f11));
            if (z && !z4) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(u31Var, property, f12));
            if (z && !z4) {
                u31Var.setVisibility(0);
                x10Var = x10Var2;
                arrayList.add(ObjectAnimator.ofFloat(u31Var, View.TRANSLATION_Y, 0.0f));
            } else {
                x10Var = x10Var2;
            }
            if (z && z4) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(stVar, property, f13));
            Property property2 = View.SCALE_X;
            if (z) {
                f14 = 1.0f;
            } else {
                f14 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(wz1Var3, property2, f14));
            Property property3 = View.SCALE_Y;
            if (z) {
                f15 = 1.0f;
            } else {
                f15 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(wz1Var3, property3, f15));
            if (z) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(wz1Var3, property, f16));
            if (z) {
                f17 = 1.0f;
            } else {
                f17 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(e02Var, property2, f17));
            if (z) {
                f18 = 1.0f;
            } else {
                f18 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(e02Var, property3, f18));
            if (x10Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (z) {
                    L2 = 0.0f;
                } else {
                    L2 = gl.L(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(wz1Var, property4, L2));
            } else if (this.P2) {
                Property property5 = View.TRANSLATION_Y;
                if (z) {
                    f19 = gl.L(36.0f);
                } else {
                    f19 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(wz1Var2, property5, f19));
                if (z) {
                    f20 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(wz1Var2, property, f20));
            }
            if (z4) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new gz1(this, (byte) 5));
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
            wz1Var.setAlpha(f);
            if (z && z4) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            u31Var.setAlpha(f2);
            if (z && !z4) {
                i = 0;
                u31Var.setVisibility(0);
                f3 = 0.0f;
                u31Var.setTranslationY(0.0f);
            } else {
                f3 = 0.0f;
                i = 0;
            }
            if (z) {
                f4 = 1.0f;
            } else {
                f4 = 0.2f;
            }
            wz1Var3.setScaleX(f4);
            if (z) {
                f5 = 1.0f;
            } else {
                f5 = 0.2f;
            }
            wz1Var3.setScaleY(f5);
            if (z) {
                f6 = 1.0f;
            } else {
                f6 = f3;
            }
            wz1Var3.setAlpha(f6);
            if (z && z4) {
                i2 = i;
            } else {
                i2 = 8;
            }
            stVar.setVisibility(i2);
            if (z && z4) {
                f7 = 1.0f;
            } else {
                f7 = f3;
            }
            stVar.setAlpha(f7);
            if (z) {
                f8 = 1.0f;
            } else {
                f8 = 0.2f;
            }
            e02Var.setScaleX(f8);
            if (z) {
                f9 = 1.0f;
            } else {
                f9 = 0.2f;
            }
            e02Var.setScaleY(f9);
            if (x10Var2.getTag() != null) {
                if (z) {
                    L = f3;
                } else {
                    L = gl.L(48.0f);
                }
                wz1Var.setTranslationY(L);
            } else if (this.P2 && ((p02Var = this.v2) == null || p02Var.N())) {
                if (z) {
                    f10 = gl.L(84.0f);
                } else {
                    f10 = f3;
                }
                wz1Var2.setTranslationY(f10);
            }
            if (!z) {
                wz1Var.setVisibility(4);
                wz1Var3.setVisibility(4);
            }
            if (z4) {
                L1();
            }
        }
        if (z) {
            i = Math.max(1, this.v2.getSelectedItemsCount());
        }
        e02Var.f(i, z2);
        if (this.E3 != null) {
            K1 = 0;
        } else {
            K1 = na7.q1(this.G3).K1(V0());
        }
        e02Var.i(R0() + this.v2.getSelectedItemsCount(), K1, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zz1Var.getLayoutParams();
        int max = Math.max(gl.L(48.0f), e02Var.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            zz1Var.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    @Override
    public final void F(float f, int i) {
    }

    public x02(Activity activity, d dVar, boolean z, boolean z2) {
        this(activity, dVar, z, z2, true, null);
    }
}
