package di;

import android.content.pm.ShortcutManager;
import android.window.OnBackInvokedDispatcher;
import com.google.firebase.datatransport.TransportRegistrar;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.hv0;
public final class w9 implements Utilities.Callback2Return, eh.d, fv0, gv0, GenericProvider, q9.d {
    public final int f8351a;

    public w9(int i10) {
        this.f8351a = i10;
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
    public Object D(cf.c cVar) {
        i5.f lambda$getComponents$0;
        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(cVar);
        return lambda$getComponents$0;
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f8351a) {
            case 18:
                fi.k3 k3Var = (fi.k3) obj;
                k3Var.f9760b = f7;
                k3Var.f9765e.invalidate();
                k3Var.W.setAlpha(f7);
                k3Var.E();
                k3Var.C();
                return;
            case 19:
            default:
                ((fi.q4) obj).setSwipeOffsetY(f7);
                return;
            case 20:
                ((fi.l4) obj).setLoadProgress(f7);
                return;
        }
    }

    @Override
    public int f(org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        switch (this.f8351a) {
            case 2:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return fh.b.m(f7, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sd, f6Var));
            case 3:
                if (!LiteMode.isEnabled(256)) {
                    return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
                }
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
                if (z10) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.825f;
                }
                return org.telegram.ui.ActionBar.j6.l1(f10, w02);
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return fh.b.m(f11, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Zk, f6Var));
            case 5:
                if (LiteMode.isEnabled(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return org.telegram.ui.ActionBar.j6.l1(f12, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Fi, f6Var));
            case 6:
                return 855638016;
            case 7:
                return 1073741824;
            case 8:
                return org.telegram.ui.ActionBar.j6.l1(0.075f, -16777216);
            case 9:
                return org.telegram.ui.ActionBar.j6.l1(0.88f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, f6Var));
            case 10:
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
                if (z10) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.825f;
                }
                return org.telegram.ui.ActionBar.j6.l1(f13, w03);
            case 11:
                if (LiteMode.isEnabled(262144)) {
                    f14 = 0.85f;
                } else {
                    f14 = 0.76f;
                }
                return fh.b.m(f14, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Yk, f6Var));
            case 12:
                if (LiteMode.isEnabled(262144)) {
                    f15 = 0.85f;
                } else {
                    f15 = 0.76f;
                }
                return org.telegram.ui.ActionBar.j6.l1(f15, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, f6Var));
            case 13:
                return org.telegram.ui.ActionBar.j6.l1(0.78f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20734h5, f6Var));
            case 14:
                return org.telegram.ui.ActionBar.j6.l1(0.7f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, f6Var));
            case 15:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                if (LiteMode.isEnabled(262144)) {
                    f16 = 0.85f;
                } else {
                    f16 = 0.76f;
                }
                return org.telegram.ui.ActionBar.j6.l1(f16, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, f6Var));
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f8351a) {
            case 17:
                return ((fi.k3) obj).f9760b;
            case 18:
            default:
                return ((fi.q4) obj).getSwipeOffsetY();
            case 19:
                return ((fi.l4) obj).f9813c;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r12 = (Void) obj;
        hv0 hv0Var = fi.q4.f9902b0;
        return Boolean.FALSE;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            if (num.intValue() == 0) {
                return LocaleController.getString(R.string.LiveStoryPricePerCommentFree);
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return "" + num;
    }
}
