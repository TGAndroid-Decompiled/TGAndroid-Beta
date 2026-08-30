package nh;

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
import org.telegram.ui.fx;
import org.telegram.ui.yh;
public final class r5 extends org.telegram.ui.ActionBar.g3 {
    public static final int h = 0;
    public final eg.c1 f15840b;
    public boolean f15841c;
    public final int d;
    public fx e;
    public final n5 f15842f;

    public r5(Context context, float f10, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false, false);
        this.f15842f = new n5(this, 0);
        this.d = i10;
        q5 q5Var = new q5(this, getContext(), f10);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false)));
        imageView.setImageResource(R.drawable.large_stealth);
        q5Var.addView(imageView, k7.b6.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        q5Var.addView(linearLayout, k7.b6.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        yh.p(20.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        textView.setText(LocaleController.getString(R.string.StealthModeTitle));
        linearLayout.addView(textView, k7.b6.q(-2, -2, 1));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
        k5Var.setTextSize(14);
        k5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        k5Var.setMaxLines(100);
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20281y6, f6Var));
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            k5Var.l(LocaleController.getString(R.string.StealthModeHint), false);
        } else {
            k5Var.l(LocaleController.getString(R.string.StealthModePremiumHint), false);
        }
        linearLayout.addView(k5Var, k7.b6.t(-2, -2, 1, 36, 10, 36, 0));
        dg.v3 v3Var = new dg.v3(this, getContext());
        ((ImageView) v3Var.f4831b).setImageResource(R.drawable.msg_stealth_5min);
        ((TextView) v3Var.f4832c).setText(LocaleController.getString(R.string.HideRecentViews));
        ((TextView) v3Var.d).setText(LocaleController.getString(R.string.HideRecentViewsDescription));
        linearLayout.addView(v3Var, k7.b6.t(-1, -2, 0, 0, 20, 0, 0));
        dg.v3 v3Var2 = new dg.v3(this, getContext());
        ((ImageView) v3Var2.f4831b).setImageResource(R.drawable.msg_stealth_25min);
        ((TextView) v3Var2.f4832c).setText(LocaleController.getString(R.string.HideNextViews));
        ((TextView) v3Var2.d).setText(LocaleController.getString(R.string.HideNextViewsDescription));
        linearLayout.addView(v3Var2, k7.b6.t(-1, -2, 0, 0, 10, 0, 0));
        eg.c1 c1Var = new eg.c1(AndroidUtilities.dp(8.0f), context, f6Var, true);
        this.f15840b = c1Var;
        c1Var.E = false;
        c1Var.e.getDrawable().f25903y = false;
        c1Var.setIcon(R.raw.unlock_icon);
        k7.d6.a(c1Var);
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (!currentUser.premium) {
            c1Var.setIcon(R.raw.unlock_icon);
            c1Var.a(LocaleController.getString(R.string.UnlockStealthMode), new androidx.mediarouter.app.c(this, 27), false);
        } else {
            q(false);
        }
        linearLayout.addView(c1Var, k7.b6.t(-1, 48, 80, 14, 24, 14, 16));
        setCustomView(q5Var);
        c1Var.setOnClickListener(new o5(this, currentUser, i10, f6Var, 0));
    }

    public static void m(r5 r5Var, TLRPC.User user, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        if (!user.premium) {
            r5Var.dismiss();
            org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
            if (R != null) {
                R.showDialog(new eg.o1(R, 14, false));
            }
        } else if (r5Var.f15841c) {
            r5Var.dismiss();
            fx fxVar = r5Var.e;
            if (fxVar != null) {
                fxVar.a(false);
            }
        } else {
            t6 storiesController = MessagesController.getInstance(r5Var.currentAccount).getStoriesController();
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = storiesController.B;
            if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(r5Var.currentAccount).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                if (r5Var.f15841c) {
                    r5Var.dismiss();
                    fx fxVar2 = r5Var.e;
                    if (fxVar2 != null) {
                        fxVar2.a(false);
                        return;
                    }
                    return;
                }
                new qc(r5Var.container, f6Var).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.StealthModeCooldownHint)), null).k(true);
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
            fx fxVar3 = r5Var.e;
            if (fxVar3 != null) {
                fxVar3.a(true);
            }
        }
    }

    public static void p() {
        qc X;
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R.getLastStoryViewer() != null) {
            X = new qc(R.getLastStoryViewer().f15488s, R.getLastStoryViewer().f15499y);
        } else {
            X = qc.X();
        }
        if (X != null) {
            int i10 = R.drawable.msg_stories_stealth2;
            String string = LocaleController.getString(R.string.StealthModeOn);
            String string2 = LocaleController.getString(R.string.StealthModeOnHint);
            ec ecVar = new ec(X.W(), X.f28114c);
            ecVar.f24549a.setImageResource(i10);
            ecVar.f24550b.setText(string);
            TextView textView = ecVar.f24551c;
            textView.setText(string2);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            X.b(ecVar, 5000).j();
        }
    }

    public final void q(boolean z4) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(this.currentAccount).getStoriesController().B;
        eg.c1 c1Var = this.f15840b;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.f15841c = true;
            c1Var.c(LocaleController.getString(R.string.StealthModeIsActive), true, z4);
            c1Var.e.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
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
                c1Var.c(LocaleController.formatString("AvailableIn", R.string.AvailableIn, sb.toString()), true, z4);
                c1Var.e.setTextColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false), 125));
                n5 n5Var = this.f15842f;
                AndroidUtilities.cancelRunOnUIThread(n5Var);
                AndroidUtilities.runOnUIThread(n5Var, 1000L);
                return;
            }
        }
        int i13 = this.d;
        if (i13 == 0) {
            c1Var.c(LocaleController.getString(R.string.EnableStealthMode), true, z4);
        } else if (i13 == 1) {
            c1Var.c(LocaleController.getString(R.string.EnableStealthModeAndOpenStory), true, z4);
        }
        c1Var.e.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
    }
}
