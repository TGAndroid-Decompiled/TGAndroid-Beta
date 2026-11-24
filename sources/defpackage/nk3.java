package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
public class nk3 extends d implements jm7, el4, g94, aj6 {
    public static boolean E4;
    public static final boolean[] F4 = new boolean[4];
    public static final rg3 G4 = new rg3((byte) 1);
    public static float H4;
    public ak3 A0;
    public va2 A1;
    public boolean A2;
    public float A3;
    public final RectF A4;
    public boolean B0;
    public FrameLayout B1;
    public boolean B2;
    public boolean B3;
    public final RectF B4;
    public int C0;
    public FrameLayout C1;
    public boolean C2;
    public boolean C3;
    public int C4;
    public sj3 D0;
    public ti3 D1;
    public boolean D2;
    public Long D3;
    public int D4;
    public boolean E;
    public fha E0;
    public vi3 E1;
    public hk3 E2;
    public Drawable E3;
    public boolean F;
    public aj3 F0;
    public r7 F1;
    public ArrayList F2;
    public tm F3;
    public boolean G;
    public ok3 G0;
    public final TextPaint G1;
    public String G2;
    public yn G3;
    public TLRPC.RequestPeerType H;
    public boolean H0;
    public ri3 H1;
    public CharSequence H2;
    public dj3 H3;
    public long I;
    public float I0;
    public FrameLayout I1;
    public bda I2;
    public final si3 I3;
    public ValueAnimator J;
    public float J0;
    public ri3 J1;
    public rd3 J2;
    public final si3 J3;
    public ValueAnimator K;
    public float K0;
    public FrameLayout K1;
    public final ArrayList K2;
    public fk3 K3;
    public boolean L;
    public sb L0;
    public qk3 L1;
    public boolean L2;
    public e7a L3;
    public boolean M;
    public bu5 M0;
    public pk3 M1;
    public int M2;
    public Drawable M3;
    public boolean N;
    public fj3 N0;
    public l9 N1;
    public int N2;
    public int N3;
    public float O;
    public boolean O0;
    public nl3 O1;
    public boolean O2;
    public boolean O3;
    public boolean P;
    public boolean P0;
    public x6c P1;
    public int P2;
    public final e7a P3;
    public int Q;
    public long Q0;
    public Long Q1;
    public int Q2;
    public final kh3 Q3;
    public boolean R;
    public long R0;
    public Long R1;
    public int R2;
    public boolean R3;
    public boolean S;
    public long S0;
    public cp2 S1;
    public int S2;
    public boolean S3;
    public u31 T;
    public int T0;
    public ArrayList T1;
    public int T2;
    public final kh3 T3;
    public float U;
    public int U0;
    public boolean U1;
    public int U2;
    public int U3;
    public boolean V;
    public int V0;
    public he V1;
    public int V2;
    public AnimatorSet V3;
    public boolean W;
    public boolean W0;
    public boolean W1;
    public int W2;
    public boolean W3;
    public boolean X;
    public nt7 X0;
    public boolean X1;
    public boolean X2;
    public w93 X3;
    public zj3 Y;
    public hg3 Y0;
    public long Y1;
    public int Y2;
    public String Y3;
    public av9 Z;
    public hg3 Z0;
    public TLObject Z1;
    public nk3 Z2;
    public ArrayList Z3;
    public final byte a;
    public nu9 a0;
    public boolean a1;
    public int a2;
    public long a3;
    public boolean a4;
    public final fn0 b;
    public vgc b0;
    public boolean b1;
    public int b2;
    public TLRPC.Chat b3;
    public CharSequence b4;
    public final fn0 c;
    public uh4 c0;
    public final ArrayList c1;
    public boolean c2;
    public TLRPC.ChatFull c3;
    public boolean c4;
    public final fn0 d;
    public float d0;
    public boolean d1;
    public boolean d2;
    public bf0 d3;
    public float d4;
    public final fn0 e;
    public ValueAnimator e0;
    public boolean e1;
    public boolean e2;
    public pc0 e3;
    public boolean e4;
    public final fn0 f;
    public mk3[] f0;
    public boolean f1;
    public int f2;
    public long f3;
    public boolean f4;
    public r7 g0;
    public ee0 g1;
    public boolean g2;
    public boolean g3;
    public ValueAnimator g4;
    public final fn0 h;
    public r7 h0;
    public final Paint h1;
    public String h2;
    public boolean h3;
    public wn5 h4;
    public hr3 i0;
    public ImageView i1;
    public String i2;
    public AnimatorSet i3;
    public TLRPC.FileLocation i4;
    public boolean j0;
    public NumberTextView j1;
    public String j2;
    public boolean j3;
    public TLRPC.FileLocation j4;
    public r7 k0;
    public final ArrayList k1;
    public boolean k2;
    public boolean k3;
    public u31 k4;
    public r7 l0;
    public r7 l1;
    public boolean l2;
    public float l3;
    public int l4;
    public r7 m0;
    public r7 m1;
    public boolean m2;
    public boolean m3;
    public int m4;
    public final fn0 n;
    public r7 n0;
    public r7 n1;
    public boolean n2;
    public int n3;
    public int n4;
    public uv8 o0;
    public r7 o1;
    public boolean o2;
    public boolean o3;
    public int o4;
    public a8 p0;
    public a8 p1;
    public String p2;
    public boolean p3;
    public int p4;
    public hg5 q0;
    public a8 q1;
    public String q2;
    public u31 q3;
    public final mr3 q4;
    public final fn0 r;
    public hg5 r0;
    public a8 r1;
    public final bf7 r2;
    public final po r3;
    public final nz4 r4;
    public final fn0 s;
    public boolean s0;
    public a8 s1;
    public boolean s2;
    public boolean s3;
    public final nz4 s4;
    public boolean t0;
    public a8 t1;
    public boolean t2;
    public boolean t3;
    public final kz4 t4;
    public wp4 u0;
    public a8 u1;
    public boolean u2;
    public boolean u3;
    public final km0 u4;
    public wp4 v0;
    public a8 v1;
    public boolean v2;
    public boolean v3;
    public final km0 v4;
    public final g0d w;
    public b61 w0;
    public float w1;
    public boolean w2;
    public float w3;
    public final km0 w4;
    public boolean x;
    public e02 x0;
    public float x1;
    public boolean x2;
    public ValueAnimator x3;
    public final km0 x4;
    public int y;
    public int y0;
    public AnimatorSet y1;
    public boolean y2;
    public float y3;
    public ai3 y4;
    public final UndoView[] z0;
    public float z1;
    public boolean z2;
    public float z3;
    public final ArrayList z4;

