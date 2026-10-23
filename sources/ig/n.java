package ig;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.h3;
public final class n implements DialogInterface.OnShowListener {
    public final int f13002a;
    public final KeyEvent.Callback f13003b;
    public final Object f13004c;

    public n(KeyEvent.Callback callback, Object obj, int i10) {
        this.f13002a = i10;
        this.f13003b = callback;
        this.f13004c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f13002a) {
            case 0:
                View view = (View) this.f13003b;
                s sVar = (s) this.f13004c;
                if (view != null) {
                    view.clearFocus();
                }
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((h3) this.f13003b, (Integer) this.f13004c, dialogInterface);
                return;
        }
    }
}
