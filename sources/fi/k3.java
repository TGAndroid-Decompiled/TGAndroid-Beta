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
import com.google.android.gms.internal.cast.z5;
import di.x8;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fo;
import org.telegram.ui.su0;
import org.telegram.ui.yb1;
public final class k3 extends Dialog implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.s3 {
    public static final HashSet W0 = new HashSet();
    public static final hw0 X0;
    public static int Y0;
    public boolean A0;
    public z0 B0;
    public boolean C0;
    public org.telegram.ui.ActionBar.l3 D0;
    public final c6 E;
    public boolean E0;
    public boolean F;
    public boolean F0;
    public int G;
    public float G0;
    public long H;
    public yb1 H0;
    public long I;
    public Drawable I0;
    public long J;
    public final HashMap J0;
    public int K;
    public l80 K0;
    public long L;
    public j0 L0;
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
    public org.telegram.ui.f3 U0;
    public boolean V;
    public boolean V0;
    public final h3 W;
    public final FrameLayout.LayoutParams X;
    public final Drawable Y;
    public org.telegram.ui.ActionBar.u0 Z;
    public int f9354a;
    public BotFullscreenButtons.OptionsIcon f9355a0;
    public float f9356b;
    public boolean f9357b0;
    public o1.k f9358c;
    public boolean f9359c0;
    public Boolean d;
    public boolean f9360d0;
    public final j3 e;
    public boolean f9361e0;
    public final Rect f9362f;
    public float f9363f0;
    public float f9364g0;
    public final Rect h;
    public boolean f9365h0;
    public int f9366i0;
    public int f9367j0;
    public Activity f9368k0;
    public final g3 f9369l0;
    public final BotFullscreenButtons m0;
    public int f9370n;
    public sc f9371n0;
    public i0 f9372o0;
    public final FrameLayout f9373p0;
    public final FrameLayout.LayoutParams f9374q0;
    public final org.telegram.ui.ActionBar.m3 f9375r;
    public boolean f9376r0;
    public final z5 f9377s;
    public final re0 f9378s0;
    public final e2 f9379t0;
    public int f9380u0;
    public final a3 v;
    public e5 f9381v0;
    public final FrameLayout.LayoutParams f9382w;
    public boolean f9383w0;
    public final b3 f9384x;
    public boolean f9385x0;
    public final i3 f9386y;
    public boolean f9387y0;
    public Boolean f9388z0;

    static {
        hw0 hw0Var = new hw0(new c2(0), new c2(1));
        hw0Var.f25423c = 100.0f;
        X0 = hw0Var;
        Y0 = 0;
    }

