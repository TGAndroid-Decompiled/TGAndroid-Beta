package defpackage;

import android.graphics.Typeface;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class p12 extends GestureDetector.SimpleOnGestureListener {
    public final byte a;
    public final int b;
    public final ViewGroup c;

    public p12(ViewGroup viewGroup, int i, byte b) {
        this.a = b;
        this.c = viewGroup;
        this.b = i;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                s43 s43Var = (s43) this.c;
                p43 p43Var = s43Var.r;
                if (s43Var.n) {
                    s43Var.removeCallbacks(p43Var);
                }
                s43Var.n = true;
                s43Var.postDelayed(p43Var, 200L);
                s43Var.h.run();
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        cv0 cv0Var;
        byte b = this.a;
        ViewGroup viewGroup = this.c;
        switch (b) {
            case 0:
                r12 r12Var = (r12) viewGroup;
                if (r12Var.d || !r12Var.N) {
                    return false;
                }
                if (r12Var.K && !r12Var.M) {
                    return false;
                }
                if (r12Var.O && !r12Var.b(false)) {
                    return false;
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float x2 = motionEvent2.getX();
                float y2 = motionEvent2.getY();
                Typeface typeface = gl.a;
                float f3 = x2 - x;
                float f4 = y2 - y;
                float sqrt = (float) Math.sqrt((f4 * f4) + (f3 * f3));
                float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
                if (f2 >= gl.L(650.0f) && ((sqrt > gl.L(200.0f) || eventTime > 250.0f) && ((cv0Var = r12Var.y) == null || cv0Var.getScrollY() == 0))) {
                    r12Var.x = true;
                    float f5 = r12Var.r;
                    int i = r12Var.I;
                    if (f5 < i && !r12Var.K) {
                        r12Var.d(0.0f);
                    } else if (r12Var.K && r12Var.M && (r12Var.R == (-r12Var.f) + r12Var.e || (f5 <= (-i) && f2 < gl.L(1200.0f)))) {
                        r12Var.d((-r12Var.f) + r12Var.e);
                    } else {
                        q12 q12Var = r12Var.G;
                        if (q12Var != null) {
                            q12Var.d(false);
                        }
                    }
                } else if (f2 > -700.0f) {
                    return false;
                } else {
                    float f6 = r12Var.r;
                    float f7 = (-r12Var.f) + r12Var.e;
                    if (f6 <= f7) {
                        return false;
                    }
                    r12Var.x = true;
                    r12Var.d(f7);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f, f2);
            case 2:
                rf8 rf8Var = (rf8) viewGroup;
                if (!rf8Var.f && !rf8Var.h && f >= 600.0f) {
                    rf8Var.e = false;
                    rf8Var.h = false;
                    rf8Var.a(0.0f, f / 6000.0f);
                }
                return false;
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r17, android.view.MotionEvent r18, float r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p12.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
