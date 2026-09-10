package gg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.h3;
public final class p implements DialogInterface.OnShowListener {
    public final int f8991a;
    public final KeyEvent.Callback f8992b;
    public final Object f8993c;

    public p(KeyEvent.Callback callback, Object obj, int i10) {
        this.f8991a = i10;
        this.f8992b = callback;
        this.f8993c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f8991a) {
            case 0:
                View view = (View) this.f8992b;
                u uVar = (u) this.f8993c;
                if (view != null) {
                    view.clearFocus();
                }
                uVar.requestFocus();
                AndroidUtilities.showKeyboard(uVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((h3) this.f8992b, (Integer) this.f8993c, dialogInterface);
                return;
        }
    }
}
