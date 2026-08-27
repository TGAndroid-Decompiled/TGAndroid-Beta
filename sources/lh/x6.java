package lh;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class x6 extends j1.b {

    public final Rect f17036o;

    public final y6 f17037p;

    public x6(y6 y6Var, y6 y6Var2) {
        super(y6Var2);
        this.f17037p = y6Var;
        this.f17036o = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        y6 y6Var = this.f17037p;
        if (Math.abs(f10 - y6Var.f17095g0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - y6Var.f17094f0) <= AndroidUtilities.dp(30.0f) && !y6Var.b() && !y6Var.f17105q0) {
            return 0;
        }
        if (Math.abs(f10 - y6Var.f17096h0) > AndroidUtilities.dp(30.0f) || Math.abs(f11 - y6Var.f17094f0) > AndroidUtilities.dp(30.0f) || y6Var.b() || y6Var.f17105q0) {
            return (Math.abs(f10 - y6Var.f17092e0) > ((float) AndroidUtilities.dp(60.0f)) || Math.abs(f11 - y6Var.f17094f0) > ((float) AndroidUtilities.dp(60.0f))) ? Integer.MIN_VALUE : 1;
        }
        return 2;
    }

    @Override
    public final void h(ArrayList arrayList) {
        y6 y6Var = this.f17037p;
        if (!y6Var.b() && !y6Var.f17105q0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (y6Var.b() || y6Var.f17105q0) {
            return;
        }
        arrayList.add(2);
    }

    @Override
    public final boolean k(int i10, int i11) {
        y6 y6Var = this.f17037p;
        if (y6Var.f17084a != null && !y6Var.f17105q0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 == 1) {
                    if (y6Var.b()) {
                        ((oa) y6Var.f17084a).a();
                        return true;
                    }
                    if (y6Var.f17102n0) {
                        y6Var.f17102n0 = false;
                        y6Var.f17112v0 = false;
                        y6Var.f17107r0 = SystemClock.elapsedRealtime();
                        y6Var.f17105q0 = true;
                        ((oa) y6Var.f17084a).d(false);
                        y6Var.invalidate();
                        return true;
                    }
                    if (!y6Var.f17099k0) {
                        ((oa) y6Var.f17084a).c();
                        return true;
                    }
                    if (sb.d(((oa) y6Var.f17084a).f16494a)) {
                        y6Var.N = 0L;
                        y6Var.M = System.currentTimeMillis();
                        y6Var.f17114w0 = false;
                        ((oa) y6Var.f17084a).e(new kh.c(this, 16), false);
                        return true;
                    }
                    return true;
                }
                if (i10 == 2 && !y6Var.b()) {
                    y6Var.d(180.0f);
                    ((oa) y6Var.f17084a).b();
                    return true;
                }
            } else if (!y6Var.b()) {
                if (!y6Var.f17102n0 || !y6Var.f17114w0) {
                    sb sbVar = ((oa) y6Var.f17084a).f16494a;
                    if (sbVar.f16746b0 == 0 && !sbVar.L1 && !sbVar.M1 && sb.b(sbVar)) {
                        sbVar.f(true);
                    }
                    return true;
                }
                y6Var.f17112v0 = false;
                y6Var.C0.d(1.0f, true);
                u3 u3Var = ((oa) y6Var.f17084a).f16494a.P0;
                u3Var.f16902a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                u3Var.invalidate();
                y6Var.invalidate();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void l(int i10, s0.c cVar) {
        String string;
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f47656a;
        cVar.i("android.widget.Button");
        boolean z10 = false;
        Rect rect = this.f17036o;
        y6 y6Var = this.f17037p;
        if (i10 == 0) {
            int iDp = AndroidUtilities.dp(22.0f);
            float f10 = y6Var.f17095g0;
            float f11 = iDp;
            float f12 = y6Var.f17094f0;
            rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
            cVar.h(rect);
            cVar.j((y6Var.f17102n0 && y6Var.f17114w0) ? LocaleController.getString(R.string.AccDescrLockRecording) : LocaleController.getString(R.string.AccDescrCameraGallery));
            if (!y6Var.f17105q0 && !y6Var.b()) {
                z10 = true;
            }
            accessibilityNodeInfo.setEnabled(z10);
            if (z10) {
                cVar.b(s0.b.f47649c);
                return;
            }
            return;
        }
        if (i10 == 1) {
            int iDp2 = AndroidUtilities.dp(40.0f);
            float f13 = y6Var.f17092e0;
            float f14 = iDp2;
            float f15 = y6Var.f17094f0;
            rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
            cVar.h(rect);
            if (y6Var.b()) {
                string = LocaleController.getString(R.string.Send);
            } else if (y6Var.f17102n0) {
                string = LocaleController.getString(R.string.AccDescrStopRecording);
            } else {
                string = y6Var.f17099k0 ? LocaleController.getString(R.string.AccDescrStartRecording) : LocaleController.getString(R.string.AccDescrTakePhoto);
            }
            cVar.j(string);
            accessibilityNodeInfo.setEnabled(!y6Var.f17105q0);
            if (y6Var.f17105q0) {
                return;
            }
            cVar.b(s0.b.f47649c);
            return;
        }
        if (i10 != 2) {
            rect.set(0, 0, 1, 1);
            cVar.h(rect);
            cVar.p(false);
            cVar.j("");
            return;
        }
        int iDp3 = AndroidUtilities.dp(22.0f);
        float f16 = y6Var.f17096h0;
        float f17 = iDp3;
        float f18 = y6Var.f17094f0;
        rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
        cVar.h(rect);
        cVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
        if (!y6Var.f17105q0 && !y6Var.b()) {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (z10) {
            cVar.b(s0.b.f47649c);
        }
    }
}
