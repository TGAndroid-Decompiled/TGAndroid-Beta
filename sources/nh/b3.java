package nh;

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
import h7.z5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import lh.a8;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.su0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ha1;
import org.telegram.ui.lt0;
import org.telegram.ui.rn;

public final class b3 extends Dialog implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.s3 {
    public static final HashSet S0 = new HashSet();
    public static final su0 T0;
    public static int U0;
    public final c6 A;
    public boolean A0;
    public boolean B;
    public boolean B0;
    public int C;
    public float C0;
    public long D;
    public ha1 D0;
    public long E;
    public Drawable E0;
    public long F;
    public final HashMap F0;
    public int G;
    public b70 G0;
    public long H;
    public i0 H0;
    public String I;
    public boolean I0;
    public final Paint J;
    public float J0;
    public final Paint K;
    public ValueAnimator K0;
    public final Paint L;
    public ValueAnimator L0;
    public int M;
    public boolean M0;
    public int N;
    public ValueAnimator N0;
    public boolean O;
    public boolean O0;
    public final Paint P;
    public String P0;
    public boolean Q;
    public org.telegram.ui.h3 Q0;
    public boolean R;
    public boolean R0;
    public final y2 S;
    public final FrameLayout.LayoutParams T;
    public final Drawable U;
    public org.telegram.ui.ActionBar.v0 V;
    public BotFullscreenButtons.OptionsIcon W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    public int f18568a;

    public boolean f18569a0;

    public float f18570b;

    public float f18571b0;

    public o1.j f18572c;

    public float f18573c0;
    public Boolean d;

    public boolean f18574d0;

    public final a3 f18575e;

    public int f18576e0;

    public final Rect f18577f;

    public int f18578f0;

    public Activity f18579g0;
    public final Rect h;

    public final x2 f18580h0;

    public final BotFullscreenButtons f18581i0;

    public ec f18582j0;

    public h0 f18583k0;

    public final FrameLayout f18584l0;
    public final FrameLayout.LayoutParams m0;

    public int f18585n;

    public boolean f18586n0;

    public final dd0 f18587o0;

    public final y1 f18588p0;

    public int f18589q0;

    public final org.telegram.ui.ActionBar.m3 f18590r;

    public q4 f18591r0;

    public final af.h f18592s;

    public boolean f18593s0;

    public boolean f18594t0;

    public boolean f18595u0;
    public final s2 v;

    public Boolean f18596v0;

    public final FrameLayout.LayoutParams f18597w;

    public boolean f18598w0;

    public final t2 f18599x;

    public x0 f18600x0;

    public final z2 f18601y;

    public boolean f18602y0;

    public org.telegram.ui.ActionBar.l3 f18603z0;

    static {
        su0 su0Var = new su0(new ng.a(13), new ng.a(14));
        su0Var.f32580c = 100.0f;
        T0 = su0Var;
        U0 = 0;
    }

