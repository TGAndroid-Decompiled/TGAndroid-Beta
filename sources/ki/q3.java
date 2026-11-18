package ki;

import android.graphics.Typeface;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.ui.Components.if0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.pr;
public final class q3 extends GestureDetector.SimpleOnGestureListener {
    public final int f18850a;
    public final int f18851b;
    public final ViewGroup f18852c;

    public q3(ViewGroup viewGroup, int i7, int i10) {
        this.f18850a = i10;
        this.f18852c = viewGroup;
        this.f18851b = i7;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f18850a) {
            case 1:
                pr prVar = (pr) this.f18852c;
                mr mrVar = prVar.f38535r;
                if (prVar.f38534n) {
                    prVar.removeCallbacks(mrVar);
                }
                prVar.f38534n = true;
                prVar.postDelayed(mrVar, 200L);
                prVar.h.run();
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        org.telegram.ui.web.s0 s0Var;
        int i7 = this.f18850a;
        ViewGroup viewGroup = this.f18852c;
        switch (i7) {
            case 0:
                s3 s3Var = (s3) viewGroup;
                if (s3Var.d || !s3Var.N) {
                    return false;
                }
                if (s3Var.K && !s3Var.M) {
                    return false;
                }
                if (s3Var.O && !s3Var.b(false)) {
                    return false;
                }
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                float x11 = motionEvent2.getX();
                float y11 = motionEvent2.getY();
                Typeface typeface = org.telegram.messenger.g0.f24093a;
                float f12 = x11 - x10;
                float f13 = y11 - y10;
                float sqrt = (float) Math.sqrt((f13 * f13) + (f12 * f12));
                float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
                if (f11 >= org.telegram.messenger.g0.L(650.0f) && ((sqrt > org.telegram.messenger.g0.L(200.0f) || eventTime > 250.0f) && ((s0Var = s3Var.f18904y) == null || s0Var.getScrollY() == 0))) {
                    s3Var.f18903x = true;
                    float f14 = s3Var.f18900r;
                    int i10 = s3Var.I;
                    if (f14 < i10 && !s3Var.K) {
                        s3Var.e(0.0f);
                    } else if (s3Var.K && s3Var.M && (s3Var.R == (-s3Var.f18898f) + s3Var.f18897e || (f14 <= (-i10) && f11 < org.telegram.messenger.g0.L(1200.0f)))) {
                        s3Var.e((-s3Var.f18898f) + s3Var.f18897e);
                    } else {
                        r3 r3Var = s3Var.G;
                        if (r3Var != null) {
                            r3Var.s(false);
                        }
                    }
                } else if (f11 > -700.0f) {
                    return false;
                } else {
                    float f15 = s3Var.f18900r;
                    float f16 = (-s3Var.f18898f) + s3Var.f18897e;
                    if (f15 <= f16) {
                        return false;
                    }
                    s3Var.f18903x = true;
                    s3Var.e(f16);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f10, f11);
            case 2:
                if0 if0Var = (if0) viewGroup;
                if (!if0Var.f36116f && !if0Var.h && f10 >= 600.0f) {
                    if0Var.f36115e = false;
                    if0Var.h = false;
                    if0Var.a(0.0f, f10 / 6000.0f);
                }
                return false;
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: ki.q3.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
