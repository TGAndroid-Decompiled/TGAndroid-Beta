package ei;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.wr;
public final class n4 extends GestureDetector.SimpleOnGestureListener {
    public final int f8495a;
    public final int f8496b;
    public final ViewGroup f8497c;

    public n4(ViewGroup viewGroup, int i10, int i11) {
        this.f8495a = i11;
        this.f8497c = viewGroup;
        this.f8496b = i10;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f8495a) {
            case 1:
                wr wrVar = (wr) this.f8497c;
                tr trVar = wrVar.f30169r;
                if (wrVar.f30168n) {
                    wrVar.removeCallbacks(trVar);
                }
                wrVar.f30168n = true;
                wrVar.postDelayed(trVar, 200L);
                wrVar.h.run();
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        org.telegram.ui.web.z0 z0Var;
        switch (this.f8495a) {
            case 0:
                p4 p4Var = (p4) this.f8497c;
                if (p4Var.d || !p4Var.M) {
                    return false;
                }
                if (p4Var.J && !p4Var.L) {
                    return false;
                }
                if (p4Var.N && !p4Var.b(false)) {
                    return false;
                }
                float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
                if (f10 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((z0Var = p4Var.f8541x) == null || z0Var.getScrollY() == 0))) {
                    p4Var.f8540w = true;
                    float f11 = p4Var.f8538r;
                    int i10 = p4Var.H;
                    if (f11 < i10 && !p4Var.J) {
                        p4Var.e(0.0f);
                    } else if (p4Var.J && p4Var.L && (p4Var.Q == (-p4Var.f8536f) + p4Var.e || (f11 <= (-i10) && f10 < AndroidUtilities.dp(1200.0f)))) {
                        p4Var.e((-p4Var.f8536f) + p4Var.e);
                    } else {
                        o4 o4Var = p4Var.F;
                        if (o4Var != null) {
                            o4Var.k(false);
                        }
                    }
                } else if (f10 > -700.0f) {
                    return false;
                } else {
                    float f12 = p4Var.f8538r;
                    float f13 = (-p4Var.f8536f) + p4Var.e;
                    if (f12 <= f13) {
                        return false;
                    }
                    p4Var.f8540w = true;
                    p4Var.e(f13);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f7, f10);
            case 2:
                hh0 hh0Var = (hh0) this.f8497c;
                if (!hh0Var.f24842f && !hh0Var.h && f7 >= 600.0f) {
                    hh0Var.e = false;
                    hh0Var.h = false;
                    hh0Var.a(0.0f, f7 / 6000.0f);
                }
                return false;
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: ei.n4.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
