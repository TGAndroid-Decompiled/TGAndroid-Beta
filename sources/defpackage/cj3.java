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
import java.util.HashSet;
import java.util.Iterator;
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
public class cj3 extends d implements gk7, aj4, x74, zg6 {
    public static boolean C4;
    public static final boolean[] D4 = new boolean[4];
    public static final ef3 E4 = new ef3((byte) 1);
    public static float F4;
    public qi3 A0;
    public j92 A1;
    public boolean A2;
    public float A3;
    public int A4;
    public boolean B0;
    public FrameLayout B1;
    public boolean B2;
    public boolean B3;
    public int B4;
    public int C0;
    public FrameLayout C1;
    public boolean C2;
    public boolean C3;
    public hi3 D0;
    public hh3 D1;
    public boolean D2;
    public Long D3;
    public boolean E;
    public ffa E0;
    public jh3 E1;
    public wi3 E2;
    public Drawable E3;
    public boolean F;
    public oh3 F0;
    public r7 F1;
    public ArrayList F2;
    public tl F3;
    public boolean G;
    public dj3 G0;
    public final TextPaint G1;
    public String G2;
    public ym G3;
    public TLRPC.RequestPeerType H;
    public boolean H0;
    public fh3 H1;
    public CharSequence H2;
    public rh3 H3;
    public long I;
    public float I0;
    public FrameLayout I1;
    public bba I2;
    public final gh3 I3;
    public ValueAnimator J;
    public float J0;
    public fh3 J1;
    public wc3 J2;
    public final gh3 J3;
    public ValueAnimator K;
    public float K0;
    public FrameLayout K1;
    public final ArrayList K2;
    public s34 K3;
    public boolean L;
    public sb L0;
    public fj3 L1;
    public boolean L2;
    public wtc L3;
    public boolean M;
    public cs5 M0;
    public ej3 M1;
    public int M2;
    public Drawable M3;
    public boolean N;
    public th3 N0;
    public l9 N1;
    public int N2;
    public int N3;
    public float O;
    public boolean O0;
    public dk3 O1;
    public boolean O2;
    public boolean O3;
    public boolean P;
    public boolean P0;
    public x4c P1;
    public int P2;
    public boolean P3;
    public int Q;
    public long Q0;
    public Long Q1;
    public int Q2;
    public boolean Q3;
    public boolean R;
    public long R0;
    public Long R1;
    public int R2;
    public final wf3 R3;
    public boolean S;
    public long S0;
    public rn2 S1;
    public int S2;
    public int S3;
    public m21 T;
    public int T0;
    public ArrayList T1;
    public int T2;
    public AnimatorSet T3;
    public float U;
    public int U0;
    public boolean U1;
    public int U2;
    public boolean U3;
    public boolean V;
    public int V0;
    public hd V1;
    public int V2;
    public k83 V3;
    public boolean W;
    public boolean W0;
    public boolean W1;
    public int W2;
    public String W3;
    public boolean X;
    public mr7 X0;
    public boolean X1;
    public boolean X2;
    public ArrayList X3;
    public pi3 Y;
    public ue3 Y0;
    public long Y1;
    public int Y2;
    public boolean Y3;
    public ys9 Z;
    public ue3 Z0;
    public TLObject Z1;
    public cj3 Z2;
    public CharSequence Z3;
    public final byte a;
    public ls9 a0;
    public boolean a1;
    public int a2;
    public long a3;
    public boolean a4;
    public final fm0 b;
    public vec b0;
    public boolean b1;
    public int b2;
    public TLRPC.Chat b3;
    public float b4;
    public final fm0 c;
    public tf4 c0;
    public final ArrayList c1;
    public boolean c2;
    public TLRPC.ChatFull c3;
    public boolean c4;
    public final fm0 d;
    public float d0;
    public boolean d1;
    public boolean d2;
    public be0 d3;
    public boolean d4;
    public final fm0 e;
    public ValueAnimator e0;
    public boolean e1;
    public boolean e2;
    public pb0 e3;
    public ValueAnimator e4;
    public final fm0 f;
    public bj3[] f0;
    public boolean f1;
    public int f2;
    public long f3;
    public wl5 f4;
    public r7 g0;
    public ed0 g1;
    public boolean g2;
    public boolean g3;
    public TLRPC.FileLocation g4;
    public final fm0 h;
    public r7 h0;
    public final Paint h1;
    public String h2;
    public boolean h3;
    public TLRPC.FileLocation h4;
    public xp3 i0;
    public ImageView i1;
    public String i2;
    public AnimatorSet i3;
    public m21 i4;
    public boolean j0;
    public NumberTextView j1;
    public String j2;
    public boolean j3;
    public int j4;
    public r7 k0;
    public final ArrayList k1;
    public boolean k2;
    public boolean k3;
    public int k4;
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
    public final fm0 n;
    public r7 n0;
    public r7 n1;
    public boolean n2;
    public int n3;
    public int n4;
    public tt8 o0;
    public r7 o1;
    public boolean o2;
    public boolean o3;
    public final cq3 o4;
    public a8 p0;
    public a8 p1;
    public String p2;
    public boolean p3;
    public final lx4 p4;
    public je5 q0;
    public a8 q1;
    public String q2;
    public m21 q3;
    public final lx4 q4;
    public final fm0 r;
    public je5 r0;
    public a8 r1;
    public final zc7 r2;
    public final on r3;
    public final ix4 r4;
    public final fm0 s;
    public boolean s0;
    public a8 s1;
    public boolean s2;
    public boolean s3;
    public final kl0 s4;
    public boolean t0;
    public a8 t1;
    public boolean t2;
    public boolean t3;
    public final kl0 t4;
    public un4 u0;
    public a8 u1;
    public boolean u2;
    public boolean u3;
    public final kl0 u4;
    public un4 v0;
    public a8 v1;
    public boolean v2;
    public boolean v3;
    public final kl0 v4;
    public final fyc w;
    public u41 w0;
    public float w1;
    public boolean w2;
    public float w3;
    public pg3 w4;
    public boolean x;
    public ry1 x0;
    public float x1;
    public boolean x2;
    public ValueAnimator x3;
    public final ArrayList x4;
    public int y;
    public int y0;
    public AnimatorSet y1;
    public boolean y2;
    public float y3;
    public final RectF y4;
    public final UndoView[] z0;
    public float z1;
    public boolean z2;
    public float z3;
    public final RectF z4;

