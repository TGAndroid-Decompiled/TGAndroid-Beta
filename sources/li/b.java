package li;

import ai.u1;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.b41;
public final class b implements x10, tr {
    public final e f19525a;

    @Override
    public void a(String str) {
        e eVar = this.f19525a;
        eVar.getMessagesController().M0(Long.valueOf(-eVar.f19554b));
        eVar.showDialog(new ni.a(eVar.getParentActivity(), null, eVar.f19554b, new u1(29, eVar, str)));
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        e.Z(this.f19525a, (b41) obj);
    }
}
