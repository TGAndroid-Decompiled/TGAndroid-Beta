package ah;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bs;
public final class l implements Runnable {
    public final int f823a;
    public final a0 f824b;

    public l(a0 a0Var, int i10) {
        this.f823a = i10;
        this.f824b = a0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f823a;
        a0 a0Var = this.f824b;
        switch (i10) {
            case 0:
                a0Var.f645n.requestFocus();
                return;
            case 1:
                a0Var.finishFragment();
                return;
            case 2:
                if (!a0Var.K) {
                    a0Var.K = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = a0Var.f643c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a0Var.f650y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    a0Var.f650y.setLayoutParams(marginLayoutParams);
                    a0Var.f643c.setVisibility(0);
                    x xVar = a0Var.f643c;
                    xVar.setTranslationY(xVar.getMeasuredHeight());
                    a0Var.f643c.animate().setListener(null).cancel();
                    a0Var.f643c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(bs.f25030f).setUpdateListener(new n(a0Var, 0)).setListener(new z(0)).start();
                    return;
                }
                return;
            case 3:
                pf.d.r(a0Var.getParentActivity(), "https://t.me/stickers");
                return;
            case 4:
                pf.d.r(a0Var.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                return;
            default:
                a0Var.Y(false);
                return;
        }
    }
}
