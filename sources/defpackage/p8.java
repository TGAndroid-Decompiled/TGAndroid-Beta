package defpackage;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;
public final class p8 implements fd {
    public final byte a;
    public final v8 b;

    public p8(v8 v8Var, byte b) {
        this.a = b;
        this.b = v8Var;
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        v8 v8Var = this.b;
        switch (b) {
            case 0:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    v8Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                qh6 qh6Var = new qh6();
                qh6Var.G = (byte) 2;
                v8Var.presentFragment(qh6Var, true);
                return;
        }
    }
}
