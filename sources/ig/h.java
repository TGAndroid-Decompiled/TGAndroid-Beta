package ig;

import ag.p1;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.er;

public final class h implements Runnable {

    public final int f11308a;

    public final s f11309b;

    public h(s sVar, int i10) {
        this.f11308a = i10;
        this.f11309b = sVar;
    }

    @Override
    public final void run() {
        int i10 = this.f11308a;
        s sVar = this.f11309b;
        switch (i10) {
            case 0:
                sVar.f11446n.requestFocus();
                break;
            case 1:
                sVar.finishFragment();
                break;
            case 2:
                if (!sVar.G) {
                    sVar.G = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = sVar.f11443c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.f11451y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    sVar.f11451y.setLayoutParams(marginLayoutParams);
                    sVar.f11443c.setVisibility(0);
                    p1 p1Var = sVar.f11443c;
                    p1Var.setTranslationY(p1Var.getMeasuredHeight());
                    sVar.f11443c.animate().setListener(null).cancel();
                    sVar.f11443c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(er.f28122f).setUpdateListener(new j(sVar, 0)).setListener(new r(0)).start();
                }
                break;
            case 3:
                we.e.s(sVar.getParentActivity(), "https://t.me/stickers");
                break;
            case 4:
                we.e.s(sVar.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                break;
            default:
                sVar.Y(false);
                break;
        }
    }
}
