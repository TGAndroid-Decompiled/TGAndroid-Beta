package bh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class j implements Runnable {
    public final int f4069a;
    public final u f4070b;

    public j(u uVar, int i10) {
        this.f4069a = i10;
        this.f4070b = uVar;
    }

    @Override
    public final void run() {
        int i10 = this.f4069a;
        u uVar = this.f4070b;
        switch (i10) {
            case 0:
                uVar.h.requestFocus();
                return;
            case 1:
                uVar.h.setFocusableInTouchMode(true);
                return;
            case 2:
                uVar.finishFragment();
                return;
            case 3:
                if (uVar.O && !uVar.N) {
                    uVar.N = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    uVar.f4151c.setVisibility(0);
                    uVar.f4151c.setLayerType(2, null);
                    uVar.f0(uVar.P.e);
                    uVar.P.a(true, true);
                    return;
                }
                return;
            case 4:
                qf.d.r(uVar.getParentActivity(), "https://t.me/stickers");
                return;
            case 5:
                qf.d.r(uVar.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                return;
            default:
                uVar.a0(false);
                return;
        }
    }
}
