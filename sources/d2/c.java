package d2;

import android.content.pm.ShortcutManager;
import android.window.OnBackInvokedDispatcher;
import com.google.firebase.datatransport.TransportRegistrar;
import ei.k3;
import ei.k4;
import ei.p4;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.uv0;
public final class c implements d9.e, dh.d, sv0, tv0, GenericProvider, q9.d {
    public final int f7432a;

    public c(int i10) {
        this.f7432a = i10;
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
        return Integer.valueOf(((b) obj).f7431r);
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f7432a) {
            case 17:
                k3 k3Var = (k3) obj;
                k3Var.f8410b = f7;
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
    public int g(d6 d6Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        switch (this.f7432a) {
            case 1:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return eh.b.m(f7, h6.v0(h6.f19059d6, d6Var), h6.v0(h6.Sd, d6Var));
            case 2:
                if (!LiteMode.isEnabled(256)) {
                    return h6.w0(null, h6.G8, false);
                }
                int w02 = h6.w0(null, h6.G8, false);
                if (z10) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.825f;
                }
                return h6.l1(f10, w02);
            case 3:
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return eh.b.m(f11, h6.v0(h6.f19059d6, d6Var), h6.v0(h6.Zk, d6Var));
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return h6.l1(f12, h6.v0(h6.Fi, d6Var));
            case 5:
                return 855638016;
            case 6:
                return 1073741824;
            case 7:
                return h6.l1(0.075f, -16777216);
            case 8:
                return h6.l1(0.88f, h6.v0(h6.f19059d6, d6Var));
            case 9:
                int w03 = h6.w0(null, h6.G8, false);
                if (z10) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.825f;
                }
                return h6.l1(f13, w03);
            case 10:
                if (LiteMode.isEnabled(262144)) {
                    f14 = 0.85f;
                } else {
                    f14 = 0.76f;
                }
                return eh.b.m(f14, h6.v0(h6.f19059d6, d6Var), h6.v0(h6.Yk, d6Var));
            case 11:
                if (LiteMode.isEnabled(262144)) {
                    f15 = 0.85f;
                } else {
                    f15 = 0.76f;
                }
                return h6.l1(f15, h6.v0(h6.f19059d6, d6Var));
            case 12:
                return h6.l1(0.78f, h6.v0(h6.f19129h5, d6Var));
            case 13:
                return h6.l1(0.7f, h6.v0(h6.f19059d6, d6Var));
            case 14:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                if (LiteMode.isEnabled(262144)) {
                    f16 = 0.85f;
                } else {
                    f16 = 0.76f;
                }
                return h6.l1(f16, h6.v0(h6.f19059d6, d6Var));
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f7432a) {
            case 16:
                return ((k3) obj).f8410b;
            case 17:
            default:
                return ((p4) obj).getSwipeOffsetY();
            case 18:
                return ((k4) obj).f8445c;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r12 = (Void) obj;
        uv0 uv0Var = p4.f8528b0;
        return Boolean.FALSE;
    }
}
