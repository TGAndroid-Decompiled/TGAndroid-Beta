package gi;

import android.view.View;
import di.m2;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h51;
public final class c implements Utilities.Callback5, Utilities.Callback5Return, MessagesStorage.StringCallback {
    public final f f10670a;

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h51 h51Var = (h51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f10670a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        f.U(this.f10670a, (h51) obj);
    }

    @Override
    public void run(String str) {
        f fVar = this.f10670a;
        fVar.getMessagesController().getChat(Long.valueOf(-fVar.f10679a));
        fVar.showDialog(new ii.b(fVar.getParentActivity(), null, fVar.f10679a, new m2(13, fVar, str)));
    }
}
