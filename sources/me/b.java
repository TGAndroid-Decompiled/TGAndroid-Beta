package me;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ki.h0;
public final class b {
    public final a f16389a;
    public h0 f16390b;
    public int f16391c;
    public float d;
    public float f16392e;
    public float f16393f;
    public float f16394g;

    public b(a aVar) {
        this.f16389a = aVar;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        a aVar = this.f16389a;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (this.f16391c & 1) != 0) {
                        b(view, x10, y3);
                        return true;
                    }
                } else if ((this.f16391c & 1) != 0) {
                    aVar.onClickTouchMove(view, x10, y3);
                    if ((this.f16391c & 4) != 0) {
                        aVar.onLongPressMove(view, motionEvent, x10, y3, this.f16393f, this.f16394g);
                        return true;
                    }
                    if (aVar.needCancelTouchBySlopMove() && Math.max(Math.abs(this.d - x10), Math.abs(this.f16392e - y3)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        b(view, x10, y3);
                        return true;
                    }
                    return true;
                }
            } else {
                int i10 = this.f16391c;
                if ((i10 & 1) != 0) {
                    if ((i10 & 4) != 0) {
                        aVar.onLongPressFinish(view, x10, y3);
                        this.f16391c &= -5;
                    } else {
                        aVar.onClickAt(view, x10, y3);
                        if ((this.f16391c & 256) == 0 && view != null) {
                            view.playSoundEffect(0);
                        }
                    }
                    b(view, x10, y3);
                    return true;
                }
            }
            if ((this.f16391c & 1) == 0) {
                return false;
            }
            return true;
        }
        b(view, x10, y3);
        if (aVar.needClickAt(view, x10, y3)) {
            this.f16391c |= 1;
            this.d = x10;
            this.f16392e = y3;
            aVar.onClickTouchDown(view, x10, y3);
            if (aVar.needLongPress(x10, y3) && view != null) {
                if (this.f16390b == null) {
                    this.f16391c |= 2;
                    h0 h0Var = new h0(8, this, view);
                    this.f16390b = h0Var;
                    view.postDelayed(h0Var, aVar.getLongPressDuration());
                    return true;
                }
                throw new AssertionError();
            }
            return true;
        }
        return false;
    }

    public final void b(View view, float f7, float f10) {
        int i10 = this.f16391c;
        if ((i10 & 2) != 0) {
            this.f16391c = i10 & (-3);
            h0 h0Var = this.f16390b;
            if (h0Var != null) {
                view.removeCallbacks(h0Var);
                this.f16390b = null;
            } else {
                throw new AssertionError();
            }
        }
        int i11 = this.f16391c;
        int i12 = i11 & 8;
        a aVar = this.f16389a;
        if (i12 != 0) {
            this.f16391c = i11 & (-9);
            aVar.onLongPressCancelled(view, f7, f10);
        }
        if ((this.f16391c & 4) != 0) {
            aVar.onLongPressFinish(view, f7, f10);
            this.f16391c &= -5;
        }
        if ((this.f16391c & 1) != 0) {
            aVar.onClickTouchUp(view, f7, f10);
            this.f16391c &= -2;
        }
    }
}
