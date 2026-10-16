package bi;

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
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ox;
public final class j7 extends org.telegram.ui.ActionBar.e3 {
    public static final int h = 0;
    public final sg.q0 f3208b;
    public boolean f3209c;
    public final int d;
    public ox e;
    public final a3.d f3210f;

    public j7(Context context, float f7, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, false);
        this.f3210f = new a3.d(this, 22);
        this.d = i10;
        h7 h7Var = new h7(this, getContext(), f7);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oh, false)));
        imageView.setImageResource(R.drawable.large_stealth);
        h7Var.addView(imageView, w7.z5.a(80.0f, 0.0f, 18.0f, 0.0f, 0.0f, 80, 1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        h7Var.addView(linearLayout, w7.z5.a(-2.0f, 0.0f, 116.0f, 0.0f, 0.0f, -1, 0));
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.play_billing.k3.m(20.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        textView.setText(LocaleController.getString(R.string.StealthModeTitle));
        linearLayout.addView(textView, w7.z5.q(-2, -2, 1));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        h5Var.setTextSize(14);
        h5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        h5Var.setMaxLines(100);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19988y6, c6Var));
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            h5Var.l(LocaleController.getString(R.string.StealthModeHint), false);
        } else {
            h5Var.l(LocaleController.getString(R.string.StealthModePremiumHint), false);
        }
        linearLayout.addView(h5Var, w7.z5.t(-2, -2, 1, 36, 10, 36, 0));
        i7 i7Var = new i7(this, getContext());
        ((ImageView) i7Var.d).setImageResource(R.drawable.msg_stealth_5min);
        ((TextView) i7Var.f3178b).setText(LocaleController.getString(R.string.HideRecentViews));
        ((TextView) i7Var.f3179c).setText(LocaleController.getString(R.string.HideRecentViewsDescription));
        linearLayout.addView(i7Var, w7.z5.t(-1, -2, 0, 0, 20, 0, 0));
        i7 i7Var2 = new i7(this, getContext());
        ((ImageView) i7Var2.d).setImageResource(R.drawable.msg_stealth_25min);
        ((TextView) i7Var2.f3178b).setText(LocaleController.getString(R.string.HideNextViews));
        ((TextView) i7Var2.f3179c).setText(LocaleController.getString(R.string.HideNextViewsDescription));
        linearLayout.addView(i7Var2, w7.z5.t(-1, -2, 0, 0, 10, 0, 0));
        sg.q0 q0Var = new sg.q0(AndroidUtilities.dp(8.0f), context, c6Var, true);
        this.f3208b = q0Var;
        q0Var.H = false;
        q0Var.e.getDrawable().D = false;
        q0Var.setIcon(R.raw.unlock_icon);
        w7.b6.a(q0Var);
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (!currentUser.premium) {
            q0Var.setIcon(R.raw.unlock_icon);
            q0Var.a(LocaleController.getString(R.string.UnlockStealthMode), new ah.g0(this, 4), false);
        } else {
            s(false);
        }
        linearLayout.addView(q0Var, w7.z5.t(-1, 48, 80, 14, 24, 14, 16));
        setCustomView(h7Var);
        q0Var.setOnClickListener(new f7(this, currentUser, i10, c6Var, 0));
    }

    public static void n(j7 j7Var, TLRPC.User user, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        if (!user.premium) {
            j7Var.dismiss();
            org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
            if (R != null) {
                R.showDialog(new sg.y0(R, 14, false));
            }
        } else if (j7Var.f3209c) {
            j7Var.dismiss();
            ox oxVar = j7Var.e;
            if (oxVar != null) {
                oxVar.a(false);
            }
        } else {
            x8 storiesController = MessagesController.getInstance(j7Var.currentAccount).getStoriesController();
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = storiesController.B;
            if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(j7Var.currentAccount).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                if (j7Var.f3209c) {
                    j7Var.dismiss();
                    ox oxVar2 = j7Var.e;
                    if (oxVar2 != null) {
                        oxVar2.a(false);
                        return;
                    }
                    return;
                }
                new zc(j7Var.container, c6Var).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.StealthModeCooldownHint)), null).k(true);
                return;
            }
            TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
            tL_stories_activateStealthMode.future = true;
            tL_stories_activateStealthMode.past = true;
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
            tL_storiesStealthMode2.flags |= 3;
            tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(j7Var.currentAccount).getCurrentTime() + MessagesController.getInstance(j7Var.currentAccount).stealthModeCooldown;
            tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(j7Var.currentAccount).getCurrentTime() + MessagesController.getInstance(j7Var.currentAccount).stealthModeFuture;
            storiesController.f0(tL_storiesStealthMode2);
            ConnectionsManager.getInstance(j7Var.currentAccount).sendRequest(tL_stories_activateStealthMode, new g7(0));
            try {
                j7Var.containerView.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            j7Var.dismiss();
            if (i10 == 0) {
                r();
            }
            ox oxVar3 = j7Var.e;
            if (oxVar3 != null) {
                oxVar3.a(true);
            }
        }
    }

    public static void r() {
        zc X;
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R.getLastStoryViewer() != null) {
            X = new zc(R.getLastStoryViewer().f3704s, R.getLastStoryViewer().f3718y);
        } else {
            X = zc.X();
        }
        if (X != null) {
            int i10 = R.drawable.msg_stories_stealth2;
            String string = LocaleController.getString(R.string.StealthModeOn);
            String string2 = LocaleController.getString(R.string.StealthModeOnHint);
            oc ocVar = new oc(X.W(), X.f31541c);
            ocVar.f27634a.setImageResource(i10);
            ocVar.f27635b.setText(string);
            TextView textView = ocVar.f27636c;
            textView.setText(string2);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            X.b(ocVar, 5000).j();
        }
    }

    public final void s(boolean z10) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(this.currentAccount).getStoriesController().B;
        sg.q0 q0Var = this.f3208b;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.f3209c = true;
            q0Var.b(LocaleController.getString(R.string.StealthModeIsActive), true, z10);
            q0Var.e.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
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
                q0Var.b(LocaleController.formatString("AvailableIn", R.string.AvailableIn, sb2.toString()), true, z10);
                q0Var.e.setTextColor(i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false), 125));
                a3.d dVar = this.f3210f;
                AndroidUtilities.cancelRunOnUIThread(dVar);
                AndroidUtilities.runOnUIThread(dVar, 1000L);
                return;
            }
        }
        int i12 = this.d;
        if (i12 == 0) {
            q0Var.b(LocaleController.getString(R.string.EnableStealthMode), true, z10);
        } else if (i12 == 1) {
            q0Var.b(LocaleController.getString(R.string.EnableStealthModeAndOpenStory), true, z10);
        }
        q0Var.e.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
    }
}
