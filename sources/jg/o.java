package jg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.k3;
public final class o implements DialogInterface.OnShowListener {
    public final int f15792a;
    public final KeyEvent.Callback f15793b;
    public final Object f15794c;

    public o(KeyEvent.Callback callback, Object obj, int i10) {
        this.f15792a = i10;
        this.f15793b = callback;
        this.f15794c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f15792a) {
            case 0:
                View view = (View) this.f15793b;
                t tVar = (t) this.f15794c;
                if (view != null) {
                    view.clearFocus();
                }
                tVar.requestFocus();
                AndroidUtilities.showKeyboard(tVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((k3) this.f15793b, (Integer) this.f15794c, dialogInterface);
                return;
        }
    }
}
