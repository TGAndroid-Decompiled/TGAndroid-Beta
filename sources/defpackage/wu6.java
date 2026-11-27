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
public final class wu6 implements View.OnClickListener {
    public final byte a;
    public final bv6 b;

    public wu6(bv6 bv6Var, byte b) {
        this.a = b;
        this.b = bv6Var;
    }

    @Override
    public final void onClick(View view) {
        PlaybackStateCompat playbackStateCompat;
        PendingIntent sessionActivity;
        Interpolator interpolator;
        byte b = this.a;
        int i = 0;
        int i2 = 1;
        bv6 bv6Var = this.b;
        switch (b) {
            case 0:
                Context context = bv6Var.s;
                AccessibilityManager accessibilityManager = bv6Var.E0;
                int id = view.getId();
                if (id != 16908313 && id != 16908314) {
                    if (id == 2131296555) {
                        um4 um4Var = bv6Var.j0;
                        if (um4Var != null && (playbackStateCompat = bv6Var.l0) != null) {
                            if (playbackStateCompat.a == 3) {
                                long j = playbackStateCompat.e;
                                if ((514 & j) != 0) {
                                    um4Var.Y().a.pause();
                                    i = 2131689658;
                                } else if ((j & 1) != 0) {
                                    um4Var.Y().a.stop();
                                    i = 2131689660;
                                }
                            } else if ((playbackStateCompat.e & 516) != 0) {
                                um4Var.Y().a.play();
                                i = 2131689659;
                            }
                            if (accessibilityManager != null && accessibilityManager.isEnabled() && i != 0) {
                                AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                                obtain.setPackageName(context.getPackageName());
                                obtain.setClassName(wu6.class.getName());
                                obtain.getText().add(context.getString(i));
                                accessibilityManager.sendAccessibilityEvent(obtain);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (id == 2131296553) {
                        bv6Var.dismiss();
                        return;
                    } else {
                        return;
                    }
                }
                if (bv6Var.r.g()) {
                    lw6 lw6Var = bv6Var.h;
                    if (id == 16908313) {
                        i2 = 2;
                    }
                    lw6Var.getClass();
                    lw6.j(i2);
                }
                bv6Var.dismiss();
                return;
            case 1:
                bv6Var.dismiss();
                return;
            case 2:
                um4 um4Var2 = bv6Var.j0;
                if (um4Var2 != null && (sessionActivity = ((a) um4Var2.b).a.getSessionActivity()) != null) {
                    try {
                        sessionActivity.send();
                        bv6Var.dismiss();
                        return;
                    } catch (PendingIntent.CanceledException unused) {
                        Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
                        return;
                    }
                }
                return;
            default:
                boolean z = bv6Var.v0;
                bv6Var.v0 = !z;
                if (!z) {
                    bv6Var.V.setVisibility(0);
                }
                if (bv6Var.v0) {
                    interpolator = bv6Var.C0;
                } else {
                    interpolator = bv6Var.D0;
                }
                bv6Var.B0 = interpolator;
                bv6Var.t(true);
                return;
        }
    }
}
