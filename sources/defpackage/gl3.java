package defpackage;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
public final class gl3 extends GestureDetector.SimpleOnGestureListener {
    public final byte a;
    public final View b;

    public gl3(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                smb smbVar = (smb) this.b;
                int i = smbVar.a6;
                boolean z = false;
                if (smbVar.Od == 2 && hq6.d0(i).S() != null) {
                    boolean G5 = smbVar.getMessageObject().G5(h19.b(hq6.d0(i).S()), false);
                    smbVar.z3(smbVar.getMessageObject(), null, false, false, false, false);
                    smbVar.requestLayout();
                    d19.b(false);
                    z = true;
                    if (G5) {
                        tmb tmbVar = smbVar.Pd;
                        d19.d(tmbVar.x, null, tmbVar.n[1], null, motionEvent.getX(), motionEvent.getY(), h19.b(hq6.d0(i).S()), smbVar.a6, 0);
                        d19.f();
                    }
                    smbVar.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 10));
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
                hl3 hl3Var = (hl3) this.b;
                hl3Var.n = true;
                hl3Var.a();
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
                uq4 uq4Var = ((hl3) this.b).a;
                uq4Var.d -= f * 0.5f;
                uq4Var.i -= f2 * 0.05f;
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
                hl3 hl3Var = (hl3) view;
                uq4 uq4Var = hl3Var.a;
                if (Math.abs(uq4Var.d) <= 10.0f) {
                    float max = Math.max(1.0f, hl3Var.getWidth() / 2.0f);
                    float x = ((max - motionEvent.getX()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    float y = ((max - motionEvent.getY()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    hl3Var.a();
                    float f = uq4Var.d;
                    float f2 = uq4Var.i;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    hl3Var.d = ofFloat;
                    ofFloat.setDuration(220L);
                    hl3Var.d.setInterpolator(new PathInterpolator(0.23f, 1.0f, 0.32f, 1.0f));
                    hl3Var.d.addUpdateListener(new zl(this, f, x, f2, y, (byte) 3));
                    hl3Var.d.addListener(new im2(this, (byte) 11));
                    hl3Var.d.start();
                    return true;
                }
                return true;
            case 1:
                wy6 wy6Var = ((vy6) view).e;
                if (!wy6Var.c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (wy6Var.f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= wy6Var.f.getRight() || wy6Var.f.getTop() >= motionEvent.getY() || motionEvent.getY() >= wy6Var.f.getBottom())) {
                    wy6Var.e(false);
                }
                return super.onSingleTapUp(motionEvent);
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
