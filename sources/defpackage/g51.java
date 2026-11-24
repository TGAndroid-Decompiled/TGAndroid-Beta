package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class g51 implements DialogInterface.OnShowListener {
    public final byte a;
    public final KeyEvent.Callback b;
    public final Object c;

    public g51(KeyEvent.Callback callback, Object obj, byte b) {
        this.a = b;
        this.b = callback;
        this.c = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.c;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                View view = (View) callback;
                j51 j51Var = (j51) obj;
                if (view != null) {
                    view.clearFocus();
                }
                j51Var.requestFocus();
                gm.E3(j51Var);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$90((my0) callback, (Integer) obj, dialogInterface);
                return;
        }
    }
}
