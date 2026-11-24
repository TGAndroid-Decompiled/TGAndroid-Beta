package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
public final class ru6 implements View.OnClickListener {
    public final byte a;
    public final wu6 b;

    public ru6(wu6 wu6Var, byte b) {
        this.a = b;
        this.b = wu6Var;
    }

    @Override
    public final void onClick(View view) {
        PlaybackStateCompat playbackStateCompat;
        PendingIntent sessionActivity;
        Interpolator interpolator;
        byte b = this.a;
        int i = 0;
        int i2 = 1;
        wu6 wu6Var = this.b;
        switch (b) {
            case 0:
                Context context = wu6Var.s;
                AccessibilityManager accessibilityManager = wu6Var.E0;
                int id = view.getId();
                if (id != 16908313 && id != 16908314) {
                    if (id == 2131296555) {
                        wm4 wm4Var = wu6Var.j0;
                        if (wm4Var != null && (playbackStateCompat = wu6Var.l0) != null) {
                            if (playbackStateCompat.a == 3) {
                                long j = playbackStateCompat.e;
                                if ((514 & j) != 0) {
                                    wm4Var.a0().a.pause();
                                    i = 2131689658;
                                } else if ((j & 1) != 0) {
                                    wm4Var.a0().a.stop();
                                    i = 2131689660;
                                }
                            } else if ((playbackStateCompat.e & 516) != 0) {
                                wm4Var.a0().a.play();
                                i = 2131689659;
                            }
                            if (accessibilityManager != null && accessibilityManager.isEnabled() && i != 0) {
                                AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                                obtain.setPackageName(context.getPackageName());
                                obtain.setClassName(ru6.class.getName());
                                obtain.getText().add(context.getString(i));
                                accessibilityManager.sendAccessibilityEvent(obtain);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (id == 2131296553) {
                        wu6Var.dismiss();
                        return;
                    } else {
                        return;
                    }
                }
                if (wu6Var.r.g()) {
                    gw6 gw6Var = wu6Var.h;
                    if (id == 16908313) {
                        i2 = 2;
                    }
                    gw6Var.getClass();
                    gw6.j(i2);
                }
                wu6Var.dismiss();
                return;
            case 1:
                wu6Var.dismiss();
                return;
            case 2:
                wm4 wm4Var2 = wu6Var.j0;
                if (wm4Var2 != null && (sessionActivity = ((a) wm4Var2.b).a.getSessionActivity()) != null) {
                    try {
                        sessionActivity.send();
                        wu6Var.dismiss();
                        return;
                    } catch (PendingIntent.CanceledException unused) {
                        Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
                        return;
                    }
                }
                return;
            default:
                boolean z = wu6Var.v0;
                wu6Var.v0 = !z;
                if (!z) {
                    wu6Var.V.setVisibility(0);
                }
                if (wu6Var.v0) {
                    interpolator = wu6Var.C0;
                } else {
                    interpolator = wu6Var.D0;
                }
                wu6Var.B0 = interpolator;
                wu6Var.t(true);
                return;
        }
    }
}
