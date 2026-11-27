package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
public final class rs8 implements kf3 {
    public final e a;
    public final Context b;
    public final mr8 c;

    public rs8(mr8 mr8Var, e eVar, Context context) {
        this.c = mr8Var;
        this.a = eVar;
        this.b = context;
    }

    @Override
    public final void k(of3 of3Var) {
        e eVar = this.a;
        if (eVar.getMessagesController().O1().J(of3Var.getDialogId())) {
            eVar.getOrCreateStoryViewer().getClass();
            eVar.getOrCreateStoryViewer().H(eVar.getContext(), of3Var.getDialogId(), new l6b(this.c));
        }
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void r() {
        boolean z;
        e eVar = this.a;
        c6b O1 = eVar.getMessagesController().O1();
        ArrayList arrayList = O1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (O1.D(0, wf3.n(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            long n = wf3.n(((TL_stories.PeerStories) arrayList.get(i)).peer);
            if (!z || O1.D(0, n) != 0) {
                arrayList2.add(Long.valueOf(n));
            }
        }
        eVar.getOrCreateStoryViewer().K(this.b, null, arrayList2, 0, null, null, new l6b(this.c), false);
    }

    @Override
    public final void o(of3 of3Var) {
    }

    @Override
    public final void v(of3 of3Var) {
    }

    @Override
    public final void w(of3 of3Var) {
    }
}
