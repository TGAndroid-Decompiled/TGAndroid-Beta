package nh;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n6 extends j1.b {
    public final Rect f18190o;
    public final o6 f18191p;

    public n6(o6 o6Var, o6 o6Var2) {
        super(o6Var2);
        this.f18191p = o6Var;
        this.f18190o = new Rect();
    }

    @Override
    public final int g(float f9, float f10) {
        o6 o6Var = this.f18191p;
        if (Math.abs(f9 - o6Var.f18229g0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - o6Var.f18228f0) <= AndroidUtilities.dp(30.0f) && !o6Var.b() && !o6Var.f18239q0) {
            return 0;
        }
        if (Math.abs(f9 - o6Var.f18230h0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - o6Var.f18228f0) <= AndroidUtilities.dp(30.0f) && !o6Var.b() && !o6Var.f18239q0) {
            return 2;
        }
        if (Math.abs(f9 - o6Var.f18226e0) <= AndroidUtilities.dp(60.0f) && Math.abs(f10 - o6Var.f18228f0) <= AndroidUtilities.dp(60.0f)) {
            return 1;
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        o6 o6Var = this.f18191p;
        if (!o6Var.b() && !o6Var.f18239q0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (!o6Var.b() && !o6Var.f18239q0) {
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        o6 o6Var = this.f18191p;
        if (o6Var.f18218a != null && !o6Var.f18239q0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 && !o6Var.b()) {
                        o6Var.d(180.0f);
                        ((ca) o6Var.f18218a).b();
                        return true;
                    }
                } else if (o6Var.b()) {
                    ((ca) o6Var.f18218a).a();
                    return true;
                } else if (o6Var.f18236n0) {
                    o6Var.f18236n0 = false;
                    o6Var.f18246v0 = false;
                    o6Var.f18241r0 = SystemClock.elapsedRealtime();
                    o6Var.f18239q0 = true;
                    ((ca) o6Var.f18218a).d(false);
                    o6Var.invalidate();
                    return true;
                } else if (o6Var.f18233k0) {
                    if (gb.d(((ca) o6Var.f18218a).f17486a)) {
                        o6Var.N = 0L;
                        o6Var.M = System.currentTimeMillis();
                        o6Var.f18248w0 = false;
                        ((ca) o6Var.f18218a).e(new m6(this, 0), false);
                        return true;
                    }
                    return true;
                } else {
                    ((ca) o6Var.f18218a).c();
                    return true;
                }
            } else if (!o6Var.b()) {
                if (o6Var.f18236n0 && o6Var.f18248w0) {
                    o6Var.f18246v0 = false;
                    o6Var.C0.d(1.0f, true);
                    s3 s3Var = ((ca) o6Var.f18218a).f17486a.P0;
                    s3Var.f18545a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                    s3Var.invalidate();
                    o6Var.invalidate();
                    return true;
                }
                gb gbVar = ((ca) o6Var.f18218a).f17486a;
                if (gbVar.f17740b0 == 0 && !gbVar.L1 && !gbVar.M1 && gb.b(gbVar)) {
                    gbVar.f(true);
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
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f47482a;
        cVar.i("android.widget.Button");
        boolean z10 = false;
        Rect rect = this.f18190o;
        o6 o6Var = this.f18191p;
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
                float f9 = o6Var.f18230h0;
                float f10 = dp;
                float f11 = o6Var.f18228f0;
                rect.set((int) (f9 - f10), (int) (f11 - f10), (int) (f9 + f10), (int) (f11 + f10));
                cVar.h(rect);
                cVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
                if (!o6Var.f18239q0 && !o6Var.b()) {
                    z10 = true;
                }
                accessibilityNodeInfo.setEnabled(z10);
                if (z10) {
                    cVar.b(s0.b.f47475c);
                    return;
                }
                return;
            }
            int dp2 = AndroidUtilities.dp(40.0f);
            float f12 = o6Var.f18226e0;
            float f13 = dp2;
            float f14 = o6Var.f18228f0;
            rect.set((int) (f12 - f13), (int) (f14 - f13), (int) (f12 + f13), (int) (f14 + f13));
            cVar.h(rect);
            if (o6Var.b()) {
                string2 = LocaleController.getString(R.string.Send);
            } else if (o6Var.f18236n0) {
                string2 = LocaleController.getString(R.string.AccDescrStopRecording);
            } else if (o6Var.f18233k0) {
                string2 = LocaleController.getString(R.string.AccDescrStartRecording);
            } else {
                string2 = LocaleController.getString(R.string.AccDescrTakePhoto);
            }
            cVar.j(string2);
            accessibilityNodeInfo.setEnabled(!o6Var.f18239q0);
            if (!o6Var.f18239q0) {
                cVar.b(s0.b.f47475c);
                return;
            }
            return;
        }
        int dp3 = AndroidUtilities.dp(22.0f);
        float f15 = o6Var.f18229g0;
        float f16 = dp3;
        float f17 = o6Var.f18228f0;
        rect.set((int) (f15 - f16), (int) (f17 - f16), (int) (f15 + f16), (int) (f17 + f16));
        cVar.h(rect);
        if (o6Var.f18236n0 && o6Var.f18248w0) {
            string = LocaleController.getString(R.string.AccDescrLockRecording);
        } else {
            string = LocaleController.getString(R.string.AccDescrCameraGallery);
        }
        cVar.j(string);
        if (!o6Var.f18239q0 && !o6Var.b()) {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (z10) {
            cVar.b(s0.b.f47475c);
        }
    }
}
