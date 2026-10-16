package ig;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.e3;
public final class n implements DialogInterface.OnShowListener {
    public final int f11584a;
    public final KeyEvent.Callback f11585b;
    public final Object f11586c;

    public n(KeyEvent.Callback callback, Object obj, int i10) {
        this.f11584a = i10;
        this.f11585b = callback;
        this.f11586c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f11584a) {
            case 0:
                View view = (View) this.f11585b;
                s sVar = (s) this.f11586c;
                if (view != null) {
                    view.clearFocus();
                }
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((e3) this.f11585b, (Integer) this.f11586c, dialogInterface);
                return;
        }
    }
}
