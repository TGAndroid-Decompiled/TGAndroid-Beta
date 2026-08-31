package oh;

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
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gx;
import org.telegram.ui.yh;
public final class r5 extends org.telegram.ui.ActionBar.h3 {
    public static final int h = 0;
    public final fg.b1 f17687b;
    public boolean f17688c;
    public final int d;
    public gx f17689e;
    public final t3 f17690f;

    public r5(Context context, float f10, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false, false);
        this.f17690f = new t3(this, 3);
        this.d = i10;
        q5 q5Var = new q5(this, getContext(), f10);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false)));
        imageView.setImageResource(R.drawable.large_stealth);
        q5Var.addView(imageView, k7.c6.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        q5Var.addView(linearLayout, k7.c6.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        yh.p(20.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        textView.setText(LocaleController.getString(R.string.StealthModeTitle));
        linearLayout.addView(textView, k7.c6.q(-2, -2, 1));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
        l5Var.setTextSize(14);
        l5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        l5Var.setMaxLines(100);
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22036y6, g6Var));
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            l5Var.l(LocaleController.getString(R.string.StealthModeHint), false);
        } else {
            l5Var.l(LocaleController.getString(R.string.StealthModePremiumHint), false);
        }
        linearLayout.addView(l5Var, k7.c6.t(-2, -2, 1, 36, 10, 36, 0));
        eg.t3 t3Var = new eg.t3(this, getContext());
        ((ImageView) t3Var.f5496b).setImageResource(R.drawable.msg_stealth_5min);
        ((TextView) t3Var.f5497c).setText(LocaleController.getString(R.string.HideRecentViews));
        ((TextView) t3Var.d).setText(LocaleController.getString(R.string.HideRecentViewsDescription));
        linearLayout.addView(t3Var, k7.c6.t(-1, -2, 0, 0, 20, 0, 0));
        eg.t3 t3Var2 = new eg.t3(this, getContext());
        ((ImageView) t3Var2.f5496b).setImageResource(R.drawable.msg_stealth_25min);
        ((TextView) t3Var2.f5497c).setText(LocaleController.getString(R.string.HideNextViews));
        ((TextView) t3Var2.d).setText(LocaleController.getString(R.string.HideNextViewsDescription));
        linearLayout.addView(t3Var2, k7.c6.t(-1, -2, 0, 0, 10, 0, 0));
        fg.b1 b1Var = new fg.b1(AndroidUtilities.dp(8.0f), context, g6Var, true);
        this.f17687b = b1Var;
        b1Var.E = false;
        b1Var.f6247e.getDrawable().f28049y = false;
        b1Var.setIcon(R.raw.unlock_icon);
        k7.e6.a(b1Var);
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (!currentUser.premium) {
            b1Var.setIcon(R.raw.unlock_icon);
            b1Var.a(LocaleController.getString(R.string.UnlockStealthMode), new androidx.mediarouter.app.c(this, 27), false);
        } else {
            q(false);
        }
        linearLayout.addView(b1Var, k7.c6.t(-1, 48, 80, 14, 24, 14, 16));
        setCustomView(q5Var);
        b1Var.setOnClickListener(new o5(this, currentUser, i10, g6Var, 0));
    }

    public static void m(r5 r5Var, TLRPC.User user, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        if (!user.premium) {
            r5Var.dismiss();
            org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
            if (R != null) {
                R.showDialog(new fg.n1(R, 14, false));
            }
        } else if (r5Var.f17688c) {
            r5Var.dismiss();
            gx gxVar = r5Var.f17689e;
            if (gxVar != null) {
                gxVar.a(false);
            }
        } else {
            t6 storiesController = MessagesController.getInstance(r5Var.currentAccount).getStoriesController();
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = storiesController.B;
            if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(r5Var.currentAccount).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                if (r5Var.f17688c) {
                    r5Var.dismiss();
                    gx gxVar2 = r5Var.f17689e;
                    if (gxVar2 != null) {
                        gxVar2.a(false);
                        return;
                    }
                    return;
                }
                new qc(r5Var.container, g6Var).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.StealthModeCooldownHint)), null).k(true);
                return;
            }
            TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
            tL_stories_activateStealthMode.future = true;
            tL_stories_activateStealthMode.past = true;
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
            tL_storiesStealthMode2.flags |= 3;
            tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(r5Var.currentAccount).getCurrentTime() + MessagesController.getInstance(r5Var.currentAccount).stealthModeCooldown;
            tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(r5Var.currentAccount).getCurrentTime() + MessagesController.getInstance(r5Var.currentAccount).stealthModeFuture;
            storiesController.f0(tL_storiesStealthMode2);
            ConnectionsManager.getInstance(r5Var.currentAccount).sendRequest(tL_stories_activateStealthMode, new p5(0));
            try {
                r5Var.containerView.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            r5Var.dismiss();
            if (i10 == 0) {
                p();
            }
            gx gxVar3 = r5Var.f17689e;
            if (gxVar3 != null) {
                gxVar3.a(true);
            }
        }
    }

    public static void p() {
        qc X;
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R.getLastStoryViewer() != null) {
            X = new qc(R.getLastStoryViewer().f17293s, R.getLastStoryViewer().f17304y);
        } else {
            X = qc.X();
        }
        if (X != null) {
            int i10 = R.drawable.msg_stories_stealth2;
            String string = LocaleController.getString(R.string.StealthModeOn);
            String string2 = LocaleController.getString(R.string.StealthModeOnHint);
            ec ecVar = new ec(X.W(), X.f30364c);
            ecVar.f26500a.setImageResource(i10);
            ecVar.f26501b.setText(string);
            TextView textView = ecVar.f26502c;
            textView.setText(string2);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            X.b(ecVar, 5000).j();
        }
    }

    public final void q(boolean z4) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(this.currentAccount).getStoriesController().B;
        fg.b1 b1Var = this.f17687b;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.f17688c = true;
            b1Var.c(LocaleController.getString(R.string.StealthModeIsActive), true, z4);
            b1Var.f6247e.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
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
                StringBuilder sb = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb.append(String.format(locale, "%02d", Integer.valueOf(i12)));
                sb.append(String.format(locale, ":%02d", Integer.valueOf((int) (j10 % 60))));
                sb.append(String.format(locale, ":%02d", Integer.valueOf(i11)));
                b1Var.c(LocaleController.formatString("AvailableIn", R.string.AvailableIn, sb.toString()), true, z4);
                b1Var.f6247e.setTextColor(i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false), 125));
                t3 t3Var = this.f17690f;
                AndroidUtilities.cancelRunOnUIThread(t3Var);
                AndroidUtilities.runOnUIThread(t3Var, 1000L);
                return;
            }
        }
        int i13 = this.d;
        if (i13 == 0) {
            b1Var.c(LocaleController.getString(R.string.EnableStealthMode), true, z4);
        } else if (i13 == 1) {
            b1Var.c(LocaleController.getString(R.string.EnableStealthModeAndOpenStory), true, z4);
        }
        b1Var.f6247e.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
    }
}
