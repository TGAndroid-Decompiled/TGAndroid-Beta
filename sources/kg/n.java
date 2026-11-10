package kg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.w2;
public final class n implements DialogInterface.OnShowListener {
    public final int f17447a;
    public final KeyEvent.Callback f17448b;
    public final Object f17449c;

    public n(KeyEvent.Callback callback, Object obj, int i7) {
        this.f17447a = i7;
        this.f17448b = callback;
        this.f17449c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f17447a) {
            case 0:
                View view = (View) this.f17448b;
                s sVar = (s) this.f17449c;
                if (view != null) {
                    view.clearFocus();
                }
                sVar.requestFocus();
                org.telegram.messenger.g0.K3(sVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((w2) this.f17448b, (Integer) this.f17449c, dialogInterface);
                return;
        }
    }
}
