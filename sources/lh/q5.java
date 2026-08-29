package lh;

import android.content.Context;
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
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.th;
import org.telegram.ui.ww;
public final class q5 extends org.telegram.ui.ActionBar.f3 {
    public static final int h = 0;
    public final cg.d1 f16126b;
    public boolean f16127c;
    public final int d;
    public ww f16128e;
    public final m5 f16129f;

    public q5(Context context, float f9, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        this.f16129f = new m5(this, 0);
        this.d = i10;
        p5 p5Var = new p5(this, getContext(), f9);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false)));
        imageView.setImageResource(R.drawable.large_stealth);
        p5Var.addView(imageView, i7.f6.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        p5Var.addView(linearLayout, i7.f6.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        th.n(20.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        textView.setText(LocaleController.getString(R.string.StealthModeTitle));
        linearLayout.addView(textView, i7.f6.q(-2, -2, 1));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        h5Var.setTextSize(14);
        h5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        h5Var.setMaxLines(100);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, c6Var));
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            h5Var.l(LocaleController.getString(R.string.StealthModeHint), false);
        } else {
            h5Var.l(LocaleController.getString(R.string.StealthModePremiumHint), false);
        }
        linearLayout.addView(h5Var, i7.f6.t(-2, -2, 1, 36, 10, 36, 0));
        bg.z3 z3Var = new bg.z3(this, getContext());
        ((ImageView) z3Var.f2639b).setImageResource(R.drawable.msg_stealth_5min);
        ((TextView) z3Var.f2640c).setText(LocaleController.getString(R.string.HideRecentViews));
        ((TextView) z3Var.d).setText(LocaleController.getString(R.string.HideRecentViewsDescription));
        linearLayout.addView(z3Var, i7.f6.t(-1, -2, 0, 0, 20, 0, 0));
        bg.z3 z3Var2 = new bg.z3(this, getContext());
        ((ImageView) z3Var2.f2639b).setImageResource(R.drawable.msg_stealth_25min);
        ((TextView) z3Var2.f2640c).setText(LocaleController.getString(R.string.HideNextViews));
        ((TextView) z3Var2.d).setText(LocaleController.getString(R.string.HideNextViewsDescription));
        linearLayout.addView(z3Var2, i7.f6.t(-1, -2, 0, 0, 10, 0, 0));
        cg.d1 d1Var = new cg.d1(AndroidUtilities.dp(8.0f), context, c6Var, true);
        this.f16126b = d1Var;
        d1Var.D = false;
        d1Var.f3092e.getDrawable().f30882y = false;
        d1Var.setIcon(R.raw.unlock_icon);
        i7.h6.a(d1Var);
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (!currentUser.premium) {
            d1Var.setIcon(R.raw.unlock_icon);
            d1Var.a(LocaleController.getString(R.string.UnlockStealthMode), new ag.o(this, 27), false);
        } else {
            q(false);
        }
        linearLayout.addView(d1Var, i7.f6.t(-1, 48, 80, 14, 24, 14, 16));
        setCustomView(p5Var);
        d1Var.setOnClickListener(new n5(this, currentUser, i10, c6Var, 0));
    }

    public static void m(q5 q5Var, TLRPC.User user, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        if (!user.premium) {
            q5Var.dismiss();
            org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
            if (R != null) {
                R.showDialog(new cg.p1(R, 14, false));
            }
        } else if (q5Var.f16127c) {
            q5Var.dismiss();
            ww wwVar = q5Var.f16128e;
            if (wwVar != null) {
                wwVar.a(false);
            }
        } else {
            s6 storiesController = MessagesController.getInstance(q5Var.currentAccount).getStoriesController();
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = storiesController.B;
            if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(q5Var.currentAccount).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                if (q5Var.f16127c) {
                    q5Var.dismiss();
                    ww wwVar2 = q5Var.f16128e;
                    if (wwVar2 != null) {
                        wwVar2.a(false);
                        return;
                    }
                    return;
                }
                new tc(q5Var.container, c6Var).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.StealthModeCooldownHint)), null).k(true);
                return;
            }
            TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
            tL_stories_activateStealthMode.future = true;
            tL_stories_activateStealthMode.past = true;
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
            tL_storiesStealthMode2.flags |= 3;
            tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(q5Var.currentAccount).getCurrentTime() + MessagesController.getInstance(q5Var.currentAccount).stealthModeCooldown;
            tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(q5Var.currentAccount).getCurrentTime() + MessagesController.getInstance(q5Var.currentAccount).stealthModeFuture;
            storiesController.f0(tL_storiesStealthMode2);
            ConnectionsManager.getInstance(q5Var.currentAccount).sendRequest(tL_stories_activateStealthMode, new o5(0));
            try {
                q5Var.containerView.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            q5Var.dismiss();
            if (i10 == 0) {
                p();
            }
            ww wwVar3 = q5Var.f16128e;
            if (wwVar3 != null) {
                wwVar3.a(true);
            }
        }
    }

    public static void p() {
        tc X;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R.getLastStoryViewer() != null) {
            X = new tc(R.getLastStoryViewer().f15783s, R.getLastStoryViewer().f15793y);
        } else {
            X = tc.X();
        }
        if (X != null) {
            int i10 = R.drawable.msg_stories_stealth2;
            String string = LocaleController.getString(R.string.StealthModeOn);
            String string2 = LocaleController.getString(R.string.StealthModeOnHint);
            ic icVar = new ic(X.W(), X.f32924c);
            icVar.f29363a.setImageResource(i10);
            icVar.f29364b.setText(string);
            TextView textView = icVar.f29365c;
            textView.setText(string2);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            X.b(icVar, 5000).j();
        }
    }

    public final void q(boolean z10) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(this.currentAccount).getStoriesController().B;
        cg.d1 d1Var = this.f16126b;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.f16127c = true;
            d1Var.c(LocaleController.getString(R.string.StealthModeIsActive), true, z10);
            d1Var.f3092e.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
            return;
        }
        if (tL_storiesStealthMode != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            int i10 = tL_storiesStealthMode.cooldown_until_date;
            if (currentTime <= i10) {
                long currentTime2 = i10 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                int i11 = (int) (currentTime2 % 60);
                long j10 = currentTime2 / 60;
                int i12 = (int) (j10 / 60);
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf(i12)));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf((int) (j10 % 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i11)));
                d1Var.c(LocaleController.formatString("AvailableIn", R.string.AvailableIn, sb2.toString()), true, z10);
                d1Var.f3092e.setTextColor(i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false), 125));
                m5 m5Var = this.f16129f;
                AndroidUtilities.cancelRunOnUIThread(m5Var);
                AndroidUtilities.runOnUIThread(m5Var, 1000L);
                return;
            }
        }
        int i13 = this.d;
        if (i13 == 0) {
            d1Var.c(LocaleController.getString(R.string.EnableStealthMode), true, z10);
        } else if (i13 == 1) {
            d1Var.c(LocaleController.getString(R.string.EnableStealthModeAndOpenStory), true, z10);
        }
        d1Var.f3092e.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
    }
}
