package me;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ki.c0;
public final class b {
    public final a f14980a;
    public c0 f14981b;
    public int f14982c;
    public float d;
    public float e;
    public float f14983f;
    public float f14984g;

    public b(a aVar) {
        this.f14980a = aVar;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        a aVar = this.f14980a;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (this.f14982c & 1) != 0) {
                        b(view, x10, y3);
                        return true;
                    }
                } else if ((this.f14982c & 1) != 0) {
                    aVar.onClickTouchMove(view, x10, y3);
                    if ((this.f14982c & 4) != 0) {
                        aVar.onLongPressMove(view, motionEvent, x10, y3, this.f14983f, this.f14984g);
                        return true;
                    }
                    if (aVar.needCancelTouchBySlopMove() && Math.max(Math.abs(this.d - x10), Math.abs(this.e - y3)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        b(view, x10, y3);
                        return true;
                    }
                    return true;
                }
            } else {
                int i10 = this.f14982c;
                if ((i10 & 1) != 0) {
                    if ((i10 & 4) != 0) {
                        aVar.onLongPressFinish(view, x10, y3);
                        this.f14982c &= -5;
                    } else {
                        aVar.onClickAt(view, x10, y3);
                        if ((this.f14982c & 256) == 0 && view != null) {
                            view.playSoundEffect(0);
                        }
                    }
                    b(view, x10, y3);
                    return true;
                }
            }
            if ((this.f14982c & 1) == 0) {
                return false;
            }
            return true;
        }
        b(view, x10, y3);
        if (aVar.needClickAt(view, x10, y3)) {
            this.f14982c |= 1;
            this.d = x10;
            this.e = y3;
            aVar.onClickTouchDown(view, x10, y3);
            if (aVar.needLongPress(x10, y3) && view != null) {
                if (this.f14981b == null) {
                    this.f14982c |= 2;
                    c0 c0Var = new c0(7, this, view);
                    this.f14981b = c0Var;
                    view.postDelayed(c0Var, aVar.getLongPressDuration());
                    return true;
                }
                throw new AssertionError();
            }
            return true;
        }
        return false;
    }

    public final void b(View view, float f7, float f10) {
        int i10 = this.f14982c;
        if ((i10 & 2) != 0) {
            this.f14982c = i10 & (-3);
            c0 c0Var = this.f14981b;
            if (c0Var != null) {
                view.removeCallbacks(c0Var);
                this.f14981b = null;
            } else {
                throw new AssertionError();
            }
        }
        int i11 = this.f14982c;
        int i12 = i11 & 8;
        a aVar = this.f14980a;
        if (i12 != 0) {
            this.f14982c = i11 & (-9);
            aVar.onLongPressCancelled(view, f7, f10);
        }
        if ((this.f14982c & 4) != 0) {
            aVar.onLongPressFinish(view, f7, f10);
            this.f14982c &= -5;
        }
        if ((this.f14982c & 1) != 0) {
            aVar.onClickTouchUp(view, f7, f10);
            this.f14982c &= -2;
        }
    }
}
