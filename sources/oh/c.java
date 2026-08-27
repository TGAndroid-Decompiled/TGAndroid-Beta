package oh;

import gh.d1;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.n41;

public final class c implements Utilities.Callback5, Utilities.Callback5Return, MessagesStorage.StringCallback {

    public final f f19467a;

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f19467a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        f.U(this.f19467a, (n41) obj);
    }

    @Override
    public void run(String str) {
        f fVar = this.f19467a;
        fVar.getMessagesController().getChat(Long.valueOf(-fVar.f19477a));
        fVar.showDialog(new qh.a(fVar.getParentActivity(), null, fVar.f19477a, new d1(22, fVar, str)));
    }
}
