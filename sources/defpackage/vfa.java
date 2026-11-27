package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
public final class vfa implements if7, fd {
    public final eja a;
    public final TL_stories.StoryItem b;

    public vfa(eja ejaVar, TL_stories.StoryItem storyItem) {
        this.a = ejaVar;
        this.b = storyItem;
    }

    @Override
    public final void a(String str) {
        this.a.y0(this.b, str);
    }

    @Override
    public final void w(id idVar, int i) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        eja ejaVar = this.a;
        e eVar = ejaVar.y1;
        eVar.getMessagesController().O1().r(arrayList, ejaVar.m1);
        d31.b0(eVar).Q(2131624052, 36, ob6.G(1, "StoriesDeleted", new Object[0])).j();
        ejaVar.E(false);
    }
}
