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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
public class uj3 extends e implements fn7, el4, s84, ej6 {
    public static boolean E4;
    public static final boolean[] F4 = new boolean[4];
    public static final yf3 G4 = new yf3((byte) 1);
    public static float H4;
    public ij3 A0;
    public z92 A1;
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
    public bj3 D0;
    public bi3 D1;
    public boolean D2;
    public Long D3;
    public int D4;
    public boolean E;
    public wia E0;
    public di3 E1;
    public oj3 E2;
    public Drawable E3;
    public boolean F;
    public ii3 F0;
    public s7 F1;
    public ArrayList F2;
    public ul F3;
    public boolean G;
    public vj3 G0;
    public final TextPaint G1;
    public String G2;
    public zm G3;
    public TLRPC.RequestPeerType H;
    public boolean H0;
    public zh3 H1;
    public CharSequence H2;
    public li3 H3;
    public long I;
    public float I0;
    public FrameLayout I1;
    public sea I2;
    public final ai3 I3;
    public ValueAnimator J;
    public float J0;
    public zh3 J1;
    public wd3 J2;
    public final ai3 J3;
    public ValueAnimator K;
    public float K0;
    public FrameLayout K1;
    public final ArrayList K2;
    public aj3 K3;
    public boolean L;
    public tb L0;
    public xj3 L1;
    public boolean L2;
    public u8a L3;
    public boolean M;
    public fu5 M0;
    public wj3 M1;
    public int M2;
    public Drawable M3;
    public boolean N;
    public ni3 N0;
    public m9 N1;
    public int N2;
    public int N3;
    public float O;
    public boolean O0;
    public uk3 O1;
    public boolean O2;
    public boolean O3;
    public boolean P;
    public boolean P0;
    public w8c P1;
    public int P2;
    public final u8a P3;
    public int Q;
    public long Q0;
    public Long Q1;
    public int Q2;
    public final ch3 Q3;
    public boolean R;
    public long R0;
    public Long R1;
    public int R2;
    public boolean R3;
    public boolean S;
    public long S0;
    public ko2 S1;
    public int S2;
    public boolean S3;
    public v21 T;
    public int T0;
    public ArrayList T1;
    public int T2;
    public final ch3 T3;
    public float U;
    public int U0;
    public boolean U1;
    public int U2;
    public int U3;
    public boolean V;
    public int V0;
    public id V1;
    public int V2;
    public AnimatorSet V3;
    public boolean W;
    public boolean W0;
    public boolean W1;
    public int W2;
    public boolean W3;
    public boolean X;
    public su7 X0;
    public boolean X1;
    public boolean X2;
    public d93 X3;
    public hj3 Y;
    public of3 Y0;
    public long Y1;
    public int Y2;
    public String Y3;
    public rw9 Z;
    public of3 Z0;
    public TLObject Z1;
    public uj3 Z2;
    public ArrayList Z3;
    public final byte a;
    public ew9 a0;
    public boolean a1;
    public int a2;
    public long a3;
    public boolean a4;
    public final fm0 b;
    public uic b0;
    public boolean b1;
    public int b2;
    public TLRPC.Chat b3;
    public CharSequence b4;
    public final fm0 c;
    public rh4 c0;
    public final ArrayList c1;
    public boolean c2;
    public TLRPC.ChatFull c3;
    public boolean c4;
    public final fm0 d;
    public float d0;
    public boolean d1;
    public boolean d2;
    public de0 d3;
    public float d4;
    public final fm0 e;
    public ValueAnimator e0;
    public boolean e1;
    public boolean e2;
    public rb0 e3;
    public boolean e4;
    public final fm0 f;
    public tj3[] f0;
    public boolean f1;
    public int f2;
    public long f3;
    public boolean f4;
    public s7 g0;
    public gd0 g1;
    public boolean g2;
    public boolean g3;
    public ValueAnimator g4;
    public final fm0 h;
    public s7 h0;
    public final Paint h1;
    public String h2;
    public boolean h3;
    public zn5 h4;
    public oq3 i0;
    public ImageView i1;
    public String i2;
    public AnimatorSet i3;
    public TLRPC.FileLocation i4;
    public boolean j0;
    public NumberTextView j1;
    public String j2;
    public boolean j3;
    public TLRPC.FileLocation j4;
    public s7 k0;
    public final ArrayList k1;
    public boolean k2;
    public boolean k3;
    public v21 k4;
    public s7 l0;
    public s7 l1;
    public boolean l2;
    public float l3;
    public int l4;
    public s7 m0;
    public s7 m1;
    public boolean m2;
    public boolean m3;
    public int m4;
    public final fm0 n;
    public s7 n0;
    public s7 n1;
    public boolean n2;
    public int n3;
    public int n4;
    public cx8 o0;
    public s7 o1;
    public boolean o2;
    public boolean o3;
    public int o4;
    public b8 p0;
    public b8 p1;
    public String p2;
    public boolean p3;
    public int p4;
    public kg5 q0;
    public b8 q1;
    public String q2;
    public v21 q3;
    public final tq3 q4;
    public final fm0 r;
    public kg5 r0;
    public b8 r1;
    public final jf7 r2;
    public final pn r3;
    public final rz4 r4;
    public final fm0 s;
    public boolean s0;
    public b8 s1;
    public boolean s2;
    public boolean s3;
    public final rz4 s4;
    public boolean t0;
    public b8 t1;
    public boolean t2;
    public boolean t3;
    public final oz4 t4;
    public zp4 u0;
    public b8 u1;
    public boolean u2;
    public boolean u3;
    public final ll0 u4;
    public zp4 v0;
    public b8 v1;
    public boolean v2;
    public boolean v3;
    public final ll0 v4;
    public final v2d w;
    public c51 w0;
    public float w1;
    public boolean w2;
    public float w3;
    public final ll0 w4;
    public boolean x;
    public jz1 x0;
    public float x1;
    public boolean x2;
    public ValueAnimator x3;
    public final ll0 x4;
    public int y;
    public int y0;
    public AnimatorSet y1;
    public boolean y2;
    public float y3;
    public kh3 y4;
    public final UndoView[] z0;
    public float z1;
    public boolean z2;
    public float z3;
    public final ArrayList z4;