    public b3(Context context, c6 c6Var) {
        super(context, R.style.TransparentDialog);
        this.f18570b = 0.0f;
        this.f18577f = new Rect();
        this.h = new Rect();
        this.f18585n = 0;
        Paint paint = new Paint(1);
        this.J = paint;
        Paint paint2 = new Paint();
        this.K = paint2;
        this.L = new Paint(1);
        this.P = new Paint(1);
        this.f18588p0 = new y1(this, 1);
        this.f18589q0 = -1;
        this.f18595u0 = false;
        this.f18596v0 = null;
        this.F0 = new HashMap();
        this.I0 = false;
        this.M0 = true;
        this.R0 = false;
        this.A = c6Var;
        this.f18568a = g6.w0(null, g6.Ii, false);
        s2 s2Var = new s2(this, context, 0);
        this.v = s2Var;
        s2Var.setAllowFullSizeSwipe(true);
        s2Var.setShouldWaitWebViewScroll(true);
        int i10 = g6.f23053d6;
        t2 t2Var = new t2(this, context, c6Var, g6.v0(i10, c6Var));
        this.f18599x = t2Var;
        t2Var.setOnVerifiedAge(this.D0);
        t2Var.setDelegate(new w2(this, context, c6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.M = g6.v0(i10, c6Var);
        int iV0 = g6.v0(g6.f22999a7, c6Var);
        this.N = iV0;
        AndroidUtilities.setNavigationBarColor((Dialog) this, iV0, false);
        a3 a3Var = new a3(this, context);
        this.f18575e = a3Var;
        a3Var.setDelegate(new a2(this, 0));
        FrameLayout.LayoutParams layoutParamsE = z5.e(-1, -1, 49);
        this.f18597w = layoutParamsE;
        a3Var.addView(s2Var, layoutParamsE);
        x2 x2Var = new x2(this, getContext(), c6Var);
        this.f18580h0 = x2Var;
        x2Var.setOnButtonClickListener(new b2(this, 0));
        x2Var.setOnResizeListener(new y1(this, 3));
        a3Var.addView(x2Var, z5.e(-1, -2, 81));
        BotFullscreenButtons botFullscreenButtons = new BotFullscreenButtons(getContext());
        this.f18581i0 = botFullscreenButtons;
        botFullscreenButtons.setAlpha(0.0f);
        botFullscreenButtons.setVisibility(8);
        boolean z10 = !MessagesController.getInstance(this.C).disableBotFullscreenBlur && SharedConfig.getDevicePerformanceClass() >= 2;
        this.f18569a0 = z10;
        botFullscreenButtons.setParentRenderNode(z10 ? s2Var.getRenderNode() : null);
        a3Var.addView(botFullscreenButtons, z5.e(-1, -1, 119));
        botFullscreenButtons.setOnCloseClickListener(new y1(this, 4));
        botFullscreenButtons.setOnCollapseClickListener(new y1(this, 5));
        botFullscreenButtons.setOnMenuClickListener(new y1(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18584l0 = frameLayout;
        FrameLayout.LayoutParams layoutParamsE2 = z5.e(-1, 200, 55);
        this.m0 = layoutParamsE2;
        a3Var.addView(frameLayout, layoutParamsE2);
        this.U = getContext().getDrawable(R.drawable.header_shadow).mutate();
        y2 y2Var = new y2(context, c6Var);
        this.S = y2Var;
        y2Var.setBackgroundColor(0);
        y2Var.setBackButtonImage(R.drawable.ic_close_white);
        A();
        y2Var.setActionBarMenuOnItemClick(new ag.e2(this, 5));
        y2Var.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParamsE3 = z5.e(-1, -2, 49);
        this.T = layoutParamsE3;
        a3Var.addView(y2Var, layoutParamsE3);
        z2 z2Var = new z2(context, c6Var);
        this.f18601y = z2Var;
        a3Var.addView(z2Var, z5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        t2Var.setWebViewProgressListener(new gh.c6(this, 3));
        s2Var.addView(t2Var, z5.c(-1.0f, -1));
        s2Var.setScrollListener(new y1(this, 7));
        s2Var.setScrollEndListener(new y1(this, 8));
        s2Var.setDelegate(new z1(this));
        s2Var.setIsKeyboardVisible(new z1(this));
        dd0 dd0Var = new dd0(context);
        this.f18587o0 = dd0Var;
        a3Var.addView(dd0Var, z5.c(-1.0f, -1));
        setContentView(a3Var, new ViewGroup.LayoutParams(-1, -1));
        D();
        LaunchActivity launchActivity = LaunchActivity.C1;
        org.telegram.ui.ActionBar.m3 m3VarP = launchActivity != null ? launchActivity.P() : null;
        this.f18590r = m3VarP;
        if (m3VarP != null) {
            f0 f0Var = new f0(a3Var, 6);
            y1 y1Var = new y1(this, 2);
            m3VarP.E.add(f0Var);
            m3VarP.F.add(y1Var);
            this.f18592s = new af.h(m3VarP);
        }
    }

    public static void d(b3 b3Var) {
        if (b3Var.I0) {
            return;
        }
        super.dismiss();
        b3Var.I0 = true;
    }

    public static WindowInsets e(b3 b3Var, View view, WindowInsets windowInsets) {
        r0.j1 j1Var = r0.m1.h(view, windowInsets).f46619a;
        i0.c cVarF = j1Var.f(2);
        b3Var.f18577f.set(cVarF.f10489a, cVarF.f10490b, cVarF.f10491c, cVarF.d);
        i0.c cVarF2 = j1Var.f(647);
        Rect rect = b3Var.h;
        rect.set(Math.max(cVarF2.f10489a, windowInsets.getStableInsetLeft()), Math.max(cVarF2.f10490b, windowInsets.getStableInsetTop()), Math.max(cVarF2.f10491c, windowInsets.getStableInsetRight()), Math.max(cVarF2.d, windowInsets.getStableInsetBottom()));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 28) {
            rect.top = Math.max(rect.top, AndroidUtilities.getStatusBarHeight(b3Var.getContext()));
        }
        int i11 = j1Var.f(8).d;
        if (i11 <= rect.bottom || i11 <= AndroidUtilities.dp(20.0f)) {
            b3Var.f18585n = 0;
        } else {
            b3Var.f18585n = i11;
        }
        b3Var.D();
        return i10 >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void j(int i10, long j10, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(i10).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
            i11++;
            TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot2;
            if (tL_attachMenuBot3.bot_id == j10) {
                tL_attachMenuBot = tL_attachMenuBot3;
                break;
            }
        }
        if (tL_attachMenuBot == null) {
            return;
        }
        String string = LocaleController.formatString(R.string.BotRemoveFromMenu, tL_attachMenuBot.short_name);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(LaunchActivity.R().getContext());
        String string2 = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string2;
        b2Var.P = AndroidUtilities.replaceTags(string);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new p1(i10, j10, tL_attachMenuBot, runnable));
        i0.a.w(R.string.Cancel, alertDialog$Builder, null);
    }

    public static JSONObject p(c6 c6Var, final boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int iV = g6.v(-16777216, g6.v0(g6.f23124h5, c6Var));
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    int iV2 = g6.v(iV, ((Integer) obj).intValue());
                    return z10 ? String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(iV2)), Integer.valueOf(Color.green(iV2)), Integer.valueOf(Color.blue(iV2))) : Integer.valueOf(iV2);
                }
            };
            jSONObject.put("bg_color", callbackReturn.run(Integer.valueOf(iV)));
            jSONObject.put("section_bg_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.f23053d6, c6Var))));
            int i10 = g6.f22999a7;
            jSONObject.put("secondary_bg_color", callbackReturn.run(Integer.valueOf(g6.v0(i10, c6Var))));
            jSONObject.put("text_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.G6, c6Var))));
            jSONObject.put("hint_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.H6, c6Var))));
            jSONObject.put("link_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.J6, c6Var))));
            jSONObject.put("button_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.Oh, c6Var))));
            jSONObject.put("button_text_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.Sh, c6Var))));
            jSONObject.put("header_bg_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.f23322s8, c6Var))));
            jSONObject.put("accent_text_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.q6, c6Var))));
            jSONObject.put("section_header_text_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.L6, c6Var))));
            jSONObject.put("subtitle_text_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.f23441z6, c6Var))));
            jSONObject.put("destructive_text_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.f23269p7, c6Var))));
            jSONObject.put("section_separator_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.f23054d7, c6Var))));
            jSONObject.put("bottom_bar_bg_color", callbackReturn.run(Integer.valueOf(g6.v0(i10, c6Var))));
            return jSONObject;
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public final void A() {
        if (!this.Q) {
            int i10 = g6.G6;
            c6 c6Var = this.A;
            int iV0 = g6.v0(i10, c6Var);
            y2 y2Var = this.S;
            y2Var.setTitleColor(iV0);
            y2Var.D(g6.v0(i10, c6Var), false);
            y2Var.C(g6.v0(g6.f23359u8, c6Var), false);
            y2Var.E(g6.v0(g6.G8, c6Var), false);
            y2Var.F(g6.v0(g6.E8, c6Var), false, false);
            y2Var.F(g6.v0(g6.F8, c6Var), true, false);
            y2Var.G(g6.v0(g6.I5, c6Var), false);
        }
        this.f18599x.setFlickerViewColor(this.L.getColor());
    }

    public final void B() {
        ec ecVar;
        boolean z10;
        j0 j0VarC = j0.c(getContext(), this.C, this.D);
        ArrayList arrayList = j0VarC.f18771e;
        i0 i0Var = j0VarC.f18772f;
        boolean z11 = true;
        if (i0Var == null) {
            ec ecVar2 = this.f18582j0;
            if (ecVar2 != null) {
                ecVar2.b();
                this.f18582j0 = null;
            }
        } else if ((!i0Var.c() || i0Var.f18746l) && !i0Var.f18745k) {
            h0 h0Var = this.f18583k0;
            if (h0Var != null) {
                this.H0 = i0Var;
                if (h0Var.c(i0Var)) {
                    this.f18582j0 = null;
                }
            }
        } else {
            if (this.H0 != i0Var && (ecVar = this.f18582j0) != null) {
                ecVar.b();
                this.f18582j0 = null;
            }
            ec ecVar3 = this.f18582j0;
            if (ecVar3 == null || !ecVar3.f28022l) {
                this.H0 = i0Var;
                h0 h0Var2 = new h0(getContext(), this.A);
                this.f18583k0 = h0Var2;
                ec ecVarF = ec.f(this.f18584l0, h0Var2, 5000);
                this.f18582j0 = ecVarF;
                ecVarF.k(true);
            }
            if (this.f18583k0.c(i0Var)) {
                this.f18582j0 = null;
            }
            i0Var.f18745k = false;
            i0Var.f18746l = true;
        }
        C();
        for (Map.Entry entry : this.F0.entrySet()) {
            org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) entry.getValue();
            i0 i0Var2 = (i0) entry.getKey();
            f1Var.setText(i0Var2.f18739c);
            if (i0Var2.c()) {
                Pair pairB = i0Var2.b();
                if (((Long) pairB.second).longValue() > 0) {
                    f1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) pairB.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) pairB.second).longValue()));
                } else {
                    f1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) pairB.first).longValue()));
                }
            } else {
                f1Var.setSubtext(AndroidUtilities.formatFileSize(i0Var2.f18742g));
            }
            if (i0Var2.c()) {
                f1Var.setRightIcon(R.drawable.msg_close);
                f1Var.f22912b.setPadding(0, 0, AndroidUtilities.dp(32.0f), 0);
            } else if (i0Var2.f18743i) {
                f1Var.setVisibility(8);
            } else {
                f1Var.setRightIcon(0);
                f1Var.f22912b.setPadding(0, 0, 0, 0);
            }
            f1Var.setOnClickListener(new x1(0, this, i0Var2));
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = this.W;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = false;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            if (((i0) obj).c()) {
                z10 = true;
                break;
            }
        }
        optionsIcon.setDownloading(z10);
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            if (((i0) obj2).c()) {
                this.f18581i0.setDownloading(z11);
            }
        }
        z11 = false;
        this.f18581i0.setDownloading(z11);
    }

    public final void C() {
        h0 h0Var = this.f18583k0;
        if (h0Var == null) {
            return;
        }
        if (this.Z) {
            h0Var.setArrow(AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(26.0f), this.f18571b0));
        } else if (this.f18570b > 0.5f) {
            h0Var.setArrow(AndroidUtilities.dp(24.0f));
        } else {
            h0Var.setArrow(-1);
        }
    }

