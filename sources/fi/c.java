package fi;

import ai.h3;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.q61;
public final class c implements Utilities.Callback5, Utilities.Callback5Return, MessagesStorage.StringCallback {
    public final f f9950a;

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        q61 q61Var = (q61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f9950a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        f.U(this.f9950a, (q61) obj);
    }

    @Override
    public void run(String str) {
        f fVar = this.f9950a;
        fVar.getMessagesController().getChat(Long.valueOf(-fVar.f9959a));
        fVar.showDialog(new hi.b(fVar.getParentActivity(), null, fVar.f9959a, new h3(14, fVar, str)));
    }
}
