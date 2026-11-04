package lg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.t2;
public final class o implements DialogInterface.OnShowListener {
    public final int f18381a;
    public final KeyEvent.Callback f18382b;
    public final Object f18383c;

    public o(int i3, KeyEvent.Callback callback, Object obj) {
        this.f18381a = i3;
        this.f18382b = callback;
        this.f18383c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f18381a) {
            case 0:
                View view = (View) this.f18382b;
                s sVar = (s) this.f18383c;
                if (view != null) {
                    view.clearFocus();
                }
                sVar.requestFocus();
                org.telegram.messenger.g0.K3(sVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((t2) this.f18382b, (Integer) this.f18383c, dialogInterface);
                return;
        }
    }
}
