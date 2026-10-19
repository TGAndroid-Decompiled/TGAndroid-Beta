package hi;

import ai.o2;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g61;
public final class c implements Utilities.Callback5, Utilities.Callback5Return, MessagesStorage.StringCallback {
    public final f f12133a;

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        g61 g61Var = (g61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f12133a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        f.U(this.f12133a, (g61) obj);
    }

    @Override
    public void run(String str) {
        f fVar = this.f12133a;
        fVar.getMessagesController().getChat(Long.valueOf(-fVar.f12141a));
        fVar.showDialog(new ji.a(fVar.getParentActivity(), null, fVar.f12141a, new o2(20, fVar, str)));
    }
}
