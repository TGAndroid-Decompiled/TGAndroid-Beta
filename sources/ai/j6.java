package ai;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pl0;
public final class j6 implements GestureDetector.OnGestureListener {
    public final int f1031a;
    public final View f1032b;

    public j6(int i10, View view) {
        this.f1031a = i10;
        this.f1032b = view;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.f1031a) {
            case 0:
                l7 l7Var = (l7) this.f1032b;
                l7Var.d.abortAnimation();
                ValueAnimator valueAnimator = l7Var.M;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    l7Var.M.cancel();
                    l7Var.M = null;
                }
                l7Var.L = false;
                l7Var.O.f1505w = false;
                return true;
            default:
                sg.e eVar = (sg.e) this.f1032b;
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
                eVar.f43222a = true;
                return true;
        }
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        switch (this.f1031a) {
            case 0:
                l7 l7Var = (l7) this.f1032b;
                l7Var.d.fling((int) l7Var.e, 0, (int) (-f7), 0, (int) l7Var.f1252f, (int) l7Var.h, 0, 0);
                l7Var.invalidate();
                return false;
            default:
                return false;
        }
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.f1031a) {
            case 0:
                return;
            default:
                ((sg.e) this.f1032b).g();
                return;
        }
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        switch (this.f1031a) {
            case 0:
                l7 l7Var = (l7) this.f1032b;
                float f11 = l7Var.e + f7;
                l7Var.e = f11;
                float f12 = l7Var.f1252f;
                if (f11 < f12) {
                    l7Var.e = f12;
                }
                float f13 = l7Var.e;
                float f14 = l7Var.h;
                if (f13 > f14) {
                    l7Var.e = f14;
                }
                l7Var.invalidate();
                return false;
            default:
                sg.a aVar = ((sg.e) this.f1032b).f43224b;
                aVar.d = (f7 * 0.5f) + aVar.d;
                aVar.f43198g = (f10 * 0.05f) + aVar.f43198g;
                return true;
        }
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
        int i10 = this.f1031a;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.f1031a) {
            case 0:
                l7 l7Var = (l7) this.f1032b;
                ArrayList arrayList = l7Var.G;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    l6 l6Var = (l6) arrayList.get(i10);
                    if (((l6) arrayList.get(i10)).f1184a.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                        int i11 = l7Var.K;
                        int i12 = l6Var.f1185b;
                        if (i11 != i12) {
                            l7Var.c(i12, true, false);
                        } else {
                            l7Var.N.n(false);
                        }
                    }
                }
                return false;
            default:
                float measuredWidth = ((sg.e) this.f1032b).getMeasuredWidth() / 2.0f;
                AndroidUtilities.runOnUIThread(new pl0(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 1), 16L);
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
