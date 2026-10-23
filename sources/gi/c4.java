package gi;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cs;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.qh0;
public final class c4 extends GestureDetector.SimpleOnGestureListener {
    public final int f11116a;
    public final int f11117b;
    public final ViewGroup f11118c;

    public c4(ViewGroup viewGroup, int i10, int i11) {
        this.f11116a = i11;
        this.f11118c = viewGroup;
        this.f11117b = i10;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f11116a) {
            case 1:
                fs fsVar = (fs) this.f11118c;
                cs csVar = fsVar.f26408r;
                if (fsVar.f26407n) {
                    fsVar.removeCallbacks(csVar);
                }
                fsVar.f26407n = true;
                fsVar.postDelayed(csVar, 200L);
                fsVar.h.run();
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
        switch (this.f11116a) {
            case 0:
                e4 e4Var = (e4) this.f11118c;
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
                if (f10 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((x0Var = e4Var.f11190x) == null || x0Var.getScrollY() == 0))) {
                    e4Var.f11189w = true;
                    float f11 = e4Var.f11187r;
                    int i10 = e4Var.H;
                    if (f11 < i10 && !e4Var.J) {
                        e4Var.e(0.0f);
                    } else if (e4Var.J && e4Var.L && (e4Var.Q == (-e4Var.f11185f) + e4Var.e || (f11 <= (-i10) && f10 < AndroidUtilities.dp(1200.0f)))) {
                        e4Var.e((-e4Var.f11185f) + e4Var.e);
                    } else {
                        d4 d4Var = e4Var.F;
                        if (d4Var != null) {
                            d4Var.f(false);
                        }
                    }
                } else if (f10 > -700.0f) {
                    return false;
                } else {
                    float f12 = e4Var.f11187r;
                    float f13 = (-e4Var.f11185f) + e4Var.e;
                    if (f12 <= f13) {
                        return false;
                    }
                    e4Var.f11189w = true;
                    e4Var.e(f13);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f7, f10);
            case 2:
                qh0 qh0Var = (qh0) this.f11118c;
                if (!qh0Var.f29598f && !qh0Var.h && f7 >= 600.0f) {
                    qh0Var.e = false;
                    qh0Var.h = false;
                    qh0Var.a(0.0f, f7 / 6000.0f);
                }
                return false;
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: gi.c4.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
