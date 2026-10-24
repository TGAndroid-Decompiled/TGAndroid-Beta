package ci;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.uw;
public final class f6 extends org.telegram.ui.ActionBar.h3 {
    public static final int h = 0;
    public final sg.p0 f5322b;
    public boolean f5323c;
    public final int d;
    public uw e;
    public final androidx.fragment.app.d f5324f;

    public f6(Context context, float f7, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        this.f5324f = new androidx.fragment.app.d(this, 15);
        this.d = i10;
        e6 e6Var = new e6(this, getContext(), f7);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int dp = AndroidUtilities.dp(80.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        imageView.setBackground(K);
        org.telegram.ui.ActionBar.r6.k(imageView, K, O, null, null);
        imageView.setImageResource(R.drawable.large_stealth);
        e6Var.addView(imageView, w7.z5.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        e6Var.addView(linearLayout, w7.z5.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.play_billing.k3.m(20.0f, 1, textView);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, g6Var);
        textView.setText(LocaleController.getString(R.string.StealthModeTitle));
        linearLayout.addView(textView, w7.z5.q(-2, -2, 1));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(getContext());
        n5Var.setTextSize(14);
        n5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        n5Var.setMaxLines(100);
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.f21572y6, g6Var);
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            n5Var.l(LocaleController.getString(R.string.StealthModeHint), false);
        } else {
            n5Var.l(LocaleController.getString(R.string.StealthModePremiumHint), false);
        }
        linearLayout.addView(n5Var, w7.z5.t(-2, -2, 1, 36, 10, 36, 0));
        ai.w1 w1Var = new ai.w1(this, getContext());
        ((ImageView) w1Var.d).setImageResource(R.drawable.msg_stealth_5min);
        ((TextView) w1Var.f2344b).setText(LocaleController.getString(R.string.HideRecentViews));
        ((TextView) w1Var.f2345c).setText(LocaleController.getString(R.string.HideRecentViewsDescription));
        linearLayout.addView(w1Var, w7.z5.t(-1, -2, 0, 0, 20, 0, 0));
        ai.w1 w1Var2 = new ai.w1(this, getContext());
        ((ImageView) w1Var2.d).setImageResource(R.drawable.msg_stealth_25min);
        ((TextView) w1Var2.f2344b).setText(LocaleController.getString(R.string.HideNextViews));
        ((TextView) w1Var2.f2345c).setText(LocaleController.getString(R.string.HideNextViewsDescription));
        linearLayout.addView(w1Var2, w7.z5.t(-1, -2, 0, 0, 10, 0, 0));
        sg.p0 p0Var = new sg.p0(AndroidUtilities.dp(8.0f), context, g6Var, true);
        this.f5322b = p0Var;
        p0Var.J = false;
        p0Var.h.getDrawable().D = false;
        p0Var.setIcon(R.raw.unlock_icon);
        w7.b6.a(p0Var);
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (!currentUser.premium) {
            p0Var.setIcon(R.raw.unlock_icon);
            p0Var.a(LocaleController.getString(R.string.UnlockStealthMode), new ah.g0(this, 14), false);
        } else {
            r(false);
        }
        linearLayout.addView(p0Var, w7.z5.t(-1, 48, 80, 14, 24, 14, 16));
        setCustomView(e6Var);
        p0Var.setOnClickListener(new c6(this, currentUser, i10, g6Var, 0));
    }

    public static void m(f6 f6Var, TLRPC.User user, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        if (!user.premium) {
            f6Var.dismiss();
            org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
            if (R != null) {
                R.showDialog(new sg.y0(R, 14, false));
            }
        } else if (f6Var.f5323c) {
            f6Var.dismiss();
            uw uwVar = f6Var.e;
            if (uwVar != null) {
                uwVar.a(false);
            }
        } else {
            h7 storiesController = MessagesController.getInstance(f6Var.currentAccount).getStoriesController();
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = storiesController.B;
            if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(f6Var.currentAccount).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                if (f6Var.f5323c) {
                    f6Var.dismiss();
                    uw uwVar2 = f6Var.e;
                    if (uwVar2 != null) {
                        uwVar2.a(false);
                        return;
                    }
                    return;
                }
                new vc(f6Var.container, g6Var).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.StealthModeCooldownHint)), null).k(true);
                return;
            }
            TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
            tL_stories_activateStealthMode.future = true;
            tL_stories_activateStealthMode.past = true;
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
            tL_storiesStealthMode2.flags |= 3;
            tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(f6Var.currentAccount).getCurrentTime() + MessagesController.getInstance(f6Var.currentAccount).stealthModeCooldown;
            tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(f6Var.currentAccount).getCurrentTime() + MessagesController.getInstance(f6Var.currentAccount).stealthModeFuture;
            storiesController.f0(tL_storiesStealthMode2);
            ConnectionsManager.getInstance(f6Var.currentAccount).sendRequest(tL_stories_activateStealthMode, new d6(0));
            try {
                f6Var.containerView.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            f6Var.dismiss();
            if (i10 == 0) {
                q();
            }
            uw uwVar3 = f6Var.e;
            if (uwVar3 != null) {
                uwVar3.a(true);
            }
        }
    }

    public static void q() {
        vc X;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R.getLastStoryViewer() != null) {
            X = new vc(R.getLastStoryViewer().f6260s, R.getLastStoryViewer().f6274y);
        } else {
            X = vc.X();
        }
        if (X != null) {
            int i10 = R.drawable.msg_stories_stealth2;
            String string = LocaleController.getString(R.string.StealthModeOn);
            String string2 = LocaleController.getString(R.string.StealthModeOnHint);
            kc kcVar = new kc(X.W(), X.f31416c);
            kcVar.f28000a.setImageResource(i10);
            kcVar.f28001b.setText(string);
            TextView textView = kcVar.f28002c;
            textView.setText(string2);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            X.b(kcVar, 5000).j();
        }
    }

    public final void r(boolean z10) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(this.currentAccount).getStoriesController().B;
        sg.p0 p0Var = this.f5322b;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.f5323c = true;
            p0Var.b(LocaleController.getString(R.string.StealthModeIsActive), true, z10);
            org.telegram.ui.ActionBar.r6.a0(p0Var.h, org.telegram.ui.ActionBar.k6.Sh, null);
            return;
        }
        if (tL_storiesStealthMode != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            int i10 = tL_storiesStealthMode.cooldown_until_date;
            if (currentTime <= i10) {
                long currentTime2 = i10 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                int i11 = (int) (currentTime2 % 60);
                long j10 = currentTime2 / 60;
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf((int) (j10 / 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf((int) (j10 % 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i11)));
                p0Var.b(LocaleController.formatString("AvailableIn", R.string.AvailableIn, sb2.toString()), true, z10);
                sg.o0 o0Var = p0Var.h;
                org.telegram.ui.ActionBar.n6 h10 = org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Sh, 125);
                org.telegram.ui.ActionBar.r6.n(o0Var, h10.f21711a, -1, 1, h10.d, null);
                androidx.fragment.app.d dVar = this.f5324f;
                AndroidUtilities.cancelRunOnUIThread(dVar);
                AndroidUtilities.runOnUIThread(dVar, 1000L);
                return;
            }
        }
        int i12 = this.d;
        if (i12 == 0) {
            p0Var.b(LocaleController.getString(R.string.EnableStealthMode), true, z10);
        } else if (i12 == 1) {
            p0Var.b(LocaleController.getString(R.string.EnableStealthModeAndOpenStory), true, z10);
        }
        org.telegram.ui.ActionBar.r6.a0(p0Var.h, org.telegram.ui.ActionBar.k6.Sh, null);
    }
}
