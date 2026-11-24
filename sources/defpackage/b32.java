package defpackage;

import android.graphics.Typeface;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class b32 extends GestureDetector.SimpleOnGestureListener {
    public final byte a;
    public final int b;
    public final ViewGroup c;

    public b32(ViewGroup viewGroup, int i, byte b) {
        this.a = b;
        this.c = viewGroup;
        this.b = i;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                d63 d63Var = (d63) this.c;
                a63 a63Var = d63Var.r;
                if (d63Var.n) {
                    d63Var.removeCallbacks(a63Var);
                }
                d63Var.n = true;
                d63Var.postDelayed(a63Var, 200L);
                d63Var.h.run();
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        mw0 mw0Var;
        byte b = this.a;
        ViewGroup viewGroup = this.c;
        switch (b) {
            case 0:
                d32 d32Var = (d32) viewGroup;
                if (d32Var.d || !d32Var.N) {
                    return false;
                }
                if (d32Var.K && !d32Var.M) {
                    return false;
                }
                if (d32Var.O && !d32Var.b(false)) {
                    return false;
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float x2 = motionEvent2.getX();
                float y2 = motionEvent2.getY();
                Typeface typeface = gm.a;
                float f3 = x2 - x;
                float f4 = y2 - y;
                float sqrt = (float) Math.sqrt((f4 * f4) + (f3 * f3));
                float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
                if (f2 >= gm.L(650.0f) && ((sqrt > gm.L(200.0f) || eventTime > 250.0f) && ((mw0Var = d32Var.y) == null || mw0Var.getScrollY() == 0))) {
                    d32Var.x = true;
                    float f5 = d32Var.r;
                    int i = d32Var.I;
                    if (f5 < i && !d32Var.K) {
                        d32Var.d(0.0f);
                    } else if (d32Var.K && d32Var.M && (d32Var.R == (-d32Var.f) + d32Var.e || (f5 <= (-i) && f2 < gm.L(1200.0f)))) {
                        d32Var.d((-d32Var.f) + d32Var.e);
                    } else {
                        c32 c32Var = d32Var.G;
                        if (c32Var != null) {
                            c32Var.e(false);
                        }
                    }
                } else if (f2 > -700.0f) {
                    return false;
                } else {
                    float f6 = d32Var.r;
                    float f7 = (-d32Var.f) + d32Var.e;
                    if (f6 <= f7) {
                        return false;
                    }
                    d32Var.x = true;
                    d32Var.d(f7);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f, f2);
            case 2:
                th8 th8Var = (th8) viewGroup;
                if (!th8Var.f && !th8Var.h && f >= 600.0f) {
                    th8Var.e = false;
                    th8Var.h = false;
                    th8Var.a(0.0f, f / 6000.0f);
                }
                return false;
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r17, android.view.MotionEvent r18, float r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b32.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
