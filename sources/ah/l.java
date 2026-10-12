package ah;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.es;
public final class l implements Runnable {
    public final int f817a;
    public final a0 f818b;

    public l(a0 a0Var, int i10) {
        this.f817a = i10;
        this.f818b = a0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f817a;
        a0 a0Var = this.f818b;
        switch (i10) {
            case 0:
                a0Var.f639n.requestFocus();
                return;
            case 1:
                a0Var.finishFragment();
                return;
            case 2:
                if (!a0Var.K) {
                    a0Var.K = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = a0Var.f637c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a0Var.f644y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    a0Var.f644y.setLayoutParams(marginLayoutParams);
                    a0Var.f637c.setVisibility(0);
                    x xVar = a0Var.f637c;
                    xVar.setTranslationY(xVar.getMeasuredHeight());
                    a0Var.f637c.animate().setListener(null).cancel();
                    a0Var.f637c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(es.f24771f).setUpdateListener(new n(a0Var, 0)).setListener(new z(0)).start();
                    return;
                }
                return;
            case 3:
                pf.d.s(a0Var.getParentActivity(), "https://t.me/stickers");
                return;
            case 4:
                pf.d.s(a0Var.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                return;
            default:
                a0Var.Y(false);
                return;
        }
    }
}
