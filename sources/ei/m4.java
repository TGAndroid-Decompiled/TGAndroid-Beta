package ei;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ls;
import org.telegram.ui.Components.xh0;
public final class m4 extends GestureDetector.SimpleOnGestureListener {
    public final int f9223a;
    public final int f9224b;
    public final ViewGroup f9225c;

    public m4(ViewGroup viewGroup, int i10, int i11) {
        this.f9223a = i11;
        this.f9225c = viewGroup;
        this.f9224b = i10;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f9223a) {
            case 1:
                ls lsVar = (ls) this.f9225c;
                is isVar = lsVar.f28586r;
                if (lsVar.f28585n) {
                    lsVar.removeCallbacks(isVar);
                }
                lsVar.f28585n = true;
                lsVar.postDelayed(isVar, 200L);
                lsVar.h.run();
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
        switch (this.f9223a) {
            case 0:
                o4 o4Var = (o4) this.f9225c;
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
                if (f10 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((y0Var = o4Var.f9268x) == null || y0Var.getScrollY() == 0))) {
                    o4Var.f9267w = true;
                    float f11 = o4Var.f9265r;
                    int i10 = o4Var.H;
                    if (f11 < i10 && !o4Var.J) {
                        o4Var.e(0.0f);
                    } else if (o4Var.J && o4Var.L && (o4Var.Q == (-o4Var.f9263f) + o4Var.f9262e || (f11 <= (-i10) && f10 < AndroidUtilities.dp(1200.0f)))) {
                        o4Var.e((-o4Var.f9263f) + o4Var.f9262e);
                    } else {
                        n4 n4Var = o4Var.F;
                        if (n4Var != null) {
                            n4Var.j(false);
                        }
                    }
                } else if (f10 > -700.0f) {
                    return false;
                } else {
                    float f12 = o4Var.f9265r;
                    float f13 = (-o4Var.f9263f) + o4Var.f9262e;
                    if (f12 <= f13) {
                        return false;
                    }
                    o4Var.f9267w = true;
                    o4Var.e(f13);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f7, f10);
            case 2:
                xh0 xh0Var = (xh0) this.f9225c;
                if (!xh0Var.f32868f && !xh0Var.h && f7 >= 600.0f) {
                    xh0Var.f32867e = false;
                    xh0Var.h = false;
                    xh0Var.a(0.0f, f7 / 6000.0f);
                }
                return false;
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: ei.m4.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
