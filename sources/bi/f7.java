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
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.kx;
public final class f7 extends org.telegram.ui.ActionBar.f3 {
    public static final int h = 0;
    public final sg.r0 f3002b;
    public boolean f3003c;
    public final int d;
    public kx f3004e;
    public final a3.d f3005f;

    public f7(Context context, float f7, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        this.f3005f = new a3.d(this, 21);
        this.d = i10;
        d7 d7Var = new d7(this, getContext(), f7);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false)));
        imageView.setImageResource(R.drawable.large_stealth);
        d7Var.addView(imageView, w7.x5.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        d7Var.addView(linearLayout, w7.x5.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.m(20.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        textView.setText(LocaleController.getString(R.string.StealthModeTitle));
        linearLayout.addView(textView, w7.x5.q(-2, -2, 1));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
        j5Var.setTextSize(14);
        j5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        j5Var.setMaxLines(100);
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21069y6, f6Var));
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            j5Var.l(LocaleController.getString(R.string.StealthModeHint), false);
        } else {
            j5Var.l(LocaleController.getString(R.string.StealthModePremiumHint), false);
        }
        linearLayout.addView(j5Var, w7.x5.t(-2, -2, 1, 36, 10, 36, 0));
        e7 e7Var = new e7(this, getContext());
        ((ImageView) e7Var.d).setImageResource(R.drawable.msg_stealth_5min);
        ((TextView) e7Var.f2942b).setText(LocaleController.getString(R.string.HideRecentViews));
        ((TextView) e7Var.f2943c).setText(LocaleController.getString(R.string.HideRecentViewsDescription));
        linearLayout.addView(e7Var, w7.x5.t(-1, -2, 0, 0, 20, 0, 0));
        e7 e7Var2 = new e7(this, getContext());
        ((ImageView) e7Var2.d).setImageResource(R.drawable.msg_stealth_25min);
        ((TextView) e7Var2.f2942b).setText(LocaleController.getString(R.string.HideNextViews));
        ((TextView) e7Var2.f2943c).setText(LocaleController.getString(R.string.HideNextViewsDescription));
        linearLayout.addView(e7Var2, w7.x5.t(-1, -2, 0, 0, 10, 0, 0));
        sg.r0 r0Var = new sg.r0(AndroidUtilities.dp(8.0f), context, f6Var, true);
        this.f3002b = r0Var;
        r0Var.H = false;
        r0Var.f46266e.getDrawable().f29332y = false;
        r0Var.setIcon(R.raw.unlock_icon);
        w7.z5.a(r0Var);
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (!currentUser.premium) {
            r0Var.setIcon(R.raw.unlock_icon);
            r0Var.a(LocaleController.getString(R.string.UnlockStealthMode), new ah.h0(this, 4), false);
        } else {
            q(false);
        }
        linearLayout.addView(r0Var, w7.x5.t(-1, 48, 80, 14, 24, 14, 16));
        setCustomView(d7Var);
        r0Var.setOnClickListener(new b7(this, currentUser, i10, f6Var, 0));
    }

    public static void m(f7 f7Var, TLRPC.User user, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        if (!user.premium) {
            f7Var.dismiss();
            org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
            if (R != null) {
                R.showDialog(new sg.a1(R, 14, false));
            }
        } else if (f7Var.f3003c) {
            f7Var.dismiss();
            kx kxVar = f7Var.f3004e;
            if (kxVar != null) {
                kxVar.a(false);
            }
        } else {
            u8 storiesController = MessagesController.getInstance(f7Var.currentAccount).getStoriesController();
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = storiesController.B;
            if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(f7Var.currentAccount).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                if (f7Var.f3003c) {
                    f7Var.dismiss();
                    kx kxVar2 = f7Var.f3004e;
                    if (kxVar2 != null) {
                        kxVar2.a(false);
                        return;
                    }
                    return;
                }
                new yc(f7Var.container, f6Var).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.StealthModeCooldownHint)), null).k(true);
                return;
            }
            TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
            tL_stories_activateStealthMode.future = true;
            tL_stories_activateStealthMode.past = true;
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
            tL_storiesStealthMode2.flags |= 3;
            tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(f7Var.currentAccount).getCurrentTime() + MessagesController.getInstance(f7Var.currentAccount).stealthModeCooldown;
            tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(f7Var.currentAccount).getCurrentTime() + MessagesController.getInstance(f7Var.currentAccount).stealthModeFuture;
            storiesController.f0(tL_storiesStealthMode2);
            ConnectionsManager.getInstance(f7Var.currentAccount).sendRequest(tL_stories_activateStealthMode, new c7(0));
            try {
                f7Var.containerView.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            f7Var.dismiss();
            if (i10 == 0) {
                p();
            }
            kx kxVar3 = f7Var.f3004e;
            if (kxVar3 != null) {
                kxVar3.a(true);
            }
        }
    }

    public static void p() {
        yc X;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R.getLastStoryViewer() != null) {
            X = new yc(R.getLastStoryViewer().f3599s, R.getLastStoryViewer().f3613y);
        } else {
            X = yc.X();
        }
        if (X != null) {
            int i10 = R.drawable.msg_stories_stealth2;
            String string = LocaleController.getString(R.string.StealthModeOn);
            String string2 = LocaleController.getString(R.string.StealthModeOnHint);
            mc mcVar = new mc(X.W(), X.f32910c);
            mcVar.f28459a.setImageResource(i10);
            mcVar.f28460b.setText(string);
            TextView textView = mcVar.f28461c;
            textView.setText(string2);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            X.b(mcVar, 5000).j();
        }
    }

    public final void q(boolean z10) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(this.currentAccount).getStoriesController().B;
        sg.r0 r0Var = this.f3002b;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.f3003c = true;
            r0Var.b(LocaleController.getString(R.string.StealthModeIsActive), true, z10);
            r0Var.f46266e.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
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
                r0Var.b(LocaleController.formatString("AvailableIn", R.string.AvailableIn, sb2.toString()), true, z10);
                r0Var.f46266e.setTextColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false), 125));
                a3.d dVar = this.f3005f;
                AndroidUtilities.cancelRunOnUIThread(dVar);
                AndroidUtilities.runOnUIThread(dVar, 1000L);
                return;
            }
        }
        int i13 = this.d;
        if (i13 == 0) {
            r0Var.b(LocaleController.getString(R.string.EnableStealthMode), true, z10);
        } else if (i13 == 1) {
            r0Var.b(LocaleController.getString(R.string.EnableStealthModeAndOpenStory), true, z10);
        }
        r0Var.f46266e.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
    }
}
