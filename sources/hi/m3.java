package hi;

import a8.me;
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
import bi.n7;
import fi.ua;
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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.le0;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.na1;
import org.telegram.ui.un;
import org.telegram.ui.zt0;
public final class m3 extends Dialog implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.y3 {
    public static final HashSet f13098a1 = new HashSet();
    public static final pw0 f13099b1;
    public static int f13100c1;
    public Boolean A0;
    public boolean B0;
    public f1 C0;
    public boolean D0;
    public final k3 E;
    public org.telegram.ui.ActionBar.r3 E0;
    public final u6 F;
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
    public na1 L0;
    public long M;
    public Drawable M0;
    public String N;
    public final HashMap N0;
    public final Paint O;
    public k80 O0;
    public final Paint P;
    public p0 P0;
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
    public final j3 X;
    public String X0;
    public final FrameLayout.LayoutParams Y;
    public org.telegram.ui.c3 Y0;
    public final Drawable Z;
    public boolean Z0;
    public int f13101a;
    public org.telegram.ui.ActionBar.w0 f13102a0;
    public int f13103b;
    public BotFullscreenButtons.OptionsIcon f13104b0;
    public float f13105c;
    public boolean f13106c0;
    public o1.j d;
    public boolean f13107d0;
    public Boolean e;
    public boolean f13108e0;
    public final l3 f13109f;
    public boolean f13110f0;
    public float f13111g0;
    public final Rect h;
    public float f13112h0;
    public boolean f13113i0;
    public int f13114j0;
    public int f13115k0;
    public Activity f13116l0;
    public final i3 m0;
    public final Rect f13117n;
    public final BotFullscreenButtons f13118n0;
    public qc f13119o0;
    public o0 f13120p0;
    public final FrameLayout f13121q0;
    public int f13122r;
    public final FrameLayout.LayoutParams f13123r0;
    public final org.telegram.ui.ActionBar.s3 f13124s;
    public boolean f13125s0;
    public final le0 f13126t0;
    public final g2 f13127u0;
    public final me v;
    public int f13128v0;
    public final d3 f13129w;
    public c5 f13130w0;
    public final FrameLayout.LayoutParams f13131x;
    public boolean f13132x0;
    public final e3 f13133y;
    public boolean f13134y0;
    public boolean f13135z0;

    static {
        pw0 pw0Var = new pw0(new gh.a(12), new gh.a(13));
        pw0Var.f31730c = 100.0f;
        f13099b1 = pw0Var;
        f13100c1 = 0;
    }

