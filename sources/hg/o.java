package hg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.e3;
public final class o implements DialogInterface.OnShowListener {
    public final int f10356a;
    public final KeyEvent.Callback f10357b;
    public final Object f10358c;

    public o(KeyEvent.Callback callback, Object obj, int i10) {
        this.f10356a = i10;
        this.f10357b = callback;
        this.f10358c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f10356a) {
            case 0:
                View view = (View) this.f10357b;
                u uVar = (u) this.f10358c;
                if (view != null) {
                    view.clearFocus();
                }
                uVar.requestFocus();
                AndroidUtilities.showKeyboard(uVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((e3) this.f10357b, (Integer) this.f10358c, dialogInterface);
                return;
        }
    }
}
