package d2;

import android.content.pm.ShortcutManager;
import android.window.OnBackInvokedDispatcher;
import com.google.firebase.datatransport.TransportRegistrar;
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
public final class c implements d9.e, dh.d, gv0, hv0, GenericProvider, q9.d {
    public final int f7447a;

    public c(int i10) {
        this.f7447a = i10;
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
    public Object G(cf.c cVar) {
        i5.f lambda$getComponents$0;
        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(cVar);
        return lambda$getComponents$0;
    }

    @Override
    public Object apply(Object obj) {
        return Integer.valueOf(((b) obj).f7446r);
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f7447a) {
            case 17:
                k3 k3Var = (k3) obj;
                k3Var.f8425b = f7;
                k3Var.e.invalidate();
                k3Var.W.setAlpha(f7);
                k3Var.E();
                k3Var.C();
                return;
            case 18:
            default:
                ((p4) obj).setSwipeOffsetY(f7);
                return;
            case 19:
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
        switch (this.f7447a) {
            case 1:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return eh.b.m(f7, i6.v0(i6.f18834d6, e6Var), i6.v0(i6.Sd, e6Var));
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
                return eh.b.m(f11, i6.v0(i6.f18834d6, e6Var), i6.v0(i6.Zk, e6Var));
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
                return 1073741824;
            case 7:
                return i6.l1(0.075f, -16777216);
            case 8:
                return i6.l1(0.88f, i6.v0(i6.f18834d6, e6Var));
            case 9:
                int w03 = i6.w0(null, i6.G8, false);
                if (z10) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.825f;
                }
                return i6.l1(f13, w03);
            case 10:
                if (LiteMode.isEnabled(262144)) {
                    f14 = 0.85f;
                } else {
                    f14 = 0.76f;
                }
                return eh.b.m(f14, i6.v0(i6.f18834d6, e6Var), i6.v0(i6.Yk, e6Var));
            case 11:
                if (LiteMode.isEnabled(262144)) {
                    f15 = 0.85f;
                } else {
                    f15 = 0.76f;
                }
                return i6.l1(f15, i6.v0(i6.f18834d6, e6Var));
            case 12:
                return i6.l1(0.78f, i6.v0(i6.f18904h5, e6Var));
            case 13:
                return i6.l1(0.7f, i6.v0(i6.f18834d6, e6Var));
            case 14:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                if (LiteMode.isEnabled(262144)) {
                    f16 = 0.85f;
                } else {
                    f16 = 0.76f;
                }
                return i6.l1(f16, i6.v0(i6.f18834d6, e6Var));
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f7447a) {
            case 16:
                return ((k3) obj).f8425b;
            case 17:
            default:
                return ((p4) obj).getSwipeOffsetY();
            case 18:
                return ((k4) obj).f8460c;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r12 = (Void) obj;
        iv0 iv0Var = p4.f8543b0;
        return Boolean.FALSE;
    }
}
