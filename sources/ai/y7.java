package ai;

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
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lx;
public final class y7 extends org.telegram.ui.ActionBar.e3 {
    public static final int h = 0;
    public final rg.q0 f1947b;
    public boolean f1948c;
    public final int d;
    public lx f1949e;
    public final a3.d f1950f;

    public y7(Context context, float f7, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, false);
        this.f1950f = new a3.d(this, 11);
        this.d = i10;
        w7 w7Var = new w7(this, getContext(), f7);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false)));
        imageView.setImageResource(R.drawable.large_stealth);
        w7Var.addView(imageView, w7.w5.a(80.0f, 0.0f, 18.0f, 0.0f, 0.0f, 80, 1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        w7Var.addView(linearLayout, w7.w5.a(-2.0f, 0.0f, 116.0f, 0.0f, 0.0f, -1, 0));
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, c6Var));
        textView.setText(LocaleController.getString(R.string.StealthModeTitle));
        linearLayout.addView(textView, w7.w5.q(-2, -2, 1));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        h5Var.setTextSize(14);
        h5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        h5Var.setMaxLines(100);
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20945y6, c6Var));
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            h5Var.l(LocaleController.getString(R.string.StealthModeHint), false);
        } else {
            h5Var.l(LocaleController.getString(R.string.StealthModePremiumHint), false);
        }
        linearLayout.addView(h5Var, w7.w5.t(-2, -2, 1, 36, 10, 36, 0));
        x7 x7Var = new x7(this, getContext());
        ((ImageView) x7Var.d).setImageResource(R.drawable.msg_stealth_5min);
        ((TextView) x7Var.f1909b).setText(LocaleController.getString(R.string.HideRecentViews));
        ((TextView) x7Var.f1910c).setText(LocaleController.getString(R.string.HideRecentViewsDescription));
        linearLayout.addView(x7Var, w7.w5.t(-1, -2, 0, 0, 20, 0, 0));
        x7 x7Var2 = new x7(this, getContext());
        ((ImageView) x7Var2.d).setImageResource(R.drawable.msg_stealth_25min);
        ((TextView) x7Var2.f1909b).setText(LocaleController.getString(R.string.HideNextViews));
        ((TextView) x7Var2.f1910c).setText(LocaleController.getString(R.string.HideNextViewsDescription));
        linearLayout.addView(x7Var2, w7.w5.t(-1, -2, 0, 0, 10, 0, 0));
        rg.q0 q0Var = new rg.q0(AndroidUtilities.dp(8.0f), context, c6Var, true);
        this.f1947b = q0Var;
        q0Var.H = false;
        q0Var.f47612e.getDrawable().D = false;
        q0Var.setIcon(R.raw.unlock_icon);
        w7.y5.a(q0Var);
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (!currentUser.premium) {
            q0Var.setIcon(R.raw.unlock_icon);
            q0Var.a(LocaleController.getString(R.string.UnlockStealthMode), new v0(this, 2), false);
        } else {
            s(false);
        }
        linearLayout.addView(q0Var, w7.w5.t(-1, 48, 80, 14, 24, 14, 16));
        setCustomView(w7Var);
        q0Var.setOnClickListener(new u7(this, currentUser, i10, c6Var, 0));
    }

    public static void o(y7 y7Var, TLRPC.User user, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        if (!user.premium) {
            y7Var.dismiss();
            org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
            if (R != null) {
                R.showDialog(new rg.y0(R, 14, false));
            }
        } else if (y7Var.f1948c) {
            y7Var.dismiss();
            lx lxVar = y7Var.f1949e;
            if (lxVar != null) {
                lxVar.a(false);
            }
        } else {
            m9 storiesController = MessagesController.getInstance(y7Var.currentAccount).getStoriesController();
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = storiesController.B;
            if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(y7Var.currentAccount).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                if (y7Var.f1948c) {
                    y7Var.dismiss();
                    lx lxVar2 = y7Var.f1949e;
                    if (lxVar2 != null) {
                        lxVar2.a(false);
                        return;
                    }
                    return;
                }
                new zc(y7Var.container, c6Var).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.StealthModeCooldownHint)), null).k(true);
                return;
            }
            TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
            tL_stories_activateStealthMode.future = true;
            tL_stories_activateStealthMode.past = true;
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
            tL_storiesStealthMode2.flags |= 3;
            tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(y7Var.currentAccount).getCurrentTime() + MessagesController.getInstance(y7Var.currentAccount).stealthModeCooldown;
            tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(y7Var.currentAccount).getCurrentTime() + MessagesController.getInstance(y7Var.currentAccount).stealthModeFuture;
            storiesController.f0(tL_storiesStealthMode2);
            ConnectionsManager.getInstance(y7Var.currentAccount).sendRequest(tL_stories_activateStealthMode, new v7(0));
            try {
                y7Var.containerView.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            y7Var.dismiss();
            if (i10 == 0) {
                r();
            }
            lx lxVar3 = y7Var.f1949e;
            if (lxVar3 != null) {
                lxVar3.a(true);
            }
        }
    }

    public static void r() {
        zc X;
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R.getLastStoryViewer() != null) {
            X = new zc(R.getLastStoryViewer().f1292s, R.getLastStoryViewer().f1306y);
        } else {
            X = zc.X();
        }
        if (X != null) {
            int i10 = R.drawable.msg_stories_stealth2;
            String string = LocaleController.getString(R.string.StealthModeOn);
            String string2 = LocaleController.getString(R.string.StealthModeOnHint);
            org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(X.W(), X.f33323c);
            ocVar.f29138a.setImageResource(i10);
            ocVar.f29139b.setText(string);
            TextView textView = ocVar.f29140c;
            textView.setText(string2);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            X.b(ocVar, 5000).j();
        }
    }

    public final void s(boolean z10) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(this.currentAccount).getStoriesController().B;
        rg.q0 q0Var = this.f1947b;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.f1948c = true;
            q0Var.b(LocaleController.getString(R.string.StealthModeIsActive), true, z10);
            q0Var.f47612e.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
            return;
        }
        if (tL_storiesStealthMode != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            int i10 = tL_storiesStealthMode.cooldown_until_date;
            if (currentTime <= i10) {
                long currentTime2 = i10 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                int i11 = (int) (currentTime2 % 60);
                long j3 = currentTime2 / 60;
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf((int) (j3 / 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf((int) (j3 % 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i11)));
                q0Var.b(LocaleController.formatString("AvailableIn", R.string.AvailableIn, sb2.toString()), true, z10);
                q0Var.f47612e.setTextColor(i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false), 125));
                a3.d dVar = this.f1950f;
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
        q0Var.f47612e.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
    }
}
