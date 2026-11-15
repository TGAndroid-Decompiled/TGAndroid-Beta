package kg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.u2;
public final class o implements DialogInterface.OnShowListener {
    public final int f18013a;
    public final KeyEvent.Callback f18014b;
    public final Object f18015c;

    public o(KeyEvent.Callback callback, Object obj, int i7) {
        this.f18013a = i7;
        this.f18014b = callback;
        this.f18015c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f18013a) {
            case 0:
                View view = (View) this.f18014b;
                s sVar = (s) this.f18015c;
                if (view != null) {
                    view.clearFocus();
                }
                sVar.requestFocus();
                org.telegram.messenger.g0.J3(sVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((u2) this.f18014b, (Integer) this.f18015c, dialogInterface);
                return;
        }
    }
}
