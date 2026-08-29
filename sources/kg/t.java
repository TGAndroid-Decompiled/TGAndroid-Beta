package kg;

import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.tn;
public final class t implements Runnable {
    public final int f13865a;
    public final v f13866b;

    public t(v vVar, int i10) {
        this.f13865a = i10;
        this.f13866b = vVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f13865a) {
            case 0:
                this.f13866b.c(true);
                return;
            default:
                v vVar = this.f13866b;
                vVar.f13873e = vVar.b();
                int i12 = vVar.f13874f;
                int i13 = vVar.h;
                tn tnVar = vVar.f13870a;
                if (vVar.f13871b == null) {
                    if (tnVar.getUserConfig().getClientUserId() == tnVar.a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    tn tnVar2 = vVar.f13870a;
                    ?? fk0Var = new fk0(i10, tnVar.getCurrentAccount(), vVar.getContext(), tnVar2, tnVar.getResourceProvider());
                    fk0Var.f13868h1 = 1.0f;
                    fk0Var.setWillNotDraw(false);
                    vVar.f13871b = fk0Var;
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
                    fk0Var.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(i12));
                    vVar.f13871b.setDelegate(new ha.c(vVar, 22));
                    vVar.f13871b.setClipChildren(false);
                    vVar.f13871b.setClipToPadding(false);
                    vVar.addView(vVar.f13871b, f6.e(-2, i12 + 70, 5));
                }
                vVar.c(false);
                if (vVar.f13871b.isEnabled()) {
                    vVar.f13879x = true;
                    vVar.f13871b.p(vVar.f13873e, tnVar.V7, true);
                    vVar.f13871b.r(false);
                    return;
                }
                vVar.f13879x = false;
                vVar.f13871b.setTransitionProgress(1.0f);
                return;
        }
    }
}
