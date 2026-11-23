package kg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.w2;
public final class o implements DialogInterface.OnShowListener {
    public final int f18495a;
    public final KeyEvent.Callback f18496b;
    public final Object f18497c;

    public o(KeyEvent.Callback callback, Object obj, int i7) {
        this.f18495a = i7;
        this.f18496b = callback;
        this.f18497c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f18495a) {
            case 0:
                View view = (View) this.f18496b;
                s sVar = (s) this.f18497c;
                if (view != null) {
                    view.clearFocus();
                }
                sVar.requestFocus();
                org.telegram.messenger.g0.I3(sVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((w2) this.f18496b, (Integer) this.f18497c, dialogInterface);
                return;
        }
    }
}
