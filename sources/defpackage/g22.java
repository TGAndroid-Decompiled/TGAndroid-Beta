package defpackage;

import android.graphics.Typeface;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class g22 extends GestureDetector.SimpleOnGestureListener {
    public final byte a;
    public final int b;
    public final ViewGroup c;

    public g22(ViewGroup viewGroup, int i, byte b) {
        this.a = b;
        this.c = viewGroup;
        this.b = i;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                k53 k53Var = (k53) this.c;
                h53 h53Var = k53Var.r;
                if (k53Var.n) {
                    k53Var.removeCallbacks(h53Var);
                }
                k53Var.n = true;
                k53Var.postDelayed(h53Var, 200L);
                k53Var.h.run();
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        nv0 nv0Var;
        byte b = this.a;
        ViewGroup viewGroup = this.c;
        switch (b) {
            case 0:
                i22 i22Var = (i22) viewGroup;
                if (i22Var.d || !i22Var.N) {
                    return false;
                }
                if (i22Var.K && !i22Var.M) {
                    return false;
                }
                if (i22Var.O && !i22Var.b(false)) {
                    return false;
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float x2 = motionEvent2.getX();
                float y2 = motionEvent2.getY();
                Typeface typeface = hl.a;
                float f3 = x2 - x;
                float f4 = y2 - y;
                float sqrt = (float) Math.sqrt((f4 * f4) + (f3 * f3));
                float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
                if (f2 >= hl.L(650.0f) && ((sqrt > hl.L(200.0f) || eventTime > 250.0f) && ((nv0Var = i22Var.y) == null || nv0Var.getScrollY() == 0))) {
                    i22Var.x = true;
                    float f5 = i22Var.r;
                    int i = i22Var.I;
                    if (f5 < i && !i22Var.K) {
                        i22Var.d(0.0f);
                    } else if (i22Var.K && i22Var.M && (i22Var.R == (-i22Var.f) + i22Var.e || (f5 <= (-i) && f2 < hl.L(1200.0f)))) {
                        i22Var.d((-i22Var.f) + i22Var.e);
                    } else {
                        h22 h22Var = i22Var.G;
                        if (h22Var != null) {
                            h22Var.e(false);
                        }
                    }
                } else if (f2 > -700.0f) {
                    return false;
                } else {
                    float f6 = i22Var.r;
                    float f7 = (-i22Var.f) + i22Var.e;
                    if (f6 <= f7) {
                        return false;
                    }
                    i22Var.x = true;
                    i22Var.d(f7);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f, f2);
            case 2:
                fj8 fj8Var = (fj8) viewGroup;
                if (!fj8Var.f && !fj8Var.h && f >= 600.0f) {
                    fj8Var.e = false;
                    fj8Var.h = false;
                    fj8Var.a(0.0f, f / 6000.0f);
                }
                return false;
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r17, android.view.MotionEvent r18, float r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g22.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
