package defpackage;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;
public final class o8 implements ee {
    public final byte a;
    public final u8 b;

    public o8(u8 u8Var, byte b) {
        this.a = b;
        this.b = u8Var;
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        u8 u8Var = this.b;
        switch (b) {
            case 0:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    u8Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                mh6 mh6Var = new mh6();
                mh6Var.G = (byte) 2;
                u8Var.presentFragment(mh6Var, true);
                return;
        }
    }
}
