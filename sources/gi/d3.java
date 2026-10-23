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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ga1;
import org.telegram.ui.qn;
import org.telegram.ui.st0;
public final class d3 extends Dialog implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.t3 {
    public static final HashSet W0 = new HashSet();
    public static final ew0 X0;
    public static int Y0;
    public boolean A0;
    public y0 B0;
    public boolean C0;
    public org.telegram.ui.ActionBar.m3 D0;
    public final d6 E;
    public boolean E0;
    public boolean F;
    public boolean F0;
    public int G;
    public float G0;
    public long H;
    public ga1 H0;
    public long I;
    public Drawable I0;
    public long J;
    public final HashMap J0;
    public int K;
    public i80 K0;
    public long L;
    public i0 L0;
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
    public final a3 W;
    public final FrameLayout.LayoutParams X;
    public final Drawable Y;
    public org.telegram.ui.ActionBar.u0 Z;
    public int f11134a;
    public BotFullscreenButtons.OptionsIcon f11135a0;
    public float f11136b;
    public boolean f11137b0;
    public o1.k f11138c;
    public boolean f11139c0;
    public Boolean d;
    public boolean f11140d0;
    public final c3 e;
    public boolean f11141e0;
    public final Rect f11142f;
    public float f11143f0;
    public float f11144g0;
    public final Rect h;
    public boolean f11145h0;
    public int f11146i0;
    public int f11147j0;
    public Activity f11148k0;
    public final z2 f11149l0;
    public final BotFullscreenButtons m0;
    public int f11150n;
    public qc f11151n0;
    public h0 f11152o0;
    public final FrameLayout f11153p0;
    public final FrameLayout.LayoutParams f11154q0;
    public final org.telegram.ui.ActionBar.n3 f11155r;
    public boolean f11156r0;
    public final z5 f11157s;
    public final me0 f11158s0;
    public final y1 f11159t0;
    public int f11160u0;
    public final u2 v;
    public t4 f11161v0;
    public final FrameLayout.LayoutParams f11162w;
    public boolean f11163w0;
    public final v2 f11164x;
    public boolean f11165x0;
    public final b3 f11166y;
    public boolean f11167y0;
    public Boolean f11168z0;

    static {
        ew0 ew0Var = new ew0(new fh.b(7), new fh.b(8));
        ew0Var.f25989c = 100.0f;
        X0 = ew0Var;
        Y0 = 0;
    }

