package defpackage;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
public final class rm3 extends GestureDetector.SimpleOnGestureListener {
    public final byte a;
    public final View b;

    public rm3(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                tob tobVar = (tob) this.b;
                int i = tobVar.a6;
                boolean z = false;
                if (tobVar.Od == 2 && hs6.d0(i).S() != null) {
                    boolean G5 = tobVar.getMessageObject().G5(k39.b(hs6.d0(i).S()), false);
                    tobVar.z3(tobVar.getMessageObject(), null, false, false, false, false);
                    tobVar.requestLayout();
                    g39.b(false);
                    z = true;
                    if (G5) {
                        uob uobVar = tobVar.Pd;
                        g39.d(uobVar.x, null, uobVar.n[1], null, motionEvent.getX(), motionEvent.getY(), k39.b(hs6.d0(i).S()), tobVar.a6, 0);
                        g39.f();
                    }
                    tobVar.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 10));
                }
                return z;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                sm3 sm3Var = (sm3) this.b;
                sm3Var.n = true;
                sm3Var.a();
                return true;
            case 1:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.a) {
            case 0:
                vs4 vs4Var = ((sm3) this.b).a;
                vs4Var.d -= f * 0.5f;
                vs4Var.i -= f2 * 0.05f;
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                sm3 sm3Var = (sm3) view;
                vs4 vs4Var = sm3Var.a;
                if (Math.abs(vs4Var.d) <= 10.0f) {
                    float max = Math.max(1.0f, sm3Var.getWidth() / 2.0f);
                    float x = ((max - motionEvent.getX()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    float y = ((max - motionEvent.getY()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    sm3Var.a();
                    float f = vs4Var.d;
                    float f2 = vs4Var.i;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    sm3Var.d = ofFloat;
                    ofFloat.setDuration(220L);
                    sm3Var.d.setInterpolator(new PathInterpolator(0.23f, 1.0f, 0.32f, 1.0f));
                    sm3Var.d.addUpdateListener(new zm(this, f, x, f2, y, (byte) 3));
                    sm3Var.d.addListener(new kh2(this, (byte) 13));
                    sm3Var.d.start();
                    return true;
                }
                return true;
            case 1:
                w07 w07Var = ((v07) view).e;
                if (!w07Var.c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (w07Var.f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= w07Var.f.getRight() || w07Var.f.getTop() >= motionEvent.getY() || motionEvent.getY() >= w07Var.f.getBottom())) {
                    w07Var.e(false);
                }
                return super.onSingleTapUp(motionEvent);
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