    public m3(Context context, u6 u6Var) {
        super(context, R.style.TransparentDialog);
        Object obj;
        this.f13105c = 0.0f;
        this.h = new Rect();
        this.f13117n = new Rect();
        this.f13122r = 0;
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.O = paint;
        Paint paint2 = new Paint();
        this.P = paint2;
        this.Q = new Paint(1);
        this.U = new Paint(1);
        this.f13127u0 = new g2(this, 1);
        this.f13128v0 = -1;
        this.f13135z0 = false;
        this.A0 = null;
        this.I0 = true;
        this.N0 = new HashMap();
        this.Q0 = false;
        this.U0 = true;
        this.Z0 = false;
        this.F = u6Var;
        int x02 = y6.x0(null, y6.Ii, false);
        this.f13103b = x02;
        this.f13101a = x02;
        d3 d3Var = new d3(this, context, 0);
        this.f13129w = d3Var;
        d3Var.setAllowFullSizeSwipe(true);
        d3Var.setShouldWaitWebViewScroll(true);
        int i10 = y6.f23356d6;
        e3 e3Var = new e3(y6.w0(i10, u6Var), 0, context, this, u6Var);
        this.f13133y = e3Var;
        e3Var.setOnVerifiedAge(this.L0);
        e3Var.setDelegate(new h3(this, context, u6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.R = y6.w0(i10, u6Var);
        int w02 = y6.w0(y6.f23299a7, u6Var);
        this.S = w02;
        AndroidUtilities.setNavigationBarColor((Dialog) this, w02, false);
        l3 l3Var = new l3(this, context);
        this.f13109f = l3Var;
        l3Var.setDelegate(new i2(this, 0));
        FrameLayout.LayoutParams i11 = gb1.i(-1, -1, 49);
        this.f13131x = i11;
        l3Var.addView(d3Var, i11);
        i3 i3Var = new i3(this, getContext(), u6Var);
        this.m0 = i3Var;
        i3Var.setOnButtonClickListener(new j2(this, 0));
        i3Var.setOnResizeListener(new g2(this, 3));
        l3Var.addView(i3Var, gb1.i(-1, -2, 81));
        BotFullscreenButtons botFullscreenButtons = new BotFullscreenButtons(getContext());
        this.f13118n0 = botFullscreenButtons;
        botFullscreenButtons.setAlpha(0.0f);
        botFullscreenButtons.setVisibility(8);
        z10 = (MessagesController.getInstance(this.H).disableBotFullscreenBlur || SharedConfig.getDevicePerformanceClass() < 2) ? false : z10;
        this.f13110f0 = z10;
        if (z10) {
            obj = d3Var.getRenderNode();
        } else {
            obj = null;
        }
        botFullscreenButtons.setParentRenderNode(obj);
        l3Var.addView(botFullscreenButtons, gb1.i(-1, -1, 119));
        botFullscreenButtons.setOnCloseClickListener(new g2(this, 4));
        botFullscreenButtons.setOnCollapseClickListener(new g2(this, 5));
        botFullscreenButtons.setOnMenuClickListener(new g2(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f13121q0 = frameLayout;
        FrameLayout.LayoutParams i12 = gb1.i(-1, 200, 55);
        this.f13123r0 = i12;
        l3Var.addView(frameLayout, i12);
        this.Z = getContext().getDrawable(R.drawable.header_shadow).mutate();
        ?? kVar = new org.telegram.ui.ActionBar.k(context, u6Var);
        this.X = kVar;
        kVar.setBackgroundColor(0);
        kVar.setBackButtonImage(R.drawable.ic_close_white);
        B();
        kVar.setActionBarMenuOnItemClick(new bh.m(this, 3));
        kVar.setAlpha(0.0f);
        FrameLayout.LayoutParams i13 = gb1.i(-1, -2, 49);
        this.Y = i13;
        l3Var.addView((View) kVar, i13);
        ?? i4Var = new i4(context, u6Var);
        this.E = i4Var;
        l3Var.addView((View) i4Var, gb1.h(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        e3Var.setWebViewProgressListener(new n7(this, 2));
        d3Var.addView(e3Var, gb1.g(-1.0f, -1));
        d3Var.setScrollListener(new g2(this, 7));
        d3Var.setScrollEndListener(new g2(this, 8));
        d3Var.setDelegate(new h2(this));
        d3Var.setIsKeyboardVisible(new h2(this));
        le0 le0Var = new le0(context);
        this.f13126t0 = le0Var;
        l3Var.addView(le0Var, gb1.g(-1.0f, -1));
        setContentView(l3Var, new ViewGroup.LayoutParams(-1, -1));
        E();
        LaunchActivity launchActivity = LaunchActivity.I1;
        org.telegram.ui.ActionBar.s3 P = launchActivity != null ? launchActivity.P() : null;
        this.f13124s = P;
        if (P != null) {
            ua uaVar = new ua(l3Var, 14);
            g2 g2Var = new g2(this, 2);
            P.I.add(uaVar);
            P.J.add(g2Var);
            this.v = new me(P);
        }
    }

    public static void d(m3 m3Var) {
        if (!m3Var.Q0) {
            super.dismiss();
            m3Var.Q0 = true;
        }
    }

    public static WindowInsets e(m3 m3Var, View view, WindowInsets windowInsets) {
        r0.h1 h1Var = r0.k1.h(view, windowInsets).f47118a;
        i0.b f7 = h1Var.f(2);
        m3Var.h.set(f7.f13450a, f7.f13451b, f7.f13452c, f7.d);
        i0.b f10 = h1Var.f(647);
        Rect rect = m3Var.f13117n;
        rect.set(Math.max(f10.f13450a, windowInsets.getStableInsetLeft()), Math.max(f10.f13451b, windowInsets.getStableInsetTop()), Math.max(f10.f13452c, windowInsets.getStableInsetRight()), Math.max(f10.d, windowInsets.getStableInsetBottom()));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 28) {
            rect.top = Math.max(rect.top, AndroidUtilities.getStatusBarHeight(m3Var.getContext()));
        }
        int i11 = h1Var.f(8).d;
        if (i11 > rect.bottom && i11 > AndroidUtilities.dp(20.0f)) {
            m3Var.f13122r = i11;
        } else {
            m3Var.f13122r = 0;
        }
        m3Var.E();
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
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
        e2Var.R = string;
        e2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new x1(i10, j10, tL_attachMenuBot, runnable));
        ic.a.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static JSONObject q(u6 u6Var, final boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int v = y6.v(-16777216, y6.w0(y6.f23427h5, u6Var));
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    int v10 = y6.v(v, ((Integer) obj).intValue());
                    Integer valueOf = Integer.valueOf(v10);
                    if (z10) {
                        return String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(v10)), Integer.valueOf(Color.green(v10)), Integer.valueOf(Color.blue(v10)));
                    }
                    return valueOf;
                }
            };
            jSONObject.put("bg_color", callbackReturn.run(Integer.valueOf(v)));
            jSONObject.put("section_bg_color", callbackReturn.run(Integer.valueOf(y6.w0(y6.f23356d6, u6Var))));
            int i10 = y6.f23299a7;
            jSONObject.put("secondary_bg_color", callbackReturn.run(Integer.valueOf(y6.w0(i10, u6Var))));
            jSONObject.put("text_color", callbackReturn.run(Integer.valueOf(y6.w0(y6.G6, u6Var))));
            jSONObject.put("hint_color", callbackReturn.run(Integer.valueOf(y6.w0(y6.H6, u6Var))));
            jSONObject.put("link_color", callbackReturn.run(Integer.valueOf(y6.w0(y6.J6, u6Var))));
            jSONObject.put("button_color", callbackReturn.run(Integer.valueOf(y6.w0(y6.Oh, u6Var))));
            jSONObject.put("button_text_color", callbackReturn.run(Integer.valueOf(y6.w0(y6.Sh, u6Var))));
            jSONObject.put("header_bg_color", callbackReturn.run(Integer.valueOf(y6.w0(y6.f23636s8, u6Var))));
            jSONObject.put("accent_text_color", callbackReturn.run(Integer.valueOf(y6.w0(y6.f23597q6, u6Var))));
            jSONObject.put("section_header_text_color", callbackReturn.run(Integer.valueOf(y6.w0(y6.L6, u6Var))));
            jSONObject.put("subtitle_text_color", callbackReturn.run(Integer.valueOf(y6.w0(y6.f23767z6, u6Var))));
            jSONObject.put("destructive_text_color", callbackReturn.run(Integer.valueOf(y6.w0(y6.f23581p7, u6Var))));
            jSONObject.put("section_separator_color", callbackReturn.run(Integer.valueOf(y6.w0(y6.f23357d7, u6Var))));
            jSONObject.put("bottom_bar_bg_color", callbackReturn.run(Integer.valueOf(y6.w0(i10, u6Var))));
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
        ofFloat.addListener(new bh.f0(15, this, z10));
        this.S0.addUpdateListener(new f2(this, 0));
        this.S0.setInterpolator(ds.h);
        this.S0.setDuration(220L);
        this.S0.start();
    }

    public final void B() {
        if (!this.V) {
            int i10 = y6.G6;
            u6 u6Var = this.F;
            int w02 = y6.w0(i10, u6Var);
            j3 j3Var = this.X;
            j3Var.setTitleColor(w02);
            j3Var.y(y6.w0(i10, u6Var), false);
            j3Var.x(y6.w0(y6.f23675u8, u6Var), false);
            j3Var.A(y6.w0(y6.G8, u6Var), false);
            j3Var.B(y6.w0(y6.E8, u6Var), false, false);
            j3Var.B(y6.w0(y6.F8, u6Var), true, false);
            j3Var.C(y6.w0(y6.I5, u6Var), false);
        }
        this.f13133y.setFlickerViewColor(this.Q.getColor());
    }

    public final void C() {
        qc qcVar;
        boolean z10;
        q0 c10 = q0.c(getContext(), this.H, this.I);
        ArrayList arrayList = c10.e;
        p0 p0Var = c10.f13228f;
        boolean z11 = true;
        if (p0Var == null) {
            qc qcVar2 = this.f13119o0;
            if (qcVar2 != null) {
                qcVar2.b();
                this.f13119o0 = null;
            }
        } else if ((p0Var.c() && !p0Var.f13197l) || p0Var.f13196k) {
            if (this.P0 != p0Var && (qcVar = this.f13119o0) != null) {
                qcVar.b();
                this.f13119o0 = null;
            }
            qc qcVar3 = this.f13119o0;
            if (qcVar3 == null || !qcVar3.f31892m) {
                this.P0 = p0Var;
                o0 o0Var = new o0(getContext(), this.F);
                this.f13120p0 = o0Var;
                qc f7 = qc.f(this.f13121q0, o0Var, 5000);
                this.f13119o0 = f7;
                f7.k(true);
            }
            if (this.f13120p0.c(p0Var)) {
                this.f13119o0 = null;
            }
            p0Var.f13196k = false;
            p0Var.f13197l = true;
        } else {
            o0 o0Var2 = this.f13120p0;
            if (o0Var2 != null) {
                this.P0 = p0Var;
                if (o0Var2.c(p0Var)) {
                    this.f13119o0 = null;
                }
            }
        }
        D();
        for (Map.Entry entry : this.N0.entrySet()) {
            org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) entry.getValue();
            p0 p0Var2 = (p0) entry.getKey();
            g1Var.setText(p0Var2.f13191c);
            if (!p0Var2.c()) {
                g1Var.setSubtext(AndroidUtilities.formatFileSize(p0Var2.f13193g));
            } else {
                Pair b10 = p0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    g1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) b10.second).longValue()));
                } else {
                    g1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()));
                }
            }
            if (p0Var2.c()) {
                g1Var.setRightIcon(R.drawable.msg_close);
                g1Var.f22637b.setPadding(0, 0, AndroidUtilities.dp(32.0f), 0);
            } else if (p0Var2.f13194i) {
                g1Var.setVisibility(8);
            } else {
                g1Var.setRightIcon(0);
                g1Var.f22637b.setPadding(0, 0, 0, 0);
            }
            g1Var.setOnClickListener(new bi.q(18, this, p0Var2));
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = this.f13104b0;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((p0) obj).c()) {
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
                if (((p0) obj2).c()) {
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        this.f13118n0.setDownloading(z11);
    }

    public final void D() {
        o0 o0Var = this.f13120p0;
        if (o0Var == null) {
            return;
        }
        if (this.f13108e0) {
            o0Var.setArrow(AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(26.0f), this.f13111g0));
        } else if (this.f13105c > 0.5f) {
            o0Var.setArrow(AndroidUtilities.dp(24.0f));
        } else {
            o0Var.setArrow(-1);
        }
    }

    public final void E() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        BotFullscreenButtons botFullscreenButtons = this.f13118n0;
        Rect rect = this.f13117n;
        botFullscreenButtons.setInsets(rect);
        boolean z10 = this.f13108e0;
        e3 e3Var = this.f13133y;
        l3 l3Var = this.f13109f;
        i3 i3Var = this.m0;
        int i16 = 0;
        if (z10) {
            if (i3Var != null && i3Var.getTotalHeight() > 0) {
                i14 = rect.bottom;
            } else {
                i14 = 0;
            }
            int i17 = rect.left;
            int i18 = rect.top;
            int i19 = rect.right;
            if (this.f13122r > i14 || (i3Var != null && i3Var.getTotalHeight() > 0)) {
                i15 = 0;
            } else {
                i15 = rect.bottom;
            }
            Rect rect2 = new Rect(i17, i18, i19, i15);
            int dp = AndroidUtilities.dp(46.0f);
            e3Var.P(rect2, false);
            e3Var.O(dp, false);
            l3Var.setPadding(0, 0, 0, Math.max(this.f13122r, i14));
        } else {
            e3Var.P(new Rect(0, 0, 0, 0), false);
            e3Var.O(0, false);
            int i20 = rect.left;
            int i21 = rect.right;
            int i22 = this.f13122r;
            org.telegram.ui.ActionBar.s3 s3Var = this.f13124s;
            if (s3Var != null) {
                i10 = s3Var.H;
            } else {
                i10 = 0;
            }
            l3Var.setPadding(i20, 0, i21, Math.max(i22, i10 + rect.bottom));
        }
        this.f13131x.topMargin = AndroidUtilities.dp(24.0f);
        boolean z11 = this.f13108e0;
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
        FrameLayout.LayoutParams layoutParams2 = this.f13123r0;
        layoutParams2.leftMargin = i12;
        if (!z11) {
            i13 = 0;
        } else {
            i13 = rect.right;
        }
        layoutParams2.rightMargin = i13;
        boolean z12 = this.f13113i0;
        d3 d3Var = this.f13129w;
        if (!z12) {
            d3Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f13108e0) {
                d3Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                d3Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f));
            }
            d3Var.setSwipeOffsetAnimationDisallowed(false);
            d3Var.c();
            d3Var.invalidate();
            d3Var.requestLayout();
        }
        if (d3Var != null) {
            d3Var.setFullSize(n());
        }
        i3Var.requestLayout();
        l3Var.requestLayout();
        if (!this.f13108e0) {
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
            z10 = (AndroidUtilities.isTablet() || i0.a.h(y6.x0(null, y6.f23356d6, true)) < 0.7210000157356262d || this.f13105c < 0.85f) ? false : false;
        }
        Boolean bool = this.e;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        this.e = Boolean.valueOf(z10);
        l3 l3Var = this.f13109f;
        int systemUiVisibility = l3Var.getSystemUiVisibility();
        if (z10) {
            i10 = systemUiVisibility | 8192;
        } else {
            i10 = systemUiVisibility & (-8193);
        }
        l3Var.setSystemUiVisibility(i10);
    }

    public final void G() {
        org.telegram.ui.web.x0 webView;
        e3 e3Var = this.f13133y;
        if (e3Var == null || (webView = e3Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.Q.getColor());
    }

    public final void H() {
        int i10;
        i3 i3Var;
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
            boolean z10 = this.f13108e0;
            if (z10) {
                attributes.flags = i10 | attributes.flags;
            } else {
                attributes.flags = (~i10) & attributes.flags;
            }
            l3 l3Var = this.f13109f;
            if (z10 && (((i3Var = this.m0) == null || i3Var.getTotalHeight() <= 0) && !l3Var.m0)) {
                l3Var.setSystemUiVisibility(l3Var.getSystemUiVisibility() | 2);
            } else {
                l3Var.setSystemUiVisibility(l3Var.getSystemUiVisibility() & (-3));
            }
            window.setAttributes(attributes);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.r3 a() {
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        boolean booleanValue;
        float f7;
        org.telegram.ui.ActionBar.r3 r3Var = new org.telegram.ui.ActionBar.r3();
        r3Var.f23017q = this.R;
        r3Var.f23016p = this.f13128v0;
        r3Var.f23014n = this.V;
        r3Var.f23015o = this.W;
        r3Var.f23018r = this.Q.getColor();
        r3Var.f23004a = this.f13130w0;
        boolean z13 = false;
        e3 e3Var = this.f13133y;
        if (e3Var != null && e3Var.N) {
            z10 = true;
        } else {
            z10 = false;
        }
        r3Var.f23020t = z10;
        r3Var.D = y6.I.q();
        org.telegram.ui.web.x0 x0Var = null;
        if (e3Var != null) {
            str = e3Var.getUrlLoaded();
        } else {
            str = null;
        }
        r3Var.f23023x = str;
        if (e3Var != null && e3Var.f45179t0) {
            z11 = true;
        } else {
            z11 = false;
        }
        r3Var.e = z11;
        if (e3Var != null) {
            str2 = e3Var.getTrustedOrigin();
        } else {
            str2 = null;
        }
        r3Var.f23007f = str2;
        d3 d3Var = this.f13129w;
        if ((d3Var == null || d3Var.getSwipeOffsetY() >= 0.0f) && !this.f13134y0 && !n() && !this.f13108e0) {
            z12 = false;
        } else {
            z12 = true;
        }
        r3Var.f23010j = z12;
        r3Var.f23025z = this.f13108e0;
        r3Var.A = this.f13110f0;
        Boolean bool = this.A0;
        if (bool == null) {
            booleanValue = this.f13135z0;
        } else {
            booleanValue = bool.booleanValue();
        }
        r3Var.B = booleanValue;
        if (d3Var != null) {
            f7 = d3Var.getOffsetY();
        } else {
            f7 = Float.MAX_VALUE;
        }
        r3Var.f23011k = f7;
        r3Var.C = this.B0;
        r3Var.f23021u = this.f13132x0;
        r3Var.f23024y = this.f13125s0;
        r3Var.v = this.f13106c0;
        if (d3Var == null || d3Var.M) {
            z13 = true;
        }
        r3Var.f23012l = z13;
        r3Var.f23022w = this.m0.e;
        r3Var.f23019s = this.S;
        f1 f1Var = this.C0;
        if (f1Var != null) {
            f1Var.b();
        }
        r3Var.K = this.C0;
        if (e3Var != null) {
            x0Var = e3Var.getWebView();
        }
        if (x0Var != null) {
            e3Var.L();
            r3Var.f23005b = x0Var;
            r3Var.d = e3Var.getBotProxy();
            r3Var.f23008g = x0Var.getWidth();
            r3Var.h = x0Var.getHeight();
            x0Var.onPause();
        }
        boolean z14 = this.W0;
        r3Var.G = z14;
        if (z14) {
            r3Var.H = this.X0;
        }
        r3Var.L = this.D0;
        this.E0 = r3Var;
        return r3Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.o3 o3Var) {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.webViewResultSent) {
            if (this.K == ((Long) objArr[0]).longValue()) {
                k(false);
            }
        } else if (i10 == NotificationCenter.didSetNewTheme) {
            this.f13109f.invalidate();
            this.f13133y.f45170n.b(y6.w0(y6.f23356d6, this.F), 153);
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
            boolean q5 = y6.I.q();
            int i15 = botappsettings.flags;
            if (q5) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            if ((i10 & i15) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (q5) {
                i11 = 16;
            } else {
                i11 = 8;
            }
            if ((i15 & i11) != 0) {
                if (q5) {
                    i14 = botappsettings.header_dark_color;
                } else {
                    i14 = botappsettings.header_color;
                }
                u(i14 | (-16777216), true, z10);
            }
            if (z11) {
                if (q5) {
                    i12 = botappsettings.background_dark_color;
                } else {
                    i12 = botappsettings.background_color;
                }
                w(i12 | (-16777216), z10);
                if (q5) {
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
    public final org.telegram.ui.ActionBar.z3 mo36getWindowView() {
        return this.f13109f;
    }

    public final void h() {
        LaunchActivity launchActivity;
        if (!this.Q0 && (launchActivity = LaunchActivity.I1) != null) {
            launchActivity.H(true, true, true);
        }
        l3 l3Var = this.f13109f;
        if (l3Var != null) {
            l3Var.invalidate();
        }
    }

    public final void i() {
        if (this.Y0 == null) {
            org.telegram.ui.c3 c3Var = new org.telegram.ui.c3(getContext());
            this.Y0 = c3Var;
            this.f13129w.addView(c3Var, gb1.g(-1.0f, -1));
            this.Y0.setTranslationY(-1.0f);
            this.Y0.h.setOnClickListener(new p2(this, 0));
            this.Y0.setBackgroundColor(this.Q.getColor());
            AndroidUtilities.updateViewVisibilityAnimated(this.Y0, this.W0, 1.0f, false);
        }
    }

    public final void k(boolean z10) {
        int i10;
        LaunchActivity launchActivity;
        if (this.f13107d0) {
            return;
        }
        int i11 = 0;
        if (this.L0 != null) {
            z10 = false;
        }
        this.f13107d0 = true;
        A(false);
        AndroidUtilities.cancelRunOnUIThread(this.f13127u0);
        NotificationCenter.getInstance(this.H).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getInstance(this.H).removeObserver(this, NotificationCenter.botDownloadsUpdate);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        if (z10 && ((launchActivity = LaunchActivity.I1) == null || launchActivity.f35569y0 == null)) {
            z10 = false;
        }
        if (z10) {
            o1.j jVar = this.d;
            if (jVar != null) {
                jVar.f18969u.f18975i = 0.0f;
                jVar.h();
            }
            LaunchActivity.I1.f35569y0.b(this);
        } else {
            i3 i3Var = this.m0;
            if (i3Var != null) {
                i3Var.animate().translationY(i3Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(ds.h).start();
            }
            this.f13133y.h();
            d3 d3Var = this.f13129w;
            int height = d3Var.getHeight();
            if (i3Var != null) {
                i10 = i3Var.getTotalHeight();
            } else {
                i10 = 0;
            }
            int i12 = height + i10;
            Rect rect = this.f13117n;
            int Q = this.f13109f.Q() + i12 + rect.top + rect.bottom;
            if (n()) {
                i11 = AndroidUtilities.dp(200.0f);
            }
            d3Var.f(Q + i11, true, new g2(this, 0));
        }
        f13098a1.remove(this);
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
        c5 c5Var = this.f13130w0;
        if (c5Var != null && c5Var.f12919g == 6) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (!this.f13108e0) {
            Boolean bool = this.A0;
            if (bool == null) {
                if (!this.f13135z0) {
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
        if (this.f13130w0 != null) {
            long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.f13130w0.f12929r));
            String str = null;
            this.A0 = null;
            TLObject tLObject = this.f13130w0.f12928q;
            if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                this.K = tL_webViewResultUrl.query_id;
                str = tL_webViewResultUrl.url;
                z10 = tL_webViewResultUrl.same_origin;
                this.A0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
                boolean z11 = this.F0;
                if (!z11) {
                    y(tL_webViewResultUrl.fullscreen, !z11, this.f13110f0);
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
                MediaDataController.getInstance(this.H).increaseWebappRating(this.f13130w0.f12917c);
                this.f13133y.t(this.H, str, z10);
            }
            AndroidUtilities.runOnUIThread(this.f13127u0, max);
            d3 d3Var = this.f13129w;
            if (d3Var != null) {
                d3Var.setFullSize(n());
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(true);
        if (this.d == null) {
            o1.j jVar = new o1.j(this, f13099b1);
            o1.k kVar = new o1.k();
            kVar.b(1200.0f);
            kVar.a(1.0f);
            jVar.f18969u = kVar;
            this.d = jVar;
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f13126t0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else if (this.f13133y.C()) {
        } else {
            k(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        i3 i3Var;
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
        if (this.f13108e0) {
            attributes.flags = i12 | 512;
        } else {
            attributes.flags = i11 & (-515);
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        l3 l3Var = this.f13109f;
        l3Var.setFitsSystemWindows(true);
        l3Var.setSystemUiVisibility(1792);
        l3Var.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return m3.e(m3.this, view, windowInsets);
            }
        });
        if (this.f13108e0 && ((i3Var = this.m0) == null || i3Var.getTotalHeight() <= 0)) {
            l3Var.setSystemUiVisibility(l3Var.getSystemUiVisibility() | 2);
        } else {
            l3Var.setSystemUiVisibility(l3Var.getSystemUiVisibility() & (-3));
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
        o1.j jVar = this.d;
        if (jVar != null) {
            jVar.c();
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
            ((LaunchActivity) context).B0.add(this.f13126t0);
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
            ((LaunchActivity) context).B0.remove(this.f13126t0);
        }
    }

    public final void p(boolean z10) {
        if (this.D0 == z10) {
            return;
        }
        this.D0 = z10;
        if (this.Z0) {
            if (z10) {
                f13100c1++;
            } else {
                f13100c1--;
            }
        }
        if (f13100c1 > 0) {
            AndroidUtilities.lockOrientation(l());
        } else {
            AndroidUtilities.unlockOrientation(l());
        }
    }

    public final boolean r() {
        String str;
        if (this.f13125s0) {
            TLRPC.User user = MessagesController.getInstance(this.H).getUser(Long.valueOf(this.I));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            alertDialog$Builder.f22368a.R = str;
            alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new h2(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
            e2Var.show();
            ((TextView) e2Var.d(-1)).setTextColor(y6.w0(y6.f23598q7, this.F));
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
        k80 k80Var = this.O0;
        if (k80Var != null) {
            k80Var.u();
        }
        if (this.f13108e0) {
            view = this.f13118n0;
        } else {
            view = this.f13102a0;
        }
        k80 G = k80.G(this.f13109f, this.F, view, true);
        this.O0 = G;
        ArrayList arrayList3 = q0.c(getContext(), this.H, this.I).e;
        HashMap hashMap = this.N0;
        hashMap.clear();
        if (!arrayList3.isEmpty()) {
            k80 J = G.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new zt0(G, 26), false);
            J.k();
            int size2 = arrayList3.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj = arrayList3.get(i15);
                i15++;
                p0 p0Var = (p0) obj;
                String str = p0Var.f13191c;
                ag.c cVar = new ag.c(17);
                u6 u6Var = J.d;
                if (J.e == null) {
                    arrayList = arrayList3;
                    i13 = size2;
                } else {
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, J.e, J.d, false, false);
                    arrayList = arrayList3;
                    i13 = size2;
                    g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    g1Var.setText(str);
                    g1Var.setSubtext("");
                    Integer num = J.f29853j0;
                    if (num == null && J.f29855k0 == null) {
                        g1Var.c(y6.E8, y6.F8);
                    } else {
                        if (num != null) {
                            w02 = num.intValue();
                        } else {
                            w02 = y6.w0(y6.E8, u6Var);
                        }
                        Integer num2 = J.f29855k0;
                        if (num2 != null) {
                            w03 = num2.intValue();
                        } else {
                            w03 = y6.w0(y6.F8, u6Var);
                        }
                        g1Var.d(w02, w03);
                    }
                    Integer num3 = J.f29857l0;
                    if (num3 != null) {
                        g1Var.setSelectorColor(num3.intValue());
                    } else {
                        g1Var.h(0.12f, y6.E8);
                    }
                    g1Var.setOnClickListener(new org.telegram.ui.Components.f0(J, cVar));
                    int i16 = J.S;
                    if (i16 > 0) {
                        g1Var.setMinimumWidth(AndroidUtilities.dp(i16));
                        J.r(g1Var, gb1.r(J.S, -2));
                    } else {
                        J.r(g1Var, gb1.r(-1, -2));
                        hashMap.put(p0Var, J.y());
                        size2 = i13;
                        arrayList3 = arrayList;
                    }
                }
                hashMap.put(p0Var, J.y());
                size2 = i13;
                arrayList3 = arrayList;
            }
            i10 = -1;
            C();
            J.S = AndroidUtilities.dp(180.0f);
            G.c(R.drawable.menu_download_round, LocaleController.getString(R.string.BotDownloads), new o2(G, J, 0), false);
            G.k();
        } else {
            i10 = -1;
        }
        if (this.L0 == null && !m10) {
            z10 = true;
        } else {
            z10 = false;
        }
        G.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new g2(this, 9), z10);
        if (this.L0 == null && this.f13106c0) {
            z11 = true;
        } else {
            z11 = false;
        }
        G.l(R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings), new g2(this, 10), z11);
        G.c(R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage), new bh.n(10, this, m10), false);
        if (this.L0 == null && user != null && user.bot_has_main_app) {
            z12 = true;
        } else {
            z12 = false;
        }
        G.l(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new g2(this, 11), z12);
        if (this.L0 == null && !m10) {
            z13 = true;
        } else {
            z13 = false;
        }
        G.l(R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS), new g2(this, 12), z13);
        if (this.L0 == null && !m10) {
            z14 = true;
        } else {
            z14 = false;
        }
        G.l(R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot), new g2(this, 13), z14);
        if (this.L0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu)) {
            z15 = true;
        } else {
            z15 = false;
        }
        G.l(R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot), new g2(this, 14), z15);
        if (this.R != y6.x0(null, y6.f23356d6, false)) {
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
            int o12 = y6.o1(0.85f, i12);
            int o13 = y6.o1(0.1f, i12);
            G.P(i11);
            for (int i17 = 0; i17 < G.x(); i17++) {
                View w10 = G.w(i17);
                if (w10 instanceof org.telegram.ui.ActionBar.g1) {
                    org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) w10;
                    g1Var2.d(i12, o12);
                    g1Var2.setSelectorColor(o13);
                }
            }
        }
        G.V(5);
        G.a0(-this.f13117n.right, 0.0f);
        G.U = true;
        G.f29869t = false;
        G.f29868s = 0;
        G.Z();
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        A(true);
        l3 l3Var = this.f13109f;
        l3Var.setAlpha(0.0f);
        l3Var.addOnLayoutChangeListener(new x2(this, 0));
        super.show();
        this.Q0 = false;
        f13098a1.add(this);
    }

    public final void t(org.telegram.ui.ActionBar.r2 r2Var, c5 c5Var) {
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
        this.f13130w0 = c5Var;
        int i10 = c5Var.f12915a;
        this.H = i10;
        this.J = c5Var.f12916b;
        this.I = c5Var.f12917c;
        this.L = c5Var.h;
        this.M = c5Var.f12920i;
        this.N = c5Var.e;
        if (c5Var.f12919g == 6) {
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
            userName = c5Var.e;
        } else {
            userName = UserObject.getUserName(user);
        }
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        j3 j3Var = this.X;
        j3Var.setTitle(userName);
        if (z10) {
            userFull = null;
        } else {
            userFull = MessagesController.getInstance(this.H).getUserFull(this.I);
        }
        u6 u6Var = this.F;
        if ((user != null && user.verified) || (userFull != null && (user2 = userFull.user) != null && user2.verified)) {
            this.M0 = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            f7.y(j3Var.getTitleTextView(), this.M0, y6.Oh, u6Var, PorterDuff.Mode.SRC_IN);
            this.M0.setAlpha(255);
            j3Var.getTitleTextView().setDrawablePadding(AndroidUtilities.dp(2.0f));
            j3Var.getTitleTextView().i(new fi.u3(this, 1));
        }
        BotFullscreenButtons botFullscreenButtons = this.f13118n0;
        if (botFullscreenButtons != null) {
            if (z10) {
                userName2 = c5Var.e;
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
        org.telegram.ui.ActionBar.z l4 = j3Var.l();
        l4.removeAllViews();
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
                MessagesController.getInstance(this.H).loadFullUser(user, 0, true, new j2(this, 1));
            }
            if (c5Var.f12927p) {
                y(z13, z12, this.f13110f0);
            }
        }
        if (this.L0 == null) {
            l4.a(R.id.menu_collapse_bot, R.drawable.arrow_more);
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = new BotFullscreenButtons.OptionsIcon(getContext());
        this.f13104b0 = optionsIcon;
        org.telegram.ui.ActionBar.w0 d = l4.d(0, optionsIcon);
        this.f13102a0 = d;
        d.setOnClickListener(new p2(this, 1));
        j3Var.setActionBarMenuOnItemClick(new v2(this));
        JSONObject q5 = q(u6Var, false);
        e3 e3Var = this.f13133y;
        e3Var.setBotUser(user);
        if (!z10) {
            e3Var.s(this.H, this.I);
            TLRPC.User user3 = c5Var.f12924m;
            if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu && !MediaDataController.getInstance(this.H).isShortcutAdded(this.I, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
                if (user3 == null) {
                    user3 = MessagesController.getInstance(this.H).getUser(Long.valueOf(this.I));
                }
                if (user3 != null && user3.photo != null && !FileLoader.getInstance(this.H).getPathToAttach(user3.photo.photo_small, true).exists()) {
                    MediaDataController.getInstance(this.H).preloadImage(ImageLocation.getForUser(this.H, user3, 1), 0);
                }
            }
        }
        if (c5Var.f12928q != null) {
            o();
            return;
        }
        switch (c5Var.f12919g) {
            case 0:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = MessagesController.getInstance(this.H).getInputPeer(this.J);
                tL_messages_requestWebView.bot = MessagesController.getInstance(this.H).getInputUser(this.I);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = c5Var.f12926o;
                tL_messages_requestWebView.fullscreen = c5Var.f12927p;
                String str = c5Var.f12918f;
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
                if (q5 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON;
                    tL_dataJSON.data = q5.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestWebView, new r2(this, 3));
                NotificationCenter.getInstance(this.H).addObserver(this, NotificationCenter.webViewResultSent);
                return;
            case 1:
                boolean z15 = false;
                TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
                if ((c5Var.f12925n & 1) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                tL_messages_requestSimpleWebView.from_switch_webview = z11;
                tL_messages_requestSimpleWebView.bot = MessagesController.getInstance(this.H).getInputUser(this.I);
                tL_messages_requestSimpleWebView.platform = "android";
                if ((c5Var.f12925n & 2) != 0) {
                    z15 = true;
                }
                tL_messages_requestSimpleWebView.from_side_menu = z15;
                tL_messages_requestSimpleWebView.compact = c5Var.f12926o;
                tL_messages_requestSimpleWebView.fullscreen = c5Var.f12927p;
                if (q5 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = q5.toString();
                    tL_messages_requestSimpleWebView.flags |= 1;
                }
                if (!TextUtils.isEmpty(c5Var.f12918f)) {
                    tL_messages_requestSimpleWebView.flags |= 8;
                    tL_messages_requestSimpleWebView.url = c5Var.f12918f;
                }
                if (!TextUtils.isEmpty(c5Var.f12923l)) {
                    tL_messages_requestSimpleWebView.start_param = c5Var.f12923l;
                    tL_messages_requestSimpleWebView.flags |= 16;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestSimpleWebView, new r2(this, 2));
                return;
            case 2:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView2.bot = MessagesController.getInstance(this.H).getInputUser(this.I);
                tL_messages_requestWebView2.peer = MessagesController.getInstance(this.H).getInputPeer(this.I);
                tL_messages_requestWebView2.platform = "android";
                tL_messages_requestWebView2.compact = c5Var.f12926o;
                tL_messages_requestWebView2.fullscreen = c5Var.f12927p;
                tL_messages_requestWebView2.url = c5Var.f12918f;
                tL_messages_requestWebView2.flags |= 2;
                if (q5 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                    tL_dataJSON3.data = q5.toString();
                    tL_messages_requestWebView2.flags |= 4;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestWebView2, new r2(this, 1));
                NotificationCenter.getInstance(this.H).addObserver(this, NotificationCenter.webViewResultSent);
                return;
            case 3:
                TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                TLRPC.BotApp botApp = c5Var.f12921j;
                tL_inputBotAppID.f22085id = botApp.f22024id;
                tL_inputBotAppID.access_hash = botApp.access_hash;
                tL_messages_requestAppWebView.app = tL_inputBotAppID;
                tL_messages_requestAppWebView.write_allowed = c5Var.f12922k;
                tL_messages_requestAppWebView.platform = "android";
                if (r2Var instanceof un) {
                    un unVar = (un) r2Var;
                    if (unVar.i() != null) {
                        inputPeer = MessagesController.getInputPeer(unVar.i());
                    } else {
                        inputPeer = MessagesController.getInputPeer(unVar.e);
                    }
                } else {
                    inputPeer = MessagesController.getInputPeer(c5Var.f12924m);
                }
                tL_messages_requestAppWebView.peer = inputPeer;
                tL_messages_requestAppWebView.compact = c5Var.f12926o;
                tL_messages_requestAppWebView.fullscreen = c5Var.f12927p;
                if (!TextUtils.isEmpty(c5Var.f12923l)) {
                    tL_messages_requestAppWebView.start_param = c5Var.f12923l;
                    tL_messages_requestAppWebView.flags |= 2;
                }
                if (q5 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                    tL_messages_requestAppWebView.theme_params = tL_dataJSON4;
                    tL_dataJSON4.data = q5.toString();
                    tL_messages_requestAppWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestAppWebView, new r2(this, 4), 66);
                return;
            case 4:
                TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                tL_messages_requestMainWebView.bot = MessagesController.getInstance(this.H).getInputUser(c5Var.f12917c);
                tL_messages_requestMainWebView.platform = "android";
                if (r2Var instanceof un) {
                    un unVar2 = (un) r2Var;
                    if (unVar2.i() != null) {
                        inputPeer2 = MessagesController.getInputPeer(unVar2.i());
                    } else {
                        inputPeer2 = MessagesController.getInputPeer(unVar2.e);
                    }
                } else {
                    inputPeer2 = MessagesController.getInstance(this.H).getInputPeer(c5Var.f12916b);
                }
                tL_messages_requestMainWebView.peer = inputPeer2;
                tL_messages_requestMainWebView.compact = c5Var.f12926o;
                tL_messages_requestMainWebView.fullscreen = c5Var.f12927p;
                if (!TextUtils.isEmpty(c5Var.f12923l)) {
                    tL_messages_requestMainWebView.start_param = c5Var.f12923l;
                    tL_messages_requestMainWebView.flags |= 2;
                }
                if (q5 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                    tL_messages_requestMainWebView.theme_params = tL_dataJSON5;
                    tL_dataJSON5.data = q5.toString();
                    tL_messages_requestMainWebView.flags |= 1;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestMainWebView, new r2(this, 5), 66);
                return;
            case 5:
                TLRPC.TL_messages_requestChatJoinWebView tL_messages_requestChatJoinWebView = new TLRPC.TL_messages_requestChatJoinWebView();
                tL_messages_requestChatJoinWebView.platform = "android";
                tL_messages_requestChatJoinWebView.query_id = c5Var.d;
                if (q5 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
                    tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON6;
                    tL_dataJSON6.data = q5.toString();
                }
                ConnectionsManager.getInstance(this.H).sendRequestTyped(tL_messages_requestChatJoinWebView, new Object(), new e2(this, 0), 66);
                return;
            case 6:
                if (!this.F0) {
                    e3Var.t(this.H, c5Var.f12918f, false);
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
        y6.b(0.35f, -0.1f, i10);
        final d2 d2Var = new d2();
        int i13 = 0;
        if (this.V) {
            i11 = this.R;
        } else {
            i11 = 0;
        }
        SparseIntArray sparseIntArray = d2Var.f12941a;
        u6 u6Var = this.F;
        d2Var.c(sparseIntArray, i11, u6Var);
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
        d2Var.c(d2Var.f12942b, i13, u6Var);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(ds.f27586f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int f7 = i0.a.f(floatValue, i12, i10);
                    m3 m3Var = m3.this;
                    m3Var.R = f7;
                    m3Var.h();
                    l3 l3Var = m3Var.f13109f;
                    l3Var.invalidate();
                    j3 j3Var = m3Var.X;
                    j3Var.setBackgroundColor(m3Var.R);
                    d2 d2Var2 = d2Var;
                    d2Var2.b(j3Var, floatValue);
                    m3Var.f13101a = d2Var2.a(y6.Ii);
                    l3Var.invalidate();
                }
            });
            duration.addListener(new c3(this, i12, i10, d2Var));
            duration.start();
        } else {
            this.R = i10;
            h();
            l3 l3Var = this.f13109f;
            l3Var.invalidate();
            int i14 = this.R;
            j3 j3Var = this.X;
            j3Var.setBackgroundColor(i14);
            d2Var.b(j3Var, 1.0f);
            this.f13101a = d2Var.a(y6.Ii);
            l3Var.invalidate();
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
                f13100c1++;
            }
        } else if (this.D0) {
            f13100c1--;
        }
        if (f13100c1 > 0) {
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
            duration.setInterpolator(ds.f27586f);
            this.T0.addUpdateListener(new n2(this, color, i10, 0));
            this.T0.addListener(new y2(this, i10, 0));
            this.T0.start();
            return;
        }
        paint.setColor(i10);
        B();
        this.f13109f.invalidate();
        org.telegram.ui.c3 c3Var = this.Y0;
        if (c3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) > 0.721f) {
                z11 = false;
            }
            c3Var.b(z11, false);
            this.Y0.setBackgroundColor(paint.getColor());
        }
        G();
    }

    public final void x(boolean z10) {
        if (this.f13135z0 != z10) {
            this.f13135z0 = z10;
            d3 d3Var = this.f13129w;
            if (d3Var != null) {
                d3Var.setFullSize(n());
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
        if (this.f13108e0 == z10) {
            return;
        }
        this.f13108e0 = z10;
        int i10 = 0;
        if (z12 && !MessagesController.getInstance(this.H).disableBotFullscreenBlur && SharedConfig.getDevicePerformanceClass() >= 2) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f13110f0 = z13;
        ValueAnimator valueAnimator = this.V0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        BotFullscreenButtons botFullscreenButtons = this.f13118n0;
        d3 d3Var = this.f13129w;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setPreview(z10, z11);
            if (this.f13110f0) {
                obj = d3Var.getRenderNode();
            } else {
                obj = null;
            }
            botFullscreenButtons.setParentRenderNode(obj);
        }
        this.f13114j0 = d3Var.getWidth();
        this.f13115k0 = d3Var.getHeight();
        this.U0 = false;
        i3 i3Var = this.m0;
        e3 e3Var = this.f13133y;
        j3 j3Var = this.X;
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
            int i12 = this.f13117n.left;
            if (z10) {
                f11 = i12 + f10;
            } else {
                f11 = (-i12) - f10;
            }
            if (!z10) {
                f10 = -f10;
            }
            if (z10) {
                f12 = d3Var.getTranslationY();
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
            o1.j jVar = d3Var.v;
            if (jVar != null) {
                jVar.c();
            }
            o1.j jVar2 = d3Var.G;
            if (jVar2 != null) {
                jVar2.c();
            }
            d3Var.setSwipeOffsetAnimationDisallowed(true);
            j3Var.setVisibility(0);
            if (z10) {
                d3Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                d3Var.setTopActionBarOffsetY(currentActionBarHeight2 - AndroidUtilities.dp(24.0f));
            }
            d3Var.c();
            d3Var.invalidate();
            this.f13112h0 = 0.0f;
            if (z10) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            this.f13111g0 = f13;
            j3Var.setAlpha(1.0f - f13);
            j3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f13111g0);
            d3Var.setTranslationY(AndroidUtilities.lerp(f12, f14, this.f13112h0));
            d3Var.setTranslationX(AndroidUtilities.lerp(f11, 0.0f, this.f13112h0));
            i3Var.setTranslationX(AndroidUtilities.lerp(f10, 0.0f, this.f13112h0));
            botFullscreenButtons.setAlpha(this.f13111g0);
            this.f13109f.invalidate();
            e3Var.setViewPortHeightOffset(d3Var.getTranslationY() - f14);
            e3Var.n(false, false);
            this.f13113i0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.V0 = ofFloat;
            float f15 = f11;
            ofFloat.addUpdateListener(new z2(this, z10, f12, f14, f15, f10));
            this.V0.addListener(new a3(this, z10, currentActionBarHeight2, f15));
            this.V0.setDuration(280L);
            this.V0.setInterpolator(ds.h);
            this.V0.start();
            return;
        }
        this.f13113i0 = false;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f13111g0 = f7;
        this.f13112h0 = 0.0f;
        E();
        H();
        if (z10) {
            i10 = 8;
        }
        j3Var.setVisibility(i10);
        j3Var.setAlpha(1.0f - this.f13111g0);
        j3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f13111g0);
        i3Var.setTranslationX(0.0f);
        botFullscreenButtons.setAlpha(this.f13111g0);
        e3Var.setViewPortHeightOffset(0.0f);
        e3Var.n(true, true);
        D();
    }

    public final void z(int i10, boolean z10) {
        this.I0 = false;
        int i11 = this.S;
        i3 i3Var = this.m0;
        Paint paint = i3Var.f12932a;
        i3Var.e.f639b = i10;
        paint.setColor(i10);
        if (!z10) {
            i3Var.d.a(i10, true);
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(ds.f27586f);
            duration.addUpdateListener(new n2(this, i11, i10, 1));
            duration.addListener(new b3(this, i11, i10, 0));
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
