package org.telegram.messenger.voip;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f3;
public final class q0 implements DialogInterface.OnShowListener {
    public final int f21999a;
    public final KeyEvent.Callback f22000b;
    public final Object f22001c;

    public q0(KeyEvent.Callback callback, Object obj, int i10) {
        this.f21999a = i10;
        this.f22000b = callback;
        this.f22001c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f21999a) {
            case 0:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((f3) this.f22000b, (Integer) this.f22001c, dialogInterface);
                return;
            default:
                View view = (View) this.f22000b;
                sf.o oVar = (sf.o) this.f22001c;
                if (view != null) {
                    view.clearFocus();
                }
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                return;
        }
    }
}
