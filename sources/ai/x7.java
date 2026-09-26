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
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gx;
public final class x7 extends org.telegram.ui.ActionBar.e3 {
    public static final int h = 0;
    public final rg.p0 f1695b;
    public boolean f1696c;
    public final int d;
    public gx e;
    public final a3.d f1697f;

    public x7(Context context, float f7, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        this.f1697f = new a3.d(this, 11);
        this.d = i10;
        v7 v7Var = new v7(this, getContext(), f7);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false)));
        imageView.setImageResource(R.drawable.large_stealth);
        v7Var.addView(imageView, w7.y5.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        v7Var.addView(linearLayout, w7.y5.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        textView.setText(LocaleController.getString(R.string.StealthModeTitle));
        linearLayout.addView(textView, w7.y5.q(-2, -2, 1));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        h5Var.setTextSize(14);
        h5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        h5Var.setMaxLines(100);
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19442y6, d6Var));
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            h5Var.l(LocaleController.getString(R.string.StealthModeHint), false);
        } else {
            h5Var.l(LocaleController.getString(R.string.StealthModePremiumHint), false);
        }
        linearLayout.addView(h5Var, w7.y5.t(-2, -2, 1, 36, 10, 36, 0));
        w7 w7Var = new w7(this, getContext());
        ((ImageView) w7Var.d).setImageResource(R.drawable.msg_stealth_5min);
        ((TextView) w7Var.f1657b).setText(LocaleController.getString(R.string.HideRecentViews));
        ((TextView) w7Var.f1658c).setText(LocaleController.getString(R.string.HideRecentViewsDescription));
        linearLayout.addView(w7Var, w7.y5.t(-1, -2, 0, 0, 20, 0, 0));
        w7 w7Var2 = new w7(this, getContext());
        ((ImageView) w7Var2.d).setImageResource(R.drawable.msg_stealth_25min);
        ((TextView) w7Var2.f1657b).setText(LocaleController.getString(R.string.HideNextViews));
        ((TextView) w7Var2.f1658c).setText(LocaleController.getString(R.string.HideNextViewsDescription));
        linearLayout.addView(w7Var2, w7.y5.t(-1, -2, 0, 0, 10, 0, 0));
        rg.p0 p0Var = new rg.p0(AndroidUtilities.dp(8.0f), context, d6Var, true);
        this.f1695b = p0Var;
        p0Var.H = false;
        p0Var.e.getDrawable().f26981y = false;
        p0Var.setIcon(R.raw.unlock_icon);
        w7.a6.a(p0Var);
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (!currentUser.premium) {
            p0Var.setIcon(R.raw.unlock_icon);
            p0Var.a(LocaleController.getString(R.string.UnlockStealthMode), new v0(this, 2), false);
        } else {
            q(false);
        }
        linearLayout.addView(p0Var, w7.y5.t(-1, 48, 80, 14, 24, 14, 16));
        setCustomView(v7Var);
        p0Var.setOnClickListener(new t7(this, currentUser, i10, d6Var, 0));
    }

    public static void m(x7 x7Var, TLRPC.User user, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        if (!user.premium) {
            x7Var.dismiss();
            org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
            if (R != null) {
                R.showDialog(new rg.x0(R, 14, false));
            }
        } else if (x7Var.f1696c) {
            x7Var.dismiss();
            gx gxVar = x7Var.e;
            if (gxVar != null) {
                gxVar.a(false);
            }
        } else {
            l9 storiesController = MessagesController.getInstance(x7Var.currentAccount).getStoriesController();
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = storiesController.B;
            if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(x7Var.currentAccount).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                if (x7Var.f1696c) {
                    x7Var.dismiss();
                    gx gxVar2 = x7Var.e;
                    if (gxVar2 != null) {
                        gxVar2.a(false);
                        return;
                    }
                    return;
                }
                new xc(x7Var.container, d6Var).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.StealthModeCooldownHint)), null).k(true);
                return;
            }
            TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
            tL_stories_activateStealthMode.future = true;
            tL_stories_activateStealthMode.past = true;
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
            tL_storiesStealthMode2.flags |= 3;
            tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(x7Var.currentAccount).getCurrentTime() + MessagesController.getInstance(x7Var.currentAccount).stealthModeCooldown;
            tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(x7Var.currentAccount).getCurrentTime() + MessagesController.getInstance(x7Var.currentAccount).stealthModeFuture;
            storiesController.f0(tL_storiesStealthMode2);
            ConnectionsManager.getInstance(x7Var.currentAccount).sendRequest(tL_stories_activateStealthMode, new u7(0));
            try {
                x7Var.containerView.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            x7Var.dismiss();
            if (i10 == 0) {
                p();
            }
            gx gxVar3 = x7Var.e;
            if (gxVar3 != null) {
                gxVar3.a(true);
            }
        }
    }

    public static void p() {
        xc X;
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R.getLastStoryViewer() != null) {
            X = new xc(R.getLastStoryViewer().f1098s, R.getLastStoryViewer().f1112y);
        } else {
            X = xc.X();
        }
        if (X != null) {
            int i10 = R.drawable.msg_stories_stealth2;
            String string = LocaleController.getString(R.string.StealthModeOn);
            String string2 = LocaleController.getString(R.string.StealthModeOnHint);
            org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(X.W(), X.f30327c);
            mcVar.f26353a.setImageResource(i10);
            mcVar.f26354b.setText(string);
            TextView textView = mcVar.f26355c;
            textView.setText(string2);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            X.b(mcVar, 5000).j();
        }
    }

    public final void q(boolean z10) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(this.currentAccount).getStoriesController().B;
        rg.p0 p0Var = this.f1695b;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.f1696c = true;
            p0Var.b(LocaleController.getString(R.string.StealthModeIsActive), true, z10);
            p0Var.e.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
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
                p0Var.e.setTextColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false), 125));
                a3.d dVar = this.f1697f;
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
        p0Var.e.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
    }
}
