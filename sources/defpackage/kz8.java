package defpackage;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;
public final class kz8 implements fd {
    public final rz8 a;

    public kz8(rz8 rz8Var) {
        this.a = rz8Var;
    }

    @Override
    public final void w(id idVar, int i) {
        rz8 rz8Var = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + a.b.getPackageName()));
            rz8Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
