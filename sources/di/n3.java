package di;

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
import bi.u6;
import bi.wc;
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
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.mu0;
import org.telegram.ui.wb1;
import w7.a6;
public final class n3 extends Dialog implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.w3 {
    public static final HashSet W0 = new HashSet();
    public static final sv0 X0;
    public static int Y0;
    public boolean A0;
    public d1 B0;
    public boolean C0;
    public org.telegram.ui.ActionBar.p3 D0;
    public final f6 E;
    public boolean E0;
    public boolean F;
    public boolean F0;
    public int G;
    public float G0;
    public long H;
    public wb1 H0;
    public long I;
    public Drawable I0;
    public long J;
    public final HashMap J0;
    public int K;
    public w70 K0;
    public long L;
    public n0 L0;
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
    public org.telegram.ui.e3 U0;
    public boolean V;
    public boolean V0;
    public final k3 W;
    public final FrameLayout.LayoutParams X;
    public final Drawable Y;
    public org.telegram.ui.ActionBar.w0 Z;
    public int f6782a;
    public BotFullscreenButtons.OptionsIcon f6783a0;
    public float f6784b;
    public boolean f6785b0;
    public o1.k f6786c;
    public boolean f6787c0;
    public Boolean d;
    public boolean f6788d0;
    public final m3 e;
    public boolean f6789e0;
    public final Rect f6790f;
    public float f6791f0;
    public float f6792g0;
    public final Rect h;
    public boolean f6793h0;
    public int f6794i0;
    public int f6795j0;
    public Activity f6796k0;
    public final j3 f6797l0;
    public final BotFullscreenButtons m0;
    public int f6798n;
    public pc f6799n0;
    public m0 f6800o0;
    public final FrameLayout f6801p0;
    public final FrameLayout.LayoutParams f6802q0;
    public final org.telegram.ui.ActionBar.q3 f6803r;
    public boolean f6804r0;
    public final u6 f6805s;
    public final be0 f6806s0;
    public final h2 f6807t0;
    public int f6808u0;
    public final d3 v;
    public j5 f6809v0;
    public final FrameLayout.LayoutParams f6810w;
    public boolean f6811w0;
    public final e3 f6812x;
    public boolean f6813x0;
    public final l3 f6814y;
    public boolean f6815y0;
    public Boolean f6816z0;

    static {
        sv0 sv0Var = new sv0(new dh.a(9), new dh.a(10));
        sv0Var.f27224c = 100.0f;
        X0 = sv0Var;
        Y0 = 0;
    }

