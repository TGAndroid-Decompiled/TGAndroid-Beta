package ih;

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
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.uw;
public final class s5 extends org.telegram.ui.ActionBar.f3 {
    public static final int h = 0;
    public final zf.p0 f12118b;
    public boolean f12119c;
    public final int d;
    public uw f12120e;
    public final g f12121f;

    public s5(Context context, float f10, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, false, false);
        this.f12121f = new g(this, 9);
        this.d = i9;
        r5 r5Var = new r5(this, getContext(), f10);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false)));
        imageView.setImageResource(R.drawable.large_stealth);
        r5Var.addView(imageView, g7.e6.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        r5Var.addView(linearLayout, g7.e6.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        j3.r0.u(20.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        textView.setText(LocaleController.getString(R.string.StealthModeTitle));
        linearLayout.addView(textView, g7.e6.q(-2, -2, 1));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        h5Var.setTextSize(14);
        h5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        h5Var.setMaxLines(100);
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, b6Var));
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            h5Var.l(LocaleController.getString(R.string.StealthModeHint), false);
        } else {
            h5Var.l(LocaleController.getString(R.string.StealthModePremiumHint), false);
        }
        linearLayout.addView(h5Var, g7.e6.t(-2, -2, 1, 36, 10, 36, 0));
        gh.h1 h1Var = new gh.h1(this, getContext());
        ((ImageView) h1Var.d).setImageResource(R.drawable.msg_stealth_5min);
        ((TextView) h1Var.f8192b).setText(LocaleController.getString(R.string.HideRecentViews));
        ((TextView) h1Var.f8193c).setText(LocaleController.getString(R.string.HideRecentViewsDescription));
        linearLayout.addView(h1Var, g7.e6.t(-1, -2, 0, 0, 20, 0, 0));
        gh.h1 h1Var2 = new gh.h1(this, getContext());
        ((ImageView) h1Var2.d).setImageResource(R.drawable.msg_stealth_25min);
        ((TextView) h1Var2.f8192b).setText(LocaleController.getString(R.string.HideNextViews));
        ((TextView) h1Var2.f8193c).setText(LocaleController.getString(R.string.HideNextViewsDescription));
        linearLayout.addView(h1Var2, g7.e6.t(-1, -2, 0, 0, 10, 0, 0));
        zf.p0 p0Var = new zf.p0(AndroidUtilities.dp(8.0f), context, b6Var, true);
        this.f12118b = p0Var;
        p0Var.D = false;
        p0Var.f50648e.getDrawable().f29353y = false;
        p0Var.setIcon(R.raw.unlock_icon);
        g7.g6.a(p0Var);
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (!currentUser.premium) {
            p0Var.setIcon(R.raw.unlock_icon);
            p0Var.a(LocaleController.getString(R.string.UnlockStealthMode), new androidx.mediarouter.app.c(this, 21), false);
        } else {
            q(false);
        }
        linearLayout.addView(p0Var, g7.e6.t(-1, 48, 80, 14, 24, 14, 16));
        setCustomView(r5Var);
        p0Var.setOnClickListener(new p5(this, currentUser, i9, b6Var, 0));
    }

    public static void m(s5 s5Var, TLRPC.User user, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        if (!user.premium) {
            s5Var.dismiss();
            org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
            if (R != null) {
                R.showDialog(new zf.x0(R, 14, false));
            }
        } else if (s5Var.f12119c) {
            s5Var.dismiss();
            uw uwVar = s5Var.f12120e;
            if (uwVar != null) {
                uwVar.a(false);
            }
        } else {
            v6 storiesController = MessagesController.getInstance(s5Var.currentAccount).getStoriesController();
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = storiesController.B;
            if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(s5Var.currentAccount).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                if (s5Var.f12119c) {
                    s5Var.dismiss();
                    uw uwVar2 = s5Var.f12120e;
                    if (uwVar2 != null) {
                        uwVar2.a(false);
                        return;
                    }
                    return;
                }
                new oc(s5Var.container, b6Var).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.StealthModeCooldownHint)), null).k(true);
                return;
            }
            TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
            tL_stories_activateStealthMode.future = true;
            tL_stories_activateStealthMode.past = true;
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
            tL_storiesStealthMode2.flags |= 3;
            tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(s5Var.currentAccount).getCurrentTime() + MessagesController.getInstance(s5Var.currentAccount).stealthModeCooldown;
            tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(s5Var.currentAccount).getCurrentTime() + MessagesController.getInstance(s5Var.currentAccount).stealthModeFuture;
            storiesController.f0(tL_storiesStealthMode2);
            ConnectionsManager.getInstance(s5Var.currentAccount).sendRequest(tL_stories_activateStealthMode, new q5(0));
            try {
                s5Var.containerView.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            s5Var.dismiss();
            if (i9 == 0) {
                p();
            }
            uw uwVar3 = s5Var.f12120e;
            if (uwVar3 != null) {
                uwVar3.a(true);
            }
        }
    }

    public static void p() {
        oc X;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R.getLastStoryViewer() != null) {
            X = new oc(R.getLastStoryViewer().f11824s, R.getLastStoryViewer().f11834y);
        } else {
            X = oc.X();
        }
        if (X != null) {
            int i9 = R.drawable.msg_stories_stealth2;
            String string = LocaleController.getString(R.string.StealthModeOn);
            String string2 = LocaleController.getString(R.string.StealthModeOnHint);
            cc ccVar = new cc(X.W(), X.f31357c);
            ccVar.f27465a.setImageResource(i9);
            ccVar.f27466b.setText(string);
            TextView textView = ccVar.f27467c;
            textView.setText(string2);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            X.b(ccVar, 5000).j();
        }
    }

    public final void q(boolean z10) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(this.currentAccount).getStoriesController().B;
        zf.p0 p0Var = this.f12118b;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.f12119c = true;
            p0Var.c(LocaleController.getString(R.string.StealthModeIsActive), true, z10);
            p0Var.f50648e.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
            return;
        }
        if (tL_storiesStealthMode != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            int i9 = tL_storiesStealthMode.cooldown_until_date;
            if (currentTime <= i9) {
                long currentTime2 = i9 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                int i10 = (int) (currentTime2 % 60);
                long j10 = currentTime2 / 60;
                int i11 = (int) (j10 / 60);
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf(i11)));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf((int) (j10 % 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i10)));
                p0Var.c(LocaleController.formatString("AvailableIn", R.string.AvailableIn, sb2.toString()), true, z10);
                p0Var.f50648e.setTextColor(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false), 125));
                g gVar = this.f12121f;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 1000L);
                return;
            }
        }
        int i12 = this.d;
        if (i12 == 0) {
            p0Var.c(LocaleController.getString(R.string.EnableStealthMode), true, z10);
        } else if (i12 == 1) {
            p0Var.c(LocaleController.getString(R.string.EnableStealthModeAndOpenStory), true, z10);
        }
        p0Var.f50648e.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
    }
}
