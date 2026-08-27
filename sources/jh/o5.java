package jh;

import android.content.Context;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import hh.y9;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xw;

public final class o5 extends org.telegram.ui.ActionBar.e3 {
    public static final int h = 0;

    public final ag.s1 f13748b;

    public boolean f13749c;
    public final int d;

    public xw f13750e;

    public final y9 f13751f;

    public o5(Context context, float f10, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        this.f13751f = new y9(this, 16);
        this.d = i10;
        n5 n5Var = new n5(this, getContext(), f10);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false)));
        imageView.setImageResource(R.drawable.large_stealth);
        n5Var.addView(imageView, h7.z5.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        n5Var.addView(linearLayout, h7.z5.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        pa.m(20.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        textView.setText(LocaleController.getString(R.string.StealthModeTitle));
        linearLayout.addView(textView, h7.z5.q(-2, -2, 1));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        h5Var.setTextSize(14);
        h5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        h5Var.setMaxLines(100);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var));
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            h5Var.l(LocaleController.getString(R.string.StealthModeHint), false);
        } else {
            h5Var.l(LocaleController.getString(R.string.StealthModePremiumHint), false);
        }
        linearLayout.addView(h5Var, h7.z5.t(-2, -2, 1, 36, 10, 36, 0));
        hh.h1 h1Var = new hh.h1(this, getContext());
        ((ImageView) h1Var.d).setImageResource(R.drawable.msg_stealth_5min);
        ((TextView) h1Var.f9370b).setText(LocaleController.getString(R.string.HideRecentViews));
        ((TextView) h1Var.f9371c).setText(LocaleController.getString(R.string.HideRecentViewsDescription));
        linearLayout.addView(h1Var, h7.z5.t(-1, -2, 0, 0, 20, 0, 0));
        hh.h1 h1Var2 = new hh.h1(this, getContext());
        ((ImageView) h1Var2.d).setImageResource(R.drawable.msg_stealth_25min);
        ((TextView) h1Var2.f9370b).setText(LocaleController.getString(R.string.HideNextViews));
        ((TextView) h1Var2.f9371c).setText(LocaleController.getString(R.string.HideNextViewsDescription));
        linearLayout.addView(h1Var2, h7.z5.t(-1, -2, 0, 0, 10, 0, 0));
        ag.s1 s1Var = new ag.s1(AndroidUtilities.dp(8.0f), context, c6Var, true);
        this.f13748b = s1Var;
        s1Var.D = false;
        s1Var.f644e.getDrawable().f29259y = false;
        s1Var.setIcon(R.raw.unlock_icon);
        h7.b6.a(s1Var);
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (currentUser.premium) {
            r(false);
        } else {
            s1Var.setIcon(R.raw.unlock_icon);
            s1Var.a(LocaleController.getString(R.string.UnlockStealthMode), new ag.w0(this, 23), false);
        }
        linearLayout.addView(s1Var, h7.z5.t(-1, 48, 80, 14, 24, 14, 16));
        setCustomView(n5Var);
        s1Var.setOnClickListener(new l5(this, currentUser, i10, c6Var, 0));
    }

    public static void m(o5 o5Var, TLRPC.User user, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        if (!user.premium) {
            o5Var.dismiss();
            org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
            if (n2VarR != null) {
                n2VarR.showDialog(new ag.g2(n2VarR, 14, false));
                return;
            }
            return;
        }
        if (o5Var.f13749c) {
            o5Var.dismiss();
            xw xwVar = o5Var.f13750e;
            if (xwVar != null) {
                xwVar.a(false);
                return;
            }
            return;
        }
        s6 storiesController = MessagesController.getInstance(o5Var.currentAccount).getStoriesController();
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = storiesController.B;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(o5Var.currentAccount).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
            if (!o5Var.f13749c) {
                new mc(o5Var.container, c6Var).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.StealthModeCooldownHint)), null).k(true);
                return;
            }
            o5Var.dismiss();
            xw xwVar2 = o5Var.f13750e;
            if (xwVar2 != null) {
                xwVar2.a(false);
                return;
            }
            return;
        }
        TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
        tL_stories_activateStealthMode.future = true;
        tL_stories_activateStealthMode.past = true;
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
        tL_storiesStealthMode2.flags |= 3;
        tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(o5Var.currentAccount).getCurrentTime() + MessagesController.getInstance(o5Var.currentAccount).stealthModeCooldown;
        tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(o5Var.currentAccount).getCurrentTime() + MessagesController.getInstance(o5Var.currentAccount).stealthModeFuture;
        storiesController.f0(tL_storiesStealthMode2);
        ConnectionsManager.getInstance(o5Var.currentAccount).sendRequest(tL_stories_activateStealthMode, new m5(0));
        try {
            o5Var.containerView.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        o5Var.dismiss();
        if (i10 == 0) {
            q();
        }
        xw xwVar3 = o5Var.f13750e;
        if (xwVar3 != null) {
            xwVar3.a(true);
        }
    }

    public static void q() {
        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
        mc mcVar = n2VarR.getLastStoryViewer() != null ? new mc(n2VarR.getLastStoryViewer().f13505s, n2VarR.getLastStoryViewer().f13515y) : mc.X();
        if (mcVar != null) {
            int i10 = R.drawable.msg_stories_stealth2;
            String string = LocaleController.getString(R.string.StealthModeOn);
            String string2 = LocaleController.getString(R.string.StealthModeOnHint);
            ac acVar = new ac(mcVar.W(), mcVar.f30645c);
            acVar.f26723a.setImageResource(i10);
            acVar.f26724b.setText(string);
            TextView textView = acVar.f26725c;
            textView.setText(string2);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            mcVar.b(acVar, 5000).j();
        }
    }

    public final void r(boolean z10) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(this.currentAccount).getStoriesController().B;
        ag.s1 s1Var = this.f13748b;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.f13749c = true;
            s1Var.c(LocaleController.getString(R.string.StealthModeIsActive), true, z10);
            s1Var.f644e.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
            return;
        }
        if (tL_storiesStealthMode != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            int i10 = tL_storiesStealthMode.cooldown_until_date;
            if (currentTime <= i10) {
                long currentTime2 = i10 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                int i11 = (int) (currentTime2 % 60);
                long j10 = currentTime2 / 60;
                int i12 = (int) (j10 % 60);
                int i13 = (int) (j10 / 60);
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf(i13)));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i12)));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i11)));
                s1Var.c(LocaleController.formatString("AvailableIn", R.string.AvailableIn, sb2.toString()), true, z10);
                s1Var.f644e.setTextColor(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false), 125));
                y9 y9Var = this.f13751f;
                AndroidUtilities.cancelRunOnUIThread(y9Var);
                AndroidUtilities.runOnUIThread(y9Var, 1000L);
                return;
            }
        }
        int i14 = this.d;
        if (i14 == 0) {
            s1Var.c(LocaleController.getString(R.string.EnableStealthMode), true, z10);
        } else if (i14 == 1) {
            s1Var.c(LocaleController.getString(R.string.EnableStealthModeAndOpenStory), true, z10);
        }
        s1Var.f644e.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
    }
}
