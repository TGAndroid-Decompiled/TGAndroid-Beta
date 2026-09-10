package me;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import m4.w;
public final class b {
    public final a f13640a;
    public w f13641b;
    public int f13642c;
    public float d;
    public float e;
    public float f13643f;
    public float f13644g;

    public b(a aVar) {
        this.f13640a = aVar;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        a aVar = this.f13640a;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (this.f13642c & 1) != 0) {
                        b(view, x10, y3);
                        return true;
                    }
                } else if ((this.f13642c & 1) != 0) {
                    aVar.onClickTouchMove(view, x10, y3);
                    if ((this.f13642c & 4) != 0) {
                        aVar.onLongPressMove(view, motionEvent, x10, y3, this.f13643f, this.f13644g);
                        return true;
                    }
                    if (aVar.needCancelTouchBySlopMove() && Math.max(Math.abs(this.d - x10), Math.abs(this.e - y3)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        b(view, x10, y3);
                        return true;
                    }
                    return true;
                }
            } else {
                int i10 = this.f13642c;
                if ((i10 & 1) != 0) {
                    if ((i10 & 4) != 0) {
                        aVar.onLongPressFinish(view, x10, y3);
                        this.f13642c &= -5;
                    } else {
                        aVar.onClickAt(view, x10, y3);
                        if ((this.f13642c & 256) == 0 && view != null) {
                            view.playSoundEffect(0);
                        }
                    }
                    b(view, x10, y3);
                    return true;
                }
            }
            if ((this.f13642c & 1) == 0) {
                return false;
            }
            return true;
        }
        b(view, x10, y3);
        if (aVar.needClickAt(view, x10, y3)) {
            this.f13642c |= 1;
            this.d = x10;
            this.e = y3;
            aVar.onClickTouchDown(view, x10, y3);
            if (aVar.needLongPress(x10, y3) && view != null) {
                if (this.f13641b == null) {
                    this.f13642c |= 2;
                    w wVar = new w(6, this, view);
                    this.f13641b = wVar;
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
        int i10 = this.f13642c;
        if ((i10 & 2) != 0) {
            this.f13642c = i10 & (-3);
            w wVar = this.f13641b;
            if (wVar != null) {
                view.removeCallbacks(wVar);
                this.f13641b = null;
            } else {
                throw new AssertionError();
            }
        }
        int i11 = this.f13642c;
        int i12 = i11 & 8;
        a aVar = this.f13640a;
        if (i12 != 0) {
            this.f13642c = i11 & (-9);
            aVar.onLongPressCancelled(view, f7, f10);
        }
        if ((this.f13642c & 4) != 0) {
            aVar.onLongPressFinish(view, f7, f10);
            this.f13642c &= -5;
        }
        if ((this.f13642c & 1) != 0) {
            aVar.onClickTouchUp(view, f7, f10);
            this.f13642c &= -2;
        }
    }
}
