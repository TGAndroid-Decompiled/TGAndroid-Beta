package ii;

import android.graphics.Typeface;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.Components.yq;
public final class a4 extends GestureDetector.SimpleOnGestureListener {
    public final int f14829a;
    public final int f14830b;
    public final ViewGroup f14831c;

    public a4(ViewGroup viewGroup, int i3, int i10) {
        this.f14829a = i10;
        this.f14831c = viewGroup;
        this.f14830b = i3;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f14829a) {
            case 1:
                br brVar = (br) this.f14831c;
                yq yqVar = brVar.f32373r;
                if (brVar.f32372n) {
                    brVar.removeCallbacks(yqVar);
                }
                brVar.f32372n = true;
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
        org.telegram.ui.web.t0 t0Var;
        int i3 = this.f14829a;
        ViewGroup viewGroup = this.f14831c;
        switch (i3) {
            case 0:
                c4 c4Var = (c4) viewGroup;
                if (c4Var.d || !c4Var.N) {
                    return false;
                }
                if (c4Var.K && !c4Var.M) {
                    return false;
                }
                if (c4Var.O && !c4Var.b(false)) {
                    return false;
                }
                float x10 = motionEvent.getX();
                float y9 = motionEvent.getY();
                float x11 = motionEvent2.getX();
                float y10 = motionEvent2.getY();
                Typeface typeface = org.telegram.messenger.g0.f22580a;
                float f12 = x11 - x10;
                float f13 = y10 - y9;
                float sqrt = (float) Math.sqrt((f13 * f13) + (f12 * f12));
                float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
                if (f11 >= org.telegram.messenger.g0.L(650.0f) && ((sqrt > org.telegram.messenger.g0.L(200.0f) || eventTime > 250.0f) && ((t0Var = c4Var.f14884y) == null || t0Var.getScrollY() == 0))) {
                    c4Var.f14883x = true;
                    float f14 = c4Var.f14880r;
                    int i10 = c4Var.I;
                    if (f14 < i10 && !c4Var.K) {
                        c4Var.e(0.0f);
                    } else if (c4Var.K && c4Var.M && (c4Var.R == (-c4Var.f14878f) + c4Var.f14877e || (f14 <= (-i10) && f11 < org.telegram.messenger.g0.L(1200.0f)))) {
                        c4Var.e((-c4Var.f14878f) + c4Var.f14877e);
                    } else {
                        b4 b4Var = c4Var.G;
                        if (b4Var != null) {
                            b4Var.a(false);
                        }
                    }
                } else if (f11 > -700.0f) {
                    return false;
                } else {
                    float f15 = c4Var.f14880r;
                    float f16 = (-c4Var.f14878f) + c4Var.f14877e;
                    if (f15 <= f16) {
                        return false;
                    }
                    c4Var.f14883x = true;
                    c4Var.e(f16);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f10, f11);
            case 2:
                xe0 xe0Var = (xe0) viewGroup;
                if (!xe0Var.f40332f && !xe0Var.h && f10 >= 600.0f) {
                    xe0Var.f40331e = false;
                    xe0Var.h = false;
                    xe0Var.a(0.0f, f10 / 6000.0f);
                }
                return false;
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: ii.a4.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
