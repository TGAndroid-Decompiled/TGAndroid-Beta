package fi;

import android.view.View;
import ci.m2;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w51;
public final class c implements Utilities.Callback5, Utilities.Callback5Return, MessagesStorage.StringCallback {
    public final f f9090a;

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        w51 w51Var = (w51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f9090a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        f.U(this.f9090a, (w51) obj);
    }

    @Override
    public void run(String str) {
        f fVar = this.f9090a;
        fVar.getMessagesController().getChat(Long.valueOf(-fVar.f9098a));
        fVar.showDialog(new hi.b(fVar.getParentActivity(), null, fVar.f9098a, new m2(13, fVar, str)));
    }
}
