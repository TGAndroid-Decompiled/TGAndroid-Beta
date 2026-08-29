package dg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import lh.e5;
import lh.h4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e implements GestureDetector.OnGestureListener {
    public final int f5581a;
    public final View f5582b;

    public e(int i10, View view) {
        this.f5581a = i10;
        this.f5582b = view;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.f5581a) {
            case 0:
                i iVar = (i) this.f5582b;
                ValueAnimator valueAnimator = iVar.O;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    iVar.O.cancel();
                    iVar.O = null;
                }
                AnimatorSet animatorSet = iVar.P;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    iVar.P.cancel();
                    iVar.P = null;
                }
                AndroidUtilities.cancelRunOnUIThread(iVar.Q);
                iVar.f5589a = true;
                return true;
            default:
                e5 e5Var = (e5) this.f5582b;
                e5Var.d.abortAnimation();
                ValueAnimator valueAnimator2 = e5Var.I;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllListeners();
                    e5Var.I.cancel();
                    e5Var.I = null;
                }
                e5Var.H = false;
                e5Var.K.f15890w = false;
                return true;
        }
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        switch (this.f5581a) {
            case 0:
                return false;
            default:
                e5 e5Var = (e5) this.f5582b;
                e5Var.d.fling((int) e5Var.f15718e, 0, (int) (-f9), 0, (int) e5Var.f15719f, (int) e5Var.h, 0, 0);
                e5Var.invalidate();
                return false;
        }
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.f5581a) {
            case 0:
                ((i) this.f5582b).g();
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        switch (this.f5581a) {
            case 0:
                a aVar = ((i) this.f5582b).f5590b;
                aVar.d = (f9 * 0.5f) + aVar.d;
                aVar.f5554g = (f10 * 0.05f) + aVar.f5554g;
                return true;
            default:
                e5 e5Var = (e5) this.f5582b;
                float f11 = e5Var.f15718e + f9;
                e5Var.f15718e = f11;
                float f12 = e5Var.f15719f;
                if (f11 < f12) {
                    e5Var.f15718e = f12;
                }
                float f13 = e5Var.f15718e;
                float f14 = e5Var.h;
                if (f13 > f14) {
                    e5Var.f15718e = f14;
                }
                e5Var.invalidate();
                return false;
        }
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
        int i10 = this.f5581a;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.f5581a) {
            case 0:
                float measuredWidth = ((i) this.f5582b).getMeasuredWidth() / 2.0f;
                AndroidUtilities.runOnUIThread(new d(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 0), 16L);
                return true;
            default:
                e5 e5Var = (e5) this.f5582b;
                ArrayList arrayList = e5Var.C;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    h4 h4Var = (h4) arrayList.get(i10);
                    if (((h4) arrayList.get(i10)).f15658a.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                        int i11 = e5Var.G;
                        int i12 = h4Var.f15659b;
                        if (i11 != i12) {
                            e5Var.c(i12, true, false);
                        } else {
                            e5Var.J.n(false);
                        }
                    }
                }
                return false;
        }
    }

    private final void a(MotionEvent motionEvent) {
    }

    private final void b(MotionEvent motionEvent) {
    }

    private final void c(MotionEvent motionEvent) {
    }
}
