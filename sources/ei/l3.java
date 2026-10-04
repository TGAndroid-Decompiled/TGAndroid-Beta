package ei;

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
import ci.qc;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.tr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hu0;
import org.telegram.ui.nb1;
import org.telegram.ui.yn;
import w7.z5;
public final class l3 extends Dialog implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.t3 {
    public static final HashSet W0 = new HashSet();
    public static final ew0 X0;
    public static int Y0;
    public boolean A0;
    public b1 B0;
    public boolean C0;
    public org.telegram.ui.ActionBar.m3 D0;
    public final d6 E;
    public boolean E0;
    public boolean F;
    public boolean F0;
    public int G;
    public float G0;
    public long H;
    public nb1 H0;
    public long I;
    public Drawable I0;
    public long J;
    public final HashMap J0;
    public int K;
    public b80 K0;
    public long L;
    public l0 L0;
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
    public final i3 W;
    public final FrameLayout.LayoutParams X;
    public final Drawable Y;
    public org.telegram.ui.ActionBar.v0 Z;
    public int f9150a;
    public BotFullscreenButtons.OptionsIcon f9151a0;
    public float f9152b;
    public boolean f9153b0;
    public o1.k f9154c;
    public boolean f9155c0;
    public Boolean d;
    public boolean f9156d0;
    public final k3 f9157e;
    public boolean f9158e0;
    public final Rect f9159f;
    public float f9160f0;
    public float f9161g0;
    public final Rect h;
    public boolean f9162h0;
    public int f9163i0;
    public int f9164j0;
    public Activity f9165k0;
    public final h3 f9166l0;
    public final BotFullscreenButtons m0;
    public int f9167n;
    public rc f9168n0;
    public k0 f9169o0;
    public final FrameLayout f9170p0;
    public final FrameLayout.LayoutParams f9171q0;
    public final org.telegram.ui.ActionBar.n3 f9172r;
    public boolean f9173r0;
    public final cf.c f9174s;
    public final ee0 f9175s0;
    public final f2 f9176t0;
    public int f9177u0;
    public final b3 v;
    public f5 f9178v0;
    public final FrameLayout.LayoutParams f9179w;
    public boolean f9180w0;
    public final c3 f9181x;
    public boolean f9182x0;
    public final j3 f9183y;
    public boolean f9184y0;
    public Boolean f9185z0;

    static {
        ew0 ew0Var = new ew0(new d2.c(17), new d2.c(18));
        ew0Var.f26170c = 100.0f;
        X0 = ew0Var;
        Y0 = 0;
    }

