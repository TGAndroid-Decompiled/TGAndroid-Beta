package ah;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pr;
public final class l implements Runnable {
    public final int f641a;
    public final b0 f642b;

    public l(b0 b0Var, int i10) {
        this.f641a = i10;
        this.f642b = b0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f641a;
        b0 b0Var = this.f642b;
        switch (i10) {
            case 0:
                b0Var.f460n.requestFocus();
                return;
            case 1:
                b0Var.finishFragment();
                return;
            case 2:
                if (!b0Var.K) {
                    b0Var.K = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = b0Var.f457c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b0Var.f465y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    b0Var.f465y.setLayoutParams(marginLayoutParams);
                    b0Var.f457c.setVisibility(0);
                    y yVar = b0Var.f457c;
                    yVar.setTranslationY(yVar.getMeasuredHeight());
                    b0Var.f457c.animate().setListener(null).cancel();
                    b0Var.f457c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(pr.f29493f).setUpdateListener(new n(b0Var, 0)).setListener(new a0(0)).start();
                    return;
                }
                return;
            case 3:
                of.f.s(b0Var.getParentActivity(), "https://t.me/stickers");
                return;
            case 4:
                of.f.s(b0Var.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                return;
            default:
                b0Var.Y(false);
                return;
        }
    }
}
