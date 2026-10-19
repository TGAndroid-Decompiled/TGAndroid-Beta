package ci;

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
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sw;
public final class g6 extends org.telegram.ui.ActionBar.f3 {
    public static final int h = 0;
    public final sg.q0 f5419b;
    public boolean f5420c;
    public final int d;
    public sw e;
    public final androidx.fragment.app.d f5421f;

    public g6(Context context, float f7, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        this.f5421f = new androidx.fragment.app.d(this, 15);
        this.d = i10;
        f6 f6Var = new f6(this, getContext(), f7);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false)));
        imageView.setImageResource(R.drawable.large_stealth);
        f6Var.addView(imageView, w7.z5.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        f6Var.addView(linearLayout, w7.z5.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.play_billing.k3.m(20.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        textView.setText(LocaleController.getString(R.string.StealthModeTitle));
        linearLayout.addView(textView, w7.z5.q(-2, -2, 1));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
        j5Var.setTextSize(14);
        j5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        j5Var.setMaxLines(100);
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21375y6, d6Var));
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            j5Var.l(LocaleController.getString(R.string.StealthModeHint), false);
        } else {
            j5Var.l(LocaleController.getString(R.string.StealthModePremiumHint), false);
        }
        linearLayout.addView(j5Var, w7.z5.t(-2, -2, 1, 36, 10, 36, 0));
        ai.w1 w1Var = new ai.w1(this, getContext());
        ((ImageView) w1Var.d).setImageResource(R.drawable.msg_stealth_5min);
        ((TextView) w1Var.f2341b).setText(LocaleController.getString(R.string.HideRecentViews));
        ((TextView) w1Var.f2342c).setText(LocaleController.getString(R.string.HideRecentViewsDescription));
        linearLayout.addView(w1Var, w7.z5.t(-1, -2, 0, 0, 20, 0, 0));
        ai.w1 w1Var2 = new ai.w1(this, getContext());
        ((ImageView) w1Var2.d).setImageResource(R.drawable.msg_stealth_25min);
        ((TextView) w1Var2.f2341b).setText(LocaleController.getString(R.string.HideNextViews));
        ((TextView) w1Var2.f2342c).setText(LocaleController.getString(R.string.HideNextViewsDescription));
        linearLayout.addView(w1Var2, w7.z5.t(-1, -2, 0, 0, 10, 0, 0));
        sg.q0 q0Var = new sg.q0(AndroidUtilities.dp(8.0f), context, d6Var, true);
        this.f5419b = q0Var;
        q0Var.H = false;
        q0Var.e.getDrawable().D = false;
        q0Var.setIcon(R.raw.unlock_icon);
        w7.b6.a(q0Var);
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (!currentUser.premium) {
            q0Var.setIcon(R.raw.unlock_icon);
            q0Var.a(LocaleController.getString(R.string.UnlockStealthMode), new ah.g0(this, 14), false);
        } else {
            s(false);
        }
        linearLayout.addView(q0Var, w7.z5.t(-1, 48, 80, 14, 24, 14, 16));
        setCustomView(f6Var);
        q0Var.setOnClickListener(new d6(i10, 0, this, currentUser, d6Var));
    }

    public static void n(g6 g6Var, TLRPC.User user, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        if (!user.premium) {
            g6Var.dismiss();
            org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
            if (R != null) {
                R.showDialog(new sg.y0(R, 14, false));
            }
        } else if (g6Var.f5420c) {
            g6Var.dismiss();
            sw swVar = g6Var.e;
            if (swVar != null) {
                swVar.a(false);
            }
        } else {
            i7 storiesController = MessagesController.getInstance(g6Var.currentAccount).getStoriesController();
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = storiesController.B;
            if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(g6Var.currentAccount).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                if (g6Var.f5420c) {
                    g6Var.dismiss();
                    sw swVar2 = g6Var.e;
                    if (swVar2 != null) {
                        swVar2.a(false);
                        return;
                    }
                    return;
                }
                new xc(g6Var.container, d6Var).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.StealthModeCooldownHint)), null).k(true);
                return;
            }
            TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
            tL_stories_activateStealthMode.future = true;
            tL_stories_activateStealthMode.past = true;
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
            tL_storiesStealthMode2.flags |= 3;
            tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(g6Var.currentAccount).getCurrentTime() + MessagesController.getInstance(g6Var.currentAccount).stealthModeCooldown;
            tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(g6Var.currentAccount).getCurrentTime() + MessagesController.getInstance(g6Var.currentAccount).stealthModeFuture;
            storiesController.f0(tL_storiesStealthMode2);
            ConnectionsManager.getInstance(g6Var.currentAccount).sendRequest(tL_stories_activateStealthMode, new e6(0));
            try {
                g6Var.containerView.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            g6Var.dismiss();
            if (i10 == 0) {
                q();
            }
            sw swVar3 = g6Var.e;
            if (swVar3 != null) {
                swVar3.a(true);
            }
        }
    }

    public static void q() {
        xc X;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R.getLastStoryViewer() != null) {
            X = new xc(R.getLastStoryViewer().f5214s, R.getLastStoryViewer().f5228y);
        } else {
            X = xc.X();
        }
        if (X != null) {
            int i10 = R.drawable.msg_stories_stealth2;
            String string = LocaleController.getString(R.string.StealthModeOn);
            String string2 = LocaleController.getString(R.string.StealthModeOnHint);
            mc mcVar = new mc(X.W(), X.f32364c);
            mcVar.f28507a.setImageResource(i10);
            mcVar.f28508b.setText(string);
            TextView textView = mcVar.f28509c;
            textView.setText(string2);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            X.b(mcVar, 5000).j();
        }
    }

    public final void s(boolean z10) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(this.currentAccount).getStoriesController().B;
        sg.q0 q0Var = this.f5419b;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.f5420c = true;
            q0Var.b(LocaleController.getString(R.string.StealthModeIsActive), true, z10);
            q0Var.e.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
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
                q0Var.e.setTextColor(i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false), 125));
                androidx.fragment.app.d dVar = this.f5421f;
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
        q0Var.e.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
    }
}