    public nk3(Bundle bundle) {
        super(bundle);
        byte b;
        km0 km0Var;
        km0 km0Var2;
        km0 km0Var3;
        int L;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            b = 48;
        } else {
            b = 0;
        }
        this.a = b;
        d53 d53Var = d53.h;
        this.b = new fn0(1, this, d53Var, 350L, false);
        this.c = new fn0(2, this, d53Var, 350L, false);
        this.d = new fn0(3, this, d53Var, 350L, false);
        this.e = new fn0(4, this, d53Var, 350L, false);
        this.f = new fn0(5, this, d53Var, 350L, false);
        this.h = new fn0(6, this, d53Var, 350L, false);
        this.n = new fn0(7, this, d53Var, 350L, false);
        this.r = new fn0(8, this, d53Var, 350L, false);
        this.s = new fn0(9, this, d53Var, 350L, false);
        this.w = new g0d(new kh3(this, (byte) 27));
        this.y = -1;
        this.G = true;
        this.L = false;
        this.M = false;
        this.N = false;
        this.R = true;
        this.d0 = 1.0f;
        this.z0 = new UndoView[2];
        this.c1 = new ArrayList();
        this.h1 = new Paint();
        this.k1 = new ArrayList();
        new Paint(1);
        this.G1 = new TextPaint(1);
        this.W1 = true;
        this.e2 = true;
        this.k2 = true;
        this.r2 = new Object();
        this.K2 = new ArrayList();
        this.L2 = true;
        this.r3 = new po(null);
        this.I3 = new si3(this, (byte) 0);
        this.J3 = new si3(this, (byte) 1);
        this.N3 = -4;
        this.O3 = true;
        int i2 = this.currentAccount;
        HashMap hashMap = ia4.c;
        if (!hashMap.containsKey(Integer.valueOf(i2))) {
            hashMap.put(Integer.valueOf(i2), new HashSet());
        }
        h64 h64Var = new h64((byte) 11);
        pg pgVar = new pg(i2, (byte) 5);
        ?? obj = new Object();
        obj.d = new LinkedHashMap();
        obj.a = h64Var;
        obj.b = (HashSet) hashMap.get(Integer.valueOf(i2));
        obj.c = pgVar;
        this.P3 = obj;
        this.Q3 = new kh3(this, (byte) 28);
        this.R3 = true;
        this.T3 = new kh3(this, (byte) 29);
        this.U3 = -1;
        this.d4 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.z4 = arrayList;
        RectF rectF = new RectF();
        this.A4 = rectF;
        RectF rectF2 = new RectF();
        this.B4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        kz4 d = this.glassEngine.d(new nh3(this, (byte) 12));
        this.t4 = d;
        if (i >= 31) {
            mr3 mr3Var = new mr3(false);
            this.q4 = mr3Var;
            nz4 nz4Var = new nz4(d);
            this.s4 = nz4Var;
            nz4Var.f = d;
            nz4Var.d = mr3Var;
            nz4Var.e = -2;
            nz4 nz4Var2 = new nz4(null);
            this.r4 = nz4Var2;
            nz4Var2.f = d;
            nz4Var2.d = mr3Var;
            nz4Var2.e = -3;
            km0Var2 = new km0(nz4Var, nz4Var, nz4Var);
            this.w4 = km0Var2;
            km0Var2.k = true;
            if (e86.e(262144)) {
                L = gm.L(8.0f);
            } else {
                L = gm.L(48.0f);
            }
            km0Var2.d = L;
            km0Var2.e = L;
            km0Var = new km0(nz4Var2, nz4Var2, nz4Var2);
            this.u4 = km0Var;
            km0Var.k = true;
            int L2 = gm.L(48.0f);
            km0Var.d = L2;
            km0Var.e = L2;
            km0Var3 = new km0(nz4Var2, nz4Var2, nz4Var2);
            this.v4 = km0Var3;
        } else {
            this.q4 = null;
            this.r4 = null;
            this.s4 = null;
            km0Var = new km0(d, d, d);
            this.u4 = km0Var;
            km0Var2 = new km0(d, d, d);
            this.w4 = km0Var2;
            km0Var3 = new km0(d, d, d);
            this.v4 = km0Var3;
        }
        km0 km0Var4 = new km0(d, d, d);
        this.x4 = km0Var4;
        sy4 sy4Var = this.glassEngine;
        km0Var2.j = sy4Var;
        km0Var.j = sy4Var;
        km0Var3.j = sy4Var;
        km0Var4.j = sy4Var;
    }

    public static void C3(yv1 yv1Var, k47 k47Var) {
        CharSequence charSequence;
        if (k47Var != null && k47Var.r2()) {
            try {
                if (!TextUtils.isEmpty(k47Var.z)) {
                    charSequence = k47Var.z;
                } else {
                    charSequence = k47Var.v;
                }
                CharSequence v1 = gm.v1(charSequence, k47Var.a2, null);
                if (v1 instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) v1;
                    do4[] do4VarArr = (do4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), do4.class);
                    if (do4VarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(do4VarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(do4VarArr[0]);
                        for (int i = 1; i < do4VarArr.length; i++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(do4VarArr[i]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(do4VarArr[i]);
                            if (spanStart2 != spanEnd) {
                                if (spanStart2 > spanEnd) {
                                    for (int i2 = spanEnd; i2 <= spanStart2; i2++) {
                                        if (Character.isWhitespace(spannableStringBuilder.charAt(i2))) {
                                        }
                                    }
                                }
                            }
                            spanEnd = spanStart3;
                        }
                        yv1Var.Kb(k47Var.L1(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    public static hg3 n3(mk3 mk3Var) {
        jk3 jk3Var = mk3Var.a;
        for (int i = 0; i < jk3Var.getChildCount(); i++) {
            View childAt = jk3Var.getChildAt(i);
            if (childAt instanceof hg3) {
                hg3 hg3Var = (hg3) childAt;
                if (hg3Var.W()) {
                    return hg3Var;
                }
            }
        }
        return null;
    }

    public static void x4(j5 j5Var) {
        SharedPreferences.Editor editor;
        int i = j5Var.a;
        boolean[] zArr = F4;
        if (!zArr[i]) {
            oc7 r1 = oc7.r1(i);
            if (r1.k2 == 0 && !r1.getUserConfig().T) {
                SharedPreferences sharedPreferences = oc7.r1(r1.currentAccount).W3;
                if (sharedPreferences.contains("EnableGroup")) {
                    boolean z = sharedPreferences.getBoolean("EnableGroup", true);
                    editor = sharedPreferences.edit();
                    if (!z) {
                        editor.putInt("EnableGroup2", Integer.MAX_VALUE);
                        editor.putInt("EnableChannel2", Integer.MAX_VALUE);
                    }
                    editor.remove("EnableGroup").commit();
                } else {
                    editor = null;
                }
                if (sharedPreferences.contains("EnableAll")) {
                    boolean z2 = sharedPreferences.getBoolean("EnableAll", true);
                    if (editor == null) {
                        editor = sharedPreferences.edit();
                    }
                    if (!z2) {
                        editor.putInt("EnableAll2", Integer.MAX_VALUE);
                    }
                    editor.remove("EnableAll").commit();
                }
                if (editor != null) {
                    editor.commit();
                }
                r1.k2 = 4;
                for (int i2 = 0; i2 < 3; i2++) {
                    TL_account.getNotifySettings getnotifysettings = new TL_account.getNotifySettings();
                    if (i2 == 0) {
                        getnotifysettings.peer = new TLRPC.TL_inputNotifyChats();
                    } else if (i2 == 1) {
                        getnotifysettings.peer = new TLRPC.TL_inputNotifyUsers();
                    } else {
                        getnotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
                    }
                    r1.getConnectionsManager().sendRequest(getnotifysettings, new fb7(r1, i2, (byte) 1));
                }
                r1.getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new y67(r1, (byte) 6));
            }
            if (!r1.getUserConfig().U && !r1.l2) {
                r1.l2 = true;
                r1.getConnectionsManager().sendRequest(new TL_account.getContactSignUpNotification(), new y67(r1, (byte) 14));
            }
            r1.Z2(0, 0, 100, true, null);
            if (r1.s.isEmpty() && !TextUtils.isEmpty(r1.t3)) {
                TLRPC.TL_help_getRecentMeUrls tL_help_getRecentMeUrls = new TLRPC.TL_help_getRecentMeUrls();
                tL_help_getRecentMeUrls.referer = r1.t3;
                r1.getConnectionsManager().sendRequest(tL_help_getRecentMeUrls, new y67(r1, (byte) 4));
            }
            r1.k3(0, z8c.h(i).f(), false);
            bw2.r(i).f();
            hs6.d0(i).w(false);
            gm.d3(new bi3(j5Var, (byte) 0), 200L);
            Iterator it = r1.y3.iterator();
            while (it.hasNext()) {
                hs6.d0(i).d1((String) it.next(), true, true);
            }
            zArr[i] = true;
        }
    }

    public final boolean A2(long j, View view) {
        if (this.n2 && getMessagesController().s2(j)) {
            return false;
        }
        Long valueOf = Long.valueOf(j);
        ArrayList arrayList = this.K2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j));
            if (view instanceof hg3) {
                ((hg3) view).d0(false, true);
            } else if (view instanceof ut8) {
                ((ut8) view).w(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j));
        if (view instanceof hg3) {
            ((hg3) view).d0(true, true);
        } else if (view instanceof ut8) {
            ((ut8) view).w(true, true);
        }
        return true;
    }

    public final void A3(boolean z) {
        int i;
        boolean z2;
        this.actionBar.x();
        this.K2.clear();
        ee0 ee0Var = this.g1;
        if (ee0Var != null) {
            ee0Var.c(true, 0.0f);
        }
        ak3 ak3Var = this.A0;
        if (ak3Var != null) {
            ak3Var.b(cmb.J8, cmb.H8, cmb.I8, cmb.K8, cmb.c6);
        }
        ValueAnimator valueAnimator = this.x3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x3 = null;
        }
        if (this.w3 == 0.0f) {
            return;
        }
        W4(-q3());
        int i2 = 0;
        while (true) {
            mk3[] mk3VarArr = this.f0;
            if (i2 >= mk3VarArr.length) {
                break;
            }
            mk3 mk3Var = mk3VarArr[i2];
            if (mk3Var != null) {
                mk3Var.a.J0(true);
            }
            i2++;
        }
        if (this.L) {
            i = 81;
        } else {
            i = 0;
        }
        float max = Math.max(0.0f, gm.L(i + 48) + this.O);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w3, 0.0f);
        this.x3 = ofFloat;
        ofFloat.addUpdateListener(new oh3(this, max, (byte) 1));
        this.x3.addListener(new mj3(this, max, (byte) 0));
        this.x3.setInterpolator(d53.f);
        this.x3.setDuration(200L);
        this.x3.start();
        this.a1 = false;
        ArrayList arrayList = this.c1;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            for (int size = arrayList.size(); i3 < size; size = size) {
                ub7 ub7Var = (ub7) arrayList.get(i3);
                qf4.z0(ub7Var, ub7Var.g, ub7Var.b, ub7Var.c, ub7Var.n, ub7Var.m, ub7Var.h, ub7Var.i, ub7Var.j, false, false, true, true, false, this, null);
                i3++;
                arrayList = arrayList;
            }
            arrayList.clear();
        }
        if (this.b1) {
            getMessagesController().r4(this.Y2, 0L, null);
            z2 = 0;
            this.b1 = false;
        } else {
            z2 = 0;
        }
        p5(true);
        if (this.f0 != null) {
            int i4 = z2;
            while (true) {
                mk3[] mk3VarArr2 = this.f0;
                if (i4 >= mk3VarArr2.length) {
                    break;
                }
                mk3VarArr2[i4].d.I = z2;
                i4++;
            }
        }
        int i5 = oc7.s5;
        int i6 = z2;
        if (z) {
            i6 = 8192;
        }
        G5(196608 | i6, true);
    }

    public final boolean A4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.H;
        if (user != null && !m9c.B(user) && !m9c.z(user)) {
            Boolean bool = tL_requestPeerTypeUser.bot;
            if (bool == null || bool.booleanValue() == user.bot) {
                Boolean bool2 = tL_requestPeerTypeUser.premium;
                if (bool2 == null || bool2.booleanValue() == user.premium) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void A5(boolean z) {
        boolean z2;
        if (this.m0 == null) {
            return;
        }
        ArrayList arrayList = getDownloadController().H;
        int size = arrayList.size();
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i < size) {
                Object obj = arrayList.get(i);
                i++;
                k47 k47Var = (k47) obj;
                if (k47Var.F0() != null && k47Var.F0().size >= 157286400) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        ArrayList arrayList2 = getDownloadController().I;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i2);
            i2++;
            k47 k47Var2 = (k47) obj2;
            if (k47Var2.F0() != null && k47Var2.F0().size >= 157286400) {
                z2 = true;
                break;
            }
        }
        if (!getUserConfig().p() && !getMessagesController().H3() && z2 && z) {
            z3 = true;
        }
        this.d.a(z3, true);
    }

    public final void B2(sh4 sh4Var) {
        sj3 sj3Var;
        if (this.s3 && (sj3Var = this.D0) != null) {
            ArrayList arrayList = sj3Var.D0;
            if (!arrayList.isEmpty()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (sh4Var.b((sh4) arrayList.get(i))) {
                        return;
                    }
                }
            }
            arrayList.add(sh4Var);
            zj3 zj3Var = this.Y;
            ArrayList arrayList2 = zj3Var.G;
            arrayList2.add(sh4Var);
            zj3Var.J = arrayList2.size() - 1;
            zj3Var.e();
            this.Y.r.getText().clear();
            t5(true, null, null, false, true);
        }
    }

    public final void B3(boolean z) {
        if (this.H3.c()) {
            z = true;
        }
        if (!z || !this.d2) {
            this.a4 = z;
            v5(true);
            if (z) {
                hg5 hg5Var = this.q0;
                if (hg5Var != null) {
                    hg5Var.f(true);
                }
                hg5 hg5Var2 = this.r0;
                if (hg5Var2 != null) {
                    hg5Var2.f(true);
                }
            }
        }
    }

    public final void B4(View view) {
        boolean z;
        int i;
        int i2;
        String str;
        int i3;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        my0 i4 = wi8.i(getParentActivity(), false, 1, null);
        if (getMessagesStorage().M != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 2131232221;
        } else {
            i = 0;
        }
        if (gda.m1) {
            i2 = 2131231001;
        } else {
            i2 = 2131231005;
        }
        int[] iArr = {i, i2};
        if (z) {
            str = jb6.M0(2131748439, null);
        } else {
            str = null;
        }
        if (gda.m1) {
            i3 = 2131746979;
        } else {
            i3 = 2131749081;
        }
        CharSequence[] charSequenceArr = {str, jb6.M0(i3, null)};
        r30 r30Var = new r30(this, (byte) 1);
        i4.M = charSequenceArr;
        i4.N = iArr;
        i4.L = r30Var;
        showDialog(i4);
    }

    public final void B5(TLRPC.User user, boolean z) {
        tm tmVar;
        ylb ylbVar;
        aj3 aj3Var = this.F0;
        tm tmVar2 = null;
        if (aj3Var != null && (tmVar = aj3Var.b0) != null && aj3Var.r0 != null) {
            Long i = m9c.i(user);
            if (i != null) {
                tmVar.j(i.longValue(), z);
                tmVar.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z);
            } else {
                if (user != null) {
                    oc7.r1(aj3Var.f);
                    if (oc7.C2(user)) {
                        if (aj3Var.O0 == null) {
                            aj3Var.O0 = aj3Var.getContext().getResources().getDrawable(2131232313).mutate();
                            aj3Var.O0 = new um(gm.L(18.0f), gm.L(18.0f), aj3Var.O0);
                        }
                        Drawable drawable = aj3Var.O0;
                        int i2 = cmb.pi;
                        nk3 nk3Var = aj3Var.f0;
                        if (nk3Var != null) {
                            ylbVar = nk3Var.getResourceProvider();
                        } else {
                            ylbVar = null;
                        }
                        anb.x(aj3Var, drawable, i2, ylbVar, PorterDuff.Mode.MULTIPLY);
                        tmVar.g(aj3Var.O0, z);
                        tmVar.m(false, z);
                    }
                }
                tmVar.g(null, z);
                tmVar.m(false, z);
            }
            tmVar.k(Integer.valueOf(aj3Var.f(cmb.pi)));
            aj3Var.a0.invalidate();
        }
        if (this.F3 != null && this.actionBar != null) {
            Long i3 = m9c.i(user);
            this.D3 = null;
            if (i3 != null) {
                boolean z2 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                this.F3.j(i3.longValue(), z);
                this.F3.m(z2, z);
                if (z2) {
                    this.D3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
                }
                this.actionBar.setRightDrawableOnClick(new mh3(this, (byte) 1));
                vz9.s(this.currentAccount);
            } else {
                if (user != null) {
                    oc7.r1(this.currentAccount);
                    if (oc7.C2(user)) {
                        if (this.M3 == null) {
                            this.M3 = getParentActivity().getResources().getDrawable(2131232313).mutate();
                            this.M3 = new um(gm.L(18.0f), gm.L(18.0f), this.M3);
                        }
                        Drawable drawable2 = this.M3;
                        int themedColor = getThemedColor(cmb.pi);
                        this.D4 = themedColor;
                        drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                        this.F3.g(this.M3, z);
                        this.F3.m(false, z);
                        this.actionBar.setRightDrawableOnClick(new mh3(this, (byte) 2));
                        vz9.s(this.currentAccount);
                    }
                }
                this.F3.g(null, z);
                this.F3.m(false, z);
                this.actionBar.setRightDrawableOnClick(null);
            }
            tm tmVar3 = this.F3;
            int i4 = cmb.pi;
            tmVar3.k(Integer.valueOf(getThemedColor(i4)));
            yn ynVar = this.G3;
            if (ynVar != null) {
                ynVar.setColor(getThemedColor(i4));
            }
            fj3 fj3Var = this.N0;
            if (fj3Var != null && (fj3Var.getContentView() instanceof vz9)) {
                lka titleTextView = this.actionBar.getTitleTextView();
                vz9 vz9Var = (vz9) this.N0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    tm tmVar4 = this.F3;
                    if (rightDrawable == tmVar4) {
                        tmVar2 = tmVar4;
                    }
                }
                vz9Var.y(tmVar2, titleTextView);
            }
        }
    }

    @Override
    public final List C() {
        return Arrays.asList(new dl4(jb6.M0(2131751585, null)), new dl4(jb6.M0(2131752013, null), new kh3(this, (byte) 23)), new dl4(jb6.M0(2131751586, null), new kh3(this, (byte) 24)));
    }

    public final void C2(boolean z) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.Y2 == 0 && this.a3 == 0 && Build.VERSION.SDK_INT >= 33 && wn7.E0(parentActivity)) {
                if (z) {
                    showDialog(new wn7(parentActivity, !use.a(), new wh3(parentActivity, (byte) 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().V && this.W1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z) {
                    he heVar = ik.v(parentActivity, new ci3(this, (byte) 0)).a;
                    this.V1 = heVar;
                    showDialog(heVar);
                    return;
                }
                arrayList.add("android.permission.READ_CONTACTS");
                arrayList.add("android.permission.WRITE_CONTACTS");
                arrayList.add("android.permission.GET_ACCOUNTS");
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                }
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                }
                if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                }
            } else if ((i <= 28 || e21.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
            if (arrayList.isEmpty()) {
                if (this.B0) {
                    this.B0 = false;
                    e5();
                    return;
                }
                return;
            }
            try {
                parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
            } catch (Exception unused) {
            }
        }
    }

    public final void C4(android.view.View r27, int r28, defpackage.q59 r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.C4(android.view.View, int, q59):void");
    }

    public final void C5() {
        hg5 hg5Var;
        boolean e5 = getMessagesController().e5();
        if (this.R3 != e5) {
            u5();
            if (!this.R3 && e5 && (hg5Var = this.q0) != null) {
                hg5Var.v();
            }
            this.R3 = e5;
        }
        wp4 wp4Var = this.u0;
        if (wp4Var == null) {
            return;
        }
        if (this.T0 == 10) {
            wp4Var.setImageResource(2131231199);
            this.u0.setContentDescription(jb6.M0(2131751291, null));
            return;
        }
        wp4Var.setImageResource(2131231110);
        this.u0.setContentDescription(jb6.M0(2131748027, null));
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        int i2;
        int i3;
        int i4 = 8;
        if (i == 1) {
            Y2();
            a3();
            d3();
            Q2();
            b3();
            zj3 zj3Var = this.Y;
            fn0 fn0Var = this.b;
            zj3Var.setBlurredBackgroundVisibility(fn0Var.e);
            float a = aie.a(fn0Var.e);
            bf0 bf0Var = this.d3;
            if (bf0Var != null) {
                bf0Var.setScaleX(a);
                this.d3.setScaleY(a);
                this.d3.setAlpha(a);
                bf0 bf0Var2 = this.d3;
                if (a > 0.0f) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                bf0Var2.setVisibility(i3);
            }
            if (this.w0 != null) {
                float R1 = gm.R1(0.9f, 1.0f, a);
                this.w0.setScaleX(R1);
                this.w0.setScaleY(R1);
                this.w0.setAlpha(a);
                b61 b61Var = this.w0;
                int i5 = (a > 0.0f ? 1 : (a == 0.0f ? 0 : -1));
                if (i5 > 0) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                b61Var.setVisibility(i2);
                this.x0.setAlpha(a);
                e02 e02Var = this.x0;
                if (i5 > 0) {
                    i4 = 0;
                }
                e02Var.setVisibility(i4);
            }
        } else if (i == 2) {
            Y2();
            a3();
        } else if (i == 3) {
            W2();
        } else if (i == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        } else if (i == 5) {
            V2();
        } else if (i == 6) {
            Y2();
            a3();
        } else if (i == 7) {
            R2();
        } else if (i == 8) {
            Q2();
            b3();
        } else if (i == 9) {
            b3();
        }
    }

    public final void D2(CharSequence charSequence) {
        int i;
        if (this.D1 != null) {
            if (this.F2 == null && this.G2 == null && this.H2 == null) {
                return;
            }
            if (this.I2 == null) {
                bda bdaVar = new bda(getParentActivity(), getResourceProvider());
                this.I2 = bdaVar;
                bdaVar.setLayoutClickListener(new mh3(this, (byte) 0));
                this.I2.setOnModeChangeListener(new nh3(this, (byte) 0));
                ti3 ti3Var = this.D1;
                bda bdaVar2 = this.I2;
                if (bdaVar2 == null) {
                    ti3Var.getClass();
                } else {
                    ti3Var.w2 = bdaVar2;
                    ti3Var.addView(bdaVar2, 0, qoe.e(-1, 48, 51));
                    ti3Var.W3 = false;
                    ti3Var.P();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.I2.getLayoutParams();
                layoutParams.rightMargin = -this.D1.getPaddingRight();
                this.I2.setLayoutParams(layoutParams);
            }
            if (z3()) {
                this.I2.i(this.currentAccount, this.F2);
            } else {
                String str = this.G2;
                if (str != null) {
                    bda bdaVar3 = this.I2;
                    bdaVar3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        bdaVar3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.H2;
                    if (charSequence2 != null) {
                        bda bdaVar4 = this.I2;
                        bdaVar4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            bdaVar4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.D1.setFieldText(charSequence);
            }
            ti3 ti3Var2 = this.D1;
            if (z3()) {
                i = 2131754451;
            } else {
                i = 2131745196;
            }
            ti3Var2.setOverrideHint(jb6.M0(i, null));
            R2();
            if (this.I2.getMode() != 0) {
                this.D1.e2(false, false);
            }
            z5();
        }
    }

    public final void D3(int r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.D3(int):void");
    }

    public final boolean D4(View view, int i, float f, q59 q59Var) {
        ov9 ov9Var;
        long j;
        ov9 ov9Var2;
        TLRPC.EncryptedChat encryptedChat;
        long E;
        if (getParentActivity() != null && !(view instanceof nl3) && q59Var.d(i) != 21) {
            if (!this.actionBar.y() && !gm.O1() && !this.n2 && (view instanceof hg3)) {
                hg3 hg3Var = (hg3) view;
                if (!getMessagesController().s2(hg3Var.getDialogId()) && !this.H3.c() && hg3Var.Z(f)) {
                    return c5(hg3Var);
                }
            }
            dj3 dj3Var = this.H3;
            if (dj3Var == null || !dj3Var.c()) {
                sj3 sj3Var = this.D0;
                boolean z = true;
                if (sj3Var != null && q59Var == (ov9Var2 = sj3Var.e0)) {
                    Object I = ov9Var2.I(i);
                    sj3 sj3Var2 = this.D0;
                    if (!sj3Var2.e0.O) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String M0 = jb6.M0(2131751991, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                heVar.U = jb6.a0("ClearSearchSingleChatAlertText", null, 2131751990, no4.j(this.currentAccount, chat, false));
                            } else {
                                heVar.U = jb6.a0("ClearSearchSingleChatAlertText", null, 2131751990, chat.title);
                            }
                            E = -chat.id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.id == getUserConfig().n) {
                                heVar.U = jb6.a0("ClearSearchSingleChatAlertText", null, 2131751990, jb6.M0(2131745635, null));
                            } else {
                                heVar.U = jb6.a0("ClearSearchSingleUserAlertText", null, 2131751988, bw2.m(0, user.first_name, user.last_name));
                            }
                            E = user.id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            heVar.U = jb6.a0("ClearSearchSingleUserAlertText", null, 2131751988, bw2.m(0, W1.first_name, W1.last_name));
                            E = pg3.E(encryptedChat.id);
                        }
                        alertDialog$Builder.j(jb6.M0(2131751992, null), new d12(this, E, (byte) 1));
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        showDialog(heVar);
                        TextView textView = (TextView) heVar.c(-1);
                        if (textView != null) {
                            anb.X(textView, cmb.p7, getResourceProvider());
                        }
                        return true;
                    }
                    sj3Var = sj3Var2;
                }
                if (sj3Var != null && q59Var == (ov9Var = sj3Var.e0)) {
                    if (this.n2) {
                        C4(view, i, q59Var);
                        return false;
                    }
                    if ((view instanceof ut8) && !ov9Var.N(i)) {
                        j = ((ut8) view).getDialogId();
                    } else {
                        j = 0;
                    }
                    if (j != 0) {
                        h5(j, view);
                        return true;
                    }
                } else {
                    Object J = ((zk3) q59Var).J(i);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.n2) {
                            if ((this.T0 == 3 || e3()) && H5(dialog.id)) {
                                if (this.T0 == 1 && e3() && this.o2 && getMessagesController().s2(dialog.id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.T0 != 1) {
                                        z = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z);
                                    bundle.putBoolean("quote", this.P0);
                                    bundle.putBoolean("reply_to", this.O0);
                                    sxb sxbVar = new sxb(bundle);
                                    sxbVar.M0 = this;
                                    presentFragment(sxbVar);
                                    return false;
                                }
                                A2(dialog.id, view);
                                y5();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            B4(view);
                            return false;
                        } else if (!this.actionBar.y() || !H3(dialog)) {
                            h5(dialog.id, view);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void D5(float f) {
        float f2;
        float f3;
        int i;
        int i2;
        float i3 = Utilities.i(this.z1 * 2.0f, 1.0f, 0.0f);
        aj3 aj3Var = this.F0;
        float f4 = (1.0f - this.w3) * f * this.I0;
        float f5 = 1.0f - i3;
        aj3Var.setAlpha(f4 * f5);
        int i4 = 0;
        if (!this.L && !this.N) {
            if (this.M) {
                this.F0.setTranslationY((Math.max(this.O, -r3()) + (-gm.L(81.0f))) - gm.L(8.0f));
                this.F0.setProgressToCollapse(1.0f);
                aj3 aj3Var2 = this.F0;
                aj3Var2.setClipTop((int) (gm.m - aj3Var2.getY()));
            }
            f2 = 1.0f - this.I0;
            this.actionBar.setTranslationY(0.0f);
        } else {
            float i5 = Utilities.i((-this.O) / gm.L(81.0f), 1.0f, 0.0f);
            if (this.w3 == 1.0f) {
                i5 = 1.0f;
            }
            float i6 = Utilities.i(i5 / 0.5f, 1.0f, 0.0f);
            this.F0.setClipTop(0);
            if (!this.L && this.N) {
                this.F0.setTranslationY((-gm.L(81.0f)) - gm.L(8.0f));
                this.F0.setProgressToCollapse(1.0f);
                f3 = this.I0;
            } else {
                this.F0.setTranslationY(((this.U / 2.0f) + (Math.max(this.O, -r3()) + this.y3)) - gm.L(8.0f));
                this.F0.l(!this.H3.c(), i5);
                if (!this.N) {
                    f3 = this.I0;
                } else {
                    f2 = 1.0f - i6;
                    this.actionBar.setTranslationY(0.0f);
                }
            }
            f2 = 1.0f - f3;
            this.actionBar.setTranslationY(0.0f);
        }
        float f6 = f2 * f5;
        int i7 = (f6 > 1.0f ? 1 : (f6 == 1.0f ? 0 : -1));
        a aVar = this.actionBar;
        if (i7 != 0) {
            aVar.getTitlesContainer().setPivotY(gm.m);
            this.actionBar.getTitlesContainer().setPivotX(gm.L(20.0f));
            float f7 = (0.6f * f6) + 0.4f;
            this.actionBar.getTitlesContainer().setScaleY(f7);
            this.actionBar.getTitlesContainer().setScaleX(f7);
            this.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            this.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-gm.L(30.0f));
            this.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f7);
            this.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f7);
            float f8 = (1.0f - this.w3) * f6;
            this.actionBar.getTitlesContainer().setAlpha(f8);
            FrameLayout titlesContainer = this.actionBar.getTitlesContainer();
            int i8 = (f8 > 0.0f ? 1 : (f8 == 0.0f ? 0 : -1));
            if (i8 > 0) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            titlesContainer.setVisibility(i2);
            this.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f8);
            FrameLayout additionalSubTitleOverlayContainer = this.actionBar.getAdditionalSubTitleOverlayContainer();
            if (i8 <= 0) {
                i4 = 4;
            }
            additionalSubTitleOverlayContainer.setVisibility(i4);
            return;
        }
        aVar.getTitlesContainer().setScaleY(1.0f);
        this.actionBar.getTitlesContainer().setScaleX(1.0f);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
        float f9 = 1.0f - this.w3;
        this.actionBar.getTitlesContainer().setAlpha(f9);
        FrameLayout titlesContainer2 = this.actionBar.getTitlesContainer();
        int i9 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
        if (i9 > 0) {
            i = 0;
        } else {
            i = 4;
        }
        titlesContainer2.setVisibility(i);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f9);
        FrameLayout additionalSubTitleOverlayContainer2 = this.actionBar.getAdditionalSubTitleOverlayContainer();
        if (i9 <= 0) {
            i4 = 4;
        }
        additionalSubTitleOverlayContainer2.setVisibility(i4);
    }

    public final String E2() {
        String r;
        ArrayList arrayList = this.K2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() < 3) {
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                long longValue = ((Long) obj).longValue();
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                if (longValue == getUserConfig().e()) {
                    sb.append(jb6.M0(2131745635, null));
                } else {
                    int size2 = arrayList.size();
                    int i2 = this.currentAccount;
                    if (size2 == 1) {
                        r = pg3.k(i2, longValue);
                    } else {
                        r = pg3.r(i2, longValue);
                    }
                    sb.append(r);
                }
            }
            return jb6.a0(null, null, 2131745173, sb.toString());
        }
        return jb6.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public final boolean E3() {
        if (this.A0 != null && this.T0 == 0 && !this.n2 && this.Y2 == 0 && this.a3 == 0 && getMessagesController().k2()) {
            return true;
        }
        return false;
    }

    public final void E4(View view) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i = 0; i < 4; i++) {
            if (z8c.h(i).o()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        Collections.sort(arrayList, new x03((byte) 12));
        bu5 I = bu5.I(this, view);
        if (arrayList.size() > 0) {
            if (I.y() > 0) {
                I.j();
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                int intValue = ((Integer) obj).intValue();
                if (this.currentAccount == intValue) {
                    z = true;
                } else {
                    z = false;
                }
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i3 = cmb.h6;
                Drawable Y = cmb.Y(getThemedColor(i3), 0, 0);
                wmb M = anb.M(i3);
                ylb resourceProvider = getResourceProvider();
                linearLayout.setBackground(Y);
                anb.j(linearLayout, Y, null, M, resourceProvider);
                TLRPC.User f = z8c.h(intValue).f();
                pc0 pc0Var = new pc0((ylb) null);
                pc0Var.q(f);
                yj3 yj3Var = new yj3(this, getParentActivity(), z);
                linearLayout.addView(yj3Var, qoe.t(34, 34, 16, 12, 0, 0, 0));
                bf0 bf0Var = new bf0(getParentActivity());
                if (z) {
                    bf0Var.setScaleX(0.833f);
                    bf0Var.setScaleY(0.833f);
                }
                bf0Var.setRoundRadius(gm.L(16.0f));
                bf0Var.getImageReceiver().d = intValue;
                bf0Var.f(f, pc0Var);
                yj3Var.addView(bf0Var, qoe.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                anb.X(textView, cmb.i5, getResourceProvider());
                textView.setText(m9c.r(f));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, qoe.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new wh(this, intValue, I, (byte) 7));
                I.q(linearLayout, qoe.o(230, 48));
            }
        }
        ShapeDrawable b0 = cmb.b0(gm.L(24.0f), getThemedColor(cmb.c6));
        b0.getPaint().setShadowLayer(gm.L(6.0f), 0.0f, gm.L(1.0f), cmb.p1(0.15f, -16777216));
        I.z.set(-gm.L(4.0f), -gm.L(4.0f), -gm.L(4.0f), -gm.L(4.0f));
        I.X(b0);
        I.b0(0.0f, -gm.L(4.0f));
        I.W(5);
        I.a0();
    }

    public final void E5(boolean z) {
        a aVar;
        boolean z2;
        boolean z3;
        h4b v3;
        ArrayList arrayList;
        boolean z4;
        boolean z5;
        int i;
        float f;
        float f2;
        if (this.F0 != null && this.J == null) {
            dj3 dj3Var = this.H3;
            if ((dj3Var == null || !dj3Var.c()) && !this.s3 && (aVar = this.actionBar) != null && !aVar.y() && !this.n2) {
                v9b v9bVar = v9b.G2;
                int i2 = 0;
                if ((v9bVar != null && v9bVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
                    z = false;
                }
                if (!F3() && v3().H()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.a3 != 0) {
                    z3 = false;
                } else if (F3()) {
                    z3 = !v3().h.isEmpty();
                } else {
                    if (!z2 && (((arrayList = (v3 = v3()).g) != null && arrayList.size() > 0) || v3.I())) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z2 = v3().H();
                }
                this.M = z2;
                boolean z6 = this.H0;
                if (!z2 && !z3) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                this.H0 = z4;
                if (z3 || z4) {
                    aj3 aj3Var = this.F0;
                    if (z4 != z6) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    aj3Var.p(z, z5);
                }
                boolean z7 = this.H0;
                int i3 = 8;
                float f3 = 0.0f;
                if (z7 != z6) {
                    if (z) {
                        ValueAnimator valueAnimator = this.K;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        if (this.H0 && !isInPreviewMode()) {
                            this.F0.setVisibility(0);
                        }
                        float f4 = this.I0;
                        if (this.H0) {
                            f2 = 1.0f;
                        } else {
                            f2 = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, f2);
                        this.K = ofFloat;
                        ofFloat.addUpdateListener(new af0(this, (byte) 4));
                        this.K.addListener(new kh2(this, (byte) 10));
                        this.K.setDuration(200L);
                        this.K.setInterpolator(d53.f);
                        this.K.start();
                    } else {
                        aj3 aj3Var2 = this.F0;
                        if (z7 && !isInPreviewMode()) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        aj3Var2.setVisibility(i);
                        if (this.H0) {
                            f = 1.0f;
                        } else {
                            f = 0.0f;
                        }
                        this.I0 = f;
                        View view = this.fragmentView;
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                }
                if (z3 != this.N) {
                    this.N = z3;
                    if (z3) {
                        this.F0.l(false, 1.0f);
                    }
                    if (z && !isInPreviewMode()) {
                        this.F0.setVisibility(0);
                        float f5 = -this.O;
                        if (!z3) {
                            f3 = q3();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.J = ofFloat2;
                        ofFloat2.addUpdateListener(new rj3(this, f5, z3, f3));
                        this.J.addListener(new jj3(this, z3, (byte) 2));
                        this.J.setDuration(200L);
                        this.J.setInterpolator(d53.f);
                        this.J.start();
                        return;
                    }
                    this.L = z3;
                    aj3 aj3Var3 = this.F0;
                    if ((z3 || this.M) && !isInPreviewMode()) {
                        i3 = 0;
                    }
                    aj3Var3.setVisibility(i3);
                    if (!z3) {
                        W4(0.0f);
                    } else {
                        this.A3 = -gm.L(81.0f);
                        W4(-q3());
                    }
                    while (true) {
                        mk3[] mk3VarArr = this.f0;
                        if (i2 >= mk3VarArr.length) {
                            break;
                        }
                        mk3 mk3Var = mk3VarArr[i2];
                        if (mk3Var != null) {
                            mk3Var.a.requestLayout();
                        }
                        i2++;
                    }
                    View view2 = this.fragmentView;
                    if (view2 != null) {
                        view2.requestLayout();
                        this.fragmentView.invalidate();
                    }
                }
            }
        }
    }

    public final int F2() {
        if (this.D1 != null) {
            return (int) (this.A1.getInputBubbleHeight() + this.w.d() + gm.L(9.0f) + gm.L(7.0f) + gm.L(2.0f));
        }
        int i = (this.a3 > 0L ? 1 : (this.a3 == 0L ? 0 : -1));
        int i2 = this.m4;
        if (i != 0) {
            return gm.L(72.0f) + i2;
        }
        return i2 + this.o4;
    }

    public final boolean F3() {
        if (this.Y2 == 1) {
            return true;
        }
        return false;
    }

    public final void F4() {
        boolean z = true;
        try {
            ((p09) ((pc0) this.O1.h.getImageReceiver().n0).K).C(true);
        } catch (Exception unused) {
        }
        if (this.h4 == null) {
            wn5 wn5Var = new wn5(0, true, true);
            this.h4 = wn5Var;
            wn5Var.I = true;
            wn5Var.a = this;
            wn5Var.b = new wj3(this);
            getMediaDataController().z();
            getMessagesController().h3();
            getMessagesController().k3(this.classGuid, getUserConfig().f(), true);
        }
        TLRPC.User W1 = oc7.r1(this.currentAccount).W1(Long.valueOf(z8c.h(this.currentAccount).e()));
        if (W1 == null) {
            W1 = z8c.h(this.currentAccount).f();
        }
        if (W1 == null) {
            return;
        }
        i22 i22Var = this.h4.c;
        if (i22Var != null) {
            i22Var.H0();
        }
        wn5 wn5Var2 = this.h4;
        TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
        if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z = false;
        }
        wn5Var2.n(z, new di3(this, (byte) 12), new rh3(this, (byte) 3), 0);
    }

    public final void F5(int i, boolean z) {
        boolean z2;
        if (this.A0 != null && this.T0 == 0 && !this.n2) {
            this.U3 = i;
            ub7 x3 = x3();
            this.U3 = -1;
            boolean z3 = false;
            if (x3 != null && getMessagesController().S0().size() > 1 && getMessagesController().r2(x3)) {
                z2 = true;
            } else {
                z2 = false;
            }
            ak3 ak3Var = this.A0;
            if (z && ak3Var.getVisibility() == 0) {
                z3 = true;
            }
            ak3Var.k(z2, z3);
        }
    }

    public final boolean G2() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.K2;
            if (i < arrayList.size()) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-((Long) arrayList.get(i)).longValue()));
                if (L0 != null && !sd2.l(L0)) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    public final boolean G3(long j) {
        if (j < 0) {
            return false;
        }
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(j));
        if (!m9c.w(W1)) {
            return false;
        }
        ArrayList l = oc7.r1(this.currentAccount).g4.l(-W1.id);
        if ((l != null && !l.isEmpty()) || !oc7.r1(this.currentAccount).g4.e(-W1.id)) {
            return false;
        }
        return true;
    }

    public final void G4() {
        if (!this.R3) {
            hg5 hg5Var = this.r0;
            if (hg5Var != null) {
                if (hg5Var.W) {
                    return;
                }
                gm.B2(hg5Var);
            }
            SpannableStringBuilder N2 = gm.N2(jb6.N0("StoriesPremiumHint2").replace('\n', ' '), cmb.wj, 0, new di3(this, (byte) 5), null);
            hg5 hg5Var2 = new hg5(getParentActivity(), 2);
            hg5Var2.q(8.0f);
            hg5Var2.d = 8000L;
            hg5Var2.j(true);
            hg5Var2.p(true);
            hg5Var2.h = gm.q.x - gm.L(148.0f);
            hg5Var2.t(N2);
            hg5Var2.n(1.0f, -40.0f);
            hg5Var2.i(getThemedColor(cmb.vj));
            this.r0 = hg5Var2;
            hg5Var2.setTranslationY((-this.m4) - this.o4);
            ((ViewGroup) this.fragmentView).addView(this.r0, qoe.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            this.r0.v();
            return;
        }
        hg5 hg5Var3 = this.q0;
        if (hg5Var3 != null) {
            hg5Var3.f(true);
        }
        xy n = oc7.r1(this.currentAccount).N1().n();
        if (n != null && n.a(this.currentAccount, 1)) {
            showDialog(new i46(n.b(), this.currentAccount, null, getParentActivity(), this));
            return;
        }
        v9b C = v9b.C(getParentActivity(), this.currentAccount);
        C.y = new ui3(this);
        C.Q(null);
    }

    public final void G5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.G5(int, boolean):void");
    }

    public final void H2() {
        int themedColor;
        ai8 ai8Var;
        pi3 pi3Var;
        ov9 ov9Var;
        smb smbVar;
        sj3 sj3Var = this.D0;
        if (sj3Var != null && (ov9Var = sj3Var.e0) != null && (smbVar = ov9Var.l0) != null) {
            int childCount = smbVar.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = smbVar.getChildAt(i);
                if (childAt instanceof cg5) {
                    cg5 cg5Var = (cg5) childAt;
                    pc0 pc0Var = cg5Var.c;
                    boolean D = pg3.D(cg5Var.f);
                    int i2 = cg5Var.h;
                    if (D) {
                        TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(cg5Var.f));
                        cg5Var.e = W1;
                        pc0Var.q(W1);
                    } else {
                        pc0Var.p(oc7.r1(i2).L0(Long.valueOf(-cg5Var.f)));
                        cg5Var.e = null;
                    }
                    cg5Var.c(true);
                }
            }
        }
        if (this.f0 != null) {
            int i3 = 0;
            while (true) {
                mk3[] mk3VarArr = this.f0;
                if (i3 >= mk3VarArr.length) {
                    break;
                }
                mk3 mk3Var = mk3VarArr[i3];
                if (mk3Var != null && (pi3Var = mk3Var.n) != null) {
                    pi3Var.h();
                }
                i3++;
            }
        }
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.I(getThemedColor(cmb.F8), true);
            this.actionBar.J(getThemedColor(cmb.D8), false, true);
            this.actionBar.J(getThemedColor(cmb.E8), true, true);
            this.actionBar.K(getThemedColor(cmb.H5), true);
            this.actionBar.updateColors();
        }
        if (this.F3 != null) {
            int themedColor2 = getThemedColor(cmb.pi);
            Drawable drawable = this.M3;
            if (drawable != null && themedColor2 != this.D4) {
                this.D4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            tm tmVar = this.F3;
            if (tmVar != null) {
                tmVar.k(Integer.valueOf(themedColor2));
            }
            yn ynVar = this.G3;
            if (ynVar != null) {
                ynVar.setColor(themedColor2);
            }
        }
        nl3 nl3Var = this.O1;
        if (nl3Var != null) {
            cmb.F1(nl3Var.getBackground(), cmb.w0(null, cmb.h6, false), true);
        }
        r7 r7Var = this.n0;
        if (r7Var != null) {
            r7Var.setIconColor(getThemedColor(cmb.u8));
        }
        ti3 ti3Var = this.D1;
        if (ti3Var != null) {
            ti3Var.updateColors();
        }
        ak3 ak3Var = this.A0;
        if (ak3Var != null) {
            im0 im0Var = ak3Var.F0;
            if (im0Var != null) {
                im0Var.updateColors();
            }
            jp0 jp0Var = ak3Var.z0;
            if (jp0Var != null) {
                jp0Var.g();
            }
            ak3Var.invalidate();
        }
        uh4 uh4Var = this.c0;
        if (uh4Var != null) {
            uh4Var.updateColors();
        }
        sj3 sj3Var2 = this.D0;
        if (sj3Var2 != null && (ai8Var = sj3Var2.s0) != null) {
            ai8Var.c();
        }
        vgc vgcVar = this.b0;
        if (vgcVar != null) {
            vgcVar.updateColors();
        }
        nu9 nu9Var = this.a0;
        if (nu9Var != null) {
            nu9Var.updateColors();
        }
        if (this.L0 != null) {
            int p = on2.p(getThemedColor(cmb.c6), 100);
            boolean z = this.L0.getForeground() instanceof ColorDrawable;
            sb sbVar = this.L0;
            if (z) {
                if (((ColorDrawable) sbVar.getForeground()).getColor() != p) {
                    ((ColorDrawable) this.L0.getForeground()).setColor(p);
                }
            } else {
                sbVar.setForeground(new ColorDrawable(p));
            }
        }
        wp4 wp4Var = this.u0;
        if (wp4Var != null) {
            wp4Var.updateColors();
        }
        wp4 wp4Var2 = this.v0;
        if (wp4Var2 != null) {
            wp4Var2.updateColors();
        }
        int i4 = cmb.c6;
        this.t4.a(getThemedColor(i4));
        qk3 qk3Var = this.L1;
        if (qk3Var != null) {
            qk3Var.updateColors();
        }
        pk3 pk3Var = this.M1;
        if (pk3Var != null) {
            pk3Var.setColor(cmb.w0(null, i4, false));
        }
        ri3 ri3Var = this.J1;
        if (ri3Var != null) {
            ri3Var.updateColors();
        }
        ri3 ri3Var2 = this.H1;
        if (ri3Var2 != null) {
            ri3Var2.updateColors();
        }
        x5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        aj3 aj3Var = this.F0;
        if (aj3Var != null) {
            aj3Var.o();
        }
        if (this.E3 != null && (themedColor = getThemedColor(cmb.Wl)) != this.C4) {
            this.C4 = themedColor;
            this.E3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        zj3 zj3Var = this.Y;
        if (zj3Var != null) {
            zj3Var.updateColors();
        }
    }

    public final boolean H3(TLRPC.Dialog dialog) {
        char c;
        if (dialog != null) {
            int i = this.f0[0].s;
            ub7 ub7Var = null;
            if ((i == 7 || i == 8) && (!this.actionBar.y() || this.actionBar.z(null))) {
                ub7[] ub7VarArr = getMessagesController().N;
                if (this.f0[0].s == 8) {
                    c = 1;
                } else {
                    c = 0;
                }
                ub7Var = ub7VarArr[c];
            }
            if (ub7Var != null) {
                if (ub7Var.j.indexOfKey(dialog.id) >= 0) {
                    return true;
                }
            } else {
                return dialog.pinned;
            }
        }
        return false;
    }

    public final boolean H4(mk3 mk3Var, TLRPC.Dialog dialog) {
        TLRPC.EncryptedChat Z0;
        if (mk3Var != null && dialog != null) {
            if (!getMessagesController().p4.containsKey(Long.valueOf(dialog.id))) {
                if (K3(mk3Var)) {
                    return true;
                }
                ub7 s3 = s3(mk3Var);
                if (s3 != null) {
                    int i = s3.g;
                    int i2 = oc7.s5;
                    if ((i & 64) != 0) {
                        int i3 = this.currentAccount;
                        long j = dialog.id;
                        if (pg3.B(j) && (Z0 = oc7.r1(i3).Z0(Integer.valueOf((int) (4294967295L & j)))) != null) {
                            j = Z0.user_id;
                        }
                        if (!s3.h.contains(Long.valueOf(j))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean H5(long j) {
        TLRPC.Chat L0;
        ti3 ti3Var;
        if ((this.U0 <= 1 && ((ti3Var = this.D1) == null || ti3Var.getVisibility() != 0 || TextUtils.isEmpty(this.D1.getFieldText()))) || !pg3.y(j) || (L0 = getMessagesController().L0(Long.valueOf(-j))) == null || sd2.N(L0) || !L0.slowmode_enabled) {
            return true;
        }
        ik.r0(this, jb6.M0(2131745044, null), jb6.M0(2131745036, null), null);
        return false;
    }

    public final void I2() {
        gm.d3(new di3(this, (byte) 14), 300L);
    }

    public final boolean I3(int i) {
        char c;
        if (i == 0) {
            return E3();
        }
        if ((i == 7 || i == 8) && this.T0 == 0) {
            oc7 messagesController = getMessagesController();
            ub7[] ub7VarArr = getMessagesController().N;
            if (i == 8) {
                c = 1;
            } else {
                c = 0;
            }
            if (messagesController.r2(ub7VarArr[c])) {
                return true;
            }
        }
        return false;
    }

    public final boolean I4(mk3 mk3Var) {
        if (mk3Var == null) {
            return false;
        }
        if (K3(mk3Var)) {
            return true;
        }
        ub7 s3 = s3(mk3Var);
        if (s3 != null) {
            int i = s3.g;
            int i2 = oc7.s5;
            if ((i & 64) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean J2(mk3 mk3Var) {
        if (!this.H3.c()) {
            int i = (int) (-this.O);
            int q3 = q3();
            int r3 = r3();
            if (i != 0 && i != q3 && i != r3 && mk3Var.a.canScrollVertically(-1)) {
                if (r3 < i && i < q3) {
                    int L = gm.L(48.0f);
                    int i2 = i - r3;
                    int i3 = L / 2;
                    kq kqVar = mk3Var.b;
                    if (i2 < i3) {
                        kqVar.y(-i2);
                        return true;
                    }
                    kqVar.y(L - i2);
                    return true;
                }
                float f = 1.0f;
                if (this.w3 != 1.0f) {
                    f = Utilities.i((-this.O) / gm.L(81.0f), 1.0f, 0.0f);
                }
                int i4 = (f > this.F0.C0 ? 1 : (f == this.F0.C0 ? 0 : -1));
                kq kqVar2 = mk3Var.b;
                if (i4 < 0) {
                    kqVar2.y(-i);
                    return true;
                }
                kqVar2.y(r3 - i);
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean J3() {
        if (this.E2 == null && this.p2 == null) {
            return true;
        }
        return false;
    }

    public final void J4(int i, long j, TLRPC.Chat chat, boolean z, boolean z2) {
        if (i == 103) {
            getMessagesController().T(1, j, z2);
            return;
        }
        if (chat != null) {
            if (sd2.r0(chat)) {
                getMessagesController().T(0, j, z2);
            } else {
                getMessagesController().c0(-j, getMessagesController().W1(Long.valueOf(getUserConfig().e())), null, z2, false);
            }
        } else {
            getMessagesController().T(0, j, z2);
            if (z && z2) {
                getMessagesController().t(j);
            }
        }
        if (gm.O1()) {
            getNotificationCenter().k(nm7.s, Long.valueOf(j));
        }
        getMessagesController().F(this.Y2);
    }

    public final boolean K2(long j) {
        int i;
        int i2 = this.T0;
        if (i2 != 15 && i2 != 16 && this.j2 == null && this.u2) {
            if (pg3.y(j)) {
                long j2 = -j;
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j2));
                if (sd2.T(L0) && !L0.megagroup) {
                    if (!this.s2) {
                        TLRPC.Chat L02 = oc7.r1(this.currentAccount).L0(Long.valueOf(j2));
                        if ((sd2.n(L02) || L02.megagroup) && (i = this.V0) != 2 && i != 3) {
                            return true;
                        }
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = jb6.M0(2131745330, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    int i3 = this.V0;
                    if (i3 == 3) {
                        heVar.U = jb6.M0(2131743776, null);
                    } else if (i3 == 2) {
                        heVar.U = jb6.M0(2131746320, null);
                    } else {
                        heVar.U = jb6.M0(2131752386, null);
                    }
                    alertDialog$Builder.g(jb6.M0(2131747564, null), null);
                    showDialog(heVar);
                    return false;
                }
                return true;
            } else if (pg3.B(j)) {
                if (this.V0 != 0 || this.W0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String M02 = jb6.M0(2131745330, null);
                    he heVar2 = alertDialog$Builder2.a;
                    heVar2.S = M02;
                    int i4 = this.V0;
                    if (i4 == 3) {
                        heVar2.U = jb6.M0(2131743775, null);
                    } else if (i4 != 0) {
                        heVar2.U = jb6.M0(2131746909, null);
                    } else {
                        heVar2.U = jb6.M0(2131748861, null);
                    }
                    alertDialog$Builder2.g(jb6.M0(2131747564, null), null);
                    showDialog(heVar2);
                    return false;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public final boolean K3(mk3 mk3Var) {
        if (mk3Var != null && I3(mk3Var.s)) {
            return true;
        }
        return false;
    }

    public final void K4(java.util.ArrayList r43, int r44, boolean r45, boolean r46, java.util.HashSet r47) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.K4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    public final void L2(boolean z) {
        cp2 cp2Var;
        TLRPC.ChatFull chatFull;
        boolean z2;
        qk3 qk3Var = this.L1;
        if (qk3Var != null && (cp2Var = this.S1) != null && (chatFull = this.c3) != null) {
            if (this.a3 != 0 && chatFull.requests_pending > 0 && !this.b.f) {
                z2 = true;
            } else {
                z2 = false;
            }
            qk3Var.j(cp2Var, z2, z);
            this.S1.setTitle(jb6.G(this.c3.requests_pending, "CommunityPendingRequestsRow", new Object[0]));
        }
    }

    public final void L3() {
        b31 b31Var = new b31(getParentActivity(), this.resourceProvider);
        b31Var.d(2131624009, new String[0]);
        b31Var.b.setText(jb6.M0(2131742474, null));
        u31.g(this, b31Var, 2750).j();
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void L4(long j, boolean z, ub7 ub7Var, int i, boolean z2) {
        int i2;
        boolean z3;
        int i3;
        boolean F3;
        int i4 = 0;
        if (this.f0[0].s == 0 && y3() && this.f0[0].w == 2) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int K0 = this.f0[0].c.K0();
        if (ub7Var != null) {
            int i5 = ub7Var.j.get(j, Integer.MIN_VALUE);
            if (!z && i5 == Integer.MIN_VALUE) {
                return;
            }
        }
        int i6 = -1;
        if (K0 <= i2 && z2) {
            U4(true, true);
            I2();
            if (this.T1 != null) {
                for (int i7 = 0; i7 < this.T1.size(); i7++) {
                    if (((TLRPC.Dialog) this.T1.get(i7)).id == j) {
                        i3 = i7;
                        z3 = false;
                        break;
                    }
                }
            }
            z3 = false;
        } else {
            z3 = true;
        }
        i3 = -1;
        if (ub7Var != null) {
            LongSparseIntArray longSparseIntArray = ub7Var.j;
            if (z) {
                longSparseIntArray.put(j, i);
            } else {
                longSparseIntArray.delete(j);
            }
            if (z2) {
                getMessagesController().A3(ub7Var);
            }
            F3 = true;
        } else {
            F3 = getMessagesController().F3(j, z, null, -1L);
        }
        if (F3) {
            if (z3) {
                if (this.T0 != 10) {
                    B3(false);
                }
                R4(true, false);
            } else {
                ArrayList o3 = o3(this.currentAccount, this.f0[0].s, this.Y2, false);
                int i8 = 0;
                while (true) {
                    if (i8 >= o3.size()) {
                        break;
                    } else if (((TLRPC.Dialog) o3.get(i8)).id == j) {
                        i6 = i8;
                        break;
                    } else {
                        i8++;
                    }
                }
            }
        }
        if (!z3) {
            if (i3 >= 0) {
                ArrayList arrayList = this.T1;
                if (arrayList != null && i6 >= 0 && i3 != i6) {
                    arrayList.add(i6, (TLRPC.Dialog) arrayList.remove(i3));
                    this.f0[0].y.D();
                    this.f0[0].b(true);
                    mk3 mk3Var = this.f0[0];
                    mi3 mi3Var = mk3Var.c;
                    if (mk3Var.s == 0 && y3() && this.f0[0].w == 2) {
                        i4 = 1;
                    }
                    mi3Var.g1(i4, (int) this.O);
                    return;
                } else if (i6 >= 0 && i3 == i6) {
                    gm.d3(new kh3(this, (byte) 21), 200L);
                    return;
                }
            }
            U4(false, true);
        }
    }

    public final void M2(defpackage.mk3 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.M2(mk3):void");
    }

    public final void M3(int i) {
        Object obj;
        c6c G = this.D0.r0.G(i);
        if (G != null) {
            obj = G.H;
        } else {
            obj = null;
        }
        if (obj instanceof TLRPC.User) {
            int i2 = this.currentAccount;
            long j = ((TLRPC.User) obj).id;
            d f0 = rs0.f0(i2, j);
            if (f0 == null) {
                f0 = ProfileActivity.S2(j);
            }
            presentFragment(f0);
        } else if (obj instanceof k47) {
            k47 k47Var = (k47) obj;
            Bundle bundle = new Bundle();
            int i3 = (k47.B0(k47Var.k) > 0L ? 1 : (k47.B0(k47Var.k) == 0L ? 0 : -1));
            TLRPC.Message message = k47Var.k;
            if (i3 >= 0) {
                bundle.putLong("user_id", k47.B0(message));
            } else {
                bundle.putLong("chat_id", -k47.B0(message));
            }
            bundle.putInt("message_id", k47Var.e1());
            yv1 yv1Var = new yv1(bundle);
            C3(yv1Var, k47Var);
            presentFragment(yv1Var);
        }
    }

    public final void M4() {
        if (this.L0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(cmb.c6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.L0.setBackground(new BitmapDrawable(createBitmap));
        this.L0.setAlpha(0.0f);
        this.L0.setVisibility(0);
        X2();
    }

    public final void N2() {
        getMessagesStorage().getClass();
    }

    public final void N3(int i) {
        Object obj;
        TLRPC.User user;
        jv9 jv9Var = this.D0.r0;
        if (i >= jv9Var.a0 && i < jv9Var.b0) {
            c6c G = jv9Var.G(i);
            if (G != null) {
                obj = G.H;
            } else {
                obj = null;
            }
        } else {
            obj = Boolean.FALSE;
        }
        if (obj instanceof TLRPC.User) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
            String M0 = jb6.M0(2131754145, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.a0(null, null, 2131754144, "\"" + m9c.r(user) + "\"");
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            alertDialog$Builder.j(jb6.M0(2131746054, null), new x92(this, (TLRPC.User) obj, (byte) 22));
            alertDialog$Builder.c(-1);
            alertDialog$Builder.o();
        }
    }

    public final void N4(boolean z) {
        mk3[] mk3VarArr = this.f0;
        if (mk3VarArr != null && !this.U1) {
            for (mk3 mk3Var : mk3VarArr) {
                if (mk3Var.getVisibility() == 0) {
                    if (z) {
                        ki3 ki3Var = mk3Var.y;
                        ki3Var.D();
                        ki3Var.A = true;
                    }
                    mk3Var.b(z);
                    M2(mk3Var);
                }
            }
        }
        ak3 ak3Var = this.A0;
        if (ak3Var != null && ak3Var.getVisibility() == 0) {
            this.A0.c();
        }
    }

    public final void O2() {
        if (this.f0 != null) {
            int F2 = F2();
            int i = 0;
            while (true) {
                mk3[] mk3VarArr = this.f0;
                if (i < mk3VarArr.length) {
                    mk3 mk3Var = mk3VarArr[i];
                    if (mk3Var != null) {
                        jk3 jk3Var = mk3Var.a;
                        jk3Var.setPadding(0, jk3Var.g3, 0, F2);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void O3(mk3 mk3Var, View view, int i) {
        int i2;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof l55) {
            return;
        }
        boolean z = view instanceof hg3;
        if (z) {
            hg3 hg3Var = (hg3) view;
            if (hg3Var.o2) {
                i5(hg3Var.getDialogId(), view);
                return;
            }
        }
        if (e3()) {
            D4(view, i, 0.0f, mk3Var.d);
            return;
        }
        int i3 = this.T0;
        if (i3 == 15 && (view instanceof xib)) {
            mk3Var.d.L();
            return;
        }
        int i4 = 0;
        if ((i3 == 11 || i3 == 13) && i == 1) {
            Bundle l = ts2.l("forImport", true);
            l.putLongArray("result", new long[]{getUserConfig().e()});
            l.putInt("chatType", 4);
            String string = this.arguments.getString("importTitle");
            if (string != null) {
                l.putString("title", string);
            }
            uc5 uc5Var = new uc5(l);
            uc5Var.Z = new ni3(this);
            presentFragment(uc5Var);
            return;
        }
        if ((view instanceof nl3) && ((i2 = mk3Var.s) == 7 || i2 == 8)) {
            xk3 xk3Var = (xk3) mk3Var.d.N.get(0);
            if (xk3Var != null && xk3Var.a == 17) {
                tL_chatlists_chatlistUpdates = xk3Var.i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                ub7 ub7Var = getMessagesController().N[mk3Var.s - 7];
                if (ub7Var != null) {
                    int i5 = ub7Var.a;
                    ?? mz0Var = new mz0(this, false);
                    mz0Var.T1 = -1;
                    mz0Var.X1 = "";
                    mz0Var.Y1 = new ArrayList();
                    mz0Var.a2 = "";
                    mz0Var.c2 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    mz0Var.d2 = arrayList;
                    mz0Var.u2 = -1;
                    mz0Var.x2 = -5;
                    mz0Var.T1 = i5;
                    mz0Var.V1 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    mz0Var.b2 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList arrayList2 = getMessagesController().G0;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i4 >= arrayList2.size()) {
                                break;
                            } else if (((ub7) arrayList2.get(i4)).a == i5) {
                                mz0Var.X1 = ((ub7) arrayList2.get(i4)).b;
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                    mz0Var.a1();
                    showDialog(mz0Var);
                    return;
                }
                return;
            }
        } else if (z && !this.actionBar.y() && !this.H3.c()) {
            ImageReceiver imageReceiver = ((hg3) view).Z1;
            gm.P.set(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x());
        }
        C4(view, i, mk3Var.d);
    }

    public final void O4(mk3 mk3Var) {
        int i;
        tk4 tk4Var;
        if (mk3Var.getVisibility() != 0) {
            return;
        }
        int i2 = mk3Var.d.w;
        if (mk3Var.s == 0 && y3() && mk3Var.a.getChildCount() == 0 && mk3Var.w == 2) {
            ((u46) mk3Var.a.getLayoutManager()).g1(1, (int) this.O);
        }
        mk3Var.d.getClass();
        mk3Var.d.Q();
        int b = mk3Var.d.b();
        if (b == 1 && i2 == 1 && mk3Var.d.d(0) == 5) {
            mk3Var.b(true);
        } else {
            mk3Var.b(false);
            if (b > i2 && (i = this.T0) != 11 && i != 12 && i != 13) {
                mk3Var.E.b(i2);
            }
        }
        try {
            jk3 jk3Var = mk3Var.a;
            if (this.Y2 == 0 && this.a3 == 0) {
                tk4Var = mk3Var.x;
            } else {
                tk4Var = null;
            }
            jk3Var.setEmptyView(tk4Var);
        } catch (Exception e) {
            fc4.g(e, true);
        }
        M2(mk3Var);
    }

    public final void P2() {
        va2 va2Var = this.A1;
        if (va2Var != null) {
            va2Var.setBlurredBottomHeight(this.A1.getInputBubbleHeight() + this.w.d() + gm.L(9.0f) + gm.L(7.0f));
        }
    }

    public final void P3() {
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).w()) {
            finishPreviewFragment();
        } else if (this.T0 == 10) {
            if (this.E2 != null) {
                ArrayList arrayList = this.K2;
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < arrayList.size(); i++) {
                        arrayList2.add(bf7.a(((Long) arrayList.get(i)).longValue(), 0L));
                    }
                    this.E2.q(this, arrayList2, null, false, this.L2, this.M2, this.N2, null);
                }
            }
        } else if (oc7.r1(this.currentAccount).u2()) {
            h5.b(this.currentAccount);
        } else {
            presentFragment(new ContactsActivity(ts2.l("destroyAfterSelect", true)));
        }
    }

    public final void P4() {
        boolean z;
        float f = 0.0f;
        if (this.O != 0.0f && !(z = this.L)) {
            if (z) {
                f = -r3();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.I3, f));
            animatorSet.setInterpolator(d53.f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    public final void Q2() {
        int i;
        mk3 mk3Var;
        boolean z = true;
        float p3 = p3(true);
        ak3 ak3Var = this.A0;
        if (ak3Var != null) {
            if (ak3Var.getAlpha() == p3) {
                z = false;
            }
            float R1 = gm.R1(0.98f, 1.0f, p3);
            this.A0.setAlpha(p3);
            this.A0.setScaleX(R1);
            this.A0.setScaleY(R1);
            ak3 ak3Var2 = this.A0;
            if (p3 > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            ak3Var2.setVisibility(i);
            if (z && (mk3Var = this.f0[0]) != null) {
                mk3Var.a.requestLayout();
            }
        }
        o5();
    }

    public final void Q3() {
        oc7.r1(this.currentAccount).X3.edit().putBoolean("storyhint", false).commit();
    }

    public final void Q4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.Q4(int):void");
    }

    public final void R2() {
        int i;
        int i2;
        float f = this.n.e;
        float R1 = gm.R1(0.2f, 1.0f, f);
        vi3 vi3Var = this.E1;
        int i3 = 8;
        if (vi3Var != null) {
            vi3Var.setScaleX(R1);
            this.E1.setScaleY(R1);
            this.E1.setAlpha(f);
            vi3 vi3Var2 = this.E1;
            if (f > 0.0f) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            vi3Var2.setVisibility(i2);
        }
        va2 va2Var = this.A1;
        if (va2Var != null) {
            va2Var.setAlpha(f);
            va2 va2Var2 = this.A1;
            int i4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i4 > 0) {
                i = 0;
            } else {
                i = 8;
            }
            va2Var2.setVisibility(i);
            this.A1.getFadeView().setAlpha(f);
            View fadeView = this.A1.getFadeView();
            if (i4 > 0) {
                i3 = 0;
            }
            fadeView.setVisibility(i3);
        }
    }

    public final void R3(he[] heVarArr) {
        yp2.e(heVarArr, this, this.currentAccount, this.b3);
    }

    public final void R4(boolean z, boolean z2) {
        int i;
        int i2;
        dj3 dj3Var = this.H3;
        if (dj3Var != null && dj3Var.c()) {
            return;
        }
        if (this.f0[0].s == 0 && y3() && this.f0[0].w == 2) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.L && !z2 && !this.F0.g()) {
            i2 = -gm.L(81.0f);
        } else {
            i2 = 0;
        }
        mk3[] mk3VarArr = this.f0;
        if (z) {
            cw6 cw6Var = mk3VarArr[0].r;
            cw6Var.b = 1;
            cw6Var.l(i, i2, false, false);
            P4();
            return;
        }
        mk3VarArr[0].c.g1(i, i2);
        P4();
    }

    public final void S2() {
        if (this.actionBar == null) {
            return;
        }
        wp4.d(this.actionBar.getBackButton(), Math.max(this.w3, (1.0f - this.b.e) * (1.0f - t3()) * (1.0f - this.c.e)));
    }

    public final void S3(he heVar, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        try {
            heVar.dismiss();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (tLObject != null) {
            this.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            fu fuVar = new fu(this, j, (byte) 14);
            Pattern pattern = ik.a;
            if (getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = getCurrentAccount();
                    Activity parentActivity = getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long e2 = z8c.h(currentAccount).e();
                    TextView textView = new TextView(parentActivity);
                    anb.X(textView, cmb.i5, null);
                    textView.setTextSize(1, 16.0f);
                    if (jb6.a0) {
                        i = 5;
                    } else {
                        i = 3;
                    }
                    textView.setGravity(i | 48);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    alertDialog$Builder.n(frameLayout);
                    pc0 pc0Var = new pc0((ylb) null);
                    pc0Var.s(gm.L(12.0f));
                    bf0 bf0Var = new bf0(parentActivity);
                    bf0Var.setRoundRadius(gm.L(20.0f));
                    if (jb6.a0) {
                        i2 = 5;
                    } else {
                        i2 = 3;
                    }
                    frameLayout.addView(bf0Var, qoe.d(40, 40.0f, i2 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(parentActivity);
                    td4.x(textView2, cmb.D8, null, 1, 20.0f);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    if (jb6.a0) {
                        i3 = 5;
                    } else {
                        i3 = 3;
                    }
                    textView2.setGravity(i3 | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setText(jb6.M0(2131749002, null));
                    boolean z = jb6.a0;
                    if (z) {
                        i4 = 5;
                    } else {
                        i4 = 3;
                    }
                    int i8 = i4 | 48;
                    if (z) {
                        i5 = 21;
                    } else {
                        i5 = 76;
                    }
                    float f = i5;
                    if (z) {
                        i6 = 76;
                    } else {
                        i6 = 21;
                    }
                    frameLayout.addView(textView2, qoe.d(-1, -2.0f, i8, f, 11.0f, i6, 0.0f));
                    if (jb6.a0) {
                        i7 = 5;
                    } else {
                        i7 = 3;
                    }
                    frameLayout.addView(textView, qoe.d(-2, -2.0f, i7 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                    if (user != null) {
                        if (m9c.B(user)) {
                            pc0Var.p = 0.8f;
                            pc0Var.f(12);
                            bf0Var.m(null, null, pc0Var, user);
                        } else if (user.id == e2) {
                            pc0Var.p = 0.8f;
                            pc0Var.f(1);
                            bf0Var.m(null, null, pc0Var, user);
                        } else {
                            pc0Var.p = 1.0f;
                            pc0Var.q(user);
                            bf0Var.f(user, pc0Var);
                        }
                    } else {
                        pc0Var.p(chat);
                        bf0Var.f(chat, pc0Var);
                    }
                    textView.setText(gm.S2(str));
                    alertDialog$Builder.j(jb6.M0(2131749022, null), new l0(fuVar, (byte) 12));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                    showDialog(alertDialog$Builder.a);
                    return;
                }
                return;
            }
            return;
        }
        ik.c0(this.currentAccount, tL_error, this, tL_messages_checkHistoryImportPeer, new Object[0]);
        getNotificationCenter().k(nm7.v1, Long.valueOf(j), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public final void S4(String str, boolean z) {
        k5(true, false, true, false);
        av9 av9Var = this.Z;
        if (av9Var != null) {
            av9Var.b(true);
        }
        zj3 zj3Var = this.Y;
        if (zj3Var != null) {
            zj3Var.r.setText(str);
            this.Y.r.setSelection(str.length());
        }
    }

    public final void T2() {
        float f;
        if (this.j0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        wp4.d(this.h0, mlb.C(f, 1.0f - this.b.e, 1.0f - t3(), 1.0f - this.c.e));
    }

    public final void T3(float f, ValueAnimator valueAnimator) {
        this.f0[0].setTranslationY((1.0f - this.w3) * f);
        this.w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i = 0; i < this.actionBar.getChildCount(); i++) {
            if (this.actionBar.getChildAt(i).getVisibility() == 0 && this.actionBar.getChildAt(i) != this.actionBar.getActionMode() && this.actionBar.getChildAt(i) != this.actionBar.getBackButton()) {
                this.actionBar.getChildAt(i).setAlpha(1.0f - this.w3);
            }
        }
        a3();
        S2();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void T4(float f) {
        mk3[] mk3VarArr;
        this.d0 = f;
        for (mk3 mk3Var : this.f0) {
            jk3 jk3Var = mk3Var.a;
            for (int i = 0; i < jk3Var.getChildCount(); i++) {
                View childAt = jk3Var.getChildAt(i);
                if (childAt != null && RecyclerView.R(childAt) >= mk3Var.d.f + 1) {
                    childAt.setAlpha(f);
                }
            }
        }
    }

    public final void U2() {
        float f;
        if (gda.r.isEmpty()) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        wp4.d(this.g0, mlb.C(f, 1.0f - this.b.e, 1.0f - t3(), 1.0f - this.c.e));
    }

    public final void U3() {
        if (this.f0 == null) {
            return;
        }
        if (!this.U1 && !this.isPaused) {
            this.S3 = false;
            getMessagesController().b5(null);
            N4(false);
            return;
        }
        this.S3 = true;
    }

    public final void U4(boolean z, boolean z2) {
        if (this.f0 != null && this.U1 != z) {
            if (z) {
                this.T1 = new ArrayList(o3(this.currentAccount, this.f0[0].s, this.Y2, false));
            } else {
                this.T1 = null;
            }
            this.U1 = z;
            mk3 mk3Var = this.f0[0];
            mk3Var.d.H = z;
            if (!z && z2) {
                boolean d0 = mk3Var.a.d0();
                mk3[] mk3VarArr = this.f0;
                if (d0) {
                    mk3VarArr[0].a.post(new di3(this, (byte) 6));
                } else {
                    mk3VarArr[0].d.f();
                }
            }
        }
    }

    @Override
    public final void V(float f, int i) {
        r7 r7Var;
        if (i == 3 && (r7Var = this.m0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) r7Var.getIconView().getDrawable();
            if (this.d.f) {
                animatedVectorDrawable.start();
                if (gda.o() != 0) {
                    TLRPC.TL_help_premiumPromo tL_help_premiumPromo = hs6.d0(this.currentAccount).E;
                    String p0 = PremiumPreviewFragment.p0(2);
                    if (tL_help_premiumPromo != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 < tL_help_premiumPromo.video_sections.size()) {
                                if (tL_help_premiumPromo.video_sections.get(i2).equals(p0)) {
                                    break;
                                }
                                i2++;
                            } else {
                                i2 = -1;
                                break;
                            }
                        }
                        if (i2 != -1) {
                            bc4.G(this.currentAccount).X(tL_help_premiumPromo.videos.get(i2), tL_help_premiumPromo, 3, 0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            animatedVectorDrawable.reset();
        }
    }

    public final void V2() {
        float f;
        if (this.T0 != 2) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        wp4.d(this.k0, mlb.C(f, this.f.e, 1.0f - t3(), 1.0f - this.c.e));
        aj3 aj3Var = this.F0;
        if (aj3Var != null) {
            aj3Var.invalidate();
        }
    }

    public final void V3(int i, bu5 bu5Var) {
        CharSequence charSequence;
        if (this.currentAccount != i) {
            bu5Var.u();
            if (getParentActivity() == null) {
                return;
            }
            hk3 hk3Var = this.E2;
            LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
            ArrayList arrayList = this.F2;
            String str = this.G2;
            CharSequence charSequence2 = this.H2;
            ti3 ti3Var = this.D1;
            if (ti3Var != null) {
                charSequence = ti3Var.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.N0(i);
            nk3 nk3Var = new nk3(this.arguments);
            nk3Var.E2 = hk3Var;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    nk3Var.F2 = null;
                } else {
                    nk3Var.F2 = arrayList;
                    nk3Var.G2 = null;
                    nk3Var.O2 = false;
                    if (nk3Var.D1 != null) {
                        nk3Var.D2(charSequence);
                    } else {
                        nk3Var.b4 = charSequence;
                    }
                }
            } else if (str != null) {
                nk3Var.Y4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    nk3Var.H2 = null;
                } else {
                    nk3Var.H2 = charSequence2;
                    nk3Var.G2 = null;
                    nk3Var.F2 = null;
                    if (nk3Var.D1 != null) {
                        nk3Var.D2(charSequence);
                    } else {
                        nk3Var.b4 = charSequence;
                    }
                }
            }
            launchActivity.u0(nk3Var, false, true);
        }
    }

    public final void V4(boolean z) {
        mk3 mk3Var;
        if (gda.o() > 1 && e86.e(32768)) {
            mk3[] mk3VarArr = this.f0;
            if (z) {
                if (mk3VarArr != null && (mk3Var = mk3VarArr[0]) != null) {
                    mk3Var.setLayerType(2, null);
                    this.f0[0].setClipChildren(false);
                    this.f0[0].setClipToPadding(false);
                    this.f0[0].a.setClipChildren(false);
                }
                a aVar = this.actionBar;
                if (aVar != null) {
                    aVar.setLayerType(2, null);
                }
                View view = this.fragmentView;
                if (view != null) {
                    ((ViewGroup) view).setClipChildren(false);
                    this.fragmentView.requestLayout();
                    return;
                }
                return;
            }
            if (mk3VarArr != null) {
                int i = 0;
                while (true) {
                    mk3[] mk3VarArr2 = this.f0;
                    if (i >= mk3VarArr2.length) {
                        break;
                    }
                    mk3 mk3Var2 = mk3VarArr2[i];
                    if (mk3Var2 != null) {
                        mk3Var2.setLayerType(0, null);
                        mk3Var2.setClipChildren(true);
                        mk3Var2.setClipToPadding(true);
                        mk3Var2.a.setClipChildren(true);
                    }
                    i++;
                }
            }
            a aVar2 = this.actionBar;
            if (aVar2 != null) {
                aVar2.setLayerType(0, null);
            }
            aj3 aj3Var = this.F0;
            if (aj3Var != null) {
                aj3Var.setLayerType(0, null);
            }
            View view2 = this.fragmentView;
            if (view2 != null) {
                ((ViewGroup) view2).setClipChildren(true);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void W2() {
        wp4.d(this.m0, mlb.C(this.b.e, 1.0f - t3(), 1.0f - this.c.e, this.d.e));
    }

    public final void W3() {
        oc7.r1(this.currentAccount).h0(null);
    }

    public final void W4(float f) {
        mk3[] mk3VarArr = this.f0;
        int i = 0;
        if (mk3VarArr != null) {
            int paddingTop = mk3VarArr[0].a.getPaddingTop() + ((int) f);
            int i2 = 0;
            while (true) {
                mk3[] mk3VarArr2 = this.f0;
                if (i2 >= mk3VarArr2.length) {
                    break;
                }
                mk3VarArr2[i2].a.setTopGlowOffset(paddingTop);
                i2++;
            }
        }
        if (this.fragmentView != null && f != this.O) {
            this.O = f;
            u31 u31Var = this.q3;
            if (u31Var != null) {
                u31Var.l();
            }
            if (this.G3 != null) {
                float currentActionBarHeight = 1.0f - ((-f) / a.getCurrentActionBarHeight());
                yn ynVar = this.G3;
                float f2 = (int) f;
                float f3 = ynVar.f;
                ynVar.h = f2;
                ynVar.setTranslationY(f3 + f2);
                this.G3.setAlpha(pqe.a(currentActionBarHeight, 0.0f, 1.0f));
                yn ynVar2 = this.G3;
                if (currentActionBarHeight <= 0.0f) {
                    i = 4;
                }
                ynVar2.setVisibility(i);
            }
            a3();
            this.fragmentView.invalidate();
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent, boolean z) {
        dj3 dj3Var;
        sb sbVar;
        ak3 ak3Var;
        boolean z2;
        boolean z3;
        if (!this.s3 && (((dj3Var = this.H3) == null || !dj3Var.c()) && (((sbVar = this.L0) == null || sbVar.getVisibility() != 0) && ((ak3Var = this.A0) == null || !ak3Var.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                ak3 ak3Var2 = this.A0;
                if (ak3Var2 != null && ak3Var2.getTabsCount() >= 2 && this.A0.getCurrentTabId() != this.A0.getFirstTabId()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                ak3 ak3Var3 = this.A0;
                if (ak3Var3 != null && ak3Var3.getTabsCount() >= 2 && this.A0.getCurrentTabId() != this.A0.getLastTabId()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                gda.m(this.currentAccount);
                if (z) {
                    if (!z3 || z2) {
                    }
                } else {
                    return z2;
                }
            }
            return true;
        }
        return false;
    }

    public final void X2() {
        boolean z;
        sb sbVar;
        if (!this.l2 && ((sbVar = this.L0) == null || sbVar.getBackground() == null || this.L0.getAlpha() < 0.01f || this.L0.getVisibility() == 8)) {
            z = true;
        } else {
            z = false;
        }
        fk3 fk3Var = this.K3;
        if (fk3Var != null) {
            ((bj6) fk3Var.a).w.a(z, true);
        }
    }

    public final void X3() {
        if (this.h4.g()) {
            oc7.r1(this.currentAccount).p4(0L, "USERPIC_SETUP");
            q5();
        }
    }

    public final void X4(float f) {
        this.z1 = f;
        x5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (gda.o() != 0) {
            e86.e(32768);
        }
        o5();
    }

    public final void Y2() {
        S2();
        wp4.d(this.l0, (1.0f - this.b.e) * (1.0f - t3()) * (1.0f - this.c.e));
        T2();
        W2();
        U2();
        V2();
    }

    public final void Y3(int i, ArrayList arrayList, boolean z, HashSet hashSet) {
        HashSet hashSet2;
        if (i == 102) {
            getMessagesController().j0 = true;
            if (z) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            K4(arrayList, i, false, false, hashSet2);
            oc7 messagesController = getMessagesController();
            messagesController.j0 = false;
            messagesController.getNotificationCenter().k(nm7.r, Boolean.TRUE);
            getMessagesController().F(this.Y2);
            int i2 = this.Y2;
            if (i2 != 0 && o3(this.currentAccount, this.f0[0].s, i2, false).size() == 0) {
                this.f0[0].a.setEmptyView(null);
                this.f0[0].x.setVisibility(4);
                finishFragment();
                return;
            }
            return;
        }
        K4(arrayList, i, false, false, null);
    }

    public final void Y4(CharSequence charSequence, String str) {
        if (str != null && !str.isEmpty()) {
            this.G2 = str;
            this.H2 = null;
            this.F2 = null;
            if (this.D1 != null) {
                D2(charSequence);
                return;
            } else {
                this.b4 = charSequence;
                return;
            }
        }
        this.G2 = null;
        this.H2 = null;
    }

    public final void Z2() {
        int i;
        if (t3() > 0.5f) {
            i = 2131745440;
        } else {
            i = 2131745547;
        }
        String M0 = jb6.M0(i, null);
        this.Y.r.setContentDescription(M0);
        this.Y.r.setHint(M0);
    }

    public final void Z3(final int i, final long j, TLRPC.Chat chat, final boolean z, final boolean z2) {
        final TLRPC.Chat chat2;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        A3(false);
        if (i == 103 && sd2.T(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || sd2.t0(chat2)) {
                getMessagesController().T(2, j, z2);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i == 102 && (i5 = this.Y2) != 0 && o3(this.currentAccount, this.f0[0].s, i5, false).size() == 1) {
            this.f0[0].x.setVisibility(4);
        }
        int i6 = -1;
        if (i == 102) {
            U4(true, true);
            if (this.T1 != null) {
                i4 = 0;
                while (i4 < this.T1.size()) {
                    if (((TLRPC.Dialog) this.T1.get(i4)).id == j) {
                        break;
                    }
                    i4++;
                }
            }
            i4 = -1;
            I2();
            i2 = i4;
        } else {
            i2 = -1;
        }
        UndoView w3 = w3();
        if (w3 != null) {
            if (i == 103) {
                i3 = 0;
            } else if (z2) {
                i3 = 1;
            } else {
                i3 = 95;
            }
            w3.j(i3, j, new Runnable() {
                @Override
                public final void run() {
                    nk3.this.J4(i, j, chat2, z, z2);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(o3(this.currentAccount, this.f0[0].s, this.Y2, false));
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i7)).id == j) {
                i6 = i7;
                break;
            } else {
                i7++;
            }
        }
        if (i == 102) {
            if (i2 >= 0 && i6 < 0 && (arrayList = this.T1) != null) {
                arrayList.remove(i2);
                this.f0[0].y.D();
                this.f0[0].b(true);
                return;
            }
            U4(false, true);
        }
    }

    public final void Z4(float f) {
        if (gda.o() <= 0) {
            boolean z = e21.a;
        } else if (this.d4 != f) {
            boolean z2 = true;
            if (gda.o() > 1 && e86.e(32768)) {
                z2 = false;
            }
            this.e4 = z2;
            this.d4 = f;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.e4) {
                float f2 = (1.0f - this.d4) * (-gm.L(40.0f));
                aj3 aj3Var = this.F0;
                if (aj3Var != null) {
                    aj3Var.setTranslationX(f2);
                }
                zj3 zj3Var = this.Y;
                if (zj3Var != null) {
                    zj3Var.setTranslationX(f2);
                }
                dj3 dj3Var = this.H3;
                if (dj3Var != null && dj3Var.getFragmentView() != null && !this.E) {
                    this.H3.getFragmentView().setTranslationX(f2);
                    return;
                }
                return;
            }
            float f3 = 1.0f - this.d4;
            float f4 = (-gm.L(4.0f)) * f3;
            float f5 = 1.0f - (f3 * 0.05f);
            aj3 aj3Var2 = this.F0;
            if (aj3Var2 != null) {
                aj3Var2.setScaleX(f5);
                this.F0.setScaleY(f5);
                this.F0.setTranslationX(f4);
                this.F0.setPivotX(0.0f);
                this.F0.setPivotY(0.0f);
            }
            zj3 zj3Var2 = this.Y;
            if (zj3Var2 != null) {
                zj3Var2.setTranslationX(f4);
                this.Y.setScaleX(f5);
                this.Y.setScaleY(f5);
            }
            dj3 dj3Var2 = this.H3;
            if (dj3Var2 != null && dj3Var2.getFragmentView() != null) {
                if (!this.E) {
                    this.H3.getFragmentView().setScaleX(f5);
                    this.H3.getFragmentView().setScaleY(f5);
                    this.H3.getFragmentView().setTranslationX(f4);
                }
                this.H3.getFragmentView().setPivotX(0.0f);
                this.H3.getFragmentView().setPivotY(0.0f);
            }
        }
    }

    public final void a3() {
        float f;
        int i;
        if (this.Y == null) {
            return;
        }
        float a = 1.0f - pqe.a(((-this.O) - r3()) / gm.L(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.w3, this.h.e);
        float f2 = this.b.e;
        if (this.T0 != 2) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float max2 = f * (1.0f - this.c.e) * (1.0f - max) * Math.max(f2, (1.0f - t3()) * a);
        this.Y.setAlpha(max2);
        zj3 zj3Var = this.Y;
        boolean z = false;
        if (max2 > 0.0f) {
            i = 0;
        } else {
            i = 8;
        }
        zj3Var.setVisibility(i);
        if (max2 <= 0.01f) {
            z = true;
        }
        this.f.a(z, true);
    }

    public final void a4() {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", z8c.h(this.currentAccount).e());
        presentFragment(new yv1(bundle));
    }

    public final void a5(mk3 mk3Var, float f) {
        if (this.U != f) {
            this.U = f;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            int i2 = 0;
            if (i == 0) {
                this.V = false;
            }
            this.F0.setOverscroll(f);
            mk3Var.a.setViewsOffset(f);
            jk3 jk3Var = mk3Var.a;
            if (i != 0) {
                i2 = 2;
            }
            jk3Var.setOverScrollMode(i2);
            this.fragmentView.invalidate();
            if (f > gm.L(90.0f) && !this.V) {
                aj3 aj3Var = this.F0;
                ValueAnimator valueAnimator = aj3Var.I0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    aj3Var.i(aj3Var.q0, true);
                    this.V = true;
                    getOrCreateStoryViewer().u(new kh3(this, (byte) 12));
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.Yk));
        hashSet.add(Integer.valueOf(cmb.Xk));
        hashSet.add(Integer.valueOf(cmb.cl));
        hashSet.add(Integer.valueOf(cmb.bl));
        hashSet.add(Integer.valueOf(cmb.al));
        hashSet.add(Integer.valueOf(cmb.Zk));
        hashSet.add(Integer.valueOf(cmb.Si));
        hashSet.add(Integer.valueOf(cmb.f8));
        hashSet.add(Integer.valueOf(cmb.Me));
        hashSet.add(Integer.valueOf(cmb.Ij));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.Le));
        hashSet.add(Integer.valueOf(cmb.Ke));
        hashSet.add(Integer.valueOf(cmb.Je));
        hashSet.add(Integer.valueOf(cmb.Ie));
        hashSet.add(Integer.valueOf(cmb.xj));
        hashSet.add(Integer.valueOf(cmb.vj));
        hashSet.add(Integer.valueOf(cmb.wj));
        hashSet.add(Integer.valueOf(cmb.S8));
        hashSet.add(Integer.valueOf(cmb.e9));
        hashSet.add(Integer.valueOf(cmb.V8));
        hashSet.add(Integer.valueOf(cmb.U8));
        hashSet.add(Integer.valueOf(cmb.T8));
        hashSet.add(Integer.valueOf(cmb.R9));
        hashSet.add(Integer.valueOf(cmb.Q9));
        hashSet.add(Integer.valueOf(cmb.f9));
        hashSet.add(Integer.valueOf(cmb.l9));
        hashSet.add(Integer.valueOf(cmb.Yl));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.d9));
        hashSet.add(Integer.valueOf(cmb.c9));
        hashSet.add(Integer.valueOf(cmb.b9));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.L7));
        hashSet.add(Integer.valueOf(cmb.M7));
        hashSet.add(Integer.valueOf(cmb.g9));
        hashSet.add(Integer.valueOf(cmb.m9));
        hashSet.add(Integer.valueOf(cmb.k9));
        hashSet.add(Integer.valueOf(cmb.X8));
        hashSet.add(Integer.valueOf(cmb.n9));
        hashSet.add(Integer.valueOf(cmb.i9));
        hashSet.add(Integer.valueOf(cmb.j9));
        hashSet.add(Integer.valueOf(cmb.K7));
        hashSet.add(Integer.valueOf(cmb.a8));
        hashSet.add(Integer.valueOf(cmb.Z7));
        hashSet.add(Integer.valueOf(cmb.Y7));
        hashSet.add(Integer.valueOf(cmb.X7));
        hashSet.add(Integer.valueOf(cmb.W7));
        hashSet.add(Integer.valueOf(cmb.V7));
        hashSet.add(Integer.valueOf(cmb.U7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.J7));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.o6));
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.j7));
        hashSet.add(Integer.valueOf(cmb.pk));
        hashSet.add(Integer.valueOf(cmb.Y5));
        hashSet.add(Integer.valueOf(cmb.A9));
        hashSet.add(Integer.valueOf(cmb.y9));
        hashSet.add(Integer.valueOf(cmb.z9));
        hashSet.add(Integer.valueOf(cmb.x9));
        hashSet.add(Integer.valueOf(cmb.w9));
        hashSet.add(Integer.valueOf(cmb.v9));
        hashSet.add(Integer.valueOf(cmb.u9));
        hashSet.add(Integer.valueOf(cmb.t9));
        hashSet.add(Integer.valueOf(cmb.s9));
        hashSet.add(Integer.valueOf(cmb.r9));
        hashSet.add(Integer.valueOf(cmb.q9));
        hashSet.add(Integer.valueOf(cmb.p9));
        hashSet.add(Integer.valueOf(cmb.o9));
        hashSet.add(Integer.valueOf(cmb.h9));
        hashSet.add(Integer.valueOf(cmb.Y8));
        hashSet.add(Integer.valueOf(cmb.W8));
        hashSet.add(Integer.valueOf(cmb.a9));
        hashSet.add(Integer.valueOf(cmb.Z8));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.T9));
        hashSet.add(Integer.valueOf(cmb.S9));
        hashSet.add(Integer.valueOf(cmb.xi));
        hashSet.add(Integer.valueOf(cmb.H5));
        hashSet.add(Integer.valueOf(cmb.D8));
        hashSet.add(Integer.valueOf(cmb.F8));
    }

    public final void b3() {
        int i;
        float f;
        int i2;
        int i3 = 8;
        if (this.a0 != null) {
            if (this.b0 != null) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            float f2 = f * this.b.e;
            float R1 = gm.R1(0.98f, 1.0f, f2);
            this.a0.setScaleX(R1);
            this.a0.setScaleY(R1);
            this.a0.setAlpha(f2);
            nu9 nu9Var = this.a0;
            if (f2 > 0.0f) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            nu9Var.setVisibility(i2);
        }
        vgc vgcVar = this.b0;
        fn0 fn0Var = this.s;
        if (vgcVar != null) {
            float f3 = 1.0f - fn0Var.e;
            vgcVar.setAlpha(f3);
            vgc vgcVar2 = this.b0;
            if (f3 > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            vgcVar2.setVisibility(i);
        }
        uh4 uh4Var = this.c0;
        if (uh4Var != null) {
            float f4 = fn0Var.e;
            uh4Var.setAlpha(f4);
            uh4 uh4Var2 = this.c0;
            if (f4 > 0.0f) {
                i3 = 0;
            }
            uh4Var2.setVisibility(i3);
        }
    }

    public final void b4(TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, this.currentAccount, tL_attachMenuBot, null, true);
        hs6 d0 = hs6.d0(this.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = d0.b;
        if (tL_attachMenuBots != null) {
            d0.getMessagesStorage().a.c(new o77(d0, tL_attachMenuBots, d0.a, d0.e, (byte) 7));
        }
    }

    public final void b5() {
        getContactsController().B();
        ys ysVar = new ys(getParentActivity(), this.currentAccount, getResourceProvider(), new rd3(this, r1, (byte) 4), new xf2(r1, (byte) 29));
        my0 i = wi8.i(getParentActivity(), false, 1, getResourceProvider());
        i.O = ysVar;
        i.U0 = (byte) 49;
        i.show();
        my0[] my0VarArr = {i};
        i.L(cmb.g5);
    }

    public final void c3(boolean z) {
        int i;
        int i2;
        if (this.D0 != null && this.actionBar != null) {
            int i3 = gm.n;
            int measuredHeight = this.actionBar.getMeasuredHeight() + gm.L(this.a);
            if (this.b0 != null) {
                i = gm.L(50.0f);
            } else {
                i = 0;
            }
            int i4 = measuredHeight + i;
            qk3 qk3Var = this.L1;
            if (qk3Var != null) {
                i2 = (int) qk3Var.c(gm.L(7.0f));
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            sj3 sj3Var = this.D0;
            SparseArray sparseArray = sj3Var.h;
            sj3Var.X0 = i5;
            sj3Var.Y0 = i3;
            pu9 pu9Var = sj3Var.b0;
            if (z) {
                pu9Var.q1(0, i5, 0, i3);
            } else {
                pu9Var.setPadding(0, i5, 0, i3);
            }
            sj3Var.P0.j(sj3Var.X0, sj3Var.Y0, z);
            iv9 iv9Var = sj3Var.c0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) iv9Var.getLayoutParams();
            int i6 = marginLayoutParams.topMargin;
            int i7 = sj3Var.X0;
            if (i6 != i7 || marginLayoutParams.bottomMargin != sj3Var.Y0) {
                marginLayoutParams.topMargin = i7;
                marginLayoutParams.bottomMargin = sj3Var.Y0;
                iv9Var.requestLayout();
            }
            vv9.Q(sj3Var.i0, sj3Var.l0, sj3Var.X0, sj3Var.Y0, z);
            vv9.Q(sj3Var.n0, sj3Var.q0, sj3Var.X0, sj3Var.Y0, z);
            vv9.Q(sj3Var.u0, sj3Var.x0, sj3Var.X0, sj3Var.Y0, z);
            ai8 ai8Var = sj3Var.s0;
            int i8 = sj3Var.X0;
            int i9 = sj3Var.Y0;
            ai8Var.setClipToPadding(false);
            q7c q7cVar = ai8Var.c;
            ai8Var.K = z;
            ai8Var.setPadding(0, i8, 0, i9);
            if (z) {
                q7cVar.q1(0, i8, 0, i9);
            } else {
                q7cVar.setPadding(0, i8, 0, i9);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) q7cVar.getLayoutParams();
            marginLayoutParams2.topMargin = -i8;
            marginLayoutParams2.bottomMargin = -i9;
            ai8Var.K = false;
            ju9 ju9Var = sj3Var.J0;
            if (ju9Var != null) {
                ju9Var.b(sj3Var.X0, sj3Var.Y0, z);
            }
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) sparseArray.valueAt(i10);
                if (view instanceof ch4) {
                    ((ch4) view).j(sj3Var.X0, sj3Var.Y0, z);
                }
            }
            for (int i11 = 0; i11 < sj3Var.getChildCount(); i11++) {
                if (sj3Var.getChildAt(i11) instanceof ch4) {
                    ((ch4) sj3Var.getChildAt(i11)).j(sj3Var.X0, sj3Var.Y0, z);
                }
            }
        }
    }

    public final void c4(TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = oc7.r1(this.currentAccount).n1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new eo0(this, tL_attachMenuBot, launchActivity, (byte) 22), 66);
    }

    public final boolean c5(defpackage.hg3 r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.c5(hg3):boolean");
    }

    @Override
    public final boolean canBeginSlide() {
        ak3 ak3Var;
        if (!this.H3.c()) {
            if (this.T0 == 3 && (ak3Var = this.A0) != null && ak3Var.getVisibility() == 0 && this.A0.L > 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean closeLastFragment() {
        if (this.H3.c()) {
            this.H3.a();
            sj3 sj3Var = this.D0;
            if (sj3Var != null) {
                sj3Var.S();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final a createActionBar(Context context) {
        x20 x20Var = new x20(this, context, this.resourceProvider, (byte) 2);
        x20Var.setAllowOverlayTitle(true);
        x20Var.H0 = true;
        if (x20Var.G0 == null) {
            a6 a6Var = new a6(x20Var.getContext(), (byte) 0);
            x20Var.G0 = a6Var;
            x20Var.addView(a6Var);
        }
        anb.l(x20Var, 3, cmb.s8, getResourceProvider());
        anb.a(x20Var, cmb.y8, getResourceProvider(), true);
        anb.l(x20Var, 1, cmb.u8, getResourceProvider());
        anb.b(x20Var, cmb.x8, getResourceProvider(), true);
        if (x20Var.y1 == null) {
            b6 b6Var = new b6(x20Var, x20Var.getContext(), x20Var.K0, x20Var.P0);
            x20Var.y1 = b6Var;
            b6Var.setClipChildren(false);
            x20Var.addView(x20Var.y1);
        }
        x20Var.getAdditionalSubTitleOverlayContainer().setTranslationX(gm.L(4.0f));
        x20Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-gm.L(3.0f));
        if (!this.inPreviewMode && (!gm.O1() || this.Y2 == 0 || F3())) {
            return x20Var;
        }
        x20Var.setOccupyStatusBar(false);
        return x20Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r45) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.createView(android.content.Context):android.view.View");
    }

    public final void d3() {
        if (this.L1 != null) {
            float R1 = gm.R1(0.98f, 1.0f, 1.0f);
            this.L1.setAlpha(1.0f);
            this.L1.setScaleX(R1);
            this.L1.setScaleY(R1);
            this.L1.setVisibility(0);
        }
    }

    public final void d4(TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.G0(launchActivity, this.currentAccount, tL_attachMenuBot, null, true);
        } else {
            quc.a(getParentActivity(), new iu(this, tL_attachMenuBot, launchActivity, (byte) 13), null);
        }
    }

    public final void d5(boolean z) {
        float f;
        this.c.a(z, true);
        if (this.n0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.V3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.V3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.V3 = animatorSet2;
        animatorSet2.setDuration(180L);
        r7 r7Var = this.n0;
        if (z) {
            r7Var.setVisibility(0);
        } else {
            r7Var.setSelected(false);
            Drawable background = this.n0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        r7 r7Var2 = this.n0;
        Property property = View.ALPHA;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(r7Var2, property, f));
        this.V3.playTogether(arrayList);
        this.V3.addListener(new jj3(this, z, (byte) 1));
        this.V3.start();
    }

    @Override
    public final void didReceivedNotification(int r29, int r30, java.lang.Object... r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (!(dialog instanceof wx0) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public boolean e3() {
        if (this.T0 == 10) {
            return true;
        }
        return false;
    }

    public final void e4(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        wx0.l(this.currentAccount, tL_attachMenuBot.bot_id, null);
    }

    public final void e5() {
        if (!this.B0 && getMessagesController().L0 && getMessagesController().n3 && this.A0 != null && getMessagesController().S0().isEmpty() && !this.isPaused && getUserConfig().Q && !this.inPreviewMode) {
            SharedPreferences d1 = oc7.d1();
            if (!d1.getBoolean("filterhint", false)) {
                d1.edit().putBoolean("filterhint", true).apply();
                gm.d3(new di3(this, (byte) 8), 1000L);
            }
        }
    }

    public final void f3() {
        if (gm.O1()) {
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.o(true);
            }
            TLObject tLObject = this.Z1;
            if (tLObject != null) {
                sj3 sj3Var = this.D0;
                if (sj3Var != null) {
                    sj3Var.e0.Q(this.Y1, tLObject);
                }
                this.Z1 = null;
                return;
            }
            return;
        }
        this.X1 = true;
    }

    public final void f4(float f, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.w3 = floatValue;
        this.f0[0].setTranslationY((-f) * floatValue);
        for (int i = 0; i < this.actionBar.getChildCount(); i++) {
            if (this.actionBar.getChildAt(i).getVisibility() == 0 && this.actionBar.getChildAt(i) != this.actionBar.getActionMode() && this.actionBar.getChildAt(i) != this.actionBar.getBackButton()) {
                this.actionBar.getChildAt(i).setAlpha(1.0f - this.w3);
            }
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        a3();
        S2();
    }

    public final void f5() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.f5():void");
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        bu5 bu5Var = this.M0;
        if (bu5Var != null) {
            bu5Var.u();
        }
    }

    public final void g3() {
        a aVar = this.actionBar;
        if (aVar != null && aVar.o0) {
            aVar.o(true);
            this.s3 = false;
            s5(true, true);
        }
    }

    public final void g4() {
        presentFragment(new PrivacySettingsActivity());
        gm.f3(this.parentLayout, "newChatsRow");
    }

    public final void g5() {
        if (this.Y3 == null) {
            for (String str : getMessagesController().u3) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = jb6.M0(2131749076, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    heVar.U = gm.S2(jb6.M0(2131749077, null));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                    alertDialog$Builder.j(jb6.M0(2131749307, null), new nh3(this, (byte) 6));
                    showDialog(heVar, new rh3(this, (byte) 0));
                    this.Y3 = str;
                    return;
                }
            }
        }
    }

    @Override
    public final ok5 getBackButtonState() {
        if (!F3() && !this.H3.f) {
            return ok5.b;
        }
        return ok5.a;
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z, boolean z2, float f) {
        int i;
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d4, 1.0f);
            this.g4 = ofFloat;
            return ofFloat;
        }
        if (getLayoutContainer() != null && getLayoutContainer().getMeasuredWidth() > 0) {
            i = (int) Utilities.i((200.0f / getLayoutContainer().getMeasuredWidth()) * f, 200.0f, 80.0f);
        } else {
            i = 150;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.d4, 1.0f);
        this.g4 = ofFloat2;
        ofFloat2.addUpdateListener(new ph3(this, (byte) 1));
        this.g4.setInterpolator(d53.g);
        this.g4.setDuration(i);
        this.g4.start();
        return this.g4;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.getThemeDescriptions():java.util.ArrayList");
    }

    public final void h3(String str) {
        if (this.actionBar.e(str)) {
            return;
        }
        r6 q = this.actionBar.q(str);
        boolean z = this.X;
        ArrayList arrayList = this.k1;
        if (z) {
            ImageView imageView = new ImageView(getParentActivity());
            this.i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.i1.setImageDrawable(new ee0(true));
            anb.s(this.i1, cmb.x8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.i1;
            int i = cmb.y8;
            anb.R(imageView2, cmb.f0(getThemedColor(i), 1, -1), null, anb.M(i), getResourceProvider());
            this.i1.setOnClickListener(new mh3(this, (byte) 6));
            q.addView(this.i1, qoe.r(54, 54, 16));
            arrayList.add(this.i1);
        }
        NumberTextView numberTextView = new NumberTextView(q.getContext());
        this.j1 = numberTextView;
        int i2 = 18;
        numberTextView.setTextSize(18);
        this.j1.setTypeface(gm.o());
        this.j1.setTextColor(getThemedColor(cmb.x8));
        NumberTextView numberTextView2 = this.j1;
        if (!this.X) {
            i2 = 72;
        }
        q.addView(numberTextView2, qoe.m(1.0f, 0, -1, i2, 0, 0));
        this.j1.setOnTouchListener(new w02((byte) 5));
        this.m1 = q.g(100, 2131232299, gm.L(48.0f));
        this.n1 = q.g(104, 2131232262, gm.L(48.0f));
        this.o1 = q.g(107, 2131232057, gm.L(48.0f));
        this.l1 = q.h(102, 2131232114, gm.L(48.0f), jb6.M0(2131751535, null));
        r7 h = q.h(0, 2131231248, gm.L(48.0f), jb6.M0(2131754838, null));
        q.addView(new View(getParentActivity()), qoe.o(5, -1));
        this.s1 = h.e(105, 2131232057, jb6.M0(2131754137, null));
        this.p1 = h.e(108, 2131232299, jb6.M0(2131751390, null));
        this.q1 = h.e(109, 2131232052, jb6.M0(2131750749, null));
        this.r1 = h.e(110, 2131232335, jb6.M0(2131750647, null));
        this.u1 = h.e(101, 2131232221, jb6.M0(2131748438, null));
        this.t1 = h.e(103, 2131232098, jb6.M0(2131752026, null));
        this.v1 = h.e(106, 2131232073, jb6.M0(2131753657, null));
        this.n1.setOnLongClickListener(new uh3(this, (byte) 1));
        arrayList.add(this.m1);
        arrayList.add(this.o1);
        arrayList.add(this.n1);
        arrayList.add(this.l1);
        arrayList.add(h);
        p5(false);
    }

    public final void h4() {
        h5.c(this.currentAccount, getResourceProvider(), getParentActivity());
    }

    public final void h5(long r13, android.view.View r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.h5(long, android.view.View):void");
    }

    public final void i3() {
        int i;
        sj3 sj3Var = this.D0;
        if ((sj3Var != null && sj3Var.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.p2 != null) {
            i = 2;
        } else if (!this.n2) {
            i = 1;
        } else {
            i = 0;
        }
        sj3 sj3Var2 = new sj3(this, getParentActivity(), this, i, this.T0, this.Y2, this.a3, new k6d(this, (byte) 29));
        this.D0 = sj3Var2;
        this.glassEngine.c(sj3Var2);
        ((gk3) this.fragmentView).addView(this.D0, this.C0);
        sj3 sj3Var3 = this.D0;
        sj3Var3.e0.V = new uj3(this);
        sj3Var3.l0.setOnItemClickListener(new nh3(this, (byte) 1));
        this.D0.q0.setOnItemClickListener(new nh3(this, (byte) 2));
        this.D0.x0.setOnItemClickListener(new qh3(this, (byte) 0));
        this.D0.q0.setOnItemLongClickListener(new nh3(this, (byte) 3));
        this.D0.b0.setOnItemClickListener(new nh3(this, (byte) 4));
        this.D0.b0.setOnItemLongClickListener(new ni3(this));
        this.D0.setFilteredSearchViewDelegate(new nh3(this, (byte) 5));
        this.D0.setAlpha(0.0f);
        this.D0.setScaleX(1.05f);
        this.D0.setScaleY(1.05f);
        this.D0.setVisibility(8);
        this.D0.setBlurredBackgroundDrawableFactory(this.v4);
    }

    public final void i4() {
        PasskeysActivity.f0(this.currentAccount, this.resourceProvider, getParentActivity(), true);
    }

    public final void i5(long j, View view) {
        String str;
        u31 K;
        int i = -this.N3;
        this.N3 = i;
        gm.A3(i, view, null);
        xx0.APP_ERROR.a();
        if (j >= 0) {
            str = m9c.r(oc7.r1(this.currentAccount).W1(Long.valueOf(j)));
        } else {
            str = "";
        }
        if (getMessagesController().H3()) {
            K = c41.b0(this).Q(2131624211, 36, gm.S2(jb6.a0(null, null, 2131743447, str)));
        } else {
            K = c41.b0(this).K(2131624211, gm.S2(jb6.a0(null, null, 2131743447, str)), jb6.M0(2131743446, null), new kh3(this, (byte) 15));
        }
        K.j();
    }

    @Override
    public final boolean isLightStatusBar() {
        dj3 dj3Var;
        if (!this.l2 && (dj3Var = this.H3) != null && dj3Var.getFragment() != null) {
            return this.H3.getFragment().isLightStatusBar();
        }
        if (on2.h(getThemedColor(cmb.c6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final nz4 j() {
        return this.r4;
    }

    public final void j3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.z0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i = 0; i < 2; i++) {
                undoViewArr[i] = new nj3(this, parentActivity);
                FrameLayout.LayoutParams d = qoe.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.m4 + this.o4 + d.bottomMargin;
                UndoView undoView = undoViewArr[i];
                int i2 = this.y0 + 1;
                this.y0 = i2;
                ((gk3) this.fragmentView).addView(undoView, i2, d);
            }
        }
    }

    public final void j4() {
        oc7.r1(this.currentAccount).p4(0L, "SETUP_PASSKEY");
        q5();
    }

    public final void j5(boolean z) {
        if (this.f0 != null && this.O3 != z) {
            this.O3 = z;
            int i = 0;
            while (true) {
                mk3[] mk3VarArr = this.f0;
                if (i < mk3VarArr.length) {
                    if (z) {
                        mk3VarArr[i].a.setScrollbarFadingEnabled(false);
                    }
                    this.f0[i].a.setVerticalScrollBarEnabled(z);
                    if (z) {
                        this.f0[i].a.setScrollbarFadingEnabled(true);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void k3(final long j, final long j2, boolean z, final sxb sxbVar) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String M0;
        String b0;
        String M02;
        TLRPC.TL_forumTopic f;
        if (K2(j)) {
            int i = this.T0;
            if (i != 11 && i != 12 && i != 13) {
                if (z && ((this.h2 != null && this.i2 != null) || this.j2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (pg3.B(j)) {
                            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(getMessagesController().Z0(Integer.valueOf((int) (4294967295L & j))).user_id));
                            if (W1 != null) {
                                M0 = jb6.M0(2131745330, null);
                                b0 = jb6.b0(this.h2, m9c.r(W1));
                                M02 = jb6.M0(2131745374, null);
                            } else {
                                return;
                            }
                        } else if (pg3.D(j)) {
                            if (j == getUserConfig().e()) {
                                M0 = jb6.M0(2131745330, null);
                                b0 = jb6.b0(this.i2, jb6.M0(2131745635, null));
                                M02 = jb6.M0(2131745374, null);
                            } else {
                                TLRPC.User W12 = getMessagesController().W1(Long.valueOf(j));
                                if (W12 != null && this.h2 != null) {
                                    M0 = jb6.M0(2131745330, null);
                                    b0 = jb6.b0(this.h2, m9c.r(W12));
                                    M02 = jb6.M0(2131745374, null);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j));
                            if (L0 != null) {
                                String str = L0.title;
                                if (j2 != 0 && (f = getMessagesController().g4.f(L0.id, j2)) != null) {
                                    str = ((Object) str) + " " + f.title;
                                }
                                if (this.j2 != null) {
                                    M0 = jb6.M0(2131754363, null);
                                    b0 = jb6.b0(this.j2, str);
                                    M02 = jb6.M0(2131754483, null);
                                } else {
                                    M0 = jb6.M0(2131745330, null);
                                    b0 = jb6.b0(this.i2, str);
                                    M02 = jb6.M0(2131745374, null);
                                }
                            } else {
                                return;
                            }
                        }
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = gm.S2(b0);
                        alertDialog$Builder.j(M02, new ee() {
                            @Override
                            public final void r(he heVar2, int i2) {
                                nk3.this.k3(j, j2, false, sxbVar);
                            }
                        });
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        if (showDialog(heVar) == null) {
                            heVar.show();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == 15) {
                    Runnable of2Var = new of2(this, j, new n40(this, j, j2, sxbVar, (byte) 2), (byte) 21);
                    if (j < 0) {
                        m5(getMessagesController().L0(Long.valueOf(-j)), of2Var, null);
                        return;
                    }
                    TLRPC.User W13 = getMessagesController().W1(Long.valueOf(j));
                    TLRPC.User W14 = getMessagesController().W1(Long.valueOf(this.I));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String a0 = jb6.a0(null, null, 2131754039, m9c.k(W13, true), m9c.k(W14, true));
                    he heVar2 = alertDialog$Builder2.a;
                    heVar2.S = a0;
                    heVar2.U = TextUtils.concat(gm.S2(jb6.a0(null, null, 2131754040, m9c.k(W13, true), m9c.k(W14, true))));
                    alertDialog$Builder2.j(jb6.a0("Send", null, 2131745374, new Object[0]), new wm2(of2Var, (byte) 25));
                    alertDialog$Builder2.g(jb6.a0("Cancel", null, 2131752542, new Object[0]), new dq9((byte) 14));
                    showDialog(heVar2);
                    return;
                } else if (this.E2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bf7.a(j, j2));
                    if (this.E2.q(this, arrayList, null, false, this.L2, this.M2, this.N2, sxbVar) && this.k2) {
                        this.E2 = null;
                        return;
                    }
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            if (pg3.D(j)) {
                TLRPC.User W15 = getMessagesController().W1(Long.valueOf(j));
                if (!W15.mutual_contact) {
                    UndoView w3 = w3();
                    if (w3 != null) {
                        w3.j(45, j, null);
                        return;
                    }
                    return;
                }
                user = W15;
                chat = null;
            } else {
                TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(-j));
                if (sd2.N(L02) && sd2.w(1, L02)) {
                    chat = L02;
                    user = null;
                } else {
                    UndoView w32 = w3();
                    if (w32 != null) {
                        w32.j(46, j, null);
                        return;
                    }
                    return;
                }
            }
            he heVar3 = new he(3, null, getParentActivity());
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().i1(j);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new ii3(this, heVar3, user, chat, j, tL_messages_checkHistoryImportPeer));
            try {
                heVar3.q(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void k4() {
        oc7.r1(this.currentAccount).p4(0L, "PREMIUM_GRACE");
        q5();
    }

    public final void k5(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.k5(boolean, boolean, boolean, boolean):void");
    }

    public final void l3(Canvas canvas, int i) {
        tk5 tk5Var;
        if (this.parentLayout != null && this.actionBar != null) {
            float max = Math.max(this.e.e, t3());
            float f = 1.0f;
            float f2 = 1.0f - this.z1;
            float f3 = max * f2 * f2;
            int i2 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
            if (i2 != 0) {
                if (-1 >= i) {
                    f = 0.0f;
                    i = -1;
                }
                if (f > 0.0f && i2 > 0 && i > 0 && (tk5Var = this.parentLayout) != null) {
                    ((ActionBarLayout) tk5Var).n(canvas, (int) (f * 255.0f * f3), i);
                }
            }
        }
    }

    public final void l4(TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        oc7.r1(this.currentAccount).p4(0L, tL_pendingSuggestion.suggestion);
        q5();
    }

    public final void l5() {
        int i;
        int i2;
        Long l;
        if (this.N0 == null && !gda.w) {
            if (!this.L || this.F0.g()) {
                mz9[] mz9VarArr = new mz9[1];
                TLRPC.User f = z8c.h(z8c.t0).f();
                lka titleTextView = this.actionBar.getTitleTextView();
                if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                    this.F3.f();
                    Drawable drawable = this.F3.f[0];
                    Rect rect = gm.Q;
                    rect.set(titleTextView.getRightDrawable().getBounds());
                    rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
                    int L = (-(this.actionBar.getHeight() - rect.centerY())) - gm.L(16.0f);
                    i = gm.L(4.0f) + (rect.centerX() - gm.L(16.0f));
                    yn ynVar = this.G3;
                    if (ynVar != null) {
                        ynVar.b(rect.centerX(), rect.centerY());
                    }
                    i2 = L;
                } else {
                    i = 0;
                    i2 = 0;
                }
                ej3 ej3Var = new ej3(this, this, getParentActivity(), Integer.valueOf(i), getResourceProvider(), mz9VarArr);
                if (f != null && pg3.g(f.emoji_status) > 0) {
                    ej3Var.setExpireDateHint(pg3.g(f.emoji_status));
                }
                Long l2 = this.D3;
                if (l2 != null) {
                    ej3Var.setSelected(l2);
                } else {
                    Drawable drawable2 = this.F3.f[0];
                    if (drawable2 instanceof vm) {
                        l = Long.valueOf(((vm) drawable2).h());
                    } else {
                        l = null;
                    }
                    ej3Var.setSelected(l);
                }
                ej3Var.setSaveState(1);
                ej3Var.y(this.F3, titleTextView);
                fj3 fj3Var = new fj3(this, ej3Var);
                this.N0 = fj3Var;
                mz9VarArr[0] = fj3Var;
                fj3Var.showAsDropDown(this.actionBar, gm.L(16.0f), i2, 48);
                mz9VarArr[0].a();
            }
        }
    }

    public final void m3(long j, boolean z) {
        if (this.f0 != null) {
            int i = 0;
            while (true) {
                mk3[] mk3VarArr = this.f0;
                if (i < mk3VarArr.length) {
                    int childCount = mk3VarArr[i].a.getChildCount();
                    int i2 = 0;
                    while (true) {
                        if (i2 < childCount) {
                            View childAt = this.f0[i].a.getChildAt(i2);
                            if (childAt instanceof hg3) {
                                hg3 hg3Var = (hg3) childAt;
                                if (hg3Var.getDialogId() == j) {
                                    hg3Var.d0(z, true);
                                    break;
                                }
                            }
                            i2++;
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void m4() {
        oc7.r1(this.currentAccount).p4(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        q5();
    }

    public final void m5(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.m5(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final void n4(mk0 mk0Var) {
        ArrayList arrayList = mk0Var.c;
        if (arrayList.size() == 1) {
            ux4 ux4Var = new ux4(getParentActivity(), this.currentAccount, ((TLRPC.User) arrayList.get(0)).id, null, null);
            ux4Var.a1(true);
            showDialog(ux4Var);
            return;
        }
        yw4.f1(false, mk0Var);
    }

    public final void n5(boolean z) {
        mk3[] mk3VarArr;
        char c;
        char c2;
        int i = 0;
        int i2 = 0;
        while (true) {
            mk3VarArr = this.f0;
            if (i2 >= mk3VarArr.length) {
                break;
            }
            mk3VarArr[i2].a.D0();
            i2++;
        }
        if (z && mk3VarArr.length > 1) {
            c = 1;
        } else {
            c = 0;
        }
        int i3 = mk3VarArr[c].h;
        if (i3 >= 0 && i3 < getMessagesController().S0().size()) {
            ub7 ub7Var = (ub7) getMessagesController().S0().get(this.f0[c].h);
            boolean d = ub7Var.d();
            mk3[] mk3VarArr2 = this.f0;
            if (d) {
                mk3 mk3Var = mk3VarArr2[c];
                mk3Var.s = this.T0;
                jk3 jk3Var = mk3Var.a;
                int i4 = jk3.C3;
                jk3Var.D1();
            } else {
                if (mk3VarArr2[c ^ 1].s == 7) {
                    mk3VarArr2[c].s = 8;
                } else {
                    mk3VarArr2[c].s = 7;
                }
                mk3VarArr2[c].a.setScrollEnabled(true);
                oc7 messagesController = getMessagesController();
                if (this.f0[c].s == 8) {
                    c2 = 1;
                } else {
                    c2 = 0;
                }
                ub7[] ub7VarArr = messagesController.N;
                ub7 ub7Var2 = ub7VarArr[c2];
                if (ub7Var2 != ub7Var) {
                    ub7VarArr[c2] = ub7Var;
                    int i5 = c2 ^ 1;
                    if (ub7VarArr[i5] == ub7Var) {
                        ub7VarArr[i5] = null;
                    }
                    if (ub7VarArr[c2] == null) {
                        if (ub7Var2 != null) {
                            ub7Var2.k.clear();
                            ub7Var2.l.clear();
                        }
                    } else {
                        messagesController.b5(null);
                    }
                }
            }
            mk3[] mk3VarArr3 = this.f0;
            if (mk3VarArr3.length > 1) {
                mk3VarArr3[1].F = ub7Var.p;
            }
            mk3 mk3Var2 = mk3VarArr3[c];
            qi3 qi3Var = mk3Var2.d;
            qi3Var.h = mk3Var2.s;
            qi3Var.f();
            mk3 mk3Var3 = this.f0[c];
            mi3 mi3Var = mk3Var3.c;
            if (mk3Var3.s == 0 && y3() && this.f0[c].w == 2) {
                i = 1;
            }
            mi3Var.g1(i, (int) this.O);
            M2(this.f0[c]);
        }
    }

    public final java.util.ArrayList o3(int r11, int r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.o3(int, int, int, boolean):java.util.ArrayList");
    }

    public final void o4() {
        ok0 a = ok0.a(this.currentAccount);
        int i = a.a;
        Set<String> set = a.d;
        mk0 mk0Var = a.c;
        if (mk0Var != null && !set.contains(mk0Var.a)) {
            set.add(a.c.a);
            SharedPreferences.Editor edit = oc7.r1(i).X3.edit();
            edit.putStringSet("bday_hidden", set);
            edit.apply();
            nm7.f(i).k(nm7.k5, new Object[0]);
        }
        oc7.r1(this.currentAccount).p4(0L, "BIRTHDAY_CONTACTS_TODAY");
        q5();
        u31 G = c41.b0(this).G(2131624034, 4, jb6.M0(2131753295, null));
        G.j = 5000;
        G.j();
    }

    public final void o5() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        int i;
        nu9 nu9Var = this.a0;
        if (nu9Var != null && nu9Var.getVisibility() != 8) {
            f = this.a0.getMeasuredHeight();
        } else {
            f = 0.0f;
        }
        if (this.L) {
            f2 = gm.L(81.0f);
        } else {
            f2 = 0.0f;
        }
        boolean z = this.L;
        float f11 = this.O;
        float f12 = this.z1;
        if (z) {
            f3 = (f * f12) + td4.A(1.0f, f12, f2, f11);
            f4 = this.z3;
        } else {
            f3 = (f * f12) + f11;
            f4 = this.z3;
        }
        float f13 = f3 + f4 + this.U;
        zj3 zj3Var = this.Y;
        if (zj3Var != null && zj3Var.getVisibility() == 0) {
            f5 = this.Y.getAlpha();
        } else {
            f5 = 0.0f;
        }
        float L = gm.L(4.0f) * f5;
        ak3 ak3Var = this.A0;
        if (ak3Var != null) {
            ak3Var.setTranslationY(f13 - L);
            f7 = this.A0.getAlpha();
            f8 = (this.A0.getUnreadOnlyBannerHeight() + gm.L(43.0f)) * f7;
            f6 = f13 + f8;
        } else {
            f6 = f13;
            f7 = 0.0f;
            f8 = 0.0f;
        }
        qk3 qk3Var = this.L1;
        if (qk3Var != null) {
            float f14 = f6 - L;
            int i2 = -gm.L(3.0f);
            if (this.b0 == null) {
                i = gm.L(44.0f);
            } else {
                i = 0;
            }
            qk3Var.setTranslationY(gm.R1(f14, i2 - i, this.b.e));
            f9 = this.L1.getMetadata().c.a;
            f10 = this.L1.c(0.0f);
        } else {
            f9 = 0.0f;
            f10 = 0.0f;
        }
        pk3 pk3Var = this.M1;
        if (pk3Var != null) {
            pk3Var.setTranslationY(f13 - L);
            float U1 = gm.U1(Math.min(f9, f7), gm.L(7.0f), gm.L(50.0f));
            pk3 pk3Var2 = this.M1;
            float min = Math.min(gm.L(40.0f), (f10 + f8) - U1);
            Matrix matrix = pk3Var2.b;
            if (pk3Var2.e != U1 || pk3Var2.f != min) {
                pk3Var2.e = U1;
                pk3Var2.f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, U1);
                LinearGradient linearGradient = pk3Var2.c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                pk3Var2.invalidate();
            }
            this.M1.setAlpha(Math.max(f7, f9));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (hasShownSheet()) {
            if (z) {
                closeSheet();
                return false;
            }
        } else if (this.H3.c() && this.H3.getFragment().onBackPressed(z)) {
            if (z) {
                this.H3.a();
                sj3 sj3Var = this.D0;
                if (sj3Var != null) {
                    sj3Var.S();
                    return false;
                }
            }
        } else {
            bu5 bu5Var = this.M0;
            if (bu5Var != null) {
                if (z) {
                    bu5Var.u();
                    this.M0 = null;
                    return false;
                }
            } else {
                ak3 ak3Var = this.A0;
                if (ak3Var != null && ak3Var.n) {
                    if (z) {
                        ak3Var.setIsEditing(false);
                        d5(false);
                        return false;
                    }
                } else {
                    a aVar = this.actionBar;
                    if (aVar != null && aVar.y()) {
                        if (z) {
                            sj3 sj3Var2 = this.D0;
                            if (sj3Var2 != null && sj3Var2.getVisibility() == 0) {
                                this.D0.R(false);
                            }
                            A3(true);
                            return false;
                        }
                    } else if (this.b.f) {
                        if (z) {
                            this.Y.r.getText().clear();
                            this.Z.b(false);
                            this.Y.r.clearFocus();
                            return false;
                        }
                    } else {
                        ak3 ak3Var2 = this.A0;
                        if (ak3Var2 != null && ak3Var2.getVisibility() == 0 && !this.j3) {
                            ak3 ak3Var3 = this.A0;
                            if (!ak3Var3.P && !this.o3) {
                                ArrayList arrayList = ak3Var3.h;
                                if (!arrayList.isEmpty() && ak3Var3.M != ((eg4) arrayList.get(0)).a) {
                                    if (z) {
                                        ak3 ak3Var4 = this.A0;
                                        ArrayList arrayList2 = ak3Var4.h;
                                        if (!arrayList2.isEmpty()) {
                                            ak3Var4.g((eg4) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        ti3 ti3Var = this.D1;
                        if (ti3Var != null && ti3Var.R0()) {
                            if (z) {
                                this.D1.J0(true);
                            }
                        } else {
                            aj3 aj3Var = this.F0;
                            if (aj3Var.P == 0 && aj3Var.T.K0() != 0) {
                                aj3Var.h.z0(0);
                                return false;
                            }
                            return super.onBackPressed(z);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        sb sbVar;
        ak3 ak3Var;
        if (this.X1) {
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.o(true);
            }
            TLObject tLObject = this.Z1;
            if (tLObject != null) {
                sj3 sj3Var = this.D0;
                if (sj3Var != null) {
                    sj3Var.e0.Q(this.Y1, tLObject);
                }
                this.Z1 = null;
            }
            this.X1 = false;
        }
        if (!this.L && (ak3Var = this.A0) != null && ak3Var.getVisibility() == 0 && this.r.f) {
            int i = (int) (-this.O);
            int currentActionBarHeight = a.getCurrentActionBarHeight();
            if (i != 0 && i != currentActionBarHeight && i >= currentActionBarHeight / 2) {
                this.f0[0].a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        if (!isInPreviewMode() && (sbVar = this.L0) != null && sbVar.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        X2();
        this.s0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        hg5 hg5Var;
        super.onBecomeFullyVisible();
        if (F3()) {
            SharedPreferences d1 = oc7.d1();
            boolean z = d1.getBoolean("archivehint", true);
            boolean isEmpty = o3(this.currentAccount, this.T0, this.Y2, false).isEmpty();
            if (z && isEmpty) {
                oc7.d1().edit().putBoolean("archivehint", false).commit();
                z = false;
            }
            if (z) {
                d1.edit().putBoolean("archivehint", false).commit();
                b5();
            }
        }
        if (this.s0 && !this.t0 && (hg5Var = this.q0) != null && this.R3) {
            this.t0 = true;
            this.s0 = false;
            hg5Var.v();
        }
        gm.d3(new di3(this, (byte) 1), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bu5 bu5Var = this.M0;
        if (bu5Var != null) {
            bu5Var.u();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        he heVar;
        super.onDialogDismiss(dialog);
        if (this.Y2 == 0 && this.a3 == 0 && (heVar = this.V1) != null && dialog == heVar && getParentActivity() != null) {
            C2(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i;
        boolean z;
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        int i2 = 0;
        if (bundle != null) {
            this.n2 = bundle.getBoolean("onlySelect", false);
            this.o2 = this.arguments.getBoolean("canSelectTopics", false);
            this.s2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.T0 = this.arguments.getInt("dialogsType", 0);
            this.P0 = this.arguments.getBoolean("quote", false);
            this.O0 = this.arguments.getBoolean("reply_to", false);
            this.Q0 = this.arguments.getLong("reply_to_author", 0L);
            this.R0 = this.arguments.getLong("reply_to_channel_direct", 0L);
            this.S0 = this.arguments.getLong("forward_into_channel", 0L);
            this.h2 = this.arguments.getString("selectAlertString");
            this.i2 = this.arguments.getString("selectAlertStringGroup");
            this.j2 = this.arguments.getString("addToGroupAlertString");
            this.t2 = this.arguments.getBoolean("allowSwitchAccount");
            this.u2 = this.arguments.getBoolean("checkCanWrite", true);
            this.v2 = this.arguments.getBoolean("afterSignup", false);
            this.Y2 = this.arguments.getInt("folderId", 0);
            long j = this.arguments.getLong("community_id", 0L);
            this.a3 = j;
            if (j != 0) {
                this.b3 = getMessagesController().L0(Long.valueOf(this.a3));
                this.c3 = getMessagesController().M0(this.a3);
            }
            this.k2 = this.arguments.getBoolean("resetDelegate", true);
            this.U0 = this.arguments.getInt("messagesCount", 0);
            this.V0 = this.arguments.getInt("hasPoll", 0);
            this.W0 = this.arguments.getBoolean("hasInvoice", false);
            this.w2 = this.arguments.getBoolean("showSetPasswordConfirm", this.w2);
            this.arguments.getInt("otherwiseRelogin");
            this.x2 = this.arguments.getBoolean("allowGroups", true);
            this.y2 = this.arguments.getBoolean("allowMegagroups", true);
            this.z2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.A2 = this.arguments.getBoolean("allowChannels", true);
            this.B2 = this.arguments.getBoolean("allowUsers", true);
            this.C2 = this.arguments.getBoolean("allowBots", true);
            this.D2 = this.arguments.getBoolean("closeFragment", true);
            this.G = this.arguments.getBoolean("allowGlobalSearch", true);
            this.X = this.arguments.getBoolean("hasMainTabs", false);
            byte[] byteArray = this.arguments.getByteArray("requestPeerType");
            if (byteArray != null) {
                try {
                    SerializedData serializedData = new SerializedData(byteArray);
                    this.H = TLRPC.RequestPeerType.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                } catch (Exception unused) {
                }
            }
            this.I = this.arguments.getLong("requestPeerBotId", 0L);
        }
        if (this.T0 == 0) {
            this.W1 = oc7.e1().getBoolean("askAboutContacts", true);
            gda.t();
        }
        nm7 notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        this.L3 = new e7a(notificationCenter, this);
        if (this.p2 == null) {
            this.f2 = getConnectionsManager().getConnectionState();
            this.L3.e(nm7.m4);
            if (!this.n2) {
                this.L3.e(nm7.M4);
                this.L3.e(nm7.E4);
                this.L3.b(nm7.R2);
                this.L3.b(nm7.d2);
            }
            e7a e7aVar = this.L3;
            e7aVar.b(nm7.r);
            e7aVar.b(nm7.O2);
            e7aVar.b(nm7.P2);
            e7aVar.b(nm7.Q2);
            e7aVar.b(2);
            e7aVar.b(nm7.Y);
            e7aVar.b(nm7.N);
            e7aVar.b(nm7.I2);
            e7aVar.b(nm7.h0);
            e7aVar.b(nm7.f0);
            e7aVar.b(nm7.I);
            e7aVar.b(nm7.J);
            e7aVar.b(nm7.L);
            e7aVar.b(nm7.P0);
            e7aVar.b(nm7.s0);
            e7aVar.b(nm7.u5);
            e7aVar.b(nm7.S0);
            e7aVar.b(nm7.T1);
            e7aVar.b(nm7.f5);
            e7aVar.b(nm7.K2);
            e7aVar.b(nm7.d0);
            e7aVar.b(nm7.s1);
            e7aVar.b(nm7.c5);
            e7aVar.b(nm7.d5);
            e7aVar.b(nm7.M);
            e7aVar.b(nm7.q5);
            e7aVar.b(nm7.j5);
            this.L3.e(nm7.n0);
        }
        e7a e7aVar2 = this.L3;
        e7aVar2.b(nm7.v);
        e7aVar2.b(nm7.W4);
        e7aVar2.b(nm7.e5);
        e7aVar2.b(nm7.T);
        e7aVar2.b(nm7.P4);
        e7aVar2.b(nm7.x5);
        e7aVar2.b(nm7.z5);
        e7aVar2.b(nm7.b3);
        e7aVar2.b(nm7.f3);
        e7aVar2.b(nm7.k5);
        e7aVar2.b(nm7.A3);
        e7aVar2.b(nm7.C3);
        e7aVar2.b(nm7.W5);
        e7aVar2.b(nm7.X5);
        e7aVar2.b(nm7.S3);
        e7aVar2.b(nm7.T3);
        if (this.T0 == 0) {
            this.L3.b(nm7.D5);
            this.L3.b(nm7.P1);
        }
        x4(getAccountInstance());
        h4b N1 = getMessagesController().N1();
        if (!N1.A) {
            N1.V();
            if (!N1.s) {
                ConnectionsManager.getInstance(N1.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new k3b(N1, (byte) 0));
            }
        }
        getMessagesController().f3(this.Y2);
        if (this.X3 != null && !getMessagesStorage().R) {
            w93 w93Var = this.X3;
            if (w93Var.getParent() != null) {
                ((ViewGroup) w93Var.getParent()).removeView(w93Var);
            }
            this.X3 = null;
        }
        if (F3()) {
            h4b N12 = getMessagesController().N1();
            if (N12.z) {
                N12.S(true);
            }
        } else {
            getMessagesController().N1().V();
        }
        getContactsController().B();
        if (getMessagesController().P3) {
            wr9 E1 = getMessagesController().E1();
            if (!E1.e) {
                E1.g(true);
            }
        }
        if (this.a3 != 0) {
            getMessagesController().a3(0, this.a3, true);
        }
        ok0 a = ok0.a(this.currentAccount);
        if (!a.e) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = a.b;
            if (j2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                long j3 = currentTimeMillis - j2;
                boolean z2 = e21.a;
                if (j3 > 43200000) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(a.b);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(currentTimeMillis);
                if (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                a.e = true;
                ConnectionsManager.getInstance(a.a).sendRequest(new TL_account.getBirthdays(), new tg(a, (byte) 3));
            }
        }
        if (this.X) {
            i = gm.L(72.0f);
        } else {
            i = 0;
        }
        this.o4 = i;
        if (this.X) {
            i2 = gm.L(64.0f);
        }
        this.p4 = i2;
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        gm.r(this.T3);
        gm.r(this.Q3);
        this.P3.A();
        super.onFragmentDestroy();
        e7a e7aVar = this.L3;
        if (e7aVar != null) {
            e7aVar.a();
            this.L3 = null;
        }
        ti3 ti3Var = this.D1;
        if (ti3Var != null) {
            ti3Var.d1();
        }
        bda bdaVar = this.I2;
        if (bdaVar != null) {
            bdaVar.j();
        }
        rd3 rd3Var = this.J2;
        if (rd3Var != null) {
            gm.r(rd3Var);
            this.J2 = null;
        }
        UndoView undoView = this.z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.r3.e();
        this.E2 = null;
        int i = yx4.l1;
    }

    @Override
    public final void onPanTranslationUpdate(float f) {
        if (this.f0 != null) {
            this.K0 = f;
            ti3 ti3Var = this.D1;
            int i = 0;
            if (ti3Var != null && ti3Var.R0()) {
                this.fragmentView.setTranslationY(f);
                while (true) {
                    mk3[] mk3VarArr = this.f0;
                    if (i >= mk3VarArr.length) {
                        break;
                    }
                    mk3VarArr[i].setTranslationY(0.0f);
                    i++;
                }
                if (!this.n2) {
                    this.actionBar.setTranslationY(0.0f);
                    u31 u31Var = this.q3;
                    if (u31Var != null) {
                        u31Var.l();
                    }
                }
                sj3 sj3Var = this.D0;
                if (sj3Var != null) {
                    sj3Var.setTranslationY(this.J0);
                    return;
                }
                return;
            }
            while (true) {
                mk3[] mk3VarArr2 = this.f0;
                if (i >= mk3VarArr2.length) {
                    break;
                }
                mk3VarArr2[i].setTranslationY(f);
                i++;
            }
            if (!this.n2) {
                this.actionBar.setTranslationY(f);
                u31 u31Var2 = this.q3;
                if (u31Var2 != null) {
                    u31Var2.l();
                }
            }
            sj3 sj3Var2 = this.D0;
            if (sj3Var2 != null) {
                sj3Var2.setTranslationY(this.K0 + this.J0);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        gm.r(this.Q3);
        this.P3.A();
        u31 u31Var = this.T;
        if (u31Var != null) {
            u31Var.b();
            this.T = null;
        }
        dj3 dj3Var = this.H3;
        if (dj3Var != null) {
            dj3Var.r = true;
            kj3 kj3Var = dj3Var.a;
            if (kj3Var != null) {
                kj3Var.onPause();
            }
        }
        bu5 bu5Var = this.M0;
        if (bu5Var != null) {
            bu5Var.u();
        }
        ti3 ti3Var = this.D1;
        if (ti3Var != null) {
            ti3Var.f1();
        }
        int i = 0;
        UndoView undoView = this.z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        setBulletinDelegate(null);
        if (this.f0 == null) {
            return;
        }
        while (true) {
            mk3[] mk3VarArr = this.f0;
            if (i < mk3VarArr.length) {
                mk3VarArr[i].d.getClass();
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        yb0 yb0Var;
        if (i == 1) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (iArr.length > i2) {
                    String str = strArr[i2];
                    str.getClass();
                    char c = 65535;
                    switch (str.hashCode()) {
                        case -1925850455:
                            if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1365911975:
                            if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1977429404:
                            if (str.equals("android.permission.READ_CONTACTS")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            if (iArr[i2] == 0) {
                                lo7.n(this.currentAccount).Y();
                                break;
                            } else {
                                wn7.D0();
                                continue;
                            }
                        case 1:
                            if (iArr[i2] == 0) {
                                fn5.z().e(null);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (iArr[i2] == 0) {
                                gm.c3(new di3(this, (byte) 0));
                                getContactsController().l();
                                continue;
                            } else {
                                SharedPreferences.Editor edit = oc7.e1().edit();
                                this.W1 = false;
                                edit.putBoolean("askAboutContacts", false).commit();
                                break;
                            }
                    }
                }
            }
            if (this.B0) {
                this.B0 = false;
                e5();
            }
        } else if (i == 4) {
            for (int i3 : iArr) {
                if (i3 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (yb0Var = FilesMigrationService.e) != null) {
                yb0Var.D0();
            }
        }
    }

    @Override
    public final void onResume() {
        boolean z;
        nk3 nk3Var;
        mk3 mk3Var;
        qi3 qi3Var;
        boolean z2;
        boolean z3;
        boolean z4;
        ov9 ov9Var;
        sb sbVar;
        super.onResume();
        w4();
        aj3 aj3Var = this.F0;
        char c = 0;
        if (aj3Var != null) {
            ArrayList arrayList = aj3Var.y;
            h4b h4bVar = aj3Var.s;
            h4bVar.k(h4bVar.g);
            h4bVar.k(h4bVar.h);
            for (int i = 0; i < arrayList.size(); i++) {
                TL_stories.PeerStories x = h4bVar.x(((fh3) arrayList.get(i)).c);
                if (x != null) {
                    h4bVar.Z(x);
                }
            }
        }
        dj3 dj3Var = this.H3;
        if (dj3Var != null) {
            dj3Var.r = false;
            kj3 kj3Var = dj3Var.a;
            if (kj3Var != null) {
                kj3Var.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).w() && (sbVar = this.L0) != null && sbVar.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        if (this.f0 != null) {
            int i2 = 0;
            while (true) {
                mk3[] mk3VarArr = this.f0;
                if (i2 >= mk3VarArr.length) {
                    break;
                }
                mk3VarArr[i2].d.f();
                i2++;
            }
        }
        if (this.S3) {
            this.S3 = false;
            getMessagesController().b5(null);
            if (this.f0 != null) {
                int i3 = 0;
                while (true) {
                    mk3[] mk3VarArr2 = this.f0;
                    if (i3 >= mk3VarArr2.length) {
                        break;
                    }
                    mk3VarArr2[i3].d.f();
                    i3++;
                }
            }
        }
        F5(-1, false);
        ti3 ti3Var = this.D1;
        if (ti3Var != null) {
            ti3Var.g1();
        }
        long j = 0;
        if (!this.n2 && this.Y2 == 0 && this.a3 == 0) {
            getMediaDataController().D(4);
        }
        sj3 sj3Var = this.D0;
        if (sj3Var != null && (ov9Var = sj3Var.e0) != null) {
            ov9Var.f();
        }
        if (!this.v2 && getUserConfig().a0 != null) {
            z = false;
        } else {
            z = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z && this.Y2 == 0 && this.a3 == 0 && this.e2 && !this.n2) {
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.e2 = false;
                if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i4 = Build.VERSION.SDK_INT;
                if ((i4 <= 28 || e21.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i4 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                nk3Var = this;
                fv2 fv2Var = new fv2(nk3Var, z4, z2, z3, parentActivity);
                if (nk3Var.v2 && (z2 || z4)) {
                    j = 4000;
                }
                gm.d3(fv2Var, j);
            } else {
                nk3Var = this;
            }
        } else {
            nk3Var = this;
            if (!nk3Var.n2 && nk3Var.Y2 == 0 && nk3Var.a3 == 0 && p0f.b() && !p0f.a()) {
                if (nk3Var.getParentActivity() != null) {
                    if (!oc7.e1().getBoolean("askedAboutMiuiLockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nk3Var.getParentActivity());
                        int i5 = cmb.K5;
                        alertDialog$Builder.l(2131624116, 72, nk3Var.getThemedColor(i5), null);
                        alertDialog$Builder.m(i5, nk3Var.getResourceProvider());
                        String M0 = jb6.M0(2131747031, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.U = M0;
                        alertDialog$Builder.j(jb6.M0(2131747033, null), new nh3(nk3Var, (byte) 10));
                        alertDialog$Builder.g(jb6.M0(2131751709, null), new wa3((byte) 10));
                        nk3Var.showDialog(heVar);
                    }
                } else {
                    return;
                }
            } else if (nk3Var.Y2 == 0 && nk3Var.a3 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (nk3Var.getParentActivity() != null) {
                    if (!oc7.e1().getBoolean("askedAboutFSILockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(nk3Var.getParentActivity());
                        int i6 = cmb.K5;
                        alertDialog$Builder2.l(2131624116, 72, nk3Var.getThemedColor(i6), null);
                        alertDialog$Builder2.m(i6, nk3Var.getResourceProvider());
                        String M02 = jb6.M0(2131747047, null);
                        he heVar2 = alertDialog$Builder2.a;
                        heVar2.U = M02;
                        alertDialog$Builder2.j(jb6.M0(2131747033, null), new nh3(nk3Var, (byte) 11));
                        alertDialog$Builder2.g(jb6.M0(2131751709, null), new wa3((byte) 11));
                        nk3Var.showDialog(heVar2);
                    }
                } else {
                    return;
                }
            }
        }
        nk3Var.e5();
        if (nk3Var.f0 != null) {
            int i7 = 0;
            while (true) {
                mk3[] mk3VarArr3 = nk3Var.f0;
                if (i7 >= mk3VarArr3.length) {
                    break;
                }
                mk3 mk3Var2 = mk3VarArr3[i7];
                if (mk3Var2.s == 0 && mk3Var2.w == 2 && mk3Var2.c.K0() == 0 && nk3Var.y3()) {
                    nk3Var.f0[i7].c.g1(1, (int) nk3Var.O);
                }
                mk3[] mk3VarArr4 = nk3Var.f0;
                if (i7 == 0) {
                    mk3VarArr4[i7].d.getClass();
                } else {
                    mk3VarArr4[i7].d.getClass();
                }
                i7++;
            }
        }
        nk3Var.g5();
        nk3Var.setBulletinDelegate(new s20(nk3Var, (byte) 9));
        if (nk3Var.s3) {
            gm.V2(nk3Var.getParentActivity(), nk3Var.classGuid);
        }
        nk3Var.G5(0, false);
        nk3Var.w5(false, true);
        nk3Var.E5(false);
        nk3Var.N2();
        nk3Var.X2();
        if (nk3Var.A0 != null && (mk3Var = nk3Var.f0[0]) != null && (qi3Var = mk3Var.d) != null) {
            int i8 = qi3Var.h;
            if (i8 == 7 || i8 == 8) {
                ub7[] ub7VarArr = nk3Var.getMessagesController().N;
                if (i8 != 7) {
                    c = 1;
                }
                ub7 ub7Var = ub7VarArr[c];
                if (ub7Var != null) {
                    nk3Var.A0.i(ub7Var.o);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z, float f) {
        if (gda.o() <= 0) {
            boolean z2 = e21.a;
        } else if (this.f4 && this.g4 == null) {
            Z4(f);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.h1.setColor(getThemedColor(cmb.c6));
            H2();
            r5();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        sb sbVar;
        nk3 nk3Var;
        dj3 dj3Var = this.H3;
        if (dj3Var != null && dj3Var.c()) {
            this.H3.getFragment().onTransitionAnimationEnd(z, z2);
        } else {
            if (z && (sbVar = this.L0) != null && sbVar.getVisibility() == 0) {
                this.L0.setVisibility(8);
                this.L0.setBackground(null);
            }
            if (z && this.v2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).w0.c(false);
                }
            }
        }
        if (!z && (nk3Var = this.Z2) != null) {
            nk3Var.removeSelfFromStack();
        }
        X2();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        dj3 dj3Var = this.H3;
        if (dj3Var != null && dj3Var.c()) {
            this.H3.getFragment().onTransitionAnimationProgress(z, f);
        } else {
            sb sbVar = this.L0;
            if (sbVar != null && sbVar.getVisibility() == 0) {
                sb sbVar2 = this.L0;
                if (z) {
                    sbVar2.setAlpha(1.0f - f);
                } else {
                    sbVar2.setAlpha(f);
                }
            }
        }
        X2();
    }

    public final float p3(boolean z) {
        float f;
        if (z) {
            f = 1.0f - this.b.e;
        } else {
            f = 1.0f;
        }
        return f * (1.0f - t3()) * this.r.e;
    }

    public final void p4(TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            u31 I = c41.b0(this).I(2131624034, jb6.M0(2131746591, null), jb6.M0(2131746590, null));
            I.j = 5000;
            I.j();
            return;
        }
        if (userFull != null) {
            int i = userFull.flags2;
            if (tL_birthday == null) {
                userFull.flags2 = i & (-33);
            } else {
                userFull.flags2 = i | 32;
            }
            userFull.birthday = tL_birthday;
            getMessagesStorage().g2(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
                String M0 = jb6.M0(2131746587, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131746588, null);
                alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                showDialog(heVar);
                return;
            }
            return;
        }
        ts2.u(null, 2131743566, c41.b0(this), 2131624012, 36);
    }

    public final void p5(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.p5(boolean):void");
    }

    @Override
    public final void prepareFragmentToSlide(boolean z, boolean z2) {
        if (!z && z2) {
            this.f4 = true;
            V4(true);
            return;
        }
        this.g4 = null;
        this.f4 = false;
        V4(false);
        Z4(1.0f);
    }

    @Override
    public final boolean presentFragment(d dVar) {
        boolean presentFragment = super.presentFragment(dVar);
        if (presentFragment && this.f0 != null) {
            int i = 0;
            while (true) {
                mk3[] mk3VarArr = this.f0;
                if (i >= mk3VarArr.length) {
                    break;
                }
                mk3VarArr[i].d.getClass();
                i++;
            }
        }
        hg5 hg5Var = this.q0;
        if (hg5Var != null) {
            hg5Var.f(true);
        }
        hg5 hg5Var2 = this.r0;
        if (hg5Var2 != null) {
            hg5Var2.f(true);
        }
        u31.e();
        return presentFragment;
    }

    public final int q3() {
        if (this.L) {
            return gm.L(48.0f) + gm.L(81.0f);
        }
        return gm.L(48.0f);
    }

    public final void q4(TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull X1 = getMessagesController().X1(getUserConfig().e());
        if (X1 != null) {
            tL_birthday2 = X1.birthday;
            X1.flags2 |= 32;
            X1.birthday = tL_birthday;
        } else {
            tL_birthday2 = null;
        }
        getMessagesController().i2();
        getConnectionsManager().sendRequest(updatebirthday, new eo0(this, X1, tL_birthday2, (byte) 21), 1024);
        oc7.r1(this.currentAccount).p4(0L, "BIRTHDAY_SETUP");
        q5();
    }

    public final void q5() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.q5():void");
    }

    public final int r3() {
        if (this.L) {
            return gm.L(81.0f);
        }
        return 0;
    }

    public final void r4() {
        oc7.r1(this.currentAccount).p4(0L, "BIRTHDAY_SETUP");
        q5();
        u31 K = c41.b0(this).K(2131623982, jb6.M0(2131753679, null), jb6.M0(2131745229, null), new di3(this, (byte) 10));
        K.j = 5000;
        K.j();
    }

    public final void r5() {
        pu9 pu9Var;
        jk3 jk3Var;
        boolean z;
        int i;
        try {
            ti3 ti3Var = this.D1;
            if (ti3Var != null && ti3Var.getEditField() != null) {
                this.D1.getEditField().setCursorColor(getThemedColor(cmb.Me));
            }
            NumberTextView numberTextView = this.j1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(cmb.x8));
            }
            ak3 ak3Var = this.A0;
            int i2 = 0;
            if (ak3Var != null && (ak3Var.getSelectorDrawable() instanceof GradientDrawable)) {
                a aVar = this.actionBar;
                if (aVar != null && aVar.y()) {
                    z = true;
                } else {
                    z = false;
                }
                GradientDrawable gradientDrawable = (GradientDrawable) this.A0.getSelectorDrawable();
                if (z) {
                    i = cmb.wi;
                } else {
                    i = cmb.J8;
                }
                gradientDrawable.setColor(getThemedColor(i));
                this.A0.invalidate();
            }
            a aVar2 = this.actionBar;
            if (aVar2 != null) {
                if (this.Y2 != 0 || this.a3 != 0) {
                    aVar2.L(getThemedColor(cmb.P8), false);
                    this.actionBar.L(getThemedColor(cmb.Q8), true);
                }
                if (this.actionBar.y()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(cmb.c6));
                }
                x5();
            }
            if (this.f0 != null) {
                while (true) {
                    mk3[] mk3VarArr = this.f0;
                    if (i2 >= mk3VarArr.length) {
                        break;
                    }
                    mk3 mk3Var = mk3VarArr[i2];
                    if (mk3Var != null && (jk3Var = mk3Var.a) != null) {
                        jk3Var.setGlowColor(getThemedColor(cmb.c6));
                    }
                    i2++;
                }
            }
            sj3 sj3Var = this.D0;
            if (sj3Var != null && (pu9Var = sj3Var.b0) != null) {
                pu9Var.setGlowColor(getThemedColor(cmb.c6));
            }
            vi3 vi3Var = this.E1;
            if (vi3Var != null) {
                vi3Var.setScrimViewBackgroundColor(getThemedColor(cmb.c6));
            }
            hg5 hg5Var = this.q0;
            if (hg5Var != null) {
                hg5Var.i(getThemedColor(cmb.vj));
            }
            hg5 hg5Var2 = this.r0;
            if (hg5Var2 != null) {
                hg5Var2.i(getThemedColor(cmb.vj));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final ub7 s3(mk3 mk3Var) {
        char c;
        if (mk3Var != null) {
            int i = mk3Var.s;
            if (i == 7 || i == 8) {
                ub7[] ub7VarArr = getMessagesController().N;
                if (mk3Var.s == 8) {
                    c = 1;
                } else {
                    c = 0;
                }
                return ub7VarArr[c];
            }
            return null;
        }
        return null;
    }

    public final void s4() {
        oc7.r1(this.currentAccount).p4(0L, "PREMIUM_CHRISTMAS");
        q5();
        u31 G = c41.b0(this).G(2131624034, 4, jb6.M0(2131753295, null));
        G.j = 5000;
        G.j();
    }

    public final void s5(boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.s5(boolean, boolean):void");
    }

    @Override
    public final void setInPreviewMode(boolean z) {
        super.setInPreviewMode(z);
        aj3 aj3Var = this.F0;
        if (aj3Var != null) {
            if (this.H0 && !z) {
                aj3Var.setVisibility(0);
            } else {
                aj3Var.setVisibility(8);
            }
        }
        v5(true);
        q5();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r5, int r6, java.lang.Runnable r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    public final float t3() {
        dj3 dj3Var = this.H3;
        if (dj3Var != null && dj3Var.c()) {
            return this.H3.e;
        }
        return 0.0f;
    }

    public final void t4() {
        oc7.r1(this.currentAccount).p4(0L, "PREMIUM_RESTORE");
        q5();
    }

    public final void t5(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.t5(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    @Override
    public final void u() {
        R4(true, true);
    }

    public final float u3() {
        return -gm.U1(this.b.e, gm.L(4.0f), gm.L(48.0f));
    }

    public final void u4() {
        String str;
        oc7 r1 = oc7.r1(this.currentAccount);
        if (this.C3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        r1.p4(0L, str);
        q5();
    }

    public final void u5() {
        float f = (((-this.m4) - this.p4) - this.w1) - this.x1;
        wp4 wp4Var = this.u0;
        if (wp4Var != null) {
            wp4Var.setTranslationY(f);
        }
        wp4 wp4Var2 = this.v0;
        if (wp4Var2 != null) {
            wp4Var2.setTranslationY(f - gm.L(52.0f));
            hg5 hg5Var = this.q0;
            if (hg5Var != null) {
                hg5Var.setTranslationY(f - gm.L(52.0f));
            }
        }
    }

    public final h4b v3() {
        return getMessagesController().N1();
    }

    public final void v4() {
        oc7.r1(this.currentAccount).p4(0L, "USERPIC_SETUP");
        q5();
    }

    public final void v5(boolean z) {
        boolean z2;
        boolean z3 = this.n2;
        if ((!z3 || this.T0 == 10) && this.Y2 == 0 && this.a3 == 0 && !this.inPreviewMode && ((!this.l2 || z3) && !this.a4)) {
            z2 = true;
        } else {
            z2 = false;
        }
        wp4 wp4Var = this.u0;
        if (wp4Var != null) {
            wp4Var.e(z2, z);
        }
        wp4 wp4Var2 = this.v0;
        if (wp4Var2 != null) {
            wp4Var2.e(z2, z);
        }
    }

    public final UndoView w3() {
        j3();
        UndoView[] undoViewArr = this.z0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.d(2, true);
            gk3 gk3Var = (gk3) this.fragmentView;
            gk3Var.removeView(undoViewArr[0]);
            gk3Var.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void w4() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.w4():void");
    }

    public final void w5(boolean z, boolean z2) {
        boolean z3;
        int i;
        if (this.o0 != null) {
            r7 r7Var = this.n0;
            if (r7Var == null || r7Var.getVisibility() != 0) {
                boolean z4 = false;
                int i2 = 0;
                while (true) {
                    if (i2 < getDownloadController().H.size()) {
                        if (getFileLoader().S(((k47) getDownloadController().H.get(i2)).S0())) {
                            z3 = true;
                            break;
                        }
                        i2++;
                    } else {
                        z3 = false;
                        break;
                    }
                }
                if (getDownloadController().J.size() <= 0 && !z3 && (this.h0.getVisibility() != 0 || this.h0.getAlpha() != 1.0f || z2)) {
                    this.j0 = false;
                } else {
                    this.j0 = true;
                }
                T2();
                boolean z5 = org.telegram.messenger.a.b.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i3 = this.f2;
                if (i3 == 3 || i3 == 5) {
                    z4 = true;
                }
                a8 a8Var = this.p0;
                if (z5) {
                    if (z4) {
                        i = 2131748365;
                    } else {
                        i = 2131748364;
                    }
                } else {
                    i = 2131748363;
                }
                a8Var.setSubtext(jb6.M0(i, null));
                this.o0.b(z5, z4, z);
            }
        }
    }

    public final ub7 x3() {
        mk3[] mk3VarArr = this.f0;
        if (mk3VarArr != null && mk3VarArr[0] != null) {
            ArrayList S0 = getMessagesController().S0();
            int i = this.U3;
            if (i < 0) {
                i = this.f0[0].h;
            }
            if (i >= 0 && i < S0.size()) {
                return (ub7) S0.get(i);
            }
        }
        return null;
    }

    public final void x5() {
        int i;
        int i2;
        if (this.u3 && this.actionBar != null) {
            if (this.Y2 == 0 && this.a3 == 0) {
                i = cmb.u8;
            } else {
                i = cmb.N8;
            }
            int themedColor = getThemedColor(i);
            a aVar = this.actionBar;
            int i3 = cmb.x8;
            aVar.H(on2.f(this.z1, themedColor, getThemedColor(i3)), false);
            this.actionBar.H(on2.f(this.z1, getThemedColor(i3), getThemedColor(i3)), true);
            if (this.Y2 == 0 && this.a3 == 0) {
                i2 = cmb.s8;
            } else {
                i2 = cmb.M8;
            }
            int themedColor2 = getThemedColor(i2);
            this.actionBar.G(on2.f(this.z1, themedColor2, getThemedColor(cmb.y8)), false);
        }
    }

    public final boolean y3() {
        if (!this.n2 && this.T0 == 0 && this.a3 == 0 && this.Y2 == 0) {
            oc7 messagesController = getMessagesController();
            messagesController.getClass();
            if (gda.m1 && messagesController.R.f(2305843009213693953L) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void y4(long j) {
        boolean z;
        long j2 = j;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j2);
        int i = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList arrayList = (ArrayList) getMessagesController().x.f(dialog.community_id);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                y4(((TLRPC.Dialog) obj).id);
            }
            return;
        }
        if ((!this.actionBar.y() || this.actionBar.z(null)) && H4(this.f0[0], dialog)) {
            z = true;
        } else {
            z = false;
        }
        int i2 = -1;
        if (z) {
            U4(true, true);
            I2();
            if (this.T1 != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= this.T1.size()) {
                        break;
                    } else if (((TLRPC.Dialog) this.T1.get(i3)).id == j2) {
                        i2 = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i2 < 0) {
                    U4(false, false);
                }
            }
        }
        int i4 = i2;
        if (getMessagesController().s2(j2) || getMessagesController().z2(j2)) {
            oc7 messagesController = getMessagesController();
            cf7 messagesStorage = messagesController.getMessagesStorage();
            v87 v87Var = new v87(messagesController, j2);
            mp3 mp3Var = messagesStorage.a;
            of2 of2Var = new of2(messagesStorage, j2, v87Var, (byte) 5);
            j2 = j2;
            mp3Var.c(of2Var);
        }
        getMessagesController().s3(j2, 0L);
        oc7 messagesController2 = getMessagesController();
        int i5 = dialog.top_message;
        messagesController2.n3(j2, i5, i5, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i4 >= 0) {
            this.T1.remove(i4);
            this.f0[0].y.D();
            this.f0[0].b(true);
        }
    }

    public final void y5() {
        bda bdaVar;
        int i;
        ti3 ti3Var = this.D1;
        ArrayList arrayList = this.K2;
        if (ti3Var != null) {
            this.n.a(!arrayList.isEmpty(), true);
            z5();
            if (arrayList.isEmpty()) {
                if (this.T0 == 3 && this.h2 == null) {
                    i = 2131750507;
                } else {
                    i = 2131745403;
                }
                String M0 = jb6.M0(i, null);
                boolean z = this.W3;
                boolean isEmpty = arrayList.isEmpty();
                a aVar = this.actionBar;
                if (z == isEmpty) {
                    aVar.setTitle(M0);
                } else {
                    aVar.N(M0, true, 350L, d53.h);
                }
                if (this.D1.getTag() != null) {
                    this.D1.K0(false, false, false);
                    this.D1.R();
                    this.D1.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                if (this.D1.getTag() == null) {
                    if (!z3() && this.G2 == null) {
                        this.D1.setFieldText("");
                    }
                    this.D1.setTag(1);
                    if (!this.c4 && (bdaVar = this.I2) != null) {
                        this.c4 = true;
                        String M02 = jb6.M0(2131745163, null);
                        bdaVar.j();
                        bdaVar.G = M02;
                        ((lka) bdaVar.a[0].f).l(M02, false);
                        c0a c0aVar = new c0a(bdaVar, (byte) 10);
                        bdaVar.H = c0aVar;
                        gm.d3(c0aVar, 1000L);
                    }
                }
                this.E1.f(Math.max(1, arrayList.size()), true);
                int i2 = this.U0 + (!TextUtils.isEmpty(this.D1.getFieldText()) ? 1 : 0);
                int size = arrayList.size();
                int i3 = 0;
                long j = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    long longValue = ((Long) obj).longValue();
                    long L1 = getMessagesController().L1(longValue);
                    if (L1 <= 0 && longValue > 0) {
                        L1 = pg3.j(getMessagesController().L2(longValue));
                    }
                    j += L1;
                }
                this.E1.i(i2, j, true);
                this.D1.C2();
                boolean z2 = this.W3;
                boolean isEmpty2 = arrayList.isEmpty();
                a aVar2 = this.actionBar;
                if (z2 == isEmpty2) {
                    aVar2.setTitle(jb6.G(arrayList.size(), "Recipient", new Object[0]));
                } else {
                    aVar2.N(jb6.G(arrayList.size(), "Recipient", new Object[0]), false, 350L, d53.h);
                }
            }
            this.W3 = arrayList.isEmpty();
        } else if (this.T0 == 10) {
            B3(arrayList.isEmpty());
        }
    }

    @Override
    public final nz4 z() {
        return this.s4;
    }

    public final boolean z3() {
        ArrayList arrayList = this.F2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean z4(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.z4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    public final void z5() {
        bda bdaVar = this.I2;
        if (bdaVar != null) {
            int i = this.currentAccount;
            bdaVar.h(i);
            bdaVar.d = z8c.h(j5.a(i).a).e();
            ArrayList arrayList = bdaVar.f;
            arrayList.clear();
            ArrayList arrayList2 = this.K2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            pw3 pw3Var = bdaVar.a[0];
            if (bdaVar.b == 1) {
                ((lka) pw3Var.e).l(bdaVar.c(pw3Var), false);
            }
        }
    }

    @Override
    public final void F() {
    }
}
