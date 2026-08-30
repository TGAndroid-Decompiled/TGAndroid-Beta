package mg;

import android.view.ViewGroup;
import dg.u2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.nr;
public final class h implements Runnable {
    public final int f14008a;
    public final s f14009b;

    public h(s sVar, int i10) {
        this.f14008a = i10;
        this.f14009b = sVar;
    }

    @Override
    public final void run() {
        int i10 = this.f14008a;
        s sVar = this.f14009b;
        switch (i10) {
            case 0:
                sVar.f14139n.requestFocus();
                return;
            case 1:
                sVar.finishFragment();
                return;
            case 2:
                if (!sVar.H) {
                    sVar.H = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = sVar.f14137c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.f14144y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    sVar.f14144y.setLayoutParams(marginLayoutParams);
                    sVar.f14137c.setVisibility(0);
                    u2 u2Var = sVar.f14137c;
                    u2Var.setTranslationY(u2Var.getMeasuredHeight());
                    sVar.f14137c.animate().setListener(null).cancel();
                    sVar.f14137c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(nr.f27346f).setUpdateListener(new j(sVar, 0)).setListener(new r(0)).start();
                    return;
                }
                return;
            case 3:
                af.g.s(sVar.getParentActivity(), "https://t.me/stickers");
                return;
            case 4:
                af.g.s(sVar.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                return;
            default:
                sVar.Y(false);
                return;
        }
    }
}
