package mg;

import android.view.ViewGroup;
import dg.u2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mr;
public final class h implements Runnable {
    public final int f13996a;
    public final s f13997b;

    public h(s sVar, int i10) {
        this.f13996a = i10;
        this.f13997b = sVar;
    }

    @Override
    public final void run() {
        int i10 = this.f13996a;
        s sVar = this.f13997b;
        switch (i10) {
            case 0:
                sVar.f14127n.requestFocus();
                return;
            case 1:
                sVar.finishFragment();
                return;
            case 2:
                if (!sVar.H) {
                    sVar.H = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = sVar.f14125c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.f14132y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    sVar.f14132y.setLayoutParams(marginLayoutParams);
                    sVar.f14125c.setVisibility(0);
                    u2 u2Var = sVar.f14125c;
                    u2Var.setTranslationY(u2Var.getMeasuredHeight());
                    sVar.f14125c.animate().setListener(null).cancel();
                    sVar.f14125c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(mr.f27122f).setUpdateListener(new j(sVar, 0)).setListener(new r(0)).start();
                    return;
                }
                return;
            case 3:
                ze.d.s(sVar.getParentActivity(), "https://t.me/stickers");
                return;
            case 4:
                ze.d.s(sVar.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                return;
            default:
                sVar.Y(false);
                return;
        }
    }
}
