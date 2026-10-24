package gi;

import ai.r7;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
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
import ei.bc;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.zr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ka1;
import org.telegram.ui.sn;
import org.telegram.ui.ut0;
public final class d3 extends Dialog implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.w3 {
    public static final HashSet f11153a1 = new HashSet();
    public static final gw0 f11154b1;
    public static int f11155c1;
    public Boolean A0;
    public boolean B0;
    public y0 C0;
    public boolean D0;
    public final b3 E;
    public org.telegram.ui.ActionBar.p3 E0;
    public final g6 F;
    public boolean F0;
    public boolean G;
    public boolean G0;
    public int H;
    public float H0;
    public long I;
    public boolean I0;
    public long J;
    public boolean J0;
    public long K;
    public int K0;
    public int L;
    public ka1 L0;
    public long M;
    public Drawable M0;
    public String N;
    public final HashMap N0;
    public final Paint O;
    public h80 O0;
    public final Paint P;
    public i0 P0;
    public final Paint Q;
    public boolean Q0;
    public int R;
    public float R0;
    public int S;
    public ValueAnimator S0;
    public boolean T;
    public ValueAnimator T0;
    public final Paint U;
    public boolean U0;
    public boolean V;
    public ValueAnimator V0;
    public boolean W;
    public boolean W0;
    public final a3 X;
    public String X0;
    public final FrameLayout.LayoutParams Y;
    public org.telegram.ui.e3 Y0;
    public final Drawable Z;
    public boolean Z0;
    public int f11156a;
    public org.telegram.ui.ActionBar.u0 f11157a0;
    public int f11158b;
    public BotFullscreenButtons.OptionsIcon f11159b0;
    public float f11160c;
    public boolean f11161c0;
    public o1.k d;
    public boolean f11162d0;
    public Boolean e;
    public boolean f11163e0;
    public final c3 f11164f;
    public boolean f11165f0;
    public float f11166g0;
    public final Rect h;
    public float f11167h0;
    public boolean f11168i0;
    public int f11169j0;
    public int f11170k0;
    public Activity f11171l0;
    public final z2 m0;
    public final Rect f11172n;
    public final BotFullscreenButtons f11173n0;
    public oc f11174o0;
    public h0 f11175p0;
    public final FrameLayout f11176q0;
    public int f11177r;
    public final FrameLayout.LayoutParams f11178r0;
    public final org.telegram.ui.ActionBar.q3 f11179s;
    public boolean f11180s0;
    public final ne0 f11181t0;
    public final y1 f11182u0;
    public final z5 v;
    public int f11183v0;
    public final u2 f11184w;
    public t4 f11185w0;
    public final FrameLayout.LayoutParams f11186x;
    public boolean f11187x0;
    public final v2 f11188y;
    public boolean f11189y0;
    public boolean f11190z0;

    static {
        gw0 gw0Var = new gw0(new fh.b(9), new fh.b(10));
        gw0Var.f26806c = 100.0f;
        f11154b1 = gw0Var;
        f11155c1 = 0;
    }

