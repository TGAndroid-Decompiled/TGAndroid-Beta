package bi;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.dl0;
public final class t5 implements GestureDetector.OnGestureListener {
    public final int f3758a;
    public final View f3759b;

    public t5(int i10, View view) {
        this.f3758a = i10;
        this.f3759b = view;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.f3758a) {
            case 0:
                t6 t6Var = (t6) this.f3759b;
                t6Var.d.abortAnimation();
                ValueAnimator valueAnimator = t6Var.M;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    t6Var.M.cancel();
                    t6Var.M = null;
                }
                t6Var.L = false;
                t6Var.O.f2796w = false;
                return true;
            default:
                tg.e eVar = (tg.e) this.f3759b;
                ValueAnimator valueAnimator2 = eVar.S;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllListeners();
                    eVar.S.cancel();
                    eVar.S = null;
                }
                AnimatorSet animatorSet = eVar.T;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    eVar.T.cancel();
                    eVar.T = null;
                }
                AndroidUtilities.cancelRunOnUIThread(eVar.U);
                eVar.f46545a = true;
                return true;
        }
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        switch (this.f3758a) {
            case 0:
                t6 t6Var = (t6) this.f3759b;
                t6Var.d.fling((int) t6Var.f3976e, 0, (int) (-f7), 0, (int) t6Var.f3977f, (int) t6Var.h, 0, 0);
                t6Var.invalidate();
                return false;
            default:
                return false;
        }
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.f3758a) {
            case 0:
                return;
            default:
                ((tg.e) this.f3759b).g();
                return;
        }
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        switch (this.f3758a) {
            case 0:
                t6 t6Var = (t6) this.f3759b;
                float f11 = t6Var.f3976e + f7;
                t6Var.f3976e = f11;
                float f12 = t6Var.f3977f;
                if (f11 < f12) {
                    t6Var.f3976e = f12;
                }
                float f13 = t6Var.f3976e;
                float f14 = t6Var.h;
                if (f13 > f14) {
                    t6Var.f3976e = f14;
                }
                t6Var.invalidate();
                return false;
            default:
                tg.a aVar = ((tg.e) this.f3759b).f46547b;
                aVar.d = (f7 * 0.5f) + aVar.d;
                aVar.f46521g = (f10 * 0.05f) + aVar.f46521g;
                return true;
        }
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
        int i10 = this.f3758a;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.f3758a) {
            case 0:
                t6 t6Var = (t6) this.f3759b;
                ArrayList arrayList = t6Var.G;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    v5 v5Var = (v5) arrayList.get(i10);
                    if (((v5) arrayList.get(i10)).f3922a.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                        int i11 = t6Var.K;
                        int i12 = v5Var.f3923b;
                        if (i11 != i12) {
                            t6Var.c(i12, true, false);
                        } else {
                            t6Var.N.n(false);
                        }
                    }
                }
                return false;
            default:
                float measuredWidth = ((tg.e) this.f3759b).getMeasuredWidth() / 2.0f;
                AndroidUtilities.runOnUIThread(new dl0(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 1), 16L);
                return true;
        }
    }

    private final void a(MotionEvent motionEvent) {
    }

    private final void b(MotionEvent motionEvent) {
    }

    private final void c(MotionEvent motionEvent) {
    }
}
