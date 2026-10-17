package ig;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.f3;
public final class n implements DialogInterface.OnShowListener {
    public final int f12968a;
    public final KeyEvent.Callback f12969b;
    public final Object f12970c;

    public n(KeyEvent.Callback callback, Object obj, int i10) {
        this.f12968a = i10;
        this.f12969b = callback;
        this.f12970c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f12968a) {
            case 0:
                View view = (View) this.f12969b;
                s sVar = (s) this.f12970c;
                if (view != null) {
                    view.clearFocus();
                }
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((f3) this.f12969b, (Integer) this.f12970c, dialogInterface);
                return;
        }
    }
}
