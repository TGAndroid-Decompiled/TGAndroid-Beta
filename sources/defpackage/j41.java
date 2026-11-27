package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class j41 implements DialogInterface.OnShowListener {
    public final byte a;
    public final KeyEvent.Callback b;
    public final Object c;

    public j41(byte b, KeyEvent.Callback callback, Object obj) {
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
                k41 k41Var = (k41) obj;
                if (view != null) {
                    view.clearFocus();
                }
                k41Var.requestFocus();
                hl.E3(k41Var);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$91((nx0) callback, (Integer) obj, dialogInterface);
                return;
        }
    }
}
