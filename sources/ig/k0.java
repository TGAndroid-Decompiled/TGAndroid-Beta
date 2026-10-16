package ig;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.e5;
import di.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.o8;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import w7.z5;
public final class k0 extends db {
    public static final int f11556g0 = -1;
    public static final int f11557h0 = -2;
    public final TL_account.TL_connectedBot X;
    public final TLRPC.User Y;
    public final a0 Z;
    public final LinearLayout f11558a0;
    public final di.d f11559b0;
    public final di.d f11560c0;
    public a71 f11561d0;
    public boolean f11562e0;
    public Boolean f11563f0;

    public k0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, o8 o8Var, c6 c6Var) {
        super(2, (Context) activity, c6Var, false);
        this.X = tL_connectedBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
        this.Y = user;
        this.K = AndroidUtilities.dp(36.0f);
        this.v = 0.15f;
        a0 a0Var = new a0(activity, this.currentAccount, new x8(this, 29), c6Var);
        this.Z = a0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.f11562e0 = tL_businessBotRecipients.exclude_selected;
        a0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f11558a0 = linearLayout;
        linearLayout.setOrientation(1);
        k9 k9Var = new k9((c6) null);
        z9 z9Var = new z9(activity);
        z9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        k9Var.r(user);
        z9Var.e(user, k9Var);
        linearLayout.addView(z9Var, z5.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(getThemedColor(g6.G6));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(UserObject.getUserName(user));
        linearLayout.addView(textView, z5.r(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.e.setTitle(UserObject.getUserName(user));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(g6.f19988y6));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.SessionBot));
        linearLayout.addView(textView2, z5.r(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String publicUsername = UserObject.getPublicUsername(user);
        if (!TextUtils.isEmpty(publicUsername)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(getThemedColor(g6.f19660gc));
            textView3.setText("@" + publicUsername);
            textView3.setGravity(17);
            linearLayout.addView(textView3, z5.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i10 = g6.f19543a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        mm0 mm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(72.0f));
        this.d.p1();
        this.d.setOnItemClickListener(new bi.d(this, 11));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{g6.m1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        di.d dVar = new di.d(activity, c6Var, true);
        dVar.setRoundRadius(24);
        this.f11559b0 = dVar;
        dVar.setColor(getThemedColor(g6.wj));
        dVar.setText(LocaleController.getString(R.string.TerminateSession));
        dVar.setOnClickListener(new bi.x(this, tL_connectedBot, o8Var, 8));
        frameLayout.addView(dVar, z5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 87));
        di.d dVar2 = new di.d(activity, c6Var, true);
        dVar2.setRoundRadius(24);
        this.f11560c0 = dVar2;
        dVar2.setText(LocaleController.getString(R.string.BusinessBotUpdate));
        dVar2.setOnClickListener(new bi.u1(11, this, tL_connectedBot));
        frameLayout.addView(dVar2, z5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 87));
        U(false);
        FrameLayout.LayoutParams e = z5.e(-1, -2, 80);
        int i12 = e.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        e.leftMargin = i12 + i13;
        e.rightMargin += i13;
        this.containerView.addView(frameLayout, e);
        s4.k kVar = new s4.k();
        kVar.f44872m = false;
        kVar.C = false;
        kVar.o(es.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        a71 a71Var = this.f11561d0;
        if (a71Var != null) {
            a71Var.N(false);
        }
    }

    public static void Q(k0 k0Var, TL_account.TL_connectedBot tL_connectedBot, TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        f.a(k0Var.currentAccount).b();
        k0Var.dismiss();
        tL_connectedBot.recipients = tL_businessBotRecipients;
        m2 U = LaunchActivity.U();
        if (U != null) {
            i2.d.s(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(k0Var.Y)}, zc.a0(U), R.raw.contact_check, 36);
        }
    }

    public static void R(k0 k0Var, TL_account.TL_connectedBot tL_connectedBot) {
        a0 a0Var = k0Var.Z;
        di.d dVar = k0Var.f11560c0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.bot = MessagesController.getInstance(k0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = a0Var.b();
        ConnectionsManager.getInstance(k0Var.currentAccount).sendRequest(updateconnectedbot, new e5(k0Var, tL_connectedBot, a0Var.c(), 5));
    }

    public static void S(k0 k0Var, o8 o8Var) {
        f.a(k0Var.currentAccount).b();
        o8Var.run();
        k0Var.dismiss();
    }

    public static void T(k0 k0Var, TL_account.TL_connectedBot tL_connectedBot, o8 o8Var) {
        di.d dVar = k0Var.f11559b0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.deleted = true;
        updateconnectedbot.bot = MessagesController.getInstance(k0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
        ConnectionsManager.getInstance(k0Var.currentAccount).sendRequest(updateconnectedbot, new bi.m1(14, k0Var, o8Var));
    }

    @Override
    public final CharSequence B() {
        return null;
    }

    @Override
    public final void D(float f7) {
        h5 titleTextView = this.e.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f7);
        }
    }

    public final void U(boolean z10) {
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
        Boolean bool = this.f11563f0;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        this.f11563f0 = Boolean.valueOf(z11);
        float f17 = 0.0f;
        di.d dVar = this.f11559b0;
        di.d dVar2 = this.f11560c0;
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
        es esVar = es.h;
        duration.setInterpolator(esVar).withEndAction(new Runnable(this) {
            public final k0 f11543b;

            {
                this.f11543b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        k0 k0Var = this.f11543b;
                        if (!z12) {
                            k0Var.f11560c0.setVisibility(8);
                            return;
                        } else {
                            k0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        k0 k0Var2 = this.f11543b;
                        if (z13) {
                            k0Var2.f11559b0.setVisibility(8);
                            return;
                        } else {
                            k0Var2.getClass();
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
        scaleX2.scaleY(f18).setDuration(320L).setInterpolator(esVar).withEndAction(new Runnable(this) {
            public final k0 f11543b;

            {
                this.f11543b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        k0 k0Var = this.f11543b;
                        if (!z12) {
                            k0Var.f11560c0.setVisibility(8);
                            return;
                        } else {
                            k0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        k0 k0Var2 = this.f11543b;
                        if (z13) {
                            k0Var2.f11559b0.setVisibility(8);
                            return;
                        } else {
                            k0Var2.getClass();
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
    public final lm0 x(mm0 mm0Var) {
        a71 a71Var = new a71(mm0Var, getContext(), this.currentAccount, 0, true, new ci.u(this, 23), this.resourcesProvider);
        this.f11561d0 = a71Var;
        a71Var.f23145r = false;
        return a71Var;
    }
}
