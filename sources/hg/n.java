package hg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.f3;
public final class n implements DialogInterface.OnShowListener {
    public final int f10366a;
    public final KeyEvent.Callback f10367b;
    public final Object f10368c;

    public n(KeyEvent.Callback callback, Object obj, int i10) {
        this.f10366a = i10;
        this.f10367b = callback;
        this.f10368c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f10366a) {
            case 0:
                View view = (View) this.f10367b;
                s sVar = (s) this.f10368c;
                if (view != null) {
                    view.clearFocus();
                }
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((f3) this.f10367b, (Integer) this.f10368c, dialogInterface);
                return;
        }
    }
}
