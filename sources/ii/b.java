package ii;

import ai.f1;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.messenger.wr;
import org.telegram.ui.Components.x31;
public final class b implements a20, wr {
    public final f f15486a;

    @Override
    public void a(String str) {
        f fVar = this.f15486a;
        fVar.getMessagesController().M0(Long.valueOf(-fVar.f15523b));
        fVar.showDialog(new ki.a(fVar.getParentActivity(), null, fVar.f15523b, new f1(21, fVar, str)));
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        f.Z(this.f15486a, (x31) obj);
    }
}
