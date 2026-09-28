package ci;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i7 extends j1.b {
    public final Rect f4786o;
    public final j7 f4787p;

    public i7(j7 j7Var, j7 j7Var2) {
        super(j7Var2);
        this.f4787p = j7Var;
        this.f4786o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        j7 j7Var = this.f4787p;
        if (Math.abs(f7 - j7Var.f4842k0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - j7Var.f4841j0) <= AndroidUtilities.dp(30.0f) && !j7Var.b() && !j7Var.f4854u0) {
            return 0;
        }
        if (Math.abs(f7 - j7Var.f4843l0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - j7Var.f4841j0) <= AndroidUtilities.dp(30.0f) && !j7Var.b() && !j7Var.f4854u0) {
            return 2;
        }
        if (Math.abs(f7 - j7Var.f4840i0) <= AndroidUtilities.dp(60.0f) && Math.abs(f10 - j7Var.f4841j0) <= AndroidUtilities.dp(60.0f)) {
            return 1;
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        j7 j7Var = this.f4787p;
        if (!j7Var.b() && !j7Var.f4854u0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (!j7Var.b() && !j7Var.f4854u0) {
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        j7 j7Var = this.f4787p;
        if (j7Var.f4828a != null && !j7Var.f4854u0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 && !j7Var.b()) {
                        j7Var.d(180.0f);
                        ((gb) j7Var.f4828a).b();
                        return true;
                    }
                } else if (j7Var.b()) {
                    ((gb) j7Var.f4828a).a();
                    return true;
                } else if (j7Var.f4850r0) {
                    j7Var.f4850r0 = false;
                    j7Var.f4862z0 = false;
                    j7Var.f4855v0 = SystemClock.elapsedRealtime();
                    j7Var.f4854u0 = true;
                    ((gb) j7Var.f4828a).d(false);
                    j7Var.invalidate();
                    return true;
                } else if (j7Var.f4846o0) {
                    if (lc.d(((gb) j7Var.f4828a).f4734a)) {
                        j7Var.R = 0L;
                        j7Var.Q = System.currentTimeMillis();
                        j7Var.A0 = false;
                        ((gb) j7Var.f4828a).e(new androidx.fragment.app.a0(this, 19), false);
                        return true;
                    }
                    return true;
                } else {
                    ((gb) j7Var.f4828a).c();
                    return true;
                }
            } else if (!j7Var.b()) {
                if (j7Var.f4850r0 && j7Var.A0) {
                    j7Var.f4862z0 = false;
                    j7Var.G0.d(1.0f, true);
                    b4 b4Var = ((gb) j7Var.f4828a).f4734a.T0;
                    b4Var.f4374a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                    b4Var.invalidate();
                    j7Var.invalidate();
                    return true;
                }
                lc lcVar = ((gb) j7Var.f4828a).f4734a;
                if (lcVar.f5044f0 == 0 && !lcVar.P1 && !lcVar.Q1 && lc.b(lcVar)) {
                    lcVar.f(true);
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
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f42909a;
        dVar.i("android.widget.Button");
        boolean z10 = false;
        Rect rect = this.f4786o;
        j7 j7Var = this.f4787p;
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
                float f7 = j7Var.f4843l0;
                float f10 = dp;
                float f11 = j7Var.f4841j0;
                rect.set((int) (f7 - f10), (int) (f11 - f10), (int) (f7 + f10), (int) (f11 + f10));
                dVar.h(rect);
                dVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
                if (!j7Var.f4854u0 && !j7Var.b()) {
                    z10 = true;
                }
                accessibilityNodeInfo.setEnabled(z10);
                if (z10) {
                    dVar.b(s0.c.f42903c);
                    return;
                }
                return;
            }
            int dp2 = AndroidUtilities.dp(40.0f);
            float f12 = j7Var.f4840i0;
            float f13 = dp2;
            float f14 = j7Var.f4841j0;
            rect.set((int) (f12 - f13), (int) (f14 - f13), (int) (f12 + f13), (int) (f14 + f13));
            dVar.h(rect);
            if (j7Var.b()) {
                string2 = LocaleController.getString(R.string.Send);
            } else if (j7Var.f4850r0) {
                string2 = LocaleController.getString(R.string.AccDescrStopRecording);
            } else if (j7Var.f4846o0) {
                string2 = LocaleController.getString(R.string.AccDescrStartRecording);
            } else {
                string2 = LocaleController.getString(R.string.AccDescrTakePhoto);
            }
            dVar.j(string2);
            accessibilityNodeInfo.setEnabled(!j7Var.f4854u0);
            if (!j7Var.f4854u0) {
                dVar.b(s0.c.f42903c);
                return;
            }
            return;
        }
        int dp3 = AndroidUtilities.dp(22.0f);
        float f15 = j7Var.f4842k0;
        float f16 = dp3;
        float f17 = j7Var.f4841j0;
        rect.set((int) (f15 - f16), (int) (f17 - f16), (int) (f15 + f16), (int) (f17 + f16));
        dVar.h(rect);
        if (j7Var.f4850r0 && j7Var.A0) {
            string = LocaleController.getString(R.string.AccDescrLockRecording);
        } else {
            string = LocaleController.getString(R.string.AccDescrCameraGallery);
        }
        dVar.j(string);
        if (!j7Var.f4854u0 && !j7Var.b()) {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (z10) {
            dVar.b(s0.c.f42903c);
        }
    }
}
