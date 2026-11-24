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
public final class rs6 implements View.OnClickListener {
    public final byte a;
    public final ws6 b;

    public rs6(ws6 ws6Var, byte b) {
        this.a = b;
        this.b = ws6Var;
    }

    @Override
    public final void onClick(View view) {
        PlaybackStateCompat playbackStateCompat;
        PendingIntent sessionActivity;
        Interpolator interpolator;
        byte b = this.a;
        int i = 0;
        int i2 = 1;
        ws6 ws6Var = this.b;
        switch (b) {
            case 0:
                Context context = ws6Var.s;
                AccessibilityManager accessibilityManager = ws6Var.E0;
                int id = view.getId();
                if (id != 16908313 && id != 16908314) {
                    if (id == 2131296555) {
                        wk4 wk4Var = ws6Var.j0;
                        if (wk4Var != null && (playbackStateCompat = ws6Var.l0) != null) {
                            if (playbackStateCompat.a == 3) {
                                long j = playbackStateCompat.e;
                                if ((514 & j) != 0) {
                                    wk4Var.Z().a.pause();
                                    i = 2131689658;
                                } else if ((j & 1) != 0) {
                                    wk4Var.Z().a.stop();
                                    i = 2131689660;
                                }
                            } else if ((playbackStateCompat.e & 516) != 0) {
                                wk4Var.Z().a.play();
                                i = 2131689659;
                            }
                            if (accessibilityManager != null && accessibilityManager.isEnabled() && i != 0) {
                                AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                                obtain.setPackageName(context.getPackageName());
                                obtain.setClassName(rs6.class.getName());
                                obtain.getText().add(context.getString(i));
                                accessibilityManager.sendAccessibilityEvent(obtain);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (id == 2131296553) {
                        ws6Var.dismiss();
                        return;
                    } else {
                        return;
                    }
                }
                if (ws6Var.r.g()) {
                    gu6 gu6Var = ws6Var.h;
                    if (id == 16908313) {
                        i2 = 2;
                    }
                    gu6Var.getClass();
                    gu6.j(i2);
                }
                ws6Var.dismiss();
                return;
            case 1:
                ws6Var.dismiss();
                return;
            case 2:
                wk4 wk4Var2 = ws6Var.j0;
                if (wk4Var2 != null && (sessionActivity = ((a) wk4Var2.b).a.getSessionActivity()) != null) {
                    try {
                        sessionActivity.send();
                        ws6Var.dismiss();
                        return;
                    } catch (PendingIntent.CanceledException unused) {
                        Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
                        return;
                    }
                }
                return;
            default:
                boolean z = ws6Var.v0;
                ws6Var.v0 = !z;
                if (!z) {
                    ws6Var.V.setVisibility(0);
                }
                if (ws6Var.v0) {
                    interpolator = ws6Var.C0;
                } else {
                    interpolator = ws6Var.D0;
                }
                ws6Var.B0 = interpolator;
                ws6Var.t(true);
                return;
        }
    }
}
