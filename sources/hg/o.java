package hg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.f3;
public final class o implements DialogInterface.OnShowListener {
    public final int f11334a;
    public final KeyEvent.Callback f11335b;
    public final Object f11336c;

    public o(KeyEvent.Callback callback, Object obj, int i10) {
        this.f11334a = i10;
        this.f11335b = callback;
        this.f11336c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f11334a) {
            case 0:
                View view = (View) this.f11335b;
                t tVar = (t) this.f11336c;
                if (view != null) {
                    view.clearFocus();
                }
                tVar.requestFocus();
                AndroidUtilities.showKeyboard(tVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((f3) this.f11335b, (Integer) this.f11336c, dialogInterface);
                return;
        }
    }
}