    public d3(Context context, g6 g6Var) {
        super(context, R.style.TransparentDialog);
        Object obj;
        this.f11160c = 0.0f;
        this.h = new Rect();
        this.f11172n = new Rect();
        this.f11177r = 0;
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.O = paint;
        Paint paint2 = new Paint();
        this.P = paint2;
        this.Q = new Paint(1);
        this.U = new Paint(1);
        this.f11182u0 = new y1(this, 1);
        this.f11183v0 = -1;
        this.f11190z0 = false;
        this.A0 = null;
        this.I0 = true;
        this.N0 = new HashMap();
        this.Q0 = false;
        this.U0 = true;
        this.Z0 = false;
        this.F = g6Var;
        int x02 = k6.x0(null, k6.Ii, false);
        this.f11158b = x02;
        this.f11156a = x02;
        u2 u2Var = new u2(this, context, 0);
        this.f11184w = u2Var;
        u2Var.setAllowFullSizeSwipe(true);
        u2Var.setShouldWaitWebViewScroll(true);
        int i10 = k6.f21184d6;
        v2 v2Var = new v2(k6.w0(i10, g6Var), 0, context, this, g6Var);
        this.f11188y = v2Var;
        v2Var.setOnVerifiedAge(this.L0);
        v2Var.setDelegate(new y2(this, context, g6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.R = k6.w0(i10, g6Var);
        int w02 = k6.w0(k6.f21126a7, g6Var);
        this.S = w02;
        AndroidUtilities.setNavigationBarColor((Dialog) this, w02, false);
        c3 c3Var = new c3(this, context);
        this.f11164f = c3Var;
        c3Var.setDelegate(new a2(this, 0));
        FrameLayout.LayoutParams e = w7.z5.e(-1, -1, 49);
        this.f11186x = e;
        c3Var.addView(u2Var, e);
        z2 z2Var = new z2(this, getContext(), g6Var);
        this.m0 = z2Var;
        z2Var.setOnButtonClickListener(new b2(this, 0));
        z2Var.setOnResizeListener(new y1(this, 3));
        c3Var.addView(z2Var, w7.z5.e(-1, -2, 81));
        BotFullscreenButtons botFullscreenButtons = new BotFullscreenButtons(getContext());
        this.f11173n0 = botFullscreenButtons;
        botFullscreenButtons.setAlpha(0.0f);
        botFullscreenButtons.setVisibility(8);
        z10 = (MessagesController.getInstance(this.H).disableBotFullscreenBlur || SharedConfig.getDevicePerformanceClass() < 2) ? false : z10;
        this.f11165f0 = z10;
        if (z10) {
            obj = u2Var.getRenderNode();
        } else {
            obj = null;
        }
        botFullscreenButtons.setParentRenderNode(obj);
        c3Var.addView(botFullscreenButtons, w7.z5.e(-1, -1, 119));
        botFullscreenButtons.setOnCloseClickListener(new y1(this, 4));
        botFullscreenButtons.setOnCollapseClickListener(new y1(this, 5));
        botFullscreenButtons.setOnMenuClickListener(new y1(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f11176q0 = frameLayout;
        FrameLayout.LayoutParams e7 = w7.z5.e(-1, 200, 55);
        this.f11178r0 = e7;
        c3Var.addView(frameLayout, e7);
        this.Z = getContext().getDrawable(R.drawable.header_shadow).mutate();
        ?? kVar = new org.telegram.ui.ActionBar.k(context, g6Var);
        this.X = kVar;
        kVar.setBackgroundColor(0);
        kVar.setBackButtonImage(R.drawable.ic_close_white);
        B();
        kVar.setActionBarMenuOnItemClick(new ah.s(this, 3));
        kVar.setAlpha(0.0f);
        FrameLayout.LayoutParams e10 = w7.z5.e(-1, -2, 49);
        this.Y = e10;
        c3Var.addView((View) kVar, e10);
        ?? z3Var = new z3(context, g6Var);
        this.E = z3Var;
        c3Var.addView((View) z3Var, w7.z5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        v2Var.setWebViewProgressListener(new r7(this, 2));
        u2Var.addView(v2Var, w7.z5.c(-1.0f, -1));
        u2Var.setScrollListener(new y1(this, 7));
        u2Var.setScrollEndListener(new y1(this, 8));
        u2Var.setDelegate(new z1(this));
        u2Var.setIsKeyboardVisible(new z1(this));
        ne0 ne0Var = new ne0(context);
        this.f11181t0 = ne0Var;
        c3Var.addView(ne0Var, w7.z5.c(-1.0f, -1));
        setContentView(c3Var, new ViewGroup.LayoutParams(-1, -1));
        E();
        LaunchActivity launchActivity = LaunchActivity.I1;
        org.telegram.ui.ActionBar.q3 P = launchActivity != null ? launchActivity.P() : null;
        this.f11179s = P;
        if (P != null) {
            bc bcVar = new bc(c3Var, 9);
            y1 y1Var = new y1(this, 2);
            P.I.add(bcVar);
            P.J.add(y1Var);
            this.v = new z5(P);
        }
    }

    public static void d(d3 d3Var) {
        if (!d3Var.Q0) {
            super.dismiss();
            d3Var.Q0 = true;
        }
    }

    public static WindowInsets e(d3 d3Var, View view, WindowInsets windowInsets) {
        r0.h1 h1Var = r0.k1.h(view, windowInsets).f45250a;
        i0.b f7 = h1Var.f(2);
        d3Var.h.set(f7.f12315a, f7.f12316b, f7.f12317c, f7.d);
        i0.b f10 = h1Var.f(647);
        Rect rect = d3Var.f11172n;
        rect.set(Math.max(f10.f12315a, windowInsets.getStableInsetLeft()), Math.max(f10.f12316b, windowInsets.getStableInsetTop()), Math.max(f10.f12317c, windowInsets.getStableInsetRight()), Math.max(f10.d, windowInsets.getStableInsetBottom()));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 28) {
            rect.top = Math.max(rect.top, AndroidUtilities.getStatusBarHeight(d3Var.getContext()));
        }
        int i11 = h1Var.f(8).d;
        if (i11 > rect.bottom && i11 > AndroidUtilities.dp(20.0f)) {
            d3Var.f11177r = i11;
        } else {
            d3Var.f11177r = 0;
        }
        d3Var.E();
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
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.R = string;
        c2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new q1(i10, j10, tL_attachMenuBot, runnable));
        i2.o1.s(R.string.Cancel, alertDialog$Builder, null);
    }

    public static JSONObject q(g6 g6Var, final boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int v = k6.v(-16777216, k6.w0(k6.f21255h5, g6Var));
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    int v10 = k6.v(v, ((Integer) obj).intValue());
                    Integer valueOf = Integer.valueOf(v10);
                    if (z10) {
                        return String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(v10)), Integer.valueOf(Color.green(v10)), Integer.valueOf(Color.blue(v10)));
                    }
                    return valueOf;
                }
            };
            jSONObject.put("bg_color", callbackReturn.run(Integer.valueOf(v)));
            jSONObject.put("section_bg_color", callbackReturn.run(Integer.valueOf(k6.w0(k6.f21184d6, g6Var))));
            int i10 = k6.f21126a7;
            jSONObject.put("secondary_bg_color", callbackReturn.run(Integer.valueOf(k6.w0(i10, g6Var))));
            jSONObject.put("text_color", callbackReturn.run(Integer.valueOf(k6.w0(k6.G6, g6Var))));
            jSONObject.put("hint_color", callbackReturn.run(Integer.valueOf(k6.w0(k6.H6, g6Var))));
            jSONObject.put("link_color", callbackReturn.run(Integer.valueOf(k6.w0(k6.J6, g6Var))));
            jSONObject.put("button_color", callbackReturn.run(Integer.valueOf(k6.w0(k6.Oh, g6Var))));
            jSONObject.put("button_text_color", callbackReturn.run(Integer.valueOf(k6.w0(k6.Sh, g6Var))));
            jSONObject.put("header_bg_color", callbackReturn.run(Integer.valueOf(k6.w0(k6.f21463s8, g6Var))));
            jSONObject.put("accent_text_color", callbackReturn.run(Integer.valueOf(k6.w0(k6.q6, g6Var))));
            jSONObject.put("section_header_text_color", callbackReturn.run(Integer.valueOf(k6.w0(k6.L6, g6Var))));
            jSONObject.put("subtitle_text_color", callbackReturn.run(Integer.valueOf(k6.w0(k6.f21589z6, g6Var))));
            jSONObject.put("destructive_text_color", callbackReturn.run(Integer.valueOf(k6.w0(k6.f21405p7, g6Var))));
            jSONObject.put("section_separator_color", callbackReturn.run(Integer.valueOf(k6.w0(k6.f21185d7, g6Var))));
            jSONObject.put("bottom_bar_bg_color", callbackReturn.run(Integer.valueOf(k6.w0(i10, g6Var))));
            return jSONObject;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public final void A(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.S0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.R0;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (Math.abs(f10 - f7) < 0.01f) {
            return;
        }
        float f12 = this.R0;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.S0 = ofFloat;
        ofFloat.addListener(new ah.p0(15, this, z10));
        this.S0.addUpdateListener(new x1(this, 0));
        this.S0.setInterpolator(zr.h);
        this.S0.setDuration(220L);
        this.S0.start();
    }

    public final void B() {
        if (!this.V) {
            int i10 = k6.G6;
            g6 g6Var = this.F;
            int w02 = k6.w0(i10, g6Var);
            a3 a3Var = this.X;
            a3Var.setTitleColor(w02);
            a3Var.B(k6.w0(i10, g6Var), false);
            a3Var.A(k6.w0(k6.f21502u8, g6Var), false);
            a3Var.C(k6.w0(k6.G8, g6Var), false);
            a3Var.D(k6.w0(k6.E8, g6Var), false, false);
            a3Var.D(k6.w0(k6.F8, g6Var), true, false);
            a3Var.E(k6.w0(k6.I5, g6Var), false);
        }
        this.f11188y.setFlickerViewColor(this.Q.getColor());
    }

