package fi;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v6 extends j1.b {
    public final Rect f11820o;
    public final w6 f11821p;

    public v6(w6 w6Var, w6 w6Var2) {
        super(w6Var2);
        this.f11821p = w6Var;
        this.f11820o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        w6 w6Var = this.f11821p;
        if (Math.abs(f7 - w6Var.f11866k0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - w6Var.f11865j0) <= AndroidUtilities.dp(30.0f) && !w6Var.b() && !w6Var.f11878u0) {
            return 0;
        }
        if (Math.abs(f7 - w6Var.f11867l0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - w6Var.f11865j0) <= AndroidUtilities.dp(30.0f) && !w6Var.b() && !w6Var.f11878u0) {
            return 2;
        }
        if (Math.abs(f7 - w6Var.f11864i0) <= AndroidUtilities.dp(60.0f) && Math.abs(f10 - w6Var.f11865j0) <= AndroidUtilities.dp(60.0f)) {
            return 1;
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        w6 w6Var = this.f11821p;
        if (!w6Var.b() && !w6Var.f11878u0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (!w6Var.b() && !w6Var.f11878u0) {
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        w6 w6Var = this.f11821p;
        if (w6Var.f11852a != null && !w6Var.f11878u0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 && !w6Var.b()) {
                        w6Var.d(180.0f);
                        ((ma) w6Var.f11852a).b();
                        return true;
                    }
                } else if (w6Var.b()) {
                    ((ma) w6Var.f11852a).a();
                    return true;
                } else if (w6Var.f11874r0) {
                    w6Var.f11874r0 = false;
                    w6Var.f11886z0 = false;
                    w6Var.f11879v0 = SystemClock.elapsedRealtime();
                    w6Var.f11878u0 = true;
                    ((ma) w6Var.f11852a).e(false);
                    w6Var.invalidate();
                    return true;
                } else if (w6Var.f11870o0) {
                    if (sb.c(((ma) w6Var.f11852a).f11269a)) {
                        w6Var.R = 0L;
                        w6Var.Q = System.currentTimeMillis();
                        w6Var.A0 = false;
                        ((ma) w6Var.f11852a).f(new di.s8(this, 23), false);
                    }
                    return true;
                } else {
                    ((ma) w6Var.f11852a).d();
                    return true;
                }
            } else if (!w6Var.b()) {
                if (w6Var.f11874r0 && w6Var.A0) {
                    w6Var.f11886z0 = false;
                    w6Var.G0.d(1.0f, true);
                    t3 t3Var = ((ma) w6Var.f11852a).f11269a.T0;
                    t3Var.f11703a.t(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                    t3Var.invalidate();
                    w6Var.invalidate();
                    return true;
                }
                ((ma) w6Var.f11852a).c();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void l(int i10, s0.d dVar) {
        String string;
        String string2;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47688a;
        dVar.i("android.widget.Button");
        boolean z10 = false;
        Rect rect = this.f11820o;
        w6 w6Var = this.f11821p;
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
                float f7 = w6Var.f11867l0;
                float f10 = dp;
                float f11 = w6Var.f11865j0;
                rect.set((int) (f7 - f10), (int) (f11 - f10), (int) (f7 + f10), (int) (f11 + f10));
                dVar.h(rect);
                dVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
                if (!w6Var.f11878u0 && !w6Var.b()) {
                    z10 = true;
                }
                accessibilityNodeInfo.setEnabled(z10);
                if (z10) {
                    dVar.b(s0.c.e);
                    return;
                }
                return;
            }
            int dp2 = AndroidUtilities.dp(40.0f);
            float f12 = w6Var.f11864i0;
            float f13 = dp2;
            float f14 = w6Var.f11865j0;
            rect.set((int) (f12 - f13), (int) (f14 - f13), (int) (f12 + f13), (int) (f14 + f13));
            dVar.h(rect);
            if (w6Var.b()) {
                string2 = LocaleController.getString(R.string.Send);
            } else if (w6Var.f11874r0) {
                string2 = LocaleController.getString(R.string.AccDescrStopRecording);
            } else if (w6Var.f11870o0) {
                string2 = LocaleController.getString(R.string.AccDescrStartRecording);
            } else {
                string2 = LocaleController.getString(R.string.AccDescrTakePhoto);
            }
            dVar.j(string2);
            accessibilityNodeInfo.setEnabled(!w6Var.f11878u0);
            if (!w6Var.f11878u0) {
                dVar.b(s0.c.e);
                return;
            }
            return;
        }
        int dp3 = AndroidUtilities.dp(22.0f);
        float f15 = w6Var.f11866k0;
        float f16 = dp3;
        float f17 = w6Var.f11865j0;
        rect.set((int) (f15 - f16), (int) (f17 - f16), (int) (f15 + f16), (int) (f17 + f16));
        dVar.h(rect);
        if (w6Var.f11874r0 && w6Var.A0) {
            string = LocaleController.getString(R.string.AccDescrLockRecording);
        } else {
            string = LocaleController.getString(R.string.AccDescrCameraGallery);
        }
        dVar.j(string);
        if (!w6Var.f11878u0 && !w6Var.b()) {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (z10) {
            dVar.b(s0.c.e);
        }
    }
}
