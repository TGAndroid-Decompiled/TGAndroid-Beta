package ei;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.ur;
import org.telegram.ui.Components.xr;
public final class n4 extends GestureDetector.SimpleOnGestureListener {
    public final int f8504a;
    public final int f8505b;
    public final ViewGroup f8506c;

    public n4(ViewGroup viewGroup, int i10, int i11) {
        this.f8504a = i11;
        this.f8506c = viewGroup;
        this.f8505b = i10;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f8504a) {
            case 1:
                xr xrVar = (xr) this.f8506c;
                ur urVar = xrVar.f30494r;
                if (xrVar.f30493n) {
                    xrVar.removeCallbacks(urVar);
                }
                xrVar.f30493n = true;
                xrVar.postDelayed(urVar, 200L);
                xrVar.h.run();
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        org.telegram.ui.web.y0 y0Var;
        switch (this.f8504a) {
            case 0:
                p4 p4Var = (p4) this.f8506c;
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
                if (f10 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((y0Var = p4Var.f8550x) == null || y0Var.getScrollY() == 0))) {
                    p4Var.f8549w = true;
                    float f11 = p4Var.f8547r;
                    int i10 = p4Var.H;
                    if (f11 < i10 && !p4Var.J) {
                        p4Var.e(0.0f);
                    } else if (p4Var.J && p4Var.L && (p4Var.Q == (-p4Var.f8545f) + p4Var.e || (f11 <= (-i10) && f10 < AndroidUtilities.dp(1200.0f)))) {
                        p4Var.e((-p4Var.f8545f) + p4Var.e);
                    } else {
                        o4 o4Var = p4Var.F;
                        if (o4Var != null) {
                            o4Var.j(false);
                        }
                    }
                } else if (f10 > -700.0f) {
                    return false;
                } else {
                    float f12 = p4Var.f8547r;
                    float f13 = (-p4Var.f8545f) + p4Var.e;
                    if (f12 <= f13) {
                        return false;
                    }
                    p4Var.f8549w = true;
                    p4Var.e(f13);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f7, f10);
            case 2:
                ih0 ih0Var = (ih0) this.f8506c;
                if (!ih0Var.f25127f && !ih0Var.h && f7 >= 600.0f) {
                    ih0Var.e = false;
                    ih0Var.h = false;
                    ih0Var.a(0.0f, f7 / 6000.0f);
                }
                return false;
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: ei.n4.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
