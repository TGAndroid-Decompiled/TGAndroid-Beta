package lg;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import org.telegram.messenger.vi;
import org.telegram.ui.ActionBar.l1;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Cells.z9;
import sg.k0;
import sg.o0;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public final int f11865a;
    public final View f11866b;

    public f(int i10, View view) {
        this.f11865a = i10;
        this.f11866b = view;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.f11865a) {
            case 2:
                y9 y9Var = (y9) this.f11866b;
                int i10 = y9Var.Y5;
                boolean z10 = false;
                if (y9Var.f23629kd == 2 && vi.b0(i10).Q() != null) {
                    boolean G5 = y9Var.getMessageObject().G5(o0.b(vi.b0(i10).Q()), false);
                    y9Var.s3(y9Var.getMessageObject(), null, false, false, false, false);
                    y9Var.requestLayout();
                    k0.b(false);
                    z10 = true;
                    if (G5) {
                        z9 z9Var = y9Var.f23630ld;
                        k0.d(z9Var.f23662x, null, z9Var.f23658n[1], null, motionEvent.getX(), motionEvent.getY(), o0.b(vi.b0(i10).Q()), y9Var.Y5, 0);
                        k0.f();
                    }
                    y9Var.getViewTreeObserver().addOnPreDrawListener(new l1(this, 1));
                }
                return z10;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f11865a) {
            case 0:
                g gVar = (g) this.f11866b;
                gVar.f11871n = true;
                gVar.b();
                return true;
            case 1:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        switch (this.f11865a) {
            case 0:
                h hVar = ((g) this.f11866b).f11867a;
                hVar.d -= f7 * 0.5f;
                hVar.f11882i -= f10 * 0.05f;
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f7, f10);
        }
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int i10 = this.f11865a;
        View view = this.f11866b;
        switch (i10) {
            case 0:
                g gVar = (g) view;
                h hVar = gVar.f11867a;
                if (Math.abs(hVar.d) <= 10.0f) {
                    float max = Math.max(1.0f, gVar.getWidth() / 2.0f);
                    float x10 = ((max - motionEvent.getX()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    float y3 = ((max - motionEvent.getY()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    gVar.b();
                    float f7 = hVar.d;
                    float f10 = hVar.f11882i;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    gVar.d = ofFloat;
                    ofFloat.setDuration(220L);
                    gVar.d.setInterpolator(new PathInterpolator(0.23f, 1.0f, 0.32f, 1.0f));
                    gVar.d.addUpdateListener(new bg.j(this, f7, x10, f10, y3, 1));
                    gVar.d.addListener(new bg.e(this, 9));
                    gVar.d.start();
                    return true;
                }
                return true;
            case 1:
                oh.o oVar = (oh.o) view;
                if (!oVar.e.f14285c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (oVar.e.f14286f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= oVar.e.f14286f.getRight() || oVar.e.f14286f.getTop() >= motionEvent.getY() || motionEvent.getY() >= oVar.e.f14286f.getBottom())) {
                    oVar.e.e(false);
                }
                return super.onSingleTapUp(motionEvent);
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
