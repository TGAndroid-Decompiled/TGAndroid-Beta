package hg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.f3;
public final class o implements DialogInterface.OnShowListener {
    public final int f10370a;
    public final KeyEvent.Callback f10371b;
    public final Object f10372c;

    public o(KeyEvent.Callback callback, Object obj, int i10) {
        this.f10370a = i10;
        this.f10371b = callback;
        this.f10372c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f10370a) {
            case 0:
                View view = (View) this.f10371b;
                u uVar = (u) this.f10372c;
                if (view != null) {
                    view.clearFocus();
                }
                uVar.requestFocus();
                AndroidUtilities.showKeyboard(uVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((f3) this.f10371b, (Integer) this.f10372c, dialogInterface);
                return;
        }
    }
}
