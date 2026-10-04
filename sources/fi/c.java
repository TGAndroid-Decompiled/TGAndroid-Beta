package fi;

import ai.g3;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g61;
public final class c implements Utilities.Callback5, Utilities.Callback5Return, MessagesStorage.StringCallback {
    public final f f9875a;

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        g61 g61Var = (g61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f9875a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        f.S(this.f9875a, (g61) obj);
    }

    @Override
    public void run(String str) {
        f fVar = this.f9875a;
        fVar.getMessagesController().getChat(Long.valueOf(-fVar.f9884a));
        fVar.showDialog(new hi.b(fVar.getParentActivity(), null, fVar.f9884a, new g3(14, fVar, str)));
    }
}
