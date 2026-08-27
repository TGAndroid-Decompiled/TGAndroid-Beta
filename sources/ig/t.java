package ig;

import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.rn;

public final class t implements Runnable {

    public final int f11452a;

    public final v f11453b;

    public t(v vVar, int i10) {
        this.f11452a = i10;
        this.f11453b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f11452a) {
            case 0:
                this.f11453b.c(true);
                break;
            default:
                v vVar = this.f11453b;
                vVar.f11460e = vVar.b();
                int i10 = vVar.f11461f;
                int i11 = vVar.h;
                rn rnVar = vVar.f11457a;
                if (vVar.f11458b == null) {
                    u uVar = new u((rnVar.getUserConfig().getClientUserId() > rnVar.a() ? 1 : (rnVar.getUserConfig().getClientUserId() == rnVar.a() ? 0 : -1)) == 0 ? 3 : 0, rnVar.getCurrentAccount(), vVar.getContext(), vVar.f11457a, rnVar.getResourceProvider());
                    uVar.f11455h1 = 1.0f;
                    uVar.setWillNotDraw(false);
                    vVar.f11458b = uVar;
                    int iDp = AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : i11);
                    int iDp2 = AndroidUtilities.dp(4.0f);
                    int iDp3 = AndroidUtilities.dp(4.0f);
                    if (!LocaleController.isRTL) {
                        i11 = 0;
                    }
                    uVar.setPadding(iDp, iDp2, iDp3 + i11, AndroidUtilities.dp(i10));
                    vVar.f11458b.setDelegate(new ga.c(vVar, 18));
                    vVar.f11458b.setClipChildren(false);
                    vVar.f11458b.setClipToPadding(false);
                    vVar.addView(vVar.f11458b, z5.e(-2, i10 + 70, 5));
                }
                vVar.c(false);
                if (!vVar.f11458b.isEnabled()) {
                    vVar.f11466x = false;
                    vVar.f11458b.setTransitionProgress(1.0f);
                } else {
                    vVar.f11466x = true;
                    vVar.f11458b.p(vVar.f11460e, rnVar.V7, true);
                    vVar.f11458b.r(false);
                }
                break;
        }
    }
}
