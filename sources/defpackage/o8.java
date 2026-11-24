package defpackage;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;
public final class o8 implements ed {
    public final byte a;
    public final u8 b;

    public o8(u8 u8Var, byte b) {
        this.a = b;
        this.b = u8Var;
    }

    @Override
    public final void u(hd hdVar, int i) {
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
                    fa4.g(e, true);
                    return;
                }
            default:
                mf6 mf6Var = new mf6();
                mf6Var.G = (byte) 2;
                u8Var.presentFragment(mf6Var, true);
                return;
        }
    }
}
