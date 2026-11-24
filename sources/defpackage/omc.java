package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a;
public final class omc implements ee, oac, pac {
    public final goc a;

    public omc(goc gocVar) {
        this.a = gocVar;
    }

    @Override
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        return Boolean.valueOf(this.a.c0(c6cVar, view));
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.b0((c6c) obj, (View) obj2);
    }

    @Override
    public final void r(he heVar, int i) {
        goc gocVar = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + a.b.getPackageName()));
            gocVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
