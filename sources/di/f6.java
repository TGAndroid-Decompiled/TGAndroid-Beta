package di;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pw;
public final class f6 extends org.telegram.ui.ActionBar.k3 {
    public static final int h = 0;
    public final tg.p0 f8558b;
    public boolean f8559c;
    public final int d;
    public pw e;
    public final bi.u6 f8560f;

    public f6(Context context, float f7, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, false);
        this.f8560f = new bi.u6(this, 22);
        this.d = i10;
        e6 e6Var = new e6(this, getContext(), f7);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int dp = AndroidUtilities.dp(80.0f);
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        imageView.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(imageView, K, N, null, null);
        imageView.setImageResource(R.drawable.large_stealth);
        e6Var.addView(imageView, gb1.h(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        e6Var.addView(linearLayout, gb1.h(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        ic.a.o(20.0f, 1, textView);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var);
        textView.setText(LocaleController.getString(R.string.StealthModeTitle));
        linearLayout.addView(textView, gb1.u(-2, -2, 1));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(getContext());
        b6Var.setTextSize(14);
        b6Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        b6Var.setMaxLines(100);
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.f23748y6, u6Var);
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            b6Var.l(LocaleController.getString(R.string.StealthModeHint), false);
        } else {
            b6Var.l(LocaleController.getString(R.string.StealthModePremiumHint), false);
        }
        linearLayout.addView(b6Var, gb1.x(-2, -2, 1, 36, 10, 36, 0));
        bi.t1 t1Var = new bi.t1(this, getContext());
        ((ImageView) t1Var.d).setImageResource(R.drawable.msg_stealth_5min);
        ((TextView) t1Var.f5437b).setText(LocaleController.getString(R.string.HideRecentViews));
        ((TextView) t1Var.f5438c).setText(LocaleController.getString(R.string.HideRecentViewsDescription));
        linearLayout.addView(t1Var, gb1.x(-1, -2, 0, 0, 20, 0, 0));
        bi.t1 t1Var2 = new bi.t1(this, getContext());
        ((ImageView) t1Var2.d).setImageResource(R.drawable.msg_stealth_25min);
        ((TextView) t1Var2.f5437b).setText(LocaleController.getString(R.string.HideNextViews));
        ((TextView) t1Var2.f5438c).setText(LocaleController.getString(R.string.HideNextViewsDescription));
        linearLayout.addView(t1Var2, gb1.x(-1, -2, 0, 0, 10, 0, 0));
        tg.p0 p0Var = new tg.p0(AndroidUtilities.dp(8.0f), context, u6Var, true);
        this.f8558b = p0Var;
        p0Var.J = false;
        p0Var.h.getDrawable().D = false;
        p0Var.setIcon(R.raw.unlock_icon);
        gb1.b(p0Var);
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (!currentUser.premium) {
            p0Var.setIcon(R.raw.unlock_icon);
            p0Var.a(LocaleController.getString(R.string.UnlockStealthMode), new ai.s(this, 15), false);
        } else {
            q(false);
        }
        linearLayout.addView(p0Var, gb1.x(-1, 48, 80, 14, 24, 14, 16));
        setCustomView(e6Var);
        p0Var.setOnClickListener(new c6(this, currentUser, i10, u6Var, 0));
    }

    public static void m(f6 f6Var, TLRPC.User user, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        if (!user.premium) {
            f6Var.dismiss();
            org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
            if (R != null) {
                R.showDialog(new tg.y0(R, 14, false));
            }
        } else if (f6Var.f8559c) {
            f6Var.dismiss();
            pw pwVar = f6Var.e;
            if (pwVar != null) {
                pwVar.a(false);
            }
        } else {
            h7 storiesController = MessagesController.getInstance(f6Var.currentAccount).getStoriesController();
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = storiesController.B;
            if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(f6Var.currentAccount).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                if (f6Var.f8559c) {
                    f6Var.dismiss();
                    pw pwVar2 = f6Var.e;
                    if (pwVar2 != null) {
                        pwVar2.a(false);
                        return;
                    }
                    return;
                }
                new wc(f6Var.container, u6Var).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.StealthModeCooldownHint)), null).k(true);
                return;
            }
            TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
            tL_stories_activateStealthMode.future = true;
            tL_stories_activateStealthMode.past = true;
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
            tL_storiesStealthMode2.flags |= 3;
            tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(f6Var.currentAccount).getCurrentTime() + MessagesController.getInstance(f6Var.currentAccount).stealthModeCooldown;
            tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(f6Var.currentAccount).getCurrentTime() + MessagesController.getInstance(f6Var.currentAccount).stealthModeFuture;
            storiesController.f0(tL_storiesStealthMode2);
            ConnectionsManager.getInstance(f6Var.currentAccount).sendRequest(tL_stories_activateStealthMode, new d6(0));
            try {
                f6Var.containerView.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            f6Var.dismiss();
            if (i10 == 0) {
                p();
            }
            pw pwVar3 = f6Var.e;
            if (pwVar3 != null) {
                pwVar3.a(true);
            }
        }
    }

    public static void p() {
        wc Y;
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (R.getLastStoryViewer() != null) {
            Y = new wc(R.getLastStoryViewer().f9456s, R.getLastStoryViewer().f9470y);
        } else {
            Y = wc.Y();
        }
        if (Y != null) {
            int i10 = R.drawable.msg_stories_stealth2;
            String string = LocaleController.getString(R.string.StealthModeOn);
            String string2 = LocaleController.getString(R.string.StealthModeOnHint);
            mc mcVar = new mc(Y.X(), Y.f34410c);
            mcVar.f30519a.setImageResource(i10);
            mcVar.f30520b.setText(string);
            TextView textView = mcVar.f30521c;
            textView.setText(string2);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            Y.b(mcVar, 5000).j();
        }
    }

    public final void q(boolean z10) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(this.currentAccount).getStoriesController().B;
        tg.p0 p0Var = this.f8558b;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.f8559c = true;
            p0Var.b(LocaleController.getString(R.string.StealthModeIsActive), true, z10);
            org.telegram.ui.ActionBar.f7.Z(p0Var.h, org.telegram.ui.ActionBar.y6.Sh, null);
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
                p0Var.b(LocaleController.formatString("AvailableIn", R.string.AvailableIn, sb2.toString()), true, z10);
                tg.o0 o0Var = p0Var.h;
                org.telegram.ui.ActionBar.b7 h10 = org.telegram.ui.ActionBar.f7.h(org.telegram.ui.ActionBar.y6.Sh, 125);
                org.telegram.ui.ActionBar.f7.n(o0Var, h10.f22485a, -1, 1, h10.d, null);
                bi.u6 u6Var = this.f8560f;
                AndroidUtilities.cancelRunOnUIThread(u6Var);
                AndroidUtilities.runOnUIThread(u6Var, 1000L);
                return;
            }
        }
        int i12 = this.d;
        if (i12 == 0) {
            p0Var.b(LocaleController.getString(R.string.EnableStealthMode), true, z10);
        } else if (i12 == 1) {
            p0Var.b(LocaleController.getString(R.string.EnableStealthModeAndOpenStory), true, z10);
        }
        org.telegram.ui.ActionBar.f7.Z(p0Var.h, org.telegram.ui.ActionBar.y6.Sh, null);
    }
}
