package fi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import di.nb;
import di.w9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
import org.telegram.ui.lu0;
import org.telegram.ui.sb1;
import w7.x5;
public final class k3 extends Dialog implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.u3 {
    public static final HashSet W0 = new HashSet();
    public static final hv0 X0;
    public static int Y0;
    public boolean A0;
    public a1 B0;
    public boolean C0;
    public org.telegram.ui.ActionBar.n3 D0;
    public final f6 E;
    public boolean E0;
    public boolean F;
    public boolean F0;
    public int G;
    public float G0;
    public long H;
    public sb1 H0;
    public long I;
    public Drawable I0;
    public long J;
    public final HashMap J0;
    public int K;
    public n70 K0;
    public long L;
    public k0 L0;
    public String M;
    public boolean M0;
    public final Paint N;
    public float N0;
    public final Paint O;
    public ValueAnimator O0;
    public final Paint P;
    public ValueAnimator P0;
    public int Q;
    public boolean Q0;
    public int R;
    public ValueAnimator R0;
    public boolean S;
    public boolean S0;
    public final Paint T;
    public String T0;
    public boolean U;
    public org.telegram.ui.d3 U0;
    public boolean V;
    public boolean V0;
    public final h3 W;
    public final FrameLayout.LayoutParams X;
    public final Drawable Y;
    public org.telegram.ui.ActionBar.v0 Z;
    public int f9786a;
    public BotFullscreenButtons.OptionsIcon f9787a0;
    public float f9788b;
    public boolean f9789b0;
    public o1.k f9790c;
    public boolean f9791c0;
    public Boolean d;
    public boolean f9792d0;
    public final j3 f9793e;
    public boolean f9794e0;
    public final Rect f9795f;
    public float f9796f0;
    public float f9797g0;
    public final Rect h;
    public boolean f9798h0;
    public int f9799i0;
    public int f9800j0;
    public Activity f9801k0;
    public final g3 f9802l0;
    public final BotFullscreenButtons m0;
    public int f9803n;
    public qc f9804n0;
    public j0 f9805o0;
    public final FrameLayout f9806p0;
    public final FrameLayout.LayoutParams f9807q0;
    public final org.telegram.ui.ActionBar.o3 f9808r;
    public boolean f9809r0;
    public final cf.c f9810s;
    public final sd0 f9811s0;
    public final e2 f9812t0;
    public int f9813u0;
    public final a3 v;
    public f5 f9814v0;
    public final FrameLayout.LayoutParams f9815w;
    public boolean f9816w0;
    public final b3 f9817x;
    public boolean f9818x0;
    public final i3 f9819y;
    public boolean f9820y0;
    public Boolean f9821z0;

    static {
        hv0 hv0Var = new hv0(new w9(17), new w9(18));
        hv0Var.f26906c = 100.0f;
        X0 = hv0Var;
        Y0 = 0;
    }

