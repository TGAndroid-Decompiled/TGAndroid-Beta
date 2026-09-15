package hg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.f3;
public final class n implements DialogInterface.OnShowListener {
    public final int f10360a;
    public final KeyEvent.Callback f10361b;
    public final Object f10362c;

    public n(KeyEvent.Callback callback, Object obj, int i10) {
        this.f10360a = i10;
        this.f10361b = callback;
        this.f10362c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f10360a) {
            case 0:
                View view = (View) this.f10361b;
                s sVar = (s) this.f10362c;
                if (view != null) {
                    view.clearFocus();
                }
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((f3) this.f10361b, (Integer) this.f10362c, dialogInterface);
                return;
        }
    }
}
