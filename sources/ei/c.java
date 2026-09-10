package ei;

import android.view.View;
import bi.y2;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.v51;
public final class c implements Utilities.Callback5, Utilities.Callback5Return, MessagesStorage.StringCallback {
    public final f f7534a;

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        v51 v51Var = (v51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f7534a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        f.U(this.f7534a, (v51) obj);
    }

    @Override
    public void run(String str) {
        f fVar = this.f7534a;
        fVar.getMessagesController().getChat(Long.valueOf(-fVar.f7542a));
        fVar.showDialog(new gi.b(fVar.getParentActivity(), null, fVar.f7542a, new y2(13, fVar, str)));
    }
}
