package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
public final class aca implements yc7, ed {
    public final nfa a;
    public final TL_stories.StoryItem b;

    public aca(nfa nfaVar, TL_stories.StoryItem storyItem) {
        this.a = nfaVar;
        this.b = storyItem;
    }

    @Override
    public final void a(String str) {
        this.a.y0(this.b, str);
    }

    @Override
    public final void u(hd hdVar, int i) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        nfa nfaVar = this.a;
        d dVar = nfaVar.y1;
        dVar.getMessagesController().M1().r(arrayList, nfaVar.m1);
        u21.b0(dVar).Q(2131624052, 36, k96.G(1, "StoriesDeleted", new Object[0])).j();
        nfaVar.E(false);
    }
}
