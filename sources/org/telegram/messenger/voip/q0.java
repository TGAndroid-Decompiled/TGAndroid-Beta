package org.telegram.messenger.voip;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f3;
public final class q0 implements DialogInterface.OnShowListener {
    public final int f21937a;
    public final KeyEvent.Callback f21938b;
    public final Object f21939c;

    public q0(KeyEvent.Callback callback, Object obj, int i9) {
        this.f21937a = i9;
        this.f21938b = callback;
        this.f21939c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f21937a) {
            case 0:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((f3) this.f21938b, (Integer) this.f21939c, dialogInterface);
                return;
            default:
                View view = (View) this.f21938b;
                pf.o oVar = (pf.o) this.f21939c;
                if (view != null) {
                    view.clearFocus();
                }
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                return;
        }
    }
}
