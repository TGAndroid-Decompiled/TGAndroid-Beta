package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a;
public final class bpc implements fd, ncc, occ {
    public final uqc a;

    public bpc(uqc uqcVar) {
        this.a = uqcVar;
    }

    @Override
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        return Boolean.valueOf(this.a.b0(b8cVar, view));
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.a0((b8c) obj, (View) obj2);
    }

    @Override
    public final void w(id idVar, int i) {
        uqc uqcVar = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + a.b.getPackageName()));
            uqcVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
