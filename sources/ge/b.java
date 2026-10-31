package ge;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import d1.e;
public final class b {
    public int f7470a;
    public float f7471b;
    public float f7472c;
    public Object d;
    public Object e;

    public b(a aVar) {
        this.d = aVar;
    }

    public boolean a(View view, MotionEvent motionEvent) {
        a aVar = (a) this.d;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (this.f7470a & 1) != 0) {
                        b(view, x10, y3);
                        return true;
                    }
                } else if ((this.f7470a & 1) != 0) {
                    aVar.r(x10, y3);
                    if ((this.f7470a & 4) != 0) {
                        aVar.o1(view, x10, y3);
                        return true;
                    }
                    if (aVar.j0() && Math.max(Math.abs(this.f7471b - x10), Math.abs(this.f7472c - y3)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        b(view, x10, y3);
                        return true;
                    }
                    return true;
                }
            } else {
                int i10 = this.f7470a;
                if ((i10 & 1) != 0) {
                    if ((i10 & 4) != 0) {
                        aVar.m(view, x10, y3);
                        this.f7470a &= -5;
                    } else {
                        aVar.N(x10, y3);
                        if ((this.f7470a & 256) == 0 && view != null) {
                            view.playSoundEffect(0);
                        }
                    }
                    b(view, x10, y3);
                    return true;
                }
            }
            if ((this.f7470a & 1) == 0) {
                return false;
            }
            return true;
        }
        b(view, x10, y3);
        if (aVar.V0(x10, y3)) {
            this.f7470a |= 1;
            this.f7471b = x10;
            this.f7472c = y3;
            aVar.t0();
            if (aVar.I1() && view != null) {
                if (((e) this.e) == null) {
                    this.f7470a |= 2;
                    e eVar = new e(13, this, view);
                    this.e = eVar;
                    view.postDelayed(eVar, aVar.getLongPressDuration());
                    return true;
                }
                throw new AssertionError();
            }
            return true;
        }
        return false;
    }

    public void b(View view, float f7, float f10) {
        a aVar = (a) this.d;
        int i10 = this.f7470a;
        if ((i10 & 2) != 0) {
            this.f7470a = i10 & (-3);
            e eVar = (e) this.e;
            if (eVar != null) {
                view.removeCallbacks(eVar);
                this.e = null;
            } else {
                throw new AssertionError();
            }
        }
        int i11 = this.f7470a;
        if ((i11 & 8) != 0) {
            this.f7470a = i11 & (-9);
            aVar.u(view, f7, f10);
        }
        if ((this.f7470a & 4) != 0) {
            aVar.m(view, f7, f10);
            this.f7470a &= -5;
        }
        if ((this.f7470a & 1) != 0) {
            aVar.G0();
            this.f7470a &= -2;
        }
    }
}
