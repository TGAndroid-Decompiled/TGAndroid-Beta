package fi;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.vh0;
public final class n4 extends GestureDetector.SimpleOnGestureListener {
    public final int f9430a;
    public final int f9431b;
    public final ViewGroup f9432c;

    public n4(ViewGroup viewGroup, int i10, int i11) {
        this.f9430a = i11;
        this.f9432c = viewGroup;
        this.f9431b = i10;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f9430a) {
            case 1:
                is isVar = (is) this.f9432c;
                fs fsVar = isVar.f26087r;
                if (isVar.f26086n) {
                    isVar.removeCallbacks(fsVar);
                }
                isVar.f26086n = true;
                isVar.postDelayed(fsVar, 200L);
                isVar.h.run();
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
        switch (this.f9430a) {
            case 0:
                p4 p4Var = (p4) this.f9432c;
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
                if (f10 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((y0Var = p4Var.f9480x) == null || y0Var.getScrollY() == 0))) {
                    p4Var.f9479w = true;
                    float f11 = p4Var.f9477r;
                    int i10 = p4Var.H;
                    if (f11 < i10 && !p4Var.J) {
                        p4Var.e(0.0f);
                    } else if (p4Var.J && p4Var.L && (p4Var.Q == (-p4Var.f9475f) + p4Var.e || (f11 <= (-i10) && f10 < AndroidUtilities.dp(1200.0f)))) {
                        p4Var.e((-p4Var.f9475f) + p4Var.e);
                    } else {
                        o4 o4Var = p4Var.F;
                        if (o4Var != null) {
                            o4Var.j(false);
                        }
                    }
                } else if (f10 > -700.0f) {
                    return false;
                } else {
                    float f12 = p4Var.f9477r;
                    float f13 = (-p4Var.f9475f) + p4Var.e;
                    if (f12 <= f13) {
                        return false;
                    }
                    p4Var.f9479w = true;
                    p4Var.e(f13);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f7, f10);
            case 2:
                vh0 vh0Var = (vh0) this.f9432c;
                if (!vh0Var.f29977f && !vh0Var.h && f7 >= 600.0f) {
                    vh0Var.e = false;
                    vh0Var.h = false;
                    vh0Var.a(0.0f, f7 / 6000.0f);
                }
                return false;
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: fi.n4.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
