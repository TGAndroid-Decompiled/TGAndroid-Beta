package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
public final class gr8 implements dg3 {
    public final d a;
    public final Context b;
    public final bq8 c;

    public gr8(bq8 bq8Var, d dVar, Context context) {
        this.c = bq8Var;
        this.a = dVar;
        this.b = context;
    }

    @Override
    public final void k(hg3 hg3Var) {
        d dVar = this.a;
        if (dVar.getMessagesController().N1().J(hg3Var.getDialogId())) {
            dVar.getOrCreateStoryViewer().getClass();
            dVar.getOrCreateStoryViewer().H(dVar.getContext(), hg3Var.getDialogId(), new q4b(this.c));
        }
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void r() {
        boolean z;
        d dVar = this.a;
        h4b N1 = dVar.getMessagesController().N1();
        ArrayList arrayList = N1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (N1.D(0, pg3.n(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            long n = pg3.n(((TL_stories.PeerStories) arrayList.get(i)).peer);
            if (!z || N1.D(0, n) != 0) {
                arrayList2.add(Long.valueOf(n));
            }
        }
        dVar.getOrCreateStoryViewer().K(this.b, null, arrayList2, 0, null, null, new q4b(this.c), false);
    }

    @Override
    public final void o(hg3 hg3Var) {
    }

    @Override
    public final void u(hg3 hg3Var) {
    }

    @Override
    public final void v(hg3 hg3Var) {
    }
}
