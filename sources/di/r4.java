package di;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.xr;
public final class r4 extends GestureDetector.SimpleOnGestureListener {
    public final int f6879a;
    public final int f6880b;
    public final ViewGroup f6881c;

    public r4(ViewGroup viewGroup, int i10, int i11) {
        this.f6879a = i11;
        this.f6881c = viewGroup;
        this.f6880b = i10;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f6879a) {
            case 1:
                as asVar = (as) this.f6881c;
                xr xrVar = asVar.f21578r;
                if (asVar.f21577n) {
                    asVar.removeCallbacks(xrVar);
                }
                asVar.f21577n = true;
                asVar.postDelayed(xrVar, 200L);
                asVar.h.run();
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
        switch (this.f6879a) {
            case 0:
                t4 t4Var = (t4) this.f6881c;
                if (t4Var.d || !t4Var.M) {
                    return false;
                }
                if (t4Var.J && !t4Var.L) {
                    return false;
                }
                if (t4Var.N && !t4Var.b(false)) {
                    return false;
                }
                float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
                if (f10 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((y0Var = t4Var.f6924x) == null || y0Var.getScrollY() == 0))) {
                    t4Var.f6923w = true;
                    float f11 = t4Var.f6921r;
                    int i10 = t4Var.H;
                    if (f11 < i10 && !t4Var.J) {
                        t4Var.e(0.0f);
                    } else if (t4Var.J && t4Var.L && (t4Var.Q == (-t4Var.f6919f) + t4Var.e || (f11 <= (-i10) && f10 < AndroidUtilities.dp(1200.0f)))) {
                        t4Var.e((-t4Var.f6919f) + t4Var.e);
                    } else {
                        s4 s4Var = t4Var.F;
                        if (s4Var != null) {
                            s4Var.j(false);
                        }
                    }
                } else if (f10 > -700.0f) {
                    return false;
                } else {
                    float f12 = t4Var.f6921r;
                    float f13 = (-t4Var.f6919f) + t4Var.e;
                    if (f12 <= f13) {
                        return false;
                    }
                    t4Var.f6923w = true;
                    t4Var.e(f13);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f7, f10);
            case 2:
                eh0 eh0Var = (eh0) this.f6881c;
                if (!eh0Var.f22705f && !eh0Var.h && f7 >= 600.0f) {
                    eh0Var.e = false;
                    eh0Var.h = false;
                    eh0Var.a(0.0f, f7 / 6000.0f);
                }
                return false;
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: di.r4.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
