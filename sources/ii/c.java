package ii;

import ai.n1;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.t61;
public final class c implements Utilities.Callback5, Utilities.Callback5Return, MessagesStorage.StringCallback {
    public final f f14329a;

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        t61 t61Var = (t61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f14329a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        f.V(this.f14329a, (t61) obj);
    }

    @Override
    public void run(String str) {
        f fVar = this.f14329a;
        fVar.getMessagesController().getChat(Long.valueOf(-fVar.f14339b));
        fVar.showDialog(new ki.a(fVar.getParentActivity(), null, fVar.f14339b, new n1(22, fVar, str)));
    }
}
