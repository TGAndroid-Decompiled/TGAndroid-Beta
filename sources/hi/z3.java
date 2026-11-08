package hi;

import android.graphics.Typeface;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.yq;
public final class z3 extends GestureDetector.SimpleOnGestureListener {
    public final int f15074a;
    public final int f15075b;
    public final ViewGroup f15076c;

    public z3(ViewGroup viewGroup, int i7, int i10) {
        this.f15074a = i10;
        this.f15076c = viewGroup;
        this.f15075b = i7;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f15074a) {
            case 1:
                br brVar = (br) this.f15076c;
                yq yqVar = brVar.f32336r;
                if (brVar.f32335n) {
                    brVar.removeCallbacks(yqVar);
                }
                brVar.f32335n = true;
                brVar.postDelayed(yqVar, 200L);
                brVar.h.run();
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        org.telegram.ui.web.u0 u0Var;
        int i7 = this.f15074a;
        ViewGroup viewGroup = this.f15076c;
        switch (i7) {
            case 0:
                b4 b4Var = (b4) viewGroup;
                if (b4Var.d || !b4Var.M) {
                    return false;
                }
                if (b4Var.J && !b4Var.L) {
                    return false;
                }
                if (b4Var.N && !b4Var.b(false)) {
                    return false;
                }
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                float x11 = motionEvent2.getX();
                float y11 = motionEvent2.getY();
                Typeface typeface = org.telegram.messenger.g0.f22535a;
                float f12 = x11 - x10;
                float f13 = y11 - y10;
                float sqrt = (float) Math.sqrt((f13 * f13) + (f12 * f12));
                float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
                if (f11 >= org.telegram.messenger.g0.L(650.0f) && ((sqrt > org.telegram.messenger.g0.L(200.0f) || eventTime > 250.0f) && ((u0Var = b4Var.f14571y) == null || u0Var.getScrollY() == 0))) {
                    b4Var.f14570x = true;
                    float f14 = b4Var.f14567r;
                    int i10 = b4Var.H;
                    if (f14 < i10 && !b4Var.J) {
                        b4Var.e(0.0f);
                    } else if (b4Var.J && b4Var.L && (b4Var.Q == (-b4Var.f14565f) + b4Var.f14564e || (f14 <= (-i10) && f11 < org.telegram.messenger.g0.L(1200.0f)))) {
                        b4Var.e((-b4Var.f14565f) + b4Var.f14564e);
                    } else {
                        a4 a4Var = b4Var.F;
                        if (a4Var != null) {
                            a4Var.q(false);
                        }
                    }
                } else if (f11 > -700.0f) {
                    return false;
                } else {
                    float f15 = b4Var.f14567r;
                    float f16 = (-b4Var.f14565f) + b4Var.f14564e;
                    if (f15 <= f16) {
                        return false;
                    }
                    b4Var.f14570x = true;
                    b4Var.e(f16);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f10, f11);
            case 2:
                ve0 ve0Var = (ve0) viewGroup;
                if (!ve0Var.f38991f && !ve0Var.h && f10 >= 600.0f) {
                    ve0Var.f38990e = false;
                    ve0Var.h = false;
                    ve0Var.a(0.0f, f10 / 6000.0f);
                }
                return false;
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: hi.z3.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