    public uj3(Bundle bundle) {
        super(bundle);
        byte b;
        ll0 ll0Var;
        ll0 ll0Var2;
        ll0 ll0Var3;
        int L;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            b = 48;
        } else {
            b = 0;
        }
        this.a = b;
        k43 k43Var = k43.h;
        this.b = new fm0(1, this, k43Var, 350L, false);
        this.c = new fm0(2, this, k43Var, 350L, false);
        this.d = new fm0(3, this, k43Var, 350L, false);
        this.e = new fm0(4, this, k43Var, 350L, false);
        this.f = new fm0(5, this, k43Var, 350L, false);
        this.h = new fm0(6, this, k43Var, 350L, false);
        this.n = new fm0(7, this, k43Var, 350L, false);
        this.r = new fm0(8, this, k43Var, 350L, false);
        this.s = new fm0(9, this, k43Var, 350L, false);
        this.w = new v2d(new ch3(this, (byte) 7));
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
        this.r3 = new pn(null);
        this.I3 = new ai3(this, (byte) 0);
        this.J3 = new ai3(this, (byte) 1);
        this.N3 = -4;
        this.O3 = true;
        int i2 = this.currentAccount;
        HashMap hashMap = ea4.d;
        if (!hashMap.containsKey(Integer.valueOf(i2))) {
            hashMap.put(Integer.valueOf(i2), new HashSet());
        }
        su3 su3Var = new su3((byte) 21);
        yd ydVar = new yd(i2, (byte) 5);
        ?? obj = new Object();
        obj.d = new LinkedHashMap();
        obj.a = su3Var;
        obj.b = (HashSet) hashMap.get(Integer.valueOf(i2));
        obj.c = ydVar;
        this.P3 = obj;
        this.Q3 = new ch3(this, (byte) 8);
        this.R3 = true;
        this.T3 = new ch3(this, (byte) 9);
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
        oz4 d = this.glassEngine.d(new xg3(this, (byte) 10));
        this.t4 = d;
        if (i >= 31) {
            tq3 tq3Var = new tq3(false);
            this.q4 = tq3Var;
            rz4 rz4Var = new rz4(d);
            this.s4 = rz4Var;
            rz4Var.f = d;
            rz4Var.d = tq3Var;
            rz4Var.e = -2;
            rz4 rz4Var2 = new rz4(null);
            this.r4 = rz4Var2;
            rz4Var2.f = d;
            rz4Var2.d = tq3Var;
            rz4Var2.e = -3;
            ll0Var2 = new ll0(rz4Var, rz4Var, rz4Var);
            this.w4 = ll0Var2;
            ll0Var2.k = true;
            if (i86.e(262144)) {
                L = hl.L(8.0f);
            } else {
                L = hl.L(48.0f);
            }
            ll0Var2.d = L;
            ll0Var2.e = L;
            ll0Var = new ll0(rz4Var2, rz4Var2, rz4Var2);
            this.u4 = ll0Var;
            ll0Var.k = true;
            int L2 = hl.L(48.0f);
            ll0Var.d = L2;
            ll0Var.e = L2;
            ll0Var3 = new ll0(rz4Var2, rz4Var2, rz4Var2);
            this.v4 = ll0Var3;
        } else {
            this.q4 = null;
            this.r4 = null;
            this.s4 = null;
            ll0Var = new ll0(d, d, d);
            this.u4 = ll0Var;
            ll0Var2 = new ll0(d, d, d);
            this.w4 = ll0Var2;
            ll0Var3 = new ll0(d, d, d);
            this.v4 = ll0Var3;
        }
        ll0 ll0Var4 = new ll0(d, d, d);
        this.x4 = ll0Var4;
        vy4 vy4Var = this.glassEngine;
        ll0Var2.j = vy4Var;
        ll0Var.j = vy4Var;
        ll0Var3.j = vy4Var;
        ll0Var4.j = vy4Var;
    }

    public static void C3(zu1 zu1Var, r47 r47Var) {
        CharSequence charSequence;
        if (r47Var != null && r47Var.r2()) {
            try {
                if (!TextUtils.isEmpty(r47Var.z)) {
                    charSequence = r47Var.z;
                } else {
                    charSequence = r47Var.v;
                }
                CharSequence v1 = hl.v1(charSequence, r47Var.a2, null);
                if (v1 instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) v1;
                    ho4[] ho4VarArr = (ho4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ho4.class);
                    if (ho4VarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(ho4VarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(ho4VarArr[0]);
                        for (int i = 1; i < ho4VarArr.length; i++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(ho4VarArr[i]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(ho4VarArr[i]);
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
                        zu1Var.Lb(r47Var.L1(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public static int i2(uj3 uj3Var) {
        return uj3Var.classGuid;
    }

    public static of3 n3(tj3 tj3Var) {
        qj3 qj3Var = tj3Var.a;
        for (int i = 0; i < qj3Var.getChildCount(); i++) {
            View childAt = qj3Var.getChildAt(i);
            if (childAt instanceof of3) {
                of3 of3Var = (of3) childAt;
                if (of3Var.X()) {
                    return of3Var;
                }
            }
        }
        return null;
    }

    public static void x4(k5 k5Var) {
        SharedPreferences.Editor editor;
        int i = k5Var.a;
        boolean[] zArr = F4;
        if (!zArr[i]) {
            uc7 s1 = uc7.s1(i);
            if (s1.k2 == 0 && !s1.getUserConfig().T) {
                SharedPreferences sharedPreferences = uc7.s1(s1.currentAccount).X3;
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
                s1.k2 = 4;
                for (int i2 = 0; i2 < 3; i2++) {
                    TL_account.getNotifySettings getnotifysettings = new TL_account.getNotifySettings();
                    if (i2 == 0) {
                        getnotifysettings.peer = new TLRPC.TL_inputNotifyChats();
                    } else if (i2 == 1) {
                        getnotifysettings.peer = new TLRPC.TL_inputNotifyUsers();
                    } else {
                        getnotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
                    }
                    s1.getConnectionsManager().sendRequest(getnotifysettings, new b87(s1, i2, (byte) 1));
                }
                s1.getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new h77(s1, (byte) 7));
            }
            if (!s1.getUserConfig().U && !s1.l2) {
                s1.l2 = true;
                s1.getConnectionsManager().sendRequest(new TL_account.getContactSignUpNotification(), new h77(s1, (byte) 13));
            }
            s1.d3(0, 0, 100, true, null);
            if (s1.s.isEmpty() && !TextUtils.isEmpty(s1.u3)) {
                TLRPC.TL_help_getRecentMeUrls tL_help_getRecentMeUrls = new TLRPC.TL_help_getRecentMeUrls();
                tL_help_getRecentMeUrls.referer = s1.u3;
                s1.getConnectionsManager().sendRequest(tL_help_getRecentMeUrls, new h77(s1, (byte) 5));
            }
            s1.o3(0, yac.h(i).f(), false);
            lv2.r(i).f();
            ls6.d0(i).w(false);
            hl.d3(new zg3(k5Var, (byte) 1), 200L);
            Iterator it = s1.z3.iterator();
            while (it.hasNext()) {
                ls6.d0(i).d1((String) it.next(), true, true);
            }
            zArr[i] = true;
        }
    }

    @Override
    public final rz4 A() {
        return this.s4;
    }

    public final boolean A2(long j, View view) {
        if (this.n2 && getMessagesController().v2(j)) {
            return false;
        }
        Long valueOf = Long.valueOf(j);
        ArrayList arrayList = this.K2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j));
            if (view instanceof of3) {
                ((of3) view).d0(false, true);
            } else if (view instanceof bv8) {
                ((bv8) view).A(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j));
        if (view instanceof of3) {
            ((of3) view).d0(true, true);
        } else if (view instanceof bv8) {
            ((bv8) view).A(true, true);
        }
        return true;
    }

    public final void A3(boolean z) {
        int i;
        boolean z2;
        this.actionBar.y();
        this.K2.clear();
        gd0 gd0Var = this.g1;
        if (gd0Var != null) {
            gd0Var.c(true, 0.0f);
        }
        ij3 ij3Var = this.A0;
        if (ij3Var != null) {
            ij3Var.c(aob.K8, aob.I8, aob.J8, aob.L8, aob.d6);
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
            tj3[] tj3VarArr = this.f0;
            if (i2 >= tj3VarArr.length) {
                break;
            }
            tj3 tj3Var = tj3VarArr[i2];
            if (tj3Var != null) {
                tj3Var.a.K0(true);
            }
            i2++;
        }
        if (this.L) {
            i = 81;
        } else {
            i = 0;
        }
        float max = Math.max(0.0f, hl.L(i + 48) + this.O);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w3, 0.0f);
        this.x3 = ofFloat;
        ofFloat.addUpdateListener(new gh3(this, max, (byte) 1));
        this.x3.addListener(new ui3(this, max, (byte) 0));
        this.x3.setInterpolator(k43.f);
        this.x3.setDuration(200L);
        this.x3.start();
        this.a1 = false;
        ArrayList arrayList = this.c1;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            for (int size = arrayList.size(); i3 < size; size = size) {
                ac7 ac7Var = (ac7) arrayList.get(i3);
                nf4.z0(ac7Var, ac7Var.g, ac7Var.b, ac7Var.c, ac7Var.n, ac7Var.m, ac7Var.h, ac7Var.i, ac7Var.j, false, false, true, true, false, this, null);
                i3++;
                arrayList = arrayList;
            }
            arrayList.clear();
        }
        if (this.b1) {
            getMessagesController().x4(this.Y2, 0L, null);
            z2 = 0;
            this.b1 = false;
        } else {
            z2 = 0;
        }
        p5(true);
        if (this.f0 != null) {
            int i4 = z2;
            while (true) {
                tj3[] tj3VarArr2 = this.f0;
                if (i4 >= tj3VarArr2.length) {
                    break;
                }
                tj3VarArr2[i4].d.I = z2;
                i4++;
            }
        }
        int i5 = uc7.s5;
        int i6 = z2;
        if (z) {
            i6 = 8192;
        }
        G5(196608 | i6, true);
    }

    public final boolean A4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.H;
        if (user != null && !lbc.B(user) && !lbc.z(user)) {
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
                r47 r47Var = (r47) obj;
                if (r47Var.F0() != null && r47Var.F0().size >= 157286400) {
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
            r47 r47Var2 = (r47) obj2;
            if (r47Var2.F0() != null && r47Var2.F0().size >= 157286400) {
                z2 = true;
                break;
            }
        }
        if (!getUserConfig().p() && !getMessagesController().M3() && z2 && z) {
            z3 = true;
        }
        this.d.a(z3, true);
    }

    public final void B2(ph4 ph4Var) {
        bj3 bj3Var;
        if (this.s3 && (bj3Var = this.D0) != null) {
            ArrayList arrayList = bj3Var.D0;
            if (!arrayList.isEmpty()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (ph4Var.b((ph4) arrayList.get(i))) {
                        return;
                    }
                }
            }
            arrayList.add(ph4Var);
            hj3 hj3Var = this.Y;
            ArrayList arrayList2 = hj3Var.H;
            arrayList2.add(ph4Var);
            hj3Var.K = arrayList2.size() - 1;
            hj3Var.f();
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
                kg5 kg5Var = this.q0;
                if (kg5Var != null) {
                    kg5Var.f(true);
                }
                kg5 kg5Var2 = this.r0;
                if (kg5Var2 != null) {
                    kg5Var2.f(true);
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
        nx0 i4 = ik8.i(getParentActivity(), false, 1, null);
        if (getMessagesStorage().M != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 2131232220;
        } else {
            i = 0;
        }
        if (xea.m1) {
            i2 = 2131231000;
        } else {
            i2 = 2131231004;
        }
        int[] iArr = {i, i2};
        if (z) {
            str = ob6.M0(2131748436, null);
        } else {
            str = null;
        }
        if (xea.m1) {
            i3 = 2131746973;
        } else {
            i3 = 2131749078;
        }
        CharSequence[] charSequenceArr = {str, ob6.M0(i3, null)};
        s20 s20Var = new s20(this, (byte) 1);
        i4.M = charSequenceArr;
        i4.N = iArr;
        i4.L = s20Var;
        showDialog(i4);
    }

    public final void B5(TLRPC.User user, boolean z) {
        ul ulVar;
        vnb vnbVar;
        ii3 ii3Var = this.F0;
        ul ulVar2 = null;
        if (ii3Var != null && (ulVar = ii3Var.b0) != null && ii3Var.r0 != null) {
            Long i = lbc.i(user);
            if (i != null) {
                ulVar.j(i.longValue(), z);
                ulVar.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z);
            } else {
                if (user != null) {
                    uc7.s1(ii3Var.f);
                    if (uc7.F2(user)) {
                        if (ii3Var.O0 == null) {
                            ii3Var.O0 = ii3Var.getContext().getResources().getDrawable(2131232312).mutate();
                            ii3Var.O0 = new vl(hl.L(18.0f), hl.L(18.0f), ii3Var.O0);
                        }
                        Drawable drawable = ii3Var.O0;
                        int i2 = aob.qi;
                        uj3 uj3Var = ii3Var.f0;
                        if (uj3Var != null) {
                            vnbVar = uj3Var.getResourceProvider();
                        } else {
                            vnbVar = null;
                        }
                        yob.x(ii3Var, drawable, i2, vnbVar, PorterDuff.Mode.MULTIPLY);
                        ulVar.g(ii3Var.O0, z);
                        ulVar.m(false, z);
                    }
                }
                ulVar.g(null, z);
                ulVar.m(false, z);
            }
            ulVar.k(Integer.valueOf(ii3Var.f(aob.qi)));
            ii3Var.a0.invalidate();
        }
        if (this.F3 != null && this.actionBar != null) {
            Long i3 = lbc.i(user);
            this.D3 = null;
            if (i3 != null) {
                boolean z2 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                this.F3.j(i3.longValue(), z);
                this.F3.m(z2, z);
                if (z2) {
                    this.D3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
                }
                this.actionBar.setRightDrawableOnClick(new wg3(this, (byte) 1));
                n1a.s(this.currentAccount);
            } else {
                if (user != null) {
                    uc7.s1(this.currentAccount);
                    if (uc7.F2(user)) {
                        if (this.M3 == null) {
                            this.M3 = getParentActivity().getResources().getDrawable(2131232312).mutate();
                            this.M3 = new vl(hl.L(18.0f), hl.L(18.0f), this.M3);
                        }
                        Drawable drawable2 = this.M3;
                        int themedColor = getThemedColor(aob.qi);
                        this.D4 = themedColor;
                        drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                        this.F3.g(this.M3, z);
                        this.F3.m(false, z);
                        this.actionBar.setRightDrawableOnClick(new wg3(this, (byte) 2));
                        n1a.s(this.currentAccount);
                    }
                }
                this.F3.g(null, z);
                this.F3.m(false, z);
                this.actionBar.setRightDrawableOnClick(null);
            }
            ul ulVar3 = this.F3;
            int i4 = aob.qi;
            ulVar3.k(Integer.valueOf(getThemedColor(i4)));
            zm zmVar = this.G3;
            if (zmVar != null) {
                zmVar.setColor(getThemedColor(i4));
            }
            ni3 ni3Var = this.N0;
            if (ni3Var != null && (ni3Var.getContentView() instanceof n1a)) {
                ema titleTextView = this.actionBar.getTitleTextView();
                n1a n1aVar = (n1a) this.N0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    ul ulVar4 = this.F3;
                    if (rightDrawable == ulVar4) {
                        ulVar2 = ulVar4;
                    }
                }
                n1aVar.y(ulVar2, titleTextView);
            }
        }
    }

    public final void C2(boolean z) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.Y2 == 0 && this.a3 == 0 && Build.VERSION.SDK_INT >= 33 && so7.F0(parentActivity)) {
                if (z) {
                    showDialog(new so7(parentActivity, !jve.a(), new dh3(parentActivity, (byte) 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().V && this.W1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z) {
                    id idVar = jj.v(parentActivity, new qg3(this, (byte) 1)).a;
                    this.V1 = idVar;
                    showDialog(idVar);
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
            } else if ((i <= 28 || f11.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
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

    public final void C4(android.view.View r27, int r28, defpackage.c79 r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.C4(android.view.View, int, c79):void");
    }

    public final void C5() {
        kg5 kg5Var;
        boolean k5 = getMessagesController().k5();
        if (this.R3 != k5) {
            u5();
            if (!this.R3 && k5 && (kg5Var = this.q0) != null) {
                kg5Var.v();
            }
            this.R3 = k5;
        }
        zp4 zp4Var = this.u0;
        if (zp4Var == null) {
            return;
        }
        if (this.T0 == 10) {
            zp4Var.setImageResource(2131231198);
            this.u0.setContentDescription(ob6.M0(2131751319, null));
            return;
        }
        zp4Var.setImageResource(2131231109);
        this.u0.setContentDescription(ob6.M0(2131748024, null));
    }

    @Override
    public final List D() {
        return Arrays.asList(new dl4(ob6.M0(2131751613, null)), new dl4(ob6.M0(2131752041, null), new rg3(this, (byte) 28)), new dl4(ob6.M0(2131751614, null), new rg3(this, (byte) 29)));
    }

    public final void D2(CharSequence charSequence) {
        int i;
        if (this.D1 != null) {
            if (this.F2 == null && this.G2 == null && this.H2 == null) {
                return;
            }
            if (this.I2 == null) {
                sea seaVar = new sea(getParentActivity(), getResourceProvider());
                this.I2 = seaVar;
                seaVar.setLayoutClickListener(new wg3(this, (byte) 11));
                this.I2.setOnModeChangeListener(new xg3(this, (byte) 11));
                bi3 bi3Var = this.D1;
                sea seaVar2 = this.I2;
                if (seaVar2 == null) {
                    bi3Var.getClass();
                } else {
                    bi3Var.v2 = seaVar2;
                    bi3Var.addView(seaVar2, 0, tre.e(-1, 48, 51));
                    bi3Var.V3 = false;
                    bi3Var.S();
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
                    sea seaVar3 = this.I2;
                    seaVar3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        seaVar3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.H2;
                    if (charSequence2 != null) {
                        sea seaVar4 = this.I2;
                        seaVar4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            seaVar4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.D1.setFieldText(charSequence);
            }
            bi3 bi3Var2 = this.D1;
            if (z3()) {
                i = 2131754447;
            } else {
                i = 2131745190;
            }
            bi3Var2.setOverrideHint(ob6.M0(i, null));
            R2();
            if (this.I2.getMode() != 0) {
                this.D1.n2(false, false);
            }
            z5();
        }
    }

    public final void D3(int r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.D3(int):void");
    }

    public final boolean D4(View view, int i, float f, c79 c79Var) {
        gx9 gx9Var;
        long j;
        gx9 gx9Var2;
        TLRPC.EncryptedChat encryptedChat;
        long E;
        if (getParentActivity() != null && !(view instanceof uk3) && c79Var.d(i) != 21) {
            if (!this.actionBar.z() && !hl.O1() && !this.n2 && (view instanceof of3)) {
                of3 of3Var = (of3) view;
                if (!getMessagesController().v2(of3Var.getDialogId()) && !this.H3.c() && of3Var.a0(f)) {
                    return c5(of3Var);
                }
            }
            li3 li3Var = this.H3;
            if (li3Var == null || !li3Var.c()) {
                bj3 bj3Var = this.D0;
                boolean z = true;
                if (bj3Var != null && c79Var == (gx9Var2 = bj3Var.e0)) {
                    Object I = gx9Var2.I(i);
                    bj3 bj3Var2 = this.D0;
                    if (!bj3Var2.e0.O) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String M0 = ob6.M0(2131752019, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                idVar.U = ob6.a0("ClearSearchSingleChatAlertText", null, 2131752018, ro4.j(this.currentAccount, chat, false));
                            } else {
                                idVar.U = ob6.a0("ClearSearchSingleChatAlertText", null, 2131752018, chat.title);
                            }
                            E = -chat.id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.id == getUserConfig().n) {
                                idVar.U = ob6.a0("ClearSearchSingleChatAlertText", null, 2131752018, ob6.M0(2131745629, null));
                            } else {
                                idVar.U = ob6.a0("ClearSearchSingleUserAlertText", null, 2131752016, lv2.m(0, user.first_name, user.last_name));
                            }
                            E = user.id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            idVar.U = ob6.a0("ClearSearchSingleUserAlertText", null, 2131752016, lv2.m(0, X1.first_name, X1.last_name));
                            E = wf3.E(encryptedChat.id);
                        }
                        alertDialog$Builder.j(ob6.M0(2131752020, null), new i02(this, E, (byte) 1));
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                        showDialog(idVar);
                        TextView textView = (TextView) idVar.c(-1);
                        if (textView != null) {
                            yob.X(textView, aob.q7, getResourceProvider());
                        }
                        return true;
                    }
                    bj3Var = bj3Var2;
                }
                if (bj3Var != null && c79Var == (gx9Var = bj3Var.e0)) {
                    if (this.n2) {
                        C4(view, i, c79Var);
                        return false;
                    }
                    if ((view instanceof bv8) && !gx9Var.N(i)) {
                        j = ((bv8) view).getDialogId();
                    } else {
                        j = 0;
                    }
                    if (j != 0) {
                        h5(j, view);
                        return true;
                    }
                } else {
                    Object J = ((gk3) c79Var).J(i);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.n2) {
                            if ((this.T0 == 3 || e3()) && H5(dialog.id)) {
                                if (this.T0 == 1 && e3() && this.o2 && getMessagesController().v2(dialog.id)) {
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
                                    tzb tzbVar = new tzb(bundle);
                                    tzbVar.M0 = this;
                                    presentFragment(tzbVar);
                                    return false;
                                }
                                A2(dialog.id, view);
                                y5();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            B4(view);
                            return false;
                        } else if (!this.actionBar.z() || !H3(dialog)) {
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
        ii3 ii3Var = this.F0;
        float f4 = (1.0f - this.w3) * f * this.I0;
        float f5 = 1.0f - i3;
        ii3Var.setAlpha(f4 * f5);
        int i4 = 0;
        if (!this.L && !this.N) {
            if (this.M) {
                this.F0.setTranslationY((Math.max(this.O, -r3()) + (-hl.L(81.0f))) - hl.L(8.0f));
                this.F0.setProgressToCollapse(1.0f);
                ii3 ii3Var2 = this.F0;
                ii3Var2.setClipTop((int) (hl.m - ii3Var2.getY()));
            }
            f2 = 1.0f - this.I0;
            this.actionBar.setTranslationY(0.0f);
        } else {
            float i5 = Utilities.i((-this.O) / hl.L(81.0f), 1.0f, 0.0f);
            if (this.w3 == 1.0f) {
                i5 = 1.0f;
            }
            float i6 = Utilities.i(i5 / 0.5f, 1.0f, 0.0f);
            this.F0.setClipTop(0);
            if (!this.L && this.N) {
                this.F0.setTranslationY((-hl.L(81.0f)) - hl.L(8.0f));
                this.F0.setProgressToCollapse(1.0f);
                f3 = this.I0;
            } else {
                this.F0.setTranslationY(((this.U / 2.0f) + (Math.max(this.O, -r3()) + this.y3)) - hl.L(8.0f));
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
            aVar.getTitlesContainer().setPivotY(hl.m);
            this.actionBar.getTitlesContainer().setPivotX(hl.L(20.0f));
            float f7 = (0.6f * f6) + 0.4f;
            this.actionBar.getTitlesContainer().setScaleY(f7);
            this.actionBar.getTitlesContainer().setScaleX(f7);
            this.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            this.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-hl.L(30.0f));
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
                    sb.append(ob6.M0(2131745629, null));
                } else {
                    int size2 = arrayList.size();
                    int i2 = this.currentAccount;
                    if (size2 == 1) {
                        r = wf3.k(i2, longValue);
                    } else {
                        r = wf3.r(i2, longValue);
                    }
                    sb.append(r);
                }
            }
            return ob6.a0(null, null, 2131745167, sb.toString());
        }
        return ob6.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public final boolean E3() {
        if (this.A0 != null && this.T0 == 0 && !this.n2 && this.Y2 == 0 && this.a3 == 0 && getMessagesController().l2()) {
            return true;
        }
        return false;
    }

    public final void E4(View view) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i = 0; i < 4; i++) {
            if (yac.h(i).o()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        Collections.sort(arrayList, new f03((byte) 12));
        fu5 I = fu5.I(this, view);
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
                int i3 = aob.i6;
                Drawable Y = aob.Y(getThemedColor(i3), 0, 0);
                uob M = yob.M(i3);
                vnb resourceProvider = getResourceProvider();
                linearLayout.setBackground(Y);
                yob.j(linearLayout, Y, null, M, resourceProvider);
                TLRPC.User f = yac.h(intValue).f();
                rb0 rb0Var = new rb0((vnb) null);
                rb0Var.q(f);
                gj3 gj3Var = new gj3(this, getParentActivity(), z);
                linearLayout.addView(gj3Var, tre.t(34, 34, 16, 12, 0, 0, 0));
                de0 de0Var = new de0(getParentActivity());
                if (z) {
                    de0Var.setScaleX(0.833f);
                    de0Var.setScaleY(0.833f);
                }
                de0Var.setRoundRadius(hl.L(16.0f));
                de0Var.getImageReceiver().d = intValue;
                de0Var.f(f, rb0Var);
                gj3Var.addView(de0Var, tre.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                yob.X(textView, aob.j5, getResourceProvider());
                textView.setText(lbc.r(f));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, tre.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new ae(this, intValue, I, (byte) 7));
                I.q(linearLayout, tre.o(230, 48));
            }
        }
        ShapeDrawable b0 = aob.b0(hl.L(24.0f), getThemedColor(aob.d6));
        b0.getPaint().setShadowLayer(hl.L(6.0f), 0.0f, hl.L(1.0f), aob.p1(0.15f, -16777216));
        I.z.set(-hl.L(4.0f), -hl.L(4.0f), -hl.L(4.0f), -hl.L(4.0f));
        I.X(b0);
        I.b0(0.0f, -hl.L(4.0f));
        I.W(5);
        I.a0();
    }

    public final void E5(boolean z) {
        a aVar;
        boolean z2;
        boolean z3;
        c6b v3;
        ArrayList arrayList;
        boolean z4;
        boolean z5;
        int i;
        float f;
        float f2;
        if (this.F0 != null && this.J == null) {
            li3 li3Var = this.H3;
            if ((li3Var == null || !li3Var.c()) && !this.s3 && (aVar = this.actionBar) != null && !aVar.z() && !this.n2) {
                sbb sbbVar = sbb.G2;
                int i2 = 0;
                if ((sbbVar != null && sbbVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
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
                    ii3 ii3Var = this.F0;
                    if (z4 != z6) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    ii3Var.p(z, z5);
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
                        ofFloat.addUpdateListener(new ce0(this, (byte) 4));
                        this.K.addListener(new cn2(this, (byte) 8));
                        this.K.setDuration(200L);
                        this.K.setInterpolator(k43.f);
                        this.K.start();
                    } else {
                        ii3 ii3Var2 = this.F0;
                        if (z7 && !isInPreviewMode()) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        ii3Var2.setVisibility(i);
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
                        ofFloat2.addUpdateListener(new zi3(this, f5, z3, f3));
                        this.J.addListener(new ri3(this, z3, (byte) 2));
                        this.J.setDuration(200L);
                        this.J.setInterpolator(k43.f);
                        this.J.start();
                        return;
                    }
                    this.L = z3;
                    ii3 ii3Var3 = this.F0;
                    if ((z3 || this.M) && !isInPreviewMode()) {
                        i3 = 0;
                    }
                    ii3Var3.setVisibility(i3);
                    if (!z3) {
                        W4(0.0f);
                    } else {
                        this.A3 = -hl.L(81.0f);
                        W4(-q3());
                    }
                    while (true) {
                        tj3[] tj3VarArr = this.f0;
                        if (i2 >= tj3VarArr.length) {
                            break;
                        }
                        tj3 tj3Var = tj3VarArr[i2];
                        if (tj3Var != null) {
                            tj3Var.a.requestLayout();
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
            return (int) (this.A1.getInputBubbleHeight() + this.w.d() + hl.L(9.0f) + hl.L(7.0f) + hl.L(2.0f));
        }
        int i = (this.a3 > 0L ? 1 : (this.a3 == 0L ? 0 : -1));
        int i2 = this.m4;
        if (i != 0) {
            return hl.L(72.0f) + i2;
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
            ((b29) ((rb0) this.O1.h.getImageReceiver().n0).K).C(true);
        } catch (Exception unused) {
        }
        if (this.h4 == null) {
            zn5 zn5Var = new zn5(0, true, true);
            this.h4 = zn5Var;
            zn5Var.I = true;
            zn5Var.a = this;
            zn5Var.b = new fj3(this);
            getMediaDataController().z();
            getMessagesController().l3();
            getMessagesController().o3(this.classGuid, getUserConfig().f(), true);
        }
        TLRPC.User X1 = uc7.s1(this.currentAccount).X1(Long.valueOf(yac.h(this.currentAccount).e()));
        if (X1 == null) {
            X1 = yac.h(this.currentAccount).f();
        }
        if (X1 == null) {
            return;
        }
        n12 n12Var = this.h4.c;
        if (n12Var != null) {
            n12Var.I0();
        }
        zn5 zn5Var2 = this.h4;
        TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
        if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z = false;
        }
        zn5Var2.n(z, new rg3(this, (byte) 5), new tg3(this, (byte) 0), 0);
    }

    public final void F5(int i, boolean z) {
        boolean z2;
        if (this.A0 != null && this.T0 == 0 && !this.n2) {
            this.U3 = i;
            ac7 x3 = x3();
            this.U3 = -1;
            boolean z3 = false;
            if (x3 != null && getMessagesController().T0().size() > 1 && getMessagesController().u2(x3)) {
                z2 = true;
            } else {
                z2 = false;
            }
            ij3 ij3Var = this.A0;
            if (z && ij3Var.getVisibility() == 0) {
                z3 = true;
            }
            ij3Var.m(z2, z3);
        }
    }

    public final boolean G2() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.K2;
            if (i < arrayList.size()) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-((Long) arrayList.get(i)).longValue()));
                if (M0 != null && !xc2.l(M0)) {
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
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j));
        if (!lbc.w(X1)) {
            return false;
        }
        ArrayList l = uc7.s1(this.currentAccount).h4.l(-X1.id);
        if ((l != null && !l.isEmpty()) || !uc7.s1(this.currentAccount).h4.e(-X1.id)) {
            return false;
        }
        return true;
    }

    public final void G4() {
        if (!this.R3) {
            kg5 kg5Var = this.r0;
            if (kg5Var != null) {
                if (kg5Var.W) {
                    return;
                }
                hl.B2(kg5Var);
            }
            SpannableStringBuilder N2 = hl.N2(ob6.N0("StoriesPremiumHint2").replace('\n', ' '), aob.xj, 0, new ch3(this, (byte) 16), null);
            kg5 kg5Var2 = new kg5(getParentActivity(), 2);
            kg5Var2.q(8.0f);
            kg5Var2.d = 8000L;
            kg5Var2.j(true);
            kg5Var2.p(true);
            kg5Var2.h = hl.q.x - hl.L(148.0f);
            kg5Var2.t(N2);
            kg5Var2.n(1.0f, -40.0f);
            kg5Var2.i(getThemedColor(aob.wj));
            this.r0 = kg5Var2;
            kg5Var2.setTranslationY((-this.m4) - this.o4);
            ((ViewGroup) this.fragmentView).addView(this.r0, tre.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            this.r0.v();
            return;
        }
        kg5 kg5Var3 = this.q0;
        if (kg5Var3 != null) {
            kg5Var3.f(true);
        }
        xx n = uc7.s1(this.currentAccount).O1().n();
        if (n != null && n.a(this.currentAccount, 1)) {
            showDialog(new l46(n.b(), this.currentAccount, null, getParentActivity(), this));
            return;
        }
        sbb C = sbb.C(getParentActivity(), this.currentAccount);
        C.y = new ci3(this);
        C.Q(null);
    }

    public final void G5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.G5(int, boolean):void");
    }

    public final void H2() {
        int themedColor;
        mj8 mj8Var;
        xh3 xh3Var;
        gx9 gx9Var;
        qob qobVar;
        bj3 bj3Var = this.D0;
        if (bj3Var != null && (gx9Var = bj3Var.e0) != null && (qobVar = gx9Var.l0) != null) {
            int childCount = qobVar.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = qobVar.getChildAt(i);
                if (childAt instanceof fg5) {
                    fg5 fg5Var = (fg5) childAt;
                    rb0 rb0Var = fg5Var.c;
                    boolean D = wf3.D(fg5Var.f);
                    int i2 = fg5Var.h;
                    if (D) {
                        TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(fg5Var.f));
                        fg5Var.e = X1;
                        rb0Var.q(X1);
                    } else {
                        rb0Var.p(uc7.s1(i2).M0(Long.valueOf(-fg5Var.f)));
                        fg5Var.e = null;
                    }
                    fg5Var.c(true);
                }
            }
        }
        if (this.f0 != null) {
            int i3 = 0;
            while (true) {
                tj3[] tj3VarArr = this.f0;
                if (i3 >= tj3VarArr.length) {
                    break;
                }
                tj3 tj3Var = tj3VarArr[i3];
                if (tj3Var != null && (xh3Var = tj3Var.n) != null) {
                    xh3Var.h();
                }
                i3++;
            }
        }
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.I(getThemedColor(aob.G8), true);
            this.actionBar.J(getThemedColor(aob.E8), false, true);
            this.actionBar.J(getThemedColor(aob.F8), true, true);
            this.actionBar.K(getThemedColor(aob.I5), true);
            this.actionBar.updateColors();
        }
        if (this.F3 != null) {
            int themedColor2 = getThemedColor(aob.qi);
            Drawable drawable = this.M3;
            if (drawable != null && themedColor2 != this.D4) {
                this.D4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            ul ulVar = this.F3;
            if (ulVar != null) {
                ulVar.k(Integer.valueOf(themedColor2));
            }
            zm zmVar = this.G3;
            if (zmVar != null) {
                zmVar.setColor(themedColor2);
            }
        }
        uk3 uk3Var = this.O1;
        if (uk3Var != null) {
            aob.F1(uk3Var.getBackground(), aob.w0(null, aob.i6, false), true);
        }
        s7 s7Var = this.n0;
        if (s7Var != null) {
            s7Var.setIconColor(getThemedColor(aob.v8));
        }
        bi3 bi3Var = this.D1;
        if (bi3Var != null) {
            bi3Var.updateColors();
        }
        ij3 ij3Var = this.A0;
        if (ij3Var != null) {
            jl0 jl0Var = ij3Var.G0;
            if (jl0Var != null) {
                jl0Var.updateColors();
            }
            jo0 jo0Var = ij3Var.A0;
            if (jo0Var != null) {
                jo0Var.g();
            }
            ij3Var.invalidate();
        }
        rh4 rh4Var = this.c0;
        if (rh4Var != null) {
            rh4Var.updateColors();
        }
        bj3 bj3Var2 = this.D0;
        if (bj3Var2 != null && (mj8Var = bj3Var2.s0) != null) {
            mj8Var.c();
        }
        uic uicVar = this.b0;
        if (uicVar != null) {
            uicVar.updateColors();
        }
        ew9 ew9Var = this.a0;
        if (ew9Var != null) {
            ew9Var.updateColors();
        }
        if (this.L0 != null) {
            int o = vm2.o(getThemedColor(aob.d6), 100);
            boolean z = this.L0.getForeground() instanceof ColorDrawable;
            tb tbVar = this.L0;
            if (z) {
                if (((ColorDrawable) tbVar.getForeground()).getColor() != o) {
                    ((ColorDrawable) this.L0.getForeground()).setColor(o);
                }
            } else {
                tbVar.setForeground(new ColorDrawable(o));
            }
        }
        zp4 zp4Var = this.u0;
        if (zp4Var != null) {
            zp4Var.updateColors();
        }
        zp4 zp4Var2 = this.v0;
        if (zp4Var2 != null) {
            zp4Var2.updateColors();
        }
        int i4 = aob.d6;
        this.t4.a(getThemedColor(i4));
        xj3 xj3Var = this.L1;
        if (xj3Var != null) {
            xj3Var.updateColors();
        }
        wj3 wj3Var = this.M1;
        if (wj3Var != null) {
            wj3Var.setColor(aob.w0(null, i4, false));
        }
        zh3 zh3Var = this.J1;
        if (zh3Var != null) {
            zh3Var.updateColors();
        }
        zh3 zh3Var2 = this.H1;
        if (zh3Var2 != null) {
            zh3Var2.updateColors();
        }
        x5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        ii3 ii3Var = this.F0;
        if (ii3Var != null) {
            ii3Var.o();
        }
        if (this.E3 != null && (themedColor = getThemedColor(aob.Xl)) != this.C4) {
            this.C4 = themedColor;
            this.E3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        hj3 hj3Var = this.Y;
        if (hj3Var != null) {
            hj3Var.updateColors();
        }
    }

    public final boolean H3(TLRPC.Dialog dialog) {
        char c;
        if (dialog != null) {
            int i = this.f0[0].s;
            ac7 ac7Var = null;
            if ((i == 7 || i == 8) && (!this.actionBar.z() || this.actionBar.A(null))) {
                ac7[] ac7VarArr = getMessagesController().N;
                if (this.f0[0].s == 8) {
                    c = 1;
                } else {
                    c = 0;
                }
                ac7Var = ac7VarArr[c];
            }
            if (ac7Var != null) {
                if (ac7Var.j.indexOfKey(dialog.id) >= 0) {
                    return true;
                }
            } else {
                return dialog.pinned;
            }
        }
        return false;
    }

    public final boolean H4(tj3 tj3Var, TLRPC.Dialog dialog) {
        TLRPC.EncryptedChat a1;
        if (tj3Var != null && dialog != null) {
            if (!getMessagesController().p4.containsKey(Long.valueOf(dialog.id))) {
                if (K3(tj3Var)) {
                    return true;
                }
                ac7 s3 = s3(tj3Var);
                if (s3 != null) {
                    int i = s3.g;
                    int i2 = uc7.s5;
                    if ((i & 64) != 0) {
                        int i3 = this.currentAccount;
                        long j = dialog.id;
                        if (wf3.B(j) && (a1 = uc7.s1(i3).a1(Integer.valueOf((int) (4294967295L & j)))) != null) {
                            j = a1.user_id;
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
        TLRPC.Chat M0;
        bi3 bi3Var;
        if ((this.U0 <= 1 && ((bi3Var = this.D1) == null || bi3Var.getVisibility() != 0 || TextUtils.isEmpty(this.D1.getFieldText()))) || !wf3.y(j) || (M0 = getMessagesController().M0(Long.valueOf(-j))) == null || xc2.N(M0) || !M0.slowmode_enabled) {
            return true;
        }
        jj.r0(this, ob6.M0(2131745038, null), ob6.M0(2131745030, null), null);
        return false;
    }

    public final void I2() {
        hl.d3(new rg3(this, (byte) 7), 300L);
    }

    public final boolean I3(int i) {
        char c;
        if (i == 0) {
            return E3();
        }
        if ((i == 7 || i == 8) && this.T0 == 0) {
            uc7 messagesController = getMessagesController();
            ac7[] ac7VarArr = getMessagesController().N;
            if (i == 8) {
                c = 1;
            } else {
                c = 0;
            }
            if (messagesController.u2(ac7VarArr[c])) {
                return true;
            }
        }
        return false;
    }

    public final boolean I4(tj3 tj3Var) {
        if (tj3Var == null) {
            return false;
        }
        if (K3(tj3Var)) {
            return true;
        }
        ac7 s3 = s3(tj3Var);
        if (s3 != null) {
            int i = s3.g;
            int i2 = uc7.s5;
            if ((i & 64) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean J2(tj3 tj3Var) {
        if (!this.H3.c()) {
            int i = (int) (-this.O);
            int q3 = q3();
            int r3 = r3();
            if (i != 0 && i != q3 && i != r3 && tj3Var.a.canScrollVertically(-1)) {
                if (r3 < i && i < q3) {
                    int L = hl.L(48.0f);
                    int i2 = i - r3;
                    int i3 = L / 2;
                    lp lpVar = tj3Var.b;
                    if (i2 < i3) {
                        lpVar.z(-i2);
                        return true;
                    }
                    lpVar.z(L - i2);
                    return true;
                }
                float f = 1.0f;
                if (this.w3 != 1.0f) {
                    f = Utilities.i((-this.O) / hl.L(81.0f), 1.0f, 0.0f);
                }
                int i4 = (f > this.F0.C0 ? 1 : (f == this.F0.C0 ? 0 : -1));
                lp lpVar2 = tj3Var.b;
                if (i4 < 0) {
                    lpVar2.z(-i);
                    return true;
                }
                lpVar2.z(r3 - i);
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
            getMessagesController().V(1, j, z2);
            return;
        }
        if (chat != null) {
            if (xc2.r0(chat)) {
                getMessagesController().V(0, j, z2);
            } else {
                getMessagesController().e0(-j, getMessagesController().X1(Long.valueOf(getUserConfig().e())), null, z2, false);
            }
        } else {
            getMessagesController().V(0, j, z2);
            if (z && z2) {
                getMessagesController().u(j);
            }
        }
        if (hl.O1()) {
            getNotificationCenter().k(jn7.s, Long.valueOf(j));
        }
        getMessagesController().H(this.Y2);
    }

    public final boolean K2(long j) {
        int i;
        int i2 = this.T0;
        if (i2 != 15 && i2 != 16 && this.j2 == null && this.u2) {
            if (wf3.y(j)) {
                long j2 = -j;
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j2));
                if (xc2.T(M0) && !M0.megagroup) {
                    if (!this.s2) {
                        TLRPC.Chat M02 = uc7.s1(this.currentAccount).M0(Long.valueOf(j2));
                        if ((xc2.n(M02) || M02.megagroup) && (i = this.V0) != 2 && i != 3) {
                            return true;
                        }
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M03 = ob6.M0(2131745324, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M03;
                    int i3 = this.V0;
                    if (i3 == 3) {
                        idVar.U = ob6.M0(2131743744, null);
                    } else if (i3 == 2) {
                        idVar.U = ob6.M0(2131746314, null);
                    } else {
                        idVar.U = ob6.M0(2131752414, null);
                    }
                    alertDialog$Builder.g(ob6.M0(2131747558, null), null);
                    showDialog(idVar);
                    return false;
                }
                return true;
            } else if (wf3.B(j)) {
                if (this.V0 != 0 || this.W0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String M04 = ob6.M0(2131745324, null);
                    id idVar2 = alertDialog$Builder2.a;
                    idVar2.S = M04;
                    int i4 = this.V0;
                    if (i4 == 3) {
                        idVar2.U = ob6.M0(2131743743, null);
                    } else if (i4 != 0) {
                        idVar2.U = ob6.M0(2131746903, null);
                    } else {
                        idVar2.U = ob6.M0(2131748858, null);
                    }
                    alertDialog$Builder2.g(ob6.M0(2131747558, null), null);
                    showDialog(idVar2);
                    return false;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public final boolean K3(tj3 tj3Var) {
        if (tj3Var != null && I3(tj3Var.s)) {
            return true;
        }
        return false;
    }

    public final void K4(java.util.ArrayList r45, int r46, boolean r47, boolean r48, java.util.HashSet r49) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.K4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    public final void L2(boolean z) {
        ko2 ko2Var;
        TLRPC.ChatFull chatFull;
        boolean z2;
        xj3 xj3Var = this.L1;
        if (xj3Var != null && (ko2Var = this.S1) != null && (chatFull = this.c3) != null) {
            if (this.a3 != 0 && chatFull.requests_pending > 0 && !this.b.f) {
                z2 = true;
            } else {
                z2 = false;
            }
            xj3Var.j(ko2Var, z2, z);
            this.S1.setTitle(ob6.G(this.c3.requests_pending, "CommunityPendingRequestsRow", new Object[0]));
        }
    }

    public final void L3() {
        c21 c21Var = new c21(getParentActivity(), this.resourceProvider);
        c21Var.h(2131624009, new String[0]);
        c21Var.b.setText(ob6.M0(2131742442, null));
        v21.g(this, c21Var, 2750).j();
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void L4(long j, boolean z, ac7 ac7Var, int i, boolean z2) {
        int i2;
        boolean z3;
        int i3;
        boolean K3;
        int i4 = 0;
        if (this.f0[0].s == 0 && y3() && this.f0[0].w == 2) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int K0 = this.f0[0].c.K0();
        if (ac7Var != null) {
            int i5 = ac7Var.j.get(j, Integer.MIN_VALUE);
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
        if (ac7Var != null) {
            LongSparseIntArray longSparseIntArray = ac7Var.j;
            if (z) {
                longSparseIntArray.put(j, i);
            } else {
                longSparseIntArray.delete(j);
            }
            if (z2) {
                getMessagesController().F3(ac7Var);
            }
            K3 = true;
        } else {
            K3 = getMessagesController().K3(j, z, null, -1L);
        }
        if (K3) {
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
                    tj3 tj3Var = this.f0[0];
                    uh3 uh3Var = tj3Var.c;
                    if (tj3Var.s == 0 && y3() && this.f0[0].w == 2) {
                        i4 = 1;
                    }
                    uh3Var.g1(i4, (int) this.O);
                    return;
                } else if (i6 >= 0 && i3 == i6) {
                    hl.d3(new rg3(this, (byte) 26), 200L);
                    return;
                }
            }
            U4(false, true);
        }
    }

    public final void M2(defpackage.tj3 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.M2(tj3):void");
    }

    public final void M3(int i) {
        Object obj;
        b8c G = this.D0.r0.G(i);
        if (G != null) {
            obj = G.H;
        } else {
            obj = null;
        }
        if (obj instanceof TLRPC.User) {
            int i2 = this.currentAccount;
            long j = ((TLRPC.User) obj).id;
            e e0 = rr0.e0(i2, j);
            if (e0 == null) {
                e0 = ProfileActivity.Q2(j);
            }
            presentFragment(e0);
        } else if (obj instanceof r47) {
            r47 r47Var = (r47) obj;
            Bundle bundle = new Bundle();
            int i3 = (r47.B0(r47Var.k) > 0L ? 1 : (r47.B0(r47Var.k) == 0L ? 0 : -1));
            TLRPC.Message message = r47Var.k;
            if (i3 >= 0) {
                bundle.putLong("user_id", r47.B0(message));
            } else {
                bundle.putLong("chat_id", -r47.B0(message));
            }
            bundle.putInt("message_id", r47Var.e1());
            zu1 zu1Var = new zu1(bundle);
            C3(zu1Var, r47Var);
            presentFragment(zu1Var);
        }
    }

    public final void M4() {
        if (this.L0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(aob.d6));
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
        bx9 bx9Var = this.D0.r0;
        if (i >= bx9Var.a0 && i < bx9Var.b0) {
            b8c G = bx9Var.G(i);
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
            String M0 = ob6.M0(2131754173, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.a0(null, null, 2131754172, "\"" + lbc.r(user) + "\"");
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            alertDialog$Builder.j(ob6.M0(2131746048, null), new q72(this, (TLRPC.User) obj, (byte) 24));
            alertDialog$Builder.c(-1);
            alertDialog$Builder.o();
        }
    }

    public final void N4(boolean z) {
        tj3[] tj3VarArr = this.f0;
        if (tj3VarArr != null && !this.U1) {
            for (tj3 tj3Var : tj3VarArr) {
                if (tj3Var.getVisibility() == 0) {
                    if (z) {
                        sh3 sh3Var = tj3Var.y;
                        sh3Var.D();
                        sh3Var.A = true;
                    }
                    tj3Var.b(z);
                    M2(tj3Var);
                }
            }
        }
        ij3 ij3Var = this.A0;
        if (ij3Var != null && ij3Var.getVisibility() == 0) {
            this.A0.d();
        }
    }

    public final void O2() {
        if (this.f0 != null) {
            int F2 = F2();
            int i = 0;
            while (true) {
                tj3[] tj3VarArr = this.f0;
                if (i < tj3VarArr.length) {
                    tj3 tj3Var = tj3VarArr[i];
                    if (tj3Var != null) {
                        qj3 qj3Var = tj3Var.a;
                        qj3Var.setPadding(0, qj3Var.g3, 0, F2);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void O3(tj3 tj3Var, View view, int i) {
        int i2;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof p55) {
            return;
        }
        boolean z = view instanceof of3;
        if (z) {
            of3 of3Var = (of3) view;
            if (of3Var.o2) {
                i5(of3Var.getDialogId(), view);
                return;
            }
        }
        if (e3()) {
            D4(view, i, 0.0f, tj3Var.d);
            return;
        }
        int i3 = this.T0;
        if (i3 == 15 && (view instanceof skb)) {
            tj3Var.d.L();
            return;
        }
        int i4 = 0;
        if ((i3 == 11 || i3 == 13) && i == 1) {
            Bundle l = bs2.l("forImport", true);
            l.putLongArray("result", new long[]{getUserConfig().e()});
            l.putInt("chatType", 4);
            String string = this.arguments.getString("importTitle");
            if (string != null) {
                l.putString("title", string);
            }
            xc5 xc5Var = new xc5(l);
            xc5Var.Z = new vh3(this);
            presentFragment(xc5Var);
            return;
        }
        if ((view instanceof uk3) && ((i2 = tj3Var.s) == 7 || i2 == 8)) {
            ek3 ek3Var = (ek3) tj3Var.d.N.get(0);
            if (ek3Var != null && ek3Var.a == 17) {
                tL_chatlists_chatlistUpdates = ek3Var.i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                ac7 ac7Var = getMessagesController().N[tj3Var.s - 7];
                if (ac7Var != null) {
                    int i5 = ac7Var.a;
                    ?? ny0Var = new ny0(this, false);
                    ny0Var.T1 = -1;
                    ny0Var.X1 = "";
                    ny0Var.Y1 = new ArrayList();
                    ny0Var.a2 = "";
                    ny0Var.c2 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    ny0Var.d2 = arrayList;
                    ny0Var.u2 = -1;
                    ny0Var.x2 = -5;
                    ny0Var.T1 = i5;
                    ny0Var.V1 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    ny0Var.b2 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList arrayList2 = getMessagesController().G0;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i4 >= arrayList2.size()) {
                                break;
                            } else if (((ac7) arrayList2.get(i4)).a == i5) {
                                ny0Var.X1 = ((ac7) arrayList2.get(i4)).b;
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                    ny0Var.b1();
                    showDialog(ny0Var);
                    return;
                }
                return;
            }
        } else if (z && !this.actionBar.z() && !this.H3.c()) {
            ImageReceiver imageReceiver = ((of3) view).Z1;
            hl.P.set(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x());
        }
        C4(view, i, tj3Var.d);
    }

    public final void O4(tj3 tj3Var) {
        int i;
        tk4 tk4Var;
        if (tj3Var.getVisibility() != 0) {
            return;
        }
        int i2 = tj3Var.d.w;
        if (tj3Var.s == 0 && y3() && tj3Var.a.getChildCount() == 0 && tj3Var.w == 2) {
            ((x46) tj3Var.a.getLayoutManager()).g1(1, (int) this.O);
        }
        tj3Var.d.getClass();
        tj3Var.d.Q();
        int b = tj3Var.d.b();
        if (b == 1 && i2 == 1 && tj3Var.d.d(0) == 5) {
            tj3Var.b(true);
        } else {
            tj3Var.b(false);
            if (b > i2 && (i = this.T0) != 11 && i != 12 && i != 13) {
                tj3Var.E.b(i2);
            }
        }
        try {
            qj3 qj3Var = tj3Var.a;
            if (this.Y2 == 0 && this.a3 == 0) {
                tk4Var = tj3Var.x;
            } else {
                tk4Var = null;
            }
            qj3Var.setEmptyView(tk4Var);
        } catch (Exception e) {
            cc4.g(e, true);
        }
        M2(tj3Var);
    }

    public final void P2() {
        z92 z92Var = this.A1;
        if (z92Var != null) {
            z92Var.setBlurredBottomHeight(this.A1.getInputBubbleHeight() + this.w.d() + hl.L(9.0f) + hl.L(7.0f));
        }
    }

    public final void P3() {
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).w()) {
            finishPreviewFragment();
        } else if (this.T0 == 10) {
            if (this.E2 != null) {
                ArrayList arrayList = this.K2;
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < arrayList.size(); i++) {
                        arrayList2.add(jf7.a(((Long) arrayList.get(i)).longValue(), 0L));
                    }
                    this.E2.q(this, arrayList2, null, false, this.L2, this.M2, this.N2, null);
                }
            }
        } else if (uc7.s1(this.currentAccount).x2()) {
            i5.b(this.currentAccount);
        } else {
            presentFragment(new ContactsActivity(bs2.l("destroyAfterSelect", true)));
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
            animatorSet.setInterpolator(k43.f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    public final void Q2() {
        int i;
        tj3 tj3Var;
        boolean z = true;
        float p3 = p3(true);
        ij3 ij3Var = this.A0;
        if (ij3Var != null) {
            if (ij3Var.getAlpha() == p3) {
                z = false;
            }
            float R1 = hl.R1(0.98f, 1.0f, p3);
            this.A0.setAlpha(p3);
            this.A0.setScaleX(R1);
            this.A0.setScaleY(R1);
            ij3 ij3Var2 = this.A0;
            if (p3 > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            ij3Var2.setVisibility(i);
            if (z && (tj3Var = this.f0[0]) != null) {
                tj3Var.a.requestLayout();
            }
        }
        o5();
    }

    public final void Q3() {
        uc7.s1(this.currentAccount).Y3.edit().putBoolean("storyhint", false).commit();
    }

    public final void Q4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.Q4(int):void");
    }

    public final void R2() {
        int i;
        int i2;
        float f = this.n.e;
        float R1 = hl.R1(0.2f, 1.0f, f);
        di3 di3Var = this.E1;
        int i3 = 8;
        if (di3Var != null) {
            di3Var.setScaleX(R1);
            this.E1.setScaleY(R1);
            this.E1.setAlpha(f);
            di3 di3Var2 = this.E1;
            if (f > 0.0f) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            di3Var2.setVisibility(i2);
        }
        z92 z92Var = this.A1;
        if (z92Var != null) {
            z92Var.setAlpha(f);
            z92 z92Var2 = this.A1;
            int i4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i4 > 0) {
                i = 0;
            } else {
                i = 8;
            }
            z92Var2.setVisibility(i);
            this.A1.getFadeView().setAlpha(f);
            View fadeView = this.A1.getFadeView();
            if (i4 > 0) {
                i3 = 0;
            }
            fadeView.setVisibility(i3);
        }
    }

    public final void R3(id[] idVarArr) {
        gp2.e(idVarArr, this, this.currentAccount, this.b3);
    }

    public final void R4(boolean z, boolean z2) {
        int i;
        int i2;
        li3 li3Var = this.H3;
        if (li3Var != null && li3Var.c()) {
            return;
        }
        if (this.f0[0].s == 0 && y3() && this.f0[0].w == 2) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.L && !z2 && !this.F0.g()) {
            i2 = -hl.L(81.0f);
        } else {
            i2 = 0;
        }
        tj3[] tj3VarArr = this.f0;
        if (z) {
            hw6 hw6Var = tj3VarArr[0].r;
            hw6Var.b = 1;
            hw6Var.k(i, i2, false, false);
            P4();
            return;
        }
        tj3VarArr[0].c.g1(i, i2);
        P4();
    }

    public final void S2() {
        if (this.actionBar == null) {
            return;
        }
        zp4.d(this.actionBar.getBackButton(), Math.max(this.w3, (1.0f - this.b.e) * (1.0f - t3()) * (1.0f - this.c.e)));
    }

    public final void S3(id idVar, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        try {
            idVar.dismiss();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (tLObject != null) {
            this.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            kt ktVar = new kt(this, j, (byte) 14);
            Pattern pattern = jj.a;
            if (getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = getCurrentAccount();
                    Activity parentActivity = getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long e2 = yac.h(currentAccount).e();
                    TextView textView = new TextView(parentActivity);
                    yob.X(textView, aob.j5, null);
                    textView.setTextSize(1, 16.0f);
                    if (ob6.a0) {
                        i = 5;
                    } else {
                        i = 3;
                    }
                    textView.setGravity(i | 48);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    alertDialog$Builder.n(frameLayout);
                    rb0 rb0Var = new rb0((vnb) null);
                    rb0Var.s(hl.L(12.0f));
                    de0 de0Var = new de0(parentActivity);
                    de0Var.setRoundRadius(hl.L(20.0f));
                    if (ob6.a0) {
                        i2 = 5;
                    } else {
                        i2 = 3;
                    }
                    frameLayout.addView(de0Var, tre.d(40, 40.0f, i2 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(parentActivity);
                    qd4.w(textView2, aob.E8, null, 1, 20.0f);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    if (ob6.a0) {
                        i3 = 5;
                    } else {
                        i3 = 3;
                    }
                    textView2.setGravity(i3 | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setText(ob6.M0(2131748999, null));
                    boolean z = ob6.a0;
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
                    frameLayout.addView(textView2, tre.d(-1, -2.0f, i8, f, 11.0f, i6, 0.0f));
                    if (ob6.a0) {
                        i7 = 5;
                    } else {
                        i7 = 3;
                    }
                    frameLayout.addView(textView, tre.d(-2, -2.0f, i7 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                    if (user != null) {
                        if (lbc.B(user)) {
                            rb0Var.p = 0.8f;
                            rb0Var.f(12);
                            de0Var.m(null, null, rb0Var, user);
                        } else if (user.id == e2) {
                            rb0Var.p = 0.8f;
                            rb0Var.f(1);
                            de0Var.m(null, null, rb0Var, user);
                        } else {
                            rb0Var.p = 1.0f;
                            rb0Var.q(user);
                            de0Var.f(user, rb0Var);
                        }
                    } else {
                        rb0Var.p(chat);
                        de0Var.f(chat, rb0Var);
                    }
                    textView.setText(hl.S2(str));
                    alertDialog$Builder.j(ob6.M0(2131749019, null), new m0(ktVar, (byte) 10));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    showDialog(alertDialog$Builder.a);
                    return;
                }
                return;
            }
            return;
        }
        jj.c0(this.currentAccount, tL_error, this, tL_messages_checkHistoryImportPeer, new Object[0]);
        getNotificationCenter().k(jn7.v1, Long.valueOf(j), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public final void S4(String str, boolean z) {
        k5(true, false, true, false);
        rw9 rw9Var = this.Z;
        if (rw9Var != null) {
            rw9Var.b(true);
        }
        hj3 hj3Var = this.Y;
        if (hj3Var != null) {
            hj3Var.r.setText(str);
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
        zp4.d(this.h0, xnb.C(f, 1.0f - this.b.e, 1.0f - t3(), 1.0f - this.c.e));
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
        tj3[] tj3VarArr;
        this.d0 = f;
        for (tj3 tj3Var : this.f0) {
            qj3 qj3Var = tj3Var.a;
            for (int i = 0; i < qj3Var.getChildCount(); i++) {
                View childAt = qj3Var.getChildAt(i);
                if (childAt != null && RecyclerView.S(childAt) >= tj3Var.d.f + 1) {
                    childAt.setAlpha(f);
                }
            }
        }
    }

    public final void U2() {
        float f;
        if (xea.r.isEmpty()) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        zp4.d(this.g0, xnb.C(f, 1.0f - this.b.e, 1.0f - t3(), 1.0f - this.c.e));
    }

    public final void U3() {
        if (this.f0 == null) {
            return;
        }
        if (!this.U1 && !this.isPaused) {
            this.S3 = false;
            getMessagesController().h5(null);
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
            tj3 tj3Var = this.f0[0];
            tj3Var.d.H = z;
            if (!z && z2) {
                boolean e0 = tj3Var.a.e0();
                tj3[] tj3VarArr = this.f0;
                if (e0) {
                    tj3VarArr[0].a.post(new rg3(this, (byte) 0));
                } else {
                    tj3VarArr[0].d.f();
                }
            }
        }
    }

    public final void V2() {
        float f;
        if (this.T0 != 2) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        zp4.d(this.k0, xnb.C(f, this.f.e, 1.0f - t3(), 1.0f - this.c.e));
        ii3 ii3Var = this.F0;
        if (ii3Var != null) {
            ii3Var.invalidate();
        }
    }

    public final void V3(int i, fu5 fu5Var) {
        CharSequence charSequence;
        if (this.currentAccount != i) {
            fu5Var.u();
            if (getParentActivity() == null) {
                return;
            }
            oj3 oj3Var = this.E2;
            LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
            ArrayList arrayList = this.F2;
            String str = this.G2;
            CharSequence charSequence2 = this.H2;
            bi3 bi3Var = this.D1;
            if (bi3Var != null) {
                charSequence = bi3Var.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.N0(i);
            uj3 uj3Var = new uj3(this.arguments);
            uj3Var.E2 = oj3Var;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    uj3Var.F2 = null;
                } else {
                    uj3Var.F2 = arrayList;
                    uj3Var.G2 = null;
                    uj3Var.O2 = false;
                    if (uj3Var.D1 != null) {
                        uj3Var.D2(charSequence);
                    } else {
                        uj3Var.b4 = charSequence;
                    }
                }
            } else if (str != null) {
                uj3Var.Y4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    uj3Var.H2 = null;
                } else {
                    uj3Var.H2 = charSequence2;
                    uj3Var.G2 = null;
                    uj3Var.F2 = null;
                    if (uj3Var.D1 != null) {
                        uj3Var.D2(charSequence);
                    } else {
                        uj3Var.b4 = charSequence;
                    }
                }
            }
            launchActivity.u0(uj3Var, false, true);
        }
    }

    public final void V4(boolean z) {
        tj3 tj3Var;
        if (xea.o() > 1 && i86.e(32768)) {
            tj3[] tj3VarArr = this.f0;
            if (z) {
                if (tj3VarArr != null && (tj3Var = tj3VarArr[0]) != null) {
                    tj3Var.setLayerType(2, null);
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
            if (tj3VarArr != null) {
                int i = 0;
                while (true) {
                    tj3[] tj3VarArr2 = this.f0;
                    if (i >= tj3VarArr2.length) {
                        break;
                    }
                    tj3 tj3Var2 = tj3VarArr2[i];
                    if (tj3Var2 != null) {
                        tj3Var2.setLayerType(0, null);
                        tj3Var2.setClipChildren(true);
                        tj3Var2.setClipToPadding(true);
                        tj3Var2.a.setClipChildren(true);
                    }
                    i++;
                }
            }
            a aVar2 = this.actionBar;
            if (aVar2 != null) {
                aVar2.setLayerType(0, null);
            }
            ii3 ii3Var = this.F0;
            if (ii3Var != null) {
                ii3Var.setLayerType(0, null);
            }
            View view2 = this.fragmentView;
            if (view2 != null) {
                ((ViewGroup) view2).setClipChildren(true);
                this.fragmentView.requestLayout();
            }
        }
    }

    @Override
    public final boolean W(MotionEvent motionEvent, boolean z) {
        li3 li3Var;
        tb tbVar;
        ij3 ij3Var;
        boolean z2;
        boolean z3;
        if (!this.s3 && (((li3Var = this.H3) == null || !li3Var.c()) && (((tbVar = this.L0) == null || tbVar.getVisibility() != 0) && ((ij3Var = this.A0) == null || !ij3Var.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                ij3 ij3Var2 = this.A0;
                if (ij3Var2 != null && ij3Var2.getTabsCount() >= 2 && this.A0.getCurrentTabId() != this.A0.getFirstTabId()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                ij3 ij3Var3 = this.A0;
                if (ij3Var3 != null && ij3Var3.getTabsCount() >= 2 && this.A0.getCurrentTabId() != this.A0.getLastTabId()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                xea.m(this.currentAccount);
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

    public final void W2() {
        zp4.d(this.m0, xnb.C(this.b.e, 1.0f - t3(), 1.0f - this.c.e, this.d.e));
    }

    public final void W3() {
        uc7.s1(this.currentAccount).j0(null);
    }

    public final void W4(float f) {
        tj3[] tj3VarArr = this.f0;
        int i = 0;
        if (tj3VarArr != null) {
            int paddingTop = tj3VarArr[0].a.getPaddingTop() + ((int) f);
            int i2 = 0;
            while (true) {
                tj3[] tj3VarArr2 = this.f0;
                if (i2 >= tj3VarArr2.length) {
                    break;
                }
                tj3VarArr2[i2].a.setTopGlowOffset(paddingTop);
                i2++;
            }
        }
        if (this.fragmentView != null && f != this.O) {
            this.O = f;
            v21 v21Var = this.q3;
            if (v21Var != null) {
                v21Var.l();
            }
            if (this.G3 != null) {
                float currentActionBarHeight = 1.0f - ((-f) / a.getCurrentActionBarHeight());
                zm zmVar = this.G3;
                float f2 = (int) f;
                float f3 = zmVar.f;
                zmVar.h = f2;
                zmVar.setTranslationY(f3 + f2);
                this.G3.setAlpha(ete.a(currentActionBarHeight, 0.0f, 1.0f));
                zm zmVar2 = this.G3;
                if (currentActionBarHeight <= 0.0f) {
                    i = 4;
                }
                zmVar2.setVisibility(i);
            }
            a3();
            this.fragmentView.invalidate();
        }
    }

    public final void X2() {
        boolean z;
        tb tbVar;
        if (!this.l2 && ((tbVar = this.L0) == null || tbVar.getBackground() == null || this.L0.getAlpha() < 0.01f || this.L0.getVisibility() == 8)) {
            z = true;
        } else {
            z = false;
        }
        aj3 aj3Var = this.K3;
        if (aj3Var != null) {
            ((fj6) aj3Var.b).E.a(z, true);
        }
    }

    public final void X3() {
        if (this.h4.g()) {
            uc7.s1(this.currentAccount).v4(0L, "USERPIC_SETUP");
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
        if (xea.o() != 0) {
            i86.e(32768);
        }
        o5();
    }

    public final void Y2() {
        S2();
        zp4.d(this.l0, (1.0f - this.b.e) * (1.0f - t3()) * (1.0f - this.c.e));
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
            uc7 messagesController = getMessagesController();
            messagesController.j0 = false;
            messagesController.getNotificationCenter().k(jn7.r, Boolean.TRUE);
            getMessagesController().H(this.Y2);
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
            i = 2131745434;
        } else {
            i = 2131745541;
        }
        String M0 = ob6.M0(i, null);
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
        if (i == 103 && xc2.T(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || xc2.t0(chat2)) {
                getMessagesController().V(2, j, z2);
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
                    uj3.this.J4(i, j, chat2, z, z2);
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
        if (xea.o() <= 0) {
            boolean z = f11.a;
        } else if (this.d4 != f) {
            boolean z2 = true;
            if (xea.o() > 1 && i86.e(32768)) {
                z2 = false;
            }
            this.e4 = z2;
            this.d4 = f;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.e4) {
                float f2 = (1.0f - this.d4) * (-hl.L(40.0f));
                ii3 ii3Var = this.F0;
                if (ii3Var != null) {
                    ii3Var.setTranslationX(f2);
                }
                hj3 hj3Var = this.Y;
                if (hj3Var != null) {
                    hj3Var.setTranslationX(f2);
                }
                li3 li3Var = this.H3;
                if (li3Var != null && li3Var.getFragmentView() != null && !this.E) {
                    this.H3.getFragmentView().setTranslationX(f2);
                    return;
                }
                return;
            }
            float f3 = 1.0f - this.d4;
            float f4 = (-hl.L(4.0f)) * f3;
            float f5 = 1.0f - (f3 * 0.05f);
            ii3 ii3Var2 = this.F0;
            if (ii3Var2 != null) {
                ii3Var2.setScaleX(f5);
                this.F0.setScaleY(f5);
                this.F0.setTranslationX(f4);
                this.F0.setPivotX(0.0f);
                this.F0.setPivotY(0.0f);
            }
            hj3 hj3Var2 = this.Y;
            if (hj3Var2 != null) {
                hj3Var2.setTranslationX(f4);
                this.Y.setScaleX(f5);
                this.Y.setScaleY(f5);
            }
            li3 li3Var2 = this.H3;
            if (li3Var2 != null && li3Var2.getFragmentView() != null) {
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
        float a = 1.0f - ete.a(((-this.O) - r3()) / hl.L(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.w3, this.h.e);
        float f2 = this.b.e;
        if (this.T0 != 2) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float max2 = f * (1.0f - this.c.e) * (1.0f - max) * Math.max(f2, (1.0f - t3()) * a);
        this.Y.setAlpha(max2);
        hj3 hj3Var = this.Y;
        boolean z = false;
        if (max2 > 0.0f) {
            i = 0;
        } else {
            i = 8;
        }
        hj3Var.setVisibility(i);
        if (max2 <= 0.01f) {
            z = true;
        }
        this.f.a(z, true);
    }

    public final void a4() {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", yac.h(this.currentAccount).e());
        presentFragment(new zu1(bundle));
    }

    public final void a5(tj3 tj3Var, float f) {
        int i;
        if (this.U != f) {
            this.U = f;
            int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i2 == 0) {
                this.V = false;
            }
            this.F0.setOverscroll(f);
            tj3Var.a.setViewsOffset(f);
            qj3 qj3Var = tj3Var.a;
            if (i2 != 0) {
                i = 2;
            } else {
                i = 0;
            }
            qj3Var.setOverScrollMode(i);
            this.fragmentView.invalidate();
            if (f > hl.L(90.0f) && !this.V) {
                ii3 ii3Var = this.F0;
                ValueAnimator valueAnimator = ii3Var.I0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    ii3Var.i(ii3Var.q0, true);
                    this.V = true;
                    getOrCreateStoryViewer().t(new ch3(this, (byte) 0));
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.Zk));
        hashSet.add(Integer.valueOf(aob.Yk));
        hashSet.add(Integer.valueOf(aob.dl));
        hashSet.add(Integer.valueOf(aob.cl));
        hashSet.add(Integer.valueOf(aob.bl));
        hashSet.add(Integer.valueOf(aob.al));
        hashSet.add(Integer.valueOf(aob.Ti));
        hashSet.add(Integer.valueOf(aob.g8));
        hashSet.add(Integer.valueOf(aob.Ne));
        hashSet.add(Integer.valueOf(aob.Jj));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.Me));
        hashSet.add(Integer.valueOf(aob.Le));
        hashSet.add(Integer.valueOf(aob.Ke));
        hashSet.add(Integer.valueOf(aob.Je));
        hashSet.add(Integer.valueOf(aob.yj));
        hashSet.add(Integer.valueOf(aob.wj));
        hashSet.add(Integer.valueOf(aob.xj));
        hashSet.add(Integer.valueOf(aob.T8));
        hashSet.add(Integer.valueOf(aob.f9));
        hashSet.add(Integer.valueOf(aob.W8));
        hashSet.add(Integer.valueOf(aob.V8));
        hashSet.add(Integer.valueOf(aob.U8));
        hashSet.add(Integer.valueOf(aob.S9));
        hashSet.add(Integer.valueOf(aob.R9));
        hashSet.add(Integer.valueOf(aob.g9));
        hashSet.add(Integer.valueOf(aob.m9));
        hashSet.add(Integer.valueOf(aob.Zl));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.e9));
        hashSet.add(Integer.valueOf(aob.d9));
        hashSet.add(Integer.valueOf(aob.c9));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.M7));
        hashSet.add(Integer.valueOf(aob.N7));
        hashSet.add(Integer.valueOf(aob.h9));
        hashSet.add(Integer.valueOf(aob.n9));
        hashSet.add(Integer.valueOf(aob.l9));
        hashSet.add(Integer.valueOf(aob.Y8));
        hashSet.add(Integer.valueOf(aob.o9));
        hashSet.add(Integer.valueOf(aob.j9));
        hashSet.add(Integer.valueOf(aob.k9));
        hashSet.add(Integer.valueOf(aob.L7));
        hashSet.add(Integer.valueOf(aob.b8));
        hashSet.add(Integer.valueOf(aob.a8));
        hashSet.add(Integer.valueOf(aob.Z7));
        hashSet.add(Integer.valueOf(aob.Y7));
        hashSet.add(Integer.valueOf(aob.X7));
        hashSet.add(Integer.valueOf(aob.W7));
        hashSet.add(Integer.valueOf(aob.V7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.K7));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.p6));
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.k7));
        hashSet.add(Integer.valueOf(aob.qk));
        hashSet.add(Integer.valueOf(aob.Z5));
        hashSet.add(Integer.valueOf(aob.B9));
        hashSet.add(Integer.valueOf(aob.z9));
        hashSet.add(Integer.valueOf(aob.A9));
        hashSet.add(Integer.valueOf(aob.y9));
        hashSet.add(Integer.valueOf(aob.x9));
        hashSet.add(Integer.valueOf(aob.w9));
        hashSet.add(Integer.valueOf(aob.v9));
        hashSet.add(Integer.valueOf(aob.u9));
        hashSet.add(Integer.valueOf(aob.t9));
        hashSet.add(Integer.valueOf(aob.s9));
        hashSet.add(Integer.valueOf(aob.r9));
        hashSet.add(Integer.valueOf(aob.q9));
        hashSet.add(Integer.valueOf(aob.p9));
        hashSet.add(Integer.valueOf(aob.i9));
        hashSet.add(Integer.valueOf(aob.Z8));
        hashSet.add(Integer.valueOf(aob.X8));
        hashSet.add(Integer.valueOf(aob.b9));
        hashSet.add(Integer.valueOf(aob.a9));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.U9));
        hashSet.add(Integer.valueOf(aob.T9));
        hashSet.add(Integer.valueOf(aob.yi));
        hashSet.add(Integer.valueOf(aob.I5));
        hashSet.add(Integer.valueOf(aob.E8));
        hashSet.add(Integer.valueOf(aob.G8));
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
            float R1 = hl.R1(0.98f, 1.0f, f2);
            this.a0.setScaleX(R1);
            this.a0.setScaleY(R1);
            this.a0.setAlpha(f2);
            ew9 ew9Var = this.a0;
            if (f2 > 0.0f) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            ew9Var.setVisibility(i2);
        }
        uic uicVar = this.b0;
        fm0 fm0Var = this.s;
        if (uicVar != null) {
            float f3 = 1.0f - fm0Var.e;
            uicVar.setAlpha(f3);
            uic uicVar2 = this.b0;
            if (f3 > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            uicVar2.setVisibility(i);
        }
        rh4 rh4Var = this.c0;
        if (rh4Var != null) {
            float f4 = fm0Var.e;
            rh4Var.setAlpha(f4);
            rh4 rh4Var2 = this.c0;
            if (f4 > 0.0f) {
                i3 = 0;
            }
            rh4Var2.setVisibility(i3);
        }
    }

    public final void b4(TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, this.currentAccount, tL_attachMenuBot, null, true);
        ls6 d0 = ls6.d0(this.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = d0.b;
        if (tL_attachMenuBots != null) {
            d0.getMessagesStorage().a.c(new r77(d0, tL_attachMenuBots, d0.a, d0.e, (byte) 7));
        }
    }

    public final void b5() {
        getContactsController().B();
        zr zrVar = new zr(getParentActivity(), this.currentAccount, getResourceProvider(), new wd3(this, r1, (byte) 2), new zg3(r1, (byte) 0));
        nx0 i = ik8.i(getParentActivity(), false, 1, getResourceProvider());
        i.O = zrVar;
        i.U0 = (byte) 49;
        i.show();
        nx0[] nx0VarArr = {i};
        i.L(aob.h5);
    }

    public final void c3(boolean z) {
        int i;
        int i2;
        if (this.D0 != null && this.actionBar != null) {
            int i3 = hl.n;
            int measuredHeight = this.actionBar.getMeasuredHeight() + hl.L(this.a);
            if (this.b0 != null) {
                i = hl.L(50.0f);
            } else {
                i = 0;
            }
            int i4 = measuredHeight + i;
            xj3 xj3Var = this.L1;
            if (xj3Var != null) {
                i2 = (int) xj3Var.c(hl.L(7.0f));
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            bj3 bj3Var = this.D0;
            SparseArray sparseArray = bj3Var.h;
            bj3Var.X0 = i5;
            bj3Var.Y0 = i3;
            gw9 gw9Var = bj3Var.b0;
            if (z) {
                gw9Var.r1(0, i5, 0, i3);
            } else {
                gw9Var.setPadding(0, i5, 0, i3);
            }
            bj3Var.P0.j(bj3Var.X0, bj3Var.Y0, z);
            ax9 ax9Var = bj3Var.c0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ax9Var.getLayoutParams();
            int i6 = marginLayoutParams.topMargin;
            int i7 = bj3Var.X0;
            if (i6 != i7 || marginLayoutParams.bottomMargin != bj3Var.Y0) {
                marginLayoutParams.topMargin = i7;
                marginLayoutParams.bottomMargin = bj3Var.Y0;
                ax9Var.requestLayout();
            }
            nx9.R(bj3Var.i0, bj3Var.l0, bj3Var.X0, bj3Var.Y0, z);
            nx9.R(bj3Var.n0, bj3Var.q0, bj3Var.X0, bj3Var.Y0, z);
            nx9.R(bj3Var.u0, bj3Var.x0, bj3Var.X0, bj3Var.Y0, z);
            mj8 mj8Var = bj3Var.s0;
            int i8 = bj3Var.X0;
            int i9 = bj3Var.Y0;
            mj8Var.setClipToPadding(false);
            q9c q9cVar = mj8Var.c;
            mj8Var.K = z;
            mj8Var.setPadding(0, i8, 0, i9);
            if (z) {
                q9cVar.r1(0, i8, 0, i9);
            } else {
                q9cVar.setPadding(0, i8, 0, i9);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) q9cVar.getLayoutParams();
            marginLayoutParams2.topMargin = -i8;
            marginLayoutParams2.bottomMargin = -i9;
            mj8Var.K = false;
            aw9 aw9Var = bj3Var.J0;
            if (aw9Var != null) {
                aw9Var.b(bj3Var.X0, bj3Var.Y0, z);
            }
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) sparseArray.valueAt(i10);
                if (view instanceof yg4) {
                    ((yg4) view).j(bj3Var.X0, bj3Var.Y0, z);
                }
            }
            for (int i11 = 0; i11 < bj3Var.getChildCount(); i11++) {
                if (bj3Var.getChildAt(i11) instanceof yg4) {
                    ((yg4) bj3Var.getChildAt(i11)).j(bj3Var.X0, bj3Var.Y0, z);
                }
            }
        }
    }

    public final void c4(TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = uc7.s1(this.currentAccount).o1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new fn0(this, tL_attachMenuBot, launchActivity, (byte) 22), 66);
    }

    public final boolean c5(defpackage.of3 r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.c5(of3):boolean");
    }

    @Override
    public final boolean canBeginSlide() {
        ij3 ij3Var;
        if (!this.H3.c()) {
            if (this.T0 == 3 && (ij3Var = this.A0) != null && ij3Var.getVisibility() == 0 && this.A0.L > 0) {
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
            bj3 bj3Var = this.D0;
            if (bj3Var != null) {
                bj3Var.T();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final a createActionBar(Context context) {
        y10 y10Var = new y10(this, context, this.resourceProvider, (byte) 2);
        y10Var.setAllowOverlayTitle(true);
        y10Var.H0 = true;
        if (y10Var.G0 == null) {
            b6 b6Var = new b6(y10Var.getContext(), (byte) 0);
            y10Var.G0 = b6Var;
            y10Var.addView(b6Var);
        }
        yob.l(y10Var, 3, aob.t8, getResourceProvider());
        yob.a(y10Var, aob.z8, getResourceProvider(), true);
        yob.l(y10Var, 1, aob.v8, getResourceProvider());
        yob.b(y10Var, aob.y8, getResourceProvider(), true);
        if (y10Var.y1 == null) {
            c6 c6Var = new c6(y10Var, y10Var.getContext(), y10Var.K0, y10Var.P0);
            y10Var.y1 = c6Var;
            c6Var.setClipChildren(false);
            y10Var.addView(y10Var.y1);
        }
        y10Var.getAdditionalSubTitleOverlayContainer().setTranslationX(hl.L(4.0f));
        y10Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-hl.L(3.0f));
        if (!this.inPreviewMode && (!hl.O1() || this.Y2 == 0 || F3())) {
            return y10Var;
        }
        y10Var.setOccupyStatusBar(false);
        return y10Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.createView(android.content.Context):android.view.View");
    }

    public final void d3() {
        if (this.L1 != null) {
            float R1 = hl.R1(0.98f, 1.0f, 1.0f);
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
            exc.a(getParentActivity(), new gt(this, tL_attachMenuBot, launchActivity, (byte) 13), null);
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
        s7 s7Var = this.n0;
        if (z) {
            s7Var.setVisibility(0);
        } else {
            s7Var.setSelected(false);
            Drawable background = this.n0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        s7 s7Var2 = this.n0;
        Property property = View.ALPHA;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(s7Var2, property, f));
        this.V3.playTogether(arrayList);
        this.V3.addListener(new ri3(this, z, (byte) 1));
        this.V3.start();
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (!(dialog instanceof xw0) && super.dismissDialogOnPause(dialog)) {
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
        xw0.l(this.currentAccount, tL_attachMenuBot.bot_id, null);
    }

    public final void e5() {
        if (!this.B0 && getMessagesController().L0 && getMessagesController().n3 && this.A0 != null && getMessagesController().T0().isEmpty() && !this.isPaused && getUserConfig().Q && !this.inPreviewMode) {
            SharedPreferences e1 = uc7.e1();
            if (!e1.getBoolean("filterhint", false)) {
                e1.edit().putBoolean("filterhint", true).apply();
                hl.d3(new rg3(this, (byte) 2), 1000L);
            }
        }
    }

    public final void f3() {
        if (hl.O1()) {
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.o(true);
            }
            TLObject tLObject = this.Z1;
            if (tLObject != null) {
                bj3 bj3Var = this.D0;
                if (bj3Var != null) {
                    bj3Var.e0.Q(this.Y1, tLObject);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.f5():void");
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        fu5 fu5Var = this.M0;
        if (fu5Var != null) {
            fu5Var.u();
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
        hl.f3(this.parentLayout, "newChatsRow");
    }

    public final void g5() {
        if (this.Y3 == null) {
            for (String str : getMessagesController().v3) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = ob6.M0(2131749073, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = hl.S2(ob6.M0(2131749074, null));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    alertDialog$Builder.j(ob6.M0(2131749304, null), new xg3(this, (byte) 5));
                    showDialog(idVar, new tg3(this, (byte) 1));
                    this.Y3 = str;
                    return;
                }
            }
        }
    }

    @Override
    public final rk5 getBackButtonState() {
        if (!F3() && !this.H3.f) {
            return rk5.b;
        }
        return rk5.a;
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
        ofFloat2.addUpdateListener(new ug3(this, (byte) 1));
        this.g4.setInterpolator(k43.g);
        this.g4.setDuration(i);
        this.g4.start();
        return this.g4;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.getThemeDescriptions():java.util.ArrayList");
    }

    public final void h3(String str) {
        if (this.actionBar.e(str)) {
            return;
        }
        s6 q = this.actionBar.q(str);
        boolean z = this.X;
        ArrayList arrayList = this.k1;
        if (z) {
            ImageView imageView = new ImageView(getParentActivity());
            this.i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.i1.setImageDrawable(new gd0(true));
            yob.s(this.i1, aob.y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.i1;
            int i = aob.z8;
            yob.R(imageView2, aob.f0(getThemedColor(i), 1, -1), null, yob.M(i), getResourceProvider());
            this.i1.setOnClickListener(new wg3(this, (byte) 5));
            q.addView(this.i1, tre.r(54, 54, 16));
            arrayList.add(this.i1);
        }
        NumberTextView numberTextView = new NumberTextView(q.getContext());
        this.j1 = numberTextView;
        int i2 = 18;
        numberTextView.setTextSize(18);
        this.j1.setTypeface(hl.o());
        this.j1.setTextColor(getThemedColor(aob.y8));
        NumberTextView numberTextView2 = this.j1;
        if (!this.X) {
            i2 = 72;
        }
        q.addView(numberTextView2, tre.m(1.0f, 0, -1, i2, 0, 0));
        this.j1.setOnTouchListener(new b02((byte) 5));
        this.m1 = q.g(100, 2131232298, hl.L(48.0f));
        this.n1 = q.g(104, 2131232261, hl.L(48.0f));
        this.o1 = q.g(107, 2131232056, hl.L(48.0f));
        this.l1 = q.h(102, 2131232113, hl.L(48.0f), ob6.M0(2131751563, null));
        s7 h = q.h(0, 2131231247, hl.L(48.0f), ob6.M0(2131754834, null));
        q.addView(new View(getParentActivity()), tre.o(5, -1));
        this.s1 = h.e(105, 2131232056, ob6.M0(2131754165, null));
        this.p1 = h.e(108, 2131232298, ob6.M0(2131751418, null));
        this.q1 = h.e(109, 2131232051, ob6.M0(2131750777, null));
        this.r1 = h.e(110, 2131232334, ob6.M0(2131750675, null));
        this.u1 = h.e(101, 2131232220, ob6.M0(2131748435, null));
        this.t1 = h.e(103, 2131232097, ob6.M0(2131752054, null));
        this.v1 = h.e(106, 2131232072, ob6.M0(2131753685, null));
        this.n1.setOnLongClickListener(new bh3(this, (byte) 1));
        arrayList.add(this.m1);
        arrayList.add(this.o1);
        arrayList.add(this.n1);
        arrayList.add(this.l1);
        arrayList.add(h);
        p5(false);
    }

    public final void h4() {
        i5.c(this.currentAccount, getResourceProvider(), getParentActivity());
    }

    public final void h5(long r13, android.view.View r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.h5(long, android.view.View):void");
    }

    public final void i3() {
        int i;
        bj3 bj3Var = this.D0;
        if ((bj3Var != null && bj3Var.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.p2 != null) {
            i = 2;
        } else if (!this.n2) {
            i = 1;
        } else {
            i = 0;
        }
        bj3 bj3Var2 = new bj3(this, getParentActivity(), this, i, this.T0, this.Y2, this.a3, new aj3(this, (byte) 0));
        this.D0 = bj3Var2;
        this.glassEngine.c(bj3Var2);
        ((nj3) this.fragmentView).addView(this.D0, this.C0);
        bj3 bj3Var3 = this.D0;
        bj3Var3.e0.V = new dj3(this);
        bj3Var3.l0.setOnItemClickListener(new xg3(this, (byte) 0));
        this.D0.q0.setOnItemClickListener(new xg3(this, (byte) 1));
        this.D0.x0.setOnItemClickListener(new yg3(this, (byte) 0));
        this.D0.q0.setOnItemLongClickListener(new xg3(this, (byte) 2));
        this.D0.b0.setOnItemClickListener(new xg3(this, (byte) 3));
        this.D0.b0.setOnItemLongClickListener(new vh3(this));
        this.D0.setFilteredSearchViewDelegate(new xg3(this, (byte) 4));
        this.D0.setAlpha(0.0f);
        this.D0.setScaleX(1.05f);
        this.D0.setScaleY(1.05f);
        this.D0.setVisibility(8);
        this.D0.setBlurredBackgroundDrawableFactory(this.v4);
    }

    public final void i4() {
        PasskeysActivity.e0(this.currentAccount, this.resourceProvider, getParentActivity(), true);
    }

    public final void i5(long j, View view) {
        String str;
        v21 K;
        int i = -this.N3;
        this.N3 = i;
        hl.A3(i, view, null);
        yw0.APP_ERROR.a();
        if (j >= 0) {
            str = lbc.r(uc7.s1(this.currentAccount).X1(Long.valueOf(j)));
        } else {
            str = "";
        }
        if (getMessagesController().M3()) {
            K = d31.b0(this).Q(2131624211, 36, hl.S2(ob6.a0(null, null, 2131743415, str)));
        } else {
            K = d31.b0(this).K(2131624211, hl.S2(ob6.a0(null, null, 2131743415, str)), ob6.M0(2131743414, null), new ch3(this, (byte) 3));
        }
        K.j();
    }

    @Override
    public final boolean isLightStatusBar() {
        li3 li3Var;
        if (!this.l2 && (li3Var = this.H3) != null && li3Var.getFragment() != null) {
            return this.H3.getFragment().isLightStatusBar();
        }
        if (vm2.h(getThemedColor(aob.d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final rz4 j() {
        return this.r4;
    }

    public final void j3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.z0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i = 0; i < 2; i++) {
                undoViewArr[i] = new vi3(this, parentActivity);
                FrameLayout.LayoutParams d = tre.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.m4 + this.o4 + d.bottomMargin;
                UndoView undoView = undoViewArr[i];
                int i2 = this.y0 + 1;
                this.y0 = i2;
                ((nj3) this.fragmentView).addView(undoView, i2, d);
            }
        }
    }

    public final void j4() {
        uc7.s1(this.currentAccount).v4(0L, "SETUP_PASSKEY");
        q5();
    }

    public final void j5(boolean z) {
        if (this.f0 != null && this.O3 != z) {
            this.O3 = z;
            int i = 0;
            while (true) {
                tj3[] tj3VarArr = this.f0;
                if (i < tj3VarArr.length) {
                    if (z) {
                        tj3VarArr[i].a.setScrollbarFadingEnabled(false);
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

    public final void k3(final long j, final long j2, boolean z, final tzb tzbVar) {
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
                        if (wf3.B(j)) {
                            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(getMessagesController().a1(Integer.valueOf((int) (4294967295L & j))).user_id));
                            if (X1 != null) {
                                M0 = ob6.M0(2131745324, null);
                                b0 = ob6.b0(this.h2, lbc.r(X1));
                                M02 = ob6.M0(2131745368, null);
                            } else {
                                return;
                            }
                        } else if (wf3.D(j)) {
                            if (j == getUserConfig().e()) {
                                M0 = ob6.M0(2131745324, null);
                                b0 = ob6.b0(this.i2, ob6.M0(2131745629, null));
                                M02 = ob6.M0(2131745368, null);
                            } else {
                                TLRPC.User X12 = getMessagesController().X1(Long.valueOf(j));
                                if (X12 != null && this.h2 != null) {
                                    M0 = ob6.M0(2131745324, null);
                                    b0 = ob6.b0(this.h2, lbc.r(X12));
                                    M02 = ob6.M0(2131745368, null);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(-j));
                            if (M03 != null) {
                                String str = M03.title;
                                if (j2 != 0 && (f = getMessagesController().h4.f(M03.id, j2)) != null) {
                                    str = ((Object) str) + " " + f.title;
                                }
                                if (this.j2 != null) {
                                    M0 = ob6.M0(2131754359, null);
                                    b0 = ob6.b0(this.j2, str);
                                    M02 = ob6.M0(2131754479, null);
                                } else {
                                    M0 = ob6.M0(2131745324, null);
                                    b0 = ob6.b0(this.i2, str);
                                    M02 = ob6.M0(2131745368, null);
                                }
                            } else {
                                return;
                            }
                        }
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        idVar.U = hl.S2(b0);
                        alertDialog$Builder.j(M02, new fd() {
                            @Override
                            public final void w(id idVar2, int i2) {
                                uj3.this.k3(j, j2, false, tzbVar);
                            }
                        });
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                        if (showDialog(idVar) == null) {
                            idVar.show();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == 15) {
                    Runnable ue2Var = new ue2(this, j, new o30(this, j, j2, tzbVar, (byte) 2), (byte) 21);
                    if (j < 0) {
                        m5(getMessagesController().M0(Long.valueOf(-j)), ue2Var, null);
                        return;
                    }
                    TLRPC.User X13 = getMessagesController().X1(Long.valueOf(j));
                    TLRPC.User X14 = getMessagesController().X1(Long.valueOf(this.I));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String a0 = ob6.a0(null, null, 2131754067, lbc.k(X13, true), lbc.k(X14, true));
                    id idVar2 = alertDialog$Builder2.a;
                    idVar2.S = a0;
                    idVar2.U = TextUtils.concat(hl.S2(ob6.a0(null, null, 2131754068, lbc.k(X13, true), lbc.k(X14, true))));
                    alertDialog$Builder2.j(ob6.a0("Send", null, 2131745368, new Object[0]), new ht2(ue2Var, (byte) 23));
                    alertDialog$Builder2.g(ob6.a0("Cancel", null, 2131752570, new Object[0]), new vr9((byte) 16));
                    showDialog(idVar2);
                    return;
                } else if (this.E2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(jf7.a(j, j2));
                    if (this.E2.q(this, arrayList, null, false, this.L2, this.M2, this.N2, tzbVar) && this.k2) {
                        this.E2 = null;
                        return;
                    }
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            if (wf3.D(j)) {
                TLRPC.User X15 = getMessagesController().X1(Long.valueOf(j));
                if (!X15.mutual_contact) {
                    UndoView w3 = w3();
                    if (w3 != null) {
                        w3.j(45, j, null);
                        return;
                    }
                    return;
                }
                user = X15;
                chat = null;
            } else {
                TLRPC.Chat M04 = getMessagesController().M0(Long.valueOf(-j));
                if (xc2.N(M04) && xc2.w(1, M04)) {
                    chat = M04;
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
            id idVar3 = new id(3, null, getParentActivity());
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().j1(j);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new qh3(this, idVar3, user, chat, j, tL_messages_checkHistoryImportPeer));
            try {
                idVar3.q(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void k4() {
        uc7.s1(this.currentAccount).v4(0L, "PREMIUM_GRACE");
        q5();
    }

    public final void k5(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.k5(boolean, boolean, boolean, boolean):void");
    }

    public final void l3(Canvas canvas, int i) {
        wk5 wk5Var;
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
                if (f > 0.0f && i2 > 0 && i > 0 && (wk5Var = this.parentLayout) != null) {
                    ((ActionBarLayout) wk5Var).n(canvas, (int) (f * 255.0f * f3), i);
                }
            }
        }
    }

    public final void l4(TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        uc7.s1(this.currentAccount).v4(0L, tL_pendingSuggestion.suggestion);
        q5();
    }

    public final void l5() {
        int i;
        int i2;
        Long l;
        if (this.N0 == null && !xea.w) {
            if (!this.L || this.F0.g()) {
                d1a[] d1aVarArr = new d1a[1];
                TLRPC.User f = yac.h(yac.t0).f();
                ema titleTextView = this.actionBar.getTitleTextView();
                if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                    this.F3.f();
                    Drawable drawable = this.F3.f[0];
                    Rect rect = hl.Q;
                    rect.set(titleTextView.getRightDrawable().getBounds());
                    rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
                    int L = (-(this.actionBar.getHeight() - rect.centerY())) - hl.L(16.0f);
                    i = hl.L(4.0f) + (rect.centerX() - hl.L(16.0f));
                    zm zmVar = this.G3;
                    if (zmVar != null) {
                        zmVar.b(rect.centerX(), rect.centerY());
                    }
                    i2 = L;
                } else {
                    i = 0;
                    i2 = 0;
                }
                mi3 mi3Var = new mi3(this, this, getParentActivity(), Integer.valueOf(i), getResourceProvider(), d1aVarArr);
                if (f != null && wf3.g(f.emoji_status) > 0) {
                    mi3Var.setExpireDateHint(wf3.g(f.emoji_status));
                }
                Long l2 = this.D3;
                if (l2 != null) {
                    mi3Var.setSelected(l2);
                } else {
                    Drawable drawable2 = this.F3.f[0];
                    if (drawable2 instanceof wl) {
                        l = Long.valueOf(((wl) drawable2).h());
                    } else {
                        l = null;
                    }
                    mi3Var.setSelected(l);
                }
                mi3Var.setSaveState(1);
                mi3Var.y(this.F3, titleTextView);
                ni3 ni3Var = new ni3(this, mi3Var);
                this.N0 = ni3Var;
                d1aVarArr[0] = ni3Var;
                ni3Var.showAsDropDown(this.actionBar, hl.L(16.0f), i2, 48);
                d1aVarArr[0].a();
            }
        }
    }

    public final void m3(long j, boolean z) {
        if (this.f0 != null) {
            int i = 0;
            while (true) {
                tj3[] tj3VarArr = this.f0;
                if (i < tj3VarArr.length) {
                    int childCount = tj3VarArr[i].a.getChildCount();
                    int i2 = 0;
                    while (true) {
                        if (i2 < childCount) {
                            View childAt = this.f0[i].a.getChildAt(i2);
                            if (childAt instanceof of3) {
                                of3 of3Var = (of3) childAt;
                                if (of3Var.getDialogId() == j) {
                                    of3Var.d0(z, true);
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
        uc7.s1(this.currentAccount).v4(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        q5();
    }

    public final void m5(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.m5(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final void n4(nj0 nj0Var) {
        ArrayList arrayList = nj0Var.c;
        if (arrayList.size() == 1) {
            yx4 yx4Var = new yx4(getParentActivity(), this.currentAccount, ((TLRPC.User) arrayList.get(0)).id, null, null);
            yx4Var.b1(true);
            showDialog(yx4Var);
            return;
        }
        bx4.g1(false, nj0Var);
    }

    public final void n5(boolean z) {
        tj3[] tj3VarArr;
        char c;
        char c2;
        int i = 0;
        int i2 = 0;
        while (true) {
            tj3VarArr = this.f0;
            if (i2 >= tj3VarArr.length) {
                break;
            }
            tj3VarArr[i2].a.E0();
            i2++;
        }
        if (z && tj3VarArr.length > 1) {
            c = 1;
        } else {
            c = 0;
        }
        int i3 = tj3VarArr[c].h;
        if (i3 >= 0 && i3 < getMessagesController().T0().size()) {
            ac7 ac7Var = (ac7) getMessagesController().T0().get(this.f0[c].h);
            boolean d = ac7Var.d();
            tj3[] tj3VarArr2 = this.f0;
            if (d) {
                tj3 tj3Var = tj3VarArr2[c];
                tj3Var.s = this.T0;
                qj3 qj3Var = tj3Var.a;
                int i4 = qj3.C3;
                qj3Var.E1();
            } else {
                if (tj3VarArr2[c ^ 1].s == 7) {
                    tj3VarArr2[c].s = 8;
                } else {
                    tj3VarArr2[c].s = 7;
                }
                tj3VarArr2[c].a.setScrollEnabled(true);
                uc7 messagesController = getMessagesController();
                if (this.f0[c].s == 8) {
                    c2 = 1;
                } else {
                    c2 = 0;
                }
                ac7[] ac7VarArr = messagesController.N;
                ac7 ac7Var2 = ac7VarArr[c2];
                if (ac7Var2 != ac7Var) {
                    ac7VarArr[c2] = ac7Var;
                    int i5 = c2 ^ 1;
                    if (ac7VarArr[i5] == ac7Var) {
                        ac7VarArr[i5] = null;
                    }
                    if (ac7VarArr[c2] == null) {
                        if (ac7Var2 != null) {
                            ac7Var2.k.clear();
                            ac7Var2.l.clear();
                        }
                    } else {
                        messagesController.h5(null);
                    }
                }
            }
            tj3[] tj3VarArr3 = this.f0;
            if (tj3VarArr3.length > 1) {
                tj3VarArr3[1].F = ac7Var.p;
            }
            tj3 tj3Var2 = tj3VarArr3[c];
            yh3 yh3Var = tj3Var2.d;
            yh3Var.h = tj3Var2.s;
            yh3Var.f();
            tj3 tj3Var3 = this.f0[c];
            uh3 uh3Var = tj3Var3.c;
            if (tj3Var3.s == 0 && y3() && this.f0[c].w == 2) {
                i = 1;
            }
            uh3Var.g1(i, (int) this.O);
            M2(this.f0[c]);
        }
    }

    public final java.util.ArrayList o3(int r11, int r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.o3(int, int, int, boolean):java.util.ArrayList");
    }

    public final void o4() {
        pj0 a = pj0.a(this.currentAccount);
        int i = a.a;
        Set<String> set = a.d;
        nj0 nj0Var = a.c;
        if (nj0Var != null && !set.contains(nj0Var.a)) {
            set.add(a.c.a);
            SharedPreferences.Editor edit = uc7.s1(i).Y3.edit();
            edit.putStringSet("bday_hidden", set);
            edit.apply();
            jn7.f(i).k(jn7.j5, new Object[0]);
        }
        uc7.s1(this.currentAccount).v4(0L, "BIRTHDAY_CONTACTS_TODAY");
        q5();
        v21 G = d31.b0(this).G(2131624034, 4, ob6.M0(2131753323, null));
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
        ew9 ew9Var = this.a0;
        if (ew9Var != null && ew9Var.getVisibility() != 8) {
            f = this.a0.getMeasuredHeight();
        } else {
            f = 0.0f;
        }
        if (this.L) {
            f2 = hl.L(81.0f);
        } else {
            f2 = 0.0f;
        }
        boolean z = this.L;
        float f11 = this.O;
        float f12 = this.z1;
        if (z) {
            f3 = (f * f12) + qd4.A(1.0f, f12, f2, f11);
            f4 = this.z3;
        } else {
            f3 = (f * f12) + f11;
            f4 = this.z3;
        }
        float f13 = f3 + f4 + this.U;
        hj3 hj3Var = this.Y;
        if (hj3Var != null && hj3Var.getVisibility() == 0) {
            f5 = this.Y.getAlpha();
        } else {
            f5 = 0.0f;
        }
        float L = hl.L(4.0f) * f5;
        ij3 ij3Var = this.A0;
        if (ij3Var != null) {
            ij3Var.setTranslationY(f13 - L);
            f7 = this.A0.getAlpha();
            f8 = (this.A0.getUnreadOnlyBannerHeight() + hl.L(43.0f)) * f7;
            f6 = f13 + f8;
        } else {
            f6 = f13;
            f7 = 0.0f;
            f8 = 0.0f;
        }
        xj3 xj3Var = this.L1;
        if (xj3Var != null) {
            float f14 = f6 - L;
            int i2 = -hl.L(3.0f);
            if (this.b0 == null) {
                i = hl.L(44.0f);
            } else {
                i = 0;
            }
            xj3Var.setTranslationY(hl.R1(f14, i2 - i, this.b.e));
            f9 = this.L1.getMetadata().c.a;
            f10 = this.L1.c(0.0f);
        } else {
            f9 = 0.0f;
            f10 = 0.0f;
        }
        wj3 wj3Var = this.M1;
        if (wj3Var != null) {
            wj3Var.setTranslationY(f13 - L);
            float U1 = hl.U1(Math.min(f9, f7), hl.L(7.0f), hl.L(50.0f));
            wj3 wj3Var2 = this.M1;
            float min = Math.min(hl.L(40.0f), (f10 + f8) - U1);
            Matrix matrix = wj3Var2.b;
            if (wj3Var2.e != U1 || wj3Var2.f != min) {
                wj3Var2.e = U1;
                wj3Var2.f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, U1);
                LinearGradient linearGradient = wj3Var2.c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                wj3Var2.invalidate();
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
                bj3 bj3Var = this.D0;
                if (bj3Var != null) {
                    bj3Var.T();
                    return false;
                }
            }
        } else {
            fu5 fu5Var = this.M0;
            if (fu5Var != null) {
                if (z) {
                    fu5Var.u();
                    this.M0 = null;
                    return false;
                }
            } else {
                ij3 ij3Var = this.A0;
                if (ij3Var != null && ij3Var.n) {
                    if (z) {
                        ij3Var.setIsEditing(false);
                        d5(false);
                        return false;
                    }
                } else {
                    a aVar = this.actionBar;
                    if (aVar != null && aVar.z()) {
                        if (z) {
                            bj3 bj3Var2 = this.D0;
                            if (bj3Var2 != null && bj3Var2.getVisibility() == 0) {
                                this.D0.S(false);
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
                        ij3 ij3Var2 = this.A0;
                        if (ij3Var2 != null && ij3Var2.getVisibility() == 0 && !this.j3) {
                            ij3 ij3Var3 = this.A0;
                            if (!ij3Var3.Q && !this.o3) {
                                ArrayList arrayList = ij3Var3.h;
                                if (!arrayList.isEmpty() && ij3Var3.M != ((bg4) arrayList.get(0)).a) {
                                    if (z) {
                                        ij3 ij3Var4 = this.A0;
                                        ArrayList arrayList2 = ij3Var4.h;
                                        if (!arrayList2.isEmpty()) {
                                            ij3Var4.i((bg4) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        bi3 bi3Var = this.D1;
                        if (bi3Var != null && bi3Var.U0()) {
                            if (z) {
                                this.D1.N0(true);
                            }
                        } else {
                            ii3 ii3Var = this.F0;
                            if (ii3Var.P == 0 && ii3Var.T.K0() != 0) {
                                ii3Var.h.A0(0);
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
        tb tbVar;
        ij3 ij3Var;
        if (this.X1) {
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.o(true);
            }
            TLObject tLObject = this.Z1;
            if (tLObject != null) {
                bj3 bj3Var = this.D0;
                if (bj3Var != null) {
                    bj3Var.e0.Q(this.Y1, tLObject);
                }
                this.Z1 = null;
            }
            this.X1 = false;
        }
        if (!this.L && (ij3Var = this.A0) != null && ij3Var.getVisibility() == 0 && this.r.f) {
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
        if (!isInPreviewMode() && (tbVar = this.L0) != null && tbVar.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        X2();
        this.s0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        kg5 kg5Var;
        super.onBecomeFullyVisible();
        if (F3()) {
            SharedPreferences e1 = uc7.e1();
            boolean z = e1.getBoolean("archivehint", true);
            boolean isEmpty = o3(this.currentAccount, this.T0, this.Y2, false).isEmpty();
            if (z && isEmpty) {
                uc7.e1().edit().putBoolean("archivehint", false).commit();
                z = false;
            }
            if (z) {
                e1.edit().putBoolean("archivehint", false).commit();
                b5();
            }
        }
        if (this.s0 && !this.t0 && (kg5Var = this.q0) != null && this.R3) {
            this.t0 = true;
            this.s0 = false;
            kg5Var.v();
        }
        hl.d3(new ch3(this, (byte) 11), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fu5 fu5Var = this.M0;
        if (fu5Var != null) {
            fu5Var.u();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        id idVar;
        super.onDialogDismiss(dialog);
        if (this.Y2 == 0 && this.a3 == 0 && (idVar = this.V1) != null && dialog == idVar && getParentActivity() != null) {
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
                this.b3 = getMessagesController().M0(Long.valueOf(this.a3));
                this.c3 = getMessagesController().N0(this.a3);
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
            this.W1 = uc7.f1().getBoolean("askAboutContacts", true);
            xea.t();
        }
        jn7 notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        this.L3 = new u8a(notificationCenter, this);
        if (this.p2 == null) {
            this.f2 = getConnectionsManager().getConnectionState();
            this.L3.e(jn7.l4);
            if (!this.n2) {
                this.L3.e(jn7.L4);
                this.L3.e(jn7.D4);
                this.L3.b(jn7.R2);
                this.L3.b(jn7.d2);
            }
            u8a u8aVar = this.L3;
            u8aVar.b(jn7.r);
            u8aVar.b(jn7.O2);
            u8aVar.b(jn7.P2);
            u8aVar.b(jn7.Q2);
            u8aVar.b(2);
            u8aVar.b(jn7.Y);
            u8aVar.b(jn7.N);
            u8aVar.b(jn7.I2);
            u8aVar.b(jn7.h0);
            u8aVar.b(jn7.f0);
            u8aVar.b(jn7.I);
            u8aVar.b(jn7.J);
            u8aVar.b(jn7.L);
            u8aVar.b(jn7.P0);
            u8aVar.b(jn7.s0);
            u8aVar.b(jn7.t5);
            u8aVar.b(jn7.S0);
            u8aVar.b(jn7.T1);
            u8aVar.b(jn7.e5);
            u8aVar.b(jn7.K2);
            u8aVar.b(jn7.d0);
            u8aVar.b(jn7.s1);
            u8aVar.b(jn7.b5);
            u8aVar.b(jn7.c5);
            u8aVar.b(jn7.M);
            u8aVar.b(jn7.p5);
            u8aVar.b(jn7.i5);
            this.L3.e(jn7.n0);
        }
        u8a u8aVar2 = this.L3;
        u8aVar2.b(jn7.v);
        u8aVar2.b(jn7.V4);
        u8aVar2.b(jn7.d5);
        u8aVar2.b(jn7.T);
        u8aVar2.b(jn7.O4);
        u8aVar2.b(jn7.w5);
        u8aVar2.b(jn7.y5);
        u8aVar2.b(jn7.b3);
        u8aVar2.b(jn7.f3);
        u8aVar2.b(jn7.j5);
        u8aVar2.b(jn7.A3);
        u8aVar2.b(jn7.C3);
        u8aVar2.b(jn7.V5);
        u8aVar2.b(jn7.W5);
        u8aVar2.b(jn7.S3);
        u8aVar2.b(jn7.T3);
        if (this.T0 == 0) {
            this.L3.b(jn7.C5);
            this.L3.b(jn7.P1);
        }
        x4(getAccountInstance());
        c6b O1 = getMessagesController().O1();
        if (!O1.A) {
            O1.V();
            if (!O1.s) {
                ConnectionsManager.getInstance(O1.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new g5b(O1, (byte) 4));
            }
        }
        getMessagesController().j3(this.Y2);
        if (this.X3 != null && !getMessagesStorage().R) {
            d93 d93Var = this.X3;
            if (d93Var.getParent() != null) {
                ((ViewGroup) d93Var.getParent()).removeView(d93Var);
            }
            this.X3 = null;
        }
        if (F3()) {
            c6b O12 = getMessagesController().O1();
            if (O12.z) {
                O12.S(true);
            }
        } else {
            getMessagesController().O1().V();
        }
        getContactsController().B();
        if (getMessagesController().Q3) {
            nt9 F1 = getMessagesController().F1();
            if (!F1.e) {
                F1.g(true);
            }
        }
        if (this.a3 != 0) {
            getMessagesController().e3(0, this.a3, true);
        }
        pj0 a = pj0.a(this.currentAccount);
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
                boolean z2 = f11.a;
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
                ConnectionsManager.getInstance(a.a).sendRequest(new TL_account.getBirthdays(), new ye(a, (byte) 3));
            }
        }
        if (this.X) {
            i = hl.L(72.0f);
        } else {
            i = 0;
        }
        this.o4 = i;
        if (this.X) {
            i2 = hl.L(64.0f);
        }
        this.p4 = i2;
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        hl.r(this.T3);
        hl.r(this.Q3);
        this.P3.A();
        super.onFragmentDestroy();
        u8a u8aVar = this.L3;
        if (u8aVar != null) {
            u8aVar.a();
            this.L3 = null;
        }
        bi3 bi3Var = this.D1;
        if (bi3Var != null) {
            bi3Var.g1();
        }
        sea seaVar = this.I2;
        if (seaVar != null) {
            seaVar.j();
        }
        wd3 wd3Var = this.J2;
        if (wd3Var != null) {
            hl.r(wd3Var);
            this.J2 = null;
        }
        UndoView undoView = this.z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.r3.e();
        this.E2 = null;
        int i = by4.l1;
    }

    @Override
    public final void onPanTranslationUpdate(float f) {
        if (this.f0 != null) {
            this.K0 = f;
            bi3 bi3Var = this.D1;
            int i = 0;
            if (bi3Var != null && bi3Var.U0()) {
                this.fragmentView.setTranslationY(f);
                while (true) {
                    tj3[] tj3VarArr = this.f0;
                    if (i >= tj3VarArr.length) {
                        break;
                    }
                    tj3VarArr[i].setTranslationY(0.0f);
                    i++;
                }
                if (!this.n2) {
                    this.actionBar.setTranslationY(0.0f);
                    v21 v21Var = this.q3;
                    if (v21Var != null) {
                        v21Var.l();
                    }
                }
                bj3 bj3Var = this.D0;
                if (bj3Var != null) {
                    bj3Var.setTranslationY(this.J0);
                    return;
                }
                return;
            }
            while (true) {
                tj3[] tj3VarArr2 = this.f0;
                if (i >= tj3VarArr2.length) {
                    break;
                }
                tj3VarArr2[i].setTranslationY(f);
                i++;
            }
            if (!this.n2) {
                this.actionBar.setTranslationY(f);
                v21 v21Var2 = this.q3;
                if (v21Var2 != null) {
                    v21Var2.l();
                }
            }
            bj3 bj3Var2 = this.D0;
            if (bj3Var2 != null) {
                bj3Var2.setTranslationY(this.K0 + this.J0);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        hl.r(this.Q3);
        this.P3.A();
        v21 v21Var = this.T;
        if (v21Var != null) {
            v21Var.b();
            this.T = null;
        }
        li3 li3Var = this.H3;
        if (li3Var != null) {
            li3Var.r = true;
            si3 si3Var = li3Var.a;
            if (si3Var != null) {
                si3Var.onPause();
            }
        }
        fu5 fu5Var = this.M0;
        if (fu5Var != null) {
            fu5Var.u();
        }
        bi3 bi3Var = this.D1;
        if (bi3Var != null) {
            bi3Var.i1();
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
            tj3[] tj3VarArr = this.f0;
            if (i < tj3VarArr.length) {
                tj3VarArr[i].d.getClass();
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        ab0 ab0Var;
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
                                ip7.n(this.currentAccount).Y();
                                break;
                            } else {
                                so7.E0();
                                continue;
                            }
                        case 1:
                            if (iArr[i2] == 0) {
                                in5.z().e(null);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (iArr[i2] == 0) {
                                hl.c3(new ch3(this, (byte) 10));
                                getContactsController().l();
                                continue;
                            } else {
                                SharedPreferences.Editor edit = uc7.f1().edit();
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
            if (Build.VERSION.SDK_INT >= 30 && (ab0Var = FilesMigrationService.e) != null) {
                ab0Var.E0();
            }
        }
    }

    @Override
    public final void onResume() {
        boolean z;
        uj3 uj3Var;
        tj3 tj3Var;
        yh3 yh3Var;
        boolean z2;
        boolean z3;
        boolean z4;
        gx9 gx9Var;
        tb tbVar;
        super.onResume();
        w4();
        ii3 ii3Var = this.F0;
        char c = 0;
        if (ii3Var != null) {
            ArrayList arrayList = ii3Var.y;
            c6b c6bVar = ii3Var.s;
            c6bVar.k(c6bVar.g);
            c6bVar.k(c6bVar.h);
            for (int i = 0; i < arrayList.size(); i++) {
                TL_stories.PeerStories x = c6bVar.x(((mg3) arrayList.get(i)).c);
                if (x != null) {
                    c6bVar.Z(x);
                }
            }
        }
        li3 li3Var = this.H3;
        if (li3Var != null) {
            li3Var.r = false;
            si3 si3Var = li3Var.a;
            if (si3Var != null) {
                si3Var.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).w() && (tbVar = this.L0) != null && tbVar.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        if (this.f0 != null) {
            int i2 = 0;
            while (true) {
                tj3[] tj3VarArr = this.f0;
                if (i2 >= tj3VarArr.length) {
                    break;
                }
                tj3VarArr[i2].d.f();
                i2++;
            }
        }
        if (this.S3) {
            this.S3 = false;
            getMessagesController().h5(null);
            if (this.f0 != null) {
                int i3 = 0;
                while (true) {
                    tj3[] tj3VarArr2 = this.f0;
                    if (i3 >= tj3VarArr2.length) {
                        break;
                    }
                    tj3VarArr2[i3].d.f();
                    i3++;
                }
            }
        }
        F5(-1, false);
        bi3 bi3Var = this.D1;
        if (bi3Var != null) {
            bi3Var.j1();
        }
        long j = 0;
        if (!this.n2 && this.Y2 == 0 && this.a3 == 0) {
            getMediaDataController().D(4);
        }
        bj3 bj3Var = this.D0;
        if (bj3Var != null && (gx9Var = bj3Var.e0) != null) {
            gx9Var.f();
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
                if ((i4 <= 28 || f11.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i4 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                uj3Var = this;
                vu2 vu2Var = new vu2(uj3Var, z4, z2, z3, parentActivity);
                if (uj3Var.v2 && (z2 || z4)) {
                    j = 4000;
                }
                hl.d3(vu2Var, j);
            } else {
                uj3Var = this;
            }
        } else {
            uj3Var = this;
            if (!uj3Var.n2 && uj3Var.Y2 == 0 && uj3Var.a3 == 0 && f3f.b() && !f3f.a()) {
                if (uj3Var.getParentActivity() != null) {
                    if (!uc7.f1().getBoolean("askedAboutMiuiLockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uj3Var.getParentActivity());
                        int i5 = aob.L5;
                        alertDialog$Builder.l(2131624116, 72, uj3Var.getThemedColor(i5), null);
                        alertDialog$Builder.m(i5, uj3Var.getResourceProvider());
                        String M0 = ob6.M0(2131747025, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.U = M0;
                        alertDialog$Builder.j(ob6.M0(2131747027, null), new xg3(uj3Var, (byte) 8));
                        alertDialog$Builder.g(ob6.M0(2131751737, null), new da3((byte) 15));
                        uj3Var.showDialog(idVar);
                    }
                } else {
                    return;
                }
            } else if (uj3Var.Y2 == 0 && uj3Var.a3 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (uj3Var.getParentActivity() != null) {
                    if (!uc7.f1().getBoolean("askedAboutFSILockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(uj3Var.getParentActivity());
                        int i6 = aob.L5;
                        alertDialog$Builder2.l(2131624116, 72, uj3Var.getThemedColor(i6), null);
                        alertDialog$Builder2.m(i6, uj3Var.getResourceProvider());
                        String M02 = ob6.M0(2131747041, null);
                        id idVar2 = alertDialog$Builder2.a;
                        idVar2.U = M02;
                        alertDialog$Builder2.j(ob6.M0(2131747027, null), new xg3(uj3Var, (byte) 9));
                        alertDialog$Builder2.g(ob6.M0(2131751737, null), new da3((byte) 16));
                        uj3Var.showDialog(idVar2);
                    }
                } else {
                    return;
                }
            }
        }
        uj3Var.e5();
        if (uj3Var.f0 != null) {
            int i7 = 0;
            while (true) {
                tj3[] tj3VarArr3 = uj3Var.f0;
                if (i7 >= tj3VarArr3.length) {
                    break;
                }
                tj3 tj3Var2 = tj3VarArr3[i7];
                if (tj3Var2.s == 0 && tj3Var2.w == 2 && tj3Var2.c.K0() == 0 && uj3Var.y3()) {
                    uj3Var.f0[i7].c.g1(1, (int) uj3Var.O);
                }
                tj3[] tj3VarArr4 = uj3Var.f0;
                if (i7 == 0) {
                    tj3VarArr4[i7].d.getClass();
                } else {
                    tj3VarArr4[i7].d.getClass();
                }
                i7++;
            }
        }
        uj3Var.g5();
        uj3Var.setBulletinDelegate(new t10(uj3Var, (byte) 9));
        if (uj3Var.s3) {
            hl.V2(uj3Var.getParentActivity(), uj3Var.classGuid);
        }
        uj3Var.G5(0, false);
        uj3Var.w5(false, true);
        uj3Var.E5(false);
        uj3Var.N2();
        uj3Var.X2();
        if (uj3Var.A0 != null && (tj3Var = uj3Var.f0[0]) != null && (yh3Var = tj3Var.d) != null) {
            int i8 = yh3Var.h;
            if (i8 == 7 || i8 == 8) {
                ac7[] ac7VarArr = uj3Var.getMessagesController().N;
                if (i8 != 7) {
                    c = 1;
                }
                ac7 ac7Var = ac7VarArr[c];
                if (ac7Var != null) {
                    uj3Var.A0.k(ac7Var.o);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z, float f) {
        if (xea.o() <= 0) {
            boolean z2 = f11.a;
        } else if (this.f4 && this.g4 == null) {
            Z4(f);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.h1.setColor(getThemedColor(aob.d6));
            H2();
            r5();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        tb tbVar;
        uj3 uj3Var;
        li3 li3Var = this.H3;
        if (li3Var != null && li3Var.c()) {
            this.H3.getFragment().onTransitionAnimationEnd(z, z2);
        } else {
            if (z && (tbVar = this.L0) != null && tbVar.getVisibility() == 0) {
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
        if (!z && (uj3Var = this.Z2) != null) {
            uj3Var.removeSelfFromStack();
        }
        X2();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        li3 li3Var = this.H3;
        if (li3Var != null && li3Var.c()) {
            this.H3.getFragment().onTransitionAnimationProgress(z, f);
        } else {
            tb tbVar = this.L0;
            if (tbVar != null && tbVar.getVisibility() == 0) {
                tb tbVar2 = this.L0;
                if (z) {
                    tbVar2.setAlpha(1.0f - f);
                } else {
                    tbVar2.setAlpha(f);
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
            v21 I = d31.b0(this).I(2131624034, ob6.M0(2131746585, null), ob6.M0(2131746584, null));
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
            getMessagesStorage().l2(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
                String M0 = ob6.M0(2131746581, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131746582, null);
                alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                showDialog(idVar);
                return;
            }
            return;
        }
        bs2.v(null, 2131743534, d31.b0(this), 2131624012, 36);
    }

    public final void p5(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.p5(boolean):void");
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
    public final boolean presentFragment(e eVar) {
        boolean presentFragment = super.presentFragment(eVar);
        if (presentFragment && this.f0 != null) {
            int i = 0;
            while (true) {
                tj3[] tj3VarArr = this.f0;
                if (i >= tj3VarArr.length) {
                    break;
                }
                tj3VarArr[i].d.getClass();
                i++;
            }
        }
        kg5 kg5Var = this.q0;
        if (kg5Var != null) {
            kg5Var.f(true);
        }
        kg5 kg5Var2 = this.r0;
        if (kg5Var2 != null) {
            kg5Var2.f(true);
        }
        v21.e();
        return presentFragment;
    }

    public final int q3() {
        if (this.L) {
            return hl.L(48.0f) + hl.L(81.0f);
        }
        return hl.L(48.0f);
    }

    public final void q4(TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull Y1 = getMessagesController().Y1(getUserConfig().e());
        if (Y1 != null) {
            tL_birthday2 = Y1.birthday;
            Y1.flags2 |= 32;
            Y1.birthday = tL_birthday;
        } else {
            tL_birthday2 = null;
        }
        getMessagesController().j2();
        getConnectionsManager().sendRequest(updatebirthday, new fn0(this, Y1, tL_birthday2, (byte) 21), 1024);
        uc7.s1(this.currentAccount).v4(0L, "BIRTHDAY_SETUP");
        q5();
    }

    public final void q5() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.q5():void");
    }

    public final int r3() {
        if (this.L) {
            return hl.L(81.0f);
        }
        return 0;
    }

    public final void r4() {
        uc7.s1(this.currentAccount).v4(0L, "BIRTHDAY_SETUP");
        q5();
        v21 K = d31.b0(this).K(2131623982, ob6.M0(2131753707, null), ob6.M0(2131745223, null), new rg3(this, (byte) 4));
        K.j = 5000;
        K.j();
    }

    public final void r5() {
        gw9 gw9Var;
        qj3 qj3Var;
        boolean z;
        int i;
        try {
            bi3 bi3Var = this.D1;
            if (bi3Var != null && bi3Var.getEditField() != null) {
                this.D1.getEditField().setCursorColor(getThemedColor(aob.Ne));
            }
            NumberTextView numberTextView = this.j1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(aob.y8));
            }
            ij3 ij3Var = this.A0;
            int i2 = 0;
            if (ij3Var != null && (ij3Var.getSelectorDrawable() instanceof GradientDrawable)) {
                a aVar = this.actionBar;
                if (aVar != null && aVar.z()) {
                    z = true;
                } else {
                    z = false;
                }
                GradientDrawable gradientDrawable = (GradientDrawable) this.A0.getSelectorDrawable();
                if (z) {
                    i = aob.xi;
                } else {
                    i = aob.K8;
                }
                gradientDrawable.setColor(getThemedColor(i));
                this.A0.invalidate();
            }
            a aVar2 = this.actionBar;
            if (aVar2 != null) {
                if (this.Y2 != 0 || this.a3 != 0) {
                    aVar2.L(getThemedColor(aob.Q8), false);
                    this.actionBar.L(getThemedColor(aob.R8), true);
                }
                if (this.actionBar.z()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(aob.d6));
                }
                x5();
            }
            if (this.f0 != null) {
                while (true) {
                    tj3[] tj3VarArr = this.f0;
                    if (i2 >= tj3VarArr.length) {
                        break;
                    }
                    tj3 tj3Var = tj3VarArr[i2];
                    if (tj3Var != null && (qj3Var = tj3Var.a) != null) {
                        qj3Var.setGlowColor(getThemedColor(aob.d6));
                    }
                    i2++;
                }
            }
            bj3 bj3Var = this.D0;
            if (bj3Var != null && (gw9Var = bj3Var.b0) != null) {
                gw9Var.setGlowColor(getThemedColor(aob.d6));
            }
            di3 di3Var = this.E1;
            if (di3Var != null) {
                di3Var.setScrimViewBackgroundColor(getThemedColor(aob.d6));
            }
            kg5 kg5Var = this.q0;
            if (kg5Var != null) {
                kg5Var.i(getThemedColor(aob.wj));
            }
            kg5 kg5Var2 = this.r0;
            if (kg5Var2 != null) {
                kg5Var2.i(getThemedColor(aob.wj));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final ac7 s3(tj3 tj3Var) {
        char c;
        if (tj3Var != null) {
            int i = tj3Var.s;
            if (i == 7 || i == 8) {
                ac7[] ac7VarArr = getMessagesController().N;
                if (tj3Var.s == 8) {
                    c = 1;
                } else {
                    c = 0;
                }
                return ac7VarArr[c];
            }
            return null;
        }
        return null;
    }

    public final void s4() {
        uc7.s1(this.currentAccount).v4(0L, "PREMIUM_CHRISTMAS");
        q5();
        v21 G = d31.b0(this).G(2131624034, 4, ob6.M0(2131753323, null));
        G.j = 5000;
        G.j();
    }

    public final void s5(boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.s5(boolean, boolean):void");
    }

    @Override
    public final void setInPreviewMode(boolean z) {
        super.setInPreviewMode(z);
        ii3 ii3Var = this.F0;
        if (ii3Var != null) {
            if (this.H0 && !z) {
                ii3Var.setVisibility(0);
            } else {
                ii3Var.setVisibility(8);
            }
        }
        v5(true);
        q5();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r5, int r6, java.lang.Runnable r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        int i2;
        int i3;
        int i4 = 8;
        if (i == 1) {
            Y2();
            a3();
            d3();
            Q2();
            b3();
            hj3 hj3Var = this.Y;
            fm0 fm0Var = this.b;
            hj3Var.setBlurredBackgroundVisibility(fm0Var.e);
            float a = qke.a(fm0Var.e);
            de0 de0Var = this.d3;
            if (de0Var != null) {
                de0Var.setScaleX(a);
                this.d3.setScaleY(a);
                this.d3.setAlpha(a);
                de0 de0Var2 = this.d3;
                if (a > 0.0f) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                de0Var2.setVisibility(i3);
            }
            if (this.w0 != null) {
                float R1 = hl.R1(0.9f, 1.0f, a);
                this.w0.setScaleX(R1);
                this.w0.setScaleY(R1);
                this.w0.setAlpha(a);
                c51 c51Var = this.w0;
                int i5 = (a > 0.0f ? 1 : (a == 0.0f ? 0 : -1));
                if (i5 > 0) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                c51Var.setVisibility(i2);
                this.x0.setAlpha(a);
                jz1 jz1Var = this.x0;
                if (i5 > 0) {
                    i4 = 0;
                }
                jz1Var.setVisibility(i4);
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

    public final float t3() {
        li3 li3Var = this.H3;
        if (li3Var != null && li3Var.c()) {
            return this.H3.e;
        }
        return 0.0f;
    }

    public final void t4() {
        uc7.s1(this.currentAccount).v4(0L, "PREMIUM_RESTORE");
        q5();
    }

    public final void t5(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.t5(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    public final float u3() {
        return -hl.U1(this.b.e, hl.L(4.0f), hl.L(48.0f));
    }

    public final void u4() {
        String str;
        uc7 s1 = uc7.s1(this.currentAccount);
        if (this.C3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        s1.v4(0L, str);
        q5();
    }

    public final void u5() {
        float f = (((-this.m4) - this.p4) - this.w1) - this.x1;
        zp4 zp4Var = this.u0;
        if (zp4Var != null) {
            zp4Var.setTranslationY(f);
        }
        zp4 zp4Var2 = this.v0;
        if (zp4Var2 != null) {
            zp4Var2.setTranslationY(f - hl.L(52.0f));
            kg5 kg5Var = this.q0;
            if (kg5Var != null) {
                kg5Var.setTranslationY(f - hl.L(52.0f));
            }
        }
    }

    @Override
    public final void v() {
        R4(true, true);
    }

    @Override
    public final void v0(float f, int i) {
        s7 s7Var;
        if (i == 3 && (s7Var = this.m0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) s7Var.getIconView().getDrawable();
            if (this.d.f) {
                animatedVectorDrawable.start();
                if (xea.o() != 0) {
                    TLRPC.TL_help_premiumPromo tL_help_premiumPromo = ls6.d0(this.currentAccount).E;
                    String o0 = PremiumPreviewFragment.o0(2);
                    if (tL_help_premiumPromo != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 < tL_help_premiumPromo.video_sections.size()) {
                                if (tL_help_premiumPromo.video_sections.get(i2).equals(o0)) {
                                    break;
                                }
                                i2++;
                            } else {
                                i2 = -1;
                                break;
                            }
                        }
                        if (i2 != -1) {
                            xb4.G(this.currentAccount).X(tL_help_premiumPromo.videos.get(i2), tL_help_premiumPromo, 3, 0);
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

    public final c6b v3() {
        return getMessagesController().O1();
    }

    public final void v4() {
        uc7.s1(this.currentAccount).v4(0L, "USERPIC_SETUP");
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
        zp4 zp4Var = this.u0;
        if (zp4Var != null) {
            zp4Var.e(z2, z);
        }
        zp4 zp4Var2 = this.v0;
        if (zp4Var2 != null) {
            zp4Var2.e(z2, z);
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
            nj3 nj3Var = (nj3) this.fragmentView;
            nj3Var.removeView(undoViewArr[0]);
            nj3Var.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void w4() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.w4():void");
    }

    public final void w5(boolean z, boolean z2) {
        boolean z3;
        int i;
        if (this.o0 != null) {
            s7 s7Var = this.n0;
            if (s7Var == null || s7Var.getVisibility() != 0) {
                boolean z4 = false;
                int i2 = 0;
                while (true) {
                    if (i2 < getDownloadController().H.size()) {
                        if (getFileLoader().S(((r47) getDownloadController().H.get(i2)).S0())) {
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
                b8 b8Var = this.p0;
                if (z5) {
                    if (z4) {
                        i = 2131748362;
                    } else {
                        i = 2131748361;
                    }
                } else {
                    i = 2131748360;
                }
                b8Var.setSubtext(ob6.M0(i, null));
                this.o0.b(z5, z4, z);
            }
        }
    }

    public final ac7 x3() {
        tj3[] tj3VarArr = this.f0;
        if (tj3VarArr != null && tj3VarArr[0] != null) {
            ArrayList T0 = getMessagesController().T0();
            int i = this.U3;
            if (i < 0) {
                i = this.f0[0].h;
            }
            if (i >= 0 && i < T0.size()) {
                return (ac7) T0.get(i);
            }
        }
        return null;
    }

    public final void x5() {
        int i;
        int i2;
        if (this.u3 && this.actionBar != null) {
            if (this.Y2 == 0 && this.a3 == 0) {
                i = aob.v8;
            } else {
                i = aob.O8;
            }
            int themedColor = getThemedColor(i);
            a aVar = this.actionBar;
            int i3 = aob.y8;
            aVar.H(vm2.f(this.z1, themedColor, getThemedColor(i3)), false);
            this.actionBar.H(vm2.f(this.z1, getThemedColor(i3), getThemedColor(i3)), true);
            if (this.Y2 == 0 && this.a3 == 0) {
                i2 = aob.t8;
            } else {
                i2 = aob.N8;
            }
            int themedColor2 = getThemedColor(i2);
            this.actionBar.G(vm2.f(this.z1, themedColor2, getThemedColor(aob.z8)), false);
        }
    }

    public final boolean y3() {
        if (!this.n2 && this.T0 == 0 && this.a3 == 0 && this.Y2 == 0) {
            uc7 messagesController = getMessagesController();
            messagesController.getClass();
            if (xea.m1 && messagesController.R.f(2305843009213693953L) != null) {
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
        if ((!this.actionBar.z() || this.actionBar.A(null)) && H4(this.f0[0], dialog)) {
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
        if (getMessagesController().v2(j2) || getMessagesController().C2(j2)) {
            uc7 messagesController = getMessagesController();
            kf7 messagesStorage = messagesController.getMessagesStorage();
            y97 y97Var = new y97(messagesController, j2);
            to3 to3Var = messagesStorage.a;
            ue2 ue2Var = new ue2(messagesStorage, j2, y97Var, (byte) 5);
            j2 = j2;
            to3Var.c(ue2Var);
        }
        getMessagesController().w3(j2, 0L);
        uc7 messagesController2 = getMessagesController();
        int i5 = dialog.top_message;
        messagesController2.r3(j2, i5, i5, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i4 >= 0) {
            this.T1.remove(i4);
            this.f0[0].y.D();
            this.f0[0].b(true);
        }
    }

    public final void y5() {
        sea seaVar;
        int i;
        bi3 bi3Var = this.D1;
        ArrayList arrayList = this.K2;
        if (bi3Var != null) {
            this.n.a(!arrayList.isEmpty(), true);
            z5();
            if (arrayList.isEmpty()) {
                if (this.T0 == 3 && this.h2 == null) {
                    i = 2131750535;
                } else {
                    i = 2131745397;
                }
                String M0 = ob6.M0(i, null);
                boolean z = this.W3;
                boolean isEmpty = arrayList.isEmpty();
                a aVar = this.actionBar;
                if (z == isEmpty) {
                    aVar.setTitle(M0);
                } else {
                    aVar.N(M0, true, 350L, k43.h);
                }
                if (this.D1.getTag() != null) {
                    this.D1.O0(false, false, false);
                    this.D1.U();
                    this.D1.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                if (this.D1.getTag() == null) {
                    if (!z3() && this.G2 == null) {
                        this.D1.setFieldText("");
                    }
                    this.D1.setTag(1);
                    if (!this.c4 && (seaVar = this.I2) != null) {
                        this.c4 = true;
                        String M02 = ob6.M0(2131745157, null);
                        seaVar.j();
                        seaVar.G = M02;
                        ((ema) seaVar.a[0].f).l(M02, false);
                        ux9 ux9Var = new ux9(seaVar, (byte) 20);
                        seaVar.H = ux9Var;
                        hl.d3(ux9Var, 1000L);
                    }
                }
                this.E1.g(Math.max(1, arrayList.size()), true);
                int i2 = this.U0 + (!TextUtils.isEmpty(this.D1.getFieldText()) ? 1 : 0);
                int size = arrayList.size();
                int i3 = 0;
                long j = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    long longValue = ((Long) obj).longValue();
                    long M1 = getMessagesController().M1(longValue);
                    if (M1 <= 0 && longValue > 0) {
                        M1 = wf3.j(getMessagesController().P2(longValue));
                    }
                    j += M1;
                }
                this.E1.i(i2, j, true);
                this.D1.K2();
                boolean z2 = this.W3;
                boolean isEmpty2 = arrayList.isEmpty();
                a aVar2 = this.actionBar;
                if (z2 == isEmpty2) {
                    aVar2.setTitle(ob6.G(arrayList.size(), "Recipient", new Object[0]));
                } else {
                    aVar2.N(ob6.G(arrayList.size(), "Recipient", new Object[0]), false, 350L, k43.h);
                }
            }
            this.W3 = arrayList.isEmpty();
        } else if (this.T0 == 10) {
            B3(arrayList.isEmpty());
        }
    }

    public final boolean z3() {
        ArrayList arrayList = this.F2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean z4(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.z4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    public final void z5() {
        sea seaVar = this.I2;
        if (seaVar != null) {
            int i = this.currentAccount;
            seaVar.h(i);
            seaVar.d = yac.h(k5.a(i).a).e();
            ArrayList arrayList = seaVar.f;
            arrayList.clear();
            ArrayList arrayList2 = this.K2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            yv3 yv3Var = seaVar.a[0];
            if (seaVar.b == 1) {
                ((ema) yv3Var.e).l(seaVar.c(yv3Var), false);
            }
        }
    }

    @Override
    public final void F() {
    }
}
