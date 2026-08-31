package org.telegram.messenger.voip;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h3;
public final class r0 implements DialogInterface.OnShowListener {
    public final int f20462a;
    public final KeyEvent.Callback f20463b;
    public final Object f20464c;

    public r0(KeyEvent.Callback callback, Object obj, int i10) {
        this.f20462a = i10;
        this.f20463b = callback;
        this.f20464c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f20462a) {
            case 0:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((h3) this.f20463b, (Integer) this.f20464c, dialogInterface);
                return;
            default:
                View view = (View) this.f20463b;
                vf.n nVar = (vf.n) this.f20464c;
                if (view != null) {
                    view.clearFocus();
                }
                nVar.requestFocus();
                AndroidUtilities.showKeyboard(nVar);
                return;
        }
    }
}
