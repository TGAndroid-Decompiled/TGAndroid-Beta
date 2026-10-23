package ig;

import ai.j2;
import ai.xa;
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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import w7.z5;
public final class j0 extends bb {
    public static final int f12966k0 = -1;
    public static final int f12967l0 = -2;
    public final TL_account.TL_connectedBot X;
    public final TLRPC.User Y;
    public final a0 Z;
    public final LinearLayout f12968a0;
    public final FrameLayout f12969b0;
    public final ei.d f12970c0;
    public final ei.d f12971d0;
    public b71 f12972e0;
    public boolean f12973f0;
    public Boolean f12974g0;
    public int f12975h0;
    public int f12976i0;
    public int f12977j0;

    public j0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, org.telegram.ui.Components.d2 d2Var, g6 g6Var) {
        super(2, (Context) activity, g6Var, false);
        this.X = tL_connectedBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
        this.Y = user;
        this.K = AndroidUtilities.dp(36.0f);
        this.v = 0.15f;
        a0 a0Var = new a0(activity, this.currentAccount, new bc(this, 19), g6Var);
        this.Z = a0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.f12973f0 = tL_businessBotRecipients.exclude_selected;
        a0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f12968a0 = linearLayout;
        linearLayout.setOrientation(1);
        h9 h9Var = new h9((g6) null);
        w9 w9Var = new w9(activity);
        w9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        h9Var.r(user);
        w9Var.e(user, h9Var);
        linearLayout.addView(w9Var, z5.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        r6.W(textView, k6.G6, g6Var);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(UserObject.getUserName(user));
        linearLayout.addView(textView, z5.r(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.e.setTitle(UserObject.getUserName(user));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        r6.W(textView2, k6.f21571y6, g6Var);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.SessionBot));
        linearLayout.addView(textView2, z5.r(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String publicUsername = UserObject.getPublicUsername(user);
        if (!TextUtils.isEmpty(publicUsername)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            r6.W(textView3, k6.f21242gc, g6Var);
            textView3.setText("@" + publicUsername);
            textView3.setGravity(17);
            linearLayout.addView(textView3, z5.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i10 = k6.f21125a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBarKey(i10);
        this.f12975h0 = this.navBarColor;
        mm0 mm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(72.0f));
        this.d.t1();
        this.d.setOnItemClickListener(new xa(this, 15));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f12969b0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{k6.o1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        ei.d dVar = new ei.d(activity, g6Var, true);
        dVar.setRoundRadius(24);
        this.f12970c0 = dVar;
        int themedColor = getThemedColor(k6.wj);
        this.f12977j0 = themedColor;
        dVar.setColor(themedColor);
        dVar.setText(LocaleController.getString(R.string.TerminateSession));
        dVar.setOnClickListener(new ai.v0(this, tL_connectedBot, d2Var, 11));
        frameLayout.addView(dVar, z5.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        ei.d dVar2 = new ei.d(activity, g6Var, true);
        dVar2.setRoundRadius(24);
        this.f12971d0 = dVar2;
        dVar2.setText(LocaleController.getString(R.string.BusinessBotUpdate));
        dVar2.setOnClickListener(new ai.p(21, this, tL_connectedBot));
        frameLayout.addView(dVar2, z5.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        T(false);
        FrameLayout.LayoutParams e = z5.e(-1, -2, 80);
        int i12 = e.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        e.leftMargin = i12 + i13;
        e.rightMargin += i13;
        this.containerView.addView(frameLayout, e);
        s4.k kVar = new s4.k();
        kVar.f46377m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        b71 b71Var = this.f12972e0;
        if (b71Var != null) {
            b71Var.N(false);
        }
    }

    public static void P(j0 j0Var, TL_account.TL_connectedBot tL_connectedBot, TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        f.a(j0Var.currentAccount).b();
        j0Var.dismiss();
        tL_connectedBot.recipients = tL_businessBotRecipients;
        o2 U = LaunchActivity.U();
        if (U != null) {
            i2.o1.t(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(j0Var.Y)}, xc.a0(U), R.raw.contact_check, 36);
        }
    }

    public static void Q(j0 j0Var, TL_account.TL_connectedBot tL_connectedBot) {
        a0 a0Var = j0Var.Z;
        ei.d dVar = j0Var.f12971d0;
        if (dVar.Q) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.bot = MessagesController.getInstance(j0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = a0Var.b();
        ConnectionsManager.getInstance(j0Var.currentAccount).sendRequest(updateconnectedbot, new j2(j0Var, tL_connectedBot, a0Var.c(), 10));
    }

    public static void R(j0 j0Var, org.telegram.ui.Components.d2 d2Var) {
        f.a(j0Var.currentAccount).b();
        d2Var.run();
        j0Var.dismiss();
    }

    public static void S(j0 j0Var, TL_account.TL_connectedBot tL_connectedBot, org.telegram.ui.Components.d2 d2Var) {
        ei.d dVar = j0Var.f12970c0;
        if (dVar.Q) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.deleted = true;
        updateconnectedbot.bot = MessagesController.getInstance(j0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
        ConnectionsManager.getInstance(j0Var.currentAccount).sendRequest(updateconnectedbot, new ai.g(21, j0Var, d2Var));
    }

    @Override
    public final void B(float f7) {
        n5 titleTextView = this.e.getTitleTextView();
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
        Boolean bool = this.f12974g0;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        this.f12974g0 = Boolean.valueOf(z11);
        float f17 = 0.0f;
        ei.d dVar = this.f12970c0;
        ei.d dVar2 = this.f12971d0;
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
            public final j0 f12958b;

            {
                this.f12958b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        j0 j0Var = this.f12958b;
                        if (!z12) {
                            j0Var.f12971d0.setVisibility(8);
                            return;
                        } else {
                            j0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        j0 j0Var2 = this.f12958b;
                        if (z13) {
                            j0Var2.f12970c0.setVisibility(8);
                            return;
                        } else {
                            j0Var2.getClass();
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
            public final j0 f12958b;

            {
                this.f12958b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        j0 j0Var = this.f12958b;
                        if (!z12) {
                            j0Var.f12971d0.setVisibility(8);
                            return;
                        } else {
                            j0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        j0 j0Var2 = this.f12958b;
                        if (z13) {
                            j0Var2.f12970c0.setVisibility(8);
                            return;
                        } else {
                            j0Var2.getClass();
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
    public final void onThemeColorsChanged() {
        int i10;
        try {
            super.onThemeColorsChanged();
            int i11 = k6.f21125a7;
            int themedColor = getThemedColor(i11);
            if (themedColor != this.f12976i0) {
                this.f12976i0 = themedColor;
                setBackgroundColor(themedColor);
                FrameLayout frameLayout = this.f12969b0;
                if (frameLayout != null) {
                    frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{k6.o1(0.0f, themedColor), themedColor, themedColor}));
                }
            }
            int themedColor2 = getThemedColor(k6.wj);
            ei.d dVar = this.f12970c0;
            if (dVar != null && themedColor2 != this.f12977j0) {
                this.f12977j0 = themedColor2;
                dVar.setColor(themedColor2);
            }
            int themedColor3 = getThemedColor(i11);
            if (this.navBarColorKey < 0 && (i10 = this.navBarColor) == this.f12975h0 && themedColor3 != i10) {
                this.navBarColor = themedColor3;
                this.f12975h0 = themedColor3;
                setOverlayNavBarColor(themedColor3);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(mm0Var, getContext(), this.currentAccount, 0, true, new hg.o(this, 4), this.resourcesProvider);
        this.f12972e0 = b71Var;
        b71Var.f24972r = false;
        return b71Var;
    }

    @Override
    public final CharSequence z() {
        return null;
    }
}
