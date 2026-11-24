package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class z31 implements DialogInterface.OnShowListener {
    public final byte a;
    public final KeyEvent.Callback b;
    public final Object c;

    public z31(KeyEvent.Callback callback, Object obj, byte b) {
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
                c41 c41Var = (c41) obj;
                if (view != null) {
                    view.clearFocus();
                }
                c41Var.requestFocus();
                gl.E3(c41Var);
                return;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$90((fx0) callback, (Integer) obj, dialogInterface);
                return;
        }
    }
}
