package ei;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.ns;
public final class m4 extends GestureDetector.SimpleOnGestureListener {
    public final int f9220a;
    public final int f9221b;
    public final ViewGroup f9222c;

    public m4(ViewGroup viewGroup, int i10, int i11) {
        this.f9220a = i11;
        this.f9222c = viewGroup;
        this.f9221b = i10;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f9220a) {
            case 1:
                ns nsVar = (ns) this.f9222c;
                ks ksVar = nsVar.f28956r;
                if (nsVar.f28955n) {
                    nsVar.removeCallbacks(ksVar);
                }
                nsVar.f28955n = true;
                nsVar.postDelayed(ksVar, 200L);
                nsVar.h.run();
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
        switch (this.f9220a) {
            case 0:
                o4 o4Var = (o4) this.f9222c;
                if (o4Var.d || !o4Var.M) {
                    return false;
                }
                if (o4Var.J && !o4Var.L) {
                    return false;
                }
                if (o4Var.N && !o4Var.b(false)) {
                    return false;
                }
                float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
                if (f10 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((y0Var = o4Var.f9265x) == null || y0Var.getScrollY() == 0))) {
                    o4Var.f9264w = true;
                    float f11 = o4Var.f9262r;
                    int i10 = o4Var.H;
                    if (f11 < i10 && !o4Var.J) {
                        o4Var.e(0.0f);
                    } else if (o4Var.J && o4Var.L && (o4Var.Q == (-o4Var.f9260f) + o4Var.f9259e || (f11 <= (-i10) && f10 < AndroidUtilities.dp(1200.0f)))) {
                        o4Var.e((-o4Var.f9260f) + o4Var.f9259e);
                    } else {
                        n4 n4Var = o4Var.F;
                        if (n4Var != null) {
                            n4Var.j(false);
                        }
                    }
                } else if (f10 > -700.0f) {
                    return false;
                } else {
                    float f12 = o4Var.f9262r;
                    float f13 = (-o4Var.f9260f) + o4Var.f9259e;
                    if (f12 <= f13) {
                        return false;
                    }
                    o4Var.f9264w = true;
                    o4Var.e(f13);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f7, f10);
            case 2:
                bi0 bi0Var = (bi0) this.f9222c;
                if (!bi0Var.f24662f && !bi0Var.h && f7 >= 600.0f) {
                    bi0Var.f24661e = false;
                    bi0Var.h = false;
                    bi0Var.a(0.0f, f7 / 6000.0f);
                }
                return false;
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: ei.m4.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
