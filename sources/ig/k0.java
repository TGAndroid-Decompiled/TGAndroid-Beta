package ig;

import ai.j2;
import ai.wa;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ei.bc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import w7.z5;
public final class k0 extends bb {
    public static final int f12941g0 = -1;
    public static final int f12942h0 = -2;
    public final TL_account.TL_connectedBot X;
    public final TLRPC.User Y;
    public final a0 Z;
    public final LinearLayout f12943a0;
    public final ei.d f12944b0;
    public final ei.d f12945c0;
    public t61 f12946d0;
    public boolean f12947e0;
    public Boolean f12948f0;

    public k0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, org.telegram.ui.Components.e2 e2Var, d6 d6Var) {
        super(2, (Context) activity, d6Var, false);
        this.X = tL_connectedBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
        this.Y = user;
        this.K = AndroidUtilities.dp(36.0f);
        this.v = 0.15f;
        a0 a0Var = new a0(activity, this.currentAccount, new bc(this, 19), d6Var);
        this.Z = a0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.f12947e0 = tL_businessBotRecipients.exclude_selected;
        a0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f12943a0 = linearLayout;
        linearLayout.setOrientation(1);
        h9 h9Var = new h9((d6) null);
        w9 w9Var = new w9(activity);
        w9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        h9Var.r(user);
        w9Var.e(user, h9Var);
        linearLayout.addView(w9Var, z5.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(getThemedColor(h6.G6));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(UserObject.getUserName(user));
        linearLayout.addView(textView, z5.r(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.e.setTitle(UserObject.getUserName(user));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(h6.f21375y6));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.SessionBot));
        linearLayout.addView(textView2, z5.r(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String publicUsername = UserObject.getPublicUsername(user);
        if (!TextUtils.isEmpty(publicUsername)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(getThemedColor(h6.f21046gc));
            textView3.setText("@" + publicUsername);
            textView3.setGravity(17);
            linearLayout.addView(textView3, z5.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i10 = h6.f20929a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        im0 im0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        im0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(72.0f));
        this.d.p1();
        this.d.setOnItemClickListener(new wa(this, 15));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{h6.m1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        ei.d dVar = new ei.d(activity, d6Var, true);
        dVar.setRoundRadius(24);
        this.f12944b0 = dVar;
        dVar.setColor(getThemedColor(h6.wj));
        dVar.setText(LocaleController.getString(R.string.TerminateSession));
        dVar.setOnClickListener(new ai.v0(this, tL_connectedBot, e2Var, 11));
        frameLayout.addView(dVar, z5.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        ei.d dVar2 = new ei.d(activity, d6Var, true);
        dVar2.setRoundRadius(24);
        this.f12945c0 = dVar2;
        dVar2.setText(LocaleController.getString(R.string.BusinessBotUpdate));
        dVar2.setOnClickListener(new ai.p(21, this, tL_connectedBot));
        frameLayout.addView(dVar2, z5.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        U(false);
        FrameLayout.LayoutParams e = z5.e(-1, -2, 80);
        int i12 = e.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        e.leftMargin = i12 + i13;
        e.rightMargin += i13;
        this.containerView.addView(frameLayout, e);
        s4.k kVar = new s4.k();
        kVar.f45946m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        t61 t61Var = this.f12946d0;
        if (t61Var != null) {
            t61Var.N(false);
        }
    }

    public static void Q(k0 k0Var, TL_account.TL_connectedBot tL_connectedBot, TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        f.a(k0Var.currentAccount).b();
        k0Var.dismiss();
        tL_connectedBot.recipients = tL_businessBotRecipients;
        n2 U = LaunchActivity.U();
        if (U != null) {
            i2.e.s(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(k0Var.Y)}, xc.a0(U), R.raw.contact_check, 36);
        }
    }

    public static void R(k0 k0Var, TL_account.TL_connectedBot tL_connectedBot) {
        a0 a0Var = k0Var.Z;
        ei.d dVar = k0Var.f12945c0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.bot = MessagesController.getInstance(k0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = a0Var.b();
        ConnectionsManager.getInstance(k0Var.currentAccount).sendRequest(updateconnectedbot, new j2(k0Var, tL_connectedBot, a0Var.c(), 10));
    }

    public static void S(k0 k0Var, org.telegram.ui.Components.e2 e2Var) {
        f.a(k0Var.currentAccount).b();
        e2Var.run();
        k0Var.dismiss();
    }

    public static void T(k0 k0Var, TL_account.TL_connectedBot tL_connectedBot, org.telegram.ui.Components.e2 e2Var) {
        ei.d dVar = k0Var.f12944b0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.deleted = true;
        updateconnectedbot.bot = MessagesController.getInstance(k0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
        ConnectionsManager.getInstance(k0Var.currentAccount).sendRequest(updateconnectedbot, new ai.g(21, k0Var, e2Var));
    }

    @Override
    public final CharSequence A() {
        return null;
    }

    @Override
    public final void C(float f7) {
        j5 titleTextView = this.e.getTitleTextView();
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
        Boolean bool = this.f12948f0;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        this.f12948f0 = Boolean.valueOf(z11);
        float f17 = 0.0f;
        ei.d dVar = this.f12944b0;
        ei.d dVar2 = this.f12945c0;
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
        bs bsVar = bs.h;
        duration.setInterpolator(bsVar).withEndAction(new Runnable(this) {
            public final k0 f12935b;

            {
                this.f12935b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        k0 k0Var = this.f12935b;
                        if (!z12) {
                            k0Var.f12945c0.setVisibility(8);
                            return;
                        } else {
                            k0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        k0 k0Var2 = this.f12935b;
                        if (z13) {
                            k0Var2.f12944b0.setVisibility(8);
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
        scaleX2.scaleY(f18).setDuration(320L).setInterpolator(bsVar).withEndAction(new Runnable(this) {
            public final k0 f12935b;

            {
                this.f12935b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        k0 k0Var = this.f12935b;
                        if (!z12) {
                            k0Var.f12945c0.setVisibility(8);
                            return;
                        } else {
                            k0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        k0 k0Var2 = this.f12935b;
                        if (z13) {
                            k0Var2.f12944b0.setVisibility(8);
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
    public final hm0 x(im0 im0Var) {
        t61 t61Var = new t61(im0Var, getContext(), this.currentAccount, 0, true, new hg.o(this, 4), this.resourcesProvider);
        this.f12946d0 = t61Var;
        t61Var.f30436r = false;
        return t61Var;
    }
}
