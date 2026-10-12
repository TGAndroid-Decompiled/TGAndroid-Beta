package ne;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import m4.w;
public final class b {
    public final a f16588a;
    public w f16589b;
    public int f16590c;
    public float d;
    public float f16591e;
    public float f16592f;
    public float f16593g;

    public b(a aVar) {
        this.f16588a = aVar;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        a aVar = this.f16588a;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (this.f16590c & 1) != 0) {
                        b(view, x10, y3);
                        return true;
                    }
                } else if ((this.f16590c & 1) != 0) {
                    aVar.onClickTouchMove(view, x10, y3);
                    if ((this.f16590c & 4) != 0) {
                        aVar.onLongPressMove(view, motionEvent, x10, y3, this.f16592f, this.f16593g);
                        return true;
                    }
                    if (aVar.needCancelTouchBySlopMove() && Math.max(Math.abs(this.d - x10), Math.abs(this.f16591e - y3)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        b(view, x10, y3);
                        return true;
                    }
                    return true;
                }
            } else {
                int i10 = this.f16590c;
                if ((i10 & 1) != 0) {
                    if ((i10 & 4) != 0) {
                        aVar.onLongPressFinish(view, x10, y3);
                        this.f16590c &= -5;
                    } else {
                        aVar.onClickAt(view, x10, y3);
                        if ((this.f16590c & 256) == 0 && view != null) {
                            view.playSoundEffect(0);
                        }
                    }
                    b(view, x10, y3);
                    return true;
                }
            }
            if ((this.f16590c & 1) == 0) {
                return false;
            }
            return true;
        }
        b(view, x10, y3);
        if (aVar.needClickAt(view, x10, y3)) {
            this.f16590c |= 1;
            this.d = x10;
            this.f16591e = y3;
            aVar.onClickTouchDown(view, x10, y3);
            if (aVar.needLongPress(x10, y3) && view != null) {
                if (this.f16589b == null) {
                    this.f16590c |= 2;
                    w wVar = new w(6, this, view);
                    this.f16589b = wVar;
                    view.postDelayed(wVar, aVar.getLongPressDuration());
                    return true;
                }
                throw new AssertionError();
            }
            return true;
        }
        return false;
    }

    public final void b(View view, float f7, float f10) {
        int i10 = this.f16590c;
        if ((i10 & 2) != 0) {
            this.f16590c = i10 & (-3);
            w wVar = this.f16589b;
            if (wVar != null) {
                view.removeCallbacks(wVar);
                this.f16589b = null;
            } else {
                throw new AssertionError();
            }
        }
        int i11 = this.f16590c;
        int i12 = i11 & 8;
        a aVar = this.f16588a;
        if (i12 != 0) {
            this.f16590c = i11 & (-9);
            aVar.onLongPressCancelled(view, f7, f10);
        }
        if ((this.f16590c & 4) != 0) {
            aVar.onLongPressFinish(view, f7, f10);
            this.f16590c &= -5;
        }
        if ((this.f16590c & 1) != 0) {
            aVar.onClickTouchUp(view, f7, f10);
            this.f16590c &= -2;
        }
    }
}