    public l3(Context context, d6 d6Var) {
        super(context, R.style.TransparentDialog);
        Object obj;
        this.f9152b = 0.0f;
        this.f9159f = new Rect();
        this.h = new Rect();
        this.f9167n = 0;
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.N = paint;
        Paint paint2 = new Paint();
        this.O = paint2;
        this.P = new Paint(1);
        this.T = new Paint(1);
        this.f9176t0 = new f2(this, 1);
        this.f9177u0 = -1;
        this.f9184y0 = false;
        this.f9185z0 = null;
        this.J0 = new HashMap();
        this.M0 = false;
        this.Q0 = true;
        this.V0 = false;
        this.E = d6Var;
        this.f9150a = i6.w0(null, i6.Ii, false);
        b3 b3Var = new b3(this, context, 0);
        this.v = b3Var;
        b3Var.setAllowFullSizeSwipe(true);
        b3Var.setShouldWaitWebViewScroll(true);
        int i10 = i6.f20822d6;
        c3 c3Var = new c3(this, context, d6Var, i6.v0(i10, d6Var));
        this.f9181x = c3Var;
        c3Var.setOnVerifiedAge(this.H0);
        c3Var.setDelegate(new g3(this, context, d6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.Q = i6.v0(i10, d6Var);
        int v02 = i6.v0(i6.f20766a7, d6Var);
        this.R = v02;
        AndroidUtilities.setNavigationBarColor((Dialog) this, v02, false);
        k3 k3Var = new k3(this, context);
        this.f9157e = k3Var;
        k3Var.setDelegate(new h2(this, 0));
        FrameLayout.LayoutParams e7 = z5.e(-1, -1, 49);
        this.f9179w = e7;
        k3Var.addView(b3Var, e7);
        h3 h3Var = new h3(this, getContext(), d6Var);
        this.f9166l0 = h3Var;
        h3Var.setOnButtonClickListener(new i2(this, 0));
        h3Var.setOnResizeListener(new f2(this, 3));
        k3Var.addView(h3Var, z5.e(-1, -2, 81));
        BotFullscreenButtons botFullscreenButtons = new BotFullscreenButtons(getContext());
        this.m0 = botFullscreenButtons;
        botFullscreenButtons.setAlpha(0.0f);
        botFullscreenButtons.setVisibility(8);
        z10 = (MessagesController.getInstance(this.G).disableBotFullscreenBlur || SharedConfig.getDevicePerformanceClass() < 2) ? false : false;
        this.f9158e0 = z10;
        if (z10) {
            obj = b3Var.getRenderNode();
        } else {
            obj = null;
        }
        botFullscreenButtons.setParentRenderNode(obj);
        k3Var.addView(botFullscreenButtons, z5.e(-1, -1, 119));
        botFullscreenButtons.setOnCloseClickListener(new f2(this, 4));
        botFullscreenButtons.setOnCollapseClickListener(new f2(this, 5));
        botFullscreenButtons.setOnMenuClickListener(new f2(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9170p0 = frameLayout;
        FrameLayout.LayoutParams e10 = z5.e(-1, 200, 55);
        this.f9171q0 = e10;
        k3Var.addView(frameLayout, e10);
        this.Y = getContext().getDrawable(R.drawable.header_shadow).mutate();
        ?? kVar = new org.telegram.ui.ActionBar.k(context, d6Var);
        this.W = kVar;
        kVar.setBackgroundColor(0);
        kVar.setBackButtonImage(R.drawable.ic_close_white);
        A();
        kVar.setActionBarMenuOnItemClick(new u(this, 1));
        kVar.setAlpha(0.0f);
        FrameLayout.LayoutParams e11 = z5.e(-1, -2, 49);
        this.X = e11;
        k3Var.addView((View) kVar, e11);
        ?? l4Var = new l4(context, d6Var);
        this.f9183y = l4Var;
        k3Var.addView((View) l4Var, z5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        c3Var.setWebViewProgressListener(new ci.d5(this, 1));
        b3Var.addView(c3Var, z5.c(-1.0f, -1));
        b3Var.setScrollListener(new f2(this, 7));
        b3Var.setScrollEndListener(new f2(this, 8));
        b3Var.setDelegate(new g2(this));
        b3Var.setIsKeyboardVisible(new g2(this));
        ee0 ee0Var = new ee0(context);
        this.f9175s0 = ee0Var;
        k3Var.addView(ee0Var, z5.c(-1.0f, -1));
        setContentView(k3Var, new ViewGroup.LayoutParams(-1, -1));
        D();
        LaunchActivity launchActivity = LaunchActivity.G1;
        org.telegram.ui.ActionBar.n3 P = launchActivity != null ? launchActivity.P() : null;
        this.f9172r = P;
        if (P != null) {
            qc qcVar = new qc(k3Var, 13);
            f2 f2Var = new f2(this, 2);
            P.I.add(qcVar);
            P.J.add(f2Var);
            this.f9174s = new cf.c(P);
        }
    }

    public static void d(l3 l3Var) {
        if (!l3Var.M0) {
            super.dismiss();
            l3Var.M0 = true;
        }
    }

    public static WindowInsets e(l3 l3Var, View view, WindowInsets windowInsets) {
        r0.i1 i1Var = r0.l1.h(view, windowInsets).f45617a;
        i0.b f7 = i1Var.f(2);
        l3Var.f9159f.set(f7.f11526a, f7.f11527b, f7.f11528c, f7.d);
        i0.b f10 = i1Var.f(647);
        Rect rect = l3Var.h;
        rect.set(Math.max(f10.f11526a, windowInsets.getStableInsetLeft()), Math.max(f10.f11527b, windowInsets.getStableInsetTop()), Math.max(f10.f11528c, windowInsets.getStableInsetRight()), Math.max(f10.d, windowInsets.getStableInsetBottom()));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 28) {
            rect.top = Math.max(rect.top, AndroidUtilities.getStatusBarHeight(l3Var.getContext()));
        }
        int i11 = i1Var.f(8).d;
        if (i11 > rect.bottom && i11 > AndroidUtilities.dp(20.0f)) {
            l3Var.f9167n = i11;
        } else {
            l3Var.f9167n = 0;
        }
        l3Var.D();
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
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new v1(i10, j3, tL_attachMenuBot, runnable));
        hg.c.p(R.string.Cancel, alertDialog$Builder, null);
    }

    public static JSONObject p(d6 d6Var, final boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int v = i6.v(-16777216, i6.v0(i6.f20894h5, d6Var));
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    int v9 = i6.v(v, ((Integer) obj).intValue());
                    Integer valueOf = Integer.valueOf(v9);
                    if (z10) {
                        return String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(v9)), Integer.valueOf(Color.green(v9)), Integer.valueOf(Color.blue(v9)));
                    }
                    return valueOf;
                }
            };
            jSONObject.put("bg_color", callbackReturn.run(Integer.valueOf(v)));
            jSONObject.put("section_bg_color", callbackReturn.run(Integer.valueOf(i6.v0(i6.f20822d6, d6Var))));
            int i10 = i6.f20766a7;
            jSONObject.put("secondary_bg_color", callbackReturn.run(Integer.valueOf(i6.v0(i10, d6Var))));
            jSONObject.put("text_color", callbackReturn.run(Integer.valueOf(i6.v0(i6.G6, d6Var))));
            jSONObject.put("hint_color", callbackReturn.run(Integer.valueOf(i6.v0(i6.H6, d6Var))));
            jSONObject.put("link_color", callbackReturn.run(Integer.valueOf(i6.v0(i6.J6, d6Var))));
            jSONObject.put("button_color", callbackReturn.run(Integer.valueOf(i6.v0(i6.Oh, d6Var))));
            jSONObject.put("button_text_color", callbackReturn.run(Integer.valueOf(i6.v0(i6.Sh, d6Var))));
            jSONObject.put("header_bg_color", callbackReturn.run(Integer.valueOf(i6.v0(i6.f21104s8, d6Var))));
            jSONObject.put("accent_text_color", callbackReturn.run(Integer.valueOf(i6.v0(i6.q6, d6Var))));
            jSONObject.put("section_header_text_color", callbackReturn.run(Integer.valueOf(i6.v0(i6.L6, d6Var))));
            jSONObject.put("subtitle_text_color", callbackReturn.run(Integer.valueOf(i6.v0(i6.f21228z6, d6Var))));
            jSONObject.put("destructive_text_color", callbackReturn.run(Integer.valueOf(i6.v0(i6.f21044p7, d6Var))));
            jSONObject.put("section_separator_color", callbackReturn.run(Integer.valueOf(i6.v0(i6.f20823d7, d6Var))));
            jSONObject.put("bottom_bar_bg_color", callbackReturn.run(Integer.valueOf(i6.v0(i10, d6Var))));
            return jSONObject;
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public final void A() {
        if (!this.U) {
            int i10 = i6.G6;
            d6 d6Var = this.E;
            int v02 = i6.v0(i10, d6Var);
            i3 i3Var = this.W;
            i3Var.setTitleColor(v02);
            i3Var.B(i6.v0(i10, d6Var), false);
            i3Var.A(i6.v0(i6.f21141u8, d6Var), false);
            i3Var.C(i6.v0(i6.G8, d6Var), false);
            i3Var.D(i6.v0(i6.E8, d6Var), false, false);
            i3Var.D(i6.v0(i6.F8, d6Var), true, false);
            i3Var.E(i6.v0(i6.I5, d6Var), false);
        }
        this.f9181x.setFlickerViewColor(this.P.getColor());
    }

