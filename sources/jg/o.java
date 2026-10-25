package jg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.k3;
public final class o implements DialogInterface.OnShowListener {
    public final int f15793a;
    public final KeyEvent.Callback f15794b;
    public final Object f15795c;

    public o(KeyEvent.Callback callback, Object obj, int i10) {
        this.f15793a = i10;
        this.f15794b = callback;
        this.f15795c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f15793a) {
            case 0:
                View view = (View) this.f15794b;
                t tVar = (t) this.f15795c;
                if (view != null) {
                    view.clearFocus();
                }
                tVar.requestFocus();
                AndroidUtilities.showKeyboard(tVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((k3) this.f15794b, (Integer) this.f15795c, dialogInterface);
                return;
        }
    }
}
