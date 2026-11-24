package defpackage;

import android.content.DialogInterface;
public final class qoa implements DialogInterface.OnDismissListener {
    public final byte a;
    public final vqa b;

    public qoa(vqa vqaVar, byte b) {
        this.a = b;
        this.b = vqaVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        vqa vqaVar = this.b;
        switch (b) {
            case 0:
                vqaVar.f2.setLoading(false);
                return;
            default:
                vqaVar.f2.setLoading(false);
                return;
        }
    }
}
