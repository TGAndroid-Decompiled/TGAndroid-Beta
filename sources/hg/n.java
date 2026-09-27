package hg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.g3;
public final class n implements DialogInterface.OnShowListener {
    public final int f10353a;
    public final KeyEvent.Callback f10354b;
    public final Object f10355c;

    public n(KeyEvent.Callback callback, Object obj, int i10) {
        this.f10353a = i10;
        this.f10354b = callback;
        this.f10355c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f10353a) {
            case 0:
                View view = (View) this.f10354b;
                s sVar = (s) this.f10355c;
                if (view != null) {
                    view.clearFocus();
                }
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((g3) this.f10354b, (Integer) this.f10355c, dialogInterface);
                return;
        }
    }
}
