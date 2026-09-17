package me;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ji.b5;
public final class b {
    public final a f16193a;
    public b5 f16194b;
    public int f16195c;
    public float d;
    public float f16196e;
    public float f16197f;
    public float f16198g;

    public b(a aVar) {
        this.f16193a = aVar;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        a aVar = this.f16193a;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (this.f16195c & 1) != 0) {
                        b(view, x10, y3);
                        return true;
                    }
                } else if ((this.f16195c & 1) != 0) {
                    aVar.onClickTouchMove(view, x10, y3);
                    if ((this.f16195c & 4) != 0) {
                        aVar.onLongPressMove(view, motionEvent, x10, y3, this.f16197f, this.f16198g);
                        return true;
                    }
                    if (aVar.needCancelTouchBySlopMove() && Math.max(Math.abs(this.d - x10), Math.abs(this.f16196e - y3)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        b(view, x10, y3);
                        return true;
                    }
                    return true;
                }
            } else {
                int i10 = this.f16195c;
                if ((i10 & 1) != 0) {
                    if ((i10 & 4) != 0) {
                        aVar.onLongPressFinish(view, x10, y3);
                        this.f16195c &= -5;
                    } else {
                        aVar.onClickAt(view, x10, y3);
                        if ((this.f16195c & 256) == 0 && view != null) {
                            view.playSoundEffect(0);
                        }
                    }
                    b(view, x10, y3);
                    return true;
                }
            }
            if ((this.f16195c & 1) == 0) {
                return false;
            }
            return true;
        }
        b(view, x10, y3);
        if (aVar.needClickAt(view, x10, y3)) {
            this.f16195c |= 1;
            this.d = x10;
            this.f16196e = y3;
            aVar.onClickTouchDown(view, x10, y3);
            if (aVar.needLongPress(x10, y3) && view != null) {
                if (this.f16194b == null) {
                    this.f16195c |= 2;
                    b5 b5Var = new b5(11, this, view);
                    this.f16194b = b5Var;
                    view.postDelayed(b5Var, aVar.getLongPressDuration());
                    return true;
                }
                throw new AssertionError();
            }
            return true;
        }
        return false;
    }

    public final void b(View view, float f7, float f10) {
        int i10 = this.f16195c;
        if ((i10 & 2) != 0) {
            this.f16195c = i10 & (-3);
            b5 b5Var = this.f16194b;
            if (b5Var != null) {
                view.removeCallbacks(b5Var);
                this.f16194b = null;
            } else {
                throw new AssertionError();
            }
        }
        int i11 = this.f16195c;
        int i12 = i11 & 8;
        a aVar = this.f16193a;
        if (i12 != 0) {
            this.f16195c = i11 & (-9);
            aVar.onLongPressCancelled(view, f7, f10);
        }
        if ((this.f16195c & 4) != 0) {
            aVar.onLongPressFinish(view, f7, f10);
            this.f16195c &= -5;
        }
        if ((this.f16195c & 1) != 0) {
            aVar.onClickTouchUp(view, f7, f10);
            this.f16195c &= -2;
        }
    }
}
