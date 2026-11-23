package ki;

import android.graphics.Typeface;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.or;
public final class q3 extends GestureDetector.SimpleOnGestureListener {
    public final int f18945a;
    public final int f18946b;
    public final ViewGroup f18947c;

    public q3(ViewGroup viewGroup, int i7, int i10) {
        this.f18945a = i10;
        this.f18947c = viewGroup;
        this.f18946b = i7;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f18945a) {
            case 1:
                or orVar = (or) this.f18947c;
                lr lrVar = orVar.f38257r;
                if (orVar.f38256n) {
                    orVar.removeCallbacks(lrVar);
                }
                orVar.f38256n = true;
                orVar.postDelayed(lrVar, 200L);
                orVar.h.run();
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
        int i7 = this.f18945a;
        ViewGroup viewGroup = this.f18947c;
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
                Typeface typeface = org.telegram.messenger.g0.f24198a;
                float f12 = x11 - x10;
                float f13 = y11 - y10;
                float sqrt = (float) Math.sqrt((f13 * f13) + (f12 * f12));
                float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
                if (f11 >= org.telegram.messenger.g0.L(650.0f) && ((sqrt > org.telegram.messenger.g0.L(200.0f) || eventTime > 250.0f) && ((s0Var = s3Var.f19000y) == null || s0Var.getScrollY() == 0))) {
                    s3Var.f18999x = true;
                    float f14 = s3Var.f18996r;
                    int i10 = s3Var.I;
                    if (f14 < i10 && !s3Var.K) {
                        s3Var.e(0.0f);
                    } else if (s3Var.K && s3Var.M && (s3Var.R == (-s3Var.f18994f) + s3Var.f18993e || (f14 <= (-i10) && f11 < org.telegram.messenger.g0.L(1200.0f)))) {
                        s3Var.e((-s3Var.f18994f) + s3Var.f18993e);
                    } else {
                        r3 r3Var = s3Var.G;
                        if (r3Var != null) {
                            r3Var.b(false);
                        }
                    }
                } else if (f11 > -700.0f) {
                    return false;
                } else {
                    float f15 = s3Var.f18996r;
                    float f16 = (-s3Var.f18994f) + s3Var.f18993e;
                    if (f15 <= f16) {
                        return false;
                    }
                    s3Var.f18999x = true;
                    s3Var.e(f16);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f10, f11);
            case 2:
                jf0 jf0Var = (jf0) viewGroup;
                if (!jf0Var.f36402f && !jf0Var.h && f10 >= 600.0f) {
                    jf0Var.f36401e = false;
                    jf0Var.h = false;
                    jf0Var.a(0.0f, f10 / 6000.0f);
                }
                return false;
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: ki.q3.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
