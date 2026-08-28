package ih;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gc;
public final class w8 implements GestureDetector.OnGestureListener {
    public final m9 f12311a;

    public w8(m9 m9Var) {
        this.f12311a = m9Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        m9 m9Var = this.f12311a;
        m9Var.f11791c1 = false;
        if (m9.i(m9Var, m9Var.f11824s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z10;
        m9 m9Var = this.f12311a;
        if (m9Var.V != 0.0f && m9Var.f11820q1 == null && f11 < -1000.0f && !m9Var.W) {
            m9Var.W = true;
            try {
                m9Var.f11824s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            m9.j(m9Var);
        }
        if (m9Var.f11784a0 != 0.0f) {
            if (f11 < -1000.0f) {
                m9Var.n(true);
            } else if (f11 > 1000.0f) {
                m9Var.n(false);
            } else {
                if (m9Var.f11830w.f11894f > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m9Var.n(z10);
            }
        }
        m9Var.f11791c1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        gc gcVar;
        m9 m9Var = this.f12311a;
        if (!m9Var.f11798f0) {
            return false;
        }
        if (m9Var.f11802h0) {
            m9Var.V += f11;
            float dp = AndroidUtilities.dp(200.0f);
            if (m9Var.V > dp && !m9Var.W) {
                m9Var.W = true;
                m9.j(m9Var);
                try {
                    m9Var.f11824s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            m9Var.Z = Utilities.clamp(m9Var.V / dp, 1.0f, 0.0f);
            if (m9Var.f11806j0.getCurrentPeerView() != null) {
                m9Var.f11806j0.getCurrentPeerView().invalidate();
            }
            if (m9Var.V < 0.0f) {
                m9Var.V = 0.0f;
                m9Var.f11802h0 = false;
            }
            return true;
        }
        if (m9Var.Y) {
            float f13 = m9Var.f11784a0;
            if (f13 > m9Var.f11830w.f11892c && f11 > 0.0f) {
                m9Var.f11784a0 = (0.05f * f11) + f13;
            } else {
                m9Var.f11784a0 = f13 + f11;
            }
            a9 a9Var = m9Var.f11824s;
            gc gcVar2 = gc.f28729w;
            if (gcVar2 != null && gcVar2.h == a9Var) {
                gcVar2.b();
            }
            if (m9Var.f11806j0.getCurrentPeerView() != null) {
                m9Var.f11806j0.getCurrentPeerView().invalidate();
            }
            m9Var.v.invalidate();
            if (m9Var.f11784a0 < 0.0f) {
                m9Var.f11784a0 = 0.0f;
                m9Var.Y = false;
            }
            return true;
        }
        if (m9Var.R > 0.8f) {
            float f14 = -f11;
            if ((f14 > 0.0f && m9Var.S > 0.0f) || (f14 < 0.0f && m9Var.S < 0.0f)) {
                f12 = 0.3f;
                m9Var.S -= f11 * f12;
                a9 a9Var2 = m9Var.f11824s;
                gcVar = gc.f28729w;
                if (gcVar != null && gcVar.h == a9Var2) {
                    gcVar.b();
                }
                m9.k(m9Var);
                return true;
            }
        }
        f12 = 0.6f;
        m9Var.S -= f11 * f12;
        a9 a9Var22 = m9Var.f11824s;
        gcVar = gc.f28729w;
        if (gcVar != null) {
            gcVar.b();
        }
        m9.k(m9Var);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i4 currentPeerView;
        boolean z10;
        m9 m9Var = this.f12311a;
        if (m9Var.f11784a0 == 0.0f && m9Var.f11787b0) {
            if (!m9Var.f11832x && !m9Var.H0 && !m9Var.f11805i1 && !m9Var.f11796e1 && !m9Var.f11799f1) {
                i4 t10 = m9Var.t();
                if (t10 == null || !t10.K1.f11470f) {
                    if (motionEvent.getX() > m9Var.v.getMeasuredWidth() * 0.33f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i4 currentPeerView2 = m9Var.f11806j0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z10)) {
                        if (!m9Var.f11806j0.E(z10)) {
                            if (z10) {
                                m9Var.q(true);
                                return false;
                            }
                            l9 l9Var = m9Var.f11829v0;
                            if (l9Var != null) {
                                l9Var.loopBack();
                                return false;
                            }
                        } else {
                            c9 c9Var = m9Var.f11806j0;
                            c9Var.H0 = true;
                            c9Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            androidx.activity.i iVar = c9Var.I0;
                            AndroidUtilities.cancelRunOnUIThread(iVar);
                            AndroidUtilities.runOnUIThread(iVar, 150L);
                            return false;
                        }
                    }
                }
            } else {
                c9 c9Var2 = m9Var.f11806j0;
                if (c9Var2 != null && (currentPeerView = c9Var2.getCurrentPeerView()) != null) {
                    currentPeerView.s0();
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
