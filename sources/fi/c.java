package fi;

import android.view.View;
import ci.m2;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i51;
public final class c implements Utilities.Callback5, Utilities.Callback5Return, MessagesStorage.StringCallback {
    public final f f9085a;

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        i51 i51Var = (i51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f9085a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        f.U(this.f9085a, (i51) obj);
    }

    @Override
    public void run(String str) {
        f fVar = this.f9085a;
        fVar.getMessagesController().getChat(Long.valueOf(-fVar.f9093a));
        fVar.showDialog(new hi.b(fVar.getParentActivity(), null, fVar.f9093a, new m2(13, fVar, str)));
    }
}
