package ki;

import android.graphics.Typeface;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.ye0;
public final class v3 extends GestureDetector.SimpleOnGestureListener {
    public final int f18604a;
    public final int f18605b;
    public final ViewGroup f18606c;

    public v3(ViewGroup viewGroup, int i7, int i10) {
        this.f18604a = i10;
        this.f18606c = viewGroup;
        this.f18605b = i7;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f18604a) {
            case 1:
                ir irVar = (ir) this.f18606c;
                fr frVar = irVar.f35694r;
                if (irVar.f35693n) {
                    irVar.removeCallbacks(frVar);
                }
                irVar.f35693n = true;
                irVar.postDelayed(frVar, 200L);
                irVar.h.run();
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
        int i7 = this.f18604a;
        ViewGroup viewGroup = this.f18606c;
        switch (i7) {
            case 0:
                x3 x3Var = (x3) viewGroup;
                if (x3Var.d || !x3Var.N) {
                    return false;
                }
                if (x3Var.K && !x3Var.M) {
                    return false;
                }
                if (x3Var.O && !x3Var.b(false)) {
                    return false;
                }
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                float x11 = motionEvent2.getX();
                float y11 = motionEvent2.getY();
                Typeface typeface = org.telegram.messenger.g0.f23583a;
                float f12 = x11 - x10;
                float f13 = y11 - y10;
                float sqrt = (float) Math.sqrt((f13 * f13) + (f12 * f12));
                float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
                if (f11 >= org.telegram.messenger.g0.L(650.0f) && ((sqrt > org.telegram.messenger.g0.L(200.0f) || eventTime > 250.0f) && ((s0Var = x3Var.f18701y) == null || s0Var.getScrollY() == 0))) {
                    x3Var.f18700x = true;
                    float f14 = x3Var.f18697r;
                    int i10 = x3Var.I;
                    if (f14 < i10 && !x3Var.K) {
                        x3Var.e(0.0f);
                    } else if (x3Var.K && x3Var.M && (x3Var.R == (-x3Var.f18695f) + x3Var.f18694e || (f14 <= (-i10) && f11 < org.telegram.messenger.g0.L(1200.0f)))) {
                        x3Var.e((-x3Var.f18695f) + x3Var.f18694e);
                    } else {
                        w3 w3Var = x3Var.G;
                        if (w3Var != null) {
                            w3Var.b(false);
                        }
                    }
                } else if (f11 > -700.0f) {
                    return false;
                } else {
                    float f15 = x3Var.f18697r;
                    float f16 = (-x3Var.f18695f) + x3Var.f18694e;
                    if (f15 <= f16) {
                        return false;
                    }
                    x3Var.f18700x = true;
                    x3Var.e(f16);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f10, f11);
            case 2:
                ye0 ye0Var = (ye0) viewGroup;
                if (!ye0Var.f41985f && !ye0Var.h && f10 >= 600.0f) {
                    ye0Var.f41984e = false;
                    ye0Var.h = false;
                    ye0Var.a(0.0f, f10 / 6000.0f);
                }
                return false;
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: ki.v3.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
