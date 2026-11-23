package li;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.sr;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.o41;
public final class b implements w10, sr {
    public final g f19920a;

    @Override
    public void a(String str) {
        g gVar = this.f19920a;
        gVar.getMessagesController().O0(Long.valueOf(-gVar.f19960b));
        gVar.showDialog(new ni.a(gVar.getParentActivity(), null, gVar.f19960b, new d(1, gVar, str)));
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        g.Z(this.f19920a, (o41) obj);
    }
}
