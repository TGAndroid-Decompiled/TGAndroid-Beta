package ig;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.f3;
public final class n implements DialogInterface.OnShowListener {
    public final int f12179a;
    public final KeyEvent.Callback f12180b;
    public final Object f12181c;

    public n(KeyEvent.Callback callback, Object obj, int i10) {
        this.f12179a = i10;
        this.f12180b = callback;
        this.f12181c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f12179a) {
            case 0:
                View view = (View) this.f12180b;
                s sVar = (s) this.f12181c;
                if (view != null) {
                    view.clearFocus();
                }
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((f3) this.f12180b, (Integer) this.f12181c, dialogInterface);
                return;
        }
    }
}
