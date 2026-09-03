package mg;

import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.zn;
public final class t implements Runnable {
    public final int f14133a;
    public final v f14134b;

    public t(v vVar, int i10) {
        this.f14133a = i10;
        this.f14134b = vVar;
    }

    @Override
    public final void run() {
        boolean z4;
        int i10;
        int i11;
        switch (this.f14133a) {
            case 0:
                this.f14134b.c(true);
                return;
            default:
                v vVar = this.f14134b;
                vVar.e = vVar.b();
                int i12 = vVar.f14141f;
                int i13 = vVar.h;
                zn znVar = vVar.f14138a;
                if (vVar.f14139b == null) {
                    if (znVar.getUserConfig().getClientUserId() == znVar.a()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    zn znVar2 = vVar.f14138a;
                    ?? pk0Var = new pk0(i10, znVar.getCurrentAccount(), vVar.getContext(), znVar2, znVar.getResourceProvider());
                    pk0Var.f14136i1 = 1.0f;
                    pk0Var.setWillNotDraw(false);
                    vVar.f14139b = pk0Var;
                    int dp = AndroidUtilities.dp(4.0f);
                    if (LocaleController.isRTL) {
                        i11 = 0;
                    } else {
                        i11 = i13;
                    }
                    int i14 = dp + i11;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    int dp3 = AndroidUtilities.dp(4.0f);
                    if (!LocaleController.isRTL) {
                        i13 = 0;
                    }
                    pk0Var.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(i12));
                    vVar.f14139b.setDelegate(new o5.i(vVar, 27));
                    vVar.f14139b.setClipChildren(false);
                    vVar.f14139b.setClipToPadding(false);
                    vVar.addView(vVar.f14139b, b6.e(-2, i12 + 70, 5));
                }
                vVar.c(false);
                if (vVar.f14139b.isEnabled()) {
                    vVar.f14146x = true;
                    vVar.f14139b.p(vVar.e, znVar.W7, true);
                    vVar.f14139b.r(false);
                    return;
                }
                vVar.f14146x = false;
                vVar.f14139b.setTransitionProgress(1.0f);
                return;
        }
    }
}
