package gg;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.n3;
import bi.wa;
import bi.wc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zd;
import org.telegram.ui.LaunchActivity;
import w7.a6;
public final class p0 extends ab {
    public static final int f8994g0 = -1;
    public static final int f8995h0 = -2;
    public final TL_account.TL_connectedBot X;
    public final TLRPC.User Y;
    public final e0 Z;
    public final LinearLayout f8996a0;
    public final bi.d f8997b0;
    public final bi.d f8998c0;
    public j61 f8999d0;
    public boolean f9000e0;
    public Boolean f9001f0;

    public p0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, zd zdVar, f6 f6Var) {
        super(2, (Context) activity, f6Var, false);
        this.X = tL_connectedBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
        this.Y = user;
        this.K = AndroidUtilities.dp(36.0f);
        this.v = 0.15f;
        e0 e0Var = new e0(activity, this.currentAccount, new wc(this, 26), f6Var);
        this.Z = e0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.f9000e0 = tL_businessBotRecipients.exclude_selected;
        e0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f8996a0 = linearLayout;
        linearLayout.setOrientation(1);
        g9 g9Var = new g9((f6) null);
        w9 w9Var = new w9(activity);
        w9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        g9Var.r(user);
        w9Var.e(user, g9Var);
        linearLayout.addView(w9Var, a6.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(getThemedColor(j6.G6));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(UserObject.getUserName(user));
        linearLayout.addView(textView, a6.r(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.e.setTitle(UserObject.getUserName(user));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(j6.f18306y6));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.SessionBot));
        linearLayout.addView(textView2, a6.r(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String publicUsername = UserObject.getPublicUsername(user);
        if (!TextUtils.isEmpty(publicUsername)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(getThemedColor(j6.gc));
            textView3.setText("@" + publicUsername);
            textView3.setGravity(17);
            linearLayout.addView(textView3, a6.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i10 = j6.f17872a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        vl0 vl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(72.0f));
        this.d.o1();
        this.d.setOnItemClickListener(new ai.g(this, 10));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{j6.l1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        bi.d dVar = new bi.d(activity, f6Var, true);
        dVar.setRoundRadius(24);
        this.f8997b0 = dVar;
        dVar.setColor(getThemedColor(j6.wj));
        dVar.setText(LocaleController.getString(R.string.TerminateSession));
        dVar.setOnClickListener(new bi.q(this, tL_connectedBot, zdVar, 4));
        frameLayout.addView(dVar, a6.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        bi.d dVar2 = new bi.d(activity, f6Var, true);
        dVar2.setRoundRadius(24);
        this.f8998c0 = dVar2;
        dVar2.setText(LocaleController.getString(R.string.BusinessBotUpdate));
        dVar2.setOnClickListener(new n3(7, this, tL_connectedBot));
        frameLayout.addView(dVar2, a6.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        T(false);
        FrameLayout.LayoutParams e = a6.e(-1, -2, 80);
        int i12 = e.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        e.leftMargin = i12 + i13;
        e.rightMargin += i13;
        this.containerView.addView(frameLayout, e);
        s4.j jVar = new s4.j();
        jVar.f41645m = false;
        jVar.C = false;
        jVar.o(wr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        j61 j61Var = this.f8999d0;
        if (j61Var != null) {
            j61Var.N(false);
        }
    }

    public static void P(p0 p0Var, TL_account.TL_connectedBot tL_connectedBot, TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        f.a(p0Var.currentAccount).b();
        p0Var.dismiss();
        tL_connectedBot.recipients = tL_businessBotRecipients;
        p2 U = LaunchActivity.U();
        if (U != null) {
            com.google.android.gms.internal.vision.e2.o(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(p0Var.Y)}, org.telegram.ui.Components.wc.a0(U), R.raw.contact_check, 36);
        }
    }

    public static void Q(p0 p0Var, TL_account.TL_connectedBot tL_connectedBot) {
        e0 e0Var = p0Var.Z;
        bi.d dVar = p0Var.f8998c0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.bot = MessagesController.getInstance(p0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = e0Var.b();
        ConnectionsManager.getInstance(p0Var.currentAccount).sendRequest(updateconnectedbot, new wa(p0Var, tL_connectedBot, e0Var.c(), 4));
    }

    public static void R(p0 p0Var, zd zdVar) {
        f.a(p0Var.currentAccount).b();
        zdVar.run();
        p0Var.dismiss();
    }

    public static void S(p0 p0Var, TL_account.TL_connectedBot tL_connectedBot, zd zdVar) {
        bi.d dVar = p0Var.f8997b0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.deleted = true;
        updateconnectedbot.bot = MessagesController.getInstance(p0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
        ConnectionsManager.getInstance(p0Var.currentAccount).sendRequest(updateconnectedbot, new bi.o2(9, p0Var, zdVar));
    }

    @Override
    public final void A(float f7) {
        l5 titleTextView = this.e.getTitleTextView();
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
        e0 e0Var = this.Z;
        if (e0Var != null && e0Var.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f9001f0;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        this.f9001f0 = Boolean.valueOf(z11);
        float f17 = 0.0f;
        bi.d dVar = this.f8997b0;
        bi.d dVar2 = this.f8998c0;
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
        wr wrVar = wr.h;
        duration.setInterpolator(wrVar).withEndAction(new Runnable(this) {
            public final p0 f8979b;

            {
                this.f8979b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        p0 p0Var = this.f8979b;
                        if (!z12) {
                            p0Var.f8998c0.setVisibility(8);
                            return;
                        } else {
                            p0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        p0 p0Var2 = this.f8979b;
                        if (z13) {
                            p0Var2.f8997b0.setVisibility(8);
                            return;
                        } else {
                            p0Var2.getClass();
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
        scaleX2.scaleY(f18).setDuration(320L).setInterpolator(wrVar).withEndAction(new Runnable(this) {
            public final p0 f8979b;

            {
                this.f8979b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        p0 p0Var = this.f8979b;
                        if (!z12) {
                            p0Var.f8998c0.setVisibility(8);
                            return;
                        } else {
                            p0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        p0 p0Var2 = this.f8979b;
                        if (z13) {
                            p0Var2.f8997b0.setVisibility(8);
                            return;
                        } else {
                            p0Var2.getClass();
                            return;
                        }
                }
            }
        }).start();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        e0 e0Var = this.Z;
        if (e0Var != null) {
            e0Var.g();
        }
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        e0 e0Var = this.Z;
        if (e0Var != null && e0Var.g()) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(vl0Var, getContext(), this.currentAccount, 0, true, new ai.c0(this, 23), this.resourcesProvider);
        this.f8999d0 = j61Var;
        j61Var.f24250r = false;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
