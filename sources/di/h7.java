package di;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h7 extends j1.b {
    public final Rect f7007o;
    public final i7 f7008p;

    public h7(i7 i7Var, i7 i7Var2) {
        super(i7Var2);
        this.f7008p = i7Var;
        this.f7007o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        i7 i7Var = this.f7008p;
        if (Math.abs(f7 - i7Var.f7062k0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - i7Var.f7061j0) <= AndroidUtilities.dp(30.0f) && !i7Var.b() && !i7Var.f7074u0) {
            return 0;
        }
        if (Math.abs(f7 - i7Var.f7063l0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - i7Var.f7061j0) <= AndroidUtilities.dp(30.0f) && !i7Var.b() && !i7Var.f7074u0) {
            return 2;
        }
        if (Math.abs(f7 - i7Var.f7060i0) <= AndroidUtilities.dp(60.0f) && Math.abs(f10 - i7Var.f7061j0) <= AndroidUtilities.dp(60.0f)) {
            return 1;
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        i7 i7Var = this.f7008p;
        if (!i7Var.b() && !i7Var.f7074u0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (!i7Var.b() && !i7Var.f7074u0) {
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        i7 i7Var = this.f7008p;
        if (i7Var.f7048a != null && !i7Var.f7074u0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 && !i7Var.b()) {
                        i7Var.d(180.0f);
                        ((fb) i7Var.f7048a).b();
                        return true;
                    }
                } else if (i7Var.b()) {
                    ((fb) i7Var.f7048a).a();
                    return true;
                } else if (i7Var.f7070r0) {
                    i7Var.f7070r0 = false;
                    i7Var.f7082z0 = false;
                    i7Var.f7075v0 = SystemClock.elapsedRealtime();
                    i7Var.f7074u0 = true;
                    ((fb) i7Var.f7048a).e(false);
                    i7Var.invalidate();
                    return true;
                } else if (i7Var.f7066o0) {
                    if (kc.c(((fb) i7Var.f7048a).f6957a)) {
                        i7Var.R = 0L;
                        i7Var.Q = System.currentTimeMillis();
                        i7Var.A0 = false;
                        ((fb) i7Var.f7048a).f(new bi.la(this, 28), false);
                    }
                    return true;
                } else {
                    ((fb) i7Var.f7048a).d();
                    return true;
                }
            } else if (!i7Var.b()) {
                if (i7Var.f7070r0 && i7Var.A0) {
                    i7Var.f7082z0 = false;
                    i7Var.G0.d(1.0f, true);
                    a4 a4Var = ((fb) i7Var.f7048a).f6957a.T0;
                    a4Var.f6593a.t(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                    a4Var.invalidate();
                    i7Var.invalidate();
                    return true;
                }
                ((fb) i7Var.f7048a).c();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void l(int i10, s0.c cVar) {
        String string;
        String string2;
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f44795a;
        cVar.i("android.widget.Button");
        boolean z10 = false;
        Rect rect = this.f7007o;
        i7 i7Var = this.f7008p;
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
                float f7 = i7Var.f7063l0;
                float f10 = dp;
                float f11 = i7Var.f7061j0;
                rect.set((int) (f7 - f10), (int) (f11 - f10), (int) (f7 + f10), (int) (f11 + f10));
                cVar.h(rect);
                cVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
                if (!i7Var.f7074u0 && !i7Var.b()) {
                    z10 = true;
                }
                accessibilityNodeInfo.setEnabled(z10);
                if (z10) {
                    cVar.b(s0.b.f44789c);
                    return;
                }
                return;
            }
            int dp2 = AndroidUtilities.dp(40.0f);
            float f12 = i7Var.f7060i0;
            float f13 = dp2;
            float f14 = i7Var.f7061j0;
            rect.set((int) (f12 - f13), (int) (f14 - f13), (int) (f12 + f13), (int) (f14 + f13));
            cVar.h(rect);
            if (i7Var.b()) {
                string2 = LocaleController.getString(R.string.Send);
            } else if (i7Var.f7070r0) {
                string2 = LocaleController.getString(R.string.AccDescrStopRecording);
            } else if (i7Var.f7066o0) {
                string2 = LocaleController.getString(R.string.AccDescrStartRecording);
            } else {
                string2 = LocaleController.getString(R.string.AccDescrTakePhoto);
            }
            cVar.j(string2);
            accessibilityNodeInfo.setEnabled(!i7Var.f7074u0);
            if (!i7Var.f7074u0) {
                cVar.b(s0.b.f44789c);
                return;
            }
            return;
        }
        int dp3 = AndroidUtilities.dp(22.0f);
        float f15 = i7Var.f7062k0;
        float f16 = dp3;
        float f17 = i7Var.f7061j0;
        rect.set((int) (f15 - f16), (int) (f17 - f16), (int) (f15 + f16), (int) (f17 + f16));
        cVar.h(rect);
        if (i7Var.f7070r0 && i7Var.A0) {
            string = LocaleController.getString(R.string.AccDescrLockRecording);
        } else {
            string = LocaleController.getString(R.string.AccDescrCameraGallery);
        }
        cVar.j(string);
        if (!i7Var.f7074u0 && !i7Var.b()) {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (z10) {
            cVar.b(s0.b.f44789c);
        }
    }
}
