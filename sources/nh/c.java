package nh;

import android.view.View;
import fh.f1;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l41;
public final class c implements Utilities.Callback5, Utilities.Callback5Return, MessagesStorage.StringCallback {
    public final f f18618a;

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        l41 l41Var = (l41) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f18618a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        f.T(this.f18618a, (l41) obj);
    }

    @Override
    public void run(String str) {
        f fVar = this.f18618a;
        fVar.getMessagesController().getChat(Long.valueOf(-fVar.f18628a));
        fVar.showDialog(new ph.a(fVar.getParentActivity(), null, fVar.f18628a, new f1(22, fVar, str)));
    }
}
