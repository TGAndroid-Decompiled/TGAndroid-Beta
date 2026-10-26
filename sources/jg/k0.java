package jg;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import fi.ua;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.h2;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
public final class k0 extends bb {
    public static final int f15748k0 = -1;
    public static final int f15749l0 = -2;
    public final TL_account.TL_connectedBot X;
    public final TLRPC.User Y;
    public final b0 Z;
    public final LinearLayout f15750a0;
    public final FrameLayout f15751b0;
    public final fi.d f15752c0;
    public final fi.d f15753d0;
    public j71 f15754e0;
    public boolean f15755f0;
    public Boolean f15756g0;
    public int f15757h0;
    public int f15758i0;
    public int f15759j0;

    public k0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, h2 h2Var, u6 u6Var) {
        super(2, (Context) activity, u6Var, false);
        this.X = tL_connectedBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
        this.Y = user;
        this.K = AndroidUtilities.dp(36.0f);
        this.v = 0.15f;
        b0 b0Var = new b0(activity, this.currentAccount, new ua(this, 24), u6Var);
        this.Z = b0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.f15755f0 = tL_businessBotRecipients.exclude_selected;
        b0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f15750a0 = linearLayout;
        linearLayout.setOrientation(1);
        j9 j9Var = new j9((u6) null);
        y9 y9Var = new y9(activity);
        y9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        j9Var.r(user);
        y9Var.f(user, j9Var);
        linearLayout.addView(y9Var, gb1.x(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        f7.V(textView, y6.G6, u6Var);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(UserObject.getUserName(user));
        linearLayout.addView(textView, gb1.v(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.e.setTitle(UserObject.getUserName(user));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        f7.V(textView2, y6.f23748y6, u6Var);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.SessionBot));
        linearLayout.addView(textView2, gb1.v(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String publicUsername = UserObject.getPublicUsername(user);
        if (!TextUtils.isEmpty(publicUsername)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            f7.V(textView3, y6.gc, u6Var);
            textView3.setText("@" + publicUsername);
            textView3.setGravity(17);
            linearLayout.addView(textView3, gb1.x(-1, -2, 1, 32, 0, 32, 18));
        }
        int i10 = y6.f23299a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBarKey(i10);
        this.f15757h0 = this.navBarColor;
        mm0 mm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(72.0f));
        this.d.u1();
        this.d.setOnItemClickListener(new ai.k(this, 16));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f15751b0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{y6.o1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        fi.d dVar = new fi.d(activity, u6Var, true);
        dVar.setRoundRadius(24);
        this.f15752c0 = dVar;
        int themedColor = getThemedColor(y6.wj);
        this.f15759j0 = themedColor;
        dVar.setColor(themedColor);
        dVar.setText(LocaleController.getString(R.string.TerminateSession));
        dVar.setOnClickListener(new bi.w0(this, tL_connectedBot, h2Var, 11));
        frameLayout.addView(dVar, gb1.h(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        fi.d dVar2 = new fi.d(activity, u6Var, true);
        dVar2.setRoundRadius(24);
        this.f15753d0 = dVar2;
        dVar2.setText(LocaleController.getString(R.string.BusinessBotUpdate));
        dVar2.setOnClickListener(new bi.q(21, this, tL_connectedBot));
        frameLayout.addView(dVar2, gb1.h(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        T(false);
        FrameLayout.LayoutParams i12 = gb1.i(-1, -2, 80);
        int i13 = i12.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        i12.leftMargin = i13 + i14;
        i12.rightMargin += i14;
        this.containerView.addView(frameLayout, i12);
        s4.l lVar = new s4.l();
        lVar.f47763m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        j71 j71Var = this.f15754e0;
        if (j71Var != null) {
            j71Var.O(false);
        }
    }

    public static void P(k0 k0Var, TL_account.TL_connectedBot tL_connectedBot, TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        f.a(k0Var.currentAccount).b();
        k0Var.dismiss();
        tL_connectedBot.recipients = tL_businessBotRecipients;
        r2 U = LaunchActivity.U();
        if (U != null) {
            ic.a.s(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(k0Var.Y)}, wc.b0(U), R.raw.contact_check, 36);
        }
    }

    public static void Q(k0 k0Var, TL_account.TL_connectedBot tL_connectedBot) {
        b0 b0Var = k0Var.Z;
        fi.d dVar = k0Var.f15753d0;
        if (dVar.Q) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.bot = MessagesController.getInstance(k0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = b0Var.b();
        ConnectionsManager.getInstance(k0Var.currentAccount).sendRequest(updateconnectedbot, new bi.h2(k0Var, tL_connectedBot, b0Var.c(), 10));
    }

    public static void R(k0 k0Var, h2 h2Var) {
        f.a(k0Var.currentAccount).b();
        h2Var.run();
        k0Var.dismiss();
    }

    public static void S(k0 k0Var, TL_account.TL_connectedBot tL_connectedBot, h2 h2Var) {
        fi.d dVar = k0Var.f15752c0;
        if (dVar.Q) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.deleted = true;
        updateconnectedbot.bot = MessagesController.getInstance(k0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
        ConnectionsManager.getInstance(k0Var.currentAccount).sendRequest(updateconnectedbot, new bi.j(22, k0Var, h2Var));
    }

    @Override
    public final void B(float f7) {
        b6 titleTextView = this.e.getTitleTextView();
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
        b0 b0Var = this.Z;
        if (b0Var != null && b0Var.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f15756g0;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        this.f15756g0 = Boolean.valueOf(z11);
        float f17 = 0.0f;
        fi.d dVar = this.f15752c0;
        fi.d dVar2 = this.f15753d0;
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
        ds dsVar = ds.h;
        duration.setInterpolator(dsVar).withEndAction(new Runnable(this) {
            public final k0 f15737b;

            {
                this.f15737b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        k0 k0Var = this.f15737b;
                        if (!z12) {
                            k0Var.f15753d0.setVisibility(8);
                            return;
                        } else {
                            k0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        k0 k0Var2 = this.f15737b;
                        if (z13) {
                            k0Var2.f15752c0.setVisibility(8);
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
        scaleX2.scaleY(f18).setDuration(320L).setInterpolator(dsVar).withEndAction(new Runnable(this) {
            public final k0 f15737b;

            {
                this.f15737b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        k0 k0Var = this.f15737b;
                        if (!z12) {
                            k0Var.f15753d0.setVisibility(8);
                            return;
                        } else {
                            k0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        k0 k0Var2 = this.f15737b;
                        if (z13) {
                            k0Var2.f15752c0.setVisibility(8);
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
        b0 b0Var = this.Z;
        if (b0Var != null) {
            b0Var.g();
        }
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        b0 b0Var = this.Z;
        if (b0Var != null && b0Var.g()) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        try {
            super.onThemeColorsChanged();
            int i11 = y6.f23299a7;
            int themedColor = getThemedColor(i11);
            if (themedColor != this.f15758i0) {
                this.f15758i0 = themedColor;
                setBackgroundColor(themedColor);
                FrameLayout frameLayout = this.f15751b0;
                if (frameLayout != null) {
                    frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{y6.o1(0.0f, themedColor), themedColor, themedColor}));
                }
            }
            int themedColor2 = getThemedColor(y6.wj);
            fi.d dVar = this.f15752c0;
            if (dVar != null && themedColor2 != this.f15759j0) {
                this.f15759j0 = themedColor2;
                dVar.setColor(themedColor2);
            }
            int themedColor3 = getThemedColor(i11);
            if (this.navBarColorKey < 0 && (i10 = this.navBarColor) == this.f15757h0 && themedColor3 != i10) {
                this.navBarColor = themedColor3;
                this.f15757h0 = themedColor3;
                setOverlayNavBarColor(themedColor3);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(mm0Var, getContext(), this.currentAccount, 0, true, new hi.e2(this, 7), this.resourcesProvider);
        this.f15754e0 = j71Var;
        j71Var.f29507r = false;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
