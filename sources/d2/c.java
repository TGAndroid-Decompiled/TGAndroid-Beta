package d2;

import android.content.pm.ShortcutManager;
import android.window.OnBackInvokedDispatcher;
import ei.k3;
import ei.k4;
import ei.p4;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.vv0;
public final class c implements d9.e, dh.d, tv0, uv0, GenericProvider {
    public final int f7448a;

    public c(int i10) {
        this.f7448a = i10;
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
        return Integer.valueOf(((b) obj).f7447r);
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f7448a) {
            case 18:
                k3 k3Var = (k3) obj;
                k3Var.f8427b = f7;
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
    public int f(f6 f6Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        switch (this.f7448a) {
            case 1:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return eh.b.n(f7, j6.v0(j6.f19109d6, f6Var), j6.v0(j6.Sd, f6Var));
            case 2:
                if (!LiteMode.isEnabled(256)) {
                    return j6.w0(null, j6.G8, false);
                }
                int w02 = j6.w0(null, j6.G8, false);
                if (z10) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.825f;
                }
                return j6.l1(f10, w02);
            case 3:
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return eh.b.n(f11, j6.v0(j6.f19109d6, f6Var), j6.v0(j6.Zk, f6Var));
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return j6.l1(f12, j6.v0(j6.Fi, f6Var));
            case 5:
                return 855638016;
            case 6:
                if (LiteMode.isEnabled(262144)) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.8f;
                }
                return eh.b.n(f13, j6.v0(j6.f19053a7, f6Var), j6.v0(j6.f19109d6, f6Var));
            case 7:
                return 1073741824;
            case 8:
                return j6.l1(0.075f, -16777216);
            case 9:
                return j6.l1(0.88f, j6.v0(j6.f19109d6, f6Var));
            case 10:
                int w03 = j6.w0(null, j6.G8, false);
                if (z10) {
                    f14 = 0.85f;
                } else {
                    f14 = 0.825f;
                }
                return j6.l1(f14, w03);
            case 11:
                if (LiteMode.isEnabled(262144)) {
                    f15 = 0.85f;
                } else {
                    f15 = 0.76f;
                }
                return eh.b.n(f15, j6.v0(j6.f19109d6, f6Var), j6.v0(j6.Yk, f6Var));
            case 12:
                if (LiteMode.isEnabled(262144)) {
                    f16 = 0.85f;
                } else {
                    f16 = 0.76f;
                }
                return j6.l1(f16, j6.v0(j6.f19109d6, f6Var));
            case 13:
                return j6.l1(0.78f, j6.v0(j6.f19180h5, f6Var));
            case 14:
                return j6.l1(0.7f, j6.v0(j6.f19109d6, f6Var));
            case 15:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                if (LiteMode.isEnabled(262144)) {
                    f17 = 0.85f;
                } else {
                    f17 = 0.76f;
                }
                return j6.l1(f17, j6.v0(j6.f19109d6, f6Var));
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f7448a) {
            case 17:
                return ((k3) obj).f8427b;
            case 18:
            default:
                return ((p4) obj).getSwipeOffsetY();
            case 19:
                return ((k4) obj).f8462c;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r12 = (Void) obj;
        vv0 vv0Var = p4.f8545b0;
        return Boolean.FALSE;
    }
}
