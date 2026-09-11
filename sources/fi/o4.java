package fi;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.ug0;
public final class o4 extends GestureDetector.SimpleOnGestureListener {
    public final int f9863a;
    public final int f9864b;
    public final ViewGroup f9865c;

    public o4(ViewGroup viewGroup, int i10, int i11) {
        this.f9863a = i11;
        this.f9865c = viewGroup;
        this.f9864b = i10;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f9863a) {
            case 1:
                tr trVar = (tr) this.f9865c;
                qr qrVar = trVar.f30691r;
                if (trVar.f30690n) {
                    trVar.removeCallbacks(qrVar);
                }
                trVar.f30690n = true;
                trVar.postDelayed(qrVar, 200L);
                trVar.h.run();
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
        switch (this.f9863a) {
            case 0:
                q4 q4Var = (q4) this.f9865c;
                if (q4Var.d || !q4Var.M) {
                    return false;
                }
                if (q4Var.J && !q4Var.L) {
                    return false;
                }
                if (q4Var.N && !q4Var.b(false)) {
                    return false;
                }
                float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
                if (f10 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((z0Var = q4Var.f9913x) == null || z0Var.getScrollY() == 0))) {
                    q4Var.f9912w = true;
                    float f11 = q4Var.f9910r;
                    int i10 = q4Var.H;
                    if (f11 < i10 && !q4Var.J) {
                        q4Var.e(0.0f);
                    } else if (q4Var.J && q4Var.L && (q4Var.Q == (-q4Var.f9908f) + q4Var.f9907e || (f11 <= (-i10) && f10 < AndroidUtilities.dp(1200.0f)))) {
                        q4Var.e((-q4Var.f9908f) + q4Var.f9907e);
                    } else {
                        p4 p4Var = q4Var.F;
                        if (p4Var != null) {
                            p4Var.f(false);
                        }
                    }
                } else if (f10 > -700.0f) {
                    return false;
                } else {
                    float f12 = q4Var.f9910r;
                    float f13 = (-q4Var.f9908f) + q4Var.f9907e;
                    if (f12 <= f13) {
                        return false;
                    }
                    q4Var.f9912w = true;
                    q4Var.e(f13);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f7, f10);
            case 2:
                ug0 ug0Var = (ug0) this.f9865c;
                if (!ug0Var.f30891f && !ug0Var.h && f7 >= 600.0f) {
                    ug0Var.f30890e = false;
                    ug0Var.h = false;
                    ug0Var.a(0.0f, f7 / 6000.0f);
                }
                return false;
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: fi.o4.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
