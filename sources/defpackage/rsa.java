package defpackage;

import android.content.DialogInterface;
public final class rsa implements DialogInterface.OnDismissListener {
    public final byte a;
    public final wua b;

    public rsa(wua wuaVar, byte b) {
        this.a = b;
        this.b = wuaVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                wuaVar.f2.setLoading(false);
                return;
            default:
                wuaVar.f2.setLoading(false);
                return;
        }
    }
}
