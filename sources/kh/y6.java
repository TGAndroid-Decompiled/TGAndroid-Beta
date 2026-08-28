package kh;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class y6 extends j1.b {
    public final Rect f16400o;
    public final z6 f16401p;

    public y6(z6 z6Var, z6 z6Var2) {
        super(z6Var2);
        this.f16401p = z6Var;
        this.f16400o = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        z6 z6Var = this.f16401p;
        if (Math.abs(f10 - z6Var.f16439g0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - z6Var.f16438f0) <= AndroidUtilities.dp(30.0f) && !z6Var.b() && !z6Var.f16449q0) {
            return 0;
        }
        if (Math.abs(f10 - z6Var.f16440h0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - z6Var.f16438f0) <= AndroidUtilities.dp(30.0f) && !z6Var.b() && !z6Var.f16449q0) {
            return 2;
        }
        if (Math.abs(f10 - z6Var.f16436e0) <= AndroidUtilities.dp(60.0f) && Math.abs(f11 - z6Var.f16438f0) <= AndroidUtilities.dp(60.0f)) {
            return 1;
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        z6 z6Var = this.f16401p;
        if (!z6Var.b() && !z6Var.f16449q0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (!z6Var.b() && !z6Var.f16449q0) {
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i9, int i10) {
        z6 z6Var = this.f16401p;
        if (z6Var.f16428a != null && !z6Var.f16449q0 && i10 == 16) {
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2 && !z6Var.b()) {
                        z6Var.d(180.0f);
                        ((ra) z6Var.f16428a).b();
                        return true;
                    }
                } else if (z6Var.b()) {
                    ((ra) z6Var.f16428a).a();
                    return true;
                } else if (z6Var.f16446n0) {
                    z6Var.f16446n0 = false;
                    z6Var.f16456v0 = false;
                    z6Var.f16451r0 = SystemClock.elapsedRealtime();
                    z6Var.f16449q0 = true;
                    ((ra) z6Var.f16428a).d(false);
                    z6Var.invalidate();
                    return true;
                } else if (z6Var.f16443k0) {
                    if (wb.d(((ra) z6Var.f16428a).f15971a)) {
                        z6Var.N = 0L;
                        z6Var.M = System.currentTimeMillis();
                        z6Var.f16458w0 = false;
                        ((ra) z6Var.f16428a).e(new f1(this, 9), false);
                        return true;
                    }
                    return true;
                } else {
                    ((ra) z6Var.f16428a).c();
                    return true;
                }
            } else if (!z6Var.b()) {
                if (z6Var.f16446n0 && z6Var.f16458w0) {
                    z6Var.f16456v0 = false;
                    z6Var.C0.d(1.0f, true);
                    v3 v3Var = ((ra) z6Var.f16428a).f15971a.P0;
                    v3Var.f16192a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                    v3Var.invalidate();
                    z6Var.invalidate();
                    return true;
                }
                wb wbVar = ((ra) z6Var.f16428a).f15971a;
                if (wbVar.f16250b0 == 0 && !wbVar.L1 && !wbVar.M1 && wb.b(wbVar)) {
                    wbVar.f(true);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void l(int i9, s0.d dVar) {
        String string;
        String string2;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47292a;
        dVar.i("android.widget.Button");
        boolean z10 = false;
        Rect rect = this.f16400o;
        z6 z6Var = this.f16401p;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    rect.set(0, 0, 1, 1);
                    dVar.h(rect);
                    dVar.p(false);
                    dVar.j("");
                    return;
                }
                int dp = AndroidUtilities.dp(22.0f);
                float f10 = z6Var.f16440h0;
                float f11 = dp;
                float f12 = z6Var.f16438f0;
                rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
                dVar.h(rect);
                dVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
                if (!z6Var.f16449q0 && !z6Var.b()) {
                    z10 = true;
                }
                accessibilityNodeInfo.setEnabled(z10);
                if (z10) {
                    dVar.b(s0.c.f47285c);
                    return;
                }
                return;
            }
            int dp2 = AndroidUtilities.dp(40.0f);
            float f13 = z6Var.f16436e0;
            float f14 = dp2;
            float f15 = z6Var.f16438f0;
            rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
            dVar.h(rect);
            if (z6Var.b()) {
                string2 = LocaleController.getString(R.string.Send);
            } else if (z6Var.f16446n0) {
                string2 = LocaleController.getString(R.string.AccDescrStopRecording);
            } else if (z6Var.f16443k0) {
                string2 = LocaleController.getString(R.string.AccDescrStartRecording);
            } else {
                string2 = LocaleController.getString(R.string.AccDescrTakePhoto);
            }
            dVar.j(string2);
            accessibilityNodeInfo.setEnabled(!z6Var.f16449q0);
            if (!z6Var.f16449q0) {
                dVar.b(s0.c.f47285c);
                return;
            }
            return;
        }
        int dp3 = AndroidUtilities.dp(22.0f);
        float f16 = z6Var.f16439g0;
        float f17 = dp3;
        float f18 = z6Var.f16438f0;
        rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
        dVar.h(rect);
        if (z6Var.f16446n0 && z6Var.f16458w0) {
            string = LocaleController.getString(R.string.AccDescrLockRecording);
        } else {
            string = LocaleController.getString(R.string.AccDescrCameraGallery);
        }
        dVar.j(string);
        if (!z6Var.f16449q0 && !z6Var.b()) {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (z10) {
            dVar.b(s0.c.f47285c);
        }
    }
}
