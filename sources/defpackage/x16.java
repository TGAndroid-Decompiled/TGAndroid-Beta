package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
public final class x16 implements OnBackAnimationCallback {
    public boolean b;
    public boolean e;
    public final LaunchActivity f;
    public final po a = new po(null);
    public boolean c = false;
    public boolean d = false;

    public x16(LaunchActivity launchActivity) {
        this.f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.c = false;
        this.d = false;
        if (this.b) {
            this.a.e();
            this.b = false;
        }
        if (!gm.O1() && (actionBarLayout = this.f.p0) != null && actionBarLayout.j1) {
            actionBarLayout.j1 = false;
            actionBarLayout.d(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.b) {
            this.a.e();
            this.b = false;
        }
        boolean O1 = gm.O1();
        LaunchActivity launchActivity = this.f;
        if (O1) {
            launchActivity.onBackPressed();
        } else if (!launchActivity.d0(true)) {
        } else {
            ActionBarLayout actionBarLayout = launchActivity.p0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.j1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.j1 = false;
                actionBarLayout.d(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        if (!this.c || !this.d) {
            float progress = backEvent.getProgress();
            boolean z = this.e;
            LaunchActivity launchActivity = this.f;
            boolean z2 = false;
            if (!z && progress > 0.015f) {
                this.e = true;
                if (!gm.O1() && launchActivity.d0(false) && (actionBarLayout2 = launchActivity.p0) != null && actionBarLayout2.H(backEvent.getTouchX(), backEvent.getTouchY()) && !this.b) {
                    this.a.d();
                    this.b = true;
                }
            }
            float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
            if (!gm.O1() && (actionBarLayout = launchActivity.p0) != null && actionBarLayout.j1) {
                float interpolation = d53.l.getInterpolation(max) * gm.L(56.0f);
                if (max > 0.0f) {
                    z2 = true;
                }
                actionBarLayout.l1 = z2;
                actionBarLayout.s.setTranslationX(interpolation);
                actionBarLayout.setInnerTranslationX(interpolation);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.c = true;
        this.d = false;
        this.e = false;
    }
}
