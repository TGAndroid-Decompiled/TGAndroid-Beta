package kg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.w2;
public final class o implements DialogInterface.OnShowListener {
    public final int f18432a;
    public final KeyEvent.Callback f18433b;
    public final Object f18434c;

    public o(KeyEvent.Callback callback, Object obj, int i7) {
        this.f18432a = i7;
        this.f18433b = callback;
        this.f18434c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f18432a) {
            case 0:
                View view = (View) this.f18433b;
                s sVar = (s) this.f18434c;
                if (view != null) {
                    view.clearFocus();
                }
                sVar.requestFocus();
                org.telegram.messenger.g0.I3(sVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((w2) this.f18433b, (Integer) this.f18434c, dialogInterface);
                return;
        }
    }
}
