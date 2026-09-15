package d2;

import android.content.pm.ShortcutManager;
import android.window.OnBackInvokedDispatcher;
import ei.k3;
import ei.k4;
import ei.p4;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.iv0;
public final class c implements d9.e, dh.d, gv0, hv0, GenericProvider {
    public final int f7445a;

    public c(int i10) {
        this.f7445a = i10;
    }

    public static ShortcutManager a(Object obj) {
        return (ShortcutManager) obj;
    }

    public static OnBackInvokedDispatcher c(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static Class d() {
        return ShortcutManager.class;
    }

    @Override
    public Object apply(Object obj) {
        return Integer.valueOf(((b) obj).f7444r);
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f7445a) {
            case 18:
                k3 k3Var = (k3) obj;
                k3Var.f8423b = f7;
                k3Var.e.invalidate();
                k3Var.W.setAlpha(f7);
                k3Var.E();
                k3Var.C();
                return;
            case 19:
            default:
                ((p4) obj).setSwipeOffsetY(f7);
                return;
            case 20:
                ((k4) obj).setLoadProgress(f7);
                return;
        }
    }

    @Override
    public int g(e6 e6Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        switch (this.f7445a) {
            case 1:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return eh.b.m(f7, i6.v0(i6.f18836d6, e6Var), i6.v0(i6.Sd, e6Var));
            case 2:
                if (!LiteMode.isEnabled(256)) {
                    return i6.w0(null, i6.G8, false);
                }
                int w02 = i6.w0(null, i6.G8, false);
                if (z10) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.825f;
                }
                return i6.l1(f10, w02);
            case 3:
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return eh.b.m(f11, i6.v0(i6.f18836d6, e6Var), i6.v0(i6.Zk, e6Var));
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return i6.l1(f12, i6.v0(i6.Fi, e6Var));
            case 5:
                return 855638016;
            case 6:
                if (LiteMode.isEnabled(262144)) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.8f;
                }
                return eh.b.m(f13, i6.v0(i6.f18780a7, e6Var), i6.v0(i6.f18836d6, e6Var));
            case 7:
                return 1073741824;
            case 8:
                return i6.l1(0.075f, -16777216);
            case 9:
                return i6.l1(0.88f, i6.v0(i6.f18836d6, e6Var));
            case 10:
                int w03 = i6.w0(null, i6.G8, false);
                if (z10) {
                    f14 = 0.85f;
                } else {
                    f14 = 0.825f;
                }
                return i6.l1(f14, w03);
            case 11:
                if (LiteMode.isEnabled(262144)) {
                    f15 = 0.85f;
                } else {
                    f15 = 0.76f;
                }
                return eh.b.m(f15, i6.v0(i6.f18836d6, e6Var), i6.v0(i6.Yk, e6Var));
            case 12:
                if (LiteMode.isEnabled(262144)) {
                    f16 = 0.85f;
                } else {
                    f16 = 0.76f;
                }
                return i6.l1(f16, i6.v0(i6.f18836d6, e6Var));
            case 13:
                return i6.l1(0.78f, i6.v0(i6.f18907h5, e6Var));
            case 14:
                return i6.l1(0.7f, i6.v0(i6.f18836d6, e6Var));
            case 15:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                if (LiteMode.isEnabled(262144)) {
                    f17 = 0.85f;
                } else {
                    f17 = 0.76f;
                }
                return i6.l1(f17, i6.v0(i6.f18836d6, e6Var));
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f7445a) {
            case 17:
                return ((k3) obj).f8423b;
            case 18:
            default:
                return ((p4) obj).getSwipeOffsetY();
            case 19:
                return ((k4) obj).f8458c;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r12 = (Void) obj;
        iv0 iv0Var = p4.f8541b0;
        return Boolean.FALSE;
    }
}
