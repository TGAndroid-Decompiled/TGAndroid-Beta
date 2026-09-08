package di;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k7 extends j1.b {
    public final Rect f7502o;
    public final l7 f7503p;

    public k7(l7 l7Var, l7 l7Var2) {
        super(l7Var2);
        this.f7503p = l7Var;
        this.f7502o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        l7 l7Var = this.f7503p;
        if (Math.abs(f7 - l7Var.f7577k0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - l7Var.f7576j0) <= AndroidUtilities.dp(30.0f) && !l7Var.b() && !l7Var.f7589u0) {
            return 0;
        }
        if (Math.abs(f7 - l7Var.f7578l0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - l7Var.f7576j0) <= AndroidUtilities.dp(30.0f) && !l7Var.b() && !l7Var.f7589u0) {
            return 2;
        }
        if (Math.abs(f7 - l7Var.f7575i0) <= AndroidUtilities.dp(60.0f) && Math.abs(f10 - l7Var.f7576j0) <= AndroidUtilities.dp(60.0f)) {
            return 1;
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        l7 l7Var = this.f7503p;
        if (!l7Var.b() && !l7Var.f7589u0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (!l7Var.b() && !l7Var.f7589u0) {
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        l7 l7Var = this.f7503p;
        if (l7Var.f7562a != null && !l7Var.f7589u0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 && !l7Var.b()) {
                        l7Var.d(180.0f);
                        ((jb) l7Var.f7562a).b();
                        return true;
                    }
                } else if (l7Var.b()) {
                    ((jb) l7Var.f7562a).a();
                    return true;
                } else if (l7Var.f7585r0) {
                    l7Var.f7585r0 = false;
                    l7Var.f7597z0 = false;
                    l7Var.f7590v0 = SystemClock.elapsedRealtime();
                    l7Var.f7589u0 = true;
                    ((jb) l7Var.f7562a).d(false);
                    l7Var.invalidate();
                    return true;
                } else if (l7Var.f7581o0) {
                    if (pc.d(((jb) l7Var.f7562a).f7471a)) {
                        l7Var.R = 0L;
                        l7Var.Q = System.currentTimeMillis();
                        l7Var.A0 = false;
                        ((jb) l7Var.f7562a).e(new bi.oa(this, 25), false);
                        return true;
                    }
                    return true;
                } else {
                    ((jb) l7Var.f7562a).c();
                    return true;
                }
            } else if (!l7Var.b()) {
                if (l7Var.f7585r0 && l7Var.A0) {
                    l7Var.f7597z0 = false;
                    l7Var.G0.d(1.0f, true);
                    c4 c4Var = ((jb) l7Var.f7562a).f7471a.T0;
                    c4Var.f7014a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                    c4Var.invalidate();
                    l7Var.invalidate();
                    return true;
                }
                pc pcVar = ((jb) l7Var.f7562a).f7471a;
                if (pcVar.f7888f0 == 0 && !pcVar.P1 && !pcVar.Q1 && pc.b(pcVar)) {
                    pcVar.f(true);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void l(int i10, s0.c cVar) {
        String string;
        String string2;
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f45713a;
        cVar.i("android.widget.Button");
        boolean z10 = false;
        Rect rect = this.f7502o;
        l7 l7Var = this.f7503p;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    rect.set(0, 0, 1, 1);
                    cVar.h(rect);
                    cVar.p(false);
                    cVar.j("");
                    return;
                }
                int dp = AndroidUtilities.dp(22.0f);
                float f7 = l7Var.f7578l0;
                float f10 = dp;
                float f11 = l7Var.f7576j0;
                rect.set((int) (f7 - f10), (int) (f11 - f10), (int) (f7 + f10), (int) (f11 + f10));
                cVar.h(rect);
                cVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
                if (!l7Var.f7589u0 && !l7Var.b()) {
                    z10 = true;
                }
                accessibilityNodeInfo.setEnabled(z10);
                if (z10) {
                    cVar.b(s0.b.f45706c);
                    return;
                }
                return;
            }
            int dp2 = AndroidUtilities.dp(40.0f);
            float f12 = l7Var.f7575i0;
            float f13 = dp2;
            float f14 = l7Var.f7576j0;
            rect.set((int) (f12 - f13), (int) (f14 - f13), (int) (f12 + f13), (int) (f14 + f13));
            cVar.h(rect);
            if (l7Var.b()) {
                string2 = LocaleController.getString(R.string.Send);
            } else if (l7Var.f7585r0) {
                string2 = LocaleController.getString(R.string.AccDescrStopRecording);
            } else if (l7Var.f7581o0) {
                string2 = LocaleController.getString(R.string.AccDescrStartRecording);
            } else {
                string2 = LocaleController.getString(R.string.AccDescrTakePhoto);
            }
            cVar.j(string2);
            accessibilityNodeInfo.setEnabled(!l7Var.f7589u0);
            if (!l7Var.f7589u0) {
                cVar.b(s0.b.f45706c);
                return;
            }
            return;
        }
        int dp3 = AndroidUtilities.dp(22.0f);
        float f15 = l7Var.f7577k0;
        float f16 = dp3;
        float f17 = l7Var.f7576j0;
        rect.set((int) (f15 - f16), (int) (f17 - f16), (int) (f15 + f16), (int) (f17 + f16));
        cVar.h(rect);
        if (l7Var.f7585r0 && l7Var.A0) {
            string = LocaleController.getString(R.string.AccDescrLockRecording);
        } else {
            string = LocaleController.getString(R.string.AccDescrCameraGallery);
        }
        cVar.j(string);
        if (!l7Var.f7589u0 && !l7Var.b()) {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (z10) {
            cVar.b(s0.b.f45706c);
        }
    }
}