    public k3(Context context, c6 c6Var) {
        super(context, R.style.TransparentDialog);
        Object obj;
        this.f9356b = 0.0f;
        this.f9362f = new Rect();
        this.h = new Rect();
        this.f9370n = 0;
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.N = paint;
        Paint paint2 = new Paint();
        this.O = paint2;
        this.P = new Paint(1);
        this.T = new Paint(1);
        this.f9379t0 = new e2(this, 1);
        this.f9380u0 = -1;
        this.f9387y0 = false;
        this.f9388z0 = null;
        this.J0 = new HashMap();
        this.M0 = false;
        this.Q0 = true;
        this.V0 = false;
        this.E = c6Var;
        this.f9354a = g6.x0(null, g6.Ii, false);
        a3 a3Var = new a3(this, context, 0);
        this.v = a3Var;
        a3Var.setAllowFullSizeSwipe(true);
        a3Var.setShouldWaitWebViewScroll(true);
        int i10 = g6.f19601d6;
        b3 b3Var = new b3(g6.w0(i10, c6Var), 0, context, this, c6Var);
        this.f9384x = b3Var;
        b3Var.setOnVerifiedAge(this.H0);
        b3Var.setDelegate(new f3(this, context, c6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.Q = g6.w0(i10, c6Var);
        int w02 = g6.w0(g6.f19543a7, c6Var);
        this.R = w02;
        AndroidUtilities.setNavigationBarColor((Dialog) this, w02, false);
        j3 j3Var = new j3(this, context);
        this.e = j3Var;
        j3Var.setDelegate(new g2(this, 0));
        FrameLayout.LayoutParams e = w7.z5.e(-1, -1, 49);
        this.f9382w = e;
        j3Var.addView(a3Var, e);
        g3 g3Var = new g3(this, getContext(), c6Var);
        this.f9369l0 = g3Var;
        g3Var.setOnButtonClickListener(new h2(this, 0));
        g3Var.setOnResizeListener(new e2(this, 3));
        j3Var.addView(g3Var, w7.z5.e(-1, -2, 81));
        BotFullscreenButtons botFullscreenButtons = new BotFullscreenButtons(getContext());
        this.m0 = botFullscreenButtons;
        botFullscreenButtons.setAlpha(0.0f);
        botFullscreenButtons.setVisibility(8);
        z10 = (MessagesController.getInstance(this.G).disableBotFullscreenBlur || SharedConfig.getDevicePerformanceClass() < 2) ? false : z10;
        this.f9361e0 = z10;
        if (z10) {
            obj = a3Var.getRenderNode();
        } else {
            obj = null;
        }
        botFullscreenButtons.setParentRenderNode(obj);
        j3Var.addView(botFullscreenButtons, w7.z5.e(-1, -1, 119));
        botFullscreenButtons.setOnCloseClickListener(new e2(this, 4));
        botFullscreenButtons.setOnCollapseClickListener(new e2(this, 5));
        botFullscreenButtons.setOnMenuClickListener(new e2(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9373p0 = frameLayout;
        FrameLayout.LayoutParams e7 = w7.z5.e(-1, 200, 55);
        this.f9374q0 = e7;
        j3Var.addView(frameLayout, e7);
        this.Y = getContext().getDrawable(R.drawable.header_shadow).mutate();
        ?? kVar = new org.telegram.ui.ActionBar.k(context, c6Var);
        this.W = kVar;
        kVar.setBackgroundColor(0);
        kVar.setBackButtonImage(R.drawable.ic_close_white);
        B();
        kVar.setActionBarMenuOnItemClick(new ah.s(this, 2));
        kVar.setAlpha(0.0f);
        FrameLayout.LayoutParams e10 = w7.z5.e(-1, -2, 49);
        this.X = e10;
        j3Var.addView((View) kVar, e10);
        ?? k4Var = new k4(context, c6Var);
        this.f9386y = k4Var;
        j3Var.addView((View) k4Var, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 81));
        b3Var.setWebViewProgressListener(new di.c5(this, 1));
        a3Var.addView(b3Var, w7.z5.d(-1.0f, -1));
        a3Var.setScrollListener(new e2(this, 7));
        a3Var.setScrollEndListener(new e2(this, 8));
        a3Var.setDelegate(new f2(this));
        a3Var.setIsKeyboardVisible(new f2(this));
        re0 re0Var = new re0(context);
        this.f9378s0 = re0Var;
        j3Var.addView(re0Var, w7.z5.d(-1.0f, -1));
        setContentView(j3Var, new ViewGroup.LayoutParams(-1, -1));
        E();
        LaunchActivity launchActivity = LaunchActivity.G1;
        org.telegram.ui.ActionBar.m3 P = launchActivity != null ? launchActivity.P() : null;
        this.f9375r = P;
        if (P != null) {
            x8 x8Var = new x8(j3Var, 19);
            e2 e2Var = new e2(this, 2);
            P.I.add(x8Var);
            P.J.add(e2Var);
            this.f9377s = new z5(P);
        }
    }

    public static void d(k3 k3Var) {
        if (!k3Var.M0) {
            super.dismiss();
            k3Var.M0 = true;
        }
    }

    public static WindowInsets e(k3 k3Var, View view, WindowInsets windowInsets) {
        r0.i1 i1Var = r0.l1.h(view, windowInsets).f43497a;
        i0.b f7 = i1Var.f(2);
        k3Var.f9362f.set(f7.f10892a, f7.f10893b, f7.f10894c, f7.d);
        i0.b f10 = i1Var.f(647);
        Rect rect = k3Var.h;
        rect.set(Math.max(f10.f10892a, windowInsets.getStableInsetLeft()), Math.max(f10.f10893b, windowInsets.getStableInsetTop()), Math.max(f10.f10894c, windowInsets.getStableInsetRight()), Math.max(f10.d, windowInsets.getStableInsetBottom()));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 28) {
            rect.top = Math.max(rect.top, AndroidUtilities.getStatusBarHeight(k3Var.getContext()));
        }
        int i11 = i1Var.f(8).d;
        if (i11 > rect.bottom && i11 > AndroidUtilities.dp(20.0f)) {
            k3Var.f9370n = i11;
        } else {
            k3Var.f9370n = 0;
        }
        k3Var.E();
        if (i10 >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void j(int i10, long j10, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(i10).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                i11++;
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
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.R = string;
        a2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new t1(i10, j10, tL_attachMenuBot, runnable));
        i2.d.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static JSONObject q(c6 c6Var, final boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int v = g6.v(-16777216, g6.w0(g6.f19672h5, c6Var));
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    int v10 = g6.v(v, ((Integer) obj).intValue());
                    Integer valueOf = Integer.valueOf(v10);
                    if (z10) {
                        return String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(v10)), Integer.valueOf(Color.green(v10)), Integer.valueOf(Color.blue(v10)));
                    }
                    return valueOf;
                }
            };
            jSONObject.put("bg_color", callbackReturn.run(Integer.valueOf(v)));
            jSONObject.put("section_bg_color", callbackReturn.run(Integer.valueOf(g6.w0(g6.f19601d6, c6Var))));
            int i10 = g6.f19543a7;
            jSONObject.put("secondary_bg_color", callbackReturn.run(Integer.valueOf(g6.w0(i10, c6Var))));
            jSONObject.put("text_color", callbackReturn.run(Integer.valueOf(g6.w0(g6.G6, c6Var))));
            jSONObject.put("hint_color", callbackReturn.run(Integer.valueOf(g6.w0(g6.H6, c6Var))));
            jSONObject.put("link_color", callbackReturn.run(Integer.valueOf(g6.w0(g6.J6, c6Var))));
            jSONObject.put("button_color", callbackReturn.run(Integer.valueOf(g6.w0(g6.Oh, c6Var))));
            jSONObject.put("button_text_color", callbackReturn.run(Integer.valueOf(g6.w0(g6.Sh, c6Var))));
            jSONObject.put("header_bg_color", callbackReturn.run(Integer.valueOf(g6.w0(g6.f19880s8, c6Var))));
            jSONObject.put("accent_text_color", callbackReturn.run(Integer.valueOf(g6.w0(g6.q6, c6Var))));
            jSONObject.put("section_header_text_color", callbackReturn.run(Integer.valueOf(g6.w0(g6.L6, c6Var))));
            jSONObject.put("subtitle_text_color", callbackReturn.run(Integer.valueOf(g6.w0(g6.f20005z6, c6Var))));
            jSONObject.put("destructive_text_color", callbackReturn.run(Integer.valueOf(g6.w0(g6.f19822p7, c6Var))));
            jSONObject.put("section_separator_color", callbackReturn.run(Integer.valueOf(g6.w0(g6.f19602d7, c6Var))));
            jSONObject.put("bottom_bar_bg_color", callbackReturn.run(Integer.valueOf(g6.w0(i10, c6Var))));
            return jSONObject;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public final void A(boolean z10) {
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
        ofFloat.addListener(new ah.p0(15, this, z10));
        this.O0.addUpdateListener(new d2(this, 0));
        this.O0.setInterpolator(es.h);
        this.O0.setDuration(220L);
        this.O0.start();
    }

    public final void B() {
        if (!this.U) {
            int i10 = g6.G6;
            c6 c6Var = this.E;
            int w02 = g6.w0(i10, c6Var);
            h3 h3Var = this.W;
            h3Var.setTitleColor(w02);
            h3Var.D(g6.w0(i10, c6Var), false);
            h3Var.C(g6.w0(g6.f19918u8, c6Var), false);
            h3Var.E(g6.w0(g6.G8, c6Var), false);
            h3Var.F(g6.w0(g6.E8, c6Var), false, false);
            h3Var.F(g6.w0(g6.F8, c6Var), true, false);
            h3Var.G(g6.w0(g6.I5, c6Var), false);
        }
        this.f9384x.setFlickerViewColor(this.P.getColor());
    }

    public final void C() {
        sc scVar;
        boolean z10;
        k0 c10 = k0.c(getContext(), this.G, this.H);
        ArrayList arrayList = c10.e;
        j0 j0Var = c10.f9352f;
        boolean z11 = true;
        if (j0Var == null) {
            sc scVar2 = this.f9371n0;
            if (scVar2 != null) {
                scVar2.b();
                this.f9371n0 = null;
            }
        } else if ((j0Var.c() && !j0Var.f9335l) || j0Var.f9334k) {
            if (this.L0 != j0Var && (scVar = this.f9371n0) != null) {
                scVar.b();
                this.f9371n0 = null;
            }
            sc scVar3 = this.f9371n0;
            if (scVar3 == null || !scVar3.f28807l) {
                this.L0 = j0Var;
                i0 i0Var = new i0(getContext(), this.E);
                this.f9372o0 = i0Var;
                sc f7 = sc.f(this.f9373p0, i0Var, 5000);
                this.f9371n0 = f7;
                f7.k(true);
            }
            if (this.f9372o0.c(j0Var)) {
                this.f9371n0 = null;
            }
            j0Var.f9334k = false;
            j0Var.f9335l = true;
        } else {
            i0 i0Var2 = this.f9372o0;
            if (i0Var2 != null) {
                this.L0 = j0Var;
                if (i0Var2.c(j0Var)) {
                    this.f9371n0 = null;
                }
            }
        }
        D();
        for (Map.Entry entry : this.J0.entrySet()) {
            org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) entry.getValue();
            j0 j0Var2 = (j0) entry.getKey();
            e1Var.setText(j0Var2.f9329c);
            if (!j0Var2.c()) {
                e1Var.setSubtext(AndroidUtilities.formatFileSize(j0Var2.f9331g));
            } else {
                Pair b10 = j0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    e1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) b10.second).longValue()));
                } else {
                    e1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()));
                }
            }
            if (j0Var2.c()) {
                e1Var.setRightIcon(R.drawable.msg_close);
                e1Var.f19420b.setPadding(0, 0, AndroidUtilities.dp(32.0f), 0);
            } else if (j0Var2.f9332i) {
                e1Var.setVisibility(8);
            } else {
                e1Var.setRightIcon(0);
                e1Var.f19420b.setPadding(0, 0, 0, 0);
            }
            e1Var.setOnClickListener(new bi.u1(8, this, j0Var2));
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = this.f9355a0;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
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
        int i11 = 0;
        while (true) {
            if (i11 < size2) {
                Object obj2 = arrayList.get(i11);
                i11++;
                if (((j0) obj2).c()) {
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        this.m0.setDownloading(z11);
    }

    public final void D() {
        i0 i0Var = this.f9372o0;
        if (i0Var == null) {
            return;
        }
        if (this.f9360d0) {
            i0Var.setArrow(AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(26.0f), this.f9363f0));
        } else if (this.f9356b > 0.5f) {
            i0Var.setArrow(AndroidUtilities.dp(24.0f));
        } else {
            i0Var.setArrow(-1);
        }
    }

    public final void E() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        BotFullscreenButtons botFullscreenButtons = this.m0;
        Rect rect = this.h;
        botFullscreenButtons.setInsets(rect);
        boolean z10 = this.f9360d0;
        b3 b3Var = this.f9384x;
        j3 j3Var = this.e;
        g3 g3Var = this.f9369l0;
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
            if (this.f9370n > i14 || (g3Var != null && g3Var.getTotalHeight() > 0)) {
                i15 = 0;
            } else {
                i15 = rect.bottom;
            }
            Rect rect2 = new Rect(i17, i18, i19, i15);
            int dp = AndroidUtilities.dp(46.0f);
            b3Var.P(rect2, false);
            b3Var.O(dp, false);
            j3Var.setPadding(0, 0, 0, Math.max(this.f9370n, i14));
        } else {
            b3Var.P(new Rect(0, 0, 0, 0), false);
            b3Var.O(0, false);
            int i20 = rect.left;
            int i21 = rect.right;
            int i22 = this.f9370n;
            org.telegram.ui.ActionBar.m3 m3Var = this.f9375r;
            if (m3Var != null) {
                i10 = m3Var.H;
            } else {
                i10 = 0;
            }
            j3Var.setPadding(i20, 0, i21, Math.max(i22, i10 + rect.bottom));
        }
        this.f9382w.topMargin = AndroidUtilities.dp(24.0f);
        boolean z11 = this.f9360d0;
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
        FrameLayout.LayoutParams layoutParams2 = this.f9374q0;
        layoutParams2.leftMargin = i12;
        if (!z11) {
            i13 = 0;
        } else {
            i13 = rect.right;
        }
        layoutParams2.rightMargin = i13;
        boolean z12 = this.f9365h0;
        a3 a3Var = this.v;
        if (!z12) {
            a3Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f9360d0) {
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
            a3Var.setFullSize(n());
        }
        g3Var.requestLayout();
        j3Var.requestLayout();
        if (!this.f9360d0) {
            i16 = 8;
        }
        botFullscreenButtons.setVisibility(i16);
    }

    public final void F() {
        boolean z10;
        int i10;
        boolean z11 = true;
        if (this.U) {
            z10 = !this.S;
        } else {
            z10 = (AndroidUtilities.isTablet() || i0.a.f(g6.x0(null, g6.f19601d6, true)) < 0.7210000157356262d || this.f9356b < 0.85f) ? false : false;
        }
        Boolean bool = this.d;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        this.d = Boolean.valueOf(z10);
        j3 j3Var = this.e;
        int systemUiVisibility = j3Var.getSystemUiVisibility();
        if (z10) {
            i10 = systemUiVisibility | 8192;
        } else {
            i10 = systemUiVisibility & (-8193);
        }
        j3Var.setSystemUiVisibility(i10);
    }

    public final void G() {
        org.telegram.ui.web.z0 webView;
        b3 b3Var = this.f9384x;
        if (b3Var == null || (webView = b3Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.P.getColor());
    }

    public final void H() {
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
            boolean z10 = this.f9360d0;
            if (z10) {
                attributes.flags = i10 | attributes.flags;
            } else {
                attributes.flags = (~i10) & attributes.flags;
            }
            j3 j3Var = this.e;
            if (z10 && (((g3Var = this.f9369l0) == null || g3Var.getTotalHeight() <= 0) && !j3Var.f9341x0)) {
                j3Var.setSystemUiVisibility(j3Var.getSystemUiVisibility() | 2);
            } else {
                j3Var.setSystemUiVisibility(j3Var.getSystemUiVisibility() & (-3));
            }
            window.setAttributes(attributes);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.l3 a() {
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        boolean booleanValue;
        float f7;
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3();
        l3Var.f20198q = this.Q;
        l3Var.f20197p = this.f9380u0;
        l3Var.f20195n = this.U;
        l3Var.f20196o = this.V;
        l3Var.f20199r = this.P.getColor();
        l3Var.f20185a = this.f9381v0;
        boolean z13 = false;
        b3 b3Var = this.f9384x;
        if (b3Var != null && b3Var.N) {
            z10 = true;
        } else {
            z10 = false;
        }
        l3Var.f20201t = z10;
        l3Var.D = g6.I.q();
        org.telegram.ui.web.z0 z0Var = null;
        if (b3Var != null) {
            str = b3Var.getUrlLoaded();
        } else {
            str = null;
        }
        l3Var.f20204x = str;
        if (b3Var != null && b3Var.f41006t0) {
            z11 = true;
        } else {
            z11 = false;
        }
        l3Var.e = z11;
        if (b3Var != null) {
            str2 = b3Var.getTrustedOrigin();
        } else {
            str2 = null;
        }
        l3Var.f20188f = str2;
        a3 a3Var = this.v;
        if ((a3Var == null || a3Var.getSwipeOffsetY() >= 0.0f) && !this.f9385x0 && !n() && !this.f9360d0) {
            z12 = false;
        } else {
            z12 = true;
        }
        l3Var.f20191j = z12;
        l3Var.f20206z = this.f9360d0;
        l3Var.A = this.f9361e0;
        Boolean bool = this.f9388z0;
        if (bool == null) {
            booleanValue = this.f9387y0;
        } else {
            booleanValue = bool.booleanValue();
        }
        l3Var.B = booleanValue;
        if (a3Var != null) {
            f7 = a3Var.getOffsetY();
        } else {
            f7 = Float.MAX_VALUE;
        }
        l3Var.f20192k = f7;
        l3Var.C = this.A0;
        l3Var.f20202u = this.f9383w0;
        l3Var.f20205y = this.f9376r0;
        l3Var.v = this.f9357b0;
        if (a3Var == null || a3Var.M) {
            z13 = true;
        }
        l3Var.f20193l = z13;
        l3Var.f20203w = this.f9369l0.e;
        l3Var.f20200s = this.R;
        z0 z0Var2 = this.B0;
        if (z0Var2 != null) {
            z0Var2.b();
        }
        l3Var.K = this.B0;
        if (b3Var != null) {
            z0Var = b3Var.getWebView();
        }
        if (z0Var != null) {
            b3Var.L();
            l3Var.f20186b = z0Var;
            l3Var.d = b3Var.getBotProxy();
            l3Var.f20189g = z0Var.getWidth();
            l3Var.h = z0Var.getHeight();
            z0Var.onPause();
        }
        boolean z14 = this.S0;
        l3Var.G = z14;
        if (z14) {
            l3Var.H = this.T0;
        }
        l3Var.L = this.C0;
        this.D0 = l3Var;
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
            if (this.J == ((Long) objArr[0]).longValue()) {
                k(false);
            }
        } else if (i10 == NotificationCenter.didSetNewTheme) {
            this.e.invalidate();
            this.f9384x.f40997n.b(g6.w0(g6.f19601d6, this.E), 153);
            B();
            F();
        } else if (i10 == NotificationCenter.botDownloadsUpdate) {
            C();
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
            boolean q6 = g6.I.q();
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
                u(i14 | (-16777216), true, z10);
            }
            if (z11) {
                if (q6) {
                    i12 = botappsettings.background_dark_color;
                } else {
                    i12 = botappsettings.background_color;
                }
                w(i12 | (-16777216), z10);
                if (q6) {
                    i13 = botappsettings.background_dark_color;
                } else {
                    i13 = botappsettings.background_color;
                }
                z(i13 | (-16777216), z10);
            }
        }
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        return i0.a.d(this.N0, i10, this.R);
    }

    @Override
    public final org.telegram.ui.ActionBar.t3 mo36getWindowView() {
        return this.e;
    }

    public final void h() {
        LaunchActivity launchActivity;
        if (!this.M0 && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.H(true, true, true);
        }
        j3 j3Var = this.e;
        if (j3Var != null) {
            j3Var.invalidate();
        }
    }

    public final void i() {
        if (this.U0 == null) {
            org.telegram.ui.f3 f3Var = new org.telegram.ui.f3(getContext());
            this.U0 = f3Var;
            this.v.addView(f3Var, w7.z5.d(-1.0f, -1));
            this.U0.setTranslationY(-1.0f);
            this.U0.h.setOnClickListener(new n2(this, 0));
            this.U0.setBackgroundColor(this.P.getColor());
            AndroidUtilities.updateViewVisibilityAnimated(this.U0, this.S0, 1.0f, false);
        }
    }

    public final void k(boolean z10) {
        int i10;
        LaunchActivity launchActivity;
        if (this.f9359c0) {
            return;
        }
        int i11 = 0;
        if (this.H0 != null) {
            z10 = false;
        }
        this.f9359c0 = true;
        A(false);
        AndroidUtilities.cancelRunOnUIThread(this.f9379t0);
        NotificationCenter.getInstance(this.G).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getInstance(this.G).removeObserver(this, NotificationCenter.botDownloadsUpdate);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        if (z10 && ((launchActivity = LaunchActivity.G1) == null || launchActivity.f31851y0 == null)) {
            z10 = false;
        }
        if (z10) {
            o1.k kVar = this.f9358c;
            if (kVar != null) {
                kVar.f16161u.f16167i = 0.0f;
                kVar.h();
            }
            LaunchActivity.G1.f31851y0.b(this);
        } else {
            g3 g3Var = this.f9369l0;
            if (g3Var != null) {
                g3Var.animate().translationY(g3Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(es.h).start();
            }
            this.f9384x.h();
            a3 a3Var = this.v;
            int height = a3Var.getHeight();
            if (g3Var != null) {
                i10 = g3Var.getTotalHeight();
            } else {
                i10 = 0;
            }
            int i12 = height + i10;
            Rect rect = this.h;
            int R = this.e.R() + i12 + rect.top + rect.bottom;
            if (n()) {
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
        e5 e5Var = this.f9381v0;
        if (e5Var != null && e5Var.f9258g == 6) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (!this.f9360d0) {
            Boolean bool = this.f9388z0;
            if (bool == null) {
                if (!this.f9387y0) {
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

    public final void o() {
        boolean z10;
        if (this.f9381v0 != null) {
            long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.f9381v0.f9268r));
            String str = null;
            this.f9388z0 = null;
            TLObject tLObject = this.f9381v0.f9267q;
            if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                this.J = tL_webViewResultUrl.query_id;
                str = tL_webViewResultUrl.url;
                z10 = tL_webViewResultUrl.same_origin;
                this.f9388z0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
                boolean z11 = this.E0;
                if (!z11) {
                    y(tL_webViewResultUrl.fullscreen, !z11, this.f9361e0);
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
                MediaDataController.getInstance(this.G).increaseWebappRating(this.f9381v0.f9256c);
                this.f9384x.t(this.G, str, z10);
            }
            AndroidUtilities.runOnUIThread(this.f9379t0, max);
            a3 a3Var = this.v;
            if (a3Var != null) {
                a3Var.setFullSize(n());
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(true);
        if (this.f9358c == null) {
            o1.k kVar = new o1.k(this, X0);
            o1.l lVar = new o1.l();
            lVar.b(1200.0f);
            lVar.a(1.0f);
            kVar.f16161u = lVar;
            this.f9358c = kVar;
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f9378s0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else if (this.f9384x.C()) {
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
        if (this.f9360d0) {
            attributes.flags = i12 | 512;
        } else {
            attributes.flags = i11 & (-515);
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        j3 j3Var = this.e;
        j3Var.setFitsSystemWindows(true);
        j3Var.setSystemUiVisibility(1792);
        j3Var.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return k3.e(k3.this, view, windowInsets);
            }
        });
        if (this.f9360d0 && ((g3Var = this.f9369l0) == null || g3Var.getTotalHeight() <= 0)) {
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
        v(false);
        o1.k kVar = this.f9358c;
        if (kVar != null) {
            kVar.c();
            this.f9358c = null;
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
            ((LaunchActivity) context).B0.add(this.f9378s0);
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
            ((LaunchActivity) context).B0.remove(this.f9378s0);
        }
    }

    public final void p(boolean z10) {
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

    public final boolean r() {
        String str;
        if (this.f9376r0) {
            TLRPC.User user = MessagesController.getInstance(this.G).getUser(Long.valueOf(this.H));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            alertDialog$Builder.f19248a.R = str;
            alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new f2(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
            a2Var.show();
            ((TextView) a2Var.d(-1)).setTextColor(g6.w0(g6.f19839q7, this.E));
            return false;
        }
        k(false);
        return true;
    }

    @Override
    public final void release() {
        if (this.M0) {
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        A(false);
    }

    public final void s() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        View view;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13;
        int w02;
        int w03;
        int m12;
        boolean m10 = m();
        TLRPC.User user = MessagesController.getInstance(this.G).getUser(Long.valueOf(this.H));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(this.G).getAttachMenuBots().bots;
        int size = arrayList2.size();
        int i14 = 0;
        while (true) {
            if (i14 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList2.get(i14);
                i14++;
                tL_attachMenuBot = tL_attachMenuBot2;
                if (tL_attachMenuBot.bot_id == this.H) {
                    break;
                }
            } else {
                tL_attachMenuBot = null;
                break;
            }
        }
        l80 l80Var = this.K0;
        if (l80Var != null) {
            l80Var.u();
        }
        if (this.f9360d0) {
            view = this.m0;
        } else {
            view = this.Z;
        }
        l80 G = l80.G(this.e, this.E, view, true);
        this.K0 = G;
        ArrayList arrayList3 = k0.c(getContext(), this.G, this.H).e;
        HashMap hashMap = this.J0;
        hashMap.clear();
        if (!arrayList3.isEmpty()) {
            l80 J = G.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new su0(G, 26), false);
            J.k();
            int size2 = arrayList3.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj = arrayList3.get(i15);
                i15++;
                j0 j0Var = (j0) obj;
                String str = j0Var.f9329c;
                ah.j jVar = new ah.j(11);
                c6 c6Var = J.d;
                if (J.e == null) {
                    arrayList = arrayList3;
                    i13 = size2;
                } else {
                    org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, J.e, J.d, false, false);
                    arrayList = arrayList3;
                    i13 = size2;
                    e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    e1Var.setText(str);
                    e1Var.setSubtext("");
                    Integer num = J.f26653j0;
                    if (num != null) {
                        w02 = num.intValue();
                    } else {
                        w02 = g6.w0(g6.E8, c6Var);
                    }
                    Integer num2 = J.f26655k0;
                    if (num2 != null) {
                        w03 = num2.intValue();
                    } else {
                        w03 = g6.w0(g6.F8, c6Var);
                    }
                    e1Var.c(w02, w03);
                    Integer num3 = J.f26657l0;
                    if (num3 != null) {
                        m12 = num3.intValue();
                    } else {
                        m12 = g6.m1(0.12f, g6.w0(g6.E8, c6Var));
                    }
                    e1Var.setSelectorColor(m12);
                    e1Var.setOnClickListener(new org.telegram.ui.Components.f0(J, jVar));
                    int i16 = J.S;
                    if (i16 > 0) {
                        e1Var.setMinimumWidth(AndroidUtilities.dp(i16));
                        J.r(e1Var, w7.z5.n(J.S, -2));
                    } else {
                        J.r(e1Var, w7.z5.n(-1, -2));
                        hashMap.put(j0Var, J.y());
                        size2 = i13;
                        arrayList3 = arrayList;
                    }
                }
                hashMap.put(j0Var, J.y());
                size2 = i13;
                arrayList3 = arrayList;
            }
            i10 = -1;
            C();
            J.S = AndroidUtilities.dp(180.0f);
            G.c(R.drawable.menu_download_round, LocaleController.getString(R.string.BotDownloads), new m2(G, J, 0), false);
            G.k();
        } else {
            i10 = -1;
        }
        if (this.H0 == null && !m10) {
            z10 = true;
        } else {
            z10 = false;
        }
        G.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new e2(this, 9), z10);
        if (this.H0 == null && this.f9357b0) {
            z11 = true;
        } else {
            z11 = false;
        }
        G.l(R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings), new e2(this, 10), z11);
        G.c(R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage), new ah.t(7, this, m10), false);
        if (this.H0 == null && user != null && user.bot_has_main_app) {
            z12 = true;
        } else {
            z12 = false;
        }
        G.l(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new e2(this, 11), z12);
        if (this.H0 == null && !m10) {
            z13 = true;
        } else {
            z13 = false;
        }
        G.l(R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS), new e2(this, 12), z13);
        if (this.H0 == null && !m10) {
            z14 = true;
        } else {
            z14 = false;
        }
        G.l(R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot), new e2(this, 13), z14);
        if (this.H0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu)) {
            z15 = true;
        } else {
            z15 = false;
        }
        G.l(R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot), new e2(this, 14), z15);
        if (this.Q != g6.x0(null, g6.f19601d6, false)) {
            if (AndroidUtilities.computePerceivedBrightness(this.Q) >= 0.721f) {
                i11 = i10;
            } else {
                i11 = -15198183;
            }
            if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                i12 = -16777216;
            } else {
                i12 = i10;
            }
            int m13 = g6.m1(0.85f, i12);
            int m14 = g6.m1(0.1f, i12);
            G.P(i11);
            for (int i17 = 0; i17 < G.x(); i17++) {
                View w9 = G.w(i17);
                if (w9 instanceof org.telegram.ui.ActionBar.e1) {
                    org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) w9;
                    e1Var2.c(i12, m13);
                    e1Var2.setSelectorColor(m14);
                }
            }
        }
        G.V(5);
        G.a0(-this.h.right, 0.0f);
        G.U = true;
        G.f26669t = false;
        G.f26668s = 0;
        G.Z();
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        A(true);
        j3 j3Var = this.e;
        j3Var.setAlpha(0.0f);
        j3Var.addOnLayoutChangeListener(new u2(this, 0));
        super.show();
        this.M0 = false;
        W0.add(this);
    }

    public final void t(org.telegram.ui.ActionBar.m2 m2Var, e5 e5Var) {
        boolean z10;
        TLRPC.User user;
        CharSequence userName;
        TLRPC.UserFull userFull;
        TLRPC.User user2;
        TLRPC.UserFull userFull2;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        boolean z11;
        TLRPC.InputPeer inputPeer;
        TLRPC.InputPeer inputPeer2;
        boolean z12;
        boolean z13;
        TL_bots.botAppSettings botappsettings;
        String userName2;
        boolean z14;
        this.f9381v0 = e5Var;
        int i10 = e5Var.f9254a;
        this.G = i10;
        this.I = e5Var.f9255b;
        this.H = e5Var.f9256c;
        this.K = e5Var.h;
        this.L = e5Var.f9259i;
        this.M = e5Var.e;
        if (e5Var.f9258g == 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            user = null;
        } else {
            user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.H));
        }
        if (z10) {
            userName = e5Var.e;
        } else {
            userName = UserObject.getUserName(user);
        }
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        h3 h3Var = this.W;
        h3Var.setTitle(userName);
        if (z10) {
            userFull = null;
        } else {
            userFull = MessagesController.getInstance(this.G).getUserFull(this.H);
        }
        c6 c6Var = this.E;
        if ((user != null && user.verified) || (userFull != null && (user2 = userFull.user) != null && user2.verified)) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            this.I0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(g6.Oh, c6Var), PorterDuff.Mode.SRC_IN));
            this.I0.setAlpha(255);
            h3Var.getTitleTextView().setDrawablePadding(AndroidUtilities.dp(2.0f));
            h3Var.getTitleTextView().i(new di.c4(this, 1));
        }
        BotFullscreenButtons botFullscreenButtons = this.m0;
        if (botFullscreenButtons != null) {
            if (z10) {
                userName2 = e5Var.e;
            } else {
                userName2 = UserObject.getUserName(user);
            }
            if (user != null && user.verified) {
                z14 = true;
            } else {
                z14 = false;
            }
            botFullscreenButtons.setName(userName2, z14);
        }
        org.telegram.ui.ActionBar.y n10 = h3Var.n();
        n10.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.G).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                i11++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot2;
                userFull2 = userFull;
                if (tL_attachMenuBot3.bot_id == this.H) {
                    tL_attachMenuBot = tL_attachMenuBot3;
                    break;
                }
                userFull = userFull2;
            } else {
                userFull2 = userFull;
                tL_attachMenuBot = null;
                break;
            }
        }
        if (!this.E0 && !z10) {
            if (userFull2 != null) {
                TL_bots.BotInfo botInfo = userFull2.bot_info;
                if (botInfo != null && (botappsettings = botInfo.app_settings) != null) {
                    z12 = false;
                    g(botappsettings, false);
                } else {
                    z12 = false;
                }
                z13 = true;
            } else {
                z12 = false;
                z13 = true;
                MessagesController.getInstance(this.G).loadFullUser(user, 0, true, new h2(this, 1));
            }
            if (e5Var.f9266p) {
                y(z13, z12, this.f9361e0);
            }
        }
        if (this.H0 == null) {
            n10.a(R.id.menu_collapse_bot, R.drawable.arrow_more);
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = new BotFullscreenButtons.OptionsIcon(getContext());
        this.f9355a0 = optionsIcon;
        org.telegram.ui.ActionBar.u0 d = n10.d(0, optionsIcon);
        this.Z = d;
        d.setOnClickListener(new n2(this, 1));
        h3Var.setActionBarMenuOnItemClick(new s2(this));
        JSONObject q6 = q(c6Var, false);
        b3 b3Var = this.f9384x;
        b3Var.setBotUser(user);
        if (!z10) {
            b3Var.s(this.G, this.H);
            TLRPC.User user3 = e5Var.f9263m;
            if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu && !MediaDataController.getInstance(this.G).isShortcutAdded(this.H, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
                if (user3 == null) {
                    user3 = MessagesController.getInstance(this.G).getUser(Long.valueOf(this.H));
                }
                if (user3 != null && user3.photo != null && !FileLoader.getInstance(this.G).getPathToAttach(user3.photo.photo_small, true).exists()) {
                    MediaDataController.getInstance(this.G).preloadImage(ImageLocation.getForUser(this.G, user3, 1), 0);
                }
            }
        }
        if (e5Var.f9267q != null) {
            o();
            return;
        }
        switch (e5Var.f9258g) {
            case 0:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = MessagesController.getInstance(this.G).getInputPeer(this.I);
                tL_messages_requestWebView.bot = MessagesController.getInstance(this.G).getInputUser(this.H);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = e5Var.f9265o;
                tL_messages_requestWebView.fullscreen = e5Var.f9266p;
                String str = e5Var.f9257f;
                if (str != null) {
                    tL_messages_requestWebView.url = str;
                    tL_messages_requestWebView.flags |= 2;
                }
                if (this.K != 0) {
                    TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(this.G).createReplyInput(this.K);
                    tL_messages_requestWebView.reply_to = createReplyInput;
                    if (this.L != 0) {
                        createReplyInput.monoforum_peer_id = MessagesController.getInstance(this.G).getInputPeer(this.L);
                        tL_messages_requestWebView.reply_to.flags |= 32;
                    }
                    tL_messages_requestWebView.flags |= 1;
                } else if (this.L != 0) {
                    TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                    tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(this.G).getInputPeer(this.L);
                    tL_messages_requestWebView.flags |= 1;
                }
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON;
                    tL_dataJSON.data = q6.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestWebView, new p2(this, 3));
                NotificationCenter.getInstance(this.G).addObserver(this, NotificationCenter.webViewResultSent);
                return;
            case 1:
                boolean z15 = false;
                TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
                if ((e5Var.f9264n & 1) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                tL_messages_requestSimpleWebView.from_switch_webview = z11;
                tL_messages_requestSimpleWebView.bot = MessagesController.getInstance(this.G).getInputUser(this.H);
                tL_messages_requestSimpleWebView.platform = "android";
                if ((e5Var.f9264n & 2) != 0) {
                    z15 = true;
                }
                tL_messages_requestSimpleWebView.from_side_menu = z15;
                tL_messages_requestSimpleWebView.compact = e5Var.f9265o;
                tL_messages_requestSimpleWebView.fullscreen = e5Var.f9266p;
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = q6.toString();
                    tL_messages_requestSimpleWebView.flags |= 1;
                }
                if (!TextUtils.isEmpty(e5Var.f9257f)) {
                    tL_messages_requestSimpleWebView.flags |= 8;
                    tL_messages_requestSimpleWebView.url = e5Var.f9257f;
                }
                if (!TextUtils.isEmpty(e5Var.f9262l)) {
                    tL_messages_requestSimpleWebView.start_param = e5Var.f9262l;
                    tL_messages_requestSimpleWebView.flags |= 16;
                }
                ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestSimpleWebView, new p2(this, 2));
                return;
            case 2:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView2.bot = MessagesController.getInstance(this.G).getInputUser(this.H);
                tL_messages_requestWebView2.peer = MessagesController.getInstance(this.G).getInputPeer(this.H);
                tL_messages_requestWebView2.platform = "android";
                tL_messages_requestWebView2.compact = e5Var.f9265o;
                tL_messages_requestWebView2.fullscreen = e5Var.f9266p;
                tL_messages_requestWebView2.url = e5Var.f9257f;
                tL_messages_requestWebView2.flags |= 2;
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                    tL_dataJSON3.data = q6.toString();
                    tL_messages_requestWebView2.flags |= 4;
                }
                ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestWebView2, new p2(this, 1));
                NotificationCenter.getInstance(this.G).addObserver(this, NotificationCenter.webViewResultSent);
                return;
            case 3:
                TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                TLRPC.BotApp botApp = e5Var.f9260j;
                tL_inputBotAppID.f18974id = botApp.f18913id;
                tL_inputBotAppID.access_hash = botApp.access_hash;
                tL_messages_requestAppWebView.app = tL_inputBotAppID;
                tL_messages_requestAppWebView.write_allowed = e5Var.f9261k;
                tL_messages_requestAppWebView.platform = "android";
                if (m2Var instanceof fo) {
                    fo foVar = (fo) m2Var;
                    if (foVar.i() != null) {
                        inputPeer = MessagesController.getInputPeer(foVar.i());
                    } else {
                        inputPeer = MessagesController.getInputPeer(foVar.e);
                    }
                } else {
                    inputPeer = MessagesController.getInputPeer(e5Var.f9263m);
                }
                tL_messages_requestAppWebView.peer = inputPeer;
                tL_messages_requestAppWebView.compact = e5Var.f9265o;
                tL_messages_requestAppWebView.fullscreen = e5Var.f9266p;
                if (!TextUtils.isEmpty(e5Var.f9262l)) {
                    tL_messages_requestAppWebView.start_param = e5Var.f9262l;
                    tL_messages_requestAppWebView.flags |= 2;
                }
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                    tL_messages_requestAppWebView.theme_params = tL_dataJSON4;
                    tL_dataJSON4.data = q6.toString();
                    tL_messages_requestAppWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestAppWebView, new p2(this, 4), 66);
                return;
            case 4:
                TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                tL_messages_requestMainWebView.bot = MessagesController.getInstance(this.G).getInputUser(e5Var.f9256c);
                tL_messages_requestMainWebView.platform = "android";
                if (m2Var instanceof fo) {
                    fo foVar2 = (fo) m2Var;
                    if (foVar2.i() != null) {
                        inputPeer2 = MessagesController.getInputPeer(foVar2.i());
                    } else {
                        inputPeer2 = MessagesController.getInputPeer(foVar2.e);
                    }
                } else {
                    inputPeer2 = MessagesController.getInstance(this.G).getInputPeer(e5Var.f9255b);
                }
                tL_messages_requestMainWebView.peer = inputPeer2;
                tL_messages_requestMainWebView.compact = e5Var.f9265o;
                tL_messages_requestMainWebView.fullscreen = e5Var.f9266p;
                if (!TextUtils.isEmpty(e5Var.f9262l)) {
                    tL_messages_requestMainWebView.start_param = e5Var.f9262l;
                    tL_messages_requestMainWebView.flags |= 2;
                }
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                    tL_messages_requestMainWebView.theme_params = tL_dataJSON5;
                    tL_dataJSON5.data = q6.toString();
                    tL_messages_requestMainWebView.flags |= 1;
                }
                ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestMainWebView, new p2(this, 5), 66);
                return;
            case 5:
                TLRPC.TL_messages_requestChatJoinWebView tL_messages_requestChatJoinWebView = new TLRPC.TL_messages_requestChatJoinWebView();
                tL_messages_requestChatJoinWebView.platform = "android";
                tL_messages_requestChatJoinWebView.query_id = e5Var.d;
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
                    tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON6;
                    tL_dataJSON6.data = q6.toString();
                }
                ConnectionsManager.getInstance(this.G).sendRequestTyped(tL_messages_requestChatJoinWebView, new Object(), new ci.u(this, 16), 66);
                return;
            case 6:
                if (!this.E0) {
                    b3Var.t(this.G, e5Var.f9257f, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void u(final int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        final int i12 = this.Q;
        g6.b(0.35f, -0.1f, i10);
        final b2 b2Var = new b2();
        int i13 = 0;
        if (this.U) {
            i11 = this.Q;
        } else {
            i11 = 0;
        }
        SparseIntArray sparseIntArray = b2Var.f9188a;
        c6 c6Var = this.E;
        b2Var.c(sparseIntArray, i11, c6Var);
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
        b2Var.c(b2Var.f9189b, i13, c6Var);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(es.f24465f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int d = i0.a.d(floatValue, i12, i10);
                    k3 k3Var = k3.this;
                    k3Var.Q = d;
                    k3Var.h();
                    j3 j3Var = k3Var.e;
                    j3Var.invalidate();
                    h3 h3Var = k3Var.W;
                    h3Var.setBackgroundColor(k3Var.Q);
                    b2 b2Var2 = b2Var;
                    b2Var2.b(h3Var, floatValue);
                    k3Var.f9354a = b2Var2.a(g6.Ii);
                    j3Var.invalidate();
                }
            });
            duration.addListener(new z2(this, i12, i10, b2Var));
            duration.start();
        } else {
            this.Q = i10;
            h();
            j3 j3Var = this.e;
            j3Var.invalidate();
            int i14 = this.Q;
            h3 h3Var = this.W;
            h3Var.setBackgroundColor(i14);
            b2Var.b(h3Var, 1.0f);
            this.f9354a = b2Var.a(g6.Ii);
            j3Var.invalidate();
        }
        F();
    }

    public final void v(boolean z10) {
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

    public final void w(int i10, boolean z10) {
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
            duration.setInterpolator(es.f24465f);
            this.P0.addUpdateListener(new l2(this, color, i10, 0));
            this.P0.addListener(new v2(this, i10, 0));
            this.P0.start();
            return;
        }
        paint.setColor(i10);
        B();
        this.e.invalidate();
        org.telegram.ui.f3 f3Var = this.U0;
        if (f3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) > 0.721f) {
                z11 = false;
            }
            f3Var.b(z11, false);
            this.U0.setBackgroundColor(paint.getColor());
        }
        G();
    }

    public final void x(boolean z10) {
        if (this.f9387y0 != z10) {
            this.f9387y0 = z10;
            a3 a3Var = this.v;
            if (a3Var != null) {
                a3Var.setFullSize(n());
            }
        }
    }

    public final void y(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        float f7;
        float f10;
        float f11;
        float f12;
        int currentActionBarHeight;
        float f13;
        Point point;
        Object obj;
        if (this.f9360d0 == z10) {
            return;
        }
        this.f9360d0 = z10;
        int i10 = 0;
        if (z12 && !MessagesController.getInstance(this.G).disableBotFullscreenBlur && SharedConfig.getDevicePerformanceClass() >= 2) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f9361e0 = z13;
        ValueAnimator valueAnimator = this.R0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        BotFullscreenButtons botFullscreenButtons = this.m0;
        a3 a3Var = this.v;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setPreview(z10, z11);
            if (this.f9361e0) {
                obj = a3Var.getRenderNode();
            } else {
                obj = null;
            }
            botFullscreenButtons.setParentRenderNode(obj);
        }
        this.f9366i0 = a3Var.getWidth();
        this.f9367j0 = a3Var.getHeight();
        this.Q0 = false;
        g3 g3Var = this.f9369l0;
        b3 b3Var = this.f9384x;
        h3 h3Var = this.W;
        if (z11) {
            E();
            H();
            D();
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
            this.f9364g0 = 0.0f;
            if (z10) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            this.f9363f0 = f13;
            h3Var.setAlpha(1.0f - f13);
            h3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f9363f0);
            a3Var.setTranslationY(AndroidUtilities.lerp(f12, f14, this.f9364g0));
            a3Var.setTranslationX(AndroidUtilities.lerp(f11, 0.0f, this.f9364g0));
            g3Var.setTranslationX(AndroidUtilities.lerp(f10, 0.0f, this.f9364g0));
            botFullscreenButtons.setAlpha(this.f9363f0);
            this.e.invalidate();
            b3Var.setViewPortHeightOffset(a3Var.getTranslationY() - f14);
            b3Var.n(false, false);
            this.f9365h0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.R0 = ofFloat;
            float f15 = f11;
            ofFloat.addUpdateListener(new w2(this, z10, f12, f14, f15, f10));
            this.R0.addListener(new x2(this, z10, currentActionBarHeight2, f15));
            this.R0.setDuration(280L);
            this.R0.setInterpolator(es.h);
            this.R0.start();
            return;
        }
        this.f9365h0 = false;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f9363f0 = f7;
        this.f9364g0 = 0.0f;
        E();
        H();
        if (z10) {
            i10 = 8;
        }
        h3Var.setVisibility(i10);
        h3Var.setAlpha(1.0f - this.f9363f0);
        h3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f9363f0);
        g3Var.setTranslationX(0.0f);
        botFullscreenButtons.setAlpha(this.f9363f0);
        b3Var.setViewPortHeightOffset(0.0f);
        b3Var.n(true, true);
        D();
    }

    public final void z(int i10, boolean z10) {
        int i11 = this.R;
        g3 g3Var = this.f9369l0;
        Paint paint = g3Var.f9622a;
        g3Var.e.f281b = i10;
        paint.setColor(i10);
        if (!z10) {
            g3Var.d.a(i10, true);
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(es.f24465f);
            duration.addUpdateListener(new l2(this, i11, i10, 1));
            duration.addListener(new y2(this, i11, i10, 0));
            duration.start();
        } else {
            this.R = i10;
            h();
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, this.R, false);
    }

    @Override
    public final void dismiss() {
        k(false);
    }

    @Override
    public final void setLastVisible(boolean z10) {
    }
}
