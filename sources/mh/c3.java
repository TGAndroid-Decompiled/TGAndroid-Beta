package mh;

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
import fh.k6;
import fh.w4;
import g7.e6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import kh.b8;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ja1;
import org.telegram.ui.kt0;
import org.telegram.ui.qn;
public final class c3 extends Dialog implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.s3 {
    public static final HashSet S0 = new HashSet();
    public static final pu0 T0;
    public static int U0;
    public final b6 A;
    public boolean A0;
    public boolean B;
    public boolean B0;
    public int C;
    public float C0;
    public long D;
    public ja1 D0;
    public long E;
    public Drawable E0;
    public long F;
    public final HashMap F0;
    public int G;
    public x60 G0;
    public long H;
    public j0 H0;
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
    public org.telegram.ui.g3 Q0;
    public boolean R;
    public boolean R0;
    public final z2 S;
    public final FrameLayout.LayoutParams T;
    public final Drawable U;
    public org.telegram.ui.ActionBar.w0 V;
    public BotFullscreenButtons.OptionsIcon W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public int f17747a;
    public boolean f17748a0;
    public float f17749b;
    public float f17750b0;
    public o1.j f17751c;
    public float f17752c0;
    public Boolean d;
    public boolean f17753d0;
    public final b3 f17754e;
    public int f17755e0;
    public final Rect f17756f;
    public int f17757f0;
    public Activity f17758g0;
    public final Rect h;
    public final y2 f17759h0;
    public final BotFullscreenButtons f17760i0;
    public gc f17761j0;
    public i0 f17762k0;
    public final FrameLayout f17763l0;
    public final FrameLayout.LayoutParams m0;
    public int f17764n;
    public boolean f17765n0;
    public final yc0 f17766o0;
    public final y1 f17767p0;
    public int f17768q0;
    public final org.telegram.ui.ActionBar.m3 f17769r;
    public s4 f17770r0;
    public final b3.b f17771s;
    public boolean f17772s0;
    public boolean f17773t0;
    public boolean f17774u0;
    public final t2 v;
    public Boolean f17775v0;
    public final FrameLayout.LayoutParams f17776w;
    public boolean f17777w0;
    public final u2 f17778x;
    public y0 f17779x0;
    public final a3 f17780y;
    public boolean f17781y0;
    public org.telegram.ui.ActionBar.l3 f17782z0;

    static {
        pu0 pu0Var = new pu0(new mg.b(6), new mg.b(7));
        pu0Var.f31764c = 100.0f;
        T0 = pu0Var;
        U0 = 0;
    }

