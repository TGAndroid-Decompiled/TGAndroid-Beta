package ag;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class y implements DialogInterface.OnShowListener {
    public final int f800a;
    public final KeyEvent.Callback f801b;
    public final Object f802c;

    public y(KeyEvent.Callback callback, Object obj, int i10) {
        this.f800a = i10;
        this.f801b = callback;
        this.f802c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f800a) {
            case 0:
                View view = (View) this.f801b;
                f0 f0Var = (f0) this.f802c;
                if (view != null) {
                    view.clearFocus();
                }
                f0Var.requestFocus();
                org.telegram.messenger.i0.J3(f0Var);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((org.telegram.ui.ActionBar.z2) this.f801b, (Integer) this.f802c, dialogInterface);
                return;
        }
    }
}
