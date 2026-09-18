package hg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.g3;
public final class n implements DialogInterface.OnShowListener {
    public final int f10365a;
    public final KeyEvent.Callback f10366b;
    public final Object f10367c;

    public n(KeyEvent.Callback callback, Object obj, int i10) {
        this.f10365a = i10;
        this.f10366b = callback;
        this.f10367c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f10365a) {
            case 0:
                View view = (View) this.f10366b;
                s sVar = (s) this.f10367c;
                if (view != null) {
                    view.clearFocus();
                }
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((g3) this.f10366b, (Integer) this.f10367c, dialogInterface);
                return;
        }
    }
}
