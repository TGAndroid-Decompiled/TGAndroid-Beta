package ji;

import ai.o1;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.or;
import org.telegram.messenger.s10;
import org.telegram.ui.Components.r31;
public final class b implements s10, or {
    public final e f16263a;

    @Override
    public void a(String str) {
        e eVar = this.f16263a;
        eVar.getMessagesController().M0(Long.valueOf(-eVar.f16294b));
        eVar.showDialog(new li.a(eVar.getParentActivity(), null, eVar.f16294b, new o1(25, eVar, str)));
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        e.Z(this.f16263a, (r31) obj);
    }
}
