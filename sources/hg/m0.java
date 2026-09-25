package hg;

import ai.s5;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.rc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import w7.y5;
public final class m0 extends bb {
    public static final int f10335g0 = -1;
    public static final int f10336h0 = -2;
    public final TL_account.TL_connectedBot X;
    public final TLRPC.User Y;
    public final c0 Z;
    public final LinearLayout f10337a0;
    public final ci.d f10338b0;
    public final ci.d f10339c0;
    public j61 f10340d0;
    public boolean f10341e0;
    public Boolean f10342f0;

    public m0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, ld ldVar, d6 d6Var) {
        super(2, (Context) activity, d6Var, false);
        this.X = tL_connectedBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
        this.Y = user;
        this.K = AndroidUtilities.dp(36.0f);
        this.v = 0.15f;
        c0 c0Var = new c0(activity, this.currentAccount, new rc(this, 20), d6Var);
        this.Z = c0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.f10341e0 = tL_businessBotRecipients.exclude_selected;
        c0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f10337a0 = linearLayout;
        linearLayout.setOrientation(1);
        h9 h9Var = new h9((d6) null);
        w9 w9Var = new w9(activity);
        w9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        h9Var.r(user);
        w9Var.e(user, h9Var);
        linearLayout.addView(w9Var, y5.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(getThemedColor(h6.G6));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(UserObject.getUserName(user));
        linearLayout.addView(textView, y5.r(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.e.setTitle(UserObject.getUserName(user));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(h6.f19443y6));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.SessionBot));
        linearLayout.addView(textView2, y5.r(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String publicUsername = UserObject.getPublicUsername(user);
        if (!TextUtils.isEmpty(publicUsername)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(getThemedColor(h6.gc));
            textView3.setText("@" + publicUsername);
            textView3.setGravity(17);
            linearLayout.addView(textView3, y5.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i10 = h6.f19004a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        wl0 wl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        wl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(72.0f));
        this.d.p1();
        this.d.setOnItemClickListener(new ai.g(this, 11));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{h6.l1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        ci.d dVar = new ci.d(activity, d6Var, true);
        dVar.setRoundRadius(24);
        this.f10338b0 = dVar;
        dVar.setColor(getThemedColor(h6.wj));
        dVar.setText(LocaleController.getString(R.string.TerminateSession));
        dVar.setOnClickListener(new ai.d0(this, tL_connectedBot, ldVar, 8));
        frameLayout.addView(dVar, y5.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        ci.d dVar2 = new ci.d(activity, d6Var, true);
        dVar2.setRoundRadius(24);
        this.f10339c0 = dVar2;
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
        jVar.f42996m = false;
        jVar.C = false;
        jVar.o(rr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        j61 j61Var = this.f10340d0;
        if (j61Var != null) {
            j61Var.N(false);
        }
    }

    public static void P(m0 m0Var, TL_account.TL_connectedBot tL_connectedBot, TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        g.a(m0Var.currentAccount).b();
        m0Var.dismiss();
        tL_connectedBot.recipients = tL_businessBotRecipients;
        m2 U = LaunchActivity.U();
        if (U != null) {
            c.q(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(m0Var.Y)}, xc.a0(U), R.raw.contact_check, 36);
        }
    }

    public static void Q(m0 m0Var, TL_account.TL_connectedBot tL_connectedBot) {
        c0 c0Var = m0Var.Z;
        ci.d dVar = m0Var.f10339c0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.bot = MessagesController.getInstance(m0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = c0Var.b();
        ConnectionsManager.getInstance(m0Var.currentAccount).sendRequest(updateconnectedbot, new s5(m0Var, tL_connectedBot, c0Var.c(), 5));
    }

    public static void R(m0 m0Var, ld ldVar) {
        g.a(m0Var.currentAccount).b();
        ldVar.run();
        m0Var.dismiss();
    }

    public static void S(m0 m0Var, TL_account.TL_connectedBot tL_connectedBot, ld ldVar) {
        ci.d dVar = m0Var.f10338b0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.deleted = true;
        updateconnectedbot.bot = MessagesController.getInstance(m0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
        ConnectionsManager.getInstance(m0Var.currentAccount).sendRequest(updateconnectedbot, new ai.v1(14, m0Var, ldVar));
    }

    @Override
    public final void A(float f7) {
        h5 titleTextView = this.e.getTitleTextView();
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
        c0 c0Var = this.Z;
        if (c0Var != null && c0Var.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f10342f0;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        this.f10342f0 = Boolean.valueOf(z11);
        float f17 = 0.0f;
        ci.d dVar = this.f10338b0;
        ci.d dVar2 = this.f10339c0;
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
        rr rrVar = rr.h;
        duration.setInterpolator(rrVar).withEndAction(new Runnable(this) {
            public final m0 f10328b;

            {
                this.f10328b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        m0 m0Var = this.f10328b;
                        if (!z12) {
                            m0Var.f10339c0.setVisibility(8);
                            return;
                        } else {
                            m0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        m0 m0Var2 = this.f10328b;
                        if (z13) {
                            m0Var2.f10338b0.setVisibility(8);
                            return;
                        } else {
                            m0Var2.getClass();
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
        scaleX2.scaleY(f18).setDuration(320L).setInterpolator(rrVar).withEndAction(new Runnable(this) {
            public final m0 f10328b;

            {
                this.f10328b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        m0 m0Var = this.f10328b;
                        if (!z12) {
                            m0Var.f10339c0.setVisibility(8);
                            return;
                        } else {
                            m0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        m0 m0Var2 = this.f10328b;
                        if (z13) {
                            m0Var2.f10338b0.setVisibility(8);
                            return;
                        } else {
                            m0Var2.getClass();
                            return;
                        }
                }
            }
        }).start();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        c0 c0Var = this.Z;
        if (c0Var != null) {
            c0Var.g();
        }
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        c0 c0Var = this.Z;
        if (c0Var != null && c0Var.g()) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override
    public final vl0 v(wl0 wl0Var) {
        j61 j61Var = new j61(wl0Var, getContext(), this.currentAccount, 0, true, new bi.v(this, 23), this.resourcesProvider);
        this.f10340d0 = j61Var;
        j61Var.f25291r = false;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
