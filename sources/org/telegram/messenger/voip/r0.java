package org.telegram.messenger.voip;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g3;
public final class r0 implements DialogInterface.OnShowListener {
    public final int f18812a;
    public final KeyEvent.Callback f18813b;
    public final Object f18814c;

    public r0(KeyEvent.Callback callback, Object obj, int i10) {
        this.f18812a = i10;
        this.f18813b = callback;
        this.f18814c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f18812a) {
            case 0:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((g3) this.f18813b, (Integer) this.f18814c, dialogInterface);
                return;
            default:
                View view = (View) this.f18813b;
                uf.n nVar = (uf.n) this.f18814c;
                if (view != null) {
                    view.clearFocus();
                }
                nVar.requestFocus();
                AndroidUtilities.showKeyboard(nVar);
                return;
        }
    }
}