    public n3(Context context, f6 f6Var) {
        super(context, R.style.TransparentDialog);
        Object obj;
        this.f6784b = 0.0f;
        this.f6790f = new Rect();
        this.h = new Rect();
        this.f6798n = 0;
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.N = paint;
        Paint paint2 = new Paint();
        this.O = paint2;
        this.P = new Paint(1);
        this.T = new Paint(1);
        this.f6807t0 = new h2(this, 1);
        this.f6808u0 = -1;
        this.f6815y0 = false;
        this.f6816z0 = null;
        this.J0 = new HashMap();
        this.M0 = false;
        this.Q0 = true;
        this.V0 = false;
        this.E = f6Var;
        this.f6782a = j6.w0(null, j6.Ii, false);
        d3 d3Var = new d3(this, context, 0);
        this.v = d3Var;
        d3Var.setAllowFullSizeSwipe(true);
        d3Var.setShouldWaitWebViewScroll(true);
        int i10 = j6.f17928d6;
        e3 e3Var = new e3(this, context, f6Var, j6.v0(i10, f6Var));
        this.f6812x = e3Var;
        e3Var.setOnVerifiedAge(this.H0);
        e3Var.setDelegate(new i3(this, context, f6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.Q = j6.v0(i10, f6Var);
        int v02 = j6.v0(j6.f17872a7, f6Var);
        this.R = v02;
        AndroidUtilities.setNavigationBarColor((Dialog) this, v02, false);
        m3 m3Var = new m3(this, context);
        this.e = m3Var;
        m3Var.setDelegate(new j2(this, 0));
        FrameLayout.LayoutParams e = a6.e(-1, -1, 49);
        this.f6810w = e;
        m3Var.addView(d3Var, e);
        j3 j3Var = new j3(this, getContext(), f6Var);
        this.f6797l0 = j3Var;
        j3Var.setOnButtonClickListener(new k2(this, 0));
        j3Var.setOnResizeListener(new h2(this, 3));
        m3Var.addView(j3Var, a6.e(-1, -2, 81));
        BotFullscreenButtons botFullscreenButtons = new BotFullscreenButtons(getContext());
        this.m0 = botFullscreenButtons;
        botFullscreenButtons.setAlpha(0.0f);
        botFullscreenButtons.setVisibility(8);
        z10 = (MessagesController.getInstance(this.G).disableBotFullscreenBlur || SharedConfig.getDevicePerformanceClass() < 2) ? false : false;
        this.f6789e0 = z10;
        if (z10) {
            obj = d3Var.getRenderNode();
        } else {
            obj = null;
        }
        botFullscreenButtons.setParentRenderNode(obj);
        m3Var.addView(botFullscreenButtons, a6.e(-1, -1, 119));
        botFullscreenButtons.setOnCloseClickListener(new h2(this, 4));
        botFullscreenButtons.setOnCollapseClickListener(new h2(this, 5));
        botFullscreenButtons.setOnMenuClickListener(new h2(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f6801p0 = frameLayout;
        FrameLayout.LayoutParams e7 = a6.e(-1, 200, 55);
        this.f6802q0 = e7;
        m3Var.addView(frameLayout, e7);
        this.Y = getContext().getDrawable(R.drawable.header_shadow).mutate();
        ?? lVar = new org.telegram.ui.ActionBar.l(context, f6Var);
        this.W = lVar;
        lVar.setBackgroundColor(0);
        lVar.setBackButtonImage(R.drawable.ic_close_white);
        A();
        lVar.setActionBarMenuOnItemClick(new w(this, 1));
        lVar.setAlpha(0.0f);
        FrameLayout.LayoutParams e10 = a6.e(-1, -2, 49);
        this.X = e10;
        m3Var.addView((View) lVar, e10);
        ?? o4Var = new o4(context, f6Var);
        this.f6814y = o4Var;
        m3Var.addView((View) o4Var, a6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        e3Var.setWebViewProgressListener(new bi.a6(this, 1));
        d3Var.addView(e3Var, a6.c(-1.0f, -1));
        d3Var.setScrollListener(new h2(this, 7));
        d3Var.setScrollEndListener(new h2(this, 8));
        d3Var.setDelegate(new i2(this));
        d3Var.setIsKeyboardVisible(new i2(this));
        be0 be0Var = new be0(context);
        this.f6806s0 = be0Var;
        m3Var.addView(be0Var, a6.c(-1.0f, -1));
        setContentView(m3Var, new ViewGroup.LayoutParams(-1, -1));
        D();
        LaunchActivity launchActivity = LaunchActivity.G1;
        org.telegram.ui.ActionBar.q3 P = launchActivity != null ? launchActivity.P() : null;
        this.f6803r = P;
        if (P != null) {
            wc wcVar = new wc(m3Var, 19);
            h2 h2Var = new h2(this, 2);
            P.I.add(wcVar);
            P.J.add(h2Var);
            this.f6805s = new u6(P);
        }
    }

    public static void d(n3 n3Var) {
        if (!n3Var.M0) {
            super.dismiss();
            n3Var.M0 = true;
        }
    }

    public static WindowInsets e(n3 n3Var, View view, WindowInsets windowInsets) {
        r0.i1 i1Var = r0.l1.h(view, windowInsets).f41074a;
        i0.c f7 = i1Var.f(2);
        n3Var.f6790f.set(f7.f10074a, f7.f10075b, f7.f10076c, f7.d);
        i0.c f10 = i1Var.f(647);
        Rect rect = n3Var.h;
        rect.set(Math.max(f10.f10074a, windowInsets.getStableInsetLeft()), Math.max(f10.f10075b, windowInsets.getStableInsetTop()), Math.max(f10.f10076c, windowInsets.getStableInsetRight()), Math.max(f10.d, windowInsets.getStableInsetBottom()));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 28) {
            rect.top = Math.max(rect.top, AndroidUtilities.getStatusBarHeight(n3Var.getContext()));
        }
        int i11 = i1Var.f(8).d;
        if (i11 > rect.bottom && i11 > AndroidUtilities.dp(20.0f)) {
            n3Var.f6798n = i11;
        } else {
            n3Var.f6798n = 0;
        }
        n3Var.D();
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
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.R = string;
        d2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new x1(i10, j3, tL_attachMenuBot, runnable));
        hc.b.s(R.string.Cancel, alertDialog$Builder, null);
    }

    public static JSONObject p(f6 f6Var, final boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int v = j6.v(-16777216, j6.v0(j6.f17998h5, f6Var));
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
            jSONObject.put("section_bg_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.f17928d6, f6Var))));
            int i10 = j6.f17872a7;
            jSONObject.put("secondary_bg_color", callbackReturn.run(Integer.valueOf(j6.v0(i10, f6Var))));
            jSONObject.put("text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.G6, f6Var))));
            jSONObject.put("hint_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.H6, f6Var))));
            jSONObject.put("link_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.J6, f6Var))));
            jSONObject.put("button_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.Oh, f6Var))));
            jSONObject.put("button_text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.Sh, f6Var))));
            jSONObject.put("header_bg_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.f18201s8, f6Var))));
            jSONObject.put("accent_text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.q6, f6Var))));
            jSONObject.put("section_header_text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.L6, f6Var))));
            jSONObject.put("subtitle_text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.f18325z6, f6Var))));
            jSONObject.put("destructive_text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.f18144p7, f6Var))));
            jSONObject.put("section_separator_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.f17929d7, f6Var))));
            jSONObject.put("bottom_bar_bg_color", callbackReturn.run(Integer.valueOf(j6.v0(i10, f6Var))));
            return jSONObject;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public final void A() {
        if (!this.U) {
            int i10 = j6.G6;
            f6 f6Var = this.E;
            int v02 = j6.v0(i10, f6Var);
            k3 k3Var = this.W;
            k3Var.setTitleColor(v02);
            k3Var.C(j6.v0(i10, f6Var), false);
            k3Var.A(j6.v0(j6.f18238u8, f6Var), false);
            k3Var.D(j6.v0(j6.G8, f6Var), false);
            k3Var.E(j6.v0(j6.E8, f6Var), false, false);
            k3Var.E(j6.v0(j6.F8, f6Var), true, false);
            k3Var.F(j6.v0(j6.I5, f6Var), false);
        }
        this.f6812x.setFlickerViewColor(this.P.getColor());
    }

    public final void B() {
        pc pcVar;
        boolean z10;
        o0 c10 = o0.c(getContext(), this.G, this.H);
        ArrayList arrayList = c10.e;
        n0 n0Var = c10.f6824f;
        boolean z11 = true;
        if (n0Var == null) {
            pc pcVar2 = this.f6799n0;
            if (pcVar2 != null) {
                pcVar2.b();
                this.f6799n0 = null;
            }
        } else if ((n0Var.c() && !n0Var.f6778l) || n0Var.f6777k) {
            if (this.L0 != n0Var && (pcVar = this.f6799n0) != null) {
                pcVar.b();
                this.f6799n0 = null;
            }
            pc pcVar3 = this.f6799n0;
            if (pcVar3 == null || !pcVar3.f26083l) {
                this.L0 = n0Var;
                m0 m0Var = new m0(getContext(), this.E);
                this.f6800o0 = m0Var;
                pc f7 = pc.f(this.f6801p0, m0Var, 5000);
                this.f6799n0 = f7;
                f7.k(true);
            }
            if (this.f6800o0.c(n0Var)) {
                this.f6799n0 = null;
            }
            n0Var.f6777k = false;
            n0Var.f6778l = true;
        } else {
            m0 m0Var2 = this.f6800o0;
            if (m0Var2 != null) {
                this.L0 = n0Var;
                if (m0Var2.c(n0Var)) {
                    this.f6799n0 = null;
                }
            }
        }
        C();
        for (Map.Entry entry : this.J0.entrySet()) {
            org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) entry.getValue();
            n0 n0Var2 = (n0) entry.getKey();
            g1Var.setText(n0Var2.f6772c);
            if (!n0Var2.c()) {
                g1Var.setSubtext(AndroidUtilities.formatFileSize(n0Var2.f6774g));
            } else {
                Pair b10 = n0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    g1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) b10.second).longValue()));
                } else {
                    g1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()));
                }
            }
            if (n0Var2.c()) {
                g1Var.setRightIcon(R.drawable.msg_close);
                g1Var.f17724b.setPadding(0, 0, AndroidUtilities.dp(32.0f), 0);
            } else if (n0Var2.f6775i) {
                g1Var.setVisibility(8);
            } else {
                g1Var.setRightIcon(0);
                g1Var.f17724b.setPadding(0, 0, 0, 0);
            }
            g1Var.setOnClickListener(new bi.n3(4, this, n0Var2));
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = this.f6783a0;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((n0) obj).c()) {
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
                if (((n0) obj2).c()) {
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
        m0 m0Var = this.f6800o0;
        if (m0Var == null) {
            return;
        }
        if (this.f6788d0) {
            m0Var.setArrow(AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(26.0f), this.f6791f0));
        } else if (this.f6784b > 0.5f) {
            m0Var.setArrow(AndroidUtilities.dp(24.0f));
        } else {
            m0Var.setArrow(-1);
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
        boolean z10 = this.f6788d0;
        e3 e3Var = this.f6812x;
        m3 m3Var = this.e;
        j3 j3Var = this.f6797l0;
        int i16 = 0;
        if (z10) {
            if (j3Var != null && j3Var.getTotalHeight() > 0) {
                i14 = rect.bottom;
            } else {
                i14 = 0;
            }
            int i17 = rect.left;
            int i18 = rect.top;
            int i19 = rect.right;
            if (this.f6798n > i14 || (j3Var != null && j3Var.getTotalHeight() > 0)) {
                i15 = 0;
            } else {
                i15 = rect.bottom;
            }
            Rect rect2 = new Rect(i17, i18, i19, i15);
            int dp = AndroidUtilities.dp(46.0f);
            e3Var.Q(rect2, false);
            e3Var.P(dp, false);
            m3Var.setPadding(0, 0, 0, Math.max(this.f6798n, i14));
        } else {
            e3Var.Q(new Rect(0, 0, 0, 0), false);
            e3Var.P(0, false);
            int i20 = rect.left;
            int i21 = rect.right;
            int i22 = this.f6798n;
            org.telegram.ui.ActionBar.q3 q3Var = this.f6803r;
            if (q3Var != null) {
                i10 = q3Var.H;
            } else {
                i10 = 0;
            }
            m3Var.setPadding(i20, 0, i21, Math.max(i22, i10 + rect.bottom));
        }
        this.f6810w.topMargin = AndroidUtilities.dp(24.0f);
        boolean z11 = this.f6788d0;
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
        FrameLayout.LayoutParams layoutParams2 = this.f6802q0;
        layoutParams2.leftMargin = i12;
        if (!z11) {
            i13 = 0;
        } else {
            i13 = rect.right;
        }
        layoutParams2.rightMargin = i13;
        boolean z12 = this.f6793h0;
        d3 d3Var = this.v;
        if (!z12) {
            d3Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f6788d0) {
                d3Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                d3Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f));
            }
            d3Var.setSwipeOffsetAnimationDisallowed(false);
            d3Var.c();
            d3Var.invalidate();
            d3Var.requestLayout();
        }
        if (d3Var != null) {
            d3Var.setFullSize(m());
        }
        j3Var.requestLayout();
        m3Var.requestLayout();
        if (!this.f6788d0) {
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
            z10 = (AndroidUtilities.isTablet() || i0.a.f(j6.w0(null, j6.f17928d6, true)) < 0.7210000157356262d || this.f6784b < 0.85f) ? false : false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            this.d = Boolean.valueOf(z10);
            if (Build.VERSION.SDK_INT >= 23) {
                m3 m3Var = this.e;
                int systemUiVisibility = m3Var.getSystemUiVisibility();
                if (z10) {
                    i10 = systemUiVisibility | 8192;
                } else {
                    i10 = systemUiVisibility & (-8193);
                }
                m3Var.setSystemUiVisibility(i10);
            }
        }
    }

    public final void F() {
        org.telegram.ui.web.y0 webView;
        e3 e3Var = this.f6812x;
        if (e3Var == null || (webView = e3Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.P.getColor());
    }

    public final void G() {
        int i10;
        j3 j3Var;
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
            boolean z10 = this.f6788d0;
            if (z10) {
                attributes.flags = i10 | attributes.flags;
            } else {
                attributes.flags = (~i10) & attributes.flags;
            }
            m3 m3Var = this.e;
            if (z10 && (((j3Var = this.f6797l0) == null || j3Var.getTotalHeight() <= 0) && !m3Var.f6763x0)) {
                m3Var.setSystemUiVisibility(m3Var.getSystemUiVisibility() | 2);
            } else {
                m3Var.setSystemUiVisibility(m3Var.getSystemUiVisibility() & (-3));
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
        p3Var.f18553q = this.Q;
        p3Var.f18552p = this.f6808u0;
        p3Var.f18550n = this.U;
        p3Var.f18551o = this.V;
        p3Var.f18554r = this.P.getColor();
        p3Var.f18540a = this.f6809v0;
        boolean z13 = false;
        e3 e3Var = this.f6812x;
        if (e3Var != null && e3Var.N) {
            z10 = true;
        } else {
            z10 = false;
        }
        p3Var.f18556t = z10;
        p3Var.D = j6.I.q();
        org.telegram.ui.web.y0 y0Var = null;
        if (e3Var != null) {
            str = e3Var.getUrlLoaded();
        } else {
            str = null;
        }
        p3Var.f18559x = str;
        if (e3Var != null && e3Var.f37901t0) {
            z11 = true;
        } else {
            z11 = false;
        }
        p3Var.e = z11;
        if (e3Var != null) {
            str2 = e3Var.getTrustedOrigin();
        } else {
            str2 = null;
        }
        p3Var.f18543f = str2;
        d3 d3Var = this.v;
        if ((d3Var == null || d3Var.getSwipeOffsetY() >= 0.0f) && !this.f6813x0 && !m() && !this.f6788d0) {
            z12 = false;
        } else {
            z12 = true;
        }
        p3Var.f18546j = z12;
        p3Var.f18561z = this.f6788d0;
        p3Var.A = this.f6789e0;
        Boolean bool = this.f6816z0;
        if (bool == null) {
            booleanValue = this.f6815y0;
        } else {
            booleanValue = bool.booleanValue();
        }
        p3Var.B = booleanValue;
        if (d3Var != null) {
            f7 = d3Var.getOffsetY();
        } else {
            f7 = Float.MAX_VALUE;
        }
        p3Var.f18547k = f7;
        p3Var.C = this.A0;
        p3Var.f18557u = this.f6811w0;
        p3Var.f18560y = this.f6804r0;
        p3Var.v = this.f6785b0;
        p3Var.f18548l = (d3Var == null || d3Var.M) ? true : true;
        p3Var.f18558w = this.f6797l0.e;
        p3Var.f18555s = this.R;
        d1 d1Var = this.B0;
        if (d1Var != null) {
            d1Var.b();
        }
        p3Var.K = this.B0;
        if (e3Var != null) {
            y0Var = e3Var.getWebView();
        }
        if (y0Var != null) {
            e3Var.M();
            p3Var.f18541b = y0Var;
            p3Var.d = e3Var.getBotProxy();
            p3Var.f18544g = y0Var.getWidth();
            p3Var.h = y0Var.getHeight();
            y0Var.onPause();
        }
        boolean z14 = this.S0;
        p3Var.G = z14;
        if (z14) {
            p3Var.H = this.T0;
        }
        p3Var.L = this.C0;
        this.D0 = p3Var;
        return p3Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.k3 k3Var) {
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
            this.f6812x.f37892n.b(j6.v0(j6.f17928d6, this.E), 153);
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
    public final org.telegram.ui.ActionBar.x3 mo37getWindowView() {
        return this.e;
    }

    public final void h() {
        LaunchActivity launchActivity;
        if (!this.M0 && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.H(true, true, true);
        }
        m3 m3Var = this.e;
        if (m3Var != null) {
            m3Var.invalidate();
        }
    }

    public final void i() {
        if (this.U0 == null) {
            org.telegram.ui.e3 e3Var = new org.telegram.ui.e3(getContext());
            this.U0 = e3Var;
            this.v.addView(e3Var, a6.c(-1.0f, -1));
            this.U0.setTranslationY(-1.0f);
            this.U0.h.setOnClickListener(new q2(this, 0));
            this.U0.setBackgroundColor(this.P.getColor());
            AndroidUtilities.updateViewVisibilityAnimated(this.U0, this.S0, 1.0f, false);
        }
    }

    public final void k(boolean z10) {
        int i10;
        LaunchActivity launchActivity;
        if (this.f6787c0) {
            return;
        }
        int i11 = 0;
        if (this.H0 != null) {
            z10 = false;
        }
        this.f6787c0 = true;
        z(false);
        AndroidUtilities.cancelRunOnUIThread(this.f6807t0);
        NotificationCenter.getInstance(this.G).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getInstance(this.G).removeObserver(this, NotificationCenter.botDownloadsUpdate);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        if (z10 && ((launchActivity = LaunchActivity.G1) == null || launchActivity.f29973y0 == null)) {
            z10 = false;
        }
        if (z10) {
            o1.k kVar = this.f6786c;
            if (kVar != null) {
                kVar.f14134u.f14140i = 0.0f;
                kVar.f();
            }
            LaunchActivity.G1.f29973y0.b(this);
        } else {
            j3 j3Var = this.f6797l0;
            if (j3Var != null) {
                j3Var.animate().translationY(j3Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(wr.h).start();
            }
            this.f6812x.i();
            d3 d3Var = this.v;
            int height = d3Var.getHeight();
            if (j3Var != null) {
                i10 = j3Var.getTotalHeight();
            } else {
                i10 = 0;
            }
            int i12 = height + i10;
            Rect rect = this.h;
            int R = this.e.R() + i12 + rect.top + rect.bottom;
            if (m()) {
                i11 = AndroidUtilities.dp(200.0f);
            }
            d3Var.f(R + i11, true, new h2(this, 0));
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
        if (!this.f6788d0) {
            Boolean bool = this.f6816z0;
            if (bool == null) {
                if (!this.f6815y0) {
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
        if (this.f6809v0 != null) {
            long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.f6809v0.f6719r));
            String str = null;
            this.f6816z0 = null;
            TLObject tLObject = this.f6809v0.f6718q;
            if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                this.J = tL_webViewResultUrl.query_id;
                str = tL_webViewResultUrl.url;
                z10 = tL_webViewResultUrl.same_origin;
                this.f6816z0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
                boolean z11 = this.E0;
                if (!z11) {
                    x(tL_webViewResultUrl.fullscreen, !z11, this.f6789e0);
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
                MediaDataController.getInstance(this.G).increaseWebappRating(this.f6809v0.f6707c);
                this.f6812x.u(this.G, str, z10);
            }
            AndroidUtilities.runOnUIThread(this.f6807t0, max);
            d3 d3Var = this.v;
            if (d3Var != null) {
                d3Var.setFullSize(m());
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
        if (this.f6786c == null) {
            o1.k kVar = new o1.k(this, X0);
            o1.l lVar = new o1.l();
            lVar.b(1200.0f);
            lVar.a(1.0f);
            kVar.f14134u = lVar;
            this.f6786c = kVar;
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f6806s0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else if (this.f6812x.D()) {
        } else {
            k(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        j3 j3Var;
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
        if (this.f6788d0) {
            attributes.flags = i12 | 512;
        } else {
            attributes.flags = i11 & (-515);
        }
        window.setAttributes(attributes);
        if (i10 >= 23) {
            window.setStatusBarColor(0);
        }
        m3 m3Var = this.e;
        m3Var.setFitsSystemWindows(true);
        m3Var.setSystemUiVisibility(1792);
        m3Var.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return n3.e(n3.this, view, windowInsets);
            }
        });
        if (this.f6788d0 && ((j3Var = this.f6797l0) == null || j3Var.getTotalHeight() <= 0)) {
            m3Var.setSystemUiVisibility(m3Var.getSystemUiVisibility() | 2);
        } else {
            m3Var.setSystemUiVisibility(m3Var.getSystemUiVisibility() & (-3));
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
        o1.k kVar = this.f6786c;
        if (kVar != null) {
            kVar.c();
            this.f6786c = null;
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
            ((LaunchActivity) context).B0.add(this.f6806s0);
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
            ((LaunchActivity) context).B0.remove(this.f6806s0);
        }
    }

    public final boolean q() {
        String str;
        if (this.f6804r0) {
            TLRPC.User user = MessagesController.getInstance(this.G).getUser(Long.valueOf(this.H));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            alertDialog$Builder.f17528a.R = str;
            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new i2(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            d2Var.show();
            ((TextView) d2Var.d(-1)).setTextColor(j6.v0(j6.f18162q7, this.E));
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
        w70 w70Var = this.K0;
        if (w70Var != null) {
            w70Var.u();
        }
        if (this.f6788d0) {
            view = this.m0;
        } else {
            view = this.Z;
        }
        w70 G = w70.G(this.e, this.E, view, true);
        this.K0 = G;
        ArrayList arrayList3 = o0.c(getContext(), this.G, this.H).e;
        HashMap hashMap = this.J0;
        hashMap.clear();
        if (!arrayList3.isEmpty()) {
            w70 J = G.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new mu0(G, 25), false);
            J.k();
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj = arrayList3.get(i13);
                i13++;
                n0 n0Var = (n0) obj;
                String str = n0Var.f6772c;
                bi.f0 f0Var = new bi.f0(4);
                f6 f6Var = J.d;
                if (J.e == null) {
                    arrayList = arrayList3;
                } else {
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, J.e, J.d, false, false);
                    arrayList = arrayList3;
                    g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    g1Var.setText(str);
                    g1Var.setSubtext("");
                    Integer num = J.f28686j0;
                    if (num != null) {
                        v02 = num.intValue();
                    } else {
                        v02 = j6.v0(j6.E8, f6Var);
                    }
                    Integer num2 = J.f28688k0;
                    if (num2 != null) {
                        v03 = num2.intValue();
                    } else {
                        v03 = j6.v0(j6.F8, f6Var);
                    }
                    g1Var.c(v02, v03);
                    Integer num3 = J.f28690l0;
                    if (num3 != null) {
                        l1 = num3.intValue();
                    } else {
                        l1 = j6.l1(0.12f, j6.v0(j6.E8, f6Var));
                    }
                    g1Var.setSelectorColor(l1);
                    g1Var.setOnClickListener(new org.telegram.ui.Components.h0(J, f0Var));
                    int i14 = J.S;
                    if (i14 > 0) {
                        g1Var.setMinimumWidth(AndroidUtilities.dp(i14));
                        J.r(g1Var, a6.n(J.S, -2));
                    } else {
                        J.r(g1Var, a6.n(-1, -2));
                        hashMap.put(n0Var, J.y());
                        arrayList3 = arrayList;
                    }
                }
                hashMap.put(n0Var, J.y());
                arrayList3 = arrayList;
            }
            B();
            J.S = AndroidUtilities.dp(180.0f);
            G.c(R.drawable.menu_download_round, LocaleController.getString(R.string.BotDownloads), new p2(G, J, 0), false);
            G.k();
        }
        if (this.H0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        G.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new h2(this, 9), z10);
        if (this.H0 == null && this.f6785b0) {
            z11 = true;
        } else {
            z11 = false;
        }
        G.l(R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings), new h2(this, 10), z11);
        G.c(R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage), new h2(this, 11), false);
        if (this.H0 == null && user != null && user.bot_has_main_app) {
            z12 = true;
        } else {
            z12 = false;
        }
        G.l(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new h2(this, 12), z12);
        if (this.H0 == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        G.l(R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS), new h2(this, 13), z13);
        if (this.H0 == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        G.l(R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot), new h2(this, 14), z14);
        if (this.H0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu)) {
            z15 = true;
        } else {
            z15 = false;
        }
        G.l(R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot), new h2(this, 15), z15);
        if (this.Q != j6.w0(null, j6.f17928d6, false)) {
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
                if (w10 instanceof org.telegram.ui.ActionBar.g1) {
                    org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) w10;
                    g1Var2.c(i11, l12);
                    g1Var2.setSelectorColor(l13);
                }
            }
        }
        G.V(5);
        G.a0(-this.h.right, 0.0f);
        G.U = true;
        G.f28702t = false;
        G.f28701s = 0;
        G.Z();
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
        z(false);
    }

    public final void s(org.telegram.ui.ActionBar.p2 p2Var, j5 j5Var) {
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
        this.f6809v0 = j5Var;
        int i10 = j5Var.f6705a;
        this.G = i10;
        this.I = j5Var.f6706b;
        this.H = j5Var.f6707c;
        this.K = j5Var.h;
        this.L = j5Var.f6710i;
        this.M = j5Var.e;
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(this.H));
        CharSequence userName = UserObject.getUserName(user2);
        boolean z13 = false;
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        k3 k3Var = this.W;
        k3Var.setTitle(userName);
        TLRPC.UserFull userFull = MessagesController.getInstance(this.G).getUserFull(this.H);
        f6 f6Var = this.E;
        if ((user2 != null && user2.verified) || (userFull != null && (user = userFull.user) != null && user.verified)) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            this.I0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.Oh, f6Var), PorterDuff.Mode.SRC_IN));
            this.I0.setAlpha(255);
            k3Var.getTitleTextView().setDrawablePadding(AndroidUtilities.dp(2.0f));
            k3Var.getTitleTextView().i(new bi.w4(this, 1));
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
        org.telegram.ui.ActionBar.z n10 = k3Var.n();
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
                MessagesController.getInstance(this.G).loadFullUser(user2, 0, true, new k2(this, 1));
            }
            if (j5Var.f6717p) {
                x(z11, false, this.f6789e0);
            }
        }
        if (this.H0 == null) {
            zVar2 = zVar;
            zVar2.a(R.id.menu_collapse_bot, R.drawable.arrow_more);
        } else {
            zVar2 = zVar;
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = new BotFullscreenButtons.OptionsIcon(getContext());
        this.f6783a0 = optionsIcon;
        org.telegram.ui.ActionBar.w0 d = zVar2.d(0, optionsIcon);
        this.Z = d;
        d.setOnClickListener(new q2(this, 1));
        k3Var.setActionBarMenuOnItemClick(new v2(this));
        JSONObject p5 = p(f6Var, false);
        TLRPC.User user3 = MessagesController.getInstance(this.G).getUser(Long.valueOf(this.H));
        e3 e3Var = this.f6812x;
        e3Var.setBotUser(user3);
        e3Var.t(this.G, this.H);
        TLRPC.User user4 = j5Var.f6714m;
        if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu && !MediaDataController.getInstance(this.G).isShortcutAdded(this.H, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
            if (user4 == null) {
                user4 = MessagesController.getInstance(this.G).getUser(Long.valueOf(this.H));
            }
            if (user4 != null && user4.photo != null && !FileLoader.getInstance(this.G).getPathToAttach(user4.photo.photo_small, true).exists()) {
                MediaDataController.getInstance(this.G).preloadImage(ImageLocation.getForUser(this.G, user4, 1), 0);
            }
        }
        if (j5Var.f6718q != null) {
            n();
            return;
        }
        int i12 = j5Var.f6709g;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                TLRPC.TL_messages_requestChatJoinWebView tL_messages_requestChatJoinWebView = new TLRPC.TL_messages_requestChatJoinWebView();
                                tL_messages_requestChatJoinWebView.platform = "android";
                                tL_messages_requestChatJoinWebView.query_id = j5Var.d;
                                if (p5 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = p5.toString();
                                }
                                ConnectionsManager.getInstance(this.G).sendRequestTyped(tL_messages_requestChatJoinWebView, new Object(), new ai.c0(this, 16), 66);
                                return;
                            }
                            return;
                        }
                        TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                        tL_messages_requestMainWebView.bot = MessagesController.getInstance(this.G).getInputUser(j5Var.f6707c);
                        tL_messages_requestMainWebView.platform = "android";
                        if (p2Var instanceof eo) {
                            eo eoVar = (eo) p2Var;
                            if (eoVar.i() != null) {
                                inputPeer2 = MessagesController.getInputPeer(eoVar.i());
                            } else {
                                inputPeer2 = MessagesController.getInputPeer(eoVar.e);
                            }
                        } else {
                            inputPeer2 = MessagesController.getInstance(this.G).getInputPeer(j5Var.f6706b);
                        }
                        tL_messages_requestMainWebView.peer = inputPeer2;
                        tL_messages_requestMainWebView.compact = j5Var.f6716o;
                        tL_messages_requestMainWebView.fullscreen = j5Var.f6717p;
                        if (!TextUtils.isEmpty(j5Var.f6713l)) {
                            tL_messages_requestMainWebView.start_param = j5Var.f6713l;
                            tL_messages_requestMainWebView.flags |= 2;
                        }
                        if (p5 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                            tL_messages_requestMainWebView.theme_params = tL_dataJSON2;
                            tL_dataJSON2.data = p5.toString();
                            tL_messages_requestMainWebView.flags |= 1;
                        }
                        ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestMainWebView, new s2(this, 5), 66);
                        return;
                    }
                    TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                    TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                    TLRPC.BotApp botApp = j5Var.f6711j;
                    tL_inputBotAppID.f17253id = botApp.f17192id;
                    tL_inputBotAppID.access_hash = botApp.access_hash;
                    tL_messages_requestAppWebView.app = tL_inputBotAppID;
                    tL_messages_requestAppWebView.write_allowed = j5Var.f6712k;
                    tL_messages_requestAppWebView.platform = "android";
                    if (p2Var instanceof eo) {
                        eo eoVar2 = (eo) p2Var;
                        if (eoVar2.i() != null) {
                            inputPeer = MessagesController.getInputPeer(eoVar2.i());
                        } else {
                            inputPeer = MessagesController.getInputPeer(eoVar2.e);
                        }
                    } else {
                        inputPeer = MessagesController.getInputPeer(j5Var.f6714m);
                    }
                    tL_messages_requestAppWebView.peer = inputPeer;
                    tL_messages_requestAppWebView.compact = j5Var.f6716o;
                    tL_messages_requestAppWebView.fullscreen = j5Var.f6717p;
                    if (!TextUtils.isEmpty(j5Var.f6713l)) {
                        tL_messages_requestAppWebView.start_param = j5Var.f6713l;
                        tL_messages_requestAppWebView.flags |= 2;
                    }
                    if (p5 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                        tL_messages_requestAppWebView.theme_params = tL_dataJSON3;
                        tL_dataJSON3.data = p5.toString();
                        tL_messages_requestAppWebView.flags |= 4;
                    }
                    ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestAppWebView, new s2(this, 4), 66);
                    return;
                }
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.bot = MessagesController.getInstance(this.G).getInputUser(this.H);
                tL_messages_requestWebView.peer = MessagesController.getInstance(this.G).getInputPeer(this.H);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = j5Var.f6716o;
                tL_messages_requestWebView.fullscreen = j5Var.f6717p;
                tL_messages_requestWebView.url = j5Var.f6708f;
                tL_messages_requestWebView.flags |= 2;
                if (p5 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON4;
                    tL_dataJSON4.data = p5.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestWebView, new s2(this, 1));
                NotificationCenter.getInstance(this.G).addObserver(this, NotificationCenter.webViewResultSent);
                return;
            }
            TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
            if ((j5Var.f6715n & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_messages_requestSimpleWebView.from_switch_webview = z10;
            tL_messages_requestSimpleWebView.bot = MessagesController.getInstance(this.G).getInputUser(this.H);
            tL_messages_requestSimpleWebView.platform = "android";
            if ((j5Var.f6715n & 2) != 0) {
                z13 = true;
            }
            tL_messages_requestSimpleWebView.from_side_menu = z13;
            tL_messages_requestSimpleWebView.compact = j5Var.f6716o;
            tL_messages_requestSimpleWebView.fullscreen = j5Var.f6717p;
            if (p5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                tL_messages_requestSimpleWebView.theme_params = tL_dataJSON5;
                tL_dataJSON5.data = p5.toString();
                tL_messages_requestSimpleWebView.flags |= 1;
            }
            if (!TextUtils.isEmpty(j5Var.f6708f)) {
                tL_messages_requestSimpleWebView.flags |= 8;
                tL_messages_requestSimpleWebView.url = j5Var.f6708f;
            }
            if (!TextUtils.isEmpty(j5Var.f6713l)) {
                tL_messages_requestSimpleWebView.start_param = j5Var.f6713l;
                tL_messages_requestSimpleWebView.flags |= 16;
            }
            ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestSimpleWebView, new s2(this, 2));
            return;
        }
        TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
        tL_messages_requestWebView2.peer = MessagesController.getInstance(this.G).getInputPeer(this.I);
        tL_messages_requestWebView2.bot = MessagesController.getInstance(this.G).getInputUser(this.H);
        tL_messages_requestWebView2.platform = "android";
        tL_messages_requestWebView2.compact = j5Var.f6716o;
        tL_messages_requestWebView2.fullscreen = j5Var.f6717p;
        String str = j5Var.f6708f;
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
        ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestWebView2, new s2(this, 3));
        NotificationCenter.getInstance(this.G).addObserver(this, NotificationCenter.webViewResultSent);
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        z(true);
        m3 m3Var = this.e;
        m3Var.setAlpha(0.0f);
        m3Var.addOnLayoutChangeListener(new x2(this, 0));
        super.show();
        this.M0 = false;
        W0.add(this);
    }

    public final void t(final int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        final int i12 = this.Q;
        j6.b(0.35f, -0.1f, i10);
        final f2 f2Var = new f2();
        int i13 = 0;
        if (this.U) {
            i11 = this.Q;
        } else {
            i11 = 0;
        }
        SparseIntArray sparseIntArray = f2Var.f6625a;
        f6 f6Var = this.E;
        f2Var.c(sparseIntArray, i11, f6Var);
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
        f2Var.c(f2Var.f6626b, i13, f6Var);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(wr.f28819f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int d = i0.a.d(floatValue, i12, i10);
                    n3 n3Var = n3.this;
                    n3Var.Q = d;
                    n3Var.h();
                    m3 m3Var = n3Var.e;
                    m3Var.invalidate();
                    k3 k3Var = n3Var.W;
                    k3Var.setBackgroundColor(n3Var.Q);
                    f2 f2Var2 = f2Var;
                    f2Var2.b(k3Var, floatValue);
                    n3Var.f6782a = f2Var2.a(j6.Ii);
                    m3Var.invalidate();
                }
            });
            duration.addListener(new c3(this, i12, i10, f2Var));
            duration.start();
        } else {
            this.Q = i10;
            h();
            m3 m3Var = this.e;
            m3Var.invalidate();
            int i14 = this.Q;
            k3 k3Var = this.W;
            k3Var.setBackgroundColor(i14);
            f2Var.b(k3Var, 1.0f);
            this.f6782a = f2Var.a(j6.Ii);
            m3Var.invalidate();
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
            duration.setInterpolator(wr.f28819f);
            this.P0.addUpdateListener(new o2(this, color, i10, 0));
            this.P0.addListener(new y2(this, i10, 0));
            this.P0.start();
            return;
        }
        paint.setColor(i10);
        A();
        this.e.invalidate();
        org.telegram.ui.e3 e3Var = this.U0;
        if (e3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) > 0.721f) {
                z11 = false;
            }
            e3Var.b(z11, false);
            this.U0.setBackgroundColor(paint.getColor());
        }
        F();
    }

    public final void w(boolean z10) {
        if (this.f6815y0 != z10) {
            this.f6815y0 = z10;
            d3 d3Var = this.v;
            if (d3Var != null) {
                d3Var.setFullSize(m());
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
        if (this.f6788d0 == z10) {
            return;
        }
        this.f6788d0 = z10;
        int i10 = 0;
        if (z12 && !MessagesController.getInstance(this.G).disableBotFullscreenBlur && SharedConfig.getDevicePerformanceClass() >= 2) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f6789e0 = z13;
        ValueAnimator valueAnimator = this.R0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        BotFullscreenButtons botFullscreenButtons = this.m0;
        d3 d3Var = this.v;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setPreview(z10, z11);
            if (this.f6789e0) {
                obj = d3Var.getRenderNode();
            } else {
                obj = null;
            }
            botFullscreenButtons.setParentRenderNode(obj);
        }
        this.f6794i0 = d3Var.getWidth();
        this.f6795j0 = d3Var.getHeight();
        this.Q0 = false;
        j3 j3Var = this.f6797l0;
        e3 e3Var = this.f6812x;
        k3 k3Var = this.W;
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
                f12 = d3Var.getTranslationY();
            } else {
                f12 = -AndroidUtilities.dp(24.0f);
            }
            if (z10) {
                currentActionBarHeight = -AndroidUtilities.dp(24.0f);
            } else {
                currentActionBarHeight = (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f);
            }
            float f14 = currentActionBarHeight;
            float currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            o1.k kVar = d3Var.v;
            if (kVar != null) {
                kVar.c();
            }
            o1.k kVar2 = d3Var.G;
            if (kVar2 != null) {
                kVar2.c();
            }
            d3Var.setSwipeOffsetAnimationDisallowed(true);
            k3Var.setVisibility(0);
            if (z10) {
                d3Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                d3Var.setTopActionBarOffsetY(currentActionBarHeight2 - AndroidUtilities.dp(24.0f));
            }
            d3Var.c();
            d3Var.invalidate();
            this.f6792g0 = 0.0f;
            if (z10) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            this.f6791f0 = f13;
            k3Var.setAlpha(1.0f - f13);
            k3Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * this.f6791f0);
            d3Var.setTranslationY(AndroidUtilities.lerp(f12, f14, this.f6792g0));
            d3Var.setTranslationX(AndroidUtilities.lerp(f11, 0.0f, this.f6792g0));
            j3Var.setTranslationX(AndroidUtilities.lerp(f10, 0.0f, this.f6792g0));
            botFullscreenButtons.setAlpha(this.f6791f0);
            this.e.invalidate();
            e3Var.setViewPortHeightOffset(d3Var.getTranslationY() - f14);
            e3Var.o(false, false);
            this.f6793h0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.R0 = ofFloat;
            float f15 = f11;
            ofFloat.addUpdateListener(new z2(this, z10, f12, f14, f15, f10));
            this.R0.addListener(new a3(this, z10, currentActionBarHeight2, f15));
            this.R0.setDuration(280L);
            this.R0.setInterpolator(wr.h);
            this.R0.start();
            return;
        }
        this.f6793h0 = false;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f6791f0 = f7;
        this.f6792g0 = 0.0f;
        D();
        G();
        if (z10) {
            i10 = 8;
        }
        k3Var.setVisibility(i10);
        k3Var.setAlpha(1.0f - this.f6791f0);
        k3Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * this.f6791f0);
        j3Var.setTranslationX(0.0f);
        botFullscreenButtons.setAlpha(this.f6791f0);
        e3Var.setViewPortHeightOffset(0.0f);
        e3Var.o(true, true);
        C();
    }

    public final void y(int i10, boolean z10) {
        int i11 = this.R;
        j3 j3Var = this.f6797l0;
        Paint paint = j3Var.f6502a;
        j3Var.e.f275b = i10;
        paint.setColor(i10);
        if (!z10) {
            j3Var.d.a(i10, true);
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(wr.f28819f);
            duration.addUpdateListener(new o2(this, i11, i10, 1));
            duration.addListener(new b3(this, i11, i10, 0));
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
        ofFloat.addListener(new ai.e(10, this, z10));
        this.O0.addUpdateListener(new g2(this, 0));
        this.O0.setInterpolator(wr.h);
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
