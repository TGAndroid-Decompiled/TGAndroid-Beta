package ag;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import ih.h5;
import ih.l4;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f implements GestureDetector.OnGestureListener {
    public final int f196a;
    public final View f197b;

    public f(int i9, View view) {
        this.f196a = i9;
        this.f197b = view;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.f196a) {
            case 0:
                j jVar = (j) this.f197b;
                ValueAnimator valueAnimator = jVar.O;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    jVar.O.cancel();
                    jVar.O = null;
                }
                AnimatorSet animatorSet = jVar.P;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    jVar.P.cancel();
                    jVar.P = null;
                }
                AndroidUtilities.cancelRunOnUIThread(jVar.Q);
                jVar.f204a = true;
                return true;
            default:
                h5 h5Var = (h5) this.f197b;
                h5Var.d.abortAnimation();
                ValueAnimator valueAnimator2 = h5Var.I;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllListeners();
                    h5Var.I.cancel();
                    h5Var.I = null;
                }
                h5Var.H = false;
                h5Var.K.f11898w = false;
                return true;
        }
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        switch (this.f196a) {
            case 0:
                return false;
            default:
                h5 h5Var = (h5) this.f197b;
                h5Var.d.fling((int) h5Var.f11759e, 0, (int) (-f10), 0, (int) h5Var.f11760f, (int) h5Var.h, 0, 0);
                h5Var.invalidate();
                return false;
        }
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.f196a) {
            case 0:
                ((j) this.f197b).g();
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        switch (this.f196a) {
            case 0:
                a aVar = ((j) this.f197b).f205b;
                aVar.d = (f10 * 0.5f) + aVar.d;
                aVar.f167g = (f11 * 0.05f) + aVar.f167g;
                return true;
            default:
                h5 h5Var = (h5) this.f197b;
                float f12 = h5Var.f11759e + f10;
                h5Var.f11759e = f12;
                float f13 = h5Var.f11760f;
                if (f12 < f13) {
                    h5Var.f11759e = f13;
                }
                float f14 = h5Var.f11759e;
                float f15 = h5Var.h;
                if (f14 > f15) {
                    h5Var.f11759e = f15;
                }
                h5Var.invalidate();
                return false;
        }
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
        int i9 = this.f196a;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.f196a) {
            case 0:
                float measuredWidth = ((j) this.f197b).getMeasuredWidth() / 2.0f;
                AndroidUtilities.runOnUIThread(new d(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 0), 16L);
                return true;
            default:
                h5 h5Var = (h5) this.f197b;
                ArrayList arrayList = h5Var.C;
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    l4 l4Var = (l4) arrayList.get(i9);
                    if (((l4) arrayList.get(i9)).f11706a.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                        int i10 = h5Var.G;
                        int i11 = l4Var.f11707b;
                        if (i10 != i11) {
                            h5Var.c(i11, true, false);
                        } else {
                            h5Var.J.n(false);
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
