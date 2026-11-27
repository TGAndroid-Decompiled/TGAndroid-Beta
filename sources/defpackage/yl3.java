package defpackage;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
public final class yl3 extends GestureDetector.SimpleOnGestureListener {
    public final byte a;
    public final View b;

    public yl3(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                rqb rqbVar = (rqb) this.b;
                int i = rqbVar.a6;
                boolean z = false;
                if (rqbVar.Od == 2 && ls6.d0(i).S() != null) {
                    boolean G5 = rqbVar.getMessageObject().G5(w49.b(ls6.d0(i).S()), false);
                    rqbVar.z3(rqbVar.getMessageObject(), null, false, false, false, false);
                    rqbVar.requestLayout();
                    s49.b(false);
                    z = true;
                    if (G5) {
                        sqb sqbVar = rqbVar.Pd;
                        s49.d(sqbVar.x, null, sqbVar.n[1], null, motionEvent.getX(), motionEvent.getY(), w49.b(ls6.d0(i).S()), rqbVar.a6, 0);
                        s49.f();
                    }
                    rqbVar.getViewTreeObserver().addOnPreDrawListener(new gb(this, (byte) 11));
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
                zl3 zl3Var = (zl3) this.b;
                zl3Var.n = true;
                zl3Var.a();
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
                ys4 ys4Var = ((zl3) this.b).a;
                ys4Var.d -= f * 0.5f;
                ys4Var.i -= f2 * 0.05f;
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
                zl3 zl3Var = (zl3) view;
                ys4 ys4Var = zl3Var.a;
                if (Math.abs(ys4Var.d) <= 10.0f) {
                    float max = Math.max(1.0f, zl3Var.getWidth() / 2.0f);
                    float x = ((max - motionEvent.getX()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    float y = ((max - motionEvent.getY()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    zl3Var.a();
                    float f = ys4Var.d;
                    float f2 = ys4Var.i;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    zl3Var.d = ofFloat;
                    ofFloat.setDuration(220L);
                    zl3Var.d.setInterpolator(new PathInterpolator(0.23f, 1.0f, 0.32f, 1.0f));
                    zl3Var.d.addUpdateListener(new am(this, f, x, f2, y, (byte) 3));
                    zl3Var.d.addListener(new cn2(this, (byte) 11));
                    zl3Var.d.start();
                    return true;
                }
                return true;
            case 1:
                d17 d17Var = ((c17) view).e;
                if (!d17Var.c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (d17Var.f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= d17Var.f.getRight() || d17Var.f.getTop() >= motionEvent.getY() || motionEvent.getY() >= d17Var.f.getBottom())) {
                    d17Var.e(false);
                }
                return super.onSingleTapUp(motionEvent);
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
