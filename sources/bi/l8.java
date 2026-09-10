package bi;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l8 extends j1.b {
    public final Rect f3045o;
    public final m8 f3046p;

    public l8(m8 m8Var, m8 m8Var2) {
        super(m8Var2);
        this.f3046p = m8Var;
        this.f3045o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        m8 m8Var = this.f3046p;
        if (Math.abs(f7 - m8Var.f3118k0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - m8Var.f3117j0) <= AndroidUtilities.dp(30.0f) && !m8Var.b() && !m8Var.f3130u0) {
            return 0;
        }
        if (Math.abs(f7 - m8Var.f3119l0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - m8Var.f3117j0) <= AndroidUtilities.dp(30.0f) && !m8Var.b() && !m8Var.f3130u0) {
            return 2;
        }
        if (Math.abs(f7 - m8Var.f3116i0) <= AndroidUtilities.dp(60.0f) && Math.abs(f10 - m8Var.f3117j0) <= AndroidUtilities.dp(60.0f)) {
            return 1;
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        m8 m8Var = this.f3046p;
        if (!m8Var.b() && !m8Var.f3130u0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (!m8Var.b() && !m8Var.f3130u0) {
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        m8 m8Var = this.f3046p;
        if (m8Var.f3104a != null && !m8Var.f3130u0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 && !m8Var.b()) {
                        m8Var.d(180.0f);
                        ((sc) m8Var.f3104a).b();
                        return true;
                    }
                } else if (m8Var.b()) {
                    ((sc) m8Var.f3104a).a();
                    return true;
                } else if (m8Var.f3126r0) {
                    m8Var.f3126r0 = false;
                    m8Var.f3138z0 = false;
                    m8Var.f3131v0 = SystemClock.elapsedRealtime();
                    m8Var.f3130u0 = true;
                    ((sc) m8Var.f3104a).d(false);
                    m8Var.invalidate();
                    return true;
                } else if (m8Var.f3122o0) {
                    if (ce.d(((sc) m8Var.f3104a).f3660a)) {
                        m8Var.R = 0L;
                        m8Var.Q = System.currentTimeMillis();
                        m8Var.A0 = false;
                        ((sc) m8Var.f3104a).e(new a3.d(this, 25), false);
                        return true;
                    }
                    return true;
                } else {
                    ((sc) m8Var.f3104a).c();
                    return true;
                }
            } else if (!m8Var.b()) {
                if (m8Var.f3126r0 && m8Var.A0) {
                    m8Var.f3138z0 = false;
                    m8Var.G0.d(1.0f, true);
                    u4 u4Var = ((sc) m8Var.f3104a).f3660a.T0;
                    u4Var.f3715a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                    u4Var.invalidate();
                    m8Var.invalidate();
                    return true;
                }
                ce ceVar = ((sc) m8Var.f3104a).f3660a;
                if (ceVar.f2448f0 == 0 && !ceVar.P1 && !ceVar.Q1 && ce.b(ceVar)) {
                    ceVar.f(true);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void l(int i10, s0.d dVar) {
        String string;
        String string2;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f41559a;
        dVar.i("android.widget.Button");
        boolean z10 = false;
        Rect rect = this.f3045o;
        m8 m8Var = this.f3046p;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    rect.set(0, 0, 1, 1);
                    dVar.h(rect);
                    dVar.p(false);
                    dVar.j("");
                    return;
                }
                int dp = AndroidUtilities.dp(22.0f);
                float f7 = m8Var.f3119l0;
                float f10 = dp;
                float f11 = m8Var.f3117j0;
                rect.set((int) (f7 - f10), (int) (f11 - f10), (int) (f7 + f10), (int) (f11 + f10));
                dVar.h(rect);
                dVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
                if (!m8Var.f3130u0 && !m8Var.b()) {
                    z10 = true;
                }
                accessibilityNodeInfo.setEnabled(z10);
                if (z10) {
                    dVar.b(s0.c.f41553c);
                    return;
                }
                return;
            }
            int dp2 = AndroidUtilities.dp(40.0f);
            float f12 = m8Var.f3116i0;
            float f13 = dp2;
            float f14 = m8Var.f3117j0;
            rect.set((int) (f12 - f13), (int) (f14 - f13), (int) (f12 + f13), (int) (f14 + f13));
            dVar.h(rect);
            if (m8Var.b()) {
                string2 = LocaleController.getString(R.string.Send);
            } else if (m8Var.f3126r0) {
                string2 = LocaleController.getString(R.string.AccDescrStopRecording);
            } else if (m8Var.f3122o0) {
                string2 = LocaleController.getString(R.string.AccDescrStartRecording);
            } else {
                string2 = LocaleController.getString(R.string.AccDescrTakePhoto);
            }
            dVar.j(string2);
            accessibilityNodeInfo.setEnabled(!m8Var.f3130u0);
            if (!m8Var.f3130u0) {
                dVar.b(s0.c.f41553c);
                return;
            }
            return;
        }
        int dp3 = AndroidUtilities.dp(22.0f);
        float f15 = m8Var.f3118k0;
        float f16 = dp3;
        float f17 = m8Var.f3117j0;
        rect.set((int) (f15 - f16), (int) (f17 - f16), (int) (f15 + f16), (int) (f17 + f16));
        dVar.h(rect);
        if (m8Var.f3126r0 && m8Var.A0) {
            string = LocaleController.getString(R.string.AccDescrLockRecording);
        } else {
            string = LocaleController.getString(R.string.AccDescrCameraGallery);
        }
        dVar.j(string);
        if (!m8Var.f3130u0 && !m8Var.b()) {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (z10) {
            dVar.b(s0.c.f41553c);
        }
    }
}
