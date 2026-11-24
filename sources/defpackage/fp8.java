package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
public final class fp8 implements qe3 {
    public final d a;
    public final Context b;
    public final ao8 c;

    public fp8(ao8 ao8Var, d dVar, Context context) {
        this.c = ao8Var;
        this.a = dVar;
        this.b = context;
    }

    @Override
    public final void k(ue3 ue3Var) {
        d dVar = this.a;
        if (dVar.getMessagesController().M1().J(ue3Var.getDialogId())) {
            dVar.getOrCreateStoryViewer().getClass();
            dVar.getOrCreateStoryViewer().H(dVar.getContext(), ue3Var.getDialogId(), new p2b(this.c));
        }
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void s() {
        boolean z;
        d dVar = this.a;
        g2b M1 = dVar.getMessagesController().M1();
        ArrayList arrayList = M1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (M1.D(0, cf3.n(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            long n = cf3.n(((TL_stories.PeerStories) arrayList.get(i)).peer);
            if (!z || M1.D(0, n) != 0) {
                arrayList2.add(Long.valueOf(n));
            }
        }
        dVar.getOrCreateStoryViewer().K(this.b, null, arrayList2, 0, null, null, new p2b(this.c), false);
    }

    @Override
    public final void o(ue3 ue3Var) {
    }

    @Override
    public final void v(ue3 ue3Var) {
    }

    @Override
    public final void w(ue3 ue3Var) {
    }
}
