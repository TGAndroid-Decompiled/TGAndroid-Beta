package org.telegram.messenger.voip;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e3;

public final class q0 implements DialogInterface.OnShowListener {

    public final int f21961a;

    public final KeyEvent.Callback f21962b;

    public final Object f21963c;

    public q0(KeyEvent.Callback callback, Object obj, int i10) {
        this.f21961a = i10;
        this.f21962b = callback;
        this.f21963c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f21961a) {
            case 0:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((e3) this.f21962b, (Integer) this.f21963c, dialogInterface);
                break;
            default:
                View view = (View) this.f21962b;
                qf.p pVar = (qf.p) this.f21963c;
                if (view != null) {
                    view.clearFocus();
                }
                pVar.requestFocus();
                AndroidUtilities.showKeyboard(pVar);
                break;
        }
    }
}
