package ii;

import ai.n1;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.u61;
public final class c implements Utilities.Callback5, Utilities.Callback5Return, MessagesStorage.StringCallback {
    public final f f14328a;

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        u61 u61Var = (u61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f14328a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        f.V(this.f14328a, (u61) obj);
    }

    @Override
    public void run(String str) {
        f fVar = this.f14328a;
        fVar.getMessagesController().getChat(Long.valueOf(-fVar.f14338b));
        fVar.showDialog(new ki.a(fVar.getParentActivity(), null, fVar.f14338b, new n1(22, fVar, str)));
    }
}
