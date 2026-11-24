package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
public final class w7b implements GestureDetector.OnGestureListener {
    public final m8b a;

    public w7b(m8b m8bVar) {
        this.a = m8bVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        m8b m8bVar = this.a;
        m8bVar.g1 = false;
        if (m8bVar.v(m8bVar.s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        m8b m8bVar = this.a;
        if (m8bVar.a0 != 0.0f && m8bVar.u1 == null && f2 < -1000.0f && !m8bVar.b0) {
            m8bVar.b0 = true;
            try {
                m8bVar.s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            m8bVar.R();
        }
        if (m8bVar.f0 != 0.0f) {
            if (f2 < -1000.0f) {
                m8bVar.k(true);
            } else if (f2 > 1000.0f) {
                m8bVar.k(false);
            } else {
                if (m8bVar.x.f > 0.5f) {
                    z = true;
                } else {
                    z = false;
                }
                m8bVar.k(z);
            }
        }
        m8bVar.g1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        m21 m21Var;
        m8b m8bVar = this.a;
        if (!m8bVar.k0) {
            return false;
        }
        if (m8bVar.m0) {
            m8bVar.a0 += f2;
            float L = gl.L(200.0f);
            if (m8bVar.a0 > L && !m8bVar.b0) {
                m8bVar.b0 = true;
                m8bVar.R();
                try {
                    m8bVar.s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            m8bVar.e0 = Utilities.i(m8bVar.a0 / L, 1.0f, 0.0f);
            if (m8bVar.o0.getCurrentPeerView() != null) {
                m8bVar.o0.getCurrentPeerView().invalidate();
            }
            if (m8bVar.a0 < 0.0f) {
                m8bVar.a0 = 0.0f;
                m8bVar.m0 = false;
            }
            return true;
        }
        if (m8bVar.d0) {
            float f4 = m8bVar.f0;
            if (f4 > m8bVar.x.c && f2 > 0.0f) {
                m8bVar.f0 = (0.05f * f2) + f4;
            } else {
                m8bVar.f0 = f4 + f2;
            }
            a8b a8bVar = m8bVar.s;
            m21 m21Var2 = m21.w;
            if (m21Var2 != null && m21Var2.h == a8bVar) {
                m21Var2.b();
            }
            if (m8bVar.o0.getCurrentPeerView() != null) {
                m8bVar.o0.getCurrentPeerView().invalidate();
            }
            m8bVar.w.invalidate();
            if (m8bVar.f0 < 0.0f) {
                m8bVar.f0 = 0.0f;
                m8bVar.d0 = false;
            }
            return true;
        }
        if (m8bVar.W > 0.8f) {
            float f5 = -f2;
            if ((f5 > 0.0f && m8bVar.X > 0.0f) || (f5 < 0.0f && m8bVar.X < 0.0f)) {
                f3 = 0.3f;
                m8bVar.X -= f2 * f3;
                a8b a8bVar2 = m8bVar.s;
                m21Var = m21.w;
                if (m21Var != null && m21Var.h == a8bVar2) {
                    m21Var.b();
                }
                m8bVar.V();
                return true;
            }
        }
        f3 = 0.6f;
        m8bVar.X -= f2 * f3;
        a8b a8bVar22 = m8bVar.s;
        m21Var = m21.w;
        if (m21Var != null) {
            m21Var.b();
        }
        m8bVar.V();
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        y28 currentPeerView;
        boolean z;
        m8b m8bVar = this.a;
        if (m8bVar.f0 == 0.0f && m8bVar.g0) {
            if (!m8bVar.y && !m8bVar.L0 && !m8bVar.m1 && !m8bVar.i1 && !m8bVar.j1) {
                y28 w = m8bVar.w();
                if (w == null || !w.E1.f) {
                    if (motionEvent.getX() > m8bVar.w.getMeasuredWidth() * 0.33f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    y28 currentPeerView2 = m8bVar.o0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.Z0(z)) {
                        if (!m8bVar.o0.E(z)) {
                            if (z) {
                                m8bVar.o(true);
                                return false;
                            }
                            l8b l8bVar = m8bVar.A0;
                            if (l8bVar != null) {
                                l8bVar.loopBack();
                                return false;
                            }
                        } else {
                            c8b c8bVar = m8bVar.o0;
                            c8bVar.M0 = true;
                            c8bVar.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            xia xiaVar = c8bVar.N0;
                            gl.r(xiaVar);
                            gl.d3(xiaVar, 150L);
                            return false;
                        }
                    }
                }
            } else {
                c8b c8bVar2 = m8bVar.o0;
                if (c8bVar2 != null && (currentPeerView = c8bVar2.getCurrentPeerView()) != null) {
                    currentPeerView.i0();
                }
            }
        }
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
