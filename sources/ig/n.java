package ig;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.e3;
public final class n implements DialogInterface.OnShowListener {
    public final int f11580a;
    public final KeyEvent.Callback f11581b;
    public final Object f11582c;

    public n(KeyEvent.Callback callback, Object obj, int i10) {
        this.f11580a = i10;
        this.f11581b = callback;
        this.f11582c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f11580a) {
            case 0:
                View view = (View) this.f11581b;
                s sVar = (s) this.f11582c;
                if (view != null) {
                    view.clearFocus();
                }
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((e3) this.f11581b, (Integer) this.f11582c, dialogInterface);
                return;
        }
    }
}
