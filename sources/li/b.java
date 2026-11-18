package li;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.rr;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.l41;
public final class b implements v10, rr {
    public final g f19892a;

    @Override
    public void a(String str) {
        g gVar = this.f19892a;
        gVar.getMessagesController().O0(Long.valueOf(-gVar.f19932b));
        gVar.showDialog(new ni.a(gVar.getParentActivity(), null, gVar.f19932b, new d(1, gVar, str)));
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        g.Z(this.f19892a, (l41) obj);
    }
}
