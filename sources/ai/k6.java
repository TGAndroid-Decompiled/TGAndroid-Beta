package ai;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.el0;
public final class k6 implements GestureDetector.OnGestureListener {
    public final int f1135a;
    public final View f1136b;

    public k6(int i10, View view) {
        this.f1135a = i10;
        this.f1136b = view;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.f1135a) {
            case 0:
                k7 k7Var = (k7) this.f1136b;
                k7Var.d.abortAnimation();
                ValueAnimator valueAnimator = k7Var.M;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    k7Var.M.cancel();
                    k7Var.M = null;
                }
                k7Var.L = false;
                k7Var.O.f1478w = false;
                return true;
            default:
                sg.e eVar = (sg.e) this.f1136b;
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
                eVar.f42957a = true;
                return true;
        }
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        switch (this.f1135a) {
            case 0:
                k7 k7Var = (k7) this.f1136b;
                k7Var.d.fling((int) k7Var.e, 0, (int) (-f7), 0, (int) k7Var.f1293f, (int) k7Var.h, 0, 0);
                k7Var.invalidate();
                return false;
            default:
                return false;
        }
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.f1135a) {
            case 0:
                return;
            default:
                ((sg.e) this.f1136b).g();
                return;
        }
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        switch (this.f1135a) {
            case 0:
                k7 k7Var = (k7) this.f1136b;
                float f11 = k7Var.e + f7;
                k7Var.e = f11;
                float f12 = k7Var.f1293f;
                if (f11 < f12) {
                    k7Var.e = f12;
                }
                float f13 = k7Var.e;
                float f14 = k7Var.h;
                if (f13 > f14) {
                    k7Var.e = f14;
                }
                k7Var.invalidate();
                return false;
            default:
                sg.a aVar = ((sg.e) this.f1136b).f42959b;
                aVar.d = (f7 * 0.5f) + aVar.d;
                aVar.f42933g = (f10 * 0.05f) + aVar.f42933g;
                return true;
        }
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
        int i10 = this.f1135a;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.f1135a) {
            case 0:
                k7 k7Var = (k7) this.f1136b;
                ArrayList arrayList = k7Var.G;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    m6 m6Var = (m6) arrayList.get(i10);
                    if (((m6) arrayList.get(i10)).f1251a.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                        int i11 = k7Var.K;
                        int i12 = m6Var.f1252b;
                        if (i11 != i12) {
                            k7Var.c(i12, true, false);
                        } else {
                            k7Var.N.n(false);
                        }
                    }
                }
                return false;
            default:
                float measuredWidth = ((sg.e) this.f1136b).getMeasuredWidth() / 2.0f;
                AndroidUtilities.runOnUIThread(new el0(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 1), 16L);
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
