package gg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import oh.g5;
import oh.j4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e implements GestureDetector.OnGestureListener {
    public final int f7078a;
    public final View f7079b;

    public e(int i10, View view) {
        this.f7078a = i10;
        this.f7079b = view;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.f7078a) {
            case 0:
                i iVar = (i) this.f7079b;
                ValueAnimator valueAnimator = iVar.P;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    iVar.P.cancel();
                    iVar.P = null;
                }
                AnimatorSet animatorSet = iVar.Q;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    iVar.Q.cancel();
                    iVar.Q = null;
                }
                AndroidUtilities.cancelRunOnUIThread(iVar.R);
                iVar.f7086a = true;
                return true;
            default:
                g5 g5Var = (g5) this.f7079b;
                g5Var.d.abortAnimation();
                ValueAnimator valueAnimator2 = g5Var.J;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllListeners();
                    g5Var.J.cancel();
                    g5Var.J = null;
                }
                g5Var.I = false;
                g5Var.L.f17497w = false;
                return true;
        }
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        switch (this.f7078a) {
            case 0:
                return false;
            default:
                g5 g5Var = (g5) this.f7079b;
                g5Var.d.fling((int) g5Var.f17355e, 0, (int) (-f10), 0, (int) g5Var.f17356f, (int) g5Var.h, 0, 0);
                g5Var.invalidate();
                return false;
        }
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.f7078a) {
            case 0:
                ((i) this.f7079b).g();
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        switch (this.f7078a) {
            case 0:
                a aVar = ((i) this.f7079b).f7087b;
                aVar.d = (f10 * 0.5f) + aVar.d;
                aVar.f7051g = (f11 * 0.05f) + aVar.f7051g;
                return true;
            default:
                g5 g5Var = (g5) this.f7079b;
                float f12 = g5Var.f17355e + f10;
                g5Var.f17355e = f12;
                float f13 = g5Var.f17356f;
                if (f12 < f13) {
                    g5Var.f17355e = f13;
                }
                float f14 = g5Var.f17355e;
                float f15 = g5Var.h;
                if (f14 > f15) {
                    g5Var.f17355e = f15;
                }
                g5Var.invalidate();
                return false;
        }
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
        int i10 = this.f7078a;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.f7078a) {
            case 0:
                float measuredWidth = ((i) this.f7079b).getMeasuredWidth() / 2.0f;
                AndroidUtilities.runOnUIThread(new d(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 0), 16L);
                return true;
            default:
                g5 g5Var = (g5) this.f7079b;
                ArrayList arrayList = g5Var.D;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    j4 j4Var = (j4) arrayList.get(i10);
                    if (((j4) arrayList.get(i10)).f17332a.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                        int i11 = g5Var.H;
                        int i12 = j4Var.f17333b;
                        if (i11 != i12) {
                            g5Var.c(i12, true, false);
                        } else {
                            g5Var.K.n(false);
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