    public d3(Context context, d6 d6Var) {
        super(context, R.style.TransparentDialog);
        Object obj;
        this.f11136b = 0.0f;
        this.f11142f = new Rect();
        this.h = new Rect();
        this.f11150n = 0;
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.N = paint;
        Paint paint2 = new Paint();
        this.O = paint2;
        this.P = new Paint(1);
        this.T = new Paint(1);
        this.f11159t0 = new y1(this, 1);
        this.f11160u0 = -1;
        this.f11167y0 = false;
        this.f11168z0 = null;
        this.J0 = new HashMap();
        this.M0 = false;
        this.Q0 = true;
        this.V0 = false;
        this.E = d6Var;
        this.f11134a = h6.x0(null, h6.Ii, false);
        u2 u2Var = new u2(this, context, 0);
        this.v = u2Var;
        u2Var.setAllowFullSizeSwipe(true);
        u2Var.setShouldWaitWebViewScroll(true);
        int i10 = h6.f20994d6;
        v2 v2Var = new v2(h6.w0(i10, d6Var), 0, context, this, d6Var);
        this.f11164x = v2Var;
        v2Var.setOnVerifiedAge(this.H0);
        v2Var.setDelegate(new y2(this, context, d6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.Q = h6.w0(i10, d6Var);
        int w02 = h6.w0(h6.f20936a7, d6Var);
        this.R = w02;
        AndroidUtilities.setNavigationBarColor((Dialog) this, w02, false);
        c3 c3Var = new c3(this, context);
        this.e = c3Var;
        c3Var.setDelegate(new a2(this, 0));
        FrameLayout.LayoutParams e = w7.z5.e(-1, -1, 49);
        this.f11162w = e;
        c3Var.addView(u2Var, e);
        z2 z2Var = new z2(this, getContext(), d6Var);
        this.f11149l0 = z2Var;
        z2Var.setOnButtonClickListener(new b2(this, 0));
        z2Var.setOnResizeListener(new y1(this, 3));
        c3Var.addView(z2Var, w7.z5.e(-1, -2, 81));
        BotFullscreenButtons botFullscreenButtons = new BotFullscreenButtons(getContext());
        this.m0 = botFullscreenButtons;
        botFullscreenButtons.setAlpha(0.0f);
        botFullscreenButtons.setVisibility(8);
        z10 = (MessagesController.getInstance(this.G).disableBotFullscreenBlur || SharedConfig.getDevicePerformanceClass() < 2) ? false : z10;
        this.f11141e0 = z10;
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
        this.f11153p0 = frameLayout;
        FrameLayout.LayoutParams e7 = w7.z5.e(-1, 200, 55);
        this.f11154q0 = e7;
        c3Var.addView(frameLayout, e7);
        this.Y = getContext().getDrawable(R.drawable.header_shadow).mutate();
        ?? kVar = new org.telegram.ui.ActionBar.k(context, d6Var);
        this.W = kVar;
        kVar.setBackgroundColor(0);
        kVar.setBackButtonImage(R.drawable.ic_close_white);
        B();
        kVar.setActionBarMenuOnItemClick(new ah.s(this, 3));
        kVar.setAlpha(0.0f);
        FrameLayout.LayoutParams e10 = w7.z5.e(-1, -2, 49);
        this.X = e10;
        c3Var.addView((View) kVar, e10);
        ?? z3Var = new z3(context, d6Var);
        this.f11166y = z3Var;
        c3Var.addView((View) z3Var, w7.z5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        v2Var.setWebViewProgressListener(new r7(this, 2));
        u2Var.addView(v2Var, w7.z5.c(-1.0f, -1));
        u2Var.setScrollListener(new y1(this, 7));
        u2Var.setScrollEndListener(new y1(this, 8));
        u2Var.setDelegate(new z1(this));
        u2Var.setIsKeyboardVisible(new z1(this));
        me0 me0Var = new me0(context);
        this.f11158s0 = me0Var;
        c3Var.addView(me0Var, w7.z5.c(-1.0f, -1));
        setContentView(c3Var, new ViewGroup.LayoutParams(-1, -1));
        E();
        LaunchActivity launchActivity = LaunchActivity.H1;
        org.telegram.ui.ActionBar.n3 P = launchActivity != null ? launchActivity.P() : null;
        this.f11155r = P;
        if (P != null) {
            bc bcVar = new bc(c3Var, 9);
            y1 y1Var = new y1(this, 2);
            P.I.add(bcVar);
            P.J.add(y1Var);
            this.f11157s = new z5(P);
        }
    }

    public static void d(d3 d3Var) {
        if (!d3Var.M0) {
            super.dismiss();
            d3Var.M0 = true;
        }
    }

    public static WindowInsets e(d3 d3Var, View view, WindowInsets windowInsets) {
        r0.h1 h1Var = r0.k1.h(view, windowInsets).f44839a;
        i0.b f7 = h1Var.f(2);
        d3Var.f11142f.set(f7.f12283a, f7.f12284b, f7.f12285c, f7.d);
        i0.b f10 = h1Var.f(647);
        Rect rect = d3Var.h;
        rect.set(Math.max(f10.f12283a, windowInsets.getStableInsetLeft()), Math.max(f10.f12284b, windowInsets.getStableInsetTop()), Math.max(f10.f12285c, windowInsets.getStableInsetRight()), Math.max(f10.d, windowInsets.getStableInsetBottom()));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 28) {
            rect.top = Math.max(rect.top, AndroidUtilities.getStatusBarHeight(d3Var.getContext()));
        }
        int i11 = h1Var.f(8).d;
        if (i11 > rect.bottom && i11 > AndroidUtilities.dp(20.0f)) {
            d3Var.f11150n = i11;
        } else {
            d3Var.f11150n = 0;
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
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new q1(i10, j10, tL_attachMenuBot, runnable));
        i2.e.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static JSONObject q(d6 d6Var, final boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int v = h6.v(-16777216, h6.w0(h6.f21065h5, d6Var));
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    int v10 = h6.v(v, ((Integer) obj).intValue());
                    Integer valueOf = Integer.valueOf(v10);
                    if (z10) {
                        return String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(v10)), Integer.valueOf(Color.green(v10)), Integer.valueOf(Color.blue(v10)));
                    }
                    return valueOf;
                }
            };
            jSONObject.put("bg_color", callbackReturn.run(Integer.valueOf(v)));
            jSONObject.put("section_bg_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.f20994d6, d6Var))));
            int i10 = h6.f20936a7;
            jSONObject.put("secondary_bg_color", callbackReturn.run(Integer.valueOf(h6.w0(i10, d6Var))));
            jSONObject.put("text_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.G6, d6Var))));
            jSONObject.put("hint_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.H6, d6Var))));
            jSONObject.put("link_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.J6, d6Var))));
            jSONObject.put("button_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.Oh, d6Var))));
            jSONObject.put("button_text_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.Sh, d6Var))));
            jSONObject.put("header_bg_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.f21273s8, d6Var))));
            jSONObject.put("accent_text_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.q6, d6Var))));
            jSONObject.put("section_header_text_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.L6, d6Var))));
            jSONObject.put("subtitle_text_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.f21399z6, d6Var))));
            jSONObject.put("destructive_text_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.f21215p7, d6Var))));
            jSONObject.put("section_separator_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.f20995d7, d6Var))));
            jSONObject.put("bottom_bar_bg_color", callbackReturn.run(Integer.valueOf(h6.w0(i10, d6Var))));
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
        this.O0.addUpdateListener(new x1(this, 0));
        this.O0.setInterpolator(bs.h);
        this.O0.setDuration(220L);
        this.O0.start();
    }

    public final void B() {
        if (!this.U) {
            int i10 = h6.G6;
            d6 d6Var = this.E;
            int w02 = h6.w0(i10, d6Var);
            a3 a3Var = this.W;
            a3Var.setTitleColor(w02);
            a3Var.C(h6.w0(i10, d6Var), false);
            a3Var.B(h6.w0(h6.f21312u8, d6Var), false);
            a3Var.D(h6.w0(h6.G8, d6Var), false);
            a3Var.E(h6.w0(h6.E8, d6Var), false, false);
            a3Var.E(h6.w0(h6.F8, d6Var), true, false);
            a3Var.F(h6.w0(h6.I5, d6Var), false);
        }
        this.f11164x.setFlickerViewColor(this.P.getColor());
    }

    public final void C() {
        qc qcVar;
        boolean z10;
        j0 c10 = j0.c(getContext(), this.G, this.H);
        ArrayList arrayList = c10.e;
        i0 i0Var = c10.f11276f;
        boolean z11 = true;
        if (i0Var == null) {
            qc qcVar2 = this.f11151n0;
            if (qcVar2 != null) {
                qcVar2.b();
                this.f11151n0 = null;
            }
        } else if ((i0Var.c() && !i0Var.f11258l) || i0Var.f11257k) {
            if (this.L0 != i0Var && (qcVar = this.f11151n0) != null) {
                qcVar.b();
                this.f11151n0 = null;
            }
            qc qcVar3 = this.f11151n0;
            if (qcVar3 == null || !qcVar3.f29537l) {
                this.L0 = i0Var;
                h0 h0Var = new h0(getContext(), this.E);
                this.f11152o0 = h0Var;
                qc f7 = qc.f(this.f11153p0, h0Var, 5000);
                this.f11151n0 = f7;
                f7.k(true);
            }
            if (this.f11152o0.c(i0Var)) {
                this.f11151n0 = null;
            }
            i0Var.f11257k = false;
            i0Var.f11258l = true;
        } else {
            h0 h0Var2 = this.f11152o0;
            if (h0Var2 != null) {
                this.L0 = i0Var;
                if (h0Var2.c(i0Var)) {
                    this.f11151n0 = null;
                }
            }
        }
        D();
        for (Map.Entry entry : this.J0.entrySet()) {
            org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) entry.getValue();
            i0 i0Var2 = (i0) entry.getKey();
            e1Var.setText(i0Var2.f11252c);
            if (!i0Var2.c()) {
                e1Var.setSubtext(AndroidUtilities.formatFileSize(i0Var2.f11254g));
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
                e1Var.f20766b.setPadding(0, 0, AndroidUtilities.dp(32.0f), 0);
            } else if (i0Var2.f11255i) {
                e1Var.setVisibility(8);
            } else {
                e1Var.setRightIcon(0);
                e1Var.f20766b.setPadding(0, 0, 0, 0);
            }
            e1Var.setOnClickListener(new ai.p(18, this, i0Var2));
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = this.f11135a0;
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
        this.m0.setDownloading(z11);
    }

    public final void D() {
        h0 h0Var = this.f11152o0;
        if (h0Var == null) {
            return;
        }
        if (this.f11140d0) {
            h0Var.setArrow(AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(26.0f), this.f11143f0));
        } else if (this.f11136b > 0.5f) {
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
        BotFullscreenButtons botFullscreenButtons = this.m0;
        Rect rect = this.h;
        botFullscreenButtons.setInsets(rect);
        boolean z10 = this.f11140d0;
        v2 v2Var = this.f11164x;
        c3 c3Var = this.e;
        z2 z2Var = this.f11149l0;
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
            if (this.f11150n > i14 || (z2Var != null && z2Var.getTotalHeight() > 0)) {
                i15 = 0;
            } else {
                i15 = rect.bottom;
            }
            Rect rect2 = new Rect(i17, i18, i19, i15);
            int dp = AndroidUtilities.dp(46.0f);
            v2Var.P(rect2, false);
            v2Var.O(dp, false);
            c3Var.setPadding(0, 0, 0, Math.max(this.f11150n, i14));
        } else {
            v2Var.P(new Rect(0, 0, 0, 0), false);
            v2Var.O(0, false);
            int i20 = rect.left;
            int i21 = rect.right;
            int i22 = this.f11150n;
            org.telegram.ui.ActionBar.n3 n3Var = this.f11155r;
            if (n3Var != null) {
                i10 = n3Var.H;
            } else {
                i10 = 0;
            }
            c3Var.setPadding(i20, 0, i21, Math.max(i22, i10 + rect.bottom));
        }
        this.f11162w.topMargin = AndroidUtilities.dp(24.0f);
        boolean z11 = this.f11140d0;
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
        FrameLayout.LayoutParams layoutParams2 = this.f11154q0;
        layoutParams2.leftMargin = i12;
        if (!z11) {
            i13 = 0;
        } else {
            i13 = rect.right;
        }
        layoutParams2.rightMargin = i13;
        boolean z12 = this.f11145h0;
        u2 u2Var = this.v;
        if (!z12) {
            u2Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f11140d0) {
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
        if (!this.f11140d0) {
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
            z10 = (AndroidUtilities.isTablet() || i0.a.h(h6.x0(null, h6.f20994d6, true)) < 0.7210000157356262d || this.f11136b < 0.85f) ? false : false;
        }
        Boolean bool = this.d;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        this.d = Boolean.valueOf(z10);
        c3 c3Var = this.e;
        int systemUiVisibility = c3Var.getSystemUiVisibility();
        if (z10) {
            i10 = systemUiVisibility | 8192;
        } else {
            i10 = systemUiVisibility & (-8193);
        }
        c3Var.setSystemUiVisibility(i10);
    }

    public final void G() {
        org.telegram.ui.web.x0 webView;
        v2 v2Var = this.f11164x;
        if (v2Var == null || (webView = v2Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.P.getColor());
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
            boolean z10 = this.f11140d0;
            if (z10) {
                attributes.flags = i10 | attributes.flags;
            } else {
                attributes.flags = (~i10) & attributes.flags;
            }
            c3 c3Var = this.e;
            if (z10 && (((z2Var = this.f11149l0) == null || z2Var.getTotalHeight() <= 0) && !c3Var.f11113x0)) {
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
    public final org.telegram.ui.ActionBar.m3 a() {
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        boolean booleanValue;
        float f7;
        org.telegram.ui.ActionBar.m3 m3Var = new org.telegram.ui.ActionBar.m3();
        m3Var.f21599q = this.Q;
        m3Var.f21598p = this.f11160u0;
        m3Var.f21596n = this.U;
        m3Var.f21597o = this.V;
        m3Var.f21600r = this.P.getColor();
        m3Var.f21586a = this.f11161v0;
        boolean z13 = false;
        v2 v2Var = this.f11164x;
        if (v2Var != null && v2Var.N) {
            z10 = true;
        } else {
            z10 = false;
        }
        m3Var.f21602t = z10;
        m3Var.D = h6.I.q();
        org.telegram.ui.web.x0 x0Var = null;
        if (v2Var != null) {
            str = v2Var.getUrlLoaded();
        } else {
            str = null;
        }
        m3Var.f21605x = str;
        if (v2Var != null && v2Var.f42590t0) {
            z11 = true;
        } else {
            z11 = false;
        }
        m3Var.e = z11;
        if (v2Var != null) {
            str2 = v2Var.getTrustedOrigin();
        } else {
            str2 = null;
        }
        m3Var.f21589f = str2;
        u2 u2Var = this.v;
        if ((u2Var == null || u2Var.getSwipeOffsetY() >= 0.0f) && !this.f11165x0 && !n() && !this.f11140d0) {
            z12 = false;
        } else {
            z12 = true;
        }
        m3Var.f21592j = z12;
        m3Var.f21607z = this.f11140d0;
        m3Var.A = this.f11141e0;
        Boolean bool = this.f11168z0;
        if (bool == null) {
            booleanValue = this.f11167y0;
        } else {
            booleanValue = bool.booleanValue();
        }
        m3Var.B = booleanValue;
        if (u2Var != null) {
            f7 = u2Var.getOffsetY();
        } else {
            f7 = Float.MAX_VALUE;
        }
        m3Var.f21593k = f7;
        m3Var.C = this.A0;
        m3Var.f21603u = this.f11163w0;
        m3Var.f21606y = this.f11156r0;
        m3Var.v = this.f11137b0;
        if (u2Var == null || u2Var.M) {
            z13 = true;
        }
        m3Var.f21594l = z13;
        m3Var.f21604w = this.f11149l0.e;
        m3Var.f21601s = this.R;
        y0 y0Var = this.B0;
        if (y0Var != null) {
            y0Var.b();
        }
        m3Var.K = this.B0;
        if (v2Var != null) {
            x0Var = v2Var.getWebView();
        }
        if (x0Var != null) {
            v2Var.L();
            m3Var.f21587b = x0Var;
            m3Var.d = v2Var.getBotProxy();
            m3Var.f21590g = x0Var.getWidth();
            m3Var.h = x0Var.getHeight();
            x0Var.onPause();
        }
        boolean z14 = this.S0;
        m3Var.G = z14;
        if (z14) {
            m3Var.H = this.T0;
        }
        m3Var.L = this.C0;
        this.D0 = m3Var;
        return m3Var;
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
            this.e.invalidate();
            this.f11164x.f42581n.b(h6.w0(h6.f20994d6, this.E), 153);
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
            boolean q6 = h6.I.q();
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
        return i0.a.f(this.N0, i10, this.R);
    }

    @Override
    public final org.telegram.ui.ActionBar.u3 mo36getWindowView() {
        return this.e;
    }

    public final void h() {
        LaunchActivity launchActivity;
        if (!this.M0 && (launchActivity = LaunchActivity.H1) != null) {
            launchActivity.H(true, true, true);
        }
        c3 c3Var = this.e;
        if (c3Var != null) {
            c3Var.invalidate();
        }
    }

    public final void i() {
        if (this.U0 == null) {
            org.telegram.ui.f3 f3Var = new org.telegram.ui.f3(getContext());
            this.U0 = f3Var;
            this.v.addView(f3Var, w7.z5.c(-1.0f, -1));
            this.U0.setTranslationY(-1.0f);
            this.U0.h.setOnClickListener(new h2(this, 0));
            this.U0.setBackgroundColor(this.P.getColor());
            AndroidUtilities.updateViewVisibilityAnimated(this.U0, this.S0, 1.0f, false);
        }
    }

    public final void k(boolean z10) {
        int i10;
        LaunchActivity launchActivity;
        if (this.f11139c0) {
            return;
        }
        int i11 = 0;
        if (this.H0 != null) {
            z10 = false;
        }
        this.f11139c0 = true;
        A(false);
        AndroidUtilities.cancelRunOnUIThread(this.f11159t0);
        NotificationCenter.getInstance(this.G).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getInstance(this.G).removeObserver(this, NotificationCenter.botDownloadsUpdate);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        if (z10 && ((launchActivity = LaunchActivity.H1) == null || launchActivity.f33206y0 == null)) {
            z10 = false;
        }
        if (z10) {
            o1.k kVar = this.f11138c;
            if (kVar != null) {
                kVar.f17559u.f17565i = 0.0f;
                kVar.h();
            }
            LaunchActivity.H1.f33206y0.b(this);
        } else {
            z2 z2Var = this.f11149l0;
            if (z2Var != null) {
                z2Var.animate().translationY(z2Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(bs.h).start();
            }
            this.f11164x.h();
            u2 u2Var = this.v;
            int height = u2Var.getHeight();
            if (z2Var != null) {
                i10 = z2Var.getTotalHeight();
            } else {
                i10 = 0;
            }
            int i12 = height + i10;
            Rect rect = this.h;
            int R = this.e.R() + i12 + rect.top + rect.bottom;
            if (n()) {
                i11 = AndroidUtilities.dp(200.0f);
            }
            u2Var.f(R + i11, true, new y1(this, 0));
        }
        W0.remove(this);
    }

    public final Activity l() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            ownerActivity = LaunchActivity.H1;
        }
        if (ownerActivity == null) {
            return AndroidUtilities.findActivity(getContext());
        }
        return ownerActivity;
    }

    public final boolean m() {
        t4 t4Var = this.f11161v0;
        if (t4Var != null && t4Var.f11469g == 6) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (!this.f11140d0) {
            Boolean bool = this.f11168z0;
            if (bool == null) {
                if (!this.f11167y0) {
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
        if (this.f11161v0 != null) {
            long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.f11161v0.f11479r));
            String str = null;
            this.f11168z0 = null;
            TLObject tLObject = this.f11161v0.f11478q;
            if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                this.J = tL_webViewResultUrl.query_id;
                str = tL_webViewResultUrl.url;
                z10 = tL_webViewResultUrl.same_origin;
                this.f11168z0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
                boolean z11 = this.E0;
                if (!z11) {
                    y(tL_webViewResultUrl.fullscreen, !z11, this.f11141e0);
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
                MediaDataController.getInstance(this.G).increaseWebappRating(this.f11161v0.f11467c);
                this.f11164x.t(this.G, str, z10);
            }
            AndroidUtilities.runOnUIThread(this.f11159t0, max);
            u2 u2Var = this.v;
            if (u2Var != null) {
                u2Var.setFullSize(n());
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(true);
        if (this.f11138c == null) {
            o1.k kVar = new o1.k(this, X0);
            o1.l lVar = new o1.l();
            lVar.b(1200.0f);
            lVar.a(1.0f);
            kVar.f17559u = lVar;
            this.f11138c = kVar;
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f11158s0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else if (this.f11164x.C()) {
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
        if (this.f11140d0) {
            attributes.flags = i12 | 512;
        } else {
            attributes.flags = i11 & (-515);
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        c3 c3Var = this.e;
        c3Var.setFitsSystemWindows(true);
        c3Var.setSystemUiVisibility(1792);
        c3Var.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return d3.e(d3.this, view, windowInsets);
            }
        });
        if (this.f11140d0 && ((z2Var = this.f11149l0) == null || z2Var.getTotalHeight() <= 0)) {
            c3Var.setSystemUiVisibility(c3Var.getSystemUiVisibility() | 2);
        } else {
            c3Var.setSystemUiVisibility(c3Var.getSystemUiVisibility() & (-3));
        }
        if (i10 >= 26) {
            if (i0.a.h(this.R) < 0.7210000157356262d) {
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
        o1.k kVar = this.f11138c;
        if (kVar != null) {
            kVar.c();
            this.f11138c = null;
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
            ((LaunchActivity) context).B0.add(this.f11158s0);
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
            ((LaunchActivity) context).B0.remove(this.f11158s0);
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
        if (this.f11156r0) {
            TLRPC.User user = MessagesController.getInstance(this.G).getUser(Long.valueOf(this.H));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            alertDialog$Builder.f20609a.R = str;
            alertDialog$Builder.f20609a.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new z1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
            b2Var.show();
            ((TextView) b2Var.d(-1)).setTextColor(h6.w0(h6.f21232q7, this.E));
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
        i80 i80Var = this.K0;
        if (i80Var != null) {
            i80Var.u();
        }
        if (this.f11140d0) {
            view = this.m0;
        } else {
            view = this.Z;
        }
        i80 G = i80.G(this.e, this.E, view, true);
        this.K0 = G;
        ArrayList arrayList3 = j0.c(getContext(), this.G, this.H).e;
        HashMap hashMap = this.J0;
        hashMap.clear();
        if (!arrayList3.isEmpty()) {
            i80 J = G.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new st0(G, 26), false);
            J.k();
            int size2 = arrayList3.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj = arrayList3.get(i15);
                i15++;
                i0 i0Var = (i0) obj;
                String str = i0Var.f11252c;
                ah.j jVar = new ah.j(15);
                d6 d6Var = J.d;
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
                    Integer num = J.f27174j0;
                    if (num != null) {
                        w02 = num.intValue();
                    } else {
                        w02 = h6.w0(h6.E8, d6Var);
                    }
                    Integer num2 = J.f27176k0;
                    if (num2 != null) {
                        w03 = num2.intValue();
                    } else {
                        w03 = h6.w0(h6.F8, d6Var);
                    }
                    e1Var.c(w02, w03);
                    Integer num3 = J.f27178l0;
                    if (num3 != null) {
                        m12 = num3.intValue();
                    } else {
                        m12 = h6.m1(0.12f, h6.w0(h6.E8, d6Var));
                    }
                    e1Var.setSelectorColor(m12);
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
        if (this.H0 == null && !m10) {
            z10 = true;
        } else {
            z10 = false;
        }
        G.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new y1(this, 9), z10);
        if (this.H0 == null && this.f11137b0) {
            z11 = true;
        } else {
            z11 = false;
        }
        G.l(R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings), new y1(this, 10), z11);
        G.c(R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage), new ah.t(10, this, m10), false);
        if (this.H0 == null && user != null && user.bot_has_main_app) {
            z12 = true;
        } else {
            z12 = false;
        }
        G.l(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new y1(this, 11), z12);
        if (this.H0 == null && !m10) {
            z13 = true;
        } else {
            z13 = false;
        }
        G.l(R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS), new y1(this, 12), z13);
        if (this.H0 == null && !m10) {
            z14 = true;
        } else {
            z14 = false;
        }
        G.l(R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot), new y1(this, 13), z14);
        if (this.H0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu)) {
            z15 = true;
        } else {
            z15 = false;
        }
        G.l(R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot), new y1(this, 14), z15);
        if (this.Q != h6.x0(null, h6.f20994d6, false)) {
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
            int m13 = h6.m1(0.85f, i12);
            int m14 = h6.m1(0.1f, i12);
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
        G.f27190t = false;
        G.f27189s = 0;
        G.Z();
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        A(true);
        c3 c3Var = this.e;
        c3Var.setAlpha(0.0f);
        c3Var.addOnLayoutChangeListener(new o2(this, 0));
        super.show();
        this.M0 = false;
        W0.add(this);
    }

    public final void t(org.telegram.ui.ActionBar.n2 n2Var, t4 t4Var) {
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
        this.f11161v0 = t4Var;
        int i10 = t4Var.f11465a;
        this.G = i10;
        this.I = t4Var.f11466b;
        this.H = t4Var.f11467c;
        this.K = t4Var.h;
        this.L = t4Var.f11470i;
        this.M = t4Var.e;
        if (t4Var.f11469g == 6) {
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
        a3 a3Var = this.W;
        a3Var.setTitle(userName);
        if (z10) {
            userFull = null;
        } else {
            userFull = MessagesController.getInstance(this.G).getUserFull(this.H);
        }
        d6 d6Var = this.E;
        if ((user != null && user.verified) || (userFull != null && (user2 = userFull.user) != null && user2.verified)) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            this.I0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.Oh, d6Var), PorterDuff.Mode.SRC_IN));
            this.I0.setAlpha(255);
            a3Var.getTitleTextView().setDrawablePadding(AndroidUtilities.dp(2.0f));
            a3Var.getTitleTextView().i(new ei.w3(this, 1));
        }
        BotFullscreenButtons botFullscreenButtons = this.m0;
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
        org.telegram.ui.ActionBar.y n10 = a3Var.n();
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
                MessagesController.getInstance(this.G).loadFullUser(user, 0, true, new b2(this, 1));
            }
            if (t4Var.f11477p) {
                y(z13, z12, this.f11141e0);
            }
        }
        if (this.H0 == null) {
            n10.a(R.id.menu_collapse_bot, R.drawable.arrow_more);
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = new BotFullscreenButtons.OptionsIcon(getContext());
        this.f11135a0 = optionsIcon;
        org.telegram.ui.ActionBar.u0 d = n10.d(0, optionsIcon);
        this.Z = d;
        d.setOnClickListener(new h2(this, 1));
        a3Var.setActionBarMenuOnItemClick(new m2(this));
        JSONObject q6 = q(d6Var, false);
        v2 v2Var = this.f11164x;
        v2Var.setBotUser(user);
        if (!z10) {
            v2Var.s(this.G, this.H);
            TLRPC.User user3 = t4Var.f11474m;
            if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu && !MediaDataController.getInstance(this.G).isShortcutAdded(this.H, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
                if (user3 == null) {
                    user3 = MessagesController.getInstance(this.G).getUser(Long.valueOf(this.H));
                }
                if (user3 != null && user3.photo != null && !FileLoader.getInstance(this.G).getPathToAttach(user3.photo.photo_small, true).exists()) {
                    MediaDataController.getInstance(this.G).preloadImage(ImageLocation.getForUser(this.G, user3, 1), 0);
                }
            }
        }
        if (t4Var.f11478q != null) {
            o();
            return;
        }
        switch (t4Var.f11469g) {
            case 0:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = MessagesController.getInstance(this.G).getInputPeer(this.I);
                tL_messages_requestWebView.bot = MessagesController.getInstance(this.G).getInputUser(this.H);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = t4Var.f11476o;
                tL_messages_requestWebView.fullscreen = t4Var.f11477p;
                String str = t4Var.f11468f;
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
                ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestWebView, new j2(this, 3));
                NotificationCenter.getInstance(this.G).addObserver(this, NotificationCenter.webViewResultSent);
                return;
            case 1:
                boolean z15 = false;
                TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
                if ((t4Var.f11475n & 1) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                tL_messages_requestSimpleWebView.from_switch_webview = z11;
                tL_messages_requestSimpleWebView.bot = MessagesController.getInstance(this.G).getInputUser(this.H);
                tL_messages_requestSimpleWebView.platform = "android";
                if ((t4Var.f11475n & 2) != 0) {
                    z15 = true;
                }
                tL_messages_requestSimpleWebView.from_side_menu = z15;
                tL_messages_requestSimpleWebView.compact = t4Var.f11476o;
                tL_messages_requestSimpleWebView.fullscreen = t4Var.f11477p;
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = q6.toString();
                    tL_messages_requestSimpleWebView.flags |= 1;
                }
                if (!TextUtils.isEmpty(t4Var.f11468f)) {
                    tL_messages_requestSimpleWebView.flags |= 8;
                    tL_messages_requestSimpleWebView.url = t4Var.f11468f;
                }
                if (!TextUtils.isEmpty(t4Var.f11473l)) {
                    tL_messages_requestSimpleWebView.start_param = t4Var.f11473l;
                    tL_messages_requestSimpleWebView.flags |= 16;
                }
                ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestSimpleWebView, new j2(this, 2));
                return;
            case 2:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView2.bot = MessagesController.getInstance(this.G).getInputUser(this.H);
                tL_messages_requestWebView2.peer = MessagesController.getInstance(this.G).getInputPeer(this.H);
                tL_messages_requestWebView2.platform = "android";
                tL_messages_requestWebView2.compact = t4Var.f11476o;
                tL_messages_requestWebView2.fullscreen = t4Var.f11477p;
                tL_messages_requestWebView2.url = t4Var.f11468f;
                tL_messages_requestWebView2.flags |= 2;
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                    tL_dataJSON3.data = q6.toString();
                    tL_messages_requestWebView2.flags |= 4;
                }
                ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestWebView2, new j2(this, 1));
                NotificationCenter.getInstance(this.G).addObserver(this, NotificationCenter.webViewResultSent);
                return;
            case 3:
                TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                TLRPC.BotApp botApp = t4Var.f11471j;
                tL_inputBotAppID.f20338id = botApp.f20277id;
                tL_inputBotAppID.access_hash = botApp.access_hash;
                tL_messages_requestAppWebView.app = tL_inputBotAppID;
                tL_messages_requestAppWebView.write_allowed = t4Var.f11472k;
                tL_messages_requestAppWebView.platform = "android";
                if (n2Var instanceof qn) {
                    qn qnVar = (qn) n2Var;
                    if (qnVar.i() != null) {
                        inputPeer = MessagesController.getInputPeer(qnVar.i());
                    } else {
                        inputPeer = MessagesController.getInputPeer(qnVar.e);
                    }
                } else {
                    inputPeer = MessagesController.getInputPeer(t4Var.f11474m);
                }
                tL_messages_requestAppWebView.peer = inputPeer;
                tL_messages_requestAppWebView.compact = t4Var.f11476o;
                tL_messages_requestAppWebView.fullscreen = t4Var.f11477p;
                if (!TextUtils.isEmpty(t4Var.f11473l)) {
                    tL_messages_requestAppWebView.start_param = t4Var.f11473l;
                    tL_messages_requestAppWebView.flags |= 2;
                }
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                    tL_messages_requestAppWebView.theme_params = tL_dataJSON4;
                    tL_dataJSON4.data = q6.toString();
                    tL_messages_requestAppWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestAppWebView, new j2(this, 4), 66);
                return;
            case 4:
                TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                tL_messages_requestMainWebView.bot = MessagesController.getInstance(this.G).getInputUser(t4Var.f11467c);
                tL_messages_requestMainWebView.platform = "android";
                if (n2Var instanceof qn) {
                    qn qnVar2 = (qn) n2Var;
                    if (qnVar2.i() != null) {
                        inputPeer2 = MessagesController.getInputPeer(qnVar2.i());
                    } else {
                        inputPeer2 = MessagesController.getInputPeer(qnVar2.e);
                    }
                } else {
                    inputPeer2 = MessagesController.getInstance(this.G).getInputPeer(t4Var.f11466b);
                }
                tL_messages_requestMainWebView.peer = inputPeer2;
                tL_messages_requestMainWebView.compact = t4Var.f11476o;
                tL_messages_requestMainWebView.fullscreen = t4Var.f11477p;
                if (!TextUtils.isEmpty(t4Var.f11473l)) {
                    tL_messages_requestMainWebView.start_param = t4Var.f11473l;
                    tL_messages_requestMainWebView.flags |= 2;
                }
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                    tL_messages_requestMainWebView.theme_params = tL_dataJSON5;
                    tL_dataJSON5.data = q6.toString();
                    tL_messages_requestMainWebView.flags |= 1;
                }
                ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestMainWebView, new j2(this, 5), 66);
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
                ConnectionsManager.getInstance(this.G).sendRequestTyped(tL_messages_requestChatJoinWebView, new Object(), new ai.q(this, 27), 66);
                return;
            case 6:
                if (!this.E0) {
                    v2Var.t(this.G, t4Var.f11468f, false);
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
        h6.b(0.35f, -0.1f, i10);
        final w1 w1Var = new w1();
        int i13 = 0;
        if (this.U) {
            i11 = this.Q;
        } else {
            i11 = 0;
        }
        SparseIntArray sparseIntArray = w1Var.f11525a;
        d6 d6Var = this.E;
        w1Var.c(sparseIntArray, i11, d6Var);
        this.U = z10;
        if (i0.a.h(i10) < 0.7210000157356262d) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.S = z12;
        if (this.U) {
            i13 = i10;
        }
        w1Var.c(w1Var.f11526b, i13, d6Var);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(bs.f25025f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int f7 = i0.a.f(floatValue, i12, i10);
                    d3 d3Var = d3.this;
                    d3Var.Q = f7;
                    d3Var.h();
                    c3 c3Var = d3Var.e;
                    c3Var.invalidate();
                    a3 a3Var = d3Var.W;
                    a3Var.setBackgroundColor(d3Var.Q);
                    w1 w1Var2 = w1Var;
                    w1Var2.b(a3Var, floatValue);
                    d3Var.f11134a = w1Var2.a(h6.Ii);
                    c3Var.invalidate();
                }
            });
            duration.addListener(new t2(this, i12, i10, w1Var));
            duration.start();
        } else {
            this.Q = i10;
            h();
            c3 c3Var = this.e;
            c3Var.invalidate();
            int i14 = this.Q;
            a3 a3Var = this.W;
            a3Var.setBackgroundColor(i14);
            w1Var.b(a3Var, 1.0f);
            this.f11134a = w1Var.a(h6.Ii);
            c3Var.invalidate();
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
            duration.setInterpolator(bs.f25025f);
            this.P0.addUpdateListener(new f2(this, color, i10, 0));
            this.P0.addListener(new p2(this, i10, 0));
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
        if (this.f11167y0 != z10) {
            this.f11167y0 = z10;
            u2 u2Var = this.v;
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
        if (this.f11140d0 == z10) {
            return;
        }
        this.f11140d0 = z10;
        int i10 = 0;
        if (z12 && !MessagesController.getInstance(this.G).disableBotFullscreenBlur && SharedConfig.getDevicePerformanceClass() >= 2) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f11141e0 = z13;
        ValueAnimator valueAnimator = this.R0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        BotFullscreenButtons botFullscreenButtons = this.m0;
        u2 u2Var = this.v;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setPreview(z10, z11);
            if (this.f11141e0) {
                obj = u2Var.getRenderNode();
            } else {
                obj = null;
            }
            botFullscreenButtons.setParentRenderNode(obj);
        }
        this.f11146i0 = u2Var.getWidth();
        this.f11147j0 = u2Var.getHeight();
        this.Q0 = false;
        z2 z2Var = this.f11149l0;
        v2 v2Var = this.f11164x;
        a3 a3Var = this.W;
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
            this.f11144g0 = 0.0f;
            if (z10) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            this.f11143f0 = f13;
            a3Var.setAlpha(1.0f - f13);
            a3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f11143f0);
            u2Var.setTranslationY(AndroidUtilities.lerp(f12, f14, this.f11144g0));
            u2Var.setTranslationX(AndroidUtilities.lerp(f11, 0.0f, this.f11144g0));
            z2Var.setTranslationX(AndroidUtilities.lerp(f10, 0.0f, this.f11144g0));
            botFullscreenButtons.setAlpha(this.f11143f0);
            this.e.invalidate();
            v2Var.setViewPortHeightOffset(u2Var.getTranslationY() - f14);
            v2Var.n(false, false);
            this.f11145h0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.R0 = ofFloat;
            float f15 = f11;
            ofFloat.addUpdateListener(new q2(this, z10, f12, f14, f15, f10));
            this.R0.addListener(new r2(this, z10, currentActionBarHeight2, f15));
            this.R0.setDuration(280L);
            this.R0.setInterpolator(bs.h);
            this.R0.start();
            return;
        }
        this.f11145h0 = false;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f11143f0 = f7;
        this.f11144g0 = 0.0f;
        E();
        H();
        if (z10) {
            i10 = 8;
        }
        a3Var.setVisibility(i10);
        a3Var.setAlpha(1.0f - this.f11143f0);
        a3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f11143f0);
        z2Var.setTranslationX(0.0f);
        botFullscreenButtons.setAlpha(this.f11143f0);
        v2Var.setViewPortHeightOffset(0.0f);
        v2Var.n(true, true);
        D();
    }

    public final void z(int i10, boolean z10) {
        int i11 = this.R;
        z2 z2Var = this.f11149l0;
        Paint paint = z2Var.f11516a;
        z2Var.e.f281b = i10;
        paint.setColor(i10);
        if (!z10) {
            z2Var.d.a(i10, true);
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(bs.f25025f);
            duration.addUpdateListener(new f2(this, i11, i10, 1));
            duration.addListener(new s2(this, i11, i10, 0));
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
