package hg;

import ai.t5;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.uc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.kd;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.LaunchActivity;
import w7.y5;
public final class l0 extends ab {
    public static final int f10345g0 = -1;
    public static final int f10346h0 = -2;
    public final TL_account.TL_connectedBot X;
    public final TLRPC.User Y;
    public final a0 Z;
    public final LinearLayout f10347a0;
    public final ci.d f10348b0;
    public final ci.d f10349c0;
    public m61 f10350d0;
    public boolean f10351e0;
    public Boolean f10352f0;

    public l0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, kd kdVar, f6 f6Var) {
        super(2, (Context) activity, f6Var, false);
        this.X = tL_connectedBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
        this.Y = user;
        this.K = AndroidUtilities.dp(36.0f);
        this.v = 0.15f;
        a0 a0Var = new a0(activity, this.currentAccount, new uc(this, 20), f6Var);
        this.Z = a0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.f10351e0 = tL_businessBotRecipients.exclude_selected;
        a0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f10347a0 = linearLayout;
        linearLayout.setOrientation(1);
        g9 g9Var = new g9((f6) null);
        v9 v9Var = new v9(activity);
        v9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        g9Var.r(user);
        v9Var.e(user, g9Var);
        linearLayout.addView(v9Var, y5.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(getThemedColor(j6.G6));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(UserObject.getUserName(user));
        linearLayout.addView(textView, y5.r(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.e.setTitle(UserObject.getUserName(user));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(j6.f19492y6));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.SessionBot));
        linearLayout.addView(textView2, y5.r(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String publicUsername = UserObject.getPublicUsername(user);
        if (!TextUtils.isEmpty(publicUsername)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(getThemedColor(j6.gc));
            textView3.setText("@" + publicUsername);
            textView3.setGravity(17);
            linearLayout.addView(textView3, y5.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i10 = j6.f19053a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        yl0 yl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        yl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(72.0f));
        this.d.q1();
        this.d.setOnItemClickListener(new ai.g(this, 11));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{j6.l1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        ci.d dVar = new ci.d(activity, f6Var, true);
        dVar.setRoundRadius(24);
        this.f10348b0 = dVar;
        dVar.setColor(getThemedColor(j6.wj));
        dVar.setText(LocaleController.getString(R.string.TerminateSession));
        dVar.setOnClickListener(new ai.d0(this, tL_connectedBot, kdVar, 8));
        frameLayout.addView(dVar, y5.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        ci.d dVar2 = new ci.d(activity, f6Var, true);
        dVar2.setRoundRadius(24);
        this.f10349c0 = dVar2;
        dVar2.setText(LocaleController.getString(R.string.BusinessBotUpdate));
        dVar2.setOnClickListener(new ai.f2(11, this, tL_connectedBot));
        frameLayout.addView(dVar2, y5.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        T(false);
        FrameLayout.LayoutParams e = y5.e(-1, -2, 80);
        int i12 = e.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        e.leftMargin = i12 + i13;
        e.rightMargin += i13;
        this.containerView.addView(frameLayout, e);
        s4.j jVar = new s4.j();
        jVar.f43030m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        m61 m61Var = this.f10350d0;
        if (m61Var != null) {
            m61Var.N(false);
        }
    }

    public static void P(l0 l0Var, TL_account.TL_connectedBot tL_connectedBot, TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        f.a(l0Var.currentAccount).b();
        l0Var.dismiss();
        tL_connectedBot.recipients = tL_businessBotRecipients;
        n2 U = LaunchActivity.U();
        if (U != null) {
            k0.q(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(l0Var.Y)}, xc.a0(U), R.raw.contact_check, 36);
        }
    }

    public static void Q(l0 l0Var, TL_account.TL_connectedBot tL_connectedBot) {
        a0 a0Var = l0Var.Z;
        ci.d dVar = l0Var.f10349c0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.bot = MessagesController.getInstance(l0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = a0Var.b();
        ConnectionsManager.getInstance(l0Var.currentAccount).sendRequest(updateconnectedbot, new t5(l0Var, tL_connectedBot, a0Var.c(), 5));
    }

    public static void R(l0 l0Var, kd kdVar) {
        f.a(l0Var.currentAccount).b();
        kdVar.run();
        l0Var.dismiss();
    }

    public static void S(l0 l0Var, TL_account.TL_connectedBot tL_connectedBot, kd kdVar) {
        ci.d dVar = l0Var.f10348b0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.deleted = true;
        updateconnectedbot.bot = MessagesController.getInstance(l0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
        ConnectionsManager.getInstance(l0Var.currentAccount).sendRequest(updateconnectedbot, new ai.v1(14, l0Var, kdVar));
    }

    @Override
    public final void A(float f7) {
        j5 titleTextView = this.e.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f7);
        }
    }

    public final void T(boolean z10) {
        final boolean z11;
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float f14;
        float f15;
        float f16;
        int i11 = 0;
        a0 a0Var = this.Z;
        if (a0Var != null && a0Var.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f10352f0;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        this.f10352f0 = Boolean.valueOf(z11);
        float f17 = 0.0f;
        ci.d dVar = this.f10348b0;
        ci.d dVar2 = this.f10349c0;
        float f18 = 0.8f;
        if (!z10) {
            if (z11) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            dVar2.setVisibility(i10);
            dVar2.animate().cancel();
            if (z11) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            dVar2.setAlpha(f13);
            if (z11) {
                f14 = 1.0f;
            } else {
                f14 = 0.8f;
            }
            dVar2.setScaleX(f14);
            if (z11) {
                f15 = 1.0f;
            } else {
                f15 = 0.8f;
            }
            dVar2.setScaleY(f15);
            if (z11) {
                i11 = 8;
            }
            dVar.setVisibility(i11);
            dVar.animate().cancel();
            if (!z11) {
                f17 = 1.0f;
            }
            dVar.setAlpha(f17);
            if (!z11) {
                f16 = 1.0f;
            } else {
                f16 = 0.8f;
            }
            dVar.setScaleX(f16);
            if (!z11) {
                f18 = 1.0f;
            }
            dVar.setScaleY(f18);
            return;
        }
        dVar2.setVisibility(0);
        ViewPropertyAnimator animate = dVar2.animate();
        if (z11) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f7);
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f10);
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ViewPropertyAnimator duration = scaleX.scaleY(f11).setDuration(320L);
        qr qrVar = qr.h;
        duration.setInterpolator(qrVar).withEndAction(new Runnable(this) {
            public final l0 f10327b;

            {
                this.f10327b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        l0 l0Var = this.f10327b;
                        if (!z12) {
                            l0Var.f10349c0.setVisibility(8);
                            return;
                        } else {
                            l0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        l0 l0Var2 = this.f10327b;
                        if (z13) {
                            l0Var2.f10348b0.setVisibility(8);
                            return;
                        } else {
                            l0Var2.getClass();
                            return;
                        }
                }
            }
        }).start();
        dVar.setVisibility(0);
        ViewPropertyAnimator animate2 = dVar.animate();
        if (!z11) {
            f17 = 1.0f;
        }
        ViewPropertyAnimator alpha2 = animate2.alpha(f17);
        if (!z11) {
            f12 = 1.0f;
        } else {
            f12 = 0.8f;
        }
        ViewPropertyAnimator scaleX2 = alpha2.scaleX(f12);
        if (!z11) {
            f18 = 1.0f;
        }
        scaleX2.scaleY(f18).setDuration(320L).setInterpolator(qrVar).withEndAction(new Runnable(this) {
            public final l0 f10327b;

            {
                this.f10327b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        l0 l0Var = this.f10327b;
                        if (!z12) {
                            l0Var.f10349c0.setVisibility(8);
                            return;
                        } else {
                            l0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        l0 l0Var2 = this.f10327b;
                        if (z13) {
                            l0Var2.f10348b0.setVisibility(8);
                            return;
                        } else {
                            l0Var2.getClass();
                            return;
                        }
                }
            }
        }).start();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        a0 a0Var = this.Z;
        if (a0Var != null) {
            a0Var.g();
        }
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        a0 a0Var = this.Z;
        if (a0Var != null && a0Var.g()) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override
    public final xl0 v(yl0 yl0Var) {
        m61 m61Var = new m61(yl0Var, getContext(), this.currentAccount, 0, true, new bi.v(this, 23), this.resourcesProvider);
        this.f10350d0 = m61Var;
        m61Var.f26342r = false;
        return m61Var;
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
