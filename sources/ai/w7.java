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
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.kx;
public final class w7 extends org.telegram.ui.ActionBar.f3 {
    public static final int h = 0;
    public final rg.p0 f1658b;
    public boolean f1659c;
    public final int d;
    public kx e;
    public final a3.d f1660f;

    public w7(Context context, float f7, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        this.f1660f = new a3.d(this, 11);
        this.d = i10;
        u7 u7Var = new u7(this, getContext(), f7);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Oh, false)));
        imageView.setImageResource(R.drawable.large_stealth);
        u7Var.addView(imageView, w7.x5.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        u7Var.addView(linearLayout, w7.x5.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        textView.setText(LocaleController.getString(R.string.StealthModeTitle));
        linearLayout.addView(textView, w7.x5.q(-2, -2, 1));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
        j5Var.setTextSize(14);
        j5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        j5Var.setMaxLines(100);
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19215y6, e6Var));
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            j5Var.l(LocaleController.getString(R.string.StealthModeHint), false);
        } else {
            j5Var.l(LocaleController.getString(R.string.StealthModePremiumHint), false);
        }
        linearLayout.addView(j5Var, w7.x5.t(-2, -2, 1, 36, 10, 36, 0));
        v7 v7Var = new v7(this, getContext());
        ((ImageView) v7Var.d).setImageResource(R.drawable.msg_stealth_5min);
        ((TextView) v7Var.f1611b).setText(LocaleController.getString(R.string.HideRecentViews));
        ((TextView) v7Var.f1612c).setText(LocaleController.getString(R.string.HideRecentViewsDescription));
        linearLayout.addView(v7Var, w7.x5.t(-1, -2, 0, 0, 20, 0, 0));
        v7 v7Var2 = new v7(this, getContext());
        ((ImageView) v7Var2.d).setImageResource(R.drawable.msg_stealth_25min);
        ((TextView) v7Var2.f1611b).setText(LocaleController.getString(R.string.HideNextViews));
        ((TextView) v7Var2.f1612c).setText(LocaleController.getString(R.string.HideNextViewsDescription));
        linearLayout.addView(v7Var2, w7.x5.t(-1, -2, 0, 0, 10, 0, 0));
        rg.p0 p0Var = new rg.p0(AndroidUtilities.dp(8.0f), context, e6Var, true);
        this.f1658b = p0Var;
        p0Var.H = false;
        p0Var.e.getDrawable().f26104y = false;
        p0Var.setIcon(R.raw.unlock_icon);
        w7.z5.a(p0Var);
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (!currentUser.premium) {
            p0Var.setIcon(R.raw.unlock_icon);
            p0Var.a(LocaleController.getString(R.string.UnlockStealthMode), new v0(this, 2), false);
        } else {
            q(false);
        }
        linearLayout.addView(p0Var, w7.x5.t(-1, 48, 80, 14, 24, 14, 16));
        setCustomView(u7Var);
        p0Var.setOnClickListener(new s7(this, currentUser, i10, e6Var, 0));
    }

    public static void m(w7 w7Var, TLRPC.User user, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        if (!user.premium) {
            w7Var.dismiss();
            org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
            if (R != null) {
                R.showDialog(new rg.x0(R, 14, false));
            }
        } else if (w7Var.f1659c) {
            w7Var.dismiss();
            kx kxVar = w7Var.e;
            if (kxVar != null) {
                kxVar.a(false);
            }
        } else {
            l9 storiesController = MessagesController.getInstance(w7Var.currentAccount).getStoriesController();
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = storiesController.B;
            if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(w7Var.currentAccount).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                if (w7Var.f1659c) {
                    w7Var.dismiss();
                    kx kxVar2 = w7Var.e;
                    if (kxVar2 != null) {
                        kxVar2.a(false);
                        return;
                    }
                    return;
                }
                new vc(w7Var.container, e6Var).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.StealthModeCooldownHint)), null).k(true);
                return;
            }
            TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
            tL_stories_activateStealthMode.future = true;
            tL_stories_activateStealthMode.past = true;
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
            tL_storiesStealthMode2.flags |= 3;
            tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(w7Var.currentAccount).getCurrentTime() + MessagesController.getInstance(w7Var.currentAccount).stealthModeCooldown;
            tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(w7Var.currentAccount).getCurrentTime() + MessagesController.getInstance(w7Var.currentAccount).stealthModeFuture;
            storiesController.f0(tL_storiesStealthMode2);
            ConnectionsManager.getInstance(w7Var.currentAccount).sendRequest(tL_stories_activateStealthMode, new t7(0));
            try {
                w7Var.containerView.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            w7Var.dismiss();
            if (i10 == 0) {
                p();
            }
            kx kxVar3 = w7Var.e;
            if (kxVar3 != null) {
                kxVar3.a(true);
            }
        }
    }

    public static void p() {
        vc X;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R.getLastStoryViewer() != null) {
            X = new vc(R.getLastStoryViewer().f1104s, R.getLastStoryViewer().f1118y);
        } else {
            X = vc.X();
        }
        if (X != null) {
            int i10 = R.drawable.msg_stories_stealth2;
            String string = LocaleController.getString(R.string.StealthModeOn);
            String string2 = LocaleController.getString(R.string.StealthModeOnHint);
            org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(X.W(), X.f28687c);
            kcVar.f25583a.setImageResource(i10);
            kcVar.f25584b.setText(string);
            TextView textView = kcVar.f25585c;
            textView.setText(string2);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            X.b(kcVar, 5000).j();
        }
    }

    public final void q(boolean z10) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(this.currentAccount).getStoriesController().B;
        rg.p0 p0Var = this.f1658b;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.f1659c = true;
            p0Var.b(LocaleController.getString(R.string.StealthModeIsActive), true, z10);
            p0Var.e.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
            return;
        }
        if (tL_storiesStealthMode != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            int i10 = tL_storiesStealthMode.cooldown_until_date;
            if (currentTime <= i10) {
                long currentTime2 = i10 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                int i11 = (int) (currentTime2 % 60);
                long j3 = currentTime2 / 60;
                int i12 = (int) (j3 / 60);
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf(i12)));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf((int) (j3 % 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i11)));
                p0Var.b(LocaleController.formatString("AvailableIn", R.string.AvailableIn, sb2.toString()), true, z10);
                p0Var.e.setTextColor(i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false), 125));
                a3.d dVar = this.f1660f;
                AndroidUtilities.cancelRunOnUIThread(dVar);
                AndroidUtilities.runOnUIThread(dVar, 1000L);
                return;
            }
        }
        int i13 = this.d;
        if (i13 == 0) {
            p0Var.b(LocaleController.getString(R.string.EnableStealthMode), true, z10);
        } else if (i13 == 1) {
            p0Var.b(LocaleController.getString(R.string.EnableStealthModeAndOpenStory), true, z10);
        }
        p0Var.e.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
    }
}
