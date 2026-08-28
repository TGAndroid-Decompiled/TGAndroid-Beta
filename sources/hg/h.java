package hg;

import android.view.ViewGroup;
import fh.d2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gr;
public final class h implements Runnable {
    public final int f10606a;
    public final s f10607b;

    public h(s sVar, int i9) {
        this.f10606a = i9;
        this.f10607b = sVar;
    }

    @Override
    public final void run() {
        int i9 = this.f10606a;
        s sVar = this.f10607b;
        switch (i9) {
            case 0:
                sVar.f10724n.requestFocus();
                return;
            case 1:
                sVar.finishFragment();
                return;
            case 2:
                if (!sVar.G) {
                    sVar.G = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = sVar.f10721c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.f10729y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    sVar.f10729y.setLayoutParams(marginLayoutParams);
                    sVar.f10721c.setVisibility(0);
                    d2 d2Var = sVar.f10721c;
                    d2Var.setTranslationY(d2Var.getMeasuredHeight());
                    sVar.f10721c.animate().setListener(null).cancel();
                    sVar.f10721c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(gr.f28844f).setUpdateListener(new j(sVar, 0)).setListener(new r(0)).start();
                    return;
                }
                return;
            case 3:
                ve.e.s(sVar.getParentActivity(), "https://t.me/stickers");
                return;
            case 4:
                ve.e.s(sVar.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                return;
            default:
                sVar.X(false);
                return;
        }
    }
}
