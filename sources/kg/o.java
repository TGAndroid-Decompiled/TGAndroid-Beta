package kg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.w2;
public final class o implements DialogInterface.OnShowListener {
    public final int f18400a;
    public final KeyEvent.Callback f18401b;
    public final Object f18402c;

    public o(KeyEvent.Callback callback, Object obj, int i7) {
        this.f18400a = i7;
        this.f18401b = callback;
        this.f18402c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f18400a) {
            case 0:
                View view = (View) this.f18401b;
                s sVar = (s) this.f18402c;
                if (view != null) {
                    view.clearFocus();
                }
                sVar.requestFocus();
                org.telegram.messenger.g0.I3(sVar);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((w2) this.f18401b, (Integer) this.f18402c, dialogInterface);
                return;
        }
    }
}
