package hi;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.th0;
public final class l4 extends GestureDetector.SimpleOnGestureListener {
    public final int f13086a;
    public final int f13087b;
    public final ViewGroup f13088c;

    public l4(ViewGroup viewGroup, int i10, int i11) {
        this.f13086a = i11;
        this.f13088c = viewGroup;
        this.f13087b = i10;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f13086a) {
            case 1:
                hs hsVar = (hs) this.f13088c;
                es esVar = hsVar.f29067r;
                if (hsVar.f29066n) {
                    hsVar.removeCallbacks(esVar);
                }
                hsVar.f29066n = true;
                hsVar.postDelayed(esVar, 200L);
                hsVar.h.run();
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        org.telegram.ui.web.x0 x0Var;
        switch (this.f13086a) {
            case 0:
                n4 n4Var = (n4) this.f13088c;
                if (n4Var.d || !n4Var.M) {
                    return false;
                }
                if (n4Var.J && !n4Var.L) {
                    return false;
                }
                if (n4Var.N && !n4Var.b(false)) {
                    return false;
                }
                float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
                if (f10 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((x0Var = n4Var.f13162x) == null || x0Var.getScrollY() == 0))) {
                    n4Var.f13161w = true;
                    float f11 = n4Var.f13159r;
                    int i10 = n4Var.H;
                    if (f11 < i10 && !n4Var.J) {
                        n4Var.e(0.0f);
                    } else if (n4Var.J && n4Var.L && (n4Var.Q == (-n4Var.f13157f) + n4Var.e || (f11 <= (-i10) && f10 < AndroidUtilities.dp(1200.0f)))) {
                        n4Var.e((-n4Var.f13157f) + n4Var.e);
                    } else {
                        m4 m4Var = n4Var.F;
                        if (m4Var != null) {
                            m4Var.o(false);
                        }
                    }
                } else if (f10 > -700.0f) {
                    return false;
                } else {
                    float f12 = n4Var.f13159r;
                    float f13 = (-n4Var.f13157f) + n4Var.e;
                    if (f12 <= f13) {
                        return false;
                    }
                    n4Var.f13161w = true;
                    n4Var.e(f13);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f7, f10);
            case 2:
                th0 th0Var = (th0) this.f13088c;
                if (!th0Var.f32966f && !th0Var.h && f7 >= 600.0f) {
                    th0Var.e = false;
                    th0Var.h = false;
                    th0Var.a(0.0f, f7 / 6000.0f);
                }
                return false;
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: hi.l4.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
