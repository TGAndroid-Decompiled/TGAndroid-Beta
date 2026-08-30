package org.telegram.messenger.voip;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g3;
public final class r0 implements DialogInterface.OnShowListener {
    public final int f18830a;
    public final KeyEvent.Callback f18831b;
    public final Object f18832c;

    public r0(KeyEvent.Callback callback, Object obj, int i10) {
        this.f18830a = i10;
        this.f18831b = callback;
        this.f18832c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f18830a) {
            case 0:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((g3) this.f18831b, (Integer) this.f18832c, dialogInterface);
                return;
            default:
                View view = (View) this.f18831b;
                uf.n nVar = (uf.n) this.f18832c;
                if (view != null) {
                    view.clearFocus();
                }
                nVar.requestFocus();
                AndroidUtilities.showKeyboard(nVar);
                return;
        }
    }
}
