package ng;

import android.view.ViewGroup;
import eg.s2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pr;
public final class h implements Runnable {
    public final int f16073a;
    public final s f16074b;

    public h(s sVar, int i10) {
        this.f16073a = i10;
        this.f16074b = sVar;
    }

    @Override
    public final void run() {
        int i10 = this.f16073a;
        s sVar = this.f16074b;
        switch (i10) {
            case 0:
                sVar.f16212n.requestFocus();
                return;
            case 1:
                sVar.finishFragment();
                return;
            case 2:
                if (!sVar.H) {
                    sVar.H = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = sVar.f16209c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.f16217y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    sVar.f16217y.setLayoutParams(marginLayoutParams);
                    sVar.f16209c.setVisibility(0);
                    s2 s2Var = sVar.f16209c;
                    s2Var.setTranslationY(s2Var.getMeasuredHeight());
                    sVar.f16209c.animate().setListener(null).cancel();
                    sVar.f16209c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(pr.f30183f).setUpdateListener(new j(sVar, 0)).setListener(new r(0)).start();
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
