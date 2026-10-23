package ei;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class y6 extends j1.b {
    public final Rect f10150o;
    public final z6 f10151p;

    public y6(z6 z6Var, z6 z6Var2) {
        super(z6Var2);
        this.f10151p = z6Var;
        this.f10150o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        z6 z6Var = this.f10151p;
        if (Math.abs(f7 - z6Var.f10236k0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - z6Var.f10235j0) <= AndroidUtilities.dp(30.0f) && !z6Var.b() && !z6Var.f10248u0) {
            return 0;
        }
        if (Math.abs(f7 - z6Var.f10237l0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - z6Var.f10235j0) <= AndroidUtilities.dp(30.0f) && !z6Var.b() && !z6Var.f10248u0) {
            return 2;
        }
        if (Math.abs(f7 - z6Var.f10234i0) <= AndroidUtilities.dp(60.0f) && Math.abs(f10 - z6Var.f10235j0) <= AndroidUtilities.dp(60.0f)) {
            return 1;
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        z6 z6Var = this.f10151p;
        if (!z6Var.b() && !z6Var.f10248u0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (!z6Var.b() && !z6Var.f10248u0) {
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        z6 z6Var = this.f10151p;
        if (z6Var.f10222a != null && !z6Var.f10248u0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 && !z6Var.b()) {
                        z6Var.d(180.0f);
                        ((qa) z6Var.f10222a).b();
                        return true;
                    }
                } else if (z6Var.b()) {
                    ((qa) z6Var.f10222a).a();
                    return true;
                } else if (z6Var.f10244r0) {
                    z6Var.f10244r0 = false;
                    z6Var.f10256z0 = false;
                    z6Var.f10249v0 = SystemClock.elapsedRealtime();
                    z6Var.f10248u0 = true;
                    ((qa) z6Var.f10222a).e(false);
                    z6Var.invalidate();
                    return true;
                } else if (z6Var.f10240o0) {
                    if (vb.c(((qa) z6Var.f10222a).f9678a)) {
                        z6Var.R = 0L;
                        z6Var.Q = System.currentTimeMillis();
                        z6Var.A0 = false;
                        ((qa) z6Var.f10222a).f(new com.google.firebase.messaging.s(this, 19), false);
                    }
                    return true;
                } else {
                    ((qa) z6Var.f10222a).d();
                    return true;
                }
            } else if (!z6Var.b()) {
                if (z6Var.f10244r0 && z6Var.A0) {
                    z6Var.f10256z0 = false;
                    z6Var.G0.d(1.0f, true);
                    v3 v3Var = ((qa) z6Var.f10222a).f9678a.T0;
                    v3Var.f9949a.t(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                    v3Var.invalidate();
                    z6Var.invalidate();
                    return true;
                }
                ((qa) z6Var.f10222a).c();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void l(int i10, s0.d dVar) {
        String string;
        String string2;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f46300a;
        dVar.i("android.widget.Button");
        boolean z10 = false;
        Rect rect = this.f10150o;
        z6 z6Var = this.f10151p;
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
                float f7 = z6Var.f10237l0;
                float f10 = dp;
                float f11 = z6Var.f10235j0;
                rect.set((int) (f7 - f10), (int) (f11 - f10), (int) (f7 + f10), (int) (f11 + f10));
                dVar.h(rect);
                dVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
                if (!z6Var.f10248u0 && !z6Var.b()) {
                    z10 = true;
                }
                accessibilityNodeInfo.setEnabled(z10);
                if (z10) {
                    dVar.b(s0.c.f46294c);
                    return;
                }
                return;
            }
            int dp2 = AndroidUtilities.dp(40.0f);
            float f12 = z6Var.f10234i0;
            float f13 = dp2;
            float f14 = z6Var.f10235j0;
            rect.set((int) (f12 - f13), (int) (f14 - f13), (int) (f12 + f13), (int) (f14 + f13));
            dVar.h(rect);
            if (z6Var.b()) {
                string2 = LocaleController.getString(R.string.Send);
            } else if (z6Var.f10244r0) {
                string2 = LocaleController.getString(R.string.AccDescrStopRecording);
            } else if (z6Var.f10240o0) {
                string2 = LocaleController.getString(R.string.AccDescrStartRecording);
            } else {
                string2 = LocaleController.getString(R.string.AccDescrTakePhoto);
            }
            dVar.j(string2);
            accessibilityNodeInfo.setEnabled(!z6Var.f10248u0);
            if (!z6Var.f10248u0) {
                dVar.b(s0.c.f46294c);
                return;
            }
            return;
        }
        int dp3 = AndroidUtilities.dp(22.0f);
        float f15 = z6Var.f10236k0;
        float f16 = dp3;
        float f17 = z6Var.f10235j0;
        rect.set((int) (f15 - f16), (int) (f17 - f16), (int) (f15 + f16), (int) (f17 + f16));
        dVar.h(rect);
        if (z6Var.f10244r0 && z6Var.A0) {
            string = LocaleController.getString(R.string.AccDescrLockRecording);
        } else {
            string = LocaleController.getString(R.string.AccDescrCameraGallery);
        }
        dVar.j(string);
        if (!z6Var.f10248u0 && !z6Var.b()) {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (z10) {
            dVar.b(s0.c.f46294c);
        }
    }
}
