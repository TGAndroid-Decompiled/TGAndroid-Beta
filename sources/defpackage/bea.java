package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
public final class bea implements af7, ee {
    public final nha a;
    public final TL_stories.StoryItem b;

    public bea(nha nhaVar, TL_stories.StoryItem storyItem) {
        this.a = nhaVar;
        this.b = storyItem;
    }

    @Override
    public final void a(String str) {
        this.a.y0(this.b, str);
    }

    @Override
    public final void r(he heVar, int i) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        nha nhaVar = this.a;
        d dVar = nhaVar.y1;
        dVar.getMessagesController().N1().r(arrayList, nhaVar.m1);
        c41.b0(dVar).Q(2131624052, 36, jb6.G(1, "StoriesDeleted", new Object[0])).j();
        nhaVar.E(false);
    }
}
