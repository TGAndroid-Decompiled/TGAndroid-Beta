package fg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import nh.f5;
import nh.h4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e implements GestureDetector.OnGestureListener {
    public final int f6147a;
    public final View f6148b;

    public e(int i10, View view) {
        this.f6147a = i10;
        this.f6148b = view;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.f6147a) {
            case 0:
                i iVar = (i) this.f6148b;
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
                iVar.f6155a = true;
                return true;
            default:
                f5 f5Var = (f5) this.f6148b;
                f5Var.d.abortAnimation();
                ValueAnimator valueAnimator2 = f5Var.J;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllListeners();
                    f5Var.J.cancel();
                    f5Var.J = null;
                }
                f5Var.I = false;
                f5Var.L.f15595w = false;
                return true;
        }
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        switch (this.f6147a) {
            case 0:
                return false;
            default:
                f5 f5Var = (f5) this.f6148b;
                f5Var.d.fling((int) f5Var.e, 0, (int) (-f10), 0, (int) f5Var.f15391f, (int) f5Var.h, 0, 0);
                f5Var.invalidate();
                return false;
        }
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.f6147a) {
            case 0:
                ((i) this.f6148b).g();
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        switch (this.f6147a) {
            case 0:
                a aVar = ((i) this.f6148b).f6156b;
                aVar.d = (f10 * 0.5f) + aVar.d;
                aVar.f6121g = (f11 * 0.05f) + aVar.f6121g;
                return true;
            default:
                f5 f5Var = (f5) this.f6148b;
                float f12 = f5Var.e + f10;
                f5Var.e = f12;
                float f13 = f5Var.f15391f;
                if (f12 < f13) {
                    f5Var.e = f13;
                }
                float f14 = f5Var.e;
                float f15 = f5Var.h;
                if (f14 > f15) {
                    f5Var.e = f15;
                }
                f5Var.invalidate();
                return false;
        }
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
        int i10 = this.f6147a;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.f6147a) {
            case 0:
                float measuredWidth = ((i) this.f6148b).getMeasuredWidth() / 2.0f;
                AndroidUtilities.runOnUIThread(new d(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 0), 16L);
                return true;
            default:
                f5 f5Var = (f5) this.f6148b;
                ArrayList arrayList = f5Var.D;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    h4 h4Var = (h4) arrayList.get(i10);
                    if (((h4) arrayList.get(i10)).f15358a.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                        int i11 = f5Var.H;
                        int i12 = h4Var.f15359b;
                        if (i11 != i12) {
                            f5Var.c(i12, true, false);
                        } else {
                            f5Var.K.n(false);
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
