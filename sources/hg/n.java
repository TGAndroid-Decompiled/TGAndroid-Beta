package hg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.f3;
public final class n implements DialogInterface.OnShowListener {
    public final int f11274a;
    public final KeyEvent.Callback f11275b;
    public final Object f11276c;

    public n(KeyEvent.Callback callback, Object obj, int i10) {
        this.f11274a = i10;
        this.f11275b = callback;
        this.f11276c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f11274a) {
            case 0:
                View view = (View) this.f11275b;
                s sVar = (s) this.f11276c;
                if (view != null) {
                    view.clearFocus();
                }
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((f3) this.f11275b, (Integer) this.f11276c, dialogInterface);
                return;
        }
    }
}
