package me;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ki.h0;
public final class b {
    public final a f15050a;
    public h0 f15051b;
    public int f15052c;
    public float d;
    public float e;
    public float f15053f;
    public float f15054g;

    public b(a aVar) {
        this.f15050a = aVar;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        a aVar = this.f15050a;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (this.f15052c & 1) != 0) {
                        b(view, x10, y3);
                        return true;
                    }
                } else if ((this.f15052c & 1) != 0) {
                    aVar.onClickTouchMove(view, x10, y3);
                    if ((this.f15052c & 4) != 0) {
                        aVar.onLongPressMove(view, motionEvent, x10, y3, this.f15053f, this.f15054g);
                        return true;
                    }
                    if (aVar.needCancelTouchBySlopMove() && Math.max(Math.abs(this.d - x10), Math.abs(this.e - y3)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        b(view, x10, y3);
                        return true;
                    }
                    return true;
                }
            } else {
                int i10 = this.f15052c;
                if ((i10 & 1) != 0) {
                    if ((i10 & 4) != 0) {
                        aVar.onLongPressFinish(view, x10, y3);
                        this.f15052c &= -5;
                    } else {
                        aVar.onClickAt(view, x10, y3);
                        if ((this.f15052c & 256) == 0 && view != null) {
                            view.playSoundEffect(0);
                        }
                    }
                    b(view, x10, y3);
                    return true;
                }
            }
            if ((this.f15052c & 1) == 0) {
                return false;
            }
            return true;
        }
        b(view, x10, y3);
        if (aVar.needClickAt(view, x10, y3)) {
            this.f15052c |= 1;
            this.d = x10;
            this.e = y3;
            aVar.onClickTouchDown(view, x10, y3);
            if (aVar.needLongPress(x10, y3) && view != null) {
                if (this.f15051b == null) {
                    this.f15052c |= 2;
                    h0 h0Var = new h0(8, this, view);
                    this.f15051b = h0Var;
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
        int i10 = this.f15052c;
        if ((i10 & 2) != 0) {
            this.f15052c = i10 & (-3);
            h0 h0Var = this.f15051b;
            if (h0Var != null) {
                view.removeCallbacks(h0Var);
                this.f15051b = null;
            } else {
                throw new AssertionError();
            }
        }
        int i11 = this.f15052c;
        int i12 = i11 & 8;
        a aVar = this.f15050a;
        if (i12 != 0) {
            this.f15052c = i11 & (-9);
            aVar.onLongPressCancelled(view, f7, f10);
        }
        if ((this.f15052c & 4) != 0) {
            aVar.onLongPressFinish(view, f7, f10);
            this.f15052c &= -5;
        }
        if ((this.f15052c & 1) != 0) {
            aVar.onClickTouchUp(view, f7, f10);
            this.f15052c &= -2;
        }
    }
}
