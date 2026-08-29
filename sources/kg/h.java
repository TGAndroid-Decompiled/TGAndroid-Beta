package kg;

import android.view.ViewGroup;
import bg.x2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jr;
public final class h implements Runnable {
    public final int f13721a;
    public final s f13722b;

    public h(s sVar, int i10) {
        this.f13721a = i10;
        this.f13722b = sVar;
    }

    @Override
    public final void run() {
        int i10 = this.f13721a;
        s sVar = this.f13722b;
        switch (i10) {
            case 0:
                sVar.f13859n.requestFocus();
                return;
            case 1:
                sVar.finishFragment();
                return;
            case 2:
                if (!sVar.G) {
                    sVar.G = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = sVar.f13856c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.f13864y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    sVar.f13864y.setLayoutParams(marginLayoutParams);
                    sVar.f13856c.setVisibility(0);
                    x2 x2Var = sVar.f13856c;
                    x2Var.setTranslationY(x2Var.getMeasuredHeight());
                    sVar.f13856c.animate().setListener(null).cancel();
                    sVar.f13856c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(jr.f29800f).setUpdateListener(new j(sVar, 0)).setListener(new r(0)).start();
                    return;
                }
                return;
            case 3:
                ye.d.s(sVar.getParentActivity(), "https://t.me/stickers");
                return;
            case 4:
                ye.d.s(sVar.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                return;
            default:
                sVar.Y(false);
                return;
        }
    }
}
