package li;

import android.view.View;
import java.io.Serializable;
import ki.n2;
import org.telegram.messenger.rr;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.n41;
public final class b implements u10, rr {
    public final f f19991a;

    @Override
    public void a(String str) {
        f fVar = this.f19991a;
        fVar.getMessagesController().O0(Long.valueOf(-fVar.f20023b));
        fVar.showDialog(new ni.a(fVar.getParentActivity(), null, fVar.f20023b, new n2(2, fVar, str)));
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        f.Z(this.f19991a, (n41) obj);
    }
}
