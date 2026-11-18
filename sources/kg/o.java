package kg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.x2;
public final class o implements DialogInterface.OnShowListener {
    public final int f18401a;
    public final KeyEvent.Callback f18402b;
    public final Object f18403c;

    public o(KeyEvent.Callback callback, Object obj, int i7) {
        this.f18401a = i7;
        this.f18402b = callback;
        this.f18403c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f18401a) {
            case 0:
                View view = (View) this.f18402b;
                s sVar = (s) this.f18403c;
                if (view != null) {
                    view.clearFocus();
                }
                sVar.requestFocus();
                org.telegram.messenger.g0.I3(sVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((x2) this.f18402b, (Integer) this.f18403c, dialogInterface);
                return;
        }
    }
}
