package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a;
public final class pkc implements ed, n8c, o8c {
    public final hmc a;

    public pkc(hmc hmcVar) {
        this.a = hmcVar;
    }

    @Override
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        return Boolean.valueOf(this.a.b0(c4cVar, view));
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.a0((c4c) obj, (View) obj2);
    }

    @Override
    public final void u(hd hdVar, int i) {
        hmc hmcVar = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + a.b.getPackageName()));
            hmcVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
