package ng;

import android.view.ViewGroup;
import eg.s2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pr;
public final class h implements Runnable {
    public final int f16075a;
    public final s f16076b;

    public h(s sVar, int i10) {
        this.f16075a = i10;
        this.f16076b = sVar;
    }

    @Override
    public final void run() {
        int i10 = this.f16075a;
        s sVar = this.f16076b;
        switch (i10) {
            case 0:
                sVar.f16214n.requestFocus();
                return;
            case 1:
                sVar.finishFragment();
                return;
            case 2:
                if (!sVar.H) {
                    sVar.H = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = sVar.f16211c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.f16219y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    sVar.f16219y.setLayoutParams(marginLayoutParams);
                    sVar.f16211c.setVisibility(0);
                    s2 s2Var = sVar.f16211c;
                    s2Var.setTranslationY(s2Var.getMeasuredHeight());
                    sVar.f16211c.animate().setListener(null).cancel();
                    sVar.f16211c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(pr.f30168f).setUpdateListener(new j(sVar, 0)).setListener(new r(0)).start();
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
