package gi;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.sh0;
public final class c4 extends GestureDetector.SimpleOnGestureListener {
    public final int f11135a;
    public final int f11136b;
    public final ViewGroup f11137c;

    public c4(ViewGroup viewGroup, int i10, int i11) {
        this.f11135a = i11;
        this.f11137c = viewGroup;
        this.f11136b = i10;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f11135a) {
            case 1:
                ds dsVar = (ds) this.f11137c;
                as asVar = dsVar.f25826r;
                if (dsVar.f25825n) {
                    dsVar.removeCallbacks(asVar);
                }
                dsVar.f25825n = true;
                dsVar.postDelayed(asVar, 200L);
                dsVar.h.run();
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
        switch (this.f11135a) {
            case 0:
                e4 e4Var = (e4) this.f11137c;
                if (e4Var.d || !e4Var.M) {
                    return false;
                }
                if (e4Var.J && !e4Var.L) {
                    return false;
                }
                if (e4Var.N && !e4Var.b(false)) {
                    return false;
                }
                float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
                if (f10 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((y0Var = e4Var.f11212x) == null || y0Var.getScrollY() == 0))) {
                    e4Var.f11211w = true;
                    float f11 = e4Var.f11209r;
                    int i10 = e4Var.H;
                    if (f11 < i10 && !e4Var.J) {
                        e4Var.e(0.0f);
                    } else if (e4Var.J && e4Var.L && (e4Var.Q == (-e4Var.f11207f) + e4Var.e || (f11 <= (-i10) && f10 < AndroidUtilities.dp(1200.0f)))) {
                        e4Var.e((-e4Var.f11207f) + e4Var.e);
                    } else {
                        d4 d4Var = e4Var.F;
                        if (d4Var != null) {
                            d4Var.f(false);
                        }
                    }
                } else if (f10 > -700.0f) {
                    return false;
                } else {
                    float f12 = e4Var.f11209r;
                    float f13 = (-e4Var.f11207f) + e4Var.e;
                    if (f12 <= f13) {
                        return false;
                    }
                    e4Var.f11211w = true;
                    e4Var.e(f13);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f7, f10);
            case 2:
                sh0 sh0Var = (sh0) this.f11137c;
                if (!sh0Var.f30510f && !sh0Var.h && f7 >= 600.0f) {
                    sh0Var.e = false;
                    sh0Var.h = false;
                    sh0Var.a(0.0f, f7 / 6000.0f);
                }
                return false;
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: gi.c4.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
