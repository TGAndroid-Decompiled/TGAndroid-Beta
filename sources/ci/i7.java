package ci;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i7 extends j1.b {
    public final Rect f5171o;
    public final j7 f5172p;

    public i7(j7 j7Var, j7 j7Var2) {
        super(j7Var2);
        this.f5172p = j7Var;
        this.f5171o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        j7 j7Var = this.f5172p;
        if (Math.abs(f7 - j7Var.f5230k0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - j7Var.f5229j0) <= AndroidUtilities.dp(30.0f) && !j7Var.b() && !j7Var.f5242u0) {
            return 0;
        }
        if (Math.abs(f7 - j7Var.f5231l0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - j7Var.f5229j0) <= AndroidUtilities.dp(30.0f) && !j7Var.b() && !j7Var.f5242u0) {
            return 2;
        }
        if (Math.abs(f7 - j7Var.f5228i0) <= AndroidUtilities.dp(60.0f) && Math.abs(f10 - j7Var.f5229j0) <= AndroidUtilities.dp(60.0f)) {
            return 1;
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        j7 j7Var = this.f5172p;
        if (!j7Var.b() && !j7Var.f5242u0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (!j7Var.b() && !j7Var.f5242u0) {
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        j7 j7Var = this.f5172p;
        if (j7Var.f5215a != null && !j7Var.f5242u0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 && !j7Var.b()) {
                        j7Var.d(180.0f);
                        ((fb) j7Var.f5215a).b();
                        return true;
                    }
                } else if (j7Var.b()) {
                    ((fb) j7Var.f5215a).a();
                    return true;
                } else if (j7Var.f5238r0) {
                    j7Var.f5238r0 = false;
                    j7Var.f5250z0 = false;
                    j7Var.f5243v0 = SystemClock.elapsedRealtime();
                    j7Var.f5242u0 = true;
                    ((fb) j7Var.f5215a).d(false);
                    j7Var.invalidate();
                    return true;
                } else if (j7Var.f5234o0) {
                    if (kc.d(((fb) j7Var.f5215a).f5089a)) {
                        j7Var.R = 0L;
                        j7Var.Q = System.currentTimeMillis();
                        j7Var.A0 = false;
                        ((fb) j7Var.f5215a).e(new androidx.fragment.app.a0(this, 19), false);
                        return true;
                    }
                    return true;
                } else {
                    ((fb) j7Var.f5215a).c();
                    return true;
                }
            } else if (!j7Var.b()) {
                if (j7Var.f5238r0 && j7Var.A0) {
                    j7Var.f5250z0 = false;
                    j7Var.G0.d(1.0f, true);
                    b4 b4Var = ((fb) j7Var.f5215a).f5089a.T0;
                    b4Var.f4734a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                    b4Var.invalidate();
                    j7Var.invalidate();
                    return true;
                }
                kc kcVar = ((fb) j7Var.f5215a).f5089a;
                if (kcVar.f5392f0 == 0 && !kcVar.P1 && !kcVar.Q1 && kc.b(kcVar)) {
                    kcVar.f(true);
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
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f46470a;
        dVar.i("android.widget.Button");
        boolean z10 = false;
        Rect rect = this.f5171o;
        j7 j7Var = this.f5172p;
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
                float f7 = j7Var.f5231l0;
                float f10 = dp;
                float f11 = j7Var.f5229j0;
                rect.set((int) (f7 - f10), (int) (f11 - f10), (int) (f7 + f10), (int) (f11 + f10));
                dVar.h(rect);
                dVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
                if (!j7Var.f5242u0 && !j7Var.b()) {
                    z10 = true;
                }
                accessibilityNodeInfo.setEnabled(z10);
                if (z10) {
                    dVar.b(s0.c.f46463c);
                    return;
                }
                return;
            }
            int dp2 = AndroidUtilities.dp(40.0f);
            float f12 = j7Var.f5228i0;
            float f13 = dp2;
            float f14 = j7Var.f5229j0;
            rect.set((int) (f12 - f13), (int) (f14 - f13), (int) (f12 + f13), (int) (f14 + f13));
            dVar.h(rect);
            if (j7Var.b()) {
                string2 = LocaleController.getString(R.string.Send);
            } else if (j7Var.f5238r0) {
                string2 = LocaleController.getString(R.string.AccDescrStopRecording);
            } else if (j7Var.f5234o0) {
                string2 = LocaleController.getString(R.string.AccDescrStartRecording);
            } else {
                string2 = LocaleController.getString(R.string.AccDescrTakePhoto);
            }
            dVar.j(string2);
            accessibilityNodeInfo.setEnabled(!j7Var.f5242u0);
            if (!j7Var.f5242u0) {
                dVar.b(s0.c.f46463c);
                return;
            }
            return;
        }
        int dp3 = AndroidUtilities.dp(22.0f);
        float f15 = j7Var.f5230k0;
        float f16 = dp3;
        float f17 = j7Var.f5229j0;
        rect.set((int) (f15 - f16), (int) (f17 - f16), (int) (f15 + f16), (int) (f17 + f16));
        dVar.h(rect);
        if (j7Var.f5238r0 && j7Var.A0) {
            string = LocaleController.getString(R.string.AccDescrLockRecording);
        } else {
            string = LocaleController.getString(R.string.AccDescrCameraGallery);
        }
        dVar.j(string);
        if (!j7Var.f5242u0 && !j7Var.b()) {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (z10) {
            dVar.b(s0.c.f46463c);
        }
    }
}
