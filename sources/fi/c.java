package fi;

import android.view.View;
import ci.m2;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.x51;
public final class c implements Utilities.Callback5, Utilities.Callback5Return, MessagesStorage.StringCallback {
    public final f f9089a;

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        x51 x51Var = (x51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f9089a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        f.U(this.f9089a, (x51) obj);
    }

    @Override
    public void run(String str) {
        f fVar = this.f9089a;
        fVar.getMessagesController().getChat(Long.valueOf(-fVar.f9097a));
        fVar.showDialog(new hi.b(fVar.getParentActivity(), null, fVar.f9097a, new m2(13, fVar, str)));
    }
}