    public final void B() {
        rc rcVar;
        boolean z10;
        m0 c10 = m0.c(getContext(), this.G, this.H);
        ArrayList arrayList = c10.f9196e;
        l0 l0Var = c10.f9197f;
        boolean z11 = true;
        if (l0Var == null) {
            rc rcVar2 = this.f9168n0;
            if (rcVar2 != null) {
                rcVar2.b();
                this.f9168n0 = null;
            }
        } else if ((l0Var.c() && !l0Var.f9146l) || l0Var.f9145k) {
            if (this.L0 != l0Var && (rcVar = this.f9168n0) != null) {
                rcVar.b();
                this.f9168n0 = null;
            }
            rc rcVar3 = this.f9168n0;
            if (rcVar3 == null || !rcVar3.f30347l) {
                this.L0 = l0Var;
                k0 k0Var = new k0(getContext(), this.E);
                this.f9169o0 = k0Var;
                rc f7 = rc.f(this.f9170p0, k0Var, 5000);
                this.f9168n0 = f7;
                f7.k(true);
            }
            if (this.f9169o0.c(l0Var)) {
                this.f9168n0 = null;
            }
            l0Var.f9145k = false;
            l0Var.f9146l = true;
        } else {
            k0 k0Var2 = this.f9169o0;
            if (k0Var2 != null) {
                this.L0 = l0Var;
                if (k0Var2.c(l0Var)) {
                    this.f9168n0 = null;
                }
            }
        }
        C();
        for (Map.Entry entry : this.J0.entrySet()) {
            org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) entry.getValue();
            l0 l0Var2 = (l0) entry.getKey();
            f1Var.setText(l0Var2.f9139c);
            if (!l0Var2.c()) {
                f1Var.setSubtext(AndroidUtilities.formatFileSize(l0Var2.f9142g));
            } else {
                Pair b10 = l0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    f1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) b10.second).longValue()));
                } else {
                    f1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()));
                }
            }
            if (l0Var2.c()) {
                f1Var.setRightIcon(R.drawable.msg_close);
                f1Var.f20588b.setPadding(0, 0, AndroidUtilities.dp(32.0f), 0);
            } else if (l0Var2.f9143i) {
                f1Var.setVisibility(8);
            } else {
                f1Var.setRightIcon(0);
                f1Var.f20588b.setPadding(0, 0, 0, 0);
            }
            f1Var.setOnClickListener(new ai.f2(8, this, l0Var2));
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = this.f9151a0;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((l0) obj).c()) {
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
                if (((l0) obj2).c()) {
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
        k0 k0Var = this.f9169o0;
        if (k0Var == null) {
            return;
        }
        if (this.f9156d0) {
            k0Var.setArrow(AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(26.0f), this.f9160f0));
        } else if (this.f9152b > 0.5f) {
            k0Var.setArrow(AndroidUtilities.dp(24.0f));
        } else {
            k0Var.setArrow(-1);
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
        boolean z10 = this.f9156d0;
        c3 c3Var = this.f9181x;
        k3 k3Var = this.f9157e;
        h3 h3Var = this.f9166l0;
        int i16 = 0;
        if (z10) {
            if (h3Var != null && h3Var.getTotalHeight() > 0) {
                i14 = rect.bottom;
            } else {
                i14 = 0;
            }
            int i17 = rect.left;
            int i18 = rect.top;
            int i19 = rect.right;
            if (this.f9167n > i14 || (h3Var != null && h3Var.getTotalHeight() > 0)) {
                i15 = 0;
            } else {
                i15 = rect.bottom;
            }
            Rect rect2 = new Rect(i17, i18, i19, i15);
            int dp = AndroidUtilities.dp(46.0f);
            c3Var.Q(rect2, false);
            c3Var.P(dp, false);
            k3Var.setPadding(0, 0, 0, Math.max(this.f9167n, i14));
        } else {
            c3Var.Q(new Rect(0, 0, 0, 0), false);
            c3Var.P(0, false);
            int i20 = rect.left;
            int i21 = rect.right;
            int i22 = this.f9167n;
            org.telegram.ui.ActionBar.n3 n3Var = this.f9172r;
            if (n3Var != null) {
                i10 = n3Var.H;
            } else {
                i10 = 0;
            }
            k3Var.setPadding(i20, 0, i21, Math.max(i22, i10 + rect.bottom));
        }
        this.f9179w.topMargin = AndroidUtilities.dp(24.0f);
        boolean z11 = this.f9156d0;
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
        FrameLayout.LayoutParams layoutParams2 = this.f9171q0;
        layoutParams2.leftMargin = i12;
        if (!z11) {
            i13 = 0;
        } else {
            i13 = rect.right;
        }
        layoutParams2.rightMargin = i13;
        boolean z12 = this.f9162h0;
        b3 b3Var = this.v;
        if (!z12) {
            b3Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f9156d0) {
                b3Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                b3Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f));
            }
            b3Var.setSwipeOffsetAnimationDisallowed(false);
            b3Var.c();
            b3Var.invalidate();
            b3Var.requestLayout();
        }
        if (b3Var != null) {
            b3Var.setFullSize(m());
        }
        h3Var.requestLayout();
        k3Var.requestLayout();
        if (!this.f9156d0) {
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
            z10 = (AndroidUtilities.isTablet() || i0.a.f(i6.w0(null, i6.f20822d6, true)) < 0.7210000157356262d || this.f9152b < 0.85f) ? false : false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            this.d = Boolean.valueOf(z10);
            if (Build.VERSION.SDK_INT >= 23) {
                k3 k3Var = this.f9157e;
                int systemUiVisibility = k3Var.getSystemUiVisibility();
                if (z10) {
                    i10 = systemUiVisibility | 8192;
                } else {
                    i10 = systemUiVisibility & (-8193);
                }
                k3Var.setSystemUiVisibility(i10);
            }
        }
    }

    public final void F() {
        org.telegram.ui.web.z0 webView;
        c3 c3Var = this.f9181x;
        if (c3Var == null || (webView = c3Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.P.getColor());
    }

    public final void G() {
        int i10;
        h3 h3Var;
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
            boolean z10 = this.f9156d0;
            if (z10) {
                attributes.flags = i10 | attributes.flags;
            } else {
                attributes.flags = (~i10) & attributes.flags;
            }
            k3 k3Var = this.f9157e;
            if (z10 && (((h3Var = this.f9166l0) == null || h3Var.getTotalHeight() <= 0) && !k3Var.f9131x0)) {
                k3Var.setSystemUiVisibility(k3Var.getSystemUiVisibility() | 2);
            } else {
                k3Var.setSystemUiVisibility(k3Var.getSystemUiVisibility() & (-3));
            }
            window.setAttributes(attributes);
        } catch (Exception e7) {
            FileLog.e(e7);
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
        m3Var.f21387q = this.Q;
        m3Var.f21386p = this.f9177u0;
        m3Var.f21384n = this.U;
        m3Var.f21385o = this.V;
        m3Var.f21388r = this.P.getColor();
        m3Var.f21373a = this.f9178v0;
        boolean z13 = false;
        c3 c3Var = this.f9181x;
        if (c3Var != null && c3Var.N) {
            z10 = true;
        } else {
            z10 = false;
        }
        m3Var.f21390t = z10;
        m3Var.D = i6.I.q();
        org.telegram.ui.web.z0 z0Var = null;
        if (c3Var != null) {
            str = c3Var.getUrlLoaded();
        } else {
            str = null;
        }
        m3Var.f21393x = str;
        if (c3Var != null && c3Var.f42152t0) {
            z11 = true;
        } else {
            z11 = false;
        }
        m3Var.f21376e = z11;
        if (c3Var != null) {
            str2 = c3Var.getTrustedOrigin();
        } else {
            str2 = null;
        }
        m3Var.f21377f = str2;
        b3 b3Var = this.v;
        if ((b3Var == null || b3Var.getSwipeOffsetY() >= 0.0f) && !this.f9182x0 && !m() && !this.f9156d0) {
            z12 = false;
        } else {
            z12 = true;
        }
        m3Var.f21380j = z12;
        m3Var.f21395z = this.f9156d0;
        m3Var.A = this.f9158e0;
        Boolean bool = this.f9185z0;
        if (bool == null) {
            booleanValue = this.f9184y0;
        } else {
            booleanValue = bool.booleanValue();
        }
        m3Var.B = booleanValue;
        if (b3Var != null) {
            f7 = b3Var.getOffsetY();
        } else {
            f7 = Float.MAX_VALUE;
        }
        m3Var.f21381k = f7;
        m3Var.C = this.A0;
        m3Var.f21391u = this.f9180w0;
        m3Var.f21394y = this.f9173r0;
        m3Var.v = this.f9153b0;
        m3Var.f21382l = (b3Var == null || b3Var.M) ? true : true;
        m3Var.f21392w = this.f9166l0.f9470e;
        m3Var.f21389s = this.R;
        b1 b1Var = this.B0;
        if (b1Var != null) {
            b1Var.b();
        }
        m3Var.K = this.B0;
        if (c3Var != null) {
            z0Var = c3Var.getWebView();
        }
        if (z0Var != null) {
            c3Var.M();
            m3Var.f21374b = z0Var;
            m3Var.d = c3Var.getBotProxy();
            m3Var.f21378g = z0Var.getWidth();
            m3Var.h = z0Var.getHeight();
            z0Var.onPause();
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
            this.f9157e.invalidate();
            this.f9181x.f42143n.b(i6.v0(i6.f20822d6, this.E), 153);
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
            boolean q6 = i6.I.q();
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
    public final org.telegram.ui.ActionBar.u3 mo37getWindowView() {
        return this.f9157e;
    }

    public final void h() {
        LaunchActivity launchActivity;
        if (!this.M0 && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.I(true, true, true);
        }
        k3 k3Var = this.f9157e;
        if (k3Var != null) {
            k3Var.invalidate();
        }
    }

    public final void i() {
        if (this.U0 == null) {
            org.telegram.ui.d3 d3Var = new org.telegram.ui.d3(getContext());
            this.U0 = d3Var;
            this.v.addView(d3Var, z5.c(-1.0f, -1));
            this.U0.setTranslationY(-1.0f);
            this.U0.h.setOnClickListener(new o2(this, 0));
            this.U0.setBackgroundColor(this.P.getColor());
            AndroidUtilities.updateViewVisibilityAnimated(this.U0, this.S0, 1.0f, false);
        }
    }

    public final void k(boolean z10) {
        int i10;
        LaunchActivity launchActivity;
        if (this.f9155c0) {
            return;
        }
        int i11 = 0;
        if (this.H0 != null) {
            z10 = false;
        }
        this.f9155c0 = true;
        z(false);
        AndroidUtilities.cancelRunOnUIThread(this.f9176t0);
        NotificationCenter.getInstance(this.G).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getInstance(this.G).removeObserver(this, NotificationCenter.botDownloadsUpdate);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        if (z10 && ((launchActivity = LaunchActivity.G1) == null || launchActivity.f33820y0 == null)) {
            z10 = false;
        }
        if (z10) {
            o1.k kVar = this.f9154c;
            if (kVar != null) {
                kVar.f16988u.f16995i = 0.0f;
                kVar.f();
            }
            LaunchActivity.G1.f33820y0.b(this);
        } else {
            h3 h3Var = this.f9166l0;
            if (h3Var != null) {
                h3Var.animate().translationY(h3Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(tr.h).start();
            }
            this.f9181x.i();
            b3 b3Var = this.v;
            int height = b3Var.getHeight();
            if (h3Var != null) {
                i10 = h3Var.getTotalHeight();
            } else {
                i10 = 0;
            }
            int i12 = height + i10;
            Rect rect = this.h;
            int R = this.f9157e.R() + i12 + rect.top + rect.bottom;
            if (m()) {
                i11 = AndroidUtilities.dp(200.0f);
            }
            b3Var.f(R + i11, true, new f2(this, 0));
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
        if (!this.f9156d0) {
            Boolean bool = this.f9185z0;
            if (bool == null) {
                if (!this.f9184y0) {
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
        if (this.f9178v0 != null) {
            long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.f9178v0.f9052r));
            String str = null;
            this.f9185z0 = null;
            TLObject tLObject = this.f9178v0.f9051q;
            if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                this.J = tL_webViewResultUrl.query_id;
                str = tL_webViewResultUrl.url;
                z10 = tL_webViewResultUrl.same_origin;
                this.f9185z0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
                boolean z11 = this.E0;
                if (!z11) {
                    x(tL_webViewResultUrl.fullscreen, !z11, this.f9158e0);
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
                MediaDataController.getInstance(this.G).increaseWebappRating(this.f9178v0.f9039c);
                this.f9181x.u(this.G, str, z10);
            }
            AndroidUtilities.runOnUIThread(this.f9176t0, max);
            b3 b3Var = this.v;
            if (b3Var != null) {
                b3Var.setFullSize(m());
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
        if (this.f9154c == null) {
            o1.k kVar = new o1.k(this, X0);
            o1.l lVar = new o1.l();
            lVar.b(1200.0f);
            lVar.a(1.0f);
            kVar.f16988u = lVar;
            this.f9154c = kVar;
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f9175s0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else if (this.f9181x.D()) {
        } else {
            k(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        h3 h3Var;
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
        if (this.f9156d0) {
            attributes.flags = i12 | 512;
        } else {
            attributes.flags = i11 & (-515);
        }
        window.setAttributes(attributes);
        if (i10 >= 23) {
            window.setStatusBarColor(0);
        }
        k3 k3Var = this.f9157e;
        k3Var.setFitsSystemWindows(true);
        k3Var.setSystemUiVisibility(1792);
        k3Var.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return l3.e(l3.this, view, windowInsets);
            }
        });
        if (this.f9156d0 && ((h3Var = this.f9166l0) == null || h3Var.getTotalHeight() <= 0)) {
            k3Var.setSystemUiVisibility(k3Var.getSystemUiVisibility() | 2);
        } else {
            k3Var.setSystemUiVisibility(k3Var.getSystemUiVisibility() & (-3));
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
        o1.k kVar = this.f9154c;
        if (kVar != null) {
            kVar.c();
            this.f9154c = null;
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
            ((LaunchActivity) context).B0.add(this.f9175s0);
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
            ((LaunchActivity) context).B0.remove(this.f9175s0);
        }
    }

    public final boolean q() {
        String str;
        if (this.f9173r0) {
            TLRPC.User user = MessagesController.getInstance(this.G).getUser(Long.valueOf(this.H));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            alertDialog$Builder.f20372a.R = str;
            alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new g2(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
            b2Var.show();
            ((TextView) b2Var.d(-1)).setTextColor(i6.v0(i6.f21063q7, this.E));
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
        b80 b80Var = this.K0;
        if (b80Var != null) {
            b80Var.u();
        }
        if (this.f9156d0) {
            view = this.m0;
        } else {
            view = this.Z;
        }
        b80 G = b80.G(this.f9157e, this.E, view, true);
        this.K0 = G;
        ArrayList arrayList3 = m0.c(getContext(), this.G, this.H).f9196e;
        HashMap hashMap = this.J0;
        hashMap.clear();
        if (!arrayList3.isEmpty()) {
            b80 J = G.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new hu0(G, 25), false);
            J.k();
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj = arrayList3.get(i13);
                i13++;
                l0 l0Var = (l0) obj;
                String str = l0Var.f9139c;
                ai.f fVar = new ai.f(10);
                d6 d6Var = J.d;
                if (J.f24824e == null) {
                    arrayList = arrayList3;
                } else {
                    org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, J.f24824e, J.d, false, false);
                    arrayList = arrayList3;
                    f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    f1Var.setText(str);
                    f1Var.setSubtext("");
                    Integer num = J.f24834j0;
                    if (num != null) {
                        v02 = num.intValue();
                    } else {
                        v02 = i6.v0(i6.E8, d6Var);
                    }
                    Integer num2 = J.f24836k0;
                    if (num2 != null) {
                        v03 = num2.intValue();
                    } else {
                        v03 = i6.v0(i6.F8, d6Var);
                    }
                    f1Var.c(v02, v03);
                    Integer num3 = J.f24838l0;
                    if (num3 != null) {
                        l1 = num3.intValue();
                    } else {
                        l1 = i6.l1(0.12f, i6.v0(i6.E8, d6Var));
                    }
                    f1Var.setSelectorColor(l1);
                    f1Var.setOnClickListener(new org.telegram.ui.Components.f0(J, fVar));
                    int i14 = J.S;
                    if (i14 > 0) {
                        f1Var.setMinimumWidth(AndroidUtilities.dp(i14));
                        J.r(f1Var, z5.n(J.S, -2));
                    } else {
                        J.r(f1Var, z5.n(-1, -2));
                        hashMap.put(l0Var, J.y());
                        arrayList3 = arrayList;
                    }
                }
                hashMap.put(l0Var, J.y());
                arrayList3 = arrayList;
            }
            B();
            J.S = AndroidUtilities.dp(180.0f);
            G.c(R.drawable.menu_download_round, LocaleController.getString(R.string.BotDownloads), new n2(G, J, 0), false);
            G.k();
        }
        if (this.H0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        G.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new f2(this, 9), z10);
        if (this.H0 == null && this.f9153b0) {
            z11 = true;
        } else {
            z11 = false;
        }
        G.l(R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings), new f2(this, 10), z11);
        G.c(R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage), new f2(this, 11), false);
        if (this.H0 == null && user != null && user.bot_has_main_app) {
            z12 = true;
        } else {
            z12 = false;
        }
        G.l(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new f2(this, 12), z12);
        if (this.H0 == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        G.l(R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS), new f2(this, 13), z13);
        if (this.H0 == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        G.l(R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot), new f2(this, 14), z14);
        if (this.H0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu)) {
            z15 = true;
        } else {
            z15 = false;
        }
        G.l(R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot), new f2(this, 15), z15);
        if (this.Q != i6.w0(null, i6.f20822d6, false)) {
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
            int l12 = i6.l1(0.85f, i11);
            int l13 = i6.l1(0.1f, i11);
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
        G.f24850t = false;
        G.f24849s = 0;
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
        this.f9178v0 = f5Var;
        int i10 = f5Var.f9037a;
        this.G = i10;
        this.I = f5Var.f9038b;
        this.H = f5Var.f9039c;
        this.K = f5Var.h;
        this.L = f5Var.f9043i;
        this.M = f5Var.f9040e;
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(this.H));
        CharSequence userName = UserObject.getUserName(user2);
        boolean z13 = false;
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        i3 i3Var = this.W;
        i3Var.setTitle(userName);
        TLRPC.UserFull userFull = MessagesController.getInstance(this.G).getUserFull(this.H);
        d6 d6Var = this.E;
        if ((user2 != null && user2.verified) || (userFull != null && (user = userFull.user) != null && user.verified)) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            this.I0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.Oh, d6Var), PorterDuff.Mode.SRC_IN));
            this.I0.setAlpha(255);
            i3Var.getTitleTextView().setDrawablePadding(AndroidUtilities.dp(2.0f));
            i3Var.getTitleTextView().i(new ci.d4(this, 1));
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
        org.telegram.ui.ActionBar.z n10 = i3Var.n();
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
                MessagesController.getInstance(this.G).loadFullUser(user2, 0, true, new i2(this, 1));
            }
            if (f5Var.f9050p) {
                x(z11, false, this.f9158e0);
            }
        }
        if (this.H0 == null) {
            zVar2 = zVar;
            zVar2.a(R.id.menu_collapse_bot, R.drawable.arrow_more);
        } else {
            zVar2 = zVar;
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = new BotFullscreenButtons.OptionsIcon(getContext());
        this.f9151a0 = optionsIcon;
        org.telegram.ui.ActionBar.v0 d = zVar2.d(0, optionsIcon);
        this.Z = d;
        d.setOnClickListener(new o2(this, 1));
        i3Var.setActionBarMenuOnItemClick(new t2(this));
        JSONObject p5 = p(d6Var, false);
        TLRPC.User user3 = MessagesController.getInstance(this.G).getUser(Long.valueOf(this.H));
        c3 c3Var = this.f9181x;
        c3Var.setBotUser(user3);
        c3Var.t(this.G, this.H);
        TLRPC.User user4 = f5Var.f9047m;
        if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu && !MediaDataController.getInstance(this.G).isShortcutAdded(this.H, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
            if (user4 == null) {
                user4 = MessagesController.getInstance(this.G).getUser(Long.valueOf(this.H));
            }
            if (user4 != null && user4.photo != null && !FileLoader.getInstance(this.G).getPathToAttach(user4.photo.photo_small, true).exists()) {
                MediaDataController.getInstance(this.G).preloadImage(ImageLocation.getForUser(this.G, user4, 1), 0);
            }
        }
        if (f5Var.f9051q != null) {
            n();
            return;
        }
        int i12 = f5Var.f9042g;
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
                                ConnectionsManager.getInstance(this.G).sendRequestTyped(tL_messages_requestChatJoinWebView, new Object(), new bi.v(this, 16), 66);
                                return;
                            }
                            return;
                        }
                        TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                        tL_messages_requestMainWebView.bot = MessagesController.getInstance(this.G).getInputUser(f5Var.f9039c);
                        tL_messages_requestMainWebView.platform = "android";
                        if (n2Var instanceof yn) {
                            yn ynVar = (yn) n2Var;
                            if (ynVar.i() != null) {
                                inputPeer2 = MessagesController.getInputPeer(ynVar.i());
                            } else {
                                inputPeer2 = MessagesController.getInputPeer(ynVar.f43322e);
                            }
                        } else {
                            inputPeer2 = MessagesController.getInstance(this.G).getInputPeer(f5Var.f9038b);
                        }
                        tL_messages_requestMainWebView.peer = inputPeer2;
                        tL_messages_requestMainWebView.compact = f5Var.f9049o;
                        tL_messages_requestMainWebView.fullscreen = f5Var.f9050p;
                        if (!TextUtils.isEmpty(f5Var.f9046l)) {
                            tL_messages_requestMainWebView.start_param = f5Var.f9046l;
                            tL_messages_requestMainWebView.flags |= 2;
                        }
                        if (p5 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                            tL_messages_requestMainWebView.theme_params = tL_dataJSON2;
                            tL_dataJSON2.data = p5.toString();
                            tL_messages_requestMainWebView.flags |= 1;
                        }
                        ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestMainWebView, new q2(this, 5), 66);
                        return;
                    }
                    TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                    TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                    TLRPC.BotApp botApp = f5Var.f9044j;
                    tL_inputBotAppID.f20100id = botApp.f20039id;
                    tL_inputBotAppID.access_hash = botApp.access_hash;
                    tL_messages_requestAppWebView.app = tL_inputBotAppID;
                    tL_messages_requestAppWebView.write_allowed = f5Var.f9045k;
                    tL_messages_requestAppWebView.platform = "android";
                    if (n2Var instanceof yn) {
                        yn ynVar2 = (yn) n2Var;
                        if (ynVar2.i() != null) {
                            inputPeer = MessagesController.getInputPeer(ynVar2.i());
                        } else {
                            inputPeer = MessagesController.getInputPeer(ynVar2.f43322e);
                        }
                    } else {
                        inputPeer = MessagesController.getInputPeer(f5Var.f9047m);
                    }
                    tL_messages_requestAppWebView.peer = inputPeer;
                    tL_messages_requestAppWebView.compact = f5Var.f9049o;
                    tL_messages_requestAppWebView.fullscreen = f5Var.f9050p;
                    if (!TextUtils.isEmpty(f5Var.f9046l)) {
                        tL_messages_requestAppWebView.start_param = f5Var.f9046l;
                        tL_messages_requestAppWebView.flags |= 2;
                    }
                    if (p5 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                        tL_messages_requestAppWebView.theme_params = tL_dataJSON3;
                        tL_dataJSON3.data = p5.toString();
                        tL_messages_requestAppWebView.flags |= 4;
                    }
                    ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestAppWebView, new q2(this, 4), 66);
                    return;
                }
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.bot = MessagesController.getInstance(this.G).getInputUser(this.H);
                tL_messages_requestWebView.peer = MessagesController.getInstance(this.G).getInputPeer(this.H);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = f5Var.f9049o;
                tL_messages_requestWebView.fullscreen = f5Var.f9050p;
                tL_messages_requestWebView.url = f5Var.f9041f;
                tL_messages_requestWebView.flags |= 2;
                if (p5 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON4;
                    tL_dataJSON4.data = p5.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestWebView, new q2(this, 1));
                NotificationCenter.getInstance(this.G).addObserver(this, NotificationCenter.webViewResultSent);
                return;
            }
            TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
            if ((f5Var.f9048n & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_messages_requestSimpleWebView.from_switch_webview = z10;
            tL_messages_requestSimpleWebView.bot = MessagesController.getInstance(this.G).getInputUser(this.H);
            tL_messages_requestSimpleWebView.platform = "android";
            if ((f5Var.f9048n & 2) != 0) {
                z13 = true;
            }
            tL_messages_requestSimpleWebView.from_side_menu = z13;
            tL_messages_requestSimpleWebView.compact = f5Var.f9049o;
            tL_messages_requestSimpleWebView.fullscreen = f5Var.f9050p;
            if (p5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                tL_messages_requestSimpleWebView.theme_params = tL_dataJSON5;
                tL_dataJSON5.data = p5.toString();
                tL_messages_requestSimpleWebView.flags |= 1;
            }
            if (!TextUtils.isEmpty(f5Var.f9041f)) {
                tL_messages_requestSimpleWebView.flags |= 8;
                tL_messages_requestSimpleWebView.url = f5Var.f9041f;
            }
            if (!TextUtils.isEmpty(f5Var.f9046l)) {
                tL_messages_requestSimpleWebView.start_param = f5Var.f9046l;
                tL_messages_requestSimpleWebView.flags |= 16;
            }
            ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestSimpleWebView, new q2(this, 2));
            return;
        }
        TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
        tL_messages_requestWebView2.peer = MessagesController.getInstance(this.G).getInputPeer(this.I);
        tL_messages_requestWebView2.bot = MessagesController.getInstance(this.G).getInputUser(this.H);
        tL_messages_requestWebView2.platform = "android";
        tL_messages_requestWebView2.compact = f5Var.f9049o;
        tL_messages_requestWebView2.fullscreen = f5Var.f9050p;
        String str = f5Var.f9041f;
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
        ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestWebView2, new q2(this, 3));
        NotificationCenter.getInstance(this.G).addObserver(this, NotificationCenter.webViewResultSent);
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        z(true);
        k3 k3Var = this.f9157e;
        k3Var.setAlpha(0.0f);
        k3Var.addOnLayoutChangeListener(new v2(this, 0));
        super.show();
        this.M0 = false;
        W0.add(this);
    }

    public final void t(final int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        final int i12 = this.Q;
        i6.b(0.35f, -0.1f, i10);
        final d2 d2Var = new d2();
        int i13 = 0;
        if (this.U) {
            i11 = this.Q;
        } else {
            i11 = 0;
        }
        SparseIntArray sparseIntArray = d2Var.f8997a;
        d6 d6Var = this.E;
        d2Var.c(sparseIntArray, i11, d6Var);
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
        d2Var.c(d2Var.f8998b, i13, d6Var);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(tr.f31147f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int d = i0.a.d(floatValue, i12, i10);
                    l3 l3Var = l3.this;
                    l3Var.Q = d;
                    l3Var.h();
                    k3 k3Var = l3Var.f9157e;
                    k3Var.invalidate();
                    i3 i3Var = l3Var.W;
                    i3Var.setBackgroundColor(l3Var.Q);
                    d2 d2Var2 = d2Var;
                    d2Var2.b(i3Var, floatValue);
                    l3Var.f9150a = d2Var2.a(i6.Ii);
                    k3Var.invalidate();
                }
            });
            duration.addListener(new a3(this, i12, i10, d2Var));
            duration.start();
        } else {
            this.Q = i10;
            h();
            k3 k3Var = this.f9157e;
            k3Var.invalidate();
            int i14 = this.Q;
            i3 i3Var = this.W;
            i3Var.setBackgroundColor(i14);
            d2Var.b(i3Var, 1.0f);
            this.f9150a = d2Var.a(i6.Ii);
            k3Var.invalidate();
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
            duration.setInterpolator(tr.f31147f);
            this.P0.addUpdateListener(new m2(this, color, i10, 0));
            this.P0.addListener(new w2(this, i10, 0));
            this.P0.start();
            return;
        }
        paint.setColor(i10);
        A();
        this.f9157e.invalidate();
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
        if (this.f9184y0 != z10) {
            this.f9184y0 = z10;
            b3 b3Var = this.v;
            if (b3Var != null) {
                b3Var.setFullSize(m());
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
        if (this.f9156d0 == z10) {
            return;
        }
        this.f9156d0 = z10;
        int i10 = 0;
        if (z12 && !MessagesController.getInstance(this.G).disableBotFullscreenBlur && SharedConfig.getDevicePerformanceClass() >= 2) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f9158e0 = z13;
        ValueAnimator valueAnimator = this.R0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        BotFullscreenButtons botFullscreenButtons = this.m0;
        b3 b3Var = this.v;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setPreview(z10, z11);
            if (this.f9158e0) {
                obj = b3Var.getRenderNode();
            } else {
                obj = null;
            }
            botFullscreenButtons.setParentRenderNode(obj);
        }
        this.f9163i0 = b3Var.getWidth();
        this.f9164j0 = b3Var.getHeight();
        this.Q0 = false;
        h3 h3Var = this.f9166l0;
        c3 c3Var = this.f9181x;
        i3 i3Var = this.W;
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
                f12 = b3Var.getTranslationY();
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
            o1.k kVar = b3Var.v;
            if (kVar != null) {
                kVar.c();
            }
            o1.k kVar2 = b3Var.G;
            if (kVar2 != null) {
                kVar2.c();
            }
            b3Var.setSwipeOffsetAnimationDisallowed(true);
            i3Var.setVisibility(0);
            if (z10) {
                b3Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                b3Var.setTopActionBarOffsetY(currentActionBarHeight2 - AndroidUtilities.dp(24.0f));
            }
            b3Var.c();
            b3Var.invalidate();
            this.f9161g0 = 0.0f;
            if (z10) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            this.f9160f0 = f13;
            i3Var.setAlpha(1.0f - f13);
            i3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f9160f0);
            b3Var.setTranslationY(AndroidUtilities.lerp(f12, f14, this.f9161g0));
            b3Var.setTranslationX(AndroidUtilities.lerp(f11, 0.0f, this.f9161g0));
            h3Var.setTranslationX(AndroidUtilities.lerp(f10, 0.0f, this.f9161g0));
            botFullscreenButtons.setAlpha(this.f9160f0);
            this.f9157e.invalidate();
            c3Var.setViewPortHeightOffset(b3Var.getTranslationY() - f14);
            c3Var.o(false, false);
            this.f9162h0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.R0 = ofFloat;
            float f15 = f11;
            ofFloat.addUpdateListener(new x2(this, z10, f12, f14, f15, f10));
            this.R0.addListener(new y2(this, z10, currentActionBarHeight2, f15));
            this.R0.setDuration(280L);
            this.R0.setInterpolator(tr.h);
            this.R0.start();
            return;
        }
        this.f9162h0 = false;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f9160f0 = f7;
        this.f9161g0 = 0.0f;
        D();
        G();
        if (z10) {
            i10 = 8;
        }
        i3Var.setVisibility(i10);
        i3Var.setAlpha(1.0f - this.f9160f0);
        i3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f9160f0);
        h3Var.setTranslationX(0.0f);
        botFullscreenButtons.setAlpha(this.f9160f0);
        c3Var.setViewPortHeightOffset(0.0f);
        c3Var.o(true, true);
        C();
    }

    public final void y(int i10, boolean z10) {
        int i11 = this.R;
        h3 h3Var = this.f9166l0;
        Paint paint = h3Var.f9467a;
        h3Var.f9470e.f299b = i10;
        paint.setColor(i10);
        if (!z10) {
            h3Var.d.a(i10, true);
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(tr.f31147f);
            duration.addUpdateListener(new m2(this, i11, i10, 1));
            duration.addListener(new z2(this, i11, i10, 0));
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
        ofFloat.addListener(new ai.n(14, this, z10));
        this.O0.addUpdateListener(new e2(this, 0));
        this.O0.setInterpolator(tr.h);
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
