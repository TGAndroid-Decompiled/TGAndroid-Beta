package hg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.e3;
public final class o implements DialogInterface.OnShowListener {
    public final int f11332a;
    public final KeyEvent.Callback f11333b;
    public final Object f11334c;

    public o(KeyEvent.Callback callback, Object obj, int i10) {
        this.f11332a = i10;
        this.f11333b = callback;
        this.f11334c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f11332a) {
            case 0:
                View view = (View) this.f11333b;
                t tVar = (t) this.f11334c;
                if (view != null) {
                    view.clearFocus();
                }
                tVar.requestFocus();
                AndroidUtilities.showKeyboard(tVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((e3) this.f11333b, (Integer) this.f11334c, dialogInterface);
                return;
        }
    }
}