    public c3(Context context, b6 b6Var) {
        super(context, R.style.TransparentDialog);
        Object obj;
        this.f17749b = 0.0f;
        this.f17756f = new Rect();
        this.h = new Rect();
        this.f17764n = 0;
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.J = paint;
        Paint paint2 = new Paint();
        this.K = paint2;
        this.L = new Paint(1);
        this.P = new Paint(1);
        this.f17767p0 = new y1(this, 1);
        this.f17768q0 = -1;
        this.f17774u0 = false;
        this.f17775v0 = null;
        this.F0 = new HashMap();
        this.I0 = false;
        this.M0 = true;
        this.R0 = false;
        this.A = b6Var;
        this.f17747a = f6.w0(null, f6.Ii, false);
        t2 t2Var = new t2(this, context, 0);
        this.v = t2Var;
        t2Var.setAllowFullSizeSwipe(true);
        t2Var.setShouldWaitWebViewScroll(true);
        int i9 = f6.f23001d6;
        u2 u2Var = new u2(this, context, b6Var, f6.v0(i9, b6Var));
        this.f17778x = u2Var;
        u2Var.setOnVerifiedAge(this.D0);
        u2Var.setDelegate(new x2(this, context, b6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.M = f6.v0(i9, b6Var);
        int v02 = f6.v0(f6.f22947a7, b6Var);
        this.N = v02;
        AndroidUtilities.setNavigationBarColor((Dialog) this, v02, false);
        b3 b3Var = new b3(this, context);
        this.f17754e = b3Var;
        b3Var.setDelegate(new a2(this, 0));
        FrameLayout.LayoutParams e10 = e6.e(-1, -1, 49);
        this.f17776w = e10;
        b3Var.addView(t2Var, e10);
        y2 y2Var = new y2(this, getContext(), b6Var);
        this.f17759h0 = y2Var;
        y2Var.setOnButtonClickListener(new b2(this, 0));
        y2Var.setOnResizeListener(new y1(this, 3));
        b3Var.addView(y2Var, e6.e(-1, -2, 81));
        BotFullscreenButtons botFullscreenButtons = new BotFullscreenButtons(getContext());
        this.f17760i0 = botFullscreenButtons;
        botFullscreenButtons.setAlpha(0.0f);
        botFullscreenButtons.setVisibility(8);
        z10 = (MessagesController.getInstance(this.C).disableBotFullscreenBlur || SharedConfig.getDevicePerformanceClass() < 2) ? false : false;
        this.f17748a0 = z10;
        if (z10) {
            obj = t2Var.getRenderNode();
        } else {
            obj = null;
        }
        botFullscreenButtons.setParentRenderNode(obj);
        b3Var.addView(botFullscreenButtons, e6.e(-1, -1, 119));
        botFullscreenButtons.setOnCloseClickListener(new y1(this, 4));
        botFullscreenButtons.setOnCollapseClickListener(new y1(this, 5));
        botFullscreenButtons.setOnMenuClickListener(new y1(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17763l0 = frameLayout;
        FrameLayout.LayoutParams e11 = e6.e(-1, 200, 55);
        this.m0 = e11;
        b3Var.addView(frameLayout, e11);
        this.U = getContext().getDrawable(R.drawable.header_shadow).mutate();
        ?? kVar = new org.telegram.ui.ActionBar.k(context, b6Var);
        this.S = kVar;
        kVar.setBackgroundColor(0);
        kVar.setBackButtonImage(R.drawable.ic_close_white);
        A();
        kVar.setActionBarMenuOnItemClick(new w4(this, 4));
        kVar.setAlpha(0.0f);
        FrameLayout.LayoutParams e12 = e6.e(-1, -2, 49);
        this.T = e12;
        b3Var.addView((View) kVar, e12);
        ?? a4Var = new a4(context, b6Var);
        this.f17780y = a4Var;
        b3Var.addView((View) a4Var, e6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        u2Var.setWebViewProgressListener(new k6(this, 3));
        t2Var.addView(u2Var, e6.c(-1.0f, -1));
        t2Var.setScrollListener(new y1(this, 7));
        t2Var.setScrollEndListener(new y1(this, 8));
        t2Var.setDelegate(new z1(this));
        t2Var.setIsKeyboardVisible(new z1(this));
        yc0 yc0Var = new yc0(context);
        this.f17766o0 = yc0Var;
        b3Var.addView(yc0Var, e6.c(-1.0f, -1));
        setContentView(b3Var, new ViewGroup.LayoutParams(-1, -1));
        D();
        LaunchActivity launchActivity = LaunchActivity.C1;
        org.telegram.ui.ActionBar.m3 P = launchActivity != null ? launchActivity.P() : null;
        this.f17769r = P;
        if (P != null) {
            kh.f1 f1Var = new kh.f1(b3Var, 29);
            y1 y1Var = new y1(this, 2);
            P.E.add(f1Var);
            P.F.add(y1Var);
            this.f17771s = new b3.b(P);
        }
    }

    public static void d(c3 c3Var) {
        if (!c3Var.I0) {
            super.dismiss();
            c3Var.I0 = true;
        }
    }

    public static WindowInsets e(c3 c3Var, View view, WindowInsets windowInsets) {
        r0.j1 j1Var = r0.m1.h(view, windowInsets).f46929a;
        i0.b f10 = j1Var.f(2);
        c3Var.f17756f.set(f10.f10848a, f10.f10849b, f10.f10850c, f10.d);
        i0.b f11 = j1Var.f(647);
        Rect rect = c3Var.h;
        rect.set(Math.max(f11.f10848a, windowInsets.getStableInsetLeft()), Math.max(f11.f10849b, windowInsets.getStableInsetTop()), Math.max(f11.f10850c, windowInsets.getStableInsetRight()), Math.max(f11.d, windowInsets.getStableInsetBottom()));
        int i9 = Build.VERSION.SDK_INT;
        if (i9 <= 28) {
            rect.top = Math.max(rect.top, AndroidUtilities.getStatusBarHeight(c3Var.getContext()));
        }
        int i10 = j1Var.f(8).d;
        if (i10 > rect.bottom && i10 > AndroidUtilities.dp(20.0f)) {
            c3Var.f17764n = i10;
        } else {
            c3Var.f17764n = 0;
        }
        c3Var.D();
        if (i9 >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void j(int i9, long j10, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(i9).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                i10++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot2;
                if (tL_attachMenuBot3.bot_id == j10) {
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
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new q1(i9, j10, tL_attachMenuBot, runnable));
        j3.r0.v(R.string.Cancel, alertDialog$Builder, null);
    }

    public static JSONObject p(b6 b6Var, final boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int v = f6.v(-16777216, f6.v0(f6.f23072h5, b6Var));
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    int v4 = f6.v(v, ((Integer) obj).intValue());
                    Integer valueOf = Integer.valueOf(v4);
                    if (z10) {
                        return String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(v4)), Integer.valueOf(Color.green(v4)), Integer.valueOf(Color.blue(v4)));
                    }
                    return valueOf;
                }
            };
            jSONObject.put("bg_color", callbackReturn.run(Integer.valueOf(v)));
            jSONObject.put("section_bg_color", callbackReturn.run(Integer.valueOf(f6.v0(f6.f23001d6, b6Var))));
            int i9 = f6.f22947a7;
            jSONObject.put("secondary_bg_color", callbackReturn.run(Integer.valueOf(f6.v0(i9, b6Var))));
            jSONObject.put("text_color", callbackReturn.run(Integer.valueOf(f6.v0(f6.G6, b6Var))));
            jSONObject.put("hint_color", callbackReturn.run(Integer.valueOf(f6.v0(f6.H6, b6Var))));
            jSONObject.put("link_color", callbackReturn.run(Integer.valueOf(f6.v0(f6.J6, b6Var))));
            jSONObject.put("button_color", callbackReturn.run(Integer.valueOf(f6.v0(f6.Oh, b6Var))));
            jSONObject.put("button_text_color", callbackReturn.run(Integer.valueOf(f6.v0(f6.Sh, b6Var))));
            jSONObject.put("header_bg_color", callbackReturn.run(Integer.valueOf(f6.v0(f6.f23269s8, b6Var))));
            jSONObject.put("accent_text_color", callbackReturn.run(Integer.valueOf(f6.v0(f6.f23229q6, b6Var))));
            jSONObject.put("section_header_text_color", callbackReturn.run(Integer.valueOf(f6.v0(f6.L6, b6Var))));
            jSONObject.put("subtitle_text_color", callbackReturn.run(Integer.valueOf(f6.v0(f6.f23386z6, b6Var))));
            jSONObject.put("destructive_text_color", callbackReturn.run(Integer.valueOf(f6.v0(f6.f23212p7, b6Var))));
            jSONObject.put("section_separator_color", callbackReturn.run(Integer.valueOf(f6.v0(f6.f23002d7, b6Var))));
            jSONObject.put("bottom_bar_bg_color", callbackReturn.run(Integer.valueOf(f6.v0(i9, b6Var))));
            return jSONObject;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public final void A() {
        if (!this.Q) {
            int i9 = f6.G6;
            b6 b6Var = this.A;
            int v02 = f6.v0(i9, b6Var);
            z2 z2Var = this.S;
            z2Var.setTitleColor(v02);
            z2Var.C(f6.v0(i9, b6Var), false);
            z2Var.A(f6.v0(f6.f23305u8, b6Var), false);
            z2Var.D(f6.v0(f6.G8, b6Var), false);
            z2Var.E(f6.v0(f6.E8, b6Var), false, false);
            z2Var.E(f6.v0(f6.F8, b6Var), true, false);
            z2Var.F(f6.v0(f6.I5, b6Var), false);
        }
        this.f17778x.setFlickerViewColor(this.L.getColor());
    }

    public final void B() {
        gc gcVar;
        boolean z10;
        k0 c10 = k0.c(getContext(), this.C, this.D);
        ArrayList arrayList = c10.f17948e;
        j0 j0Var = c10.f17949f;
        boolean z11 = true;
        if (j0Var == null) {
            gc gcVar2 = this.f17761j0;
            if (gcVar2 != null) {
                gcVar2.b();
                this.f17761j0 = null;
            }
        } else if ((j0Var.c() && !j0Var.f17923l) || j0Var.f17922k) {
            if (this.H0 != j0Var && (gcVar = this.f17761j0) != null) {
                gcVar.b();
                this.f17761j0 = null;
            }
            gc gcVar3 = this.f17761j0;
            if (gcVar3 == null || !gcVar3.f28739l) {
                this.H0 = j0Var;
                i0 i0Var = new i0(getContext(), this.A);
                this.f17762k0 = i0Var;
                gc f10 = gc.f(this.f17763l0, i0Var, 5000);
                this.f17761j0 = f10;
                f10.k(true);
            }
            if (this.f17762k0.c(j0Var)) {
                this.f17761j0 = null;
            }
            j0Var.f17922k = false;
            j0Var.f17923l = true;
        } else {
            i0 i0Var2 = this.f17762k0;
            if (i0Var2 != null) {
                this.H0 = j0Var;
                if (i0Var2.c(j0Var)) {
                    this.f17761j0 = null;
                }
            }
        }
        C();
        for (Map.Entry entry : this.F0.entrySet()) {
            org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) entry.getValue();
            j0 j0Var2 = (j0) entry.getKey();
            g1Var.setText(j0Var2.f17916c);
            if (!j0Var2.c()) {
                g1Var.setSubtext(AndroidUtilities.formatFileSize(j0Var2.f17919g));
            } else {
                Pair b10 = j0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    g1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) b10.second).longValue()));
                } else {
                    g1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()));
                }
            }
            if (j0Var2.c()) {
                g1Var.setRightIcon(R.drawable.msg_close);
                g1Var.f23404b.setPadding(0, 0, AndroidUtilities.dp(32.0f), 0);
            } else if (j0Var2.f17920i) {
                g1Var.setVisibility(8);
            } else {
                g1Var.setRightIcon(0);
                g1Var.f23404b.setPadding(0, 0, 0, 0);
            }
            g1Var.setOnClickListener(new bg.u1(29, this, j0Var2));
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = this.W;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                if (((j0) obj).c()) {
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
        int i10 = 0;
        while (true) {
            if (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                if (((j0) obj2).c()) {
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        this.f17760i0.setDownloading(z11);
    }

    public final void C() {
        i0 i0Var = this.f17762k0;
        if (i0Var == null) {
            return;
        }
        if (this.Z) {
            i0Var.setArrow(AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(26.0f), this.f17750b0));
        } else if (this.f17749b > 0.5f) {
            i0Var.setArrow(AndroidUtilities.dp(24.0f));
        } else {
            i0Var.setArrow(-1);
        }
    }

    public final void D() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        BotFullscreenButtons botFullscreenButtons = this.f17760i0;
        Rect rect = this.h;
        botFullscreenButtons.setInsets(rect);
        boolean z10 = this.Z;
        u2 u2Var = this.f17778x;
        b3 b3Var = this.f17754e;
        y2 y2Var = this.f17759h0;
        int i15 = 0;
        if (z10) {
            if (y2Var != null && y2Var.getTotalHeight() > 0) {
                i13 = rect.bottom;
            } else {
                i13 = 0;
            }
            int i16 = rect.left;
            int i17 = rect.top;
            int i18 = rect.right;
            if (this.f17764n > i13 || (y2Var != null && y2Var.getTotalHeight() > 0)) {
                i14 = 0;
            } else {
                i14 = rect.bottom;
            }
            Rect rect2 = new Rect(i16, i17, i18, i14);
            int dp = AndroidUtilities.dp(46.0f);
            u2Var.K(rect2, false);
            u2Var.J(dp, false);
            b3Var.setPadding(0, 0, 0, Math.max(this.f17764n, i13));
        } else {
            u2Var.K(new Rect(0, 0, 0, 0), false);
            u2Var.J(0, false);
            int i19 = rect.left;
            int i20 = rect.right;
            int i21 = this.f17764n;
            org.telegram.ui.ActionBar.m3 m3Var = this.f17769r;
            if (m3Var != null) {
                i9 = m3Var.D;
            } else {
                i9 = 0;
            }
            b3Var.setPadding(i19, 0, i20, Math.max(i21, i9 + rect.bottom));
        }
        this.f17776w.topMargin = AndroidUtilities.dp(24.0f);
        boolean z11 = this.Z;
        if (!z11) {
            i10 = 0;
        } else {
            i10 = rect.left;
        }
        FrameLayout.LayoutParams layoutParams = this.T;
        layoutParams.leftMargin = i10;
        layoutParams.rightMargin = 0;
        if (!z11) {
            i11 = 0;
        } else {
            i11 = rect.left;
        }
        FrameLayout.LayoutParams layoutParams2 = this.m0;
        layoutParams2.leftMargin = i11;
        if (!z11) {
            i12 = 0;
        } else {
            i12 = rect.right;
        }
        layoutParams2.rightMargin = i12;
        boolean z12 = this.f17753d0;
        t2 t2Var = this.v;
        if (!z12) {
            t2Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.Z) {
                t2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                t2Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f));
            }
            t2Var.setSwipeOffsetAnimationDisallowed(false);
            t2Var.c();
            t2Var.invalidate();
            t2Var.requestLayout();
        }
        if (t2Var != null) {
            t2Var.setFullSize(m());
        }
        y2Var.requestLayout();
        b3Var.requestLayout();
        if (!this.Z) {
            i15 = 8;
        }
        botFullscreenButtons.setVisibility(i15);
    }

    public final void E() {
        boolean z10;
        int i9;
        boolean z11 = true;
        if (this.Q) {
            z10 = !this.O;
        } else {
            z10 = (AndroidUtilities.isTablet() || i0.a.f(f6.w0(null, f6.f23001d6, true)) < 0.7210000157356262d || this.f17749b < 0.85f) ? false : false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            this.d = Boolean.valueOf(z10);
            if (Build.VERSION.SDK_INT >= 23) {
                b3 b3Var = this.f17754e;
                int systemUiVisibility = b3Var.getSystemUiVisibility();
                if (z10) {
                    i9 = systemUiVisibility | 8192;
                } else {
                    i9 = systemUiVisibility & (-8193);
                }
                b3Var.setSystemUiVisibility(i9);
            }
        }
    }

    public final void F() {
        org.telegram.ui.web.v0 webView;
        u2 u2Var = this.f17778x;
        if (u2Var == null || (webView = u2Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.L.getColor());
    }

    public final void G() {
        int i9;
        y2 y2Var;
        try {
            Window window = getWindow();
            if (window == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (Build.VERSION.SDK_INT <= 28) {
                i9 = 1024;
            } else {
                i9 = 512;
            }
            boolean z10 = this.Z;
            if (z10) {
                attributes.flags = i9 | attributes.flags;
            } else {
                attributes.flags = (~i9) & attributes.flags;
            }
            b3 b3Var = this.f17754e;
            if (z10 && (((y2Var = this.f17759h0) == null || y2Var.getTotalHeight() <= 0) && !b3Var.f17718t0)) {
                b3Var.setSystemUiVisibility(b3Var.getSystemUiVisibility() | 2);
            } else {
                b3Var.setSystemUiVisibility(b3Var.getSystemUiVisibility() & (-3));
            }
            window.setAttributes(attributes);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.l3 a() {
        boolean z10;
        String str;
        boolean z11;
        boolean booleanValue;
        float f10;
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3();
        l3Var.f23631o = this.M;
        l3Var.f23630n = this.f17768q0;
        l3Var.f23628l = this.Q;
        l3Var.f23629m = this.R;
        l3Var.f23632p = this.L.getColor();
        l3Var.f23619a = this.f17770r0;
        boolean z12 = false;
        u2 u2Var = this.f17778x;
        if (u2Var != null && u2Var.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        l3Var.f23634r = z10;
        l3Var.B = f6.I.q();
        org.telegram.ui.web.v0 v0Var = null;
        if (u2Var != null) {
            str = u2Var.getUrlLoaded();
        } else {
            str = null;
        }
        l3Var.v = str;
        t2 t2Var = this.v;
        if ((t2Var == null || t2Var.getSwipeOffsetY() >= 0.0f) && !this.f17773t0 && !m() && !this.Z) {
            z11 = false;
        } else {
            z11 = true;
        }
        l3Var.h = z11;
        l3Var.f23639x = this.Z;
        l3Var.f23640y = this.f17748a0;
        Boolean bool = this.f17775v0;
        if (bool == null) {
            booleanValue = this.f17774u0;
        } else {
            booleanValue = bool.booleanValue();
        }
        l3Var.f23641z = booleanValue;
        if (t2Var != null) {
            f10 = t2Var.getOffsetY();
        } else {
            f10 = Float.MAX_VALUE;
        }
        l3Var.f23625i = f10;
        l3Var.A = this.f17777w0;
        l3Var.f23635s = this.f17772s0;
        l3Var.f23638w = this.f17765n0;
        l3Var.f23636t = this.X;
        l3Var.f23626j = (t2Var == null || t2Var.I) ? true : true;
        l3Var.f23637u = this.f17759h0.f18177e;
        l3Var.f23633q = this.N;
        y0 y0Var = this.f17779x0;
        if (y0Var != null) {
            y0Var.b();
        }
        l3Var.I = this.f17779x0;
        if (u2Var != null) {
            v0Var = u2Var.getWebView();
        }
        if (v0Var != null) {
            u2Var.g("preserveWebView");
            u2Var.f44098v0 = true;
            if (u2Var.f44085k0) {
                u2Var.v("visibility_changed", org.telegram.ui.web.y0.x(Boolean.FALSE, "is_visible"));
            }
            l3Var.f23620b = v0Var;
            l3Var.d = u2Var.getBotProxy();
            l3Var.f23622e = v0Var.getWidth();
            l3Var.f23623f = v0Var.getHeight();
            v0Var.onPause();
        }
        boolean z13 = this.O0;
        l3Var.E = z13;
        if (z13) {
            l3Var.F = this.P0;
        }
        l3Var.J = this.f17781y0;
        this.f17782z0 = l3Var;
        return l3Var;
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.webViewResultSent) {
            if (this.F == ((Long) objArr[0]).longValue()) {
                k(false);
            }
        } else if (i9 == NotificationCenter.didSetNewTheme) {
            this.f17754e.invalidate();
            this.f17778x.f44087n.b(f6.v0(f6.f23001d6, this.A), 153);
            A();
            E();
        } else if (i9 == NotificationCenter.botDownloadsUpdate) {
            B();
        }
    }

    @Override
    public final void dismiss(boolean z10) {
        k(false);
    }

    public final void g(TL_bots.botAppSettings botappsettings, boolean z10) {
        int i9;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        if (botappsettings != null) {
            boolean q10 = f6.I.q();
            int i14 = botappsettings.flags;
            if (q10) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            if ((i9 & i14) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (q10) {
                i10 = 16;
            } else {
                i10 = 8;
            }
            if ((i14 & i10) != 0) {
                if (q10) {
                    i13 = botappsettings.header_dark_color;
                } else {
                    i13 = botappsettings.header_color;
                }
                t(i13 | (-16777216), true, z10);
            }
            if (z11) {
                if (q10) {
                    i11 = botappsettings.background_dark_color;
                } else {
                    i11 = botappsettings.background_color;
                }
                v(i11 | (-16777216), z10);
                if (q10) {
                    i12 = botappsettings.background_dark_color;
                } else {
                    i12 = botappsettings.background_color;
                }
                y(i12 | (-16777216), z10);
            }
        }
    }

    @Override
    public final int getNavigationBarColor(int i9) {
        return i0.a.d(this.J0, i9, this.N);
    }

    @Override
    public final org.telegram.ui.ActionBar.t3 mo37getWindowView() {
        return this.f17754e;
    }

    public final void h() {
        LaunchActivity launchActivity;
        if (!this.I0 && (launchActivity = LaunchActivity.C1) != null) {
            launchActivity.H(true, true, true);
        }
        b3 b3Var = this.f17754e;
        if (b3Var != null) {
            b3Var.invalidate();
        }
    }

    public final void i() {
        if (this.Q0 == null) {
            org.telegram.ui.g3 g3Var = new org.telegram.ui.g3(getContext());
            this.Q0 = g3Var;
            this.v.addView(g3Var, e6.c(-1.0f, -1));
            this.Q0.setTranslationY(-1.0f);
            this.Q0.h.setOnClickListener(new g2(this, 0));
            this.Q0.setBackgroundColor(this.L.getColor());
            AndroidUtilities.updateViewVisibilityAnimated(this.Q0, this.O0, 1.0f, false);
        }
    }

    public final void k(boolean z10) {
        int i9;
        LaunchActivity launchActivity;
        if (this.Y) {
            return;
        }
        int i10 = 0;
        if (this.D0 != null) {
            z10 = false;
        }
        this.Y = true;
        z(false);
        AndroidUtilities.cancelRunOnUIThread(this.f17767p0);
        NotificationCenter.getInstance(this.C).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getInstance(this.C).removeObserver(this, NotificationCenter.botDownloadsUpdate);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        if (z10 && ((launchActivity = LaunchActivity.C1) == null || launchActivity.f35534u0 == null)) {
            z10 = false;
        }
        if (z10) {
            o1.j jVar = this.f17751c;
            if (jVar != null) {
                jVar.f18800u.f18807i = 0.0f;
                jVar.f();
            }
            LaunchActivity.C1.f35534u0.b(this);
        } else {
            y2 y2Var = this.f17759h0;
            if (y2Var != null) {
                y2Var.animate().translationY(y2Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(gr.h).start();
            }
            this.f17778x.h();
            t2 t2Var = this.v;
            int height = t2Var.getHeight();
            if (y2Var != null) {
                i9 = y2Var.getTotalHeight();
            } else {
                i9 = 0;
            }
            int i11 = height + i9;
            Rect rect = this.h;
            int R = this.f17754e.R() + i11 + rect.top + rect.bottom;
            if (m()) {
                i10 = AndroidUtilities.dp(200.0f);
            }
            t2Var.f(R + i10, true, new y1(this, 0));
        }
        S0.remove(this);
    }

    public final Activity l() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            ownerActivity = LaunchActivity.C1;
        }
        if (ownerActivity == null) {
            return AndroidUtilities.findActivity(getContext());
        }
        return ownerActivity;
    }

    public final boolean m() {
        if (!this.Z) {
            Boolean bool = this.f17775v0;
            if (bool == null) {
                if (!this.f17774u0) {
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
        if (this.f17770r0 != null) {
            long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.f17770r0.f18120r));
            String str = null;
            this.f17775v0 = null;
            TLObject tLObject = this.f17770r0.f18119q;
            if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                this.F = tL_webViewResultUrl.query_id;
                str = tL_webViewResultUrl.url;
                z10 = tL_webViewResultUrl.same_origin;
                this.f17775v0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
                boolean z11 = this.A0;
                if (!z11) {
                    x(tL_webViewResultUrl.fullscreen, !z11, this.f17748a0);
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
            u2 u2Var = this.f17778x;
            if (z10) {
                u2Var.setTrustedOrigin(str);
            }
            if (str != null && !this.A0) {
                MediaDataController.getInstance(this.C).increaseWebappRating(this.f17770r0.f18107c);
                u2Var.r(this.C, str);
            }
            AndroidUtilities.runOnUIThread(this.f17767p0, max);
            t2 t2Var = this.v;
            if (t2Var != null) {
                t2Var.setFullSize(m());
            }
        }
    }

    public final void o(boolean z10) {
        if (this.f17781y0 == z10) {
            return;
        }
        this.f17781y0 = z10;
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
        if (this.f17751c == null) {
            o1.j jVar = new o1.j(this, T0);
            o1.k kVar = new o1.k();
            kVar.b(1200.0f);
            kVar.a(1.0f);
            jVar.f18800u = kVar;
            this.f17751c = jVar;
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f17766o0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else if (this.f17778x.z()) {
        } else {
            k(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        y2 y2Var;
        super.onCreate(bundle);
        Window window = getWindow();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30) {
            window.addFlags(-2147483392);
        } else {
            window.addFlags(-2147417856);
        }
        window.setWindowAnimations(R.style.DialogNoAnimation);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags;
        int i11 = i10 & (-3);
        attributes.flags = i11;
        attributes.softInputMode = 16;
        attributes.height = -1;
        boolean z10 = true;
        if (i9 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        if (this.Z) {
            attributes.flags = i11 | 512;
        } else {
            attributes.flags = i10 & (-515);
        }
        window.setAttributes(attributes);
        if (i9 >= 23) {
            window.setStatusBarColor(0);
        }
        b3 b3Var = this.f17754e;
        b3Var.setFitsSystemWindows(true);
        b3Var.setSystemUiVisibility(1792);
        b3Var.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return c3.e(c3.this, view, windowInsets);
            }
        });
        if (this.Z && ((y2Var = this.f17759h0) == null || y2Var.getTotalHeight() <= 0)) {
            b3Var.setSystemUiVisibility(b3Var.getSystemUiVisibility() | 2);
        } else {
            b3Var.setSystemUiVisibility(b3Var.getSystemUiVisibility() & (-3));
        }
        if (i9 >= 26) {
            if (i0.a.f(this.N) < 0.7210000157356262d) {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getInstance(this.C).addObserver(this, NotificationCenter.botDownloadsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u(false);
        o1.j jVar = this.f17751c;
        if (jVar != null) {
            jVar.c();
            this.f17751c = null;
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
            ((LaunchActivity) context).f35540x0.add(this.f17766o0);
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
            ((LaunchActivity) context).f35540x0.remove(this.f17766o0);
        }
    }

    public final boolean q() {
        String str;
        if (this.f17765n0) {
            TLRPC.User user = MessagesController.getInstance(this.C).getUser(Long.valueOf(this.D));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            alertDialog$Builder.f22702a.N = str;
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new z1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.show();
            ((TextView) c2Var.d(-1)).setTextColor(f6.v0(f6.f23230q7, this.A));
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
        int i9;
        int i10;
        ArrayList arrayList;
        int v02;
        int v03;
        int l1;
        TLRPC.User user = MessagesController.getInstance(this.C).getUser(Long.valueOf(this.D));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(this.C).getAttachMenuBots().bots;
        int size = arrayList2.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList2.get(i11);
                i11++;
                tL_attachMenuBot = tL_attachMenuBot2;
                if (tL_attachMenuBot.bot_id == this.D) {
                    break;
                }
            } else {
                tL_attachMenuBot = null;
                break;
            }
        }
        x60 x60Var = this.G0;
        if (x60Var != null) {
            x60Var.u();
        }
        if (this.Z) {
            view = this.f17760i0;
        } else {
            view = this.V;
        }
        x60 G = x60.G(this.f17754e, this.A, view, true);
        this.G0 = G;
        ArrayList arrayList3 = k0.c(getContext(), this.C, this.D).f17948e;
        HashMap hashMap = this.F0;
        hashMap.clear();
        if (!arrayList3.isEmpty()) {
            x60 J = G.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new kt0(G, 25), false);
            J.k();
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList3.get(i12);
                i12++;
                j0 j0Var = (j0) obj;
                String str = j0Var.f17916c;
                bg.d2 d2Var = new bg.d2(18);
                b6 b6Var = J.d;
                if (J.f34555e == null) {
                    arrayList = arrayList3;
                } else {
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, J.f34555e, J.d, false, false);
                    arrayList = arrayList3;
                    g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    g1Var.setText(str);
                    g1Var.setSubtext("");
                    Integer num = J.f34565j0;
                    if (num != null) {
                        v02 = num.intValue();
                    } else {
                        v02 = f6.v0(f6.E8, b6Var);
                    }
                    Integer num2 = J.f34567k0;
                    if (num2 != null) {
                        v03 = num2.intValue();
                    } else {
                        v03 = f6.v0(f6.F8, b6Var);
                    }
                    g1Var.c(v02, v03);
                    Integer num3 = J.f34569l0;
                    if (num3 != null) {
                        l1 = num3.intValue();
                    } else {
                        l1 = f6.l1(0.12f, f6.v0(f6.E8, b6Var));
                    }
                    g1Var.setSelectorColor(l1);
                    g1Var.setOnClickListener(new org.telegram.ui.Components.f0(J, d2Var));
                    int i13 = J.S;
                    if (i13 > 0) {
                        g1Var.setMinimumWidth(AndroidUtilities.dp(i13));
                        J.r(g1Var, e6.n(J.S, -2));
                    } else {
                        J.r(g1Var, e6.n(-1, -2));
                        hashMap.put(j0Var, J.y());
                        arrayList3 = arrayList;
                    }
                }
                hashMap.put(j0Var, J.y());
                arrayList3 = arrayList;
            }
            B();
            J.S = AndroidUtilities.dp(180.0f);
            G.c(R.drawable.menu_download_round, LocaleController.getString(R.string.BotDownloads), new fh.k3(G, J, 1), false);
            G.k();
        }
        if (this.D0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        G.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new y1(this, 9), z10);
        if (this.D0 == null && this.X) {
            z11 = true;
        } else {
            z11 = false;
        }
        G.l(R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings), new y1(this, 10), z11);
        G.c(R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage), new y1(this, 11), false);
        if (this.D0 == null && user != null && user.bot_has_main_app) {
            z12 = true;
        } else {
            z12 = false;
        }
        G.l(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new y1(this, 12), z12);
        if (this.D0 == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        G.l(R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS), new y1(this, 13), z13);
        if (this.D0 == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        G.l(R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot), new y1(this, 14), z14);
        if (this.D0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu)) {
            z15 = true;
        } else {
            z15 = false;
        }
        G.l(R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot), new y1(this, 15), z15);
        if (this.M != f6.w0(null, f6.f23001d6, false)) {
            if (AndroidUtilities.computePerceivedBrightness(this.M) >= 0.721f) {
                i9 = -1;
            } else {
                i9 = -15198183;
            }
            if (AndroidUtilities.computePerceivedBrightness(i9) >= 0.721f) {
                i10 = -16777216;
            } else {
                i10 = -1;
            }
            int l12 = f6.l1(0.85f, i10);
            int l13 = f6.l1(0.1f, i10);
            G.P(i9);
            for (int i14 = 0; i14 < G.x(); i14++) {
                View w8 = G.w(i14);
                if (w8 instanceof org.telegram.ui.ActionBar.g1) {
                    org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) w8;
                    g1Var2.c(i10, l12);
                    g1Var2.setSelectorColor(l13);
                }
            }
        }
        G.V(5);
        G.a0(-this.h.right, 0.0f);
        G.U = true;
        G.f34581t = false;
        G.f34580s = 0;
        G.Z();
    }

    @Override
    public final void release() {
        if (this.I0) {
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        z(false);
    }

    public final void s(org.telegram.ui.ActionBar.o2 o2Var, s4 s4Var) {
        TLRPC.User user;
        org.telegram.ui.ActionBar.z zVar;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        org.telegram.ui.ActionBar.z zVar2;
        TLRPC.InputPeer inputPeer;
        TLRPC.InputPeer inputPeer2;
        boolean z10;
        TL_bots.botAppSettings botappsettings;
        this.f17770r0 = s4Var;
        int i9 = s4Var.f18105a;
        this.C = i9;
        this.E = s4Var.f18106b;
        this.D = s4Var.f18107c;
        this.G = s4Var.h;
        this.H = s4Var.f18111i;
        this.I = s4Var.f18108e;
        TLRPC.User user2 = MessagesController.getInstance(i9).getUser(Long.valueOf(this.D));
        CharSequence userName = UserObject.getUserName(user2);
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        z2 z2Var = this.S;
        z2Var.setTitle(userName);
        TLRPC.UserFull userFull = MessagesController.getInstance(this.C).getUserFull(this.D);
        b6 b6Var = this.A;
        if ((user2 != null && user2.verified) || (userFull != null && (user = userFull.user) != null && user.verified)) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            this.E0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.Oh, b6Var), PorterDuff.Mode.SRC_IN));
            this.E0.setAlpha(255);
            z2Var.getTitleTextView().setDrawablePadding(AndroidUtilities.dp(2.0f));
            z2Var.getTitleTextView().i(new kh.w3(this, 2));
        }
        BotFullscreenButtons botFullscreenButtons = this.f17760i0;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setName(UserObject.getUserName(user2), user2 != null && user2.verified);
        }
        org.telegram.ui.ActionBar.z n10 = z2Var.n();
        n10.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.C).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                zVar = n10;
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
            i10++;
            tL_attachMenuBot = tL_attachMenuBot2;
            zVar = n10;
            if (tL_attachMenuBot.bot_id == this.D) {
                break;
            }
            n10 = zVar;
        }
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
            if (s4Var.f18118p) {
                x(z10, false, this.f17748a0);
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
        org.telegram.ui.ActionBar.w0 d = zVar2.d(0, optionsIcon);
        this.V = d;
        d.setOnClickListener(new g2(this, 1));
        z2Var.setActionBarMenuOnItemClick(new l2(this));
        JSONObject p6 = p(b6Var, false);
        TLRPC.User user3 = MessagesController.getInstance(this.C).getUser(Long.valueOf(this.D));
        u2 u2Var = this.f17778x;
        u2Var.setBotUser(user3);
        u2Var.q(this.C, this.D);
        TLRPC.User user4 = s4Var.f18115m;
        if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu && !MediaDataController.getInstance(this.C).isShortcutAdded(this.D, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
            if (user4 == null) {
                user4 = MessagesController.getInstance(this.C).getUser(Long.valueOf(this.D));
            }
            if (user4 != null && user4.photo != null && !FileLoader.getInstance(this.C).getPathToAttach(user4.photo.photo_small, true).exists()) {
                MediaDataController.getInstance(this.C).preloadImage(ImageLocation.getForUser(this.C, user4, 1), 0);
            }
        }
        if (s4Var.f18119q != null) {
            n();
            return;
        }
        int i11 = s4Var.f18110g;
        if (i11 == 0) {
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = MessagesController.getInstance(this.C).getInputPeer(this.E);
            tL_messages_requestWebView.bot = MessagesController.getInstance(this.C).getInputUser(this.D);
            tL_messages_requestWebView.platform = "android";
            tL_messages_requestWebView.compact = s4Var.f18117o;
            tL_messages_requestWebView.fullscreen = s4Var.f18118p;
            String str = s4Var.f18109f;
            if (str != null) {
                tL_messages_requestWebView.url = str;
                tL_messages_requestWebView.flags |= 2;
            }
            if (this.G != 0) {
                TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(this.C).createReplyInput(this.G);
                tL_messages_requestWebView.reply_to = createReplyInput;
                if (this.H != 0) {
                    createReplyInput.monoforum_peer_id = MessagesController.getInstance(this.C).getInputPeer(this.H);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (this.H != 0) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(this.C).getInputPeer(this.H);
                tL_messages_requestWebView.flags |= 1;
            }
            if (p6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = p6.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(this.C).sendRequest(tL_messages_requestWebView, new i2(this, 3));
            NotificationCenter.getInstance(this.C).addObserver(this, NotificationCenter.webViewResultSent);
        } else if (i11 == 1) {
            TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
            tL_messages_requestSimpleWebView.from_switch_webview = (s4Var.f18116n & 1) != 0;
            tL_messages_requestSimpleWebView.bot = MessagesController.getInstance(this.C).getInputUser(this.D);
            tL_messages_requestSimpleWebView.platform = "android";
            tL_messages_requestSimpleWebView.from_side_menu = (s4Var.f18116n & 2) != 0;
            tL_messages_requestSimpleWebView.compact = s4Var.f18117o;
            tL_messages_requestSimpleWebView.fullscreen = s4Var.f18118p;
            if (p6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                tL_dataJSON2.data = p6.toString();
                tL_messages_requestSimpleWebView.flags |= 1;
            }
            if (!TextUtils.isEmpty(s4Var.f18109f)) {
                tL_messages_requestSimpleWebView.flags |= 8;
                tL_messages_requestSimpleWebView.url = s4Var.f18109f;
            }
            if (!TextUtils.isEmpty(s4Var.f18114l)) {
                tL_messages_requestSimpleWebView.start_param = s4Var.f18114l;
                tL_messages_requestSimpleWebView.flags |= 16;
            }
            ConnectionsManager.getInstance(this.C).sendRequest(tL_messages_requestSimpleWebView, new i2(this, 2));
        } else if (i11 == 2) {
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView2.bot = MessagesController.getInstance(this.C).getInputUser(this.D);
            tL_messages_requestWebView2.peer = MessagesController.getInstance(this.C).getInputPeer(this.D);
            tL_messages_requestWebView2.platform = "android";
            tL_messages_requestWebView2.compact = s4Var.f18117o;
            tL_messages_requestWebView2.fullscreen = s4Var.f18118p;
            tL_messages_requestWebView2.url = s4Var.f18109f;
            tL_messages_requestWebView2.flags |= 2;
            if (p6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                tL_dataJSON3.data = p6.toString();
                tL_messages_requestWebView2.flags |= 4;
            }
            ConnectionsManager.getInstance(this.C).sendRequest(tL_messages_requestWebView2, new i2(this, 1));
            NotificationCenter.getInstance(this.C).addObserver(this, NotificationCenter.webViewResultSent);
        } else if (i11 == 3) {
            TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
            TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
            TLRPC.BotApp botApp = s4Var.f18112j;
            tL_inputBotAppID.f22438id = botApp.f22377id;
            tL_inputBotAppID.access_hash = botApp.access_hash;
            tL_messages_requestAppWebView.app = tL_inputBotAppID;
            tL_messages_requestAppWebView.write_allowed = s4Var.f18113k;
            tL_messages_requestAppWebView.platform = "android";
            if (o2Var instanceof qn) {
                qn qnVar = (qn) o2Var;
                inputPeer = qnVar.i() != null ? MessagesController.getInputPeer(qnVar.i()) : MessagesController.getInputPeer(qnVar.f41890e);
            } else {
                inputPeer = MessagesController.getInputPeer(s4Var.f18115m);
            }
            tL_messages_requestAppWebView.peer = inputPeer;
            tL_messages_requestAppWebView.compact = s4Var.f18117o;
            tL_messages_requestAppWebView.fullscreen = s4Var.f18118p;
            if (!TextUtils.isEmpty(s4Var.f18114l)) {
                tL_messages_requestAppWebView.start_param = s4Var.f18114l;
                tL_messages_requestAppWebView.flags |= 2;
            }
            if (p6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                tL_messages_requestAppWebView.theme_params = tL_dataJSON4;
                tL_dataJSON4.data = p6.toString();
                tL_messages_requestAppWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(this.C).sendRequest(tL_messages_requestAppWebView, new i2(this, 4), 66);
        } else if (i11 != 4) {
            if (i11 != 5) {
                return;
            }
            TLRPC.TL_messages_requestChatJoinWebView tL_messages_requestChatJoinWebView = new TLRPC.TL_messages_requestChatJoinWebView();
            tL_messages_requestChatJoinWebView.platform = "android";
            tL_messages_requestChatJoinWebView.query_id = s4Var.d;
            if (p6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON5;
                tL_dataJSON5.data = p6.toString();
            }
            ConnectionsManager.getInstance(this.C).sendRequestTyped(tL_messages_requestChatJoinWebView, new Object(), new b8(this, 9), 66);
        } else {
            TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
            tL_messages_requestMainWebView.bot = MessagesController.getInstance(this.C).getInputUser(s4Var.f18107c);
            tL_messages_requestMainWebView.platform = "android";
            if (o2Var instanceof qn) {
                qn qnVar2 = (qn) o2Var;
                inputPeer2 = qnVar2.i() != null ? MessagesController.getInputPeer(qnVar2.i()) : MessagesController.getInputPeer(qnVar2.f41890e);
            } else {
                inputPeer2 = MessagesController.getInstance(this.C).getInputPeer(s4Var.f18106b);
            }
            tL_messages_requestMainWebView.peer = inputPeer2;
            tL_messages_requestMainWebView.compact = s4Var.f18117o;
            tL_messages_requestMainWebView.fullscreen = s4Var.f18118p;
            if (!TextUtils.isEmpty(s4Var.f18114l)) {
                tL_messages_requestMainWebView.start_param = s4Var.f18114l;
                tL_messages_requestMainWebView.flags |= 2;
            }
            if (p6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
                tL_messages_requestMainWebView.theme_params = tL_dataJSON6;
                tL_dataJSON6.data = p6.toString();
                tL_messages_requestMainWebView.flags |= 1;
            }
            ConnectionsManager.getInstance(this.C).sendRequest(tL_messages_requestMainWebView, new i2(this, 5), 66);
        }
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        z(true);
        b3 b3Var = this.f17754e;
        b3Var.setAlpha(0.0f);
        b3Var.addOnLayoutChangeListener(new m.t2(this, 1));
        super.show();
        this.I0 = false;
        S0.add(this);
    }

    public final void t(final int i9, boolean z10, boolean z11) {
        int i10;
        boolean z12;
        final int i11 = this.M;
        f6.b(0.35f, -0.1f, i9);
        final w1 w1Var = new w1();
        int i12 = 0;
        if (this.Q) {
            i10 = this.M;
        } else {
            i10 = 0;
        }
        SparseIntArray sparseIntArray = w1Var.f18184a;
        b6 b6Var = this.A;
        w1Var.c(sparseIntArray, i10, b6Var);
        this.Q = z10;
        if (i0.a.f(i9) < 0.7210000157356262d) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.O = z12;
        if (this.Q) {
            i12 = i9;
        }
        w1Var.c(w1Var.f18185b, i12, b6Var);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(gr.f28844f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int d = i0.a.d(floatValue, i11, i9);
                    c3 c3Var = c3.this;
                    c3Var.M = d;
                    c3Var.h();
                    b3 b3Var = c3Var.f17754e;
                    b3Var.invalidate();
                    z2 z2Var = c3Var.S;
                    z2Var.setBackgroundColor(c3Var.M);
                    w1 w1Var2 = w1Var;
                    w1Var2.b(z2Var, floatValue);
                    c3Var.f17747a = w1Var2.a(f6.Ii);
                    b3Var.invalidate();
                }
            });
            duration.addListener(new s2(this, i11, i9, w1Var));
            duration.start();
        } else {
            this.M = i9;
            h();
            b3 b3Var = this.f17754e;
            b3Var.invalidate();
            int i13 = this.M;
            z2 z2Var = this.S;
            z2Var.setBackgroundColor(i13);
            w1Var.b(z2Var, 1.0f);
            this.f17747a = w1Var.a(f6.Ii);
            b3Var.invalidate();
        }
        E();
    }

    public final void u(boolean z10) {
        if (this.R0 == z10) {
            return;
        }
        this.R0 = z10;
        if (z10) {
            if (this.f17781y0) {
                U0++;
            }
        } else if (this.f17781y0) {
            U0--;
        }
        if (U0 > 0) {
            AndroidUtilities.lockOrientation(l());
        } else {
            AndroidUtilities.unlockOrientation(l());
        }
    }

    public final void v(int i9, boolean z10) {
        Paint paint = this.L;
        int color = paint.getColor();
        boolean z11 = true;
        this.R = true;
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            this.L0 = duration;
            duration.setInterpolator(gr.f28844f);
            this.L0.addUpdateListener(new f2(this, color, i9, 0));
            this.L0.addListener(new o2(this, i9, 0));
            this.L0.start();
            return;
        }
        paint.setColor(i9);
        A();
        this.f17754e.invalidate();
        org.telegram.ui.g3 g3Var = this.Q0;
        if (g3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) > 0.721f) {
                z11 = false;
            }
            g3Var.b(z11, false);
            this.Q0.setBackgroundColor(paint.getColor());
        }
        F();
    }

    public final void w(boolean z10) {
        if (this.f17774u0 != z10) {
            this.f17774u0 = z10;
            t2 t2Var = this.v;
            if (t2Var != null) {
                t2Var.setFullSize(m());
            }
        }
    }

    public final void x(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        float f10;
        float f11;
        float f12;
        float f13;
        int currentActionBarHeight;
        float f14;
        Point point;
        Object obj;
        if (this.Z == z10) {
            return;
        }
        this.Z = z10;
        int i9 = 0;
        if (z12 && !MessagesController.getInstance(this.C).disableBotFullscreenBlur && SharedConfig.getDevicePerformanceClass() >= 2) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f17748a0 = z13;
        ValueAnimator valueAnimator = this.N0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        BotFullscreenButtons botFullscreenButtons = this.f17760i0;
        t2 t2Var = this.v;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setPreview(z10, z11);
            if (this.f17748a0) {
                obj = t2Var.getRenderNode();
            } else {
                obj = null;
            }
            botFullscreenButtons.setParentRenderNode(obj);
        }
        this.f17755e0 = t2Var.getWidth();
        this.f17757f0 = t2Var.getHeight();
        this.M0 = false;
        y2 y2Var = this.f17759h0;
        u2 u2Var = this.f17778x;
        z2 z2Var = this.S;
        if (z11) {
            D();
            G();
            C();
            if (AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
                int i10 = AndroidUtilities.displaySize.x;
                f11 = (i10 - ((int) (Math.min(i10, point.y) * 0.8f))) / 2.0f;
            } else {
                f11 = 0.0f;
            }
            int i11 = this.h.left;
            if (z10) {
                f12 = i11 + f11;
            } else {
                f12 = (-i11) - f11;
            }
            if (!z10) {
                f11 = -f11;
            }
            if (z10) {
                f13 = t2Var.getTranslationY();
            } else {
                f13 = -AndroidUtilities.dp(24.0f);
            }
            if (z10) {
                currentActionBarHeight = -AndroidUtilities.dp(24.0f);
            } else {
                currentActionBarHeight = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f);
            }
            float f15 = currentActionBarHeight;
            float currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            o1.j jVar = t2Var.v;
            if (jVar != null) {
                jVar.c();
            }
            o1.j jVar2 = t2Var.C;
            if (jVar2 != null) {
                jVar2.c();
            }
            t2Var.setSwipeOffsetAnimationDisallowed(true);
            z2Var.setVisibility(0);
            if (z10) {
                t2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                t2Var.setTopActionBarOffsetY(currentActionBarHeight2 - AndroidUtilities.dp(24.0f));
            }
            t2Var.c();
            t2Var.invalidate();
            this.f17752c0 = 0.0f;
            if (z10) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            this.f17750b0 = f14;
            z2Var.setAlpha(1.0f - f14);
            z2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f17750b0);
            t2Var.setTranslationY(AndroidUtilities.lerp(f13, f15, this.f17752c0));
            t2Var.setTranslationX(AndroidUtilities.lerp(f12, 0.0f, this.f17752c0));
            y2Var.setTranslationX(AndroidUtilities.lerp(f11, 0.0f, this.f17752c0));
            botFullscreenButtons.setAlpha(this.f17750b0);
            this.f17754e.invalidate();
            u2Var.setViewPortHeightOffset(t2Var.getTranslationY() - f15);
            u2Var.n(false, false);
            this.f17753d0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.N0 = ofFloat;
            float f16 = f12;
            ofFloat.addUpdateListener(new p2(this, z10, f13, f15, f16, f11));
            this.N0.addListener(new q2(this, z10, currentActionBarHeight2, f16));
            this.N0.setDuration(280L);
            this.N0.setInterpolator(gr.h);
            this.N0.start();
            return;
        }
        this.f17753d0 = false;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f17750b0 = f10;
        this.f17752c0 = 0.0f;
        D();
        G();
        if (z10) {
            i9 = 8;
        }
        z2Var.setVisibility(i9);
        z2Var.setAlpha(1.0f - this.f17750b0);
        z2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f17750b0);
        y2Var.setTranslationX(0.0f);
        botFullscreenButtons.setAlpha(this.f17750b0);
        u2Var.setViewPortHeightOffset(0.0f);
        u2Var.n(true, true);
        C();
    }

    public final void y(int i9, boolean z10) {
        int i10 = this.N;
        y2 y2Var = this.f17759h0;
        Paint paint = y2Var.f18174a;
        y2Var.f18177e.f102c = i9;
        paint.setColor(i9);
        if (!z10) {
            y2Var.d.a(i9, true);
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(gr.f28844f);
            duration.addUpdateListener(new f2(this, i10, i9, 1));
            duration.addListener(new r2(this, i10, i9, 0));
            duration.start();
        } else {
            this.N = i9;
            h();
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, this.N, false);
    }

    public final void z(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.K0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.J0;
        float f12 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (Math.abs(f11 - f10) < 0.01f) {
            return;
        }
        float f13 = this.J0;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
        this.K0 = ofFloat;
        ofFloat.addListener(new hg.b0(15, this, z10));
        this.K0.addUpdateListener(new x1(this, 0));
        this.K0.setInterpolator(gr.h);
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
