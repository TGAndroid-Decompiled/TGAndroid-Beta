package bg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import jh.d5;
import jh.h4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class e implements GestureDetector.OnGestureListener {

    public final int f2120a;

    public final View f2121b;

    public e(int i10, View view) {
        this.f2120a = i10;
        this.f2121b = view;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.f2120a) {
            case 0:
                i iVar = (i) this.f2121b;
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
                iVar.f2128a = true;
                break;
            default:
                d5 d5Var = (d5) this.f2121b;
                d5Var.d.abortAnimation();
                ValueAnimator valueAnimator2 = d5Var.I;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllListeners();
                    d5Var.I.cancel();
                    d5Var.I = null;
                }
                d5Var.H = false;
                d5Var.K.f13585w = false;
                break;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        switch (this.f2120a) {
            case 0:
                break;
            default:
                d5 d5Var = (d5) this.f2121b;
                d5Var.d.fling((int) d5Var.f13440e, 0, (int) (-f10), 0, (int) d5Var.f13441f, (int) d5Var.h, 0, 0);
                d5Var.invalidate();
                break;
        }
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.f2120a) {
            case 0:
                ((i) this.f2121b).g();
                break;
        }
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        switch (this.f2120a) {
            case 0:
                a aVar = ((i) this.f2121b).f2129b;
                aVar.d = (f10 * 0.5f) + aVar.d;
                aVar.f2093g = (f11 * 0.05f) + aVar.f2093g;
                return true;
            default:
                d5 d5Var = (d5) this.f2121b;
                float f12 = d5Var.f13440e + f10;
                d5Var.f13440e = f12;
                float f13 = d5Var.f13441f;
                if (f12 < f13) {
                    d5Var.f13440e = f13;
                }
                float f14 = d5Var.f13440e;
                float f15 = d5Var.h;
                if (f14 > f15) {
                    d5Var.f13440e = f15;
                }
                d5Var.invalidate();
                return false;
        }
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
        int i10 = this.f2120a;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.f2120a) {
            case 0:
                float measuredWidth = ((i) this.f2121b).getMeasuredWidth() / 2.0f;
                AndroidUtilities.runOnUIThread(new d(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 0), 16L);
                return true;
            default:
                d5 d5Var = (d5) this.f2121b;
                ArrayList arrayList = d5Var.C;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    h4 h4Var = (h4) arrayList.get(i10);
                    if (((h4) arrayList.get(i10)).f13381a.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                        int i11 = d5Var.G;
                        int i12 = h4Var.f13382b;
                        if (i11 != i12) {
                            d5Var.c(i12, true, false);
                        } else {
                            d5Var.J.n(false);
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
