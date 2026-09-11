package ig;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.f3;
public final class n implements DialogInterface.OnShowListener {
    public final int f12153a;
    public final KeyEvent.Callback f12154b;
    public final Object f12155c;

    public n(KeyEvent.Callback callback, Object obj, int i10) {
        this.f12153a = i10;
        this.f12154b = callback;
        this.f12155c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f12153a) {
            case 0:
                View view = (View) this.f12154b;
                s sVar = (s) this.f12155c;
                if (view != null) {
                    view.clearFocus();
                }
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((f3) this.f12154b, (Integer) this.f12155c, dialogInterface);
                return;
        }
    }
}
