package ig;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.f3;
public final class n implements DialogInterface.OnShowListener {
    public final int f12972a;
    public final KeyEvent.Callback f12973b;
    public final Object f12974c;

    public n(KeyEvent.Callback callback, Object obj, int i10) {
        this.f12972a = i10;
        this.f12973b = callback;
        this.f12974c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f12972a) {
            case 0:
                View view = (View) this.f12973b;
                s sVar = (s) this.f12974c;
                if (view != null) {
                    view.clearFocus();
                }
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((f3) this.f12973b, (Integer) this.f12974c, dialogInterface);
                return;
        }
    }
}
