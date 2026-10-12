package gi;

import android.view.View;
import bi.v2;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l61;
public final class c implements Utilities.Callback5, Utilities.Callback5Return, MessagesStorage.StringCallback {
    public final f f10165a;

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        l61 l61Var = (l61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f10165a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        f.U(this.f10165a, (l61) obj);
    }

    @Override
    public void run(String str) {
        f fVar = this.f10165a;
        fVar.getMessagesController().getChat(Long.valueOf(-fVar.f10173a));
        fVar.showDialog(new ii.b(fVar.getParentActivity(), null, fVar.f10173a, new v2(14, fVar, str)));
    }
}
