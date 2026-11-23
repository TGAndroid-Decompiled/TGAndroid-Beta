package ki;

import android.graphics.Typeface;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.rr;
public final class p3 extends GestureDetector.SimpleOnGestureListener {
    public final int f18860a;
    public final int f18861b;
    public final ViewGroup f18862c;

    public p3(ViewGroup viewGroup, int i7, int i10) {
        this.f18860a = i10;
        this.f18862c = viewGroup;
        this.f18861b = i7;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f18860a) {
            case 1:
                rr rrVar = (rr) this.f18862c;
                or orVar = rrVar.f39327r;
                if (rrVar.f39326n) {
                    rrVar.removeCallbacks(orVar);
                }
                rrVar.f39326n = true;
                rrVar.postDelayed(orVar, 200L);
                rrVar.h.run();
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
        int i7 = this.f18860a;
        ViewGroup viewGroup = this.f18862c;
        switch (i7) {
            case 0:
                r3 r3Var = (r3) viewGroup;
                if (r3Var.d || !r3Var.N) {
                    return false;
                }
                if (r3Var.K && !r3Var.M) {
                    return false;
                }
                if (r3Var.O && !r3Var.b(false)) {
                    return false;
                }
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                float x11 = motionEvent2.getX();
                float y11 = motionEvent2.getY();
                Typeface typeface = org.telegram.messenger.g0.f24018a;
                float f12 = x11 - x10;
                float f13 = y11 - y10;
                float sqrt = (float) Math.sqrt((f13 * f13) + (f12 * f12));
                float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
                if (f11 >= org.telegram.messenger.g0.L(650.0f) && ((sqrt > org.telegram.messenger.g0.L(200.0f) || eventTime > 250.0f) && ((s0Var = r3Var.f18914y) == null || s0Var.getScrollY() == 0))) {
                    r3Var.f18913x = true;
                    float f14 = r3Var.f18910r;
                    int i10 = r3Var.I;
                    if (f14 < i10 && !r3Var.K) {
                        r3Var.e(0.0f);
                    } else if (r3Var.K && r3Var.M && (r3Var.R == (-r3Var.f18908f) + r3Var.f18907e || (f14 <= (-i10) && f11 < org.telegram.messenger.g0.L(1200.0f)))) {
                        r3Var.e((-r3Var.f18908f) + r3Var.f18907e);
                    } else {
                        q3 q3Var = r3Var.G;
                        if (q3Var != null) {
                            q3Var.s(false);
                        }
                    }
                } else if (f11 > -700.0f) {
                    return false;
                } else {
                    float f15 = r3Var.f18910r;
                    float f16 = (-r3Var.f18908f) + r3Var.f18907e;
                    if (f15 <= f16) {
                        return false;
                    }
                    r3Var.f18913x = true;
                    r3Var.e(f16);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f10, f11);
            case 2:
                kf0 kf0Var = (kf0) viewGroup;
                if (!kf0Var.f36901f && !kf0Var.h && f10 >= 600.0f) {
                    kf0Var.f36900e = false;
                    kf0Var.h = false;
                    kf0Var.a(0.0f, f10 / 6000.0f);
                }
                return false;
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: ki.p3.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
