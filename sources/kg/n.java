package kg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.v2;
public final class n implements DialogInterface.OnShowListener {
    public final int f17444a;
    public final KeyEvent.Callback f17445b;
    public final Object f17446c;

    public n(KeyEvent.Callback callback, Object obj, int i7) {
        this.f17444a = i7;
        this.f17445b = callback;
        this.f17446c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f17444a) {
            case 0:
                View view = (View) this.f17445b;
                s sVar = (s) this.f17446c;
                if (view != null) {
                    view.clearFocus();
                }
                sVar.requestFocus();
                org.telegram.messenger.g0.K3(sVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((v2) this.f17445b, (Integer) this.f17446c, dialogInterface);
                return;
        }
    }
}
