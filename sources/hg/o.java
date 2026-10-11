package hg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.e3;
public final class o implements DialogInterface.OnShowListener {
    public final int f11333a;
    public final KeyEvent.Callback f11334b;
    public final Object f11335c;

    public o(KeyEvent.Callback callback, Object obj, int i10) {
        this.f11333a = i10;
        this.f11334b = callback;
        this.f11335c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f11333a) {
            case 0:
                View view = (View) this.f11334b;
                t tVar = (t) this.f11335c;
                if (view != null) {
                    view.clearFocus();
                }
                tVar.requestFocus();
                AndroidUtilities.showKeyboard(tVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((e3) this.f11334b, (Integer) this.f11335c, dialogInterface);
                return;
        }
    }
}