    public k3(Context context, f6 f6Var) {
        super(context, R.style.TransparentDialog);
        Object obj;
        this.f9788b = 0.0f;
        this.f9795f = new Rect();
        this.h = new Rect();
        this.f9803n = 0;
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.N = paint;
        Paint paint2 = new Paint();
        this.O = paint2;
        this.P = new Paint(1);
        this.T = new Paint(1);
        this.f9812t0 = new e2(this, 1);
        this.f9813u0 = -1;
        this.f9820y0 = false;
        this.f9821z0 = null;
        this.J0 = new HashMap();
        this.M0 = false;
        this.Q0 = true;
        this.V0 = false;
        this.E = f6Var;
        this.f9786a = j6.w0(null, j6.Ii, false);
        a3 a3Var = new a3(this, context, 0);
        this.v = a3Var;
        a3Var.setAllowFullSizeSwipe(true);
        a3Var.setShouldWaitWebViewScroll(true);
        int i10 = j6.f20690d6;
        b3 b3Var = new b3(this, context, f6Var, j6.v0(i10, f6Var));
        this.f9817x = b3Var;
        b3Var.setOnVerifiedAge(this.H0);
        b3Var.setDelegate(new f3(this, context, f6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.Q = j6.v0(i10, f6Var);
        int v02 = j6.v0(j6.f20634a7, f6Var);
        this.R = v02;
        AndroidUtilities.setNavigationBarColor((Dialog) this, v02, false);
        j3 j3Var = new j3(this, context);
        this.f9793e = j3Var;
        j3Var.setDelegate(new g2(this, 0));
        FrameLayout.LayoutParams e7 = x5.e(-1, -1, 49);
        this.f9815w = e7;
        j3Var.addView(a3Var, e7);
        g3 g3Var = new g3(this, getContext(), f6Var);
        this.f9802l0 = g3Var;
        g3Var.setOnButtonClickListener(new h2(this, 0));
        g3Var.setOnResizeListener(new e2(this, 3));
        j3Var.addView(g3Var, x5.e(-1, -2, 81));
        BotFullscreenButtons botFullscreenButtons = new BotFullscreenButtons(getContext());
        this.m0 = botFullscreenButtons;
        botFullscreenButtons.setAlpha(0.0f);
        botFullscreenButtons.setVisibility(8);
        z10 = (MessagesController.getInstance(this.G).disableBotFullscreenBlur || SharedConfig.getDevicePerformanceClass() < 2) ? false : false;
        this.f9794e0 = z10;
        if (z10) {
            obj = a3Var.getRenderNode();
        } else {
            obj = null;
        }
        botFullscreenButtons.setParentRenderNode(obj);
        j3Var.addView(botFullscreenButtons, x5.e(-1, -1, 119));
        botFullscreenButtons.setOnCloseClickListener(new e2(this, 4));
        botFullscreenButtons.setOnCollapseClickListener(new e2(this, 5));
        botFullscreenButtons.setOnMenuClickListener(new e2(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9806p0 = frameLayout;
        FrameLayout.LayoutParams e10 = x5.e(-1, 200, 55);
        this.f9807q0 = e10;
        j3Var.addView(frameLayout, e10);
        this.Y = getContext().getDrawable(R.drawable.header_shadow).mutate();
        ?? kVar = new org.telegram.ui.ActionBar.k(context, f6Var);
        this.W = kVar;
        kVar.setBackgroundColor(0);
        kVar.setBackButtonImage(R.drawable.ic_close_white);
        A();
        kVar.setActionBarMenuOnItemClick(new ah.t(this, 2));
        kVar.setAlpha(0.0f);
        FrameLayout.LayoutParams e11 = x5.e(-1, -2, 49);
        this.X = e11;
        j3Var.addView((View) kVar, e11);
        ?? l4Var = new l4(context, f6Var);
        this.f9819y = l4Var;
        j3Var.addView((View) l4Var, x5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        b3Var.setWebViewProgressListener(new di.e5(this, 1));
        a3Var.addView(b3Var, x5.c(-1.0f, -1));
        a3Var.setScrollListener(new e2(this, 7));
        a3Var.setScrollEndListener(new e2(this, 8));
        a3Var.setDelegate(new f2(this));
        a3Var.setIsKeyboardVisible(new f2(this));
        sd0 sd0Var = new sd0(context);
        this.f9811s0 = sd0Var;
        j3Var.addView(sd0Var, x5.c(-1.0f, -1));
        setContentView(j3Var, new ViewGroup.LayoutParams(-1, -1));
        D();
        LaunchActivity launchActivity = LaunchActivity.G1;
        org.telegram.ui.ActionBar.o3 P = launchActivity != null ? launchActivity.P() : null;
        this.f9808r = P;
        if (P != null) {
            nb nbVar = new nb(j3Var, 17);
            e2 e2Var = new e2(this, 2);
            P.I.add(nbVar);
            P.J.add(e2Var);
            this.f9810s = new cf.c(P);
        }
    }

    public static void d(k3 k3Var) {
        if (!k3Var.M0) {
            super.dismiss();
            k3Var.M0 = true;
        }
    }

    public static WindowInsets e(k3 k3Var, View view, WindowInsets windowInsets) {
        r0.i1 i1Var = r0.l1.h(view, windowInsets).f44739a;
        i0.c f7 = i1Var.f(2);
        k3Var.f9795f.set(f7.f11451a, f7.f11452b, f7.f11453c, f7.d);
        i0.c f10 = i1Var.f(647);
        Rect rect = k3Var.h;
        rect.set(Math.max(f10.f11451a, windowInsets.getStableInsetLeft()), Math.max(f10.f11452b, windowInsets.getStableInsetTop()), Math.max(f10.f11453c, windowInsets.getStableInsetRight()), Math.max(f10.d, windowInsets.getStableInsetBottom()));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 28) {
            rect.top = Math.max(rect.top, AndroidUtilities.getStatusBarHeight(k3Var.getContext()));
        }
        int i11 = i1Var.f(8).d;
        if (i11 > rect.bottom && i11 > AndroidUtilities.dp(20.0f)) {
            k3Var.f9803n = i11;
        } else {
            k3Var.f9803n = 0;
        }
        k3Var.D();
        if (i10 >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void j(int i10, long j3, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(i10).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                i11++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot2;
                if (tL_attachMenuBot3.bot_id == j3) {
                    tL_attachMenuBot = tL_attachMenuBot3;
                    break;
                }
            } else {
                tL_attachMenuBot = null;
                break;
            }
        }
        if (tL_attachMenuBot == null) {
            return;
        }
        String formatString = LocaleController.formatString(R.string.BotRemoveFromMenu, tL_attachMenuBot.short_name);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(LaunchActivity.R().getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new u1(i10, j3, tL_attachMenuBot, runnable));
        i2.g.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static JSONObject p(f6 f6Var, final boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int v = j6.v(-16777216, j6.v0(j6.f20761h5, f6Var));
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    int v9 = j6.v(v, ((Integer) obj).intValue());
                    Integer valueOf = Integer.valueOf(v9);
                    if (z10) {
                        return String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(v9)), Integer.valueOf(Color.green(v9)), Integer.valueOf(Color.blue(v9)));
                    }
                    return valueOf;
                }
            };
            jSONObject.put("bg_color", callbackReturn.run(Integer.valueOf(v)));
            jSONObject.put("section_bg_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.f20690d6, f6Var))));
            int i10 = j6.f20634a7;
            jSONObject.put("secondary_bg_color", callbackReturn.run(Integer.valueOf(j6.v0(i10, f6Var))));
            jSONObject.put("text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.G6, f6Var))));
            jSONObject.put("hint_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.H6, f6Var))));
            jSONObject.put("link_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.J6, f6Var))));
            jSONObject.put("button_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.Oh, f6Var))));
            jSONObject.put("button_text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.Sh, f6Var))));
            jSONObject.put("header_bg_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.f20964s8, f6Var))));
            jSONObject.put("accent_text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.q6, f6Var))));
            jSONObject.put("section_header_text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.L6, f6Var))));
            jSONObject.put("subtitle_text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.f21088z6, f6Var))));
            jSONObject.put("destructive_text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.f20907p7, f6Var))));
            jSONObject.put("section_separator_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.f20691d7, f6Var))));
            jSONObject.put("bottom_bar_bg_color", callbackReturn.run(Integer.valueOf(j6.v0(i10, f6Var))));
            return jSONObject;
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public final void A() {
        if (!this.U) {
            int i10 = j6.G6;
            f6 f6Var = this.E;
            int v02 = j6.v0(i10, f6Var);
            h3 h3Var = this.W;
            h3Var.setTitleColor(v02);
            h3Var.C(j6.v0(i10, f6Var), false);
            h3Var.B(j6.v0(j6.f21001u8, f6Var), false);
            h3Var.D(j6.v0(j6.G8, f6Var), false);
            h3Var.F(j6.v0(j6.E8, f6Var), false, false);
            h3Var.F(j6.v0(j6.F8, f6Var), true, false);
            h3Var.G(j6.v0(j6.I5, f6Var), false);
        }
        this.f9817x.setFlickerViewColor(this.P.getColor());
    }

    public final void B() {
        qc qcVar;
        boolean z10;
        l0 c10 = l0.c(getContext(), this.G, this.H);
        ArrayList arrayList = c10.f9829e;
        k0 k0Var = c10.f9830f;
        boolean z11 = true;
        if (k0Var == null) {
            qc qcVar2 = this.f9804n0;
            if (qcVar2 != null) {
                qcVar2.b();
                this.f9804n0 = null;
            }
        } else if ((k0Var.c() && !k0Var.f9782l) || k0Var.f9781k) {
            if (this.L0 != k0Var && (qcVar = this.f9804n0) != null) {
                qcVar.b();
                this.f9804n0 = null;
            }
            qc qcVar3 = this.f9804n0;
            if (qcVar3 == null || !qcVar3.f29708l) {
                this.L0 = k0Var;
                j0 j0Var = new j0(getContext(), this.E);
                this.f9805o0 = j0Var;
                qc f7 = qc.f(this.f9806p0, j0Var, 5000);
                this.f9804n0 = f7;
                f7.k(true);
            }
            if (this.f9805o0.c(k0Var)) {
                this.f9804n0 = null;
            }
            k0Var.f9781k = false;
            k0Var.f9782l = true;
        } else {
            j0 j0Var2 = this.f9805o0;
            if (j0Var2 != null) {
                this.L0 = k0Var;
                if (j0Var2.c(k0Var)) {
                    this.f9804n0 = null;
                }
            }
        }
        C();
        for (Map.Entry entry : this.J0.entrySet()) {
            org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) entry.getValue();
            k0 k0Var2 = (k0) entry.getKey();
            f1Var.setText(k0Var2.f9775c);
            if (!k0Var2.c()) {
                f1Var.setSubtext(AndroidUtilities.formatFileSize(k0Var2.f9778g));
            } else {
                Pair b10 = k0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    f1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) b10.second).longValue()));
                } else {
                    f1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()));
                }
            }
            if (k0Var2.c()) {
                f1Var.setRightIcon(R.drawable.msg_close);
                f1Var.f20429b.setPadding(0, 0, AndroidUtilities.dp(32.0f), 0);
            } else if (k0Var2.f9779i) {
                f1Var.setVisibility(8);
            } else {
                f1Var.setRightIcon(0);
                f1Var.f20429b.setPadding(0, 0, 0, 0);
            }
            f1Var.setOnClickListener(new bi.u1(8, this, k0Var2));
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = this.f9787a0;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((k0) obj).c()) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        optionsIcon.setDownloading(z10);
        int size2 = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size2) {
                Object obj2 = arrayList.get(i11);
                i11++;
                if (((k0) obj2).c()) {
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        this.m0.setDownloading(z11);
    }

    public final void C() {
        j0 j0Var = this.f9805o0;
        if (j0Var == null) {
            return;
        }
        if (this.f9792d0) {
            j0Var.setArrow(AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(26.0f), this.f9796f0));
        } else if (this.f9788b > 0.5f) {
            j0Var.setArrow(AndroidUtilities.dp(24.0f));
        } else {
            j0Var.setArrow(-1);
        }
    }

    public final void D() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        BotFullscreenButtons botFullscreenButtons = this.m0;
        Rect rect = this.h;
        botFullscreenButtons.setInsets(rect);
        boolean z10 = this.f9792d0;
        b3 b3Var = this.f9817x;
        j3 j3Var = this.f9793e;
        g3 g3Var = this.f9802l0;
        int i16 = 0;
        if (z10) {
            if (g3Var != null && g3Var.getTotalHeight() > 0) {
                i14 = rect.bottom;
            } else {
                i14 = 0;
            }
            int i17 = rect.left;
            int i18 = rect.top;
            int i19 = rect.right;
            if (this.f9803n > i14 || (g3Var != null && g3Var.getTotalHeight() > 0)) {
                i15 = 0;
            } else {
                i15 = rect.bottom;
            }
            Rect rect2 = new Rect(i17, i18, i19, i15);
            int dp = AndroidUtilities.dp(46.0f);
            b3Var.Q(rect2, false);
            b3Var.P(dp, false);
            j3Var.setPadding(0, 0, 0, Math.max(this.f9803n, i14));
        } else {
            b3Var.Q(new Rect(0, 0, 0, 0), false);
            b3Var.P(0, false);
            int i20 = rect.left;
            int i21 = rect.right;
            int i22 = this.f9803n;
            org.telegram.ui.ActionBar.o3 o3Var = this.f9808r;
            if (o3Var != null) {
                i10 = o3Var.H;
            } else {
                i10 = 0;
            }
            j3Var.setPadding(i20, 0, i21, Math.max(i22, i10 + rect.bottom));
        }
        this.f9815w.topMargin = AndroidUtilities.dp(24.0f);
        boolean z11 = this.f9792d0;
        if (!z11) {
            i11 = 0;
        } else {
            i11 = rect.left;
        }
        FrameLayout.LayoutParams layoutParams = this.X;
        layoutParams.leftMargin = i11;
        layoutParams.rightMargin = 0;
        if (!z11) {
            i12 = 0;
        } else {
            i12 = rect.left;
        }
        FrameLayout.LayoutParams layoutParams2 = this.f9807q0;
        layoutParams2.leftMargin = i12;
        if (!z11) {
            i13 = 0;
        } else {
            i13 = rect.right;
        }
        layoutParams2.rightMargin = i13;
        boolean z12 = this.f9798h0;
        a3 a3Var = this.v;
        if (!z12) {
            a3Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f9792d0) {
                a3Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                a3Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f));
            }
            a3Var.setSwipeOffsetAnimationDisallowed(false);
            a3Var.c();
            a3Var.invalidate();
            a3Var.requestLayout();
        }
        if (a3Var != null) {
            a3Var.setFullSize(m());
        }
        g3Var.requestLayout();
        j3Var.requestLayout();
        if (!this.f9792d0) {
            i16 = 8;
        }
        botFullscreenButtons.setVisibility(i16);
    }

    public final void E() {
        boolean z10;
        int i10;
        boolean z11 = true;
        if (this.U) {
            z10 = !this.S;
        } else {
            z10 = (AndroidUtilities.isTablet() || i0.a.f(j6.w0(null, j6.f20690d6, true)) < 0.7210000157356262d || this.f9788b < 0.85f) ? false : false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            this.d = Boolean.valueOf(z10);
            if (Build.VERSION.SDK_INT >= 23) {
                j3 j3Var = this.f9793e;
                int systemUiVisibility = j3Var.getSystemUiVisibility();
                if (z10) {
                    i10 = systemUiVisibility | 8192;
                } else {
                    i10 = systemUiVisibility & (-8193);
                }
                j3Var.setSystemUiVisibility(i10);
            }
        }
    }

    public final void F() {
        org.telegram.ui.web.z0 webView;
        b3 b3Var = this.f9817x;
        if (b3Var == null || (webView = b3Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.P.getColor());
    }

    public final void G() {
        int i10;
        g3 g3Var;
        try {
            Window window = getWindow();
            if (window == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (Build.VERSION.SDK_INT <= 28) {
                i10 = 1024;
            } else {
                i10 = 512;
            }
            boolean z10 = this.f9792d0;
            if (z10) {
                attributes.flags = i10 | attributes.flags;
            } else {
                attributes.flags = (~i10) & attributes.flags;
            }
            j3 j3Var = this.f9793e;
            if (z10 && (((g3Var = this.f9802l0) == null || g3Var.getTotalHeight() <= 0) && !j3Var.f9767x0)) {
                j3Var.setSystemUiVisibility(j3Var.getSystemUiVisibility() | 2);
            } else {
                j3Var.setSystemUiVisibility(j3Var.getSystemUiVisibility() & (-3));
            }
            window.setAttributes(attributes);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.n3 a() {
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        boolean booleanValue;
        float f7;
        org.telegram.ui.ActionBar.n3 n3Var = new org.telegram.ui.ActionBar.n3();
        n3Var.f21257q = this.Q;
        n3Var.f21256p = this.f9813u0;
        n3Var.f21254n = this.U;
        n3Var.f21255o = this.V;
        n3Var.f21258r = this.P.getColor();
        n3Var.f21243a = this.f9814v0;
        boolean z13 = false;
        b3 b3Var = this.f9817x;
        if (b3Var != null && b3Var.N) {
            z10 = true;
        } else {
            z10 = false;
        }
        n3Var.f21260t = z10;
        n3Var.D = j6.I.q();
        org.telegram.ui.web.z0 z0Var = null;
        if (b3Var != null) {
            str = b3Var.getUrlLoaded();
        } else {
            str = null;
        }
        n3Var.f21263x = str;
        if (b3Var != null && b3Var.f42088t0) {
            z11 = true;
        } else {
            z11 = false;
        }
        n3Var.f21246e = z11;
        if (b3Var != null) {
            str2 = b3Var.getTrustedOrigin();
        } else {
            str2 = null;
        }
        n3Var.f21247f = str2;
        a3 a3Var = this.v;
        if ((a3Var == null || a3Var.getSwipeOffsetY() >= 0.0f) && !this.f9818x0 && !m() && !this.f9792d0) {
            z12 = false;
        } else {
            z12 = true;
        }
        n3Var.f21250j = z12;
        n3Var.f21265z = this.f9792d0;
        n3Var.A = this.f9794e0;
        Boolean bool = this.f9821z0;
        if (bool == null) {
            booleanValue = this.f9820y0;
        } else {
            booleanValue = bool.booleanValue();
        }
        n3Var.B = booleanValue;
        if (a3Var != null) {
            f7 = a3Var.getOffsetY();
        } else {
            f7 = Float.MAX_VALUE;
        }
        n3Var.f21251k = f7;
        n3Var.C = this.A0;
        n3Var.f21261u = this.f9816w0;
        n3Var.f21264y = this.f9809r0;
        n3Var.v = this.f9789b0;
        n3Var.f21252l = (a3Var == null || a3Var.M) ? true : true;
        n3Var.f21262w = this.f9802l0.f10101e;
        n3Var.f21259s = this.R;
        a1 a1Var = this.B0;
        if (a1Var != null) {
            a1Var.b();
        }
        n3Var.K = this.B0;
        if (b3Var != null) {
            z0Var = b3Var.getWebView();
        }
        if (z0Var != null) {
            b3Var.M();
            n3Var.f21244b = z0Var;
            n3Var.d = b3Var.getBotProxy();
            n3Var.f21248g = z0Var.getWidth();
            n3Var.h = z0Var.getHeight();
            z0Var.onPause();
        }
        boolean z14 = this.S0;
        n3Var.G = z14;
        if (z14) {
            n3Var.H = this.T0;
        }
        n3Var.L = this.C0;
        this.D0 = n3Var;
        return n3Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.i3 i3Var) {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.webViewResultSent) {
            if (this.J == ((Long) objArr[0]).longValue()) {
                k(false);
            }
        } else if (i10 == NotificationCenter.didSetNewTheme) {
            this.f9793e.invalidate();
            this.f9817x.f42079n.b(j6.v0(j6.f20690d6, this.E), 153);
            A();
            E();
        } else if (i10 == NotificationCenter.botDownloadsUpdate) {
            B();
        }
    }

    @Override
    public final void dismiss(boolean z10) {
        k(false);
    }

    public final void g(TL_bots.botAppSettings botappsettings, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        if (botappsettings != null) {
            boolean q6 = j6.I.q();
            int i15 = botappsettings.flags;
            if (q6) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            if ((i10 & i15) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (q6) {
                i11 = 16;
            } else {
                i11 = 8;
            }
            if ((i15 & i11) != 0) {
                if (q6) {
                    i14 = botappsettings.header_dark_color;
                } else {
                    i14 = botappsettings.header_color;
                }
                t(i14 | (-16777216), true, z10);
            }
            if (z11) {
                if (q6) {
                    i12 = botappsettings.background_dark_color;
                } else {
                    i12 = botappsettings.background_color;
                }
                v(i12 | (-16777216), z10);
                if (q6) {
                    i13 = botappsettings.background_dark_color;
                } else {
                    i13 = botappsettings.background_color;
                }
                y(i13 | (-16777216), z10);
            }
        }
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        return i0.a.d(this.N0, i10, this.R);
    }

    @Override
    public final org.telegram.ui.ActionBar.v3 mo37getWindowView() {
        return this.f9793e;
    }

    public final void h() {
        LaunchActivity launchActivity;
        if (!this.M0 && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.H(true, true, true);
        }
        j3 j3Var = this.f9793e;
        if (j3Var != null) {
            j3Var.invalidate();
        }
    }

    public final void i() {
        if (this.U0 == null) {
            org.telegram.ui.d3 d3Var = new org.telegram.ui.d3(getContext());
            this.U0 = d3Var;
            this.v.addView(d3Var, x5.c(-1.0f, -1));
            this.U0.setTranslationY(-1.0f);
            this.U0.h.setOnClickListener(new n2(this, 0));
            this.U0.setBackgroundColor(this.P.getColor());
            AndroidUtilities.updateViewVisibilityAnimated(this.U0, this.S0, 1.0f, false);
        }
    }

    public final void k(boolean z10) {
        int i10;
        LaunchActivity launchActivity;
        if (this.f9791c0) {
            return;
        }
        int i11 = 0;
        if (this.H0 != null) {
            z10 = false;
        }
        this.f9791c0 = true;
        z(false);
        AndroidUtilities.cancelRunOnUIThread(this.f9812t0);
        NotificationCenter.getInstance(this.G).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getInstance(this.G).removeObserver(this, NotificationCenter.botDownloadsUpdate);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        if (z10 && ((launchActivity = LaunchActivity.G1) == null || launchActivity.f33496y0 == null)) {
            z10 = false;
        }
        if (z10) {
            o1.k kVar = this.f9790c;
            if (kVar != null) {
                kVar.f16852u.f16859i = 0.0f;
                kVar.f();
            }
            LaunchActivity.G1.f33496y0.b(this);
        } else {
            g3 g3Var = this.f9802l0;
            if (g3Var != null) {
                g3Var.animate().translationY(g3Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(pr.h).start();
            }
            this.f9817x.i();
            a3 a3Var = this.v;
            int height = a3Var.getHeight();
            if (g3Var != null) {
                i10 = g3Var.getTotalHeight();
            } else {
                i10 = 0;
            }
            int i12 = height + i10;
            Rect rect = this.h;
            int R = this.f9793e.R() + i12 + rect.top + rect.bottom;
            if (m()) {
                i11 = AndroidUtilities.dp(200.0f);
            }
            a3Var.f(R + i11, true, new e2(this, 0));
        }
        W0.remove(this);
    }

    public final Activity l() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            ownerActivity = LaunchActivity.G1;
        }
        if (ownerActivity == null) {
            return AndroidUtilities.findActivity(getContext());
        }
        return ownerActivity;
    }

    public final boolean m() {
        if (!this.f9792d0) {
            Boolean bool = this.f9821z0;
            if (bool == null) {
                if (!this.f9820y0) {
                    return false;
                }
                return true;
            } else if (!bool.booleanValue()) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public final void n() {
        boolean z10;
        if (this.f9814v0 != null) {
            long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.f9814v0.f9706r));
            String str = null;
            this.f9821z0 = null;
            TLObject tLObject = this.f9814v0.f9705q;
            if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                this.J = tL_webViewResultUrl.query_id;
                str = tL_webViewResultUrl.url;
                z10 = tL_webViewResultUrl.same_origin;
                this.f9821z0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
                boolean z11 = this.E0;
                if (!z11) {
                    x(tL_webViewResultUrl.fullscreen, !z11, this.f9794e0);
                }
            } else {
                if (tLObject instanceof TLRPC.TL_appWebViewResultUrl) {
                    this.J = 0L;
                    str = ((TLRPC.TL_appWebViewResultUrl) tLObject).url;
                } else if (tLObject instanceof TLRPC.TL_simpleWebViewResultUrl) {
                    this.J = 0L;
                    str = ((TLRPC.TL_simpleWebViewResultUrl) tLObject).url;
                }
                z10 = false;
            }
            if (str != null && !this.E0) {
                MediaDataController.getInstance(this.G).increaseWebappRating(this.f9814v0.f9693c);
                this.f9817x.u(this.G, str, z10);
            }
            AndroidUtilities.runOnUIThread(this.f9812t0, max);
            a3 a3Var = this.v;
            if (a3Var != null) {
                a3Var.setFullSize(m());
            }
        }
    }

    public final void o(boolean z10) {
        if (this.C0 == z10) {
            return;
        }
        this.C0 = z10;
        if (this.V0) {
            if (z10) {
                Y0++;
            } else {
                Y0--;
            }
        }
        if (Y0 > 0) {
            AndroidUtilities.lockOrientation(l());
        } else {
            AndroidUtilities.unlockOrientation(l());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u(true);
        if (this.f9790c == null) {
            o1.k kVar = new o1.k(this, X0);
            o1.l lVar = new o1.l();
            lVar.b(1200.0f);
            lVar.a(1.0f);
            kVar.f16852u = lVar;
            this.f9790c = kVar;
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f9811s0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else if (this.f9817x.D()) {
        } else {
            k(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        g3 g3Var;
        super.onCreate(bundle);
        Window window = getWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            window.addFlags(-2147483392);
        } else {
            window.addFlags(-2147417856);
        }
        window.setWindowAnimations(R.style.DialogNoAnimation);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        int i11 = attributes.flags;
        int i12 = i11 & (-3);
        attributes.flags = i12;
        attributes.softInputMode = 16;
        attributes.height = -1;
        boolean z10 = true;
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        if (this.f9792d0) {
            attributes.flags = i12 | 512;
        } else {
            attributes.flags = i11 & (-515);
        }
        window.setAttributes(attributes);
        if (i10 >= 23) {
            window.setStatusBarColor(0);
        }
        j3 j3Var = this.f9793e;
        j3Var.setFitsSystemWindows(true);
        j3Var.setSystemUiVisibility(1792);
        j3Var.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return k3.e(k3.this, view, windowInsets);
            }
        });
        if (this.f9792d0 && ((g3Var = this.f9802l0) == null || g3Var.getTotalHeight() <= 0)) {
            j3Var.setSystemUiVisibility(j3Var.getSystemUiVisibility() | 2);
        } else {
            j3Var.setSystemUiVisibility(j3Var.getSystemUiVisibility() & (-3));
        }
        if (i10 >= 26) {
            if (i0.a.f(this.R) < 0.7210000157356262d) {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getInstance(this.G).addObserver(this, NotificationCenter.botDownloadsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u(false);
        o1.k kVar = this.f9790c;
        if (kVar != null) {
            kVar.c();
            this.f9790c = null;
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).B0.add(this.f9811s0);
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
            ((LaunchActivity) context).B0.remove(this.f9811s0);
        }
    }

    public final boolean q() {
        String str;
        if (this.f9809r0) {
            TLRPC.User user = MessagesController.getInstance(this.G).getUser(Long.valueOf(this.H));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            alertDialog$Builder.f20225a.R = str;
            alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new f2(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
            b2Var.show();
            ((TextView) b2Var.d(-1)).setTextColor(j6.v0(j6.f20925q7, this.E));
            return false;
        }
        k(false);
        return true;
    }

    public final void r() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        View view;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10;
        int i11;
        ArrayList arrayList;
        int v02;
        int v03;
        int l1;
        TLRPC.User user = MessagesController.getInstance(this.G).getUser(Long.valueOf(this.H));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(this.G).getAttachMenuBots().bots;
        int size = arrayList2.size();
        int i12 = 0;
        while (true) {
            if (i12 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList2.get(i12);
                i12++;
                tL_attachMenuBot = tL_attachMenuBot2;
                if (tL_attachMenuBot.bot_id == this.H) {
                    break;
                }
            } else {
                tL_attachMenuBot = null;
                break;
            }
        }
        n70 n70Var = this.K0;
        if (n70Var != null) {
            n70Var.u();
        }
        if (this.f9792d0) {
            view = this.m0;
        } else {
            view = this.Z;
        }
        n70 G = n70.G(this.f9793e, this.E, view, true);
        this.K0 = G;
        ArrayList arrayList3 = l0.c(getContext(), this.G, this.H).f9829e;
        HashMap hashMap = this.J0;
        hashMap.clear();
        if (!arrayList3.isEmpty()) {
            n70 J = G.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new lu0(G, 25), false);
            J.k();
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj = arrayList3.get(i13);
                i13++;
                k0 k0Var = (k0) obj;
                String str = k0Var.f9775c;
                ah.j jVar = new ah.j(11);
                f6 f6Var = J.d;
                if (J.f28662e == null) {
                    arrayList = arrayList3;
                } else {
                    org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, J.f28662e, J.d, false, false);
                    arrayList = arrayList3;
                    f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    f1Var.setText(str);
                    f1Var.setSubtext("");
                    Integer num = J.f28672j0;
                    if (num != null) {
                        v02 = num.intValue();
                    } else {
                        v02 = j6.v0(j6.E8, f6Var);
                    }
                    Integer num2 = J.f28674k0;
                    if (num2 != null) {
                        v03 = num2.intValue();
                    } else {
                        v03 = j6.v0(j6.F8, f6Var);
                    }
                    f1Var.c(v02, v03);
                    Integer num3 = J.f28676l0;
                    if (num3 != null) {
                        l1 = num3.intValue();
                    } else {
                        l1 = j6.l1(0.12f, j6.v0(j6.E8, f6Var));
                    }
                    f1Var.setSelectorColor(l1);
                    f1Var.setOnClickListener(new org.telegram.ui.Components.g0(J, jVar));
                    int i14 = J.S;
                    if (i14 > 0) {
                        f1Var.setMinimumWidth(AndroidUtilities.dp(i14));
                        J.r(f1Var, x5.n(J.S, -2));
                    } else {
                        J.r(f1Var, x5.n(-1, -2));
                        hashMap.put(k0Var, J.y());
                        arrayList3 = arrayList;
                    }
                }
                hashMap.put(k0Var, J.y());
                arrayList3 = arrayList;
            }
            B();
            J.S = AndroidUtilities.dp(180.0f);
            G.c(R.drawable.menu_download_round, LocaleController.getString(R.string.BotDownloads), new m2(G, J, 0), false);
            G.k();
        }
        if (this.H0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        G.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new e2(this, 9), z10);
        if (this.H0 == null && this.f9789b0) {
            z11 = true;
        } else {
            z11 = false;
        }
        G.l(R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings), new e2(this, 10), z11);
        G.c(R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage), new e2(this, 11), false);
        if (this.H0 == null && user != null && user.bot_has_main_app) {
            z12 = true;
        } else {
            z12 = false;
        }
        G.l(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new e2(this, 12), z12);
        if (this.H0 == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        G.l(R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS), new e2(this, 13), z13);
        if (this.H0 == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        G.l(R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot), new e2(this, 14), z14);
        if (this.H0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu)) {
            z15 = true;
        } else {
            z15 = false;
        }
        G.l(R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot), new e2(this, 15), z15);
        if (this.Q != j6.w0(null, j6.f20690d6, false)) {
            if (AndroidUtilities.computePerceivedBrightness(this.Q) >= 0.721f) {
                i10 = -1;
            } else {
                i10 = -15198183;
            }
            if (AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f) {
                i11 = -16777216;
            } else {
                i11 = -1;
            }
            int l12 = j6.l1(0.85f, i11);
            int l13 = j6.l1(0.1f, i11);
            G.P(i10);
            for (int i15 = 0; i15 < G.x(); i15++) {
                View w10 = G.w(i15);
                if (w10 instanceof org.telegram.ui.ActionBar.f1) {
                    org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) w10;
                    f1Var2.c(i11, l12);
                    f1Var2.setSelectorColor(l13);
                }
            }
        }
        G.V(5);
        G.a0(-this.h.right, 0.0f);
        G.U = true;
        G.f28688t = false;
        G.f28687s = 0;
        G.Z();
    }

    @Override
    public final void release() {
        if (this.M0) {
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        z(false);
    }

    public final void s(org.telegram.ui.ActionBar.n2 n2Var, f5 f5Var) {
        TLRPC.User user;
        org.telegram.ui.ActionBar.z zVar;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        org.telegram.ui.ActionBar.z zVar2;
        boolean z10;
        TLRPC.InputPeer inputPeer;
        TLRPC.InputPeer inputPeer2;
        boolean z11;
        TL_bots.botAppSettings botappsettings;
        boolean z12;
        this.f9814v0 = f5Var;
        int i10 = f5Var.f9691a;
        this.G = i10;
        this.I = f5Var.f9692b;
        this.H = f5Var.f9693c;
        this.K = f5Var.h;
        this.L = f5Var.f9697i;
        this.M = f5Var.f9694e;
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(this.H));
        CharSequence userName = UserObject.getUserName(user2);
        boolean z13 = false;
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        h3 h3Var = this.W;
        h3Var.setTitle(userName);
        TLRPC.UserFull userFull = MessagesController.getInstance(this.G).getUserFull(this.H);
        f6 f6Var = this.E;
        if ((user2 != null && user2.verified) || (userFull != null && (user = userFull.user) != null && user.verified)) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            this.I0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.Oh, f6Var), PorterDuff.Mode.SRC_IN));
            this.I0.setAlpha(255);
            h3Var.getTitleTextView().setDrawablePadding(AndroidUtilities.dp(2.0f));
            h3Var.getTitleTextView().i(new di.e4(this, 1));
        }
        BotFullscreenButtons botFullscreenButtons = this.m0;
        if (botFullscreenButtons != null) {
            String userName2 = UserObject.getUserName(user2);
            if (user2 != null && user2.verified) {
                z12 = true;
            } else {
                z12 = false;
            }
            botFullscreenButtons.setName(userName2, z12);
        }
        org.telegram.ui.ActionBar.z n10 = h3Var.n();
        n10.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.G).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                i11++;
                tL_attachMenuBot = tL_attachMenuBot2;
                zVar = n10;
                if (tL_attachMenuBot.bot_id == this.H) {
                    break;
                }
                n10 = zVar;
            } else {
                zVar = n10;
                tL_attachMenuBot = null;
                break;
            }
        }
        if (!this.E0) {
            if (userFull != null) {
                TL_bots.BotInfo botInfo = userFull.bot_info;
                if (botInfo != null && (botappsettings = botInfo.app_settings) != null) {
                    g(botappsettings, false);
                }
                z11 = true;
            } else {
                z11 = true;
                MessagesController.getInstance(this.G).loadFullUser(user2, 0, true, new h2(this, 1));
            }
            if (f5Var.f9704p) {
                x(z11, false, this.f9794e0);
            }
        }
        if (this.H0 == null) {
            zVar2 = zVar;
            zVar2.a(R.id.menu_collapse_bot, R.drawable.arrow_more);
        } else {
            zVar2 = zVar;
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = new BotFullscreenButtons.OptionsIcon(getContext());
        this.f9787a0 = optionsIcon;
        org.telegram.ui.ActionBar.v0 d = zVar2.d(0, optionsIcon);
        this.Z = d;
        d.setOnClickListener(new n2(this, 1));
        h3Var.setActionBarMenuOnItemClick(new s2(this));
        JSONObject p5 = p(f6Var, false);
        TLRPC.User user3 = MessagesController.getInstance(this.G).getUser(Long.valueOf(this.H));
        b3 b3Var = this.f9817x;
        b3Var.setBotUser(user3);
        b3Var.t(this.G, this.H);
        TLRPC.User user4 = f5Var.f9701m;
        if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu && !MediaDataController.getInstance(this.G).isShortcutAdded(this.H, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
            if (user4 == null) {
                user4 = MessagesController.getInstance(this.G).getUser(Long.valueOf(this.H));
            }
            if (user4 != null && user4.photo != null && !FileLoader.getInstance(this.G).getPathToAttach(user4.photo.photo_small, true).exists()) {
                MediaDataController.getInstance(this.G).preloadImage(ImageLocation.getForUser(this.G, user4, 1), 0);
            }
        }
        if (f5Var.f9705q != null) {
            n();
            return;
        }
        int i12 = f5Var.f9696g;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                TLRPC.TL_messages_requestChatJoinWebView tL_messages_requestChatJoinWebView = new TLRPC.TL_messages_requestChatJoinWebView();
                                tL_messages_requestChatJoinWebView.platform = "android";
                                tL_messages_requestChatJoinWebView.query_id = f5Var.d;
                                if (p5 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = p5.toString();
                                }
                                ConnectionsManager.getInstance(this.G).sendRequestTyped(tL_messages_requestChatJoinWebView, new Object(), new ci.u(this, 16), 66);
                                return;
                            }
                            return;
                        }
                        TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                        tL_messages_requestMainWebView.bot = MessagesController.getInstance(this.G).getInputUser(f5Var.f9693c);
                        tL_messages_requestMainWebView.platform = "android";
                        if (n2Var instanceof co) {
                            co coVar = (co) n2Var;
                            if (coVar.i() != null) {
                                inputPeer2 = MessagesController.getInputPeer(coVar.i());
                            } else {
                                inputPeer2 = MessagesController.getInputPeer(coVar.f35264e);
                            }
                        } else {
                            inputPeer2 = MessagesController.getInstance(this.G).getInputPeer(f5Var.f9692b);
                        }
                        tL_messages_requestMainWebView.peer = inputPeer2;
                        tL_messages_requestMainWebView.compact = f5Var.f9703o;
                        tL_messages_requestMainWebView.fullscreen = f5Var.f9704p;
                        if (!TextUtils.isEmpty(f5Var.f9700l)) {
                            tL_messages_requestMainWebView.start_param = f5Var.f9700l;
                            tL_messages_requestMainWebView.flags |= 2;
                        }
                        if (p5 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                            tL_messages_requestMainWebView.theme_params = tL_dataJSON2;
                            tL_dataJSON2.data = p5.toString();
                            tL_messages_requestMainWebView.flags |= 1;
                        }
                        ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestMainWebView, new p2(this, 5), 66);
                        return;
                    }
                    TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                    TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                    TLRPC.BotApp botApp = f5Var.f9698j;
                    tL_inputBotAppID.f19954id = botApp.f19893id;
                    tL_inputBotAppID.access_hash = botApp.access_hash;
                    tL_messages_requestAppWebView.app = tL_inputBotAppID;
                    tL_messages_requestAppWebView.write_allowed = f5Var.f9699k;
                    tL_messages_requestAppWebView.platform = "android";
                    if (n2Var instanceof co) {
                        co coVar2 = (co) n2Var;
                        if (coVar2.i() != null) {
                            inputPeer = MessagesController.getInputPeer(coVar2.i());
                        } else {
                            inputPeer = MessagesController.getInputPeer(coVar2.f35264e);
                        }
                    } else {
                        inputPeer = MessagesController.getInputPeer(f5Var.f9701m);
                    }
                    tL_messages_requestAppWebView.peer = inputPeer;
                    tL_messages_requestAppWebView.compact = f5Var.f9703o;
                    tL_messages_requestAppWebView.fullscreen = f5Var.f9704p;
                    if (!TextUtils.isEmpty(f5Var.f9700l)) {
                        tL_messages_requestAppWebView.start_param = f5Var.f9700l;
                        tL_messages_requestAppWebView.flags |= 2;
                    }
                    if (p5 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                        tL_messages_requestAppWebView.theme_params = tL_dataJSON3;
                        tL_dataJSON3.data = p5.toString();
                        tL_messages_requestAppWebView.flags |= 4;
                    }
                    ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestAppWebView, new p2(this, 4), 66);
                    return;
                }
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.bot = MessagesController.getInstance(this.G).getInputUser(this.H);
                tL_messages_requestWebView.peer = MessagesController.getInstance(this.G).getInputPeer(this.H);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = f5Var.f9703o;
                tL_messages_requestWebView.fullscreen = f5Var.f9704p;
                tL_messages_requestWebView.url = f5Var.f9695f;
                tL_messages_requestWebView.flags |= 2;
                if (p5 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON4;
                    tL_dataJSON4.data = p5.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestWebView, new p2(this, 1));
                NotificationCenter.getInstance(this.G).addObserver(this, NotificationCenter.webViewResultSent);
                return;
            }
            TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
            if ((f5Var.f9702n & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_messages_requestSimpleWebView.from_switch_webview = z10;
            tL_messages_requestSimpleWebView.bot = MessagesController.getInstance(this.G).getInputUser(this.H);
            tL_messages_requestSimpleWebView.platform = "android";
            if ((f5Var.f9702n & 2) != 0) {
                z13 = true;
            }
            tL_messages_requestSimpleWebView.from_side_menu = z13;
            tL_messages_requestSimpleWebView.compact = f5Var.f9703o;
            tL_messages_requestSimpleWebView.fullscreen = f5Var.f9704p;
            if (p5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                tL_messages_requestSimpleWebView.theme_params = tL_dataJSON5;
                tL_dataJSON5.data = p5.toString();
                tL_messages_requestSimpleWebView.flags |= 1;
            }
            if (!TextUtils.isEmpty(f5Var.f9695f)) {
                tL_messages_requestSimpleWebView.flags |= 8;
                tL_messages_requestSimpleWebView.url = f5Var.f9695f;
            }
            if (!TextUtils.isEmpty(f5Var.f9700l)) {
                tL_messages_requestSimpleWebView.start_param = f5Var.f9700l;
                tL_messages_requestSimpleWebView.flags |= 16;
            }
            ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestSimpleWebView, new p2(this, 2));
            return;
        }
        TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
        tL_messages_requestWebView2.peer = MessagesController.getInstance(this.G).getInputPeer(this.I);
        tL_messages_requestWebView2.bot = MessagesController.getInstance(this.G).getInputUser(this.H);
        tL_messages_requestWebView2.platform = "android";
        tL_messages_requestWebView2.compact = f5Var.f9703o;
        tL_messages_requestWebView2.fullscreen = f5Var.f9704p;
        String str = f5Var.f9695f;
        if (str != null) {
            tL_messages_requestWebView2.url = str;
            tL_messages_requestWebView2.flags |= 2;
        }
        if (this.K != 0) {
            TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(this.G).createReplyInput(this.K);
            tL_messages_requestWebView2.reply_to = createReplyInput;
            if (this.L != 0) {
                createReplyInput.monoforum_peer_id = MessagesController.getInstance(this.G).getInputPeer(this.L);
                tL_messages_requestWebView2.reply_to.flags |= 32;
            }
            tL_messages_requestWebView2.flags |= 1;
        } else if (this.L != 0) {
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_requestWebView2.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(this.G).getInputPeer(this.L);
            tL_messages_requestWebView2.flags |= 1;
        }
        if (p5 != null) {
            TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
            tL_messages_requestWebView2.theme_params = tL_dataJSON6;
            tL_dataJSON6.data = p5.toString();
            tL_messages_requestWebView2.flags |= 4;
        }
        ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestWebView2, new p2(this, 3));
        NotificationCenter.getInstance(this.G).addObserver(this, NotificationCenter.webViewResultSent);
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        z(true);
        j3 j3Var = this.f9793e;
        j3Var.setAlpha(0.0f);
        j3Var.addOnLayoutChangeListener(new u2(this, 0));
        super.show();
        this.M0 = false;
        W0.add(this);
    }

    public final void t(final int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        final int i12 = this.Q;
        j6.b(0.35f, -0.1f, i10);
        final c2 c2Var = new c2();
        int i13 = 0;
        if (this.U) {
            i11 = this.Q;
        } else {
            i11 = 0;
        }
        SparseIntArray sparseIntArray = c2Var.f9619a;
        f6 f6Var = this.E;
        c2Var.c(sparseIntArray, i11, f6Var);
        this.U = z10;
        if (i0.a.f(i10) < 0.7210000157356262d) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.S = z12;
        if (this.U) {
            i13 = i10;
        }
        c2Var.c(c2Var.f9620b, i13, f6Var);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(pr.f29493f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int d = i0.a.d(floatValue, i12, i10);
                    k3 k3Var = k3.this;
                    k3Var.Q = d;
                    k3Var.h();
                    j3 j3Var = k3Var.f9793e;
                    j3Var.invalidate();
                    h3 h3Var = k3Var.W;
                    h3Var.setBackgroundColor(k3Var.Q);
                    c2 c2Var2 = c2Var;
                    c2Var2.b(h3Var, floatValue);
                    k3Var.f9786a = c2Var2.a(j6.Ii);
                    j3Var.invalidate();
                }
            });
            duration.addListener(new z2(this, i12, i10, c2Var));
            duration.start();
        } else {
            this.Q = i10;
            h();
            j3 j3Var = this.f9793e;
            j3Var.invalidate();
            int i14 = this.Q;
            h3 h3Var = this.W;
            h3Var.setBackgroundColor(i14);
            c2Var.b(h3Var, 1.0f);
            this.f9786a = c2Var.a(j6.Ii);
            j3Var.invalidate();
        }
        E();
    }

    public final void u(boolean z10) {
        if (this.V0 == z10) {
            return;
        }
        this.V0 = z10;
        if (z10) {
            if (this.C0) {
                Y0++;
            }
        } else if (this.C0) {
            Y0--;
        }
        if (Y0 > 0) {
            AndroidUtilities.lockOrientation(l());
        } else {
            AndroidUtilities.unlockOrientation(l());
        }
    }

    public final void v(int i10, boolean z10) {
        Paint paint = this.P;
        int color = paint.getColor();
        boolean z11 = true;
        this.V = true;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            this.P0 = duration;
            duration.setInterpolator(pr.f29493f);
            this.P0.addUpdateListener(new l2(this, color, i10, 0));
            this.P0.addListener(new v2(this, i10, 0));
            this.P0.start();
            return;
        }
        paint.setColor(i10);
        A();
        this.f9793e.invalidate();
        org.telegram.ui.d3 d3Var = this.U0;
        if (d3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) > 0.721f) {
                z11 = false;
            }
            d3Var.b(z11, false);
            this.U0.setBackgroundColor(paint.getColor());
        }
        F();
    }

    public final void w(boolean z10) {
        if (this.f9820y0 != z10) {
            this.f9820y0 = z10;
            a3 a3Var = this.v;
            if (a3Var != null) {
                a3Var.setFullSize(m());
            }
        }
    }

    public final void x(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        float f7;
        float f10;
        float f11;
        float f12;
        int currentActionBarHeight;
        float f13;
        Point point;
        Object obj;
        if (this.f9792d0 == z10) {
            return;
        }
        this.f9792d0 = z10;
        int i10 = 0;
        if (z12 && !MessagesController.getInstance(this.G).disableBotFullscreenBlur && SharedConfig.getDevicePerformanceClass() >= 2) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f9794e0 = z13;
        ValueAnimator valueAnimator = this.R0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        BotFullscreenButtons botFullscreenButtons = this.m0;
        a3 a3Var = this.v;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setPreview(z10, z11);
            if (this.f9794e0) {
                obj = a3Var.getRenderNode();
            } else {
                obj = null;
            }
            botFullscreenButtons.setParentRenderNode(obj);
        }
        this.f9799i0 = a3Var.getWidth();
        this.f9800j0 = a3Var.getHeight();
        this.Q0 = false;
        g3 g3Var = this.f9802l0;
        b3 b3Var = this.f9817x;
        h3 h3Var = this.W;
        if (z11) {
            D();
            G();
            C();
            if (AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
                int i11 = AndroidUtilities.displaySize.x;
                f10 = (i11 - ((int) (Math.min(i11, point.y) * 0.8f))) / 2.0f;
            } else {
                f10 = 0.0f;
            }
            int i12 = this.h.left;
            if (z10) {
                f11 = i12 + f10;
            } else {
                f11 = (-i12) - f10;
            }
            if (!z10) {
                f10 = -f10;
            }
            if (z10) {
                f12 = a3Var.getTranslationY();
            } else {
                f12 = -AndroidUtilities.dp(24.0f);
            }
            if (z10) {
                currentActionBarHeight = -AndroidUtilities.dp(24.0f);
            } else {
                currentActionBarHeight = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f);
            }
            float f14 = currentActionBarHeight;
            float currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            o1.k kVar = a3Var.v;
            if (kVar != null) {
                kVar.c();
            }
            o1.k kVar2 = a3Var.G;
            if (kVar2 != null) {
                kVar2.c();
            }
            a3Var.setSwipeOffsetAnimationDisallowed(true);
            h3Var.setVisibility(0);
            if (z10) {
                a3Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                a3Var.setTopActionBarOffsetY(currentActionBarHeight2 - AndroidUtilities.dp(24.0f));
            }
            a3Var.c();
            a3Var.invalidate();
            this.f9797g0 = 0.0f;
            if (z10) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            this.f9796f0 = f13;
            h3Var.setAlpha(1.0f - f13);
            h3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f9796f0);
            a3Var.setTranslationY(AndroidUtilities.lerp(f12, f14, this.f9797g0));
            a3Var.setTranslationX(AndroidUtilities.lerp(f11, 0.0f, this.f9797g0));
            g3Var.setTranslationX(AndroidUtilities.lerp(f10, 0.0f, this.f9797g0));
            botFullscreenButtons.setAlpha(this.f9796f0);
            this.f9793e.invalidate();
            b3Var.setViewPortHeightOffset(a3Var.getTranslationY() - f14);
            b3Var.o(false, false);
            this.f9798h0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.R0 = ofFloat;
            float f15 = f11;
            ofFloat.addUpdateListener(new w2(this, z10, f12, f14, f15, f10));
            this.R0.addListener(new x2(this, z10, currentActionBarHeight2, f15));
            this.R0.setDuration(280L);
            this.R0.setInterpolator(pr.h);
            this.R0.start();
            return;
        }
        this.f9798h0 = false;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f9796f0 = f7;
        this.f9797g0 = 0.0f;
        D();
        G();
        if (z10) {
            i10 = 8;
        }
        h3Var.setVisibility(i10);
        h3Var.setAlpha(1.0f - this.f9796f0);
        h3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f9796f0);
        g3Var.setTranslationX(0.0f);
        botFullscreenButtons.setAlpha(this.f9796f0);
        b3Var.setViewPortHeightOffset(0.0f);
        b3Var.o(true, true);
        C();
    }

    public final void y(int i10, boolean z10) {
        int i11 = this.R;
        g3 g3Var = this.f9802l0;
        Paint paint = g3Var.f10098a;
        g3Var.f10101e.f297b = i10;
        paint.setColor(i10);
        if (!z10) {
            g3Var.d.a(i10, true);
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(pr.f29493f);
            duration.addUpdateListener(new l2(this, i11, i10, 1));
            duration.addListener(new y2(this, i11, i10, 0));
            duration.start();
        } else {
            this.R = i10;
            h();
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, this.R, false);
    }

    public final void z(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.O0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.N0;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (Math.abs(f10 - f7) < 0.01f) {
            return;
        }
        float f12 = this.N0;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.O0 = ofFloat;
        ofFloat.addListener(new ah.q0(15, this, z10));
        this.O0.addUpdateListener(new d2(this, 0));
        this.O0.setInterpolator(pr.h);
        this.O0.setDuration(220L);
        this.O0.start();
    }

    @Override
    public final void dismiss() {
        k(false);
    }

    @Override
    public final void setLastVisible(boolean z10) {
    }
}