    public cj3(Bundle bundle) {
        super(bundle);
        byte b;
        kl0 kl0Var;
        kl0 kl0Var2;
        kl0 kl0Var3;
        int L;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            b = 48;
        } else {
            b = 0;
        }
        this.a = b;
        s33 s33Var = s33.h;
        this.b = new fm0(1, this, s33Var, 350L, false);
        this.c = new fm0(2, this, s33Var, 350L, false);
        this.d = new fm0(3, this, s33Var, 350L, false);
        this.e = new fm0(4, this, s33Var, 350L, false);
        this.f = new fm0(5, this, s33Var, 350L, false);
        this.h = new fm0(6, this, s33Var, 350L, false);
        this.n = new fm0(7, this, s33Var, 350L, false);
        this.r = new fm0(8, this, s33Var, 350L, false);
        this.s = new fm0(9, this, s33Var, 350L, false);
        this.w = new fyc(new wf3(this, (byte) 27));
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
        this.r3 = new on(null);
        this.I3 = new gh3(this, (byte) 0);
        this.J3 = new gh3(this, (byte) 1);
        this.N3 = -4;
        this.O3 = true;
        this.P3 = true;
        this.R3 = new wf3(this, (byte) 28);
        this.S3 = -1;
        this.b4 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.x4 = arrayList;
        RectF rectF = new RectF();
        this.y4 = rectF;
        RectF rectF2 = new RectF();
        this.z4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        ix4 d = this.glassEngine.d(new ag3(this, (byte) 12));
        this.r4 = d;
        if (i >= 31) {
            cq3 cq3Var = new cq3(false);
            this.o4 = cq3Var;
            lx4 lx4Var = new lx4(d);
            this.q4 = lx4Var;
            lx4Var.f = d;
            lx4Var.d = cq3Var;
            lx4Var.e = -2;
            lx4 lx4Var2 = new lx4(null);
            this.p4 = lx4Var2;
            lx4Var2.f = d;
            lx4Var2.d = cq3Var;
            lx4Var2.e = -3;
            kl0Var2 = new kl0(lx4Var, lx4Var, lx4Var);
            this.u4 = kl0Var2;
            kl0Var2.k = true;
            if (e66.e(262144)) {
                L = gl.L(8.0f);
            } else {
                L = gl.L(48.0f);
            }
            kl0Var2.d = L;
            kl0Var2.e = L;
            kl0Var = new kl0(lx4Var2, lx4Var2, lx4Var2);
            this.s4 = kl0Var;
            kl0Var.k = true;
            int L2 = gl.L(48.0f);
            kl0Var.d = L2;
            kl0Var.e = L2;
            kl0Var3 = new kl0(lx4Var2, lx4Var2, lx4Var2);
            this.t4 = kl0Var3;
        } else {
            this.o4 = null;
            this.p4 = null;
            this.q4 = null;
            kl0Var = new kl0(d, d, d);
            this.s4 = kl0Var;
            kl0Var2 = new kl0(d, d, d);
            this.u4 = kl0Var2;
            kl0Var3 = new kl0(d, d, d);
            this.t4 = kl0Var3;
        }
        kl0 kl0Var4 = new kl0(d, d, d);
        this.v4 = kl0Var4;
        qw4 qw4Var = this.glassEngine;
        kl0Var2.j = qw4Var;
        kl0Var.j = qw4Var;
        kl0Var3.j = qw4Var;
        kl0Var4.j = qw4Var;
    }

    public static void A3(mu1 mu1Var, k27 k27Var) {
        CharSequence charSequence;
        if (k27Var != null && k27Var.r2()) {
            try {
                if (!TextUtils.isEmpty(k27Var.z)) {
                    charSequence = k27Var.z;
                } else {
                    charSequence = k27Var.v;
                }
                CharSequence v1 = gl.v1(charSequence, k27Var.a2, null);
                if (v1 instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) v1;
                    cm4[] cm4VarArr = (cm4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cm4.class);
                    if (cm4VarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(cm4VarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(cm4VarArr[0]);
                        for (int i = 1; i < cm4VarArr.length; i++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(cm4VarArr[i]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(cm4VarArr[i]);
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
                        mu1Var.Ab(k27Var.L1(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                    }
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public static ue3 l3(bj3 bj3Var) {
        yi3 yi3Var = bj3Var.a;
        for (int i = 0; i < yi3Var.getChildCount(); i++) {
            View childAt = yi3Var.getChildAt(i);
            if (childAt instanceof ue3) {
                ue3 ue3Var = (ue3) childAt;
                if (ue3Var.Y()) {
                    return ue3Var;
                }
            }
        }
        return null;
    }

    public static void t4(j5 j5Var) {
        SharedPreferences.Editor editor;
        int i = j5Var.a;
        boolean[] zArr = D4;
        if (!zArr[i]) {
            na7 q1 = na7.q1(i);
            if (q1.k2 == 0 && !q1.getUserConfig().T) {
                SharedPreferences sharedPreferences = na7.q1(q1.currentAccount).W3;
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
                q1.k2 = 4;
                for (int i2 = 0; i2 < 3; i2++) {
                    TL_account.getNotifySettings getnotifysettings = new TL_account.getNotifySettings();
                    if (i2 == 0) {
                        getnotifysettings.peer = new TLRPC.TL_inputNotifyChats();
                    } else if (i2 == 1) {
                        getnotifysettings.peer = new TLRPC.TL_inputNotifyUsers();
                    } else {
                        getnotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
                    }
                    q1.getConnectionsManager().sendRequest(getnotifysettings, new e97(q1, i2, (byte) 1));
                }
                q1.getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new y47(q1, (byte) 6));
            }
            if (!q1.getUserConfig().U && !q1.l2) {
                q1.l2 = true;
                q1.getConnectionsManager().sendRequest(new TL_account.getContactSignUpNotification(), new y47(q1, (byte) 14));
            }
            q1.X2(0, 0, 100, true, null);
            if (q1.s.isEmpty() && !TextUtils.isEmpty(q1.t3)) {
                TLRPC.TL_help_getRecentMeUrls tL_help_getRecentMeUrls = new TLRPC.TL_help_getRecentMeUrls();
                tL_help_getRecentMeUrls.referer = q1.t3;
                q1.getConnectionsManager().sendRequest(tL_help_getRecentMeUrls, new y47(q1, (byte) 4));
            }
            q1.i3(0, y6c.h(i).f(), false);
            qu2.r(i).f();
            hq6.d0(i).w(false);
            gl.d3(new mk2(j5Var, (byte) 25), 200L);
            Iterator it = q1.y3.iterator();
            while (it.hasNext()) {
                hq6.d0(i).d1((String) it.next(), true, true);
            }
            zArr[i] = true;
        }
    }

    @Override
    public final lx4 A() {
        return this.q4;
    }

    public final void A2(boolean z) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.Y2 == 0 && this.a3 == 0 && Build.VERSION.SDK_INT >= 33 && tl7.E0(parentActivity)) {
                if (z) {
                    showDialog(new tl7(parentActivity, !rqe.a(), new jg3(parentActivity, (byte) 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().V && this.W1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z) {
                    hd hdVar = ij.v(parentActivity, new qg3(this, (byte) 0)).a;
                    this.V1 = hdVar;
                    showDialog(hdVar);
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
            } else if ((i <= 28 || w01.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
            if (arrayList.isEmpty()) {
                if (this.B0) {
                    this.B0 = false;
                    a5();
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

    public final void A4(View view) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i = 0; i < 4; i++) {
            if (y6c.h(i).o()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        Collections.sort(arrayList, new mz2((byte) 12));
        cs5 I = cs5.I(this, view);
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
                int i3 = bkb.h6;
                Drawable Y = bkb.Y(getThemedColor(i3), 0, 0);
                vkb M = zkb.M(i3);
                wjb resourceProvider = getResourceProvider();
                linearLayout.setBackground(Y);
                zkb.j(linearLayout, Y, null, M, resourceProvider);
                TLRPC.User f = y6c.h(intValue).f();
                pb0 pb0Var = new pb0((wjb) null);
                pb0Var.q(f);
                oi3 oi3Var = new oi3(this, getParentActivity(), z);
                linearLayout.addView(oi3Var, nme.t(34, 34, 16, 12, 0, 0, 0));
                be0 be0Var = new be0(getParentActivity());
                if (z) {
                    be0Var.setScaleX(0.833f);
                    be0Var.setScaleY(0.833f);
                }
                be0Var.setRoundRadius(gl.L(16.0f));
                be0Var.getImageReceiver().d = intValue;
                be0Var.f(f, pb0Var);
                oi3Var.addView(be0Var, nme.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                zkb.X(textView, bkb.i5, getResourceProvider());
                textView.setText(l7c.r(f));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, nme.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new wg(this, intValue, I, (byte) 7));
                I.q(linearLayout, nme.o(230, 48));
            }
        }
        ShapeDrawable b0 = bkb.b0(gl.L(24.0f), getThemedColor(bkb.c6));
        b0.getPaint().setShadowLayer(gl.L(6.0f), 0.0f, gl.L(1.0f), bkb.p1(0.15f, -16777216));
        I.z.set(-gl.L(4.0f), -gl.L(4.0f), -gl.L(4.0f), -gl.L(4.0f));
        I.X(b0);
        I.b0(0.0f, -gl.L(4.0f));
        I.W(5);
        I.a0();
    }

    public final void A5(boolean z) {
        a aVar;
        boolean z2;
        boolean z3;
        g2b t3;
        ArrayList arrayList;
        boolean z4;
        boolean z5;
        int i;
        float f;
        float f2;
        if (this.F0 != null && this.J == null) {
            rh3 rh3Var = this.H3;
            if ((rh3Var == null || !rh3Var.c()) && !this.s3 && (aVar = this.actionBar) != null && !aVar.y() && !this.n2) {
                t7b t7bVar = t7b.G2;
                int i2 = 0;
                if ((t7bVar != null && t7bVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
                    z = false;
                }
                if (!D3() && t3().H()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.a3 != 0) {
                    z3 = false;
                } else if (D3()) {
                    z3 = !t3().h.isEmpty();
                } else {
                    if (!z2 && (((arrayList = (t3 = t3()).g) != null && arrayList.size() > 0) || t3.I())) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z2 = t3().H();
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
                    oh3 oh3Var = this.F0;
                    if (z4 != z6) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    oh3Var.q(z, z5);
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
                        ofFloat.addUpdateListener(new ae0(this, (byte) 4));
                        this.K.addListener(new im2(this, (byte) 8));
                        this.K.setDuration(200L);
                        this.K.setInterpolator(s33.f);
                        this.K.start();
                    } else {
                        oh3 oh3Var2 = this.F0;
                        if (z7 && !isInPreviewMode()) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        oh3Var2.setVisibility(i);
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
                            f3 = o3();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.J = ofFloat2;
                        ofFloat2.addUpdateListener(new fi3(this, f5, z3, f3));
                        this.J.addListener(new xh3(this, z3, (byte) 2));
                        this.J.setDuration(200L);
                        this.J.setInterpolator(s33.f);
                        this.J.start();
                        return;
                    }
                    this.L = z3;
                    oh3 oh3Var3 = this.F0;
                    if ((z3 || this.M) && !isInPreviewMode()) {
                        i3 = 0;
                    }
                    oh3Var3.setVisibility(i3);
                    if (!z3) {
                        S4(0.0f);
                    } else {
                        this.A3 = -gl.L(81.0f);
                        S4(-o3());
                    }
                    while (true) {
                        bj3[] bj3VarArr = this.f0;
                        if (i2 >= bj3VarArr.length) {
                            break;
                        }
                        bj3 bj3Var = bj3VarArr[i2];
                        if (bj3Var != null) {
                            bj3Var.a.requestLayout();
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

    public final void B2(CharSequence charSequence) {
        int i;
        if (this.D1 != null) {
            if (this.F2 == null && this.G2 == null && this.H2 == null) {
                return;
            }
            if (this.I2 == null) {
                bba bbaVar = new bba(getParentActivity(), getResourceProvider());
                this.I2 = bbaVar;
                bbaVar.setLayoutClickListener(new zf3(this, (byte) 0));
                this.I2.setOnModeChangeListener(new ag3(this, (byte) 0));
                hh3 hh3Var = this.D1;
                bba bbaVar2 = this.I2;
                if (bbaVar2 == null) {
                    hh3Var.getClass();
                } else {
                    hh3Var.w2 = bbaVar2;
                    hh3Var.addView(bbaVar2, 0, nme.e(-1, 48, 51));
                    hh3Var.W3 = false;
                    hh3Var.Q();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.I2.getLayoutParams();
                layoutParams.rightMargin = -this.D1.getPaddingRight();
                this.I2.setLayoutParams(layoutParams);
            }
            if (x3()) {
                this.I2.i(this.currentAccount, this.F2);
            } else {
                String str = this.G2;
                if (str != null) {
                    bba bbaVar3 = this.I2;
                    bbaVar3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        bbaVar3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.H2;
                    if (charSequence2 != null) {
                        bba bbaVar4 = this.I2;
                        bbaVar4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            bbaVar4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.D1.setFieldText(charSequence);
            }
            hh3 hh3Var2 = this.D1;
            if (x3()) {
                i = 2131754451;
            } else {
                i = 2131745270;
            }
            hh3Var2.setOverrideHint(k96.M0(i, null));
            P2();
            if (this.I2.getMode() != 0) {
                this.D1.b2(false, false);
            }
            v5();
        }
    }

    public final void B3(int r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.B3(int):void");
    }

    public final void B4() {
        boolean z = true;
        try {
            ((oy8) ((pb0) this.O1.h.getImageReceiver().n0).K).C(true);
        } catch (Exception unused) {
        }
        if (this.f4 == null) {
            wl5 wl5Var = new wl5(0, true, true);
            this.f4 = wl5Var;
            wl5Var.I = true;
            wl5Var.a = this;
            wl5Var.b = new mi3(this);
            getMediaDataController().z();
            getMessagesController().f3();
            getMessagesController().i3(this.classGuid, getUserConfig().f(), true);
        }
        TLRPC.User V1 = na7.q1(this.currentAccount).V1(Long.valueOf(y6c.h(this.currentAccount).e()));
        if (V1 == null) {
            V1 = y6c.h(this.currentAccount).f();
        }
        if (V1 == null) {
            return;
        }
        x02 x02Var = this.f4.c;
        if (x02Var != null) {
            x02Var.H0();
        }
        wl5 wl5Var2 = this.f4;
        TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
        if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z = false;
        }
        wl5Var2.n(z, new sg3(this, (byte) 11), new eg3(this, (byte) 3), 0);
    }

    public final void B5(int i, boolean z) {
        boolean z2;
        if (this.A0 != null && this.T0 == 0 && !this.n2) {
            this.S3 = i;
            t97 v3 = v3();
            this.S3 = -1;
            boolean z3 = false;
            if (v3 != null && getMessagesController().R0().size() > 1 && getMessagesController().q2(v3)) {
                z2 = true;
            } else {
                z2 = false;
            }
            qi3 qi3Var = this.A0;
            if (z && qi3Var.getVisibility() == 0) {
                z3 = true;
            }
            qi3Var.k(z2, z3);
        }
    }

    public final String C2() {
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
                    sb.append(k96.M0(2131745709, null));
                } else {
                    int size2 = arrayList.size();
                    int i2 = this.currentAccount;
                    if (size2 == 1) {
                        r = cf3.k(i2, longValue);
                    } else {
                        r = cf3.r(i2, longValue);
                    }
                    sb.append(r);
                }
            }
            return k96.a0(null, null, 2131745247, sb.toString());
        }
        return k96.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public final boolean C3() {
        if (this.A0 != null && this.T0 == 0 && !this.n2 && this.Y2 == 0 && this.a3 == 0 && getMessagesController().j2()) {
            return true;
        }
        return false;
    }

    public final void C4() {
        if (!this.P3) {
            je5 je5Var = this.r0;
            if (je5Var != null) {
                if (je5Var.W) {
                    return;
                }
                gl.B2(je5Var);
            }
            SpannableStringBuilder N2 = gl.N2(k96.N0("StoriesPremiumHint2").replace('\n', ' '), bkb.wj, 0, new sg3(this, (byte) 4), null);
            je5 je5Var2 = new je5(getParentActivity(), 2);
            je5Var2.q(8.0f);
            je5Var2.d = 8000L;
            je5Var2.j(true);
            je5Var2.p(true);
            je5Var2.h = gl.q.x - gl.L(148.0f);
            je5Var2.t(N2);
            je5Var2.n(1.0f, -40.0f);
            je5Var2.i(getThemedColor(bkb.vj));
            this.r0 = je5Var2;
            je5Var2.setTranslationY((-this.k4) - this.m4);
            ((ViewGroup) this.fragmentView).addView(this.r0, nme.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            this.r0.v();
            return;
        }
        je5 je5Var3 = this.q0;
        if (je5Var3 != null) {
            je5Var3.f(true);
        }
        wx n = na7.q1(this.currentAccount).M1().n();
        if (n != null && n.a(this.currentAccount, 1)) {
            showDialog(new h26(n.b(), this.currentAccount, null, getParentActivity(), this));
            return;
        }
        t7b C = t7b.C(getParentActivity(), this.currentAccount);
        C.y = new ih3(this);
        C.Q(null);
    }

    public final void C5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.C5(int, boolean):void");
    }

    @Override
    public final List D() {
        return Arrays.asList(new zi4(k96.M0(2131751636, null)), new zi4(k96.M0(2131752064, null), new wf3(this, (byte) 23)), new zi4(k96.M0(2131751637, null), new wf3(this, (byte) 24)));
    }

    public final int D2() {
        if (this.D1 != null) {
            return (int) (this.A1.getInputBubbleHeight() + this.w.d() + gl.L(9.0f) + gl.L(7.0f) + gl.L(2.0f));
        }
        int i = (this.a3 > 0L ? 1 : (this.a3 == 0L ? 0 : -1));
        int i2 = this.k4;
        if (i != 0) {
            return gl.L(72.0f) + i2;
        }
        return i2 + this.m4;
    }

    public final boolean D3() {
        if (this.Y2 == 1) {
            return true;
        }
        return false;
    }

    public final boolean D4(bj3 bj3Var, TLRPC.Dialog dialog) {
        TLRPC.EncryptedChat Y0;
        if (bj3Var != null && dialog != null) {
            if (!getMessagesController().o4.containsKey(Long.valueOf(dialog.id))) {
                if (I3(bj3Var)) {
                    return true;
                }
                t97 q3 = q3(bj3Var);
                if (q3 != null) {
                    int i = q3.g;
                    int i2 = na7.q5;
                    if ((i & 64) != 0) {
                        int i3 = this.currentAccount;
                        long j = dialog.id;
                        if (cf3.B(j) && (Y0 = na7.q1(i3).Y0(Integer.valueOf((int) (4294967295L & j)))) != null) {
                            j = Y0.user_id;
                        }
                        if (!q3.h.contains(Long.valueOf(j))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean D5(long j) {
        TLRPC.Chat K0;
        hh3 hh3Var;
        if ((this.U0 <= 1 && ((hh3Var = this.D1) == null || hh3Var.getVisibility() != 0 || TextUtils.isEmpty(this.D1.getFieldText()))) || !cf3.y(j) || (K0 = getMessagesController().K0(Long.valueOf(-j))) == null || hc2.N(K0) || !K0.slowmode_enabled) {
            return true;
        }
        ij.r0(this, k96.M0(2131745118, null), k96.M0(2131745110, null), null);
        return false;
    }

    public final boolean E2() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.K2;
            if (i < arrayList.size()) {
                TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-((Long) arrayList.get(i)).longValue()));
                if (K0 != null && !hc2.l(K0)) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    public final boolean E3(long j) {
        if (j < 0) {
            return false;
        }
        TLRPC.User V1 = getMessagesController().V1(Long.valueOf(j));
        if (!l7c.w(V1)) {
            return false;
        }
        ArrayList l = na7.q1(this.currentAccount).g4.l(-V1.id);
        if ((l != null && !l.isEmpty()) || !na7.q1(this.currentAccount).g4.e(-V1.id)) {
            return false;
        }
        return true;
    }

    public final boolean E4(bj3 bj3Var) {
        if (bj3Var == null) {
            return false;
        }
        if (I3(bj3Var)) {
            return true;
        }
        t97 q3 = q3(bj3Var);
        if (q3 != null) {
            int i = q3.g;
            int i2 = na7.q5;
            if ((i & 64) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void F(float f, int i) {
        r7 r7Var;
        if (i == 3 && (r7Var = this.m0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) r7Var.getIconView().getDrawable();
            if (this.d.f) {
                animatedVectorDrawable.start();
                if (gba.o() != 0) {
                    TLRPC.TL_help_premiumPromo tL_help_premiumPromo = hq6.d0(this.currentAccount).E;
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
                            ba4.G(this.currentAccount).X(tL_help_premiumPromo.videos.get(i2), tL_help_premiumPromo, 3, 0);
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

    public final void F2() {
        int themedColor;
        yf8 yf8Var;
        dh3 dh3Var;
        mt9 mt9Var;
        rkb rkbVar;
        hi3 hi3Var = this.D0;
        if (hi3Var != null && (mt9Var = hi3Var.e0) != null && (rkbVar = mt9Var.l0) != null) {
            int childCount = rkbVar.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = rkbVar.getChildAt(i);
                if (childAt instanceof ee5) {
                    ee5 ee5Var = (ee5) childAt;
                    pb0 pb0Var = ee5Var.c;
                    boolean D = cf3.D(ee5Var.f);
                    int i2 = ee5Var.h;
                    if (D) {
                        TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(ee5Var.f));
                        ee5Var.e = V1;
                        pb0Var.q(V1);
                    } else {
                        pb0Var.p(na7.q1(i2).K0(Long.valueOf(-ee5Var.f)));
                        ee5Var.e = null;
                    }
                    ee5Var.c(true);
                }
            }
        }
        if (this.f0 != null) {
            int i3 = 0;
            while (true) {
                bj3[] bj3VarArr = this.f0;
                if (i3 >= bj3VarArr.length) {
                    break;
                }
                bj3 bj3Var = bj3VarArr[i3];
                if (bj3Var != null && (dh3Var = bj3Var.n) != null) {
                    dh3Var.h();
                }
                i3++;
            }
        }
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.I(getThemedColor(bkb.F8), true);
            this.actionBar.J(getThemedColor(bkb.D8), false, true);
            this.actionBar.J(getThemedColor(bkb.E8), true, true);
            this.actionBar.K(getThemedColor(bkb.H5), true);
            this.actionBar.updateColors();
        }
        if (this.F3 != null) {
            int themedColor2 = getThemedColor(bkb.pi);
            Drawable drawable = this.M3;
            if (drawable != null && themedColor2 != this.B4) {
                this.B4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            tl tlVar = this.F3;
            if (tlVar != null) {
                tlVar.k(Integer.valueOf(themedColor2));
            }
            ym ymVar = this.G3;
            if (ymVar != null) {
                ymVar.setColor(themedColor2);
            }
        }
        dk3 dk3Var = this.O1;
        if (dk3Var != null) {
            bkb.F1(dk3Var.getBackground(), bkb.w0(null, bkb.h6, false), true);
        }
        r7 r7Var = this.n0;
        if (r7Var != null) {
            r7Var.setIconColor(getThemedColor(bkb.u8));
        }
        hh3 hh3Var = this.D1;
        if (hh3Var != null) {
            hh3Var.updateColors();
        }
        qi3 qi3Var = this.A0;
        if (qi3Var != null) {
            il0 il0Var = qi3Var.F0;
            if (il0Var != null) {
                il0Var.updateColors();
            }
            jo0 jo0Var = qi3Var.z0;
            if (jo0Var != null) {
                jo0Var.g();
            }
            qi3Var.invalidate();
        }
        tf4 tf4Var = this.c0;
        if (tf4Var != null) {
            tf4Var.updateColors();
        }
        hi3 hi3Var2 = this.D0;
        if (hi3Var2 != null && (yf8Var = hi3Var2.s0) != null) {
            yf8Var.c();
        }
        vec vecVar = this.b0;
        if (vecVar != null) {
            vecVar.updateColors();
        }
        ls9 ls9Var = this.a0;
        if (ls9Var != null) {
            ls9Var.updateColors();
        }
        if (this.L0 != null) {
            int o = bm2.o(getThemedColor(bkb.c6), 100);
            boolean z = this.L0.getForeground() instanceof ColorDrawable;
            sb sbVar = this.L0;
            if (z) {
                if (((ColorDrawable) sbVar.getForeground()).getColor() != o) {
                    ((ColorDrawable) this.L0.getForeground()).setColor(o);
                }
            } else {
                sbVar.setForeground(new ColorDrawable(o));
            }
        }
        un4 un4Var = this.u0;
        if (un4Var != null) {
            un4Var.updateColors();
        }
        un4 un4Var2 = this.v0;
        if (un4Var2 != null) {
            un4Var2.updateColors();
        }
        int i4 = bkb.c6;
        this.r4.a(getThemedColor(i4));
        fj3 fj3Var = this.L1;
        if (fj3Var != null) {
            fj3Var.updateColors();
        }
        ej3 ej3Var = this.M1;
        if (ej3Var != null) {
            ej3Var.setColor(bkb.w0(null, i4, false));
        }
        fh3 fh3Var = this.J1;
        if (fh3Var != null) {
            fh3Var.updateColors();
        }
        fh3 fh3Var2 = this.H1;
        if (fh3Var2 != null) {
            fh3Var2.updateColors();
        }
        t5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        oh3 oh3Var = this.F0;
        if (oh3Var != null) {
            oh3Var.o();
        }
        if (this.E3 != null && (themedColor = getThemedColor(bkb.Wl)) != this.A4) {
            this.A4 = themedColor;
            this.E3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        pi3 pi3Var = this.Y;
        if (pi3Var != null) {
            pi3Var.updateColors();
        }
    }

    public final boolean F3(TLRPC.Dialog dialog) {
        char c;
        if (dialog != null) {
            int i = this.f0[0].s;
            t97 t97Var = null;
            if ((i == 7 || i == 8) && (!this.actionBar.y() || this.actionBar.z(null))) {
                t97[] t97VarArr = getMessagesController().N;
                if (this.f0[0].s == 8) {
                    c = 1;
                } else {
                    c = 0;
                }
                t97Var = t97VarArr[c];
            }
            if (t97Var != null) {
                if (t97Var.j.indexOfKey(dialog.id) >= 0) {
                    return true;
                }
            } else {
                return dialog.pinned;
            }
        }
        return false;
    }

    public final void F4(int i, long j, TLRPC.Chat chat, boolean z, boolean z2) {
        if (i == 103) {
            getMessagesController().T(1, j, z2);
            return;
        }
        if (chat != null) {
            if (hc2.r0(chat)) {
                getMessagesController().T(0, j, z2);
            } else {
                getMessagesController().c0(-j, getMessagesController().V1(Long.valueOf(getUserConfig().e())), null, z2, false);
            }
        } else {
            getMessagesController().T(0, j, z2);
            if (z && z2) {
                getMessagesController().t(j);
            }
        }
        if (gl.O1()) {
            getNotificationCenter().k(kk7.s, Long.valueOf(j));
        }
        getMessagesController().F(this.Y2);
    }

    public final void G2() {
        gl.d3(new sg3(this, (byte) 13), 300L);
    }

    public final boolean G3(int i) {
        char c;
        if (i == 0) {
            return C3();
        }
        if ((i == 7 || i == 8) && this.T0 == 0) {
            na7 messagesController = getMessagesController();
            t97[] t97VarArr = getMessagesController().N;
            if (i == 8) {
                c = 1;
            } else {
                c = 0;
            }
            if (messagesController.q2(t97VarArr[c])) {
                return true;
            }
        }
        return false;
    }

    public final void G4(java.util.ArrayList r43, int r44, boolean r45, boolean r46, java.util.HashSet r47) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.G4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    public final boolean H2(bj3 bj3Var) {
        if (!this.H3.c()) {
            int i = (int) (-this.O);
            int o3 = o3();
            int p3 = p3();
            if (i != 0 && i != o3 && i != p3 && bj3Var.a.canScrollVertically(-1)) {
                if (p3 < i && i < o3) {
                    int L = gl.L(48.0f);
                    int i2 = i - p3;
                    int i3 = L / 2;
                    kp kpVar = bj3Var.b;
                    if (i2 < i3) {
                        kpVar.y(-i2);
                        return true;
                    }
                    kpVar.y(L - i2);
                    return true;
                }
                float f = 1.0f;
                if (this.w3 != 1.0f) {
                    f = Utilities.i((-this.O) / gl.L(81.0f), 1.0f, 0.0f);
                }
                int i4 = (f > this.F0.C0 ? 1 : (f == this.F0.C0 ? 0 : -1));
                kp kpVar2 = bj3Var.b;
                if (i4 < 0) {
                    kpVar2.y(-i);
                    return true;
                }
                kpVar2.y(p3 - i);
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean H3() {
        if (this.E2 == null && this.p2 == null) {
            return true;
        }
        return false;
    }

    public final void H4(long j, boolean z, t97 t97Var, int i, boolean z2) {
        int i2;
        boolean z3;
        int i3;
        boolean D3;
        int i4 = 0;
        if (this.f0[0].s == 0 && w3() && this.f0[0].w == 2) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int K0 = this.f0[0].c.K0();
        if (t97Var != null) {
            int i5 = t97Var.j.get(j, Integer.MIN_VALUE);
            if (!z && i5 == Integer.MIN_VALUE) {
                return;
            }
        }
        int i6 = -1;
        if (K0 <= i2 && z2) {
            Q4(true, true);
            G2();
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
        if (t97Var != null) {
            LongSparseIntArray longSparseIntArray = t97Var.j;
            if (z) {
                longSparseIntArray.put(j, i);
            } else {
                longSparseIntArray.delete(j);
            }
            if (z2) {
                getMessagesController().y3(t97Var);
            }
            D3 = true;
        } else {
            D3 = getMessagesController().D3(j, z, null, -1L);
        }
        if (D3) {
            if (z3) {
                if (this.T0 != 10) {
                    z3(false);
                }
                N4(true, false);
            } else {
                ArrayList m3 = m3(this.currentAccount, this.f0[0].s, this.Y2, false);
                int i8 = 0;
                while (true) {
                    if (i8 >= m3.size()) {
                        break;
                    } else if (((TLRPC.Dialog) m3.get(i8)).id == j) {
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
                    bj3 bj3Var = this.f0[0];
                    ah3 ah3Var = bj3Var.c;
                    if (bj3Var.s == 0 && w3() && this.f0[0].w == 2) {
                        i4 = 1;
                    }
                    ah3Var.g1(i4, (int) this.O);
                    return;
                } else if (i6 >= 0 && i3 == i6) {
                    gl.d3(new wf3(this, (byte) 21), 200L);
                    return;
                }
            }
            Q4(false, true);
        }
    }

    public final boolean I2(long j) {
        int i;
        int i2 = this.T0;
        if (i2 != 15 && i2 != 16 && this.j2 == null && this.u2) {
            if (cf3.y(j)) {
                long j2 = -j;
                TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(j2));
                if (hc2.T(K0) && !K0.megagroup) {
                    if (!this.s2) {
                        TLRPC.Chat K02 = na7.q1(this.currentAccount).K0(Long.valueOf(j2));
                        if ((hc2.n(K02) || K02.megagroup) && (i = this.V0) != 2 && i != 3) {
                            return true;
                        }
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = k96.M0(2131745404, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    int i3 = this.V0;
                    if (i3 == 3) {
                        hdVar.U = k96.M0(2131743850, null);
                    } else if (i3 == 2) {
                        hdVar.U = k96.M0(2131746394, null);
                    } else {
                        hdVar.U = k96.M0(2131752428, null);
                    }
                    alertDialog$Builder.g(k96.M0(2131747638, null), null);
                    showDialog(hdVar);
                    return false;
                }
                return true;
            } else if (cf3.B(j)) {
                if (this.V0 != 0 || this.W0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String M02 = k96.M0(2131745404, null);
                    hd hdVar2 = alertDialog$Builder2.a;
                    hdVar2.S = M02;
                    int i4 = this.V0;
                    if (i4 == 3) {
                        hdVar2.U = k96.M0(2131743849, null);
                    } else if (i4 != 0) {
                        hdVar2.U = k96.M0(2131746983, null);
                    } else {
                        hdVar2.U = k96.M0(2131748912, null);
                    }
                    alertDialog$Builder2.g(k96.M0(2131747638, null), null);
                    showDialog(hdVar2);
                    return false;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public final boolean I3(bj3 bj3Var) {
        if (bj3Var != null && G3(bj3Var.s)) {
            return true;
        }
        return false;
    }

    public final void I4() {
        if (this.L0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(bkb.c6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.L0.setBackground(new BitmapDrawable(createBitmap));
        this.L0.setAlpha(0.0f);
        this.L0.setVisibility(0);
        V2();
    }

    public final void J2(boolean z) {
        rn2 rn2Var;
        TLRPC.ChatFull chatFull;
        boolean z2;
        fj3 fj3Var = this.L1;
        if (fj3Var != null && (rn2Var = this.S1) != null && (chatFull = this.c3) != null) {
            if (this.a3 != 0 && chatFull.requests_pending > 0 && !this.b.f) {
                z2 = true;
            } else {
                z2 = false;
            }
            fj3Var.j(rn2Var, z2, z);
            this.S1.setTitle(k96.G(this.c3.requests_pending, "CommunityPendingRequestsRow", new Object[0]));
        }
    }

    public final void J3() {
        t11 t11Var = new t11(getParentActivity(), this.resourceProvider);
        t11Var.d(2131624009, new String[0]);
        t11Var.b.setText(k96.M0(2131742548, null));
        m21.g(this, t11Var, 2750).j();
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void J4(boolean z) {
        bj3[] bj3VarArr = this.f0;
        if (bj3VarArr != null && !this.U1) {
            for (bj3 bj3Var : bj3VarArr) {
                if (bj3Var.getVisibility() == 0) {
                    if (z) {
                        yg3 yg3Var = bj3Var.y;
                        yg3Var.D();
                        yg3Var.A = true;
                    }
                    bj3Var.b(z);
                    K2(bj3Var);
                }
            }
        }
        qi3 qi3Var = this.A0;
        if (qi3Var != null && qi3Var.getVisibility() == 0) {
            this.A0.c();
        }
    }

    public final void K2(defpackage.bj3 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.K2(bj3):void");
    }

    public final void K3(int i) {
        Object obj;
        TLRPC.User user;
        ht9 ht9Var = this.D0.r0;
        if (i >= ht9Var.a0 && i < ht9Var.b0) {
            c4c G = ht9Var.G(i);
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
            String M0 = k96.M0(2131754177, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.a0(null, null, 2131754176, "\"" + l7c.r(user) + "\"");
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            alertDialog$Builder.j(k96.M0(2131746128, null), new v82(this, (TLRPC.User) obj, (byte) 21));
            alertDialog$Builder.c(-1);
            alertDialog$Builder.o();
        }
    }

    public final void K4(bj3 bj3Var) {
        int i;
        pi4 pi4Var;
        if (bj3Var.getVisibility() != 0) {
            return;
        }
        int i2 = bj3Var.d.w;
        if (bj3Var.s == 0 && w3() && bj3Var.a.getChildCount() == 0 && bj3Var.w == 2) {
            ((t26) bj3Var.a.getLayoutManager()).g1(1, (int) this.O);
        }
        bj3Var.d.getClass();
        bj3Var.d.Q();
        int b = bj3Var.d.b();
        if (b == 1 && i2 == 1 && bj3Var.d.d(0) == 5) {
            bj3Var.b(true);
        } else {
            bj3Var.b(false);
            if (b > i2 && (i = this.T0) != 11 && i != 12 && i != 13) {
                bj3Var.E.b(i2);
            }
        }
        try {
            yi3 yi3Var = bj3Var.a;
            if (this.Y2 == 0 && this.a3 == 0) {
                pi4Var = bj3Var.x;
            } else {
                pi4Var = null;
            }
            yi3Var.setEmptyView(pi4Var);
        } catch (Exception e) {
            fa4.g(e, true);
        }
        K2(bj3Var);
    }

    public final void L2() {
        getMessagesStorage().getClass();
    }

    public final void L3(bj3 bj3Var, View view, int i) {
        int i2;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof l35) {
            return;
        }
        boolean z = view instanceof ue3;
        if (z) {
            ue3 ue3Var = (ue3) view;
            if (ue3Var.o2) {
                e5(ue3Var.getDialogId(), view);
                return;
            }
        }
        if (c3()) {
            z4(view, i, 0.0f, bj3Var.d);
            return;
        }
        int i3 = this.T0;
        if (i3 == 15 && (view instanceof wgb)) {
            bj3Var.d.L();
            return;
        }
        int i4 = 0;
        if ((i3 == 11 || i3 == 13) && i == 1) {
            Bundle l = ir2.l("forImport", true);
            l.putLongArray("result", new long[]{getUserConfig().e()});
            l.putInt("chatType", 4);
            String string = this.arguments.getString("importTitle");
            if (string != null) {
                l.putString("title", string);
            }
            wa5 wa5Var = new wa5(l);
            wa5Var.Z = new bh3(this);
            presentFragment(wa5Var);
            return;
        }
        if ((view instanceof dk3) && ((i2 = bj3Var.s) == 7 || i2 == 8)) {
            mj3 mj3Var = (mj3) bj3Var.d.N.get(0);
            if (mj3Var != null && mj3Var.a == 17) {
                tL_chatlists_chatlistUpdates = mj3Var.i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                t97 t97Var = getMessagesController().N[bj3Var.s - 7];
                if (t97Var != null) {
                    int i5 = t97Var.a;
                    ?? fy0Var = new fy0(this, false);
                    fy0Var.T1 = -1;
                    fy0Var.X1 = "";
                    fy0Var.Y1 = new ArrayList();
                    fy0Var.a2 = "";
                    fy0Var.c2 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    fy0Var.d2 = arrayList;
                    fy0Var.u2 = -1;
                    fy0Var.x2 = -5;
                    fy0Var.T1 = i5;
                    fy0Var.V1 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    fy0Var.b2 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList arrayList2 = getMessagesController().G0;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i4 >= arrayList2.size()) {
                                break;
                            } else if (((t97) arrayList2.get(i4)).a == i5) {
                                fy0Var.X1 = ((t97) arrayList2.get(i4)).b;
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                    fy0Var.a1();
                    showDialog(fy0Var);
                    return;
                }
                return;
            }
        } else if (z && !this.actionBar.y() && !this.H3.c()) {
            ImageReceiver imageReceiver = ((ue3) view).Z1;
            gl.P.set(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x());
        }
        y4(view, i, bj3Var.d);
    }

    public final void L4() {
        boolean z;
        float f = 0.0f;
        if (this.O != 0.0f && !(z = this.L)) {
            if (z) {
                f = -p3();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.I3, f));
            animatorSet.setInterpolator(s33.f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    public final void M2() {
        if (this.f0 != null) {
            int D2 = D2();
            int i = 0;
            while (true) {
                bj3[] bj3VarArr = this.f0;
                if (i < bj3VarArr.length) {
                    bj3 bj3Var = bj3VarArr[i];
                    if (bj3Var != null) {
                        yi3 yi3Var = bj3Var.a;
                        yi3Var.setPadding(0, yi3Var.g3, 0, D2);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void M3() {
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).w()) {
            finishPreviewFragment();
        } else if (this.T0 == 10) {
            if (this.E2 != null) {
                ArrayList arrayList = this.K2;
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < arrayList.size(); i++) {
                        arrayList2.add(zc7.a(((Long) arrayList.get(i)).longValue(), 0L));
                    }
                    this.E2.r(this, arrayList2, null, false, this.L2, this.M2, this.N2, null);
                }
            }
        } else if (na7.q1(this.currentAccount).t2()) {
            h5.b(this.currentAccount);
        } else {
            presentFragment(new ContactsActivity(ir2.l("destroyAfterSelect", true)));
        }
    }

    public final void M4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.M4(int):void");
    }

    public final void N2() {
        j92 j92Var = this.A1;
        if (j92Var != null) {
            j92Var.setBlurredBottomHeight(this.A1.getInputBubbleHeight() + this.w.d() + gl.L(9.0f) + gl.L(7.0f));
        }
    }

    public final void N3() {
        na7.q1(this.currentAccount).X3.edit().putBoolean("storyhint", false).commit();
    }

    public final void N4(boolean z, boolean z2) {
        int i;
        int i2;
        rh3 rh3Var = this.H3;
        if (rh3Var != null && rh3Var.c()) {
            return;
        }
        if (this.f0[0].s == 0 && w3() && this.f0[0].w == 2) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.L && !z2 && !this.F0.g()) {
            i2 = -gl.L(81.0f);
        } else {
            i2 = 0;
        }
        bj3[] bj3VarArr = this.f0;
        if (z) {
            cu6 cu6Var = bj3VarArr[0].r;
            cu6Var.b = 1;
            cu6Var.k(i, i2, false, false);
            L4();
            return;
        }
        bj3VarArr[0].c.g1(i, i2);
        L4();
    }

    public final void O2() {
        int i;
        bj3 bj3Var;
        boolean z = true;
        float n3 = n3(true);
        qi3 qi3Var = this.A0;
        if (qi3Var != null) {
            if (qi3Var.getAlpha() == n3) {
                z = false;
            }
            float R1 = gl.R1(0.98f, 1.0f, n3);
            this.A0.setAlpha(n3);
            this.A0.setScaleX(R1);
            this.A0.setScaleY(R1);
            qi3 qi3Var2 = this.A0;
            if (n3 > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            qi3Var2.setVisibility(i);
            if (z && (bj3Var = this.f0[0]) != null) {
                bj3Var.a.requestLayout();
            }
        }
        k5();
    }

    public final void O3(hd[] hdVarArr) {
        no2.e(hdVarArr, this, this.currentAccount, this.b3);
    }

    public final void O4(String str, boolean z) {
        g5(true, false, true, false);
        ys9 ys9Var = this.Z;
        if (ys9Var != null) {
            ys9Var.b(true);
        }
        pi3 pi3Var = this.Y;
        if (pi3Var != null) {
            pi3Var.r.setText(str);
            this.Y.r.setSelection(str.length());
        }
    }

    public final void P2() {
        int i;
        int i2;
        float f = this.n.e;
        float R1 = gl.R1(0.2f, 1.0f, f);
        jh3 jh3Var = this.E1;
        int i3 = 8;
        if (jh3Var != null) {
            jh3Var.setScaleX(R1);
            this.E1.setScaleY(R1);
            this.E1.setAlpha(f);
            jh3 jh3Var2 = this.E1;
            if (f > 0.0f) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            jh3Var2.setVisibility(i2);
        }
        j92 j92Var = this.A1;
        if (j92Var != null) {
            j92Var.setAlpha(f);
            j92 j92Var2 = this.A1;
            int i4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i4 > 0) {
                i = 0;
            } else {
                i = 8;
            }
            j92Var2.setVisibility(i);
            this.A1.getFadeView().setAlpha(f);
            View fadeView = this.A1.getFadeView();
            if (i4 > 0) {
                i3 = 0;
            }
            fadeView.setVisibility(i3);
        }
    }

    public final void P3(hd hdVar, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        try {
            hdVar.dismiss();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        if (tLObject != null) {
            this.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            et etVar = new et(this, j, (byte) 14);
            Pattern pattern = ij.a;
            if (getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = getCurrentAccount();
                    Activity parentActivity = getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long e2 = y6c.h(currentAccount).e();
                    TextView textView = new TextView(parentActivity);
                    zkb.X(textView, bkb.i5, null);
                    textView.setTextSize(1, 16.0f);
                    if (k96.a0) {
                        i = 5;
                    } else {
                        i = 3;
                    }
                    textView.setGravity(i | 48);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    alertDialog$Builder.n(frameLayout);
                    pb0 pb0Var = new pb0((wjb) null);
                    pb0Var.s(gl.L(12.0f));
                    be0 be0Var = new be0(parentActivity);
                    be0Var.setRoundRadius(gl.L(20.0f));
                    if (k96.a0) {
                        i2 = 5;
                    } else {
                        i2 = 3;
                    }
                    frameLayout.addView(be0Var, nme.d(40, 40.0f, i2 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(parentActivity);
                    tb4.w(textView2, bkb.D8, null, 1, 20.0f);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    if (k96.a0) {
                        i3 = 5;
                    } else {
                        i3 = 3;
                    }
                    textView2.setGravity(i3 | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setText(k96.M0(2131749053, null));
                    boolean z = k96.a0;
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
                    frameLayout.addView(textView2, nme.d(-1, -2.0f, i8, f, 11.0f, i6, 0.0f));
                    if (k96.a0) {
                        i7 = 5;
                    } else {
                        i7 = 3;
                    }
                    frameLayout.addView(textView, nme.d(-2, -2.0f, i7 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                    if (user != null) {
                        if (l7c.B(user)) {
                            pb0Var.p = 0.8f;
                            pb0Var.f(12);
                            be0Var.m(null, null, pb0Var, user);
                        } else if (user.id == e2) {
                            pb0Var.p = 0.8f;
                            pb0Var.f(1);
                            be0Var.m(null, null, pb0Var, user);
                        } else {
                            pb0Var.p = 1.0f;
                            pb0Var.q(user);
                            be0Var.f(user, pb0Var);
                        }
                    } else {
                        pb0Var.p(chat);
                        be0Var.f(chat, pb0Var);
                    }
                    textView.setText(gl.S2(str));
                    alertDialog$Builder.j(k96.M0(2131749073, null), new l0(etVar, (byte) 10));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    showDialog(alertDialog$Builder.a);
                    return;
                }
                return;
            }
            return;
        }
        ij.c0(this.currentAccount, tL_error, this, tL_messages_checkHistoryImportPeer, new Object[0]);
        getNotificationCenter().k(kk7.u1, Long.valueOf(j), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public final void P4(float f) {
        bj3[] bj3VarArr;
        this.d0 = f;
        for (bj3 bj3Var : this.f0) {
            yi3 yi3Var = bj3Var.a;
            for (int i = 0; i < yi3Var.getChildCount(); i++) {
                View childAt = yi3Var.getChildAt(i);
                if (childAt != null && RecyclerView.R(childAt) >= bj3Var.d.f + 1) {
                    childAt.setAlpha(f);
                }
            }
        }
    }

    public final void Q2() {
        if (this.actionBar == null) {
            return;
        }
        un4.d(this.actionBar.getBackButton(), Math.max(this.w3, (1.0f - this.b.e) * (1.0f - r3()) * (1.0f - this.c.e)));
    }

    public final void Q3(float f, ValueAnimator valueAnimator) {
        this.f0[0].setTranslationY((1.0f - this.w3) * f);
        this.w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i = 0; i < this.actionBar.getChildCount(); i++) {
            if (this.actionBar.getChildAt(i).getVisibility() == 0 && this.actionBar.getChildAt(i) != this.actionBar.getActionMode() && this.actionBar.getChildAt(i) != this.actionBar.getBackButton()) {
                this.actionBar.getChildAt(i).setAlpha(1.0f - this.w3);
            }
        }
        Y2();
        Q2();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void Q4(boolean z, boolean z2) {
        if (this.f0 != null && this.U1 != z) {
            if (z) {
                this.T1 = new ArrayList(m3(this.currentAccount, this.f0[0].s, this.Y2, false));
            } else {
                this.T1 = null;
            }
            this.U1 = z;
            bj3 bj3Var = this.f0[0];
            bj3Var.d.H = z;
            if (!z && z2) {
                boolean d0 = bj3Var.a.d0();
                bj3[] bj3VarArr = this.f0;
                if (d0) {
                    bj3VarArr[0].a.post(new sg3(this, (byte) 5));
                } else {
                    bj3VarArr[0].d.f();
                }
            }
        }
    }

    public final void R2() {
        float f;
        if (this.j0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        un4.d(this.h0, yjb.C(f, 1.0f - this.b.e, 1.0f - r3(), 1.0f - this.c.e));
    }

    public final void R3() {
        if (this.f0 == null) {
            return;
        }
        if (!this.U1 && !this.isPaused) {
            this.Q3 = false;
            getMessagesController().Z4(null);
            J4(false);
            return;
        }
        this.Q3 = true;
    }

    public final void R4(boolean z) {
        bj3 bj3Var;
        if (gba.o() > 1 && e66.e(32768)) {
            bj3[] bj3VarArr = this.f0;
            if (z) {
                if (bj3VarArr != null && (bj3Var = bj3VarArr[0]) != null) {
                    bj3Var.setLayerType(2, null);
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
            if (bj3VarArr != null) {
                int i = 0;
                while (true) {
                    bj3[] bj3VarArr2 = this.f0;
                    if (i >= bj3VarArr2.length) {
                        break;
                    }
                    bj3 bj3Var2 = bj3VarArr2[i];
                    if (bj3Var2 != null) {
                        bj3Var2.setLayerType(0, null);
                        bj3Var2.setClipChildren(true);
                        bj3Var2.setClipToPadding(true);
                        bj3Var2.a.setClipChildren(true);
                    }
                    i++;
                }
            }
            a aVar2 = this.actionBar;
            if (aVar2 != null) {
                aVar2.setLayerType(0, null);
            }
            oh3 oh3Var = this.F0;
            if (oh3Var != null) {
                oh3Var.setLayerType(0, null);
            }
            View view2 = this.fragmentView;
            if (view2 != null) {
                ((ViewGroup) view2).setClipChildren(true);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void S2() {
        float f;
        if (gba.r.isEmpty()) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        un4.d(this.g0, yjb.C(f, 1.0f - this.b.e, 1.0f - r3(), 1.0f - this.c.e));
    }

    public final void S3(int i, cs5 cs5Var) {
        CharSequence charSequence;
        if (this.currentAccount != i) {
            cs5Var.u();
            if (getParentActivity() == null) {
                return;
            }
            wi3 wi3Var = this.E2;
            LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
            ArrayList arrayList = this.F2;
            String str = this.G2;
            CharSequence charSequence2 = this.H2;
            hh3 hh3Var = this.D1;
            if (hh3Var != null) {
                charSequence = hh3Var.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.N0(i);
            cj3 cj3Var = new cj3(this.arguments);
            cj3Var.E2 = wi3Var;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    cj3Var.F2 = null;
                } else {
                    cj3Var.F2 = arrayList;
                    cj3Var.G2 = null;
                    cj3Var.O2 = false;
                    if (cj3Var.D1 != null) {
                        cj3Var.B2(charSequence);
                    } else {
                        cj3Var.Z3 = charSequence;
                    }
                }
            } else if (str != null) {
                cj3Var.U4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    cj3Var.H2 = null;
                } else {
                    cj3Var.H2 = charSequence2;
                    cj3Var.G2 = null;
                    cj3Var.F2 = null;
                    if (cj3Var.D1 != null) {
                        cj3Var.B2(charSequence);
                    } else {
                        cj3Var.Z3 = charSequence;
                    }
                }
            }
            launchActivity.u0(cj3Var, false, true);
        }
    }

    public final void S4(float f) {
        bj3[] bj3VarArr = this.f0;
        int i = 0;
        if (bj3VarArr != null) {
            int paddingTop = bj3VarArr[0].a.getPaddingTop() + ((int) f);
            int i2 = 0;
            while (true) {
                bj3[] bj3VarArr2 = this.f0;
                if (i2 >= bj3VarArr2.length) {
                    break;
                }
                bj3VarArr2[i2].a.setTopGlowOffset(paddingTop);
                i2++;
            }
        }
        if (this.fragmentView != null && f != this.O) {
            this.O = f;
            m21 m21Var = this.q3;
            if (m21Var != null) {
                m21Var.l();
            }
            if (this.G3 != null) {
                float currentActionBarHeight = 1.0f - ((-f) / a.getCurrentActionBarHeight());
                ym ymVar = this.G3;
                float f2 = (int) f;
                float f3 = ymVar.f;
                ymVar.h = f2;
                ymVar.setTranslationY(f3 + f2);
                this.G3.setAlpha(moe.a(currentActionBarHeight, 0.0f, 1.0f));
                ym ymVar2 = this.G3;
                if (currentActionBarHeight <= 0.0f) {
                    i = 4;
                }
                ymVar2.setVisibility(i);
            }
            Y2();
            this.fragmentView.invalidate();
        }
    }

    public final void T2() {
        float f;
        if (this.T0 != 2) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        un4.d(this.k0, yjb.C(f, this.f.e, 1.0f - r3(), 1.0f - this.c.e));
        oh3 oh3Var = this.F0;
        if (oh3Var != null) {
            oh3Var.invalidate();
        }
    }

    public final void T3() {
        na7.q1(this.currentAccount).h0(null);
    }

    public final void T4(float f) {
        this.z1 = f;
        t5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (gba.o() != 0) {
            e66.e(32768);
        }
        k5();
    }

    public final void U2() {
        un4.d(this.m0, yjb.C(this.b.e, 1.0f - r3(), 1.0f - this.c.e, this.d.e));
    }

    public final void U3() {
        if (this.f4.g()) {
            na7.q1(this.currentAccount).n4(0L, "USERPIC_SETUP");
            m5();
        }
    }

    public final void U4(CharSequence charSequence, String str) {
        if (str != null && !str.isEmpty()) {
            this.G2 = str;
            this.H2 = null;
            this.F2 = null;
            if (this.D1 != null) {
                B2(charSequence);
                return;
            } else {
                this.Z3 = charSequence;
                return;
            }
        }
        this.G2 = null;
        this.H2 = null;
    }

    public final void V2() {
        boolean z;
        sb sbVar;
        if (!this.l2 && ((sbVar = this.L0) == null || sbVar.getBackground() == null || this.L0.getAlpha() < 0.01f || this.L0.getVisibility() == 8)) {
            z = true;
        } else {
            z = false;
        }
        s34 s34Var = this.K3;
        if (s34Var != null) {
            ((ah6) s34Var.b).w.a(z, true);
        }
    }

    public final void V3(int i, ArrayList arrayList, boolean z, HashSet hashSet) {
        HashSet hashSet2;
        if (i == 102) {
            getMessagesController().j0 = true;
            if (z) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            G4(arrayList, i, false, false, hashSet2);
            na7 messagesController = getMessagesController();
            messagesController.j0 = false;
            messagesController.getNotificationCenter().k(kk7.r, Boolean.TRUE);
            getMessagesController().F(this.Y2);
            int i2 = this.Y2;
            if (i2 != 0 && m3(this.currentAccount, this.f0[0].s, i2, false).size() == 0) {
                this.f0[0].a.setEmptyView(null);
                this.f0[0].x.setVisibility(4);
                finishFragment();
                return;
            }
            return;
        }
        G4(arrayList, i, false, false, null);
    }

    public final void V4(float f) {
        if (gba.o() <= 0) {
            boolean z = w01.a;
        } else if (this.b4 != f) {
            boolean z2 = true;
            if (gba.o() > 1 && e66.e(32768)) {
                z2 = false;
            }
            this.c4 = z2;
            this.b4 = f;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.c4) {
                float f2 = (1.0f - this.b4) * (-gl.L(40.0f));
                oh3 oh3Var = this.F0;
                if (oh3Var != null) {
                    oh3Var.setTranslationX(f2);
                }
                pi3 pi3Var = this.Y;
                if (pi3Var != null) {
                    pi3Var.setTranslationX(f2);
                }
                rh3 rh3Var = this.H3;
                if (rh3Var != null && rh3Var.getFragmentView() != null && !this.E) {
                    this.H3.getFragmentView().setTranslationX(f2);
                    return;
                }
                return;
            }
            float f3 = 1.0f - this.b4;
            float f4 = (-gl.L(4.0f)) * f3;
            float f5 = 1.0f - (f3 * 0.05f);
            oh3 oh3Var2 = this.F0;
            if (oh3Var2 != null) {
                oh3Var2.setScaleX(f5);
                this.F0.setScaleY(f5);
                this.F0.setTranslationX(f4);
                this.F0.setPivotX(0.0f);
                this.F0.setPivotY(0.0f);
            }
            pi3 pi3Var2 = this.Y;
            if (pi3Var2 != null) {
                pi3Var2.setTranslationX(f4);
                this.Y.setScaleX(f5);
                this.Y.setScaleY(f5);
            }
            rh3 rh3Var2 = this.H3;
            if (rh3Var2 != null && rh3Var2.getFragmentView() != null) {
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

    @Override
    public final boolean W(MotionEvent motionEvent, boolean z) {
        rh3 rh3Var;
        sb sbVar;
        qi3 qi3Var;
        boolean z2;
        boolean z3;
        if (!this.s3 && (((rh3Var = this.H3) == null || !rh3Var.c()) && (((sbVar = this.L0) == null || sbVar.getVisibility() != 0) && ((qi3Var = this.A0) == null || !qi3Var.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                qi3 qi3Var2 = this.A0;
                if (qi3Var2 != null && qi3Var2.getTabsCount() >= 2 && this.A0.getCurrentTabId() != this.A0.getFirstTabId()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                qi3 qi3Var3 = this.A0;
                if (qi3Var3 != null && qi3Var3.getTabsCount() >= 2 && this.A0.getCurrentTabId() != this.A0.getLastTabId()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                gba.m(this.currentAccount);
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
        Q2();
        un4.d(this.l0, (1.0f - this.b.e) * (1.0f - r3()) * (1.0f - this.c.e));
        R2();
        U2();
        S2();
        T2();
    }

    public final void W3(final int i, final long j, TLRPC.Chat chat, final boolean z, final boolean z2) {
        final TLRPC.Chat chat2;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        y3(false);
        if (i == 103 && hc2.T(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || hc2.t0(chat2)) {
                getMessagesController().T(2, j, z2);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i == 102 && (i5 = this.Y2) != 0 && m3(this.currentAccount, this.f0[0].s, i5, false).size() == 1) {
            this.f0[0].x.setVisibility(4);
        }
        int i6 = -1;
        if (i == 102) {
            Q4(true, true);
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
            G2();
            i2 = i4;
        } else {
            i2 = -1;
        }
        UndoView u3 = u3();
        if (u3 != null) {
            if (i == 103) {
                i3 = 0;
            } else if (z2) {
                i3 = 1;
            } else {
                i3 = 95;
            }
            u3.j(i3, j, new Runnable() {
                @Override
                public final void run() {
                    cj3.this.F4(i, j, chat2, z, z2);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(m3(this.currentAccount, this.f0[0].s, this.Y2, false));
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
            Q4(false, true);
        }
    }

    public final void W4(bj3 bj3Var, float f) {
        if (this.U != f) {
            this.U = f;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            int i2 = 0;
            if (i == 0) {
                this.V = false;
            }
            this.F0.setOverscroll(f);
            bj3Var.a.setViewsOffset(f);
            yi3 yi3Var = bj3Var.a;
            if (i != 0) {
                i2 = 2;
            }
            yi3Var.setOverScrollMode(i2);
            this.fragmentView.invalidate();
            if (f > gl.L(90.0f) && !this.V) {
                oh3 oh3Var = this.F0;
                ValueAnimator valueAnimator = oh3Var.I0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    oh3Var.i(oh3Var.q0, true);
                    this.V = true;
                    getOrCreateStoryViewer().s(new wf3(this, (byte) 12));
                }
            }
        }
    }

    public final void X2() {
        int i;
        if (r3() > 0.5f) {
            i = 2131745514;
        } else {
            i = 2131745621;
        }
        String M0 = k96.M0(i, null);
        this.Y.r.setContentDescription(M0);
        this.Y.r.setHint(M0);
    }

    public final void X3() {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", y6c.h(this.currentAccount).e());
        presentFragment(new mu1(bundle));
    }

    public final void X4() {
        getContactsController().B();
        yr yrVar = new yr(getParentActivity(), this.currentAccount, getResourceProvider(), new wc3(this, r1, (byte) 3), new mk2(r1, (byte) 24));
        fx0 i = ug8.i(getParentActivity(), false, 1, getResourceProvider());
        i.O = yrVar;
        i.U0 = (byte) 49;
        i.show();
        fx0[] fx0VarArr = {i};
        i.M(bkb.g5);
    }

    public final void Y2() {
        float f;
        int i;
        if (this.Y == null) {
            return;
        }
        float a = 1.0f - moe.a(((-this.O) - p3()) / gl.L(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.w3, this.h.e);
        float f2 = this.b.e;
        if (this.T0 != 2) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float max2 = f * (1.0f - this.c.e) * (1.0f - max) * Math.max(f2, (1.0f - r3()) * a);
        this.Y.setAlpha(max2);
        pi3 pi3Var = this.Y;
        boolean z = false;
        if (max2 > 0.0f) {
            i = 0;
        } else {
            i = 8;
        }
        pi3Var.setVisibility(i);
        if (max2 <= 0.01f) {
            z = true;
        }
        this.f.a(z, true);
    }

    public final void Y3(TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, this.currentAccount, tL_attachMenuBot, null, true);
        hq6 d0 = hq6.d0(this.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = d0.b;
        if (tL_attachMenuBots != null) {
            d0.getMessagesStorage().a.c(new o57(d0, tL_attachMenuBots, d0.a, d0.e, (byte) 7));
        }
    }

    public final boolean Y4(defpackage.ue3 r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.Y4(ue3):boolean");
    }

    public final void Z2() {
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
            float R1 = gl.R1(0.98f, 1.0f, f2);
            this.a0.setScaleX(R1);
            this.a0.setScaleY(R1);
            this.a0.setAlpha(f2);
            ls9 ls9Var = this.a0;
            if (f2 > 0.0f) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            ls9Var.setVisibility(i2);
        }
        vec vecVar = this.b0;
        fm0 fm0Var = this.s;
        if (vecVar != null) {
            float f3 = 1.0f - fm0Var.e;
            vecVar.setAlpha(f3);
            vec vecVar2 = this.b0;
            if (f3 > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            vecVar2.setVisibility(i);
        }
        tf4 tf4Var = this.c0;
        if (tf4Var != null) {
            float f4 = fm0Var.e;
            tf4Var.setAlpha(f4);
            tf4 tf4Var2 = this.c0;
            if (f4 > 0.0f) {
                i3 = 0;
            }
            tf4Var2.setVisibility(i3);
        }
    }

    public final void Z3(TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = na7.q1(this.currentAccount).m1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new en0(this, tL_attachMenuBot, launchActivity, (byte) 22), 66);
    }

    public final void Z4(boolean z) {
        float f;
        this.c.a(z, true);
        if (this.n0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.T3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.T3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.T3 = animatorSet2;
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
        this.T3.playTogether(arrayList);
        this.T3.addListener(new xh3(this, z, (byte) 1));
        this.T3.start();
    }

    public final void a3(boolean z) {
        int i;
        int i2;
        if (this.D0 != null && this.actionBar != null) {
            int i3 = gl.n;
            int measuredHeight = this.actionBar.getMeasuredHeight() + gl.L(this.a);
            if (this.b0 != null) {
                i = gl.L(50.0f);
            } else {
                i = 0;
            }
            int i4 = measuredHeight + i;
            fj3 fj3Var = this.L1;
            if (fj3Var != null) {
                i2 = (int) fj3Var.c(gl.L(7.0f));
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            hi3 hi3Var = this.D0;
            SparseArray sparseArray = hi3Var.h;
            hi3Var.X0 = i5;
            hi3Var.Y0 = i3;
            ns9 ns9Var = hi3Var.b0;
            if (z) {
                ns9Var.q1(0, i5, 0, i3);
            } else {
                ns9Var.setPadding(0, i5, 0, i3);
            }
            hi3Var.P0.j(hi3Var.X0, hi3Var.Y0, z);
            gt9 gt9Var = hi3Var.c0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gt9Var.getLayoutParams();
            int i6 = marginLayoutParams.topMargin;
            int i7 = hi3Var.X0;
            if (i6 != i7 || marginLayoutParams.bottomMargin != hi3Var.Y0) {
                marginLayoutParams.topMargin = i7;
                marginLayoutParams.bottomMargin = hi3Var.Y0;
                gt9Var.requestLayout();
            }
            tt9.Q(hi3Var.i0, hi3Var.l0, hi3Var.X0, hi3Var.Y0, z);
            tt9.Q(hi3Var.n0, hi3Var.q0, hi3Var.X0, hi3Var.Y0, z);
            tt9.Q(hi3Var.u0, hi3Var.x0, hi3Var.X0, hi3Var.Y0, z);
            yf8 yf8Var = hi3Var.s0;
            int i8 = hi3Var.X0;
            int i9 = hi3Var.Y0;
            yf8Var.setClipToPadding(false);
            q5c q5cVar = yf8Var.c;
            yf8Var.K = z;
            yf8Var.setPadding(0, i8, 0, i9);
            if (z) {
                q5cVar.q1(0, i8, 0, i9);
            } else {
                q5cVar.setPadding(0, i8, 0, i9);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) q5cVar.getLayoutParams();
            marginLayoutParams2.topMargin = -i8;
            marginLayoutParams2.bottomMargin = -i9;
            yf8Var.K = false;
            hs9 hs9Var = hi3Var.J0;
            if (hs9Var != null) {
                hs9Var.b(hi3Var.X0, hi3Var.Y0, z);
            }
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) sparseArray.valueAt(i10);
                if (view instanceof af4) {
                    ((af4) view).j(hi3Var.X0, hi3Var.Y0, z);
                }
            }
            for (int i11 = 0; i11 < hi3Var.getChildCount(); i11++) {
                if (hi3Var.getChildAt(i11) instanceof af4) {
                    ((af4) hi3Var.getChildAt(i11)).j(hi3Var.X0, hi3Var.Y0, z);
                }
            }
        }
    }

    public final void a4(TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.G0(launchActivity, this.currentAccount, tL_attachMenuBot, null, true);
        } else {
            psc.a(getParentActivity(), new ht(this, tL_attachMenuBot, launchActivity, (byte) 13), null);
        }
    }

    public final void a5() {
        if (!this.B0 && getMessagesController().L0 && getMessagesController().n3 && this.A0 != null && getMessagesController().R0().isEmpty() && !this.isPaused && getUserConfig().Q && !this.inPreviewMode) {
            SharedPreferences c1 = na7.c1();
            if (!c1.getBoolean("filterhint", false)) {
                c1.edit().putBoolean("filterhint", true).apply();
                gl.d3(new sg3(this, (byte) 7), 1000L);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.Yk));
        hashSet.add(Integer.valueOf(bkb.Xk));
        hashSet.add(Integer.valueOf(bkb.cl));
        hashSet.add(Integer.valueOf(bkb.bl));
        hashSet.add(Integer.valueOf(bkb.al));
        hashSet.add(Integer.valueOf(bkb.Zk));
        hashSet.add(Integer.valueOf(bkb.Si));
        hashSet.add(Integer.valueOf(bkb.f8));
        hashSet.add(Integer.valueOf(bkb.Me));
        hashSet.add(Integer.valueOf(bkb.Ij));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.Le));
        hashSet.add(Integer.valueOf(bkb.Ke));
        hashSet.add(Integer.valueOf(bkb.Je));
        hashSet.add(Integer.valueOf(bkb.Ie));
        hashSet.add(Integer.valueOf(bkb.xj));
        hashSet.add(Integer.valueOf(bkb.vj));
        hashSet.add(Integer.valueOf(bkb.wj));
        hashSet.add(Integer.valueOf(bkb.S8));
        hashSet.add(Integer.valueOf(bkb.e9));
        hashSet.add(Integer.valueOf(bkb.V8));
        hashSet.add(Integer.valueOf(bkb.U8));
        hashSet.add(Integer.valueOf(bkb.T8));
        hashSet.add(Integer.valueOf(bkb.R9));
        hashSet.add(Integer.valueOf(bkb.Q9));
        hashSet.add(Integer.valueOf(bkb.f9));
        hashSet.add(Integer.valueOf(bkb.l9));
        hashSet.add(Integer.valueOf(bkb.Yl));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.d9));
        hashSet.add(Integer.valueOf(bkb.c9));
        hashSet.add(Integer.valueOf(bkb.b9));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.L7));
        hashSet.add(Integer.valueOf(bkb.M7));
        hashSet.add(Integer.valueOf(bkb.g9));
        hashSet.add(Integer.valueOf(bkb.m9));
        hashSet.add(Integer.valueOf(bkb.k9));
        hashSet.add(Integer.valueOf(bkb.X8));
        hashSet.add(Integer.valueOf(bkb.n9));
        hashSet.add(Integer.valueOf(bkb.i9));
        hashSet.add(Integer.valueOf(bkb.j9));
        hashSet.add(Integer.valueOf(bkb.K7));
        hashSet.add(Integer.valueOf(bkb.a8));
        hashSet.add(Integer.valueOf(bkb.Z7));
        hashSet.add(Integer.valueOf(bkb.Y7));
        hashSet.add(Integer.valueOf(bkb.X7));
        hashSet.add(Integer.valueOf(bkb.W7));
        hashSet.add(Integer.valueOf(bkb.V7));
        hashSet.add(Integer.valueOf(bkb.U7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.J7));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.o6));
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.j7));
        hashSet.add(Integer.valueOf(bkb.pk));
        hashSet.add(Integer.valueOf(bkb.Y5));
        hashSet.add(Integer.valueOf(bkb.A9));
        hashSet.add(Integer.valueOf(bkb.y9));
        hashSet.add(Integer.valueOf(bkb.z9));
        hashSet.add(Integer.valueOf(bkb.x9));
        hashSet.add(Integer.valueOf(bkb.w9));
        hashSet.add(Integer.valueOf(bkb.v9));
        hashSet.add(Integer.valueOf(bkb.u9));
        hashSet.add(Integer.valueOf(bkb.t9));
        hashSet.add(Integer.valueOf(bkb.s9));
        hashSet.add(Integer.valueOf(bkb.r9));
        hashSet.add(Integer.valueOf(bkb.q9));
        hashSet.add(Integer.valueOf(bkb.p9));
        hashSet.add(Integer.valueOf(bkb.o9));
        hashSet.add(Integer.valueOf(bkb.h9));
        hashSet.add(Integer.valueOf(bkb.Y8));
        hashSet.add(Integer.valueOf(bkb.W8));
        hashSet.add(Integer.valueOf(bkb.a9));
        hashSet.add(Integer.valueOf(bkb.Z8));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.T9));
        hashSet.add(Integer.valueOf(bkb.S9));
        hashSet.add(Integer.valueOf(bkb.xi));
        hashSet.add(Integer.valueOf(bkb.H5));
        hashSet.add(Integer.valueOf(bkb.D8));
        hashSet.add(Integer.valueOf(bkb.F8));
    }

    public final void b3() {
        if (this.L1 != null) {
            float R1 = gl.R1(0.98f, 1.0f, 1.0f);
            this.L1.setAlpha(1.0f);
            this.L1.setScaleX(R1);
            this.L1.setScaleY(R1);
            this.L1.setVisibility(0);
        }
    }

    public final void b4(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        ow0.l(this.currentAccount, tL_attachMenuBot.bot_id, null);
    }

    public final void b5() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.b5():void");
    }

    public boolean c3() {
        if (this.T0 == 10) {
            return true;
        }
        return false;
    }

    public final void c4(float f, ValueAnimator valueAnimator) {
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
        Y2();
        Q2();
    }

    public final void c5() {
        if (this.W3 == null) {
            for (String str : getMessagesController().u3) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = k96.M0(2131749127, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    hdVar.U = gl.S2(k96.M0(2131749128, null));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    alertDialog$Builder.j(k96.M0(2131749358, null), new ag3(this, (byte) 6));
                    showDialog(hdVar, new eg3(this, (byte) 0));
                    this.W3 = str;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        qi3 qi3Var;
        if (!this.H3.c()) {
            if (this.T0 == 3 && (qi3Var = this.A0) != null && qi3Var.getVisibility() == 0 && this.A0.L > 0) {
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
            hi3 hi3Var = this.D0;
            if (hi3Var != null) {
                hi3Var.S();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final a createActionBar(Context context) {
        x10 x10Var = new x10(this, context, this.resourceProvider, (byte) 2);
        x10Var.setAllowOverlayTitle(true);
        x10Var.H0 = true;
        if (x10Var.G0 == null) {
            a6 a6Var = new a6(x10Var.getContext(), (byte) 0);
            x10Var.G0 = a6Var;
            x10Var.addView(a6Var);
        }
        zkb.l(x10Var, 3, bkb.s8, getResourceProvider());
        zkb.a(x10Var, bkb.y8, getResourceProvider(), true);
        zkb.l(x10Var, 1, bkb.u8, getResourceProvider());
        zkb.b(x10Var, bkb.x8, getResourceProvider(), true);
        if (x10Var.y1 == null) {
            b6 b6Var = new b6(x10Var, x10Var.getContext(), x10Var.K0, x10Var.P0);
            x10Var.y1 = b6Var;
            b6Var.setClipChildren(false);
            x10Var.addView(x10Var.y1);
        }
        x10Var.getAdditionalSubTitleOverlayContainer().setTranslationX(gl.L(4.0f));
        x10Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-gl.L(3.0f));
        if (!this.inPreviewMode && (!gl.O1() || this.Y2 == 0 || D3())) {
            return x10Var;
        }
        x10Var.setOccupyStatusBar(false);
        return x10Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r48) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.createView(android.content.Context):android.view.View");
    }

    public final void d3() {
        if (gl.O1()) {
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.n(true);
            }
            TLObject tLObject = this.Z1;
            if (tLObject != null) {
                hi3 hi3Var = this.D0;
                if (hi3Var != null) {
                    hi3Var.e0.Q(this.Y1, tLObject);
                }
                this.Z1 = null;
                return;
            }
            return;
        }
        this.X1 = true;
    }

    public final void d4() {
        presentFragment(new PrivacySettingsActivity());
        gl.f3(this.parentLayout, "newChatsRow");
    }

    public final void d5(long r13, android.view.View r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.d5(long, android.view.View):void");
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (!(dialog instanceof ow0) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e3() {
        a aVar = this.actionBar;
        if (aVar != null && aVar.o0) {
            aVar.n(true);
            this.s3 = false;
            o5(true, true);
        }
    }

    public final void e4() {
        h5.c(this.currentAccount, getResourceProvider(), getParentActivity());
    }

    public final void e5(long j, View view) {
        String str;
        m21 K;
        int i = -this.N3;
        this.N3 = i;
        gl.A3(i, view, null);
        pw0.APP_ERROR.a();
        if (j >= 0) {
            str = l7c.r(na7.q1(this.currentAccount).V1(Long.valueOf(j)));
        } else {
            str = "";
        }
        if (getMessagesController().F3()) {
            K = u21.b0(this).Q(2131624211, 36, gl.S2(k96.a0(null, null, 2131743521, str)));
        } else {
            K = u21.b0(this).K(2131624211, gl.S2(k96.a0(null, null, 2131743521, str)), k96.M0(2131743520, null), new wf3(this, (byte) 15));
        }
        K.j();
    }

    public final void f3(String str) {
        if (this.actionBar.d(str)) {
            return;
        }
        r6 q = this.actionBar.q(str);
        boolean z = this.X;
        ArrayList arrayList = this.k1;
        if (z) {
            ImageView imageView = new ImageView(getParentActivity());
            this.i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.i1.setImageDrawable(new ed0(true));
            zkb.s(this.i1, bkb.x8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.i1;
            int i = bkb.y8;
            zkb.R(imageView2, bkb.f0(getThemedColor(i), 1, -1), null, zkb.M(i), getResourceProvider());
            this.i1.setOnClickListener(new zf3(this, (byte) 6));
            q.addView(this.i1, nme.r(54, 54, 16));
            arrayList.add(this.i1);
        }
        NumberTextView numberTextView = new NumberTextView(q.getContext());
        this.j1 = numberTextView;
        int i2 = 18;
        numberTextView.setTextSize(18);
        this.j1.setTypeface(gl.o());
        this.j1.setTextColor(getThemedColor(bkb.x8));
        NumberTextView numberTextView2 = this.j1;
        if (!this.X) {
            i2 = 72;
        }
        q.addView(numberTextView2, nme.m(1.0f, 0, -1, i2, 0, 0));
        this.j1.setOnTouchListener(new jz1((byte) 5));
        this.m1 = q.g(100, 2131232298, gl.L(48.0f));
        this.n1 = q.g(104, 2131232261, gl.L(48.0f));
        this.o1 = q.g(107, 2131232056, gl.L(48.0f));
        this.l1 = q.h(102, 2131232113, gl.L(48.0f), k96.M0(2131751586, null));
        r7 h = q.h(0, 2131231247, gl.L(48.0f), k96.M0(2131754838, null));
        q.addView(new View(getParentActivity()), nme.o(5, -1));
        this.s1 = h.e(105, 2131232056, k96.M0(2131754169, null));
        this.p1 = h.e(108, 2131232298, k96.M0(2131751441, null));
        this.q1 = h.e(109, 2131232051, k96.M0(2131750800, null));
        this.r1 = h.e(110, 2131232334, k96.M0(2131750698, null));
        this.u1 = h.e(101, 2131232220, k96.M0(2131748489, null));
        this.t1 = h.e(103, 2131232097, k96.M0(2131752077, null));
        this.v1 = h.e(106, 2131232072, k96.M0(2131753689, null));
        this.n1.setOnLongClickListener(new hg3(this, (byte) 1));
        arrayList.add(this.m1);
        arrayList.add(this.o1);
        arrayList.add(this.n1);
        arrayList.add(this.l1);
        arrayList.add(h);
        l5(false);
    }

    public final void f4() {
        PasskeysActivity.e0(this.currentAccount, this.resourceProvider, getParentActivity(), true);
    }

    public final void f5(boolean z) {
        if (this.f0 != null && this.O3 != z) {
            this.O3 = z;
            int i = 0;
            while (true) {
                bj3[] bj3VarArr = this.f0;
                if (i < bj3VarArr.length) {
                    if (z) {
                        bj3VarArr[i].a.setScrollbarFadingEnabled(false);
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

    @Override
    public final void finishFragment() {
        super.finishFragment();
        cs5 cs5Var = this.M0;
        if (cs5Var != null) {
            cs5Var.u();
        }
    }

    public final void g3() {
        int i;
        hi3 hi3Var = this.D0;
        if ((hi3Var != null && hi3Var.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.p2 != null) {
            i = 2;
        } else if (!this.n2) {
            i = 1;
        } else {
            i = 0;
        }
        hi3 hi3Var2 = new hi3(this, getParentActivity(), this, i, this.T0, this.Y2, this.a3, new gi3(this));
        this.D0 = hi3Var2;
        this.glassEngine.c(hi3Var2);
        ((vi3) this.fragmentView).addView(this.D0, this.C0);
        hi3 hi3Var3 = this.D0;
        hi3Var3.e0.V = new ji3(this);
        hi3Var3.l0.setOnItemClickListener(new ag3(this, (byte) 1));
        this.D0.q0.setOnItemClickListener(new ag3(this, (byte) 2));
        this.D0.x0.setOnItemClickListener(new dg3(this, (byte) 0));
        this.D0.q0.setOnItemLongClickListener(new ag3(this, (byte) 3));
        this.D0.b0.setOnItemClickListener(new ag3(this, (byte) 4));
        this.D0.b0.setOnItemLongClickListener(new bh3(this));
        this.D0.setFilteredSearchViewDelegate(new ag3(this, (byte) 5));
        this.D0.setAlpha(0.0f);
        this.D0.setScaleX(1.05f);
        this.D0.setScaleY(1.05f);
        this.D0.setVisibility(8);
        this.D0.setBlurredBackgroundDrawableFactory(this.t4);
    }

    public final void g4() {
        na7.q1(this.currentAccount).n4(0L, "SETUP_PASSKEY");
        m5();
    }

    public final void g5(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.g5(boolean, boolean, boolean, boolean):void");
    }

    @Override
    public final pi5 getBackButtonState() {
        if (!D3() && !this.H3.f) {
            return pi5.b;
        }
        return pi5.a;
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z, boolean z2, float f) {
        int i;
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b4, 1.0f);
            this.e4 = ofFloat;
            return ofFloat;
        }
        if (getLayoutContainer() != null && getLayoutContainer().getMeasuredWidth() > 0) {
            i = (int) Utilities.i((200.0f / getLayoutContainer().getMeasuredWidth()) * f, 200.0f, 80.0f);
        } else {
            i = 150;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.b4, 1.0f);
        this.e4 = ofFloat2;
        ofFloat2.addUpdateListener(new cg3(this, (byte) 1));
        this.e4.setInterpolator(s33.g);
        this.e4.setDuration(i);
        this.e4.start();
        return this.e4;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.getThemeDescriptions():java.util.ArrayList");
    }

    public final void h3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.z0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i = 0; i < 2; i++) {
                undoViewArr[i] = new bi3(this, parentActivity);
                FrameLayout.LayoutParams d = nme.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.k4 + this.m4 + d.bottomMargin;
                UndoView undoView = undoViewArr[i];
                int i2 = this.y0 + 1;
                this.y0 = i2;
                ((vi3) this.fragmentView).addView(undoView, i2, d);
            }
        }
    }

    public final void h4() {
        na7.q1(this.currentAccount).n4(0L, "PREMIUM_GRACE");
        m5();
    }

    public final void h5() {
        int i;
        int i2;
        Long l;
        if (this.N0 == null && !gba.w) {
            if (!this.L || this.F0.g()) {
                kx9[] kx9VarArr = new kx9[1];
                TLRPC.User f = y6c.h(y6c.t0).f();
                jia titleTextView = this.actionBar.getTitleTextView();
                if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                    this.F3.f();
                    Drawable drawable = this.F3.f[0];
                    Rect rect = gl.Q;
                    rect.set(titleTextView.getRightDrawable().getBounds());
                    rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
                    int L = (-(this.actionBar.getHeight() - rect.centerY())) - gl.L(16.0f);
                    i = gl.L(4.0f) + (rect.centerX() - gl.L(16.0f));
                    ym ymVar = this.G3;
                    if (ymVar != null) {
                        ymVar.b(rect.centerX(), rect.centerY());
                    }
                    i2 = L;
                } else {
                    i = 0;
                    i2 = 0;
                }
                sh3 sh3Var = new sh3(this, this, getParentActivity(), Integer.valueOf(i), getResourceProvider(), kx9VarArr);
                if (f != null && cf3.g(f.emoji_status) > 0) {
                    sh3Var.setExpireDateHint(cf3.g(f.emoji_status));
                }
                Long l2 = this.D3;
                if (l2 != null) {
                    sh3Var.setSelected(l2);
                } else {
                    Drawable drawable2 = this.F3.f[0];
                    if (drawable2 instanceof vl) {
                        l = Long.valueOf(((vl) drawable2).h());
                    } else {
                        l = null;
                    }
                    sh3Var.setSelected(l);
                }
                sh3Var.setSaveState(1);
                sh3Var.y(this.F3, titleTextView);
                th3 th3Var = new th3(this, sh3Var);
                this.N0 = th3Var;
                kx9VarArr[0] = th3Var;
                th3Var.showAsDropDown(this.actionBar, gl.L(16.0f), i2, 48);
                kx9VarArr[0].a();
            }
        }
    }

    public final void i3(final long j, final long j2, boolean z, final qvb qvbVar) {
        TLRPC.Chat chat;
        TLRPC.User user;
        char c;
        String M0;
        String b0;
        String M02;
        TLRPC.TL_forumTopic f;
        if (I2(j)) {
            int i = this.T0;
            if (i != 11 && i != 12 && i != 13) {
                if (z && ((this.h2 != null && this.i2 != null) || this.j2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (cf3.B(j)) {
                            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(getMessagesController().Y0(Integer.valueOf((int) (4294967295L & j))).user_id));
                            if (V1 != null) {
                                M0 = k96.M0(2131745404, null);
                                b0 = k96.b0(this.h2, l7c.r(V1));
                                M02 = k96.M0(2131745448, null);
                            } else {
                                return;
                            }
                        } else if (cf3.D(j)) {
                            if (j == getUserConfig().e()) {
                                M0 = k96.M0(2131745404, null);
                                b0 = k96.b0(this.i2, k96.M0(2131745709, null));
                                M02 = k96.M0(2131745448, null);
                            } else {
                                TLRPC.User V12 = getMessagesController().V1(Long.valueOf(j));
                                if (V12 != null && this.h2 != null) {
                                    M0 = k96.M0(2131745404, null);
                                    b0 = k96.b0(this.h2, l7c.r(V12));
                                    M02 = k96.M0(2131745448, null);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-j));
                            if (K0 != null) {
                                String str = K0.title;
                                if (j2 != 0) {
                                    c = 0;
                                    if (getMessagesController().g4.f(K0.id, j2) != null) {
                                        str = ((Object) str) + " " + f.title;
                                    }
                                } else {
                                    c = 0;
                                }
                                if (this.j2 != null) {
                                    M0 = k96.M0(2131754363, null);
                                    String str2 = this.j2;
                                    Object[] objArr = new Object[1];
                                    objArr[c] = str;
                                    b0 = k96.b0(str2, objArr);
                                    M02 = k96.M0(2131754483, null);
                                } else {
                                    M0 = k96.M0(2131745404, null);
                                    String str3 = this.i2;
                                    Object[] objArr2 = new Object[1];
                                    objArr2[c] = str;
                                    b0 = k96.b0(str3, objArr2);
                                    M02 = k96.M0(2131745448, null);
                                }
                            } else {
                                return;
                            }
                        }
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = gl.S2(b0);
                        alertDialog$Builder.j(M02, new ed() {
                            @Override
                            public final void u(hd hdVar2, int i2) {
                                cj3.this.i3(j, j2, false, qvbVar);
                            }
                        });
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        if (showDialog(hdVar) == null) {
                            hdVar.show();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == 15) {
                    Runnable de2Var = new de2(this, j, new n30(this, j, j2, qvbVar, (byte) 2), (byte) 21);
                    if (j < 0) {
                        i5(getMessagesController().K0(Long.valueOf(-j)), de2Var, null);
                        return;
                    }
                    TLRPC.User V13 = getMessagesController().V1(Long.valueOf(j));
                    TLRPC.User V14 = getMessagesController().V1(Long.valueOf(this.I));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String a0 = k96.a0(null, null, 2131754071, l7c.k(V13, true), l7c.k(V14, true));
                    hd hdVar2 = alertDialog$Builder2.a;
                    hdVar2.S = a0;
                    hdVar2.U = TextUtils.concat(gl.S2(k96.a0(null, null, 2131754072, l7c.k(V13, true), l7c.k(V14, true))));
                    alertDialog$Builder2.j(k96.a0("Send", null, 2131745448, new Object[0]), new vu2(de2Var, (byte) 22));
                    alertDialog$Builder2.g(k96.a0("Cancel", null, 2131752577, new Object[0]), new ho9((byte) 13));
                    showDialog(hdVar2);
                    return;
                } else if (this.E2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(zc7.a(j, j2));
                    if (this.E2.r(this, arrayList, null, false, this.L2, this.M2, this.N2, qvbVar) && this.k2) {
                        this.E2 = null;
                        return;
                    }
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            if (cf3.D(j)) {
                TLRPC.User V15 = getMessagesController().V1(Long.valueOf(j));
                if (!V15.mutual_contact) {
                    UndoView u3 = u3();
                    if (u3 != null) {
                        u3.j(45, j, null);
                        return;
                    }
                    return;
                }
                user = V15;
                chat = null;
            } else {
                TLRPC.Chat K02 = getMessagesController().K0(Long.valueOf(-j));
                if (hc2.N(K02) && hc2.w(1, K02)) {
                    chat = K02;
                    user = null;
                } else {
                    UndoView u32 = u3();
                    if (u32 != null) {
                        u32.j(46, j, null);
                        return;
                    }
                    return;
                }
            }
            hd hdVar3 = new hd(3, null, getParentActivity());
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().h1(j);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new wg3(this, hdVar3, user, chat, j, tL_messages_checkHistoryImportPeer));
            try {
                hdVar3.q(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void i4(TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        na7.q1(this.currentAccount).n4(0L, tL_pendingSuggestion.suggestion);
        m5();
    }

    public final void i5(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.i5(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    @Override
    public final boolean isLightStatusBar() {
        rh3 rh3Var;
        if (!this.l2 && (rh3Var = this.H3) != null && rh3Var.getFragment() != null) {
            return this.H3.getFragment().isLightStatusBar();
        }
        if (bm2.h(getThemedColor(bkb.c6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final lx4 j() {
        return this.p4;
    }

    public final void j3(Canvas canvas, int i) {
        ui5 ui5Var;
        if (this.parentLayout != null && this.actionBar != null) {
            float max = Math.max(this.e.e, r3());
            float f = 1.0f;
            float f2 = 1.0f - this.z1;
            float f3 = max * f2 * f2;
            int i2 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
            if (i2 != 0) {
                if (-1 >= i) {
                    f = 0.0f;
                    i = -1;
                }
                if (f > 0.0f && i2 > 0 && i > 0 && (ui5Var = this.parentLayout) != null) {
                    ((ActionBarLayout) ui5Var).n(canvas, (int) (f * 255.0f * f3), i);
                }
            }
        }
    }

    public final void j4() {
        na7.q1(this.currentAccount).n4(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        m5();
    }

    public final void j5(boolean z) {
        bj3[] bj3VarArr;
        char c;
        char c2;
        int i = 0;
        int i2 = 0;
        while (true) {
            bj3VarArr = this.f0;
            if (i2 >= bj3VarArr.length) {
                break;
            }
            bj3VarArr[i2].a.D0();
            i2++;
        }
        if (z && bj3VarArr.length > 1) {
            c = 1;
        } else {
            c = 0;
        }
        int i3 = bj3VarArr[c].h;
        if (i3 >= 0 && i3 < getMessagesController().R0().size()) {
            t97 t97Var = (t97) getMessagesController().R0().get(this.f0[c].h);
            boolean d = t97Var.d();
            bj3[] bj3VarArr2 = this.f0;
            if (d) {
                bj3 bj3Var = bj3VarArr2[c];
                bj3Var.s = this.T0;
                yi3 yi3Var = bj3Var.a;
                int i4 = yi3.C3;
                yi3Var.D1();
            } else {
                if (bj3VarArr2[c ^ 1].s == 7) {
                    bj3VarArr2[c].s = 8;
                } else {
                    bj3VarArr2[c].s = 7;
                }
                bj3VarArr2[c].a.setScrollEnabled(true);
                na7 messagesController = getMessagesController();
                if (this.f0[c].s == 8) {
                    c2 = 1;
                } else {
                    c2 = 0;
                }
                t97[] t97VarArr = messagesController.N;
                t97 t97Var2 = t97VarArr[c2];
                if (t97Var2 != t97Var) {
                    t97VarArr[c2] = t97Var;
                    int i5 = c2 ^ 1;
                    if (t97VarArr[i5] == t97Var) {
                        t97VarArr[i5] = null;
                    }
                    if (t97VarArr[c2] == null) {
                        if (t97Var2 != null) {
                            t97Var2.k.clear();
                            t97Var2.l.clear();
                        }
                    } else {
                        messagesController.Z4(null);
                    }
                }
            }
            bj3[] bj3VarArr3 = this.f0;
            if (bj3VarArr3.length > 1) {
                bj3VarArr3[1].F = t97Var.p;
            }
            bj3 bj3Var2 = bj3VarArr3[c];
            eh3 eh3Var = bj3Var2.d;
            eh3Var.h = bj3Var2.s;
            eh3Var.f();
            bj3 bj3Var3 = this.f0[c];
            ah3 ah3Var = bj3Var3.c;
            if (bj3Var3.s == 0 && w3() && this.f0[c].w == 2) {
                i = 1;
            }
            ah3Var.g1(i, (int) this.O);
            K2(this.f0[c]);
        }
    }

    public final void k3(long j, boolean z) {
        if (this.f0 != null) {
            int i = 0;
            while (true) {
                bj3[] bj3VarArr = this.f0;
                if (i < bj3VarArr.length) {
                    int childCount = bj3VarArr[i].a.getChildCount();
                    int i2 = 0;
                    while (true) {
                        if (i2 < childCount) {
                            View childAt = this.f0[i].a.getChildAt(i2);
                            if (childAt instanceof ue3) {
                                ue3 ue3Var = (ue3) childAt;
                                if (ue3Var.getDialogId() == j) {
                                    ue3Var.e0(z, true);
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

    public final void k4(mj0 mj0Var) {
        ArrayList arrayList = mj0Var.c;
        if (arrayList.size() == 1) {
            tv4 tv4Var = new tv4(getParentActivity(), this.currentAccount, ((TLRPC.User) arrayList.get(0)).id, null, null);
            tv4Var.a1(true);
            showDialog(tv4Var);
            return;
        }
        xu4.f1(false, mj0Var);
    }

    public final void k5() {
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
        ls9 ls9Var = this.a0;
        if (ls9Var != null && ls9Var.getVisibility() != 8) {
            f = this.a0.getMeasuredHeight();
        } else {
            f = 0.0f;
        }
        if (this.L) {
            f2 = gl.L(81.0f);
        } else {
            f2 = 0.0f;
        }
        boolean z = this.L;
        float f11 = this.O;
        float f12 = this.z1;
        if (z) {
            f3 = (f * f12) + tb4.A(1.0f, f12, f2, f11);
            f4 = this.z3;
        } else {
            f3 = (f * f12) + f11;
            f4 = this.z3;
        }
        float f13 = f3 + f4 + this.U;
        pi3 pi3Var = this.Y;
        if (pi3Var != null && pi3Var.getVisibility() == 0) {
            f5 = this.Y.getAlpha();
        } else {
            f5 = 0.0f;
        }
        float L = gl.L(4.0f) * f5;
        qi3 qi3Var = this.A0;
        if (qi3Var != null) {
            qi3Var.setTranslationY(f13 - L);
            f7 = this.A0.getAlpha();
            f8 = (this.A0.getUnreadOnlyBannerHeight() + gl.L(43.0f)) * f7;
            f6 = f13 + f8;
        } else {
            f6 = f13;
            f7 = 0.0f;
            f8 = 0.0f;
        }
        fj3 fj3Var = this.L1;
        if (fj3Var != null) {
            float f14 = f6 - L;
            int i2 = -gl.L(3.0f);
            if (this.b0 == null) {
                i = gl.L(44.0f);
            } else {
                i = 0;
            }
            fj3Var.setTranslationY(gl.R1(f14, i2 - i, this.b.e));
            f9 = this.L1.getMetadata().c.a;
            f10 = this.L1.c(0.0f);
        } else {
            f9 = 0.0f;
            f10 = 0.0f;
        }
        ej3 ej3Var = this.M1;
        if (ej3Var != null) {
            ej3Var.setTranslationY(f13 - L);
            float U1 = gl.U1(Math.min(f9, f7), gl.L(7.0f), gl.L(50.0f));
            ej3 ej3Var2 = this.M1;
            float min = Math.min(gl.L(40.0f), (f10 + f8) - U1);
            Matrix matrix = ej3Var2.b;
            if (ej3Var2.e != U1 || ej3Var2.f != min) {
                ej3Var2.e = U1;
                ej3Var2.f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, U1);
                LinearGradient linearGradient = ej3Var2.c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                ej3Var2.invalidate();
            }
            this.M1.setAlpha(Math.max(f7, f9));
        }
    }

    public final void l4() {
        oj0 a = oj0.a(this.currentAccount);
        int i = a.a;
        Set<String> set = a.d;
        mj0 mj0Var = a.c;
        if (mj0Var != null && !set.contains(mj0Var.a)) {
            set.add(a.c.a);
            SharedPreferences.Editor edit = na7.q1(i).X3.edit();
            edit.putStringSet("bday_hidden", set);
            edit.apply();
            kk7.f(i).k(kk7.i5, new Object[0]);
        }
        na7.q1(this.currentAccount).n4(0L, "BIRTHDAY_CONTACTS_TODAY");
        m5();
        m21 G = u21.b0(this).G(2131624034, 4, k96.M0(2131753327, null));
        G.j = 5000;
        G.j();
    }

    public final void l5(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.l5(boolean):void");
    }

    public final java.util.ArrayList m3(int r11, int r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.m3(int, int, int, boolean):java.util.ArrayList");
    }

    public final void m4(TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            m21 I = u21.b0(this).I(2131624034, k96.M0(2131746665, null), k96.M0(2131746664, null));
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
                String M0 = k96.M0(2131746661, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131746662, null);
                alertDialog$Builder.j(k96.M0(2131747638, null), null);
                showDialog(hdVar);
                return;
            }
            return;
        }
        ir2.v(null, 2131743640, u21.b0(this), 2131624012, 36);
    }

    public final void m5() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.m5():void");
    }

    public final float n3(boolean z) {
        float f;
        if (z) {
            f = 1.0f - this.b.e;
        } else {
            f = 1.0f;
        }
        return f * (1.0f - r3()) * this.r.e;
    }

    public final void n4(TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull W1 = getMessagesController().W1(getUserConfig().e());
        if (W1 != null) {
            tL_birthday2 = W1.birthday;
            W1.flags2 |= 32;
            W1.birthday = tL_birthday;
        } else {
            tL_birthday2 = null;
        }
        getMessagesController().h2();
        getConnectionsManager().sendRequest(updatebirthday, new en0(this, W1, tL_birthday2, (byte) 21), 1024);
        na7.q1(this.currentAccount).n4(0L, "BIRTHDAY_SETUP");
        m5();
    }

    public final void n5() {
        ns9 ns9Var;
        yi3 yi3Var;
        boolean z;
        int i;
        try {
            hh3 hh3Var = this.D1;
            if (hh3Var != null && hh3Var.getEditField() != null) {
                this.D1.getEditField().setCursorColor(getThemedColor(bkb.Me));
            }
            NumberTextView numberTextView = this.j1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(bkb.x8));
            }
            qi3 qi3Var = this.A0;
            int i2 = 0;
            if (qi3Var != null && (qi3Var.getSelectorDrawable() instanceof GradientDrawable)) {
                a aVar = this.actionBar;
                if (aVar != null && aVar.y()) {
                    z = true;
                } else {
                    z = false;
                }
                GradientDrawable gradientDrawable = (GradientDrawable) this.A0.getSelectorDrawable();
                if (z) {
                    i = bkb.wi;
                } else {
                    i = bkb.J8;
                }
                gradientDrawable.setColor(getThemedColor(i));
                this.A0.invalidate();
            }
            a aVar2 = this.actionBar;
            if (aVar2 != null) {
                if (this.Y2 != 0 || this.a3 != 0) {
                    aVar2.L(getThemedColor(bkb.P8), false);
                    this.actionBar.L(getThemedColor(bkb.Q8), true);
                }
                if (this.actionBar.y()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(bkb.c6));
                }
                t5();
            }
            if (this.f0 != null) {
                while (true) {
                    bj3[] bj3VarArr = this.f0;
                    if (i2 >= bj3VarArr.length) {
                        break;
                    }
                    bj3 bj3Var = bj3VarArr[i2];
                    if (bj3Var != null && (yi3Var = bj3Var.a) != null) {
                        yi3Var.setGlowColor(getThemedColor(bkb.c6));
                    }
                    i2++;
                }
            }
            hi3 hi3Var = this.D0;
            if (hi3Var != null && (ns9Var = hi3Var.b0) != null) {
                ns9Var.setGlowColor(getThemedColor(bkb.c6));
            }
            jh3 jh3Var = this.E1;
            if (jh3Var != null) {
                jh3Var.setScrimViewBackgroundColor(getThemedColor(bkb.c6));
            }
            je5 je5Var = this.q0;
            if (je5Var != null) {
                je5Var.i(getThemedColor(bkb.vj));
            }
            je5 je5Var2 = this.r0;
            if (je5Var2 != null) {
                je5Var2.i(getThemedColor(bkb.vj));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final int o3() {
        if (this.L) {
            return gl.L(48.0f) + gl.L(81.0f);
        }
        return gl.L(48.0f);
    }

    public final void o4() {
        na7.q1(this.currentAccount).n4(0L, "BIRTHDAY_SETUP");
        m5();
        m21 K = u21.b0(this).K(2131623982, k96.M0(2131753711, null), k96.M0(2131745303, null), new sg3(this, (byte) 9));
        K.j = 5000;
        K.j();
    }

    public final void o5(boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.o5(boolean, boolean):void");
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
                hi3 hi3Var = this.D0;
                if (hi3Var != null) {
                    hi3Var.S();
                    return false;
                }
            }
        } else {
            cs5 cs5Var = this.M0;
            if (cs5Var != null) {
                if (z) {
                    cs5Var.u();
                    this.M0 = null;
                    return false;
                }
            } else {
                qi3 qi3Var = this.A0;
                if (qi3Var != null && qi3Var.n) {
                    if (z) {
                        qi3Var.setIsEditing(false);
                        Z4(false);
                        return false;
                    }
                } else {
                    a aVar = this.actionBar;
                    if (aVar != null && aVar.y()) {
                        if (z) {
                            hi3 hi3Var2 = this.D0;
                            if (hi3Var2 != null && hi3Var2.getVisibility() == 0) {
                                this.D0.R(false);
                            }
                            y3(true);
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
                        qi3 qi3Var2 = this.A0;
                        if (qi3Var2 != null && qi3Var2.getVisibility() == 0 && !this.j3) {
                            qi3 qi3Var3 = this.A0;
                            if (!qi3Var3.P && !this.o3) {
                                ArrayList arrayList = qi3Var3.h;
                                if (!arrayList.isEmpty() && qi3Var3.M != ((de4) arrayList.get(0)).a) {
                                    if (z) {
                                        qi3 qi3Var4 = this.A0;
                                        ArrayList arrayList2 = qi3Var4.h;
                                        if (!arrayList2.isEmpty()) {
                                            qi3Var4.g((de4) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        hh3 hh3Var = this.D1;
                        if (hh3Var != null && hh3Var.Q0()) {
                            if (z) {
                                this.D1.J0(true);
                            }
                        } else {
                            oh3 oh3Var = this.F0;
                            if (oh3Var.P == 0 && oh3Var.T.K0() != 0) {
                                oh3Var.h.z0(0);
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
        qi3 qi3Var;
        if (this.X1) {
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.n(true);
            }
            TLObject tLObject = this.Z1;
            if (tLObject != null) {
                hi3 hi3Var = this.D0;
                if (hi3Var != null) {
                    hi3Var.e0.Q(this.Y1, tLObject);
                }
                this.Z1 = null;
            }
            this.X1 = false;
        }
        if (!this.L && (qi3Var = this.A0) != null && qi3Var.getVisibility() == 0 && this.r.f) {
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
        V2();
        this.s0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        je5 je5Var;
        super.onBecomeFullyVisible();
        if (D3()) {
            SharedPreferences c1 = na7.c1();
            boolean z = c1.getBoolean("archivehint", true);
            boolean isEmpty = m3(this.currentAccount, this.T0, this.Y2, false).isEmpty();
            if (z && isEmpty) {
                na7.c1().edit().putBoolean("archivehint", false).commit();
                z = false;
            }
            if (z) {
                c1.edit().putBoolean("archivehint", false).commit();
                X4();
            }
        }
        if (this.s0 && !this.t0 && (je5Var = this.q0) != null && this.P3) {
            this.t0 = true;
            this.s0 = false;
            je5Var.v();
        }
        gl.d3(new sg3(this, (byte) 0), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        cs5 cs5Var = this.M0;
        if (cs5Var != null) {
            cs5Var.u();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        hd hdVar;
        super.onDialogDismiss(dialog);
        if (this.Y2 == 0 && this.a3 == 0 && (hdVar = this.V1) != null && dialog == hdVar && getParentActivity() != null) {
            A2(false);
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
                this.b3 = getMessagesController().K0(Long.valueOf(this.a3));
                this.c3 = getMessagesController().L0(this.a3);
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
            this.W1 = na7.d1().getBoolean("askAboutContacts", true);
            gba.t();
        }
        kk7 notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        this.L3 = new wtc(notificationCenter, this);
        if (this.p2 == null) {
            this.f2 = getConnectionsManager().getConnectionState();
            this.L3.e(kk7.k4);
            if (!this.n2) {
                this.L3.e(kk7.K4);
                this.L3.e(kk7.C4);
                this.L3.b(kk7.Q2);
                this.L3.b(kk7.c2);
            }
            wtc wtcVar = this.L3;
            wtcVar.b(kk7.r);
            wtcVar.b(kk7.N2);
            wtcVar.b(kk7.O2);
            wtcVar.b(kk7.P2);
            wtcVar.b(2);
            wtcVar.b(kk7.X);
            wtcVar.b(kk7.N);
            wtcVar.b(kk7.H2);
            wtcVar.b(kk7.g0);
            wtcVar.b(kk7.e0);
            wtcVar.b(kk7.I);
            wtcVar.b(kk7.J);
            wtcVar.b(kk7.L);
            wtcVar.b(kk7.O0);
            wtcVar.b(kk7.r0);
            wtcVar.b(kk7.s5);
            wtcVar.b(kk7.R0);
            wtcVar.b(kk7.S1);
            wtcVar.b(kk7.d5);
            wtcVar.b(kk7.J2);
            wtcVar.b(kk7.c0);
            wtcVar.b(kk7.r1);
            wtcVar.b(kk7.a5);
            wtcVar.b(kk7.b5);
            wtcVar.b(kk7.M);
            wtcVar.b(kk7.o5);
            wtcVar.b(kk7.h5);
            this.L3.e(kk7.m0);
        }
        wtc wtcVar2 = this.L3;
        wtcVar2.b(kk7.v);
        wtcVar2.b(kk7.U4);
        wtcVar2.b(kk7.c5);
        wtcVar2.b(kk7.S);
        wtcVar2.b(kk7.N4);
        wtcVar2.b(kk7.v5);
        wtcVar2.b(kk7.x5);
        wtcVar2.b(kk7.a3);
        wtcVar2.b(kk7.e3);
        wtcVar2.b(kk7.i5);
        wtcVar2.b(kk7.z3);
        wtcVar2.b(kk7.B3);
        wtcVar2.b(kk7.U5);
        wtcVar2.b(kk7.V5);
        wtcVar2.b(kk7.R3);
        wtcVar2.b(kk7.S3);
        if (this.T0 == 0) {
            this.L3.b(kk7.B5);
            this.L3.b(kk7.O1);
        }
        t4(getAccountInstance());
        g2b M1 = getMessagesController().M1();
        if (!M1.A) {
            M1.V();
            if (!M1.s) {
                ConnectionsManager.getInstance(M1.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new i1b(M1, (byte) 0));
            }
        }
        getMessagesController().d3(this.Y2);
        if (this.V3 != null && !getMessagesStorage().R) {
            k83 k83Var = this.V3;
            if (k83Var.getParent() != null) {
                ((ViewGroup) k83Var.getParent()).removeView(k83Var);
            }
            this.V3 = null;
        }
        if (D3()) {
            g2b M12 = getMessagesController().M1();
            if (M12.z) {
                M12.S(true);
            }
        } else {
            getMessagesController().M1().V();
        }
        getContactsController().B();
        if (getMessagesController().P3) {
            vp9 D1 = getMessagesController().D1();
            if (!D1.e) {
                D1.g(true);
            }
        }
        if (this.a3 != 0) {
            getMessagesController().Y2(0, this.a3, true);
        }
        oj0 a = oj0.a(this.currentAccount);
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
                boolean z2 = w01.a;
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
                ConnectionsManager.getInstance(a.a).sendRequest(new TL_account.getBirthdays(), new tf(a, (byte) 3));
            }
        }
        if (this.X) {
            i = gl.L(72.0f);
        } else {
            i = 0;
        }
        this.m4 = i;
        if (this.X) {
            i2 = gl.L(64.0f);
        }
        this.n4 = i2;
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        gl.r(this.R3);
        super.onFragmentDestroy();
        wtc wtcVar = this.L3;
        if (wtcVar != null) {
            wtcVar.a();
            this.L3 = null;
        }
        hh3 hh3Var = this.D1;
        if (hh3Var != null) {
            hh3Var.b1();
        }
        bba bbaVar = this.I2;
        if (bbaVar != null) {
            bbaVar.j();
        }
        wc3 wc3Var = this.J2;
        if (wc3Var != null) {
            gl.r(wc3Var);
            this.J2 = null;
        }
        UndoView undoView = this.z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.r3.e();
        this.E2 = null;
        int i = wv4.l1;
    }

    @Override
    public final void onPanTranslationUpdate(float f) {
        if (this.f0 != null) {
            this.K0 = f;
            hh3 hh3Var = this.D1;
            int i = 0;
            if (hh3Var != null && hh3Var.Q0()) {
                this.fragmentView.setTranslationY(f);
                while (true) {
                    bj3[] bj3VarArr = this.f0;
                    if (i >= bj3VarArr.length) {
                        break;
                    }
                    bj3VarArr[i].setTranslationY(0.0f);
                    i++;
                }
                if (!this.n2) {
                    this.actionBar.setTranslationY(0.0f);
                    m21 m21Var = this.q3;
                    if (m21Var != null) {
                        m21Var.l();
                    }
                }
                hi3 hi3Var = this.D0;
                if (hi3Var != null) {
                    hi3Var.setTranslationY(this.J0);
                    return;
                }
                return;
            }
            while (true) {
                bj3[] bj3VarArr2 = this.f0;
                if (i >= bj3VarArr2.length) {
                    break;
                }
                bj3VarArr2[i].setTranslationY(f);
                i++;
            }
            if (!this.n2) {
                this.actionBar.setTranslationY(f);
                m21 m21Var2 = this.q3;
                if (m21Var2 != null) {
                    m21Var2.l();
                }
            }
            hi3 hi3Var2 = this.D0;
            if (hi3Var2 != null) {
                hi3Var2.setTranslationY(this.K0 + this.J0);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        m21 m21Var = this.T;
        if (m21Var != null) {
            m21Var.b();
            this.T = null;
        }
        rh3 rh3Var = this.H3;
        if (rh3Var != null) {
            rh3Var.r = true;
            yh3 yh3Var = rh3Var.a;
            if (yh3Var != null) {
                yh3Var.onPause();
            }
        }
        cs5 cs5Var = this.M0;
        if (cs5Var != null) {
            cs5Var.u();
        }
        hh3 hh3Var = this.D1;
        if (hh3Var != null) {
            hh3Var.d1();
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
            bj3[] bj3VarArr = this.f0;
            if (i < bj3VarArr.length) {
                bj3VarArr[i].d.getClass();
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        ya0 ya0Var;
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
                                im7.n(this.currentAccount).Y();
                                break;
                            } else {
                                tl7.D0();
                                continue;
                            }
                        case 1:
                            if (iArr[i2] == 0) {
                                fl5.z().e(null);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (iArr[i2] == 0) {
                                gl.c3(new wf3(this, (byte) 29));
                                getContactsController().l();
                                continue;
                            } else {
                                SharedPreferences.Editor edit = na7.d1().edit();
                                this.W1 = false;
                                edit.putBoolean("askAboutContacts", false).commit();
                                break;
                            }
                    }
                }
            }
            if (this.B0) {
                this.B0 = false;
                a5();
            }
        } else if (i == 4) {
            for (int i3 : iArr) {
                if (i3 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (ya0Var = FilesMigrationService.e) != null) {
                ya0Var.D0();
            }
        }
    }

    @Override
    public final void onResume() {
        boolean z;
        long j;
        bj3 bj3Var;
        eh3 eh3Var;
        boolean z2;
        boolean z3;
        boolean z4;
        mt9 mt9Var;
        sb sbVar;
        super.onResume();
        oh3 oh3Var = this.F0;
        char c = 0;
        if (oh3Var != null) {
            ArrayList arrayList = oh3Var.y;
            g2b g2bVar = oh3Var.s;
            g2bVar.k(g2bVar.g);
            g2bVar.k(g2bVar.h);
            for (int i = 0; i < arrayList.size(); i++) {
                TL_stories.PeerStories x = g2bVar.x(((sf3) arrayList.get(i)).c);
                if (x != null) {
                    g2bVar.Z(x);
                }
            }
        }
        rh3 rh3Var = this.H3;
        if (rh3Var != null) {
            rh3Var.r = false;
            yh3 yh3Var = rh3Var.a;
            if (yh3Var != null) {
                yh3Var.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).w() && (sbVar = this.L0) != null && sbVar.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        if (this.f0 != null) {
            int i2 = 0;
            while (true) {
                bj3[] bj3VarArr = this.f0;
                if (i2 >= bj3VarArr.length) {
                    break;
                }
                bj3VarArr[i2].d.f();
                i2++;
            }
        }
        if (this.Q3) {
            this.Q3 = false;
            getMessagesController().Z4(null);
            if (this.f0 != null) {
                int i3 = 0;
                while (true) {
                    bj3[] bj3VarArr2 = this.f0;
                    if (i3 >= bj3VarArr2.length) {
                        break;
                    }
                    bj3VarArr2[i3].d.f();
                    i3++;
                }
            }
        }
        B5(-1, false);
        hh3 hh3Var = this.D1;
        if (hh3Var != null) {
            hh3Var.e1();
        }
        long j2 = 0;
        if (!this.n2 && this.Y2 == 0 && this.a3 == 0) {
            getMediaDataController().D(4);
        }
        hi3 hi3Var = this.D0;
        if (hi3Var != null && (mt9Var = hi3Var.e0) != null) {
            mt9Var.f();
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
                if ((i4 <= 28 || w01.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i4 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ut2 ut2Var = new ut2(this, z4, z2, z3, parentActivity);
                if (this.v2 && (z2 || z4)) {
                    j2 = 4000;
                }
                gl.d3(ut2Var, j2);
            }
        } else {
            if (!this.n2 && this.Y2 == 0) {
                j = 0;
                if (this.a3 == 0 && nye.b() && !nye.a()) {
                    if (getParentActivity() != null) {
                        if (!na7.d1().getBoolean("askedAboutMiuiLockscreen", false)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                            int i5 = bkb.K5;
                            alertDialog$Builder.l(2131624116, 72, getThemedColor(i5), null);
                            alertDialog$Builder.m(i5, getResourceProvider());
                            String M0 = k96.M0(2131747105, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.U = M0;
                            alertDialog$Builder.j(k96.M0(2131747107, null), new ag3(this, (byte) 10));
                            alertDialog$Builder.g(k96.M0(2131751760, null), new k93((byte) 9));
                            showDialog(hdVar);
                        }
                    } else {
                        return;
                    }
                }
            } else {
                j = 0;
            }
            if (this.Y2 == 0 && this.a3 == j && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() != null) {
                    if (!na7.d1().getBoolean("askedAboutFSILockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                        int i6 = bkb.K5;
                        alertDialog$Builder2.l(2131624116, 72, getThemedColor(i6), null);
                        alertDialog$Builder2.m(i6, getResourceProvider());
                        String M02 = k96.M0(2131747121, null);
                        hd hdVar2 = alertDialog$Builder2.a;
                        hdVar2.U = M02;
                        alertDialog$Builder2.j(k96.M0(2131747107, null), new ag3(this, (byte) 11));
                        alertDialog$Builder2.g(k96.M0(2131751760, null), new k93((byte) 10));
                        showDialog(hdVar2);
                    }
                } else {
                    return;
                }
            }
        }
        a5();
        if (this.f0 != null) {
            int i7 = 0;
            while (true) {
                bj3[] bj3VarArr3 = this.f0;
                if (i7 >= bj3VarArr3.length) {
                    break;
                }
                bj3 bj3Var2 = bj3VarArr3[i7];
                if (bj3Var2.s == 0 && bj3Var2.w == 2 && bj3Var2.c.K0() == 0 && w3()) {
                    this.f0[i7].c.g1(1, (int) this.O);
                }
                bj3[] bj3VarArr4 = this.f0;
                if (i7 == 0) {
                    bj3VarArr4[i7].d.getClass();
                } else {
                    bj3VarArr4[i7].d.getClass();
                }
                i7++;
            }
        }
        c5();
        setBulletinDelegate(new s10(this, (byte) 9));
        if (this.s3) {
            gl.V2(getParentActivity(), this.classGuid);
        }
        C5(0, false);
        s5(false, true);
        A5(false);
        L2();
        V2();
        if (this.A0 != null && (bj3Var = this.f0[0]) != null && (eh3Var = bj3Var.d) != null) {
            int i8 = eh3Var.h;
            if (i8 == 7 || i8 == 8) {
                t97[] t97VarArr = getMessagesController().N;
                if (i8 != 7) {
                    c = 1;
                }
                t97 t97Var = t97VarArr[c];
                if (t97Var != null) {
                    this.A0.i(t97Var.o);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z, float f) {
        if (gba.o() <= 0) {
            boolean z2 = w01.a;
        } else if (this.d4 && this.e4 == null) {
            V4(f);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.h1.setColor(getThemedColor(bkb.c6));
            F2();
            n5();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        sb sbVar;
        cj3 cj3Var;
        rh3 rh3Var = this.H3;
        if (rh3Var != null && rh3Var.c()) {
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
        if (!z && (cj3Var = this.Z2) != null) {
            cj3Var.removeSelfFromStack();
        }
        V2();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        rh3 rh3Var = this.H3;
        if (rh3Var != null && rh3Var.c()) {
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
        V2();
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        int i2;
        int i3;
        int i4 = 8;
        if (i == 1) {
            W2();
            Y2();
            b3();
            O2();
            Z2();
            pi3 pi3Var = this.Y;
            fm0 fm0Var = this.b;
            pi3Var.setBlurredBackgroundVisibility(fm0Var.e);
            float a = zfe.a(fm0Var.e);
            be0 be0Var = this.d3;
            if (be0Var != null) {
                be0Var.setScaleX(a);
                this.d3.setScaleY(a);
                this.d3.setAlpha(a);
                be0 be0Var2 = this.d3;
                if (a > 0.0f) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                be0Var2.setVisibility(i3);
            }
            if (this.w0 != null) {
                float R1 = gl.R1(0.9f, 1.0f, a);
                this.w0.setScaleX(R1);
                this.w0.setScaleY(R1);
                this.w0.setAlpha(a);
                u41 u41Var = this.w0;
                int i5 = (a > 0.0f ? 1 : (a == 0.0f ? 0 : -1));
                if (i5 > 0) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                u41Var.setVisibility(i2);
                this.x0.setAlpha(a);
                ry1 ry1Var = this.x0;
                if (i5 > 0) {
                    i4 = 0;
                }
                ry1Var.setVisibility(i4);
            }
        } else if (i == 2) {
            W2();
            Y2();
        } else if (i == 3) {
            U2();
        } else if (i == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        } else if (i == 5) {
            T2();
        } else if (i == 6) {
            W2();
            Y2();
        } else if (i == 7) {
            P2();
        } else if (i == 8) {
            O2();
            Z2();
        } else if (i == 9) {
            Z2();
        }
    }

    public final int p3() {
        if (this.L) {
            return gl.L(81.0f);
        }
        return 0;
    }

    public final void p4() {
        na7.q1(this.currentAccount).n4(0L, "PREMIUM_CHRISTMAS");
        m5();
        m21 G = u21.b0(this).G(2131624034, 4, k96.M0(2131753327, null));
        G.j = 5000;
        G.j();
    }

    public final void p5(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.p5(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    @Override
    public final void prepareFragmentToSlide(boolean z, boolean z2) {
        if (!z && z2) {
            this.d4 = true;
            R4(true);
            return;
        }
        this.e4 = null;
        this.d4 = false;
        R4(false);
        V4(1.0f);
    }

    @Override
    public final boolean presentFragment(d dVar) {
        boolean presentFragment = super.presentFragment(dVar);
        if (presentFragment && this.f0 != null) {
            int i = 0;
            while (true) {
                bj3[] bj3VarArr = this.f0;
                if (i >= bj3VarArr.length) {
                    break;
                }
                bj3VarArr[i].d.getClass();
                i++;
            }
        }
        je5 je5Var = this.q0;
        if (je5Var != null) {
            je5Var.f(true);
        }
        je5 je5Var2 = this.r0;
        if (je5Var2 != null) {
            je5Var2.f(true);
        }
        m21.e();
        return presentFragment;
    }

    public final t97 q3(bj3 bj3Var) {
        char c;
        if (bj3Var != null) {
            int i = bj3Var.s;
            if (i == 7 || i == 8) {
                t97[] t97VarArr = getMessagesController().N;
                if (bj3Var.s == 8) {
                    c = 1;
                } else {
                    c = 0;
                }
                return t97VarArr[c];
            }
            return null;
        }
        return null;
    }

    public final void q4() {
        na7.q1(this.currentAccount).n4(0L, "PREMIUM_RESTORE");
        m5();
    }

    public final void q5() {
        float f = (((-this.k4) - this.n4) - this.w1) - this.x1;
        un4 un4Var = this.u0;
        if (un4Var != null) {
            un4Var.setTranslationY(f);
        }
        un4 un4Var2 = this.v0;
        if (un4Var2 != null) {
            un4Var2.setTranslationY(f - gl.L(52.0f));
            je5 je5Var = this.q0;
            if (je5Var != null) {
                je5Var.setTranslationY(f - gl.L(52.0f));
            }
        }
    }

    public final float r3() {
        rh3 rh3Var = this.H3;
        if (rh3Var != null && rh3Var.c()) {
            return this.H3.e;
        }
        return 0.0f;
    }

    public final void r4() {
        String str;
        na7 q1 = na7.q1(this.currentAccount);
        if (this.C3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        q1.n4(0L, str);
        m5();
    }

    public final void r5(boolean z) {
        boolean z2;
        boolean z3 = this.n2;
        if ((!z3 || this.T0 == 10) && this.Y2 == 0 && this.a3 == 0 && !this.inPreviewMode && ((!this.l2 || z3) && !this.Y3)) {
            z2 = true;
        } else {
            z2 = false;
        }
        un4 un4Var = this.u0;
        if (un4Var != null) {
            un4Var.e(z2, z);
        }
        un4 un4Var2 = this.v0;
        if (un4Var2 != null) {
            un4Var2.e(z2, z);
        }
    }

    public final float s3() {
        return -gl.U1(this.b.e, gl.L(4.0f), gl.L(48.0f));
    }

    public final void s4() {
        na7.q1(this.currentAccount).n4(0L, "USERPIC_SETUP");
        m5();
    }

    public final void s5(boolean z, boolean z2) {
        boolean z3;
        int i;
        if (this.o0 != null) {
            r7 r7Var = this.n0;
            if (r7Var == null || r7Var.getVisibility() != 0) {
                boolean z4 = false;
                int i2 = 0;
                while (true) {
                    if (i2 < getDownloadController().H.size()) {
                        if (getFileLoader().S(((k27) getDownloadController().H.get(i2)).S0())) {
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
                R2();
                boolean z5 = org.telegram.messenger.a.b.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i3 = this.f2;
                if (i3 == 3 || i3 == 5) {
                    z4 = true;
                }
                a8 a8Var = this.p0;
                if (z5) {
                    if (z4) {
                        i = 2131748416;
                    } else {
                        i = 2131748415;
                    }
                } else {
                    i = 2131748414;
                }
                a8Var.setSubtext(k96.M0(i, null));
                this.o0.b(z5, z4, z);
            }
        }
    }

    @Override
    public final void setInPreviewMode(boolean z) {
        super.setInPreviewMode(z);
        oh3 oh3Var = this.F0;
        if (oh3Var != null) {
            if (this.H0 && !z) {
                oh3Var.setVisibility(0);
            } else {
                oh3Var.setVisibility(8);
            }
        }
        r5(true);
        m5();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r5, int r6, java.lang.Runnable r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    public final g2b t3() {
        return getMessagesController().M1();
    }

    public final void t5() {
        int i;
        int i2;
        if (this.u3 && this.actionBar != null) {
            if (this.Y2 == 0 && this.a3 == 0) {
                i = bkb.u8;
            } else {
                i = bkb.N8;
            }
            int themedColor = getThemedColor(i);
            a aVar = this.actionBar;
            int i3 = bkb.x8;
            aVar.H(bm2.f(this.z1, themedColor, getThemedColor(i3)), false);
            this.actionBar.H(bm2.f(this.z1, getThemedColor(i3), getThemedColor(i3)), true);
            if (this.Y2 == 0 && this.a3 == 0) {
                i2 = bkb.s8;
            } else {
                i2 = bkb.M8;
            }
            int themedColor2 = getThemedColor(i2);
            this.actionBar.G(bm2.f(this.z1, themedColor2, getThemedColor(bkb.y8)), false);
        }
    }

    public final UndoView u3() {
        h3();
        UndoView[] undoViewArr = this.z0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.d(2, true);
            vi3 vi3Var = (vi3) this.fragmentView;
            vi3Var.removeView(undoViewArr[0]);
            vi3Var.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void u4(long j) {
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
                u4(((TLRPC.Dialog) obj).id);
            }
            return;
        }
        if ((!this.actionBar.y() || this.actionBar.z(null)) && D4(this.f0[0], dialog)) {
            z = true;
        } else {
            z = false;
        }
        int i2 = -1;
        if (z) {
            Q4(true, true);
            G2();
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
                    Q4(false, false);
                }
            }
        }
        int i4 = i2;
        if (getMessagesController().r2(j2) || getMessagesController().y2(j2)) {
            na7 messagesController = getMessagesController();
            ad7 messagesStorage = messagesController.getMessagesStorage();
            x67 x67Var = new x67(messagesController, j2);
            co3 co3Var = messagesStorage.a;
            de2 de2Var = new de2(messagesStorage, j2, x67Var, (byte) 5);
            j2 = j2;
            co3Var.c(de2Var);
        }
        getMessagesController().q3(j2, 0L);
        na7 messagesController2 = getMessagesController();
        int i5 = dialog.top_message;
        messagesController2.l3(j2, i5, i5, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i4 >= 0) {
            this.T1.remove(i4);
            this.f0[0].y.D();
            this.f0[0].b(true);
        }
    }

    public final void u5() {
        bba bbaVar;
        int i;
        hh3 hh3Var = this.D1;
        ArrayList arrayList = this.K2;
        if (hh3Var != null) {
            this.n.a(!arrayList.isEmpty(), true);
            v5();
            if (arrayList.isEmpty()) {
                if (this.T0 == 3 && this.h2 == null) {
                    i = 2131750558;
                } else {
                    i = 2131745477;
                }
                String M0 = k96.M0(i, null);
                boolean z = this.U3;
                boolean isEmpty = arrayList.isEmpty();
                a aVar = this.actionBar;
                if (z == isEmpty) {
                    aVar.setTitle(M0);
                } else {
                    aVar.N(M0, true, 350L, s33.h);
                }
                if (this.D1.getTag() != null) {
                    this.D1.K0(false, false, false);
                    this.D1.S();
                    this.D1.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                if (this.D1.getTag() == null) {
                    if (!x3() && this.G2 == null) {
                        this.D1.setFieldText("");
                    }
                    this.D1.setTag(1);
                    if (!this.a4 && (bbaVar = this.I2) != null) {
                        this.a4 = true;
                        String M02 = k96.M0(2131745237, null);
                        bbaVar.j();
                        bbaVar.G = M02;
                        ((jia) bbaVar.a[0].f).l(M02, false);
                        z6a z6aVar = new z6a(bbaVar, (byte) 2);
                        bbaVar.H = z6aVar;
                        gl.d3(z6aVar, 1000L);
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
                    long K1 = getMessagesController().K1(longValue);
                    if (K1 <= 0 && longValue > 0) {
                        K1 = cf3.j(getMessagesController().J2(longValue));
                    }
                    j += K1;
                }
                this.E1.i(i2, j, true);
                this.D1.x2();
                boolean z2 = this.U3;
                boolean isEmpty2 = arrayList.isEmpty();
                a aVar2 = this.actionBar;
                if (z2 == isEmpty2) {
                    aVar2.setTitle(k96.G(arrayList.size(), "Recipient", new Object[0]));
                } else {
                    aVar2.N(k96.G(arrayList.size(), "Recipient", new Object[0]), false, 350L, s33.h);
                }
            }
            this.U3 = arrayList.isEmpty();
        } else if (this.T0 == 10) {
            z3(arrayList.isEmpty());
        }
    }

    @Override
    public final void v() {
        N4(true, true);
    }

    public final t97 v3() {
        bj3[] bj3VarArr = this.f0;
        if (bj3VarArr != null && bj3VarArr[0] != null) {
            ArrayList R0 = getMessagesController().R0();
            int i = this.S3;
            if (i < 0) {
                i = this.f0[0].h;
            }
            if (i >= 0 && i < R0.size()) {
                return (t97) R0.get(i);
            }
        }
        return null;
    }

    public final boolean v4(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.v4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    public final void v5() {
        bba bbaVar = this.I2;
        if (bbaVar != null) {
            int i = this.currentAccount;
            bbaVar.h(i);
            bbaVar.d = y6c.h(j5.a(i).a).e();
            ArrayList arrayList = bbaVar.f;
            arrayList.clear();
            ArrayList arrayList2 = this.K2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            ev3 ev3Var = bbaVar.a[0];
            if (bbaVar.b == 1) {
                ((jia) ev3Var.e).l(bbaVar.c(ev3Var), false);
            }
        }
    }

    public final boolean w3() {
        if (!this.n2 && this.T0 == 0 && this.a3 == 0 && this.Y2 == 0) {
            na7 messagesController = getMessagesController();
            messagesController.getClass();
            if (gba.m1 && messagesController.R.f(2305843009213693953L) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean w4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.H;
        if (user != null && !l7c.B(user) && !l7c.z(user)) {
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

    public final void w5(boolean z) {
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
                k27 k27Var = (k27) obj;
                if (k27Var.F0() != null && k27Var.F0().size >= 157286400) {
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
            k27 k27Var2 = (k27) obj2;
            if (k27Var2.F0() != null && k27Var2.F0().size >= 157286400) {
                z2 = true;
                break;
            }
        }
        if (!getUserConfig().p() && !getMessagesController().F3() && z2 && z) {
            z3 = true;
        }
        this.d.a(z3, true);
    }

    public final boolean x3() {
        ArrayList arrayList = this.F2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void x4(View view) {
        boolean z;
        int i;
        int i2;
        String str;
        int i3;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        fx0 i4 = ug8.i(getParentActivity(), false, 1, null);
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
        if (gba.m1) {
            i2 = 2131231000;
        } else {
            i2 = 2131231004;
        }
        int[] iArr = {i, i2};
        if (z) {
            str = k96.M0(2131748490, null);
        } else {
            str = null;
        }
        if (gba.m1) {
            i3 = 2131747053;
        } else {
            i3 = 2131749132;
        }
        CharSequence[] charSequenceArr = {str, k96.M0(i3, null)};
        r20 r20Var = new r20(this, (byte) 1);
        i4.M = charSequenceArr;
        i4.N = iArr;
        i4.L = r20Var;
        showDialog(i4);
    }

    public final void x5(TLRPC.User user, boolean z) {
        tl tlVar;
        wjb wjbVar;
        oh3 oh3Var = this.F0;
        tl tlVar2 = null;
        if (oh3Var != null && (tlVar = oh3Var.b0) != null && oh3Var.r0 != null) {
            Long i = l7c.i(user);
            if (i != null) {
                tlVar.j(i.longValue(), z);
                tlVar.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z);
            } else {
                if (user != null) {
                    na7.q1(oh3Var.f);
                    if (na7.A2(user)) {
                        if (oh3Var.O0 == null) {
                            oh3Var.O0 = oh3Var.getContext().getResources().getDrawable(2131232312).mutate();
                            oh3Var.O0 = new ul(gl.L(18.0f), gl.L(18.0f), oh3Var.O0);
                        }
                        Drawable drawable = oh3Var.O0;
                        int i2 = bkb.pi;
                        cj3 cj3Var = oh3Var.f0;
                        if (cj3Var != null) {
                            wjbVar = cj3Var.getResourceProvider();
                        } else {
                            wjbVar = null;
                        }
                        zkb.x(oh3Var, drawable, i2, wjbVar, PorterDuff.Mode.MULTIPLY);
                        tlVar.g(oh3Var.O0, z);
                        tlVar.m(false, z);
                    }
                }
                tlVar.g(null, z);
                tlVar.m(false, z);
            }
            tlVar.k(Integer.valueOf(oh3Var.f(bkb.pi)));
            oh3Var.a0.invalidate();
        }
        if (this.F3 != null && this.actionBar != null) {
            Long i3 = l7c.i(user);
            this.D3 = null;
            if (i3 != null) {
                boolean z2 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                this.F3.j(i3.longValue(), z);
                this.F3.m(z2, z);
                if (z2) {
                    this.D3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
                }
                this.actionBar.setRightDrawableOnClick(new zf3(this, (byte) 1));
                tx9.s(this.currentAccount);
            } else {
                if (user != null) {
                    na7.q1(this.currentAccount);
                    if (na7.A2(user)) {
                        if (this.M3 == null) {
                            this.M3 = getParentActivity().getResources().getDrawable(2131232312).mutate();
                            this.M3 = new ul(gl.L(18.0f), gl.L(18.0f), this.M3);
                        }
                        Drawable drawable2 = this.M3;
                        int themedColor = getThemedColor(bkb.pi);
                        this.B4 = themedColor;
                        drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                        this.F3.g(this.M3, z);
                        this.F3.m(false, z);
                        this.actionBar.setRightDrawableOnClick(new zf3(this, (byte) 2));
                        tx9.s(this.currentAccount);
                    }
                }
                this.F3.g(null, z);
                this.F3.m(false, z);
                this.actionBar.setRightDrawableOnClick(null);
            }
            tl tlVar3 = this.F3;
            int i4 = bkb.pi;
            tlVar3.k(Integer.valueOf(getThemedColor(i4)));
            ym ymVar = this.G3;
            if (ymVar != null) {
                ymVar.setColor(getThemedColor(i4));
            }
            th3 th3Var = this.N0;
            if (th3Var != null && (th3Var.getContentView() instanceof tx9)) {
                jia titleTextView = this.actionBar.getTitleTextView();
                tx9 tx9Var = (tx9) this.N0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    tl tlVar4 = this.F3;
                    if (rightDrawable == tlVar4) {
                        tlVar2 = tlVar4;
                    }
                }
                tx9Var.y(tlVar2, titleTextView);
            }
        }
    }

    public final boolean y2(long j, View view) {
        if (this.n2 && getMessagesController().r2(j)) {
            return false;
        }
        Long valueOf = Long.valueOf(j);
        ArrayList arrayList = this.K2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j));
            if (view instanceof ue3) {
                ((ue3) view).e0(false, true);
            } else if (view instanceof rr8) {
                ((rr8) view).y(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j));
        if (view instanceof ue3) {
            ((ue3) view).e0(true, true);
        } else if (view instanceof rr8) {
            ((rr8) view).y(true, true);
        }
        return true;
    }

    public final void y3(boolean z) {
        int i;
        boolean z2;
        this.actionBar.x();
        this.K2.clear();
        ed0 ed0Var = this.g1;
        if (ed0Var != null) {
            ed0Var.c(true, 0.0f);
        }
        qi3 qi3Var = this.A0;
        if (qi3Var != null) {
            qi3Var.b(bkb.J8, bkb.H8, bkb.I8, bkb.K8, bkb.c6);
        }
        ValueAnimator valueAnimator = this.x3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x3 = null;
        }
        if (this.w3 == 0.0f) {
            return;
        }
        S4(-o3());
        int i2 = 0;
        while (true) {
            bj3[] bj3VarArr = this.f0;
            if (i2 >= bj3VarArr.length) {
                break;
            }
            bj3 bj3Var = bj3VarArr[i2];
            if (bj3Var != null) {
                bj3Var.a.J0(true);
            }
            i2++;
        }
        if (this.L) {
            i = 81;
        } else {
            i = 0;
        }
        float max = Math.max(0.0f, gl.L(i + 48) + this.O);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w3, 0.0f);
        this.x3 = ofFloat;
        ofFloat.addUpdateListener(new bg3(this, max, (byte) 1));
        this.x3.addListener(new ai3(this, max, (byte) 0));
        this.x3.setInterpolator(s33.f);
        this.x3.setDuration(200L);
        this.x3.start();
        this.a1 = false;
        ArrayList arrayList = this.c1;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            for (int size = arrayList.size(); i3 < size; size = size) {
                t97 t97Var = (t97) arrayList.get(i3);
                pd4.y0(t97Var, t97Var.g, t97Var.b, t97Var.c, t97Var.n, t97Var.m, t97Var.h, t97Var.i, t97Var.j, false, false, true, true, false, this, null);
                i3++;
                arrayList = arrayList;
            }
            arrayList.clear();
        }
        if (this.b1) {
            getMessagesController().p4(this.Y2, 0L, null);
            z2 = 0;
            this.b1 = false;
        } else {
            z2 = 0;
        }
        l5(true);
        if (this.f0 != null) {
            int i4 = z2;
            while (true) {
                bj3[] bj3VarArr2 = this.f0;
                if (i4 >= bj3VarArr2.length) {
                    break;
                }
                bj3VarArr2[i4].d.I = z2;
                i4++;
            }
        }
        int i5 = na7.q5;
        int i6 = z2;
        if (z) {
            i6 = 8192;
        }
        C5(196608 | i6, true);
    }

    public final void y4(android.view.View r27, int r28, defpackage.n39 r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.y4(android.view.View, int, n39):void");
    }

    public final void y5() {
        je5 je5Var;
        boolean c5 = getMessagesController().c5();
        if (this.P3 != c5) {
            q5();
            if (!this.P3 && c5 && (je5Var = this.q0) != null) {
                je5Var.v();
            }
            this.P3 = c5;
        }
        un4 un4Var = this.u0;
        if (un4Var == null) {
            return;
        }
        if (this.T0 == 10) {
            un4Var.setImageResource(2131231198);
            this.u0.setContentDescription(k96.M0(2131751342, null));
            return;
        }
        un4Var.setImageResource(2131231109);
        this.u0.setContentDescription(k96.M0(2131748078, null));
    }

    public final void z2(rf4 rf4Var) {
        hi3 hi3Var;
        if (this.s3 && (hi3Var = this.D0) != null) {
            ArrayList arrayList = hi3Var.D0;
            if (!arrayList.isEmpty()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (rf4Var.b((rf4) arrayList.get(i))) {
                        return;
                    }
                }
            }
            arrayList.add(rf4Var);
            pi3 pi3Var = this.Y;
            ArrayList arrayList2 = pi3Var.G;
            arrayList2.add(rf4Var);
            pi3Var.J = arrayList2.size() - 1;
            pi3Var.e();
            this.Y.r.getText().clear();
            p5(true, null, null, false, true);
        }
    }

    public final void z3(boolean z) {
        if (this.H3.c()) {
            z = true;
        }
        if (!z || !this.d2) {
            this.Y3 = z;
            r5(true);
            if (z) {
                je5 je5Var = this.q0;
                if (je5Var != null) {
                    je5Var.f(true);
                }
                je5 je5Var2 = this.r0;
                if (je5Var2 != null) {
                    je5Var2.f(true);
                }
            }
        }
    }

    public final boolean z4(View view, int i, float f, n39 n39Var) {
        mt9 mt9Var;
        long j;
        mt9 mt9Var2;
        TLRPC.EncryptedChat encryptedChat;
        long E;
        if (getParentActivity() != null && !(view instanceof dk3) && n39Var.d(i) != 21) {
            if (!this.actionBar.y() && !gl.O1() && !this.n2 && (view instanceof ue3)) {
                ue3 ue3Var = (ue3) view;
                if (!getMessagesController().r2(ue3Var.getDialogId()) && !this.H3.c() && ue3Var.b0(f)) {
                    return Y4(ue3Var);
                }
            }
            rh3 rh3Var = this.H3;
            if (rh3Var == null || !rh3Var.c()) {
                hi3 hi3Var = this.D0;
                boolean z = true;
                if (hi3Var != null && n39Var == (mt9Var2 = hi3Var.e0)) {
                    Object I = mt9Var2.I(i);
                    hi3 hi3Var2 = this.D0;
                    if (!hi3Var2.e0.O) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String M0 = k96.M0(2131752042, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                hdVar.U = k96.a0("ClearSearchSingleChatAlertText", null, 2131752041, mm4.j(this.currentAccount, chat, false));
                            } else {
                                hdVar.U = k96.a0("ClearSearchSingleChatAlertText", null, 2131752041, chat.title);
                            }
                            E = -chat.id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.id == getUserConfig().n) {
                                hdVar.U = k96.a0("ClearSearchSingleChatAlertText", null, 2131752041, k96.M0(2131745709, null));
                            } else {
                                hdVar.U = k96.a0("ClearSearchSingleUserAlertText", null, 2131752039, qu2.m(0, user.first_name, user.last_name));
                            }
                            E = user.id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            hdVar.U = k96.a0("ClearSearchSingleUserAlertText", null, 2131752039, qu2.m(0, V1.first_name, V1.last_name));
                            E = cf3.E(encryptedChat.id);
                        }
                        alertDialog$Builder.j(k96.M0(2131752043, null), new rz1(this, E, (byte) 1));
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        showDialog(hdVar);
                        TextView textView = (TextView) hdVar.c(-1);
                        if (textView != null) {
                            zkb.X(textView, bkb.p7, getResourceProvider());
                        }
                        return true;
                    }
                    hi3Var = hi3Var2;
                }
                if (hi3Var != null && n39Var == (mt9Var = hi3Var.e0)) {
                    if (this.n2) {
                        y4(view, i, n39Var);
                        return false;
                    }
                    if ((view instanceof rr8) && !mt9Var.N(i)) {
                        j = ((rr8) view).getDialogId();
                    } else {
                        j = 0;
                    }
                    if (j != 0) {
                        d5(j, view);
                        return true;
                    }
                } else {
                    Object J = ((oj3) n39Var).J(i);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.n2) {
                            if ((this.T0 == 3 || c3()) && D5(dialog.id)) {
                                if (this.T0 == 1 && c3() && this.o2 && getMessagesController().r2(dialog.id)) {
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
                                    qvb qvbVar = new qvb(bundle);
                                    qvbVar.M0 = this;
                                    presentFragment(qvbVar);
                                    return false;
                                }
                                y2(dialog.id, view);
                                u5();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            x4(view);
                            return false;
                        } else if (!this.actionBar.y() || !F3(dialog)) {
                            d5(dialog.id, view);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void z5(float f) {
        float f2;
        float f3;
        int i;
        int i2;
        float i3 = Utilities.i(this.z1 * 2.0f, 1.0f, 0.0f);
        oh3 oh3Var = this.F0;
        float f4 = (1.0f - this.w3) * f * this.I0;
        float f5 = 1.0f - i3;
        oh3Var.setAlpha(f4 * f5);
        int i4 = 0;
        if (!this.L && !this.N) {
            if (this.M) {
                this.F0.setTranslationY((Math.max(this.O, -p3()) + (-gl.L(81.0f))) - gl.L(8.0f));
                this.F0.setProgressToCollapse(1.0f);
                oh3 oh3Var2 = this.F0;
                oh3Var2.setClipTop((int) (gl.m - oh3Var2.getY()));
            }
            f2 = 1.0f - this.I0;
            this.actionBar.setTranslationY(0.0f);
        } else {
            float i5 = Utilities.i((-this.O) / gl.L(81.0f), 1.0f, 0.0f);
            if (this.w3 == 1.0f) {
                i5 = 1.0f;
            }
            float i6 = Utilities.i(i5 / 0.5f, 1.0f, 0.0f);
            this.F0.setClipTop(0);
            if (!this.L && this.N) {
                this.F0.setTranslationY((-gl.L(81.0f)) - gl.L(8.0f));
                this.F0.setProgressToCollapse(1.0f);
                f3 = this.I0;
            } else {
                this.F0.setTranslationY(((this.U / 2.0f) + (Math.max(this.O, -p3()) + this.y3)) - gl.L(8.0f));
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
            aVar.getTitlesContainer().setPivotY(gl.m);
            this.actionBar.getTitlesContainer().setPivotX(gl.L(20.0f));
            float f7 = (0.6f * f6) + 0.4f;
            this.actionBar.getTitlesContainer().setScaleY(f7);
            this.actionBar.getTitlesContainer().setScaleX(f7);
            this.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            this.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-gl.L(30.0f));
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
}