    public final void C() {
        oc ocVar;
        boolean z10;
        j0 c10 = j0.c(getContext(), this.H, this.I);
        ArrayList arrayList = c10.e;
        i0 i0Var = c10.f11298f;
        boolean z11 = true;
        if (i0Var == null) {
            oc ocVar2 = this.f11174o0;
            if (ocVar2 != null) {
                ocVar2.b();
                this.f11174o0 = null;
            }
        } else if ((i0Var.c() && !i0Var.f11280l) || i0Var.f11279k) {
            if (this.P0 != i0Var && (ocVar = this.f11174o0) != null) {
                ocVar.b();
                this.f11174o0 = null;
            }
            oc ocVar3 = this.f11174o0;
            if (ocVar3 == null || !ocVar3.f29205l) {
                this.P0 = i0Var;
                h0 h0Var = new h0(getContext(), this.F);
                this.f11175p0 = h0Var;
                oc f7 = oc.f(this.f11176q0, h0Var, 5000);
                this.f11174o0 = f7;
                f7.k(true);
            }
            if (this.f11175p0.c(i0Var)) {
                this.f11174o0 = null;
            }
            i0Var.f11279k = false;
            i0Var.f11280l = true;
        } else {
            h0 h0Var2 = this.f11175p0;
            if (h0Var2 != null) {
                this.P0 = i0Var;
                if (h0Var2.c(i0Var)) {
                    this.f11174o0 = null;
                }
            }
        }
        D();
        for (Map.Entry entry : this.N0.entrySet()) {
            org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) entry.getValue();
            i0 i0Var2 = (i0) entry.getKey();
            e1Var.setText(i0Var2.f11274c);
            if (!i0Var2.c()) {
                e1Var.setSubtext(AndroidUtilities.formatFileSize(i0Var2.f11276g));
            } else {
                Pair b10 = i0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    e1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) b10.second).longValue()));
                } else {
                    e1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()));
                }
            }
            if (i0Var2.c()) {
                e1Var.setRightIcon(R.drawable.msg_close);
                e1Var.f20837b.setPadding(0, 0, AndroidUtilities.dp(32.0f), 0);
            } else if (i0Var2.f11277i) {
                e1Var.setVisibility(8);
            } else {
                e1Var.setRightIcon(0);
                e1Var.f20837b.setPadding(0, 0, 0, 0);
            }
            e1Var.setOnClickListener(new ai.p(18, this, i0Var2));
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = this.f11159b0;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((i0) obj).c()) {
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
                if (((i0) obj2).c()) {
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        this.f11173n0.setDownloading(z11);
    }

    public final void D() {
        h0 h0Var = this.f11175p0;
        if (h0Var == null) {
            return;
        }
        if (this.f11163e0) {
            h0Var.setArrow(AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(26.0f), this.f11166g0));
        } else if (this.f11160c > 0.5f) {
            h0Var.setArrow(AndroidUtilities.dp(24.0f));
        } else {
            h0Var.setArrow(-1);
        }
    }

    public final void E() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        BotFullscreenButtons botFullscreenButtons = this.f11173n0;
        Rect rect = this.f11172n;
        botFullscreenButtons.setInsets(rect);
        boolean z10 = this.f11163e0;
        v2 v2Var = this.f11188y;
        c3 c3Var = this.f11164f;
        z2 z2Var = this.m0;
        int i16 = 0;
        if (z10) {
            if (z2Var != null && z2Var.getTotalHeight() > 0) {
                i14 = rect.bottom;
            } else {
                i14 = 0;
            }
            int i17 = rect.left;
            int i18 = rect.top;
            int i19 = rect.right;
            if (this.f11177r > i14 || (z2Var != null && z2Var.getTotalHeight() > 0)) {
                i15 = 0;
            } else {
                i15 = rect.bottom;
            }
            Rect rect2 = new Rect(i17, i18, i19, i15);
            int dp = AndroidUtilities.dp(46.0f);
            v2Var.P(rect2, false);
            v2Var.O(dp, false);
            c3Var.setPadding(0, 0, 0, Math.max(this.f11177r, i14));
        } else {
            v2Var.P(new Rect(0, 0, 0, 0), false);
            v2Var.O(0, false);
            int i20 = rect.left;
            int i21 = rect.right;
            int i22 = this.f11177r;
            org.telegram.ui.ActionBar.q3 q3Var = this.f11179s;
            if (q3Var != null) {
                i10 = q3Var.H;
            } else {
                i10 = 0;
            }
            c3Var.setPadding(i20, 0, i21, Math.max(i22, i10 + rect.bottom));
        }
        this.f11186x.topMargin = AndroidUtilities.dp(24.0f);
        boolean z11 = this.f11163e0;
        if (!z11) {
            i11 = 0;
        } else {
            i11 = rect.left;
        }
        FrameLayout.LayoutParams layoutParams = this.Y;
        layoutParams.leftMargin = i11;
        layoutParams.rightMargin = 0;
        if (!z11) {
            i12 = 0;
        } else {
            i12 = rect.left;
        }
        FrameLayout.LayoutParams layoutParams2 = this.f11178r0;
        layoutParams2.leftMargin = i12;
        if (!z11) {
            i13 = 0;
        } else {
            i13 = rect.right;
        }
        layoutParams2.rightMargin = i13;
        boolean z12 = this.f11168i0;
        u2 u2Var = this.f11184w;
        if (!z12) {
            u2Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f11163e0) {
                u2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                u2Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f));
            }
            u2Var.setSwipeOffsetAnimationDisallowed(false);
            u2Var.c();
            u2Var.invalidate();
            u2Var.requestLayout();
        }
        if (u2Var != null) {
            u2Var.setFullSize(n());
        }
        z2Var.requestLayout();
        c3Var.requestLayout();
        if (!this.f11163e0) {
            i16 = 8;
        }
        botFullscreenButtons.setVisibility(i16);
    }

    public final void F() {
        boolean z10;
        int i10;
        boolean z11 = true;
        if (this.V) {
            z10 = !this.T;
        } else {
            z10 = (AndroidUtilities.isTablet() || i0.a.h(k6.x0(null, k6.f21184d6, true)) < 0.7210000157356262d || this.f11160c < 0.85f) ? false : false;
        }
        Boolean bool = this.e;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        this.e = Boolean.valueOf(z10);
        c3 c3Var = this.f11164f;
        int systemUiVisibility = c3Var.getSystemUiVisibility();
        if (z10) {
            i10 = systemUiVisibility | 8192;
        } else {
            i10 = systemUiVisibility & (-8193);
        }
        c3Var.setSystemUiVisibility(i10);
    }

    public final void G() {
        org.telegram.ui.web.y0 webView;
        v2 v2Var = this.f11188y;
        if (v2Var == null || (webView = v2Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.Q.getColor());
    }

    public final void H() {
        int i10;
        z2 z2Var;
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
            boolean z10 = this.f11163e0;
            if (z10) {
                attributes.flags = i10 | attributes.flags;
            } else {
                attributes.flags = (~i10) & attributes.flags;
            }
            c3 c3Var = this.f11164f;
            if (z10 && (((z2Var = this.m0) == null || z2Var.getTotalHeight() <= 0) && !c3Var.f11132x0)) {
                c3Var.setSystemUiVisibility(c3Var.getSystemUiVisibility() | 2);
            } else {
                c3Var.setSystemUiVisibility(c3Var.getSystemUiVisibility() & (-3));
            }
            window.setAttributes(attributes);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.p3 a() {
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        boolean booleanValue;
        float f7;
        org.telegram.ui.ActionBar.p3 p3Var = new org.telegram.ui.ActionBar.p3();
        p3Var.f21768q = this.R;
        p3Var.f21767p = this.f11183v0;
        p3Var.f21765n = this.V;
        p3Var.f21766o = this.W;
        p3Var.f21769r = this.Q.getColor();
        p3Var.f21755a = this.f11185w0;
        boolean z13 = false;
        v2 v2Var = this.f11188y;
        if (v2Var != null && v2Var.N) {
            z10 = true;
        } else {
            z10 = false;
        }
        p3Var.f21771t = z10;
        p3Var.D = k6.I.q();
        org.telegram.ui.web.y0 y0Var = null;
        if (v2Var != null) {
            str = v2Var.getUrlLoaded();
        } else {
            str = null;
        }
        p3Var.f21774x = str;
        if (v2Var != null && v2Var.f43057t0) {
            z11 = true;
        } else {
            z11 = false;
        }
        p3Var.e = z11;
        if (v2Var != null) {
            str2 = v2Var.getTrustedOrigin();
        } else {
            str2 = null;
        }
        p3Var.f21758f = str2;
        u2 u2Var = this.f11184w;
        if ((u2Var == null || u2Var.getSwipeOffsetY() >= 0.0f) && !this.f11189y0 && !n() && !this.f11163e0) {
            z12 = false;
        } else {
            z12 = true;
        }
        p3Var.f21761j = z12;
        p3Var.f21776z = this.f11163e0;
        p3Var.A = this.f11165f0;
        Boolean bool = this.A0;
        if (bool == null) {
            booleanValue = this.f11190z0;
        } else {
            booleanValue = bool.booleanValue();
        }
        p3Var.B = booleanValue;
        if (u2Var != null) {
            f7 = u2Var.getOffsetY();
        } else {
            f7 = Float.MAX_VALUE;
        }
        p3Var.f21762k = f7;
        p3Var.C = this.B0;
        p3Var.f21772u = this.f11187x0;
        p3Var.f21775y = this.f11180s0;
        p3Var.v = this.f11161c0;
        if (u2Var == null || u2Var.M) {
            z13 = true;
        }
        p3Var.f21763l = z13;
        p3Var.f21773w = this.m0.e;
        p3Var.f21770s = this.S;
        y0 y0Var2 = this.C0;
        if (y0Var2 != null) {
            y0Var2.b();
        }
        p3Var.K = this.C0;
        if (v2Var != null) {
            y0Var = v2Var.getWebView();
        }
        if (y0Var != null) {
            v2Var.L();
            p3Var.f21756b = y0Var;
            p3Var.d = v2Var.getBotProxy();
            p3Var.f21759g = y0Var.getWidth();
            p3Var.h = y0Var.getHeight();
            y0Var.onPause();
        }
        boolean z14 = this.W0;
        p3Var.G = z14;
        if (z14) {
            p3Var.H = this.X0;
        }
        p3Var.L = this.D0;
        this.E0 = p3Var;
        return p3Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.l3 l3Var) {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.webViewResultSent) {
            if (this.K == ((Long) objArr[0]).longValue()) {
                k(false);
            }
        } else if (i10 == NotificationCenter.didSetNewTheme) {
            this.f11164f.invalidate();
            this.f11188y.f43048n.b(k6.w0(k6.f21184d6, this.F), 153);
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
            boolean q6 = k6.I.q();
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
        return i0.a.f(this.R0, i10, this.S);
    }

    @Override
    public final org.telegram.ui.ActionBar.x3 mo36getWindowView() {
        return this.f11164f;
    }

    public final void h() {
        LaunchActivity launchActivity;
        if (!this.Q0 && (launchActivity = LaunchActivity.I1) != null) {
            launchActivity.H(true, true, true);
        }
        c3 c3Var = this.f11164f;
        if (c3Var != null) {
            c3Var.invalidate();
        }
    }

    public final void i() {
        if (this.Y0 == null) {
            org.telegram.ui.e3 e3Var = new org.telegram.ui.e3(getContext());
            this.Y0 = e3Var;
            this.f11184w.addView(e3Var, w7.z5.c(-1.0f, -1));
            this.Y0.setTranslationY(-1.0f);
            this.Y0.h.setOnClickListener(new h2(this, 0));
            this.Y0.setBackgroundColor(this.Q.getColor());
            AndroidUtilities.updateViewVisibilityAnimated(this.Y0, this.W0, 1.0f, false);
        }
    }

    public final void k(boolean z10) {
        int i10;
        LaunchActivity launchActivity;
        if (this.f11162d0) {
            return;
        }
        int i11 = 0;
        if (this.L0 != null) {
            z10 = false;
        }
        this.f11162d0 = true;
        A(false);
        AndroidUtilities.cancelRunOnUIThread(this.f11182u0);
        NotificationCenter.getInstance(this.H).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getInstance(this.H).removeObserver(this, NotificationCenter.botDownloadsUpdate);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        if (z10 && ((launchActivity = LaunchActivity.I1) == null || launchActivity.f33505y0 == null)) {
            z10 = false;
        }
        if (z10) {
            o1.k kVar = this.d;
            if (kVar != null) {
                kVar.f17622u.f17628i = 0.0f;
                kVar.h();
            }
            LaunchActivity.I1.f33505y0.b(this);
        } else {
            z2 z2Var = this.m0;
            if (z2Var != null) {
                z2Var.animate().translationY(z2Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(zr.h).start();
            }
            this.f11188y.h();
            u2 u2Var = this.f11184w;
            int height = u2Var.getHeight();
            if (z2Var != null) {
                i10 = z2Var.getTotalHeight();
            } else {
                i10 = 0;
            }
            int i12 = height + i10;
            Rect rect = this.f11172n;
            int Q = this.f11164f.Q() + i12 + rect.top + rect.bottom;
            if (n()) {
                i11 = AndroidUtilities.dp(200.0f);
            }
            u2Var.f(Q + i11, true, new y1(this, 0));
        }
        f11153a1.remove(this);
    }

    public final Activity l() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            ownerActivity = LaunchActivity.I1;
        }
        if (ownerActivity == null) {
            return AndroidUtilities.findActivity(getContext());
        }
        return ownerActivity;
    }

    public final boolean m() {
        t4 t4Var = this.f11185w0;
        if (t4Var != null && t4Var.f11495g == 6) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (!this.f11163e0) {
            Boolean bool = this.A0;
            if (bool == null) {
                if (!this.f11190z0) {
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
        if (this.f11185w0 != null) {
            long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.f11185w0.f11505r));
            String str = null;
            this.A0 = null;
            TLObject tLObject = this.f11185w0.f11504q;
            if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                this.K = tL_webViewResultUrl.query_id;
                str = tL_webViewResultUrl.url;
                z10 = tL_webViewResultUrl.same_origin;
                this.A0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
                boolean z11 = this.F0;
                if (!z11) {
                    y(tL_webViewResultUrl.fullscreen, !z11, this.f11165f0);
                }
            } else {
                if (tLObject instanceof TLRPC.TL_appWebViewResultUrl) {
                    this.K = 0L;
                    str = ((TLRPC.TL_appWebViewResultUrl) tLObject).url;
                } else if (tLObject instanceof TLRPC.TL_simpleWebViewResultUrl) {
                    this.K = 0L;
                    str = ((TLRPC.TL_simpleWebViewResultUrl) tLObject).url;
                }
                z10 = false;
            }
            if (str != null && !this.F0) {
                MediaDataController.getInstance(this.H).increaseWebappRating(this.f11185w0.f11493c);
                this.f11188y.t(this.H, str, z10);
            }
            AndroidUtilities.runOnUIThread(this.f11182u0, max);
            u2 u2Var = this.f11184w;
            if (u2Var != null) {
                u2Var.setFullSize(n());
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(true);
        if (this.d == null) {
            o1.k kVar = new o1.k(this, f11154b1);
            o1.l lVar = new o1.l();
            lVar.b(1200.0f);
            lVar.a(1.0f);
            kVar.f17622u = lVar;
            this.d = kVar;
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f11181t0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else if (this.f11188y.C()) {
        } else {
            k(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        z2 z2Var;
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
        if (this.f11163e0) {
            attributes.flags = i12 | 512;
        } else {
            attributes.flags = i11 & (-515);
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        c3 c3Var = this.f11164f;
        c3Var.setFitsSystemWindows(true);
        c3Var.setSystemUiVisibility(1792);
        c3Var.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return d3.e(d3.this, view, windowInsets);
            }
        });
        if (this.f11163e0 && ((z2Var = this.m0) == null || z2Var.getTotalHeight() <= 0)) {
            c3Var.setSystemUiVisibility(c3Var.getSystemUiVisibility() | 2);
        } else {
            c3Var.setSystemUiVisibility(c3Var.getSystemUiVisibility() & (-3));
        }
        if (i10 >= 26) {
            if (i0.a.h(this.S) < 0.7210000157356262d) {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getInstance(this.H).addObserver(this, NotificationCenter.botDownloadsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        o1.k kVar = this.d;
        if (kVar != null) {
            kVar.c();
            this.d = null;
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
            ((LaunchActivity) context).B0.add(this.f11181t0);
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
            ((LaunchActivity) context).B0.remove(this.f11181t0);
        }
    }

    public final void p(boolean z10) {
        if (this.D0 == z10) {
            return;
        }
        this.D0 = z10;
        if (this.Z0) {
            if (z10) {
                f11155c1++;
            } else {
                f11155c1--;
            }
        }
        if (f11155c1 > 0) {
            AndroidUtilities.lockOrientation(l());
        } else {
            AndroidUtilities.unlockOrientation(l());
        }
    }

    public final boolean r() {
        String str;
        if (this.f11180s0) {
            TLRPC.User user = MessagesController.getInstance(this.H).getUser(Long.valueOf(this.I));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            alertDialog$Builder.f20679a.R = str;
            alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new z1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
            c2Var.show();
            ((TextView) c2Var.d(-1)).setTextColor(k6.w0(k6.f21422q7, this.F));
            return false;
        }
        k(false);
        return true;
    }

    @Override
    public final void release() {
        if (this.Q0) {
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
        boolean m10 = m();
        TLRPC.User user = MessagesController.getInstance(this.H).getUser(Long.valueOf(this.I));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(this.H).getAttachMenuBots().bots;
        int size = arrayList2.size();
        int i14 = 0;
        while (true) {
            if (i14 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList2.get(i14);
                i14++;
                tL_attachMenuBot = tL_attachMenuBot2;
                if (tL_attachMenuBot.bot_id == this.I) {
                    break;
                }
            } else {
                tL_attachMenuBot = null;
                break;
            }
        }
        h80 h80Var = this.O0;
        if (h80Var != null) {
            h80Var.u();
        }
        if (this.f11163e0) {
            view = this.f11173n0;
        } else {
            view = this.f11157a0;
        }
        h80 G = h80.G(this.f11164f, this.F, view, true);
        this.O0 = G;
        ArrayList arrayList3 = j0.c(getContext(), this.H, this.I).e;
        HashMap hashMap = this.N0;
        hashMap.clear();
        if (!arrayList3.isEmpty()) {
            h80 J = G.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new ut0(G, 26), false);
            J.k();
            int size2 = arrayList3.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj = arrayList3.get(i15);
                i15++;
                i0 i0Var = (i0) obj;
                String str = i0Var.f11274c;
                ah.j jVar = new ah.j(15);
                g6 g6Var = J.d;
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
                    Integer num = J.f26914j0;
                    if (num == null && J.f26916k0 == null) {
                        e1Var.c(k6.E8, k6.F8);
                    } else {
                        if (num != null) {
                            w02 = num.intValue();
                        } else {
                            w02 = k6.w0(k6.E8, g6Var);
                        }
                        Integer num2 = J.f26916k0;
                        if (num2 != null) {
                            w03 = num2.intValue();
                        } else {
                            w03 = k6.w0(k6.F8, g6Var);
                        }
                        e1Var.d(w02, w03);
                    }
                    Integer num3 = J.f26918l0;
                    if (num3 != null) {
                        e1Var.setSelectorColor(num3.intValue());
                    } else {
                        e1Var.h(0.12f, k6.E8);
                    }
                    e1Var.setOnClickListener(new org.telegram.ui.Components.f0(J, jVar));
                    int i16 = J.S;
                    if (i16 > 0) {
                        e1Var.setMinimumWidth(AndroidUtilities.dp(i16));
                        J.r(e1Var, w7.z5.n(J.S, -2));
                    } else {
                        J.r(e1Var, w7.z5.n(-1, -2));
                        hashMap.put(i0Var, J.y());
                        size2 = i13;
                        arrayList3 = arrayList;
                    }
                }
                hashMap.put(i0Var, J.y());
                size2 = i13;
                arrayList3 = arrayList;
            }
            i10 = -1;
            C();
            J.S = AndroidUtilities.dp(180.0f);
            G.c(R.drawable.menu_download_round, LocaleController.getString(R.string.BotDownloads), new g2(G, J, 0), false);
            G.k();
        } else {
            i10 = -1;
        }
        if (this.L0 == null && !m10) {
            z10 = true;
        } else {
            z10 = false;
        }
        G.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new y1(this, 9), z10);
        if (this.L0 == null && this.f11161c0) {
            z11 = true;
        } else {
            z11 = false;
        }
        G.l(R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings), new y1(this, 10), z11);
        G.c(R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage), new ah.t(10, this, m10), false);
        if (this.L0 == null && user != null && user.bot_has_main_app) {
            z12 = true;
        } else {
            z12 = false;
        }
        G.l(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new y1(this, 11), z12);
        if (this.L0 == null && !m10) {
            z13 = true;
        } else {
            z13 = false;
        }
        G.l(R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS), new y1(this, 12), z13);
        if (this.L0 == null && !m10) {
            z14 = true;
        } else {
            z14 = false;
        }
        G.l(R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot), new y1(this, 13), z14);
        if (this.L0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu)) {
            z15 = true;
        } else {
            z15 = false;
        }
        G.l(R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot), new y1(this, 14), z15);
        if (this.R != k6.x0(null, k6.f21184d6, false)) {
            if (AndroidUtilities.computePerceivedBrightness(this.R) >= 0.721f) {
                i11 = i10;
            } else {
                i11 = -15198183;
            }
            if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                i12 = -16777216;
            } else {
                i12 = i10;
            }
            int o12 = k6.o1(0.85f, i12);
            int o13 = k6.o1(0.1f, i12);
            G.P(i11);
            for (int i17 = 0; i17 < G.x(); i17++) {
                View w9 = G.w(i17);
                if (w9 instanceof org.telegram.ui.ActionBar.e1) {
                    org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) w9;
                    e1Var2.d(i12, o12);
                    e1Var2.setSelectorColor(o13);
                }
            }
        }
        G.V(5);
        G.a0(-this.f11172n.right, 0.0f);
        G.U = true;
        G.f26930t = false;
        G.f26929s = 0;
        G.Z();
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        A(true);
        c3 c3Var = this.f11164f;
        c3Var.setAlpha(0.0f);
        c3Var.addOnLayoutChangeListener(new o2(this, 0));
        super.show();
        this.Q0 = false;
        f11153a1.add(this);
    }

    public final void t(org.telegram.ui.ActionBar.o2 o2Var, t4 t4Var) {
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
        this.f11185w0 = t4Var;
        int i10 = t4Var.f11491a;
        this.H = i10;
        this.J = t4Var.f11492b;
        this.I = t4Var.f11493c;
        this.L = t4Var.h;
        this.M = t4Var.f11496i;
        this.N = t4Var.e;
        if (t4Var.f11495g == 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            user = null;
        } else {
            user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.I));
        }
        if (z10) {
            userName = t4Var.e;
        } else {
            userName = UserObject.getUserName(user);
        }
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        a3 a3Var = this.X;
        a3Var.setTitle(userName);
        if (z10) {
            userFull = null;
        } else {
            userFull = MessagesController.getInstance(this.H).getUserFull(this.I);
        }
        g6 g6Var = this.F;
        if ((user != null && user.verified) || (userFull != null && (user2 = userFull.user) != null && user2.verified)) {
            this.M0 = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            r6.z(a3Var.getTitleTextView(), this.M0, k6.Oh, g6Var, PorterDuff.Mode.SRC_IN);
            this.M0.setAlpha(255);
            a3Var.getTitleTextView().setDrawablePadding(AndroidUtilities.dp(2.0f));
            a3Var.getTitleTextView().i(new ei.w3(this, 1));
        }
        BotFullscreenButtons botFullscreenButtons = this.f11173n0;
        if (botFullscreenButtons != null) {
            if (z10) {
                userName2 = t4Var.e;
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
        org.telegram.ui.ActionBar.y m10 = a3Var.m();
        m10.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.H).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                i11++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot2;
                userFull2 = userFull;
                if (tL_attachMenuBot3.bot_id == this.I) {
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
        if (!this.F0 && !z10) {
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
                MessagesController.getInstance(this.H).loadFullUser(user, 0, true, new b2(this, 1));
            }
            if (t4Var.f11503p) {
                y(z13, z12, this.f11165f0);
            }
        }
        if (this.L0 == null) {
            m10.a(R.id.menu_collapse_bot, R.drawable.arrow_more);
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = new BotFullscreenButtons.OptionsIcon(getContext());
        this.f11159b0 = optionsIcon;
        org.telegram.ui.ActionBar.u0 d = m10.d(0, optionsIcon);
        this.f11157a0 = d;
        d.setOnClickListener(new h2(this, 1));
        a3Var.setActionBarMenuOnItemClick(new m2(this));
        JSONObject q6 = q(g6Var, false);
        v2 v2Var = this.f11188y;
        v2Var.setBotUser(user);
        if (!z10) {
            v2Var.s(this.H, this.I);
            TLRPC.User user3 = t4Var.f11500m;
            if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu && !MediaDataController.getInstance(this.H).isShortcutAdded(this.I, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
                if (user3 == null) {
                    user3 = MessagesController.getInstance(this.H).getUser(Long.valueOf(this.I));
                }
                if (user3 != null && user3.photo != null && !FileLoader.getInstance(this.H).getPathToAttach(user3.photo.photo_small, true).exists()) {
                    MediaDataController.getInstance(this.H).preloadImage(ImageLocation.getForUser(this.H, user3, 1), 0);
                }
            }
        }
        if (t4Var.f11504q != null) {
            o();
            return;
        }
        switch (t4Var.f11495g) {
            case 0:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = MessagesController.getInstance(this.H).getInputPeer(this.J);
                tL_messages_requestWebView.bot = MessagesController.getInstance(this.H).getInputUser(this.I);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = t4Var.f11502o;
                tL_messages_requestWebView.fullscreen = t4Var.f11503p;
                String str = t4Var.f11494f;
                if (str != null) {
                    tL_messages_requestWebView.url = str;
                    tL_messages_requestWebView.flags |= 2;
                }
                if (this.L != 0) {
                    TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(this.H).createReplyInput(this.L);
                    tL_messages_requestWebView.reply_to = createReplyInput;
                    if (this.M != 0) {
                        createReplyInput.monoforum_peer_id = MessagesController.getInstance(this.H).getInputPeer(this.M);
                        tL_messages_requestWebView.reply_to.flags |= 32;
                    }
                    tL_messages_requestWebView.flags |= 1;
                } else if (this.M != 0) {
                    TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                    tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(this.H).getInputPeer(this.M);
                    tL_messages_requestWebView.flags |= 1;
                }
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON;
                    tL_dataJSON.data = q6.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestWebView, new j2(this, 3));
                NotificationCenter.getInstance(this.H).addObserver(this, NotificationCenter.webViewResultSent);
                return;
            case 1:
                boolean z15 = false;
                TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
                if ((t4Var.f11501n & 1) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                tL_messages_requestSimpleWebView.from_switch_webview = z11;
                tL_messages_requestSimpleWebView.bot = MessagesController.getInstance(this.H).getInputUser(this.I);
                tL_messages_requestSimpleWebView.platform = "android";
                if ((t4Var.f11501n & 2) != 0) {
                    z15 = true;
                }
                tL_messages_requestSimpleWebView.from_side_menu = z15;
                tL_messages_requestSimpleWebView.compact = t4Var.f11502o;
                tL_messages_requestSimpleWebView.fullscreen = t4Var.f11503p;
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = q6.toString();
                    tL_messages_requestSimpleWebView.flags |= 1;
                }
                if (!TextUtils.isEmpty(t4Var.f11494f)) {
                    tL_messages_requestSimpleWebView.flags |= 8;
                    tL_messages_requestSimpleWebView.url = t4Var.f11494f;
                }
                if (!TextUtils.isEmpty(t4Var.f11499l)) {
                    tL_messages_requestSimpleWebView.start_param = t4Var.f11499l;
                    tL_messages_requestSimpleWebView.flags |= 16;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestSimpleWebView, new j2(this, 2));
                return;
            case 2:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView2.bot = MessagesController.getInstance(this.H).getInputUser(this.I);
                tL_messages_requestWebView2.peer = MessagesController.getInstance(this.H).getInputPeer(this.I);
                tL_messages_requestWebView2.platform = "android";
                tL_messages_requestWebView2.compact = t4Var.f11502o;
                tL_messages_requestWebView2.fullscreen = t4Var.f11503p;
                tL_messages_requestWebView2.url = t4Var.f11494f;
                tL_messages_requestWebView2.flags |= 2;
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                    tL_dataJSON3.data = q6.toString();
                    tL_messages_requestWebView2.flags |= 4;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestWebView2, new j2(this, 1));
                NotificationCenter.getInstance(this.H).addObserver(this, NotificationCenter.webViewResultSent);
                return;
            case 3:
                TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                TLRPC.BotApp botApp = t4Var.f11497j;
                tL_inputBotAppID.f20402id = botApp.f20341id;
                tL_inputBotAppID.access_hash = botApp.access_hash;
                tL_messages_requestAppWebView.app = tL_inputBotAppID;
                tL_messages_requestAppWebView.write_allowed = t4Var.f11498k;
                tL_messages_requestAppWebView.platform = "android";
                if (o2Var instanceof sn) {
                    sn snVar = (sn) o2Var;
                    if (snVar.i() != null) {
                        inputPeer = MessagesController.getInputPeer(snVar.i());
                    } else {
                        inputPeer = MessagesController.getInputPeer(snVar.e);
                    }
                } else {
                    inputPeer = MessagesController.getInputPeer(t4Var.f11500m);
                }
                tL_messages_requestAppWebView.peer = inputPeer;
                tL_messages_requestAppWebView.compact = t4Var.f11502o;
                tL_messages_requestAppWebView.fullscreen = t4Var.f11503p;
                if (!TextUtils.isEmpty(t4Var.f11499l)) {
                    tL_messages_requestAppWebView.start_param = t4Var.f11499l;
                    tL_messages_requestAppWebView.flags |= 2;
                }
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                    tL_messages_requestAppWebView.theme_params = tL_dataJSON4;
                    tL_dataJSON4.data = q6.toString();
                    tL_messages_requestAppWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestAppWebView, new j2(this, 4), 66);
                return;
            case 4:
                TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                tL_messages_requestMainWebView.bot = MessagesController.getInstance(this.H).getInputUser(t4Var.f11493c);
                tL_messages_requestMainWebView.platform = "android";
                if (o2Var instanceof sn) {
                    sn snVar2 = (sn) o2Var;
                    if (snVar2.i() != null) {
                        inputPeer2 = MessagesController.getInputPeer(snVar2.i());
                    } else {
                        inputPeer2 = MessagesController.getInputPeer(snVar2.e);
                    }
                } else {
                    inputPeer2 = MessagesController.getInstance(this.H).getInputPeer(t4Var.f11492b);
                }
                tL_messages_requestMainWebView.peer = inputPeer2;
                tL_messages_requestMainWebView.compact = t4Var.f11502o;
                tL_messages_requestMainWebView.fullscreen = t4Var.f11503p;
                if (!TextUtils.isEmpty(t4Var.f11499l)) {
                    tL_messages_requestMainWebView.start_param = t4Var.f11499l;
                    tL_messages_requestMainWebView.flags |= 2;
                }
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                    tL_messages_requestMainWebView.theme_params = tL_dataJSON5;
                    tL_dataJSON5.data = q6.toString();
                    tL_messages_requestMainWebView.flags |= 1;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestMainWebView, new j2(this, 5), 66);
                return;
            case 5:
                TLRPC.TL_messages_requestChatJoinWebView tL_messages_requestChatJoinWebView = new TLRPC.TL_messages_requestChatJoinWebView();
                tL_messages_requestChatJoinWebView.platform = "android";
                tL_messages_requestChatJoinWebView.query_id = t4Var.d;
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
                    tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON6;
                    tL_dataJSON6.data = q6.toString();
                }
                ConnectionsManager.getInstance(this.H).sendRequestTyped(tL_messages_requestChatJoinWebView, new Object(), new ai.q(this, 27), 66);
                return;
            case 6:
                if (!this.F0) {
                    v2Var.t(this.H, t4Var.f11494f, false);
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
        final int i12 = this.R;
        k6.b(0.35f, -0.1f, i10);
        final w1 w1Var = new w1();
        int i13 = 0;
        if (this.V) {
            i11 = this.R;
        } else {
            i11 = 0;
        }
        SparseIntArray sparseIntArray = w1Var.f11552a;
        g6 g6Var = this.F;
        w1Var.c(sparseIntArray, i11, g6Var);
        this.V = z10;
        if (i0.a.h(i10) < 0.7210000157356262d) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.T = z12;
        if (this.V) {
            i13 = i10;
        }
        w1Var.c(w1Var.f11553b, i13, g6Var);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(zr.f33337f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int f7 = i0.a.f(floatValue, i12, i10);
                    d3 d3Var = d3.this;
                    d3Var.R = f7;
                    d3Var.h();
                    c3 c3Var = d3Var.f11164f;
                    c3Var.invalidate();
                    a3 a3Var = d3Var.X;
                    a3Var.setBackgroundColor(d3Var.R);
                    w1 w1Var2 = w1Var;
                    w1Var2.b(a3Var, floatValue);
                    d3Var.f11156a = w1Var2.a(k6.Ii);
                    c3Var.invalidate();
                }
            });
            duration.addListener(new t2(this, i12, i10, w1Var));
            duration.start();
        } else {
            this.R = i10;
            h();
            c3 c3Var = this.f11164f;
            c3Var.invalidate();
            int i14 = this.R;
            a3 a3Var = this.X;
            a3Var.setBackgroundColor(i14);
            w1Var.b(a3Var, 1.0f);
            this.f11156a = w1Var.a(k6.Ii);
            c3Var.invalidate();
        }
        F();
    }

    public final void v(boolean z10) {
        if (this.Z0 == z10) {
            return;
        }
        this.Z0 = z10;
        if (z10) {
            if (this.D0) {
                f11155c1++;
            }
        } else if (this.D0) {
            f11155c1--;
        }
        if (f11155c1 > 0) {
            AndroidUtilities.lockOrientation(l());
        } else {
            AndroidUtilities.unlockOrientation(l());
        }
    }

    public final void w(int i10, boolean z10) {
        Paint paint = this.Q;
        int color = paint.getColor();
        boolean z11 = true;
        this.W = true;
        ValueAnimator valueAnimator = this.T0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            this.T0 = duration;
            duration.setInterpolator(zr.f33337f);
            this.T0.addUpdateListener(new f2(this, color, i10, 0));
            this.T0.addListener(new p2(this, i10, 0));
            this.T0.start();
            return;
        }
        paint.setColor(i10);
        B();
        this.f11164f.invalidate();
        org.telegram.ui.e3 e3Var = this.Y0;
        if (e3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) > 0.721f) {
                z11 = false;
            }
            e3Var.b(z11, false);
            this.Y0.setBackgroundColor(paint.getColor());
        }
        G();
    }

    public final void x(boolean z10) {
        if (this.f11190z0 != z10) {
            this.f11190z0 = z10;
            u2 u2Var = this.f11184w;
            if (u2Var != null) {
                u2Var.setFullSize(n());
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
        if (this.f11163e0 == z10) {
            return;
        }
        this.f11163e0 = z10;
        int i10 = 0;
        if (z12 && !MessagesController.getInstance(this.H).disableBotFullscreenBlur && SharedConfig.getDevicePerformanceClass() >= 2) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f11165f0 = z13;
        ValueAnimator valueAnimator = this.V0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        BotFullscreenButtons botFullscreenButtons = this.f11173n0;
        u2 u2Var = this.f11184w;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setPreview(z10, z11);
            if (this.f11165f0) {
                obj = u2Var.getRenderNode();
            } else {
                obj = null;
            }
            botFullscreenButtons.setParentRenderNode(obj);
        }
        this.f11169j0 = u2Var.getWidth();
        this.f11170k0 = u2Var.getHeight();
        this.U0 = false;
        z2 z2Var = this.m0;
        v2 v2Var = this.f11188y;
        a3 a3Var = this.X;
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
            int i12 = this.f11172n.left;
            if (z10) {
                f11 = i12 + f10;
            } else {
                f11 = (-i12) - f10;
            }
            if (!z10) {
                f10 = -f10;
            }
            if (z10) {
                f12 = u2Var.getTranslationY();
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
            o1.k kVar = u2Var.v;
            if (kVar != null) {
                kVar.c();
            }
            o1.k kVar2 = u2Var.G;
            if (kVar2 != null) {
                kVar2.c();
            }
            u2Var.setSwipeOffsetAnimationDisallowed(true);
            a3Var.setVisibility(0);
            if (z10) {
                u2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                u2Var.setTopActionBarOffsetY(currentActionBarHeight2 - AndroidUtilities.dp(24.0f));
            }
            u2Var.c();
            u2Var.invalidate();
            this.f11167h0 = 0.0f;
            if (z10) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            this.f11166g0 = f13;
            a3Var.setAlpha(1.0f - f13);
            a3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f11166g0);
            u2Var.setTranslationY(AndroidUtilities.lerp(f12, f14, this.f11167h0));
            u2Var.setTranslationX(AndroidUtilities.lerp(f11, 0.0f, this.f11167h0));
            z2Var.setTranslationX(AndroidUtilities.lerp(f10, 0.0f, this.f11167h0));
            botFullscreenButtons.setAlpha(this.f11166g0);
            this.f11164f.invalidate();
            v2Var.setViewPortHeightOffset(u2Var.getTranslationY() - f14);
            v2Var.n(false, false);
            this.f11168i0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.V0 = ofFloat;
            float f15 = f11;
            ofFloat.addUpdateListener(new q2(this, z10, f12, f14, f15, f10));
            this.V0.addListener(new r2(this, z10, currentActionBarHeight2, f15));
            this.V0.setDuration(280L);
            this.V0.setInterpolator(zr.h);
            this.V0.start();
            return;
        }
        this.f11168i0 = false;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f11166g0 = f7;
        this.f11167h0 = 0.0f;
        E();
        H();
        if (z10) {
            i10 = 8;
        }
        a3Var.setVisibility(i10);
        a3Var.setAlpha(1.0f - this.f11166g0);
        a3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f11166g0);
        z2Var.setTranslationX(0.0f);
        botFullscreenButtons.setAlpha(this.f11166g0);
        v2Var.setViewPortHeightOffset(0.0f);
        v2Var.n(true, true);
        D();
    }

    public final void z(int i10, boolean z10) {
        this.I0 = false;
        int i11 = this.S;
        z2 z2Var = this.m0;
        Paint paint = z2Var.f11543a;
        z2Var.e.f281b = i10;
        paint.setColor(i10);
        if (!z10) {
            z2Var.d.a(i10, true);
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(zr.f33337f);
            duration.addUpdateListener(new f2(this, i11, i10, 1));
            duration.addListener(new s2(this, i11, i10, 0));
            duration.start();
        } else {
            this.S = i10;
            h();
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, this.S, false);
    }

    @Override
    public final void dismiss() {
        k(false);
    }

    @Override
    public final void setLastVisible(boolean z10) {
    }
}
