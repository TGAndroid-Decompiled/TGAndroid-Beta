package mh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.kr;
public final class d4 extends GestureDetector.SimpleOnGestureListener {
    public final int f17806a;
    public final int f17807b;
    public final ViewGroup f17808c;

    public d4(ViewGroup viewGroup, int i9, int i10) {
        this.f17806a = i10;
        this.f17808c = viewGroup;
        this.f17807b = i9;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f17806a) {
            case 1:
                kr krVar = (kr) this.f17808c;
                hr hrVar = krVar.f30232r;
                if (krVar.f30231n) {
                    krVar.removeCallbacks(hrVar);
                }
                krVar.f30231n = true;
                krVar.postDelayed(hrVar, 200L);
                krVar.h.run();
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        org.telegram.ui.web.v0 v0Var;
        switch (this.f17806a) {
            case 0:
                f4 f4Var = (f4) this.f17808c;
                if (f4Var.d || !f4Var.I) {
                    return false;
                }
                if (f4Var.F && !f4Var.H) {
                    return false;
                }
                if (f4Var.J && !f4Var.b(false)) {
                    return false;
                }
                float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
                if (f11 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((v0Var = f4Var.f17846x) == null || v0Var.getScrollY() == 0))) {
                    f4Var.f17845w = true;
                    float f12 = f4Var.f17843r;
                    int i9 = f4Var.D;
                    if (f12 < i9 && !f4Var.F) {
                        f4Var.e(0.0f);
                    } else if (f4Var.F && f4Var.H && (f4Var.M == (-f4Var.f17841f) + f4Var.f17840e || (f12 <= (-i9) && f11 < AndroidUtilities.dp(1200.0f)))) {
                        f4Var.e((-f4Var.f17841f) + f4Var.f17840e);
                    } else {
                        e4 e4Var = f4Var.B;
                        if (e4Var != null) {
                            e4Var.j(false);
                        }
                    }
                } else if (f11 > -700.0f) {
                    return false;
                } else {
                    float f13 = f4Var.f17843r;
                    float f14 = (-f4Var.f17841f) + f4Var.f17840e;
                    if (f13 <= f14) {
                        return false;
                    }
                    f4Var.f17845w = true;
                    f4Var.e(f14);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f10, f11);
            case 2:
                fg0 fg0Var = (fg0) this.f17808c;
                if (!fg0Var.f28420f && !fg0Var.h && f10 >= 600.0f) {
                    fg0Var.f28419e = false;
                    fg0Var.h = false;
                    fg0Var.a(0.0f, f10 / 6000.0f);
                }
                return false;
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: mh.d4.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