    public final void D() {
        BotFullscreenButtons botFullscreenButtons = this.f18581i0;
        Rect rect = this.h;
        botFullscreenButtons.setInsets(rect);
        boolean z10 = this.Z;
        t2 t2Var = this.f18599x;
        a3 a3Var = this.f18575e;
        x2 x2Var = this.f18580h0;
        if (z10) {
            int i10 = (x2Var == null || x2Var.getTotalHeight() <= 0) ? 0 : rect.bottom;
            Rect rect2 = new Rect(rect.left, rect.top, rect.right, (this.f18585n <= i10 && (x2Var == null || x2Var.getTotalHeight() <= 0)) ? rect.bottom : 0);
            int iDp = AndroidUtilities.dp(46.0f);
            t2Var.K(rect2, false);
            t2Var.J(iDp, false);
            a3Var.setPadding(0, 0, 0, Math.max(this.f18585n, i10));
        } else {
            t2Var.K(new Rect(0, 0, 0, 0), false);
            t2Var.J(0, false);
            int i11 = rect.left;
            int i12 = rect.right;
            int i13 = this.f18585n;
            org.telegram.ui.ActionBar.m3 m3Var = this.f18590r;
            a3Var.setPadding(i11, 0, i12, Math.max(i13, (m3Var != null ? m3Var.D : 0) + rect.bottom));
        }
        this.f18597w.topMargin = AndroidUtilities.dp(24.0f);
        boolean z11 = this.Z;
        int i14 = !z11 ? 0 : rect.left;
        FrameLayout.LayoutParams layoutParams = this.T;
        layoutParams.leftMargin = i14;
        layoutParams.rightMargin = 0;
        int i15 = !z11 ? 0 : rect.left;
        FrameLayout.LayoutParams layoutParams2 = this.m0;
        layoutParams2.leftMargin = i15;
        layoutParams2.rightMargin = !z11 ? 0 : rect.right;
        boolean z12 = this.f18574d0;
        s2 s2Var = this.v;
        if (!z12) {
            s2Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.Z) {
                s2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                s2Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f));
            }
            s2Var.setSwipeOffsetAnimationDisallowed(false);
            s2Var.c();
            s2Var.invalidate();
            s2Var.requestLayout();
        }
        if (s2Var != null) {
            s2Var.setFullSize(m());
        }
        x2Var.requestLayout();
        a3Var.requestLayout();
        botFullscreenButtons.setVisibility(this.Z ? 0 : 8);
    }

    public final void E() {
        boolean z10;
        if (this.Q) {
            z10 = !this.O;
        } else {
            z10 = !AndroidUtilities.isTablet() && i0.b.f(g6.w0(null, g6.f23053d6, true)) >= 0.7210000157356262d && this.f18570b >= 0.85f;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            this.d = Boolean.valueOf(z10);
            if (Build.VERSION.SDK_INT >= 23) {
                a3 a3Var = this.f18575e;
                int systemUiVisibility = a3Var.getSystemUiVisibility();
                a3Var.setSystemUiVisibility(z10 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            }
        }
    }

    public final void F() {
        org.telegram.ui.web.w0 webView;
        t2 t2Var = this.f18599x;
        if (t2Var == null || (webView = t2Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.L.getColor());
    }

    public final void G() {
        x2 x2Var;
        try {
            Window window = getWindow();
            if (window == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i10 = Build.VERSION.SDK_INT <= 28 ? 1024 : 512;
            boolean z10 = this.Z;
            if (z10) {
                attributes.flags = i10 | attributes.flags;
            } else {
                attributes.flags = (~i10) & attributes.flags;
            }
            a3 a3Var = this.f18575e;
            if (!z10 || (((x2Var = this.f18580h0) != null && x2Var.getTotalHeight() > 0) || a3Var.f18547t0)) {
                a3Var.setSystemUiVisibility(a3Var.getSystemUiVisibility() & (-3));
            } else {
                a3Var.setSystemUiVisibility(a3Var.getSystemUiVisibility() | 2);
            }
            window.setAttributes(attributes);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.l3 a() {
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3();
        l3Var.f23635o = this.M;
        l3Var.f23634n = this.f18589q0;
        l3Var.f23632l = this.Q;
        l3Var.f23633m = this.R;
        l3Var.f23636p = this.L.getColor();
        l3Var.f23623a = this.f18591r0;
        t2 t2Var = this.f18599x;
        l3Var.f23638r = t2Var != null && t2Var.J;
        l3Var.B = g6.I.q();
        l3Var.v = t2Var != null ? t2Var.getUrlLoaded() : null;
        s2 s2Var = this.v;
        l3Var.h = (s2Var != null && s2Var.getSwipeOffsetY() < 0.0f) || this.f18594t0 || m() || this.Z;
        l3Var.f23643x = this.Z;
        l3Var.f23644y = this.f18569a0;
        Boolean bool = this.f18596v0;
        l3Var.f23645z = bool == null ? this.f18595u0 : bool.booleanValue();
        l3Var.f23629i = s2Var != null ? s2Var.getOffsetY() : Float.MAX_VALUE;
        l3Var.A = this.f18598w0;
        l3Var.f23639s = this.f18593s0;
        l3Var.f23642w = this.f18586n0;
        l3Var.f23640t = this.X;
        l3Var.f23630j = s2Var == null || s2Var.I;
        l3Var.f23641u = this.f18580h0.f18994e;
        l3Var.f23637q = this.N;
        x0 x0Var = this.f18600x0;
        if (x0Var != null) {
            x0Var.b();
        }
        l3Var.I = this.f18600x0;
        org.telegram.ui.web.w0 webView = t2Var != null ? t2Var.getWebView() : null;
        if (webView != null) {
            t2Var.g("preserveWebView");
            t2Var.f44085v0 = true;
            if (t2Var.f44072k0) {
                t2Var.v("visibility_changed", org.telegram.ui.web.z0.x(Boolean.FALSE, "is_visible"));
            }
            l3Var.f23624b = webView;
            l3Var.d = t2Var.getBotProxy();
            l3Var.f23626e = webView.getWidth();
            l3Var.f23627f = webView.getHeight();
            webView.onPause();
        }
        boolean z10 = this.O0;
        l3Var.E = z10;
        if (z10) {
            l3Var.F = this.P0;
        }
        l3Var.J = this.f18602y0;
        this.f18603z0 = l3Var;
        return l3Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.h3 h3Var) {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.webViewResultSent) {
            if (this.F == ((Long) objArr[0]).longValue()) {
                k(false);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.didSetNewTheme) {
            if (i10 == NotificationCenter.botDownloadsUpdate) {
                B();
            }
        } else {
            this.f18575e.invalidate();
            this.f18599x.f44074n.b(g6.v0(g6.f23053d6, this.A), 153);
            A();
            E();
        }
    }

    @Override
    public final void dismiss(boolean z10) {
        k(false);
    }

    public final void g(TL_bots.botAppSettings botappsettings, boolean z10) {
        if (botappsettings == null) {
            return;
        }
        boolean zQ = g6.I.q();
        int i10 = botappsettings.flags;
        boolean z11 = ((zQ ? 4 : 2) & i10) != 0;
        if ((i10 & (zQ ? 16 : 8)) != 0) {
            t((zQ ? botappsettings.header_dark_color : botappsettings.header_color) | (-16777216), true, z10);
        }
        if (z11) {
            v((zQ ? botappsettings.background_dark_color : botappsettings.background_color) | (-16777216), z10);
            y((zQ ? botappsettings.background_dark_color : botappsettings.background_color) | (-16777216), z10);
        }
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        return i0.b.d(this.J0, i10, this.N);
    }

    @Override
    public final org.telegram.ui.ActionBar.t3 mo37getWindowView() {
        return this.f18575e;
    }

    public final void h() {
        LaunchActivity launchActivity;
        if (!this.I0 && (launchActivity = LaunchActivity.C1) != null) {
            launchActivity.H(true, true, true);
        }
        a3 a3Var = this.f18575e;
        if (a3Var != null) {
            a3Var.invalidate();
        }
    }

    public final void i() {
        if (this.Q0 == null) {
            org.telegram.ui.h3 h3Var = new org.telegram.ui.h3(getContext());
            this.Q0 = h3Var;
            this.v.addView(h3Var, z5.c(-1.0f, -1));
            this.Q0.setTranslationY(-1.0f);
            this.Q0.h.setOnClickListener(new g2(this, 0));
            this.Q0.setBackgroundColor(this.L.getColor());
            AndroidUtilities.updateViewVisibilityAnimated(this.Q0, this.O0, 1.0f, false);
        }
    }

    public final void k(boolean z10) {
        LaunchActivity launchActivity;
        if (this.Y) {
            return;
        }
        if (this.D0 != null) {
            z10 = false;
        }
        this.Y = true;
        z(false);
        AndroidUtilities.cancelRunOnUIThread(this.f18588p0);
        NotificationCenter.getInstance(this.C).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getInstance(this.C).removeObserver(this, NotificationCenter.botDownloadsUpdate);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        if (z10 && ((launchActivity = LaunchActivity.C1) == null || launchActivity.f35537u0 == null)) {
            z10 = false;
        }
        if (z10) {
            o1.j jVar = this.f18572c;
            if (jVar != null) {
                jVar.f19147u.f19154i = 0.0f;
                jVar.f();
            }
            LaunchActivity.C1.f35537u0.b(this);
        } else {
            x2 x2Var = this.f18580h0;
            if (x2Var != null) {
                x2Var.animate().translationY(x2Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(er.h).start();
            }
            this.f18599x.h();
            s2 s2Var = this.v;
            int height = s2Var.getHeight() + (x2Var != null ? x2Var.getTotalHeight() : 0);
            Rect rect = this.h;
            s2Var.f(this.f18575e.R() + height + rect.top + rect.bottom + (m() ? AndroidUtilities.dp(200.0f) : 0), true, new y1(this, 0));
        }
        S0.remove(this);
    }

    public final Activity l() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            ownerActivity = LaunchActivity.C1;
        }
        return ownerActivity == null ? AndroidUtilities.findActivity(getContext()) : ownerActivity;
    }

    public final boolean m() {
        if (this.Z) {
            return true;
        }
        Boolean bool = this.f18596v0;
        if (bool == null) {
            return this.f18595u0;
        }
        return bool.booleanValue();
    }

    public final void n() {
        boolean z10;
        if (this.f18591r0 == null) {
            return;
        }
        long jMax = Math.max(0L, 60000 - (System.currentTimeMillis() - this.f18591r0.f18920r));
        String str = null;
        this.f18596v0 = null;
        TLObject tLObject = this.f18591r0.f18919q;
        if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
            TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
            this.F = tL_webViewResultUrl.query_id;
            str = tL_webViewResultUrl.url;
            z10 = tL_webViewResultUrl.same_origin;
            this.f18596v0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
            boolean z11 = this.A0;
            if (!z11) {
                x(tL_webViewResultUrl.fullscreen, !z11, this.f18569a0);
            }
        } else {
            if (tLObject instanceof TLRPC.TL_appWebViewResultUrl) {
                this.F = 0L;
                str = ((TLRPC.TL_appWebViewResultUrl) tLObject).url;
            } else if (tLObject instanceof TLRPC.TL_simpleWebViewResultUrl) {
                this.F = 0L;
                str = ((TLRPC.TL_simpleWebViewResultUrl) tLObject).url;
            }
            z10 = false;
        }
        t2 t2Var = this.f18599x;
        if (z10) {
            t2Var.setTrustedOrigin(str);
        }
        if (str != null && !this.A0) {
            MediaDataController.getInstance(this.C).increaseWebappRating(this.f18591r0.f18907c);
            t2Var.r(this.C, str);
        }
        AndroidUtilities.runOnUIThread(this.f18588p0, jMax);
        s2 s2Var = this.v;
        if (s2Var != null) {
            s2Var.setFullSize(m());
        }
    }

    public final void o(boolean z10) {
        if (this.f18602y0 == z10) {
            return;
        }
        this.f18602y0 = z10;
        if (this.R0) {
            if (z10) {
                U0++;
            } else {
                U0--;
            }
        }
        if (U0 > 0) {
            AndroidUtilities.lockOrientation(l());
        } else {
            AndroidUtilities.unlockOrientation(l());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u(true);
        if (this.f18572c == null) {
            o1.j jVar = new o1.j(this, T0);
            o1.k kVar = new o1.k();
            kVar.b(1200.0f);
            kVar.a(1.0f);
            jVar.f19147u = kVar;
            this.f18572c = jVar;
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f18587o0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else {
            if (this.f18599x.z()) {
                return;
            }
            k(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        x2 x2Var;
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
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        if (this.Z) {
            attributes.flags = i12 | 512;
        } else {
            attributes.flags = i11 & (-515);
        }
        window.setAttributes(attributes);
        if (i10 >= 23) {
            window.setStatusBarColor(0);
        }
        a3 a3Var = this.f18575e;
        a3Var.setFitsSystemWindows(true);
        a3Var.setSystemUiVisibility(1792);
        a3Var.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return b3.e(this.f18663a, view, windowInsets);
            }
        });
        if (!this.Z || ((x2Var = this.f18580h0) != null && x2Var.getTotalHeight() > 0)) {
            a3Var.setSystemUiVisibility(a3Var.getSystemUiVisibility() & (-3));
        } else {
            a3Var.setSystemUiVisibility(a3Var.getSystemUiVisibility() | 2);
        }
        if (i10 >= 26) {
            AndroidUtilities.setLightNavigationBar(this, i0.b.f(this.N) >= 0.7210000157356262d);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getInstance(this.C).addObserver(this, NotificationCenter.botDownloadsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u(false);
        o1.j jVar = this.f18572c;
        if (jVar != null) {
            jVar.c();
            this.f18572c = null;
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
            ((LaunchActivity) context).f35543x0.add(this.f18587o0);
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
            ((LaunchActivity) context).f35543x0.remove(this.f18587o0);
        }
    }

    public final boolean q() {
        if (!this.f18586n0) {
            k(false);
            return true;
        }
        TLRPC.User user = MessagesController.getInstance(this.C).getUser(Long.valueOf(this.D));
        String name = user != null ? ContactsController.formatName(user.first_name, user.last_name) : null;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f22702a.N = name;
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
        alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new z1(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.show();
        ((TextView) b2Var.d(-1)).setTextColor(g6.v0(g6.f23284q7, this.A));
        return false;
    }

    public final void r() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList arrayList;
        TLRPC.User user = MessagesController.getInstance(this.C).getUser(Long.valueOf(this.D));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(this.C).getAttachMenuBots().bots;
        int size = arrayList2.size();
        int i10 = 0;
        do {
            if (i10 >= size) {
                tL_attachMenuBot = null;
                break;
            } else {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList2.get(i10);
                i10++;
                tL_attachMenuBot = tL_attachMenuBot2;
            }
        } while (tL_attachMenuBot.bot_id != this.D);
        b70 b70Var = this.G0;
        if (b70Var != null) {
            b70Var.u();
        }
        b70 b70VarG = b70.G(this.f18575e, this.A, this.Z ? this.f18581i0 : this.V, true);
        this.G0 = b70VarG;
        ArrayList arrayList3 = j0.c(getContext(), this.C, this.D).f18771e;
        HashMap map = this.F0;
        map.clear();
        if (!arrayList3.isEmpty()) {
            b70 b70VarJ = b70VarG.J();
            b70VarJ.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new lt0(b70VarG, 25), false);
            b70VarJ.k();
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList3.get(i11);
                i11++;
                i0 i0Var = (i0) obj;
                String str = i0Var.f18739c;
                ag.l3 l3Var = new ag.l3(19);
                c6 c6Var = b70VarJ.d;
                if (b70VarJ.f26967e == null) {
                    arrayList = arrayList3;
                } else {
                    org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, b70VarJ.f26967e, b70VarJ.d, false, false);
                    arrayList = arrayList3;
                    f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    f1Var.setText(str);
                    f1Var.setSubtext("");
                    Integer num = b70VarJ.f26977j0;
                    int iIntValue = num != null ? num.intValue() : g6.v0(g6.E8, c6Var);
                    Integer num2 = b70VarJ.f26979k0;
                    f1Var.c(iIntValue, num2 != null ? num2.intValue() : g6.v0(g6.F8, c6Var));
                    Integer num3 = b70VarJ.f26981l0;
                    f1Var.setSelectorColor(num3 != null ? num3.intValue() : g6.l1(0.12f, g6.v0(g6.E8, c6Var)));
                    f1Var.setOnClickListener(new org.telegram.ui.Components.f0(b70VarJ, l3Var));
                    int i12 = b70VarJ.S;
                    if (i12 > 0) {
                        f1Var.setMinimumWidth(AndroidUtilities.dp(i12));
                        b70VarJ.r(f1Var, z5.n(b70VarJ.S, -2));
                    } else {
                        b70VarJ.r(f1Var, z5.n(-1, -2));
                    }
                    map.put(i0Var, b70VarJ.y());
                    arrayList3 = arrayList;
                }
                map.put(i0Var, b70VarJ.y());
                arrayList3 = arrayList;
            }
            B();
            b70VarJ.S = AndroidUtilities.dp(180.0f);
            b70VarG.c(R.drawable.menu_download_round, LocaleController.getString(R.string.BotDownloads), new gh.f3(b70VarG, b70VarJ, 1), false);
            b70VarG.k();
        }
        b70VarG.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new y1(this, 9), this.D0 == null);
        b70VarG.l(R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings), new y1(this, 10), this.D0 == null && this.X);
        b70VarG.c(R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage), new y1(this, 11), false);
        b70VarG.l(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new y1(this, 12), this.D0 == null && user != null && user.bot_has_main_app);
        b70VarG.l(R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS), new y1(this, 13), this.D0 == null);
        b70VarG.l(R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot), new y1(this, 14), this.D0 == null);
        b70VarG.l(R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot), new y1(this, 15), this.D0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu));
        if (this.M != g6.w0(null, g6.f23053d6, false)) {
            int i13 = AndroidUtilities.computePerceivedBrightness(this.M) >= 0.721f ? -1 : -15198183;
            int i14 = AndroidUtilities.computePerceivedBrightness(i13) >= 0.721f ? -16777216 : -1;
            int iL1 = g6.l1(0.85f, i14);
            int iL2 = g6.l1(0.1f, i14);
            b70VarG.P(i13);
            for (int i15 = 0; i15 < b70VarG.x(); i15++) {
                View viewW = b70VarG.w(i15);
                if (viewW instanceof org.telegram.ui.ActionBar.f1) {
                    org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) viewW;
                    f1Var2.c(i14, iL1);
                    f1Var2.setSelectorColor(iL2);
                }
            }
        }
        b70VarG.V(5);
        b70VarG.a0(-this.h.right, 0.0f);
        b70VarG.U = true;
        b70VarG.f26993t = false;
        b70VarG.f26992s = 0;
        b70VarG.Z();
    }

    @Override
    public final void release() {
        if (this.I0) {
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        z(false);
    }

    public final void s(org.telegram.ui.ActionBar.n2 n2Var, q4 q4Var) {
        TLRPC.User user;
        org.telegram.ui.ActionBar.z zVarN;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        int size;
        int i10;
        org.telegram.ui.ActionBar.z zVar;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        org.telegram.ui.ActionBar.z zVar2;
        TLRPC.InputPeer inputPeer;
        TLRPC.InputPeer inputPeer2;
        boolean z10;
        TL_bots.botAppSettings botappsettings;
        this.f18591r0 = q4Var;
        int i11 = q4Var.f18905a;
        this.C = i11;
        this.E = q4Var.f18906b;
        this.D = q4Var.f18907c;
        this.G = q4Var.h;
        this.H = q4Var.f18911i;
        this.I = q4Var.f18908e;
        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(this.D));
        CharSequence userName = UserObject.getUserName(user2);
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
            while (true) {
                if (i10 >= size) {
                    zVar = zVarN;
                    tL_attachMenuBot = null;
                    break;
                }
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                i10++;
                tL_attachMenuBot = tL_attachMenuBot2;
                zVar = zVarN;
                if (tL_attachMenuBot.bot_id == this.D) {
                    break;
                } else {
                    zVarN = zVar;
                }
            }
        } catch (Exception unused) {
        }
        y2 y2Var = this.S;
        y2Var.setTitle(userName);
        TLRPC.UserFull userFull = MessagesController.getInstance(this.C).getUserFull(this.D);
        c6 c6Var = this.A;
        if ((user2 != null && user2.verified) || (userFull != null && (user = userFull.user) != null && user.verified)) {
            Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            this.E0 = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.Oh, c6Var), PorterDuff.Mode.SRC_IN));
            this.E0.setAlpha(255);
            y2Var.getTitleTextView().setDrawablePadding(AndroidUtilities.dp(2.0f));
            y2Var.getTitleTextView().i(new lh.v3(this, 2));
        }
        BotFullscreenButtons botFullscreenButtons = this.f18581i0;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setName(UserObject.getUserName(user2), user2 != null && user2.verified);
        }
        zVarN = y2Var.n();
        zVarN.removeAllViews();
        arrayList = MediaDataController.getInstance(this.C).getAttachMenuBots().bots;
        size = arrayList.size();
        i10 = 0;
        if (!this.A0) {
            if (userFull != null) {
                TL_bots.BotInfo botInfo = userFull.bot_info;
                if (botInfo != null && (botappsettings = botInfo.app_settings) != null) {
                    g(botappsettings, false);
                }
                z10 = true;
            } else {
                z10 = true;
                MessagesController.getInstance(this.C).loadFullUser(user2, 0, true, new b2(this, 1));
            }
            if (q4Var.f18918p) {
                x(z10, false, this.f18569a0);
            }
        }
        if (this.D0 == null) {
            zVar2 = zVar;
            zVar2.a(R.id.menu_collapse_bot, R.drawable.arrow_more);
        } else {
            zVar2 = zVar;
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = new BotFullscreenButtons.OptionsIcon(getContext());
        this.W = optionsIcon;
        org.telegram.ui.ActionBar.v0 v0VarD = zVar2.d(0, optionsIcon);
        this.V = v0VarD;
        v0VarD.setOnClickListener(new g2(this, 1));
        y2Var.setActionBarMenuOnItemClick(new l2(this));
        JSONObject jSONObjectP = p(c6Var, false);
        TLRPC.User user3 = MessagesController.getInstance(this.C).getUser(Long.valueOf(this.D));
        t2 t2Var = this.f18599x;
        t2Var.setBotUser(user3);
        t2Var.q(this.C, this.D);
        TLRPC.User user4 = q4Var.f18915m;
        if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu && !MediaDataController.getInstance(this.C).isShortcutAdded(this.D, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
            if (user4 == null) {
                user4 = MessagesController.getInstance(this.C).getUser(Long.valueOf(this.D));
            }
            if (user4 != null && user4.photo != null && !FileLoader.getInstance(this.C).getPathToAttach(user4.photo.photo_small, true).exists()) {
                MediaDataController.getInstance(this.C).preloadImage(ImageLocation.getForUser(this.C, user4, 1), 0);
            }
        }
        if (q4Var.f18919q != null) {
            n();
            return;
        }
        int i12 = q4Var.f18910g;
        if (i12 == 0) {
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = MessagesController.getInstance(this.C).getInputPeer(this.E);
            tL_messages_requestWebView.bot = MessagesController.getInstance(this.C).getInputUser(this.D);
            tL_messages_requestWebView.platform = "android";
            tL_messages_requestWebView.compact = q4Var.f18917o;
            tL_messages_requestWebView.fullscreen = q4Var.f18918p;
            String str = q4Var.f18909f;
            if (str != null) {
                tL_messages_requestWebView.url = str;
                tL_messages_requestWebView.flags |= 2;
            }
            if (this.G != 0) {
                TLRPC.InputReplyTo inputReplyToCreateReplyInput = SendMessagesHelper.getInstance(this.C).createReplyInput(this.G);
                tL_messages_requestWebView.reply_to = inputReplyToCreateReplyInput;
                if (this.H != 0) {
                    inputReplyToCreateReplyInput.monoforum_peer_id = MessagesController.getInstance(this.C).getInputPeer(this.H);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (this.H != 0) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(this.C).getInputPeer(this.H);
                tL_messages_requestWebView.flags |= 1;
            }
            if (jSONObjectP != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = jSONObjectP.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(this.C).sendRequest(tL_messages_requestWebView, new i2(this, 3));
            NotificationCenter.getInstance(this.C).addObserver(this, NotificationCenter.webViewResultSent);
            return;
        }
        if (i12 == 1) {
            TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
            tL_messages_requestSimpleWebView.from_switch_webview = (q4Var.f18916n & 1) != 0;
            tL_messages_requestSimpleWebView.bot = MessagesController.getInstance(this.C).getInputUser(this.D);
            tL_messages_requestSimpleWebView.platform = "android";
            tL_messages_requestSimpleWebView.from_side_menu = (q4Var.f18916n & 2) != 0;
            tL_messages_requestSimpleWebView.compact = q4Var.f18917o;
            tL_messages_requestSimpleWebView.fullscreen = q4Var.f18918p;
            if (jSONObjectP != null) {
                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                tL_dataJSON2.data = jSONObjectP.toString();
                tL_messages_requestSimpleWebView.flags |= 1;
            }
            if (!TextUtils.isEmpty(q4Var.f18909f)) {
                tL_messages_requestSimpleWebView.flags |= 8;
                tL_messages_requestSimpleWebView.url = q4Var.f18909f;
            }
            if (!TextUtils.isEmpty(q4Var.f18914l)) {
                tL_messages_requestSimpleWebView.start_param = q4Var.f18914l;
                tL_messages_requestSimpleWebView.flags |= 16;
            }
            ConnectionsManager.getInstance(this.C).sendRequest(tL_messages_requestSimpleWebView, new i2(this, 2));
            return;
        }
        if (i12 == 2) {
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView2.bot = MessagesController.getInstance(this.C).getInputUser(this.D);
            tL_messages_requestWebView2.peer = MessagesController.getInstance(this.C).getInputPeer(this.D);
            tL_messages_requestWebView2.platform = "android";
            tL_messages_requestWebView2.compact = q4Var.f18917o;
            tL_messages_requestWebView2.fullscreen = q4Var.f18918p;
            tL_messages_requestWebView2.url = q4Var.f18909f;
            tL_messages_requestWebView2.flags |= 2;
            if (jSONObjectP != null) {
                TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                tL_dataJSON3.data = jSONObjectP.toString();
                tL_messages_requestWebView2.flags |= 4;
            }
            ConnectionsManager.getInstance(this.C).sendRequest(tL_messages_requestWebView2, new i2(this, 1));
            NotificationCenter.getInstance(this.C).addObserver(this, NotificationCenter.webViewResultSent);
            return;
        }
        if (i12 == 3) {
            TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
            TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
            TLRPC.BotApp botApp = q4Var.f18912j;
            tL_inputBotAppID.f22438id = botApp.f22377id;
            tL_inputBotAppID.access_hash = botApp.access_hash;
            tL_messages_requestAppWebView.app = tL_inputBotAppID;
            tL_messages_requestAppWebView.write_allowed = q4Var.f18913k;
            tL_messages_requestAppWebView.platform = "android";
            if (n2Var instanceof rn) {
                rn rnVar = (rn) n2Var;
                inputPeer = rnVar.i() != null ? MessagesController.getInputPeer(rnVar.i()) : MessagesController.getInputPeer(rnVar.f42026e);
            } else {
                inputPeer = MessagesController.getInputPeer(q4Var.f18915m);
            }
            tL_messages_requestAppWebView.peer = inputPeer;
            tL_messages_requestAppWebView.compact = q4Var.f18917o;
            tL_messages_requestAppWebView.fullscreen = q4Var.f18918p;
            if (!TextUtils.isEmpty(q4Var.f18914l)) {
                tL_messages_requestAppWebView.start_param = q4Var.f18914l;
                tL_messages_requestAppWebView.flags |= 2;
            }
            if (jSONObjectP != null) {
                TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                tL_messages_requestAppWebView.theme_params = tL_dataJSON4;
                tL_dataJSON4.data = jSONObjectP.toString();
                tL_messages_requestAppWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(this.C).sendRequest(tL_messages_requestAppWebView, new i2(this, 4), 66);
            return;
        }
        if (i12 != 4) {
            if (i12 != 5) {
                return;
            }
            TLRPC.TL_messages_requestChatJoinWebView tL_messages_requestChatJoinWebView = new TLRPC.TL_messages_requestChatJoinWebView();
            tL_messages_requestChatJoinWebView.platform = "android";
            tL_messages_requestChatJoinWebView.query_id = q4Var.d;
            if (jSONObjectP != null) {
                TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON5;
                tL_dataJSON5.data = jSONObjectP.toString();
            }
            ConnectionsManager.getInstance(this.C).sendRequestTyped(tL_messages_requestChatJoinWebView, new org.telegram.messenger.a(), new a8(this, 9), 66);
            return;
        }
        TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
        tL_messages_requestMainWebView.bot = MessagesController.getInstance(this.C).getInputUser(q4Var.f18907c);
        tL_messages_requestMainWebView.platform = "android";
        if (n2Var instanceof rn) {
            rn rnVar2 = (rn) n2Var;
            inputPeer2 = rnVar2.i() != null ? MessagesController.getInputPeer(rnVar2.i()) : MessagesController.getInputPeer(rnVar2.f42026e);
        } else {
            inputPeer2 = MessagesController.getInstance(this.C).getInputPeer(q4Var.f18906b);
        }
        tL_messages_requestMainWebView.peer = inputPeer2;
        tL_messages_requestMainWebView.compact = q4Var.f18917o;
        tL_messages_requestMainWebView.fullscreen = q4Var.f18918p;
        if (!TextUtils.isEmpty(q4Var.f18914l)) {
            tL_messages_requestMainWebView.start_param = q4Var.f18914l;
            tL_messages_requestMainWebView.flags |= 2;
        }
        if (jSONObjectP != null) {
            TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
            tL_messages_requestMainWebView.theme_params = tL_dataJSON6;
            tL_dataJSON6.data = jSONObjectP.toString();
            tL_messages_requestMainWebView.flags |= 1;
        }
        ConnectionsManager.getInstance(this.C).sendRequest(tL_messages_requestMainWebView, new i2(this, 5), 66);
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            z(true);
            a3 a3Var = this.f18575e;
            a3Var.setAlpha(0.0f);
            a3Var.addOnLayoutChangeListener(new m.t2(this, 1));
            super.show();
            this.I0 = false;
            S0.add(this);
        }
    }

    public final void t(final int i10, boolean z10, boolean z11) {
        final int i11 = this.M;
        g6.b(0.35f, -0.1f, i10);
        final v1 v1Var = new v1();
        int i12 = this.Q ? this.M : 0;
        SparseIntArray sparseIntArray = v1Var.f19001a;
        c6 c6Var = this.A;
        v1Var.c(sparseIntArray, i12, c6Var);
        this.Q = z10;
        this.O = i0.b.f(i10) < 0.7210000157356262d;
        v1Var.c(v1Var.f19002b, this.Q ? i10 : 0, c6Var);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(er.f28122f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int iD = i0.b.d(fFloatValue, i11, i10);
                    b3 b3Var = this.f18719a;
                    b3Var.M = iD;
                    b3Var.h();
                    a3 a3Var = b3Var.f18575e;
                    a3Var.invalidate();
                    y2 y2Var = b3Var.S;
                    y2Var.setBackgroundColor(b3Var.M);
                    v1 v1Var2 = v1Var;
                    v1Var2.b(y2Var, fFloatValue);
                    b3Var.f18568a = v1Var2.a(g6.Ii);
                    a3Var.invalidate();
                }
            });
            duration.addListener(new r2(this, i11, i10, v1Var));
            duration.start();
        } else {
            this.M = i10;
            h();
            a3 a3Var = this.f18575e;
            a3Var.invalidate();
            int i13 = this.M;
            y2 y2Var = this.S;
            y2Var.setBackgroundColor(i13);
            v1Var.b(y2Var, 1.0f);
            this.f18568a = v1Var.a(g6.Ii);
            a3Var.invalidate();
        }
        E();
    }

    public final void u(boolean z10) {
        if (this.R0 == z10) {
            return;
        }
        this.R0 = z10;
        if (z10) {
            if (this.f18602y0) {
                U0++;
            }
        } else if (this.f18602y0) {
            U0--;
        }
        if (U0 > 0) {
            AndroidUtilities.lockOrientation(l());
        } else {
            AndroidUtilities.unlockOrientation(l());
        }
    }

    public final void v(int i10, boolean z10) {
        Paint paint = this.L;
        int color = paint.getColor();
        this.R = true;
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i11 = 0;
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            this.L0 = duration;
            duration.setInterpolator(er.f28122f);
            this.L0.addUpdateListener(new f2(this, color, i10, i11));
            this.L0.addListener(new n2(this, i10, i11));
            this.L0.start();
            return;
        }
        paint.setColor(i10);
        A();
        this.f18575e.invalidate();
        org.telegram.ui.h3 h3Var = this.Q0;
        if (h3Var != null) {
            h3Var.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
            this.Q0.setBackgroundColor(paint.getColor());
        }
        F();
    }

    public final void w(boolean z10) {
        if (this.f18595u0 != z10) {
            this.f18595u0 = z10;
            s2 s2Var = this.v;
            if (s2Var != null) {
                s2Var.setFullSize(m());
            }
        }
    }

    public final void x(boolean z10, boolean z11, boolean z12) {
        float fMin;
        if (this.Z == z10) {
            return;
        }
        this.Z = z10;
        this.f18569a0 = z12 && !MessagesController.getInstance(this.C).disableBotFullscreenBlur && SharedConfig.getDevicePerformanceClass() >= 2;
        ValueAnimator valueAnimator = this.N0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        BotFullscreenButtons botFullscreenButtons = this.f18581i0;
        s2 s2Var = this.v;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setPreview(z10, z11);
            botFullscreenButtons.setParentRenderNode(this.f18569a0 ? s2Var.getRenderNode() : null);
        }
        this.f18576e0 = s2Var.getWidth();
        this.f18578f0 = s2Var.getHeight();
        this.M0 = false;
        x2 x2Var = this.f18580h0;
        t2 t2Var = this.f18599x;
        y2 y2Var = this.S;
        if (!z11) {
            this.f18574d0 = false;
            this.f18571b0 = z10 ? 1.0f : 0.0f;
            this.f18573c0 = 0.0f;
            D();
            G();
            y2Var.setVisibility(z10 ? 8 : 0);
            y2Var.setAlpha(1.0f - this.f18571b0);
            y2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f18571b0);
            x2Var.setTranslationX(0.0f);
            botFullscreenButtons.setAlpha(this.f18571b0);
            t2Var.setViewPortHeightOffset(0.0f);
            t2Var.n(true, true);
            C();
            return;
        }
        D();
        G();
        C();
        if (!AndroidUtilities.isTablet() || AndroidUtilities.isInMultiwindow || AndroidUtilities.isSmallTablet()) {
            fMin = 0.0f;
        } else {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            fMin = (i10 - ((int) (Math.min(i10, point.y) * 0.8f))) / 2.0f;
        }
        int i11 = this.h.left;
        float f10 = z10 ? i11 + fMin : (-i11) - fMin;
        if (!z10) {
            fMin = -fMin;
        }
        float translationY = z10 ? s2Var.getTranslationY() : -AndroidUtilities.dp(24.0f);
        float currentActionBarHeight = z10 ? -AndroidUtilities.dp(24.0f) : (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f);
        float currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        o1.j jVar = s2Var.v;
        if (jVar != null) {
            jVar.c();
        }
        o1.j jVar2 = s2Var.C;
        if (jVar2 != null) {
            jVar2.c();
        }
        s2Var.setSwipeOffsetAnimationDisallowed(true);
        y2Var.setVisibility(0);
        if (z10) {
            s2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
        } else {
            s2Var.setTopActionBarOffsetY(currentActionBarHeight2 - AndroidUtilities.dp(24.0f));
        }
        s2Var.c();
        s2Var.invalidate();
        this.f18573c0 = 0.0f;
        float f11 = z10 ? 0.0f : 1.0f;
        this.f18571b0 = f11;
        y2Var.setAlpha(1.0f - f11);
        y2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f18571b0);
        s2Var.setTranslationY(AndroidUtilities.lerp(translationY, currentActionBarHeight, this.f18573c0));
        s2Var.setTranslationX(AndroidUtilities.lerp(f10, 0.0f, this.f18573c0));
        x2Var.setTranslationX(AndroidUtilities.lerp(fMin, 0.0f, this.f18573c0));
        botFullscreenButtons.setAlpha(this.f18571b0);
        this.f18575e.invalidate();
        t2Var.setViewPortHeightOffset(s2Var.getTranslationY() - currentActionBarHeight);
        t2Var.n(false, false);
        this.f18574d0 = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.N0 = valueAnimatorOfFloat;
        float f12 = f10;
        valueAnimatorOfFloat.addUpdateListener(new o2(this, z10, translationY, currentActionBarHeight, f12, fMin));
        this.N0.addListener(new p2(this, z10, currentActionBarHeight2, f12));
        this.N0.setDuration(280L);
        this.N0.setInterpolator(er.h);
        this.N0.start();
    }

    public final void y(int i10, boolean z10) {
        int i11 = this.N;
        x2 x2Var = this.f18580h0;
        Paint paint = x2Var.f18991a;
        x2Var.f18994e.f2034c = i10;
        paint.setColor(i10);
        int i12 = 1;
        if (!z10) {
            x2Var.d.a(i10, true);
        }
        int i13 = 0;
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(er.f28122f);
            duration.addUpdateListener(new f2(this, i11, i10, i12));
            duration.addListener(new q2(this, i11, i10, i13));
            duration.start();
        } else {
            this.N = i10;
            h();
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, this.N, false);
    }

    public final void z(boolean z10) {
        ValueAnimator valueAnimator = this.K0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (Math.abs(this.J0 - (z10 ? 1.0f : 0.0f)) < 0.01f) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.J0, z10 ? 1.0f : 0.0f);
        this.K0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addListener(new ag.x(17, this, z10));
        this.K0.addUpdateListener(new w1(this, 0));
        this.K0.setInterpolator(er.h);
        this.K0.setDuration(220L);
        this.K0.start();
    }

    @Override
    public final void dismiss() {
        k(false);
    }

    @Override
    public final void setLastVisible(boolean z10) {
    }
}
