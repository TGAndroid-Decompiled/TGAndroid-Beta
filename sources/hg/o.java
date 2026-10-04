package hg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.f3;
public final class o implements DialogInterface.OnShowListener {
    public final int f11282a;
    public final KeyEvent.Callback f11283b;
    public final Object f11284c;

    public o(KeyEvent.Callback callback, Object obj, int i10) {
        this.f11282a = i10;
        this.f11283b = callback;
        this.f11284c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f11282a) {
            case 0:
                View view = (View) this.f11283b;
                t tVar = (t) this.f11284c;
                if (view != null) {
                    view.clearFocus();
                }
                tVar.requestFocus();
                AndroidUtilities.showKeyboard(tVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((f3) this.f11283b, (Integer) this.f11284c, dialogInterface);
                return;
        }
    }
}
