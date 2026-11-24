package defpackage;

import android.content.DialogInterface;
public final class qqa implements DialogInterface.OnDismissListener {
    public final byte a;
    public final wsa b;

    public qqa(wsa wsaVar, byte b) {
        this.a = b;
        this.b = wsaVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                wsaVar.f2.setLoading(false);
                return;
            default:
                wsaVar.f2.setLoading(false);
                return;
        }
    }
}
